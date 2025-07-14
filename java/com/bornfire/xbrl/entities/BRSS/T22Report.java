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
@Table(name="T22_JURISDICTION_BANK_GROUP_ENTITY")
public class T22Report {
	
	private String	LOW_PRODUCT;
	private BigDecimal	LOW_BANK_BRANCH_COUNT;
	private BigDecimal	LOW_BANK_SUBSIDIARIES;
	private BigDecimal	LOW_BANK_ENTITIES;
	private BigDecimal	LOW_BANK_OTH_PARTY;
	private BigDecimal	LOW_BANK_PROPERITARY;
	private BigDecimal	LOW_TOTAL_LOW;
	private String	MEDIUM_PRODUCT;
	private BigDecimal	MEDIUM_BANK_BRANCH_COUNT;
	private BigDecimal	MEDIUM_BANK_SUBSIDIARIES;
	private BigDecimal	MEDIUM_BANK_ENTITIES;
	private BigDecimal	MEDIUM_BANK_OTH_PARTY;
	private BigDecimal	MEDIUM_BANK_PROPERITARY;
	private BigDecimal	MEDIUM_TOTAL_LOW;
	private String	HIGH_PRODUCT;
	private BigDecimal	HIGH_BANK_BRANCH_COUNT;
	private BigDecimal	HIGH_BANK_SUBSIDIARIES;
	private BigDecimal	HIGH_BANK_ENTITIES;
	private BigDecimal	HIGH_BANK_OTH_PARTY;
	private BigDecimal	HIGH_BANK_PROPERITARY;
	private BigDecimal	HIGH_TOTAL_LOW;
	private String	TOTAL_PRODUCT;
	private BigDecimal	TOTAL_BANK_BRANCH_COUNT;
	private BigDecimal	TOTAL_BANK_SUBSIDIARIES;
	private BigDecimal	TOTAL_BANK_ENTITIES;
	private BigDecimal	TOTAL_BANK_OTH_PARTY;
	private BigDecimal	TOTAL_BANK_PROPERITARY;
	private BigDecimal	TOTAL_TOTAL_LOW;
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
	public String getLOW_PRODUCT() {
		return LOW_PRODUCT;
	}
	public void setLOW_PRODUCT(String lOW_PRODUCT) {
		LOW_PRODUCT = lOW_PRODUCT;
	}
	public BigDecimal getLOW_BANK_BRANCH_COUNT() {
		return LOW_BANK_BRANCH_COUNT;
	}
	public void setLOW_BANK_BRANCH_COUNT(BigDecimal lOW_BANK_BRANCH_COUNT) {
		LOW_BANK_BRANCH_COUNT = lOW_BANK_BRANCH_COUNT;
	}
	public BigDecimal getLOW_BANK_SUBSIDIARIES() {
		return LOW_BANK_SUBSIDIARIES;
	}
	public void setLOW_BANK_SUBSIDIARIES(BigDecimal lOW_BANK_SUBSIDIARIES) {
		LOW_BANK_SUBSIDIARIES = lOW_BANK_SUBSIDIARIES;
	}
	public BigDecimal getLOW_BANK_ENTITIES() {
		return LOW_BANK_ENTITIES;
	}
	public void setLOW_BANK_ENTITIES(BigDecimal lOW_BANK_ENTITIES) {
		LOW_BANK_ENTITIES = lOW_BANK_ENTITIES;
	}
	public BigDecimal getLOW_BANK_OTH_PARTY() {
		return LOW_BANK_OTH_PARTY;
	}
	public void setLOW_BANK_OTH_PARTY(BigDecimal lOW_BANK_OTH_PARTY) {
		LOW_BANK_OTH_PARTY = lOW_BANK_OTH_PARTY;
	}
	public BigDecimal getLOW_BANK_PROPERITARY() {
		return LOW_BANK_PROPERITARY;
	}
	public void setLOW_BANK_PROPERITARY(BigDecimal lOW_BANK_PROPERITARY) {
		LOW_BANK_PROPERITARY = lOW_BANK_PROPERITARY;
	}
	public BigDecimal getLOW_TOTAL_LOW() {
		return LOW_TOTAL_LOW;
	}
	public void setLOW_TOTAL_LOW(BigDecimal lOW_TOTAL_LOW) {
		LOW_TOTAL_LOW = lOW_TOTAL_LOW;
	}
	public String getMEDIUM_PRODUCT() {
		return MEDIUM_PRODUCT;
	}
	public void setMEDIUM_PRODUCT(String mEDIUM_PRODUCT) {
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
	}
	public BigDecimal getMEDIUM_BANK_BRANCH_COUNT() {
		return MEDIUM_BANK_BRANCH_COUNT;
	}
	public void setMEDIUM_BANK_BRANCH_COUNT(BigDecimal mEDIUM_BANK_BRANCH_COUNT) {
		MEDIUM_BANK_BRANCH_COUNT = mEDIUM_BANK_BRANCH_COUNT;
	}
	public BigDecimal getMEDIUM_BANK_SUBSIDIARIES() {
		return MEDIUM_BANK_SUBSIDIARIES;
	}
	public void setMEDIUM_BANK_SUBSIDIARIES(BigDecimal mEDIUM_BANK_SUBSIDIARIES) {
		MEDIUM_BANK_SUBSIDIARIES = mEDIUM_BANK_SUBSIDIARIES;
	}
	public BigDecimal getMEDIUM_BANK_ENTITIES() {
		return MEDIUM_BANK_ENTITIES;
	}
	public void setMEDIUM_BANK_ENTITIES(BigDecimal mEDIUM_BANK_ENTITIES) {
		MEDIUM_BANK_ENTITIES = mEDIUM_BANK_ENTITIES;
	}
	public BigDecimal getMEDIUM_BANK_OTH_PARTY() {
		return MEDIUM_BANK_OTH_PARTY;
	}
	public void setMEDIUM_BANK_OTH_PARTY(BigDecimal mEDIUM_BANK_OTH_PARTY) {
		MEDIUM_BANK_OTH_PARTY = mEDIUM_BANK_OTH_PARTY;
	}
	public BigDecimal getMEDIUM_BANK_PROPERITARY() {
		return MEDIUM_BANK_PROPERITARY;
	}
	public void setMEDIUM_BANK_PROPERITARY(BigDecimal mEDIUM_BANK_PROPERITARY) {
		MEDIUM_BANK_PROPERITARY = mEDIUM_BANK_PROPERITARY;
	}
	public BigDecimal getMEDIUM_TOTAL_LOW() {
		return MEDIUM_TOTAL_LOW;
	}
	public void setMEDIUM_TOTAL_LOW(BigDecimal mEDIUM_TOTAL_LOW) {
		MEDIUM_TOTAL_LOW = mEDIUM_TOTAL_LOW;
	}
	public String getHIGH_PRODUCT() {
		return HIGH_PRODUCT;
	}
	public void setHIGH_PRODUCT(String hIGH_PRODUCT) {
		HIGH_PRODUCT = hIGH_PRODUCT;
	}
	public BigDecimal getHIGH_BANK_BRANCH_COUNT() {
		return HIGH_BANK_BRANCH_COUNT;
	}
	public void setHIGH_BANK_BRANCH_COUNT(BigDecimal hIGH_BANK_BRANCH_COUNT) {
		HIGH_BANK_BRANCH_COUNT = hIGH_BANK_BRANCH_COUNT;
	}
	public BigDecimal getHIGH_BANK_SUBSIDIARIES() {
		return HIGH_BANK_SUBSIDIARIES;
	}
	public void setHIGH_BANK_SUBSIDIARIES(BigDecimal hIGH_BANK_SUBSIDIARIES) {
		HIGH_BANK_SUBSIDIARIES = hIGH_BANK_SUBSIDIARIES;
	}
	public BigDecimal getHIGH_BANK_ENTITIES() {
		return HIGH_BANK_ENTITIES;
	}
	public void setHIGH_BANK_ENTITIES(BigDecimal hIGH_BANK_ENTITIES) {
		HIGH_BANK_ENTITIES = hIGH_BANK_ENTITIES;
	}
	public BigDecimal getHIGH_BANK_OTH_PARTY() {
		return HIGH_BANK_OTH_PARTY;
	}
	public void setHIGH_BANK_OTH_PARTY(BigDecimal hIGH_BANK_OTH_PARTY) {
		HIGH_BANK_OTH_PARTY = hIGH_BANK_OTH_PARTY;
	}
	public BigDecimal getHIGH_BANK_PROPERITARY() {
		return HIGH_BANK_PROPERITARY;
	}
	public void setHIGH_BANK_PROPERITARY(BigDecimal hIGH_BANK_PROPERITARY) {
		HIGH_BANK_PROPERITARY = hIGH_BANK_PROPERITARY;
	}
	public BigDecimal getHIGH_TOTAL_LOW() {
		return HIGH_TOTAL_LOW;
	}
	public void setHIGH_TOTAL_LOW(BigDecimal hIGH_TOTAL_LOW) {
		HIGH_TOTAL_LOW = hIGH_TOTAL_LOW;
	}
	public String getTOTAL_PRODUCT() {
		return TOTAL_PRODUCT;
	}
	public void setTOTAL_PRODUCT(String tOTAL_PRODUCT) {
		TOTAL_PRODUCT = tOTAL_PRODUCT;
	}
	public BigDecimal getTOTAL_BANK_BRANCH_COUNT() {
		return TOTAL_BANK_BRANCH_COUNT;
	}
	public void setTOTAL_BANK_BRANCH_COUNT(BigDecimal tOTAL_BANK_BRANCH_COUNT) {
		TOTAL_BANK_BRANCH_COUNT = tOTAL_BANK_BRANCH_COUNT;
	}
	public BigDecimal getTOTAL_BANK_SUBSIDIARIES() {
		return TOTAL_BANK_SUBSIDIARIES;
	}
	public void setTOTAL_BANK_SUBSIDIARIES(BigDecimal tOTAL_BANK_SUBSIDIARIES) {
		TOTAL_BANK_SUBSIDIARIES = tOTAL_BANK_SUBSIDIARIES;
	}
	public BigDecimal getTOTAL_BANK_ENTITIES() {
		return TOTAL_BANK_ENTITIES;
	}
	public void setTOTAL_BANK_ENTITIES(BigDecimal tOTAL_BANK_ENTITIES) {
		TOTAL_BANK_ENTITIES = tOTAL_BANK_ENTITIES;
	}
	public BigDecimal getTOTAL_BANK_OTH_PARTY() {
		return TOTAL_BANK_OTH_PARTY;
	}
	public void setTOTAL_BANK_OTH_PARTY(BigDecimal tOTAL_BANK_OTH_PARTY) {
		TOTAL_BANK_OTH_PARTY = tOTAL_BANK_OTH_PARTY;
	}
	public BigDecimal getTOTAL_BANK_PROPERITARY() {
		return TOTAL_BANK_PROPERITARY;
	}
	public void setTOTAL_BANK_PROPERITARY(BigDecimal tOTAL_BANK_PROPERITARY) {
		TOTAL_BANK_PROPERITARY = tOTAL_BANK_PROPERITARY;
	}
	public BigDecimal getTOTAL_TOTAL_LOW() {
		return TOTAL_TOTAL_LOW;
	}
	public void setTOTAL_TOTAL_LOW(BigDecimal tOTAL_TOTAL_LOW) {
		TOTAL_TOTAL_LOW = tOTAL_TOTAL_LOW;
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
	
	public T22Report(String lOW_PRODUCT, BigDecimal lOW_BANK_BRANCH_COUNT, BigDecimal lOW_BANK_SUBSIDIARIES,
			BigDecimal lOW_BANK_ENTITIES, BigDecimal lOW_BANK_OTH_PARTY, BigDecimal lOW_BANK_PROPERITARY,
			BigDecimal lOW_TOTAL_LOW, String mEDIUM_PRODUCT, BigDecimal mEDIUM_BANK_BRANCH_COUNT,
			BigDecimal mEDIUM_BANK_SUBSIDIARIES, BigDecimal mEDIUM_BANK_ENTITIES, BigDecimal mEDIUM_BANK_OTH_PARTY,
			BigDecimal mEDIUM_BANK_PROPERITARY, BigDecimal mEDIUM_TOTAL_LOW, String hIGH_PRODUCT,
			BigDecimal hIGH_BANK_BRANCH_COUNT, BigDecimal hIGH_BANK_SUBSIDIARIES, BigDecimal hIGH_BANK_ENTITIES,
			BigDecimal hIGH_BANK_OTH_PARTY, BigDecimal hIGH_BANK_PROPERITARY, BigDecimal hIGH_TOTAL_LOW,
			String tOTAL_PRODUCT, BigDecimal tOTAL_BANK_BRANCH_COUNT, BigDecimal tOTAL_BANK_SUBSIDIARIES,
			BigDecimal tOTAL_BANK_ENTITIES, BigDecimal tOTAL_BANK_OTH_PARTY, BigDecimal tOTAL_BANK_PROPERITARY,
			BigDecimal tOTAL_TOTAL_LOW, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE,
			Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG,
			String aRCH_FLG, String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE, Date mODIFY_DATE,
			Date vERIFY_DATE, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
		super();
		LOW_PRODUCT = lOW_PRODUCT;
		LOW_BANK_BRANCH_COUNT = lOW_BANK_BRANCH_COUNT;
		LOW_BANK_SUBSIDIARIES = lOW_BANK_SUBSIDIARIES;
		LOW_BANK_ENTITIES = lOW_BANK_ENTITIES;
		LOW_BANK_OTH_PARTY = lOW_BANK_OTH_PARTY;
		LOW_BANK_PROPERITARY = lOW_BANK_PROPERITARY;
		LOW_TOTAL_LOW = lOW_TOTAL_LOW;
		MEDIUM_PRODUCT = mEDIUM_PRODUCT;
		MEDIUM_BANK_BRANCH_COUNT = mEDIUM_BANK_BRANCH_COUNT;
		MEDIUM_BANK_SUBSIDIARIES = mEDIUM_BANK_SUBSIDIARIES;
		MEDIUM_BANK_ENTITIES = mEDIUM_BANK_ENTITIES;
		MEDIUM_BANK_OTH_PARTY = mEDIUM_BANK_OTH_PARTY;
		MEDIUM_BANK_PROPERITARY = mEDIUM_BANK_PROPERITARY;
		MEDIUM_TOTAL_LOW = mEDIUM_TOTAL_LOW;
		HIGH_PRODUCT = hIGH_PRODUCT;
		HIGH_BANK_BRANCH_COUNT = hIGH_BANK_BRANCH_COUNT;
		HIGH_BANK_SUBSIDIARIES = hIGH_BANK_SUBSIDIARIES;
		HIGH_BANK_ENTITIES = hIGH_BANK_ENTITIES;
		HIGH_BANK_OTH_PARTY = hIGH_BANK_OTH_PARTY;
		HIGH_BANK_PROPERITARY = hIGH_BANK_PROPERITARY;
		HIGH_TOTAL_LOW = hIGH_TOTAL_LOW;
		TOTAL_PRODUCT = tOTAL_PRODUCT;
		TOTAL_BANK_BRANCH_COUNT = tOTAL_BANK_BRANCH_COUNT;
		TOTAL_BANK_SUBSIDIARIES = tOTAL_BANK_SUBSIDIARIES;
		TOTAL_BANK_ENTITIES = tOTAL_BANK_ENTITIES;
		TOTAL_BANK_OTH_PARTY = tOTAL_BANK_OTH_PARTY;
		TOTAL_BANK_PROPERITARY = tOTAL_BANK_PROPERITARY;
		TOTAL_TOTAL_LOW = tOTAL_TOTAL_LOW;
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
	public T22Report() {
		super();
		// TODO Auto-generated constructor stub
	}


}
