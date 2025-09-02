package com.bornfire.xbrl.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping(value = "upload")
public class XBRLFileUploadController {



	
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");



}
