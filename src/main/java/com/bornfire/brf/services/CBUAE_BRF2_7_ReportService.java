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
import com.bornfire.brf.entities.CBUAE_BRF2_7_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_7_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_7_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_7_SUMMARY_Repo;

@Component
@Service


public class CBUAE_BRF2_7_ReportService {
private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF2_7_ReportService.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CBUAE_BRF2_7_DETAIL_Repo BRF2_7_Detail_Repo;
	
	@Autowired
	CBUAE_BRF2_7_SUMMARY_Repo BRF2_7_Summary_Repo;
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRF2_7View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {
		System.out.println("getBRF1_1View");
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<CBUAE_BRF2_7_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF2_7_SUMMARY_ENTITY>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRF2_7_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRF/BRF2_7");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRF2_7currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<CBUAE_BRF2_7_DETAIL_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF2_7_DETAIL_ENTITY>();
		
		try {
			Date d1 = dateformat.parse(todate);
			
			T1Dt1=BRF2_7_Detail_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT"+T1Dt1.size());
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());
		mv.setViewName("BRF/BRF2_7");
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
	
	public byte[] getBRF2_7Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<CBUAE_BRF2_7_SUMMARY_ENTITY> dataList =BRF2_7_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.7 report. Returning empty result.");
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
					CBUAE_BRF2_7_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
										//row12
										// Column E 
										Cell cell4 = row.createCell(4);
										if (record.getR0030_overdue() != null) {
											cell4.setCellValue(record.getR0030_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										//row12
										// Column F 
										Cell cell5 = row.createCell(5);
										if (record.getR0030_overdraft() != null) {
											cell5.setCellValue(record.getR0030_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										//row12
										// Column G 
										Cell cell6 = row.createCell(6);
										if (record.getR0030_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0030_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										//row12
										// Column H
										Cell cell7 = row.createCell(7);
										if (record.getR0030_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0030_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										//row12
										// Column I 
										Cell cell8 = row.createCell(8);
										if (record.getR0030_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0030_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										//row12
										// Column J 
										Cell cell9 = row.createCell(9);
										if (record.getR0030_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0030_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										//row12
										// Column K 
										Cell cell10 = row.createCell(10);
										if (record.getR0030_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0030_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										//row12
										// Column L
										Cell cell11 = row.createCell(11);
										if (record.getR0030_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0030_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										//row12
										// Column M
										Cell cell12 = row.createCell(12);
										if (record.getR0030_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0030_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										//row12
										// Column N
										Cell cell13 = row.createCell(13);
										if (record.getR0030_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0030_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										//row12
										// Column O
										Cell cell14 = row.createCell(14);
										if (record.getR0030_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0030_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										//row12
										// Column P
										Cell cell15 = row.createCell(15);
										if (record.getR0030_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0030_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
								
										
										
										//row13
										row = sheet.getRow(12);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0040_overdue() != null) {
											cell4.setCellValue(record.getR0040_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										// Column F 
										 cell5 = row.createCell(5);
										if (record.getR0040_overdraft() != null) {
											cell5.setCellValue(record.getR0040_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										// Column G 
										 cell6 = row.createCell(6);
										if (record.getR0040_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0040_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										// Column H
										 cell7 = row.createCell(7);
										if (record.getR0040_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0040_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
									
										// Column I 
										 cell8 = row.createCell(8);
										if (record.getR0040_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0040_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										// Column J 
										 cell9 = row.createCell(9);
										if (record.getR0040_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0040_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
									
										// Column K 
										 cell10 = row.createCell(10);
										if (record.getR0040_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0040_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
									
										// Column L
										 cell11 = row.createCell(11);
										if (record.getR0040_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0040_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										// Column M
										 cell12 = row.createCell(12);
										if (record.getR0040_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0040_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
									
										// Column N
										 cell13 = row.createCell(13);
										if (record.getR0040_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0040_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										// Column O
										 cell14 = row.createCell(14);
										if (record.getR0040_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0040_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
									
										// Column P
										 cell15 = row.createCell(15);
										if (record.getR0040_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0040_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										
										//row14
										row = sheet.getRow(13);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0050_overdue() != null) {
											cell4.setCellValue(record.getR0050_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										// Column F 
										 cell5 = row.createCell(5);
										if (record.getR0050_overdraft() != null) {
											cell5.setCellValue(record.getR0050_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										// Column G 
										 cell6 = row.createCell(6);
										if (record.getR0050_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0050_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										// Column H
										 cell7 = row.createCell(7);
										if (record.getR0050_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0050_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
									
										// Column I 
										 cell8 = row.createCell(8);
										if (record.getR0050_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0050_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										// Column J 
										 cell9 = row.createCell(9);
										if (record.getR0050_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0050_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
									
										// Column K 
										 cell10 = row.createCell(10);
										if (record.getR0050_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0050_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
									
										// Column L
										 cell11 = row.createCell(11);
										if (record.getR0050_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0050_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										// Column M
										 cell12 = row.createCell(12);
										if (record.getR0050_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0050_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
									
										// Column N
										 cell13 = row.createCell(13);
										if (record.getR0050_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0050_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										// Column O
										 cell14 = row.createCell(14);
										if (record.getR0050_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0050_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
									
										// Column P
										 cell15 = row.createCell(15);
										if (record.getR0050_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0050_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										//row16
										row = sheet.getRow(15);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0070_overdue() != null) {
											cell4.setCellValue(record.getR0070_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										// Column F 
										 cell5 = row.createCell(5);
										if (record.getR0070_overdraft() != null) {
											cell5.setCellValue(record.getR0070_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										// Column G 
										 cell6 = row.createCell(6);
										if (record.getR0070_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0070_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										// Column H
										 cell7 = row.createCell(7);
										if (record.getR0070_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0070_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
									
										// Column I 
										 cell8 = row.createCell(8);
										if (record.getR0070_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0070_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										// Column J 
										 cell9 = row.createCell(9);
										if (record.getR0070_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0070_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
									
										// Column K 
										 cell10 = row.createCell(10);
										if (record.getR0070_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0070_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
									
										// Column L
										 cell11 = row.createCell(11);
										if (record.getR0070_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0070_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										// Column M
										 cell12 = row.createCell(12);
										if (record.getR0070_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0070_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
									
										// Column N
										 cell13 = row.createCell(13);
										if (record.getR0070_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0070_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										// Column O
										 cell14 = row.createCell(14);
										if (record.getR0070_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0070_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
									
										// Column P
										 cell15 = row.createCell(15);
										if (record.getR0070_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0070_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										//row17
										row = sheet.getRow(16);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0080_overdue() != null) {
											cell4.setCellValue(record.getR0080_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										// Column F 
										 cell5 = row.createCell(5);
										if (record.getR0080_overdraft() != null) {
											cell5.setCellValue(record.getR0080_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										// Column G 
										 cell6 = row.createCell(6);
										if (record.getR0080_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0080_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										// Column H
										 cell7 = row.createCell(7);
										if (record.getR0080_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0080_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
									
										// Column I 
										 cell8 = row.createCell(8);
										if (record.getR0080_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0080_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										// Column J 
										 cell9 = row.createCell(9);
										if (record.getR0080_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0080_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
									
										// Column K 
										 cell10 = row.createCell(10);
										if (record.getR0080_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0080_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
									
										// Column L
										 cell11 = row.createCell(11);
										if (record.getR0080_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0080_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										// Column M
										 cell12 = row.createCell(12);
										if (record.getR0080_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0080_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
									
										// Column N
										 cell13 = row.createCell(13);
										if (record.getR0080_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0080_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										// Column O
										 cell14 = row.createCell(14);
										if (record.getR0080_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0080_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
									
										// Column P
										 cell15 = row.createCell(15);
										if (record.getR0080_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0080_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										
										//row19
										row = sheet.getRow(18);
										
										// Column E
										 cell4 = row.createCell(4);
										if (record.getR0100_overdue() != null) {
											cell4.setCellValue(record.getR0100_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										
										// Column F 
										 cell5 = row.createCell(5);
										if (record.getR0100_overdraft() != null) {
											cell5.setCellValue(record.getR0100_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										// Column G 
										 cell6 = row.createCell(6);
										if (record.getR0100_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0100_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										// Column H
										 cell7 = row.createCell(7);
										if (record.getR0100_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0100_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
									
										// Column I 
										 cell8 = row.createCell(8);
										if (record.getR0100_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0100_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										// Column J 
										 cell9 = row.createCell(9);
										if (record.getR0100_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0100_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
									
										// Column K 
										 cell10 = row.createCell(10);
										if (record.getR0100_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0100_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
									
										// Column L
										 cell11 = row.createCell(11);
										if (record.getR0100_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0100_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										// Column M
										 cell12 = row.createCell(12);
										if (record.getR0100_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0100_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
									
										// Column N
										 cell13 = row.createCell(13);
										if (record.getR0100_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0100_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										// Column O
										 cell14 = row.createCell(14);
										if (record.getR0100_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0100_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
									
										// Column P
										 cell15 = row.createCell(15);
										if (record.getR0100_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0100_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										
										// Row 20
										row = sheet.getRow(19);
										
										cell4 = row.createCell(4);
										if (record.getR0110_overdue() != null) {
											cell4.setCellValue(record.getR0110_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0110_overdraft() != null) {
											cell5.setCellValue(record.getR0110_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										
										cell6 = row.createCell(6);
										if (record.getR0110_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0110_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										
										cell7 = row.createCell(7);
										if (record.getR0110_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0110_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										
										cell8 = row.createCell(8);
										if (record.getR0110_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0110_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										
										cell9 = row.createCell(9);
										if (record.getR0110_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0110_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										
										cell10 = row.createCell(10);
										if (record.getR0110_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0110_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										
										cell11 = row.createCell(11);
										if (record.getR0110_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0110_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										
										cell12 = row.createCell(12);
										if (record.getR0110_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0110_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										
										cell13 = row.createCell(13);
										if (record.getR0110_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0110_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										
										cell14 = row.createCell(14);
										if (record.getR0110_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0110_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										
										cell15 = row.createCell(15);
										if (record.getR0110_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0110_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 21
										row = sheet.getRow(20);
										
										cell4 = row.createCell(4);
										if (record.getR0120_overdue() != null) {
											cell4.setCellValue(record.getR0120_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0120_overdraft() != null) {
											cell5.setCellValue(record.getR0120_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0120_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0120_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0120_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0120_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0120_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0120_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0120_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0120_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0120_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0120_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0120_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0120_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0120_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0120_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0120_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0120_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0120_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0120_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0120_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0120_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 22
										row = sheet.getRow(21);
										
										cell4 = row.createCell(4);
										if (record.getR0130_overdue() != null) {
											cell4.setCellValue(record.getR0130_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0130_overdraft() != null) {
											cell5.setCellValue(record.getR0130_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0130_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0130_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0130_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0130_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0130_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0130_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0130_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0130_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0130_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0130_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0130_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0130_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0130_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0130_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0130_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0130_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0130_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0130_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0130_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0130_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 23
										row = sheet.getRow(22);
										
										cell4 = row.createCell(4);
										if (record.getR0140_overdue() != null) {
											cell4.setCellValue(record.getR0140_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0140_overdraft() != null) {
											cell5.setCellValue(record.getR0140_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0140_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0140_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0140_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0140_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0140_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0140_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0140_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0140_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0140_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0140_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0140_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0140_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0140_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0140_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0140_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0140_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0140_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0140_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0140_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0140_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 24
										row = sheet.getRow(23);
										
										cell4 = row.createCell(4);
										if (record.getR0150_overdue() != null) {
											cell4.setCellValue(record.getR0150_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0150_overdraft() != null) {
											cell5.setCellValue(record.getR0150_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0150_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0150_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0150_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0150_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0150_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0150_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0150_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0150_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0150_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0150_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0150_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0150_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0150_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0150_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0150_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0150_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0150_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0150_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0150_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0150_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 25
										row = sheet.getRow(24);
										
										cell4 = row.createCell(4);
										if (record.getR0160_overdue() != null) {
											cell4.setCellValue(record.getR0160_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0160_overdraft() != null) {
											cell5.setCellValue(record.getR0160_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0160_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0160_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0160_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0160_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0160_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0160_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0160_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0160_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0160_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0160_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0160_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0160_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0160_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0160_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0160_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0160_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0160_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0160_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0160_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0160_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 26
										row = sheet.getRow(25);
										
										cell4 = row.createCell(4);
										if (record.getR0170_overdue() != null) {
											cell4.setCellValue(record.getR0170_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0170_overdraft() != null) {
											cell5.setCellValue(record.getR0170_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0170_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0170_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0170_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0170_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0170_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0170_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0170_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0170_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0170_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0170_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0170_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0170_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0170_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0170_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0170_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0170_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0170_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0170_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0170_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0170_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 27
										row = sheet.getRow(26);
										
										cell4 = row.createCell(4);
										if (record.getR0180_overdue() != null) {
											cell4.setCellValue(record.getR0180_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0180_overdraft() != null) {
											cell5.setCellValue(record.getR0180_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0180_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0180_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0180_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0180_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0180_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0180_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0180_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0180_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0180_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0180_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0180_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0180_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0180_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0180_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0180_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0180_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0180_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0180_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0180_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0180_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}	
										
										
										
										
										// Row 28
										row = sheet.getRow(27);
										
										cell4 = row.createCell(4);
										if (record.getR0190_overdue() != null) {
											cell4.setCellValue(record.getR0190_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0190_overdraft() != null) {
											cell5.setCellValue(record.getR0190_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0190_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0190_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0190_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0190_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0190_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0190_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0190_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0190_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0190_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0190_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0190_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0190_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0190_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0190_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0190_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0190_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0190_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0190_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0190_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0190_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 29
										row = sheet.getRow(28);
										
										cell4 = row.createCell(4);
										if (record.getR0200_overdue() != null) {
											cell4.setCellValue(record.getR0200_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0200_overdraft() != null) {
											cell5.setCellValue(record.getR0200_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0200_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0200_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0200_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0200_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0200_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0200_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0200_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0200_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0200_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0200_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0200_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0200_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0200_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0200_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0200_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0200_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0200_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0200_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0200_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0200_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										// Row 31
										row = sheet.getRow(30);
										
										cell4 = row.createCell(4);
										if (record.getR0220_overdue() != null) {
											cell4.setCellValue(record.getR0220_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0220_overdraft() != null) {
											cell5.setCellValue(record.getR0220_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0220_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0220_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0220_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0220_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0220_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0220_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0220_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0220_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0220_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0220_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0220_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0220_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0220_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0220_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0220_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0220_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0220_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0220_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0220_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0220_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 32
										row = sheet.getRow(31);
										
										cell4 = row.createCell(4);
										if (record.getR0230_overdue() != null) {
											cell4.setCellValue(record.getR0230_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0230_overdraft() != null) {
											cell5.setCellValue(record.getR0230_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0230_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0230_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0230_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0230_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0230_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0230_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0230_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0230_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0230_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0230_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0230_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0230_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0230_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0230_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0230_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0230_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0230_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0230_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0230_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0230_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 33
										row = sheet.getRow(32);
										
										cell4 = row.createCell(4);
										if (record.getR0240_overdue() != null) {
											cell4.setCellValue(record.getR0240_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0240_overdraft() != null) {
											cell5.setCellValue(record.getR0240_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0240_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0240_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0240_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0240_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0240_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0240_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0240_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0240_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0240_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0240_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0240_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0240_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0240_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0240_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0240_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0240_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0240_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0240_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0240_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0240_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 34
										row = sheet.getRow(33);
										
										cell4 = row.createCell(4);
										if (record.getR0250_overdue() != null) {
											cell4.setCellValue(record.getR0250_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0250_overdraft() != null) {
											cell5.setCellValue(record.getR0250_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0250_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0250_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0250_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0250_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0250_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0250_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0250_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0250_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0250_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0250_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0250_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0250_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0250_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0250_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0250_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0250_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0250_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0250_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0250_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0250_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 36
										row = sheet.getRow(35);
										
										cell4 = row.createCell(4);
										if (record.getR0270_overdue() != null) {
											cell4.setCellValue(record.getR0270_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0270_overdraft() != null) {
											cell5.setCellValue(record.getR0270_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0270_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0270_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0270_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0270_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0270_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0270_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0270_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0270_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0270_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0270_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0270_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0270_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0270_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0270_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0270_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0270_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0270_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0270_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0270_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0270_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 37
										row = sheet.getRow(36);
										
										cell4 = row.createCell(4);
										if (record.getR0280_overdue() != null) {
											cell4.setCellValue(record.getR0280_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0280_overdraft() != null) {
											cell5.setCellValue(record.getR0280_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0280_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0280_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0280_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0280_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0280_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0280_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0280_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0280_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0280_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0280_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0280_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0280_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0280_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0280_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0280_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0280_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0280_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0280_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0280_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0280_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 38
										row = sheet.getRow(37);
										
										cell4 = row.createCell(4);
										if (record.getR0290_overdue() != null) {
											cell4.setCellValue(record.getR0290_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0290_overdraft() != null) {
											cell5.setCellValue(record.getR0290_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0290_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0290_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0290_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0290_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0290_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0290_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0290_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0290_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0290_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0290_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0290_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0290_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0290_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0290_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0290_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0290_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0290_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0290_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0290_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0290_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										// Row 39
										row = sheet.getRow(38);
										
										cell4 = row.createCell(4);
										if (record.getR0300_overdue() != null) {
											cell4.setCellValue(record.getR0300_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0300_overdraft() != null) {
											cell5.setCellValue(record.getR0300_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0300_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0300_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0300_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0300_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0300_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0300_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0300_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0300_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0300_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0300_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0300_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0300_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0300_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0300_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0300_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0300_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0300_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0300_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0300_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0300_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 40
										row = sheet.getRow(39);
										
										cell4 = row.createCell(4);
										if (record.getR0310_overdue() != null) {
											cell4.setCellValue(record.getR0310_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0310_overdraft() != null) {
											cell5.setCellValue(record.getR0310_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0310_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0310_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0310_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0310_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0310_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0310_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0310_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0310_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0310_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0310_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0310_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0310_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0310_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0310_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0310_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0310_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0310_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0310_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0310_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0310_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 41
										row = sheet.getRow(40);
										
										cell4 = row.createCell(4);
										if (record.getR0320_overdue() != null) {
											cell4.setCellValue(record.getR0320_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0320_overdraft() != null) {
											cell5.setCellValue(record.getR0320_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0320_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0320_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0320_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0320_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0320_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0320_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0320_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0320_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0320_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0320_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0320_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0320_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0320_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0320_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0320_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0320_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0320_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0320_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0320_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0320_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 42
										row = sheet.getRow(41);
										
										cell4 = row.createCell(4);
										if (record.getR0330_overdue() != null) {
											cell4.setCellValue(record.getR0330_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0330_overdraft() != null) {
											cell5.setCellValue(record.getR0330_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0330_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0330_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0330_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0330_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0330_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0330_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0330_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0330_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0330_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0330_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0330_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0330_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0330_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0330_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0330_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0330_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0330_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0330_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0330_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0330_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 43
										row = sheet.getRow(42);
										
										cell4 = row.createCell(4);
										if (record.getR0340_overdue() != null) {
											cell4.setCellValue(record.getR0340_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0340_overdraft() != null) {
											cell5.setCellValue(record.getR0340_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0340_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0340_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0340_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0340_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0340_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0340_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0340_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0340_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0340_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0340_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0340_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0340_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0340_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0340_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0340_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0340_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0340_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0340_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0340_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0340_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 44
										row = sheet.getRow(43);
										
										cell4 = row.createCell(4);
										if (record.getR0350_overdue() != null) {
											cell4.setCellValue(record.getR0350_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0350_overdraft() != null) {
											cell5.setCellValue(record.getR0350_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0350_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0350_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0350_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0350_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0350_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0350_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0350_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0350_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0350_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0350_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0350_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0350_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0350_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0350_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0350_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0350_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0350_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0350_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0350_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0350_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 45
										row = sheet.getRow(44);
										
										cell4 = row.createCell(4);
										if (record.getR0360_overdue() != null) {
											cell4.setCellValue(record.getR0360_overdue().doubleValue());
											cell4.setCellStyle(numberStyle);
										} else {
											cell4.setCellValue("");
											cell4.setCellStyle(textStyle);
										}
										
										
										cell5 = row.createCell(5);
										if (record.getR0360_overdraft() != null) {
											cell5.setCellValue(record.getR0360_overdraft().doubleValue());
											cell5.setCellStyle(numberStyle);
										} else {
											cell5.setCellValue("");
											cell5.setCellStyle(textStyle);
										}
										
										
										cell6 = row.createCell(6);
										if (record.getR0360_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0360_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0360_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0360_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0360_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0360_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0360_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0360_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0360_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0360_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0360_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0360_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0360_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0360_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0360_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0360_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0360_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0360_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0360_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0360_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										// Row 49
										row = sheet.getRow(48);
										
										cell6 = row.createCell(6);
										if (record.getR0400_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0400_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0400_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0400_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0400_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0400_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0400_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0400_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0400_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0400_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0400_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0400_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0400_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0400_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0400_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0400_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0400_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0400_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0400_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0400_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 50
										row = sheet.getRow(49);
										
										cell6 = row.createCell(6);
										if (record.getR0410_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0410_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0410_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0410_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0410_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0410_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0410_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0410_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0410_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0410_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0410_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0410_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0410_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0410_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0410_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0410_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0410_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0410_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0410_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0410_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 51
										row = sheet.getRow(50);
										
										cell6 = row.createCell(6);
										if (record.getR0420_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0420_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0420_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0420_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0420_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0420_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0420_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0420_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0420_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0420_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0420_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0420_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0420_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0420_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0420_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0420_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0420_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0420_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0420_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0420_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 52
										row = sheet.getRow(51);
										
										cell6 = row.createCell(6);
										if (record.getR0430_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0430_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0430_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0430_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0430_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0430_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0430_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0430_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0430_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0430_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0430_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0430_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0430_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0430_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0430_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0430_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0430_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0430_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0430_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0430_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 53
										row = sheet.getRow(52);
										
										cell6 = row.createCell(6);
										if (record.getR0440_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0440_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0440_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0440_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0440_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0440_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0440_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0440_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0440_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0440_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0440_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0440_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0440_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0440_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0440_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0440_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0440_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0440_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0440_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0440_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 54
										row = sheet.getRow(53);
										
										cell6 = row.createCell(6);
										if (record.getR0450_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0450_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0450_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0450_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0450_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0450_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0450_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0450_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0450_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0450_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0450_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0450_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0450_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0450_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0450_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0450_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0450_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0450_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0450_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0450_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 56
										row = sheet.getRow(55);
										
										cell6 = row.createCell(6);
										if (record.getR0470_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0470_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0470_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0470_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0470_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0470_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0470_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0470_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0470_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0470_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0470_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0470_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0470_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0470_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0470_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0470_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0470_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0470_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0470_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0470_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 57
										row = sheet.getRow(56);
										
										cell6 = row.createCell(6);
										if (record.getR0480_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0480_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0480_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0480_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0480_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0480_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0480_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0480_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0480_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0480_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0480_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0480_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0480_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0480_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0480_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0480_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0480_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0480_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0480_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0480_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										// Row 58
										row = sheet.getRow(57);
										
										cell6 = row.createCell(6);
										if (record.getR0490_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0490_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0490_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0490_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0490_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0490_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0490_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0490_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0490_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0490_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0490_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0490_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0490_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0490_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0490_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0490_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0490_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0490_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0490_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0490_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 59
										row = sheet.getRow(58);
										
										cell6 = row.createCell(6);
										if (record.getR0500_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0500_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0500_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0500_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0500_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0500_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0500_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0500_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0500_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0500_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0500_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0500_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0500_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0500_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0500_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0500_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0500_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0500_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0500_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0500_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										// Row 60
										row = sheet.getRow(59);
										
										cell6 = row.createCell(6);
										if (record.getR0510_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0510_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0510_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0510_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0510_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0510_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0510_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0510_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0510_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0510_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0510_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0510_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0510_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0510_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0510_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0510_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0510_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0510_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0510_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0510_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										
										// Row 61
										row = sheet.getRow(60);
										
										cell6 = row.createCell(6);
										if (record.getR0520_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0520_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0520_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0520_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0520_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0520_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0520_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0520_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0520_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0520_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0520_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0520_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0520_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0520_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0520_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0520_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0520_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0520_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0520_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0520_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 63
										row = sheet.getRow(62);
										
										cell6 = row.createCell(6);
										if (record.getR0540_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0540_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0540_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0540_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0540_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0540_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0540_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0540_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0540_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0540_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0540_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0540_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0540_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0540_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0540_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0540_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0540_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0540_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0540_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0540_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 64
										row = sheet.getRow(63);
										
										cell6 = row.createCell(6);
										if (record.getR0550_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0550_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0550_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0550_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0550_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0550_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0550_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0550_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0550_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0550_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0550_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0550_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0550_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0550_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0550_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0550_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0550_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0550_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0550_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0550_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										// Row 65
										row = sheet.getRow(64);
										
										cell6 = row.createCell(6);
										if (record.getR0560_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0560_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0560_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0560_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0560_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0560_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0560_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0560_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0560_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0560_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0560_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0560_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0560_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0560_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0560_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0560_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0560_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0560_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0560_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0560_greater_than_5_years().doubleValue());
											cell15.setCellStyle(numberStyle);
										} else {
											cell15.setCellValue("");
											cell15.setCellStyle(textStyle);
										}
										
										
										
										
										// Row 66
										row = sheet.getRow(65);
										
										cell6 = row.createCell(6);
										if (record.getR0570_0_to_7_days() != null) {
											cell6.setCellValue(record.getR0570_0_to_7_days().doubleValue());
											cell6.setCellStyle(numberStyle);
										} else {
											cell6.setCellValue("");
											cell6.setCellStyle(textStyle);
										}
										
										
										cell7 = row.createCell(7);
										if (record.getR0570_8_to_14_days() != null) {
											cell7.setCellValue(record.getR0570_8_to_14_days().doubleValue());
											cell7.setCellStyle(numberStyle);
										} else {
											cell7.setCellValue("");
											cell7.setCellStyle(textStyle);
										}
										
										
										cell8 = row.createCell(8);
										if (record.getR0570_15_days_to_1_month() != null) {
											cell8.setCellValue(record.getR0570_15_days_to_1_month().doubleValue());
											cell8.setCellStyle(numberStyle);
										} else {
											cell8.setCellValue("");
											cell8.setCellStyle(textStyle);
										}
										
										
										cell9 = row.createCell(9);
										if (record.getR0570_1_to_2_months() != null) {
											cell9.setCellValue(record.getR0570_1_to_2_months().doubleValue());
											cell9.setCellStyle(numberStyle);
										} else {
											cell9.setCellValue("");
											cell9.setCellStyle(textStyle);
										}
										
										
										cell10 = row.createCell(10);
										if (record.getR0570_2_to_3_months() != null) {
											cell10.setCellValue(record.getR0570_2_to_3_months().doubleValue());
											cell10.setCellStyle(numberStyle);
										} else {
											cell10.setCellValue("");
											cell10.setCellStyle(textStyle);
										}
										
										
										cell11 = row.createCell(11);
										if (record.getR0570_3_to_6_months() != null) {
											cell11.setCellValue(record.getR0570_3_to_6_months().doubleValue());
											cell11.setCellStyle(numberStyle);
										} else {
											cell11.setCellValue("");
											cell11.setCellStyle(textStyle);
										}
										
										
										cell12 = row.createCell(12);
										if (record.getR0570_6_to_12_months() != null) {
											cell12.setCellValue(record.getR0570_6_to_12_months().doubleValue());
											cell12.setCellStyle(numberStyle);
										} else {
											cell12.setCellValue("");
											cell12.setCellStyle(textStyle);
										}
										
										
										cell13 = row.createCell(13);
										if (record.getR0570_1_to_3_years() != null) {
											cell13.setCellValue(record.getR0570_1_to_3_years().doubleValue());
											cell13.setCellStyle(numberStyle);
										} else {
											cell13.setCellValue("");
											cell13.setCellStyle(textStyle);
										}
										
										
										cell14 = row.createCell(14);
										if (record.getR0570_3_to_5_years() != null) {
											cell14.setCellValue(record.getR0570_3_to_5_years().doubleValue());
											cell14.setCellStyle(numberStyle);
										} else {
											cell14.setCellValue("");
											cell14.setCellStyle(textStyle);
										}
										
										
										cell15 = row.createCell(15);
										if (record.getR0570_greater_than_5_years() != null) {
											cell15.setCellValue(record.getR0570_greater_than_5_years().doubleValue());
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
