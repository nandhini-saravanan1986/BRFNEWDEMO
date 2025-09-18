package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.XBRLProceduresRep;
import com.bornfire.xbrl.entities.XBRLReportsMasterRep;

import net.sf.jasperreports.engine.JRException;

@Service
@Transactional
@ConfigurationProperties("output")
public class RegulatoryReportServices {

	private static final Logger logger = LoggerFactory.getLogger(RegulatoryReportServices.class);

	@NotNull
	private String exportpath;

	@Autowired
	XBRLReportsMasterRep xbrlReportsMasterRep;

	@Autowired
	XBRLProceduresRep xbrlProceduresRep;

	@Autowired
	DataSource srcdataSource;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CustomRepGeneratorServices customerrptgenserviceexcel;

	@Autowired
	BRS2_ReportService brs2_ReportService;
	
	@Autowired
	BRS61ReportService brs61ReportService;

	public String getExportpath() {
		return exportpath;
	}

	public void setExportpath(String exportpath) {
		this.exportpath = exportpath;
	}

	public ModelAndView getReportView(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {
		case "BRS2": 
			repsummary = brs2_ReportService.getBRS2_view(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
		
		case "BRS61": 
			repsummary = brs61ReportService.getBRS61View(reportId,  fromdate, todate, currency, dtltype, pageable); 
		    break;
			
			
			}

		return repsummary;
	}
	public ModelAndView getReportSummary(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {



		case "BRS2":
			repsummary = brs2_ReportService.getBRS2_view(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		case "BRS61":
			repsummary = brs61ReportService.getBRS61View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
		
		}

		return repsummary;
	}

	public ModelAndView getReportDetails(String reportId, String instanceCode, String asondate, String fromdate,
			String todate, String currency, String reportingTime, String dtltype, String subreportid, String secid,
			Pageable pageable, String Filter) {

		ModelAndView repdetail = new ModelAndView();
		logger.info("Getting Details for the Report :" + reportId);

		switch (reportId) {


		
		case "BRS2":
			repdetail = brs2_ReportService.getBRS2currentDtl(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;
		case "BRS61":
			repdetail = brs61ReportService.getBRS61Details(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;

		}
		return repdetail;
	}

	public File getDownloadFile(String reportId, String asondate, String fromdate, String todate, String currency,
			String subreportid, String secid, String dtltype, String reportingTime, String filetype,
			String instancecode) throws FileNotFoundException, JRException, SQLException {

		File repfile = null;

		logger.info("Getting Report File for : " + reportId + " in " + filetype + " format");

		switch (reportId) {
		

		case "BRS2":
			repfile = brs2_ReportService.getFileBRS2(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		case "BRS61":
			repfile = brs61ReportService.getFileBRS61(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		


		}

		return repfile;

	}

	public String preCheckReportRBS(String reportid, String fromdate, String todate) {

		String msg = "";

		logger.info("Report precheck : " + reportid);

		switch (reportid) {
		case "BRS2": 
			msg = brs2_ReportService.preCheck(reportid, fromdate, todate);
			break;
		case "BRS61": 
			msg = brs61ReportService.preCheckBRS61(reportid, fromdate, todate);
			break;
		
		default:
			logger.info("default -> preCheck()");
			msg = "Master - need to process";
		}
		return msg;
	}
}
