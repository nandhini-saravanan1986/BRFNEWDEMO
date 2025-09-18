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
@Table(name="T11_OR_CUSTOMER_BANKING_ACCOUNTS")
public class T11ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_NO_OF_ACCOUNTS;
	private BigDecimal	A1_AMOUNT;
	private String	A2_PRODUCT;
	private String	A3_PRODUCT;
	private BigDecimal	A3_NO_OF_ACCOUNTS;
	private BigDecimal	A3_AMOUNT;
	private String	A4_PRODUCT;
	private BigDecimal	A4_NO_OF_ACCOUNTS;
	private BigDecimal	A4_AMOUNT;
	private String	A5_PRODUCT;
	private BigDecimal	A5_NO_OF_ACCOUNTS;
	private BigDecimal	A5_AMOUNT;
	private String	A6_PRODUCT;
	private String	A7_PRODUCT;
	private BigDecimal	A7_NO_OF_ACCOUNTS;
	private BigDecimal	A7_AMOUNT;
	private String	A8_PRODUCT;
	private BigDecimal	A8_NO_OF_ACCOUNTS;
	private BigDecimal	A8_AMOUNT;
	private String	A9_PRODUCT;
	private BigDecimal	A9_NO_OF_ACCOUNTS;
	private BigDecimal	A9_AMOUNT;
	private String	A10_PRODUCT;
	private String	A11_PRODUCT;
	private BigDecimal	A11_NO_OF_ACCOUNTS;
	private BigDecimal	A11_AMOUNT;
	private String	A12_PRODUCT;
	private BigDecimal	A12_NO_OF_ACCOUNTS;
	private BigDecimal	A12_AMOUNT;
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
	public BigDecimal getA1_NO_OF_ACCOUNTS() {
		return A1_NO_OF_ACCOUNTS;
	}
	public void setA1_NO_OF_ACCOUNTS(BigDecimal a1_NO_OF_ACCOUNTS) {
		A1_NO_OF_ACCOUNTS = a1_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA1_AMOUNT() {
		return A1_AMOUNT;
	}
	public void setA1_AMOUNT(BigDecimal a1_AMOUNT) {
		A1_AMOUNT = a1_AMOUNT;
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
	public BigDecimal getA3_NO_OF_ACCOUNTS() {
		return A3_NO_OF_ACCOUNTS;
	}
	public void setA3_NO_OF_ACCOUNTS(BigDecimal a3_NO_OF_ACCOUNTS) {
		A3_NO_OF_ACCOUNTS = a3_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA3_AMOUNT() {
		return A3_AMOUNT;
	}
	public void setA3_AMOUNT(BigDecimal a3_AMOUNT) {
		A3_AMOUNT = a3_AMOUNT;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_NO_OF_ACCOUNTS() {
		return A4_NO_OF_ACCOUNTS;
	}
	public void setA4_NO_OF_ACCOUNTS(BigDecimal a4_NO_OF_ACCOUNTS) {
		A4_NO_OF_ACCOUNTS = a4_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA4_AMOUNT() {
		return A4_AMOUNT;
	}
	public void setA4_AMOUNT(BigDecimal a4_AMOUNT) {
		A4_AMOUNT = a4_AMOUNT;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_NO_OF_ACCOUNTS() {
		return A5_NO_OF_ACCOUNTS;
	}
	public void setA5_NO_OF_ACCOUNTS(BigDecimal a5_NO_OF_ACCOUNTS) {
		A5_NO_OF_ACCOUNTS = a5_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA5_AMOUNT() {
		return A5_AMOUNT;
	}
	public void setA5_AMOUNT(BigDecimal a5_AMOUNT) {
		A5_AMOUNT = a5_AMOUNT;
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
	public BigDecimal getA7_NO_OF_ACCOUNTS() {
		return A7_NO_OF_ACCOUNTS;
	}
	public void setA7_NO_OF_ACCOUNTS(BigDecimal a7_NO_OF_ACCOUNTS) {
		A7_NO_OF_ACCOUNTS = a7_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA7_AMOUNT() {
		return A7_AMOUNT;
	}
	public void setA7_AMOUNT(BigDecimal a7_AMOUNT) {
		A7_AMOUNT = a7_AMOUNT;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_NO_OF_ACCOUNTS() {
		return A8_NO_OF_ACCOUNTS;
	}
	public void setA8_NO_OF_ACCOUNTS(BigDecimal a8_NO_OF_ACCOUNTS) {
		A8_NO_OF_ACCOUNTS = a8_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA8_AMOUNT() {
		return A8_AMOUNT;
	}
	public void setA8_AMOUNT(BigDecimal a8_AMOUNT) {
		A8_AMOUNT = a8_AMOUNT;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_NO_OF_ACCOUNTS() {
		return A9_NO_OF_ACCOUNTS;
	}
	public void setA9_NO_OF_ACCOUNTS(BigDecimal a9_NO_OF_ACCOUNTS) {
		A9_NO_OF_ACCOUNTS = a9_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA9_AMOUNT() {
		return A9_AMOUNT;
	}
	public void setA9_AMOUNT(BigDecimal a9_AMOUNT) {
		A9_AMOUNT = a9_AMOUNT;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_NO_OF_ACCOUNTS() {
		return A11_NO_OF_ACCOUNTS;
	}
	public void setA11_NO_OF_ACCOUNTS(BigDecimal a11_NO_OF_ACCOUNTS) {
		A11_NO_OF_ACCOUNTS = a11_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA11_AMOUNT() {
		return A11_AMOUNT;
	}
	public void setA11_AMOUNT(BigDecimal a11_AMOUNT) {
		A11_AMOUNT = a11_AMOUNT;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_NO_OF_ACCOUNTS() {
		return A12_NO_OF_ACCOUNTS;
	}
	public void setA12_NO_OF_ACCOUNTS(BigDecimal a12_NO_OF_ACCOUNTS) {
		A12_NO_OF_ACCOUNTS = a12_NO_OF_ACCOUNTS;
	}
	public BigDecimal getA12_AMOUNT() {
		return A12_AMOUNT;
	}
	public void setA12_AMOUNT(BigDecimal a12_AMOUNT) {
		A12_AMOUNT = a12_AMOUNT;
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
	public T11ORReport(String a1_PRODUCT, BigDecimal a1_NO_OF_ACCOUNTS, BigDecimal a1_AMOUNT, String a2_PRODUCT,
			String a3_PRODUCT, BigDecimal a3_NO_OF_ACCOUNTS, BigDecimal a3_AMOUNT, String a4_PRODUCT,
			BigDecimal a4_NO_OF_ACCOUNTS, BigDecimal a4_AMOUNT, String a5_PRODUCT, BigDecimal a5_NO_OF_ACCOUNTS,
			BigDecimal a5_AMOUNT, String a6_PRODUCT, String a7_PRODUCT, BigDecimal a7_NO_OF_ACCOUNTS,
			BigDecimal a7_AMOUNT, String a8_PRODUCT, BigDecimal a8_NO_OF_ACCOUNTS, BigDecimal a8_AMOUNT,
			String a9_PRODUCT, BigDecimal a9_NO_OF_ACCOUNTS, BigDecimal a9_AMOUNT, String a10_PRODUCT,
			String a11_PRODUCT, BigDecimal a11_NO_OF_ACCOUNTS, BigDecimal a11_AMOUNT, String a12_PRODUCT,
			BigDecimal a12_NO_OF_ACCOUNTS, BigDecimal a12_AMOUNT, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_NO_OF_ACCOUNTS = a1_NO_OF_ACCOUNTS;
		A1_AMOUNT = a1_AMOUNT;
		A2_PRODUCT = a2_PRODUCT;
		A3_PRODUCT = a3_PRODUCT;
		A3_NO_OF_ACCOUNTS = a3_NO_OF_ACCOUNTS;
		A3_AMOUNT = a3_AMOUNT;
		A4_PRODUCT = a4_PRODUCT;
		A4_NO_OF_ACCOUNTS = a4_NO_OF_ACCOUNTS;
		A4_AMOUNT = a4_AMOUNT;
		A5_PRODUCT = a5_PRODUCT;
		A5_NO_OF_ACCOUNTS = a5_NO_OF_ACCOUNTS;
		A5_AMOUNT = a5_AMOUNT;
		A6_PRODUCT = a6_PRODUCT;
		A7_PRODUCT = a7_PRODUCT;
		A7_NO_OF_ACCOUNTS = a7_NO_OF_ACCOUNTS;
		A7_AMOUNT = a7_AMOUNT;
		A8_PRODUCT = a8_PRODUCT;
		A8_NO_OF_ACCOUNTS = a8_NO_OF_ACCOUNTS;
		A8_AMOUNT = a8_AMOUNT;
		A9_PRODUCT = a9_PRODUCT;
		A9_NO_OF_ACCOUNTS = a9_NO_OF_ACCOUNTS;
		A9_AMOUNT = a9_AMOUNT;
		A10_PRODUCT = a10_PRODUCT;
		A11_PRODUCT = a11_PRODUCT;
		A11_NO_OF_ACCOUNTS = a11_NO_OF_ACCOUNTS;
		A11_AMOUNT = a11_AMOUNT;
		A12_PRODUCT = a12_PRODUCT;
		A12_NO_OF_ACCOUNTS = a12_NO_OF_ACCOUNTS;
		A12_AMOUNT = a12_AMOUNT;
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
	public T11ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}
