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
@Table(name="T5_IFRS_INSTRUCTION_QUAN_TABLE")
public class T5IFRSQNReport {
	private BigDecimal	A1_BARROW_FACILITY_COUNT;
	private BigDecimal	A2_PD;
	private BigDecimal	B1_BARROW_FACILITY_COUNT;
	private BigDecimal	B2_PD;
	private BigDecimal	C1_BARROW_FACILITY_COUNT;
	private BigDecimal	C2_PD;
	private String	C3_WEIGHTED_AVE_PD;
	private BigDecimal	D1_BARROW_FACILITY_COUNT;
	private BigDecimal	D2_PD;
	private BigDecimal	E1_BARROW_FACILITY_COUNT;
	private BigDecimal	E2_PD;
	private BigDecimal	F1_BARROW_FACILITY_COUNT;
	private BigDecimal	F2_PD;
	private String	F3_WEIGHTED_AVE_PD;
	private BigDecimal	G1_BARROW_FACILITY_COUNT;
	private BigDecimal	G2_PD;
	private BigDecimal	H1_BARROW_FACILITY_COUNT;
	private BigDecimal	H2_PD;
	private BigDecimal	I1_BARROW_FACILITY_COUNT;
	private BigDecimal	I2_PD;
	private String	I3_WEIGHTED_AVE_PD;
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
	
	public BigDecimal getA1_BARROW_FACILITY_COUNT() {
		return A1_BARROW_FACILITY_COUNT;
	}

