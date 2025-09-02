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
@Table(name="T22_OR_ADMINISTRATIVE_FUNCTIONALITY_SETUP_TABLE")
public class T22ORReport {

	private String	A1_PRODUCT;
	private BigDecimal	A1_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A1_SERVICE_OUTLET;
	private BigDecimal	A1_FUNCTIONAL_AREAS;
	private String	A2_PRODUCT;
	private BigDecimal	A2_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A2_SERVICE_OUTLET;
	private BigDecimal	A2_FUNCTIONAL_AREAS;
	private String	A3_PRODUCT;
	private BigDecimal	A3_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A3_SERVICE_OUTLET;
	private BigDecimal	A3_FUNCTIONAL_AREAS;
	private String	A4_PRODUCT;
	private BigDecimal	A4_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A4_SERVICE_OUTLET;
	private BigDecimal	A4_FUNCTIONAL_AREAS;
	private String	A5_PRODUCT;
	private BigDecimal	A5_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A5_SERVICE_OUTLET;
	private BigDecimal	A5_FUNCTIONAL_AREAS;
	private String	A6_PRODUCT;
	private BigDecimal	A6_ADMINISTRATIVE_OFFICE;
	private BigDecimal	A6_SERVICE_OUTLET;
	private BigDecimal	A6_FUNCTIONAL_AREAS;
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
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_ADMINISTRATIVE_OFFICE() {
		return A1_ADMINISTRATIVE_OFFICE;
	}
	public void setA1_ADMINISTRATIVE_OFFICE(BigDecimal a1_ADMINISTRATIVE_OFFICE) {
		A1_ADMINISTRATIVE_OFFICE = a1_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA1_SERVICE_OUTLET() {
		return A1_SERVICE_OUTLET;
	}
	public void setA1_SERVICE_OUTLET(BigDecimal a1_SERVICE_OUTLET) {
		A1_SERVICE_OUTLET = a1_SERVICE_OUTLET;
	}
	public BigDecimal getA1_FUNCTIONAL_AREAS() {
		return A1_FUNCTIONAL_AREAS;
	}
	public void setA1_FUNCTIONAL_AREAS(BigDecimal a1_FUNCTIONAL_AREAS) {
		A1_FUNCTIONAL_AREAS = a1_FUNCTIONAL_AREAS;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_ADMINISTRATIVE_OFFICE() {
		return A2_ADMINISTRATIVE_OFFICE;
	}
	public void setA2_ADMINISTRATIVE_OFFICE(BigDecimal a2_ADMINISTRATIVE_OFFICE) {
		A2_ADMINISTRATIVE_OFFICE = a2_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA2_SERVICE_OUTLET() {
		return A2_SERVICE_OUTLET;
	}
	public void setA2_SERVICE_OUTLET(BigDecimal a2_SERVICE_OUTLET) {
		A2_SERVICE_OUTLET = a2_SERVICE_OUTLET;
	}
	public BigDecimal getA2_FUNCTIONAL_AREAS() {
		return A2_FUNCTIONAL_AREAS;
	}
	public void setA2_FUNCTIONAL_AREAS(BigDecimal a2_FUNCTIONAL_AREAS) {
		A2_FUNCTIONAL_AREAS = a2_FUNCTIONAL_AREAS;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_ADMINISTRATIVE_OFFICE() {
		return A3_ADMINISTRATIVE_OFFICE;
	}
	public void setA3_ADMINISTRATIVE_OFFICE(BigDecimal a3_ADMINISTRATIVE_OFFICE) {
		A3_ADMINISTRATIVE_OFFICE = a3_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA3_SERVICE_OUTLET() {
		return A3_SERVICE_OUTLET;
	}
	public void setA3_SERVICE_OUTLET(BigDecimal a3_SERVICE_OUTLET) {
		A3_SERVICE_OUTLET = a3_SERVICE_OUTLET;
	}
	public BigDecimal getA3_FUNCTIONAL_AREAS() {
		return A3_FUNCTIONAL_AREAS;
	}
	public void setA3_FUNCTIONAL_AREAS(BigDecimal a3_FUNCTIONAL_AREAS) {
		A3_FUNCTIONAL_AREAS = a3_FUNCTIONAL_AREAS;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_ADMINISTRATIVE_OFFICE() {
		return A4_ADMINISTRATIVE_OFFICE;
	}
	public void setA4_ADMINISTRATIVE_OFFICE(BigDecimal a4_ADMINISTRATIVE_OFFICE) {
		A4_ADMINISTRATIVE_OFFICE = a4_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA4_SERVICE_OUTLET() {
		return A4_SERVICE_OUTLET;
	}
	public void setA4_SERVICE_OUTLET(BigDecimal a4_SERVICE_OUTLET) {
		A4_SERVICE_OUTLET = a4_SERVICE_OUTLET;
	}
	public BigDecimal getA4_FUNCTIONAL_AREAS() {
		return A4_FUNCTIONAL_AREAS;
	}
	public void setA4_FUNCTIONAL_AREAS(BigDecimal a4_FUNCTIONAL_AREAS) {
		A4_FUNCTIONAL_AREAS = a4_FUNCTIONAL_AREAS;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_ADMINISTRATIVE_OFFICE() {
		return A5_ADMINISTRATIVE_OFFICE;
	}
	public void setA5_ADMINISTRATIVE_OFFICE(BigDecimal a5_ADMINISTRATIVE_OFFICE) {
		A5_ADMINISTRATIVE_OFFICE = a5_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA5_SERVICE_OUTLET() {
		return A5_SERVICE_OUTLET;
	}
	public void setA5_SERVICE_OUTLET(BigDecimal a5_SERVICE_OUTLET) {
		A5_SERVICE_OUTLET = a5_SERVICE_OUTLET;
	}
	public BigDecimal getA5_FUNCTIONAL_AREAS() {
		return A5_FUNCTIONAL_AREAS;
	}
	public void setA5_FUNCTIONAL_AREAS(BigDecimal a5_FUNCTIONAL_AREAS) {
		A5_FUNCTIONAL_AREAS = a5_FUNCTIONAL_AREAS;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_ADMINISTRATIVE_OFFICE() {
		return A6_ADMINISTRATIVE_OFFICE;
	}
	public void setA6_ADMINISTRATIVE_OFFICE(BigDecimal a6_ADMINISTRATIVE_OFFICE) {
		A6_ADMINISTRATIVE_OFFICE = a6_ADMINISTRATIVE_OFFICE;
	}
	public BigDecimal getA6_SERVICE_OUTLET() {
		return A6_SERVICE_OUTLET;
	}
	public void setA6_SERVICE_OUTLET(BigDecimal a6_SERVICE_OUTLET) {
		A6_SERVICE_OUTLET = a6_SERVICE_OUTLET;
	}
	public BigDecimal getA6_FUNCTIONAL_AREAS() {
		return A6_FUNCTIONAL_AREAS;
	}
	public void setA6_FUNCTIONAL_AREAS(BigDecimal a6_FUNCTIONAL_AREAS) {
		A6_FUNCTIONAL_AREAS = a6_FUNCTIONAL_AREAS;
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
	public T22ORReport(String a1_PRODUCT, BigDecimal a1_ADMINISTRATIVE_OFFICE, BigDecimal a1_SERVICE_OUTLET,
			BigDecimal a1_FUNCTIONAL_AREAS, String a2_PRODUCT, BigDecimal a2_ADMINISTRATIVE_OFFICE,
			BigDecimal a2_SERVICE_OUTLET, BigDecimal a2_FUNCTIONAL_AREAS, String a3_PRODUCT,
			BigDecimal a3_ADMINISTRATIVE_OFFICE, BigDecimal a3_SERVICE_OUTLET, BigDecimal a3_FUNCTIONAL_AREAS,
			String a4_PRODUCT, BigDecimal a4_ADMINISTRATIVE_OFFICE, BigDecimal a4_SERVICE_OUTLET,
			BigDecimal a4_FUNCTIONAL_AREAS, String a5_PRODUCT, BigDecimal a5_ADMINISTRATIVE_OFFICE,
			BigDecimal a5_SERVICE_OUTLET, BigDecimal a5_FUNCTIONAL_AREAS, String a6_PRODUCT,
			BigDecimal a6_ADMINISTRATIVE_OFFICE, BigDecimal a6_SERVICE_OUTLET, BigDecimal a6_FUNCTIONAL_AREAS,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER,
			String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_ADMINISTRATIVE_OFFICE = a1_ADMINISTRATIVE_OFFICE;
		A1_SERVICE_OUTLET = a1_SERVICE_OUTLET;
		A1_FUNCTIONAL_AREAS = a1_FUNCTIONAL_AREAS;
		A2_PRODUCT = a2_PRODUCT;
		A2_ADMINISTRATIVE_OFFICE = a2_ADMINISTRATIVE_OFFICE;
		A2_SERVICE_OUTLET = a2_SERVICE_OUTLET;
		A2_FUNCTIONAL_AREAS = a2_FUNCTIONAL_AREAS;
		A3_PRODUCT = a3_PRODUCT;
		A3_ADMINISTRATIVE_OFFICE = a3_ADMINISTRATIVE_OFFICE;
		A3_SERVICE_OUTLET = a3_SERVICE_OUTLET;
		A3_FUNCTIONAL_AREAS = a3_FUNCTIONAL_AREAS;
		A4_PRODUCT = a4_PRODUCT;
		A4_ADMINISTRATIVE_OFFICE = a4_ADMINISTRATIVE_OFFICE;
		A4_SERVICE_OUTLET = a4_SERVICE_OUTLET;
		A4_FUNCTIONAL_AREAS = a4_FUNCTIONAL_AREAS;
		A5_PRODUCT = a5_PRODUCT;
		A5_ADMINISTRATIVE_OFFICE = a5_ADMINISTRATIVE_OFFICE;
		A5_SERVICE_OUTLET = a5_SERVICE_OUTLET;
		A5_FUNCTIONAL_AREAS = a5_FUNCTIONAL_AREAS;
		A6_PRODUCT = a6_PRODUCT;
		A6_ADMINISTRATIVE_OFFICE = a6_ADMINISTRATIVE_OFFICE;
		A6_SERVICE_OUTLET = a6_SERVICE_OUTLET;
		A6_FUNCTIONAL_AREAS = a6_FUNCTIONAL_AREAS;
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
	public T22ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}

}
