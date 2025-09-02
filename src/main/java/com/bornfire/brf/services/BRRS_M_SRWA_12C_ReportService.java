
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
import java.util.Locale;

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

import com.bornfire.brf.entities.M_SRWA_12C_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SRWA_12C_Detail_Repo;
import com.bornfire.brf.entities.M_SRWA_12C_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_SRWA_12C_Summary_Repo;


@Component
@Service

public class BRRS_M_SRWA_12C_ReportService  {
private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SRWA_12C_ReportService.class);
	


	@Autowired
	private Environment env;
	
	
	@Autowired
	SessionFactory sessionFactory;
	

   
    @Autowired
	BRRS_M_SRWA_12C_Summary_Repo BRRS_M_SRWA_12C_Summary_Repo;

    @Autowired
	BRRS_M_SRWA_12C_Detail_Repo BRRS_M_SRWA_12C_detail_Repo;
	
     
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRRS_M_SRWA_12CView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	
				System.out.println("came to my individual services");
		List<M_SRWA_12C_Summary_Entity> T1Master = new ArrayList<M_SRWA_12C_Summary_Entity>();
		System.out.println("after the list");
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			T1Master = BRRS_M_SRWA_12C_Summary_Repo.getdatabydateList(dateformat.parse(todate));
// 		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
// Date reportDate = sdf.parse(todate); 
// T1Master = BRRS_M_SRWA_12C_Summary_Repo.getdatabydateList(reportDate);
		System.out.println("size of the t1master is:"+ T1Master.size());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRRS/M_SRWA_12C");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRRS_M_SRWA_12CcurrentDtl(
	        String reportId, String fromdate, String todate, String currency,
	        String dtltype, Pageable pageable, String filter) {

	    int pageSize = pageable.getPageSize();
	    int currentPage = pageable.getPageNumber();
	    int totalPages=0;
	    ModelAndView mv = new ModelAndView();
	    List<M_SRWA_12C_Detail_Entity> T1Dt1 = new ArrayList<>();

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
	            T1Dt1 = BRRS_M_SRWA_12C_detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId);
	        } else {
	           	T1Dt1 = BRRS_M_SRWA_12C_detail_Repo.getdatabydateList(d1,currentPage,pageSize);
				totalPages=BRRS_M_SRWA_12C_detail_Repo.getdatacount(dateformat.parse(todate));
				mv.addObject("pagination","YES");
	        }

	        System.out.println("LISTCOUNT: " + T1Dt1.size());

	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    mv.setViewName("BRRS/M_SRWA_12C");
	    mv.addObject("currentPage", currentPage);
		mv.addObject("totalPages",(int)Math.ceil((double)totalPages / 100));
	    mv.addObject("displaymode", "Details");
	    mv.addObject("reportdetails", T1Dt1);
	    mv.addObject("reportmaster12", T1Dt1);
	    mv.addObject("reportsflag", "reportsflag");
	    mv.addObject("menu", reportId);
	    return mv;
	}
