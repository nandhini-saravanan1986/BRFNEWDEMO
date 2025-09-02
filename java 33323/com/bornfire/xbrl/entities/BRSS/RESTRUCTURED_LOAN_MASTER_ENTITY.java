package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="RESTRUCTURED_LOAN_MASTER")
public class RESTRUCTURED_LOAN_MASTER_ENTITY {

	
	@EmbeddedId
	RESTRUCTURED_LOAN_ID res_id;
	
	private String	APPLICANT_NAME;
	private String	BUSINESS_REG_NUMBER;
	private String	COMPANY_REG_NUMBER;
	private String	NIC_PASSPORT;
	private String	MAIN_SHAREHOLDER;
	private String	BUSINESS_ADDRESS;
	private String	BUSINESS_SECTOR;
	private String	BUSINESS_ACTIVITY;
	private String	ISIC_CODE;
	private BigDecimal	NUMBER_OF_EMPLOYEE;
	private BigDecimal	TURNOVER_1;
	private BigDecimal	TURNOVER_2;
	private String	FACILITY_PROVIDER;
	private BigDecimal	AMOUNT_APP_MUR;
	private String	TYPE_OF_FACILITY;
	private BigDecimal	DURATION_OF_FACILITY;
	private String	COLLATERAL_PROVIDED;
	private String	OTHER_INS_SUPPORT;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	APPROVAL_REJ_DATE;
	private String	REJECTION_REASON;
	private String	REJECTION_REMARKS;
	private BigDecimal	AMOUNT_APPROVED_MUR;
	private BigDecimal	AMOUNT_DIS_AS_DATE;
	private BigDecimal	AMOUNT_CANCELLED_MUR;
	private BigDecimal	REPAYMENT_AS_DATE;
	private String	COMPANY_STA_DISBURSEMENT;
	private String	ARCH_FLG;
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	VERIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	VERIFY_TIME;
	private String  FORACID;
	
