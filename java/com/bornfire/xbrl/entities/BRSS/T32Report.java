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
@Table(name ="T32_TRAN_PROFILE_WALKIN_CUSTOMER")
public class T32Report {

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
	private String	A19_PRODUCT;
	private BigDecimal	B1_LOW_COUNT;
	private BigDecimal	B2_LOW_COUNT;
	private BigDecimal	B3_LOW_COUNT;
	private BigDecimal	B4_LOW_COUNT;
	private BigDecimal	B5_LOW_COUNT;
	private BigDecimal	B6_LOW_COUNT;
	private BigDecimal	B7_LOW_COUNT;
	private BigDecimal	B8_LOW_COUNT;
	private BigDecimal	B9_LOW_COUNT;
	private BigDecimal	B10_LOW_COUNT;
	private BigDecimal	B11_LOW_COUNT;
	private BigDecimal	B12_LOW_COUNT;
	private BigDecimal	B13_LOW_COUNT;
	private BigDecimal	B14_LOW_COUNT;
	private BigDecimal	B15_LOW_COUNT;
	private BigDecimal	B16_LOW_COUNT;
	private BigDecimal	B17_LOW_COUNT;
	private BigDecimal	B18_LOW_COUNT;
	private BigDecimal	B19_LOW_COUNT;
	private BigDecimal	C1_LOW_AMOUNT;
	private BigDecimal	C2_LOW_AMOUNT;
	private BigDecimal	C3_LOW_AMOUNT;
	private BigDecimal	C4_LOW_AMOUNT;
	private BigDecimal	C5_LOW_AMOUNT;
	private BigDecimal	C6_LOW_AMOUNT;
	private BigDecimal	C7_LOW_AMOUNT;
	private BigDecimal	C8_LOW_AMOUNT;
	private BigDecimal	C9_LOW_AMOUNT;
	private BigDecimal	C10_LOW_AMOUNT;
	private BigDecimal	C11_LOW_AMOUNT;
	private BigDecimal	C12_LOW_AMOUNT;
	private BigDecimal	C13_LOW_AMOUNT;
	private BigDecimal	C14_LOW_AMOUNT;
	private BigDecimal	C15_LOW_AMOUNT;
	private BigDecimal	C16_LOW_AMOUNT;
	private BigDecimal	C17_LOW_AMOUNT;
	private BigDecimal	C18_LOW_AMOUNT;
	private BigDecimal	C19_LOW_AMOUNT;
	private BigDecimal	D1_MEDIUM_COUNT;
	private BigDecimal	D2_MEDIUM_COUNT;
	private BigDecimal	D3_MEDIUM_COUNT;
	private BigDecimal	D4_MEDIUM_COUNT;
	private BigDecimal	D5_MEDIUM_COUNT;
	private BigDecimal	D6_MEDIUM_COUNT;
	private BigDecimal	D7_MEDIUM_COUNT;
	private BigDecimal	D8_MEDIUM_COUNT;
	private BigDecimal	D9_MEDIUM_COUNT;
	private BigDecimal	D10_MEDIUM_COUNT;
	private BigDecimal	D11_MEDIUM_COUNT;
	private BigDecimal	D12_MEDIUM_COUNT;
	private BigDecimal	D13_MEDIUM_COUNT;
	private BigDecimal	D14_MEDIUM_COUNT;
	private BigDecimal	D15_MEDIUM_COUNT;
	private BigDecimal	D16_MEDIUM_COUNT;
	private BigDecimal	D17_MEDIUM_COUNT;
	private BigDecimal	D18_MEDIUM_COUNT;
	private BigDecimal	D19_MEDIUM_COUNT;
	private BigDecimal	E1_MEDIUM_AMOUNT;
	private BigDecimal	E2_MEDIUM_AMOUNT;
	private BigDecimal	E3_MEDIUM_AMOUNT;
	private BigDecimal	E4_MEDIUM_AMOUNT;
	private BigDecimal	E5_MEDIUM_AMOUNT;
	private BigDecimal	E6_MEDIUM_AMOUNT;
	private BigDecimal	E7_MEDIUM_AMOUNT;
	private BigDecimal	E8_MEDIUM_AMOUNT;
	private BigDecimal	E9_MEDIUM_AMOUNT;
	private BigDecimal	E10_MEDIUM_AMOUNT;
	private BigDecimal	E11_MEDIUM_AMOUNT;
	private BigDecimal	E12_MEDIUM_AMOUNT;
	private BigDecimal	E13_MEDIUM_AMOUNT;
	private BigDecimal	E14_MEDIUM_AMOUNT;
	private BigDecimal	E15_MEDIUM_AMOUNT;
	private BigDecimal	E16_MEDIUM_AMOUNT;
	private BigDecimal	E17_MEDIUM_AMOUNT;
	private BigDecimal	E18_MEDIUM_AMOUNT;
	private BigDecimal	E19_MEDIUM_AMOUNT;
	private BigDecimal	F1_HIGH_COUNT;
	private BigDecimal	F2_HIGH_COUNT;
	private BigDecimal	F3_HIGH_COUNT;
	private BigDecimal	F4_HIGH_COUNT;
	private BigDecimal	F5_HIGH_COUNT;
	private BigDecimal	F6_HIGH_COUNT;
	private BigDecimal	F7_HIGH_COUNT;
	private BigDecimal	F8_HIGH_COUNT;
	private BigDecimal	F9_HIGH_COUNT;
	private BigDecimal	F10_HIGH_COUNT;
	private BigDecimal	F11_HIGH_COUNT;
	private BigDecimal	F12_HIGH_COUNT;
	private BigDecimal	F13_HIGH_COUNT;
	private BigDecimal	F14_HIGH_COUNT;
	private BigDecimal	F15_HIGH_COUNT;
	private BigDecimal	F16_HIGH_COUNT;
	private BigDecimal	F17_HIGH_COUNT;
	private BigDecimal	F18_HIGH_COUNT;
	private BigDecimal	F19_HIGH_COUNT;
	private BigDecimal	G1_HIGH_AMOUNT;
	private BigDecimal	G2_HIGH_AMOUNT;
	private BigDecimal	G3_HIGH_AMOUNT;
	private BigDecimal	G4_HIGH_AMOUNT;
	private BigDecimal	G5_HIGH_AMOUNT;
	private BigDecimal	G6_HIGH_AMOUNT;
	private BigDecimal	G7_HIGH_AMOUNT;
	private BigDecimal	G8_HIGH_AMOUNT;
	private BigDecimal	G9_HIGH_AMOUNT;
	private BigDecimal	G10_HIGH_AMOUNT;
	private BigDecimal	G11_HIGH_AMOUNT;
	private BigDecimal	G12_HIGH_AMOUNT;
	private BigDecimal	G13_HIGH_AMOUNT;
	private BigDecimal	G14_HIGH_AMOUNT;
	private BigDecimal	G15_HIGH_AMOUNT;
	private BigDecimal	G16_HIGH_AMOUNT;
	private BigDecimal	G17_HIGH_AMOUNT;
	private BigDecimal	G18_HIGH_AMOUNT;
	private BigDecimal	G19_HIGH_AMOUNT;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private String	DEL_FLG;
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_SUER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	ENTRY_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	MODIFY_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	VERIFY_DATE;
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
	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}
	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}
	public BigDecimal getB1_LOW_COUNT() {
		return B1_LOW_COUNT;
	}
	public void setB1_LOW_COUNT(BigDecimal b1_LOW_COUNT) {
		B1_LOW_COUNT = b1_LOW_COUNT;
	}
	public BigDecimal getB2_LOW_COUNT() {
		return B2_LOW_COUNT;
	}
	public void setB2_LOW_COUNT(BigDecimal b2_LOW_COUNT) {
		B2_LOW_COUNT = b2_LOW_COUNT;
	}
	public BigDecimal getB3_LOW_COUNT() {
		return B3_LOW_COUNT;
	}
	public void setB3_LOW_COUNT(BigDecimal b3_LOW_COUNT) {
		B3_LOW_COUNT = b3_LOW_COUNT;
	}
	public BigDecimal getB4_LOW_COUNT() {
		return B4_LOW_COUNT;
	}
	public void setB4_LOW_COUNT(BigDecimal b4_LOW_COUNT) {
		B4_LOW_COUNT = b4_LOW_COUNT;
	}
	public BigDecimal getB5_LOW_COUNT() {
		return B5_LOW_COUNT;
	}
	public void setB5_LOW_COUNT(BigDecimal b5_LOW_COUNT) {
		B5_LOW_COUNT = b5_LOW_COUNT;
	}
	public BigDecimal getB6_LOW_COUNT() {
		return B6_LOW_COUNT;
	}
	public void setB6_LOW_COUNT(BigDecimal b6_LOW_COUNT) {
		B6_LOW_COUNT = b6_LOW_COUNT;
	}
	public BigDecimal getB7_LOW_COUNT() {
		return B7_LOW_COUNT;
	}
	public void setB7_LOW_COUNT(BigDecimal b7_LOW_COUNT) {
		B7_LOW_COUNT = b7_LOW_COUNT;
	}
	public BigDecimal getB8_LOW_COUNT() {
		return B8_LOW_COUNT;
	}
	public void setB8_LOW_COUNT(BigDecimal b8_LOW_COUNT) {
		B8_LOW_COUNT = b8_LOW_COUNT;
	}
	public BigDecimal getB9_LOW_COUNT() {
		return B9_LOW_COUNT;
	}
	public void setB9_LOW_COUNT(BigDecimal b9_LOW_COUNT) {
		B9_LOW_COUNT = b9_LOW_COUNT;
	}
	public BigDecimal getB10_LOW_COUNT() {
		return B10_LOW_COUNT;
	}
	public void setB10_LOW_COUNT(BigDecimal b10_LOW_COUNT) {
		B10_LOW_COUNT = b10_LOW_COUNT;
	}
	public BigDecimal getB11_LOW_COUNT() {
		return B11_LOW_COUNT;
	}
	public void setB11_LOW_COUNT(BigDecimal b11_LOW_COUNT) {
		B11_LOW_COUNT = b11_LOW_COUNT;
	}
	public BigDecimal getB12_LOW_COUNT() {
		return B12_LOW_COUNT;
	}
	public void setB12_LOW_COUNT(BigDecimal b12_LOW_COUNT) {
		B12_LOW_COUNT = b12_LOW_COUNT;
	}
	public BigDecimal getB13_LOW_COUNT() {
		return B13_LOW_COUNT;
	}
	public void setB13_LOW_COUNT(BigDecimal b13_LOW_COUNT) {
		B13_LOW_COUNT = b13_LOW_COUNT;
	}
	public BigDecimal getB14_LOW_COUNT() {
		return B14_LOW_COUNT;
	}
	public void setB14_LOW_COUNT(BigDecimal b14_LOW_COUNT) {
		B14_LOW_COUNT = b14_LOW_COUNT;
	}
	public BigDecimal getB15_LOW_COUNT() {
		return B15_LOW_COUNT;
	}
	public void setB15_LOW_COUNT(BigDecimal b15_LOW_COUNT) {
		B15_LOW_COUNT = b15_LOW_COUNT;
	}
	public BigDecimal getB16_LOW_COUNT() {
		return B16_LOW_COUNT;
	}
	public void setB16_LOW_COUNT(BigDecimal b16_LOW_COUNT) {
		B16_LOW_COUNT = b16_LOW_COUNT;
	}
	public BigDecimal getB17_LOW_COUNT() {
		return B17_LOW_COUNT;
	}
	public void setB17_LOW_COUNT(BigDecimal b17_LOW_COUNT) {
		B17_LOW_COUNT = b17_LOW_COUNT;
	}
	public BigDecimal getB18_LOW_COUNT() {
		return B18_LOW_COUNT;
	}
	public void setB18_LOW_COUNT(BigDecimal b18_LOW_COUNT) {
		B18_LOW_COUNT = b18_LOW_COUNT;
	}
	public BigDecimal getB19_LOW_COUNT() {
		return B19_LOW_COUNT;
	}
	public void setB19_LOW_COUNT(BigDecimal b19_LOW_COUNT) {
		B19_LOW_COUNT = b19_LOW_COUNT;
	}
	public BigDecimal getC1_LOW_AMOUNT() {
		return C1_LOW_AMOUNT;
	}
	public void setC1_LOW_AMOUNT(BigDecimal c1_LOW_AMOUNT) {
		C1_LOW_AMOUNT = c1_LOW_AMOUNT;
	}
	public BigDecimal getC2_LOW_AMOUNT() {
		return C2_LOW_AMOUNT;
	}
	public void setC2_LOW_AMOUNT(BigDecimal c2_LOW_AMOUNT) {
		C2_LOW_AMOUNT = c2_LOW_AMOUNT;
	}
	public BigDecimal getC3_LOW_AMOUNT() {
		return C3_LOW_AMOUNT;
	}
	public void setC3_LOW_AMOUNT(BigDecimal c3_LOW_AMOUNT) {
		C3_LOW_AMOUNT = c3_LOW_AMOUNT;
	}
	public BigDecimal getC4_LOW_AMOUNT() {
		return C4_LOW_AMOUNT;
	}
	public void setC4_LOW_AMOUNT(BigDecimal c4_LOW_AMOUNT) {
		C4_LOW_AMOUNT = c4_LOW_AMOUNT;
	}
	public BigDecimal getC5_LOW_AMOUNT() {
		return C5_LOW_AMOUNT;
	}
	public void setC5_LOW_AMOUNT(BigDecimal c5_LOW_AMOUNT) {
		C5_LOW_AMOUNT = c5_LOW_AMOUNT;
	}
	public BigDecimal getC6_LOW_AMOUNT() {
		return C6_LOW_AMOUNT;
	}
	public void setC6_LOW_AMOUNT(BigDecimal c6_LOW_AMOUNT) {
		C6_LOW_AMOUNT = c6_LOW_AMOUNT;
	}
	public BigDecimal getC7_LOW_AMOUNT() {
		return C7_LOW_AMOUNT;
	}
	public void setC7_LOW_AMOUNT(BigDecimal c7_LOW_AMOUNT) {
		C7_LOW_AMOUNT = c7_LOW_AMOUNT;
	}
	public BigDecimal getC8_LOW_AMOUNT() {
		return C8_LOW_AMOUNT;
	}
	public void setC8_LOW_AMOUNT(BigDecimal c8_LOW_AMOUNT) {
		C8_LOW_AMOUNT = c8_LOW_AMOUNT;
	}
	public BigDecimal getC9_LOW_AMOUNT() {
		return C9_LOW_AMOUNT;
	}
	public void setC9_LOW_AMOUNT(BigDecimal c9_LOW_AMOUNT) {
		C9_LOW_AMOUNT = c9_LOW_AMOUNT;
	}
	public BigDecimal getC10_LOW_AMOUNT() {
		return C10_LOW_AMOUNT;
	}
	public void setC10_LOW_AMOUNT(BigDecimal c10_LOW_AMOUNT) {
		C10_LOW_AMOUNT = c10_LOW_AMOUNT;
	}
	public BigDecimal getC11_LOW_AMOUNT() {
		return C11_LOW_AMOUNT;
	}
	public void setC11_LOW_AMOUNT(BigDecimal c11_LOW_AMOUNT) {
		C11_LOW_AMOUNT = c11_LOW_AMOUNT;
	}
	public BigDecimal getC12_LOW_AMOUNT() {
		return C12_LOW_AMOUNT;
	}
	public void setC12_LOW_AMOUNT(BigDecimal c12_LOW_AMOUNT) {
		C12_LOW_AMOUNT = c12_LOW_AMOUNT;
	}
	public BigDecimal getC13_LOW_AMOUNT() {
		return C13_LOW_AMOUNT;
	}
	public void setC13_LOW_AMOUNT(BigDecimal c13_LOW_AMOUNT) {
		C13_LOW_AMOUNT = c13_LOW_AMOUNT;
	}
	public BigDecimal getC14_LOW_AMOUNT() {
		return C14_LOW_AMOUNT;
	}
	public void setC14_LOW_AMOUNT(BigDecimal c14_LOW_AMOUNT) {
		C14_LOW_AMOUNT = c14_LOW_AMOUNT;
	}
	public BigDecimal getC15_LOW_AMOUNT() {
		return C15_LOW_AMOUNT;
	}
	public void setC15_LOW_AMOUNT(BigDecimal c15_LOW_AMOUNT) {
		C15_LOW_AMOUNT = c15_LOW_AMOUNT;
	}
	public BigDecimal getC16_LOW_AMOUNT() {
		return C16_LOW_AMOUNT;
	}
	public void setC16_LOW_AMOUNT(BigDecimal c16_LOW_AMOUNT) {
		C16_LOW_AMOUNT = c16_LOW_AMOUNT;
	}
	public BigDecimal getC17_LOW_AMOUNT() {
		return C17_LOW_AMOUNT;
	}
	public void setC17_LOW_AMOUNT(BigDecimal c17_LOW_AMOUNT) {
		C17_LOW_AMOUNT = c17_LOW_AMOUNT;
	}
	public BigDecimal getC18_LOW_AMOUNT() {
		return C18_LOW_AMOUNT;
	}
	public void setC18_LOW_AMOUNT(BigDecimal c18_LOW_AMOUNT) {
		C18_LOW_AMOUNT = c18_LOW_AMOUNT;
	}
	public BigDecimal getC19_LOW_AMOUNT() {
		return C19_LOW_AMOUNT;
	}
	public void setC19_LOW_AMOUNT(BigDecimal c19_LOW_AMOUNT) {
		C19_LOW_AMOUNT = c19_LOW_AMOUNT;
	}
	public BigDecimal getD1_MEDIUM_COUNT() {
		return D1_MEDIUM_COUNT;
	}
	public void setD1_MEDIUM_COUNT(BigDecimal d1_MEDIUM_COUNT) {
		D1_MEDIUM_COUNT = d1_MEDIUM_COUNT;
	}
	public BigDecimal getD2_MEDIUM_COUNT() {
		return D2_MEDIUM_COUNT;
	}
	public void setD2_MEDIUM_COUNT(BigDecimal d2_MEDIUM_COUNT) {
		D2_MEDIUM_COUNT = d2_MEDIUM_COUNT;
	}
	public BigDecimal getD3_MEDIUM_COUNT() {
		return D3_MEDIUM_COUNT;
	}
	public void setD3_MEDIUM_COUNT(BigDecimal d3_MEDIUM_COUNT) {
		D3_MEDIUM_COUNT = d3_MEDIUM_COUNT;
	}
	public BigDecimal getD4_MEDIUM_COUNT() {
		return D4_MEDIUM_COUNT;
	}
	public void setD4_MEDIUM_COUNT(BigDecimal d4_MEDIUM_COUNT) {
		D4_MEDIUM_COUNT = d4_MEDIUM_COUNT;
	}
	public BigDecimal getD5_MEDIUM_COUNT() {
		return D5_MEDIUM_COUNT;
	}
	public void setD5_MEDIUM_COUNT(BigDecimal d5_MEDIUM_COUNT) {
		D5_MEDIUM_COUNT = d5_MEDIUM_COUNT;
	}
	public BigDecimal getD6_MEDIUM_COUNT() {
		return D6_MEDIUM_COUNT;
	}
	public void setD6_MEDIUM_COUNT(BigDecimal d6_MEDIUM_COUNT) {
		D6_MEDIUM_COUNT = d6_MEDIUM_COUNT;
	}
	public BigDecimal getD7_MEDIUM_COUNT() {
		return D7_MEDIUM_COUNT;
	}
	public void setD7_MEDIUM_COUNT(BigDecimal d7_MEDIUM_COUNT) {
		D7_MEDIUM_COUNT = d7_MEDIUM_COUNT;
	}
	public BigDecimal getD8_MEDIUM_COUNT() {
		return D8_MEDIUM_COUNT;
	}
	public void setD8_MEDIUM_COUNT(BigDecimal d8_MEDIUM_COUNT) {
		D8_MEDIUM_COUNT = d8_MEDIUM_COUNT;
	}
	public BigDecimal getD9_MEDIUM_COUNT() {
		return D9_MEDIUM_COUNT;
	}
	public void setD9_MEDIUM_COUNT(BigDecimal d9_MEDIUM_COUNT) {
		D9_MEDIUM_COUNT = d9_MEDIUM_COUNT;
	}
	public BigDecimal getD10_MEDIUM_COUNT() {
		return D10_MEDIUM_COUNT;
	}
	public void setD10_MEDIUM_COUNT(BigDecimal d10_MEDIUM_COUNT) {
		D10_MEDIUM_COUNT = d10_MEDIUM_COUNT;
	}
	public BigDecimal getD11_MEDIUM_COUNT() {
		return D11_MEDIUM_COUNT;
	}
	public void setD11_MEDIUM_COUNT(BigDecimal d11_MEDIUM_COUNT) {
		D11_MEDIUM_COUNT = d11_MEDIUM_COUNT;
	}
	public BigDecimal getD12_MEDIUM_COUNT() {
		return D12_MEDIUM_COUNT;
	}
	public void setD12_MEDIUM_COUNT(BigDecimal d12_MEDIUM_COUNT) {
		D12_MEDIUM_COUNT = d12_MEDIUM_COUNT;
	}
	public BigDecimal getD13_MEDIUM_COUNT() {
		return D13_MEDIUM_COUNT;
	}
	public void setD13_MEDIUM_COUNT(BigDecimal d13_MEDIUM_COUNT) {
		D13_MEDIUM_COUNT = d13_MEDIUM_COUNT;
	}
	public BigDecimal getD14_MEDIUM_COUNT() {
		return D14_MEDIUM_COUNT;
	}
	public void setD14_MEDIUM_COUNT(BigDecimal d14_MEDIUM_COUNT) {
		D14_MEDIUM_COUNT = d14_MEDIUM_COUNT;
	}
	public BigDecimal getD15_MEDIUM_COUNT() {
		return D15_MEDIUM_COUNT;
	}
	public void setD15_MEDIUM_COUNT(BigDecimal d15_MEDIUM_COUNT) {
		D15_MEDIUM_COUNT = d15_MEDIUM_COUNT;
	}
	public BigDecimal getD16_MEDIUM_COUNT() {
		return D16_MEDIUM_COUNT;
	}
	public void setD16_MEDIUM_COUNT(BigDecimal d16_MEDIUM_COUNT) {
		D16_MEDIUM_COUNT = d16_MEDIUM_COUNT;
	}
	public BigDecimal getD17_MEDIUM_COUNT() {
		return D17_MEDIUM_COUNT;
	}
	public void setD17_MEDIUM_COUNT(BigDecimal d17_MEDIUM_COUNT) {
		D17_MEDIUM_COUNT = d17_MEDIUM_COUNT;
	}
	public BigDecimal getD18_MEDIUM_COUNT() {
		return D18_MEDIUM_COUNT;
	}
	public void setD18_MEDIUM_COUNT(BigDecimal d18_MEDIUM_COUNT) {
		D18_MEDIUM_COUNT = d18_MEDIUM_COUNT;
	}
	public BigDecimal getD19_MEDIUM_COUNT() {
		return D19_MEDIUM_COUNT;
	}
	public void setD19_MEDIUM_COUNT(BigDecimal d19_MEDIUM_COUNT) {
		D19_MEDIUM_COUNT = d19_MEDIUM_COUNT;
	}
	public BigDecimal getE1_MEDIUM_AMOUNT() {
		return E1_MEDIUM_AMOUNT;
	}
	public void setE1_MEDIUM_AMOUNT(BigDecimal e1_MEDIUM_AMOUNT) {
		E1_MEDIUM_AMOUNT = e1_MEDIUM_AMOUNT;
	}
	public BigDecimal getE2_MEDIUM_AMOUNT() {
		return E2_MEDIUM_AMOUNT;
	}
	public void setE2_MEDIUM_AMOUNT(BigDecimal e2_MEDIUM_AMOUNT) {
		E2_MEDIUM_AMOUNT = e2_MEDIUM_AMOUNT;
	}
	public BigDecimal getE3_MEDIUM_AMOUNT() {
		return E3_MEDIUM_AMOUNT;
	}
	public void setE3_MEDIUM_AMOUNT(BigDecimal e3_MEDIUM_AMOUNT) {
		E3_MEDIUM_AMOUNT = e3_MEDIUM_AMOUNT;
	}
	public BigDecimal getE4_MEDIUM_AMOUNT() {
		return E4_MEDIUM_AMOUNT;
	}
	public void setE4_MEDIUM_AMOUNT(BigDecimal e4_MEDIUM_AMOUNT) {
		E4_MEDIUM_AMOUNT = e4_MEDIUM_AMOUNT;
	}
	public BigDecimal getE5_MEDIUM_AMOUNT() {
		return E5_MEDIUM_AMOUNT;
	}
	public void setE5_MEDIUM_AMOUNT(BigDecimal e5_MEDIUM_AMOUNT) {
		E5_MEDIUM_AMOUNT = e5_MEDIUM_AMOUNT;
	}
	public BigDecimal getE6_MEDIUM_AMOUNT() {
		return E6_MEDIUM_AMOUNT;
	}
	public void setE6_MEDIUM_AMOUNT(BigDecimal e6_MEDIUM_AMOUNT) {
		E6_MEDIUM_AMOUNT = e6_MEDIUM_AMOUNT;
	}
	public BigDecimal getE7_MEDIUM_AMOUNT() {
		return E7_MEDIUM_AMOUNT;
	}
	public void setE7_MEDIUM_AMOUNT(BigDecimal e7_MEDIUM_AMOUNT) {
		E7_MEDIUM_AMOUNT = e7_MEDIUM_AMOUNT;
	}
	public BigDecimal getE8_MEDIUM_AMOUNT() {
		return E8_MEDIUM_AMOUNT;
	}
	public void setE8_MEDIUM_AMOUNT(BigDecimal e8_MEDIUM_AMOUNT) {
		E8_MEDIUM_AMOUNT = e8_MEDIUM_AMOUNT;
	}
	public BigDecimal getE9_MEDIUM_AMOUNT() {
		return E9_MEDIUM_AMOUNT;
	}
	public void setE9_MEDIUM_AMOUNT(BigDecimal e9_MEDIUM_AMOUNT) {
		E9_MEDIUM_AMOUNT = e9_MEDIUM_AMOUNT;
	}
	public BigDecimal getE10_MEDIUM_AMOUNT() {
		return E10_MEDIUM_AMOUNT;
	}
	public void setE10_MEDIUM_AMOUNT(BigDecimal e10_MEDIUM_AMOUNT) {
		E10_MEDIUM_AMOUNT = e10_MEDIUM_AMOUNT;
	}
	public BigDecimal getE11_MEDIUM_AMOUNT() {
		return E11_MEDIUM_AMOUNT;
	}
	public void setE11_MEDIUM_AMOUNT(BigDecimal e11_MEDIUM_AMOUNT) {
		E11_MEDIUM_AMOUNT = e11_MEDIUM_AMOUNT;
	}
	public BigDecimal getE12_MEDIUM_AMOUNT() {
		return E12_MEDIUM_AMOUNT;
	}
	public void setE12_MEDIUM_AMOUNT(BigDecimal e12_MEDIUM_AMOUNT) {
		E12_MEDIUM_AMOUNT = e12_MEDIUM_AMOUNT;
	}
	public BigDecimal getE13_MEDIUM_AMOUNT() {
		return E13_MEDIUM_AMOUNT;
	}
	public void setE13_MEDIUM_AMOUNT(BigDecimal e13_MEDIUM_AMOUNT) {
		E13_MEDIUM_AMOUNT = e13_MEDIUM_AMOUNT;
	}
	public BigDecimal getE14_MEDIUM_AMOUNT() {
		return E14_MEDIUM_AMOUNT;
	}
	public void setE14_MEDIUM_AMOUNT(BigDecimal e14_MEDIUM_AMOUNT) {
		E14_MEDIUM_AMOUNT = e14_MEDIUM_AMOUNT;
	}
	public BigDecimal getE15_MEDIUM_AMOUNT() {
		return E15_MEDIUM_AMOUNT;
	}
	public void setE15_MEDIUM_AMOUNT(BigDecimal e15_MEDIUM_AMOUNT) {
		E15_MEDIUM_AMOUNT = e15_MEDIUM_AMOUNT;
	}
	public BigDecimal getE16_MEDIUM_AMOUNT() {
		return E16_MEDIUM_AMOUNT;
	}
	public void setE16_MEDIUM_AMOUNT(BigDecimal e16_MEDIUM_AMOUNT) {
		E16_MEDIUM_AMOUNT = e16_MEDIUM_AMOUNT;
	}
	public BigDecimal getE17_MEDIUM_AMOUNT() {
		return E17_MEDIUM_AMOUNT;
	}
	public void setE17_MEDIUM_AMOUNT(BigDecimal e17_MEDIUM_AMOUNT) {
		E17_MEDIUM_AMOUNT = e17_MEDIUM_AMOUNT;
	}
	public BigDecimal getE18_MEDIUM_AMOUNT() {
		return E18_MEDIUM_AMOUNT;
	}
	public void setE18_MEDIUM_AMOUNT(BigDecimal e18_MEDIUM_AMOUNT) {
		E18_MEDIUM_AMOUNT = e18_MEDIUM_AMOUNT;
	}
	public BigDecimal getE19_MEDIUM_AMOUNT() {
		return E19_MEDIUM_AMOUNT;
	}
	public void setE19_MEDIUM_AMOUNT(BigDecimal e19_MEDIUM_AMOUNT) {
		E19_MEDIUM_AMOUNT = e19_MEDIUM_AMOUNT;
	}
	public BigDecimal getF1_HIGH_COUNT() {
		return F1_HIGH_COUNT;
	}
	public void setF1_HIGH_COUNT(BigDecimal f1_HIGH_COUNT) {
		F1_HIGH_COUNT = f1_HIGH_COUNT;
	}
	public BigDecimal getF2_HIGH_COUNT() {
		return F2_HIGH_COUNT;
	}
	public void setF2_HIGH_COUNT(BigDecimal f2_HIGH_COUNT) {
		F2_HIGH_COUNT = f2_HIGH_COUNT;
	}
	public BigDecimal getF3_HIGH_COUNT() {
		return F3_HIGH_COUNT;
	}
	public void setF3_HIGH_COUNT(BigDecimal f3_HIGH_COUNT) {
		F3_HIGH_COUNT = f3_HIGH_COUNT;
	}
	public BigDecimal getF4_HIGH_COUNT() {
		return F4_HIGH_COUNT;
	}
	public void setF4_HIGH_COUNT(BigDecimal f4_HIGH_COUNT) {
		F4_HIGH_COUNT = f4_HIGH_COUNT;
	}
	public BigDecimal getF5_HIGH_COUNT() {
		return F5_HIGH_COUNT;
	}
	public void setF5_HIGH_COUNT(BigDecimal f5_HIGH_COUNT) {
		F5_HIGH_COUNT = f5_HIGH_COUNT;
	}
	public BigDecimal getF6_HIGH_COUNT() {
		return F6_HIGH_COUNT;
	}
	public void setF6_HIGH_COUNT(BigDecimal f6_HIGH_COUNT) {
		F6_HIGH_COUNT = f6_HIGH_COUNT;
	}
	public BigDecimal getF7_HIGH_COUNT() {
		return F7_HIGH_COUNT;
	}
	public void setF7_HIGH_COUNT(BigDecimal f7_HIGH_COUNT) {
		F7_HIGH_COUNT = f7_HIGH_COUNT;
	}
	public BigDecimal getF8_HIGH_COUNT() {
		return F8_HIGH_COUNT;
	}
	public void setF8_HIGH_COUNT(BigDecimal f8_HIGH_COUNT) {
		F8_HIGH_COUNT = f8_HIGH_COUNT;
	}
	public BigDecimal getF9_HIGH_COUNT() {
		return F9_HIGH_COUNT;
	}
	public void setF9_HIGH_COUNT(BigDecimal f9_HIGH_COUNT) {
		F9_HIGH_COUNT = f9_HIGH_COUNT;
	}
	public BigDecimal getF10_HIGH_COUNT() {
		return F10_HIGH_COUNT;
	}
	public void setF10_HIGH_COUNT(BigDecimal f10_HIGH_COUNT) {
		F10_HIGH_COUNT = f10_HIGH_COUNT;
	}
	public BigDecimal getF11_HIGH_COUNT() {
		return F11_HIGH_COUNT;
	}
	public void setF11_HIGH_COUNT(BigDecimal f11_HIGH_COUNT) {
		F11_HIGH_COUNT = f11_HIGH_COUNT;
	}
	public BigDecimal getF12_HIGH_COUNT() {
		return F12_HIGH_COUNT;
	}
	public void setF12_HIGH_COUNT(BigDecimal f12_HIGH_COUNT) {
		F12_HIGH_COUNT = f12_HIGH_COUNT;
	}
	public BigDecimal getF13_HIGH_COUNT() {
		return F13_HIGH_COUNT;
	}
	public void setF13_HIGH_COUNT(BigDecimal f13_HIGH_COUNT) {
		F13_HIGH_COUNT = f13_HIGH_COUNT;
	}
	public BigDecimal getF14_HIGH_COUNT() {
		return F14_HIGH_COUNT;
	}
	public void setF14_HIGH_COUNT(BigDecimal f14_HIGH_COUNT) {
		F14_HIGH_COUNT = f14_HIGH_COUNT;
	}
	public BigDecimal getF15_HIGH_COUNT() {
		return F15_HIGH_COUNT;
	}
	public void setF15_HIGH_COUNT(BigDecimal f15_HIGH_COUNT) {
		F15_HIGH_COUNT = f15_HIGH_COUNT;
	}
	public BigDecimal getF16_HIGH_COUNT() {
		return F16_HIGH_COUNT;
	}
	public void setF16_HIGH_COUNT(BigDecimal f16_HIGH_COUNT) {
		F16_HIGH_COUNT = f16_HIGH_COUNT;
	}
	public BigDecimal getF17_HIGH_COUNT() {
		return F17_HIGH_COUNT;
	}
	public void setF17_HIGH_COUNT(BigDecimal f17_HIGH_COUNT) {
		F17_HIGH_COUNT = f17_HIGH_COUNT;
	}
	public BigDecimal getF18_HIGH_COUNT() {
		return F18_HIGH_COUNT;
	}
	public void setF18_HIGH_COUNT(BigDecimal f18_HIGH_COUNT) {
		F18_HIGH_COUNT = f18_HIGH_COUNT;
	}
	public BigDecimal getF19_HIGH_COUNT() {
		return F19_HIGH_COUNT;
	}
	public void setF19_HIGH_COUNT(BigDecimal f19_HIGH_COUNT) {
		F19_HIGH_COUNT = f19_HIGH_COUNT;
	}
	public BigDecimal getG1_HIGH_AMOUNT() {
		return G1_HIGH_AMOUNT;
	}
	public void setG1_HIGH_AMOUNT(BigDecimal g1_HIGH_AMOUNT) {
		G1_HIGH_AMOUNT = g1_HIGH_AMOUNT;
	}
	public BigDecimal getG2_HIGH_AMOUNT() {
		return G2_HIGH_AMOUNT;
	}
	public void setG2_HIGH_AMOUNT(BigDecimal g2_HIGH_AMOUNT) {
		G2_HIGH_AMOUNT = g2_HIGH_AMOUNT;
	}
	public BigDecimal getG3_HIGH_AMOUNT() {
		return G3_HIGH_AMOUNT;
	}
	public void setG3_HIGH_AMOUNT(BigDecimal g3_HIGH_AMOUNT) {
		G3_HIGH_AMOUNT = g3_HIGH_AMOUNT;
	}
	public BigDecimal getG4_HIGH_AMOUNT() {
		return G4_HIGH_AMOUNT;
	}
	public void setG4_HIGH_AMOUNT(BigDecimal g4_HIGH_AMOUNT) {
		G4_HIGH_AMOUNT = g4_HIGH_AMOUNT;
	}
	public BigDecimal getG5_HIGH_AMOUNT() {
		return G5_HIGH_AMOUNT;
	}
	public void setG5_HIGH_AMOUNT(BigDecimal g5_HIGH_AMOUNT) {
		G5_HIGH_AMOUNT = g5_HIGH_AMOUNT;
	}
	public BigDecimal getG6_HIGH_AMOUNT() {
		return G6_HIGH_AMOUNT;
	}
	public void setG6_HIGH_AMOUNT(BigDecimal g6_HIGH_AMOUNT) {
		G6_HIGH_AMOUNT = g6_HIGH_AMOUNT;
	}
	public BigDecimal getG7_HIGH_AMOUNT() {
		return G7_HIGH_AMOUNT;
	}
	public void setG7_HIGH_AMOUNT(BigDecimal g7_HIGH_AMOUNT) {
		G7_HIGH_AMOUNT = g7_HIGH_AMOUNT;
	}
	public BigDecimal getG8_HIGH_AMOUNT() {
		return G8_HIGH_AMOUNT;
	}
	public void setG8_HIGH_AMOUNT(BigDecimal g8_HIGH_AMOUNT) {
		G8_HIGH_AMOUNT = g8_HIGH_AMOUNT;
	}
	public BigDecimal getG9_HIGH_AMOUNT() {
		return G9_HIGH_AMOUNT;
	}
	public void setG9_HIGH_AMOUNT(BigDecimal g9_HIGH_AMOUNT) {
		G9_HIGH_AMOUNT = g9_HIGH_AMOUNT;
	}
	public BigDecimal getG10_HIGH_AMOUNT() {
		return G10_HIGH_AMOUNT;
	}
	public void setG10_HIGH_AMOUNT(BigDecimal g10_HIGH_AMOUNT) {
		G10_HIGH_AMOUNT = g10_HIGH_AMOUNT;
	}
	public BigDecimal getG11_HIGH_AMOUNT() {
		return G11_HIGH_AMOUNT;
	}
	public void setG11_HIGH_AMOUNT(BigDecimal g11_HIGH_AMOUNT) {
		G11_HIGH_AMOUNT = g11_HIGH_AMOUNT;
	}
	public BigDecimal getG12_HIGH_AMOUNT() {
		return G12_HIGH_AMOUNT;
	}
	public void setG12_HIGH_AMOUNT(BigDecimal g12_HIGH_AMOUNT) {
		G12_HIGH_AMOUNT = g12_HIGH_AMOUNT;
	}
	public BigDecimal getG13_HIGH_AMOUNT() {
		return G13_HIGH_AMOUNT;
	}
	public void setG13_HIGH_AMOUNT(BigDecimal g13_HIGH_AMOUNT) {
		G13_HIGH_AMOUNT = g13_HIGH_AMOUNT;
	}
	public BigDecimal getG14_HIGH_AMOUNT() {
		return G14_HIGH_AMOUNT;
	}
	public void setG14_HIGH_AMOUNT(BigDecimal g14_HIGH_AMOUNT) {
		G14_HIGH_AMOUNT = g14_HIGH_AMOUNT;
	}
	public BigDecimal getG15_HIGH_AMOUNT() {
		return G15_HIGH_AMOUNT;
	}
	public void setG15_HIGH_AMOUNT(BigDecimal g15_HIGH_AMOUNT) {
		G15_HIGH_AMOUNT = g15_HIGH_AMOUNT;
	}
	public BigDecimal getG16_HIGH_AMOUNT() {
		return G16_HIGH_AMOUNT;
	}
	public void setG16_HIGH_AMOUNT(BigDecimal g16_HIGH_AMOUNT) {
		G16_HIGH_AMOUNT = g16_HIGH_AMOUNT;
	}
	public BigDecimal getG17_HIGH_AMOUNT() {
		return G17_HIGH_AMOUNT;
	}
	public void setG17_HIGH_AMOUNT(BigDecimal g17_HIGH_AMOUNT) {
		G17_HIGH_AMOUNT = g17_HIGH_AMOUNT;
	}
	public BigDecimal getG18_HIGH_AMOUNT() {
		return G18_HIGH_AMOUNT;
	}
	public void setG18_HIGH_AMOUNT(BigDecimal g18_HIGH_AMOUNT) {
		G18_HIGH_AMOUNT = g18_HIGH_AMOUNT;
	}
	public BigDecimal getG19_HIGH_AMOUNT() {
		return G19_HIGH_AMOUNT;
	}
	public void setG19_HIGH_AMOUNT(BigDecimal g19_HIGH_AMOUNT) {
		G19_HIGH_AMOUNT = g19_HIGH_AMOUNT;
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
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
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
	public String getVERIFY_SUER() {
		return VERIFY_SUER;
	}
	public void setVERIFY_SUER(String vERIFY_SUER) {
		VERIFY_SUER = vERIFY_SUER;
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
	public T32Report(String a1_PRODUCT, String a2_PRODUCT, String a3_PRODUCT, String a4_PRODUCT, String a5_PRODUCT,
			String a6_PRODUCT, String a7_PRODUCT, String a8_PRODUCT, String a9_PRODUCT, String a10_PRODUCT,
			String a11_PRODUCT, String a12_PRODUCT, String a13_PRODUCT, String a14_PRODUCT, String a15_PRODUCT,
			String a16_PRODUCT, String a17_PRODUCT, String a18_PRODUCT, String a19_PRODUCT, BigDecimal b1_LOW_COUNT,
			BigDecimal b2_LOW_COUNT, BigDecimal b3_LOW_COUNT, BigDecimal b4_LOW_COUNT, BigDecimal b5_LOW_COUNT,
			BigDecimal b6_LOW_COUNT, BigDecimal b7_LOW_COUNT, BigDecimal b8_LOW_COUNT, BigDecimal b9_LOW_COUNT,
			BigDecimal b10_LOW_COUNT, BigDecimal b11_LOW_COUNT, BigDecimal b12_LOW_COUNT, BigDecimal b13_LOW_COUNT,
			BigDecimal b14_LOW_COUNT, BigDecimal b15_LOW_COUNT, BigDecimal b16_LOW_COUNT, BigDecimal b17_LOW_COUNT,
			BigDecimal b18_LOW_COUNT, BigDecimal b19_LOW_COUNT, BigDecimal c1_LOW_AMOUNT, BigDecimal c2_LOW_AMOUNT,
			BigDecimal c3_LOW_AMOUNT, BigDecimal c4_LOW_AMOUNT, BigDecimal c5_LOW_AMOUNT, BigDecimal c6_LOW_AMOUNT,
			BigDecimal c7_LOW_AMOUNT, BigDecimal c8_LOW_AMOUNT, BigDecimal c9_LOW_AMOUNT, BigDecimal c10_LOW_AMOUNT,
			BigDecimal c11_LOW_AMOUNT, BigDecimal c12_LOW_AMOUNT, BigDecimal c13_LOW_AMOUNT, BigDecimal c14_LOW_AMOUNT,
			BigDecimal c15_LOW_AMOUNT, BigDecimal c16_LOW_AMOUNT, BigDecimal c17_LOW_AMOUNT, BigDecimal c18_LOW_AMOUNT,
			BigDecimal c19_LOW_AMOUNT, BigDecimal d1_MEDIUM_COUNT, BigDecimal d2_MEDIUM_COUNT,
			BigDecimal d3_MEDIUM_COUNT, BigDecimal d4_MEDIUM_COUNT, BigDecimal d5_MEDIUM_COUNT,
			BigDecimal d6_MEDIUM_COUNT, BigDecimal d7_MEDIUM_COUNT, BigDecimal d8_MEDIUM_COUNT,
			BigDecimal d9_MEDIUM_COUNT, BigDecimal d10_MEDIUM_COUNT, BigDecimal d11_MEDIUM_COUNT,
			BigDecimal d12_MEDIUM_COUNT, BigDecimal d13_MEDIUM_COUNT, BigDecimal d14_MEDIUM_COUNT,
			BigDecimal d15_MEDIUM_COUNT, BigDecimal d16_MEDIUM_COUNT, BigDecimal d17_MEDIUM_COUNT,
			BigDecimal d18_MEDIUM_COUNT, BigDecimal d19_MEDIUM_COUNT, BigDecimal e1_MEDIUM_AMOUNT,
			BigDecimal e2_MEDIUM_AMOUNT, BigDecimal e3_MEDIUM_AMOUNT, BigDecimal e4_MEDIUM_AMOUNT,
			BigDecimal e5_MEDIUM_AMOUNT, BigDecimal e6_MEDIUM_AMOUNT, BigDecimal e7_MEDIUM_AMOUNT,
			BigDecimal e8_MEDIUM_AMOUNT, BigDecimal e9_MEDIUM_AMOUNT, BigDecimal e10_MEDIUM_AMOUNT,
			BigDecimal e11_MEDIUM_AMOUNT, BigDecimal e12_MEDIUM_AMOUNT, BigDecimal e13_MEDIUM_AMOUNT,
			BigDecimal e14_MEDIUM_AMOUNT, BigDecimal e15_MEDIUM_AMOUNT, BigDecimal e16_MEDIUM_AMOUNT,
			BigDecimal e17_MEDIUM_AMOUNT, BigDecimal e18_MEDIUM_AMOUNT, BigDecimal e19_MEDIUM_AMOUNT,
			BigDecimal f1_HIGH_COUNT, BigDecimal f2_HIGH_COUNT, BigDecimal f3_HIGH_COUNT, BigDecimal f4_HIGH_COUNT,
			BigDecimal f5_HIGH_COUNT, BigDecimal f6_HIGH_COUNT, BigDecimal f7_HIGH_COUNT, BigDecimal f8_HIGH_COUNT,
			BigDecimal f9_HIGH_COUNT, BigDecimal f10_HIGH_COUNT, BigDecimal f11_HIGH_COUNT, BigDecimal f12_HIGH_COUNT,
			BigDecimal f13_HIGH_COUNT, BigDecimal f14_HIGH_COUNT, BigDecimal f15_HIGH_COUNT, BigDecimal f16_HIGH_COUNT,
			BigDecimal f17_HIGH_COUNT, BigDecimal f18_HIGH_COUNT, BigDecimal f19_HIGH_COUNT, BigDecimal g1_HIGH_AMOUNT,
			BigDecimal g2_HIGH_AMOUNT, BigDecimal g3_HIGH_AMOUNT, BigDecimal g4_HIGH_AMOUNT, BigDecimal g5_HIGH_AMOUNT,
			BigDecimal g6_HIGH_AMOUNT, BigDecimal g7_HIGH_AMOUNT, BigDecimal g8_HIGH_AMOUNT, BigDecimal g9_HIGH_AMOUNT,
			BigDecimal g10_HIGH_AMOUNT, BigDecimal g11_HIGH_AMOUNT, BigDecimal g12_HIGH_AMOUNT,
			BigDecimal g13_HIGH_AMOUNT, BigDecimal g14_HIGH_AMOUNT, BigDecimal g15_HIGH_AMOUNT,
			BigDecimal g16_HIGH_AMOUNT, BigDecimal g17_HIGH_AMOUNT, BigDecimal g18_HIGH_AMOUNT,
			BigDecimal g19_HIGH_AMOUNT, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG, String dEL_FLG, String eNTITY_FLG, String mODIFY_FLG, String eNTRY_USER,
			String mODIFY_USER, String vERIFY_SUER, Date eNTRY_DATE, Date mODIFY_DATE, Date vERIFY_DATE) {
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
		A19_PRODUCT = a19_PRODUCT;
		B1_LOW_COUNT = b1_LOW_COUNT;
		B2_LOW_COUNT = b2_LOW_COUNT;
		B3_LOW_COUNT = b3_LOW_COUNT;
		B4_LOW_COUNT = b4_LOW_COUNT;
		B5_LOW_COUNT = b5_LOW_COUNT;
		B6_LOW_COUNT = b6_LOW_COUNT;
		B7_LOW_COUNT = b7_LOW_COUNT;
		B8_LOW_COUNT = b8_LOW_COUNT;
		B9_LOW_COUNT = b9_LOW_COUNT;
		B10_LOW_COUNT = b10_LOW_COUNT;
		B11_LOW_COUNT = b11_LOW_COUNT;
		B12_LOW_COUNT = b12_LOW_COUNT;
		B13_LOW_COUNT = b13_LOW_COUNT;
		B14_LOW_COUNT = b14_LOW_COUNT;
		B15_LOW_COUNT = b15_LOW_COUNT;
		B16_LOW_COUNT = b16_LOW_COUNT;
		B17_LOW_COUNT = b17_LOW_COUNT;
		B18_LOW_COUNT = b18_LOW_COUNT;
		B19_LOW_COUNT = b19_LOW_COUNT;
		C1_LOW_AMOUNT = c1_LOW_AMOUNT;
		C2_LOW_AMOUNT = c2_LOW_AMOUNT;
		C3_LOW_AMOUNT = c3_LOW_AMOUNT;
		C4_LOW_AMOUNT = c4_LOW_AMOUNT;
		C5_LOW_AMOUNT = c5_LOW_AMOUNT;
		C6_LOW_AMOUNT = c6_LOW_AMOUNT;
		C7_LOW_AMOUNT = c7_LOW_AMOUNT;
		C8_LOW_AMOUNT = c8_LOW_AMOUNT;
		C9_LOW_AMOUNT = c9_LOW_AMOUNT;
		C10_LOW_AMOUNT = c10_LOW_AMOUNT;
		C11_LOW_AMOUNT = c11_LOW_AMOUNT;
		C12_LOW_AMOUNT = c12_LOW_AMOUNT;
		C13_LOW_AMOUNT = c13_LOW_AMOUNT;
		C14_LOW_AMOUNT = c14_LOW_AMOUNT;
		C15_LOW_AMOUNT = c15_LOW_AMOUNT;
		C16_LOW_AMOUNT = c16_LOW_AMOUNT;
		C17_LOW_AMOUNT = c17_LOW_AMOUNT;
		C18_LOW_AMOUNT = c18_LOW_AMOUNT;
		C19_LOW_AMOUNT = c19_LOW_AMOUNT;
		D1_MEDIUM_COUNT = d1_MEDIUM_COUNT;
		D2_MEDIUM_COUNT = d2_MEDIUM_COUNT;
		D3_MEDIUM_COUNT = d3_MEDIUM_COUNT;
		D4_MEDIUM_COUNT = d4_MEDIUM_COUNT;
		D5_MEDIUM_COUNT = d5_MEDIUM_COUNT;
		D6_MEDIUM_COUNT = d6_MEDIUM_COUNT;
		D7_MEDIUM_COUNT = d7_MEDIUM_COUNT;
		D8_MEDIUM_COUNT = d8_MEDIUM_COUNT;
		D9_MEDIUM_COUNT = d9_MEDIUM_COUNT;
		D10_MEDIUM_COUNT = d10_MEDIUM_COUNT;
		D11_MEDIUM_COUNT = d11_MEDIUM_COUNT;
		D12_MEDIUM_COUNT = d12_MEDIUM_COUNT;
		D13_MEDIUM_COUNT = d13_MEDIUM_COUNT;
		D14_MEDIUM_COUNT = d14_MEDIUM_COUNT;
		D15_MEDIUM_COUNT = d15_MEDIUM_COUNT;
		D16_MEDIUM_COUNT = d16_MEDIUM_COUNT;
		D17_MEDIUM_COUNT = d17_MEDIUM_COUNT;
		D18_MEDIUM_COUNT = d18_MEDIUM_COUNT;
		D19_MEDIUM_COUNT = d19_MEDIUM_COUNT;
		E1_MEDIUM_AMOUNT = e1_MEDIUM_AMOUNT;
		E2_MEDIUM_AMOUNT = e2_MEDIUM_AMOUNT;
		E3_MEDIUM_AMOUNT = e3_MEDIUM_AMOUNT;
		E4_MEDIUM_AMOUNT = e4_MEDIUM_AMOUNT;
		E5_MEDIUM_AMOUNT = e5_MEDIUM_AMOUNT;
		E6_MEDIUM_AMOUNT = e6_MEDIUM_AMOUNT;
		E7_MEDIUM_AMOUNT = e7_MEDIUM_AMOUNT;
		E8_MEDIUM_AMOUNT = e8_MEDIUM_AMOUNT;
		E9_MEDIUM_AMOUNT = e9_MEDIUM_AMOUNT;
		E10_MEDIUM_AMOUNT = e10_MEDIUM_AMOUNT;
		E11_MEDIUM_AMOUNT = e11_MEDIUM_AMOUNT;
		E12_MEDIUM_AMOUNT = e12_MEDIUM_AMOUNT;
		E13_MEDIUM_AMOUNT = e13_MEDIUM_AMOUNT;
		E14_MEDIUM_AMOUNT = e14_MEDIUM_AMOUNT;
		E15_MEDIUM_AMOUNT = e15_MEDIUM_AMOUNT;
		E16_MEDIUM_AMOUNT = e16_MEDIUM_AMOUNT;
		E17_MEDIUM_AMOUNT = e17_MEDIUM_AMOUNT;
		E18_MEDIUM_AMOUNT = e18_MEDIUM_AMOUNT;
		E19_MEDIUM_AMOUNT = e19_MEDIUM_AMOUNT;
		F1_HIGH_COUNT = f1_HIGH_COUNT;
		F2_HIGH_COUNT = f2_HIGH_COUNT;
		F3_HIGH_COUNT = f3_HIGH_COUNT;
		F4_HIGH_COUNT = f4_HIGH_COUNT;
		F5_HIGH_COUNT = f5_HIGH_COUNT;
		F6_HIGH_COUNT = f6_HIGH_COUNT;
		F7_HIGH_COUNT = f7_HIGH_COUNT;
		F8_HIGH_COUNT = f8_HIGH_COUNT;
		F9_HIGH_COUNT = f9_HIGH_COUNT;
		F10_HIGH_COUNT = f10_HIGH_COUNT;
		F11_HIGH_COUNT = f11_HIGH_COUNT;
		F12_HIGH_COUNT = f12_HIGH_COUNT;
		F13_HIGH_COUNT = f13_HIGH_COUNT;
		F14_HIGH_COUNT = f14_HIGH_COUNT;
		F15_HIGH_COUNT = f15_HIGH_COUNT;
		F16_HIGH_COUNT = f16_HIGH_COUNT;
		F17_HIGH_COUNT = f17_HIGH_COUNT;
		F18_HIGH_COUNT = f18_HIGH_COUNT;
		F19_HIGH_COUNT = f19_HIGH_COUNT;
		G1_HIGH_AMOUNT = g1_HIGH_AMOUNT;
		G2_HIGH_AMOUNT = g2_HIGH_AMOUNT;
		G3_HIGH_AMOUNT = g3_HIGH_AMOUNT;
		G4_HIGH_AMOUNT = g4_HIGH_AMOUNT;
		G5_HIGH_AMOUNT = g5_HIGH_AMOUNT;
		G6_HIGH_AMOUNT = g6_HIGH_AMOUNT;
		G7_HIGH_AMOUNT = g7_HIGH_AMOUNT;
		G8_HIGH_AMOUNT = g8_HIGH_AMOUNT;
		G9_HIGH_AMOUNT = g9_HIGH_AMOUNT;
		G10_HIGH_AMOUNT = g10_HIGH_AMOUNT;
		G11_HIGH_AMOUNT = g11_HIGH_AMOUNT;
		G12_HIGH_AMOUNT = g12_HIGH_AMOUNT;
		G13_HIGH_AMOUNT = g13_HIGH_AMOUNT;
		G14_HIGH_AMOUNT = g14_HIGH_AMOUNT;
		G15_HIGH_AMOUNT = g15_HIGH_AMOUNT;
		G16_HIGH_AMOUNT = g16_HIGH_AMOUNT;
		G17_HIGH_AMOUNT = g17_HIGH_AMOUNT;
		G18_HIGH_AMOUNT = g18_HIGH_AMOUNT;
		G19_HIGH_AMOUNT = g19_HIGH_AMOUNT;
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
		DEL_FLG = dEL_FLG;
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_SUER = vERIFY_SUER;
		ENTRY_DATE = eNTRY_DATE;
		MODIFY_DATE = mODIFY_DATE;
		VERIFY_DATE = vERIFY_DATE;
	}
	public T32Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
