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
@Table(name="T1_IFRS_CURRENT_NUMBER_QUAN_TABLE")
public class T1IFRSQNReport {
	private String	A_PRODUCT;
	private BigDecimal	A_S1_FACILITY_COUNT;
	private BigDecimal	A_S1_BARROW_COUNT;
	private BigDecimal	A_S1_AVG_PD;
	private BigDecimal	A_S1_AVG_LGD;
	private BigDecimal	A_S1_EAD_MUR;
	private BigDecimal	A_S1_ECL_MUR;
	private BigDecimal	A_S1_ECL_PERCENTAGE;
	private BigDecimal	A_S2_FACILITY_COUNT;
	private BigDecimal	A_S2_BARROW_COUNT;
	private BigDecimal	A_S2_AVG_PD;
	private BigDecimal	A_S2_AVG_LGD;
	private BigDecimal	A_S2_EAD_MUR;
	private BigDecimal	A_S2_ECL_MUR;
	private BigDecimal	A_S2_ECL_PERCENTAGE;
	private BigDecimal	A_S3_FACILITY_COUNT;
	private BigDecimal	A_S3_BARROW_COUNT;
	private BigDecimal	A_S3_EAD_MUR;
	private BigDecimal	A_S3_ECL_MUR;
	private BigDecimal	A_S3_ECL_PERCENTAGE;
	private String	B_PRODUCT;
	private BigDecimal	B_S1_FACILITY_COUNT;
	private BigDecimal	B_S1_BARROW_COUNT;
	private BigDecimal	B_S1_AVG_PD;
	private BigDecimal	B_S1_AVG_LGD;
	private BigDecimal	B_S1_EAD_MUR;
	private BigDecimal	B_S1_ECL_MUR;
	private BigDecimal	B_S1_ECL_PERCENTAGE;
	private BigDecimal	B_S2_FACILITY_COUNT;
	private BigDecimal	B_S2_BARROW_COUNT;
	private BigDecimal	B_S2_AVG_PD;
	private BigDecimal	B_S2_AVG_LGD;
	private BigDecimal	B_S2_EAD_MUR;
	private BigDecimal	B_S2_ECL_MUR;
	private BigDecimal	B_S2_ECL_PERCENTAGE;
	private BigDecimal	B_S3_FACILITY_COUNT;
	private BigDecimal	B_S3_BARROW_COUNT;
	private BigDecimal	B_S3_EAD_MUR;
	private BigDecimal	B_S3_ECL_MUR;
	private BigDecimal	B_S3_ECL_PERCENTAGE;
	private String	C_PRODUCT;
	private BigDecimal	C_S1_FACILITY_COUNT;
	private BigDecimal	C_S1_BARROW_COUNT;
	private BigDecimal	C_S1_AVG_PD;
	private BigDecimal	C_S1_AVG_LGD;
	private BigDecimal	C_S1_EAD_MUR;
	private BigDecimal	C_S1_ECL_MUR;
	private BigDecimal	C_S1_ECL_PERCENTAGE;
	private BigDecimal	C_S2_FACILITY_COUNT;
	private BigDecimal	C_S2_BARROW_COUNT;
	private BigDecimal	C_S2_AVG_PD;
	private BigDecimal	C_S2_AVG_LGD;
	private BigDecimal	C_S2_EAD_MUR;
	private BigDecimal	C_S2_ECL_MUR;
	private BigDecimal	C_S2_ECL_PERCENTAGE;
	private BigDecimal	C_S3_FACILITY_COUNT;
	private BigDecimal	C_S3_BARROW_COUNT;
	private BigDecimal	C_S3_EAD_MUR;
	private BigDecimal	C_S3_ECL_MUR;
	private BigDecimal	C_S3_ECL_PERCENTAGE;
	private String	D_PRODUCT;
	private BigDecimal	D_S1_FACILITY_COUNT;
	private BigDecimal	D_S1_BARROW_COUNT;
	private BigDecimal	D_S1_AVG_PD;
	private BigDecimal	D_S1_AVG_LGD;
	private BigDecimal	D_S1_EAD_MUR;
	private BigDecimal	D_S1_ECL_MUR;
	private BigDecimal	D_S1_ECL_PERCENTAGE;
	private BigDecimal	D_S2_FACILITY_COUNT;
	private BigDecimal	D_S2_BARROW_COUNT;
	private BigDecimal	D_S2_AVG_PD;
	private BigDecimal	D_S2_AVG_LGD;
	private BigDecimal	D_S2_EAD_MUR;
	private BigDecimal	D_S2_ECL_MUR;
	private BigDecimal	D_S2_ECL_PERCENTAGE;
	private BigDecimal	D_S3_FACILITY_COUNT;
	private BigDecimal	D_S3_BARROW_COUNT;
	private BigDecimal	D_S3_EAD_MUR;
	private BigDecimal	D_S3_ECL_MUR;
	private BigDecimal	D_S3_ECL_PERCENTAGE;
	private String	E_PRODUCT;
	private BigDecimal	E_S1_FACILITY_COUNT;
	private BigDecimal	E_S1_BARROW_COUNT;
	private BigDecimal	E_S1_AVG_PD;
	private BigDecimal	E_S1_AVG_LGD;
	private BigDecimal	E_S1_EAD_MUR;
	private BigDecimal	E_S1_ECL_MUR;
	private BigDecimal	E_S1_ECL_PERCENTAGE;
	private BigDecimal	E_S2_FACILITY_COUNT;
	private BigDecimal	E_S2_BARROW_COUNT;
	private BigDecimal	E_S2_AVG_PD;
	private BigDecimal	E_S2_AVG_LGD;
	private BigDecimal	E_S2_EAD_MUR;
	private BigDecimal	E_S2_ECL_MUR;
	private BigDecimal	E_S2_ECL_PERCENTAGE;
	private BigDecimal	E_S3_FACILITY_COUNT;
	private BigDecimal	E_S3_BARROW_COUNT;
	private BigDecimal	E_S3_EAD_MUR;
	private BigDecimal	E_S3_ECL_MUR;
	private BigDecimal	E_S3_ECL_PERCENTAGE;
	private String	F_PRODUCT;
	private BigDecimal	F_S1_FACILITY_COUNT;
	private BigDecimal	F_S1_BARROW_COUNT;
	private BigDecimal	F_S1_AVG_PD;
	private BigDecimal	F_S1_AVG_LGD;
	private BigDecimal	F_S1_EAD_MUR;
	private BigDecimal	F_S1_ECL_MUR;
	private BigDecimal	F_S1_ECL_PERCENTAGE;
	private BigDecimal	F_S2_FACILITY_COUNT;
	private BigDecimal	F_S2_BARROW_COUNT;
	private BigDecimal	F_S2_AVG_PD;
	private BigDecimal	F_S2_AVG_LGD;
	private BigDecimal	F_S2_EAD_MUR;
	private BigDecimal	F_S2_ECL_MUR;
	private BigDecimal	F_S2_ECL_PERCENTAGE;
	private BigDecimal	F_S3_FACILITY_COUNT;
	private BigDecimal	F_S3_BARROW_COUNT;
	private BigDecimal	F_S3_EAD_MUR;
	private BigDecimal	F_S3_ECL_MUR;
	private BigDecimal	F_S3_ECL_PERCENTAGE;
	private String	G_PRODUCT;
	private BigDecimal	G_S1_FACILITY_COUNT;
	private BigDecimal	G_S1_BARROW_COUNT;
	private BigDecimal	G_S1_AVG_PD;
	private BigDecimal	G_S1_AVG_LGD;
	private BigDecimal	G_S1_EAD_MUR;
	private BigDecimal	G_S1_ECL_MUR;
	private BigDecimal	G_S1_ECL_PERCENTAGE;
	private BigDecimal	G_S2_FACILITY_COUNT;
	private BigDecimal	G_S2_BARROW_COUNT;
	private BigDecimal	G_S2_AVG_PD;
	private BigDecimal	G_S2_AVG_LGD;
	private BigDecimal	G_S2_EAD_MUR;
	private BigDecimal	G_S2_ECL_MUR;
	private BigDecimal	G_S2_ECL_PERCENTAGE;
	private BigDecimal	G_S3_FACILITY_COUNT;
	private BigDecimal	G_S3_BARROW_COUNT;
	private BigDecimal	G_S3_EAD_MUR;
	private BigDecimal	G_S3_ECL_MUR;
	private BigDecimal	G_S3_ECL_PERCENTAGE;
	private String	H_PRODUCT;
	private BigDecimal	H_S1_FACILITY_COUNT;
	private BigDecimal	H_S1_BARROW_COUNT;
	private BigDecimal	H_S1_AVG_PD;
	private BigDecimal	H_S1_AVG_LGD;
	private BigDecimal	H_S1_EAD_MUR;
	private BigDecimal	H_S1_ECL_MUR;
	private BigDecimal	H_S1_ECL_PERCENTAGE;
	private BigDecimal	H_S2_FACILITY_COUNT;
	private BigDecimal	H_S2_BARROW_COUNT;
	private BigDecimal	H_S2_AVG_PD;
	private BigDecimal	H_S2_AVG_LGD;
	private BigDecimal	H_S2_EAD_MUR;
	private BigDecimal	H_S2_ECL_MUR;
	private BigDecimal	H_S2_ECL_PERCENTAGE;
	private BigDecimal	H_S3_FACILITY_COUNT;
	private BigDecimal	H_S3_BARROW_COUNT;
	private BigDecimal	H_S3_EAD_MUR;
	private BigDecimal	H_S3_ECL_MUR;
	private BigDecimal	H_S3_ECL_PERCENTAGE;
	private String	I_PRODUCT;
	private BigDecimal	I_S1_FACILITY_COUNT;
	private BigDecimal	I_S1_BARROW_COUNT;
	private BigDecimal	I_S1_AVG_PD;
	private BigDecimal	I_S1_AVG_LGD;
	private BigDecimal	I_S1_EAD_MUR;
	private BigDecimal	I_S1_ECL_MUR;
	private BigDecimal	I_S1_ECL_PERCENTAGE;
	private BigDecimal	I_S2_FACILITY_COUNT;
	private BigDecimal	I_S2_BARROW_COUNT;
	private BigDecimal	I_S2_AVG_PD;
	private BigDecimal	I_S2_AVG_LGD;
	private BigDecimal	I_S2_EAD_MUR;
	private BigDecimal	I_S2_ECL_MUR;
	private BigDecimal	I_S2_ECL_PERCENTAGE;
	private BigDecimal	I_S3_FACILITY_COUNT;
	private BigDecimal	I_S3_BARROW_COUNT;
	private BigDecimal	I_S3_EAD_MUR;
	private BigDecimal	I_S3_ECL_MUR;
	private BigDecimal	I_S3_ECL_PERCENTAGE;
	private String	J_PRODUCT;
	private BigDecimal	J_S1_FACILITY_COUNT;
	private BigDecimal	J_S1_BARROW_COUNT;
	private BigDecimal	J_S1_AVG_PD;
	private BigDecimal	J_S1_AVG_LGD;
	private BigDecimal	J_S1_EAD_MUR;
	private BigDecimal	J_S1_ECL_MUR;
	private BigDecimal	J_S1_ECL_PERCENTAGE;
	private BigDecimal	J_S2_FACILITY_COUNT;
	private BigDecimal	J_S2_BARROW_COUNT;
	private BigDecimal	J_S2_AVG_PD;
	private BigDecimal	J_S2_AVG_LGD;
	private BigDecimal	J_S2_EAD_MUR;
	private BigDecimal	J_S2_ECL_MUR;
	private BigDecimal	J_S2_ECL_PERCENTAGE;
	private BigDecimal	J_S3_FACILITY_COUNT;
	private BigDecimal	J_S3_BARROW_COUNT;
	private BigDecimal	J_S3_EAD_MUR;
	private BigDecimal	J_S3_ECL_MUR;
	private BigDecimal	J_S3_ECL_PERCENTAGE;
	private String	K_PRODUCT;
	private BigDecimal	K_S1_FACILITY_COUNT;
	private BigDecimal	K_S1_BARROW_COUNT;
	private BigDecimal	K_S1_AVG_PD;
	private BigDecimal	K_S1_AVG_LGD;
	private BigDecimal	K_S1_EAD_MUR;
	private BigDecimal	K_S1_ECL_MUR;
	private BigDecimal	K_S1_ECL_PERCENTAGE;
	private BigDecimal	K_S2_FACILITY_COUNT;
	private BigDecimal	K_S2_BARROW_COUNT;
	private BigDecimal	K_S2_AVG_PD;
	private BigDecimal	K_S2_AVG_LGD;
	private BigDecimal	K_S2_EAD_MUR;
	private BigDecimal	K_S2_ECL_MUR;
	private BigDecimal	K_S2_ECL_PERCENTAGE;
	private BigDecimal	K_S3_FACILITY_COUNT;
	private BigDecimal	K_S3_BARROW_COUNT;
	private BigDecimal	K_S3_EAD_MUR;
	private BigDecimal	K_S3_ECL_MUR;
	private BigDecimal	K_S3_ECL_PERCENTAGE;
	private String	L_PRODUCT;
	private BigDecimal	L_S1_FACILITY_COUNT;
	private BigDecimal	L_S1_BARROW_COUNT;
	private BigDecimal	L_S1_AVG_PD;
	private BigDecimal	L_S1_AVG_LGD;
	private BigDecimal	L_S1_EAD_MUR;
	private BigDecimal	L_S1_ECL_MUR;
	private BigDecimal	L_S1_ECL_PERCENTAGE;
	private BigDecimal	L_S2_FACILITY_COUNT;
	private BigDecimal	L_S2_BARROW_COUNT;
	private BigDecimal	L_S2_AVG_PD;
	private BigDecimal	L_S2_AVG_LGD;
	private BigDecimal	L_S2_EAD_MUR;
	private BigDecimal	L_S2_ECL_MUR;
	private BigDecimal	L_S2_ECL_PERCENTAGE;
	private BigDecimal	L_S3_FACILITY_COUNT;
	private BigDecimal	L_S3_BARROW_COUNT;
	private BigDecimal	L_S3_EAD_MUR;
	private BigDecimal	L_S3_ECL_MUR;
	private BigDecimal	L_S3_ECL_PERCENTAGE;
	private String	M_PRODUCT;
	private BigDecimal	M_S1_FACILITY_COUNT;
	private BigDecimal	M_S1_BARROW_COUNT;
	private BigDecimal	M_S1_AVG_PD;
	private BigDecimal	M_S1_AVG_LGD;
	private BigDecimal	M_S1_EAD_MUR;
	private BigDecimal	M_S1_ECL_MUR;
	private BigDecimal	M_S1_ECL_PERCENTAGE;
	private BigDecimal	M_S2_FACILITY_COUNT;
	private BigDecimal	M_S2_BARROW_COUNT;
	private BigDecimal	M_S2_AVG_PD;
	private BigDecimal	M_S2_AVG_LGD;
	private BigDecimal	M_S2_EAD_MUR;
	private BigDecimal	M_S2_ECL_MUR;
	private BigDecimal	M_S2_ECL_PERCENTAGE;
	private BigDecimal	M_S3_FACILITY_COUNT;
	private BigDecimal	M_S3_BARROW_COUNT;
	private BigDecimal	M_S3_EAD_MUR;
	private BigDecimal	M_S3_ECL_MUR;
	private BigDecimal	M_S3_ECL_PERCENTAGE;
	private String	N_PRODUCT;
	private BigDecimal	N_S1_FACILITY_COUNT;
	private BigDecimal	N_S1_BARROW_COUNT;
	private BigDecimal	N_S1_AVG_PD;
	private BigDecimal	N_S1_AVG_LGD;
	private BigDecimal	N_S1_EAD_MUR;
	private BigDecimal	N_S1_ECL_MUR;
	private BigDecimal	N_S1_ECL_PERCENTAGE;
	private BigDecimal	N_S2_FACILITY_COUNT;
	private BigDecimal	N_S2_BARROW_COUNT;
	private BigDecimal	N_S2_AVG_PD;
	private BigDecimal	N_S2_AVG_LGD;
	private BigDecimal	N_S2_EAD_MUR;
	private BigDecimal	N_S2_ECL_MUR;
	private BigDecimal	N_S2_ECL_PERCENTAGE;
	private BigDecimal	N_S3_FACILITY_COUNT;
	private BigDecimal	N_S3_BARROW_COUNT;
	private BigDecimal	N_S3_EAD_MUR;
	private BigDecimal	N_S3_ECL_MUR;
	private BigDecimal	N_S3_ECL_PERCENTAGE;
	private String	O_PRODUCT;
	private BigDecimal	O_S1_FACILITY_COUNT;
	private BigDecimal	O_S1_BARROW_COUNT;
	private BigDecimal	O_S1_AVG_PD;
	private BigDecimal	O_S1_AVG_LGD;
	private BigDecimal	O_S1_EAD_MUR;
	private BigDecimal	O_S1_ECL_MUR;
	private BigDecimal	O_S1_ECL_PERCENTAGE;
	private BigDecimal	O_S2_FACILITY_COUNT;
	private BigDecimal	O_S2_BARROW_COUNT;
	private BigDecimal	O_S2_AVG_PD;
	private BigDecimal	O_S2_AVG_LGD;
	private BigDecimal	O_S2_EAD_MUR;
	private BigDecimal	O_S2_ECL_MUR;
	private BigDecimal	O_S2_ECL_PERCENTAGE;
	private BigDecimal	O_S3_FACILITY_COUNT;
	private BigDecimal	O_S3_BARROW_COUNT;
	private BigDecimal	O_S3_EAD_MUR;
	private BigDecimal	O_S3_ECL_MUR;
	private BigDecimal	O_S3_ECL_PERCENTAGE;
	private String	P_PRODUCT;
	private BigDecimal	P_S1_FACILITY_COUNT;
	private BigDecimal	P_S1_BARROW_COUNT;
	private BigDecimal	P_S1_AVG_PD;
	private BigDecimal	P_S1_AVG_LGD;
	private BigDecimal	P_S1_EAD_MUR;
	private BigDecimal	P_S1_ECL_MUR;
	private BigDecimal	P_S1_ECL_PERCENTAGE;
	private BigDecimal	P_S2_FACILITY_COUNT;
	private BigDecimal	P_S2_BARROW_COUNT;
	private BigDecimal	P_S2_AVG_PD;
	private BigDecimal	P_S2_AVG_LGD;
	private BigDecimal	P_S2_EAD_MUR;
	private BigDecimal	P_S2_ECL_MUR;
	private BigDecimal	P_S2_ECL_PERCENTAGE;
	private BigDecimal	P_S3_FACILITY_COUNT;
	private BigDecimal	P_S3_BARROW_COUNT;
	private BigDecimal	P_S3_EAD_MUR;
	private BigDecimal	P_S3_ECL_MUR;
	private BigDecimal	P_S3_ECL_PERCENTAGE;
	private String	Q_PRODUCT;
	private BigDecimal	Q_S1_FACILITY_COUNT;
	private BigDecimal	Q_S1_BARROW_COUNT;
	private BigDecimal	Q_S1_AVG_PD;
	private BigDecimal	Q_S1_AVG_LGD;
	private BigDecimal	Q_S1_EAD_MUR;
	private BigDecimal	Q_S1_ECL_MUR;
	private BigDecimal	Q_S1_ECL_PERCENTAGE;
	private BigDecimal	Q_S2_FACILITY_COUNT;
	private BigDecimal	Q_S2_BARROW_COUNT;
	private BigDecimal	Q_S2_AVG_PD;
	private BigDecimal	Q_S2_AVG_LGD;
	private BigDecimal	Q_S2_EAD_MUR;
	private BigDecimal	Q_S2_ECL_MUR;
	private BigDecimal	Q_S2_ECL_PERCENTAGE;
	private BigDecimal	Q_S3_FACILITY_COUNT;
	private BigDecimal	Q_S3_BARROW_COUNT;
	private BigDecimal	Q_S3_EAD_MUR;
	private BigDecimal	Q_S3_ECL_MUR;
	private BigDecimal	Q_S3_ECL_PERCENTAGE;
	private String	R_PRODUCT;
	private BigDecimal	R_S1_FACILITY_COUNT;
	private BigDecimal	R_S1_BARROW_COUNT;
	private BigDecimal	R_S1_AVG_PD;
	private BigDecimal	R_S1_AVG_LGD;
	private BigDecimal	R_S1_EAD_MUR;
	private BigDecimal	R_S1_ECL_MUR;
	private BigDecimal	R_S1_ECL_PERCENTAGE;
	private BigDecimal	R_S2_FACILITY_COUNT;
	private BigDecimal	R_S2_BARROW_COUNT;
	private BigDecimal	R_S2_AVG_PD;
	private BigDecimal	R_S2_AVG_LGD;
	private BigDecimal	R_S2_EAD_MUR;
	private BigDecimal	R_S2_ECL_MUR;
	private BigDecimal	R_S2_ECL_PERCENTAGE;
	private BigDecimal	R_S3_FACILITY_COUNT;
	private BigDecimal	R_S3_BARROW_COUNT;
	private BigDecimal	R_S3_EAD_MUR;
	private BigDecimal	R_S3_ECL_MUR;
	private BigDecimal	R_S3_ECL_PERCENTAGE;
	private String	S_PRODUCT;
	private BigDecimal	S_S1_FACILITY_COUNT;
	private BigDecimal	S_S1_BARROW_COUNT;
	private BigDecimal	S_S1_AVG_PD;
	private BigDecimal	S_S1_AVG_LGD;
	private BigDecimal	S_S1_EAD_MUR;
	private BigDecimal	S_S1_ECL_MUR;
	private BigDecimal	S_S1_ECL_PERCENTAGE;
	private BigDecimal	S_S2_FACILITY_COUNT;
	private BigDecimal	S_S2_BARROW_COUNT;
	private BigDecimal	S_S2_AVG_PD;
	private BigDecimal	S_S2_AVG_LGD;
	private BigDecimal	S_S2_EAD_MUR;
	private BigDecimal	S_S2_ECL_MUR;
	private BigDecimal	S_S2_ECL_PERCENTAGE;
	private BigDecimal	S_S3_FACILITY_COUNT;
	private BigDecimal	S_S3_BARROW_COUNT;
	private BigDecimal	S_S3_EAD_MUR;
	private BigDecimal	S_S3_ECL_MUR;
	private BigDecimal	S_S3_ECL_PERCENTAGE;
	private String	T_PRODUCT;
	private BigDecimal	T_S1_FACILITY_COUNT;
	private BigDecimal	T_S1_BARROW_COUNT;
	private BigDecimal	T_S1_AVG_PD;
	private BigDecimal	T_S1_AVG_LGD;
	private BigDecimal	T_S1_EAD_MUR;
	private BigDecimal	T_S1_ECL_MUR;
	private BigDecimal	T_S1_ECL_PERCENTAGE;
	private BigDecimal	T_S2_FACILITY_COUNT;
	private BigDecimal	T_S2_BARROW_COUNT;
	private BigDecimal	T_S2_AVG_PD;
	private BigDecimal	T_S2_AVG_LGD;
	private BigDecimal	T_S2_EAD_MUR;
	private BigDecimal	T_S2_ECL_MUR;
	private BigDecimal	T_S2_ECL_PERCENTAGE;
	private BigDecimal	T_S3_FACILITY_COUNT;
	private BigDecimal	T_S3_BARROW_COUNT;
	private BigDecimal	T_S3_EAD_MUR;
	private BigDecimal	T_S3_ECL_MUR;
	private BigDecimal	T_S3_ECL_PERCENTAGE;
	private String	U_PRODUCT;
	private BigDecimal	U_S1_FACILITY_COUNT;
	private BigDecimal	U_S1_BARROW_COUNT;
	private BigDecimal	U_S1_AVG_PD;
	private BigDecimal	U_S1_AVG_LGD;
	private BigDecimal	U_S1_EAD_MUR;
	private BigDecimal	U_S1_ECL_MUR;
	private BigDecimal	U_S1_ECL_PERCENTAGE;
	private BigDecimal	U_S2_FACILITY_COUNT;
	private BigDecimal	U_S2_BARROW_COUNT;
	private BigDecimal	U_S2_AVG_PD;
	private BigDecimal	U_S2_AVG_LGD;
	private BigDecimal	U_S2_EAD_MUR;
	private BigDecimal	U_S2_ECL_MUR;
	private BigDecimal	U_S2_ECL_PERCENTAGE;
	private BigDecimal	U_S3_FACILITY_COUNT;
	private BigDecimal	U_S3_BARROW_COUNT;
	private BigDecimal	U_S3_EAD_MUR;
	private BigDecimal	U_S3_ECL_MUR;
	private BigDecimal	U_S3_ECL_PERCENTAGE;
	private String	V_PRODUCT;
	private BigDecimal	V_S1_FACILITY_COUNT;
	private BigDecimal	V_S1_BARROW_COUNT;
	private BigDecimal	V_S1_AVG_PD;
	private BigDecimal	V_S1_AVG_LGD;
	private BigDecimal	V_S1_EAD_MUR;
	private BigDecimal	V_S1_ECL_MUR;
	private BigDecimal	V_S1_ECL_PERCENTAGE;
	private BigDecimal	V_S2_FACILITY_COUNT;
	private BigDecimal	V_S2_BARROW_COUNT;
	private BigDecimal	V_S2_AVG_PD;
	private BigDecimal	V_S2_AVG_LGD;
	private BigDecimal	V_S2_EAD_MUR;
	private BigDecimal	V_S2_ECL_MUR;
	private BigDecimal	V_S2_ECL_PERCENTAGE;
	private BigDecimal	V_S3_FACILITY_COUNT;
	private BigDecimal	V_S3_BARROW_COUNT;
	private BigDecimal	V_S3_EAD_MUR;
	private BigDecimal	V_S3_ECL_MUR;
	private BigDecimal	V_S3_ECL_PERCENTAGE;
	private String	W_PRODUCT;
	private BigDecimal	W_S1_FACILITY_COUNT;
	private BigDecimal	W_S1_BARROW_COUNT;
	private BigDecimal	W_S1_AVG_PD;
	private BigDecimal	W_S1_AVG_LGD;
	private BigDecimal	W_S1_EAD_MUR;
	private BigDecimal	W_S1_ECL_MUR;
	private BigDecimal	W_S1_ECL_PERCENTAGE;
	private BigDecimal	W_S2_FACILITY_COUNT;
	private BigDecimal	W_S2_BARROW_COUNT;
	private BigDecimal	W_S2_AVG_PD;
	private BigDecimal	W_S2_AVG_LGD;
	private BigDecimal	W_S2_EAD_MUR;
	private BigDecimal	W_S2_ECL_MUR;
	private BigDecimal	W_S2_ECL_PERCENTAGE;
	private BigDecimal	W_S3_FACILITY_COUNT;
	private BigDecimal	W_S3_BARROW_COUNT;
	private BigDecimal	W_S3_EAD_MUR;
	private BigDecimal	W_S3_ECL_MUR;
	private BigDecimal	W_S3_ECL_PERCENTAGE;
	private String	X_PRODUCT;
	private BigDecimal	X_S1_FACILITY_COUNT;
	private BigDecimal	X_S1_BARROW_COUNT;
	private BigDecimal	X_S1_AVG_PD;
	private BigDecimal	X_S1_AVG_LGD;
	private BigDecimal	X_S1_EAD_MUR;
	private BigDecimal	X_S1_ECL_MUR;
	private BigDecimal	X_S1_ECL_PERCENTAGE;
	private BigDecimal	X_S2_FACILITY_COUNT;
	private BigDecimal	X_S2_BARROW_COUNT;
	private BigDecimal	X_S2_AVG_PD;
	private BigDecimal	X_S2_AVG_LGD;
	private BigDecimal	X_S2_EAD_MUR;
	private BigDecimal	X_S2_ECL_MUR;
	private BigDecimal	X_S2_ECL_PERCENTAGE;
	private BigDecimal	X_S3_FACILITY_COUNT;
	private BigDecimal	X_S3_BARROW_COUNT;
	private BigDecimal	X_S3_EAD_MUR;
	private BigDecimal	X_S3_ECL_MUR;
	private BigDecimal	X_S3_ECL_PERCENTAGE;
	private String	Y_PRODUCT;
	private BigDecimal	Y_S1_FACILITY_COUNT;
	private BigDecimal	Y_S1_BARROW_COUNT;
	private BigDecimal	Y_S1_AVG_PD;
	private BigDecimal	Y_S1_AVG_LGD;
	private BigDecimal	Y_S1_EAD_MUR;
	private BigDecimal	Y_S1_ECL_MUR;
	private BigDecimal	Y_S1_ECL_PERCENTAGE;
	private BigDecimal	Y_S2_FACILITY_COUNT;
	private BigDecimal	Y_S2_BARROW_COUNT;
	private BigDecimal	Y_S2_AVG_PD;
	private BigDecimal	Y_S2_AVG_LGD;
	private BigDecimal	Y_S2_EAD_MUR;
	private BigDecimal	Y_S2_ECL_MUR;
	private BigDecimal	Y_S2_ECL_PERCENTAGE;
	private BigDecimal	Y_S3_FACILITY_COUNT;
	private BigDecimal	Y_S3_BARROW_COUNT;
	private BigDecimal	Y_S3_EAD_MUR;
	private BigDecimal	Y_S3_ECL_MUR;
	private BigDecimal	Y_S3_ECL_PERCENTAGE;
	private String	Z_PRODUCT;
	private BigDecimal	Z_S1_FACILITY_COUNT;
	private BigDecimal	Z_S1_BARROW_COUNT;
	private BigDecimal	Z_S1_AVG_PD;
	private BigDecimal	Z_S1_AVG_LGD;
	private BigDecimal	Z_S1_EAD_MUR;
	private BigDecimal	Z_S1_ECL_MUR;
	private BigDecimal	Z_S1_ECL_PERCENTAGE;
	private BigDecimal	Z_S2_FACILITY_COUNT;
	private BigDecimal	Z_S2_BARROW_COUNT;
	private BigDecimal	Z_S2_AVG_PD;
	private BigDecimal	Z_S2_AVG_LGD;
	private BigDecimal	Z_S2_EAD_MUR;
	private BigDecimal	Z_S2_ECL_MUR;
	private BigDecimal	Z_S2_ECL_PERCENTAGE;
	private BigDecimal	Z_S3_FACILITY_COUNT;
	private BigDecimal	Z_S3_BARROW_COUNT;
	private BigDecimal	Z_S3_EAD_MUR;
	private BigDecimal	Z_S3_ECL_MUR;
	private BigDecimal	Z_S3_ECL_PERCENTAGE;
	private String	AA_PRODUCT;
	private BigDecimal	AA_S1_FACILITY_COUNT;
	private BigDecimal	AA_S1_BARROW_COUNT;
	private BigDecimal	AA_S1_AVG_PD;
	private BigDecimal	AA_S1_AVG_LGD;
	private BigDecimal	AA_S1_EAD_MUR;
	private BigDecimal	AA_S1_ECL_MUR;
	private BigDecimal	AA_S1_ECL_PERCENTAGE;
	private BigDecimal	AA_S2_FACILITY_COUNT;
	private BigDecimal	AA_S2_BARROW_COUNT;
	private BigDecimal	AA_S2_AVG_PD;
	private BigDecimal	AA_S2_AVG_LGD;
	private BigDecimal	AA_S2_EAD_MUR;
	private BigDecimal	AA_S2_ECL_MUR;
	private BigDecimal	AA_S2_ECL_PERCENTAGE;
	private BigDecimal	AA_S3_FACILITY_COUNT;
	private BigDecimal	AA_S3_BARROW_COUNT;
	private BigDecimal	AA_S3_EAD_MUR;
	private BigDecimal	AA_S3_ECL_MUR;
	private BigDecimal	AA_S3_ECL_PERCENTAGE;
	private String	AB_PRODUCT;
	private BigDecimal	AB_S1_FACILITY_COUNT;
	private BigDecimal	AB_S1_BARROW_COUNT;
	private BigDecimal	AB_S1_AVG_PD;
	private BigDecimal	AB_S1_AVG_LGD;
	private BigDecimal	AB_S1_EAD_MUR;
	private BigDecimal	AB_S1_ECL_MUR;
	private BigDecimal	AB_S1_ECL_PERCENTAGE;
	private BigDecimal	AB_S2_FACILITY_COUNT;
	private BigDecimal	AB_S2_BARROW_COUNT;
	private BigDecimal	AB_S2_AVG_PD;
	private BigDecimal	AB_S2_AVG_LGD;
	private BigDecimal	AB_S2_EAD_MUR;
	private BigDecimal	AB_S2_ECL_MUR;
	private BigDecimal	AB_S2_ECL_PERCENTAGE;
	private BigDecimal	AB_S3_FACILITY_COUNT;
	private BigDecimal	AB_S3_BARROW_COUNT;
	private BigDecimal	AB_S3_EAD_MUR;
	private BigDecimal	AB_S3_ECL_MUR;
	private BigDecimal	AB_S3_ECL_PERCENTAGE;
	private String	AC_PRODUCT;
	private BigDecimal	AC_S1_FACILITY_COUNT;
	private BigDecimal	AC_S1_BARROW_COUNT;
	private BigDecimal	AC_S1_AVG_PD;
	private BigDecimal	AC_S1_AVG_LGD;
	private BigDecimal	AC_S1_EAD_MUR;
	private BigDecimal	AC_S1_ECL_MUR;
	private BigDecimal	AC_S1_ECL_PERCENTAGE;
	private BigDecimal	AC_S2_FACILITY_COUNT;
	private BigDecimal	AC_S2_BARROW_COUNT;
	private BigDecimal	AC_S2_AVG_PD;
	private BigDecimal	AC_S2_AVG_LGD;
	private BigDecimal	AC_S2_EAD_MUR;
	private BigDecimal	AC_S2_ECL_MUR;
	private BigDecimal	AC_S2_ECL_PERCENTAGE;
	private BigDecimal	AC_S3_FACILITY_COUNT;
	private BigDecimal	AC_S3_BARROW_COUNT;
	private BigDecimal	AC_S3_EAD_MUR;
	private BigDecimal	AC_S3_ECL_MUR;
	private BigDecimal	AC_S3_ECL_PERCENTAGE;
	private String	AD_PRODUCT;
	private BigDecimal	AD_S1_FACILITY_COUNT;
	private BigDecimal	AD_S1_BARROW_COUNT;
	private BigDecimal	AD_S1_AVG_PD;
	private BigDecimal	AD_S1_AVG_LGD;
	private BigDecimal	AD_S1_EAD_MUR;
	private BigDecimal	AD_S1_ECL_MUR;
	private BigDecimal	AD_S1_ECL_PERCENTAGE;
	private BigDecimal	AD_S2_FACILITY_COUNT;
	private BigDecimal	AD_S2_BARROW_COUNT;
	private BigDecimal	AD_S2_AVG_PD;
	private BigDecimal	AD_S2_AVG_LGD;
	private BigDecimal	AD_S2_EAD_MUR;
	private BigDecimal	AD_S2_ECL_MUR;
	private BigDecimal	AD_S2_ECL_PERCENTAGE;
	private BigDecimal	AD_S3_FACILITY_COUNT;
	private BigDecimal	AD_S3_BARROW_COUNT;
	private BigDecimal	AD_S3_EAD_MUR;
	private BigDecimal	AD_S3_ECL_MUR;
	private BigDecimal	AD_S3_ECL_PERCENTAGE;
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
	public BigDecimal getA_S1_FACILITY_COUNT() {
		return A_S1_FACILITY_COUNT;
	}
	public void setA_S1_FACILITY_COUNT(BigDecimal a_S1_FACILITY_COUNT) {
		A_S1_FACILITY_COUNT = a_S1_FACILITY_COUNT;
	}
	public BigDecimal getA_S1_BARROW_COUNT() {
		return A_S1_BARROW_COUNT;
	}
	public void setA_S1_BARROW_COUNT(BigDecimal a_S1_BARROW_COUNT) {
		A_S1_BARROW_COUNT = a_S1_BARROW_COUNT;
	}
	public BigDecimal getA_S1_AVG_PD() {
		return A_S1_AVG_PD;
	}
	public void setA_S1_AVG_PD(BigDecimal a_S1_AVG_PD) {
		A_S1_AVG_PD = a_S1_AVG_PD;
	}
	public BigDecimal getA_S1_AVG_LGD() {
		return A_S1_AVG_LGD;
	}
	public void setA_S1_AVG_LGD(BigDecimal a_S1_AVG_LGD) {
		A_S1_AVG_LGD = a_S1_AVG_LGD;
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
	public BigDecimal getA_S2_FACILITY_COUNT() {
		return A_S2_FACILITY_COUNT;
	}
	public void setA_S2_FACILITY_COUNT(BigDecimal a_S2_FACILITY_COUNT) {
		A_S2_FACILITY_COUNT = a_S2_FACILITY_COUNT;
	}
	public BigDecimal getA_S2_BARROW_COUNT() {
		return A_S2_BARROW_COUNT;
	}
	public void setA_S2_BARROW_COUNT(BigDecimal a_S2_BARROW_COUNT) {
		A_S2_BARROW_COUNT = a_S2_BARROW_COUNT;
	}
	public BigDecimal getA_S2_AVG_PD() {
		return A_S2_AVG_PD;
	}
	public void setA_S2_AVG_PD(BigDecimal a_S2_AVG_PD) {
		A_S2_AVG_PD = a_S2_AVG_PD;
	}
	public BigDecimal getA_S2_AVG_LGD() {
		return A_S2_AVG_LGD;
	}
	public void setA_S2_AVG_LGD(BigDecimal a_S2_AVG_LGD) {
		A_S2_AVG_LGD = a_S2_AVG_LGD;
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
	public BigDecimal getA_S3_FACILITY_COUNT() {
		return A_S3_FACILITY_COUNT;
	}
	public void setA_S3_FACILITY_COUNT(BigDecimal a_S3_FACILITY_COUNT) {
		A_S3_FACILITY_COUNT = a_S3_FACILITY_COUNT;
	}
	public BigDecimal getA_S3_BARROW_COUNT() {
		return A_S3_BARROW_COUNT;
	}
	public void setA_S3_BARROW_COUNT(BigDecimal a_S3_BARROW_COUNT) {
		A_S3_BARROW_COUNT = a_S3_BARROW_COUNT;
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
	public BigDecimal getB_S1_FACILITY_COUNT() {
		return B_S1_FACILITY_COUNT;
	}
	public void setB_S1_FACILITY_COUNT(BigDecimal b_S1_FACILITY_COUNT) {
		B_S1_FACILITY_COUNT = b_S1_FACILITY_COUNT;
	}
	public BigDecimal getB_S1_BARROW_COUNT() {
		return B_S1_BARROW_COUNT;
	}
	public void setB_S1_BARROW_COUNT(BigDecimal b_S1_BARROW_COUNT) {
		B_S1_BARROW_COUNT = b_S1_BARROW_COUNT;
	}
	public BigDecimal getB_S1_AVG_PD() {
		return B_S1_AVG_PD;
	}
	public void setB_S1_AVG_PD(BigDecimal b_S1_AVG_PD) {
		B_S1_AVG_PD = b_S1_AVG_PD;
	}
	public BigDecimal getB_S1_AVG_LGD() {
		return B_S1_AVG_LGD;
	}
	public void setB_S1_AVG_LGD(BigDecimal b_S1_AVG_LGD) {
		B_S1_AVG_LGD = b_S1_AVG_LGD;
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
	public BigDecimal getB_S2_FACILITY_COUNT() {
		return B_S2_FACILITY_COUNT;
	}
	public void setB_S2_FACILITY_COUNT(BigDecimal b_S2_FACILITY_COUNT) {
		B_S2_FACILITY_COUNT = b_S2_FACILITY_COUNT;
	}
	public BigDecimal getB_S2_BARROW_COUNT() {
		return B_S2_BARROW_COUNT;
	}
	public void setB_S2_BARROW_COUNT(BigDecimal b_S2_BARROW_COUNT) {
		B_S2_BARROW_COUNT = b_S2_BARROW_COUNT;
	}
	public BigDecimal getB_S2_AVG_PD() {
		return B_S2_AVG_PD;
	}
	public void setB_S2_AVG_PD(BigDecimal b_S2_AVG_PD) {
		B_S2_AVG_PD = b_S2_AVG_PD;
	}
	public BigDecimal getB_S2_AVG_LGD() {
		return B_S2_AVG_LGD;
	}
	public void setB_S2_AVG_LGD(BigDecimal b_S2_AVG_LGD) {
		B_S2_AVG_LGD = b_S2_AVG_LGD;
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
	public BigDecimal getB_S3_FACILITY_COUNT() {
		return B_S3_FACILITY_COUNT;
	}
	public void setB_S3_FACILITY_COUNT(BigDecimal b_S3_FACILITY_COUNT) {
		B_S3_FACILITY_COUNT = b_S3_FACILITY_COUNT;
	}
	public BigDecimal getB_S3_BARROW_COUNT() {
		return B_S3_BARROW_COUNT;
	}
	public void setB_S3_BARROW_COUNT(BigDecimal b_S3_BARROW_COUNT) {
		B_S3_BARROW_COUNT = b_S3_BARROW_COUNT;
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
	public BigDecimal getC_S1_FACILITY_COUNT() {
		return C_S1_FACILITY_COUNT;
	}
	public void setC_S1_FACILITY_COUNT(BigDecimal c_S1_FACILITY_COUNT) {
		C_S1_FACILITY_COUNT = c_S1_FACILITY_COUNT;
	}
	public BigDecimal getC_S1_BARROW_COUNT() {
		return C_S1_BARROW_COUNT;
	}
	public void setC_S1_BARROW_COUNT(BigDecimal c_S1_BARROW_COUNT) {
		C_S1_BARROW_COUNT = c_S1_BARROW_COUNT;
	}
	public BigDecimal getC_S1_AVG_PD() {
		return C_S1_AVG_PD;
	}
	public void setC_S1_AVG_PD(BigDecimal c_S1_AVG_PD) {
		C_S1_AVG_PD = c_S1_AVG_PD;
	}
	public BigDecimal getC_S1_AVG_LGD() {
		return C_S1_AVG_LGD;
	}
	public void setC_S1_AVG_LGD(BigDecimal c_S1_AVG_LGD) {
		C_S1_AVG_LGD = c_S1_AVG_LGD;
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
	public BigDecimal getC_S2_FACILITY_COUNT() {
		return C_S2_FACILITY_COUNT;
	}
	public void setC_S2_FACILITY_COUNT(BigDecimal c_S2_FACILITY_COUNT) {
		C_S2_FACILITY_COUNT = c_S2_FACILITY_COUNT;
	}
	public BigDecimal getC_S2_BARROW_COUNT() {
		return C_S2_BARROW_COUNT;
	}
	public void setC_S2_BARROW_COUNT(BigDecimal c_S2_BARROW_COUNT) {
		C_S2_BARROW_COUNT = c_S2_BARROW_COUNT;
	}
	public BigDecimal getC_S2_AVG_PD() {
		return C_S2_AVG_PD;
	}
	public void setC_S2_AVG_PD(BigDecimal c_S2_AVG_PD) {
		C_S2_AVG_PD = c_S2_AVG_PD;
	}
	public BigDecimal getC_S2_AVG_LGD() {
		return C_S2_AVG_LGD;
	}
	public void setC_S2_AVG_LGD(BigDecimal c_S2_AVG_LGD) {
		C_S2_AVG_LGD = c_S2_AVG_LGD;
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
	public BigDecimal getC_S3_FACILITY_COUNT() {
		return C_S3_FACILITY_COUNT;
	}
	public void setC_S3_FACILITY_COUNT(BigDecimal c_S3_FACILITY_COUNT) {
		C_S3_FACILITY_COUNT = c_S3_FACILITY_COUNT;
	}
	public BigDecimal getC_S3_BARROW_COUNT() {
		return C_S3_BARROW_COUNT;
	}
	public void setC_S3_BARROW_COUNT(BigDecimal c_S3_BARROW_COUNT) {
		C_S3_BARROW_COUNT = c_S3_BARROW_COUNT;
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
	public BigDecimal getD_S1_FACILITY_COUNT() {
		return D_S1_FACILITY_COUNT;
	}
	public void setD_S1_FACILITY_COUNT(BigDecimal d_S1_FACILITY_COUNT) {
		D_S1_FACILITY_COUNT = d_S1_FACILITY_COUNT;
	}
	public BigDecimal getD_S1_BARROW_COUNT() {
		return D_S1_BARROW_COUNT;
	}
	public void setD_S1_BARROW_COUNT(BigDecimal d_S1_BARROW_COUNT) {
		D_S1_BARROW_COUNT = d_S1_BARROW_COUNT;
	}
	public BigDecimal getD_S1_AVG_PD() {
		return D_S1_AVG_PD;
	}
	public void setD_S1_AVG_PD(BigDecimal d_S1_AVG_PD) {
		D_S1_AVG_PD = d_S1_AVG_PD;
	}
	public BigDecimal getD_S1_AVG_LGD() {
		return D_S1_AVG_LGD;
	}
	public void setD_S1_AVG_LGD(BigDecimal d_S1_AVG_LGD) {
		D_S1_AVG_LGD = d_S1_AVG_LGD;
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
	public BigDecimal getD_S2_FACILITY_COUNT() {
		return D_S2_FACILITY_COUNT;
	}
	public void setD_S2_FACILITY_COUNT(BigDecimal d_S2_FACILITY_COUNT) {
		D_S2_FACILITY_COUNT = d_S2_FACILITY_COUNT;
	}
	public BigDecimal getD_S2_BARROW_COUNT() {
		return D_S2_BARROW_COUNT;
	}
	public void setD_S2_BARROW_COUNT(BigDecimal d_S2_BARROW_COUNT) {
		D_S2_BARROW_COUNT = d_S2_BARROW_COUNT;
	}
	public BigDecimal getD_S2_AVG_PD() {
		return D_S2_AVG_PD;
	}
	public void setD_S2_AVG_PD(BigDecimal d_S2_AVG_PD) {
		D_S2_AVG_PD = d_S2_AVG_PD;
	}
	public BigDecimal getD_S2_AVG_LGD() {
		return D_S2_AVG_LGD;
	}
	public void setD_S2_AVG_LGD(BigDecimal d_S2_AVG_LGD) {
		D_S2_AVG_LGD = d_S2_AVG_LGD;
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
	public BigDecimal getD_S3_FACILITY_COUNT() {
		return D_S3_FACILITY_COUNT;
	}
	public void setD_S3_FACILITY_COUNT(BigDecimal d_S3_FACILITY_COUNT) {
		D_S3_FACILITY_COUNT = d_S3_FACILITY_COUNT;
	}
	public BigDecimal getD_S3_BARROW_COUNT() {
		return D_S3_BARROW_COUNT;
	}
	public void setD_S3_BARROW_COUNT(BigDecimal d_S3_BARROW_COUNT) {
		D_S3_BARROW_COUNT = d_S3_BARROW_COUNT;
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
	public BigDecimal getE_S1_FACILITY_COUNT() {
		return E_S1_FACILITY_COUNT;
	}
	public void setE_S1_FACILITY_COUNT(BigDecimal e_S1_FACILITY_COUNT) {
		E_S1_FACILITY_COUNT = e_S1_FACILITY_COUNT;
	}
	public BigDecimal getE_S1_BARROW_COUNT() {
		return E_S1_BARROW_COUNT;
	}
	public void setE_S1_BARROW_COUNT(BigDecimal e_S1_BARROW_COUNT) {
		E_S1_BARROW_COUNT = e_S1_BARROW_COUNT;
	}
	public BigDecimal getE_S1_AVG_PD() {
		return E_S1_AVG_PD;
	}
	public void setE_S1_AVG_PD(BigDecimal e_S1_AVG_PD) {
		E_S1_AVG_PD = e_S1_AVG_PD;
	}
	public BigDecimal getE_S1_AVG_LGD() {
		return E_S1_AVG_LGD;
	}
	public void setE_S1_AVG_LGD(BigDecimal e_S1_AVG_LGD) {
		E_S1_AVG_LGD = e_S1_AVG_LGD;
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
	public BigDecimal getE_S2_FACILITY_COUNT() {
		return E_S2_FACILITY_COUNT;
	}
	public void setE_S2_FACILITY_COUNT(BigDecimal e_S2_FACILITY_COUNT) {
		E_S2_FACILITY_COUNT = e_S2_FACILITY_COUNT;
	}
	public BigDecimal getE_S2_BARROW_COUNT() {
		return E_S2_BARROW_COUNT;
	}
	public void setE_S2_BARROW_COUNT(BigDecimal e_S2_BARROW_COUNT) {
		E_S2_BARROW_COUNT = e_S2_BARROW_COUNT;
	}
	public BigDecimal getE_S2_AVG_PD() {
		return E_S2_AVG_PD;
	}
	public void setE_S2_AVG_PD(BigDecimal e_S2_AVG_PD) {
		E_S2_AVG_PD = e_S2_AVG_PD;
	}
	public BigDecimal getE_S2_AVG_LGD() {
		return E_S2_AVG_LGD;
	}
	public void setE_S2_AVG_LGD(BigDecimal e_S2_AVG_LGD) {
		E_S2_AVG_LGD = e_S2_AVG_LGD;
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
	public BigDecimal getE_S3_FACILITY_COUNT() {
		return E_S3_FACILITY_COUNT;
	}
	public void setE_S3_FACILITY_COUNT(BigDecimal e_S3_FACILITY_COUNT) {
		E_S3_FACILITY_COUNT = e_S3_FACILITY_COUNT;
	}
	public BigDecimal getE_S3_BARROW_COUNT() {
		return E_S3_BARROW_COUNT;
	}
	public void setE_S3_BARROW_COUNT(BigDecimal e_S3_BARROW_COUNT) {
		E_S3_BARROW_COUNT = e_S3_BARROW_COUNT;
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
	public BigDecimal getF_S1_FACILITY_COUNT() {
		return F_S1_FACILITY_COUNT;
	}
	public void setF_S1_FACILITY_COUNT(BigDecimal f_S1_FACILITY_COUNT) {
		F_S1_FACILITY_COUNT = f_S1_FACILITY_COUNT;
	}
	public BigDecimal getF_S1_BARROW_COUNT() {
		return F_S1_BARROW_COUNT;
	}
	public void setF_S1_BARROW_COUNT(BigDecimal f_S1_BARROW_COUNT) {
		F_S1_BARROW_COUNT = f_S1_BARROW_COUNT;
	}
	public BigDecimal getF_S1_AVG_PD() {
		return F_S1_AVG_PD;
	}
	public void setF_S1_AVG_PD(BigDecimal f_S1_AVG_PD) {
		F_S1_AVG_PD = f_S1_AVG_PD;
	}
	public BigDecimal getF_S1_AVG_LGD() {
		return F_S1_AVG_LGD;
	}
	public void setF_S1_AVG_LGD(BigDecimal f_S1_AVG_LGD) {
		F_S1_AVG_LGD = f_S1_AVG_LGD;
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
	public BigDecimal getF_S2_FACILITY_COUNT() {
		return F_S2_FACILITY_COUNT;
	}
	public void setF_S2_FACILITY_COUNT(BigDecimal f_S2_FACILITY_COUNT) {
		F_S2_FACILITY_COUNT = f_S2_FACILITY_COUNT;
	}
	public BigDecimal getF_S2_BARROW_COUNT() {
		return F_S2_BARROW_COUNT;
	}
	public void setF_S2_BARROW_COUNT(BigDecimal f_S2_BARROW_COUNT) {
		F_S2_BARROW_COUNT = f_S2_BARROW_COUNT;
	}
	public BigDecimal getF_S2_AVG_PD() {
		return F_S2_AVG_PD;
	}
	public void setF_S2_AVG_PD(BigDecimal f_S2_AVG_PD) {
		F_S2_AVG_PD = f_S2_AVG_PD;
	}
	public BigDecimal getF_S2_AVG_LGD() {
		return F_S2_AVG_LGD;
	}
	public void setF_S2_AVG_LGD(BigDecimal f_S2_AVG_LGD) {
		F_S2_AVG_LGD = f_S2_AVG_LGD;
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
	public BigDecimal getF_S3_FACILITY_COUNT() {
		return F_S3_FACILITY_COUNT;
	}
	public void setF_S3_FACILITY_COUNT(BigDecimal f_S3_FACILITY_COUNT) {
		F_S3_FACILITY_COUNT = f_S3_FACILITY_COUNT;
	}
	public BigDecimal getF_S3_BARROW_COUNT() {
		return F_S3_BARROW_COUNT;
	}
	public void setF_S3_BARROW_COUNT(BigDecimal f_S3_BARROW_COUNT) {
		F_S3_BARROW_COUNT = f_S3_BARROW_COUNT;
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
	public BigDecimal getG_S1_FACILITY_COUNT() {
		return G_S1_FACILITY_COUNT;
	}
	public void setG_S1_FACILITY_COUNT(BigDecimal g_S1_FACILITY_COUNT) {
		G_S1_FACILITY_COUNT = g_S1_FACILITY_COUNT;
	}
	public BigDecimal getG_S1_BARROW_COUNT() {
		return G_S1_BARROW_COUNT;
	}
	public void setG_S1_BARROW_COUNT(BigDecimal g_S1_BARROW_COUNT) {
		G_S1_BARROW_COUNT = g_S1_BARROW_COUNT;
	}
	public BigDecimal getG_S1_AVG_PD() {
		return G_S1_AVG_PD;
	}
	public void setG_S1_AVG_PD(BigDecimal g_S1_AVG_PD) {
		G_S1_AVG_PD = g_S1_AVG_PD;
	}
	public BigDecimal getG_S1_AVG_LGD() {
		return G_S1_AVG_LGD;
	}
	public void setG_S1_AVG_LGD(BigDecimal g_S1_AVG_LGD) {
		G_S1_AVG_LGD = g_S1_AVG_LGD;
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
	public BigDecimal getG_S2_FACILITY_COUNT() {
		return G_S2_FACILITY_COUNT;
	}
	public void setG_S2_FACILITY_COUNT(BigDecimal g_S2_FACILITY_COUNT) {
		G_S2_FACILITY_COUNT = g_S2_FACILITY_COUNT;
	}
	public BigDecimal getG_S2_BARROW_COUNT() {
		return G_S2_BARROW_COUNT;
	}
	public void setG_S2_BARROW_COUNT(BigDecimal g_S2_BARROW_COUNT) {
		G_S2_BARROW_COUNT = g_S2_BARROW_COUNT;
	}
	public BigDecimal getG_S2_AVG_PD() {
		return G_S2_AVG_PD;
	}
	public void setG_S2_AVG_PD(BigDecimal g_S2_AVG_PD) {
		G_S2_AVG_PD = g_S2_AVG_PD;
	}
	public BigDecimal getG_S2_AVG_LGD() {
		return G_S2_AVG_LGD;
	}
	public void setG_S2_AVG_LGD(BigDecimal g_S2_AVG_LGD) {
		G_S2_AVG_LGD = g_S2_AVG_LGD;
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
	public BigDecimal getG_S3_FACILITY_COUNT() {
		return G_S3_FACILITY_COUNT;
	}
	public void setG_S3_FACILITY_COUNT(BigDecimal g_S3_FACILITY_COUNT) {
		G_S3_FACILITY_COUNT = g_S3_FACILITY_COUNT;
	}
	public BigDecimal getG_S3_BARROW_COUNT() {
		return G_S3_BARROW_COUNT;
	}
	public void setG_S3_BARROW_COUNT(BigDecimal g_S3_BARROW_COUNT) {
		G_S3_BARROW_COUNT = g_S3_BARROW_COUNT;
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
	public BigDecimal getH_S1_FACILITY_COUNT() {
		return H_S1_FACILITY_COUNT;
	}
	public void setH_S1_FACILITY_COUNT(BigDecimal h_S1_FACILITY_COUNT) {
		H_S1_FACILITY_COUNT = h_S1_FACILITY_COUNT;
	}
	public BigDecimal getH_S1_BARROW_COUNT() {
		return H_S1_BARROW_COUNT;
	}
	public void setH_S1_BARROW_COUNT(BigDecimal h_S1_BARROW_COUNT) {
		H_S1_BARROW_COUNT = h_S1_BARROW_COUNT;
	}
	public BigDecimal getH_S1_AVG_PD() {
		return H_S1_AVG_PD;
	}
	public void setH_S1_AVG_PD(BigDecimal h_S1_AVG_PD) {
		H_S1_AVG_PD = h_S1_AVG_PD;
	}
	public BigDecimal getH_S1_AVG_LGD() {
		return H_S1_AVG_LGD;
	}
	public void setH_S1_AVG_LGD(BigDecimal h_S1_AVG_LGD) {
		H_S1_AVG_LGD = h_S1_AVG_LGD;
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
	public BigDecimal getH_S2_FACILITY_COUNT() {
		return H_S2_FACILITY_COUNT;
	}
	public void setH_S2_FACILITY_COUNT(BigDecimal h_S2_FACILITY_COUNT) {
		H_S2_FACILITY_COUNT = h_S2_FACILITY_COUNT;
	}
	public BigDecimal getH_S2_BARROW_COUNT() {
		return H_S2_BARROW_COUNT;
	}
	public void setH_S2_BARROW_COUNT(BigDecimal h_S2_BARROW_COUNT) {
		H_S2_BARROW_COUNT = h_S2_BARROW_COUNT;
	}
	public BigDecimal getH_S2_AVG_PD() {
		return H_S2_AVG_PD;
	}
	public void setH_S2_AVG_PD(BigDecimal h_S2_AVG_PD) {
		H_S2_AVG_PD = h_S2_AVG_PD;
	}
	public BigDecimal getH_S2_AVG_LGD() {
		return H_S2_AVG_LGD;
	}
	public void setH_S2_AVG_LGD(BigDecimal h_S2_AVG_LGD) {
		H_S2_AVG_LGD = h_S2_AVG_LGD;
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
	public BigDecimal getH_S3_FACILITY_COUNT() {
		return H_S3_FACILITY_COUNT;
	}
	public void setH_S3_FACILITY_COUNT(BigDecimal h_S3_FACILITY_COUNT) {
		H_S3_FACILITY_COUNT = h_S3_FACILITY_COUNT;
	}
	public BigDecimal getH_S3_BARROW_COUNT() {
		return H_S3_BARROW_COUNT;
	}
	public void setH_S3_BARROW_COUNT(BigDecimal h_S3_BARROW_COUNT) {
		H_S3_BARROW_COUNT = h_S3_BARROW_COUNT;
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
	public BigDecimal getI_S1_FACILITY_COUNT() {
		return I_S1_FACILITY_COUNT;
	}
	public void setI_S1_FACILITY_COUNT(BigDecimal i_S1_FACILITY_COUNT) {
		I_S1_FACILITY_COUNT = i_S1_FACILITY_COUNT;
	}
	public BigDecimal getI_S1_BARROW_COUNT() {
		return I_S1_BARROW_COUNT;
	}
	public void setI_S1_BARROW_COUNT(BigDecimal i_S1_BARROW_COUNT) {
		I_S1_BARROW_COUNT = i_S1_BARROW_COUNT;
	}
	public BigDecimal getI_S1_AVG_PD() {
		return I_S1_AVG_PD;
	}
	public void setI_S1_AVG_PD(BigDecimal i_S1_AVG_PD) {
		I_S1_AVG_PD = i_S1_AVG_PD;
	}
	public BigDecimal getI_S1_AVG_LGD() {
		return I_S1_AVG_LGD;
	}
	public void setI_S1_AVG_LGD(BigDecimal i_S1_AVG_LGD) {
		I_S1_AVG_LGD = i_S1_AVG_LGD;
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
	public BigDecimal getI_S2_FACILITY_COUNT() {
		return I_S2_FACILITY_COUNT;
	}
	public void setI_S2_FACILITY_COUNT(BigDecimal i_S2_FACILITY_COUNT) {
		I_S2_FACILITY_COUNT = i_S2_FACILITY_COUNT;
	}
	public BigDecimal getI_S2_BARROW_COUNT() {
		return I_S2_BARROW_COUNT;
	}
	public void setI_S2_BARROW_COUNT(BigDecimal i_S2_BARROW_COUNT) {
		I_S2_BARROW_COUNT = i_S2_BARROW_COUNT;
	}
	public BigDecimal getI_S2_AVG_PD() {
		return I_S2_AVG_PD;
	}
	public void setI_S2_AVG_PD(BigDecimal i_S2_AVG_PD) {
		I_S2_AVG_PD = i_S2_AVG_PD;
	}
	public BigDecimal getI_S2_AVG_LGD() {
		return I_S2_AVG_LGD;
	}
	public void setI_S2_AVG_LGD(BigDecimal i_S2_AVG_LGD) {
		I_S2_AVG_LGD = i_S2_AVG_LGD;
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
	public BigDecimal getI_S3_FACILITY_COUNT() {
		return I_S3_FACILITY_COUNT;
	}
	public void setI_S3_FACILITY_COUNT(BigDecimal i_S3_FACILITY_COUNT) {
		I_S3_FACILITY_COUNT = i_S3_FACILITY_COUNT;
	}
	public BigDecimal getI_S3_BARROW_COUNT() {
		return I_S3_BARROW_COUNT;
	}
	public void setI_S3_BARROW_COUNT(BigDecimal i_S3_BARROW_COUNT) {
		I_S3_BARROW_COUNT = i_S3_BARROW_COUNT;
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
	public String getJ_PRODUCT() {
		return J_PRODUCT;
	}
	public void setJ_PRODUCT(String j_PRODUCT) {
		J_PRODUCT = j_PRODUCT;
	}
	public BigDecimal getJ_S1_FACILITY_COUNT() {
		return J_S1_FACILITY_COUNT;
	}
	public void setJ_S1_FACILITY_COUNT(BigDecimal j_S1_FACILITY_COUNT) {
		J_S1_FACILITY_COUNT = j_S1_FACILITY_COUNT;
	}
	public BigDecimal getJ_S1_BARROW_COUNT() {
		return J_S1_BARROW_COUNT;
	}
	public void setJ_S1_BARROW_COUNT(BigDecimal j_S1_BARROW_COUNT) {
		J_S1_BARROW_COUNT = j_S1_BARROW_COUNT;
	}
	public BigDecimal getJ_S1_AVG_PD() {
		return J_S1_AVG_PD;
	}
	public void setJ_S1_AVG_PD(BigDecimal j_S1_AVG_PD) {
		J_S1_AVG_PD = j_S1_AVG_PD;
	}
	public BigDecimal getJ_S1_AVG_LGD() {
		return J_S1_AVG_LGD;
	}
	public void setJ_S1_AVG_LGD(BigDecimal j_S1_AVG_LGD) {
		J_S1_AVG_LGD = j_S1_AVG_LGD;
	}
	public BigDecimal getJ_S1_EAD_MUR() {
		return J_S1_EAD_MUR;
	}
	public void setJ_S1_EAD_MUR(BigDecimal j_S1_EAD_MUR) {
		J_S1_EAD_MUR = j_S1_EAD_MUR;
	}
	public BigDecimal getJ_S1_ECL_MUR() {
		return J_S1_ECL_MUR;
	}
	public void setJ_S1_ECL_MUR(BigDecimal j_S1_ECL_MUR) {
		J_S1_ECL_MUR = j_S1_ECL_MUR;
	}
	public BigDecimal getJ_S1_ECL_PERCENTAGE() {
		return J_S1_ECL_PERCENTAGE;
	}
	public void setJ_S1_ECL_PERCENTAGE(BigDecimal j_S1_ECL_PERCENTAGE) {
		J_S1_ECL_PERCENTAGE = j_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getJ_S2_FACILITY_COUNT() {
		return J_S2_FACILITY_COUNT;
	}
	public void setJ_S2_FACILITY_COUNT(BigDecimal j_S2_FACILITY_COUNT) {
		J_S2_FACILITY_COUNT = j_S2_FACILITY_COUNT;
	}
	public BigDecimal getJ_S2_BARROW_COUNT() {
		return J_S2_BARROW_COUNT;
	}
	public void setJ_S2_BARROW_COUNT(BigDecimal j_S2_BARROW_COUNT) {
		J_S2_BARROW_COUNT = j_S2_BARROW_COUNT;
	}
	public BigDecimal getJ_S2_AVG_PD() {
		return J_S2_AVG_PD;
	}
	public void setJ_S2_AVG_PD(BigDecimal j_S2_AVG_PD) {
		J_S2_AVG_PD = j_S2_AVG_PD;
	}
	public BigDecimal getJ_S2_AVG_LGD() {
		return J_S2_AVG_LGD;
	}
	public void setJ_S2_AVG_LGD(BigDecimal j_S2_AVG_LGD) {
		J_S2_AVG_LGD = j_S2_AVG_LGD;
	}
	public BigDecimal getJ_S2_EAD_MUR() {
		return J_S2_EAD_MUR;
	}
	public void setJ_S2_EAD_MUR(BigDecimal j_S2_EAD_MUR) {
		J_S2_EAD_MUR = j_S2_EAD_MUR;
	}
	public BigDecimal getJ_S2_ECL_MUR() {
		return J_S2_ECL_MUR;
	}
	public void setJ_S2_ECL_MUR(BigDecimal j_S2_ECL_MUR) {
		J_S2_ECL_MUR = j_S2_ECL_MUR;
	}
	public BigDecimal getJ_S2_ECL_PERCENTAGE() {
		return J_S2_ECL_PERCENTAGE;
	}
	public void setJ_S2_ECL_PERCENTAGE(BigDecimal j_S2_ECL_PERCENTAGE) {
		J_S2_ECL_PERCENTAGE = j_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getJ_S3_FACILITY_COUNT() {
		return J_S3_FACILITY_COUNT;
	}
	public void setJ_S3_FACILITY_COUNT(BigDecimal j_S3_FACILITY_COUNT) {
		J_S3_FACILITY_COUNT = j_S3_FACILITY_COUNT;
	}
	public BigDecimal getJ_S3_BARROW_COUNT() {
		return J_S3_BARROW_COUNT;
	}
	public void setJ_S3_BARROW_COUNT(BigDecimal j_S3_BARROW_COUNT) {
		J_S3_BARROW_COUNT = j_S3_BARROW_COUNT;
	}
	public BigDecimal getJ_S3_EAD_MUR() {
		return J_S3_EAD_MUR;
	}
	public void setJ_S3_EAD_MUR(BigDecimal j_S3_EAD_MUR) {
		J_S3_EAD_MUR = j_S3_EAD_MUR;
	}
	public BigDecimal getJ_S3_ECL_MUR() {
		return J_S3_ECL_MUR;
	}
	public void setJ_S3_ECL_MUR(BigDecimal j_S3_ECL_MUR) {
		J_S3_ECL_MUR = j_S3_ECL_MUR;
	}
	public BigDecimal getJ_S3_ECL_PERCENTAGE() {
		return J_S3_ECL_PERCENTAGE;
	}
	public void setJ_S3_ECL_PERCENTAGE(BigDecimal j_S3_ECL_PERCENTAGE) {
		J_S3_ECL_PERCENTAGE = j_S3_ECL_PERCENTAGE;
	}
	public String getK_PRODUCT() {
		return K_PRODUCT;
	}
	public void setK_PRODUCT(String k_PRODUCT) {
		K_PRODUCT = k_PRODUCT;
	}
	public BigDecimal getK_S1_FACILITY_COUNT() {
		return K_S1_FACILITY_COUNT;
	}
	public void setK_S1_FACILITY_COUNT(BigDecimal k_S1_FACILITY_COUNT) {
		K_S1_FACILITY_COUNT = k_S1_FACILITY_COUNT;
	}
	public BigDecimal getK_S1_BARROW_COUNT() {
		return K_S1_BARROW_COUNT;
	}
	public void setK_S1_BARROW_COUNT(BigDecimal k_S1_BARROW_COUNT) {
		K_S1_BARROW_COUNT = k_S1_BARROW_COUNT;
	}
	public BigDecimal getK_S1_AVG_PD() {
		return K_S1_AVG_PD;
	}
	public void setK_S1_AVG_PD(BigDecimal k_S1_AVG_PD) {
		K_S1_AVG_PD = k_S1_AVG_PD;
	}
	public BigDecimal getK_S1_AVG_LGD() {
		return K_S1_AVG_LGD;
	}
	public void setK_S1_AVG_LGD(BigDecimal k_S1_AVG_LGD) {
		K_S1_AVG_LGD = k_S1_AVG_LGD;
	}
	public BigDecimal getK_S1_EAD_MUR() {
		return K_S1_EAD_MUR;
	}
	public void setK_S1_EAD_MUR(BigDecimal k_S1_EAD_MUR) {
		K_S1_EAD_MUR = k_S1_EAD_MUR;
	}
	public BigDecimal getK_S1_ECL_MUR() {
		return K_S1_ECL_MUR;
	}
	public void setK_S1_ECL_MUR(BigDecimal k_S1_ECL_MUR) {
		K_S1_ECL_MUR = k_S1_ECL_MUR;
	}
	public BigDecimal getK_S1_ECL_PERCENTAGE() {
		return K_S1_ECL_PERCENTAGE;
	}
	public void setK_S1_ECL_PERCENTAGE(BigDecimal k_S1_ECL_PERCENTAGE) {
		K_S1_ECL_PERCENTAGE = k_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getK_S2_FACILITY_COUNT() {
		return K_S2_FACILITY_COUNT;
	}
	public void setK_S2_FACILITY_COUNT(BigDecimal k_S2_FACILITY_COUNT) {
		K_S2_FACILITY_COUNT = k_S2_FACILITY_COUNT;
	}
	public BigDecimal getK_S2_BARROW_COUNT() {
		return K_S2_BARROW_COUNT;
	}
	public void setK_S2_BARROW_COUNT(BigDecimal k_S2_BARROW_COUNT) {
		K_S2_BARROW_COUNT = k_S2_BARROW_COUNT;
	}
	public BigDecimal getK_S2_AVG_PD() {
		return K_S2_AVG_PD;
	}
	public void setK_S2_AVG_PD(BigDecimal k_S2_AVG_PD) {
		K_S2_AVG_PD = k_S2_AVG_PD;
	}
	public BigDecimal getK_S2_AVG_LGD() {
		return K_S2_AVG_LGD;
	}
	public void setK_S2_AVG_LGD(BigDecimal k_S2_AVG_LGD) {
		K_S2_AVG_LGD = k_S2_AVG_LGD;
	}
	public BigDecimal getK_S2_EAD_MUR() {
		return K_S2_EAD_MUR;
	}
	public void setK_S2_EAD_MUR(BigDecimal k_S2_EAD_MUR) {
		K_S2_EAD_MUR = k_S2_EAD_MUR;
	}
	public BigDecimal getK_S2_ECL_MUR() {
		return K_S2_ECL_MUR;
	}
	public void setK_S2_ECL_MUR(BigDecimal k_S2_ECL_MUR) {
		K_S2_ECL_MUR = k_S2_ECL_MUR;
	}
	public BigDecimal getK_S2_ECL_PERCENTAGE() {
		return K_S2_ECL_PERCENTAGE;
	}
	public void setK_S2_ECL_PERCENTAGE(BigDecimal k_S2_ECL_PERCENTAGE) {
		K_S2_ECL_PERCENTAGE = k_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getK_S3_FACILITY_COUNT() {
		return K_S3_FACILITY_COUNT;
	}
	public void setK_S3_FACILITY_COUNT(BigDecimal k_S3_FACILITY_COUNT) {
		K_S3_FACILITY_COUNT = k_S3_FACILITY_COUNT;
	}
	public BigDecimal getK_S3_BARROW_COUNT() {
		return K_S3_BARROW_COUNT;
	}
	public void setK_S3_BARROW_COUNT(BigDecimal k_S3_BARROW_COUNT) {
		K_S3_BARROW_COUNT = k_S3_BARROW_COUNT;
	}
	public BigDecimal getK_S3_EAD_MUR() {
		return K_S3_EAD_MUR;
	}
	public void setK_S3_EAD_MUR(BigDecimal k_S3_EAD_MUR) {
		K_S3_EAD_MUR = k_S3_EAD_MUR;
	}
	public BigDecimal getK_S3_ECL_MUR() {
		return K_S3_ECL_MUR;
	}
	public void setK_S3_ECL_MUR(BigDecimal k_S3_ECL_MUR) {
		K_S3_ECL_MUR = k_S3_ECL_MUR;
	}
	public BigDecimal getK_S3_ECL_PERCENTAGE() {
		return K_S3_ECL_PERCENTAGE;
	}
	public void setK_S3_ECL_PERCENTAGE(BigDecimal k_S3_ECL_PERCENTAGE) {
		K_S3_ECL_PERCENTAGE = k_S3_ECL_PERCENTAGE;
	}
	public String getL_PRODUCT() {
		return L_PRODUCT;
	}
	public void setL_PRODUCT(String l_PRODUCT) {
		L_PRODUCT = l_PRODUCT;
	}
	public BigDecimal getL_S1_FACILITY_COUNT() {
		return L_S1_FACILITY_COUNT;
	}
	public void setL_S1_FACILITY_COUNT(BigDecimal l_S1_FACILITY_COUNT) {
		L_S1_FACILITY_COUNT = l_S1_FACILITY_COUNT;
	}
	public BigDecimal getL_S1_BARROW_COUNT() {
		return L_S1_BARROW_COUNT;
	}
	public void setL_S1_BARROW_COUNT(BigDecimal l_S1_BARROW_COUNT) {
		L_S1_BARROW_COUNT = l_S1_BARROW_COUNT;
	}
	public BigDecimal getL_S1_AVG_PD() {
		return L_S1_AVG_PD;
	}
	public void setL_S1_AVG_PD(BigDecimal l_S1_AVG_PD) {
		L_S1_AVG_PD = l_S1_AVG_PD;
	}
	public BigDecimal getL_S1_AVG_LGD() {
		return L_S1_AVG_LGD;
	}
	public void setL_S1_AVG_LGD(BigDecimal l_S1_AVG_LGD) {
		L_S1_AVG_LGD = l_S1_AVG_LGD;
	}
	public BigDecimal getL_S1_EAD_MUR() {
		return L_S1_EAD_MUR;
	}
	public void setL_S1_EAD_MUR(BigDecimal l_S1_EAD_MUR) {
		L_S1_EAD_MUR = l_S1_EAD_MUR;
	}
	public BigDecimal getL_S1_ECL_MUR() {
		return L_S1_ECL_MUR;
	}
	public void setL_S1_ECL_MUR(BigDecimal l_S1_ECL_MUR) {
		L_S1_ECL_MUR = l_S1_ECL_MUR;
	}
	public BigDecimal getL_S1_ECL_PERCENTAGE() {
		return L_S1_ECL_PERCENTAGE;
	}
	public void setL_S1_ECL_PERCENTAGE(BigDecimal l_S1_ECL_PERCENTAGE) {
		L_S1_ECL_PERCENTAGE = l_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getL_S2_FACILITY_COUNT() {
		return L_S2_FACILITY_COUNT;
	}
	public void setL_S2_FACILITY_COUNT(BigDecimal l_S2_FACILITY_COUNT) {
		L_S2_FACILITY_COUNT = l_S2_FACILITY_COUNT;
	}
	public BigDecimal getL_S2_BARROW_COUNT() {
		return L_S2_BARROW_COUNT;
	}
	public void setL_S2_BARROW_COUNT(BigDecimal l_S2_BARROW_COUNT) {
		L_S2_BARROW_COUNT = l_S2_BARROW_COUNT;
	}
	public BigDecimal getL_S2_AVG_PD() {
		return L_S2_AVG_PD;
	}
	public void setL_S2_AVG_PD(BigDecimal l_S2_AVG_PD) {
		L_S2_AVG_PD = l_S2_AVG_PD;
	}
	public BigDecimal getL_S2_AVG_LGD() {
		return L_S2_AVG_LGD;
	}
	public void setL_S2_AVG_LGD(BigDecimal l_S2_AVG_LGD) {
		L_S2_AVG_LGD = l_S2_AVG_LGD;
	}
	public BigDecimal getL_S2_EAD_MUR() {
		return L_S2_EAD_MUR;
	}
	public void setL_S2_EAD_MUR(BigDecimal l_S2_EAD_MUR) {
		L_S2_EAD_MUR = l_S2_EAD_MUR;
	}
	public BigDecimal getL_S2_ECL_MUR() {
		return L_S2_ECL_MUR;
	}
	public void setL_S2_ECL_MUR(BigDecimal l_S2_ECL_MUR) {
		L_S2_ECL_MUR = l_S2_ECL_MUR;
	}
	public BigDecimal getL_S2_ECL_PERCENTAGE() {
		return L_S2_ECL_PERCENTAGE;
	}
	public void setL_S2_ECL_PERCENTAGE(BigDecimal l_S2_ECL_PERCENTAGE) {
		L_S2_ECL_PERCENTAGE = l_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getL_S3_FACILITY_COUNT() {
		return L_S3_FACILITY_COUNT;
	}
	public void setL_S3_FACILITY_COUNT(BigDecimal l_S3_FACILITY_COUNT) {
		L_S3_FACILITY_COUNT = l_S3_FACILITY_COUNT;
	}
	public BigDecimal getL_S3_BARROW_COUNT() {
		return L_S3_BARROW_COUNT;
	}
	public void setL_S3_BARROW_COUNT(BigDecimal l_S3_BARROW_COUNT) {
		L_S3_BARROW_COUNT = l_S3_BARROW_COUNT;
	}
	public BigDecimal getL_S3_EAD_MUR() {
		return L_S3_EAD_MUR;
	}
	public void setL_S3_EAD_MUR(BigDecimal l_S3_EAD_MUR) {
		L_S3_EAD_MUR = l_S3_EAD_MUR;
	}
	public BigDecimal getL_S3_ECL_MUR() {
		return L_S3_ECL_MUR;
	}
	public void setL_S3_ECL_MUR(BigDecimal l_S3_ECL_MUR) {
		L_S3_ECL_MUR = l_S3_ECL_MUR;
	}
	public BigDecimal getL_S3_ECL_PERCENTAGE() {
		return L_S3_ECL_PERCENTAGE;
	}
	public void setL_S3_ECL_PERCENTAGE(BigDecimal l_S3_ECL_PERCENTAGE) {
		L_S3_ECL_PERCENTAGE = l_S3_ECL_PERCENTAGE;
	}
	public String getM_PRODUCT() {
		return M_PRODUCT;
	}
	public void setM_PRODUCT(String m_PRODUCT) {
		M_PRODUCT = m_PRODUCT;
	}
	public BigDecimal getM_S1_FACILITY_COUNT() {
		return M_S1_FACILITY_COUNT;
	}
	public void setM_S1_FACILITY_COUNT(BigDecimal m_S1_FACILITY_COUNT) {
		M_S1_FACILITY_COUNT = m_S1_FACILITY_COUNT;
	}
	public BigDecimal getM_S1_BARROW_COUNT() {
		return M_S1_BARROW_COUNT;
	}
	public void setM_S1_BARROW_COUNT(BigDecimal m_S1_BARROW_COUNT) {
		M_S1_BARROW_COUNT = m_S1_BARROW_COUNT;
	}
	public BigDecimal getM_S1_AVG_PD() {
		return M_S1_AVG_PD;
	}
	public void setM_S1_AVG_PD(BigDecimal m_S1_AVG_PD) {
		M_S1_AVG_PD = m_S1_AVG_PD;
	}
	public BigDecimal getM_S1_AVG_LGD() {
		return M_S1_AVG_LGD;
	}
	public void setM_S1_AVG_LGD(BigDecimal m_S1_AVG_LGD) {
		M_S1_AVG_LGD = m_S1_AVG_LGD;
	}
	public BigDecimal getM_S1_EAD_MUR() {
		return M_S1_EAD_MUR;
	}
	public void setM_S1_EAD_MUR(BigDecimal m_S1_EAD_MUR) {
		M_S1_EAD_MUR = m_S1_EAD_MUR;
	}
	public BigDecimal getM_S1_ECL_MUR() {
		return M_S1_ECL_MUR;
	}
	public void setM_S1_ECL_MUR(BigDecimal m_S1_ECL_MUR) {
		M_S1_ECL_MUR = m_S1_ECL_MUR;
	}
	public BigDecimal getM_S1_ECL_PERCENTAGE() {
		return M_S1_ECL_PERCENTAGE;
	}
	public void setM_S1_ECL_PERCENTAGE(BigDecimal m_S1_ECL_PERCENTAGE) {
		M_S1_ECL_PERCENTAGE = m_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getM_S2_FACILITY_COUNT() {
		return M_S2_FACILITY_COUNT;
	}
	public void setM_S2_FACILITY_COUNT(BigDecimal m_S2_FACILITY_COUNT) {
		M_S2_FACILITY_COUNT = m_S2_FACILITY_COUNT;
	}
	public BigDecimal getM_S2_BARROW_COUNT() {
		return M_S2_BARROW_COUNT;
	}
	public void setM_S2_BARROW_COUNT(BigDecimal m_S2_BARROW_COUNT) {
		M_S2_BARROW_COUNT = m_S2_BARROW_COUNT;
	}
	public BigDecimal getM_S2_AVG_PD() {
		return M_S2_AVG_PD;
	}
	public void setM_S2_AVG_PD(BigDecimal m_S2_AVG_PD) {
		M_S2_AVG_PD = m_S2_AVG_PD;
	}
	public BigDecimal getM_S2_AVG_LGD() {
		return M_S2_AVG_LGD;
	}
	public void setM_S2_AVG_LGD(BigDecimal m_S2_AVG_LGD) {
		M_S2_AVG_LGD = m_S2_AVG_LGD;
	}
	public BigDecimal getM_S2_EAD_MUR() {
		return M_S2_EAD_MUR;
	}
	public void setM_S2_EAD_MUR(BigDecimal m_S2_EAD_MUR) {
		M_S2_EAD_MUR = m_S2_EAD_MUR;
	}
	public BigDecimal getM_S2_ECL_MUR() {
		return M_S2_ECL_MUR;
	}
	public void setM_S2_ECL_MUR(BigDecimal m_S2_ECL_MUR) {
		M_S2_ECL_MUR = m_S2_ECL_MUR;
	}
	public BigDecimal getM_S2_ECL_PERCENTAGE() {
		return M_S2_ECL_PERCENTAGE;
	}
	public void setM_S2_ECL_PERCENTAGE(BigDecimal m_S2_ECL_PERCENTAGE) {
		M_S2_ECL_PERCENTAGE = m_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getM_S3_FACILITY_COUNT() {
		return M_S3_FACILITY_COUNT;
	}
	public void setM_S3_FACILITY_COUNT(BigDecimal m_S3_FACILITY_COUNT) {
		M_S3_FACILITY_COUNT = m_S3_FACILITY_COUNT;
	}
	public BigDecimal getM_S3_BARROW_COUNT() {
		return M_S3_BARROW_COUNT;
	}
	public void setM_S3_BARROW_COUNT(BigDecimal m_S3_BARROW_COUNT) {
		M_S3_BARROW_COUNT = m_S3_BARROW_COUNT;
	}
	public BigDecimal getM_S3_EAD_MUR() {
		return M_S3_EAD_MUR;
	}
	public void setM_S3_EAD_MUR(BigDecimal m_S3_EAD_MUR) {
		M_S3_EAD_MUR = m_S3_EAD_MUR;
	}
	public BigDecimal getM_S3_ECL_MUR() {
		return M_S3_ECL_MUR;
	}
	public void setM_S3_ECL_MUR(BigDecimal m_S3_ECL_MUR) {
		M_S3_ECL_MUR = m_S3_ECL_MUR;
	}
	public BigDecimal getM_S3_ECL_PERCENTAGE() {
		return M_S3_ECL_PERCENTAGE;
	}
	public void setM_S3_ECL_PERCENTAGE(BigDecimal m_S3_ECL_PERCENTAGE) {
		M_S3_ECL_PERCENTAGE = m_S3_ECL_PERCENTAGE;
	}
	public String getN_PRODUCT() {
		return N_PRODUCT;
	}
	public void setN_PRODUCT(String n_PRODUCT) {
		N_PRODUCT = n_PRODUCT;
	}
	public BigDecimal getN_S1_FACILITY_COUNT() {
		return N_S1_FACILITY_COUNT;
	}
	public void setN_S1_FACILITY_COUNT(BigDecimal n_S1_FACILITY_COUNT) {
		N_S1_FACILITY_COUNT = n_S1_FACILITY_COUNT;
	}
	public BigDecimal getN_S1_BARROW_COUNT() {
		return N_S1_BARROW_COUNT;
	}
	public void setN_S1_BARROW_COUNT(BigDecimal n_S1_BARROW_COUNT) {
		N_S1_BARROW_COUNT = n_S1_BARROW_COUNT;
	}
	public BigDecimal getN_S1_AVG_PD() {
		return N_S1_AVG_PD;
	}
	public void setN_S1_AVG_PD(BigDecimal n_S1_AVG_PD) {
		N_S1_AVG_PD = n_S1_AVG_PD;
	}
	public BigDecimal getN_S1_AVG_LGD() {
		return N_S1_AVG_LGD;
	}
	public void setN_S1_AVG_LGD(BigDecimal n_S1_AVG_LGD) {
		N_S1_AVG_LGD = n_S1_AVG_LGD;
	}
	public BigDecimal getN_S1_EAD_MUR() {
		return N_S1_EAD_MUR;
	}
	public void setN_S1_EAD_MUR(BigDecimal n_S1_EAD_MUR) {
		N_S1_EAD_MUR = n_S1_EAD_MUR;
	}
	public BigDecimal getN_S1_ECL_MUR() {
		return N_S1_ECL_MUR;
	}
	public void setN_S1_ECL_MUR(BigDecimal n_S1_ECL_MUR) {
		N_S1_ECL_MUR = n_S1_ECL_MUR;
	}
	public BigDecimal getN_S1_ECL_PERCENTAGE() {
		return N_S1_ECL_PERCENTAGE;
	}
	public void setN_S1_ECL_PERCENTAGE(BigDecimal n_S1_ECL_PERCENTAGE) {
		N_S1_ECL_PERCENTAGE = n_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getN_S2_FACILITY_COUNT() {
		return N_S2_FACILITY_COUNT;
	}
	public void setN_S2_FACILITY_COUNT(BigDecimal n_S2_FACILITY_COUNT) {
		N_S2_FACILITY_COUNT = n_S2_FACILITY_COUNT;
	}
	public BigDecimal getN_S2_BARROW_COUNT() {
		return N_S2_BARROW_COUNT;
	}
	public void setN_S2_BARROW_COUNT(BigDecimal n_S2_BARROW_COUNT) {
		N_S2_BARROW_COUNT = n_S2_BARROW_COUNT;
	}
	public BigDecimal getN_S2_AVG_PD() {
		return N_S2_AVG_PD;
	}
	public void setN_S2_AVG_PD(BigDecimal n_S2_AVG_PD) {
		N_S2_AVG_PD = n_S2_AVG_PD;
	}
	public BigDecimal getN_S2_AVG_LGD() {
		return N_S2_AVG_LGD;
	}
	public void setN_S2_AVG_LGD(BigDecimal n_S2_AVG_LGD) {
		N_S2_AVG_LGD = n_S2_AVG_LGD;
	}
	public BigDecimal getN_S2_EAD_MUR() {
		return N_S2_EAD_MUR;
	}
	public void setN_S2_EAD_MUR(BigDecimal n_S2_EAD_MUR) {
		N_S2_EAD_MUR = n_S2_EAD_MUR;
	}
	public BigDecimal getN_S2_ECL_MUR() {
		return N_S2_ECL_MUR;
	}
	public void setN_S2_ECL_MUR(BigDecimal n_S2_ECL_MUR) {
		N_S2_ECL_MUR = n_S2_ECL_MUR;
	}
	public BigDecimal getN_S2_ECL_PERCENTAGE() {
		return N_S2_ECL_PERCENTAGE;
	}
	public void setN_S2_ECL_PERCENTAGE(BigDecimal n_S2_ECL_PERCENTAGE) {
		N_S2_ECL_PERCENTAGE = n_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getN_S3_FACILITY_COUNT() {
		return N_S3_FACILITY_COUNT;
	}
	public void setN_S3_FACILITY_COUNT(BigDecimal n_S3_FACILITY_COUNT) {
		N_S3_FACILITY_COUNT = n_S3_FACILITY_COUNT;
	}
	public BigDecimal getN_S3_BARROW_COUNT() {
		return N_S3_BARROW_COUNT;
	}
	public void setN_S3_BARROW_COUNT(BigDecimal n_S3_BARROW_COUNT) {
		N_S3_BARROW_COUNT = n_S3_BARROW_COUNT;
	}
	public BigDecimal getN_S3_EAD_MUR() {
		return N_S3_EAD_MUR;
	}
	public void setN_S3_EAD_MUR(BigDecimal n_S3_EAD_MUR) {
		N_S3_EAD_MUR = n_S3_EAD_MUR;
	}
	public BigDecimal getN_S3_ECL_MUR() {
		return N_S3_ECL_MUR;
	}
	public void setN_S3_ECL_MUR(BigDecimal n_S3_ECL_MUR) {
		N_S3_ECL_MUR = n_S3_ECL_MUR;
	}
	public BigDecimal getN_S3_ECL_PERCENTAGE() {
		return N_S3_ECL_PERCENTAGE;
	}
	public void setN_S3_ECL_PERCENTAGE(BigDecimal n_S3_ECL_PERCENTAGE) {
		N_S3_ECL_PERCENTAGE = n_S3_ECL_PERCENTAGE;
	}
	public String getO_PRODUCT() {
		return O_PRODUCT;
	}
	public void setO_PRODUCT(String o_PRODUCT) {
		O_PRODUCT = o_PRODUCT;
	}
	public BigDecimal getO_S1_FACILITY_COUNT() {
		return O_S1_FACILITY_COUNT;
	}
	public void setO_S1_FACILITY_COUNT(BigDecimal o_S1_FACILITY_COUNT) {
		O_S1_FACILITY_COUNT = o_S1_FACILITY_COUNT;
	}
	public BigDecimal getO_S1_BARROW_COUNT() {
		return O_S1_BARROW_COUNT;
	}
	public void setO_S1_BARROW_COUNT(BigDecimal o_S1_BARROW_COUNT) {
		O_S1_BARROW_COUNT = o_S1_BARROW_COUNT;
	}
	public BigDecimal getO_S1_AVG_PD() {
		return O_S1_AVG_PD;
	}
	public void setO_S1_AVG_PD(BigDecimal o_S1_AVG_PD) {
		O_S1_AVG_PD = o_S1_AVG_PD;
	}
	public BigDecimal getO_S1_AVG_LGD() {
		return O_S1_AVG_LGD;
	}
	public void setO_S1_AVG_LGD(BigDecimal o_S1_AVG_LGD) {
		O_S1_AVG_LGD = o_S1_AVG_LGD;
	}
	public BigDecimal getO_S1_EAD_MUR() {
		return O_S1_EAD_MUR;
	}
	public void setO_S1_EAD_MUR(BigDecimal o_S1_EAD_MUR) {
		O_S1_EAD_MUR = o_S1_EAD_MUR;
	}
	public BigDecimal getO_S1_ECL_MUR() {
		return O_S1_ECL_MUR;
	}
	public void setO_S1_ECL_MUR(BigDecimal o_S1_ECL_MUR) {
		O_S1_ECL_MUR = o_S1_ECL_MUR;
	}
	public BigDecimal getO_S1_ECL_PERCENTAGE() {
		return O_S1_ECL_PERCENTAGE;
	}
	public void setO_S1_ECL_PERCENTAGE(BigDecimal o_S1_ECL_PERCENTAGE) {
		O_S1_ECL_PERCENTAGE = o_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getO_S2_FACILITY_COUNT() {
		return O_S2_FACILITY_COUNT;
	}
	public void setO_S2_FACILITY_COUNT(BigDecimal o_S2_FACILITY_COUNT) {
		O_S2_FACILITY_COUNT = o_S2_FACILITY_COUNT;
	}
	public BigDecimal getO_S2_BARROW_COUNT() {
		return O_S2_BARROW_COUNT;
	}
	public void setO_S2_BARROW_COUNT(BigDecimal o_S2_BARROW_COUNT) {
		O_S2_BARROW_COUNT = o_S2_BARROW_COUNT;
	}
	public BigDecimal getO_S2_AVG_PD() {
		return O_S2_AVG_PD;
	}
	public void setO_S2_AVG_PD(BigDecimal o_S2_AVG_PD) {
		O_S2_AVG_PD = o_S2_AVG_PD;
	}
	public BigDecimal getO_S2_AVG_LGD() {
		return O_S2_AVG_LGD;
	}
	public void setO_S2_AVG_LGD(BigDecimal o_S2_AVG_LGD) {
		O_S2_AVG_LGD = o_S2_AVG_LGD;
	}
	public BigDecimal getO_S2_EAD_MUR() {
		return O_S2_EAD_MUR;
	}
	public void setO_S2_EAD_MUR(BigDecimal o_S2_EAD_MUR) {
		O_S2_EAD_MUR = o_S2_EAD_MUR;
	}
	public BigDecimal getO_S2_ECL_MUR() {
		return O_S2_ECL_MUR;
	}
	public void setO_S2_ECL_MUR(BigDecimal o_S2_ECL_MUR) {
		O_S2_ECL_MUR = o_S2_ECL_MUR;
	}
	public BigDecimal getO_S2_ECL_PERCENTAGE() {
		return O_S2_ECL_PERCENTAGE;
	}
	public void setO_S2_ECL_PERCENTAGE(BigDecimal o_S2_ECL_PERCENTAGE) {
		O_S2_ECL_PERCENTAGE = o_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getO_S3_FACILITY_COUNT() {
		return O_S3_FACILITY_COUNT;
	}
	public void setO_S3_FACILITY_COUNT(BigDecimal o_S3_FACILITY_COUNT) {
		O_S3_FACILITY_COUNT = o_S3_FACILITY_COUNT;
	}
	public BigDecimal getO_S3_BARROW_COUNT() {
		return O_S3_BARROW_COUNT;
	}
	public void setO_S3_BARROW_COUNT(BigDecimal o_S3_BARROW_COUNT) {
		O_S3_BARROW_COUNT = o_S3_BARROW_COUNT;
	}
	public BigDecimal getO_S3_EAD_MUR() {
		return O_S3_EAD_MUR;
	}
	public void setO_S3_EAD_MUR(BigDecimal o_S3_EAD_MUR) {
		O_S3_EAD_MUR = o_S3_EAD_MUR;
	}
	public BigDecimal getO_S3_ECL_MUR() {
		return O_S3_ECL_MUR;
	}
	public void setO_S3_ECL_MUR(BigDecimal o_S3_ECL_MUR) {
		O_S3_ECL_MUR = o_S3_ECL_MUR;
	}
	public BigDecimal getO_S3_ECL_PERCENTAGE() {
		return O_S3_ECL_PERCENTAGE;
	}
	public void setO_S3_ECL_PERCENTAGE(BigDecimal o_S3_ECL_PERCENTAGE) {
		O_S3_ECL_PERCENTAGE = o_S3_ECL_PERCENTAGE;
	}
	public String getP_PRODUCT() {
		return P_PRODUCT;
	}
	public void setP_PRODUCT(String p_PRODUCT) {
		P_PRODUCT = p_PRODUCT;
	}
	public BigDecimal getP_S1_FACILITY_COUNT() {
		return P_S1_FACILITY_COUNT;
	}
	public void setP_S1_FACILITY_COUNT(BigDecimal p_S1_FACILITY_COUNT) {
		P_S1_FACILITY_COUNT = p_S1_FACILITY_COUNT;
	}
	public BigDecimal getP_S1_BARROW_COUNT() {
		return P_S1_BARROW_COUNT;
	}
	public void setP_S1_BARROW_COUNT(BigDecimal p_S1_BARROW_COUNT) {
		P_S1_BARROW_COUNT = p_S1_BARROW_COUNT;
	}
	public BigDecimal getP_S1_AVG_PD() {
		return P_S1_AVG_PD;
	}
	public void setP_S1_AVG_PD(BigDecimal p_S1_AVG_PD) {
		P_S1_AVG_PD = p_S1_AVG_PD;
	}
	public BigDecimal getP_S1_AVG_LGD() {
		return P_S1_AVG_LGD;
	}
	public void setP_S1_AVG_LGD(BigDecimal p_S1_AVG_LGD) {
		P_S1_AVG_LGD = p_S1_AVG_LGD;
	}
	public BigDecimal getP_S1_EAD_MUR() {
		return P_S1_EAD_MUR;
	}
	public void setP_S1_EAD_MUR(BigDecimal p_S1_EAD_MUR) {
		P_S1_EAD_MUR = p_S1_EAD_MUR;
	}
	public BigDecimal getP_S1_ECL_MUR() {
		return P_S1_ECL_MUR;
	}
	public void setP_S1_ECL_MUR(BigDecimal p_S1_ECL_MUR) {
		P_S1_ECL_MUR = p_S1_ECL_MUR;
	}
	public BigDecimal getP_S1_ECL_PERCENTAGE() {
		return P_S1_ECL_PERCENTAGE;
	}
	public void setP_S1_ECL_PERCENTAGE(BigDecimal p_S1_ECL_PERCENTAGE) {
		P_S1_ECL_PERCENTAGE = p_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getP_S2_FACILITY_COUNT() {
		return P_S2_FACILITY_COUNT;
	}
	public void setP_S2_FACILITY_COUNT(BigDecimal p_S2_FACILITY_COUNT) {
		P_S2_FACILITY_COUNT = p_S2_FACILITY_COUNT;
	}
	public BigDecimal getP_S2_BARROW_COUNT() {
		return P_S2_BARROW_COUNT;
	}
	public void setP_S2_BARROW_COUNT(BigDecimal p_S2_BARROW_COUNT) {
		P_S2_BARROW_COUNT = p_S2_BARROW_COUNT;
	}
	public BigDecimal getP_S2_AVG_PD() {
		return P_S2_AVG_PD;
	}
	public void setP_S2_AVG_PD(BigDecimal p_S2_AVG_PD) {
		P_S2_AVG_PD = p_S2_AVG_PD;
	}
	public BigDecimal getP_S2_AVG_LGD() {
		return P_S2_AVG_LGD;
	}
	public void setP_S2_AVG_LGD(BigDecimal p_S2_AVG_LGD) {
		P_S2_AVG_LGD = p_S2_AVG_LGD;
	}
	public BigDecimal getP_S2_EAD_MUR() {
		return P_S2_EAD_MUR;
	}
	public void setP_S2_EAD_MUR(BigDecimal p_S2_EAD_MUR) {
		P_S2_EAD_MUR = p_S2_EAD_MUR;
	}
	public BigDecimal getP_S2_ECL_MUR() {
		return P_S2_ECL_MUR;
	}
	public void setP_S2_ECL_MUR(BigDecimal p_S2_ECL_MUR) {
		P_S2_ECL_MUR = p_S2_ECL_MUR;
	}
	public BigDecimal getP_S2_ECL_PERCENTAGE() {
		return P_S2_ECL_PERCENTAGE;
	}
	public void setP_S2_ECL_PERCENTAGE(BigDecimal p_S2_ECL_PERCENTAGE) {
		P_S2_ECL_PERCENTAGE = p_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getP_S3_FACILITY_COUNT() {
		return P_S3_FACILITY_COUNT;
	}
	public void setP_S3_FACILITY_COUNT(BigDecimal p_S3_FACILITY_COUNT) {
		P_S3_FACILITY_COUNT = p_S3_FACILITY_COUNT;
	}
	public BigDecimal getP_S3_BARROW_COUNT() {
		return P_S3_BARROW_COUNT;
	}
	public void setP_S3_BARROW_COUNT(BigDecimal p_S3_BARROW_COUNT) {
		P_S3_BARROW_COUNT = p_S3_BARROW_COUNT;
	}
	public BigDecimal getP_S3_EAD_MUR() {
		return P_S3_EAD_MUR;
	}
	public void setP_S3_EAD_MUR(BigDecimal p_S3_EAD_MUR) {
		P_S3_EAD_MUR = p_S3_EAD_MUR;
	}
	public BigDecimal getP_S3_ECL_MUR() {
		return P_S3_ECL_MUR;
	}
	public void setP_S3_ECL_MUR(BigDecimal p_S3_ECL_MUR) {
		P_S3_ECL_MUR = p_S3_ECL_MUR;
	}
	public BigDecimal getP_S3_ECL_PERCENTAGE() {
		return P_S3_ECL_PERCENTAGE;
	}
	public void setP_S3_ECL_PERCENTAGE(BigDecimal p_S3_ECL_PERCENTAGE) {
		P_S3_ECL_PERCENTAGE = p_S3_ECL_PERCENTAGE;
	}
	public String getQ_PRODUCT() {
		return Q_PRODUCT;
	}
	public void setQ_PRODUCT(String q_PRODUCT) {
		Q_PRODUCT = q_PRODUCT;
	}
	public BigDecimal getQ_S1_FACILITY_COUNT() {
		return Q_S1_FACILITY_COUNT;
	}
	public void setQ_S1_FACILITY_COUNT(BigDecimal q_S1_FACILITY_COUNT) {
		Q_S1_FACILITY_COUNT = q_S1_FACILITY_COUNT;
	}
	public BigDecimal getQ_S1_BARROW_COUNT() {
		return Q_S1_BARROW_COUNT;
	}
	public void setQ_S1_BARROW_COUNT(BigDecimal q_S1_BARROW_COUNT) {
		Q_S1_BARROW_COUNT = q_S1_BARROW_COUNT;
	}
	public BigDecimal getQ_S1_AVG_PD() {
		return Q_S1_AVG_PD;
	}
	public void setQ_S1_AVG_PD(BigDecimal q_S1_AVG_PD) {
		Q_S1_AVG_PD = q_S1_AVG_PD;
	}
	public BigDecimal getQ_S1_AVG_LGD() {
		return Q_S1_AVG_LGD;
	}
	public void setQ_S1_AVG_LGD(BigDecimal q_S1_AVG_LGD) {
		Q_S1_AVG_LGD = q_S1_AVG_LGD;
	}
	public BigDecimal getQ_S1_EAD_MUR() {
		return Q_S1_EAD_MUR;
	}
	public void setQ_S1_EAD_MUR(BigDecimal q_S1_EAD_MUR) {
		Q_S1_EAD_MUR = q_S1_EAD_MUR;
	}
	public BigDecimal getQ_S1_ECL_MUR() {
		return Q_S1_ECL_MUR;
	}
	public void setQ_S1_ECL_MUR(BigDecimal q_S1_ECL_MUR) {
		Q_S1_ECL_MUR = q_S1_ECL_MUR;
	}
	public BigDecimal getQ_S1_ECL_PERCENTAGE() {
		return Q_S1_ECL_PERCENTAGE;
	}
	public void setQ_S1_ECL_PERCENTAGE(BigDecimal q_S1_ECL_PERCENTAGE) {
		Q_S1_ECL_PERCENTAGE = q_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getQ_S2_FACILITY_COUNT() {
		return Q_S2_FACILITY_COUNT;
	}
	public void setQ_S2_FACILITY_COUNT(BigDecimal q_S2_FACILITY_COUNT) {
		Q_S2_FACILITY_COUNT = q_S2_FACILITY_COUNT;
	}
	public BigDecimal getQ_S2_BARROW_COUNT() {
		return Q_S2_BARROW_COUNT;
	}
	public void setQ_S2_BARROW_COUNT(BigDecimal q_S2_BARROW_COUNT) {
		Q_S2_BARROW_COUNT = q_S2_BARROW_COUNT;
	}
	public BigDecimal getQ_S2_AVG_PD() {
		return Q_S2_AVG_PD;
	}
	public void setQ_S2_AVG_PD(BigDecimal q_S2_AVG_PD) {
		Q_S2_AVG_PD = q_S2_AVG_PD;
	}
	public BigDecimal getQ_S2_AVG_LGD() {
		return Q_S2_AVG_LGD;
	}
	public void setQ_S2_AVG_LGD(BigDecimal q_S2_AVG_LGD) {
		Q_S2_AVG_LGD = q_S2_AVG_LGD;
	}
	public BigDecimal getQ_S2_EAD_MUR() {
		return Q_S2_EAD_MUR;
	}
	public void setQ_S2_EAD_MUR(BigDecimal q_S2_EAD_MUR) {
		Q_S2_EAD_MUR = q_S2_EAD_MUR;
	}
	public BigDecimal getQ_S2_ECL_MUR() {
		return Q_S2_ECL_MUR;
	}
	public void setQ_S2_ECL_MUR(BigDecimal q_S2_ECL_MUR) {
		Q_S2_ECL_MUR = q_S2_ECL_MUR;
	}
	public BigDecimal getQ_S2_ECL_PERCENTAGE() {
		return Q_S2_ECL_PERCENTAGE;
	}
	public void setQ_S2_ECL_PERCENTAGE(BigDecimal q_S2_ECL_PERCENTAGE) {
		Q_S2_ECL_PERCENTAGE = q_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getQ_S3_FACILITY_COUNT() {
		return Q_S3_FACILITY_COUNT;
	}
	public void setQ_S3_FACILITY_COUNT(BigDecimal q_S3_FACILITY_COUNT) {
		Q_S3_FACILITY_COUNT = q_S3_FACILITY_COUNT;
	}
	public BigDecimal getQ_S3_BARROW_COUNT() {
		return Q_S3_BARROW_COUNT;
	}
	public void setQ_S3_BARROW_COUNT(BigDecimal q_S3_BARROW_COUNT) {
		Q_S3_BARROW_COUNT = q_S3_BARROW_COUNT;
	}
	public BigDecimal getQ_S3_EAD_MUR() {
		return Q_S3_EAD_MUR;
	}
	public void setQ_S3_EAD_MUR(BigDecimal q_S3_EAD_MUR) {
		Q_S3_EAD_MUR = q_S3_EAD_MUR;
	}
	public BigDecimal getQ_S3_ECL_MUR() {
		return Q_S3_ECL_MUR;
	}
	public void setQ_S3_ECL_MUR(BigDecimal q_S3_ECL_MUR) {
		Q_S3_ECL_MUR = q_S3_ECL_MUR;
	}
	public BigDecimal getQ_S3_ECL_PERCENTAGE() {
		return Q_S3_ECL_PERCENTAGE;
	}
	public void setQ_S3_ECL_PERCENTAGE(BigDecimal q_S3_ECL_PERCENTAGE) {
		Q_S3_ECL_PERCENTAGE = q_S3_ECL_PERCENTAGE;
	}
	public String getR_PRODUCT() {
		return R_PRODUCT;
	}
	public void setR_PRODUCT(String r_PRODUCT) {
		R_PRODUCT = r_PRODUCT;
	}
	public BigDecimal getR_S1_FACILITY_COUNT() {
		return R_S1_FACILITY_COUNT;
	}
	public void setR_S1_FACILITY_COUNT(BigDecimal r_S1_FACILITY_COUNT) {
		R_S1_FACILITY_COUNT = r_S1_FACILITY_COUNT;
	}
	public BigDecimal getR_S1_BARROW_COUNT() {
		return R_S1_BARROW_COUNT;
	}
	public void setR_S1_BARROW_COUNT(BigDecimal r_S1_BARROW_COUNT) {
		R_S1_BARROW_COUNT = r_S1_BARROW_COUNT;
	}
	public BigDecimal getR_S1_AVG_PD() {
		return R_S1_AVG_PD;
	}
	public void setR_S1_AVG_PD(BigDecimal r_S1_AVG_PD) {
		R_S1_AVG_PD = r_S1_AVG_PD;
	}
	public BigDecimal getR_S1_AVG_LGD() {
		return R_S1_AVG_LGD;
	}
	public void setR_S1_AVG_LGD(BigDecimal r_S1_AVG_LGD) {
		R_S1_AVG_LGD = r_S1_AVG_LGD;
	}
	public BigDecimal getR_S1_EAD_MUR() {
		return R_S1_EAD_MUR;
	}
	public void setR_S1_EAD_MUR(BigDecimal r_S1_EAD_MUR) {
		R_S1_EAD_MUR = r_S1_EAD_MUR;
	}
	public BigDecimal getR_S1_ECL_MUR() {
		return R_S1_ECL_MUR;
	}
	public void setR_S1_ECL_MUR(BigDecimal r_S1_ECL_MUR) {
		R_S1_ECL_MUR = r_S1_ECL_MUR;
	}
	public BigDecimal getR_S1_ECL_PERCENTAGE() {
		return R_S1_ECL_PERCENTAGE;
	}
	public void setR_S1_ECL_PERCENTAGE(BigDecimal r_S1_ECL_PERCENTAGE) {
		R_S1_ECL_PERCENTAGE = r_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getR_S2_FACILITY_COUNT() {
		return R_S2_FACILITY_COUNT;
	}
	public void setR_S2_FACILITY_COUNT(BigDecimal r_S2_FACILITY_COUNT) {
		R_S2_FACILITY_COUNT = r_S2_FACILITY_COUNT;
	}
	public BigDecimal getR_S2_BARROW_COUNT() {
		return R_S2_BARROW_COUNT;
	}
	public void setR_S2_BARROW_COUNT(BigDecimal r_S2_BARROW_COUNT) {
		R_S2_BARROW_COUNT = r_S2_BARROW_COUNT;
	}
	public BigDecimal getR_S2_AVG_PD() {
		return R_S2_AVG_PD;
	}
	public void setR_S2_AVG_PD(BigDecimal r_S2_AVG_PD) {
		R_S2_AVG_PD = r_S2_AVG_PD;
	}
	public BigDecimal getR_S2_AVG_LGD() {
		return R_S2_AVG_LGD;
	}
	public void setR_S2_AVG_LGD(BigDecimal r_S2_AVG_LGD) {
		R_S2_AVG_LGD = r_S2_AVG_LGD;
	}
	public BigDecimal getR_S2_EAD_MUR() {
		return R_S2_EAD_MUR;
	}
	public void setR_S2_EAD_MUR(BigDecimal r_S2_EAD_MUR) {
		R_S2_EAD_MUR = r_S2_EAD_MUR;
	}
	public BigDecimal getR_S2_ECL_MUR() {
		return R_S2_ECL_MUR;
	}
	public void setR_S2_ECL_MUR(BigDecimal r_S2_ECL_MUR) {
		R_S2_ECL_MUR = r_S2_ECL_MUR;
	}
	public BigDecimal getR_S2_ECL_PERCENTAGE() {
		return R_S2_ECL_PERCENTAGE;
	}
	public void setR_S2_ECL_PERCENTAGE(BigDecimal r_S2_ECL_PERCENTAGE) {
		R_S2_ECL_PERCENTAGE = r_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getR_S3_FACILITY_COUNT() {
		return R_S3_FACILITY_COUNT;
	}
	public void setR_S3_FACILITY_COUNT(BigDecimal r_S3_FACILITY_COUNT) {
		R_S3_FACILITY_COUNT = r_S3_FACILITY_COUNT;
	}
	public BigDecimal getR_S3_BARROW_COUNT() {
		return R_S3_BARROW_COUNT;
	}
	public void setR_S3_BARROW_COUNT(BigDecimal r_S3_BARROW_COUNT) {
		R_S3_BARROW_COUNT = r_S3_BARROW_COUNT;
	}
	public BigDecimal getR_S3_EAD_MUR() {
		return R_S3_EAD_MUR;
	}
	public void setR_S3_EAD_MUR(BigDecimal r_S3_EAD_MUR) {
		R_S3_EAD_MUR = r_S3_EAD_MUR;
	}
	public BigDecimal getR_S3_ECL_MUR() {
		return R_S3_ECL_MUR;
	}
	public void setR_S3_ECL_MUR(BigDecimal r_S3_ECL_MUR) {
		R_S3_ECL_MUR = r_S3_ECL_MUR;
	}
	public BigDecimal getR_S3_ECL_PERCENTAGE() {
		return R_S3_ECL_PERCENTAGE;
	}
	public void setR_S3_ECL_PERCENTAGE(BigDecimal r_S3_ECL_PERCENTAGE) {
		R_S3_ECL_PERCENTAGE = r_S3_ECL_PERCENTAGE;
	}
	public String getS_PRODUCT() {
		return S_PRODUCT;
	}
	public void setS_PRODUCT(String s_PRODUCT) {
		S_PRODUCT = s_PRODUCT;
	}
	public BigDecimal getS_S1_FACILITY_COUNT() {
		return S_S1_FACILITY_COUNT;
	}
	public void setS_S1_FACILITY_COUNT(BigDecimal s_S1_FACILITY_COUNT) {
		S_S1_FACILITY_COUNT = s_S1_FACILITY_COUNT;
	}
	public BigDecimal getS_S1_BARROW_COUNT() {
		return S_S1_BARROW_COUNT;
	}
	public void setS_S1_BARROW_COUNT(BigDecimal s_S1_BARROW_COUNT) {
		S_S1_BARROW_COUNT = s_S1_BARROW_COUNT;
	}
	public BigDecimal getS_S1_AVG_PD() {
		return S_S1_AVG_PD;
	}
	public void setS_S1_AVG_PD(BigDecimal s_S1_AVG_PD) {
		S_S1_AVG_PD = s_S1_AVG_PD;
	}
	public BigDecimal getS_S1_AVG_LGD() {
		return S_S1_AVG_LGD;
	}
	public void setS_S1_AVG_LGD(BigDecimal s_S1_AVG_LGD) {
		S_S1_AVG_LGD = s_S1_AVG_LGD;
	}
	public BigDecimal getS_S1_EAD_MUR() {
		return S_S1_EAD_MUR;
	}
	public void setS_S1_EAD_MUR(BigDecimal s_S1_EAD_MUR) {
		S_S1_EAD_MUR = s_S1_EAD_MUR;
	}
	public BigDecimal getS_S1_ECL_MUR() {
		return S_S1_ECL_MUR;
	}
	public void setS_S1_ECL_MUR(BigDecimal s_S1_ECL_MUR) {
		S_S1_ECL_MUR = s_S1_ECL_MUR;
	}
	public BigDecimal getS_S1_ECL_PERCENTAGE() {
		return S_S1_ECL_PERCENTAGE;
	}
	public void setS_S1_ECL_PERCENTAGE(BigDecimal s_S1_ECL_PERCENTAGE) {
		S_S1_ECL_PERCENTAGE = s_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getS_S2_FACILITY_COUNT() {
		return S_S2_FACILITY_COUNT;
	}
	public void setS_S2_FACILITY_COUNT(BigDecimal s_S2_FACILITY_COUNT) {
		S_S2_FACILITY_COUNT = s_S2_FACILITY_COUNT;
	}
	public BigDecimal getS_S2_BARROW_COUNT() {
		return S_S2_BARROW_COUNT;
	}
	public void setS_S2_BARROW_COUNT(BigDecimal s_S2_BARROW_COUNT) {
		S_S2_BARROW_COUNT = s_S2_BARROW_COUNT;
	}
	public BigDecimal getS_S2_AVG_PD() {
		return S_S2_AVG_PD;
	}
	public void setS_S2_AVG_PD(BigDecimal s_S2_AVG_PD) {
		S_S2_AVG_PD = s_S2_AVG_PD;
	}
	public BigDecimal getS_S2_AVG_LGD() {
		return S_S2_AVG_LGD;
	}
	public void setS_S2_AVG_LGD(BigDecimal s_S2_AVG_LGD) {
		S_S2_AVG_LGD = s_S2_AVG_LGD;
	}
	public BigDecimal getS_S2_EAD_MUR() {
		return S_S2_EAD_MUR;
	}
	public void setS_S2_EAD_MUR(BigDecimal s_S2_EAD_MUR) {
		S_S2_EAD_MUR = s_S2_EAD_MUR;
	}
	public BigDecimal getS_S2_ECL_MUR() {
		return S_S2_ECL_MUR;
	}
	public void setS_S2_ECL_MUR(BigDecimal s_S2_ECL_MUR) {
		S_S2_ECL_MUR = s_S2_ECL_MUR;
	}
	public BigDecimal getS_S2_ECL_PERCENTAGE() {
		return S_S2_ECL_PERCENTAGE;
	}
	public void setS_S2_ECL_PERCENTAGE(BigDecimal s_S2_ECL_PERCENTAGE) {
		S_S2_ECL_PERCENTAGE = s_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getS_S3_FACILITY_COUNT() {
		return S_S3_FACILITY_COUNT;
	}
	public void setS_S3_FACILITY_COUNT(BigDecimal s_S3_FACILITY_COUNT) {
		S_S3_FACILITY_COUNT = s_S3_FACILITY_COUNT;
	}
	public BigDecimal getS_S3_BARROW_COUNT() {
		return S_S3_BARROW_COUNT;
	}
	public void setS_S3_BARROW_COUNT(BigDecimal s_S3_BARROW_COUNT) {
		S_S3_BARROW_COUNT = s_S3_BARROW_COUNT;
	}
	public BigDecimal getS_S3_EAD_MUR() {
		return S_S3_EAD_MUR;
	}
	public void setS_S3_EAD_MUR(BigDecimal s_S3_EAD_MUR) {
		S_S3_EAD_MUR = s_S3_EAD_MUR;
	}
	public BigDecimal getS_S3_ECL_MUR() {
		return S_S3_ECL_MUR;
	}
	public void setS_S3_ECL_MUR(BigDecimal s_S3_ECL_MUR) {
		S_S3_ECL_MUR = s_S3_ECL_MUR;
	}
	public BigDecimal getS_S3_ECL_PERCENTAGE() {
		return S_S3_ECL_PERCENTAGE;
	}
	public void setS_S3_ECL_PERCENTAGE(BigDecimal s_S3_ECL_PERCENTAGE) {
		S_S3_ECL_PERCENTAGE = s_S3_ECL_PERCENTAGE;
	}
	public String getT_PRODUCT() {
		return T_PRODUCT;
	}
	public void setT_PRODUCT(String t_PRODUCT) {
		T_PRODUCT = t_PRODUCT;
	}
	public BigDecimal getT_S1_FACILITY_COUNT() {
		return T_S1_FACILITY_COUNT;
	}
	public void setT_S1_FACILITY_COUNT(BigDecimal t_S1_FACILITY_COUNT) {
		T_S1_FACILITY_COUNT = t_S1_FACILITY_COUNT;
	}
	public BigDecimal getT_S1_BARROW_COUNT() {
		return T_S1_BARROW_COUNT;
	}
	public void setT_S1_BARROW_COUNT(BigDecimal t_S1_BARROW_COUNT) {
		T_S1_BARROW_COUNT = t_S1_BARROW_COUNT;
	}
	public BigDecimal getT_S1_AVG_PD() {
		return T_S1_AVG_PD;
	}
	public void setT_S1_AVG_PD(BigDecimal t_S1_AVG_PD) {
		T_S1_AVG_PD = t_S1_AVG_PD;
	}
	public BigDecimal getT_S1_AVG_LGD() {
		return T_S1_AVG_LGD;
	}
	public void setT_S1_AVG_LGD(BigDecimal t_S1_AVG_LGD) {
		T_S1_AVG_LGD = t_S1_AVG_LGD;
	}
	public BigDecimal getT_S1_EAD_MUR() {
		return T_S1_EAD_MUR;
	}
	public void setT_S1_EAD_MUR(BigDecimal t_S1_EAD_MUR) {
		T_S1_EAD_MUR = t_S1_EAD_MUR;
	}
	public BigDecimal getT_S1_ECL_MUR() {
		return T_S1_ECL_MUR;
	}
	public void setT_S1_ECL_MUR(BigDecimal t_S1_ECL_MUR) {
		T_S1_ECL_MUR = t_S1_ECL_MUR;
	}
	public BigDecimal getT_S1_ECL_PERCENTAGE() {
		return T_S1_ECL_PERCENTAGE;
	}
	public void setT_S1_ECL_PERCENTAGE(BigDecimal t_S1_ECL_PERCENTAGE) {
		T_S1_ECL_PERCENTAGE = t_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getT_S2_FACILITY_COUNT() {
		return T_S2_FACILITY_COUNT;
	}
	public void setT_S2_FACILITY_COUNT(BigDecimal t_S2_FACILITY_COUNT) {
		T_S2_FACILITY_COUNT = t_S2_FACILITY_COUNT;
	}
	public BigDecimal getT_S2_BARROW_COUNT() {
		return T_S2_BARROW_COUNT;
	}
	public void setT_S2_BARROW_COUNT(BigDecimal t_S2_BARROW_COUNT) {
		T_S2_BARROW_COUNT = t_S2_BARROW_COUNT;
	}
	public BigDecimal getT_S2_AVG_PD() {
		return T_S2_AVG_PD;
	}
	public void setT_S2_AVG_PD(BigDecimal t_S2_AVG_PD) {
		T_S2_AVG_PD = t_S2_AVG_PD;
	}
	public BigDecimal getT_S2_AVG_LGD() {
		return T_S2_AVG_LGD;
	}
	public void setT_S2_AVG_LGD(BigDecimal t_S2_AVG_LGD) {
		T_S2_AVG_LGD = t_S2_AVG_LGD;
	}
	public BigDecimal getT_S2_EAD_MUR() {
		return T_S2_EAD_MUR;
	}
	public void setT_S2_EAD_MUR(BigDecimal t_S2_EAD_MUR) {
		T_S2_EAD_MUR = t_S2_EAD_MUR;
	}
	public BigDecimal getT_S2_ECL_MUR() {
		return T_S2_ECL_MUR;
	}
	public void setT_S2_ECL_MUR(BigDecimal t_S2_ECL_MUR) {
		T_S2_ECL_MUR = t_S2_ECL_MUR;
	}
	public BigDecimal getT_S2_ECL_PERCENTAGE() {
		return T_S2_ECL_PERCENTAGE;
	}
	public void setT_S2_ECL_PERCENTAGE(BigDecimal t_S2_ECL_PERCENTAGE) {
		T_S2_ECL_PERCENTAGE = t_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getT_S3_FACILITY_COUNT() {
		return T_S3_FACILITY_COUNT;
	}
	public void setT_S3_FACILITY_COUNT(BigDecimal t_S3_FACILITY_COUNT) {
		T_S3_FACILITY_COUNT = t_S3_FACILITY_COUNT;
	}
	public BigDecimal getT_S3_BARROW_COUNT() {
		return T_S3_BARROW_COUNT;
	}
	public void setT_S3_BARROW_COUNT(BigDecimal t_S3_BARROW_COUNT) {
		T_S3_BARROW_COUNT = t_S3_BARROW_COUNT;
	}
	public BigDecimal getT_S3_EAD_MUR() {
		return T_S3_EAD_MUR;
	}
	public void setT_S3_EAD_MUR(BigDecimal t_S3_EAD_MUR) {
		T_S3_EAD_MUR = t_S3_EAD_MUR;
	}
	public BigDecimal getT_S3_ECL_MUR() {
		return T_S3_ECL_MUR;
	}
	public void setT_S3_ECL_MUR(BigDecimal t_S3_ECL_MUR) {
		T_S3_ECL_MUR = t_S3_ECL_MUR;
	}
	public BigDecimal getT_S3_ECL_PERCENTAGE() {
		return T_S3_ECL_PERCENTAGE;
	}
	public void setT_S3_ECL_PERCENTAGE(BigDecimal t_S3_ECL_PERCENTAGE) {
		T_S3_ECL_PERCENTAGE = t_S3_ECL_PERCENTAGE;
	}
	public String getU_PRODUCT() {
		return U_PRODUCT;
	}
	public void setU_PRODUCT(String u_PRODUCT) {
		U_PRODUCT = u_PRODUCT;
	}
	public BigDecimal getU_S1_FACILITY_COUNT() {
		return U_S1_FACILITY_COUNT;
	}
	public void setU_S1_FACILITY_COUNT(BigDecimal u_S1_FACILITY_COUNT) {
		U_S1_FACILITY_COUNT = u_S1_FACILITY_COUNT;
	}
	public BigDecimal getU_S1_BARROW_COUNT() {
		return U_S1_BARROW_COUNT;
	}
	public void setU_S1_BARROW_COUNT(BigDecimal u_S1_BARROW_COUNT) {
		U_S1_BARROW_COUNT = u_S1_BARROW_COUNT;
	}
	public BigDecimal getU_S1_AVG_PD() {
		return U_S1_AVG_PD;
	}
	public void setU_S1_AVG_PD(BigDecimal u_S1_AVG_PD) {
		U_S1_AVG_PD = u_S1_AVG_PD;
	}
	public BigDecimal getU_S1_AVG_LGD() {
		return U_S1_AVG_LGD;
	}
	public void setU_S1_AVG_LGD(BigDecimal u_S1_AVG_LGD) {
		U_S1_AVG_LGD = u_S1_AVG_LGD;
	}
	public BigDecimal getU_S1_EAD_MUR() {
		return U_S1_EAD_MUR;
	}
	public void setU_S1_EAD_MUR(BigDecimal u_S1_EAD_MUR) {
		U_S1_EAD_MUR = u_S1_EAD_MUR;
	}
	public BigDecimal getU_S1_ECL_MUR() {
		return U_S1_ECL_MUR;
	}
	public void setU_S1_ECL_MUR(BigDecimal u_S1_ECL_MUR) {
		U_S1_ECL_MUR = u_S1_ECL_MUR;
	}
	public BigDecimal getU_S1_ECL_PERCENTAGE() {
		return U_S1_ECL_PERCENTAGE;
	}
	public void setU_S1_ECL_PERCENTAGE(BigDecimal u_S1_ECL_PERCENTAGE) {
		U_S1_ECL_PERCENTAGE = u_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getU_S2_FACILITY_COUNT() {
		return U_S2_FACILITY_COUNT;
	}
	public void setU_S2_FACILITY_COUNT(BigDecimal u_S2_FACILITY_COUNT) {
		U_S2_FACILITY_COUNT = u_S2_FACILITY_COUNT;
	}
	public BigDecimal getU_S2_BARROW_COUNT() {
		return U_S2_BARROW_COUNT;
	}
	public void setU_S2_BARROW_COUNT(BigDecimal u_S2_BARROW_COUNT) {
		U_S2_BARROW_COUNT = u_S2_BARROW_COUNT;
	}
	public BigDecimal getU_S2_AVG_PD() {
		return U_S2_AVG_PD;
	}
	public void setU_S2_AVG_PD(BigDecimal u_S2_AVG_PD) {
		U_S2_AVG_PD = u_S2_AVG_PD;
	}
	public BigDecimal getU_S2_AVG_LGD() {
		return U_S2_AVG_LGD;
	}
	public void setU_S2_AVG_LGD(BigDecimal u_S2_AVG_LGD) {
		U_S2_AVG_LGD = u_S2_AVG_LGD;
	}
	public BigDecimal getU_S2_EAD_MUR() {
		return U_S2_EAD_MUR;
	}
	public void setU_S2_EAD_MUR(BigDecimal u_S2_EAD_MUR) {
		U_S2_EAD_MUR = u_S2_EAD_MUR;
	}
	public BigDecimal getU_S2_ECL_MUR() {
		return U_S2_ECL_MUR;
	}
	public void setU_S2_ECL_MUR(BigDecimal u_S2_ECL_MUR) {
		U_S2_ECL_MUR = u_S2_ECL_MUR;
	}
	public BigDecimal getU_S2_ECL_PERCENTAGE() {
		return U_S2_ECL_PERCENTAGE;
	}
	public void setU_S2_ECL_PERCENTAGE(BigDecimal u_S2_ECL_PERCENTAGE) {
		U_S2_ECL_PERCENTAGE = u_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getU_S3_FACILITY_COUNT() {
		return U_S3_FACILITY_COUNT;
	}
	public void setU_S3_FACILITY_COUNT(BigDecimal u_S3_FACILITY_COUNT) {
		U_S3_FACILITY_COUNT = u_S3_FACILITY_COUNT;
	}
	public BigDecimal getU_S3_BARROW_COUNT() {
		return U_S3_BARROW_COUNT;
	}
	public void setU_S3_BARROW_COUNT(BigDecimal u_S3_BARROW_COUNT) {
		U_S3_BARROW_COUNT = u_S3_BARROW_COUNT;
	}
	public BigDecimal getU_S3_EAD_MUR() {
		return U_S3_EAD_MUR;
	}
	public void setU_S3_EAD_MUR(BigDecimal u_S3_EAD_MUR) {
		U_S3_EAD_MUR = u_S3_EAD_MUR;
	}
	public BigDecimal getU_S3_ECL_MUR() {
		return U_S3_ECL_MUR;
	}
	public void setU_S3_ECL_MUR(BigDecimal u_S3_ECL_MUR) {
		U_S3_ECL_MUR = u_S3_ECL_MUR;
	}
	public BigDecimal getU_S3_ECL_PERCENTAGE() {
		return U_S3_ECL_PERCENTAGE;
	}
	public void setU_S3_ECL_PERCENTAGE(BigDecimal u_S3_ECL_PERCENTAGE) {
		U_S3_ECL_PERCENTAGE = u_S3_ECL_PERCENTAGE;
	}
	public String getV_PRODUCT() {
		return V_PRODUCT;
	}
	public void setV_PRODUCT(String v_PRODUCT) {
		V_PRODUCT = v_PRODUCT;
	}
	public BigDecimal getV_S1_FACILITY_COUNT() {
		return V_S1_FACILITY_COUNT;
	}
	public void setV_S1_FACILITY_COUNT(BigDecimal v_S1_FACILITY_COUNT) {
		V_S1_FACILITY_COUNT = v_S1_FACILITY_COUNT;
	}
	public BigDecimal getV_S1_BARROW_COUNT() {
		return V_S1_BARROW_COUNT;
	}
	public void setV_S1_BARROW_COUNT(BigDecimal v_S1_BARROW_COUNT) {
		V_S1_BARROW_COUNT = v_S1_BARROW_COUNT;
	}
	public BigDecimal getV_S1_AVG_PD() {
		return V_S1_AVG_PD;
	}
	public void setV_S1_AVG_PD(BigDecimal v_S1_AVG_PD) {
		V_S1_AVG_PD = v_S1_AVG_PD;
	}
	public BigDecimal getV_S1_AVG_LGD() {
		return V_S1_AVG_LGD;
	}
	public void setV_S1_AVG_LGD(BigDecimal v_S1_AVG_LGD) {
		V_S1_AVG_LGD = v_S1_AVG_LGD;
	}
	public BigDecimal getV_S1_EAD_MUR() {
		return V_S1_EAD_MUR;
	}
	public void setV_S1_EAD_MUR(BigDecimal v_S1_EAD_MUR) {
		V_S1_EAD_MUR = v_S1_EAD_MUR;
	}
	public BigDecimal getV_S1_ECL_MUR() {
		return V_S1_ECL_MUR;
	}
	public void setV_S1_ECL_MUR(BigDecimal v_S1_ECL_MUR) {
		V_S1_ECL_MUR = v_S1_ECL_MUR;
	}
	public BigDecimal getV_S1_ECL_PERCENTAGE() {
		return V_S1_ECL_PERCENTAGE;
	}
	public void setV_S1_ECL_PERCENTAGE(BigDecimal v_S1_ECL_PERCENTAGE) {
		V_S1_ECL_PERCENTAGE = v_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getV_S2_FACILITY_COUNT() {
		return V_S2_FACILITY_COUNT;
	}
	public void setV_S2_FACILITY_COUNT(BigDecimal v_S2_FACILITY_COUNT) {
		V_S2_FACILITY_COUNT = v_S2_FACILITY_COUNT;
	}
	public BigDecimal getV_S2_BARROW_COUNT() {
		return V_S2_BARROW_COUNT;
	}
	public void setV_S2_BARROW_COUNT(BigDecimal v_S2_BARROW_COUNT) {
		V_S2_BARROW_COUNT = v_S2_BARROW_COUNT;
	}
	public BigDecimal getV_S2_AVG_PD() {
		return V_S2_AVG_PD;
	}
	public void setV_S2_AVG_PD(BigDecimal v_S2_AVG_PD) {
		V_S2_AVG_PD = v_S2_AVG_PD;
	}
	public BigDecimal getV_S2_AVG_LGD() {
		return V_S2_AVG_LGD;
	}
	public void setV_S2_AVG_LGD(BigDecimal v_S2_AVG_LGD) {
		V_S2_AVG_LGD = v_S2_AVG_LGD;
	}
	public BigDecimal getV_S2_EAD_MUR() {
		return V_S2_EAD_MUR;
	}
	public void setV_S2_EAD_MUR(BigDecimal v_S2_EAD_MUR) {
		V_S2_EAD_MUR = v_S2_EAD_MUR;
	}
	public BigDecimal getV_S2_ECL_MUR() {
		return V_S2_ECL_MUR;
	}
	public void setV_S2_ECL_MUR(BigDecimal v_S2_ECL_MUR) {
		V_S2_ECL_MUR = v_S2_ECL_MUR;
	}
	public BigDecimal getV_S2_ECL_PERCENTAGE() {
		return V_S2_ECL_PERCENTAGE;
	}
	public void setV_S2_ECL_PERCENTAGE(BigDecimal v_S2_ECL_PERCENTAGE) {
		V_S2_ECL_PERCENTAGE = v_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getV_S3_FACILITY_COUNT() {
		return V_S3_FACILITY_COUNT;
	}
	public void setV_S3_FACILITY_COUNT(BigDecimal v_S3_FACILITY_COUNT) {
		V_S3_FACILITY_COUNT = v_S3_FACILITY_COUNT;
	}
	public BigDecimal getV_S3_BARROW_COUNT() {
		return V_S3_BARROW_COUNT;
	}
	public void setV_S3_BARROW_COUNT(BigDecimal v_S3_BARROW_COUNT) {
		V_S3_BARROW_COUNT = v_S3_BARROW_COUNT;
	}
	public BigDecimal getV_S3_EAD_MUR() {
		return V_S3_EAD_MUR;
	}
	public void setV_S3_EAD_MUR(BigDecimal v_S3_EAD_MUR) {
		V_S3_EAD_MUR = v_S3_EAD_MUR;
	}
	public BigDecimal getV_S3_ECL_MUR() {
		return V_S3_ECL_MUR;
	}
	public void setV_S3_ECL_MUR(BigDecimal v_S3_ECL_MUR) {
		V_S3_ECL_MUR = v_S3_ECL_MUR;
	}
	public BigDecimal getV_S3_ECL_PERCENTAGE() {
		return V_S3_ECL_PERCENTAGE;
	}
	public void setV_S3_ECL_PERCENTAGE(BigDecimal v_S3_ECL_PERCENTAGE) {
		V_S3_ECL_PERCENTAGE = v_S3_ECL_PERCENTAGE;
	}
	public String getW_PRODUCT() {
		return W_PRODUCT;
	}
	public void setW_PRODUCT(String w_PRODUCT) {
		W_PRODUCT = w_PRODUCT;
	}
	public BigDecimal getW_S1_FACILITY_COUNT() {
		return W_S1_FACILITY_COUNT;
	}
	public void setW_S1_FACILITY_COUNT(BigDecimal w_S1_FACILITY_COUNT) {
		W_S1_FACILITY_COUNT = w_S1_FACILITY_COUNT;
	}
	public BigDecimal getW_S1_BARROW_COUNT() {
		return W_S1_BARROW_COUNT;
	}
	public void setW_S1_BARROW_COUNT(BigDecimal w_S1_BARROW_COUNT) {
		W_S1_BARROW_COUNT = w_S1_BARROW_COUNT;
	}
	public BigDecimal getW_S1_AVG_PD() {
		return W_S1_AVG_PD;
	}
	public void setW_S1_AVG_PD(BigDecimal w_S1_AVG_PD) {
		W_S1_AVG_PD = w_S1_AVG_PD;
	}
	public BigDecimal getW_S1_AVG_LGD() {
		return W_S1_AVG_LGD;
	}
	public void setW_S1_AVG_LGD(BigDecimal w_S1_AVG_LGD) {
		W_S1_AVG_LGD = w_S1_AVG_LGD;
	}
	public BigDecimal getW_S1_EAD_MUR() {
		return W_S1_EAD_MUR;
	}
	public void setW_S1_EAD_MUR(BigDecimal w_S1_EAD_MUR) {
		W_S1_EAD_MUR = w_S1_EAD_MUR;
	}
	public BigDecimal getW_S1_ECL_MUR() {
		return W_S1_ECL_MUR;
	}
	public void setW_S1_ECL_MUR(BigDecimal w_S1_ECL_MUR) {
		W_S1_ECL_MUR = w_S1_ECL_MUR;
	}
	public BigDecimal getW_S1_ECL_PERCENTAGE() {
		return W_S1_ECL_PERCENTAGE;
	}
	public void setW_S1_ECL_PERCENTAGE(BigDecimal w_S1_ECL_PERCENTAGE) {
		W_S1_ECL_PERCENTAGE = w_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getW_S2_FACILITY_COUNT() {
		return W_S2_FACILITY_COUNT;
	}
	public void setW_S2_FACILITY_COUNT(BigDecimal w_S2_FACILITY_COUNT) {
		W_S2_FACILITY_COUNT = w_S2_FACILITY_COUNT;
	}
	public BigDecimal getW_S2_BARROW_COUNT() {
		return W_S2_BARROW_COUNT;
	}
	public void setW_S2_BARROW_COUNT(BigDecimal w_S2_BARROW_COUNT) {
		W_S2_BARROW_COUNT = w_S2_BARROW_COUNT;
	}
	public BigDecimal getW_S2_AVG_PD() {
		return W_S2_AVG_PD;
	}
	public void setW_S2_AVG_PD(BigDecimal w_S2_AVG_PD) {
		W_S2_AVG_PD = w_S2_AVG_PD;
	}
	public BigDecimal getW_S2_AVG_LGD() {
		return W_S2_AVG_LGD;
	}
	public void setW_S2_AVG_LGD(BigDecimal w_S2_AVG_LGD) {
		W_S2_AVG_LGD = w_S2_AVG_LGD;
	}
	public BigDecimal getW_S2_EAD_MUR() {
		return W_S2_EAD_MUR;
	}
	public void setW_S2_EAD_MUR(BigDecimal w_S2_EAD_MUR) {
		W_S2_EAD_MUR = w_S2_EAD_MUR;
	}
	public BigDecimal getW_S2_ECL_MUR() {
		return W_S2_ECL_MUR;
	}
	public void setW_S2_ECL_MUR(BigDecimal w_S2_ECL_MUR) {
		W_S2_ECL_MUR = w_S2_ECL_MUR;
	}
	public BigDecimal getW_S2_ECL_PERCENTAGE() {
		return W_S2_ECL_PERCENTAGE;
	}
	public void setW_S2_ECL_PERCENTAGE(BigDecimal w_S2_ECL_PERCENTAGE) {
		W_S2_ECL_PERCENTAGE = w_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getW_S3_FACILITY_COUNT() {
		return W_S3_FACILITY_COUNT;
	}
	public void setW_S3_FACILITY_COUNT(BigDecimal w_S3_FACILITY_COUNT) {
		W_S3_FACILITY_COUNT = w_S3_FACILITY_COUNT;
	}
	public BigDecimal getW_S3_BARROW_COUNT() {
		return W_S3_BARROW_COUNT;
	}
	public void setW_S3_BARROW_COUNT(BigDecimal w_S3_BARROW_COUNT) {
		W_S3_BARROW_COUNT = w_S3_BARROW_COUNT;
	}
	public BigDecimal getW_S3_EAD_MUR() {
		return W_S3_EAD_MUR;
	}
	public void setW_S3_EAD_MUR(BigDecimal w_S3_EAD_MUR) {
		W_S3_EAD_MUR = w_S3_EAD_MUR;
	}
	public BigDecimal getW_S3_ECL_MUR() {
		return W_S3_ECL_MUR;
	}
	public void setW_S3_ECL_MUR(BigDecimal w_S3_ECL_MUR) {
		W_S3_ECL_MUR = w_S3_ECL_MUR;
	}
	public BigDecimal getW_S3_ECL_PERCENTAGE() {
		return W_S3_ECL_PERCENTAGE;
	}
	public void setW_S3_ECL_PERCENTAGE(BigDecimal w_S3_ECL_PERCENTAGE) {
		W_S3_ECL_PERCENTAGE = w_S3_ECL_PERCENTAGE;
	}
	public String getX_PRODUCT() {
		return X_PRODUCT;
	}
	public void setX_PRODUCT(String x_PRODUCT) {
		X_PRODUCT = x_PRODUCT;
	}
	public BigDecimal getX_S1_FACILITY_COUNT() {
		return X_S1_FACILITY_COUNT;
	}
	public void setX_S1_FACILITY_COUNT(BigDecimal x_S1_FACILITY_COUNT) {
		X_S1_FACILITY_COUNT = x_S1_FACILITY_COUNT;
	}
	public BigDecimal getX_S1_BARROW_COUNT() {
		return X_S1_BARROW_COUNT;
	}
	public void setX_S1_BARROW_COUNT(BigDecimal x_S1_BARROW_COUNT) {
		X_S1_BARROW_COUNT = x_S1_BARROW_COUNT;
	}
	public BigDecimal getX_S1_AVG_PD() {
		return X_S1_AVG_PD;
	}
	public void setX_S1_AVG_PD(BigDecimal x_S1_AVG_PD) {
		X_S1_AVG_PD = x_S1_AVG_PD;
	}
	public BigDecimal getX_S1_AVG_LGD() {
		return X_S1_AVG_LGD;
	}
	public void setX_S1_AVG_LGD(BigDecimal x_S1_AVG_LGD) {
		X_S1_AVG_LGD = x_S1_AVG_LGD;
	}
	public BigDecimal getX_S1_EAD_MUR() {
		return X_S1_EAD_MUR;
	}
	public void setX_S1_EAD_MUR(BigDecimal x_S1_EAD_MUR) {
		X_S1_EAD_MUR = x_S1_EAD_MUR;
	}
	public BigDecimal getX_S1_ECL_MUR() {
		return X_S1_ECL_MUR;
	}
	public void setX_S1_ECL_MUR(BigDecimal x_S1_ECL_MUR) {
		X_S1_ECL_MUR = x_S1_ECL_MUR;
	}
	public BigDecimal getX_S1_ECL_PERCENTAGE() {
		return X_S1_ECL_PERCENTAGE;
	}
	public void setX_S1_ECL_PERCENTAGE(BigDecimal x_S1_ECL_PERCENTAGE) {
		X_S1_ECL_PERCENTAGE = x_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getX_S2_FACILITY_COUNT() {
		return X_S2_FACILITY_COUNT;
	}
	public void setX_S2_FACILITY_COUNT(BigDecimal x_S2_FACILITY_COUNT) {
		X_S2_FACILITY_COUNT = x_S2_FACILITY_COUNT;
	}
	public BigDecimal getX_S2_BARROW_COUNT() {
		return X_S2_BARROW_COUNT;
	}
	public void setX_S2_BARROW_COUNT(BigDecimal x_S2_BARROW_COUNT) {
		X_S2_BARROW_COUNT = x_S2_BARROW_COUNT;
	}
	public BigDecimal getX_S2_AVG_PD() {
		return X_S2_AVG_PD;
	}
	public void setX_S2_AVG_PD(BigDecimal x_S2_AVG_PD) {
		X_S2_AVG_PD = x_S2_AVG_PD;
	}
	public BigDecimal getX_S2_AVG_LGD() {
		return X_S2_AVG_LGD;
	}
	public void setX_S2_AVG_LGD(BigDecimal x_S2_AVG_LGD) {
		X_S2_AVG_LGD = x_S2_AVG_LGD;
	}
	public BigDecimal getX_S2_EAD_MUR() {
		return X_S2_EAD_MUR;
	}
	public void setX_S2_EAD_MUR(BigDecimal x_S2_EAD_MUR) {
		X_S2_EAD_MUR = x_S2_EAD_MUR;
	}
	public BigDecimal getX_S2_ECL_MUR() {
		return X_S2_ECL_MUR;
	}
	public void setX_S2_ECL_MUR(BigDecimal x_S2_ECL_MUR) {
		X_S2_ECL_MUR = x_S2_ECL_MUR;
	}
	public BigDecimal getX_S2_ECL_PERCENTAGE() {
		return X_S2_ECL_PERCENTAGE;
	}
	public void setX_S2_ECL_PERCENTAGE(BigDecimal x_S2_ECL_PERCENTAGE) {
		X_S2_ECL_PERCENTAGE = x_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getX_S3_FACILITY_COUNT() {
		return X_S3_FACILITY_COUNT;
	}
	public void setX_S3_FACILITY_COUNT(BigDecimal x_S3_FACILITY_COUNT) {
		X_S3_FACILITY_COUNT = x_S3_FACILITY_COUNT;
	}
	public BigDecimal getX_S3_BARROW_COUNT() {
		return X_S3_BARROW_COUNT;
	}
	public void setX_S3_BARROW_COUNT(BigDecimal x_S3_BARROW_COUNT) {
		X_S3_BARROW_COUNT = x_S3_BARROW_COUNT;
	}
	public BigDecimal getX_S3_EAD_MUR() {
		return X_S3_EAD_MUR;
	}
	public void setX_S3_EAD_MUR(BigDecimal x_S3_EAD_MUR) {
		X_S3_EAD_MUR = x_S3_EAD_MUR;
	}
	public BigDecimal getX_S3_ECL_MUR() {
		return X_S3_ECL_MUR;
	}
	public void setX_S3_ECL_MUR(BigDecimal x_S3_ECL_MUR) {
		X_S3_ECL_MUR = x_S3_ECL_MUR;
	}
	public BigDecimal getX_S3_ECL_PERCENTAGE() {
		return X_S3_ECL_PERCENTAGE;
	}
	public void setX_S3_ECL_PERCENTAGE(BigDecimal x_S3_ECL_PERCENTAGE) {
		X_S3_ECL_PERCENTAGE = x_S3_ECL_PERCENTAGE;
	}
	public String getY_PRODUCT() {
		return Y_PRODUCT;
	}
	public void setY_PRODUCT(String y_PRODUCT) {
		Y_PRODUCT = y_PRODUCT;
	}
	public BigDecimal getY_S1_FACILITY_COUNT() {
		return Y_S1_FACILITY_COUNT;
	}
	public void setY_S1_FACILITY_COUNT(BigDecimal y_S1_FACILITY_COUNT) {
		Y_S1_FACILITY_COUNT = y_S1_FACILITY_COUNT;
	}
	public BigDecimal getY_S1_BARROW_COUNT() {
		return Y_S1_BARROW_COUNT;
	}
	public void setY_S1_BARROW_COUNT(BigDecimal y_S1_BARROW_COUNT) {
		Y_S1_BARROW_COUNT = y_S1_BARROW_COUNT;
	}
	public BigDecimal getY_S1_AVG_PD() {
		return Y_S1_AVG_PD;
	}
	public void setY_S1_AVG_PD(BigDecimal y_S1_AVG_PD) {
		Y_S1_AVG_PD = y_S1_AVG_PD;
	}
	public BigDecimal getY_S1_AVG_LGD() {
		return Y_S1_AVG_LGD;
	}
	public void setY_S1_AVG_LGD(BigDecimal y_S1_AVG_LGD) {
		Y_S1_AVG_LGD = y_S1_AVG_LGD;
	}
	public BigDecimal getY_S1_EAD_MUR() {
		return Y_S1_EAD_MUR;
	}
	public void setY_S1_EAD_MUR(BigDecimal y_S1_EAD_MUR) {
		Y_S1_EAD_MUR = y_S1_EAD_MUR;
	}
	public BigDecimal getY_S1_ECL_MUR() {
		return Y_S1_ECL_MUR;
	}
	public void setY_S1_ECL_MUR(BigDecimal y_S1_ECL_MUR) {
		Y_S1_ECL_MUR = y_S1_ECL_MUR;
	}
	public BigDecimal getY_S1_ECL_PERCENTAGE() {
		return Y_S1_ECL_PERCENTAGE;
	}
	public void setY_S1_ECL_PERCENTAGE(BigDecimal y_S1_ECL_PERCENTAGE) {
		Y_S1_ECL_PERCENTAGE = y_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getY_S2_FACILITY_COUNT() {
		return Y_S2_FACILITY_COUNT;
	}
	public void setY_S2_FACILITY_COUNT(BigDecimal y_S2_FACILITY_COUNT) {
		Y_S2_FACILITY_COUNT = y_S2_FACILITY_COUNT;
	}
	public BigDecimal getY_S2_BARROW_COUNT() {
		return Y_S2_BARROW_COUNT;
	}
	public void setY_S2_BARROW_COUNT(BigDecimal y_S2_BARROW_COUNT) {
		Y_S2_BARROW_COUNT = y_S2_BARROW_COUNT;
	}
	public BigDecimal getY_S2_AVG_PD() {
		return Y_S2_AVG_PD;
	}
	public void setY_S2_AVG_PD(BigDecimal y_S2_AVG_PD) {
		Y_S2_AVG_PD = y_S2_AVG_PD;
	}
	public BigDecimal getY_S2_AVG_LGD() {
		return Y_S2_AVG_LGD;
	}
	public void setY_S2_AVG_LGD(BigDecimal y_S2_AVG_LGD) {
		Y_S2_AVG_LGD = y_S2_AVG_LGD;
	}
	public BigDecimal getY_S2_EAD_MUR() {
		return Y_S2_EAD_MUR;
	}
	public void setY_S2_EAD_MUR(BigDecimal y_S2_EAD_MUR) {
		Y_S2_EAD_MUR = y_S2_EAD_MUR;
	}
	public BigDecimal getY_S2_ECL_MUR() {
		return Y_S2_ECL_MUR;
	}
	public void setY_S2_ECL_MUR(BigDecimal y_S2_ECL_MUR) {
		Y_S2_ECL_MUR = y_S2_ECL_MUR;
	}
	public BigDecimal getY_S2_ECL_PERCENTAGE() {
		return Y_S2_ECL_PERCENTAGE;
	}
	public void setY_S2_ECL_PERCENTAGE(BigDecimal y_S2_ECL_PERCENTAGE) {
		Y_S2_ECL_PERCENTAGE = y_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getY_S3_FACILITY_COUNT() {
		return Y_S3_FACILITY_COUNT;
	}
	public void setY_S3_FACILITY_COUNT(BigDecimal y_S3_FACILITY_COUNT) {
		Y_S3_FACILITY_COUNT = y_S3_FACILITY_COUNT;
	}
	public BigDecimal getY_S3_BARROW_COUNT() {
		return Y_S3_BARROW_COUNT;
	}
	public void setY_S3_BARROW_COUNT(BigDecimal y_S3_BARROW_COUNT) {
		Y_S3_BARROW_COUNT = y_S3_BARROW_COUNT;
	}
	public BigDecimal getY_S3_EAD_MUR() {
		return Y_S3_EAD_MUR;
	}
	public void setY_S3_EAD_MUR(BigDecimal y_S3_EAD_MUR) {
		Y_S3_EAD_MUR = y_S3_EAD_MUR;
	}
	public BigDecimal getY_S3_ECL_MUR() {
		return Y_S3_ECL_MUR;
	}
	public void setY_S3_ECL_MUR(BigDecimal y_S3_ECL_MUR) {
		Y_S3_ECL_MUR = y_S3_ECL_MUR;
	}
	public BigDecimal getY_S3_ECL_PERCENTAGE() {
		return Y_S3_ECL_PERCENTAGE;
	}
	public void setY_S3_ECL_PERCENTAGE(BigDecimal y_S3_ECL_PERCENTAGE) {
		Y_S3_ECL_PERCENTAGE = y_S3_ECL_PERCENTAGE;
	}
	public String getZ_PRODUCT() {
		return Z_PRODUCT;
	}
	public void setZ_PRODUCT(String z_PRODUCT) {
		Z_PRODUCT = z_PRODUCT;
	}
	public BigDecimal getZ_S1_FACILITY_COUNT() {
		return Z_S1_FACILITY_COUNT;
	}
	public void setZ_S1_FACILITY_COUNT(BigDecimal z_S1_FACILITY_COUNT) {
		Z_S1_FACILITY_COUNT = z_S1_FACILITY_COUNT;
	}
	public BigDecimal getZ_S1_BARROW_COUNT() {
		return Z_S1_BARROW_COUNT;
	}
	public void setZ_S1_BARROW_COUNT(BigDecimal z_S1_BARROW_COUNT) {
		Z_S1_BARROW_COUNT = z_S1_BARROW_COUNT;
	}
	public BigDecimal getZ_S1_AVG_PD() {
		return Z_S1_AVG_PD;
	}
	public void setZ_S1_AVG_PD(BigDecimal z_S1_AVG_PD) {
		Z_S1_AVG_PD = z_S1_AVG_PD;
	}
	public BigDecimal getZ_S1_AVG_LGD() {
		return Z_S1_AVG_LGD;
	}
	public void setZ_S1_AVG_LGD(BigDecimal z_S1_AVG_LGD) {
		Z_S1_AVG_LGD = z_S1_AVG_LGD;
	}
	public BigDecimal getZ_S1_EAD_MUR() {
		return Z_S1_EAD_MUR;
	}
	public void setZ_S1_EAD_MUR(BigDecimal z_S1_EAD_MUR) {
		Z_S1_EAD_MUR = z_S1_EAD_MUR;
	}
	public BigDecimal getZ_S1_ECL_MUR() {
		return Z_S1_ECL_MUR;
	}
	public void setZ_S1_ECL_MUR(BigDecimal z_S1_ECL_MUR) {
		Z_S1_ECL_MUR = z_S1_ECL_MUR;
	}
	public BigDecimal getZ_S1_ECL_PERCENTAGE() {
		return Z_S1_ECL_PERCENTAGE;
	}
	public void setZ_S1_ECL_PERCENTAGE(BigDecimal z_S1_ECL_PERCENTAGE) {
		Z_S1_ECL_PERCENTAGE = z_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getZ_S2_FACILITY_COUNT() {
		return Z_S2_FACILITY_COUNT;
	}
	public void setZ_S2_FACILITY_COUNT(BigDecimal z_S2_FACILITY_COUNT) {
		Z_S2_FACILITY_COUNT = z_S2_FACILITY_COUNT;
	}
	public BigDecimal getZ_S2_BARROW_COUNT() {
		return Z_S2_BARROW_COUNT;
	}
	public void setZ_S2_BARROW_COUNT(BigDecimal z_S2_BARROW_COUNT) {
		Z_S2_BARROW_COUNT = z_S2_BARROW_COUNT;
	}
	public BigDecimal getZ_S2_AVG_PD() {
		return Z_S2_AVG_PD;
	}
	public void setZ_S2_AVG_PD(BigDecimal z_S2_AVG_PD) {
		Z_S2_AVG_PD = z_S2_AVG_PD;
	}
	public BigDecimal getZ_S2_AVG_LGD() {
		return Z_S2_AVG_LGD;
	}
	public void setZ_S2_AVG_LGD(BigDecimal z_S2_AVG_LGD) {
		Z_S2_AVG_LGD = z_S2_AVG_LGD;
	}
	public BigDecimal getZ_S2_EAD_MUR() {
		return Z_S2_EAD_MUR;
	}
	public void setZ_S2_EAD_MUR(BigDecimal z_S2_EAD_MUR) {
		Z_S2_EAD_MUR = z_S2_EAD_MUR;
	}
	public BigDecimal getZ_S2_ECL_MUR() {
		return Z_S2_ECL_MUR;
	}
	public void setZ_S2_ECL_MUR(BigDecimal z_S2_ECL_MUR) {
		Z_S2_ECL_MUR = z_S2_ECL_MUR;
	}
	public BigDecimal getZ_S2_ECL_PERCENTAGE() {
		return Z_S2_ECL_PERCENTAGE;
	}
	public void setZ_S2_ECL_PERCENTAGE(BigDecimal z_S2_ECL_PERCENTAGE) {
		Z_S2_ECL_PERCENTAGE = z_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getZ_S3_FACILITY_COUNT() {
		return Z_S3_FACILITY_COUNT;
	}
	public void setZ_S3_FACILITY_COUNT(BigDecimal z_S3_FACILITY_COUNT) {
		Z_S3_FACILITY_COUNT = z_S3_FACILITY_COUNT;
	}
	public BigDecimal getZ_S3_BARROW_COUNT() {
		return Z_S3_BARROW_COUNT;
	}
	public void setZ_S3_BARROW_COUNT(BigDecimal z_S3_BARROW_COUNT) {
		Z_S3_BARROW_COUNT = z_S3_BARROW_COUNT;
	}
	public BigDecimal getZ_S3_EAD_MUR() {
		return Z_S3_EAD_MUR;
	}
	public void setZ_S3_EAD_MUR(BigDecimal z_S3_EAD_MUR) {
		Z_S3_EAD_MUR = z_S3_EAD_MUR;
	}
	public BigDecimal getZ_S3_ECL_MUR() {
		return Z_S3_ECL_MUR;
	}
	public void setZ_S3_ECL_MUR(BigDecimal z_S3_ECL_MUR) {
		Z_S3_ECL_MUR = z_S3_ECL_MUR;
	}
	public BigDecimal getZ_S3_ECL_PERCENTAGE() {
		return Z_S3_ECL_PERCENTAGE;
	}
	public void setZ_S3_ECL_PERCENTAGE(BigDecimal z_S3_ECL_PERCENTAGE) {
		Z_S3_ECL_PERCENTAGE = z_S3_ECL_PERCENTAGE;
	}
	public String getAA_PRODUCT() {
		return AA_PRODUCT;
	}
	public void setAA_PRODUCT(String aA_PRODUCT) {
		AA_PRODUCT = aA_PRODUCT;
	}
	public BigDecimal getAA_S1_FACILITY_COUNT() {
		return AA_S1_FACILITY_COUNT;
	}
	public void setAA_S1_FACILITY_COUNT(BigDecimal aA_S1_FACILITY_COUNT) {
		AA_S1_FACILITY_COUNT = aA_S1_FACILITY_COUNT;
	}
	public BigDecimal getAA_S1_BARROW_COUNT() {
		return AA_S1_BARROW_COUNT;
	}
	public void setAA_S1_BARROW_COUNT(BigDecimal aA_S1_BARROW_COUNT) {
		AA_S1_BARROW_COUNT = aA_S1_BARROW_COUNT;
	}
	public BigDecimal getAA_S1_AVG_PD() {
		return AA_S1_AVG_PD;
	}
	public void setAA_S1_AVG_PD(BigDecimal aA_S1_AVG_PD) {
		AA_S1_AVG_PD = aA_S1_AVG_PD;
	}
	public BigDecimal getAA_S1_AVG_LGD() {
		return AA_S1_AVG_LGD;
	}
	public void setAA_S1_AVG_LGD(BigDecimal aA_S1_AVG_LGD) {
		AA_S1_AVG_LGD = aA_S1_AVG_LGD;
	}
	public BigDecimal getAA_S1_EAD_MUR() {
		return AA_S1_EAD_MUR;
	}
	public void setAA_S1_EAD_MUR(BigDecimal aA_S1_EAD_MUR) {
		AA_S1_EAD_MUR = aA_S1_EAD_MUR;
	}
	public BigDecimal getAA_S1_ECL_MUR() {
		return AA_S1_ECL_MUR;
	}
	public void setAA_S1_ECL_MUR(BigDecimal aA_S1_ECL_MUR) {
		AA_S1_ECL_MUR = aA_S1_ECL_MUR;
	}
	public BigDecimal getAA_S1_ECL_PERCENTAGE() {
		return AA_S1_ECL_PERCENTAGE;
	}
	public void setAA_S1_ECL_PERCENTAGE(BigDecimal aA_S1_ECL_PERCENTAGE) {
		AA_S1_ECL_PERCENTAGE = aA_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getAA_S2_FACILITY_COUNT() {
		return AA_S2_FACILITY_COUNT;
	}
	public void setAA_S2_FACILITY_COUNT(BigDecimal aA_S2_FACILITY_COUNT) {
		AA_S2_FACILITY_COUNT = aA_S2_FACILITY_COUNT;
	}
	public BigDecimal getAA_S2_BARROW_COUNT() {
		return AA_S2_BARROW_COUNT;
	}
	public void setAA_S2_BARROW_COUNT(BigDecimal aA_S2_BARROW_COUNT) {
		AA_S2_BARROW_COUNT = aA_S2_BARROW_COUNT;
	}
	public BigDecimal getAA_S2_AVG_PD() {
		return AA_S2_AVG_PD;
	}
	public void setAA_S2_AVG_PD(BigDecimal aA_S2_AVG_PD) {
		AA_S2_AVG_PD = aA_S2_AVG_PD;
	}
	public BigDecimal getAA_S2_AVG_LGD() {
		return AA_S2_AVG_LGD;
	}
	public void setAA_S2_AVG_LGD(BigDecimal aA_S2_AVG_LGD) {
		AA_S2_AVG_LGD = aA_S2_AVG_LGD;
	}
	public BigDecimal getAA_S2_EAD_MUR() {
		return AA_S2_EAD_MUR;
	}
	public void setAA_S2_EAD_MUR(BigDecimal aA_S2_EAD_MUR) {
		AA_S2_EAD_MUR = aA_S2_EAD_MUR;
	}
	public BigDecimal getAA_S2_ECL_MUR() {
		return AA_S2_ECL_MUR;
	}
	public void setAA_S2_ECL_MUR(BigDecimal aA_S2_ECL_MUR) {
		AA_S2_ECL_MUR = aA_S2_ECL_MUR;
	}
	public BigDecimal getAA_S2_ECL_PERCENTAGE() {
		return AA_S2_ECL_PERCENTAGE;
	}
	public void setAA_S2_ECL_PERCENTAGE(BigDecimal aA_S2_ECL_PERCENTAGE) {
		AA_S2_ECL_PERCENTAGE = aA_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getAA_S3_FACILITY_COUNT() {
		return AA_S3_FACILITY_COUNT;
	}
	public void setAA_S3_FACILITY_COUNT(BigDecimal aA_S3_FACILITY_COUNT) {
		AA_S3_FACILITY_COUNT = aA_S3_FACILITY_COUNT;
	}
	public BigDecimal getAA_S3_BARROW_COUNT() {
		return AA_S3_BARROW_COUNT;
	}
	public void setAA_S3_BARROW_COUNT(BigDecimal aA_S3_BARROW_COUNT) {
		AA_S3_BARROW_COUNT = aA_S3_BARROW_COUNT;
	}
	public BigDecimal getAA_S3_EAD_MUR() {
		return AA_S3_EAD_MUR;
	}
	public void setAA_S3_EAD_MUR(BigDecimal aA_S3_EAD_MUR) {
		AA_S3_EAD_MUR = aA_S3_EAD_MUR;
	}
	public BigDecimal getAA_S3_ECL_MUR() {
		return AA_S3_ECL_MUR;
	}
	public void setAA_S3_ECL_MUR(BigDecimal aA_S3_ECL_MUR) {
		AA_S3_ECL_MUR = aA_S3_ECL_MUR;
	}
	public BigDecimal getAA_S3_ECL_PERCENTAGE() {
		return AA_S3_ECL_PERCENTAGE;
	}
	public void setAA_S3_ECL_PERCENTAGE(BigDecimal aA_S3_ECL_PERCENTAGE) {
		AA_S3_ECL_PERCENTAGE = aA_S3_ECL_PERCENTAGE;
	}
	public String getAB_PRODUCT() {
		return AB_PRODUCT;
	}
	public void setAB_PRODUCT(String aB_PRODUCT) {
		AB_PRODUCT = aB_PRODUCT;
	}
	public BigDecimal getAB_S1_FACILITY_COUNT() {
		return AB_S1_FACILITY_COUNT;
	}
	public void setAB_S1_FACILITY_COUNT(BigDecimal aB_S1_FACILITY_COUNT) {
		AB_S1_FACILITY_COUNT = aB_S1_FACILITY_COUNT;
	}
	public BigDecimal getAB_S1_BARROW_COUNT() {
		return AB_S1_BARROW_COUNT;
	}
	public void setAB_S1_BARROW_COUNT(BigDecimal aB_S1_BARROW_COUNT) {
		AB_S1_BARROW_COUNT = aB_S1_BARROW_COUNT;
	}
	public BigDecimal getAB_S1_AVG_PD() {
		return AB_S1_AVG_PD;
	}
	public void setAB_S1_AVG_PD(BigDecimal aB_S1_AVG_PD) {
		AB_S1_AVG_PD = aB_S1_AVG_PD;
	}
	public BigDecimal getAB_S1_AVG_LGD() {
		return AB_S1_AVG_LGD;
	}
	public void setAB_S1_AVG_LGD(BigDecimal aB_S1_AVG_LGD) {
		AB_S1_AVG_LGD = aB_S1_AVG_LGD;
	}
	public BigDecimal getAB_S1_EAD_MUR() {
		return AB_S1_EAD_MUR;
	}
	public void setAB_S1_EAD_MUR(BigDecimal aB_S1_EAD_MUR) {
		AB_S1_EAD_MUR = aB_S1_EAD_MUR;
	}
	public BigDecimal getAB_S1_ECL_MUR() {
		return AB_S1_ECL_MUR;
	}
	public void setAB_S1_ECL_MUR(BigDecimal aB_S1_ECL_MUR) {
		AB_S1_ECL_MUR = aB_S1_ECL_MUR;
	}
	public BigDecimal getAB_S1_ECL_PERCENTAGE() {
		return AB_S1_ECL_PERCENTAGE;
	}
	public void setAB_S1_ECL_PERCENTAGE(BigDecimal aB_S1_ECL_PERCENTAGE) {
		AB_S1_ECL_PERCENTAGE = aB_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getAB_S2_FACILITY_COUNT() {
		return AB_S2_FACILITY_COUNT;
	}
	public void setAB_S2_FACILITY_COUNT(BigDecimal aB_S2_FACILITY_COUNT) {
		AB_S2_FACILITY_COUNT = aB_S2_FACILITY_COUNT;
	}
	public BigDecimal getAB_S2_BARROW_COUNT() {
		return AB_S2_BARROW_COUNT;
	}
	public void setAB_S2_BARROW_COUNT(BigDecimal aB_S2_BARROW_COUNT) {
		AB_S2_BARROW_COUNT = aB_S2_BARROW_COUNT;
	}
	public BigDecimal getAB_S2_AVG_PD() {
		return AB_S2_AVG_PD;
	}
	public void setAB_S2_AVG_PD(BigDecimal aB_S2_AVG_PD) {
		AB_S2_AVG_PD = aB_S2_AVG_PD;
	}
	public BigDecimal getAB_S2_AVG_LGD() {
		return AB_S2_AVG_LGD;
	}
	public void setAB_S2_AVG_LGD(BigDecimal aB_S2_AVG_LGD) {
		AB_S2_AVG_LGD = aB_S2_AVG_LGD;
	}
	public BigDecimal getAB_S2_EAD_MUR() {
		return AB_S2_EAD_MUR;
	}
	public void setAB_S2_EAD_MUR(BigDecimal aB_S2_EAD_MUR) {
		AB_S2_EAD_MUR = aB_S2_EAD_MUR;
	}
	public BigDecimal getAB_S2_ECL_MUR() {
		return AB_S2_ECL_MUR;
	}
	public void setAB_S2_ECL_MUR(BigDecimal aB_S2_ECL_MUR) {
		AB_S2_ECL_MUR = aB_S2_ECL_MUR;
	}
	public BigDecimal getAB_S2_ECL_PERCENTAGE() {
		return AB_S2_ECL_PERCENTAGE;
	}
	public void setAB_S2_ECL_PERCENTAGE(BigDecimal aB_S2_ECL_PERCENTAGE) {
		AB_S2_ECL_PERCENTAGE = aB_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getAB_S3_FACILITY_COUNT() {
		return AB_S3_FACILITY_COUNT;
	}
	public void setAB_S3_FACILITY_COUNT(BigDecimal aB_S3_FACILITY_COUNT) {
		AB_S3_FACILITY_COUNT = aB_S3_FACILITY_COUNT;
	}
	public BigDecimal getAB_S3_BARROW_COUNT() {
		return AB_S3_BARROW_COUNT;
	}
	public void setAB_S3_BARROW_COUNT(BigDecimal aB_S3_BARROW_COUNT) {
		AB_S3_BARROW_COUNT = aB_S3_BARROW_COUNT;
	}
	public BigDecimal getAB_S3_EAD_MUR() {
		return AB_S3_EAD_MUR;
	}
	public void setAB_S3_EAD_MUR(BigDecimal aB_S3_EAD_MUR) {
		AB_S3_EAD_MUR = aB_S3_EAD_MUR;
	}
	public BigDecimal getAB_S3_ECL_MUR() {
		return AB_S3_ECL_MUR;
	}
	public void setAB_S3_ECL_MUR(BigDecimal aB_S3_ECL_MUR) {
		AB_S3_ECL_MUR = aB_S3_ECL_MUR;
	}
	public BigDecimal getAB_S3_ECL_PERCENTAGE() {
		return AB_S3_ECL_PERCENTAGE;
	}
	public void setAB_S3_ECL_PERCENTAGE(BigDecimal aB_S3_ECL_PERCENTAGE) {
		AB_S3_ECL_PERCENTAGE = aB_S3_ECL_PERCENTAGE;
	}
	public String getAC_PRODUCT() {
		return AC_PRODUCT;
	}
	public void setAC_PRODUCT(String aC_PRODUCT) {
		AC_PRODUCT = aC_PRODUCT;
	}
	public BigDecimal getAC_S1_FACILITY_COUNT() {
		return AC_S1_FACILITY_COUNT;
	}
	public void setAC_S1_FACILITY_COUNT(BigDecimal aC_S1_FACILITY_COUNT) {
		AC_S1_FACILITY_COUNT = aC_S1_FACILITY_COUNT;
	}
	public BigDecimal getAC_S1_BARROW_COUNT() {
		return AC_S1_BARROW_COUNT;
	}
	public void setAC_S1_BARROW_COUNT(BigDecimal aC_S1_BARROW_COUNT) {
		AC_S1_BARROW_COUNT = aC_S1_BARROW_COUNT;
	}
	public BigDecimal getAC_S1_AVG_PD() {
		return AC_S1_AVG_PD;
	}
	public void setAC_S1_AVG_PD(BigDecimal aC_S1_AVG_PD) {
		AC_S1_AVG_PD = aC_S1_AVG_PD;
	}
	public BigDecimal getAC_S1_AVG_LGD() {
		return AC_S1_AVG_LGD;
	}
	public void setAC_S1_AVG_LGD(BigDecimal aC_S1_AVG_LGD) {
		AC_S1_AVG_LGD = aC_S1_AVG_LGD;
	}
	public BigDecimal getAC_S1_EAD_MUR() {
		return AC_S1_EAD_MUR;
	}
	public void setAC_S1_EAD_MUR(BigDecimal aC_S1_EAD_MUR) {
		AC_S1_EAD_MUR = aC_S1_EAD_MUR;
	}
	public BigDecimal getAC_S1_ECL_MUR() {
		return AC_S1_ECL_MUR;
	}
	public void setAC_S1_ECL_MUR(BigDecimal aC_S1_ECL_MUR) {
		AC_S1_ECL_MUR = aC_S1_ECL_MUR;
	}
	public BigDecimal getAC_S1_ECL_PERCENTAGE() {
		return AC_S1_ECL_PERCENTAGE;
	}
	public void setAC_S1_ECL_PERCENTAGE(BigDecimal aC_S1_ECL_PERCENTAGE) {
		AC_S1_ECL_PERCENTAGE = aC_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getAC_S2_FACILITY_COUNT() {
		return AC_S2_FACILITY_COUNT;
	}
	public void setAC_S2_FACILITY_COUNT(BigDecimal aC_S2_FACILITY_COUNT) {
		AC_S2_FACILITY_COUNT = aC_S2_FACILITY_COUNT;
	}
	public BigDecimal getAC_S2_BARROW_COUNT() {
		return AC_S2_BARROW_COUNT;
	}
	public void setAC_S2_BARROW_COUNT(BigDecimal aC_S2_BARROW_COUNT) {
		AC_S2_BARROW_COUNT = aC_S2_BARROW_COUNT;
	}
	public BigDecimal getAC_S2_AVG_PD() {
		return AC_S2_AVG_PD;
	}
	public void setAC_S2_AVG_PD(BigDecimal aC_S2_AVG_PD) {
		AC_S2_AVG_PD = aC_S2_AVG_PD;
	}
	public BigDecimal getAC_S2_AVG_LGD() {
		return AC_S2_AVG_LGD;
	}
	public void setAC_S2_AVG_LGD(BigDecimal aC_S2_AVG_LGD) {
		AC_S2_AVG_LGD = aC_S2_AVG_LGD;
	}
	public BigDecimal getAC_S2_EAD_MUR() {
		return AC_S2_EAD_MUR;
	}
	public void setAC_S2_EAD_MUR(BigDecimal aC_S2_EAD_MUR) {
		AC_S2_EAD_MUR = aC_S2_EAD_MUR;
	}
	public BigDecimal getAC_S2_ECL_MUR() {
		return AC_S2_ECL_MUR;
	}
	public void setAC_S2_ECL_MUR(BigDecimal aC_S2_ECL_MUR) {
		AC_S2_ECL_MUR = aC_S2_ECL_MUR;
	}
	public BigDecimal getAC_S2_ECL_PERCENTAGE() {
		return AC_S2_ECL_PERCENTAGE;
	}
	public void setAC_S2_ECL_PERCENTAGE(BigDecimal aC_S2_ECL_PERCENTAGE) {
		AC_S2_ECL_PERCENTAGE = aC_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getAC_S3_FACILITY_COUNT() {
		return AC_S3_FACILITY_COUNT;
	}
	public void setAC_S3_FACILITY_COUNT(BigDecimal aC_S3_FACILITY_COUNT) {
		AC_S3_FACILITY_COUNT = aC_S3_FACILITY_COUNT;
	}
	public BigDecimal getAC_S3_BARROW_COUNT() {
		return AC_S3_BARROW_COUNT;
	}
	public void setAC_S3_BARROW_COUNT(BigDecimal aC_S3_BARROW_COUNT) {
		AC_S3_BARROW_COUNT = aC_S3_BARROW_COUNT;
	}
	public BigDecimal getAC_S3_EAD_MUR() {
		return AC_S3_EAD_MUR;
	}
	public void setAC_S3_EAD_MUR(BigDecimal aC_S3_EAD_MUR) {
		AC_S3_EAD_MUR = aC_S3_EAD_MUR;
	}
	public BigDecimal getAC_S3_ECL_MUR() {
		return AC_S3_ECL_MUR;
	}
	public void setAC_S3_ECL_MUR(BigDecimal aC_S3_ECL_MUR) {
		AC_S3_ECL_MUR = aC_S3_ECL_MUR;
	}
	public BigDecimal getAC_S3_ECL_PERCENTAGE() {
		return AC_S3_ECL_PERCENTAGE;
	}
	public void setAC_S3_ECL_PERCENTAGE(BigDecimal aC_S3_ECL_PERCENTAGE) {
		AC_S3_ECL_PERCENTAGE = aC_S3_ECL_PERCENTAGE;
	}
	public String getAD_PRODUCT() {
		return AD_PRODUCT;
	}
	public void setAD_PRODUCT(String aD_PRODUCT) {
		AD_PRODUCT = aD_PRODUCT;
	}
	public BigDecimal getAD_S1_FACILITY_COUNT() {
		return AD_S1_FACILITY_COUNT;
	}
	public void setAD_S1_FACILITY_COUNT(BigDecimal aD_S1_FACILITY_COUNT) {
		AD_S1_FACILITY_COUNT = aD_S1_FACILITY_COUNT;
	}
	public BigDecimal getAD_S1_BARROW_COUNT() {
		return AD_S1_BARROW_COUNT;
	}
	public void setAD_S1_BARROW_COUNT(BigDecimal aD_S1_BARROW_COUNT) {
		AD_S1_BARROW_COUNT = aD_S1_BARROW_COUNT;
	}
	public BigDecimal getAD_S1_AVG_PD() {
		return AD_S1_AVG_PD;
	}
	public void setAD_S1_AVG_PD(BigDecimal aD_S1_AVG_PD) {
		AD_S1_AVG_PD = aD_S1_AVG_PD;
	}
	public BigDecimal getAD_S1_AVG_LGD() {
		return AD_S1_AVG_LGD;
	}
	public void setAD_S1_AVG_LGD(BigDecimal aD_S1_AVG_LGD) {
		AD_S1_AVG_LGD = aD_S1_AVG_LGD;
	}
	public BigDecimal getAD_S1_EAD_MUR() {
		return AD_S1_EAD_MUR;
	}
	public void setAD_S1_EAD_MUR(BigDecimal aD_S1_EAD_MUR) {
		AD_S1_EAD_MUR = aD_S1_EAD_MUR;
	}
	public BigDecimal getAD_S1_ECL_MUR() {
		return AD_S1_ECL_MUR;
	}
	public void setAD_S1_ECL_MUR(BigDecimal aD_S1_ECL_MUR) {
		AD_S1_ECL_MUR = aD_S1_ECL_MUR;
	}
	public BigDecimal getAD_S1_ECL_PERCENTAGE() {
		return AD_S1_ECL_PERCENTAGE;
	}
	public void setAD_S1_ECL_PERCENTAGE(BigDecimal aD_S1_ECL_PERCENTAGE) {
		AD_S1_ECL_PERCENTAGE = aD_S1_ECL_PERCENTAGE;
	}
	public BigDecimal getAD_S2_FACILITY_COUNT() {
		return AD_S2_FACILITY_COUNT;
	}
	public void setAD_S2_FACILITY_COUNT(BigDecimal aD_S2_FACILITY_COUNT) {
		AD_S2_FACILITY_COUNT = aD_S2_FACILITY_COUNT;
	}
	public BigDecimal getAD_S2_BARROW_COUNT() {
		return AD_S2_BARROW_COUNT;
	}
	public void setAD_S2_BARROW_COUNT(BigDecimal aD_S2_BARROW_COUNT) {
		AD_S2_BARROW_COUNT = aD_S2_BARROW_COUNT;
	}
	public BigDecimal getAD_S2_AVG_PD() {
		return AD_S2_AVG_PD;
	}
	public void setAD_S2_AVG_PD(BigDecimal aD_S2_AVG_PD) {
		AD_S2_AVG_PD = aD_S2_AVG_PD;
	}
	public BigDecimal getAD_S2_AVG_LGD() {
		return AD_S2_AVG_LGD;
	}
	public void setAD_S2_AVG_LGD(BigDecimal aD_S2_AVG_LGD) {
		AD_S2_AVG_LGD = aD_S2_AVG_LGD;
	}
	public BigDecimal getAD_S2_EAD_MUR() {
		return AD_S2_EAD_MUR;
	}
	public void setAD_S2_EAD_MUR(BigDecimal aD_S2_EAD_MUR) {
		AD_S2_EAD_MUR = aD_S2_EAD_MUR;
	}
	public BigDecimal getAD_S2_ECL_MUR() {
		return AD_S2_ECL_MUR;
	}
	public void setAD_S2_ECL_MUR(BigDecimal aD_S2_ECL_MUR) {
		AD_S2_ECL_MUR = aD_S2_ECL_MUR;
	}
	public BigDecimal getAD_S2_ECL_PERCENTAGE() {
		return AD_S2_ECL_PERCENTAGE;
	}
	public void setAD_S2_ECL_PERCENTAGE(BigDecimal aD_S2_ECL_PERCENTAGE) {
		AD_S2_ECL_PERCENTAGE = aD_S2_ECL_PERCENTAGE;
	}
	public BigDecimal getAD_S3_FACILITY_COUNT() {
		return AD_S3_FACILITY_COUNT;
	}
	public void setAD_S3_FACILITY_COUNT(BigDecimal aD_S3_FACILITY_COUNT) {
		AD_S3_FACILITY_COUNT = aD_S3_FACILITY_COUNT;
	}
	public BigDecimal getAD_S3_BARROW_COUNT() {
		return AD_S3_BARROW_COUNT;
	}
	public void setAD_S3_BARROW_COUNT(BigDecimal aD_S3_BARROW_COUNT) {
		AD_S3_BARROW_COUNT = aD_S3_BARROW_COUNT;
	}
	public BigDecimal getAD_S3_EAD_MUR() {
		return AD_S3_EAD_MUR;
	}
	public void setAD_S3_EAD_MUR(BigDecimal aD_S3_EAD_MUR) {
		AD_S3_EAD_MUR = aD_S3_EAD_MUR;
	}
	public BigDecimal getAD_S3_ECL_MUR() {
		return AD_S3_ECL_MUR;
	}
	public void setAD_S3_ECL_MUR(BigDecimal aD_S3_ECL_MUR) {
		AD_S3_ECL_MUR = aD_S3_ECL_MUR;
	}
	public BigDecimal getAD_S3_ECL_PERCENTAGE() {
		return AD_S3_ECL_PERCENTAGE;
	}
	public void setAD_S3_ECL_PERCENTAGE(BigDecimal aD_S3_ECL_PERCENTAGE) {
		AD_S3_ECL_PERCENTAGE = aD_S3_ECL_PERCENTAGE;
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
	
	public T1IFRSQNReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  

}
