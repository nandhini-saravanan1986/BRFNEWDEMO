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

import com.bornfire.brf.entities.BRRS_M_FAS_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_FAS_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_FAS_Detail_Repo;
import com.bornfire.brf.entities.M_FAS_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_FAS_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_FAS_Detail_Entity;
import com.bornfire.brf.entities.M_FAS_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_FAS_Summary_Repo;

@Component
@Service

public class BRRS_M_FAS_ReportService<BBRS_M_FAS_Detail_Repo> {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_FAS_ReportService.class);

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	private Environment env;
	@Autowired
	BRRS_M_FAS_Detail_Repo m_FAS_Detail_Repo;
	@Autowired
	BRRS_M_FAS_Summary_Repo m_FAS_Summary_Repo;

	
	@Autowired
	BRRS_M_FAS_Archival_Detail_Repo m_FAS_Archival_Detail_Repo;

	@Autowired
	BRRS_M_FAS_Archival_Summary_Repo m_FAS_Archival_Summary_Repo;


	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getBRRS_M_FASView(String reportId, String fromdate, String todate, String currency,
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
			List<M_FAS_Archival_Summary_Entity> T1Master = new ArrayList<M_FAS_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = m_FAS_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_FAS_Summary_Entity> T1Master = new ArrayList<M_FAS_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = m_FAS_Summary_Repo.getdatabydateList(dateformat.parse(todate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_FAS");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
public ModelAndView getBRRS_M_FAScurrentDtl(String reportId,
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
            List<M_FAS_Archival_Detail_Entity> resultList;

            if (rowId != null && columnId != null) {
                resultList = m_FAS_Archival_Detail_Repo
                                .GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
            } else {
                resultList = m_FAS_Archival_Detail_Repo
                                .getdatabydateList(todate, version);
            }

            mv.addObject("reportdetails", resultList);
            mv.addObject("reportmaster12", resultList);
            System.out.println("ARCHIVAL COUNT: " + (resultList != null ? resultList.size() : 0));

        } else {
            List<M_FAS_Detail_Entity> resultList;

            if (rowId != null && columnId != null) {
                resultList = m_FAS_Detail_Repo
                                .GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
            } else {
                resultList = m_FAS_Detail_Repo.getdatabydateList(parsedDate);
                totalPages = m_FAS_Detail_Repo.getdatacount(parsedDate);
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

    mv.setViewName("BRRS/M_FAS"); // Make sure file is BRRS/M_FAS.html
    mv.addObject("displaymode", "Details");
    mv.addObject("currentPage", currentPage);
    mv.addObject("totalPages", (int) Math.ceil((double) totalPages / pageSize));
    mv.addObject("reportsflag", "reportsflag");
    mv.addObject("menu", reportId);

    return mv;
}



	public byte[] getM_FASExcel(String filename, String reportId, String fromdate, String todate, String currency,
									 String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getSummaryExcelARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data
		List<M_FAS_Summary_Entity> dataList = m_FAS_Summary_Repo.getdatabydateList(dateformat.parse(todate));

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
			int startRow = 9;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					M_FAS_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
				
					// R10 Col B
Cell R10cell1 = row.createCell(1);
if (record.getR10_cost() != null) {
    R10cell1.setCellValue(record.getR10_cost().doubleValue());
    R10cell1.setCellStyle(numberStyle);
} else {
    R10cell1.setCellValue("");
    R10cell1.setCellStyle(textStyle);
}

// R10 Col C
Cell R10cell2 = row.createCell(2);
if (record.getR10_add() != null) {
    R10cell2.setCellValue(record.getR10_add().doubleValue());
    R10cell2.setCellStyle(numberStyle);
} else {
    R10cell2.setCellValue("");
    R10cell2.setCellStyle(textStyle);
}

// R10 Col D
Cell R10cell3 = row.createCell(3);
if (record.getR10_disposals() != null) {
    R10cell3.setCellValue(record.getR10_disposals().doubleValue());
    R10cell3.setCellStyle(numberStyle);
} else {
    R10cell3.setCellValue("");
    R10cell3.setCellStyle(textStyle);
}

// R10 Col E
Cell R10cell4 = row.createCell(4);
if (record.getR10_depreciation() != null) {
    R10cell4.setCellValue(record.getR10_depreciation().doubleValue());
    R10cell4.setCellStyle(numberStyle);
} else {
    R10cell4.setCellValue("");
    R10cell4.setCellStyle(textStyle);
}
// ==================== R11 ====================
// R11 Col B
row = sheet.getRow(10);
Cell R11cell1 = row.createCell(1);
if (record.getR11_cost() != null) {
    R11cell1.setCellValue(record.getR11_cost().doubleValue());
    R11cell1.setCellStyle(numberStyle);
} else {
    R11cell1.setCellValue("");
    R11cell1.setCellStyle(textStyle);
}

// R11 Col C
Cell R11cell2 = row.createCell(2);
if (record.getR11_add() != null) {
    R11cell2.setCellValue(record.getR11_add().doubleValue());
    R11cell2.setCellStyle(numberStyle);
} else {
    R11cell2.setCellValue("");
    R11cell2.setCellStyle(textStyle);
}

// R11 Col D
Cell R11cell3 = row.createCell(3);
if (record.getR11_disposals() != null) {
    R11cell3.setCellValue(record.getR11_disposals().doubleValue());
    R11cell3.setCellStyle(numberStyle);
} else {
    R11cell3.setCellValue("");
    R11cell3.setCellStyle(textStyle);
}

// R11 Col E
Cell R11cell4 = row.createCell(4);
if (record.getR11_depreciation() != null) {
    R11cell4.setCellValue(record.getR11_depreciation().doubleValue());
    R11cell4.setCellStyle(numberStyle);
} else {
    R11cell4.setCellValue("");
    R11cell4.setCellStyle(textStyle);
}


// ==================== R12 ====================
row = sheet.getRow(11);
Cell R12cell1 = row.createCell(1);
if (record.getR12_cost() != null) {
    R12cell1.setCellValue(record.getR12_cost().doubleValue());
    R12cell1.setCellStyle(numberStyle);
} else {
    R12cell1.setCellValue("");
    R12cell1.setCellStyle(textStyle);
}

Cell R12cell2 = row.createCell(2);
if (record.getR12_add() != null) {
    R12cell2.setCellValue(record.getR12_add().doubleValue());
    R12cell2.setCellStyle(numberStyle);
} else {
    R12cell2.setCellValue("");
    R12cell2.setCellStyle(textStyle);
}

Cell R12cell3 = row.createCell(3);
if (record.getR12_disposals() != null) {
    R12cell3.setCellValue(record.getR12_disposals().doubleValue());
    R12cell3.setCellStyle(numberStyle);
} else {
    R12cell3.setCellValue("");
    R12cell3.setCellStyle(textStyle);
}

Cell R12cell4 = row.createCell(4);
if (record.getR12_depreciation() != null) {
    R12cell4.setCellValue(record.getR12_depreciation().doubleValue());
    R12cell4.setCellStyle(numberStyle);
} else {
    R12cell4.setCellValue("");
    R12cell4.setCellStyle(textStyle);
}


// ==================== R13 ====================
row = sheet.getRow(12);
Cell R13cell1 = row.createCell(1);
if (record.getR13_cost() != null) {
    R13cell1.setCellValue(record.getR13_cost().doubleValue());
    R13cell1.setCellStyle(numberStyle);
} else {
    R13cell1.setCellValue("");
    R13cell1.setCellStyle(textStyle);
}

Cell R13cell2 = row.createCell(2);
if (record.getR13_add() != null) {
    R13cell2.setCellValue(record.getR13_add().doubleValue());
    R13cell2.setCellStyle(numberStyle);
} else {
    R13cell2.setCellValue("");
    R13cell2.setCellStyle(textStyle);
}

Cell R13cell3 = row.createCell(3);
if (record.getR13_disposals() != null) {
    R13cell3.setCellValue(record.getR13_disposals().doubleValue());
    R13cell3.setCellStyle(numberStyle);
} else {
    R13cell3.setCellValue("");
    R13cell3.setCellStyle(textStyle);
}

Cell R13cell4 = row.createCell(4);
if (record.getR13_depreciation() != null) {
    R13cell4.setCellValue(record.getR13_depreciation().doubleValue());
    R13cell4.setCellStyle(numberStyle);
} else {
    R13cell4.setCellValue("");
    R13cell4.setCellStyle(textStyle);
}


// ==================== R14 ====================
row = sheet.getRow(13);
Cell R14cell1 = row.createCell(1);
if (record.getR14_cost() != null) {
    R14cell1.setCellValue(record.getR14_cost().doubleValue());
    R14cell1.setCellStyle(numberStyle);
} else {
    R14cell1.setCellValue("");
    R14cell1.setCellStyle(textStyle);
}

Cell R14cell2 = row.createCell(2);
if (record.getR14_add() != null) {
    R14cell2.setCellValue(record.getR14_add().doubleValue());
    R14cell2.setCellStyle(numberStyle);
} else {
    R14cell2.setCellValue("");
    R14cell2.setCellStyle(textStyle);
}

Cell R14cell3 = row.createCell(3);
if (record.getR14_disposals() != null) {
    R14cell3.setCellValue(record.getR14_disposals().doubleValue());
    R14cell3.setCellStyle(numberStyle);
} else {
    R14cell3.setCellValue("");
    R14cell3.setCellStyle(textStyle);
}

Cell R14cell4 = row.createCell(4);
if (record.getR14_depreciation() != null) {
    R14cell4.setCellValue(record.getR14_depreciation().doubleValue());
    R14cell4.setCellStyle(numberStyle);
} else {
    R14cell4.setCellValue("");
    R14cell4.setCellStyle(textStyle);
}


// ==================== R15 ====================
row = sheet.getRow(14);
Cell R15cell1 = row.createCell(1);
if (record.getR15_cost() != null) {
    R15cell1.setCellValue(record.getR15_cost().doubleValue());
    R15cell1.setCellStyle(numberStyle);
} else {
    R15cell1.setCellValue("");
    R15cell1.setCellStyle(textStyle);
}

Cell R15cell2 = row.createCell(2);
if (record.getR15_add() != null) {
    R15cell2.setCellValue(record.getR15_add().doubleValue());
    R15cell2.setCellStyle(numberStyle);
} else {
    R15cell2.setCellValue("");
    R15cell2.setCellStyle(textStyle);
}

Cell R15cell3 = row.createCell(3);
if (record.getR15_disposals() != null) {
    R15cell3.setCellValue(record.getR15_disposals().doubleValue());
    R15cell3.setCellStyle(numberStyle);
} else {
    R15cell3.setCellValue("");
    R15cell3.setCellStyle(textStyle);
}

Cell R15cell4 = row.createCell(4);
if (record.getR15_depreciation() != null) {
    R15cell4.setCellValue(record.getR15_depreciation().doubleValue());
    R15cell4.setCellStyle(numberStyle);
} else {
    R15cell4.setCellValue("");
    R15cell4.setCellStyle(textStyle);
}


// ==================== R16 ====================
row = sheet.getRow(15);
Cell R16cell1 = row.createCell(1);
if (record.getR16_cost() != null) {
    R16cell1.setCellValue(record.getR16_cost().doubleValue());
    R16cell1.setCellStyle(numberStyle);
} else {
    R16cell1.setCellValue("");
    R16cell1.setCellStyle(textStyle);
}

Cell R16cell2 = row.createCell(2);
if (record.getR16_add() != null) {
    R16cell2.setCellValue(record.getR16_add().doubleValue());
    R16cell2.setCellStyle(numberStyle);
} else {
    R16cell2.setCellValue("");
    R16cell2.setCellStyle(textStyle);
}

Cell R16cell3 = row.createCell(3);
if (record.getR16_disposals() != null) {
    R16cell3.setCellValue(record.getR16_disposals().doubleValue());
    R16cell3.setCellStyle(numberStyle);
} else {
    R16cell3.setCellValue("");
    R16cell3.setCellStyle(textStyle);
}

Cell R16cell4 = row.createCell(4);
if (record.getR16_depreciation() != null) {
    R16cell4.setCellValue(record.getR16_depreciation().doubleValue());
    R16cell4.setCellStyle(numberStyle);
} else {
    R16cell4.setCellValue("");
    R16cell4.setCellStyle(textStyle);
}

// ==================== R23 ====================
row = sheet.getRow(22);
// R23 Col B
Cell R23cell1 = row.createCell(1);
if (record.getR23_cost_rev() != null) {
    R23cell1.setCellValue(record.getR23_cost_rev().doubleValue());
    R23cell1.setCellStyle(numberStyle);
} else {
    R23cell1.setCellValue("");
    R23cell1.setCellStyle(textStyle);
}

// R23 Col C
Cell R23cell2 = row.createCell(2);
if (record.getR23_useful_life() != null) {
    R23cell2.setCellValue(record.getR23_useful_life().doubleValue());
    R23cell2.setCellStyle(numberStyle);
} else {
    R23cell2.setCellValue("");
    R23cell2.setCellStyle(textStyle);
}

// R23 Col D
Cell R23cell3 = row.createCell(3);
if (record.getR23_res_value() != null) {
    R23cell3.setCellValue(record.getR23_res_value().doubleValue());
    R23cell3.setCellStyle(numberStyle);
} else {
    R23cell3.setCellValue("");
    R23cell3.setCellStyle(textStyle);
}

// R23 Col E
Cell R23cell4 = row.createCell(4);
if (record.getR23_month_amort() != null) {
    R23cell4.setCellValue(record.getR23_month_amort().doubleValue());
    R23cell4.setCellStyle(numberStyle);
} else {
    R23cell4.setCellValue("");
    R23cell4.setCellStyle(textStyle);
}
//R23 Col F
Cell R23cell5 = row.createCell(5);
if (record.getR23_acc_amort_amt() != null) {
    R23cell5.setCellValue(record.getR23_acc_amort_amt().doubleValue());
    R23cell5.setCellStyle(numberStyle);
} else {
    R23cell5.setCellValue("");
    R23cell5.setCellStyle(textStyle);
}
//R23 Col F
Cell R23cell6 = row.createCell(6);
if (record.getR23_close_bal() != null) {
    R23cell6.setCellValue(record.getR23_close_bal().doubleValue());
    R23cell6.setCellStyle(numberStyle);
} else {
    R23cell6.setCellValue("");
    R23cell6.setCellStyle(textStyle);
}
// ==================== R24 ====================

row = sheet.getRow(23);
// R24 Col B
Cell R24cell1 = row.createCell(1);
if (record.getR24_cost_rev() != null) {
    R24cell1.setCellValue(record.getR24_cost_rev().doubleValue());
    R24cell1.setCellStyle(numberStyle);
} else {
    R24cell1.setCellValue("");
    R24cell1.setCellStyle(textStyle);
}

// R24 Col C
Cell R24cell2 = row.createCell(2);
if (record.getR24_useful_life() != null) {
    R24cell2.setCellValue(record.getR24_useful_life().doubleValue());
    R24cell2.setCellStyle(numberStyle);
} else {
    R24cell2.setCellValue("");
    R24cell2.setCellStyle(textStyle);
}

// R24 Col D
Cell R24cell3 = row.createCell(3);
if (record.getR24_res_value() != null) {
    R24cell3.setCellValue(record.getR24_res_value().doubleValue());
    R24cell3.setCellStyle(numberStyle);
} else {
    R24cell3.setCellValue("");
    R24cell3.setCellStyle(textStyle);
}

// R24 Col E
Cell R24cell4 = row.createCell(4);
if (record.getR24_month_amort() != null) {
    R24cell4.setCellValue(record.getR24_month_amort().doubleValue());
    R24cell4.setCellStyle(numberStyle);
} else {
    R24cell4.setCellValue("");
    R24cell4.setCellStyle(textStyle);
}
//R24 Col F
Cell R24cell5 = row.createCell(5);
if (record.getR24_acc_amort_amt() != null) {
    R24cell5.setCellValue(record.getR24_acc_amort_amt().doubleValue());
    R24cell5.setCellStyle(numberStyle);
} else {
    R24cell5.setCellValue("");
    R24cell5.setCellStyle(textStyle);
}
//R24 Col F
Cell R24cell6 = row.createCell(6);
if (record.getR24_close_bal() != null) {
    R24cell6.setCellValue(record.getR24_close_bal().doubleValue());
    R24cell6.setCellStyle(numberStyle);
} else {
    R24cell6.setCellValue("");
    R24cell6.setCellStyle(textStyle);
}

// ==================== R25 ====================
row = sheet.getRow(24);
// R25 Col B
Cell R25cell1 = row.createCell(1);
if (record.getR25_cost_rev() != null) {
    R25cell1.setCellValue(record.getR25_cost_rev().doubleValue());
    R25cell1.setCellStyle(numberStyle);
} else {
    R25cell1.setCellValue("");
    R25cell1.setCellStyle(textStyle);
}

// R25 Col C
Cell R25cell2 = row.createCell(2);
if (record.getR25_useful_life() != null) {
    R25cell2.setCellValue(record.getR25_useful_life().doubleValue());
    R25cell2.setCellStyle(numberStyle);
} else {
    R25cell2.setCellValue("");
    R25cell2.setCellStyle(textStyle);
}

// R25 Col D
Cell R25cell3 = row.createCell(3);
if (record.getR25_res_value() != null) {
    R25cell3.setCellValue(record.getR25_res_value().doubleValue());
    R25cell3.setCellStyle(numberStyle);
} else {
    R25cell3.setCellValue("");
    R25cell3.setCellStyle(textStyle);
}

// R25 Col E
Cell R25cell4 = row.createCell(4);
if (record.getR25_month_amort() != null) {
    R25cell4.setCellValue(record.getR25_month_amort().doubleValue());
    R25cell4.setCellStyle(numberStyle);
} else {
    R25cell4.setCellValue("");
    R25cell4.setCellStyle(textStyle);
}
//R25 Col F
Cell R25cell5 = row.createCell(5);
if (record.getR25_acc_amort_amt() != null) {
    R25cell5.setCellValue(record.getR25_acc_amort_amt().doubleValue());
    R25cell5.setCellStyle(numberStyle);
} else {
    R25cell5.setCellValue("");
    R25cell5.setCellStyle(textStyle);
}
//R25 Col F
Cell R25cell6 = row.createCell(6);
if (record.getR25_close_bal() != null) {
    R25cell6.setCellValue(record.getR25_close_bal().doubleValue());
    R25cell6.setCellStyle(numberStyle);
} else {
    R25cell6.setCellValue("");
    R25cell6.setCellStyle(textStyle);
}

// ==================== R26 ====================
row = sheet.getRow(25);
// R26 Col B
Cell R26cell1 = row.createCell(1);
if (record.getR26_cost_rev() != null) {
    R26cell1.setCellValue(record.getR26_cost_rev().doubleValue());
    R26cell1.setCellStyle(numberStyle);
} else {
    R26cell1.setCellValue("");
    R26cell1.setCellStyle(textStyle);
}

// R26 Col C
Cell R26cell2 = row.createCell(2);
if (record.getR26_useful_life() != null) {
    R26cell2.setCellValue(record.getR26_useful_life().doubleValue());
    R26cell2.setCellStyle(numberStyle);
} else {
    R26cell2.setCellValue("");
    R26cell2.setCellStyle(textStyle);
}

// R26 Col D
Cell R26cell3 = row.createCell(3);
if (record.getR26_res_value() != null) {
    R26cell3.setCellValue(record.getR26_res_value().doubleValue());
    R26cell3.setCellStyle(numberStyle);
} else {
    R26cell3.setCellValue("");
    R26cell3.setCellStyle(textStyle);
}

// R26 Col E
Cell R26cell4 = row.createCell(4);
if (record.getR26_month_amort() != null) {
    R26cell4.setCellValue(record.getR26_month_amort().doubleValue());
    R26cell4.setCellStyle(numberStyle);
} else {
    R26cell4.setCellValue("");
    R26cell4.setCellStyle(textStyle);
}
//R26 Col F
Cell R26cell5 = row.createCell(5);
if (record.getR26_acc_amort_amt() != null) {
    R26cell5.setCellValue(record.getR26_acc_amort_amt().doubleValue());
    R26cell5.setCellStyle(numberStyle);
} else {
    R26cell5.setCellValue("");
    R26cell5.setCellStyle(textStyle);
}
//R26 Col F
Cell R26cell6 = row.createCell(6);
if (record.getR26_close_bal() != null) {
    R26cell6.setCellValue(record.getR26_close_bal().doubleValue());
    R26cell6.setCellStyle(numberStyle);
} else {
    R26cell6.setCellValue("");
    R26cell6.setCellStyle(textStyle);
}

// ==================== R27 ====================
row = sheet.getRow(26);
// R27 Col B
Cell R27cell1 = row.createCell(1);
if (record.getR27_cost_rev() != null) {
    R27cell1.setCellValue(record.getR27_cost_rev().doubleValue());
    R27cell1.setCellStyle(numberStyle);
} else {
    R27cell1.setCellValue("");
    R27cell1.setCellStyle(textStyle);
}

// R27 Col C
Cell R27cell2 = row.createCell(2);
if (record.getR27_useful_life() != null) {
    R27cell2.setCellValue(record.getR27_useful_life().doubleValue());
    R27cell2.setCellStyle(numberStyle);
} else {
    R27cell2.setCellValue("");
    R27cell2.setCellStyle(textStyle);
}

// R27 Col D
Cell R27cell3 = row.createCell(3);
if (record.getR27_res_value() != null) {
    R27cell3.setCellValue(record.getR27_res_value().doubleValue());
    R27cell3.setCellStyle(numberStyle);
} else {
    R27cell3.setCellValue("");
    R27cell3.setCellStyle(textStyle);
}

// R27 Col E
Cell R27cell4 = row.createCell(4);
if (record.getR27_month_amort() != null) {
    R27cell4.setCellValue(record.getR27_month_amort().doubleValue());
    R27cell4.setCellStyle(numberStyle);
} else {
    R27cell4.setCellValue("");
    R27cell4.setCellStyle(textStyle);
}
//R27 Col F
Cell R27cell5 = row.createCell(5);
if (record.getR27_acc_amort_amt() != null) {
    R27cell5.setCellValue(record.getR27_acc_amort_amt().doubleValue());
    R27cell5.setCellStyle(numberStyle);
} else {
    R27cell5.setCellValue("");
    R27cell5.setCellStyle(textStyle);
}
//R27 Col F
Cell R27cell6 = row.createCell(6);
if (record.getR27_close_bal() != null) {
    R27cell6.setCellValue(record.getR27_close_bal().doubleValue());
    R27cell6.setCellStyle(numberStyle);
} else {
    R27cell6.setCellValue("");
    R27cell6.setCellStyle(textStyle);
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

	public byte[] BRRS_M_FASDetailExcel(String filename, String fromdate, String todate, String currency,
										   String dtltype, String type, String version) {

		try {
			logger.info("Generating Excel for BRRSM_FAS Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("BRRS_M_FASDetails");

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
			List<M_FAS_Detail_Entity> reportData = m_FAS_Detail_Repo.getdatabydateList(parsedToDate);
			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_FAS_Detail_Entity item : reportData) {
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
				logger.info("No data found for BRRS_M_FAS — only header will be written.");
			}
			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();
			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();
		} catch (Exception e) {
			logger.error("Error generating BRRS_M_FAS Excel", e);
			return new byte[0];
		}
	}

	public List<Object> getM_FASArchival() {
		List<Object> M_SFINP2Archivallist = new ArrayList<>();
		try {
			M_SFINP2Archivallist = m_FAS_Archival_Summary_Repo.getM_FASarchival();
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

	public byte[] getSummaryExcelARCHIVAL(String filename, String reportId, String fromdate, String todate,
										   String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_FAS_Archival_Summary_Entity> dataList = m_FAS_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_FAS report. Returning empty result.");
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
					M_FAS_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
				
					// R10 Col B
Cell R10cell1 = row.createCell(1);
if (record.getR10_cost() != null) {
    R10cell1.setCellValue(record.getR10_cost().doubleValue());
    R10cell1.setCellStyle(numberStyle);
} else {
    R10cell1.setCellValue("");
    R10cell1.setCellStyle(textStyle);
}

// R10 Col C
Cell R10cell2 = row.createCell(2);
if (record.getR10_add() != null) {
    R10cell2.setCellValue(record.getR10_add().doubleValue());
    R10cell2.setCellStyle(numberStyle);
} else {
    R10cell2.setCellValue("");
    R10cell2.setCellStyle(textStyle);
}

// R10 Col D
Cell R10cell3 = row.createCell(3);
if (record.getR10_disposals() != null) {
    R10cell3.setCellValue(record.getR10_disposals().doubleValue());
    R10cell3.setCellStyle(numberStyle);
} else {
    R10cell3.setCellValue("");
    R10cell3.setCellStyle(textStyle);
}

// R10 Col E
Cell R10cell4 = row.createCell(4);
if (record.getR10_depreciation() != null) {
    R10cell4.setCellValue(record.getR10_depreciation().doubleValue());
    R10cell4.setCellStyle(numberStyle);
} else {
    R10cell4.setCellValue("");
    R10cell4.setCellStyle(textStyle);
}
// ==================== R11 ====================
// R11 Col B
row = sheet.getRow(10);
Cell R11cell1 = row.createCell(1);
if (record.getR11_cost() != null) {
    R11cell1.setCellValue(record.getR11_cost().doubleValue());
    R11cell1.setCellStyle(numberStyle);
} else {
    R11cell1.setCellValue("");
    R11cell1.setCellStyle(textStyle);
}

// R11 Col C
Cell R11cell2 = row.createCell(2);
if (record.getR11_add() != null) {
    R11cell2.setCellValue(record.getR11_add().doubleValue());
    R11cell2.setCellStyle(numberStyle);
} else {
    R11cell2.setCellValue("");
    R11cell2.setCellStyle(textStyle);
}

// R11 Col D
Cell R11cell3 = row.createCell(3);
if (record.getR11_disposals() != null) {
    R11cell3.setCellValue(record.getR11_disposals().doubleValue());
    R11cell3.setCellStyle(numberStyle);
} else {
    R11cell3.setCellValue("");
    R11cell3.setCellStyle(textStyle);
}

// R11 Col E
Cell R11cell4 = row.createCell(4);
if (record.getR11_depreciation() != null) {
    R11cell4.setCellValue(record.getR11_depreciation().doubleValue());
    R11cell4.setCellStyle(numberStyle);
} else {
    R11cell4.setCellValue("");
    R11cell4.setCellStyle(textStyle);
}


// ==================== R12 ====================
row = sheet.getRow(11);
Cell R12cell1 = row.createCell(1);
if (record.getR12_cost() != null) {
    R12cell1.setCellValue(record.getR12_cost().doubleValue());
    R12cell1.setCellStyle(numberStyle);
} else {
    R12cell1.setCellValue("");
    R12cell1.setCellStyle(textStyle);
}

Cell R12cell2 = row.createCell(2);
if (record.getR12_add() != null) {
    R12cell2.setCellValue(record.getR12_add().doubleValue());
    R12cell2.setCellStyle(numberStyle);
} else {
    R12cell2.setCellValue("");
    R12cell2.setCellStyle(textStyle);
}

Cell R12cell3 = row.createCell(3);
if (record.getR12_disposals() != null) {
    R12cell3.setCellValue(record.getR12_disposals().doubleValue());
    R12cell3.setCellStyle(numberStyle);
} else {
    R12cell3.setCellValue("");
    R12cell3.setCellStyle(textStyle);
}

Cell R12cell4 = row.createCell(4);
if (record.getR12_depreciation() != null) {
    R12cell4.setCellValue(record.getR12_depreciation().doubleValue());
    R12cell4.setCellStyle(numberStyle);
} else {
    R12cell4.setCellValue("");
    R12cell4.setCellStyle(textStyle);
}


// ==================== R13 ====================
row = sheet.getRow(12);
Cell R13cell1 = row.createCell(1);
if (record.getR13_cost() != null) {
    R13cell1.setCellValue(record.getR13_cost().doubleValue());
    R13cell1.setCellStyle(numberStyle);
} else {
    R13cell1.setCellValue("");
    R13cell1.setCellStyle(textStyle);
}

Cell R13cell2 = row.createCell(2);
if (record.getR13_add() != null) {
    R13cell2.setCellValue(record.getR13_add().doubleValue());
    R13cell2.setCellStyle(numberStyle);
} else {
    R13cell2.setCellValue("");
    R13cell2.setCellStyle(textStyle);
}

Cell R13cell3 = row.createCell(3);
if (record.getR13_disposals() != null) {
    R13cell3.setCellValue(record.getR13_disposals().doubleValue());
    R13cell3.setCellStyle(numberStyle);
} else {
    R13cell3.setCellValue("");
    R13cell3.setCellStyle(textStyle);
}

Cell R13cell4 = row.createCell(4);
if (record.getR13_depreciation() != null) {
    R13cell4.setCellValue(record.getR13_depreciation().doubleValue());
    R13cell4.setCellStyle(numberStyle);
} else {
    R13cell4.setCellValue("");
    R13cell4.setCellStyle(textStyle);
}


// ==================== R14 ====================
row = sheet.getRow(13);
Cell R14cell1 = row.createCell(1);
if (record.getR14_cost() != null) {
    R14cell1.setCellValue(record.getR14_cost().doubleValue());
    R14cell1.setCellStyle(numberStyle);
} else {
    R14cell1.setCellValue("");
    R14cell1.setCellStyle(textStyle);
}

Cell R14cell2 = row.createCell(2);
if (record.getR14_add() != null) {
    R14cell2.setCellValue(record.getR14_add().doubleValue());
    R14cell2.setCellStyle(numberStyle);
} else {
    R14cell2.setCellValue("");
    R14cell2.setCellStyle(textStyle);
}

Cell R14cell3 = row.createCell(3);
if (record.getR14_disposals() != null) {
    R14cell3.setCellValue(record.getR14_disposals().doubleValue());
    R14cell3.setCellStyle(numberStyle);
} else {
    R14cell3.setCellValue("");
    R14cell3.setCellStyle(textStyle);
}

Cell R14cell4 = row.createCell(4);
if (record.getR14_depreciation() != null) {
    R14cell4.setCellValue(record.getR14_depreciation().doubleValue());
    R14cell4.setCellStyle(numberStyle);
} else {
    R14cell4.setCellValue("");
    R14cell4.setCellStyle(textStyle);
}


// ==================== R15 ====================
row = sheet.getRow(14);
Cell R15cell1 = row.createCell(1);
if (record.getR15_cost() != null) {
    R15cell1.setCellValue(record.getR15_cost().doubleValue());
    R15cell1.setCellStyle(numberStyle);
} else {
    R15cell1.setCellValue("");
    R15cell1.setCellStyle(textStyle);
}

Cell R15cell2 = row.createCell(2);
if (record.getR15_add() != null) {
    R15cell2.setCellValue(record.getR15_add().doubleValue());
    R15cell2.setCellStyle(numberStyle);
} else {
    R15cell2.setCellValue("");
    R15cell2.setCellStyle(textStyle);
}

Cell R15cell3 = row.createCell(3);
if (record.getR15_disposals() != null) {
    R15cell3.setCellValue(record.getR15_disposals().doubleValue());
    R15cell3.setCellStyle(numberStyle);
} else {
    R15cell3.setCellValue("");
    R15cell3.setCellStyle(textStyle);
}

Cell R15cell4 = row.createCell(4);
if (record.getR15_depreciation() != null) {
    R15cell4.setCellValue(record.getR15_depreciation().doubleValue());
    R15cell4.setCellStyle(numberStyle);
} else {
    R15cell4.setCellValue("");
    R15cell4.setCellStyle(textStyle);
}


// ==================== R16 ====================
row = sheet.getRow(15);
Cell R16cell1 = row.createCell(1);
if (record.getR16_cost() != null) {
    R16cell1.setCellValue(record.getR16_cost().doubleValue());
    R16cell1.setCellStyle(numberStyle);
} else {
    R16cell1.setCellValue("");
    R16cell1.setCellStyle(textStyle);
}

Cell R16cell2 = row.createCell(2);
if (record.getR16_add() != null) {
    R16cell2.setCellValue(record.getR16_add().doubleValue());
    R16cell2.setCellStyle(numberStyle);
} else {
    R16cell2.setCellValue("");
    R16cell2.setCellStyle(textStyle);
}

Cell R16cell3 = row.createCell(3);
if (record.getR16_disposals() != null) {
    R16cell3.setCellValue(record.getR16_disposals().doubleValue());
    R16cell3.setCellStyle(numberStyle);
} else {
    R16cell3.setCellValue("");
    R16cell3.setCellStyle(textStyle);
}

Cell R16cell4 = row.createCell(4);
if (record.getR16_depreciation() != null) {
    R16cell4.setCellValue(record.getR16_depreciation().doubleValue());
    R16cell4.setCellStyle(numberStyle);
} else {
    R16cell4.setCellValue("");
    R16cell4.setCellStyle(textStyle);
}

// ==================== R23 ====================
row = sheet.getRow(22);
// R23 Col B
Cell R23cell1 = row.createCell(1);
if (record.getR23_cost_rev() != null) {
    R23cell1.setCellValue(record.getR23_cost_rev().doubleValue());
    R23cell1.setCellStyle(numberStyle);
} else {
    R23cell1.setCellValue("");
    R23cell1.setCellStyle(textStyle);
}

// R23 Col C
Cell R23cell2 = row.createCell(2);
if (record.getR23_useful_life() != null) {
    R23cell2.setCellValue(record.getR23_useful_life().doubleValue());
    R23cell2.setCellStyle(numberStyle);
} else {
    R23cell2.setCellValue("");
    R23cell2.setCellStyle(textStyle);
}

// R23 Col D
Cell R23cell3 = row.createCell(3);
if (record.getR23_res_value() != null) {
    R23cell3.setCellValue(record.getR23_res_value().doubleValue());
    R23cell3.setCellStyle(numberStyle);
} else {
    R23cell3.setCellValue("");
    R23cell3.setCellStyle(textStyle);
}

// R23 Col E
Cell R23cell4 = row.createCell(4);
if (record.getR23_month_amort() != null) {
    R23cell4.setCellValue(record.getR23_month_amort().doubleValue());
    R23cell4.setCellStyle(numberStyle);
} else {
    R23cell4.setCellValue("");
    R23cell4.setCellStyle(textStyle);
}
//R23 Col F
Cell R23cell5 = row.createCell(5);
if (record.getR23_acc_amort_amt() != null) {
    R23cell5.setCellValue(record.getR23_acc_amort_amt().doubleValue());
    R23cell5.setCellStyle(numberStyle);
} else {
    R23cell5.setCellValue("");
    R23cell5.setCellStyle(textStyle);
}
//R23 Col F
Cell R23cell6 = row.createCell(6);
if (record.getR23_close_bal() != null) {
    R23cell6.setCellValue(record.getR23_close_bal().doubleValue());
    R23cell6.setCellStyle(numberStyle);
} else {
    R23cell6.setCellValue("");
    R23cell6.setCellStyle(textStyle);
}
// ==================== R24 ====================

row = sheet.getRow(23);
// R24 Col B
Cell R24cell1 = row.createCell(1);
if (record.getR24_cost_rev() != null) {
    R24cell1.setCellValue(record.getR24_cost_rev().doubleValue());
    R24cell1.setCellStyle(numberStyle);
} else {
    R24cell1.setCellValue("");
    R24cell1.setCellStyle(textStyle);
}

// R24 Col C
Cell R24cell2 = row.createCell(2);
if (record.getR24_useful_life() != null) {
    R24cell2.setCellValue(record.getR24_useful_life().doubleValue());
    R24cell2.setCellStyle(numberStyle);
} else {
    R24cell2.setCellValue("");
    R24cell2.setCellStyle(textStyle);
}

// R24 Col D
Cell R24cell3 = row.createCell(3);
if (record.getR24_res_value() != null) {
    R24cell3.setCellValue(record.getR24_res_value().doubleValue());
    R24cell3.setCellStyle(numberStyle);
} else {
    R24cell3.setCellValue("");
    R24cell3.setCellStyle(textStyle);
}

// R24 Col E
Cell R24cell4 = row.createCell(4);
if (record.getR24_month_amort() != null) {
    R24cell4.setCellValue(record.getR24_month_amort().doubleValue());
    R24cell4.setCellStyle(numberStyle);
} else {
    R24cell4.setCellValue("");
    R24cell4.setCellStyle(textStyle);
}
//R24 Col F
Cell R24cell5 = row.createCell(5);
if (record.getR24_acc_amort_amt() != null) {
    R24cell5.setCellValue(record.getR24_acc_amort_amt().doubleValue());
    R24cell5.setCellStyle(numberStyle);
} else {
    R24cell5.setCellValue("");
    R24cell5.setCellStyle(textStyle);
}
//R24 Col F
Cell R24cell6 = row.createCell(6);
if (record.getR24_close_bal() != null) {
    R24cell6.setCellValue(record.getR24_close_bal().doubleValue());
    R24cell6.setCellStyle(numberStyle);
} else {
    R24cell6.setCellValue("");
    R24cell6.setCellStyle(textStyle);
}

// ==================== R25 ====================
row = sheet.getRow(24);
// R25 Col B
Cell R25cell1 = row.createCell(1);
if (record.getR25_cost_rev() != null) {
    R25cell1.setCellValue(record.getR25_cost_rev().doubleValue());
    R25cell1.setCellStyle(numberStyle);
} else {
    R25cell1.setCellValue("");
    R25cell1.setCellStyle(textStyle);
}

// R25 Col C
Cell R25cell2 = row.createCell(2);
if (record.getR25_useful_life() != null) {
    R25cell2.setCellValue(record.getR25_useful_life().doubleValue());
    R25cell2.setCellStyle(numberStyle);
} else {
    R25cell2.setCellValue("");
    R25cell2.setCellStyle(textStyle);
}

// R25 Col D
Cell R25cell3 = row.createCell(3);
if (record.getR25_res_value() != null) {
    R25cell3.setCellValue(record.getR25_res_value().doubleValue());
    R25cell3.setCellStyle(numberStyle);
} else {
    R25cell3.setCellValue("");
    R25cell3.setCellStyle(textStyle);
}

// R25 Col E
Cell R25cell4 = row.createCell(4);
if (record.getR25_month_amort() != null) {
    R25cell4.setCellValue(record.getR25_month_amort().doubleValue());
    R25cell4.setCellStyle(numberStyle);
} else {
    R25cell4.setCellValue("");
    R25cell4.setCellStyle(textStyle);
}
//R25 Col F
Cell R25cell5 = row.createCell(5);
if (record.getR25_acc_amort_amt() != null) {
    R25cell5.setCellValue(record.getR25_acc_amort_amt().doubleValue());
    R25cell5.setCellStyle(numberStyle);
} else {
    R25cell5.setCellValue("");
    R25cell5.setCellStyle(textStyle);
}
//R25 Col F
Cell R25cell6 = row.createCell(6);
if (record.getR25_close_bal() != null) {
    R25cell6.setCellValue(record.getR25_close_bal().doubleValue());
    R25cell6.setCellStyle(numberStyle);
} else {
    R25cell6.setCellValue("");
    R25cell6.setCellStyle(textStyle);
}

// ==================== R26 ====================
row = sheet.getRow(25);
// R26 Col B
Cell R26cell1 = row.createCell(1);
if (record.getR26_cost_rev() != null) {
    R26cell1.setCellValue(record.getR26_cost_rev().doubleValue());
    R26cell1.setCellStyle(numberStyle);
} else {
    R26cell1.setCellValue("");
    R26cell1.setCellStyle(textStyle);
}

// R26 Col C
Cell R26cell2 = row.createCell(2);
if (record.getR26_useful_life() != null) {
    R26cell2.setCellValue(record.getR26_useful_life().doubleValue());
    R26cell2.setCellStyle(numberStyle);
} else {
    R26cell2.setCellValue("");
    R26cell2.setCellStyle(textStyle);
}

// R26 Col D
Cell R26cell3 = row.createCell(3);
if (record.getR26_res_value() != null) {
    R26cell3.setCellValue(record.getR26_res_value().doubleValue());
    R26cell3.setCellStyle(numberStyle);
} else {
    R26cell3.setCellValue("");
    R26cell3.setCellStyle(textStyle);
}

// R26 Col E
Cell R26cell4 = row.createCell(4);
if (record.getR26_month_amort() != null) {
    R26cell4.setCellValue(record.getR26_month_amort().doubleValue());
    R26cell4.setCellStyle(numberStyle);
} else {
    R26cell4.setCellValue("");
    R26cell4.setCellStyle(textStyle);
}
//R26 Col F
Cell R26cell5 = row.createCell(5);
if (record.getR26_acc_amort_amt() != null) {
    R26cell5.setCellValue(record.getR26_acc_amort_amt().doubleValue());
    R26cell5.setCellStyle(numberStyle);
} else {
    R26cell5.setCellValue("");
    R26cell5.setCellStyle(textStyle);
}
//R26 Col F
Cell R26cell6 = row.createCell(6);
if (record.getR26_close_bal() != null) {
    R26cell6.setCellValue(record.getR26_close_bal().doubleValue());
    R26cell6.setCellStyle(numberStyle);
} else {
    R26cell6.setCellValue("");
    R26cell6.setCellStyle(textStyle);
}

// ==================== R27 ====================
row = sheet.getRow(26);
// R27 Col B
Cell R27cell1 = row.createCell(1);
if (record.getR27_cost_rev() != null) {
    R27cell1.setCellValue(record.getR27_cost_rev().doubleValue());
    R27cell1.setCellStyle(numberStyle);
} else {
    R27cell1.setCellValue("");
    R27cell1.setCellStyle(textStyle);
}

// R27 Col C
Cell R27cell2 = row.createCell(2);
if (record.getR27_useful_life() != null) {
    R27cell2.setCellValue(record.getR27_useful_life().doubleValue());
    R27cell2.setCellStyle(numberStyle);
} else {
    R27cell2.setCellValue("");
    R27cell2.setCellStyle(textStyle);
}

// R27 Col D
Cell R27cell3 = row.createCell(3);
if (record.getR27_res_value() != null) {
    R27cell3.setCellValue(record.getR27_res_value().doubleValue());
    R27cell3.setCellStyle(numberStyle);
} else {
    R27cell3.setCellValue("");
    R27cell3.setCellStyle(textStyle);
}

// R27 Col E
Cell R27cell4 = row.createCell(4);
if (record.getR27_month_amort() != null) {
    R27cell4.setCellValue(record.getR27_month_amort().doubleValue());
    R27cell4.setCellStyle(numberStyle);
} else {
    R27cell4.setCellValue("");
    R27cell4.setCellStyle(textStyle);
}
//R27 Col F
Cell R27cell5 = row.createCell(5);
if (record.getR27_acc_amort_amt() != null) {
    R27cell5.setCellValue(record.getR27_acc_amort_amt().doubleValue());
    R27cell5.setCellStyle(numberStyle);
} else {
    R27cell5.setCellValue("");
    R27cell5.setCellStyle(textStyle);
}
//R27 Col F
Cell R27cell6 = row.createCell(6);
if (record.getR27_close_bal() != null) {
    R27cell6.setCellValue(record.getR27_close_bal().doubleValue());
    R27cell6.setCellStyle(numberStyle);
} else {
    R27cell6.setCellValue("");
    R27cell6.setCellStyle(textStyle);
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
          logger.info("Generating Excel for BRRS_M_FAS ARCHIVAL Details...");
          System.out.println("came to Detail download service");

          //  --- Create workbook and sheet ---
          XSSFWorkbook workbook = new XSSFWorkbook();
          XSSFSheet sheet = workbook.createSheet("M_FASDetail");

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

          //  Balance style
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
         // Date parsedToDate = new SimpleDateFormat("dd-MM-yyyy").parse(todate);   //✅ match with controller
          List<M_FAS_Archival_Detail_Entity> reportData =
                  m_FAS_Archival_Detail_Repo.getdatabydateList(todate, version);

          logger.info("Fetched {} rows from DB for ARCHIVAL", reportData != null ? reportData.size() : 0);

          if (reportData != null && !reportData.isEmpty()) {
              int rowIndex = 1;
              for (M_FAS_Archival_Detail_Entity item : reportData) {
                  XSSFRow row = sheet.createRow(rowIndex++);

                  row.createCell(0).setCellValue(item.getCustId());
                  row.createCell(1).setCellValue(item.getAcctNumber());
                  row.createCell(2).setCellValue(item.getAcctName());

                  //  Balance
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

                  //  Apply data style except balance column
                  for (int j = 0; j < 7; j++) {
                      if (j != 3) {
                          row.getCell(j).setCellStyle(dataStyle);
                      }
                  }
              }
          } else {
              logger.info("⚠️ No data found for BRRS_M_FAS ARCHIVAL — only header will be written.");
          }

           // --- Write to byte[] ---
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          workbook.write(bos);
          workbook.close();

          logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
          return bos.toByteArray();

      } catch (Exception e) {
          logger.error("Error generating BRRS_M_FAS Excel", e);
          return new byte[0];
      }
  }


}
