package com.bornfire.brf.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Component
@Service
@Transactional
@ConfigurationProperties("output")
public class RegulatoryReportServices {

	@Autowired
	CBUAE_BRF1_1_ReportService cbuae_brf1_1_reportservice;

	@Autowired
	CBUAE_BRF1_3_ReportService cbuae_brf1_3_reportservice;

	@Autowired
	CBUAE_BRF2_1_ReportService cbuae_brf2_1_reportservice;

	@Autowired
	CBUAE_BRF2_2_ReportService cbuae_brf2_2_reportservice;

	@Autowired
	CBUAE_BRF2_4_ReportService cbuae_brf2_4_reportservice;

	@Autowired
	CBUAE_BRF2_6_ReportService cbuae_brf2_6_reportservice;

	@Autowired
	CBUAE_BRF2_7_ReportService cbuae_brf2_7_reportservice;

	@Autowired
	BRRS_M_SFINP2_ReportService BRRS_M_SFINP2_reportservice;

	@Autowired
	M_CA7_ReportService M_CA7_ReportService;
	@Autowired
	M_SIR_ReportService M_SIR_ReportService;



	@Autowired
	BRRS_M_IS_ReportService BRRS_M_IS_reportservice;

	@Autowired
	BRRS_M_CA6_ReportService BRRS_M_CA6_reportservice;

	@Autowired
	BRRS_M_SRWA_12F_ReportService BRRS_M_SRWA_12F_reportservice;

	@Autowired
	BRRS_M_SRWA_12H_ReportService BRRS_M_SRWA_12H_reportservice;

	@Autowired
	BRRS_M_MRC_ReportService BRRS_M_MRC_reportservice;

	@Autowired
	BRRS_M_SRWA_12C_ReportService BRRS_M_SRWA_12C_reportservice;

	@Autowired
	BRRS_M_CA1_ReportService BRRS_M_CA1_reportservice;

	@Autowired
	BRRS_M_CA3_ReportService BRRS_M_CA3_reportservice;

	@Autowired
	BRRS_M_PI_ReportService BRRS_M_PI_reportservice;
	
	@Autowired
	BRRS_M_IS_ReportService BRRS_M_IS_Reportservice;
	@Autowired
	M_GALOR_ReportService M_GALOR_ReportService;

	@Autowired
	M_LA5_ReportService M_LA5_ReportService;
	

	
	@Autowired
	BRRS_M_AIDP_ReportService M_AIDP_ReportService;



	@Autowired
	BRRS_M_SFINP1_ReportService brrs_m_sfinp1_reportservice;
	
	@Autowired
	BRRS_M_CA2_ReportService brrs_m_ca2_reportservice;
	
	@Autowired
	BRRS_M_SRWA_12B_ReportService brrs_m_srwa_12b_reportservice;
	
	@Autowired
	BRRS_M_SP_ReportService brrs_m_sp_reportservice;
	
	@Autowired
	BRRS_M_PLL_ReportService brrs_m_pll_reportservice;

	@Autowired
	BRRS_M_FXR_ReportService brrs_m_fxr_reportservice;

	private static final Logger logger = LoggerFactory.getLogger(RegulatoryReportServices.class);

