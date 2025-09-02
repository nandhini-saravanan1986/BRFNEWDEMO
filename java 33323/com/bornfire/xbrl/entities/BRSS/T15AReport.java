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
@Table(name = "T15A_QUARTERLY_ACCOUNT_TURNOVER")
public class T15AReport {

	private String	LESS_10_PRODUCT;
	private BigDecimal	LESS_10_LOW_CUST_COUNT;
	private BigDecimal	LESS_10_MEDIUM_CUST_COUNT;
	private BigDecimal	LESS_10_HIGH_CUST_COUNT;
	private String	A10_30_PRODUCT;
	private BigDecimal	A10_30_LOW_CUST_COUNT;
	private BigDecimal	A10_30_MEDIUM_CUST_COUNT;
	private BigDecimal	A10_30_HIGH_CUST_COUNT;
	private String	A30_60_PRODUCT;
	private BigDecimal	A30_60_LOW_CUST_COUNT;
	private BigDecimal	A30_60_MEDIUM_CUST_COUNT;
	private BigDecimal	A30_60_HIGH_CUST_COUNT;
	private String	A60_90PRODUCT;
	private BigDecimal	A60_90LOW_CUST_COUNT;
	private BigDecimal	A60_90MEDIUM_CUST_COUNT;
	private BigDecimal	A60_90HIGH_CUST_COUNT;
	private String	A90_150_PRODUCT;
	private BigDecimal	A90_150_LOW_CUST_COUNT;
	private BigDecimal	A90_150_MEDIUM_CUST_COUNT;
	private BigDecimal	A90_150_HIGH_CUST_COUNT;
	private String	A150_200_PRODUCT;
	private BigDecimal	A150_200_LOW_CUST_COUNT;
	private BigDecimal	A150_200_MEDIUM_CUST_COUNT;
	private BigDecimal	A150_200_HIGH_CUST_COUNT;
	private String	A200_PRODUCT;
	private BigDecimal	A200_LOW_CUST_COUNT;
	private BigDecimal	A200_MEDIUM_CUST_COUNT;
	private BigDecimal	A200_HIGH_CUST_COUNT;
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
	public String getLESS_10_PRODUCT() {
		return LESS_10_PRODUCT;
	}
	public void setLESS_10_PRODUCT(String lESS_10_PRODUCT) {
		LESS_10_PRODUCT = lESS_10_PRODUCT;
	}
	public BigDecimal getLESS_10_LOW_CUST_COUNT() {
		return LESS_10_LOW_CUST_COUNT;
	}
	public void setLESS_10_LOW_CUST_COUNT(BigDecimal lESS_10_LOW_CUST_COUNT) {
		LESS_10_LOW_CUST_COUNT = lESS_10_LOW_CUST_COUNT;
	}
	public BigDecimal getLESS_10_MEDIUM_CUST_COUNT() {
		return LESS_10_MEDIUM_CUST_COUNT;
	}
	public void setLESS_10_MEDIUM_CUST_COUNT(BigDecimal lESS_10_MEDIUM_CUST_COUNT) {
		LESS_10_MEDIUM_CUST_COUNT = lESS_10_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getLESS_10_HIGH_CUST_COUNT() {
		return LESS_10_HIGH_CUST_COUNT;
	}
	public void setLESS_10_HIGH_CUST_COUNT(BigDecimal lESS_10_HIGH_CUST_COUNT) {
		LESS_10_HIGH_CUST_COUNT = lESS_10_HIGH_CUST_COUNT;
	}
	public String getA10_30_PRODUCT() {
		return A10_30_PRODUCT;
	}
	public void setA10_30_PRODUCT(String a10_30_PRODUCT) {
		A10_30_PRODUCT = a10_30_PRODUCT;
	}
	public BigDecimal getA10_30_LOW_CUST_COUNT() {
		return A10_30_LOW_CUST_COUNT;
	}
	public void setA10_30_LOW_CUST_COUNT(BigDecimal a10_30_LOW_CUST_COUNT) {
		A10_30_LOW_CUST_COUNT = a10_30_LOW_CUST_COUNT;
	}
	public BigDecimal getA10_30_MEDIUM_CUST_COUNT() {
		return A10_30_MEDIUM_CUST_COUNT;
	}
	public void setA10_30_MEDIUM_CUST_COUNT(BigDecimal a10_30_MEDIUM_CUST_COUNT) {
		A10_30_MEDIUM_CUST_COUNT = a10_30_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA10_30_HIGH_CUST_COUNT() {
		return A10_30_HIGH_CUST_COUNT;
	}
	public void setA10_30_HIGH_CUST_COUNT(BigDecimal a10_30_HIGH_CUST_COUNT) {
		A10_30_HIGH_CUST_COUNT = a10_30_HIGH_CUST_COUNT;
	}
	public String getA30_60_PRODUCT() {
		return A30_60_PRODUCT;
	}
	public void setA30_60_PRODUCT(String a30_60_PRODUCT) {
		A30_60_PRODUCT = a30_60_PRODUCT;
	}
	public BigDecimal getA30_60_LOW_CUST_COUNT() {
		return A30_60_LOW_CUST_COUNT;
	}
	public void setA30_60_LOW_CUST_COUNT(BigDecimal a30_60_LOW_CUST_COUNT) {
		A30_60_LOW_CUST_COUNT = a30_60_LOW_CUST_COUNT;
	}
	public BigDecimal getA30_60_MEDIUM_CUST_COUNT() {
		return A30_60_MEDIUM_CUST_COUNT;
	}
	public void setA30_60_MEDIUM_CUST_COUNT(BigDecimal a30_60_MEDIUM_CUST_COUNT) {
		A30_60_MEDIUM_CUST_COUNT = a30_60_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA30_60_HIGH_CUST_COUNT() {
		return A30_60_HIGH_CUST_COUNT;
	}
	public void setA30_60_HIGH_CUST_COUNT(BigDecimal a30_60_HIGH_CUST_COUNT) {
		A30_60_HIGH_CUST_COUNT = a30_60_HIGH_CUST_COUNT;
	}
	public String getA60_90PRODUCT() {
		return A60_90PRODUCT;
	}
	public void setA60_90PRODUCT(String a60_90product) {
		A60_90PRODUCT = a60_90product;
	}
	public BigDecimal getA60_90LOW_CUST_COUNT() {
		return A60_90LOW_CUST_COUNT;
	}
	public void setA60_90LOW_CUST_COUNT(BigDecimal a60_90low_CUST_COUNT) {
		A60_90LOW_CUST_COUNT = a60_90low_CUST_COUNT;
	}
	public BigDecimal getA60_90MEDIUM_CUST_COUNT() {
		return A60_90MEDIUM_CUST_COUNT;
	}
	public void setA60_90MEDIUM_CUST_COUNT(BigDecimal a60_90medium_CUST_COUNT) {
		A60_90MEDIUM_CUST_COUNT = a60_90medium_CUST_COUNT;
	}
	public BigDecimal getA60_90HIGH_CUST_COUNT() {
		return A60_90HIGH_CUST_COUNT;
	}
	public void setA60_90HIGH_CUST_COUNT(BigDecimal a60_90high_CUST_COUNT) {
		A60_90HIGH_CUST_COUNT = a60_90high_CUST_COUNT;
	}
	public String getA90_150_PRODUCT() {
		return A90_150_PRODUCT;
	}
	public void setA90_150_PRODUCT(String a90_150_PRODUCT) {
		A90_150_PRODUCT = a90_150_PRODUCT;
	}
	public BigDecimal getA90_150_LOW_CUST_COUNT() {
		return A90_150_LOW_CUST_COUNT;
	}
	public void setA90_150_LOW_CUST_COUNT(BigDecimal a90_150_LOW_CUST_COUNT) {
		A90_150_LOW_CUST_COUNT = a90_150_LOW_CUST_COUNT;
	}
	public BigDecimal getA90_150_MEDIUM_CUST_COUNT() {
		return A90_150_MEDIUM_CUST_COUNT;
	}
	public void setA90_150_MEDIUM_CUST_COUNT(BigDecimal a90_150_MEDIUM_CUST_COUNT) {
		A90_150_MEDIUM_CUST_COUNT = a90_150_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA90_150_HIGH_CUST_COUNT() {
		return A90_150_HIGH_CUST_COUNT;
	}
	public void setA90_150_HIGH_CUST_COUNT(BigDecimal a90_150_HIGH_CUST_COUNT) {
		A90_150_HIGH_CUST_COUNT = a90_150_HIGH_CUST_COUNT;
	}
	public String getA150_200_PRODUCT() {
		return A150_200_PRODUCT;
	}
	public void setA150_200_PRODUCT(String a150_200_PRODUCT) {
		A150_200_PRODUCT = a150_200_PRODUCT;
	}
	public BigDecimal getA150_200_LOW_CUST_COUNT() {
		return A150_200_LOW_CUST_COUNT;
	}
	public void setA150_200_LOW_CUST_COUNT(BigDecimal a150_200_LOW_CUST_COUNT) {
		A150_200_LOW_CUST_COUNT = a150_200_LOW_CUST_COUNT;
	}
	public BigDecimal getA150_200_MEDIUM_CUST_COUNT() {
		return A150_200_MEDIUM_CUST_COUNT;
	}
	public void setA150_200_MEDIUM_CUST_COUNT(BigDecimal a150_200_MEDIUM_CUST_COUNT) {
		A150_200_MEDIUM_CUST_COUNT = a150_200_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA150_200_HIGH_CUST_COUNT() {
		return A150_200_HIGH_CUST_COUNT;
	}
	public void setA150_200_HIGH_CUST_COUNT(BigDecimal a150_200_HIGH_CUST_COUNT) {
		A150_200_HIGH_CUST_COUNT = a150_200_HIGH_CUST_COUNT;
	}
	public String getA200_PRODUCT() {
		return A200_PRODUCT;
	}
	public void setA200_PRODUCT(String a200_PRODUCT) {
		A200_PRODUCT = a200_PRODUCT;
	}
	public BigDecimal getA200_LOW_CUST_COUNT() {
		return A200_LOW_CUST_COUNT;
	}
	public void setA200_LOW_CUST_COUNT(BigDecimal a200_LOW_CUST_COUNT) {
		A200_LOW_CUST_COUNT = a200_LOW_CUST_COUNT;
	}
	public BigDecimal getA200_MEDIUM_CUST_COUNT() {
		return A200_MEDIUM_CUST_COUNT;
	}
	public void setA200_MEDIUM_CUST_COUNT(BigDecimal a200_MEDIUM_CUST_COUNT) {
		A200_MEDIUM_CUST_COUNT = a200_MEDIUM_CUST_COUNT;
	}
	public BigDecimal getA200_HIGH_CUST_COUNT() {
		return A200_HIGH_CUST_COUNT;
	}
	public void setA200_HIGH_CUST_COUNT(BigDecimal a200_HIGH_CUST_COUNT) {
		A200_HIGH_CUST_COUNT = a200_HIGH_CUST_COUNT;
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
	public T15AReport(String lESS_10_PRODUCT, BigDecimal lESS_10_LOW_CUST_COUNT, BigDecimal lESS_10_MEDIUM_CUST_COUNT,
			BigDecimal lESS_10_HIGH_CUST_COUNT, String a10_30_PRODUCT, BigDecimal a10_30_LOW_CUST_COUNT,
			BigDecimal a10_30_MEDIUM_CUST_COUNT, BigDecimal a10_30_HIGH_CUST_COUNT, String a30_60_PRODUCT,
			BigDecimal a30_60_LOW_CUST_COUNT, BigDecimal a30_60_MEDIUM_CUST_COUNT, BigDecimal a30_60_HIGH_CUST_COUNT,
			String a60_90product, BigDecimal a60_90low_CUST_COUNT, BigDecimal a60_90medium_CUST_COUNT,
			BigDecimal a60_90high_CUST_COUNT, String a90_150_PRODUCT, BigDecimal a90_150_LOW_CUST_COUNT,
			BigDecimal a90_150_MEDIUM_CUST_COUNT, BigDecimal a90_150_HIGH_CUST_COUNT, String a150_200_PRODUCT,
			BigDecimal a150_200_LOW_CUST_COUNT, BigDecimal a150_200_MEDIUM_CUST_COUNT,
			BigDecimal a150_200_HIGH_CUST_COUNT, String a200_PRODUCT, BigDecimal a200_LOW_CUST_COUNT,
			BigDecimal a200_MEDIUM_CUST_COUNT, BigDecimal a200_HIGH_CUST_COUNT, String tOTAL_PRODUCT,
			BigDecimal tOTAL_LOW_CUST_COUNT, BigDecimal tOTAL_MEDIUM_CUST_COUNT, BigDecimal tOTAL_HIGH_CUST_COUNT,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG) {
		super();
		LESS_10_PRODUCT = lESS_10_PRODUCT;
		LESS_10_LOW_CUST_COUNT = lESS_10_LOW_CUST_COUNT;
		LESS_10_MEDIUM_CUST_COUNT = lESS_10_MEDIUM_CUST_COUNT;
		LESS_10_HIGH_CUST_COUNT = lESS_10_HIGH_CUST_COUNT;
		A10_30_PRODUCT = a10_30_PRODUCT;
		A10_30_LOW_CUST_COUNT = a10_30_LOW_CUST_COUNT;
		A10_30_MEDIUM_CUST_COUNT = a10_30_MEDIUM_CUST_COUNT;
		A10_30_HIGH_CUST_COUNT = a10_30_HIGH_CUST_COUNT;
		A30_60_PRODUCT = a30_60_PRODUCT;
		A30_60_LOW_CUST_COUNT = a30_60_LOW_CUST_COUNT;
		A30_60_MEDIUM_CUST_COUNT = a30_60_MEDIUM_CUST_COUNT;
		A30_60_HIGH_CUST_COUNT = a30_60_HIGH_CUST_COUNT;
		A60_90PRODUCT = a60_90product;
		A60_90LOW_CUST_COUNT = a60_90low_CUST_COUNT;
		A60_90MEDIUM_CUST_COUNT = a60_90medium_CUST_COUNT;
		A60_90HIGH_CUST_COUNT = a60_90high_CUST_COUNT;
		A90_150_PRODUCT = a90_150_PRODUCT;
		A90_150_LOW_CUST_COUNT = a90_150_LOW_CUST_COUNT;
		A90_150_MEDIUM_CUST_COUNT = a90_150_MEDIUM_CUST_COUNT;
		A90_150_HIGH_CUST_COUNT = a90_150_HIGH_CUST_COUNT;
		A150_200_PRODUCT = a150_200_PRODUCT;
		A150_200_LOW_CUST_COUNT = a150_200_LOW_CUST_COUNT;
		A150_200_MEDIUM_CUST_COUNT = a150_200_MEDIUM_CUST_COUNT;
		A150_200_HIGH_CUST_COUNT = a150_200_HIGH_CUST_COUNT;
		A200_PRODUCT = a200_PRODUCT;
		A200_LOW_CUST_COUNT = a200_LOW_CUST_COUNT;
		A200_MEDIUM_CUST_COUNT = a200_MEDIUM_CUST_COUNT;
		A200_HIGH_CUST_COUNT = a200_HIGH_CUST_COUNT;
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
	public T15AReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
