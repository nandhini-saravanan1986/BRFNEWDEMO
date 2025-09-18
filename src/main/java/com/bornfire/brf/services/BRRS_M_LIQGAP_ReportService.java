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
import com.bornfire.brf.entities.BRRS_M_LIQGAP_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_LIQGAP_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_LIQGAP_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_LIQGAP_Summary_Repo;
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
import com.bornfire.brf.entities.M_LA3_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_LA3_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LA3_Detail_Entity;
import com.bornfire.brf.entities.M_LA3_Summary_Entity;
import com.bornfire.brf.entities.M_LA4_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_LA4_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LA4_Detail_Entity;
import com.bornfire.brf.entities.M_LA4_Summary_Entity;
import com.bornfire.brf.entities.M_LIQGAP_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_LIQGAP_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LIQGAP_Detail_Entity;
import com.bornfire.brf.entities.M_LIQGAP_Summary_Entity;
import com.bornfire.brf.entities.M_OR1_Detail_Entity;
import com.bornfire.brf.entities.M_OR1_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;

import java.math.BigDecimal;

@Component
@Service
public class BRRS_M_LIQGAP_ReportService {
private static final Logger logger = LoggerFactory.getLogger(BRRS_M_LIQGAP_ReportService.class);
	


	@Autowired
	private Environment env;
	
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Autowired
	BRRS_M_LIQGAP_Detail_Repo M_LIQGAP_DETAIL_Repo;
	
	@Autowired
	BRRS_M_LIQGAP_Summary_Repo M_LIQGAP_Summary_Repo;
	
	@Autowired
	BRRS_M_LIQGAP_Archival_Detail_Repo M_LIQGAP_Archival_Detail_Repo;

