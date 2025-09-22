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
import java.util.Objects;
import java.util.stream.Collectors;

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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bornfire.brf.controllers.CBUAE_BRF_ReportsController;

import com.bornfire.brf.entities.M_SFINP1_Archival_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SFINP1_Archival_Detail_Repo;
import com.bornfire.brf.entities.M_SFINP1_Archival_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_SFINP1_Archival_Summary_Repo;
import com.bornfire.brf.entities.M_SFINP1_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SFINP1_Detail_Repo;
import com.bornfire.brf.entities.M_SFINP1_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SFINP1_Summary_Repo;

@Component
@Service


public class BRRS_M_SFINP1_ReportService {
private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SFINP1_ReportService.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	BRRS_M_SFINP1_Detail_Repo BRRS_M_SFINP1_Detail_Repo;
	
	@Autowired
	BRRS_M_SFINP1_Summary_Repo BRRS_M_SFINP1_Summary_Repo;
	
	@Autowired
	BRRS_M_SFINP1_Archival_Detail_Repo BRRS_M_SFINP1_Archival_Detail_Repo;

	@Autowired
	BRRS_M_SFINP1_Archival_Summary_Repo BRRS_M_SFINP1_Archival_Summary_Repo;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getM_SFINP1View(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		System.out.println("testing");
		System.out.println(version);

		if (type.equals("ARCHIVAL") & version != null) {
			System.out.println(type);
			List<M_SFINP1_Archival_Summary_Entity> T1Master = new ArrayList<M_SFINP1_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = BRRS_M_SFINP1_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {		

		List<M_SFINP1_Summary_Entity> T1Master = new ArrayList<M_SFINP1_Summary_Entity>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRRS_M_SFINP1_Summary_Repo.getdatabydateList(dateformat.parse(todate));
			 
		
		} catch (ParseException e) {
			e.printStackTrace();
		}	
			mv.addObject("reportsummary", T1Master);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRRS/M_SFINP1");
		
		//mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;
		}
		public ModelAndView getM_SFINP1currentDtl(String reportId, String fromdate, String todate, String currency,
				  String dtltype, Pageable pageable, String Filter, String type, String version) {

		int pageSize = pageable != null ? pageable.getPageSize() : 10;
		int currentPage = pageable != null ? pageable.getPageNumber() : 0;
		int totalPages = 0;

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();

		try {
			Date parsedDate = null;
			if (todate != null && !todate.isEmpty()) {
				parsedDate = dateformat.parse(todate);
			}

			String rowId = null;
			String columnId = null;

			// ✅ Split filter string into rowId & columnId
			if (Filter != null && Filter.contains(",")) {
				String[] parts = Filter.split(",");
				if (parts.length >= 2) {
					rowId = parts[0];
					columnId = parts[1];
				}
			}
			System.out.println(type);
			if ("ARCHIVAL".equals(type) && version != null) {
				System.out.println(type);
				// 🔹 Archival branch
				List<M_SFINP1_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = BRRS_M_SFINP1_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
				} else {
					T1Dt1 = BRRS_M_SFINP1_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
				// 🔹 Current branch
				List<M_SFINP1_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = BRRS_M_SFINP1_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
				} else {
					T1Dt1 = BRRS_M_SFINP1_Detail_Repo.getdatabydateList(parsedDate, currentPage, pageSize);
					totalPages = BRRS_M_SFINP1_Detail_Repo.getdatacount(parsedDate);
					mv.addObject("pagination", "YES");
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("LISTCOUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));
			}

		} catch (ParseException e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Invalid date format: " + todate);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Unexpected error: " + e.getMessage());
		}

		// ✅ Common attributes
		mv.setViewName("BRRS/M_SFINP1");
		mv.addObject("displaymode", "Details");
		mv.addObject("currentPage", currentPage);
		System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
		mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);

		return mv;
	}


