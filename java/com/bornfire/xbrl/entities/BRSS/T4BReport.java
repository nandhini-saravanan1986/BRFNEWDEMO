package com.bornfire.xbrl.entities.BRSS;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="T4B_CROSS_BORDER_FLOWFUND_NPO_TABLE")
public class T4BReport  implements Serializable {

	private String	COUNTRY_NAME;
	private String	BANK_AML_RATING;
	private String	RBS_RETURN;
	private BigDecimal	LOW_INWARD_COUNT;
	private BigDecimal	LOW_INWARD_AMOUNT;
	private BigDecimal	LOW_OUTWARD_COUNT;
	private BigDecimal	LOW_OUTWARD_AMOUNT;
	private BigDecimal	MEDIUM_INWARD_COUNT;
	private BigDecimal	MEDIUM_INWARD_AMOUNT;
	private BigDecimal	MEDIUM_OUTWARD_COUNT;
	private BigDecimal	MEDIUM_OUTWARD_AMOUNT;
	private BigDecimal	HIGH_INWARD_COUNT;
	private BigDecimal	HIGH_INWARD_AMOUNT;
	private BigDecimal	HIGH_OUTWARD_COUNT;
	private BigDecimal	HIGH_OUTWARD_AMOUNT;
	private BigDecimal	WALKIN_INWARD_COUNT;
	private BigDecimal	WALKIN_INWARD_AMOUNT;
	private BigDecimal	WALKIN_OUTWARD_COUNT;
	private BigDecimal	WALKIN_OUTWARD_AMOUNT;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern= "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private BigDecimal	TOTAL_INWARD_COUNT;
	private BigDecimal	TOTAL_INWARD_AMOUNT;
	private BigDecimal	TOTAL_OUTWARD_COUNT;
	@Id
	private BigDecimal INSTANCE_CODE;
	
