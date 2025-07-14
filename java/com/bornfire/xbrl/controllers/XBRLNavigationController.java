package com.bornfire.xbrl.controllers;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.AccessAndRoles;
import com.bornfire.xbrl.entities.AlertManagementEntity;
import com.bornfire.xbrl.entities.AlertManagementRepository;

import com.bornfire.xbrl.entities.BankMaster;
import com.bornfire.xbrl.entities.CustomRepDownloadRep;
import com.bornfire.xbrl.entities.CustomReportParms;
import com.bornfire.xbrl.entities.CustomReportsParmsRepo;
import com.bornfire.xbrl.entities.FinSolTb;
import com.bornfire.xbrl.entities.FxRiskDataRepository;
import com.bornfire.xbrl.entities.GenRefCodeMast;
import com.bornfire.xbrl.entities.NostroAccBalData;
import com.bornfire.xbrl.entities.UserProfile;
import com.bornfire.xbrl.entities.BRSS.AUDReconOs_Mirror;
import com.bornfire.xbrl.entities.BRSS.CountryRiskParameter;
import com.bornfire.xbrl.entities.BRSS.CountryRiskParameterRep;

import com.bornfire.xbrl.entities.BRSS.RBSReportRepo;
import com.bornfire.xbrl.entities.BRSS.RBSTransactionMasterEntity;
import com.bornfire.xbrl.entities.BRSS.RRReportRepo;
import com.bornfire.xbrl.entities.BRSS.ReportValidations;
import com.bornfire.xbrl.entities.BRSS.ReportValidationsRepo;
import com.bornfire.xbrl.entities.BRSS.T1CurProdServicesRepo;
import com.bornfire.xbrl.entities.BRSS.ValidationResponse;
import com.bornfire.xbrl.entities.AccessandRolesRepository;
import com.bornfire.xbrl.entities.NostroAccBalDataRepository;
import com.bornfire.xbrl.services.AlertManagementServices;



import com.bornfire.xbrl.services.BankServices;
import com.bornfire.xbrl.services.CountryRiskServices;
import com.bornfire.xbrl.services.EtlServices;
import com.bornfire.xbrl.services.GlSubHeadConfigService;
import com.bornfire.xbrl.services.LoginServices;
import com.bornfire.xbrl.services.NostroAccBalDataService;
import com.bornfire.xbrl.services.RBSValidationservices;

import com.bornfire.xbrl.services.ReferenceCodeConfigure;
import com.bornfire.xbrl.services.ReportCodeMappingService;
import com.bornfire.xbrl.services.ReportServices;
import com.bornfire.xbrl.services.ReportServices.ReportTitle;
import com.bornfire.xbrl.services.AccessAndRolesServices;



import net.sf.jasperreports.engine.JRException;

@Controller
@ConfigurationProperties("default")
public class XBRLNavigationController {

	private static final Logger logger = LoggerFactory.getLogger(XBRLNavigationController.class);

	@Autowired
	LoginServices loginServices;

	
	@Autowired
	AccessAndRolesServices AccessRoleService;
	
	@Autowired
	AccessandRolesRepository accessandrolesrepository;
	
	@Autowired
	NostroAccBalDataRepository nostroAccBalRepo;
	
	@Autowired
	NostroAccBalDataService nostroService;

	
	@Autowired
	FxRiskDataRepository friskdataRepo;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	ReportServices reportServices;

	@Autowired
	CountryRiskParameterRep countryRiskParameterRep;

	@Autowired
	ReferenceCodeConfigure referenceCodeConfigure;

	@Autowired
	BankServices bankServices;

	@Autowired
	CountryRiskServices countryRiskServices;

	@Autowired
	ReportCodeMappingService reportCodeMappingService;

	@Autowired
	EtlServices etlServices;

	@Autowired
	GlSubHeadConfigService glSubHeadConfigService;


	@Autowired
	CustomReportsParmsRepo custReportsParmsRepo;

	@Autowired
	CustomReportsParmsRepo customReportsParmsRepo;

