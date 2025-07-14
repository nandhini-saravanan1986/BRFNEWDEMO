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
@Table(name="T13_OR_TRANSACTION_PROFILE_TABLE")
public class T13ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_YEARLY_NUMBER;
	private BigDecimal	A1_YEARLY_VALUE;
	private BigDecimal	A1_MONTHLY_NUMBER;
	private BigDecimal	A1_MONTHLY_VALUE;
	private BigDecimal	A1_Q1_NUMBER;
	private BigDecimal	A1_Q1_VALUE;
	private BigDecimal	A1_Q2_NUMBER;
	private BigDecimal	A1_Q2_VALUE;
	private BigDecimal	A1_Q3_NUMBER;
	private BigDecimal	A1_Q3_VALUE;
	private BigDecimal	A1_Q4_NUMBER;
	private BigDecimal	A1_Q4_VALUE;
	private String	A2_PRODUCT;
	private BigDecimal	A2_YEARLY_NUMBER;
	private BigDecimal	A2_YEARLY_VALUE;
	private BigDecimal	A2_MONTHLY_NUMBER;
	private BigDecimal	A2_MONTHLY_VALUE;
	private BigDecimal	A2_Q1_NUMBER;
	private BigDecimal	A2_Q1_VALUE;
	private BigDecimal	A2_Q2_NUMBER;
	private BigDecimal	A2_Q2_VALUE;
	private BigDecimal	A2_Q3_NUMBER;
	private BigDecimal	A2_Q3_VALUE;
	private BigDecimal	A2_Q4_NUMBER;
	private BigDecimal	A2_Q4_VALUE;
	private String	A3_PRODUCT;
	private BigDecimal	A3_YEARLY_NUMBER;
	private BigDecimal	A3_YEARLY_VALUE;
	private BigDecimal	A3_MONTHLY_NUMBER;
	private BigDecimal	A3_MONTHLY_VALUE;
	private BigDecimal	A3_Q1_NUMBER;
	private BigDecimal	A3_Q1_VALUE;
	private BigDecimal	A3_Q2_NUMBER;
	private BigDecimal	A3_Q2_VALUE;
	private BigDecimal	A3_Q3_NUMBER;
	private BigDecimal	A3_Q3_VALUE;
	private BigDecimal	A3_Q4_NUMBER;
	private BigDecimal	A3_Q4_VALUE;
	private String	A4_PRODUCT;
	private BigDecimal	A4_YEARLY_NUMBER;
	private BigDecimal	A4_YEARLY_VALUE;
	private BigDecimal	A4_MONTHLY_NUMBER;
	private BigDecimal	A4_MONTHLY_VALUE;
	private BigDecimal	A4_Q1_NUMBER;
	private BigDecimal	A4_Q1_VALUE;
	private BigDecimal	A4_Q2_NUMBER;
	private BigDecimal	A4_Q2_VALUE;
	private BigDecimal	A4_Q3_NUMBER;
	private BigDecimal	A4_Q3_VALUE;
	private BigDecimal	A4_Q4_NUMBER;
	private BigDecimal	A4_Q4_VALUE;
	private String	A5_PRODUCT;
	private BigDecimal	A5_YEARLY_NUMBER;
	private BigDecimal	A5_YEARLY_VALUE;
	private BigDecimal	A5_MONTHLY_NUMBER;
	private BigDecimal	A5_MONTHLY_VALUE;
	private BigDecimal	A5_Q1_NUMBER;
	private BigDecimal	A5_Q1_VALUE;
	private BigDecimal	A5_Q2_NUMBER;
	private BigDecimal	A5_Q2_VALUE;
	private BigDecimal	A5_Q3_NUMBER;
	private BigDecimal	A5_Q3_VALUE;
	private BigDecimal	A5_Q4_NUMBER;
	private BigDecimal	A5_Q4_VALUE;
	private String	A6_PRODUCT;
	private BigDecimal	A6_YEARLY_NUMBER;
	private BigDecimal	A6_YEARLY_VALUE;
	private BigDecimal	A6_MONTHLY_NUMBER;
	private BigDecimal	A6_MONTHLY_VALUE;
	private BigDecimal	A6_Q1_NUMBER;
	private BigDecimal	A6_Q1_VALUE;
	private BigDecimal	A6_Q2_NUMBER;
	private BigDecimal	A6_Q2_VALUE;
	private BigDecimal	A6_Q3_NUMBER;
	private BigDecimal	A6_Q3_VALUE;
	private BigDecimal	A6_Q4_NUMBER;
	private BigDecimal	A6_Q4_VALUE;
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
	public BigDecimal getA1_YEARLY_NUMBER() {
		return A1_YEARLY_NUMBER;
	}
	public void setA1_YEARLY_NUMBER(BigDecimal a1_YEARLY_NUMBER) {
		A1_YEARLY_NUMBER = a1_YEARLY_NUMBER;
	}
	public BigDecimal getA1_YEARLY_VALUE() {
		return A1_YEARLY_VALUE;
	}
	public void setA1_YEARLY_VALUE(BigDecimal a1_YEARLY_VALUE) {
		A1_YEARLY_VALUE = a1_YEARLY_VALUE;
	}
	public BigDecimal getA1_MONTHLY_NUMBER() {
		return A1_MONTHLY_NUMBER;
	}
	public void setA1_MONTHLY_NUMBER(BigDecimal a1_MONTHLY_NUMBER) {
		A1_MONTHLY_NUMBER = a1_MONTHLY_NUMBER;
	}
	public BigDecimal getA1_MONTHLY_VALUE() {
		return A1_MONTHLY_VALUE;
	}
	public void setA1_MONTHLY_VALUE(BigDecimal a1_MONTHLY_VALUE) {
		A1_MONTHLY_VALUE = a1_MONTHLY_VALUE;
	}
	public BigDecimal getA1_Q1_NUMBER() {
		return A1_Q1_NUMBER;
	}
	public void setA1_Q1_NUMBER(BigDecimal a1_Q1_NUMBER) {
		A1_Q1_NUMBER = a1_Q1_NUMBER;
	}
	public BigDecimal getA1_Q1_VALUE() {
		return A1_Q1_VALUE;
	}
	public void setA1_Q1_VALUE(BigDecimal a1_Q1_VALUE) {
		A1_Q1_VALUE = a1_Q1_VALUE;
	}
	public BigDecimal getA1_Q2_NUMBER() {
		return A1_Q2_NUMBER;
	}
	public void setA1_Q2_NUMBER(BigDecimal a1_Q2_NUMBER) {
		A1_Q2_NUMBER = a1_Q2_NUMBER;
	}
	public BigDecimal getA1_Q2_VALUE() {
		return A1_Q2_VALUE;
	}
	public void setA1_Q2_VALUE(BigDecimal a1_Q2_VALUE) {
		A1_Q2_VALUE = a1_Q2_VALUE;
	}
	public BigDecimal getA1_Q3_NUMBER() {
		return A1_Q3_NUMBER;
	}
	public void setA1_Q3_NUMBER(BigDecimal a1_Q3_NUMBER) {
		A1_Q3_NUMBER = a1_Q3_NUMBER;
	}
	public BigDecimal getA1_Q3_VALUE() {
		return A1_Q3_VALUE;
	}
	public void setA1_Q3_VALUE(BigDecimal a1_Q3_VALUE) {
		A1_Q3_VALUE = a1_Q3_VALUE;
	}
	public BigDecimal getA1_Q4_NUMBER() {
		return A1_Q4_NUMBER;
	}
	public void setA1_Q4_NUMBER(BigDecimal a1_Q4_NUMBER) {
		A1_Q4_NUMBER = a1_Q4_NUMBER;
	}
	public BigDecimal getA1_Q4_VALUE() {
		return A1_Q4_VALUE;
	}
	public void setA1_Q4_VALUE(BigDecimal a1_Q4_VALUE) {
		A1_Q4_VALUE = a1_Q4_VALUE;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_YEARLY_NUMBER() {
		return A2_YEARLY_NUMBER;
	}
	public void setA2_YEARLY_NUMBER(BigDecimal a2_YEARLY_NUMBER) {
		A2_YEARLY_NUMBER = a2_YEARLY_NUMBER;
	}
	public BigDecimal getA2_YEARLY_VALUE() {
		return A2_YEARLY_VALUE;
	}
	public void setA2_YEARLY_VALUE(BigDecimal a2_YEARLY_VALUE) {
		A2_YEARLY_VALUE = a2_YEARLY_VALUE;
	}
	public BigDecimal getA2_MONTHLY_NUMBER() {
		return A2_MONTHLY_NUMBER;
	}
	public void setA2_MONTHLY_NUMBER(BigDecimal a2_MONTHLY_NUMBER) {
		A2_MONTHLY_NUMBER = a2_MONTHLY_NUMBER;
	}
	public BigDecimal getA2_MONTHLY_VALUE() {
		return A2_MONTHLY_VALUE;
	}
	public void setA2_MONTHLY_VALUE(BigDecimal a2_MONTHLY_VALUE) {
		A2_MONTHLY_VALUE = a2_MONTHLY_VALUE;
	}
	public BigDecimal getA2_Q1_NUMBER() {
		return A2_Q1_NUMBER;
	}
	public void setA2_Q1_NUMBER(BigDecimal a2_Q1_NUMBER) {
		A2_Q1_NUMBER = a2_Q1_NUMBER;
	}
	public BigDecimal getA2_Q1_VALUE() {
		return A2_Q1_VALUE;
	}
	public void setA2_Q1_VALUE(BigDecimal a2_Q1_VALUE) {
		A2_Q1_VALUE = a2_Q1_VALUE;
	}
	public BigDecimal getA2_Q2_NUMBER() {
		return A2_Q2_NUMBER;
	}
	public void setA2_Q2_NUMBER(BigDecimal a2_Q2_NUMBER) {
		A2_Q2_NUMBER = a2_Q2_NUMBER;
	}
	public BigDecimal getA2_Q2_VALUE() {
		return A2_Q2_VALUE;
	}
	public void setA2_Q2_VALUE(BigDecimal a2_Q2_VALUE) {
		A2_Q2_VALUE = a2_Q2_VALUE;
	}
	public BigDecimal getA2_Q3_NUMBER() {
		return A2_Q3_NUMBER;
	}
	public void setA2_Q3_NUMBER(BigDecimal a2_Q3_NUMBER) {
		A2_Q3_NUMBER = a2_Q3_NUMBER;
	}
	public BigDecimal getA2_Q3_VALUE() {
		return A2_Q3_VALUE;
	}
	public void setA2_Q3_VALUE(BigDecimal a2_Q3_VALUE) {
		A2_Q3_VALUE = a2_Q3_VALUE;
	}
	public BigDecimal getA2_Q4_NUMBER() {
		return A2_Q4_NUMBER;
	}
	public void setA2_Q4_NUMBER(BigDecimal a2_Q4_NUMBER) {
		A2_Q4_NUMBER = a2_Q4_NUMBER;
	}
	public BigDecimal getA2_Q4_VALUE() {
		return A2_Q4_VALUE;
	}
	public void setA2_Q4_VALUE(BigDecimal a2_Q4_VALUE) {
		A2_Q4_VALUE = a2_Q4_VALUE;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_YEARLY_NUMBER() {
		return A3_YEARLY_NUMBER;
	}
	public void setA3_YEARLY_NUMBER(BigDecimal a3_YEARLY_NUMBER) {
		A3_YEARLY_NUMBER = a3_YEARLY_NUMBER;
	}
	public BigDecimal getA3_YEARLY_VALUE() {
		return A3_YEARLY_VALUE;
	}
	public void setA3_YEARLY_VALUE(BigDecimal a3_YEARLY_VALUE) {
		A3_YEARLY_VALUE = a3_YEARLY_VALUE;
	}
	public BigDecimal getA3_MONTHLY_NUMBER() {
		return A3_MONTHLY_NUMBER;
	}
	public void setA3_MONTHLY_NUMBER(BigDecimal a3_MONTHLY_NUMBER) {
		A3_MONTHLY_NUMBER = a3_MONTHLY_NUMBER;
	}
	public BigDecimal getA3_MONTHLY_VALUE() {
		return A3_MONTHLY_VALUE;
	}
	public void setA3_MONTHLY_VALUE(BigDecimal a3_MONTHLY_VALUE) {
		A3_MONTHLY_VALUE = a3_MONTHLY_VALUE;
	}
	public BigDecimal getA3_Q1_NUMBER() {
		return A3_Q1_NUMBER;
	}
	public void setA3_Q1_NUMBER(BigDecimal a3_Q1_NUMBER) {
		A3_Q1_NUMBER = a3_Q1_NUMBER;
	}
	public BigDecimal getA3_Q1_VALUE() {
		return A3_Q1_VALUE;
	}
	public void setA3_Q1_VALUE(BigDecimal a3_Q1_VALUE) {
		A3_Q1_VALUE = a3_Q1_VALUE;
	}
	public BigDecimal getA3_Q2_NUMBER() {
		return A3_Q2_NUMBER;
	}
	public void setA3_Q2_NUMBER(BigDecimal a3_Q2_NUMBER) {
		A3_Q2_NUMBER = a3_Q2_NUMBER;
	}
	public BigDecimal getA3_Q2_VALUE() {
		return A3_Q2_VALUE;
	}
	public void setA3_Q2_VALUE(BigDecimal a3_Q2_VALUE) {
		A3_Q2_VALUE = a3_Q2_VALUE;
	}
	public BigDecimal getA3_Q3_NUMBER() {
		return A3_Q3_NUMBER;
	}
	public void setA3_Q3_NUMBER(BigDecimal a3_Q3_NUMBER) {
		A3_Q3_NUMBER = a3_Q3_NUMBER;
	}
	public BigDecimal getA3_Q3_VALUE() {
		return A3_Q3_VALUE;
	}
	public void setA3_Q3_VALUE(BigDecimal a3_Q3_VALUE) {
		A3_Q3_VALUE = a3_Q3_VALUE;
	}
	public BigDecimal getA3_Q4_NUMBER() {
		return A3_Q4_NUMBER;
	}
	public void setA3_Q4_NUMBER(BigDecimal a3_Q4_NUMBER) {
		A3_Q4_NUMBER = a3_Q4_NUMBER;
	}
	public BigDecimal getA3_Q4_VALUE() {
		return A3_Q4_VALUE;
	}
	public void setA3_Q4_VALUE(BigDecimal a3_Q4_VALUE) {
		A3_Q4_VALUE = a3_Q4_VALUE;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_YEARLY_NUMBER() {
		return A4_YEARLY_NUMBER;
	}
	public void setA4_YEARLY_NUMBER(BigDecimal a4_YEARLY_NUMBER) {
		A4_YEARLY_NUMBER = a4_YEARLY_NUMBER;
	}
	public BigDecimal getA4_YEARLY_VALUE() {
		return A4_YEARLY_VALUE;
	}
	public void setA4_YEARLY_VALUE(BigDecimal a4_YEARLY_VALUE) {
		A4_YEARLY_VALUE = a4_YEARLY_VALUE;
	}
	public BigDecimal getA4_MONTHLY_NUMBER() {
		return A4_MONTHLY_NUMBER;
	}
	public void setA4_MONTHLY_NUMBER(BigDecimal a4_MONTHLY_NUMBER) {
		A4_MONTHLY_NUMBER = a4_MONTHLY_NUMBER;
	}
	public BigDecimal getA4_MONTHLY_VALUE() {
		return A4_MONTHLY_VALUE;
	}
	public void setA4_MONTHLY_VALUE(BigDecimal a4_MONTHLY_VALUE) {
		A4_MONTHLY_VALUE = a4_MONTHLY_VALUE;
	}
	public BigDecimal getA4_Q1_NUMBER() {
		return A4_Q1_NUMBER;
	}
	public void setA4_Q1_NUMBER(BigDecimal a4_Q1_NUMBER) {
		A4_Q1_NUMBER = a4_Q1_NUMBER;
	}
	public BigDecimal getA4_Q1_VALUE() {
		return A4_Q1_VALUE;
	}
	public void setA4_Q1_VALUE(BigDecimal a4_Q1_VALUE) {
		A4_Q1_VALUE = a4_Q1_VALUE;
	}
	public BigDecimal getA4_Q2_NUMBER() {
		return A4_Q2_NUMBER;
	}
	public void setA4_Q2_NUMBER(BigDecimal a4_Q2_NUMBER) {
		A4_Q2_NUMBER = a4_Q2_NUMBER;
	}
	public BigDecimal getA4_Q2_VALUE() {
		return A4_Q2_VALUE;
	}
	public void setA4_Q2_VALUE(BigDecimal a4_Q2_VALUE) {
		A4_Q2_VALUE = a4_Q2_VALUE;
	}
	public BigDecimal getA4_Q3_NUMBER() {
		return A4_Q3_NUMBER;
	}
	public void setA4_Q3_NUMBER(BigDecimal a4_Q3_NUMBER) {
		A4_Q3_NUMBER = a4_Q3_NUMBER;
	}
	public BigDecimal getA4_Q3_VALUE() {
		return A4_Q3_VALUE;
	}
	public void setA4_Q3_VALUE(BigDecimal a4_Q3_VALUE) {
		A4_Q3_VALUE = a4_Q3_VALUE;
	}
	public BigDecimal getA4_Q4_NUMBER() {
		return A4_Q4_NUMBER;
	}
	public void setA4_Q4_NUMBER(BigDecimal a4_Q4_NUMBER) {
		A4_Q4_NUMBER = a4_Q4_NUMBER;
	}
	public BigDecimal getA4_Q4_VALUE() {
		return A4_Q4_VALUE;
	}
	public void setA4_Q4_VALUE(BigDecimal a4_Q4_VALUE) {
		A4_Q4_VALUE = a4_Q4_VALUE;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_YEARLY_NUMBER() {
		return A5_YEARLY_NUMBER;
	}
	public void setA5_YEARLY_NUMBER(BigDecimal a5_YEARLY_NUMBER) {
		A5_YEARLY_NUMBER = a5_YEARLY_NUMBER;
	}
	public BigDecimal getA5_YEARLY_VALUE() {
		return A5_YEARLY_VALUE;
	}
	public void setA5_YEARLY_VALUE(BigDecimal a5_YEARLY_VALUE) {
		A5_YEARLY_VALUE = a5_YEARLY_VALUE;
	}
	public BigDecimal getA5_MONTHLY_NUMBER() {
		return A5_MONTHLY_NUMBER;
	}
	public void setA5_MONTHLY_NUMBER(BigDecimal a5_MONTHLY_NUMBER) {
		A5_MONTHLY_NUMBER = a5_MONTHLY_NUMBER;
	}
	public BigDecimal getA5_MONTHLY_VALUE() {
		return A5_MONTHLY_VALUE;
	}
	public void setA5_MONTHLY_VALUE(BigDecimal a5_MONTHLY_VALUE) {
		A5_MONTHLY_VALUE = a5_MONTHLY_VALUE;
	}
	public BigDecimal getA5_Q1_NUMBER() {
		return A5_Q1_NUMBER;
	}
	public void setA5_Q1_NUMBER(BigDecimal a5_Q1_NUMBER) {
		A5_Q1_NUMBER = a5_Q1_NUMBER;
	}
	public BigDecimal getA5_Q1_VALUE() {
		return A5_Q1_VALUE;
	}
	public void setA5_Q1_VALUE(BigDecimal a5_Q1_VALUE) {
		A5_Q1_VALUE = a5_Q1_VALUE;
	}
	public BigDecimal getA5_Q2_NUMBER() {
		return A5_Q2_NUMBER;
	}
	public void setA5_Q2_NUMBER(BigDecimal a5_Q2_NUMBER) {
		A5_Q2_NUMBER = a5_Q2_NUMBER;
	}
	public BigDecimal getA5_Q2_VALUE() {
		return A5_Q2_VALUE;
	}
	public void setA5_Q2_VALUE(BigDecimal a5_Q2_VALUE) {
		A5_Q2_VALUE = a5_Q2_VALUE;
	}
	public BigDecimal getA5_Q3_NUMBER() {
		return A5_Q3_NUMBER;
	}
	public void setA5_Q3_NUMBER(BigDecimal a5_Q3_NUMBER) {
		A5_Q3_NUMBER = a5_Q3_NUMBER;
	}
	public BigDecimal getA5_Q3_VALUE() {
		return A5_Q3_VALUE;
	}
	public void setA5_Q3_VALUE(BigDecimal a5_Q3_VALUE) {
		A5_Q3_VALUE = a5_Q3_VALUE;
	}
	public BigDecimal getA5_Q4_NUMBER() {
		return A5_Q4_NUMBER;
	}
	public void setA5_Q4_NUMBER(BigDecimal a5_Q4_NUMBER) {
		A5_Q4_NUMBER = a5_Q4_NUMBER;
	}
	public BigDecimal getA5_Q4_VALUE() {
		return A5_Q4_VALUE;
	}
	public void setA5_Q4_VALUE(BigDecimal a5_Q4_VALUE) {
		A5_Q4_VALUE = a5_Q4_VALUE;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_YEARLY_NUMBER() {
		return A6_YEARLY_NUMBER;
	}
	public void setA6_YEARLY_NUMBER(BigDecimal a6_YEARLY_NUMBER) {
		A6_YEARLY_NUMBER = a6_YEARLY_NUMBER;
	}
	public BigDecimal getA6_YEARLY_VALUE() {
		return A6_YEARLY_VALUE;
	}
	public void setA6_YEARLY_VALUE(BigDecimal a6_YEARLY_VALUE) {
		A6_YEARLY_VALUE = a6_YEARLY_VALUE;
	}
	public BigDecimal getA6_MONTHLY_NUMBER() {
		return A6_MONTHLY_NUMBER;
	}
	public void setA6_MONTHLY_NUMBER(BigDecimal a6_MONTHLY_NUMBER) {
		A6_MONTHLY_NUMBER = a6_MONTHLY_NUMBER;
	}
	public BigDecimal getA6_MONTHLY_VALUE() {
		return A6_MONTHLY_VALUE;
	}
	public void setA6_MONTHLY_VALUE(BigDecimal a6_MONTHLY_VALUE) {
		A6_MONTHLY_VALUE = a6_MONTHLY_VALUE;
	}
	public BigDecimal getA6_Q1_NUMBER() {
		return A6_Q1_NUMBER;
	}
	public void setA6_Q1_NUMBER(BigDecimal a6_Q1_NUMBER) {
		A6_Q1_NUMBER = a6_Q1_NUMBER;
	}
	public BigDecimal getA6_Q1_VALUE() {
		return A6_Q1_VALUE;
	}
	public void setA6_Q1_VALUE(BigDecimal a6_Q1_VALUE) {
		A6_Q1_VALUE = a6_Q1_VALUE;
	}
	public BigDecimal getA6_Q2_NUMBER() {
		return A6_Q2_NUMBER;
	}
	public void setA6_Q2_NUMBER(BigDecimal a6_Q2_NUMBER) {
		A6_Q2_NUMBER = a6_Q2_NUMBER;
	}
	public BigDecimal getA6_Q2_VALUE() {
		return A6_Q2_VALUE;
	}
	public void setA6_Q2_VALUE(BigDecimal a6_Q2_VALUE) {
		A6_Q2_VALUE = a6_Q2_VALUE;
	}
	public BigDecimal getA6_Q3_NUMBER() {
		return A6_Q3_NUMBER;
	}
	public void setA6_Q3_NUMBER(BigDecimal a6_Q3_NUMBER) {
		A6_Q3_NUMBER = a6_Q3_NUMBER;
	}
	public BigDecimal getA6_Q3_VALUE() {
		return A6_Q3_VALUE;
	}
	public void setA6_Q3_VALUE(BigDecimal a6_Q3_VALUE) {
		A6_Q3_VALUE = a6_Q3_VALUE;
	}
	public BigDecimal getA6_Q4_NUMBER() {
		return A6_Q4_NUMBER;
	}
	public void setA6_Q4_NUMBER(BigDecimal a6_Q4_NUMBER) {
		A6_Q4_NUMBER = a6_Q4_NUMBER;
	}
	public BigDecimal getA6_Q4_VALUE() {
		return A6_Q4_VALUE;
	}
	public void setA6_Q4_VALUE(BigDecimal a6_Q4_VALUE) {
		A6_Q4_VALUE = a6_Q4_VALUE;
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
	
	
	public T13ORReport(String a1_PRODUCT, BigDecimal a1_YEARLY_NUMBER, BigDecimal a1_YEARLY_VALUE,
			BigDecimal a1_MONTHLY_NUMBER, BigDecimal a1_MONTHLY_VALUE, BigDecimal a1_Q1_NUMBER, BigDecimal a1_Q1_VALUE,
			BigDecimal a1_Q2_NUMBER, BigDecimal a1_Q2_VALUE, BigDecimal a1_Q3_NUMBER, BigDecimal a1_Q3_VALUE,
			BigDecimal a1_Q4_NUMBER, BigDecimal a1_Q4_VALUE, String a2_PRODUCT, BigDecimal a2_YEARLY_NUMBER,
			BigDecimal a2_YEARLY_VALUE, BigDecimal a2_MONTHLY_NUMBER, BigDecimal a2_MONTHLY_VALUE,
			BigDecimal a2_Q1_NUMBER, BigDecimal a2_Q1_VALUE, BigDecimal a2_Q2_NUMBER, BigDecimal a2_Q2_VALUE,
			BigDecimal a2_Q3_NUMBER, BigDecimal a2_Q3_VALUE, BigDecimal a2_Q4_NUMBER, BigDecimal a2_Q4_VALUE,
			String a3_PRODUCT, BigDecimal a3_YEARLY_NUMBER, BigDecimal a3_YEARLY_VALUE, BigDecimal a3_MONTHLY_NUMBER,
			BigDecimal a3_MONTHLY_VALUE, BigDecimal a3_Q1_NUMBER, BigDecimal a3_Q1_VALUE, BigDecimal a3_Q2_NUMBER,
			BigDecimal a3_Q2_VALUE, BigDecimal a3_Q3_NUMBER, BigDecimal a3_Q3_VALUE, BigDecimal a3_Q4_NUMBER,
			BigDecimal a3_Q4_VALUE, String a4_PRODUCT, BigDecimal a4_YEARLY_NUMBER, BigDecimal a4_YEARLY_VALUE,
			BigDecimal a4_MONTHLY_NUMBER, BigDecimal a4_MONTHLY_VALUE, BigDecimal a4_Q1_NUMBER, BigDecimal a4_Q1_VALUE,
			BigDecimal a4_Q2_NUMBER, BigDecimal a4_Q2_VALUE, BigDecimal a4_Q3_NUMBER, BigDecimal a4_Q3_VALUE,
			BigDecimal a4_Q4_NUMBER, BigDecimal a4_Q4_VALUE, String a5_PRODUCT, BigDecimal a5_YEARLY_NUMBER,
			BigDecimal a5_YEARLY_VALUE, BigDecimal a5_MONTHLY_NUMBER, BigDecimal a5_MONTHLY_VALUE,
			BigDecimal a5_Q1_NUMBER, BigDecimal a5_Q1_VALUE, BigDecimal a5_Q2_NUMBER, BigDecimal a5_Q2_VALUE,
			BigDecimal a5_Q3_NUMBER, BigDecimal a5_Q3_VALUE, BigDecimal a5_Q4_NUMBER, BigDecimal a5_Q4_VALUE,
			String a6_PRODUCT, BigDecimal a6_YEARLY_NUMBER, BigDecimal a6_YEARLY_VALUE, BigDecimal a6_MONTHLY_NUMBER,
			BigDecimal a6_MONTHLY_VALUE, BigDecimal a6_Q1_NUMBER, BigDecimal a6_Q1_VALUE, BigDecimal a6_Q2_NUMBER,
			BigDecimal a6_Q2_VALUE, BigDecimal a6_Q3_NUMBER, BigDecimal a6_Q3_VALUE, BigDecimal a6_Q4_NUMBER,
			BigDecimal a6_Q4_VALUE, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG, String eNTRY_USER,
			String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG,
			String hEADER_1, String hEADER_2, String hEADER_3) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_YEARLY_NUMBER = a1_YEARLY_NUMBER;
		A1_YEARLY_VALUE = a1_YEARLY_VALUE;
		A1_MONTHLY_NUMBER = a1_MONTHLY_NUMBER;
		A1_MONTHLY_VALUE = a1_MONTHLY_VALUE;
		A1_Q1_NUMBER = a1_Q1_NUMBER;
		A1_Q1_VALUE = a1_Q1_VALUE;
		A1_Q2_NUMBER = a1_Q2_NUMBER;
		A1_Q2_VALUE = a1_Q2_VALUE;
		A1_Q3_NUMBER = a1_Q3_NUMBER;
		A1_Q3_VALUE = a1_Q3_VALUE;
		A1_Q4_NUMBER = a1_Q4_NUMBER;
		A1_Q4_VALUE = a1_Q4_VALUE;
		A2_PRODUCT = a2_PRODUCT;
		A2_YEARLY_NUMBER = a2_YEARLY_NUMBER;
		A2_YEARLY_VALUE = a2_YEARLY_VALUE;
		A2_MONTHLY_NUMBER = a2_MONTHLY_NUMBER;
		A2_MONTHLY_VALUE = a2_MONTHLY_VALUE;
		A2_Q1_NUMBER = a2_Q1_NUMBER;
		A2_Q1_VALUE = a2_Q1_VALUE;
		A2_Q2_NUMBER = a2_Q2_NUMBER;
		A2_Q2_VALUE = a2_Q2_VALUE;
		A2_Q3_NUMBER = a2_Q3_NUMBER;
		A2_Q3_VALUE = a2_Q3_VALUE;
		A2_Q4_NUMBER = a2_Q4_NUMBER;
		A2_Q4_VALUE = a2_Q4_VALUE;
		A3_PRODUCT = a3_PRODUCT;
		A3_YEARLY_NUMBER = a3_YEARLY_NUMBER;
		A3_YEARLY_VALUE = a3_YEARLY_VALUE;
		A3_MONTHLY_NUMBER = a3_MONTHLY_NUMBER;
		A3_MONTHLY_VALUE = a3_MONTHLY_VALUE;
		A3_Q1_NUMBER = a3_Q1_NUMBER;
		A3_Q1_VALUE = a3_Q1_VALUE;
		A3_Q2_NUMBER = a3_Q2_NUMBER;
		A3_Q2_VALUE = a3_Q2_VALUE;
		A3_Q3_NUMBER = a3_Q3_NUMBER;
		A3_Q3_VALUE = a3_Q3_VALUE;
		A3_Q4_NUMBER = a3_Q4_NUMBER;
		A3_Q4_VALUE = a3_Q4_VALUE;
		A4_PRODUCT = a4_PRODUCT;
		A4_YEARLY_NUMBER = a4_YEARLY_NUMBER;
		A4_YEARLY_VALUE = a4_YEARLY_VALUE;
		A4_MONTHLY_NUMBER = a4_MONTHLY_NUMBER;
		A4_MONTHLY_VALUE = a4_MONTHLY_VALUE;
		A4_Q1_NUMBER = a4_Q1_NUMBER;
		A4_Q1_VALUE = a4_Q1_VALUE;
		A4_Q2_NUMBER = a4_Q2_NUMBER;
		A4_Q2_VALUE = a4_Q2_VALUE;
		A4_Q3_NUMBER = a4_Q3_NUMBER;
		A4_Q3_VALUE = a4_Q3_VALUE;
		A4_Q4_NUMBER = a4_Q4_NUMBER;
		A4_Q4_VALUE = a4_Q4_VALUE;
		A5_PRODUCT = a5_PRODUCT;
		A5_YEARLY_NUMBER = a5_YEARLY_NUMBER;
		A5_YEARLY_VALUE = a5_YEARLY_VALUE;
		A5_MONTHLY_NUMBER = a5_MONTHLY_NUMBER;
		A5_MONTHLY_VALUE = a5_MONTHLY_VALUE;
		A5_Q1_NUMBER = a5_Q1_NUMBER;
		A5_Q1_VALUE = a5_Q1_VALUE;
		A5_Q2_NUMBER = a5_Q2_NUMBER;
		A5_Q2_VALUE = a5_Q2_VALUE;
		A5_Q3_NUMBER = a5_Q3_NUMBER;
		A5_Q3_VALUE = a5_Q3_VALUE;
		A5_Q4_NUMBER = a5_Q4_NUMBER;
		A5_Q4_VALUE = a5_Q4_VALUE;
		A6_PRODUCT = a6_PRODUCT;
		A6_YEARLY_NUMBER = a6_YEARLY_NUMBER;
		A6_YEARLY_VALUE = a6_YEARLY_VALUE;
		A6_MONTHLY_NUMBER = a6_MONTHLY_NUMBER;
		A6_MONTHLY_VALUE = a6_MONTHLY_VALUE;
		A6_Q1_NUMBER = a6_Q1_NUMBER;
		A6_Q1_VALUE = a6_Q1_VALUE;
		A6_Q2_NUMBER = a6_Q2_NUMBER;
		A6_Q2_VALUE = a6_Q2_VALUE;
		A6_Q3_NUMBER = a6_Q3_NUMBER;
		A6_Q3_VALUE = a6_Q3_VALUE;
		A6_Q4_NUMBER = a6_Q4_NUMBER;
		A6_Q4_VALUE = a6_Q4_VALUE;
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
	public T13ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
