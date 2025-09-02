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
@Table(name="T1_RL_RESTRUCTURED_LOAN_MOVEMENT")
public class T1_RLORReport {
	private String	A_SRL_NO;
	private String	A_PRODUCT;
	private BigDecimal	A_TOTAL_AMOUNT;
	private BigDecimal	A_SPECIFIC_PROVISIONS;
	private String	A1_SRL_NO;
	private String	A1_PRODUCT;
	private BigDecimal	A1_TOTAL_AMOUNT;
	private BigDecimal	A1_SPECIFIC_PROVISIONS;
	private String	A11_SRL_NO;
	private String	A11_PRODUCT;
	private BigDecimal	A11_TOTAL_AMOUNT;
	private BigDecimal	A11_SPECIFIC_PROVISIONS;
	private String	A2_SRL_NO;
	private String	A2_PRODUCT;
	private BigDecimal	A2_TOTAL_AMOUNT;
	private BigDecimal	A2_SPECIFIC_PROVISIONS;
	private String	A21_SRL_NO;
	private String	A21_PRODUCT;
	private BigDecimal	A21_TOTAL_AMOUNT;
	private BigDecimal	A21_SPECIFIC_PROVISIONS;
	private String	B1_SRL_NO;
	private String	B1_PRODUCT;
	private BigDecimal	B1_TOTAL_AMOUNT;
	private BigDecimal	B1_SPECIFIC_PROVISIONS;
	private String	B2_SRL_NO;
	private String	B2_PRODUCT;
	private BigDecimal	B2_TOTAL_AMOUNT;
	private BigDecimal	B2_SPECIFIC_PROVISIONS;
	private String	B3_SRL_NO;
	private String	B3_PRODUCT;
	private BigDecimal	B3_TOTAL_AMOUNT;
	private BigDecimal	B3_SPECIFIC_PROVISIONS;
	private String	B31_SRL_NO;
	private String	B31_PRODUCT;
	private BigDecimal	B31_TOTAL_AMOUNT;
	private BigDecimal	B31_SPECIFIC_PROVISIONS;
	private String	B4_SRL_NO;
	private String	B4_PRODUCT;
	private BigDecimal	B4_TOTAL_AMOUNT;
	private BigDecimal	B4_SPECIFIC_PROVISIONS;
	private String	B41_SRL_NO;
	private String	B41_PRODUCT;
	private BigDecimal	B41_TOTAL_AMOUNT;
	private BigDecimal	B41_SPECIFIC_PROVISIONS;
	private String	B42_SRL_NO;
	private String	B42_PRODUCT;
	private BigDecimal	B42_TOTAL_AMOUNT;
	private BigDecimal	B42_SPECIFIC_PROVISIONS;
	private String	B43_SRL_NO;
	private String	B43_PRODUCT;
	private BigDecimal	B43_TOTAL_AMOUNT;
	private BigDecimal	B43_SPECIFIC_PROVISIONS;
	private String	B45_SRL_NO;
	private String	B45_PRODUCT;
	private BigDecimal	B45_TOTAL_AMOUNT;
	private BigDecimal	B45_SPECIFIC_PROVISIONS;
	private String	B46_SRL_NO;
	private String	B46_PRODUCT;
	private BigDecimal	B46_TOTAL_AMOUNT;
	private BigDecimal	B46_SPECIFIC_PROVISIONS;
	private String	B5_SRL_NO;
	private String	B5_PRODUCT;
	private BigDecimal	B5_TOTAL_AMOUNT;
	private BigDecimal	B5_SPECIFIC_PROVISIONS;
	private String	C1_SRL_NO;
	private String	C1_PRODUCT;
	private BigDecimal	C1_TOTAL_AMOUNT;
	private BigDecimal	C1_SPECIFIC_PROVISIONS;
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
	private String	C2_SRL_NO;
	private String	C2_PRODUCT;
	private BigDecimal	C2_TOTAL_AMOUNT;
	private BigDecimal	C2_SPECIFIC_PROVISIONS;
	private String	C3_SRL_NO;
	private String	C3_PRODUCT;
	private BigDecimal	C3_TOTAL_AMOUNT;
	private BigDecimal	C3_SPECIFIC_PROVISIONS;

