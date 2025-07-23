package com.bornfire.brf.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.bornfire.brf.services.RegulatoryReportServices;


@Controller
@ConfigurationProperties("default")
@RequestMapping(value = "Reports")
public class CBUAE_BRF_ReportsController {
	
	private static final Logger logger = LoggerFactory.getLogger(CBUAE_BRF_ReportsController.class);
		@Autowired
		RegulatoryReportServices regreportServices;
	
		private String pagesize;
	
		public String getPagesize() {
			return pagesize;
		}
	
		public void setPagesize(String pagesize) {
			this.pagesize = pagesize;
		}
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
		// To show the required report at the first stage
		@RequestMapping(value = "{reportid}", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView reportView(@PathVariable("reportid") String reportid,
				@RequestParam(value = "function", required = false) String function,
				@RequestParam("asondate") String asondate, @RequestParam(required = false) String fromdate,
				@RequestParam("todate") String todate, @RequestParam(value = "currency", required = false) String currency,
				@RequestParam(value = "subreportid", required = false) String subreportid,
				@RequestParam(value = "secid", required = false) String secid,
				@RequestParam(value = "dtltype", required = false) String dtltype,
				@RequestParam(value = "type", required = false) String type,
				@RequestParam(value = "page", required = false) Optional<Integer> page,
				@RequestParam(value = "size", required = false) Optional<Integer> size,
				@RequestParam(value = "reportingTime", required = false) String reportingTime, Model md,
				HttpServletRequest req, BigDecimal srl_no) {

			String userid = (String) req.getSession().getAttribute("USERID");
			String roleid = (String) req.getSession().getAttribute("ROLEID");
			String accesscode = (String) req.getSession().getAttribute("ACCESSCODE");
			

			
			

			int currentPage = page.orElse(0);
			int pageSize = size.orElse(Integer.parseInt(pagesize));
			System.out.println("date"+fromdate);
			// Assigning required Modal Attributes
			md.addAttribute("UserId", userid);
			md.addAttribute("RoleId", roleid);
			md.addAttribute("UserCol", accesscode);
			md.addAttribute("reportid", reportid);
			md.addAttribute("asondate", asondate);
			md.addAttribute("fromdate", fromdate);
			md.addAttribute("todate", todate);
			md.addAttribute("currency", currency);
			md.addAttribute("dtltype", dtltype);
			md.addAttribute("type", type);
			md.addAttribute("reportingTime", reportingTime);
			//md.addAttribute("reportTitle", reportServices.getReportName(reportid));
			
			try {
				asondate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(asondate));
				fromdate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(fromdate));
				todate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(todate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		
			ModelAndView mv = new ModelAndView();

			mv = regreportServices.getReportView(reportid, asondate, fromdate, todate, currency, dtltype, subreportid,
					secid, reportingTime, PageRequest.of(currentPage, pageSize), srl_no, userid);

			return mv;

		}
		
		@RequestMapping(value = "{reportid}/Details", method = RequestMethod.GET)
		public ModelAndView reportDetail(@PathVariable("reportid") String reportid,
				@RequestParam(value = "instancecode", required = false) String instancecode,
				@RequestParam(value = "filter", required = false) String filter, @RequestParam("asondate") String asondate,
				@RequestParam("fromdate") String fromdate, @RequestParam("todate") String todate,
				@RequestParam("currency") String currency,
				@RequestParam(value = "subreportid", required = false) String subreportid,
				@RequestParam(value = "secid", required = false) String secid,
				@RequestParam(value = "dtltype", required = false) String dtltype,
				@RequestParam(value = "page", required = false) Optional<Integer> page,
				@RequestParam(value = "size", required = false) Optional<Integer> size,
				@RequestParam(value = "reportingTime", required = false) String reportingTime, Model md) {

			

			
			md.addAttribute("reportid", reportid);
			md.addAttribute("asondate", asondate);
			md.addAttribute("fromdate", fromdate);
			md.addAttribute("todate", todate);
			md.addAttribute("filter", filter);
			md.addAttribute("currency", currency);
			md.addAttribute("dtltype", dtltype);
			md.addAttribute("reportingTime", reportingTime);
			// md.addAttribute("instancecode", Integer.parseInt(instancecode));
			//md.addAttribute("reportTitle", reportServices.getReportName(reportid));
			md.addAttribute("displaymode", "detail");

			int currentPage = page.orElse(0);
			int pageSize = size.orElse(Integer.parseInt(pagesize));
			try {
				asondate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(asondate));
				fromdate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(fromdate));
				todate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(todate));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			//logger.info("Getting ModelandView :" + reportid);
			ModelAndView mv = regreportServices.getReportDetails(reportid, instancecode, asondate, fromdate, todate,
					currency, reportingTime, dtltype, subreportid, secid, PageRequest.of(currentPage, pageSize), filter);

			return mv;
		}
		
		@RequestMapping(value = "downloadExcel", method = { RequestMethod.GET, RequestMethod.POST })
		@ResponseBody
		public ResponseEntity<ByteArrayResource> BRFDownload(HttpServletResponse response,
		        @RequestParam("reportid") String reportid,
		        @RequestParam("asondate") String asondate,
		        @RequestParam("fromdate") String fromdate,
		        @RequestParam("todate") String todate,
		        @RequestParam("currency") String currency,
		        @RequestParam(value = "subreportid", required = false) String subreportid,
		        @RequestParam(value = "secid", required = false) String secid,
		        @RequestParam(value = "dtltype", required = false) String dtltype,
		        @RequestParam(value = "reportingTime", required = false) String reportingTime,
		        @RequestParam(value = "filename", required = false) String filename,
		        @RequestParam(value = "instancecode", required = false) String instancecode,
		        @RequestParam(value = "filter", required = false) String filter)
		        throws SQLException, FileNotFoundException {
		    
		    response.setContentType("application/octet-stream");
		    try {
				asondate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(asondate));
				fromdate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(fromdate));
				todate = dateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse(todate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		    try {
		        byte[] excelData = regreportServices.getDownloadFile(reportid, filename, asondate, fromdate, todate, currency,
		                subreportid, secid, dtltype, reportingTime, instancecode, filter);

		        if (excelData.length == 0) {
		            logger.warn("Controller: Service returned no data. Responding with 204 No Content.");
		            return ResponseEntity.noContent().build();
		        }

		        ByteArrayResource resource = new ByteArrayResource(excelData);

		        HttpHeaders headers = new HttpHeaders();
		        filename = filename + ".xls";
		        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename);

		        logger.info("Controller: Sending file '{}' to client ({} bytes).", filename, excelData.length);
		        return ResponseEntity.ok()
		                .headers(headers)
		                .contentLength(excelData.length)
		                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
		                .body(resource);

		    } catch (Exception e) {
		        logger.error("Controller ERROR: A critical error occurred during file generation.", e);
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		    }
		}

		@RequestMapping(value = "downloadDetailExcel", method = RequestMethod.GET)
		@ResponseBody
		public ResponseEntity<ByteArrayResource> downloadDetailExcel(@RequestParam("filename") String filename,
				@RequestParam("fromdate") String fromdate, @RequestParam("todate") String todate) {

			try {
				System.out.println("came to controller");
				byte[] data = regreportServices.getDownloadDetailFile(filename, fromdate, todate);

				if (data == null || data.length == 0) {
					return ResponseEntity.noContent().build();
				}

				ByteArrayResource resource = new ByteArrayResource(data);

				HttpHeaders headers = new HttpHeaders();
				headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename + ".xls");

				return ResponseEntity.ok().headers(headers).contentLength(data.length)
						.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(resource);

			} catch (Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
}
