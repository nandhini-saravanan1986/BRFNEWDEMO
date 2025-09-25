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
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.M_LIQ_Detail_Entity;
import com.bornfire.brf.entities.BRRS_M_LIQ_Detail_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_4_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_4_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_7_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_2_DETAILTABLE01_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_2_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF5_2_SUMMARYTABLE01_Repo;
import com.bornfire.brf.entities.CBUAE_BRF5_2_SUMMARYTABLE02_Repo;
import com.bornfire.brf.entities.CBUAE_BRF5_2_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF5_2_SUMMARY_ENTITY02;

import org.springframework.core.env.Environment;

@Component
@Service

public class CBUAE_BRF5_2_ReportService {

	private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF5_2_ReportService.class);

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CBUAE_BRF5_2_DETAIL_Repo BRF5_2_DETAIL_Repo;

	@Autowired 
	CBUAE_BRF5_2_SUMMARYTABLE01_Repo BRF5_2_Summary_Repo;
	
	
	@Autowired
	 CBUAE_BRF5_2_SUMMARYTABLE02_Repo CBUAE_BRF5_2_SUMMARYTABLE02_Repo;
	
	@Autowired
	private Environment env;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getBRF5_2View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		List<CBUAE_BRF5_2_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF5_2_SUMMARY_ENTITY>();
		List<CBUAE_BRF5_2_SUMMARY_ENTITY02> T1Master1 = new ArrayList<CBUAE_BRF5_2_SUMMARY_ENTITY02>();
		 try {
		        Date d1 = dateformat.parse(todate);
		        T1Master = BRF5_2_Summary_Repo.getdatabydateList(dateformat.parse(todate));
		        T1Master1 = CBUAE_BRF5_2_SUMMARYTABLE02_Repo.getdatabydateList(dateformat.parse(todate));
		    }  catch (ParseException e) {
			e.printStackTrace();
		}
		mv.setViewName("BRF/BRF5_2");
		mv.addObject("reportsummary", T1Master);
		mv.addObject("reportsummary1", T1Master1);  
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}

	public ModelAndView getBRF5_2currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		ModelAndView mv = new ModelAndView();
		List<CBUAE_BRF5_2_DETAILTABLE01_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF5_2_DETAILTABLE01_ENTITY>();
		try {
			T1Dt1 = BRF5_2_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT" + T1Dt1.size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		mv.setViewName("BRF/BRF5_2");
		mv.addObject("displaymode", "Details");
		mv.addObject("reportdetails", T1Dt1);
		 
		mv.addObject("reportmaster12", T1Dt1);
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;
	}
	
	public byte[] getBRF5_2Excel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype) throws Exception {
		logger.info("Service: Starting Excel generation process in memory.");

		List<CBUAE_BRF5_2_SUMMARY_ENTITY> dataList =BRF5_2_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

		if (dataList.isEmpty()) {
			logger.warn("Service: No data found forBRF5_2 report. Returning empty result.");
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
					CBUAE_BRF5_2_SUMMARY_ENTITY record = dataList.get(i);
					System.out.println("rownumber="+startRow + i);
					Row row = sheet.getRow(startRow + i);
					if (row == null) {
						row = sheet.createRow(startRow + i);
					}
					
                  //row9
					// Column D 1 - Borrower Name
					Cell cellD = row.createCell(3); // D = index 3
					if (record.getR0020_borrower_name() != null) {
					    cellD.setCellValue(record.getR0020_borrower_name()); // assuming it's String
					    cellD.setCellStyle(textStyle);
					} else {
					    cellD.setCellValue("");
					    cellD.setCellStyle(textStyle);
					}
					
					// Column E 2 - Group Name
					Cell cellE = row.createCell(4); // E = index 4
					if (record.getR0020_group_name() != null) {
					    cellE.setCellValue(record.getR0020_group_name()); // assuming it's String
					    cellE.setCellStyle(textStyle);
					} else {
					    cellE.setCellValue("");
					    cellE.setCellStyle(textStyle);
					}
					
					// Column F 3 - CIN
					Cell cellF = row.createCell(5);
					if (record.getR0020_cin() != null) {
					    cellF.setCellValue(record.getR0020_cin());
					    cellF.setCellStyle(textStyle);
					} else {
					    cellF.setCellValue("");
					    cellF.setCellStyle(textStyle);
					}
					
					// Column G 4 - Country where borrower is domiciled
					Cell cellG = row.createCell(6);
					if (record.getR0020_coun_whe_borr_is_dom() != null) {
					    cellG.setCellValue(record.getR0020_coun_whe_borr_is_dom());
					    cellG.setCellStyle(textStyle);
					} else {
					    cellG.setCellValue("");
					    cellG.setCellStyle(textStyle);
					}
					
					
					// Column H 5 - Total Funded Outstanding Amount
					Cell cellH = row.createCell(7);
					if (record.getR0020_tot_fund_outs_amt() != null) {
					    cellH.setCellValue(record.getR0020_tot_fund_outs_amt().doubleValue());
					    cellH.setCellStyle(numberStyle);
					} else {
					    cellH.setCellValue(0);
					    cellH.setCellStyle(numberStyle);
					}

					// Column I 6 - CCF Total Unfunded Outstanding Amount
					Cell cellI = row.createCell(8);
					if (record.getR0020_ccf_tot_unfund_outs_amt() != null) {
					    cellI.setCellValue(record.getR0020_ccf_tot_unfund_outs_amt().doubleValue());
					    cellI.setCellStyle(numberStyle);
					} else {
					    cellI.setCellValue(0);
					    cellI.setCellStyle(numberStyle);
					}
					
					// Column J 7 - Secured Portion of Total Exposure
					Cell cellJ = row.createCell(9);
					if (record.getR0020_sec_port_of_tot_exp() != null) {
					    cellJ.setCellValue(record.getR0020_sec_port_of_tot_exp().doubleValue());
					    cellJ.setCellStyle(numberStyle);
					} else {
					    cellJ.setCellValue(0);
					    cellJ.setCellStyle(numberStyle);
					}
					
					// Column K 8 - Positive Collateral after Haircut
					Cell cellK = row.createCell(10);
					if (record.getR0020_pos_col_haircut() != null) {
					    cellK.setCellValue(record.getR0020_pos_col_haircut().doubleValue());
					    cellK.setCellStyle(numberStyle);
					} else {
					    cellK.setCellValue(0);
					    cellK.setCellStyle(numberStyle);
					}
					
					  // Column L 9 - Type of Security
					 Cell cellL = row.createCell(11);
				        if (record.getR0020_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0020_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }
				        
				     // Column M 10 - Discounted Collateral Value
				        Cell cellM = row.createCell(12);
				        if (record.getR0020_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0020_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue(0);
				            cellM.setCellStyle(numberStyle);
				        }
				        
				        // Column N 11 - Validated Discounted Cash Flow
				        Cell cellN = row.createCell(13);
				        if (record.getR0020_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0020_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue(0);
				            cellN.setCellStyle(numberStyle);
				        }
				        
				     // Column O  12- PD
				        Cell cellO = row.createCell(14);
				        if (record.getR0020_pd() != null) {
				            cellO.setCellValue(record.getR0020_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue(0);
				            cellO.setCellStyle(numberStyle);
				        }
				        

				        // Column P 13 - LGD
				        Cell cellP = row.createCell(15);
				        if (record.getR0020_lgd() != null) {
				            cellP.setCellValue(record.getR0020_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue(0);
				            cellP.setCellStyle(numberStyle);
				        }
				        
				        // Column Q 14 - Provision Charged to P&L
				        Cell cellQ = row.createCell(16);
				        if (record.getR0020_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0020_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue(0);
				            cellQ.setCellStyle(numberStyle);
				        }
				        
				        // Column R 15 - Legal Interest Suspended & Provision for Fees/Charges
				        Cell cellR = row.createCell(17);
				        if (record.getR0020_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0020_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue(0);
				            cellR.setCellStyle(numberStyle);
				        }
				        
				        // Column S 16 - Legal Case (Y/N)
				        Cell cellS = row.createCell(18);
				        if (record.getR0020_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0020_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T 17 - Remarks
				        Cell cellT = row.createCell(19);
				        if (record.getR0020_remarks() != null) {
				            cellT.setCellValue(record.getR0020_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        
				        // row11
				        row = sheet.getRow(10);
				        
				        
				        // Column D - Borrower Name
				          cellD = row.createCell(3);
				        if (record.getR0030_borrower_name() != null) {
				            cellD.setCellValue(record.getR0030_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }
				        
				        // Column E - Group Name
				         cellE = row.createCell(4);
				        if (record.getR0030_group_name() != null) {
				            cellE.setCellValue(record.getR0030_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }
				        
				        // Column F - CIN
				         cellF = row.createCell(5);
				        if (record.getR0030_cin() != null) {
				            cellF.setCellValue(record.getR0030_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }
				        
				        
				     // Column G - Country
				         cellG = row.createCell(6);
				        if (record.getR0030_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0030_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }
				        
				     // Column H - Total Funded Outstanding Amount
				         cellH = row.createCell(7);
				        if (record.getR0030_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0030_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }
				        
				        
				     // Column I - CCF Total Unfunded
				         cellI = row.createCell(8);
				        if (record.getR0030_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0030_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }
					
				     // Column J - Sec Port of Total Exposure
				         cellJ = row.createCell(9);
				        if (record.getR0030_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0030_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }
				        
				        // Column K - POS Col Haircut
				         cellK = row.createCell(10);
				        if (record.getR0030_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0030_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }
				        
				     // Column L - Type of Security
				         cellL = row.createCell(11);
				        if (record.getR0030_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0030_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				         cellM = row.createCell(12);
				        if (record.getR0030_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0030_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				         cellN = row.createCell(13);
				        if (record.getR0030_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0030_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				         cellO = row.createCell(14);
				        if (record.getR0030_pd() != null) {
				            cellO.setCellValue(record.getR0030_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				         cellP = row.createCell(15);
				        if (record.getR0030_lgd() != null) {
				            cellP.setCellValue(record.getR0030_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				         cellQ = row.createCell(16);
				        if (record.getR0030_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0030_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				         cellR = row.createCell(17);
				        if (record.getR0030_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0030_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				         cellS = row.createCell(18);
				        if (record.getR0030_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0030_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				         cellT = row.createCell(19);
				        if (record.getR0030_remarks() != null) {
				            cellT.setCellValue(record.getR0030_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                    
				     // row12
				        row = sheet.getRow(11);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0040_borrower_name() != null) {
				            cellD.setCellValue(record.getR0040_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }
				        
				     // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0040_group_name() != null) {
				            cellE.setCellValue(record.getR0040_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0040_cin() != null) {
				            cellF.setCellValue(record.getR0040_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0040_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0040_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0040_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0040_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0040_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0040_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0040_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0040_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0040_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0040_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0040_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0040_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0040_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0040_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0040_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0040_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0040_pd() != null) {
				            cellO.setCellValue(record.getR0040_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0040_lgd() != null) {
				            cellP.setCellValue(record.getR0040_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0040_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0040_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0040_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0040_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0040_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0040_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0040_remarks() != null) {
				            cellT.setCellValue(record.getR0040_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        
				        // row13
				        row = sheet.getRow(12);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0050_borrower_name() != null) {
				            cellD.setCellValue(record.getR0050_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0050_group_name() != null) {
				            cellE.setCellValue(record.getR0050_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0050_cin() != null) {
				            cellF.setCellValue(record.getR0050_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0050_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0050_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0050_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0050_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0050_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0050_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				     // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0050_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0050_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0050_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0050_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0050_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0050_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0050_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0050_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0050_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0050_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0050_pd() != null) {
				            cellO.setCellValue(record.getR0050_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0050_lgd() != null) {
				            cellP.setCellValue(record.getR0050_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0050_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0050_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0050_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0050_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0050_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0050_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0050_remarks() != null) {
				            cellT.setCellValue(record.getR0050_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row14
				        row = sheet.getRow(13);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0060_borrower_name() != null) {
				            cellD.setCellValue(record.getR0060_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0060_group_name() != null) {
				            cellE.setCellValue(record.getR0060_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0060_cin() != null) {
				            cellF.setCellValue(record.getR0060_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0060_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0060_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0060_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0060_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0060_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0060_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0060_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0060_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0060_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0060_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0060_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0060_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0060_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0060_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0060_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0060_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0060_pd() != null) {
				            cellO.setCellValue(record.getR0060_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0060_lgd() != null) {
				            cellP.setCellValue(record.getR0060_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0060_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0060_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0060_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0060_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0060_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0060_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0060_remarks() != null) {
				            cellT.setCellValue(record.getR0060_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        
				     // row15
				        row = sheet.getRow(14);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0070_borrower_name() != null) {
				            cellD.setCellValue(record.getR0070_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0070_group_name() != null) {
				            cellE.setCellValue(record.getR0070_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0070_cin() != null) {
				            cellF.setCellValue(record.getR0070_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0070_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0070_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0070_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0070_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0070_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0070_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0070_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0070_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0070_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0070_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0070_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0070_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0070_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0070_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0070_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0070_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0070_pd() != null) {
				            cellO.setCellValue(record.getR0070_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0070_lgd() != null) {
				            cellP.setCellValue(record.getR0070_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0070_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0070_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0070_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0070_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0070_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0070_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0070_remarks() != null) {
				            cellT.setCellValue(record.getR0070_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        // row16
				        row = sheet.getRow(15);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0080_borrower_name() != null) {
				            cellD.setCellValue(record.getR0080_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0080_group_name() != null) {
				            cellE.setCellValue(record.getR0080_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0080_cin() != null) {
				            cellF.setCellValue(record.getR0080_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0080_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0080_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0080_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0080_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0080_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0080_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0080_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0080_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0080_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0080_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0080_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0080_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0080_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0080_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0080_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0080_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0080_pd() != null) {
				            cellO.setCellValue(record.getR0080_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0080_lgd() != null) {
				            cellP.setCellValue(record.getR0080_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0080_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0080_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0080_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0080_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0080_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0080_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0080_remarks() != null) {
				            cellT.setCellValue(record.getR0080_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        // row17
				        row = sheet.getRow(16);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0090_borrower_name() != null) {
				            cellD.setCellValue(record.getR0090_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0090_group_name() != null) {
				            cellE.setCellValue(record.getR0090_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0090_cin() != null) {
				            cellF.setCellValue(record.getR0090_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0090_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0090_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0090_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0090_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0090_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0090_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0090_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0090_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0090_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0090_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0090_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0090_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0090_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0090_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0090_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0090_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0090_pd() != null) {
				            cellO.setCellValue(record.getR0090_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0090_lgd() != null) {
				            cellP.setCellValue(record.getR0090_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0090_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0090_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0090_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0090_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0090_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0090_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0090_remarks() != null) {
				            cellT.setCellValue(record.getR0090_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row18
				        row = sheet.getRow(17);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0100_borrower_name() != null) {
				            cellD.setCellValue(record.getR0100_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0100_group_name() != null) {
				            cellE.setCellValue(record.getR0100_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0100_cin() != null) {
				            cellF.setCellValue(record.getR0100_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0100_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0100_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0100_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0100_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0100_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0100_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0100_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0100_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0100_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0100_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0100_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0100_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0100_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0100_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0100_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0100_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0100_pd() != null) {
				            cellO.setCellValue(record.getR0100_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0100_lgd() != null) {
				            cellP.setCellValue(record.getR0100_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0100_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0100_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0100_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0100_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0100_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0100_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0100_remarks() != null) {
				            cellT.setCellValue(record.getR0100_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                       
				        
				     // row19
				        row = sheet.getRow(18);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0110_borrower_name() != null) {
				            cellD.setCellValue(record.getR0110_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0110_group_name() != null) {
				            cellE.setCellValue(record.getR0110_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0110_cin() != null) {
				            cellF.setCellValue(record.getR0110_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0110_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0110_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0110_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0110_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0110_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0110_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0110_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0110_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0110_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0110_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0110_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0110_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0110_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0110_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0110_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0110_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0110_pd() != null) {
				            cellO.setCellValue(record.getR0110_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0110_lgd() != null) {
				            cellP.setCellValue(record.getR0110_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0110_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0110_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0110_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0110_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0110_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0110_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0110_remarks() != null) {
				            cellT.setCellValue(record.getR0110_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				      
				        // row20
				        row = sheet.getRow(19);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0120_borrower_name() != null) {
				            cellD.setCellValue(record.getR0120_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0120_group_name() != null) {
				            cellE.setCellValue(record.getR0120_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0120_cin() != null) {
				            cellF.setCellValue(record.getR0120_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0120_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0120_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0120_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0120_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0120_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0120_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0120_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0120_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0120_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0120_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0120_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0120_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0120_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0120_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0120_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0120_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0120_pd() != null) {
				            cellO.setCellValue(record.getR0120_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0120_lgd() != null) {
				            cellP.setCellValue(record.getR0120_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0120_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0120_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0120_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0120_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0120_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0120_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0120_remarks() != null) {
				            cellT.setCellValue(record.getR0120_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row21
				        row = sheet.getRow(20);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0130_borrower_name() != null) {
				            cellD.setCellValue(record.getR0130_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0130_group_name() != null) {
				            cellE.setCellValue(record.getR0130_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0130_cin() != null) {
				            cellF.setCellValue(record.getR0130_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0130_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0130_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0130_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0130_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0130_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0130_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0130_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0130_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0130_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0130_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0130_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0130_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0130_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0130_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0130_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0130_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0130_pd() != null) {
				            cellO.setCellValue(record.getR0130_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0130_lgd() != null) {
				            cellP.setCellValue(record.getR0130_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0130_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0130_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0130_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0130_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0130_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0130_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0130_remarks() != null) {
				            cellT.setCellValue(record.getR0130_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row22
				        row = sheet.getRow(21);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0140_borrower_name() != null) {
				            cellD.setCellValue(record.getR0140_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0140_group_name() != null) {
				            cellE.setCellValue(record.getR0140_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0140_cin() != null) {
				            cellF.setCellValue(record.getR0140_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0140_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0140_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0140_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0140_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0140_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0140_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0140_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0140_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0140_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0140_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0140_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0140_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0140_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0140_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0140_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0140_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0140_pd() != null) {
				            cellO.setCellValue(record.getR0140_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0140_lgd() != null) {
				            cellP.setCellValue(record.getR0140_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0140_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0140_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0140_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0140_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0140_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0140_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0140_remarks() != null) {
				            cellT.setCellValue(record.getR0140_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row23
				        row = sheet.getRow(22);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0150_borrower_name() != null) {
				            cellD.setCellValue(record.getR0150_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0150_group_name() != null) {
				            cellE.setCellValue(record.getR0150_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0150_cin() != null) {
				            cellF.setCellValue(record.getR0150_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0150_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0150_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0150_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0150_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0150_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0150_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0150_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0150_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0150_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0150_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0150_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0150_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0150_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0150_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0150_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0150_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0150_pd() != null) {
				            cellO.setCellValue(record.getR0150_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0150_lgd() != null) {
				            cellP.setCellValue(record.getR0150_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0150_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0150_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0150_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0150_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0150_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0150_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0150_remarks() != null) {
				            cellT.setCellValue(record.getR0150_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row24
				        row = sheet.getRow(23);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0160_borrower_name() != null) {
				            cellD.setCellValue(record.getR0160_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0160_group_name() != null) {
				            cellE.setCellValue(record.getR0160_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0160_cin() != null) {
				            cellF.setCellValue(record.getR0160_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0160_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0160_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0160_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0160_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0160_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0160_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0160_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0160_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0160_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0160_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0160_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0160_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0160_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0160_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0160_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0160_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0160_pd() != null) {
				            cellO.setCellValue(record.getR0160_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0160_lgd() != null) {
				            cellP.setCellValue(record.getR0160_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0160_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0160_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0160_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0160_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0160_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0160_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0160_remarks() != null) {
				            cellT.setCellValue(record.getR0160_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row25
				        row = sheet.getRow(24);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0170_borrower_name() != null) {
				            cellD.setCellValue(record.getR0170_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0170_group_name() != null) {
				            cellE.setCellValue(record.getR0170_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0170_cin() != null) {
				            cellF.setCellValue(record.getR0170_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0170_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0170_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0170_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0170_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0170_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0170_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0170_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0170_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0170_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0170_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0170_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0170_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0170_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0170_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0170_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0170_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0170_pd() != null) {
				            cellO.setCellValue(record.getR0170_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0170_lgd() != null) {
				            cellP.setCellValue(record.getR0170_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0170_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0170_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0170_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0170_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0170_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0170_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0170_remarks() != null) {
				            cellT.setCellValue(record.getR0170_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				        
				     // row27
				        row = sheet.getRow(26);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0190_borrower_name() != null) {
				            cellD.setCellValue(record.getR0190_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0190_group_name() != null) {
				            cellE.setCellValue(record.getR0190_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0190_cin() != null) {
				            cellF.setCellValue(record.getR0190_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0190_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0190_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0190_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0190_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0190_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0190_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0190_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0190_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0190_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0190_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0190_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0190_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0190_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0190_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0190_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0190_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0190_pd() != null) {
				            cellO.setCellValue(record.getR0190_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0190_lgd() != null) {
				            cellP.setCellValue(record.getR0190_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0190_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0190_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0190_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0190_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0190_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0190_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0190_remarks() != null) {
				            cellT.setCellValue(record.getR0190_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				     // row28
				        row = sheet.getRow(27);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0200_borrower_name() != null) {
				            cellD.setCellValue(record.getR0200_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0200_group_name() != null) {
				            cellE.setCellValue(record.getR0200_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0200_cin() != null) {
				            cellF.setCellValue(record.getR0200_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0200_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0200_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0200_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0200_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0200_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0200_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0200_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0200_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0200_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0200_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0200_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0200_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0200_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0200_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0200_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0200_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0200_pd() != null) {
				            cellO.setCellValue(record.getR0200_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0200_lgd() != null) {
				            cellP.setCellValue(record.getR0200_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0200_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0200_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0200_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0200_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0200_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0200_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0200_remarks() != null) {
				            cellT.setCellValue(record.getR0200_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                         
				     // row29
				        row = sheet.getRow(28);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0210_borrower_name() != null) {
				            cellD.setCellValue(record.getR0210_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0210_group_name() != null) {
				            cellE.setCellValue(record.getR0210_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0210_cin() != null) {
				            cellF.setCellValue(record.getR0210_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0210_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0210_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0210_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0210_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0210_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0210_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0210_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0210_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0210_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0210_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0210_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0210_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0210_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0210_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0210_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0210_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0210_pd() != null) {
				            cellO.setCellValue(record.getR0210_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0210_lgd() != null) {
				            cellP.setCellValue(record.getR0210_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0210_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0210_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0210_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0210_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0210_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0210_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0210_remarks() != null) {
				            cellT.setCellValue(record.getR0210_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row30
				        row = sheet.getRow(29);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0220_borrower_name() != null) {
				            cellD.setCellValue(record.getR0220_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0220_group_name() != null) {
				            cellE.setCellValue(record.getR0220_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0220_cin() != null) {
				            cellF.setCellValue(record.getR0220_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0220_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0220_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0220_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0220_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0220_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0220_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0220_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0220_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0220_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0220_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0220_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0220_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0220_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0220_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0220_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0220_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0220_pd() != null) {
				            cellO.setCellValue(record.getR0220_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0220_lgd() != null) {
				            cellP.setCellValue(record.getR0220_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0220_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0220_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0220_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0220_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0220_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0220_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0220_remarks() != null) {
				            cellT.setCellValue(record.getR0220_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row31
				        row = sheet.getRow(30);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0230_borrower_name() != null) {
				            cellD.setCellValue(record.getR0230_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0230_group_name() != null) {
				            cellE.setCellValue(record.getR0230_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0230_cin() != null) {
				            cellF.setCellValue(record.getR0230_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0230_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0230_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0230_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0230_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0230_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0230_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0230_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0230_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0230_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0230_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0230_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0230_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0230_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0230_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0230_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0230_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0230_pd() != null) {
				            cellO.setCellValue(record.getR0230_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0230_lgd() != null) {
				            cellP.setCellValue(record.getR0230_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0230_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0230_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0230_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0230_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0230_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0230_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0230_remarks() != null) {
				            cellT.setCellValue(record.getR0230_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row32
				        row = sheet.getRow(31);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0240_borrower_name() != null) {
				            cellD.setCellValue(record.getR0240_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0240_group_name() != null) {
				            cellE.setCellValue(record.getR0240_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0240_cin() != null) {
				            cellF.setCellValue(record.getR0240_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0240_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0240_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0240_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0240_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0240_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0240_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0240_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0240_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0240_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0240_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0240_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0240_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0240_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0240_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0240_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0240_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0240_pd() != null) {
				            cellO.setCellValue(record.getR0240_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0240_lgd() != null) {
				            cellP.setCellValue(record.getR0240_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0240_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0240_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0240_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0240_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0240_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0240_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0240_remarks() != null) {
				            cellT.setCellValue(record.getR0240_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row33
				        row = sheet.getRow(32);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0250_borrower_name() != null) {
				            cellD.setCellValue(record.getR0250_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0250_group_name() != null) {
				            cellE.setCellValue(record.getR0250_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0250_cin() != null) {
				            cellF.setCellValue(record.getR0250_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0250_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0250_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0250_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0250_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0250_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0250_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0250_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0250_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0250_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0250_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0250_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0250_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0250_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0250_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0250_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0250_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0250_pd() != null) {
				            cellO.setCellValue(record.getR0250_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0250_lgd() != null) {
				            cellP.setCellValue(record.getR0250_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0250_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0250_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0250_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0250_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0250_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0250_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0250_remarks() != null) {
				            cellT.setCellValue(record.getR0250_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row34
				        row = sheet.getRow(33);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0260_borrower_name() != null) {
				            cellD.setCellValue(record.getR0260_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0260_group_name() != null) {
				            cellE.setCellValue(record.getR0260_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0260_cin() != null) {
				            cellF.setCellValue(record.getR0260_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0260_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0260_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0260_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0260_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0260_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0260_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0260_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0260_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0260_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0260_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0260_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0260_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0260_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0260_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0260_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0260_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0260_pd() != null) {
				            cellO.setCellValue(record.getR0260_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0260_lgd() != null) {
				            cellP.setCellValue(record.getR0260_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0260_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0260_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0260_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0260_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0260_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0260_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0260_remarks() != null) {
				            cellT.setCellValue(record.getR0260_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row35
				        row = sheet.getRow(34);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0270_borrower_name() != null) {
				            cellD.setCellValue(record.getR0270_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0270_group_name() != null) {
				            cellE.setCellValue(record.getR0270_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0270_cin() != null) {
				            cellF.setCellValue(record.getR0270_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0270_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0270_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0270_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0270_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0270_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0270_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0270_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0270_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0270_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0270_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0270_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0270_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0270_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0270_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0270_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0270_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0270_pd() != null) {
				            cellO.setCellValue(record.getR0270_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0270_lgd() != null) {
				            cellP.setCellValue(record.getR0270_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0270_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0270_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0270_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0270_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0270_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0270_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0270_remarks() != null) {
				            cellT.setCellValue(record.getR0270_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row36
				        row = sheet.getRow(35);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0280_borrower_name() != null) {
				            cellD.setCellValue(record.getR0280_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0280_group_name() != null) {
				            cellE.setCellValue(record.getR0280_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0280_cin() != null) {
				            cellF.setCellValue(record.getR0280_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0280_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0280_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0280_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0280_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0280_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0280_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0280_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0280_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0280_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0280_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0280_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0280_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0280_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0280_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0280_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0280_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0280_pd() != null) {
				            cellO.setCellValue(record.getR0280_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0280_lgd() != null) {
				            cellP.setCellValue(record.getR0280_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0280_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0280_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0280_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0280_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0280_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0280_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0280_remarks() != null) {
				            cellT.setCellValue(record.getR0280_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                        
				     // row37
				        row = sheet.getRow(36);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0290_borrower_name() != null) {
				            cellD.setCellValue(record.getR0290_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0290_group_name() != null) {
				            cellE.setCellValue(record.getR0290_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0290_cin() != null) {
				            cellF.setCellValue(record.getR0290_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0290_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0290_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0290_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0290_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0290_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0290_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0290_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0290_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0290_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0290_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0290_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0290_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0290_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0290_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0290_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0290_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0290_pd() != null) {
				            cellO.setCellValue(record.getR0290_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0290_lgd() != null) {
				            cellP.setCellValue(record.getR0290_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0290_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0290_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0290_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0290_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0290_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0290_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0290_remarks() != null) {
				            cellT.setCellValue(record.getR0290_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                        
				     // row38
				        row = sheet.getRow(37);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0300_borrower_name() != null) {
				            cellD.setCellValue(record.getR0300_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0300_group_name() != null) {
				            cellE.setCellValue(record.getR0300_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0300_cin() != null) {
				            cellF.setCellValue(record.getR0300_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0300_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0300_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0300_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0300_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0300_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0300_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0300_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0300_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0300_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0300_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0300_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0300_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0300_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0300_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0300_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0300_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0300_pd() != null) {
				            cellO.setCellValue(record.getR0300_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0300_lgd() != null) {
				            cellP.setCellValue(record.getR0300_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0300_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0300_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0300_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0300_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0300_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0300_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0300_remarks() != null) {
				            cellT.setCellValue(record.getR0300_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        // row39
				        row = sheet.getRow(38);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0310_borrower_name() != null) {
				            cellD.setCellValue(record.getR0310_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0310_group_name() != null) {
				            cellE.setCellValue(record.getR0310_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0310_cin() != null) {
				            cellF.setCellValue(record.getR0310_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0310_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0310_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0310_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0310_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0310_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0310_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0310_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0310_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0310_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0310_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0310_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0310_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0310_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0310_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0310_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0310_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0310_pd() != null) {
				            cellO.setCellValue(record.getR0310_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0310_lgd() != null) {
				            cellP.setCellValue(record.getR0310_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0310_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0310_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0310_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0310_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0310_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0310_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0310_remarks() != null) {
				            cellT.setCellValue(record.getR0310_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row40
				        row = sheet.getRow(39);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0320_borrower_name() != null) {
				            cellD.setCellValue(record.getR0320_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0320_group_name() != null) {
				            cellE.setCellValue(record.getR0320_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0320_cin() != null) {
				            cellF.setCellValue(record.getR0320_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0320_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0320_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0320_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0320_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0320_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0320_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0320_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0320_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0320_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0320_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0320_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0320_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0320_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0320_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0320_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0320_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0320_pd() != null) {
				            cellO.setCellValue(record.getR0320_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0320_lgd() != null) {
				            cellP.setCellValue(record.getR0320_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0320_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0320_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0320_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0320_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0320_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0320_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0320_remarks() != null) {
				            cellT.setCellValue(record.getR0320_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row41
				        row = sheet.getRow(40);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0330_borrower_name() != null) {
				            cellD.setCellValue(record.getR0330_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0330_group_name() != null) {
				            cellE.setCellValue(record.getR0330_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0330_cin() != null) {
				            cellF.setCellValue(record.getR0330_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0330_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0330_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0330_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0330_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0330_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0330_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0330_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0330_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0330_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0330_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0330_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0330_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0330_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0330_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0330_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0330_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0330_pd() != null) {
				            cellO.setCellValue(record.getR0330_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0330_lgd() != null) {
				            cellP.setCellValue(record.getR0330_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0330_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0330_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0330_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0330_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0330_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0330_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0330_remarks() != null) {
				            cellT.setCellValue(record.getR0330_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row42
				        row = sheet.getRow(41);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0340_borrower_name() != null) {
				            cellD.setCellValue(record.getR0340_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0340_group_name() != null) {
				            cellE.setCellValue(record.getR0340_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0340_cin() != null) {
				            cellF.setCellValue(record.getR0340_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0340_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0340_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0340_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0340_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0340_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0340_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0340_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0340_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0340_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0340_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0340_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0340_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0340_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0340_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0340_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0340_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0340_pd() != null) {
				            cellO.setCellValue(record.getR0340_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0340_lgd() != null) {
				            cellP.setCellValue(record.getR0340_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0340_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0340_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0340_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0340_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0340_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0340_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0340_remarks() != null) {
				            cellT.setCellValue(record.getR0340_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				     // row44
				        row = sheet.getRow(43);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0360_borrower_name() != null) {
				            cellD.setCellValue(record.getR0360_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0360_group_name() != null) {
				            cellE.setCellValue(record.getR0360_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0360_cin() != null) {
				            cellF.setCellValue(record.getR0360_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0360_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0360_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0360_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0360_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0360_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0360_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0360_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0360_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0360_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0360_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0360_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0360_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0360_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0360_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0360_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0360_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0360_pd() != null) {
				            cellO.setCellValue(record.getR0360_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0360_lgd() != null) {
				            cellP.setCellValue(record.getR0360_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0360_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0360_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0360_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0360_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0360_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0360_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0360_remarks() != null) {
				            cellT.setCellValue(record.getR0360_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                       
				     // row45
				        row = sheet.getRow(44);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0370_borrower_name() != null) {
				            cellD.setCellValue(record.getR0370_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0370_group_name() != null) {
				            cellE.setCellValue(record.getR0370_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0370_cin() != null) {
				            cellF.setCellValue(record.getR0370_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0370_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0370_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0370_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0370_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0370_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0370_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0370_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0370_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0370_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0370_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0370_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0370_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0370_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0370_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0370_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0370_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0370_pd() != null) {
				            cellO.setCellValue(record.getR0370_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0370_lgd() != null) {
				            cellP.setCellValue(record.getR0370_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0370_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0370_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0370_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0370_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0370_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0370_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0370_remarks() != null) {
				            cellT.setCellValue(record.getR0370_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                        
				     // row46
				        row = sheet.getRow(45);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0380_borrower_name() != null) {
				            cellD.setCellValue(record.getR0380_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0380_group_name() != null) {
				            cellE.setCellValue(record.getR0380_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0380_cin() != null) {
				            cellF.setCellValue(record.getR0380_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0380_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0380_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0380_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0380_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0380_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0380_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0380_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0380_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0380_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0380_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0380_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0380_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0380_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0380_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0380_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0380_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0380_pd() != null) {
				            cellO.setCellValue(record.getR0380_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0380_lgd() != null) {
				            cellP.setCellValue(record.getR0380_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0380_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0380_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0380_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0380_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0380_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0380_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0380_remarks() != null) {
				            cellT.setCellValue(record.getR0380_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                        
				        
				     // row47
				        row = sheet.getRow(46);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0390_borrower_name() != null) {
				            cellD.setCellValue(record.getR0390_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0390_group_name() != null) {
				            cellE.setCellValue(record.getR0390_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0390_cin() != null) {
				            cellF.setCellValue(record.getR0390_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0390_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0390_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0390_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0390_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0390_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0390_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0390_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0390_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0390_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0390_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0390_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0390_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0390_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0390_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0390_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0390_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0390_pd() != null) {
				            cellO.setCellValue(record.getR0390_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0390_lgd() != null) {
				            cellP.setCellValue(record.getR0390_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0390_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0390_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0390_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0390_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0390_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0390_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0390_remarks() != null) {
				            cellT.setCellValue(record.getR0390_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row48
				        row = sheet.getRow(47);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0400_borrower_name() != null) {
				            cellD.setCellValue(record.getR0400_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0400_group_name() != null) {
				            cellE.setCellValue(record.getR0400_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0400_cin() != null) {
				            cellF.setCellValue(record.getR0400_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0400_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0400_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0400_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0400_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0400_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0400_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0400_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0400_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0400_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0400_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0400_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0400_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0400_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0400_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0400_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0400_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0400_pd() != null) {
				            cellO.setCellValue(record.getR0400_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0400_lgd() != null) {
				            cellP.setCellValue(record.getR0400_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0400_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0400_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0400_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0400_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0400_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0400_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0400_remarks() != null) {
				            cellT.setCellValue(record.getR0400_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row49
				        row = sheet.getRow(48);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0410_borrower_name() != null) {
				            cellD.setCellValue(record.getR0410_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0410_group_name() != null) {
				            cellE.setCellValue(record.getR0410_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0410_cin() != null) {
				            cellF.setCellValue(record.getR0410_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower is Domiciled
				        cellG = row.createCell(6);
				        if (record.getR0410_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0410_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0410_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0410_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded Outstanding Amount
				        cellI = row.createCell(8);
				        if (record.getR0410_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0410_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Secured Portion of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0410_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0410_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Positive Collateral after Haircut
				        cellK = row.createCell(10);
				        if (record.getR0410_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0410_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0410_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0410_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0410_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0410_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0410_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0410_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0410_pd() != null) {
				            cellO.setCellValue(record.getR0410_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0410_lgd() != null) {
				            cellP.setCellValue(record.getR0410_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge to Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0410_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0410_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest Suspended and Provision for Fees and Charges
				        cellR = row.createCell(17);
				        if (record.getR0410_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0410_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0410_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0410_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0410_remarks() != null) {
				            cellT.setCellValue(record.getR0410_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row50
				        row = sheet.getRow(49);

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0420_borrower_name() != null) {
				            cellD.setCellValue(record.getR0420_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0420_group_name() != null) {
				            cellE.setCellValue(record.getR0420_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0420_cin() != null) {
				            cellF.setCellValue(record.getR0420_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country Where Borrower Is Dom
				        cellG = row.createCell(6);
				        if (record.getR0420_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0420_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Fund Outs Amt
				        cellH = row.createCell(7);
				        if (record.getR0420_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0420_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfund Outs Amt
				        cellI = row.createCell(8);
				        if (record.getR0420_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0420_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Tot Exp
				        cellJ = row.createCell(9);
				        if (record.getR0420_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0420_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - Pos Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0420_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0420_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0420_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0420_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Dis Col Value
				        cellM = row.createCell(12);
				        if (record.getR0420_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0420_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Valid Dis Cash Flw
				        cellN = row.createCell(13);
				        if (record.getR0420_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0420_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0420_pd() != null) {
				            cellO.setCellValue(record.getR0420_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0420_lgd() != null) {
				            cellP.setCellValue(record.getR0420_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Prov Charged To Profit and Loss
				        cellQ = row.createCell(16);
				        if (record.getR0420_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0420_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest and Provision for Fee and Charge
				        cellR = row.createCell(17);
				        if (record.getR0420_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0420_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0420_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0420_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0420_remarks() != null) {
				            cellT.setCellValue(record.getR0420_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row 51
				        row = sheet.getRow(50); // Row 44 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0430_borrower_name() != null) {
				            cellD.setCellValue(record.getR0430_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0430_group_name() != null) {
				            cellE.setCellValue(record.getR0430_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0430_cin() != null) {
				            cellF.setCellValue(record.getR0430_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0430_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0430_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0430_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0430_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0430_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0430_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0430_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0430_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0430_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0430_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0430_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0430_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0430_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0430_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0430_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0430_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0430_pd() != null) {
				            cellO.setCellValue(record.getR0430_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0430_lgd() != null) {
				            cellP.setCellValue(record.getR0430_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0430_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0430_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0430_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0430_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0430_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0430_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0430_remarks() != null) {
				            cellT.setCellValue(record.getR0430_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0440
				        row = sheet.getRow(51); // Row 52 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0440_borrower_name() != null) {
				            cellD.setCellValue(record.getR0440_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0440_group_name() != null) {
				            cellE.setCellValue(record.getR0440_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0440_cin() != null) {
				            cellF.setCellValue(record.getR0440_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0440_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0440_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0440_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0440_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0440_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0440_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0440_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0440_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0440_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0440_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0440_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0440_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0440_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0440_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0440_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0440_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0440_pd() != null) {
				            cellO.setCellValue(record.getR0440_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0440_lgd() != null) {
				            cellP.setCellValue(record.getR0440_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0440_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0440_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0440_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0440_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0440_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0440_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0440_remarks() != null) {
				            cellT.setCellValue(record.getR0440_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				     // row for R0450
				        row = sheet.getRow(52); // Row 53 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0450_borrower_name() != null) {
				            cellD.setCellValue(record.getR0450_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0450_group_name() != null) {
				            cellE.setCellValue(record.getR0450_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0450_cin() != null) {
				            cellF.setCellValue(record.getR0450_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0450_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0450_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0450_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0450_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0450_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0450_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0450_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0450_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0450_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0450_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0450_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0450_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0450_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0450_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0450_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0450_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0450_pd() != null) {
				            cellO.setCellValue(record.getR0450_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0450_lgd() != null) {
				            cellP.setCellValue(record.getR0450_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0450_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0450_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0450_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0450_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0450_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0450_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0450_remarks() != null) {
				            cellT.setCellValue(record.getR0450_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0460
				        row = sheet.getRow(53); // Row 54 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0460_borrower_name() != null) {
				            cellD.setCellValue(record.getR0460_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0460_group_name() != null) {
				            cellE.setCellValue(record.getR0460_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0460_cin() != null) {
				            cellF.setCellValue(record.getR0460_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0460_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0460_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0460_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0460_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0460_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0460_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0460_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0460_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0460_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0460_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0460_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0460_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0460_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0460_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0460_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0460_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0460_pd() != null) {
				            cellO.setCellValue(record.getR0460_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0460_lgd() != null) {
				            cellP.setCellValue(record.getR0460_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0460_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0460_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0460_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0460_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0460_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0460_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0460_remarks() != null) {
				            cellT.setCellValue(record.getR0460_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				     // row for R0470
				        row = sheet.getRow(54); // Row 55 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0470_borrower_name() != null) {
				            cellD.setCellValue(record.getR0470_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0470_group_name() != null) {
				            cellE.setCellValue(record.getR0470_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0470_cin() != null) {
				            cellF.setCellValue(record.getR0470_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0470_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0470_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0470_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0470_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0470_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0470_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0470_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0470_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0470_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0470_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0470_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0470_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0470_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0470_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0470_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0470_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0470_pd() != null) {
				            cellO.setCellValue(record.getR0470_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0470_lgd() != null) {
				            cellP.setCellValue(record.getR0470_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0470_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0470_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0470_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0470_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0470_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0470_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0470_remarks() != null) {
				            cellT.setCellValue(record.getR0470_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }

				     // row for R0480
				        row = sheet.getRow(55); // Row 56 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0480_borrower_name() != null) {
				            cellD.setCellValue(record.getR0480_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0480_group_name() != null) {
				            cellE.setCellValue(record.getR0480_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0480_cin() != null) {
				            cellF.setCellValue(record.getR0480_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0480_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0480_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0480_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0480_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0480_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0480_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0480_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0480_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0480_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0480_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0480_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0480_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0480_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0480_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0480_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0480_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0480_pd() != null) {
				            cellO.setCellValue(record.getR0480_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0480_lgd() != null) {
				            cellP.setCellValue(record.getR0480_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0480_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0480_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0480_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0480_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0480_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0480_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0480_remarks() != null) {
				            cellT.setCellValue(record.getR0480_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0490
				        row = sheet.getRow(56); // Row 57 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0490_borrower_name() != null) {
				            cellD.setCellValue(record.getR0490_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0490_group_name() != null) {
				            cellE.setCellValue(record.getR0490_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0490_cin() != null) {
				            cellF.setCellValue(record.getR0490_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0490_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0490_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0490_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0490_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0490_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0490_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0490_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0490_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0490_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0490_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0490_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0490_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0490_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0490_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0490_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0490_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0490_pd() != null) {
				            cellO.setCellValue(record.getR0490_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0490_lgd() != null) {
				            cellP.setCellValue(record.getR0490_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0490_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0490_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0490_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0490_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0490_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0490_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0490_remarks() != null) {
				            cellT.setCellValue(record.getR0490_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0500
				        row = sheet.getRow(57); // Row 58 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0500_borrower_name() != null) {
				            cellD.setCellValue(record.getR0500_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0500_group_name() != null) {
				            cellE.setCellValue(record.getR0500_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0500_cin() != null) {
				            cellF.setCellValue(record.getR0500_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0500_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0500_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0500_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0500_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0500_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0500_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0500_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0500_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0500_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0500_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0500_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0500_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0500_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0500_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0500_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0500_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0500_pd() != null) {
				            cellO.setCellValue(record.getR0500_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0500_lgd() != null) {
				            cellP.setCellValue(record.getR0500_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0500_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0500_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0500_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0500_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0500_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0500_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0500_remarks() != null) {
				            cellT.setCellValue(record.getR0500_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0510
				        row = sheet.getRow(58); // Row 59 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0510_borrower_name() != null) {
				            cellD.setCellValue(record.getR0510_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0510_group_name() != null) {
				            cellE.setCellValue(record.getR0510_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0510_cin() != null) {
				            cellF.setCellValue(record.getR0510_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0510_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0510_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0510_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0510_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0510_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0510_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0510_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0510_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0510_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0510_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0510_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0510_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0510_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0510_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0510_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0510_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0510_pd() != null) {
				            cellO.setCellValue(record.getR0510_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0510_lgd() != null) {
				            cellP.setCellValue(record.getR0510_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0510_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0510_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0510_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0510_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0510_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0510_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0510_remarks() != null) {
				            cellT.setCellValue(record.getR0510_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
                        
				     // row for R0530
				        row = sheet.getRow(60); // Row 61 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0530_borrower_name() != null) {
				            cellD.setCellValue(record.getR0530_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0530_group_name() != null) {
				            cellE.setCellValue(record.getR0530_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0530_cin() != null) {
				            cellF.setCellValue(record.getR0530_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0530_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0530_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0530_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0530_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0530_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0530_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0530_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0530_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0530_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0530_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0530_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0530_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0530_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0530_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0530_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0530_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0530_pd() != null) {
				            cellO.setCellValue(record.getR0530_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0530_lgd() != null) {
				            cellP.setCellValue(record.getR0530_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0530_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0530_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0530_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0530_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0530_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0530_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0530_remarks() != null) {
				            cellT.setCellValue(record.getR0530_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0540
				        row = sheet.getRow(61); // Row 62 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0540_borrower_name() != null) {
				            cellD.setCellValue(record.getR0540_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0540_group_name() != null) {
				            cellE.setCellValue(record.getR0540_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0540_cin() != null) {
				            cellF.setCellValue(record.getR0540_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0540_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0540_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0540_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0540_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0540_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0540_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0540_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0540_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0540_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0540_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0540_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0540_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0540_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0540_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0540_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0540_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0540_pd() != null) {
				            cellO.setCellValue(record.getR0540_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0540_lgd() != null) {
				            cellP.setCellValue(record.getR0540_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0540_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0540_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0540_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0540_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0540_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0540_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0540_remarks() != null) {
				            cellT.setCellValue(record.getR0540_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0550
				        row = sheet.getRow(62); // Row 63 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0550_borrower_name() != null) {
				            cellD.setCellValue(record.getR0550_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0550_group_name() != null) {
				            cellE.setCellValue(record.getR0550_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0550_cin() != null) {
				            cellF.setCellValue(record.getR0550_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0550_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0550_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0550_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0550_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0550_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0550_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0550_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0550_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0550_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0550_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0550_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0550_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0550_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0550_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0550_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0550_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0550_pd() != null) {
				            cellO.setCellValue(record.getR0550_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0550_lgd() != null) {
				            cellP.setCellValue(record.getR0550_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0550_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0550_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0550_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0550_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0550_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0550_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0550_remarks() != null) {
				            cellT.setCellValue(record.getR0550_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0560
				        row = sheet.getRow(63); // Row 64 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0560_borrower_name() != null) {
				            cellD.setCellValue(record.getR0560_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0560_group_name() != null) {
				            cellE.setCellValue(record.getR0560_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0560_cin() != null) {
				            cellF.setCellValue(record.getR0560_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0560_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0560_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0560_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0560_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0560_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0560_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0560_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0560_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0560_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0560_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0560_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0560_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0560_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0560_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0560_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0560_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0560_pd() != null) {
				            cellO.setCellValue(record.getR0560_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0560_lgd() != null) {
				            cellP.setCellValue(record.getR0560_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0560_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0560_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0560_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0560_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0560_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0560_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0560_remarks() != null) {
				            cellT.setCellValue(record.getR0560_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				        // row for R0570
				        row = sheet.getRow(64); // Row 65 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0570_borrower_name() != null) {
				            cellD.setCellValue(record.getR0570_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0570_group_name() != null) {
				            cellE.setCellValue(record.getR0570_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0570_cin() != null) {
				            cellF.setCellValue(record.getR0570_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0570_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0570_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0570_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0570_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0570_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0570_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0570_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0570_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
				        }

				        // Column K - POS Col Haircut
				        cellK = row.createCell(10);
				        if (record.getR0570_pos_col_haircut() != null) {
				            cellK.setCellValue(record.getR0570_pos_col_haircut().doubleValue());
				            cellK.setCellStyle(numberStyle);
				        } else {
				            cellK.setCellValue("");
				            cellK.setCellStyle(textStyle);
				        }

				        // Column L - Type of Security
				        cellL = row.createCell(11);
				        if (record.getR0570_typ_of_security() != null) {
				            cellL.setCellValue(record.getR0570_typ_of_security());
				            cellL.setCellStyle(textStyle);
				        } else {
				            cellL.setCellValue("");
				            cellL.setCellStyle(textStyle);
				        }

				        // Column M - Discounted Collateral Value
				        cellM = row.createCell(12);
				        if (record.getR0570_dis_col_value() != null) {
				            cellM.setCellValue(record.getR0570_dis_col_value().doubleValue());
				            cellM.setCellStyle(numberStyle);
				        } else {
				            cellM.setCellValue("");
				            cellM.setCellStyle(textStyle);
				        }

				        // Column N - Validated Discounted Cash Flow
				        cellN = row.createCell(13);
				        if (record.getR0570_valid_dis_cash_flw() != null) {
				            cellN.setCellValue(record.getR0570_valid_dis_cash_flw().doubleValue());
				            cellN.setCellStyle(numberStyle);
				        } else {
				            cellN.setCellValue("");
				            cellN.setCellStyle(textStyle);
				        }

				        // Column O - PD
				        cellO = row.createCell(14);
				        if (record.getR0570_pd() != null) {
				            cellO.setCellValue(record.getR0570_pd().doubleValue());
				            cellO.setCellStyle(numberStyle);
				        } else {
				            cellO.setCellValue("");
				            cellO.setCellStyle(textStyle);
				        }

				        // Column P - LGD
				        cellP = row.createCell(15);
				        if (record.getR0570_lgd() != null) {
				            cellP.setCellValue(record.getR0570_lgd().doubleValue());
				            cellP.setCellStyle(numberStyle);
				        } else {
				            cellP.setCellValue("");
				            cellP.setCellStyle(textStyle);
				        }

				        // Column Q - Provision Charge
				        cellQ = row.createCell(16);
				        if (record.getR0570_prov_chrg_to_profit_and_loss() != null) {
				            cellQ.setCellValue(record.getR0570_prov_chrg_to_profit_and_loss().doubleValue());
				            cellQ.setCellStyle(numberStyle);
				        } else {
				            cellQ.setCellValue("");
				            cellQ.setCellStyle(textStyle);
				        }

				        // Column R - Legal Interest & Provision
				        cellR = row.createCell(17);
				        if (record.getR0570_leg_int_in_sus_and_prov_for_fee_and_chrg() != null) {
				            cellR.setCellValue(record.getR0570_leg_int_in_sus_and_prov_for_fee_and_chrg().doubleValue());
				            cellR.setCellStyle(numberStyle);
				        } else {
				            cellR.setCellValue("");
				            cellR.setCellStyle(textStyle);
				        }

				        // Column S - Legal Case Y/N
				        cellS = row.createCell(18);
				        if (record.getR0570_leg_case_yn() != null) {
				            cellS.setCellValue(record.getR0570_leg_case_yn());
				            cellS.setCellStyle(textStyle);
				        } else {
				            cellS.setCellValue("");
				            cellS.setCellStyle(textStyle);
				        }

				        // Column T - Remarks
				        cellT = row.createCell(19);
				        if (record.getR0570_remarks() != null) {
				            cellT.setCellValue(record.getR0570_remarks());
				            cellT.setCellStyle(textStyle);
				        } else {
				            cellT.setCellValue("");
				            cellT.setCellStyle(textStyle);
				        }
				        
				     // row for R0580
				        row = sheet.getRow(65); // Row 66 (0-based index)

				        // Column D - Borrower Name
				        cellD = row.createCell(3);
				        if (record.getR0580_borrower_name() != null) {
				            cellD.setCellValue(record.getR0580_borrower_name());
				            cellD.setCellStyle(textStyle);
				        } else {
				            cellD.setCellValue("");
				            cellD.setCellStyle(textStyle);
				        }

				        // Column E - Group Name
				        cellE = row.createCell(4);
				        if (record.getR0580_group_name() != null) {
				            cellE.setCellValue(record.getR0580_group_name());
				            cellE.setCellStyle(textStyle);
				        } else {
				            cellE.setCellValue("");
				            cellE.setCellStyle(textStyle);
				        }

				        // Column F - CIN
				        cellF = row.createCell(5);
				        if (record.getR0580_cin() != null) {
				            cellF.setCellValue(record.getR0580_cin());
				            cellF.setCellStyle(textStyle);
				        } else {
				            cellF.setCellValue("");
				            cellF.setCellStyle(textStyle);
				        }

				        // Column G - Country
				        cellG = row.createCell(6);
				        if (record.getR0580_coun_whe_borr_is_dom() != null) {
				            cellG.setCellValue(record.getR0580_coun_whe_borr_is_dom());
				            cellG.setCellStyle(textStyle);
				        } else {
				            cellG.setCellValue("");
				            cellG.setCellStyle(textStyle);
				        }

				        // Column H - Total Funded Outstanding Amount
				        cellH = row.createCell(7);
				        if (record.getR0580_tot_fund_outs_amt() != null) {
				            cellH.setCellValue(record.getR0580_tot_fund_outs_amt().doubleValue());
				            cellH.setCellStyle(numberStyle);
				        } else {
				            cellH.setCellValue("");
				            cellH.setCellStyle(textStyle);
				        }

				        // Column I - CCF Total Unfunded
				        cellI = row.createCell(8);
				        if (record.getR0580_ccf_tot_unfund_outs_amt() != null) {
				            cellI.setCellValue(record.getR0580_ccf_tot_unfund_outs_amt().doubleValue());
				            cellI.setCellStyle(numberStyle);
				        } else {
				            cellI.setCellValue("");
				            cellI.setCellStyle(textStyle);
				        }

				        // Column J - Sec Port of Total Exposure
				        cellJ = row.createCell(9);
				        if (record.getR0580_sec_port_of_tot_exp() != null) {
				            cellJ.setCellValue(record.getR0580_sec_port_of_tot_exp().doubleValue());
				            cellJ.setCellStyle(numberStyle);
				        } else {
				            cellJ.setCellValue("");
				            cellJ.setCellStyle(textStyle);
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
	
	
	
	
	
	
	public byte[] getBRF5_2DetailExcel(String filename, String fromdate, String todate) {
	    try {
	        logger.info("Generating Excel for BRF5_2Details...");
	        System.out.println("came to Detail download service");

	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("BRF5_2Details");

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
	        List<CBUAE_BRF5_2_DETAILTABLE01_ENTITY> reportData = BRF5_2_DETAIL_Repo.getdatabydateList(parsedToDate);

	        if (reportData != null && !reportData.isEmpty()) {
	            int rowIndex = 1;
	            for (CBUAE_BRF5_2_DETAILTABLE01_ENTITY item : reportData) {
	                XSSFRow row = sheet.createRow(rowIndex++);

	                row.createCell(0).setCellValue(item.getCustId());
	                row.createCell(1).setCellValue(item.getAcctNumber());
	                row.createCell(2).setCellValue(item.getAcctName());

	                // ACCT BALANCE (right aligned, 3 decimal places)
	                Cell balanceCell = row.createCell(3);
	                if (item.getAcctBalanceInAed() != null) {
	                    balanceCell.setCellValue(item.getAcctBalanceInAed().doubleValue());
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
	            logger.info("No data found for BRF5_2 — only header will be written.");
	        }

	        // Write to byte[]
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        workbook.write(bos);
	        workbook.close();

	        logger.info("Excel generation completed with {} row(s).", reportData != null ? reportData.size() : 0);
	        return bos.toByteArray();

	    } catch (Exception e) {
	        logger.error("Error generating BRF5_2 Excel", e);
	        return new byte[0];
	    }
	}
	
		
		
	}

	  
		
	
