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
	M_CA7_ReportService M_CA7_ReportService;
	@Autowired
	M_SIR_ReportService M_SIR_ReportService;



	
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
		case "M_CA7":
			repsummary = M_CA7_ReportService.getM_CA7View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		case "M_SIR":
			repsummary = M_SIR_ReportService.getM_SIRView(reportId, fromdate, todate, currency, dtltype, pageable);
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

		case "M_CA7":
			repdetail = M_CA7_ReportService.getM_CA7currentDtl(reportId, fromdate, todate, currency, dtltype,
					pageable, Filter);
			break;
	
	//getM_SIRcurrentDtl

		case "M_SIR":
			repdetail = M_SIR_ReportService.getM_SIRcurrentDtl(reportId, fromdate, todate, currency, dtltype,
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
		
			case "M_CA7":
				try {
					repfile = M_CA7_ReportService.getM_CA7Excel(filename, reportId, fromdate, todate, currency, dtltype);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case "M_SIR":
				try {
					repfile = M_SIR_ReportService.getM_SIRExcel(filename, reportId, fromdate, todate, currency, dtltype);
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
	    }else if("M-CA7Detail".equals(filename)) {
	        return M_CA7_ReportService.getM_CA_7DetailExcel(filename, fromdate, todate);
	    }else if("M_SIRDetails".equals(filename)) {
	        return M_SIR_ReportService.getM_SIRDetailExcel(filename, fromdate, todate);
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
			    	//fileData = BRRS_M_IS_reportservice.BRRS_M_ISDetailExcel(filename, fromdate, todate);
			    
			    }
				else if ("MSFinP2Detail".equals(filename)) {
			        fileData = BRRS_M_SFINP2_reportservice.BRRS_M_SFINP2DetailExcel(filename, fromdate, todate);
			    }else if("M_CA_7Details".equals(filename)) {
			    	fileData =  M_CA7_ReportService.getM_CA_7DetailExcel(filename, fromdate, todate);
			    }else if("M_SIRDetails".equals(filename)) {
			    	fileData =  M_SIR_ReportService.getM_SIRDetailExcel(filename, fromdate, todate);
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

