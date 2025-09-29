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
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_Repo;
import com.bornfire.brf.entities.CBUAE_BRF5_17_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_17_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF5_17_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_17_SUMMARY_Repo;

@Component
@Service
public class CBUAE_BRF5_17_ReportService {

	private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF5_17_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CBUAE_BRF5_17_DETAIL_Repo BRF5_17_DETAIL_Repo;

	@Autowired
	CBUAE_BRF5_17_SUMMARY_Repo BRF5_17_Summary_Repo;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getBRF5_17View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	
		
		List<CBUAE_BRF5_17_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF5_17_SUMMARY_ENTITY>();

		try {
			//Date parsedDate = dateformat.parse(todate);
			Date d1 = dateformat.parse(todate);
			T1Master = BRF5_17_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		mv.setViewName("BRF/BRF5_17"); // ✅ Valid view path
		System.out.println(T1Master);
		mv.addObject("reportsummary", T1Master);
		
		mv.addObject("displaymode", "summary");
		
		System.out.println("scv" + mv.getViewName());

		return mv;
	} 
	
	public ModelAndView getBRF5_17currentDtl( 
	        String reportId, String fromdate, String todate, String currency,
	        String dtltype, Pageable pageable, String filter) {
		
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	
	    
	    List<CBUAE_BRF5_17_DETAIL_ENTITY> T1Dt1 = new ArrayList<>(); 
	    
	    try {
	        Date d1 = dateformat.parse(todate);
	        String rowId = null;
	        String columnId = null;
	        
	        // ✅ Split the filter string here
	        if (filter != null && filter.contains(",")) {
	            String[] parts = filter.split(",");
	            if (parts.length >= 2) {
	                rowId = parts[0];
	                columnId = parts[1];
	            }
	        }

	        if (rowId != null && columnId != null) {
	            T1Dt1 = BRF5_17_DETAIL_Repo.GetDataByRowIdAndColumnId(rowId, columnId); 
	        } else {
	            T1Dt1 = BRF5_17_DETAIL_Repo.getdatabydateList(d1);
	        }
	        
	        System.out.println("LISTCOUNT: " + T1Dt1.size());
	    }
	    catch (ParseException e) {
	        e.printStackTrace();
	    }
	    
	    mv.setViewName("BRF/BRF5_17");
	    System.out.println(T1Dt1); 
	    mv.addObject("reportdetails", T1Dt1);
	    mv.addObject("displaymode", "Details");
	    System.out.println("scv" + mv.getViewName());
	    return mv;
	}
	
