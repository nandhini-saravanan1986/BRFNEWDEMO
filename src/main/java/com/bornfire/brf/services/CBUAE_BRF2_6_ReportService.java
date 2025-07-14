package com.bornfire.brf.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.CBUAE_BRF2_6_DETAIL_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_6_DETAIL_Repo;
import com.bornfire.brf.entities.CBUAE_BRF2_6_SUMMARY_ENTITY;
import com.bornfire.brf.entities.CBUAE_BRF2_6_SUMMARY_Repo;

@Component
@Service

public class CBUAE_BRF2_6_ReportService {
	

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CBUAE_BRF2_6_DETAIL_Repo BRF2_6_DETAIL_Repo;
	
	@Autowired
	CBUAE_BRF2_6_SUMMARY_Repo BRF2_6_REPORT_Repo;
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	public ModelAndView getBRF2_6View(String reportId, String fromdate, String todate, String currency, String dtltype,
			Pageable pageable) {

		ModelAndView mv = new ModelAndView();
		Session hs = sessionFactory.getCurrentSession();
		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;	

		List<CBUAE_BRF2_6_SUMMARY_ENTITY> T1Master = new ArrayList<CBUAE_BRF2_6_SUMMARY_ENTITY>();
		try {
			Date d1 = dateformat.parse(todate);
			// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

			//T1Master = hs.createQuery("from  BRF1_REPORT_ENTITY a where a.report_date = ?1 ", BRF1_REPORT_ENTITY.class)
				//	.setParameter(1, df.parse(todate)).getResultList();
			 T1Master=BRF2_6_REPORT_Repo.getdatabydateList(dateformat.parse(todate));
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// T1rep = t1CurProdServiceRepo.getT1CurProdServices(d1);

		mv.setViewName("BRF/BRF2_6");
		
		mv.addObject("reportsummary", T1Master);
		//mv.addObject("reportmaster", T1Master);
		mv.addObject("displaymode", "summary");
		//mv.addObject("reportsflag", "reportsflag");
		//mv.addObject("menu", reportId);
		System.out.println("scv" + mv.getViewName());

		return mv;

	}
	
	
	public ModelAndView getBRF2_6currentDtl(String reportId, String fromdate, String todate, String currency,
			String dtltype, Pageable pageable, String filter) {

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		ModelAndView mv = new ModelAndView();

		Session hs = sessionFactory.getCurrentSession();
		List<CBUAE_BRF2_6_DETAIL_ENTITY> T1Dt1 = new ArrayList<CBUAE_BRF2_6_DETAIL_ENTITY>();
		
		try {
			Date d1 = dateformat.parse(todate);
			
			T1Dt1=BRF2_6_DETAIL_Repo.getdatabydateList(dateformat.parse(todate));
			System.out.println("LISTCOUNT"+T1Dt1.size());
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		//Page<Object> T1Dt1Page = new PageImpl<Object>(pagedlist, PageRequest.of(currentPage, pageSize), T1Dt1.size());

		mv.setViewName("BRF/BRF2_6");
		mv.addObject("displaymode", "Details");
		//mv.addObject("reportdetails", T1Dt1Page.getContent());
		mv.addObject("reportdetails",T1Dt1 );
		mv.addObject("reportmaster12", T1Dt1);
		//mv.addObject("reportmaster1", qr);
		//mv.addObject("singledetail", new T1CurProdDetail());
		mv.addObject("reportsflag", "reportsflag");
		mv.addObject("menu", reportId);
		return mv;
	}

	
	

}
