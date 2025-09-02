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
@Table(name="BRBS_CONTACT_PERSON_INFORMATIONS")
public class BRBS_CONTACT_DETAILS_ENTITY {
	@Id
	private BigDecimal SRL_NO;
	private String	CONTACT_NAME;
	private String	DESIGNATION;
	private String	PHONE_NUMBER;
	private String	EMAIL_ID;
	private String	MODULE;
	private String	REMARKS;
	private String	REPORT_SECTION;
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	VERIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="DD/MM/YYYY")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="DD/MM/YYYY")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="DD/MM/YYYY")
	private Date	VERIFY_TIME;
	public BigDecimal getSRL_NO() {
		return SRL_NO;
	}
	public void setSRL_NO(BigDecimal sRL_NO) {
		SRL_NO = sRL_NO;
	}
	public String getCONTACT_NAME() {
		return CONTACT_NAME;
	}
	public void setCONTACT_NAME(String cONTACT_NAME) {
		CONTACT_NAME = cONTACT_NAME;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String dESIGNATION) {
		DESIGNATION = dESIGNATION;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getEMAIL_ID() {
		return EMAIL_ID;
	}
	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}
	public String getMODULE() {
		return MODULE;
	}
	public void setMODULE(String mODULE) {
		MODULE = mODULE;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getREPORT_SECTION() {
		return REPORT_SECTION;
	}
	public void setREPORT_SECTION(String rEPORT_SECTION) {
		REPORT_SECTION = rEPORT_SECTION;
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
	public BRBS_CONTACT_DETAILS_ENTITY(BigDecimal sRL_NO, String cONTACT_NAME, String dESIGNATION, String pHONE_NUMBER,
			String eMAIL_ID, String mODULE, String rEMARKS, String rEPORT_SECTION, String eNTITY_FLG, String mODIFY_FLG,
			String vERIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME) {
		super();
		SRL_NO = sRL_NO;
		CONTACT_NAME = cONTACT_NAME;
		DESIGNATION = dESIGNATION;
		PHONE_NUMBER = pHONE_NUMBER;
		EMAIL_ID = eMAIL_ID;
		MODULE = mODULE;
		REMARKS = rEMARKS;
		REPORT_SECTION = rEPORT_SECTION;
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		VERIFY_FLG = vERIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
	}
	public BRBS_CONTACT_DETAILS_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
