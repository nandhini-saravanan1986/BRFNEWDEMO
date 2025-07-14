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
@Table(name="T20_JURISDICTION_CUSTOMER_RISK_PROFILE")
public class T20Report {

	private String	LOW_PRODUCT;
	private BigDecimal	LOW_PRESENCE;
	private BigDecimal	LOW_OPERATIONS;
	private BigDecimal	LOW_TOTAL_LOW;
	private String	MEDIUM_PRODUCT;
	private BigDecimal	MEDIUM_PRESENCE;
	private BigDecimal	MEDIUM_OPERATIONS;
	private BigDecimal	MEDIUM_TOTAL_LOW;
	private String	HIGH_PRODUCT;
	private BigDecimal	HIGH_PRESENCE;
	private BigDecimal	HIGH_OPERATIONS;
	private BigDecimal	HIGH_TOTAL_LOW;
	private String	TOTAL_PRODUCT;
	private BigDecimal	TOTAL_PRESENCE;
	private BigDecimal	TOTAL_OPERATIONS;
	private BigDecimal	TOTAL_TOTAL_LOW;
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
	public String getLOW_PRODUCT() {
		return LOW_PRODUCT;
	}
	public void setLOW_PRODUCT(String lOW_PRODUCT) {
		LOW_PRODUCT = lOW_PRODUCT;
	}
	public BigDecimal getLOW_PRESENCE() {
		return LOW_PRESENCE;
	}
	public void setLOW_PRESENCE(BigDecimal lOW_PRESENCE) {
		LOW_PRESENCE = lOW_PRESENCE;
	}
	public BigDecimal getLOW_OPERATIONS() {
		return LOW_OPERATIONS;
	}
	public void setLOW_OPERATIONS(BigDecimal lOW_OPERATIONS) {
		LOW_OPERATIONS = lOW_OPERATIONS;
	}
	public BigDecimal getLOW_TOTAL_LOW() {
		return LOW_TOTAL_LOW;
	}
	public void setLOW_TOTAL_LOW(BigDecimal lOW_TOTAL_LOW) {
		LOW_TOTAL_LOW = lOW_TOTAL_LOW;
	}
	public String getMEDIUM_PRODUCT() {
		return MEDIUM_PRODUCT;
	}
	public void setMEDIUM_PRODUCT(String mEDIUM_PRODUCT) {
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
	}
	public BigDecimal getMEDIUM_PRESENCE() {
		return MEDIUM_PRESENCE;
	}
	public void setMEDIUM_PRESENCE(BigDecimal mEDIUM_PRESENCE) {
		MEDIUM_PRESENCE = mEDIUM_PRESENCE;
	}
	public BigDecimal getMEDIUM_OPERATIONS() {
		return MEDIUM_OPERATIONS;
	}
	public void setMEDIUM_OPERATIONS(BigDecimal mEDIUM_OPERATIONS) {
		MEDIUM_OPERATIONS = mEDIUM_OPERATIONS;
	}
	public BigDecimal getMEDIUM_TOTAL_LOW() {
		return MEDIUM_TOTAL_LOW;
	}
	public void setMEDIUM_TOTAL_LOW(BigDecimal mEDIUM_TOTAL_LOW) {
		MEDIUM_TOTAL_LOW = mEDIUM_TOTAL_LOW;
	}
	public String getHIGH_PRODUCT() {
		return HIGH_PRODUCT;
	}
	public void setHIGH_PRODUCT(String hIGH_PRODUCT) {
		HIGH_PRODUCT = hIGH_PRODUCT;
	}
	public BigDecimal getHIGH_PRESENCE() {
		return HIGH_PRESENCE;
	}
	public void setHIGH_PRESENCE(BigDecimal hIGH_PRESENCE) {
		HIGH_PRESENCE = hIGH_PRESENCE;
	}
	public BigDecimal getHIGH_OPERATIONS() {
		return HIGH_OPERATIONS;
	}
	public void setHIGH_OPERATIONS(BigDecimal hIGH_OPERATIONS) {
		HIGH_OPERATIONS = hIGH_OPERATIONS;
	}
	public BigDecimal getHIGH_TOTAL_LOW() {
		return HIGH_TOTAL_LOW;
	}
	public void setHIGH_TOTAL_LOW(BigDecimal hIGH_TOTAL_LOW) {
		HIGH_TOTAL_LOW = hIGH_TOTAL_LOW;
	}
	public String getTOTAL_PRODUCT() {
		return TOTAL_PRODUCT;
	}
	public void setTOTAL_PRODUCT(String tOTAL_PRODUCT) {
		TOTAL_PRODUCT = tOTAL_PRODUCT;
	}
	public BigDecimal getTOTAL_PRESENCE() {
		return TOTAL_PRESENCE;
	}
	public void setTOTAL_PRESENCE(BigDecimal tOTAL_PRESENCE) {
		TOTAL_PRESENCE = tOTAL_PRESENCE;
	}
	public BigDecimal getTOTAL_OPERATIONS() {
		return TOTAL_OPERATIONS;
	}
	public void setTOTAL_OPERATIONS(BigDecimal tOTAL_OPERATIONS) {
		TOTAL_OPERATIONS = tOTAL_OPERATIONS;
	}
	public BigDecimal getTOTAL_TOTAL_LOW() {
		return TOTAL_TOTAL_LOW;
	}
	public void setTOTAL_TOTAL_LOW(BigDecimal tOTAL_TOTAL_LOW) {
		TOTAL_TOTAL_LOW = tOTAL_TOTAL_LOW;
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
	public T20Report(String lOW_PRODUCT, BigDecimal lOW_PRESENCE, BigDecimal lOW_OPERATIONS, BigDecimal lOW_TOTAL_LOW,
			String mEDIUM_PRODUCT, BigDecimal mEDIUM_PRESENCE, BigDecimal mEDIUM_OPERATIONS,
			BigDecimal mEDIUM_TOTAL_LOW, String hIGH_PRODUCT, BigDecimal hIGH_PRESENCE, BigDecimal hIGH_OPERATIONS,
			BigDecimal hIGH_TOTAL_LOW, String tOTAL_PRODUCT, BigDecimal tOTAL_PRESENCE, BigDecimal tOTAL_OPERATIONS,
			BigDecimal tOTAL_TOTAL_LOW, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG) {
		super();
		LOW_PRODUCT = lOW_PRODUCT;
		LOW_PRESENCE = lOW_PRESENCE;
		LOW_OPERATIONS = lOW_OPERATIONS;
		LOW_TOTAL_LOW = lOW_TOTAL_LOW;
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
		MEDIUM_PRESENCE = mEDIUM_PRESENCE;
		MEDIUM_OPERATIONS = mEDIUM_OPERATIONS;
		MEDIUM_TOTAL_LOW = mEDIUM_TOTAL_LOW;
		HIGH_PRODUCT = hIGH_PRODUCT;
		HIGH_PRESENCE = hIGH_PRESENCE;
		HIGH_OPERATIONS = hIGH_OPERATIONS;
		HIGH_TOTAL_LOW = hIGH_TOTAL_LOW;
		TOTAL_PRODUCT = tOTAL_PRODUCT;
		TOTAL_PRESENCE = tOTAL_PRESENCE;
		TOTAL_OPERATIONS = tOTAL_OPERATIONS;
		TOTAL_TOTAL_LOW = tOTAL_TOTAL_LOW;
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
	}
	public T20Report() {
		super();
		// TODO Auto-generated constructor stub
	}

}
