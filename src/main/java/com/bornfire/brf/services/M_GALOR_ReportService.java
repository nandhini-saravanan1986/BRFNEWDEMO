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
import org.apache.poi.ss.usermodel.VerticalAlignment;
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

import com.bornfire.brf.entities.M_GALOR_Detail_Entity;
import com.bornfire.brf.entities.M_GALOR_Summary_Entity2;
import com.bornfire.brf.entities.M_GALOR_Archival_Detail_Repo;
import com.bornfire.brf.entities.M_GALOR_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_GALOR_Archival_Summary_Entity1;
import com.bornfire.brf.entities.M_GALOR_Archival_Summary_Entity2;
import com.bornfire.brf.entities.M_GALOR_Archival_Summary_Repo2;
import com.bornfire.brf.entities.M_GALOR_Archival_Summary_Repo1;
import com.bornfire.brf.entities.M_GALOR_Summary_Entity1;

import com.bornfire.brf.entities.M_GALOR_Detail_Repo;
import com.bornfire.brf.entities.M_GALOR_Summary2_Repo;
import com.bornfire.brf.entities.M_GALOR_Summary1_Repo;
@Service
@Component
public class M_GALOR_ReportService {
	private static final Logger logger = LoggerFactory.getLogger(M_GALOR_ReportService.class);


