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
@Table(name = "T4_COUNTRY_RISK_PARAMETER")
public class CountryRiskParameter {
	@Id
	private BigDecimal	INSTANCE_CODE;
	private String	COUNTRY_NAME;
	private String	INTERNAL_AML_RATING;
	private String	CORRESPONDING_RATING;
	private BigDecimal	NO_CORRESPONDING_BANK;
	private String	COUNTRY_CODE;
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
	public BigDecimal getINSTANCE_CODE() {
		return INSTANCE_CODE;
	}
	public void setINSTANCE_CODE(BigDecimal iNSTANCE_CODE) {
		INSTANCE_CODE = iNSTANCE_CODE;
	}
	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}
	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		COUNTRY_NAME = cOUNTRY_NAME;
	}
	public String getINTERNAL_AML_RATING() {
		return INTERNAL_AML_RATING;
	}
	public void setINTERNAL_AML_RATING(String iNTERNAL_AML_RATING) {
		INTERNAL_AML_RATING = iNTERNAL_AML_RATING;
	}
	public String getCORRESPONDING_RATING() {
		return CORRESPONDING_RATING;
	}
	public void setCORRESPONDING_RATING(String cORRESPONDING_RATING) {
		CORRESPONDING_RATING = cORRESPONDING_RATING;
	}
	public BigDecimal getNO_CORRESPONDING_BANK() {
		return NO_CORRESPONDING_BANK;
	}
	public void setNO_CORRESPONDING_BANK(BigDecimal nO_CORRESPONDING_BANK) {
		NO_CORRESPONDING_BANK = nO_CORRESPONDING_BANK;
	}
	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}
	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
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
	public CountryRiskParameter(BigDecimal iNSTANCE_CODE, String cOUNTRY_NAME, String iNTERNAL_AML_RATING,
			String cORRESPONDING_RATING, BigDecimal nO_CORRESPONDING_BANK, String cOUNTRY_CODE, String eNTITY_FLG,
			String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER,
			Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME) {
		super();
		INSTANCE_CODE = iNSTANCE_CODE;
		COUNTRY_NAME = cOUNTRY_NAME;
		INTERNAL_AML_RATING = iNTERNAL_AML_RATING;
		CORRESPONDING_RATING = cORRESPONDING_RATING;
		NO_CORRESPONDING_BANK = nO_CORRESPONDING_BANK;
		COUNTRY_CODE = cOUNTRY_CODE;
		ENTITY_FLG = eNTITY_FLG;
		DEL_FLG = dEL_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
	}
	public CountryRiskParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
