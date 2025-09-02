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
@Table(name = "T15B_AVERAGE_TRANSACTION_VALUE")
public class T15BReport {

	private String	LESS_1PRODUCT;
	private BigDecimal	LESS_2LOW_CUST_COUNT;
	private BigDecimal	LESS_3MEDIUM_CUST_COUNT;
	private BigDecimal	LESS_4HIGH_CUST_COUNT;
	private String	A1_5_PRODUCT;
	private BigDecimal	A1_5_LOW_CUST_COUNT;
	private BigDecimal	A1_5_MEDIUM_CUST_COUNT;
	private BigDecimal	A1_5_HIGH_CUST_COUNT;
	private String	A5_10_PRODUCT;
	private BigDecimal	A5_10_LOW_CUST_COUNT;
	private BigDecimal	A5_10_MEDIUM_CUST_COUNT;
	private BigDecimal	A5_10_HIGH_CUST_COUNT;
	private String	A10_20_PRODUCT;
	private BigDecimal	A10_20_LOW_CUST_COUNT;
	private BigDecimal	A10_20_MEDIUM_CUST_COUNT;
	private BigDecimal	A10_20_HIGH_CUST_COUNT;
	private String	A20_PRODUCT;
	private BigDecimal	A20_LOW_CUST_COUNT;
	private BigDecimal	A20_MEDIUM_CUST_COUNT;
	private BigDecimal	A20_HIGH_CUST_COUNT;
	private String	TOTAL_PRODUCT;
	private BigDecimal	TOTAL_LOW_CUST_COUNT;
	private BigDecimal	TOTAL_MEDIUM_CUST_COUNT;
	private BigDecimal	TOTAL_HIGH_CUST_COUNT;
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
	public String getLESS_1PRODUCT() {
		return LESS_1PRODUCT;
	}
	public void setLESS_1PRODUCT(String lESS_1PRODUCT) {
		LESS_1PRODUCT = lESS_1PRODUCT;
	}
	public BigDecimal getLESS_2LOW_CUST_COUNT() {
		return LESS_2LOW_CUST_COUNT;
	}
	public void setLESS_2LOW_CUST_COUNT(BigDecimal lESS_2LOW_CUST_COUNT) {
		LESS_2LOW_CUST_COUNT = lESS_2LOW_CUST_COUNT;
	}
	public BigDecimal getLESS_3MEDIUM_CUST_COUNT() {
		return LESS_3MEDIUM_CUST_COUNT;
	}
	public void setLESS_3MEDIUM_CUST_COUNT(BigDecimal lESS_3MEDIUM_CUST_COUNT) {
		LESS_3MEDIUM_CUST_COUNT = lESS_3MEDIUM_CUST_COUNT;
	}
	public BigDecimal getLESS_4HIGH_CUST_COUNT() {
		return LESS_4HIGH_CUST_COUNT;
	}
	public void setLESS_4HIGH_CUST_COUNT(BigDecimal lESS_4HIGH_CUST_COUNT) {
		LESS_4HIGH_CUST_COUNT = lESS_4HIGH_CUST_COUNT;
	}
	public String getA1_5_PRODUCT() {
		return A1_5_PRODUCT;
	}
	public void setA1_5_PRODUCT(String a1_5_PRODUCT) {
		A1_5_PRODUCT = a1_5_PRODUCT;
	}
	public BigDecimal getA1_5_LOW_CUST_COUNT() {
		return A1_5_LOW_CUST_COUNT;
	}
	public void setA1_5_LOW_CUST_COUNT(BigDecimal a1_5_LOW_CUST_COUNT) {
		A1_5_LOW_CUST_COUNT = a1_5_LOW_CUST_COUNT;
	}
	public BigDecimal getA1_5_MEDIUM_CUST_COUNT() {
		return A1_5_MEDIUM_CUST_COUNT;
	}
	public void setA1_5_MEDIUM_CUST_COUNT(BigDecimal a1_5_MEDIUM_CUST_COUNT) {
		A1_5_MEDIUM_CUST_COUNT = a1_5_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA1_5_HIGH_CUST_COUNT() {
		return A1_5_HIGH_CUST_COUNT;
	}
	public void setA1_5_HIGH_CUST_COUNT(BigDecimal a1_5_HIGH_CUST_COUNT) {
		A1_5_HIGH_CUST_COUNT = a1_5_HIGH_CUST_COUNT;
	}
	public String getA5_10_PRODUCT() {
		return A5_10_PRODUCT;
	}
	public void setA5_10_PRODUCT(String a5_10_PRODUCT) {
		A5_10_PRODUCT = a5_10_PRODUCT;
	}
	public BigDecimal getA5_10_LOW_CUST_COUNT() {
		return A5_10_LOW_CUST_COUNT;
	}
	public void setA5_10_LOW_CUST_COUNT(BigDecimal a5_10_LOW_CUST_COUNT) {
		A5_10_LOW_CUST_COUNT = a5_10_LOW_CUST_COUNT;
	}
	public BigDecimal getA5_10_MEDIUM_CUST_COUNT() {
		return A5_10_MEDIUM_CUST_COUNT;
	}
	public void setA5_10_MEDIUM_CUST_COUNT(BigDecimal a5_10_MEDIUM_CUST_COUNT) {
		A5_10_MEDIUM_CUST_COUNT = a5_10_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA5_10_HIGH_CUST_COUNT() {
		return A5_10_HIGH_CUST_COUNT;
	}
	public void setA5_10_HIGH_CUST_COUNT(BigDecimal a5_10_HIGH_CUST_COUNT) {
		A5_10_HIGH_CUST_COUNT = a5_10_HIGH_CUST_COUNT;
	}
	public String getA10_20_PRODUCT() {
		return A10_20_PRODUCT;
	}
	public void setA10_20_PRODUCT(String a10_20_PRODUCT) {
		A10_20_PRODUCT = a10_20_PRODUCT;
	}
	public BigDecimal getA10_20_LOW_CUST_COUNT() {
		return A10_20_LOW_CUST_COUNT;
	}
	public void setA10_20_LOW_CUST_COUNT(BigDecimal a10_20_LOW_CUST_COUNT) {
		A10_20_LOW_CUST_COUNT = a10_20_LOW_CUST_COUNT;
	}
	public BigDecimal getA10_20_MEDIUM_CUST_COUNT() {
		return A10_20_MEDIUM_CUST_COUNT;
	}
	public void setA10_20_MEDIUM_CUST_COUNT(BigDecimal a10_20_MEDIUM_CUST_COUNT) {
		A10_20_MEDIUM_CUST_COUNT = a10_20_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA10_20_HIGH_CUST_COUNT() {
		return A10_20_HIGH_CUST_COUNT;
	}
	public void setA10_20_HIGH_CUST_COUNT(BigDecimal a10_20_HIGH_CUST_COUNT) {
		A10_20_HIGH_CUST_COUNT = a10_20_HIGH_CUST_COUNT;
	}
	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}
	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}
	public BigDecimal getA20_LOW_CUST_COUNT() {
		return A20_LOW_CUST_COUNT;
	}
	public void setA20_LOW_CUST_COUNT(BigDecimal a20_LOW_CUST_COUNT) {
		A20_LOW_CUST_COUNT = a20_LOW_CUST_COUNT;
	}
	public BigDecimal getA20_MEDIUM_CUST_COUNT() {
		return A20_MEDIUM_CUST_COUNT;
	}
	public void setA20_MEDIUM_CUST_COUNT(BigDecimal a20_MEDIUM_CUST_COUNT) {
		A20_MEDIUM_CUST_COUNT = a20_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA20_HIGH_CUST_COUNT() {
		return A20_HIGH_CUST_COUNT;
	}
	public void setA20_HIGH_CUST_COUNT(BigDecimal a20_HIGH_CUST_COUNT) {
		A20_HIGH_CUST_COUNT = a20_HIGH_CUST_COUNT;
	}
	public String getTOTAL_PRODUCT() {
		return TOTAL_PRODUCT;
	}
	public void setTOTAL_PRODUCT(String tOTAL_PRODUCT) {
		TOTAL_PRODUCT = tOTAL_PRODUCT;
	}
	public BigDecimal getTOTAL_LOW_CUST_COUNT() {
		return TOTAL_LOW_CUST_COUNT;
	}
	public void setTOTAL_LOW_CUST_COUNT(BigDecimal tOTAL_LOW_CUST_COUNT) {
		TOTAL_LOW_CUST_COUNT = tOTAL_LOW_CUST_COUNT;
	}
	public BigDecimal getTOTAL_MEDIUM_CUST_COUNT() {
		return TOTAL_MEDIUM_CUST_COUNT;
	}
	public void setTOTAL_MEDIUM_CUST_COUNT(BigDecimal tOTAL_MEDIUM_CUST_COUNT) {
		TOTAL_MEDIUM_CUST_COUNT = tOTAL_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getTOTAL_HIGH_CUST_COUNT() {
		return TOTAL_HIGH_CUST_COUNT;
	}
	public void setTOTAL_HIGH_CUST_COUNT(BigDecimal tOTAL_HIGH_CUST_COUNT) {
		TOTAL_HIGH_CUST_COUNT = tOTAL_HIGH_CUST_COUNT;
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
	public T15BReport(String lESS_1PRODUCT, BigDecimal lESS_2LOW_CUST_COUNT, BigDecimal lESS_3MEDIUM_CUST_COUNT,
			BigDecimal lESS_4HIGH_CUST_COUNT, String a1_5_PRODUCT, BigDecimal a1_5_LOW_CUST_COUNT,
			BigDecimal a1_5_MEDIUM_CUST_COUNT, BigDecimal a1_5_HIGH_CUST_COUNT, String a5_10_PRODUCT,
			BigDecimal a5_10_LOW_CUST_COUNT, BigDecimal a5_10_MEDIUM_CUST_COUNT, BigDecimal a5_10_HIGH_CUST_COUNT,
			String a10_20_PRODUCT, BigDecimal a10_20_LOW_CUST_COUNT, BigDecimal a10_20_MEDIUM_CUST_COUNT,
			BigDecimal a10_20_HIGH_CUST_COUNT, String a20_PRODUCT, BigDecimal a20_LOW_CUST_COUNT,
			BigDecimal a20_MEDIUM_CUST_COUNT, BigDecimal a20_HIGH_CUST_COUNT, String tOTAL_PRODUCT,
			BigDecimal tOTAL_LOW_CUST_COUNT, BigDecimal tOTAL_MEDIUM_CUST_COUNT, BigDecimal tOTAL_HIGH_CUST_COUNT,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG) {
		super();
		LESS_1PRODUCT = lESS_1PRODUCT;
		LESS_2LOW_CUST_COUNT = lESS_2LOW_CUST_COUNT;
		LESS_3MEDIUM_CUST_COUNT = lESS_3MEDIUM_CUST_COUNT;
		LESS_4HIGH_CUST_COUNT = lESS_4HIGH_CUST_COUNT;
		A1_5_PRODUCT = a1_5_PRODUCT;
		A1_5_LOW_CUST_COUNT = a1_5_LOW_CUST_COUNT;
		A1_5_MEDIUM_CUST_COUNT = a1_5_MEDIUM_CUST_COUNT;
		A1_5_HIGH_CUST_COUNT = a1_5_HIGH_CUST_COUNT;
		A5_10_PRODUCT = a5_10_PRODUCT;
		A5_10_LOW_CUST_COUNT = a5_10_LOW_CUST_COUNT;
		A5_10_MEDIUM_CUST_COUNT = a5_10_MEDIUM_CUST_COUNT;
		A5_10_HIGH_CUST_COUNT = a5_10_HIGH_CUST_COUNT;
		A10_20_PRODUCT = a10_20_PRODUCT;
		A10_20_LOW_CUST_COUNT = a10_20_LOW_CUST_COUNT;
		A10_20_MEDIUM_CUST_COUNT = a10_20_MEDIUM_CUST_COUNT;
		A10_20_HIGH_CUST_COUNT = a10_20_HIGH_CUST_COUNT;
		A20_PRODUCT = a20_PRODUCT;
		A20_LOW_CUST_COUNT = a20_LOW_CUST_COUNT;
		A20_MEDIUM_CUST_COUNT = a20_MEDIUM_CUST_COUNT;
		A20_HIGH_CUST_COUNT = a20_HIGH_CUST_COUNT;
		TOTAL_PRODUCT = tOTAL_PRODUCT;
		TOTAL_LOW_CUST_COUNT = tOTAL_LOW_CUST_COUNT;
		TOTAL_MEDIUM_CUST_COUNT = tOTAL_MEDIUM_CUST_COUNT;
		TOTAL_HIGH_CUST_COUNT = tOTAL_HIGH_CUST_COUNT;
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
	public T15BReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