	public BigDecimal getINSTANCE_CODE() {
		return INSTANCE_CODE;
	}
	public void setINSTANCE_CODE(BigDecimal iNSTANCE_CODE) {
		INSTANCE_CODE = iNSTANCE_CODE;
	}
	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}
	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		COUNTRY_NAME = cOUNTRY_NAME;
	}
	public String getBANK_AML_RATING() {
		return BANK_AML_RATING;
	}
	public void setBANK_AML_RATING(String bANK_AML_RATING) {
		BANK_AML_RATING = bANK_AML_RATING;
	}
	public String getRBS_RETURN() {
		return RBS_RETURN;
	}
	public void setRBS_RETURN(String rBS_RETURN) {
		RBS_RETURN = rBS_RETURN;
	}
	public BigDecimal getLOW_INWARD_COUNT() {
		return LOW_INWARD_COUNT;
	}
	public void setLOW_INWARD_COUNT(BigDecimal lOW_INWARD_COUNT) {
		LOW_INWARD_COUNT = lOW_INWARD_COUNT;
	}
	public BigDecimal getLOW_INWARD_AMOUNT() {
		return LOW_INWARD_AMOUNT;
	}
	public void setLOW_INWARD_AMOUNT(BigDecimal lOW_INWARD_AMOUNT) {
		LOW_INWARD_AMOUNT = lOW_INWARD_AMOUNT;
	}
	public BigDecimal getLOW_OUTWARD_COUNT() {
		return LOW_OUTWARD_COUNT;
	}
	public void setLOW_OUTWARD_COUNT(BigDecimal lOW_OUTWARD_COUNT) {
		LOW_OUTWARD_COUNT = lOW_OUTWARD_COUNT;
	}
	public BigDecimal getLOW_OUTWARD_AMOUNT() {
		return LOW_OUTWARD_AMOUNT;
	}
	public void setLOW_OUTWARD_AMOUNT(BigDecimal lOW_OUTWARD_AMOUNT) {
		LOW_OUTWARD_AMOUNT = lOW_OUTWARD_AMOUNT;
	}
	public BigDecimal getMEDIUM_INWARD_COUNT() {
		return MEDIUM_INWARD_COUNT;
	}
	public void setMEDIUM_INWARD_COUNT(BigDecimal mEDIUM_INWARD_COUNT) {
		MEDIUM_INWARD_COUNT = mEDIUM_INWARD_COUNT;
	}
	public BigDecimal getMEDIUM_INWARD_AMOUNT() {
		return MEDIUM_INWARD_AMOUNT;
	}
	public void setMEDIUM_INWARD_AMOUNT(BigDecimal mEDIUM_INWARD_AMOUNT) {
		MEDIUM_INWARD_AMOUNT = mEDIUM_INWARD_AMOUNT;
	}
	public BigDecimal getMEDIUM_OUTWARD_COUNT() {
		return MEDIUM_OUTWARD_COUNT;
	}
	public void setMEDIUM_OUTWARD_COUNT(BigDecimal mEDIUM_OUTWARD_COUNT) {
		MEDIUM_OUTWARD_COUNT = mEDIUM_OUTWARD_COUNT;
	}
	public BigDecimal getMEDIUM_OUTWARD_AMOUNT() {
		return MEDIUM_OUTWARD_AMOUNT;
	}
	public void setMEDIUM_OUTWARD_AMOUNT(BigDecimal mEDIUM_OUTWARD_AMOUNT) {
		MEDIUM_OUTWARD_AMOUNT = mEDIUM_OUTWARD_AMOUNT;
	}
	public BigDecimal getHIGH_INWARD_COUNT() {
		return HIGH_INWARD_COUNT;
	}
	public void setHIGH_INWARD_COUNT(BigDecimal hIGH_INWARD_COUNT) {
		HIGH_INWARD_COUNT = hIGH_INWARD_COUNT;
	}
	public BigDecimal getHIGH_INWARD_AMOUNT() {
		return HIGH_INWARD_AMOUNT;
	}
	public void setHIGH_INWARD_AMOUNT(BigDecimal hIGH_INWARD_AMOUNT) {
		HIGH_INWARD_AMOUNT = hIGH_INWARD_AMOUNT;
	}
	public BigDecimal getHIGH_OUTWARD_COUNT() {
		return HIGH_OUTWARD_COUNT;
	}
	public void setHIGH_OUTWARD_COUNT(BigDecimal hIGH_OUTWARD_COUNT) {
		HIGH_OUTWARD_COUNT = hIGH_OUTWARD_COUNT;
	}
	public BigDecimal getHIGH_OUTWARD_AMOUNT() {
		return HIGH_OUTWARD_AMOUNT;
	}
	public void setHIGH_OUTWARD_AMOUNT(BigDecimal hIGH_OUTWARD_AMOUNT) {
		HIGH_OUTWARD_AMOUNT = hIGH_OUTWARD_AMOUNT;
	}
	public BigDecimal getWALKIN_INWARD_COUNT() {
		return WALKIN_INWARD_COUNT;
	}
	public void setWALKIN_INWARD_COUNT(BigDecimal wALKIN_INWARD_COUNT) {
		WALKIN_INWARD_COUNT = wALKIN_INWARD_COUNT;
	}
	public BigDecimal getWALKIN_INWARD_AMOUNT() {
		return WALKIN_INWARD_AMOUNT;
	}
	public void setWALKIN_INWARD_AMOUNT(BigDecimal wALKIN_INWARD_AMOUNT) {
		WALKIN_INWARD_AMOUNT = wALKIN_INWARD_AMOUNT;
	}
	public BigDecimal getWALKIN_OUTWARD_COUNT() {
		return WALKIN_OUTWARD_COUNT;
	}
	public void setWALKIN_OUTWARD_COUNT(BigDecimal wALKIN_OUTWARD_COUNT) {
		WALKIN_OUTWARD_COUNT = wALKIN_OUTWARD_COUNT;
	}
	public BigDecimal getWALKIN_OUTWARD_AMOUNT() {
		return WALKIN_OUTWARD_AMOUNT;
	}
	public void setWALKIN_OUTWARD_AMOUNT(BigDecimal wALKIN_OUTWARD_AMOUNT) {
		WALKIN_OUTWARD_AMOUNT = wALKIN_OUTWARD_AMOUNT;
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
	public BigDecimal getTOTAL_INWARD_COUNT() {
		return TOTAL_INWARD_COUNT;
	}
	public void setTOTAL_INWARD_COUNT(BigDecimal tOTAL_INWARD_COUNT) {
		TOTAL_INWARD_COUNT = tOTAL_INWARD_COUNT;
	}
	public BigDecimal getTOTAL_INWARD_AMOUNT() {
		return TOTAL_INWARD_AMOUNT;
	}
	public void setTOTAL_INWARD_AMOUNT(BigDecimal tOTAL_INWARD_AMOUNT) {
		TOTAL_INWARD_AMOUNT = tOTAL_INWARD_AMOUNT;
	}
	public BigDecimal getTOTAL_OUTWARD_COUNT() {
		return TOTAL_OUTWARD_COUNT;
	}
	public void setTOTAL_OUTWARD_COUNT(BigDecimal tOTAL_OUTWARD_COUNT) {
		TOTAL_OUTWARD_COUNT = tOTAL_OUTWARD_COUNT;
	}
	
	public T4BReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T4BReport(String cOUNTRY_NAME, String bANK_AML_RATING, String rBS_RETURN, BigDecimal lOW_INWARD_COUNT,
			BigDecimal lOW_INWARD_AMOUNT, BigDecimal lOW_OUTWARD_COUNT, BigDecimal lOW_OUTWARD_AMOUNT,
			BigDecimal mEDIUM_INWARD_COUNT, BigDecimal mEDIUM_INWARD_AMOUNT, BigDecimal mEDIUM_OUTWARD_COUNT,
			BigDecimal mEDIUM_OUTWARD_AMOUNT, BigDecimal hIGH_INWARD_COUNT, BigDecimal hIGH_INWARD_AMOUNT,
			BigDecimal hIGH_OUTWARD_COUNT, BigDecimal hIGH_OUTWARD_AMOUNT, BigDecimal wALKIN_INWARD_COUNT,
			BigDecimal wALKIN_INWARD_AMOUNT, BigDecimal wALKIN_OUTWARD_COUNT, BigDecimal wALKIN_OUTWARD_AMOUNT,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			BigDecimal tOTAL_INWARD_COUNT, BigDecimal tOTAL_INWARD_AMOUNT, BigDecimal tOTAL_OUTWARD_COUNT,
			BigDecimal iNSTANCE_CODE) {
		super();
		COUNTRY_NAME = cOUNTRY_NAME;
		BANK_AML_RATING = bANK_AML_RATING;
		RBS_RETURN = rBS_RETURN;
		LOW_INWARD_COUNT = lOW_INWARD_COUNT;
		LOW_INWARD_AMOUNT = lOW_INWARD_AMOUNT;
		LOW_OUTWARD_COUNT = lOW_OUTWARD_COUNT;
		LOW_OUTWARD_AMOUNT = lOW_OUTWARD_AMOUNT;
		MEDIUM_INWARD_COUNT = mEDIUM_INWARD_COUNT;
		MEDIUM_INWARD_AMOUNT = mEDIUM_INWARD_AMOUNT;
		MEDIUM_OUTWARD_COUNT = mEDIUM_OUTWARD_COUNT;
		MEDIUM_OUTWARD_AMOUNT = mEDIUM_OUTWARD_AMOUNT;
		HIGH_INWARD_COUNT = hIGH_INWARD_COUNT;
		HIGH_INWARD_AMOUNT = hIGH_INWARD_AMOUNT;
		HIGH_OUTWARD_COUNT = hIGH_OUTWARD_COUNT;
		HIGH_OUTWARD_AMOUNT = hIGH_OUTWARD_AMOUNT;
		WALKIN_INWARD_COUNT = wALKIN_INWARD_COUNT;
		WALKIN_INWARD_AMOUNT = wALKIN_INWARD_AMOUNT;
		WALKIN_OUTWARD_COUNT = wALKIN_OUTWARD_COUNT;
		WALKIN_OUTWARD_AMOUNT = wALKIN_OUTWARD_AMOUNT;
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
		TOTAL_INWARD_COUNT = tOTAL_INWARD_COUNT;
		TOTAL_INWARD_AMOUNT = tOTAL_INWARD_AMOUNT;
		TOTAL_OUTWARD_COUNT = tOTAL_OUTWARD_COUNT;
		INSTANCE_CODE = iNSTANCE_CODE;
	}

	
}
