package com.bornfire.brf.services;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Archival_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Archival_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Archival_Summary_Repo3;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Archival_Summary_Repo4;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Summay_Repo1;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Summay_Repo2;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Summay_Repo3;
import com.bornfire.brf.entities.BRRS_Q_BRANCHNET_Summay_Repo4;
import com.bornfire.brf.entities.Q_BRANCHNET_Archival_Summary_Entity1;
import com.bornfire.brf.entities.Q_BRANCHNET_Archival_Summary_Entity2;
import com.bornfire.brf.entities.Q_BRANCHNET_Archival_Summary_Entity3;
import com.bornfire.brf.entities.Q_BRANCHNET_Archival_Summary_Entity4;
import com.bornfire.brf.entities.Q_BRANCHNET_Summary_Entity1;
import com.bornfire.brf.entities.Q_BRANCHNET_Summary_Entity2;
import com.bornfire.brf.entities.Q_BRANCHNET_Summary_Entity3;
import com.bornfire.brf.entities.Q_BRANCHNET_Summary_Entity4;


@Component
@Service
public class BRRS_Q_BRANCHNET_ReportService {


	private static final Logger logger = LoggerFactory.getLogger(BRRS_Q_BRANCHNET_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AuditService auditService;
	
	@Autowired
	BRRS_Q_BRANCHNET_Summay_Repo1 Q_BRANCHNET_Summary_Repo1;
	@Autowired
	BRRS_Q_BRANCHNET_Summay_Repo2 Q_BRANCHNET_Summary_Repo2;
	@Autowired
	BRRS_Q_BRANCHNET_Summay_Repo3 Q_BRANCHNET_Summary_Repo3;
	@Autowired
	BRRS_Q_BRANCHNET_Summay_Repo4 Q_BRANCHNET_Summary_Repo4;

	@Autowired
	BRRS_Q_BRANCHNET_Archival_Summary_Repo1 Q_BRANCHNET_Archival_Summary_Repo1;
	@Autowired
	BRRS_Q_BRANCHNET_Archival_Summary_Repo2 Q_BRANCHNET_Archival_Summary_Repo2;
	@Autowired
	BRRS_Q_BRANCHNET_Archival_Summary_Repo3 Q_BRANCHNET_Archival_Summary_Repo3;
	@Autowired
	BRRS_Q_BRANCHNET_Archival_Summary_Repo4 Q_BRANCHNET_Archival_Summary_Repo4;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

	public ModelAndView getQ_BRANCHNETView(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<Q_BRANCHNET_Archival_Summary_Entity1> T1Master = new ArrayList<Q_BRANCHNET_Archival_Summary_Entity1>();
			List<Q_BRANCHNET_Archival_Summary_Entity2> T1Master1 = new ArrayList<Q_BRANCHNET_Archival_Summary_Entity2>();
			List<Q_BRANCHNET_Archival_Summary_Entity3> T1Master2 = new ArrayList<Q_BRANCHNET_Archival_Summary_Entity3>();
			List<Q_BRANCHNET_Archival_Summary_Entity4> T1Master3 = new ArrayList<Q_BRANCHNET_Archival_Summary_Entity4>();
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = Q_BRANCHNET_Archival_Summary_Repo1.getdatabydateListarchival(todate, version);
				T1Master1 = Q_BRANCHNET_Archival_Summary_Repo2.getdatabydateListarchival(todate, version);
				T1Master2 = Q_BRANCHNET_Archival_Summary_Repo3.getdatabydateListarchival(todate, version);
				T1Master3= Q_BRANCHNET_Archival_Summary_Repo4.getdatabydateListarchival(todate, version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
            mv.addObject("reportsummary2", T1Master2);
			mv.addObject("reportsummary3", T1Master3);
		} else {
			List<Q_BRANCHNET_Summary_Entity1> T1Master = new ArrayList<Q_BRANCHNET_Summary_Entity1>();
			List<Q_BRANCHNET_Summary_Entity2> T1Master1 = new ArrayList<Q_BRANCHNET_Summary_Entity2>();
			List<Q_BRANCHNET_Summary_Entity3> T1Master2 = new ArrayList<Q_BRANCHNET_Summary_Entity3>();
			List<Q_BRANCHNET_Summary_Entity4> T1Master3 = new ArrayList<Q_BRANCHNET_Summary_Entity4>();
			
			try {
				Date d1 = dateformat.parse(todate);
				T1Master = Q_BRANCHNET_Summary_Repo1.getdatabydateList(dateformat.parse(todate));
				T1Master1 = Q_BRANCHNET_Summary_Repo2.getdatabydateList(dateformat.parse(todate));
				T1Master2 = Q_BRANCHNET_Summary_Repo3.getdatabydateList(dateformat.parse(todate));
				T1Master3 = Q_BRANCHNET_Summary_Repo4.getdatabydateList(dateformat.parse(todate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
			mv.addObject("reportsummary1", T1Master1);
            mv.addObject("reportsummary2", T1Master2);
			 mv.addObject("reportsummary3", T1Master3);
		}
		mv.setViewName("BRRS/Q_BRANCHNET");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	
	public void QBranchnetUpdate1(Q_BRANCHNET_Summary_Entity1 updatedEntity) {
	    System.out.println("Came to services");
	    System.out.println("Report Date: " + updatedEntity.getREPORT_DATE());

	    Q_BRANCHNET_Summary_Entity1 existing = Q_BRANCHNET_Summary_Repo1.findById(updatedEntity.getREPORT_DATE())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getREPORT_DATE()));

	    try {
	        // 1️⃣ Loop from R10 to R19 and copy fields
	         for (int i = 10; i <= 20; i++){
	            String prefix = "R" + i + "_";

	            String[] fields = { "bran_sub_bran_district","no1_of_branches", "no1_of_sub_branches", "no1_of_agencies"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = Q_BRANCHNET_Summary_Entity1.class.getMethod(getterName);
	                    Method setter = Q_BRANCHNET_Summary_Entity1.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	       

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    Q_BRANCHNET_Summary_Repo1.save(existing);
	}
	public void QBranchnetUpdate2(Q_BRANCHNET_Summary_Entity2 updatedEntity) {
	    System.out.println("Came to services");
	    System.out.println("Report Date: " + updatedEntity.getREPORT_DATE());

	    Q_BRANCHNET_Summary_Entity2 existing = Q_BRANCHNET_Summary_Repo2.findById(updatedEntity.getREPORT_DATE())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getREPORT_DATE()));

	    try {
	        // 1️⃣ Loop from R25 to R34 and copy fields
	        for (int i = 25; i <= 35; i++) {
	            

	            String[] fields = { "atm_mini_atm_district","no_of_atms", "no_of_mini_atms", "encashment_points"};

	            for (String field : fields) {
	                String getterName = "getR" + i + "_" + field;
                    String setterName = "setR" + i + "_" + field;


	                try {
	                    Method getter = Q_BRANCHNET_Summary_Entity2.class.getMethod(getterName);
	                    Method setter = Q_BRANCHNET_Summary_Entity2.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	       

	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    Q_BRANCHNET_Summary_Repo2.save(existing);
	}

	public void QBranchnetUpdate3(Q_BRANCHNET_Summary_Entity3 updatedEntity) {
	    System.out.println("Came to services");
	    System.out.println("Report Date: " + updatedEntity.getREPORT_DATE());

	    Q_BRANCHNET_Summary_Entity3 existing = Q_BRANCHNET_Summary_Repo3.findById(updatedEntity.getREPORT_DATE())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getREPORT_DATE()));

	    try {
	        // 1️⃣ Loop from R40 to R49 and copy fields
	        for (int i = 40; i <= 50; i++) {
	            String prefix = "r" + i + "_";

	            String[] fields = { "opeing_no_of_cards", "no_of_cards_issued", "no_cards_of_closed", "closing_bal_of_active_cards" };

	            for (String field : fields) {
	                String getterName = "getR" + i + "_" + field;
                    String setterName = "setR" + i + "_" + field;


	                try {
	                    Method getter = Q_BRANCHNET_Summary_Entity3.class.getMethod(getterName);
	                    Method setter = Q_BRANCHNET_Summary_Entity3.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }


	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // 3️⃣ Save updated entity
	    Q_BRANCHNET_Summary_Repo3.save(existing);
	}
	
	public void QBranchnetUpdate4(Q_BRANCHNET_Summary_Entity4 updatedEntity) {
	    System.out.println("Came to services");
	    System.out.println("Report Date: " + updatedEntity.getREPORT_DATE());

	    Q_BRANCHNET_Summary_Entity4 existing = Q_BRANCHNET_Summary_Repo4.findById(updatedEntity.getREPORT_DATE())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getREPORT_DATE()));

	    try {
	        // 1️⃣ Loop from R55 to R64 and copy fields
	        for (int i = 55; i <= 65; i++) {
	            String prefix = "r" + i + "_";

	            String[] fields = { "debit_district","opeing_no_of_cards", "no_of_cards_issued", "no_cards_of_closed", "closing_bal_of_active_cards" };

	            for (String field : fields) {
	                String getterName = "getR" + i + "_" + field;
                    String setterName = "setR" + i + "_" + field;


	                try {
	                    Method getter = Q_BRANCHNET_Summary_Entity4.class.getMethod(getterName);
	                    Method setter = Q_BRANCHNET_Summary_Entity4.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);

	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // 2️⃣ Handle R65 totals
	        String[] totalFields = { "credit_district","opeing_no_of_cards", "no_of_cards_issued", "no_cards_of_closed", "closing_bal_of_active_cards" };
	        for (String field : totalFields) {
	            String getterName = "getr65_" + field;
	            String setterName = "setr65_" + field;

	            try {
	                Method getter = Q_BRANCHNET_Summary_Entity4.class.getMethod(getterName);
	                Method setter = Q_BRANCHNET_Summary_Entity4.class.getMethod(setterName, getter.getReturnType());

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
	    Q_BRANCHNET_Summary_Repo4.save(existing);
	}
	

	}