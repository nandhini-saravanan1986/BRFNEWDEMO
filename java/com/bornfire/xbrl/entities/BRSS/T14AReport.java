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
@Table(name = "T14A_THIRD_PARTY_INWARD_TRANSACTION")
public class T14AReport {

	private String	LOW_PRODUCT;
	private BigDecimal	LOW_CN_LOW_TRAN_COUNT;
	private BigDecimal	LOW_CN_LOW_TRAN_AMT;
	private BigDecimal	LOW_CN_MEDIUM_TRAN_COUNT;
	private BigDecimal	LOW_CN_MEDUM_TRAN_AMT;
	private BigDecimal	LOW_CN_HIGH_TRAN_COUNT;
	private BigDecimal	LOW_CN_HIGH_TRAN_AMT;
	private String	MEDIUM_PRODUCT;
	private BigDecimal	MEDIUM_CN_LOW_TRAN_COUNT;
	private BigDecimal	MEDIUM_CN_LOW_TRAN_AMT;
	private BigDecimal	MEDIUM_CN_MEDIUM_TRAN_COUNT;
	private BigDecimal	MEDIUM_CN_MEDUM_TRAN_AMT;
	private BigDecimal	MEDIUM_CN_HIGH_TRAN_COUNT;
	private BigDecimal	MEDIUM_CN_HIGH_TRAN_AMT;
	private String	HIGH_PRODUCT;
	private BigDecimal	HIGH_CN_LOW_TRAN_COUNT;
	private BigDecimal	HIGH_CN_LOW_TRAN_AMT;
	private BigDecimal	HIGH_CN_MEDIUM_TRAN_COUNT;
	private BigDecimal	HIGH_CN_MEDUM_TRAN_AMT;
	private BigDecimal	HIGH_CN_HIGH_TRAN_COUNT;
	private BigDecimal	HIGH_CN_HIGH_TRAN_AMT;
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
	public BigDecimal getLOW_CN_LOW_TRAN_COUNT() {
		return LOW_CN_LOW_TRAN_COUNT;
	}
	public void setLOW_CN_LOW_TRAN_COUNT(BigDecimal lOW_CN_LOW_TRAN_COUNT) {
		LOW_CN_LOW_TRAN_COUNT = lOW_CN_LOW_TRAN_COUNT;
	}
	public BigDecimal getLOW_CN_LOW_TRAN_AMT() {
		return LOW_CN_LOW_TRAN_AMT;
	}
	public void setLOW_CN_LOW_TRAN_AMT(BigDecimal lOW_CN_LOW_TRAN_AMT) {
		LOW_CN_LOW_TRAN_AMT = lOW_CN_LOW_TRAN_AMT;
	}
	public BigDecimal getLOW_CN_MEDIUM_TRAN_COUNT() {
		return LOW_CN_MEDIUM_TRAN_COUNT;
	}
	public void setLOW_CN_MEDIUM_TRAN_COUNT(BigDecimal lOW_CN_MEDIUM_TRAN_COUNT) {
		LOW_CN_MEDIUM_TRAN_COUNT = lOW_CN_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getLOW_CN_MEDUM_TRAN_AMT() {
		return LOW_CN_MEDUM_TRAN_AMT;
	}
	public void setLOW_CN_MEDUM_TRAN_AMT(BigDecimal lOW_CN_MEDUM_TRAN_AMT) {
		LOW_CN_MEDUM_TRAN_AMT = lOW_CN_MEDUM_TRAN_AMT;
	}
	public BigDecimal getLOW_CN_HIGH_TRAN_COUNT() {
		return LOW_CN_HIGH_TRAN_COUNT;
	}
	public void setLOW_CN_HIGH_TRAN_COUNT(BigDecimal lOW_CN_HIGH_TRAN_COUNT) {
		LOW_CN_HIGH_TRAN_COUNT = lOW_CN_HIGH_TRAN_COUNT;
	}
	public BigDecimal getLOW_CN_HIGH_TRAN_AMT() {
		return LOW_CN_HIGH_TRAN_AMT;
	}
	public void setLOW_CN_HIGH_TRAN_AMT(BigDecimal lOW_CN_HIGH_TRAN_AMT) {
		LOW_CN_HIGH_TRAN_AMT = lOW_CN_HIGH_TRAN_AMT;
	}
	public String getMEDIUM_PRODUCT() {
		return MEDIUM_PRODUCT;
	}
	public void setMEDIUM_PRODUCT(String mEDIUM_PRODUCT) {
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
	}
	public BigDecimal getMEDIUM_CN_LOW_TRAN_COUNT() {
		return MEDIUM_CN_LOW_TRAN_COUNT;
	}
	public void setMEDIUM_CN_LOW_TRAN_COUNT(BigDecimal mEDIUM_CN_LOW_TRAN_COUNT) {
		MEDIUM_CN_LOW_TRAN_COUNT = mEDIUM_CN_LOW_TRAN_COUNT;
	}
	public BigDecimal getMEDIUM_CN_LOW_TRAN_AMT() {
		return MEDIUM_CN_LOW_TRAN_AMT;
	}
	public void setMEDIUM_CN_LOW_TRAN_AMT(BigDecimal mEDIUM_CN_LOW_TRAN_AMT) {
		MEDIUM_CN_LOW_TRAN_AMT = mEDIUM_CN_LOW_TRAN_AMT;
	}
	public BigDecimal getMEDIUM_CN_MEDIUM_TRAN_COUNT() {
		return MEDIUM_CN_MEDIUM_TRAN_COUNT;
	}
	public void setMEDIUM_CN_MEDIUM_TRAN_COUNT(BigDecimal mEDIUM_CN_MEDIUM_TRAN_COUNT) {
		MEDIUM_CN_MEDIUM_TRAN_COUNT = mEDIUM_CN_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getMEDIUM_CN_MEDUM_TRAN_AMT() {
		return MEDIUM_CN_MEDUM_TRAN_AMT;
	}
	public void setMEDIUM_CN_MEDUM_TRAN_AMT(BigDecimal mEDIUM_CN_MEDUM_TRAN_AMT) {
		MEDIUM_CN_MEDUM_TRAN_AMT = mEDIUM_CN_MEDUM_TRAN_AMT;
	}
	public BigDecimal getMEDIUM_CN_HIGH_TRAN_COUNT() {
		return MEDIUM_CN_HIGH_TRAN_COUNT;
	}
	public void setMEDIUM_CN_HIGH_TRAN_COUNT(BigDecimal mEDIUM_CN_HIGH_TRAN_COUNT) {
		MEDIUM_CN_HIGH_TRAN_COUNT = mEDIUM_CN_HIGH_TRAN_COUNT;
	}
	public BigDecimal getMEDIUM_CN_HIGH_TRAN_AMT() {
		return MEDIUM_CN_HIGH_TRAN_AMT;
	}
	public void setMEDIUM_CN_HIGH_TRAN_AMT(BigDecimal mEDIUM_CN_HIGH_TRAN_AMT) {
		MEDIUM_CN_HIGH_TRAN_AMT = mEDIUM_CN_HIGH_TRAN_AMT;
	}
	public String getHIGH_PRODUCT() {
		return HIGH_PRODUCT;
	}
	public void setHIGH_PRODUCT(String hIGH_PRODUCT) {
		HIGH_PRODUCT = hIGH_PRODUCT;
	}
	public BigDecimal getHIGH_CN_LOW_TRAN_COUNT() {
		return HIGH_CN_LOW_TRAN_COUNT;
	}
	public void setHIGH_CN_LOW_TRAN_COUNT(BigDecimal hIGH_CN_LOW_TRAN_COUNT) {
		HIGH_CN_LOW_TRAN_COUNT = hIGH_CN_LOW_TRAN_COUNT;
	}
	public BigDecimal getHIGH_CN_LOW_TRAN_AMT() {
		return HIGH_CN_LOW_TRAN_AMT;
	}
	public void setHIGH_CN_LOW_TRAN_AMT(BigDecimal hIGH_CN_LOW_TRAN_AMT) {
		HIGH_CN_LOW_TRAN_AMT = hIGH_CN_LOW_TRAN_AMT;
	}
	public BigDecimal getHIGH_CN_MEDIUM_TRAN_COUNT() {
		return HIGH_CN_MEDIUM_TRAN_COUNT;
	}
	public void setHIGH_CN_MEDIUM_TRAN_COUNT(BigDecimal hIGH_CN_MEDIUM_TRAN_COUNT) {
		HIGH_CN_MEDIUM_TRAN_COUNT = hIGH_CN_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getHIGH_CN_MEDUM_TRAN_AMT() {
		return HIGH_CN_MEDUM_TRAN_AMT;
	}
	public void setHIGH_CN_MEDUM_TRAN_AMT(BigDecimal hIGH_CN_MEDUM_TRAN_AMT) {
		HIGH_CN_MEDUM_TRAN_AMT = hIGH_CN_MEDUM_TRAN_AMT;
	}
	public BigDecimal getHIGH_CN_HIGH_TRAN_COUNT() {
		return HIGH_CN_HIGH_TRAN_COUNT;
	}
	public void setHIGH_CN_HIGH_TRAN_COUNT(BigDecimal hIGH_CN_HIGH_TRAN_COUNT) {
		HIGH_CN_HIGH_TRAN_COUNT = hIGH_CN_HIGH_TRAN_COUNT;
	}
	public BigDecimal getHIGH_CN_HIGH_TRAN_AMT() {
		return HIGH_CN_HIGH_TRAN_AMT;
	}
	public void setHIGH_CN_HIGH_TRAN_AMT(BigDecimal hIGH_CN_HIGH_TRAN_AMT) {
		HIGH_CN_HIGH_TRAN_AMT = hIGH_CN_HIGH_TRAN_AMT;
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
	public T14AReport(String lOW_PRODUCT, BigDecimal lOW_CN_LOW_TRAN_COUNT, BigDecimal lOW_CN_LOW_TRAN_AMT,
			BigDecimal lOW_CN_MEDIUM_TRAN_COUNT, BigDecimal lOW_CN_MEDUM_TRAN_AMT, BigDecimal lOW_CN_HIGH_TRAN_COUNT,
			BigDecimal lOW_CN_HIGH_TRAN_AMT, String mEDIUM_PRODUCT, BigDecimal mEDIUM_CN_LOW_TRAN_COUNT,
			BigDecimal mEDIUM_CN_LOW_TRAN_AMT, BigDecimal mEDIUM_CN_MEDIUM_TRAN_COUNT,
			BigDecimal mEDIUM_CN_MEDUM_TRAN_AMT, BigDecimal mEDIUM_CN_HIGH_TRAN_COUNT,
			BigDecimal mEDIUM_CN_HIGH_TRAN_AMT, String hIGH_PRODUCT, BigDecimal hIGH_CN_LOW_TRAN_COUNT,
			BigDecimal hIGH_CN_LOW_TRAN_AMT, BigDecimal hIGH_CN_MEDIUM_TRAN_COUNT, BigDecimal hIGH_CN_MEDUM_TRAN_AMT,
			BigDecimal hIGH_CN_HIGH_TRAN_COUNT, BigDecimal hIGH_CN_HIGH_TRAN_AMT, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG) {
		super();
		LOW_PRODUCT = lOW_PRODUCT;
		LOW_CN_LOW_TRAN_COUNT = lOW_CN_LOW_TRAN_COUNT;
		LOW_CN_LOW_TRAN_AMT = lOW_CN_LOW_TRAN_AMT;
		LOW_CN_MEDIUM_TRAN_COUNT = lOW_CN_MEDIUM_TRAN_COUNT;
		LOW_CN_MEDUM_TRAN_AMT = lOW_CN_MEDUM_TRAN_AMT;
		LOW_CN_HIGH_TRAN_COUNT = lOW_CN_HIGH_TRAN_COUNT;
		LOW_CN_HIGH_TRAN_AMT = lOW_CN_HIGH_TRAN_AMT;
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
		MEDIUM_CN_LOW_TRAN_COUNT = mEDIUM_CN_LOW_TRAN_COUNT;
		MEDIUM_CN_LOW_TRAN_AMT = mEDIUM_CN_LOW_TRAN_AMT;
		MEDIUM_CN_MEDIUM_TRAN_COUNT = mEDIUM_CN_MEDIUM_TRAN_COUNT;
		MEDIUM_CN_MEDUM_TRAN_AMT = mEDIUM_CN_MEDUM_TRAN_AMT;
		MEDIUM_CN_HIGH_TRAN_COUNT = mEDIUM_CN_HIGH_TRAN_COUNT;
		MEDIUM_CN_HIGH_TRAN_AMT = mEDIUM_CN_HIGH_TRAN_AMT;
		HIGH_PRODUCT = hIGH_PRODUCT;
		HIGH_CN_LOW_TRAN_COUNT = hIGH_CN_LOW_TRAN_COUNT;
		HIGH_CN_LOW_TRAN_AMT = hIGH_CN_LOW_TRAN_AMT;
		HIGH_CN_MEDIUM_TRAN_COUNT = hIGH_CN_MEDIUM_TRAN_COUNT;
		HIGH_CN_MEDUM_TRAN_AMT = hIGH_CN_MEDUM_TRAN_AMT;
		HIGH_CN_HIGH_TRAN_COUNT = hIGH_CN_HIGH_TRAN_COUNT;
		HIGH_CN_HIGH_TRAN_AMT = hIGH_CN_HIGH_TRAN_AMT;
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
	public T14AReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
