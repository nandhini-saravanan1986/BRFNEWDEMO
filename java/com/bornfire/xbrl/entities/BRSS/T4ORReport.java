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
@Table(name="T4_OR_EMPLOYEE_SATISFACTION")
public class T4ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_YEARLY_NUM;
	private BigDecimal	A1_MONTHLY_NUM;
	private BigDecimal	A1_QUARTER3_NUM;
	private BigDecimal	A1_QUARTER1_NUM_CUR;
	private BigDecimal	A1_QUARTER2_NUM_CUR;
	private BigDecimal	A1_QUARTER3_NUM_CUR;
	private String	A2_PRODUCT;
	private BigDecimal	A2_YEARLY_NUM;
	private BigDecimal	A2_MONTHLY_NUM;
	private BigDecimal	A2_QUARTER3_NUM;
	private BigDecimal	A2_QUARTER1_NUM_CUR;
	private BigDecimal	A2_QUARTER2_NUM_CUR;
	private BigDecimal	A2_QUARTER3_NUM_CUR;
	private String	A3_PRODUCT;
	private BigDecimal	A3_YEARLY_NUM;
	private BigDecimal	A3_MONTHLY_NUM;
	private BigDecimal	A3_QUARTER3_NUM;
	private BigDecimal	A3_QUARTER1_NUM_CUR;
	private BigDecimal	A3_QUARTER2_NUM_CUR;
	private BigDecimal	A3_QUARTER3_NUM_CUR;
	private String	A4_PRODUCT;
	private BigDecimal	A4_YEARLY_NUM;
	private BigDecimal	A4_MONTHLY_NUM;
	private BigDecimal	A4_QUARTER3_NUM;
	private BigDecimal	A4_QUARTER1_NUM_CUR;
	private BigDecimal	A4_QUARTER2_NUM_CUR;
	private BigDecimal	A4_QUARTER3_NUM_CUR;
	private String	A5_PRODUCT;
	private BigDecimal	A5_YEARLY_NUM;
	private BigDecimal	A5_MONTHLY_NUM;
	private BigDecimal	A5_QUARTER3_NUM;
	private BigDecimal	A5_QUARTER1_NUM_CUR;
	private BigDecimal	A5_QUARTER2_NUM_CUR;
	private BigDecimal	A5_QUARTER3_NUM_CUR;
	private String	A6_PRODUCT;
	private BigDecimal	A6_YEARLY_NUM;
	private BigDecimal	A6_MONTHLY_NUM;
	private BigDecimal	A6_QUARTER3_NUM;
	private BigDecimal	A6_QUARTER1_NUM_CUR;
	private BigDecimal	A6_QUARTER2_NUM_CUR;
	private BigDecimal	A6_QUARTER3_NUM_CUR;
	private String	A7_PRODUCT;
	private BigDecimal	A7_YEARLY_NUM;
	private BigDecimal	A7_MONTHLY_NUM;
	private BigDecimal	A7_QUARTER3_NUM;
	private BigDecimal	A7_QUARTER1_NUM_CUR;
	private BigDecimal	A7_QUARTER2_NUM_CUR;
	private BigDecimal	A7_QUARTER3_NUM_CUR;
	private String	A8_PRODUCT;
	private BigDecimal	A8_YEARLY_NUM;
	private BigDecimal	A8_MONTHLY_NUM;
	private BigDecimal	A8_QUARTER3_NUM;
	private BigDecimal	A8_QUARTER1_NUM_CUR;
	private BigDecimal	A8_QUARTER2_NUM_CUR;
	private BigDecimal	A8_QUARTER3_NUM_CUR;
	private String	A9_PRODUCT;
	private BigDecimal	A9_YEARLY_NUM;
	private BigDecimal	A9_MONTHLY_NUM;
	private BigDecimal	A9_QUARTER3_NUM;
	private BigDecimal	A9_QUARTER1_NUM_CUR;
	private BigDecimal	A9_QUARTER2_NUM_CUR;
	private BigDecimal	A9_QUARTER3_NUM_CUR;
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
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_YEARLY_NUM() {
		return A1_YEARLY_NUM;
	}
	public void setA1_YEARLY_NUM(BigDecimal a1_YEARLY_NUM) {
		A1_YEARLY_NUM = a1_YEARLY_NUM;
	}
	public BigDecimal getA1_MONTHLY_NUM() {
		return A1_MONTHLY_NUM;
	}
	public void setA1_MONTHLY_NUM(BigDecimal a1_MONTHLY_NUM) {
		A1_MONTHLY_NUM = a1_MONTHLY_NUM;
	}
	public BigDecimal getA1_QUARTER3_NUM() {
		return A1_QUARTER3_NUM;
	}
	public void setA1_QUARTER3_NUM(BigDecimal a1_QUARTER3_NUM) {
		A1_QUARTER3_NUM = a1_QUARTER3_NUM;
	}
	public BigDecimal getA1_QUARTER1_NUM_CUR() {
		return A1_QUARTER1_NUM_CUR;
	}
	public void setA1_QUARTER1_NUM_CUR(BigDecimal a1_QUARTER1_NUM_CUR) {
		A1_QUARTER1_NUM_CUR = a1_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA1_QUARTER2_NUM_CUR() {
		return A1_QUARTER2_NUM_CUR;
	}
	public void setA1_QUARTER2_NUM_CUR(BigDecimal a1_QUARTER2_NUM_CUR) {
		A1_QUARTER2_NUM_CUR = a1_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA1_QUARTER3_NUM_CUR() {
		return A1_QUARTER3_NUM_CUR;
	}
	public void setA1_QUARTER3_NUM_CUR(BigDecimal a1_QUARTER3_NUM_CUR) {
		A1_QUARTER3_NUM_CUR = a1_QUARTER3_NUM_CUR;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_YEARLY_NUM() {
		return A2_YEARLY_NUM;
	}
	public void setA2_YEARLY_NUM(BigDecimal a2_YEARLY_NUM) {
		A2_YEARLY_NUM = a2_YEARLY_NUM;
	}
	public BigDecimal getA2_MONTHLY_NUM() {
		return A2_MONTHLY_NUM;
	}
	public void setA2_MONTHLY_NUM(BigDecimal a2_MONTHLY_NUM) {
		A2_MONTHLY_NUM = a2_MONTHLY_NUM;
	}
	public BigDecimal getA2_QUARTER3_NUM() {
		return A2_QUARTER3_NUM;
	}
	public void setA2_QUARTER3_NUM(BigDecimal a2_QUARTER3_NUM) {
		A2_QUARTER3_NUM = a2_QUARTER3_NUM;
	}
	public BigDecimal getA2_QUARTER1_NUM_CUR() {
		return A2_QUARTER1_NUM_CUR;
	}
	public void setA2_QUARTER1_NUM_CUR(BigDecimal a2_QUARTER1_NUM_CUR) {
		A2_QUARTER1_NUM_CUR = a2_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA2_QUARTER2_NUM_CUR() {
		return A2_QUARTER2_NUM_CUR;
	}
	public void setA2_QUARTER2_NUM_CUR(BigDecimal a2_QUARTER2_NUM_CUR) {
		A2_QUARTER2_NUM_CUR = a2_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA2_QUARTER3_NUM_CUR() {
		return A2_QUARTER3_NUM_CUR;
	}
	public void setA2_QUARTER3_NUM_CUR(BigDecimal a2_QUARTER3_NUM_CUR) {
		A2_QUARTER3_NUM_CUR = a2_QUARTER3_NUM_CUR;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_YEARLY_NUM() {
		return A3_YEARLY_NUM;
	}
	public void setA3_YEARLY_NUM(BigDecimal a3_YEARLY_NUM) {
		A3_YEARLY_NUM = a3_YEARLY_NUM;
	}
	public BigDecimal getA3_MONTHLY_NUM() {
		return A3_MONTHLY_NUM;
	}
	public void setA3_MONTHLY_NUM(BigDecimal a3_MONTHLY_NUM) {
		A3_MONTHLY_NUM = a3_MONTHLY_NUM;
	}
	public BigDecimal getA3_QUARTER3_NUM() {
		return A3_QUARTER3_NUM;
	}
	public void setA3_QUARTER3_NUM(BigDecimal a3_QUARTER3_NUM) {
		A3_QUARTER3_NUM = a3_QUARTER3_NUM;
	}
	public BigDecimal getA3_QUARTER1_NUM_CUR() {
		return A3_QUARTER1_NUM_CUR;
	}
	public void setA3_QUARTER1_NUM_CUR(BigDecimal a3_QUARTER1_NUM_CUR) {
		A3_QUARTER1_NUM_CUR = a3_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA3_QUARTER2_NUM_CUR() {
		return A3_QUARTER2_NUM_CUR;
	}
	public void setA3_QUARTER2_NUM_CUR(BigDecimal a3_QUARTER2_NUM_CUR) {
		A3_QUARTER2_NUM_CUR = a3_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA3_QUARTER3_NUM_CUR() {
		return A3_QUARTER3_NUM_CUR;
	}
	public void setA3_QUARTER3_NUM_CUR(BigDecimal a3_QUARTER3_NUM_CUR) {
		A3_QUARTER3_NUM_CUR = a3_QUARTER3_NUM_CUR;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_YEARLY_NUM() {
		return A4_YEARLY_NUM;
	}
	public void setA4_YEARLY_NUM(BigDecimal a4_YEARLY_NUM) {
		A4_YEARLY_NUM = a4_YEARLY_NUM;
	}
	public BigDecimal getA4_MONTHLY_NUM() {
		return A4_MONTHLY_NUM;
	}
	public void setA4_MONTHLY_NUM(BigDecimal a4_MONTHLY_NUM) {
		A4_MONTHLY_NUM = a4_MONTHLY_NUM;
	}
	public BigDecimal getA4_QUARTER3_NUM() {
		return A4_QUARTER3_NUM;
	}
	public void setA4_QUARTER3_NUM(BigDecimal a4_QUARTER3_NUM) {
		A4_QUARTER3_NUM = a4_QUARTER3_NUM;
	}
	public BigDecimal getA4_QUARTER1_NUM_CUR() {
		return A4_QUARTER1_NUM_CUR;
	}
	public void setA4_QUARTER1_NUM_CUR(BigDecimal a4_QUARTER1_NUM_CUR) {
		A4_QUARTER1_NUM_CUR = a4_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA4_QUARTER2_NUM_CUR() {
		return A4_QUARTER2_NUM_CUR;
	}
	public void setA4_QUARTER2_NUM_CUR(BigDecimal a4_QUARTER2_NUM_CUR) {
		A4_QUARTER2_NUM_CUR = a4_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA4_QUARTER3_NUM_CUR() {
		return A4_QUARTER3_NUM_CUR;
	}
	public void setA4_QUARTER3_NUM_CUR(BigDecimal a4_QUARTER3_NUM_CUR) {
		A4_QUARTER3_NUM_CUR = a4_QUARTER3_NUM_CUR;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_YEARLY_NUM() {
		return A5_YEARLY_NUM;
	}
	public void setA5_YEARLY_NUM(BigDecimal a5_YEARLY_NUM) {
		A5_YEARLY_NUM = a5_YEARLY_NUM;
	}
	public BigDecimal getA5_MONTHLY_NUM() {
		return A5_MONTHLY_NUM;
	}
	public void setA5_MONTHLY_NUM(BigDecimal a5_MONTHLY_NUM) {
		A5_MONTHLY_NUM = a5_MONTHLY_NUM;
	}
	public BigDecimal getA5_QUARTER3_NUM() {
		return A5_QUARTER3_NUM;
	}
	public void setA5_QUARTER3_NUM(BigDecimal a5_QUARTER3_NUM) {
		A5_QUARTER3_NUM = a5_QUARTER3_NUM;
	}
	public BigDecimal getA5_QUARTER1_NUM_CUR() {
		return A5_QUARTER1_NUM_CUR;
	}
	public void setA5_QUARTER1_NUM_CUR(BigDecimal a5_QUARTER1_NUM_CUR) {
		A5_QUARTER1_NUM_CUR = a5_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA5_QUARTER2_NUM_CUR() {
		return A5_QUARTER2_NUM_CUR;
	}
	public void setA5_QUARTER2_NUM_CUR(BigDecimal a5_QUARTER2_NUM_CUR) {
		A5_QUARTER2_NUM_CUR = a5_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA5_QUARTER3_NUM_CUR() {
		return A5_QUARTER3_NUM_CUR;
	}
	public void setA5_QUARTER3_NUM_CUR(BigDecimal a5_QUARTER3_NUM_CUR) {
		A5_QUARTER3_NUM_CUR = a5_QUARTER3_NUM_CUR;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_YEARLY_NUM() {
		return A6_YEARLY_NUM;
	}
	public void setA6_YEARLY_NUM(BigDecimal a6_YEARLY_NUM) {
		A6_YEARLY_NUM = a6_YEARLY_NUM;
	}
	public BigDecimal getA6_MONTHLY_NUM() {
		return A6_MONTHLY_NUM;
	}
	public void setA6_MONTHLY_NUM(BigDecimal a6_MONTHLY_NUM) {
		A6_MONTHLY_NUM = a6_MONTHLY_NUM;
	}
	public BigDecimal getA6_QUARTER3_NUM() {
		return A6_QUARTER3_NUM;
	}
	public void setA6_QUARTER3_NUM(BigDecimal a6_QUARTER3_NUM) {
		A6_QUARTER3_NUM = a6_QUARTER3_NUM;
	}
	public BigDecimal getA6_QUARTER1_NUM_CUR() {
		return A6_QUARTER1_NUM_CUR;
	}
	public void setA6_QUARTER1_NUM_CUR(BigDecimal a6_QUARTER1_NUM_CUR) {
		A6_QUARTER1_NUM_CUR = a6_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA6_QUARTER2_NUM_CUR() {
		return A6_QUARTER2_NUM_CUR;
	}
	public void setA6_QUARTER2_NUM_CUR(BigDecimal a6_QUARTER2_NUM_CUR) {
		A6_QUARTER2_NUM_CUR = a6_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA6_QUARTER3_NUM_CUR() {
		return A6_QUARTER3_NUM_CUR;
	}
	public void setA6_QUARTER3_NUM_CUR(BigDecimal a6_QUARTER3_NUM_CUR) {
		A6_QUARTER3_NUM_CUR = a6_QUARTER3_NUM_CUR;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_YEARLY_NUM() {
		return A7_YEARLY_NUM;
	}
	public void setA7_YEARLY_NUM(BigDecimal a7_YEARLY_NUM) {
		A7_YEARLY_NUM = a7_YEARLY_NUM;
	}
	public BigDecimal getA7_MONTHLY_NUM() {
		return A7_MONTHLY_NUM;
	}
	public void setA7_MONTHLY_NUM(BigDecimal a7_MONTHLY_NUM) {
		A7_MONTHLY_NUM = a7_MONTHLY_NUM;
	}
	public BigDecimal getA7_QUARTER3_NUM() {
		return A7_QUARTER3_NUM;
	}
	public void setA7_QUARTER3_NUM(BigDecimal a7_QUARTER3_NUM) {
		A7_QUARTER3_NUM = a7_QUARTER3_NUM;
	}
	public BigDecimal getA7_QUARTER1_NUM_CUR() {
		return A7_QUARTER1_NUM_CUR;
	}
	public void setA7_QUARTER1_NUM_CUR(BigDecimal a7_QUARTER1_NUM_CUR) {
		A7_QUARTER1_NUM_CUR = a7_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA7_QUARTER2_NUM_CUR() {
		return A7_QUARTER2_NUM_CUR;
	}
	public void setA7_QUARTER2_NUM_CUR(BigDecimal a7_QUARTER2_NUM_CUR) {
		A7_QUARTER2_NUM_CUR = a7_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA7_QUARTER3_NUM_CUR() {
		return A7_QUARTER3_NUM_CUR;
	}
	public void setA7_QUARTER3_NUM_CUR(BigDecimal a7_QUARTER3_NUM_CUR) {
		A7_QUARTER3_NUM_CUR = a7_QUARTER3_NUM_CUR;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_YEARLY_NUM() {
		return A8_YEARLY_NUM;
	}
	public void setA8_YEARLY_NUM(BigDecimal a8_YEARLY_NUM) {
		A8_YEARLY_NUM = a8_YEARLY_NUM;
	}
	public BigDecimal getA8_MONTHLY_NUM() {
		return A8_MONTHLY_NUM;
	}
	public void setA8_MONTHLY_NUM(BigDecimal a8_MONTHLY_NUM) {
		A8_MONTHLY_NUM = a8_MONTHLY_NUM;
	}
	public BigDecimal getA8_QUARTER3_NUM() {
		return A8_QUARTER3_NUM;
	}
	public void setA8_QUARTER3_NUM(BigDecimal a8_QUARTER3_NUM) {
		A8_QUARTER3_NUM = a8_QUARTER3_NUM;
	}
	public BigDecimal getA8_QUARTER1_NUM_CUR() {
		return A8_QUARTER1_NUM_CUR;
	}
	public void setA8_QUARTER1_NUM_CUR(BigDecimal a8_QUARTER1_NUM_CUR) {
		A8_QUARTER1_NUM_CUR = a8_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA8_QUARTER2_NUM_CUR() {
		return A8_QUARTER2_NUM_CUR;
	}
	public void setA8_QUARTER2_NUM_CUR(BigDecimal a8_QUARTER2_NUM_CUR) {
		A8_QUARTER2_NUM_CUR = a8_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA8_QUARTER3_NUM_CUR() {
		return A8_QUARTER3_NUM_CUR;
	}
	public void setA8_QUARTER3_NUM_CUR(BigDecimal a8_QUARTER3_NUM_CUR) {
		A8_QUARTER3_NUM_CUR = a8_QUARTER3_NUM_CUR;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_YEARLY_NUM() {
		return A9_YEARLY_NUM;
	}
	public void setA9_YEARLY_NUM(BigDecimal a9_YEARLY_NUM) {
		A9_YEARLY_NUM = a9_YEARLY_NUM;
	}
	public BigDecimal getA9_MONTHLY_NUM() {
		return A9_MONTHLY_NUM;
	}
	public void setA9_MONTHLY_NUM(BigDecimal a9_MONTHLY_NUM) {
		A9_MONTHLY_NUM = a9_MONTHLY_NUM;
	}
	public BigDecimal getA9_QUARTER3_NUM() {
		return A9_QUARTER3_NUM;
	}
	public void setA9_QUARTER3_NUM(BigDecimal a9_QUARTER3_NUM) {
		A9_QUARTER3_NUM = a9_QUARTER3_NUM;
	}
	public BigDecimal getA9_QUARTER1_NUM_CUR() {
		return A9_QUARTER1_NUM_CUR;
	}
	public void setA9_QUARTER1_NUM_CUR(BigDecimal a9_QUARTER1_NUM_CUR) {
		A9_QUARTER1_NUM_CUR = a9_QUARTER1_NUM_CUR;
	}
	public BigDecimal getA9_QUARTER2_NUM_CUR() {
		return A9_QUARTER2_NUM_CUR;
	}
	public void setA9_QUARTER2_NUM_CUR(BigDecimal a9_QUARTER2_NUM_CUR) {
		A9_QUARTER2_NUM_CUR = a9_QUARTER2_NUM_CUR;
	}
	public BigDecimal getA9_QUARTER3_NUM_CUR() {
		return A9_QUARTER3_NUM_CUR;
	}
	public void setA9_QUARTER3_NUM_CUR(BigDecimal a9_QUARTER3_NUM_CUR) {
		A9_QUARTER3_NUM_CUR = a9_QUARTER3_NUM_CUR;
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
	public T4ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T4ORReport(String a1_PRODUCT, BigDecimal a1_YEARLY_NUM, BigDecimal a1_MONTHLY_NUM,
			BigDecimal a1_QUARTER3_NUM, BigDecimal a1_QUARTER1_NUM_CUR, BigDecimal a1_QUARTER2_NUM_CUR,
			BigDecimal a1_QUARTER3_NUM_CUR, String a2_PRODUCT, BigDecimal a2_YEARLY_NUM, BigDecimal a2_MONTHLY_NUM,
			BigDecimal a2_QUARTER3_NUM, BigDecimal a2_QUARTER1_NUM_CUR, BigDecimal a2_QUARTER2_NUM_CUR,
			BigDecimal a2_QUARTER3_NUM_CUR, String a3_PRODUCT, BigDecimal a3_YEARLY_NUM, BigDecimal a3_MONTHLY_NUM,
			BigDecimal a3_QUARTER3_NUM, BigDecimal a3_QUARTER1_NUM_CUR, BigDecimal a3_QUARTER2_NUM_CUR,
			BigDecimal a3_QUARTER3_NUM_CUR, String a4_PRODUCT, BigDecimal a4_YEARLY_NUM, BigDecimal a4_MONTHLY_NUM,
			BigDecimal a4_QUARTER3_NUM, BigDecimal a4_QUARTER1_NUM_CUR, BigDecimal a4_QUARTER2_NUM_CUR,
			BigDecimal a4_QUARTER3_NUM_CUR, String a5_PRODUCT, BigDecimal a5_YEARLY_NUM, BigDecimal a5_MONTHLY_NUM,
			BigDecimal a5_QUARTER3_NUM, BigDecimal a5_QUARTER1_NUM_CUR, BigDecimal a5_QUARTER2_NUM_CUR,
			BigDecimal a5_QUARTER3_NUM_CUR, String a6_PRODUCT, BigDecimal a6_YEARLY_NUM, BigDecimal a6_MONTHLY_NUM,
			BigDecimal a6_QUARTER3_NUM, BigDecimal a6_QUARTER1_NUM_CUR, BigDecimal a6_QUARTER2_NUM_CUR,
			BigDecimal a6_QUARTER3_NUM_CUR, String a7_PRODUCT, BigDecimal a7_YEARLY_NUM, BigDecimal a7_MONTHLY_NUM,
			BigDecimal a7_QUARTER3_NUM, BigDecimal a7_QUARTER1_NUM_CUR, BigDecimal a7_QUARTER2_NUM_CUR,
			BigDecimal a7_QUARTER3_NUM_CUR, String a8_PRODUCT, BigDecimal a8_YEARLY_NUM, BigDecimal a8_MONTHLY_NUM,
			BigDecimal a8_QUARTER3_NUM, BigDecimal a8_QUARTER1_NUM_CUR, BigDecimal a8_QUARTER2_NUM_CUR,
			BigDecimal a8_QUARTER3_NUM_CUR, String a9_PRODUCT, BigDecimal a9_YEARLY_NUM, BigDecimal a9_MONTHLY_NUM,
			BigDecimal a9_QUARTER3_NUM, BigDecimal a9_QUARTER1_NUM_CUR, BigDecimal a9_QUARTER2_NUM_CUR,
			BigDecimal a9_QUARTER3_NUM_CUR, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG, String hEADER_1, String hEADER_2, String hEADER_3) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_YEARLY_NUM = a1_YEARLY_NUM;
		A1_MONTHLY_NUM = a1_MONTHLY_NUM;
		A1_QUARTER3_NUM = a1_QUARTER3_NUM;
		A1_QUARTER1_NUM_CUR = a1_QUARTER1_NUM_CUR;
		A1_QUARTER2_NUM_CUR = a1_QUARTER2_NUM_CUR;
		A1_QUARTER3_NUM_CUR = a1_QUARTER3_NUM_CUR;
		A2_PRODUCT = a2_PRODUCT;
		A2_YEARLY_NUM = a2_YEARLY_NUM;
		A2_MONTHLY_NUM = a2_MONTHLY_NUM;
		A2_QUARTER3_NUM = a2_QUARTER3_NUM;
		A2_QUARTER1_NUM_CUR = a2_QUARTER1_NUM_CUR;
		A2_QUARTER2_NUM_CUR = a2_QUARTER2_NUM_CUR;
		A2_QUARTER3_NUM_CUR = a2_QUARTER3_NUM_CUR;
		A3_PRODUCT = a3_PRODUCT;
		A3_YEARLY_NUM = a3_YEARLY_NUM;
		A3_MONTHLY_NUM = a3_MONTHLY_NUM;
		A3_QUARTER3_NUM = a3_QUARTER3_NUM;
		A3_QUARTER1_NUM_CUR = a3_QUARTER1_NUM_CUR;
		A3_QUARTER2_NUM_CUR = a3_QUARTER2_NUM_CUR;
		A3_QUARTER3_NUM_CUR = a3_QUARTER3_NUM_CUR;
		A4_PRODUCT = a4_PRODUCT;
		A4_YEARLY_NUM = a4_YEARLY_NUM;
		A4_MONTHLY_NUM = a4_MONTHLY_NUM;
		A4_QUARTER3_NUM = a4_QUARTER3_NUM;
		A4_QUARTER1_NUM_CUR = a4_QUARTER1_NUM_CUR;
		A4_QUARTER2_NUM_CUR = a4_QUARTER2_NUM_CUR;
		A4_QUARTER3_NUM_CUR = a4_QUARTER3_NUM_CUR;
		A5_PRODUCT = a5_PRODUCT;
		A5_YEARLY_NUM = a5_YEARLY_NUM;
		A5_MONTHLY_NUM = a5_MONTHLY_NUM;
		A5_QUARTER3_NUM = a5_QUARTER3_NUM;
		A5_QUARTER1_NUM_CUR = a5_QUARTER1_NUM_CUR;
		A5_QUARTER2_NUM_CUR = a5_QUARTER2_NUM_CUR;
		A5_QUARTER3_NUM_CUR = a5_QUARTER3_NUM_CUR;
		A6_PRODUCT = a6_PRODUCT;
		A6_YEARLY_NUM = a6_YEARLY_NUM;
		A6_MONTHLY_NUM = a6_MONTHLY_NUM;
		A6_QUARTER3_NUM = a6_QUARTER3_NUM;
		A6_QUARTER1_NUM_CUR = a6_QUARTER1_NUM_CUR;
		A6_QUARTER2_NUM_CUR = a6_QUARTER2_NUM_CUR;
		A6_QUARTER3_NUM_CUR = a6_QUARTER3_NUM_CUR;
		A7_PRODUCT = a7_PRODUCT;
		A7_YEARLY_NUM = a7_YEARLY_NUM;
		A7_MONTHLY_NUM = a7_MONTHLY_NUM;
		A7_QUARTER3_NUM = a7_QUARTER3_NUM;
		A7_QUARTER1_NUM_CUR = a7_QUARTER1_NUM_CUR;
		A7_QUARTER2_NUM_CUR = a7_QUARTER2_NUM_CUR;
		A7_QUARTER3_NUM_CUR = a7_QUARTER3_NUM_CUR;
		A8_PRODUCT = a8_PRODUCT;
		A8_YEARLY_NUM = a8_YEARLY_NUM;
		A8_MONTHLY_NUM = a8_MONTHLY_NUM;
		A8_QUARTER3_NUM = a8_QUARTER3_NUM;
		A8_QUARTER1_NUM_CUR = a8_QUARTER1_NUM_CUR;
		A8_QUARTER2_NUM_CUR = a8_QUARTER2_NUM_CUR;
		A8_QUARTER3_NUM_CUR = a8_QUARTER3_NUM_CUR;
		A9_PRODUCT = a9_PRODUCT;
		A9_YEARLY_NUM = a9_YEARLY_NUM;
		A9_MONTHLY_NUM = a9_MONTHLY_NUM;
		A9_QUARTER3_NUM = a9_QUARTER3_NUM;
		A9_QUARTER1_NUM_CUR = a9_QUARTER1_NUM_CUR;
		A9_QUARTER2_NUM_CUR = a9_QUARTER2_NUM_CUR;
		A9_QUARTER3_NUM_CUR = a9_QUARTER3_NUM_CUR;
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
     
	
}
