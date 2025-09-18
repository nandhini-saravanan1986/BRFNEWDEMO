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
@Table(name="T14_OR_AMENDMENT_SYSTEM_TABLE")
public class T14ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_YEARLY;
	private BigDecimal	A1_MONTHLY;
	private BigDecimal	A1_QUARTER_1;
	private BigDecimal	A1_QUARTER_2;
	private BigDecimal	A1_QUARTER_3;
	private BigDecimal	A1_QUARTER_4;
	private String	A2_PRODUCT;
	private String	A3_PRODUCT;
	private BigDecimal	A3_YEARLY;
	private BigDecimal	A3_MONTHLY;
	private BigDecimal	A3_QUARTER_1;
	private BigDecimal	A3_QUARTER_2;
	private BigDecimal	A3_QUARTER_3;
	private BigDecimal	A3_QUARTER_4;
	private String	A4_PRODUCT;
	private BigDecimal	A4_YEARLY;
	private BigDecimal	A4_MONTHLY;
	private BigDecimal	A4_QUARTER_1;
	private BigDecimal	A4_QUARTER_2;
	private BigDecimal	A4_QUARTER_3;
	private BigDecimal	A4_QUARTER_4;
	private String	A5_PRODUCT;
	private BigDecimal	A5_YEARLY;
	private BigDecimal	A5_MONTHLY;
	private BigDecimal	A5_QUARTER_1;
	private BigDecimal	A5_QUARTER_2;
	private BigDecimal	A5_QUARTER_3;
	private BigDecimal	A5_QUARTER_4;
	private String	A6_PRODUCT;
	private BigDecimal	A6_YEARLY;
	private BigDecimal	A6_MONTHLY;
	private BigDecimal	A6_QUARTER_1;
	private BigDecimal	A6_QUARTER_2;
	private BigDecimal	A6_QUARTER_3;
	private BigDecimal	A6_QUARTER_4;
	private String	A7_PRODUCT;
	private BigDecimal	A7_YEARLY;
	private BigDecimal	A7_MONTHLY;
	private BigDecimal	A7_QUARTER_1;
	private BigDecimal	A7_QUARTER_2;
	private BigDecimal	A7_QUARTER_3;
	private BigDecimal	A7_QUARTER_4;
	private String	A8_PRODUCT;
	private BigDecimal	A8_YEARLY;
	private BigDecimal	A8_MONTHLY;
	private BigDecimal	A8_QUARTER_1;
	private BigDecimal	A8_QUARTER_2;
	private BigDecimal	A8_QUARTER_3;
	private BigDecimal	A8_QUARTER_4;
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
	private String HEADER_1;
	private String HEADER_2;
	private String HEADER_3;
	public String getHEADER_1() {
		return HEADER_1;
	}
	public void setHEADER_1(String hEADER_1) {
		HEADER_1 = hEADER_1;
	}
	public String getHEADER_2() {
		return HEADER_2;
	}
	public void setHEADER_2(String hEADER_2) {
		HEADER_2 = hEADER_2;
	}
	public String getHEADER_3() {
		return HEADER_3;
	}
	public void setHEADER_3(String hEADER_3) {
		HEADER_3 = hEADER_3;
	}
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_YEARLY() {
		return A1_YEARLY;
	}
	public void setA1_YEARLY(BigDecimal a1_YEARLY) {
		A1_YEARLY = a1_YEARLY;
	}
	public BigDecimal getA1_MONTHLY() {
		return A1_MONTHLY;
	}
	public void setA1_MONTHLY(BigDecimal a1_MONTHLY) {
		A1_MONTHLY = a1_MONTHLY;
	}
	public BigDecimal getA1_QUARTER_1() {
		return A1_QUARTER_1;
	}
	public void setA1_QUARTER_1(BigDecimal a1_QUARTER_1) {
		A1_QUARTER_1 = a1_QUARTER_1;
	}
	public BigDecimal getA1_QUARTER_2() {
		return A1_QUARTER_2;
	}
	public void setA1_QUARTER_2(BigDecimal a1_QUARTER_2) {
		A1_QUARTER_2 = a1_QUARTER_2;
	}
	public BigDecimal getA1_QUARTER_3() {
		return A1_QUARTER_3;
	}
	public void setA1_QUARTER_3(BigDecimal a1_QUARTER_3) {
		A1_QUARTER_3 = a1_QUARTER_3;
	}
	public BigDecimal getA1_QUARTER_4() {
		return A1_QUARTER_4;
	}
	public void setA1_QUARTER_4(BigDecimal a1_QUARTER_4) {
		A1_QUARTER_4 = a1_QUARTER_4;
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
	public BigDecimal getA3_YEARLY() {
		return A3_YEARLY;
	}
	public void setA3_YEARLY(BigDecimal a3_YEARLY) {
		A3_YEARLY = a3_YEARLY;
	}
	public BigDecimal getA3_MONTHLY() {
		return A3_MONTHLY;
	}
	public void setA3_MONTHLY(BigDecimal a3_MONTHLY) {
		A3_MONTHLY = a3_MONTHLY;
	}
	public BigDecimal getA3_QUARTER_1() {
		return A3_QUARTER_1;
	}
	public void setA3_QUARTER_1(BigDecimal a3_QUARTER_1) {
		A3_QUARTER_1 = a3_QUARTER_1;
	}
	public BigDecimal getA3_QUARTER_2() {
		return A3_QUARTER_2;
	}
	public void setA3_QUARTER_2(BigDecimal a3_QUARTER_2) {
		A3_QUARTER_2 = a3_QUARTER_2;
	}
	public BigDecimal getA3_QUARTER_3() {
		return A3_QUARTER_3;
	}
	public void setA3_QUARTER_3(BigDecimal a3_QUARTER_3) {
		A3_QUARTER_3 = a3_QUARTER_3;
	}
	public BigDecimal getA3_QUARTER_4() {
		return A3_QUARTER_4;
	}
	public void setA3_QUARTER_4(BigDecimal a3_QUARTER_4) {
		A3_QUARTER_4 = a3_QUARTER_4;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_YEARLY() {
		return A4_YEARLY;
	}
	public void setA4_YEARLY(BigDecimal a4_YEARLY) {
		A4_YEARLY = a4_YEARLY;
	}
	public BigDecimal getA4_MONTHLY() {
		return A4_MONTHLY;
	}
	public void setA4_MONTHLY(BigDecimal a4_MONTHLY) {
		A4_MONTHLY = a4_MONTHLY;
	}
	public BigDecimal getA4_QUARTER_1() {
		return A4_QUARTER_1;
	}
	public void setA4_QUARTER_1(BigDecimal a4_QUARTER_1) {
		A4_QUARTER_1 = a4_QUARTER_1;
	}
	public BigDecimal getA4_QUARTER_2() {
		return A4_QUARTER_2;
	}
	public void setA4_QUARTER_2(BigDecimal a4_QUARTER_2) {
		A4_QUARTER_2 = a4_QUARTER_2;
	}
	public BigDecimal getA4_QUARTER_3() {
		return A4_QUARTER_3;
	}
	public void setA4_QUARTER_3(BigDecimal a4_QUARTER_3) {
		A4_QUARTER_3 = a4_QUARTER_3;
	}
	public BigDecimal getA4_QUARTER_4() {
		return A4_QUARTER_4;
	}
	public void setA4_QUARTER_4(BigDecimal a4_QUARTER_4) {
		A4_QUARTER_4 = a4_QUARTER_4;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_YEARLY() {
		return A5_YEARLY;
	}
	public void setA5_YEARLY(BigDecimal a5_YEARLY) {
		A5_YEARLY = a5_YEARLY;
	}
	public BigDecimal getA5_MONTHLY() {
		return A5_MONTHLY;
	}
	public void setA5_MONTHLY(BigDecimal a5_MONTHLY) {
		A5_MONTHLY = a5_MONTHLY;
	}
	public BigDecimal getA5_QUARTER_1() {
		return A5_QUARTER_1;
	}
	public void setA5_QUARTER_1(BigDecimal a5_QUARTER_1) {
		A5_QUARTER_1 = a5_QUARTER_1;
	}
	public BigDecimal getA5_QUARTER_2() {
		return A5_QUARTER_2;
	}
	public void setA5_QUARTER_2(BigDecimal a5_QUARTER_2) {
		A5_QUARTER_2 = a5_QUARTER_2;
	}
	public BigDecimal getA5_QUARTER_3() {
		return A5_QUARTER_3;
	}
	public void setA5_QUARTER_3(BigDecimal a5_QUARTER_3) {
		A5_QUARTER_3 = a5_QUARTER_3;
	}
	public BigDecimal getA5_QUARTER_4() {
		return A5_QUARTER_4;
	}
	public void setA5_QUARTER_4(BigDecimal a5_QUARTER_4) {
		A5_QUARTER_4 = a5_QUARTER_4;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_YEARLY() {
		return A6_YEARLY;
	}
	public void setA6_YEARLY(BigDecimal a6_YEARLY) {
		A6_YEARLY = a6_YEARLY;
	}
	public BigDecimal getA6_MONTHLY() {
		return A6_MONTHLY;
	}
	public void setA6_MONTHLY(BigDecimal a6_MONTHLY) {
		A6_MONTHLY = a6_MONTHLY;
	}
	public BigDecimal getA6_QUARTER_1() {
		return A6_QUARTER_1;
	}
	public void setA6_QUARTER_1(BigDecimal a6_QUARTER_1) {
		A6_QUARTER_1 = a6_QUARTER_1;
	}
	public BigDecimal getA6_QUARTER_2() {
		return A6_QUARTER_2;
	}
	public void setA6_QUARTER_2(BigDecimal a6_QUARTER_2) {
		A6_QUARTER_2 = a6_QUARTER_2;
	}
	public BigDecimal getA6_QUARTER_3() {
		return A6_QUARTER_3;
	}
	public void setA6_QUARTER_3(BigDecimal a6_QUARTER_3) {
		A6_QUARTER_3 = a6_QUARTER_3;
	}
	public BigDecimal getA6_QUARTER_4() {
		return A6_QUARTER_4;
	}
	public void setA6_QUARTER_4(BigDecimal a6_QUARTER_4) {
		A6_QUARTER_4 = a6_QUARTER_4;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_YEARLY() {
		return A7_YEARLY;
	}
	public void setA7_YEARLY(BigDecimal a7_YEARLY) {
		A7_YEARLY = a7_YEARLY;
	}
	public BigDecimal getA7_MONTHLY() {
		return A7_MONTHLY;
	}
	public void setA7_MONTHLY(BigDecimal a7_MONTHLY) {
		A7_MONTHLY = a7_MONTHLY;
	}
	public BigDecimal getA7_QUARTER_1() {
		return A7_QUARTER_1;
	}
	public void setA7_QUARTER_1(BigDecimal a7_QUARTER_1) {
		A7_QUARTER_1 = a7_QUARTER_1;
	}
	public BigDecimal getA7_QUARTER_2() {
		return A7_QUARTER_2;
	}
	public void setA7_QUARTER_2(BigDecimal a7_QUARTER_2) {
		A7_QUARTER_2 = a7_QUARTER_2;
	}
	public BigDecimal getA7_QUARTER_3() {
		return A7_QUARTER_3;
	}
	public void setA7_QUARTER_3(BigDecimal a7_QUARTER_3) {
		A7_QUARTER_3 = a7_QUARTER_3;
	}
	public BigDecimal getA7_QUARTER_4() {
		return A7_QUARTER_4;
	}
	public void setA7_QUARTER_4(BigDecimal a7_QUARTER_4) {
		A7_QUARTER_4 = a7_QUARTER_4;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_YEARLY() {
		return A8_YEARLY;
	}
	public void setA8_YEARLY(BigDecimal a8_YEARLY) {
		A8_YEARLY = a8_YEARLY;
	}
	public BigDecimal getA8_MONTHLY() {
		return A8_MONTHLY;
	}
	public void setA8_MONTHLY(BigDecimal a8_MONTHLY) {
		A8_MONTHLY = a8_MONTHLY;
	}
	public BigDecimal getA8_QUARTER_1() {
		return A8_QUARTER_1;
	}
	public void setA8_QUARTER_1(BigDecimal a8_QUARTER_1) {
		A8_QUARTER_1 = a8_QUARTER_1;
	}
	public BigDecimal getA8_QUARTER_2() {
		return A8_QUARTER_2;
	}
	public void setA8_QUARTER_2(BigDecimal a8_QUARTER_2) {
		A8_QUARTER_2 = a8_QUARTER_2;
	}
	public BigDecimal getA8_QUARTER_3() {
		return A8_QUARTER_3;
	}
	public void setA8_QUARTER_3(BigDecimal a8_QUARTER_3) {
		A8_QUARTER_3 = a8_QUARTER_3;
	}
	public BigDecimal getA8_QUARTER_4() {
		return A8_QUARTER_4;
	}
	public void setA8_QUARTER_4(BigDecimal a8_QUARTER_4) {
		A8_QUARTER_4 = a8_QUARTER_4;
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


	public T14ORReport(String a1_PRODUCT, BigDecimal a1_YEARLY, BigDecimal a1_MONTHLY, BigDecimal a1_QUARTER_1,
			BigDecimal a1_QUARTER_2, BigDecimal a1_QUARTER_3, BigDecimal a1_QUARTER_4, String a2_PRODUCT,
			String a3_PRODUCT, BigDecimal a3_YEARLY, BigDecimal a3_MONTHLY, BigDecimal a3_QUARTER_1,
			BigDecimal a3_QUARTER_2, BigDecimal a3_QUARTER_3, BigDecimal a3_QUARTER_4, String a4_PRODUCT,
			BigDecimal a4_YEARLY, BigDecimal a4_MONTHLY, BigDecimal a4_QUARTER_1, BigDecimal a4_QUARTER_2,
			BigDecimal a4_QUARTER_3, BigDecimal a4_QUARTER_4, String a5_PRODUCT, BigDecimal a5_YEARLY,
			BigDecimal a5_MONTHLY, BigDecimal a5_QUARTER_1, BigDecimal a5_QUARTER_2, BigDecimal a5_QUARTER_3,
			BigDecimal a5_QUARTER_4, String a6_PRODUCT, BigDecimal a6_YEARLY, BigDecimal a6_MONTHLY,
			BigDecimal a6_QUARTER_1, BigDecimal a6_QUARTER_2, BigDecimal a6_QUARTER_3, BigDecimal a6_QUARTER_4,
			String a7_PRODUCT, BigDecimal a7_YEARLY, BigDecimal a7_MONTHLY, BigDecimal a7_QUARTER_1,
			BigDecimal a7_QUARTER_2, BigDecimal a7_QUARTER_3, BigDecimal a7_QUARTER_4, String a8_PRODUCT,
			BigDecimal a8_YEARLY, BigDecimal a8_MONTHLY, BigDecimal a8_QUARTER_1, BigDecimal a8_QUARTER_2,
			BigDecimal a8_QUARTER_3, BigDecimal a8_QUARTER_4, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG, String hEADER_1, String hEADER_2, String hEADER_3) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_YEARLY = a1_YEARLY;
		A1_MONTHLY = a1_MONTHLY;
		A1_QUARTER_1 = a1_QUARTER_1;
		A1_QUARTER_2 = a1_QUARTER_2;
		A1_QUARTER_3 = a1_QUARTER_3;
		A1_QUARTER_4 = a1_QUARTER_4;
		A2_PRODUCT = a2_PRODUCT;
		A3_PRODUCT = a3_PRODUCT;
		A3_YEARLY = a3_YEARLY;
		A3_MONTHLY = a3_MONTHLY;
		A3_QUARTER_1 = a3_QUARTER_1;
		A3_QUARTER_2 = a3_QUARTER_2;
		A3_QUARTER_3 = a3_QUARTER_3;
		A3_QUARTER_4 = a3_QUARTER_4;
		A4_PRODUCT = a4_PRODUCT;
		A4_YEARLY = a4_YEARLY;
		A4_MONTHLY = a4_MONTHLY;
		A4_QUARTER_1 = a4_QUARTER_1;
		A4_QUARTER_2 = a4_QUARTER_2;
		A4_QUARTER_3 = a4_QUARTER_3;
		A4_QUARTER_4 = a4_QUARTER_4;
		A5_PRODUCT = a5_PRODUCT;
		A5_YEARLY = a5_YEARLY;
		A5_MONTHLY = a5_MONTHLY;
		A5_QUARTER_1 = a5_QUARTER_1;
		A5_QUARTER_2 = a5_QUARTER_2;
		A5_QUARTER_3 = a5_QUARTER_3;
		A5_QUARTER_4 = a5_QUARTER_4;
		A6_PRODUCT = a6_PRODUCT;
		A6_YEARLY = a6_YEARLY;
		A6_MONTHLY = a6_MONTHLY;
		A6_QUARTER_1 = a6_QUARTER_1;
		A6_QUARTER_2 = a6_QUARTER_2;
		A6_QUARTER_3 = a6_QUARTER_3;
		A6_QUARTER_4 = a6_QUARTER_4;
		A7_PRODUCT = a7_PRODUCT;
		A7_YEARLY = a7_YEARLY;
		A7_MONTHLY = a7_MONTHLY;
		A7_QUARTER_1 = a7_QUARTER_1;
		A7_QUARTER_2 = a7_QUARTER_2;
		A7_QUARTER_3 = a7_QUARTER_3;
		A7_QUARTER_4 = a7_QUARTER_4;
		A8_PRODUCT = a8_PRODUCT;
		A8_YEARLY = a8_YEARLY;
		A8_MONTHLY = a8_MONTHLY;
		A8_QUARTER_1 = a8_QUARTER_1;
		A8_QUARTER_2 = a8_QUARTER_2;
		A8_QUARTER_3 = a8_QUARTER_3;
		A8_QUARTER_4 = a8_QUARTER_4;
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
		HEADER_1 = hEADER_1;
		HEADER_2 = hEADER_2;
		HEADER_3 = hEADER_3;
	}
	public T14ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    
  
}
