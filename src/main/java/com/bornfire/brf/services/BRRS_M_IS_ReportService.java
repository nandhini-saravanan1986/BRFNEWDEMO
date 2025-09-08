
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

import com.bornfire.brf.entities.BRRS_M_IS_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_IS_Archival_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_M_IS_Archival_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_M_IS_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_IS_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_IS_Summary_Repo2;
import com.bornfire.brf.entities.M_IS_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_IS_Archival_Summary_Entity1;
import com.bornfire.brf.entities.M_IS_Archival_Summary_Entity2;
import com.bornfire.brf.entities.M_IS_Detail_Entity;
import com.bornfire.brf.entities.M_IS_Summary_Entity;
import com.bornfire.brf.entities.M_IS_Summary_Entity2;

@Component
@Service
public class BRRS_M_IS_ReportService {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_IS_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	BRRS_M_IS_Detail_Repo M_IS_Detail_Repo;

	@Autowired
	BRRS_M_IS_Summary_Repo M_IS_Summary_Repo;

	@Autowired
	BRRS_M_IS_Summary_Repo2 M_IS_Summary_Repo2;

	@Autowired
	BRRS_M_IS_Archival_Detail_Repo M_IS_Archival_Detail_Repo;

	@Autowired
	BRRS_M_IS_Archival_Summary_Repo1 M_IS_Archival_Summary_Repo1;

