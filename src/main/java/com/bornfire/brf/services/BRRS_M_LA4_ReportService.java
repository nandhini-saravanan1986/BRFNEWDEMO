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


import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_LA4_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_LA4_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_LA4_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_LA4_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_OR1_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_OR1_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Detail_Repo;
import com.bornfire.brf.entities.M_SFINP2_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Summary_Repo;
import com.bornfire.brf.entities.M_CA5_Summary_Entity1;
import com.bornfire.brf.entities.M_CA5_Summary_Entity2;
import com.bornfire.brf.entities.M_IS_Summary_Entity;
import com.bornfire.brf.entities.M_IS_Summary_Entity2;
import com.bornfire.brf.entities.M_LA4_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_LA4_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LA4_Detail_Entity;
import com.bornfire.brf.entities.M_LA4_Summary_Entity;
import com.bornfire.brf.entities.M_OR1_Detail_Entity;
import com.bornfire.brf.entities.M_OR1_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;

import java.math.BigDecimal;

@Component
@Service
public class BRRS_M_LA4_ReportService {
private static final Logger logger = LoggerFactory.getLogger(BRRS_M_LA4_ReportService.class);
	


	@Autowired
	private Environment env;
	
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Autowired
	BRRS_M_LA4_Detail_Repo M_LA4_DETAIL_Repo;
	
	@Autowired
	BRRS_M_LA4_Summary_Repo M_LA4_Summary_Repo;
	
	@Autowired
	BRRS_M_LA4_Archival_Detail_Repo M_LA4_Archival_Detail_Repo;

