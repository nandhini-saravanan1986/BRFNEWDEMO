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

import com.bornfire.brf.entities.BRRS_M_OR2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_OR2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_OR2_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_OR2_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_17_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_17_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_17_SUMMARY_Repo;
import com.bornfire.brf.entities.M_OR2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_OR2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_OR2_Detail_Entity;
import com.bornfire.brf.entities.M_OR2_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Summary_Entity;

@Component
@Service
public class BRRS_M_OR2_ReportService {
	
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_OR2_ReportService.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	BRRS_M_OR2_Detail_Repo M_OR2_Detail_Repo;
	
	@Autowired
	BRRS_M_OR2_Summary_Repo M_OR2_Summary_Repo; 
	
	@Autowired
	BRRS_M_OR2_Archival_Detail_Repo M_OR2_Archival_Detail_Repo;
	
	@Autowired
	BRRS_M_OR2_Archival_Summary_Repo M_OR2_Archival_Summary_Repo; 

	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getBRRS_M_OR2view(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	
		
		System.out.println("testing");
		System.out.println(version);

		
		if (type.equals("ARCHIVAL") & version != null) {
			System.out.println(type);
			List<M_OR2_Archival_Summary_Entity> T1Master = new ArrayList<M_OR2_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_OR2_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_OR2_Summary_Entity> T1Master = new ArrayList<M_OR2_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_OR2_Summary_Repo.getdatabydateList(dateformat.parse(todate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_OR2");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	
	public ModelAndView getM_OR2currentDtl(
	        String reportId, String fromdate, String todate, String currency,
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
				List<M_OR2_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					//T1Dt1 = M_OR2_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
					
					T1Dt1 = M_OR2_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
				} else {
					T1Dt1 = M_OR2_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
				// 🔹 Current branch
				List<M_OR2_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = M_OR2_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
				} else {
					T1Dt1 = M_OR2_Detail_Repo.getdatabydateList(parsedDate, currentPage, pageSize);
					totalPages = M_OR2_Detail_Repo.getdatacount(parsedDate);
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
		mv.setViewName("BRRS/M_OR2");
		mv.addObject("displaymode", "Details");
		mv.addObject("currentPage", currentPage);
		System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
		mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);

		return mv;
	}
	
	public byte[] getBRRS_M_OR2Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory."); 
		
		
		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelM_OR2ARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		} 

		List<M_OR2_Summary_Entity> dataList =M_OR2_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRRSM_OR2 report. Returning empty result.");
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
					M_OR2_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
					//row12
					// Column D 
					Cell cell4 = row.createCell(3);
					if (record.getR12_corporate_finance() != null) {
						cell4.setCellValue(record.getR12_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row12
					// Column E 
					Cell cell5 = row.createCell(4);
					if (record.getR12_trading_and_sales() != null) {
						cell5.setCellValue(record.getR12_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					} 
					
					
					//row12
					// Column F
					Cell cell6 = row.createCell(5);
					if (record.getR12_retail_banking() != null) {
						cell6.setCellValue(record.getR12_retail_banking().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					//row12
					// Column G
					Cell cell7 = row.createCell(6);
					if (record.getR12_commercial_banking()  != null) {
						cell7.setCellValue(record.getR12_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
					//row12
					// Column H
					Cell cell8 = row.createCell(7);
					if (record.getR12_payments_and_settlements()  != null) {
						cell8.setCellValue(record.getR12_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					//row12
					// Column I
					Cell cell9 = row.createCell(8);
					if (record.getR12_agency_services() != null) {
						cell9.setCellValue(record.getR12_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					//row12
					// Column J
					Cell cell10 = row.createCell(9);
					if (record.getR12_asset_management()  != null) {
						cell10.setCellValue(record.getR12_asset_management() .doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
					//row12
					// Column K
					Cell cell11 = row.createCell(10);
					if (record.getR12_retail_brokerage() != null) {
						cell11.setCellValue(record.getR12_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row13
					row = sheet.getRow(12);
					
					// Column D
					 cell4 = row.createCell(3);
					if (record.getR13_corporate_finance() != null) {
						cell4.setCellValue(record.getR13_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR13_trading_and_sales() != null) {
						cell5.setCellValue(record.getR13_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR13_retail_banking()  != null) {
						cell6.setCellValue(record.getR13_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR13_commercial_banking() != null) {
						cell7.setCellValue(record.getR13_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR13_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR13_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR13_agency_services() != null) {
						cell9.setCellValue(record.getR13_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR13_asset_management() != null) {
						cell10.setCellValue(record.getR13_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR13_retail_brokerage() != null) {
						cell11.setCellValue(record.getR13_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					
					
					//row14
					row = sheet.getRow(13);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR14_corporate_finance() != null) {
						cell4.setCellValue(record.getR14_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR14_trading_and_sales() != null) {
						cell5.setCellValue(record.getR14_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR14_retail_banking()  != null) {
						cell6.setCellValue(record.getR14_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR14_commercial_banking() != null) {
						cell7.setCellValue(record.getR14_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR14_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR14_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR14_agency_services() != null) {
						cell9.setCellValue(record.getR14_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR14_asset_management() != null) {
						cell10.setCellValue(record.getR14_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR14_retail_brokerage() != null) {
						cell11.setCellValue(record.getR14_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row15
					row = sheet.getRow(14);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR15_corporate_finance() != null) {
						cell4.setCellValue(record.getR15_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR15_trading_and_sales() != null) {
						cell5.setCellValue(record.getR15_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR15_retail_banking()  != null) {
						cell6.setCellValue(record.getR15_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR15_commercial_banking() != null) {
						cell7.setCellValue(record.getR15_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR15_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR15_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR15_agency_services() != null) {
						cell9.setCellValue(record.getR15_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR15_asset_management() != null) {
						cell10.setCellValue(record.getR15_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR15_retail_brokerage() != null) {
						cell11.setCellValue(record.getR15_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row16
					row = sheet.getRow(15);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR16_corporate_finance() != null) {
						cell4.setCellValue(record.getR16_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR16_trading_and_sales() != null) {
						cell5.setCellValue(record.getR16_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR16_retail_banking()  != null) {
						cell6.setCellValue(record.getR16_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR16_commercial_banking() != null) {
						cell7.setCellValue(record.getR16_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR16_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR16_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR16_agency_services() != null) {
						cell9.setCellValue(record.getR16_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR16_asset_management() != null) {
						cell10.setCellValue(record.getR16_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR16_retail_brokerage() != null) {
						cell11.setCellValue(record.getR16_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row17
					row = sheet.getRow(16);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR17_corporate_finance() != null) {
						cell4.setCellValue(record.getR17_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR17_trading_and_sales() != null) {
						cell5.setCellValue(record.getR17_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR17_retail_banking()  != null) {
						cell6.setCellValue(record.getR17_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR17_commercial_banking() != null) {
						cell7.setCellValue(record.getR17_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR17_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR17_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR17_agency_services() != null) {
						cell9.setCellValue(record.getR17_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR17_asset_management() != null) {
						cell10.setCellValue(record.getR17_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR17_retail_brokerage() != null) {
						cell11.setCellValue(record.getR17_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row18
					row = sheet.getRow(17);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR18_corporate_finance() != null) {
						cell4.setCellValue(record.getR18_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR18_trading_and_sales() != null) {
						cell5.setCellValue(record.getR18_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR18_retail_banking()  != null) {
						cell6.setCellValue(record.getR18_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR18_commercial_banking() != null) {
						cell7.setCellValue(record.getR18_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR18_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR18_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR18_agency_services() != null) {
						cell9.setCellValue(record.getR18_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR18_asset_management() != null) {
						cell10.setCellValue(record.getR18_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR18_retail_brokerage() != null) {
						cell11.setCellValue(record.getR18_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row19
					row = sheet.getRow(18);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR19_corporate_finance() != null) {
						cell4.setCellValue(record.getR19_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR19_trading_and_sales() != null) {
						cell5.setCellValue(record.getR19_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR19_retail_banking()  != null) {
						cell6.setCellValue(record.getR19_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR19_commercial_banking() != null) {
						cell7.setCellValue(record.getR19_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR19_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR19_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR19_agency_services() != null) {
						cell9.setCellValue(record.getR19_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR19_asset_management() != null) {
						cell10.setCellValue(record.getR19_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR19_retail_brokerage() != null) {
						cell11.setCellValue(record.getR19_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row20
					row = sheet.getRow(19);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR20_corporate_finance() != null) {
						cell4.setCellValue(record.getR20_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR20_trading_and_sales() != null) {
						cell5.setCellValue(record.getR20_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR20_retail_banking()  != null) {
						cell6.setCellValue(record.getR20_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR20_commercial_banking() != null) {
						cell7.setCellValue(record.getR20_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR20_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR20_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR20_agency_services() != null) {
						cell9.setCellValue(record.getR20_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR20_asset_management() != null) {
						cell10.setCellValue(record.getR20_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR20_retail_brokerage() != null) {
						cell11.setCellValue(record.getR20_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row21
					row = sheet.getRow(20);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR21_corporate_finance() != null) {
						cell4.setCellValue(record.getR21_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR21_trading_and_sales() != null) {
						cell5.setCellValue(record.getR21_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR21_retail_banking()  != null) {
						cell6.setCellValue(record.getR21_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR21_commercial_banking() != null) {
						cell7.setCellValue(record.getR21_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR21_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR21_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR21_agency_services() != null) {
						cell9.setCellValue(record.getR21_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR21_asset_management() != null) {
						cell10.setCellValue(record.getR21_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR21_retail_brokerage() != null) {
						cell11.setCellValue(record.getR21_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row22
					row = sheet.getRow(21);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR22_corporate_finance() != null) {
						cell4.setCellValue(record.getR22_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR22_trading_and_sales() != null) {
						cell5.setCellValue(record.getR22_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR22_retail_banking()  != null) {
						cell6.setCellValue(record.getR22_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR22_commercial_banking() != null) {
						cell7.setCellValue(record.getR22_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR22_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR22_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR22_agency_services() != null) {
						cell9.setCellValue(record.getR22_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR22_asset_management() != null) {
						cell10.setCellValue(record.getR22_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR22_retail_brokerage() != null) {
						cell11.setCellValue(record.getR22_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row23
					row = sheet.getRow(22);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR23_corporate_finance() != null) {
						cell4.setCellValue(record.getR23_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR23_trading_and_sales() != null) {
						cell5.setCellValue(record.getR23_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR23_retail_banking()  != null) {
						cell6.setCellValue(record.getR23_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR23_commercial_banking() != null) {
						cell7.setCellValue(record.getR23_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR23_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR23_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR23_agency_services() != null) {
						cell9.setCellValue(record.getR23_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR23_asset_management() != null) {
						cell10.setCellValue(record.getR23_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR23_retail_brokerage() != null) {
						cell11.setCellValue(record.getR23_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row28
					row = sheet.getRow(27);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR28_corporate_finance() != null) {
						cell4.setCellValue(record.getR28_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR28_trading_and_sales() != null) {
						cell5.setCellValue(record.getR28_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR28_retail_banking()  != null) {
						cell6.setCellValue(record.getR28_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR28_commercial_banking() != null) {
						cell7.setCellValue(record.getR28_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR28_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR28_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR28_agency_services() != null) {
						cell9.setCellValue(record.getR28_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR28_asset_management() != null) {
						cell10.setCellValue(record.getR28_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR28_retail_brokerage() != null) {
						cell11.setCellValue(record.getR28_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row29
					row = sheet.getRow(28);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR29_corporate_finance() != null) {
						cell4.setCellValue(record.getR29_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR29_trading_and_sales() != null) {
						cell5.setCellValue(record.getR29_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR29_retail_banking()  != null) {
						cell6.setCellValue(record.getR29_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR29_commercial_banking() != null) {
						cell7.setCellValue(record.getR29_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR29_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR29_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR29_agency_services() != null) {
						cell9.setCellValue(record.getR29_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR29_asset_management() != null) {
						cell10.setCellValue(record.getR29_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR29_retail_brokerage() != null) {
						cell11.setCellValue(record.getR29_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row30
					row = sheet.getRow(29);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR30_corporate_finance() != null) {
						cell4.setCellValue(record.getR30_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR30_trading_and_sales() != null) {
						cell5.setCellValue(record.getR30_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR30_retail_banking()  != null) {
						cell6.setCellValue(record.getR30_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR30_commercial_banking() != null) {
						cell7.setCellValue(record.getR30_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR30_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR30_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR30_agency_services() != null) {
						cell9.setCellValue(record.getR30_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR30_asset_management() != null) {
						cell10.setCellValue(record.getR30_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR30_retail_brokerage() != null) {
						cell11.setCellValue(record.getR30_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row31
					row = sheet.getRow(30);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR31_corporate_finance() != null) {
						cell4.setCellValue(record.getR31_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR31_trading_and_sales() != null) {
						cell5.setCellValue(record.getR31_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR31_retail_banking()  != null) {
						cell6.setCellValue(record.getR31_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR31_commercial_banking() != null) {
						cell7.setCellValue(record.getR31_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR31_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR31_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR31_agency_services() != null) {
						cell9.setCellValue(record.getR31_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR31_asset_management() != null) {
						cell10.setCellValue(record.getR31_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR31_retail_brokerage() != null) {
						cell11.setCellValue(record.getR31_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row32
					row = sheet.getRow(31);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR32_corporate_finance() != null) {
						cell4.setCellValue(record.getR32_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR32_trading_and_sales() != null) {
						cell5.setCellValue(record.getR32_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR32_retail_banking()  != null) {
						cell6.setCellValue(record.getR32_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR32_commercial_banking() != null) {
						cell7.setCellValue(record.getR32_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR32_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR32_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR32_agency_services() != null) {
						cell9.setCellValue(record.getR32_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR32_asset_management() != null) {
						cell10.setCellValue(record.getR32_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR32_retail_brokerage() != null) {
						cell11.setCellValue(record.getR32_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row33
					row = sheet.getRow(32);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR33_corporate_finance() != null) {
						cell4.setCellValue(record.getR33_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR33_trading_and_sales() != null) {
						cell5.setCellValue(record.getR33_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR33_retail_banking()  != null) {
						cell6.setCellValue(record.getR33_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR33_commercial_banking() != null) {
						cell7.setCellValue(record.getR33_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR33_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR33_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR33_agency_services() != null) {
						cell9.setCellValue(record.getR33_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR33_asset_management() != null) {
						cell10.setCellValue(record.getR33_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR33_retail_brokerage() != null) {
						cell11.setCellValue(record.getR33_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row34
					row = sheet.getRow(33);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR34_corporate_finance() != null) {
						cell4.setCellValue(record.getR34_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR34_trading_and_sales() != null) {
						cell5.setCellValue(record.getR34_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR34_retail_banking()  != null) {
						cell6.setCellValue(record.getR34_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR34_commercial_banking() != null) {
						cell7.setCellValue(record.getR34_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR34_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR34_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR34_agency_services() != null) {
						cell9.setCellValue(record.getR34_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR34_asset_management() != null) {
						cell10.setCellValue(record.getR34_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR34_retail_brokerage() != null) {
						cell11.setCellValue(record.getR34_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row35
					row = sheet.getRow(34);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR35_corporate_finance() != null) {
						cell4.setCellValue(record.getR35_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR35_trading_and_sales() != null) {
						cell5.setCellValue(record.getR35_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR35_retail_banking()  != null) {
						cell6.setCellValue(record.getR35_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR35_commercial_banking() != null) {
						cell7.setCellValue(record.getR35_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR35_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR35_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR35_agency_services() != null) {
						cell9.setCellValue(record.getR35_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR35_asset_management() != null) {
						cell10.setCellValue(record.getR35_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR35_retail_brokerage() != null) {
						cell11.setCellValue(record.getR35_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row 36
					row = sheet.getRow(35);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR36_corporate_finance() != null) {
						cell4.setCellValue(record.getR36_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR36_trading_and_sales() != null) {
						cell5.setCellValue(record.getR36_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR36_retail_banking()  != null) {
						cell6.setCellValue(record.getR36_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR36_commercial_banking() != null) {
						cell7.setCellValue(record.getR36_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR36_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR36_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR36_agency_services() != null) {
						cell9.setCellValue(record.getR36_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR36_asset_management() != null) {
						cell10.setCellValue(record.getR36_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR36_retail_brokerage() != null) {
						cell11.setCellValue(record.getR36_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row37
					row = sheet.getRow(36);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR37_corporate_finance() != null) {
						cell4.setCellValue(record.getR37_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR37_trading_and_sales() != null) {
						cell5.setCellValue(record.getR37_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR37_retail_banking()  != null) {
						cell6.setCellValue(record.getR37_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR37_commercial_banking() != null) {
						cell7.setCellValue(record.getR37_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR37_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR37_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR37_agency_services() != null) {
						cell9.setCellValue(record.getR37_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR37_asset_management() != null) {
						cell10.setCellValue(record.getR37_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR37_retail_brokerage() != null) {
						cell11.setCellValue(record.getR37_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row38
					row = sheet.getRow(37);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR38_corporate_finance() != null) {
						cell4.setCellValue(record.getR38_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR38_trading_and_sales() != null) {
						cell5.setCellValue(record.getR38_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR38_retail_banking()  != null) {
						cell6.setCellValue(record.getR38_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR38_commercial_banking() != null) {
						cell7.setCellValue(record.getR38_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR38_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR38_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR38_agency_services() != null) {
						cell9.setCellValue(record.getR38_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR38_asset_management() != null) {
						cell10.setCellValue(record.getR38_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR38_retail_brokerage() != null) {
						cell11.setCellValue(record.getR38_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row 39
					row = sheet.getRow(38);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR39_corporate_finance() != null) {
						cell4.setCellValue(record.getR39_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR39_trading_and_sales() != null) {
						cell5.setCellValue(record.getR39_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR39_retail_banking()  != null) {
						cell6.setCellValue(record.getR39_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR39_commercial_banking() != null) {
						cell7.setCellValue(record.getR39_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR39_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR39_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR39_agency_services() != null) {
						cell9.setCellValue(record.getR39_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR39_asset_management() != null) {
						cell10.setCellValue(record.getR39_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR39_retail_brokerage() != null) {
						cell11.setCellValue(record.getR39_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row44
					row = sheet.getRow(43);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR44_corporate_finance() != null) {
						cell4.setCellValue(record.getR44_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR44_trading_and_sales() != null) {
						cell5.setCellValue(record.getR44_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR44_retail_banking()  != null) {
						cell6.setCellValue(record.getR44_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR44_commercial_banking() != null) {
						cell7.setCellValue(record.getR44_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR44_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR44_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR44_agency_services() != null) {
						cell9.setCellValue(record.getR44_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR44_asset_management() != null) {
						cell10.setCellValue(record.getR44_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR44_retail_brokerage() != null) {
						cell11.setCellValue(record.getR44_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row45
					row = sheet.getRow(44);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR45_corporate_finance() != null) {
						cell4.setCellValue(record.getR45_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR45_trading_and_sales() != null) {
						cell5.setCellValue(record.getR45_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR45_retail_banking()  != null) {
						cell6.setCellValue(record.getR45_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR45_commercial_banking() != null) {
						cell7.setCellValue(record.getR45_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR45_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR45_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR45_agency_services() != null) {
						cell9.setCellValue(record.getR45_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR45_asset_management() != null) {
						cell10.setCellValue(record.getR45_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR45_retail_brokerage() != null) {
						cell11.setCellValue(record.getR45_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row46
					row = sheet.getRow(45);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR46_corporate_finance() != null) {
						cell4.setCellValue(record.getR46_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR46_trading_and_sales() != null) {
						cell5.setCellValue(record.getR46_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR46_retail_banking()  != null) {
						cell6.setCellValue(record.getR46_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR46_commercial_banking() != null) {
						cell7.setCellValue(record.getR46_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR46_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR46_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR46_agency_services() != null) {
						cell9.setCellValue(record.getR46_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR46_asset_management() != null) {
						cell10.setCellValue(record.getR46_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR46_retail_brokerage() != null) {
						cell11.setCellValue(record.getR46_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row47
					row = sheet.getRow(46);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR47_corporate_finance() != null) {
						cell4.setCellValue(record.getR47_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR47_trading_and_sales() != null) {
						cell5.setCellValue(record.getR47_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR47_retail_banking()  != null) {
						cell6.setCellValue(record.getR47_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR47_commercial_banking() != null) {
						cell7.setCellValue(record.getR47_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR47_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR47_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR47_agency_services() != null) {
						cell9.setCellValue(record.getR47_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR47_asset_management() != null) {
						cell10.setCellValue(record.getR47_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR47_retail_brokerage() != null) {
						cell11.setCellValue(record.getR47_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row48
					row = sheet.getRow(47);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR48_corporate_finance() != null) {
						cell4.setCellValue(record.getR48_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR48_trading_and_sales() != null) {
						cell5.setCellValue(record.getR48_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR48_retail_banking()  != null) {
						cell6.setCellValue(record.getR48_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR48_commercial_banking() != null) {
						cell7.setCellValue(record.getR48_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR48_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR48_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR48_agency_services() != null) {
						cell9.setCellValue(record.getR48_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR48_asset_management() != null) {
						cell10.setCellValue(record.getR48_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR48_retail_brokerage() != null) {
						cell11.setCellValue(record.getR48_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row49
					row = sheet.getRow(48);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR49_corporate_finance() != null) {
						cell4.setCellValue(record.getR49_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR49_trading_and_sales() != null) {
						cell5.setCellValue(record.getR49_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR49_retail_banking()  != null) {
						cell6.setCellValue(record.getR49_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR49_commercial_banking() != null) {
						cell7.setCellValue(record.getR49_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR49_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR49_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR49_agency_services() != null) {
						cell9.setCellValue(record.getR49_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR49_asset_management() != null) {
						cell10.setCellValue(record.getR49_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR49_retail_brokerage() != null) {
						cell11.setCellValue(record.getR49_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row50
					row = sheet.getRow(49);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR50_corporate_finance() != null) {
						cell4.setCellValue(record.getR50_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR50_trading_and_sales() != null) {
						cell5.setCellValue(record.getR50_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR50_retail_banking()  != null) {
						cell6.setCellValue(record.getR50_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR50_commercial_banking() != null) {
						cell7.setCellValue(record.getR50_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR50_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR50_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR50_agency_services() != null) {
						cell9.setCellValue(record.getR50_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR50_asset_management() != null) {
						cell10.setCellValue(record.getR50_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR50_retail_brokerage() != null) {
						cell11.setCellValue(record.getR50_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row51
					row = sheet.getRow(50);
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR51_corporate_finance() != null) {
						cell4.setCellValue(record.getR51_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR51_trading_and_sales() != null) {
						cell5.setCellValue(record.getR51_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR51_retail_banking()  != null) {
						cell6.setCellValue(record.getR51_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR51_commercial_banking() != null) {
						cell7.setCellValue(record.getR51_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR51_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR51_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR51_agency_services() != null) {
						cell9.setCellValue(record.getR51_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR51_asset_management() != null) {
						cell10.setCellValue(record.getR51_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR51_retail_brokerage() != null) {
						cell11.setCellValue(record.getR51_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row52
					row = sheet.getRow(51);
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR52_corporate_finance() != null) {
						cell4.setCellValue(record.getR52_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR52_trading_and_sales() != null) {
						cell5.setCellValue(record.getR52_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR52_retail_banking()  != null) {
						cell6.setCellValue(record.getR52_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR52_commercial_banking() != null) {
						cell7.setCellValue(record.getR52_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR52_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR52_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR52_agency_services() != null) {
						cell9.setCellValue(record.getR52_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR52_asset_management() != null) {
						cell10.setCellValue(record.getR52_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR52_retail_brokerage() != null) {
						cell11.setCellValue(record.getR52_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row53
					row = sheet.getRow(52);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR53_corporate_finance() != null) {
						cell4.setCellValue(record.getR53_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR53_trading_and_sales() != null) {
						cell5.setCellValue(record.getR53_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR53_retail_banking()  != null) {
						cell6.setCellValue(record.getR53_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR53_commercial_banking() != null) {
						cell7.setCellValue(record.getR53_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR53_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR53_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR53_agency_services() != null) {
						cell9.setCellValue(record.getR53_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR53_asset_management() != null) {
						cell10.setCellValue(record.getR53_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR53_retail_brokerage() != null) {
						cell11.setCellValue(record.getR53_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row54
					row = sheet.getRow(53);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR54_corporate_finance() != null) {
						cell4.setCellValue(record.getR54_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR54_trading_and_sales() != null) {
						cell5.setCellValue(record.getR54_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR54_retail_banking()  != null) {
						cell6.setCellValue(record.getR54_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR54_commercial_banking() != null) {
						cell7.setCellValue(record.getR54_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR54_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR54_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR54_agency_services() != null) {
						cell9.setCellValue(record.getR54_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR54_asset_management() != null) {
						cell10.setCellValue(record.getR54_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR54_retail_brokerage() != null) {
						cell11.setCellValue(record.getR54_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row55
					row = sheet.getRow(54);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR55_corporate_finance() != null) {
						cell4.setCellValue(record.getR55_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR55_trading_and_sales() != null) {
						cell5.setCellValue(record.getR55_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR55_retail_banking()  != null) {
						cell6.setCellValue(record.getR55_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR55_commercial_banking() != null) {
						cell7.setCellValue(record.getR55_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR55_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR55_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR55_agency_services() != null) {
						cell9.setCellValue(record.getR55_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR55_asset_management() != null) {
						cell10.setCellValue(record.getR55_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR55_retail_brokerage() != null) {
						cell11.setCellValue(record.getR55_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					} 
										
				}
				workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
			} else {
				
			}
			workbook.write(out);

			logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

			return out.toByteArray();
		}
}
	public byte[] getBRRSM_OR2DetailExcel(String filename, String fromdate, String todate, String currency,
			   String dtltype, String type, String version) {
		 try {
		        logger.info("Generating Excel for BRRS_M_OR2 Details...");
		        System.out.println("This is also checking purpose...");
		        System.out.println("came to Detail download service");
		        
		        if (type.equals("ARCHIVAL") & version != null) {
					byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
							version);
					return ARCHIVALreport;
				}
		        
		        XSSFWorkbook workbook = new XSSFWorkbook();
		        XSSFSheet sheet = workbook.createSheet("BRRSM_OR2Details");
		        
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
		        List<M_OR2_Detail_Entity> reportData = M_OR2_Detail_Repo.getdatabydateList(parsedToDate);

		        if (reportData != null && !reportData.isEmpty()) {
		            int rowIndex = 1;
		            for (M_OR2_Detail_Entity item : reportData) {
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
		        logger.error("Error generating BRRSM_OR2 Excel", e);
		        return new byte[0];
		    }
	}
	
	public List<Object> getM_OR2Archival() {
		List<Object> M_OR2Archivallist = new ArrayList<>();
		try {
			M_OR2Archivallist = M_OR2_Archival_Summary_Repo.getM_OR2archival();
			System.out.println("countser" + M_OR2Archivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_OR2 Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_OR2Archivallist;
	}
	
	public byte[] getExcelM_OR2ARCHIVAL(String filename, String reportId, String fromdate, String todate,
			   String currency, String dtltype, String type, String version) throws Exception { 
		
		logger.info("Service: Starting Excel generation process in memory.");
		
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_OR2_Archival_Summary_Entity> dataList = M_OR2_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_OR2 report. Returning empty result.");
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
			
			int startRow = 11;
			
			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					M_OR2_Archival_Summary_Entity record = dataList.get(i);  
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
					//row12
					// Column D 
					Cell cell4 = row.createCell(3);
					if (record.getR12_corporate_finance() != null) {
						cell4.setCellValue(record.getR12_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row12
					// Column E 
					Cell cell5 = row.createCell(4);
					if (record.getR12_trading_and_sales() != null) {
						cell5.setCellValue(record.getR12_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					} 
					
					
					//row12
					// Column F
					Cell cell6 = row.createCell(5);
					if (record.getR12_retail_banking() != null) {
						cell6.setCellValue(record.getR12_retail_banking().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					//row12
					// Column G
					Cell cell7 = row.createCell(6);
					if (record.getR12_commercial_banking()  != null) {
						cell7.setCellValue(record.getR12_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
					//row12
					// Column H
					Cell cell8 = row.createCell(7);
					if (record.getR12_payments_and_settlements()  != null) {
						cell8.setCellValue(record.getR12_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					//row12
					// Column I
					Cell cell9 = row.createCell(8);
					if (record.getR12_agency_services() != null) {
						cell9.setCellValue(record.getR12_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					//row12
					// Column J
					Cell cell10 = row.createCell(9);
					if (record.getR12_asset_management()  != null) {
						cell10.setCellValue(record.getR12_asset_management() .doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
					//row12
					// Column K
					Cell cell11 = row.createCell(10);
					if (record.getR12_retail_brokerage() != null) {
						cell11.setCellValue(record.getR12_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row13
					row = sheet.getRow(12);
					
					// Column D
					 cell4 = row.createCell(3);
					if (record.getR13_corporate_finance() != null) {
						cell4.setCellValue(record.getR13_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR13_trading_and_sales() != null) {
						cell5.setCellValue(record.getR13_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR13_retail_banking()  != null) {
						cell6.setCellValue(record.getR13_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR13_commercial_banking() != null) {
						cell7.setCellValue(record.getR13_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR13_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR13_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR13_agency_services() != null) {
						cell9.setCellValue(record.getR13_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR13_asset_management() != null) {
						cell10.setCellValue(record.getR13_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR13_retail_brokerage() != null) {
						cell11.setCellValue(record.getR13_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					
					
					//row14
					row = sheet.getRow(13);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR14_corporate_finance() != null) {
						cell4.setCellValue(record.getR14_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR14_trading_and_sales() != null) {
						cell5.setCellValue(record.getR14_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR14_retail_banking()  != null) {
						cell6.setCellValue(record.getR14_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR14_commercial_banking() != null) {
						cell7.setCellValue(record.getR14_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR14_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR14_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR14_agency_services() != null) {
						cell9.setCellValue(record.getR14_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR14_asset_management() != null) {
						cell10.setCellValue(record.getR14_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR14_retail_brokerage() != null) {
						cell11.setCellValue(record.getR14_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row15
					row = sheet.getRow(14);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR15_corporate_finance() != null) {
						cell4.setCellValue(record.getR15_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR15_trading_and_sales() != null) {
						cell5.setCellValue(record.getR15_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR15_retail_banking()  != null) {
						cell6.setCellValue(record.getR15_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR15_commercial_banking() != null) {
						cell7.setCellValue(record.getR15_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR15_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR15_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR15_agency_services() != null) {
						cell9.setCellValue(record.getR15_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR15_asset_management() != null) {
						cell10.setCellValue(record.getR15_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR15_retail_brokerage() != null) {
						cell11.setCellValue(record.getR15_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row16
					row = sheet.getRow(15);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR16_corporate_finance() != null) {
						cell4.setCellValue(record.getR16_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR16_trading_and_sales() != null) {
						cell5.setCellValue(record.getR16_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR16_retail_banking()  != null) {
						cell6.setCellValue(record.getR16_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR16_commercial_banking() != null) {
						cell7.setCellValue(record.getR16_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR16_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR16_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR16_agency_services() != null) {
						cell9.setCellValue(record.getR16_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR16_asset_management() != null) {
						cell10.setCellValue(record.getR16_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR16_retail_brokerage() != null) {
						cell11.setCellValue(record.getR16_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row17
					row = sheet.getRow(16);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR17_corporate_finance() != null) {
						cell4.setCellValue(record.getR17_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR17_trading_and_sales() != null) {
						cell5.setCellValue(record.getR17_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR17_retail_banking()  != null) {
						cell6.setCellValue(record.getR17_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR17_commercial_banking() != null) {
						cell7.setCellValue(record.getR17_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR17_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR17_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR17_agency_services() != null) {
						cell9.setCellValue(record.getR17_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR17_asset_management() != null) {
						cell10.setCellValue(record.getR17_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR17_retail_brokerage() != null) {
						cell11.setCellValue(record.getR17_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row18
					row = sheet.getRow(17);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR18_corporate_finance() != null) {
						cell4.setCellValue(record.getR18_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR18_trading_and_sales() != null) {
						cell5.setCellValue(record.getR18_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR18_retail_banking()  != null) {
						cell6.setCellValue(record.getR18_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR18_commercial_banking() != null) {
						cell7.setCellValue(record.getR18_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR18_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR18_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR18_agency_services() != null) {
						cell9.setCellValue(record.getR18_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR18_asset_management() != null) {
						cell10.setCellValue(record.getR18_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR18_retail_brokerage() != null) {
						cell11.setCellValue(record.getR18_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row19
					row = sheet.getRow(18);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR19_corporate_finance() != null) {
						cell4.setCellValue(record.getR19_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR19_trading_and_sales() != null) {
						cell5.setCellValue(record.getR19_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR19_retail_banking()  != null) {
						cell6.setCellValue(record.getR19_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR19_commercial_banking() != null) {
						cell7.setCellValue(record.getR19_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR19_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR19_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR19_agency_services() != null) {
						cell9.setCellValue(record.getR19_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR19_asset_management() != null) {
						cell10.setCellValue(record.getR19_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR19_retail_brokerage() != null) {
						cell11.setCellValue(record.getR19_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row20
					row = sheet.getRow(19);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR20_corporate_finance() != null) {
						cell4.setCellValue(record.getR20_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR20_trading_and_sales() != null) {
						cell5.setCellValue(record.getR20_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR20_retail_banking()  != null) {
						cell6.setCellValue(record.getR20_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR20_commercial_banking() != null) {
						cell7.setCellValue(record.getR20_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR20_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR20_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR20_agency_services() != null) {
						cell9.setCellValue(record.getR20_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR20_asset_management() != null) {
						cell10.setCellValue(record.getR20_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR20_retail_brokerage() != null) {
						cell11.setCellValue(record.getR20_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row21
					row = sheet.getRow(20);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR21_corporate_finance() != null) {
						cell4.setCellValue(record.getR21_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR21_trading_and_sales() != null) {
						cell5.setCellValue(record.getR21_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR21_retail_banking()  != null) {
						cell6.setCellValue(record.getR21_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR21_commercial_banking() != null) {
						cell7.setCellValue(record.getR21_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR21_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR21_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR21_agency_services() != null) {
						cell9.setCellValue(record.getR21_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR21_asset_management() != null) {
						cell10.setCellValue(record.getR21_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR21_retail_brokerage() != null) {
						cell11.setCellValue(record.getR21_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row22
					row = sheet.getRow(21);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR22_corporate_finance() != null) {
						cell4.setCellValue(record.getR22_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR22_trading_and_sales() != null) {
						cell5.setCellValue(record.getR22_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR22_retail_banking()  != null) {
						cell6.setCellValue(record.getR22_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR22_commercial_banking() != null) {
						cell7.setCellValue(record.getR22_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR22_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR22_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR22_agency_services() != null) {
						cell9.setCellValue(record.getR22_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR22_asset_management() != null) {
						cell10.setCellValue(record.getR22_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR22_retail_brokerage() != null) {
						cell11.setCellValue(record.getR22_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row23
					row = sheet.getRow(22);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR23_corporate_finance() != null) {
						cell4.setCellValue(record.getR23_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR23_trading_and_sales() != null) {
						cell5.setCellValue(record.getR23_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR23_retail_banking()  != null) {
						cell6.setCellValue(record.getR23_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR23_commercial_banking() != null) {
						cell7.setCellValue(record.getR23_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR23_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR23_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR23_agency_services() != null) {
						cell9.setCellValue(record.getR23_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR23_asset_management() != null) {
						cell10.setCellValue(record.getR23_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR23_retail_brokerage() != null) {
						cell11.setCellValue(record.getR23_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row28
					row = sheet.getRow(27);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR28_corporate_finance() != null) {
						cell4.setCellValue(record.getR28_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR28_trading_and_sales() != null) {
						cell5.setCellValue(record.getR28_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR28_retail_banking()  != null) {
						cell6.setCellValue(record.getR28_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR28_commercial_banking() != null) {
						cell7.setCellValue(record.getR28_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR28_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR28_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR28_agency_services() != null) {
						cell9.setCellValue(record.getR28_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR28_asset_management() != null) {
						cell10.setCellValue(record.getR28_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR28_retail_brokerage() != null) {
						cell11.setCellValue(record.getR28_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row29
					row = sheet.getRow(28);
					
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR29_corporate_finance() != null) {
						cell4.setCellValue(record.getR29_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR29_trading_and_sales() != null) {
						cell5.setCellValue(record.getR29_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR29_retail_banking()  != null) {
						cell6.setCellValue(record.getR29_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR29_commercial_banking() != null) {
						cell7.setCellValue(record.getR29_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR29_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR29_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR29_agency_services() != null) {
						cell9.setCellValue(record.getR29_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR29_asset_management() != null) {
						cell10.setCellValue(record.getR29_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR29_retail_brokerage() != null) {
						cell11.setCellValue(record.getR29_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row30
					row = sheet.getRow(29);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR30_corporate_finance() != null) {
						cell4.setCellValue(record.getR30_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR30_trading_and_sales() != null) {
						cell5.setCellValue(record.getR30_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR30_retail_banking()  != null) {
						cell6.setCellValue(record.getR30_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR30_commercial_banking() != null) {
						cell7.setCellValue(record.getR30_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR30_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR30_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR30_agency_services() != null) {
						cell9.setCellValue(record.getR30_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR30_asset_management() != null) {
						cell10.setCellValue(record.getR30_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR30_retail_brokerage() != null) {
						cell11.setCellValue(record.getR30_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row31
					row = sheet.getRow(30);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR31_corporate_finance() != null) {
						cell4.setCellValue(record.getR31_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR31_trading_and_sales() != null) {
						cell5.setCellValue(record.getR31_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR31_retail_banking()  != null) {
						cell6.setCellValue(record.getR31_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR31_commercial_banking() != null) {
						cell7.setCellValue(record.getR31_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR31_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR31_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR31_agency_services() != null) {
						cell9.setCellValue(record.getR31_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR31_asset_management() != null) {
						cell10.setCellValue(record.getR31_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR31_retail_brokerage() != null) {
						cell11.setCellValue(record.getR31_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row32
					row = sheet.getRow(31);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR32_corporate_finance() != null) {
						cell4.setCellValue(record.getR32_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR32_trading_and_sales() != null) {
						cell5.setCellValue(record.getR32_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR32_retail_banking()  != null) {
						cell6.setCellValue(record.getR32_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR32_commercial_banking() != null) {
						cell7.setCellValue(record.getR32_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR32_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR32_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR32_agency_services() != null) {
						cell9.setCellValue(record.getR32_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR32_asset_management() != null) {
						cell10.setCellValue(record.getR32_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR32_retail_brokerage() != null) {
						cell11.setCellValue(record.getR32_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row33
					row = sheet.getRow(32);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR33_corporate_finance() != null) {
						cell4.setCellValue(record.getR33_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR33_trading_and_sales() != null) {
						cell5.setCellValue(record.getR33_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR33_retail_banking()  != null) {
						cell6.setCellValue(record.getR33_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR33_commercial_banking() != null) {
						cell7.setCellValue(record.getR33_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR33_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR33_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR33_agency_services() != null) {
						cell9.setCellValue(record.getR33_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR33_asset_management() != null) {
						cell10.setCellValue(record.getR33_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR33_retail_brokerage() != null) {
						cell11.setCellValue(record.getR33_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row34
					row = sheet.getRow(33);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR34_corporate_finance() != null) {
						cell4.setCellValue(record.getR34_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR34_trading_and_sales() != null) {
						cell5.setCellValue(record.getR34_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR34_retail_banking()  != null) {
						cell6.setCellValue(record.getR34_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR34_commercial_banking() != null) {
						cell7.setCellValue(record.getR34_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR34_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR34_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR34_agency_services() != null) {
						cell9.setCellValue(record.getR34_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR34_asset_management() != null) {
						cell10.setCellValue(record.getR34_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR34_retail_brokerage() != null) {
						cell11.setCellValue(record.getR34_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row35
					row = sheet.getRow(34);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR35_corporate_finance() != null) {
						cell4.setCellValue(record.getR35_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR35_trading_and_sales() != null) {
						cell5.setCellValue(record.getR35_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR35_retail_banking()  != null) {
						cell6.setCellValue(record.getR35_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR35_commercial_banking() != null) {
						cell7.setCellValue(record.getR35_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR35_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR35_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR35_agency_services() != null) {
						cell9.setCellValue(record.getR35_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR35_asset_management() != null) {
						cell10.setCellValue(record.getR35_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR35_retail_brokerage() != null) {
						cell11.setCellValue(record.getR35_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row 36
					row = sheet.getRow(35);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR36_corporate_finance() != null) {
						cell4.setCellValue(record.getR36_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR36_trading_and_sales() != null) {
						cell5.setCellValue(record.getR36_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR36_retail_banking()  != null) {
						cell6.setCellValue(record.getR36_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR36_commercial_banking() != null) {
						cell7.setCellValue(record.getR36_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR36_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR36_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR36_agency_services() != null) {
						cell9.setCellValue(record.getR36_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR36_asset_management() != null) {
						cell10.setCellValue(record.getR36_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR36_retail_brokerage() != null) {
						cell11.setCellValue(record.getR36_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row37
					row = sheet.getRow(36);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR37_corporate_finance() != null) {
						cell4.setCellValue(record.getR37_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR37_trading_and_sales() != null) {
						cell5.setCellValue(record.getR37_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR37_retail_banking()  != null) {
						cell6.setCellValue(record.getR37_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR37_commercial_banking() != null) {
						cell7.setCellValue(record.getR37_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR37_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR37_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR37_agency_services() != null) {
						cell9.setCellValue(record.getR37_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR37_asset_management() != null) {
						cell10.setCellValue(record.getR37_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR37_retail_brokerage() != null) {
						cell11.setCellValue(record.getR37_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row38
					row = sheet.getRow(37);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR38_corporate_finance() != null) {
						cell4.setCellValue(record.getR38_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR38_trading_and_sales() != null) {
						cell5.setCellValue(record.getR38_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR38_retail_banking()  != null) {
						cell6.setCellValue(record.getR38_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR38_commercial_banking() != null) {
						cell7.setCellValue(record.getR38_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR38_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR38_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR38_agency_services() != null) {
						cell9.setCellValue(record.getR38_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR38_asset_management() != null) {
						cell10.setCellValue(record.getR38_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR38_retail_brokerage() != null) {
						cell11.setCellValue(record.getR38_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row 39
					row = sheet.getRow(38);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR39_corporate_finance() != null) {
						cell4.setCellValue(record.getR39_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR39_trading_and_sales() != null) {
						cell5.setCellValue(record.getR39_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR39_retail_banking()  != null) {
						cell6.setCellValue(record.getR39_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR39_commercial_banking() != null) {
						cell7.setCellValue(record.getR39_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR39_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR39_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR39_agency_services() != null) {
						cell9.setCellValue(record.getR39_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR39_asset_management() != null) {
						cell10.setCellValue(record.getR39_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR39_retail_brokerage() != null) {
						cell11.setCellValue(record.getR39_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row44
					row = sheet.getRow(43);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR44_corporate_finance() != null) {
						cell4.setCellValue(record.getR44_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR44_trading_and_sales() != null) {
						cell5.setCellValue(record.getR44_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR44_retail_banking()  != null) {
						cell6.setCellValue(record.getR44_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR44_commercial_banking() != null) {
						cell7.setCellValue(record.getR44_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR44_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR44_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR44_agency_services() != null) {
						cell9.setCellValue(record.getR44_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR44_asset_management() != null) {
						cell10.setCellValue(record.getR44_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR44_retail_brokerage() != null) {
						cell11.setCellValue(record.getR44_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row45
					row = sheet.getRow(44);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR45_corporate_finance() != null) {
						cell4.setCellValue(record.getR45_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR45_trading_and_sales() != null) {
						cell5.setCellValue(record.getR45_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR45_retail_banking()  != null) {
						cell6.setCellValue(record.getR45_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR45_commercial_banking() != null) {
						cell7.setCellValue(record.getR45_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR45_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR45_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR45_agency_services() != null) {
						cell9.setCellValue(record.getR45_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR45_asset_management() != null) {
						cell10.setCellValue(record.getR45_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR45_retail_brokerage() != null) {
						cell11.setCellValue(record.getR45_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row46
					row = sheet.getRow(45);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR46_corporate_finance() != null) {
						cell4.setCellValue(record.getR46_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR46_trading_and_sales() != null) {
						cell5.setCellValue(record.getR46_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR46_retail_banking()  != null) {
						cell6.setCellValue(record.getR46_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR46_commercial_banking() != null) {
						cell7.setCellValue(record.getR46_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR46_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR46_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR46_agency_services() != null) {
						cell9.setCellValue(record.getR46_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR46_asset_management() != null) {
						cell10.setCellValue(record.getR46_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR46_retail_brokerage() != null) {
						cell11.setCellValue(record.getR46_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row47
					row = sheet.getRow(46);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR47_corporate_finance() != null) {
						cell4.setCellValue(record.getR47_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR47_trading_and_sales() != null) {
						cell5.setCellValue(record.getR47_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR47_retail_banking()  != null) {
						cell6.setCellValue(record.getR47_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR47_commercial_banking() != null) {
						cell7.setCellValue(record.getR47_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR47_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR47_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR47_agency_services() != null) {
						cell9.setCellValue(record.getR47_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR47_asset_management() != null) {
						cell10.setCellValue(record.getR47_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR47_retail_brokerage() != null) {
						cell11.setCellValue(record.getR47_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row48
					row = sheet.getRow(47);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR48_corporate_finance() != null) {
						cell4.setCellValue(record.getR48_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR48_trading_and_sales() != null) {
						cell5.setCellValue(record.getR48_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR48_retail_banking()  != null) {
						cell6.setCellValue(record.getR48_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR48_commercial_banking() != null) {
						cell7.setCellValue(record.getR48_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR48_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR48_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR48_agency_services() != null) {
						cell9.setCellValue(record.getR48_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR48_asset_management() != null) {
						cell10.setCellValue(record.getR48_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR48_retail_brokerage() != null) {
						cell11.setCellValue(record.getR48_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					
					//row49
					row = sheet.getRow(48);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR49_corporate_finance() != null) {
						cell4.setCellValue(record.getR49_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR49_trading_and_sales() != null) {
						cell5.setCellValue(record.getR49_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR49_retail_banking()  != null) {
						cell6.setCellValue(record.getR49_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR49_commercial_banking() != null) {
						cell7.setCellValue(record.getR49_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR49_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR49_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR49_agency_services() != null) {
						cell9.setCellValue(record.getR49_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR49_asset_management() != null) {
						cell10.setCellValue(record.getR49_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR49_retail_brokerage() != null) {
						cell11.setCellValue(record.getR49_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row50
					row = sheet.getRow(49);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR50_corporate_finance() != null) {
						cell4.setCellValue(record.getR50_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR50_trading_and_sales() != null) {
						cell5.setCellValue(record.getR50_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR50_retail_banking()  != null) {
						cell6.setCellValue(record.getR50_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR50_commercial_banking() != null) {
						cell7.setCellValue(record.getR50_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR50_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR50_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR50_agency_services() != null) {
						cell9.setCellValue(record.getR50_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR50_asset_management() != null) {
						cell10.setCellValue(record.getR50_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR50_retail_brokerage() != null) {
						cell11.setCellValue(record.getR50_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row51
					row = sheet.getRow(50);
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR51_corporate_finance() != null) {
						cell4.setCellValue(record.getR51_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR51_trading_and_sales() != null) {
						cell5.setCellValue(record.getR51_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR51_retail_banking()  != null) {
						cell6.setCellValue(record.getR51_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR51_commercial_banking() != null) {
						cell7.setCellValue(record.getR51_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR51_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR51_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR51_agency_services() != null) {
						cell9.setCellValue(record.getR51_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR51_asset_management() != null) {
						cell10.setCellValue(record.getR51_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR51_retail_brokerage() != null) {
						cell11.setCellValue(record.getR51_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row52
					row = sheet.getRow(51);
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR52_corporate_finance() != null) {
						cell4.setCellValue(record.getR52_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR52_trading_and_sales() != null) {
						cell5.setCellValue(record.getR52_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR52_retail_banking()  != null) {
						cell6.setCellValue(record.getR52_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR52_commercial_banking() != null) {
						cell7.setCellValue(record.getR52_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR52_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR52_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR52_agency_services() != null) {
						cell9.setCellValue(record.getR52_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR52_asset_management() != null) {
						cell10.setCellValue(record.getR52_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR52_retail_brokerage() != null) {
						cell11.setCellValue(record.getR52_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row53
					row = sheet.getRow(52);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR53_corporate_finance() != null) {
						cell4.setCellValue(record.getR53_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR53_trading_and_sales() != null) {
						cell5.setCellValue(record.getR53_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR53_retail_banking()  != null) {
						cell6.setCellValue(record.getR53_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR53_commercial_banking() != null) {
						cell7.setCellValue(record.getR53_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR53_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR53_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR53_agency_services() != null) {
						cell9.setCellValue(record.getR53_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR53_asset_management() != null) {
						cell10.setCellValue(record.getR53_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR53_retail_brokerage() != null) {
						cell11.setCellValue(record.getR53_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row54
					row = sheet.getRow(53);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR54_corporate_finance() != null) {
						cell4.setCellValue(record.getR54_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR54_trading_and_sales() != null) {
						cell5.setCellValue(record.getR54_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR54_retail_banking()  != null) {
						cell6.setCellValue(record.getR54_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR54_commercial_banking() != null) {
						cell7.setCellValue(record.getR54_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR54_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR54_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR54_agency_services() != null) {
						cell9.setCellValue(record.getR54_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR54_asset_management() != null) {
						cell10.setCellValue(record.getR54_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR54_retail_brokerage() != null) {
						cell11.setCellValue(record.getR54_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					}
					
					//row55
					row = sheet.getRow(54);
					
					 // Column D
					 cell4 = row.createCell(3);
					if (record.getR55_corporate_finance() != null) {
						cell4.setCellValue(record.getR55_corporate_finance().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					
					// Column E
					 cell5 = row.createCell(4);
					if (record.getR55_trading_and_sales() != null) {
						cell5.setCellValue(record.getR55_trading_and_sales().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
					
					// Column F
					 cell6 = row.createCell(5);
					if (record.getR55_retail_banking()  != null) {
						cell6.setCellValue(record.getR55_retail_banking() .doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					
					// Column G
					 cell7 = row.createCell(6);
					if (record.getR55_commercial_banking() != null) {
						cell7.setCellValue(record.getR55_commercial_banking().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}
					
				
					// Column H
					 cell8 = row.createCell(7);
					if (record.getR55_payments_and_settlements() != null) {
						cell8.setCellValue(record.getR55_payments_and_settlements().doubleValue());
						cell8.setCellStyle(numberStyle);
					} else {
						cell8.setCellValue("");
						cell8.setCellStyle(textStyle);
					}
					
					
					// Column I
					 cell9 = row.createCell(8);
					if (record.getR55_agency_services() != null) {
						cell9.setCellValue(record.getR55_agency_services().doubleValue());
						cell9.setCellStyle(numberStyle);
					} else {
						cell9.setCellValue("");
						cell9.setCellStyle(textStyle);
					}
					
					
					
					
					
					
					
				
					// Column J
					 cell10 = row.createCell(9);
					if (record.getR55_asset_management() != null) {
						cell10.setCellValue(record.getR55_asset_management().doubleValue());
						cell10.setCellStyle(numberStyle);
					} else {
						cell10.setCellValue("");
						cell10.setCellStyle(textStyle);
					}
					
				
					// Column K
					 cell11 = row.createCell(10);
					if (record.getR55_retail_brokerage() != null) {
						cell11.setCellValue(record.getR55_retail_brokerage().doubleValue());
						cell11.setCellStyle(numberStyle);
					} else {
						cell11.setCellValue("");
						cell11.setCellStyle(textStyle);
					} 
										
				}
				workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
			} else {
				
			}
			workbook.write(out);

			logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

			return out.toByteArray();
		}
				
	}
	
	public byte[] getDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for BRRS_M_OR2 ARCHIVAL Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {

			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("MSFinP2Detail");

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
			String[] headers = { "CUST ID", "ACCT NO", "ACCT NAME", "ACCT BALANCE", "ROWID", "COLUMNID",
					"REPORT_DATE" };

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
			List<M_OR2_Archival_Detail_Entity> reportData = M_OR2_Archival_Detail_Repo
					.getdatabydateList(parsedToDate, version);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_OR2_Archival_Detail_Entity item : reportData) {
					XSSFRow row = sheet.createRow(rowIndex++);

					row.createCell(0).setCellValue(item.getCust_id());
					row.createCell(1).setCellValue(item.getAcct_number());
					row.createCell(2).setCellValue(item.getAcct_name() );

// ACCT BALANCE (right aligned, 3 decimal places)
					Cell balanceCell = row.createCell(3);
					if (item.getExposure_amount() != null) {
						balanceCell.setCellValue(item.getExposure_amount().doubleValue());
					} else {
						balanceCell.setCellValue(0.000);
					}
					balanceCell.setCellStyle(balanceStyle);

					row.createCell(4).setCellValue(item.getRow_id());
					row.createCell(5).setCellValue(item.getColumn_id());
					row.createCell(6)
							.setCellValue(item.getReport_date() != null
									? new SimpleDateFormat("dd-MM-yyyy").format(item.getReport_date())
									: "");

// Apply data style for all other cells
					for (int j = 0; j < 7; j++) {
						if (j != 3) {
							row.getCell(j).setCellStyle(dataStyle);
						}
					}
				}
			} else {
				logger.info("No data found for BRRS_M_OR2 — only header will be written.");
			}

// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generating BRRS_M_OR2Excel", e);
			return new byte[0];
		}
	}
}












