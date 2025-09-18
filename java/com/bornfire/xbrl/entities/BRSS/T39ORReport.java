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
@Table(name="T39_OR_NETWORK_AVAILABILITY_TABLE")
public class T39ORReport {
	private String	A1_PRODUCT;
	private String	A1_AMOUNT_OF_TIME;
	private String	A1_NUMBER_RATE_LOAD;
	private String	A2_PRODUCT;
	private String	A2_AMOUNT_OF_TIME;
	private String	A2_NUMBER_RATE_LOAD;
	private String	A3_PRODUCT;
	private String	A3_AMOUNT_OF_TIME;
	private String	A3_NUMBER_RATE_LOAD;
	private String	A4_PRODUCT;
	private String	A4_AMOUNT_OF_TIME;
	private String	A4_NUMBER_RATE_LOAD;
	private String	A5_PRODUCT;
	private String	A5_AMOUNT_OF_TIME;
	private BigDecimal	A5_NUMBER_RATE_LOAD;
	private String	A6_PRODUCT;
	private String	A6_AMOUNT_OF_TIME;
	private String	A6_NUMBER_RATE_LOAD;
	private String	A7_PRODUCT;
	private String	A7_AMOUNT_OF_TIME;
	private String	A7_NUMBER_RATE_LOAD;
	private String	A8_PRODUCT;
	private String	A8_AMOUNT_OF_TIME;
	private BigDecimal	A8_NUMBER_RATE_LOAD;
	private String	A9_PRODUCT;
	private String	A9_AMOUNT_OF_TIME;
	private String	A9_NUMBER_RATE_LOAD;
	private String	A10_PRODUCT;
	private String	A10_AMOUNT_OF_TIME;
	private String	A10_NUMBER_RATE_LOAD;
	private String	A11_PRODUCT;
	private String	A11_AMOUNT_OF_TIME;
	private String	A11_NUMBER_RATE_LOAD;
	private String	A12_PRODUCT;
	private BigDecimal	A12_AMOUNT_OF_TIME;
	private BigDecimal	A12_NUMBER_RATE_LOAD;
	private String	A13_PRODUCT;
	private BigDecimal	A13_AMOUNT_OF_TIME;
	private BigDecimal	A13_NUMBER_RATE_LOAD;
	private String	A14_PRODUCT;
	private BigDecimal	A14_AMOUNT_OF_TIME;
	private BigDecimal	A14_NUMBER_RATE_LOAD;
	private String	A15_PRODUCT;
	private BigDecimal	A15_AMOUNT_OF_TIME;
	private BigDecimal	A15_NUMBER_RATE_LOAD;
	private String	A16_PRODUCT;
	private BigDecimal	A16_AMOUNT_OF_TIME;
	private BigDecimal	A16_NUMBER_RATE_LOAD;
	private String	A17_PRODUCT;
	private BigDecimal	A17_AMOUNT_OF_TIME;
	private BigDecimal	A17_NUMBER_RATE_LOAD;
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
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public String getA1_AMOUNT_OF_TIME() {
		return A1_AMOUNT_OF_TIME;
	}
	public void setA1_AMOUNT_OF_TIME(String a1_AMOUNT_OF_TIME) {
		A1_AMOUNT_OF_TIME = a1_AMOUNT_OF_TIME;
	}
	public String getA1_NUMBER_RATE_LOAD() {
		return A1_NUMBER_RATE_LOAD;
	}
	public void setA1_NUMBER_RATE_LOAD(String a1_NUMBER_RATE_LOAD) {
		A1_NUMBER_RATE_LOAD = a1_NUMBER_RATE_LOAD;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA2_AMOUNT_OF_TIME() {
		return A2_AMOUNT_OF_TIME;
	}
	public void setA2_AMOUNT_OF_TIME(String a2_AMOUNT_OF_TIME) {
		A2_AMOUNT_OF_TIME = a2_AMOUNT_OF_TIME;
	}
	public String getA2_NUMBER_RATE_LOAD() {
		return A2_NUMBER_RATE_LOAD;
	}
	public void setA2_NUMBER_RATE_LOAD(String a2_NUMBER_RATE_LOAD) {
		A2_NUMBER_RATE_LOAD = a2_NUMBER_RATE_LOAD;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public String getA3_AMOUNT_OF_TIME() {
		return A3_AMOUNT_OF_TIME;
	}
	public void setA3_AMOUNT_OF_TIME(String a3_AMOUNT_OF_TIME) {
		A3_AMOUNT_OF_TIME = a3_AMOUNT_OF_TIME;
	}
	public String getA3_NUMBER_RATE_LOAD() {
		return A3_NUMBER_RATE_LOAD;
	}
	public void setA3_NUMBER_RATE_LOAD(String a3_NUMBER_RATE_LOAD) {
		A3_NUMBER_RATE_LOAD = a3_NUMBER_RATE_LOAD;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public String getA4_AMOUNT_OF_TIME() {
		return A4_AMOUNT_OF_TIME;
	}
	public void setA4_AMOUNT_OF_TIME(String a4_AMOUNT_OF_TIME) {
		A4_AMOUNT_OF_TIME = a4_AMOUNT_OF_TIME;
	}
	public String getA4_NUMBER_RATE_LOAD() {
		return A4_NUMBER_RATE_LOAD;
	}
	public void setA4_NUMBER_RATE_LOAD(String a4_NUMBER_RATE_LOAD) {
		A4_NUMBER_RATE_LOAD = a4_NUMBER_RATE_LOAD;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public String getA5_AMOUNT_OF_TIME() {
		return A5_AMOUNT_OF_TIME;
	}
	public void setA5_AMOUNT_OF_TIME(String a5_AMOUNT_OF_TIME) {
		A5_AMOUNT_OF_TIME = a5_AMOUNT_OF_TIME;
	}
	public BigDecimal getA5_NUMBER_RATE_LOAD() {
		return A5_NUMBER_RATE_LOAD;
	}
	public void setA5_NUMBER_RATE_LOAD(BigDecimal a5_NUMBER_RATE_LOAD) {
		A5_NUMBER_RATE_LOAD = a5_NUMBER_RATE_LOAD;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public String getA6_AMOUNT_OF_TIME() {
		return A6_AMOUNT_OF_TIME;
	}
	public void setA6_AMOUNT_OF_TIME(String a6_AMOUNT_OF_TIME) {
		A6_AMOUNT_OF_TIME = a6_AMOUNT_OF_TIME;
	}
	public String getA6_NUMBER_RATE_LOAD() {
		return A6_NUMBER_RATE_LOAD;
	}
	public void setA6_NUMBER_RATE_LOAD(String a6_NUMBER_RATE_LOAD) {
		A6_NUMBER_RATE_LOAD = a6_NUMBER_RATE_LOAD;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public String getA7_AMOUNT_OF_TIME() {
		return A7_AMOUNT_OF_TIME;
	}
	public void setA7_AMOUNT_OF_TIME(String a7_AMOUNT_OF_TIME) {
		A7_AMOUNT_OF_TIME = a7_AMOUNT_OF_TIME;
	}
	public String getA7_NUMBER_RATE_LOAD() {
		return A7_NUMBER_RATE_LOAD;
	}
	public void setA7_NUMBER_RATE_LOAD(String a7_NUMBER_RATE_LOAD) {
		A7_NUMBER_RATE_LOAD = a7_NUMBER_RATE_LOAD;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public String getA8_AMOUNT_OF_TIME() {
		return A8_AMOUNT_OF_TIME;
	}
	public void setA8_AMOUNT_OF_TIME(String a8_AMOUNT_OF_TIME) {
		A8_AMOUNT_OF_TIME = a8_AMOUNT_OF_TIME;
	}
	public BigDecimal getA8_NUMBER_RATE_LOAD() {
		return A8_NUMBER_RATE_LOAD;
	}
	public void setA8_NUMBER_RATE_LOAD(BigDecimal a8_NUMBER_RATE_LOAD) {
		A8_NUMBER_RATE_LOAD = a8_NUMBER_RATE_LOAD;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public String getA9_AMOUNT_OF_TIME() {
		return A9_AMOUNT_OF_TIME;
	}
	public void setA9_AMOUNT_OF_TIME(String a9_AMOUNT_OF_TIME) {
		A9_AMOUNT_OF_TIME = a9_AMOUNT_OF_TIME;
	}
	public String getA9_NUMBER_RATE_LOAD() {
		return A9_NUMBER_RATE_LOAD;
	}
	public void setA9_NUMBER_RATE_LOAD(String a9_NUMBER_RATE_LOAD) {
		A9_NUMBER_RATE_LOAD = a9_NUMBER_RATE_LOAD;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public String getA10_AMOUNT_OF_TIME() {
		return A10_AMOUNT_OF_TIME;
	}
	public void setA10_AMOUNT_OF_TIME(String a10_AMOUNT_OF_TIME) {
		A10_AMOUNT_OF_TIME = a10_AMOUNT_OF_TIME;
	}
	public String getA10_NUMBER_RATE_LOAD() {
		return A10_NUMBER_RATE_LOAD;
	}
	public void setA10_NUMBER_RATE_LOAD(String a10_NUMBER_RATE_LOAD) {
		A10_NUMBER_RATE_LOAD = a10_NUMBER_RATE_LOAD;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public String getA11_AMOUNT_OF_TIME() {
		return A11_AMOUNT_OF_TIME;
	}
	public void setA11_AMOUNT_OF_TIME(String a11_AMOUNT_OF_TIME) {
		A11_AMOUNT_OF_TIME = a11_AMOUNT_OF_TIME;
	}
	public String getA11_NUMBER_RATE_LOAD() {
		return A11_NUMBER_RATE_LOAD;
	}
	public void setA11_NUMBER_RATE_LOAD(String a11_NUMBER_RATE_LOAD) {
		A11_NUMBER_RATE_LOAD = a11_NUMBER_RATE_LOAD;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_AMOUNT_OF_TIME() {
		return A12_AMOUNT_OF_TIME;
	}
	public void setA12_AMOUNT_OF_TIME(BigDecimal a12_AMOUNT_OF_TIME) {
		A12_AMOUNT_OF_TIME = a12_AMOUNT_OF_TIME;
	}
	public BigDecimal getA12_NUMBER_RATE_LOAD() {
		return A12_NUMBER_RATE_LOAD;
	}
	public void setA12_NUMBER_RATE_LOAD(BigDecimal a12_NUMBER_RATE_LOAD) {
		A12_NUMBER_RATE_LOAD = a12_NUMBER_RATE_LOAD;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_AMOUNT_OF_TIME() {
		return A13_AMOUNT_OF_TIME;
	}
	public void setA13_AMOUNT_OF_TIME(BigDecimal a13_AMOUNT_OF_TIME) {
		A13_AMOUNT_OF_TIME = a13_AMOUNT_OF_TIME;
	}
	public BigDecimal getA13_NUMBER_RATE_LOAD() {
		return A13_NUMBER_RATE_LOAD;
	}
	public void setA13_NUMBER_RATE_LOAD(BigDecimal a13_NUMBER_RATE_LOAD) {
		A13_NUMBER_RATE_LOAD = a13_NUMBER_RATE_LOAD;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_AMOUNT_OF_TIME() {
		return A14_AMOUNT_OF_TIME;
	}
	public void setA14_AMOUNT_OF_TIME(BigDecimal a14_AMOUNT_OF_TIME) {
		A14_AMOUNT_OF_TIME = a14_AMOUNT_OF_TIME;
	}
	public BigDecimal getA14_NUMBER_RATE_LOAD() {
		return A14_NUMBER_RATE_LOAD;
	}
	public void setA14_NUMBER_RATE_LOAD(BigDecimal a14_NUMBER_RATE_LOAD) {
		A14_NUMBER_RATE_LOAD = a14_NUMBER_RATE_LOAD;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_AMOUNT_OF_TIME() {
		return A15_AMOUNT_OF_TIME;
	}
	public void setA15_AMOUNT_OF_TIME(BigDecimal a15_AMOUNT_OF_TIME) {
		A15_AMOUNT_OF_TIME = a15_AMOUNT_OF_TIME;
	}
	public BigDecimal getA15_NUMBER_RATE_LOAD() {
		return A15_NUMBER_RATE_LOAD;
	}
	public void setA15_NUMBER_RATE_LOAD(BigDecimal a15_NUMBER_RATE_LOAD) {
		A15_NUMBER_RATE_LOAD = a15_NUMBER_RATE_LOAD;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public BigDecimal getA16_AMOUNT_OF_TIME() {
		return A16_AMOUNT_OF_TIME;
	}
	public void setA16_AMOUNT_OF_TIME(BigDecimal a16_AMOUNT_OF_TIME) {
		A16_AMOUNT_OF_TIME = a16_AMOUNT_OF_TIME;
	}
	public BigDecimal getA16_NUMBER_RATE_LOAD() {
		return A16_NUMBER_RATE_LOAD;
	}
	public void setA16_NUMBER_RATE_LOAD(BigDecimal a16_NUMBER_RATE_LOAD) {
		A16_NUMBER_RATE_LOAD = a16_NUMBER_RATE_LOAD;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17_AMOUNT_OF_TIME() {
		return A17_AMOUNT_OF_TIME;
	}
	public void setA17_AMOUNT_OF_TIME(BigDecimal a17_AMOUNT_OF_TIME) {
		A17_AMOUNT_OF_TIME = a17_AMOUNT_OF_TIME;
	}
	public BigDecimal getA17_NUMBER_RATE_LOAD() {
		return A17_NUMBER_RATE_LOAD;
	}
	public void setA17_NUMBER_RATE_LOAD(BigDecimal a17_NUMBER_RATE_LOAD) {
		A17_NUMBER_RATE_LOAD = a17_NUMBER_RATE_LOAD;
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
	public T39ORReport(String a1_PRODUCT, String a1_AMOUNT_OF_TIME, String a1_NUMBER_RATE_LOAD, String a2_PRODUCT,
			String a2_AMOUNT_OF_TIME, String a2_NUMBER_RATE_LOAD, String a3_PRODUCT, String a3_AMOUNT_OF_TIME,
			String a3_NUMBER_RATE_LOAD, String a4_PRODUCT, String a4_AMOUNT_OF_TIME, String a4_NUMBER_RATE_LOAD,
			String a5_PRODUCT, String a5_AMOUNT_OF_TIME, BigDecimal a5_NUMBER_RATE_LOAD, String a6_PRODUCT,
			String a6_AMOUNT_OF_TIME, String a6_NUMBER_RATE_LOAD, String a7_PRODUCT, String a7_AMOUNT_OF_TIME,
			String a7_NUMBER_RATE_LOAD, String a8_PRODUCT, String a8_AMOUNT_OF_TIME, BigDecimal a8_NUMBER_RATE_LOAD,
			String a9_PRODUCT, String a9_AMOUNT_OF_TIME, String a9_NUMBER_RATE_LOAD, String a10_PRODUCT,
			String a10_AMOUNT_OF_TIME, String a10_NUMBER_RATE_LOAD, String a11_PRODUCT, String a11_AMOUNT_OF_TIME,
			String a11_NUMBER_RATE_LOAD, String a12_PRODUCT, BigDecimal a12_AMOUNT_OF_TIME,
			BigDecimal a12_NUMBER_RATE_LOAD, String a13_PRODUCT, BigDecimal a13_AMOUNT_OF_TIME,
			BigDecimal a13_NUMBER_RATE_LOAD, String a14_PRODUCT, BigDecimal a14_AMOUNT_OF_TIME,
			BigDecimal a14_NUMBER_RATE_LOAD, String a15_PRODUCT, BigDecimal a15_AMOUNT_OF_TIME,
			BigDecimal a15_NUMBER_RATE_LOAD, String a16_PRODUCT, BigDecimal a16_AMOUNT_OF_TIME,
			BigDecimal a16_NUMBER_RATE_LOAD, String a17_PRODUCT, BigDecimal a17_AMOUNT_OF_TIME,
			BigDecimal a17_NUMBER_RATE_LOAD, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_AMOUNT_OF_TIME = a1_AMOUNT_OF_TIME;
		A1_NUMBER_RATE_LOAD = a1_NUMBER_RATE_LOAD;
		A2_PRODUCT = a2_PRODUCT;
		A2_AMOUNT_OF_TIME = a2_AMOUNT_OF_TIME;
		A2_NUMBER_RATE_LOAD = a2_NUMBER_RATE_LOAD;
		A3_PRODUCT = a3_PRODUCT;
		A3_AMOUNT_OF_TIME = a3_AMOUNT_OF_TIME;
		A3_NUMBER_RATE_LOAD = a3_NUMBER_RATE_LOAD;
		A4_PRODUCT = a4_PRODUCT;
		A4_AMOUNT_OF_TIME = a4_AMOUNT_OF_TIME;
		A4_NUMBER_RATE_LOAD = a4_NUMBER_RATE_LOAD;
		A5_PRODUCT = a5_PRODUCT;
		A5_AMOUNT_OF_TIME = a5_AMOUNT_OF_TIME;
		A5_NUMBER_RATE_LOAD = a5_NUMBER_RATE_LOAD;
		A6_PRODUCT = a6_PRODUCT;
		A6_AMOUNT_OF_TIME = a6_AMOUNT_OF_TIME;
		A6_NUMBER_RATE_LOAD = a6_NUMBER_RATE_LOAD;
		A7_PRODUCT = a7_PRODUCT;
		A7_AMOUNT_OF_TIME = a7_AMOUNT_OF_TIME;
		A7_NUMBER_RATE_LOAD = a7_NUMBER_RATE_LOAD;
		A8_PRODUCT = a8_PRODUCT;
		A8_AMOUNT_OF_TIME = a8_AMOUNT_OF_TIME;
		A8_NUMBER_RATE_LOAD = a8_NUMBER_RATE_LOAD;
		A9_PRODUCT = a9_PRODUCT;
		A9_AMOUNT_OF_TIME = a9_AMOUNT_OF_TIME;
		A9_NUMBER_RATE_LOAD = a9_NUMBER_RATE_LOAD;
		A10_PRODUCT = a10_PRODUCT;
		A10_AMOUNT_OF_TIME = a10_AMOUNT_OF_TIME;
		A10_NUMBER_RATE_LOAD = a10_NUMBER_RATE_LOAD;
		A11_PRODUCT = a11_PRODUCT;
		A11_AMOUNT_OF_TIME = a11_AMOUNT_OF_TIME;
		A11_NUMBER_RATE_LOAD = a11_NUMBER_RATE_LOAD;
		A12_PRODUCT = a12_PRODUCT;
		A12_AMOUNT_OF_TIME = a12_AMOUNT_OF_TIME;
		A12_NUMBER_RATE_LOAD = a12_NUMBER_RATE_LOAD;
		A13_PRODUCT = a13_PRODUCT;
		A13_AMOUNT_OF_TIME = a13_AMOUNT_OF_TIME;
		A13_NUMBER_RATE_LOAD = a13_NUMBER_RATE_LOAD;
		A14_PRODUCT = a14_PRODUCT;
		A14_AMOUNT_OF_TIME = a14_AMOUNT_OF_TIME;
		A14_NUMBER_RATE_LOAD = a14_NUMBER_RATE_LOAD;
		A15_PRODUCT = a15_PRODUCT;
		A15_AMOUNT_OF_TIME = a15_AMOUNT_OF_TIME;
		A15_NUMBER_RATE_LOAD = a15_NUMBER_RATE_LOAD;
		A16_PRODUCT = a16_PRODUCT;
		A16_AMOUNT_OF_TIME = a16_AMOUNT_OF_TIME;
		A16_NUMBER_RATE_LOAD = a16_NUMBER_RATE_LOAD;
		A17_PRODUCT = a17_PRODUCT;
		A17_AMOUNT_OF_TIME = a17_AMOUNT_OF_TIME;
		A17_NUMBER_RATE_LOAD = a17_NUMBER_RATE_LOAD;
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
	public T39ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
   

}
