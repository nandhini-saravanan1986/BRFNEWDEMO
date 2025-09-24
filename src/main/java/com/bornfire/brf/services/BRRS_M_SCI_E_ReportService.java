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


import com.bornfire.brf.entities.M_SCI_E_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_SCI_E_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SCI_E_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SCI_E_Detail_Repo;
import com.bornfire.brf.entities.M_SCI_E_Summary_Entity;
import com.bornfire.brf.entities.BRRS_M_SCI_E_Summary_Repo;

import com.bornfire.brf.entities.M_SCI_E_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SCI_E_Archival_Summary_Entity;


@Component
@Service

public class BRRS_M_SCI_E_ReportService {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SCI_E_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	BRRS_M_SCI_E_Detail_Repo brrs_m_sci_e_detail_repo;

	@Autowired
	BRRS_M_SCI_E_Summary_Repo  brrs_m_sci_e_summary_repo;
	
	@Autowired
	BRRS_M_SCI_E_Archival_Detail_Repo brrs_m_sci_e_Archival_detail_repo;
	
	@Autowired
	BRRS_M_SCI_E_Archival_Summary_Repo brrs_m_sci_e_Archival_summary_repo;
	

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_SCI_EView(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable,String type, String version) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		
		System.out.println("testing");
		System.out.println(version);
		
		
		if (type.equals("ARCHIVAL") & version != null) {
			System.out.println(type);
			List<M_SCI_E_Archival_Summary_Entity> T1Master = new ArrayList<M_SCI_E_Archival_Summary_Entity>();
			System.out.println(version);
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();

				T1Master = brrs_m_sci_e_Archival_summary_repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {

		List<M_SCI_E_Summary_Entity> T1Master = new ArrayList<M_SCI_E_Summary_Entity>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
			// ", BRF1_REPORT_ENTITY.class)
			// .setParameter(1, df.parse(todate)).getResultList();
			T1Master = brrs_m_sci_e_summary_repo.getdatabydateList(dateformat.parse(todate));
			mv.addObject("report_date", dateformat.format(d1));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		mv.addObject("reportsummary", T1Master);
		}
		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRRS/M_SCI_E");

		
		// mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		// mv.addObject("reportsflag", "reportsflag");
		// mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}

	public ModelAndView getM_SCI_EcurrentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter,String type, String version) {

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
				List<M_SCI_E_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = brrs_m_sci_e_Archival_detail_repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
				} else {
					T1Dt1 = brrs_m_sci_e_Archival_detail_repo.getdatabydateList(parsedDate, version);
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
				// 🔹 Current branch
				
				List<M_SCI_E_Detail_Entity> T1Dt1;

			if (rowId != null && columnId != null) {
				T1Dt1 = brrs_m_sci_e_detail_repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
			} else {
				T1Dt1 = brrs_m_sci_e_detail_repo.getdatabydateList(parsedDate, currentPage, pageSize);
				totalPages= brrs_m_sci_e_detail_repo.getdatacount(parsedDate);
				mv.addObject("pagination","YES");
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

		// Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist,
		// PageRequest.of(currentPage, pageSize), T1Dt1.size());
		// mv.addObject("reportdetails", T1Dt1Page.getContent());
		// mv.addObject("reportmaster1", qr);
		// mv.addObject("singledetail", new T1CurProdDetail());
		
		mv.setViewName("BRRS/M_SCI_E");
		mv.addObject("displaymode", "Details");
		mv.addObject("currentPage", currentPage);
		System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
		mv.addObject("totalPages",(int)Math.ceil((double)totalPages / 100));
		
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;
	}

	public byte[] getM_SCI_EExcel(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		
		
		// ARCHIVAL check
				if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
					logger.info("Service: Generating ARCHIVAL report for version {}", version);
					return getExcelM_SCI_EARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
				}

				

		// Fetch data
		List<M_SCI_E_Summary_Entity> dataList = brrs_m_sci_e_summary_repo
				.getdatabydateList(dateformat.parse(todate));

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_SCI_E report. Returning empty result.");
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
					M_SCI_E_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					Cell cellC,cellD;    
					
					// row11
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR11_month() != null) {
						cellC.setCellValue(record.getR11_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR11_ytd() != null) {
						cellD.setCellValue(record.getR11_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row12
					row = sheet.getRow(11);
					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR12_month() != null) {
						cellC.setCellValue(record.getR12_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR12_ytd() != null) {
						cellD.setCellValue(record.getR12_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row13
					row = sheet.getRow(12);
					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR13_month() != null) {
						cellC.setCellValue(record.getR13_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR13_ytd() != null) {
						cellD.setCellValue(record.getR13_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// row15
					row = sheet.getRow(14); // Row index for R15 (0-based index)

					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR15_month() != null) {
						cellC.setCellValue(record.getR15_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR15_ytd() != null) {
						cellD.setCellValue(record.getR15_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row16
					row = sheet.getRow(15);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR16_month() != null) {
						cellC.setCellValue(record.getR16_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR16_ytd() != null) {
						cellD.setCellValue(record.getR16_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row17
					row = sheet.getRow(16);

					

					cellC = row.createCell(2);
					if (record.getR17_month() != null) {
						cellC.setCellValue(record.getR17_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR17_ytd() != null) {
						cellD.setCellValue(record.getR17_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row18
					row = sheet.getRow(17);

					

					cellC = row.createCell(2);
					if (record.getR18_month() != null) {
						cellC.setCellValue(record.getR18_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR18_ytd() != null) {
						cellD.setCellValue(record.getR18_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row19
					row = sheet.getRow(18);

					

					cellC = row.createCell(2);
					if (record.getR19_month() != null) {
						cellC.setCellValue(record.getR19_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR19_ytd() != null) {
						cellD.setCellValue(record.getR19_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row20
					row = sheet.getRow(19);

					

					cellC = row.createCell(2);
					if (record.getR20_month() != null) {
						cellC.setCellValue(record.getR20_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR20_ytd() != null) {
						cellD.setCellValue(record.getR20_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row21
					row = sheet.getRow(20);

					

					cellC = row.createCell(2);
					if (record.getR21_month() != null) {
						cellC.setCellValue(record.getR21_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR21_ytd() != null) {
						cellD.setCellValue(record.getR21_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row22
					row = sheet.getRow(21);

					

					cellC = row.createCell(2);
					if (record.getR22_month() != null) {
						cellC.setCellValue(record.getR22_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR22_ytd() != null) {
						cellD.setCellValue(record.getR22_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row23
					row = sheet.getRow(22);

					

					cellC = row.createCell(2);
					if (record.getR23_month() != null) {
						cellC.setCellValue(record.getR23_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR23_ytd() != null) {
						cellD.setCellValue(record.getR23_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row24
					row = sheet.getRow(23);

					

					cellC = row.createCell(2);
					if (record.getR24_month() != null) {
						cellC.setCellValue(record.getR24_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR24_ytd() != null) {
						cellD.setCellValue(record.getR24_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row25
					row = sheet.getRow(24);

					

					cellC = row.createCell(2);
					if (record.getR25_month() != null) {
						cellC.setCellValue(record.getR25_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR25_ytd() != null) {
						cellD.setCellValue(record.getR25_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row26
					row = sheet.getRow(25);

					// Column 1 - product name
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR26_month() != null) {
						cellC.setCellValue(record.getR26_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR26_ytd() != null) {
						cellD.setCellValue(record.getR26_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row27
					row = sheet.getRow(26);

					
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR27_month() != null) {
						cellC.setCellValue(record.getR27_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR27_ytd() != null) {
						cellD.setCellValue(record.getR27_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// row29
					row = sheet.getRow(28);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR29_month() != null) {
						cellC.setCellValue(record.getR29_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR29_ytd() != null) {
						cellD.setCellValue(record.getR29_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row30
					row = sheet.getRow(29);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR30_month() != null) {
						cellC.setCellValue(record.getR30_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR30_ytd() != null) {
						cellD.setCellValue(record.getR30_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row31
					row = sheet.getRow(30);
					
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR31_month() != null) {
						cellC.setCellValue(record.getR31_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR31_ytd() != null) {
						cellD.setCellValue(record.getR31_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 32 -------------------------
					row = sheet.getRow(31);
					// Column 1 - product name
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR32_month() != null) {
						cellC.setCellValue(record.getR32_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR32_ytd() != null) {
						cellD.setCellValue(record.getR32_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 33 -------------------------
					row = sheet.getRow(32);
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR33_month() != null) {
						cellC.setCellValue(record.getR33_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR33_ytd() != null) {
						cellD.setCellValue(record.getR33_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 34 -------------------------
					row = sheet.getRow(33);
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR34_month() != null) {
						cellC.setCellValue(record.getR34_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR34_ytd() != null) {
						cellD.setCellValue(record.getR34_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 35 -------------------------
					row = sheet.getRow(34);
					
					cellC = row.createCell(2);
					if (record.getR35_month() != null) {
						cellC.setCellValue(record.getR35_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					cellD = row.createCell(3);
					if (record.getR35_ytd() != null) {
						cellD.setCellValue(record.getR35_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 36 -------------------------
					row = sheet.getRow(35);

					
					cellC = row.createCell(2);
					if (record.getR36_month() != null) {
						cellC.setCellValue(record.getR36_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					cellD = row.createCell(3);
					if (record.getR36_ytd() != null) {
						cellD.setCellValue(record.getR36_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// ------------------------- Row 38 -------------------------
					row = sheet.getRow(37);

					

					cellC = row.createCell(2);
					if (record.getR38_month() != null) {
						cellC.setCellValue(record.getR38_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR38_ytd() != null) {
						cellD.setCellValue(record.getR38_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}
               
					// row39
					row = sheet.getRow(38);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR39_month() != null) {
					    cellC.setCellValue(record.getR39_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR39_ytd() != null) {
					    cellD.setCellValue(record.getR39_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					
					
					// row42
					row = sheet.getRow(41);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR42_month() != null) {
					    cellC.setCellValue(record.getR42_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR42_ytd() != null) {
					    cellD.setCellValue(record.getR42_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row43
					row = sheet.getRow(42);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR43_month() != null) {
					    cellC.setCellValue(record.getR43_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR43_ytd() != null) {
					    cellD.setCellValue(record.getR43_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

				

					// row45
					row = sheet.getRow(44);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR45_month() != null) {
					    cellC.setCellValue(record.getR45_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR45_ytd() != null) {
					    cellD.setCellValue(record.getR45_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row46
					row = sheet.getRow(45);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR46_month() != null) {
					    cellC.setCellValue(record.getR46_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR46_ytd() != null) {
					    cellD.setCellValue(record.getR46_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row47
					row = sheet.getRow(46);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR47_month() != null) {
					    cellC.setCellValue(record.getR47_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR47_ytd() != null) {
					    cellD.setCellValue(record.getR47_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row50
					row = sheet.getRow(49);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR50_month() != null) {
					    cellC.setCellValue(record.getR50_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR50_ytd() != null) {
					    cellD.setCellValue(record.getR50_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row51
					row = sheet.getRow(50);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR51_month() != null) {
					    cellC.setCellValue(record.getR51_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR51_ytd() != null) {
					    cellD.setCellValue(record.getR51_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row52
					row = sheet.getRow(51);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR52_month() != null) {
					    cellC.setCellValue(record.getR52_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR52_ytd() != null) {
					    cellD.setCellValue(record.getR52_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row53
					row = sheet.getRow(52);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR53_month() != null) {
					    cellC.setCellValue(record.getR53_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR53_ytd() != null) {
					    cellD.setCellValue(record.getR53_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row54
					row = sheet.getRow(53);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR54_month() != null) {
					    cellC.setCellValue(record.getR54_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR54_ytd() != null) {
					    cellD.setCellValue(record.getR54_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row55
					row = sheet.getRow(54);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR55_month() != null) {
					    cellC.setCellValue(record.getR55_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR55_ytd() != null) {
					    cellD.setCellValue(record.getR55_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row58
					row = sheet.getRow(57);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR58_month() != null) {
					    cellC.setCellValue(record.getR58_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR58_ytd() != null) {
					    cellD.setCellValue(record.getR58_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row59
					row = sheet.getRow(58);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR59_month() != null) {
					    cellC.setCellValue(record.getR59_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR59_ytd() != null) {
					    cellD.setCellValue(record.getR59_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row60
					row = sheet.getRow(59);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR60_month() != null) {
					    cellC.setCellValue(record.getR60_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR60_ytd() != null) {
					    cellD.setCellValue(record.getR60_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					
					
					
					// row63
					row = sheet.getRow(62);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR63_month() != null) {
					    cellC.setCellValue(record.getR63_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR63_ytd() != null) {
					    cellD.setCellValue(record.getR63_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row64
					row = sheet.getRow(63);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR64_month() != null) {
					    cellC.setCellValue(record.getR64_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR64_ytd() != null) {
					    cellD.setCellValue(record.getR64_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row65
					row = sheet.getRow(64);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR65_month() != null) {
					    cellC.setCellValue(record.getR65_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR65_ytd() != null) {
					    cellD.setCellValue(record.getR65_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row66
					row = sheet.getRow(65);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR66_month() != null) {
					    cellC.setCellValue(record.getR66_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR66_ytd() != null) {
					    cellD.setCellValue(record.getR66_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row67
					row = sheet.getRow(66);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR67_month() != null) {
					    cellC.setCellValue(record.getR67_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR67_ytd() != null) {
					    cellD.setCellValue(record.getR67_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row68
					row = sheet.getRow(67);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR68_month() != null) {
					    cellC.setCellValue(record.getR68_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR68_ytd() != null) {
					    cellD.setCellValue(record.getR68_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row69
					row = sheet.getRow(68);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR69_month() != null) {
					    cellC.setCellValue(record.getR69_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR69_ytd() != null) {
					    cellD.setCellValue(record.getR69_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					// row71
					row = sheet.getRow(70);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR71_month() != null) {
					    cellC.setCellValue(record.getR71_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR71_ytd() != null) {
					    cellD.setCellValue(record.getR71_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row72
					row = sheet.getRow(71);

				

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR72_month() != null) {
					    cellC.setCellValue(record.getR72_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR72_ytd() != null) {
					    cellD.setCellValue(record.getR72_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row73
					row = sheet.getRow(72);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR73_month() != null) {
					    cellC.setCellValue(record.getR73_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR73_ytd() != null) {
					    cellD.setCellValue(record.getR73_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row74
					row = sheet.getRow(73);

					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR74_month() != null) {
					    cellC.setCellValue(record.getR74_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR74_ytd() != null) {
					    cellD.setCellValue(record.getR74_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					// row76
					row = sheet.getRow(75);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR76_month() != null) {
					    cellC.setCellValue(record.getR76_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR76_ytd() != null) {
					    cellD.setCellValue(record.getR76_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row77
					row = sheet.getRow(76);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR77_month() != null) {
					    cellC.setCellValue(record.getR77_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR77_ytd() != null) {
					    cellD.setCellValue(record.getR77_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row78
					row = sheet.getRow(77);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR78_month() != null) {
					    cellC.setCellValue(record.getR78_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR78_ytd() != null) {
					    cellD.setCellValue(record.getR78_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row79
					row = sheet.getRow(78);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR79_month() != null) {
					    cellC.setCellValue(record.getR79_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR79_ytd() != null) {
					    cellD.setCellValue(record.getR79_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row80
					row = sheet.getRow(79);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR80_month() != null) {
					    cellC.setCellValue(record.getR80_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR80_ytd() != null) {
					    cellD.setCellValue(record.getR80_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row83
					row = sheet.getRow(82);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR83_month() != null) {
					    cellC.setCellValue(record.getR83_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR83_ytd() != null) {
					    cellD.setCellValue(record.getR83_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					
					
					// row85
					row = sheet.getRow(84);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR85_month() != null) {
					    cellC.setCellValue(record.getR85_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR85_ytd() != null) {
					    cellD.setCellValue(record.getR85_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
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
	
	
	public byte[] getM_SCI_EDetailExcel(String filename, String fromdate, String todate, String currency, String dtltype,
			String type, String version) {
	    try {
	        logger.info("Generating Excel for M_SCI_E Details...");
	        System.out.println("came to Detail download service");
	        
	        if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getM_SCI_EDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("M_SCI_EDetails");

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
	        List<M_SCI_E_Detail_Entity> reportData = brrs_m_sci_e_detail_repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (M_SCI_E_Detail_Entity item : reportData) {
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
	            logger.info("No data found for M_SCI_E — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating M_SCI_E Excel", e);
	        return new byte[0];
	    }
	}
	
	public List<Object> getM_SCI_EArchival() {
		List<Object> M_SCI_EArchivallist = new ArrayList<>();
		try {
			M_SCI_EArchivallist = brrs_m_sci_e_Archival_summary_repo.getM_SCI_Earchival();
			System.out.println("countser" + M_SCI_EArchivallist.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching  M_SCI_E Archival data: " + e.getMessage());
			e.printStackTrace();

			// Optionally, you can rethrow it or return empty list
			// throw new RuntimeException("Failed to fetch data", e);
		}
		return  M_SCI_EArchivallist;
	}
	
	
	public byte[] getExcelM_SCI_EARCHIVAL(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws Exception {

		logger.info("Service: Starting Excel generation process in memory.");

		if (type.equals("ARCHIVAL") & version != null) {

		}

		List<M_SCI_E_Archival_Summary_Entity> dataList = brrs_m_sci_e_Archival_summary_repo
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_SCI_E report. Returning empty result.");
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
					M_SCI_E_Archival_Summary_Entity record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

Cell cellC,cellD;    
					
					// row11
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR11_month() != null) {
						cellC.setCellValue(record.getR11_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR11_ytd() != null) {
						cellD.setCellValue(record.getR11_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row12
					row = sheet.getRow(11);
					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR12_month() != null) {
						cellC.setCellValue(record.getR12_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR12_ytd() != null) {
						cellD.setCellValue(record.getR12_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row13
					row = sheet.getRow(12);
					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR13_month() != null) {
						cellC.setCellValue(record.getR13_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR13_ytd() != null) {
						cellD.setCellValue(record.getR13_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// row15
					row = sheet.getRow(14); // Row index for R15 (0-based index)

					// Column 1 - product name
					

					// Column 2 - cross_reference
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR15_month() != null) {
						cellC.setCellValue(record.getR15_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR15_ytd() != null) {
						cellD.setCellValue(record.getR15_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row16
					row = sheet.getRow(15);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR16_month() != null) {
						cellC.setCellValue(record.getR16_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR16_ytd() != null) {
						cellD.setCellValue(record.getR16_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row17
					row = sheet.getRow(16);

					

					cellC = row.createCell(2);
					if (record.getR17_month() != null) {
						cellC.setCellValue(record.getR17_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR17_ytd() != null) {
						cellD.setCellValue(record.getR17_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row18
					row = sheet.getRow(17);

					

					cellC = row.createCell(2);
					if (record.getR18_month() != null) {
						cellC.setCellValue(record.getR18_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR18_ytd() != null) {
						cellD.setCellValue(record.getR18_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row19
					row = sheet.getRow(18);

					

					cellC = row.createCell(2);
					if (record.getR19_month() != null) {
						cellC.setCellValue(record.getR19_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR19_ytd() != null) {
						cellD.setCellValue(record.getR19_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row20
					row = sheet.getRow(19);

					

					cellC = row.createCell(2);
					if (record.getR20_month() != null) {
						cellC.setCellValue(record.getR20_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR20_ytd() != null) {
						cellD.setCellValue(record.getR20_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row21
					row = sheet.getRow(20);

					

					cellC = row.createCell(2);
					if (record.getR21_month() != null) {
						cellC.setCellValue(record.getR21_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR21_ytd() != null) {
						cellD.setCellValue(record.getR21_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row22
					row = sheet.getRow(21);

					

					cellC = row.createCell(2);
					if (record.getR22_month() != null) {
						cellC.setCellValue(record.getR22_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR22_ytd() != null) {
						cellD.setCellValue(record.getR22_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row23
					row = sheet.getRow(22);

					

					cellC = row.createCell(2);
					if (record.getR23_month() != null) {
						cellC.setCellValue(record.getR23_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR23_ytd() != null) {
						cellD.setCellValue(record.getR23_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row24
					row = sheet.getRow(23);

					

					cellC = row.createCell(2);
					if (record.getR24_month() != null) {
						cellC.setCellValue(record.getR24_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR24_ytd() != null) {
						cellD.setCellValue(record.getR24_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row25
					row = sheet.getRow(24);

					

					cellC = row.createCell(2);
					if (record.getR25_month() != null) {
						cellC.setCellValue(record.getR25_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR25_ytd() != null) {
						cellD.setCellValue(record.getR25_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row26
					row = sheet.getRow(25);

					// Column 1 - product name
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR26_month() != null) {
						cellC.setCellValue(record.getR26_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR26_ytd() != null) {
						cellD.setCellValue(record.getR26_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row27
					row = sheet.getRow(26);

					
					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR27_month() != null) {
						cellC.setCellValue(record.getR27_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR27_ytd() != null) {
						cellD.setCellValue(record.getR27_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// row29
					row = sheet.getRow(28);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR29_month() != null) {
						cellC.setCellValue(record.getR29_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR29_ytd() != null) {
						cellD.setCellValue(record.getR29_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row30
					row = sheet.getRow(29);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR30_month() != null) {
						cellC.setCellValue(record.getR30_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR30_ytd() != null) {
						cellD.setCellValue(record.getR30_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// row31
					row = sheet.getRow(30);
					
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR31_month() != null) {
						cellC.setCellValue(record.getR31_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR31_ytd() != null) {
						cellD.setCellValue(record.getR31_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 32 -------------------------
					row = sheet.getRow(31);
					// Column 1 - product name
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR32_month() != null) {
						cellC.setCellValue(record.getR32_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR32_ytd() != null) {
						cellD.setCellValue(record.getR32_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 33 -------------------------
					row = sheet.getRow(32);
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR33_month() != null) {
						cellC.setCellValue(record.getR33_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR33_ytd() != null) {
						cellD.setCellValue(record.getR33_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 34 -------------------------
					row = sheet.getRow(33);
					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR34_month() != null) {
						cellC.setCellValue(record.getR34_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR34_ytd() != null) {
						cellD.setCellValue(record.getR34_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 35 -------------------------
					row = sheet.getRow(34);
					
					cellC = row.createCell(2);
					if (record.getR35_month() != null) {
						cellC.setCellValue(record.getR35_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					cellD = row.createCell(3);
					if (record.getR35_ytd() != null) {
						cellD.setCellValue(record.getR35_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					// ------------------------- Row 36 -------------------------
					row = sheet.getRow(35);

					
					cellC = row.createCell(2);
					if (record.getR36_month() != null) {
						cellC.setCellValue(record.getR36_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}
					cellD = row.createCell(3);
					if (record.getR36_ytd() != null) {
						cellD.setCellValue(record.getR36_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}

					

					// ------------------------- Row 38 -------------------------
					row = sheet.getRow(37);

					

					cellC = row.createCell(2);
					if (record.getR38_month() != null) {
						cellC.setCellValue(record.getR38_month().doubleValue());
						cellC.setCellStyle(numberStyle);
					} else {
						cellC.setCellValue("");
						cellC.setCellStyle(textStyle);
					}

					cellD = row.createCell(3);
					if (record.getR38_ytd() != null) {
						cellD.setCellValue(record.getR38_ytd().doubleValue());
						cellD.setCellStyle(numberStyle);
					} else {
						cellD.setCellValue("");
						cellD.setCellStyle(textStyle);
					}
               
					// row39
					row = sheet.getRow(38);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR39_month() != null) {
					    cellC.setCellValue(record.getR39_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR39_ytd() != null) {
					    cellD.setCellValue(record.getR39_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					
					
					// row42
					row = sheet.getRow(41);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR42_month() != null) {
					    cellC.setCellValue(record.getR42_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR42_ytd() != null) {
					    cellD.setCellValue(record.getR42_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row43
					row = sheet.getRow(42);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR43_month() != null) {
					    cellC.setCellValue(record.getR43_month().doubleValue()); // assuming it's BigDecimal or Double
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR43_ytd() != null) {
					    cellD.setCellValue(record.getR43_ytd().doubleValue()); // assuming it's BigDecimal or Double
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

				

					// row45
					row = sheet.getRow(44);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR45_month() != null) {
					    cellC.setCellValue(record.getR45_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR45_ytd() != null) {
					    cellD.setCellValue(record.getR45_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row46
					row = sheet.getRow(45);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR46_month() != null) {
					    cellC.setCellValue(record.getR46_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR46_ytd() != null) {
					    cellD.setCellValue(record.getR46_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row47
					row = sheet.getRow(46);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR47_month() != null) {
					    cellC.setCellValue(record.getR47_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR47_ytd() != null) {
					    cellD.setCellValue(record.getR47_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row50
					row = sheet.getRow(49);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR50_month() != null) {
					    cellC.setCellValue(record.getR50_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR50_ytd() != null) {
					    cellD.setCellValue(record.getR50_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row51
					row = sheet.getRow(50);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR51_month() != null) {
					    cellC.setCellValue(record.getR51_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR51_ytd() != null) {
					    cellD.setCellValue(record.getR51_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row52
					row = sheet.getRow(51);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR52_month() != null) {
					    cellC.setCellValue(record.getR52_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR52_ytd() != null) {
					    cellD.setCellValue(record.getR52_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row53
					row = sheet.getRow(52);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR53_month() != null) {
					    cellC.setCellValue(record.getR53_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR53_ytd() != null) {
					    cellD.setCellValue(record.getR53_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row54
					row = sheet.getRow(53);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR54_month() != null) {
					    cellC.setCellValue(record.getR54_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR54_ytd() != null) {
					    cellD.setCellValue(record.getR54_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row55
					row = sheet.getRow(54);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR55_month() != null) {
					    cellC.setCellValue(record.getR55_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR55_ytd() != null) {
					    cellD.setCellValue(record.getR55_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row58
					row = sheet.getRow(57);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR58_month() != null) {
					    cellC.setCellValue(record.getR58_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR58_ytd() != null) {
					    cellD.setCellValue(record.getR58_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row59
					row = sheet.getRow(58);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR59_month() != null) {
					    cellC.setCellValue(record.getR59_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR59_ytd() != null) {
					    cellD.setCellValue(record.getR59_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row60
					row = sheet.getRow(59);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR60_month() != null) {
					    cellC.setCellValue(record.getR60_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR60_ytd() != null) {
					    cellD.setCellValue(record.getR60_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					
					
					
					// row63
					row = sheet.getRow(62);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR63_month() != null) {
					    cellC.setCellValue(record.getR63_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR63_ytd() != null) {
					    cellD.setCellValue(record.getR63_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row64
					row = sheet.getRow(63);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR64_month() != null) {
					    cellC.setCellValue(record.getR64_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR64_ytd() != null) {
					    cellD.setCellValue(record.getR64_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row65
					row = sheet.getRow(64);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR65_month() != null) {
					    cellC.setCellValue(record.getR65_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR65_ytd() != null) {
					    cellD.setCellValue(record.getR65_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row66
					row = sheet.getRow(65);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR66_month() != null) {
					    cellC.setCellValue(record.getR66_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR66_ytd() != null) {
					    cellD.setCellValue(record.getR66_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row67
					row = sheet.getRow(66);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR67_month() != null) {
					    cellC.setCellValue(record.getR67_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR67_ytd() != null) {
					    cellD.setCellValue(record.getR67_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row68
					row = sheet.getRow(67);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR68_month() != null) {
					    cellC.setCellValue(record.getR68_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR68_ytd() != null) {
					    cellD.setCellValue(record.getR68_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row69
					row = sheet.getRow(68);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR69_month() != null) {
					    cellC.setCellValue(record.getR69_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR69_ytd() != null) {
					    cellD.setCellValue(record.getR69_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					// row71
					row = sheet.getRow(70);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR71_month() != null) {
					    cellC.setCellValue(record.getR71_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR71_ytd() != null) {
					    cellD.setCellValue(record.getR71_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row72
					row = sheet.getRow(71);

				

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR72_month() != null) {
					    cellC.setCellValue(record.getR72_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR72_ytd() != null) {
					    cellD.setCellValue(record.getR72_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row73
					row = sheet.getRow(72);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR73_month() != null) {
					    cellC.setCellValue(record.getR73_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR73_ytd() != null) {
					    cellD.setCellValue(record.getR73_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row74
					row = sheet.getRow(73);

					
					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR74_month() != null) {
					    cellC.setCellValue(record.getR74_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR74_ytd() != null) {
					    cellD.setCellValue(record.getR74_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					// row76
					row = sheet.getRow(75);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR76_month() != null) {
					    cellC.setCellValue(record.getR76_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR76_ytd() != null) {
					    cellD.setCellValue(record.getR76_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row77
					row = sheet.getRow(76);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR77_month() != null) {
					    cellC.setCellValue(record.getR77_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR77_ytd() != null) {
					    cellD.setCellValue(record.getR77_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// row78
					row = sheet.getRow(77);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR78_month() != null) {
					    cellC.setCellValue(record.getR78_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR78_ytd() != null) {
					    cellD.setCellValue(record.getR78_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row79
					row = sheet.getRow(78);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR79_month() != null) {
					    cellC.setCellValue(record.getR79_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR79_ytd() != null) {
					    cellD.setCellValue(record.getR79_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					// row80
					row = sheet.getRow(79);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR80_month() != null) {
					    cellC.setCellValue(record.getR80_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR80_ytd() != null) {
					    cellD.setCellValue(record.getR80_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					

					

					// row83
					row = sheet.getRow(82);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR83_month() != null) {
					    cellC.setCellValue(record.getR83_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR83_ytd() != null) {
					    cellD.setCellValue(record.getR83_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}

					
					
					// row85
					row = sheet.getRow(84);

					

					// Column 3 - month
					cellC = row.createCell(2);
					if (record.getR85_month() != null) {
					    cellC.setCellValue(record.getR85_month().doubleValue());
					    cellC.setCellStyle(numberStyle);
					} else {
					    cellC.setCellValue("");
					    cellC.setCellStyle(textStyle);
					}

					// Column 4 - ytd
					cellD = row.createCell(3);
					if (record.getR85_ytd() != null) {
					    cellD.setCellValue(record.getR85_ytd().doubleValue());
					    cellD.setCellStyle(numberStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
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

	public byte[] getM_SCI_EDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for M_SCI_E ARCHIVAL Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {

			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("M_SCI_EDetail");

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
			List<M_SCI_E_Archival_Detail_Entity> reportData = brrs_m_sci_e_Archival_detail_repo.getdatabydateList(parsedToDate,
					version);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_SCI_E_Archival_Detail_Entity item : reportData) {
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
				logger.info("No data found for M_SCI_E — only header will be written.");
			}

// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generatingM_SCI_EExcel", e);
			return new byte[0];
		}
	}


}