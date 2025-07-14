package com.bornfire.xbrl.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.BRSS.BRBS_CONTACT_DETAILS_ENTITY;
import com.bornfire.xbrl.entities.glsubhead.GlSubHeadMeta;
import com.bornfire.xbrl.services.GlSubHeadConfigService;

import net.sf.jasperreports.engine.JRException;

@Controller
public class XBRLGlSubHeadController {
	
	private static final Logger logger = LoggerFactory.getLogger(XBRLGlSubHeadController.class);
	
	@Autowired
	GlSubHeadConfigService glSubHeadConfigService;
	
	private String pagesize;

	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	
	@RequestMapping(value = "glsubheadsearch", method = RequestMethod.POST)
	public ModelAndView glSubHeadSearch( Model md,
			@ModelAttribute("singledetail") GlSubHeadMeta glSubHeadMeta,
			HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {

		logger.info("XBRLGlSubHeadController -> glSubHeadSearch");
		int currentPage = page.orElse(0);
		int pageSize = size.orElse(1);
		
		
		md.addAttribute("menu", "GlSubHead");
		md.addAttribute("displaymode", "detail");
		ModelAndView mv = glSubHeadConfigService.getGlSubHead(glSubHeadMeta,PageRequest.of(currentPage, pageSize));

		return mv;

	}
	
	@RequestMapping(value = "glsubheadadd", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterAdd(@ModelAttribute("singledetail") GlSubHeadMeta glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.detailChanges(glSubHeadMeta, 'A',userid);
		
	}
	
	@RequestMapping(value = "glsubheadedit", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasteredit(@ModelAttribute("singledetail") GlSubHeadMeta glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.detailChanges(glSubHeadMeta, 'E', userid);
		
	}
	
	@RequestMapping(value = "rbscontactadd", method = RequestMethod.POST)
	@ResponseBody
	public String rbscontactADD(@ModelAttribute("singledetail") BRBS_CONTACT_DETAILS_ENTITY glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.RBSdetailChanges(glSubHeadMeta, 'A',userid);
		
	}
	
	@RequestMapping(value = "rbscontactedit", method = RequestMethod.POST)
	@ResponseBody
	public String rbscontactedit(@ModelAttribute("singledetail") BRBS_CONTACT_DETAILS_ENTITY glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.RBSdetailChanges(glSubHeadMeta, 'E', userid);
		
	}
	@RequestMapping(value = "rbscontactdelete", method = RequestMethod.POST)
	@ResponseBody
	public String rbscontactDelete(@ModelAttribute("singledetail") BRBS_CONTACT_DETAILS_ENTITY glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.RBSdetailChanges(glSubHeadMeta, 'D',userid);
		
	}
	
	@RequestMapping(value = "glsubheaddelete", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterDelete(@ModelAttribute("singledetail") GlSubHeadMeta glSubHeadMeta,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return glSubHeadConfigService.detailChanges(glSubHeadMeta, 'D',userid);
		
	}
	
	@RequestMapping(value = "glsubheaddownload", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource glSubHeadDownload(HttpServletResponse response, 
												@RequestParam("filetype") String filetype) 
														throws IOException, SQLException {
		response.setContentType("application/octet-stream");

		InputStreamResource resource = null;
		try {
			logger.info("Getting download File :"+"glSubHeadConfig"+", FileType :"+filetype);
		//	System.out.println(asondate);
			File repfile = glSubHeadConfigService.getFile(filetype);
			
			
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (JRException e) {
			e.printStackTrace();
		}
		return resource;
	}

}