	public ModelAndView getReportView(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime, Pageable pageable,
			BigDecimal srl_no, String req, String type, String version) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {

		case "BRF001":
			repsummary = cbuae_brf1_1_reportservice.getBRF1_1View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF1_3":
			repsummary = cbuae_brf1_3_reportservice.getBRF1_3View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF2_1":
			repsummary = cbuae_brf2_1_reportservice.getBRF2_1View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF2_2":
			repsummary = cbuae_brf2_2_reportservice.getBRF2_2View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF2_4":
			repsummary = cbuae_brf2_4_reportservice.getBRF2_4View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF2_6":
			repsummary = cbuae_brf2_6_reportservice.getBRF2_6View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "BRF2_7":
			repsummary = cbuae_brf2_7_reportservice.getBRF2_7View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "M_SFINP2":
			
			repsummary = BRRS_M_SFINP2_reportservice.getM_SFINP2View(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_IS":
			
			repsummary = BRRS_M_IS_reportservice.getM_ISView(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;

		case "M_CA7":
			repsummary = M_CA7_ReportService.getM_CA7View(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
		case "M_SIR":
			repsummary = M_SIR_ReportService.getM_SIRView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
			break;
		

		
		case "M_CA6":
			repsummary = BRRS_M_CA6_reportservice.getM_CA6View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "M_SRWA_12F":
			repsummary = BRRS_M_SRWA_12F_reportservice.getM_SRWA_12FView(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "M_SRWA_12H":
			repsummary = BRRS_M_SRWA_12H_reportservice.getM_SRWA_12HView(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "M_MRC":
			repsummary = BRRS_M_MRC_reportservice.getM_MRCView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "M_SRWA_12C":
			repsummary = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CView(reportId, fromdate, todate, currency,
					dtltype, pageable);
			break;

		case "M_CA1":
			repsummary = BRRS_M_CA1_reportservice.getBRRS_M_CA1View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "M_CA3":
			repsummary = BRRS_M_CA3_reportservice.getBRRS_M_CA3View(reportId, fromdate, todate, currency, dtltype,
					pageable);
			break;

		case "M_PI":
			repsummary = BRRS_M_PI_reportservice.getBRRS_M_PIView(reportId, fromdate, todate, currency, dtltype,
					pageable,type,version);
			break;
			
		case "M_GALOR":
			repsummary = M_GALOR_ReportService.getM_GALORView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
			break;


		case "M_LA5":
			repsummary = M_LA5_ReportService.getBRRS_M_LA5View(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
			break;
		
		
		case "M_AIDP":
			repsummary = M_AIDP_ReportService.getM_AIDPView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
			break;
				


		case "M_SFINP1":
			
			repsummary = brrs_m_sfinp1_reportservice.getM_SFINP1View(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_CA2":
			
			repsummary = brrs_m_ca2_reportservice.getM_CA2View(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_SRWA_12B":
				
				repsummary = brrs_m_srwa_12b_reportservice.getM_SRWA_12BView(reportId, fromdate, todate, currency, dtltype,
						pageable, type, version);
				break;
				
		case "M_SP":
			
			repsummary = brrs_m_sp_reportservice.getM_SPView(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_PLL":
			
			repsummary = brrs_m_pll_reportservice.getM_PLLView(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_FXR":
			
			repsummary = brrs_m_fxr_reportservice.getM_FXRView(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;

		}
		return repsummary;
	}

	
	public ModelAndView getReportDetails(String reportId, String instanceCode, String asondate, String fromdate,
			String todate, String currency, String reportingTime, String dtltype, String subreportid, String secid,
			Pageable pageable, String Filter, String type, String version) {

		ModelAndView repdetail = new ModelAndView();
		logger.info("Getting Details for the Report :" + reportId);

		switch (reportId) {

		case "BRF001":
			repdetail = cbuae_brf1_1_reportservice.getBRF1_1currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF1_3":
			repdetail = cbuae_brf1_3_reportservice.getBRF1_3currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF2_1":
			repdetail = cbuae_brf2_1_reportservice.getBRF2_1currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF2_2":
			repdetail = cbuae_brf2_2_reportservice.getBRF2_2currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF2_4":
			repdetail = cbuae_brf2_4_reportservice.getBRF2_4currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF2_6":
			repdetail = cbuae_brf2_6_reportservice.getBRF2_6currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "BRF2_7":
			repdetail = cbuae_brf2_7_reportservice.getBRF2_7currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "M_SFINP2":
			repdetail = BRRS_M_SFINP2_reportservice.getM_SFINP2currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter, type, version);
			break;


		case "M_CA7":
			repdetail = M_CA7_ReportService.getM_CA7currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
	
	

		case "M_SIR":
			repdetail = M_SIR_ReportService.getM_SIRcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
		case "M_IS":
			repdetail = BRRS_M_IS_reportservice.getM_IScurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;

		case "M_CA6":
			repdetail = BRRS_M_CA6_reportservice.getM_CA6currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "M_SRWA_12F":
			repdetail = BRRS_M_SRWA_12F_reportservice.getM_SRWA_12FcurrentDtl(reportId, fromdate, todate, currency,
					dtltype, pageable, Filter);
			break;

		case "M_SRWA_12H":
			repdetail = BRRS_M_SRWA_12H_reportservice.getM_SRWA_12HcurrentDtl(reportId, fromdate, todate, currency,
					dtltype, pageable, Filter);
			break;

		case "M_MRC":
			repdetail = BRRS_M_MRC_reportservice.getM_MRCcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "M_SRWA_12C":
			repdetail = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CcurrentDtl(reportId, fromdate, todate, currency,
					dtltype, pageable, Filter);
			break;

		case "M_CA1":
			repdetail = BRRS_M_CA1_reportservice.getBRRS_M_CA1currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "M_CA3":
			repdetail = BRRS_M_CA3_reportservice.getBRRS_M_CA3currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;

		case "M_PI":
			repdetail = BRRS_M_PI_reportservice.getBRRS_M_PIcurrentDtl(reportId, fromdate, todate, currency, dtltype,

					pageable, Filter,type,version);
			break;
	
		case "M_GALOR":
			repdetail = M_GALOR_ReportService.getM_GALORcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
		case "M_LA5":
			repdetail = M_LA5_ReportService.getBRRS_M_LA5currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;

		case "M_SFINP1":
			repdetail = brrs_m_sfinp1_reportservice.getM_SFINP1currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
		
		case "M_CA2":
			repdetail = brrs_m_ca2_reportservice.getM_CA2currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
			
		case "M_SRWA_12B":
				repdetail = brrs_m_srwa_12b_reportservice.getM_SRWA_12BcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter,type,version);
				break;
			
		case "M_SP":
			repdetail = brrs_m_sp_reportservice.getM_SPcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;
			
		case "M_PLL":
			repdetail = brrs_m_pll_reportservice.getM_PLLcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type,version);
			break;			


		}

		return repdetail;
	}

	public byte[] getDownloadFile(String reportId, String filename, String asondate, String fromdate, String todate,
			String currency, String subreportid, String secid, String dtltype, String reportingTime,
			String instancecode, String filter, String type, String version) {

		byte[] repfile = null;

		switch (reportId) {

		
			case "BRF1_3":
				try {
					repfile = cbuae_brf1_3_reportservice.getBRF2_1Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				
				
			case "BRF2_1":
				try {
					repfile = cbuae_brf2_1_reportservice.getBRF2_1Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "BRF2_2":
				try {
					repfile = cbuae_brf2_2_reportservice.getBRF2_2Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				
			case "BRF2_4":
				try {
					repfile = cbuae_brf2_4_reportservice.getBRF2_4Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
	
			case "BRF2_7":
				try {
					repfile = cbuae_brf2_7_reportservice.getBRF2_7Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_SFINP2":
				try {
					repfile = BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
		
			case "M_CA7":
				try {
					repfile = M_CA7_ReportService.getM_CA7Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "M_GALOR":
				try {
					repfile = M_GALOR_ReportService.getM_GALORExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "M_SIR":
				try {
					repfile = M_SIR_ReportService.getM_SIRExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

		
		case "M_IS":
			try {
				repfile = BRRS_M_IS_reportservice.BRRS_M_ISExcel(filename, reportId, fromdate, todate, currency,
						dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_CA6":
			try {
				repfile = BRRS_M_CA6_reportservice.BRRS_M_CA6Excel(filename, reportId, fromdate, todate, currency,
						dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_SRWA_12F":
			try {
				repfile = BRRS_M_SRWA_12F_reportservice.BRRS_M_SRWA_12FExcel(filename, reportId, fromdate, todate,
						currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_SRWA_12H":
			try {
				repfile = BRRS_M_SRWA_12H_reportservice.BRRS_M_SRWA_12HExcel(filename, reportId, fromdate, todate,
						currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_MRC":
			try {
				repfile = BRRS_M_MRC_reportservice.BRRS_M_MRCExcel(filename, reportId, fromdate, todate, currency,
						dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_SRWA_12C":
			try {
				repfile = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CExcel(filename, reportId, fromdate, todate,
						currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_CA1":
			try {
				repfile = BRRS_M_CA1_reportservice.getBRRS_M_CA1Excel(filename, reportId, fromdate, todate, currency,
						dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_CA3":
			try {
				repfile = BRRS_M_CA3_reportservice.getBRRS_M_CA3Excel(filename, reportId, fromdate, todate, currency,
						dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_PI":
			try {
				repfile = BRRS_M_PI_reportservice.getBRRS_M_PIExcel(filename, reportId, fromdate, todate, currency,
						dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

//		case "M_LA5":
//			try {
//				repfile = M_LA5_ReportService.getBRRS_M_LA5Excel(filename, reportId, fromdate, todate, currency,
//						dtltype,type,version);

			
		case "M_SFINP1":
			try {
				repfile = brrs_m_sfinp1_reportservice.getM_SFINP1Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;


		
		case "M_CA2":
		try {
				repfile = brrs_m_ca2_reportservice.getM_CA2Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_SRWA_12B":
			try {
					repfile = brrs_m_srwa_12b_reportservice.getM_SRWA_12BExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		case "M_SP":
			try {
					repfile = brrs_m_sp_reportservice.getM_SPExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
		case "M_PLL":
			try {
					repfile = brrs_m_pll_reportservice.getM_PLLExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;				


		}

		return repfile;
	}

//	public byte[] getDownloadDetailFile(String filename, String fromdate, String todate) {
//	    System.out.println("Came to common service");
//	    
//	    if ("BRF2_4Detail".equals(filename)) {
//	        return cbuae_brf2_4_reportservice.getBRF2_4DetailExcel(filename, fromdate, todate);
//	    } else {
//	        System.out.println("Default");
//	        
//	    }
//	    
//	    return new byte[0];
//	}

	

	public byte[] getDownloadDetailFile(String filename, String fromdate, String todate, String currency,
			String dtltype,String type, String version ) {
		System.out.println("Came to common service1");

		if ("MSFinP2Detail".equals(filename)) {
			return BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);
		} else if ("M_ISDetail".equals(filename)) {
			return BRRS_M_IS_reportservice.BRRS_M_ISDetailExcel(filename, fromdate, todate,currency, dtltype,
					type, version);

		} else if ("M_CA6Detail".equals(filename)) {
			return BRRS_M_CA6_reportservice.BRRS_M_CA6DetailExcel(filename, fromdate, todate);

		} else if ("M_SRWA_12FDetail".equals(filename)) {
			return BRRS_M_SRWA_12F_reportservice.BRRS_M_SRWA_12FDetailExcel(filename, fromdate, todate);

		}

		else if ("M_SRWA_12HDetail".equals(filename)) {
			return BRRS_M_SRWA_12H_reportservice.BRRS_M_SRWA_12HDetailExcel(filename, fromdate, todate);

		}

		else if ("M_MRCDetail".equals(filename)) {
			return BRRS_M_MRC_reportservice.BRRS_M_MRCDetailExcel(filename, fromdate, todate);

		} else if ("M_SRWA_12CDetail".equals(filename)) {
			return BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CDetailExcel(filename, fromdate, todate);

		}

		else if ("M_CA1Detail".equals(filename)) {
			return BRRS_M_CA1_reportservice.geBRRS_M_CA1DetailExcel(filename, fromdate, todate);

		}

		else if ("M_CA3Detail".equals(filename)) {
			return BRRS_M_CA3_reportservice.getBRRS_M_CA3DetailExcel(filename, fromdate, todate);

		} else if ("M_PIDetail".equals(filename)) {
			return BRRS_M_PI_reportservice.BRRS_M_PIDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("M_CA_7Details".equals(filename)) {
			return M_CA7_ReportService.getM_CA_7DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("M_SIRDetails".equals(filename)) {
			return M_SIR_ReportService.getM_SIRDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("BRRS_M_GALORDetails".equals(filename)) {
			return M_GALOR_ReportService.BRRS_M_GALORDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}
		else if ("M_LA5Details".equals(filename)) {
			return M_LA5_ReportService.BRRS_M_LA5DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}

		else if ("M_SFINP1Detail".equals(filename)) {
			return brrs_m_sfinp1_reportservice.getM_SFINP1DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}
		
		else if ("M_CA2Detail".equals(filename)) {
			return brrs_m_ca2_reportservice.getM_CA2DetailExcel(filename, fromdate, todate,currency, dtltype, type, version);

		}
		
		else if ("M_SRWA_12BDetail".equals(filename)) {
			return brrs_m_srwa_12b_reportservice.getM_SRWA_12BDetailExcel(filename, fromdate, todate,currency, dtltype, type, version);
			}
		
		else if ("M_SPDetail".equals(filename)) {
			return brrs_m_sp_reportservice.getM_SPDetailExcel(filename, fromdate, todate,currency, dtltype, type, version);
			}
		
		else if ("M_PLLDetail".equals(filename)) {
			return brrs_m_pll_reportservice.getM_PLLDetailExcel(filename, fromdate, todate,currency, dtltype, type, version);
			}		
		
		else {
			System.out.println("Default");
			System.out.println("Testting");
		}

		return new byte[0];

	}

	public List<Object> getArchival(String rptcode) {

		List<Object> archivalData = new ArrayList<>();
		switch (rptcode) {
		case "M_SFINP2":
			try {
				archivalData = BRRS_M_SFINP2_reportservice.getM_SFINP2Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "M_SFINP1":
			try {
				archivalData = brrs_m_sfinp1_reportservice.getM_SFINP1Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_CA2":
			try {
				archivalData = brrs_m_ca2_reportservice.getM_CA2Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_IS":
			try {
				archivalData = BRRS_M_IS_reportservice.getM_ISArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_PI":
			try {
				archivalData = BRRS_M_PI_reportservice.getM_PIArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "M_CA7":
			try {
				archivalData = M_CA7_ReportService.getM_CA7Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "M_SIR":
			try {
				archivalData = M_SIR_ReportService.getM_SIRArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "M_GALOR":
			try {
				archivalData = M_GALOR_ReportService.getM_GALORArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			

//		case "M_LA5":
//			try {
//				archivalData = M_LA5_ReportService.getM_LA5Archival();

		case "M_SRWA_12B":
			try {
				archivalData = brrs_m_srwa_12b_reportservice.getM_SRWA_12BArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;	
		
		case "M_SP":
			try {
				archivalData = brrs_m_sp_reportservice.getM_SPArchival();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;


			
		case "M_PLL":
			try {
				archivalData = brrs_m_pll_reportservice.getM_PLLArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;			
			


		}
		return archivalData;
	}

	private final ConcurrentHashMap<String, byte[]> jobStorage = new ConcurrentHashMap<>();

	@Async
	public void generateReportAsync(String jobId, String filename, String fromdate, String todate, String dtltype,
			String type, String currency, String version) {
		// System.out.println("Starting report generation for: " + filename);

		byte[] fileData = null;

		if ("M_ISDetail".equals(filename)) {
			fileData = BRRS_M_IS_reportservice.BRRS_M_ISDetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);

		} else if ("MSFinP2Detail".equals(filename)) {
			fileData = BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2DetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);
		} else if ("M_CA6Detail".equals(filename)) {
			fileData = BRRS_M_CA6_reportservice.BRRS_M_CA6DetailExcel(filename, fromdate, todate);

		} else if ("M_SRWA_12FDetail".equals(filename)) {
			fileData = BRRS_M_SRWA_12F_reportservice.BRRS_M_SRWA_12FDetailExcel(filename, fromdate, todate);

		} else if ("M_SRWA_12HDetail".equals(filename)) {
			fileData = BRRS_M_SRWA_12H_reportservice.BRRS_M_SRWA_12HDetailExcel(filename, fromdate, todate);

		} else if ("M_MRCDetail".equals(filename)) {
			fileData = BRRS_M_MRC_reportservice.BRRS_M_MRCDetailExcel(filename, fromdate, todate);

		} else if ("M_SRWA_12CDetail".equals(filename)) {
			fileData = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CDetailExcel(filename, fromdate, todate);

		} else if ("M_CA1Detail".equals(filename)) {
			fileData = BRRS_M_CA1_reportservice.geBRRS_M_CA1DetailExcel(filename, fromdate, todate);

		} else if ("M_CA3Detail".equals(filename)) {
			fileData = BRRS_M_CA3_reportservice.getBRRS_M_CA3DetailExcel(filename, fromdate, todate);

		} else if ("M_PIDetail".equals(filename)) {
			fileData = BRRS_M_PI_reportservice.BRRS_M_PIDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("M_CA_7Details".equals(filename)) {
			fileData = M_CA7_ReportService.getM_CA_7DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("M_SIRDetails".equals(filename)) {
			fileData = M_SIR_ReportService.getM_SIRDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("BRRS_M_GALORDetails".equals(filename)) {
			fileData = M_GALOR_ReportService.BRRS_M_GALORDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}else if ("M_LA5Details".equals(filename)) {
			fileData = M_LA5_ReportService.BRRS_M_LA5DetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);

		}
		
		else if("M_SFINP1Detail".equals(filename)) {
	    	fileData = brrs_m_sfinp1_reportservice.getM_SFINP1DetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
		}
		else if("M_SRWA_12BDetail".equals(filename)) {
	    	fileData = brrs_m_srwa_12b_reportservice.getM_SRWA_12BDetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
		}
		else if("M_CA2Detail".equals(filename)) {
	    	fileData = brrs_m_ca2_reportservice.getM_CA2DetailExcel(filename, fromdate, todate,currency, dtltype,
					type, version);
		}
		else if("M_SPDetail".equals(filename)) {
	    	fileData = brrs_m_sp_reportservice.getM_SPDetailExcel(filename, fromdate, todate,currency, dtltype,
					type, version);
		}
		else if("M_PLLDetail".equals(filename)) {
	    	fileData = brrs_m_pll_reportservice.getM_PLLDetailExcel(filename, fromdate, todate,currency, dtltype,
					type, version);
		}



		if (fileData == null) {
			logger.warn("Excel generation failed or no data for jobId: {}", jobId);
			jobStorage.put(jobId, "Nodata".getBytes());
		} else {
			jobStorage.put(jobId, fileData);
		}

		System.out.println("Report generation completed for: " + filename);
	}

	public byte[] getReport(String jobId) {
		// System.out.println("Report generation completed for: " + jobId);
		return jobStorage.get(jobId);
	}

}
