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

import com.bornfire.xbrl.entities.BankMaster;
import com.bornfire.xbrl.entities.FinSolTb;

@Service
@Transactional
public class BankServices {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(BankServices.class);

	public List<BankMaster> getBankData() {
		
		logger.info("BankServices-->>getBankData()");
		
		Session hs = sessionFactory.getCurrentSession();
		
		List<BankMaster> bankMasterList = hs.createQuery("from BankMaster a where nvl(a.del_flg,'N') != 'Y' order by report_date desc").getResultList();
		
		return bankMasterList;
	}
	
	
	public String detailChanges(BankMaster detail, Character changeType, String userid) {

		String msg = "";

		try {
			
			Session hs = sessionFactory.getCurrentSession();

			if (changeType.equals('A')) {
				
				detail.setRcre_user_id(userid);
				detail.setRcre_time(new Date());
				detail.setDel_flg("N");
				hs.saveOrUpdate(detail);
				
				logger.info("Added Record");
				msg = "Added Successfully";
			} else if (changeType.equals('E')) {
				
				detail.setLchg_user_id(userid);
				detail.setLchg_time(new Date());
				
				hs.saveOrUpdate(detail);
				logger.info("Edited Record");
				msg = "Edited Successfully";
				
			} else if (changeType.equals('D')) {
				
				detail.setLchg_user_id(userid);
				detail.setLchg_time(new Date());
				detail.setDel_flg("Y");
				hs.saveOrUpdate(detail);
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
