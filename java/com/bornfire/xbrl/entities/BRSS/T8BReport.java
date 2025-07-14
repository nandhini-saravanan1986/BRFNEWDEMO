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
@Table(name = "T8B_PROFILE_EXISTING_RESPOND_CORRESPONDENT_BANKS_TERMINATED")
public class T8BReport {

	private String	RESPONDENT_PRODUCT;
	private BigDecimal	RESPONDENT_BANK_COUNT_LOW;
	private BigDecimal	RESPONDENT_BANK_COUNT_MEDIUM;
	private BigDecimal	RESPONDENT_BANK_COUNT_HIGH;
	private String	CORRESPONDENT_PRODUCT;
	private BigDecimal	CORRESPONDENT_BANK_COUNT_LOW;
	private BigDecimal	CORRESPONDENT_BANK_COUNT_MEDIUM;
	private BigDecimal	CORRESPONDENT_BANK_COUNT_HIGH;
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
	public String getRESPONDENT_PRODUCT() {
		return RESPONDENT_PRODUCT;
	}
	public void setRESPONDENT_PRODUCT(String rESPONDENT_PRODUCT) {
		RESPONDENT_PRODUCT = rESPONDENT_PRODUCT;
	}
	public BigDecimal getRESPONDENT_BANK_COUNT_LOW() {
		return RESPONDENT_BANK_COUNT_LOW;
	}
	public void setRESPONDENT_BANK_COUNT_LOW(BigDecimal rESPONDENT_BANK_COUNT_LOW) {
		RESPONDENT_BANK_COUNT_LOW = rESPONDENT_BANK_COUNT_LOW;
	}
	public BigDecimal getRESPONDENT_BANK_COUNT_MEDIUM() {
		return RESPONDENT_BANK_COUNT_MEDIUM;
	}
	public void setRESPONDENT_BANK_COUNT_MEDIUM(BigDecimal rESPONDENT_BANK_COUNT_MEDIUM) {
		RESPONDENT_BANK_COUNT_MEDIUM = rESPONDENT_BANK_COUNT_MEDIUM;
	}
	public BigDecimal getRESPONDENT_BANK_COUNT_HIGH() {
		return RESPONDENT_BANK_COUNT_HIGH;
	}
	public void setRESPONDENT_BANK_COUNT_HIGH(BigDecimal rESPONDENT_BANK_COUNT_HIGH) {
		RESPONDENT_BANK_COUNT_HIGH = rESPONDENT_BANK_COUNT_HIGH;
	}
	public String getCORRESPONDENT_PRODUCT() {
		return CORRESPONDENT_PRODUCT;
	}
	public void setCORRESPONDENT_PRODUCT(String cORRESPONDENT_PRODUCT) {
		CORRESPONDENT_PRODUCT = cORRESPONDENT_PRODUCT;
	}
	public BigDecimal getCORRESPONDENT_BANK_COUNT_LOW() {
		return CORRESPONDENT_BANK_COUNT_LOW;
	}
	public void setCORRESPONDENT_BANK_COUNT_LOW(BigDecimal cORRESPONDENT_BANK_COUNT_LOW) {
		CORRESPONDENT_BANK_COUNT_LOW = cORRESPONDENT_BANK_COUNT_LOW;
	}
	public BigDecimal getCORRESPONDENT_BANK_COUNT_MEDIUM() {
		return CORRESPONDENT_BANK_COUNT_MEDIUM;
	}
	public void setCORRESPONDENT_BANK_COUNT_MEDIUM(BigDecimal cORRESPONDENT_BANK_COUNT_MEDIUM) {
		CORRESPONDENT_BANK_COUNT_MEDIUM = cORRESPONDENT_BANK_COUNT_MEDIUM;
	}
	public BigDecimal getCORRESPONDENT_BANK_COUNT_HIGH() {
		return CORRESPONDENT_BANK_COUNT_HIGH;
	}
	public void setCORRESPONDENT_BANK_COUNT_HIGH(BigDecimal cORRESPONDENT_BANK_COUNT_HIGH) {
		CORRESPONDENT_BANK_COUNT_HIGH = cORRESPONDENT_BANK_COUNT_HIGH;
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
	public T8BReport(String rESPONDENT_PRODUCT, BigDecimal rESPONDENT_BANK_COUNT_LOW,
			BigDecimal rESPONDENT_BANK_COUNT_MEDIUM, BigDecimal rESPONDENT_BANK_COUNT_HIGH,
			String cORRESPONDENT_PRODUCT, BigDecimal cORRESPONDENT_BANK_COUNT_LOW,
			BigDecimal cORRESPONDENT_BANK_COUNT_MEDIUM, BigDecimal cORRESPONDENT_BANK_COUNT_HIGH, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG,
			String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE, Date vERIFY_DATE,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
		super();
		RESPONDENT_PRODUCT = rESPONDENT_PRODUCT;
		RESPONDENT_BANK_COUNT_LOW = rESPONDENT_BANK_COUNT_LOW;
		RESPONDENT_BANK_COUNT_MEDIUM = rESPONDENT_BANK_COUNT_MEDIUM;
		RESPONDENT_BANK_COUNT_HIGH = rESPONDENT_BANK_COUNT_HIGH;
		CORRESPONDENT_PRODUCT = cORRESPONDENT_PRODUCT;
		CORRESPONDENT_BANK_COUNT_LOW = cORRESPONDENT_BANK_COUNT_LOW;
		CORRESPONDENT_BANK_COUNT_MEDIUM = cORRESPONDENT_BANK_COUNT_MEDIUM;
		CORRESPONDENT_BANK_COUNT_HIGH = cORRESPONDENT_BANK_COUNT_HIGH;
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
	public T8BReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
