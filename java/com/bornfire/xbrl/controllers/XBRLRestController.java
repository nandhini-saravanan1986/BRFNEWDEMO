package com.bornfire.xbrl.controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bornfire.xbrl.entities.FinUserProfile;
import com.bornfire.xbrl.entities.GenRefCodeMast;
import com.bornfire.xbrl.entities.XBRLAudit;
import com.bornfire.xbrl.entities.XBRLProceduresRep;
import com.bornfire.xbrl.entities.XBRLSession;
import com.bornfire.xbrl.services.LoginServices;
import com.bornfire.xbrl.services.ReferenceCodeConfigure;
import com.bornfire.xbrl.services.ReportCodeMappingService;
import com.bornfire.xbrl.services.ReportServices;

@RestController
public class XBRLRestController {

	private static final Logger logger = LoggerFactory.getLogger(XBRLRestController.class);

	@Autowired
	ReferenceCodeConfigure referenceCodeConfigure;

	@Autowired
	XBRLProceduresRep xbrlProceduresRep;

	@Autowired
	ReportServices reportServices;

	@Autowired
	LoginServices loginServices;

	@Autowired
	ReportCodeMappingService reportCodeMappingService;



	

	@RequestMapping(value = "ReferenceCode/{refCodeView}", method = RequestMethod.GET)
	public List<GenRefCodeMast> refcode(@PathVariable("refCodeView") String refCodeView, Model md) {

		return referenceCodeConfigure.genRefCodeView(refCodeView);
	}

	@RequestMapping(value = "ReferenceCode/refEdit", method = RequestMethod.POST)
	public int refEdit(@RequestParam String refCode, @RequestParam String refType, @RequestParam String oldSourceCode,
			@RequestParam String newSourceCode, Model md) {

		return referenceCodeConfigure.refEdit(refCode, refType, oldSourceCode, newSourceCode);
	}

	@RequestMapping(value = "ReferenceCode/refAdd", method = RequestMethod.POST)
	public int refAdd(@RequestParam String refCode, @RequestParam String refType, @RequestParam String SourceCode,
			Model md) {

		return referenceCodeConfigure.refAdd(refCode, refType, SourceCode);
	}

	@RequestMapping(value = "ReferenceCode/refDelete", method = RequestMethod.POST)
	public int refDelete(@RequestParam String refCode, @RequestParam String refType, @RequestParam String SourceCode,
			Model md) {

		return referenceCodeConfigure.refDelete(refCode, refType, SourceCode);
	}