	@Autowired
	BRRS_M_LA4_Archival_Summary_Repo M_LA4_Archival_Summary_Repo;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	
	public ModelAndView getM_LA4View(String reportId, String fromdate, String todate, String currency,
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
List<M_LA4_Archival_Summary_Entity> T1Master = new ArrayList<M_LA4_Archival_Summary_Entity>();
System.out.println(version);
try {
Date d1 = dateformat.parse(todate);

// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
// ", BRF1_REPORT_ENTITY.class)
// .setParameter(1, df.parse(todate)).getResultList();
T1Master = M_LA4_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

} catch (ParseException e) {
e.printStackTrace();
}

mv.addObject("reportsummary", T1Master);
} else {
List<M_LA4_Summary_Entity> T1Master = new ArrayList<M_LA4_Summary_Entity>();
try {
Date d1 = dateformat.parse(todate);

// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
// ", BRF1_REPORT_ENTITY.class)
// .setParameter(1, df.parse(todate)).getResultList();
T1Master = M_LA4_Summary_Repo.getdatabydateList(dateformat.parse(todate));

} catch (ParseException e) {
e.printStackTrace();
}
mv.addObject("reportsummary", T1Master);
}

// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
mv.setViewName("BRRS/M_LA4");
mv.addObject("displaymode", "summary");
System.out.println("scv" + mv.getViewName());
return mv;
}

	public ModelAndView getM_LA4currentDtl(String reportId, String fromdate, String todate, String currency,
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
List<M_LA4_Archival_Detail_Entity> T1Dt1;
if (rowId != null && columnId != null) {
T1Dt1 = M_LA4_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
} else {
T1Dt1 = M_LA4_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
}

mv.addObject("reportdetails", T1Dt1);
mv.addObject("reportmaster12", T1Dt1);
System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

} else {
// 🔹 Current branch
List<M_LA4_Detail_Entity> T1Dt1;
if (rowId != null && columnId != null) {
T1Dt1 = M_LA4_DETAIL_Repo.getdatabydateListrow(parsedDate, columnId, rowId);
} else {
T1Dt1 = M_LA4_DETAIL_Repo.getdatabydateList(parsedDate, currentPage, pageSize);
totalPages = M_LA4_DETAIL_Repo.getdatacount(parsedDate);
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
mv.setViewName("BRRS/M_LA4");
mv.addObject("displaymode", "Details");
mv.addObject("currentPage", currentPage);
System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
mv.addObject("reportsflag", "reportsflag");
mv.addObject("menu", reportId);

return mv;
}

	public byte[] getM_LA4Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<M_LA4_Summary_Entity> dataList =M_LA4_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRRS report. Returning empty result.");
			return new byte[0];
		}
		String templateDir = env.getProperty("output.exportpathtemp");
		String templateFileName = filename;
		System.out.println(templateDir);
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
					M_LA4_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					Cell cell1 = row.createCell(1);
					if (record.getR12_factoring_debtors() != null) {
						cell1.setCellValue(record.getR12_factoring_debtors().doubleValue());
						cell1.setCellStyle(numberStyle);
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					
					Cell cell2 = row.createCell(2);
					if (record.getR12_leasing() != null) {
						cell2.setCellValue(record.getR12_leasing().doubleValue());
						cell2.setCellStyle(numberStyle);
					} else {
						cell2.setCellValue("");
						cell2.setCellStyle(textStyle);
					}
					
					Cell cell3 = row.createCell(3);
					if (record.getR12_overdrafts() != null) {
						cell3.setCellValue(record.getR12_overdrafts().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					
					Cell cell4 = row.createCell(4);
					if (record.getR12_other_installment_loans() != null) {
						cell4.setCellValue(record.getR12_other_installment_loans().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					
					row = sheet.getRow(12);
					if (row == null) {
					    row = sheet.createRow(12);
					}
					cell1 = row.createCell(1);
					if (record.getR13_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR13_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR13_leasing() != null) {
					    cell2.setCellValue(record.getR13_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR13_overdrafts() != null) {
					    cell3.setCellValue(record.getR13_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR13_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR13_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(13);
					if (row == null) {
					    row = sheet.createRow(13);
					}
					cell1 = row.createCell(1);
					if (record.getR14_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR14_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR14_leasing() != null) {
					    cell2.setCellValue(record.getR14_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR14_overdrafts() != null) {
					    cell3.setCellValue(record.getR14_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR14_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR14_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(14);
					if (row == null) {
					    row = sheet.createRow(14);
					}
					cell1 = row.createCell(1);
					if (record.getR15_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR15_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR15_leasing() != null) {
					    cell2.setCellValue(record.getR15_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR15_overdrafts() != null) {
					    cell3.setCellValue(record.getR15_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR15_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR15_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(15);
					if (row == null) {
					    row = sheet.createRow(15);
					}
					cell1 = row.createCell(1);
					if (record.getR16_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR16_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR16_leasing() != null) {
					    cell2.setCellValue(record.getR16_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR16_overdrafts() != null) {
					    cell3.setCellValue(record.getR16_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR16_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR16_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(16);
					if (row == null) {
					    row = sheet.createRow(16);
					}
					cell1 = row.createCell(1);
					if (record.getR17_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR17_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR17_leasing() != null) {
					    cell2.setCellValue(record.getR17_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR17_overdrafts() != null) {
					    cell3.setCellValue(record.getR17_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR17_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR17_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(17);
					if (row == null) {
					    row = sheet.createRow(17);
					}
					cell1 = row.createCell(1);
					if (record.getR18_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR18_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR18_leasing() != null) {
					    cell2.setCellValue(record.getR18_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR18_overdrafts() != null) {
					    cell3.setCellValue(record.getR18_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR18_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR18_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(18);
					if (row == null) {
					    row = sheet.createRow(18);
					}
					cell1 = row.createCell(1);
					if (record.getR19_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR19_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR19_leasing() != null) {
					    cell2.setCellValue(record.getR19_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR19_overdrafts() != null) {
					    cell3.setCellValue(record.getR19_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR19_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR19_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(19);
					if (row == null) {
					    row = sheet.createRow(19);
					}
					cell1 = row.createCell(1);
					if (record.getR20_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR20_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR20_leasing() != null) {
					    cell2.setCellValue(record.getR20_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR20_overdrafts() != null) {
					    cell3.setCellValue(record.getR20_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR20_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR20_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(20);
					if (row == null) {
					    row = sheet.createRow(20);
					}
					cell1 = row.createCell(1);
					if (record.getR21_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR21_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR21_leasing() != null) {
					    cell2.setCellValue(record.getR21_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR21_overdrafts() != null) {
					    cell3.setCellValue(record.getR21_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR21_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR21_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(21);
					if (row == null) {
					    row = sheet.createRow(21);
					}
					cell1 = row.createCell(1);
					if (record.getR22_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR22_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR22_leasing() != null) {
					    cell2.setCellValue(record.getR22_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR22_overdrafts() != null) {
					    cell3.setCellValue(record.getR22_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR22_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR22_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(22);
					if (row == null) {
					    row = sheet.createRow(22);
					}
					cell1 = row.createCell(1);
					if (record.getR23_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR23_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR23_leasing() != null) {
					    cell2.setCellValue(record.getR23_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR23_overdrafts() != null) {
					    cell3.setCellValue(record.getR23_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR23_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR23_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(23);
					if (row == null) {
					    row = sheet.createRow(23);
					}
					cell1 = row.createCell(1);
					if (record.getR24_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR24_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR24_leasing() != null) {
					    cell2.setCellValue(record.getR24_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR24_overdrafts() != null) {
					    cell3.setCellValue(record.getR24_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR24_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR24_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(24);
					if (row == null) {
					    row = sheet.createRow(24);
					}
					cell1 = row.createCell(1);
					if (record.getR25_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR25_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR25_leasing() != null) {
					    cell2.setCellValue(record.getR25_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR25_overdrafts() != null) {
					    cell3.setCellValue(record.getR25_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR25_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR25_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(25);
					if (row == null) {
					    row = sheet.createRow(25);
					}
					cell1 = row.createCell(1);
					if (record.getR26_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR26_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR26_leasing() != null) {
					    cell2.setCellValue(record.getR26_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR26_overdrafts() != null) {
					    cell3.setCellValue(record.getR26_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR26_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR26_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(26);
					if (row == null) {
					    row = sheet.createRow(26);
					}
					cell1 = row.createCell(1);
					if (record.getR27_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR27_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR27_leasing() != null) {
					    cell2.setCellValue(record.getR27_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR27_overdrafts() != null) {
					    cell3.setCellValue(record.getR27_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR27_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR27_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(27);
					if (row == null) {
					    row = sheet.createRow(27);
					}
					cell1 = row.createCell(1);
					if (record.getR28_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR28_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR28_leasing() != null) {
					    cell2.setCellValue(record.getR28_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR28_overdrafts() != null) {
					    cell3.setCellValue(record.getR28_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR28_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR28_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(28);
					if (row == null) {
					    row = sheet.createRow(28);
					}
					cell1 = row.createCell(1);
					if (record.getR29_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR29_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR29_leasing() != null) {
					    cell2.setCellValue(record.getR29_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR29_overdrafts() != null) {
					    cell3.setCellValue(record.getR29_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR29_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR29_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(29);
					if (row == null) {
					    row = sheet.createRow(29);
					}
					cell1 = row.createCell(1);
					if (record.getR30_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR30_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR30_leasing() != null) {
					    cell2.setCellValue(record.getR30_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR30_overdrafts() != null) {
					    cell3.setCellValue(record.getR30_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR30_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR30_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(30);
					if (row == null) {
					    row = sheet.createRow(30);
					}
					cell1 = row.createCell(1);
					if (record.getR31_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR31_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR31_leasing() != null) {
					    cell2.setCellValue(record.getR31_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR31_overdrafts() != null) {
					    cell3.setCellValue(record.getR31_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR31_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR31_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(31);
					if (row == null) {
					    row = sheet.createRow(31);
					}
					cell1 = row.createCell(1);
					if (record.getR32_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR32_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR32_leasing() != null) {
					    cell2.setCellValue(record.getR32_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR32_overdrafts() != null) {
					    cell3.setCellValue(record.getR32_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR32_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR32_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(32);
					if (row == null) {
					    row = sheet.createRow(32);
					}
					cell1 = row.createCell(1);
					if (record.getR33_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR33_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR33_leasing() != null) {
					    cell2.setCellValue(record.getR33_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR33_overdrafts() != null) {
					    cell3.setCellValue(record.getR33_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR33_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR33_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(33);
					if (row == null) {
					    row = sheet.createRow(33);
					}
					cell1 = row.createCell(1);
					if (record.getR34_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR34_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR34_leasing() != null) {
					    cell2.setCellValue(record.getR34_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR34_overdrafts() != null) {
					    cell3.setCellValue(record.getR34_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR34_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR34_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(34);
					if (row == null) {
					    row = sheet.createRow(34);
					}
					cell1 = row.createCell(1);
					if (record.getR35_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR35_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR35_leasing() != null) {
					    cell2.setCellValue(record.getR35_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR35_overdrafts() != null) {
					    cell3.setCellValue(record.getR35_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR35_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR35_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(35);
					if (row == null) {
					    row = sheet.createRow(35);
					}
					cell1 = row.createCell(1);
					if (record.getR36_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR36_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR36_leasing() != null) {
					    cell2.setCellValue(record.getR36_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR36_overdrafts() != null) {
					    cell3.setCellValue(record.getR36_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR36_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR36_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(36);
					if (row == null) {
					    row = sheet.createRow(36);
					}
					cell1 = row.createCell(1);
					if (record.getR37_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR37_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR37_leasing() != null) {
					    cell2.setCellValue(record.getR37_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR37_overdrafts() != null) {
					    cell3.setCellValue(record.getR37_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR37_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR37_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(37);
					if (row == null) {
					    row = sheet.createRow(37);
					}
					cell1 = row.createCell(1);
					if (record.getR38_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR38_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR38_leasing() != null) {
					    cell2.setCellValue(record.getR38_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR38_overdrafts() != null) {
					    cell3.setCellValue(record.getR38_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR38_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR38_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(38);
					if (row == null) {
					    row = sheet.createRow(38);
					}
					cell1 = row.createCell(1);
					if (record.getR39_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR39_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR39_leasing() != null) {
					    cell2.setCellValue(record.getR39_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR39_overdrafts() != null) {
					    cell3.setCellValue(record.getR39_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR39_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR39_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(39);
					if (row == null) {
					    row = sheet.createRow(39);
					}
					cell1 = row.createCell(1);
					if (record.getR40_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR40_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR40_leasing() != null) {
					    cell2.setCellValue(record.getR40_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR40_overdrafts() != null) {
					    cell3.setCellValue(record.getR40_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR40_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR40_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(40);
					if (row == null) {
					    row = sheet.createRow(40);
					}
					cell1 = row.createCell(1);
					if (record.getR41_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR41_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR41_leasing() != null) {
					    cell2.setCellValue(record.getR41_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR41_overdrafts() != null) {
					    cell3.setCellValue(record.getR41_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR41_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR41_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(41);
					if (row == null) {
					    row = sheet.createRow(41);
					}
					cell1 = row.createCell(1);
					if (record.getR42_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR42_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR42_leasing() != null) {
					    cell2.setCellValue(record.getR42_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR42_overdrafts() != null) {
					    cell3.setCellValue(record.getR42_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR42_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR42_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(42);
					if (row == null) {
					    row = sheet.createRow(42);
					}
					cell1 = row.createCell(1);
					if (record.getR43_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR43_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR43_leasing() != null) {
					    cell2.setCellValue(record.getR43_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR43_overdrafts() != null) {
					    cell3.setCellValue(record.getR43_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR43_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR43_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(43);
					if (row == null) {
					    row = sheet.createRow(43);
					}
					cell1 = row.createCell(1);
					if (record.getR44_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR44_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR44_leasing() != null) {
					    cell2.setCellValue(record.getR44_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR44_overdrafts() != null) {
					    cell3.setCellValue(record.getR44_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR44_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR44_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(44);
					if (row == null) {
					    row = sheet.createRow(44);
					}
					cell1 = row.createCell(1);
					if (record.getR45_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR45_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR45_leasing() != null) {
					    cell2.setCellValue(record.getR45_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR45_overdrafts() != null) {
					    cell3.setCellValue(record.getR45_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR45_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR45_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(45);
					if (row == null) {
					    row = sheet.createRow(45);
					}
					cell1 = row.createCell(1);
					if (record.getR46_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR46_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR46_leasing() != null) {
					    cell2.setCellValue(record.getR46_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR46_overdrafts() != null) {
					    cell3.setCellValue(record.getR46_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR46_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR46_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(46);
					if (row == null) {
					    row = sheet.createRow(46);
					}
					cell1 = row.createCell(1);
					if (record.getR47_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR47_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR47_leasing() != null) {
					    cell2.setCellValue(record.getR47_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR47_overdrafts() != null) {
					    cell3.setCellValue(record.getR47_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR47_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR47_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(47);
					if (row == null) {
					    row = sheet.createRow(47);
					}
					cell1 = row.createCell(1);
					if (record.getR48_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR48_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR48_leasing() != null) {
					    cell2.setCellValue(record.getR48_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR48_overdrafts() != null) {
					    cell3.setCellValue(record.getR48_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR48_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR48_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(48);
					if (row == null) {
					    row = sheet.createRow(48);
					}
					cell1 = row.createCell(1);
					if (record.getR49_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR49_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR49_leasing() != null) {
					    cell2.setCellValue(record.getR49_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR49_overdrafts() != null) {
					    cell3.setCellValue(record.getR49_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR49_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR49_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(49);
					if (row == null) {
					    row = sheet.createRow(49);
					}
					cell1 = row.createCell(1);
					if (record.getR50_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR50_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR50_leasing() != null) {
					    cell2.setCellValue(record.getR50_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR50_overdrafts() != null) {
					    cell3.setCellValue(record.getR50_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR50_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR50_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(50);
					if (row == null) {
					    row = sheet.createRow(50);
					}
					cell1 = row.createCell(1);
					if (record.getR51_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR51_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR51_leasing() != null) {
					    cell2.setCellValue(record.getR51_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR51_overdrafts() != null) {
					    cell3.setCellValue(record.getR51_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR51_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR51_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(51);
					if (row == null) {
					    row = sheet.createRow(51);
					}
					cell1 = row.createCell(1);
					if (record.getR52_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR52_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR52_leasing() != null) {
					    cell2.setCellValue(record.getR52_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR52_overdrafts() != null) {
					    cell3.setCellValue(record.getR52_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR52_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR52_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(52);
					if (row == null) {
					    row = sheet.createRow(52);
					}
					cell1 = row.createCell(1);
					if (record.getR53_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR53_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR53_leasing() != null) {
					    cell2.setCellValue(record.getR53_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR53_overdrafts() != null) {
					    cell3.setCellValue(record.getR53_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR53_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR53_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(53);
					if (row == null) {
					    row = sheet.createRow(53);
					}
					cell1 = row.createCell(1);
					if (record.getR54_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR54_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR54_leasing() != null) {
					    cell2.setCellValue(record.getR54_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR54_overdrafts() != null) {
					    cell3.setCellValue(record.getR54_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR54_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR54_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(54);
					if (row == null) {
					    row = sheet.createRow(54);
					}
					cell1 = row.createCell(1);
					if (record.getR55_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR55_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR55_leasing() != null) {
					    cell2.setCellValue(record.getR55_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR55_overdrafts() != null) {
					    cell3.setCellValue(record.getR55_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR55_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR55_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(55);
					if (row == null) {
					    row = sheet.createRow(55);
					}
					cell1 = row.createCell(1);
					if (record.getR56_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR56_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR56_leasing() != null) {
					    cell2.setCellValue(record.getR56_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR56_overdrafts() != null) {
					    cell3.setCellValue(record.getR56_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR56_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR56_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(56);
					if (row == null) {
					    row = sheet.createRow(56);
					}
					cell1 = row.createCell(1);
					if (record.getR57_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR57_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR57_leasing() != null) {
					    cell2.setCellValue(record.getR57_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR57_overdrafts() != null) {
					    cell3.setCellValue(record.getR57_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR57_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR57_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(57);
					if (row == null) {
					    row = sheet.createRow(57);
					}
					cell1 = row.createCell(1);
					if (record.getR58_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR58_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR58_leasing() != null) {
					    cell2.setCellValue(record.getR58_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR58_overdrafts() != null) {
					    cell3.setCellValue(record.getR58_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR58_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR58_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(58);
					if (row == null) {
					    row = sheet.createRow(58);
					}
					cell1 = row.createCell(1);
					if (record.getR59_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR59_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR59_leasing() != null) {
					    cell2.setCellValue(record.getR59_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR59_overdrafts() != null) {
					    cell3.setCellValue(record.getR59_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR59_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR59_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(59);
					if (row == null) {
					    row = sheet.createRow(59);
					}
					cell1 = row.createCell(1);
					if (record.getR60_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR60_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR60_leasing() != null) {
					    cell2.setCellValue(record.getR60_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR60_overdrafts() != null) {
					    cell3.setCellValue(record.getR60_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR60_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR60_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(60);
					if (row == null) {
					    row = sheet.createRow(60);
					}
					cell1 = row.createCell(1);
					if (record.getR61_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR61_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR61_leasing() != null) {
					    cell2.setCellValue(record.getR61_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR61_overdrafts() != null) {
					    cell3.setCellValue(record.getR61_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR61_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR61_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(61);
					if (row == null) {
					    row = sheet.createRow(61);
					}
					cell1 = row.createCell(1);
					if (record.getR62_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR62_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR62_leasing() != null) {
					    cell2.setCellValue(record.getR62_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR62_overdrafts() != null) {
					    cell3.setCellValue(record.getR62_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR62_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR62_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(62);
					if (row == null) {
					    row = sheet.createRow(62);
					}
					cell1 = row.createCell(1);
					if (record.getR63_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR63_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR63_leasing() != null) {
					    cell2.setCellValue(record.getR63_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR63_overdrafts() != null) {
					    cell3.setCellValue(record.getR63_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR63_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR63_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(63);
					if (row == null) {
					    row = sheet.createRow(63);
					}
					cell1 = row.createCell(1);
					if (record.getR64_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR64_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR64_leasing() != null) {
					    cell2.setCellValue(record.getR64_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR64_overdrafts() != null) {
					    cell3.setCellValue(record.getR64_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR64_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR64_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
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

	public byte[] M_LA4DetailExcel(String filename, String fromdate, String todate) {
	    try {
	        logger.info("Generating Excel for BRRS_M_LA4 Details...");
	        System.out.println("came to Detail download service");

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("BRRS_M_LA4Details");

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
	        List<M_LA4_Detail_Entity> reportData = M_LA4_DETAIL_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (M_LA4_Detail_Entity item : reportData) {
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
	            logger.info("No data found for M_LA4 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating M_LA4 Excel", e);
	        return new byte[0];
	    }
	}
	
	public List<Object> getM_LA4Archival() {
		List<Object> M_LA4Archivallist = new ArrayList<>();
		try {
			M_LA4Archivallist = M_LA4_Archival_Summary_Repo.getM_LA4archival();
			System.out.println("countser" + M_LA4Archivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_SFINP2 Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_LA4Archivallist;
	}

	public byte[] getExcelM_LA4ARCHIVAL(String filename, String reportId, String fromdate, String todate,
										   String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		if (type.equals("ARCHIVAL") & version != null) {

		}
		List<M_LA4_Archival_Summary_Entity> dataList = M_LA4_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_LA4 report. Returning empty result.");
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
					M_LA4_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					Cell cell1 = row.createCell(1);
					if (record.getR12_factoring_debtors() != null) {
						cell1.setCellValue(record.getR12_factoring_debtors().doubleValue());
						cell1.setCellStyle(numberStyle);
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					
					Cell cell2 = row.createCell(2);
					if (record.getR12_leasing() != null) {
						cell2.setCellValue(record.getR12_leasing().doubleValue());
						cell2.setCellStyle(numberStyle);
					} else {
						cell2.setCellValue("");
						cell2.setCellStyle(textStyle);
					}
					
					Cell cell3 = row.createCell(3);
					if (record.getR12_overdrafts() != null) {
						cell3.setCellValue(record.getR12_overdrafts().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					
					Cell cell4 = row.createCell(4);
					if (record.getR12_other_installment_loans() != null) {
						cell4.setCellValue(record.getR12_other_installment_loans().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					row = sheet.getRow(12);
					if (row == null) {
					    row = sheet.createRow(12);
					}
					cell1 = row.createCell(1);
					if (record.getR13_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR13_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR13_leasing() != null) {
					    cell2.setCellValue(record.getR13_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR13_overdrafts() != null) {
					    cell3.setCellValue(record.getR13_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR13_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR13_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(13);
					if (row == null) {
					    row = sheet.createRow(13);
					}
					cell1 = row.createCell(1);
					if (record.getR14_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR14_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR14_leasing() != null) {
					    cell2.setCellValue(record.getR14_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR14_overdrafts() != null) {
					    cell3.setCellValue(record.getR14_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR14_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR14_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(14);
					if (row == null) {
					    row = sheet.createRow(14);
					}
					cell1 = row.createCell(1);
					if (record.getR15_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR15_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR15_leasing() != null) {
					    cell2.setCellValue(record.getR15_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR15_overdrafts() != null) {
					    cell3.setCellValue(record.getR15_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR15_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR15_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(15);
					if (row == null) {
					    row = sheet.createRow(15);
					}
					cell1 = row.createCell(1);
					if (record.getR16_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR16_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR16_leasing() != null) {
					    cell2.setCellValue(record.getR16_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR16_overdrafts() != null) {
					    cell3.setCellValue(record.getR16_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR16_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR16_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(16);
					if (row == null) {
					    row = sheet.createRow(16);
					}
					cell1 = row.createCell(1);
					if (record.getR17_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR17_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR17_leasing() != null) {
					    cell2.setCellValue(record.getR17_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR17_overdrafts() != null) {
					    cell3.setCellValue(record.getR17_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR17_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR17_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(17);
					if (row == null) {
					    row = sheet.createRow(17);
					}
					cell1 = row.createCell(1);
					if (record.getR18_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR18_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR18_leasing() != null) {
					    cell2.setCellValue(record.getR18_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR18_overdrafts() != null) {
					    cell3.setCellValue(record.getR18_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR18_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR18_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(18);
					if (row == null) {
					    row = sheet.createRow(18);
					}
					cell1 = row.createCell(1);
					if (record.getR19_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR19_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR19_leasing() != null) {
					    cell2.setCellValue(record.getR19_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR19_overdrafts() != null) {
					    cell3.setCellValue(record.getR19_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR19_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR19_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(19);
					if (row == null) {
					    row = sheet.createRow(19);
					}
					cell1 = row.createCell(1);
					if (record.getR20_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR20_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR20_leasing() != null) {
					    cell2.setCellValue(record.getR20_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR20_overdrafts() != null) {
					    cell3.setCellValue(record.getR20_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR20_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR20_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(20);
					if (row == null) {
					    row = sheet.createRow(20);
					}
					cell1 = row.createCell(1);
					if (record.getR21_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR21_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR21_leasing() != null) {
					    cell2.setCellValue(record.getR21_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR21_overdrafts() != null) {
					    cell3.setCellValue(record.getR21_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR21_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR21_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(21);
					if (row == null) {
					    row = sheet.createRow(21);
					}
					cell1 = row.createCell(1);
					if (record.getR22_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR22_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR22_leasing() != null) {
					    cell2.setCellValue(record.getR22_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR22_overdrafts() != null) {
					    cell3.setCellValue(record.getR22_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR22_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR22_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(22);
					if (row == null) {
					    row = sheet.createRow(22);
					}
					cell1 = row.createCell(1);
					if (record.getR23_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR23_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR23_leasing() != null) {
					    cell2.setCellValue(record.getR23_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR23_overdrafts() != null) {
					    cell3.setCellValue(record.getR23_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR23_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR23_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(23);
					if (row == null) {
					    row = sheet.createRow(23);
					}
					cell1 = row.createCell(1);
					if (record.getR24_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR24_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR24_leasing() != null) {
					    cell2.setCellValue(record.getR24_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR24_overdrafts() != null) {
					    cell3.setCellValue(record.getR24_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR24_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR24_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(24);
					if (row == null) {
					    row = sheet.createRow(24);
					}
					cell1 = row.createCell(1);
					if (record.getR25_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR25_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR25_leasing() != null) {
					    cell2.setCellValue(record.getR25_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR25_overdrafts() != null) {
					    cell3.setCellValue(record.getR25_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR25_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR25_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(25);
					if (row == null) {
					    row = sheet.createRow(25);
					}
					cell1 = row.createCell(1);
					if (record.getR26_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR26_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR26_leasing() != null) {
					    cell2.setCellValue(record.getR26_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR26_overdrafts() != null) {
					    cell3.setCellValue(record.getR26_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR26_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR26_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(26);
					if (row == null) {
					    row = sheet.createRow(26);
					}
					cell1 = row.createCell(1);
					if (record.getR27_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR27_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR27_leasing() != null) {
					    cell2.setCellValue(record.getR27_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR27_overdrafts() != null) {
					    cell3.setCellValue(record.getR27_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR27_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR27_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(27);
					if (row == null) {
					    row = sheet.createRow(27);
					}
					cell1 = row.createCell(1);
					if (record.getR28_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR28_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR28_leasing() != null) {
					    cell2.setCellValue(record.getR28_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR28_overdrafts() != null) {
					    cell3.setCellValue(record.getR28_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR28_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR28_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(28);
					if (row == null) {
					    row = sheet.createRow(28);
					}
					cell1 = row.createCell(1);
					if (record.getR29_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR29_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR29_leasing() != null) {
					    cell2.setCellValue(record.getR29_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR29_overdrafts() != null) {
					    cell3.setCellValue(record.getR29_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR29_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR29_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(29);
					if (row == null) {
					    row = sheet.createRow(29);
					}
					cell1 = row.createCell(1);
					if (record.getR30_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR30_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR30_leasing() != null) {
					    cell2.setCellValue(record.getR30_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR30_overdrafts() != null) {
					    cell3.setCellValue(record.getR30_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR30_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR30_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(30);
					if (row == null) {
					    row = sheet.createRow(30);
					}
					cell1 = row.createCell(1);
					if (record.getR31_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR31_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR31_leasing() != null) {
					    cell2.setCellValue(record.getR31_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR31_overdrafts() != null) {
					    cell3.setCellValue(record.getR31_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR31_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR31_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(31);
					if (row == null) {
					    row = sheet.createRow(31);
					}
					cell1 = row.createCell(1);
					if (record.getR32_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR32_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR32_leasing() != null) {
					    cell2.setCellValue(record.getR32_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR32_overdrafts() != null) {
					    cell3.setCellValue(record.getR32_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR32_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR32_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(32);
					if (row == null) {
					    row = sheet.createRow(32);
					}
					cell1 = row.createCell(1);
					if (record.getR33_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR33_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR33_leasing() != null) {
					    cell2.setCellValue(record.getR33_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR33_overdrafts() != null) {
					    cell3.setCellValue(record.getR33_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR33_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR33_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(33);
					if (row == null) {
					    row = sheet.createRow(33);
					}
					cell1 = row.createCell(1);
					if (record.getR34_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR34_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR34_leasing() != null) {
					    cell2.setCellValue(record.getR34_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR34_overdrafts() != null) {
					    cell3.setCellValue(record.getR34_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR34_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR34_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(34);
					if (row == null) {
					    row = sheet.createRow(34);
					}
					cell1 = row.createCell(1);
					if (record.getR35_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR35_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR35_leasing() != null) {
					    cell2.setCellValue(record.getR35_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR35_overdrafts() != null) {
					    cell3.setCellValue(record.getR35_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR35_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR35_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(35);
					if (row == null) {
					    row = sheet.createRow(35);
					}
					cell1 = row.createCell(1);
					if (record.getR36_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR36_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR36_leasing() != null) {
					    cell2.setCellValue(record.getR36_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR36_overdrafts() != null) {
					    cell3.setCellValue(record.getR36_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR36_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR36_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(36);
					if (row == null) {
					    row = sheet.createRow(36);
					}
					cell1 = row.createCell(1);
					if (record.getR37_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR37_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR37_leasing() != null) {
					    cell2.setCellValue(record.getR37_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR37_overdrafts() != null) {
					    cell3.setCellValue(record.getR37_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR37_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR37_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(37);
					if (row == null) {
					    row = sheet.createRow(37);
					}
					cell1 = row.createCell(1);
					if (record.getR38_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR38_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR38_leasing() != null) {
					    cell2.setCellValue(record.getR38_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR38_overdrafts() != null) {
					    cell3.setCellValue(record.getR38_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR38_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR38_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(38);
					if (row == null) {
					    row = sheet.createRow(38);
					}
					cell1 = row.createCell(1);
					if (record.getR39_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR39_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR39_leasing() != null) {
					    cell2.setCellValue(record.getR39_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR39_overdrafts() != null) {
					    cell3.setCellValue(record.getR39_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR39_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR39_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(39);
					if (row == null) {
					    row = sheet.createRow(39);
					}
					cell1 = row.createCell(1);
					if (record.getR40_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR40_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR40_leasing() != null) {
					    cell2.setCellValue(record.getR40_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR40_overdrafts() != null) {
					    cell3.setCellValue(record.getR40_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR40_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR40_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(40);
					if (row == null) {
					    row = sheet.createRow(40);
					}
					cell1 = row.createCell(1);
					if (record.getR41_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR41_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR41_leasing() != null) {
					    cell2.setCellValue(record.getR41_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR41_overdrafts() != null) {
					    cell3.setCellValue(record.getR41_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR41_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR41_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(41);
					if (row == null) {
					    row = sheet.createRow(41);
					}
					cell1 = row.createCell(1);
					if (record.getR42_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR42_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR42_leasing() != null) {
					    cell2.setCellValue(record.getR42_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR42_overdrafts() != null) {
					    cell3.setCellValue(record.getR42_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR42_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR42_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(42);
					if (row == null) {
					    row = sheet.createRow(42);
					}
					cell1 = row.createCell(1);
					if (record.getR43_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR43_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR43_leasing() != null) {
					    cell2.setCellValue(record.getR43_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR43_overdrafts() != null) {
					    cell3.setCellValue(record.getR43_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR43_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR43_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(43);
					if (row == null) {
					    row = sheet.createRow(43);
					}
					cell1 = row.createCell(1);
					if (record.getR44_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR44_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR44_leasing() != null) {
					    cell2.setCellValue(record.getR44_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR44_overdrafts() != null) {
					    cell3.setCellValue(record.getR44_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR44_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR44_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(44);
					if (row == null) {
					    row = sheet.createRow(44);
					}
					cell1 = row.createCell(1);
					if (record.getR45_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR45_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR45_leasing() != null) {
					    cell2.setCellValue(record.getR45_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR45_overdrafts() != null) {
					    cell3.setCellValue(record.getR45_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR45_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR45_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(45);
					if (row == null) {
					    row = sheet.createRow(45);
					}
					cell1 = row.createCell(1);
					if (record.getR46_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR46_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR46_leasing() != null) {
					    cell2.setCellValue(record.getR46_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR46_overdrafts() != null) {
					    cell3.setCellValue(record.getR46_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR46_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR46_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(46);
					if (row == null) {
					    row = sheet.createRow(46);
					}
					cell1 = row.createCell(1);
					if (record.getR47_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR47_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR47_leasing() != null) {
					    cell2.setCellValue(record.getR47_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR47_overdrafts() != null) {
					    cell3.setCellValue(record.getR47_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR47_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR47_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(47);
					if (row == null) {
					    row = sheet.createRow(47);
					}
					cell1 = row.createCell(1);
					if (record.getR48_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR48_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR48_leasing() != null) {
					    cell2.setCellValue(record.getR48_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR48_overdrafts() != null) {
					    cell3.setCellValue(record.getR48_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR48_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR48_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(48);
					if (row == null) {
					    row = sheet.createRow(48);
					}
					cell1 = row.createCell(1);
					if (record.getR49_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR49_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR49_leasing() != null) {
					    cell2.setCellValue(record.getR49_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR49_overdrafts() != null) {
					    cell3.setCellValue(record.getR49_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR49_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR49_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(49);
					if (row == null) {
					    row = sheet.createRow(49);
					}
					cell1 = row.createCell(1);
					if (record.getR50_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR50_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR50_leasing() != null) {
					    cell2.setCellValue(record.getR50_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR50_overdrafts() != null) {
					    cell3.setCellValue(record.getR50_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR50_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR50_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(50);
					if (row == null) {
					    row = sheet.createRow(50);
					}
					cell1 = row.createCell(1);
					if (record.getR51_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR51_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR51_leasing() != null) {
					    cell2.setCellValue(record.getR51_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR51_overdrafts() != null) {
					    cell3.setCellValue(record.getR51_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR51_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR51_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(51);
					if (row == null) {
					    row = sheet.createRow(51);
					}
					cell1 = row.createCell(1);
					if (record.getR52_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR52_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR52_leasing() != null) {
					    cell2.setCellValue(record.getR52_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR52_overdrafts() != null) {
					    cell3.setCellValue(record.getR52_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR52_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR52_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(52);
					if (row == null) {
					    row = sheet.createRow(52);
					}
					cell1 = row.createCell(1);
					if (record.getR53_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR53_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR53_leasing() != null) {
					    cell2.setCellValue(record.getR53_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR53_overdrafts() != null) {
					    cell3.setCellValue(record.getR53_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR53_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR53_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(53);
					if (row == null) {
					    row = sheet.createRow(53);
					}
					cell1 = row.createCell(1);
					if (record.getR54_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR54_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR54_leasing() != null) {
					    cell2.setCellValue(record.getR54_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR54_overdrafts() != null) {
					    cell3.setCellValue(record.getR54_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR54_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR54_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(54);
					if (row == null) {
					    row = sheet.createRow(54);
					}
					cell1 = row.createCell(1);
					if (record.getR55_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR55_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR55_leasing() != null) {
					    cell2.setCellValue(record.getR55_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR55_overdrafts() != null) {
					    cell3.setCellValue(record.getR55_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR55_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR55_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(55);
					if (row == null) {
					    row = sheet.createRow(55);
					}
					cell1 = row.createCell(1);
					if (record.getR56_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR56_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR56_leasing() != null) {
					    cell2.setCellValue(record.getR56_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR56_overdrafts() != null) {
					    cell3.setCellValue(record.getR56_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR56_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR56_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(56);
					if (row == null) {
					    row = sheet.createRow(56);
					}
					cell1 = row.createCell(1);
					if (record.getR57_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR57_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR57_leasing() != null) {
					    cell2.setCellValue(record.getR57_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR57_overdrafts() != null) {
					    cell3.setCellValue(record.getR57_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR57_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR57_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(57);
					if (row == null) {
					    row = sheet.createRow(57);
					}
					cell1 = row.createCell(1);
					if (record.getR58_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR58_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR58_leasing() != null) {
					    cell2.setCellValue(record.getR58_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR58_overdrafts() != null) {
					    cell3.setCellValue(record.getR58_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR58_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR58_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(58);
					if (row == null) {
					    row = sheet.createRow(58);
					}
					cell1 = row.createCell(1);
					if (record.getR59_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR59_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR59_leasing() != null) {
					    cell2.setCellValue(record.getR59_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR59_overdrafts() != null) {
					    cell3.setCellValue(record.getR59_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR59_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR59_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(59);
					if (row == null) {
					    row = sheet.createRow(59);
					}
					cell1 = row.createCell(1);
					if (record.getR60_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR60_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR60_leasing() != null) {
					    cell2.setCellValue(record.getR60_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR60_overdrafts() != null) {
					    cell3.setCellValue(record.getR60_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR60_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR60_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(60);
					if (row == null) {
					    row = sheet.createRow(60);
					}
					cell1 = row.createCell(1);
					if (record.getR61_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR61_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR61_leasing() != null) {
					    cell2.setCellValue(record.getR61_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR61_overdrafts() != null) {
					    cell3.setCellValue(record.getR61_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR61_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR61_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(61);
					if (row == null) {
					    row = sheet.createRow(61);
					}
					cell1 = row.createCell(1);
					if (record.getR62_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR62_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR62_leasing() != null) {
					    cell2.setCellValue(record.getR62_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR62_overdrafts() != null) {
					    cell3.setCellValue(record.getR62_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR62_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR62_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(62);
					if (row == null) {
					    row = sheet.createRow(62);
					}
					cell1 = row.createCell(1);
					if (record.getR63_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR63_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR63_leasing() != null) {
					    cell2.setCellValue(record.getR63_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR63_overdrafts() != null) {
					    cell3.setCellValue(record.getR63_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR63_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR63_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
					}

					row = sheet.getRow(63);
					if (row == null) {
					    row = sheet.createRow(63);
					}
					cell1 = row.createCell(1);
					if (record.getR64_factoring_debtors() != null) {
					    cell1.setCellValue(record.getR64_factoring_debtors().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell2 = row.createCell(2);
					if (record.getR64_leasing() != null) {
					    cell2.setCellValue(record.getR64_leasing().doubleValue());
					    cell2.setCellStyle(numberStyle);
					} else {
					    cell2.setCellValue("");
					    cell2.setCellStyle(textStyle);
					}

					cell3 = row.createCell(3);
					if (record.getR64_overdrafts() != null) {
					    cell3.setCellValue(record.getR64_overdrafts().doubleValue());
					    cell3.setCellStyle(numberStyle);
					} else {
					    cell3.setCellValue("");
					    cell3.setCellStyle(textStyle);
					}

					cell4 = row.createCell(4);
					if (record.getR64_other_installment_loans() != null) {
					    cell4.setCellValue(record.getR64_other_installment_loans().doubleValue());
					    cell4.setCellStyle(numberStyle);
					} else {
					    cell4.setCellValue("");
					    cell4.setCellStyle(textStyle);
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
logger.info("Generating Excel for BRRS_M_LA4 ARCHIVAL Details...");
System.out.println("came to Detail download service");
if (type.equals("ARCHIVAL") & version != null) {

}
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("MLA4Detail");

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
List<M_LA4_Archival_Detail_Entity> reportData = M_LA4_Archival_Detail_Repo
.getdatabydateList(parsedToDate, version);

if (reportData != null && !reportData.isEmpty()) {
int rowIndex = 1;
for (M_LA4_Archival_Detail_Entity item : reportData) {
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
logger.info("No data found for BRRS_M_LA4 — only header will be written.");
}

// Write to byte[]
ByteArrayOutputStream bos = new ByteArrayOutputStream();
workbook.write(bos);
workbook.close();

logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
return bos.toByteArray();

} catch (Exception e) {
logger.error("Error generating BRRS_M_LA4Excel", e);
return new byte[0];
}
}

}







					