	public byte[] getM_SFINP1Excel(String filename, String reportId, String fromdate, String todate, String currency,
									 String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelM_SFINP1ARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data

		List<M_SFINP1_Summary_Entity> dataList =BRRS_M_SFINP1_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_SFINP1 report. Returning empty result.");
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
					M_SFINP1_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
										
					
					Cell cellC, cellD;
					CellStyle originalStyle;

					// ===== Row 10 / Col C =====
					row = sheet.getRow(9);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR10_month_end() != null) cellC.setCellValue(record.getR10_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 10 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR10_average() != null) cellD.setCellValue(record.getR10_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 11 / Col C =====
					row = sheet.getRow(10);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR11_month_end() != null) cellC.setCellValue(record.getR11_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 11 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR11_average() != null) cellD.setCellValue(record.getR11_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 13 / Col C =====
					row = sheet.getRow(12);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR13_month_end() != null) cellC.setCellValue(record.getR13_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 13 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR13_average() != null) cellD.setCellValue(record.getR13_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 14 / Col C =====
					row = sheet.getRow(13);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR14_month_end() != null) cellC.setCellValue(record.getR14_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 14 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR14_average() != null) cellD.setCellValue(record.getR14_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 15 / Col C =====
					row = sheet.getRow(14);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR15_month_end() != null) cellC.setCellValue(record.getR15_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 15 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR15_average() != null) cellD.setCellValue(record.getR15_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 16 / Col C =====
					row = sheet.getRow(15);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR16_month_end() != null) cellC.setCellValue(record.getR16_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 16 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR16_average() != null) cellD.setCellValue(record.getR16_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 17 / Col C =====
					row = sheet.getRow(16);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR17_month_end() != null) cellC.setCellValue(record.getR17_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 17 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR17_average() != null) cellD.setCellValue(record.getR17_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 18 / Col C =====
					row = sheet.getRow(17);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR18_month_end() != null) cellC.setCellValue(record.getR18_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 18 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR18_average() != null) cellD.setCellValue(record.getR18_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 19 / Col C =====
					row = sheet.getRow(18);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR19_month_end() != null) cellC.setCellValue(record.getR19_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 19 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR19_average() != null) cellD.setCellValue(record.getR19_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 22 / Col C =====
					row = sheet.getRow(21);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR22_month_end() != null) cellC.setCellValue(record.getR22_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 22 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR22_average() != null) cellD.setCellValue(record.getR22_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 23 / Col C =====
					row = sheet.getRow(22);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR23_month_end() != null) cellC.setCellValue(record.getR23_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 23 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR23_average() != null) cellD.setCellValue(record.getR23_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 25 / Col C =====
					row = sheet.getRow(24);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR25_month_end() != null) cellC.setCellValue(record.getR25_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 25 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR25_average() != null) cellD.setCellValue(record.getR25_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 26 / Col C =====
					row = sheet.getRow(25);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR26_month_end() != null) cellC.setCellValue(record.getR26_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 26 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR26_average() != null) cellD.setCellValue(record.getR26_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 28 / Col C =====
					row = sheet.getRow(27);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR28_month_end() != null) cellC.setCellValue(record.getR28_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 28 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR28_average() != null) cellD.setCellValue(record.getR28_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 29 / Col C =====
					row = sheet.getRow(28);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR29_month_end() != null) cellC.setCellValue(record.getR29_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 29 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR29_average() != null) cellD.setCellValue(record.getR29_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 30 / Col C =====
					row = sheet.getRow(29);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR30_month_end() != null) cellC.setCellValue(record.getR30_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 30 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR30_average() != null) cellD.setCellValue(record.getR30_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 32 / Col C =====
					row = sheet.getRow(31);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR32_month_end() != null) cellC.setCellValue(record.getR32_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 32 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR32_average() != null) cellD.setCellValue(record.getR32_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 33 / Col C =====
					row = sheet.getRow(32);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR33_month_end() != null) cellC.setCellValue(record.getR33_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 33 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR33_average() != null) cellD.setCellValue(record.getR33_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 34 / Col C =====
					row = sheet.getRow(33);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR34_month_end() != null) cellC.setCellValue(record.getR34_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 34 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR34_average() != null) cellD.setCellValue(record.getR34_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 36 / Col C =====
					row = sheet.getRow(35);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR36_month_end() != null) cellC.setCellValue(record.getR36_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 36 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR36_average() != null) cellD.setCellValue(record.getR36_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 37 / Col C =====
					row = sheet.getRow(36);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR37_month_end() != null) cellC.setCellValue(record.getR37_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 37 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR37_average() != null) cellD.setCellValue(record.getR37_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 39 / Col C =====
					row = sheet.getRow(38);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR39_month_end() != null) cellC.setCellValue(record.getR39_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 39 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR39_average() != null) cellD.setCellValue(record.getR39_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 41 / Col C =====
					row = sheet.getRow(40);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR41_month_end() != null) cellC.setCellValue(record.getR41_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 41 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR41_average() != null) cellD.setCellValue(record.getR41_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 42 / Col C =====
					row = sheet.getRow(41);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR42_month_end() != null) cellC.setCellValue(record.getR42_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 42 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR42_average() != null) cellD.setCellValue(record.getR42_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 43 / Col C =====
					row = sheet.getRow(42);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR43_month_end() != null) cellC.setCellValue(record.getR43_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 43 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR43_average() != null) cellD.setCellValue(record.getR43_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 45 / Col C =====
					row = sheet.getRow(44);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR45_month_end() != null) cellC.setCellValue(record.getR45_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 45 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR45_average() != null) cellD.setCellValue(record.getR45_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 46 / Col C =====
					row = sheet.getRow(45);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR46_month_end() != null) cellC.setCellValue(record.getR46_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 46 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR46_average() != null) cellD.setCellValue(record.getR46_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 47 / Col C =====
					row = sheet.getRow(46);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR47_month_end() != null) cellC.setCellValue(record.getR47_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 47 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR47_average() != null) cellD.setCellValue(record.getR47_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 48 / Col C =====
					row = sheet.getRow(47);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR48_month_end() != null) cellC.setCellValue(record.getR48_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 48 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR48_average() != null) cellD.setCellValue(record.getR48_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 50 / Col C =====
					row = sheet.getRow(49);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR50_month_end() != null) cellC.setCellValue(record.getR50_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 50 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR50_average() != null) cellD.setCellValue(record.getR50_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 51 / Col C =====
					row = sheet.getRow(50);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR51_month_end() != null) cellC.setCellValue(record.getR51_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 51 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR51_average() != null) cellD.setCellValue(record.getR51_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 52 / Col C =====
					row = sheet.getRow(51);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR52_month_end() != null) cellC.setCellValue(record.getR52_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 52 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR52_average() != null) cellD.setCellValue(record.getR52_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 53 / Col C =====
					row = sheet.getRow(52);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR53_month_end() != null) cellC.setCellValue(record.getR53_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 53 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR53_average() != null) cellD.setCellValue(record.getR53_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 54 / Col C =====
					row = sheet.getRow(53);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR54_month_end() != null) cellC.setCellValue(record.getR54_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 54 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR54_average() != null) cellD.setCellValue(record.getR54_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 55 / Col C =====
					row = sheet.getRow(54);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR55_month_end() != null) cellC.setCellValue(record.getR55_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 55 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR55_average() != null) cellD.setCellValue(record.getR55_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 57 / Col C =====
					row = sheet.getRow(56);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR57_month_end() != null) cellC.setCellValue(record.getR57_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 57 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR57_average() != null) cellD.setCellValue(record.getR57_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 58 / Col C =====
					row = sheet.getRow(57);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR58_month_end() != null) cellC.setCellValue(record.getR58_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 58 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR58_average() != null) cellD.setCellValue(record.getR58_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 59 / Col C =====
					row = sheet.getRow(58);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR59_month_end() != null) cellC.setCellValue(record.getR59_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 59 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR59_average() != null) cellD.setCellValue(record.getR59_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 60 / Col C =====
					row = sheet.getRow(59);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR60_month_end() != null) cellC.setCellValue(record.getR60_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 60 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR60_average() != null) cellD.setCellValue(record.getR60_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);



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