	@RequestMapping(value = "userlogList", method = RequestMethod.GET)
	public List<XBRLSession> userLogList(@RequestParam String fromdate, @RequestParam String todate) {

		Date fromdate2 = null;
		Date todate2 = null;

		try {
			fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginServices.getUserLog(fromdate2, todate2);

	}

	@RequestMapping(value = "auditList", method = RequestMethod.GET)
	public List<XBRLAudit> auditList(@RequestParam String fromdate, @RequestParam String todate) {

		Date fromdate2 = null;
		Date todate2 = null;

		try {

			fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return reportServices.getAuditLog(fromdate2, todate2);

	}

	@RequestMapping(value = "GetFinUserList")
	public List<FinUserProfile> getFinUsersList() {

		return loginServices.getFinUsersList();
	}




	@PostMapping(value = "etlRun")
	public String etlRun(@RequestParam String reportdate) {

		String status = "";
		try {

			xbrlProceduresRep.etlProcess(reportdate);
			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return status;
	}
	@PostMapping(value = "validAmtBOM")
	public BigDecimal validAmtBOM(@RequestParam String message1, @RequestParam String message11) {

		String status = "";
		BigDecimal M1 = null;
		try {
			String[] args1 = message1.split("/");
			String[] args11 = message11.split("/");
			System.out.println(args1);
			// for (int i = 0; i < args1.length; i++) {
if(args1.length != 0) {
			logger.info("1length" + args1.length);
			if (args1.length == 1) {

				String dd = args1[0].replaceAll(",", "");
				String dd1T = args11[0].replaceAll(",", "");
				if (dd1T.equals("2C")) {

					M1 = new BigDecimal(dd);
					System.out.println("M1-C" + M1);

				} else if (dd1T.equals("1D")) {

					M1 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M1-D" + M1);
				}
			}

			if (args1.length == 2) {
				System.out.println("length.inside");

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				
				
				
				
				M1 = Mdd0T.add(Mdd1T);

				System.out.println("M1" + M1);
			}

			if (args1.length == 3) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M1 = ddM1.add(Mdd2T);
				System.out.println("M1" + M1);
			}

			if (args1.length == 4) {

				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				
				
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M1 = ddM1.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 5) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = ddM1.add(Mdd4T);
				M1 = ddM3.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 6) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				M1 = ddM3.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 7) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("2C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("1D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M1 = ddM5.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("2C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("1D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("2C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("1D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM4.add(ddM3);
				M1 = ddM5.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("2C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("1D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("2C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("1D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("2C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("1D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);

				M1 = ddM7.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 10) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("2C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("1D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("2C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("1D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("2C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("1D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("2C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("1D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM6.add(ddM5);

				M1 = ddM7.add(ddM8);
				System.out.println("M1" + M1);
			}
			if (args1.length == 11) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				BigDecimal Mdd10T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				String dd10 = args1[10].replaceAll(",", "");
				String dd10T=args11[10].replaceAll(",", "");
				
				if (dd0T.equals("2C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("1D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("2C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("1D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("2C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("1D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("2C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("1D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("2C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("1D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("2C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("1D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("2C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("1D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("2C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("1D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("2C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("1D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("2C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("1D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				if (dd10T.equals("2C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("1D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = Mdd10T.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM2);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM7.add(ddM6);

				M1 = ddM9.add(ddM8);
				System.out.println("M1" + M1);
			}
}else {
	
	M1 = new BigDecimal(0);
}

			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M1;
	}

	@PostMapping(value = "validAmtBOMFIN")
	public BigDecimal validAmtBOMFIN(@RequestParam String message2, @RequestParam String message22) {

		String status = "";
		BigDecimal M2 = null;
		try {

			String[] args2 = message2.split("/");
			System.out.println(args2);
			String[] args22 = message22.split("/");
			// for (int i = 0; i < args1.length; i++) {

			logger.info("2length" + args2.length);
			if (args2.length == 1) {

				String dd = args2[0].replaceAll(",", "");
				String dd1T = args22[0].replaceAll(",", "");
				System.out.println(dd);
				System.out.println("dd1T" + dd1T);

				if (dd1T.equals("C")) {

					M2 = new BigDecimal(dd);
					System.out.println("M2-C" + M2);

				} else if (dd1T.equals("D")) {

					M2 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M2-D" + M2);
				}

			}

			if (args2.length == 2) {

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}

				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);

				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}

				M2 = Mdd0T.add(Mdd1T);

				System.out.println("M2" + M2);

			}

			if (args2.length == 3) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				
				
				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);
				
				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				
				
				
				String dd2 = args2[2].replaceAll(",", "");
				System.out.println("dd2" + dd2);
				
				String dd2T = args22[2].replaceAll(",", "");
				System.out.println("dd2T" + dd2T);
				
				
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M2 = ddM1.add(Mdd2T);
				System.out.println("M2" + M2);
			}

			if (args2.length == 4) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T= args22[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M2 = ddM1.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 5) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(ddM1);
				M2 = ddM3.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 6) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				BigDecimal ddM5 = ddM3;
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 7) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
			
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				
				String dd5T = args22[5].replaceAll(",", "");
				
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM3.add(ddM4);
				M2 = ddM5.add(ddM6);
				System.out.println("M2" + M2);
			}

if (args2.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(ddM1);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);
				M2 = ddM7.add(ddM6);
				System.out.println("M2" + M2);
			}
			
			if (args2.length == 10) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				BigDecimal Mdd9T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = ddM1.add(ddM2);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM6.add(ddM5);
				M2 = ddM7.add(ddM8);
				System.out.println("M2" + M2);
			}
			
			
			
			
					if (args2.length == 11) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				BigDecimal Mdd9T = null;
				
				BigDecimal Mdd10T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T = args22[10].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = ddM1.add(Mdd10T);
				BigDecimal ddM7 = ddM3.add(ddM2);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM7.add(ddM6);
				M2 = ddM9.add(ddM8);
				System.out.println("M2" + M2);
			}
			
			
			
			
				if (args2.length == 12) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				BigDecimal Mdd9T = null;
				
				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T = args22[10].replaceAll(",", "");
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd10T.equals("D")) {

					Mdd11T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd11T.add(Mdd10T);
				BigDecimal ddM7 = ddM1.add(ddM2);
				BigDecimal ddM8 = ddM4.add(ddM3);
				BigDecimal ddM9 = ddM5.add(ddM6);
				BigDecimal ddM10 = ddM7.add(ddM8);
				M2 = ddM9.add(ddM10);
				System.out.println("M2" + M2);
			}
			
			if (args2.length == 13) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(ddM1);
				BigDecimal ddM8 = ddM2.add(ddM3);
				BigDecimal ddM9 = ddM4.add(ddM5);
				BigDecimal ddM10 = ddM6.add(ddM7);
				BigDecimal ddM11 = ddM9.add(ddM8);
				
				M2 = ddM11.add(ddM10);
				System.out.println("M2" + M2);
			}

			if (args2.length == 14) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = ddM2.add(ddM1);
				BigDecimal ddM9 = ddM4.add(ddM3);
				BigDecimal ddM10 = ddM6.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM8);
				BigDecimal ddM12 = ddM9.add(ddM10);
				
				M2 = ddM11.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 15) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(ddM1);
				BigDecimal ddM9 = ddM2.add(ddM3);
				BigDecimal ddM10 = ddM4.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM6);
				BigDecimal ddM12 = ddM9.add(ddM8);
				BigDecimal ddM13 = ddM11.add(ddM10);
				
				M2 = ddM13.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 16) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = ddM2.add(ddM1);
				BigDecimal ddM10 = ddM4.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM6);
				BigDecimal ddM12 = ddM7.add(ddM8);
				BigDecimal ddM13 = ddM9.add(ddM10);
				BigDecimal ddM14 = ddM11.add(ddM12);
				
				M2 = ddM13.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 17) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(ddM1);
				BigDecimal ddM10 = ddM2.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM4);
				BigDecimal ddM12 = ddM7.add(ddM6);
				BigDecimal ddM13 = ddM9.add(ddM8);
				BigDecimal ddM14 = ddM11.add(ddM10);
				BigDecimal ddM15 = ddM13.add(ddM12);
				
				
				
				M2 = ddM15.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 18) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = ddM2.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM4);
				BigDecimal ddM12 = ddM5.add(ddM6);
				BigDecimal ddM13 = ddM7.add(ddM8);
				BigDecimal ddM14 = ddM9.add(ddM10);
				BigDecimal ddM15 = ddM11.add(ddM12);
				BigDecimal ddM16 = ddM13.add(ddM14);
				
				M2 = ddM15.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 19) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM2);
				BigDecimal ddM12 = ddM5.add(ddM4);
				BigDecimal ddM13 = ddM7.add(ddM6);
				BigDecimal ddM14 = ddM9.add(ddM8);
				BigDecimal ddM15 = ddM11.add(ddM10);
				BigDecimal ddM16 = ddM13.add(ddM12);
				BigDecimal ddM17 = ddM15.add(ddM14);
			
				M2 = ddM17.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 20) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				
				BigDecimal Mdd19T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				String dd19 = args2[19].replaceAll(",", "");
				String dd19T = args22[19].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd19T.equals("C")) {

					Mdd19T = new BigDecimal(dd19);

				} else if (dd19T.equals("D")) {

					Mdd19T = new BigDecimal(dd19).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(Mdd19T);
				BigDecimal ddM11 = ddM1.add(ddM2);
				BigDecimal ddM12 = ddM3.add(ddM4);
				BigDecimal ddM13 = ddM5.add(ddM6);
				BigDecimal ddM14 = ddM7.add(ddM8);
				BigDecimal ddM15 = ddM9.add(ddM10);
				BigDecimal ddM16 = ddM11.add(ddM12);
				BigDecimal ddM17 = ddM13.add(ddM14);
				BigDecimal ddM18 = ddM15.add(ddM16);
				M2 = ddM17.add(ddM18);
				System.out.println("M2" + M2);
			}

			if (args2.length == 21) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 22) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 23) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 24) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 25) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 26) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}
			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M2;
	}









	
	@PostMapping(value = "validAmtINTAUD")
	public BigDecimal validAmtINTAUD(@RequestParam String message1, @RequestParam String message11) {

		String status = "";
		BigDecimal M1 = null;
		try {
			String[] args1 = message1.split("/");
			String[] args11 = message11.split("/");
			System.out.println(args1);
			// for (int i = 0; i < args1.length; i++) {

			logger.info("1length" + args1.length);
			if (args1.length == 1) {

				String dd = args1[0].replaceAll(",", "");
				String dd1T = args11[0].replaceAll(",", "");
				if (dd1T.equals("1")) {

					M1 = new BigDecimal(dd);
					System.out.println("M1-C" + M1);

				} else if (dd1T.equals("-1")) {

					M1 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M1-D" + M1);
				}
			}

			if (args1.length == 2) {
				System.out.println("length.inside");

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				
				
				
				
				M1 = Mdd0T.add(Mdd1T);

				System.out.println("M1" + M1);
			}

			if (args1.length == 3) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M1 = ddM1.add(Mdd2T);
				System.out.println("M1" + M1);
			}

			if (args1.length == 4) {

				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				
				
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M1 = ddM1.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 5) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = ddM1.add(Mdd4T);
				M1 = ddM3.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 6) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				M1 = ddM3.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 7) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M1 = ddM5.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("1")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("-1")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM4.add(ddM3);
				M1 = ddM5.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("1")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("-1")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("1")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("-1")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);

				M1 = ddM7.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 10) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("1")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("-1")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("1")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("-1")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("1")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("-1")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM6.add(ddM5);

				M1 = ddM7.add(ddM8);
				System.out.println("M1" + M1);
			}
			if (args1.length == 11) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				BigDecimal Mdd10T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				String dd10 = args1[10].replaceAll(",", "");
				String dd10T=args11[10].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("1")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("-1")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("1")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("-1")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("1")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("-1")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				if (dd10T.equals("1")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("-1")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = Mdd10T.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM2);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM7.add(ddM6);

				M1 = ddM9.add(ddM8);
				System.out.println("M1" + M1);
			}

			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M1;
	}

	@PostMapping(value = "validAmtINTAUDFIN")
	public BigDecimal validAmtINTAUDFIN(@RequestParam String message2, @RequestParam String message22) {

		String status = "";
		BigDecimal M2 = null;
		try {

			String[] args2 = message2.split("/");
			System.out.println(args2);
			String[] args22 = message22.split("/");
			// for (int i = 0; i < args1.length; i++) {
			if (args2.length !=  0) {
			logger.info("2length" + args2.length);
			if (args2.length == 1) {

				String dd = args2[0].replaceAll(",", "");
				String dd1T = args22[0].replaceAll(",", "");
				System.out.println(dd);
				System.out.println("dd1T" + dd1T);

				if (dd1T.equals("C")) {

					M2 = new BigDecimal(dd);
					System.out.println("M2-C" + M2);

				} else if (dd1T.equals("D")) {

					M2 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M2-D" + M2);
				}

			}

			if (args2.length == 2) {

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}

				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);

				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}

				M2 = Mdd0T.add(Mdd1T);

				System.out.println("M2" + M2);

			}

			if (args2.length == 3) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				
				
				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);
				
				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				
				
				
				String dd2 = args2[2].replaceAll(",", "");
				System.out.println("dd2" + dd2);
				
				String dd2T = args22[2].replaceAll(",", "");
				System.out.println("dd2T" + dd2T);
				
				
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M2 = ddM1.add(Mdd2T);
				System.out.println("M2" + M2);
			}

			if (args2.length == 4) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T= args22[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M2 = ddM1.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 5) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(ddM1);
				M2 = ddM3.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 6) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM4);
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 7) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
			
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				
				String dd5T = args22[5].replaceAll(",", "");
				
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM3.add(ddM4);
				M2 = ddM5.add(ddM6);
				System.out.println("M2" + M2);
			}

			if (args2.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(ddM1);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);
				M2 = ddM7.add(ddM6);
				System.out.println("M2" + M2);
			}

			if (args2.length == 10) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = ddM1.add(ddM2);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM5.add(ddM6);

				M2 = ddM7.add(ddM8);
				System.out.println("M2" + M2);
			}

			if (args2.length == 11) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args2[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T = args22[10].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(ddM1);
				BigDecimal ddM7 = ddM2.add(ddM3);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM6.add(ddM7);

				M2 = ddM9.add(ddM8);
				System.out.println("M2" + M2);
			}

			if (args2.length == 12) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = ddM2.add(ddM1);
				BigDecimal ddM8 = ddM4.add(ddM3);
				BigDecimal ddM9 = ddM6.add(ddM5);
				BigDecimal ddM10 = ddM8.add(ddM7);
				

				M2 = ddM9.add(ddM10);
				System.out.println("M2" + M2);
			}

			if (args2.length == 13) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(ddM1);
				BigDecimal ddM8 = ddM2.add(ddM3);
				BigDecimal ddM9 = ddM4.add(ddM5);
				BigDecimal ddM10 = ddM6.add(ddM7);
				BigDecimal ddM11 = ddM9.add(ddM8);
				
				M2 = ddM11.add(ddM10);
				System.out.println("M2" + M2);
			}

			if (args2.length == 14) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = ddM2.add(ddM1);
				BigDecimal ddM9 = ddM4.add(ddM3);
				BigDecimal ddM10 = ddM6.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM8);
				BigDecimal ddM12 = ddM9.add(ddM10);
				
				M2 = ddM11.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 15) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(ddM1);
				BigDecimal ddM9 = ddM2.add(ddM3);
				BigDecimal ddM10 = ddM4.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM6);
				BigDecimal ddM12 = ddM9.add(ddM8);
				BigDecimal ddM13 = ddM11.add(ddM10);
				
				M2 = ddM13.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 16) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = ddM2.add(ddM1);
				BigDecimal ddM10 = ddM4.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM6);
				BigDecimal ddM12 = ddM7.add(ddM8);
				BigDecimal ddM13 = ddM9.add(ddM10);
				BigDecimal ddM14 = ddM11.add(ddM12);
				
				M2 = ddM13.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 17) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(ddM1);
				BigDecimal ddM10 = ddM2.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM4);
				BigDecimal ddM12 = ddM7.add(ddM6);
				BigDecimal ddM13 = ddM9.add(ddM8);
				BigDecimal ddM14 = ddM11.add(ddM10);
				BigDecimal ddM15 = ddM13.add(ddM12);
				
				
				
				M2 = ddM15.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 18) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = ddM2.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM4);
				BigDecimal ddM12 = ddM5.add(ddM6);
				BigDecimal ddM13 = ddM7.add(ddM8);
				BigDecimal ddM14 = ddM9.add(ddM10);
				BigDecimal ddM15 = ddM11.add(ddM12);
				BigDecimal ddM16 = ddM13.add(ddM14);
				
				M2 = ddM15.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 19) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM2);
				BigDecimal ddM12 = ddM5.add(ddM4);
				BigDecimal ddM13 = ddM7.add(ddM6);
				BigDecimal ddM14 = ddM9.add(ddM8);
				BigDecimal ddM15 = ddM11.add(ddM10);
				BigDecimal ddM16 = ddM13.add(ddM12);
				BigDecimal ddM17 = ddM15.add(ddM14);
			
				M2 = ddM17.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 20) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				
				BigDecimal Mdd19T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				String dd19 = args2[19].replaceAll(",", "");
				String dd19T = args22[19].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd19T.equals("C")) {

					Mdd19T = new BigDecimal(dd19);

				} else if (dd19T.equals("D")) {

					Mdd19T = new BigDecimal(dd19).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(Mdd19T);
				BigDecimal ddM11 = ddM1.add(ddM2);
				BigDecimal ddM12 = ddM3.add(ddM4);
				BigDecimal ddM13 = ddM5.add(ddM6);
				BigDecimal ddM14 = ddM7.add(ddM8);
				BigDecimal ddM15 = ddM9.add(ddM10);
				BigDecimal ddM16 = ddM11.add(ddM12);
				BigDecimal ddM17 = ddM13.add(ddM14);
				BigDecimal ddM18 = ddM15.add(ddM16);
				M2 = ddM17.add(ddM18);
				System.out.println("M2" + M2);
			}

			if (args2.length == 21) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 22) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 23) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 24) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 25) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 26) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}
			}else {
				
				M2 = new BigDecimal(0);
			}
			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M2;
	}
	
	


	@PostMapping(value = "validAmtVISAACQ")
	public BigDecimal validAmtVISAACQ(@RequestParam String message1, @RequestParam String message11) {

		String status = "";
		BigDecimal M1 = null;
		try {
			String[] args1 = message1.split("/");
			String[] args11 = message11.split("/");
			System.out.println(args1);
			// for (int i = 0; i < args1.length; i++) {

			logger.info("1length" + args1.length);
			if (args1.length == 1) {

				String dd = args1[0].replaceAll(",", "");
				String dd1T = args11[0].replaceAll(",", "");
				if (dd1T.equals("DR")) {

					M1 = new BigDecimal(dd);
					System.out.println("M1-C" + M1);

				} else if (dd1T.equals("CR")) {

					M1 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M1-D" + M1);
				}
			}

			if (args1.length == 2) {
				System.out.println("length.inside");

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				
				
				
				
				M1 = Mdd0T.add(Mdd1T);

				System.out.println("M1" + M1);
			}

			if (args1.length == 3) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M1 = ddM1.add(Mdd2T);
				System.out.println("M1" + M1);
			}

			if (args1.length == 4) {

				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				
				
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M1 = ddM1.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 5) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = ddM1.add(Mdd4T);
				M1 = ddM3.add(ddM2);
				System.out.println("M1" + M1);
			}

			if (args1.length == 6) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("DR")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("CR")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				M1 = ddM3.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 7) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("DR")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("CR")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("DR")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("CR")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M1 = ddM5.add(ddM4);
				System.out.println("M1" + M1);
			}
			if (args1.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("DR")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("CR")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("DR")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("CR")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("DR")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("CR")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM4.add(ddM3);
				M1 = ddM5.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("DR")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("CR")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("DR")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("CR")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("DR")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("CR")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("DR")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("CR")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);

				M1 = ddM7.add(ddM6);
				System.out.println("M1" + M1);
			}
			if (args1.length == 10) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				
				if (dd0T.equals("DR")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("CR")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("DR")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("CR")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("DR")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("CR")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("DR")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("CR")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("DR")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("CR")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("DR")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("CR")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("DR")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("CR")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("DR")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("CR")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("DR")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("CR")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("DR")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("CR")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = ddM2.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM6.add(ddM5);

				M1 = ddM7.add(ddM8);
				System.out.println("M1" + M1);
			}
			if (args1.length == 11) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;
				
				BigDecimal Mdd10T = null;
				
				
				String dd0 = args1[0].replaceAll(",", "");
				String dd0T = args11[0].replaceAll(",", "");
				String dd1 = args1[1].replaceAll(",", "");
				String dd1T = args11[1].replaceAll(",", "");
				String dd2 = args1[2].replaceAll(",", "");
				String dd2T = args11[2].replaceAll(",", "");
				String dd3 = args1[3].replaceAll(",", "");
				String dd3T = args11[3].replaceAll(",", "");
				String dd4 = args1[4].replaceAll(",", "");
				String dd4T = args11[4].replaceAll(",", "");
				String dd5 = args1[5].replaceAll(",", "");
				String dd5T = args11[5].replaceAll(",", "");
				String dd6 = args1[6].replaceAll(",", "");
				String dd6T = args11[6].replaceAll(",", "");
				String dd7 = args1[7].replaceAll(",", "");
				String dd7T = args11[7].replaceAll(",", "");
				String dd8 = args1[8].replaceAll(",", "");
				String dd8T = args11[8].replaceAll(",", "");
				String dd9 = args1[9].replaceAll(",", "");
				String dd9T = args11[9].replaceAll(",", "");
				String dd10 = args1[10].replaceAll(",", "");
				String dd10T=args11[10].replaceAll(",", "");
				
				if (dd0T.equals("1")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("-1")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("1")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("-1")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("1")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("-1")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				if (dd3T.equals("1")) {

					Mdd3T = new BigDecimal(dd3);

				} else if (dd3T.equals("-1")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("1")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("-1")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				if (dd5T.equals("1")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("-1")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

				}
				
				if (dd6T.equals("1")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("-1")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

				}
				
				if (dd7T.equals("1")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("-1")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

				}
				
				if (dd8T.equals("1")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("-1")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

				}
				
				
				if (dd9T.equals("1")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("-1")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

				}
				
				if (dd10T.equals("1")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("-1")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd5T.add(Mdd4T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd9T.add(Mdd8T);
				BigDecimal ddM6 = Mdd10T.add(ddM1);
				BigDecimal ddM7 = ddM3.add(ddM2);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM7.add(ddM6);

				M1 = ddM9.add(ddM8);
				System.out.println("M1" + M1);
			}

			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M1;
	}

	@PostMapping(value = "validAmtVISAACQFIN")
	public BigDecimal validAmtVISAACQFIN(@RequestParam String message2, @RequestParam String message22) {

		String status = "";
		BigDecimal M2 = null;
		try {

			String[] args2 = message2.split("/");
			System.out.println(args2);
			String[] args22 = message22.split("/");
			// for (int i = 0; i < args1.length; i++) {

			logger.info("2length" + args2.length);
			if (args2.length == 1) {

				String dd = args2[0].replaceAll(",", "");
				String dd1T = args22[0].replaceAll(",", "");
				System.out.println(dd);
				System.out.println("dd1T" + dd1T);

				if (dd1T.equals("C")) {

					M2 = new BigDecimal(dd);
					System.out.println("M2-C" + M2);

				} else if (dd1T.equals("D")) {

					M2 = new BigDecimal(dd).multiply(new BigDecimal(-1));
					System.out.println("M2-D" + M2);
				}

			}

			if (args2.length == 2) {

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}

				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);

				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}

				M2 = Mdd0T.add(Mdd1T);

				System.out.println("M2" + M2);

			}

			if (args2.length == 3) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;

				String dd0 = args2[0].replaceAll(",", "");
				System.out.println("dd0" + dd0);
				
				String dd0T = args22[0].replaceAll(",", "");
				System.out.println("dd0T" + dd0T);
				
				
				String dd1 = args2[1].replaceAll(",", "");
				System.out.println("dd1" + dd1);
				
				String dd1T = args22[1].replaceAll(",", "");
				System.out.println("dd1T" + dd1T);
				
				
				
				String dd2 = args2[2].replaceAll(",", "");
				System.out.println("dd2" + dd2);
				
				String dd2T = args22[2].replaceAll(",", "");
				System.out.println("dd2T" + dd2T);
				
				
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				M2 = ddM1.add(Mdd2T);
				System.out.println("M2" + M2);
			}

			if (args2.length == 4) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T= args22[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				M2 = ddM1.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 5) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

				}
				
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(ddM1);
				M2 = ddM3.add(ddM2);
				System.out.println("M2" + M2);
			}

			if (args2.length == 6) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = ddM2.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM4);
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 7) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
			
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(ddM1);
				BigDecimal ddM5 = ddM3.add(ddM2);
				M2 = ddM5.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 8) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				
				String dd5 = args2[5].replaceAll(",", "");
				
				String dd5T = args22[5].replaceAll(",", "");
				
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = ddM1.add(ddM2);
				BigDecimal ddM6 = ddM3.add(ddM4);
				M2 = ddM5.add(ddM6);
				System.out.println("M2" + M2);
			}

			if (args2.length == 9) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T= args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(ddM1);
				BigDecimal ddM6 = ddM2.add(ddM3);
				BigDecimal ddM7 = ddM5.add(ddM4);
				M2 = ddM7.add(ddM6);
				System.out.println("M2" + M2);
			}

			if (args2.length == 10) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;
				
				BigDecimal Mdd2T = null;
				
				BigDecimal Mdd3T = null;
				
				BigDecimal Mdd4T = null;
				
				BigDecimal Mdd5T = null;
				
				BigDecimal Mdd6T = null;
				
				BigDecimal Mdd7T = null;
				
				BigDecimal Mdd8T = null;
				
				BigDecimal Mdd9T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = ddM1.add(ddM2);
				BigDecimal ddM7 = ddM3.add(ddM4);
				BigDecimal ddM8 = ddM5.add(ddM6);

				M2 = ddM7.add(ddM8);
				System.out.println("M2" + M2);
			}

			if (args2.length == 11) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args2[7].replaceAll(",", "");
				
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T = args22[10].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(ddM1);
				BigDecimal ddM7 = ddM2.add(ddM3);
				BigDecimal ddM8 = ddM4.add(ddM5);
				BigDecimal ddM9 = ddM6.add(ddM7);

				M2 = ddM9.add(ddM8);
				System.out.println("M2" + M2);
			}

			if (args2.length == 12) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = ddM2.add(ddM1);
				BigDecimal ddM8 = ddM4.add(ddM3);
				BigDecimal ddM9 = ddM6.add(ddM5);
				BigDecimal ddM10 = ddM8.add(ddM7);
				

				M2 = ddM9.add(ddM10);
				System.out.println("M2" + M2);
			}

			if (args2.length == 13) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(ddM1);
				BigDecimal ddM8 = ddM2.add(ddM3);
				BigDecimal ddM9 = ddM4.add(ddM5);
				BigDecimal ddM10 = ddM6.add(ddM7);
				BigDecimal ddM11 = ddM9.add(ddM8);
				
				M2 = ddM11.add(ddM10);
				System.out.println("M2" + M2);
			}

			if (args2.length == 14) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = ddM2.add(ddM1);
				BigDecimal ddM9 = ddM4.add(ddM3);
				BigDecimal ddM10 = ddM6.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM8);
				BigDecimal ddM12 = ddM9.add(ddM10);
				
				M2 = ddM11.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 15) {

				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				
				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(ddM1);
				BigDecimal ddM9 = ddM2.add(ddM3);
				BigDecimal ddM10 = ddM4.add(ddM5);
				BigDecimal ddM11 = ddM7.add(ddM6);
				BigDecimal ddM12 = ddM9.add(ddM8);
				BigDecimal ddM13 = ddM11.add(ddM10);
				
				M2 = ddM13.add(ddM12);
				System.out.println("M2" + M2);
			}

			if (args2.length == 16) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = ddM2.add(ddM1);
				BigDecimal ddM10 = ddM4.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM6);
				BigDecimal ddM12 = ddM7.add(ddM8);
				BigDecimal ddM13 = ddM9.add(ddM10);
				BigDecimal ddM14 = ddM11.add(ddM12);
				
				M2 = ddM13.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 17) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(ddM1);
				BigDecimal ddM10 = ddM2.add(ddM3);
				BigDecimal ddM11 = ddM5.add(ddM4);
				BigDecimal ddM12 = ddM7.add(ddM6);
				BigDecimal ddM13 = ddM9.add(ddM8);
				BigDecimal ddM14 = ddM11.add(ddM10);
				BigDecimal ddM15 = ddM13.add(ddM12);
				
				
				
				M2 = ddM15.add(ddM14);
				System.out.println("M2" + M2);
			}

			if (args2.length == 18) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = ddM2.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM4);
				BigDecimal ddM12 = ddM5.add(ddM6);
				BigDecimal ddM13 = ddM7.add(ddM8);
				BigDecimal ddM14 = ddM9.add(ddM10);
				BigDecimal ddM15 = ddM11.add(ddM12);
				BigDecimal ddM16 = ddM13.add(ddM14);
				
				M2 = ddM15.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 19) {
				
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(ddM1);
				BigDecimal ddM11 = ddM3.add(ddM2);
				BigDecimal ddM12 = ddM5.add(ddM4);
				BigDecimal ddM13 = ddM7.add(ddM6);
				BigDecimal ddM14 = ddM9.add(ddM8);
				BigDecimal ddM15 = ddM11.add(ddM10);
				BigDecimal ddM16 = ddM13.add(ddM12);
				BigDecimal ddM17 = ddM15.add(ddM14);
			
				M2 = ddM17.add(ddM16);
				System.out.println("M2" + M2);
			}

			if (args2.length == 20) {
				
				BigDecimal Mdd0T = null;

				BigDecimal Mdd1T = null;

				BigDecimal Mdd2T = null;

				BigDecimal Mdd3T = null;

				BigDecimal Mdd4T = null;

				BigDecimal Mdd5T = null;

				BigDecimal Mdd6T = null;

				BigDecimal Mdd7T = null;

				BigDecimal Mdd8T = null;

				BigDecimal Mdd9T = null;

				BigDecimal Mdd10T = null;
				
				BigDecimal Mdd11T = null;
				
				BigDecimal Mdd12T = null;
				
				BigDecimal Mdd13T = null;
				
				BigDecimal Mdd14T = null;
				
				BigDecimal Mdd15T = null;
				
				BigDecimal Mdd16T = null;
				
				BigDecimal Mdd17T = null;
				
				BigDecimal Mdd18T = null;
				
				BigDecimal Mdd19T = null;

				String dd0 = args2[0].replaceAll(",", "");
				String dd0T = args22[0].replaceAll(",", "");
				
				String dd1 = args2[1].replaceAll(",", "");
				String dd1T = args22[1].replaceAll(",", "");
				
				String dd2 = args2[2].replaceAll(",", "");
				String dd2T = args22[2].replaceAll(",", "");
				
				String dd3 = args2[3].replaceAll(",", "");
				String dd3T = args22[3].replaceAll(",", "");
				
				String dd4 = args2[4].replaceAll(",", "");
				String dd4T = args22[4].replaceAll(",", "");
				
				String dd5 = args2[5].replaceAll(",", "");
				String dd5T = args22[5].replaceAll(",", "");
				
				
				String dd6 = args2[6].replaceAll(",", "");
				String dd6T = args22[6].replaceAll(",", "");
				
				String dd7 = args2[7].replaceAll(",", "");
				String dd7T = args22[7].replaceAll(",", "");
				
				String dd8 = args2[8].replaceAll(",", "");
				String dd8T = args22[8].replaceAll(",", "");
				
				
				String dd9 = args2[9].replaceAll(",", "");
				String dd9T = args22[9].replaceAll(",", "");
				
				
				String dd10 = args2[10].replaceAll(",", "");
				String dd10T= args22[10].replaceAll(",", "");
				
				
				String dd11 = args2[11].replaceAll(",", "");
				String dd11T = args22[11].replaceAll(",", "");
				
				
				String dd12 = args2[12].replaceAll(",", "");
				String dd12T = args22[12].replaceAll(",", "");
				
				
				String dd13 = args2[13].replaceAll(",", "");
				String dd13T = args22[13].replaceAll(",", "");
				
				String dd14 = args2[14].replaceAll(",", "");
				String dd14T = args22[14].replaceAll(",", "");
				
				
				String dd15 = args2[15].replaceAll(",", "");
				String dd15T = args22[15].replaceAll(",", "");
				
				
				String dd16 = args2[16].replaceAll(",", "");
				String dd16T = args22[16].replaceAll(",", "");
				String dd17 = args2[17].replaceAll(",", "");
				String dd17T = args22[17].replaceAll(",", "");
				String dd18 = args2[18].replaceAll(",", "");
				String dd18T = args22[18].replaceAll(",", "");
				String dd19 = args2[19].replaceAll(",", "");
				String dd19T = args22[19].replaceAll(",", "");
				
				if (dd0T.equals("C")) {

					Mdd0T = new BigDecimal(dd0);

				} else if (dd0T.equals("D")) {

					Mdd0T = new BigDecimal(dd0).multiply(new BigDecimal(-1));

				}
				if (dd1T.equals("C")) {

					Mdd1T = new BigDecimal(dd1);

				} else if (dd1T.equals("D")) {

					Mdd1T = new BigDecimal(dd1).multiply(new BigDecimal(-1));

				}
				
				if (dd2T.equals("C")) {

					Mdd2T = new BigDecimal(dd2);

				} else if (dd2T.equals("D")) {

					Mdd2T = new BigDecimal(dd2).multiply(new BigDecimal(-1));

				}
				
				if (dd3T.equals("C")) {

					Mdd3T = new BigDecimal(dd0);

				} else if (dd3T.equals("D")) {

					Mdd3T = new BigDecimal(dd3).multiply(new BigDecimal(-1));

				}
				
				if (dd4T.equals("C")) {

					Mdd4T = new BigDecimal(dd4);

				} else if (dd4T.equals("D")) {

					Mdd4T = new BigDecimal(dd4).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd5T.equals("C")) {

					Mdd5T = new BigDecimal(dd5);

				} else if (dd5T.equals("D")) {

					Mdd5T = new BigDecimal(dd5).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd6T.equals("C")) {

					Mdd6T = new BigDecimal(dd6);

				} else if (dd6T.equals("D")) {

					Mdd6T = new BigDecimal(dd6).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd7T.equals("C")) {

					Mdd7T = new BigDecimal(dd7);

				} else if (dd7T.equals("D")) {

					Mdd7T = new BigDecimal(dd7).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd8T.equals("C")) {

					Mdd8T = new BigDecimal(dd8);

				} else if (dd8T.equals("D")) {

					Mdd8T = new BigDecimal(dd8).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd9T.equals("C")) {

					Mdd9T = new BigDecimal(dd9);

				} else if (dd9T.equals("D")) {

					Mdd9T = new BigDecimal(dd9).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd10T.equals("C")) {

					Mdd10T = new BigDecimal(dd10);

				} else if (dd10T.equals("D")) {

					Mdd10T = new BigDecimal(dd10).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd11T.equals("C")) {

					Mdd11T = new BigDecimal(dd11);

				} else if (dd11T.equals("D")) {

					Mdd10T = new BigDecimal(dd11).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd12T.equals("C")) {

					Mdd12T = new BigDecimal(dd12);

				} else if (dd12T.equals("D")) {

					Mdd12T = new BigDecimal(dd12).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd13T.equals("C")) {

					Mdd13T = new BigDecimal(dd13);

				} else if (dd13T.equals("D")) {

					Mdd13T = new BigDecimal(dd13).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd14T.equals("C")) {

					Mdd14T = new BigDecimal(dd14);

				} else if (dd14T.equals("D")) {

					Mdd14T = new BigDecimal(dd14).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd15T.equals("C")) {

					Mdd15T = new BigDecimal(dd15);

				} else if (dd15T.equals("D")) {

					Mdd15T = new BigDecimal(dd15).multiply(new BigDecimal(-1));

					
					
				}
				
				
				if (dd16T.equals("C")) {

					Mdd16T = new BigDecimal(dd16);

				} else if (dd16T.equals("D")) {

					Mdd16T = new BigDecimal(dd16).multiply(new BigDecimal(-1));

					
					
				}
				if (dd17T.equals("C")) {

					Mdd17T = new BigDecimal(dd17);

				} else if (dd17T.equals("D")) {

					Mdd17T = new BigDecimal(dd17).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd18T.equals("C")) {

					Mdd18T = new BigDecimal(dd18);

				} else if (dd18T.equals("D")) {

					Mdd18T = new BigDecimal(dd18).multiply(new BigDecimal(-1));

					
					
				}
				
				if (dd19T.equals("C")) {

					Mdd19T = new BigDecimal(dd19);

				} else if (dd19T.equals("D")) {

					Mdd19T = new BigDecimal(dd19).multiply(new BigDecimal(-1));

					
					
				}
				
				BigDecimal ddM1 = Mdd0T.add(Mdd1T);
				BigDecimal ddM2 = Mdd2T.add(Mdd3T);
				BigDecimal ddM3 = Mdd4T.add(Mdd5T);
				BigDecimal ddM4 = Mdd6T.add(Mdd7T);
				BigDecimal ddM5 = Mdd8T.add(Mdd9T);
				BigDecimal ddM6 = Mdd10T.add(Mdd11T);
				BigDecimal ddM7 = Mdd12T.add(Mdd13T);
				BigDecimal ddM8 = Mdd14T.add(Mdd15T);
				BigDecimal ddM9 = Mdd16T.add(Mdd17T);
				BigDecimal ddM10 = Mdd18T.add(Mdd19T);
				BigDecimal ddM11 = ddM1.add(ddM2);
				BigDecimal ddM12 = ddM3.add(ddM4);
				BigDecimal ddM13 = ddM5.add(ddM6);
				BigDecimal ddM14 = ddM7.add(ddM8);
				BigDecimal ddM15 = ddM9.add(ddM10);
				BigDecimal ddM16 = ddM11.add(ddM12);
				BigDecimal ddM17 = ddM13.add(ddM14);
				BigDecimal ddM18 = ddM15.add(ddM16);
				M2 = ddM17.add(ddM18);
				System.out.println("M2" + M2);
			}

			if (args2.length == 21) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 22) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 23) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 24) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 25) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}

			if (args2.length == 26) {

				String dd0 = args2[0].replaceAll(",", "");
				String dd1 = args2[1].replaceAll(",", "");
				String dd2 = args2[2].replaceAll(",", "");
				String dd3 = args2[3].replaceAll(",", "");
				String dd4 = args2[4].replaceAll(",", "");
				String dd5 = args2[5].replaceAll(",", "");
				BigDecimal ddM1 = new BigDecimal(dd0).add(new BigDecimal(dd1));
				BigDecimal ddM2 = new BigDecimal(dd2).add(new BigDecimal(dd3));
				BigDecimal ddM3 = ddM1.add(new BigDecimal(dd4));
				BigDecimal ddM4 = ddM2.add(new BigDecimal(dd5));
				M2 = ddM3.add(ddM4);
				System.out.println("M2" + M2);
			}
			status = "success";
		} catch (Exception e) {
			e.printStackTrace();
			status = "failed.Please contact Administrator";
		}

		return M2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
