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
@Table(name="T1_IFRS_CURRENT_NUMBER_NONFUND_QUAN_TABLE")
public class T1AIFRSQNReport {
	private String	A_PRODUCT;
	private BigDecimal	A_AVG_CCF;
	private BigDecimal	A_S1_EAD_MUR;
	private BigDecimal	A_S1_ECL_MUR;
	private BigDecimal	A_S1_ECL_PERCENTAGE;
	private BigDecimal	A_S2_EAD_MUR;
	private BigDecimal	A_S2_ECL_MUR;
	private BigDecimal	A_S2_ECL_PERCENTAGE;
	private BigDecimal	A_S3_EAD_MUR;
	private BigDecimal	A_S3_ECL_MUR;
	private BigDecimal	A_S3_ECL_PERCENTAGE;
	private String	B_PRODUCT;
	private BigDecimal	B_AVG_CCF;
	private BigDecimal	B_S1_EAD_MUR;
	private BigDecimal	B_S1_ECL_MUR;
	private BigDecimal	B_S1_ECL_PERCENTAGE;
	private BigDecimal	B_S2_EAD_MUR;
	private BigDecimal	B_S2_ECL_MUR;
	private BigDecimal	B_S2_ECL_PERCENTAGE;
	private BigDecimal	B_S3_EAD_MUR;
	private BigDecimal	B_S3_ECL_MUR;
	private BigDecimal	B_S3_ECL_PERCENTAGE;
	private String	C_PRODUCT;
	private BigDecimal	C_AVG_CCF;
	private BigDecimal	C_S1_EAD_MUR;
	private BigDecimal	C_S1_ECL_MUR;
	private BigDecimal	C_S1_ECL_PERCENTAGE;
	private BigDecimal	C_S2_EAD_MUR;
	private BigDecimal	C_S2_ECL_MUR;
	private BigDecimal	C_S2_ECL_PERCENTAGE;
	private BigDecimal	C_S3_EAD_MUR;
	private BigDecimal	C_S3_ECL_MUR;
	private BigDecimal	C_S3_ECL_PERCENTAGE;
	private String	D_PRODUCT;
	private BigDecimal	D_AVG_CCF;
	private BigDecimal	D_S1_EAD_MUR;
	private BigDecimal	D_S1_ECL_MUR;
	private BigDecimal	D_S1_ECL_PERCENTAGE;
	private BigDecimal	D_S2_EAD_MUR;
	private BigDecimal	D_S2_ECL_MUR;
	private BigDecimal	D_S2_ECL_PERCENTAGE;
	private BigDecimal	D_S3_EAD_MUR;
	private BigDecimal	D_S3_ECL_MUR;
	private BigDecimal	D_S3_ECL_PERCENTAGE;
	private String	E_PRODUCT;
	private BigDecimal	E_AVG_CCF;
	private BigDecimal	E_S1_EAD_MUR;
	private BigDecimal	E_S1_ECL_MUR;
	private BigDecimal	E_S1_ECL_PERCENTAGE;
	private BigDecimal	E_S2_EAD_MUR;
	private BigDecimal	E_S2_ECL_MUR;
	private BigDecimal	E_S2_ECL_PERCENTAGE;
	private BigDecimal	E_S3_EAD_MUR;
	private BigDecimal	E_S3_ECL_MUR;
	private BigDecimal	E_S3_ECL_PERCENTAGE;
	private String	F_PRODUCT;
	private BigDecimal	F_AVG_CCF;
	private BigDecimal	F_S1_EAD_MUR;
	private BigDecimal	F_S1_ECL_MUR;
	private BigDecimal	F_S1_ECL_PERCENTAGE;
	private BigDecimal	F_S2_EAD_MUR;
	private BigDecimal	F_S2_ECL_MUR;
	private BigDecimal	F_S2_ECL_PERCENTAGE;
	private BigDecimal	F_S3_EAD_MUR;
	private BigDecimal	F_S3_ECL_MUR;
	private BigDecimal	F_S3_ECL_PERCENTAGE;
	private String	G_PRODUCT;
	private BigDecimal	G_AVG_CCF;
	private BigDecimal	G_S1_EAD_MUR;
	private BigDecimal	G_S1_ECL_MUR;
	private BigDecimal	G_S1_ECL_PERCENTAGE;
	private BigDecimal	G_S2_EAD_MUR;
	private BigDecimal	G_S2_ECL_MUR;
	private BigDecimal	G_S2_ECL_PERCENTAGE;
	private BigDecimal	G_S3_EAD_MUR;
	private BigDecimal	G_S3_ECL_MUR;
	private BigDecimal	G_S3_ECL_PERCENTAGE;
	private String	H_PRODUCT;
	private BigDecimal	H_AVG_CCF;
	private BigDecimal	H_S1_EAD_MUR;
	private BigDecimal	H_S1_ECL_MUR;
	private BigDecimal	H_S1_ECL_PERCENTAGE;
	private BigDecimal	H_S2_EAD_MUR;
	private BigDecimal	H_S2_ECL_MUR;
	private BigDecimal	H_S2_ECL_PERCENTAGE;
	private BigDecimal	H_S3_EAD_MUR;
	private BigDecimal	H_S3_ECL_MUR;
	private BigDecimal	H_S3_ECL_PERCENTAGE;
	private String	I_PRODUCT;
	private BigDecimal	I_AVG_CCF;
	private BigDecimal	I_S1_EAD_MUR;
	private BigDecimal	I_S1_ECL_MUR;
	private BigDecimal	I_S1_ECL_PERCENTAGE;
	private BigDecimal	I_S2_EAD_MUR;
	private BigDecimal	I_S2_ECL_MUR;
	private BigDecimal	I_S2_ECL_PERCENTAGE;
	private BigDecimal	I_S3_EAD_MUR;
	private BigDecimal	I_S3_ECL_MUR;
	private BigDecimal	I_S3_ECL_PERCENTAGE;
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
	public String getA_PRODUCT() {
		return A_PRODUCT;
	}
	public void setA_PRODUCT(String a_PRODUCT) {
		A_PRODUCT = a_PRODUCT;
	}
	public BigDecimal getA_AVG_CCF() {
		return A_AVG_CCF;
	}
	public void setA_AVG_CCF(BigDecimal a_AVG_CCF) {
		A_AVG_CCF = a_AVG_CCF;
	}
	public BigDecimal getA_S1_EAD_MUR() {
		return A_S1_EAD_MUR;
	}
	public void setA_S1_EAD_MUR(BigDecimal a_S1_EAD_MUR) {
		A_S1_EAD_MUR = a_S1_EAD_MUR;
	}
	public BigDecimal getA_S1_ECL_MUR() {
		return A_S1_ECL_MUR;
	}
	public void setA_S1_ECL_MUR(BigDecimal a_S1_ECL_MUR) {
		A_S1_ECL_MUR = a_S1_ECL_MUR;
	}
	public BigDecimal getA_S1_ECL_PERCENTAGE() {
		return A_S1_ECL_PERCENTAGE;
	}
	public void setA_S1_ECL_PERCENTAGE(BigDecimal a_S1_ECL_PERCENTAGE) {
		A_S1_ECL_PERCENTAGE = a_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getA_S2_EAD_MUR() {
		return A_S2_EAD_MUR;
	}
	public void setA_S2_EAD_MUR(BigDecimal a_S2_EAD_MUR) {
		A_S2_EAD_MUR = a_S2_EAD_MUR;
	}
	public BigDecimal getA_S2_ECL_MUR() {
		return A_S2_ECL_MUR;
	}
	public void setA_S2_ECL_MUR(BigDecimal a_S2_ECL_MUR) {
		A_S2_ECL_MUR = a_S2_ECL_MUR;
	}
	public BigDecimal getA_S2_ECL_PERCENTAGE() {
		return A_S2_ECL_PERCENTAGE;
	}
	public void setA_S2_ECL_PERCENTAGE(BigDecimal a_S2_ECL_PERCENTAGE) {
		A_S2_ECL_PERCENTAGE = a_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getA_S3_EAD_MUR() {
		return A_S3_EAD_MUR;
	}
	public void setA_S3_EAD_MUR(BigDecimal a_S3_EAD_MUR) {
		A_S3_EAD_MUR = a_S3_EAD_MUR;
	}
	public BigDecimal getA_S3_ECL_MUR() {
		return A_S3_ECL_MUR;
	}
	public void setA_S3_ECL_MUR(BigDecimal a_S3_ECL_MUR) {
		A_S3_ECL_MUR = a_S3_ECL_MUR;
	}
	public BigDecimal getA_S3_ECL_PERCENTAGE() {
		return A_S3_ECL_PERCENTAGE;
	}
	public void setA_S3_ECL_PERCENTAGE(BigDecimal a_S3_ECL_PERCENTAGE) {
		A_S3_ECL_PERCENTAGE = a_S3_ECL_PERCENTAGE;
	}
	public String getB_PRODUCT() {
		return B_PRODUCT;
	}
	public void setB_PRODUCT(String b_PRODUCT) {
		B_PRODUCT = b_PRODUCT;
	}
	public BigDecimal getB_AVG_CCF() {
		return B_AVG_CCF;
	}
	public void setB_AVG_CCF(BigDecimal b_AVG_CCF) {
		B_AVG_CCF = b_AVG_CCF;
	}
	public BigDecimal getB_S1_EAD_MUR() {
		return B_S1_EAD_MUR;
	}
	public void setB_S1_EAD_MUR(BigDecimal b_S1_EAD_MUR) {
		B_S1_EAD_MUR = b_S1_EAD_MUR;
	}
	public BigDecimal getB_S1_ECL_MUR() {
		return B_S1_ECL_MUR;
	}
	public void setB_S1_ECL_MUR(BigDecimal b_S1_ECL_MUR) {
		B_S1_ECL_MUR = b_S1_ECL_MUR;
	}
	public BigDecimal getB_S1_ECL_PERCENTAGE() {
		return B_S1_ECL_PERCENTAGE;
	}
	public void setB_S1_ECL_PERCENTAGE(BigDecimal b_S1_ECL_PERCENTAGE) {
		B_S1_ECL_PERCENTAGE = b_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getB_S2_EAD_MUR() {
		return B_S2_EAD_MUR;
	}
	public void setB_S2_EAD_MUR(BigDecimal b_S2_EAD_MUR) {
		B_S2_EAD_MUR = b_S2_EAD_MUR;
	}
	public BigDecimal getB_S2_ECL_MUR() {
		return B_S2_ECL_MUR;
	}
	public void setB_S2_ECL_MUR(BigDecimal b_S2_ECL_MUR) {
		B_S2_ECL_MUR = b_S2_ECL_MUR;
	}
	public BigDecimal getB_S2_ECL_PERCENTAGE() {
		return B_S2_ECL_PERCENTAGE;
	}
	public void setB_S2_ECL_PERCENTAGE(BigDecimal b_S2_ECL_PERCENTAGE) {
		B_S2_ECL_PERCENTAGE = b_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getB_S3_EAD_MUR() {
		return B_S3_EAD_MUR;
	}
	public void setB_S3_EAD_MUR(BigDecimal b_S3_EAD_MUR) {
		B_S3_EAD_MUR = b_S3_EAD_MUR;
	}
	public BigDecimal getB_S3_ECL_MUR() {
		return B_S3_ECL_MUR;
	}
	public void setB_S3_ECL_MUR(BigDecimal b_S3_ECL_MUR) {
		B_S3_ECL_MUR = b_S3_ECL_MUR;
	}
	public BigDecimal getB_S3_ECL_PERCENTAGE() {
		return B_S3_ECL_PERCENTAGE;
	}
	public void setB_S3_ECL_PERCENTAGE(BigDecimal b_S3_ECL_PERCENTAGE) {
		B_S3_ECL_PERCENTAGE = b_S3_ECL_PERCENTAGE;
	}
	public String getC_PRODUCT() {
		return C_PRODUCT;
	}
	public void setC_PRODUCT(String c_PRODUCT) {
		C_PRODUCT = c_PRODUCT;
	}
	public BigDecimal getC_AVG_CCF() {
		return C_AVG_CCF;
	}
	public void setC_AVG_CCF(BigDecimal c_AVG_CCF) {
		C_AVG_CCF = c_AVG_CCF;
	}
	public BigDecimal getC_S1_EAD_MUR() {
		return C_S1_EAD_MUR;
	}
	public void setC_S1_EAD_MUR(BigDecimal c_S1_EAD_MUR) {
		C_S1_EAD_MUR = c_S1_EAD_MUR;
	}
	public BigDecimal getC_S1_ECL_MUR() {
		return C_S1_ECL_MUR;
	}
	public void setC_S1_ECL_MUR(BigDecimal c_S1_ECL_MUR) {
		C_S1_ECL_MUR = c_S1_ECL_MUR;
	}
	public BigDecimal getC_S1_ECL_PERCENTAGE() {
		return C_S1_ECL_PERCENTAGE;
	}
	public void setC_S1_ECL_PERCENTAGE(BigDecimal c_S1_ECL_PERCENTAGE) {
		C_S1_ECL_PERCENTAGE = c_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getC_S2_EAD_MUR() {
		return C_S2_EAD_MUR;
	}
	public void setC_S2_EAD_MUR(BigDecimal c_S2_EAD_MUR) {
		C_S2_EAD_MUR = c_S2_EAD_MUR;
	}
	public BigDecimal getC_S2_ECL_MUR() {
		return C_S2_ECL_MUR;
	}
	public void setC_S2_ECL_MUR(BigDecimal c_S2_ECL_MUR) {
		C_S2_ECL_MUR = c_S2_ECL_MUR;
	}
	public BigDecimal getC_S2_ECL_PERCENTAGE() {
		return C_S2_ECL_PERCENTAGE;
	}
	public void setC_S2_ECL_PERCENTAGE(BigDecimal c_S2_ECL_PERCENTAGE) {
		C_S2_ECL_PERCENTAGE = c_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getC_S3_EAD_MUR() {
		return C_S3_EAD_MUR;
	}
	public void setC_S3_EAD_MUR(BigDecimal c_S3_EAD_MUR) {
		C_S3_EAD_MUR = c_S3_EAD_MUR;
	}
	public BigDecimal getC_S3_ECL_MUR() {
		return C_S3_ECL_MUR;
	}
	public void setC_S3_ECL_MUR(BigDecimal c_S3_ECL_MUR) {
		C_S3_ECL_MUR = c_S3_ECL_MUR;
	}
	public BigDecimal getC_S3_ECL_PERCENTAGE() {
		return C_S3_ECL_PERCENTAGE;
	}
	public void setC_S3_ECL_PERCENTAGE(BigDecimal c_S3_ECL_PERCENTAGE) {
		C_S3_ECL_PERCENTAGE = c_S3_ECL_PERCENTAGE;
	}
	public String getD_PRODUCT() {
		return D_PRODUCT;
	}
	public void setD_PRODUCT(String d_PRODUCT) {
		D_PRODUCT = d_PRODUCT;
	}
	public BigDecimal getD_AVG_CCF() {
		return D_AVG_CCF;
	}
	public void setD_AVG_CCF(BigDecimal d_AVG_CCF) {
		D_AVG_CCF = d_AVG_CCF;
	}
	public BigDecimal getD_S1_EAD_MUR() {
		return D_S1_EAD_MUR;
	}
	public void setD_S1_EAD_MUR(BigDecimal d_S1_EAD_MUR) {
		D_S1_EAD_MUR = d_S1_EAD_MUR;
	}
	public BigDecimal getD_S1_ECL_MUR() {
		return D_S1_ECL_MUR;
	}
	public void setD_S1_ECL_MUR(BigDecimal d_S1_ECL_MUR) {
		D_S1_ECL_MUR = d_S1_ECL_MUR;
	}
	public BigDecimal getD_S1_ECL_PERCENTAGE() {
		return D_S1_ECL_PERCENTAGE;
	}
	public void setD_S1_ECL_PERCENTAGE(BigDecimal d_S1_ECL_PERCENTAGE) {
		D_S1_ECL_PERCENTAGE = d_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getD_S2_EAD_MUR() {
		return D_S2_EAD_MUR;
	}
	public void setD_S2_EAD_MUR(BigDecimal d_S2_EAD_MUR) {
		D_S2_EAD_MUR = d_S2_EAD_MUR;
	}
	public BigDecimal getD_S2_ECL_MUR() {
		return D_S2_ECL_MUR;
	}
	public void setD_S2_ECL_MUR(BigDecimal d_S2_ECL_MUR) {
		D_S2_ECL_MUR = d_S2_ECL_MUR;
	}
	public BigDecimal getD_S2_ECL_PERCENTAGE() {
		return D_S2_ECL_PERCENTAGE;
	}
	public void setD_S2_ECL_PERCENTAGE(BigDecimal d_S2_ECL_PERCENTAGE) {
		D_S2_ECL_PERCENTAGE = d_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getD_S3_EAD_MUR() {
		return D_S3_EAD_MUR;
	}
	public void setD_S3_EAD_MUR(BigDecimal d_S3_EAD_MUR) {
		D_S3_EAD_MUR = d_S3_EAD_MUR;
	}
	public BigDecimal getD_S3_ECL_MUR() {
		return D_S3_ECL_MUR;
	}
	public void setD_S3_ECL_MUR(BigDecimal d_S3_ECL_MUR) {
		D_S3_ECL_MUR = d_S3_ECL_MUR;
	}
	public BigDecimal getD_S3_ECL_PERCENTAGE() {
		return D_S3_ECL_PERCENTAGE;
	}
	public void setD_S3_ECL_PERCENTAGE(BigDecimal d_S3_ECL_PERCENTAGE) {
		D_S3_ECL_PERCENTAGE = d_S3_ECL_PERCENTAGE;
	}
	public String getE_PRODUCT() {
		return E_PRODUCT;
	}
	public void setE_PRODUCT(String e_PRODUCT) {
		E_PRODUCT = e_PRODUCT;
	}
	public BigDecimal getE_AVG_CCF() {
		return E_AVG_CCF;
	}
	public void setE_AVG_CCF(BigDecimal e_AVG_CCF) {
		E_AVG_CCF = e_AVG_CCF;
	}
	public BigDecimal getE_S1_EAD_MUR() {
		return E_S1_EAD_MUR;
	}
	public void setE_S1_EAD_MUR(BigDecimal e_S1_EAD_MUR) {
		E_S1_EAD_MUR = e_S1_EAD_MUR;
	}
	public BigDecimal getE_S1_ECL_MUR() {
		return E_S1_ECL_MUR;
	}
	public void setE_S1_ECL_MUR(BigDecimal e_S1_ECL_MUR) {
		E_S1_ECL_MUR = e_S1_ECL_MUR;
	}
	public BigDecimal getE_S1_ECL_PERCENTAGE() {
		return E_S1_ECL_PERCENTAGE;
	}
	public void setE_S1_ECL_PERCENTAGE(BigDecimal e_S1_ECL_PERCENTAGE) {
		E_S1_ECL_PERCENTAGE = e_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getE_S2_EAD_MUR() {
		return E_S2_EAD_MUR;
	}
	public void setE_S2_EAD_MUR(BigDecimal e_S2_EAD_MUR) {
		E_S2_EAD_MUR = e_S2_EAD_MUR;
	}
	public BigDecimal getE_S2_ECL_MUR() {
		return E_S2_ECL_MUR;
	}
	public void setE_S2_ECL_MUR(BigDecimal e_S2_ECL_MUR) {
		E_S2_ECL_MUR = e_S2_ECL_MUR;
	}
	public BigDecimal getE_S2_ECL_PERCENTAGE() {
		return E_S2_ECL_PERCENTAGE;
	}
	public void setE_S2_ECL_PERCENTAGE(BigDecimal e_S2_ECL_PERCENTAGE) {
		E_S2_ECL_PERCENTAGE = e_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getE_S3_EAD_MUR() {
		return E_S3_EAD_MUR;
	}
	public void setE_S3_EAD_MUR(BigDecimal e_S3_EAD_MUR) {
		E_S3_EAD_MUR = e_S3_EAD_MUR;
	}
	public BigDecimal getE_S3_ECL_MUR() {
		return E_S3_ECL_MUR;
	}
	public void setE_S3_ECL_MUR(BigDecimal e_S3_ECL_MUR) {
		E_S3_ECL_MUR = e_S3_ECL_MUR;
	}
	public BigDecimal getE_S3_ECL_PERCENTAGE() {
		return E_S3_ECL_PERCENTAGE;
	}
	public void setE_S3_ECL_PERCENTAGE(BigDecimal e_S3_ECL_PERCENTAGE) {
		E_S3_ECL_PERCENTAGE = e_S3_ECL_PERCENTAGE;
	}
	public String getF_PRODUCT() {
		return F_PRODUCT;
	}
	public void setF_PRODUCT(String f_PRODUCT) {
		F_PRODUCT = f_PRODUCT;
	}
	public BigDecimal getF_AVG_CCF() {
		return F_AVG_CCF;
	}
	public void setF_AVG_CCF(BigDecimal f_AVG_CCF) {
		F_AVG_CCF = f_AVG_CCF;
	}
	public BigDecimal getF_S1_EAD_MUR() {
		return F_S1_EAD_MUR;
	}
	public void setF_S1_EAD_MUR(BigDecimal f_S1_EAD_MUR) {
		F_S1_EAD_MUR = f_S1_EAD_MUR;
	}
	public BigDecimal getF_S1_ECL_MUR() {
		return F_S1_ECL_MUR;
	}
	public void setF_S1_ECL_MUR(BigDecimal f_S1_ECL_MUR) {
		F_S1_ECL_MUR = f_S1_ECL_MUR;
	}
	public BigDecimal getF_S1_ECL_PERCENTAGE() {
		return F_S1_ECL_PERCENTAGE;
	}
	public void setF_S1_ECL_PERCENTAGE(BigDecimal f_S1_ECL_PERCENTAGE) {
		F_S1_ECL_PERCENTAGE = f_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getF_S2_EAD_MUR() {
		return F_S2_EAD_MUR;
	}
	public void setF_S2_EAD_MUR(BigDecimal f_S2_EAD_MUR) {
		F_S2_EAD_MUR = f_S2_EAD_MUR;
	}
	public BigDecimal getF_S2_ECL_MUR() {
		return F_S2_ECL_MUR;
	}
	public void setF_S2_ECL_MUR(BigDecimal f_S2_ECL_MUR) {
		F_S2_ECL_MUR = f_S2_ECL_MUR;
	}
	public BigDecimal getF_S2_ECL_PERCENTAGE() {
		return F_S2_ECL_PERCENTAGE;
	}
	public void setF_S2_ECL_PERCENTAGE(BigDecimal f_S2_ECL_PERCENTAGE) {
		F_S2_ECL_PERCENTAGE = f_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getF_S3_EAD_MUR() {
		return F_S3_EAD_MUR;
	}
	public void setF_S3_EAD_MUR(BigDecimal f_S3_EAD_MUR) {
		F_S3_EAD_MUR = f_S3_EAD_MUR;
	}
	public BigDecimal getF_S3_ECL_MUR() {
		return F_S3_ECL_MUR;
	}
	public void setF_S3_ECL_MUR(BigDecimal f_S3_ECL_MUR) {
		F_S3_ECL_MUR = f_S3_ECL_MUR;
	}
	public BigDecimal getF_S3_ECL_PERCENTAGE() {
		return F_S3_ECL_PERCENTAGE;
	}
	public void setF_S3_ECL_PERCENTAGE(BigDecimal f_S3_ECL_PERCENTAGE) {
		F_S3_ECL_PERCENTAGE = f_S3_ECL_PERCENTAGE;
	}
	public String getG_PRODUCT() {
		return G_PRODUCT;
	}
	public void setG_PRODUCT(String g_PRODUCT) {
		G_PRODUCT = g_PRODUCT;
	}
	public BigDecimal getG_AVG_CCF() {
		return G_AVG_CCF;
	}
	public void setG_AVG_CCF(BigDecimal g_AVG_CCF) {
		G_AVG_CCF = g_AVG_CCF;
	}
	public BigDecimal getG_S1_EAD_MUR() {
		return G_S1_EAD_MUR;
	}
	public void setG_S1_EAD_MUR(BigDecimal g_S1_EAD_MUR) {
		G_S1_EAD_MUR = g_S1_EAD_MUR;
	}
	public BigDecimal getG_S1_ECL_MUR() {
		return G_S1_ECL_MUR;
	}
	public void setG_S1_ECL_MUR(BigDecimal g_S1_ECL_MUR) {
		G_S1_ECL_MUR = g_S1_ECL_MUR;
	}
	public BigDecimal getG_S1_ECL_PERCENTAGE() {
		return G_S1_ECL_PERCENTAGE;
	}
	public void setG_S1_ECL_PERCENTAGE(BigDecimal g_S1_ECL_PERCENTAGE) {
		G_S1_ECL_PERCENTAGE = g_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getG_S2_EAD_MUR() {
		return G_S2_EAD_MUR;
	}
	public void setG_S2_EAD_MUR(BigDecimal g_S2_EAD_MUR) {
		G_S2_EAD_MUR = g_S2_EAD_MUR;
	}
	public BigDecimal getG_S2_ECL_MUR() {
		return G_S2_ECL_MUR;
	}
	public void setG_S2_ECL_MUR(BigDecimal g_S2_ECL_MUR) {
		G_S2_ECL_MUR = g_S2_ECL_MUR;
	}
	public BigDecimal getG_S2_ECL_PERCENTAGE() {
		return G_S2_ECL_PERCENTAGE;
	}
	public void setG_S2_ECL_PERCENTAGE(BigDecimal g_S2_ECL_PERCENTAGE) {
		G_S2_ECL_PERCENTAGE = g_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getG_S3_EAD_MUR() {
		return G_S3_EAD_MUR;
	}
	public void setG_S3_EAD_MUR(BigDecimal g_S3_EAD_MUR) {
		G_S3_EAD_MUR = g_S3_EAD_MUR;
	}
	public BigDecimal getG_S3_ECL_MUR() {
		return G_S3_ECL_MUR;
	}
	public void setG_S3_ECL_MUR(BigDecimal g_S3_ECL_MUR) {
		G_S3_ECL_MUR = g_S3_ECL_MUR;
	}
	public BigDecimal getG_S3_ECL_PERCENTAGE() {
		return G_S3_ECL_PERCENTAGE;
	}
	public void setG_S3_ECL_PERCENTAGE(BigDecimal g_S3_ECL_PERCENTAGE) {
		G_S3_ECL_PERCENTAGE = g_S3_ECL_PERCENTAGE;
	}
	public String getH_PRODUCT() {
		return H_PRODUCT;
	}
	public void setH_PRODUCT(String h_PRODUCT) {
		H_PRODUCT = h_PRODUCT;
	}
	public BigDecimal getH_AVG_CCF() {
		return H_AVG_CCF;
	}
	public void setH_AVG_CCF(BigDecimal h_AVG_CCF) {
		H_AVG_CCF = h_AVG_CCF;
	}
	public BigDecimal getH_S1_EAD_MUR() {
		return H_S1_EAD_MUR;
	}
	public void setH_S1_EAD_MUR(BigDecimal h_S1_EAD_MUR) {
		H_S1_EAD_MUR = h_S1_EAD_MUR;
	}
	public BigDecimal getH_S1_ECL_MUR() {
		return H_S1_ECL_MUR;
	}
	public void setH_S1_ECL_MUR(BigDecimal h_S1_ECL_MUR) {
		H_S1_ECL_MUR = h_S1_ECL_MUR;
	}
	public BigDecimal getH_S1_ECL_PERCENTAGE() {
		return H_S1_ECL_PERCENTAGE;
	}
	public void setH_S1_ECL_PERCENTAGE(BigDecimal h_S1_ECL_PERCENTAGE) {
		H_S1_ECL_PERCENTAGE = h_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getH_S2_EAD_MUR() {
		return H_S2_EAD_MUR;
	}
	public void setH_S2_EAD_MUR(BigDecimal h_S2_EAD_MUR) {
		H_S2_EAD_MUR = h_S2_EAD_MUR;
	}
	public BigDecimal getH_S2_ECL_MUR() {
		return H_S2_ECL_MUR;
	}
	public void setH_S2_ECL_MUR(BigDecimal h_S2_ECL_MUR) {
		H_S2_ECL_MUR = h_S2_ECL_MUR;
	}
	public BigDecimal getH_S2_ECL_PERCENTAGE() {
		return H_S2_ECL_PERCENTAGE;
	}
	public void setH_S2_ECL_PERCENTAGE(BigDecimal h_S2_ECL_PERCENTAGE) {
		H_S2_ECL_PERCENTAGE = h_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getH_S3_EAD_MUR() {
		return H_S3_EAD_MUR;
	}
	public void setH_S3_EAD_MUR(BigDecimal h_S3_EAD_MUR) {
		H_S3_EAD_MUR = h_S3_EAD_MUR;
	}
	public BigDecimal getH_S3_ECL_MUR() {
		return H_S3_ECL_MUR;
	}
	public void setH_S3_ECL_MUR(BigDecimal h_S3_ECL_MUR) {
		H_S3_ECL_MUR = h_S3_ECL_MUR;
	}
	public BigDecimal getH_S3_ECL_PERCENTAGE() {
		return H_S3_ECL_PERCENTAGE;
	}
	public void setH_S3_ECL_PERCENTAGE(BigDecimal h_S3_ECL_PERCENTAGE) {
		H_S3_ECL_PERCENTAGE = h_S3_ECL_PERCENTAGE;
	}
	public String getI_PRODUCT() {
		return I_PRODUCT;
	}
	public void setI_PRODUCT(String i_PRODUCT) {
		I_PRODUCT = i_PRODUCT;
	}
	public BigDecimal getI_AVG_CCF() {
		return I_AVG_CCF;
	}
	public void setI_AVG_CCF(BigDecimal i_AVG_CCF) {
		I_AVG_CCF = i_AVG_CCF;
	}
	public BigDecimal getI_S1_EAD_MUR() {
		return I_S1_EAD_MUR;
	}
	public void setI_S1_EAD_MUR(BigDecimal i_S1_EAD_MUR) {
		I_S1_EAD_MUR = i_S1_EAD_MUR;
	}
	public BigDecimal getI_S1_ECL_MUR() {
		return I_S1_ECL_MUR;
	}
	public void setI_S1_ECL_MUR(BigDecimal i_S1_ECL_MUR) {
		I_S1_ECL_MUR = i_S1_ECL_MUR;
	}
	public BigDecimal getI_S1_ECL_PERCENTAGE() {
		return I_S1_ECL_PERCENTAGE;
	}
	public void setI_S1_ECL_PERCENTAGE(BigDecimal i_S1_ECL_PERCENTAGE) {
		I_S1_ECL_PERCENTAGE = i_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getI_S2_EAD_MUR() {
		return I_S2_EAD_MUR;
	}
	public void setI_S2_EAD_MUR(BigDecimal i_S2_EAD_MUR) {
		I_S2_EAD_MUR = i_S2_EAD_MUR;
	}
	public BigDecimal getI_S2_ECL_MUR() {
		return I_S2_ECL_MUR;
	}
	public void setI_S2_ECL_MUR(BigDecimal i_S2_ECL_MUR) {
		I_S2_ECL_MUR = i_S2_ECL_MUR;
	}
	public BigDecimal getI_S2_ECL_PERCENTAGE() {
		return I_S2_ECL_PERCENTAGE;
	}
	public void setI_S2_ECL_PERCENTAGE(BigDecimal i_S2_ECL_PERCENTAGE) {
		I_S2_ECL_PERCENTAGE = i_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getI_S3_EAD_MUR() {
		return I_S3_EAD_MUR;
	}
	public void setI_S3_EAD_MUR(BigDecimal i_S3_EAD_MUR) {
		I_S3_EAD_MUR = i_S3_EAD_MUR;
	}
	public BigDecimal getI_S3_ECL_MUR() {
		return I_S3_ECL_MUR;
	}
	public void setI_S3_ECL_MUR(BigDecimal i_S3_ECL_MUR) {
		I_S3_ECL_MUR = i_S3_ECL_MUR;
	}
	public BigDecimal getI_S3_ECL_PERCENTAGE() {
		return I_S3_ECL_PERCENTAGE;
	}
	public void setI_S3_ECL_PERCENTAGE(BigDecimal i_S3_ECL_PERCENTAGE) {
		I_S3_ECL_PERCENTAGE = i_S3_ECL_PERCENTAGE;
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
	public T1AIFRSQNReport(String a_PRODUCT, BigDecimal a_AVG_CCF, BigDecimal a_S1_EAD_MUR, BigDecimal a_S1_ECL_MUR,
			BigDecimal a_S1_ECL_PERCENTAGE, BigDecimal a_S2_EAD_MUR, BigDecimal a_S2_ECL_MUR,
			BigDecimal a_S2_ECL_PERCENTAGE, BigDecimal a_S3_EAD_MUR, BigDecimal a_S3_ECL_MUR,
			BigDecimal a_S3_ECL_PERCENTAGE, String b_PRODUCT, BigDecimal b_AVG_CCF, BigDecimal b_S1_EAD_MUR,
			BigDecimal b_S1_ECL_MUR, BigDecimal b_S1_ECL_PERCENTAGE, BigDecimal b_S2_EAD_MUR, BigDecimal b_S2_ECL_MUR,
			BigDecimal b_S2_ECL_PERCENTAGE, BigDecimal b_S3_EAD_MUR, BigDecimal b_S3_ECL_MUR,
			BigDecimal b_S3_ECL_PERCENTAGE, String c_PRODUCT, BigDecimal c_AVG_CCF, BigDecimal c_S1_EAD_MUR,
			BigDecimal c_S1_ECL_MUR, BigDecimal c_S1_ECL_PERCENTAGE, BigDecimal c_S2_EAD_MUR, BigDecimal c_S2_ECL_MUR,
			BigDecimal c_S2_ECL_PERCENTAGE, BigDecimal c_S3_EAD_MUR, BigDecimal c_S3_ECL_MUR,
			BigDecimal c_S3_ECL_PERCENTAGE, String d_PRODUCT, BigDecimal d_AVG_CCF, BigDecimal d_S1_EAD_MUR,
			BigDecimal d_S1_ECL_MUR, BigDecimal d_S1_ECL_PERCENTAGE, BigDecimal d_S2_EAD_MUR, BigDecimal d_S2_ECL_MUR,
			BigDecimal d_S2_ECL_PERCENTAGE, BigDecimal d_S3_EAD_MUR, BigDecimal d_S3_ECL_MUR,
			BigDecimal d_S3_ECL_PERCENTAGE, String e_PRODUCT, BigDecimal e_AVG_CCF, BigDecimal e_S1_EAD_MUR,
			BigDecimal e_S1_ECL_MUR, BigDecimal e_S1_ECL_PERCENTAGE, BigDecimal e_S2_EAD_MUR, BigDecimal e_S2_ECL_MUR,
			BigDecimal e_S2_ECL_PERCENTAGE, BigDecimal e_S3_EAD_MUR, BigDecimal e_S3_ECL_MUR,
			BigDecimal e_S3_ECL_PERCENTAGE, String f_PRODUCT, BigDecimal f_AVG_CCF, BigDecimal f_S1_EAD_MUR,
			BigDecimal f_S1_ECL_MUR, BigDecimal f_S1_ECL_PERCENTAGE, BigDecimal f_S2_EAD_MUR, BigDecimal f_S2_ECL_MUR,
			BigDecimal f_S2_ECL_PERCENTAGE, BigDecimal f_S3_EAD_MUR, BigDecimal f_S3_ECL_MUR,
			BigDecimal f_S3_ECL_PERCENTAGE, String g_PRODUCT, BigDecimal g_AVG_CCF, BigDecimal g_S1_EAD_MUR,
			BigDecimal g_S1_ECL_MUR, BigDecimal g_S1_ECL_PERCENTAGE, BigDecimal g_S2_EAD_MUR, BigDecimal g_S2_ECL_MUR,
			BigDecimal g_S2_ECL_PERCENTAGE, BigDecimal g_S3_EAD_MUR, BigDecimal g_S3_ECL_MUR,
			BigDecimal g_S3_ECL_PERCENTAGE, String h_PRODUCT, BigDecimal h_AVG_CCF, BigDecimal h_S1_EAD_MUR,
			BigDecimal h_S1_ECL_MUR, BigDecimal h_S1_ECL_PERCENTAGE, BigDecimal h_S2_EAD_MUR, BigDecimal h_S2_ECL_MUR,
			BigDecimal h_S2_ECL_PERCENTAGE, BigDecimal h_S3_EAD_MUR, BigDecimal h_S3_ECL_MUR,
			BigDecimal h_S3_ECL_PERCENTAGE, String i_PRODUCT, BigDecimal i_AVG_CCF, BigDecimal i_S1_EAD_MUR,
			BigDecimal i_S1_ECL_MUR, BigDecimal i_S1_ECL_PERCENTAGE, BigDecimal i_S2_EAD_MUR, BigDecimal i_S2_ECL_MUR,
			BigDecimal i_S2_ECL_PERCENTAGE, BigDecimal i_S3_EAD_MUR, BigDecimal i_S3_ECL_MUR,
			BigDecimal i_S3_ECL_PERCENTAGE, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG) {
		super();
		A_PRODUCT = a_PRODUCT;
		A_AVG_CCF = a_AVG_CCF;
		A_S1_EAD_MUR = a_S1_EAD_MUR;
		A_S1_ECL_MUR = a_S1_ECL_MUR;
		A_S1_ECL_PERCENTAGE = a_S1_ECL_PERCENTAGE;
		A_S2_EAD_MUR = a_S2_EAD_MUR;
		A_S2_ECL_MUR = a_S2_ECL_MUR;
		A_S2_ECL_PERCENTAGE = a_S2_ECL_PERCENTAGE;
		A_S3_EAD_MUR = a_S3_EAD_MUR;
		A_S3_ECL_MUR = a_S3_ECL_MUR;
		A_S3_ECL_PERCENTAGE = a_S3_ECL_PERCENTAGE;
		B_PRODUCT = b_PRODUCT;
		B_AVG_CCF = b_AVG_CCF;
		B_S1_EAD_MUR = b_S1_EAD_MUR;
		B_S1_ECL_MUR = b_S1_ECL_MUR;
		B_S1_ECL_PERCENTAGE = b_S1_ECL_PERCENTAGE;
		B_S2_EAD_MUR = b_S2_EAD_MUR;
		B_S2_ECL_MUR = b_S2_ECL_MUR;
		B_S2_ECL_PERCENTAGE = b_S2_ECL_PERCENTAGE;
		B_S3_EAD_MUR = b_S3_EAD_MUR;
		B_S3_ECL_MUR = b_S3_ECL_MUR;
		B_S3_ECL_PERCENTAGE = b_S3_ECL_PERCENTAGE;
		C_PRODUCT = c_PRODUCT;
		C_AVG_CCF = c_AVG_CCF;
		C_S1_EAD_MUR = c_S1_EAD_MUR;
		C_S1_ECL_MUR = c_S1_ECL_MUR;
		C_S1_ECL_PERCENTAGE = c_S1_ECL_PERCENTAGE;
		C_S2_EAD_MUR = c_S2_EAD_MUR;
		C_S2_ECL_MUR = c_S2_ECL_MUR;
		C_S2_ECL_PERCENTAGE = c_S2_ECL_PERCENTAGE;
		C_S3_EAD_MUR = c_S3_EAD_MUR;
		C_S3_ECL_MUR = c_S3_ECL_MUR;
		C_S3_ECL_PERCENTAGE = c_S3_ECL_PERCENTAGE;
		D_PRODUCT = d_PRODUCT;
		D_AVG_CCF = d_AVG_CCF;
		D_S1_EAD_MUR = d_S1_EAD_MUR;
		D_S1_ECL_MUR = d_S1_ECL_MUR;
		D_S1_ECL_PERCENTAGE = d_S1_ECL_PERCENTAGE;
		D_S2_EAD_MUR = d_S2_EAD_MUR;
		D_S2_ECL_MUR = d_S2_ECL_MUR;
		D_S2_ECL_PERCENTAGE = d_S2_ECL_PERCENTAGE;
		D_S3_EAD_MUR = d_S3_EAD_MUR;
		D_S3_ECL_MUR = d_S3_ECL_MUR;
		D_S3_ECL_PERCENTAGE = d_S3_ECL_PERCENTAGE;
		E_PRODUCT = e_PRODUCT;
		E_AVG_CCF = e_AVG_CCF;
		E_S1_EAD_MUR = e_S1_EAD_MUR;
		E_S1_ECL_MUR = e_S1_ECL_MUR;
		E_S1_ECL_PERCENTAGE = e_S1_ECL_PERCENTAGE;
		E_S2_EAD_MUR = e_S2_EAD_MUR;
		E_S2_ECL_MUR = e_S2_ECL_MUR;
		E_S2_ECL_PERCENTAGE = e_S2_ECL_PERCENTAGE;
		E_S3_EAD_MUR = e_S3_EAD_MUR;
		E_S3_ECL_MUR = e_S3_ECL_MUR;
		E_S3_ECL_PERCENTAGE = e_S3_ECL_PERCENTAGE;
		F_PRODUCT = f_PRODUCT;
		F_AVG_CCF = f_AVG_CCF;
		F_S1_EAD_MUR = f_S1_EAD_MUR;
		F_S1_ECL_MUR = f_S1_ECL_MUR;
		F_S1_ECL_PERCENTAGE = f_S1_ECL_PERCENTAGE;
		F_S2_EAD_MUR = f_S2_EAD_MUR;
		F_S2_ECL_MUR = f_S2_ECL_MUR;
		F_S2_ECL_PERCENTAGE = f_S2_ECL_PERCENTAGE;
		F_S3_EAD_MUR = f_S3_EAD_MUR;
		F_S3_ECL_MUR = f_S3_ECL_MUR;
		F_S3_ECL_PERCENTAGE = f_S3_ECL_PERCENTAGE;
		G_PRODUCT = g_PRODUCT;
		G_AVG_CCF = g_AVG_CCF;
		G_S1_EAD_MUR = g_S1_EAD_MUR;
		G_S1_ECL_MUR = g_S1_ECL_MUR;
		G_S1_ECL_PERCENTAGE = g_S1_ECL_PERCENTAGE;
		G_S2_EAD_MUR = g_S2_EAD_MUR;
		G_S2_ECL_MUR = g_S2_ECL_MUR;
		G_S2_ECL_PERCENTAGE = g_S2_ECL_PERCENTAGE;
		G_S3_EAD_MUR = g_S3_EAD_MUR;
		G_S3_ECL_MUR = g_S3_ECL_MUR;
		G_S3_ECL_PERCENTAGE = g_S3_ECL_PERCENTAGE;
		H_PRODUCT = h_PRODUCT;
		H_AVG_CCF = h_AVG_CCF;
		H_S1_EAD_MUR = h_S1_EAD_MUR;
		H_S1_ECL_MUR = h_S1_ECL_MUR;
		H_S1_ECL_PERCENTAGE = h_S1_ECL_PERCENTAGE;
		H_S2_EAD_MUR = h_S2_EAD_MUR;
		H_S2_ECL_MUR = h_S2_ECL_MUR;
		H_S2_ECL_PERCENTAGE = h_S2_ECL_PERCENTAGE;
		H_S3_EAD_MUR = h_S3_EAD_MUR;
		H_S3_ECL_MUR = h_S3_ECL_MUR;
		H_S3_ECL_PERCENTAGE = h_S3_ECL_PERCENTAGE;
		I_PRODUCT = i_PRODUCT;
		I_AVG_CCF = i_AVG_CCF;
		I_S1_EAD_MUR = i_S1_EAD_MUR;
		I_S1_ECL_MUR = i_S1_ECL_MUR;
		I_S1_ECL_PERCENTAGE = i_S1_ECL_PERCENTAGE;
		I_S2_EAD_MUR = i_S2_EAD_MUR;
		I_S2_ECL_MUR = i_S2_ECL_MUR;
		I_S2_ECL_PERCENTAGE = i_S2_ECL_PERCENTAGE;
		I_S3_EAD_MUR = i_S3_EAD_MUR;
		I_S3_ECL_MUR = i_S3_ECL_MUR;
		I_S3_ECL_PERCENTAGE = i_S3_ECL_PERCENTAGE;
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
	public T1AIFRSQNReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
