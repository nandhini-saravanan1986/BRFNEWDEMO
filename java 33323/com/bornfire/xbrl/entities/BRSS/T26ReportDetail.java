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
@Table(name ="T26_REPORT_DETAIL")
public class T26ReportDetail {
	@Id
	private String	ACCT_NUMBER;
	private String	ACCT_NAME;
	private String	CUST_ID;
	private String	SCHM_CODE;
	private String	SCHM_TYPE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	ACCT_OPN_DATE;
	private BigDecimal	INT_RATE;
	private BigDecimal	ACCT_BALANCE_AMT_AC;
	private String	ACCT_CRNCY_CODE;
	private String	ISIC_CODE;
	private String	NATURE_OF_CUST;
	private String	NRE_FLG;
	private String	COUNTRY;
	private String	BOM_GROUP_IDENTIFIER;
	private String	CUST_UNIQUE_IDENTIFIER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	REPORT_DATE;
	private String	ASSET_LIAB_NR_FLG;
	private BigDecimal	INTEREST_AMOUNT;
	private String	ACID;
	private String	DEPOSIT_TYPE;
	private String	GL_SUB_HEAD_CODE;
	private String	CUST_SUB_GRP;
	private BigDecimal	ACCRUED_INT_CR;
	private BigDecimal	ACCRUED_INT_DR;
	private String	SME_FLG;
	private String	CUST_TYPE_CODE;
	private BigDecimal	DEP_PERIOD_MTHS;
	private BigDecimal	DEP_PERIOD_DAYS;
	private String	INTEREST_TYPE;
	private String	ACCT_CLS_FLG;
	private Date	ACCT_CLS_DATE;
	private String	SOL_ID;
	private BigDecimal	ACT_BALANCE_AMT_LC;
	private BigDecimal	ARREAR_AMT;
	private String	UNSECURED_FLG;
	private String	STAFF_FLG;
	private String	NPA_FLG;
	private String	LOAN_1YR_MATURITY;
	private BigDecimal	REP_PERIOD_MTHS;
	private BigDecimal	REP_PERIOD_DAYS;
	private BigDecimal	SANCT_AMT;
	private String	RESTRUCTURED_FLG;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	RENEWAL_DATE;
	private BigDecimal	SHDL_NUM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	REP_SHDL_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="DD/MM/YYYY")
	private Date	PAYOFF_DATE;
	private String	PAYOFF_FLG;
	private BigDecimal	DPD_CNTR;
	private String	SECURITY_TYPE;
	private BigDecimal	NON_FUND_BASED_AMT;
	private Date	MATURITY_DATE;
	private BigDecimal	ACCR_BAL_AC;
	private BigDecimal	ACCR_BAL_LC;
	private BigDecimal	SME_TURN_OVER;
	private String	CUST_TYPE_CODE_2;
	private String	CUST_RATING;
	public String getACCT_NUMBER() {
		return ACCT_NUMBER;
	}
	public void setACCT_NUMBER(String aCCT_NUMBER) {
		ACCT_NUMBER = aCCT_NUMBER;
	}
	public String getACCT_NAME() {
		return ACCT_NAME;
	}
	public void setACCT_NAME(String aCCT_NAME) {
		ACCT_NAME = aCCT_NAME;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getSCHM_CODE() {
		return SCHM_CODE;
	}
	public void setSCHM_CODE(String sCHM_CODE) {
		SCHM_CODE = sCHM_CODE;
	}
	public String getSCHM_TYPE() {
		return SCHM_TYPE;
	}
	public void setSCHM_TYPE(String sCHM_TYPE) {
		SCHM_TYPE = sCHM_TYPE;
	}
	public Date getACCT_OPN_DATE() {
		return ACCT_OPN_DATE;
	}
	public void setACCT_OPN_DATE(Date aCCT_OPN_DATE) {
		ACCT_OPN_DATE = aCCT_OPN_DATE;
	}
	public BigDecimal getINT_RATE() {
		return INT_RATE;
	}
	public void setINT_RATE(BigDecimal iNT_RATE) {
		INT_RATE = iNT_RATE;
	}
	public BigDecimal getACCT_BALANCE_AMT_AC() {
		return ACCT_BALANCE_AMT_AC;
	}
	public void setACCT_BALANCE_AMT_AC(BigDecimal aCCT_BALANCE_AMT_AC) {
		ACCT_BALANCE_AMT_AC = aCCT_BALANCE_AMT_AC;
	}
	public String getACCT_CRNCY_CODE() {
		return ACCT_CRNCY_CODE;
	}
	public void setACCT_CRNCY_CODE(String aCCT_CRNCY_CODE) {
		ACCT_CRNCY_CODE = aCCT_CRNCY_CODE;
	}
	public String getISIC_CODE() {
		return ISIC_CODE;
	}
	public void setISIC_CODE(String iSIC_CODE) {
		ISIC_CODE = iSIC_CODE;
	}
	public String getNATURE_OF_CUST() {
		return NATURE_OF_CUST;
	}
	public void setNATURE_OF_CUST(String nATURE_OF_CUST) {
		NATURE_OF_CUST = nATURE_OF_CUST;
	}
	public String getNRE_FLG() {
		return NRE_FLG;
	}
	public void setNRE_FLG(String nRE_FLG) {
		NRE_FLG = nRE_FLG;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getBOM_GROUP_IDENTIFIER() {
		return BOM_GROUP_IDENTIFIER;
	}
	public void setBOM_GROUP_IDENTIFIER(String bOM_GROUP_IDENTIFIER) {
		BOM_GROUP_IDENTIFIER = bOM_GROUP_IDENTIFIER;
	}
	public String getCUST_UNIQUE_IDENTIFIER() {
		return CUST_UNIQUE_IDENTIFIER;
	}
	public void setCUST_UNIQUE_IDENTIFIER(String cUST_UNIQUE_IDENTIFIER) {
		CUST_UNIQUE_IDENTIFIER = cUST_UNIQUE_IDENTIFIER;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public String getASSET_LIAB_NR_FLG() {
		return ASSET_LIAB_NR_FLG;
	}
	public void setASSET_LIAB_NR_FLG(String aSSET_LIAB_NR_FLG) {
		ASSET_LIAB_NR_FLG = aSSET_LIAB_NR_FLG;
	}
	public BigDecimal getINTEREST_AMOUNT() {
		return INTEREST_AMOUNT;
	}
	public void setINTEREST_AMOUNT(BigDecimal iNTEREST_AMOUNT) {
		INTEREST_AMOUNT = iNTEREST_AMOUNT;
	}
	public String getACID() {
		return ACID;
	}
	public void setACID(String aCID) {
		ACID = aCID;
	}
	public String getDEPOSIT_TYPE() {
		return DEPOSIT_TYPE;
	}
	public void setDEPOSIT_TYPE(String dEPOSIT_TYPE) {
		DEPOSIT_TYPE = dEPOSIT_TYPE;
	}
	public String getGL_SUB_HEAD_CODE() {
		return GL_SUB_HEAD_CODE;
	}
	public void setGL_SUB_HEAD_CODE(String gL_SUB_HEAD_CODE) {
		GL_SUB_HEAD_CODE = gL_SUB_HEAD_CODE;
	}
	public String getCUST_SUB_GRP() {
		return CUST_SUB_GRP;
	}
	public void setCUST_SUB_GRP(String cUST_SUB_GRP) {
		CUST_SUB_GRP = cUST_SUB_GRP;
	}
	public BigDecimal getACCRUED_INT_CR() {
		return ACCRUED_INT_CR;
	}
	public void setACCRUED_INT_CR(BigDecimal aCCRUED_INT_CR) {
		ACCRUED_INT_CR = aCCRUED_INT_CR;
	}
	public BigDecimal getACCRUED_INT_DR() {
		return ACCRUED_INT_DR;
	}
	public void setACCRUED_INT_DR(BigDecimal aCCRUED_INT_DR) {
		ACCRUED_INT_DR = aCCRUED_INT_DR;
	}
	public String getSME_FLG() {
		return SME_FLG;
	}
	public void setSME_FLG(String sME_FLG) {
		SME_FLG = sME_FLG;
	}
	public String getCUST_TYPE_CODE() {
		return CUST_TYPE_CODE;
	}
	public void setCUST_TYPE_CODE(String cUST_TYPE_CODE) {
		CUST_TYPE_CODE = cUST_TYPE_CODE;
	}
	public BigDecimal getDEP_PERIOD_MTHS() {
		return DEP_PERIOD_MTHS;
	}
	public void setDEP_PERIOD_MTHS(BigDecimal dEP_PERIOD_MTHS) {
		DEP_PERIOD_MTHS = dEP_PERIOD_MTHS;
	}
	public BigDecimal getDEP_PERIOD_DAYS() {
		return DEP_PERIOD_DAYS;
	}
	public void setDEP_PERIOD_DAYS(BigDecimal dEP_PERIOD_DAYS) {
		DEP_PERIOD_DAYS = dEP_PERIOD_DAYS;
	}
	public String getINTEREST_TYPE() {
		return INTEREST_TYPE;
	}
	public void setINTEREST_TYPE(String iNTEREST_TYPE) {
		INTEREST_TYPE = iNTEREST_TYPE;
	}
	public String getACCT_CLS_FLG() {
		return ACCT_CLS_FLG;
	}
	public void setACCT_CLS_FLG(String aCCT_CLS_FLG) {
		ACCT_CLS_FLG = aCCT_CLS_FLG;
	}
	public Date getACCT_CLS_DATE() {
		return ACCT_CLS_DATE;
	}
	public void setACCT_CLS_DATE(Date aCCT_CLS_DATE) {
		ACCT_CLS_DATE = aCCT_CLS_DATE;
	}
	public String getSOL_ID() {
		return SOL_ID;
	}
	public void setSOL_ID(String sOL_ID) {
		SOL_ID = sOL_ID;
	}
	public BigDecimal getACT_BALANCE_AMT_LC() {
		return ACT_BALANCE_AMT_LC;
	}
	public void setACT_BALANCE_AMT_LC(BigDecimal aCT_BALANCE_AMT_LC) {
		ACT_BALANCE_AMT_LC = aCT_BALANCE_AMT_LC;
	}
	public BigDecimal getARREAR_AMT() {
		return ARREAR_AMT;
	}
	public void setARREAR_AMT(BigDecimal aRREAR_AMT) {
		ARREAR_AMT = aRREAR_AMT;
	}
	public String getUNSECURED_FLG() {
		return UNSECURED_FLG;
	}
	public void setUNSECURED_FLG(String uNSECURED_FLG) {
		UNSECURED_FLG = uNSECURED_FLG;
	}
	public String getSTAFF_FLG() {
		return STAFF_FLG;
	}
	public void setSTAFF_FLG(String sTAFF_FLG) {
		STAFF_FLG = sTAFF_FLG;
	}
	public String getNPA_FLG() {
		return NPA_FLG;
	}
	public void setNPA_FLG(String nPA_FLG) {
		NPA_FLG = nPA_FLG;
	}
	public String getLOAN_1YR_MATURITY() {
		return LOAN_1YR_MATURITY;
	}
	public void setLOAN_1YR_MATURITY(String lOAN_1YR_MATURITY) {
		LOAN_1YR_MATURITY = lOAN_1YR_MATURITY;
	}
	public BigDecimal getREP_PERIOD_MTHS() {
		return REP_PERIOD_MTHS;
	}
	public void setREP_PERIOD_MTHS(BigDecimal rEP_PERIOD_MTHS) {
		REP_PERIOD_MTHS = rEP_PERIOD_MTHS;
	}
	public BigDecimal getREP_PERIOD_DAYS() {
		return REP_PERIOD_DAYS;
	}
	public void setREP_PERIOD_DAYS(BigDecimal rEP_PERIOD_DAYS) {
		REP_PERIOD_DAYS = rEP_PERIOD_DAYS;
	}
	public BigDecimal getSANCT_AMT() {
		return SANCT_AMT;
	}
	public void setSANCT_AMT(BigDecimal sANCT_AMT) {
		SANCT_AMT = sANCT_AMT;
	}
	public String getRESTRUCTURED_FLG() {
		return RESTRUCTURED_FLG;
	}
	public void setRESTRUCTURED_FLG(String rESTRUCTURED_FLG) {
		RESTRUCTURED_FLG = rESTRUCTURED_FLG;
	}
	public Date getRENEWAL_DATE() {
		return RENEWAL_DATE;
	}
	public void setRENEWAL_DATE(Date rENEWAL_DATE) {
		RENEWAL_DATE = rENEWAL_DATE;
	}
	public BigDecimal getSHDL_NUM() {
		return SHDL_NUM;
	}
	public void setSHDL_NUM(BigDecimal sHDL_NUM) {
		SHDL_NUM = sHDL_NUM;
	}
	public Date getREP_SHDL_DATE() {
		return REP_SHDL_DATE;
	}
	public void setREP_SHDL_DATE(Date rEP_SHDL_DATE) {
		REP_SHDL_DATE = rEP_SHDL_DATE;
	}
	public Date getPAYOFF_DATE() {
		return PAYOFF_DATE;
	}
	public void setPAYOFF_DATE(Date pAYOFF_DATE) {
		PAYOFF_DATE = pAYOFF_DATE;
	}
	public String getPAYOFF_FLG() {
		return PAYOFF_FLG;
	}
	public void setPAYOFF_FLG(String pAYOFF_FLG) {
		PAYOFF_FLG = pAYOFF_FLG;
	}
	public BigDecimal getDPD_CNTR() {
		return DPD_CNTR;
	}
	public void setDPD_CNTR(BigDecimal dPD_CNTR) {
		DPD_CNTR = dPD_CNTR;
	}
	public String getSECURITY_TYPE() {
		return SECURITY_TYPE;
	}
	public void setSECURITY_TYPE(String sECURITY_TYPE) {
		SECURITY_TYPE = sECURITY_TYPE;
	}
	public BigDecimal getNON_FUND_BASED_AMT() {
		return NON_FUND_BASED_AMT;
	}
	public void setNON_FUND_BASED_AMT(BigDecimal nON_FUND_BASED_AMT) {
		NON_FUND_BASED_AMT = nON_FUND_BASED_AMT;
	}
	public Date getMATURITY_DATE() {
		return MATURITY_DATE;
	}
	public void setMATURITY_DATE(Date mATURITY_DATE) {
		MATURITY_DATE = mATURITY_DATE;
	}
	public BigDecimal getACCR_BAL_AC() {
		return ACCR_BAL_AC;
	}
	public void setACCR_BAL_AC(BigDecimal aCCR_BAL_AC) {
		ACCR_BAL_AC = aCCR_BAL_AC;
	}
	public BigDecimal getACCR_BAL_LC() {
		return ACCR_BAL_LC;
	}
	public void setACCR_BAL_LC(BigDecimal aCCR_BAL_LC) {
		ACCR_BAL_LC = aCCR_BAL_LC;
	}
	public BigDecimal getSME_TURN_OVER() {
		return SME_TURN_OVER;
	}
	public void setSME_TURN_OVER(BigDecimal sME_TURN_OVER) {
		SME_TURN_OVER = sME_TURN_OVER;
	}
	public String getCUST_TYPE_CODE_2() {
		return CUST_TYPE_CODE_2;
	}
	public void setCUST_TYPE_CODE_2(String cUST_TYPE_CODE_2) {
		CUST_TYPE_CODE_2 = cUST_TYPE_CODE_2;
	}
	public String getCUST_RATING() {
		return CUST_RATING;
	}
	public void setCUST_RATING(String cUST_RATING) {
		CUST_RATING = cUST_RATING;
	}
	public T26ReportDetail(String aCCT_NUMBER, String aCCT_NAME, String cUST_ID, String sCHM_CODE, String sCHM_TYPE,
			Date aCCT_OPN_DATE, BigDecimal iNT_RATE, BigDecimal aCCT_BALANCE_AMT_AC, String aCCT_CRNCY_CODE,
			String iSIC_CODE, String nATURE_OF_CUST, String nRE_FLG, String cOUNTRY, String bOM_GROUP_IDENTIFIER,
			String cUST_UNIQUE_IDENTIFIER, Date rEPORT_DATE, String aSSET_LIAB_NR_FLG, BigDecimal iNTEREST_AMOUNT,
			String aCID, String dEPOSIT_TYPE, String gL_SUB_HEAD_CODE, String cUST_SUB_GRP, BigDecimal aCCRUED_INT_CR,
			BigDecimal aCCRUED_INT_DR, String sME_FLG, String cUST_TYPE_CODE, BigDecimal dEP_PERIOD_MTHS,
			BigDecimal dEP_PERIOD_DAYS, String iNTEREST_TYPE, String aCCT_CLS_FLG, Date aCCT_CLS_DATE, String sOL_ID,
			BigDecimal aCT_BALANCE_AMT_LC, BigDecimal aRREAR_AMT, String uNSECURED_FLG, String sTAFF_FLG,
			String nPA_FLG, String lOAN_1YR_MATURITY, BigDecimal rEP_PERIOD_MTHS, BigDecimal rEP_PERIOD_DAYS,
			BigDecimal sANCT_AMT, String rESTRUCTURED_FLG, Date rENEWAL_DATE, BigDecimal sHDL_NUM, Date rEP_SHDL_DATE,
			Date pAYOFF_DATE, String pAYOFF_FLG, BigDecimal dPD_CNTR, String sECURITY_TYPE,
			BigDecimal nON_FUND_BASED_AMT, Date mATURITY_DATE, BigDecimal aCCR_BAL_AC, BigDecimal aCCR_BAL_LC,
			BigDecimal sME_TURN_OVER, String cUST_TYPE_CODE_2, String cUST_RATING) {
		super();
		ACCT_NUMBER = aCCT_NUMBER;
		ACCT_NAME = aCCT_NAME;
		CUST_ID = cUST_ID;
		SCHM_CODE = sCHM_CODE;
		SCHM_TYPE = sCHM_TYPE;
		ACCT_OPN_DATE = aCCT_OPN_DATE;
		INT_RATE = iNT_RATE;
		ACCT_BALANCE_AMT_AC = aCCT_BALANCE_AMT_AC;
		ACCT_CRNCY_CODE = aCCT_CRNCY_CODE;
		ISIC_CODE = iSIC_CODE;
		NATURE_OF_CUST = nATURE_OF_CUST;
		NRE_FLG = nRE_FLG;
		COUNTRY = cOUNTRY;
		BOM_GROUP_IDENTIFIER = bOM_GROUP_IDENTIFIER;
		CUST_UNIQUE_IDENTIFIER = cUST_UNIQUE_IDENTIFIER;
		REPORT_DATE = rEPORT_DATE;
		ASSET_LIAB_NR_FLG = aSSET_LIAB_NR_FLG;
		INTEREST_AMOUNT = iNTEREST_AMOUNT;
		ACID = aCID;
		DEPOSIT_TYPE = dEPOSIT_TYPE;
		GL_SUB_HEAD_CODE = gL_SUB_HEAD_CODE;
		CUST_SUB_GRP = cUST_SUB_GRP;
		ACCRUED_INT_CR = aCCRUED_INT_CR;
		ACCRUED_INT_DR = aCCRUED_INT_DR;
		SME_FLG = sME_FLG;
		CUST_TYPE_CODE = cUST_TYPE_CODE;
		DEP_PERIOD_MTHS = dEP_PERIOD_MTHS;
		DEP_PERIOD_DAYS = dEP_PERIOD_DAYS;
		INTEREST_TYPE = iNTEREST_TYPE;
		ACCT_CLS_FLG = aCCT_CLS_FLG;
		ACCT_CLS_DATE = aCCT_CLS_DATE;
		SOL_ID = sOL_ID;
		ACT_BALANCE_AMT_LC = aCT_BALANCE_AMT_LC;
		ARREAR_AMT = aRREAR_AMT;
		UNSECURED_FLG = uNSECURED_FLG;
		STAFF_FLG = sTAFF_FLG;
		NPA_FLG = nPA_FLG;
		LOAN_1YR_MATURITY = lOAN_1YR_MATURITY;
		REP_PERIOD_MTHS = rEP_PERIOD_MTHS;
		REP_PERIOD_DAYS = rEP_PERIOD_DAYS;
		SANCT_AMT = sANCT_AMT;
		RESTRUCTURED_FLG = rESTRUCTURED_FLG;
		RENEWAL_DATE = rENEWAL_DATE;
		SHDL_NUM = sHDL_NUM;
		REP_SHDL_DATE = rEP_SHDL_DATE;
		PAYOFF_DATE = pAYOFF_DATE;
		PAYOFF_FLG = pAYOFF_FLG;
		DPD_CNTR = dPD_CNTR;
		SECURITY_TYPE = sECURITY_TYPE;
		NON_FUND_BASED_AMT = nON_FUND_BASED_AMT;
		MATURITY_DATE = mATURITY_DATE;
		ACCR_BAL_AC = aCCR_BAL_AC;
		ACCR_BAL_LC = aCCR_BAL_LC;
		SME_TURN_OVER = sME_TURN_OVER;
		CUST_TYPE_CODE_2 = cUST_TYPE_CODE_2;
		CUST_RATING = cUST_RATING;
	}
	public T26ReportDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
