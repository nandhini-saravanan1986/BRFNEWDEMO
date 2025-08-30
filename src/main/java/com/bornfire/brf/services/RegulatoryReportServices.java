package com.bornfire.brf.services;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;

import com.bornfire.brf.services.CBUAE_BRF1_1_ReportService;

import net.sf.jasperreports.engine.JRException;
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


	
	private static final Logger logger = LoggerFactory.getLogger(RegulatoryReportServices.class);
	
	public ModelAndView getReportView(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime, Pageable pageable,
			BigDecimal srl_no, String req) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {

		case "BRF001":
			repsummary = cbuae_brf1_1_reportservice.getBRF1_1View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF1_3":
			repsummary = cbuae_brf1_3_reportservice.getBRF1_3View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF2_1":
			repsummary = cbuae_brf2_1_reportservice.getBRF2_1View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF2_2":
			repsummary = cbuae_brf2_2_reportservice.getBRF2_2View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF2_4":
			repsummary = cbuae_brf2_4_reportservice.getBRF2_4View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF2_6":
			repsummary = cbuae_brf2_6_reportservice.getBRF2_6View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF2_7":
			repsummary = cbuae_brf2_7_reportservice.getBRF2_7View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_SFINP2":
			repsummary = BRRS_M_SFINP2_reportservice.getM_SFINP2View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		
		case "M_IS":
			repsummary = BRRS_M_IS_reportservice.getM_ISView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_CA6":
			repsummary = BRRS_M_CA6_reportservice.getM_CA6View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
			
		case "M_SRWA_12F":
			repsummary = BRRS_M_SRWA_12F_reportservice.getM_SRWA_12FView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_SRWA_12H":
			repsummary = BRRS_M_SRWA_12H_reportservice.getM_SRWA_12HView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_MRC":
			repsummary = BRRS_M_MRC_reportservice.getM_MRCView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "M_SRWA_12C":
			repsummary = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_CA1":
			repsummary = BRRS_M_CA1_reportservice.getBRRS_M_CA1View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_CA3":
			repsummary = BRRS_M_CA3_reportservice.getBRRS_M_CA3View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "M_PI":
			repsummary = BRRS_M_PI_reportservice.getBRRS_M_PIView(reportId, fromdate, todate, currency, dtltype, pageable);
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
					pageable, Filter);
			break;

		case "M_IS":
			repdetail = BRRS_M_IS_reportservice.getM_IScurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_CA6":
			repdetail = BRRS_M_CA6_reportservice.getM_CA6currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_SRWA_12F":
			repdetail = BRRS_M_SRWA_12F_reportservice.getM_SRWA_12FcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_SRWA_12H":
			repdetail = BRRS_M_SRWA_12H_reportservice.getM_SRWA_12HcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_MRC":
			repdetail = BRRS_M_MRC_reportservice.getM_MRCcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
			
		case "M_SRWA_12C":
			repdetail = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CcurrentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
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
					pageable, Filter);
			break;

			
		}
		
		return repdetail;
	}
	
	public byte[] getDownloadFile(String reportId,String filename, String asondate, String fromdate, String todate, String currency,
			String subreportid, String secid, String dtltype, String reportingTime, 
			String instancecode, String filter)  {

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
					repfile = BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_IS":
				try {
					repfile = BRRS_M_IS_reportservice.BRRS_M_ISExcel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_CA6":
				try {
					repfile = BRRS_M_CA6_reportservice.BRRS_M_CA6Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_SRWA_12F":
				try {
					repfile = BRRS_M_SRWA_12F_reportservice.BRRS_M_SRWA_12FExcel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_SRWA_12H":
				try {
					repfile = BRRS_M_SRWA_12H_reportservice.BRRS_M_SRWA_12HExcel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_MRC":
				try {
					repfile = BRRS_M_MRC_reportservice.BRRS_M_MRCExcel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_SRWA_12C":
				try {
					repfile = BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CExcel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_CA1":
				try {
					repfile = BRRS_M_CA1_reportservice.getBRRS_M_CA1Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "M_CA3":
				try {
					repfile = BRRS_M_CA3_reportservice.getBRRS_M_CA3Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case "M_PI":
				try {
					repfile = BRRS_M_PI_reportservice.getBRRS_M_PIExcel(filename, reportId, fromdate, todate, currency, dtltype);
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
	public byte[] getDownloadDetailFile(String filename, String fromdate, String todate) {
	    System.out.println("Came to common service1");
	    
	    if ("MSFinP2Detail".equals(filename)) {
	        return BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2DetailExcel(filename, fromdate, todate);
	    }
	    else if("M_ISDetail".equals(filename)) {
	    	return BRRS_M_IS_reportservice.BRRS_M_ISDetailExcel(filename, fromdate, todate);
	    
	    }
	    else if("M_CA6Detail".equals(filename)) {
	    	return BRRS_M_CA6_reportservice.BRRS_M_CA6DetailExcel(filename, fromdate, todate);
	    
	    }
	    else if("M_SRWA_12FDetail".equals(filename)) {
	    	return BRRS_M_SRWA_12F_reportservice.BRRS_M_SRWA_12FDetailExcel(filename, fromdate, todate);
	    
	    }
	    
	    else if("M_SRWA_12HDetail".equals(filename)) {
	    	return BRRS_M_SRWA_12H_reportservice.BRRS_M_SRWA_12HDetailExcel(filename, fromdate, todate);
	    
	    }
	    
	    else if("M_MRCDetail".equals(filename)) {
	    	return BRRS_M_MRC_reportservice.BRRS_M_MRCDetailExcel(filename, fromdate, todate);
	    
	    }
	    else if("M_SRWA_12CDetail".equals(filename)) {
	    	return BRRS_M_SRWA_12C_reportservice.getBRRS_M_SRWA_12CDetailExcel(filename, fromdate, todate);
	    
	    }
	    
	    else if("M_CA1Detail".equals(filename)) {
	    	return BRRS_M_CA1_reportservice.geBRRS_M_CA1DetailExcel(filename, fromdate, todate);
	    
	    }
	    
	    else if("M_CA3Detail".equals(filename)) {
	    	return BRRS_M_CA3_reportservice.getBRRS_M_CA3DetailExcel(filename, fromdate, todate);
	    
	    }
	    else if("M_PIDetail".equals(filename)) {
	    	return BRRS_M_PI_reportservice.getBRRS_M_PIDetailExcel(filename, fromdate, todate);
	    
	    }
	    	
	    
	    else {
	        System.out.println("Default"); 
	        System.out.println("Testting");
	    }
	    
	    return new byte[0];
	}
	
private final ConcurrentHashMap<String, byte[]> jobStorage = new ConcurrentHashMap<>();

	
    @Async
    public void generateReportAsync(String jobId, String filename, String fromdate,String todate, String dtltype,String type,String currency, String version) {
        //System.out.println("Starting report generation for: " + filename);
		        
		byte[] fileData =null;
				

				if("M_ISDetail".equals(filename)) {
			    	fileData = BRRS_M_IS_reportservice.BRRS_M_ISDetailExcel(filename, fromdate, todate);
			    
			    }
				else if ("MSFinP2Detail".equals(filename)) {
			        fileData = BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2DetailExcel(filename, fromdate, todate);
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
    	 //System.out.println("Report generation completed for: " + jobId);
        return jobStorage.get(jobId);
    }
	

}

