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
@Table(name="T2_OR_TRAINING_DETAILS_TABLE")
public class T2ORReport {
	private String	A1_PRODUCT;
	private String	A2_PRODUCT;
	private BigDecimal	A2_YEARLY_NUMBER;
	private BigDecimal	A2_YEARLY_AMOUNT;
	private BigDecimal	A2_MONTHLY_NUMBER;
	private BigDecimal	A2_MONTHLY_AMOUNT;
	private BigDecimal	A2_QUARTER_1_NUMBER;
	private BigDecimal	A2_QUARTER_1_AMOUNT;
	private BigDecimal	A2_QUARTER_2_NUMBER;
	private BigDecimal	A2_QUARTER_2_AMOUNT;
	private BigDecimal	A2_QUARTER_3_NUMBER;
	private BigDecimal	A2_QUARTER_3_AMOUNT;
	private BigDecimal	A2_QUARTER_4_NUMBER;
	private BigDecimal	A2_QUARTER_4_AMOUNT;
	private String	A3_PRODUCT;
	private BigDecimal	A3_YEARLY_NUMBER;
	private BigDecimal	A3_YEARLY_AMOUNT;
	private BigDecimal	A3_MONTHLY_NUMBER;
	private BigDecimal	A3_MONTHLY_AMOUNT;
	private BigDecimal	A3_QUARTER_1_NUMBER;
	private BigDecimal	A3_QUARTER_1_AMOUNT;
	private BigDecimal	A3_QUARTER_2_NUMBER;
	private BigDecimal	A3_QUARTER_2_AMOUNT;
	private BigDecimal	A3_QUARTER_3_NUMBER;
	private BigDecimal	A3_QUARTER_3_AMOUNT;
	private BigDecimal	A3_QUARTER_4_NUMBER;
	private BigDecimal	A3_QUARTER_4_AMOUNT;
	private String	A4_PRODUCT;
	private BigDecimal	A4_YEARLY_NUMBER;
	private BigDecimal	A4_YEARLY_AMOUNT;
	private BigDecimal	A4_MONTHLY_NUMBER;
	private BigDecimal	A4_MONTHLY_AMOUNT;
	private BigDecimal	A4_QUARTER_1_NUMBER;
	private BigDecimal	A4_QUARTER_1_AMOUNT;
	private BigDecimal	A4_QUARTER_2_NUMBER;
	private BigDecimal	A4_QUARTER_2_AMOUNT;
	private BigDecimal	A4_QUARTER_3_NUMBER;
	private BigDecimal	A4_QUARTER_3_AMOUNT;
	private BigDecimal	A4_QUARTER_4_NUMBER;
	private BigDecimal	A4_QUARTER_4_AMOUNT;
	private String	A5_PRODUCT;
	private BigDecimal	A5_YEARLY_NUMBER;
	private BigDecimal	A5_YEARLY_AMOUNT;
	private BigDecimal	A5_MONTHLY_NUMBER;
	private BigDecimal	A5_MONTHLY_AMOUNT;
	private BigDecimal	A5_QUARTER_1_NUMBER;
	private BigDecimal	A5_QUARTER_1_AMOUNT;
	private BigDecimal	A5_QUARTER_2_NUMBER;
	private BigDecimal	A5_QUARTER_2_AMOUNT;
	private BigDecimal	A5_QUARTER_3_NUMBER;
	private BigDecimal	A5_QUARTER_3_AMOUNT;
	private BigDecimal	A5_QUARTER_4_NUMBER;
	private BigDecimal	A5_QUARTER_4_AMOUNT;
	private BigDecimal	A5_QUARTER_5_NUMBER;
	private BigDecimal	A5_QUARTER_5_AMOUNT;
	private String	A6_PRODUCT;
	private BigDecimal	A6_YEARLY_NUMBER;
	private BigDecimal	A6_YEARLY_AMOUNT;
	private BigDecimal	A6_MONTHLY_NUMBER;
	private BigDecimal	A6_MONTHLY_AMOUNT;
	private BigDecimal	A6_QUARTER_1_NUMBER;
	private BigDecimal	A6_QUARTER_1_AMOUNT;
	private BigDecimal	A6_QUARTER_2_NUMBER;
	private BigDecimal	A6_QUARTER_2_AMOUNT;
	private BigDecimal	A6_QUARTER_3_NUMBER;
	private BigDecimal	A6_QUARTER_3_AMOUNT;
	private BigDecimal	A6_QUARTER_4_NUMBER;
	private BigDecimal	A6_QUARTER_4_AMOUNT;
	private String	A7_PRODUCT;
	private String	A8_PRODUCT;
	private BigDecimal	A8_YEARLY_NUMBER;
	private BigDecimal	A8_YEARLY_AMOUNT;
	private BigDecimal	A8_MONTHLY_NUMBER;
	private BigDecimal	A8_MONTHLY_AMOUNT;
	private BigDecimal	A8_QUARTER_1_NUMBER;
	private BigDecimal	A8_QUARTER_1_AMOUNT;
	private BigDecimal	A8_QUARTER_2_NUMBER;
	private BigDecimal	A8_QUARTER_2_AMOUNT;
	private BigDecimal	A8_QUARTER_3_NUMBER;
	private BigDecimal	A8_QUARTER_3_AMOUNT;
	private BigDecimal	A8_QUARTER_4_NUMBER;
	private BigDecimal	A8_QUARTER_4_AMOUNT;
	private String	A9_PRODUCT;
	private BigDecimal	A9_YEARLY_NUMBER;
	private BigDecimal	A9_YEARLY_AMOUNT;
	private BigDecimal	A9_MONTHLY_NUMBER;
	private BigDecimal	A9_MONTHLY_AMOUNT;
	private BigDecimal	A9_QUARTER_1_NUMBER;
	private BigDecimal	A9_QUARTER_1_AMOUNT;
	private BigDecimal	A9_QUARTER_2_NUMBER;
	private BigDecimal	A9_QUARTER_2_AMOUNT;
	private BigDecimal	A9_QUARTER_3_NUMBER;
	private BigDecimal	A9_QUARTER_3_AMOUNT;
	private BigDecimal	A9_QUARTER_4_NUMBER;
	private BigDecimal	A9_QUARTER_4_AMOUNT;
	private String	A10_PRODUCT;
	private String	A11_PRODUCT;
	private BigDecimal	A11_YEARLY_NUMBER;
	private BigDecimal	A11_YEARLY_AMOUNT;
	private BigDecimal	A11_MONTHLY_NUMBER;
	private BigDecimal	A11_MONTHLY_AMOUNT;
	private BigDecimal	A11_QUARTER_1_NUMBER;
	private BigDecimal	A11_QUARTER_1_AMOUNT;
	private BigDecimal	A11_QUARTER_2_NUMBER;
	private BigDecimal	A11_QUARTER_2_AMOUNT;
	private BigDecimal	A11_QUARTER_3_NUMBER;
	private BigDecimal	A11_QUARTER_3_AMOUNT;
	private BigDecimal	A11_QUARTER_4_NUMBER;
	private BigDecimal	A11_QUARTER_4_AMOUNT;
	private String	A12_PRODUCT;
	private BigDecimal	A12_YEARLY_NUMBER;
	private BigDecimal	A12_YEARLY_AMOUNT;
	private BigDecimal	A12_MONTHLY_NUMBER;
	private BigDecimal	A12_MONTHLY_AMOUNT;
	private BigDecimal	A12_QUARTER_1_NUMBER;
	private BigDecimal	A12_QUARTER_1_AMOUNT;
	private BigDecimal	A12_QUARTER_2_NUMBER;
	private BigDecimal	A12_QUARTER_2_AMOUNT;
	private BigDecimal	A12_QUARTER_3_NUMBER;
	private BigDecimal	A12_QUARTER_3_AMOUNT;
	private BigDecimal	A12_QUARTER_4_NUMBER;
	private BigDecimal	A12_QUARTER_4_AMOUNT;
	private String	A13_PRODUCT;
	private BigDecimal	A13_YEARLY_NUMBER;
	private BigDecimal	A13_YEARLY_AMOUNT;
	private BigDecimal	A13_MONTHLY_NUMBER;
	private BigDecimal	A13_MONTHLY_AMOUNT;
	private BigDecimal	A13_QUARTER_1_NUMBER;
	private BigDecimal	A13_QUARTER_1_AMOUNT;
	private BigDecimal	A13_QUARTER_2_NUMBER;
	private BigDecimal	A13_QUARTER_2_AMOUNT;
	private BigDecimal	A13_QUARTER_3_NUMBER;
	private BigDecimal	A13_QUARTER_3_AMOUNT;
	private BigDecimal	A13_QUARTER_4_NUMBER;
	private BigDecimal	A13_QUARTER_4_AMOUNT;
	private String	A14_PRODUCT;
	private BigDecimal	A14_YEARLY_NUMBER;
	private BigDecimal	A14_YEARLY_AMOUNT;
	private BigDecimal	A14_MONTHLY_NUMBER;
	private BigDecimal	A14_MONTHLY_AMOUNT;
	private BigDecimal	A14_QUARTER_1_NUMBER;
	private BigDecimal	A14_QUARTER_1_AMOUNT;
	private BigDecimal	A14_QUARTER_2_NUMBER;
	private BigDecimal	A14_QUARTER_2_AMOUNT;
	private BigDecimal	A14_QUARTER_3_NUMBER;
	private BigDecimal	A14_QUARTER_3_AMOUNT;
	private BigDecimal	A14_QUARTER_4_NUMBER;
	private BigDecimal	A14_QUARTER_4_AMOUNT;
	private String	A15_PRODUCT;
	private BigDecimal	A15_YEARLY_NUMBER;
	private BigDecimal	A15_YEARLY_AMOUNT;
	private BigDecimal	A15_MONTHLY_NUMBER;
	private BigDecimal	A15_MONTHLY_AMOUNT;
	private BigDecimal	A15_QUARTER_1_NUMBER;
	private BigDecimal	A15_QUARTER_1_AMOUNT;
	private BigDecimal	A15_QUARTER_2_NUMBER;
	private BigDecimal	A15_QUARTER_2_AMOUNT;
	private BigDecimal	A15_QUARTER_3_NUMBER;
	private BigDecimal	A15_QUARTER_3_AMOUNT;
	private BigDecimal	A15_QUARTER_4_NUMBER;
	private BigDecimal	A15_QUARTER_4_AMOUNT;
	private String	A16_PRODUCT;
	private BigDecimal	A16_YEARLY_NUMBER;
	private BigDecimal	A16_YEARLY_AMOUNT;
	private BigDecimal	A16_MONTHLY_NUMBER;
	private BigDecimal	A16_MONTHLY_AMOUNT;
	private BigDecimal	A16_QUARTER_1_NUMBER;
	private BigDecimal	A16_QUARTER_1_AMOUNT;
	private BigDecimal	A16_QUARTER_2_NUMBER;
	private BigDecimal	A16_QUARTER_2_AMOUNT;
	private BigDecimal	A16_QUARTER_3_NUMBER;
	private BigDecimal	A16_QUARTER_3_AMOUNT;
	private BigDecimal	A16_QUARTER_4_NUMBER;
	private BigDecimal	A16_QUARTER_4_AMOUNT;
	private String	A17_PRODUCT;
	private BigDecimal	A17_YEARLY_NUMBER;
	private BigDecimal	A17_YEARLY_AMOUNT;
	private BigDecimal	A17_MONTHLY_NUMBER;
	private BigDecimal	A17_MONTHLY_AMOUNT;
	private BigDecimal	A17_QUARTER_1_NUMBER;
	private BigDecimal	A17_QUARTER_1_AMOUNT;
	private BigDecimal	A17_QUARTER_2_NUMBER;
	private BigDecimal	A17_QUARTER_2_AMOUNT;
	private BigDecimal	A17_QUARTER_3_NUMBER;
	private BigDecimal	A17_QUARTER_3_AMOUNT;
	private BigDecimal	A17_QUARTER_4_NUMBER;
	private BigDecimal	A17_QUARTER_4_AMOUNT;

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
	public BigDecimal getA2_YEARLY_AMOUNT() {
		return A2_YEARLY_AMOUNT;
	}
	public void setA2_YEARLY_AMOUNT(BigDecimal a2_YEARLY_AMOUNT) {
		A2_YEARLY_AMOUNT = a2_YEARLY_AMOUNT;
	}
	public BigDecimal getA2_MONTHLY_NUMBER() {
		return A2_MONTHLY_NUMBER;
	}
	public void setA2_MONTHLY_NUMBER(BigDecimal a2_MONTHLY_NUMBER) {
		A2_MONTHLY_NUMBER = a2_MONTHLY_NUMBER;
	}
	public BigDecimal getA2_MONTHLY_AMOUNT() {
		return A2_MONTHLY_AMOUNT;
	}
	public void setA2_MONTHLY_AMOUNT(BigDecimal a2_MONTHLY_AMOUNT) {
		A2_MONTHLY_AMOUNT = a2_MONTHLY_AMOUNT;
	}
	public BigDecimal getA2_QUARTER_1_NUMBER() {
		return A2_QUARTER_1_NUMBER;
	}
	public void setA2_QUARTER_1_NUMBER(BigDecimal a2_QUARTER_1_NUMBER) {
		A2_QUARTER_1_NUMBER = a2_QUARTER_1_NUMBER;
	}
	public BigDecimal getA2_QUARTER_1_AMOUNT() {
		return A2_QUARTER_1_AMOUNT;
	}
	public void setA2_QUARTER_1_AMOUNT(BigDecimal a2_QUARTER_1_AMOUNT) {
		A2_QUARTER_1_AMOUNT = a2_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA2_QUARTER_2_NUMBER() {
		return A2_QUARTER_2_NUMBER;
	}
	public void setA2_QUARTER_2_NUMBER(BigDecimal a2_QUARTER_2_NUMBER) {
		A2_QUARTER_2_NUMBER = a2_QUARTER_2_NUMBER;
	}
	public BigDecimal getA2_QUARTER_2_AMOUNT() {
		return A2_QUARTER_2_AMOUNT;
	}
	public void setA2_QUARTER_2_AMOUNT(BigDecimal a2_QUARTER_2_AMOUNT) {
		A2_QUARTER_2_AMOUNT = a2_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA2_QUARTER_3_NUMBER() {
		return A2_QUARTER_3_NUMBER;
	}
	public void setA2_QUARTER_3_NUMBER(BigDecimal a2_QUARTER_3_NUMBER) {
		A2_QUARTER_3_NUMBER = a2_QUARTER_3_NUMBER;
	}
	public BigDecimal getA2_QUARTER_3_AMOUNT() {
		return A2_QUARTER_3_AMOUNT;
	}
	public void setA2_QUARTER_3_AMOUNT(BigDecimal a2_QUARTER_3_AMOUNT) {
		A2_QUARTER_3_AMOUNT = a2_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA2_QUARTER_4_NUMBER() {
		return A2_QUARTER_4_NUMBER;
	}
	public void setA2_QUARTER_4_NUMBER(BigDecimal a2_QUARTER_4_NUMBER) {
		A2_QUARTER_4_NUMBER = a2_QUARTER_4_NUMBER;
	}
	public BigDecimal getA2_QUARTER_4_AMOUNT() {
		return A2_QUARTER_4_AMOUNT;
	}
	public void setA2_QUARTER_4_AMOUNT(BigDecimal a2_QUARTER_4_AMOUNT) {
		A2_QUARTER_4_AMOUNT = a2_QUARTER_4_AMOUNT;
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
	public BigDecimal getA3_YEARLY_AMOUNT() {
		return A3_YEARLY_AMOUNT;
	}
	public void setA3_YEARLY_AMOUNT(BigDecimal a3_YEARLY_AMOUNT) {
		A3_YEARLY_AMOUNT = a3_YEARLY_AMOUNT;
	}
	public BigDecimal getA3_MONTHLY_NUMBER() {
		return A3_MONTHLY_NUMBER;
	}
	public void setA3_MONTHLY_NUMBER(BigDecimal a3_MONTHLY_NUMBER) {
		A3_MONTHLY_NUMBER = a3_MONTHLY_NUMBER;
	}
	public BigDecimal getA3_MONTHLY_AMOUNT() {
		return A3_MONTHLY_AMOUNT;
	}
	public void setA3_MONTHLY_AMOUNT(BigDecimal a3_MONTHLY_AMOUNT) {
		A3_MONTHLY_AMOUNT = a3_MONTHLY_AMOUNT;
	}
	public BigDecimal getA3_QUARTER_1_NUMBER() {
		return A3_QUARTER_1_NUMBER;
	}
	public void setA3_QUARTER_1_NUMBER(BigDecimal a3_QUARTER_1_NUMBER) {
		A3_QUARTER_1_NUMBER = a3_QUARTER_1_NUMBER;
	}
	public BigDecimal getA3_QUARTER_1_AMOUNT() {
		return A3_QUARTER_1_AMOUNT;
	}
	public void setA3_QUARTER_1_AMOUNT(BigDecimal a3_QUARTER_1_AMOUNT) {
		A3_QUARTER_1_AMOUNT = a3_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA3_QUARTER_2_NUMBER() {
		return A3_QUARTER_2_NUMBER;
	}
	public void setA3_QUARTER_2_NUMBER(BigDecimal a3_QUARTER_2_NUMBER) {
		A3_QUARTER_2_NUMBER = a3_QUARTER_2_NUMBER;
	}
	public BigDecimal getA3_QUARTER_2_AMOUNT() {
		return A3_QUARTER_2_AMOUNT;
	}
	public void setA3_QUARTER_2_AMOUNT(BigDecimal a3_QUARTER_2_AMOUNT) {
		A3_QUARTER_2_AMOUNT = a3_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA3_QUARTER_3_NUMBER() {
		return A3_QUARTER_3_NUMBER;
	}
	public void setA3_QUARTER_3_NUMBER(BigDecimal a3_QUARTER_3_NUMBER) {
		A3_QUARTER_3_NUMBER = a3_QUARTER_3_NUMBER;
	}
	public BigDecimal getA3_QUARTER_3_AMOUNT() {
		return A3_QUARTER_3_AMOUNT;
	}
	public void setA3_QUARTER_3_AMOUNT(BigDecimal a3_QUARTER_3_AMOUNT) {
		A3_QUARTER_3_AMOUNT = a3_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA3_QUARTER_4_NUMBER() {
		return A3_QUARTER_4_NUMBER;
	}
	public void setA3_QUARTER_4_NUMBER(BigDecimal a3_QUARTER_4_NUMBER) {
		A3_QUARTER_4_NUMBER = a3_QUARTER_4_NUMBER;
	}
	public BigDecimal getA3_QUARTER_4_AMOUNT() {
		return A3_QUARTER_4_AMOUNT;
	}
	public void setA3_QUARTER_4_AMOUNT(BigDecimal a3_QUARTER_4_AMOUNT) {
		A3_QUARTER_4_AMOUNT = a3_QUARTER_4_AMOUNT;
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
	public BigDecimal getA4_YEARLY_AMOUNT() {
		return A4_YEARLY_AMOUNT;
	}
	public void setA4_YEARLY_AMOUNT(BigDecimal a4_YEARLY_AMOUNT) {
		A4_YEARLY_AMOUNT = a4_YEARLY_AMOUNT;
	}
	public BigDecimal getA4_MONTHLY_NUMBER() {
		return A4_MONTHLY_NUMBER;
	}
	public void setA4_MONTHLY_NUMBER(BigDecimal a4_MONTHLY_NUMBER) {
		A4_MONTHLY_NUMBER = a4_MONTHLY_NUMBER;
	}
	public BigDecimal getA4_MONTHLY_AMOUNT() {
		return A4_MONTHLY_AMOUNT;
	}
	public void setA4_MONTHLY_AMOUNT(BigDecimal a4_MONTHLY_AMOUNT) {
		A4_MONTHLY_AMOUNT = a4_MONTHLY_AMOUNT;
	}
	public BigDecimal getA4_QUARTER_1_NUMBER() {
		return A4_QUARTER_1_NUMBER;
	}
	public void setA4_QUARTER_1_NUMBER(BigDecimal a4_QUARTER_1_NUMBER) {
		A4_QUARTER_1_NUMBER = a4_QUARTER_1_NUMBER;
	}
	public BigDecimal getA4_QUARTER_1_AMOUNT() {
		return A4_QUARTER_1_AMOUNT;
	}
	public void setA4_QUARTER_1_AMOUNT(BigDecimal a4_QUARTER_1_AMOUNT) {
		A4_QUARTER_1_AMOUNT = a4_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA4_QUARTER_2_NUMBER() {
		return A4_QUARTER_2_NUMBER;
	}
	public void setA4_QUARTER_2_NUMBER(BigDecimal a4_QUARTER_2_NUMBER) {
		A4_QUARTER_2_NUMBER = a4_QUARTER_2_NUMBER;
	}
	public BigDecimal getA4_QUARTER_2_AMOUNT() {
		return A4_QUARTER_2_AMOUNT;
	}
	public void setA4_QUARTER_2_AMOUNT(BigDecimal a4_QUARTER_2_AMOUNT) {
		A4_QUARTER_2_AMOUNT = a4_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA4_QUARTER_3_NUMBER() {
		return A4_QUARTER_3_NUMBER;
	}
	public void setA4_QUARTER_3_NUMBER(BigDecimal a4_QUARTER_3_NUMBER) {
		A4_QUARTER_3_NUMBER = a4_QUARTER_3_NUMBER;
	}
	public BigDecimal getA4_QUARTER_3_AMOUNT() {
		return A4_QUARTER_3_AMOUNT;
	}
	public void setA4_QUARTER_3_AMOUNT(BigDecimal a4_QUARTER_3_AMOUNT) {
		A4_QUARTER_3_AMOUNT = a4_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA4_QUARTER_4_NUMBER() {
		return A4_QUARTER_4_NUMBER;
	}
	public void setA4_QUARTER_4_NUMBER(BigDecimal a4_QUARTER_4_NUMBER) {
		A4_QUARTER_4_NUMBER = a4_QUARTER_4_NUMBER;
	}
	public BigDecimal getA4_QUARTER_4_AMOUNT() {
		return A4_QUARTER_4_AMOUNT;
	}
	public void setA4_QUARTER_4_AMOUNT(BigDecimal a4_QUARTER_4_AMOUNT) {
		A4_QUARTER_4_AMOUNT = a4_QUARTER_4_AMOUNT;
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
	public BigDecimal getA5_YEARLY_AMOUNT() {
		return A5_YEARLY_AMOUNT;
	}
	public void setA5_YEARLY_AMOUNT(BigDecimal a5_YEARLY_AMOUNT) {
		A5_YEARLY_AMOUNT = a5_YEARLY_AMOUNT;
	}
	public BigDecimal getA5_MONTHLY_NUMBER() {
		return A5_MONTHLY_NUMBER;
	}
	public void setA5_MONTHLY_NUMBER(BigDecimal a5_MONTHLY_NUMBER) {
		A5_MONTHLY_NUMBER = a5_MONTHLY_NUMBER;
	}
	public BigDecimal getA5_MONTHLY_AMOUNT() {
		return A5_MONTHLY_AMOUNT;
	}
	public void setA5_MONTHLY_AMOUNT(BigDecimal a5_MONTHLY_AMOUNT) {
		A5_MONTHLY_AMOUNT = a5_MONTHLY_AMOUNT;
	}
	public BigDecimal getA5_QUARTER_1_NUMBER() {
		return A5_QUARTER_1_NUMBER;
	}
	public void setA5_QUARTER_1_NUMBER(BigDecimal a5_QUARTER_1_NUMBER) {
		A5_QUARTER_1_NUMBER = a5_QUARTER_1_NUMBER;
	}
	public BigDecimal getA5_QUARTER_1_AMOUNT() {
		return A5_QUARTER_1_AMOUNT;
	}
	public void setA5_QUARTER_1_AMOUNT(BigDecimal a5_QUARTER_1_AMOUNT) {
		A5_QUARTER_1_AMOUNT = a5_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA5_QUARTER_2_NUMBER() {
		return A5_QUARTER_2_NUMBER;
	}
	public void setA5_QUARTER_2_NUMBER(BigDecimal a5_QUARTER_2_NUMBER) {
		A5_QUARTER_2_NUMBER = a5_QUARTER_2_NUMBER;
	}
	public BigDecimal getA5_QUARTER_2_AMOUNT() {
		return A5_QUARTER_2_AMOUNT;
	}
	public void setA5_QUARTER_2_AMOUNT(BigDecimal a5_QUARTER_2_AMOUNT) {
		A5_QUARTER_2_AMOUNT = a5_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA5_QUARTER_3_NUMBER() {
		return A5_QUARTER_3_NUMBER;
	}
	public void setA5_QUARTER_3_NUMBER(BigDecimal a5_QUARTER_3_NUMBER) {
		A5_QUARTER_3_NUMBER = a5_QUARTER_3_NUMBER;
	}
	public BigDecimal getA5_QUARTER_3_AMOUNT() {
		return A5_QUARTER_3_AMOUNT;
	}
	public void setA5_QUARTER_3_AMOUNT(BigDecimal a5_QUARTER_3_AMOUNT) {
		A5_QUARTER_3_AMOUNT = a5_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA5_QUARTER_4_NUMBER() {
		return A5_QUARTER_4_NUMBER;
	}
	public void setA5_QUARTER_4_NUMBER(BigDecimal a5_QUARTER_4_NUMBER) {
		A5_QUARTER_4_NUMBER = a5_QUARTER_4_NUMBER;
	}
	public BigDecimal getA5_QUARTER_4_AMOUNT() {
		return A5_QUARTER_4_AMOUNT;
	}
	public void setA5_QUARTER_4_AMOUNT(BigDecimal a5_QUARTER_4_AMOUNT) {
		A5_QUARTER_4_AMOUNT = a5_QUARTER_4_AMOUNT;
	}
	public BigDecimal getA5_QUARTER_5_NUMBER() {
		return A5_QUARTER_5_NUMBER;
	}
	public void setA5_QUARTER_5_NUMBER(BigDecimal a5_QUARTER_5_NUMBER) {
		A5_QUARTER_5_NUMBER = a5_QUARTER_5_NUMBER;
	}
	public BigDecimal getA5_QUARTER_5_AMOUNT() {
		return A5_QUARTER_5_AMOUNT;
	}
	public void setA5_QUARTER_5_AMOUNT(BigDecimal a5_QUARTER_5_AMOUNT) {
		A5_QUARTER_5_AMOUNT = a5_QUARTER_5_AMOUNT;
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
	public BigDecimal getA6_YEARLY_AMOUNT() {
		return A6_YEARLY_AMOUNT;
	}
	public void setA6_YEARLY_AMOUNT(BigDecimal a6_YEARLY_AMOUNT) {
		A6_YEARLY_AMOUNT = a6_YEARLY_AMOUNT;
	}
	public BigDecimal getA6_MONTHLY_NUMBER() {
		return A6_MONTHLY_NUMBER;
	}
	public void setA6_MONTHLY_NUMBER(BigDecimal a6_MONTHLY_NUMBER) {
		A6_MONTHLY_NUMBER = a6_MONTHLY_NUMBER;
	}
	public BigDecimal getA6_MONTHLY_AMOUNT() {
		return A6_MONTHLY_AMOUNT;
	}
	public void setA6_MONTHLY_AMOUNT(BigDecimal a6_MONTHLY_AMOUNT) {
		A6_MONTHLY_AMOUNT = a6_MONTHLY_AMOUNT;
	}
	public BigDecimal getA6_QUARTER_1_NUMBER() {
		return A6_QUARTER_1_NUMBER;
	}
	public void setA6_QUARTER_1_NUMBER(BigDecimal a6_QUARTER_1_NUMBER) {
		A6_QUARTER_1_NUMBER = a6_QUARTER_1_NUMBER;
	}
	public BigDecimal getA6_QUARTER_1_AMOUNT() {
		return A6_QUARTER_1_AMOUNT;
	}
	public void setA6_QUARTER_1_AMOUNT(BigDecimal a6_QUARTER_1_AMOUNT) {
		A6_QUARTER_1_AMOUNT = a6_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA6_QUARTER_2_NUMBER() {
		return A6_QUARTER_2_NUMBER;
	}
	public void setA6_QUARTER_2_NUMBER(BigDecimal a6_QUARTER_2_NUMBER) {
		A6_QUARTER_2_NUMBER = a6_QUARTER_2_NUMBER;
	}
	public BigDecimal getA6_QUARTER_2_AMOUNT() {
		return A6_QUARTER_2_AMOUNT;
	}
	public void setA6_QUARTER_2_AMOUNT(BigDecimal a6_QUARTER_2_AMOUNT) {
		A6_QUARTER_2_AMOUNT = a6_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA6_QUARTER_3_NUMBER() {
		return A6_QUARTER_3_NUMBER;
	}
	public void setA6_QUARTER_3_NUMBER(BigDecimal a6_QUARTER_3_NUMBER) {
		A6_QUARTER_3_NUMBER = a6_QUARTER_3_NUMBER;
	}
	public BigDecimal getA6_QUARTER_3_AMOUNT() {
		return A6_QUARTER_3_AMOUNT;
	}
	public void setA6_QUARTER_3_AMOUNT(BigDecimal a6_QUARTER_3_AMOUNT) {
		A6_QUARTER_3_AMOUNT = a6_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA6_QUARTER_4_NUMBER() {
		return A6_QUARTER_4_NUMBER;
	}
	public void setA6_QUARTER_4_NUMBER(BigDecimal a6_QUARTER_4_NUMBER) {
		A6_QUARTER_4_NUMBER = a6_QUARTER_4_NUMBER;
	}
	public BigDecimal getA6_QUARTER_4_AMOUNT() {
		return A6_QUARTER_4_AMOUNT;
	}
	public void setA6_QUARTER_4_AMOUNT(BigDecimal a6_QUARTER_4_AMOUNT) {
		A6_QUARTER_4_AMOUNT = a6_QUARTER_4_AMOUNT;
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
	public BigDecimal getA8_YEARLY_NUMBER() {
		return A8_YEARLY_NUMBER;
	}
	public void setA8_YEARLY_NUMBER(BigDecimal a8_YEARLY_NUMBER) {
		A8_YEARLY_NUMBER = a8_YEARLY_NUMBER;
	}
	public BigDecimal getA8_YEARLY_AMOUNT() {
		return A8_YEARLY_AMOUNT;
	}
	public void setA8_YEARLY_AMOUNT(BigDecimal a8_YEARLY_AMOUNT) {
		A8_YEARLY_AMOUNT = a8_YEARLY_AMOUNT;
	}
	public BigDecimal getA8_MONTHLY_NUMBER() {
		return A8_MONTHLY_NUMBER;
	}
	public void setA8_MONTHLY_NUMBER(BigDecimal a8_MONTHLY_NUMBER) {
		A8_MONTHLY_NUMBER = a8_MONTHLY_NUMBER;
	}
	public BigDecimal getA8_MONTHLY_AMOUNT() {
		return A8_MONTHLY_AMOUNT;
	}
	public void setA8_MONTHLY_AMOUNT(BigDecimal a8_MONTHLY_AMOUNT) {
		A8_MONTHLY_AMOUNT = a8_MONTHLY_AMOUNT;
	}
	public BigDecimal getA8_QUARTER_1_NUMBER() {
		return A8_QUARTER_1_NUMBER;
	}
	public void setA8_QUARTER_1_NUMBER(BigDecimal a8_QUARTER_1_NUMBER) {
		A8_QUARTER_1_NUMBER = a8_QUARTER_1_NUMBER;
	}
	public BigDecimal getA8_QUARTER_1_AMOUNT() {
		return A8_QUARTER_1_AMOUNT;
	}
	public void setA8_QUARTER_1_AMOUNT(BigDecimal a8_QUARTER_1_AMOUNT) {
		A8_QUARTER_1_AMOUNT = a8_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA8_QUARTER_2_NUMBER() {
		return A8_QUARTER_2_NUMBER;
	}
	public void setA8_QUARTER_2_NUMBER(BigDecimal a8_QUARTER_2_NUMBER) {
		A8_QUARTER_2_NUMBER = a8_QUARTER_2_NUMBER;
	}
	public BigDecimal getA8_QUARTER_2_AMOUNT() {
		return A8_QUARTER_2_AMOUNT;
	}
	public void setA8_QUARTER_2_AMOUNT(BigDecimal a8_QUARTER_2_AMOUNT) {
		A8_QUARTER_2_AMOUNT = a8_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA8_QUARTER_3_NUMBER() {
		return A8_QUARTER_3_NUMBER;
	}
	public void setA8_QUARTER_3_NUMBER(BigDecimal a8_QUARTER_3_NUMBER) {
		A8_QUARTER_3_NUMBER = a8_QUARTER_3_NUMBER;
	}
	public BigDecimal getA8_QUARTER_3_AMOUNT() {
		return A8_QUARTER_3_AMOUNT;
	}
	public void setA8_QUARTER_3_AMOUNT(BigDecimal a8_QUARTER_3_AMOUNT) {
		A8_QUARTER_3_AMOUNT = a8_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA8_QUARTER_4_NUMBER() {
		return A8_QUARTER_4_NUMBER;
	}
	public void setA8_QUARTER_4_NUMBER(BigDecimal a8_QUARTER_4_NUMBER) {
		A8_QUARTER_4_NUMBER = a8_QUARTER_4_NUMBER;
	}
	public BigDecimal getA8_QUARTER_4_AMOUNT() {
		return A8_QUARTER_4_AMOUNT;
	}
	public void setA8_QUARTER_4_AMOUNT(BigDecimal a8_QUARTER_4_AMOUNT) {
		A8_QUARTER_4_AMOUNT = a8_QUARTER_4_AMOUNT;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_YEARLY_NUMBER() {
		return A9_YEARLY_NUMBER;
	}
	public void setA9_YEARLY_NUMBER(BigDecimal a9_YEARLY_NUMBER) {
		A9_YEARLY_NUMBER = a9_YEARLY_NUMBER;
	}
	public BigDecimal getA9_YEARLY_AMOUNT() {
		return A9_YEARLY_AMOUNT;
	}
	public void setA9_YEARLY_AMOUNT(BigDecimal a9_YEARLY_AMOUNT) {
		A9_YEARLY_AMOUNT = a9_YEARLY_AMOUNT;
	}
	public BigDecimal getA9_MONTHLY_NUMBER() {
		return A9_MONTHLY_NUMBER;
	}
	public void setA9_MONTHLY_NUMBER(BigDecimal a9_MONTHLY_NUMBER) {
		A9_MONTHLY_NUMBER = a9_MONTHLY_NUMBER;
	}
	public BigDecimal getA9_MONTHLY_AMOUNT() {
		return A9_MONTHLY_AMOUNT;
	}
	public void setA9_MONTHLY_AMOUNT(BigDecimal a9_MONTHLY_AMOUNT) {
		A9_MONTHLY_AMOUNT = a9_MONTHLY_AMOUNT;
	}
	public BigDecimal getA9_QUARTER_1_NUMBER() {
		return A9_QUARTER_1_NUMBER;
	}
	public void setA9_QUARTER_1_NUMBER(BigDecimal a9_QUARTER_1_NUMBER) {
		A9_QUARTER_1_NUMBER = a9_QUARTER_1_NUMBER;
	}
	public BigDecimal getA9_QUARTER_1_AMOUNT() {
		return A9_QUARTER_1_AMOUNT;
	}
	public void setA9_QUARTER_1_AMOUNT(BigDecimal a9_QUARTER_1_AMOUNT) {
		A9_QUARTER_1_AMOUNT = a9_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA9_QUARTER_2_NUMBER() {
		return A9_QUARTER_2_NUMBER;
	}
	public void setA9_QUARTER_2_NUMBER(BigDecimal a9_QUARTER_2_NUMBER) {
		A9_QUARTER_2_NUMBER = a9_QUARTER_2_NUMBER;
	}
	public BigDecimal getA9_QUARTER_2_AMOUNT() {
		return A9_QUARTER_2_AMOUNT;
	}
	public void setA9_QUARTER_2_AMOUNT(BigDecimal a9_QUARTER_2_AMOUNT) {
		A9_QUARTER_2_AMOUNT = a9_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA9_QUARTER_3_NUMBER() {
		return A9_QUARTER_3_NUMBER;
	}
	public void setA9_QUARTER_3_NUMBER(BigDecimal a9_QUARTER_3_NUMBER) {
		A9_QUARTER_3_NUMBER = a9_QUARTER_3_NUMBER;
	}
	public BigDecimal getA9_QUARTER_3_AMOUNT() {
		return A9_QUARTER_3_AMOUNT;
	}
	public void setA9_QUARTER_3_AMOUNT(BigDecimal a9_QUARTER_3_AMOUNT) {
		A9_QUARTER_3_AMOUNT = a9_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA9_QUARTER_4_NUMBER() {
		return A9_QUARTER_4_NUMBER;
	}
	public void setA9_QUARTER_4_NUMBER(BigDecimal a9_QUARTER_4_NUMBER) {
		A9_QUARTER_4_NUMBER = a9_QUARTER_4_NUMBER;
	}
	public BigDecimal getA9_QUARTER_4_AMOUNT() {
		return A9_QUARTER_4_AMOUNT;
	}
	public void setA9_QUARTER_4_AMOUNT(BigDecimal a9_QUARTER_4_AMOUNT) {
		A9_QUARTER_4_AMOUNT = a9_QUARTER_4_AMOUNT;
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
	public BigDecimal getA11_YEARLY_NUMBER() {
		return A11_YEARLY_NUMBER;
	}
	public void setA11_YEARLY_NUMBER(BigDecimal a11_YEARLY_NUMBER) {
		A11_YEARLY_NUMBER = a11_YEARLY_NUMBER;
	}
	public BigDecimal getA11_YEARLY_AMOUNT() {
		return A11_YEARLY_AMOUNT;
	}
	public void setA11_YEARLY_AMOUNT(BigDecimal a11_YEARLY_AMOUNT) {
		A11_YEARLY_AMOUNT = a11_YEARLY_AMOUNT;
	}
	public BigDecimal getA11_MONTHLY_NUMBER() {
		return A11_MONTHLY_NUMBER;
	}
	public void setA11_MONTHLY_NUMBER(BigDecimal a11_MONTHLY_NUMBER) {
		A11_MONTHLY_NUMBER = a11_MONTHLY_NUMBER;
	}
	public BigDecimal getA11_MONTHLY_AMOUNT() {
		return A11_MONTHLY_AMOUNT;
	}
	public void setA11_MONTHLY_AMOUNT(BigDecimal a11_MONTHLY_AMOUNT) {
		A11_MONTHLY_AMOUNT = a11_MONTHLY_AMOUNT;
	}
	public BigDecimal getA11_QUARTER_1_NUMBER() {
		return A11_QUARTER_1_NUMBER;
	}
	public void setA11_QUARTER_1_NUMBER(BigDecimal a11_QUARTER_1_NUMBER) {
		A11_QUARTER_1_NUMBER = a11_QUARTER_1_NUMBER;
	}
	public BigDecimal getA11_QUARTER_1_AMOUNT() {
		return A11_QUARTER_1_AMOUNT;
	}
	public void setA11_QUARTER_1_AMOUNT(BigDecimal a11_QUARTER_1_AMOUNT) {
		A11_QUARTER_1_AMOUNT = a11_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA11_QUARTER_2_NUMBER() {
		return A11_QUARTER_2_NUMBER;
	}
	public void setA11_QUARTER_2_NUMBER(BigDecimal a11_QUARTER_2_NUMBER) {
		A11_QUARTER_2_NUMBER = a11_QUARTER_2_NUMBER;
	}
	public BigDecimal getA11_QUARTER_2_AMOUNT() {
		return A11_QUARTER_2_AMOUNT;
	}
	public void setA11_QUARTER_2_AMOUNT(BigDecimal a11_QUARTER_2_AMOUNT) {
		A11_QUARTER_2_AMOUNT = a11_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA11_QUARTER_3_NUMBER() {
		return A11_QUARTER_3_NUMBER;
	}
	public void setA11_QUARTER_3_NUMBER(BigDecimal a11_QUARTER_3_NUMBER) {
		A11_QUARTER_3_NUMBER = a11_QUARTER_3_NUMBER;
	}
	public BigDecimal getA11_QUARTER_3_AMOUNT() {
		return A11_QUARTER_3_AMOUNT;
	}
	public void setA11_QUARTER_3_AMOUNT(BigDecimal a11_QUARTER_3_AMOUNT) {
		A11_QUARTER_3_AMOUNT = a11_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA11_QUARTER_4_NUMBER() {
		return A11_QUARTER_4_NUMBER;
	}
	public void setA11_QUARTER_4_NUMBER(BigDecimal a11_QUARTER_4_NUMBER) {
		A11_QUARTER_4_NUMBER = a11_QUARTER_4_NUMBER;
	}
	public BigDecimal getA11_QUARTER_4_AMOUNT() {
		return A11_QUARTER_4_AMOUNT;
	}
	public void setA11_QUARTER_4_AMOUNT(BigDecimal a11_QUARTER_4_AMOUNT) {
		A11_QUARTER_4_AMOUNT = a11_QUARTER_4_AMOUNT;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_YEARLY_NUMBER() {
		return A12_YEARLY_NUMBER;
	}
	public void setA12_YEARLY_NUMBER(BigDecimal a12_YEARLY_NUMBER) {
		A12_YEARLY_NUMBER = a12_YEARLY_NUMBER;
	}
	public BigDecimal getA12_YEARLY_AMOUNT() {
		return A12_YEARLY_AMOUNT;
	}
	public void setA12_YEARLY_AMOUNT(BigDecimal a12_YEARLY_AMOUNT) {
		A12_YEARLY_AMOUNT = a12_YEARLY_AMOUNT;
	}
	public BigDecimal getA12_MONTHLY_NUMBER() {
		return A12_MONTHLY_NUMBER;
	}
	public void setA12_MONTHLY_NUMBER(BigDecimal a12_MONTHLY_NUMBER) {
		A12_MONTHLY_NUMBER = a12_MONTHLY_NUMBER;
	}
	public BigDecimal getA12_MONTHLY_AMOUNT() {
		return A12_MONTHLY_AMOUNT;
	}
	public void setA12_MONTHLY_AMOUNT(BigDecimal a12_MONTHLY_AMOUNT) {
		A12_MONTHLY_AMOUNT = a12_MONTHLY_AMOUNT;
	}
	public BigDecimal getA12_QUARTER_1_NUMBER() {
		return A12_QUARTER_1_NUMBER;
	}
	public void setA12_QUARTER_1_NUMBER(BigDecimal a12_QUARTER_1_NUMBER) {
		A12_QUARTER_1_NUMBER = a12_QUARTER_1_NUMBER;
	}
	public BigDecimal getA12_QUARTER_1_AMOUNT() {
		return A12_QUARTER_1_AMOUNT;
	}
	public void setA12_QUARTER_1_AMOUNT(BigDecimal a12_QUARTER_1_AMOUNT) {
		A12_QUARTER_1_AMOUNT = a12_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA12_QUARTER_2_NUMBER() {
		return A12_QUARTER_2_NUMBER;
	}
	public void setA12_QUARTER_2_NUMBER(BigDecimal a12_QUARTER_2_NUMBER) {
		A12_QUARTER_2_NUMBER = a12_QUARTER_2_NUMBER;
	}
	public BigDecimal getA12_QUARTER_2_AMOUNT() {
		return A12_QUARTER_2_AMOUNT;
	}
	public void setA12_QUARTER_2_AMOUNT(BigDecimal a12_QUARTER_2_AMOUNT) {
		A12_QUARTER_2_AMOUNT = a12_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA12_QUARTER_3_NUMBER() {
		return A12_QUARTER_3_NUMBER;
	}
	public void setA12_QUARTER_3_NUMBER(BigDecimal a12_QUARTER_3_NUMBER) {
		A12_QUARTER_3_NUMBER = a12_QUARTER_3_NUMBER;
	}
	public BigDecimal getA12_QUARTER_3_AMOUNT() {
		return A12_QUARTER_3_AMOUNT;
	}
	public void setA12_QUARTER_3_AMOUNT(BigDecimal a12_QUARTER_3_AMOUNT) {
		A12_QUARTER_3_AMOUNT = a12_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA12_QUARTER_4_NUMBER() {
		return A12_QUARTER_4_NUMBER;
	}
	public void setA12_QUARTER_4_NUMBER(BigDecimal a12_QUARTER_4_NUMBER) {
		A12_QUARTER_4_NUMBER = a12_QUARTER_4_NUMBER;
	}
	public BigDecimal getA12_QUARTER_4_AMOUNT() {
		return A12_QUARTER_4_AMOUNT;
	}
	public void setA12_QUARTER_4_AMOUNT(BigDecimal a12_QUARTER_4_AMOUNT) {
		A12_QUARTER_4_AMOUNT = a12_QUARTER_4_AMOUNT;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_YEARLY_NUMBER() {
		return A13_YEARLY_NUMBER;
	}
	public void setA13_YEARLY_NUMBER(BigDecimal a13_YEARLY_NUMBER) {
		A13_YEARLY_NUMBER = a13_YEARLY_NUMBER;
	}
	public BigDecimal getA13_YEARLY_AMOUNT() {
		return A13_YEARLY_AMOUNT;
	}
	public void setA13_YEARLY_AMOUNT(BigDecimal a13_YEARLY_AMOUNT) {
		A13_YEARLY_AMOUNT = a13_YEARLY_AMOUNT;
	}
	public BigDecimal getA13_MONTHLY_NUMBER() {
		return A13_MONTHLY_NUMBER;
	}
	public void setA13_MONTHLY_NUMBER(BigDecimal a13_MONTHLY_NUMBER) {
		A13_MONTHLY_NUMBER = a13_MONTHLY_NUMBER;
	}
	public BigDecimal getA13_MONTHLY_AMOUNT() {
		return A13_MONTHLY_AMOUNT;
	}
	public void setA13_MONTHLY_AMOUNT(BigDecimal a13_MONTHLY_AMOUNT) {
		A13_MONTHLY_AMOUNT = a13_MONTHLY_AMOUNT;
	}
	public BigDecimal getA13_QUARTER_1_NUMBER() {
		return A13_QUARTER_1_NUMBER;
	}
	public void setA13_QUARTER_1_NUMBER(BigDecimal a13_QUARTER_1_NUMBER) {
		A13_QUARTER_1_NUMBER = a13_QUARTER_1_NUMBER;
	}
	public BigDecimal getA13_QUARTER_1_AMOUNT() {
		return A13_QUARTER_1_AMOUNT;
	}
	public void setA13_QUARTER_1_AMOUNT(BigDecimal a13_QUARTER_1_AMOUNT) {
		A13_QUARTER_1_AMOUNT = a13_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA13_QUARTER_2_NUMBER() {
		return A13_QUARTER_2_NUMBER;
	}
	public void setA13_QUARTER_2_NUMBER(BigDecimal a13_QUARTER_2_NUMBER) {
		A13_QUARTER_2_NUMBER = a13_QUARTER_2_NUMBER;
	}
	public BigDecimal getA13_QUARTER_2_AMOUNT() {
		return A13_QUARTER_2_AMOUNT;
	}
	public void setA13_QUARTER_2_AMOUNT(BigDecimal a13_QUARTER_2_AMOUNT) {
		A13_QUARTER_2_AMOUNT = a13_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA13_QUARTER_3_NUMBER() {
		return A13_QUARTER_3_NUMBER;
	}
	public void setA13_QUARTER_3_NUMBER(BigDecimal a13_QUARTER_3_NUMBER) {
		A13_QUARTER_3_NUMBER = a13_QUARTER_3_NUMBER;
	}
	public BigDecimal getA13_QUARTER_3_AMOUNT() {
		return A13_QUARTER_3_AMOUNT;
	}
	public void setA13_QUARTER_3_AMOUNT(BigDecimal a13_QUARTER_3_AMOUNT) {
		A13_QUARTER_3_AMOUNT = a13_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA13_QUARTER_4_NUMBER() {
		return A13_QUARTER_4_NUMBER;
	}
	public void setA13_QUARTER_4_NUMBER(BigDecimal a13_QUARTER_4_NUMBER) {
		A13_QUARTER_4_NUMBER = a13_QUARTER_4_NUMBER;
	}
	public BigDecimal getA13_QUARTER_4_AMOUNT() {
		return A13_QUARTER_4_AMOUNT;
	}
	public void setA13_QUARTER_4_AMOUNT(BigDecimal a13_QUARTER_4_AMOUNT) {
		A13_QUARTER_4_AMOUNT = a13_QUARTER_4_AMOUNT;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_YEARLY_NUMBER() {
		return A14_YEARLY_NUMBER;
	}
	public void setA14_YEARLY_NUMBER(BigDecimal a14_YEARLY_NUMBER) {
		A14_YEARLY_NUMBER = a14_YEARLY_NUMBER;
	}
	public BigDecimal getA14_YEARLY_AMOUNT() {
		return A14_YEARLY_AMOUNT;
	}
	public void setA14_YEARLY_AMOUNT(BigDecimal a14_YEARLY_AMOUNT) {
		A14_YEARLY_AMOUNT = a14_YEARLY_AMOUNT;
	}
	public BigDecimal getA14_MONTHLY_NUMBER() {
		return A14_MONTHLY_NUMBER;
	}
	public void setA14_MONTHLY_NUMBER(BigDecimal a14_MONTHLY_NUMBER) {
		A14_MONTHLY_NUMBER = a14_MONTHLY_NUMBER;
	}
	public BigDecimal getA14_MONTHLY_AMOUNT() {
		return A14_MONTHLY_AMOUNT;
	}
	public void setA14_MONTHLY_AMOUNT(BigDecimal a14_MONTHLY_AMOUNT) {
		A14_MONTHLY_AMOUNT = a14_MONTHLY_AMOUNT;
	}
	public BigDecimal getA14_QUARTER_1_NUMBER() {
		return A14_QUARTER_1_NUMBER;
	}
	public void setA14_QUARTER_1_NUMBER(BigDecimal a14_QUARTER_1_NUMBER) {
		A14_QUARTER_1_NUMBER = a14_QUARTER_1_NUMBER;
	}
	public BigDecimal getA14_QUARTER_1_AMOUNT() {
		return A14_QUARTER_1_AMOUNT;
	}
	public void setA14_QUARTER_1_AMOUNT(BigDecimal a14_QUARTER_1_AMOUNT) {
		A14_QUARTER_1_AMOUNT = a14_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA14_QUARTER_2_NUMBER() {
		return A14_QUARTER_2_NUMBER;
	}
	public void setA14_QUARTER_2_NUMBER(BigDecimal a14_QUARTER_2_NUMBER) {
		A14_QUARTER_2_NUMBER = a14_QUARTER_2_NUMBER;
	}
	public BigDecimal getA14_QUARTER_2_AMOUNT() {
		return A14_QUARTER_2_AMOUNT;
	}
	public void setA14_QUARTER_2_AMOUNT(BigDecimal a14_QUARTER_2_AMOUNT) {
		A14_QUARTER_2_AMOUNT = a14_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA14_QUARTER_3_NUMBER() {
		return A14_QUARTER_3_NUMBER;
	}
	public void setA14_QUARTER_3_NUMBER(BigDecimal a14_QUARTER_3_NUMBER) {
		A14_QUARTER_3_NUMBER = a14_QUARTER_3_NUMBER;
	}
	public BigDecimal getA14_QUARTER_3_AMOUNT() {
		return A14_QUARTER_3_AMOUNT;
	}
	public void setA14_QUARTER_3_AMOUNT(BigDecimal a14_QUARTER_3_AMOUNT) {
		A14_QUARTER_3_AMOUNT = a14_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA14_QUARTER_4_NUMBER() {
		return A14_QUARTER_4_NUMBER;
	}
	public void setA14_QUARTER_4_NUMBER(BigDecimal a14_QUARTER_4_NUMBER) {
		A14_QUARTER_4_NUMBER = a14_QUARTER_4_NUMBER;
	}
	public BigDecimal getA14_QUARTER_4_AMOUNT() {
		return A14_QUARTER_4_AMOUNT;
	}
	public void setA14_QUARTER_4_AMOUNT(BigDecimal a14_QUARTER_4_AMOUNT) {
		A14_QUARTER_4_AMOUNT = a14_QUARTER_4_AMOUNT;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_YEARLY_NUMBER() {
		return A15_YEARLY_NUMBER;
	}
	public void setA15_YEARLY_NUMBER(BigDecimal a15_YEARLY_NUMBER) {
		A15_YEARLY_NUMBER = a15_YEARLY_NUMBER;
	}
	public BigDecimal getA15_YEARLY_AMOUNT() {
		return A15_YEARLY_AMOUNT;
	}
	public void setA15_YEARLY_AMOUNT(BigDecimal a15_YEARLY_AMOUNT) {
		A15_YEARLY_AMOUNT = a15_YEARLY_AMOUNT;
	}
	public BigDecimal getA15_MONTHLY_NUMBER() {
		return A15_MONTHLY_NUMBER;
	}
	public void setA15_MONTHLY_NUMBER(BigDecimal a15_MONTHLY_NUMBER) {
		A15_MONTHLY_NUMBER = a15_MONTHLY_NUMBER;
	}
	public BigDecimal getA15_MONTHLY_AMOUNT() {
		return A15_MONTHLY_AMOUNT;
	}
	public void setA15_MONTHLY_AMOUNT(BigDecimal a15_MONTHLY_AMOUNT) {
		A15_MONTHLY_AMOUNT = a15_MONTHLY_AMOUNT;
	}
	public BigDecimal getA15_QUARTER_1_NUMBER() {
		return A15_QUARTER_1_NUMBER;
	}
	public void setA15_QUARTER_1_NUMBER(BigDecimal a15_QUARTER_1_NUMBER) {
		A15_QUARTER_1_NUMBER = a15_QUARTER_1_NUMBER;
	}
	public BigDecimal getA15_QUARTER_1_AMOUNT() {
		return A15_QUARTER_1_AMOUNT;
	}
	public void setA15_QUARTER_1_AMOUNT(BigDecimal a15_QUARTER_1_AMOUNT) {
		A15_QUARTER_1_AMOUNT = a15_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA15_QUARTER_2_NUMBER() {
		return A15_QUARTER_2_NUMBER;
	}
	public void setA15_QUARTER_2_NUMBER(BigDecimal a15_QUARTER_2_NUMBER) {
		A15_QUARTER_2_NUMBER = a15_QUARTER_2_NUMBER;
	}
	public BigDecimal getA15_QUARTER_2_AMOUNT() {
		return A15_QUARTER_2_AMOUNT;
	}
	public void setA15_QUARTER_2_AMOUNT(BigDecimal a15_QUARTER_2_AMOUNT) {
		A15_QUARTER_2_AMOUNT = a15_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA15_QUARTER_3_NUMBER() {
		return A15_QUARTER_3_NUMBER;
	}
	public void setA15_QUARTER_3_NUMBER(BigDecimal a15_QUARTER_3_NUMBER) {
		A15_QUARTER_3_NUMBER = a15_QUARTER_3_NUMBER;
	}
	public BigDecimal getA15_QUARTER_3_AMOUNT() {
		return A15_QUARTER_3_AMOUNT;
	}
	public void setA15_QUARTER_3_AMOUNT(BigDecimal a15_QUARTER_3_AMOUNT) {
		A15_QUARTER_3_AMOUNT = a15_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA15_QUARTER_4_NUMBER() {
		return A15_QUARTER_4_NUMBER;
	}
	public void setA15_QUARTER_4_NUMBER(BigDecimal a15_QUARTER_4_NUMBER) {
		A15_QUARTER_4_NUMBER = a15_QUARTER_4_NUMBER;
	}
	public BigDecimal getA15_QUARTER_4_AMOUNT() {
		return A15_QUARTER_4_AMOUNT;
	}
	public void setA15_QUARTER_4_AMOUNT(BigDecimal a15_QUARTER_4_AMOUNT) {
		A15_QUARTER_4_AMOUNT = a15_QUARTER_4_AMOUNT;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public BigDecimal getA16_YEARLY_NUMBER() {
		return A16_YEARLY_NUMBER;
	}
	public void setA16_YEARLY_NUMBER(BigDecimal a16_YEARLY_NUMBER) {
		A16_YEARLY_NUMBER = a16_YEARLY_NUMBER;
	}
	public BigDecimal getA16_YEARLY_AMOUNT() {
		return A16_YEARLY_AMOUNT;
	}
	public void setA16_YEARLY_AMOUNT(BigDecimal a16_YEARLY_AMOUNT) {
		A16_YEARLY_AMOUNT = a16_YEARLY_AMOUNT;
	}
	public BigDecimal getA16_MONTHLY_NUMBER() {
		return A16_MONTHLY_NUMBER;
	}
	public void setA16_MONTHLY_NUMBER(BigDecimal a16_MONTHLY_NUMBER) {
		A16_MONTHLY_NUMBER = a16_MONTHLY_NUMBER;
	}
	public BigDecimal getA16_MONTHLY_AMOUNT() {
		return A16_MONTHLY_AMOUNT;
	}
	public void setA16_MONTHLY_AMOUNT(BigDecimal a16_MONTHLY_AMOUNT) {
		A16_MONTHLY_AMOUNT = a16_MONTHLY_AMOUNT;
	}
	public BigDecimal getA16_QUARTER_1_NUMBER() {
		return A16_QUARTER_1_NUMBER;
	}
	public void setA16_QUARTER_1_NUMBER(BigDecimal a16_QUARTER_1_NUMBER) {
		A16_QUARTER_1_NUMBER = a16_QUARTER_1_NUMBER;
	}
	public BigDecimal getA16_QUARTER_1_AMOUNT() {
		return A16_QUARTER_1_AMOUNT;
	}
	public void setA16_QUARTER_1_AMOUNT(BigDecimal a16_QUARTER_1_AMOUNT) {
		A16_QUARTER_1_AMOUNT = a16_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA16_QUARTER_2_NUMBER() {
		return A16_QUARTER_2_NUMBER;
	}
	public void setA16_QUARTER_2_NUMBER(BigDecimal a16_QUARTER_2_NUMBER) {
		A16_QUARTER_2_NUMBER = a16_QUARTER_2_NUMBER;
	}
	public BigDecimal getA16_QUARTER_2_AMOUNT() {
		return A16_QUARTER_2_AMOUNT;
	}
	public void setA16_QUARTER_2_AMOUNT(BigDecimal a16_QUARTER_2_AMOUNT) {
		A16_QUARTER_2_AMOUNT = a16_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA16_QUARTER_3_NUMBER() {
		return A16_QUARTER_3_NUMBER;
	}
	public void setA16_QUARTER_3_NUMBER(BigDecimal a16_QUARTER_3_NUMBER) {
		A16_QUARTER_3_NUMBER = a16_QUARTER_3_NUMBER;
	}
	public BigDecimal getA16_QUARTER_3_AMOUNT() {
		return A16_QUARTER_3_AMOUNT;
	}
	public void setA16_QUARTER_3_AMOUNT(BigDecimal a16_QUARTER_3_AMOUNT) {
		A16_QUARTER_3_AMOUNT = a16_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA16_QUARTER_4_NUMBER() {
		return A16_QUARTER_4_NUMBER;
	}
	public void setA16_QUARTER_4_NUMBER(BigDecimal a16_QUARTER_4_NUMBER) {
		A16_QUARTER_4_NUMBER = a16_QUARTER_4_NUMBER;
	}
	public BigDecimal getA16_QUARTER_4_AMOUNT() {
		return A16_QUARTER_4_AMOUNT;
	}
	public void setA16_QUARTER_4_AMOUNT(BigDecimal a16_QUARTER_4_AMOUNT) {
		A16_QUARTER_4_AMOUNT = a16_QUARTER_4_AMOUNT;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17_YEARLY_NUMBER() {
		return A17_YEARLY_NUMBER;
	}
	public void setA17_YEARLY_NUMBER(BigDecimal a17_YEARLY_NUMBER) {
		A17_YEARLY_NUMBER = a17_YEARLY_NUMBER;
	}
	public BigDecimal getA17_YEARLY_AMOUNT() {
		return A17_YEARLY_AMOUNT;
	}
	public void setA17_YEARLY_AMOUNT(BigDecimal a17_YEARLY_AMOUNT) {
		A17_YEARLY_AMOUNT = a17_YEARLY_AMOUNT;
	}
	public BigDecimal getA17_MONTHLY_NUMBER() {
		return A17_MONTHLY_NUMBER;
	}
	public void setA17_MONTHLY_NUMBER(BigDecimal a17_MONTHLY_NUMBER) {
		A17_MONTHLY_NUMBER = a17_MONTHLY_NUMBER;
	}
	public BigDecimal getA17_MONTHLY_AMOUNT() {
		return A17_MONTHLY_AMOUNT;
	}
	public void setA17_MONTHLY_AMOUNT(BigDecimal a17_MONTHLY_AMOUNT) {
		A17_MONTHLY_AMOUNT = a17_MONTHLY_AMOUNT;
	}
	public BigDecimal getA17_QUARTER_1_NUMBER() {
		return A17_QUARTER_1_NUMBER;
	}
	public void setA17_QUARTER_1_NUMBER(BigDecimal a17_QUARTER_1_NUMBER) {
		A17_QUARTER_1_NUMBER = a17_QUARTER_1_NUMBER;
	}
	public BigDecimal getA17_QUARTER_1_AMOUNT() {
		return A17_QUARTER_1_AMOUNT;
	}
	public void setA17_QUARTER_1_AMOUNT(BigDecimal a17_QUARTER_1_AMOUNT) {
		A17_QUARTER_1_AMOUNT = a17_QUARTER_1_AMOUNT;
	}
	public BigDecimal getA17_QUARTER_2_NUMBER() {
		return A17_QUARTER_2_NUMBER;
	}
	public void setA17_QUARTER_2_NUMBER(BigDecimal a17_QUARTER_2_NUMBER) {
		A17_QUARTER_2_NUMBER = a17_QUARTER_2_NUMBER;
	}
	public BigDecimal getA17_QUARTER_2_AMOUNT() {
		return A17_QUARTER_2_AMOUNT;
	}
	public void setA17_QUARTER_2_AMOUNT(BigDecimal a17_QUARTER_2_AMOUNT) {
		A17_QUARTER_2_AMOUNT = a17_QUARTER_2_AMOUNT;
	}
	public BigDecimal getA17_QUARTER_3_NUMBER() {
		return A17_QUARTER_3_NUMBER;
	}
	public void setA17_QUARTER_3_NUMBER(BigDecimal a17_QUARTER_3_NUMBER) {
		A17_QUARTER_3_NUMBER = a17_QUARTER_3_NUMBER;
	}
	public BigDecimal getA17_QUARTER_3_AMOUNT() {
		return A17_QUARTER_3_AMOUNT;
	}
	public void setA17_QUARTER_3_AMOUNT(BigDecimal a17_QUARTER_3_AMOUNT) {
		A17_QUARTER_3_AMOUNT = a17_QUARTER_3_AMOUNT;
	}
	public BigDecimal getA17_QUARTER_4_NUMBER() {
		return A17_QUARTER_4_NUMBER;
	}
	public void setA17_QUARTER_4_NUMBER(BigDecimal a17_QUARTER_4_NUMBER) {
		A17_QUARTER_4_NUMBER = a17_QUARTER_4_NUMBER;
	}
	public BigDecimal getA17_QUARTER_4_AMOUNT() {
		return A17_QUARTER_4_AMOUNT;
	}
	public void setA17_QUARTER_4_AMOUNT(BigDecimal a17_QUARTER_4_AMOUNT) {
		A17_QUARTER_4_AMOUNT = a17_QUARTER_4_AMOUNT;
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
	
	
	public T2ORReport(String a1_PRODUCT, String a2_PRODUCT, BigDecimal a2_YEARLY_NUMBER, BigDecimal a2_YEARLY_AMOUNT,
			BigDecimal a2_MONTHLY_NUMBER, BigDecimal a2_MONTHLY_AMOUNT, BigDecimal a2_QUARTER_1_NUMBER,
			BigDecimal a2_QUARTER_1_AMOUNT, BigDecimal a2_QUARTER_2_NUMBER, BigDecimal a2_QUARTER_2_AMOUNT,
			BigDecimal a2_QUARTER_3_NUMBER, BigDecimal a2_QUARTER_3_AMOUNT, BigDecimal a2_QUARTER_4_NUMBER,
			BigDecimal a2_QUARTER_4_AMOUNT, String a3_PRODUCT, BigDecimal a3_YEARLY_NUMBER, BigDecimal a3_YEARLY_AMOUNT,
			BigDecimal a3_MONTHLY_NUMBER, BigDecimal a3_MONTHLY_AMOUNT, BigDecimal a3_QUARTER_1_NUMBER,
			BigDecimal a3_QUARTER_1_AMOUNT, BigDecimal a3_QUARTER_2_NUMBER, BigDecimal a3_QUARTER_2_AMOUNT,
			BigDecimal a3_QUARTER_3_NUMBER, BigDecimal a3_QUARTER_3_AMOUNT, BigDecimal a3_QUARTER_4_NUMBER,
			BigDecimal a3_QUARTER_4_AMOUNT, String a4_PRODUCT, BigDecimal a4_YEARLY_NUMBER, BigDecimal a4_YEARLY_AMOUNT,
			BigDecimal a4_MONTHLY_NUMBER, BigDecimal a4_MONTHLY_AMOUNT, BigDecimal a4_QUARTER_1_NUMBER,
			BigDecimal a4_QUARTER_1_AMOUNT, BigDecimal a4_QUARTER_2_NUMBER, BigDecimal a4_QUARTER_2_AMOUNT,
			BigDecimal a4_QUARTER_3_NUMBER, BigDecimal a4_QUARTER_3_AMOUNT, BigDecimal a4_QUARTER_4_NUMBER,
			BigDecimal a4_QUARTER_4_AMOUNT, String a5_PRODUCT, BigDecimal a5_YEARLY_NUMBER, BigDecimal a5_YEARLY_AMOUNT,
			BigDecimal a5_MONTHLY_NUMBER, BigDecimal a5_MONTHLY_AMOUNT, BigDecimal a5_QUARTER_1_NUMBER,
			BigDecimal a5_QUARTER_1_AMOUNT, BigDecimal a5_QUARTER_2_NUMBER, BigDecimal a5_QUARTER_2_AMOUNT,
			BigDecimal a5_QUARTER_3_NUMBER, BigDecimal a5_QUARTER_3_AMOUNT, BigDecimal a5_QUARTER_4_NUMBER,
			BigDecimal a5_QUARTER_4_AMOUNT, BigDecimal a5_QUARTER_5_NUMBER, BigDecimal a5_QUARTER_5_AMOUNT,
			String a6_PRODUCT, BigDecimal a6_YEARLY_NUMBER, BigDecimal a6_YEARLY_AMOUNT, BigDecimal a6_MONTHLY_NUMBER,
			BigDecimal a6_MONTHLY_AMOUNT, BigDecimal a6_QUARTER_1_NUMBER, BigDecimal a6_QUARTER_1_AMOUNT,
			BigDecimal a6_QUARTER_2_NUMBER, BigDecimal a6_QUARTER_2_AMOUNT, BigDecimal a6_QUARTER_3_NUMBER,
			BigDecimal a6_QUARTER_3_AMOUNT, BigDecimal a6_QUARTER_4_NUMBER, BigDecimal a6_QUARTER_4_AMOUNT,
			String a7_PRODUCT, String a8_PRODUCT, BigDecimal a8_YEARLY_NUMBER, BigDecimal a8_YEARLY_AMOUNT,
			BigDecimal a8_MONTHLY_NUMBER, BigDecimal a8_MONTHLY_AMOUNT, BigDecimal a8_QUARTER_1_NUMBER,
			BigDecimal a8_QUARTER_1_AMOUNT, BigDecimal a8_QUARTER_2_NUMBER, BigDecimal a8_QUARTER_2_AMOUNT,
			BigDecimal a8_QUARTER_3_NUMBER, BigDecimal a8_QUARTER_3_AMOUNT, BigDecimal a8_QUARTER_4_NUMBER,
			BigDecimal a8_QUARTER_4_AMOUNT, String a9_PRODUCT, BigDecimal a9_YEARLY_NUMBER, BigDecimal a9_YEARLY_AMOUNT,
			BigDecimal a9_MONTHLY_NUMBER, BigDecimal a9_MONTHLY_AMOUNT, BigDecimal a9_QUARTER_1_NUMBER,
			BigDecimal a9_QUARTER_1_AMOUNT, BigDecimal a9_QUARTER_2_NUMBER, BigDecimal a9_QUARTER_2_AMOUNT,
			BigDecimal a9_QUARTER_3_NUMBER, BigDecimal a9_QUARTER_3_AMOUNT, BigDecimal a9_QUARTER_4_NUMBER,
			BigDecimal a9_QUARTER_4_AMOUNT, String a10_PRODUCT, String a11_PRODUCT, BigDecimal a11_YEARLY_NUMBER,
			BigDecimal a11_YEARLY_AMOUNT, BigDecimal a11_MONTHLY_NUMBER, BigDecimal a11_MONTHLY_AMOUNT,
			BigDecimal a11_QUARTER_1_NUMBER, BigDecimal a11_QUARTER_1_AMOUNT, BigDecimal a11_QUARTER_2_NUMBER,
			BigDecimal a11_QUARTER_2_AMOUNT, BigDecimal a11_QUARTER_3_NUMBER, BigDecimal a11_QUARTER_3_AMOUNT,
			BigDecimal a11_QUARTER_4_NUMBER, BigDecimal a11_QUARTER_4_AMOUNT, String a12_PRODUCT,
			BigDecimal a12_YEARLY_NUMBER, BigDecimal a12_YEARLY_AMOUNT, BigDecimal a12_MONTHLY_NUMBER,
			BigDecimal a12_MONTHLY_AMOUNT, BigDecimal a12_QUARTER_1_NUMBER, BigDecimal a12_QUARTER_1_AMOUNT,
			BigDecimal a12_QUARTER_2_NUMBER, BigDecimal a12_QUARTER_2_AMOUNT, BigDecimal a12_QUARTER_3_NUMBER,
			BigDecimal a12_QUARTER_3_AMOUNT, BigDecimal a12_QUARTER_4_NUMBER, BigDecimal a12_QUARTER_4_AMOUNT,
			String a13_PRODUCT, BigDecimal a13_YEARLY_NUMBER, BigDecimal a13_YEARLY_AMOUNT,
			BigDecimal a13_MONTHLY_NUMBER, BigDecimal a13_MONTHLY_AMOUNT, BigDecimal a13_QUARTER_1_NUMBER,
			BigDecimal a13_QUARTER_1_AMOUNT, BigDecimal a13_QUARTER_2_NUMBER, BigDecimal a13_QUARTER_2_AMOUNT,
			BigDecimal a13_QUARTER_3_NUMBER, BigDecimal a13_QUARTER_3_AMOUNT, BigDecimal a13_QUARTER_4_NUMBER,
			BigDecimal a13_QUARTER_4_AMOUNT, String a14_PRODUCT, BigDecimal a14_YEARLY_NUMBER,
			BigDecimal a14_YEARLY_AMOUNT, BigDecimal a14_MONTHLY_NUMBER, BigDecimal a14_MONTHLY_AMOUNT,
			BigDecimal a14_QUARTER_1_NUMBER, BigDecimal a14_QUARTER_1_AMOUNT, BigDecimal a14_QUARTER_2_NUMBER,
			BigDecimal a14_QUARTER_2_AMOUNT, BigDecimal a14_QUARTER_3_NUMBER, BigDecimal a14_QUARTER_3_AMOUNT,
			BigDecimal a14_QUARTER_4_NUMBER, BigDecimal a14_QUARTER_4_AMOUNT, String a15_PRODUCT,
			BigDecimal a15_YEARLY_NUMBER, BigDecimal a15_YEARLY_AMOUNT, BigDecimal a15_MONTHLY_NUMBER,
			BigDecimal a15_MONTHLY_AMOUNT, BigDecimal a15_QUARTER_1_NUMBER, BigDecimal a15_QUARTER_1_AMOUNT,
			BigDecimal a15_QUARTER_2_NUMBER, BigDecimal a15_QUARTER_2_AMOUNT, BigDecimal a15_QUARTER_3_NUMBER,
			BigDecimal a15_QUARTER_3_AMOUNT, BigDecimal a15_QUARTER_4_NUMBER, BigDecimal a15_QUARTER_4_AMOUNT,
			String a16_PRODUCT, BigDecimal a16_YEARLY_NUMBER, BigDecimal a16_YEARLY_AMOUNT,
			BigDecimal a16_MONTHLY_NUMBER, BigDecimal a16_MONTHLY_AMOUNT, BigDecimal a16_QUARTER_1_NUMBER,
			BigDecimal a16_QUARTER_1_AMOUNT, BigDecimal a16_QUARTER_2_NUMBER, BigDecimal a16_QUARTER_2_AMOUNT,
			BigDecimal a16_QUARTER_3_NUMBER, BigDecimal a16_QUARTER_3_AMOUNT, BigDecimal a16_QUARTER_4_NUMBER,
			BigDecimal a16_QUARTER_4_AMOUNT, String a17_PRODUCT, BigDecimal a17_YEARLY_NUMBER,
			BigDecimal a17_YEARLY_AMOUNT, BigDecimal a17_MONTHLY_NUMBER, BigDecimal a17_MONTHLY_AMOUNT,
			BigDecimal a17_QUARTER_1_NUMBER, BigDecimal a17_QUARTER_1_AMOUNT, BigDecimal a17_QUARTER_2_NUMBER,
			BigDecimal a17_QUARTER_2_AMOUNT, BigDecimal a17_QUARTER_3_NUMBER, BigDecimal a17_QUARTER_3_AMOUNT,
			BigDecimal a17_QUARTER_4_NUMBER, BigDecimal a17_QUARTER_4_AMOUNT, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG, String hEADER_1, String hEADER_2, String hEADER_3) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A2_PRODUCT = a2_PRODUCT;
		A2_YEARLY_NUMBER = a2_YEARLY_NUMBER;
		A2_YEARLY_AMOUNT = a2_YEARLY_AMOUNT;
		A2_MONTHLY_NUMBER = a2_MONTHLY_NUMBER;
		A2_MONTHLY_AMOUNT = a2_MONTHLY_AMOUNT;
		A2_QUARTER_1_NUMBER = a2_QUARTER_1_NUMBER;
		A2_QUARTER_1_AMOUNT = a2_QUARTER_1_AMOUNT;
		A2_QUARTER_2_NUMBER = a2_QUARTER_2_NUMBER;
		A2_QUARTER_2_AMOUNT = a2_QUARTER_2_AMOUNT;
		A2_QUARTER_3_NUMBER = a2_QUARTER_3_NUMBER;
		A2_QUARTER_3_AMOUNT = a2_QUARTER_3_AMOUNT;
		A2_QUARTER_4_NUMBER = a2_QUARTER_4_NUMBER;
		A2_QUARTER_4_AMOUNT = a2_QUARTER_4_AMOUNT;
		A3_PRODUCT = a3_PRODUCT;
		A3_YEARLY_NUMBER = a3_YEARLY_NUMBER;
		A3_YEARLY_AMOUNT = a3_YEARLY_AMOUNT;
		A3_MONTHLY_NUMBER = a3_MONTHLY_NUMBER;
		A3_MONTHLY_AMOUNT = a3_MONTHLY_AMOUNT;
		A3_QUARTER_1_NUMBER = a3_QUARTER_1_NUMBER;
		A3_QUARTER_1_AMOUNT = a3_QUARTER_1_AMOUNT;
		A3_QUARTER_2_NUMBER = a3_QUARTER_2_NUMBER;
		A3_QUARTER_2_AMOUNT = a3_QUARTER_2_AMOUNT;
		A3_QUARTER_3_NUMBER = a3_QUARTER_3_NUMBER;
		A3_QUARTER_3_AMOUNT = a3_QUARTER_3_AMOUNT;
		A3_QUARTER_4_NUMBER = a3_QUARTER_4_NUMBER;
		A3_QUARTER_4_AMOUNT = a3_QUARTER_4_AMOUNT;
		A4_PRODUCT = a4_PRODUCT;
		A4_YEARLY_NUMBER = a4_YEARLY_NUMBER;
		A4_YEARLY_AMOUNT = a4_YEARLY_AMOUNT;
		A4_MONTHLY_NUMBER = a4_MONTHLY_NUMBER;
		A4_MONTHLY_AMOUNT = a4_MONTHLY_AMOUNT;
		A4_QUARTER_1_NUMBER = a4_QUARTER_1_NUMBER;
		A4_QUARTER_1_AMOUNT = a4_QUARTER_1_AMOUNT;
		A4_QUARTER_2_NUMBER = a4_QUARTER_2_NUMBER;
		A4_QUARTER_2_AMOUNT = a4_QUARTER_2_AMOUNT;
		A4_QUARTER_3_NUMBER = a4_QUARTER_3_NUMBER;
		A4_QUARTER_3_AMOUNT = a4_QUARTER_3_AMOUNT;
		A4_QUARTER_4_NUMBER = a4_QUARTER_4_NUMBER;
		A4_QUARTER_4_AMOUNT = a4_QUARTER_4_AMOUNT;
		A5_PRODUCT = a5_PRODUCT;
		A5_YEARLY_NUMBER = a5_YEARLY_NUMBER;
		A5_YEARLY_AMOUNT = a5_YEARLY_AMOUNT;
		A5_MONTHLY_NUMBER = a5_MONTHLY_NUMBER;
		A5_MONTHLY_AMOUNT = a5_MONTHLY_AMOUNT;
		A5_QUARTER_1_NUMBER = a5_QUARTER_1_NUMBER;
		A5_QUARTER_1_AMOUNT = a5_QUARTER_1_AMOUNT;
		A5_QUARTER_2_NUMBER = a5_QUARTER_2_NUMBER;
		A5_QUARTER_2_AMOUNT = a5_QUARTER_2_AMOUNT;
		A5_QUARTER_3_NUMBER = a5_QUARTER_3_NUMBER;
		A5_QUARTER_3_AMOUNT = a5_QUARTER_3_AMOUNT;
		A5_QUARTER_4_NUMBER = a5_QUARTER_4_NUMBER;
		A5_QUARTER_4_AMOUNT = a5_QUARTER_4_AMOUNT;
		A5_QUARTER_5_NUMBER = a5_QUARTER_5_NUMBER;
		A5_QUARTER_5_AMOUNT = a5_QUARTER_5_AMOUNT;
		A6_PRODUCT = a6_PRODUCT;
		A6_YEARLY_NUMBER = a6_YEARLY_NUMBER;
		A6_YEARLY_AMOUNT = a6_YEARLY_AMOUNT;
		A6_MONTHLY_NUMBER = a6_MONTHLY_NUMBER;
		A6_MONTHLY_AMOUNT = a6_MONTHLY_AMOUNT;
		A6_QUARTER_1_NUMBER = a6_QUARTER_1_NUMBER;
		A6_QUARTER_1_AMOUNT = a6_QUARTER_1_AMOUNT;
		A6_QUARTER_2_NUMBER = a6_QUARTER_2_NUMBER;
		A6_QUARTER_2_AMOUNT = a6_QUARTER_2_AMOUNT;
		A6_QUARTER_3_NUMBER = a6_QUARTER_3_NUMBER;
		A6_QUARTER_3_AMOUNT = a6_QUARTER_3_AMOUNT;
		A6_QUARTER_4_NUMBER = a6_QUARTER_4_NUMBER;
		A6_QUARTER_4_AMOUNT = a6_QUARTER_4_AMOUNT;
		A7_PRODUCT = a7_PRODUCT;
		A8_PRODUCT = a8_PRODUCT;
		A8_YEARLY_NUMBER = a8_YEARLY_NUMBER;
		A8_YEARLY_AMOUNT = a8_YEARLY_AMOUNT;
		A8_MONTHLY_NUMBER = a8_MONTHLY_NUMBER;
		A8_MONTHLY_AMOUNT = a8_MONTHLY_AMOUNT;
		A8_QUARTER_1_NUMBER = a8_QUARTER_1_NUMBER;
		A8_QUARTER_1_AMOUNT = a8_QUARTER_1_AMOUNT;
		A8_QUARTER_2_NUMBER = a8_QUARTER_2_NUMBER;
		A8_QUARTER_2_AMOUNT = a8_QUARTER_2_AMOUNT;
		A8_QUARTER_3_NUMBER = a8_QUARTER_3_NUMBER;
		A8_QUARTER_3_AMOUNT = a8_QUARTER_3_AMOUNT;
		A8_QUARTER_4_NUMBER = a8_QUARTER_4_NUMBER;
		A8_QUARTER_4_AMOUNT = a8_QUARTER_4_AMOUNT;
		A9_PRODUCT = a9_PRODUCT;
		A9_YEARLY_NUMBER = a9_YEARLY_NUMBER;
		A9_YEARLY_AMOUNT = a9_YEARLY_AMOUNT;
		A9_MONTHLY_NUMBER = a9_MONTHLY_NUMBER;
		A9_MONTHLY_AMOUNT = a9_MONTHLY_AMOUNT;
		A9_QUARTER_1_NUMBER = a9_QUARTER_1_NUMBER;
		A9_QUARTER_1_AMOUNT = a9_QUARTER_1_AMOUNT;
		A9_QUARTER_2_NUMBER = a9_QUARTER_2_NUMBER;
		A9_QUARTER_2_AMOUNT = a9_QUARTER_2_AMOUNT;
		A9_QUARTER_3_NUMBER = a9_QUARTER_3_NUMBER;
		A9_QUARTER_3_AMOUNT = a9_QUARTER_3_AMOUNT;
		A9_QUARTER_4_NUMBER = a9_QUARTER_4_NUMBER;
		A9_QUARTER_4_AMOUNT = a9_QUARTER_4_AMOUNT;
		A10_PRODUCT = a10_PRODUCT;
		A11_PRODUCT = a11_PRODUCT;
		A11_YEARLY_NUMBER = a11_YEARLY_NUMBER;
		A11_YEARLY_AMOUNT = a11_YEARLY_AMOUNT;
		A11_MONTHLY_NUMBER = a11_MONTHLY_NUMBER;
		A11_MONTHLY_AMOUNT = a11_MONTHLY_AMOUNT;
		A11_QUARTER_1_NUMBER = a11_QUARTER_1_NUMBER;
		A11_QUARTER_1_AMOUNT = a11_QUARTER_1_AMOUNT;
		A11_QUARTER_2_NUMBER = a11_QUARTER_2_NUMBER;
		A11_QUARTER_2_AMOUNT = a11_QUARTER_2_AMOUNT;
		A11_QUARTER_3_NUMBER = a11_QUARTER_3_NUMBER;
		A11_QUARTER_3_AMOUNT = a11_QUARTER_3_AMOUNT;
		A11_QUARTER_4_NUMBER = a11_QUARTER_4_NUMBER;
		A11_QUARTER_4_AMOUNT = a11_QUARTER_4_AMOUNT;
		A12_PRODUCT = a12_PRODUCT;
		A12_YEARLY_NUMBER = a12_YEARLY_NUMBER;
		A12_YEARLY_AMOUNT = a12_YEARLY_AMOUNT;
		A12_MONTHLY_NUMBER = a12_MONTHLY_NUMBER;
		A12_MONTHLY_AMOUNT = a12_MONTHLY_AMOUNT;
		A12_QUARTER_1_NUMBER = a12_QUARTER_1_NUMBER;
		A12_QUARTER_1_AMOUNT = a12_QUARTER_1_AMOUNT;
		A12_QUARTER_2_NUMBER = a12_QUARTER_2_NUMBER;
		A12_QUARTER_2_AMOUNT = a12_QUARTER_2_AMOUNT;
		A12_QUARTER_3_NUMBER = a12_QUARTER_3_NUMBER;
		A12_QUARTER_3_AMOUNT = a12_QUARTER_3_AMOUNT;
		A12_QUARTER_4_NUMBER = a12_QUARTER_4_NUMBER;
		A12_QUARTER_4_AMOUNT = a12_QUARTER_4_AMOUNT;
		A13_PRODUCT = a13_PRODUCT;
		A13_YEARLY_NUMBER = a13_YEARLY_NUMBER;
		A13_YEARLY_AMOUNT = a13_YEARLY_AMOUNT;
		A13_MONTHLY_NUMBER = a13_MONTHLY_NUMBER;
		A13_MONTHLY_AMOUNT = a13_MONTHLY_AMOUNT;
		A13_QUARTER_1_NUMBER = a13_QUARTER_1_NUMBER;
		A13_QUARTER_1_AMOUNT = a13_QUARTER_1_AMOUNT;
		A13_QUARTER_2_NUMBER = a13_QUARTER_2_NUMBER;
		A13_QUARTER_2_AMOUNT = a13_QUARTER_2_AMOUNT;
		A13_QUARTER_3_NUMBER = a13_QUARTER_3_NUMBER;
		A13_QUARTER_3_AMOUNT = a13_QUARTER_3_AMOUNT;
		A13_QUARTER_4_NUMBER = a13_QUARTER_4_NUMBER;
		A13_QUARTER_4_AMOUNT = a13_QUARTER_4_AMOUNT;
		A14_PRODUCT = a14_PRODUCT;
		A14_YEARLY_NUMBER = a14_YEARLY_NUMBER;
		A14_YEARLY_AMOUNT = a14_YEARLY_AMOUNT;
		A14_MONTHLY_NUMBER = a14_MONTHLY_NUMBER;
		A14_MONTHLY_AMOUNT = a14_MONTHLY_AMOUNT;
		A14_QUARTER_1_NUMBER = a14_QUARTER_1_NUMBER;
		A14_QUARTER_1_AMOUNT = a14_QUARTER_1_AMOUNT;
		A14_QUARTER_2_NUMBER = a14_QUARTER_2_NUMBER;
		A14_QUARTER_2_AMOUNT = a14_QUARTER_2_AMOUNT;
		A14_QUARTER_3_NUMBER = a14_QUARTER_3_NUMBER;
		A14_QUARTER_3_AMOUNT = a14_QUARTER_3_AMOUNT;
		A14_QUARTER_4_NUMBER = a14_QUARTER_4_NUMBER;
		A14_QUARTER_4_AMOUNT = a14_QUARTER_4_AMOUNT;
		A15_PRODUCT = a15_PRODUCT;
		A15_YEARLY_NUMBER = a15_YEARLY_NUMBER;
		A15_YEARLY_AMOUNT = a15_YEARLY_AMOUNT;
		A15_MONTHLY_NUMBER = a15_MONTHLY_NUMBER;
		A15_MONTHLY_AMOUNT = a15_MONTHLY_AMOUNT;
		A15_QUARTER_1_NUMBER = a15_QUARTER_1_NUMBER;
		A15_QUARTER_1_AMOUNT = a15_QUARTER_1_AMOUNT;
		A15_QUARTER_2_NUMBER = a15_QUARTER_2_NUMBER;
		A15_QUARTER_2_AMOUNT = a15_QUARTER_2_AMOUNT;
		A15_QUARTER_3_NUMBER = a15_QUARTER_3_NUMBER;
		A15_QUARTER_3_AMOUNT = a15_QUARTER_3_AMOUNT;
		A15_QUARTER_4_NUMBER = a15_QUARTER_4_NUMBER;
		A15_QUARTER_4_AMOUNT = a15_QUARTER_4_AMOUNT;
		A16_PRODUCT = a16_PRODUCT;
		A16_YEARLY_NUMBER = a16_YEARLY_NUMBER;
		A16_YEARLY_AMOUNT = a16_YEARLY_AMOUNT;
		A16_MONTHLY_NUMBER = a16_MONTHLY_NUMBER;
		A16_MONTHLY_AMOUNT = a16_MONTHLY_AMOUNT;
		A16_QUARTER_1_NUMBER = a16_QUARTER_1_NUMBER;
		A16_QUARTER_1_AMOUNT = a16_QUARTER_1_AMOUNT;
		A16_QUARTER_2_NUMBER = a16_QUARTER_2_NUMBER;
		A16_QUARTER_2_AMOUNT = a16_QUARTER_2_AMOUNT;
		A16_QUARTER_3_NUMBER = a16_QUARTER_3_NUMBER;
		A16_QUARTER_3_AMOUNT = a16_QUARTER_3_AMOUNT;
		A16_QUARTER_4_NUMBER = a16_QUARTER_4_NUMBER;
		A16_QUARTER_4_AMOUNT = a16_QUARTER_4_AMOUNT;
		A17_PRODUCT = a17_PRODUCT;
		A17_YEARLY_NUMBER = a17_YEARLY_NUMBER;
		A17_YEARLY_AMOUNT = a17_YEARLY_AMOUNT;
		A17_MONTHLY_NUMBER = a17_MONTHLY_NUMBER;
		A17_MONTHLY_AMOUNT = a17_MONTHLY_AMOUNT;
		A17_QUARTER_1_NUMBER = a17_QUARTER_1_NUMBER;
		A17_QUARTER_1_AMOUNT = a17_QUARTER_1_AMOUNT;
		A17_QUARTER_2_NUMBER = a17_QUARTER_2_NUMBER;
		A17_QUARTER_2_AMOUNT = a17_QUARTER_2_AMOUNT;
		A17_QUARTER_3_NUMBER = a17_QUARTER_3_NUMBER;
		A17_QUARTER_3_AMOUNT = a17_QUARTER_3_AMOUNT;
		A17_QUARTER_4_NUMBER = a17_QUARTER_4_NUMBER;
		A17_QUARTER_4_AMOUNT = a17_QUARTER_4_AMOUNT;
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
	public T2ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
