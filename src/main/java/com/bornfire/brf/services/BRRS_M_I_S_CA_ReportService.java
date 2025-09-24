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

import com.bornfire.brf.entities.BRRS_M_I_S_CA_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_I_S_CA_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_I_S_CA_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_I_S_CA_Summary_Repo;
import com.bornfire.brf.entities.M_GMIRT_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_GMIRT_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_GMIRT_Detail_Entity;
import com.bornfire.brf.entities.M_GMIRT_Summary_Entity;
import com.bornfire.brf.entities.M_I_S_CA_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_I_S_CA_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_I_S_CA_Detail_Entity;
import com.bornfire.brf.entities.M_I_S_CA_Summary_Entity;
;


@Component
@Service

public class BRRS_M_I_S_CA_ReportService {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_I_S_CA_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	BRRS_M_I_S_CA_Detail_Repo brrs_m_i_s_ca_detail_repo;

	@Autowired
	BRRS_M_I_S_CA_Summary_Repo brrs_m_i_s_ca_summary_repo;
	
	@Autowired
	BRRS_M_I_S_CA_Archival_Detail_Repo m_i_s_ca_Archival_Detail_Repo;

	@Autowired
	BRRS_M_I_S_CA_Archival_Summary_Repo m_i_s_ca_Archival_Summary_Repo;
	
	

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_I_S_CAView(String reportId, String fromdate, String todate, String currency, String dtltype,
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
			List<M_I_S_CA_Archival_Summary_Entity> T1Master = new ArrayList<M_I_S_CA_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();

				T1Master = m_i_s_ca_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
		List<M_I_S_CA_Summary_Entity> T1Master = new ArrayList<M_I_S_CA_Summary_Entity>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
			// ", BRF1_REPORT_ENTITY.class)
			// .setParameter(1, df.parse(todate)).getResultList();
			
			
			T1Master = brrs_m_i_s_ca_summary_repo.getdatabydateList(dateformat.parse(todate));
			mv.addObject("report_date", dateformat.format(d1));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		mv.addObject("reportsummary", T1Master);
		}
		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRRS/M_I_S_CA");

		
		// mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		// mv.addObject("reportsflag", "reportsflag");
		// mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}

