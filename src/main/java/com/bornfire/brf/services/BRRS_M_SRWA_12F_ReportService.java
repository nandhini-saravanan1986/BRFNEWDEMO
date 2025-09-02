package com.bornfire.brf.services;

import java.io.ByteArrayOutputStream;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

import com.bornfire.brf.entities.M_SRWA_12F_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SRWA_12F_Detail_Repo;
import com.bornfire.brf.entities.M_SRWA_12F_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_SRWA_12F_Summary_Repo;

import java.math.BigDecimal;

@Component
@Service

public class BRRS_M_SRWA_12F_ReportService {
private static final Logger logger = LoggerFactory.getLogger(BRRS_M_CA6_ReportService.class);
	


	@Autowired
	private Environment env;
	
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Autowired
	BRRS_M_SRWA_12F_Detail_Repo M_SRWA_12F_DETAIL_Repo;
	

	
	@Autowired
	BRRS_M_SRWA_12F_Summary_Repo M_SRWA_12F_Summary_Repo;
	


	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getM_SRWA_12FView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<M_SRWA_12F_Summary_Entity> T1Master = new ArrayList<M_SRWA_12F_Summary_Entity>();
		

		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=M_SRWA_12F_Summary_Repo.getdatabydateList(dateformat.parse(todate));
			 

		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRRS/M_SRWA_12F");
		
		mv.addObject("reportsummary", T1Master);

		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;
		

	}
	
		
	
	public ModelAndView getM_SRWA_12FcurrentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int totalPages=0;
		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<M_SRWA_12F_Detail_Entity> T1Dt1 = new ArrayList<M_SRWA_12F_Detail_Entity>();
		
		try {
			Date d1 = dateformat.parse(todate);
			String rowId = null;
	        String columnId = null;
	        if (filter != null && filter.contains(",")) {
	            String[] parts = filter.split(",");
	            if (parts.length >= 2) {
	                rowId = parts[0];
	                columnId = parts[1];
	            }
	        }

	        if (rowId != null && columnId != null) { 
	        	System.out.println("Testing");
	        	T1Dt1=M_SRWA_12F_DETAIL_Repo.getdatabydateListrow(dateformat.parse(todate),columnId,rowId);

	        	
	        } else {
	        		
				T1Dt1 = M_SRWA_12F_DETAIL_Repo.getdatabydateList(d1,currentPage,pageSize);
				totalPages=M_SRWA_12F_DETAIL_Repo.getdatacount(dateformat.parse(todate));
				mv.addObject("pagination","YES");
				
	        }

		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());

		mv.setViewName("BRRS/M_SRWA_12F");
		mv.addObject("currentPage", currentPage);
		mv.addObject("totalPages",(int)Math.ceil((double)totalPages / 100));
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
	
	