public byte[] getBRRS_M_SRWA_12CExcel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<M_SRWA_12C_Summary_Entity> dataList =BRRS_M_SRWA_12C_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.4 report. Returning empty result.");
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
			
			CellStyle percentStyle = workbook.createCellStyle();
			percentStyle.cloneStyleFrom(numberStyle);
			percentStyle.setDataFormat(workbook.createDataFormat().getFormat("0.00%"));
			percentStyle.setAlignment(HorizontalAlignment.CENTER);
			// --- End of Style Definitions ---

			int startRow = 11;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					M_SRWA_12C_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

		
					//row12
					// Column D
					Cell cell3 = row.createCell(3);
					if (record.getR12_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR12_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					Cell cell4 = row.createCell(4);
					if (record.getR12_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR12_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					// Column F
					Cell cell5 = row.createCell(5);
					if (record.getR12_RISK_MULTIPLIER() != null) {
						cell5.setCellValue(record.getR12_RISK_MULTIPLIER().doubleValue() / 100);
						cell5.setCellStyle(percentStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					
									

					//row13
					row = sheet.getRow(12);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR13_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR13_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR13_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR13_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					// Column F
					cell5 = row.createCell(5);
					if (record.getR13_RISK_MULTIPLIER() != null) {
						
						cell5.setCellValue(record.getR13_RISK_MULTIPLIER().doubleValue() / 100);
						cell5.setCellStyle(percentStyle);

					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					//row14
					row = sheet.getRow(13);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR14_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR14_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR14_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR14_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					// Column F
					cell5 = row.createCell(5);
					if (record.getR14_RISK_MULTIPLIER() != null) {
						cell5.setCellValue(record.getR14_RISK_MULTIPLIER().doubleValue() / 100);
						cell5.setCellStyle(percentStyle);
						
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					//row15
					row = sheet.getRow(14);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR15_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR15_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR15_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR15_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					// Column F
					cell5 = row.createCell(5);
					if (record.getR15_RISK_MULTIPLIER() != null) {
						cell5.setCellValue(record.getR15_RISK_MULTIPLIER().doubleValue() / 100);
						cell5.setCellStyle(percentStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					//row16
					row = sheet.getRow(15);			
					// Column D 
					cell3 = row.getCell(3);
					if (record.getR16_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR16_NUMBER_OF_FAILED_TRADES().doubleValue());
						
					} else {
						cell3.setCellValue("");

					}
					// Column E
					cell4 = row.getCell(4);
					if (record.getR16_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR16_POSITIVE_CURRENT_EXPOSURE().doubleValue());

					} else {
						cell4.setCellValue("");

					}
					
					//row20
					row = sheet.getRow(19);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR20_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR20_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR20_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR20_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					// Column F
					cell5 = row.createCell(5);
					if (record.getR20_RISK_MULTIPLIER() != null) {
						cell5.setCellValue(record.getR20_RISK_MULTIPLIER().doubleValue() / 100);
						cell5.setCellStyle(percentStyle);
					} else {
						cell5.setCellValue("");
						cell5.setCellStyle(textStyle);
					}
					
					//row21
					row = sheet.getRow(20);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR21_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR21_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR21_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR21_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row22
					row = sheet.getRow(21);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR22_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR22_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR22_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR22_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row23
					row = sheet.getRow(22);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR23_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR23_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR23_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR23_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					 
					//row24
					row = sheet.getRow(23);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR24_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR24_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR24_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR24_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row25
					row = sheet.getRow(24);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR25_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR25_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR25_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR25_POSITIVE_CURRENT_EXPOSURE().doubleValue());
						cell4.setCellStyle(numberStyle);
					} else {
						cell4.setCellValue("");
						cell4.setCellStyle(textStyle);
					}
					
					//row26
					row = sheet.getRow(25);			
					// Column D 
					cell3 = row.createCell(3);
					if (record.getR26_NUMBER_OF_FAILED_TRADES() != null) {
						cell3.setCellValue(record.getR26_NUMBER_OF_FAILED_TRADES().doubleValue());
						cell3.setCellStyle(numberStyle);
					} else {
						cell3.setCellValue("");
						cell3.setCellStyle(textStyle);
					}
					// Column E
					cell4 = row.createCell(4);
					if (record.getR26_POSITIVE_CURRENT_EXPOSURE() != null) {
						cell4.setCellValue(record.getR26_POSITIVE_CURRENT_EXPOSURE().doubleValue());
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
	
	
	public byte[] getBRRS_M_SRWA_12CDetailExcel(String filename, String fromdate, String todate) {
	    try {
	        logger.info("Generating Excel for BRRS_M_SRWA_12C Details...");
	        System.out.println("came to Detail download service");

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("BRRS_M_SRWA_12CDetail");

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
	        List<M_SRWA_12C_Detail_Entity> reportData =  BRRS_M_SRWA_12C_detail_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (M_SRWA_12C_Detail_Entity item : reportData) {
	                XSSFRow row = sheet.createRow(rowIndex++);

	                row.createCell(0).setCellValue(item.getCUST_ID());
	                row.createCell(1).setCellValue(item.getACCT_NUMBER());
	                row.createCell(2).setCellValue(item.getACCT_NAME());

	                // ACCT BALANCE (right aligned, 3 decimal places)
	                Cell balanceCell = row.createCell(3);
	                if (item.getACCT_BALANCE_IN_PULA() != null) {
	                    balanceCell.setCellValue(item.getACCT_BALANCE_IN_PULA().doubleValue());
	                } else {
	                    balanceCell.setCellValue(0.000);
	                }
	                balanceCell.setCellStyle(balanceStyle);

	                row.createCell(4).setCellValue(item.getROW_ID());
	                row.createCell(5).setCellValue(item.getCOLUMN_ID());
	                row.createCell(6).setCellValue(
	                    item.getREPORT_DATE() != null ?
	                    new SimpleDateFormat("dd-MM-yyyy").format(item.getREPORT_DATE()) : ""
	                );

	                // Apply data style for all other cells
	                for (int j = 0; j < 7; j++) {
	                    if (j != 3) {
	                        row.getCell(j).setCellStyle(dataStyle);
	                    }
	                }
	            }
	        } else {
	            logger.info("No data found for BRRS_M_SRWA_12C_details — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating BRRS_M_SRWA_12CExcel", e);
	        return new byte[0];
	    }
	}


}

