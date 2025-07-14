package com.bornfire.brf.services;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.bornfire.brf.entities.RT_DataControl;
import com.bornfire.brf.entities.RT_DatacontrolRepository;

import org.springframework.beans.factory.annotation.Autowired;



@Service
public class RT_DataControlService {
	
	@Autowired
	RT_DatacontrolRepository RT_DatacontrolRepository;

	
	public String createOrUpdate(RT_DataControl dto, String formmode,String report_name) {
	    try {
	        System.out.println("Service: createOrUpdate() called");

	        if (dto.getPortfolioDate() == null) {
	            return "ERROR: Portfolio date is required.";
	        }

	        if ("edit".equalsIgnoreCase(formmode)) {
	            System.out.println("Form mode is EDIT — updating record.");
	            dto.setModifyFlg("Y");    // Mark that it's been modified
	        } else {
	            // New entry
	            dto.setEntityFlg("Y");    // Mark as new entity
	            dto.setDelFlg("N");       // Not deleted
	            dto.setModifyFlg("N");    // Not modified
	            dto.setReport_name(report_name);
	            
	        }

	        RT_DatacontrolRepository.save(dto);
	        return "Saved successfully.";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "ERROR: " + e.getMessage();
	    }
	}

}