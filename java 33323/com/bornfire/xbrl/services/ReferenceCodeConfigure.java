package com.bornfire.xbrl.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bornfire.xbrl.entities.GenRefCodeDesc;
import com.bornfire.xbrl.entities.GenRefCodeMast;

@Service
public class ReferenceCodeConfigure {

	private static final Logger logger = LoggerFactory.getLogger(ReferenceCodeConfigure.class);

	GenRefCodeDesc genRefCodeDesc;

	@Autowired
	SessionFactory sessionFactory;

	public List<GenRefCodeDesc> genRefCodeDescList() {

		logger.info("ReferenceCodeConfigure--->>>generalReferenceCodeDescriptionlist()");

		Session hs = sessionFactory.getCurrentSession();

		Query qr = hs.createQuery("from GenRefCodeDesc order by refCodeType", GenRefCodeDesc.class);

		List<GenRefCodeDesc> genRefCodeDescs = qr.getResultList();

		logger.info("returning generalReferenceCodeDescriptionlist()");
		logger.info("Size of list :" + genRefCodeDescs.size());

		return genRefCodeDescs;

	}

	public List<GenRefCodeMast> genRefCodeView(String refCodeView) {
		logger.info("ReferenceCodeConfigure--->>>genRefCodeView()");
		Session hs = sessionFactory.getCurrentSession();

		List<GenRefCodeMast> genRefCodeMastList = new ArrayList<GenRefCodeMast>();

		Query qr = hs.createNativeQuery(" select * from " + refCodeView);

		List<Object[]> result = qr.getResultList();

		for (Object[] a : result) {

			String refCodeType = (String) a[0];

			String refCode = (String) a[1];

			String refCodeDesc = (String) a[2];

			String sourceSysCode = (String) a[3];

			GenRefCodeMast genRefCodeMast = new GenRefCodeMast(refCodeType, refCode, refCodeDesc, sourceSysCode);

			genRefCodeMastList.add(genRefCodeMast);
		}

		Collections.sort(genRefCodeMastList, Comparator.comparing(GenRefCodeMast::getRefCodeDesc));

		return genRefCodeMastList;
	}

	public List<String> currList() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from currency_code_vw")
				.getResultList();

		return curr;
	}

	public List<String> isicCodeList() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from isic_code_vw")
				.getResultList();

		return curr;
	}

	public List<String> typeOfExposure() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from type_of_exposure_vw")
				.getResultList();

		return curr;
	}

	public List<String> natureOfCustomer() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from NATURE_OF_CUSTOMER_VW")
				.getResultList();

		return curr;
	}

	public List<String> typeOfInvest() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from TYPE_OF_INVEST_VW")
				.getResultList();

		return curr;
	}

	public List<String> typeOfInvestInst() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from TYPE_OF_INV_INST_VW")
				.getResultList();

		return curr;
	}

	public List<String> typeOfCapital() {

		List<String> curr = new ArrayList<String>();

		curr = sessionFactory.getCurrentSession().createNativeQuery("select ref_code from TYPE_OF_CAP_VW")
				.getResultList();

		return curr;
	}

	public List<String> trannatlist() {

		List<String> trannat = new ArrayList<String>();

		trannat = sessionFactory.getCurrentSession().createNativeQuery("select ref_code_desc from tran_nature_vw")
				.getResultList();

		return trannat;
	}

	public List<String> trantyplist() {

		List<String> trantyp = new ArrayList<String>();

		trantyp = sessionFactory.getCurrentSession().createNativeQuery("select ref_code_desc from tran_type_vw")
				.getResultList();

		return trantyp;
	}

	public List<String> councodelist() {

		List<String> trannat = new ArrayList<String>();

		trannat = sessionFactory.getCurrentSession().createNativeQuery("select REF_CODE_DESC from country_code_vw")
				.getResultList();

		return trannat;
	}

	@Transactional
	public int refEdit(String refCode, String refType, String oldSourceCode, String newSourceCode) {
		int cnt = 0;

		try {
			List<String> source = sessionFactory.getCurrentSession()
					.createQuery("select sourceSysCode from GenRefCodeMast where refCodeType=?1 and refCode=?2")
					.setParameter(1, refType).setParameter(2, refCode).getResultList();
			
			String sourceCode="";
			
			if(source.get(0)!=null) {
				
				for(String a : source) {
					
					 sourceCode = a;
				}
				
				sourceCode.replace(oldSourceCode, newSourceCode);
				
			}else {
				
				sourceCode = newSourceCode;
				
			}


			cnt = sessionFactory.getCurrentSession()
					.createQuery(
							"update GenRefCodeMast set sourceSysCode = ?1" + " where refCodeType=?2 and refCode=?3")
					.setParameter(1, sourceCode).setParameter(2, refType).setParameter(3, refCode).executeUpdate();

			logger.info("refCode Edited Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("refCode Edited fail");
			cnt = 0;
		}

		return cnt;
	}

	@Transactional
	public int refAdd(String refCode, String refType, String SourceCode) {
		int cnt = 0;

		try {
			String source = sessionFactory.getCurrentSession()
					.createQuery("select sourceSysCode from GenRefCodeMast where refCodeType=?1 and refCode=?2")
					.setParameter(1, refType).setParameter(2, refCode).getSingleResult().toString();

			if (source == null) {

				source = SourceCode;

			} else {

				source = source+ "," +SourceCode;
			}

			cnt = sessionFactory.getCurrentSession()
					.createQuery(
							"update GenRefCodeMast set sourceSysCode = ?1" + " where refCodeType=?2 and refCode=?3")
					.setParameter(1, source).setParameter(2, refType).setParameter(3, refCode).executeUpdate();

			logger.info("refCode Added Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("refCode Added fail");
			cnt = 0;
		}

		return cnt;
	}

	@Transactional
	public int refDelete(String refCode, String refType, String SourceCode) {
		int cnt = 0;

		try {
			String source = (String) sessionFactory.getCurrentSession()
					.createQuery("select sourceSysCode from GenRefCodeMast where refCodeType=?1 and refCode=?2")
					.setParameter(1, refType).setParameter(2, refCode).getSingleResult();
			String[] sub = source.split(",");

			StringBuilder sb = new StringBuilder();
			for (String s : sub) {
				if (!s.equals(SourceCode)) {

					sb.append(s).append(",");
				}

			}
			
			if(sb.length()>0) {
				
				source = sb.deleteCharAt(sb.length() - 1).toString();
				
			}else {
				
				source=null;
			}
			
			

			cnt = sessionFactory.getCurrentSession()
					.createQuery(
							"update GenRefCodeMast set sourceSysCode = ?1" + " where refCodeType=?2 and refCode=?3")
					.setParameter(1, source).setParameter(2, refType).setParameter(3, refCode).executeUpdate();

			logger.info("refCode Deteted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("refCode Deteted fail");
			cnt = 0;
		}

		return cnt;
	}

}
