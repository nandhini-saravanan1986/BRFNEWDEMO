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
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.CBUAE_BRF2_2_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_Repo;

@Component
@Service

public class CBUAE_BRF2_4_ReportService {
private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF2_7_ReportService.class);
	


	@Autowired
	private Environment env;
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CBUAE_BRF2_4_DETAIL_Repo BRF2_4_DETAIL_Repo;
	
	@Autowired
	CBUAE_BRF2_4_SUMMARY_Repo BRF2_4_Summary_Repo;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRF2_4View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<CBUAE_BRF2_4_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF2_4_SUMMARY_ENTITY>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRF2_4_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRF/BRF2_4");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRF2_4currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<CBUAE_BRF2_4_DETAIL_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF2_4_DETAIL_ENTITY>();
		
		try {
			Date d1 = dateformat.parse(todate);
			
			T1Dt1=BRF2_4_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT"+T1Dt1.size());
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());

		mv.setViewName("BRF/BRF2_4");
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
	
	
	public byte[] getBRF2_4Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<CBUAE_BRF2_4_SUMMARY_ENTITY> dataList =BRF2_4_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.2 report. Returning empty result.");
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

			int startRow = 11;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					CBUAE_BRF2_4_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
					//row12
					// Column E 
					Cell cell4 = row.createCell(4);
					if (record.getR0030_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0030_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row12
					// Column F 
					Cell cell5 = row.createCell(5);
					if (record.getR0030_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0030_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					//row12
					// Column G 
					Cell cell6 = row.createCell(6);
					if (record.getR0030_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0030_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					//row12
					// Column H
					Cell cell7 = row.createCell(7);
					if (record.getR0030_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0030_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
					//row12
					// Column I 
					Cell cell8 = row.createCell(8);
					if (record.getR0030_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0030_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					//row12
					// Column J 
					Cell cell9 = row.createCell(9);
					if (record.getR0030_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0030_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					//row12
					// Column K 
					Cell cell10 = row.createCell(10);
					if (record.getR0030_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0030_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
					//row12
					// Column L
					Cell cell11 = row.createCell(11);
					if (record.getR0030_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0030_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row12
					// Column M
					Cell cell12 = row.createCell(12);
					if (record.getR0030_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0030_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
					//row12
					// Column N
					Cell cell13 = row.createCell(13);
					if (record.getR0030_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0030_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					//row12
					// Column O
					Cell cell14 = row.createCell(14);
					if (record.getR0030_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0030_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
					//row12
					// Column P
					Cell cell15 = row.createCell(15);
					if (record.getR0030_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0030_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
			
					
					
					//row13
					row = sheet.getRow(12);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0040_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0040_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0040_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0040_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0040_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0040_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0040_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0040_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0040_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0040_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0040_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0040_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0040_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0040_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0040_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0040_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0040_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0040_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0040_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0040_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0040_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0040_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0040_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0040_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row14
					row = sheet.getRow(13);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0050_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0050_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0050_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0050_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0050_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0050_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0050_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0050_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0050_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0050_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0050_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0050_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0050_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0050_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0050_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0050_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0050_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0050_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0050_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0050_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0050_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0050_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0050_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0050_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row16
					row = sheet.getRow(15);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0070_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0070_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0070_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0070_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0070_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0070_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0070_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0070_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0070_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0070_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0070_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0070_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0070_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0070_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0070_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0070_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0070_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0070_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0070_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0070_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0070_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0070_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0070_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0070_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row17
					row = sheet.getRow(16);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0080_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0080_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0080_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0080_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0080_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0080_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0080_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0080_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0080_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0080_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0080_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0080_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0080_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0080_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0080_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0080_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0080_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0080_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0080_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0080_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0080_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0080_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0080_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0080_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					//row18
					row = sheet.getRow(17);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0090_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0090_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0090_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0090_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0090_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0090_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0090_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0090_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0090_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0090_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0090_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0090_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0090_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0090_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0090_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0090_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0090_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0090_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0090_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0090_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0090_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0090_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0090_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0090_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row20
					row = sheet.getRow(19);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0110_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0110_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0110_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0110_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0110_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0110_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0110_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0110_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0110_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0110_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0110_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0110_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0110_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0110_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0110_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0110_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0110_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0110_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0110_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0110_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0110_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0110_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0110_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0110_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row21
					row = sheet.getRow(20);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0120_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0120_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0120_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0120_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0120_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0120_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0120_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0120_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0120_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0120_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0120_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0120_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0120_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0120_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0120_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0120_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0120_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0120_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0120_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0120_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0120_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0120_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0120_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0120_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row22
					row = sheet.getRow(21);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0130_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0130_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0130_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0130_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0130_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0130_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0130_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0130_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0130_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0130_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0130_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0130_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0130_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0130_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0130_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0130_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0130_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0130_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0130_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0130_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0130_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0130_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0130_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0130_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row24
					row = sheet.getRow(23);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0150_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0150_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0150_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0150_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0150_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0150_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0150_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0150_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0150_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0150_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0150_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0150_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0150_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0150_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0150_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0150_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0150_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0150_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0150_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0150_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0150_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0150_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0150_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0150_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row25
					row = sheet.getRow(24);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0160_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0160_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0160_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0160_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0160_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0160_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0160_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0160_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0160_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0160_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0160_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0160_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0160_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0160_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0160_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0160_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0160_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0160_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0160_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0160_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0160_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0160_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0160_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0160_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row26
					row = sheet.getRow(25);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0170_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0170_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0170_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0170_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0170_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0170_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0170_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0170_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0170_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0170_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0170_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0170_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0170_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0170_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0170_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0170_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0170_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0170_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0170_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0170_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0170_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0170_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0170_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0170_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					
					//row27
					row = sheet.getRow(26);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0180_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0180_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0180_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0180_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0180_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0180_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0180_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0180_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0180_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0180_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0180_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0180_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0180_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0180_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0180_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0180_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0180_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0180_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0180_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0180_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0180_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0180_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0180_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0180_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row31
					row = sheet.getRow(30);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0220_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0220_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0220_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0220_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0220_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0220_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0220_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0220_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0220_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0220_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0220_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0220_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0220_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0220_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0220_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0220_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0220_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0220_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0220_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0220_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0220_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0220_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0220_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0220_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					
					//row32
					row = sheet.getRow(31);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0230_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0230_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0230_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0230_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0230_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0230_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0230_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0230_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0230_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0230_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0230_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0230_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0230_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0230_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0230_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0230_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0230_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0230_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0230_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0230_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0230_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0230_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0230_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0230_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row33
					row = sheet.getRow(32);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0240_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0240_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0240_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0240_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0240_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0240_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0240_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0240_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0240_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0240_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0240_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0240_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0240_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0240_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0240_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0240_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0240_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0240_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0240_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0240_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0240_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0240_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0240_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0240_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row35
					row = sheet.getRow(34);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0260_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0260_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0260_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0260_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0260_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0260_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0260_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0260_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0260_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0260_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0260_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0260_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0260_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0260_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0260_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0260_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0260_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0260_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0260_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0260_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0260_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0260_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0260_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0260_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					//row36
					row = sheet.getRow(35);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0270_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0270_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0270_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0270_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0270_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0270_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0270_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0270_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0270_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0270_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0270_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0270_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0270_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0270_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0270_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0270_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0270_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0270_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0270_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0270_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0270_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0270_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0270_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0270_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row37
					row = sheet.getRow(36);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0280_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0280_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0280_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0280_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0280_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0280_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0280_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0280_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0280_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0280_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0280_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0280_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0280_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0280_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0280_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0280_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0280_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0280_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0280_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0280_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0280_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0280_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0280_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0280_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					//row39
					row = sheet.getRow(38);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0300_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0300_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0300_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0300_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0300_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0300_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0300_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0300_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0300_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0300_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0300_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0300_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0300_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0300_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0300_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0300_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0300_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0300_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0300_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0300_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0300_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0300_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0300_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0300_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row40
					row = sheet.getRow(39);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0310_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0310_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0310_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0310_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0310_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0310_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0310_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0310_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0310_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0310_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0310_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0310_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0310_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0310_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0310_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0310_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0310_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0310_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0310_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0310_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0310_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0310_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0310_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0310_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row41
					row = sheet.getRow(40);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0320_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0320_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0320_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0320_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0320_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0320_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0320_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0320_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0320_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0320_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0320_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0320_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0320_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0320_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0320_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0320_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0320_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0320_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0320_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0320_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0320_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0320_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0320_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0320_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row43
					row = sheet.getRow(42);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0340_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0340_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0340_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0340_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0340_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0340_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0340_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0340_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0340_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0340_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0340_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0340_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0340_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0340_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0340_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0340_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0340_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0340_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0340_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0340_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0340_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0340_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0340_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0340_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					
					//row44
					row = sheet.getRow(43);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0350_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0350_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0350_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0350_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0350_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0350_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0350_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0350_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0350_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0350_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0350_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0350_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0350_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0350_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0350_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0350_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0350_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0350_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0350_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0350_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0350_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0350_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0350_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0350_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row45
					row = sheet.getRow(44);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0360_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0360_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0360_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0360_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0360_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0360_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0360_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0360_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0360_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0360_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0360_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0360_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0360_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0360_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0360_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0360_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0360_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0360_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0360_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0360_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0360_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0360_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0360_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0360_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					
					//row46
					row = sheet.getRow(45);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0370_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0370_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0370_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0370_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0370_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0370_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0370_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0370_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0370_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0370_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0370_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0370_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0370_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0370_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0370_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0370_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0370_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0370_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0370_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0370_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0370_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0370_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0370_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0370_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
					}
					
					
					
					//row49
					row = sheet.getRow(48);
					
					// Column E
					 cell4 = row.createCell(4);
					if (record.getR0400_analy_by_cur_us_dollar() != null) {
						cell4.setCellValue(record.getR0400_analy_by_cur_us_dollar().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column F 
					 cell5 = row.createCell(5);
					if (record.getR0400_analy_by_cur_euro() != null) {
						cell5.setCellValue(record.getR0400_analy_by_cur_euro().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column G 
					 cell6 = row.createCell(6);
					if (record.getR0400_analy_by_cur_swiss_franc() != null) {
						cell6.setCellValue(record.getR0400_analy_by_cur_swiss_franc().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column H
					 cell7 = row.createCell(7);
					if (record.getR0400_analy_by_cur_uk_sterling() != null) {
						cell7.setCellValue(record.getR0400_analy_by_cur_uk_sterling().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column I 
					 cell8 = row.createCell(8);
					if (record.getR0400_analy_by_cur_chinese_yuan() != null) {
						cell8.setCellValue(record.getR0400_analy_by_cur_chinese_yuan().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column J 
					 cell9 = row.createCell(9);
					if (record.getR0400_analy_by_cur_japanese_yen() != null) {
						cell9.setCellValue(record.getR0400_analy_by_cur_japanese_yen().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
				
					// Column K 
					 cell10 = row.createCell(10);
					if (record.getR0400_analy_by_cur_bahraini_dinar() != null) {
						cell10.setCellValue(record.getR0400_analy_by_cur_bahraini_dinar().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column L
					 cell11 = row.createCell(11);
					if (record.getR0400_analy_by_cur_kuwaiti_dinar() != null) {
						cell11.setCellValue(record.getR0400_analy_by_cur_kuwaiti_dinar().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					// Column M
					 cell12 = row.createCell(12);
					if (record.getR0400_analy_by_cur_qatari_ryal() != null) {
						cell12.setCellValue(record.getR0400_analy_by_cur_qatari_ryal().doubleValue());
						cell12.setCellStyle(numberStyle);
					} else {
						cell12.setCellValue("");
						cell12.setCellStyle(textStyle);
					}
					
				
					// Column N
					 cell13 = row.createCell(13);
					if (record.getR0400_analy_by_cur_saudi_riyal() != null) {
						cell13.setCellValue(record.getR0400_analy_by_cur_saudi_riyal().doubleValue());
						cell13.setCellStyle(numberStyle);
					} else {
						cell13.setCellValue("");
						cell13.setCellStyle(textStyle);
					}
					
					
					
					// Column O
					 cell14 = row.createCell(14);
					if (record.getR0400_analy_by_cur_other_fgn_currencies() != null) {
						cell14.setCellValue(record.getR0400_analy_by_cur_other_fgn_currencies().doubleValue());
						cell14.setCellStyle(numberStyle);
					} else {
						cell14.setCellValue("");
						cell14.setCellStyle(textStyle);
					}
					
				
					// Column P
					 cell15 = row.createCell(15);
					if (record.getR0400_analy_by_cur_oth_indivi_fgn_curr() != null) {
						cell15.setCellValue(record.getR0400_analy_by_cur_oth_indivi_fgn_curr().doubleValue());
						cell15.setCellStyle(numberStyle);
					} else {
						cell15.setCellValue("");
						cell15.setCellStyle(textStyle);
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
