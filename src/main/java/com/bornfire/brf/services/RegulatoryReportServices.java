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
	BRRS_M_CA5_ReportService brrs_m_ca5_reportservice;
	
	@Autowired
	BRRS_M_SRWA_12D_ReportService brrs_m_srwa_12d_reportservice;
	
	@Autowired
	BRRS_M_OR1_ReportService brrs_m_or1_reportservice;
	
	@Autowired
	BRRS_M_LA4_ReportService brrs_m_la4_reportservice;
	
	@Autowired
	BRRS_M_LA3_ReportService brrs_m_la3_reportservice;
	
	@Autowired
	BRRS_M_LIQGAP_ReportService brrs_m_liqgap_reportservice;

	@Autowired
	BRRS_Q_SMME_DEP_ReportService BRRS_Q_SMME_DEP_ReportService;
	
	@Autowired
	BRRS_M_SECA_ReportService BRRS_M_SECA_ReportService;
	
	@Autowired
	BRRS_M_OB_ReportService BRRS_M_OB_ReportService;
	
	@Autowired
	BRRS_M_PD_ReportService BRRS_M_PD_ReportService;
	
	@Autowired
	BRRS_M_UNCONS_INVEST_ReportService BRRS_M_UNCONS_INVEST_ReportService;
		
	@Autowired
	BRRS_Q_SMME_ReportService BRRS_Q_SMME_reportservice;

	@Autowired
	BRRS_M_FAS_ReportService BRRS_M_FAS_reportservice;

	@Autowired
	BRRS_M_LA2_ReportService BRRS_M_LA2_reportservice;

	@Autowired
	BRRS_M_DEP3_ReportService BRRS_M_DEP3_reportservice;

	@Autowired
	BRRS_Q_BRANCHNET_ReportService BRRS_Q_BRANCHNET_reportservice;
	
	//h
	@Autowired
	BRRS_M_SRWA_12B_ReportService brrs_m_srwa_12b_reportservice;
	
	@Autowired
	BRRS_M_SP_ReportService brrs_m_sp_reportservice;
	
	@Autowired
	BRRS_M_PLL_ReportService brrs_m_pll_reportservice;

	@Autowired
	BRRS_M_FXR_ReportService brrs_m_fxr_reportservice;

	@Autowired
	BRRS_M_SFINP1_ReportService brrs_m_sfinp1_reportservice;
	
	@Autowired
	BRRS_M_CA2_ReportService brrs_m_ca2_reportservice;
	
	//MY 
	
	@Autowired
	BRRS_M_LIQ_ReportService brrs_m_liq_reportservice;
	
	@Autowired
	BRRS_M_CA4_ReportService  brrs_m_ca4_reportservice;
	
	@Autowired
	BRRS_M_SCI_E_ReportService brrs_m_sci_e_reportservice;
	
	@Autowired
	BRRS_M_SRWA_12A_ReportService brrs_m_srwa_12a_reportservice;
	
	@Autowired
	BRRS_M_EPR_ReportService  brrs_m_epr_reportservice;
	
	@Autowired
	BRRS_M_GMIRT_ReportService brrs_m_gmirt_reportservice;
	
	
	@Autowired
	BRRS_M_I_S_CA_ReportService brrs_m_i_s_ca_reportservice;
	
	@Autowired
	BRRS_Q_RLFA2_ReportService brrs_q_rlfa2_reportservice;


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

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
			
		case "M_CA5":
		    repsummary = brrs_m_ca5_reportservice.getM_CA5View(reportId, fromdate, todate, currency, dtltype, pageable,type, version);
		    break;
		    
		case "M_SRWA_12D":
			repsummary = brrs_m_srwa_12d_reportservice.getM_SRWA_12DView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_LA3":
			repsummary = brrs_m_la3_reportservice.getM_LA3View(reportId, fromdate, todate, currency, dtltype, pageable,type, version);
			break;
			
		case "M_OR1":
			repsummary = brrs_m_or1_reportservice.getM_OR1View(reportId, fromdate, todate, currency, dtltype, pageable,type, version);
			break;
			
		case "M_LA4":
			repsummary = brrs_m_la4_reportservice.getM_LA4View(reportId, fromdate, todate, currency, dtltype, pageable,type, version);
			break;
			
		case "M_LIQGAP":
			repsummary = brrs_m_liqgap_reportservice.getM_LIQGAPView(reportId, fromdate, todate, currency, dtltype, pageable,type, version);
			break;
			
		case "Q_SMME_DEP":
			repsummary = BRRS_Q_SMME_DEP_ReportService.getQ_SMME_DEPiew(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_SECA":
			repsummary = BRRS_M_SECA_ReportService.getM_SECAview(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_OB":
			repsummary = BRRS_M_OB_ReportService.getM_OBview(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_PD":
			repsummary = BRRS_M_PD_ReportService.getM_PDview(reportId, fromdate, todate, currency, dtltype,
					pageable, type, version);
			break;
			
		case "M_UNCONS_INVEST":
			repsummary = BRRS_M_UNCONS_INVEST_ReportService.getM_UNCONS_INVESTView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
			break;
		
			

				
		case "Q_SMME":
			repsummary = BRRS_Q_SMME_reportservice.getBRRS_Q_SMMEView( reportId, fromdate, todate, currency, dtltype, pageable, type, version);
            break;

        case "M_FAS":
			repsummary = BRRS_M_FAS_reportservice.getBRRS_M_FASView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
            break;

		   case "M_LA2":
			repsummary = BRRS_M_LA2_reportservice.getBRRS_M_LA2View(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
            break;	

		 case "M_DEP3":
			repsummary = BRRS_M_DEP3_reportservice.getM_DEP3View(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
            break;

            case "Q_BRANCHNET":
			repsummary = BRRS_Q_BRANCHNET_reportservice.getQ_BRANCHNETView(reportId, fromdate, todate, currency, dtltype, pageable, type, version);
            break;
            
            
            
          //MY 	
			
 		   case "M_LIQ":
 				
 				repsummary = brrs_m_liq_reportservice.getM_LIQView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 			
 				
 			case "M_CA4":
 				
 				
 				repsummary = brrs_m_ca4_reportservice.getBRRS_M_CA4View(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 				
 			case "M_SCI_E":
 				
 				repsummary = brrs_m_sci_e_reportservice.getM_SCI_EView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 				
 			case "M_SRWA_12A":
 				
 				
 				repsummary = brrs_m_srwa_12a_reportservice.getM_SRWA_12AView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 				
 			case "M_EPR":
 				
 				repsummary = brrs_m_epr_reportservice.getM_EPRView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 				
 	        case "M_GMIRT":
 				
 				repsummary = brrs_m_gmirt_reportservice.getM_GMIRTView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;

 				
 				
 	          case "M_I_S_CA":
 				
 				repsummary = brrs_m_i_s_ca_reportservice.getM_I_S_CAView(reportId, fromdate, todate, currency, dtltype,
 						pageable, type, version);
 				break;
 				
 	          case "Q_RLFA2":
 	  			
 	  			repsummary = brrs_q_rlfa2_reportservice.getQ_RLFA2View(reportId, fromdate, todate, currency, dtltype,
 	  					pageable, type, version);
 	  			break;	 
            
		//h
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
			
		case "M_CA5":
			repdetail = brrs_m_ca5_reportservice.getM_CA5currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type, version);
			break;
			
		case "M_SRWA_12D":
			repdetail = brrs_m_srwa_12d_reportservice.getM_SRWA_12DcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_OR1":
			repdetail = brrs_m_or1_reportservice.getM_OR1currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type, version);
			break;
			
		case "M_LA4":
			repdetail = brrs_m_la4_reportservice.getM_LA4currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type, version);
			break;
			
		case "M_LA3":
			repdetail = brrs_m_la3_reportservice.getM_LA3currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type, version);
			break;
			
		case "M_LIQGAP":
			repdetail = brrs_m_liqgap_reportservice.getM_LIQGAPcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter,type, version);
			break;
			
		case "Q_SMME_DEP":
			repdetail = BRRS_Q_SMME_DEP_ReportService.getQ_SMME_DEPcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter, type, version);
			break;
			
		case "M_SECA":
			repdetail = BRRS_M_SECA_ReportService.getM_SECAcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter, type, version);
			break;
			
		case "M_OB":
			repdetail = BRRS_M_OB_ReportService.getM_OBcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter, type, version);
			break;
			
		case "M_PD":
			repdetail = BRRS_M_PD_ReportService.getM_PDcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter, type, version);
			break;
			


			
	    case "Q_SMME":
            repdetail = BRRS_Q_SMME_reportservice.getBRRS_Q_SMMEcurrentDtl(reportId, fromdate, todate, currency,dtltype, pageable, Filter, type, version);
	        break;

	    case "M_FAS":
            repdetail = BRRS_M_FAS_reportservice.getBRRS_M_FAScurrentDtl(reportId, fromdate, todate, currency,dtltype, pageable, Filter, type, version);
	        break;	
			
		 case "M_LA2":
            repdetail = BRRS_M_LA2_reportservice.getBRRS_M_LA2currentDtl(reportId, fromdate, todate, currency,dtltype, pageable, Filter, type, version);
	        break;
		case "M_DEP3":
            repdetail = BRRS_M_DEP3_reportservice.getM_DEP3currentDtl(reportId, fromdate, todate, currency,dtltype, pageable, Filter, type, version);
	        break;	
		
	        
	        
	      
	        
	        
	        
	      //MY
			
	       case "M_LIQ":
				repdetail = brrs_m_liq_reportservice.getM_LIQcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);
				break;
				
			/*
			 * case "M_CA4": repdetail = brrs_m_ca4_reportservice.
			 * getBRRS_M_CA4currentDtl(reportId, fromdate, todate, currency, dtltype,
			 * pageable, Filter, type, version); break;
			 */
			
				
			case "M_SCI_E":
				
				
				repdetail = brrs_m_sci_e_reportservice.getM_SCI_EcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);
				break;
				
			case "M_SRWA_12A":
				
				
				repdetail = brrs_m_srwa_12a_reportservice.getM_SRWA_12AcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);
				break;
				
			case "M_EPR":
				
				repdetail = brrs_m_epr_reportservice. getM_EPRcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);
				break;
				
	        case "M_GMIRT":
				
				repdetail = brrs_m_gmirt_reportservice. getM_GMIRTcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);
				break;
				
	          case "M_I_S_CA":
				
				repdetail = brrs_m_i_s_ca_reportservice. getM_I_S_CAcurrentDtl(reportId, fromdate, todate, currency, dtltype,
						pageable, Filter, type, version);

				break;
	        


		//h
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
		case "M_LA5":
			try {
				repfile = M_LA5_ReportService.getBRRS_M_LA5Excel(filename, reportId, fromdate, todate, currency,
						dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_CA5":
			try {
				repfile = brrs_m_ca5_reportservice.getM_CA5Excel(filename, reportId, fromdate, todate, currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_OR1":
			try {
				repfile = brrs_m_or1_reportservice.getM_OR1Excel(filename, reportId, fromdate, todate, currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LA4":
			try {
				repfile = brrs_m_la4_reportservice.getM_LA4Excel(filename, reportId, fromdate, todate, currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LA3":
			try {
				repfile = brrs_m_la3_reportservice.getM_LA3Excel(filename, reportId, fromdate, todate, currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LIQGAP":
			try {
				repfile = brrs_m_liqgap_reportservice.getM_LIQGAPExcel(filename, reportId, fromdate, todate, currency, dtltype);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "Q_SMME_DEP":
			try {
				repfile = BRRS_Q_SMME_DEP_ReportService.BRRS_Q_SMME_DEPExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			
		case "M_SECA":
			try {
				repfile = BRRS_M_SECA_ReportService.BRRS_M_SECAExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "M_OB":
			try {
				repfile = BRRS_M_OB_ReportService.BRRS_M_OBExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_PD":
			try {
				repfile = BRRS_M_PD_ReportService.BRRS_M_PDExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_UNCONS_INVEST":
			try {
				repfile = BRRS_M_UNCONS_INVEST_ReportService.BRRS_M_UNCONS_INVESTExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		
			case "Q_SMME":
				try {
					repfile = BRRS_Q_SMME_reportservice.getQ_SMMEExcel(filename, reportId, fromdate, todate, currency,version,type,
							dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;



				case "M_LA2":
				try {
					repfile = BRRS_M_LA2_reportservice.getM_LA2Excel(filename, reportId, fromdate, todate, currency,version,type,
							dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

				
				case "M_DEP3":
				try {
					repfile = BRRS_M_DEP3_reportservice.BRRS_M_DEP3Excel(filename, reportId, fromdate, todate, currency,version,type,
							dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

				
				case "M_FAS":
				try {
					repfile = BRRS_M_FAS_reportservice.getM_FASExcel(filename, reportId, fromdate, todate, currency,version,type,
							dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				case "M_SIR":
					try {
						repfile = M_SIR_ReportService.getM_SIRExcel(filename, reportId, fromdate, todate, currency, dtltype, type,
								version);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
					
					
					//MY
					
				case "M_LIQ":
					try {
						
						
						repfile = brrs_m_liq_reportservice.getM_LIQExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					

				

				case "M_CA4":
					try {
						repfile = brrs_m_ca4_reportservice.getBRRS_M_CA4Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case "M_SCI_E":
					try {
						
						
						repfile = brrs_m_sci_e_reportservice.getM_SCI_EExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				
					
				case "M_SRWA_12A":
					try {
						
						repfile = brrs_m_srwa_12a_reportservice.getM_SRWA_12AExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				
				case "M_EPR":
					try {
						
						repfile = brrs_m_epr_reportservice.getM_EPRExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case "M_GMIRT":
					try {
						
						repfile = brrs_m_gmirt_reportservice.getM_GMIRTExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case "M_I_S_CA":
					try {
						
						repfile = brrs_m_i_s_ca_reportservice.getM_I_S_CAExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
					
				case "Q_RLFA2":
					try {
						
						repfile = brrs_q_rlfa2_reportservice.getQ_RLFA2Excel(filename, reportId, fromdate, todate, currency, dtltype,type,version);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
	
				

			//h	
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

		case "M_FXR":
			try {
					repfile = brrs_m_fxr_reportservice.getM_FXRExcel(filename, reportId, fromdate, todate, currency, dtltype,type,version);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;				

	
					
					
					
					

		}


		
		

		return repfile;
	}



	

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
		
		else if ("M_CA5Detail".equals(filename)) {
	        return brrs_m_ca5_reportservice.getM_CA5DetailExcel(filename, fromdate, todate);
	    }
	    
	    else if ("M_OR1Detail".equals(filename)) {
	        return brrs_m_or1_reportservice.M_OR1DetailExcel(filename, fromdate, todate);
	    }
	    
	    else if ("M_LA4Detail".equals(filename)) {
	        return brrs_m_la4_reportservice.M_LA4DetailExcel(filename, fromdate, todate);
	    }
		
	    else if ("M_LA3Detail".equals(filename)) {
	        return brrs_m_la3_reportservice.M_LA3DetailExcel(filename, fromdate, todate);
	    }
		
	    else if ("M_LIQGAPDetail".equals(filename)) {
	        return brrs_m_liqgap_reportservice.M_LIQGAPDetailExcel(filename, fromdate, todate);
	    }

	    else if ("Q_SMME_DEPDetail".equals(filename)) {
			return BRRS_Q_SMME_DEP_ReportService.BRRS_Q_SMME_DEPDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);
		} 
		
		else if ("M_SECADetail".equals(filename)) {
			return BRRS_M_SECA_ReportService.BRRS_M_SECADetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);
		}
		
		else if ("M_OBDetail".equals(filename)) {
			return BRRS_M_OB_ReportService.BRRS_M_OBDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);
		}
		
		else if ("M_PDDetail".equals(filename)) {
			return BRRS_M_PD_ReportService.BRRS_M_PDDetailExcel(filename, fromdate, todate, currency, dtltype,
					type, version);
		}
		

		//h	
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



		else if ("Q_SMME_Detail".equals(filename)) {
				return BRRS_Q_SMME_reportservice.BRRS_Q_SMMEDetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
		}
		else if ("M_FASDetail".equals(filename)) {
				return BRRS_M_FAS_reportservice.BRRS_M_FASDetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
		}
		else if ("M_DEP3Detail".equals(filename)) {
				return BRRS_M_DEP3_reportservice.BRRS_M_DEP3DetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
        }
		else if ("M_LA2Detail".equals(filename)) {
				return BRRS_M_LA2_reportservice.BRRS_M_LA2DetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
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
			
		case "Q_SMME_DEP":
			try {
				archivalData = BRRS_Q_SMME_DEP_ReportService.getQ_SMME_DEPArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_SECA":
			try {
				archivalData = BRRS_M_SECA_ReportService.getM_SECAArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "M_OB":
			try {
				archivalData = BRRS_M_OB_ReportService.getM_OBArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_PD":
			try {
				archivalData = BRRS_M_PD_ReportService.getM_PDArchival();
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
			
		case "M_LA5":
			try {
				archivalData = M_LA5_ReportService.getM_LA5Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LA4":
			try {
				archivalData = brrs_m_la4_reportservice.getM_LA4Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LA3":
			try {
				archivalData = brrs_m_la3_reportservice.getM_LA3Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_CA5":
			try {
				archivalData = brrs_m_ca5_reportservice.getM_CA5Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_OR1":
			try {
				archivalData = brrs_m_or1_reportservice.getM_OR1Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_LIQGAP":
			try {
				archivalData = brrs_m_liqgap_reportservice.getM_LIQGAPArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "M_UNCONS_INVEST":
			try {
				archivalData = BRRS_M_UNCONS_INVEST_ReportService.getM_UNCONS_INVESTArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;



			
        case "Q_SMME":
			try {
				archivalData = BRRS_Q_SMME_reportservice.getQ_SMMEArchival();
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

			

			 case "M_LA2":
			try {
				archivalData = BRRS_M_LA2_reportservice.getM_LA2Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;		

			 case "M_DEP3":
			try {
				archivalData = BRRS_M_DEP3_reportservice.getM_DEP3Archival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;	

			 case "M_FAS":
			try {
				archivalData = BRRS_M_FAS_reportservice.getM_FASArchival();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			
			
			//MY
			
			
				case "M_LIQ":
					try {
						archivalData = brrs_m_liq_reportservice.getM_LIQArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				
				case "M_SCI_E":
					try {
						archivalData = brrs_m_sci_e_reportservice.getM_SCI_EArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case "M_CA4":
					try {
						archivalData = brrs_m_ca4_reportservice.getM_CA4Archival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case "M_EPR":
					try {
						archivalData = brrs_m_epr_reportservice.getM_EPRArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case "M_SRWA_12A":
					try {
						archivalData = brrs_m_srwa_12a_reportservice.getM_SRWA_12AArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case "M_GMIRT":
					try {
						archivalData = brrs_m_gmirt_reportservice.getM_GMIRTArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case "M_I_S_CA":
					try {
						archivalData = brrs_m_i_s_ca_reportservice.getM_I_S_CAArchival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case "Q_RLFA2":
					try {
						archivalData = brrs_q_rlfa2_reportservice.getQ_RLFA2Archival();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
		

		//h	
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
			
		case "M_FXR":
			try {
				archivalData = brrs_m_fxr_reportservice.getM_FXRArchival();
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
		
		else if ("M_CA5Detail".equals(filename)) {
	        fileData = brrs_m_ca5_reportservice.getM_CA5DetailExcel(filename, fromdate, todate);
	    }
	    
		else if ("M_OR1Detail".equals(filename)) {
	        fileData = brrs_m_or1_reportservice.M_OR1DetailExcel(filename, fromdate, todate);
	    }
	    
		else if ("M_LA4Detail".equals(filename)) {
	        fileData = brrs_m_la4_reportservice.M_LA4DetailExcel(filename, fromdate, todate);
	    }
	    
		else if ("M_LA3Detail".equals(filename)) {
	        fileData = brrs_m_la3_reportservice.M_LA3DetailExcel(filename, fromdate, todate);
	    }
		
		else if ("M_LIQGAPDetail".equals(filename)) {
	        fileData = brrs_m_liqgap_reportservice.M_LIQGAPDetailExcel(filename, fromdate, todate);
	    }
		
		else if ("Q_SMME_DEPDetail".equals(filename)) {
				fileData = BRRS_Q_SMME_DEP_ReportService.BRRS_Q_SMME_DEPDetailExcel(filename, fromdate, todate, currency,dtltype, type, version);
				
		} 
		
		else if ("M_SECADetail".equals(filename)) {
				fileData = BRRS_M_SECA_ReportService.BRRS_M_SECADetailExcel(filename, fromdate, todate, currency,
						dtltype, type, version);
		}
		
		else if ("M_OBDetail".equals(filename)) {
				fileData = BRRS_M_OB_ReportService.BRRS_M_OBDetailExcel(filename, fromdate, todate, currency,
						dtltype, type, version);
		}
			
		else if ("M_PDDetail".equals(filename)) {
				fileData = BRRS_M_PD_ReportService.BRRS_M_PDDetailExcel(filename, fromdate, todate, currency,
						dtltype, type, version);
		}
	    
	    else if ("Q_SMMEDetail".equals(filename)) {
            fileData = BRRS_Q_SMME_reportservice.BRRS_Q_SMMEDetailExcel(filename, fromdate, todate, currency, dtltype, type, version);
		
		}else if ("M_FASDetail".equals(filename)) {
            fileData = BRRS_M_FAS_reportservice.BRRS_M_FASDetailExcel( filename, fromdate, todate, currency, dtltype, type, version);
        }
		else if ("M_LA2Detail".equals(filename)) {
            fileData = BRRS_M_LA2_reportservice.BRRS_M_LA2DetailExcel( filename, fromdate, todate, currency, dtltype, type, version);
        }
		else if ("M_DEP3Detail".equals(filename)) {
            fileData = BRRS_M_DEP3_reportservice.BRRS_M_DEP3DetailExcel( filename, fromdate, todate, currency, dtltype, type, version);
        }


		//h
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
		
		//MY
		
		else if ("M_LIQ".equals(filename)) {
			fileData = brrs_m_liq_reportservice.getM_LIQDetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);
		
		}
		
		/*
		 * else if ("M_CA4".equals(filename)) { fileData =
		 * brrs_m_ca4_reportservice.getBRRS_M_CA4DetailExcel(filename, fromdate, todate,
		 * currency, dtltype, type, version); }
		 */
		
		else if ("M_SCI_E".equals(filename)) {
	        
	        
	        fileData = brrs_m_sci_e_reportservice.getM_SCI_EDetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);
	    }
		
		else if ("M_SRWA_12A".equals(filename)) {
	       
	        
	        fileData = brrs_m_srwa_12a_reportservice.getM_SRWA_12ADetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);
	        
	        
	    }
		
		else if ("M_EPR_Detail".equals(filename)) {
			fileData = brrs_m_epr_reportservice.getM_EPRDetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);
	    }
		
		
       else if ("M_GMIRT_Detail".equals(filename)) {
	       
	        fileData = brrs_m_gmirt_reportservice.getM_GMIRTDetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);   
	    }

       else if ("M_I_S_CA_Detail".equals(filename)) {
	       
	        fileData = brrs_m_i_s_ca_reportservice.getM_I_S_CADetailExcel(filename, fromdate, todate, currency,
					dtltype, type, version);   
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
