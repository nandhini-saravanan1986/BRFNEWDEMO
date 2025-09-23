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

import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.M_FXR_Summary_Entity1;
import com.bornfire.brf.entities.M_FXR_Summary_Entity2;
import com.bornfire.brf.entities.M_FXR_Summary_Entity3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity3;
//import com.bornfire.brf.entities.M_FXR_Summary_Entity4;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo3;
//import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo4;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Summary_Repo;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Summary_Entity;
import java.lang.reflect.Method;
import java.math.BigDecimal;


@Component
@Service
public class BRRS_M_FXR_ReportService {


	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SFINP2_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AuditService auditService;
	@Autowired
	
	BRRS_M_SFINP2_Detail_Repo M_SFINP2_DETAIL_Repo;

	@Autowired
	BRRS_M_FXR_Summary_Repo1	BRRS_M_FXR_Summary_Repo1;
				
	@Autowired
	BRRS_M_FXR_Summary_Repo2	BRRS_M_FXR_Summary_Repo2;
	@Autowired
	BRRS_M_FXR_Summary_Repo3	BRRS_M_FXR_Summary_Repo3;
//	@Autowired
//	BRRS_M_FXR_Summary_Repo4	BRRS_M_FXR_Summary_Repo4;
	
	@Autowired
	BRRS_M_SFINP2_Summary_Repo M_SFINP2_Summary_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Detail_Repo M_SFINP2_Archival_Detail_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Summary_Repo M_SFINP2_Archival_Summary_Repo;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_FXRView(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<M_SFINP2_Archival_Summary_Entity> T1Master = new ArrayList<M_SFINP2_Archival_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_SFINP2_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_FXR_Summary_Entity1> T1Master = new ArrayList<M_FXR_Summary_Entity1>();
			List<M_FXR_Summary_Entity2> T2Master = new ArrayList<M_FXR_Summary_Entity2>();
			List<M_FXR_Summary_Entity3> T3Master = new ArrayList<M_FXR_Summary_Entity3>();
//			List<M_FXR_Summary_Entity4> T4Master = new ArrayList<M_FXR_Summary_Entity4>();
			
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = BRRS_M_FXR_Summary_Repo1.getdatabydateList(dateformat.parse(todate));
				T2Master = BRRS_M_FXR_Summary_Repo2.getdatabydateList(dateformat.parse(todate));
				T3Master = BRRS_M_FXR_Summary_Repo3.getdatabydateList(dateformat.parse(todate));
//				T4Master = BRRS_M_FXR_Summary_Repo4.getdatabydateList(dateformat.parse(todate));
				
				
				
				System.out.println("Size of t1master is :"+T1Master.size());
				
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary1", T1Master);
			mv.addObject("reportsummary2", T2Master);
			mv.addObject("reportsummary3", T3Master);
//			mv.addObject("reportsummary4", T4Master);
		}

		
		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_FXR");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	
	