	@Autowired
	CustomRepDownloadRep customRepDownloadRep;


	@Autowired
	RBSReportRepo rbsReportlist;

	@Autowired
	RRReportRepo rrReportlist;

//	@Autowired
//	HostDataRepo hostDataRepo;

	

	@Autowired
	ReportValidationsRepo reportValidationsRepo;

	@Autowired
	RBSValidationservices rbsValidationservices;

	@Autowired
	T1CurProdServicesRepo t1CurProdServicesRepo;

	
	@Autowired
	private AlertManagementRepository alertmanagementrepository;

	@Autowired
	AlertManagementServices alertservices;

	
	

	
	private String pagesize;

	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String getdashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		String userid = (String) req.getSession().getAttribute("USERID");
		md.addAttribute("menu", "Dashboard");
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));

		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "Dashboard", method = { RequestMethod.GET, RequestMethod.POST })
	public String dashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		String userid = (String) req.getSession().getAttribute("USERID");

		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "AccessandRoles", method = { RequestMethod.GET, RequestMethod.POST })
	public String IPSAccessandRoles(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("IPSRoleMenu", AccessRoleService.getRoleMenu(roleId));

		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menu", "ACCESS AND ROLES");
			md.addAttribute("menuname", "ACCESS AND ROLES");
			md.addAttribute("formmode", "list");
			md.addAttribute("AccessandRoles", accessandrolesrepository.rulelist());
		} else if (formmode.equals("add")) {
			md.addAttribute("menuname", "ACCESS AND ROLES - ADD");
			md.addAttribute("formmode", "add");
		} else if (formmode.equals("edit")) {
			md.addAttribute("menuname", "ACCESS AND ROLES - EDIT");
			md.addAttribute("formmode", formmode);
			md.addAttribute("IPSAccessRole", AccessRoleService.getRoleId(userid));
		} else if (formmode.equals("view")) {
			md.addAttribute("menuname", "ACCESS AND ROLES - INQUIRY");
			md.addAttribute("formmode", formmode);
			md.addAttribute("IPSAccessRole", AccessRoleService.getRoleId(userid));

		} else if (formmode.equals("verify")) {
			md.addAttribute("menuname", "ACCESS AND ROLES - VERIFY");
			md.addAttribute("formmode", formmode);
			md.addAttribute("IPSAccessRole", AccessRoleService.getRoleId(userid));

		} else if (formmode.equals("delete")) {
			md.addAttribute("menuname", "ACCESS AND ROLES - DELETE");
			md.addAttribute("formmode", formmode);
			md.addAttribute("IPSAccessRole", AccessRoleService.getRoleId(userid));
		}

		md.addAttribute("adminflag", "adminflag");
		md.addAttribute("userprofileflag", "userprofileflag");

		return "AccessandRoles";
	}
	
	@RequestMapping(value = "createAccessRole", method = RequestMethod.POST)
	@ResponseBody
	public String createAccessRoleEn(@RequestParam("formmode") String formmode,
			@RequestParam(value = "adminValue", required = false) String adminValue,
			@RequestParam(value = "BRF_ReportsValue", required = false) String BRF_ReportsValue,
			@RequestParam(value = "Basel_ReportsValue", required = false) String Basel_ReportsValue,
			@RequestParam(value = "ArchivalValue", required = false) String ArchivalValue,
			@RequestParam(value = "Audit_InquiriesValue", required = false) String Audit_InquiriesValue,
			@RequestParam(value = "RBR_ReportsValue", required = false) String RBR_ReportsValue,
			@RequestParam(value = "VAT_LedgerValue", required = false) String VAT_LedgerValue,
			@RequestParam(value = "Invoice_DataValue", required = false) String Invoice_DataValue,
			@RequestParam(value = "finalString", required = false) String finalString,
			
			@ModelAttribute AccessAndRoles alertparam, Model md, HttpServletRequest rq) {

		String userid = (String) rq.getSession().getAttribute("USERID");
		String roleId = (String) rq.getSession().getAttribute("ROLEID");
		md.addAttribute("IPSRoleMenu", AccessRoleService.getRoleMenu(roleId));

		String msg = AccessRoleService.addPARAMETER(alertparam, formmode, adminValue, BRF_ReportsValue, Basel_ReportsValue,
				ArchivalValue, Audit_InquiriesValue,RBR_ReportsValue, VAT_LedgerValue,Invoice_DataValue,finalString, userid);

		return msg;

	}
	

	@RequestMapping(value = "UserProfile", method = { RequestMethod.GET, RequestMethod.POST })
	public String userprofile(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String loginuserid = (String) req.getSession().getAttribute("USERID");
		String WORKCLASSAC = (String) req.getSession().getAttribute("WORKCLASS");
		String ROLEIDAC = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("RuleIDType", accessandrolesrepository.roleidtype());
		
		System.out.println("work class is : "+ WORKCLASSAC);
		// Logging Navigation
		loginServices.SessionLogging("USERPROFILE", "M2", req.getSession().getId(), loginuserid, req.getRemoteAddr(),
				"ACTIVE");
		Session hs1 = sessionFactory.getCurrentSession();
		md.addAttribute("menu", "USER PROFILE"); // To highlight the menu

		if (formmode == null || formmode.equals("list")) {

			md.addAttribute("formmode", "list");// to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("WORKCLASSAC", WORKCLASSAC);
			md.addAttribute("ROLEIDAC", ROLEIDAC);
			md.addAttribute("loginuserid", loginuserid);

			Iterable<UserProfile> user = loginServices.getUsersList();

			md.addAttribute("userProfiles", user);

		} else if (formmode.equals("edit")) {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("userProfile", loginServices.getUser(userid));

		} else if (formmode.equals("verify")) {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("userProfile", loginServices.getUser(userid));

		} else {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("FinUserProfiles", loginServices.getFinUsersList());
			md.addAttribute("userProfile", loginServices.getUser(""));

		}

		return "XBRLUserprofile";
	}

	
	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestParam("formmode") String formmode, @ModelAttribute UserProfile userprofile,
			Model md, HttpServletRequest rq) {
		String MOB = (String) rq.getSession().getAttribute("MOBILENUMBER");
		String ROLE = (String) rq.getSession().getAttribute("ROLEDESC");
		String userid = (String) rq.getSession().getAttribute("USERID");
		String username = (String) rq.getSession().getAttribute("USERNAME");
		String msg = loginServices.addUser(userprofile, formmode, userid, username, MOB, ROLE);

		return msg;

	}
	
	@RequestMapping(value = "Nostro_Account_Bal", method = RequestMethod.GET)
	public String NostroAccountBal(
	        @RequestParam(value = "accountNo", required = false) String accountNo,
	        Model md, HttpServletRequest req) {

	    // Always fetch the list
	    md.addAttribute("branchList", nostroAccBalRepo.getlist());

	    if (accountNo != null && !accountNo.isEmpty()) {
	        NostroAccBalData data = nostroAccBalRepo.findById(accountNo).orElse(null);
	        md.addAttribute("nostroData", data);
	        md.addAttribute("formmode", "edit"); // edit mode if accountNo is passed
	    } else {
	        md.addAttribute("formmode", "list"); // list mode by default
	    }

	    return "Nostro_Account_Bal"; // Your HTML page
	}



	@PostMapping("/updateNostro")
	public String updateNostro(@ModelAttribute NostroAccBalData nostroData, Model model) {
	    System.out.println("came to controller");

	    boolean updated = nostroService.updateNostro(nostroData);

	    if (updated) {
	        model.addAttribute("msg", "Update successful");
	    } else {
	        model.addAttribute("msg", "Record not found for update");
	    }

	    return "Nostro_Account_Bal"; // your view
	    
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}


	@RequestMapping(value = "Fx_Risk_Data", method = RequestMethod.GET)
	public String Fxriskdata(Model md, HttpServletRequest req) {
	
		md.addAttribute("branchList", friskdataRepo.getlist());

		return "Fx_Risk_Data";
	}
	
}
