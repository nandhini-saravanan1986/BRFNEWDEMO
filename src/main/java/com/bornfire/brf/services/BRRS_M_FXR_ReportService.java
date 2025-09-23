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
import org.hibernate.Session;
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

import com.bornfire.brf.entities.M_FXR_Summary_Entity1;
import com.bornfire.brf.entities.M_FXR_Summary_Entity2;
import com.bornfire.brf.entities.M_FXR_Summary_Entity3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity3;
//import com.bornfire.brf.entities.M_FXR_Summary_Entity4;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo3;
//import com.bornfire.brf.entities.BRRS_M_FXR_Summary_Repo4;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Summary_Repo;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Summary_Entity;
import java.lang.reflect.Method;
import java.math.BigDecimal;


@Component
@Service
public class BRRS_M_FXR_ReportService {


	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SFINP2_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AuditService auditService;
	@Autowired
	
	BRRS_M_SFINP2_Detail_Repo M_SFINP2_DETAIL_Repo;

	@Autowired
	BRRS_M_FXR_Summary_Repo1	BRRS_M_FXR_Summary_Repo1;
				
	@Autowired
	BRRS_M_FXR_Summary_Repo2	BRRS_M_FXR_Summary_Repo2;
	@Autowired
	BRRS_M_FXR_Summary_Repo3	BRRS_M_FXR_Summary_Repo3;
//	@Autowired
//	BRRS_M_FXR_Summary_Repo4	BRRS_M_FXR_Summary_Repo4;
	
	@Autowired
	BRRS_M_SFINP2_Summary_Repo M_SFINP2_Summary_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Detail_Repo M_SFINP2_Archival_Detail_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Summary_Repo M_SFINP2_Archival_Summary_Repo;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getM_FXRView(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<M_SFINP2_Archival_Summary_Entity> T1Master = new ArrayList<M_SFINP2_Archival_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_SFINP2_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_FXR_Summary_Entity1> T1Master = new ArrayList<M_FXR_Summary_Entity1>();
			List<M_FXR_Summary_Entity2> T2Master = new ArrayList<M_FXR_Summary_Entity2>();
			List<M_FXR_Summary_Entity3> T3Master = new ArrayList<M_FXR_Summary_Entity3>();
//			List<M_FXR_Summary_Entity4> T4Master = new ArrayList<M_FXR_Summary_Entity4>();
			
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = BRRS_M_FXR_Summary_Repo1.getdatabydateList(dateformat.parse(todate));
				T2Master = BRRS_M_FXR_Summary_Repo2.getdatabydateList(dateformat.parse(todate));
				T3Master = BRRS_M_FXR_Summary_Repo3.getdatabydateList(dateformat.parse(todate));
//				T4Master = BRRS_M_FXR_Summary_Repo4.getdatabydateList(dateformat.parse(todate));
				
				
				
				System.out.println("Size of t1master is :"+T1Master.size());
				
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary1", T1Master);
			mv.addObject("reportsummary2", T2Master);
			mv.addObject("reportsummary3", T3Master);
//			mv.addObject("reportsummary4", T4Master);
		}

		
		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_FXR");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	
	
	public void updateReport1(M_FXR_Summary_Entity1 updatedEntity) {
	    System.out.println("Came to services1");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity1 existing = BRRS_M_FXR_Summary_Repo1.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));

	    try {
	        // 1️⃣ Loop from R11 to R16 and copy fields
	        for (int i = 11; i <= 16; i++) {
	            String prefix = "R" + i + "_";

	            String[] fields = { "currency", "net_spot_position", "net_forward_position", "guarantees",
	                                "net_future_inc_or_exp", "net_delta_wei_fx_opt_posi", "other_items",
	                                "net_long_position", "or", "net_short_position" };

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity1.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity1.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // 2️⃣ Handle R17 totals
	        String[] totalFields = { "net_long_position", "net_short_position" };
	        for (String field : totalFields) {
	            String getterName = "getR17_" + field;
	            String setterName = "setR17_" + field;

	            try {
	                Method getter = M_FXR_Summary_Entity1.class.getMethod(getterName);
	                Method setter = M_FXR_Summary_Entity1.class.getMethod(setterName, getter.getReturnType());

	                Object newValue = getter.invoke(updatedEntity);
	                setter.invoke(existing, newValue);

	            } catch (NoSuchMethodException e) {
	                // Skip if not present
	                continue;
	            }
	        }

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo1.save(existing);
	}

	public void updateReport2(M_FXR_Summary_Entity2 updatedEntity) {
	    System.out.println("Came to services2");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity2 existing = BRRS_M_FXR_Summary_Repo2.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));

	    try {
	        // 1️⃣ Loop from R11 to R50 and copy fields
	        for (int i = 21; i <= 22; i++) {
	            String prefix = "R" + i + "_";

	            String[] fields = { "long", "short" };

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	            String[] formulaFields = { "total_gross_long_short", "net_position" };
	            for (String field : formulaFields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    continue;
	                }
	            }
	        }

	        // 2️⃣ Handle R23 totals
	            String getterName = "getR23_net_position";
	            String setterName = "setR23_net_position";

	            try {
	                Method getter = M_FXR_Summary_Entity2.class.getMethod(getterName);
	                Method setter = M_FXR_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                Object newValue = getter.invoke(updatedEntity);
	                setter.invoke(existing, newValue);

	            } catch (NoSuchMethodException e) {
	                // Skip if not present
	                //continue;
	            }
	        

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo2.save(existing);
	}

	public void updateReport3(M_FXR_Summary_Entity3 updatedEntity) {
	    System.out.println("Came to services3");
	    System.out.println("Report Date: " + updatedEntity.getReport_date());

	    M_FXR_Summary_Entity3 existing = BRRS_M_FXR_Summary_Repo3.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));


	    try {

	            String[] fields = {"greater_net_long_or_short", "abs_value_net_gold_posi", "capital_require", "capital_charge"};

	            for (String field : fields) {
	                String getterName = "getR29_" + field;
	                String setterName = "setR29_" + field;

	                try {
	                    Method getter = M_FXR_Summary_Entity3.class.getMethod(getterName);
	                    Method setter = M_FXR_Summary_Entity3.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	    
	    }catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    BRRS_M_FXR_Summary_Repo3.save(existing);
	}
}
	

	    
