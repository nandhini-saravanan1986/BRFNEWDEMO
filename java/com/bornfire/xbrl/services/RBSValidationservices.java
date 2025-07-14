package com.bornfire.xbrl.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.bornfire.xbrl.entities.BRSS.ReportValidations;
import com.bornfire.xbrl.entities.BRSS.ReportValidationsRepo;
import com.bornfire.xbrl.entities.BRSS.ValidationResponse;



@Service
@Transactional
@ConfigurationProperties("output")
public class RBSValidationservices {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	ReportValidationsRepo reportValidationsRepo;


	private static final Logger logger = LoggerFactory.getLogger(RBSValidationservices.class);

	public ValidationResponse chkRBSValidations(ReportValidations reportValidations, String srl_no,
			String report_date) throws ParseException {
		logger.info("Entered Services");
		ReportValidations up = reportValidations;
		logger.info("report_date" + report_date);
		ValidationResponse msg = new ValidationResponse();
		Date dateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(report_date);
		String convertDate=new SimpleDateFormat("dd-MMM-yyyy").format(dateFormat);
		
		ReportValidations reportValidation=reportValidationsRepo.findById(srl_no).get();
		String status="";
		List<Object[]> obj=new ArrayList<>();
		switch(srl_no) {
		case "1":
			obj=reportValidationsRepo.getCheckSrlNo1(convertDate);
			
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[1].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					
					status="0";
					
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
				}
			}else {
				status="1";
			}
			break;
		
		case "2":
			obj=reportValidationsRepo.getCheckSrlNo2(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[1].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "3":
			obj=reportValidationsRepo.getCheckSrlNo3(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[1].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
		
		case "4":
			obj=reportValidationsRepo.getCheckSrlNo4(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[3].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[4].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[5].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "5":
			obj=reportValidationsRepo.getCheckSrlNo5(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[3].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[4].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[5].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "6":
			obj=reportValidationsRepo.getCheckSrlNo6(convertDate);
			
			if(obj.size()>0){
				
				
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "7":
			obj=reportValidationsRepo.getCheckSrlNo7(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "8":
			obj=reportValidationsRepo.getCheckSrlNo8(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "9":
			obj=reportValidationsRepo.getCheckSrlNo9(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "10":
			obj=reportValidationsRepo.getCheckSrlNo10(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "11":
			obj=reportValidationsRepo.getCheckSrlNo11(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "12":
			obj=reportValidationsRepo.getCheckSrlNo12(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "13":
			obj=reportValidationsRepo.getCheckSrlNo13(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[6].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[7].toString())&&
						obj.get(0)[2].toString().equals(obj.get(0)[8].toString())&&
						obj.get(0)[3].toString().equals(obj.get(0)[9].toString())&&
						obj.get(0)[4].toString().equals(obj.get(0)[10].toString())&&
						obj.get(0)[5].toString().equals(obj.get(0)[11].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
		case "14":
			obj=reportValidationsRepo.getCheckSrlNo14(convertDate);
			
			if(obj.size()>0){
				
				if(obj.get(0)[0].toString().equals(obj.get(0)[2].toString())&&
						obj.get(0)[1].toString().equals(obj.get(0)[3].toString())) {
					reportValidation.setCur_status("Y");
					reportValidationsRepo.save(reportValidation);
					status="0";
					
				}else {
					reportValidation.setCur_status("N");
					reportValidationsRepo.save(reportValidation);
					status="1";
					
				}
			}else {
				status="1";
			}
			break;
			
			
		}
		
		if(status.equals("0")) {
			msg.setGenID("0");
			msg.setStatus("Validation Success");
		}else if(status.equals("1")) {
			msg.setGenID("0");
			msg.setStatus("Validation Failed");
		}

		return msg;

	}
}