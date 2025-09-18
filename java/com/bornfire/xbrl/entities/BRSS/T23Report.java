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
@Table(name="T23_DISTRIBUTION_CHANNEL_TABLE")
public class T23Report {
	
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
	private BigDecimal	B1_CUST_COUNT;
	private BigDecimal	B2_CUST_COUNT;
	private BigDecimal	B3_CUST_COUNT;
	private BigDecimal	B4_CUST_COUNT;
	private BigDecimal	B5_CUST_COUNT;
	private BigDecimal	B6_CUST_COUNT;
	private BigDecimal	B7_CUST_COUNT;
	private BigDecimal	B8_CUST_COUNT;
	private BigDecimal	B9_CUST_COUNT;
	private BigDecimal	B10_CUST_COUNT;
	private BigDecimal	B11_CUST_COUNT;
	private BigDecimal	B12_CUST_COUNT;
	private BigDecimal	C1_TRAN_COUNT;
	private BigDecimal	C2_TRAN_COUNT;
	private BigDecimal	C3_TRAN_COUNT;
	private BigDecimal	C4_TRAN_COUNT;
	private BigDecimal	C5_TRAN_COUNT;
	private BigDecimal	C6_TRAN_COUNT;
	private BigDecimal	C7_TRAN_COUNT;
	private BigDecimal	C8_TRAN_COUNT;
	private BigDecimal	C9_TRAN_COUNT;
	private BigDecimal	C10_TRAN_COUNT;
	private BigDecimal	C11_TRAN_COUNT;
	private BigDecimal	C12_TRAN_COUNT;
	private BigDecimal	D1_TRAN_AMOUNT;
	private BigDecimal	D2_TRAN_AMOUNT;
	private BigDecimal	D3_TRAN_AMOUNT;
	private BigDecimal	D4_TRAN_AMOUNT;
	private BigDecimal	D5_TRAN_AMOUNT;
	private BigDecimal	D6_TRAN_AMOUNT;
	private BigDecimal	D7_TRAN_AMOUNT;
	private BigDecimal	D8_TRAN_AMOUNT;
	private BigDecimal	D9_TRAN_AMOUNT;
	private BigDecimal	D10_TRAN_AMOUNT;
	private BigDecimal	D11_TRAN_AMOUNT;
	private BigDecimal	D12_TRAN_AMOUNT;
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
	public BigDecimal getB1_CUST_COUNT() {
		return B1_CUST_COUNT;
	}
	public void setB1_CUST_COUNT(BigDecimal b1_CUST_COUNT) {
		B1_CUST_COUNT = b1_CUST_COUNT;
	}
	public BigDecimal getB2_CUST_COUNT() {
		return B2_CUST_COUNT;
	}
	public void setB2_CUST_COUNT(BigDecimal b2_CUST_COUNT) {
		B2_CUST_COUNT = b2_CUST_COUNT;
	}
	public BigDecimal getB3_CUST_COUNT() {
		return B3_CUST_COUNT;
	}
	public void setB3_CUST_COUNT(BigDecimal b3_CUST_COUNT) {
		B3_CUST_COUNT = b3_CUST_COUNT;
	}
	public BigDecimal getB4_CUST_COUNT() {
		return B4_CUST_COUNT;
	}
	public void setB4_CUST_COUNT(BigDecimal b4_CUST_COUNT) {
		B4_CUST_COUNT = b4_CUST_COUNT;
	}
	public BigDecimal getB5_CUST_COUNT() {
		return B5_CUST_COUNT;
	}
	public void setB5_CUST_COUNT(BigDecimal b5_CUST_COUNT) {
		B5_CUST_COUNT = b5_CUST_COUNT;
	}
	public BigDecimal getB6_CUST_COUNT() {
		return B6_CUST_COUNT;
	}
	public void setB6_CUST_COUNT(BigDecimal b6_CUST_COUNT) {
		B6_CUST_COUNT = b6_CUST_COUNT;
	}
	public BigDecimal getB7_CUST_COUNT() {
		return B7_CUST_COUNT;
	}
	public void setB7_CUST_COUNT(BigDecimal b7_CUST_COUNT) {
		B7_CUST_COUNT = b7_CUST_COUNT;
	}
	public BigDecimal getB8_CUST_COUNT() {
		return B8_CUST_COUNT;
	}
	public void setB8_CUST_COUNT(BigDecimal b8_CUST_COUNT) {
		B8_CUST_COUNT = b8_CUST_COUNT;
	}
	public BigDecimal getB9_CUST_COUNT() {
		return B9_CUST_COUNT;
	}
	public void setB9_CUST_COUNT(BigDecimal b9_CUST_COUNT) {
		B9_CUST_COUNT = b9_CUST_COUNT;
	}
	public BigDecimal getB10_CUST_COUNT() {
		return B10_CUST_COUNT;
	}
	public void setB10_CUST_COUNT(BigDecimal b10_CUST_COUNT) {
		B10_CUST_COUNT = b10_CUST_COUNT;
	}
	public BigDecimal getB11_CUST_COUNT() {
		return B11_CUST_COUNT;
	}
	public void setB11_CUST_COUNT(BigDecimal b11_CUST_COUNT) {
		B11_CUST_COUNT = b11_CUST_COUNT;
	}
	public BigDecimal getB12_CUST_COUNT() {
		return B12_CUST_COUNT;
	}
	public void setB12_CUST_COUNT(BigDecimal b12_CUST_COUNT) {
		B12_CUST_COUNT = b12_CUST_COUNT;
	}
	public BigDecimal getC1_TRAN_COUNT() {
		return C1_TRAN_COUNT;
	}
	public void setC1_TRAN_COUNT(BigDecimal c1_TRAN_COUNT) {
		C1_TRAN_COUNT = c1_TRAN_COUNT;
	}
	public BigDecimal getC2_TRAN_COUNT() {
		return C2_TRAN_COUNT;
	}
	public void setC2_TRAN_COUNT(BigDecimal c2_TRAN_COUNT) {
		C2_TRAN_COUNT = c2_TRAN_COUNT;
	}
	public BigDecimal getC3_TRAN_COUNT() {
		return C3_TRAN_COUNT;
	}
	public void setC3_TRAN_COUNT(BigDecimal c3_TRAN_COUNT) {
		C3_TRAN_COUNT = c3_TRAN_COUNT;
	}
	public BigDecimal getC4_TRAN_COUNT() {
		return C4_TRAN_COUNT;
	}
	public void setC4_TRAN_COUNT(BigDecimal c4_TRAN_COUNT) {
		C4_TRAN_COUNT = c4_TRAN_COUNT;
	}
	public BigDecimal getC5_TRAN_COUNT() {
		return C5_TRAN_COUNT;
	}
	public void setC5_TRAN_COUNT(BigDecimal c5_TRAN_COUNT) {
		C5_TRAN_COUNT = c5_TRAN_COUNT;
	}
	public BigDecimal getC6_TRAN_COUNT() {
		return C6_TRAN_COUNT;
	}
	public void setC6_TRAN_COUNT(BigDecimal c6_TRAN_COUNT) {
		C6_TRAN_COUNT = c6_TRAN_COUNT;
	}
	public BigDecimal getC7_TRAN_COUNT() {
		return C7_TRAN_COUNT;
	}
	public void setC7_TRAN_COUNT(BigDecimal c7_TRAN_COUNT) {
		C7_TRAN_COUNT = c7_TRAN_COUNT;
	}
	public BigDecimal getC8_TRAN_COUNT() {
		return C8_TRAN_COUNT;
	}
	public void setC8_TRAN_COUNT(BigDecimal c8_TRAN_COUNT) {
		C8_TRAN_COUNT = c8_TRAN_COUNT;
	}
	public BigDecimal getC9_TRAN_COUNT() {
		return C9_TRAN_COUNT;
	}
	public void setC9_TRAN_COUNT(BigDecimal c9_TRAN_COUNT) {
		C9_TRAN_COUNT = c9_TRAN_COUNT;
	}
	public BigDecimal getC10_TRAN_COUNT() {
		return C10_TRAN_COUNT;
	}
	public void setC10_TRAN_COUNT(BigDecimal c10_TRAN_COUNT) {
		C10_TRAN_COUNT = c10_TRAN_COUNT;
	}
	public BigDecimal getC11_TRAN_COUNT() {
		return C11_TRAN_COUNT;
	}
	public void setC11_TRAN_COUNT(BigDecimal c11_TRAN_COUNT) {
		C11_TRAN_COUNT = c11_TRAN_COUNT;
	}
	public BigDecimal getC12_TRAN_COUNT() {
		return C12_TRAN_COUNT;
	}
	public void setC12_TRAN_COUNT(BigDecimal c12_TRAN_COUNT) {
		C12_TRAN_COUNT = c12_TRAN_COUNT;
	}
	public BigDecimal getD1_TRAN_AMOUNT() {
		return D1_TRAN_AMOUNT;
	}
	public void setD1_TRAN_AMOUNT(BigDecimal d1_TRAN_AMOUNT) {
		D1_TRAN_AMOUNT = d1_TRAN_AMOUNT;
	}
	public BigDecimal getD2_TRAN_AMOUNT() {
		return D2_TRAN_AMOUNT;
	}
	public void setD2_TRAN_AMOUNT(BigDecimal d2_TRAN_AMOUNT) {
		D2_TRAN_AMOUNT = d2_TRAN_AMOUNT;
	}
	public BigDecimal getD3_TRAN_AMOUNT() {
		return D3_TRAN_AMOUNT;
	}
	public void setD3_TRAN_AMOUNT(BigDecimal d3_TRAN_AMOUNT) {
		D3_TRAN_AMOUNT = d3_TRAN_AMOUNT;
	}
	public BigDecimal getD4_TRAN_AMOUNT() {
		return D4_TRAN_AMOUNT;
	}
	public void setD4_TRAN_AMOUNT(BigDecimal d4_TRAN_AMOUNT) {
		D4_TRAN_AMOUNT = d4_TRAN_AMOUNT;
	}
	public BigDecimal getD5_TRAN_AMOUNT() {
		return D5_TRAN_AMOUNT;
	}
	public void setD5_TRAN_AMOUNT(BigDecimal d5_TRAN_AMOUNT) {
		D5_TRAN_AMOUNT = d5_TRAN_AMOUNT;
	}
	public BigDecimal getD6_TRAN_AMOUNT() {
		return D6_TRAN_AMOUNT;
	}
	public void setD6_TRAN_AMOUNT(BigDecimal d6_TRAN_AMOUNT) {
		D6_TRAN_AMOUNT = d6_TRAN_AMOUNT;
	}
	public BigDecimal getD7_TRAN_AMOUNT() {
		return D7_TRAN_AMOUNT;
	}
	public void setD7_TRAN_AMOUNT(BigDecimal d7_TRAN_AMOUNT) {
		D7_TRAN_AMOUNT = d7_TRAN_AMOUNT;
	}
	public BigDecimal getD8_TRAN_AMOUNT() {
		return D8_TRAN_AMOUNT;
	}
	public void setD8_TRAN_AMOUNT(BigDecimal d8_TRAN_AMOUNT) {
		D8_TRAN_AMOUNT = d8_TRAN_AMOUNT;
	}
	public BigDecimal getD9_TRAN_AMOUNT() {
		return D9_TRAN_AMOUNT;
	}
	public void setD9_TRAN_AMOUNT(BigDecimal d9_TRAN_AMOUNT) {
		D9_TRAN_AMOUNT = d9_TRAN_AMOUNT;
	}
	public BigDecimal getD10_TRAN_AMOUNT() {
		return D10_TRAN_AMOUNT;
	}
	public void setD10_TRAN_AMOUNT(BigDecimal d10_TRAN_AMOUNT) {
		D10_TRAN_AMOUNT = d10_TRAN_AMOUNT;
	}
	public BigDecimal getD11_TRAN_AMOUNT() {
		return D11_TRAN_AMOUNT;
	}
	public void setD11_TRAN_AMOUNT(BigDecimal d11_TRAN_AMOUNT) {
		D11_TRAN_AMOUNT = d11_TRAN_AMOUNT;
	}
	public BigDecimal getD12_TRAN_AMOUNT() {
		return D12_TRAN_AMOUNT;
	}
	public void setD12_TRAN_AMOUNT(BigDecimal d12_TRAN_AMOUNT) {
		D12_TRAN_AMOUNT = d12_TRAN_AMOUNT;
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
	public T23Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T23Report(String a1_PRODUCT, String a2_PRODUCT, String a3_PRODUCT, String a4_PRODUCT, String a5_PRODUCT,
			String a6_PRODUCT, String a7_PRODUCT, String a8_PRODUCT, String a9_PRODUCT, String a10_PRODUCT,
			String a11_PRODUCT, String a12_PRODUCT, BigDecimal b1_CUST_COUNT, BigDecimal b2_CUST_COUNT,
			BigDecimal b3_CUST_COUNT, BigDecimal b4_CUST_COUNT, BigDecimal b5_CUST_COUNT, BigDecimal b6_CUST_COUNT,
			BigDecimal b7_CUST_COUNT, BigDecimal b8_CUST_COUNT, BigDecimal b9_CUST_COUNT, BigDecimal b10_CUST_COUNT,
			BigDecimal b11_CUST_COUNT, BigDecimal b12_CUST_COUNT, BigDecimal c1_TRAN_COUNT, BigDecimal c2_TRAN_COUNT,
			BigDecimal c3_TRAN_COUNT, BigDecimal c4_TRAN_COUNT, BigDecimal c5_TRAN_COUNT, BigDecimal c6_TRAN_COUNT,
			BigDecimal c7_TRAN_COUNT, BigDecimal c8_TRAN_COUNT, BigDecimal c9_TRAN_COUNT, BigDecimal c10_TRAN_COUNT,
			BigDecimal c11_TRAN_COUNT, BigDecimal c12_TRAN_COUNT, BigDecimal d1_TRAN_AMOUNT, BigDecimal d2_TRAN_AMOUNT,
			BigDecimal d3_TRAN_AMOUNT, BigDecimal d4_TRAN_AMOUNT, BigDecimal d5_TRAN_AMOUNT, BigDecimal d6_TRAN_AMOUNT,
			BigDecimal d7_TRAN_AMOUNT, BigDecimal d8_TRAN_AMOUNT, BigDecimal d9_TRAN_AMOUNT, BigDecimal d10_TRAN_AMOUNT,
			BigDecimal d11_TRAN_AMOUNT, BigDecimal d12_TRAN_AMOUNT, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String mODIFY_FLG,
			String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE, Date vERIFY_DATE, String eNTRY_USER,
			String mODIFY_USER, String vERIFY_USER) {
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
		B1_CUST_COUNT = b1_CUST_COUNT;
		B2_CUST_COUNT = b2_CUST_COUNT;
		B3_CUST_COUNT = b3_CUST_COUNT;
		B4_CUST_COUNT = b4_CUST_COUNT;
		B5_CUST_COUNT = b5_CUST_COUNT;
		B6_CUST_COUNT = b6_CUST_COUNT;
		B7_CUST_COUNT = b7_CUST_COUNT;
		B8_CUST_COUNT = b8_CUST_COUNT;
		B9_CUST_COUNT = b9_CUST_COUNT;
		B10_CUST_COUNT = b10_CUST_COUNT;
		B11_CUST_COUNT = b11_CUST_COUNT;
		B12_CUST_COUNT = b12_CUST_COUNT;
		C1_TRAN_COUNT = c1_TRAN_COUNT;
		C2_TRAN_COUNT = c2_TRAN_COUNT;
		C3_TRAN_COUNT = c3_TRAN_COUNT;
		C4_TRAN_COUNT = c4_TRAN_COUNT;
		C5_TRAN_COUNT = c5_TRAN_COUNT;
		C6_TRAN_COUNT = c6_TRAN_COUNT;
		C7_TRAN_COUNT = c7_TRAN_COUNT;
		C8_TRAN_COUNT = c8_TRAN_COUNT;
		C9_TRAN_COUNT = c9_TRAN_COUNT;
		C10_TRAN_COUNT = c10_TRAN_COUNT;
		C11_TRAN_COUNT = c11_TRAN_COUNT;
		C12_TRAN_COUNT = c12_TRAN_COUNT;
		D1_TRAN_AMOUNT = d1_TRAN_AMOUNT;
		D2_TRAN_AMOUNT = d2_TRAN_AMOUNT;
		D3_TRAN_AMOUNT = d3_TRAN_AMOUNT;
		D4_TRAN_AMOUNT = d4_TRAN_AMOUNT;
		D5_TRAN_AMOUNT = d5_TRAN_AMOUNT;
		D6_TRAN_AMOUNT = d6_TRAN_AMOUNT;
		D7_TRAN_AMOUNT = d7_TRAN_AMOUNT;
		D8_TRAN_AMOUNT = d8_TRAN_AMOUNT;
		D9_TRAN_AMOUNT = d9_TRAN_AMOUNT;
		D10_TRAN_AMOUNT = d10_TRAN_AMOUNT;
		D11_TRAN_AMOUNT = d11_TRAN_AMOUNT;
		D12_TRAN_AMOUNT = d12_TRAN_AMOUNT;
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
 
	
}
