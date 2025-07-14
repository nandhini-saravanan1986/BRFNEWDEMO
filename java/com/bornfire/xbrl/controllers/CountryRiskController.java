package com.bornfire.xbrl.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bornfire.xbrl.entities.BRSS.CountryRiskParameter;
import com.bornfire.xbrl.services.CountryRiskServices;

@Controller
public class CountryRiskController {
	
	@Autowired
	CountryRiskServices countryRiskRepServices;

	@RequestMapping(value = "editCountryParameter", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasteredit(@ModelAttribute("singledetails") CountryRiskParameter details,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return countryRiskRepServices.detailChanges(details, 'E', userid);
		
	}
	
	
	
	@RequestMapping(value = "addcountryriskparameter", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterAdd(@ModelAttribute("singledetails") CountryRiskParameter details,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return countryRiskRepServices.detailChanges(details, 'A',userid);
		
	}
	
	
	@RequestMapping(value = "deleteCountryriskParameter", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterDelete(@ModelAttribute("singledetails") CountryRiskParameter details,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return countryRiskRepServices.detailChanges(details, 'D',userid);
		
	}
	
	
	/*
	 * @RequestMapping(value = "searchCountryriskParameter", method = {
	 * RequestMethod.GET }) public List<CountryRiskParameter>
	 * getRequestCountryRiskParameter(@RequestParam(value="instanceCode")String
	 * instanceCode,
	 * 
	 * @RequestParam(value="countryName")String countryName,
	 * 
	 * @RequestParam(value="internalAMLRating")String internalAMLRating,
	 * 
	 * @RequestParam(value="correspondingRating")String correspondingRating,
	 * 
	 * @RequestParam(value="noCorrespondingBank")String noCorrespondingBank,
	 * 
	 * @RequestParam(value="countryCode")String countryCode ) {
	 * 
	 * System.out.println("getRequestConsultationDocList");
	 * 
	 * List<CountryRiskParameter>
	 * namelist=countryRiskRepServices.getRequestCountryRiskParameter(countryName,
	 * instanceCode, internalAMLRating, correspondingRating, noCorrespondingBank,
	 * countryCode);
	 * 
	 * return namelist; }
	 */

/*	@RequestMapping(value = "searchCountryriskParameter", method = RequestMethod.POST)
	public ModelAndView searchCountryriskParameter( Model md,
			@ModelAttribute("singledetails") CountryRiskParameter details,
			HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {

		logger.info("CountryRiskServices-->>getCountryRiskPara()");
		int currentPage = page.orElse(0);
		int pageSize = size.orElse(1);
		md.addAttribute("menu", "bankdata");
		md.addAttribute("displaymode", "detail");
		ModelAndView mv = countryRiskRepServices.getCountryRiskPara(details,PageRequest.of(currentPage, pageSize));

		return mv;

	}  */
	

}