	public String getFORACID() {
		return FORACID;
	}
	public void setFORACID(String fORACID) {
		FORACID = fORACID;
	}
	public RESTRUCTURED_LOAN_ID getRes_id() {
		return res_id;
	}
	public void setRes_id(RESTRUCTURED_LOAN_ID res_id) {
		this.res_id = res_id;
	}
	public String getAPPLICANT_NAME() {
		return APPLICANT_NAME;
	}
	public void setAPPLICANT_NAME(String aPPLICANT_NAME) {
		APPLICANT_NAME = aPPLICANT_NAME;
	}
	public String getBUSINESS_REG_NUMBER() {
		return BUSINESS_REG_NUMBER;
	}
	public void setBUSINESS_REG_NUMBER(String bUSINESS_REG_NUMBER) {
		BUSINESS_REG_NUMBER = bUSINESS_REG_NUMBER;
	}
	public String getCOMPANY_REG_NUMBER() {
		return COMPANY_REG_NUMBER;
	}
	public void setCOMPANY_REG_NUMBER(String cOMPANY_REG_NUMBER) {
		COMPANY_REG_NUMBER = cOMPANY_REG_NUMBER;
	}
	public String getNIC_PASSPORT() {
		return NIC_PASSPORT;
	}
	public void setNIC_PASSPORT(String nIC_PASSPORT) {
		NIC_PASSPORT = nIC_PASSPORT;
	}
	public String getMAIN_SHAREHOLDER() {
		return MAIN_SHAREHOLDER;
	}
	public void setMAIN_SHAREHOLDER(String mAIN_SHAREHOLDER) {
		MAIN_SHAREHOLDER = mAIN_SHAREHOLDER;
	}
	public String getBUSINESS_ADDRESS() {
		return BUSINESS_ADDRESS;
	}
	public void setBUSINESS_ADDRESS(String bUSINESS_ADDRESS) {
		BUSINESS_ADDRESS = bUSINESS_ADDRESS;
	}
	public String getBUSINESS_SECTOR() {
		return BUSINESS_SECTOR;
	}
	public void setBUSINESS_SECTOR(String bUSINESS_SECTOR) {
		BUSINESS_SECTOR = bUSINESS_SECTOR;
	}
	public String getBUSINESS_ACTIVITY() {
		return BUSINESS_ACTIVITY;
	}
	public void setBUSINESS_ACTIVITY(String bUSINESS_ACTIVITY) {
		BUSINESS_ACTIVITY = bUSINESS_ACTIVITY;
	}
	public String getISIC_CODE() {
		return ISIC_CODE;
	}
	public void setISIC_CODE(String iSIC_CODE) {
		ISIC_CODE = iSIC_CODE;
	}
	public BigDecimal getNUMBER_OF_EMPLOYEE() {
		return NUMBER_OF_EMPLOYEE;
	}
	public void setNUMBER_OF_EMPLOYEE(BigDecimal nUMBER_OF_EMPLOYEE) {
		NUMBER_OF_EMPLOYEE = nUMBER_OF_EMPLOYEE;
	}
	public BigDecimal getTURNOVER_1() {
		return TURNOVER_1;
	}
	public void setTURNOVER_1(BigDecimal tURNOVER_1) {
		TURNOVER_1 = tURNOVER_1;
	}
	public BigDecimal getTURNOVER_2() {
		return TURNOVER_2;
	}
	public void setTURNOVER_2(BigDecimal tURNOVER_2) {
		TURNOVER_2 = tURNOVER_2;
	}
	public String getFACILITY_PROVIDER() {
		return FACILITY_PROVIDER;
	}
	public void setFACILITY_PROVIDER(String fACILITY_PROVIDER) {
		FACILITY_PROVIDER = fACILITY_PROVIDER;
	}
	public BigDecimal getAMOUNT_APP_MUR() {
		return AMOUNT_APP_MUR;
	}
	public void setAMOUNT_APP_MUR(BigDecimal aMOUNT_APP_MUR) {
		AMOUNT_APP_MUR = aMOUNT_APP_MUR;
	}
	public String getTYPE_OF_FACILITY() {
		return TYPE_OF_FACILITY;
	}
	public void setTYPE_OF_FACILITY(String tYPE_OF_FACILITY) {
		TYPE_OF_FACILITY = tYPE_OF_FACILITY;
	}
	public BigDecimal getDURATION_OF_FACILITY() {
		return DURATION_OF_FACILITY;
	}
	public void setDURATION_OF_FACILITY(BigDecimal dURATION_OF_FACILITY) {
		DURATION_OF_FACILITY = dURATION_OF_FACILITY;
	}
	public String getCOLLATERAL_PROVIDED() {
		return COLLATERAL_PROVIDED;
	}
	public void setCOLLATERAL_PROVIDED(String cOLLATERAL_PROVIDED) {
		COLLATERAL_PROVIDED = cOLLATERAL_PROVIDED;
	}
	public String getOTHER_INS_SUPPORT() {
		return OTHER_INS_SUPPORT;
	}
	public void setOTHER_INS_SUPPORT(String oTHER_INS_SUPPORT) {
		OTHER_INS_SUPPORT = oTHER_INS_SUPPORT;
	}
	public Date getAPPROVAL_REJ_DATE() {
		return APPROVAL_REJ_DATE;
	}
	public void setAPPROVAL_REJ_DATE(Date aPPROVAL_REJ_DATE) {
		APPROVAL_REJ_DATE = aPPROVAL_REJ_DATE;
	}
	public String getREJECTION_REASON() {
		return REJECTION_REASON;
	}
	public void setREJECTION_REASON(String rEJECTION_REASON) {
		REJECTION_REASON = rEJECTION_REASON;
	}
	public String getREJECTION_REMARKS() {
		return REJECTION_REMARKS;
	}
	public void setREJECTION_REMARKS(String rEJECTION_REMARKS) {
		REJECTION_REMARKS = rEJECTION_REMARKS;
	}
	public BigDecimal getAMOUNT_APPROVED_MUR() {
		return AMOUNT_APPROVED_MUR;
	}
	public void setAMOUNT_APPROVED_MUR(BigDecimal aMOUNT_APPROVED_MUR) {
		AMOUNT_APPROVED_MUR = aMOUNT_APPROVED_MUR;
	}
	public BigDecimal getAMOUNT_DIS_AS_DATE() {
		return AMOUNT_DIS_AS_DATE;
	}
	public void setAMOUNT_DIS_AS_DATE(BigDecimal aMOUNT_DIS_AS_DATE) {
		AMOUNT_DIS_AS_DATE = aMOUNT_DIS_AS_DATE;
	}
	public BigDecimal getAMOUNT_CANCELLED_MUR() {
		return AMOUNT_CANCELLED_MUR;
	}
	public void setAMOUNT_CANCELLED_MUR(BigDecimal aMOUNT_CANCELLED_MUR) {
		AMOUNT_CANCELLED_MUR = aMOUNT_CANCELLED_MUR;
	}
	public BigDecimal getREPAYMENT_AS_DATE() {
		return REPAYMENT_AS_DATE;
	}
	public void setREPAYMENT_AS_DATE(BigDecimal rEPAYMENT_AS_DATE) {
		REPAYMENT_AS_DATE = rEPAYMENT_AS_DATE;
	}
	public String getCOMPANY_STA_DISBURSEMENT() {
		return COMPANY_STA_DISBURSEMENT;
	}
	public void setCOMPANY_STA_DISBURSEMENT(String cOMPANY_STA_DISBURSEMENT) {
		COMPANY_STA_DISBURSEMENT = cOMPANY_STA_DISBURSEMENT;
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
	
	
	public RESTRUCTURED_LOAN_MASTER_ENTITY(RESTRUCTURED_LOAN_ID res_id, String aPPLICANT_NAME,
			String bUSINESS_REG_NUMBER, String cOMPANY_REG_NUMBER, String nIC_PASSPORT, String mAIN_SHAREHOLDER,
			String bUSINESS_ADDRESS, String bUSINESS_SECTOR, String bUSINESS_ACTIVITY, String iSIC_CODE,
			BigDecimal nUMBER_OF_EMPLOYEE, BigDecimal tURNOVER_1, BigDecimal tURNOVER_2, String fACILITY_PROVIDER,
			BigDecimal aMOUNT_APP_MUR, String tYPE_OF_FACILITY, BigDecimal dURATION_OF_FACILITY,
			String cOLLATERAL_PROVIDED, String oTHER_INS_SUPPORT, Date aPPROVAL_REJ_DATE, String rEJECTION_REASON,
			String rEJECTION_REMARKS, BigDecimal aMOUNT_APPROVED_MUR, BigDecimal aMOUNT_DIS_AS_DATE,
			BigDecimal aMOUNT_CANCELLED_MUR, BigDecimal rEPAYMENT_AS_DATE, String cOMPANY_STA_DISBURSEMENT,
			String aRCH_FLG, String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, String eNTRY_USER,
			String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME,
			String fORACID) {
		super();
		this.res_id = res_id;
		APPLICANT_NAME = aPPLICANT_NAME;
		BUSINESS_REG_NUMBER = bUSINESS_REG_NUMBER;
		COMPANY_REG_NUMBER = cOMPANY_REG_NUMBER;
		NIC_PASSPORT = nIC_PASSPORT;
		MAIN_SHAREHOLDER = mAIN_SHAREHOLDER;
		BUSINESS_ADDRESS = bUSINESS_ADDRESS;
		BUSINESS_SECTOR = bUSINESS_SECTOR;
		BUSINESS_ACTIVITY = bUSINESS_ACTIVITY;
		ISIC_CODE = iSIC_CODE;
		NUMBER_OF_EMPLOYEE = nUMBER_OF_EMPLOYEE;
		TURNOVER_1 = tURNOVER_1;
		TURNOVER_2 = tURNOVER_2;
		FACILITY_PROVIDER = fACILITY_PROVIDER;
		AMOUNT_APP_MUR = aMOUNT_APP_MUR;
		TYPE_OF_FACILITY = tYPE_OF_FACILITY;
		DURATION_OF_FACILITY = dURATION_OF_FACILITY;
		COLLATERAL_PROVIDED = cOLLATERAL_PROVIDED;
		OTHER_INS_SUPPORT = oTHER_INS_SUPPORT;
		APPROVAL_REJ_DATE = aPPROVAL_REJ_DATE;
		REJECTION_REASON = rEJECTION_REASON;
		REJECTION_REMARKS = rEJECTION_REMARKS;
		AMOUNT_APPROVED_MUR = aMOUNT_APPROVED_MUR;
		AMOUNT_DIS_AS_DATE = aMOUNT_DIS_AS_DATE;
		AMOUNT_CANCELLED_MUR = aMOUNT_CANCELLED_MUR;
		REPAYMENT_AS_DATE = rEPAYMENT_AS_DATE;
		COMPANY_STA_DISBURSEMENT = cOMPANY_STA_DISBURSEMENT;
		ARCH_FLG = aRCH_FLG;
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		VERIFY_FLG = vERIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
		FORACID = fORACID;
	}
	public RESTRUCTURED_LOAN_MASTER_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
