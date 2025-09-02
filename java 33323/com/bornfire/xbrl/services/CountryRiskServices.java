package com.bornfire.xbrl.services;


import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bornfire.xbrl.entities.FinSolTb;
import com.bornfire.xbrl.entities.BRSS.CountryRiskParameter;


@Service
@Transactional
public class CountryRiskServices {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(CountryRiskServices.class);

	
	@SuppressWarnings("unchecked")
	public List<CountryRiskParameter> getCountryRiskPara() {
		
		logger.info("CountryRiskServices-->>getCountryRiskPara()");
		
		Session hs = sessionFactory.getCurrentSession();
List<CountryRiskParameter> countryRiskParameter = hs.createQuery("from CountryRiskParameter  where DEL_FLG != 'Y' ").getResultList();
		
		return countryRiskParameter;
	}
		
		@SuppressWarnings("unchecked")

	public List<CountryRiskParameter> getBankDatas() {
		
		logger.info("CountryRiskServices-->>getBankDatas()");
		
		Session hs = sessionFactory.getCurrentSession();
		

		List<CountryRiskParameter> countryRiskParameter = hs.createQuery("from CountryRiskParameter  where DEL_FLG != 'Y' ").getResultList();
		
		return countryRiskParameter;
	}
	

	

	public String detailChanges(CountryRiskParameter details, Character changeType, String userid) {


		String msg = "";

		try {
			
			Session hs = sessionFactory.getCurrentSession();


               if (changeType.equals('A')) {
            	details.setENTRY_USER(userid);
			
				details.setENTRY_TIME(new Date());
				details.setENTITY_FLG("N");
				details.setDEL_FLG("N");
				hs.saveOrUpdate(details);


				
				logger.info("Added Record");
				msg = "Added Successfully";
			} else if (changeType.equals('E')) {

				details.setMODIFY_USER(userid);
				details.setENTITY_FLG("Y");
				details.setDEL_FLG("N");
				details.setMODIFY_TIME(new Date());
				hs.saveOrUpdate(details);

				logger.info("Edited Record");
				msg = "Edited Successfully";
				
			} else if (changeType.equals('D')) {
				

				details.setMODIFY_USER(userid);
				details.setMODIFY_TIME(new Date());
				
				details.setDEL_FLG("Y");
				hs.saveOrUpdate(details);
				logger.info("Deleted Record");
				msg = "Deleted Successfully";
			}
              

		} catch (Exception e) {

			msg = "error occured. Please contact Administrator";
			e.printStackTrace();
		}

		return msg;
	}
	
	
	public List<FinSolTb> getBranchList(){
		
		Session hs = sessionFactory.getCurrentSession();
		return hs.createQuery("from FinSolTb",FinSolTb.class).getResultList();
	}

}
