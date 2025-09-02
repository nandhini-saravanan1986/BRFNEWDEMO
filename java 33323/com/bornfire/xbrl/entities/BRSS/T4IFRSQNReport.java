package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="T4_IFRS_GENERAL_INFO_QUAN_TABLE")
public class T4IFRSQNReport {

	private String	FINANCIAL_INST_CODE;
	private String	DOMESTIC;
	private String	FOREIGN_SUBSIDIARY;
	private String	FOREIGN_BRANCH;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	SUBMISSION_DATE;
	private BigDecimal	TOTAL_ASSERT;
	private BigDecimal	REGULATORY_CAPITAL;
	private BigDecimal	OPERATING_INCOME;
	private BigDecimal	NET_INCOME;
	private String	AUTOMATE;
	private String	AUTOMATE_DESC;
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
	private String	DEL_FLG;
	private String	MODIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_TIME;
	private String	QTR_FLG;
	public String getFINANCIAL_INST_CODE() {
		return FINANCIAL_INST_CODE;
	}
	public void setFINANCIAL_INST_CODE(String fINANCIAL_INST_CODE) {
		FINANCIAL_INST_CODE = fINANCIAL_INST_CODE;
	}
	public String getDOMESTIC() {
		return DOMESTIC;
	}
	public void setDOMESTIC(String dOMESTIC) {
		DOMESTIC = dOMESTIC;
	}
	public String getFOREIGN_SUBSIDIARY() {
		return FOREIGN_SUBSIDIARY;
	}
	public void setFOREIGN_SUBSIDIARY(String fOREIGN_SUBSIDIARY) {
		FOREIGN_SUBSIDIARY = fOREIGN_SUBSIDIARY;
	}
	public String getFOREIGN_BRANCH() {
		return FOREIGN_BRANCH;
	}
	public void setFOREIGN_BRANCH(String fOREIGN_BRANCH) {
		FOREIGN_BRANCH = fOREIGN_BRANCH;
	}
	public Date getSUBMISSION_DATE() {
		return SUBMISSION_DATE;
	}
	public void setSUBMISSION_DATE(Date sUBMISSION_DATE) {
		SUBMISSION_DATE = sUBMISSION_DATE;
	}
	public BigDecimal getTOTAL_ASSERT() {
		return TOTAL_ASSERT;
	}
	public void setTOTAL_ASSERT(BigDecimal tOTAL_ASSERT) {
		TOTAL_ASSERT = tOTAL_ASSERT;
	}
	public BigDecimal getREGULATORY_CAPITAL() {
		return REGULATORY_CAPITAL;
	}
	public void setREGULATORY_CAPITAL(BigDecimal rEGULATORY_CAPITAL) {
		REGULATORY_CAPITAL = rEGULATORY_CAPITAL;
	}
	public BigDecimal getOPERATING_INCOME() {
		return OPERATING_INCOME;
	}
	public void setOPERATING_INCOME(BigDecimal oPERATING_INCOME) {
		OPERATING_INCOME = oPERATING_INCOME;
	}
	public BigDecimal getNET_INCOME() {
		return NET_INCOME;
	}
	public void setNET_INCOME(BigDecimal nET_INCOME) {
		NET_INCOME = nET_INCOME;
	}
	public String getAUTOMATE() {
		return AUTOMATE;
	}
	public void setAUTOMATE(String aUTOMATE) {
		AUTOMATE = aUTOMATE;
	}
	public String getAUTOMATE_DESC() {
		return AUTOMATE_DESC;
	}
	public void setAUTOMATE_DESC(String aUTOMATE_DESC) {
		AUTOMATE_DESC = aUTOMATE_DESC;
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
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}
	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}
	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
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
	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Date getVERIFY_TIME() {
		return VERIFY_TIME;
	}
	public void setVERIFY_TIME(Date vERIFY_TIME) {
		VERIFY_TIME = vERIFY_TIME;
	}
	public String getQTR_FLG() {
		return QTR_FLG;
	}
	public void setQTR_FLG(String qTR_FLG) {
		QTR_FLG = qTR_FLG;
	}
	public T4IFRSQNReport(String fINANCIAL_INST_CODE, String dOMESTIC, String fOREIGN_SUBSIDIARY, String fOREIGN_BRANCH,
			Date sUBMISSION_DATE, BigDecimal tOTAL_ASSERT, BigDecimal rEGULATORY_CAPITAL, BigDecimal oPERATING_INCOME,
			BigDecimal nET_INCOME, String aUTOMATE, String aUTOMATE_DESC, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		FINANCIAL_INST_CODE = fINANCIAL_INST_CODE;
		DOMESTIC = dOMESTIC;
		FOREIGN_SUBSIDIARY = fOREIGN_SUBSIDIARY;
		FOREIGN_BRANCH = fOREIGN_BRANCH;
		SUBMISSION_DATE = sUBMISSION_DATE;
		TOTAL_ASSERT = tOTAL_ASSERT;
		REGULATORY_CAPITAL = rEGULATORY_CAPITAL;
		OPERATING_INCOME = oPERATING_INCOME;
		NET_INCOME = nET_INCOME;
		AUTOMATE = aUTOMATE;
		AUTOMATE_DESC = aUTOMATE_DESC;
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
		DEL_FLG = dEL_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
		QTR_FLG = qTR_FLG;
	}
	public T4IFRSQNReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