	public void updateReport1(M_FXR_Summary_Entity1 updatedEntity) {
	    System.out.println("Came to services1");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity1 existing = BRRS_M_FXR_Summary_Repo1.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));

	    try {
	        // 1️⃣ Loop from R11 to R16 and copy fields
	        for (int i = 11; i <= 16; i++) {
	            String prefix = "R" + i + "_";

	            String[] fields = { "currency", "net_spot_position", "net_forward_position", "guarantees",
	                                "net_future_inc_or_exp", "net_delta_wei_fx_opt_posi", "other_items",
	                                "net_long_position", "or", "net_short_position" };

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity1.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity1.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // 2️⃣ Handle R17 totals
	        String[] totalFields = { "net_long_position", "net_short_position" };
	        for (String field : totalFields) {
	            String getterName = "getR17_" + field;
	            String setterName = "setR17_" + field;

	            try {
	                Method getter = M_FXR_Summary_Entity1.class.getMethod(getterName);
	                Method setter = M_FXR_Summary_Entity1.class.getMethod(setterName, getter.getReturnType());

	                Object newValue = getter.invoke(updatedEntity);
	                setter.invoke(existing, newValue);

	            } catch (NoSuchMethodException e) {
	                // Skip if not present
	                continue;
	            }
	        }

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo1.save(existing);
	}

	public void updateReport2(M_FXR_Summary_Entity2 updatedEntity) {
	    System.out.println("Came to services2");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity2 existing = BRRS_M_FXR_Summary_Repo2.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));

	    try {
	        // 1️⃣ Loop from R11 to R50 and copy fields
	        for (int i = 21; i <= 22; i++) {
	            String prefix = "R" + i + "_";

	            String[] fields = { "long", "short" };

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	            String[] formulaFields = { "total_gross_long_short", "net_position" };
	            for (String field : formulaFields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    continue;
	                }
	            }
	        }

	        // 2️⃣ Handle R23 totals
	            String getterName = "getR23_net_position";
	            String setterName = "setR23_net_position";

	            try {
	                Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                Object newValue = getter.invoke(updatedEntity);
	                setter.invoke(existing, newValue);

	            } catch (NoSuchMethodException e) {
	                // Skip if not present
	                //continue;
	            }
	        

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo2.save(existing);
	}

	public void updateReport3(M_FXR_Summary_Entity3 updatedEntity) {
	    System.out.println("Came to services3");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity3 existing = BRRS_M_FXR_Summary_Repo3.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));


	    try {

	            String[] fields = {"greater_net_long_or_short", "abs_value_net_gold_posi", "capital_require", "capital_charge"};

	            for (String field : fields) {
	                String getterName = "getR29_" + field;
	                String setterName = "setR29_" + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity3.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity3.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	    
	    }catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo3.save(existing);
}


	public byte[] getM_FXRExcel(String filename, String reportId, String fromdate, String todate, String currency,
									 String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelM_FXRARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data

		List<M_FXR_Summary_Entity1> dataList1 =BRRS_M_FXR_Summary_Repo1.getdatabydateList(dateformat.parse(todate)) ;

		List<M_FXR_Summary_Entity2> dataList2 =BRRS_M_FXR_Summary_Repo2.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList1.isEmpty() || dataList2.isEmpty()) {
			logger.warn("Service: No data found for M_FXR report. Returning empty result.");
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

			if (!dataList1.isEmpty() || !dataList2.isEmpty()) {
			    for (int i = 0; i < dataList1.size(); i++) {
			        M_FXR_Summary_Entity1 record1 = dataList1.get(i);
			        System.out.println("rownumber=" + (startRow + i));
			        for (int i = 0; i < dataList2.size(); i++) {
				        M_FXR_Summary_Entity2 record2 = dataList2.get(i);
				        System.out.println("rownumber=" + (startRow + i));

			        Row row;
			        Cell cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell10;
			        CellStyle originalStyle;

			        // ===== Row 11 / Col B =====
			        row = sheet.getRow(10);
			        cell1 = row.getCell(1);
			        if (cell1 == null) cell1 = row.createCell(1);
			        originalStyle = cell1.getCellStyle();
			        if (record1.getR11_currency() != null) cell1.setCellValue(record1.getR11_currency().doubleValue());
			        else cell1.setCellValue("");
			        cell1.setCellStyle(originalStyle);

			        // ===== Row 11 / Col D =====
			        row = sheet.getRow(10);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR11_amount_2() != null) cell4.setCellValue(record.getR11_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 13 / Col C =====
			        row = sheet.getRow(12);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR13_amount_1() != null) cell3.setCellValue(record.getR13_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 14 / Col C =====
			        row = sheet.getRow(13);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR14_amount_1() != null) cell3.setCellValue(record.getR14_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 15 / Col C =====
			        row = sheet.getRow(14);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR15_amount_1() != null) cell3.setCellValue(record.getR15_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 16 / Col C =====
			        row = sheet.getRow(15);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR16_amount_1() != null) cell3.setCellValue(record.getR16_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 18 / Col C =====
			        row = sheet.getRow(17);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR18_amount_1() != null) cell3.setCellValue(record.getR18_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 19 / Col C =====
			        row = sheet.getRow(18);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR19_amount_1() != null) cell3.setCellValue(record.getR19_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 20 / Col C =====
			        row = sheet.getRow(19);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR20_amount_1() != null) cell3.setCellValue(record.getR20_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 21 / Col C =====
			        row = sheet.getRow(20);
			        cell3 = row.getCell(2);
			        if (cell3 == null) cell3 = row.createCell(2);
			        originalStyle = cell3.getCellStyle();
			        if (record.getR21_amount_1() != null) cell3.setCellValue(record.getR21_amount_1().doubleValue());
			        else cell3.setCellValue("");
			        cell3.setCellStyle(originalStyle);

			        // ===== Row 22 / Col D =====
			        row = sheet.getRow(21);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR22_amount_2() != null) cell4.setCellValue(record.getR22_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 23 / Col D =====
			        row = sheet.getRow(22);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR23_amount_2() != null) cell4.setCellValue(record.getR23_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 24 / Col D =====
			        row = sheet.getRow(23);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR24_amount_2() != null) cell4.setCellValue(record.getR24_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 25 / Col D =====
			        row = sheet.getRow(24);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR25_amount_2() != null) cell4.setCellValue(record.getR25_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 31 / Col D =====
			        row = sheet.getRow(30);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR31_amount_2() != null) cell4.setCellValue(record.getR31_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 32 / Col D =====
			        row = sheet.getRow(31);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR32_amount_2() != null) cell4.setCellValue(record.getR32_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 33 / Col D =====
			        row = sheet.getRow(32);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR33_amount_2() != null) cell4.setCellValue(record.getR33_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 34 / Col D =====
			        row = sheet.getRow(33);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR34_amount_2() != null) cell4.setCellValue(record.getR34_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 41 / Col D =====
			        row = sheet.getRow(40);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR41_amount_2() != null) cell4.setCellValue(record.getR41_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 42 / Col D =====
			        row = sheet.getRow(41);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR42_amount_2() != null) cell4.setCellValue(record.getR42_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 43 / Col D =====
			        row = sheet.getRow(42);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR43_amount_2() != null) cell4.setCellValue(record.getR43_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 44 / Col D =====
			        row = sheet.getRow(43);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR44_amount_2() != null) cell4.setCellValue(record.getR44_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 45 / Col D =====
			        row = sheet.getRow(44);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR45_amount_2() != null) cell4.setCellValue(record.getR45_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 46 / Col D =====
			        row = sheet.getRow(45);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR46_amount_2() != null) cell4.setCellValue(record.getR46_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);

			        // ===== Row 47 / Col D =====
			        row = sheet.getRow(46);
			        cell4 = row.getCell(3);
			        if (cell4 == null) cell4 = row.createCell(3);
			        originalStyle = cell4.getCellStyle();
			        if (record.getR47_amount_2() != null) cell4.setCellValue(record.getR47_amount_2().doubleValue());
			        else cell4.setCellValue("");
			        cell4.setCellStyle(originalStyle);
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
	

	    
