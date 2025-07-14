package com.bornfire.brf.services;

import org.springframework.web.servlet.ModelAndView;



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

import com.bornfire.brf.controllers.CBUAE_BRF_ReportsController;


import com.bornfire.brf.entities.CBUAE_BRF2_1_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_1_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_1_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_1_SUMMARY_Repo;


@Component
@Service

public class CBUAE_BRF2_1_ReportService {
private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF2_7_ReportService.class);

	
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CBUAE_BRF2_1_DETAIL_Repo BRF2_1_DETAIL_Repo;
	
	@Autowired
	CBUAE_BRF2_1_SUMMARY_Repo BRF2_1_Summary_Repo;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRF2_1View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<CBUAE_BRF2_1_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF2_1_SUMMARY_ENTITY>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRF2_1_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRF/BRF2_1");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRF2_1currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<CBUAE_BRF2_1_DETAIL_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF2_1_DETAIL_ENTITY>();
		
		try {
			Date d1 = dateformat.parse(todate);
			
			T1Dt1=BRF2_1_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT"+T1Dt1.size());
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());

		mv.setViewName("BRF/BRF2_1");
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

		List<CBUAE_BRF2_1_SUMMARY_ENTITY> dataList =BRF2_1_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.1 report. Returning empty result.");
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
					CBUAE_BRF2_1_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
										//row10
										// Column E 
										Cell cell4 = row.createCell(4);
										if (record.getR0020_amount() != null) {
											cell4.setCellValue(record.getR0020_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row11
										row = sheet.getRow(10);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0030_amount() != null) {
											cell4.setCellValue(record.getR0030_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row12
										row = sheet.getRow(11);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0040_amount() != null) {
											cell4.setCellValue(record.getR0040_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row13
										row = sheet.getRow(12);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0050_amount() != null) {
											cell4.setCellValue(record.getR0050_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row14
										row = sheet.getRow(13);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0060_amount() != null) {
											cell4.setCellValue(record.getR0060_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row15
										row = sheet.getRow(14);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0070_amount() != null) {
											cell4.setCellValue(record.getR0070_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										//row16
										row = sheet.getRow(15);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0080_amount() != null) {
											cell4.setCellValue(record.getR0080_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row19
										row = sheet.getRow(18);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0110_amount() != null) {
											cell4.setCellValue(record.getR0110_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row20
										row = sheet.getRow(19);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0120_amount() != null) {
											cell4.setCellValue(record.getR0120_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row21
										row = sheet.getRow(20);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0130_amount() != null) {
											cell4.setCellValue(record.getR0130_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row22
										row = sheet.getRow(21);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0140_amount() != null) {
											cell4.setCellValue(record.getR0140_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row24
										row = sheet.getRow(23);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0160_amount() != null) {
											cell4.setCellValue(record.getR0160_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row25
										row = sheet.getRow(24);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0170_amount() != null) {
											cell4.setCellValue(record.getR0170_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row29
										row = sheet.getRow(28);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0210_amount() != null) {
											cell4.setCellValue(record.getR0210_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row30
										row = sheet.getRow(31);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0220_amount() != null) {
											cell4.setCellValue(record.getR0220_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row31
										row = sheet.getRow(30);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0230_amount() != null) {
											cell4.setCellValue(record.getR0230_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row32
										row = sheet.getRow(31);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0240_amount() != null) {
											cell4.setCellValue(record.getR0240_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row33
										row = sheet.getRow(32);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0250_amount() != null) {
											cell4.setCellValue(record.getR0250_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row34
										row = sheet.getRow(33);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0260_amount() != null) {
											cell4.setCellValue(record.getR0260_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row35
										row = sheet.getRow(34);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0270_amount() != null) {
											cell4.setCellValue(record.getR0270_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row36
										row = sheet.getRow(35);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0280_amount() != null) {
											cell4.setCellValue(record.getR0280_amount().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										//row37
										row = sheet.getRow(36);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0290_amount() != null) {
											cell4.setCellValue(record.getR0290_amount().doubleValue());
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
