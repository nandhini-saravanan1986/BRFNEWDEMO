package com.bornfire.xbrl.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bornfire.xbrl.entities.EtlErrorInfo;
import com.bornfire.xbrl.entities.EtlProcessInfo;
import com.bornfire.xbrl.entities.XBRLProceduresRep;

@Service
public class EtlServices {
	
	@Autowired
	XBRLProceduresRep xbrlProceduresRep;
	
	@Autowired
	SessionFactory sessionFactory;

	public List<EtlErrorInfo> getEtlError() {
		
		Session hs = sessionFactory.getCurrentSession();
		List<EtlErrorInfo> error= hs.createQuery("from EtlErrorInfo a order by a.report_date desc ",EtlErrorInfo.class).setMaxResults(15).getResultList();
		
		return error;
	}

	public List<EtlProcessInfo> getEtlStatus() {
		
		Session hs = sessionFactory.getCurrentSession();
		List<EtlProcessInfo> info=hs.createQuery("from EtlProcessInfo a order by a.process_id desc",EtlProcessInfo.class).setMaxResults(15).list();
		
		return info;
	}
	
	
}
