package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T30_AMLCFT_APPL_TABLE")
public class T30Report {
	private String	A1PRODUCT_DOMESTIC;
	private String	A2PRODUCT_FOREIGN;
	private String	A3PRODUCT_SUBSIDIARIES;
	private String	A4PRODUCT_JOINT_VENTURES;
	private String	A5PRODUCT_AGENT;
	private String	A6PRODUCT_SERVICE_PROVIDER;
	private String	B1PRODUCT_DOMESTIC;
	private String	B2PRODUCT_FOREIGN;
	private String	B3PRODUCT_SUBSIDIARIES;
	private String	B4PRODUCT_JOINT_VENTURES;
	private String	B5PRODUCT_AGENT;
	private String	B6PRODUCT_SERVICE_PROVIDER;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	VERIFY_FLG;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_DATE;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	public String getA1PRODUCT_DOMESTIC() {
		return A1PRODUCT_DOMESTIC;
	}
	public void setA1PRODUCT_DOMESTIC(String a1product_DOMESTIC) {
		A1PRODUCT_DOMESTIC = a1product_DOMESTIC;
	}
	public String getA2PRODUCT_FOREIGN() {
		return A2PRODUCT_FOREIGN;
	}
	public void setA2PRODUCT_FOREIGN(String a2product_FOREIGN) {
		A2PRODUCT_FOREIGN = a2product_FOREIGN;
	}
	public String getA3PRODUCT_SUBSIDIARIES() {
		return A3PRODUCT_SUBSIDIARIES;
	}
	public void setA3PRODUCT_SUBSIDIARIES(String a3product_SUBSIDIARIES) {
		A3PRODUCT_SUBSIDIARIES = a3product_SUBSIDIARIES;
	}
	public String getA4PRODUCT_JOINT_VENTURES() {
		return A4PRODUCT_JOINT_VENTURES;
	}
	public void setA4PRODUCT_JOINT_VENTURES(String a4product_JOINT_VENTURES) {
		A4PRODUCT_JOINT_VENTURES = a4product_JOINT_VENTURES;
	}
	public String getA5PRODUCT_AGENT() {
		return A5PRODUCT_AGENT;
	}
	public void setA5PRODUCT_AGENT(String a5product_AGENT) {
		A5PRODUCT_AGENT = a5product_AGENT;
	}
	public String getA6PRODUCT_SERVICE_PROVIDER() {
		return A6PRODUCT_SERVICE_PROVIDER;
	}
	public void setA6PRODUCT_SERVICE_PROVIDER(String a6product_SERVICE_PROVIDER) {
		A6PRODUCT_SERVICE_PROVIDER = a6product_SERVICE_PROVIDER;
	}
	public String getB1PRODUCT_DOMESTIC() {
		return B1PRODUCT_DOMESTIC;
	}
	public void setB1PRODUCT_DOMESTIC(String b1product_DOMESTIC) {
		B1PRODUCT_DOMESTIC = b1product_DOMESTIC;
	}
	public String getB2PRODUCT_FOREIGN() {
		return B2PRODUCT_FOREIGN;
	}
	public void setB2PRODUCT_FOREIGN(String b2product_FOREIGN) {
		B2PRODUCT_FOREIGN = b2product_FOREIGN;
	}
	public String getB3PRODUCT_SUBSIDIARIES() {
		return B3PRODUCT_SUBSIDIARIES;
	}
	public void setB3PRODUCT_SUBSIDIARIES(String b3product_SUBSIDIARIES) {
		B3PRODUCT_SUBSIDIARIES = b3product_SUBSIDIARIES;
	}
	public String getB4PRODUCT_JOINT_VENTURES() {
		return B4PRODUCT_JOINT_VENTURES;
	}
	public void setB4PRODUCT_JOINT_VENTURES(String b4product_JOINT_VENTURES) {
		B4PRODUCT_JOINT_VENTURES = b4product_JOINT_VENTURES;
	}
	public String getB5PRODUCT_AGENT() {
		return B5PRODUCT_AGENT;
	}
	public void setB5PRODUCT_AGENT(String b5product_AGENT) {
		B5PRODUCT_AGENT = b5product_AGENT;
	}
	public String getB6PRODUCT_SERVICE_PROVIDER() {
		return B6PRODUCT_SERVICE_PROVIDER;
	}
	public void setB6PRODUCT_SERVICE_PROVIDER(String b6product_SERVICE_PROVIDER) {
		B6PRODUCT_SERVICE_PROVIDER = b6product_SERVICE_PROVIDER;
	}
	public String getREPORT_CODE() {
		return REPORT_CODE;
	}
	public void setREPORT_CODE(String rEPORT_CODE) {
		REPORT_CODE = rEPORT_CODE;
	}
	public String getREPORT_NAME() {
		return REPORT_NAME;
	}
	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public Date getREPORT_DUE_DATE() {
		return REPORT_DUE_DATE;
	}
	public void setREPORT_DUE_DATE(Date rEPORT_DUE_DATE) {
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
	}
	public Date getREP_SUBMIT_DATE() {
		return REP_SUBMIT_DATE;
	}
	public void setREP_SUBMIT_DATE(Date rEP_SUBMIT_DATE) {
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
	}
	public Date getREP_PERIOD_FROM() {
		return REP_PERIOD_FROM;
	}
	public void setREP_PERIOD_FROM(Date rEP_PERIOD_FROM) {
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
	}
	public Date getREP_PERIOD_TO() {
		return REP_PERIOD_TO;
	}
	public void setREP_PERIOD_TO(Date rEP_PERIOD_TO) {
		REP_PERIOD_TO = rEP_PERIOD_TO;
	}
	public String getREP_FREQ() {
		return REP_FREQ;
	}
	public void setREP_FREQ(String rEP_FREQ) {
		REP_FREQ = rEP_FREQ;
	}
	public String getNIL_REPORT_FLG() {
		return NIL_REPORT_FLG;
	}
	public void setNIL_REPORT_FLG(String nIL_REPORT_FLG) {
		NIL_REPORT_FLG = nIL_REPORT_FLG;
	}
	public String getARCH_FLG() {
		return ARCH_FLG;
	}
	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
	}
	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}
	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}
	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}
	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
	}
	public String getVERIFY_FLG() {
		return VERIFY_FLG;
	}
	public void setVERIFY_FLG(String vERIFY_FLG) {
		VERIFY_FLG = vERIFY_FLG;
	}
	public Date getENTRY_DATE() {
		return ENTRY_DATE;
	}
	public void setENTRY_DATE(Date eNTRY_DATE) {
		ENTRY_DATE = eNTRY_DATE;
	}
	public Date getMODIFY_DATE() {
		return MODIFY_DATE;
	}
	public void setMODIFY_DATE(Date mODIFY_DATE) {
		MODIFY_DATE = mODIFY_DATE;
	}
	public Date getVERIFY_DATE() {
		return VERIFY_DATE;
	}
	public void setVERIFY_DATE(Date vERIFY_DATE) {
		VERIFY_DATE = vERIFY_DATE;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public T30Report(String a1product_DOMESTIC, String a2product_FOREIGN, String a3product_SUBSIDIARIES,
			String a4product_JOINT_VENTURES, String a5product_AGENT, String a6product_SERVICE_PROVIDER,
			String b1product_DOMESTIC, String b2product_FOREIGN, String b3product_SUBSIDIARIES,
			String b4product_JOINT_VENTURES, String b5product_AGENT, String b6product_SERVICE_PROVIDER,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE,
			Date vERIFY_DATE, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
		super();
		A1PRODUCT_DOMESTIC = a1product_DOMESTIC;
		A2PRODUCT_FOREIGN = a2product_FOREIGN;
		A3PRODUCT_SUBSIDIARIES = a3product_SUBSIDIARIES;
		A4PRODUCT_JOINT_VENTURES = a4product_JOINT_VENTURES;
		A5PRODUCT_AGENT = a5product_AGENT;
		A6PRODUCT_SERVICE_PROVIDER = a6product_SERVICE_PROVIDER;
		B1PRODUCT_DOMESTIC = b1product_DOMESTIC;
		B2PRODUCT_FOREIGN = b2product_FOREIGN;
		B3PRODUCT_SUBSIDIARIES = b3product_SUBSIDIARIES;
		B4PRODUCT_JOINT_VENTURES = b4product_JOINT_VENTURES;
		B5PRODUCT_AGENT = b5product_AGENT;
		B6PRODUCT_SERVICE_PROVIDER = b6product_SERVICE_PROVIDER;
		REPORT_CODE = rEPORT_CODE;
		REPORT_NAME = rEPORT_NAME;
		REPORT_DATE = rEPORT_DATE;
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
		REP_PERIOD_TO = rEP_PERIOD_TO;
		REP_FREQ = rEP_FREQ;
		NIL_REPORT_FLG = nIL_REPORT_FLG;
		ARCH_FLG = aRCH_FLG;
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		VERIFY_FLG = vERIFY_FLG;
		ENTRY_DATE = eNTRY_DATE;
		MODIFY_DATE = mODIFY_DATE;
		VERIFY_DATE = vERIFY_DATE;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
	}
	public T30Report() {
		super();
		// TODO Auto-generated constructor stub
	}
  

}