public byte[] BRRS_M_SRWA_12FExcel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
	logger.info("Service: Starting Excel generation process in memory.");

	List<M_SRWA_12F_Summary_Entity> dataList =M_SRWA_12F_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;
	
	
	if (dataList.isEmpty()) {
		logger.warn("Service: No data found for BRRS report. Returning empty result.");
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

		int startRow = 10;
		
		if (!dataList.isEmpty()) {
			for (int i = 0; i < dataList.size(); i++) {
				
				M_SRWA_12F_Summary_Entity record = dataList.get(i);
				System.out.println("rownumber="+startRow + i);
				Row row = sheet.getRow(startRow + i);
				if (row == null) {
					row = sheet.createRow(startRow + i);
				}


				//row11
				// Column E
				Cell cell4 = row.createCell(4);
				if (record.getR11_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR11_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row11
				// Column F
				Cell cell5 = row.createCell(5);
				if (record.getR11_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR11_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				
				//row12
				row = sheet.getRow(11);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR12_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR12_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row12
				// Column F
				cell5 = row.createCell(5);
				if (record.getR12_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR12_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row13
				row = sheet.getRow(12);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR13_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR13_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row13
				// Column F
				cell5 = row.createCell(5);
				if (record.getR13_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR13_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row14
				row = sheet.getRow(13);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR14_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR14_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row14
				// Column F
				cell5 = row.createCell(5);
				if (record.getR14_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR14_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row15
				row = sheet.getRow(14);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR15_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR15_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row15
				// Column F
				cell5 = row.createCell(5);
				if (record.getR15_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR15_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row16
				row = sheet.getRow(15);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR16_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR16_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row16
				// Column F
				cell5 = row.createCell(5);
				if (record.getR16_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR16_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row17
				row = sheet.getRow(16);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR17_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR17_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row17
				// Column F
				cell5 = row.createCell(5);
				if (record.getR17_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR17_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				//row18
				row = sheet.getRow(17);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR18_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR18_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row18
				// Column F
				cell5 = row.createCell(5);
				if (record.getR18_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR18_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row19
				row = sheet.getRow(18);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR19_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR19_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row19
				// Column F
				cell5 = row.createCell(5);
				if (record.getR19_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR19_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row20
				row = sheet.getRow(19);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR20_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR20_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row20
				// Column F
				cell5 = row.createCell(5);
				if (record.getR20_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR20_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row21
				row = sheet.getRow(20);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR21_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR21_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row21
				// Column F
				cell5 = row.createCell(5);
				if (record.getR21_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR21_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				//row22
				row = sheet.getRow(21);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR22_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR22_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row22
				// Column F
				cell5 = row.createCell(5);
				if (record.getR22_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR22_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				//row23
				row = sheet.getRow(22);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR23_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR23_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row23
				// Column F
				cell5 = row.createCell(5);
				if (record.getR23_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR23_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row24
				row = sheet.getRow(23);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR24_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR24_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row24
				// Column F
				cell5 = row.createCell(5);
				if (record.getR24_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR24_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row25
				row = sheet.getRow(24);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR25_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR25_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row25
				// Column F
				cell5 = row.createCell(5);
				if (record.getR25_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR25_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row26
				row = sheet.getRow(25);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR26_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR26_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row26
				// Column F
				cell5 = row.createCell(5);
				if (record.getR26_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR26_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row27
				row = sheet.getRow(26);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR27_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR27_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row27
				// Column F
				cell5 = row.createCell(5);
				if (record.getR27_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR27_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row28
				row = sheet.getRow(27);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR28_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR28_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row28
				// Column F
				cell5 = row.createCell(5);
				if (record.getR28_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR28_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row29
				row = sheet.getRow(28);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR29_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR29_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row29
				// Column F
				cell5 = row.createCell(5);
				if (record.getR29_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR29_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row30
				row = sheet.getRow(29);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR30_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR30_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row30
				// Column F
				cell5 = row.createCell(5);
				if (record.getR30_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR30_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				//row31
				row = sheet.getRow(30);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR31_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR31_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row31
				// Column F
				cell5 = row.createCell(5);
				if (record.getR31_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR31_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row32
				row = sheet.getRow(31);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR32_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR32_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row32
				// Column F
				cell5 = row.createCell(5);
				if (record.getR32_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR32_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row33
				row = sheet.getRow(32);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR33_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR33_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row33
				// Column F
				cell5 = row.createCell(5);
				if (record.getR33_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR33_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row34
				row = sheet.getRow(33);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR34_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR34_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row34
				// Column F
				cell5 = row.createCell(5);
				if (record.getR34_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR34_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row35
				row = sheet.getRow(34);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR35_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR35_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row35
				// Column F
				cell5 = row.createCell(5);
				if (record.getR35_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR35_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				//row36
				row = sheet.getRow(35);
				// Column E
				cell4 = row.createCell(4);
				if (record.getR36_EXPOSURE_AMT () != null) {
					cell4.setCellValue(record.getR36_EXPOSURE_AMT ().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				
				
				//row36
				// Column F
				cell5 = row.createCell(5);
				if (record.getR36_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR36_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}

				
				//row37
				// Column F
				cell5 = row.createCell(5);
				if (record.getR37_RISK_WEIGHT() != null) {
					cell5.setCellValue(record.getR37_RISK_WEIGHT().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
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

public byte[] BRRS_M_SRWA_12FDetailExcel(String filename, String fromdate, String todate) {
    try {
        logger.info("Generating Excel for BRRS_M_CA6 Details...");
        System.out.println("came to Detail download service");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("BRRS_M_SWRA_12FDetails");

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
        balanceStyle.setDataFormat(workbook.createDataFormat().getFormat("0.000"));
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
        List<M_SRWA_12F_Detail_Entity> reportData = M_SRWA_12F_DETAIL_Repo.getdatabydateList(parsedToDate);

        if (reportData != null && !reportData.isEmpty()) {
            int rowIndex = 1;
            for (M_SRWA_12F_Detail_Entity item : reportData) {
                XSSFRow row = sheet.createRow(rowIndex++);

                row.createCell(0).setCellValue(item.getCustId());
                row.createCell(1).setCellValue(item.getAcctNumber());
                row.createCell(2).setCellValue(item.getAcctName());

                // ACCT BALANCE (right aligned, 3 decimal places)
                Cell balanceCell = row.createCell(3);
                if (item.getAcctBalanceInpula() != null) {
                    balanceCell.setCellValue(item.getAcctBalanceInpula().doubleValue());
                } else {
                    balanceCell.setCellValue(0.000);
                }
                balanceCell.setCellStyle(balanceStyle);

                row.createCell(4).setCellValue(item.getRowId());
                row.createCell(5).setCellValue(item.getColumnId());
                row.createCell(6).setCellValue(
                    item.getReportDate() != null ?
                    new SimpleDateFormat("dd-MM-yyyy").format(item.getReportDate()) : ""
                );

                // Apply data style for all other cells
                for (int j = 0; j < 7; j++) {
                    if (j != 3) {
                        row.getCell(j).setCellStyle(dataStyle);
                    }
                }
            }
        } else {
            logger.info("No data found for BRRS_M_SRWA_12F — only header will be written.");
        }

        // Write to byte[]
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        workbook.write(bos);
        workbook.close();

        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
        return bos.toByteArray();

    } catch (Exception e) {
        logger.error("Error generating BRRS_M_SRWA_12F Excel", e);
        return new byte[0];
    }
}



}

	
