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
@Table(name="T21_JURISDICTION_REVIEW_SYSTEM")
public class T21Report {
	
	private String	LOW_PRODUCT;
	private BigDecimal	LOW_30_DAYS;
	private BigDecimal	LOW_30_60_DAYS;
	private BigDecimal	LOW_60_90_DAYS;
	private BigDecimal	LOW_90_DAYS;
	private String	MEDIUM_PRODUCT;
	private BigDecimal	MEDIUM_30_DAYS;
	private BigDecimal	MEDIUM_30_60_DAYS;
	private BigDecimal	MEDIUM_60_90_DAYS;
	private BigDecimal	MEDIUM_90_DAYS;
	private String	HIGH_PRODUCT;
	private BigDecimal	HIGH_30_DAYS;
	private BigDecimal	HIGH_30_60_DAYS;
	private BigDecimal	HIGH_60_90_DAYS;
	private BigDecimal	HIGH_90_DAYS;
	private String	TOTAL_PRODUCT;
	private BigDecimal	TOTAL_30_DAYS;
	private BigDecimal	TOTAL_30_60_DAYS;
	private BigDecimal	TOTAL_60_90_DAYS;
	private BigDecimal	TOTAL_90_DAYS;
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
	public String getLOW_PRODUCT() {
		return LOW_PRODUCT;
	}
	public void setLOW_PRODUCT(String lOW_PRODUCT) {
		LOW_PRODUCT = lOW_PRODUCT;
	}
	public BigDecimal getLOW_30_DAYS() {
		return LOW_30_DAYS;
	}
	public void setLOW_30_DAYS(BigDecimal lOW_30_DAYS) {
		LOW_30_DAYS = lOW_30_DAYS;
	}
	public BigDecimal getLOW_30_60_DAYS() {
		return LOW_30_60_DAYS;
	}
	public void setLOW_30_60_DAYS(BigDecimal lOW_30_60_DAYS) {
		LOW_30_60_DAYS = lOW_30_60_DAYS;
	}
	public BigDecimal getLOW_60_90_DAYS() {
		return LOW_60_90_DAYS;
	}
	public void setLOW_60_90_DAYS(BigDecimal lOW_60_90_DAYS) {
		LOW_60_90_DAYS = lOW_60_90_DAYS;
	}
	public BigDecimal getLOW_90_DAYS() {
		return LOW_90_DAYS;
	}
	public void setLOW_90_DAYS(BigDecimal lOW_90_DAYS) {
		LOW_90_DAYS = lOW_90_DAYS;
	}
	public String getMEDIUM_PRODUCT() {
		return MEDIUM_PRODUCT;
	}
	public void setMEDIUM_PRODUCT(String mEDIUM_PRODUCT) {
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
	}
	public BigDecimal getMEDIUM_30_DAYS() {
		return MEDIUM_30_DAYS;
	}
	public void setMEDIUM_30_DAYS(BigDecimal mEDIUM_30_DAYS) {
		MEDIUM_30_DAYS = mEDIUM_30_DAYS;
	}
	public BigDecimal getMEDIUM_30_60_DAYS() {
		return MEDIUM_30_60_DAYS;
	}
	public void setMEDIUM_30_60_DAYS(BigDecimal mEDIUM_30_60_DAYS) {
		MEDIUM_30_60_DAYS = mEDIUM_30_60_DAYS;
	}
	public BigDecimal getMEDIUM_60_90_DAYS() {
		return MEDIUM_60_90_DAYS;
	}
	public void setMEDIUM_60_90_DAYS(BigDecimal mEDIUM_60_90_DAYS) {
		MEDIUM_60_90_DAYS = mEDIUM_60_90_DAYS;
	}
	public BigDecimal getMEDIUM_90_DAYS() {
		return MEDIUM_90_DAYS;
	}
	public void setMEDIUM_90_DAYS(BigDecimal mEDIUM_90_DAYS) {
		MEDIUM_90_DAYS = mEDIUM_90_DAYS;
	}
	public String getHIGH_PRODUCT() {
		return HIGH_PRODUCT;
	}
	public void setHIGH_PRODUCT(String hIGH_PRODUCT) {
		HIGH_PRODUCT = hIGH_PRODUCT;
	}
	public BigDecimal getHIGH_30_DAYS() {
		return HIGH_30_DAYS;
	}
	public void setHIGH_30_DAYS(BigDecimal hIGH_30_DAYS) {
		HIGH_30_DAYS = hIGH_30_DAYS;
	}
	public BigDecimal getHIGH_30_60_DAYS() {
		return HIGH_30_60_DAYS;
	}
	public void setHIGH_30_60_DAYS(BigDecimal hIGH_30_60_DAYS) {
		HIGH_30_60_DAYS = hIGH_30_60_DAYS;
	}
	public BigDecimal getHIGH_60_90_DAYS() {
		return HIGH_60_90_DAYS;
	}
	public void setHIGH_60_90_DAYS(BigDecimal hIGH_60_90_DAYS) {
		HIGH_60_90_DAYS = hIGH_60_90_DAYS;
	}
	public BigDecimal getHIGH_90_DAYS() {
		return HIGH_90_DAYS;
	}
	public void setHIGH_90_DAYS(BigDecimal hIGH_90_DAYS) {
		HIGH_90_DAYS = hIGH_90_DAYS;
	}
	public String getTOTAL_PRODUCT() {
		return TOTAL_PRODUCT;
	}
	public void setTOTAL_PRODUCT(String tOTAL_PRODUCT) {
		TOTAL_PRODUCT = tOTAL_PRODUCT;
	}
	public BigDecimal getTOTAL_30_DAYS() {
		return TOTAL_30_DAYS;
	}
	public void setTOTAL_30_DAYS(BigDecimal tOTAL_30_DAYS) {
		TOTAL_30_DAYS = tOTAL_30_DAYS;
	}
	public BigDecimal getTOTAL_30_60_DAYS() {
		return TOTAL_30_60_DAYS;
	}
	public void setTOTAL_30_60_DAYS(BigDecimal tOTAL_30_60_DAYS) {
		TOTAL_30_60_DAYS = tOTAL_30_60_DAYS;
	}
	public BigDecimal getTOTAL_60_90_DAYS() {
		return TOTAL_60_90_DAYS;
	}
	public void setTOTAL_60_90_DAYS(BigDecimal tOTAL_60_90_DAYS) {
		TOTAL_60_90_DAYS = tOTAL_60_90_DAYS;
	}
	public BigDecimal getTOTAL_90_DAYS() {
		return TOTAL_90_DAYS;
	}
	public void setTOTAL_90_DAYS(BigDecimal tOTAL_90_DAYS) {
		TOTAL_90_DAYS = tOTAL_90_DAYS;
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
	
	public T21Report(String lOW_PRODUCT, BigDecimal lOW_30_DAYS, BigDecimal lOW_30_60_DAYS, BigDecimal lOW_60_90_DAYS,
			BigDecimal lOW_90_DAYS, String mEDIUM_PRODUCT, BigDecimal mEDIUM_30_DAYS, BigDecimal mEDIUM_30_60_DAYS,
			BigDecimal mEDIUM_60_90_DAYS, BigDecimal mEDIUM_90_DAYS, String hIGH_PRODUCT, BigDecimal hIGH_30_DAYS,
			BigDecimal hIGH_30_60_DAYS, BigDecimal hIGH_60_90_DAYS, BigDecimal hIGH_90_DAYS, String tOTAL_PRODUCT,
			BigDecimal tOTAL_30_DAYS, BigDecimal tOTAL_30_60_DAYS, BigDecimal tOTAL_60_90_DAYS,
			BigDecimal tOTAL_90_DAYS, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG, String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE,
			Date vERIFY_DATE, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
		super();
		LOW_PRODUCT = lOW_PRODUCT;
		LOW_30_DAYS = lOW_30_DAYS;
		LOW_30_60_DAYS = lOW_30_60_DAYS;
		LOW_60_90_DAYS = lOW_60_90_DAYS;
		LOW_90_DAYS = lOW_90_DAYS;
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
		MEDIUM_30_DAYS = mEDIUM_30_DAYS;
		MEDIUM_30_60_DAYS = mEDIUM_30_60_DAYS;
		MEDIUM_60_90_DAYS = mEDIUM_60_90_DAYS;
		MEDIUM_90_DAYS = mEDIUM_90_DAYS;
		HIGH_PRODUCT = hIGH_PRODUCT;
		HIGH_30_DAYS = hIGH_30_DAYS;
		HIGH_30_60_DAYS = hIGH_30_60_DAYS;
		HIGH_60_90_DAYS = hIGH_60_90_DAYS;
		HIGH_90_DAYS = hIGH_90_DAYS;
		TOTAL_PRODUCT = tOTAL_PRODUCT;
		TOTAL_30_DAYS = tOTAL_30_DAYS;
		TOTAL_30_60_DAYS = tOTAL_30_60_DAYS;
		TOTAL_60_90_DAYS = tOTAL_60_90_DAYS;
		TOTAL_90_DAYS = tOTAL_90_DAYS;
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
	public T21Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   

}
