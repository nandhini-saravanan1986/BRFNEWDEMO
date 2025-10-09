package com.bornfire.brf.services;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import com.bornfire.brf.controllers.CBUAE_BRF_ReportsController;
import com.bornfire.brf.entities.CBUAE_BRF2_7_DETAIL_ENTITY;
import com.bornfire.brf.entities.Q_ATF_ARCHIVAL_SUMMARY_REPO;
import com.bornfire.brf.entities.BRRS_Q_SMME_SUMMARY_RPT_ENTITY_1;
import com.bornfire.brf.entities.CBUAE_BRF2_7_DETAIL_Repo;
import com.bornfire.brf.entities.Q_SMME_SUMMARY_TABLE_ARCHIVAL_ENTITY;
import com.bornfire.brf.entities.Q_ATF_ACCESS_FIN_ENTITY;
import com.bornfire.brf.entities.Q_ATF_DETAILS_REPO;
import com.bornfire.brf.entities.Q_ATF_DETAIL_ARCHIVAL_ENTITY;
import com.bornfire.brf.entities.Q_ATF_ACCESS_FIN_REPO;
import com.bornfire.brf.entities.Q_ATF_ARCHIVAL_DETAIL_REPO;
import com.bornfire.brf.entities.Q_ATF_ARCHIVAL_SUMMARY_ENTITY;
import com.bornfire.brf.entities.Q_ATF_DETAILS_ENTITY;
import com.bornfire.brf.entities.BRRS_Q_SMME_ARCHIVAL_DETAIL_Entity_2;
import com.bornfire.brf.entities.BRRS_Q_SMME_ARCHIVAL_DETAIL_REPO_2;
import com.bornfire.brf.entities.BRRS_Q_SMME_DETAIL_Entity_1;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.FillPatternType;

@Component
@Service
public class Q_ATS_ReportService {
private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF2_7_ReportService.class);

@Autowired
private SessionFactory sessionFactory;

@Autowired
private Environment env;

@Autowired
Q_ATF_ACCESS_FIN_REPO q_atf_summary_repo;

@Autowired
Q_ATF_ARCHIVAL_SUMMARY_REPO q_atf_summay_archival_repo;

@Autowired
Q_ATF_DETAILS_REPO q_atf_details_repo;

@Autowired
Q_ATF_ARCHIVAL_DETAIL_REPO q_atf_archival_detail_repo;

SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getQ_ATSView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable,String type,String version) {
		System.out.println("getBRF1_1View");
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;
		System.out.println(type);
        if (type.equals("ARCHIVAL") & version != null) {
            System.out.println(type);
            List<Q_ATF_ARCHIVAL_SUMMARY_ENTITY> T1Master = new ArrayList<>();
            System.out.println(version);
            try {
                Date d1 = dateformat.parse(todate);

                // T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
                // ", BRF1_REPORT_ENTITY.class)
                // .setParameter(1, df.parse(todate)).getResultList();
                System.out.println(dateformat.parse(todate)+"        "+version);
                T1Master = q_atf_summay_archival_repo.getdatabydateListarchival(dateformat.parse(todate), version);

            } catch (ParseException e) {
                e.printStackTrace();
            }

            mv.addObject("reportsummary", T1Master);
        }else {
            List<Q_ATF_ACCESS_FIN_ENTITY> T1Master = new ArrayList<>();
            try {
                Date d1 = dateformat.parse(todate);
                T1Master = q_atf_summary_repo.getdatabydateList(dateformat.parse(todate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            mv.addObject("reportsummary", T1Master);
        }
        mv.setViewName("BRF/Q_ATS_ACCESS");

        mv.addObject("displaymode", "summary");
        mv.addObject("report_date", todate);
        System.out.println("scv" + mv.getViewName());
		return mv;

	}

    public ModelAndView getQ_ATS_currentDtl(String reportId, String fromdate, String todate, String currency,
                                            String dtltype, Pageable pageable, String Filter,String asondate,
                                            String type,String version) {

        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        int totalPages = 0;

        ModelAndView mv = new ModelAndView();

        Session hs = sessionFactory.getCurrentSession();
        

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
		System.out.println("----------------");
        
        if (type.equals("ARCHIVAL") & version != null) {
            System.out.println(type);
            List<Q_ATF_DETAIL_ARCHIVAL_ENTITY> T1Master = new ArrayList<>();
            System.out.println(version);
            try {
                System.out.println("rowId :: "+rowId +"   columnId :: "+columnId+"  version :: "+version);
                if (rowId != null && columnId != null) {
                	T1Master = q_atf_archival_detail_repo.GetDataByRowIdAndColumnId(rowId, columnId,dateformat.parse(todate), version);
				} else {
					T1Master = q_atf_archival_detail_repo.getdatabydateList(dateformat.parse(todate), version);
				}

            } catch (ParseException e) {
                e.printStackTrace();
            }
            mv.addObject("reportdetails",T1Master );
            mv.addObject("reportmaster12", T1Master);
        }else {
        	List<Q_ATF_DETAILS_ENTITY> T1Dt1 = new ArrayList<Q_ATF_DETAILS_ENTITY>();
            try {
            	
                Date d1 = dateformat.parse(todate);
                System.out.println("rowId :: "+rowId +"   columnId :: "+columnId+"  version :: "+version);
                if (rowId != null && columnId != null) {
                	T1Dt1 = q_atf_details_repo.GetDataByRowIdAndColumnId(rowId, columnId,dateformat.parse(todate), version);
                } else {
                    T1Dt1 = q_atf_details_repo.getdatabydateList(dateformat.parse(todate));
                    System.out.println("LISTCOUNT" + T1Dt1.size());
                }

            } catch (ParseException e) {
                e.printStackTrace();
            }
            mv.addObject("reportdetails",T1Dt1 );
            mv.addObject("reportmaster12", T1Dt1);
        }
        mv.setViewName("BRF/Q_ATS_ACCESS");
        mv.addObject("displaymode", "Details");
        //mv.addObject("reportdetails", T1Dt1Page.getContent());

        mv.addObject("report_date",todate );
        mv.addObject("pagination","YES" );
        mv.addObject("currentPage",currentPage );
        mv.addObject("asondate",asondate );
        mv.addObject("reportid",reportId );
        mv.addObject("fromdate",fromdate );
        mv.addObject("todate",todate );
        mv.addObject("currency",currency );
        mv.addObject("dtltype",dtltype );
        mv.addObject("totalPages", (int) Math.ceil((double) totalPages / 100));
        mv.addObject("reportsflag", "reportsflag");
        mv.addObject("menu", reportId);
        return mv;

    }

    
    public byte[] getQ_SMME_1_Excel(String filename, String reportId, String fromdate, String todate, String currency,
			String dtltype,String type, String version) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		System.out.println(type+"   "+version);
		if ("ARCHIVAL".equalsIgnoreCase(type) && version != null && !version.trim().isEmpty()) {
			logger.info("Service: Generating ARCHIVAL report for version {}", version);
			return getExcelQ_ATF_SUMMARY_ARCHIVAL(filename, reportId, fromdate, todate, currency, dtltype, type, version);
		}
		List<Q_ATF_ACCESS_FIN_ENTITY> dataList = q_atf_summary_repo.getdatabydateList(dateformat.parse(todate));
//		List<BRRS_Q_SMME_SUMMARY_RPT_ENTITY_1> dataList = new ArrayList<>();

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.1 report. Returning empty result.");
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

		try (InputStream templateInputStream = Files.newInputStream(templatePath);
				Workbook workbook = WorkbookFactory.create(templateInputStream);
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			Sheet sheet = workbook.getSheetAt(0);

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

			Font font = workbook.createFont();
			font.setFontHeightInPoints((short) 8); // size 8
			font.setFontName("Arial");

			CellStyle numberStyle = workbook.createCellStyle();
			numberStyle.setBorderBottom(BorderStyle.THIN);
			numberStyle.setBorderTop(BorderStyle.THIN);
			numberStyle.setBorderLeft(BorderStyle.THIN);
			numberStyle.setBorderRight(BorderStyle.THIN);
			numberStyle.setFont(font);
			// --- End of Style Definitions ---

			int startRow = 15;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					Q_ATF_ACCESS_FIN_ENTITY record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					// Row 12
					row = sheet.getRow(11);
					Cell R12cell1 = row.createCell(1);
					if (record.getR12_central_govt_no_of_dep() != null) {
						System.out.println(record.getR12_central_govt_no_of_dep()+"                 R12---");
					    R12cell1.setCellValue(record.getR12_central_govt_no_of_dep().doubleValue());
					    R12cell1.setCellStyle(numberStyle);
					} else {
					    R12cell1.setCellValue("");
					    R12cell1.setCellStyle(textStyle);
					}

					Cell R12cell2 = row.createCell(2);
					if (record.getR12_central_govt_no_of_dep_ac() != null) {
						System.out.println(record.getR12_central_govt_no_of_dep_ac().doubleValue()+"                 R12---");
					    R12cell2.setCellValue(record.getR12_central_govt_no_of_dep_ac().doubleValue());
					    R12cell2.setCellStyle(numberStyle);
					} else {
					    R12cell2.setCellValue("");
					    R12cell2.setCellStyle(textStyle);
					}

					Cell R12cell3 = row.createCell(3);
					if (record.getR12_central_govt_no_of_brw() != null) {
					    R12cell3.setCellValue(record.getR12_central_govt_no_of_brw().doubleValue());
					    R12cell3.setCellStyle(numberStyle);
					} else {
					    R12cell3.setCellValue("");
					    R12cell3.setCellStyle(textStyle);
					}

					Cell R12cell4 = row.createCell(4);
					if (record.getR12_central_govt_no_loan_ac() != null) {
					    R12cell4.setCellValue(record.getR12_central_govt_no_loan_ac().doubleValue());
					    R12cell4.setCellStyle(numberStyle);
					} else {
					    R12cell4.setCellValue("");
					    R12cell4.setCellStyle(textStyle);
					}


					// Row 13
					row = sheet.getRow(12);
					Cell R13cell1 = row.createCell(1);
					if (record.getR13_local_govt_no_of_dep() != null) {
					    R13cell1.setCellValue(record.getR13_local_govt_no_of_dep().doubleValue());
					    R13cell1.setCellStyle(numberStyle);
					} else {
					    R13cell1.setCellValue("");
					    R13cell1.setCellStyle(textStyle);
					}

					Cell R13cell2 = row.createCell(2);
					if (record.getR13_local_govt_no_of_dep_ac() != null) {
					    R13cell2.setCellValue(record.getR13_local_govt_no_of_dep_ac().doubleValue());
					    R13cell2.setCellStyle(numberStyle);
					} else {
					    R13cell2.setCellValue("");
					    R13cell2.setCellStyle(textStyle);
					}

					Cell R13cell3 = row.createCell(3);
					if (record.getR13_local_govt_no_of_brw() != null) {
					    R13cell3.setCellValue(record.getR13_local_govt_no_of_brw().doubleValue());
					    R13cell3.setCellStyle(numberStyle);
					} else {
					    R13cell3.setCellValue("");
					    R13cell3.setCellStyle(textStyle);
					}

					Cell R13cell4 = row.createCell(4);
					if (record.getR13_local_govt_no_loan_ac() != null) {
					    R13cell4.setCellValue(record.getR13_local_govt_no_loan_ac().doubleValue());
					    R13cell4.setCellStyle(numberStyle);
					} else {
					    R13cell4.setCellValue("");
					    R13cell4.setCellStyle(textStyle);
					}


					// Row 14
					row = sheet.getRow(13);
					Cell R14cell1 = row.createCell(1);
					if (record.getR14_pub_non_fin_corp_no_of_dep() != null) {
					    R14cell1.setCellValue(record.getR14_pub_non_fin_corp_no_of_dep().doubleValue());
					    R14cell1.setCellStyle(numberStyle);
					} else {
					    R14cell1.setCellValue("");
					    R14cell1.setCellStyle(textStyle);
					}

					Cell R14cell2 = row.createCell(2);
					if (record.getR14_pub_non_fin_corp_no_of_dep_ac() != null) {
					    R14cell2.setCellValue(record.getR14_pub_non_fin_corp_no_of_dep_ac().doubleValue());
					    R14cell2.setCellStyle(numberStyle);
					} else {
					    R14cell2.setCellValue("");
					    R14cell2.setCellStyle(textStyle);
					}

					Cell R14cell3 = row.createCell(3);
					if (record.getR14_pub_non_fin_corp_no_of_brw() != null) {
					    R14cell3.setCellValue(record.getR14_pub_non_fin_corp_no_of_brw().doubleValue());
					    R14cell3.setCellStyle(numberStyle);
					} else {
					    R14cell3.setCellValue("");
					    R14cell3.setCellStyle(textStyle);
					}

					Cell R14cell4 = row.createCell(4);
					if (record.getR14_pub_non_fin_corp_no_loan_ac() != null) {
					    R14cell4.setCellValue(record.getR14_pub_non_fin_corp_no_loan_ac().doubleValue());
					    R14cell4.setCellStyle(numberStyle);
					} else {
					    R14cell4.setCellValue("");
					    R14cell4.setCellStyle(textStyle);
					}


					// Row 15
					row = sheet.getRow(15);
					Cell R15cell1 = row.createCell(1);
					if (record.getR16_agric_forest_fish_no_of_dep() != null) {
					    R15cell1.setCellValue(record.getR16_agric_forest_fish_no_of_dep().doubleValue());
					    R15cell1.setCellStyle(numberStyle);
					} else {
					    R15cell1.setCellValue("");
					    R15cell1.setCellStyle(textStyle);
					}

					Cell R15cell2 = row.createCell(2);
					if (record.getR16_agric_forest_fish_no_of_dep_ac() != null) {
					    R15cell2.setCellValue(record.getR16_agric_forest_fish_no_of_dep_ac().doubleValue());
					    R15cell2.setCellStyle(numberStyle);
					} else {
					    R15cell2.setCellValue("");
					    R15cell2.setCellStyle(textStyle);
					}

					Cell R15cell3 = row.createCell(3);
					if (record.getR16_agric_forest_fish_no_of_brw() != null) {
					    R15cell3.setCellValue(record.getR16_agric_forest_fish_no_of_brw().doubleValue());
					    R15cell3.setCellStyle(numberStyle);
					} else {
					    R15cell3.setCellValue("");
					    R15cell3.setCellStyle(textStyle);
					}

					Cell R15cell4 = row.createCell(4);
					if (record.getR16_agric_forest_fish_no_loan_ac() != null) {
					    R15cell4.setCellValue(record.getR16_agric_forest_fish_no_loan_ac().doubleValue());
					    R15cell4.setCellStyle(numberStyle);
					} else {
					    R15cell4.setCellValue("");
					    R15cell4.setCellStyle(textStyle);
					}


					// Row 16
					row = sheet.getRow(16);
					Cell R16cell1 = row.createCell(1);
					if (record.getR17_mining_quarry_no_of_dep() != null) {
					    R16cell1.setCellValue(record.getR17_mining_quarry_no_of_dep().doubleValue());
					    R16cell1.setCellStyle(numberStyle);
					} else {
					    R16cell1.setCellValue("");
					    R16cell1.setCellStyle(textStyle);
					}

					Cell R16cell2 = row.createCell(2);
					if (record.getR17_mining_quarry_no_of_dep_ac() != null) {
					    R16cell2.setCellValue(record.getR17_mining_quarry_no_of_dep_ac().doubleValue());
					    R16cell2.setCellStyle(numberStyle);
					} else {
					    R16cell2.setCellValue("");
					    R16cell2.setCellStyle(textStyle);
					}

					Cell R16cell3 = row.createCell(3);
					if (record.getR17_mining_quarry_no_of_brw() != null) {
					    R16cell3.setCellValue(record.getR17_mining_quarry_no_of_brw().doubleValue());
					    R16cell3.setCellStyle(numberStyle);
					} else {
					    R16cell3.setCellValue("");
					    R16cell3.setCellStyle(textStyle);
					}

					Cell R16cell4 = row.createCell(4);
					if (record.getR17_mining_quarry_no_loan_ac() != null) {
					    R16cell4.setCellValue(record.getR17_mining_quarry_no_loan_ac().doubleValue());
					    R16cell4.setCellStyle(numberStyle);
					} else {
					    R16cell4.setCellValue("");
					    R16cell4.setCellStyle(textStyle);
					}


					// Row 17
					row = sheet.getRow(17);
					Cell R17cell1 = row.createCell(1);
					if (record.getR18_manufacturing_no_of_dep() != null) {
					    R17cell1.setCellValue(record.getR18_manufacturing_no_of_dep().doubleValue());
					    R17cell1.setCellStyle(numberStyle);
					} else {
					    R17cell1.setCellValue("");
					    R17cell1.setCellStyle(textStyle);
					}

					Cell R17cell2 = row.createCell(2);
					if (record.getR18_manufacturing_no_of_dep_ac() != null) {
					    R17cell2.setCellValue(record.getR18_manufacturing_no_of_dep_ac().doubleValue());
					    R17cell2.setCellStyle(numberStyle);
					} else {
					    R17cell2.setCellValue("");
					    R17cell2.setCellStyle(textStyle);
					}

					Cell R17cell3 = row.createCell(3);
					if (record.getR18_manufacturing_no_of_brw() != null) {
					    R17cell3.setCellValue(record.getR18_manufacturing_no_of_brw().doubleValue());
					    R17cell3.setCellStyle(numberStyle);
					} else {
					    R17cell3.setCellValue("");
					    R17cell3.setCellStyle(textStyle);
					}

					Cell R17cell4 = row.createCell(4);
					if (record.getR18_manufacturing_no_loan_ac() != null) {
					    R17cell4.setCellValue(record.getR18_manufacturing_no_loan_ac().doubleValue());
					    R17cell4.setCellStyle(numberStyle);
					} else {
					    R17cell4.setCellValue("");
					    R17cell4.setCellStyle(textStyle);
					}


					// Row 18
					row = sheet.getRow(18);
					Cell R18cell1 = row.createCell(1);
					if (record.getR19_construction_no_of_dep() != null) {
					    R18cell1.setCellValue(record.getR19_construction_no_of_dep().doubleValue());
					    R18cell1.setCellStyle(numberStyle);
					} else {
					    R18cell1.setCellValue("");
					    R18cell1.setCellStyle(textStyle);
					}

					Cell R18cell2 = row.createCell(2);
					if (record.getR19_construction_no_of_dep_ac() != null) {
					    R18cell2.setCellValue(record.getR19_construction_no_of_dep_ac().doubleValue());
					    R18cell2.setCellStyle(numberStyle);
					} else {
					    R18cell2.setCellValue("");
					    R18cell2.setCellStyle(textStyle);
					}

					Cell R18cell3 = row.createCell(3);
					if (record.getR19_construction_no_of_brw() != null) {
					    R18cell3.setCellValue(record.getR19_construction_no_of_brw().doubleValue());
					    R18cell3.setCellStyle(numberStyle);
					} else {
					    R18cell3.setCellValue("");
					    R18cell3.setCellStyle(textStyle);
					}

					Cell R18cell4 = row.createCell(4);
					if (record.getR19_construction_no_loan_ac() != null) {
					    R18cell4.setCellValue(record.getR19_construction_no_loan_ac().doubleValue());
					    R18cell4.setCellStyle(numberStyle);
					} else {
					    R18cell4.setCellValue("");
					    R18cell4.setCellStyle(textStyle);
					}


					// Row 19
					row = sheet.getRow(19);
					Cell R19cell1 = row.createCell(1);
					if (record.getR20_comm_realestate_no_of_dep() != null) {
					    R19cell1.setCellValue(record.getR20_comm_realestate_no_of_dep().doubleValue());
					    R19cell1.setCellStyle(numberStyle);
					} else {
					    R19cell1.setCellValue("");
					    R19cell1.setCellStyle(textStyle);
					}

					Cell R19cell2 = row.createCell(2);
					if (record.getR20_comm_realestate_no_of_dep_ac() != null) {
					    R19cell2.setCellValue(record.getR20_comm_realestate_no_of_dep_ac().doubleValue());
					    R19cell2.setCellStyle(numberStyle);
					} else {
					    R19cell2.setCellValue("");
					    R19cell2.setCellStyle(textStyle);
					}

					Cell R19cell3 = row.createCell(3);
					if (record.getR20_comm_realestate_no_of_brw() != null) {
					    R19cell3.setCellValue(record.getR20_comm_realestate_no_of_brw().doubleValue());
					    R19cell3.setCellStyle(numberStyle);
					} else {
					    R19cell3.setCellValue("");
					    R19cell3.setCellStyle(textStyle);
					}

					Cell R19cell4 = row.createCell(4);
					if (record.getR20_comm_realestate_no_loan_ac() != null) {
					    R19cell4.setCellValue(record.getR20_comm_realestate_no_loan_ac().doubleValue());
					    R19cell4.setCellStyle(numberStyle);
					} else {
					    R19cell4.setCellValue("");
					    R19cell4.setCellStyle(textStyle);
					}


					// Row 20
					row = sheet.getRow(20);
					Cell R20cell1 = row.createCell(1);
					if (record.getR21_electricity_no_of_dep() != null) {
					    R20cell1.setCellValue(record.getR21_electricity_no_of_dep().doubleValue());
					    R20cell1.setCellStyle(numberStyle);
					} else {
					    R20cell1.setCellValue("");
					    R20cell1.setCellStyle(textStyle);
					}

					Cell R20cell2 = row.createCell(2);
					if (record.getR21_electricity_no_of_dep_ac() != null) {
					    R20cell2.setCellValue(record.getR21_electricity_no_of_dep_ac().doubleValue());
					    R20cell2.setCellStyle(numberStyle);
					} else {
					    R20cell2.setCellValue("");
					    R20cell2.setCellStyle(textStyle);
					}

					Cell R20cell3 = row.createCell(3);
					if (record.getR21_electricity_no_of_brw() != null) {
					    R20cell3.setCellValue(record.getR21_electricity_no_of_brw().doubleValue());
					    R20cell3.setCellStyle(numberStyle);
					} else {
					    R20cell3.setCellValue("");
					    R20cell3.setCellStyle(textStyle);
					}

					Cell R20cell4 = row.createCell(4);
					if (record.getR21_electricity_no_loan_ac() != null) {
					    R20cell4.setCellValue(record.getR21_electricity_no_loan_ac().doubleValue());
					    R20cell4.setCellStyle(numberStyle);
					} else {
					    R20cell4.setCellValue("");
					    R20cell4.setCellStyle(textStyle);
					}


					// Row 21
					row = sheet.getRow(21);
					Cell R21cell1 = row.createCell(1);
					if (record.getR22_water_no_of_dep() != null) {
					    R21cell1.setCellValue(record.getR22_water_no_of_dep().doubleValue());
					    R21cell1.setCellStyle(numberStyle);
					} else {
					    R21cell1.setCellValue("");
					    R21cell1.setCellStyle(textStyle);
					}

					Cell R21cell2 = row.createCell(2);
					if (record.getR22_water_no_of_dep_ac() != null) {
					    R21cell2.setCellValue(record.getR22_water_no_of_dep_ac().doubleValue());
					    R21cell2.setCellStyle(numberStyle);
					} else {
					    R21cell2.setCellValue("");
					    R21cell2.setCellStyle(textStyle);
					}

					Cell R21cell3 = row.createCell(3);
					if (record.getR22_water_no_of_brw() != null) {
					    R21cell3.setCellValue(record.getR22_water_no_of_brw().doubleValue());
					    R21cell3.setCellStyle(numberStyle);
					} else {
					    R21cell3.setCellValue("");
					    R21cell3.setCellStyle(textStyle);
					}

					Cell R21cell4 = row.createCell(4);
					if (record.getR22_water_no_loan_ac() != null) {
					    R21cell4.setCellValue(record.getR22_water_no_loan_ac().doubleValue());
					    R21cell4.setCellStyle(numberStyle);
					} else {
					    R21cell4.setCellValue("");
					    R21cell4.setCellStyle(textStyle);
					}


					// Row 22
					row = sheet.getRow(22);
					Cell R22cell1 = row.createCell(1);
					if (record.getR23_telecom_post_no_of_dep() != null) {
					    R22cell1.setCellValue(record.getR23_telecom_post_no_of_dep().doubleValue());
					    R22cell1.setCellStyle(numberStyle);
					} else {
					    R22cell1.setCellValue("");
					    R22cell1.setCellStyle(textStyle);
					}

					Cell R22cell2 = row.createCell(2);
					if (record.getR23_telecom_post_no_of_dep_ac() != null) {
					    R22cell2.setCellValue(record.getR23_telecom_post_no_of_dep_ac().doubleValue());
					    R22cell2.setCellStyle(numberStyle);
					} else {
					    R22cell2.setCellValue("");
					    R22cell2.setCellStyle(textStyle);
					}

					Cell R22cell3 = row.createCell(3);
					if (record.getR23_telecom_post_no_of_brw() != null) {
					    R22cell3.setCellValue(record.getR23_telecom_post_no_of_brw().doubleValue());
					    R22cell3.setCellStyle(numberStyle);
					} else {
					    R22cell3.setCellValue("");
					    R22cell3.setCellStyle(textStyle);
					}

					Cell R22cell4 = row.createCell(4);
					if (record.getR23_telecom_post_no_loan_ac() != null) {
					    R22cell4.setCellValue(record.getR23_telecom_post_no_loan_ac().doubleValue());
					    R22cell4.setCellStyle(numberStyle);
					} else {
					    R22cell4.setCellValue("");
					    R22cell4.setCellStyle(textStyle);
					}


					// Row 23
					row = sheet.getRow(23);
					Cell R23cell1 = row.createCell(1);
					if (record.getR24_tourism_hotels_no_of_dep() != null) {
					    R23cell1.setCellValue(record.getR24_tourism_hotels_no_of_dep().doubleValue());
					    R23cell1.setCellStyle(numberStyle);
					} else {
					    R23cell1.setCellValue("");
					    R23cell1.setCellStyle(textStyle);
					}

					Cell R23cell2 = row.createCell(2);
					if (record.getR24_tourism_hotels_no_of_dep_ac() != null) {
					    R23cell2.setCellValue(record.getR24_tourism_hotels_no_of_dep_ac().doubleValue());
					    R23cell2.setCellStyle(numberStyle);
					} else {
					    R23cell2.setCellValue("");
					    R23cell2.setCellStyle(textStyle);
					}

					Cell R23cell3 = row.createCell(3);
					if (record.getR24_tourism_hotels_no_of_brw() != null) {
					    R23cell3.setCellValue(record.getR24_tourism_hotels_no_of_brw().doubleValue());
					    R23cell3.setCellStyle(numberStyle);
					} else {
					    R23cell3.setCellValue("");
					    R23cell3.setCellStyle(textStyle);
					}

					Cell R23cell4 = row.createCell(4);
					if (record.getR24_tourism_hotels_no_loan_ac() != null) {
					    R23cell4.setCellValue(record.getR24_tourism_hotels_no_loan_ac().doubleValue());
					    R23cell4.setCellStyle(numberStyle);
					} else {
					    R23cell4.setCellValue("");
					    R23cell4.setCellStyle(textStyle);
					}


					// Row 24
					row = sheet.getRow(24);
					Cell R24cell1 = row.createCell(1);
					if (record.getR25_transport_storage_no_of_dep() != null) {
					    R24cell1.setCellValue(record.getR25_transport_storage_no_of_dep().doubleValue());
					    R24cell1.setCellStyle(numberStyle);
					} else {
					    R24cell1.setCellValue("");
					    R24cell1.setCellStyle(textStyle);
					}

					Cell R24cell2 = row.createCell(2);
					if (record.getR25_transport_storage_no_of_dep_ac() != null) {
					    R24cell2.setCellValue(record.getR25_transport_storage_no_of_dep_ac().doubleValue());
					    R24cell2.setCellStyle(numberStyle);
					} else {
					    R24cell2.setCellValue("");
					    R24cell2.setCellStyle(textStyle);
					}

					Cell R24cell3 = row.createCell(3);
					if (record.getR25_transport_storage_no_of_brw() != null) {
					    R24cell3.setCellValue(record.getR25_transport_storage_no_of_brw().doubleValue());
					    R24cell3.setCellStyle(numberStyle);
					} else {
					    R24cell3.setCellValue("");
					    R24cell3.setCellStyle(textStyle);
					}

					Cell R24cell4 = row.createCell(4);
					if (record.getR25_transport_storage_no_loan_ac() != null) {
					    R24cell4.setCellValue(record.getR25_transport_storage_no_loan_ac().doubleValue());
					    R24cell4.setCellStyle(numberStyle);
					} else {
					    R24cell4.setCellValue("");
					    R24cell4.setCellStyle(textStyle);
					}


					// Row 25
					row = sheet.getRow(25);
					Cell R25cell1 = row.createCell(1);
					if (record.getR26_trade_rest_bar_no_of_dep() != null) {
					    R25cell1.setCellValue(record.getR26_trade_rest_bar_no_of_dep().doubleValue());
					    R25cell1.setCellStyle(numberStyle);
					} else {
					    R25cell1.setCellValue("");
					    R25cell1.setCellStyle(textStyle);
					}

					Cell R25cell2 = row.createCell(2);
					if (record.getR26_trade_rest_bar_no_of_dep_ac() != null) {
					    R25cell2.setCellValue(record.getR26_trade_rest_bar_no_of_dep_ac().doubleValue());
					    R25cell2.setCellStyle(numberStyle);
					} else {
					    R25cell2.setCellValue("");
					    R25cell2.setCellStyle(textStyle);
					}

					Cell R25cell3 = row.createCell(3);
					if (record.getR26_trade_rest_bar_no_of_brw() != null) {
					    R25cell3.setCellValue(record.getR26_trade_rest_bar_no_of_brw().doubleValue());
					    R25cell3.setCellStyle(numberStyle);
					} else {
					    R25cell3.setCellValue("");
					    R25cell3.setCellStyle(textStyle);
					}

					Cell R25cell4 = row.createCell(4);
					if (record.getR26_trade_rest_bar_no_loan_ac() != null) {
					    R25cell4.setCellValue(record.getR26_trade_rest_bar_no_loan_ac().doubleValue());
					    R25cell4.setCellStyle(numberStyle);
					} else {
					    R25cell4.setCellValue("");
					    R25cell4.setCellStyle(textStyle);
					}


					// Row 26
					row = sheet.getRow(26);
					Cell R26cell1 = row.createCell(1);
					if (record.getR27_business_services_no_of_dep() != null) {
					    R26cell1.setCellValue(record.getR27_business_services_no_of_dep().doubleValue());
					    R26cell1.setCellStyle(numberStyle);
					} else {
					    R26cell1.setCellValue("");
					    R26cell1.setCellStyle(textStyle);
					}

					Cell R26cell2 = row.createCell(2);
					if (record.getR27_business_services_no_of_dep_ac() != null) {
					    R26cell2.setCellValue(record.getR27_business_services_no_of_dep_ac().doubleValue());
					    R26cell2.setCellStyle(numberStyle);
					} else {
					    R26cell2.setCellValue("");
					    R26cell2.setCellStyle(textStyle);
					}

					Cell R26cell3 = row.createCell(3);
					if (record.getR27_business_services_no_of_brw() != null) {
					    R26cell3.setCellValue(record.getR27_business_services_no_of_brw().doubleValue());
					    R26cell3.setCellStyle(numberStyle);
					} else {
					    R26cell3.setCellValue("");
					    R26cell3.setCellStyle(textStyle);
					}

					Cell R26cell4 = row.createCell(4);
					if (record.getR27_business_services_no_loan_ac() != null) {
					    R26cell4.setCellValue(record.getR27_business_services_no_loan_ac().doubleValue());
					    R26cell4.setCellStyle(numberStyle);
					} else {
					    R26cell4.setCellValue("");
					    R26cell4.setCellStyle(textStyle);
					}


					// Row 27
					row = sheet.getRow(27);
					Cell R27cell1 = row.createCell(1);
					if (record.getR28_community_services_no_of_dep() != null) {
					    R27cell1.setCellValue(record.getR28_community_services_no_of_dep().doubleValue());
					    R27cell1.setCellStyle(numberStyle);
					} else {
					    R27cell1.setCellValue("");
					    R27cell1.setCellStyle(textStyle);
					}

					Cell R27cell2 = row.createCell(2);
					if (record.getR28_community_services_no_of_dep_ac() != null) {
					    R27cell2.setCellValue(record.getR28_community_services_no_of_dep_ac().doubleValue());
					    R27cell2.setCellStyle(numberStyle);
					} else {
					    R27cell2.setCellValue("");
					    R27cell2.setCellStyle(textStyle);
					}

					Cell R27cell3 = row.createCell(3);
					if (record.getR28_community_services_no_of_brw() != null) {
					    R27cell3.setCellValue(record.getR28_community_services_no_of_brw().doubleValue());
					    R27cell3.setCellStyle(numberStyle);
					} else {
					    R27cell3.setCellValue("");
					    R27cell3.setCellStyle(textStyle);
					}

					Cell R27cell4 = row.createCell(4);
					if (record.getR28_community_services_no_loan_ac() != null) {
					    R27cell4.setCellValue(record.getR28_community_services_no_loan_ac().doubleValue());
					    R27cell4.setCellStyle(numberStyle);
					} else {
					    R27cell4.setCellValue("");
					    R27cell4.setCellStyle(textStyle);
					}


					// Row 28
					row = sheet.getRow(29);
					Cell R28cell1 = row.createCell(1);
					if (record.getR30_hh_residential_owner_no_of_dep() != null) {
					    R28cell1.setCellValue(record.getR30_hh_residential_owner_no_of_dep().doubleValue());
					    R28cell1.setCellStyle(numberStyle);
					} else {
					    R28cell1.setCellValue("");
					    R28cell1.setCellStyle(textStyle);
					}

					Cell R28cell2 = row.createCell(2);
					if (record.getR30_hh_residential_owner_no_of_dep_ac() != null) {
					    R28cell2.setCellValue(record.getR30_hh_residential_owner_no_of_dep_ac().doubleValue());
					    R28cell2.setCellStyle(numberStyle);
					} else {
					    R28cell2.setCellValue("");
					    R28cell2.setCellStyle(textStyle);
					}

					Cell R28cell3 = row.createCell(3);
					if (record.getR30_hh_residential_owner_no_of_brw() != null) {
					    R28cell3.setCellValue(record.getR30_hh_residential_owner_no_of_brw().doubleValue());
					    R28cell3.setCellStyle(numberStyle);
					} else {
					    R28cell3.setCellValue("");
					    R28cell3.setCellStyle(textStyle);
					}

					Cell R28cell4 = row.createCell(4);
					if (record.getR30_hh_residential_owner_no_loan_ac() != null) {
					    R28cell4.setCellValue(record.getR30_hh_residential_owner_no_loan_ac().doubleValue());
					    R28cell4.setCellStyle(numberStyle);
					} else {
					    R28cell4.setCellValue("");
					    R28cell4.setCellStyle(textStyle);
					}


					// Row 29
					row = sheet.getRow(30);
					Cell R29cell1 = row.createCell(1);
					if (record.getR31_hh_residential_rent_no_of_dep() != null) {
					    R29cell1.setCellValue(record.getR31_hh_residential_rent_no_of_dep().doubleValue());
					    R29cell1.setCellStyle(numberStyle);
					} else {
					    R29cell1.setCellValue("");
					    R29cell1.setCellStyle(textStyle);
					}

					Cell R29cell2 = row.createCell(2);
					if (record.getR31_hh_residential_rent_no_of_dep_ac() != null) {
					    R29cell2.setCellValue(record.getR31_hh_residential_rent_no_of_dep_ac().doubleValue());
					    R29cell2.setCellStyle(numberStyle);
					} else {
					    R29cell2.setCellValue("");
					    R29cell2.setCellStyle(textStyle);
					}

					Cell R29cell3 = row.createCell(3);
					if (record.getR31_hh_residential_rent_no_of_brw() != null) {
					    R29cell3.setCellValue(record.getR31_hh_residential_rent_no_of_brw().doubleValue());
					    R29cell3.setCellStyle(numberStyle);
					} else {
					    R29cell3.setCellValue("");
					    R29cell3.setCellStyle(textStyle);
					}

					Cell R29cell4 = row.createCell(4);
					if (record.getR31_hh_residential_rent_no_loan_ac() != null) {
					    R29cell4.setCellValue(record.getR31_hh_residential_rent_no_loan_ac().doubleValue());
					    R29cell4.setCellStyle(numberStyle);
					} else {
					    R29cell4.setCellValue("");
					    R29cell4.setCellStyle(textStyle);
					}


					// Row 30
					row = sheet.getRow(31);
					Cell R30cell1 = row.createCell(1);
					if (record.getR32_hh_personal_loans_no_of_dep() != null) {
					    R30cell1.setCellValue(record.getR32_hh_personal_loans_no_of_dep().doubleValue());
					    R30cell1.setCellStyle(numberStyle);
					} else {
					    R30cell1.setCellValue("");
					    R30cell1.setCellStyle(textStyle);
					}

					Cell R30cell2 = row.createCell(2);
					if (record.getR32_hh_personal_loans_no_of_dep_ac() != null) {
					    R30cell2.setCellValue(record.getR32_hh_personal_loans_no_of_dep_ac().doubleValue());
					    R30cell2.setCellStyle(numberStyle);
					} else {
					    R30cell2.setCellValue("");
					    R30cell2.setCellStyle(textStyle);
					}

					Cell R30cell3 = row.createCell(3);
					if (record.getR32_hh_personal_loans_no_of_brw() != null) {
					    R30cell3.setCellValue(record.getR32_hh_personal_loans_no_of_brw().doubleValue());
					    R30cell3.setCellStyle(numberStyle);
					} else {
					    R30cell3.setCellValue("");
					    R30cell3.setCellStyle(textStyle);
					}

					Cell R30cell4 = row.createCell(4);
					if (record.getR32_hh_personal_loans_no_loan_ac() != null) {
					    R30cell4.setCellValue(record.getR32_hh_personal_loans_no_loan_ac().doubleValue());
					    R30cell4.setCellStyle(numberStyle);
					} else {
					    R30cell4.setCellValue("");
					    R30cell4.setCellStyle(textStyle);
					}


					// Row 31
					row = sheet.getRow(32);
					Cell R31cell1 = row.createCell(1);
					if (record.getR33_hh_motor_vehicle_no_of_dep() != null) {
					    R31cell1.setCellValue(record.getR33_hh_motor_vehicle_no_of_dep().doubleValue());
					    R31cell1.setCellStyle(numberStyle);
					} else {
					    R31cell1.setCellValue("");
					    R31cell1.setCellStyle(textStyle);
					}

					Cell R31cell2 = row.createCell(2);
					if (record.getR33_hh_motor_vehicle_no_of_dep_ac() != null) {
					    R31cell2.setCellValue(record.getR33_hh_motor_vehicle_no_of_dep_ac().doubleValue());
					    R31cell2.setCellStyle(numberStyle);
					} else {
					    R31cell2.setCellValue("");
					    R31cell2.setCellStyle(textStyle);
					}

					Cell R31cell3 = row.createCell(3);
					if (record.getR33_hh_motor_vehicle_no_of_brw() != null) {
					    R31cell3.setCellValue(record.getR33_hh_motor_vehicle_no_of_brw().doubleValue());
					    R31cell3.setCellStyle(numberStyle);
					} else {
					    R31cell3.setCellValue("");
					    R31cell3.setCellStyle(textStyle);
					}

					Cell R31cell4 = row.createCell(4);
					if (record.getR33_hh_motor_vehicle_no_loan_ac() != null) {
					    R31cell4.setCellValue(record.getR33_hh_motor_vehicle_no_loan_ac().doubleValue());
					    R31cell4.setCellStyle(numberStyle);
					} else {
					    R31cell4.setCellValue("");
					    R31cell4.setCellStyle(textStyle);
					}


					// Row 32
					row = sheet.getRow(33);
					Cell R32cell1 = row.createCell(1);
					if (record.getR34_hh_household_goods_no_of_dep() != null) {
					    R32cell1.setCellValue(record.getR34_hh_household_goods_no_of_dep().doubleValue());
					    R32cell1.setCellStyle(numberStyle);
					} else {
					    R32cell1.setCellValue("");
					    R32cell1.setCellStyle(textStyle);
					}

					Cell R32cell2 = row.createCell(2);
					if (record.getR34_hh_household_goods_no_of_dep_ac() != null) {
					    R32cell2.setCellValue(record.getR34_hh_household_goods_no_of_dep_ac().doubleValue());
					    R32cell2.setCellStyle(numberStyle);
					} else {
					    R32cell2.setCellValue("");
					    R32cell2.setCellStyle(textStyle);
					}

					Cell R32cell3 = row.createCell(3);
					if (record.getR34_hh_household_goods_no_of_brw() != null) {
					    R32cell3.setCellValue(record.getR34_hh_household_goods_no_of_brw().doubleValue());
					    R32cell3.setCellStyle(numberStyle);
					} else {
					    R32cell3.setCellValue("");
					    R32cell3.setCellStyle(textStyle);
					}

					Cell R32cell4 = row.createCell(4);
					if (record.getR34_hh_household_goods_no_loan_ac() != null) {
					    R32cell4.setCellValue(record.getR34_hh_household_goods_no_loan_ac().doubleValue());
					    R32cell4.setCellStyle(numberStyle);
					} else {
					    R32cell4.setCellValue("");
					    R32cell4.setCellStyle(textStyle);
					}


					// Row 33
					row = sheet.getRow(34);
					Cell R33cell1 = row.createCell(1);
					if (record.getR35_hh_credit_card_loans_no_of_dep() != null) {
					    R33cell1.setCellValue(record.getR35_hh_credit_card_loans_no_of_dep().doubleValue());
					    R33cell1.setCellStyle(numberStyle);
					} else {
					    R33cell1.setCellValue("");
					    R33cell1.setCellStyle(textStyle);
					}

					Cell R33cell2 = row.createCell(2);
					if (record.getR35_hh_credit_card_loans_no_of_dep_ac() != null) {
					    R33cell2.setCellValue(record.getR35_hh_credit_card_loans_no_of_dep_ac().doubleValue());
					    R33cell2.setCellStyle(numberStyle);
					} else {
					    R33cell2.setCellValue("");
					    R33cell2.setCellStyle(textStyle);
					}

					Cell R33cell3 = row.createCell(3);
					if (record.getR35_hh_credit_card_loans_no_of_brw() != null) {
					    R33cell3.setCellValue(record.getR35_hh_credit_card_loans_no_of_brw().doubleValue());
					    R33cell3.setCellStyle(numberStyle);
					} else {
					    R33cell3.setCellValue("");
					    R33cell3.setCellStyle(textStyle);
					}

					Cell R33cell4 = row.createCell(4);
					if (record.getR35_hh_credit_card_loans_no_loan_ac() != null) {
					    R33cell4.setCellValue(record.getR35_hh_credit_card_loans_no_loan_ac().doubleValue());
					    R33cell4.setCellStyle(numberStyle);
					} else {
					    R33cell4.setCellValue("");
					    R33cell4.setCellStyle(textStyle);
					}


					// Row 34
					row = sheet.getRow(35);
					Cell R34cell1 = row.createCell(1);
					if (record.getR36_hh_other_no_of_dep() != null) {
					    R34cell1.setCellValue(record.getR36_hh_other_no_of_dep().doubleValue());
					    R34cell1.setCellStyle(numberStyle);
					} else {
					    R34cell1.setCellValue("");
					    R34cell1.setCellStyle(textStyle);
					}

					Cell R34cell2 = row.createCell(2);
					if (record.getR36_hh_other_no_of_dep_ac() != null) {
					    R34cell2.setCellValue(record.getR36_hh_other_no_of_dep_ac().doubleValue());
					    R34cell2.setCellStyle(numberStyle);
					} else {
					    R34cell2.setCellValue("");
					    R34cell2.setCellStyle(textStyle);
					}

					Cell R34cell3 = row.createCell(3);
					if (record.getR36_hh_other_no_of_brw() != null) {
					    R34cell3.setCellValue(record.getR36_hh_other_no_of_brw().doubleValue());
					    R34cell3.setCellStyle(numberStyle);
					} else {
					    R34cell3.setCellValue("");
					    R34cell3.setCellStyle(textStyle);
					}

					Cell R34cell4 = row.createCell(4);
					if (record.getR36_hh_other_no_loan_ac() != null) {
					    R34cell4.setCellValue(record.getR36_hh_other_no_loan_ac().doubleValue());
					    R34cell4.setCellStyle(numberStyle);
					} else {
					    R34cell4.setCellValue("");
					    R34cell4.setCellStyle(textStyle);
					}


					// Row 35
					row = sheet.getRow(36);
					Cell R35cell1 = row.createCell(1);
					if (record.getR37_non_profit_inst_hh_no_of_dep() != null) {
					    R35cell1.setCellValue(record.getR37_non_profit_inst_hh_no_of_dep().doubleValue());
					    R35cell1.setCellStyle(numberStyle);
					} else {
					    R35cell1.setCellValue("");
					    R35cell1.setCellStyle(textStyle);
					}

					Cell R35cell2 = row.createCell(2);
					if (record.getR37_non_profit_inst_hh_no_of_dep_ac() != null) {
					    R35cell2.setCellValue(record.getR37_non_profit_inst_hh_no_of_dep_ac().doubleValue());
					    R35cell2.setCellStyle(numberStyle);
					} else {
					    R35cell2.setCellValue("");
					    R35cell2.setCellStyle(textStyle);
					}

					Cell R35cell3 = row.createCell(3);
					if (record.getR37_non_profit_inst_hh_no_of_brw() != null) {
					    R35cell3.setCellValue(record.getR37_non_profit_inst_hh_no_of_brw().doubleValue());
					    R35cell3.setCellStyle(numberStyle);
					} else {
					    R35cell3.setCellValue("");
					    R35cell3.setCellStyle(textStyle);
					}

					Cell R35cell4 = row.createCell(4);
					if (record.getR37_non_profit_inst_hh_no_loan_ac() != null) {
					    R35cell4.setCellValue(record.getR37_non_profit_inst_hh_no_loan_ac().doubleValue());
					    R35cell4.setCellStyle(numberStyle);
					} else {
					    R35cell4.setCellValue("");
					    R35cell4.setCellStyle(textStyle);
					}


					// Row 36
					row = sheet.getRow(38);
					Cell R36cell1 = row.createCell(1);
					if (record.getR39_non_res_corp_no_of_dep() != null) {
					    R36cell1.setCellValue(record.getR39_non_res_corp_no_of_dep().doubleValue());
					    R36cell1.setCellStyle(numberStyle);
					} else {
					    R36cell1.setCellValue("");
					    R36cell1.setCellStyle(textStyle);
					}

					Cell R36cell2 = row.createCell(2);
					if (record.getR39_non_res_corp_no_of_dep_ac() != null) {
					    R36cell2.setCellValue(record.getR39_non_res_corp_no_of_dep_ac().doubleValue());
					    R36cell2.setCellStyle(numberStyle);
					} else {
					    R36cell2.setCellValue("");
					    R36cell2.setCellStyle(textStyle);
					}

					Cell R36cell3 = row.createCell(3);
					if (record.getR39_non_res_corp_no_of_brw() != null) {
					    R36cell3.setCellValue(record.getR39_non_res_corp_no_of_brw().doubleValue());
					    R36cell3.setCellStyle(numberStyle);
					} else {
					    R36cell3.setCellValue("");
					    R36cell3.setCellStyle(textStyle);
					}

					Cell R36cell4 = row.createCell(4);
					if (record.getR39_non_res_corp_no_loan_ac() != null) {
					    R36cell4.setCellValue(record.getR39_non_res_corp_no_loan_ac().doubleValue());
					    R36cell4.setCellStyle(numberStyle);
					} else {
					    R36cell4.setCellValue("");
					    R36cell4.setCellStyle(textStyle);
					}


					// Row 37
					row = sheet.getRow(39);
					Cell R37cell1 = row.createCell(1);
					if (record.getR40_non_res_hh_no_of_dep() != null) {
					    R37cell1.setCellValue(record.getR40_non_res_hh_no_of_dep().doubleValue());
					    R37cell1.setCellStyle(numberStyle);
					} else {
					    R37cell1.setCellValue("");
					    R37cell1.setCellStyle(textStyle);
					}

					Cell R37cell2 = row.createCell(2);
					if (record.getR40_non_res_hh_no_of_dep_ac() != null) {
					    R37cell2.setCellValue(record.getR40_non_res_hh_no_of_dep_ac().doubleValue());
					    R37cell2.setCellStyle(numberStyle);
					} else {
					    R37cell2.setCellValue("");
					    R37cell2.setCellStyle(textStyle);
					}

					Cell R37cell3 = row.createCell(3);
					if (record.getR40_non_res_hh_no_of_brw() != null) {
					    R37cell3.setCellValue(record.getR40_non_res_hh_no_of_brw().doubleValue());
					    R37cell3.setCellStyle(numberStyle);
					} else {
					    R37cell3.setCellValue("");
					    R37cell3.setCellStyle(textStyle);
					}

					Cell R37cell4 = row.createCell(4);
					if (record.getR40_non_res_hh_no_loan_ac() != null) {
					    R37cell4.setCellValue(record.getR40_non_res_hh_no_loan_ac().doubleValue());
					    R37cell4.setCellStyle(numberStyle);
					} else {
					    R37cell4.setCellValue("");
					    R37cell4.setCellStyle(textStyle);
					}


					// Row 38
					row = sheet.getRow(41);
					Cell R38cell1 = row.createCell(1);
					if (record.getR42_central_bank_no_of_dep() != null) {
					    R38cell1.setCellValue(record.getR42_central_bank_no_of_dep().doubleValue());
					    R38cell1.setCellStyle(numberStyle);
					} else {
					    R38cell1.setCellValue("");
					    R38cell1.setCellStyle(textStyle);
					}

					Cell R38cell2 = row.createCell(2);
					if (record.getR42_central_bank_no_of_dep_ac() != null) {
					    R38cell2.setCellValue(record.getR42_central_bank_no_of_dep_ac().doubleValue());
					    R38cell2.setCellStyle(numberStyle);
					} else {
					    R38cell2.setCellValue("");
					    R38cell2.setCellStyle(textStyle);
					}

					Cell R38cell3 = row.createCell(3);
					if (record.getR42_central_bank_no_of_brw() != null) {
					    R38cell3.setCellValue(record.getR42_central_bank_no_of_brw().doubleValue());
					    R38cell3.setCellStyle(numberStyle);
					} else {
					    R38cell3.setCellValue("");
					    R38cell3.setCellStyle(textStyle);
					}

					Cell R38cell4 = row.createCell(4);
					if (record.getR42_central_bank_no_loan_ac() != null) {
					    R38cell4.setCellValue(record.getR42_central_bank_no_loan_ac().doubleValue());
					    R38cell4.setCellStyle(numberStyle);
					} else {
					    R38cell4.setCellValue("");
					    R38cell4.setCellStyle(textStyle);
					}


					// Row 39
					row = sheet.getRow(42);
					Cell R39cell1 = row.createCell(1);
					if (record.getR43_comm_banks_no_of_dep() != null) {
					    R39cell1.setCellValue(record.getR43_comm_banks_no_of_dep().doubleValue());
					    R39cell1.setCellStyle(numberStyle);
					} else {
					    R39cell1.setCellValue("");
					    R39cell1.setCellStyle(textStyle);
					}

					Cell R39cell2 = row.createCell(2);
					if (record.getR43_comm_banks_no_of_dep_ac() != null) {
					    R39cell2.setCellValue(record.getR43_comm_banks_no_of_dep_ac().doubleValue());
					    R39cell2.setCellStyle(numberStyle);
					} else {
					    R39cell2.setCellValue("");
					    R39cell2.setCellStyle(textStyle);
					}

					Cell R39cell3 = row.createCell(3);
					if (record.getR43_comm_banks_no_of_brw() != null) {
					    R39cell3.setCellValue(record.getR43_comm_banks_no_of_brw().doubleValue());
					    R39cell3.setCellStyle(numberStyle);
					} else {
					    R39cell3.setCellValue("");
					    R39cell3.setCellStyle(textStyle);
					}

					Cell R39cell4 = row.createCell(4);
					if (record.getR43_comm_banks_no_loan_ac() != null) {
					    R39cell4.setCellValue(record.getR43_comm_banks_no_loan_ac().doubleValue());
					    R39cell4.setCellStyle(numberStyle);
					} else {
					    R39cell4.setCellValue("");
					    R39cell4.setCellStyle(textStyle);
					}


					// Row 40
					row = sheet.getRow(44);
					Cell R40cell1 = row.createCell(1);
					if (record.getR45_bsb_no_of_dep() != null) {
					    R40cell1.setCellValue(record.getR45_bsb_no_of_dep().doubleValue());
					    R40cell1.setCellStyle(numberStyle);
					} else {
					    R40cell1.setCellValue("");
					    R40cell1.setCellStyle(textStyle);
					}

					Cell R40cell2 = row.createCell(2);
					if (record.getR45_bsb_no_of_dep_ac() != null) {
					    R40cell2.setCellValue(record.getR45_bsb_no_of_dep_ac().doubleValue());
					    R40cell2.setCellStyle(numberStyle);
					} else {
					    R40cell2.setCellValue("");
					    R40cell2.setCellStyle(textStyle);
					}

					Cell R40cell3 = row.createCell(3);
					if (record.getR45_bsb_no_of_brw() != null) {
					    R40cell3.setCellValue(record.getR45_bsb_no_of_brw().doubleValue());
					    R40cell3.setCellStyle(numberStyle);
					} else {
					    R40cell3.setCellValue("");
					    R40cell3.setCellStyle(textStyle);
					}

					Cell R40cell4 = row.createCell(4);
					if (record.getR45_bsb_no_loan_ac() != null) {
					    R40cell4.setCellValue(record.getR45_bsb_no_loan_ac().doubleValue());
					    R40cell4.setCellStyle(numberStyle);
					} else {
					    R40cell4.setCellValue("");
					    R40cell4.setCellStyle(textStyle);
					}


					// Row 41
					row = sheet.getRow(45);
					Cell R41cell1 = row.createCell(1);
					if (record.getR46_bbs_no_of_dep() != null) {
					    R41cell1.setCellValue(record.getR46_bbs_no_of_dep().doubleValue());
					    R41cell1.setCellStyle(numberStyle);
					} else {
					    R41cell1.setCellValue("");
					    R41cell1.setCellStyle(textStyle);
					}

					Cell R41cell2 = row.createCell(2);
					if (record.getR46_bbs_no_of_dep_ac() != null) {
					    R41cell2.setCellValue(record.getR46_bbs_no_of_dep_ac().doubleValue());
					    R41cell2.setCellStyle(numberStyle);
					} else {
					    R41cell2.setCellValue("");
					    R41cell2.setCellStyle(textStyle);
					}

					Cell R41cell3 = row.createCell(3);
					if (record.getR46_bbs_no_of_brw() != null) {
					    R41cell3.setCellValue(record.getR46_bbs_no_of_brw().doubleValue());
					    R41cell3.setCellStyle(numberStyle);
					} else {
					    R41cell3.setCellValue("");
					    R41cell3.setCellStyle(textStyle);
					}

					Cell R41cell4 = row.createCell(4);
					if (record.getR46_bbs_no_loan_ac() != null) {
					    R41cell4.setCellValue(record.getR46_bbs_no_loan_ac().doubleValue());
					    R41cell4.setCellStyle(numberStyle);
					} else {
					    R41cell4.setCellValue("");
					    R41cell4.setCellStyle(textStyle);
					}


					// Row 42
					row = sheet.getRow(46);
					Cell R42cell1 = row.createCell(1);
					if (record.getR47_money_mkt_unittrust_no_of_dep() != null) {
					    R42cell1.setCellValue(record.getR47_money_mkt_unittrust_no_of_dep().doubleValue());
					    R42cell1.setCellStyle(numberStyle);
					} else {
					    R42cell1.setCellValue("");
					    R42cell1.setCellStyle(textStyle);
					}

					Cell R42cell2 = row.createCell(2);
					if (record.getR47_money_mkt_unittrust_no_of_dep_ac() != null) {
					    R42cell2.setCellValue(record.getR47_money_mkt_unittrust_no_of_dep_ac().doubleValue());
					    R42cell2.setCellStyle(numberStyle);
					} else {
					    R42cell2.setCellValue("");
					    R42cell2.setCellStyle(textStyle);
					}

					Cell R42cell3 = row.createCell(3);
					if (record.getR47_money_mkt_unittrust_no_of_brw() != null) {
					    R42cell3.setCellValue(record.getR47_money_mkt_unittrust_no_of_brw().doubleValue());
					    R42cell3.setCellStyle(numberStyle);
					} else {
					    R42cell3.setCellValue("");
					    R42cell3.setCellStyle(textStyle);
					}

					Cell R42cell4 = row.createCell(4);
					if (record.getR47_money_mkt_unittrust_no_loan_ac() != null) {
					    R42cell4.setCellValue(record.getR47_money_mkt_unittrust_no_loan_ac().doubleValue());
					    R42cell4.setCellStyle(numberStyle);
					} else {
					    R42cell4.setCellValue("");
					    R42cell4.setCellStyle(textStyle);
					}


					// Row 43
					row = sheet.getRow(47);
					Cell R43cell1 = row.createCell(1);
					if (record.getR48_other_dep_corp_specify_no_of_dep() != null) {
					    R43cell1.setCellValue(record.getR48_other_dep_corp_specify_no_of_dep().doubleValue());
					    R43cell1.setCellStyle(numberStyle);
					} else {
					    R43cell1.setCellValue("");
					    R43cell1.setCellStyle(textStyle);
					}

					Cell R43cell2 = row.createCell(2);
					if (record.getR48_other_dep_corp_specify_no_of_dep_ac() != null) {
					    R43cell2.setCellValue(record.getR48_other_dep_corp_specify_no_of_dep_ac().doubleValue());
					    R43cell2.setCellStyle(numberStyle);
					} else {
					    R43cell2.setCellValue("");
					    R43cell2.setCellStyle(textStyle);
					}

					Cell R43cell3 = row.createCell(3);
					if (record.getR48_other_dep_corp_specify_no_of_brw() != null) {
					    R43cell3.setCellValue(record.getR48_other_dep_corp_specify_no_of_brw().doubleValue());
					    R43cell3.setCellStyle(numberStyle);
					} else {
					    R43cell3.setCellValue("");
					    R43cell3.setCellStyle(textStyle);
					}

					Cell R43cell4 = row.createCell(4);
					if (record.getR48_other_dep_corp_specify_no_loan_ac() != null) {
					    R43cell4.setCellValue(record.getR48_other_dep_corp_specify_no_loan_ac().doubleValue());
					    R43cell4.setCellStyle(numberStyle);
					} else {
					    R43cell4.setCellValue("");
					    R43cell4.setCellStyle(textStyle);
					}


					// Row 44
					row = sheet.getRow(49);
					Cell R44cell1 = row.createCell(1);
					if (record.getR50_insurance_co_no_of_dep() != null) {
					    R44cell1.setCellValue(record.getR50_insurance_co_no_of_dep().doubleValue());
					    R44cell1.setCellStyle(numberStyle);
					} else {
					    R44cell1.setCellValue("");
					    R44cell1.setCellStyle(textStyle);
					}

					Cell R44cell2 = row.createCell(2);
					if (record.getR50_insurance_co_no_of_dep_ac() != null) {
					    R44cell2.setCellValue(record.getR50_insurance_co_no_of_dep_ac().doubleValue());
					    R44cell2.setCellStyle(numberStyle);
					} else {
					    R44cell2.setCellValue("");
					    R44cell2.setCellStyle(textStyle);
					}

					Cell R44cell3 = row.createCell(3);
					if (record.getR50_insurance_co_no_of_brw() != null) {
					    R44cell3.setCellValue(record.getR50_insurance_co_no_of_brw().doubleValue());
					    R44cell3.setCellStyle(numberStyle);
					} else {
					    R44cell3.setCellValue("");
					    R44cell3.setCellStyle(textStyle);
					}

					Cell R44cell4 = row.createCell(4);
					if (record.getR50_insurance_co_no_loan_ac() != null) {
					    R44cell4.setCellValue(record.getR50_insurance_co_no_loan_ac().doubleValue());
					    R44cell4.setCellStyle(numberStyle);
					} else {
					    R44cell4.setCellValue("");
					    R44cell4.setCellStyle(textStyle);
					}


					// Row 45
					row = sheet.getRow(50);
					Cell R45cell1 = row.createCell(1);
					if (record.getR51_pension_funds_no_of_dep() != null) {
					    R45cell1.setCellValue(record.getR51_pension_funds_no_of_dep().doubleValue());
					    R45cell1.setCellStyle(numberStyle);
					} else {
					    R45cell1.setCellValue("");
					    R45cell1.setCellStyle(textStyle);
					}

					Cell R45cell2 = row.createCell(2);
					if (record.getR51_pension_funds_no_of_dep_ac() != null) {
					    R45cell2.setCellValue(record.getR51_pension_funds_no_of_dep_ac().doubleValue());
					    R45cell2.setCellStyle(numberStyle);
					} else {
					    R45cell2.setCellValue("");
					    R45cell2.setCellStyle(textStyle);
					}

					Cell R45cell3 = row.createCell(3);
					if (record.getR51_pension_funds_no_of_brw() != null) {
					    R45cell3.setCellValue(record.getR51_pension_funds_no_of_brw().doubleValue());
					    R45cell3.setCellStyle(numberStyle);
					} else {
					    R45cell3.setCellValue("");
					    R45cell3.setCellStyle(textStyle);
					}

					Cell R45cell4 = row.createCell(4);
					if (record.getR51_pension_funds_no_loan_ac() != null) {
					    R45cell4.setCellValue(record.getR51_pension_funds_no_loan_ac().doubleValue());
					    R45cell4.setCellStyle(numberStyle);
					} else {
					    R45cell4.setCellValue("");
					    R45cell4.setCellStyle(textStyle);
					}


					// Row 46
					row = sheet.getRow(51);
					Cell R46cell1 = row.createCell(1);
					if (record.getR52_saccos_no_of_dep() != null) {
					    R46cell1.setCellValue(record.getR52_saccos_no_of_dep().doubleValue());
					    R46cell1.setCellStyle(numberStyle);
					} else {
					    R46cell1.setCellValue("");
					    R46cell1.setCellStyle(textStyle);
					}

					Cell R46cell2 = row.createCell(2);
					if (record.getR52_saccos_no_of_dep_ac() != null) {
					    R46cell2.setCellValue(record.getR52_saccos_no_of_dep_ac().doubleValue());
					    R46cell2.setCellStyle(numberStyle);
					} else {
					    R46cell2.setCellValue("");
					    R46cell2.setCellStyle(textStyle);
					}

					Cell R46cell3 = row.createCell(3);
					if (record.getR52_saccos_no_of_brw() != null) {
					    R46cell3.setCellValue(record.getR52_saccos_no_of_brw().doubleValue());
					    R46cell3.setCellStyle(numberStyle);
					} else {
					    R46cell3.setCellValue("");
					    R46cell3.setCellStyle(textStyle);
					}

					Cell R46cell4 = row.createCell(4);
					if (record.getR52_saccos_no_loan_ac() != null) {
					    R46cell4.setCellValue(record.getR52_saccos_no_loan_ac().doubleValue());
					    R46cell4.setCellStyle(numberStyle);
					} else {
					    R46cell4.setCellValue("");
					    R46cell4.setCellStyle(textStyle);
					}


					// Row 47
					row = sheet.getRow(53);
					Cell R47cell1 = row.createCell(1);
					if (record.getR54_fin_co_no_of_dep() != null) {
					    R47cell1.setCellValue(record.getR54_fin_co_no_of_dep().doubleValue());
					    R47cell1.setCellStyle(numberStyle);
					} else {
					    R47cell1.setCellValue("");
					    R47cell1.setCellStyle(textStyle);
					}

					Cell R47cell2 = row.createCell(2);
					if (record.getR54_fin_co_no_of_dep_ac() != null) {
					    R47cell2.setCellValue(record.getR54_fin_co_no_of_dep_ac().doubleValue());
					    R47cell2.setCellStyle(numberStyle);
					} else {
					    R47cell2.setCellValue("");
					    R47cell2.setCellStyle(textStyle);
					}

					Cell R47cell3 = row.createCell(3);
					if (record.getR54_fin_co_no_of_brw() != null) {
					    R47cell3.setCellValue(record.getR54_fin_co_no_of_brw().doubleValue());
					    R47cell3.setCellStyle(numberStyle);
					} else {
					    R47cell3.setCellValue("");
					    R47cell3.setCellStyle(textStyle);
					}

					Cell R47cell4 = row.createCell(4);
					if (record.getR54_fin_co_no_loan_ac() != null) {
					    R47cell4.setCellValue(record.getR54_fin_co_no_loan_ac().doubleValue());
					    R47cell4.setCellStyle(numberStyle);
					} else {
					    R47cell4.setCellValue("");
					    R47cell4.setCellStyle(textStyle);
					}


					// Row 48
					row = sheet.getRow(54);
					Cell R48cell1 = row.createCell(1);
					if (record.getR55_med_aid_schemes_no_of_dep() != null) {
					    R48cell1.setCellValue(record.getR55_med_aid_schemes_no_of_dep().doubleValue());
					    R48cell1.setCellStyle(numberStyle);
					} else {
					    R48cell1.setCellValue("");
					    R48cell1.setCellStyle(textStyle);
					}

					Cell R48cell2 = row.createCell(2);
					if (record.getR55_med_aid_schemes_no_of_dep_ac() != null) {
					    R48cell2.setCellValue(record.getR55_med_aid_schemes_no_of_dep_ac().doubleValue());
					    R48cell2.setCellStyle(numberStyle);
					} else {
					    R48cell2.setCellValue("");
					    R48cell2.setCellStyle(textStyle);
					}

					Cell R48cell3 = row.createCell(3);
					if (record.getR55_med_aid_schemes_no_of_brw() != null) {
					    R48cell3.setCellValue(record.getR55_med_aid_schemes_no_of_brw().doubleValue());
					    R48cell3.setCellStyle(numberStyle);
					} else {
					    R48cell3.setCellValue("");
					    R48cell3.setCellStyle(textStyle);
					}

					Cell R48cell4 = row.createCell(4);
					if (record.getR55_med_aid_schemes_no_loan_ac() != null) {
					    R48cell4.setCellValue(record.getR55_med_aid_schemes_no_loan_ac().doubleValue());
					    R48cell4.setCellStyle(numberStyle);
					} else {
					    R48cell4.setCellValue("");
					    R48cell4.setCellStyle(textStyle);
					}


					// Row 49
					row = sheet.getRow(55);
					Cell R49cell1 = row.createCell(1);
					if (record.getR56_pub_sec_fin_int_no_of_dep() != null) {
					    R49cell1.setCellValue(record.getR56_pub_sec_fin_int_no_of_dep().doubleValue());
					    R49cell1.setCellStyle(numberStyle);
					} else {
					    R49cell1.setCellValue("");
					    R49cell1.setCellStyle(textStyle);
					}

					Cell R49cell2 = row.createCell(2);
					if (record.getR56_pub_sec_fin_int_no_of_dep_ac() != null) {
					    R49cell2.setCellValue(record.getR56_pub_sec_fin_int_no_of_dep_ac().doubleValue());
					    R49cell2.setCellStyle(numberStyle);
					} else {
					    R49cell2.setCellValue("");
					    R49cell2.setCellStyle(textStyle);
					}

					Cell R49cell3 = row.createCell(3);
					if (record.getR56_pub_sec_fin_int_no_of_brw() != null) {
					    R49cell3.setCellValue(record.getR56_pub_sec_fin_int_no_of_brw().doubleValue());
					    R49cell3.setCellStyle(numberStyle);
					} else {
					    R49cell3.setCellValue("");
					    R49cell3.setCellStyle(textStyle);
					}

					Cell R49cell4 = row.createCell(4);
					if (record.getR56_pub_sec_fin_int_no_loan_ac() != null) {
					    R49cell4.setCellValue(record.getR56_pub_sec_fin_int_no_loan_ac().doubleValue());
					    R49cell4.setCellStyle(numberStyle);
					} else {
					    R49cell4.setCellValue("");
					    R49cell4.setCellStyle(textStyle);
					}


					// Row 50
					row = sheet.getRow(57);
					Cell R50cell1 = row.createCell(1);
					if (record.getR58_asset_managers_no_of_dep() != null) {
					    R50cell1.setCellValue(record.getR58_asset_managers_no_of_dep().doubleValue());
					    R50cell1.setCellStyle(numberStyle);
					} else {
					    R50cell1.setCellValue("");
					    R50cell1.setCellStyle(textStyle);
					}

					Cell R50cell2 = row.createCell(2);
					if (record.getR58_asset_managers_no_of_dep_ac() != null) {
					    R50cell2.setCellValue(record.getR58_asset_managers_no_of_dep_ac().doubleValue());
					    R50cell2.setCellStyle(numberStyle);
					} else {
					    R50cell2.setCellValue("");
					    R50cell2.setCellStyle(textStyle);
					}

					Cell R50cell3 = row.createCell(3);
					if (record.getR58_asset_managers_no_of_brw() != null) {
					    R50cell3.setCellValue(record.getR58_asset_managers_no_of_brw().doubleValue());
					    R50cell3.setCellStyle(numberStyle);
					} else {
					    R50cell3.setCellValue("");
					    R50cell3.setCellStyle(textStyle);
					}

					Cell R50cell4 = row.createCell(4);
					if (record.getR58_asset_managers_no_loan_ac() != null) {
					    R50cell4.setCellValue(record.getR58_asset_managers_no_loan_ac().doubleValue());
					    R50cell4.setCellStyle(numberStyle);
					} else {
					    R50cell4.setCellValue("");
					    R50cell4.setCellStyle(textStyle);
					}


					// Row 51
					row = sheet.getRow(58);
					Cell R51cell1 = row.createCell(1);
					if (record.getR59_insurance_brokers_no_of_dep() != null) {
					    R51cell1.setCellValue(record.getR59_insurance_brokers_no_of_dep().doubleValue());
					    R51cell1.setCellStyle(numberStyle);
					} else {
					    R51cell1.setCellValue("");
					    R51cell1.setCellStyle(textStyle);
					}

					Cell R51cell2 = row.createCell(2);
					if (record.getR59_insurance_brokers_no_of_dep_ac() != null) {
					    R51cell2.setCellValue(record.getR59_insurance_brokers_no_of_dep_ac().doubleValue());
					    R51cell2.setCellStyle(numberStyle);
					} else {
					    R51cell2.setCellValue("");
					    R51cell2.setCellStyle(textStyle);
					}

					Cell R51cell3 = row.createCell(3);
					if (record.getR59_insurance_brokers_no_of_brw() != null) {
					    R51cell3.setCellValue(record.getR59_insurance_brokers_no_of_brw().doubleValue());
					    R51cell3.setCellStyle(numberStyle);
					} else {
					    R51cell3.setCellValue("");
					    R51cell3.setCellStyle(textStyle);
					}

					Cell R51cell4 = row.createCell(4);
					if (record.getR59_insurance_brokers_no_loan_ac() != null) {
					    R51cell4.setCellValue(record.getR59_insurance_brokers_no_loan_ac().doubleValue());
					    R51cell4.setCellStyle(numberStyle);
					} else {
					    R51cell4.setCellValue("");
					    R51cell4.setCellStyle(textStyle);
					}


					// Row 52
					row = sheet.getRow(59);
					Cell R52cell1 = row.createCell(1);
					if (record.getR60_fund_admin_no_of_dep() != null) {
					    R52cell1.setCellValue(record.getR60_fund_admin_no_of_dep().doubleValue());
					    R52cell1.setCellStyle(numberStyle);
					} else {
					    R52cell1.setCellValue("");
					    R52cell1.setCellStyle(textStyle);
					}

					Cell R52cell2 = row.createCell(2);
					if (record.getR60_fund_admin_no_of_dep_ac() != null) {
					    R52cell2.setCellValue(record.getR60_fund_admin_no_of_dep_ac().doubleValue());
					    R52cell2.setCellStyle(numberStyle);
					} else {
					    R52cell2.setCellValue("");
					    R52cell2.setCellStyle(textStyle);
					}

					Cell R52cell3 = row.createCell(3);
					if (record.getR60_fund_admin_no_of_brw() != null) {
					    R52cell3.setCellValue(record.getR60_fund_admin_no_of_brw().doubleValue());
					    R52cell3.setCellStyle(numberStyle);
					} else {
					    R52cell3.setCellValue("");
					    R52cell3.setCellStyle(textStyle);
					}

					Cell R52cell4 = row.createCell(4);
					if (record.getR60_fund_admin_no_loan_ac() != null) {
					    R52cell4.setCellValue(record.getR60_fund_admin_no_loan_ac().doubleValue());
					    R52cell4.setCellStyle(numberStyle);
					} else {
					    R52cell4.setCellValue("");
					    R52cell4.setCellStyle(textStyle);
					}


					// Row 53
					row = sheet.getRow(60);
					Cell R53cell1 = row.createCell(1);
					if (record.getR61_bureau_change_no_of_dep() != null) {
					    R53cell1.setCellValue(record.getR61_bureau_change_no_of_dep().doubleValue());
					    R53cell1.setCellStyle(numberStyle);
					} else {
					    R53cell1.setCellValue("");
					    R53cell1.setCellStyle(textStyle);
					}

					Cell R53cell2 = row.createCell(2);
					if (record.getR61_bureau_change_no_of_dep_ac() != null) {
					    R53cell2.setCellValue(record.getR61_bureau_change_no_of_dep_ac().doubleValue());
					    R53cell2.setCellStyle(numberStyle);
					} else {
					    R53cell2.setCellValue("");
					    R53cell2.setCellStyle(textStyle);
					}

					Cell R53cell3 = row.createCell(3);
					if (record.getR61_bureau_change_no_of_brw() != null) {
					    R53cell3.setCellValue(record.getR61_bureau_change_no_of_brw().doubleValue());
					    R53cell3.setCellStyle(numberStyle);
					} else {
					    R53cell3.setCellValue("");
					    R53cell3.setCellStyle(textStyle);
					}

					Cell R53cell4 = row.createCell(4);
					if (record.getR61_bureau_change_no_loan_ac() != null) {
					    R53cell4.setCellValue(record.getR61_bureau_change_no_loan_ac().doubleValue());
					    R53cell4.setCellStyle(numberStyle);
					} else {
					    R53cell4.setCellValue("");
					    R53cell4.setCellStyle(textStyle);
					}


					// Row 54
					row = sheet.getRow(61);
					Cell R54cell1 = row.createCell(1);
					if (record.getR62_fin_aux_other_no_of_dep() != null) {
					    R54cell1.setCellValue(record.getR62_fin_aux_other_no_of_dep().doubleValue());
					    R54cell1.setCellStyle(numberStyle);
					} else {
					    R54cell1.setCellValue("");
					    R54cell1.setCellStyle(textStyle);
					}

					Cell R54cell2 = row.createCell(2);
					if (record.getR62_fin_aux_other_no_of_dep_ac() != null) {
					    R54cell2.setCellValue(record.getR62_fin_aux_other_no_of_dep_ac().doubleValue());
					    R54cell2.setCellStyle(numberStyle);
					} else {
					    R54cell2.setCellValue("");
					    R54cell2.setCellStyle(textStyle);
					}

					Cell R54cell3 = row.createCell(3);
					if (record.getR62_fin_aux_other_no_of_brw() != null) {
					    R54cell3.setCellValue(record.getR62_fin_aux_other_no_of_brw().doubleValue());
					    R54cell3.setCellStyle(numberStyle);
					} else {
					    R54cell3.setCellValue("");
					    R54cell3.setCellStyle(textStyle);
					}

					Cell R54cell4 = row.createCell(4);
					if (record.getR62_fin_aux_other_no_loan_ac() != null) {
					    R54cell4.setCellValue(record.getR62_fin_aux_other_no_loan_ac().doubleValue());
					    R54cell4.setCellStyle(numberStyle);
					} else {
					    R54cell4.setCellValue("");
					    R54cell4.setCellStyle(textStyle);
					}


					// Row 55
					row = sheet.getRow(62);
					Cell R55cell1 = row.createCell(1);
					if (record.getR63_non_residents_fin_no_of_dep() != null) {
					    R55cell1.setCellValue(record.getR63_non_residents_fin_no_of_dep().doubleValue());
					    R55cell1.setCellStyle(numberStyle);
					} else {
					    R55cell1.setCellValue("");
					    R55cell1.setCellStyle(textStyle);
					}

					Cell R55cell2 = row.createCell(2);
					if (record.getR63_non_residents_fin_no_of_dep_ac() != null) {
					    R55cell2.setCellValue(record.getR63_non_residents_fin_no_of_dep_ac().doubleValue());
					    R55cell2.setCellStyle(numberStyle);
					} else {
					    R55cell2.setCellValue("");
					    R55cell2.setCellStyle(textStyle);
					}

					Cell R55cell3 = row.createCell(3);
					if (record.getR63_non_residents_fin_no_of_brw() != null) {
					    R55cell3.setCellValue(record.getR63_non_residents_fin_no_of_brw().doubleValue());
					    R55cell3.setCellStyle(numberStyle);
					} else {
					    R55cell3.setCellValue("");
					    R55cell3.setCellStyle(textStyle);
					}

					Cell R55cell4 = row.createCell(4);
					if (record.getR63_non_residents_fin_no_loan_ac() != null) {
					    R55cell4.setCellValue(record.getR63_non_residents_fin_no_loan_ac().doubleValue());
					    R55cell4.setCellStyle(numberStyle);
					} else {
					    R55cell4.setCellValue("");
					    R55cell4.setCellStyle(textStyle);
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

    private byte[] getExcelQ_ATF_SUMMARY_ARCHIVAL(String filename, String reportId, String fromdate, String todate,
			String currency, String dtltype, String type, String version) throws ParseException, EncryptedDocumentException, InvalidFormatException, IOException {
    	logger.info("Service: Starting Excel generation process in memory.");
    	System.out.println(type);
		List<Q_ATF_ARCHIVAL_SUMMARY_ENTITY> dataList = q_atf_summay_archival_repo.getdatabydateListarchival(dateformat.parse(todate), version);

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found for BRF2.1 report. Returning empty result.");
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

		try (InputStream templateInputStream = Files.newInputStream(templatePath);
				Workbook workbook = WorkbookFactory.create(templateInputStream);
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			Sheet sheet = workbook.getSheetAt(0);

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

			Font font = workbook.createFont();
			font.setFontHeightInPoints((short) 8); // size 8
			font.setFontName("Arial");

			CellStyle numberStyle = workbook.createCellStyle();
			numberStyle.setBorderBottom(BorderStyle.THIN);
			numberStyle.setBorderTop(BorderStyle.THIN);
			numberStyle.setBorderLeft(BorderStyle.THIN);
			numberStyle.setBorderRight(BorderStyle.THIN);
			numberStyle.setFont(font);
			// --- End of Style Definitions ---

			int startRow = 15;

			if (!dataList.isEmpty()) {
				for (int i = 0; i < dataList.size(); i++) {
					Q_ATF_ARCHIVAL_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber=" + startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
					
					// Row 12
					row = sheet.getRow(11);
					Cell R12cell1 = row.createCell(1);
					if (record.getR12_central_govt_no_of_dep() != null) {
					    R12cell1.setCellValue(record.getR12_central_govt_no_of_dep().doubleValue());
					    R12cell1.setCellStyle(numberStyle);
					} else {
					    R12cell1.setCellValue("");
					    R12cell1.setCellStyle(textStyle);
					}

					Cell R12cell2 = row.createCell(2);
					if (record.getR12_central_govt_no_of_dep_ac() != null) {
					    R12cell2.setCellValue(record.getR12_central_govt_no_of_dep_ac().doubleValue());
					    R12cell2.setCellStyle(numberStyle);
					} else {
					    R12cell2.setCellValue("");
					    R12cell2.setCellStyle(textStyle);
					}

					Cell R12cell3 = row.createCell(3);
					if (record.getR12_central_govt_no_of_brw() != null) {
					    R12cell3.setCellValue(record.getR12_central_govt_no_of_brw().doubleValue());
					    R12cell3.setCellStyle(numberStyle);
					} else {
					    R12cell3.setCellValue("");
					    R12cell3.setCellStyle(textStyle);
					}

					Cell R12cell4 = row.createCell(4);
					if (record.getR12_central_govt_no_loan_ac() != null) {
					    R12cell4.setCellValue(record.getR12_central_govt_no_loan_ac().doubleValue());
					    R12cell4.setCellStyle(numberStyle);
					} else {
					    R12cell4.setCellValue("");
					    R12cell4.setCellStyle(textStyle);
					}


					// Row 13
					row = sheet.getRow(12);
					Cell R13cell1 = row.createCell(1);
					if (record.getR13_local_govt_no_of_dep() != null) {
					    R13cell1.setCellValue(record.getR13_local_govt_no_of_dep().doubleValue());
					    R13cell1.setCellStyle(numberStyle);
					} else {
					    R13cell1.setCellValue("");
					    R13cell1.setCellStyle(textStyle);
					}

					Cell R13cell2 = row.createCell(2);
					if (record.getR13_local_govt_no_of_dep_ac() != null) {
					    R13cell2.setCellValue(record.getR13_local_govt_no_of_dep_ac().doubleValue());
					    R13cell2.setCellStyle(numberStyle);
					} else {
					    R13cell2.setCellValue("");
					    R13cell2.setCellStyle(textStyle);
					}

					Cell R13cell3 = row.createCell(3);
					if (record.getR13_local_govt_no_of_brw() != null) {
					    R13cell3.setCellValue(record.getR13_local_govt_no_of_brw().doubleValue());
					    R13cell3.setCellStyle(numberStyle);
					} else {
					    R13cell3.setCellValue("");
					    R13cell3.setCellStyle(textStyle);
					}

					Cell R13cell4 = row.createCell(4);
					if (record.getR13_local_govt_no_loan_ac() != null) {
					    R13cell4.setCellValue(record.getR13_local_govt_no_loan_ac().doubleValue());
					    R13cell4.setCellStyle(numberStyle);
					} else {
					    R13cell4.setCellValue("");
					    R13cell4.setCellStyle(textStyle);
					}


					// Row 14
					row = sheet.getRow(13);
					Cell R14cell1 = row.createCell(1);
					if (record.getR14_pub_non_fin_corp_no_of_dep() != null) {
					    R14cell1.setCellValue(record.getR14_pub_non_fin_corp_no_of_dep().doubleValue());
					    R14cell1.setCellStyle(numberStyle);
					} else {
					    R14cell1.setCellValue("");
					    R14cell1.setCellStyle(textStyle);
					}

					Cell R14cell2 = row.createCell(2);
					if (record.getR14_pub_non_fin_corp_no_of_dep_ac() != null) {
					    R14cell2.setCellValue(record.getR14_pub_non_fin_corp_no_of_dep_ac().doubleValue());
					    R14cell2.setCellStyle(numberStyle);
					} else {
					    R14cell2.setCellValue("");
					    R14cell2.setCellStyle(textStyle);
					}

					Cell R14cell3 = row.createCell(3);
					if (record.getR14_pub_non_fin_corp_no_of_brw() != null) {
					    R14cell3.setCellValue(record.getR14_pub_non_fin_corp_no_of_brw().doubleValue());
					    R14cell3.setCellStyle(numberStyle);
					} else {
					    R14cell3.setCellValue("");
					    R14cell3.setCellStyle(textStyle);
					}

					Cell R14cell4 = row.createCell(4);
					if (record.getR14_pub_non_fin_corp_no_loan_ac() != null) {
					    R14cell4.setCellValue(record.getR14_pub_non_fin_corp_no_loan_ac().doubleValue());
					    R14cell4.setCellStyle(numberStyle);
					} else {
					    R14cell4.setCellValue("");
					    R14cell4.setCellStyle(textStyle);
					}


					// Row 15
					row = sheet.getRow(15);
					Cell R15cell1 = row.createCell(1);
					if (record.getR16_agric_forest_fish_no_of_dep() != null) {
					    R15cell1.setCellValue(record.getR16_agric_forest_fish_no_of_dep().doubleValue());
					    R15cell1.setCellStyle(numberStyle);
					} else {
					    R15cell1.setCellValue("");
					    R15cell1.setCellStyle(textStyle);
					}

					Cell R15cell2 = row.createCell(2);
					if (record.getR16_agric_forest_fish_no_of_dep_ac() != null) {
					    R15cell2.setCellValue(record.getR16_agric_forest_fish_no_of_dep_ac().doubleValue());
					    R15cell2.setCellStyle(numberStyle);
					} else {
					    R15cell2.setCellValue("");
					    R15cell2.setCellStyle(textStyle);
					}

					Cell R15cell3 = row.createCell(3);
					if (record.getR16_agric_forest_fish_no_of_brw() != null) {
					    R15cell3.setCellValue(record.getR16_agric_forest_fish_no_of_brw().doubleValue());
					    R15cell3.setCellStyle(numberStyle);
					} else {
					    R15cell3.setCellValue("");
					    R15cell3.setCellStyle(textStyle);
					}

					Cell R15cell4 = row.createCell(4);
					if (record.getR16_agric_forest_fish_no_loan_ac() != null) {
					    R15cell4.setCellValue(record.getR16_agric_forest_fish_no_loan_ac().doubleValue());
					    R15cell4.setCellStyle(numberStyle);
					} else {
					    R15cell4.setCellValue("");
					    R15cell4.setCellStyle(textStyle);
					}


					// Row 16
					row = sheet.getRow(16);
					Cell R16cell1 = row.createCell(1);
					if (record.getR17_mining_quarry_no_of_dep() != null) {
					    R16cell1.setCellValue(record.getR17_mining_quarry_no_of_dep().doubleValue());
					    R16cell1.setCellStyle(numberStyle);
					} else {
					    R16cell1.setCellValue("");
					    R16cell1.setCellStyle(textStyle);
					}

					Cell R16cell2 = row.createCell(2);
					if (record.getR17_mining_quarry_no_of_dep_ac() != null) {
					    R16cell2.setCellValue(record.getR17_mining_quarry_no_of_dep_ac().doubleValue());
					    R16cell2.setCellStyle(numberStyle);
					} else {
					    R16cell2.setCellValue("");
					    R16cell2.setCellStyle(textStyle);
					}

					Cell R16cell3 = row.createCell(3);
					if (record.getR17_mining_quarry_no_of_brw() != null) {
					    R16cell3.setCellValue(record.getR17_mining_quarry_no_of_brw().doubleValue());
					    R16cell3.setCellStyle(numberStyle);
					} else {
					    R16cell3.setCellValue("");
					    R16cell3.setCellStyle(textStyle);
					}

					Cell R16cell4 = row.createCell(4);
					if (record.getR17_mining_quarry_no_loan_ac() != null) {
					    R16cell4.setCellValue(record.getR17_mining_quarry_no_loan_ac().doubleValue());
					    R16cell4.setCellStyle(numberStyle);
					} else {
					    R16cell4.setCellValue("");
					    R16cell4.setCellStyle(textStyle);
					}


					// Row 17
					row = sheet.getRow(17);
					Cell R17cell1 = row.createCell(1);
					if (record.getR18_manufacturing_no_of_dep() != null) {
					    R17cell1.setCellValue(record.getR18_manufacturing_no_of_dep().doubleValue());
					    R17cell1.setCellStyle(numberStyle);
					} else {
					    R17cell1.setCellValue("");
					    R17cell1.setCellStyle(textStyle);
					}

					Cell R17cell2 = row.createCell(2);
					if (record.getR18_manufacturing_no_of_dep_ac() != null) {
					    R17cell2.setCellValue(record.getR18_manufacturing_no_of_dep_ac().doubleValue());
					    R17cell2.setCellStyle(numberStyle);
					} else {
					    R17cell2.setCellValue("");
					    R17cell2.setCellStyle(textStyle);
					}

					Cell R17cell3 = row.createCell(3);
					if (record.getR18_manufacturing_no_of_brw() != null) {
					    R17cell3.setCellValue(record.getR18_manufacturing_no_of_brw().doubleValue());
					    R17cell3.setCellStyle(numberStyle);
					} else {
					    R17cell3.setCellValue("");
					    R17cell3.setCellStyle(textStyle);
					}

					Cell R17cell4 = row.createCell(4);
					if (record.getR18_manufacturing_no_loan_ac() != null) {
					    R17cell4.setCellValue(record.getR18_manufacturing_no_loan_ac().doubleValue());
					    R17cell4.setCellStyle(numberStyle);
					} else {
					    R17cell4.setCellValue("");
					    R17cell4.setCellStyle(textStyle);
					}


					// Row 18
					row = sheet.getRow(18);
					Cell R18cell1 = row.createCell(1);
					if (record.getR19_construction_no_of_dep() != null) {
					    R18cell1.setCellValue(record.getR19_construction_no_of_dep().doubleValue());
					    R18cell1.setCellStyle(numberStyle);
					} else {
					    R18cell1.setCellValue("");
					    R18cell1.setCellStyle(textStyle);
					}

					Cell R18cell2 = row.createCell(2);
					if (record.getR19_construction_no_of_dep_ac() != null) {
					    R18cell2.setCellValue(record.getR19_construction_no_of_dep_ac().doubleValue());
					    R18cell2.setCellStyle(numberStyle);
					} else {
					    R18cell2.setCellValue("");
					    R18cell2.setCellStyle(textStyle);
					}

					Cell R18cell3 = row.createCell(3);
					if (record.getR19_construction_no_of_brw() != null) {
					    R18cell3.setCellValue(record.getR19_construction_no_of_brw().doubleValue());
					    R18cell3.setCellStyle(numberStyle);
					} else {
					    R18cell3.setCellValue("");
					    R18cell3.setCellStyle(textStyle);
					}

					Cell R18cell4 = row.createCell(4);
					if (record.getR19_construction_no_loan_ac() != null) {
					    R18cell4.setCellValue(record.getR19_construction_no_loan_ac().doubleValue());
					    R18cell4.setCellStyle(numberStyle);
					} else {
					    R18cell4.setCellValue("");
					    R18cell4.setCellStyle(textStyle);
					}


					// Row 19
					row = sheet.getRow(19);
					Cell R19cell1 = row.createCell(1);
					if (record.getR20_comm_realestate_no_of_dep() != null) {
					    R19cell1.setCellValue(record.getR20_comm_realestate_no_of_dep().doubleValue());
					    R19cell1.setCellStyle(numberStyle);
					} else {
					    R19cell1.setCellValue("");
					    R19cell1.setCellStyle(textStyle);
					}

					Cell R19cell2 = row.createCell(2);
					if (record.getR20_comm_realestate_no_of_dep_ac() != null) {
					    R19cell2.setCellValue(record.getR20_comm_realestate_no_of_dep_ac().doubleValue());
					    R19cell2.setCellStyle(numberStyle);
					} else {
					    R19cell2.setCellValue("");
					    R19cell2.setCellStyle(textStyle);
					}

					Cell R19cell3 = row.createCell(3);
					if (record.getR20_comm_realestate_no_of_brw() != null) {
					    R19cell3.setCellValue(record.getR20_comm_realestate_no_of_brw().doubleValue());
					    R19cell3.setCellStyle(numberStyle);
					} else {
					    R19cell3.setCellValue("");
					    R19cell3.setCellStyle(textStyle);
					}

					Cell R19cell4 = row.createCell(4);
					if (record.getR20_comm_realestate_no_loan_ac() != null) {
					    R19cell4.setCellValue(record.getR20_comm_realestate_no_loan_ac().doubleValue());
					    R19cell4.setCellStyle(numberStyle);
					} else {
					    R19cell4.setCellValue("");
					    R19cell4.setCellStyle(textStyle);
					}


					// Row 20
					row = sheet.getRow(20);
					Cell R20cell1 = row.createCell(1);
					if (record.getR21_electricity_no_of_dep() != null) {
					    R20cell1.setCellValue(record.getR21_electricity_no_of_dep().doubleValue());
					    R20cell1.setCellStyle(numberStyle);
					} else {
					    R20cell1.setCellValue("");
					    R20cell1.setCellStyle(textStyle);
					}

					Cell R20cell2 = row.createCell(2);
					if (record.getR21_electricity_no_of_dep_ac() != null) {
					    R20cell2.setCellValue(record.getR21_electricity_no_of_dep_ac().doubleValue());
					    R20cell2.setCellStyle(numberStyle);
					} else {
					    R20cell2.setCellValue("");
					    R20cell2.setCellStyle(textStyle);
					}

					Cell R20cell3 = row.createCell(3);
					if (record.getR21_electricity_no_of_brw() != null) {
					    R20cell3.setCellValue(record.getR21_electricity_no_of_brw().doubleValue());
					    R20cell3.setCellStyle(numberStyle);
					} else {
					    R20cell3.setCellValue("");
					    R20cell3.setCellStyle(textStyle);
					}

					Cell R20cell4 = row.createCell(4);
					if (record.getR21_electricity_no_loan_ac() != null) {
					    R20cell4.setCellValue(record.getR21_electricity_no_loan_ac().doubleValue());
					    R20cell4.setCellStyle(numberStyle);
					} else {
					    R20cell4.setCellValue("");
					    R20cell4.setCellStyle(textStyle);
					}


					// Row 21
					row = sheet.getRow(21);
					Cell R21cell1 = row.createCell(1);
					if (record.getR22_water_no_of_dep() != null) {
					    R21cell1.setCellValue(record.getR22_water_no_of_dep().doubleValue());
					    R21cell1.setCellStyle(numberStyle);
					} else {
					    R21cell1.setCellValue("");
					    R21cell1.setCellStyle(textStyle);
					}

					Cell R21cell2 = row.createCell(2);
					if (record.getR22_water_no_of_dep_ac() != null) {
					    R21cell2.setCellValue(record.getR22_water_no_of_dep_ac().doubleValue());
					    R21cell2.setCellStyle(numberStyle);
					} else {
					    R21cell2.setCellValue("");
					    R21cell2.setCellStyle(textStyle);
					}

					Cell R21cell3 = row.createCell(3);
					if (record.getR22_water_no_of_brw() != null) {
					    R21cell3.setCellValue(record.getR22_water_no_of_brw().doubleValue());
					    R21cell3.setCellStyle(numberStyle);
					} else {
					    R21cell3.setCellValue("");
					    R21cell3.setCellStyle(textStyle);
					}

					Cell R21cell4 = row.createCell(4);
					if (record.getR22_water_no_loan_ac() != null) {
					    R21cell4.setCellValue(record.getR22_water_no_loan_ac().doubleValue());
					    R21cell4.setCellStyle(numberStyle);
					} else {
					    R21cell4.setCellValue("");
					    R21cell4.setCellStyle(textStyle);
					}


					// Row 22
					row = sheet.getRow(22);
					Cell R22cell1 = row.createCell(1);
					if (record.getR23_telecom_post_no_of_dep() != null) {
					    R22cell1.setCellValue(record.getR23_telecom_post_no_of_dep().doubleValue());
					    R22cell1.setCellStyle(numberStyle);
					} else {
					    R22cell1.setCellValue("");
					    R22cell1.setCellStyle(textStyle);
					}

					Cell R22cell2 = row.createCell(2);
					if (record.getR23_telecom_post_no_of_dep_ac() != null) {
					    R22cell2.setCellValue(record.getR23_telecom_post_no_of_dep_ac().doubleValue());
					    R22cell2.setCellStyle(numberStyle);
					} else {
					    R22cell2.setCellValue("");
					    R22cell2.setCellStyle(textStyle);
					}

					Cell R22cell3 = row.createCell(3);
					if (record.getR23_telecom_post_no_of_brw() != null) {
					    R22cell3.setCellValue(record.getR23_telecom_post_no_of_brw().doubleValue());
					    R22cell3.setCellStyle(numberStyle);
					} else {
					    R22cell3.setCellValue("");
					    R22cell3.setCellStyle(textStyle);
					}

					Cell R22cell4 = row.createCell(4);
					if (record.getR23_telecom_post_no_loan_ac() != null) {
					    R22cell4.setCellValue(record.getR23_telecom_post_no_loan_ac().doubleValue());
					    R22cell4.setCellStyle(numberStyle);
					} else {
					    R22cell4.setCellValue("");
					    R22cell4.setCellStyle(textStyle);
					}


					// Row 23
					row = sheet.getRow(23);
					Cell R23cell1 = row.createCell(1);
					if (record.getR24_tourism_hotels_no_of_dep() != null) {
					    R23cell1.setCellValue(record.getR24_tourism_hotels_no_of_dep().doubleValue());
					    R23cell1.setCellStyle(numberStyle);
					} else {
					    R23cell1.setCellValue("");
					    R23cell1.setCellStyle(textStyle);
					}

					Cell R23cell2 = row.createCell(2);
					if (record.getR24_tourism_hotels_no_of_dep_ac() != null) {
					    R23cell2.setCellValue(record.getR24_tourism_hotels_no_of_dep_ac().doubleValue());
					    R23cell2.setCellStyle(numberStyle);
					} else {
					    R23cell2.setCellValue("");
					    R23cell2.setCellStyle(textStyle);
					}

					Cell R23cell3 = row.createCell(3);
					if (record.getR24_tourism_hotels_no_of_brw() != null) {
					    R23cell3.setCellValue(record.getR24_tourism_hotels_no_of_brw().doubleValue());
					    R23cell3.setCellStyle(numberStyle);
					} else {
					    R23cell3.setCellValue("");
					    R23cell3.setCellStyle(textStyle);
					}

					Cell R23cell4 = row.createCell(4);
					if (record.getR24_tourism_hotels_no_loan_ac() != null) {
					    R23cell4.setCellValue(record.getR24_tourism_hotels_no_loan_ac().doubleValue());
					    R23cell4.setCellStyle(numberStyle);
					} else {
					    R23cell4.setCellValue("");
					    R23cell4.setCellStyle(textStyle);
					}


					// Row 24
					row = sheet.getRow(24);
					Cell R24cell1 = row.createCell(1);
					if (record.getR25_transport_storage_no_of_dep() != null) {
					    R24cell1.setCellValue(record.getR25_transport_storage_no_of_dep().doubleValue());
					    R24cell1.setCellStyle(numberStyle);
					} else {
					    R24cell1.setCellValue("");
					    R24cell1.setCellStyle(textStyle);
					}

					Cell R24cell2 = row.createCell(2);
					if (record.getR25_transport_storage_no_of_dep_ac() != null) {
					    R24cell2.setCellValue(record.getR25_transport_storage_no_of_dep_ac().doubleValue());
					    R24cell2.setCellStyle(numberStyle);
					} else {
					    R24cell2.setCellValue("");
					    R24cell2.setCellStyle(textStyle);
					}

					Cell R24cell3 = row.createCell(3);
					if (record.getR25_transport_storage_no_of_brw() != null) {
					    R24cell3.setCellValue(record.getR25_transport_storage_no_of_brw().doubleValue());
					    R24cell3.setCellStyle(numberStyle);
					} else {
					    R24cell3.setCellValue("");
					    R24cell3.setCellStyle(textStyle);
					}

					Cell R24cell4 = row.createCell(4);
					if (record.getR25_transport_storage_no_loan_ac() != null) {
					    R24cell4.setCellValue(record.getR25_transport_storage_no_loan_ac().doubleValue());
					    R24cell4.setCellStyle(numberStyle);
					} else {
					    R24cell4.setCellValue("");
					    R24cell4.setCellStyle(textStyle);
					}


					// Row 25
					row = sheet.getRow(25);
					Cell R25cell1 = row.createCell(1);
					if (record.getR26_trade_rest_bar_no_of_dep() != null) {
					    R25cell1.setCellValue(record.getR26_trade_rest_bar_no_of_dep().doubleValue());
					    R25cell1.setCellStyle(numberStyle);
					} else {
					    R25cell1.setCellValue("");
					    R25cell1.setCellStyle(textStyle);
					}

					Cell R25cell2 = row.createCell(2);
					if (record.getR26_trade_rest_bar_no_of_dep_ac() != null) {
					    R25cell2.setCellValue(record.getR26_trade_rest_bar_no_of_dep_ac().doubleValue());
					    R25cell2.setCellStyle(numberStyle);
					} else {
					    R25cell2.setCellValue("");
					    R25cell2.setCellStyle(textStyle);
					}

					Cell R25cell3 = row.createCell(3);
					if (record.getR26_trade_rest_bar_no_of_brw() != null) {
					    R25cell3.setCellValue(record.getR26_trade_rest_bar_no_of_brw().doubleValue());
					    R25cell3.setCellStyle(numberStyle);
					} else {
					    R25cell3.setCellValue("");
					    R25cell3.setCellStyle(textStyle);
					}

					Cell R25cell4 = row.createCell(4);
					if (record.getR26_trade_rest_bar_no_loan_ac() != null) {
					    R25cell4.setCellValue(record.getR26_trade_rest_bar_no_loan_ac().doubleValue());
					    R25cell4.setCellStyle(numberStyle);
					} else {
					    R25cell4.setCellValue("");
					    R25cell4.setCellStyle(textStyle);
					}


					// Row 26
					row = sheet.getRow(26);
					Cell R26cell1 = row.createCell(1);
					if (record.getR27_business_services_no_of_dep() != null) {
					    R26cell1.setCellValue(record.getR27_business_services_no_of_dep().doubleValue());
					    R26cell1.setCellStyle(numberStyle);
					} else {
					    R26cell1.setCellValue("");
					    R26cell1.setCellStyle(textStyle);
					}

					Cell R26cell2 = row.createCell(2);
					if (record.getR27_business_services_no_of_dep_ac() != null) {
					    R26cell2.setCellValue(record.getR27_business_services_no_of_dep_ac().doubleValue());
					    R26cell2.setCellStyle(numberStyle);
					} else {
					    R26cell2.setCellValue("");
					    R26cell2.setCellStyle(textStyle);
					}

					Cell R26cell3 = row.createCell(3);
					if (record.getR27_business_services_no_of_brw() != null) {
					    R26cell3.setCellValue(record.getR27_business_services_no_of_brw().doubleValue());
					    R26cell3.setCellStyle(numberStyle);
					} else {
					    R26cell3.setCellValue("");
					    R26cell3.setCellStyle(textStyle);
					}

					Cell R26cell4 = row.createCell(4);
					if (record.getR27_business_services_no_loan_ac() != null) {
					    R26cell4.setCellValue(record.getR27_business_services_no_loan_ac().doubleValue());
					    R26cell4.setCellStyle(numberStyle);
					} else {
					    R26cell4.setCellValue("");
					    R26cell4.setCellStyle(textStyle);
					}


					// Row 27
					row = sheet.getRow(27);
					Cell R27cell1 = row.createCell(1);
					if (record.getR28_community_services_no_of_dep() != null) {
					    R27cell1.setCellValue(record.getR28_community_services_no_of_dep().doubleValue());
					    R27cell1.setCellStyle(numberStyle);
					} else {
					    R27cell1.setCellValue("");
					    R27cell1.setCellStyle(textStyle);
					}

					Cell R27cell2 = row.createCell(2);
					if (record.getR28_community_services_no_of_dep_ac() != null) {
					    R27cell2.setCellValue(record.getR28_community_services_no_of_dep_ac().doubleValue());
					    R27cell2.setCellStyle(numberStyle);
					} else {
					    R27cell2.setCellValue("");
					    R27cell2.setCellStyle(textStyle);
					}

					Cell R27cell3 = row.createCell(3);
					if (record.getR28_community_services_no_of_brw() != null) {
					    R27cell3.setCellValue(record.getR28_community_services_no_of_brw().doubleValue());
					    R27cell3.setCellStyle(numberStyle);
					} else {
					    R27cell3.setCellValue("");
					    R27cell3.setCellStyle(textStyle);
					}

					Cell R27cell4 = row.createCell(4);
					if (record.getR28_community_services_no_loan_ac() != null) {
					    R27cell4.setCellValue(record.getR28_community_services_no_loan_ac().doubleValue());
					    R27cell4.setCellStyle(numberStyle);
					} else {
					    R27cell4.setCellValue("");
					    R27cell4.setCellStyle(textStyle);
					}


					// Row 28
					row = sheet.getRow(29);
					Cell R28cell1 = row.createCell(1);
					if (record.getR30_hh_residential_owner_no_of_dep() != null) {
					    R28cell1.setCellValue(record.getR30_hh_residential_owner_no_of_dep().doubleValue());
					    R28cell1.setCellStyle(numberStyle);
					} else {
					    R28cell1.setCellValue("");
					    R28cell1.setCellStyle(textStyle);
					}

					Cell R28cell2 = row.createCell(2);
					if (record.getR30_hh_residential_owner_no_of_dep_ac() != null) {
					    R28cell2.setCellValue(record.getR30_hh_residential_owner_no_of_dep_ac().doubleValue());
					    R28cell2.setCellStyle(numberStyle);
					} else {
					    R28cell2.setCellValue("");
					    R28cell2.setCellStyle(textStyle);
					}

					Cell R28cell3 = row.createCell(3);
					if (record.getR30_hh_residential_owner_no_of_brw() != null) {
					    R28cell3.setCellValue(record.getR30_hh_residential_owner_no_of_brw().doubleValue());
					    R28cell3.setCellStyle(numberStyle);
					} else {
					    R28cell3.setCellValue("");
					    R28cell3.setCellStyle(textStyle);
					}

					Cell R28cell4 = row.createCell(4);
					if (record.getR30_hh_residential_owner_no_loan_ac() != null) {
					    R28cell4.setCellValue(record.getR30_hh_residential_owner_no_loan_ac().doubleValue());
					    R28cell4.setCellStyle(numberStyle);
					} else {
					    R28cell4.setCellValue("");
					    R28cell4.setCellStyle(textStyle);
					}


					// Row 29
					row = sheet.getRow(30);
					Cell R29cell1 = row.createCell(1);
					if (record.getR31_hh_residential_rent_no_of_dep() != null) {
					    R29cell1.setCellValue(record.getR31_hh_residential_rent_no_of_dep().doubleValue());
					    R29cell1.setCellStyle(numberStyle);
					} else {
					    R29cell1.setCellValue("");
					    R29cell1.setCellStyle(textStyle);
					}

					Cell R29cell2 = row.createCell(2);
					if (record.getR31_hh_residential_rent_no_of_dep_ac() != null) {
					    R29cell2.setCellValue(record.getR31_hh_residential_rent_no_of_dep_ac().doubleValue());
					    R29cell2.setCellStyle(numberStyle);
					} else {
					    R29cell2.setCellValue("");
					    R29cell2.setCellStyle(textStyle);
					}

					Cell R29cell3 = row.createCell(3);
					if (record.getR31_hh_residential_rent_no_of_brw() != null) {
					    R29cell3.setCellValue(record.getR31_hh_residential_rent_no_of_brw().doubleValue());
					    R29cell3.setCellStyle(numberStyle);
					} else {
					    R29cell3.setCellValue("");
					    R29cell3.setCellStyle(textStyle);
					}

					Cell R29cell4 = row.createCell(4);
					if (record.getR31_hh_residential_rent_no_loan_ac() != null) {
					    R29cell4.setCellValue(record.getR31_hh_residential_rent_no_loan_ac().doubleValue());
					    R29cell4.setCellStyle(numberStyle);
					} else {
					    R29cell4.setCellValue("");
					    R29cell4.setCellStyle(textStyle);
					}


					// Row 30
					row = sheet.getRow(31);
					Cell R30cell1 = row.createCell(1);
					if (record.getR32_hh_personal_loans_no_of_dep() != null) {
					    R30cell1.setCellValue(record.getR32_hh_personal_loans_no_of_dep().doubleValue());
					    R30cell1.setCellStyle(numberStyle);
					} else {
					    R30cell1.setCellValue("");
					    R30cell1.setCellStyle(textStyle);
					}

					Cell R30cell2 = row.createCell(2);
					if (record.getR32_hh_personal_loans_no_of_dep_ac() != null) {
					    R30cell2.setCellValue(record.getR32_hh_personal_loans_no_of_dep_ac().doubleValue());
					    R30cell2.setCellStyle(numberStyle);
					} else {
					    R30cell2.setCellValue("");
					    R30cell2.setCellStyle(textStyle);
					}

					Cell R30cell3 = row.createCell(3);
					if (record.getR32_hh_personal_loans_no_of_brw() != null) {
					    R30cell3.setCellValue(record.getR32_hh_personal_loans_no_of_brw().doubleValue());
					    R30cell3.setCellStyle(numberStyle);
					} else {
					    R30cell3.setCellValue("");
					    R30cell3.setCellStyle(textStyle);
					}

					Cell R30cell4 = row.createCell(4);
					if (record.getR32_hh_personal_loans_no_loan_ac() != null) {
					    R30cell4.setCellValue(record.getR32_hh_personal_loans_no_loan_ac().doubleValue());
					    R30cell4.setCellStyle(numberStyle);
					} else {
					    R30cell4.setCellValue("");
					    R30cell4.setCellStyle(textStyle);
					}


					// Row 31
					row = sheet.getRow(32);
					Cell R31cell1 = row.createCell(1);
					if (record.getR33_hh_motor_vehicle_no_of_dep() != null) {
					    R31cell1.setCellValue(record.getR33_hh_motor_vehicle_no_of_dep().doubleValue());
					    R31cell1.setCellStyle(numberStyle);
					} else {
					    R31cell1.setCellValue("");
					    R31cell1.setCellStyle(textStyle);
					}

					Cell R31cell2 = row.createCell(2);
					if (record.getR33_hh_motor_vehicle_no_of_dep_ac() != null) {
					    R31cell2.setCellValue(record.getR33_hh_motor_vehicle_no_of_dep_ac().doubleValue());
					    R31cell2.setCellStyle(numberStyle);
					} else {
					    R31cell2.setCellValue("");
					    R31cell2.setCellStyle(textStyle);
					}

					Cell R31cell3 = row.createCell(3);
					if (record.getR33_hh_motor_vehicle_no_of_brw() != null) {
					    R31cell3.setCellValue(record.getR33_hh_motor_vehicle_no_of_brw().doubleValue());
					    R31cell3.setCellStyle(numberStyle);
					} else {
					    R31cell3.setCellValue("");
					    R31cell3.setCellStyle(textStyle);
					}

					Cell R31cell4 = row.createCell(4);
					if (record.getR33_hh_motor_vehicle_no_loan_ac() != null) {
					    R31cell4.setCellValue(record.getR33_hh_motor_vehicle_no_loan_ac().doubleValue());
					    R31cell4.setCellStyle(numberStyle);
					} else {
					    R31cell4.setCellValue("");
					    R31cell4.setCellStyle(textStyle);
					}


					// Row 32
					row = sheet.getRow(33);
					Cell R32cell1 = row.createCell(1);
					if (record.getR34_hh_household_goods_no_of_dep() != null) {
					    R32cell1.setCellValue(record.getR34_hh_household_goods_no_of_dep().doubleValue());
					    R32cell1.setCellStyle(numberStyle);
					} else {
					    R32cell1.setCellValue("");
					    R32cell1.setCellStyle(textStyle);
					}

					Cell R32cell2 = row.createCell(2);
					if (record.getR34_hh_household_goods_no_of_dep_ac() != null) {
					    R32cell2.setCellValue(record.getR34_hh_household_goods_no_of_dep_ac().doubleValue());
					    R32cell2.setCellStyle(numberStyle);
					} else {
					    R32cell2.setCellValue("");
					    R32cell2.setCellStyle(textStyle);
					}

					Cell R32cell3 = row.createCell(3);
					if (record.getR34_hh_household_goods_no_of_brw() != null) {
					    R32cell3.setCellValue(record.getR34_hh_household_goods_no_of_brw().doubleValue());
					    R32cell3.setCellStyle(numberStyle);
					} else {
					    R32cell3.setCellValue("");
					    R32cell3.setCellStyle(textStyle);
					}

					Cell R32cell4 = row.createCell(4);
					if (record.getR34_hh_household_goods_no_loan_ac() != null) {
					    R32cell4.setCellValue(record.getR34_hh_household_goods_no_loan_ac().doubleValue());
					    R32cell4.setCellStyle(numberStyle);
					} else {
					    R32cell4.setCellValue("");
					    R32cell4.setCellStyle(textStyle);
					}


					// Row 33
					row = sheet.getRow(34);
					Cell R33cell1 = row.createCell(1);
					if (record.getR35_hh_credit_card_loans_no_of_dep() != null) {
					    R33cell1.setCellValue(record.getR35_hh_credit_card_loans_no_of_dep().doubleValue());
					    R33cell1.setCellStyle(numberStyle);
					} else {
					    R33cell1.setCellValue("");
					    R33cell1.setCellStyle(textStyle);
					}

					Cell R33cell2 = row.createCell(2);
					if (record.getR35_hh_credit_card_loans_no_of_dep_ac() != null) {
					    R33cell2.setCellValue(record.getR35_hh_credit_card_loans_no_of_dep_ac().doubleValue());
					    R33cell2.setCellStyle(numberStyle);
					} else {
					    R33cell2.setCellValue("");
					    R33cell2.setCellStyle(textStyle);
					}

					Cell R33cell3 = row.createCell(3);
					if (record.getR35_hh_credit_card_loans_no_of_brw() != null) {
					    R33cell3.setCellValue(record.getR35_hh_credit_card_loans_no_of_brw().doubleValue());
					    R33cell3.setCellStyle(numberStyle);
					} else {
					    R33cell3.setCellValue("");
					    R33cell3.setCellStyle(textStyle);
					}

					Cell R33cell4 = row.createCell(4);
					if (record.getR35_hh_credit_card_loans_no_loan_ac() != null) {
					    R33cell4.setCellValue(record.getR35_hh_credit_card_loans_no_loan_ac().doubleValue());
					    R33cell4.setCellStyle(numberStyle);
					} else {
					    R33cell4.setCellValue("");
					    R33cell4.setCellStyle(textStyle);
					}


					// Row 34
					row = sheet.getRow(35);
					Cell R34cell1 = row.createCell(1);
					if (record.getR36_hh_other_no_of_dep() != null) {
					    R34cell1.setCellValue(record.getR36_hh_other_no_of_dep().doubleValue());
					    R34cell1.setCellStyle(numberStyle);
					} else {
					    R34cell1.setCellValue("");
					    R34cell1.setCellStyle(textStyle);
					}

					Cell R34cell2 = row.createCell(2);
					if (record.getR36_hh_other_no_of_dep_ac() != null) {
					    R34cell2.setCellValue(record.getR36_hh_other_no_of_dep_ac().doubleValue());
					    R34cell2.setCellStyle(numberStyle);
					} else {
					    R34cell2.setCellValue("");
					    R34cell2.setCellStyle(textStyle);
					}

					Cell R34cell3 = row.createCell(3);
					if (record.getR36_hh_other_no_of_brw() != null) {
					    R34cell3.setCellValue(record.getR36_hh_other_no_of_brw().doubleValue());
					    R34cell3.setCellStyle(numberStyle);
					} else {
					    R34cell3.setCellValue("");
					    R34cell3.setCellStyle(textStyle);
					}

					Cell R34cell4 = row.createCell(4);
					if (record.getR36_hh_other_no_loan_ac() != null) {
					    R34cell4.setCellValue(record.getR36_hh_other_no_loan_ac().doubleValue());
					    R34cell4.setCellStyle(numberStyle);
					} else {
					    R34cell4.setCellValue("");
					    R34cell4.setCellStyle(textStyle);
					}


					// Row 35
					row = sheet.getRow(36);
					Cell R35cell1 = row.createCell(1);
					if (record.getR37_non_profit_inst_hh_no_of_dep() != null) {
					    R35cell1.setCellValue(record.getR37_non_profit_inst_hh_no_of_dep().doubleValue());
					    R35cell1.setCellStyle(numberStyle);
					} else {
					    R35cell1.setCellValue("");
					    R35cell1.setCellStyle(textStyle);
					}

					Cell R35cell2 = row.createCell(2);
					if (record.getR37_non_profit_inst_hh_no_of_dep_ac() != null) {
					    R35cell2.setCellValue(record.getR37_non_profit_inst_hh_no_of_dep_ac().doubleValue());
					    R35cell2.setCellStyle(numberStyle);
					} else {
					    R35cell2.setCellValue("");
					    R35cell2.setCellStyle(textStyle);
					}

					Cell R35cell3 = row.createCell(3);
					if (record.getR37_non_profit_inst_hh_no_of_brw() != null) {
					    R35cell3.setCellValue(record.getR37_non_profit_inst_hh_no_of_brw().doubleValue());
					    R35cell3.setCellStyle(numberStyle);
					} else {
					    R35cell3.setCellValue("");
					    R35cell3.setCellStyle(textStyle);
					}

					Cell R35cell4 = row.createCell(4);
					if (record.getR37_non_profit_inst_hh_no_loan_ac() != null) {
					    R35cell4.setCellValue(record.getR37_non_profit_inst_hh_no_loan_ac().doubleValue());
					    R35cell4.setCellStyle(numberStyle);
					} else {
					    R35cell4.setCellValue("");
					    R35cell4.setCellStyle(textStyle);
					}


					// Row 36
					row = sheet.getRow(38);
					Cell R36cell1 = row.createCell(1);
					if (record.getR39_non_res_corp_no_of_dep() != null) {
					    R36cell1.setCellValue(record.getR39_non_res_corp_no_of_dep().doubleValue());
					    R36cell1.setCellStyle(numberStyle);
					} else {
					    R36cell1.setCellValue("");
					    R36cell1.setCellStyle(textStyle);
					}

					Cell R36cell2 = row.createCell(2);
					if (record.getR39_non_res_corp_no_of_dep_ac() != null) {
					    R36cell2.setCellValue(record.getR39_non_res_corp_no_of_dep_ac().doubleValue());
					    R36cell2.setCellStyle(numberStyle);
					} else {
					    R36cell2.setCellValue("");
					    R36cell2.setCellStyle(textStyle);
					}

					Cell R36cell3 = row.createCell(3);
					if (record.getR39_non_res_corp_no_of_brw() != null) {
					    R36cell3.setCellValue(record.getR39_non_res_corp_no_of_brw().doubleValue());
					    R36cell3.setCellStyle(numberStyle);
					} else {
					    R36cell3.setCellValue("");
					    R36cell3.setCellStyle(textStyle);
					}

					Cell R36cell4 = row.createCell(4);
					if (record.getR39_non_res_corp_no_loan_ac() != null) {
					    R36cell4.setCellValue(record.getR39_non_res_corp_no_loan_ac().doubleValue());
					    R36cell4.setCellStyle(numberStyle);
					} else {
					    R36cell4.setCellValue("");
					    R36cell4.setCellStyle(textStyle);
					}


					// Row 37
					row = sheet.getRow(39);
					Cell R37cell1 = row.createCell(1);
					if (record.getR40_non_res_hh_no_of_dep() != null) {
					    R37cell1.setCellValue(record.getR40_non_res_hh_no_of_dep().doubleValue());
					    R37cell1.setCellStyle(numberStyle);
					} else {
					    R37cell1.setCellValue("");
					    R37cell1.setCellStyle(textStyle);
					}

					Cell R37cell2 = row.createCell(2);
					if (record.getR40_non_res_hh_no_of_dep_ac() != null) {
					    R37cell2.setCellValue(record.getR40_non_res_hh_no_of_dep_ac().doubleValue());
					    R37cell2.setCellStyle(numberStyle);
					} else {
					    R37cell2.setCellValue("");
					    R37cell2.setCellStyle(textStyle);
					}

					Cell R37cell3 = row.createCell(3);
					if (record.getR40_non_res_hh_no_of_brw() != null) {
					    R37cell3.setCellValue(record.getR40_non_res_hh_no_of_brw().doubleValue());
					    R37cell3.setCellStyle(numberStyle);
					} else {
					    R37cell3.setCellValue("");
					    R37cell3.setCellStyle(textStyle);
					}

					Cell R37cell4 = row.createCell(4);
					if (record.getR40_non_res_hh_no_loan_ac() != null) {
					    R37cell4.setCellValue(record.getR40_non_res_hh_no_loan_ac().doubleValue());
					    R37cell4.setCellStyle(numberStyle);
					} else {
					    R37cell4.setCellValue("");
					    R37cell4.setCellStyle(textStyle);
					}


					// Row 38
					row = sheet.getRow(41);
					Cell R38cell1 = row.createCell(1);
					if (record.getR42_central_bank_no_of_dep() != null) {
					    R38cell1.setCellValue(record.getR42_central_bank_no_of_dep().doubleValue());
					    R38cell1.setCellStyle(numberStyle);
					} else {
					    R38cell1.setCellValue("");
					    R38cell1.setCellStyle(textStyle);
					}

					Cell R38cell2 = row.createCell(2);
					if (record.getR42_central_bank_no_of_dep_ac() != null) {
					    R38cell2.setCellValue(record.getR42_central_bank_no_of_dep_ac().doubleValue());
					    R38cell2.setCellStyle(numberStyle);
					} else {
					    R38cell2.setCellValue("");
					    R38cell2.setCellStyle(textStyle);
					}

					Cell R38cell3 = row.createCell(3);
					if (record.getR42_central_bank_no_of_brw() != null) {
					    R38cell3.setCellValue(record.getR42_central_bank_no_of_brw().doubleValue());
					    R38cell3.setCellStyle(numberStyle);
					} else {
					    R38cell3.setCellValue("");
					    R38cell3.setCellStyle(textStyle);
					}

					Cell R38cell4 = row.createCell(4);
					if (record.getR42_central_bank_no_loan_ac() != null) {
					    R38cell4.setCellValue(record.getR42_central_bank_no_loan_ac().doubleValue());
					    R38cell4.setCellStyle(numberStyle);
					} else {
					    R38cell4.setCellValue("");
					    R38cell4.setCellStyle(textStyle);
					}


					// Row 39
					row = sheet.getRow(42);
					Cell R39cell1 = row.createCell(1);
					if (record.getR43_comm_banks_no_of_dep() != null) {
					    R39cell1.setCellValue(record.getR43_comm_banks_no_of_dep().doubleValue());
					    R39cell1.setCellStyle(numberStyle);
					} else {
					    R39cell1.setCellValue("");
					    R39cell1.setCellStyle(textStyle);
					}

					Cell R39cell2 = row.createCell(2);
					if (record.getR43_comm_banks_no_of_dep_ac() != null) {
					    R39cell2.setCellValue(record.getR43_comm_banks_no_of_dep_ac().doubleValue());
					    R39cell2.setCellStyle(numberStyle);
					} else {
					    R39cell2.setCellValue("");
					    R39cell2.setCellStyle(textStyle);
					}

					Cell R39cell3 = row.createCell(3);
					if (record.getR43_comm_banks_no_of_brw() != null) {
					    R39cell3.setCellValue(record.getR43_comm_banks_no_of_brw().doubleValue());
					    R39cell3.setCellStyle(numberStyle);
					} else {
					    R39cell3.setCellValue("");
					    R39cell3.setCellStyle(textStyle);
					}

					Cell R39cell4 = row.createCell(4);
					if (record.getR43_comm_banks_no_loan_ac() != null) {
					    R39cell4.setCellValue(record.getR43_comm_banks_no_loan_ac().doubleValue());
					    R39cell4.setCellStyle(numberStyle);
					} else {
					    R39cell4.setCellValue("");
					    R39cell4.setCellStyle(textStyle);
					}


					// Row 40
					row = sheet.getRow(44);
					Cell R40cell1 = row.createCell(1);
					if (record.getR45_bsb_no_of_dep() != null) {
					    R40cell1.setCellValue(record.getR45_bsb_no_of_dep().doubleValue());
					    R40cell1.setCellStyle(numberStyle);
					} else {
					    R40cell1.setCellValue("");
					    R40cell1.setCellStyle(textStyle);
					}

					Cell R40cell2 = row.createCell(2);
					if (record.getR45_bsb_no_of_dep_ac() != null) {
					    R40cell2.setCellValue(record.getR45_bsb_no_of_dep_ac().doubleValue());
					    R40cell2.setCellStyle(numberStyle);
					} else {
					    R40cell2.setCellValue("");
					    R40cell2.setCellStyle(textStyle);
					}

					Cell R40cell3 = row.createCell(3);
					if (record.getR45_bsb_no_of_brw() != null) {
					    R40cell3.setCellValue(record.getR45_bsb_no_of_brw().doubleValue());
					    R40cell3.setCellStyle(numberStyle);
					} else {
					    R40cell3.setCellValue("");
					    R40cell3.setCellStyle(textStyle);
					}

					Cell R40cell4 = row.createCell(4);
					if (record.getR45_bsb_no_loan_ac() != null) {
					    R40cell4.setCellValue(record.getR45_bsb_no_loan_ac().doubleValue());
					    R40cell4.setCellStyle(numberStyle);
					} else {
					    R40cell4.setCellValue("");
					    R40cell4.setCellStyle(textStyle);
					}


					// Row 41
					row = sheet.getRow(45);
					Cell R41cell1 = row.createCell(1);
					if (record.getR46_bbs_no_of_dep() != null) {
					    R41cell1.setCellValue(record.getR46_bbs_no_of_dep().doubleValue());
					    R41cell1.setCellStyle(numberStyle);
					} else {
					    R41cell1.setCellValue("");
					    R41cell1.setCellStyle(textStyle);
					}

					Cell R41cell2 = row.createCell(2);
					if (record.getR46_bbs_no_of_dep_ac() != null) {
					    R41cell2.setCellValue(record.getR46_bbs_no_of_dep_ac().doubleValue());
					    R41cell2.setCellStyle(numberStyle);
					} else {
					    R41cell2.setCellValue("");
					    R41cell2.setCellStyle(textStyle);
					}

					Cell R41cell3 = row.createCell(3);
					if (record.getR46_bbs_no_of_brw() != null) {
					    R41cell3.setCellValue(record.getR46_bbs_no_of_brw().doubleValue());
					    R41cell3.setCellStyle(numberStyle);
					} else {
					    R41cell3.setCellValue("");
					    R41cell3.setCellStyle(textStyle);
					}

					Cell R41cell4 = row.createCell(4);
					if (record.getR46_bbs_no_loan_ac() != null) {
					    R41cell4.setCellValue(record.getR46_bbs_no_loan_ac().doubleValue());
					    R41cell4.setCellStyle(numberStyle);
					} else {
					    R41cell4.setCellValue("");
					    R41cell4.setCellStyle(textStyle);
					}


					// Row 42
					row = sheet.getRow(46);
					Cell R42cell1 = row.createCell(1);
					if (record.getR47_money_mkt_unittrust_no_of_dep() != null) {
					    R42cell1.setCellValue(record.getR47_money_mkt_unittrust_no_of_dep().doubleValue());
					    R42cell1.setCellStyle(numberStyle);
					} else {
					    R42cell1.setCellValue("");
					    R42cell1.setCellStyle(textStyle);
					}

					Cell R42cell2 = row.createCell(2);
					if (record.getR47_money_mkt_unittrust_no_of_dep_ac() != null) {
					    R42cell2.setCellValue(record.getR47_money_mkt_unittrust_no_of_dep_ac().doubleValue());
					    R42cell2.setCellStyle(numberStyle);
					} else {
					    R42cell2.setCellValue("");
					    R42cell2.setCellStyle(textStyle);
					}

					Cell R42cell3 = row.createCell(3);
					if (record.getR47_money_mkt_unittrust_no_of_brw() != null) {
					    R42cell3.setCellValue(record.getR47_money_mkt_unittrust_no_of_brw().doubleValue());
					    R42cell3.setCellStyle(numberStyle);
					} else {
					    R42cell3.setCellValue("");
					    R42cell3.setCellStyle(textStyle);
					}

					Cell R42cell4 = row.createCell(4);
					if (record.getR47_money_mkt_unittrust_no_loan_ac() != null) {
					    R42cell4.setCellValue(record.getR47_money_mkt_unittrust_no_loan_ac().doubleValue());
					    R42cell4.setCellStyle(numberStyle);
					} else {
					    R42cell4.setCellValue("");
					    R42cell4.setCellStyle(textStyle);
					}


					// Row 43
					row = sheet.getRow(47);
					Cell R43cell1 = row.createCell(1);
					if (record.getR48_other_dep_corp_specify_no_of_dep() != null) {
					    R43cell1.setCellValue(record.getR48_other_dep_corp_specify_no_of_dep().doubleValue());
					    R43cell1.setCellStyle(numberStyle);
					} else {
					    R43cell1.setCellValue("");
					    R43cell1.setCellStyle(textStyle);
					}

					Cell R43cell2 = row.createCell(2);
					if (record.getR48_other_dep_corp_specify_no_of_dep_ac() != null) {
					    R43cell2.setCellValue(record.getR48_other_dep_corp_specify_no_of_dep_ac().doubleValue());
					    R43cell2.setCellStyle(numberStyle);
					} else {
					    R43cell2.setCellValue("");
					    R43cell2.setCellStyle(textStyle);
					}

					Cell R43cell3 = row.createCell(3);
					if (record.getR48_other_dep_corp_specify_no_of_brw() != null) {
					    R43cell3.setCellValue(record.getR48_other_dep_corp_specify_no_of_brw().doubleValue());
					    R43cell3.setCellStyle(numberStyle);
					} else {
					    R43cell3.setCellValue("");
					    R43cell3.setCellStyle(textStyle);
					}

					Cell R43cell4 = row.createCell(4);
					if (record.getR48_other_dep_corp_specify_no_loan_ac() != null) {
					    R43cell4.setCellValue(record.getR48_other_dep_corp_specify_no_loan_ac().doubleValue());
					    R43cell4.setCellStyle(numberStyle);
					} else {
					    R43cell4.setCellValue("");
					    R43cell4.setCellStyle(textStyle);
					}


					// Row 44
					row = sheet.getRow(49);
					Cell R44cell1 = row.createCell(1);
					if (record.getR50_insurance_co_no_of_dep() != null) {
					    R44cell1.setCellValue(record.getR50_insurance_co_no_of_dep().doubleValue());
					    R44cell1.setCellStyle(numberStyle);
					} else {
					    R44cell1.setCellValue("");
					    R44cell1.setCellStyle(textStyle);
					}

					Cell R44cell2 = row.createCell(2);
					if (record.getR50_insurance_co_no_of_dep_ac() != null) {
					    R44cell2.setCellValue(record.getR50_insurance_co_no_of_dep_ac().doubleValue());
					    R44cell2.setCellStyle(numberStyle);
					} else {
					    R44cell2.setCellValue("");
					    R44cell2.setCellStyle(textStyle);
					}

					Cell R44cell3 = row.createCell(3);
					if (record.getR50_insurance_co_no_of_brw() != null) {
					    R44cell3.setCellValue(record.getR50_insurance_co_no_of_brw().doubleValue());
					    R44cell3.setCellStyle(numberStyle);
					} else {
					    R44cell3.setCellValue("");
					    R44cell3.setCellStyle(textStyle);
					}

					Cell R44cell4 = row.createCell(4);
					if (record.getR50_insurance_co_no_loan_ac() != null) {
					    R44cell4.setCellValue(record.getR50_insurance_co_no_loan_ac().doubleValue());
					    R44cell4.setCellStyle(numberStyle);
					} else {
					    R44cell4.setCellValue("");
					    R44cell4.setCellStyle(textStyle);
					}


					// Row 45
					row = sheet.getRow(50);
					Cell R45cell1 = row.createCell(1);
					if (record.getR51_pension_funds_no_of_dep() != null) {
					    R45cell1.setCellValue(record.getR51_pension_funds_no_of_dep().doubleValue());
					    R45cell1.setCellStyle(numberStyle);
					} else {
					    R45cell1.setCellValue("");
					    R45cell1.setCellStyle(textStyle);
					}

					Cell R45cell2 = row.createCell(2);
					if (record.getR51_pension_funds_no_of_dep_ac() != null) {
					    R45cell2.setCellValue(record.getR51_pension_funds_no_of_dep_ac().doubleValue());
					    R45cell2.setCellStyle(numberStyle);
					} else {
					    R45cell2.setCellValue("");
					    R45cell2.setCellStyle(textStyle);
					}

					Cell R45cell3 = row.createCell(3);
					if (record.getR51_pension_funds_no_of_brw() != null) {
					    R45cell3.setCellValue(record.getR51_pension_funds_no_of_brw().doubleValue());
					    R45cell3.setCellStyle(numberStyle);
					} else {
					    R45cell3.setCellValue("");
					    R45cell3.setCellStyle(textStyle);
					}

					Cell R45cell4 = row.createCell(4);
					if (record.getR51_pension_funds_no_loan_ac() != null) {
					    R45cell4.setCellValue(record.getR51_pension_funds_no_loan_ac().doubleValue());
					    R45cell4.setCellStyle(numberStyle);
					} else {
					    R45cell4.setCellValue("");
					    R45cell4.setCellStyle(textStyle);
					}


					// Row 46
					row = sheet.getRow(51);
					Cell R46cell1 = row.createCell(1);
					if (record.getR52_saccos_no_of_dep() != null) {
					    R46cell1.setCellValue(record.getR52_saccos_no_of_dep().doubleValue());
					    R46cell1.setCellStyle(numberStyle);
					} else {
					    R46cell1.setCellValue("");
					    R46cell1.setCellStyle(textStyle);
					}

					Cell R46cell2 = row.createCell(2);
					if (record.getR52_saccos_no_of_dep_ac() != null) {
					    R46cell2.setCellValue(record.getR52_saccos_no_of_dep_ac().doubleValue());
					    R46cell2.setCellStyle(numberStyle);
					} else {
					    R46cell2.setCellValue("");
					    R46cell2.setCellStyle(textStyle);
					}

					Cell R46cell3 = row.createCell(3);
					if (record.getR52_saccos_no_of_brw() != null) {
					    R46cell3.setCellValue(record.getR52_saccos_no_of_brw().doubleValue());
					    R46cell3.setCellStyle(numberStyle);
					} else {
					    R46cell3.setCellValue("");
					    R46cell3.setCellStyle(textStyle);
					}

					Cell R46cell4 = row.createCell(4);
					if (record.getR52_saccos_no_loan_ac() != null) {
					    R46cell4.setCellValue(record.getR52_saccos_no_loan_ac().doubleValue());
					    R46cell4.setCellStyle(numberStyle);
					} else {
					    R46cell4.setCellValue("");
					    R46cell4.setCellStyle(textStyle);
					}


					// Row 47
					row = sheet.getRow(53);
					Cell R47cell1 = row.createCell(1);
					if (record.getR54_fin_co_no_of_dep() != null) {
					    R47cell1.setCellValue(record.getR54_fin_co_no_of_dep().doubleValue());
					    R47cell1.setCellStyle(numberStyle);
					} else {
					    R47cell1.setCellValue("");
					    R47cell1.setCellStyle(textStyle);
					}

					Cell R47cell2 = row.createCell(2);
					if (record.getR54_fin_co_no_of_dep_ac() != null) {
					    R47cell2.setCellValue(record.getR54_fin_co_no_of_dep_ac().doubleValue());
					    R47cell2.setCellStyle(numberStyle);
					} else {
					    R47cell2.setCellValue("");
					    R47cell2.setCellStyle(textStyle);
					}

					Cell R47cell3 = row.createCell(3);
					if (record.getR54_fin_co_no_of_brw() != null) {
					    R47cell3.setCellValue(record.getR54_fin_co_no_of_brw().doubleValue());
					    R47cell3.setCellStyle(numberStyle);
					} else {
					    R47cell3.setCellValue("");
					    R47cell3.setCellStyle(textStyle);
					}

					Cell R47cell4 = row.createCell(4);
					if (record.getR54_fin_co_no_loan_ac() != null) {
					    R47cell4.setCellValue(record.getR54_fin_co_no_loan_ac().doubleValue());
					    R47cell4.setCellStyle(numberStyle);
					} else {
					    R47cell4.setCellValue("");
					    R47cell4.setCellStyle(textStyle);
					}


					// Row 48
					row = sheet.getRow(54);
					Cell R48cell1 = row.createCell(1);
					if (record.getR55_med_aid_schemes_no_of_dep() != null) {
					    R48cell1.setCellValue(record.getR55_med_aid_schemes_no_of_dep().doubleValue());
					    R48cell1.setCellStyle(numberStyle);
					} else {
					    R48cell1.setCellValue("");
					    R48cell1.setCellStyle(textStyle);
					}

					Cell R48cell2 = row.createCell(2);
					if (record.getR55_med_aid_schemes_no_of_dep_ac() != null) {
					    R48cell2.setCellValue(record.getR55_med_aid_schemes_no_of_dep_ac().doubleValue());
					    R48cell2.setCellStyle(numberStyle);
					} else {
					    R48cell2.setCellValue("");
					    R48cell2.setCellStyle(textStyle);
					}

					Cell R48cell3 = row.createCell(3);
					if (record.getR55_med_aid_schemes_no_of_brw() != null) {
					    R48cell3.setCellValue(record.getR55_med_aid_schemes_no_of_brw().doubleValue());
					    R48cell3.setCellStyle(numberStyle);
					} else {
					    R48cell3.setCellValue("");
					    R48cell3.setCellStyle(textStyle);
					}

					Cell R48cell4 = row.createCell(4);
					if (record.getR55_med_aid_schemes_no_loan_ac() != null) {
					    R48cell4.setCellValue(record.getR55_med_aid_schemes_no_loan_ac().doubleValue());
					    R48cell4.setCellStyle(numberStyle);
					} else {
					    R48cell4.setCellValue("");
					    R48cell4.setCellStyle(textStyle);
					}


					// Row 49
					row = sheet.getRow(55);
					Cell R49cell1 = row.createCell(1);
					if (record.getR56_pub_sec_fin_int_no_of_dep() != null) {
					    R49cell1.setCellValue(record.getR56_pub_sec_fin_int_no_of_dep().doubleValue());
					    R49cell1.setCellStyle(numberStyle);
					} else {
					    R49cell1.setCellValue("");
					    R49cell1.setCellStyle(textStyle);
					}

					Cell R49cell2 = row.createCell(2);
					if (record.getR56_pub_sec_fin_int_no_of_dep_ac() != null) {
					    R49cell2.setCellValue(record.getR56_pub_sec_fin_int_no_of_dep_ac().doubleValue());
					    R49cell2.setCellStyle(numberStyle);
					} else {
					    R49cell2.setCellValue("");
					    R49cell2.setCellStyle(textStyle);
					}

					Cell R49cell3 = row.createCell(3);
					if (record.getR56_pub_sec_fin_int_no_of_brw() != null) {
					    R49cell3.setCellValue(record.getR56_pub_sec_fin_int_no_of_brw().doubleValue());
					    R49cell3.setCellStyle(numberStyle);
					} else {
					    R49cell3.setCellValue("");
					    R49cell3.setCellStyle(textStyle);
					}

					Cell R49cell4 = row.createCell(4);
					if (record.getR56_pub_sec_fin_int_no_loan_ac() != null) {
					    R49cell4.setCellValue(record.getR56_pub_sec_fin_int_no_loan_ac().doubleValue());
					    R49cell4.setCellStyle(numberStyle);
					} else {
					    R49cell4.setCellValue("");
					    R49cell4.setCellStyle(textStyle);
					}


					// Row 50
					row = sheet.getRow(57);
					Cell R50cell1 = row.createCell(1);
					if (record.getR58_asset_managers_no_of_dep() != null) {
					    R50cell1.setCellValue(record.getR58_asset_managers_no_of_dep().doubleValue());
					    R50cell1.setCellStyle(numberStyle);
					} else {
					    R50cell1.setCellValue("");
					    R50cell1.setCellStyle(textStyle);
					}

					Cell R50cell2 = row.createCell(2);
					if (record.getR58_asset_managers_no_of_dep_ac() != null) {
					    R50cell2.setCellValue(record.getR58_asset_managers_no_of_dep_ac().doubleValue());
					    R50cell2.setCellStyle(numberStyle);
					} else {
					    R50cell2.setCellValue("");
					    R50cell2.setCellStyle(textStyle);
					}

					Cell R50cell3 = row.createCell(3);
					if (record.getR58_asset_managers_no_of_brw() != null) {
					    R50cell3.setCellValue(record.getR58_asset_managers_no_of_brw().doubleValue());
					    R50cell3.setCellStyle(numberStyle);
					} else {
					    R50cell3.setCellValue("");
					    R50cell3.setCellStyle(textStyle);
					}

					Cell R50cell4 = row.createCell(4);
					if (record.getR58_asset_managers_no_loan_ac() != null) {
					    R50cell4.setCellValue(record.getR58_asset_managers_no_loan_ac().doubleValue());
					    R50cell4.setCellStyle(numberStyle);
					} else {
					    R50cell4.setCellValue("");
					    R50cell4.setCellStyle(textStyle);
					}


					// Row 51
					row = sheet.getRow(58);
					Cell R51cell1 = row.createCell(1);
					if (record.getR59_insurance_brokers_no_of_dep() != null) {
					    R51cell1.setCellValue(record.getR59_insurance_brokers_no_of_dep().doubleValue());
					    R51cell1.setCellStyle(numberStyle);
					} else {
					    R51cell1.setCellValue("");
					    R51cell1.setCellStyle(textStyle);
					}

					Cell R51cell2 = row.createCell(2);
					if (record.getR59_insurance_brokers_no_of_dep_ac() != null) {
					    R51cell2.setCellValue(record.getR59_insurance_brokers_no_of_dep_ac().doubleValue());
					    R51cell2.setCellStyle(numberStyle);
					} else {
					    R51cell2.setCellValue("");
					    R51cell2.setCellStyle(textStyle);
					}

					Cell R51cell3 = row.createCell(3);
					if (record.getR59_insurance_brokers_no_of_brw() != null) {
					    R51cell3.setCellValue(record.getR59_insurance_brokers_no_of_brw().doubleValue());
					    R51cell3.setCellStyle(numberStyle);
					} else {
					    R51cell3.setCellValue("");
					    R51cell3.setCellStyle(textStyle);
					}

					Cell R51cell4 = row.createCell(4);
					if (record.getR59_insurance_brokers_no_loan_ac() != null) {
					    R51cell4.setCellValue(record.getR59_insurance_brokers_no_loan_ac().doubleValue());
					    R51cell4.setCellStyle(numberStyle);
					} else {
					    R51cell4.setCellValue("");
					    R51cell4.setCellStyle(textStyle);
					}


					// Row 52
					row = sheet.getRow(59);
					Cell R52cell1 = row.createCell(1);
					if (record.getR60_fund_admin_no_of_dep() != null) {
					    R52cell1.setCellValue(record.getR60_fund_admin_no_of_dep().doubleValue());
					    R52cell1.setCellStyle(numberStyle);
					} else {
					    R52cell1.setCellValue("");
					    R52cell1.setCellStyle(textStyle);
					}

					Cell R52cell2 = row.createCell(2);
					if (record.getR60_fund_admin_no_of_dep_ac() != null) {
					    R52cell2.setCellValue(record.getR60_fund_admin_no_of_dep_ac().doubleValue());
					    R52cell2.setCellStyle(numberStyle);
					} else {
					    R52cell2.setCellValue("");
					    R52cell2.setCellStyle(textStyle);
					}

					Cell R52cell3 = row.createCell(3);
					if (record.getR60_fund_admin_no_of_brw() != null) {
					    R52cell3.setCellValue(record.getR60_fund_admin_no_of_brw().doubleValue());
					    R52cell3.setCellStyle(numberStyle);
					} else {
					    R52cell3.setCellValue("");
					    R52cell3.setCellStyle(textStyle);
					}

					Cell R52cell4 = row.createCell(4);
					if (record.getR60_fund_admin_no_loan_ac() != null) {
					    R52cell4.setCellValue(record.getR60_fund_admin_no_loan_ac().doubleValue());
					    R52cell4.setCellStyle(numberStyle);
					} else {
					    R52cell4.setCellValue("");
					    R52cell4.setCellStyle(textStyle);
					}


					// Row 53
					row = sheet.getRow(60);
					Cell R53cell1 = row.createCell(1);
					if (record.getR61_bureau_change_no_of_dep() != null) {
					    R53cell1.setCellValue(record.getR61_bureau_change_no_of_dep().doubleValue());
					    R53cell1.setCellStyle(numberStyle);
					} else {
					    R53cell1.setCellValue("");
					    R53cell1.setCellStyle(textStyle);
					}

					Cell R53cell2 = row.createCell(2);
					if (record.getR61_bureau_change_no_of_dep_ac() != null) {
					    R53cell2.setCellValue(record.getR61_bureau_change_no_of_dep_ac().doubleValue());
					    R53cell2.setCellStyle(numberStyle);
					} else {
					    R53cell2.setCellValue("");
					    R53cell2.setCellStyle(textStyle);
					}

					Cell R53cell3 = row.createCell(3);
					if (record.getR61_bureau_change_no_of_brw() != null) {
					    R53cell3.setCellValue(record.getR61_bureau_change_no_of_brw().doubleValue());
					    R53cell3.setCellStyle(numberStyle);
					} else {
					    R53cell3.setCellValue("");
					    R53cell3.setCellStyle(textStyle);
					}

					Cell R53cell4 = row.createCell(4);
					if (record.getR61_bureau_change_no_loan_ac() != null) {
					    R53cell4.setCellValue(record.getR61_bureau_change_no_loan_ac().doubleValue());
					    R53cell4.setCellStyle(numberStyle);
					} else {
					    R53cell4.setCellValue("");
					    R53cell4.setCellStyle(textStyle);
					}


					// Row 54
					row = sheet.getRow(61);
					Cell R54cell1 = row.createCell(1);
					if (record.getR62_fin_aux_other_no_of_dep() != null) {
					    R54cell1.setCellValue(record.getR62_fin_aux_other_no_of_dep().doubleValue());
					    R54cell1.setCellStyle(numberStyle);
					} else {
					    R54cell1.setCellValue("");
					    R54cell1.setCellStyle(textStyle);
					}

					Cell R54cell2 = row.createCell(2);
					if (record.getR62_fin_aux_other_no_of_dep_ac() != null) {
					    R54cell2.setCellValue(record.getR62_fin_aux_other_no_of_dep_ac().doubleValue());
					    R54cell2.setCellStyle(numberStyle);
					} else {
					    R54cell2.setCellValue("");
					    R54cell2.setCellStyle(textStyle);
					}

					Cell R54cell3 = row.createCell(3);
					if (record.getR62_fin_aux_other_no_of_brw() != null) {
					    R54cell3.setCellValue(record.getR62_fin_aux_other_no_of_brw().doubleValue());
					    R54cell3.setCellStyle(numberStyle);
					} else {
					    R54cell3.setCellValue("");
					    R54cell3.setCellStyle(textStyle);
					}

					Cell R54cell4 = row.createCell(4);
					if (record.getR62_fin_aux_other_no_loan_ac() != null) {
					    R54cell4.setCellValue(record.getR62_fin_aux_other_no_loan_ac().doubleValue());
					    R54cell4.setCellStyle(numberStyle);
					} else {
					    R54cell4.setCellValue("");
					    R54cell4.setCellStyle(textStyle);
					}


					// Row 55
					row = sheet.getRow(62);
					Cell R55cell1 = row.createCell(1);
					if (record.getR63_non_residents_fin_no_of_dep() != null) {
					    R55cell1.setCellValue(record.getR63_non_residents_fin_no_of_dep().doubleValue());
					    R55cell1.setCellStyle(numberStyle);
					} else {
					    R55cell1.setCellValue("");
					    R55cell1.setCellStyle(textStyle);
					}

					Cell R55cell2 = row.createCell(2);
					if (record.getR63_non_residents_fin_no_of_dep_ac() != null) {
					    R55cell2.setCellValue(record.getR63_non_residents_fin_no_of_dep_ac().doubleValue());
					    R55cell2.setCellStyle(numberStyle);
					} else {
					    R55cell2.setCellValue("");
					    R55cell2.setCellStyle(textStyle);
					}

					Cell R55cell3 = row.createCell(3);
					if (record.getR63_non_residents_fin_no_of_brw() != null) {
					    R55cell3.setCellValue(record.getR63_non_residents_fin_no_of_brw().doubleValue());
					    R55cell3.setCellStyle(numberStyle);
					} else {
					    R55cell3.setCellValue("");
					    R55cell3.setCellStyle(textStyle);
					}

					Cell R55cell4 = row.createCell(4);
					if (record.getR63_non_residents_fin_no_loan_ac() != null) {
					    R55cell4.setCellValue(record.getR63_non_residents_fin_no_loan_ac().doubleValue());
					    R55cell4.setCellStyle(numberStyle);
					} else {
					    R55cell4.setCellValue("");
					    R55cell4.setCellStyle(textStyle);
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

	public byte[] BRRS_Q_ATS_DetailExcel(String filename, String fromdate, String todate,String currency,String dtltype,String type, String version) {
        try {
            logger.info("Generating Excel for Q_ATS Details...");
            System.out.println("came to Detail download service");

            if (type.equals("ARCHIVAL") & version != null) {
				byte[] ARCHIVALreport = getDetailExcelARCHIVAL(filename, fromdate, todate, currency, dtltype, type,
						version);
				return ARCHIVALreport;
			}
            
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Q_ATS Details");

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
            DateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date parsedToDate = df.parse(todate);  
            List<Q_ATF_DETAILS_ENTITY> reportData = q_atf_details_repo.getdatabydateList(parsedToDate);
//            List<BRRS_Q_SMME_DETAIL_Entity_1> reportData = new ArrayList<>();

            if (reportData != null && !reportData.isEmpty()) {
                int rowIndex = 1;
                for (Q_ATF_DETAILS_ENTITY item : reportData) {
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
                    row.createCell(6).setCellValue(
                            item.getReport_date() != null
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
                logger.info("No data found for BRRS_Q_SMME — only header will be written.");
            }

            // Write to byte[]
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            workbook.write(bos);
            workbook.close();

            logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
            return bos.toByteArray();

        } catch (Exception e) {
            logger.error("Error generating BRRS_Q_SMME Excel", e);
            return new byte[0];
        }
    }

	private byte[] getDetailExcelARCHIVAL(String filename, String fromdate, String todate, String currency,
			String dtltype, String type, String version) {
		try {
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Q_ATS Details");
	
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
	        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
	        Date parsedToDate = df.parse(todate);  
	        List<Q_ATF_DETAIL_ARCHIVAL_ENTITY> reportData = q_atf_archival_detail_repo.getdatabydateList(parsedToDate,version);
	//        List<BRRS_Q_SMME_DETAIL_Entity_1> reportData = new ArrayList<>();
	        logger.info("Q_ATF Arcival Download Stating.");
	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (Q_ATF_DETAIL_ARCHIVAL_ENTITY item : reportData) {
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
	                row.createCell(6).setCellValue(
	                        item.getReport_date() != null
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
	            logger.info("No data found for Q_ATF — only header will be written.");
	        }
	
	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();
	
	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();
	
    } catch (Exception e) {
        logger.error("Error generating BRRS_Q_SMME Excel", e);
        return new byte[0];
    }
	}

	public List<Object> getQ_ATF_SUMM_Archival() {
		List<Object> Q_MME_LIST = new ArrayList<>();
		try {
			Q_MME_LIST = q_atf_summay_archival_repo.getArchvalList();
		} catch (Exception e) {
			System.err.println("Error fetching Q_SMME Archival data: " + e.getMessage());
			e.printStackTrace();
		}
		return Q_MME_LIST;
	}
    
}