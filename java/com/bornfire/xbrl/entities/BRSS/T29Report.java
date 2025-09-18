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
@Table(name="T29_INT_ADT_AML_CFT_TABLE")
public class T29Report {
	private String	A1_PRODUCT;
	private String	A2_PRODUCT;
	private String	A3_PRODUCT;
	private String	A4_PRODUCT;
	private String	A5_PRODUCT;
	private String	A6_PRODUCT;
	private String	A7_PRODUCT;
	private String	A8_PRODUCT;
	private String	A9_PRODUCT;
	private BigDecimal	B1_NO_COUNT;
	private BigDecimal	B2_NO_COUNT;
	private BigDecimal	B3_NO_COUNT;
	private BigDecimal	B4_NO_COUNT;
	private BigDecimal	B5_NO_COUNT;
	private BigDecimal	B6_NO_COUNT;
	private BigDecimal	B7_NO_COUNT;
	private BigDecimal	B8_NO_COUNT;
	private BigDecimal	B9_NO_COUNT;
	private BigDecimal	C1_NO_GRADED;
	private BigDecimal	C2_NO_GRADED;
	private BigDecimal	C3_NO_GRADED;
	private BigDecimal	C4_NO_GRADED;
	private BigDecimal	C5_NO_GRADED;
	private BigDecimal	C6_NO_GRADED;
	private BigDecimal	C7_NO_GRADED;
	private BigDecimal	C8_NO_GRADED;
	private BigDecimal	C9_NO_GRADED;
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
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getB1_NO_COUNT() {
		return B1_NO_COUNT;
	}
	public void setB1_NO_COUNT(BigDecimal b1_NO_COUNT) {
		B1_NO_COUNT = b1_NO_COUNT;
	}
	public BigDecimal getB2_NO_COUNT() {
		return B2_NO_COUNT;
	}
	public void setB2_NO_COUNT(BigDecimal b2_NO_COUNT) {
		B2_NO_COUNT = b2_NO_COUNT;
	}
	public BigDecimal getB3_NO_COUNT() {
		return B3_NO_COUNT;
	}
	public void setB3_NO_COUNT(BigDecimal b3_NO_COUNT) {
		B3_NO_COUNT = b3_NO_COUNT;
	}
	public BigDecimal getB4_NO_COUNT() {
		return B4_NO_COUNT;
	}
	public void setB4_NO_COUNT(BigDecimal b4_NO_COUNT) {
		B4_NO_COUNT = b4_NO_COUNT;
	}
	public BigDecimal getB5_NO_COUNT() {
		return B5_NO_COUNT;
	}
	public void setB5_NO_COUNT(BigDecimal b5_NO_COUNT) {
		B5_NO_COUNT = b5_NO_COUNT;
	}
	public BigDecimal getB6_NO_COUNT() {
		return B6_NO_COUNT;
	}
	public void setB6_NO_COUNT(BigDecimal b6_NO_COUNT) {
		B6_NO_COUNT = b6_NO_COUNT;
	}
	public BigDecimal getB7_NO_COUNT() {
		return B7_NO_COUNT;
	}
	public void setB7_NO_COUNT(BigDecimal b7_NO_COUNT) {
		B7_NO_COUNT = b7_NO_COUNT;
	}
	public BigDecimal getB8_NO_COUNT() {
		return B8_NO_COUNT;
	}
	public void setB8_NO_COUNT(BigDecimal b8_NO_COUNT) {
		B8_NO_COUNT = b8_NO_COUNT;
	}
	public BigDecimal getB9_NO_COUNT() {
		return B9_NO_COUNT;
	}
	public void setB9_NO_COUNT(BigDecimal b9_NO_COUNT) {
		B9_NO_COUNT = b9_NO_COUNT;
	}
	public BigDecimal getC1_NO_GRADED() {
		return C1_NO_GRADED;
	}
	public void setC1_NO_GRADED(BigDecimal c1_NO_GRADED) {
		C1_NO_GRADED = c1_NO_GRADED;
	}
	public BigDecimal getC2_NO_GRADED() {
		return C2_NO_GRADED;
	}
	public void setC2_NO_GRADED(BigDecimal c2_NO_GRADED) {
		C2_NO_GRADED = c2_NO_GRADED;
	}
	public BigDecimal getC3_NO_GRADED() {
		return C3_NO_GRADED;
	}
	public void setC3_NO_GRADED(BigDecimal c3_NO_GRADED) {
		C3_NO_GRADED = c3_NO_GRADED;
	}
	public BigDecimal getC4_NO_GRADED() {
		return C4_NO_GRADED;
	}
	public void setC4_NO_GRADED(BigDecimal c4_NO_GRADED) {
		C4_NO_GRADED = c4_NO_GRADED;
	}
	public BigDecimal getC5_NO_GRADED() {
		return C5_NO_GRADED;
	}
	public void setC5_NO_GRADED(BigDecimal c5_NO_GRADED) {
		C5_NO_GRADED = c5_NO_GRADED;
	}
	public BigDecimal getC6_NO_GRADED() {
		return C6_NO_GRADED;
	}
	public void setC6_NO_GRADED(BigDecimal c6_NO_GRADED) {
		C6_NO_GRADED = c6_NO_GRADED;
	}
	public BigDecimal getC7_NO_GRADED() {
		return C7_NO_GRADED;
	}
	public void setC7_NO_GRADED(BigDecimal c7_NO_GRADED) {
		C7_NO_GRADED = c7_NO_GRADED;
	}
	public BigDecimal getC8_NO_GRADED() {
		return C8_NO_GRADED;
	}
	public void setC8_NO_GRADED(BigDecimal c8_NO_GRADED) {
		C8_NO_GRADED = c8_NO_GRADED;
	}
	public BigDecimal getC9_NO_GRADED() {
		return C9_NO_GRADED;
	}
	public void setC9_NO_GRADED(BigDecimal c9_NO_GRADED) {
		C9_NO_GRADED = c9_NO_GRADED;
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
	public T29Report(String a1_PRODUCT, String a2_PRODUCT, String a3_PRODUCT, String a4_PRODUCT, String a5_PRODUCT,
			String a6_PRODUCT, String a7_PRODUCT, String a8_PRODUCT, String a9_PRODUCT, BigDecimal b1_NO_COUNT,
			BigDecimal b2_NO_COUNT, BigDecimal b3_NO_COUNT, BigDecimal b4_NO_COUNT, BigDecimal b5_NO_COUNT,
			BigDecimal b6_NO_COUNT, BigDecimal b7_NO_COUNT, BigDecimal b8_NO_COUNT, BigDecimal b9_NO_COUNT,
			BigDecimal c1_NO_GRADED, BigDecimal c2_NO_GRADED, BigDecimal c3_NO_GRADED, BigDecimal c4_NO_GRADED,
			BigDecimal c5_NO_GRADED, BigDecimal c6_NO_GRADED, BigDecimal c7_NO_GRADED, BigDecimal c8_NO_GRADED,
			BigDecimal c9_NO_GRADED, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG, String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE,
			Date vERIFY_DATE, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A2_PRODUCT = a2_PRODUCT;
		A3_PRODUCT = a3_PRODUCT;
		A4_PRODUCT = a4_PRODUCT;
		A5_PRODUCT = a5_PRODUCT;
		A6_PRODUCT = a6_PRODUCT;
		A7_PRODUCT = a7_PRODUCT;
		A8_PRODUCT = a8_PRODUCT;
		A9_PRODUCT = a9_PRODUCT;
		B1_NO_COUNT = b1_NO_COUNT;
		B2_NO_COUNT = b2_NO_COUNT;
		B3_NO_COUNT = b3_NO_COUNT;
		B4_NO_COUNT = b4_NO_COUNT;
		B5_NO_COUNT = b5_NO_COUNT;
		B6_NO_COUNT = b6_NO_COUNT;
		B7_NO_COUNT = b7_NO_COUNT;
		B8_NO_COUNT = b8_NO_COUNT;
		B9_NO_COUNT = b9_NO_COUNT;
		C1_NO_GRADED = c1_NO_GRADED;
		C2_NO_GRADED = c2_NO_GRADED;
		C3_NO_GRADED = c3_NO_GRADED;
		C4_NO_GRADED = c4_NO_GRADED;
		C5_NO_GRADED = c5_NO_GRADED;
		C6_NO_GRADED = c6_NO_GRADED;
		C7_NO_GRADED = c7_NO_GRADED;
		C8_NO_GRADED = c8_NO_GRADED;
		C9_NO_GRADED = c9_NO_GRADED;
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
	public T29Report() {
		super();
		// TODO Auto-generated constructor stub
	}


}