	@Autowired
	BRRS_M_LIQGAP_Archival_Summary_Repo M_LIQGAP_Archival_Summary_Repo;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	
	public ModelAndView getM_LIQGAPView(String reportId, String fromdate, String todate, String currency,
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
List<M_LIQGAP_Archival_Summary_Entity> T1Master = new ArrayList<M_LIQGAP_Archival_Summary_Entity>();
System.out.println(version);
try {
Date d1 = dateformat.parse(todate);

// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
// ", BRF1_REPORT_ENTITY.class)
// .setParameter(1, df.parse(todate)).getResultList();
T1Master = M_LIQGAP_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

} catch (ParseException e) {
e.printStackTrace();
}

mv.addObject("reportsummary", T1Master);
} else {
List<M_LIQGAP_Summary_Entity> T1Master = new ArrayList<M_LIQGAP_Summary_Entity>();
try {
Date d1 = dateformat.parse(todate);

// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
// ", BRF1_REPORT_ENTITY.class)
// .setParameter(1, df.parse(todate)).getResultList();
T1Master = M_LIQGAP_Summary_Repo.getdatabydateList(dateformat.parse(todate));

} catch (ParseException e) {
e.printStackTrace();
}
mv.addObject("reportsummary", T1Master);
}

// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
mv.setViewName("BRRS/M_LIQGAP");
mv.addObject("displaymode", "summary");
System.out.println("scv" + mv.getViewName());
return mv;
}

	public ModelAndView getM_LIQGAPcurrentDtl(String reportId, String fromdate, String todate, String currency,
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
List<M_LIQGAP_Archival_Detail_Entity> T1Dt1;
if (rowId != null && columnId != null) {
T1Dt1 = M_LIQGAP_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
} else {
T1Dt1 = M_LIQGAP_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
}

mv.addObject("reportdetails", T1Dt1);
mv.addObject("reportmaster12", T1Dt1);
System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

} else {
// 🔹 Current branch
List<M_LIQGAP_Detail_Entity> T1Dt1;
if (rowId != null && columnId != null) {
T1Dt1 = M_LIQGAP_DETAIL_Repo.getdatabydateListrow(parsedDate, columnId, rowId);
} else {
T1Dt1 = M_LIQGAP_DETAIL_Repo.getdatabydateList(parsedDate, currentPage, pageSize);
totalPages = M_LIQGAP_DETAIL_Repo.getdatacount(parsedDate);
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
mv.setViewName("BRRS/M_LIQGAP");
mv.addObject("displaymode", "Details");
mv.addObject("currentPage", currentPage);
System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
mv.addObject("reportsflag", "reportsflag");
mv.addObject("menu", reportId);

return mv;
}
	
	
	public byte[] getM_LIQGAPExcel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<M_LIQGAP_Summary_Entity> dataList =M_LIQGAP_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

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
			

            int startRow = 10;
			
			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					M_LIQGAP_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					Cell cell1 = row.createCell(1);
					if (record.getR11_first_month() != null) {
						cell1.setCellValue(record.getR11_first_month().doubleValue());
						cell1.setCellStyle(numberStyle);
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					
					Cell cell2 = row.createCell(2);
					if (record.getR11_third_month() != null) {
						cell2.setCellValue(record.getR11_third_month().doubleValue());
						cell2.setCellStyle(numberStyle);
					} else {
						cell2.setCellValue("");
						cell2.setCellStyle(textStyle);
					}
					
					Cell cell3 = row.createCell(3);
					if (record.getR11_last_month() != null) {
						cell3.setCellValue(record.getR11_last_month().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					
					Cell cell4 = row.createCell(4);
					if (record.getR11_first_year() != null) {
						cell4.setCellValue(record.getR11_first_year().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					Cell cell5 = row.createCell(5);
					if (record.getR11_fifth_year() != null) {
						cell5.setCellValue(record.getR11_fifth_year().doubleValue());
						cell5.setCellStyle(numberStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					Cell cell6 = row.createCell(6);
					if (record.getR11_non_interest_bearing() != null) {
						cell6.setCellValue(record.getR11_non_interest_bearing().doubleValue());
						cell6.setCellStyle(numberStyle);
					} else {
						cell6.setCellValue("");
						cell6.setCellStyle(textStyle);
					}
					
					

			        row = sheet.getRow(11);
			        cell1 = row.createCell(1);
			        if (record.getR12_first_month() != null) {
			            cell1.setCellValue(record.getR12_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR12_third_month() != null) {
			            cell2.setCellValue(record.getR12_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR12_last_month() != null) {
			            cell3.setCellValue(record.getR12_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR12_first_year() != null) {
			            cell4.setCellValue(record.getR12_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR12_fifth_year() != null) {
			            cell5.setCellValue(record.getR12_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR12_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR12_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(12);
			        cell1 = row.createCell(1);
			        if (record.getR13_first_month() != null) {
			            cell1.setCellValue(record.getR13_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR13_third_month() != null) {
			            cell2.setCellValue(record.getR13_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR13_last_month() != null) {
			            cell3.setCellValue(record.getR13_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR13_first_year() != null) {
			            cell4.setCellValue(record.getR13_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR13_fifth_year() != null) {
			            cell5.setCellValue(record.getR13_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR13_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR13_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(13);
			        cell1 = row.createCell(1);
			        if (record.getR14_first_month() != null) {
			            cell1.setCellValue(record.getR14_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR14_third_month() != null) {
			            cell2.setCellValue(record.getR14_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR14_last_month() != null) {
			            cell3.setCellValue(record.getR14_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR14_first_year() != null) {
			            cell4.setCellValue(record.getR14_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR14_fifth_year() != null) {
			            cell5.setCellValue(record.getR14_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR14_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR14_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(14);
			        cell1 = row.createCell(1);
			        if (record.getR15_first_month() != null) {
			            cell1.setCellValue(record.getR15_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR15_third_month() != null) {
			            cell2.setCellValue(record.getR15_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR15_last_month() != null) {
			            cell3.setCellValue(record.getR15_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR15_first_year() != null) {
			            cell4.setCellValue(record.getR15_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR15_fifth_year() != null) {
			            cell5.setCellValue(record.getR15_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR15_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR15_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(15);
			        cell1 = row.createCell(1);
			        if (record.getR16_first_month() != null) {
			            cell1.setCellValue(record.getR16_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR16_third_month() != null) {
			            cell2.setCellValue(record.getR16_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR16_last_month() != null) {
			            cell3.setCellValue(record.getR16_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR16_first_year() != null) {
			            cell4.setCellValue(record.getR16_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR16_fifth_year() != null) {
			            cell5.setCellValue(record.getR16_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR16_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR16_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(16);
			        cell1 = row.createCell(1);
			        if (record.getR17_first_month() != null) {
			            cell1.setCellValue(record.getR17_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR17_third_month() != null) {
			            cell2.setCellValue(record.getR17_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR17_last_month() != null) {
			            cell3.setCellValue(record.getR17_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR17_first_year() != null) {
			            cell4.setCellValue(record.getR17_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR17_fifth_year() != null) {
			            cell5.setCellValue(record.getR17_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR17_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR17_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(17);
			        cell1 = row.createCell(1);
			        if (record.getR18_first_month() != null) {
			            cell1.setCellValue(record.getR18_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR18_third_month() != null) {
			            cell2.setCellValue(record.getR18_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR18_last_month() != null) {
			            cell3.setCellValue(record.getR18_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR18_first_year() != null) {
			            cell4.setCellValue(record.getR18_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR18_fifth_year() != null) {
			            cell5.setCellValue(record.getR18_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR18_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR18_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(18);
			        cell1 = row.createCell(1);
			        if (record.getR19_first_month() != null) {
			            cell1.setCellValue(record.getR19_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR19_third_month() != null) {
			            cell2.setCellValue(record.getR19_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR19_last_month() != null) {
			            cell3.setCellValue(record.getR19_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR19_first_year() != null) {
			            cell4.setCellValue(record.getR19_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR19_fifth_year() != null) {
			            cell5.setCellValue(record.getR19_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR19_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR19_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(19);
			        cell1 = row.createCell(1);
			        if (record.getR20_first_month() != null) {
			            cell1.setCellValue(record.getR20_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR20_third_month() != null) {
			            cell2.setCellValue(record.getR20_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR20_last_month() != null) {
			            cell3.setCellValue(record.getR20_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR20_first_year() != null) {
			            cell4.setCellValue(record.getR20_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR20_fifth_year() != null) {
			            cell5.setCellValue(record.getR20_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR20_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR20_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(20);
			        cell1 = row.createCell(1);
			        if (record.getR21_first_month() != null) {
			            cell1.setCellValue(record.getR21_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR21_third_month() != null) {
			            cell2.setCellValue(record.getR21_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR21_last_month() != null) {
			            cell3.setCellValue(record.getR21_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR21_first_year() != null) {
			            cell4.setCellValue(record.getR21_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR21_fifth_year() != null) {
			            cell5.setCellValue(record.getR21_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR21_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR21_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(21);
			        cell1 = row.createCell(1);
			        if (record.getR22_first_month() != null) {
			            cell1.setCellValue(record.getR22_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR22_third_month() != null) {
			            cell2.setCellValue(record.getR22_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR22_last_month() != null) {
			            cell3.setCellValue(record.getR22_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR22_first_year() != null) {
			            cell4.setCellValue(record.getR22_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR22_fifth_year() != null) {
			            cell5.setCellValue(record.getR22_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR22_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR22_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(22);
			        cell1 = row.createCell(1);
			        if (record.getR23_first_month() != null) {
			            cell1.setCellValue(record.getR23_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR23_third_month() != null) {
			            cell2.setCellValue(record.getR23_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR23_last_month() != null) {
			            cell3.setCellValue(record.getR23_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR23_first_year() != null) {
			            cell4.setCellValue(record.getR23_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR23_fifth_year() != null) {
			            cell5.setCellValue(record.getR23_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR23_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR23_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(23);
			        cell1 = row.createCell(1);
			        if (record.getR24_first_month() != null) {
			            cell1.setCellValue(record.getR24_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR24_third_month() != null) {
			            cell2.setCellValue(record.getR24_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR24_last_month() != null) {
			            cell3.setCellValue(record.getR24_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR24_first_year() != null) {
			            cell4.setCellValue(record.getR24_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR24_fifth_year() != null) {
			            cell5.setCellValue(record.getR24_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR24_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR24_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(24);
			        cell1 = row.createCell(1);
			        if (record.getR25_first_month() != null) {
			            cell1.setCellValue(record.getR25_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR25_third_month() != null) {
			            cell2.setCellValue(record.getR25_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR25_last_month() != null) {
			            cell3.setCellValue(record.getR25_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR25_first_year() != null) {
			            cell4.setCellValue(record.getR25_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR25_fifth_year() != null) {
			            cell5.setCellValue(record.getR25_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR25_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR25_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(25);
			        cell1 = row.createCell(1);
			        if (record.getR26_first_month() != null) {
			            cell1.setCellValue(record.getR26_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR26_third_month() != null) {
			            cell2.setCellValue(record.getR26_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR26_last_month() != null) {
			            cell3.setCellValue(record.getR26_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR26_first_year() != null) {
			            cell4.setCellValue(record.getR26_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR26_fifth_year() != null) {
			            cell5.setCellValue(record.getR26_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR26_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR26_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }

			        row = sheet.getRow(27);
			        cell1 = row.createCell(1);
			        if (record.getR28_first_month() != null) {
			            cell1.setCellValue(record.getR28_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR28_third_month() != null) {
			            cell2.setCellValue(record.getR28_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR28_last_month() != null) {
			            cell3.setCellValue(record.getR28_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR28_first_year() != null) {
			            cell4.setCellValue(record.getR28_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR28_fifth_year() != null) {
			            cell5.setCellValue(record.getR28_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR28_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR28_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(28);
			        cell1 = row.createCell(1);
			        if (record.getR29_first_month() != null) {
			            cell1.setCellValue(record.getR29_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR29_third_month() != null) {
			            cell2.setCellValue(record.getR29_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR29_last_month() != null) {
			            cell3.setCellValue(record.getR29_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR29_first_year() != null) {
			            cell4.setCellValue(record.getR29_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR29_fifth_year() != null) {
			            cell5.setCellValue(record.getR29_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR29_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR29_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(29);
			        cell1 = row.createCell(1);
			        if (record.getR30_first_month() != null) {
			            cell1.setCellValue(record.getR30_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR30_third_month() != null) {
			            cell2.setCellValue(record.getR30_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR30_last_month() != null) {
			            cell3.setCellValue(record.getR30_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR30_first_year() != null) {
			            cell4.setCellValue(record.getR30_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR30_fifth_year() != null) {
			            cell5.setCellValue(record.getR30_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR30_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR30_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(30);
			        cell1 = row.createCell(1);
			        if (record.getR31_first_month() != null) {
			            cell1.setCellValue(record.getR31_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR31_third_month() != null) {
			            cell2.setCellValue(record.getR31_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR31_last_month() != null) {
			            cell3.setCellValue(record.getR31_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR31_first_year() != null) {
			            cell4.setCellValue(record.getR31_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR31_fifth_year() != null) {
			            cell5.setCellValue(record.getR31_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR31_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR31_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(31);
			        cell1 = row.createCell(1);
			        if (record.getR32_first_month() != null) {
			            cell1.setCellValue(record.getR32_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR32_third_month() != null) {
			            cell2.setCellValue(record.getR32_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR32_last_month() != null) {
			            cell3.setCellValue(record.getR32_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR32_first_year() != null) {
			            cell4.setCellValue(record.getR32_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR32_fifth_year() != null) {
			            cell5.setCellValue(record.getR32_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR32_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR32_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(32);
			        cell1 = row.createCell(1);
			        if (record.getR33_first_month() != null) {
			            cell1.setCellValue(record.getR33_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR33_third_month() != null) {
			            cell2.setCellValue(record.getR33_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR33_last_month() != null) {
			            cell3.setCellValue(record.getR33_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR33_first_year() != null) {
			            cell4.setCellValue(record.getR33_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR33_fifth_year() != null) {
			            cell5.setCellValue(record.getR33_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR33_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR33_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(33);
			        cell1 = row.createCell(1);
			        if (record.getR34_first_month() != null) {
			            cell1.setCellValue(record.getR34_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR34_third_month() != null) {
			            cell2.setCellValue(record.getR34_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR34_last_month() != null) {
			            cell3.setCellValue(record.getR34_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR34_first_year() != null) {
			            cell4.setCellValue(record.getR34_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR34_fifth_year() != null) {
			            cell5.setCellValue(record.getR34_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR34_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR34_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(34);
			        cell1 = row.createCell(1);
			        if (record.getR35_first_month() != null) {
			            cell1.setCellValue(record.getR35_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR35_third_month() != null) {
			            cell2.setCellValue(record.getR35_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR35_last_month() != null) {
			            cell3.setCellValue(record.getR35_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR35_first_year() != null) {
			            cell4.setCellValue(record.getR35_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR35_fifth_year() != null) {
			            cell5.setCellValue(record.getR35_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR35_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR35_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(35);
			        cell1 = row.createCell(1);
			        if (record.getR36_first_month() != null) {
			            cell1.setCellValue(record.getR36_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR36_third_month() != null) {
			            cell2.setCellValue(record.getR36_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR36_last_month() != null) {
			            cell3.setCellValue(record.getR36_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR36_first_year() != null) {
			            cell4.setCellValue(record.getR36_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR36_fifth_year() != null) {
			            cell5.setCellValue(record.getR36_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR36_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR36_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(36);
			        cell1 = row.createCell(1);
			        if (record.getR37_first_month() != null) {
			            cell1.setCellValue(record.getR37_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR37_third_month() != null) {
			            cell2.setCellValue(record.getR37_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR37_last_month() != null) {
			            cell3.setCellValue(record.getR37_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR37_first_year() != null) {
			            cell4.setCellValue(record.getR37_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR37_fifth_year() != null) {
			            cell5.setCellValue(record.getR37_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR37_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR37_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(37);
			        cell1 = row.createCell(1);
			        if (record.getR38_first_month() != null) {
			            cell1.setCellValue(record.getR38_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR38_third_month() != null) {
			            cell2.setCellValue(record.getR38_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR38_last_month() != null) {
			            cell3.setCellValue(record.getR38_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR38_first_year() != null) {
			            cell4.setCellValue(record.getR38_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR38_fifth_year() != null) {
			            cell5.setCellValue(record.getR38_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR38_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR38_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(38);
			        cell1 = row.createCell(1);
			        if (record.getR39_first_month() != null) {
			            cell1.setCellValue(record.getR39_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR39_third_month() != null) {
			            cell2.setCellValue(record.getR39_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR39_last_month() != null) {
			            cell3.setCellValue(record.getR39_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR39_first_year() != null) {
			            cell4.setCellValue(record.getR39_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR39_fifth_year() != null) {
			            cell5.setCellValue(record.getR39_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR39_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR39_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(39);
			        cell1 = row.createCell(1);
			        if (record.getR40_first_month() != null) {
			            cell1.setCellValue(record.getR40_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR40_third_month() != null) {
			            cell2.setCellValue(record.getR40_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR40_last_month() != null) {
			            cell3.setCellValue(record.getR40_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR40_first_year() != null) {
			            cell4.setCellValue(record.getR40_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR40_fifth_year() != null) {
			            cell5.setCellValue(record.getR40_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR40_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR40_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(40);
			        cell1 = row.createCell(1);
			        if (record.getR41_first_month() != null) {
			            cell1.setCellValue(record.getR41_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR41_third_month() != null) {
			            cell2.setCellValue(record.getR41_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR41_last_month() != null) {
			            cell3.setCellValue(record.getR41_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR41_first_year() != null) {
			            cell4.setCellValue(record.getR41_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR41_fifth_year() != null) {
			            cell5.setCellValue(record.getR41_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR41_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR41_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(41);
			        cell1 = row.createCell(1);
			        if (record.getR42_first_month() != null) {
			            cell1.setCellValue(record.getR42_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR42_third_month() != null) {
			            cell2.setCellValue(record.getR42_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR42_last_month() != null) {
			            cell3.setCellValue(record.getR42_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR42_first_year() != null) {
			            cell4.setCellValue(record.getR42_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR42_fifth_year() != null) {
			            cell5.setCellValue(record.getR42_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR42_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR42_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(42);
			        cell1 = row.createCell(1);
			        if (record.getR43_first_month() != null) {
			            cell1.setCellValue(record.getR43_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR43_third_month() != null) {
			            cell2.setCellValue(record.getR43_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR43_last_month() != null) {
			            cell3.setCellValue(record.getR43_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR43_first_year() != null) {
			            cell4.setCellValue(record.getR43_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR43_fifth_year() != null) {
			            cell5.setCellValue(record.getR43_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR43_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR43_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(43);
			        cell1 = row.createCell(1);
			        if (record.getR44_first_month() != null) {
			            cell1.setCellValue(record.getR44_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR44_third_month() != null) {
			            cell2.setCellValue(record.getR44_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR44_last_month() != null) {
			            cell3.setCellValue(record.getR44_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR44_first_year() != null) {
			            cell4.setCellValue(record.getR44_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR44_fifth_year() != null) {
			            cell5.setCellValue(record.getR44_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR44_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR44_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(44);
			        cell1 = row.createCell(1);
			        if (record.getR45_first_month() != null) {
			            cell1.setCellValue(record.getR45_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR45_third_month() != null) {
			            cell2.setCellValue(record.getR45_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR45_last_month() != null) {
			            cell3.setCellValue(record.getR45_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR45_first_year() != null) {
			            cell4.setCellValue(record.getR45_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR45_fifth_year() != null) {
			            cell5.setCellValue(record.getR45_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR45_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR45_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(45);
			        cell1 = row.createCell(1);
			        if (record.getR46_first_month() != null) {
			            cell1.setCellValue(record.getR46_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR46_third_month() != null) {
			            cell2.setCellValue(record.getR46_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR46_last_month() != null) {
			            cell3.setCellValue(record.getR46_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR46_first_year() != null) {
			            cell4.setCellValue(record.getR46_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR46_fifth_year() != null) {
			            cell5.setCellValue(record.getR46_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR46_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR46_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(46);
			        cell1 = row.createCell(1);
			        if (record.getR47_first_month() != null) {
			            cell1.setCellValue(record.getR47_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR47_third_month() != null) {
			            cell2.setCellValue(record.getR47_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR47_last_month() != null) {
			            cell3.setCellValue(record.getR47_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR47_first_year() != null) {
			            cell4.setCellValue(record.getR47_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR47_fifth_year() != null) {
			            cell5.setCellValue(record.getR47_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR47_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR47_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(47);
			        cell1 = row.createCell(1);
			        if (record.getR48_first_month() != null) {
			            cell1.setCellValue(record.getR48_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR48_third_month() != null) {
			            cell2.setCellValue(record.getR48_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR48_last_month() != null) {
			            cell3.setCellValue(record.getR48_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR48_first_year() != null) {
			            cell4.setCellValue(record.getR48_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR48_fifth_year() != null) {
			            cell5.setCellValue(record.getR48_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR48_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR48_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
			        }


			        row = sheet.getRow(48);
			        cell1 = row.createCell(1);
			        if (record.getR49_first_month() != null) {
			            cell1.setCellValue(record.getR49_first_month().doubleValue());
			            cell1.setCellStyle(numberStyle);
			        } else {
			            cell1.setCellValue("");
			            cell1.setCellStyle(textStyle);
			        }
			        
			        cell2 = row.createCell(2);
			        if (record.getR49_third_month() != null) {
			            cell2.setCellValue(record.getR49_third_month().doubleValue());
			            cell2.setCellStyle(numberStyle);
			        } else {
			            cell2.setCellValue("");
			            cell2.setCellStyle(textStyle);
			        }
			        
			        cell3 = row.createCell(3);
			        if (record.getR49_last_month() != null) {
			            cell3.setCellValue(record.getR49_last_month().doubleValue());
			            cell3.setCellStyle(numberStyle);
			        } else {
			            cell3.setCellValue("");
			            cell3.setCellStyle(textStyle);
			        }
			        
			        cell4 = row.createCell(4);
			        if (record.getR49_first_year() != null) {
			            cell4.setCellValue(record.getR49_first_year().doubleValue());
			            cell4.setCellStyle(numberStyle);
			        } else {
			            cell4.setCellValue("");
			            cell4.setCellStyle(textStyle);
			        }
			        
			        cell5 = row.createCell(5);
			        if (record.getR49_fifth_year() != null) {
			            cell5.setCellValue(record.getR49_fifth_year().doubleValue());
			            cell5.setCellStyle(numberStyle);
			        } else {
			            cell5.setCellValue("");
			            cell5.setCellStyle(textStyle);
			        }
			        
			        cell6 = row.createCell(6);
			        if (record.getR49_non_interest_bearing() != null) {
			            cell6.setCellValue(record.getR49_non_interest_bearing().doubleValue());
			            cell6.setCellStyle(numberStyle);
			        } else {
			            cell6.setCellValue("");
			            cell6.setCellStyle(textStyle);
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
	
	
	public byte[] M_LIQGAPDetailExcel(String filename, String fromdate, String todate) {
	    try {
	        logger.info("Generating Excel for BRRS_M_LIQGAP Details...");
	        System.out.println("came to Detail download service");

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("BRRS_M_LIQGAPDetails");

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
	        List<M_LIQGAP_Detail_Entity> reportData = M_LIQGAP_DETAIL_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (M_LIQGAP_Detail_Entity item : reportData) {
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
	            logger.info("No data found for M_LA3 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating M_LA3 Excel", e);
	        return new byte[0];
	    }
	}
	
	public List<Object> getM_LIQGAPArchival() {
		List<Object> M_LIQLAPArchivallist = new ArrayList<>();
		try {
			M_LIQLAPArchivallist = M_LIQGAP_Archival_Summary_Repo.getM_LIQGAParchival();
			System.out.println("countser" + M_LIQLAPArchivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_LIQLAP Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_LIQLAPArchivallist;
	}

	public byte[] getExcelM_LIQLAPARCHIVAL(String filename, String reportId, String fromdate, String todate,
			   String currency, String dtltype, String type, String version) throws Exception {
logger.info("Service: Starting Excel generation process in memory.");
if (type.equals("ARCHIVAL") & version != null) {

}
List<M_LIQGAP_Archival_Summary_Entity> dataList = M_LIQGAP_Archival_Summary_Repo
.getdatabydateListarchival(dateformat.parse(todate), version);

if (dataList.isEmpty()) {
logger.warn("Service: No data found for M_LA3 report. Returning empty result.");
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

int startRow = 10;

if (!dataList.isEmpty()) {
	for (int i = 0; i < dataList.size(); i++) {
		M_LIQGAP_Archival_Summary_Entity record = dataList.get(i);
		System.out.println("rownumber="+startRow + i);
		Row row = sheet.getRow(startRow + i);
		if (row == null) {
			row = sheet.createRow(startRow + i);
		}
		
		Cell cell1 = row.createCell(1);
		if (record.getR11_first_month() != null) {
			cell1.setCellValue(record.getR11_first_month().doubleValue());
			cell1.setCellStyle(numberStyle);
		} else {
			cell1.setCellValue("");
			cell1.setCellStyle(textStyle);
		}
		
		Cell cell2 = row.createCell(2);
		if (record.getR11_third_month() != null) {
			cell2.setCellValue(record.getR11_third_month().doubleValue());
			cell2.setCellStyle(numberStyle);
		} else {
			cell2.setCellValue("");
			cell2.setCellStyle(textStyle);
		}
		
		Cell cell3 = row.createCell(3);
		if (record.getR11_last_month() != null) {
			cell3.setCellValue(record.getR11_last_month().doubleValue());
			cell3.setCellStyle(numberStyle);
		} else {
			cell3.setCellValue("");
			cell3.setCellStyle(textStyle);
		}
		
		Cell cell4 = row.createCell(4);
		if (record.getR11_first_year() != null) {
			cell4.setCellValue(record.getR11_first_year().doubleValue());
			cell4.setCellStyle(numberStyle);
		} else {
			cell4.setCellValue("");
			cell4.setCellStyle(textStyle);
		}
		
		Cell cell5 = row.createCell(5);
		if (record.getR11_fifth_year() != null) {
			cell5.setCellValue(record.getR11_fifth_year().doubleValue());
			cell5.setCellStyle(numberStyle);
		} else {
			cell5.setCellValue("");
			cell5.setCellStyle(textStyle);
		}
		
		Cell cell6 = row.createCell(6);
		if (record.getR11_non_interest_bearing() != null) {
			cell6.setCellValue(record.getR11_non_interest_bearing().doubleValue());
			cell6.setCellStyle(numberStyle);
		} else {
			cell6.setCellValue("");
			cell6.setCellStyle(textStyle);
		}
		
		

        row = sheet.getRow(11);
        cell1 = row.createCell(1);
        if (record.getR12_first_month() != null) {
            cell1.setCellValue(record.getR12_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR12_third_month() != null) {
            cell2.setCellValue(record.getR12_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR12_last_month() != null) {
            cell3.setCellValue(record.getR12_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR12_first_year() != null) {
            cell4.setCellValue(record.getR12_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR12_fifth_year() != null) {
            cell5.setCellValue(record.getR12_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR12_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR12_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(12);
        cell1 = row.createCell(1);
        if (record.getR13_first_month() != null) {
            cell1.setCellValue(record.getR13_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR13_third_month() != null) {
            cell2.setCellValue(record.getR13_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR13_last_month() != null) {
            cell3.setCellValue(record.getR13_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR13_first_year() != null) {
            cell4.setCellValue(record.getR13_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR13_fifth_year() != null) {
            cell5.setCellValue(record.getR13_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR13_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR13_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(13);
        cell1 = row.createCell(1);
        if (record.getR14_first_month() != null) {
            cell1.setCellValue(record.getR14_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR14_third_month() != null) {
            cell2.setCellValue(record.getR14_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR14_last_month() != null) {
            cell3.setCellValue(record.getR14_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR14_first_year() != null) {
            cell4.setCellValue(record.getR14_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR14_fifth_year() != null) {
            cell5.setCellValue(record.getR14_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR14_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR14_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(14);
        cell1 = row.createCell(1);
        if (record.getR15_first_month() != null) {
            cell1.setCellValue(record.getR15_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR15_third_month() != null) {
            cell2.setCellValue(record.getR15_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR15_last_month() != null) {
            cell3.setCellValue(record.getR15_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR15_first_year() != null) {
            cell4.setCellValue(record.getR15_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR15_fifth_year() != null) {
            cell5.setCellValue(record.getR15_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR15_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR15_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(15);
        cell1 = row.createCell(1);
        if (record.getR16_first_month() != null) {
            cell1.setCellValue(record.getR16_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR16_third_month() != null) {
            cell2.setCellValue(record.getR16_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR16_last_month() != null) {
            cell3.setCellValue(record.getR16_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR16_first_year() != null) {
            cell4.setCellValue(record.getR16_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR16_fifth_year() != null) {
            cell5.setCellValue(record.getR16_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR16_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR16_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(16);
        cell1 = row.createCell(1);
        if (record.getR17_first_month() != null) {
            cell1.setCellValue(record.getR17_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR17_third_month() != null) {
            cell2.setCellValue(record.getR17_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR17_last_month() != null) {
            cell3.setCellValue(record.getR17_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR17_first_year() != null) {
            cell4.setCellValue(record.getR17_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR17_fifth_year() != null) {
            cell5.setCellValue(record.getR17_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR17_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR17_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(17);
        cell1 = row.createCell(1);
        if (record.getR18_first_month() != null) {
            cell1.setCellValue(record.getR18_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR18_third_month() != null) {
            cell2.setCellValue(record.getR18_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR18_last_month() != null) {
            cell3.setCellValue(record.getR18_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR18_first_year() != null) {
            cell4.setCellValue(record.getR18_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR18_fifth_year() != null) {
            cell5.setCellValue(record.getR18_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR18_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR18_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(18);
        cell1 = row.createCell(1);
        if (record.getR19_first_month() != null) {
            cell1.setCellValue(record.getR19_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR19_third_month() != null) {
            cell2.setCellValue(record.getR19_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR19_last_month() != null) {
            cell3.setCellValue(record.getR19_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR19_first_year() != null) {
            cell4.setCellValue(record.getR19_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR19_fifth_year() != null) {
            cell5.setCellValue(record.getR19_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR19_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR19_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(19);
        cell1 = row.createCell(1);
        if (record.getR20_first_month() != null) {
            cell1.setCellValue(record.getR20_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR20_third_month() != null) {
            cell2.setCellValue(record.getR20_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR20_last_month() != null) {
            cell3.setCellValue(record.getR20_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR20_first_year() != null) {
            cell4.setCellValue(record.getR20_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR20_fifth_year() != null) {
            cell5.setCellValue(record.getR20_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR20_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR20_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(20);
        cell1 = row.createCell(1);
        if (record.getR21_first_month() != null) {
            cell1.setCellValue(record.getR21_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR21_third_month() != null) {
            cell2.setCellValue(record.getR21_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR21_last_month() != null) {
            cell3.setCellValue(record.getR21_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR21_first_year() != null) {
            cell4.setCellValue(record.getR21_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR21_fifth_year() != null) {
            cell5.setCellValue(record.getR21_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR21_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR21_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(21);
        cell1 = row.createCell(1);
        if (record.getR22_first_month() != null) {
            cell1.setCellValue(record.getR22_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR22_third_month() != null) {
            cell2.setCellValue(record.getR22_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR22_last_month() != null) {
            cell3.setCellValue(record.getR22_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR22_first_year() != null) {
            cell4.setCellValue(record.getR22_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR22_fifth_year() != null) {
            cell5.setCellValue(record.getR22_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR22_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR22_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(22);
        cell1 = row.createCell(1);
        if (record.getR23_first_month() != null) {
            cell1.setCellValue(record.getR23_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR23_third_month() != null) {
            cell2.setCellValue(record.getR23_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR23_last_month() != null) {
            cell3.setCellValue(record.getR23_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR23_first_year() != null) {
            cell4.setCellValue(record.getR23_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR23_fifth_year() != null) {
            cell5.setCellValue(record.getR23_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR23_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR23_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(23);
        cell1 = row.createCell(1);
        if (record.getR24_first_month() != null) {
            cell1.setCellValue(record.getR24_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR24_third_month() != null) {
            cell2.setCellValue(record.getR24_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR24_last_month() != null) {
            cell3.setCellValue(record.getR24_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR24_first_year() != null) {
            cell4.setCellValue(record.getR24_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR24_fifth_year() != null) {
            cell5.setCellValue(record.getR24_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR24_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR24_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(24);
        cell1 = row.createCell(1);
        if (record.getR25_first_month() != null) {
            cell1.setCellValue(record.getR25_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR25_third_month() != null) {
            cell2.setCellValue(record.getR25_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR25_last_month() != null) {
            cell3.setCellValue(record.getR25_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR25_first_year() != null) {
            cell4.setCellValue(record.getR25_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR25_fifth_year() != null) {
            cell5.setCellValue(record.getR25_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR25_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR25_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(25);
        cell1 = row.createCell(1);
        if (record.getR26_first_month() != null) {
            cell1.setCellValue(record.getR26_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR26_third_month() != null) {
            cell2.setCellValue(record.getR26_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR26_last_month() != null) {
            cell3.setCellValue(record.getR26_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR26_first_year() != null) {
            cell4.setCellValue(record.getR26_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR26_fifth_year() != null) {
            cell5.setCellValue(record.getR26_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR26_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR26_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }

        row = sheet.getRow(27);
        cell1 = row.createCell(1);
        if (record.getR28_first_month() != null) {
            cell1.setCellValue(record.getR28_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR28_third_month() != null) {
            cell2.setCellValue(record.getR28_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR28_last_month() != null) {
            cell3.setCellValue(record.getR28_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR28_first_year() != null) {
            cell4.setCellValue(record.getR28_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR28_fifth_year() != null) {
            cell5.setCellValue(record.getR28_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR28_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR28_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(28);
        cell1 = row.createCell(1);
        if (record.getR29_first_month() != null) {
            cell1.setCellValue(record.getR29_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR29_third_month() != null) {
            cell2.setCellValue(record.getR29_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR29_last_month() != null) {
            cell3.setCellValue(record.getR29_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR29_first_year() != null) {
            cell4.setCellValue(record.getR29_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR29_fifth_year() != null) {
            cell5.setCellValue(record.getR29_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR29_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR29_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(29);
        cell1 = row.createCell(1);
        if (record.getR30_first_month() != null) {
            cell1.setCellValue(record.getR30_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR30_third_month() != null) {
            cell2.setCellValue(record.getR30_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR30_last_month() != null) {
            cell3.setCellValue(record.getR30_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR30_first_year() != null) {
            cell4.setCellValue(record.getR30_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR30_fifth_year() != null) {
            cell5.setCellValue(record.getR30_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR30_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR30_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(30);
        cell1 = row.createCell(1);
        if (record.getR31_first_month() != null) {
            cell1.setCellValue(record.getR31_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR31_third_month() != null) {
            cell2.setCellValue(record.getR31_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR31_last_month() != null) {
            cell3.setCellValue(record.getR31_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR31_first_year() != null) {
            cell4.setCellValue(record.getR31_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR31_fifth_year() != null) {
            cell5.setCellValue(record.getR31_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR31_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR31_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(31);
        cell1 = row.createCell(1);
        if (record.getR32_first_month() != null) {
            cell1.setCellValue(record.getR32_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR32_third_month() != null) {
            cell2.setCellValue(record.getR32_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR32_last_month() != null) {
            cell3.setCellValue(record.getR32_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR32_first_year() != null) {
            cell4.setCellValue(record.getR32_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR32_fifth_year() != null) {
            cell5.setCellValue(record.getR32_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR32_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR32_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(32);
        cell1 = row.createCell(1);
        if (record.getR33_first_month() != null) {
            cell1.setCellValue(record.getR33_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR33_third_month() != null) {
            cell2.setCellValue(record.getR33_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR33_last_month() != null) {
            cell3.setCellValue(record.getR33_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR33_first_year() != null) {
            cell4.setCellValue(record.getR33_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR33_fifth_year() != null) {
            cell5.setCellValue(record.getR33_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR33_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR33_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(33);
        cell1 = row.createCell(1);
        if (record.getR34_first_month() != null) {
            cell1.setCellValue(record.getR34_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR34_third_month() != null) {
            cell2.setCellValue(record.getR34_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR34_last_month() != null) {
            cell3.setCellValue(record.getR34_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR34_first_year() != null) {
            cell4.setCellValue(record.getR34_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR34_fifth_year() != null) {
            cell5.setCellValue(record.getR34_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR34_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR34_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(34);
        cell1 = row.createCell(1);
        if (record.getR35_first_month() != null) {
            cell1.setCellValue(record.getR35_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR35_third_month() != null) {
            cell2.setCellValue(record.getR35_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR35_last_month() != null) {
            cell3.setCellValue(record.getR35_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR35_first_year() != null) {
            cell4.setCellValue(record.getR35_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR35_fifth_year() != null) {
            cell5.setCellValue(record.getR35_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR35_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR35_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(35);
        cell1 = row.createCell(1);
        if (record.getR36_first_month() != null) {
            cell1.setCellValue(record.getR36_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR36_third_month() != null) {
            cell2.setCellValue(record.getR36_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR36_last_month() != null) {
            cell3.setCellValue(record.getR36_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR36_first_year() != null) {
            cell4.setCellValue(record.getR36_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR36_fifth_year() != null) {
            cell5.setCellValue(record.getR36_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR36_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR36_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(36);
        cell1 = row.createCell(1);
        if (record.getR37_first_month() != null) {
            cell1.setCellValue(record.getR37_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR37_third_month() != null) {
            cell2.setCellValue(record.getR37_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR37_last_month() != null) {
            cell3.setCellValue(record.getR37_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR37_first_year() != null) {
            cell4.setCellValue(record.getR37_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR37_fifth_year() != null) {
            cell5.setCellValue(record.getR37_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR37_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR37_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(37);
        cell1 = row.createCell(1);
        if (record.getR38_first_month() != null) {
            cell1.setCellValue(record.getR38_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR38_third_month() != null) {
            cell2.setCellValue(record.getR38_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR38_last_month() != null) {
            cell3.setCellValue(record.getR38_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR38_first_year() != null) {
            cell4.setCellValue(record.getR38_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR38_fifth_year() != null) {
            cell5.setCellValue(record.getR38_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR38_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR38_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(38);
        cell1 = row.createCell(1);
        if (record.getR39_first_month() != null) {
            cell1.setCellValue(record.getR39_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR39_third_month() != null) {
            cell2.setCellValue(record.getR39_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR39_last_month() != null) {
            cell3.setCellValue(record.getR39_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR39_first_year() != null) {
            cell4.setCellValue(record.getR39_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR39_fifth_year() != null) {
            cell5.setCellValue(record.getR39_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR39_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR39_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(39);
        cell1 = row.createCell(1);
        if (record.getR40_first_month() != null) {
            cell1.setCellValue(record.getR40_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR40_third_month() != null) {
            cell2.setCellValue(record.getR40_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR40_last_month() != null) {
            cell3.setCellValue(record.getR40_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR40_first_year() != null) {
            cell4.setCellValue(record.getR40_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR40_fifth_year() != null) {
            cell5.setCellValue(record.getR40_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR40_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR40_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(40);
        cell1 = row.createCell(1);
        if (record.getR41_first_month() != null) {
            cell1.setCellValue(record.getR41_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR41_third_month() != null) {
            cell2.setCellValue(record.getR41_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR41_last_month() != null) {
            cell3.setCellValue(record.getR41_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR41_first_year() != null) {
            cell4.setCellValue(record.getR41_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR41_fifth_year() != null) {
            cell5.setCellValue(record.getR41_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR41_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR41_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(41);
        cell1 = row.createCell(1);
        if (record.getR42_first_month() != null) {
            cell1.setCellValue(record.getR42_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR42_third_month() != null) {
            cell2.setCellValue(record.getR42_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR42_last_month() != null) {
            cell3.setCellValue(record.getR42_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR42_first_year() != null) {
            cell4.setCellValue(record.getR42_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR42_fifth_year() != null) {
            cell5.setCellValue(record.getR42_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR42_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR42_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(42);
        cell1 = row.createCell(1);
        if (record.getR43_first_month() != null) {
            cell1.setCellValue(record.getR43_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR43_third_month() != null) {
            cell2.setCellValue(record.getR43_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR43_last_month() != null) {
            cell3.setCellValue(record.getR43_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR43_first_year() != null) {
            cell4.setCellValue(record.getR43_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR43_fifth_year() != null) {
            cell5.setCellValue(record.getR43_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR43_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR43_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(43);
        cell1 = row.createCell(1);
        if (record.getR44_first_month() != null) {
            cell1.setCellValue(record.getR44_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR44_third_month() != null) {
            cell2.setCellValue(record.getR44_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR44_last_month() != null) {
            cell3.setCellValue(record.getR44_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR44_first_year() != null) {
            cell4.setCellValue(record.getR44_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR44_fifth_year() != null) {
            cell5.setCellValue(record.getR44_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR44_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR44_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(44);
        cell1 = row.createCell(1);
        if (record.getR45_first_month() != null) {
            cell1.setCellValue(record.getR45_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR45_third_month() != null) {
            cell2.setCellValue(record.getR45_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR45_last_month() != null) {
            cell3.setCellValue(record.getR45_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR45_first_year() != null) {
            cell4.setCellValue(record.getR45_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR45_fifth_year() != null) {
            cell5.setCellValue(record.getR45_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR45_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR45_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(45);
        cell1 = row.createCell(1);
        if (record.getR46_first_month() != null) {
            cell1.setCellValue(record.getR46_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR46_third_month() != null) {
            cell2.setCellValue(record.getR46_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR46_last_month() != null) {
            cell3.setCellValue(record.getR46_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR46_first_year() != null) {
            cell4.setCellValue(record.getR46_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR46_fifth_year() != null) {
            cell5.setCellValue(record.getR46_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR46_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR46_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(46);
        cell1 = row.createCell(1);
        if (record.getR47_first_month() != null) {
            cell1.setCellValue(record.getR47_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR47_third_month() != null) {
            cell2.setCellValue(record.getR47_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR47_last_month() != null) {
            cell3.setCellValue(record.getR47_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR47_first_year() != null) {
            cell4.setCellValue(record.getR47_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR47_fifth_year() != null) {
            cell5.setCellValue(record.getR47_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR47_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR47_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(47);
        cell1 = row.createCell(1);
        if (record.getR48_first_month() != null) {
            cell1.setCellValue(record.getR48_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR48_third_month() != null) {
            cell2.setCellValue(record.getR48_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR48_last_month() != null) {
            cell3.setCellValue(record.getR48_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR48_first_year() != null) {
            cell4.setCellValue(record.getR48_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR48_fifth_year() != null) {
            cell5.setCellValue(record.getR48_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR48_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR48_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
        }


        row = sheet.getRow(48);
        cell1 = row.createCell(1);
        if (record.getR49_first_month() != null) {
            cell1.setCellValue(record.getR49_first_month().doubleValue());
            cell1.setCellStyle(numberStyle);
        } else {
            cell1.setCellValue("");
            cell1.setCellStyle(textStyle);
        }
        
        cell2 = row.createCell(2);
        if (record.getR49_third_month() != null) {
            cell2.setCellValue(record.getR49_third_month().doubleValue());
            cell2.setCellStyle(numberStyle);
        } else {
            cell2.setCellValue("");
            cell2.setCellStyle(textStyle);
        }
        
        cell3 = row.createCell(3);
        if (record.getR49_last_month() != null) {
            cell3.setCellValue(record.getR49_last_month().doubleValue());
            cell3.setCellStyle(numberStyle);
        } else {
            cell3.setCellValue("");
            cell3.setCellStyle(textStyle);
        }
        
        cell4 = row.createCell(4);
        if (record.getR49_first_year() != null) {
            cell4.setCellValue(record.getR49_first_year().doubleValue());
            cell4.setCellStyle(numberStyle);
        } else {
            cell4.setCellValue("");
            cell4.setCellStyle(textStyle);
        }
        
        cell5 = row.createCell(5);
        if (record.getR49_fifth_year() != null) {
            cell5.setCellValue(record.getR49_fifth_year().doubleValue());
            cell5.setCellStyle(numberStyle);
        } else {
            cell5.setCellValue("");
            cell5.setCellStyle(textStyle);
        }
        
        cell6 = row.createCell(6);
        if (record.getR49_non_interest_bearing() != null) {
            cell6.setCellValue(record.getR49_non_interest_bearing().doubleValue());
            cell6.setCellStyle(numberStyle);
        } else {
            cell6.setCellValue("");
            cell6.setCellStyle(textStyle);
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
logger.info("Generating Excel for BRRS_M_LIQGAP ARCHIVAL Details...");
System.out.println("came to Detail download service");
if (type.equals("ARCHIVAL") & version != null) {

}
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("MLA3Detail");

//Common border style
BorderStyle border = BorderStyle.THIN;

//Header style (left aligned)
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

//Right-aligned header style for ACCT BALANCE
CellStyle rightAlignedHeaderStyle = workbook.createCellStyle();
rightAlignedHeaderStyle.cloneStyleFrom(headerStyle);
rightAlignedHeaderStyle.setAlignment(HorizontalAlignment.RIGHT);

//Default data style (left aligned)
CellStyle dataStyle = workbook.createCellStyle();
dataStyle.setAlignment(HorizontalAlignment.LEFT);
dataStyle.setBorderTop(border);
dataStyle.setBorderBottom(border);
dataStyle.setBorderLeft(border);
dataStyle.setBorderRight(border);

//ACCT BALANCE style (right aligned with 3 decimals)
CellStyle balanceStyle = workbook.createCellStyle();
balanceStyle.setAlignment(HorizontalAlignment.RIGHT);
balanceStyle.setDataFormat(workbook.createDataFormat().getFormat("0.000"));
balanceStyle.setBorderTop(border);
balanceStyle.setBorderBottom(border);
balanceStyle.setBorderLeft(border);
balanceStyle.setBorderRight(border);

//Header row
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

//Get data
Date parsedToDate = new SimpleDateFormat("dd/MM/yyyy").parse(todate);
List<M_LIQGAP_Archival_Detail_Entity> reportData = M_LIQGAP_Archival_Detail_Repo
.getdatabydateList(parsedToDate, version);

if (reportData != null && !reportData.isEmpty()) {
int rowIndex = 1;
for (M_LIQGAP_Archival_Detail_Entity item : reportData) {
XSSFRow row = sheet.createRow(rowIndex++);

row.createCell(0).setCellValue(item.getCustId());
row.createCell(1).setCellValue(item.getAcctNumber());
row.createCell(2).setCellValue(item.getAcctName());

//ACCT BALANCE (right aligned, 3 decimal places)
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

//Apply data style for all other cells
for (int j = 0; j < 7; j++) {
if (j != 3) {
row.getCell(j).setCellStyle(dataStyle);
}
}
}
} else {
logger.info("No data found for BRRS_M_LIQLAP — only header will be written.");
}

//Write to byte[]
ByteArrayOutputStream bos = new ByteArrayOutputStream();
workbook.write(bos);
workbook.close();

logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
return bos.toByteArray();

} catch (Exception e) {
logger.error("Error generating BRRS_M_LIQLAPExcel", e);
return new byte[0];
}
}


}







					









			


	


	

	



			       
			
			
			
			
			
