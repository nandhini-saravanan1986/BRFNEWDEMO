package com.bornfire.brf.services;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.M_SRWA_12D_DETAIL_ENTITY;
import com.bornfire.brf.entities.BRRS_M_SRWA_12D_DETAIL_Repo;
import com.bornfire.brf.entities.M_SRWA_12D_SUMMARY_ENTITY1;
import com.bornfire.brf.entities.M_SRWA_12D_SUMMARY_ENTITY2;
import com.bornfire.brf.entities.BRRS_M_SRWA_12D_SUMMARY_Repo1;
import com.bornfire.brf.entities.BRRS_M_SRWA_12D_SUMMARY_Repo2;
import com.bornfire.brf.entities.M_CA5_Summary_Entity2;
import com.bornfire.brf.entities.M_CA5_Summary_Entity1;


@Component
@Service

public class BRRS_M_SRWA_12D_ReportService {
	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SRWA_12D_ReportService.class);

	@Autowired
	private Environment env;
	
    @Autowired
	SessionFactory sessionFactory;

	@Autowired
	BRRS_M_SRWA_12D_DETAIL_Repo BRRS_M_SRWA_12D_DETAIL_Repo;

	@Autowired
	BRRS_M_SRWA_12D_SUMMARY_Repo1 BRRS_M_SRWA_12D_SUMMARY_Repo1;

	@Autowired
	BRRS_M_SRWA_12D_SUMMARY_Repo2 BRRS_M_SRWA_12D_SUMMARY_Repo2;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_SRWA_12DView(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {
		ModelAndView mv = new ModelAndView();
		List<M_SRWA_12D_SUMMARY_ENTITY1> T1Master = new ArrayList<M_SRWA_12D_SUMMARY_ENTITY1>();
		List<M_SRWA_12D_SUMMARY_ENTITY2> T2Master = new ArrayList<M_SRWA_12D_SUMMARY_ENTITY2>();
		try {
			T1Master = BRRS_M_SRWA_12D_SUMMARY_Repo1.getdatabydateList(dateformat.parse(todate));
		
			T2Master = BRRS_M_SRWA_12D_SUMMARY_Repo2.getdatabydateList(dateformat.parse(todate));
		System.out.println(T2Master.size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		mv.setViewName("BRRS/M_SRWA_12D");
		mv.addObject("reportsummary", T1Master);
		mv.addObject("reportsummary1", T2Master);
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}

	public ModelAndView getM_SRWA_12DcurrentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		ModelAndView mv = new ModelAndView();
		List<M_SRWA_12D_DETAIL_ENTITY> T1Dt1 = new ArrayList<M_SRWA_12D_DETAIL_ENTITY>();
		try {
			T1Dt1 = BRRS_M_SRWA_12D_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT" + T1Dt1.size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		mv.setViewName("BRRS/M_SRWA_12D");
		mv.addObject("displaymode", "Details");
		mv.addObject("reportdetails", T1Dt1);
		mv.addObject("reportmaster12", T1Dt1);
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;

}
	
	
}