	public String getA_SRL_NO() {
		return A_SRL_NO;
	}
	public void setA_SRL_NO(String a_SRL_NO) {
		A_SRL_NO = a_SRL_NO;
	}
	public String getA_PRODUCT() {
		return A_PRODUCT;
	}
	public void setA_PRODUCT(String a_PRODUCT) {
		A_PRODUCT = a_PRODUCT;
	}
	public BigDecimal getA_TOTAL_AMOUNT() {
		return A_TOTAL_AMOUNT;
	}
	public void setA_TOTAL_AMOUNT(BigDecimal a_TOTAL_AMOUNT) {
		A_TOTAL_AMOUNT = a_TOTAL_AMOUNT;
	}
	public BigDecimal getA_SPECIFIC_PROVISIONS() {
		return A_SPECIFIC_PROVISIONS;
	}
	public void setA_SPECIFIC_PROVISIONS(BigDecimal a_SPECIFIC_PROVISIONS) {
		A_SPECIFIC_PROVISIONS = a_SPECIFIC_PROVISIONS;
	}
	public String getA1_SRL_NO() {
		return A1_SRL_NO;
	}
	public void setA1_SRL_NO(String a1_SRL_NO) {
		A1_SRL_NO = a1_SRL_NO;
	}
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_TOTAL_AMOUNT() {
		return A1_TOTAL_AMOUNT;
	}
	public void setA1_TOTAL_AMOUNT(BigDecimal a1_TOTAL_AMOUNT) {
		A1_TOTAL_AMOUNT = a1_TOTAL_AMOUNT;
	}
	public BigDecimal getA1_SPECIFIC_PROVISIONS() {
		return A1_SPECIFIC_PROVISIONS;
	}
	public void setA1_SPECIFIC_PROVISIONS(BigDecimal a1_SPECIFIC_PROVISIONS) {
		A1_SPECIFIC_PROVISIONS = a1_SPECIFIC_PROVISIONS;
	}
	public String getA11_SRL_NO() {
		return A11_SRL_NO;
	}
	public void setA11_SRL_NO(String a11_SRL_NO) {
		A11_SRL_NO = a11_SRL_NO;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_TOTAL_AMOUNT() {
		return A11_TOTAL_AMOUNT;
	}
	public void setA11_TOTAL_AMOUNT(BigDecimal a11_TOTAL_AMOUNT) {
		A11_TOTAL_AMOUNT = a11_TOTAL_AMOUNT;
	}
	public BigDecimal getA11_SPECIFIC_PROVISIONS() {
		return A11_SPECIFIC_PROVISIONS;
	}
	public void setA11_SPECIFIC_PROVISIONS(BigDecimal a11_SPECIFIC_PROVISIONS) {
		A11_SPECIFIC_PROVISIONS = a11_SPECIFIC_PROVISIONS;
	}
	public String getA2_SRL_NO() {
		return A2_SRL_NO;
	}
	public void setA2_SRL_NO(String a2_SRL_NO) {
		A2_SRL_NO = a2_SRL_NO;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_TOTAL_AMOUNT() {
		return A2_TOTAL_AMOUNT;
	}
	public void setA2_TOTAL_AMOUNT(BigDecimal a2_TOTAL_AMOUNT) {
		A2_TOTAL_AMOUNT = a2_TOTAL_AMOUNT;
	}
	public BigDecimal getA2_SPECIFIC_PROVISIONS() {
		return A2_SPECIFIC_PROVISIONS;
	}
	public void setA2_SPECIFIC_PROVISIONS(BigDecimal a2_SPECIFIC_PROVISIONS) {
		A2_SPECIFIC_PROVISIONS = a2_SPECIFIC_PROVISIONS;
	}
	public String getA21_SRL_NO() {
		return A21_SRL_NO;
	}
	public void setA21_SRL_NO(String a21_SRL_NO) {
		A21_SRL_NO = a21_SRL_NO;
	}
	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}
	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}
	public BigDecimal getA21_TOTAL_AMOUNT() {
		return A21_TOTAL_AMOUNT;
	}
	public void setA21_TOTAL_AMOUNT(BigDecimal a21_TOTAL_AMOUNT) {
		A21_TOTAL_AMOUNT = a21_TOTAL_AMOUNT;
	}
	public BigDecimal getA21_SPECIFIC_PROVISIONS() {
		return A21_SPECIFIC_PROVISIONS;
	}
	public void setA21_SPECIFIC_PROVISIONS(BigDecimal a21_SPECIFIC_PROVISIONS) {
		A21_SPECIFIC_PROVISIONS = a21_SPECIFIC_PROVISIONS;
	}
	public String getB1_SRL_NO() {
		return B1_SRL_NO;
	}
	public void setB1_SRL_NO(String b1_SRL_NO) {
		B1_SRL_NO = b1_SRL_NO;
	}
	public String getB1_PRODUCT() {
		return B1_PRODUCT;
	}
	public void setB1_PRODUCT(String b1_PRODUCT) {
		B1_PRODUCT = b1_PRODUCT;
	}
	public BigDecimal getB1_TOTAL_AMOUNT() {
		return B1_TOTAL_AMOUNT;
	}
	public void setB1_TOTAL_AMOUNT(BigDecimal b1_TOTAL_AMOUNT) {
		B1_TOTAL_AMOUNT = b1_TOTAL_AMOUNT;
	}
	public BigDecimal getB1_SPECIFIC_PROVISIONS() {
		return B1_SPECIFIC_PROVISIONS;
	}
	public void setB1_SPECIFIC_PROVISIONS(BigDecimal b1_SPECIFIC_PROVISIONS) {
		B1_SPECIFIC_PROVISIONS = b1_SPECIFIC_PROVISIONS;
	}
	public String getB2_SRL_NO() {
		return B2_SRL_NO;
	}
	public void setB2_SRL_NO(String b2_SRL_NO) {
		B2_SRL_NO = b2_SRL_NO;
	}
	public String getB2_PRODUCT() {
		return B2_PRODUCT;
	}
	public void setB2_PRODUCT(String b2_PRODUCT) {
		B2_PRODUCT = b2_PRODUCT;
	}
	public BigDecimal getB2_TOTAL_AMOUNT() {
		return B2_TOTAL_AMOUNT;
	}
	public void setB2_TOTAL_AMOUNT(BigDecimal b2_TOTAL_AMOUNT) {
		B2_TOTAL_AMOUNT = b2_TOTAL_AMOUNT;
	}
	public BigDecimal getB2_SPECIFIC_PROVISIONS() {
		return B2_SPECIFIC_PROVISIONS;
	}
	public void setB2_SPECIFIC_PROVISIONS(BigDecimal b2_SPECIFIC_PROVISIONS) {
		B2_SPECIFIC_PROVISIONS = b2_SPECIFIC_PROVISIONS;
	}
	public String getB3_SRL_NO() {
		return B3_SRL_NO;
	}
	public void setB3_SRL_NO(String b3_SRL_NO) {
		B3_SRL_NO = b3_SRL_NO;
	}
	public String getB3_PRODUCT() {
		return B3_PRODUCT;
	}
	public void setB3_PRODUCT(String b3_PRODUCT) {
		B3_PRODUCT = b3_PRODUCT;
	}
	public BigDecimal getB3_TOTAL_AMOUNT() {
		return B3_TOTAL_AMOUNT;
	}
	public void setB3_TOTAL_AMOUNT(BigDecimal b3_TOTAL_AMOUNT) {
		B3_TOTAL_AMOUNT = b3_TOTAL_AMOUNT;
	}
	public BigDecimal getB3_SPECIFIC_PROVISIONS() {
		return B3_SPECIFIC_PROVISIONS;
	}
	public void setB3_SPECIFIC_PROVISIONS(BigDecimal b3_SPECIFIC_PROVISIONS) {
		B3_SPECIFIC_PROVISIONS = b3_SPECIFIC_PROVISIONS;
	}
	public String getB31_SRL_NO() {
		return B31_SRL_NO;
	}
	public void setB31_SRL_NO(String b31_SRL_NO) {
		B31_SRL_NO = b31_SRL_NO;
	}
	public String getB31_PRODUCT() {
		return B31_PRODUCT;
	}
	public void setB31_PRODUCT(String b31_PRODUCT) {
		B31_PRODUCT = b31_PRODUCT;
	}
	public BigDecimal getB31_TOTAL_AMOUNT() {
		return B31_TOTAL_AMOUNT;
	}
	public void setB31_TOTAL_AMOUNT(BigDecimal b31_TOTAL_AMOUNT) {
		B31_TOTAL_AMOUNT = b31_TOTAL_AMOUNT;
	}
	public BigDecimal getB31_SPECIFIC_PROVISIONS() {
		return B31_SPECIFIC_PROVISIONS;
	}
	public void setB31_SPECIFIC_PROVISIONS(BigDecimal b31_SPECIFIC_PROVISIONS) {
		B31_SPECIFIC_PROVISIONS = b31_SPECIFIC_PROVISIONS;
	}
	public String getB4_SRL_NO() {
		return B4_SRL_NO;
	}
	public void setB4_SRL_NO(String b4_SRL_NO) {
		B4_SRL_NO = b4_SRL_NO;
	}
	public String getB4_PRODUCT() {
		return B4_PRODUCT;
	}
	public void setB4_PRODUCT(String b4_PRODUCT) {
		B4_PRODUCT = b4_PRODUCT;
	}
	public BigDecimal getB4_TOTAL_AMOUNT() {
		return B4_TOTAL_AMOUNT;
	}
	public void setB4_TOTAL_AMOUNT(BigDecimal b4_TOTAL_AMOUNT) {
		B4_TOTAL_AMOUNT = b4_TOTAL_AMOUNT;
	}
	public BigDecimal getB4_SPECIFIC_PROVISIONS() {
		return B4_SPECIFIC_PROVISIONS;
	}
	public void setB4_SPECIFIC_PROVISIONS(BigDecimal b4_SPECIFIC_PROVISIONS) {
		B4_SPECIFIC_PROVISIONS = b4_SPECIFIC_PROVISIONS;
	}
	public String getB41_SRL_NO() {
		return B41_SRL_NO;
	}
	public void setB41_SRL_NO(String b41_SRL_NO) {
		B41_SRL_NO = b41_SRL_NO;
	}
	public String getB41_PRODUCT() {
		return B41_PRODUCT;
	}
	public void setB41_PRODUCT(String b41_PRODUCT) {
		B41_PRODUCT = b41_PRODUCT;
	}
	public BigDecimal getB41_TOTAL_AMOUNT() {
		return B41_TOTAL_AMOUNT;
	}
	public void setB41_TOTAL_AMOUNT(BigDecimal b41_TOTAL_AMOUNT) {
		B41_TOTAL_AMOUNT = b41_TOTAL_AMOUNT;
	}
	public BigDecimal getB41_SPECIFIC_PROVISIONS() {
		return B41_SPECIFIC_PROVISIONS;
	}
	public void setB41_SPECIFIC_PROVISIONS(BigDecimal b41_SPECIFIC_PROVISIONS) {
		B41_SPECIFIC_PROVISIONS = b41_SPECIFIC_PROVISIONS;
	}
	public String getB42_SRL_NO() {
		return B42_SRL_NO;
	}
	public void setB42_SRL_NO(String b42_SRL_NO) {
		B42_SRL_NO = b42_SRL_NO;
	}
	public String getB42_PRODUCT() {
		return B42_PRODUCT;
	}
	public void setB42_PRODUCT(String b42_PRODUCT) {
		B42_PRODUCT = b42_PRODUCT;
	}
	public BigDecimal getB42_TOTAL_AMOUNT() {
		return B42_TOTAL_AMOUNT;
	}
	public void setB42_TOTAL_AMOUNT(BigDecimal b42_TOTAL_AMOUNT) {
		B42_TOTAL_AMOUNT = b42_TOTAL_AMOUNT;
	}
	public BigDecimal getB42_SPECIFIC_PROVISIONS() {
		return B42_SPECIFIC_PROVISIONS;
	}
	public void setB42_SPECIFIC_PROVISIONS(BigDecimal b42_SPECIFIC_PROVISIONS) {
		B42_SPECIFIC_PROVISIONS = b42_SPECIFIC_PROVISIONS;
	}
	public String getB43_SRL_NO() {
		return B43_SRL_NO;
	}
	public void setB43_SRL_NO(String b43_SRL_NO) {
		B43_SRL_NO = b43_SRL_NO;
	}
	public String getB43_PRODUCT() {
		return B43_PRODUCT;
	}
	public void setB43_PRODUCT(String b43_PRODUCT) {
		B43_PRODUCT = b43_PRODUCT;
	}
	public BigDecimal getB43_TOTAL_AMOUNT() {
		return B43_TOTAL_AMOUNT;
	}
	public void setB43_TOTAL_AMOUNT(BigDecimal b43_TOTAL_AMOUNT) {
		B43_TOTAL_AMOUNT = b43_TOTAL_AMOUNT;
	}
	public BigDecimal getB43_SPECIFIC_PROVISIONS() {
		return B43_SPECIFIC_PROVISIONS;
	}
	public void setB43_SPECIFIC_PROVISIONS(BigDecimal b43_SPECIFIC_PROVISIONS) {
		B43_SPECIFIC_PROVISIONS = b43_SPECIFIC_PROVISIONS;
	}
	public String getB45_SRL_NO() {
		return B45_SRL_NO;
	}
	public void setB45_SRL_NO(String b45_SRL_NO) {
		B45_SRL_NO = b45_SRL_NO;
	}
	public String getB45_PRODUCT() {
		return B45_PRODUCT;
	}
	public void setB45_PRODUCT(String b45_PRODUCT) {
		B45_PRODUCT = b45_PRODUCT;
	}
	public BigDecimal getB45_TOTAL_AMOUNT() {
		return B45_TOTAL_AMOUNT;
	}
	public void setB45_TOTAL_AMOUNT(BigDecimal b45_TOTAL_AMOUNT) {
		B45_TOTAL_AMOUNT = b45_TOTAL_AMOUNT;
	}
	public BigDecimal getB45_SPECIFIC_PROVISIONS() {
		return B45_SPECIFIC_PROVISIONS;
	}
	public void setB45_SPECIFIC_PROVISIONS(BigDecimal b45_SPECIFIC_PROVISIONS) {
		B45_SPECIFIC_PROVISIONS = b45_SPECIFIC_PROVISIONS;
	}
	public String getB46_SRL_NO() {
		return B46_SRL_NO;
	}
	public void setB46_SRL_NO(String b46_SRL_NO) {
		B46_SRL_NO = b46_SRL_NO;
	}
	public String getB46_PRODUCT() {
		return B46_PRODUCT;
	}
	public void setB46_PRODUCT(String b46_PRODUCT) {
		B46_PRODUCT = b46_PRODUCT;
	}
	public BigDecimal getB46_TOTAL_AMOUNT() {
		return B46_TOTAL_AMOUNT;
	}
	public void setB46_TOTAL_AMOUNT(BigDecimal b46_TOTAL_AMOUNT) {
		B46_TOTAL_AMOUNT = b46_TOTAL_AMOUNT;
	}
	public BigDecimal getB46_SPECIFIC_PROVISIONS() {
		return B46_SPECIFIC_PROVISIONS;
	}
	public void setB46_SPECIFIC_PROVISIONS(BigDecimal b46_SPECIFIC_PROVISIONS) {
		B46_SPECIFIC_PROVISIONS = b46_SPECIFIC_PROVISIONS;
	}
	public String getB5_SRL_NO() {
		return B5_SRL_NO;
	}
	public void setB5_SRL_NO(String b5_SRL_NO) {
		B5_SRL_NO = b5_SRL_NO;
	}
	public String getB5_PRODUCT() {
		return B5_PRODUCT;
	}
	public void setB5_PRODUCT(String b5_PRODUCT) {
		B5_PRODUCT = b5_PRODUCT;
	}
	public BigDecimal getB5_TOTAL_AMOUNT() {
		return B5_TOTAL_AMOUNT;
	}
	public void setB5_TOTAL_AMOUNT(BigDecimal b5_TOTAL_AMOUNT) {
		B5_TOTAL_AMOUNT = b5_TOTAL_AMOUNT;
	}
	public BigDecimal getB5_SPECIFIC_PROVISIONS() {
		return B5_SPECIFIC_PROVISIONS;
	}
	public void setB5_SPECIFIC_PROVISIONS(BigDecimal b5_SPECIFIC_PROVISIONS) {
		B5_SPECIFIC_PROVISIONS = b5_SPECIFIC_PROVISIONS;
	}
	public String getC1_SRL_NO() {
		return C1_SRL_NO;
	}
	public void setC1_SRL_NO(String c1_SRL_NO) {
		C1_SRL_NO = c1_SRL_NO;
	}
	public String getC1_PRODUCT() {
		return C1_PRODUCT;
	}
	public void setC1_PRODUCT(String c1_PRODUCT) {
		C1_PRODUCT = c1_PRODUCT;
	}
	public BigDecimal getC1_TOTAL_AMOUNT() {
		return C1_TOTAL_AMOUNT;
	}
	public void setC1_TOTAL_AMOUNT(BigDecimal c1_TOTAL_AMOUNT) {
		C1_TOTAL_AMOUNT = c1_TOTAL_AMOUNT;
	}
	public BigDecimal getC1_SPECIFIC_PROVISIONS() {
		return C1_SPECIFIC_PROVISIONS;
	}
	public void setC1_SPECIFIC_PROVISIONS(BigDecimal c1_SPECIFIC_PROVISIONS) {
		C1_SPECIFIC_PROVISIONS = c1_SPECIFIC_PROVISIONS;
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
	
	public String getC2_SRL_NO() {
		return C2_SRL_NO;
	}
	public void setC2_SRL_NO(String c2_SRL_NO) {
		C2_SRL_NO = c2_SRL_NO;
	}
	public String getC2_PRODUCT() {
		return C2_PRODUCT;
	}
	public void setC2_PRODUCT(String c2_PRODUCT) {
		C2_PRODUCT = c2_PRODUCT;
	}
	public BigDecimal getC2_TOTAL_AMOUNT() {
		return C2_TOTAL_AMOUNT;
	}
	public void setC2_TOTAL_AMOUNT(BigDecimal c2_TOTAL_AMOUNT) {
		C2_TOTAL_AMOUNT = c2_TOTAL_AMOUNT;
	}
	public BigDecimal getC2_SPECIFIC_PROVISIONS() {
		return C2_SPECIFIC_PROVISIONS;
	}
	public void setC2_SPECIFIC_PROVISIONS(BigDecimal c2_SPECIFIC_PROVISIONS) {
		C2_SPECIFIC_PROVISIONS = c2_SPECIFIC_PROVISIONS;
	}
	public String getC3_SRL_NO() {
		return C3_SRL_NO;
	}
	public void setC3_SRL_NO(String c3_SRL_NO) {
		C3_SRL_NO = c3_SRL_NO;
	}
	public String getC3_PRODUCT() {
		return C3_PRODUCT;
	}
	public void setC3_PRODUCT(String c3_PRODUCT) {
		C3_PRODUCT = c3_PRODUCT;
	}
	public BigDecimal getC3_TOTAL_AMOUNT() {
		return C3_TOTAL_AMOUNT;
	}
	public void setC3_TOTAL_AMOUNT(BigDecimal c3_TOTAL_AMOUNT) {
		C3_TOTAL_AMOUNT = c3_TOTAL_AMOUNT;
	}
	public BigDecimal getC3_SPECIFIC_PROVISIONS() {
		return C3_SPECIFIC_PROVISIONS;
	}
	public void setC3_SPECIFIC_PROVISIONS(BigDecimal c3_SPECIFIC_PROVISIONS) {
		C3_SPECIFIC_PROVISIONS = c3_SPECIFIC_PROVISIONS;
	}
	public T1_RLORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T1_RLORReport(String a_SRL_NO, String a_PRODUCT, BigDecimal a_TOTAL_AMOUNT, BigDecimal a_SPECIFIC_PROVISIONS,
			String a1_SRL_NO, String a1_PRODUCT, BigDecimal a1_TOTAL_AMOUNT, BigDecimal a1_SPECIFIC_PROVISIONS,
			String a11_SRL_NO, String a11_PRODUCT, BigDecimal a11_TOTAL_AMOUNT, BigDecimal a11_SPECIFIC_PROVISIONS,
			String a2_SRL_NO, String a2_PRODUCT, BigDecimal a2_TOTAL_AMOUNT, BigDecimal a2_SPECIFIC_PROVISIONS,
			String a21_SRL_NO, String a21_PRODUCT, BigDecimal a21_TOTAL_AMOUNT, BigDecimal a21_SPECIFIC_PROVISIONS,
			String b1_SRL_NO, String b1_PRODUCT, BigDecimal b1_TOTAL_AMOUNT, BigDecimal b1_SPECIFIC_PROVISIONS,
			String b2_SRL_NO, String b2_PRODUCT, BigDecimal b2_TOTAL_AMOUNT, BigDecimal b2_SPECIFIC_PROVISIONS,
			String b3_SRL_NO, String b3_PRODUCT, BigDecimal b3_TOTAL_AMOUNT, BigDecimal b3_SPECIFIC_PROVISIONS,
			String b31_SRL_NO, String b31_PRODUCT, BigDecimal b31_TOTAL_AMOUNT, BigDecimal b31_SPECIFIC_PROVISIONS,
			String b4_SRL_NO, String b4_PRODUCT, BigDecimal b4_TOTAL_AMOUNT, BigDecimal b4_SPECIFIC_PROVISIONS,
			String b41_SRL_NO, String b41_PRODUCT, BigDecimal b41_TOTAL_AMOUNT, BigDecimal b41_SPECIFIC_PROVISIONS,
			String b42_SRL_NO, String b42_PRODUCT, BigDecimal b42_TOTAL_AMOUNT, BigDecimal b42_SPECIFIC_PROVISIONS,
			String b43_SRL_NO, String b43_PRODUCT, BigDecimal b43_TOTAL_AMOUNT, BigDecimal b43_SPECIFIC_PROVISIONS,
			String b45_SRL_NO, String b45_PRODUCT, BigDecimal b45_TOTAL_AMOUNT, BigDecimal b45_SPECIFIC_PROVISIONS,
			String b46_SRL_NO, String b46_PRODUCT, BigDecimal b46_TOTAL_AMOUNT, BigDecimal b46_SPECIFIC_PROVISIONS,
			String b5_SRL_NO, String b5_PRODUCT, BigDecimal b5_TOTAL_AMOUNT, BigDecimal b5_SPECIFIC_PROVISIONS,
			String c1_SRL_NO, String c1_PRODUCT, BigDecimal c1_TOTAL_AMOUNT, BigDecimal c1_SPECIFIC_PROVISIONS,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER,
			String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG, String c2_SRL_NO,
			String c2_PRODUCT, BigDecimal c2_TOTAL_AMOUNT, BigDecimal c2_SPECIFIC_PROVISIONS, String c3_SRL_NO,
			String c3_PRODUCT, BigDecimal c3_TOTAL_AMOUNT, BigDecimal c3_SPECIFIC_PROVISIONS) {
		super();
		A_SRL_NO = a_SRL_NO;
		A_PRODUCT = a_PRODUCT;
		A_TOTAL_AMOUNT = a_TOTAL_AMOUNT;
		A_SPECIFIC_PROVISIONS = a_SPECIFIC_PROVISIONS;
		A1_SRL_NO = a1_SRL_NO;
		A1_PRODUCT = a1_PRODUCT;
		A1_TOTAL_AMOUNT = a1_TOTAL_AMOUNT;
		A1_SPECIFIC_PROVISIONS = a1_SPECIFIC_PROVISIONS;
		A11_SRL_NO = a11_SRL_NO;
		A11_PRODUCT = a11_PRODUCT;
		A11_TOTAL_AMOUNT = a11_TOTAL_AMOUNT;
		A11_SPECIFIC_PROVISIONS = a11_SPECIFIC_PROVISIONS;
		A2_SRL_NO = a2_SRL_NO;
		A2_PRODUCT = a2_PRODUCT;
		A2_TOTAL_AMOUNT = a2_TOTAL_AMOUNT;
		A2_SPECIFIC_PROVISIONS = a2_SPECIFIC_PROVISIONS;
		A21_SRL_NO = a21_SRL_NO;
		A21_PRODUCT = a21_PRODUCT;
		A21_TOTAL_AMOUNT = a21_TOTAL_AMOUNT;
		A21_SPECIFIC_PROVISIONS = a21_SPECIFIC_PROVISIONS;
		B1_SRL_NO = b1_SRL_NO;
		B1_PRODUCT = b1_PRODUCT;
		B1_TOTAL_AMOUNT = b1_TOTAL_AMOUNT;
		B1_SPECIFIC_PROVISIONS = b1_SPECIFIC_PROVISIONS;
		B2_SRL_NO = b2_SRL_NO;
		B2_PRODUCT = b2_PRODUCT;
		B2_TOTAL_AMOUNT = b2_TOTAL_AMOUNT;
		B2_SPECIFIC_PROVISIONS = b2_SPECIFIC_PROVISIONS;
		B3_SRL_NO = b3_SRL_NO;
		B3_PRODUCT = b3_PRODUCT;
		B3_TOTAL_AMOUNT = b3_TOTAL_AMOUNT;
		B3_SPECIFIC_PROVISIONS = b3_SPECIFIC_PROVISIONS;
		B31_SRL_NO = b31_SRL_NO;
		B31_PRODUCT = b31_PRODUCT;
		B31_TOTAL_AMOUNT = b31_TOTAL_AMOUNT;
		B31_SPECIFIC_PROVISIONS = b31_SPECIFIC_PROVISIONS;
		B4_SRL_NO = b4_SRL_NO;
		B4_PRODUCT = b4_PRODUCT;
		B4_TOTAL_AMOUNT = b4_TOTAL_AMOUNT;
		B4_SPECIFIC_PROVISIONS = b4_SPECIFIC_PROVISIONS;
		B41_SRL_NO = b41_SRL_NO;
		B41_PRODUCT = b41_PRODUCT;
		B41_TOTAL_AMOUNT = b41_TOTAL_AMOUNT;
		B41_SPECIFIC_PROVISIONS = b41_SPECIFIC_PROVISIONS;
		B42_SRL_NO = b42_SRL_NO;
		B42_PRODUCT = b42_PRODUCT;
		B42_TOTAL_AMOUNT = b42_TOTAL_AMOUNT;
		B42_SPECIFIC_PROVISIONS = b42_SPECIFIC_PROVISIONS;
		B43_SRL_NO = b43_SRL_NO;
		B43_PRODUCT = b43_PRODUCT;
		B43_TOTAL_AMOUNT = b43_TOTAL_AMOUNT;
		B43_SPECIFIC_PROVISIONS = b43_SPECIFIC_PROVISIONS;
		B45_SRL_NO = b45_SRL_NO;
		B45_PRODUCT = b45_PRODUCT;
		B45_TOTAL_AMOUNT = b45_TOTAL_AMOUNT;
		B45_SPECIFIC_PROVISIONS = b45_SPECIFIC_PROVISIONS;
		B46_SRL_NO = b46_SRL_NO;
		B46_PRODUCT = b46_PRODUCT;
		B46_TOTAL_AMOUNT = b46_TOTAL_AMOUNT;
		B46_SPECIFIC_PROVISIONS = b46_SPECIFIC_PROVISIONS;
		B5_SRL_NO = b5_SRL_NO;
		B5_PRODUCT = b5_PRODUCT;
		B5_TOTAL_AMOUNT = b5_TOTAL_AMOUNT;
		B5_SPECIFIC_PROVISIONS = b5_SPECIFIC_PROVISIONS;
		C1_SRL_NO = c1_SRL_NO;
		C1_PRODUCT = c1_PRODUCT;
		C1_TOTAL_AMOUNT = c1_TOTAL_AMOUNT;
		C1_SPECIFIC_PROVISIONS = c1_SPECIFIC_PROVISIONS;
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
		C2_SRL_NO = c2_SRL_NO;
		C2_PRODUCT = c2_PRODUCT;
		C2_TOTAL_AMOUNT = c2_TOTAL_AMOUNT;
		C2_SPECIFIC_PROVISIONS = c2_SPECIFIC_PROVISIONS;
		C3_SRL_NO = c3_SRL_NO;
		C3_PRODUCT = c3_PRODUCT;
		C3_TOTAL_AMOUNT = c3_TOTAL_AMOUNT;
		C3_SPECIFIC_PROVISIONS = c3_SPECIFIC_PROVISIONS;
	}


}