	public ModelAndView getM_I_S_CAcurrentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter, String type, String version) {

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

			// ✅ Split the filter string here
			if (filter != null && filter.contains(",")) {
				String[] parts = filter.split(",");
				if (parts.length >= 2) {
					rowId = parts[0];
					columnId = parts[1];
				}
			}

			
			System.out.println(type);
			if ("ARCHIVAL".equals(type) && version != null) {
				System.out.println(type);
				// 🔹 Archival branch
				List<M_I_S_CA_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = m_i_s_ca_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
				} else {
					T1Dt1 = m_i_s_ca_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
				// 🔹 Current branch
				List<M_I_S_CA_Detail_Entity> T1Dt1;
				
			if (rowId != null && columnId != null) {
				T1Dt1 = brrs_m_i_s_ca_detail_repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
			} else {
				T1Dt1 = brrs_m_i_s_ca_detail_repo.getdatabydateList(parsedDate, currentPage, pageSize);
				totalPages = brrs_m_i_s_ca_detail_repo.getdatacount(parsedDate);
				mv.addObject("pagination", "YES");

			}
			mv.addObject("reportdetails", T1Dt1);
			mv.addObject("reportmaster12", T1Dt1);
			System.out.println("LISTCOUNT: " + T1Dt1.size());
			}
		} catch (ParseException e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Invalid date format: " + todate);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("errorMessage", "Unexpected error: " + e.getMessage());
		}

		// Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist,
		// PageRequest.of(currentPage, pageSize), T1Dt1.size());
		// mv.addObject("reportdetails", T1Dt1Page.getContent());
				// mv.addObject("reportmaster1", qr);
				// mv.addObject("singledetail", new T1CurProdDetail());
		

		mv.setViewName("BRRS/M_I_S_CA");
		mv.addObject("displaymode", "Details");
		mv.addObject("currentPage", currentPage);
		System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
		mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
		
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;
	}

	public byte[] getM_I_S_CAExcel(String filename, String reportId, String fromdate, String todate, String currency,
			String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		
		

		// ARCHIVAL check
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelM_I_S_CAARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}

		// Fetch data

		List<M_I_S_CA_Summary_Entity> dataList = brrs_m_i_s_ca_summary_repo.getdatabydateList(dateformat.parse(todate));

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_I_S_CA report. Returning empty result.");
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
					M_I_S_CA_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

					// row10
					// Column E
					Cell cellE = row.createCell(4);
					if (record.getR10_total() != null) {
						cellE.setCellValue(record.getR10_total().doubleValue());
						cellE.setCellStyle(numberStyle);
					} else {
						cellE.setCellValue("");
						cellE.setCellStyle(textStyle);
					}

					// row12
					// Column B
					
					row = sheet.getRow(11);
					
					Cell cellB = row.createCell(1);
					if (record.getR12_recoveries() != null) {
						cellB.setCellValue(record.getR12_recoveries().doubleValue());
						cellB.setCellStyle(numberStyle);
					} else {
						cellB.setCellValue("");
						cellB.setCellStyle(textStyle);
					}

					// row12
					// Column C
					Cell cellC = row.createCell(2);
					if (record.getR12_write_offs() != null) {
						cellC.setCellValue(record.getR12_write_offs().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// row12
					// Column D
					Cell cellD = row.createCell(3);
					if (record.getR12_new_chars() != null) {
						cellD.setCellValue(record.getR12_new_chars().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					
					

					            // row13
										// Column B
										
										row = sheet.getRow(12);
										
										 cellB = row.createCell(1);
										if (record.getR13_recoveries() != null) {
											cellB.setCellValue(record.getR13_recoveries().doubleValue());
											cellB.setCellStyle(numberStyle);
										} else {
											cellB.setCellValue("");
											cellB.setCellStyle(textStyle);
										}

										// row13
										// Column C
										 cellC = row.createCell(2);
										if (record.getR13_write_offs() != null) {
											cellC.setCellValue(record.getR13_write_offs().doubleValue());
											cellC.setCellStyle(numberStyle);
										} else {
											cellC.setCellValue("");
											cellC.setCellStyle(textStyle);
										}

										// row13
										// Column D
										 cellD = row.createCell(3);
										if (record.getR13_new_chars() != null) {
											cellD.setCellValue(record.getR13_new_chars().doubleValue());
											cellD.setCellStyle(numberStyle);
										} else {
											cellD.setCellValue("");
											cellD.setCellStyle(textStyle);
										}
										
										
										
										// row14
										// Column B
										row = sheet.getRow(13);

										cellB = row.createCell(1);
										if (record.getR14_recoveries() != null) {
										    cellB.setCellValue(record.getR14_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row14
										// Column C
										cellC = row.createCell(2);
										if (record.getR14_write_offs() != null) {
										    cellC.setCellValue(record.getR14_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row14
										// Column D
										cellD = row.createCell(3);
										if (record.getR14_new_chars() != null) {
										    cellD.setCellValue(record.getR14_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row16
										// Column B
										row = sheet.getRow(15);

										cellB = row.createCell(1);
										if (record.getR16_recoveries() != null) {
										    cellB.setCellValue(record.getR16_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row16
										// Column C
										cellC = row.createCell(2);
										if (record.getR16_write_offs() != null) {
										    cellC.setCellValue(record.getR16_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row16
										// Column D
										cellD = row.createCell(3);
										if (record.getR16_new_chars() != null) {
										    cellD.setCellValue(record.getR16_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row17
										// Column B
										row = sheet.getRow(16);

										cellB = row.createCell(1);
										if (record.getR17_recoveries() != null) {
										    cellB.setCellValue(record.getR17_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row17
										// Column C
										cellC = row.createCell(2);
										if (record.getR17_write_offs() != null) {
										    cellC.setCellValue(record.getR17_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row17
										// Column D
										cellD = row.createCell(3);
										if (record.getR17_new_chars() != null) {
										    cellD.setCellValue(record.getR17_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row18
										// Column B
										row = sheet.getRow(17);

										cellB = row.createCell(1);
										if (record.getR18_recoveries() != null) {
										    cellB.setCellValue(record.getR18_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row18
										// Column C
										cellC = row.createCell(2);
										if (record.getR18_write_offs() != null) {
										    cellC.setCellValue(record.getR18_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row18
										// Column D
										cellD = row.createCell(3);
										if (record.getR18_new_chars() != null) {
										    cellD.setCellValue(record.getR18_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row19
										// Column B
										row = sheet.getRow(18);

										cellB = row.createCell(1);
										if (record.getR19_recoveries() != null) {
										    cellB.setCellValue(record.getR19_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row19
										// Column C
										cellC = row.createCell(2);
										if (record.getR19_write_offs() != null) {
										    cellC.setCellValue(record.getR19_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row19
										// Column D
										cellD = row.createCell(3);
										if (record.getR19_new_chars() != null) {
										    cellD.setCellValue(record.getR19_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row20
										// Column B
										row = sheet.getRow(19);

										cellB = row.createCell(1);
										if (record.getR20_recoveries() != null) {
										    cellB.setCellValue(record.getR20_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row20
										// Column C
										cellC = row.createCell(2);
										if (record.getR20_write_offs() != null) {
										    cellC.setCellValue(record.getR20_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row20
										// Column D
										cellD = row.createCell(3);
										if (record.getR20_new_chars() != null) {
										    cellD.setCellValue(record.getR20_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row21
										// Column B
										row = sheet.getRow(20);

										cellB = row.createCell(1);
										if (record.getR21_recoveries() != null) {
										    cellB.setCellValue(record.getR21_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row21
										// Column C
										cellC = row.createCell(2);
										if (record.getR21_write_offs() != null) {
										    cellC.setCellValue(record.getR21_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row21
										// Column D
										cellD = row.createCell(3);
										if (record.getR21_new_chars() != null) {
										    cellD.setCellValue(record.getR21_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row22
										// Column B
										row = sheet.getRow(21);

										cellB = row.createCell(1);
										if (record.getR22_recoveries() != null) {
										    cellB.setCellValue(record.getR22_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row22
										// Column C
										cellC = row.createCell(2);
										if (record.getR22_write_offs() != null) {
										    cellC.setCellValue(record.getR22_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row22
										// Column D
										cellD = row.createCell(3);
										if (record.getR22_new_chars() != null) {
										    cellD.setCellValue(record.getR22_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row23
										// Column B
										row = sheet.getRow(22);

										cellB = row.createCell(1);
										if (record.getR23_recoveries() != null) {
										    cellB.setCellValue(record.getR23_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row23
										// Column C
										cellC = row.createCell(2);
										if (record.getR23_write_offs() != null) {
										    cellC.setCellValue(record.getR23_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row23
										// Column D
										cellD = row.createCell(3);
										if (record.getR23_new_chars() != null) {
										    cellD.setCellValue(record.getR23_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row24
										// Column B
										row = sheet.getRow(23);

										cellB = row.createCell(1);
										if (record.getR24_recoveries() != null) {
										    cellB.setCellValue(record.getR24_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row24
										// Column C
										cellC = row.createCell(2);
										if (record.getR24_write_offs() != null) {
										    cellC.setCellValue(record.getR24_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row24
										// Column D
										cellD = row.createCell(3);
										if (record.getR24_new_chars() != null) {
										    cellD.setCellValue(record.getR24_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row25
										// Column B
										row = sheet.getRow(24);

										cellB = row.createCell(1);
										if (record.getR25_recoveries() != null) {
										    cellB.setCellValue(record.getR25_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row25
										// Column C
										cellC = row.createCell(2);
										if (record.getR25_write_offs() != null) {
										    cellC.setCellValue(record.getR25_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row25
										// Column D
										cellD = row.createCell(3);
										if (record.getR25_new_chars() != null) {
										    cellD.setCellValue(record.getR25_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row26
										// Column B
										row = sheet.getRow(25);

										cellB = row.createCell(1);
										if (record.getR26_recoveries() != null) {
										    cellB.setCellValue(record.getR26_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row26
										// Column C
										cellC = row.createCell(2);
										if (record.getR26_write_offs() != null) {
										    cellC.setCellValue(record.getR26_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row26
										// Column D
										cellD = row.createCell(3);
										if (record.getR26_new_chars() != null) {
										    cellD.setCellValue(record.getR26_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row27
										// Column B
										row = sheet.getRow(26);

										cellB = row.createCell(1);
										if (record.getR27_recoveries() != null) {
										    cellB.setCellValue(record.getR27_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row27
										// Column C
										cellC = row.createCell(2);
										if (record.getR27_write_offs() != null) {
										    cellC.setCellValue(record.getR27_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row27
										// Column D
										cellD = row.createCell(3);
										if (record.getR27_new_chars() != null) {
										    cellD.setCellValue(record.getR27_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row28
										// Column B
										row = sheet.getRow(27);

										cellB = row.createCell(1);
										if (record.getR28_recoveries() != null) {
										    cellB.setCellValue(record.getR28_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row28
										// Column C
										cellC = row.createCell(2);
										if (record.getR28_write_offs() != null) {
										    cellC.setCellValue(record.getR28_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row28
										// Column D
										cellD = row.createCell(3);
										if (record.getR28_new_chars() != null) {
										    cellD.setCellValue(record.getR28_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row30
										// Column B
										row = sheet.getRow(29);

										cellB = row.createCell(1);
										if (record.getR30_recoveries() != null) {
										    cellB.setCellValue(record.getR30_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row30
										// Column C
										cellC = row.createCell(2);
										if (record.getR30_write_offs() != null) {
										    cellC.setCellValue(record.getR30_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row30
										// Column D
										cellD = row.createCell(3);
										if (record.getR30_new_chars() != null) {
										    cellD.setCellValue(record.getR30_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row31
										// Column B
										row = sheet.getRow(30);

										cellB = row.createCell(1);
										if (record.getR31_recoveries() != null) {
										    cellB.setCellValue(record.getR31_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row31
										// Column C
										cellC = row.createCell(2);
										if (record.getR31_write_offs() != null) {
										    cellC.setCellValue(record.getR31_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row31
										// Column D
										cellD = row.createCell(3);
										if (record.getR31_new_chars() != null) {
										    cellD.setCellValue(record.getR31_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row32
										// Column B
										row = sheet.getRow(31);

										cellB = row.createCell(1);
										if (record.getR32_recoveries() != null) {
										    cellB.setCellValue(record.getR32_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row32
										// Column C
										cellC = row.createCell(2);
										if (record.getR32_write_offs() != null) {
										    cellC.setCellValue(record.getR32_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row32
										// Column D
										cellD = row.createCell(3);
										if (record.getR32_new_chars() != null) {
										    cellD.setCellValue(record.getR32_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row33
										// Column B
										row = sheet.getRow(32);

										cellB = row.createCell(1);
										if (record.getR33_recoveries() != null) {
										    cellB.setCellValue(record.getR33_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row33
										// Column C
										cellC = row.createCell(2);
										if (record.getR33_write_offs() != null) {
										    cellC.setCellValue(record.getR33_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row33
										// Column D
										cellD = row.createCell(3);
										if (record.getR33_new_chars() != null) {
										    cellD.setCellValue(record.getR33_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row34
										// Column B
										row = sheet.getRow(33);

										cellB = row.createCell(1);
										if (record.getR34_recoveries() != null) {
										    cellB.setCellValue(record.getR34_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row34
										// Column C
										cellC = row.createCell(2);
										if (record.getR34_write_offs() != null) {
										    cellC.setCellValue(record.getR34_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row34
										// Column D
										cellD = row.createCell(3);
										if (record.getR34_new_chars() != null) {
										    cellD.setCellValue(record.getR34_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row35
										// Column B
										row = sheet.getRow(34);

										cellB = row.createCell(1);
										if (record.getR35_recoveries() != null) {
										    cellB.setCellValue(record.getR35_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row35
										// Column C
										cellC = row.createCell(2);
										if (record.getR35_write_offs() != null) {
										    cellC.setCellValue(record.getR35_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row35
										// Column D
										cellD = row.createCell(3);
										if (record.getR35_new_chars() != null) {
										    cellD.setCellValue(record.getR35_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row36
										// Column B
										row = sheet.getRow(35);

										cellB = row.createCell(1);
										if (record.getR36_recoveries() != null) {
										    cellB.setCellValue(record.getR36_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row36
										// Column C
										cellC = row.createCell(2);
										if (record.getR36_write_offs() != null) {
										    cellC.setCellValue(record.getR36_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row36
										// Column D
										cellD = row.createCell(3);
										if (record.getR36_new_chars() != null) {
										    cellD.setCellValue(record.getR36_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row37
										// Column B
										row = sheet.getRow(36);

										cellB = row.createCell(1);
										if (record.getR37_recoveries() != null) {
										    cellB.setCellValue(record.getR37_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row37
										// Column C
										cellC = row.createCell(2);
										if (record.getR37_write_offs() != null) {
										    cellC.setCellValue(record.getR37_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row37
										// Column D
										cellD = row.createCell(3);
										if (record.getR37_new_chars() != null) {
										    cellD.setCellValue(record.getR37_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										
										// row39
										// Column B
										row = sheet.getRow(38);

										cellB = row.createCell(1);
										if (record.getR39_recoveries() != null) {
										    cellB.setCellValue(record.getR39_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row39
										// Column C
										cellC = row.createCell(2);
										if (record.getR39_write_offs() != null) {
										    cellC.setCellValue(record.getR39_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row39
										// Column D
										cellD = row.createCell(3);
										if (record.getR39_new_chars() != null) {
										    cellD.setCellValue(record.getR39_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row40
										// Column B
										row = sheet.getRow(39);

										cellB = row.createCell(1);
										if (record.getR40_recoveries() != null) {
										    cellB.setCellValue(record.getR40_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row40
										// Column C
										cellC = row.createCell(2);
										if (record.getR40_write_offs() != null) {
										    cellC.setCellValue(record.getR40_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row40
										// Column D
										cellD = row.createCell(3);
										if (record.getR40_new_chars() != null) {
										    cellD.setCellValue(record.getR40_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row42
										// Column B
										row = sheet.getRow(41);

										cellB = row.createCell(1);
										if (record.getR42_recoveries() != null) {
										    cellB.setCellValue(record.getR42_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row42
										// Column C
										cellC = row.createCell(2);
										if (record.getR42_write_offs() != null) {
										    cellC.setCellValue(record.getR42_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row42
										// Column D
										cellD = row.createCell(3);
										if (record.getR42_new_chars() != null) {
										    cellD.setCellValue(record.getR42_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row43
										// Column B
										row = sheet.getRow(42);

										cellB = row.createCell(1);
										if (record.getR43_recoveries() != null) {
										    cellB.setCellValue(record.getR43_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row43
										// Column C
										cellC = row.createCell(2);
										if (record.getR43_write_offs() != null) {
										    cellC.setCellValue(record.getR43_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row43
										// Column D
										cellD = row.createCell(3);
										if (record.getR43_new_chars() != null) {
										    cellD.setCellValue(record.getR43_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row44
										// Column B
										row = sheet.getRow(43);

										cellB = row.createCell(1);
										if (record.getR44_recoveries() != null) {
										    cellB.setCellValue(record.getR44_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row44
										// Column C
										cellC = row.createCell(2);
										if (record.getR44_write_offs() != null) {
										    cellC.setCellValue(record.getR44_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row44
										// Column D
										cellD = row.createCell(3);
										if (record.getR44_new_chars() != null) {
										    cellD.setCellValue(record.getR44_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row45
										// Column B
										row = sheet.getRow(44);

										cellB = row.createCell(1);
										if (record.getR45_recoveries() != null) {
										    cellB.setCellValue(record.getR45_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row45
										// Column C
										cellC = row.createCell(2);
										if (record.getR45_write_offs() != null) {
										    cellC.setCellValue(record.getR45_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row45
										// Column D
										cellD = row.createCell(3);
										if (record.getR45_new_chars() != null) {
										    cellD.setCellValue(record.getR45_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row46
										// Column B
										row = sheet.getRow(45);

										cellB = row.createCell(1);
										if (record.getR46_recoveries() != null) {
										    cellB.setCellValue(record.getR46_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row46
										// Column C
										cellC = row.createCell(2);
										if (record.getR46_write_offs() != null) {
										    cellC.setCellValue(record.getR46_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row46
										// Column D
										cellD = row.createCell(3);
										if (record.getR46_new_chars() != null) {
										    cellD.setCellValue(record.getR46_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row47
										// Column B
										row = sheet.getRow(46);

										cellB = row.createCell(1);
										if (record.getR47_recoveries() != null) {
										    cellB.setCellValue(record.getR47_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row47
										// Column C
										cellC = row.createCell(2);
										if (record.getR47_write_offs() != null) {
										    cellC.setCellValue(record.getR47_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row47
										// Column D
										cellD = row.createCell(3);
										if (record.getR47_new_chars() != null) {
										    cellD.setCellValue(record.getR47_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row48
										// Column B
										row = sheet.getRow(47);

										cellB = row.createCell(1);
										if (record.getR48_recoveries() != null) {
										    cellB.setCellValue(record.getR48_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row48
										// Column C
										cellC = row.createCell(2);
										if (record.getR48_write_offs() != null) {
										    cellC.setCellValue(record.getR48_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row48
										// Column D
										cellD = row.createCell(3);
										if (record.getR48_new_chars() != null) {
										    cellD.setCellValue(record.getR48_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row50
										// Column B
										row = sheet.getRow(49);

										cellB = row.createCell(1);
										if (record.getR50_recoveries() != null) {
										    cellB.setCellValue(record.getR50_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row50
										// Column C
										cellC = row.createCell(2);
										if (record.getR50_write_offs() != null) {
										    cellC.setCellValue(record.getR50_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row50
										// Column D
										cellD = row.createCell(3);
										if (record.getR50_new_chars() != null) {
										    cellD.setCellValue(record.getR50_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row51
										// Column B
										row = sheet.getRow(50);

										cellB = row.createCell(1);
										if (record.getR51_recoveries() != null) {
										    cellB.setCellValue(record.getR51_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row51
										// Column C
										cellC = row.createCell(2);
										if (record.getR51_write_offs() != null) {
										    cellC.setCellValue(record.getR51_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row51
										// Column D
										cellD = row.createCell(3);
										if (record.getR51_new_chars() != null) {
										    cellD.setCellValue(record.getR51_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row52
										// Column B
										row = sheet.getRow(51);

										cellB = row.createCell(1);
										if (record.getR52_recoveries() != null) {
										    cellB.setCellValue(record.getR52_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row52
										// Column C
										cellC = row.createCell(2);
										if (record.getR52_write_offs() != null) {
										    cellC.setCellValue(record.getR52_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row52
										// Column D
										cellD = row.createCell(3);
										if (record.getR52_new_chars() != null) {
										    cellD.setCellValue(record.getR52_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row54
										// Column B
										row = sheet.getRow(53);

										cellB = row.createCell(1);
										if (record.getR54_recoveries() != null) {
										    cellB.setCellValue(record.getR54_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row54
										// Column C
										cellC = row.createCell(2);
										if (record.getR54_write_offs() != null) {
										    cellC.setCellValue(record.getR54_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row54
										// Column D
										cellD = row.createCell(3);
										if (record.getR54_new_chars() != null) {
										    cellD.setCellValue(record.getR54_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row55
										// Column B
										row = sheet.getRow(54);

										cellB = row.createCell(1);
										if (record.getR55_recoveries() != null) {
										    cellB.setCellValue(record.getR55_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row55
										// Column C
										cellC = row.createCell(2);
										if (record.getR55_write_offs() != null) {
										    cellC.setCellValue(record.getR55_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row55
										// Column D
										cellD = row.createCell(3);
										if (record.getR55_new_chars() != null) {
										    cellD.setCellValue(record.getR55_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row56
										// Column B
										row = sheet.getRow(55);

										cellB = row.createCell(1);
										if (record.getR56_recoveries() != null) {
										    cellB.setCellValue(record.getR56_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row56
										// Column C
										cellC = row.createCell(2);
										if (record.getR56_write_offs() != null) {
										    cellC.setCellValue(record.getR56_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row56
										// Column D
										cellD = row.createCell(3);
										if (record.getR56_new_chars() != null) {
										    cellD.setCellValue(record.getR56_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row58
										// Column B
										row = sheet.getRow(57);

										cellB = row.createCell(1);
										if (record.getR58_recoveries() != null) {
										    cellB.setCellValue(record.getR58_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row58
										// Column C
										cellC = row.createCell(2);
										if (record.getR58_write_offs() != null) {
										    cellC.setCellValue(record.getR58_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row58
										// Column D
										cellD = row.createCell(3);
										if (record.getR58_new_chars() != null) {
										    cellD.setCellValue(record.getR58_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row59
										// Column B
										row = sheet.getRow(58);

										cellB = row.createCell(1);
										if (record.getR59_recoveries() != null) {
										    cellB.setCellValue(record.getR59_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row59
										// Column C
										cellC = row.createCell(2);
										if (record.getR59_write_offs() != null) {
										    cellC.setCellValue(record.getR59_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row59
										// Column D
										cellD = row.createCell(3);
										if (record.getR59_new_chars() != null) {
										    cellD.setCellValue(record.getR59_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row60
										// Column B
										row = sheet.getRow(59);

										cellB = row.createCell(1);
										if (record.getR60_recoveries() != null) {
										    cellB.setCellValue(record.getR60_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row60
										// Column C
										cellC = row.createCell(2);
										if (record.getR60_write_offs() != null) {
										    cellC.setCellValue(record.getR60_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row60
										// Column D
										cellD = row.createCell(3);
										if (record.getR60_new_chars() != null) {
										    cellD.setCellValue(record.getR60_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row61
										// Column B
										row = sheet.getRow(60);

										cellB = row.createCell(1);
										if (record.getR61_recoveries() != null) {
										    cellB.setCellValue(record.getR61_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row61
										// Column C
										cellC = row.createCell(2);
										if (record.getR61_write_offs() != null) {
										    cellC.setCellValue(record.getR61_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row61
										// Column D
										cellD = row.createCell(3);
										if (record.getR61_new_chars() != null) {
										    cellD.setCellValue(record.getR61_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row62
										// Column B
										row = sheet.getRow(61);

										cellB = row.createCell(1);
										if (record.getR62_recoveries() != null) {
										    cellB.setCellValue(record.getR62_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row62
										// Column C
										cellC = row.createCell(2);
										if (record.getR62_write_offs() != null) {
										    cellC.setCellValue(record.getR62_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row62
										// Column D
										cellD = row.createCell(3);
										if (record.getR62_new_chars() != null) {
										    cellD.setCellValue(record.getR62_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row63
										// Column B
										row = sheet.getRow(62);

										cellB = row.createCell(1);
										if (record.getR63_recoveries() != null) {
										    cellB.setCellValue(record.getR63_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row63
										// Column C
										cellC = row.createCell(2);
										if (record.getR63_write_offs() != null) {
										    cellC.setCellValue(record.getR63_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row63
										// Column D
										cellD = row.createCell(3);
										if (record.getR63_new_chars() != null) {
										    cellD.setCellValue(record.getR63_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										
										// row67
										// Column E
										
										row = sheet.getRow(66);
										
										cellE = row.createCell(4);
										if (record.getR67_total() != null) {
										    cellE.setCellValue(record.getR67_total().doubleValue());
										    cellE.setCellStyle(numberStyle);
										} else {
										    cellE.setCellValue("");
										    cellE.setCellStyle(textStyle);
										}

										// row68
										// Column E
										
										row = sheet.getRow(67);
										
										cellE = row.createCell(4);
										if (record.getR68_total() != null) {
										    cellE.setCellValue(record.getR68_total().doubleValue());
										    cellE.setCellStyle(numberStyle);
										} else {
										    cellE.setCellValue("");
										    cellE.setCellStyle(textStyle);
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

	public byte[] getM_I_S_CADetailExcel(String filename, String fromdate, String todate, String currency, String dtltype,
			String type, String version){
		try {
			logger.info("Generating Excel for M_I_S_CA Details...");
			System.out.println("came to Detail download service");
			
			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getM_I_S_CADetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("M_GMIRTDetails");

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
			List<M_I_S_CA_Detail_Entity> reportData = brrs_m_i_s_ca_detail_repo.getdatabydateList(parsedToDate);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_I_S_CA_Detail_Entity item : reportData) {
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
				logger.info("No data found for M_I_S_CA — only header will be written.");
			}

			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generating M_I_S_CA Excel", e);
			return new byte[0];
		}
	}

	public List<Object> getM_I_S_CAArchival() {
		List<Object> M_I_S_CAArchivallist = new ArrayList<>();
		try {
			M_I_S_CAArchivallist = m_i_s_ca_Archival_Summary_Repo.getM_I_S_CAarchival();
			System.out.println("countser" + M_I_S_CAArchivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_I_S_CA Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return M_I_S_CAArchivallist;
	}	
	
	
	public byte[] getExcelM_I_S_CAARCHIVAL(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws Exception {

		logger.info("Service: Starting Excel generation process in memory.");

		if (type.equals("ARCHIVAL") & version != null) {

		}

		List<M_I_S_CA_Archival_Summary_Entity> dataList = m_i_s_ca_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_I_S_CA report. Returning empty result.");
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
					M_I_S_CA_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

					// row10
					// Column E
					Cell cellE = row.createCell(4);
					if (record.getR10_total() != null) {
						cellE.setCellValue(record.getR10_total().doubleValue());
						cellE.setCellStyle(numberStyle);
					} else {
						cellE.setCellValue("");
						cellE.setCellStyle(textStyle);
					}

					// row12
					// Column B
					
					row = sheet.getRow(11);
					
					Cell cellB = row.createCell(1);
					if (record.getR12_recoveries() != null) {
						cellB.setCellValue(record.getR12_recoveries().doubleValue());
						cellB.setCellStyle(numberStyle);
					} else {
						cellB.setCellValue("");
						cellB.setCellStyle(textStyle);
					}

					// row12
					// Column C
					Cell cellC = row.createCell(2);
					if (record.getR12_write_offs() != null) {
						cellC.setCellValue(record.getR12_write_offs().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// row12
					// Column D
					Cell cellD = row.createCell(3);
					if (record.getR12_new_chars() != null) {
						cellD.setCellValue(record.getR12_new_chars().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					
					

					            // row13
										// Column B
										
										row = sheet.getRow(12);
										
										 cellB = row.createCell(1);
										if (record.getR13_recoveries() != null) {
											cellB.setCellValue(record.getR13_recoveries().doubleValue());
											cellB.setCellStyle(numberStyle);
										} else {
											cellB.setCellValue("");
											cellB.setCellStyle(textStyle);
										}

										// row13
										// Column C
										 cellC = row.createCell(2);
										if (record.getR13_write_offs() != null) {
											cellC.setCellValue(record.getR13_write_offs().doubleValue());
											cellC.setCellStyle(numberStyle);
										} else {
											cellC.setCellValue("");
											cellC.setCellStyle(textStyle);
										}

										// row13
										// Column D
										 cellD = row.createCell(3);
										if (record.getR13_new_chars() != null) {
											cellD.setCellValue(record.getR13_new_chars().doubleValue());
											cellD.setCellStyle(numberStyle);
										} else {
											cellD.setCellValue("");
											cellD.setCellStyle(textStyle);
										}
										
										
										
										// row14
										// Column B
										row = sheet.getRow(13);

										cellB = row.createCell(1);
										if (record.getR14_recoveries() != null) {
										    cellB.setCellValue(record.getR14_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row14
										// Column C
										cellC = row.createCell(2);
										if (record.getR14_write_offs() != null) {
										    cellC.setCellValue(record.getR14_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row14
										// Column D
										cellD = row.createCell(3);
										if (record.getR14_new_chars() != null) {
										    cellD.setCellValue(record.getR14_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row16
										// Column B
										row = sheet.getRow(15);

										cellB = row.createCell(1);
										if (record.getR16_recoveries() != null) {
										    cellB.setCellValue(record.getR16_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row16
										// Column C
										cellC = row.createCell(2);
										if (record.getR16_write_offs() != null) {
										    cellC.setCellValue(record.getR16_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row16
										// Column D
										cellD = row.createCell(3);
										if (record.getR16_new_chars() != null) {
										    cellD.setCellValue(record.getR16_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row17
										// Column B
										row = sheet.getRow(16);

										cellB = row.createCell(1);
										if (record.getR17_recoveries() != null) {
										    cellB.setCellValue(record.getR17_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row17
										// Column C
										cellC = row.createCell(2);
										if (record.getR17_write_offs() != null) {
										    cellC.setCellValue(record.getR17_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row17
										// Column D
										cellD = row.createCell(3);
										if (record.getR17_new_chars() != null) {
										    cellD.setCellValue(record.getR17_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row18
										// Column B
										row = sheet.getRow(17);

										cellB = row.createCell(1);
										if (record.getR18_recoveries() != null) {
										    cellB.setCellValue(record.getR18_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row18
										// Column C
										cellC = row.createCell(2);
										if (record.getR18_write_offs() != null) {
										    cellC.setCellValue(record.getR18_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row18
										// Column D
										cellD = row.createCell(3);
										if (record.getR18_new_chars() != null) {
										    cellD.setCellValue(record.getR18_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row19
										// Column B
										row = sheet.getRow(18);

										cellB = row.createCell(1);
										if (record.getR19_recoveries() != null) {
										    cellB.setCellValue(record.getR19_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row19
										// Column C
										cellC = row.createCell(2);
										if (record.getR19_write_offs() != null) {
										    cellC.setCellValue(record.getR19_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row19
										// Column D
										cellD = row.createCell(3);
										if (record.getR19_new_chars() != null) {
										    cellD.setCellValue(record.getR19_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row20
										// Column B
										row = sheet.getRow(19);

										cellB = row.createCell(1);
										if (record.getR20_recoveries() != null) {
										    cellB.setCellValue(record.getR20_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row20
										// Column C
										cellC = row.createCell(2);
										if (record.getR20_write_offs() != null) {
										    cellC.setCellValue(record.getR20_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row20
										// Column D
										cellD = row.createCell(3);
										if (record.getR20_new_chars() != null) {
										    cellD.setCellValue(record.getR20_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row21
										// Column B
										row = sheet.getRow(20);

										cellB = row.createCell(1);
										if (record.getR21_recoveries() != null) {
										    cellB.setCellValue(record.getR21_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row21
										// Column C
										cellC = row.createCell(2);
										if (record.getR21_write_offs() != null) {
										    cellC.setCellValue(record.getR21_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row21
										// Column D
										cellD = row.createCell(3);
										if (record.getR21_new_chars() != null) {
										    cellD.setCellValue(record.getR21_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row22
										// Column B
										row = sheet.getRow(21);

										cellB = row.createCell(1);
										if (record.getR22_recoveries() != null) {
										    cellB.setCellValue(record.getR22_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row22
										// Column C
										cellC = row.createCell(2);
										if (record.getR22_write_offs() != null) {
										    cellC.setCellValue(record.getR22_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row22
										// Column D
										cellD = row.createCell(3);
										if (record.getR22_new_chars() != null) {
										    cellD.setCellValue(record.getR22_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row23
										// Column B
										row = sheet.getRow(22);

										cellB = row.createCell(1);
										if (record.getR23_recoveries() != null) {
										    cellB.setCellValue(record.getR23_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row23
										// Column C
										cellC = row.createCell(2);
										if (record.getR23_write_offs() != null) {
										    cellC.setCellValue(record.getR23_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row23
										// Column D
										cellD = row.createCell(3);
										if (record.getR23_new_chars() != null) {
										    cellD.setCellValue(record.getR23_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row24
										// Column B
										row = sheet.getRow(23);

										cellB = row.createCell(1);
										if (record.getR24_recoveries() != null) {
										    cellB.setCellValue(record.getR24_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row24
										// Column C
										cellC = row.createCell(2);
										if (record.getR24_write_offs() != null) {
										    cellC.setCellValue(record.getR24_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row24
										// Column D
										cellD = row.createCell(3);
										if (record.getR24_new_chars() != null) {
										    cellD.setCellValue(record.getR24_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row25
										// Column B
										row = sheet.getRow(24);

										cellB = row.createCell(1);
										if (record.getR25_recoveries() != null) {
										    cellB.setCellValue(record.getR25_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row25
										// Column C
										cellC = row.createCell(2);
										if (record.getR25_write_offs() != null) {
										    cellC.setCellValue(record.getR25_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row25
										// Column D
										cellD = row.createCell(3);
										if (record.getR25_new_chars() != null) {
										    cellD.setCellValue(record.getR25_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row26
										// Column B
										row = sheet.getRow(25);

										cellB = row.createCell(1);
										if (record.getR26_recoveries() != null) {
										    cellB.setCellValue(record.getR26_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row26
										// Column C
										cellC = row.createCell(2);
										if (record.getR26_write_offs() != null) {
										    cellC.setCellValue(record.getR26_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row26
										// Column D
										cellD = row.createCell(3);
										if (record.getR26_new_chars() != null) {
										    cellD.setCellValue(record.getR26_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row27
										// Column B
										row = sheet.getRow(26);

										cellB = row.createCell(1);
										if (record.getR27_recoveries() != null) {
										    cellB.setCellValue(record.getR27_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row27
										// Column C
										cellC = row.createCell(2);
										if (record.getR27_write_offs() != null) {
										    cellC.setCellValue(record.getR27_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row27
										// Column D
										cellD = row.createCell(3);
										if (record.getR27_new_chars() != null) {
										    cellD.setCellValue(record.getR27_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row28
										// Column B
										row = sheet.getRow(27);

										cellB = row.createCell(1);
										if (record.getR28_recoveries() != null) {
										    cellB.setCellValue(record.getR28_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row28
										// Column C
										cellC = row.createCell(2);
										if (record.getR28_write_offs() != null) {
										    cellC.setCellValue(record.getR28_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row28
										// Column D
										cellD = row.createCell(3);
										if (record.getR28_new_chars() != null) {
										    cellD.setCellValue(record.getR28_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row30
										// Column B
										row = sheet.getRow(29);

										cellB = row.createCell(1);
										if (record.getR30_recoveries() != null) {
										    cellB.setCellValue(record.getR30_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row30
										// Column C
										cellC = row.createCell(2);
										if (record.getR30_write_offs() != null) {
										    cellC.setCellValue(record.getR30_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row30
										// Column D
										cellD = row.createCell(3);
										if (record.getR30_new_chars() != null) {
										    cellD.setCellValue(record.getR30_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row31
										// Column B
										row = sheet.getRow(30);

										cellB = row.createCell(1);
										if (record.getR31_recoveries() != null) {
										    cellB.setCellValue(record.getR31_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row31
										// Column C
										cellC = row.createCell(2);
										if (record.getR31_write_offs() != null) {
										    cellC.setCellValue(record.getR31_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row31
										// Column D
										cellD = row.createCell(3);
										if (record.getR31_new_chars() != null) {
										    cellD.setCellValue(record.getR31_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row32
										// Column B
										row = sheet.getRow(31);

										cellB = row.createCell(1);
										if (record.getR32_recoveries() != null) {
										    cellB.setCellValue(record.getR32_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row32
										// Column C
										cellC = row.createCell(2);
										if (record.getR32_write_offs() != null) {
										    cellC.setCellValue(record.getR32_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row32
										// Column D
										cellD = row.createCell(3);
										if (record.getR32_new_chars() != null) {
										    cellD.setCellValue(record.getR32_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row33
										// Column B
										row = sheet.getRow(32);

										cellB = row.createCell(1);
										if (record.getR33_recoveries() != null) {
										    cellB.setCellValue(record.getR33_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row33
										// Column C
										cellC = row.createCell(2);
										if (record.getR33_write_offs() != null) {
										    cellC.setCellValue(record.getR33_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row33
										// Column D
										cellD = row.createCell(3);
										if (record.getR33_new_chars() != null) {
										    cellD.setCellValue(record.getR33_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row34
										// Column B
										row = sheet.getRow(33);

										cellB = row.createCell(1);
										if (record.getR34_recoveries() != null) {
										    cellB.setCellValue(record.getR34_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row34
										// Column C
										cellC = row.createCell(2);
										if (record.getR34_write_offs() != null) {
										    cellC.setCellValue(record.getR34_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row34
										// Column D
										cellD = row.createCell(3);
										if (record.getR34_new_chars() != null) {
										    cellD.setCellValue(record.getR34_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row35
										// Column B
										row = sheet.getRow(34);

										cellB = row.createCell(1);
										if (record.getR35_recoveries() != null) {
										    cellB.setCellValue(record.getR35_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row35
										// Column C
										cellC = row.createCell(2);
										if (record.getR35_write_offs() != null) {
										    cellC.setCellValue(record.getR35_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row35
										// Column D
										cellD = row.createCell(3);
										if (record.getR35_new_chars() != null) {
										    cellD.setCellValue(record.getR35_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row36
										// Column B
										row = sheet.getRow(35);

										cellB = row.createCell(1);
										if (record.getR36_recoveries() != null) {
										    cellB.setCellValue(record.getR36_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row36
										// Column C
										cellC = row.createCell(2);
										if (record.getR36_write_offs() != null) {
										    cellC.setCellValue(record.getR36_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row36
										// Column D
										cellD = row.createCell(3);
										if (record.getR36_new_chars() != null) {
										    cellD.setCellValue(record.getR36_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row37
										// Column B
										row = sheet.getRow(36);

										cellB = row.createCell(1);
										if (record.getR37_recoveries() != null) {
										    cellB.setCellValue(record.getR37_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row37
										// Column C
										cellC = row.createCell(2);
										if (record.getR37_write_offs() != null) {
										    cellC.setCellValue(record.getR37_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row37
										// Column D
										cellD = row.createCell(3);
										if (record.getR37_new_chars() != null) {
										    cellD.setCellValue(record.getR37_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										
										// row39
										// Column B
										row = sheet.getRow(38);

										cellB = row.createCell(1);
										if (record.getR39_recoveries() != null) {
										    cellB.setCellValue(record.getR39_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row39
										// Column C
										cellC = row.createCell(2);
										if (record.getR39_write_offs() != null) {
										    cellC.setCellValue(record.getR39_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row39
										// Column D
										cellD = row.createCell(3);
										if (record.getR39_new_chars() != null) {
										    cellD.setCellValue(record.getR39_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row40
										// Column B
										row = sheet.getRow(39);

										cellB = row.createCell(1);
										if (record.getR40_recoveries() != null) {
										    cellB.setCellValue(record.getR40_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row40
										// Column C
										cellC = row.createCell(2);
										if (record.getR40_write_offs() != null) {
										    cellC.setCellValue(record.getR40_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row40
										// Column D
										cellD = row.createCell(3);
										if (record.getR40_new_chars() != null) {
										    cellD.setCellValue(record.getR40_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row42
										// Column B
										row = sheet.getRow(41);

										cellB = row.createCell(1);
										if (record.getR42_recoveries() != null) {
										    cellB.setCellValue(record.getR42_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row42
										// Column C
										cellC = row.createCell(2);
										if (record.getR42_write_offs() != null) {
										    cellC.setCellValue(record.getR42_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row42
										// Column D
										cellD = row.createCell(3);
										if (record.getR42_new_chars() != null) {
										    cellD.setCellValue(record.getR42_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row43
										// Column B
										row = sheet.getRow(42);

										cellB = row.createCell(1);
										if (record.getR43_recoveries() != null) {
										    cellB.setCellValue(record.getR43_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row43
										// Column C
										cellC = row.createCell(2);
										if (record.getR43_write_offs() != null) {
										    cellC.setCellValue(record.getR43_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row43
										// Column D
										cellD = row.createCell(3);
										if (record.getR43_new_chars() != null) {
										    cellD.setCellValue(record.getR43_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row44
										// Column B
										row = sheet.getRow(43);

										cellB = row.createCell(1);
										if (record.getR44_recoveries() != null) {
										    cellB.setCellValue(record.getR44_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row44
										// Column C
										cellC = row.createCell(2);
										if (record.getR44_write_offs() != null) {
										    cellC.setCellValue(record.getR44_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row44
										// Column D
										cellD = row.createCell(3);
										if (record.getR44_new_chars() != null) {
										    cellD.setCellValue(record.getR44_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row45
										// Column B
										row = sheet.getRow(44);

										cellB = row.createCell(1);
										if (record.getR45_recoveries() != null) {
										    cellB.setCellValue(record.getR45_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row45
										// Column C
										cellC = row.createCell(2);
										if (record.getR45_write_offs() != null) {
										    cellC.setCellValue(record.getR45_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row45
										// Column D
										cellD = row.createCell(3);
										if (record.getR45_new_chars() != null) {
										    cellD.setCellValue(record.getR45_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row46
										// Column B
										row = sheet.getRow(45);

										cellB = row.createCell(1);
										if (record.getR46_recoveries() != null) {
										    cellB.setCellValue(record.getR46_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row46
										// Column C
										cellC = row.createCell(2);
										if (record.getR46_write_offs() != null) {
										    cellC.setCellValue(record.getR46_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row46
										// Column D
										cellD = row.createCell(3);
										if (record.getR46_new_chars() != null) {
										    cellD.setCellValue(record.getR46_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row47
										// Column B
										row = sheet.getRow(46);

										cellB = row.createCell(1);
										if (record.getR47_recoveries() != null) {
										    cellB.setCellValue(record.getR47_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row47
										// Column C
										cellC = row.createCell(2);
										if (record.getR47_write_offs() != null) {
										    cellC.setCellValue(record.getR47_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row47
										// Column D
										cellD = row.createCell(3);
										if (record.getR47_new_chars() != null) {
										    cellD.setCellValue(record.getR47_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row48
										// Column B
										row = sheet.getRow(47);

										cellB = row.createCell(1);
										if (record.getR48_recoveries() != null) {
										    cellB.setCellValue(record.getR48_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row48
										// Column C
										cellC = row.createCell(2);
										if (record.getR48_write_offs() != null) {
										    cellC.setCellValue(record.getR48_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row48
										// Column D
										cellD = row.createCell(3);
										if (record.getR48_new_chars() != null) {
										    cellD.setCellValue(record.getR48_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row50
										// Column B
										row = sheet.getRow(49);

										cellB = row.createCell(1);
										if (record.getR50_recoveries() != null) {
										    cellB.setCellValue(record.getR50_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row50
										// Column C
										cellC = row.createCell(2);
										if (record.getR50_write_offs() != null) {
										    cellC.setCellValue(record.getR50_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row50
										// Column D
										cellD = row.createCell(3);
										if (record.getR50_new_chars() != null) {
										    cellD.setCellValue(record.getR50_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row51
										// Column B
										row = sheet.getRow(50);

										cellB = row.createCell(1);
										if (record.getR51_recoveries() != null) {
										    cellB.setCellValue(record.getR51_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row51
										// Column C
										cellC = row.createCell(2);
										if (record.getR51_write_offs() != null) {
										    cellC.setCellValue(record.getR51_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row51
										// Column D
										cellD = row.createCell(3);
										if (record.getR51_new_chars() != null) {
										    cellD.setCellValue(record.getR51_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row52
										// Column B
										row = sheet.getRow(51);

										cellB = row.createCell(1);
										if (record.getR52_recoveries() != null) {
										    cellB.setCellValue(record.getR52_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row52
										// Column C
										cellC = row.createCell(2);
										if (record.getR52_write_offs() != null) {
										    cellC.setCellValue(record.getR52_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row52
										// Column D
										cellD = row.createCell(3);
										if (record.getR52_new_chars() != null) {
										    cellD.setCellValue(record.getR52_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										// row54
										// Column B
										row = sheet.getRow(53);

										cellB = row.createCell(1);
										if (record.getR54_recoveries() != null) {
										    cellB.setCellValue(record.getR54_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row54
										// Column C
										cellC = row.createCell(2);
										if (record.getR54_write_offs() != null) {
										    cellC.setCellValue(record.getR54_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row54
										// Column D
										cellD = row.createCell(3);
										if (record.getR54_new_chars() != null) {
										    cellD.setCellValue(record.getR54_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row55
										// Column B
										row = sheet.getRow(54);

										cellB = row.createCell(1);
										if (record.getR55_recoveries() != null) {
										    cellB.setCellValue(record.getR55_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row55
										// Column C
										cellC = row.createCell(2);
										if (record.getR55_write_offs() != null) {
										    cellC.setCellValue(record.getR55_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row55
										// Column D
										cellD = row.createCell(3);
										if (record.getR55_new_chars() != null) {
										    cellD.setCellValue(record.getR55_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row56
										// Column B
										row = sheet.getRow(55);

										cellB = row.createCell(1);
										if (record.getR56_recoveries() != null) {
										    cellB.setCellValue(record.getR56_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row56
										// Column C
										cellC = row.createCell(2);
										if (record.getR56_write_offs() != null) {
										    cellC.setCellValue(record.getR56_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row56
										// Column D
										cellD = row.createCell(3);
										if (record.getR56_new_chars() != null) {
										    cellD.setCellValue(record.getR56_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										// row58
										// Column B
										row = sheet.getRow(57);

										cellB = row.createCell(1);
										if (record.getR58_recoveries() != null) {
										    cellB.setCellValue(record.getR58_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row58
										// Column C
										cellC = row.createCell(2);
										if (record.getR58_write_offs() != null) {
										    cellC.setCellValue(record.getR58_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row58
										// Column D
										cellD = row.createCell(3);
										if (record.getR58_new_chars() != null) {
										    cellD.setCellValue(record.getR58_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row59
										// Column B
										row = sheet.getRow(58);

										cellB = row.createCell(1);
										if (record.getR59_recoveries() != null) {
										    cellB.setCellValue(record.getR59_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row59
										// Column C
										cellC = row.createCell(2);
										if (record.getR59_write_offs() != null) {
										    cellC.setCellValue(record.getR59_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row59
										// Column D
										cellD = row.createCell(3);
										if (record.getR59_new_chars() != null) {
										    cellD.setCellValue(record.getR59_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row60
										// Column B
										row = sheet.getRow(59);

										cellB = row.createCell(1);
										if (record.getR60_recoveries() != null) {
										    cellB.setCellValue(record.getR60_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row60
										// Column C
										cellC = row.createCell(2);
										if (record.getR60_write_offs() != null) {
										    cellC.setCellValue(record.getR60_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row60
										// Column D
										cellD = row.createCell(3);
										if (record.getR60_new_chars() != null) {
										    cellD.setCellValue(record.getR60_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row61
										// Column B
										row = sheet.getRow(60);

										cellB = row.createCell(1);
										if (record.getR61_recoveries() != null) {
										    cellB.setCellValue(record.getR61_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row61
										// Column C
										cellC = row.createCell(2);
										if (record.getR61_write_offs() != null) {
										    cellC.setCellValue(record.getR61_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row61
										// Column D
										cellD = row.createCell(3);
										if (record.getR61_new_chars() != null) {
										    cellD.setCellValue(record.getR61_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row62
										// Column B
										row = sheet.getRow(61);

										cellB = row.createCell(1);
										if (record.getR62_recoveries() != null) {
										    cellB.setCellValue(record.getR62_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row62
										// Column C
										cellC = row.createCell(2);
										if (record.getR62_write_offs() != null) {
										    cellC.setCellValue(record.getR62_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row62
										// Column D
										cellD = row.createCell(3);
										if (record.getR62_new_chars() != null) {
										    cellD.setCellValue(record.getR62_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}

										// row63
										// Column B
										row = sheet.getRow(62);

										cellB = row.createCell(1);
										if (record.getR63_recoveries() != null) {
										    cellB.setCellValue(record.getR63_recoveries().doubleValue());
										    cellB.setCellStyle(numberStyle);
										} else {
										    cellB.setCellValue("");
										    cellB.setCellStyle(textStyle);
										}

										// row63
										// Column C
										cellC = row.createCell(2);
										if (record.getR63_write_offs() != null) {
										    cellC.setCellValue(record.getR63_write_offs().doubleValue());
										    cellC.setCellStyle(numberStyle);
										} else {
										    cellC.setCellValue("");
										    cellC.setCellStyle(textStyle);
										}

										// row63
										// Column D
										cellD = row.createCell(3);
										if (record.getR63_new_chars() != null) {
										    cellD.setCellValue(record.getR63_new_chars().doubleValue());
										    cellD.setCellStyle(numberStyle);
										} else {
										    cellD.setCellValue("");
										    cellD.setCellStyle(textStyle);
										}
										
										
										
										// row67
										// Column E
										
										row = sheet.getRow(66);
										
										cellE = row.createCell(4);
										if (record.getR67_total() != null) {
										    cellE.setCellValue(record.getR67_total().doubleValue());
										    cellE.setCellStyle(numberStyle);
										} else {
										    cellE.setCellValue("");
										    cellE.setCellStyle(textStyle);
										}

										// row68
										// Column E
										
										row = sheet.getRow(67);
										
										cellE = row.createCell(4);
										if (record.getR68_total() != null) {
										    cellE.setCellValue(record.getR68_total().doubleValue());
										    cellE.setCellStyle(numberStyle);
										} else {
										    cellE.setCellValue("");
										    cellE.setCellStyle(textStyle);
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

	public byte[] getM_I_S_CADetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for M_I_S_CA ARCHIVAL Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {

			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("M_I_S_CADetail");

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
			List<M_I_S_CA_Archival_Detail_Entity> reportData = m_i_s_ca_Archival_Detail_Repo.getdatabydateList(parsedToDate,
					version);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_I_S_CA_Archival_Detail_Entity item : reportData) {
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
				logger.info("No data found for M_I_S_CA — only header will be written.");
			}

// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generating M_I_S_CAExcel", e);
			return new byte[0];
		}
	}
	
	
	
	
	
}