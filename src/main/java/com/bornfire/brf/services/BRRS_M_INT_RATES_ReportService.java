package com.bornfire.brf.services;

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

import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity4;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo4;
import com.bornfire.brf.entities.BRRS_M_INT_RATES_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_INT_RATES_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_INT_RATES_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_INT_RATES_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Summary_Repo;
import com.bornfire.brf.entities.M_INT_RATES_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_INT_RATES_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;

@Component
@Service
public class BRRS_M_INT_RATES_ReportService {
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
	BRRS_M_AIDP_Summary_Repo1	BRRS_M_aidpRepo1;
				
	@Autowired
	BRRS_M_AIDP_Summary_Repo2	BRRS_M_aidpRepo2;
	@Autowired
	BRRS_M_AIDP_Summary_Repo3	BRRS_M_aidpRepo3;
	@Autowired
	BRRS_M_AIDP_Summary_Repo4	BRRS_M_aidpRepo4;
	
	@Autowired
	BRRS_M_SFINP2_Summary_Repo M_SFINP2_Summary_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Detail_Repo M_SFINP2_Archival_Detail_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Summary_Repo M_SFINP2_Archival_Summary_Repo;
	
	@Autowired
	BRRS_M_INT_RATES_Detail_Repo M_INT_RATES_DETAIL_Repo;
	

	@Autowired
	BRRS_M_INT_RATES_Summary_Repo	M_INT_RATES_Summary_Repo;
	
	@Autowired
	BRRS_M_INT_RATES_Archival_Detail_Repo M_INT_RATES_Archival_Detail_Repo;

	@Autowired
	BRRS_M_INT_RATES_Archival_Summary_Repo M_INT_RATES_Archival_Summary_Repo;
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	
	public ModelAndView getM_INT_View(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String type, String version) {
		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		if (type.equals("ARCHIVAL") & version != null) {
			List<M_INT_RATES_Archival_Summary_Entity> T1Master = new ArrayList<M_INT_RATES_Archival_Summary_Entity>();
			try {
				Date d1 = dateformat.parse(todate);

				// T1Master = hs.createQuery("from BRF1_REPORT_ENTITY a where a.report_date = ?1
				// ", BRF1_REPORT_ENTITY.class)
				// .setParameter(1, df.parse(todate)).getResultList();
				T1Master = M_INT_RATES_Archival_Summary_Repo.getdatabydateListarchival(dateformat.parse(todate), version);

			} catch (ParseException e) {
				e.printStackTrace();
			}

			mv.addObject("reportsummary", T1Master);
		} else {
			List<M_INT_RATES_Summary_Entity> T1Master = new ArrayList<M_INT_RATES_Summary_Entity>();
		
			
			try {
				Date d1 = dateformat.parse(todate);

				T1Master = M_INT_RATES_Summary_Repo.getdatabydateList(dateformat.parse(todate));
				
				
				
				System.out.println("Size of t1master is :"+T1Master.size());
				
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			mv.addObject("reportsummary", T1Master);
		
		}

		
		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);
		mv.setViewName("BRRS/M_INT_RATES");
		mv.addObject("displaymode", "summary");
		System.out.println("scv" + mv.getViewName());
		return mv;
	}
	
	

	
	
	
	
	
				
	
	


}
