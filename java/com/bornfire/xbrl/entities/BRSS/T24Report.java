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
@Table(name="T24_TYPE_OF_HITS_TRANSACTIONAL")
public class T24Report {
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
	private BigDecimal	B1_NO_HITS;
	private BigDecimal	B2_NO_HITS;
	private BigDecimal	B3_NO_HITS;
	private BigDecimal	B4_NO_HITS;
	private BigDecimal	B5_NO_HITS;
	private BigDecimal	B6_NO_HITS;
	private BigDecimal	B7_NO_HITS;
	private BigDecimal	B8_NO_HITS;
	private BigDecimal	B9_NO_HITS;
	private BigDecimal	B10_NO_HITS;
	private BigDecimal	B11_NO_HITS;
	private BigDecimal	B12_NO_HITS;
	private BigDecimal	B13_NO_HITS;
	private BigDecimal	B14_NO_HITS;
	private BigDecimal	C1_POSITIVE_HITS;
	private BigDecimal	C2_POSITIVE_HITS;
	private BigDecimal	C3_POSITIVE_HITS;
	private BigDecimal	C4_POSITIVE_HITS;
	private BigDecimal	C5_POSITIVE_HITS;
	private BigDecimal	C6_POSITIVE_HITS;
	private BigDecimal	C7_POSITIVE_HITS;
	private BigDecimal	C8_POSITIVE_HITS;
	private BigDecimal	C9_POSITIVE_HITS;
	private BigDecimal	C10_POSITIVE_HITS;
	private BigDecimal	C11_POSITIVE_HITS;
	private BigDecimal	C12_POSITIVE_HITS;
	private BigDecimal	C13_POSITIVE_HITS;
	private BigDecimal	C14_POSITIVE_HITS;
	private BigDecimal	D1_POSITIVE_HITS_CLOSED;
	private BigDecimal	D2_POSITIVE_HITS_CLOSED;
	private BigDecimal	D3_POSITIVE_HITS_CLOSED;
	private BigDecimal	D4_POSITIVE_HITS_CLOSED;
	private BigDecimal	D5_POSITIVE_HITS_CLOSED;
	private BigDecimal	D6_POSITIVE_HITS_CLOSED;
	private BigDecimal	D7_POSITIVE_HITS_CLOSED;
	private BigDecimal	D8_POSITIVE_HITS_CLOSED;
	private BigDecimal	D9_POSITIVE_HITS_CLOSED;
	private BigDecimal	D10_POSITIVE_HITS_CLOSED;
	private BigDecimal	D11_POSITIVE_HITS_CLOSED;
	private BigDecimal	D12_POSITIVE_HITS_CLOSED;
	private BigDecimal	D13_POSITIVE_HITS_CLOSED;
	private BigDecimal	D14_POSITIVE_HITS_CLOSED;
	private BigDecimal	E1_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E2_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E3_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E4_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E5_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E6_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E7_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E8_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E9_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E10_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E11_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E12_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E13_INTERNAL_SUSPICION_HITS;
	private BigDecimal	E14_INTERNAL_SUSPICION_HITS;
	private BigDecimal	F1_NO_ALERTS;
	private BigDecimal	F2_NO_ALERTS;
	private BigDecimal	F3_NO_ALERTS;
	private BigDecimal	F4_NO_ALERTS;
	private BigDecimal	F5_NO_ALERTS;
	private BigDecimal	F6_NO_ALERTS;
	private BigDecimal	F7_NO_ALERTS;
	private BigDecimal	F8_NO_ALERTS;
	private BigDecimal	F9_NO_ALERTS;
	private BigDecimal	F10_NO_ALERTS;
	private BigDecimal	F11_NO_ALERTS;
	private BigDecimal	F12_NO_ALERTS;
	private BigDecimal	F13_NO_ALERTS;
	private BigDecimal	F14_NO_ALERTS;
	private BigDecimal	G1_ALERT_CLOSED;
	private BigDecimal	G2_ALERT_CLOSED;
	private BigDecimal	G3_ALERT_CLOSED;
	private BigDecimal	G4_ALERT_CLOSED;
	private BigDecimal	G5_ALERT_CLOSED;
	private BigDecimal	G6_ALERT_CLOSED;
	private BigDecimal	G7_ALERT_CLOSED;
	private BigDecimal	G8_ALERT_CLOSED;
	private BigDecimal	G9_ALERT_CLOSED;
	private BigDecimal	G10_ALERT_CLOSED;
	private BigDecimal	G11_ALERT_CLOSED;
	private BigDecimal	G12_ALERT_CLOSED;
	private BigDecimal	G13_ALERT_CLOSED;
	private BigDecimal	G14_ALERT_CLOSED;
	private String	H1_AVERAGE_TIME;
	private String	H2_AVERAGE_TIME;
	private String	H3_AVERAGE_TIME;
	private String	H4_AVERAGE_TIME;
	private String	H5_AVERAGE_TIME;
	private String	H6_AVERAGE_TIME;
	private String	H7_AVERAGE_TIME;
	private String	H8_AVERAGE_TIME;
	private String	H9_AVERAGE_TIME;
	private String	H10_AVERAGE_TIME;
	private String	H11_AVERAGE_TIME;
	private String	H12_AVERAGE_TIME;
	private String	H13_AVERAGE_TIME;
	private String	H14_AVERAGE_TIME;
	private BigDecimal	I1_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I2_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I3_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I4_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I5_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I6_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I7_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I8_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I9_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I10_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I11_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I12_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I13_INTERNAL_SUSPICION_ALERTS;
	private BigDecimal	I14_INTERNAL_SUSPICION_ALERTS;
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
	public BigDecimal getB1_NO_HITS() {
		return B1_NO_HITS;
	}
	public void setB1_NO_HITS(BigDecimal b1_NO_HITS) {
		B1_NO_HITS = b1_NO_HITS;
	}
	public BigDecimal getB2_NO_HITS() {
		return B2_NO_HITS;
	}
	public void setB2_NO_HITS(BigDecimal b2_NO_HITS) {
		B2_NO_HITS = b2_NO_HITS;
	}
	public BigDecimal getB3_NO_HITS() {
		return B3_NO_HITS;
	}
	public void setB3_NO_HITS(BigDecimal b3_NO_HITS) {
		B3_NO_HITS = b3_NO_HITS;
	}
	public BigDecimal getB4_NO_HITS() {
		return B4_NO_HITS;
	}
	public void setB4_NO_HITS(BigDecimal b4_NO_HITS) {
		B4_NO_HITS = b4_NO_HITS;
	}
	public BigDecimal getB5_NO_HITS() {
		return B5_NO_HITS;
	}
	public void setB5_NO_HITS(BigDecimal b5_NO_HITS) {
		B5_NO_HITS = b5_NO_HITS;
	}
	public BigDecimal getB6_NO_HITS() {
		return B6_NO_HITS;
	}
	public void setB6_NO_HITS(BigDecimal b6_NO_HITS) {
		B6_NO_HITS = b6_NO_HITS;
	}
	public BigDecimal getB7_NO_HITS() {
		return B7_NO_HITS;
	}
	public void setB7_NO_HITS(BigDecimal b7_NO_HITS) {
		B7_NO_HITS = b7_NO_HITS;
	}
	public BigDecimal getB8_NO_HITS() {
		return B8_NO_HITS;
	}
	public void setB8_NO_HITS(BigDecimal b8_NO_HITS) {
		B8_NO_HITS = b8_NO_HITS;
	}
	public BigDecimal getB9_NO_HITS() {
		return B9_NO_HITS;
	}
	public void setB9_NO_HITS(BigDecimal b9_NO_HITS) {
		B9_NO_HITS = b9_NO_HITS;
	}
	public BigDecimal getB10_NO_HITS() {
		return B10_NO_HITS;
	}
	public void setB10_NO_HITS(BigDecimal b10_NO_HITS) {
		B10_NO_HITS = b10_NO_HITS;
	}
	public BigDecimal getB11_NO_HITS() {
		return B11_NO_HITS;
	}
	public void setB11_NO_HITS(BigDecimal b11_NO_HITS) {
		B11_NO_HITS = b11_NO_HITS;
	}
	public BigDecimal getB12_NO_HITS() {
		return B12_NO_HITS;
	}
	public void setB12_NO_HITS(BigDecimal b12_NO_HITS) {
		B12_NO_HITS = b12_NO_HITS;
	}
	public BigDecimal getB13_NO_HITS() {
		return B13_NO_HITS;
	}
	public void setB13_NO_HITS(BigDecimal b13_NO_HITS) {
		B13_NO_HITS = b13_NO_HITS;
	}
	public BigDecimal getB14_NO_HITS() {
		return B14_NO_HITS;
	}
	public void setB14_NO_HITS(BigDecimal b14_NO_HITS) {
		B14_NO_HITS = b14_NO_HITS;
	}
	public BigDecimal getC1_POSITIVE_HITS() {
		return C1_POSITIVE_HITS;
	}
	public void setC1_POSITIVE_HITS(BigDecimal c1_POSITIVE_HITS) {
		C1_POSITIVE_HITS = c1_POSITIVE_HITS;
	}
	public BigDecimal getC2_POSITIVE_HITS() {
		return C2_POSITIVE_HITS;
	}
	public void setC2_POSITIVE_HITS(BigDecimal c2_POSITIVE_HITS) {
		C2_POSITIVE_HITS = c2_POSITIVE_HITS;
	}
	public BigDecimal getC3_POSITIVE_HITS() {
		return C3_POSITIVE_HITS;
	}
	public void setC3_POSITIVE_HITS(BigDecimal c3_POSITIVE_HITS) {
		C3_POSITIVE_HITS = c3_POSITIVE_HITS;
	}
	public BigDecimal getC4_POSITIVE_HITS() {
		return C4_POSITIVE_HITS;
	}
	public void setC4_POSITIVE_HITS(BigDecimal c4_POSITIVE_HITS) {
		C4_POSITIVE_HITS = c4_POSITIVE_HITS;
	}
	public BigDecimal getC5_POSITIVE_HITS() {
		return C5_POSITIVE_HITS;
	}
	public void setC5_POSITIVE_HITS(BigDecimal c5_POSITIVE_HITS) {
		C5_POSITIVE_HITS = c5_POSITIVE_HITS;
	}
	public BigDecimal getC6_POSITIVE_HITS() {
		return C6_POSITIVE_HITS;
	}
	public void setC6_POSITIVE_HITS(BigDecimal c6_POSITIVE_HITS) {
		C6_POSITIVE_HITS = c6_POSITIVE_HITS;
	}
	public BigDecimal getC7_POSITIVE_HITS() {
		return C7_POSITIVE_HITS;
	}
	public void setC7_POSITIVE_HITS(BigDecimal c7_POSITIVE_HITS) {
		C7_POSITIVE_HITS = c7_POSITIVE_HITS;
	}
	public BigDecimal getC8_POSITIVE_HITS() {
		return C8_POSITIVE_HITS;
	}
	public void setC8_POSITIVE_HITS(BigDecimal c8_POSITIVE_HITS) {
		C8_POSITIVE_HITS = c8_POSITIVE_HITS;
	}
	public BigDecimal getC9_POSITIVE_HITS() {
		return C9_POSITIVE_HITS;
	}
	public void setC9_POSITIVE_HITS(BigDecimal c9_POSITIVE_HITS) {
		C9_POSITIVE_HITS = c9_POSITIVE_HITS;
	}
	public BigDecimal getC10_POSITIVE_HITS() {
		return C10_POSITIVE_HITS;
	}
	public void setC10_POSITIVE_HITS(BigDecimal c10_POSITIVE_HITS) {
		C10_POSITIVE_HITS = c10_POSITIVE_HITS;
	}
	public BigDecimal getC11_POSITIVE_HITS() {
		return C11_POSITIVE_HITS;
	}
	public void setC11_POSITIVE_HITS(BigDecimal c11_POSITIVE_HITS) {
		C11_POSITIVE_HITS = c11_POSITIVE_HITS;
	}
	public BigDecimal getC12_POSITIVE_HITS() {
		return C12_POSITIVE_HITS;
	}
	public void setC12_POSITIVE_HITS(BigDecimal c12_POSITIVE_HITS) {
		C12_POSITIVE_HITS = c12_POSITIVE_HITS;
	}
	public BigDecimal getC13_POSITIVE_HITS() {
		return C13_POSITIVE_HITS;
	}
	public void setC13_POSITIVE_HITS(BigDecimal c13_POSITIVE_HITS) {
		C13_POSITIVE_HITS = c13_POSITIVE_HITS;
	}
	public BigDecimal getC14_POSITIVE_HITS() {
		return C14_POSITIVE_HITS;
	}
	public void setC14_POSITIVE_HITS(BigDecimal c14_POSITIVE_HITS) {
		C14_POSITIVE_HITS = c14_POSITIVE_HITS;
	}
	public BigDecimal getD1_POSITIVE_HITS_CLOSED() {
		return D1_POSITIVE_HITS_CLOSED;
	}
	public void setD1_POSITIVE_HITS_CLOSED(BigDecimal d1_POSITIVE_HITS_CLOSED) {
		D1_POSITIVE_HITS_CLOSED = d1_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD2_POSITIVE_HITS_CLOSED() {
		return D2_POSITIVE_HITS_CLOSED;
	}
	public void setD2_POSITIVE_HITS_CLOSED(BigDecimal d2_POSITIVE_HITS_CLOSED) {
		D2_POSITIVE_HITS_CLOSED = d2_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD3_POSITIVE_HITS_CLOSED() {
		return D3_POSITIVE_HITS_CLOSED;
	}
	public void setD3_POSITIVE_HITS_CLOSED(BigDecimal d3_POSITIVE_HITS_CLOSED) {
		D3_POSITIVE_HITS_CLOSED = d3_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD4_POSITIVE_HITS_CLOSED() {
		return D4_POSITIVE_HITS_CLOSED;
	}
	public void setD4_POSITIVE_HITS_CLOSED(BigDecimal d4_POSITIVE_HITS_CLOSED) {
		D4_POSITIVE_HITS_CLOSED = d4_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD5_POSITIVE_HITS_CLOSED() {
		return D5_POSITIVE_HITS_CLOSED;
	}
	public void setD5_POSITIVE_HITS_CLOSED(BigDecimal d5_POSITIVE_HITS_CLOSED) {
		D5_POSITIVE_HITS_CLOSED = d5_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD6_POSITIVE_HITS_CLOSED() {
		return D6_POSITIVE_HITS_CLOSED;
	}
	public void setD6_POSITIVE_HITS_CLOSED(BigDecimal d6_POSITIVE_HITS_CLOSED) {
		D6_POSITIVE_HITS_CLOSED = d6_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD7_POSITIVE_HITS_CLOSED() {
		return D7_POSITIVE_HITS_CLOSED;
	}
	public void setD7_POSITIVE_HITS_CLOSED(BigDecimal d7_POSITIVE_HITS_CLOSED) {
		D7_POSITIVE_HITS_CLOSED = d7_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD8_POSITIVE_HITS_CLOSED() {
		return D8_POSITIVE_HITS_CLOSED;
	}
	public void setD8_POSITIVE_HITS_CLOSED(BigDecimal d8_POSITIVE_HITS_CLOSED) {
		D8_POSITIVE_HITS_CLOSED = d8_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD9_POSITIVE_HITS_CLOSED() {
		return D9_POSITIVE_HITS_CLOSED;
	}
	public void setD9_POSITIVE_HITS_CLOSED(BigDecimal d9_POSITIVE_HITS_CLOSED) {
		D9_POSITIVE_HITS_CLOSED = d9_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD10_POSITIVE_HITS_CLOSED() {
		return D10_POSITIVE_HITS_CLOSED;
	}
	public void setD10_POSITIVE_HITS_CLOSED(BigDecimal d10_POSITIVE_HITS_CLOSED) {
		D10_POSITIVE_HITS_CLOSED = d10_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD11_POSITIVE_HITS_CLOSED() {
		return D11_POSITIVE_HITS_CLOSED;
	}
	public void setD11_POSITIVE_HITS_CLOSED(BigDecimal d11_POSITIVE_HITS_CLOSED) {
		D11_POSITIVE_HITS_CLOSED = d11_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD12_POSITIVE_HITS_CLOSED() {
		return D12_POSITIVE_HITS_CLOSED;
	}
	public void setD12_POSITIVE_HITS_CLOSED(BigDecimal d12_POSITIVE_HITS_CLOSED) {
		D12_POSITIVE_HITS_CLOSED = d12_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD13_POSITIVE_HITS_CLOSED() {
		return D13_POSITIVE_HITS_CLOSED;
	}
	public void setD13_POSITIVE_HITS_CLOSED(BigDecimal d13_POSITIVE_HITS_CLOSED) {
		D13_POSITIVE_HITS_CLOSED = d13_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getD14_POSITIVE_HITS_CLOSED() {
		return D14_POSITIVE_HITS_CLOSED;
	}
	public void setD14_POSITIVE_HITS_CLOSED(BigDecimal d14_POSITIVE_HITS_CLOSED) {
		D14_POSITIVE_HITS_CLOSED = d14_POSITIVE_HITS_CLOSED;
	}
	public BigDecimal getE1_INTERNAL_SUSPICION_HITS() {
		return E1_INTERNAL_SUSPICION_HITS;
	}
	public void setE1_INTERNAL_SUSPICION_HITS(BigDecimal e1_INTERNAL_SUSPICION_HITS) {
		E1_INTERNAL_SUSPICION_HITS = e1_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE2_INTERNAL_SUSPICION_HITS() {
		return E2_INTERNAL_SUSPICION_HITS;
	}
	public void setE2_INTERNAL_SUSPICION_HITS(BigDecimal e2_INTERNAL_SUSPICION_HITS) {
		E2_INTERNAL_SUSPICION_HITS = e2_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE3_INTERNAL_SUSPICION_HITS() {
		return E3_INTERNAL_SUSPICION_HITS;
	}
	public void setE3_INTERNAL_SUSPICION_HITS(BigDecimal e3_INTERNAL_SUSPICION_HITS) {
		E3_INTERNAL_SUSPICION_HITS = e3_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE4_INTERNAL_SUSPICION_HITS() {
		return E4_INTERNAL_SUSPICION_HITS;
	}
	public void setE4_INTERNAL_SUSPICION_HITS(BigDecimal e4_INTERNAL_SUSPICION_HITS) {
		E4_INTERNAL_SUSPICION_HITS = e4_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE5_INTERNAL_SUSPICION_HITS() {
		return E5_INTERNAL_SUSPICION_HITS;
	}
	public void setE5_INTERNAL_SUSPICION_HITS(BigDecimal e5_INTERNAL_SUSPICION_HITS) {
		E5_INTERNAL_SUSPICION_HITS = e5_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE6_INTERNAL_SUSPICION_HITS() {
		return E6_INTERNAL_SUSPICION_HITS;
	}
	public void setE6_INTERNAL_SUSPICION_HITS(BigDecimal e6_INTERNAL_SUSPICION_HITS) {
		E6_INTERNAL_SUSPICION_HITS = e6_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE7_INTERNAL_SUSPICION_HITS() {
		return E7_INTERNAL_SUSPICION_HITS;
	}
	public void setE7_INTERNAL_SUSPICION_HITS(BigDecimal e7_INTERNAL_SUSPICION_HITS) {
		E7_INTERNAL_SUSPICION_HITS = e7_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE8_INTERNAL_SUSPICION_HITS() {
		return E8_INTERNAL_SUSPICION_HITS;
	}
	public void setE8_INTERNAL_SUSPICION_HITS(BigDecimal e8_INTERNAL_SUSPICION_HITS) {
		E8_INTERNAL_SUSPICION_HITS = e8_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE9_INTERNAL_SUSPICION_HITS() {
		return E9_INTERNAL_SUSPICION_HITS;
	}
	public void setE9_INTERNAL_SUSPICION_HITS(BigDecimal e9_INTERNAL_SUSPICION_HITS) {
		E9_INTERNAL_SUSPICION_HITS = e9_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE10_INTERNAL_SUSPICION_HITS() {
		return E10_INTERNAL_SUSPICION_HITS;
	}
	public void setE10_INTERNAL_SUSPICION_HITS(BigDecimal e10_INTERNAL_SUSPICION_HITS) {
		E10_INTERNAL_SUSPICION_HITS = e10_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE11_INTERNAL_SUSPICION_HITS() {
		return E11_INTERNAL_SUSPICION_HITS;
	}
	public void setE11_INTERNAL_SUSPICION_HITS(BigDecimal e11_INTERNAL_SUSPICION_HITS) {
		E11_INTERNAL_SUSPICION_HITS = e11_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE12_INTERNAL_SUSPICION_HITS() {
		return E12_INTERNAL_SUSPICION_HITS;
	}
	public void setE12_INTERNAL_SUSPICION_HITS(BigDecimal e12_INTERNAL_SUSPICION_HITS) {
		E12_INTERNAL_SUSPICION_HITS = e12_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE13_INTERNAL_SUSPICION_HITS() {
		return E13_INTERNAL_SUSPICION_HITS;
	}
	public void setE13_INTERNAL_SUSPICION_HITS(BigDecimal e13_INTERNAL_SUSPICION_HITS) {
		E13_INTERNAL_SUSPICION_HITS = e13_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getE14_INTERNAL_SUSPICION_HITS() {
		return E14_INTERNAL_SUSPICION_HITS;
	}
	public void setE14_INTERNAL_SUSPICION_HITS(BigDecimal e14_INTERNAL_SUSPICION_HITS) {
		E14_INTERNAL_SUSPICION_HITS = e14_INTERNAL_SUSPICION_HITS;
	}
	public BigDecimal getF1_NO_ALERTS() {
		return F1_NO_ALERTS;
	}
	public void setF1_NO_ALERTS(BigDecimal f1_NO_ALERTS) {
		F1_NO_ALERTS = f1_NO_ALERTS;
	}
	public BigDecimal getF2_NO_ALERTS() {
		return F2_NO_ALERTS;
	}
	public void setF2_NO_ALERTS(BigDecimal f2_NO_ALERTS) {
		F2_NO_ALERTS = f2_NO_ALERTS;
	}
	public BigDecimal getF3_NO_ALERTS() {
		return F3_NO_ALERTS;
	}
	public void setF3_NO_ALERTS(BigDecimal f3_NO_ALERTS) {
		F3_NO_ALERTS = f3_NO_ALERTS;
	}
	public BigDecimal getF4_NO_ALERTS() {
		return F4_NO_ALERTS;
	}
	public void setF4_NO_ALERTS(BigDecimal f4_NO_ALERTS) {
		F4_NO_ALERTS = f4_NO_ALERTS;
	}
	public BigDecimal getF5_NO_ALERTS() {
		return F5_NO_ALERTS;
	}
	public void setF5_NO_ALERTS(BigDecimal f5_NO_ALERTS) {
		F5_NO_ALERTS = f5_NO_ALERTS;
	}
	public BigDecimal getF6_NO_ALERTS() {
		return F6_NO_ALERTS;
	}
	public void setF6_NO_ALERTS(BigDecimal f6_NO_ALERTS) {
		F6_NO_ALERTS = f6_NO_ALERTS;
	}
	public BigDecimal getF7_NO_ALERTS() {
		return F7_NO_ALERTS;
	}
	public void setF7_NO_ALERTS(BigDecimal f7_NO_ALERTS) {
		F7_NO_ALERTS = f7_NO_ALERTS;
	}
	public BigDecimal getF8_NO_ALERTS() {
		return F8_NO_ALERTS;
	}
	public void setF8_NO_ALERTS(BigDecimal f8_NO_ALERTS) {
		F8_NO_ALERTS = f8_NO_ALERTS;
	}
	public BigDecimal getF9_NO_ALERTS() {
		return F9_NO_ALERTS;
	}
	public void setF9_NO_ALERTS(BigDecimal f9_NO_ALERTS) {
		F9_NO_ALERTS = f9_NO_ALERTS;
	}
	public BigDecimal getF10_NO_ALERTS() {
		return F10_NO_ALERTS;
	}
	public void setF10_NO_ALERTS(BigDecimal f10_NO_ALERTS) {
		F10_NO_ALERTS = f10_NO_ALERTS;
	}
	public BigDecimal getF11_NO_ALERTS() {
		return F11_NO_ALERTS;
	}
	public void setF11_NO_ALERTS(BigDecimal f11_NO_ALERTS) {
		F11_NO_ALERTS = f11_NO_ALERTS;
	}
	public BigDecimal getF12_NO_ALERTS() {
		return F12_NO_ALERTS;
	}
	public void setF12_NO_ALERTS(BigDecimal f12_NO_ALERTS) {
		F12_NO_ALERTS = f12_NO_ALERTS;
	}
	public BigDecimal getF13_NO_ALERTS() {
		return F13_NO_ALERTS;
	}
	public void setF13_NO_ALERTS(BigDecimal f13_NO_ALERTS) {
		F13_NO_ALERTS = f13_NO_ALERTS;
	}
	public BigDecimal getF14_NO_ALERTS() {
		return F14_NO_ALERTS;
	}
	public void setF14_NO_ALERTS(BigDecimal f14_NO_ALERTS) {
		F14_NO_ALERTS = f14_NO_ALERTS;
	}
	public BigDecimal getG1_ALERT_CLOSED() {
		return G1_ALERT_CLOSED;
	}
	public void setG1_ALERT_CLOSED(BigDecimal g1_ALERT_CLOSED) {
		G1_ALERT_CLOSED = g1_ALERT_CLOSED;
	}
	public BigDecimal getG2_ALERT_CLOSED() {
		return G2_ALERT_CLOSED;
	}
	public void setG2_ALERT_CLOSED(BigDecimal g2_ALERT_CLOSED) {
		G2_ALERT_CLOSED = g2_ALERT_CLOSED;
	}
	public BigDecimal getG3_ALERT_CLOSED() {
		return G3_ALERT_CLOSED;
	}
	public void setG3_ALERT_CLOSED(BigDecimal g3_ALERT_CLOSED) {
		G3_ALERT_CLOSED = g3_ALERT_CLOSED;
	}
	public BigDecimal getG4_ALERT_CLOSED() {
		return G4_ALERT_CLOSED;
	}
	public void setG4_ALERT_CLOSED(BigDecimal g4_ALERT_CLOSED) {
		G4_ALERT_CLOSED = g4_ALERT_CLOSED;
	}
	public BigDecimal getG5_ALERT_CLOSED() {
		return G5_ALERT_CLOSED;
	}
	public void setG5_ALERT_CLOSED(BigDecimal g5_ALERT_CLOSED) {
		G5_ALERT_CLOSED = g5_ALERT_CLOSED;
	}
	public BigDecimal getG6_ALERT_CLOSED() {
		return G6_ALERT_CLOSED;
	}
	public void setG6_ALERT_CLOSED(BigDecimal g6_ALERT_CLOSED) {
		G6_ALERT_CLOSED = g6_ALERT_CLOSED;
	}
	public BigDecimal getG7_ALERT_CLOSED() {
		return G7_ALERT_CLOSED;
	}
	public void setG7_ALERT_CLOSED(BigDecimal g7_ALERT_CLOSED) {
		G7_ALERT_CLOSED = g7_ALERT_CLOSED;
	}
	public BigDecimal getG8_ALERT_CLOSED() {
		return G8_ALERT_CLOSED;
	}
	public void setG8_ALERT_CLOSED(BigDecimal g8_ALERT_CLOSED) {
		G8_ALERT_CLOSED = g8_ALERT_CLOSED;
	}
	public BigDecimal getG9_ALERT_CLOSED() {
		return G9_ALERT_CLOSED;
	}
	public void setG9_ALERT_CLOSED(BigDecimal g9_ALERT_CLOSED) {
		G9_ALERT_CLOSED = g9_ALERT_CLOSED;
	}
	public BigDecimal getG10_ALERT_CLOSED() {
		return G10_ALERT_CLOSED;
	}
	public void setG10_ALERT_CLOSED(BigDecimal g10_ALERT_CLOSED) {
		G10_ALERT_CLOSED = g10_ALERT_CLOSED;
	}
	public BigDecimal getG11_ALERT_CLOSED() {
		return G11_ALERT_CLOSED;
	}
	public void setG11_ALERT_CLOSED(BigDecimal g11_ALERT_CLOSED) {
		G11_ALERT_CLOSED = g11_ALERT_CLOSED;
	}
	public BigDecimal getG12_ALERT_CLOSED() {
		return G12_ALERT_CLOSED;
	}
	public void setG12_ALERT_CLOSED(BigDecimal g12_ALERT_CLOSED) {
		G12_ALERT_CLOSED = g12_ALERT_CLOSED;
	}
	public BigDecimal getG13_ALERT_CLOSED() {
		return G13_ALERT_CLOSED;
	}
	public void setG13_ALERT_CLOSED(BigDecimal g13_ALERT_CLOSED) {
		G13_ALERT_CLOSED = g13_ALERT_CLOSED;
	}
	public BigDecimal getG14_ALERT_CLOSED() {
		return G14_ALERT_CLOSED;
	}
	public void setG14_ALERT_CLOSED(BigDecimal g14_ALERT_CLOSED) {
		G14_ALERT_CLOSED = g14_ALERT_CLOSED;
	}
	public String getH1_AVERAGE_TIME() {
		return H1_AVERAGE_TIME;
	}
	public void setH1_AVERAGE_TIME(String h1_AVERAGE_TIME) {
		H1_AVERAGE_TIME = h1_AVERAGE_TIME;
	}
	public String getH2_AVERAGE_TIME() {
		return H2_AVERAGE_TIME;
	}
	public void setH2_AVERAGE_TIME(String h2_AVERAGE_TIME) {
		H2_AVERAGE_TIME = h2_AVERAGE_TIME;
	}
	public String getH3_AVERAGE_TIME() {
		return H3_AVERAGE_TIME;
	}
	public void setH3_AVERAGE_TIME(String h3_AVERAGE_TIME) {
		H3_AVERAGE_TIME = h3_AVERAGE_TIME;
	}
	public String getH4_AVERAGE_TIME() {
		return H4_AVERAGE_TIME;
	}
	public void setH4_AVERAGE_TIME(String h4_AVERAGE_TIME) {
		H4_AVERAGE_TIME = h4_AVERAGE_TIME;
	}
	public String getH5_AVERAGE_TIME() {
		return H5_AVERAGE_TIME;
	}
	public void setH5_AVERAGE_TIME(String h5_AVERAGE_TIME) {
		H5_AVERAGE_TIME = h5_AVERAGE_TIME;
	}
	public String getH6_AVERAGE_TIME() {
		return H6_AVERAGE_TIME;
	}
	public void setH6_AVERAGE_TIME(String h6_AVERAGE_TIME) {
		H6_AVERAGE_TIME = h6_AVERAGE_TIME;
	}
	public String getH7_AVERAGE_TIME() {
		return H7_AVERAGE_TIME;
	}
	public void setH7_AVERAGE_TIME(String h7_AVERAGE_TIME) {
		H7_AVERAGE_TIME = h7_AVERAGE_TIME;
	}
	public String getH8_AVERAGE_TIME() {
		return H8_AVERAGE_TIME;
	}
	public void setH8_AVERAGE_TIME(String h8_AVERAGE_TIME) {
		H8_AVERAGE_TIME = h8_AVERAGE_TIME;
	}
	public String getH9_AVERAGE_TIME() {
		return H9_AVERAGE_TIME;
	}
	public void setH9_AVERAGE_TIME(String h9_AVERAGE_TIME) {
		H9_AVERAGE_TIME = h9_AVERAGE_TIME;
	}
	public String getH10_AVERAGE_TIME() {
		return H10_AVERAGE_TIME;
	}
	public void setH10_AVERAGE_TIME(String h10_AVERAGE_TIME) {
		H10_AVERAGE_TIME = h10_AVERAGE_TIME;
	}
	public String getH11_AVERAGE_TIME() {
		return H11_AVERAGE_TIME;
	}
	public void setH11_AVERAGE_TIME(String h11_AVERAGE_TIME) {
		H11_AVERAGE_TIME = h11_AVERAGE_TIME;
	}
	public String getH12_AVERAGE_TIME() {
		return H12_AVERAGE_TIME;
	}
	public void setH12_AVERAGE_TIME(String h12_AVERAGE_TIME) {
		H12_AVERAGE_TIME = h12_AVERAGE_TIME;
	}
	public String getH13_AVERAGE_TIME() {
		return H13_AVERAGE_TIME;
	}
	public void setH13_AVERAGE_TIME(String h13_AVERAGE_TIME) {
		H13_AVERAGE_TIME = h13_AVERAGE_TIME;
	}
	public String getH14_AVERAGE_TIME() {
		return H14_AVERAGE_TIME;
	}
	public void setH14_AVERAGE_TIME(String h14_AVERAGE_TIME) {
		H14_AVERAGE_TIME = h14_AVERAGE_TIME;
	}
	public BigDecimal getI1_INTERNAL_SUSPICION_ALERTS() {
		return I1_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI1_INTERNAL_SUSPICION_ALERTS(BigDecimal i1_INTERNAL_SUSPICION_ALERTS) {
		I1_INTERNAL_SUSPICION_ALERTS = i1_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI2_INTERNAL_SUSPICION_ALERTS() {
		return I2_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI2_INTERNAL_SUSPICION_ALERTS(BigDecimal i2_INTERNAL_SUSPICION_ALERTS) {
		I2_INTERNAL_SUSPICION_ALERTS = i2_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI3_INTERNAL_SUSPICION_ALERTS() {
		return I3_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI3_INTERNAL_SUSPICION_ALERTS(BigDecimal i3_INTERNAL_SUSPICION_ALERTS) {
		I3_INTERNAL_SUSPICION_ALERTS = i3_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI4_INTERNAL_SUSPICION_ALERTS() {
		return I4_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI4_INTERNAL_SUSPICION_ALERTS(BigDecimal i4_INTERNAL_SUSPICION_ALERTS) {
		I4_INTERNAL_SUSPICION_ALERTS = i4_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI5_INTERNAL_SUSPICION_ALERTS() {
		return I5_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI5_INTERNAL_SUSPICION_ALERTS(BigDecimal i5_INTERNAL_SUSPICION_ALERTS) {
		I5_INTERNAL_SUSPICION_ALERTS = i5_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI6_INTERNAL_SUSPICION_ALERTS() {
		return I6_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI6_INTERNAL_SUSPICION_ALERTS(BigDecimal i6_INTERNAL_SUSPICION_ALERTS) {
		I6_INTERNAL_SUSPICION_ALERTS = i6_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI7_INTERNAL_SUSPICION_ALERTS() {
		return I7_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI7_INTERNAL_SUSPICION_ALERTS(BigDecimal i7_INTERNAL_SUSPICION_ALERTS) {
		I7_INTERNAL_SUSPICION_ALERTS = i7_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI8_INTERNAL_SUSPICION_ALERTS() {
		return I8_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI8_INTERNAL_SUSPICION_ALERTS(BigDecimal i8_INTERNAL_SUSPICION_ALERTS) {
		I8_INTERNAL_SUSPICION_ALERTS = i8_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI9_INTERNAL_SUSPICION_ALERTS() {
		return I9_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI9_INTERNAL_SUSPICION_ALERTS(BigDecimal i9_INTERNAL_SUSPICION_ALERTS) {
		I9_INTERNAL_SUSPICION_ALERTS = i9_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI10_INTERNAL_SUSPICION_ALERTS() {
		return I10_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI10_INTERNAL_SUSPICION_ALERTS(BigDecimal i10_INTERNAL_SUSPICION_ALERTS) {
		I10_INTERNAL_SUSPICION_ALERTS = i10_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI11_INTERNAL_SUSPICION_ALERTS() {
		return I11_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI11_INTERNAL_SUSPICION_ALERTS(BigDecimal i11_INTERNAL_SUSPICION_ALERTS) {
		I11_INTERNAL_SUSPICION_ALERTS = i11_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI12_INTERNAL_SUSPICION_ALERTS() {
		return I12_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI12_INTERNAL_SUSPICION_ALERTS(BigDecimal i12_INTERNAL_SUSPICION_ALERTS) {
		I12_INTERNAL_SUSPICION_ALERTS = i12_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI13_INTERNAL_SUSPICION_ALERTS() {
		return I13_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI13_INTERNAL_SUSPICION_ALERTS(BigDecimal i13_INTERNAL_SUSPICION_ALERTS) {
		I13_INTERNAL_SUSPICION_ALERTS = i13_INTERNAL_SUSPICION_ALERTS;
	}
	public BigDecimal getI14_INTERNAL_SUSPICION_ALERTS() {
		return I14_INTERNAL_SUSPICION_ALERTS;
	}
	public void setI14_INTERNAL_SUSPICION_ALERTS(BigDecimal i14_INTERNAL_SUSPICION_ALERTS) {
		I14_INTERNAL_SUSPICION_ALERTS = i14_INTERNAL_SUSPICION_ALERTS;
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
	public T24Report(String a1_PRODUCT, String a2_PRODUCT, String a3_PRODUCT, String a4_PRODUCT, String a5_PRODUCT,
			String a6_PRODUCT, String a7_PRODUCT, String a8_PRODUCT, String a9_PRODUCT, String a10_PRODUCT,
			String a11_PRODUCT, String a12_PRODUCT, String a13_PRODUCT, String a14_PRODUCT, BigDecimal b1_NO_HITS,
			BigDecimal b2_NO_HITS, BigDecimal b3_NO_HITS, BigDecimal b4_NO_HITS, BigDecimal b5_NO_HITS,
			BigDecimal b6_NO_HITS, BigDecimal b7_NO_HITS, BigDecimal b8_NO_HITS, BigDecimal b9_NO_HITS,
			BigDecimal b10_NO_HITS, BigDecimal b11_NO_HITS, BigDecimal b12_NO_HITS, BigDecimal b13_NO_HITS,
			BigDecimal b14_NO_HITS, BigDecimal c1_POSITIVE_HITS, BigDecimal c2_POSITIVE_HITS,
			BigDecimal c3_POSITIVE_HITS, BigDecimal c4_POSITIVE_HITS, BigDecimal c5_POSITIVE_HITS,
			BigDecimal c6_POSITIVE_HITS, BigDecimal c7_POSITIVE_HITS, BigDecimal c8_POSITIVE_HITS,
			BigDecimal c9_POSITIVE_HITS, BigDecimal c10_POSITIVE_HITS, BigDecimal c11_POSITIVE_HITS,
			BigDecimal c12_POSITIVE_HITS, BigDecimal c13_POSITIVE_HITS, BigDecimal c14_POSITIVE_HITS,
			BigDecimal d1_POSITIVE_HITS_CLOSED, BigDecimal d2_POSITIVE_HITS_CLOSED, BigDecimal d3_POSITIVE_HITS_CLOSED,
			BigDecimal d4_POSITIVE_HITS_CLOSED, BigDecimal d5_POSITIVE_HITS_CLOSED, BigDecimal d6_POSITIVE_HITS_CLOSED,
			BigDecimal d7_POSITIVE_HITS_CLOSED, BigDecimal d8_POSITIVE_HITS_CLOSED, BigDecimal d9_POSITIVE_HITS_CLOSED,
			BigDecimal d10_POSITIVE_HITS_CLOSED, BigDecimal d11_POSITIVE_HITS_CLOSED,
			BigDecimal d12_POSITIVE_HITS_CLOSED, BigDecimal d13_POSITIVE_HITS_CLOSED,
			BigDecimal d14_POSITIVE_HITS_CLOSED, BigDecimal e1_INTERNAL_SUSPICION_HITS,
			BigDecimal e2_INTERNAL_SUSPICION_HITS, BigDecimal e3_INTERNAL_SUSPICION_HITS,
			BigDecimal e4_INTERNAL_SUSPICION_HITS, BigDecimal e5_INTERNAL_SUSPICION_HITS,
			BigDecimal e6_INTERNAL_SUSPICION_HITS, BigDecimal e7_INTERNAL_SUSPICION_HITS,
			BigDecimal e8_INTERNAL_SUSPICION_HITS, BigDecimal e9_INTERNAL_SUSPICION_HITS,
			BigDecimal e10_INTERNAL_SUSPICION_HITS, BigDecimal e11_INTERNAL_SUSPICION_HITS,
			BigDecimal e12_INTERNAL_SUSPICION_HITS, BigDecimal e13_INTERNAL_SUSPICION_HITS,
			BigDecimal e14_INTERNAL_SUSPICION_HITS, BigDecimal f1_NO_ALERTS, BigDecimal f2_NO_ALERTS,
			BigDecimal f3_NO_ALERTS, BigDecimal f4_NO_ALERTS, BigDecimal f5_NO_ALERTS, BigDecimal f6_NO_ALERTS,
			BigDecimal f7_NO_ALERTS, BigDecimal f8_NO_ALERTS, BigDecimal f9_NO_ALERTS, BigDecimal f10_NO_ALERTS,
			BigDecimal f11_NO_ALERTS, BigDecimal f12_NO_ALERTS, BigDecimal f13_NO_ALERTS, BigDecimal f14_NO_ALERTS,
			BigDecimal g1_ALERT_CLOSED, BigDecimal g2_ALERT_CLOSED, BigDecimal g3_ALERT_CLOSED,
			BigDecimal g4_ALERT_CLOSED, BigDecimal g5_ALERT_CLOSED, BigDecimal g6_ALERT_CLOSED,
			BigDecimal g7_ALERT_CLOSED, BigDecimal g8_ALERT_CLOSED, BigDecimal g9_ALERT_CLOSED,
			BigDecimal g10_ALERT_CLOSED, BigDecimal g11_ALERT_CLOSED, BigDecimal g12_ALERT_CLOSED,
			BigDecimal g13_ALERT_CLOSED, BigDecimal g14_ALERT_CLOSED, String h1_AVERAGE_TIME, String h2_AVERAGE_TIME,
			String h3_AVERAGE_TIME, String h4_AVERAGE_TIME, String h5_AVERAGE_TIME, String h6_AVERAGE_TIME,
			String h7_AVERAGE_TIME, String h8_AVERAGE_TIME, String h9_AVERAGE_TIME, String h10_AVERAGE_TIME,
			String h11_AVERAGE_TIME, String h12_AVERAGE_TIME, String h13_AVERAGE_TIME, String h14_AVERAGE_TIME,
			BigDecimal i1_INTERNAL_SUSPICION_ALERTS, BigDecimal i2_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i3_INTERNAL_SUSPICION_ALERTS, BigDecimal i4_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i5_INTERNAL_SUSPICION_ALERTS, BigDecimal i6_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i7_INTERNAL_SUSPICION_ALERTS, BigDecimal i8_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i9_INTERNAL_SUSPICION_ALERTS, BigDecimal i10_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i11_INTERNAL_SUSPICION_ALERTS, BigDecimal i12_INTERNAL_SUSPICION_ALERTS,
			BigDecimal i13_INTERNAL_SUSPICION_ALERTS, BigDecimal i14_INTERNAL_SUSPICION_ALERTS, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG,
			String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE, Date vERIFY_DATE,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
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
		B1_NO_HITS = b1_NO_HITS;
		B2_NO_HITS = b2_NO_HITS;
		B3_NO_HITS = b3_NO_HITS;
		B4_NO_HITS = b4_NO_HITS;
		B5_NO_HITS = b5_NO_HITS;
		B6_NO_HITS = b6_NO_HITS;
		B7_NO_HITS = b7_NO_HITS;
		B8_NO_HITS = b8_NO_HITS;
		B9_NO_HITS = b9_NO_HITS;
		B10_NO_HITS = b10_NO_HITS;
		B11_NO_HITS = b11_NO_HITS;
		B12_NO_HITS = b12_NO_HITS;
		B13_NO_HITS = b13_NO_HITS;
		B14_NO_HITS = b14_NO_HITS;
		C1_POSITIVE_HITS = c1_POSITIVE_HITS;
		C2_POSITIVE_HITS = c2_POSITIVE_HITS;
		C3_POSITIVE_HITS = c3_POSITIVE_HITS;
		C4_POSITIVE_HITS = c4_POSITIVE_HITS;
		C5_POSITIVE_HITS = c5_POSITIVE_HITS;
		C6_POSITIVE_HITS = c6_POSITIVE_HITS;
		C7_POSITIVE_HITS = c7_POSITIVE_HITS;
		C8_POSITIVE_HITS = c8_POSITIVE_HITS;
		C9_POSITIVE_HITS = c9_POSITIVE_HITS;
		C10_POSITIVE_HITS = c10_POSITIVE_HITS;
		C11_POSITIVE_HITS = c11_POSITIVE_HITS;
		C12_POSITIVE_HITS = c12_POSITIVE_HITS;
		C13_POSITIVE_HITS = c13_POSITIVE_HITS;
		C14_POSITIVE_HITS = c14_POSITIVE_HITS;
		D1_POSITIVE_HITS_CLOSED = d1_POSITIVE_HITS_CLOSED;
		D2_POSITIVE_HITS_CLOSED = d2_POSITIVE_HITS_CLOSED;
		D3_POSITIVE_HITS_CLOSED = d3_POSITIVE_HITS_CLOSED;
		D4_POSITIVE_HITS_CLOSED = d4_POSITIVE_HITS_CLOSED;
		D5_POSITIVE_HITS_CLOSED = d5_POSITIVE_HITS_CLOSED;
		D6_POSITIVE_HITS_CLOSED = d6_POSITIVE_HITS_CLOSED;
		D7_POSITIVE_HITS_CLOSED = d7_POSITIVE_HITS_CLOSED;
		D8_POSITIVE_HITS_CLOSED = d8_POSITIVE_HITS_CLOSED;
		D9_POSITIVE_HITS_CLOSED = d9_POSITIVE_HITS_CLOSED;
		D10_POSITIVE_HITS_CLOSED = d10_POSITIVE_HITS_CLOSED;
		D11_POSITIVE_HITS_CLOSED = d11_POSITIVE_HITS_CLOSED;
		D12_POSITIVE_HITS_CLOSED = d12_POSITIVE_HITS_CLOSED;
		D13_POSITIVE_HITS_CLOSED = d13_POSITIVE_HITS_CLOSED;
		D14_POSITIVE_HITS_CLOSED = d14_POSITIVE_HITS_CLOSED;
		E1_INTERNAL_SUSPICION_HITS = e1_INTERNAL_SUSPICION_HITS;
		E2_INTERNAL_SUSPICION_HITS = e2_INTERNAL_SUSPICION_HITS;
		E3_INTERNAL_SUSPICION_HITS = e3_INTERNAL_SUSPICION_HITS;
		E4_INTERNAL_SUSPICION_HITS = e4_INTERNAL_SUSPICION_HITS;
		E5_INTERNAL_SUSPICION_HITS = e5_INTERNAL_SUSPICION_HITS;
		E6_INTERNAL_SUSPICION_HITS = e6_INTERNAL_SUSPICION_HITS;
		E7_INTERNAL_SUSPICION_HITS = e7_INTERNAL_SUSPICION_HITS;
		E8_INTERNAL_SUSPICION_HITS = e8_INTERNAL_SUSPICION_HITS;
		E9_INTERNAL_SUSPICION_HITS = e9_INTERNAL_SUSPICION_HITS;
		E10_INTERNAL_SUSPICION_HITS = e10_INTERNAL_SUSPICION_HITS;
		E11_INTERNAL_SUSPICION_HITS = e11_INTERNAL_SUSPICION_HITS;
		E12_INTERNAL_SUSPICION_HITS = e12_INTERNAL_SUSPICION_HITS;
		E13_INTERNAL_SUSPICION_HITS = e13_INTERNAL_SUSPICION_HITS;
		E14_INTERNAL_SUSPICION_HITS = e14_INTERNAL_SUSPICION_HITS;
		F1_NO_ALERTS = f1_NO_ALERTS;
		F2_NO_ALERTS = f2_NO_ALERTS;
		F3_NO_ALERTS = f3_NO_ALERTS;
		F4_NO_ALERTS = f4_NO_ALERTS;
		F5_NO_ALERTS = f5_NO_ALERTS;
		F6_NO_ALERTS = f6_NO_ALERTS;
		F7_NO_ALERTS = f7_NO_ALERTS;
		F8_NO_ALERTS = f8_NO_ALERTS;
		F9_NO_ALERTS = f9_NO_ALERTS;
		F10_NO_ALERTS = f10_NO_ALERTS;
		F11_NO_ALERTS = f11_NO_ALERTS;
		F12_NO_ALERTS = f12_NO_ALERTS;
		F13_NO_ALERTS = f13_NO_ALERTS;
		F14_NO_ALERTS = f14_NO_ALERTS;
		G1_ALERT_CLOSED = g1_ALERT_CLOSED;
		G2_ALERT_CLOSED = g2_ALERT_CLOSED;
		G3_ALERT_CLOSED = g3_ALERT_CLOSED;
		G4_ALERT_CLOSED = g4_ALERT_CLOSED;
		G5_ALERT_CLOSED = g5_ALERT_CLOSED;
		G6_ALERT_CLOSED = g6_ALERT_CLOSED;
		G7_ALERT_CLOSED = g7_ALERT_CLOSED;
		G8_ALERT_CLOSED = g8_ALERT_CLOSED;
		G9_ALERT_CLOSED = g9_ALERT_CLOSED;
		G10_ALERT_CLOSED = g10_ALERT_CLOSED;
		G11_ALERT_CLOSED = g11_ALERT_CLOSED;
		G12_ALERT_CLOSED = g12_ALERT_CLOSED;
		G13_ALERT_CLOSED = g13_ALERT_CLOSED;
		G14_ALERT_CLOSED = g14_ALERT_CLOSED;
		H1_AVERAGE_TIME = h1_AVERAGE_TIME;
		H2_AVERAGE_TIME = h2_AVERAGE_TIME;
		H3_AVERAGE_TIME = h3_AVERAGE_TIME;
		H4_AVERAGE_TIME = h4_AVERAGE_TIME;
		H5_AVERAGE_TIME = h5_AVERAGE_TIME;
		H6_AVERAGE_TIME = h6_AVERAGE_TIME;
		H7_AVERAGE_TIME = h7_AVERAGE_TIME;
		H8_AVERAGE_TIME = h8_AVERAGE_TIME;
		H9_AVERAGE_TIME = h9_AVERAGE_TIME;
		H10_AVERAGE_TIME = h10_AVERAGE_TIME;
		H11_AVERAGE_TIME = h11_AVERAGE_TIME;
		H12_AVERAGE_TIME = h12_AVERAGE_TIME;
		H13_AVERAGE_TIME = h13_AVERAGE_TIME;
		H14_AVERAGE_TIME = h14_AVERAGE_TIME;
		I1_INTERNAL_SUSPICION_ALERTS = i1_INTERNAL_SUSPICION_ALERTS;
		I2_INTERNAL_SUSPICION_ALERTS = i2_INTERNAL_SUSPICION_ALERTS;
		I3_INTERNAL_SUSPICION_ALERTS = i3_INTERNAL_SUSPICION_ALERTS;
		I4_INTERNAL_SUSPICION_ALERTS = i4_INTERNAL_SUSPICION_ALERTS;
		I5_INTERNAL_SUSPICION_ALERTS = i5_INTERNAL_SUSPICION_ALERTS;
		I6_INTERNAL_SUSPICION_ALERTS = i6_INTERNAL_SUSPICION_ALERTS;
		I7_INTERNAL_SUSPICION_ALERTS = i7_INTERNAL_SUSPICION_ALERTS;
		I8_INTERNAL_SUSPICION_ALERTS = i8_INTERNAL_SUSPICION_ALERTS;
		I9_INTERNAL_SUSPICION_ALERTS = i9_INTERNAL_SUSPICION_ALERTS;
		I10_INTERNAL_SUSPICION_ALERTS = i10_INTERNAL_SUSPICION_ALERTS;
		I11_INTERNAL_SUSPICION_ALERTS = i11_INTERNAL_SUSPICION_ALERTS;
		I12_INTERNAL_SUSPICION_ALERTS = i12_INTERNAL_SUSPICION_ALERTS;
		I13_INTERNAL_SUSPICION_ALERTS = i13_INTERNAL_SUSPICION_ALERTS;
		I14_INTERNAL_SUSPICION_ALERTS = i14_INTERNAL_SUSPICION_ALERTS;
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
	public T24Report() {
		super();
		// TODO Auto-generated constructor stub
	}

}
