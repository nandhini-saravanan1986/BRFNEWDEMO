package com.bornfire.brf.services;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.CBUAE_BRF1_3_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF1_3_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF1_3_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF1_3_SUMMARY_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_1_SUMMARY_ENTITY;



@Component
@Service
public class CBUAE_BRF1_3_ReportService {
private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF2_7_ReportService.class);

	
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CBUAE_BRF1_3_DETAIL_Repo BRF1_3_DETAIL_Repo;
	
	@Autowired
	CBUAE_BRF1_3_SUMMARY_Repo BRF1_3_Summary_Repo;
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRF1_3View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<CBUAE_BRF1_3_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF1_3_SUMMARY_ENTITY>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRF1_3_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRF/BRF1_3");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRF1_3currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<CBUAE_BRF1_3_DETAIL_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF1_3_DETAIL_ENTITY>();
		
		try {
			Date d1 = dateformat.parse(todate);
			
			T1Dt1=BRF1_3_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT"+T1Dt1.size());
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());

		mv.setViewName("BRF/BRF1_3");
		mv.addObject("displaymode", "Details");
		//mv.addObject("reportdetails", T1Dt1Page.getContent());
		mv.addObject("reportdetails",T1Dt1 );
		mv.addObject("reportmaster12", T1Dt1);
		//mv.addObject("reportmaster1", qr);
		//mv.addObject("singledetail", new T1CurProdDetail());
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;
	}
	
	
	public byte[] getBRF2_1Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<CBUAE_BRF1_3_SUMMARY_ENTITY> dataList =BRF1_3_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF1.3 report. Returning empty result.");
			return new byte[0];
		}

		String templateDir = env.getProperty("output.exportpathtemp");
		String templateFileName = filename;
		System.out.println(filename);
		Path templatePath = Paths.get(templateDir, templateFileName);
		System.out.println(templatePath);
		
		logger.info("Service: Attempting to load template from path: {}", templatePath.toAbsolutePath());

		if (!Files.exists(templatePath)) {
			// This specific exception will be caught by the controller.
			throw new FileNotFoundException("Template file not found at: " + templatePath.toAbsolutePath());
		}
		if (!Files.isReadable(templatePath)) {
			// A specific exception for permission errors.
			throw new SecurityException(
					"Template file exists but is not readable (check permissions): " + templatePath.toAbsolutePath());
		}

		// This try-with-resources block is perfect. It guarantees all resources are
		// closed automatically.
		try (InputStream templateInputStream = Files.newInputStream(templatePath);
				Workbook workbook = WorkbookFactory.create(templateInputStream);
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			Sheet sheet = workbook.getSheetAt(0);

			// --- Style Definitions ---
			CreationHelper createHelper = workbook.getCreationHelper();

			CellStyle dateStyle = workbook.createCellStyle();
			dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
			dateStyle.setBorderBottom(BorderStyle.THIN);
			dateStyle.setBorderTop(BorderStyle.THIN);
			dateStyle.setBorderLeft(BorderStyle.THIN);
			dateStyle.setBorderRight(BorderStyle.THIN);

			CellStyle textStyle = workbook.createCellStyle();
			textStyle.setBorderBottom(BorderStyle.THIN);
			textStyle.setBorderTop(BorderStyle.THIN);
			textStyle.setBorderLeft(BorderStyle.THIN);
			textStyle.setBorderRight(BorderStyle.THIN);
			
			// Create the font
			Font font = workbook.createFont();
			font.setFontHeightInPoints((short)8); // size 8
			font.setFontName("Arial");    

			CellStyle numberStyle = workbook.createCellStyle();
			//numberStyle.setDataFormat(createHelper.createDataFormat().getFormat("0.000"));
			numberStyle.setBorderBottom(BorderStyle.THIN);
			numberStyle.setBorderTop(BorderStyle.THIN);
			numberStyle.setBorderLeft(BorderStyle.THIN);
			numberStyle.setBorderRight(BorderStyle.THIN);
			numberStyle.setFont(font);
			// --- End of Style Definitions ---

			int startRow = 9;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					CBUAE_BRF1_3_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
										//row10
										// Column E 
										Cell cell4 = row.createCell(4);
										if (record.getR0020_year_to_date() != null) {
											cell4.setCellValue(record.getR0020_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row11
										row = sheet.getRow(10);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0030_year_to_date() != null) {
											cell4.setCellValue(record.getR0030_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row12
										row = sheet.getRow(11);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0040_year_to_date() != null) {
											cell4.setCellValue(record.getR0040_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row14
										row = sheet.getRow(13);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0060_year_to_date() != null) {
											cell4.setCellValue(record.getR0060_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row15
										row = sheet.getRow(14);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0070_year_to_date() != null) {
											cell4.setCellValue(record.getR0070_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row16
										row = sheet.getRow(15);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0080_year_to_date() != null) {
											cell4.setCellValue(record.getR0080_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row17
										row = sheet.getRow(16);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0090_year_to_date() != null) {
											cell4.setCellValue(record.getR0090_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row18
										row = sheet.getRow(17);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0100_year_to_date() != null) {
											cell4.setCellValue(record.getR0100_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row19
										row = sheet.getRow(18);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0110_year_to_date() != null) {
											cell4.setCellValue(record.getR0110_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row20
										row = sheet.getRow(19);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0120_year_to_date() != null) {
											cell4.setCellValue(record.getR0120_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row21
										row = sheet.getRow(20);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0130_year_to_date() != null) {
											cell4.setCellValue(record.getR0130_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row22
										row = sheet.getRow(21);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0140_year_to_date() != null) {
											cell4.setCellValue(record.getR0140_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row24
										row = sheet.getRow(23);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0160_year_to_date() != null) {
											cell4.setCellValue(record.getR0160_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row25
										row = sheet.getRow(24);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0170_year_to_date() != null) {
											cell4.setCellValue(record.getR0170_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row26
										row = sheet.getRow(25);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0180_year_to_date() != null) {
											cell4.setCellValue(record.getR0180_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row27
										row = sheet.getRow(26);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0190_year_to_date() != null) {
											cell4.setCellValue(record.getR0190_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row28
										row = sheet.getRow(27);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0200_year_to_date() != null) {
											cell4.setCellValue(record.getR0200_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row29
										row = sheet.getRow(28);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0210_year_to_date() != null) {
											cell4.setCellValue(record.getR0210_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row31
										row = sheet.getRow(30);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0230_year_to_date() != null) {
											cell4.setCellValue(record.getR0230_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row32
										row = sheet.getRow(31);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0240_year_to_date() != null) {
											cell4.setCellValue(record.getR0240_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row33
										row = sheet.getRow(32);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0250_year_to_date() != null) {
											cell4.setCellValue(record.getR0250_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row35
										row = sheet.getRow(34);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0270_year_to_date() != null) {
											cell4.setCellValue(record.getR0270_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row36
										row = sheet.getRow(35);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0280_year_to_date() != null) {
											cell4.setCellValue(record.getR0280_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row37
										row = sheet.getRow(36);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0290_year_to_date() != null) {
											cell4.setCellValue(record.getR0290_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row38
										row = sheet.getRow(37);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0300_year_to_date() != null) {
											cell4.setCellValue(record.getR0300_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row39
										row = sheet.getRow(38);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0310_year_to_date() != null) {
											cell4.setCellValue(record.getR0310_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row43
										row = sheet.getRow(42);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0350_year_to_date() != null) {
											cell4.setCellValue(record.getR0350_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row44
										row = sheet.getRow(43);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0360_year_to_date() != null) {
											cell4.setCellValue(record.getR0360_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row45
										row = sheet.getRow(44);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0370_year_to_date() != null) {
											cell4.setCellValue(record.getR0370_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row46
										row = sheet.getRow(45);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0380_year_to_date() != null) {
											cell4.setCellValue(record.getR0380_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row48
										row = sheet.getRow(47);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0400_year_to_date() != null) {
											cell4.setCellValue(record.getR0400_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row49
										row = sheet.getRow(48);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0410_year_to_date() != null) {
											cell4.setCellValue(record.getR0410_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row50
										row = sheet.getRow(49);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0420_year_to_date() != null) {
											cell4.setCellValue(record.getR0420_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row51
										row = sheet.getRow(50);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0430_year_to_date() != null) {
											cell4.setCellValue(record.getR0430_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row52
										row = sheet.getRow(51);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0440_year_to_date() != null) {
											cell4.setCellValue(record.getR0440_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row54
										row = sheet.getRow(53);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0460_year_to_date() != null) {
											cell4.setCellValue(record.getR0460_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row56
										row = sheet.getRow(55);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0480_year_to_date() != null) {
											cell4.setCellValue(record.getR0480_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row57
										row = sheet.getRow(56);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0490_year_to_date() != null) {
											cell4.setCellValue(record.getR0490_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row58
										row = sheet.getRow(57);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0500_year_to_date() != null) {
											cell4.setCellValue(record.getR0500_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row59
										row = sheet.getRow(58);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0510_year_to_date() != null) {
											cell4.setCellValue(record.getR0510_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row60
										row = sheet.getRow(59);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0520_year_to_date() != null) {
											cell4.setCellValue(record.getR0520_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row61
										row = sheet.getRow(60);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0530_year_to_date() != null) {
											cell4.setCellValue(record.getR0530_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row62
										row = sheet.getRow(61);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0540_year_to_date() != null) {
											cell4.setCellValue(record.getR0540_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row63
										row = sheet.getRow(62);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0550_year_to_date() != null) {
											cell4.setCellValue(record.getR0550_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row64
										row = sheet.getRow(63);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0560_year_to_date() != null) {
											cell4.setCellValue(record.getR0560_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row66
										row = sheet.getRow(65);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0580_year_to_date() != null) {
											cell4.setCellValue(record.getR0580_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row67
										row = sheet.getRow(66);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0590_year_to_date() != null) {
											cell4.setCellValue(record.getR0590_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row68
										row = sheet.getRow(67);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0600_year_to_date() != null) {
											cell4.setCellValue(record.getR0600_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row69
										row = sheet.getRow(68);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0610_year_to_date() != null) {
											cell4.setCellValue(record.getR0610_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row70
										row = sheet.getRow(69);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0620_year_to_date() != null) {
											cell4.setCellValue(record.getR0620_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row71
										row = sheet.getRow(70);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0630_year_to_date() != null) {
											cell4.setCellValue(record.getR0630_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row72
										row = sheet.getRow(71);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0640_year_to_date() != null) {
											cell4.setCellValue(record.getR0640_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row73
										row = sheet.getRow(72);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0650_year_to_date() != null) {
											cell4.setCellValue(record.getR0650_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row75
										row = sheet.getRow(74);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0670_year_to_date() != null) {
											cell4.setCellValue(record.getR0670_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row76
										row = sheet.getRow(75);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0680_year_to_date() != null) {
											cell4.setCellValue(record.getR0680_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row77
										row = sheet.getRow(76);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0690_year_to_date() != null) {
											cell4.setCellValue(record.getR0690_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row78
										row = sheet.getRow(77);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0700_year_to_date() != null) {
											cell4.setCellValue(record.getR0700_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row79
										row = sheet.getRow(78);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0710_year_to_date() != null) {
											cell4.setCellValue(record.getR0710_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row80
										row = sheet.getRow(79);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0720_year_to_date() != null) {
											cell4.setCellValue(record.getR0720_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row81
										row = sheet.getRow(80);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0730_year_to_date() != null) {
											cell4.setCellValue(record.getR0730_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row84
										row = sheet.getRow(83);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0760_year_to_date() != null) {
											cell4.setCellValue(record.getR0760_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row85
										row = sheet.getRow(84);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0770_year_to_date() != null) {
											cell4.setCellValue(record.getR0770_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row86
										row = sheet.getRow(85);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0780_year_to_date() != null) {
											cell4.setCellValue(record.getR0780_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row87
										row = sheet.getRow(86);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0790_year_to_date() != null) {
											cell4.setCellValue(record.getR0790_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row88
										row = sheet.getRow(87);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0800_year_to_date() != null) {
											cell4.setCellValue(record.getR0800_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row89
										row = sheet.getRow(88);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0810_year_to_date() != null) {
											cell4.setCellValue(record.getR0810_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row90
										row = sheet.getRow(89);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0820_year_to_date() != null) {
											cell4.setCellValue(record.getR0820_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row91
										row = sheet.getRow(90);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0830_year_to_date() != null) {
											cell4.setCellValue(record.getR0830_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row94
										row = sheet.getRow(93);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0860_year_to_date() != null) {
											cell4.setCellValue(record.getR0860_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row95
										row = sheet.getRow(94);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0870_year_to_date() != null) {
											cell4.setCellValue(record.getR0870_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										
										//row96
										row = sheet.getRow(95);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0880_year_to_date() != null) {
											cell4.setCellValue(record.getR0880_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row97
										row = sheet.getRow(96);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0890_year_to_date() != null) {
											cell4.setCellValue(record.getR0890_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row98
										row = sheet.getRow(97);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0900_year_to_date() != null) {
											cell4.setCellValue(record.getR0900_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row99
										row = sheet.getRow(98);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0910_year_to_date() != null) {
											cell4.setCellValue(record.getR0910_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row100
										row = sheet.getRow(99);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0920_year_to_date() != null) {
											cell4.setCellValue(record.getR0920_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row101
										row = sheet.getRow(100);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0930_year_to_date() != null) {
											cell4.setCellValue(record.getR0930_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row102
										row = sheet.getRow(101);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0940_year_to_date() != null) {
											cell4.setCellValue(record.getR0940_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row104
										row = sheet.getRow(103);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0960_year_to_date() != null) {
											cell4.setCellValue(record.getR0960_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row105
										row = sheet.getRow(104);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0970_year_to_date() != null) {
											cell4.setCellValue(record.getR0970_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row106
										row = sheet.getRow(105);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0980_year_to_date() != null) {
											cell4.setCellValue(record.getR0980_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row109
										row = sheet.getRow(108);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1010_year_to_date() != null) {
											cell4.setCellValue(record.getR1010_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row110
										row = sheet.getRow(109);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1020_year_to_date() != null) {
											cell4.setCellValue(record.getR1020_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row111
										row = sheet.getRow(110);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1030_year_to_date() != null) {
											cell4.setCellValue(record.getR1030_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row112
										row = sheet.getRow(111);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1040_year_to_date() != null) {
											cell4.setCellValue(record.getR1040_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row113
										row = sheet.getRow(112);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1050_year_to_date() != null) {
											cell4.setCellValue(record.getR1050_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row114
										row = sheet.getRow(113);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1060_year_to_date() != null) {
											cell4.setCellValue(record.getR1060_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row115
										row = sheet.getRow(114);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1070_year_to_date() != null) {
											cell4.setCellValue(record.getR1070_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row116
										row = sheet.getRow(115);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1080_year_to_date() != null) {
											cell4.setCellValue(record.getR1080_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row117
										row = sheet.getRow(116);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1090_year_to_date() != null) {
											cell4.setCellValue(record.getR1090_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row118
										row = sheet.getRow(117);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1100_year_to_date() != null) {
											cell4.setCellValue(record.getR1100_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row119
										row = sheet.getRow(118);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1110_year_to_date() != null) {
											cell4.setCellValue(record.getR1110_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row120
										row = sheet.getRow(119);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1120_year_to_date() != null) {
											cell4.setCellValue(record.getR1120_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row121
										row = sheet.getRow(120);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1130_year_to_date() != null) {
											cell4.setCellValue(record.getR1130_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row122
										row = sheet.getRow(121);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1140_year_to_date() != null) {
											cell4.setCellValue(record.getR1140_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row124
										row = sheet.getRow(123);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR1160_year_to_date() != null) {
											cell4.setCellValue(record.getR1160_year_to_date().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
									
				}
				workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
			} else {
				
			}

			// Write the final workbook content to the in-memory stream.
			workbook.write(out);

			logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

			return out.toByteArray();
		}
	}


}
