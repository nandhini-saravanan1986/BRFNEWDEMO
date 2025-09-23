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

import com.bornfire.brf.entities.BRRS_M_LA2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_LA2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_LA2_Detail_Repo;
import com.bornfire.brf.entities.M_LA2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_LA2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LA2_Detail_Entity;
import com.bornfire.brf.entities.M_LA2_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_LA2_Summary_Repo;

@Component
@Service

public class BRRS_M_LA2_ReportService<BBRS_M_LA2_Detail_Repo> {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_LA2_ReportService.class);

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	private Environment env;
	@Autowired
	BRRS_M_LA2_Detail_Repo m_LA2_Detail_Repo;
	@Autowired
	BRRS_M_LA2_Summary_Repo m_LA2_Summary_Repo;

	
	@Autowired
	BRRS_M_LA2_Archival_Detail_Repo m_LA2_Archival_Detail_Repo;

	@Autowired
	BRRS_M_LA2_Archival_Summary_Repo m_LA2_Archival_Summary_Repo;


	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getBRRS_M_LA2View(String reportId, String fromdate, String todate, String currency,
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
			List<M_LA2_Archival_Summary_Entity> T1Master = new ArrayList<M_LA2_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);
				T1Master = m_LA2_Archival_Summary_Repo.getdatabydateListarchival(todate, version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_LA2_Summary_Entity> T1Master = new ArrayList<M_LA2_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = m_LA2_Summary_Repo.getdatabydateList(dateformat.parse(todate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_LA2");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
public ModelAndView getBRRS_M_LA2currentDtl(String reportId,
                                             String fromdate,
                                             String todate,
                                             String currency,
                                             String dtltype,
                                             Pageable pageable,
                                             String filter,
                                             String type,
                                             String version) {

    int pageSize = pageable != null ? pageable.getPageSize() : 10;
    int currentPage = pageable != null ? pageable.getPageNumber() : 0;
    int totalPages = 0;

    ModelAndView mv = new ModelAndView();

    try {
        Date parsedDate = null;
        if (todate != null && !todate.isEmpty()) {
            parsedDate = dateformat.parse(todate); // make sure dateformat = SimpleDateFormat("dd-MM-yyyy")
        }

        String rowId = null;
        String columnId = null;

        if (filter != null && filter.contains(",")) {
            String[] parts = filter.split(",");
            if (parts.length >= 2) {
                rowId = parts[0].trim();
                columnId = parts[1].trim();
            }
        }

        if ("ARCHIVAL".equalsIgnoreCase(type) && version != null) {
            List<M_LA2_Archival_Detail_Entity> resultList;

            if (rowId != null && columnId != null) {
                resultList = m_LA2_Archival_Detail_Repo
                                .GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
            } else {
                resultList = m_LA2_Archival_Detail_Repo
                                .getdatabydateList(todate, version);
            }

            mv.addObject("reportdetails", resultList);
            mv.addObject("reportmaster12", resultList);
            System.out.println("ARCHIVAL COUNT: " + (resultList != null ? resultList.size() : 0));

        } else {
            List<M_LA2_Detail_Entity> resultList;

            if (rowId != null && columnId != null) {
                resultList = m_LA2_Detail_Repo
                                .GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
            } else {
                resultList = m_LA2_Detail_Repo.getdatabydateList(parsedDate);
                totalPages = m_LA2_Detail_Repo.getdatacount(parsedDate);
                mv.addObject("pagination", "YES");
            }

            mv.addObject("reportdetails", resultList);
            mv.addObject("reportmaster12", resultList);
			
            System.out.println("CURRENT Details COUNT: " + (resultList != null ? resultList.size() : 0));
        }

    } catch (ParseException e) {
        e.printStackTrace();
        mv.addObject("errorMessage", "Invalid date format: " + todate);
    } catch (Exception e) {
        e.printStackTrace();
        mv.addObject("errorMessage", "Unexpected error: " + e.getMessage());
    }

    mv.setViewName("BRRS/M_LA2"); // Make sure file is BRRS/M_LA2.html
    mv.addObject("displaymode", "Details");
    mv.addObject("currentPage", currentPage);
    mv.addObject("totalPages", (int) Math.ceil((double) totalPages / pageSize));
    mv.addObject("reportsflag", "reportsflag");
    mv.addObject("menu", reportId);

    return mv;
}



	public byte[] getM_LA2Excel(String filename, String reportId, String fromdate, String todate, String currency,
									 String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getDetailExcelARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data
		List<M_LA2_Summary_Entity> dataList = m_LA2_Summary_Repo.getdatabydateList(dateformat.parse(todate));

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_SFINP2 report. Returning empty result.");
			return new byte[0];
		}

		String templateDir = env.getProperty("output.exportpathtemp");
		String templateFileName = filename;
		System.out.println(filename);
		Path templatePath = Paths.get(templateDir, templateFileName);
		System.out.println(templatePath);

		logger.info("Service: Attempting to load template from path: {}", templatePath.toAbsolutePath());

		if (!Files.exists(templatePath)) {
			throw new FileNotFoundException("Template file not found at: " + templatePath.toAbsolutePath());
		}

		if (!Files.isReadable(templatePath)) {
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
					M_LA2_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
// R12 Col B
Cell R12cell1 = row.createCell(1);
if (record.getR12_total() != null) {
    R12cell1.setCellValue(record.getR12_total().doubleValue());
    R12cell1.setCellStyle(numberStyle);
} else {
    R12cell1.setCellValue("");
    R12cell1.setCellStyle(textStyle);
}
row = sheet.getRow(12);

//R13 Col B
Cell R13cell1 = row.createCell(1);
if (record.getR13_total() != null) {
    R13cell1.setCellValue(record.getR13_total().doubleValue());
    R13cell1.setCellStyle(numberStyle);
} else {
    R13cell1.setCellValue("");
    R13cell1.setCellStyle(textStyle);
}
//R14 Col B
row = sheet.getRow(13);
Cell R14cell1 = row.createCell(1);
if (record.getR14_total() != null) {
    R14cell1.setCellValue(record.getR14_total().doubleValue());
    R14cell1.setCellStyle(numberStyle);
} else {
    R14cell1.setCellValue("");
    R14cell1.setCellStyle(textStyle);
}
//R15 Col B
row = sheet.getRow(14);
Cell R15cell1 = row.createCell(1);
if (record.getR15_total() != null) {
    R15cell1.setCellValue(record.getR15_total().doubleValue());
    R15cell1.setCellStyle(numberStyle);
} else {
    R15cell1.setCellValue("");
    R15cell1.setCellStyle(textStyle);
}
//R16 Col B
row = sheet.getRow(15);
Cell R16cell1 = row.createCell(1);
if (record.getR16_total() != null) {
    R16cell1.setCellValue(record.getR16_total().doubleValue());
    R16cell1.setCellStyle(numberStyle);
} else {
    R16cell1.setCellValue("");
    R16cell1.setCellStyle(textStyle);
}
//R17 Col B
row = sheet.getRow(16);
Cell R17cell1 = row.createCell(1);
if (record.getR17_total() != null) {
    R17cell1.setCellValue(record.getR17_total().doubleValue());
    R17cell1.setCellStyle(numberStyle);
} else {
    R17cell1.setCellValue("");
    R17cell1.setCellStyle(textStyle);
}
//R18 Col B
row = sheet.getRow(17);
Cell R18cell1 = row.createCell(1);
if (record.getR18_total() != null) {
    R18cell1.setCellValue(record.getR18_total().doubleValue());
    R18cell1.setCellStyle(numberStyle);
} else {
    R18cell1.setCellValue("");
    R18cell1.setCellStyle(textStyle);
}
//R19 Col B
row = sheet.getRow(18);
Cell R19cell1 = row.createCell(1);
if (record.getR19_total() != null) {
    R19cell1.setCellValue(record.getR19_total().doubleValue());
    R19cell1.setCellStyle(numberStyle);
} else {
    R19cell1.setCellValue("");
    R19cell1.setCellStyle(textStyle);
}
//R20 Col B
row = sheet.getRow(19);
Cell R20cell1 = row.createCell(1);
if (record.getR20_total() != null) {
    R20cell1.setCellValue(record.getR20_total().doubleValue());
    R20cell1.setCellStyle(numberStyle);
} else {
    R20cell1.setCellValue("");
    R20cell1.setCellStyle(textStyle);
}
//R21 Col B
row = sheet.getRow(20);
Cell R21cell1 = row.createCell(1);
if (record.getR21_total() != null) {
    R21cell1.setCellValue(record.getR21_total().doubleValue());
    R21cell1.setCellStyle(numberStyle);
} else {
    R21cell1.setCellValue("");
    R21cell1.setCellStyle(textStyle);
}
//R22 Col B
row = sheet.getRow(21);
Cell R22cell1 = row.createCell(1);
if (record.getR22_total() != null) {
    R22cell1.setCellValue(record.getR22_total().doubleValue());
    R22cell1.setCellStyle(numberStyle);
} else {
    R22cell1.setCellValue("");
    R22cell1.setCellStyle(textStyle);
}
//R23 Col B
row = sheet.getRow(22);
Cell R23cell1 = row.createCell(1);
if (record.getR23_total() != null) {
    R23cell1.setCellValue(record.getR23_total().doubleValue());
    R23cell1.setCellStyle(numberStyle);
} else {
    R23cell1.setCellValue("");
    R23cell1.setCellStyle(textStyle);
}
//R24 Col B
row = sheet.getRow(23);
Cell R24cell1 = row.createCell(1);
if (record.getR24_total() != null) {
    R24cell1.setCellValue(record.getR24_total().doubleValue());
    R24cell1.setCellStyle(numberStyle);
} else {
    R24cell1.setCellValue("");
    R24cell1.setCellStyle(textStyle);
}
//R25 Col B
row = sheet.getRow(24);
Cell R25cell1 = row.createCell(1);
if (record.getR25_total() != null) {
    R25cell1.setCellValue(record.getR25_total().doubleValue());
    R25cell1.setCellStyle(numberStyle);
} else {
    R25cell1.setCellValue("");
    R25cell1.setCellStyle(textStyle);
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

	public byte[] BRRS_M_LA2DetailExcel(String filename, String fromdate, String todate, String currency,
										   String dtltype, String type, String version) {

		try {
			logger.info("Generating Excel for BRRSM_LA2 Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("BRRS_M_LA2Details");

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
			List<M_LA2_Detail_Entity> reportData = m_LA2_Detail_Repo.getdatabydateList(parsedToDate);
			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_LA2_Detail_Entity item : reportData) {
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
				logger.info("No data found for BRRS_M_LA2 — only header will be written.");
			}
			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();
			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();
		} catch (Exception e) {
			logger.error("Error generating BRRS_M_LA2 Excel", e);
			return new byte[0];
		}
	}

	public List<Object> getM_LA2Archival() {
		List<Object> M_SFINP2Archivallist = new ArrayList<>();
		try {
			M_SFINP2Archivallist = m_LA2_Archival_Summary_Repo.getM_LA2archival();
			System.out.println("countser" + M_SFINP2Archivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_SFINP2 Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_SFINP2Archivallist;
	}

	public byte[] getDetailExcelARCHIVAL(String filename, String reportId, String fromdate, String todate,
										   String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_LA2_Archival_Summary_Entity> dataList = m_LA2_Archival_Summary_Repo
				.getdatabydateListarchival(todate, version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_LA2 report. Returning empty result.");
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
					M_LA2_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
									
// R12 Col B
Cell R12cell1 = row.createCell(1);
if (record.getR12_total() != null) {
    R12cell1.setCellValue(record.getR12_total().doubleValue());
    R12cell1.setCellStyle(numberStyle);
} else {
    R12cell1.setCellValue("");
    R12cell1.setCellStyle(textStyle);
}
row = sheet.getRow(12);

//R13 Col B
Cell R13cell1 = row.createCell(1);
if (record.getR13_total() != null) {
    R13cell1.setCellValue(record.getR13_total().doubleValue());
    R13cell1.setCellStyle(numberStyle);
} else {
    R13cell1.setCellValue("");
    R13cell1.setCellStyle(textStyle);
}
//R14 Col B
row = sheet.getRow(13);
Cell R14cell1 = row.createCell(1);
if (record.getR14_total() != null) {
    R14cell1.setCellValue(record.getR14_total().doubleValue());
    R14cell1.setCellStyle(numberStyle);
} else {
    R14cell1.setCellValue("");
    R14cell1.setCellStyle(textStyle);
}
//R15 Col B
row = sheet.getRow(14);
Cell R15cell1 = row.createCell(1);
if (record.getR15_total() != null) {
    R15cell1.setCellValue(record.getR15_total().doubleValue());
    R15cell1.setCellStyle(numberStyle);
} else {
    R15cell1.setCellValue("");
    R15cell1.setCellStyle(textStyle);
}
//R16 Col B
row = sheet.getRow(15);
Cell R16cell1 = row.createCell(1);
if (record.getR16_total() != null) {
    R16cell1.setCellValue(record.getR16_total().doubleValue());
    R16cell1.setCellStyle(numberStyle);
} else {
    R16cell1.setCellValue("");
    R16cell1.setCellStyle(textStyle);
}
//R17 Col B
row = sheet.getRow(16);
Cell R17cell1 = row.createCell(1);
if (record.getR17_total() != null) {
    R17cell1.setCellValue(record.getR17_total().doubleValue());
    R17cell1.setCellStyle(numberStyle);
} else {
    R17cell1.setCellValue("");
    R17cell1.setCellStyle(textStyle);
}
//R18 Col B
row = sheet.getRow(17);
Cell R18cell1 = row.createCell(1);
if (record.getR18_total() != null) {
    R18cell1.setCellValue(record.getR18_total().doubleValue());
    R18cell1.setCellStyle(numberStyle);
} else {
    R18cell1.setCellValue("");
    R18cell1.setCellStyle(textStyle);
}
//R19 Col B
row = sheet.getRow(18);
Cell R19cell1 = row.createCell(1);
if (record.getR19_total() != null) {
    R19cell1.setCellValue(record.getR19_total().doubleValue());
    R19cell1.setCellStyle(numberStyle);
} else {
    R19cell1.setCellValue("");
    R19cell1.setCellStyle(textStyle);
}
//R20 Col B
row = sheet.getRow(19);
Cell R20cell1 = row.createCell(1);
if (record.getR20_total() != null) {
    R20cell1.setCellValue(record.getR20_total().doubleValue());
    R20cell1.setCellStyle(numberStyle);
} else {
    R20cell1.setCellValue("");
    R20cell1.setCellStyle(textStyle);
}
//R21 Col B
row = sheet.getRow(20);
Cell R21cell1 = row.createCell(1);
if (record.getR21_total() != null) {
    R21cell1.setCellValue(record.getR21_total().doubleValue());
    R21cell1.setCellStyle(numberStyle);
} else {
    R21cell1.setCellValue("");
    R21cell1.setCellStyle(textStyle);
}
//R22 Col B
row = sheet.getRow(21);
Cell R22cell1 = row.createCell(1);
if (record.getR22_total() != null) {
    R22cell1.setCellValue(record.getR22_total().doubleValue());
    R22cell1.setCellStyle(numberStyle);
} else {
    R22cell1.setCellValue("");
    R22cell1.setCellStyle(textStyle);
}
//R23 Col B
row = sheet.getRow(22);
Cell R23cell1 = row.createCell(1);
if (record.getR23_total() != null) {
    R23cell1.setCellValue(record.getR23_total().doubleValue());
    R23cell1.setCellStyle(numberStyle);
} else {
    R23cell1.setCellValue("");
    R23cell1.setCellStyle(textStyle);
}
//R24 Col B
row = sheet.getRow(23);
Cell R24cell1 = row.createCell(1);
if (record.getR24_total() != null) {
    R24cell1.setCellValue(record.getR24_total().doubleValue());
    R24cell1.setCellStyle(numberStyle);
} else {
    R24cell1.setCellValue("");
    R24cell1.setCellStyle(textStyle);
}
//R25 Col B
row = sheet.getRow(24);
Cell R25cell1 = row.createCell(1);
if (record.getR25_total() != null) {
    R25cell1.setCellValue(record.getR25_total().doubleValue());
    R25cell1.setCellStyle(numberStyle);
} else {
    R25cell1.setCellValue("");
    R25cell1.setCellStyle(textStyle);
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
public byte[] getDetailExcelARCHIVAL(String filename,
                                     String fromdate,
                                     String todate,
                                     String currency,
                                     String dtltype,
                                     String type,
                                     String version) {
    try {
        logger.info("Generating Excel for BRRS_M_LA2 ARCHIVAL Details...");
        System.out.println("came to Detail download service");

        // --- Create workbook and sheet ---
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("M_LA2Detail");

        BorderStyle border = BorderStyle.THIN;

        // Header style
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

        // Data style
        CellStyle dataStyle = workbook.createCellStyle();
        dataStyle.setAlignment(HorizontalAlignment.LEFT);
        dataStyle.setBorderTop(border);
        dataStyle.setBorderBottom(border);
        dataStyle.setBorderLeft(border);
        dataStyle.setBorderRight(border);

        // Balance style
        CellStyle balanceStyle = workbook.createCellStyle();
        balanceStyle.setAlignment(HorizontalAlignment.RIGHT);
        balanceStyle.setDataFormat(workbook.createDataFormat().getFormat("0.000"));
        balanceStyle.setBorderTop(border);
        balanceStyle.setBorderBottom(border);
        balanceStyle.setBorderLeft(border);
        balanceStyle.setBorderRight(border);

        // --- Header row ---
        String[] headers = {"CUST ID", "ACCT NO", "ACCT NAME", "ACCT BALANCE", "ROWID", "COLUMNID", "REPORT_DATE"};
        XSSFRow headerRow = sheet.createRow(0);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            if (i == 3) {
                cell.setCellStyle(rightAlignedHeaderStyle);
            } else {
                cell.setCellStyle(headerStyle);
            }
            sheet.setColumnWidth(i, 5000);
        }

        // --- Fetch data from DB ---
       // Date parsedToDate = new SimpleDateFormat("dd-MM-yyyy").parse(todate); // ✅ match with controller
        List<M_LA2_Archival_Detail_Entity> reportData =
                m_LA2_Archival_Detail_Repo.getdatabydateList(todate, version);

        logger.info("Fetched {} rows from DB for ARCHIVAL", reportData != null ? reportData.size() : 0);

        if (reportData != null && !reportData.isEmpty()) {
            int rowIndex = 1;
            for (M_LA2_Archival_Detail_Entity item : reportData) {
                XSSFRow row = sheet.createRow(rowIndex++);

                row.createCell(0).setCellValue(item.getCustId());
                row.createCell(1).setCellValue(item.getAcctNumber());
                row.createCell(2).setCellValue(item.getAcctName());

                // Balance
                Cell balanceCell = row.createCell(3);
                balanceCell.setCellValue(item.getAcctBalanceInpula() != null
                        ? item.getAcctBalanceInpula().doubleValue()
                        : 0.000);
                balanceCell.setCellStyle(balanceStyle);

                row.createCell(4).setCellValue(item.getRowId());
                row.createCell(5).setCellValue(item.getColumnId());
                row.createCell(6).setCellValue(item.getReportDate() != null
                        ? new SimpleDateFormat("dd-MM-yyyy").format(item.getReportDate())
                        : "");

                // Apply data style except balance column
                for (int j = 0; j < 7; j++) {
                    if (j != 3) {
                        row.getCell(j).setCellStyle(dataStyle);
                    }
                }
            }
        } else {
            logger.info("⚠️ No data found for BRRS_M_LA2 ARCHIVAL — only header will be written.");
        }

        // --- Write to byte[] ---
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        workbook.write(bos);
        workbook.close();

        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
        return bos.toByteArray();

    } catch (Exception e) {
        logger.error("Error generating BRRS_M_LA2 Excel", e);
        return new byte[0];
    }
}


}
