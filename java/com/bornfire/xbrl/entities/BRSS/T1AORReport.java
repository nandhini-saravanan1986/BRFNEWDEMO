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
@Table(name ="T1A_OR_EMPLOYEE_PROFILE")
public class T1AORReport {

	private String	A1_PRODUCT;
	private BigDecimal	A1_FULL_TIME_EMPLOYEE;
	private BigDecimal	A1_FULL_TIME_CONTRACT;
	private BigDecimal	A1_FULL_TIME_TOTAL;
	private BigDecimal	A1_PART_TIME_EMPLOYEE;
	private BigDecimal	A1_PART_TIME_CONTRACT;
	private BigDecimal	A1_PART_TIME_TOTAL;
	private BigDecimal	A1_TOTAL_EMPLOYEE;
	private String	A2_PRODUCT;
	private BigDecimal	A2_FULL_TIME_EMPLOYEE;
	private BigDecimal	A2_FULL_TIME_CONTRACT;
	private BigDecimal	A2_FULL_TIME_TOTAL;
	private BigDecimal	A2_PART_TIME_EMPLOYEE;
	private BigDecimal	A2_PART_TIME_CONTRACT;
	private BigDecimal	A2_PART_TIME_TOTAL;
	private BigDecimal	A2_TOTAL_EMPLOYEE;
	private String	A3_PRODUCT;
	private BigDecimal	A3_FULL_TIME_EMPLOYEE;
	private BigDecimal	A3_FULL_TIME_CONTRACT;
	private BigDecimal	A3_FULL_TIME_TOTAL;
	private BigDecimal	A3_PART_TIME_EMPLOYEE;
	private BigDecimal	A3_PART_TIME_CONTRACT;
	private BigDecimal	A3_PART_TIME_TOTAL;
	private BigDecimal	A3_TOTAL_EMPLOYEE;
	private String	A4_PRODUCT;
	private BigDecimal	A4_FULL_TIME_EMPLOYEE;
	private BigDecimal	A4_FULL_TIME_CONTRACT;
	private BigDecimal	A4_FULL_TIME_TOTAL;
	private BigDecimal	A4_PART_TIME_EMPLOYEE;
	private BigDecimal	A4_PART_TIME_CONTRACT;
	private BigDecimal	A4_PART_TIME_TOTAL;
	private BigDecimal	A4_TOTAL_EMPLOYEE;
	private String	A5_PRODUCT;
	private BigDecimal	A5_FULL_TIME_EMPLOYEE;
	private BigDecimal	A5_FULL_TIME_CONTRACT;
	private BigDecimal	A5_FULL_TIME_TOTAL;
	private BigDecimal	A5_PART_TIME_EMPLOYEE;
	private BigDecimal	A5_PART_TIME_CONTRACT;
	private BigDecimal	A5_PART_TIME_TOTAL;
	private BigDecimal	A5_TOTAL_EMPLOYEE;
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
	public BigDecimal getA1_FULL_TIME_EMPLOYEE() {
		return A1_FULL_TIME_EMPLOYEE;
	}
	public void setA1_FULL_TIME_EMPLOYEE(BigDecimal a1_FULL_TIME_EMPLOYEE) {
		A1_FULL_TIME_EMPLOYEE = a1_FULL_TIME_EMPLOYEE;
	}
	public BigDecimal getA1_FULL_TIME_CONTRACT() {
		return A1_FULL_TIME_CONTRACT;
	}
	public void setA1_FULL_TIME_CONTRACT(BigDecimal a1_FULL_TIME_CONTRACT) {
		A1_FULL_TIME_CONTRACT = a1_FULL_TIME_CONTRACT;
	}
	public BigDecimal getA1_FULL_TIME_TOTAL() {
		return A1_FULL_TIME_TOTAL;
	}
	public void setA1_FULL_TIME_TOTAL(BigDecimal a1_FULL_TIME_TOTAL) {
		A1_FULL_TIME_TOTAL = a1_FULL_TIME_TOTAL;
	}
	public BigDecimal getA1_PART_TIME_EMPLOYEE() {
		return A1_PART_TIME_EMPLOYEE;
	}
	public void setA1_PART_TIME_EMPLOYEE(BigDecimal a1_PART_TIME_EMPLOYEE) {
		A1_PART_TIME_EMPLOYEE = a1_PART_TIME_EMPLOYEE;
	}
	public BigDecimal getA1_PART_TIME_CONTRACT() {
		return A1_PART_TIME_CONTRACT;
	}
	public void setA1_PART_TIME_CONTRACT(BigDecimal a1_PART_TIME_CONTRACT) {
		A1_PART_TIME_CONTRACT = a1_PART_TIME_CONTRACT;
	}
	public BigDecimal getA1_PART_TIME_TOTAL() {
		return A1_PART_TIME_TOTAL;
	}
	public void setA1_PART_TIME_TOTAL(BigDecimal a1_PART_TIME_TOTAL) {
		A1_PART_TIME_TOTAL = a1_PART_TIME_TOTAL;
	}
	public BigDecimal getA1_TOTAL_EMPLOYEE() {
		return A1_TOTAL_EMPLOYEE;
	}
	public void setA1_TOTAL_EMPLOYEE(BigDecimal a1_TOTAL_EMPLOYEE) {
		A1_TOTAL_EMPLOYEE = a1_TOTAL_EMPLOYEE;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_FULL_TIME_EMPLOYEE() {
		return A2_FULL_TIME_EMPLOYEE;
	}
	public void setA2_FULL_TIME_EMPLOYEE(BigDecimal a2_FULL_TIME_EMPLOYEE) {
		A2_FULL_TIME_EMPLOYEE = a2_FULL_TIME_EMPLOYEE;
	}
	public BigDecimal getA2_FULL_TIME_CONTRACT() {
		return A2_FULL_TIME_CONTRACT;
	}
	public void setA2_FULL_TIME_CONTRACT(BigDecimal a2_FULL_TIME_CONTRACT) {
		A2_FULL_TIME_CONTRACT = a2_FULL_TIME_CONTRACT;
	}
	public BigDecimal getA2_FULL_TIME_TOTAL() {
		return A2_FULL_TIME_TOTAL;
	}
	public void setA2_FULL_TIME_TOTAL(BigDecimal a2_FULL_TIME_TOTAL) {
		A2_FULL_TIME_TOTAL = a2_FULL_TIME_TOTAL;
	}
	public BigDecimal getA2_PART_TIME_EMPLOYEE() {
		return A2_PART_TIME_EMPLOYEE;
	}
	public void setA2_PART_TIME_EMPLOYEE(BigDecimal a2_PART_TIME_EMPLOYEE) {
		A2_PART_TIME_EMPLOYEE = a2_PART_TIME_EMPLOYEE;
	}
	public BigDecimal getA2_PART_TIME_CONTRACT() {
		return A2_PART_TIME_CONTRACT;
	}
	public void setA2_PART_TIME_CONTRACT(BigDecimal a2_PART_TIME_CONTRACT) {
		A2_PART_TIME_CONTRACT = a2_PART_TIME_CONTRACT;
	}
	public BigDecimal getA2_PART_TIME_TOTAL() {
		return A2_PART_TIME_TOTAL;
	}
	public void setA2_PART_TIME_TOTAL(BigDecimal a2_PART_TIME_TOTAL) {
		A2_PART_TIME_TOTAL = a2_PART_TIME_TOTAL;
	}
	public BigDecimal getA2_TOTAL_EMPLOYEE() {
		return A2_TOTAL_EMPLOYEE;
	}
	public void setA2_TOTAL_EMPLOYEE(BigDecimal a2_TOTAL_EMPLOYEE) {
		A2_TOTAL_EMPLOYEE = a2_TOTAL_EMPLOYEE;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_FULL_TIME_EMPLOYEE() {
		return A3_FULL_TIME_EMPLOYEE;
	}
	public void setA3_FULL_TIME_EMPLOYEE(BigDecimal a3_FULL_TIME_EMPLOYEE) {
		A3_FULL_TIME_EMPLOYEE = a3_FULL_TIME_EMPLOYEE;
	}
	public BigDecimal getA3_FULL_TIME_CONTRACT() {
		return A3_FULL_TIME_CONTRACT;
	}
	public void setA3_FULL_TIME_CONTRACT(BigDecimal a3_FULL_TIME_CONTRACT) {
		A3_FULL_TIME_CONTRACT = a3_FULL_TIME_CONTRACT;
	}
	public BigDecimal getA3_FULL_TIME_TOTAL() {
		return A3_FULL_TIME_TOTAL;
	}
	public void setA3_FULL_TIME_TOTAL(BigDecimal a3_FULL_TIME_TOTAL) {
		A3_FULL_TIME_TOTAL = a3_FULL_TIME_TOTAL;
	}
	public BigDecimal getA3_PART_TIME_EMPLOYEE() {
		return A3_PART_TIME_EMPLOYEE;
	}
	public void setA3_PART_TIME_EMPLOYEE(BigDecimal a3_PART_TIME_EMPLOYEE) {
		A3_PART_TIME_EMPLOYEE = a3_PART_TIME_EMPLOYEE;
	}
	public BigDecimal getA3_PART_TIME_CONTRACT() {
		return A3_PART_TIME_CONTRACT;
	}
	public void setA3_PART_TIME_CONTRACT(BigDecimal a3_PART_TIME_CONTRACT) {
		A3_PART_TIME_CONTRACT = a3_PART_TIME_CONTRACT;
	}
	public BigDecimal getA3_PART_TIME_TOTAL() {
		return A3_PART_TIME_TOTAL;
	}
	public void setA3_PART_TIME_TOTAL(BigDecimal a3_PART_TIME_TOTAL) {
		A3_PART_TIME_TOTAL = a3_PART_TIME_TOTAL;
	}
	public BigDecimal getA3_TOTAL_EMPLOYEE() {
		return A3_TOTAL_EMPLOYEE;
	}
	public void setA3_TOTAL_EMPLOYEE(BigDecimal a3_TOTAL_EMPLOYEE) {
		A3_TOTAL_EMPLOYEE = a3_TOTAL_EMPLOYEE;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_FULL_TIME_EMPLOYEE() {
		return A4_FULL_TIME_EMPLOYEE;
	}
	public void setA4_FULL_TIME_EMPLOYEE(BigDecimal a4_FULL_TIME_EMPLOYEE) {
		A4_FULL_TIME_EMPLOYEE = a4_FULL_TIME_EMPLOYEE;
	}
	public BigDecimal getA4_FULL_TIME_CONTRACT() {
		return A4_FULL_TIME_CONTRACT;
	}
	public void setA4_FULL_TIME_CONTRACT(BigDecimal a4_FULL_TIME_CONTRACT) {
		A4_FULL_TIME_CONTRACT = a4_FULL_TIME_CONTRACT;
	}
	public BigDecimal getA4_FULL_TIME_TOTAL() {
		return A4_FULL_TIME_TOTAL;
	}
	public void setA4_FULL_TIME_TOTAL(BigDecimal a4_FULL_TIME_TOTAL) {
		A4_FULL_TIME_TOTAL = a4_FULL_TIME_TOTAL;
	}
	public BigDecimal getA4_PART_TIME_EMPLOYEE() {
		return A4_PART_TIME_EMPLOYEE;
	}
	public void setA4_PART_TIME_EMPLOYEE(BigDecimal a4_PART_TIME_EMPLOYEE) {
		A4_PART_TIME_EMPLOYEE = a4_PART_TIME_EMPLOYEE;
	}
	public BigDecimal getA4_PART_TIME_CONTRACT() {
		return A4_PART_TIME_CONTRACT;
	}
	public void setA4_PART_TIME_CONTRACT(BigDecimal a4_PART_TIME_CONTRACT) {
		A4_PART_TIME_CONTRACT = a4_PART_TIME_CONTRACT;
	}
	public BigDecimal getA4_PART_TIME_TOTAL() {
		return A4_PART_TIME_TOTAL;
	}
	public void setA4_PART_TIME_TOTAL(BigDecimal a4_PART_TIME_TOTAL) {
		A4_PART_TIME_TOTAL = a4_PART_TIME_TOTAL;
	}
	public BigDecimal getA4_TOTAL_EMPLOYEE() {
		return A4_TOTAL_EMPLOYEE;
	}
	public void setA4_TOTAL_EMPLOYEE(BigDecimal a4_TOTAL_EMPLOYEE) {
		A4_TOTAL_EMPLOYEE = a4_TOTAL_EMPLOYEE;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_FULL_TIME_EMPLOYEE() {
		return A5_FULL_TIME_EMPLOYEE;
	}
	public void setA5_FULL_TIME_EMPLOYEE(BigDecimal a5_FULL_TIME_EMPLOYEE) {
		A5_FULL_TIME_EMPLOYEE = a5_FULL_TIME_EMPLOYEE;
	}
	public BigDecimal getA5_FULL_TIME_CONTRACT() {
		return A5_FULL_TIME_CONTRACT;
	}
	public void setA5_FULL_TIME_CONTRACT(BigDecimal a5_FULL_TIME_CONTRACT) {
		A5_FULL_TIME_CONTRACT = a5_FULL_TIME_CONTRACT;
	}
	public BigDecimal getA5_FULL_TIME_TOTAL() {
		return A5_FULL_TIME_TOTAL;
	}
	public void setA5_FULL_TIME_TOTAL(BigDecimal a5_FULL_TIME_TOTAL) {
		A5_FULL_TIME_TOTAL = a5_FULL_TIME_TOTAL;
	}
	public BigDecimal getA5_PART_TIME_EMPLOYEE() {
		return A5_PART_TIME_EMPLOYEE;
	}
	public void setA5_PART_TIME_EMPLOYEE(BigDecimal a5_PART_TIME_EMPLOYEE) {
		A5_PART_TIME_EMPLOYEE = a5_PART_TIME_EMPLOYEE;
	}
	public BigDecimal getA5_PART_TIME_CONTRACT() {
		return A5_PART_TIME_CONTRACT;
	}
	public void setA5_PART_TIME_CONTRACT(BigDecimal a5_PART_TIME_CONTRACT) {
		A5_PART_TIME_CONTRACT = a5_PART_TIME_CONTRACT;
	}
	public BigDecimal getA5_PART_TIME_TOTAL() {
		return A5_PART_TIME_TOTAL;
	}
	public void setA5_PART_TIME_TOTAL(BigDecimal a5_PART_TIME_TOTAL) {
		A5_PART_TIME_TOTAL = a5_PART_TIME_TOTAL;
	}
	public BigDecimal getA5_TOTAL_EMPLOYEE() {
		return A5_TOTAL_EMPLOYEE;
	}
	public void setA5_TOTAL_EMPLOYEE(BigDecimal a5_TOTAL_EMPLOYEE) {
		A5_TOTAL_EMPLOYEE = a5_TOTAL_EMPLOYEE;
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
	public T1AORReport(String a1_PRODUCT, BigDecimal a1_FULL_TIME_EMPLOYEE, BigDecimal a1_FULL_TIME_CONTRACT,
			BigDecimal a1_FULL_TIME_TOTAL, BigDecimal a1_PART_TIME_EMPLOYEE, BigDecimal a1_PART_TIME_CONTRACT,
			BigDecimal a1_PART_TIME_TOTAL, BigDecimal a1_TOTAL_EMPLOYEE, String a2_PRODUCT,
			BigDecimal a2_FULL_TIME_EMPLOYEE, BigDecimal a2_FULL_TIME_CONTRACT, BigDecimal a2_FULL_TIME_TOTAL,
			BigDecimal a2_PART_TIME_EMPLOYEE, BigDecimal a2_PART_TIME_CONTRACT, BigDecimal a2_PART_TIME_TOTAL,
			BigDecimal a2_TOTAL_EMPLOYEE, String a3_PRODUCT, BigDecimal a3_FULL_TIME_EMPLOYEE,
			BigDecimal a3_FULL_TIME_CONTRACT, BigDecimal a3_FULL_TIME_TOTAL, BigDecimal a3_PART_TIME_EMPLOYEE,
			BigDecimal a3_PART_TIME_CONTRACT, BigDecimal a3_PART_TIME_TOTAL, BigDecimal a3_TOTAL_EMPLOYEE,
			String a4_PRODUCT, BigDecimal a4_FULL_TIME_EMPLOYEE, BigDecimal a4_FULL_TIME_CONTRACT,
			BigDecimal a4_FULL_TIME_TOTAL, BigDecimal a4_PART_TIME_EMPLOYEE, BigDecimal a4_PART_TIME_CONTRACT,
			BigDecimal a4_PART_TIME_TOTAL, BigDecimal a4_TOTAL_EMPLOYEE, String a5_PRODUCT,
			BigDecimal a5_FULL_TIME_EMPLOYEE, BigDecimal a5_FULL_TIME_CONTRACT, BigDecimal a5_FULL_TIME_TOTAL,
			BigDecimal a5_PART_TIME_EMPLOYEE, BigDecimal a5_PART_TIME_CONTRACT, BigDecimal a5_PART_TIME_TOTAL,
			BigDecimal a5_TOTAL_EMPLOYEE, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_FULL_TIME_EMPLOYEE = a1_FULL_TIME_EMPLOYEE;
		A1_FULL_TIME_CONTRACT = a1_FULL_TIME_CONTRACT;
		A1_FULL_TIME_TOTAL = a1_FULL_TIME_TOTAL;
		A1_PART_TIME_EMPLOYEE = a1_PART_TIME_EMPLOYEE;
		A1_PART_TIME_CONTRACT = a1_PART_TIME_CONTRACT;
		A1_PART_TIME_TOTAL = a1_PART_TIME_TOTAL;
		A1_TOTAL_EMPLOYEE = a1_TOTAL_EMPLOYEE;
		A2_PRODUCT = a2_PRODUCT;
		A2_FULL_TIME_EMPLOYEE = a2_FULL_TIME_EMPLOYEE;
		A2_FULL_TIME_CONTRACT = a2_FULL_TIME_CONTRACT;
		A2_FULL_TIME_TOTAL = a2_FULL_TIME_TOTAL;
		A2_PART_TIME_EMPLOYEE = a2_PART_TIME_EMPLOYEE;
		A2_PART_TIME_CONTRACT = a2_PART_TIME_CONTRACT;
		A2_PART_TIME_TOTAL = a2_PART_TIME_TOTAL;
		A2_TOTAL_EMPLOYEE = a2_TOTAL_EMPLOYEE;
		A3_PRODUCT = a3_PRODUCT;
		A3_FULL_TIME_EMPLOYEE = a3_FULL_TIME_EMPLOYEE;
		A3_FULL_TIME_CONTRACT = a3_FULL_TIME_CONTRACT;
		A3_FULL_TIME_TOTAL = a3_FULL_TIME_TOTAL;
		A3_PART_TIME_EMPLOYEE = a3_PART_TIME_EMPLOYEE;
		A3_PART_TIME_CONTRACT = a3_PART_TIME_CONTRACT;
		A3_PART_TIME_TOTAL = a3_PART_TIME_TOTAL;
		A3_TOTAL_EMPLOYEE = a3_TOTAL_EMPLOYEE;
		A4_PRODUCT = a4_PRODUCT;
		A4_FULL_TIME_EMPLOYEE = a4_FULL_TIME_EMPLOYEE;
		A4_FULL_TIME_CONTRACT = a4_FULL_TIME_CONTRACT;
		A4_FULL_TIME_TOTAL = a4_FULL_TIME_TOTAL;
		A4_PART_TIME_EMPLOYEE = a4_PART_TIME_EMPLOYEE;
		A4_PART_TIME_CONTRACT = a4_PART_TIME_CONTRACT;
		A4_PART_TIME_TOTAL = a4_PART_TIME_TOTAL;
		A4_TOTAL_EMPLOYEE = a4_TOTAL_EMPLOYEE;
		A5_PRODUCT = a5_PRODUCT;
		A5_FULL_TIME_EMPLOYEE = a5_FULL_TIME_EMPLOYEE;
		A5_FULL_TIME_CONTRACT = a5_FULL_TIME_CONTRACT;
		A5_FULL_TIME_TOTAL = a5_FULL_TIME_TOTAL;
		A5_PART_TIME_EMPLOYEE = a5_PART_TIME_EMPLOYEE;
		A5_PART_TIME_CONTRACT = a5_PART_TIME_CONTRACT;
		A5_PART_TIME_TOTAL = a5_PART_TIME_TOTAL;
		A5_TOTAL_EMPLOYEE = a5_TOTAL_EMPLOYEE;
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
	public T1AORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
}