	public void setA1_BARROW_FACILITY_COUNT(BigDecimal a1_BARROW_FACILITY_COUNT) {
		A1_BARROW_FACILITY_COUNT = a1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getA2_PD() {
		return A2_PD;
	}

	public void setA2_PD(BigDecimal a2_PD) {
		A2_PD = a2_PD;
	}

	public BigDecimal getB1_BARROW_FACILITY_COUNT() {
		return B1_BARROW_FACILITY_COUNT;
	}

	public void setB1_BARROW_FACILITY_COUNT(BigDecimal b1_BARROW_FACILITY_COUNT) {
		B1_BARROW_FACILITY_COUNT = b1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getB2_PD() {
		return B2_PD;
	}

	public void setB2_PD(BigDecimal b2_PD) {
		B2_PD = b2_PD;
	}

	public BigDecimal getC1_BARROW_FACILITY_COUNT() {
		return C1_BARROW_FACILITY_COUNT;
	}

	public void setC1_BARROW_FACILITY_COUNT(BigDecimal c1_BARROW_FACILITY_COUNT) {
		C1_BARROW_FACILITY_COUNT = c1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getC2_PD() {
		return C2_PD;
	}

	public void setC2_PD(BigDecimal c2_PD) {
		C2_PD = c2_PD;
	}

	public String getC3_WEIGHTED_AVE_PD() {
		return C3_WEIGHTED_AVE_PD;
	}

	public void setC3_WEIGHTED_AVE_PD(String c3_WEIGHTED_AVE_PD) {
		C3_WEIGHTED_AVE_PD = c3_WEIGHTED_AVE_PD;
	}

	public BigDecimal getD1_BARROW_FACILITY_COUNT() {
		return D1_BARROW_FACILITY_COUNT;
	}

	public void setD1_BARROW_FACILITY_COUNT(BigDecimal d1_BARROW_FACILITY_COUNT) {
		D1_BARROW_FACILITY_COUNT = d1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getD2_PD() {
		return D2_PD;
	}

	public void setD2_PD(BigDecimal d2_PD) {
		D2_PD = d2_PD;
	}

	public BigDecimal getE1_BARROW_FACILITY_COUNT() {
		return E1_BARROW_FACILITY_COUNT;
	}

	public void setE1_BARROW_FACILITY_COUNT(BigDecimal e1_BARROW_FACILITY_COUNT) {
		E1_BARROW_FACILITY_COUNT = e1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getE2_PD() {
		return E2_PD;
	}

	public void setE2_PD(BigDecimal e2_PD) {
		E2_PD = e2_PD;
	}

	public BigDecimal getF1_BARROW_FACILITY_COUNT() {
		return F1_BARROW_FACILITY_COUNT;
	}

	public void setF1_BARROW_FACILITY_COUNT(BigDecimal f1_BARROW_FACILITY_COUNT) {
		F1_BARROW_FACILITY_COUNT = f1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getF2_PD() {
		return F2_PD;
	}

	public void setF2_PD(BigDecimal f2_PD) {
		F2_PD = f2_PD;
	}

	public String getF3_WEIGHTED_AVE_PD() {
		return F3_WEIGHTED_AVE_PD;
	}

	public void setF3_WEIGHTED_AVE_PD(String f3_WEIGHTED_AVE_PD) {
		F3_WEIGHTED_AVE_PD = f3_WEIGHTED_AVE_PD;
	}

	public BigDecimal getG1_BARROW_FACILITY_COUNT() {
		return G1_BARROW_FACILITY_COUNT;
	}

	public void setG1_BARROW_FACILITY_COUNT(BigDecimal g1_BARROW_FACILITY_COUNT) {
		G1_BARROW_FACILITY_COUNT = g1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getG2_PD() {
		return G2_PD;
	}

	public void setG2_PD(BigDecimal g2_PD) {
		G2_PD = g2_PD;
	}

	public BigDecimal getH1_BARROW_FACILITY_COUNT() {
		return H1_BARROW_FACILITY_COUNT;
	}

	public void setH1_BARROW_FACILITY_COUNT(BigDecimal h1_BARROW_FACILITY_COUNT) {
		H1_BARROW_FACILITY_COUNT = h1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getH2_PD() {
		return H2_PD;
	}

	public void setH2_PD(BigDecimal h2_PD) {
		H2_PD = h2_PD;
	}

	public BigDecimal getI1_BARROW_FACILITY_COUNT() {
		return I1_BARROW_FACILITY_COUNT;
	}

	public void setI1_BARROW_FACILITY_COUNT(BigDecimal i1_BARROW_FACILITY_COUNT) {
		I1_BARROW_FACILITY_COUNT = i1_BARROW_FACILITY_COUNT;
	}

	public BigDecimal getI2_PD() {
		return I2_PD;
	}

	public void setI2_PD(BigDecimal i2_PD) {
		I2_PD = i2_PD;
	}

	public String getI3_WEIGHTED_AVE_PD() {
		return I3_WEIGHTED_AVE_PD;
	}

	public void setI3_WEIGHTED_AVE_PD(String i3_WEIGHTED_AVE_PD) {
		I3_WEIGHTED_AVE_PD = i3_WEIGHTED_AVE_PD;
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

	public T5IFRSQNReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T5IFRSQNReport(BigDecimal a1_BARROW_FACILITY_COUNT, BigDecimal a2_PD, BigDecimal b1_BARROW_FACILITY_COUNT,
			BigDecimal b2_PD, BigDecimal c1_BARROW_FACILITY_COUNT, BigDecimal c2_PD, String c3_WEIGHTED_AVE_PD,
			BigDecimal d1_BARROW_FACILITY_COUNT, BigDecimal d2_PD, BigDecimal e1_BARROW_FACILITY_COUNT,
			BigDecimal e2_PD, BigDecimal f1_BARROW_FACILITY_COUNT, BigDecimal f2_PD, String f3_WEIGHTED_AVE_PD,
			BigDecimal g1_BARROW_FACILITY_COUNT, BigDecimal g2_PD, BigDecimal h1_BARROW_FACILITY_COUNT,
			BigDecimal h2_PD, BigDecimal i1_BARROW_FACILITY_COUNT, BigDecimal i2_PD, String i3_WEIGHTED_AVE_PD,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER,
			String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_BARROW_FACILITY_COUNT = a1_BARROW_FACILITY_COUNT;
		A2_PD = a2_PD;
		B1_BARROW_FACILITY_COUNT = b1_BARROW_FACILITY_COUNT;
		B2_PD = b2_PD;
		C1_BARROW_FACILITY_COUNT = c1_BARROW_FACILITY_COUNT;
		C2_PD = c2_PD;
		C3_WEIGHTED_AVE_PD = c3_WEIGHTED_AVE_PD;
		D1_BARROW_FACILITY_COUNT = d1_BARROW_FACILITY_COUNT;
		D2_PD = d2_PD;
		E1_BARROW_FACILITY_COUNT = e1_BARROW_FACILITY_COUNT;
		E2_PD = e2_PD;
		F1_BARROW_FACILITY_COUNT = f1_BARROW_FACILITY_COUNT;
		F2_PD = f2_PD;
		F3_WEIGHTED_AVE_PD = f3_WEIGHTED_AVE_PD;
		G1_BARROW_FACILITY_COUNT = g1_BARROW_FACILITY_COUNT;
		G2_PD = g2_PD;
		H1_BARROW_FACILITY_COUNT = h1_BARROW_FACILITY_COUNT;
		H2_PD = h2_PD;
		I1_BARROW_FACILITY_COUNT = i1_BARROW_FACILITY_COUNT;
		I2_PD = i2_PD;
		I3_WEIGHTED_AVE_PD = i3_WEIGHTED_AVE_PD;
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


}