	@Autowired
	private Environment env;
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	M_GALOR_Summary1_Repo M_GALOR_Summary1_Repo;
	@Autowired
	M_GALOR_Summary2_Repo M_GALOR_Summary2_Repo;
	@Autowired
	M_GALOR_Detail_Repo M_GALOR_Detail_Repo;
	@Autowired
	M_GALOR_Archival_Summary_Repo2 M_GALOR_Archival_Summary_Repo2;
	@Autowired
	M_GALOR_Archival_Summary_Repo1 M_GALOR_Archival_Summary_Repo1;
	@Autowired
	M_GALOR_Archival_Detail_Repo M_GALOR_Archival_Detail_Repo;
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_GALORView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<M_GALOR_Archival_Summary_Entity1> T1Master = new ArrayList<M_GALOR_Archival_Summary_Entity1>();
			List<M_GALOR_Archival_Summary_Entity2> T1Master1 = new ArrayList<M_GALOR_Archival_Summary_Entity2>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_GALOR_Archival_Summary_Repo1.getdatabydateListarchival(dateformat.parse(todate), version);
				T1Master1 = M_GALOR_Archival_Summary_Repo2.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
		} else {
			List<M_GALOR_Summary_Entity1> T1Master = new ArrayList<M_GALOR_Summary_Entity1>();
			List<M_GALOR_Summary_Entity2> T1Master1 = new ArrayList<M_GALOR_Summary_Entity2>();
			
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_GALOR_Summary1_Repo.getdatabydateList(dateformat.parse(todate));
				T1Master1 = M_GALOR_Summary2_Repo.getdatabydateList(dateformat.parse(todate));
				 System.out.println("count "+T1Master1.size());	
				 System.out.println("count222222222222222222222 "+T1Master.size());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_GALOR");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	public List<Object> getM_GALORArchival() {
		List<Object> M_GALORArchivallist = new ArrayList<>();
		List<Object> M_GALORArchivallist1 = new ArrayList<>();
		try {
			M_GALORArchivallist = M_GALOR_Archival_Summary_Repo1.getM_GALORarchival();
			M_GALORArchivallist1 = M_GALOR_Archival_Summary_Repo2.getM_GALORarchival();
			System.out.println("countser" + M_GALORArchivallist.size());
			System.out.println("countser" + M_GALORArchivallist1.size());
		} catch (Exception e) {
			// Log the exception
			System.err.println("Error fetching M_GALOR Archival data: " + e.getMessage());
			e.printStackTrace();
		}
		return M_GALORArchivallist;
	}
	public byte[] getExcelM_GALORARCHIVAL(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
	
		List<M_GALOR_Archival_Summary_Entity1> dataList = M_GALOR_Archival_Summary_Repo1
				.getdatabydateListarchival(dateformat.parse(todate), version);
		List<M_GALOR_Archival_Summary_Entity2> dataList1 = M_GALOR_Archival_Summary_Repo2
				.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for M_GALOR report. Returning empty result.");
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
			CellStyle percentStyle = workbook.createCellStyle();
			percentStyle.cloneStyleFrom(numberStyle);
			percentStyle.setDataFormat(workbook.createDataFormat().getFormat("0.00%"));

			percentStyle.setAlignment(HorizontalAlignment.RIGHT);
			int startRow = 9;
			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {

					M_GALOR_Archival_Summary_Entity1 record = dataList.get(i);
					M_GALOR_Archival_Summary_Entity2 record2 = dataList1.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}

					//row9
					// Column b 1
					Cell cell1 = row.getCell(1);
					if (record.getR9_botswana() != null) {
						cell1.setCellValue(record.getR9_botswana().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					cell1 = row.getCell(2);
					if (record.getR9_south_africa() != null) {
						cell1.setCellValue(record.getR9_south_africa().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					cell1 = row.getCell(3);
					if (record.getR9_sadc() != null) {
						cell1.setCellValue(record.getR9_sadc().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					cell1 = row.getCell(4);
					if (record.getR9_usa() != null) {
						cell1.setCellValue(record.getR9_usa().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					cell1 = row.getCell(5);
					if (record.getR9_uk() != null) {
						cell1.setCellValue(record.getR9_uk().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}
					cell1 = row.getCell(6);
					if (record.getR9_europe() != null) {
						cell1.setCellValue(record.getR9_europe().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR9_india() != null) {
						cell1.setCellValue(record.getR9_india().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR9_sydney() != null) {
						cell1.setCellValue(record.getR9_sydney().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR9_uganda() != null) {
						cell1.setCellValue(record.getR9_uganda().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR9_c10() != null) {
						cell1.setCellValue(record.getR9_c10().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR9_c11() != null) {
						cell1.setCellValue(record.getR9_c11().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}			

					cell1 = row.getCell(12);
					if (record.getR9_c12() != null) {
						cell1.setCellValue(record.getR9_c12().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}			
					cell1 = row.getCell(13);
					if (record.getR9_c13() != null) {
						cell1.setCellValue(record.getR9_c13().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}		
					cell1 = row.getCell(14);
					if (record.getR9_c14() != null) {
						cell1.setCellValue(record.getR9_c14().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}		
					cell1 = row.getCell(15);
					if (record.getR9_c15() != null) {
						cell1.setCellValue(record.getR9_c15().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}					
					cell1 = row.getCell(16);
					if (record.getR9_c16() != null) {
						cell1.setCellValue(record.getR9_c16().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}									
					cell1 = row.getCell(17);
					if (record.getR9_total() != null) {
						cell1.setCellValue(record.getR9_total().doubleValue());
						
					} else {
						cell1.setCellValue("");
						cell1.setCellStyle(textStyle);
					}				
					row = sheet.getRow(10);
					//row10
					// Column b 1
					cell1 = row.getCell(1);
					if (record.getR10_botswana() != null) {
					    cell1.setCellValue(record.getR10_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR10_south_africa() != null) {
					    cell1.setCellValue(record.getR10_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR10_sadc() != null) {
					    cell1.setCellValue(record.getR10_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR10_usa() != null) {
					    cell1.setCellValue(record.getR10_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR10_uk() != null) {
					    cell1.setCellValue(record.getR10_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR10_europe() != null) {
					    cell1.setCellValue(record.getR10_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR10_india() != null) {
					    cell1.setCellValue(record.getR10_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR10_sydney() != null) {
					    cell1.setCellValue(record.getR10_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR10_uganda() != null) {
					    cell1.setCellValue(record.getR10_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR10_c10() != null) {
					    cell1.setCellValue(record.getR10_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR10_c11() != null) {
					    cell1.setCellValue(record.getR10_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR10_c12() != null) {
					    cell1.setCellValue(record.getR10_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR10_c13() != null) {
					    cell1.setCellValue(record.getR10_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR10_c14() != null) {
					    cell1.setCellValue(record.getR10_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR10_c15() != null) {
					    cell1.setCellValue(record.getR10_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR10_c16() != null) {
					    cell1.setCellValue(record.getR10_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR10_total() != null) {
					    cell1.setCellValue(record.getR10_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
					//row11
					// Column b 1
					row = sheet.getRow(11);
					cell1 = row.getCell(1);
					if (record.getR11_botswana() != null) {
					    cell1.setCellValue(record.getR11_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR11_south_africa() != null) {
					    cell1.setCellValue(record.getR11_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR11_sadc() != null) {
					    cell1.setCellValue(record.getR11_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR11_usa() != null) {
					    cell1.setCellValue(record.getR11_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR11_uk() != null) {
					    cell1.setCellValue(record.getR11_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR11_europe() != null) {
					    cell1.setCellValue(record.getR11_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR11_india() != null) {
					    cell1.setCellValue(record.getR11_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR11_sydney() != null) {
					    cell1.setCellValue(record.getR11_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR11_uganda() != null) {
					    cell1.setCellValue(record.getR11_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR11_c10() != null) {
					    cell1.setCellValue(record.getR11_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR11_c11() != null) {
					    cell1.setCellValue(record.getR11_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR11_c12() != null) {
					    cell1.setCellValue(record.getR11_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR11_c13() != null) {
					    cell1.setCellValue(record.getR11_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR11_c14() != null) {
					    cell1.setCellValue(record.getR11_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR11_c15() != null) {
					    cell1.setCellValue(record.getR11_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR11_c16() != null) {
					    cell1.setCellValue(record.getR11_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR11_total() != null) {
					    cell1.setCellValue(record.getR11_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW12
					row = sheet.getRow(12);
					cell1 = row.getCell(1);
					if (record.getR12_botswana() != null) {
					    cell1.setCellValue(record.getR12_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR12_south_africa() != null) {
					    cell1.setCellValue(record.getR12_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR12_sadc() != null) {
					    cell1.setCellValue(record.getR12_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR12_usa() != null) {
					    cell1.setCellValue(record.getR12_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR12_uk() != null) {
					    cell1.setCellValue(record.getR12_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR12_europe() != null) {
					    cell1.setCellValue(record.getR12_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR12_india() != null) {
					    cell1.setCellValue(record.getR12_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR12_sydney() != null) {
					    cell1.setCellValue(record.getR12_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR12_uganda() != null) {
					    cell1.setCellValue(record.getR12_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR12_c10() != null) {
					    cell1.setCellValue(record.getR12_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR12_c11() != null) {
					    cell1.setCellValue(record.getR12_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR12_c12() != null) {
					    cell1.setCellValue(record.getR12_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR12_c13() != null) {
					    cell1.setCellValue(record.getR12_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR12_c14() != null) {
					    cell1.setCellValue(record.getR12_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR12_c15() != null) {
					    cell1.setCellValue(record.getR12_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR12_c16() != null) {
					    cell1.setCellValue(record.getR12_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR12_total() != null) {
					    cell1.setCellValue(record.getR12_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW13
					row = sheet.getRow(13);
					cell1 = row.getCell(1);
					if (record.getR13_botswana() != null) {
					    cell1.setCellValue(record.getR13_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR13_south_africa() != null) {
					    cell1.setCellValue(record.getR13_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR13_sadc() != null) {
					    cell1.setCellValue(record.getR13_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR13_usa() != null) {
					    cell1.setCellValue(record.getR13_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR13_uk() != null) {
					    cell1.setCellValue(record.getR13_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR13_europe() != null) {
					    cell1.setCellValue(record.getR13_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR13_india() != null) {
					    cell1.setCellValue(record.getR13_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR13_sydney() != null) {
					    cell1.setCellValue(record.getR13_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR13_uganda() != null) {
					    cell1.setCellValue(record.getR13_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR13_c10() != null) {
					    cell1.setCellValue(record.getR13_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR13_c11() != null) {
					    cell1.setCellValue(record.getR13_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR13_c12() != null) {
					    cell1.setCellValue(record.getR13_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR13_c13() != null) {
					    cell1.setCellValue(record.getR13_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR13_c14() != null) {
					    cell1.setCellValue(record.getR13_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR13_c15() != null) {
					    cell1.setCellValue(record.getR13_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR13_c16() != null) {
					    cell1.setCellValue(record.getR13_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR13_total() != null) {
					    cell1.setCellValue(record.getR13_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW14
					row = sheet.getRow(14);
					cell1 = row.getCell(1);
					if (record.getR14_botswana() != null) {
					    cell1.setCellValue(record.getR14_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR14_south_africa() != null) {
					    cell1.setCellValue(record.getR14_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR14_sadc() != null) {
					    cell1.setCellValue(record.getR14_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR14_usa() != null) {
					    cell1.setCellValue(record.getR14_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR14_uk() != null) {
					    cell1.setCellValue(record.getR14_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR14_europe() != null) {
					    cell1.setCellValue(record.getR14_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR14_india() != null) {
					    cell1.setCellValue(record.getR14_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR14_sydney() != null) {
					    cell1.setCellValue(record.getR14_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR14_uganda() != null) {
					    cell1.setCellValue(record.getR14_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR14_c10() != null) {
					    cell1.setCellValue(record.getR14_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR14_c11() != null) {
					    cell1.setCellValue(record.getR14_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR14_c12() != null) {
					    cell1.setCellValue(record.getR14_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR14_c13() != null) {
					    cell1.setCellValue(record.getR14_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR14_c14() != null) {
					    cell1.setCellValue(record.getR14_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR14_c15() != null) {
					    cell1.setCellValue(record.getR14_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR14_c16() != null) {
					    cell1.setCellValue(record.getR14_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR14_total() != null) {
					    cell1.setCellValue(record.getR14_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW15
					row = sheet.getRow(15);
					cell1 = row.getCell(1);
					if (record.getR15_botswana() != null) {
					    cell1.setCellValue(record.getR15_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR15_south_africa() != null) {
					    cell1.setCellValue(record.getR15_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR15_sadc() != null) {
					    cell1.setCellValue(record.getR15_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR15_usa() != null) {
					    cell1.setCellValue(record.getR15_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR15_uk() != null) {
					    cell1.setCellValue(record.getR15_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR15_europe() != null) {
					    cell1.setCellValue(record.getR15_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR15_india() != null) {
					    cell1.setCellValue(record.getR15_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR15_sydney() != null) {
					    cell1.setCellValue(record.getR15_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR15_uganda() != null) {
					    cell1.setCellValue(record.getR15_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR15_c10() != null) {
					    cell1.setCellValue(record.getR15_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR15_c11() != null) {
					    cell1.setCellValue(record.getR15_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR15_c12() != null) {
					    cell1.setCellValue(record.getR15_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR15_c13() != null) {
					    cell1.setCellValue(record.getR15_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR15_c14() != null) {
					    cell1.setCellValue(record.getR15_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR15_c15() != null) {
					    cell1.setCellValue(record.getR15_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR15_c16() != null) {
					    cell1.setCellValue(record.getR15_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR15_total() != null) {
					    cell1.setCellValue(record.getR15_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW16
					row = sheet.getRow(16);
					cell1 = row.getCell(1);
					if (record.getR16_botswana() != null) {
					    cell1.setCellValue(record.getR16_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR16_south_africa() != null) {
					    cell1.setCellValue(record.getR16_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR16_sadc() != null) {
					    cell1.setCellValue(record.getR16_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR16_usa() != null) {
					    cell1.setCellValue(record.getR16_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR16_uk() != null) {
					    cell1.setCellValue(record.getR16_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR16_europe() != null) {
					    cell1.setCellValue(record.getR16_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR16_india() != null) {
					    cell1.setCellValue(record.getR16_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR16_sydney() != null) {
					    cell1.setCellValue(record.getR16_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR16_uganda() != null) {
					    cell1.setCellValue(record.getR16_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR16_c10() != null) {
					    cell1.setCellValue(record.getR16_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR16_c11() != null) {
					    cell1.setCellValue(record.getR16_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR16_c12() != null) {
					    cell1.setCellValue(record.getR16_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR16_c13() != null) {
					    cell1.setCellValue(record.getR16_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR16_c14() != null) {
					    cell1.setCellValue(record.getR16_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR16_c15() != null) {
					    cell1.setCellValue(record.getR16_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR16_c16() != null) {
					    cell1.setCellValue(record.getR16_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR16_total() != null) {
					    cell1.setCellValue(record.getR16_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//17
					row = sheet.getRow(17);
					cell1 = row.getCell(1);
					if (record.getR17_botswana() != null) {
					    cell1.setCellValue(record.getR17_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR17_south_africa() != null) {
					    cell1.setCellValue(record.getR17_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR17_sadc() != null) {
					    cell1.setCellValue(record.getR17_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR17_usa() != null) {
					    cell1.setCellValue(record.getR17_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR17_uk() != null) {
					    cell1.setCellValue(record.getR17_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR17_europe() != null) {
					    cell1.setCellValue(record.getR17_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR17_india() != null) {
					    cell1.setCellValue(record.getR17_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR17_sydney() != null) {
					    cell1.setCellValue(record.getR17_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR17_uganda() != null) {
					    cell1.setCellValue(record.getR17_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR17_c10() != null) {
					    cell1.setCellValue(record.getR17_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR17_c11() != null) {
					    cell1.setCellValue(record.getR17_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR17_c12() != null) {
					    cell1.setCellValue(record.getR17_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR17_c13() != null) {
					    cell1.setCellValue(record.getR17_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR17_c14() != null) {
					    cell1.setCellValue(record.getR17_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR17_c15() != null) {
					    cell1.setCellValue(record.getR17_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR17_c16() != null) {
					    cell1.setCellValue(record.getR17_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR17_total() != null) {
					    cell1.setCellValue(record.getR17_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//18
					row = sheet.getRow(18);
					cell1 = row.getCell(1);
					if (record.getR18_botswana() != null) {
					    cell1.setCellValue(record.getR18_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR18_south_africa() != null) {
					    cell1.setCellValue(record.getR18_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR18_sadc() != null) {
					    cell1.setCellValue(record.getR18_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR18_usa() != null) {
					    cell1.setCellValue(record.getR18_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR18_uk() != null) {
					    cell1.setCellValue(record.getR18_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR18_europe() != null) {
					    cell1.setCellValue(record.getR18_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR18_india() != null) {
					    cell1.setCellValue(record.getR18_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR18_sydney() != null) {
					    cell1.setCellValue(record.getR18_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR18_uganda() != null) {
					    cell1.setCellValue(record.getR18_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR18_c10() != null) {
					    cell1.setCellValue(record.getR18_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR18_c11() != null) {
					    cell1.setCellValue(record.getR18_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR18_c12() != null) {
					    cell1.setCellValue(record.getR18_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR18_c13() != null) {
					    cell1.setCellValue(record.getR18_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR18_c14() != null) {
					    cell1.setCellValue(record.getR18_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR18_c15() != null) {
					    cell1.setCellValue(record.getR18_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR18_c16() != null) {
					    cell1.setCellValue(record.getR18_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR18_total() != null) {
					    cell1.setCellValue(record.getR18_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW19
					row = sheet.getRow(19);
					cell1 = row.getCell(1);
					if (record.getR19_botswana() != null) {
					    cell1.setCellValue(record.getR19_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR19_south_africa() != null) {
					    cell1.setCellValue(record.getR19_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR19_sadc() != null) {
					    cell1.setCellValue(record.getR19_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR19_usa() != null) {
					    cell1.setCellValue(record.getR19_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR19_uk() != null) {
					    cell1.setCellValue(record.getR19_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR19_europe() != null) {
					    cell1.setCellValue(record.getR19_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR19_india() != null) {
					    cell1.setCellValue(record.getR19_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR19_sydney() != null) {
					    cell1.setCellValue(record.getR19_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR19_uganda() != null) {
					    cell1.setCellValue(record.getR19_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR19_c10() != null) {
					    cell1.setCellValue(record.getR19_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR19_c11() != null) {
					    cell1.setCellValue(record.getR19_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR19_c12() != null) {
					    cell1.setCellValue(record.getR19_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR19_c13() != null) {
					    cell1.setCellValue(record.getR19_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR19_c14() != null) {
					    cell1.setCellValue(record.getR19_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR19_c15() != null) {
					    cell1.setCellValue(record.getR19_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR19_c16() != null) {
					    cell1.setCellValue(record.getR19_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR19_total() != null) {
					    cell1.setCellValue(record.getR19_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW20
					row = sheet.getRow(20);
					cell1 = row.getCell(1);
					if (record.getR20_botswana() != null) {
					    cell1.setCellValue(record.getR20_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR20_south_africa() != null) {
					    cell1.setCellValue(record.getR20_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR20_sadc() != null) {
					    cell1.setCellValue(record.getR20_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR20_usa() != null) {
					    cell1.setCellValue(record.getR20_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR20_uk() != null) {
					    cell1.setCellValue(record.getR20_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR20_europe() != null) {
					    cell1.setCellValue(record.getR20_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR20_india() != null) {
					    cell1.setCellValue(record.getR20_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR20_sydney() != null) {
					    cell1.setCellValue(record.getR20_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR20_uganda() != null) {
					    cell1.setCellValue(record.getR20_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR20_c10() != null) {
					    cell1.setCellValue(record.getR20_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR20_c11() != null) {
					    cell1.setCellValue(record.getR20_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR20_c12() != null) {
					    cell1.setCellValue(record.getR20_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR20_c13() != null) {
					    cell1.setCellValue(record.getR20_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR20_c14() != null) {
					    cell1.setCellValue(record.getR20_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR20_c15() != null) {
					    cell1.setCellValue(record.getR20_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR20_c16() != null) {
					    cell1.setCellValue(record.getR20_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR20_total() != null) {
					    cell1.setCellValue(record.getR20_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW21
					row = sheet.getRow(21);
					cell1 = row.getCell(1);
					if (record.getR21_botswana() != null) {
					    cell1.setCellValue(record.getR21_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR21_south_africa() != null) {
					    cell1.setCellValue(record.getR21_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR21_sadc() != null) {
					    cell1.setCellValue(record.getR21_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR21_usa() != null) {
					    cell1.setCellValue(record.getR21_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR21_uk() != null) {
					    cell1.setCellValue(record.getR21_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR21_europe() != null) {
					    cell1.setCellValue(record.getR21_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR21_india() != null) {
					    cell1.setCellValue(record.getR21_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR21_sydney() != null) {
					    cell1.setCellValue(record.getR21_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR21_uganda() != null) {
					    cell1.setCellValue(record.getR21_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR21_c10() != null) {
					    cell1.setCellValue(record.getR21_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR21_c11() != null) {
					    cell1.setCellValue(record.getR21_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR21_c12() != null) {
					    cell1.setCellValue(record.getR21_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR21_c13() != null) {
					    cell1.setCellValue(record.getR21_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR21_c14() != null) {
					    cell1.setCellValue(record.getR21_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR21_c15() != null) {
					    cell1.setCellValue(record.getR21_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR21_c16() != null) {
					    cell1.setCellValue(record.getR21_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR21_total() != null) {
					    cell1.setCellValue(record.getR21_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW22
					row = sheet.getRow(22);
					cell1 = row.getCell(1);
					if (record.getR22_botswana() != null) {
					    cell1.setCellValue(record.getR22_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR22_south_africa() != null) {
					    cell1.setCellValue(record.getR22_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR22_sadc() != null) {
					    cell1.setCellValue(record.getR22_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR22_usa() != null) {
					    cell1.setCellValue(record.getR22_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR22_uk() != null) {
					    cell1.setCellValue(record.getR22_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR22_europe() != null) {
					    cell1.setCellValue(record.getR22_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR22_india() != null) {
					    cell1.setCellValue(record.getR22_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR22_sydney() != null) {
					    cell1.setCellValue(record.getR22_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR22_uganda() != null) {
					    cell1.setCellValue(record.getR22_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR22_c10() != null) {
					    cell1.setCellValue(record.getR22_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR22_c11() != null) {
					    cell1.setCellValue(record.getR22_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR22_c12() != null) {
					    cell1.setCellValue(record.getR22_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR22_c13() != null) {
					    cell1.setCellValue(record.getR22_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR22_c14() != null) {
					    cell1.setCellValue(record.getR22_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR22_c15() != null) {
					    cell1.setCellValue(record.getR22_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR22_c16() != null) {
					    cell1.setCellValue(record.getR22_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR22_total() != null) {
					    cell1.setCellValue(record.getR22_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW23
					row = sheet.getRow(23);
					cell1 = row.getCell(1);
					if (record.getR23_botswana() != null) {
					    cell1.setCellValue(record.getR23_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR23_south_africa() != null) {
					    cell1.setCellValue(record.getR23_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR23_sadc() != null) {
					    cell1.setCellValue(record.getR23_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR23_usa() != null) {
					    cell1.setCellValue(record.getR23_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR23_uk() != null) {
					    cell1.setCellValue(record.getR23_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR23_europe() != null) {
					    cell1.setCellValue(record.getR23_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR23_india() != null) {
					    cell1.setCellValue(record.getR23_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR23_sydney() != null) {
					    cell1.setCellValue(record.getR23_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR23_uganda() != null) {
					    cell1.setCellValue(record.getR23_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR23_c10() != null) {
					    cell1.setCellValue(record.getR23_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR23_c11() != null) {
					    cell1.setCellValue(record.getR23_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR23_c12() != null) {
					    cell1.setCellValue(record.getR23_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR23_c13() != null) {
					    cell1.setCellValue(record.getR23_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR23_c14() != null) {
					    cell1.setCellValue(record.getR23_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR23_c15() != null) {
					    cell1.setCellValue(record.getR23_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR23_c16() != null) {
					    cell1.setCellValue(record.getR23_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR23_total() != null) {
					    cell1.setCellValue(record.getR23_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW24
					row = sheet.getRow(24);
					cell1 = row.getCell(1);
					if (record.getR24_botswana() != null) {
					    cell1.setCellValue(record.getR24_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR24_south_africa() != null) {
					    cell1.setCellValue(record.getR24_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR24_sadc() != null) {
					    cell1.setCellValue(record.getR24_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR24_usa() != null) {
					    cell1.setCellValue(record.getR24_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR24_uk() != null) {
					    cell1.setCellValue(record.getR24_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR24_europe() != null) {
					    cell1.setCellValue(record.getR24_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR24_india() != null) {
					    cell1.setCellValue(record.getR24_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR24_sydney() != null) {
					    cell1.setCellValue(record.getR24_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR24_uganda() != null) {
					    cell1.setCellValue(record.getR24_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR24_c10() != null) {
					    cell1.setCellValue(record.getR24_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR24_c11() != null) {
					    cell1.setCellValue(record.getR24_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR24_c12() != null) {
					    cell1.setCellValue(record.getR24_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR24_c13() != null) {
					    cell1.setCellValue(record.getR24_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR24_c14() != null) {
					    cell1.setCellValue(record.getR24_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR24_c15() != null) {
					    cell1.setCellValue(record.getR24_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR24_c16() != null) {
					    cell1.setCellValue(record.getR24_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR24_total() != null) {
					    cell1.setCellValue(record.getR24_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW25
					row = sheet.getRow(25);
					cell1 = row.getCell(1);
					if (record.getR25_botswana() != null) {
					    cell1.setCellValue(record.getR25_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR25_south_africa() != null) {
					    cell1.setCellValue(record.getR25_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR25_sadc() != null) {
					    cell1.setCellValue(record.getR25_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR25_usa() != null) {
					    cell1.setCellValue(record.getR25_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR25_uk() != null) {
					    cell1.setCellValue(record.getR25_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR25_europe() != null) {
					    cell1.setCellValue(record.getR25_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR25_india() != null) {
					    cell1.setCellValue(record.getR25_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR25_sydney() != null) {
					    cell1.setCellValue(record.getR25_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR25_uganda() != null) {
					    cell1.setCellValue(record.getR25_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR25_c10() != null) {
					    cell1.setCellValue(record.getR25_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR25_c11() != null) {
					    cell1.setCellValue(record.getR25_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR25_c12() != null) {
					    cell1.setCellValue(record.getR25_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR25_c13() != null) {
					    cell1.setCellValue(record.getR25_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR25_c14() != null) {
					    cell1.setCellValue(record.getR25_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR25_c15() != null) {
					    cell1.setCellValue(record.getR25_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR25_c16() != null) {
					    cell1.setCellValue(record.getR25_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR25_total() != null) {
					    cell1.setCellValue(record.getR25_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW26
					row = sheet.getRow(26);
					cell1 = row.getCell(1);
					if (record.getR26_botswana() != null) {
					    cell1.setCellValue(record.getR26_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR26_south_africa() != null) {
					    cell1.setCellValue(record.getR26_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR26_sadc() != null) {
					    cell1.setCellValue(record.getR26_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR26_usa() != null) {
					    cell1.setCellValue(record.getR26_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR26_uk() != null) {
					    cell1.setCellValue(record.getR26_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR26_europe() != null) {
					    cell1.setCellValue(record.getR26_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR26_india() != null) {
					    cell1.setCellValue(record.getR26_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR26_sydney() != null) {
					    cell1.setCellValue(record.getR26_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR26_uganda() != null) {
					    cell1.setCellValue(record.getR26_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR26_c10() != null) {
					    cell1.setCellValue(record.getR26_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR26_c11() != null) {
					    cell1.setCellValue(record.getR26_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR26_c12() != null) {
					    cell1.setCellValue(record.getR26_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR26_c13() != null) {
					    cell1.setCellValue(record.getR26_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR26_c14() != null) {
					    cell1.setCellValue(record.getR26_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR26_c15() != null) {
					    cell1.setCellValue(record.getR26_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR26_c16() != null) {
					    cell1.setCellValue(record.getR26_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR26_total() != null) {
					    cell1.setCellValue(record.getR26_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW27
					row = sheet.getRow(27);
					cell1 = row.getCell(1);
					if (record.getR27_botswana() != null) {
					    cell1.setCellValue(record.getR27_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR27_south_africa() != null) {
					    cell1.setCellValue(record.getR27_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR27_sadc() != null) {
					    cell1.setCellValue(record.getR27_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR27_usa() != null) {
					    cell1.setCellValue(record.getR27_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR27_uk() != null) {
					    cell1.setCellValue(record.getR27_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR27_europe() != null) {
					    cell1.setCellValue(record.getR27_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR27_india() != null) {
					    cell1.setCellValue(record.getR27_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR27_sydney() != null) {
					    cell1.setCellValue(record.getR27_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR27_uganda() != null) {
					    cell1.setCellValue(record.getR27_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR27_c10() != null) {
					    cell1.setCellValue(record.getR27_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR27_c11() != null) {
					    cell1.setCellValue(record.getR27_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR27_c12() != null) {
					    cell1.setCellValue(record.getR27_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR27_c13() != null) {
					    cell1.setCellValue(record.getR27_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR27_c14() != null) {
					    cell1.setCellValue(record.getR27_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR27_c15() != null) {
					    cell1.setCellValue(record.getR27_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR27_c16() != null) {
					    cell1.setCellValue(record.getR27_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR27_total() != null) {
					    cell1.setCellValue(record.getR27_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW28
					row = sheet.getRow(28);
					cell1 = row.getCell(1);
					if (record.getR28_botswana() != null) {
					    cell1.setCellValue(record.getR28_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR28_south_africa() != null) {
					    cell1.setCellValue(record.getR28_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR28_sadc() != null) {
					    cell1.setCellValue(record.getR28_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR28_usa() != null) {
					    cell1.setCellValue(record.getR28_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR28_uk() != null) {
					    cell1.setCellValue(record.getR28_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR28_europe() != null) {
					    cell1.setCellValue(record.getR28_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR28_india() != null) {
					    cell1.setCellValue(record.getR28_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR28_sydney() != null) {
					    cell1.setCellValue(record.getR28_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR28_uganda() != null) {
					    cell1.setCellValue(record.getR28_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR28_c10() != null) {
					    cell1.setCellValue(record.getR28_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR28_c11() != null) {
					    cell1.setCellValue(record.getR28_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR28_c12() != null) {
					    cell1.setCellValue(record.getR28_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR28_c13() != null) {
					    cell1.setCellValue(record.getR28_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR28_c14() != null) {
					    cell1.setCellValue(record.getR28_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR28_c15() != null) {
					    cell1.setCellValue(record.getR28_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR28_c16() != null) {
					    cell1.setCellValue(record.getR28_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR28_total() != null) {
					    cell1.setCellValue(record.getR28_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW29
					row = sheet.getRow(29);
					cell1 = row.getCell(1);
					if (record.getR29_botswana() != null) {
					    cell1.setCellValue(record.getR29_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR29_south_africa() != null) {
					    cell1.setCellValue(record.getR29_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR29_sadc() != null) {
					    cell1.setCellValue(record.getR29_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR29_usa() != null) {
					    cell1.setCellValue(record.getR29_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR29_uk() != null) {
					    cell1.setCellValue(record.getR29_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR29_europe() != null) {
					    cell1.setCellValue(record.getR29_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR29_india() != null) {
					    cell1.setCellValue(record.getR29_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR29_sydney() != null) {
					    cell1.setCellValue(record.getR29_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR29_uganda() != null) {
					    cell1.setCellValue(record.getR29_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR29_c10() != null) {
					    cell1.setCellValue(record.getR29_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR29_c11() != null) {
					    cell1.setCellValue(record.getR29_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR29_c12() != null) {
					    cell1.setCellValue(record.getR29_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR29_c13() != null) {
					    cell1.setCellValue(record.getR29_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR29_c14() != null) {
					    cell1.setCellValue(record.getR29_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR29_c15() != null) {
					    cell1.setCellValue(record.getR29_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR29_c16() != null) {
					    cell1.setCellValue(record.getR29_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR29_total() != null) {
					    cell1.setCellValue(record.getR29_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW30
					row = sheet.getRow(30);
					cell1 = row.getCell(1);
					if (record.getR30_botswana() != null) {
					    cell1.setCellValue(record.getR30_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR30_south_africa() != null) {
					    cell1.setCellValue(record.getR30_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR30_sadc() != null) {
					    cell1.setCellValue(record.getR30_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR30_usa() != null) {
					    cell1.setCellValue(record.getR30_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR30_uk() != null) {
					    cell1.setCellValue(record.getR30_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR30_europe() != null) {
					    cell1.setCellValue(record.getR30_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR30_india() != null) {
					    cell1.setCellValue(record.getR30_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR30_sydney() != null) {
					    cell1.setCellValue(record.getR30_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR30_uganda() != null) {
					    cell1.setCellValue(record.getR30_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR30_c10() != null) {
					    cell1.setCellValue(record.getR30_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR30_c11() != null) {
					    cell1.setCellValue(record.getR30_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR30_c12() != null) {
					    cell1.setCellValue(record.getR30_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR30_c13() != null) {
					    cell1.setCellValue(record.getR30_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR30_c14() != null) {
					    cell1.setCellValue(record.getR30_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR30_c15() != null) {
					    cell1.setCellValue(record.getR30_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR30_c16() != null) {
					    cell1.setCellValue(record.getR30_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR30_total() != null) {
					    cell1.setCellValue(record.getR30_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW31
					row = sheet.getRow(31);
					cell1 = row.getCell(1);
					if (record.getR31_botswana() != null) {
					    cell1.setCellValue(record.getR31_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR31_south_africa() != null) {
					    cell1.setCellValue(record.getR31_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR31_sadc() != null) {
					    cell1.setCellValue(record.getR31_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR31_usa() != null) {
					    cell1.setCellValue(record.getR31_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR31_uk() != null) {
					    cell1.setCellValue(record.getR31_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR31_europe() != null) {
					    cell1.setCellValue(record.getR31_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR31_india() != null) {
					    cell1.setCellValue(record.getR31_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR31_sydney() != null) {
					    cell1.setCellValue(record.getR31_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR31_uganda() != null) {
					    cell1.setCellValue(record.getR31_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR31_c10() != null) {
					    cell1.setCellValue(record.getR31_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR31_c11() != null) {
					    cell1.setCellValue(record.getR31_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR31_c12() != null) {
					    cell1.setCellValue(record.getR31_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR31_c13() != null) {
					    cell1.setCellValue(record.getR31_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR31_c14() != null) {
					    cell1.setCellValue(record.getR31_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR31_c15() != null) {
					    cell1.setCellValue(record.getR31_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR31_c16() != null) {
					    cell1.setCellValue(record.getR31_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR31_total() != null) {
					    cell1.setCellValue(record.getR31_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW32
					row = sheet.getRow(32);
					cell1 = row.getCell(1);
					if (record.getR32_botswana() != null) {
					    cell1.setCellValue(record.getR32_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR32_south_africa() != null) {
					    cell1.setCellValue(record.getR32_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR32_sadc() != null) {
					    cell1.setCellValue(record.getR32_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR32_usa() != null) {
					    cell1.setCellValue(record.getR32_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR32_uk() != null) {
					    cell1.setCellValue(record.getR32_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR32_europe() != null) {
					    cell1.setCellValue(record.getR32_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR32_india() != null) {
					    cell1.setCellValue(record.getR32_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR32_sydney() != null) {
					    cell1.setCellValue(record.getR32_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR32_uganda() != null) {
					    cell1.setCellValue(record.getR32_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR32_c10() != null) {
					    cell1.setCellValue(record.getR32_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR32_c11() != null) {
					    cell1.setCellValue(record.getR32_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR32_c12() != null) {
					    cell1.setCellValue(record.getR32_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR32_c13() != null) {
					    cell1.setCellValue(record.getR32_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR32_c14() != null) {
					    cell1.setCellValue(record.getR32_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR32_c15() != null) {
					    cell1.setCellValue(record.getR32_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR32_c16() != null) {
					    cell1.setCellValue(record.getR32_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR32_total() != null) {
					    cell1.setCellValue(record.getR32_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW33
					row = sheet.getRow(33);
					cell1 = row.getCell(1);
					if (record.getR33_botswana() != null) {
					    cell1.setCellValue(record.getR33_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR33_south_africa() != null) {
					    cell1.setCellValue(record.getR33_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR33_sadc() != null) {
					    cell1.setCellValue(record.getR33_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR33_usa() != null) {
					    cell1.setCellValue(record.getR33_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR33_uk() != null) {
					    cell1.setCellValue(record.getR33_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR33_europe() != null) {
					    cell1.setCellValue(record.getR33_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR33_india() != null) {
					    cell1.setCellValue(record.getR33_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR33_sydney() != null) {
					    cell1.setCellValue(record.getR33_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR33_uganda() != null) {
					    cell1.setCellValue(record.getR33_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR33_c10() != null) {
					    cell1.setCellValue(record.getR33_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR33_c11() != null) {
					    cell1.setCellValue(record.getR33_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR33_c12() != null) {
					    cell1.setCellValue(record.getR33_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR33_c13() != null) {
					    cell1.setCellValue(record.getR33_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR33_c14() != null) {
					    cell1.setCellValue(record.getR33_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR33_c15() != null) {
					    cell1.setCellValue(record.getR33_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR33_c16() != null) {
					    cell1.setCellValue(record.getR33_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR33_total() != null) {
					    cell1.setCellValue(record.getR33_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW34
					row = sheet.getRow(34);
					cell1 = row.getCell(1);
					if (record.getR34_botswana() != null) {
					    cell1.setCellValue(record.getR34_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR34_south_africa() != null) {
					    cell1.setCellValue(record.getR34_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR34_sadc() != null) {
					    cell1.setCellValue(record.getR34_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR34_usa() != null) {
					    cell1.setCellValue(record.getR34_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR34_uk() != null) {
					    cell1.setCellValue(record.getR34_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR34_europe() != null) {
					    cell1.setCellValue(record.getR34_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR34_india() != null) {
					    cell1.setCellValue(record.getR34_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR34_sydney() != null) {
					    cell1.setCellValue(record.getR34_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR34_uganda() != null) {
					    cell1.setCellValue(record.getR34_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR34_c10() != null) {
					    cell1.setCellValue(record.getR34_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR34_c11() != null) {
					    cell1.setCellValue(record.getR34_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR34_c12() != null) {
					    cell1.setCellValue(record.getR34_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR34_c13() != null) {
					    cell1.setCellValue(record.getR34_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR34_c14() != null) {
					    cell1.setCellValue(record.getR34_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR34_c15() != null) {
					    cell1.setCellValue(record.getR34_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR34_c16() != null) {
					    cell1.setCellValue(record.getR34_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR34_total() != null) {
					    cell1.setCellValue(record.getR34_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW35
					row = sheet.getRow(35);
					cell1 = row.getCell(1);
					if (record.getR35_botswana() != null) {
					    cell1.setCellValue(record.getR35_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR35_south_africa() != null) {
					    cell1.setCellValue(record.getR35_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR35_sadc() != null) {
					    cell1.setCellValue(record.getR35_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR35_usa() != null) {
					    cell1.setCellValue(record.getR35_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR35_uk() != null) {
					    cell1.setCellValue(record.getR35_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR35_europe() != null) {
					    cell1.setCellValue(record.getR35_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR35_india() != null) {
					    cell1.setCellValue(record.getR35_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR35_sydney() != null) {
					    cell1.setCellValue(record.getR35_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR35_uganda() != null) {
					    cell1.setCellValue(record.getR35_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR35_c10() != null) {
					    cell1.setCellValue(record.getR35_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR35_c11() != null) {
					    cell1.setCellValue(record.getR35_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR35_c12() != null) {
					    cell1.setCellValue(record.getR35_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR35_c13() != null) {
					    cell1.setCellValue(record.getR35_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR35_c14() != null) {
					    cell1.setCellValue(record.getR35_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR35_c15() != null) {
					    cell1.setCellValue(record.getR35_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR35_c16() != null) {
					    cell1.setCellValue(record.getR35_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR35_total() != null) {
					    cell1.setCellValue(record.getR35_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW36
					row = sheet.getRow(36);
					cell1 = row.getCell(1);
					if (record.getR36_botswana() != null) {
					    cell1.setCellValue(record.getR36_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR36_south_africa() != null) {
					    cell1.setCellValue(record.getR36_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR36_sadc() != null) {
					    cell1.setCellValue(record.getR36_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR36_usa() != null) {
					    cell1.setCellValue(record.getR36_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR36_uk() != null) {
					    cell1.setCellValue(record.getR36_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR36_europe() != null) {
					    cell1.setCellValue(record.getR36_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR36_india() != null) {
					    cell1.setCellValue(record.getR36_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR36_sydney() != null) {
					    cell1.setCellValue(record.getR36_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR36_uganda() != null) {
					    cell1.setCellValue(record.getR36_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR36_c10() != null) {
					    cell1.setCellValue(record.getR36_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR36_c11() != null) {
					    cell1.setCellValue(record.getR36_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR36_c12() != null) {
					    cell1.setCellValue(record.getR36_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR36_c13() != null) {
					    cell1.setCellValue(record.getR36_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR36_c14() != null) {
					    cell1.setCellValue(record.getR36_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR36_c15() != null) {
					    cell1.setCellValue(record.getR36_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR36_c16() != null) {
					    cell1.setCellValue(record.getR36_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR36_total() != null) {
					    cell1.setCellValue(record.getR36_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW37
					row = sheet.getRow(37);
					cell1 = row.getCell(1);
					if (record.getR37_botswana() != null) {
					    cell1.setCellValue(record.getR37_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR37_south_africa() != null) {
					    cell1.setCellValue(record.getR37_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR37_sadc() != null) {
					    cell1.setCellValue(record.getR37_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR37_usa() != null) {
					    cell1.setCellValue(record.getR37_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR37_uk() != null) {
					    cell1.setCellValue(record.getR37_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR37_europe() != null) {
					    cell1.setCellValue(record.getR37_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR37_india() != null) {
					    cell1.setCellValue(record.getR37_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR37_sydney() != null) {
					    cell1.setCellValue(record.getR37_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR37_uganda() != null) {
					    cell1.setCellValue(record.getR37_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR37_c10() != null) {
					    cell1.setCellValue(record.getR37_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR37_c11() != null) {
					    cell1.setCellValue(record.getR37_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR37_c12() != null) {
					    cell1.setCellValue(record.getR37_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR37_c13() != null) {
					    cell1.setCellValue(record.getR37_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR37_c14() != null) {
					    cell1.setCellValue(record.getR37_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR37_c15() != null) {
					    cell1.setCellValue(record.getR37_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR37_c16() != null) {
					    cell1.setCellValue(record.getR37_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR37_total() != null) {
					    cell1.setCellValue(record.getR37_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW38
					row = sheet.getRow(38);
					cell1 = row.getCell(1);
					if (record.getR38_botswana() != null) {
					    cell1.setCellValue(record.getR38_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR38_south_africa() != null) {
					    cell1.setCellValue(record.getR38_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR38_sadc() != null) {
					    cell1.setCellValue(record.getR38_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR38_usa() != null) {
					    cell1.setCellValue(record.getR38_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR38_uk() != null) {
					    cell1.setCellValue(record.getR38_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR38_europe() != null) {
					    cell1.setCellValue(record.getR38_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR38_india() != null) {
					    cell1.setCellValue(record.getR38_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR38_sydney() != null) {
					    cell1.setCellValue(record.getR38_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR38_uganda() != null) {
					    cell1.setCellValue(record.getR38_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR38_c10() != null) {
					    cell1.setCellValue(record.getR38_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR38_c11() != null) {
					    cell1.setCellValue(record.getR38_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR38_c12() != null) {
					    cell1.setCellValue(record.getR38_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR38_c13() != null) {
					    cell1.setCellValue(record.getR38_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR38_c14() != null) {
					    cell1.setCellValue(record.getR38_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR38_c15() != null) {
					    cell1.setCellValue(record.getR38_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR38_c16() != null) {
					    cell1.setCellValue(record.getR38_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR38_total() != null) {
					    cell1.setCellValue(record.getR38_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//39
					row = sheet.getRow(39);
					cell1 = row.getCell(1);
					if (record.getR39_botswana() != null) {
					    cell1.setCellValue(record.getR39_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR39_south_africa() != null) {
					    cell1.setCellValue(record.getR39_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR39_sadc() != null) {
					    cell1.setCellValue(record.getR39_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR39_usa() != null) {
					    cell1.setCellValue(record.getR39_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR39_uk() != null) {
					    cell1.setCellValue(record.getR39_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR39_europe() != null) {
					    cell1.setCellValue(record.getR39_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR39_india() != null) {
					    cell1.setCellValue(record.getR39_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR39_sydney() != null) {
					    cell1.setCellValue(record.getR39_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR39_uganda() != null) {
					    cell1.setCellValue(record.getR39_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR39_c10() != null) {
					    cell1.setCellValue(record.getR39_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR39_c11() != null) {
					    cell1.setCellValue(record.getR39_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR39_c12() != null) {
					    cell1.setCellValue(record.getR39_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR39_c13() != null) {
					    cell1.setCellValue(record.getR39_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR39_c14() != null) {
					    cell1.setCellValue(record.getR39_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR39_c15() != null) {
					    cell1.setCellValue(record.getR39_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR39_c16() != null) {
					    cell1.setCellValue(record.getR39_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR39_total() != null) {
					    cell1.setCellValue(record.getR39_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW40
					row = sheet.getRow(40);
					cell1 = row.getCell(1);
					if (record.getR40_botswana() != null) {
					    cell1.setCellValue(record.getR40_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR40_south_africa() != null) {
					    cell1.setCellValue(record.getR40_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR40_sadc() != null) {
					    cell1.setCellValue(record.getR40_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR40_usa() != null) {
					    cell1.setCellValue(record.getR40_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR40_uk() != null) {
					    cell1.setCellValue(record.getR40_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR40_europe() != null) {
					    cell1.setCellValue(record.getR40_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR40_india() != null) {
					    cell1.setCellValue(record.getR40_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR40_sydney() != null) {
					    cell1.setCellValue(record.getR40_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR40_uganda() != null) {
					    cell1.setCellValue(record.getR40_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR40_c10() != null) {
					    cell1.setCellValue(record.getR40_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR40_c11() != null) {
					    cell1.setCellValue(record.getR40_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR40_c12() != null) {
					    cell1.setCellValue(record.getR40_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR40_c13() != null) {
					    cell1.setCellValue(record.getR40_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR40_c14() != null) {
					    cell1.setCellValue(record.getR40_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR40_c15() != null) {
					    cell1.setCellValue(record.getR40_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR40_c16() != null) {
					    cell1.setCellValue(record.getR40_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR40_total() != null) {
					    cell1.setCellValue(record.getR40_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW41
					row = sheet.getRow(41);
					cell1 = row.getCell(1);
					if (record.getR41_botswana() != null) {
					    cell1.setCellValue(record.getR41_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR41_south_africa() != null) {
					    cell1.setCellValue(record.getR41_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR41_sadc() != null) {
					    cell1.setCellValue(record.getR41_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR41_usa() != null) {
					    cell1.setCellValue(record.getR41_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR41_uk() != null) {
					    cell1.setCellValue(record.getR41_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR41_europe() != null) {
					    cell1.setCellValue(record.getR41_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR41_india() != null) {
					    cell1.setCellValue(record.getR41_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR41_sydney() != null) {
					    cell1.setCellValue(record.getR41_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR41_uganda() != null) {
					    cell1.setCellValue(record.getR41_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR41_c10() != null) {
					    cell1.setCellValue(record.getR41_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR41_c11() != null) {
					    cell1.setCellValue(record.getR41_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR41_c12() != null) {
					    cell1.setCellValue(record.getR41_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR41_c13() != null) {
					    cell1.setCellValue(record.getR41_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR41_c14() != null) {
					    cell1.setCellValue(record.getR41_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR41_c15() != null) {
					    cell1.setCellValue(record.getR41_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR41_c16() != null) {
					    cell1.setCellValue(record.getR41_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR41_total() != null) {
					    cell1.setCellValue(record.getR41_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW42
					row = sheet.getRow(42);
					cell1 = row.getCell(1);
					if (record.getR42_botswana() != null) {
					    cell1.setCellValue(record.getR42_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR42_south_africa() != null) {
					    cell1.setCellValue(record.getR42_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR42_sadc() != null) {
					    cell1.setCellValue(record.getR42_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR42_usa() != null) {
					    cell1.setCellValue(record.getR42_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR42_uk() != null) {
					    cell1.setCellValue(record.getR42_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR42_europe() != null) {
					    cell1.setCellValue(record.getR42_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR42_india() != null) {
					    cell1.setCellValue(record.getR42_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR42_sydney() != null) {
					    cell1.setCellValue(record.getR42_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR42_uganda() != null) {
					    cell1.setCellValue(record.getR42_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR42_c10() != null) {
					    cell1.setCellValue(record.getR42_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR42_c11() != null) {
					    cell1.setCellValue(record.getR42_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR42_c12() != null) {
					    cell1.setCellValue(record.getR42_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR42_c13() != null) {
					    cell1.setCellValue(record.getR42_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR42_c14() != null) {
					    cell1.setCellValue(record.getR42_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR42_c15() != null) {
					    cell1.setCellValue(record.getR42_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR42_c16() != null) {
					    cell1.setCellValue(record.getR42_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR42_total() != null) {
					    cell1.setCellValue(record.getR42_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW43
					row = sheet.getRow(43);
					cell1 = row.getCell(1);
					if (record.getR43_botswana() != null) {
					    cell1.setCellValue(record.getR43_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR43_south_africa() != null) {
					    cell1.setCellValue(record.getR43_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR43_sadc() != null) {
					    cell1.setCellValue(record.getR43_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR43_usa() != null) {
					    cell1.setCellValue(record.getR43_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR43_uk() != null) {
					    cell1.setCellValue(record.getR43_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR43_europe() != null) {
					    cell1.setCellValue(record.getR43_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR43_india() != null) {
					    cell1.setCellValue(record.getR43_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR43_sydney() != null) {
					    cell1.setCellValue(record.getR43_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR43_uganda() != null) {
					    cell1.setCellValue(record.getR43_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR43_c10() != null) {
					    cell1.setCellValue(record.getR43_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR43_c11() != null) {
					    cell1.setCellValue(record.getR43_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR43_c12() != null) {
					    cell1.setCellValue(record.getR43_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR43_c13() != null) {
					    cell1.setCellValue(record.getR43_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR43_c14() != null) {
					    cell1.setCellValue(record.getR43_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR43_c15() != null) {
					    cell1.setCellValue(record.getR43_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR43_c16() != null) {
					    cell1.setCellValue(record.getR43_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR43_total() != null) {
					    cell1.setCellValue(record.getR43_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW44
					row = sheet.getRow(44);
					cell1 = row.getCell(1);
					if (record.getR44_botswana() != null) {
					    cell1.setCellValue(record.getR44_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR44_south_africa() != null) {
					    cell1.setCellValue(record.getR44_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR44_sadc() != null) {
					    cell1.setCellValue(record.getR44_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR44_usa() != null) {
					    cell1.setCellValue(record.getR44_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR44_uk() != null) {
					    cell1.setCellValue(record.getR44_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR44_europe() != null) {
					    cell1.setCellValue(record.getR44_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR44_india() != null) {
					    cell1.setCellValue(record.getR44_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR44_sydney() != null) {
					    cell1.setCellValue(record.getR44_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR44_uganda() != null) {
					    cell1.setCellValue(record.getR44_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR44_c10() != null) {
					    cell1.setCellValue(record.getR44_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR44_c11() != null) {
					    cell1.setCellValue(record.getR44_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR44_c12() != null) {
					    cell1.setCellValue(record.getR44_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR44_c13() != null) {
					    cell1.setCellValue(record.getR44_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR44_c14() != null) {
					    cell1.setCellValue(record.getR44_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR44_c15() != null) {
					    cell1.setCellValue(record.getR44_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR44_c16() != null) {
					    cell1.setCellValue(record.getR44_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR44_total() != null) {
					    cell1.setCellValue(record.getR44_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW45
					row = sheet.getRow(45);
					cell1 = row.getCell(1);
					if (record.getR45_botswana() != null) {
					    cell1.setCellValue(record.getR45_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR45_south_africa() != null) {
					    cell1.setCellValue(record.getR45_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR45_sadc() != null) {
					    cell1.setCellValue(record.getR45_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR45_usa() != null) {
					    cell1.setCellValue(record.getR45_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR45_uk() != null) {
					    cell1.setCellValue(record.getR45_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR45_europe() != null) {
					    cell1.setCellValue(record.getR45_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR45_india() != null) {
					    cell1.setCellValue(record.getR45_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR45_sydney() != null) {
					    cell1.setCellValue(record.getR45_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR45_uganda() != null) {
					    cell1.setCellValue(record.getR45_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR45_c10() != null) {
					    cell1.setCellValue(record.getR45_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR45_c11() != null) {
					    cell1.setCellValue(record.getR45_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR45_c12() != null) {
					    cell1.setCellValue(record.getR45_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR45_c13() != null) {
					    cell1.setCellValue(record.getR45_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR45_c14() != null) {
					    cell1.setCellValue(record.getR45_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR45_c15() != null) {
					    cell1.setCellValue(record.getR45_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR45_c16() != null) {
					    cell1.setCellValue(record.getR45_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR45_total() != null) {
					    cell1.setCellValue(record.getR45_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW46
					row = sheet.getRow(46);
					cell1 = row.getCell(1);
					if (record.getR46_botswana() != null) {
					    cell1.setCellValue(record.getR46_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR46_south_africa() != null) {
					    cell1.setCellValue(record.getR46_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR46_sadc() != null) {
					    cell1.setCellValue(record.getR46_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR46_usa() != null) {
					    cell1.setCellValue(record.getR46_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR46_uk() != null) {
					    cell1.setCellValue(record.getR46_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR46_europe() != null) {
					    cell1.setCellValue(record.getR46_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR46_india() != null) {
					    cell1.setCellValue(record.getR46_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR46_sydney() != null) {
					    cell1.setCellValue(record.getR46_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR46_uganda() != null) {
					    cell1.setCellValue(record.getR46_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR46_c10() != null) {
					    cell1.setCellValue(record.getR46_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR46_c11() != null) {
					    cell1.setCellValue(record.getR46_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR46_c12() != null) {
					    cell1.setCellValue(record.getR46_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR46_c13() != null) {
					    cell1.setCellValue(record.getR46_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR46_c14() != null) {
					    cell1.setCellValue(record.getR46_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR46_c15() != null) {
					    cell1.setCellValue(record.getR46_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR46_c16() != null) {
					    cell1.setCellValue(record.getR46_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR46_total() != null) {
					    cell1.setCellValue(record.getR46_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW47
					row = sheet.getRow(47);
					cell1 = row.getCell(1);
					if (record.getR47_botswana() != null) {
					    cell1.setCellValue(record.getR47_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR47_south_africa() != null) {
					    cell1.setCellValue(record.getR47_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR47_sadc() != null) {
					    cell1.setCellValue(record.getR47_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR47_usa() != null) {
					    cell1.setCellValue(record.getR47_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR47_uk() != null) {
					    cell1.setCellValue(record.getR47_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR47_europe() != null) {
					    cell1.setCellValue(record.getR47_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR47_india() != null) {
					    cell1.setCellValue(record.getR47_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR47_sydney() != null) {
					    cell1.setCellValue(record.getR47_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR47_uganda() != null) {
					    cell1.setCellValue(record.getR47_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR47_c10() != null) {
					    cell1.setCellValue(record.getR47_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR47_c11() != null) {
					    cell1.setCellValue(record.getR47_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR47_c12() != null) {
					    cell1.setCellValue(record.getR47_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR47_c13() != null) {
					    cell1.setCellValue(record.getR47_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR47_c14() != null) {
					    cell1.setCellValue(record.getR47_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR47_c15() != null) {
					    cell1.setCellValue(record.getR47_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR47_c16() != null) {
					    cell1.setCellValue(record.getR47_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR47_total() != null) {
					    cell1.setCellValue(record.getR47_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW48
					row = sheet.getRow(48);
					cell1 = row.getCell(1);
					if (record.getR48_botswana() != null) {
					    cell1.setCellValue(record.getR48_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR48_south_africa() != null) {
					    cell1.setCellValue(record.getR48_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR48_sadc() != null) {
					    cell1.setCellValue(record.getR48_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR48_usa() != null) {
					    cell1.setCellValue(record.getR48_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR48_uk() != null) {
					    cell1.setCellValue(record.getR48_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR48_europe() != null) {
					    cell1.setCellValue(record.getR48_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR48_india() != null) {
					    cell1.setCellValue(record.getR48_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR48_sydney() != null) {
					    cell1.setCellValue(record.getR48_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR48_uganda() != null) {
					    cell1.setCellValue(record.getR48_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR48_c10() != null) {
					    cell1.setCellValue(record.getR48_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR48_c11() != null) {
					    cell1.setCellValue(record.getR48_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR48_c12() != null) {
					    cell1.setCellValue(record.getR48_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR48_c13() != null) {
					    cell1.setCellValue(record.getR48_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR48_c14() != null) {
					    cell1.setCellValue(record.getR48_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR48_c15() != null) {
					    cell1.setCellValue(record.getR48_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR48_c16() != null) {
					    cell1.setCellValue(record.getR48_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR48_total() != null) {
					    cell1.setCellValue(record.getR48_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW49
					row = sheet.getRow(49);
					cell1 = row.getCell(1);
					if (record.getR49_botswana() != null) {
					    cell1.setCellValue(record.getR49_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR49_south_africa() != null) {
					    cell1.setCellValue(record.getR49_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR49_sadc() != null) {
					    cell1.setCellValue(record.getR49_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR49_usa() != null) {
					    cell1.setCellValue(record.getR49_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR49_uk() != null) {
					    cell1.setCellValue(record.getR49_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR49_europe() != null) {
					    cell1.setCellValue(record.getR49_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR49_india() != null) {
					    cell1.setCellValue(record.getR49_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR49_sydney() != null) {
					    cell1.setCellValue(record.getR49_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR49_uganda() != null) {
					    cell1.setCellValue(record.getR49_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR49_c10() != null) {
					    cell1.setCellValue(record.getR49_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR49_c11() != null) {
					    cell1.setCellValue(record.getR49_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR49_c12() != null) {
					    cell1.setCellValue(record.getR49_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR49_c13() != null) {
					    cell1.setCellValue(record.getR49_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR49_c14() != null) {
					    cell1.setCellValue(record.getR49_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR49_c15() != null) {
					    cell1.setCellValue(record.getR49_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR49_c16() != null) {
					    cell1.setCellValue(record.getR49_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR49_total() != null) {
					    cell1.setCellValue(record.getR49_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW50
					row = sheet.getRow(50);
					cell1 = row.getCell(1);
					if (record.getR50_botswana() != null) {
					    cell1.setCellValue(record.getR50_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR50_south_africa() != null) {
					    cell1.setCellValue(record.getR50_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR50_sadc() != null) {
					    cell1.setCellValue(record.getR50_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR50_usa() != null) {
					    cell1.setCellValue(record.getR50_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR50_uk() != null) {
					    cell1.setCellValue(record.getR50_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR50_europe() != null) {
					    cell1.setCellValue(record.getR50_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR50_india() != null) {
					    cell1.setCellValue(record.getR50_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR50_sydney() != null) {
					    cell1.setCellValue(record.getR50_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR50_uganda() != null) {
					    cell1.setCellValue(record.getR50_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR50_c10() != null) {
					    cell1.setCellValue(record.getR50_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR50_c11() != null) {
					    cell1.setCellValue(record.getR50_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR50_c12() != null) {
					    cell1.setCellValue(record.getR50_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR50_c13() != null) {
					    cell1.setCellValue(record.getR50_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR50_c14() != null) {
					    cell1.setCellValue(record.getR50_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR50_c15() != null) {
					    cell1.setCellValue(record.getR50_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR50_c16() != null) {
					    cell1.setCellValue(record.getR50_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR50_total() != null) {
					    cell1.setCellValue(record.getR50_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW51
					row = sheet.getRow(51);
					cell1 = row.getCell(1);
					if (record.getR51_botswana() != null) {
					    cell1.setCellValue(record.getR51_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR51_south_africa() != null) {
					    cell1.setCellValue(record.getR51_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR51_sadc() != null) {
					    cell1.setCellValue(record.getR51_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR51_usa() != null) {
					    cell1.setCellValue(record.getR51_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR51_uk() != null) {
					    cell1.setCellValue(record.getR51_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR51_europe() != null) {
					    cell1.setCellValue(record.getR51_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR51_india() != null) {
					    cell1.setCellValue(record.getR51_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR51_sydney() != null) {
					    cell1.setCellValue(record.getR51_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR51_uganda() != null) {
					    cell1.setCellValue(record.getR51_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR51_c10() != null) {
					    cell1.setCellValue(record.getR51_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR51_c11() != null) {
					    cell1.setCellValue(record.getR51_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR51_c12() != null) {
					    cell1.setCellValue(record.getR51_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR51_c13() != null) {
					    cell1.setCellValue(record.getR51_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR51_c14() != null) {
					    cell1.setCellValue(record.getR51_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR51_c15() != null) {
					    cell1.setCellValue(record.getR51_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR51_c16() != null) {
					    cell1.setCellValue(record.getR51_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR51_total() != null) {
					    cell1.setCellValue(record.getR51_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW52
					row = sheet.getRow(52);
					cell1 = row.getCell(1);
					if (record.getR52_botswana() != null) {
					    cell1.setCellValue(record.getR52_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR52_south_africa() != null) {
					    cell1.setCellValue(record.getR52_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR52_sadc() != null) {
					    cell1.setCellValue(record.getR52_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR52_usa() != null) {
					    cell1.setCellValue(record.getR52_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR52_uk() != null) {
					    cell1.setCellValue(record.getR52_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR52_europe() != null) {
					    cell1.setCellValue(record.getR52_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR52_india() != null) {
					    cell1.setCellValue(record.getR52_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR52_sydney() != null) {
					    cell1.setCellValue(record.getR52_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR52_uganda() != null) {
					    cell1.setCellValue(record.getR52_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR52_c10() != null) {
					    cell1.setCellValue(record.getR52_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR52_c11() != null) {
					    cell1.setCellValue(record.getR52_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR52_c12() != null) {
					    cell1.setCellValue(record.getR52_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR52_c13() != null) {
					    cell1.setCellValue(record.getR52_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR52_c14() != null) {
					    cell1.setCellValue(record.getR52_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR52_c15() != null) {
					    cell1.setCellValue(record.getR52_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR52_c16() != null) {
					    cell1.setCellValue(record.getR52_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR52_total() != null) {
					    cell1.setCellValue(record.getR52_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW53
					row = sheet.getRow(53);
					cell1 = row.getCell(1);
					if (record.getR53_botswana() != null) {
					    cell1.setCellValue(record.getR53_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR53_south_africa() != null) {
					    cell1.setCellValue(record.getR53_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR53_sadc() != null) {
					    cell1.setCellValue(record.getR53_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR53_usa() != null) {
					    cell1.setCellValue(record.getR53_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR53_uk() != null) {
					    cell1.setCellValue(record.getR53_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR53_europe() != null) {
					    cell1.setCellValue(record.getR53_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR53_india() != null) {
					    cell1.setCellValue(record.getR53_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR53_sydney() != null) {
					    cell1.setCellValue(record.getR53_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR53_uganda() != null) {
					    cell1.setCellValue(record.getR53_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR53_c10() != null) {
					    cell1.setCellValue(record.getR53_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR53_c11() != null) {
					    cell1.setCellValue(record.getR53_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR53_c12() != null) {
					    cell1.setCellValue(record.getR53_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR53_c13() != null) {
					    cell1.setCellValue(record.getR53_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR53_c14() != null) {
					    cell1.setCellValue(record.getR53_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR53_c15() != null) {
					    cell1.setCellValue(record.getR53_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR53_c16() != null) {
					    cell1.setCellValue(record.getR53_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR53_total() != null) {
					    cell1.setCellValue(record.getR53_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW54
					row = sheet.getRow(54);
					cell1 = row.getCell(1);
					if (record.getR54_botswana() != null) {
					    cell1.setCellValue(record.getR54_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR54_south_africa() != null) {
					    cell1.setCellValue(record.getR54_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR54_sadc() != null) {
					    cell1.setCellValue(record.getR54_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR54_usa() != null) {
					    cell1.setCellValue(record.getR54_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR54_uk() != null) {
					    cell1.setCellValue(record.getR54_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR54_europe() != null) {
					    cell1.setCellValue(record.getR54_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR54_india() != null) {
					    cell1.setCellValue(record.getR54_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR54_sydney() != null) {
					    cell1.setCellValue(record.getR54_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR54_uganda() != null) {
					    cell1.setCellValue(record.getR54_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR54_c10() != null) {
					    cell1.setCellValue(record.getR54_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR54_c11() != null) {
					    cell1.setCellValue(record.getR54_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR54_c12() != null) {
					    cell1.setCellValue(record.getR54_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR54_c13() != null) {
					    cell1.setCellValue(record.getR54_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR54_c14() != null) {
					    cell1.setCellValue(record.getR54_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR54_c15() != null) {
					    cell1.setCellValue(record.getR54_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR54_c16() != null) {
					    cell1.setCellValue(record.getR54_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR54_total() != null) {
					    cell1.setCellValue(record.getR54_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW55
					row = sheet.getRow(55);
					cell1 = row.getCell(1);
					if (record.getR55_botswana() != null) {
					    cell1.setCellValue(record.getR55_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR55_south_africa() != null) {
					    cell1.setCellValue(record.getR55_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR55_sadc() != null) {
					    cell1.setCellValue(record.getR55_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR55_usa() != null) {
					    cell1.setCellValue(record.getR55_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR55_uk() != null) {
					    cell1.setCellValue(record.getR55_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR55_europe() != null) {
					    cell1.setCellValue(record.getR55_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR55_india() != null) {
					    cell1.setCellValue(record.getR55_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR55_sydney() != null) {
					    cell1.setCellValue(record.getR55_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR55_uganda() != null) {
					    cell1.setCellValue(record.getR55_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR55_c10() != null) {
					    cell1.setCellValue(record.getR55_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR55_c11() != null) {
					    cell1.setCellValue(record.getR55_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR55_c12() != null) {
					    cell1.setCellValue(record.getR55_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR55_c13() != null) {
					    cell1.setCellValue(record.getR55_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR55_c14() != null) {
					    cell1.setCellValue(record.getR55_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR55_c15() != null) {
					    cell1.setCellValue(record.getR55_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR55_c16() != null) {
					    cell1.setCellValue(record.getR55_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR55_total() != null) {
					    cell1.setCellValue(record.getR55_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW56
					row = sheet.getRow(56);
					cell1 = row.getCell(1);
					if (record.getR56_botswana() != null) {
					    cell1.setCellValue(record.getR56_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR56_south_africa() != null) {
					    cell1.setCellValue(record.getR56_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR56_sadc() != null) {
					    cell1.setCellValue(record.getR56_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR56_usa() != null) {
					    cell1.setCellValue(record.getR56_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR56_uk() != null) {
					    cell1.setCellValue(record.getR56_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR56_europe() != null) {
					    cell1.setCellValue(record.getR56_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR56_india() != null) {
					    cell1.setCellValue(record.getR56_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR56_sydney() != null) {
					    cell1.setCellValue(record.getR56_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR56_uganda() != null) {
					    cell1.setCellValue(record.getR56_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR56_c10() != null) {
					    cell1.setCellValue(record.getR56_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR56_c11() != null) {
					    cell1.setCellValue(record.getR56_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR56_c12() != null) {
					    cell1.setCellValue(record.getR56_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR56_c13() != null) {
					    cell1.setCellValue(record.getR56_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR56_c14() != null) {
					    cell1.setCellValue(record.getR56_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR56_c15() != null) {
					    cell1.setCellValue(record.getR56_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR56_c16() != null) {
					    cell1.setCellValue(record.getR56_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR56_total() != null) {
					    cell1.setCellValue(record.getR56_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW57
					row = sheet.getRow(57);
					cell1 = row.getCell(1);
					if (record.getR57_botswana() != null) {
					    cell1.setCellValue(record.getR57_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR57_south_africa() != null) {
					    cell1.setCellValue(record.getR57_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR57_sadc() != null) {
					    cell1.setCellValue(record.getR57_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR57_usa() != null) {
					    cell1.setCellValue(record.getR57_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR57_uk() != null) {
					    cell1.setCellValue(record.getR57_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR57_europe() != null) {
					    cell1.setCellValue(record.getR57_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR57_india() != null) {
					    cell1.setCellValue(record.getR57_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR57_sydney() != null) {
					    cell1.setCellValue(record.getR57_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR57_uganda() != null) {
					    cell1.setCellValue(record.getR57_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR57_c10() != null) {
					    cell1.setCellValue(record.getR57_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR57_c11() != null) {
					    cell1.setCellValue(record.getR57_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR57_c12() != null) {
					    cell1.setCellValue(record.getR57_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR57_c13() != null) {
					    cell1.setCellValue(record.getR57_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR57_c14() != null) {
					    cell1.setCellValue(record.getR57_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR57_c15() != null) {
					    cell1.setCellValue(record.getR57_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR57_c16() != null) {
					    cell1.setCellValue(record.getR57_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR57_total() != null) {
					    cell1.setCellValue(record.getR57_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW58
					row = sheet.getRow(58);
					cell1 = row.getCell(1);
					if (record.getR58_botswana() != null) {
					    cell1.setCellValue(record.getR58_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR58_south_africa() != null) {
					    cell1.setCellValue(record.getR58_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR58_sadc() != null) {
					    cell1.setCellValue(record.getR58_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR58_usa() != null) {
					    cell1.setCellValue(record.getR58_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR58_uk() != null) {
					    cell1.setCellValue(record.getR58_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR58_europe() != null) {
					    cell1.setCellValue(record.getR58_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR58_india() != null) {
					    cell1.setCellValue(record.getR58_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR58_sydney() != null) {
					    cell1.setCellValue(record.getR58_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR58_uganda() != null) {
					    cell1.setCellValue(record.getR58_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR58_c10() != null) {
					    cell1.setCellValue(record.getR58_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR58_c11() != null) {
					    cell1.setCellValue(record.getR58_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR58_c12() != null) {
					    cell1.setCellValue(record.getR58_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR58_c13() != null) {
					    cell1.setCellValue(record.getR58_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR58_c14() != null) {
					    cell1.setCellValue(record.getR58_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR58_c15() != null) {
					    cell1.setCellValue(record.getR58_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR58_c16() != null) {
					    cell1.setCellValue(record.getR58_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR58_total() != null) {
					    cell1.setCellValue(record.getR58_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW59
					row = sheet.getRow(59);
					cell1 = row.getCell(1);
					if (record.getR59_botswana() != null) {
					    cell1.setCellValue(record.getR59_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR59_south_africa() != null) {
					    cell1.setCellValue(record.getR59_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR59_sadc() != null) {
					    cell1.setCellValue(record.getR59_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR59_usa() != null) {
					    cell1.setCellValue(record.getR59_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR59_uk() != null) {
					    cell1.setCellValue(record.getR59_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR59_europe() != null) {
					    cell1.setCellValue(record.getR59_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR59_india() != null) {
					    cell1.setCellValue(record.getR59_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR59_sydney() != null) {
					    cell1.setCellValue(record.getR59_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR59_uganda() != null) {
					    cell1.setCellValue(record.getR59_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR59_c10() != null) {
					    cell1.setCellValue(record.getR59_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR59_c11() != null) {
					    cell1.setCellValue(record.getR59_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR59_c12() != null) {
					    cell1.setCellValue(record.getR59_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR59_c13() != null) {
					    cell1.setCellValue(record.getR59_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR59_c14() != null) {
					    cell1.setCellValue(record.getR59_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR59_c15() != null) {
					    cell1.setCellValue(record.getR59_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR59_c16() != null) {
					    cell1.setCellValue(record.getR59_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR59_total() != null) {
					    cell1.setCellValue(record.getR59_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//ROW60
					row = sheet.getRow(60);
					cell1 = row.getCell(1);
					if (record.getR60_botswana() != null) {
					    cell1.setCellValue(record.getR60_botswana().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(2);
					if (record.getR60_south_africa() != null) {
					    cell1.setCellValue(record.getR60_south_africa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(3);
					if (record.getR60_sadc() != null) {
					    cell1.setCellValue(record.getR60_sadc().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(4);
					if (record.getR60_usa() != null) {
					    cell1.setCellValue(record.getR60_usa().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(5);
					if (record.getR60_uk() != null) {
					    cell1.setCellValue(record.getR60_uk().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(6);
					if (record.getR60_europe() != null) {
					    cell1.setCellValue(record.getR60_europe().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(7);
					if (record.getR60_india() != null) {
					    cell1.setCellValue(record.getR60_india().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(8);
					if (record.getR60_sydney() != null) {
					    cell1.setCellValue(record.getR60_sydney().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(9);
					if (record.getR60_uganda() != null) {
					    cell1.setCellValue(record.getR60_uganda().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(10);
					if (record.getR60_c10() != null) {
					    cell1.setCellValue(record.getR60_c10().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(11);
					if (record.getR60_c11() != null) {
					    cell1.setCellValue(record.getR60_c11().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(12);
					if (record.getR60_c12() != null) {
					    cell1.setCellValue(record.getR60_c12().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(13);
					if (record.getR60_c13() != null) {
					    cell1.setCellValue(record.getR60_c13().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(14);
					if (record.getR60_c14() != null) {
					    cell1.setCellValue(record.getR60_c14().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(15);
					if (record.getR60_c15() != null) {
					    cell1.setCellValue(record.getR60_c15().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(16);
					if (record.getR60_c16() != null) {
					    cell1.setCellValue(record.getR60_c16().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}

					cell1 = row.getCell(17);
					if (record.getR60_total() != null) {
					    cell1.setCellValue(record.getR60_total().doubleValue());
					    cell1.setCellStyle(numberStyle);
					} else {
					    cell1.setCellValue("");
					    cell1.setCellStyle(textStyle);
					}
//row61
					
					next61(sheet,record,record2,numberStyle,textStyle);
					
					
			
					
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

	public void next61(Sheet sheet,M_GALOR_Archival_Summary_Entity1 record,M_GALOR_Archival_Summary_Entity2 record2,CellStyle numberStyle,CellStyle textStyle) {
		
		Row row = sheet.getRow(61);

		Cell cell1 = row.createCell(1);
		if (record.getR61_botswana() != null) {
		    cell1.setCellValue(record.getR61_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record.getR61_south_africa() != null) {
		    cell1.setCellValue(record.getR61_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record.getR61_sadc() != null) {
		    cell1.setCellValue(record.getR61_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record.getR61_usa() != null) {
		    cell1.setCellValue(record.getR61_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record.getR61_uk() != null) {
		    cell1.setCellValue(record.getR61_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record.getR61_europe() != null) {
		    cell1.setCellValue(record.getR61_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record.getR61_india() != null) {
		    cell1.setCellValue(record.getR61_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record.getR61_sydney() != null) {
		    cell1.setCellValue(record.getR61_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record.getR61_uganda() != null) {
		    cell1.setCellValue(record.getR61_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record.getR61_c10() != null) {
		    cell1.setCellValue(record.getR61_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record.getR61_c11() != null) {
		    cell1.setCellValue(record.getR61_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record.getR61_c12() != null) {
		    cell1.setCellValue(record.getR61_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record.getR61_c13() != null) {
		    cell1.setCellValue(record.getR61_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record.getR61_c14() != null) {
		    cell1.setCellValue(record.getR61_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record.getR61_c15() != null) {
		    cell1.setCellValue(record.getR61_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record.getR61_c16() != null) {
		    cell1.setCellValue(record.getR61_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record.getR61_total() != null) {
		    cell1.setCellValue(record.getR61_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		//row62
		row = sheet.getRow(62);

		cell1 = row.createCell(1);
		if (record2.getR62_botswana() != null) {
		    cell1.setCellValue(record2.getR62_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR62_south_africa() != null) {
		    cell1.setCellValue(record2.getR62_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR62_sadc() != null) {
		    cell1.setCellValue(record2.getR62_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR62_usa() != null) {
		    cell1.setCellValue(record2.getR62_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR62_uk() != null) {
		    cell1.setCellValue(record2.getR62_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR62_europe() != null) {
		    cell1.setCellValue(record2.getR62_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR62_india() != null) {
		    cell1.setCellValue(record2.getR62_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR62_sydney() != null) {
		    cell1.setCellValue(record2.getR62_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR62_uganda() != null) {
		    cell1.setCellValue(record2.getR62_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR62_c10() != null) {
		    cell1.setCellValue(record2.getR62_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR62_c11() != null) {
		    cell1.setCellValue(record2.getR62_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR62_c12() != null) {
		    cell1.setCellValue(record2.getR62_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR62_c13() != null) {
		    cell1.setCellValue(record2.getR62_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR62_c14() != null) {
		    cell1.setCellValue(record2.getR62_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR62_c15() != null) {
		    cell1.setCellValue(record2.getR62_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR62_c16() != null) {
		    cell1.setCellValue(record2.getR62_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR62_total() != null) {
		    cell1.setCellValue(record2.getR62_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		
		//row63
		row = sheet.getRow(63);

		cell1 = row.createCell(1);
		if (record2.getR63_botswana() != null) {
		    cell1.setCellValue(record2.getR63_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR63_south_africa() != null) {
		    cell1.setCellValue(record2.getR63_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR63_sadc() != null) {
		    cell1.setCellValue(record2.getR63_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR63_usa() != null) {
		    cell1.setCellValue(record2.getR63_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR63_uk() != null) {
		    cell1.setCellValue(record2.getR63_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR63_europe() != null) {
		    cell1.setCellValue(record2.getR63_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR63_india() != null) {
		    cell1.setCellValue(record2.getR63_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR63_sydney() != null) {
		    cell1.setCellValue(record2.getR63_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR63_uganda() != null) {
		    cell1.setCellValue(record2.getR63_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR63_c10() != null) {
		    cell1.setCellValue(record2.getR63_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR63_c11() != null) {
		    cell1.setCellValue(record2.getR63_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR63_c12() != null) {
		    cell1.setCellValue(record2.getR63_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR63_c13() != null) {
		    cell1.setCellValue(record2.getR63_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR63_c14() != null) {
		    cell1.setCellValue(record2.getR63_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR63_c15() != null) {
		    cell1.setCellValue(record2.getR63_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR63_c16() != null) {
		    cell1.setCellValue(record2.getR63_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR63_total() != null) {
		    cell1.setCellValue(record2.getR63_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row64
		row = sheet.getRow(64);

		cell1 = row.createCell(1);
		if (record2.getR64_botswana() != null) {
		    cell1.setCellValue(record2.getR64_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR64_south_africa() != null) {
		    cell1.setCellValue(record2.getR64_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR64_sadc() != null) {
		    cell1.setCellValue(record2.getR64_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR64_usa() != null) {
		    cell1.setCellValue(record2.getR64_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR64_uk() != null) {
		    cell1.setCellValue(record2.getR64_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR64_europe() != null) {
		    cell1.setCellValue(record2.getR64_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR64_india() != null) {
		    cell1.setCellValue(record2.getR64_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR64_sydney() != null) {
		    cell1.setCellValue(record2.getR64_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR64_uganda() != null) {
		    cell1.setCellValue(record2.getR64_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR64_c10() != null) {
		    cell1.setCellValue(record2.getR64_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR64_c11() != null) {
		    cell1.setCellValue(record2.getR64_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR64_c12() != null) {
		    cell1.setCellValue(record2.getR64_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR64_c13() != null) {
		    cell1.setCellValue(record2.getR64_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR64_c14() != null) {
		    cell1.setCellValue(record2.getR64_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR64_c15() != null) {
		    cell1.setCellValue(record2.getR64_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR64_c16() != null) {
		    cell1.setCellValue(record2.getR64_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR64_total() != null) {
		    cell1.setCellValue(record2.getR64_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		//row65
		row = sheet.getRow(65);

		cell1 = row.createCell(1);
		if (record2.getR65_botswana() != null) {
		    cell1.setCellValue(record2.getR65_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR65_south_africa() != null) {
		    cell1.setCellValue(record2.getR65_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR65_sadc() != null) {
		    cell1.setCellValue(record2.getR65_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR65_usa() != null) {
		    cell1.setCellValue(record2.getR65_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR65_uk() != null) {
		    cell1.setCellValue(record2.getR65_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR65_europe() != null) {
		    cell1.setCellValue(record2.getR65_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR65_india() != null) {
		    cell1.setCellValue(record2.getR65_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR65_sydney() != null) {
		    cell1.setCellValue(record2.getR65_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR65_uganda() != null) {
		    cell1.setCellValue(record2.getR65_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR65_c10() != null) {
		    cell1.setCellValue(record2.getR65_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR65_c11() != null) {
		    cell1.setCellValue(record2.getR65_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR65_c12() != null) {
		    cell1.setCellValue(record2.getR65_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR65_c13() != null) {
		    cell1.setCellValue(record2.getR65_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR65_c14() != null) {
		    cell1.setCellValue(record2.getR65_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR65_c15() != null) {
		    cell1.setCellValue(record2.getR65_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR65_c16() != null) {
		    cell1.setCellValue(record2.getR65_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR65_total() != null) {
		    cell1.setCellValue(record2.getR65_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row66
		row = sheet.getRow(66);

		cell1 = row.createCell(1);
		if (record2.getR66_botswana() != null) {
		    cell1.setCellValue(record2.getR66_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR66_south_africa() != null) {
		    cell1.setCellValue(record2.getR66_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR66_sadc() != null) {
		    cell1.setCellValue(record2.getR66_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR66_usa() != null) {
		    cell1.setCellValue(record2.getR66_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR66_uk() != null) {
		    cell1.setCellValue(record2.getR66_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR66_europe() != null) {
		    cell1.setCellValue(record2.getR66_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR66_india() != null) {
		    cell1.setCellValue(record2.getR66_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR66_sydney() != null) {
		    cell1.setCellValue(record2.getR66_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR66_uganda() != null) {
		    cell1.setCellValue(record2.getR66_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR66_c10() != null) {
		    cell1.setCellValue(record2.getR66_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR66_c11() != null) {
		    cell1.setCellValue(record2.getR66_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR66_c12() != null) {
		    cell1.setCellValue(record2.getR66_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR66_c13() != null) {
		    cell1.setCellValue(record2.getR66_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR66_c14() != null) {
		    cell1.setCellValue(record2.getR66_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR66_c15() != null) {
		    cell1.setCellValue(record2.getR66_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR66_c16() != null) {
		    cell1.setCellValue(record2.getR66_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR66_total() != null) {
		    cell1.setCellValue(record2.getR66_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row67
		row = sheet.getRow(67);

		cell1 = row.createCell(1);
		if (record2.getR67_botswana() != null) {
		    cell1.setCellValue(record2.getR67_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR67_south_africa() != null) {
		    cell1.setCellValue(record2.getR67_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR67_sadc() != null) {
		    cell1.setCellValue(record2.getR67_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR67_usa() != null) {
		    cell1.setCellValue(record2.getR67_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR67_uk() != null) {
		    cell1.setCellValue(record2.getR67_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR67_europe() != null) {
		    cell1.setCellValue(record2.getR67_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR67_india() != null) {
		    cell1.setCellValue(record2.getR67_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR67_sydney() != null) {
		    cell1.setCellValue(record2.getR67_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR67_uganda() != null) {
		    cell1.setCellValue(record2.getR67_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR67_c10() != null) {
		    cell1.setCellValue(record2.getR67_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR67_c11() != null) {
		    cell1.setCellValue(record2.getR67_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR67_c12() != null) {
		    cell1.setCellValue(record2.getR67_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR67_c13() != null) {
		    cell1.setCellValue(record2.getR67_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR67_c14() != null) {
		    cell1.setCellValue(record2.getR67_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR67_c15() != null) {
		    cell1.setCellValue(record2.getR67_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR67_c16() != null) {
		    cell1.setCellValue(record2.getR67_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR67_total() != null) {
		    cell1.setCellValue(record2.getR67_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row68
		row = sheet.getRow(68);

		cell1 = row.createCell(1);
		if (record2.getR68_botswana() != null) {
		    cell1.setCellValue(record2.getR68_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR68_south_africa() != null) {
		    cell1.setCellValue(record2.getR68_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR68_sadc() != null) {
		    cell1.setCellValue(record2.getR68_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR68_usa() != null) {
		    cell1.setCellValue(record2.getR68_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR68_uk() != null) {
		    cell1.setCellValue(record2.getR68_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR68_europe() != null) {
		    cell1.setCellValue(record2.getR68_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR68_india() != null) {
		    cell1.setCellValue(record2.getR68_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR68_sydney() != null) {
		    cell1.setCellValue(record2.getR68_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR68_uganda() != null) {
		    cell1.setCellValue(record2.getR68_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR68_c10() != null) {
		    cell1.setCellValue(record2.getR68_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR68_c11() != null) {
		    cell1.setCellValue(record2.getR68_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR68_c12() != null) {
		    cell1.setCellValue(record2.getR68_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR68_c13() != null) {
		    cell1.setCellValue(record2.getR68_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR68_c14() != null) {
		    cell1.setCellValue(record2.getR68_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR68_c15() != null) {
		    cell1.setCellValue(record2.getR68_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR68_c16() != null) {
		    cell1.setCellValue(record2.getR68_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR68_total() != null) {
		    cell1.setCellValue(record2.getR68_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row69
		row = sheet.getRow(69);

		cell1 = row.createCell(1);
		if (record2.getR69_botswana() != null) {
		    cell1.setCellValue(record2.getR69_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR69_south_africa() != null) {
		    cell1.setCellValue(record2.getR69_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR69_sadc() != null) {
		    cell1.setCellValue(record2.getR69_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR69_usa() != null) {
		    cell1.setCellValue(record2.getR69_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR69_uk() != null) {
		    cell1.setCellValue(record2.getR69_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR69_europe() != null) {
		    cell1.setCellValue(record2.getR69_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR69_india() != null) {
		    cell1.setCellValue(record2.getR69_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR69_sydney() != null) {
		    cell1.setCellValue(record2.getR69_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR69_uganda() != null) {
		    cell1.setCellValue(record2.getR69_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR69_c10() != null) {
		    cell1.setCellValue(record2.getR69_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR69_c11() != null) {
		    cell1.setCellValue(record2.getR69_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR69_c12() != null) {
		    cell1.setCellValue(record2.getR69_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR69_c13() != null) {
		    cell1.setCellValue(record2.getR69_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR69_c14() != null) {
		    cell1.setCellValue(record2.getR69_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR69_c15() != null) {
		    cell1.setCellValue(record2.getR69_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR69_c16() != null) {
		    cell1.setCellValue(record2.getR69_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR69_total() != null) {
		    cell1.setCellValue(record2.getR69_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row70
		row = sheet.getRow(70);

		cell1 = row.createCell(1);
		if (record2.getR70_botswana() != null) {
		    cell1.setCellValue(record2.getR70_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR70_south_africa() != null) {
		    cell1.setCellValue(record2.getR70_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR70_sadc() != null) {
		    cell1.setCellValue(record2.getR70_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR70_usa() != null) {
		    cell1.setCellValue(record2.getR70_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR70_uk() != null) {
		    cell1.setCellValue(record2.getR70_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR70_europe() != null) {
		    cell1.setCellValue(record2.getR70_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR70_india() != null) {
		    cell1.setCellValue(record2.getR70_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR70_sydney() != null) {
		    cell1.setCellValue(record2.getR70_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR70_uganda() != null) {
		    cell1.setCellValue(record2.getR70_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR70_c10() != null) {
		    cell1.setCellValue(record2.getR70_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR70_c11() != null) {
		    cell1.setCellValue(record2.getR70_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR70_c12() != null) {
		    cell1.setCellValue(record2.getR70_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR70_c13() != null) {
		    cell1.setCellValue(record2.getR70_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR70_c14() != null) {
		    cell1.setCellValue(record2.getR70_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR70_c15() != null) {
		    cell1.setCellValue(record2.getR70_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR70_c16() != null) {
		    cell1.setCellValue(record2.getR70_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR70_total() != null) {
		    cell1.setCellValue(record2.getR70_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row71
		row = sheet.getRow(71);

		cell1 = row.createCell(1);
		if (record2.getR71_botswana() != null) {
		    cell1.setCellValue(record2.getR71_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR71_south_africa() != null) {
		    cell1.setCellValue(record2.getR71_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR71_sadc() != null) {
		    cell1.setCellValue(record2.getR71_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR71_usa() != null) {
		    cell1.setCellValue(record2.getR71_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR71_uk() != null) {
		    cell1.setCellValue(record2.getR71_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR71_europe() != null) {
		    cell1.setCellValue(record2.getR71_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR71_india() != null) {
		    cell1.setCellValue(record2.getR71_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR71_sydney() != null) {
		    cell1.setCellValue(record2.getR71_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR71_uganda() != null) {
		    cell1.setCellValue(record2.getR71_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR71_c10() != null) {
		    cell1.setCellValue(record2.getR71_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR71_c11() != null) {
		    cell1.setCellValue(record2.getR71_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR71_c12() != null) {
		    cell1.setCellValue(record2.getR71_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR71_c13() != null) {
		    cell1.setCellValue(record2.getR71_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR71_c14() != null) {
		    cell1.setCellValue(record2.getR71_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR71_c15() != null) {
		    cell1.setCellValue(record2.getR71_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR71_c16() != null) {
		    cell1.setCellValue(record2.getR71_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR71_total() != null) {
		    cell1.setCellValue(record2.getR71_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row72
		row = sheet.getRow(72);

		cell1 = row.createCell(1);
		if (record2.getR72_botswana() != null) {
		    cell1.setCellValue(record2.getR72_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR72_south_africa() != null) {
		    cell1.setCellValue(record2.getR72_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR72_sadc() != null) {
		    cell1.setCellValue(record2.getR72_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR72_usa() != null) {
		    cell1.setCellValue(record2.getR72_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR72_uk() != null) {
		    cell1.setCellValue(record2.getR72_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR72_europe() != null) {
		    cell1.setCellValue(record2.getR72_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR72_india() != null) {
		    cell1.setCellValue(record2.getR72_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR72_sydney() != null) {
		    cell1.setCellValue(record2.getR72_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR72_uganda() != null) {
		    cell1.setCellValue(record2.getR72_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR72_c10() != null) {
		    cell1.setCellValue(record2.getR72_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR72_c11() != null) {
		    cell1.setCellValue(record2.getR72_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR72_c12() != null) {
		    cell1.setCellValue(record2.getR72_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR72_c13() != null) {
		    cell1.setCellValue(record2.getR72_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR72_c14() != null) {
		    cell1.setCellValue(record2.getR72_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR72_c15() != null) {
		    cell1.setCellValue(record2.getR72_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR72_c16() != null) {
		    cell1.setCellValue(record2.getR72_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR72_total() != null) {
		    cell1.setCellValue(record2.getR72_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row73
		row = sheet.getRow(73);

		cell1 = row.createCell(1);
		if (record2.getR73_botswana() != null) {
		    cell1.setCellValue(record2.getR73_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR73_south_africa() != null) {
		    cell1.setCellValue(record2.getR73_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR73_sadc() != null) {
		    cell1.setCellValue(record2.getR73_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR73_usa() != null) {
		    cell1.setCellValue(record2.getR73_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR73_uk() != null) {
		    cell1.setCellValue(record2.getR73_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR73_europe() != null) {
		    cell1.setCellValue(record2.getR73_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR73_india() != null) {
		    cell1.setCellValue(record2.getR73_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR73_sydney() != null) {
		    cell1.setCellValue(record2.getR73_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR73_uganda() != null) {
		    cell1.setCellValue(record2.getR73_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR73_c10() != null) {
		    cell1.setCellValue(record2.getR73_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR73_c11() != null) {
		    cell1.setCellValue(record2.getR73_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR73_c12() != null) {
		    cell1.setCellValue(record2.getR73_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR73_c13() != null) {
		    cell1.setCellValue(record2.getR73_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR73_c14() != null) {
		    cell1.setCellValue(record2.getR73_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR73_c15() != null) {
		    cell1.setCellValue(record2.getR73_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR73_c16() != null) {
		    cell1.setCellValue(record2.getR73_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR73_total() != null) {
		    cell1.setCellValue(record2.getR73_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row74
		row = sheet.getRow(74);

		cell1 = row.createCell(1);
		if (record2.getR74_botswana() != null) {
		    cell1.setCellValue(record2.getR74_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR74_south_africa() != null) {
		    cell1.setCellValue(record2.getR74_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR74_sadc() != null) {
		    cell1.setCellValue(record2.getR74_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR74_usa() != null) {
		    cell1.setCellValue(record2.getR74_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR74_uk() != null) {
		    cell1.setCellValue(record2.getR74_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR74_europe() != null) {
		    cell1.setCellValue(record2.getR74_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR74_india() != null) {
		    cell1.setCellValue(record2.getR74_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR74_sydney() != null) {
		    cell1.setCellValue(record2.getR74_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR74_uganda() != null) {
		    cell1.setCellValue(record2.getR74_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR74_c10() != null) {
		    cell1.setCellValue(record2.getR74_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR74_c11() != null) {
		    cell1.setCellValue(record2.getR74_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR74_c12() != null) {
		    cell1.setCellValue(record2.getR74_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR74_c13() != null) {
		    cell1.setCellValue(record2.getR74_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR74_c14() != null) {
		    cell1.setCellValue(record2.getR74_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR74_c15() != null) {
		    cell1.setCellValue(record2.getR74_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR74_c16() != null) {
		    cell1.setCellValue(record2.getR74_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR74_total() != null) {
		    cell1.setCellValue(record2.getR74_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row75
		row = sheet.getRow(75);

		cell1 = row.createCell(1);
		if (record2.getR75_botswana() != null) {
		    cell1.setCellValue(record2.getR75_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR75_south_africa() != null) {
		    cell1.setCellValue(record2.getR75_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR75_sadc() != null) {
		    cell1.setCellValue(record2.getR75_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR75_usa() != null) {
		    cell1.setCellValue(record2.getR75_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR75_uk() != null) {
		    cell1.setCellValue(record2.getR75_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR75_europe() != null) {
		    cell1.setCellValue(record2.getR75_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR75_india() != null) {
		    cell1.setCellValue(record2.getR75_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR75_sydney() != null) {
		    cell1.setCellValue(record2.getR75_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR75_uganda() != null) {
		    cell1.setCellValue(record2.getR75_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR75_c10() != null) {
		    cell1.setCellValue(record2.getR75_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR75_c11() != null) {
		    cell1.setCellValue(record2.getR75_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR75_c12() != null) {
		    cell1.setCellValue(record2.getR75_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR75_c13() != null) {
		    cell1.setCellValue(record2.getR75_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR75_c14() != null) {
		    cell1.setCellValue(record2.getR75_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR75_c15() != null) {
		    cell1.setCellValue(record2.getR75_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR75_c16() != null) {
		    cell1.setCellValue(record2.getR75_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR75_total() != null) {
		    cell1.setCellValue(record2.getR75_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row76
		row = sheet.getRow(76);

		cell1 = row.createCell(1);
		if (record2.getR76_botswana() != null) {
		    cell1.setCellValue(record2.getR76_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR76_south_africa() != null) {
		    cell1.setCellValue(record2.getR76_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR76_sadc() != null) {
		    cell1.setCellValue(record2.getR76_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR76_usa() != null) {
		    cell1.setCellValue(record2.getR76_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR76_uk() != null) {
		    cell1.setCellValue(record2.getR76_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR76_europe() != null) {
		    cell1.setCellValue(record2.getR76_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR76_india() != null) {
		    cell1.setCellValue(record2.getR76_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR76_sydney() != null) {
		    cell1.setCellValue(record2.getR76_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR76_uganda() != null) {
		    cell1.setCellValue(record2.getR76_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR76_c10() != null) {
		    cell1.setCellValue(record2.getR76_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR76_c11() != null) {
		    cell1.setCellValue(record2.getR76_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR76_c12() != null) {
		    cell1.setCellValue(record2.getR76_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR76_c13() != null) {
		    cell1.setCellValue(record2.getR76_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR76_c14() != null) {
		    cell1.setCellValue(record2.getR76_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR76_c15() != null) {
		    cell1.setCellValue(record2.getR76_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR76_c16() != null) {
		    cell1.setCellValue(record2.getR76_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR76_total() != null) {
		    cell1.setCellValue(record2.getR76_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row77
		row = sheet.getRow(77);

		cell1 = row.createCell(1);
		if (record2.getR77_botswana() != null) {
		    cell1.setCellValue(record2.getR77_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR77_south_africa() != null) {
		    cell1.setCellValue(record2.getR77_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR77_sadc() != null) {
		    cell1.setCellValue(record2.getR77_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR77_usa() != null) {
		    cell1.setCellValue(record2.getR77_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR77_uk() != null) {
		    cell1.setCellValue(record2.getR77_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR77_europe() != null) {
		    cell1.setCellValue(record2.getR77_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR77_india() != null) {
		    cell1.setCellValue(record2.getR77_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR77_sydney() != null) {
		    cell1.setCellValue(record2.getR77_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR77_uganda() != null) {
		    cell1.setCellValue(record2.getR77_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR77_c10() != null) {
		    cell1.setCellValue(record2.getR77_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR77_c11() != null) {
		    cell1.setCellValue(record2.getR77_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR77_c12() != null) {
		    cell1.setCellValue(record2.getR77_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR77_c13() != null) {
		    cell1.setCellValue(record2.getR77_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR77_c14() != null) {
		    cell1.setCellValue(record2.getR77_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR77_c15() != null) {
		    cell1.setCellValue(record2.getR77_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR77_c16() != null) {
		    cell1.setCellValue(record2.getR77_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR77_total() != null) {
		    cell1.setCellValue(record2.getR77_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row78
		row = sheet.getRow(78);

		cell1 = row.createCell(1);
		if (record2.getR78_botswana() != null) {
		    cell1.setCellValue(record2.getR78_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR78_south_africa() != null) {
		    cell1.setCellValue(record2.getR78_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR78_sadc() != null) {
		    cell1.setCellValue(record2.getR78_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR78_usa() != null) {
		    cell1.setCellValue(record2.getR78_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR78_uk() != null) {
		    cell1.setCellValue(record2.getR78_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR78_europe() != null) {
		    cell1.setCellValue(record2.getR78_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR78_india() != null) {
		    cell1.setCellValue(record2.getR78_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR78_sydney() != null) {
		    cell1.setCellValue(record2.getR78_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR78_uganda() != null) {
		    cell1.setCellValue(record2.getR78_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR78_c10() != null) {
		    cell1.setCellValue(record2.getR78_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR78_c11() != null) {
		    cell1.setCellValue(record2.getR78_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR78_c12() != null) {
		    cell1.setCellValue(record2.getR78_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR78_c13() != null) {
		    cell1.setCellValue(record2.getR78_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR78_c14() != null) {
		    cell1.setCellValue(record2.getR78_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR78_c15() != null) {
		    cell1.setCellValue(record2.getR78_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR78_c16() != null) {
		    cell1.setCellValue(record2.getR78_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR78_total() != null) {
		    cell1.setCellValue(record2.getR78_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row79
		row = sheet.getRow(79);

		cell1 = row.createCell(1);
		if (record2.getR79_botswana() != null) {
		    cell1.setCellValue(record2.getR79_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR79_south_africa() != null) {
		    cell1.setCellValue(record2.getR79_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR79_sadc() != null) {
		    cell1.setCellValue(record2.getR79_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR79_usa() != null) {
		    cell1.setCellValue(record2.getR79_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR79_uk() != null) {
		    cell1.setCellValue(record2.getR79_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR79_europe() != null) {
		    cell1.setCellValue(record2.getR79_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR79_india() != null) {
		    cell1.setCellValue(record2.getR79_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR79_sydney() != null) {
		    cell1.setCellValue(record2.getR79_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR79_uganda() != null) {
		    cell1.setCellValue(record2.getR79_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR79_c10() != null) {
		    cell1.setCellValue(record2.getR79_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR79_c11() != null) {
		    cell1.setCellValue(record2.getR79_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR79_c12() != null) {
		    cell1.setCellValue(record2.getR79_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR79_c13() != null) {
		    cell1.setCellValue(record2.getR79_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR79_c14() != null) {
		    cell1.setCellValue(record2.getR79_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR79_c15() != null) {
		    cell1.setCellValue(record2.getR79_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR79_c16() != null) {
		    cell1.setCellValue(record2.getR79_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR79_total() != null) {
		    cell1.setCellValue(record2.getR79_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row80
		row = sheet.getRow(80);

		cell1 = row.createCell(1);
		if (record2.getR80_botswana() != null) {
		    cell1.setCellValue(record2.getR80_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR80_south_africa() != null) {
		    cell1.setCellValue(record2.getR80_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR80_sadc() != null) {
		    cell1.setCellValue(record2.getR80_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR80_usa() != null) {
		    cell1.setCellValue(record2.getR80_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR80_uk() != null) {
		    cell1.setCellValue(record2.getR80_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR80_europe() != null) {
		    cell1.setCellValue(record2.getR80_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR80_india() != null) {
		    cell1.setCellValue(record2.getR80_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR80_sydney() != null) {
		    cell1.setCellValue(record2.getR80_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR80_uganda() != null) {
		    cell1.setCellValue(record2.getR80_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR80_c10() != null) {
		    cell1.setCellValue(record2.getR80_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR80_c11() != null) {
		    cell1.setCellValue(record2.getR80_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR80_c12() != null) {
		    cell1.setCellValue(record2.getR80_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR80_c13() != null) {
		    cell1.setCellValue(record2.getR80_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR80_c14() != null) {
		    cell1.setCellValue(record2.getR80_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR80_c15() != null) {
		    cell1.setCellValue(record2.getR80_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR80_c16() != null) {
		    cell1.setCellValue(record2.getR80_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR80_total() != null) {
		    cell1.setCellValue(record2.getR80_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row81
		row = sheet.getRow(81);

		cell1 = row.createCell(1);
		if (record2.getR81_botswana() != null) {
		    cell1.setCellValue(record2.getR81_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR81_south_africa() != null) {
		    cell1.setCellValue(record2.getR81_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR81_sadc() != null) {
		    cell1.setCellValue(record2.getR81_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR81_usa() != null) {
		    cell1.setCellValue(record2.getR81_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR81_uk() != null) {
		    cell1.setCellValue(record2.getR81_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR81_europe() != null) {
		    cell1.setCellValue(record2.getR81_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR81_india() != null) {
		    cell1.setCellValue(record2.getR81_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR81_sydney() != null) {
		    cell1.setCellValue(record2.getR81_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR81_uganda() != null) {
		    cell1.setCellValue(record2.getR81_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR81_c10() != null) {
		    cell1.setCellValue(record2.getR81_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR81_c11() != null) {
		    cell1.setCellValue(record2.getR81_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR81_c12() != null) {
		    cell1.setCellValue(record2.getR81_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR81_c13() != null) {
		    cell1.setCellValue(record2.getR81_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR81_c14() != null) {
		    cell1.setCellValue(record2.getR81_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR81_c15() != null) {
		    cell1.setCellValue(record2.getR81_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR81_c16() != null) {
		    cell1.setCellValue(record2.getR81_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR81_total() != null) {
		    cell1.setCellValue(record2.getR81_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row82
		row = sheet.getRow(82);

		cell1 = row.createCell(1);
		if (record2.getR82_botswana() != null) {
		    cell1.setCellValue(record2.getR82_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR82_south_africa() != null) {
		    cell1.setCellValue(record2.getR82_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR82_sadc() != null) {
		    cell1.setCellValue(record2.getR82_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR82_usa() != null) {
		    cell1.setCellValue(record2.getR82_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR82_uk() != null) {
		    cell1.setCellValue(record2.getR82_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR82_europe() != null) {
		    cell1.setCellValue(record2.getR82_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR82_india() != null) {
		    cell1.setCellValue(record2.getR82_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR82_sydney() != null) {
		    cell1.setCellValue(record2.getR82_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR82_uganda() != null) {
		    cell1.setCellValue(record2.getR82_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR82_c10() != null) {
		    cell1.setCellValue(record2.getR82_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR82_c11() != null) {
		    cell1.setCellValue(record2.getR82_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR82_c12() != null) {
		    cell1.setCellValue(record2.getR82_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR82_c13() != null) {
		    cell1.setCellValue(record2.getR82_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR82_c14() != null) {
		    cell1.setCellValue(record2.getR82_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR82_c15() != null) {
		    cell1.setCellValue(record2.getR82_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR82_c16() != null) {
		    cell1.setCellValue(record2.getR82_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR82_total() != null) {
		    cell1.setCellValue(record2.getR82_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row83
		row = sheet.getRow(83);

		cell1 = row.createCell(1);
		if (record2.getR83_botswana() != null) {
		    cell1.setCellValue(record2.getR83_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR83_south_africa() != null) {
		    cell1.setCellValue(record2.getR83_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR83_sadc() != null) {
		    cell1.setCellValue(record2.getR83_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR83_usa() != null) {
		    cell1.setCellValue(record2.getR83_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR83_uk() != null) {
		    cell1.setCellValue(record2.getR83_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR83_europe() != null) {
		    cell1.setCellValue(record2.getR83_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR83_india() != null) {
		    cell1.setCellValue(record2.getR83_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR83_sydney() != null) {
		    cell1.setCellValue(record2.getR83_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR83_uganda() != null) {
		    cell1.setCellValue(record2.getR83_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR83_c10() != null) {
		    cell1.setCellValue(record2.getR83_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR83_c11() != null) {
		    cell1.setCellValue(record2.getR83_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR83_c12() != null) {
		    cell1.setCellValue(record2.getR83_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR83_c13() != null) {
		    cell1.setCellValue(record2.getR83_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR83_c14() != null) {
		    cell1.setCellValue(record2.getR83_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR83_c15() != null) {
		    cell1.setCellValue(record2.getR83_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR83_c16() != null) {
		    cell1.setCellValue(record2.getR83_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR83_total() != null) {
		    cell1.setCellValue(record2.getR83_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row84
		row = sheet.getRow(84);

		cell1 = row.createCell(1);
		if (record2.getR84_botswana() != null) {
		    cell1.setCellValue(record2.getR84_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR84_south_africa() != null) {
		    cell1.setCellValue(record2.getR84_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR84_sadc() != null) {
		    cell1.setCellValue(record2.getR84_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR84_usa() != null) {
		    cell1.setCellValue(record2.getR84_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR84_uk() != null) {
		    cell1.setCellValue(record2.getR84_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR84_europe() != null) {
		    cell1.setCellValue(record2.getR84_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR84_india() != null) {
		    cell1.setCellValue(record2.getR84_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR84_sydney() != null) {
		    cell1.setCellValue(record2.getR84_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR84_uganda() != null) {
		    cell1.setCellValue(record2.getR84_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR84_c10() != null) {
		    cell1.setCellValue(record2.getR84_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR84_c11() != null) {
		    cell1.setCellValue(record2.getR84_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR84_c12() != null) {
		    cell1.setCellValue(record2.getR84_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR84_c13() != null) {
		    cell1.setCellValue(record2.getR84_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR84_c14() != null) {
		    cell1.setCellValue(record2.getR84_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR84_c15() != null) {
		    cell1.setCellValue(record2.getR84_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR84_c16() != null) {
		    cell1.setCellValue(record2.getR84_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR84_total() != null) {
		    cell1.setCellValue(record2.getR84_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row85
		row = sheet.getRow(85);

		cell1 = row.createCell(1);
		if (record2.getR85_botswana() != null) {
		    cell1.setCellValue(record2.getR85_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR85_south_africa() != null) {
		    cell1.setCellValue(record2.getR85_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR85_sadc() != null) {
		    cell1.setCellValue(record2.getR85_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR85_usa() != null) {
		    cell1.setCellValue(record2.getR85_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR85_uk() != null) {
		    cell1.setCellValue(record2.getR85_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR85_europe() != null) {
		    cell1.setCellValue(record2.getR85_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR85_india() != null) {
		    cell1.setCellValue(record2.getR85_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR85_sydney() != null) {
		    cell1.setCellValue(record2.getR85_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR85_uganda() != null) {
		    cell1.setCellValue(record2.getR85_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR85_c10() != null) {
		    cell1.setCellValue(record2.getR85_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR85_c11() != null) {
		    cell1.setCellValue(record2.getR85_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR85_c12() != null) {
		    cell1.setCellValue(record2.getR85_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR85_c13() != null) {
		    cell1.setCellValue(record2.getR85_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR85_c14() != null) {
		    cell1.setCellValue(record2.getR85_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR85_c15() != null) {
		    cell1.setCellValue(record2.getR85_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR85_c16() != null) {
		    cell1.setCellValue(record2.getR85_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR85_total() != null) {
		    cell1.setCellValue(record2.getR85_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row86
		row = sheet.getRow(86);

		cell1 = row.createCell(1);
		if (record2.getR86_botswana() != null) {
		    cell1.setCellValue(record2.getR86_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR86_south_africa() != null) {
		    cell1.setCellValue(record2.getR86_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR86_sadc() != null) {
		    cell1.setCellValue(record2.getR86_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR86_usa() != null) {
		    cell1.setCellValue(record2.getR86_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR86_uk() != null) {
		    cell1.setCellValue(record2.getR86_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR86_europe() != null) {
		    cell1.setCellValue(record2.getR86_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR86_india() != null) {
		    cell1.setCellValue(record2.getR86_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR86_sydney() != null) {
		    cell1.setCellValue(record2.getR86_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR86_uganda() != null) {
		    cell1.setCellValue(record2.getR86_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR86_c10() != null) {
		    cell1.setCellValue(record2.getR86_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR86_c11() != null) {
		    cell1.setCellValue(record2.getR86_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR86_c12() != null) {
		    cell1.setCellValue(record2.getR86_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR86_c13() != null) {
		    cell1.setCellValue(record2.getR86_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR86_c14() != null) {
		    cell1.setCellValue(record2.getR86_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR86_c15() != null) {
		    cell1.setCellValue(record2.getR86_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR86_c16() != null) {
		    cell1.setCellValue(record2.getR86_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR86_total() != null) {
		    cell1.setCellValue(record2.getR86_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row87
		row = sheet.getRow(87);

		cell1 = row.createCell(1);
		if (record2.getR87_botswana() != null) {
		    cell1.setCellValue(record2.getR87_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR87_south_africa() != null) {
		    cell1.setCellValue(record2.getR87_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR87_sadc() != null) {
		    cell1.setCellValue(record2.getR87_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR87_usa() != null) {
		    cell1.setCellValue(record2.getR87_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR87_uk() != null) {
		    cell1.setCellValue(record2.getR87_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR87_europe() != null) {
		    cell1.setCellValue(record2.getR87_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR87_india() != null) {
		    cell1.setCellValue(record2.getR87_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR87_sydney() != null) {
		    cell1.setCellValue(record2.getR87_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR87_uganda() != null) {
		    cell1.setCellValue(record2.getR87_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR87_c10() != null) {
		    cell1.setCellValue(record2.getR87_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR87_c11() != null) {
		    cell1.setCellValue(record2.getR87_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR87_c12() != null) {
		    cell1.setCellValue(record2.getR87_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR87_c13() != null) {
		    cell1.setCellValue(record2.getR87_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR87_c14() != null) {
		    cell1.setCellValue(record2.getR87_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR87_c15() != null) {
		    cell1.setCellValue(record2.getR87_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR87_c16() != null) {
		    cell1.setCellValue(record2.getR87_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR87_total() != null) {
		    cell1.setCellValue(record2.getR87_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row88
		row = sheet.getRow(88);

		cell1 = row.createCell(1);
		if (record2.getR88_botswana() != null) {
		    cell1.setCellValue(record2.getR88_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR88_south_africa() != null) {
		    cell1.setCellValue(record2.getR88_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR88_sadc() != null) {
		    cell1.setCellValue(record2.getR88_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR88_usa() != null) {
		    cell1.setCellValue(record2.getR88_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR88_uk() != null) {
		    cell1.setCellValue(record2.getR88_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR88_europe() != null) {
		    cell1.setCellValue(record2.getR88_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR88_india() != null) {
		    cell1.setCellValue(record2.getR88_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR88_sydney() != null) {
		    cell1.setCellValue(record2.getR88_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR88_uganda() != null) {
		    cell1.setCellValue(record2.getR88_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR88_c10() != null) {
		    cell1.setCellValue(record2.getR88_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR88_c11() != null) {
		    cell1.setCellValue(record2.getR88_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR88_c12() != null) {
		    cell1.setCellValue(record2.getR88_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR88_c13() != null) {
		    cell1.setCellValue(record2.getR88_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR88_c14() != null) {
		    cell1.setCellValue(record2.getR88_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR88_c15() != null) {
		    cell1.setCellValue(record2.getR88_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR88_c16() != null) {
		    cell1.setCellValue(record2.getR88_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR88_total() != null) {
		    cell1.setCellValue(record2.getR88_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row89
		row = sheet.getRow(89);

		cell1 = row.createCell(1);
		if (record2.getR89_botswana() != null) {
		    cell1.setCellValue(record2.getR89_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR89_south_africa() != null) {
		    cell1.setCellValue(record2.getR89_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR89_sadc() != null) {
		    cell1.setCellValue(record2.getR89_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR89_usa() != null) {
		    cell1.setCellValue(record2.getR89_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR89_uk() != null) {
		    cell1.setCellValue(record2.getR89_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR89_europe() != null) {
		    cell1.setCellValue(record2.getR89_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR89_india() != null) {
		    cell1.setCellValue(record2.getR89_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR89_sydney() != null) {
		    cell1.setCellValue(record2.getR89_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR89_uganda() != null) {
		    cell1.setCellValue(record2.getR89_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR89_c10() != null) {
		    cell1.setCellValue(record2.getR89_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR89_c11() != null) {
		    cell1.setCellValue(record2.getR89_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR89_c12() != null) {
		    cell1.setCellValue(record2.getR89_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR89_c13() != null) {
		    cell1.setCellValue(record2.getR89_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR89_c14() != null) {
		    cell1.setCellValue(record2.getR89_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR89_c15() != null) {
		    cell1.setCellValue(record2.getR89_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR89_c16() != null) {
		    cell1.setCellValue(record2.getR89_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR89_total() != null) {
		    cell1.setCellValue(record2.getR89_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row90
		row = sheet.getRow(90);

		cell1 = row.createCell(1);
		if (record2.getR90_botswana() != null) {
		    cell1.setCellValue(record2.getR90_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR90_south_africa() != null) {
		    cell1.setCellValue(record2.getR90_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR90_sadc() != null) {
		    cell1.setCellValue(record2.getR90_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR90_usa() != null) {
		    cell1.setCellValue(record2.getR90_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR90_uk() != null) {
		    cell1.setCellValue(record2.getR90_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR90_europe() != null) {
		    cell1.setCellValue(record2.getR90_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR90_india() != null) {
		    cell1.setCellValue(record2.getR90_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR90_sydney() != null) {
		    cell1.setCellValue(record2.getR90_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR90_uganda() != null) {
		    cell1.setCellValue(record2.getR90_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR90_c10() != null) {
		    cell1.setCellValue(record2.getR90_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR90_c11() != null) {
		    cell1.setCellValue(record2.getR90_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR90_c12() != null) {
		    cell1.setCellValue(record2.getR90_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR90_c13() != null) {
		    cell1.setCellValue(record2.getR90_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR90_c14() != null) {
		    cell1.setCellValue(record2.getR90_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR90_c15() != null) {
		    cell1.setCellValue(record2.getR90_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR90_c16() != null) {
		    cell1.setCellValue(record2.getR90_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR90_total() != null) {
		    cell1.setCellValue(record2.getR90_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row91
		row = sheet.getRow(91);

		cell1 = row.createCell(1);
		if (record2.getR91_botswana() != null) {
		    cell1.setCellValue(record2.getR91_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR91_south_africa() != null) {
		    cell1.setCellValue(record2.getR91_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR91_sadc() != null) {
		    cell1.setCellValue(record2.getR91_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR91_usa() != null) {
		    cell1.setCellValue(record2.getR91_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR91_uk() != null) {
		    cell1.setCellValue(record2.getR91_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR91_europe() != null) {
		    cell1.setCellValue(record2.getR91_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR91_india() != null) {
		    cell1.setCellValue(record2.getR91_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR91_sydney() != null) {
		    cell1.setCellValue(record2.getR91_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR91_uganda() != null) {
		    cell1.setCellValue(record2.getR91_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR91_c10() != null) {
		    cell1.setCellValue(record2.getR91_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR91_c11() != null) {
		    cell1.setCellValue(record2.getR91_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR91_c12() != null) {
		    cell1.setCellValue(record2.getR91_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR91_c13() != null) {
		    cell1.setCellValue(record2.getR91_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR91_c14() != null) {
		    cell1.setCellValue(record2.getR91_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR91_c15() != null) {
		    cell1.setCellValue(record2.getR91_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR91_c16() != null) {
		    cell1.setCellValue(record2.getR91_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR91_total() != null) {
		    cell1.setCellValue(record2.getR91_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row92
		row = sheet.getRow(92);

		cell1 = row.createCell(1);
		if (record2.getR92_botswana() != null) {
		    cell1.setCellValue(record2.getR92_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR92_south_africa() != null) {
		    cell1.setCellValue(record2.getR92_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR92_sadc() != null) {
		    cell1.setCellValue(record2.getR92_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR92_usa() != null) {
		    cell1.setCellValue(record2.getR92_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR92_uk() != null) {
		    cell1.setCellValue(record2.getR92_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR92_europe() != null) {
		    cell1.setCellValue(record2.getR92_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR92_india() != null) {
		    cell1.setCellValue(record2.getR92_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR92_sydney() != null) {
		    cell1.setCellValue(record2.getR92_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR92_uganda() != null) {
		    cell1.setCellValue(record2.getR92_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR92_c10() != null) {
		    cell1.setCellValue(record2.getR92_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR92_c11() != null) {
		    cell1.setCellValue(record2.getR92_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR92_c12() != null) {
		    cell1.setCellValue(record2.getR92_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR92_c13() != null) {
		    cell1.setCellValue(record2.getR92_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR92_c14() != null) {
		    cell1.setCellValue(record2.getR92_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR92_c15() != null) {
		    cell1.setCellValue(record2.getR92_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR92_c16() != null) {
		    cell1.setCellValue(record2.getR92_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR92_total() != null) {
		    cell1.setCellValue(record2.getR92_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row93
		row = sheet.getRow(93);

		cell1 = row.createCell(1);
		if (record2.getR93_botswana() != null) {
		    cell1.setCellValue(record2.getR93_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR93_south_africa() != null) {
		    cell1.setCellValue(record2.getR93_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR93_sadc() != null) {
		    cell1.setCellValue(record2.getR93_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR93_usa() != null) {
		    cell1.setCellValue(record2.getR93_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR93_uk() != null) {
		    cell1.setCellValue(record2.getR93_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR93_europe() != null) {
		    cell1.setCellValue(record2.getR93_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR93_india() != null) {
		    cell1.setCellValue(record2.getR93_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR93_sydney() != null) {
		    cell1.setCellValue(record2.getR93_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR93_uganda() != null) {
		    cell1.setCellValue(record2.getR93_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR93_c10() != null) {
		    cell1.setCellValue(record2.getR93_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR93_c11() != null) {
		    cell1.setCellValue(record2.getR93_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR93_c12() != null) {
		    cell1.setCellValue(record2.getR93_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR93_c13() != null) {
		    cell1.setCellValue(record2.getR93_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR93_c14() != null) {
		    cell1.setCellValue(record2.getR93_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR93_c15() != null) {
		    cell1.setCellValue(record2.getR93_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR93_c16() != null) {
		    cell1.setCellValue(record2.getR93_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR93_total() != null) {
		    cell1.setCellValue(record2.getR93_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row94
		row = sheet.getRow(94);

		cell1 = row.createCell(1);
		if (record2.getR94_botswana() != null) {
		    cell1.setCellValue(record2.getR94_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR94_south_africa() != null) {
		    cell1.setCellValue(record2.getR94_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR94_sadc() != null) {
		    cell1.setCellValue(record2.getR94_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR94_usa() != null) {
		    cell1.setCellValue(record2.getR94_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR94_uk() != null) {
		    cell1.setCellValue(record2.getR94_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR94_europe() != null) {
		    cell1.setCellValue(record2.getR94_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR94_india() != null) {
		    cell1.setCellValue(record2.getR94_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR94_sydney() != null) {
		    cell1.setCellValue(record2.getR94_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR94_uganda() != null) {
		    cell1.setCellValue(record2.getR94_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR94_c10() != null) {
		    cell1.setCellValue(record2.getR94_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR94_c11() != null) {
		    cell1.setCellValue(record2.getR94_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR94_c12() != null) {
		    cell1.setCellValue(record2.getR94_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR94_c13() != null) {
		    cell1.setCellValue(record2.getR94_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR94_c14() != null) {
		    cell1.setCellValue(record2.getR94_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR94_c15() != null) {
		    cell1.setCellValue(record2.getR94_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR94_c16() != null) {
		    cell1.setCellValue(record2.getR94_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR94_total() != null) {
		    cell1.setCellValue(record2.getR94_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row95
		row = sheet.getRow(95);

		cell1 = row.createCell(1);
		if (record2.getR95_botswana() != null) {
		    cell1.setCellValue(record2.getR95_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR95_south_africa() != null) {
		    cell1.setCellValue(record2.getR95_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR95_sadc() != null) {
		    cell1.setCellValue(record2.getR95_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR95_usa() != null) {
		    cell1.setCellValue(record2.getR95_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR95_uk() != null) {
		    cell1.setCellValue(record2.getR95_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR95_europe() != null) {
		    cell1.setCellValue(record2.getR95_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR95_india() != null) {
		    cell1.setCellValue(record2.getR95_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR95_sydney() != null) {
		    cell1.setCellValue(record2.getR95_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR95_uganda() != null) {
		    cell1.setCellValue(record2.getR95_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR95_c10() != null) {
		    cell1.setCellValue(record2.getR95_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR95_c11() != null) {
		    cell1.setCellValue(record2.getR95_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR95_c12() != null) {
		    cell1.setCellValue(record2.getR95_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR95_c13() != null) {
		    cell1.setCellValue(record2.getR95_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR95_c14() != null) {
		    cell1.setCellValue(record2.getR95_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR95_c15() != null) {
		    cell1.setCellValue(record2.getR95_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR95_c16() != null) {
		    cell1.setCellValue(record2.getR95_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR95_total() != null) {
		    cell1.setCellValue(record2.getR95_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row96
		row = sheet.getRow(96);

		cell1 = row.createCell(1);
		if (record2.getR96_botswana() != null) {
		    cell1.setCellValue(record2.getR96_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR96_south_africa() != null) {
		    cell1.setCellValue(record2.getR96_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR96_sadc() != null) {
		    cell1.setCellValue(record2.getR96_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR96_usa() != null) {
		    cell1.setCellValue(record2.getR96_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR96_uk() != null) {
		    cell1.setCellValue(record2.getR96_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR96_europe() != null) {
		    cell1.setCellValue(record2.getR96_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR96_india() != null) {
		    cell1.setCellValue(record2.getR96_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR96_sydney() != null) {
		    cell1.setCellValue(record2.getR96_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR96_uganda() != null) {
		    cell1.setCellValue(record2.getR96_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR96_c10() != null) {
		    cell1.setCellValue(record2.getR96_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR96_c11() != null) {
		    cell1.setCellValue(record2.getR96_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR96_c12() != null) {
		    cell1.setCellValue(record2.getR96_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR96_c13() != null) {
		    cell1.setCellValue(record2.getR96_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR96_c14() != null) {
		    cell1.setCellValue(record2.getR96_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR96_c15() != null) {
		    cell1.setCellValue(record2.getR96_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR96_c16() != null) {
		    cell1.setCellValue(record2.getR96_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR96_total() != null) {
		    cell1.setCellValue(record2.getR96_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row97
		row = sheet.getRow(97);

		cell1 = row.createCell(1);
		if (record2.getR97_botswana() != null) {
		    cell1.setCellValue(record2.getR97_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR97_south_africa() != null) {
		    cell1.setCellValue(record2.getR97_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR97_sadc() != null) {
		    cell1.setCellValue(record2.getR97_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR97_usa() != null) {
		    cell1.setCellValue(record2.getR97_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR97_uk() != null) {
		    cell1.setCellValue(record2.getR97_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR97_europe() != null) {
		    cell1.setCellValue(record2.getR97_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR97_india() != null) {
		    cell1.setCellValue(record2.getR97_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR97_sydney() != null) {
		    cell1.setCellValue(record2.getR97_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR97_uganda() != null) {
		    cell1.setCellValue(record2.getR97_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR97_c10() != null) {
		    cell1.setCellValue(record2.getR97_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR97_c11() != null) {
		    cell1.setCellValue(record2.getR97_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR97_c12() != null) {
		    cell1.setCellValue(record2.getR97_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR97_c13() != null) {
		    cell1.setCellValue(record2.getR97_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR97_c14() != null) {
		    cell1.setCellValue(record2.getR97_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR97_c15() != null) {
		    cell1.setCellValue(record2.getR97_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR97_c16() != null) {
		    cell1.setCellValue(record2.getR97_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR97_total() != null) {
		    cell1.setCellValue(record2.getR97_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row98
		row = sheet.getRow(98);

		cell1 = row.createCell(1);
		if (record2.getR98_botswana() != null) {
		    cell1.setCellValue(record2.getR98_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR98_south_africa() != null) {
		    cell1.setCellValue(record2.getR98_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR98_sadc() != null) {
		    cell1.setCellValue(record2.getR98_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR98_usa() != null) {
		    cell1.setCellValue(record2.getR98_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR98_uk() != null) {
		    cell1.setCellValue(record2.getR98_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR98_europe() != null) {
		    cell1.setCellValue(record2.getR98_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR98_india() != null) {
		    cell1.setCellValue(record2.getR98_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR98_sydney() != null) {
		    cell1.setCellValue(record2.getR98_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR98_uganda() != null) {
		    cell1.setCellValue(record2.getR98_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR98_c10() != null) {
		    cell1.setCellValue(record2.getR98_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR98_c11() != null) {
		    cell1.setCellValue(record2.getR98_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR98_c12() != null) {
		    cell1.setCellValue(record2.getR98_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR98_c13() != null) {
		    cell1.setCellValue(record2.getR98_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR98_c14() != null) {
		    cell1.setCellValue(record2.getR98_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR98_c15() != null) {
		    cell1.setCellValue(record2.getR98_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR98_c16() != null) {
		    cell1.setCellValue(record2.getR98_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR98_total() != null) {
		    cell1.setCellValue(record2.getR98_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row99
		row = sheet.getRow(99);

		cell1 = row.createCell(1);
		if (record2.getR99_botswana() != null) {
		    cell1.setCellValue(record2.getR99_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR99_south_africa() != null) {
		    cell1.setCellValue(record2.getR99_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR99_sadc() != null) {
		    cell1.setCellValue(record2.getR99_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR99_usa() != null) {
		    cell1.setCellValue(record2.getR99_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR99_uk() != null) {
		    cell1.setCellValue(record2.getR99_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR99_europe() != null) {
		    cell1.setCellValue(record2.getR99_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR99_india() != null) {
		    cell1.setCellValue(record2.getR99_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR99_sydney() != null) {
		    cell1.setCellValue(record2.getR99_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR99_uganda() != null) {
		    cell1.setCellValue(record2.getR99_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR99_c10() != null) {
		    cell1.setCellValue(record2.getR99_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR99_c11() != null) {
		    cell1.setCellValue(record2.getR99_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR99_c12() != null) {
		    cell1.setCellValue(record2.getR99_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR99_c13() != null) {
		    cell1.setCellValue(record2.getR99_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR99_c14() != null) {
		    cell1.setCellValue(record2.getR99_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR99_c15() != null) {
		    cell1.setCellValue(record2.getR99_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR99_c16() != null) {
		    cell1.setCellValue(record2.getR99_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR99_total() != null) {
		    cell1.setCellValue(record2.getR99_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row100
		row = sheet.getRow(100);

		cell1 = row.createCell(1);
		if (record2.getR100_botswana() != null) {
		    cell1.setCellValue(record2.getR100_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR100_south_africa() != null) {
		    cell1.setCellValue(record2.getR100_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR100_sadc() != null) {
		    cell1.setCellValue(record2.getR100_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR100_usa() != null) {
		    cell1.setCellValue(record2.getR100_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR100_uk() != null) {
		    cell1.setCellValue(record2.getR100_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR100_europe() != null) {
		    cell1.setCellValue(record2.getR100_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR100_india() != null) {
		    cell1.setCellValue(record2.getR100_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR100_sydney() != null) {
		    cell1.setCellValue(record2.getR100_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR100_uganda() != null) {
		    cell1.setCellValue(record2.getR100_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR100_c10() != null) {
		    cell1.setCellValue(record2.getR100_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR100_c11() != null) {
		    cell1.setCellValue(record2.getR100_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR100_c12() != null) {
		    cell1.setCellValue(record2.getR100_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR100_c13() != null) {
		    cell1.setCellValue(record2.getR100_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR100_c14() != null) {
		    cell1.setCellValue(record2.getR100_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR100_c15() != null) {
		    cell1.setCellValue(record2.getR100_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR100_c16() != null) {
		    cell1.setCellValue(record2.getR100_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR100_total() != null) {
		    cell1.setCellValue(record2.getR100_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row101
		row = sheet.getRow(101);

		cell1 = row.createCell(1);
		if (record2.getR101_botswana() != null) {
		    cell1.setCellValue(record2.getR101_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR101_south_africa() != null) {
		    cell1.setCellValue(record2.getR101_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR101_sadc() != null) {
		    cell1.setCellValue(record2.getR101_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR101_usa() != null) {
		    cell1.setCellValue(record2.getR101_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR101_uk() != null) {
		    cell1.setCellValue(record2.getR101_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR101_europe() != null) {
		    cell1.setCellValue(record2.getR101_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR101_india() != null) {
		    cell1.setCellValue(record2.getR101_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR101_sydney() != null) {
		    cell1.setCellValue(record2.getR101_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR101_uganda() != null) {
		    cell1.setCellValue(record2.getR101_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR101_c10() != null) {
		    cell1.setCellValue(record2.getR101_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR101_c11() != null) {
		    cell1.setCellValue(record2.getR101_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR101_c12() != null) {
		    cell1.setCellValue(record2.getR101_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR101_c13() != null) {
		    cell1.setCellValue(record2.getR101_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR101_c14() != null) {
		    cell1.setCellValue(record2.getR101_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR101_c15() != null) {
		    cell1.setCellValue(record2.getR101_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR101_c16() != null) {
		    cell1.setCellValue(record2.getR101_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR101_total() != null) {
		    cell1.setCellValue(record2.getR101_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row102
		row = sheet.getRow(102);

		cell1 = row.createCell(1);
		if (record2.getR102_botswana() != null) {
		    cell1.setCellValue(record2.getR102_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR102_south_africa() != null) {
		    cell1.setCellValue(record2.getR102_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR102_sadc() != null) {
		    cell1.setCellValue(record2.getR102_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR102_usa() != null) {
		    cell1.setCellValue(record2.getR102_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR102_uk() != null) {
		    cell1.setCellValue(record2.getR102_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR102_europe() != null) {
		    cell1.setCellValue(record2.getR102_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR102_india() != null) {
		    cell1.setCellValue(record2.getR102_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR102_sydney() != null) {
		    cell1.setCellValue(record2.getR102_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR102_uganda() != null) {
		    cell1.setCellValue(record2.getR102_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR102_c10() != null) {
		    cell1.setCellValue(record2.getR102_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR102_c11() != null) {
		    cell1.setCellValue(record2.getR102_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR102_c12() != null) {
		    cell1.setCellValue(record2.getR102_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR102_c13() != null) {
		    cell1.setCellValue(record2.getR102_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR102_c14() != null) {
		    cell1.setCellValue(record2.getR102_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR102_c15() != null) {
		    cell1.setCellValue(record2.getR102_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR102_c16() != null) {
		    cell1.setCellValue(record2.getR102_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR102_total() != null) {
		    cell1.setCellValue(record2.getR102_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row103
		row = sheet.getRow(103);

		cell1 = row.createCell(1);
		if (record2.getR103_botswana() != null) {
		    cell1.setCellValue(record2.getR103_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR103_south_africa() != null) {
		    cell1.setCellValue(record2.getR103_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR103_sadc() != null) {
		    cell1.setCellValue(record2.getR103_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR103_usa() != null) {
		    cell1.setCellValue(record2.getR103_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR103_uk() != null) {
		    cell1.setCellValue(record2.getR103_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR103_europe() != null) {
		    cell1.setCellValue(record2.getR103_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR103_india() != null) {
		    cell1.setCellValue(record2.getR103_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR103_sydney() != null) {
		    cell1.setCellValue(record2.getR103_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR103_uganda() != null) {
		    cell1.setCellValue(record2.getR103_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR103_c10() != null) {
		    cell1.setCellValue(record2.getR103_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR103_c11() != null) {
		    cell1.setCellValue(record2.getR103_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR103_c12() != null) {
		    cell1.setCellValue(record2.getR103_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR103_c13() != null) {
		    cell1.setCellValue(record2.getR103_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR103_c14() != null) {
		    cell1.setCellValue(record2.getR103_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR103_c15() != null) {
		    cell1.setCellValue(record2.getR103_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR103_c16() != null) {
		    cell1.setCellValue(record2.getR103_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR103_total() != null) {
		    cell1.setCellValue(record2.getR103_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row104
		row = sheet.getRow(104);

		cell1 = row.createCell(1);
		if (record2.getR104_botswana() != null) {
		    cell1.setCellValue(record2.getR104_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR104_south_africa() != null) {
		    cell1.setCellValue(record2.getR104_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR104_sadc() != null) {
		    cell1.setCellValue(record2.getR104_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR104_usa() != null) {
		    cell1.setCellValue(record2.getR104_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR104_uk() != null) {
		    cell1.setCellValue(record2.getR104_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR104_europe() != null) {
		    cell1.setCellValue(record2.getR104_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR104_india() != null) {
		    cell1.setCellValue(record2.getR104_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR104_sydney() != null) {
		    cell1.setCellValue(record2.getR104_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR104_uganda() != null) {
		    cell1.setCellValue(record2.getR104_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR104_c10() != null) {
		    cell1.setCellValue(record2.getR104_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR104_c11() != null) {
		    cell1.setCellValue(record2.getR104_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR104_c12() != null) {
		    cell1.setCellValue(record2.getR104_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR104_c13() != null) {
		    cell1.setCellValue(record2.getR104_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR104_c14() != null) {
		    cell1.setCellValue(record2.getR104_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR104_c15() != null) {
		    cell1.setCellValue(record2.getR104_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR104_c16() != null) {
		    cell1.setCellValue(record2.getR104_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR104_total() != null) {
		    cell1.setCellValue(record2.getR104_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row105
		row = sheet.getRow(105);

		cell1 = row.createCell(1);
		if (record2.getR105_botswana() != null) {
		    cell1.setCellValue(record2.getR105_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR105_south_africa() != null) {
		    cell1.setCellValue(record2.getR105_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR105_sadc() != null) {
		    cell1.setCellValue(record2.getR105_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR105_usa() != null) {
		    cell1.setCellValue(record2.getR105_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR105_uk() != null) {
		    cell1.setCellValue(record2.getR105_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR105_europe() != null) {
		    cell1.setCellValue(record2.getR105_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR105_india() != null) {
		    cell1.setCellValue(record2.getR105_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR105_sydney() != null) {
		    cell1.setCellValue(record2.getR105_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR105_uganda() != null) {
		    cell1.setCellValue(record2.getR105_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR105_c10() != null) {
		    cell1.setCellValue(record2.getR105_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR105_c11() != null) {
		    cell1.setCellValue(record2.getR105_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR105_c12() != null) {
		    cell1.setCellValue(record2.getR105_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR105_c13() != null) {
		    cell1.setCellValue(record2.getR105_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR105_c14() != null) {
		    cell1.setCellValue(record2.getR105_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR105_c15() != null) {
		    cell1.setCellValue(record2.getR105_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR105_c16() != null) {
		    cell1.setCellValue(record2.getR105_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR105_total() != null) {
		    cell1.setCellValue(record2.getR105_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row106
		row = sheet.getRow(106);

		cell1 = row.createCell(1);
		if (record2.getR106_botswana() != null) {
		    cell1.setCellValue(record2.getR106_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR106_south_africa() != null) {
		    cell1.setCellValue(record2.getR106_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR106_sadc() != null) {
		    cell1.setCellValue(record2.getR106_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR106_usa() != null) {
		    cell1.setCellValue(record2.getR106_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR106_uk() != null) {
		    cell1.setCellValue(record2.getR106_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR106_europe() != null) {
		    cell1.setCellValue(record2.getR106_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR106_india() != null) {
		    cell1.setCellValue(record2.getR106_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR106_sydney() != null) {
		    cell1.setCellValue(record2.getR106_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR106_uganda() != null) {
		    cell1.setCellValue(record2.getR106_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR106_c10() != null) {
		    cell1.setCellValue(record2.getR106_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR106_c11() != null) {
		    cell1.setCellValue(record2.getR106_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR106_c12() != null) {
		    cell1.setCellValue(record2.getR106_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR106_c13() != null) {
		    cell1.setCellValue(record2.getR106_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR106_c14() != null) {
		    cell1.setCellValue(record2.getR106_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR106_c15() != null) {
		    cell1.setCellValue(record2.getR106_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR106_c16() != null) {
		    cell1.setCellValue(record2.getR106_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR106_total() != null) {
		    cell1.setCellValue(record2.getR106_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row107
		row = sheet.getRow(107);

		cell1 = row.createCell(1);
		if (record2.getR107_botswana() != null) {
		    cell1.setCellValue(record2.getR107_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR107_south_africa() != null) {
		    cell1.setCellValue(record2.getR107_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR107_sadc() != null) {
		    cell1.setCellValue(record2.getR107_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR107_usa() != null) {
		    cell1.setCellValue(record2.getR107_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR107_uk() != null) {
		    cell1.setCellValue(record2.getR107_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR107_europe() != null) {
		    cell1.setCellValue(record2.getR107_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR107_india() != null) {
		    cell1.setCellValue(record2.getR107_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR107_sydney() != null) {
		    cell1.setCellValue(record2.getR107_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR107_uganda() != null) {
		    cell1.setCellValue(record2.getR107_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR107_c10() != null) {
		    cell1.setCellValue(record2.getR107_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR107_c11() != null) {
		    cell1.setCellValue(record2.getR107_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR107_c12() != null) {
		    cell1.setCellValue(record2.getR107_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR107_c13() != null) {
		    cell1.setCellValue(record2.getR107_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR107_c14() != null) {
		    cell1.setCellValue(record2.getR107_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR107_c15() != null) {
		    cell1.setCellValue(record2.getR107_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR107_c16() != null) {
		    cell1.setCellValue(record2.getR107_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR107_total() != null) {
		    cell1.setCellValue(record2.getR107_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row108
		row = sheet.getRow(108);

		cell1 = row.createCell(1);
		if (record2.getR108_botswana() != null) {
		    cell1.setCellValue(record2.getR108_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR108_south_africa() != null) {
		    cell1.setCellValue(record2.getR108_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR108_sadc() != null) {
		    cell1.setCellValue(record2.getR108_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR108_usa() != null) {
		    cell1.setCellValue(record2.getR108_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR108_uk() != null) {
		    cell1.setCellValue(record2.getR108_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR108_europe() != null) {
		    cell1.setCellValue(record2.getR108_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR108_india() != null) {
		    cell1.setCellValue(record2.getR108_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR108_sydney() != null) {
		    cell1.setCellValue(record2.getR108_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR108_uganda() != null) {
		    cell1.setCellValue(record2.getR108_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR108_c10() != null) {
		    cell1.setCellValue(record2.getR108_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR108_c11() != null) {
		    cell1.setCellValue(record2.getR108_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR108_c12() != null) {
		    cell1.setCellValue(record2.getR108_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR108_c13() != null) {
		    cell1.setCellValue(record2.getR108_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR108_c14() != null) {
		    cell1.setCellValue(record2.getR108_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR108_c15() != null) {
		    cell1.setCellValue(record2.getR108_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR108_c16() != null) {
		    cell1.setCellValue(record2.getR108_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR108_total() != null) {
		    cell1.setCellValue(record2.getR108_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row109
		row = sheet.getRow(109);

		cell1 = row.createCell(1);
		if (record2.getR109_botswana() != null) {
		    cell1.setCellValue(record2.getR109_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR109_south_africa() != null) {
		    cell1.setCellValue(record2.getR109_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR109_sadc() != null) {
		    cell1.setCellValue(record2.getR109_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR109_usa() != null) {
		    cell1.setCellValue(record2.getR109_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR109_uk() != null) {
		    cell1.setCellValue(record2.getR109_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR109_europe() != null) {
		    cell1.setCellValue(record2.getR109_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR109_india() != null) {
		    cell1.setCellValue(record2.getR109_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR109_sydney() != null) {
		    cell1.setCellValue(record2.getR109_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR109_uganda() != null) {
		    cell1.setCellValue(record2.getR109_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR109_c10() != null) {
		    cell1.setCellValue(record2.getR109_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR109_c11() != null) {
		    cell1.setCellValue(record2.getR109_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR109_c12() != null) {
		    cell1.setCellValue(record2.getR109_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR109_c13() != null) {
		    cell1.setCellValue(record2.getR109_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR109_c14() != null) {
		    cell1.setCellValue(record2.getR109_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR109_c15() != null) {
		    cell1.setCellValue(record2.getR109_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR109_c16() != null) {
		    cell1.setCellValue(record2.getR109_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR109_total() != null) {
		    cell1.setCellValue(record2.getR109_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row110
		row = sheet.getRow(110);

		cell1 = row.createCell(1);
		if (record2.getR110_botswana() != null) {
		    cell1.setCellValue(record2.getR110_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR110_south_africa() != null) {
		    cell1.setCellValue(record2.getR110_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR110_sadc() != null) {
		    cell1.setCellValue(record2.getR110_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR110_usa() != null) {
		    cell1.setCellValue(record2.getR110_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR110_uk() != null) {
		    cell1.setCellValue(record2.getR110_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR110_europe() != null) {
		    cell1.setCellValue(record2.getR110_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR110_india() != null) {
		    cell1.setCellValue(record2.getR110_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR110_sydney() != null) {
		    cell1.setCellValue(record2.getR110_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR110_uganda() != null) {
		    cell1.setCellValue(record2.getR110_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR110_c10() != null) {
		    cell1.setCellValue(record2.getR110_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR110_c11() != null) {
		    cell1.setCellValue(record2.getR110_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR110_c12() != null) {
		    cell1.setCellValue(record2.getR110_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR110_c13() != null) {
		    cell1.setCellValue(record2.getR110_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR110_c14() != null) {
		    cell1.setCellValue(record2.getR110_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR110_c15() != null) {
		    cell1.setCellValue(record2.getR110_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR110_c16() != null) {
		    cell1.setCellValue(record2.getR110_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR110_total() != null) {
		    cell1.setCellValue(record2.getR110_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row111
		row = sheet.getRow(111);

		cell1 = row.createCell(1);
		if (record2.getR111_botswana() != null) {
		    cell1.setCellValue(record2.getR111_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR111_south_africa() != null) {
		    cell1.setCellValue(record2.getR111_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR111_sadc() != null) {
		    cell1.setCellValue(record2.getR111_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR111_usa() != null) {
		    cell1.setCellValue(record2.getR111_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR111_uk() != null) {
		    cell1.setCellValue(record2.getR111_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR111_europe() != null) {
		    cell1.setCellValue(record2.getR111_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR111_india() != null) {
		    cell1.setCellValue(record2.getR111_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR111_sydney() != null) {
		    cell1.setCellValue(record2.getR111_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR111_uganda() != null) {
		    cell1.setCellValue(record2.getR111_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR111_c10() != null) {
		    cell1.setCellValue(record2.getR111_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR111_c11() != null) {
		    cell1.setCellValue(record2.getR111_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR111_c12() != null) {
		    cell1.setCellValue(record2.getR111_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR111_c13() != null) {
		    cell1.setCellValue(record2.getR111_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR111_c14() != null) {
		    cell1.setCellValue(record2.getR111_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR111_c15() != null) {
		    cell1.setCellValue(record2.getR111_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR111_c16() != null) {
		    cell1.setCellValue(record2.getR111_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR111_total() != null) {
		    cell1.setCellValue(record2.getR111_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row112
		row = sheet.getRow(112);

		cell1 = row.createCell(1);
		if (record2.getR112_botswana() != null) {
		    cell1.setCellValue(record2.getR112_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR112_south_africa() != null) {
		    cell1.setCellValue(record2.getR112_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR112_sadc() != null) {
		    cell1.setCellValue(record2.getR112_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR112_usa() != null) {
		    cell1.setCellValue(record2.getR112_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR112_uk() != null) {
		    cell1.setCellValue(record2.getR112_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR112_europe() != null) {
		    cell1.setCellValue(record2.getR112_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR112_india() != null) {
		    cell1.setCellValue(record2.getR112_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR112_sydney() != null) {
		    cell1.setCellValue(record2.getR112_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR112_uganda() != null) {
		    cell1.setCellValue(record2.getR112_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR112_c10() != null) {
		    cell1.setCellValue(record2.getR112_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR112_c11() != null) {
		    cell1.setCellValue(record2.getR112_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR112_c12() != null) {
		    cell1.setCellValue(record2.getR112_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR112_c13() != null) {
		    cell1.setCellValue(record2.getR112_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR112_c14() != null) {
		    cell1.setCellValue(record2.getR112_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR112_c15() != null) {
		    cell1.setCellValue(record2.getR112_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR112_c16() != null) {
		    cell1.setCellValue(record2.getR112_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR112_total() != null) {
		    cell1.setCellValue(record2.getR112_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row113
		row = sheet.getRow(113);

		cell1 = row.createCell(1);
		if (record2.getR113_botswana() != null) {
		    cell1.setCellValue(record2.getR113_botswana().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(2);
		if (record2.getR113_south_africa() != null) {
		    cell1.setCellValue(record2.getR113_south_africa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(3);
		if (record2.getR113_sadc() != null) {
		    cell1.setCellValue(record2.getR113_sadc().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(4);
		if (record2.getR113_usa() != null) {
		    cell1.setCellValue(record2.getR113_usa().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(5);
		if (record2.getR113_uk() != null) {
		    cell1.setCellValue(record2.getR113_uk().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(6);
		if (record2.getR113_europe() != null) {
		    cell1.setCellValue(record2.getR113_europe().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(7);
		if (record2.getR113_india() != null) {
		    cell1.setCellValue(record2.getR113_india().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(8);
		if (record2.getR113_sydney() != null) {
		    cell1.setCellValue(record2.getR113_sydney().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(9);
		if (record2.getR113_uganda() != null) {
		    cell1.setCellValue(record2.getR113_uganda().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(10);
		if (record2.getR113_c10() != null) {
		    cell1.setCellValue(record2.getR113_c10().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(11);
		if (record2.getR113_c11() != null) {
		    cell1.setCellValue(record2.getR113_c11().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(12);
		if (record2.getR113_c12() != null) {
		    cell1.setCellValue(record2.getR113_c12().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(13);
		if (record2.getR113_c13() != null) {
		    cell1.setCellValue(record2.getR113_c13().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(14);
		if (record2.getR113_c14() != null) {
		    cell1.setCellValue(record2.getR113_c14().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(15);
		if (record2.getR113_c15() != null) {
		    cell1.setCellValue(record2.getR113_c15().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(16);
		if (record2.getR113_c16() != null) {
		    cell1.setCellValue(record2.getR113_c16().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 = row.createCell(17);
		if (record2.getR113_total() != null) {
		    cell1.setCellValue(record2.getR113_total().doubleValue());
		    cell1.setCellStyle(numberStyle);
		} else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		
		
		
	}

	public byte[] getM_GALORExcel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype,String type,String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");
		// ARCHIVAL check
				
				// ARCHIVAL check
						if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
							logger.info("Service: Generating ARCHIVAL report for version {}", version);
							return getExcelM_GALORARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
						}
				List<M_GALOR_Summary_Entity1> dataList =M_GALOR_Summary1_Repo.getdatabydateList(dateformat.parse(todate)) ;
				List<M_GALOR_Summary_Entity2> dataList1=M_GALOR_Summary2_Repo.getdatabydateList(dateformat.parse(todate)) ;

				if (dataList.isEmpty()) {
					logger.warn("Service: No data found for M_GALOR report. Returning empty result.");
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

							M_GALOR_Summary_Entity1 record = dataList.get(i);
							M_GALOR_Summary_Entity2 record2 = dataList1.get(i);
							System.out.println("rownumber=" + startRow + i);
							Row row = sheet.getRow(startRow + i);
							if (row == null) {
								row = sheet.createRow(startRow + i);
							}

							//row9
							// Column b 1
							Cell cell1 = row.getCell(1);
							if (record.getR9_botswana() != null) {
								cell1.setCellValue(record.getR9_botswana().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}
							cell1 = row.getCell(2);
							if (record.getR9_south_africa() != null) {
								cell1.setCellValue(record.getR9_south_africa().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}
							cell1 = row.getCell(3);
							if (record.getR9_sadc() != null) {
								cell1.setCellValue(record.getR9_sadc().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}
							cell1 = row.getCell(4);
							if (record.getR9_usa() != null) {
								cell1.setCellValue(record.getR9_usa().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}
							cell1 = row.getCell(5);
							if (record.getR9_uk() != null) {
								cell1.setCellValue(record.getR9_uk().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}
							cell1 = row.getCell(6);
							if (record.getR9_europe() != null) {
								cell1.setCellValue(record.getR9_europe().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR9_india() != null) {
								cell1.setCellValue(record.getR9_india().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR9_sydney() != null) {
								cell1.setCellValue(record.getR9_sydney().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR9_uganda() != null) {
								cell1.setCellValue(record.getR9_uganda().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR9_c10() != null) {
								cell1.setCellValue(record.getR9_c10().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR9_c11() != null) {
								cell1.setCellValue(record.getR9_c11().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}			

							cell1 = row.getCell(12);
							if (record.getR9_c12() != null) {
								cell1.setCellValue(record.getR9_c12().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}			
							cell1 = row.getCell(13);
							if (record.getR9_c13() != null) {
								cell1.setCellValue(record.getR9_c13().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}		
							cell1 = row.getCell(14);
							if (record.getR9_c14() != null) {
								cell1.setCellValue(record.getR9_c14().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}		
							cell1 = row.getCell(15);
							if (record.getR9_c15() != null) {
								cell1.setCellValue(record.getR9_c15().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}					
							cell1 = row.getCell(16);
							if (record.getR9_c16() != null) {
								cell1.setCellValue(record.getR9_c16().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}									
							cell1 = row.getCell(17);
							if (record.getR9_total() != null) {
								cell1.setCellValue(record.getR9_total().doubleValue());
								cell1.setCellStyle(numberStyle);
							} else {
								cell1.setCellValue("");
								cell1.setCellStyle(textStyle);
							}				
							row = sheet.getRow(10);
							//row10
							// Column b 1
							cell1 = row.getCell(1);
							if (record.getR10_botswana() != null) {
							    cell1.setCellValue(record.getR10_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR10_south_africa() != null) {
							    cell1.setCellValue(record.getR10_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR10_sadc() != null) {
							    cell1.setCellValue(record.getR10_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR10_usa() != null) {
							    cell1.setCellValue(record.getR10_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR10_uk() != null) {
							    cell1.setCellValue(record.getR10_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR10_europe() != null) {
							    cell1.setCellValue(record.getR10_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR10_india() != null) {
							    cell1.setCellValue(record.getR10_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR10_sydney() != null) {
							    cell1.setCellValue(record.getR10_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR10_uganda() != null) {
							    cell1.setCellValue(record.getR10_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR10_c10() != null) {
							    cell1.setCellValue(record.getR10_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR10_c11() != null) {
							    cell1.setCellValue(record.getR10_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR10_c12() != null) {
							    cell1.setCellValue(record.getR10_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR10_c13() != null) {
							    cell1.setCellValue(record.getR10_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR10_c14() != null) {
							    cell1.setCellValue(record.getR10_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR10_c15() != null) {
							    cell1.setCellValue(record.getR10_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR10_c16() != null) {
							    cell1.setCellValue(record.getR10_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR10_total() != null) {
							    cell1.setCellValue(record.getR10_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
							//row11
							// Column b 1
							row = sheet.getRow(11);
							cell1 = row.getCell(1);
							if (record.getR11_botswana() != null) {
							    cell1.setCellValue(record.getR11_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR11_south_africa() != null) {
							    cell1.setCellValue(record.getR11_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR11_sadc() != null) {
							    cell1.setCellValue(record.getR11_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR11_usa() != null) {
							    cell1.setCellValue(record.getR11_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR11_uk() != null) {
							    cell1.setCellValue(record.getR11_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR11_europe() != null) {
							    cell1.setCellValue(record.getR11_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR11_india() != null) {
							    cell1.setCellValue(record.getR11_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR11_sydney() != null) {
							    cell1.setCellValue(record.getR11_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR11_uganda() != null) {
							    cell1.setCellValue(record.getR11_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR11_c10() != null) {
							    cell1.setCellValue(record.getR11_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR11_c11() != null) {
							    cell1.setCellValue(record.getR11_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR11_c12() != null) {
							    cell1.setCellValue(record.getR11_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR11_c13() != null) {
							    cell1.setCellValue(record.getR11_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR11_c14() != null) {
							    cell1.setCellValue(record.getR11_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR11_c15() != null) {
							    cell1.setCellValue(record.getR11_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR11_c16() != null) {
							    cell1.setCellValue(record.getR11_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR11_total() != null) {
							    cell1.setCellValue(record.getR11_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW12
							row = sheet.getRow(12);
							cell1 = row.getCell(1);
							if (record.getR12_botswana() != null) {
							    cell1.setCellValue(record.getR12_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR12_south_africa() != null) {
							    cell1.setCellValue(record.getR12_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR12_sadc() != null) {
							    cell1.setCellValue(record.getR12_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR12_usa() != null) {
							    cell1.setCellValue(record.getR12_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR12_uk() != null) {
							    cell1.setCellValue(record.getR12_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR12_europe() != null) {
							    cell1.setCellValue(record.getR12_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR12_india() != null) {
							    cell1.setCellValue(record.getR12_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR12_sydney() != null) {
							    cell1.setCellValue(record.getR12_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR12_uganda() != null) {
							    cell1.setCellValue(record.getR12_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR12_c10() != null) {
							    cell1.setCellValue(record.getR12_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR12_c11() != null) {
							    cell1.setCellValue(record.getR12_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR12_c12() != null) {
							    cell1.setCellValue(record.getR12_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR12_c13() != null) {
							    cell1.setCellValue(record.getR12_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR12_c14() != null) {
							    cell1.setCellValue(record.getR12_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR12_c15() != null) {
							    cell1.setCellValue(record.getR12_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR12_c16() != null) {
							    cell1.setCellValue(record.getR12_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR12_total() != null) {
							    cell1.setCellValue(record.getR12_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW13
							row = sheet.getRow(13);
							cell1 = row.getCell(1);
							if (record.getR13_botswana() != null) {
							    cell1.setCellValue(record.getR13_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR13_south_africa() != null) {
							    cell1.setCellValue(record.getR13_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR13_sadc() != null) {
							    cell1.setCellValue(record.getR13_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR13_usa() != null) {
							    cell1.setCellValue(record.getR13_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR13_uk() != null) {
							    cell1.setCellValue(record.getR13_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR13_europe() != null) {
							    cell1.setCellValue(record.getR13_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR13_india() != null) {
							    cell1.setCellValue(record.getR13_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR13_sydney() != null) {
							    cell1.setCellValue(record.getR13_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR13_uganda() != null) {
							    cell1.setCellValue(record.getR13_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR13_c10() != null) {
							    cell1.setCellValue(record.getR13_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR13_c11() != null) {
							    cell1.setCellValue(record.getR13_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR13_c12() != null) {
							    cell1.setCellValue(record.getR13_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR13_c13() != null) {
							    cell1.setCellValue(record.getR13_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR13_c14() != null) {
							    cell1.setCellValue(record.getR13_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR13_c15() != null) {
							    cell1.setCellValue(record.getR13_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR13_c16() != null) {
							    cell1.setCellValue(record.getR13_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR13_total() != null) {
							    cell1.setCellValue(record.getR13_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW14
							row = sheet.getRow(14);
							cell1 = row.getCell(1);
							if (record.getR14_botswana() != null) {
							    cell1.setCellValue(record.getR14_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR14_south_africa() != null) {
							    cell1.setCellValue(record.getR14_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR14_sadc() != null) {
							    cell1.setCellValue(record.getR14_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR14_usa() != null) {
							    cell1.setCellValue(record.getR14_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR14_uk() != null) {
							    cell1.setCellValue(record.getR14_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR14_europe() != null) {
							    cell1.setCellValue(record.getR14_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR14_india() != null) {
							    cell1.setCellValue(record.getR14_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR14_sydney() != null) {
							    cell1.setCellValue(record.getR14_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR14_uganda() != null) {
							    cell1.setCellValue(record.getR14_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR14_c10() != null) {
							    cell1.setCellValue(record.getR14_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR14_c11() != null) {
							    cell1.setCellValue(record.getR14_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR14_c12() != null) {
							    cell1.setCellValue(record.getR14_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR14_c13() != null) {
							    cell1.setCellValue(record.getR14_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR14_c14() != null) {
							    cell1.setCellValue(record.getR14_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR14_c15() != null) {
							    cell1.setCellValue(record.getR14_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR14_c16() != null) {
							    cell1.setCellValue(record.getR14_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR14_total() != null) {
							    cell1.setCellValue(record.getR14_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW15
							row = sheet.getRow(15);
							cell1 = row.getCell(1);
							if (record.getR15_botswana() != null) {
							    cell1.setCellValue(record.getR15_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR15_south_africa() != null) {
							    cell1.setCellValue(record.getR15_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR15_sadc() != null) {
							    cell1.setCellValue(record.getR15_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR15_usa() != null) {
							    cell1.setCellValue(record.getR15_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR15_uk() != null) {
							    cell1.setCellValue(record.getR15_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR15_europe() != null) {
							    cell1.setCellValue(record.getR15_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR15_india() != null) {
							    cell1.setCellValue(record.getR15_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR15_sydney() != null) {
							    cell1.setCellValue(record.getR15_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR15_uganda() != null) {
							    cell1.setCellValue(record.getR15_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR15_c10() != null) {
							    cell1.setCellValue(record.getR15_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR15_c11() != null) {
							    cell1.setCellValue(record.getR15_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR15_c12() != null) {
							    cell1.setCellValue(record.getR15_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR15_c13() != null) {
							    cell1.setCellValue(record.getR15_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR15_c14() != null) {
							    cell1.setCellValue(record.getR15_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR15_c15() != null) {
							    cell1.setCellValue(record.getR15_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR15_c16() != null) {
							    cell1.setCellValue(record.getR15_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR15_total() != null) {
							    cell1.setCellValue(record.getR15_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW16
							row = sheet.getRow(16);
							cell1 = row.getCell(1);
							if (record.getR16_botswana() != null) {
							    cell1.setCellValue(record.getR16_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR16_south_africa() != null) {
							    cell1.setCellValue(record.getR16_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR16_sadc() != null) {
							    cell1.setCellValue(record.getR16_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR16_usa() != null) {
							    cell1.setCellValue(record.getR16_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR16_uk() != null) {
							    cell1.setCellValue(record.getR16_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR16_europe() != null) {
							    cell1.setCellValue(record.getR16_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR16_india() != null) {
							    cell1.setCellValue(record.getR16_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR16_sydney() != null) {
							    cell1.setCellValue(record.getR16_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR16_uganda() != null) {
							    cell1.setCellValue(record.getR16_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR16_c10() != null) {
							    cell1.setCellValue(record.getR16_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR16_c11() != null) {
							    cell1.setCellValue(record.getR16_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR16_c12() != null) {
							    cell1.setCellValue(record.getR16_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR16_c13() != null) {
							    cell1.setCellValue(record.getR16_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR16_c14() != null) {
							    cell1.setCellValue(record.getR16_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR16_c15() != null) {
							    cell1.setCellValue(record.getR16_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR16_c16() != null) {
							    cell1.setCellValue(record.getR16_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR16_total() != null) {
							    cell1.setCellValue(record.getR16_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//17
							row = sheet.getRow(17);
							cell1 = row.getCell(1);
							if (record.getR17_botswana() != null) {
							    cell1.setCellValue(record.getR17_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR17_south_africa() != null) {
							    cell1.setCellValue(record.getR17_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR17_sadc() != null) {
							    cell1.setCellValue(record.getR17_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR17_usa() != null) {
							    cell1.setCellValue(record.getR17_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR17_uk() != null) {
							    cell1.setCellValue(record.getR17_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR17_europe() != null) {
							    cell1.setCellValue(record.getR17_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR17_india() != null) {
							    cell1.setCellValue(record.getR17_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR17_sydney() != null) {
							    cell1.setCellValue(record.getR17_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR17_uganda() != null) {
							    cell1.setCellValue(record.getR17_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR17_c10() != null) {
							    cell1.setCellValue(record.getR17_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR17_c11() != null) {
							    cell1.setCellValue(record.getR17_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR17_c12() != null) {
							    cell1.setCellValue(record.getR17_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR17_c13() != null) {
							    cell1.setCellValue(record.getR17_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR17_c14() != null) {
							    cell1.setCellValue(record.getR17_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR17_c15() != null) {
							    cell1.setCellValue(record.getR17_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR17_c16() != null) {
							    cell1.setCellValue(record.getR17_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR17_total() != null) {
							    cell1.setCellValue(record.getR17_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//18
							row = sheet.getRow(18);
							cell1 = row.getCell(1);
							if (record.getR18_botswana() != null) {
							    cell1.setCellValue(record.getR18_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR18_south_africa() != null) {
							    cell1.setCellValue(record.getR18_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR18_sadc() != null) {
							    cell1.setCellValue(record.getR18_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR18_usa() != null) {
							    cell1.setCellValue(record.getR18_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR18_uk() != null) {
							    cell1.setCellValue(record.getR18_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR18_europe() != null) {
							    cell1.setCellValue(record.getR18_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR18_india() != null) {
							    cell1.setCellValue(record.getR18_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR18_sydney() != null) {
							    cell1.setCellValue(record.getR18_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR18_uganda() != null) {
							    cell1.setCellValue(record.getR18_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR18_c10() != null) {
							    cell1.setCellValue(record.getR18_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR18_c11() != null) {
							    cell1.setCellValue(record.getR18_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR18_c12() != null) {
							    cell1.setCellValue(record.getR18_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR18_c13() != null) {
							    cell1.setCellValue(record.getR18_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR18_c14() != null) {
							    cell1.setCellValue(record.getR18_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR18_c15() != null) {
							    cell1.setCellValue(record.getR18_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR18_c16() != null) {
							    cell1.setCellValue(record.getR18_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR18_total() != null) {
							    cell1.setCellValue(record.getR18_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW19
							row = sheet.getRow(19);
							cell1 = row.getCell(1);
							if (record.getR19_botswana() != null) {
							    cell1.setCellValue(record.getR19_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR19_south_africa() != null) {
							    cell1.setCellValue(record.getR19_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR19_sadc() != null) {
							    cell1.setCellValue(record.getR19_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR19_usa() != null) {
							    cell1.setCellValue(record.getR19_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR19_uk() != null) {
							    cell1.setCellValue(record.getR19_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR19_europe() != null) {
							    cell1.setCellValue(record.getR19_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR19_india() != null) {
							    cell1.setCellValue(record.getR19_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR19_sydney() != null) {
							    cell1.setCellValue(record.getR19_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR19_uganda() != null) {
							    cell1.setCellValue(record.getR19_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR19_c10() != null) {
							    cell1.setCellValue(record.getR19_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR19_c11() != null) {
							    cell1.setCellValue(record.getR19_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR19_c12() != null) {
							    cell1.setCellValue(record.getR19_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR19_c13() != null) {
							    cell1.setCellValue(record.getR19_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR19_c14() != null) {
							    cell1.setCellValue(record.getR19_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR19_c15() != null) {
							    cell1.setCellValue(record.getR19_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR19_c16() != null) {
							    cell1.setCellValue(record.getR19_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR19_total() != null) {
							    cell1.setCellValue(record.getR19_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW20
							row = sheet.getRow(20);
							cell1 = row.getCell(1);
							if (record.getR20_botswana() != null) {
							    cell1.setCellValue(record.getR20_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR20_south_africa() != null) {
							    cell1.setCellValue(record.getR20_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR20_sadc() != null) {
							    cell1.setCellValue(record.getR20_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR20_usa() != null) {
							    cell1.setCellValue(record.getR20_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR20_uk() != null) {
							    cell1.setCellValue(record.getR20_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR20_europe() != null) {
							    cell1.setCellValue(record.getR20_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR20_india() != null) {
							    cell1.setCellValue(record.getR20_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR20_sydney() != null) {
							    cell1.setCellValue(record.getR20_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR20_uganda() != null) {
							    cell1.setCellValue(record.getR20_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR20_c10() != null) {
							    cell1.setCellValue(record.getR20_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR20_c11() != null) {
							    cell1.setCellValue(record.getR20_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR20_c12() != null) {
							    cell1.setCellValue(record.getR20_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR20_c13() != null) {
							    cell1.setCellValue(record.getR20_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR20_c14() != null) {
							    cell1.setCellValue(record.getR20_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR20_c15() != null) {
							    cell1.setCellValue(record.getR20_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR20_c16() != null) {
							    cell1.setCellValue(record.getR20_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR20_total() != null) {
							    cell1.setCellValue(record.getR20_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW21
							row = sheet.getRow(21);
							cell1 = row.getCell(1);
							if (record.getR21_botswana() != null) {
							    cell1.setCellValue(record.getR21_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR21_south_africa() != null) {
							    cell1.setCellValue(record.getR21_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR21_sadc() != null) {
							    cell1.setCellValue(record.getR21_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR21_usa() != null) {
							    cell1.setCellValue(record.getR21_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR21_uk() != null) {
							    cell1.setCellValue(record.getR21_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR21_europe() != null) {
							    cell1.setCellValue(record.getR21_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR21_india() != null) {
							    cell1.setCellValue(record.getR21_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR21_sydney() != null) {
							    cell1.setCellValue(record.getR21_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR21_uganda() != null) {
							    cell1.setCellValue(record.getR21_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR21_c10() != null) {
							    cell1.setCellValue(record.getR21_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR21_c11() != null) {
							    cell1.setCellValue(record.getR21_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR21_c12() != null) {
							    cell1.setCellValue(record.getR21_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR21_c13() != null) {
							    cell1.setCellValue(record.getR21_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR21_c14() != null) {
							    cell1.setCellValue(record.getR21_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR21_c15() != null) {
							    cell1.setCellValue(record.getR21_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR21_c16() != null) {
							    cell1.setCellValue(record.getR21_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR21_total() != null) {
							    cell1.setCellValue(record.getR21_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW22
							row = sheet.getRow(22);
							cell1 = row.getCell(1);
							if (record.getR22_botswana() != null) {
							    cell1.setCellValue(record.getR22_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR22_south_africa() != null) {
							    cell1.setCellValue(record.getR22_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR22_sadc() != null) {
							    cell1.setCellValue(record.getR22_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR22_usa() != null) {
							    cell1.setCellValue(record.getR22_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR22_uk() != null) {
							    cell1.setCellValue(record.getR22_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR22_europe() != null) {
							    cell1.setCellValue(record.getR22_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR22_india() != null) {
							    cell1.setCellValue(record.getR22_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR22_sydney() != null) {
							    cell1.setCellValue(record.getR22_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR22_uganda() != null) {
							    cell1.setCellValue(record.getR22_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR22_c10() != null) {
							    cell1.setCellValue(record.getR22_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR22_c11() != null) {
							    cell1.setCellValue(record.getR22_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR22_c12() != null) {
							    cell1.setCellValue(record.getR22_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR22_c13() != null) {
							    cell1.setCellValue(record.getR22_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR22_c14() != null) {
							    cell1.setCellValue(record.getR22_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR22_c15() != null) {
							    cell1.setCellValue(record.getR22_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR22_c16() != null) {
							    cell1.setCellValue(record.getR22_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR22_total() != null) {
							    cell1.setCellValue(record.getR22_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW23
							row = sheet.getRow(23);
							cell1 = row.getCell(1);
							if (record.getR23_botswana() != null) {
							    cell1.setCellValue(record.getR23_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR23_south_africa() != null) {
							    cell1.setCellValue(record.getR23_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR23_sadc() != null) {
							    cell1.setCellValue(record.getR23_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR23_usa() != null) {
							    cell1.setCellValue(record.getR23_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR23_uk() != null) {
							    cell1.setCellValue(record.getR23_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR23_europe() != null) {
							    cell1.setCellValue(record.getR23_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR23_india() != null) {
							    cell1.setCellValue(record.getR23_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR23_sydney() != null) {
							    cell1.setCellValue(record.getR23_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR23_uganda() != null) {
							    cell1.setCellValue(record.getR23_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR23_c10() != null) {
							    cell1.setCellValue(record.getR23_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR23_c11() != null) {
							    cell1.setCellValue(record.getR23_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR23_c12() != null) {
							    cell1.setCellValue(record.getR23_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR23_c13() != null) {
							    cell1.setCellValue(record.getR23_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR23_c14() != null) {
							    cell1.setCellValue(record.getR23_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR23_c15() != null) {
							    cell1.setCellValue(record.getR23_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR23_c16() != null) {
							    cell1.setCellValue(record.getR23_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR23_total() != null) {
							    cell1.setCellValue(record.getR23_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW24
							row = sheet.getRow(24);
							cell1 = row.getCell(1);
							if (record.getR24_botswana() != null) {
							    cell1.setCellValue(record.getR24_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR24_south_africa() != null) {
							    cell1.setCellValue(record.getR24_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR24_sadc() != null) {
							    cell1.setCellValue(record.getR24_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR24_usa() != null) {
							    cell1.setCellValue(record.getR24_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR24_uk() != null) {
							    cell1.setCellValue(record.getR24_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR24_europe() != null) {
							    cell1.setCellValue(record.getR24_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR24_india() != null) {
							    cell1.setCellValue(record.getR24_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR24_sydney() != null) {
							    cell1.setCellValue(record.getR24_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR24_uganda() != null) {
							    cell1.setCellValue(record.getR24_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR24_c10() != null) {
							    cell1.setCellValue(record.getR24_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR24_c11() != null) {
							    cell1.setCellValue(record.getR24_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR24_c12() != null) {
							    cell1.setCellValue(record.getR24_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR24_c13() != null) {
							    cell1.setCellValue(record.getR24_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR24_c14() != null) {
							    cell1.setCellValue(record.getR24_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR24_c15() != null) {
							    cell1.setCellValue(record.getR24_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR24_c16() != null) {
							    cell1.setCellValue(record.getR24_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR24_total() != null) {
							    cell1.setCellValue(record.getR24_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW25
							row = sheet.getRow(25);
							cell1 = row.getCell(1);
							if (record.getR25_botswana() != null) {
							    cell1.setCellValue(record.getR25_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR25_south_africa() != null) {
							    cell1.setCellValue(record.getR25_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR25_sadc() != null) {
							    cell1.setCellValue(record.getR25_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR25_usa() != null) {
							    cell1.setCellValue(record.getR25_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR25_uk() != null) {
							    cell1.setCellValue(record.getR25_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR25_europe() != null) {
							    cell1.setCellValue(record.getR25_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR25_india() != null) {
							    cell1.setCellValue(record.getR25_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR25_sydney() != null) {
							    cell1.setCellValue(record.getR25_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR25_uganda() != null) {
							    cell1.setCellValue(record.getR25_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR25_c10() != null) {
							    cell1.setCellValue(record.getR25_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR25_c11() != null) {
							    cell1.setCellValue(record.getR25_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR25_c12() != null) {
							    cell1.setCellValue(record.getR25_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR25_c13() != null) {
							    cell1.setCellValue(record.getR25_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR25_c14() != null) {
							    cell1.setCellValue(record.getR25_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR25_c15() != null) {
							    cell1.setCellValue(record.getR25_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR25_c16() != null) {
							    cell1.setCellValue(record.getR25_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR25_total() != null) {
							    cell1.setCellValue(record.getR25_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW26
							row = sheet.getRow(26);
							cell1 = row.getCell(1);
							if (record.getR26_botswana() != null) {
							    cell1.setCellValue(record.getR26_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR26_south_africa() != null) {
							    cell1.setCellValue(record.getR26_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR26_sadc() != null) {
							    cell1.setCellValue(record.getR26_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR26_usa() != null) {
							    cell1.setCellValue(record.getR26_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR26_uk() != null) {
							    cell1.setCellValue(record.getR26_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR26_europe() != null) {
							    cell1.setCellValue(record.getR26_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR26_india() != null) {
							    cell1.setCellValue(record.getR26_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR26_sydney() != null) {
							    cell1.setCellValue(record.getR26_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR26_uganda() != null) {
							    cell1.setCellValue(record.getR26_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR26_c10() != null) {
							    cell1.setCellValue(record.getR26_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR26_c11() != null) {
							    cell1.setCellValue(record.getR26_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR26_c12() != null) {
							    cell1.setCellValue(record.getR26_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR26_c13() != null) {
							    cell1.setCellValue(record.getR26_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR26_c14() != null) {
							    cell1.setCellValue(record.getR26_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR26_c15() != null) {
							    cell1.setCellValue(record.getR26_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR26_c16() != null) {
							    cell1.setCellValue(record.getR26_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR26_total() != null) {
							    cell1.setCellValue(record.getR26_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW27
							row = sheet.getRow(27);
							cell1 = row.getCell(1);
							if (record.getR27_botswana() != null) {
							    cell1.setCellValue(record.getR27_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR27_south_africa() != null) {
							    cell1.setCellValue(record.getR27_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR27_sadc() != null) {
							    cell1.setCellValue(record.getR27_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR27_usa() != null) {
							    cell1.setCellValue(record.getR27_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR27_uk() != null) {
							    cell1.setCellValue(record.getR27_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR27_europe() != null) {
							    cell1.setCellValue(record.getR27_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR27_india() != null) {
							    cell1.setCellValue(record.getR27_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR27_sydney() != null) {
							    cell1.setCellValue(record.getR27_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR27_uganda() != null) {
							    cell1.setCellValue(record.getR27_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR27_c10() != null) {
							    cell1.setCellValue(record.getR27_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR27_c11() != null) {
							    cell1.setCellValue(record.getR27_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR27_c12() != null) {
							    cell1.setCellValue(record.getR27_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR27_c13() != null) {
							    cell1.setCellValue(record.getR27_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR27_c14() != null) {
							    cell1.setCellValue(record.getR27_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR27_c15() != null) {
							    cell1.setCellValue(record.getR27_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR27_c16() != null) {
							    cell1.setCellValue(record.getR27_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR27_total() != null) {
							    cell1.setCellValue(record.getR27_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW28
							row = sheet.getRow(28);
							cell1 = row.getCell(1);
							if (record.getR28_botswana() != null) {
							    cell1.setCellValue(record.getR28_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR28_south_africa() != null) {
							    cell1.setCellValue(record.getR28_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR28_sadc() != null) {
							    cell1.setCellValue(record.getR28_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR28_usa() != null) {
							    cell1.setCellValue(record.getR28_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR28_uk() != null) {
							    cell1.setCellValue(record.getR28_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR28_europe() != null) {
							    cell1.setCellValue(record.getR28_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR28_india() != null) {
							    cell1.setCellValue(record.getR28_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR28_sydney() != null) {
							    cell1.setCellValue(record.getR28_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR28_uganda() != null) {
							    cell1.setCellValue(record.getR28_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR28_c10() != null) {
							    cell1.setCellValue(record.getR28_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR28_c11() != null) {
							    cell1.setCellValue(record.getR28_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR28_c12() != null) {
							    cell1.setCellValue(record.getR28_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR28_c13() != null) {
							    cell1.setCellValue(record.getR28_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR28_c14() != null) {
							    cell1.setCellValue(record.getR28_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR28_c15() != null) {
							    cell1.setCellValue(record.getR28_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR28_c16() != null) {
							    cell1.setCellValue(record.getR28_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR28_total() != null) {
							    cell1.setCellValue(record.getR28_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW29
							row = sheet.getRow(29);
							cell1 = row.getCell(1);
							if (record.getR29_botswana() != null) {
							    cell1.setCellValue(record.getR29_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR29_south_africa() != null) {
							    cell1.setCellValue(record.getR29_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR29_sadc() != null) {
							    cell1.setCellValue(record.getR29_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR29_usa() != null) {
							    cell1.setCellValue(record.getR29_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR29_uk() != null) {
							    cell1.setCellValue(record.getR29_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR29_europe() != null) {
							    cell1.setCellValue(record.getR29_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR29_india() != null) {
							    cell1.setCellValue(record.getR29_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR29_sydney() != null) {
							    cell1.setCellValue(record.getR29_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR29_uganda() != null) {
							    cell1.setCellValue(record.getR29_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR29_c10() != null) {
							    cell1.setCellValue(record.getR29_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR29_c11() != null) {
							    cell1.setCellValue(record.getR29_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR29_c12() != null) {
							    cell1.setCellValue(record.getR29_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR29_c13() != null) {
							    cell1.setCellValue(record.getR29_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR29_c14() != null) {
							    cell1.setCellValue(record.getR29_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR29_c15() != null) {
							    cell1.setCellValue(record.getR29_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR29_c16() != null) {
							    cell1.setCellValue(record.getR29_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR29_total() != null) {
							    cell1.setCellValue(record.getR29_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW30
							row = sheet.getRow(30);
							cell1 = row.getCell(1);
							if (record.getR30_botswana() != null) {
							    cell1.setCellValue(record.getR30_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR30_south_africa() != null) {
							    cell1.setCellValue(record.getR30_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR30_sadc() != null) {
							    cell1.setCellValue(record.getR30_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR30_usa() != null) {
							    cell1.setCellValue(record.getR30_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR30_uk() != null) {
							    cell1.setCellValue(record.getR30_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR30_europe() != null) {
							    cell1.setCellValue(record.getR30_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR30_india() != null) {
							    cell1.setCellValue(record.getR30_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR30_sydney() != null) {
							    cell1.setCellValue(record.getR30_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR30_uganda() != null) {
							    cell1.setCellValue(record.getR30_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR30_c10() != null) {
							    cell1.setCellValue(record.getR30_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR30_c11() != null) {
							    cell1.setCellValue(record.getR30_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR30_c12() != null) {
							    cell1.setCellValue(record.getR30_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR30_c13() != null) {
							    cell1.setCellValue(record.getR30_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR30_c14() != null) {
							    cell1.setCellValue(record.getR30_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR30_c15() != null) {
							    cell1.setCellValue(record.getR30_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR30_c16() != null) {
							    cell1.setCellValue(record.getR30_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR30_total() != null) {
							    cell1.setCellValue(record.getR30_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW31
							row = sheet.getRow(31);
							cell1 = row.getCell(1);
							if (record.getR31_botswana() != null) {
							    cell1.setCellValue(record.getR31_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR31_south_africa() != null) {
							    cell1.setCellValue(record.getR31_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR31_sadc() != null) {
							    cell1.setCellValue(record.getR31_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR31_usa() != null) {
							    cell1.setCellValue(record.getR31_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR31_uk() != null) {
							    cell1.setCellValue(record.getR31_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR31_europe() != null) {
							    cell1.setCellValue(record.getR31_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR31_india() != null) {
							    cell1.setCellValue(record.getR31_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR31_sydney() != null) {
							    cell1.setCellValue(record.getR31_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR31_uganda() != null) {
							    cell1.setCellValue(record.getR31_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR31_c10() != null) {
							    cell1.setCellValue(record.getR31_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR31_c11() != null) {
							    cell1.setCellValue(record.getR31_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR31_c12() != null) {
							    cell1.setCellValue(record.getR31_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR31_c13() != null) {
							    cell1.setCellValue(record.getR31_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR31_c14() != null) {
							    cell1.setCellValue(record.getR31_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR31_c15() != null) {
							    cell1.setCellValue(record.getR31_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR31_c16() != null) {
							    cell1.setCellValue(record.getR31_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR31_total() != null) {
							    cell1.setCellValue(record.getR31_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW32
							row = sheet.getRow(32);
							cell1 = row.getCell(1);
							if (record.getR32_botswana() != null) {
							    cell1.setCellValue(record.getR32_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR32_south_africa() != null) {
							    cell1.setCellValue(record.getR32_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR32_sadc() != null) {
							    cell1.setCellValue(record.getR32_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR32_usa() != null) {
							    cell1.setCellValue(record.getR32_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR32_uk() != null) {
							    cell1.setCellValue(record.getR32_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR32_europe() != null) {
							    cell1.setCellValue(record.getR32_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR32_india() != null) {
							    cell1.setCellValue(record.getR32_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR32_sydney() != null) {
							    cell1.setCellValue(record.getR32_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR32_uganda() != null) {
							    cell1.setCellValue(record.getR32_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR32_c10() != null) {
							    cell1.setCellValue(record.getR32_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR32_c11() != null) {
							    cell1.setCellValue(record.getR32_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR32_c12() != null) {
							    cell1.setCellValue(record.getR32_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR32_c13() != null) {
							    cell1.setCellValue(record.getR32_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR32_c14() != null) {
							    cell1.setCellValue(record.getR32_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR32_c15() != null) {
							    cell1.setCellValue(record.getR32_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR32_c16() != null) {
							    cell1.setCellValue(record.getR32_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR32_total() != null) {
							    cell1.setCellValue(record.getR32_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW33
							row = sheet.getRow(33);
							cell1 = row.getCell(1);
							if (record.getR33_botswana() != null) {
							    cell1.setCellValue(record.getR33_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR33_south_africa() != null) {
							    cell1.setCellValue(record.getR33_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR33_sadc() != null) {
							    cell1.setCellValue(record.getR33_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR33_usa() != null) {
							    cell1.setCellValue(record.getR33_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR33_uk() != null) {
							    cell1.setCellValue(record.getR33_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR33_europe() != null) {
							    cell1.setCellValue(record.getR33_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR33_india() != null) {
							    cell1.setCellValue(record.getR33_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR33_sydney() != null) {
							    cell1.setCellValue(record.getR33_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR33_uganda() != null) {
							    cell1.setCellValue(record.getR33_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR33_c10() != null) {
							    cell1.setCellValue(record.getR33_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR33_c11() != null) {
							    cell1.setCellValue(record.getR33_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR33_c12() != null) {
							    cell1.setCellValue(record.getR33_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR33_c13() != null) {
							    cell1.setCellValue(record.getR33_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR33_c14() != null) {
							    cell1.setCellValue(record.getR33_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR33_c15() != null) {
							    cell1.setCellValue(record.getR33_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR33_c16() != null) {
							    cell1.setCellValue(record.getR33_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR33_total() != null) {
							    cell1.setCellValue(record.getR33_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW34
							row = sheet.getRow(34);
							cell1 = row.getCell(1);
							if (record.getR34_botswana() != null) {
							    cell1.setCellValue(record.getR34_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR34_south_africa() != null) {
							    cell1.setCellValue(record.getR34_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR34_sadc() != null) {
							    cell1.setCellValue(record.getR34_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR34_usa() != null) {
							    cell1.setCellValue(record.getR34_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR34_uk() != null) {
							    cell1.setCellValue(record.getR34_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR34_europe() != null) {
							    cell1.setCellValue(record.getR34_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR34_india() != null) {
							    cell1.setCellValue(record.getR34_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR34_sydney() != null) {
							    cell1.setCellValue(record.getR34_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR34_uganda() != null) {
							    cell1.setCellValue(record.getR34_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR34_c10() != null) {
							    cell1.setCellValue(record.getR34_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR34_c11() != null) {
							    cell1.setCellValue(record.getR34_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR34_c12() != null) {
							    cell1.setCellValue(record.getR34_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR34_c13() != null) {
							    cell1.setCellValue(record.getR34_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR34_c14() != null) {
							    cell1.setCellValue(record.getR34_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR34_c15() != null) {
							    cell1.setCellValue(record.getR34_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR34_c16() != null) {
							    cell1.setCellValue(record.getR34_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR34_total() != null) {
							    cell1.setCellValue(record.getR34_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW35
							row = sheet.getRow(35);
							cell1 = row.getCell(1);
							if (record.getR35_botswana() != null) {
							    cell1.setCellValue(record.getR35_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR35_south_africa() != null) {
							    cell1.setCellValue(record.getR35_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR35_sadc() != null) {
							    cell1.setCellValue(record.getR35_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR35_usa() != null) {
							    cell1.setCellValue(record.getR35_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR35_uk() != null) {
							    cell1.setCellValue(record.getR35_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR35_europe() != null) {
							    cell1.setCellValue(record.getR35_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR35_india() != null) {
							    cell1.setCellValue(record.getR35_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR35_sydney() != null) {
							    cell1.setCellValue(record.getR35_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR35_uganda() != null) {
							    cell1.setCellValue(record.getR35_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR35_c10() != null) {
							    cell1.setCellValue(record.getR35_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR35_c11() != null) {
							    cell1.setCellValue(record.getR35_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR35_c12() != null) {
							    cell1.setCellValue(record.getR35_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR35_c13() != null) {
							    cell1.setCellValue(record.getR35_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR35_c14() != null) {
							    cell1.setCellValue(record.getR35_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR35_c15() != null) {
							    cell1.setCellValue(record.getR35_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR35_c16() != null) {
							    cell1.setCellValue(record.getR35_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR35_total() != null) {
							    cell1.setCellValue(record.getR35_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW36
							row = sheet.getRow(36);
							cell1 = row.getCell(1);
							if (record.getR36_botswana() != null) {
							    cell1.setCellValue(record.getR36_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR36_south_africa() != null) {
							    cell1.setCellValue(record.getR36_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR36_sadc() != null) {
							    cell1.setCellValue(record.getR36_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR36_usa() != null) {
							    cell1.setCellValue(record.getR36_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR36_uk() != null) {
							    cell1.setCellValue(record.getR36_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR36_europe() != null) {
							    cell1.setCellValue(record.getR36_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR36_india() != null) {
							    cell1.setCellValue(record.getR36_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR36_sydney() != null) {
							    cell1.setCellValue(record.getR36_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR36_uganda() != null) {
							    cell1.setCellValue(record.getR36_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR36_c10() != null) {
							    cell1.setCellValue(record.getR36_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR36_c11() != null) {
							    cell1.setCellValue(record.getR36_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR36_c12() != null) {
							    cell1.setCellValue(record.getR36_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR36_c13() != null) {
							    cell1.setCellValue(record.getR36_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR36_c14() != null) {
							    cell1.setCellValue(record.getR36_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR36_c15() != null) {
							    cell1.setCellValue(record.getR36_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR36_c16() != null) {
							    cell1.setCellValue(record.getR36_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR36_total() != null) {
							    cell1.setCellValue(record.getR36_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW37
							row = sheet.getRow(37);
							cell1 = row.getCell(1);
							if (record.getR37_botswana() != null) {
							    cell1.setCellValue(record.getR37_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR37_south_africa() != null) {
							    cell1.setCellValue(record.getR37_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR37_sadc() != null) {
							    cell1.setCellValue(record.getR37_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR37_usa() != null) {
							    cell1.setCellValue(record.getR37_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR37_uk() != null) {
							    cell1.setCellValue(record.getR37_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR37_europe() != null) {
							    cell1.setCellValue(record.getR37_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR37_india() != null) {
							    cell1.setCellValue(record.getR37_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR37_sydney() != null) {
							    cell1.setCellValue(record.getR37_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR37_uganda() != null) {
							    cell1.setCellValue(record.getR37_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR37_c10() != null) {
							    cell1.setCellValue(record.getR37_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR37_c11() != null) {
							    cell1.setCellValue(record.getR37_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR37_c12() != null) {
							    cell1.setCellValue(record.getR37_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR37_c13() != null) {
							    cell1.setCellValue(record.getR37_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR37_c14() != null) {
							    cell1.setCellValue(record.getR37_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR37_c15() != null) {
							    cell1.setCellValue(record.getR37_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR37_c16() != null) {
							    cell1.setCellValue(record.getR37_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR37_total() != null) {
							    cell1.setCellValue(record.getR37_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW38
							row = sheet.getRow(38);
							cell1 = row.getCell(1);
							if (record.getR38_botswana() != null) {
							    cell1.setCellValue(record.getR38_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR38_south_africa() != null) {
							    cell1.setCellValue(record.getR38_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR38_sadc() != null) {
							    cell1.setCellValue(record.getR38_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR38_usa() != null) {
							    cell1.setCellValue(record.getR38_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR38_uk() != null) {
							    cell1.setCellValue(record.getR38_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR38_europe() != null) {
							    cell1.setCellValue(record.getR38_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR38_india() != null) {
							    cell1.setCellValue(record.getR38_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR38_sydney() != null) {
							    cell1.setCellValue(record.getR38_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR38_uganda() != null) {
							    cell1.setCellValue(record.getR38_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR38_c10() != null) {
							    cell1.setCellValue(record.getR38_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR38_c11() != null) {
							    cell1.setCellValue(record.getR38_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR38_c12() != null) {
							    cell1.setCellValue(record.getR38_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR38_c13() != null) {
							    cell1.setCellValue(record.getR38_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR38_c14() != null) {
							    cell1.setCellValue(record.getR38_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR38_c15() != null) {
							    cell1.setCellValue(record.getR38_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR38_c16() != null) {
							    cell1.setCellValue(record.getR38_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR38_total() != null) {
							    cell1.setCellValue(record.getR38_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//39
							row = sheet.getRow(39);
							cell1 = row.getCell(1);
							if (record.getR39_botswana() != null) {
							    cell1.setCellValue(record.getR39_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR39_south_africa() != null) {
							    cell1.setCellValue(record.getR39_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR39_sadc() != null) {
							    cell1.setCellValue(record.getR39_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR39_usa() != null) {
							    cell1.setCellValue(record.getR39_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR39_uk() != null) {
							    cell1.setCellValue(record.getR39_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR39_europe() != null) {
							    cell1.setCellValue(record.getR39_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR39_india() != null) {
							    cell1.setCellValue(record.getR39_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR39_sydney() != null) {
							    cell1.setCellValue(record.getR39_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR39_uganda() != null) {
							    cell1.setCellValue(record.getR39_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR39_c10() != null) {
							    cell1.setCellValue(record.getR39_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR39_c11() != null) {
							    cell1.setCellValue(record.getR39_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR39_c12() != null) {
							    cell1.setCellValue(record.getR39_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR39_c13() != null) {
							    cell1.setCellValue(record.getR39_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR39_c14() != null) {
							    cell1.setCellValue(record.getR39_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR39_c15() != null) {
							    cell1.setCellValue(record.getR39_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR39_c16() != null) {
							    cell1.setCellValue(record.getR39_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR39_total() != null) {
							    cell1.setCellValue(record.getR39_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW40
							row = sheet.getRow(40);
							cell1 = row.getCell(1);
							if (record.getR40_botswana() != null) {
							    cell1.setCellValue(record.getR40_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR40_south_africa() != null) {
							    cell1.setCellValue(record.getR40_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR40_sadc() != null) {
							    cell1.setCellValue(record.getR40_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR40_usa() != null) {
							    cell1.setCellValue(record.getR40_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR40_uk() != null) {
							    cell1.setCellValue(record.getR40_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR40_europe() != null) {
							    cell1.setCellValue(record.getR40_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR40_india() != null) {
							    cell1.setCellValue(record.getR40_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR40_sydney() != null) {
							    cell1.setCellValue(record.getR40_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR40_uganda() != null) {
							    cell1.setCellValue(record.getR40_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR40_c10() != null) {
							    cell1.setCellValue(record.getR40_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR40_c11() != null) {
							    cell1.setCellValue(record.getR40_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR40_c12() != null) {
							    cell1.setCellValue(record.getR40_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR40_c13() != null) {
							    cell1.setCellValue(record.getR40_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR40_c14() != null) {
							    cell1.setCellValue(record.getR40_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR40_c15() != null) {
							    cell1.setCellValue(record.getR40_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR40_c16() != null) {
							    cell1.setCellValue(record.getR40_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR40_total() != null) {
							    cell1.setCellValue(record.getR40_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW41
							row = sheet.getRow(41);
							cell1 = row.getCell(1);
							if (record.getR41_botswana() != null) {
							    cell1.setCellValue(record.getR41_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR41_south_africa() != null) {
							    cell1.setCellValue(record.getR41_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR41_sadc() != null) {
							    cell1.setCellValue(record.getR41_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR41_usa() != null) {
							    cell1.setCellValue(record.getR41_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR41_uk() != null) {
							    cell1.setCellValue(record.getR41_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR41_europe() != null) {
							    cell1.setCellValue(record.getR41_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR41_india() != null) {
							    cell1.setCellValue(record.getR41_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR41_sydney() != null) {
							    cell1.setCellValue(record.getR41_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR41_uganda() != null) {
							    cell1.setCellValue(record.getR41_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR41_c10() != null) {
							    cell1.setCellValue(record.getR41_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR41_c11() != null) {
							    cell1.setCellValue(record.getR41_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR41_c12() != null) {
							    cell1.setCellValue(record.getR41_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR41_c13() != null) {
							    cell1.setCellValue(record.getR41_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR41_c14() != null) {
							    cell1.setCellValue(record.getR41_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR41_c15() != null) {
							    cell1.setCellValue(record.getR41_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR41_c16() != null) {
							    cell1.setCellValue(record.getR41_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR41_total() != null) {
							    cell1.setCellValue(record.getR41_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW42
							row = sheet.getRow(42);
							cell1 = row.getCell(1);
							if (record.getR42_botswana() != null) {
							    cell1.setCellValue(record.getR42_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR42_south_africa() != null) {
							    cell1.setCellValue(record.getR42_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR42_sadc() != null) {
							    cell1.setCellValue(record.getR42_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR42_usa() != null) {
							    cell1.setCellValue(record.getR42_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR42_uk() != null) {
							    cell1.setCellValue(record.getR42_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR42_europe() != null) {
							    cell1.setCellValue(record.getR42_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR42_india() != null) {
							    cell1.setCellValue(record.getR42_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR42_sydney() != null) {
							    cell1.setCellValue(record.getR42_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR42_uganda() != null) {
							    cell1.setCellValue(record.getR42_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR42_c10() != null) {
							    cell1.setCellValue(record.getR42_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR42_c11() != null) {
							    cell1.setCellValue(record.getR42_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR42_c12() != null) {
							    cell1.setCellValue(record.getR42_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR42_c13() != null) {
							    cell1.setCellValue(record.getR42_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR42_c14() != null) {
							    cell1.setCellValue(record.getR42_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR42_c15() != null) {
							    cell1.setCellValue(record.getR42_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR42_c16() != null) {
							    cell1.setCellValue(record.getR42_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR42_total() != null) {
							    cell1.setCellValue(record.getR42_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW43
							row = sheet.getRow(43);
							cell1 = row.getCell(1);
							if (record.getR43_botswana() != null) {
							    cell1.setCellValue(record.getR43_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR43_south_africa() != null) {
							    cell1.setCellValue(record.getR43_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR43_sadc() != null) {
							    cell1.setCellValue(record.getR43_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR43_usa() != null) {
							    cell1.setCellValue(record.getR43_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR43_uk() != null) {
							    cell1.setCellValue(record.getR43_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR43_europe() != null) {
							    cell1.setCellValue(record.getR43_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR43_india() != null) {
							    cell1.setCellValue(record.getR43_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR43_sydney() != null) {
							    cell1.setCellValue(record.getR43_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR43_uganda() != null) {
							    cell1.setCellValue(record.getR43_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR43_c10() != null) {
							    cell1.setCellValue(record.getR43_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR43_c11() != null) {
							    cell1.setCellValue(record.getR43_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR43_c12() != null) {
							    cell1.setCellValue(record.getR43_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR43_c13() != null) {
							    cell1.setCellValue(record.getR43_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR43_c14() != null) {
							    cell1.setCellValue(record.getR43_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR43_c15() != null) {
							    cell1.setCellValue(record.getR43_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR43_c16() != null) {
							    cell1.setCellValue(record.getR43_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR43_total() != null) {
							    cell1.setCellValue(record.getR43_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW44
							row = sheet.getRow(44);
							cell1 = row.getCell(1);
							if (record.getR44_botswana() != null) {
							    cell1.setCellValue(record.getR44_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR44_south_africa() != null) {
							    cell1.setCellValue(record.getR44_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR44_sadc() != null) {
							    cell1.setCellValue(record.getR44_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR44_usa() != null) {
							    cell1.setCellValue(record.getR44_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR44_uk() != null) {
							    cell1.setCellValue(record.getR44_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR44_europe() != null) {
							    cell1.setCellValue(record.getR44_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR44_india() != null) {
							    cell1.setCellValue(record.getR44_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR44_sydney() != null) {
							    cell1.setCellValue(record.getR44_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR44_uganda() != null) {
							    cell1.setCellValue(record.getR44_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR44_c10() != null) {
							    cell1.setCellValue(record.getR44_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR44_c11() != null) {
							    cell1.setCellValue(record.getR44_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR44_c12() != null) {
							    cell1.setCellValue(record.getR44_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR44_c13() != null) {
							    cell1.setCellValue(record.getR44_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR44_c14() != null) {
							    cell1.setCellValue(record.getR44_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR44_c15() != null) {
							    cell1.setCellValue(record.getR44_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR44_c16() != null) {
							    cell1.setCellValue(record.getR44_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR44_total() != null) {
							    cell1.setCellValue(record.getR44_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW45
							row = sheet.getRow(45);
							cell1 = row.getCell(1);
							if (record.getR45_botswana() != null) {
							    cell1.setCellValue(record.getR45_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR45_south_africa() != null) {
							    cell1.setCellValue(record.getR45_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR45_sadc() != null) {
							    cell1.setCellValue(record.getR45_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR45_usa() != null) {
							    cell1.setCellValue(record.getR45_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR45_uk() != null) {
							    cell1.setCellValue(record.getR45_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR45_europe() != null) {
							    cell1.setCellValue(record.getR45_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR45_india() != null) {
							    cell1.setCellValue(record.getR45_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR45_sydney() != null) {
							    cell1.setCellValue(record.getR45_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR45_uganda() != null) {
							    cell1.setCellValue(record.getR45_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR45_c10() != null) {
							    cell1.setCellValue(record.getR45_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR45_c11() != null) {
							    cell1.setCellValue(record.getR45_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR45_c12() != null) {
							    cell1.setCellValue(record.getR45_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR45_c13() != null) {
							    cell1.setCellValue(record.getR45_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR45_c14() != null) {
							    cell1.setCellValue(record.getR45_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR45_c15() != null) {
							    cell1.setCellValue(record.getR45_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR45_c16() != null) {
							    cell1.setCellValue(record.getR45_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR45_total() != null) {
							    cell1.setCellValue(record.getR45_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW46
							row = sheet.getRow(46);
							cell1 = row.getCell(1);
							if (record.getR46_botswana() != null) {
							    cell1.setCellValue(record.getR46_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR46_south_africa() != null) {
							    cell1.setCellValue(record.getR46_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR46_sadc() != null) {
							    cell1.setCellValue(record.getR46_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR46_usa() != null) {
							    cell1.setCellValue(record.getR46_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR46_uk() != null) {
							    cell1.setCellValue(record.getR46_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR46_europe() != null) {
							    cell1.setCellValue(record.getR46_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR46_india() != null) {
							    cell1.setCellValue(record.getR46_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR46_sydney() != null) {
							    cell1.setCellValue(record.getR46_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR46_uganda() != null) {
							    cell1.setCellValue(record.getR46_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR46_c10() != null) {
							    cell1.setCellValue(record.getR46_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR46_c11() != null) {
							    cell1.setCellValue(record.getR46_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR46_c12() != null) {
							    cell1.setCellValue(record.getR46_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR46_c13() != null) {
							    cell1.setCellValue(record.getR46_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR46_c14() != null) {
							    cell1.setCellValue(record.getR46_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR46_c15() != null) {
							    cell1.setCellValue(record.getR46_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR46_c16() != null) {
							    cell1.setCellValue(record.getR46_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR46_total() != null) {
							    cell1.setCellValue(record.getR46_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW47
							row = sheet.getRow(47);
							cell1 = row.getCell(1);
							if (record.getR47_botswana() != null) {
							    cell1.setCellValue(record.getR47_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR47_south_africa() != null) {
							    cell1.setCellValue(record.getR47_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR47_sadc() != null) {
							    cell1.setCellValue(record.getR47_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR47_usa() != null) {
							    cell1.setCellValue(record.getR47_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR47_uk() != null) {
							    cell1.setCellValue(record.getR47_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR47_europe() != null) {
							    cell1.setCellValue(record.getR47_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR47_india() != null) {
							    cell1.setCellValue(record.getR47_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR47_sydney() != null) {
							    cell1.setCellValue(record.getR47_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR47_uganda() != null) {
							    cell1.setCellValue(record.getR47_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR47_c10() != null) {
							    cell1.setCellValue(record.getR47_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR47_c11() != null) {
							    cell1.setCellValue(record.getR47_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR47_c12() != null) {
							    cell1.setCellValue(record.getR47_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR47_c13() != null) {
							    cell1.setCellValue(record.getR47_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR47_c14() != null) {
							    cell1.setCellValue(record.getR47_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR47_c15() != null) {
							    cell1.setCellValue(record.getR47_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR47_c16() != null) {
							    cell1.setCellValue(record.getR47_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR47_total() != null) {
							    cell1.setCellValue(record.getR47_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW48
							row = sheet.getRow(48);
							cell1 = row.getCell(1);
							if (record.getR48_botswana() != null) {
							    cell1.setCellValue(record.getR48_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR48_south_africa() != null) {
							    cell1.setCellValue(record.getR48_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR48_sadc() != null) {
							    cell1.setCellValue(record.getR48_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR48_usa() != null) {
							    cell1.setCellValue(record.getR48_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR48_uk() != null) {
							    cell1.setCellValue(record.getR48_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR48_europe() != null) {
							    cell1.setCellValue(record.getR48_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR48_india() != null) {
							    cell1.setCellValue(record.getR48_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR48_sydney() != null) {
							    cell1.setCellValue(record.getR48_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR48_uganda() != null) {
							    cell1.setCellValue(record.getR48_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR48_c10() != null) {
							    cell1.setCellValue(record.getR48_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR48_c11() != null) {
							    cell1.setCellValue(record.getR48_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR48_c12() != null) {
							    cell1.setCellValue(record.getR48_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR48_c13() != null) {
							    cell1.setCellValue(record.getR48_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR48_c14() != null) {
							    cell1.setCellValue(record.getR48_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR48_c15() != null) {
							    cell1.setCellValue(record.getR48_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR48_c16() != null) {
							    cell1.setCellValue(record.getR48_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR48_total() != null) {
							    cell1.setCellValue(record.getR48_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW49
							row = sheet.getRow(49);
							cell1 = row.getCell(1);
							if (record.getR49_botswana() != null) {
							    cell1.setCellValue(record.getR49_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR49_south_africa() != null) {
							    cell1.setCellValue(record.getR49_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR49_sadc() != null) {
							    cell1.setCellValue(record.getR49_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR49_usa() != null) {
							    cell1.setCellValue(record.getR49_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR49_uk() != null) {
							    cell1.setCellValue(record.getR49_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR49_europe() != null) {
							    cell1.setCellValue(record.getR49_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR49_india() != null) {
							    cell1.setCellValue(record.getR49_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR49_sydney() != null) {
							    cell1.setCellValue(record.getR49_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR49_uganda() != null) {
							    cell1.setCellValue(record.getR49_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR49_c10() != null) {
							    cell1.setCellValue(record.getR49_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR49_c11() != null) {
							    cell1.setCellValue(record.getR49_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR49_c12() != null) {
							    cell1.setCellValue(record.getR49_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR49_c13() != null) {
							    cell1.setCellValue(record.getR49_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR49_c14() != null) {
							    cell1.setCellValue(record.getR49_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR49_c15() != null) {
							    cell1.setCellValue(record.getR49_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR49_c16() != null) {
							    cell1.setCellValue(record.getR49_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR49_total() != null) {
							    cell1.setCellValue(record.getR49_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW50
							row = sheet.getRow(50);
							cell1 = row.getCell(1);
							if (record.getR50_botswana() != null) {
							    cell1.setCellValue(record.getR50_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR50_south_africa() != null) {
							    cell1.setCellValue(record.getR50_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR50_sadc() != null) {
							    cell1.setCellValue(record.getR50_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR50_usa() != null) {
							    cell1.setCellValue(record.getR50_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR50_uk() != null) {
							    cell1.setCellValue(record.getR50_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR50_europe() != null) {
							    cell1.setCellValue(record.getR50_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR50_india() != null) {
							    cell1.setCellValue(record.getR50_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR50_sydney() != null) {
							    cell1.setCellValue(record.getR50_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR50_uganda() != null) {
							    cell1.setCellValue(record.getR50_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR50_c10() != null) {
							    cell1.setCellValue(record.getR50_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR50_c11() != null) {
							    cell1.setCellValue(record.getR50_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR50_c12() != null) {
							    cell1.setCellValue(record.getR50_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR50_c13() != null) {
							    cell1.setCellValue(record.getR50_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR50_c14() != null) {
							    cell1.setCellValue(record.getR50_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR50_c15() != null) {
							    cell1.setCellValue(record.getR50_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR50_c16() != null) {
							    cell1.setCellValue(record.getR50_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR50_total() != null) {
							    cell1.setCellValue(record.getR50_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW51
							row = sheet.getRow(51);
							cell1 = row.getCell(1);
							if (record.getR51_botswana() != null) {
							    cell1.setCellValue(record.getR51_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR51_south_africa() != null) {
							    cell1.setCellValue(record.getR51_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR51_sadc() != null) {
							    cell1.setCellValue(record.getR51_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR51_usa() != null) {
							    cell1.setCellValue(record.getR51_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR51_uk() != null) {
							    cell1.setCellValue(record.getR51_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR51_europe() != null) {
							    cell1.setCellValue(record.getR51_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR51_india() != null) {
							    cell1.setCellValue(record.getR51_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR51_sydney() != null) {
							    cell1.setCellValue(record.getR51_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR51_uganda() != null) {
							    cell1.setCellValue(record.getR51_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR51_c10() != null) {
							    cell1.setCellValue(record.getR51_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR51_c11() != null) {
							    cell1.setCellValue(record.getR51_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR51_c12() != null) {
							    cell1.setCellValue(record.getR51_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR51_c13() != null) {
							    cell1.setCellValue(record.getR51_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR51_c14() != null) {
							    cell1.setCellValue(record.getR51_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR51_c15() != null) {
							    cell1.setCellValue(record.getR51_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR51_c16() != null) {
							    cell1.setCellValue(record.getR51_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR51_total() != null) {
							    cell1.setCellValue(record.getR51_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW52
							row = sheet.getRow(52);
							cell1 = row.getCell(1);
							if (record.getR52_botswana() != null) {
							    cell1.setCellValue(record.getR52_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR52_south_africa() != null) {
							    cell1.setCellValue(record.getR52_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR52_sadc() != null) {
							    cell1.setCellValue(record.getR52_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR52_usa() != null) {
							    cell1.setCellValue(record.getR52_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR52_uk() != null) {
							    cell1.setCellValue(record.getR52_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR52_europe() != null) {
							    cell1.setCellValue(record.getR52_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR52_india() != null) {
							    cell1.setCellValue(record.getR52_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR52_sydney() != null) {
							    cell1.setCellValue(record.getR52_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR52_uganda() != null) {
							    cell1.setCellValue(record.getR52_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR52_c10() != null) {
							    cell1.setCellValue(record.getR52_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR52_c11() != null) {
							    cell1.setCellValue(record.getR52_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR52_c12() != null) {
							    cell1.setCellValue(record.getR52_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR52_c13() != null) {
							    cell1.setCellValue(record.getR52_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR52_c14() != null) {
							    cell1.setCellValue(record.getR52_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR52_c15() != null) {
							    cell1.setCellValue(record.getR52_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR52_c16() != null) {
							    cell1.setCellValue(record.getR52_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR52_total() != null) {
							    cell1.setCellValue(record.getR52_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW53
							row = sheet.getRow(53);
							cell1 = row.getCell(1);
							if (record.getR53_botswana() != null) {
							    cell1.setCellValue(record.getR53_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR53_south_africa() != null) {
							    cell1.setCellValue(record.getR53_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR53_sadc() != null) {
							    cell1.setCellValue(record.getR53_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR53_usa() != null) {
							    cell1.setCellValue(record.getR53_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR53_uk() != null) {
							    cell1.setCellValue(record.getR53_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR53_europe() != null) {
							    cell1.setCellValue(record.getR53_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR53_india() != null) {
							    cell1.setCellValue(record.getR53_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR53_sydney() != null) {
							    cell1.setCellValue(record.getR53_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR53_uganda() != null) {
							    cell1.setCellValue(record.getR53_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR53_c10() != null) {
							    cell1.setCellValue(record.getR53_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR53_c11() != null) {
							    cell1.setCellValue(record.getR53_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR53_c12() != null) {
							    cell1.setCellValue(record.getR53_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR53_c13() != null) {
							    cell1.setCellValue(record.getR53_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR53_c14() != null) {
							    cell1.setCellValue(record.getR53_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR53_c15() != null) {
							    cell1.setCellValue(record.getR53_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR53_c16() != null) {
							    cell1.setCellValue(record.getR53_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR53_total() != null) {
							    cell1.setCellValue(record.getR53_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW54
							row = sheet.getRow(54);
							cell1 = row.getCell(1);
							if (record.getR54_botswana() != null) {
							    cell1.setCellValue(record.getR54_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR54_south_africa() != null) {
							    cell1.setCellValue(record.getR54_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR54_sadc() != null) {
							    cell1.setCellValue(record.getR54_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR54_usa() != null) {
							    cell1.setCellValue(record.getR54_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR54_uk() != null) {
							    cell1.setCellValue(record.getR54_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR54_europe() != null) {
							    cell1.setCellValue(record.getR54_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR54_india() != null) {
							    cell1.setCellValue(record.getR54_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR54_sydney() != null) {
							    cell1.setCellValue(record.getR54_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR54_uganda() != null) {
							    cell1.setCellValue(record.getR54_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR54_c10() != null) {
							    cell1.setCellValue(record.getR54_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR54_c11() != null) {
							    cell1.setCellValue(record.getR54_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR54_c12() != null) {
							    cell1.setCellValue(record.getR54_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR54_c13() != null) {
							    cell1.setCellValue(record.getR54_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR54_c14() != null) {
							    cell1.setCellValue(record.getR54_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR54_c15() != null) {
							    cell1.setCellValue(record.getR54_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR54_c16() != null) {
							    cell1.setCellValue(record.getR54_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR54_total() != null) {
							    cell1.setCellValue(record.getR54_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW55
							row = sheet.getRow(55);
							cell1 = row.getCell(1);
							if (record.getR55_botswana() != null) {
							    cell1.setCellValue(record.getR55_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR55_south_africa() != null) {
							    cell1.setCellValue(record.getR55_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR55_sadc() != null) {
							    cell1.setCellValue(record.getR55_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR55_usa() != null) {
							    cell1.setCellValue(record.getR55_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR55_uk() != null) {
							    cell1.setCellValue(record.getR55_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR55_europe() != null) {
							    cell1.setCellValue(record.getR55_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR55_india() != null) {
							    cell1.setCellValue(record.getR55_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR55_sydney() != null) {
							    cell1.setCellValue(record.getR55_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR55_uganda() != null) {
							    cell1.setCellValue(record.getR55_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR55_c10() != null) {
							    cell1.setCellValue(record.getR55_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR55_c11() != null) {
							    cell1.setCellValue(record.getR55_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR55_c12() != null) {
							    cell1.setCellValue(record.getR55_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR55_c13() != null) {
							    cell1.setCellValue(record.getR55_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR55_c14() != null) {
							    cell1.setCellValue(record.getR55_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR55_c15() != null) {
							    cell1.setCellValue(record.getR55_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR55_c16() != null) {
							    cell1.setCellValue(record.getR55_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR55_total() != null) {
							    cell1.setCellValue(record.getR55_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW56
							row = sheet.getRow(56);
							cell1 = row.getCell(1);
							if (record.getR56_botswana() != null) {
							    cell1.setCellValue(record.getR56_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR56_south_africa() != null) {
							    cell1.setCellValue(record.getR56_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR56_sadc() != null) {
							    cell1.setCellValue(record.getR56_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR56_usa() != null) {
							    cell1.setCellValue(record.getR56_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR56_uk() != null) {
							    cell1.setCellValue(record.getR56_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR56_europe() != null) {
							    cell1.setCellValue(record.getR56_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR56_india() != null) {
							    cell1.setCellValue(record.getR56_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR56_sydney() != null) {
							    cell1.setCellValue(record.getR56_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR56_uganda() != null) {
							    cell1.setCellValue(record.getR56_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR56_c10() != null) {
							    cell1.setCellValue(record.getR56_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR56_c11() != null) {
							    cell1.setCellValue(record.getR56_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR56_c12() != null) {
							    cell1.setCellValue(record.getR56_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR56_c13() != null) {
							    cell1.setCellValue(record.getR56_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR56_c14() != null) {
							    cell1.setCellValue(record.getR56_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR56_c15() != null) {
							    cell1.setCellValue(record.getR56_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR56_c16() != null) {
							    cell1.setCellValue(record.getR56_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR56_total() != null) {
							    cell1.setCellValue(record.getR56_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW57
							row = sheet.getRow(57);
							cell1 = row.getCell(1);
							if (record.getR57_botswana() != null) {
							    cell1.setCellValue(record.getR57_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR57_south_africa() != null) {
							    cell1.setCellValue(record.getR57_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR57_sadc() != null) {
							    cell1.setCellValue(record.getR57_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR57_usa() != null) {
							    cell1.setCellValue(record.getR57_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR57_uk() != null) {
							    cell1.setCellValue(record.getR57_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR57_europe() != null) {
							    cell1.setCellValue(record.getR57_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR57_india() != null) {
							    cell1.setCellValue(record.getR57_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR57_sydney() != null) {
							    cell1.setCellValue(record.getR57_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR57_uganda() != null) {
							    cell1.setCellValue(record.getR57_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR57_c10() != null) {
							    cell1.setCellValue(record.getR57_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR57_c11() != null) {
							    cell1.setCellValue(record.getR57_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR57_c12() != null) {
							    cell1.setCellValue(record.getR57_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR57_c13() != null) {
							    cell1.setCellValue(record.getR57_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR57_c14() != null) {
							    cell1.setCellValue(record.getR57_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR57_c15() != null) {
							    cell1.setCellValue(record.getR57_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR57_c16() != null) {
							    cell1.setCellValue(record.getR57_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR57_total() != null) {
							    cell1.setCellValue(record.getR57_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW58
							row = sheet.getRow(58);
							cell1 = row.getCell(1);
							if (record.getR58_botswana() != null) {
							    cell1.setCellValue(record.getR58_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR58_south_africa() != null) {
							    cell1.setCellValue(record.getR58_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR58_sadc() != null) {
							    cell1.setCellValue(record.getR58_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR58_usa() != null) {
							    cell1.setCellValue(record.getR58_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR58_uk() != null) {
							    cell1.setCellValue(record.getR58_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR58_europe() != null) {
							    cell1.setCellValue(record.getR58_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR58_india() != null) {
							    cell1.setCellValue(record.getR58_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR58_sydney() != null) {
							    cell1.setCellValue(record.getR58_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR58_uganda() != null) {
							    cell1.setCellValue(record.getR58_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR58_c10() != null) {
							    cell1.setCellValue(record.getR58_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR58_c11() != null) {
							    cell1.setCellValue(record.getR58_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR58_c12() != null) {
							    cell1.setCellValue(record.getR58_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR58_c13() != null) {
							    cell1.setCellValue(record.getR58_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR58_c14() != null) {
							    cell1.setCellValue(record.getR58_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR58_c15() != null) {
							    cell1.setCellValue(record.getR58_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR58_c16() != null) {
							    cell1.setCellValue(record.getR58_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR58_total() != null) {
							    cell1.setCellValue(record.getR58_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW59
							row = sheet.getRow(59);
							cell1 = row.getCell(1);
							if (record.getR59_botswana() != null) {
							    cell1.setCellValue(record.getR59_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR59_south_africa() != null) {
							    cell1.setCellValue(record.getR59_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR59_sadc() != null) {
							    cell1.setCellValue(record.getR59_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR59_usa() != null) {
							    cell1.setCellValue(record.getR59_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR59_uk() != null) {
							    cell1.setCellValue(record.getR59_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR59_europe() != null) {
							    cell1.setCellValue(record.getR59_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR59_india() != null) {
							    cell1.setCellValue(record.getR59_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR59_sydney() != null) {
							    cell1.setCellValue(record.getR59_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR59_uganda() != null) {
							    cell1.setCellValue(record.getR59_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR59_c10() != null) {
							    cell1.setCellValue(record.getR59_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR59_c11() != null) {
							    cell1.setCellValue(record.getR59_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR59_c12() != null) {
							    cell1.setCellValue(record.getR59_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR59_c13() != null) {
							    cell1.setCellValue(record.getR59_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR59_c14() != null) {
							    cell1.setCellValue(record.getR59_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR59_c15() != null) {
							    cell1.setCellValue(record.getR59_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR59_c16() != null) {
							    cell1.setCellValue(record.getR59_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR59_total() != null) {
							    cell1.setCellValue(record.getR59_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//ROW60
							row = sheet.getRow(60);
							cell1 = row.getCell(1);
							if (record.getR60_botswana() != null) {
							    cell1.setCellValue(record.getR60_botswana().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(2);
							if (record.getR60_south_africa() != null) {
							    cell1.setCellValue(record.getR60_south_africa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(3);
							if (record.getR60_sadc() != null) {
							    cell1.setCellValue(record.getR60_sadc().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(4);
							if (record.getR60_usa() != null) {
							    cell1.setCellValue(record.getR60_usa().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(5);
							if (record.getR60_uk() != null) {
							    cell1.setCellValue(record.getR60_uk().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(6);
							if (record.getR60_europe() != null) {
							    cell1.setCellValue(record.getR60_europe().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(7);
							if (record.getR60_india() != null) {
							    cell1.setCellValue(record.getR60_india().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(8);
							if (record.getR60_sydney() != null) {
							    cell1.setCellValue(record.getR60_sydney().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(9);
							if (record.getR60_uganda() != null) {
							    cell1.setCellValue(record.getR60_uganda().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(10);
							if (record.getR60_c10() != null) {
							    cell1.setCellValue(record.getR60_c10().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(11);
							if (record.getR60_c11() != null) {
							    cell1.setCellValue(record.getR60_c11().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(12);
							if (record.getR60_c12() != null) {
							    cell1.setCellValue(record.getR60_c12().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(13);
							if (record.getR60_c13() != null) {
							    cell1.setCellValue(record.getR60_c13().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(14);
							if (record.getR60_c14() != null) {
							    cell1.setCellValue(record.getR60_c14().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(15);
							if (record.getR60_c15() != null) {
							    cell1.setCellValue(record.getR60_c15().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(16);
							if (record.getR60_c16() != null) {
							    cell1.setCellValue(record.getR60_c16().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}

							cell1 = row.getCell(17);
							if (record.getR60_total() != null) {
							    cell1.setCellValue(record.getR60_total().doubleValue());   } else {
							    cell1.setCellValue("");
							    cell1.setCellStyle(textStyle);
							}
		//row61
							
							next61(sheet,record,record2,numberStyle,textStyle);
							
							
					
							
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
	
	public void next61(Sheet sheet,M_GALOR_Summary_Entity1 record,M_GALOR_Summary_Entity2 record2,CellStyle numberStyle,CellStyle textStyle) {
		
		Row row = sheet.getRow(61);

		Cell cell1 =  row.getCell(1);
		if (record.getR61_botswana() != null) {
		    cell1.setCellValue(record.getR61_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record.getR61_south_africa() != null) {
		    cell1.setCellValue(record.getR61_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record.getR61_sadc() != null) {
		    cell1.setCellValue(record.getR61_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record.getR61_usa() != null) {
		    cell1.setCellValue(record.getR61_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record.getR61_uk() != null) {
		    cell1.setCellValue(record.getR61_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record.getR61_europe() != null) {
		    cell1.setCellValue(record.getR61_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record.getR61_india() != null) {
		    cell1.setCellValue(record.getR61_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record.getR61_sydney() != null) {
		    cell1.setCellValue(record.getR61_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record.getR61_uganda() != null) {
		    cell1.setCellValue(record.getR61_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record.getR61_c10() != null) {
		    cell1.setCellValue(record.getR61_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record.getR61_c11() != null) {
		    cell1.setCellValue(record.getR61_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record.getR61_c12() != null) {
		    cell1.setCellValue(record.getR61_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record.getR61_c13() != null) {
		    cell1.setCellValue(record.getR61_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record.getR61_c14() != null) {
		    cell1.setCellValue(record.getR61_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record.getR61_c15() != null) {
		    cell1.setCellValue(record.getR61_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record.getR61_c16() != null) {
		    cell1.setCellValue(record.getR61_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record.getR61_total() != null) {
		    cell1.setCellValue(record.getR61_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		//row62
		row = sheet.getRow(62);

		cell1 =  row.getCell(1);
		if (record2.getR62_botswana() != null) {
		    cell1.setCellValue(record2.getR62_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR62_south_africa() != null) {
		    cell1.setCellValue(record2.getR62_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR62_sadc() != null) {
		    cell1.setCellValue(record2.getR62_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR62_usa() != null) {
		    cell1.setCellValue(record2.getR62_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR62_uk() != null) {
		    cell1.setCellValue(record2.getR62_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR62_europe() != null) {
		    cell1.setCellValue(record2.getR62_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR62_india() != null) {
		    cell1.setCellValue(record2.getR62_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR62_sydney() != null) {
		    cell1.setCellValue(record2.getR62_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR62_uganda() != null) {
		    cell1.setCellValue(record2.getR62_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR62_c10() != null) {
		    cell1.setCellValue(record2.getR62_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR62_c11() != null) {
		    cell1.setCellValue(record2.getR62_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR62_c12() != null) {
		    cell1.setCellValue(record2.getR62_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR62_c13() != null) {
		    cell1.setCellValue(record2.getR62_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR62_c14() != null) {
		    cell1.setCellValue(record2.getR62_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR62_c15() != null) {
		    cell1.setCellValue(record2.getR62_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR62_c16() != null) {
		    cell1.setCellValue(record2.getR62_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR62_total() != null) {
		    cell1.setCellValue(record2.getR62_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		
		//row63
		row = sheet.getRow(63);

		cell1 =  row.getCell(1);
		if (record2.getR63_botswana() != null) {
		    cell1.setCellValue(record2.getR63_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR63_south_africa() != null) {
		    cell1.setCellValue(record2.getR63_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR63_sadc() != null) {
		    cell1.setCellValue(record2.getR63_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR63_usa() != null) {
		    cell1.setCellValue(record2.getR63_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR63_uk() != null) {
		    cell1.setCellValue(record2.getR63_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR63_europe() != null) {
		    cell1.setCellValue(record2.getR63_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR63_india() != null) {
		    cell1.setCellValue(record2.getR63_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR63_sydney() != null) {
		    cell1.setCellValue(record2.getR63_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR63_uganda() != null) {
		    cell1.setCellValue(record2.getR63_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR63_c10() != null) {
		    cell1.setCellValue(record2.getR63_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR63_c11() != null) {
		    cell1.setCellValue(record2.getR63_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR63_c12() != null) {
		    cell1.setCellValue(record2.getR63_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR63_c13() != null) {
		    cell1.setCellValue(record2.getR63_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR63_c14() != null) {
		    cell1.setCellValue(record2.getR63_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR63_c15() != null) {
		    cell1.setCellValue(record2.getR63_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR63_c16() != null) {
		    cell1.setCellValue(record2.getR63_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR63_total() != null) {
		    cell1.setCellValue(record2.getR63_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row64
		row = sheet.getRow(64);

		cell1 =  row.getCell(1);
		if (record2.getR64_botswana() != null) {
		    cell1.setCellValue(record2.getR64_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR64_south_africa() != null) {
		    cell1.setCellValue(record2.getR64_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR64_sadc() != null) {
		    cell1.setCellValue(record2.getR64_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR64_usa() != null) {
		    cell1.setCellValue(record2.getR64_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR64_uk() != null) {
		    cell1.setCellValue(record2.getR64_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR64_europe() != null) {
		    cell1.setCellValue(record2.getR64_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR64_india() != null) {
		    cell1.setCellValue(record2.getR64_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR64_sydney() != null) {
		    cell1.setCellValue(record2.getR64_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR64_uganda() != null) {
		    cell1.setCellValue(record2.getR64_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR64_c10() != null) {
		    cell1.setCellValue(record2.getR64_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR64_c11() != null) {
		    cell1.setCellValue(record2.getR64_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR64_c12() != null) {
		    cell1.setCellValue(record2.getR64_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR64_c13() != null) {
		    cell1.setCellValue(record2.getR64_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR64_c14() != null) {
		    cell1.setCellValue(record2.getR64_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR64_c15() != null) {
		    cell1.setCellValue(record2.getR64_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR64_c16() != null) {
		    cell1.setCellValue(record2.getR64_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR64_total() != null) {
		    cell1.setCellValue(record2.getR64_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		//row65
		row = sheet.getRow(65);

		cell1 =  row.getCell(1);
		if (record2.getR65_botswana() != null) {
		    cell1.setCellValue(record2.getR65_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR65_south_africa() != null) {
		    cell1.setCellValue(record2.getR65_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR65_sadc() != null) {
		    cell1.setCellValue(record2.getR65_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR65_usa() != null) {
		    cell1.setCellValue(record2.getR65_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR65_uk() != null) {
		    cell1.setCellValue(record2.getR65_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR65_europe() != null) {
		    cell1.setCellValue(record2.getR65_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR65_india() != null) {
		    cell1.setCellValue(record2.getR65_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR65_sydney() != null) {
		    cell1.setCellValue(record2.getR65_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR65_uganda() != null) {
		    cell1.setCellValue(record2.getR65_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR65_c10() != null) {
		    cell1.setCellValue(record2.getR65_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR65_c11() != null) {
		    cell1.setCellValue(record2.getR65_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR65_c12() != null) {
		    cell1.setCellValue(record2.getR65_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR65_c13() != null) {
		    cell1.setCellValue(record2.getR65_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR65_c14() != null) {
		    cell1.setCellValue(record2.getR65_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR65_c15() != null) {
		    cell1.setCellValue(record2.getR65_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR65_c16() != null) {
		    cell1.setCellValue(record2.getR65_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR65_total() != null) {
		    cell1.setCellValue(record2.getR65_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row66
		row = sheet.getRow(66);

		cell1 =  row.getCell(1);
		if (record2.getR66_botswana() != null) {
		    cell1.setCellValue(record2.getR66_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR66_south_africa() != null) {
		    cell1.setCellValue(record2.getR66_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR66_sadc() != null) {
		    cell1.setCellValue(record2.getR66_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR66_usa() != null) {
		    cell1.setCellValue(record2.getR66_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR66_uk() != null) {
		    cell1.setCellValue(record2.getR66_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR66_europe() != null) {
		    cell1.setCellValue(record2.getR66_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR66_india() != null) {
		    cell1.setCellValue(record2.getR66_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR66_sydney() != null) {
		    cell1.setCellValue(record2.getR66_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR66_uganda() != null) {
		    cell1.setCellValue(record2.getR66_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR66_c10() != null) {
		    cell1.setCellValue(record2.getR66_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR66_c11() != null) {
		    cell1.setCellValue(record2.getR66_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR66_c12() != null) {
		    cell1.setCellValue(record2.getR66_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR66_c13() != null) {
		    cell1.setCellValue(record2.getR66_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR66_c14() != null) {
		    cell1.setCellValue(record2.getR66_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR66_c15() != null) {
		    cell1.setCellValue(record2.getR66_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR66_c16() != null) {
		    cell1.setCellValue(record2.getR66_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR66_total() != null) {
		    cell1.setCellValue(record2.getR66_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row67
		row = sheet.getRow(67);

		cell1 =  row.getCell(1);
		if (record2.getR67_botswana() != null) {
		    cell1.setCellValue(record2.getR67_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR67_south_africa() != null) {
		    cell1.setCellValue(record2.getR67_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR67_sadc() != null) {
		    cell1.setCellValue(record2.getR67_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR67_usa() != null) {
		    cell1.setCellValue(record2.getR67_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR67_uk() != null) {
		    cell1.setCellValue(record2.getR67_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR67_europe() != null) {
		    cell1.setCellValue(record2.getR67_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR67_india() != null) {
		    cell1.setCellValue(record2.getR67_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR67_sydney() != null) {
		    cell1.setCellValue(record2.getR67_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR67_uganda() != null) {
		    cell1.setCellValue(record2.getR67_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR67_c10() != null) {
		    cell1.setCellValue(record2.getR67_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR67_c11() != null) {
		    cell1.setCellValue(record2.getR67_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR67_c12() != null) {
		    cell1.setCellValue(record2.getR67_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR67_c13() != null) {
		    cell1.setCellValue(record2.getR67_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR67_c14() != null) {
		    cell1.setCellValue(record2.getR67_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR67_c15() != null) {
		    cell1.setCellValue(record2.getR67_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR67_c16() != null) {
		    cell1.setCellValue(record2.getR67_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR67_total() != null) {
		    cell1.setCellValue(record2.getR67_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row68
		row = sheet.getRow(68);

		cell1 =  row.getCell(1);
		if (record2.getR68_botswana() != null) {
		    cell1.setCellValue(record2.getR68_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR68_south_africa() != null) {
		    cell1.setCellValue(record2.getR68_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR68_sadc() != null) {
		    cell1.setCellValue(record2.getR68_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR68_usa() != null) {
		    cell1.setCellValue(record2.getR68_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR68_uk() != null) {
		    cell1.setCellValue(record2.getR68_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR68_europe() != null) {
		    cell1.setCellValue(record2.getR68_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR68_india() != null) {
		    cell1.setCellValue(record2.getR68_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR68_sydney() != null) {
		    cell1.setCellValue(record2.getR68_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR68_uganda() != null) {
		    cell1.setCellValue(record2.getR68_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR68_c10() != null) {
		    cell1.setCellValue(record2.getR68_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR68_c11() != null) {
		    cell1.setCellValue(record2.getR68_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR68_c12() != null) {
		    cell1.setCellValue(record2.getR68_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR68_c13() != null) {
		    cell1.setCellValue(record2.getR68_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR68_c14() != null) {
		    cell1.setCellValue(record2.getR68_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR68_c15() != null) {
		    cell1.setCellValue(record2.getR68_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR68_c16() != null) {
		    cell1.setCellValue(record2.getR68_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR68_total() != null) {
		    cell1.setCellValue(record2.getR68_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row69
		row = sheet.getRow(69);

		cell1 =  row.getCell(1);
		if (record2.getR69_botswana() != null) {
		    cell1.setCellValue(record2.getR69_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR69_south_africa() != null) {
		    cell1.setCellValue(record2.getR69_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR69_sadc() != null) {
		    cell1.setCellValue(record2.getR69_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR69_usa() != null) {
		    cell1.setCellValue(record2.getR69_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR69_uk() != null) {
		    cell1.setCellValue(record2.getR69_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR69_europe() != null) {
		    cell1.setCellValue(record2.getR69_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR69_india() != null) {
		    cell1.setCellValue(record2.getR69_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR69_sydney() != null) {
		    cell1.setCellValue(record2.getR69_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR69_uganda() != null) {
		    cell1.setCellValue(record2.getR69_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR69_c10() != null) {
		    cell1.setCellValue(record2.getR69_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR69_c11() != null) {
		    cell1.setCellValue(record2.getR69_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR69_c12() != null) {
		    cell1.setCellValue(record2.getR69_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR69_c13() != null) {
		    cell1.setCellValue(record2.getR69_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR69_c14() != null) {
		    cell1.setCellValue(record2.getR69_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR69_c15() != null) {
		    cell1.setCellValue(record2.getR69_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR69_c16() != null) {
		    cell1.setCellValue(record2.getR69_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR69_total() != null) {
		    cell1.setCellValue(record2.getR69_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row70
		row = sheet.getRow(70);

		cell1 =  row.getCell(1);
		if (record2.getR70_botswana() != null) {
		    cell1.setCellValue(record2.getR70_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR70_south_africa() != null) {
		    cell1.setCellValue(record2.getR70_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR70_sadc() != null) {
		    cell1.setCellValue(record2.getR70_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR70_usa() != null) {
		    cell1.setCellValue(record2.getR70_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR70_uk() != null) {
		    cell1.setCellValue(record2.getR70_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR70_europe() != null) {
		    cell1.setCellValue(record2.getR70_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR70_india() != null) {
		    cell1.setCellValue(record2.getR70_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR70_sydney() != null) {
		    cell1.setCellValue(record2.getR70_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR70_uganda() != null) {
		    cell1.setCellValue(record2.getR70_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR70_c10() != null) {
		    cell1.setCellValue(record2.getR70_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR70_c11() != null) {
		    cell1.setCellValue(record2.getR70_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR70_c12() != null) {
		    cell1.setCellValue(record2.getR70_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR70_c13() != null) {
		    cell1.setCellValue(record2.getR70_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR70_c14() != null) {
		    cell1.setCellValue(record2.getR70_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR70_c15() != null) {
		    cell1.setCellValue(record2.getR70_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR70_c16() != null) {
		    cell1.setCellValue(record2.getR70_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR70_total() != null) {
		    cell1.setCellValue(record2.getR70_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row71
		row = sheet.getRow(71);

		cell1 =  row.getCell(1);
		if (record2.getR71_botswana() != null) {
		    cell1.setCellValue(record2.getR71_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR71_south_africa() != null) {
		    cell1.setCellValue(record2.getR71_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR71_sadc() != null) {
		    cell1.setCellValue(record2.getR71_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR71_usa() != null) {
		    cell1.setCellValue(record2.getR71_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR71_uk() != null) {
		    cell1.setCellValue(record2.getR71_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR71_europe() != null) {
		    cell1.setCellValue(record2.getR71_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR71_india() != null) {
		    cell1.setCellValue(record2.getR71_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR71_sydney() != null) {
		    cell1.setCellValue(record2.getR71_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR71_uganda() != null) {
		    cell1.setCellValue(record2.getR71_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR71_c10() != null) {
		    cell1.setCellValue(record2.getR71_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR71_c11() != null) {
		    cell1.setCellValue(record2.getR71_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR71_c12() != null) {
		    cell1.setCellValue(record2.getR71_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR71_c13() != null) {
		    cell1.setCellValue(record2.getR71_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR71_c14() != null) {
		    cell1.setCellValue(record2.getR71_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR71_c15() != null) {
		    cell1.setCellValue(record2.getR71_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR71_c16() != null) {
		    cell1.setCellValue(record2.getR71_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR71_total() != null) {
		    cell1.setCellValue(record2.getR71_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row72
		row = sheet.getRow(72);

		cell1 =  row.getCell(1);
		if (record2.getR72_botswana() != null) {
		    cell1.setCellValue(record2.getR72_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR72_south_africa() != null) {
		    cell1.setCellValue(record2.getR72_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR72_sadc() != null) {
		    cell1.setCellValue(record2.getR72_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR72_usa() != null) {
		    cell1.setCellValue(record2.getR72_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR72_uk() != null) {
		    cell1.setCellValue(record2.getR72_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR72_europe() != null) {
		    cell1.setCellValue(record2.getR72_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR72_india() != null) {
		    cell1.setCellValue(record2.getR72_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR72_sydney() != null) {
		    cell1.setCellValue(record2.getR72_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR72_uganda() != null) {
		    cell1.setCellValue(record2.getR72_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR72_c10() != null) {
		    cell1.setCellValue(record2.getR72_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR72_c11() != null) {
		    cell1.setCellValue(record2.getR72_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR72_c12() != null) {
		    cell1.setCellValue(record2.getR72_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR72_c13() != null) {
		    cell1.setCellValue(record2.getR72_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR72_c14() != null) {
		    cell1.setCellValue(record2.getR72_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR72_c15() != null) {
		    cell1.setCellValue(record2.getR72_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR72_c16() != null) {
		    cell1.setCellValue(record2.getR72_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR72_total() != null) {
		    cell1.setCellValue(record2.getR72_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row73
		row = sheet.getRow(73);

		cell1 =  row.getCell(1);
		if (record2.getR73_botswana() != null) {
		    cell1.setCellValue(record2.getR73_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR73_south_africa() != null) {
		    cell1.setCellValue(record2.getR73_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR73_sadc() != null) {
		    cell1.setCellValue(record2.getR73_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR73_usa() != null) {
		    cell1.setCellValue(record2.getR73_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR73_uk() != null) {
		    cell1.setCellValue(record2.getR73_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR73_europe() != null) {
		    cell1.setCellValue(record2.getR73_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR73_india() != null) {
		    cell1.setCellValue(record2.getR73_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR73_sydney() != null) {
		    cell1.setCellValue(record2.getR73_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR73_uganda() != null) {
		    cell1.setCellValue(record2.getR73_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR73_c10() != null) {
		    cell1.setCellValue(record2.getR73_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR73_c11() != null) {
		    cell1.setCellValue(record2.getR73_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR73_c12() != null) {
		    cell1.setCellValue(record2.getR73_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR73_c13() != null) {
		    cell1.setCellValue(record2.getR73_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR73_c14() != null) {
		    cell1.setCellValue(record2.getR73_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR73_c15() != null) {
		    cell1.setCellValue(record2.getR73_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR73_c16() != null) {
		    cell1.setCellValue(record2.getR73_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR73_total() != null) {
		    cell1.setCellValue(record2.getR73_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row74
		row = sheet.getRow(74);

		cell1 =  row.getCell(1);
		if (record2.getR74_botswana() != null) {
		    cell1.setCellValue(record2.getR74_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR74_south_africa() != null) {
		    cell1.setCellValue(record2.getR74_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR74_sadc() != null) {
		    cell1.setCellValue(record2.getR74_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR74_usa() != null) {
		    cell1.setCellValue(record2.getR74_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR74_uk() != null) {
		    cell1.setCellValue(record2.getR74_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR74_europe() != null) {
		    cell1.setCellValue(record2.getR74_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR74_india() != null) {
		    cell1.setCellValue(record2.getR74_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR74_sydney() != null) {
		    cell1.setCellValue(record2.getR74_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR74_uganda() != null) {
		    cell1.setCellValue(record2.getR74_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR74_c10() != null) {
		    cell1.setCellValue(record2.getR74_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR74_c11() != null) {
		    cell1.setCellValue(record2.getR74_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR74_c12() != null) {
		    cell1.setCellValue(record2.getR74_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR74_c13() != null) {
		    cell1.setCellValue(record2.getR74_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR74_c14() != null) {
		    cell1.setCellValue(record2.getR74_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR74_c15() != null) {
		    cell1.setCellValue(record2.getR74_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR74_c16() != null) {
		    cell1.setCellValue(record2.getR74_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR74_total() != null) {
		    cell1.setCellValue(record2.getR74_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row75
		row = sheet.getRow(75);

		cell1 =  row.getCell(1);
		if (record2.getR75_botswana() != null) {
		    cell1.setCellValue(record2.getR75_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR75_south_africa() != null) {
		    cell1.setCellValue(record2.getR75_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR75_sadc() != null) {
		    cell1.setCellValue(record2.getR75_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR75_usa() != null) {
		    cell1.setCellValue(record2.getR75_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR75_uk() != null) {
		    cell1.setCellValue(record2.getR75_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR75_europe() != null) {
		    cell1.setCellValue(record2.getR75_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR75_india() != null) {
		    cell1.setCellValue(record2.getR75_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR75_sydney() != null) {
		    cell1.setCellValue(record2.getR75_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR75_uganda() != null) {
		    cell1.setCellValue(record2.getR75_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR75_c10() != null) {
		    cell1.setCellValue(record2.getR75_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR75_c11() != null) {
		    cell1.setCellValue(record2.getR75_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR75_c12() != null) {
		    cell1.setCellValue(record2.getR75_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR75_c13() != null) {
		    cell1.setCellValue(record2.getR75_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR75_c14() != null) {
		    cell1.setCellValue(record2.getR75_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR75_c15() != null) {
		    cell1.setCellValue(record2.getR75_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR75_c16() != null) {
		    cell1.setCellValue(record2.getR75_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR75_total() != null) {
		    cell1.setCellValue(record2.getR75_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row76
		row = sheet.getRow(76);

		cell1 =  row.getCell(1);
		if (record2.getR76_botswana() != null) {
		    cell1.setCellValue(record2.getR76_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR76_south_africa() != null) {
		    cell1.setCellValue(record2.getR76_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR76_sadc() != null) {
		    cell1.setCellValue(record2.getR76_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR76_usa() != null) {
		    cell1.setCellValue(record2.getR76_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR76_uk() != null) {
		    cell1.setCellValue(record2.getR76_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR76_europe() != null) {
		    cell1.setCellValue(record2.getR76_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR76_india() != null) {
		    cell1.setCellValue(record2.getR76_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR76_sydney() != null) {
		    cell1.setCellValue(record2.getR76_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR76_uganda() != null) {
		    cell1.setCellValue(record2.getR76_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR76_c10() != null) {
		    cell1.setCellValue(record2.getR76_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR76_c11() != null) {
		    cell1.setCellValue(record2.getR76_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR76_c12() != null) {
		    cell1.setCellValue(record2.getR76_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR76_c13() != null) {
		    cell1.setCellValue(record2.getR76_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR76_c14() != null) {
		    cell1.setCellValue(record2.getR76_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR76_c15() != null) {
		    cell1.setCellValue(record2.getR76_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR76_c16() != null) {
		    cell1.setCellValue(record2.getR76_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR76_total() != null) {
		    cell1.setCellValue(record2.getR76_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row77
		row = sheet.getRow(77);

		cell1 =  row.getCell(1);
		if (record2.getR77_botswana() != null) {
		    cell1.setCellValue(record2.getR77_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR77_south_africa() != null) {
		    cell1.setCellValue(record2.getR77_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR77_sadc() != null) {
		    cell1.setCellValue(record2.getR77_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR77_usa() != null) {
		    cell1.setCellValue(record2.getR77_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR77_uk() != null) {
		    cell1.setCellValue(record2.getR77_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR77_europe() != null) {
		    cell1.setCellValue(record2.getR77_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR77_india() != null) {
		    cell1.setCellValue(record2.getR77_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR77_sydney() != null) {
		    cell1.setCellValue(record2.getR77_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR77_uganda() != null) {
		    cell1.setCellValue(record2.getR77_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR77_c10() != null) {
		    cell1.setCellValue(record2.getR77_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR77_c11() != null) {
		    cell1.setCellValue(record2.getR77_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR77_c12() != null) {
		    cell1.setCellValue(record2.getR77_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR77_c13() != null) {
		    cell1.setCellValue(record2.getR77_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR77_c14() != null) {
		    cell1.setCellValue(record2.getR77_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR77_c15() != null) {
		    cell1.setCellValue(record2.getR77_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR77_c16() != null) {
		    cell1.setCellValue(record2.getR77_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR77_total() != null) {
		    cell1.setCellValue(record2.getR77_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row78
		row = sheet.getRow(78);

		cell1 =  row.getCell(1);
		if (record2.getR78_botswana() != null) {
		    cell1.setCellValue(record2.getR78_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR78_south_africa() != null) {
		    cell1.setCellValue(record2.getR78_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR78_sadc() != null) {
		    cell1.setCellValue(record2.getR78_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR78_usa() != null) {
		    cell1.setCellValue(record2.getR78_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR78_uk() != null) {
		    cell1.setCellValue(record2.getR78_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR78_europe() != null) {
		    cell1.setCellValue(record2.getR78_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR78_india() != null) {
		    cell1.setCellValue(record2.getR78_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR78_sydney() != null) {
		    cell1.setCellValue(record2.getR78_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR78_uganda() != null) {
		    cell1.setCellValue(record2.getR78_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR78_c10() != null) {
		    cell1.setCellValue(record2.getR78_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR78_c11() != null) {
		    cell1.setCellValue(record2.getR78_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR78_c12() != null) {
		    cell1.setCellValue(record2.getR78_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR78_c13() != null) {
		    cell1.setCellValue(record2.getR78_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR78_c14() != null) {
		    cell1.setCellValue(record2.getR78_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR78_c15() != null) {
		    cell1.setCellValue(record2.getR78_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR78_c16() != null) {
		    cell1.setCellValue(record2.getR78_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR78_total() != null) {
		    cell1.setCellValue(record2.getR78_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row79
		row = sheet.getRow(79);

		cell1 =  row.getCell(1);
		if (record2.getR79_botswana() != null) {
		    cell1.setCellValue(record2.getR79_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR79_south_africa() != null) {
		    cell1.setCellValue(record2.getR79_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR79_sadc() != null) {
		    cell1.setCellValue(record2.getR79_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR79_usa() != null) {
		    cell1.setCellValue(record2.getR79_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR79_uk() != null) {
		    cell1.setCellValue(record2.getR79_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR79_europe() != null) {
		    cell1.setCellValue(record2.getR79_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR79_india() != null) {
		    cell1.setCellValue(record2.getR79_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR79_sydney() != null) {
		    cell1.setCellValue(record2.getR79_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR79_uganda() != null) {
		    cell1.setCellValue(record2.getR79_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR79_c10() != null) {
		    cell1.setCellValue(record2.getR79_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR79_c11() != null) {
		    cell1.setCellValue(record2.getR79_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR79_c12() != null) {
		    cell1.setCellValue(record2.getR79_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR79_c13() != null) {
		    cell1.setCellValue(record2.getR79_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR79_c14() != null) {
		    cell1.setCellValue(record2.getR79_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR79_c15() != null) {
		    cell1.setCellValue(record2.getR79_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR79_c16() != null) {
		    cell1.setCellValue(record2.getR79_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR79_total() != null) {
		    cell1.setCellValue(record2.getR79_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row80
		row = sheet.getRow(80);

		cell1 =  row.getCell(1);
		if (record2.getR80_botswana() != null) {
		    cell1.setCellValue(record2.getR80_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR80_south_africa() != null) {
		    cell1.setCellValue(record2.getR80_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR80_sadc() != null) {
		    cell1.setCellValue(record2.getR80_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR80_usa() != null) {
		    cell1.setCellValue(record2.getR80_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR80_uk() != null) {
		    cell1.setCellValue(record2.getR80_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR80_europe() != null) {
		    cell1.setCellValue(record2.getR80_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR80_india() != null) {
		    cell1.setCellValue(record2.getR80_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR80_sydney() != null) {
		    cell1.setCellValue(record2.getR80_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR80_uganda() != null) {
		    cell1.setCellValue(record2.getR80_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR80_c10() != null) {
		    cell1.setCellValue(record2.getR80_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR80_c11() != null) {
		    cell1.setCellValue(record2.getR80_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR80_c12() != null) {
		    cell1.setCellValue(record2.getR80_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR80_c13() != null) {
		    cell1.setCellValue(record2.getR80_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR80_c14() != null) {
		    cell1.setCellValue(record2.getR80_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR80_c15() != null) {
		    cell1.setCellValue(record2.getR80_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR80_c16() != null) {
		    cell1.setCellValue(record2.getR80_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR80_total() != null) {
		    cell1.setCellValue(record2.getR80_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row81
		row = sheet.getRow(81);

		cell1 =  row.getCell(1);
		if (record2.getR81_botswana() != null) {
		    cell1.setCellValue(record2.getR81_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR81_south_africa() != null) {
		    cell1.setCellValue(record2.getR81_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR81_sadc() != null) {
		    cell1.setCellValue(record2.getR81_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR81_usa() != null) {
		    cell1.setCellValue(record2.getR81_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR81_uk() != null) {
		    cell1.setCellValue(record2.getR81_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR81_europe() != null) {
		    cell1.setCellValue(record2.getR81_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR81_india() != null) {
		    cell1.setCellValue(record2.getR81_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR81_sydney() != null) {
		    cell1.setCellValue(record2.getR81_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR81_uganda() != null) {
		    cell1.setCellValue(record2.getR81_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR81_c10() != null) {
		    cell1.setCellValue(record2.getR81_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR81_c11() != null) {
		    cell1.setCellValue(record2.getR81_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR81_c12() != null) {
		    cell1.setCellValue(record2.getR81_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR81_c13() != null) {
		    cell1.setCellValue(record2.getR81_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR81_c14() != null) {
		    cell1.setCellValue(record2.getR81_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR81_c15() != null) {
		    cell1.setCellValue(record2.getR81_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR81_c16() != null) {
		    cell1.setCellValue(record2.getR81_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR81_total() != null) {
		    cell1.setCellValue(record2.getR81_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row82
		row = sheet.getRow(82);

		cell1 =  row.getCell(1);
		if (record2.getR82_botswana() != null) {
		    cell1.setCellValue(record2.getR82_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR82_south_africa() != null) {
		    cell1.setCellValue(record2.getR82_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR82_sadc() != null) {
		    cell1.setCellValue(record2.getR82_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR82_usa() != null) {
		    cell1.setCellValue(record2.getR82_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR82_uk() != null) {
		    cell1.setCellValue(record2.getR82_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR82_europe() != null) {
		    cell1.setCellValue(record2.getR82_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR82_india() != null) {
		    cell1.setCellValue(record2.getR82_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR82_sydney() != null) {
		    cell1.setCellValue(record2.getR82_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR82_uganda() != null) {
		    cell1.setCellValue(record2.getR82_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR82_c10() != null) {
		    cell1.setCellValue(record2.getR82_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR82_c11() != null) {
		    cell1.setCellValue(record2.getR82_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR82_c12() != null) {
		    cell1.setCellValue(record2.getR82_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR82_c13() != null) {
		    cell1.setCellValue(record2.getR82_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR82_c14() != null) {
		    cell1.setCellValue(record2.getR82_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR82_c15() != null) {
		    cell1.setCellValue(record2.getR82_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR82_c16() != null) {
		    cell1.setCellValue(record2.getR82_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR82_total() != null) {
		    cell1.setCellValue(record2.getR82_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row83
		row = sheet.getRow(83);

		cell1 =  row.getCell(1);
		if (record2.getR83_botswana() != null) {
		    cell1.setCellValue(record2.getR83_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR83_south_africa() != null) {
		    cell1.setCellValue(record2.getR83_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR83_sadc() != null) {
		    cell1.setCellValue(record2.getR83_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR83_usa() != null) {
		    cell1.setCellValue(record2.getR83_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR83_uk() != null) {
		    cell1.setCellValue(record2.getR83_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR83_europe() != null) {
		    cell1.setCellValue(record2.getR83_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR83_india() != null) {
		    cell1.setCellValue(record2.getR83_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR83_sydney() != null) {
		    cell1.setCellValue(record2.getR83_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR83_uganda() != null) {
		    cell1.setCellValue(record2.getR83_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR83_c10() != null) {
		    cell1.setCellValue(record2.getR83_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR83_c11() != null) {
		    cell1.setCellValue(record2.getR83_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR83_c12() != null) {
		    cell1.setCellValue(record2.getR83_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR83_c13() != null) {
		    cell1.setCellValue(record2.getR83_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR83_c14() != null) {
		    cell1.setCellValue(record2.getR83_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR83_c15() != null) {
		    cell1.setCellValue(record2.getR83_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR83_c16() != null) {
		    cell1.setCellValue(record2.getR83_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR83_total() != null) {
		    cell1.setCellValue(record2.getR83_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row84
		row = sheet.getRow(84);

		cell1 =  row.getCell(1);
		if (record2.getR84_botswana() != null) {
		    cell1.setCellValue(record2.getR84_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR84_south_africa() != null) {
		    cell1.setCellValue(record2.getR84_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR84_sadc() != null) {
		    cell1.setCellValue(record2.getR84_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR84_usa() != null) {
		    cell1.setCellValue(record2.getR84_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR84_uk() != null) {
		    cell1.setCellValue(record2.getR84_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR84_europe() != null) {
		    cell1.setCellValue(record2.getR84_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR84_india() != null) {
		    cell1.setCellValue(record2.getR84_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR84_sydney() != null) {
		    cell1.setCellValue(record2.getR84_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR84_uganda() != null) {
		    cell1.setCellValue(record2.getR84_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR84_c10() != null) {
		    cell1.setCellValue(record2.getR84_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR84_c11() != null) {
		    cell1.setCellValue(record2.getR84_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR84_c12() != null) {
		    cell1.setCellValue(record2.getR84_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR84_c13() != null) {
		    cell1.setCellValue(record2.getR84_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR84_c14() != null) {
		    cell1.setCellValue(record2.getR84_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR84_c15() != null) {
		    cell1.setCellValue(record2.getR84_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR84_c16() != null) {
		    cell1.setCellValue(record2.getR84_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR84_total() != null) {
		    cell1.setCellValue(record2.getR84_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row85
		row = sheet.getRow(85);

		cell1 =  row.getCell(1);
		if (record2.getR85_botswana() != null) {
		    cell1.setCellValue(record2.getR85_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR85_south_africa() != null) {
		    cell1.setCellValue(record2.getR85_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR85_sadc() != null) {
		    cell1.setCellValue(record2.getR85_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR85_usa() != null) {
		    cell1.setCellValue(record2.getR85_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR85_uk() != null) {
		    cell1.setCellValue(record2.getR85_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR85_europe() != null) {
		    cell1.setCellValue(record2.getR85_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR85_india() != null) {
		    cell1.setCellValue(record2.getR85_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR85_sydney() != null) {
		    cell1.setCellValue(record2.getR85_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR85_uganda() != null) {
		    cell1.setCellValue(record2.getR85_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR85_c10() != null) {
		    cell1.setCellValue(record2.getR85_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR85_c11() != null) {
		    cell1.setCellValue(record2.getR85_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR85_c12() != null) {
		    cell1.setCellValue(record2.getR85_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR85_c13() != null) {
		    cell1.setCellValue(record2.getR85_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR85_c14() != null) {
		    cell1.setCellValue(record2.getR85_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR85_c15() != null) {
		    cell1.setCellValue(record2.getR85_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR85_c16() != null) {
		    cell1.setCellValue(record2.getR85_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR85_total() != null) {
		    cell1.setCellValue(record2.getR85_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row86
		row = sheet.getRow(86);

		cell1 =  row.getCell(1);
		if (record2.getR86_botswana() != null) {
		    cell1.setCellValue(record2.getR86_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR86_south_africa() != null) {
		    cell1.setCellValue(record2.getR86_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR86_sadc() != null) {
		    cell1.setCellValue(record2.getR86_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR86_usa() != null) {
		    cell1.setCellValue(record2.getR86_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR86_uk() != null) {
		    cell1.setCellValue(record2.getR86_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR86_europe() != null) {
		    cell1.setCellValue(record2.getR86_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR86_india() != null) {
		    cell1.setCellValue(record2.getR86_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR86_sydney() != null) {
		    cell1.setCellValue(record2.getR86_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR86_uganda() != null) {
		    cell1.setCellValue(record2.getR86_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR86_c10() != null) {
		    cell1.setCellValue(record2.getR86_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR86_c11() != null) {
		    cell1.setCellValue(record2.getR86_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR86_c12() != null) {
		    cell1.setCellValue(record2.getR86_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR86_c13() != null) {
		    cell1.setCellValue(record2.getR86_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR86_c14() != null) {
		    cell1.setCellValue(record2.getR86_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR86_c15() != null) {
		    cell1.setCellValue(record2.getR86_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR86_c16() != null) {
		    cell1.setCellValue(record2.getR86_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR86_total() != null) {
		    cell1.setCellValue(record2.getR86_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row87
		row = sheet.getRow(87);

		cell1 =  row.getCell(1);
		if (record2.getR87_botswana() != null) {
		    cell1.setCellValue(record2.getR87_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR87_south_africa() != null) {
		    cell1.setCellValue(record2.getR87_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR87_sadc() != null) {
		    cell1.setCellValue(record2.getR87_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR87_usa() != null) {
		    cell1.setCellValue(record2.getR87_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR87_uk() != null) {
		    cell1.setCellValue(record2.getR87_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR87_europe() != null) {
		    cell1.setCellValue(record2.getR87_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR87_india() != null) {
		    cell1.setCellValue(record2.getR87_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR87_sydney() != null) {
		    cell1.setCellValue(record2.getR87_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR87_uganda() != null) {
		    cell1.setCellValue(record2.getR87_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR87_c10() != null) {
		    cell1.setCellValue(record2.getR87_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR87_c11() != null) {
		    cell1.setCellValue(record2.getR87_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR87_c12() != null) {
		    cell1.setCellValue(record2.getR87_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR87_c13() != null) {
		    cell1.setCellValue(record2.getR87_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR87_c14() != null) {
		    cell1.setCellValue(record2.getR87_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR87_c15() != null) {
		    cell1.setCellValue(record2.getR87_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR87_c16() != null) {
		    cell1.setCellValue(record2.getR87_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR87_total() != null) {
		    cell1.setCellValue(record2.getR87_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row88
		row = sheet.getRow(88);

		cell1 =  row.getCell(1);
		if (record2.getR88_botswana() != null) {
		    cell1.setCellValue(record2.getR88_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR88_south_africa() != null) {
		    cell1.setCellValue(record2.getR88_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR88_sadc() != null) {
		    cell1.setCellValue(record2.getR88_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR88_usa() != null) {
		    cell1.setCellValue(record2.getR88_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR88_uk() != null) {
		    cell1.setCellValue(record2.getR88_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR88_europe() != null) {
		    cell1.setCellValue(record2.getR88_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR88_india() != null) {
		    cell1.setCellValue(record2.getR88_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR88_sydney() != null) {
		    cell1.setCellValue(record2.getR88_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR88_uganda() != null) {
		    cell1.setCellValue(record2.getR88_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR88_c10() != null) {
		    cell1.setCellValue(record2.getR88_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR88_c11() != null) {
		    cell1.setCellValue(record2.getR88_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR88_c12() != null) {
		    cell1.setCellValue(record2.getR88_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR88_c13() != null) {
		    cell1.setCellValue(record2.getR88_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR88_c14() != null) {
		    cell1.setCellValue(record2.getR88_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR88_c15() != null) {
		    cell1.setCellValue(record2.getR88_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR88_c16() != null) {
		    cell1.setCellValue(record2.getR88_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR88_total() != null) {
		    cell1.setCellValue(record2.getR88_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row89
		row = sheet.getRow(89);

		cell1 =  row.getCell(1);
		if (record2.getR89_botswana() != null) {
		    cell1.setCellValue(record2.getR89_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR89_south_africa() != null) {
		    cell1.setCellValue(record2.getR89_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR89_sadc() != null) {
		    cell1.setCellValue(record2.getR89_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR89_usa() != null) {
		    cell1.setCellValue(record2.getR89_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR89_uk() != null) {
		    cell1.setCellValue(record2.getR89_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR89_europe() != null) {
		    cell1.setCellValue(record2.getR89_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR89_india() != null) {
		    cell1.setCellValue(record2.getR89_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR89_sydney() != null) {
		    cell1.setCellValue(record2.getR89_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR89_uganda() != null) {
		    cell1.setCellValue(record2.getR89_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR89_c10() != null) {
		    cell1.setCellValue(record2.getR89_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR89_c11() != null) {
		    cell1.setCellValue(record2.getR89_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR89_c12() != null) {
		    cell1.setCellValue(record2.getR89_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR89_c13() != null) {
		    cell1.setCellValue(record2.getR89_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR89_c14() != null) {
		    cell1.setCellValue(record2.getR89_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR89_c15() != null) {
		    cell1.setCellValue(record2.getR89_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR89_c16() != null) {
		    cell1.setCellValue(record2.getR89_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR89_total() != null) {
		    cell1.setCellValue(record2.getR89_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row90
		row = sheet.getRow(90);

		cell1 =  row.getCell(1);
		if (record2.getR90_botswana() != null) {
		    cell1.setCellValue(record2.getR90_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR90_south_africa() != null) {
		    cell1.setCellValue(record2.getR90_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR90_sadc() != null) {
		    cell1.setCellValue(record2.getR90_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR90_usa() != null) {
		    cell1.setCellValue(record2.getR90_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR90_uk() != null) {
		    cell1.setCellValue(record2.getR90_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR90_europe() != null) {
		    cell1.setCellValue(record2.getR90_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR90_india() != null) {
		    cell1.setCellValue(record2.getR90_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR90_sydney() != null) {
		    cell1.setCellValue(record2.getR90_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR90_uganda() != null) {
		    cell1.setCellValue(record2.getR90_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR90_c10() != null) {
		    cell1.setCellValue(record2.getR90_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR90_c11() != null) {
		    cell1.setCellValue(record2.getR90_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR90_c12() != null) {
		    cell1.setCellValue(record2.getR90_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR90_c13() != null) {
		    cell1.setCellValue(record2.getR90_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR90_c14() != null) {
		    cell1.setCellValue(record2.getR90_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR90_c15() != null) {
		    cell1.setCellValue(record2.getR90_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR90_c16() != null) {
		    cell1.setCellValue(record2.getR90_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR90_total() != null) {
		    cell1.setCellValue(record2.getR90_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row91
		row = sheet.getRow(91);

		cell1 =  row.getCell(1);
		if (record2.getR91_botswana() != null) {
		    cell1.setCellValue(record2.getR91_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR91_south_africa() != null) {
		    cell1.setCellValue(record2.getR91_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR91_sadc() != null) {
		    cell1.setCellValue(record2.getR91_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR91_usa() != null) {
		    cell1.setCellValue(record2.getR91_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR91_uk() != null) {
		    cell1.setCellValue(record2.getR91_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR91_europe() != null) {
		    cell1.setCellValue(record2.getR91_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR91_india() != null) {
		    cell1.setCellValue(record2.getR91_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR91_sydney() != null) {
		    cell1.setCellValue(record2.getR91_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR91_uganda() != null) {
		    cell1.setCellValue(record2.getR91_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR91_c10() != null) {
		    cell1.setCellValue(record2.getR91_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR91_c11() != null) {
		    cell1.setCellValue(record2.getR91_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR91_c12() != null) {
		    cell1.setCellValue(record2.getR91_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR91_c13() != null) {
		    cell1.setCellValue(record2.getR91_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR91_c14() != null) {
		    cell1.setCellValue(record2.getR91_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR91_c15() != null) {
		    cell1.setCellValue(record2.getR91_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR91_c16() != null) {
		    cell1.setCellValue(record2.getR91_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR91_total() != null) {
		    cell1.setCellValue(record2.getR91_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row92
		row = sheet.getRow(92);

		cell1 =  row.getCell(1);
		if (record2.getR92_botswana() != null) {
		    cell1.setCellValue(record2.getR92_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR92_south_africa() != null) {
		    cell1.setCellValue(record2.getR92_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR92_sadc() != null) {
		    cell1.setCellValue(record2.getR92_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR92_usa() != null) {
		    cell1.setCellValue(record2.getR92_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR92_uk() != null) {
		    cell1.setCellValue(record2.getR92_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR92_europe() != null) {
		    cell1.setCellValue(record2.getR92_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR92_india() != null) {
		    cell1.setCellValue(record2.getR92_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR92_sydney() != null) {
		    cell1.setCellValue(record2.getR92_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR92_uganda() != null) {
		    cell1.setCellValue(record2.getR92_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR92_c10() != null) {
		    cell1.setCellValue(record2.getR92_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR92_c11() != null) {
		    cell1.setCellValue(record2.getR92_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR92_c12() != null) {
		    cell1.setCellValue(record2.getR92_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR92_c13() != null) {
		    cell1.setCellValue(record2.getR92_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR92_c14() != null) {
		    cell1.setCellValue(record2.getR92_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR92_c15() != null) {
		    cell1.setCellValue(record2.getR92_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR92_c16() != null) {
		    cell1.setCellValue(record2.getR92_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR92_total() != null) {
		    cell1.setCellValue(record2.getR92_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row93
		row = sheet.getRow(93);

		cell1 =  row.getCell(1);
		if (record2.getR93_botswana() != null) {
		    cell1.setCellValue(record2.getR93_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR93_south_africa() != null) {
		    cell1.setCellValue(record2.getR93_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR93_sadc() != null) {
		    cell1.setCellValue(record2.getR93_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR93_usa() != null) {
		    cell1.setCellValue(record2.getR93_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR93_uk() != null) {
		    cell1.setCellValue(record2.getR93_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR93_europe() != null) {
		    cell1.setCellValue(record2.getR93_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR93_india() != null) {
		    cell1.setCellValue(record2.getR93_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR93_sydney() != null) {
		    cell1.setCellValue(record2.getR93_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR93_uganda() != null) {
		    cell1.setCellValue(record2.getR93_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR93_c10() != null) {
		    cell1.setCellValue(record2.getR93_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR93_c11() != null) {
		    cell1.setCellValue(record2.getR93_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR93_c12() != null) {
		    cell1.setCellValue(record2.getR93_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR93_c13() != null) {
		    cell1.setCellValue(record2.getR93_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR93_c14() != null) {
		    cell1.setCellValue(record2.getR93_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR93_c15() != null) {
		    cell1.setCellValue(record2.getR93_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR93_c16() != null) {
		    cell1.setCellValue(record2.getR93_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR93_total() != null) {
		    cell1.setCellValue(record2.getR93_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row94
		row = sheet.getRow(94);

		cell1 =  row.getCell(1);
		if (record2.getR94_botswana() != null) {
		    cell1.setCellValue(record2.getR94_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR94_south_africa() != null) {
		    cell1.setCellValue(record2.getR94_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR94_sadc() != null) {
		    cell1.setCellValue(record2.getR94_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR94_usa() != null) {
		    cell1.setCellValue(record2.getR94_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR94_uk() != null) {
		    cell1.setCellValue(record2.getR94_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR94_europe() != null) {
		    cell1.setCellValue(record2.getR94_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR94_india() != null) {
		    cell1.setCellValue(record2.getR94_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR94_sydney() != null) {
		    cell1.setCellValue(record2.getR94_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR94_uganda() != null) {
		    cell1.setCellValue(record2.getR94_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR94_c10() != null) {
		    cell1.setCellValue(record2.getR94_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR94_c11() != null) {
		    cell1.setCellValue(record2.getR94_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR94_c12() != null) {
		    cell1.setCellValue(record2.getR94_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR94_c13() != null) {
		    cell1.setCellValue(record2.getR94_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR94_c14() != null) {
		    cell1.setCellValue(record2.getR94_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR94_c15() != null) {
		    cell1.setCellValue(record2.getR94_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR94_c16() != null) {
		    cell1.setCellValue(record2.getR94_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR94_total() != null) {
		    cell1.setCellValue(record2.getR94_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		//row95
		row = sheet.getRow(95);

		cell1 =  row.getCell(1);
		if (record2.getR95_botswana() != null) {
		    cell1.setCellValue(record2.getR95_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR95_south_africa() != null) {
		    cell1.setCellValue(record2.getR95_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR95_sadc() != null) {
		    cell1.setCellValue(record2.getR95_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR95_usa() != null) {
		    cell1.setCellValue(record2.getR95_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR95_uk() != null) {
		    cell1.setCellValue(record2.getR95_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR95_europe() != null) {
		    cell1.setCellValue(record2.getR95_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR95_india() != null) {
		    cell1.setCellValue(record2.getR95_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR95_sydney() != null) {
		    cell1.setCellValue(record2.getR95_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR95_uganda() != null) {
		    cell1.setCellValue(record2.getR95_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR95_c10() != null) {
		    cell1.setCellValue(record2.getR95_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR95_c11() != null) {
		    cell1.setCellValue(record2.getR95_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR95_c12() != null) {
		    cell1.setCellValue(record2.getR95_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR95_c13() != null) {
		    cell1.setCellValue(record2.getR95_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR95_c14() != null) {
		    cell1.setCellValue(record2.getR95_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR95_c15() != null) {
		    cell1.setCellValue(record2.getR95_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR95_c16() != null) {
		    cell1.setCellValue(record2.getR95_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR95_total() != null) {
		    cell1.setCellValue(record2.getR95_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row96
		row = sheet.getRow(96);

		cell1 =  row.getCell(1);
		if (record2.getR96_botswana() != null) {
		    cell1.setCellValue(record2.getR96_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR96_south_africa() != null) {
		    cell1.setCellValue(record2.getR96_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR96_sadc() != null) {
		    cell1.setCellValue(record2.getR96_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR96_usa() != null) {
		    cell1.setCellValue(record2.getR96_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR96_uk() != null) {
		    cell1.setCellValue(record2.getR96_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR96_europe() != null) {
		    cell1.setCellValue(record2.getR96_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR96_india() != null) {
		    cell1.setCellValue(record2.getR96_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR96_sydney() != null) {
		    cell1.setCellValue(record2.getR96_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR96_uganda() != null) {
		    cell1.setCellValue(record2.getR96_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR96_c10() != null) {
		    cell1.setCellValue(record2.getR96_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR96_c11() != null) {
		    cell1.setCellValue(record2.getR96_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR96_c12() != null) {
		    cell1.setCellValue(record2.getR96_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR96_c13() != null) {
		    cell1.setCellValue(record2.getR96_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR96_c14() != null) {
		    cell1.setCellValue(record2.getR96_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR96_c15() != null) {
		    cell1.setCellValue(record2.getR96_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR96_c16() != null) {
		    cell1.setCellValue(record2.getR96_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR96_total() != null) {
		    cell1.setCellValue(record2.getR96_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row97
		row = sheet.getRow(97);

		cell1 =  row.getCell(1);
		if (record2.getR97_botswana() != null) {
		    cell1.setCellValue(record2.getR97_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR97_south_africa() != null) {
		    cell1.setCellValue(record2.getR97_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR97_sadc() != null) {
		    cell1.setCellValue(record2.getR97_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR97_usa() != null) {
		    cell1.setCellValue(record2.getR97_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR97_uk() != null) {
		    cell1.setCellValue(record2.getR97_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR97_europe() != null) {
		    cell1.setCellValue(record2.getR97_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR97_india() != null) {
		    cell1.setCellValue(record2.getR97_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR97_sydney() != null) {
		    cell1.setCellValue(record2.getR97_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR97_uganda() != null) {
		    cell1.setCellValue(record2.getR97_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR97_c10() != null) {
		    cell1.setCellValue(record2.getR97_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR97_c11() != null) {
		    cell1.setCellValue(record2.getR97_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR97_c12() != null) {
		    cell1.setCellValue(record2.getR97_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR97_c13() != null) {
		    cell1.setCellValue(record2.getR97_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR97_c14() != null) {
		    cell1.setCellValue(record2.getR97_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR97_c15() != null) {
		    cell1.setCellValue(record2.getR97_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR97_c16() != null) {
		    cell1.setCellValue(record2.getR97_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR97_total() != null) {
		    cell1.setCellValue(record2.getR97_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row98
		row = sheet.getRow(98);

		cell1 =  row.getCell(1);
		if (record2.getR98_botswana() != null) {
		    cell1.setCellValue(record2.getR98_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR98_south_africa() != null) {
		    cell1.setCellValue(record2.getR98_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR98_sadc() != null) {
		    cell1.setCellValue(record2.getR98_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR98_usa() != null) {
		    cell1.setCellValue(record2.getR98_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR98_uk() != null) {
		    cell1.setCellValue(record2.getR98_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR98_europe() != null) {
		    cell1.setCellValue(record2.getR98_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR98_india() != null) {
		    cell1.setCellValue(record2.getR98_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR98_sydney() != null) {
		    cell1.setCellValue(record2.getR98_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR98_uganda() != null) {
		    cell1.setCellValue(record2.getR98_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR98_c10() != null) {
		    cell1.setCellValue(record2.getR98_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR98_c11() != null) {
		    cell1.setCellValue(record2.getR98_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR98_c12() != null) {
		    cell1.setCellValue(record2.getR98_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR98_c13() != null) {
		    cell1.setCellValue(record2.getR98_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR98_c14() != null) {
		    cell1.setCellValue(record2.getR98_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR98_c15() != null) {
		    cell1.setCellValue(record2.getR98_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR98_c16() != null) {
		    cell1.setCellValue(record2.getR98_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR98_total() != null) {
		    cell1.setCellValue(record2.getR98_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row99
		row = sheet.getRow(99);

		cell1 =  row.getCell(1);
		if (record2.getR99_botswana() != null) {
		    cell1.setCellValue(record2.getR99_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR99_south_africa() != null) {
		    cell1.setCellValue(record2.getR99_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR99_sadc() != null) {
		    cell1.setCellValue(record2.getR99_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR99_usa() != null) {
		    cell1.setCellValue(record2.getR99_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR99_uk() != null) {
		    cell1.setCellValue(record2.getR99_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR99_europe() != null) {
		    cell1.setCellValue(record2.getR99_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR99_india() != null) {
		    cell1.setCellValue(record2.getR99_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR99_sydney() != null) {
		    cell1.setCellValue(record2.getR99_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR99_uganda() != null) {
		    cell1.setCellValue(record2.getR99_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR99_c10() != null) {
		    cell1.setCellValue(record2.getR99_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR99_c11() != null) {
		    cell1.setCellValue(record2.getR99_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR99_c12() != null) {
		    cell1.setCellValue(record2.getR99_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR99_c13() != null) {
		    cell1.setCellValue(record2.getR99_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR99_c14() != null) {
		    cell1.setCellValue(record2.getR99_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR99_c15() != null) {
		    cell1.setCellValue(record2.getR99_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR99_c16() != null) {
		    cell1.setCellValue(record2.getR99_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR99_total() != null) {
		    cell1.setCellValue(record2.getR99_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row100
		row = sheet.getRow(100);

		cell1 =  row.getCell(1);
		if (record2.getR100_botswana() != null) {
		    cell1.setCellValue(record2.getR100_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR100_south_africa() != null) {
		    cell1.setCellValue(record2.getR100_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR100_sadc() != null) {
		    cell1.setCellValue(record2.getR100_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR100_usa() != null) {
		    cell1.setCellValue(record2.getR100_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR100_uk() != null) {
		    cell1.setCellValue(record2.getR100_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR100_europe() != null) {
		    cell1.setCellValue(record2.getR100_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR100_india() != null) {
		    cell1.setCellValue(record2.getR100_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR100_sydney() != null) {
		    cell1.setCellValue(record2.getR100_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR100_uganda() != null) {
		    cell1.setCellValue(record2.getR100_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR100_c10() != null) {
		    cell1.setCellValue(record2.getR100_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR100_c11() != null) {
		    cell1.setCellValue(record2.getR100_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR100_c12() != null) {
		    cell1.setCellValue(record2.getR100_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR100_c13() != null) {
		    cell1.setCellValue(record2.getR100_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR100_c14() != null) {
		    cell1.setCellValue(record2.getR100_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR100_c15() != null) {
		    cell1.setCellValue(record2.getR100_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR100_c16() != null) {
		    cell1.setCellValue(record2.getR100_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR100_total() != null) {
		    cell1.setCellValue(record2.getR100_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row101
		row = sheet.getRow(101);

		cell1 =  row.getCell(1);
		if (record2.getR101_botswana() != null) {
		    cell1.setCellValue(record2.getR101_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR101_south_africa() != null) {
		    cell1.setCellValue(record2.getR101_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR101_sadc() != null) {
		    cell1.setCellValue(record2.getR101_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR101_usa() != null) {
		    cell1.setCellValue(record2.getR101_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR101_uk() != null) {
		    cell1.setCellValue(record2.getR101_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR101_europe() != null) {
		    cell1.setCellValue(record2.getR101_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR101_india() != null) {
		    cell1.setCellValue(record2.getR101_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR101_sydney() != null) {
		    cell1.setCellValue(record2.getR101_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR101_uganda() != null) {
		    cell1.setCellValue(record2.getR101_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR101_c10() != null) {
		    cell1.setCellValue(record2.getR101_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR101_c11() != null) {
		    cell1.setCellValue(record2.getR101_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR101_c12() != null) {
		    cell1.setCellValue(record2.getR101_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR101_c13() != null) {
		    cell1.setCellValue(record2.getR101_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR101_c14() != null) {
		    cell1.setCellValue(record2.getR101_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR101_c15() != null) {
		    cell1.setCellValue(record2.getR101_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR101_c16() != null) {
		    cell1.setCellValue(record2.getR101_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR101_total() != null) {
		    cell1.setCellValue(record2.getR101_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row102
		row = sheet.getRow(102);

		cell1 =  row.getCell(1);
		if (record2.getR102_botswana() != null) {
		    cell1.setCellValue(record2.getR102_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR102_south_africa() != null) {
		    cell1.setCellValue(record2.getR102_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR102_sadc() != null) {
		    cell1.setCellValue(record2.getR102_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR102_usa() != null) {
		    cell1.setCellValue(record2.getR102_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR102_uk() != null) {
		    cell1.setCellValue(record2.getR102_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR102_europe() != null) {
		    cell1.setCellValue(record2.getR102_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR102_india() != null) {
		    cell1.setCellValue(record2.getR102_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR102_sydney() != null) {
		    cell1.setCellValue(record2.getR102_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR102_uganda() != null) {
		    cell1.setCellValue(record2.getR102_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR102_c10() != null) {
		    cell1.setCellValue(record2.getR102_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR102_c11() != null) {
		    cell1.setCellValue(record2.getR102_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR102_c12() != null) {
		    cell1.setCellValue(record2.getR102_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR102_c13() != null) {
		    cell1.setCellValue(record2.getR102_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR102_c14() != null) {
		    cell1.setCellValue(record2.getR102_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR102_c15() != null) {
		    cell1.setCellValue(record2.getR102_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR102_c16() != null) {
		    cell1.setCellValue(record2.getR102_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR102_total() != null) {
		    cell1.setCellValue(record2.getR102_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row103
		row = sheet.getRow(103);

		cell1 =  row.getCell(1);
		if (record2.getR103_botswana() != null) {
		    cell1.setCellValue(record2.getR103_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR103_south_africa() != null) {
		    cell1.setCellValue(record2.getR103_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR103_sadc() != null) {
		    cell1.setCellValue(record2.getR103_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR103_usa() != null) {
		    cell1.setCellValue(record2.getR103_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR103_uk() != null) {
		    cell1.setCellValue(record2.getR103_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR103_europe() != null) {
		    cell1.setCellValue(record2.getR103_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR103_india() != null) {
		    cell1.setCellValue(record2.getR103_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR103_sydney() != null) {
		    cell1.setCellValue(record2.getR103_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR103_uganda() != null) {
		    cell1.setCellValue(record2.getR103_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR103_c10() != null) {
		    cell1.setCellValue(record2.getR103_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR103_c11() != null) {
		    cell1.setCellValue(record2.getR103_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR103_c12() != null) {
		    cell1.setCellValue(record2.getR103_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR103_c13() != null) {
		    cell1.setCellValue(record2.getR103_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR103_c14() != null) {
		    cell1.setCellValue(record2.getR103_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR103_c15() != null) {
		    cell1.setCellValue(record2.getR103_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR103_c16() != null) {
		    cell1.setCellValue(record2.getR103_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR103_total() != null) {
		    cell1.setCellValue(record2.getR103_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row104
		row = sheet.getRow(104);

		cell1 =  row.getCell(1);
		if (record2.getR104_botswana() != null) {
		    cell1.setCellValue(record2.getR104_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR104_south_africa() != null) {
		    cell1.setCellValue(record2.getR104_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR104_sadc() != null) {
		    cell1.setCellValue(record2.getR104_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR104_usa() != null) {
		    cell1.setCellValue(record2.getR104_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR104_uk() != null) {
		    cell1.setCellValue(record2.getR104_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR104_europe() != null) {
		    cell1.setCellValue(record2.getR104_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR104_india() != null) {
		    cell1.setCellValue(record2.getR104_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR104_sydney() != null) {
		    cell1.setCellValue(record2.getR104_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR104_uganda() != null) {
		    cell1.setCellValue(record2.getR104_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR104_c10() != null) {
		    cell1.setCellValue(record2.getR104_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR104_c11() != null) {
		    cell1.setCellValue(record2.getR104_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR104_c12() != null) {
		    cell1.setCellValue(record2.getR104_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR104_c13() != null) {
		    cell1.setCellValue(record2.getR104_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR104_c14() != null) {
		    cell1.setCellValue(record2.getR104_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR104_c15() != null) {
		    cell1.setCellValue(record2.getR104_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR104_c16() != null) {
		    cell1.setCellValue(record2.getR104_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR104_total() != null) {
		    cell1.setCellValue(record2.getR104_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row105
		row = sheet.getRow(105);

		cell1 =  row.getCell(1);
		if (record2.getR105_botswana() != null) {
		    cell1.setCellValue(record2.getR105_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR105_south_africa() != null) {
		    cell1.setCellValue(record2.getR105_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR105_sadc() != null) {
		    cell1.setCellValue(record2.getR105_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR105_usa() != null) {
		    cell1.setCellValue(record2.getR105_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR105_uk() != null) {
		    cell1.setCellValue(record2.getR105_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR105_europe() != null) {
		    cell1.setCellValue(record2.getR105_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR105_india() != null) {
		    cell1.setCellValue(record2.getR105_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR105_sydney() != null) {
		    cell1.setCellValue(record2.getR105_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR105_uganda() != null) {
		    cell1.setCellValue(record2.getR105_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR105_c10() != null) {
		    cell1.setCellValue(record2.getR105_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR105_c11() != null) {
		    cell1.setCellValue(record2.getR105_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR105_c12() != null) {
		    cell1.setCellValue(record2.getR105_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR105_c13() != null) {
		    cell1.setCellValue(record2.getR105_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR105_c14() != null) {
		    cell1.setCellValue(record2.getR105_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR105_c15() != null) {
		    cell1.setCellValue(record2.getR105_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR105_c16() != null) {
		    cell1.setCellValue(record2.getR105_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR105_total() != null) {
		    cell1.setCellValue(record2.getR105_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row106
		row = sheet.getRow(106);

		cell1 =  row.getCell(1);
		if (record2.getR106_botswana() != null) {
		    cell1.setCellValue(record2.getR106_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR106_south_africa() != null) {
		    cell1.setCellValue(record2.getR106_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR106_sadc() != null) {
		    cell1.setCellValue(record2.getR106_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR106_usa() != null) {
		    cell1.setCellValue(record2.getR106_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR106_uk() != null) {
		    cell1.setCellValue(record2.getR106_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR106_europe() != null) {
		    cell1.setCellValue(record2.getR106_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR106_india() != null) {
		    cell1.setCellValue(record2.getR106_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR106_sydney() != null) {
		    cell1.setCellValue(record2.getR106_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR106_uganda() != null) {
		    cell1.setCellValue(record2.getR106_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR106_c10() != null) {
		    cell1.setCellValue(record2.getR106_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR106_c11() != null) {
		    cell1.setCellValue(record2.getR106_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR106_c12() != null) {
		    cell1.setCellValue(record2.getR106_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR106_c13() != null) {
		    cell1.setCellValue(record2.getR106_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR106_c14() != null) {
		    cell1.setCellValue(record2.getR106_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR106_c15() != null) {
		    cell1.setCellValue(record2.getR106_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR106_c16() != null) {
		    cell1.setCellValue(record2.getR106_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR106_total() != null) {
		    cell1.setCellValue(record2.getR106_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row107
		row = sheet.getRow(107);

		cell1 =  row.getCell(1);
		if (record2.getR107_botswana() != null) {
		    cell1.setCellValue(record2.getR107_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR107_south_africa() != null) {
		    cell1.setCellValue(record2.getR107_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR107_sadc() != null) {
		    cell1.setCellValue(record2.getR107_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR107_usa() != null) {
		    cell1.setCellValue(record2.getR107_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR107_uk() != null) {
		    cell1.setCellValue(record2.getR107_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR107_europe() != null) {
		    cell1.setCellValue(record2.getR107_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR107_india() != null) {
		    cell1.setCellValue(record2.getR107_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR107_sydney() != null) {
		    cell1.setCellValue(record2.getR107_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR107_uganda() != null) {
		    cell1.setCellValue(record2.getR107_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR107_c10() != null) {
		    cell1.setCellValue(record2.getR107_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR107_c11() != null) {
		    cell1.setCellValue(record2.getR107_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR107_c12() != null) {
		    cell1.setCellValue(record2.getR107_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR107_c13() != null) {
		    cell1.setCellValue(record2.getR107_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR107_c14() != null) {
		    cell1.setCellValue(record2.getR107_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR107_c15() != null) {
		    cell1.setCellValue(record2.getR107_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR107_c16() != null) {
		    cell1.setCellValue(record2.getR107_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR107_total() != null) {
		    cell1.setCellValue(record2.getR107_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row108
		row = sheet.getRow(108);

		cell1 =  row.getCell(1);
		if (record2.getR108_botswana() != null) {
		    cell1.setCellValue(record2.getR108_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR108_south_africa() != null) {
		    cell1.setCellValue(record2.getR108_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR108_sadc() != null) {
		    cell1.setCellValue(record2.getR108_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR108_usa() != null) {
		    cell1.setCellValue(record2.getR108_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR108_uk() != null) {
		    cell1.setCellValue(record2.getR108_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR108_europe() != null) {
		    cell1.setCellValue(record2.getR108_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR108_india() != null) {
		    cell1.setCellValue(record2.getR108_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR108_sydney() != null) {
		    cell1.setCellValue(record2.getR108_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR108_uganda() != null) {
		    cell1.setCellValue(record2.getR108_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR108_c10() != null) {
		    cell1.setCellValue(record2.getR108_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR108_c11() != null) {
		    cell1.setCellValue(record2.getR108_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR108_c12() != null) {
		    cell1.setCellValue(record2.getR108_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR108_c13() != null) {
		    cell1.setCellValue(record2.getR108_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR108_c14() != null) {
		    cell1.setCellValue(record2.getR108_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR108_c15() != null) {
		    cell1.setCellValue(record2.getR108_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR108_c16() != null) {
		    cell1.setCellValue(record2.getR108_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR108_total() != null) {
		    cell1.setCellValue(record2.getR108_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row109
		row = sheet.getRow(109);

		cell1 =  row.getCell(1);
		if (record2.getR109_botswana() != null) {
		    cell1.setCellValue(record2.getR109_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR109_south_africa() != null) {
		    cell1.setCellValue(record2.getR109_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR109_sadc() != null) {
		    cell1.setCellValue(record2.getR109_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR109_usa() != null) {
		    cell1.setCellValue(record2.getR109_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR109_uk() != null) {
		    cell1.setCellValue(record2.getR109_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR109_europe() != null) {
		    cell1.setCellValue(record2.getR109_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR109_india() != null) {
		    cell1.setCellValue(record2.getR109_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR109_sydney() != null) {
		    cell1.setCellValue(record2.getR109_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR109_uganda() != null) {
		    cell1.setCellValue(record2.getR109_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR109_c10() != null) {
		    cell1.setCellValue(record2.getR109_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR109_c11() != null) {
		    cell1.setCellValue(record2.getR109_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR109_c12() != null) {
		    cell1.setCellValue(record2.getR109_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR109_c13() != null) {
		    cell1.setCellValue(record2.getR109_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR109_c14() != null) {
		    cell1.setCellValue(record2.getR109_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR109_c15() != null) {
		    cell1.setCellValue(record2.getR109_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR109_c16() != null) {
		    cell1.setCellValue(record2.getR109_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR109_total() != null) {
		    cell1.setCellValue(record2.getR109_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row110
		row = sheet.getRow(110);

		cell1 =  row.getCell(1);
		if (record2.getR110_botswana() != null) {
		    cell1.setCellValue(record2.getR110_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR110_south_africa() != null) {
		    cell1.setCellValue(record2.getR110_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR110_sadc() != null) {
		    cell1.setCellValue(record2.getR110_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR110_usa() != null) {
		    cell1.setCellValue(record2.getR110_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR110_uk() != null) {
		    cell1.setCellValue(record2.getR110_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR110_europe() != null) {
		    cell1.setCellValue(record2.getR110_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR110_india() != null) {
		    cell1.setCellValue(record2.getR110_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR110_sydney() != null) {
		    cell1.setCellValue(record2.getR110_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR110_uganda() != null) {
		    cell1.setCellValue(record2.getR110_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR110_c10() != null) {
		    cell1.setCellValue(record2.getR110_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR110_c11() != null) {
		    cell1.setCellValue(record2.getR110_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR110_c12() != null) {
		    cell1.setCellValue(record2.getR110_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR110_c13() != null) {
		    cell1.setCellValue(record2.getR110_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR110_c14() != null) {
		    cell1.setCellValue(record2.getR110_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR110_c15() != null) {
		    cell1.setCellValue(record2.getR110_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR110_c16() != null) {
		    cell1.setCellValue(record2.getR110_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR110_total() != null) {
		    cell1.setCellValue(record2.getR110_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row111
		row = sheet.getRow(111);

		cell1 =  row.getCell(1);
		if (record2.getR111_botswana() != null) {
		    cell1.setCellValue(record2.getR111_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR111_south_africa() != null) {
		    cell1.setCellValue(record2.getR111_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR111_sadc() != null) {
		    cell1.setCellValue(record2.getR111_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR111_usa() != null) {
		    cell1.setCellValue(record2.getR111_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR111_uk() != null) {
		    cell1.setCellValue(record2.getR111_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR111_europe() != null) {
		    cell1.setCellValue(record2.getR111_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR111_india() != null) {
		    cell1.setCellValue(record2.getR111_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR111_sydney() != null) {
		    cell1.setCellValue(record2.getR111_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR111_uganda() != null) {
		    cell1.setCellValue(record2.getR111_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR111_c10() != null) {
		    cell1.setCellValue(record2.getR111_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR111_c11() != null) {
		    cell1.setCellValue(record2.getR111_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR111_c12() != null) {
		    cell1.setCellValue(record2.getR111_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR111_c13() != null) {
		    cell1.setCellValue(record2.getR111_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR111_c14() != null) {
		    cell1.setCellValue(record2.getR111_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR111_c15() != null) {
		    cell1.setCellValue(record2.getR111_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR111_c16() != null) {
		    cell1.setCellValue(record2.getR111_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR111_total() != null) {
		    cell1.setCellValue(record2.getR111_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row112
		row = sheet.getRow(112);

		cell1 =  row.getCell(1);
		if (record2.getR112_botswana() != null) {
		    cell1.setCellValue(record2.getR112_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR112_south_africa() != null) {
		    cell1.setCellValue(record2.getR112_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR112_sadc() != null) {
		    cell1.setCellValue(record2.getR112_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR112_usa() != null) {
		    cell1.setCellValue(record2.getR112_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR112_uk() != null) {
		    cell1.setCellValue(record2.getR112_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR112_europe() != null) {
		    cell1.setCellValue(record2.getR112_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR112_india() != null) {
		    cell1.setCellValue(record2.getR112_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR112_sydney() != null) {
		    cell1.setCellValue(record2.getR112_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR112_uganda() != null) {
		    cell1.setCellValue(record2.getR112_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR112_c10() != null) {
		    cell1.setCellValue(record2.getR112_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR112_c11() != null) {
		    cell1.setCellValue(record2.getR112_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR112_c12() != null) {
		    cell1.setCellValue(record2.getR112_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR112_c13() != null) {
		    cell1.setCellValue(record2.getR112_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR112_c14() != null) {
		    cell1.setCellValue(record2.getR112_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR112_c15() != null) {
		    cell1.setCellValue(record2.getR112_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR112_c16() != null) {
		    cell1.setCellValue(record2.getR112_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR112_total() != null) {
		    cell1.setCellValue(record2.getR112_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		//row113
		row = sheet.getRow(113);

		cell1 =  row.getCell(1);
		if (record2.getR113_botswana() != null) {
		    cell1.setCellValue(record2.getR113_botswana().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(2);
		if (record2.getR113_south_africa() != null) {
		    cell1.setCellValue(record2.getR113_south_africa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(3);
		if (record2.getR113_sadc() != null) {
		    cell1.setCellValue(record2.getR113_sadc().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(4);
		if (record2.getR113_usa() != null) {
		    cell1.setCellValue(record2.getR113_usa().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(5);
		if (record2.getR113_uk() != null) {
		    cell1.setCellValue(record2.getR113_uk().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(6);
		if (record2.getR113_europe() != null) {
		    cell1.setCellValue(record2.getR113_europe().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(7);
		if (record2.getR113_india() != null) {
		    cell1.setCellValue(record2.getR113_india().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(8);
		if (record2.getR113_sydney() != null) {
		    cell1.setCellValue(record2.getR113_sydney().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(9);
		if (record2.getR113_uganda() != null) {
		    cell1.setCellValue(record2.getR113_uganda().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(10);
		if (record2.getR113_c10() != null) {
		    cell1.setCellValue(record2.getR113_c10().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(11);
		if (record2.getR113_c11() != null) {
		    cell1.setCellValue(record2.getR113_c11().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(12);
		if (record2.getR113_c12() != null) {
		    cell1.setCellValue(record2.getR113_c12().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(13);
		if (record2.getR113_c13() != null) {
		    cell1.setCellValue(record2.getR113_c13().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(14);
		if (record2.getR113_c14() != null) {
		    cell1.setCellValue(record2.getR113_c14().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(15);
		if (record2.getR113_c15() != null) {
		    cell1.setCellValue(record2.getR113_c15().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(16);
		if (record2.getR113_c16() != null) {
		    cell1.setCellValue(record2.getR113_c16().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}

		cell1 =  row.getCell(17);
		if (record2.getR113_total() != null) {
		    cell1.setCellValue(record2.getR113_total().doubleValue());   } else {
		    cell1.setCellValue("");
		    cell1.setCellStyle(textStyle);
		}
		
		
		
		
	}

	public ModelAndView getM_GALORcurrentDtl(String reportId, String fromdate, String todate, String currency,
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
				List<M_GALOR_Archival_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = M_GALOR_Archival_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate, version);
				} else {
					T1Dt1 = M_GALOR_Archival_Detail_Repo.getdatabydateList(parsedDate, version);
					System.out.println(T1Dt1.size());
				}

				mv.addObject("reportdetails", T1Dt1);
				mv.addObject("reportmaster12", T1Dt1);
				System.out.println("ARCHIVAL COUNT: " + (T1Dt1 != null ? T1Dt1.size() : 0));

			} else {
// 🔹 Current branch
				List<M_GALOR_Detail_Entity> T1Dt1;
				if (rowId != null && columnId != null) {
					T1Dt1 = M_GALOR_Detail_Repo.GetDataByRowIdAndColumnId(rowId, columnId, parsedDate);
				} else {
					T1Dt1 = M_GALOR_Detail_Repo.getdatabydateList(parsedDate ,currentPage,pageSize);
					totalPages = M_GALOR_Detail_Repo.getdatacount(parsedDate);
					mv.addObject("pagination", "YES");
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
		mv.setViewName("BRRS/M_GALOR");
		mv.addObject("displaymode", "Details");
		mv.addObject("currentPage", currentPage);
		System.out.println("totalPages: " + (int) Math.ceil((double) totalPages / 100));
		mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);

		return mv;
	}

	public byte[] BRRS_M_GALORDetailExcel(String filename, String fromdate, String todate, String currency, String dtltype,
			String type, String version) {

		try {
			logger.info("Generating Excel for BRRS_M_GALORDetails...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("BRRS_M_GALORDetails");

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
			List<M_GALOR_Detail_Entity> reportData = M_GALOR_Detail_Repo.getdatabydateList(parsedToDate);
			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_GALOR_Detail_Entity item : reportData) {
					XSSFRow row = sheet.createRow(rowIndex++);
					row.createCell(0).setCellValue(item.getCust_id());
					row.createCell(1).setCellValue(item.getAcct_number());
					row.createCell(2).setCellValue(item.getAcct_name());
					// ACCT BALANCE (right aligned, 3 decimal places)
					Cell balanceCell = row.createCell(3);
					if (item.getAcct_balance_in_pula() != null) {
						balanceCell.setCellValue(item.getAcct_balance_in_pula().doubleValue());
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
				logger.info("No data found for BRRS_M_GALOR— only header will be written.");
			}
			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();
			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();
		} catch (Exception e) {
			logger.error("Error generating BRRS_M_GALORExcel", e);
			return new byte[0];
		}
	}



	public byte[] getDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
			logger.info("Generating Excel for BRRS_M_GALOR ARCHIVAL Details...");
			System.out.println("came to Detail download service");
			if (type.equals("ARCHIVAL") & version != null) {

			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("M_GALORDetail");

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
			List<M_GALOR_Archival_Detail_Entity> reportData = M_GALOR_Archival_Detail_Repo.getdatabydateList(parsedToDate,
					version);

			if (reportData != null && !reportData.isEmpty()) {
				int rowIndex = 1;
				for (M_GALOR_Archival_Detail_Entity item : reportData) {
					XSSFRow row = sheet.createRow(rowIndex++);

					row.createCell(0).setCellValue(item.getCust_id());
					row.createCell(1).setCellValue(item.getAcct_number());
					row.createCell(2).setCellValue(item.getAcct_name());

					// ACCT BALANCE (right aligned, 3 decimal places)
					Cell balanceCell = row.createCell(3);
					if (item.getAcct_balance_in_pula() != null) {
						balanceCell.setCellValue(item.getAcct_balance_in_pula().doubleValue());
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
				logger.info("No data found for BRRS_M_GALOR — only header will be written.");
			}

			// Write to byte[]
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			workbook.write(bos);
			workbook.close();

			logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
			return bos.toByteArray();

		} catch (Exception e) {
			logger.error("Error generating BRRS_M_GALORExcel", e);
			return new byte[0];
		}
	}


}