	public byte[] getBRF5_17Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		List<CBUAE_BRF5_17_SUMMARY_ENTITY> dataList =BRF5_17_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;
		
		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF5.17 report. Returning empty result.");
			return new byte[0];
		}
		
		String templateDir = env.getProperty("output.exportpathtemp");
		Path templatePath = Paths.get(templateDir, filename);

		logger.info("Service: Attempting to load template from path: {}", templatePath.toAbsolutePath());

		if (!Files.exists(templatePath)) {
		throw new FileNotFoundException("Template file not found at: " + templatePath.toAbsolutePath());
		}
		if (!Files.isReadable(templatePath)) {
		throw new SecurityException("Template file exists but is not readable: " + templatePath.toAbsolutePath());
		}
		
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
			
			int startRow = 10;
			
			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					CBUAE_BRF5_17_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					//row`10
					//column ITEM
					Cell cell3 = row.createCell(3);
					if (record.getR0010_product() != null) {	
					cell3.setCellValue(record.getR0010_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 10
					Cell cell4 = row.createCell(4);
					if (record.getR0010_expbccf_indiv_resi()!= null) {
						
					cell4.setCellValue(record.getR0010_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 20
					Cell cell5 = row.createCell(5);
					if (record.getR0010_expaccf_indiv_resi()!= null) {	
					cell5.setCellValue(record.getR0010_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 30
					Cell cell6 = row.createCell(6);
					if (record.getR0010_expbccf_indiv_nonresi()!= null) { 
					cell6.setCellValue(record.getR0010_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 40
					Cell cell7 = row.createCell(7);
					if (record.getR0010_expaccf_indiv_nonresi()!= null) { 
					cell7.setCellValue(record.getR0010_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 50
					Cell cell8 = row.createCell(8);
					if (record.getR0010_expbccf_rsme_resi()!= null) { 
					cell8.setCellValue(record.getR0010_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 60
					Cell cell9 = row.createCell(9);
					if (record.getR0010_expaccf_rsme_resi()!= null) { 
					cell9.setCellValue(record.getR0010_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 70
					Cell cell10 = row.createCell(10);
					if (record.getR0010_expbccf_rsme_nonresi()!= null) { 
					cell10.setCellValue(record.getR0010_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 80
					Cell cell11 = row.createCell(11);
					if (record.getR0010_expaccf_rsme_nonresi() != null) { 
					cell11.setCellValue(record.getR0010_expaccf_rsme_nonresi() .doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 90
					Cell cell12 = row.createCell(12);
					if (record.getR0010_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0010_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 100
					Cell cell13 = row.createCell(13);
					if (record.getR0010_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0010_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 110
					Cell cell14 = row.createCell(14);
					if (record.getR0010_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0010_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 120
					Cell cell15 = row.createCell(15);
					if (record.getR0010_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0010_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 130
					Cell cell16 = row.createCell(16);
					if (record.getR0010_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0010_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 140
					Cell cell17 = row.createCell(17);
					if (record.getR0010_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0010_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 150
					Cell cell18 = row.createCell(18);
					if (record.getR0010_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0010_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 160
					Cell cell19 = row.createCell(19);
					if (record.getR0010_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0010_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 170
					Cell cell20 = row.createCell(20);
					if (record.getR0010_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0010_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 180
					Cell cell21 = row.createCell(21);
					if (record.getR0010_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0010_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 190
					Cell cell22 = row.createCell(22);
					if (record.getR0010_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0010_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 200
					Cell cell23 = row.createCell(23);
					if (record.getR0010_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0010_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 210
					Cell cell24 = row.createCell(24);
					if (record. getR0010_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0010_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 220
					Cell cell25 = row.createCell(25);
					if (record. getR0010_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0010_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 230
					Cell cell26 = row.createCell(26);
					if (record.getR0010_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0010_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 240
					Cell cell27 = row.createCell(27);
					if (record.getR0010_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0010_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 250
					Cell cell28 = row.createCell(28);
					if (record.getR0010_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0010_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 260
					Cell cell29 = row.createCell(29);
					if (record.getR0010_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0010_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 270
					Cell cell30 = row.createCell(30);
					if (record.getR0010_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0010_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 280
					Cell cell31 = row.createCell(31);
					if (record.getR0010_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0010_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 290
					Cell cell32 = row.createCell(32);
					if (record.getR0010_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0010_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 300
					Cell cell33 = row.createCell(33);
					if (record.getR0010_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0010_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 310
					Cell cell34 = row.createCell(34);
					if (record. getR0010_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0010_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 320
					Cell cell35 = row.createCell(35);
					if (record. getR0010_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0010_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 330
					Cell cell36 = row.createCell(36);
					if (record. getR0010_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0010_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 340
					Cell cell37 = row.createCell(37);
					if (record. getR0010_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0010_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 350
					Cell cell38 = row.createCell(38);
					if (record. getR0010_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0010_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 10
					//column 360
					Cell cell39 = row.createCell(39);
					if (record. getR0010_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0010_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row12
					row = sheet.getRow(11);
					
					//row`20
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0020_product() != null) {	
					cell3.setCellValue(record.getR0020_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 20
					//column 10
					cell4= row.createCell(4);
					if (record.getR0020_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0020_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0020_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0020_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0020_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0020_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0020_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0020_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0020_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0020_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0020_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0020_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0020_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0020_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0020_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0020_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 20
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0020_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0020_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0020_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0020_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0020_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0020_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0020_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0020_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0020_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0020_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0020_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0020_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0020_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0020_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0020_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0020_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0020_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0020_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0020_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0020_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0020_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0020_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0020_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0020_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0020_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0020_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0020_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0020_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0020_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0020_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0020_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0020_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0020_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0020_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0020_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0020_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0020_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0020_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0020_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0020_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0020_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0020_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0020_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0020_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0020_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0020_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0020_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0020_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0020_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0020_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0020_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0020_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0020_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0020_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 20
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0020_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0020_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row13
					row = sheet.getRow(12); 
					
					//row`30
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0030_product() != null) {	
					cell3.setCellValue(record.getR0030_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 30
					//column 10
					cell4= row.createCell(4);
					if (record.getR0030_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0030_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0030_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0030_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0030_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0030_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0030_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0030_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0030_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0030_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0030_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0030_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0030_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0030_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0030_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0030_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 30
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0030_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0030_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0030_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0030_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0030_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0030_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0030_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0030_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0030_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0030_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0030_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0030_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0030_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0030_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0030_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0030_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0030_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0030_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0030_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0030_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0030_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0030_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0030_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0030_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0030_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0030_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0030_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0030_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0030_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0030_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0030_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0030_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0030_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0030_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0030_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0030_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0030_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0030_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0030_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0030_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0030_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0030_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0030_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0030_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0030_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0030_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0030_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0030_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0030_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0030_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0030_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0030_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0030_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 30
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0030_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0030_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row14
					row = sheet.getRow(13); 
					
					//row`40
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0040_product() != null) {	
					cell3.setCellValue(record.getR0040_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 40
					//column 10
					cell4= row.createCell(4);
					if (record.getR0040_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0040_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0040_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0040_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0040_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0040_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0040_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0040_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0040_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0040_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0040_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0040_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0040_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0040_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0040_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0040_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 40
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0040_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0040_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0040_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0040_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0040_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0040_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0040_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0040_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0040_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0040_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0040_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0040_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0040_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0040_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0040_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0040_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0040_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0040_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0040_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0040_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0040_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0040_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0040_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0040_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0040_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0040_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0040_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0040_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0040_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0040_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0040_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0040_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0040_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0040_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0040_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0040_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0040_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0040_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0040_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0040_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0040_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0040_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0040_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0040_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0040_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0040_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0040_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0040_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0040_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0040_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0040_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0040_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0040_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 40
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0040_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0040_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row15
					row = sheet.getRow(14); 
					
					//row 50
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0050_product() != null) {	
					cell3.setCellValue(record.getR0050_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 50
					//column 10
					cell4= row.createCell(4);
					if (record.getR0050_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0050_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0050_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0050_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0050_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0050_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0050_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0050_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0050_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0050_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0050_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0050_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0050_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0050_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0050_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0050_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 50
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0050_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0050_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0050_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0050_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0050_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0050_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0050_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0050_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0050_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0050_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0050_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0050_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0050_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0050_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0050_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0050_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0050_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0050_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0050_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0050_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0050_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0050_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0050_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0050_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0050_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0050_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0050_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0050_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0050_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0050_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0050_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0050_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0050_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0050_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0050_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0050_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0050_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0050_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0050_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0050_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0050_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0050_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0050_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0050_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0050_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0050_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0050_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0050_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0050_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0050_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0050_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0050_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0050_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 50
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0050_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0050_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row16
					row = sheet.getRow(15); 
					
					//row 60
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0060_product() != null) {	
					cell3.setCellValue(record.getR0060_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 60
					//column 10
					cell4= row.createCell(4);
					if (record.getR0050_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0050_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0050_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0050_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0050_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0050_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0050_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0050_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0050_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0050_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0050_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0050_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0050_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0050_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0050_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0050_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 60
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0050_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0050_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0050_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0050_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0050_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0050_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0050_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0050_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0050_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0050_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0050_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0050_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0050_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0050_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0050_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0050_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0050_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0050_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0050_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0050_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0050_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0050_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0050_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0050_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0050_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0050_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0050_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0050_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0050_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0050_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0050_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0050_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0050_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0050_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0050_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0050_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0050_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0050_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0050_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0050_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0050_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0050_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0050_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0050_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0050_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0050_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0050_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0050_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0050_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0050_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0050_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0050_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0050_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 60
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0050_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0050_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row17
					row = sheet.getRow(16); 
					
					
					//row 70
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0070_product() != null) {	
					cell3.setCellValue(record.getR0070_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					
					
					//row 70
					//column 10
					cell4= row.createCell(4);
					if (record.getR0070_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0070_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0070_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0070_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0070_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0070_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0070_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0070_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0070_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0070_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0070_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0070_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0070_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0070_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0070_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0070_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 70
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0070_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0070_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0070_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0070_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0070_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0070_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0070_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0070_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0070_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0070_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0070_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0070_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0070_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0070_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0070_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0070_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0070_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0070_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0070_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0070_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0070_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0070_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0070_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0070_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0070_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0070_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0070_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0070_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0070_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0070_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0070_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0070_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0070_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0070_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0070_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0070_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0070_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0070_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0070_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0070_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0070_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0070_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0070_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0070_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0070_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0070_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0070_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0070_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0070_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0070_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0070_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0070_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0070_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 70
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0070_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0070_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row18
					row = sheet.getRow(17); 
					
					//row 80
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0080_product() != null) {	
					cell3.setCellValue(record.getR0080_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 80
					//column 10
					cell4= row.createCell(4);
					if (record.getR0080_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0080_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0080_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0080_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0080_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0080_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0080_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0080_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0080_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0080_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0080_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0080_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0080_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0080_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0080_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0080_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 80
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0080_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0080_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0080_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0080_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0080_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0080_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0080_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0080_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0080_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0080_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0080_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0080_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0080_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0080_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0080_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0080_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0080_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0080_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0080_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0080_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0080_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0080_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0080_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0080_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0080_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0080_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0080_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0080_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0080_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0080_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0080_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0080_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0080_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0080_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0080_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0080_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0080_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0080_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0080_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0080_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0080_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0080_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0080_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0080_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0080_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0080_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0080_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0080_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0080_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0080_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0080_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0080_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0080_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 80
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0080_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0080_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row19
					row = sheet.getRow(18); 
					
					//row 90
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0090_product() != null) {	
					cell3.setCellValue(record.getR0090_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 90
					//column 10
					cell4= row.createCell(4);
					if (record.getR0090_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0090_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0090_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0090_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0090_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0090_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0090_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0090_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0090_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0090_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0090_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0090_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0090_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0090_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0090_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0090_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 90
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0090_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0090_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0090_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0090_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0090_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0090_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0090_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0090_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0090_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0090_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0090_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0090_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0090_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0090_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0090_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0090_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0090_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0090_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0090_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0090_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0090_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0090_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0090_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0090_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0090_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0090_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0090_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0090_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0090_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0090_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0090_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0090_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0090_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0090_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0090_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0090_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0090_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0090_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0090_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0090_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0090_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0090_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0090_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0090_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0090_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0090_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0090_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0090_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0090_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0090_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0090_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0090_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0090_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 90
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0090_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0090_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row20
					row = sheet.getRow(19);
					
					//row 100
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0100_product() != null) {	
					cell3.setCellValue(record.getR0100_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 100
					//column 10
					cell4= row.createCell(4);
					if (record.getR0100_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0100_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0100_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0100_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0100_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0100_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0100_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0100_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0100_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0100_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0100_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0100_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0100_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0100_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0100_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0100_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 100
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0100_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0100_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0100_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0100_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0100_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0100_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0100_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0100_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0100_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0100_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0100_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0100_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0100_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0100_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0100_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0100_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0100_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0100_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0100_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0100_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0100_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0100_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0100_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0100_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0100_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0100_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0100_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0100_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0100_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0100_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0100_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0100_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0100_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0100_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0100_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0100_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0100_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0100_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0100_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0100_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0100_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0100_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0100_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0100_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0100_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0100_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0100_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0100_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0100_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0100_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0100_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0100_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0100_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 100
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0100_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0100_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row21
					row = sheet.getRow(20);
					
					//row 110
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0110_product() != null) {	
					cell3.setCellValue(record.getR0110_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 110
					//column 10
					cell4= row.createCell(4);
					if (record.getR0110_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0110_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0110_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0110_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0110_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0110_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0110_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0110_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0110_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0110_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0110_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0110_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0110_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0110_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0110_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0110_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 110
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0110_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0110_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0110_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0110_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0110_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0110_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0110_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0110_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0110_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0110_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0110_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0110_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0110_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0110_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0110_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0110_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0110_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0110_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0110_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0110_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0110_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0110_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0110_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0110_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0110_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0110_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0110_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0110_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0110_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0110_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0110_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0110_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0110_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0110_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0110_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0110_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0110_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0110_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0110_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0110_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0110_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0110_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0110_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0110_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0110_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0110_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0110_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0110_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0110_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0110_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0110_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0110_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0110_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 110
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0110_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0110_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row22
					row = sheet.getRow(21);
					
					//row 120
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0120_product() != null) {	
					cell3.setCellValue(record.getR0120_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 120
					//column 10
					cell4= row.createCell(4);
					if (record.getR0120_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0120_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0120_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0120_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0120_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0120_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0120_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0120_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0120_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0120_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0120_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0120_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0120_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0120_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0120_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0120_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 120
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0120_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0120_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0120_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0120_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0120_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0120_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0120_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0120_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0120_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0120_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0120_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0120_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0120_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0120_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0120_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0120_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0120_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0120_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0120_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0120_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0120_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0120_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0120_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0120_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0120_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0120_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0120_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0120_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0120_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0120_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0120_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0120_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0120_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0120_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0120_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0120_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0120_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0120_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0120_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0120_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0120_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0120_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0120_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0120_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0120_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0120_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0120_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0120_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0120_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0120_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0120_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0120_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0120_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 120
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0120_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0120_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row23
					row = sheet.getRow(22);
					
					//row 130
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0130_product() != null) {	
					cell3.setCellValue(record.getR0130_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 130
					//column 10
					cell4= row.createCell(4);
					if (record.getR0130_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0130_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0130_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0130_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0130_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0130_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0130_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0130_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0130_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0130_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0130_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0130_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0130_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0130_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0130_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0130_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 130
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0130_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0130_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0130_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0130_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0130_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0130_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0130_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0130_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0130_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0130_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0130_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0130_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0130_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0130_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0130_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0130_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0130_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0130_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0130_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0130_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0130_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0130_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0130_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0130_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0130_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0130_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0130_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0130_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0130_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0130_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0130_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0130_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0130_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0130_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0130_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0130_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0130_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0130_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0130_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0130_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0130_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0130_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0130_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0130_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0130_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0130_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0130_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0130_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0130_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0130_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0130_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0130_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0130_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 130
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0130_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0130_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row24
					row = sheet.getRow(23);
					
					//row 140
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0140_product() != null) {	
					cell3.setCellValue(record.getR0140_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 140
					//column 10
					cell4= row.createCell(4);
					if (record.getR0140_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0140_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0140_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0140_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0140_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0140_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0140_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0140_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0140_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0140_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0140_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0140_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0140_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0140_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0140_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0140_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 140
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0140_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0140_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0140_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0140_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0140_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0140_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0140_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0140_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0140_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0140_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0140_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0140_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0140_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0140_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0140_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0140_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0140_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0140_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0140_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0140_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0140_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0140_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0140_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0140_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0140_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0140_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0140_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0140_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0140_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0140_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0140_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0140_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0140_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0140_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0140_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0140_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0140_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0140_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0140_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0140_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0140_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0140_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0140_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0140_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0140_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0140_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0140_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0140_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0140_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0140_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0140_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0140_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0140_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 140
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0140_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0140_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row25
					row = sheet.getRow(24);
					
					//row 150
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0150_product() != null) {	
					cell3.setCellValue(record.getR0150_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 150
					//column 10
					cell4= row.createCell(4);
					if (record.getR0150_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0150_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0150_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0150_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0150_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0150_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0150_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0150_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0150_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0150_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0150_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0150_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0150_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0150_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0150_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0150_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 150
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0150_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0150_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0150_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0150_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0150_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0150_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0150_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0150_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0150_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0150_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0150_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0150_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0150_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0150_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0150_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0150_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0150_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0150_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0150_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0150_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0150_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0150_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0150_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0150_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0150_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0150_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0150_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0150_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0150_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0150_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0150_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0150_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0150_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0150_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0150_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0150_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0150_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0150_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0150_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0150_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0150_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0150_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0150_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0150_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0150_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0150_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0150_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0150_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0150_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0150_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0150_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0150_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0150_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 150
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0150_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0150_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row26
					row = sheet.getRow(25);
					
					//row 160
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0160_product() != null) {	
					cell3.setCellValue(record.getR0160_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 160
					//column 10
					cell4= row.createCell(4);
					if (record.getR0160_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0160_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0160_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0160_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0160_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0160_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0160_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0160_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0160_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0160_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0160_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0160_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0160_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0160_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0160_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0160_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 160
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0160_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0160_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0160_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0160_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0160_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0160_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0160_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0160_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0160_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0160_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0160_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0160_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0160_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0160_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0160_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0160_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0160_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0160_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0160_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0160_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0160_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0160_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0160_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0160_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0160_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0160_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0160_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0160_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0160_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0160_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0160_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0160_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0160_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0160_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0160_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0160_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0160_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0160_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0160_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0160_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0160_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0160_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0160_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0160_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0160_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0160_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0160_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0160_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0160_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0160_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0160_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0160_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0160_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 160
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0160_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0160_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row27
					row = sheet.getRow(26);
					
					//row 170
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0170_product() != null) {	
					cell3.setCellValue(record.getR0170_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 170
					//column 10
					cell4= row.createCell(4);
					if (record.getR0170_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0170_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0170_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0170_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0170_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0170_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0170_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0170_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0170_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0170_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0170_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0170_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0170_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0170_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0170_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0170_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 170
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0170_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0170_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0170_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0170_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0170_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0170_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0170_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0170_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0170_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0170_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0170_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0170_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0170_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0170_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0170_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0170_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0170_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0170_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0170_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0170_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0170_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0170_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0170_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0170_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0170_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0170_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0170_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0170_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0170_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0170_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0170_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0170_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0170_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0170_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0170_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0170_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0170_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0170_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0170_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0170_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0170_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0170_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0170_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0170_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0170_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0170_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0170_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0170_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0170_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0170_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0170_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0170_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0170_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 170
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0170_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0170_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row28
					row = sheet.getRow(27);
					
					//row 180
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0180_product() != null) {	
					cell3.setCellValue(record.getR0180_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 180
					//column 10
					cell4= row.createCell(4);
					if (record.getR0180_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0180_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0180_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0180_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0180_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0180_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0180_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0180_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0180_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0180_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0180_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0180_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0180_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0180_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0180_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0180_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 180
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0180_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0180_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0180_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0180_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0180_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0180_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0180_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0180_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0180_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0180_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0180_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0180_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0180_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0180_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0180_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0180_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0180_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0180_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0180_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0180_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0180_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0180_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0180_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0180_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0180_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0180_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0180_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0180_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0180_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0180_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0180_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0180_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0180_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0180_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0180_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0180_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0180_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0180_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0180_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0180_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0180_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0180_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0180_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0180_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0180_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0180_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0180_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0180_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0180_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0180_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0180_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0180_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0180_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 180
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0180_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0180_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row29
					row = sheet.getRow(28);
					
					//row 190
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0190_product() != null) {	
					cell3.setCellValue(record.getR0190_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 190
					//column 10
					cell4= row.createCell(4);
					if (record.getR0190_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0190_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0190_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0190_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0190_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0190_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0190_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0190_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0190_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0190_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0190_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0190_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0190_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0190_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0190_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0190_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 190
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0190_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0190_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0190_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0190_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0190_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0190_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0190_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0190_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0190_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0190_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0190_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0190_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0190_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0190_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0190_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0190_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0190_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0190_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0190_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0190_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0190_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0190_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0190_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0190_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0190_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0190_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0190_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0190_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0190_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0190_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0190_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0190_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0190_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0190_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0190_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0190_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0190_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0190_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0190_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0190_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0190_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0190_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0190_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0190_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0190_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0190_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0190_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0190_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0190_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0190_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0190_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0190_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0190_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 190
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0190_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0190_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row30
					row = sheet.getRow(29);
					
					
					//row 200
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0200_product() != null) {	
					cell3.setCellValue(record.getR0200_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 200
					//column 10
					cell4= row.createCell(4);
					if (record.getR0200_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0200_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0200_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0200_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0200_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0200_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0200_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0200_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0200_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0200_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0200_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0200_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0200_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0200_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0200_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0200_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 200
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0200_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0200_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0200_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0200_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0200_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0200_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0200_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0200_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0200_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0200_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0200_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0200_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0200_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0200_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0200_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0200_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0200_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0200_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0200_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0200_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0200_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0200_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0200_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0200_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0200_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0200_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0200_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0200_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0200_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0200_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0200_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0200_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0200_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0200_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0200_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0200_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0200_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0200_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0200_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0200_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0200_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0200_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0200_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0200_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0200_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0200_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0200_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0200_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0200_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0200_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0200_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0200_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0200_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 200
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0200_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0200_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row31
					row = sheet.getRow(30);
					
					//row 210
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0210_product() != null) {	
					cell3.setCellValue(record.getR0210_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 210
					//column 10
					cell4= row.createCell(4);
					if (record.getR0210_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0210_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0210_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0210_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0210_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0210_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0210_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0210_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0210_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0210_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0210_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0210_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0210_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0210_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0210_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0210_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 210
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0210_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0210_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0210_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0210_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0210_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0210_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0210_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0210_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0210_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0210_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0210_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0210_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0210_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0210_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0210_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0210_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0210_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0210_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0210_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0210_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0210_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0210_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0210_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0210_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0210_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0210_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0210_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0210_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0210_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0210_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0210_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0210_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0210_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0210_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0210_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0210_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0210_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0210_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0210_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0210_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0210_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0210_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0210_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0210_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0210_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0210_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0210_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0210_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0210_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0210_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0210_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0210_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0210_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 210
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0210_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0210_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row32
					row = sheet.getRow(31);
					
					//row 220
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0220_product() != null) {	
					cell3.setCellValue(record.getR0220_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 220
					//column 10
					cell4= row.createCell(4);
					if (record.getR0220_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0220_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0220_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0220_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0220_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0220_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0220_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0220_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0220_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0220_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0220_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0220_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0220_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0220_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0220_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0220_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 220
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0220_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0220_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0220_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0220_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0220_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0220_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0220_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0220_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0220_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0220_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0220_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0220_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0220_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0220_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0220_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0220_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0220_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0220_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0220_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0220_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0220_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0220_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0220_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0220_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0220_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0220_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0220_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0220_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0220_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0220_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0220_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0220_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0220_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0220_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0220_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0220_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0220_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0220_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0220_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0220_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0220_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0220_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0220_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0220_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0220_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0220_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0220_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0220_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0220_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0220_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0220_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0220_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0220_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 220
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0220_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0220_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row33
					row = sheet.getRow(32);
					//row 230
					//column ITEM
					cell3= row.createCell(3);
					if (record.getR0230_product() != null) {	
					cell3.setCellValue(record.getR0230_product());
					 cell3.setCellStyle(textStyle); // Use text style for string data
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle); // Still text style even when empty
					} 
					
					//row 230
					//column 10
					cell4= row.createCell(4);
					if (record.getR0230_expbccf_indiv_resi() != null) { 
					 cell4.setCellValue(record.getR0230_expbccf_indiv_resi().doubleValue());
					 cell4.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 20
					cell5 = row.createCell(5);
					if (record.getR0230_expaccf_indiv_resi() != null) { 
					 cell5.setCellValue(record.getR0230_expaccf_indiv_resi().doubleValue());
					 cell5.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell5.setCellValue("");
					    cell5.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 30
					 cell6= row.createCell(6);
					if (record.getR0230_expbccf_indiv_nonresi() != null) { 
					 cell6.setCellValue(record.getR0230_expbccf_indiv_nonresi().doubleValue());
					 cell6.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell6.setCellValue("");
					    cell6.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 40
					cell7 = row.createCell(7);
					if (record.getR0230_expaccf_indiv_nonresi() != null) { 
					 cell7.setCellValue(record.getR0230_expaccf_indiv_nonresi().doubleValue());
					 cell7.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell7.setCellValue("");
					    cell7.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 50
					cell8 = row.createCell(8);
					if (record.getR0230_expbccf_rsme_resi() != null) { 
					 cell8.setCellValue(record.getR0230_expbccf_rsme_resi().doubleValue());
					 cell8.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell8.setCellValue("");
					    cell8.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 60
					 cell9 = row.createCell(9);
					if (record.getR0230_expaccf_rsme_resi() != null) { 
					 cell9.setCellValue(record.getR0230_expaccf_rsme_resi().doubleValue());
					 cell9.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell9.setCellValue("");
					    cell9.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 70
					 cell10 = row.createCell(10);
					if (record.getR0230_expbccf_rsme_nonresi() != null) { 
					 cell10.setCellValue(record.getR0230_expbccf_rsme_nonresi().doubleValue());
					 cell10.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell10.setCellValue("");
					    cell10.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 80
					 cell11 = row.createCell(11);
					if (record.getR0230_expaccf_rsme_nonresi() != null) { 
					 cell11.setCellValue(record.getR0230_expaccf_rsme_nonresi().doubleValue());
					 cell11.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell11.setCellValue("");
					    cell11.setCellStyle(textStyle); // Still text style even when empty
					}
					
					
					//row 230
					//column 90
					cell12 = row.createCell(12);
					if (record.getR0230_expbccf_sme_resi() != null) { 
					cell12.setCellValue(record.getR0230_expbccf_sme_resi() .doubleValue());
					 cell12.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell12.setCellValue("");
					    cell12.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 100
					cell13 = row.createCell(13);
					if (record.getR0230_expaccf_sme_resi() != null) { 
					cell13.setCellValue(record.getR0230_expaccf_sme_resi() .doubleValue());
					 cell13.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell13.setCellValue("");
					    cell13.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 110
					cell14 = row.createCell(14);
					if (record.getR0230_expbccf_sme_nonresi() != null) { 
					cell14.setCellValue(record.getR0230_expbccf_sme_nonresi() .doubleValue());
					 cell14.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell14.setCellValue("");
					    cell14.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 120
					cell15 = row.createCell(15);
					if (record.getR0230_expaccf_sme_nonresi() != null) { 
					cell15.setCellValue(record.getR0230_expaccf_sme_nonresi() .doubleValue());
					 cell15.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell15.setCellValue("");
					    cell15.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 130
					cell16 = row.createCell(16);
					if (record.getR0230_expbccf_hni_resi() != null) { 
					cell16.setCellValue(record.getR0230_expbccf_hni_resi() .doubleValue());
					 cell16.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell16.setCellValue("");
					    cell16.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 140
					 cell17 = row.createCell(17);
					if (record.getR0230_expaccf_hni_resi() != null) { 
					cell17.setCellValue(record.getR0230_expaccf_hni_resi().doubleValue());
					 cell17.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell17.setCellValue("");
					    cell17.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 150
					cell18 = row.createCell(18);
					if (record.getR0230_expbccf_hni_nonresi() != null) { 
					cell18.setCellValue(record.getR0230_expbccf_hni_nonresi().doubleValue());
					 cell18.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell18.setCellValue("");
					    cell18.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 160
					cell19 = row.createCell(19);
					if (record.getR0230_expaccf_hni_nonresi() != null) { 
					cell19.setCellValue(record.getR0230_expaccf_hni_nonresi().doubleValue());
					 cell19.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell19.setCellValue("");
					    cell19.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 170
				    cell20 = row.createCell(20);
					if (record.getR0230_expbccf_gres_resi() != null) { 
					cell20.setCellValue(record.getR0230_expbccf_gres_resi().doubleValue());
					 cell20.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell20.setCellValue("");
					    cell20.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 180
					cell21 = row.createCell(21);
					if (record.getR0230_expaccf_gres_resi() != null) { 
					cell21.setCellValue(record.getR0230_expaccf_gres_resi().doubleValue());
					 cell21.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell21.setCellValue("");
					    cell21.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 190
					cell22 = row.createCell(22);
					if (record.getR0230_expbccf_gres_nonresi() != null) { 
					cell22.setCellValue(record.getR0230_expbccf_gres_nonresi().doubleValue());
					 cell22.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell22.setCellValue("");
					    cell22.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 200
					 cell23 = row.createCell(23);
					if (record.getR0230_expaccf_gres_nonresi() != null) { 
					cell23.setCellValue(record.getR0230_expaccf_gres_nonresi().doubleValue());
					 cell23.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell23.setCellValue("");
					    cell23.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 210
					cell24 = row.createCell(24);
					if (record. getR0230_expbccf_corp_resi() != null) { 
					cell24.setCellValue(record. getR0230_expbccf_corp_resi().doubleValue());
					 cell24.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell24.setCellValue("");
					    cell24.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 220
					 cell25 = row.createCell(25);
					if (record. getR0230_expaccf_corp_resi() != null) { 
					cell25.setCellValue(record. getR0230_expaccf_corp_resi().doubleValue());
					 cell25.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell25.setCellValue("");
					    cell25.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 230
					cell26 = row.createCell(26);
					if (record.getR0230_expbccf_corp_nonresi() != null) { 
					cell26.setCellValue(record.getR0230_expbccf_corp_nonresi().doubleValue());
					 cell26.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell26.setCellValue("");
					    cell26.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 240
					cell27 = row.createCell(27);
					if (record.getR0230_expaccf_corp_nonresi() != null) { 
					 cell27.setCellValue(record.getR0230_expaccf_corp_nonresi().doubleValue());
					 cell27.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell27.setCellValue("");
					    cell27.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 250
					cell28 = row.createCell(28);
					if (record.getR0230_expbccf_nbfi_resi() != null) { 
					 cell28.setCellValue(record. getR0230_expbccf_nbfi_resi().doubleValue());
					 cell28.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell28.setCellValue("");
					    cell28.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 260
					cell29 = row.createCell(29);
					if (record.getR0030_expaccf_nbfi_resi() != null) { 
					 cell29.setCellValue(record. getR0230_expaccf_nbfi_resi().doubleValue());
					 cell29.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell29.setCellValue("");
					    cell29.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 270
					cell30 = row.createCell(30);
					if (record.getR0230_expbccf_nbfi_nonresi() != null) { 
					 cell30.setCellValue(record.getR0230_expbccf_nbfi_nonresi().doubleValue());
					 cell30.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell30.setCellValue("");
					    cell30.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 280
					cell31 = row.createCell(31);
					if (record.getR0230_expaccf_nbfi_nonresi() != null) { 
					 cell31.setCellValue(record.getR0230_expaccf_nbfi_nonresi().doubleValue());
					 cell31.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell31.setCellValue("");
					    cell31.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 290
					cell32 = row.createCell(32);
					if (record.getR0230_expbccf_bank_resi() != null) { 
					 cell32.setCellValue(record.getR0230_expbccf_bank_resi().doubleValue());
					 cell32.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell32.setCellValue("");
					    cell32.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 300
					cell33 = row.createCell(33);
					if (record.getR0230_expaccf_bank_resi() != null) { 
					 cell33.setCellValue(record.getR0230_expaccf_bank_resi().doubleValue());
					 cell33.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell33.setCellValue("");
					    cell33.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 310
					cell34 = row.createCell(34);
					if (record. getR0230_expbccf_bank_nonresi() != null) { 
					 cell34.setCellValue(record. getR0230_expbccf_bank_nonresi().doubleValue());
					 cell34.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell34.setCellValue("");
					    cell34.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 320
					cell35 = row.createCell(35);
					if (record. getR0230_expaccf_bank_nonresi() != null) { 
					 cell35.setCellValue(record. getR0230_expaccf_bank_nonresi().doubleValue());
					 cell35.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell35.setCellValue("");
					    cell35.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 330
					cell36 = row.createCell(36);
					if (record. getR0230_expbccf_gov_resi() != null) { 
					 cell36.setCellValue(record. getR0230_expbccf_gov_resi().doubleValue());
					 cell36.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell36.setCellValue("");
					    cell36.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 340
					cell37 = row.createCell(37);
					if (record. getR0230_expaccf_gov_resi() != null) { 
					 cell37.setCellValue(record. getR0230_expaccf_gov_resi().doubleValue());
					 cell37.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell37.setCellValue("");
					    cell37.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 350
					cell38 = row.createCell(38);
					if (record. getR0230_expbccf_gov_nonresi() != null) { 
					 cell38.setCellValue(record.getR0230_expbccf_gov_nonresi().doubleValue());
					 cell38.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell38.setCellValue("");
					    cell38.setCellStyle(textStyle); // Still text style even when empty
					}
					
					//row 230
					//column 360
					cell39 = row.createCell(39);
					if (record. getR0230_expaccf_gov_nonresi() != null) { 
					 cell39.setCellValue(record.getR0230_expaccf_gov_nonresi().doubleValue());
					 cell39.setCellStyle(numberStyle); // Use text style for string data
					} else {
					    cell39.setCellValue("");
					    cell39.setCellStyle(textStyle); // Still text style even when empty
					}
					
				}
				workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
			} 
			else {
				
			}
			workbook.write(out);

			logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

			return out.toByteArray();
		}
	}
	
	public byte[] getBRF5_17DetailExcel(String filename, String fromdate, String todate) {
	    try {
	        logger.info("Generating Excel for BRF5_17 Details...");
	        System.out.println("came to Detail download service");

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("BRF5_17Details");

	        // Common border style
	        BorderStyle border = BorderStyle.THIN;

	        // Header style (left aligned)
	        CellStyle headerStyle = workbook.createCellStyle();
	        Font headerFont = workbook.createFont();
	        headerFont.setBold(true);
	        headerFont.setFontHeightInPoints((short) 10);
	        headerStyle.setFont(headerFont);
	        headerStyle.setAlignment(HorizontalAlignment.LEFT);
	        headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
	        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        headerStyle.setBorderTop(border);
	        headerStyle.setBorderBottom(border);
	        headerStyle.setBorderLeft(border);
	        headerStyle.setBorderRight(border);

	        // Right-aligned header style for ACCT BALANCE
	        CellStyle rightAlignedHeaderStyle = workbook.createCellStyle();
	        rightAlignedHeaderStyle.cloneStyleFrom(headerStyle);
	        rightAlignedHeaderStyle.setAlignment(HorizontalAlignment.RIGHT);

	        // Default data style (left aligned)
	        CellStyle dataStyle = workbook.createCellStyle();
	        dataStyle.setAlignment(HorizontalAlignment.LEFT);
	        dataStyle.setBorderTop(border);
	        dataStyle.setBorderBottom(border);
	        dataStyle.setBorderLeft(border);
	        dataStyle.setBorderRight(border);

	        // ACCT BALANCE style (right aligned with 3 decimals)
	        CellStyle balanceStyle = workbook.createCellStyle();
	        balanceStyle.setAlignment(HorizontalAlignment.RIGHT);
	        balanceStyle.setDataFormat(workbook.createDataFormat().getFormat("0.00"));
	        balanceStyle.setBorderTop(border);
	        balanceStyle.setBorderBottom(border);
	        balanceStyle.setBorderLeft(border);
	        balanceStyle.setBorderRight(border);

	        // Header row
	        String[] headers = {
	            "CUST ID", "ACCT NO", "ACCT NAME", "ACCT BALANCE", "ROWID", "COLUMNID", "REPORT_DATE"
	        };

	        XSSFRow headerRow = sheet.createRow(0);
	        for (int i = 0; i < headers.length; i++) {
	            Cell cell = headerRow.createCell(i);
	            cell.setCellValue(headers[i]);

	            if (i == 3) { // ACCT BALANCE
	                cell.setCellStyle(rightAlignedHeaderStyle);
	            } else {
	                cell.setCellStyle(headerStyle);
	            }

	            sheet.setColumnWidth(i, 5000);
	        }

	        // Get data
	        Date parsedToDate = new SimpleDateFormat("dd/MM/yyyy").parse(todate);
	        List<CBUAE_BRF5_17_DETAIL_ENTITY> reportData = BRF5_17_DETAIL_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (CBUAE_BRF5_17_DETAIL_ENTITY item : reportData) {
	                XSSFRow row = sheet.createRow(rowIndex++);

	                row.createCell(0).setCellValue(item.getCust_id());
	                row.createCell(1).setCellValue(item.getAcct_number());
	                row.createCell(2).setCellValue(item.getAcct_name());

	                // ACCT BALANCE (right aligned, 3 decimal places)
	                Cell balanceCell = row.createCell(3);
	                if (item.getExposure_amount()!= null) {
	                    balanceCell.setCellValue(item.getExposure_amount().doubleValue());
	                } else {
	                    balanceCell.setCellValue(0.00);
	                }
	                balanceCell.setCellStyle(balanceStyle);

	                row.createCell(4).setCellValue(item.getRow_id());
	                row.createCell(5).setCellValue(item.getColumn_id());
	                row.createCell(6).setCellValue(
	                    item.getReport_date() != null ?
	                    new SimpleDateFormat("dd-MM-yyyy").format(item.getReport_date()) : ""
	                );

	                // Apply data style for all other cells
	                for (int j = 0; j < 7; j++) {
	                    if (j != 3) {
	                        row.getCell(j).setCellStyle(dataStyle);
	                    }
	                }
	            }
	        } else {
	            logger.info("No data found for BRF5_17 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating BRF5_17 Excel", e);
	        return new byte[0];
	    }
	}
}