	public byte[] getM_SFINP1DetailExcel(String filename, String fromdate, String todate, String currency,
										   String dtltype, String type, String version) {
	    try {
	        logger.info("Generating Excel for M_SFINP1 Details...");
	        System.out.println("came to Detail download service");

			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("M_SFINP1Details");

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
	        List<M_SFINP1_Detail_Entity> reportData = BRRS_M_SFINP1_Detail_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (M_SFINP1_Detail_Entity item : reportData) {
	                XSSFRow row = sheet.createRow(rowIndex++);

	                row.createCell(0).setCellValue(item.getCustId());
	                row.createCell(1).setCellValue(item.getAcctNumber());
	                row.createCell(2).setCellValue(item.getAcctName());

	                // ACCT BALANCE (right aligned, 3 decimal places)
	                Cell balanceCell = row.createCell(3);
	                if (item.getAcctBalanceInPula() != null) {
	                    balanceCell.setCellValue(item.getAcctBalanceInPula().doubleValue());
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
	            logger.info("No data found for M_SFINP1 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating M_SFINP1 Excel", e);
	        return new byte[0];
	    }
	}

public List<Object> getM_SFINP1Archival() {
		List<Object> M_SFINP1Archivallist = new ArrayList<>();
		try {
			M_SFINP1Archivallist = BRRS_M_SFINP1_Archival_Summary_Repo.getM_SFINP1archival();
			System.out.println("countser" + M_SFINP1Archivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_SFINP1 Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_SFINP1Archivallist;
	}

	public byte[] getExcelM_SFINP1ARCHIVAL(String filename, String reportId, String fromdate, String todate,
										   String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_SFINP1_Archival_Summary_Entity> dataList = BRRS_M_SFINP1_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_SFINP1 report. Returning empty result.");
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
			font.setFontHeightInPoints((short) 8); // size 8
			font.setFontName("Arial");

			CellStyle numberStyle = workbook.createCellStyle();
			// numberStyle.setDataFormat(createHelper.createDataFormat().getFormat("0.000"));
			numberStyle.setBorderBottom(BorderStyle.THIN);
			numberStyle.setBorderTop(BorderStyle.THIN);
			numberStyle.setBorderLeft(BorderStyle.THIN);
			numberStyle.setBorderRight(BorderStyle.THIN);
			numberStyle.setFont(font);
			// --- End of Style Definitions ---
	int startRow = 9;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					M_SFINP1_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
				
					Cell cellC, cellD;
					CellStyle originalStyle;

					// ===== Row 10 / Col C =====
					row = sheet.getRow(9);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR10_month_end() != null) cellC.setCellValue(record.getR10_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 10 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR10_average() != null) cellD.setCellValue(record.getR10_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 11 / Col C =====
					row = sheet.getRow(10);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR11_month_end() != null) cellC.setCellValue(record.getR11_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 11 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR11_average() != null) cellD.setCellValue(record.getR11_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 13 / Col C =====
					row = sheet.getRow(12);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR13_month_end() != null) cellC.setCellValue(record.getR13_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 13 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR13_average() != null) cellD.setCellValue(record.getR13_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 14 / Col C =====
					row = sheet.getRow(13);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR14_month_end() != null) cellC.setCellValue(record.getR14_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 14 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR14_average() != null) cellD.setCellValue(record.getR14_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 15 / Col C =====
					row = sheet.getRow(14);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR15_month_end() != null) cellC.setCellValue(record.getR15_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 15 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR15_average() != null) cellD.setCellValue(record.getR15_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 16 / Col C =====
					row = sheet.getRow(15);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR16_month_end() != null) cellC.setCellValue(record.getR16_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 16 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR16_average() != null) cellD.setCellValue(record.getR16_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 17 / Col C =====
					row = sheet.getRow(16);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR17_month_end() != null) cellC.setCellValue(record.getR17_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 17 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR17_average() != null) cellD.setCellValue(record.getR17_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 18 / Col C =====
					row = sheet.getRow(17);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR18_month_end() != null) cellC.setCellValue(record.getR18_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 18 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR18_average() != null) cellD.setCellValue(record.getR18_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 19 / Col C =====
					row = sheet.getRow(18);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR19_month_end() != null) cellC.setCellValue(record.getR19_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 19 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR19_average() != null) cellD.setCellValue(record.getR19_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 22 / Col C =====
					row = sheet.getRow(21);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR22_month_end() != null) cellC.setCellValue(record.getR22_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 22 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR22_average() != null) cellD.setCellValue(record.getR22_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 23 / Col C =====
					row = sheet.getRow(22);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR23_month_end() != null) cellC.setCellValue(record.getR23_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 23 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR23_average() != null) cellD.setCellValue(record.getR23_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 25 / Col C =====
					row = sheet.getRow(24);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR25_month_end() != null) cellC.setCellValue(record.getR25_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 25 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR25_average() != null) cellD.setCellValue(record.getR25_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 26 / Col C =====
					row = sheet.getRow(25);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR26_month_end() != null) cellC.setCellValue(record.getR26_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 26 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR26_average() != null) cellD.setCellValue(record.getR26_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 28 / Col C =====
					row = sheet.getRow(27);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR28_month_end() != null) cellC.setCellValue(record.getR28_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 28 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR28_average() != null) cellD.setCellValue(record.getR28_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 29 / Col C =====
					row = sheet.getRow(28);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR29_month_end() != null) cellC.setCellValue(record.getR29_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 29 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR29_average() != null) cellD.setCellValue(record.getR29_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 30 / Col C =====
					row = sheet.getRow(29);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR30_month_end() != null) cellC.setCellValue(record.getR30_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 30 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR30_average() != null) cellD.setCellValue(record.getR30_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 32 / Col C =====
					row = sheet.getRow(31);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR32_month_end() != null) cellC.setCellValue(record.getR32_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 32 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR32_average() != null) cellD.setCellValue(record.getR32_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 33 / Col C =====
					row = sheet.getRow(32);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR33_month_end() != null) cellC.setCellValue(record.getR33_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 33 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR33_average() != null) cellD.setCellValue(record.getR33_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 34 / Col C =====
					row = sheet.getRow(33);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR34_month_end() != null) cellC.setCellValue(record.getR34_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 34 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR34_average() != null) cellD.setCellValue(record.getR34_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 36 / Col C =====
					row = sheet.getRow(35);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR36_month_end() != null) cellC.setCellValue(record.getR36_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 36 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR36_average() != null) cellD.setCellValue(record.getR36_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 37 / Col C =====
					row = sheet.getRow(36);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR37_month_end() != null) cellC.setCellValue(record.getR37_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 37 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR37_average() != null) cellD.setCellValue(record.getR37_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 39 / Col C =====
					row = sheet.getRow(38);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR39_month_end() != null) cellC.setCellValue(record.getR39_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 39 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR39_average() != null) cellD.setCellValue(record.getR39_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 41 / Col C =====
					row = sheet.getRow(40);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR41_month_end() != null) cellC.setCellValue(record.getR41_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 41 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR41_average() != null) cellD.setCellValue(record.getR41_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 42 / Col C =====
					row = sheet.getRow(41);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR42_month_end() != null) cellC.setCellValue(record.getR42_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 42 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR42_average() != null) cellD.setCellValue(record.getR42_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 43 / Col C =====
					row = sheet.getRow(42);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR43_month_end() != null) cellC.setCellValue(record.getR43_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 43 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR43_average() != null) cellD.setCellValue(record.getR43_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 45 / Col C =====
					row = sheet.getRow(44);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR45_month_end() != null) cellC.setCellValue(record.getR45_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 45 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR45_average() != null) cellD.setCellValue(record.getR45_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 46 / Col C =====
					row = sheet.getRow(45);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR46_month_end() != null) cellC.setCellValue(record.getR46_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 46 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR46_average() != null) cellD.setCellValue(record.getR46_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 47 / Col C =====
					row = sheet.getRow(46);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR47_month_end() != null) cellC.setCellValue(record.getR47_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 47 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR47_average() != null) cellD.setCellValue(record.getR47_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 48 / Col C =====
					row = sheet.getRow(47);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR48_month_end() != null) cellC.setCellValue(record.getR48_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 48 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR48_average() != null) cellD.setCellValue(record.getR48_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 50 / Col C =====
					row = sheet.getRow(49);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR50_month_end() != null) cellC.setCellValue(record.getR50_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 50 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR50_average() != null) cellD.setCellValue(record.getR50_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 51 / Col C =====
					row = sheet.getRow(50);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR51_month_end() != null) cellC.setCellValue(record.getR51_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 51 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR51_average() != null) cellD.setCellValue(record.getR51_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 52 / Col C =====
					row = sheet.getRow(51);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR52_month_end() != null) cellC.setCellValue(record.getR52_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 52 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR52_average() != null) cellD.setCellValue(record.getR52_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 53 / Col C =====
					row = sheet.getRow(52);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR53_month_end() != null) cellC.setCellValue(record.getR53_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 53 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR53_average() != null) cellD.setCellValue(record.getR53_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 54 / Col C =====
					row = sheet.getRow(53);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR54_month_end() != null) cellC.setCellValue(record.getR54_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 54 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR54_average() != null) cellD.setCellValue(record.getR54_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 55 / Col C =====
					row = sheet.getRow(54);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR55_month_end() != null) cellC.setCellValue(record.getR55_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 55 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR55_average() != null) cellD.setCellValue(record.getR55_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 57 / Col C =====
					row = sheet.getRow(56);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR57_month_end() != null) cellC.setCellValue(record.getR57_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 57 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR57_average() != null) cellD.setCellValue(record.getR57_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 58 / Col C =====
					row = sheet.getRow(57);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR58_month_end() != null) cellC.setCellValue(record.getR58_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 58 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR58_average() != null) cellD.setCellValue(record.getR58_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 59 / Col C =====
					row = sheet.getRow(58);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR59_month_end() != null) cellC.setCellValue(record.getR59_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 59 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR59_average() != null) cellD.setCellValue(record.getR59_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);

					// ===== Row 60 / Col C =====
					row = sheet.getRow(59);
					cellC = row.getCell(2);
					if (cellC == null) cellC = row.createCell(2);
					originalStyle = cellC.getCellStyle();
					if (record.getR60_month_end() != null) cellC.setCellValue(record.getR60_month_end().doubleValue());
					else cellC.setCellValue("");
					cellC.setCellStyle(originalStyle);

					// ===== Row 60 / Col D =====
					cellD = row.getCell(3);
					if (cellD == null) cellD = row.createCell(3);
					originalStyle = cellD.getCellStyle();
					if (record.getR60_average() != null) cellD.setCellValue(record.getR60_average().doubleValue());
					else cellD.setCellValue("");
					cellD.setCellStyle(originalStyle);



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

public byte[] getDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
										 String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for BRRS_M_SFINP1 ARCHIVAL Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {

			}
 XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("M_SFINP1Details");

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
	     			List<M_SFINP1_Archival_Detail_Entity> reportData = BRRS_M_SFINP1_Archival_Detail_Repo
	     					.getdatabydateList(parsedToDate, version);

	     			if (reportData != null && !reportData.isEmpty()) {
	     				int rowIndex = 1;
	     				for (M_SFINP1_Archival_Detail_Entity item : reportData) {
	     					XSSFRow row = sheet.createRow(rowIndex++);

	     					row.createCell(0).setCellValue(item.getCustId());
	     					row.createCell(1).setCellValue(item.getAcctNumber());
	     					row.createCell(2).setCellValue(item.getAcctName());

	                // ACCT BALANCE (right aligned, 3 decimal places)
	                Cell balanceCell = row.createCell(3);
	                if (item.getAcctBalanceInPula() != null) {
	                    balanceCell.setCellValue(item.getAcctBalanceInPula().doubleValue());
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
	            logger.info("No data found for M_SFINP1 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating M_SFINP1 Excel", e);
	        return new byte[0];
	    }
	}

}

