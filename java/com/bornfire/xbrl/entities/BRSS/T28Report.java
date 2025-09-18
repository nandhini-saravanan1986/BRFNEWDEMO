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
@Table(name="T28_AML_CFT_REVIEWS_TABLE")
public class T28Report {
	private String	A1_PRODUCT;
	private String	A2_PRODUCT;
	private String	A3_PRODUCT;
	private String	A4_PRODUCT;
	private String	A5_PRODUCT;
	private String	A6_PRODUCT;
	private String	A7_PRODUCT;
	private String	A8_PRODUCT;
	private String	A9_PRODUCT;
	private String	A10_PRODUCT;
	private String	A11_PRODUCT;
	private String	A12_PRODUCT;
	private String	A13_PRODUCT;
	private String	A14_PRODUCT;
	private String	A15_PRODUCT;
	private String	A16_PRODUCT;
	private String	A17_PRODUCT;
	private String	A18_PRODUCT;
	private BigDecimal	B1_NO_BANK_COUNT;
	private BigDecimal	B2_NO_BANK_COUNT;
	private BigDecimal	B3_NO_BANK_COUNT;
	private BigDecimal	B4_NO_BANK_COUNT;
	private BigDecimal	B5_NO_BANK_COUNT;
	private BigDecimal	B6_NO_BANK_COUNT;
	private BigDecimal	B7_NO_BANK_COUNT;
	private BigDecimal	B8_NO_BANK_COUNT;
	private BigDecimal	B9_NO_BANK_COUNT;
	private BigDecimal	B10_NO_BANK_COUNT;
	private BigDecimal	B11_NO_BANK_COUNT;
	private BigDecimal	B12_NO_BANK_COUNT;
	private BigDecimal	B13_NO_BANK_COUNT;
	private BigDecimal	B14_NO_BANK_COUNT;
	private BigDecimal	B15_NO_BANK_COUNT;
	private BigDecimal	B16_NO_BANK_COUNT;
	private BigDecimal	B17_NO_BANK_COUNT;
	private BigDecimal	B18_NO_BANK_COUNT;
	private BigDecimal	C1_BANK_GRADED;
	private BigDecimal	C2_BANK_GRADED;
	private BigDecimal	C3_BANK_GRADED;
	private BigDecimal	C4_BANK_GRADED;
	private BigDecimal	C5_BANK_GRADED;
	private BigDecimal	C6_BANK_GRADED;
	private BigDecimal	C7_BANK_GRADED;
	private BigDecimal	C8_BANK_GRADED;
	private BigDecimal	C9_BANK_GRADED;
	private BigDecimal	C10_BANK_GRADED;
	private BigDecimal	C11_BANK_GRADED;
	private BigDecimal	C12_BANK_GRADED;
	private BigDecimal	C13_BANK_GRADED;
	private BigDecimal	C14_BANK_GRADED;
	private BigDecimal	C15_BANK_GRADED;
	private BigDecimal	C16_BANK_GRADED;
	private BigDecimal	C17_BANK_GRADED;
	private BigDecimal	C18_BANK_GRADED;
	private BigDecimal	D1_BANK_SUB_COUNT;
	private BigDecimal	D2_BANK_SUB_COUNT;
	private BigDecimal	D3_BANK_SUB_COUNT;
	private BigDecimal	D4_BANK_SUB_COUNT;
	private BigDecimal	D5_BANK_SUB_COUNT;
	private BigDecimal	D6_BANK_SUB_COUNT;
	private BigDecimal	D7_BANK_SUB_COUNT;
	private BigDecimal	D8_BANK_SUB_COUNT;
	private BigDecimal	D9_BANK_SUB_COUNT;
	private BigDecimal	D10_BANK_SUB_COUNT;
	private BigDecimal	D11_BANK_SUB_COUNT;
	private BigDecimal	D12_BANK_SUB_COUNT;
	private BigDecimal	D13_BANK_SUB_COUNT;
	private BigDecimal	D14_BANK_SUB_COUNT;
	private BigDecimal	D15_BANK_SUB_COUNT;
	private BigDecimal	D16_BANK_SUB_COUNT;
	private BigDecimal	D17_BANK_SUB_COUNT;
	private BigDecimal	D18_BANK_SUB_COUNT;
	private BigDecimal	E1_BANK_SUB_GRADED;
	private BigDecimal	E2_BANK_SUB_GRADED;
	private BigDecimal	E3_BANK_SUB_GRADED;
	private BigDecimal	E4_BANK_SUB_GRADED;
	private BigDecimal	E5_BANK_SUB_GRADED;
	private BigDecimal	E6_BANK_SUB_GRADED;
	private BigDecimal	E7_BANK_SUB_GRADED;
	private BigDecimal	E8_BANK_SUB_GRADED;
	private BigDecimal	E9_BANK_SUB_GRADED;
	private BigDecimal	E10_BANK_SUB_GRADED;
	private BigDecimal	E11_BANK_SUB_GRADED;
	private BigDecimal	E12_BANK_SUB_GRADED;
	private BigDecimal	E13_BANK_SUB_GRADED;
	private BigDecimal	E14_BANK_SUB_GRADED;
	private BigDecimal	E15_BANK_SUB_GRADED;
	private BigDecimal	E16_BANK_SUB_GRADED;
	private BigDecimal	E17_BANK_SUB_GRADED;
	private BigDecimal	E18_BANK_SUB_GRADED;
	private BigDecimal	F1_BANK_JOINT_COUNT;
	private BigDecimal	F2_BANK_JOINT_COUNT;
	private BigDecimal	F3_BANK_JOINT_COUNT;
	private BigDecimal	F4_BANK_JOINT_COUNT;
	private BigDecimal	F5_BANK_JOINT_COUNT;
	private BigDecimal	F6_BANK_JOINT_COUNT;
	private BigDecimal	F7_BANK_JOINT_COUNT;
	private BigDecimal	F8_BANK_JOINT_COUNT;
	private BigDecimal	F9_BANK_JOINT_COUNT;
	private BigDecimal	F10_BANK_JOINT_COUNT;
	private BigDecimal	F11_BANK_JOINT_COUNT;
	private BigDecimal	F12_BANK_JOINT_COUNT;
	private BigDecimal	F13_BANK_JOINT_COUNT;
	private BigDecimal	F14_BANK_JOINT_COUNT;
	private BigDecimal	F15_BANK_JOINT_COUNT;
	private BigDecimal	F16_BANK_JOINT_COUNT;
	private BigDecimal	F17_BANK_JOINT_COUNT;
	private BigDecimal	F18_BANK_JOINT_COUNT;
	private BigDecimal	G1_BANK_JOINT_GRADED;
	private BigDecimal	G2_BANK_JOINT_GRADED;
	private BigDecimal	G3_BANK_JOINT_GRADED;
	private BigDecimal	G4_BANK_JOINT_GRADED;
	private BigDecimal	G5_BANK_JOINT_GRADED;
	private BigDecimal	G6_BANK_JOINT_GRADED;
	private BigDecimal	G7_BANK_JOINT_GRADED;
	private BigDecimal	G8_BANK_JOINT_GRADED;
	private BigDecimal	G9_BANK_JOINT_GRADED;
	private BigDecimal	G10_BANK_JOINT_GRADED;
	private BigDecimal	G11_BANK_JOINT_GRADED;
	private BigDecimal	G12_BANK_JOINT_GRADED;
	private BigDecimal	G13_BANK_JOINT_GRADED;
	private BigDecimal	G14_BANK_JOINT_GRADED;
	private BigDecimal	G15_BANK_JOINT_GRADED;
	private BigDecimal	G16_BANK_JOINT_GRADED;
	private BigDecimal	G17_BANK_JOINT_GRADED;
	private BigDecimal	G18_BANK_JOINT_GRADED;
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
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public BigDecimal getB1_NO_BANK_COUNT() {
		return B1_NO_BANK_COUNT;
	}
	public void setB1_NO_BANK_COUNT(BigDecimal b1_NO_BANK_COUNT) {
		B1_NO_BANK_COUNT = b1_NO_BANK_COUNT;
	}
	public BigDecimal getB2_NO_BANK_COUNT() {
		return B2_NO_BANK_COUNT;
	}
	public void setB2_NO_BANK_COUNT(BigDecimal b2_NO_BANK_COUNT) {
		B2_NO_BANK_COUNT = b2_NO_BANK_COUNT;
	}
	public BigDecimal getB3_NO_BANK_COUNT() {
		return B3_NO_BANK_COUNT;
	}
	public void setB3_NO_BANK_COUNT(BigDecimal b3_NO_BANK_COUNT) {
		B3_NO_BANK_COUNT = b3_NO_BANK_COUNT;
	}
	public BigDecimal getB4_NO_BANK_COUNT() {
		return B4_NO_BANK_COUNT;
	}
	public void setB4_NO_BANK_COUNT(BigDecimal b4_NO_BANK_COUNT) {
		B4_NO_BANK_COUNT = b4_NO_BANK_COUNT;
	}
	public BigDecimal getB5_NO_BANK_COUNT() {
		return B5_NO_BANK_COUNT;
	}
	public void setB5_NO_BANK_COUNT(BigDecimal b5_NO_BANK_COUNT) {
		B5_NO_BANK_COUNT = b5_NO_BANK_COUNT;
	}
	public BigDecimal getB6_NO_BANK_COUNT() {
		return B6_NO_BANK_COUNT;
	}
	public void setB6_NO_BANK_COUNT(BigDecimal b6_NO_BANK_COUNT) {
		B6_NO_BANK_COUNT = b6_NO_BANK_COUNT;
	}
	public BigDecimal getB7_NO_BANK_COUNT() {
		return B7_NO_BANK_COUNT;
	}
	public void setB7_NO_BANK_COUNT(BigDecimal b7_NO_BANK_COUNT) {
		B7_NO_BANK_COUNT = b7_NO_BANK_COUNT;
	}
	public BigDecimal getB8_NO_BANK_COUNT() {
		return B8_NO_BANK_COUNT;
	}
	public void setB8_NO_BANK_COUNT(BigDecimal b8_NO_BANK_COUNT) {
		B8_NO_BANK_COUNT = b8_NO_BANK_COUNT;
	}
	public BigDecimal getB9_NO_BANK_COUNT() {
		return B9_NO_BANK_COUNT;
	}
	public void setB9_NO_BANK_COUNT(BigDecimal b9_NO_BANK_COUNT) {
		B9_NO_BANK_COUNT = b9_NO_BANK_COUNT;
	}
	public BigDecimal getB10_NO_BANK_COUNT() {
		return B10_NO_BANK_COUNT;
	}
	public void setB10_NO_BANK_COUNT(BigDecimal b10_NO_BANK_COUNT) {
		B10_NO_BANK_COUNT = b10_NO_BANK_COUNT;
	}
	public BigDecimal getB11_NO_BANK_COUNT() {
		return B11_NO_BANK_COUNT;
	}
	public void setB11_NO_BANK_COUNT(BigDecimal b11_NO_BANK_COUNT) {
		B11_NO_BANK_COUNT = b11_NO_BANK_COUNT;
	}
	public BigDecimal getB12_NO_BANK_COUNT() {
		return B12_NO_BANK_COUNT;
	}
	public void setB12_NO_BANK_COUNT(BigDecimal b12_NO_BANK_COUNT) {
		B12_NO_BANK_COUNT = b12_NO_BANK_COUNT;
	}
	public BigDecimal getB13_NO_BANK_COUNT() {
		return B13_NO_BANK_COUNT;
	}
	public void setB13_NO_BANK_COUNT(BigDecimal b13_NO_BANK_COUNT) {
		B13_NO_BANK_COUNT = b13_NO_BANK_COUNT;
	}
	public BigDecimal getB14_NO_BANK_COUNT() {
		return B14_NO_BANK_COUNT;
	}
	public void setB14_NO_BANK_COUNT(BigDecimal b14_NO_BANK_COUNT) {
		B14_NO_BANK_COUNT = b14_NO_BANK_COUNT;
	}
	public BigDecimal getB15_NO_BANK_COUNT() {
		return B15_NO_BANK_COUNT;
	}
	public void setB15_NO_BANK_COUNT(BigDecimal b15_NO_BANK_COUNT) {
		B15_NO_BANK_COUNT = b15_NO_BANK_COUNT;
	}
	public BigDecimal getB16_NO_BANK_COUNT() {
		return B16_NO_BANK_COUNT;
	}
	public void setB16_NO_BANK_COUNT(BigDecimal b16_NO_BANK_COUNT) {
		B16_NO_BANK_COUNT = b16_NO_BANK_COUNT;
	}
	public BigDecimal getB17_NO_BANK_COUNT() {
		return B17_NO_BANK_COUNT;
	}
	public void setB17_NO_BANK_COUNT(BigDecimal b17_NO_BANK_COUNT) {
		B17_NO_BANK_COUNT = b17_NO_BANK_COUNT;
	}
	public BigDecimal getB18_NO_BANK_COUNT() {
		return B18_NO_BANK_COUNT;
	}
	public void setB18_NO_BANK_COUNT(BigDecimal b18_NO_BANK_COUNT) {
		B18_NO_BANK_COUNT = b18_NO_BANK_COUNT;
	}
	public BigDecimal getC1_BANK_GRADED() {
		return C1_BANK_GRADED;
	}
	public void setC1_BANK_GRADED(BigDecimal c1_BANK_GRADED) {
		C1_BANK_GRADED = c1_BANK_GRADED;
	}
	public BigDecimal getC2_BANK_GRADED() {
		return C2_BANK_GRADED;
	}
	public void setC2_BANK_GRADED(BigDecimal c2_BANK_GRADED) {
		C2_BANK_GRADED = c2_BANK_GRADED;
	}
	public BigDecimal getC3_BANK_GRADED() {
		return C3_BANK_GRADED;
	}
	public void setC3_BANK_GRADED(BigDecimal c3_BANK_GRADED) {
		C3_BANK_GRADED = c3_BANK_GRADED;
	}
	public BigDecimal getC4_BANK_GRADED() {
		return C4_BANK_GRADED;
	}
	public void setC4_BANK_GRADED(BigDecimal c4_BANK_GRADED) {
		C4_BANK_GRADED = c4_BANK_GRADED;
	}
	public BigDecimal getC5_BANK_GRADED() {
		return C5_BANK_GRADED;
	}
	public void setC5_BANK_GRADED(BigDecimal c5_BANK_GRADED) {
		C5_BANK_GRADED = c5_BANK_GRADED;
	}
	public BigDecimal getC6_BANK_GRADED() {
		return C6_BANK_GRADED;
	}
	public void setC6_BANK_GRADED(BigDecimal c6_BANK_GRADED) {
		C6_BANK_GRADED = c6_BANK_GRADED;
	}
	public BigDecimal getC7_BANK_GRADED() {
		return C7_BANK_GRADED;
	}
	public void setC7_BANK_GRADED(BigDecimal c7_BANK_GRADED) {
		C7_BANK_GRADED = c7_BANK_GRADED;
	}
	public BigDecimal getC8_BANK_GRADED() {
		return C8_BANK_GRADED;
	}
	public void setC8_BANK_GRADED(BigDecimal c8_BANK_GRADED) {
		C8_BANK_GRADED = c8_BANK_GRADED;
	}
	public BigDecimal getC9_BANK_GRADED() {
		return C9_BANK_GRADED;
	}
	public void setC9_BANK_GRADED(BigDecimal c9_BANK_GRADED) {
		C9_BANK_GRADED = c9_BANK_GRADED;
	}
	public BigDecimal getC10_BANK_GRADED() {
		return C10_BANK_GRADED;
	}
	public void setC10_BANK_GRADED(BigDecimal c10_BANK_GRADED) {
		C10_BANK_GRADED = c10_BANK_GRADED;
	}
	public BigDecimal getC11_BANK_GRADED() {
		return C11_BANK_GRADED;
	}
	public void setC11_BANK_GRADED(BigDecimal c11_BANK_GRADED) {
		C11_BANK_GRADED = c11_BANK_GRADED;
	}
	public BigDecimal getC12_BANK_GRADED() {
		return C12_BANK_GRADED;
	}
	public void setC12_BANK_GRADED(BigDecimal c12_BANK_GRADED) {
		C12_BANK_GRADED = c12_BANK_GRADED;
	}
	public BigDecimal getC13_BANK_GRADED() {
		return C13_BANK_GRADED;
	}
	public void setC13_BANK_GRADED(BigDecimal c13_BANK_GRADED) {
		C13_BANK_GRADED = c13_BANK_GRADED;
	}
	public BigDecimal getC14_BANK_GRADED() {
		return C14_BANK_GRADED;
	}
	public void setC14_BANK_GRADED(BigDecimal c14_BANK_GRADED) {
		C14_BANK_GRADED = c14_BANK_GRADED;
	}
	public BigDecimal getC15_BANK_GRADED() {
		return C15_BANK_GRADED;
	}
	public void setC15_BANK_GRADED(BigDecimal c15_BANK_GRADED) {
		C15_BANK_GRADED = c15_BANK_GRADED;
	}
	public BigDecimal getC16_BANK_GRADED() {
		return C16_BANK_GRADED;
	}
	public void setC16_BANK_GRADED(BigDecimal c16_BANK_GRADED) {
		C16_BANK_GRADED = c16_BANK_GRADED;
	}
	public BigDecimal getC17_BANK_GRADED() {
		return C17_BANK_GRADED;
	}
	public void setC17_BANK_GRADED(BigDecimal c17_BANK_GRADED) {
		C17_BANK_GRADED = c17_BANK_GRADED;
	}
	public BigDecimal getC18_BANK_GRADED() {
		return C18_BANK_GRADED;
	}
	public void setC18_BANK_GRADED(BigDecimal c18_BANK_GRADED) {
		C18_BANK_GRADED = c18_BANK_GRADED;
	}
	public BigDecimal getD1_BANK_SUB_COUNT() {
		return D1_BANK_SUB_COUNT;
	}
	public void setD1_BANK_SUB_COUNT(BigDecimal d1_BANK_SUB_COUNT) {
		D1_BANK_SUB_COUNT = d1_BANK_SUB_COUNT;
	}
	public BigDecimal getD2_BANK_SUB_COUNT() {
		return D2_BANK_SUB_COUNT;
	}
	public void setD2_BANK_SUB_COUNT(BigDecimal d2_BANK_SUB_COUNT) {
		D2_BANK_SUB_COUNT = d2_BANK_SUB_COUNT;
	}
	public BigDecimal getD3_BANK_SUB_COUNT() {
		return D3_BANK_SUB_COUNT;
	}
	public void setD3_BANK_SUB_COUNT(BigDecimal d3_BANK_SUB_COUNT) {
		D3_BANK_SUB_COUNT = d3_BANK_SUB_COUNT;
	}
	public BigDecimal getD4_BANK_SUB_COUNT() {
		return D4_BANK_SUB_COUNT;
	}
	public void setD4_BANK_SUB_COUNT(BigDecimal d4_BANK_SUB_COUNT) {
		D4_BANK_SUB_COUNT = d4_BANK_SUB_COUNT;
	}
	public BigDecimal getD5_BANK_SUB_COUNT() {
		return D5_BANK_SUB_COUNT;
	}
	public void setD5_BANK_SUB_COUNT(BigDecimal d5_BANK_SUB_COUNT) {
		D5_BANK_SUB_COUNT = d5_BANK_SUB_COUNT;
	}
	public BigDecimal getD6_BANK_SUB_COUNT() {
		return D6_BANK_SUB_COUNT;
	}
	public void setD6_BANK_SUB_COUNT(BigDecimal d6_BANK_SUB_COUNT) {
		D6_BANK_SUB_COUNT = d6_BANK_SUB_COUNT;
	}
	public BigDecimal getD7_BANK_SUB_COUNT() {
		return D7_BANK_SUB_COUNT;
	}
	public void setD7_BANK_SUB_COUNT(BigDecimal d7_BANK_SUB_COUNT) {
		D7_BANK_SUB_COUNT = d7_BANK_SUB_COUNT;
	}
	public BigDecimal getD8_BANK_SUB_COUNT() {
		return D8_BANK_SUB_COUNT;
	}
	public void setD8_BANK_SUB_COUNT(BigDecimal d8_BANK_SUB_COUNT) {
		D8_BANK_SUB_COUNT = d8_BANK_SUB_COUNT;
	}
	public BigDecimal getD9_BANK_SUB_COUNT() {
		return D9_BANK_SUB_COUNT;
	}
	public void setD9_BANK_SUB_COUNT(BigDecimal d9_BANK_SUB_COUNT) {
		D9_BANK_SUB_COUNT = d9_BANK_SUB_COUNT;
	}
	public BigDecimal getD10_BANK_SUB_COUNT() {
		return D10_BANK_SUB_COUNT;
	}
	public void setD10_BANK_SUB_COUNT(BigDecimal d10_BANK_SUB_COUNT) {
		D10_BANK_SUB_COUNT = d10_BANK_SUB_COUNT;
	}
	public BigDecimal getD11_BANK_SUB_COUNT() {
		return D11_BANK_SUB_COUNT;
	}
	public void setD11_BANK_SUB_COUNT(BigDecimal d11_BANK_SUB_COUNT) {
		D11_BANK_SUB_COUNT = d11_BANK_SUB_COUNT;
	}
	public BigDecimal getD12_BANK_SUB_COUNT() {
		return D12_BANK_SUB_COUNT;
	}
	public void setD12_BANK_SUB_COUNT(BigDecimal d12_BANK_SUB_COUNT) {
		D12_BANK_SUB_COUNT = d12_BANK_SUB_COUNT;
	}
	public BigDecimal getD13_BANK_SUB_COUNT() {
		return D13_BANK_SUB_COUNT;
	}
	public void setD13_BANK_SUB_COUNT(BigDecimal d13_BANK_SUB_COUNT) {
		D13_BANK_SUB_COUNT = d13_BANK_SUB_COUNT;
	}
	public BigDecimal getD14_BANK_SUB_COUNT() {
		return D14_BANK_SUB_COUNT;
	}
	public void setD14_BANK_SUB_COUNT(BigDecimal d14_BANK_SUB_COUNT) {
		D14_BANK_SUB_COUNT = d14_BANK_SUB_COUNT;
	}
	public BigDecimal getD15_BANK_SUB_COUNT() {
		return D15_BANK_SUB_COUNT;
	}
	public void setD15_BANK_SUB_COUNT(BigDecimal d15_BANK_SUB_COUNT) {
		D15_BANK_SUB_COUNT = d15_BANK_SUB_COUNT;
	}
	public BigDecimal getD16_BANK_SUB_COUNT() {
		return D16_BANK_SUB_COUNT;
	}
	public void setD16_BANK_SUB_COUNT(BigDecimal d16_BANK_SUB_COUNT) {
		D16_BANK_SUB_COUNT = d16_BANK_SUB_COUNT;
	}
	public BigDecimal getD17_BANK_SUB_COUNT() {
		return D17_BANK_SUB_COUNT;
	}
	public void setD17_BANK_SUB_COUNT(BigDecimal d17_BANK_SUB_COUNT) {
		D17_BANK_SUB_COUNT = d17_BANK_SUB_COUNT;
	}
	public BigDecimal getD18_BANK_SUB_COUNT() {
		return D18_BANK_SUB_COUNT;
	}
	public void setD18_BANK_SUB_COUNT(BigDecimal d18_BANK_SUB_COUNT) {
		D18_BANK_SUB_COUNT = d18_BANK_SUB_COUNT;
	}
	public BigDecimal getE1_BANK_SUB_GRADED() {
		return E1_BANK_SUB_GRADED;
	}
	public void setE1_BANK_SUB_GRADED(BigDecimal e1_BANK_SUB_GRADED) {
		E1_BANK_SUB_GRADED = e1_BANK_SUB_GRADED;
	}
	public BigDecimal getE2_BANK_SUB_GRADED() {
		return E2_BANK_SUB_GRADED;
	}
	public void setE2_BANK_SUB_GRADED(BigDecimal e2_BANK_SUB_GRADED) {
		E2_BANK_SUB_GRADED = e2_BANK_SUB_GRADED;
	}
	public BigDecimal getE3_BANK_SUB_GRADED() {
		return E3_BANK_SUB_GRADED;
	}
	public void setE3_BANK_SUB_GRADED(BigDecimal e3_BANK_SUB_GRADED) {
		E3_BANK_SUB_GRADED = e3_BANK_SUB_GRADED;
	}
	public BigDecimal getE4_BANK_SUB_GRADED() {
		return E4_BANK_SUB_GRADED;
	}
	public void setE4_BANK_SUB_GRADED(BigDecimal e4_BANK_SUB_GRADED) {
		E4_BANK_SUB_GRADED = e4_BANK_SUB_GRADED;
	}
	public BigDecimal getE5_BANK_SUB_GRADED() {
		return E5_BANK_SUB_GRADED;
	}
	public void setE5_BANK_SUB_GRADED(BigDecimal e5_BANK_SUB_GRADED) {
		E5_BANK_SUB_GRADED = e5_BANK_SUB_GRADED;
	}
	public BigDecimal getE6_BANK_SUB_GRADED() {
		return E6_BANK_SUB_GRADED;
	}
	public void setE6_BANK_SUB_GRADED(BigDecimal e6_BANK_SUB_GRADED) {
		E6_BANK_SUB_GRADED = e6_BANK_SUB_GRADED;
	}
	public BigDecimal getE7_BANK_SUB_GRADED() {
		return E7_BANK_SUB_GRADED;
	}
	public void setE7_BANK_SUB_GRADED(BigDecimal e7_BANK_SUB_GRADED) {
		E7_BANK_SUB_GRADED = e7_BANK_SUB_GRADED;
	}
	public BigDecimal getE8_BANK_SUB_GRADED() {
		return E8_BANK_SUB_GRADED;
	}
	public void setE8_BANK_SUB_GRADED(BigDecimal e8_BANK_SUB_GRADED) {
		E8_BANK_SUB_GRADED = e8_BANK_SUB_GRADED;
	}
	public BigDecimal getE9_BANK_SUB_GRADED() {
		return E9_BANK_SUB_GRADED;
	}
	public void setE9_BANK_SUB_GRADED(BigDecimal e9_BANK_SUB_GRADED) {
		E9_BANK_SUB_GRADED = e9_BANK_SUB_GRADED;
	}
	public BigDecimal getE10_BANK_SUB_GRADED() {
		return E10_BANK_SUB_GRADED;
	}
	public void setE10_BANK_SUB_GRADED(BigDecimal e10_BANK_SUB_GRADED) {
		E10_BANK_SUB_GRADED = e10_BANK_SUB_GRADED;
	}
	public BigDecimal getE11_BANK_SUB_GRADED() {
		return E11_BANK_SUB_GRADED;
	}
	public void setE11_BANK_SUB_GRADED(BigDecimal e11_BANK_SUB_GRADED) {
		E11_BANK_SUB_GRADED = e11_BANK_SUB_GRADED;
	}
	public BigDecimal getE12_BANK_SUB_GRADED() {
		return E12_BANK_SUB_GRADED;
	}
	public void setE12_BANK_SUB_GRADED(BigDecimal e12_BANK_SUB_GRADED) {
		E12_BANK_SUB_GRADED = e12_BANK_SUB_GRADED;
	}
	public BigDecimal getE13_BANK_SUB_GRADED() {
		return E13_BANK_SUB_GRADED;
	}
	public void setE13_BANK_SUB_GRADED(BigDecimal e13_BANK_SUB_GRADED) {
		E13_BANK_SUB_GRADED = e13_BANK_SUB_GRADED;
	}
	public BigDecimal getE14_BANK_SUB_GRADED() {
		return E14_BANK_SUB_GRADED;
	}
	public void setE14_BANK_SUB_GRADED(BigDecimal e14_BANK_SUB_GRADED) {
		E14_BANK_SUB_GRADED = e14_BANK_SUB_GRADED;
	}
	public BigDecimal getE15_BANK_SUB_GRADED() {
		return E15_BANK_SUB_GRADED;
	}
	public void setE15_BANK_SUB_GRADED(BigDecimal e15_BANK_SUB_GRADED) {
		E15_BANK_SUB_GRADED = e15_BANK_SUB_GRADED;
	}
	public BigDecimal getE16_BANK_SUB_GRADED() {
		return E16_BANK_SUB_GRADED;
	}
	public void setE16_BANK_SUB_GRADED(BigDecimal e16_BANK_SUB_GRADED) {
		E16_BANK_SUB_GRADED = e16_BANK_SUB_GRADED;
	}
	public BigDecimal getE17_BANK_SUB_GRADED() {
		return E17_BANK_SUB_GRADED;
	}
	public void setE17_BANK_SUB_GRADED(BigDecimal e17_BANK_SUB_GRADED) {
		E17_BANK_SUB_GRADED = e17_BANK_SUB_GRADED;
	}
	public BigDecimal getE18_BANK_SUB_GRADED() {
		return E18_BANK_SUB_GRADED;
	}
	public void setE18_BANK_SUB_GRADED(BigDecimal e18_BANK_SUB_GRADED) {
		E18_BANK_SUB_GRADED = e18_BANK_SUB_GRADED;
	}
	public BigDecimal getF1_BANK_JOINT_COUNT() {
		return F1_BANK_JOINT_COUNT;
	}
	public void setF1_BANK_JOINT_COUNT(BigDecimal f1_BANK_JOINT_COUNT) {
		F1_BANK_JOINT_COUNT = f1_BANK_JOINT_COUNT;
	}
	public BigDecimal getF2_BANK_JOINT_COUNT() {
		return F2_BANK_JOINT_COUNT;
	}
	public void setF2_BANK_JOINT_COUNT(BigDecimal f2_BANK_JOINT_COUNT) {
		F2_BANK_JOINT_COUNT = f2_BANK_JOINT_COUNT;
	}
	public BigDecimal getF3_BANK_JOINT_COUNT() {
		return F3_BANK_JOINT_COUNT;
	}
	public void setF3_BANK_JOINT_COUNT(BigDecimal f3_BANK_JOINT_COUNT) {
		F3_BANK_JOINT_COUNT = f3_BANK_JOINT_COUNT;
	}
	public BigDecimal getF4_BANK_JOINT_COUNT() {
		return F4_BANK_JOINT_COUNT;
	}
	public void setF4_BANK_JOINT_COUNT(BigDecimal f4_BANK_JOINT_COUNT) {
		F4_BANK_JOINT_COUNT = f4_BANK_JOINT_COUNT;
	}
	public BigDecimal getF5_BANK_JOINT_COUNT() {
		return F5_BANK_JOINT_COUNT;
	}
	public void setF5_BANK_JOINT_COUNT(BigDecimal f5_BANK_JOINT_COUNT) {
		F5_BANK_JOINT_COUNT = f5_BANK_JOINT_COUNT;
	}
	public BigDecimal getF6_BANK_JOINT_COUNT() {
		return F6_BANK_JOINT_COUNT;
	}
	public void setF6_BANK_JOINT_COUNT(BigDecimal f6_BANK_JOINT_COUNT) {
		F6_BANK_JOINT_COUNT = f6_BANK_JOINT_COUNT;
	}
	public BigDecimal getF7_BANK_JOINT_COUNT() {
		return F7_BANK_JOINT_COUNT;
	}
	public void setF7_BANK_JOINT_COUNT(BigDecimal f7_BANK_JOINT_COUNT) {
		F7_BANK_JOINT_COUNT = f7_BANK_JOINT_COUNT;
	}
	public BigDecimal getF8_BANK_JOINT_COUNT() {
		return F8_BANK_JOINT_COUNT;
	}
	public void setF8_BANK_JOINT_COUNT(BigDecimal f8_BANK_JOINT_COUNT) {
		F8_BANK_JOINT_COUNT = f8_BANK_JOINT_COUNT;
	}
	public BigDecimal getF9_BANK_JOINT_COUNT() {
		return F9_BANK_JOINT_COUNT;
	}
	public void setF9_BANK_JOINT_COUNT(BigDecimal f9_BANK_JOINT_COUNT) {
		F9_BANK_JOINT_COUNT = f9_BANK_JOINT_COUNT;
	}
	public BigDecimal getF10_BANK_JOINT_COUNT() {
		return F10_BANK_JOINT_COUNT;
	}
	public void setF10_BANK_JOINT_COUNT(BigDecimal f10_BANK_JOINT_COUNT) {
		F10_BANK_JOINT_COUNT = f10_BANK_JOINT_COUNT;
	}
	public BigDecimal getF11_BANK_JOINT_COUNT() {
		return F11_BANK_JOINT_COUNT;
	}
	public void setF11_BANK_JOINT_COUNT(BigDecimal f11_BANK_JOINT_COUNT) {
		F11_BANK_JOINT_COUNT = f11_BANK_JOINT_COUNT;
	}
	public BigDecimal getF12_BANK_JOINT_COUNT() {
		return F12_BANK_JOINT_COUNT;
	}
	public void setF12_BANK_JOINT_COUNT(BigDecimal f12_BANK_JOINT_COUNT) {
		F12_BANK_JOINT_COUNT = f12_BANK_JOINT_COUNT;
	}
	public BigDecimal getF13_BANK_JOINT_COUNT() {
		return F13_BANK_JOINT_COUNT;
	}
	public void setF13_BANK_JOINT_COUNT(BigDecimal f13_BANK_JOINT_COUNT) {
		F13_BANK_JOINT_COUNT = f13_BANK_JOINT_COUNT;
	}
	public BigDecimal getF14_BANK_JOINT_COUNT() {
		return F14_BANK_JOINT_COUNT;
	}
	public void setF14_BANK_JOINT_COUNT(BigDecimal f14_BANK_JOINT_COUNT) {
		F14_BANK_JOINT_COUNT = f14_BANK_JOINT_COUNT;
	}
	public BigDecimal getF15_BANK_JOINT_COUNT() {
		return F15_BANK_JOINT_COUNT;
	}
	public void setF15_BANK_JOINT_COUNT(BigDecimal f15_BANK_JOINT_COUNT) {
		F15_BANK_JOINT_COUNT = f15_BANK_JOINT_COUNT;
	}
	public BigDecimal getF16_BANK_JOINT_COUNT() {
		return F16_BANK_JOINT_COUNT;
	}
	public void setF16_BANK_JOINT_COUNT(BigDecimal f16_BANK_JOINT_COUNT) {
		F16_BANK_JOINT_COUNT = f16_BANK_JOINT_COUNT;
	}
	public BigDecimal getF17_BANK_JOINT_COUNT() {
		return F17_BANK_JOINT_COUNT;
	}
	public void setF17_BANK_JOINT_COUNT(BigDecimal f17_BANK_JOINT_COUNT) {
		F17_BANK_JOINT_COUNT = f17_BANK_JOINT_COUNT;
	}
	public BigDecimal getF18_BANK_JOINT_COUNT() {
		return F18_BANK_JOINT_COUNT;
	}
	public void setF18_BANK_JOINT_COUNT(BigDecimal f18_BANK_JOINT_COUNT) {
		F18_BANK_JOINT_COUNT = f18_BANK_JOINT_COUNT;
	}
	public BigDecimal getG1_BANK_JOINT_GRADED() {
		return G1_BANK_JOINT_GRADED;
	}
	public void setG1_BANK_JOINT_GRADED(BigDecimal g1_BANK_JOINT_GRADED) {
		G1_BANK_JOINT_GRADED = g1_BANK_JOINT_GRADED;
	}
	public BigDecimal getG2_BANK_JOINT_GRADED() {
		return G2_BANK_JOINT_GRADED;
	}
	public void setG2_BANK_JOINT_GRADED(BigDecimal g2_BANK_JOINT_GRADED) {
		G2_BANK_JOINT_GRADED = g2_BANK_JOINT_GRADED;
	}
	public BigDecimal getG3_BANK_JOINT_GRADED() {
		return G3_BANK_JOINT_GRADED;
	}
	public void setG3_BANK_JOINT_GRADED(BigDecimal g3_BANK_JOINT_GRADED) {
		G3_BANK_JOINT_GRADED = g3_BANK_JOINT_GRADED;
	}
	public BigDecimal getG4_BANK_JOINT_GRADED() {
		return G4_BANK_JOINT_GRADED;
	}
	public void setG4_BANK_JOINT_GRADED(BigDecimal g4_BANK_JOINT_GRADED) {
		G4_BANK_JOINT_GRADED = g4_BANK_JOINT_GRADED;
	}
	public BigDecimal getG5_BANK_JOINT_GRADED() {
		return G5_BANK_JOINT_GRADED;
	}
	public void setG5_BANK_JOINT_GRADED(BigDecimal g5_BANK_JOINT_GRADED) {
		G5_BANK_JOINT_GRADED = g5_BANK_JOINT_GRADED;
	}
	public BigDecimal getG6_BANK_JOINT_GRADED() {
		return G6_BANK_JOINT_GRADED;
	}
	public void setG6_BANK_JOINT_GRADED(BigDecimal g6_BANK_JOINT_GRADED) {
		G6_BANK_JOINT_GRADED = g6_BANK_JOINT_GRADED;
	}
	public BigDecimal getG7_BANK_JOINT_GRADED() {
		return G7_BANK_JOINT_GRADED;
	}
	public void setG7_BANK_JOINT_GRADED(BigDecimal g7_BANK_JOINT_GRADED) {
		G7_BANK_JOINT_GRADED = g7_BANK_JOINT_GRADED;
	}
	public BigDecimal getG8_BANK_JOINT_GRADED() {
		return G8_BANK_JOINT_GRADED;
	}
	public void setG8_BANK_JOINT_GRADED(BigDecimal g8_BANK_JOINT_GRADED) {
		G8_BANK_JOINT_GRADED = g8_BANK_JOINT_GRADED;
	}
	public BigDecimal getG9_BANK_JOINT_GRADED() {
		return G9_BANK_JOINT_GRADED;
	}
	public void setG9_BANK_JOINT_GRADED(BigDecimal g9_BANK_JOINT_GRADED) {
		G9_BANK_JOINT_GRADED = g9_BANK_JOINT_GRADED;
	}
	public BigDecimal getG10_BANK_JOINT_GRADED() {
		return G10_BANK_JOINT_GRADED;
	}
	public void setG10_BANK_JOINT_GRADED(BigDecimal g10_BANK_JOINT_GRADED) {
		G10_BANK_JOINT_GRADED = g10_BANK_JOINT_GRADED;
	}
	public BigDecimal getG11_BANK_JOINT_GRADED() {
		return G11_BANK_JOINT_GRADED;
	}
	public void setG11_BANK_JOINT_GRADED(BigDecimal g11_BANK_JOINT_GRADED) {
		G11_BANK_JOINT_GRADED = g11_BANK_JOINT_GRADED;
	}
	public BigDecimal getG12_BANK_JOINT_GRADED() {
		return G12_BANK_JOINT_GRADED;
	}
	public void setG12_BANK_JOINT_GRADED(BigDecimal g12_BANK_JOINT_GRADED) {
		G12_BANK_JOINT_GRADED = g12_BANK_JOINT_GRADED;
	}
	public BigDecimal getG13_BANK_JOINT_GRADED() {
		return G13_BANK_JOINT_GRADED;
	}
	public void setG13_BANK_JOINT_GRADED(BigDecimal g13_BANK_JOINT_GRADED) {
		G13_BANK_JOINT_GRADED = g13_BANK_JOINT_GRADED;
	}
	public BigDecimal getG14_BANK_JOINT_GRADED() {
		return G14_BANK_JOINT_GRADED;
	}
	public void setG14_BANK_JOINT_GRADED(BigDecimal g14_BANK_JOINT_GRADED) {
		G14_BANK_JOINT_GRADED = g14_BANK_JOINT_GRADED;
	}
	public BigDecimal getG15_BANK_JOINT_GRADED() {
		return G15_BANK_JOINT_GRADED;
	}
	public void setG15_BANK_JOINT_GRADED(BigDecimal g15_BANK_JOINT_GRADED) {
		G15_BANK_JOINT_GRADED = g15_BANK_JOINT_GRADED;
	}
	public BigDecimal getG16_BANK_JOINT_GRADED() {
		return G16_BANK_JOINT_GRADED;
	}
	public void setG16_BANK_JOINT_GRADED(BigDecimal g16_BANK_JOINT_GRADED) {
		G16_BANK_JOINT_GRADED = g16_BANK_JOINT_GRADED;
	}
	public BigDecimal getG17_BANK_JOINT_GRADED() {
		return G17_BANK_JOINT_GRADED;
	}
	public void setG17_BANK_JOINT_GRADED(BigDecimal g17_BANK_JOINT_GRADED) {
		G17_BANK_JOINT_GRADED = g17_BANK_JOINT_GRADED;
	}
	public BigDecimal getG18_BANK_JOINT_GRADED() {
		return G18_BANK_JOINT_GRADED;
	}
	public void setG18_BANK_JOINT_GRADED(BigDecimal g18_BANK_JOINT_GRADED) {
		G18_BANK_JOINT_GRADED = g18_BANK_JOINT_GRADED;
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
	public T28Report(String a1_PRODUCT, String a2_PRODUCT, String a3_PRODUCT, String a4_PRODUCT, String a5_PRODUCT,
			String a6_PRODUCT, String a7_PRODUCT, String a8_PRODUCT, String a9_PRODUCT, String a10_PRODUCT,
			String a11_PRODUCT, String a12_PRODUCT, String a13_PRODUCT, String a14_PRODUCT, String a15_PRODUCT,
			String a16_PRODUCT, String a17_PRODUCT, String a18_PRODUCT, BigDecimal b1_NO_BANK_COUNT,
			BigDecimal b2_NO_BANK_COUNT, BigDecimal b3_NO_BANK_COUNT, BigDecimal b4_NO_BANK_COUNT,
			BigDecimal b5_NO_BANK_COUNT, BigDecimal b6_NO_BANK_COUNT, BigDecimal b7_NO_BANK_COUNT,
			BigDecimal b8_NO_BANK_COUNT, BigDecimal b9_NO_BANK_COUNT, BigDecimal b10_NO_BANK_COUNT,
			BigDecimal b11_NO_BANK_COUNT, BigDecimal b12_NO_BANK_COUNT, BigDecimal b13_NO_BANK_COUNT,
			BigDecimal b14_NO_BANK_COUNT, BigDecimal b15_NO_BANK_COUNT, BigDecimal b16_NO_BANK_COUNT,
			BigDecimal b17_NO_BANK_COUNT, BigDecimal b18_NO_BANK_COUNT, BigDecimal c1_BANK_GRADED,
			BigDecimal c2_BANK_GRADED, BigDecimal c3_BANK_GRADED, BigDecimal c4_BANK_GRADED, BigDecimal c5_BANK_GRADED,
			BigDecimal c6_BANK_GRADED, BigDecimal c7_BANK_GRADED, BigDecimal c8_BANK_GRADED, BigDecimal c9_BANK_GRADED,
			BigDecimal c10_BANK_GRADED, BigDecimal c11_BANK_GRADED, BigDecimal c12_BANK_GRADED,
			BigDecimal c13_BANK_GRADED, BigDecimal c14_BANK_GRADED, BigDecimal c15_BANK_GRADED,
			BigDecimal c16_BANK_GRADED, BigDecimal c17_BANK_GRADED, BigDecimal c18_BANK_GRADED,
			BigDecimal d1_BANK_SUB_COUNT, BigDecimal d2_BANK_SUB_COUNT, BigDecimal d3_BANK_SUB_COUNT,
			BigDecimal d4_BANK_SUB_COUNT, BigDecimal d5_BANK_SUB_COUNT, BigDecimal d6_BANK_SUB_COUNT,
			BigDecimal d7_BANK_SUB_COUNT, BigDecimal d8_BANK_SUB_COUNT, BigDecimal d9_BANK_SUB_COUNT,
			BigDecimal d10_BANK_SUB_COUNT, BigDecimal d11_BANK_SUB_COUNT, BigDecimal d12_BANK_SUB_COUNT,
			BigDecimal d13_BANK_SUB_COUNT, BigDecimal d14_BANK_SUB_COUNT, BigDecimal d15_BANK_SUB_COUNT,
			BigDecimal d16_BANK_SUB_COUNT, BigDecimal d17_BANK_SUB_COUNT, BigDecimal d18_BANK_SUB_COUNT,
			BigDecimal e1_BANK_SUB_GRADED, BigDecimal e2_BANK_SUB_GRADED, BigDecimal e3_BANK_SUB_GRADED,
			BigDecimal e4_BANK_SUB_GRADED, BigDecimal e5_BANK_SUB_GRADED, BigDecimal e6_BANK_SUB_GRADED,
			BigDecimal e7_BANK_SUB_GRADED, BigDecimal e8_BANK_SUB_GRADED, BigDecimal e9_BANK_SUB_GRADED,
			BigDecimal e10_BANK_SUB_GRADED, BigDecimal e11_BANK_SUB_GRADED, BigDecimal e12_BANK_SUB_GRADED,
			BigDecimal e13_BANK_SUB_GRADED, BigDecimal e14_BANK_SUB_GRADED, BigDecimal e15_BANK_SUB_GRADED,
			BigDecimal e16_BANK_SUB_GRADED, BigDecimal e17_BANK_SUB_GRADED, BigDecimal e18_BANK_SUB_GRADED,
			BigDecimal f1_BANK_JOINT_COUNT, BigDecimal f2_BANK_JOINT_COUNT, BigDecimal f3_BANK_JOINT_COUNT,
			BigDecimal f4_BANK_JOINT_COUNT, BigDecimal f5_BANK_JOINT_COUNT, BigDecimal f6_BANK_JOINT_COUNT,
			BigDecimal f7_BANK_JOINT_COUNT, BigDecimal f8_BANK_JOINT_COUNT, BigDecimal f9_BANK_JOINT_COUNT,
			BigDecimal f10_BANK_JOINT_COUNT, BigDecimal f11_BANK_JOINT_COUNT, BigDecimal f12_BANK_JOINT_COUNT,
			BigDecimal f13_BANK_JOINT_COUNT, BigDecimal f14_BANK_JOINT_COUNT, BigDecimal f15_BANK_JOINT_COUNT,
			BigDecimal f16_BANK_JOINT_COUNT, BigDecimal f17_BANK_JOINT_COUNT, BigDecimal f18_BANK_JOINT_COUNT,
			BigDecimal g1_BANK_JOINT_GRADED, BigDecimal g2_BANK_JOINT_GRADED, BigDecimal g3_BANK_JOINT_GRADED,
			BigDecimal g4_BANK_JOINT_GRADED, BigDecimal g5_BANK_JOINT_GRADED, BigDecimal g6_BANK_JOINT_GRADED,
			BigDecimal g7_BANK_JOINT_GRADED, BigDecimal g8_BANK_JOINT_GRADED, BigDecimal g9_BANK_JOINT_GRADED,
			BigDecimal g10_BANK_JOINT_GRADED, BigDecimal g11_BANK_JOINT_GRADED, BigDecimal g12_BANK_JOINT_GRADED,
			BigDecimal g13_BANK_JOINT_GRADED, BigDecimal g14_BANK_JOINT_GRADED, BigDecimal g15_BANK_JOINT_GRADED,
			BigDecimal g16_BANK_JOINT_GRADED, BigDecimal g17_BANK_JOINT_GRADED, BigDecimal g18_BANK_JOINT_GRADED,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE,
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
		A10_PRODUCT = a10_PRODUCT;
		A11_PRODUCT = a11_PRODUCT;
		A12_PRODUCT = a12_PRODUCT;
		A13_PRODUCT = a13_PRODUCT;
		A14_PRODUCT = a14_PRODUCT;
		A15_PRODUCT = a15_PRODUCT;
		A16_PRODUCT = a16_PRODUCT;
		A17_PRODUCT = a17_PRODUCT;
		A18_PRODUCT = a18_PRODUCT;
		B1_NO_BANK_COUNT = b1_NO_BANK_COUNT;
		B2_NO_BANK_COUNT = b2_NO_BANK_COUNT;
		B3_NO_BANK_COUNT = b3_NO_BANK_COUNT;
		B4_NO_BANK_COUNT = b4_NO_BANK_COUNT;
		B5_NO_BANK_COUNT = b5_NO_BANK_COUNT;
		B6_NO_BANK_COUNT = b6_NO_BANK_COUNT;
		B7_NO_BANK_COUNT = b7_NO_BANK_COUNT;
		B8_NO_BANK_COUNT = b8_NO_BANK_COUNT;
		B9_NO_BANK_COUNT = b9_NO_BANK_COUNT;
		B10_NO_BANK_COUNT = b10_NO_BANK_COUNT;
		B11_NO_BANK_COUNT = b11_NO_BANK_COUNT;
		B12_NO_BANK_COUNT = b12_NO_BANK_COUNT;
		B13_NO_BANK_COUNT = b13_NO_BANK_COUNT;
		B14_NO_BANK_COUNT = b14_NO_BANK_COUNT;
		B15_NO_BANK_COUNT = b15_NO_BANK_COUNT;
		B16_NO_BANK_COUNT = b16_NO_BANK_COUNT;
		B17_NO_BANK_COUNT = b17_NO_BANK_COUNT;
		B18_NO_BANK_COUNT = b18_NO_BANK_COUNT;
		C1_BANK_GRADED = c1_BANK_GRADED;
		C2_BANK_GRADED = c2_BANK_GRADED;
		C3_BANK_GRADED = c3_BANK_GRADED;
		C4_BANK_GRADED = c4_BANK_GRADED;
		C5_BANK_GRADED = c5_BANK_GRADED;
		C6_BANK_GRADED = c6_BANK_GRADED;
		C7_BANK_GRADED = c7_BANK_GRADED;
		C8_BANK_GRADED = c8_BANK_GRADED;
		C9_BANK_GRADED = c9_BANK_GRADED;
		C10_BANK_GRADED = c10_BANK_GRADED;
		C11_BANK_GRADED = c11_BANK_GRADED;
		C12_BANK_GRADED = c12_BANK_GRADED;
		C13_BANK_GRADED = c13_BANK_GRADED;
		C14_BANK_GRADED = c14_BANK_GRADED;
		C15_BANK_GRADED = c15_BANK_GRADED;
		C16_BANK_GRADED = c16_BANK_GRADED;
		C17_BANK_GRADED = c17_BANK_GRADED;
		C18_BANK_GRADED = c18_BANK_GRADED;
		D1_BANK_SUB_COUNT = d1_BANK_SUB_COUNT;
		D2_BANK_SUB_COUNT = d2_BANK_SUB_COUNT;
		D3_BANK_SUB_COUNT = d3_BANK_SUB_COUNT;
		D4_BANK_SUB_COUNT = d4_BANK_SUB_COUNT;
		D5_BANK_SUB_COUNT = d5_BANK_SUB_COUNT;
		D6_BANK_SUB_COUNT = d6_BANK_SUB_COUNT;
		D7_BANK_SUB_COUNT = d7_BANK_SUB_COUNT;
		D8_BANK_SUB_COUNT = d8_BANK_SUB_COUNT;
		D9_BANK_SUB_COUNT = d9_BANK_SUB_COUNT;
		D10_BANK_SUB_COUNT = d10_BANK_SUB_COUNT;
		D11_BANK_SUB_COUNT = d11_BANK_SUB_COUNT;
		D12_BANK_SUB_COUNT = d12_BANK_SUB_COUNT;
		D13_BANK_SUB_COUNT = d13_BANK_SUB_COUNT;
		D14_BANK_SUB_COUNT = d14_BANK_SUB_COUNT;
		D15_BANK_SUB_COUNT = d15_BANK_SUB_COUNT;
		D16_BANK_SUB_COUNT = d16_BANK_SUB_COUNT;
		D17_BANK_SUB_COUNT = d17_BANK_SUB_COUNT;
		D18_BANK_SUB_COUNT = d18_BANK_SUB_COUNT;
		E1_BANK_SUB_GRADED = e1_BANK_SUB_GRADED;
		E2_BANK_SUB_GRADED = e2_BANK_SUB_GRADED;
		E3_BANK_SUB_GRADED = e3_BANK_SUB_GRADED;
		E4_BANK_SUB_GRADED = e4_BANK_SUB_GRADED;
		E5_BANK_SUB_GRADED = e5_BANK_SUB_GRADED;
		E6_BANK_SUB_GRADED = e6_BANK_SUB_GRADED;
		E7_BANK_SUB_GRADED = e7_BANK_SUB_GRADED;
		E8_BANK_SUB_GRADED = e8_BANK_SUB_GRADED;
		E9_BANK_SUB_GRADED = e9_BANK_SUB_GRADED;
		E10_BANK_SUB_GRADED = e10_BANK_SUB_GRADED;
		E11_BANK_SUB_GRADED = e11_BANK_SUB_GRADED;
		E12_BANK_SUB_GRADED = e12_BANK_SUB_GRADED;
		E13_BANK_SUB_GRADED = e13_BANK_SUB_GRADED;
		E14_BANK_SUB_GRADED = e14_BANK_SUB_GRADED;
		E15_BANK_SUB_GRADED = e15_BANK_SUB_GRADED;
		E16_BANK_SUB_GRADED = e16_BANK_SUB_GRADED;
		E17_BANK_SUB_GRADED = e17_BANK_SUB_GRADED;
		E18_BANK_SUB_GRADED = e18_BANK_SUB_GRADED;
		F1_BANK_JOINT_COUNT = f1_BANK_JOINT_COUNT;
		F2_BANK_JOINT_COUNT = f2_BANK_JOINT_COUNT;
		F3_BANK_JOINT_COUNT = f3_BANK_JOINT_COUNT;
		F4_BANK_JOINT_COUNT = f4_BANK_JOINT_COUNT;
		F5_BANK_JOINT_COUNT = f5_BANK_JOINT_COUNT;
		F6_BANK_JOINT_COUNT = f6_BANK_JOINT_COUNT;
		F7_BANK_JOINT_COUNT = f7_BANK_JOINT_COUNT;
		F8_BANK_JOINT_COUNT = f8_BANK_JOINT_COUNT;
		F9_BANK_JOINT_COUNT = f9_BANK_JOINT_COUNT;
		F10_BANK_JOINT_COUNT = f10_BANK_JOINT_COUNT;
		F11_BANK_JOINT_COUNT = f11_BANK_JOINT_COUNT;
		F12_BANK_JOINT_COUNT = f12_BANK_JOINT_COUNT;
		F13_BANK_JOINT_COUNT = f13_BANK_JOINT_COUNT;
		F14_BANK_JOINT_COUNT = f14_BANK_JOINT_COUNT;
		F15_BANK_JOINT_COUNT = f15_BANK_JOINT_COUNT;
		F16_BANK_JOINT_COUNT = f16_BANK_JOINT_COUNT;
		F17_BANK_JOINT_COUNT = f17_BANK_JOINT_COUNT;
		F18_BANK_JOINT_COUNT = f18_BANK_JOINT_COUNT;
		G1_BANK_JOINT_GRADED = g1_BANK_JOINT_GRADED;
		G2_BANK_JOINT_GRADED = g2_BANK_JOINT_GRADED;
		G3_BANK_JOINT_GRADED = g3_BANK_JOINT_GRADED;
		G4_BANK_JOINT_GRADED = g4_BANK_JOINT_GRADED;
		G5_BANK_JOINT_GRADED = g5_BANK_JOINT_GRADED;
		G6_BANK_JOINT_GRADED = g6_BANK_JOINT_GRADED;
		G7_BANK_JOINT_GRADED = g7_BANK_JOINT_GRADED;
		G8_BANK_JOINT_GRADED = g8_BANK_JOINT_GRADED;
		G9_BANK_JOINT_GRADED = g9_BANK_JOINT_GRADED;
		G10_BANK_JOINT_GRADED = g10_BANK_JOINT_GRADED;
		G11_BANK_JOINT_GRADED = g11_BANK_JOINT_GRADED;
		G12_BANK_JOINT_GRADED = g12_BANK_JOINT_GRADED;
		G13_BANK_JOINT_GRADED = g13_BANK_JOINT_GRADED;
		G14_BANK_JOINT_GRADED = g14_BANK_JOINT_GRADED;
		G15_BANK_JOINT_GRADED = g15_BANK_JOINT_GRADED;
		G16_BANK_JOINT_GRADED = g16_BANK_JOINT_GRADED;
		G17_BANK_JOINT_GRADED = g17_BANK_JOINT_GRADED;
		G18_BANK_JOINT_GRADED = g18_BANK_JOINT_GRADED;
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
	public T28Report() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