	@Autowired
	BRRS_M_IS_Archival_Summary_Repo2 M_IS_Archival_Summary_Repo2;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_ISView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<M_IS_Archival_Summary_Entity1> T1Master = new ArrayList<M_IS_Archival_Summary_Entity1>();
			List<M_IS_Archival_Summary_Entity2> T1Master1 = new ArrayList<M_IS_Archival_Summary_Entity2>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_IS_Archival_Summary_Repo1.getdatabydateListarchival(dateformat.parse(todate), version);
				T1Master1 = M_IS_Archival_Summary_Repo2.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
		} else {
			List<M_IS_Summary_Entity> T1Master = new ArrayList<M_IS_Summary_Entity>();
			List<M_IS_Summary_Entity2> T1Master1 = new ArrayList<M_IS_Summary_Entity2>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_IS_Summary_Repo.getdatabydateList(dateformat.parse(todate));
				T1Master1 = M_IS_Summary_Repo2.getdatabydateList(dateformat.parse(todate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_IS");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}

	public ModelAndView getM_IScurrentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter, String type, String version) {
		int pageSize = 10; // default
		int currentPage = 0; // default
		if (pageable != null) {
			pageSize = pageable.getPageSize();
			currentPage = pageable.getPageNumber();
		}
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();

		try {
			Date parsedDate = null;
			if (todate != null && !todate.isEmpty()) {
				parsedDate = dateformat.parse(todate);
			}

			String rowId = null;
			String columnId = null;

// ✅ Split the filter string safely
			if (filter != null && filter.contains(",")) {
				String[] parts = filter.split(",");
				if (parts.length >= 2) {
					rowId = parts[0];
					columnId = parts[1];
				}
			}

			if ("ARCHIVAL".equals(type) && version != null) {
// 🔹 Archival branch
				List<M_IS_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = M_IS_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
				} else {
					T1Dt1 = M_IS_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
// 🔹 Current branch
				List<M_IS_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = M_IS_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
				} else {
					T1Dt1 = M_IS_Detail_Repo.getdatabydateList(parsedDate);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("DETAIL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));
			}

		} catch (ParseException e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Invalid date format: " + todate);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Unexpected error: " + e.getMessage());
		}

// ✅ Common attributes
		mv.setViewName("BRRS/M_IS");
		mv.addObject("displaymode", "Details");
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);

		return mv;
	}

	public byte[] BRRS_M_ISDetailExcel(String filename, String fromdate, String todate, String currency, String dtltype,
			String type, String version) {

		try {
			logger.info("Generating Excel for BRRS_M_ISDetails...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("BRRS_M_ISDetails");

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
			List<M_IS_Detail_Entity> reportData = M_IS_Detail_Repo.getdatabydateList(parsedToDate);
			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_IS_Detail_Entity item : reportData) {
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
					row.createCell(6)
							.setCellValue(item.getReportDate() != null
									? new SimpleDateFormat("dd-MM-yyyy").format(item.getReportDate())
									: "");
					// Apply data style for all other cells
					for (int j = 0; j < 7; j++) {
						if (j != 3) {
							row.getCell(j).setCellStyle(dataStyle);
						}
					}
				}
			} else {
				logger.info("No data found for BRRS_M_IS— only header will be written.");
			}
			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();
			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();
		} catch (Exception e) {
			logger.error("Error generating BRRS_M_ISExcel", e);
			return new byte[0];
		}
	}

	public byte[] BRRS_M_ISExcel(String filename, String reportId, String fromdate, String todate, String currency,
			String dtltype, String type, String version) throws Exception {

		logger.info("Service: Starting Excel generation process in memory.");

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelM_ISARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data
		List<M_IS_Summary_Entity> dataList = M_IS_Summary_Repo.getdatabydateList(dateformat.parse(todate));

		List<M_IS_Summary_Entity2> dataList1 = M_IS_Summary_Repo2.getdatabydateList(dateformat.parse(todate));

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

					M_IS_Summary_Entity record = dataList.get(i);
					M_IS_Summary_Entity2 record2 = dataList1.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					// row10
					// Column D
					Cell cell3 = row.createCell(3);
					if (record.getR10_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR10_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row10
					// Column E
					Cell cell4 = row.createCell(4);
					if (record.getR10_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR10_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row10
					// Column F
					Cell cell5 = row.createCell(5);
					if (record.getR10_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR10_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row11
					row = sheet.getRow(10);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR11_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR11_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row11
					// Column E
					cell4 = row.createCell(4);
					if (record.getR11_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR11_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row11
					// Column F
					cell5 = row.createCell(5);
					if (record.getR11_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR11_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row12
					row = sheet.getRow(11);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR12_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR12_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row12
					// Column E
					cell4 = row.createCell(4);
					if (record.getR12_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR12_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row12
					// Column F
					cell5 = row.createCell(5);
					if (record.getR12_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR12_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row13
					row = sheet.getRow(12);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR13_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR13_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row13
					// Column E
					cell4 = row.createCell(4);
					if (record.getR13_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR13_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row13
					// Column F
					cell5 = row.createCell(5);
					if (record.getR13_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR13_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row14
					row = sheet.getRow(13);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR14_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR14_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row14
					// Column E
					cell4 = row.createCell(4);
					if (record.getR14_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR14_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row14
					// Column F
					cell5 = row.createCell(5);
					if (record.getR14_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR14_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row15
					row = sheet.getRow(14);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR15_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR15_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row11
					// Column E
					cell4 = row.createCell(4);
					if (record.getR15_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR15_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row11
					// Column F
					cell5 = row.createCell(5);
					if (record.getR15_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR15_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row21
					row = sheet.getRow(20);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR21_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR21_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row21
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR21_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR21_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row21
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR21_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR21_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row21
					// Column G
					Cell cell6 = row.createCell(6);
					if (record2.getR21_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR21_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row21
					// Column H
					Cell cell7 = row.createCell(7);
					if (record2.getR21_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR21_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row22
					row = sheet.getRow(21);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR22_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR22_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row22
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR22_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR22_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row22
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR22_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR22_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row22
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR22_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR22_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row22
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR22_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR22_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row23
					row = sheet.getRow(22);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR23_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR23_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row23
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR23_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR23_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row23
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR23_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR23_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row23
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR23_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR23_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row23
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR23_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR23_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row24
					row = sheet.getRow(23);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR24_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR24_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row24
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR24_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR24_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row24
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR24_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR24_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row24
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR24_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR24_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row24
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR24_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR24_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row25
					row = sheet.getRow(24);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR25_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR25_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row25
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR25_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR25_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row25
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR25_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR25_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row25
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR25_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR25_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row25
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR25_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR25_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row26
					row = sheet.getRow(25);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR26_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR26_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row26
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR26_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR26_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row26
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR26_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR26_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row26
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR26_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR26_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row26
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR26_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR26_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row27
					row = sheet.getRow(26);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR27_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR27_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row27
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR27_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR27_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row27
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR27_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR27_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row27
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR27_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR27_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row27
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR27_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR27_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row28
					row = sheet.getRow(27);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR28_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR28_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row28
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR28_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR28_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row28
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR28_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR28_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row28
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR28_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR28_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row28
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR28_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR28_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row29
					row = sheet.getRow(28);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR29_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR29_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row29
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR29_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR29_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row29
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR29_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR29_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row29
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR29_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR29_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row29
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR29_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR29_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row30
					row = sheet.getRow(29);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR30_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR30_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row30
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR30_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR30_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row30
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR30_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR30_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row30
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR30_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR30_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row30
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR30_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR30_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row32
					row = sheet.getRow(31);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR32_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR32_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row32
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR32_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR32_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row32
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR32_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR32_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row32
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR32_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR32_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row32
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR32_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR32_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row33
					row = sheet.getRow(32);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR33_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR33_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row33
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR33_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR33_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row33
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR33_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR33_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row33
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR33_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR33_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row33
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR33_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR33_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row34
					row = sheet.getRow(33);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR34_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR34_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row34
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR34_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR34_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row34
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR34_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR34_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row34
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR34_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR34_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row34
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR34_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR34_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
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

	public byte[] getDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for BRRS_M_IS ARCHIVAL Details...");
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
			List<M_IS_Archival_Detail_Entity> reportData = M_IS_Archival_Detail_Repo.getdatabydateList(parsedToDate,
					version);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_IS_Archival_Detail_Entity item : reportData) {
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
					row.createCell(6)
							.setCellValue(item.getReportDate() != null
									? new SimpleDateFormat("dd-MM-yyyy").format(item.getReportDate())
									: "");

					// Apply data style for all other cells
					for (int j = 0; j < 7; j++) {
						if (j != 3) {
							row.getCell(j).setCellStyle(dataStyle);
						}
					}
				}
			} else {
				logger.info("No data found for BRRS_M_IS — only header will be written.");
			}

			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generating BRRS_M_ISExcel", e);
			return new byte[0];
		}
	}

	public List<Object> getM_ISArchival() {
		List<Object> M_ISArchivallist = new ArrayList<>();
		List<Object> M_ISArchivallist1 = new ArrayList<>();
		try {
			M_ISArchivallist = M_IS_Archival_Summary_Repo1.getM_ISarchival();
			M_ISArchivallist1 = M_IS_Archival_Summary_Repo2.getM_ISarchival();
			System.out.println("countser" + M_ISArchivallist.size());
			System.out.println("countser" + M_ISArchivallist1.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_IS Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_ISArchivallist;
	}

	public byte[] getExcelM_ISARCHIVAL(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_IS_Archival_Summary_Entity1> dataList = M_IS_Archival_Summary_Repo1
				.getdatabydateListarchival(dateformat.parse(todate), version);
		List<M_IS_Archival_Summary_Entity2> dataList1 = M_IS_Archival_Summary_Repo2
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_IS report. Returning empty result.");
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

					M_IS_Archival_Summary_Entity1 record = dataList.get(i);
					M_IS_Archival_Summary_Entity2 record2 = dataList1.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					// row10
					// Column D
					Cell cell3 = row.createCell(3);
					if (record.getR10_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR10_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row10
					// Column E
					Cell cell4 = row.createCell(4);
					if (record.getR10_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR10_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row10
					// Column F
					Cell cell5 = row.createCell(5);
					if (record.getR10_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR10_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row11
					row = sheet.getRow(10);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR11_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR11_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row11
					// Column E
					cell4 = row.createCell(4);
					if (record.getR11_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR11_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row11
					// Column F
					cell5 = row.createCell(5);
					if (record.getR11_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR11_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row12
					row = sheet.getRow(11);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR12_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR12_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row12
					// Column E
					cell4 = row.createCell(4);
					if (record.getR12_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR12_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row12
					// Column F
					cell5 = row.createCell(5);
					if (record.getR12_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR12_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row13
					row = sheet.getRow(12);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR13_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR13_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row13
					// Column E
					cell4 = row.createCell(4);
					if (record.getR13_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR13_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row13
					// Column F
					cell5 = row.createCell(5);
					if (record.getR13_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR13_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row14
					row = sheet.getRow(13);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR14_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR14_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row14
					// Column E
					cell4 = row.createCell(4);
					if (record.getR14_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR14_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row14
					// Column F
					cell5 = row.createCell(5);
					if (record.getR14_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR14_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row15
					row = sheet.getRow(14);
					// Column D
					cell3 = row.createCell(3);
					if (record.getR15_FAIR_VALUE_PROFIT_AND_LOSS() != null) {
						cell3.setCellValue(record.getR15_FAIR_VALUE_PROFIT_AND_LOSS().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row11
					// Column E
					cell4 = row.createCell(4);
					if (record.getR15_HELD_TO_MATURITY() != null) {
						cell4.setCellValue(record.getR15_HELD_TO_MATURITY().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row11
					// Column F
					cell5 = row.createCell(5);
					if (record.getR15_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record.getR15_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row21
					row = sheet.getRow(20);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR21_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR21_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row21
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR21_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR21_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row21
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR21_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR21_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row21
					// Column G
					Cell cell6 = row.createCell(6);
					if (record2.getR21_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR21_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row21
					// Column H
					Cell cell7 = row.createCell(7);
					if (record2.getR21_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR21_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row22
					row = sheet.getRow(21);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR22_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR22_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row22
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR22_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR22_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row22
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR22_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR22_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row22
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR22_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR22_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row22
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR22_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR22_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row23
					row = sheet.getRow(22);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR23_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR23_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row23
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR23_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR23_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row23
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR23_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR23_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row23
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR23_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR23_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row23
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR23_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR23_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row24
					row = sheet.getRow(23);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR24_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR24_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row24
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR24_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR24_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row24
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR24_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR24_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row24
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR24_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR24_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row24
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR24_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR24_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row25
					row = sheet.getRow(24);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR25_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR25_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row25
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR25_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR25_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row25
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR25_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR25_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row25
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR25_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR25_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row25
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR25_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR25_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row26
					row = sheet.getRow(25);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR26_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR26_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row26
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR26_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR26_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row26
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR26_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR26_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row26
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR26_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR26_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row26
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR26_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR26_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row27
					row = sheet.getRow(26);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR27_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR27_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row27
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR27_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR27_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row27
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR27_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR27_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row27
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR27_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR27_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row27
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR27_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR27_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row28
					row = sheet.getRow(27);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR28_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR28_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row28
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR28_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR28_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row28
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR28_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR28_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row28
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR28_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR28_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row28
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR28_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR28_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row29
					row = sheet.getRow(28);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR29_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR29_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row29
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR29_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR29_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row29
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR29_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR29_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row29
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR29_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR29_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row29
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR29_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR29_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row30
					row = sheet.getRow(29);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR30_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR30_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row30
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR30_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR30_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row30
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR30_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR30_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row30
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR30_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR30_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row30
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR30_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR30_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row32
					row = sheet.getRow(31);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR32_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR32_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row32
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR32_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR32_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row32
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR32_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR32_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row32
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR32_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR32_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row32
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR32_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR32_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row33
					row = sheet.getRow(32);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR33_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR33_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row33
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR33_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR33_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row33
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR33_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR33_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row33
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR33_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR33_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row33
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR33_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR33_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
					}

					// row34
					row = sheet.getRow(33);
					// Column D
					cell3 = row.createCell(3);
					if (record2.getR34_HELD_FOR_TRADING() != null) {
						cell3.setCellValue(record2.getR34_HELD_FOR_TRADING().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}

					// row34
					// Column E
					cell4 = row.createCell(4);
					if (record2.getR34_AMORTISED_COST() != null) {
						cell4.setCellValue(record2.getR34_AMORTISED_COST().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}

					// row34
					// Column F
					cell5 = row.createCell(5);
					if (record2.getR34_AVAILABLE_FOR_SALE() != null) {
						cell5.setCellValue(record2.getR34_AVAILABLE_FOR_SALE().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}

					// row34
					// Column G
					cell6 = row.createCell(6);
					if (record2.getR34_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS() != null) {
						cell6.setCellValue(record2.getR34_FAIR_VALUE_THROUGH_PROFIT_AND_LOSS().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}

					// row34
					// Column H
					cell7 = row.createCell(7);
					if (record2.getR34_QUALIFYING_FOR_HEDGE_ACCOUNTING() != null) {
						cell7.setCellValue(record2.getR34_QUALIFYING_FOR_HEDGE_ACCOUNTING().doubleValue());
						cell7.setCellStyle(numberStyle);
					} else {
						cell7.setCellValue("");
						cell7.setCellStyle(textStyle);
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
