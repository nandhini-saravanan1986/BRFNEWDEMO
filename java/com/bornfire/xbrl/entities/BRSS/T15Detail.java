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
@Table(name ="T15_ACCT_MASTER")
public class T15Detail {
	@Id
	private String	FORACID;
	private String	CUST_ID;
	private String	ACID;
	private String	CUST_RATING;
	private BigDecimal	AVERAGE_DAILY_BALANCE;
	private BigDecimal	ACCOUNT_TURNOVER;
	private BigDecimal	RATIO_ACCTTURNOVER_DAILYBAL;
	private BigDecimal	TRAN_COUNT;
	private BigDecimal	AVG_TRAN_BALANCE;
	private BigDecimal	RATIO_AVGTRAN_AVGDAILYBAL;
	private String	REPORT_T15A;
	private String	REPORT_T15B;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="DD/MM/YYYY")
	private Date	REPORT_DATE;
	private String	SCHM_CODE;
	private String	SCHM_TYPE;
	private String	AML_CODE1;
	private String	AML_CODE2;
	private String	AML_CODE3;
	private String	AML_CODE4;
	private String	AML_CODE5;
	private String	AML_CODE6;
	private String	AML_CODE7;
	private String	AML_CODE8;
	public String getFORACID() {
		return FORACID;
	}
	public void setFORACID(String fORACID) {
		FORACID = fORACID;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getACID() {
		return ACID;
	}
	public void setACID(String aCID) {
		ACID = aCID;
	}
	public String getCUST_RATING() {
		return CUST_RATING;
	}
	public void setCUST_RATING(String cUST_RATING) {
		CUST_RATING = cUST_RATING;
	}
	public BigDecimal getAVERAGE_DAILY_BALANCE() {
		return AVERAGE_DAILY_BALANCE;
	}
	public void setAVERAGE_DAILY_BALANCE(BigDecimal aVERAGE_DAILY_BALANCE) {
		AVERAGE_DAILY_BALANCE = aVERAGE_DAILY_BALANCE;
	}
	public BigDecimal getACCOUNT_TURNOVER() {
		return ACCOUNT_TURNOVER;
	}
	public void setACCOUNT_TURNOVER(BigDecimal aCCOUNT_TURNOVER) {
		ACCOUNT_TURNOVER = aCCOUNT_TURNOVER;
	}
	public BigDecimal getRATIO_ACCTTURNOVER_DAILYBAL() {
		return RATIO_ACCTTURNOVER_DAILYBAL;
	}
	public void setRATIO_ACCTTURNOVER_DAILYBAL(BigDecimal rATIO_ACCTTURNOVER_DAILYBAL) {
		RATIO_ACCTTURNOVER_DAILYBAL = rATIO_ACCTTURNOVER_DAILYBAL;
	}
	public BigDecimal getTRAN_COUNT() {
		return TRAN_COUNT;
	}
	public void setTRAN_COUNT(BigDecimal tRAN_COUNT) {
		TRAN_COUNT = tRAN_COUNT;
	}
	public BigDecimal getAVG_TRAN_BALANCE() {
		return AVG_TRAN_BALANCE;
	}
	public void setAVG_TRAN_BALANCE(BigDecimal aVG_TRAN_BALANCE) {
		AVG_TRAN_BALANCE = aVG_TRAN_BALANCE;
	}
	public BigDecimal getRATIO_AVGTRAN_AVGDAILYBAL() {
		return RATIO_AVGTRAN_AVGDAILYBAL;
	}
	public void setRATIO_AVGTRAN_AVGDAILYBAL(BigDecimal rATIO_AVGTRAN_AVGDAILYBAL) {
		RATIO_AVGTRAN_AVGDAILYBAL = rATIO_AVGTRAN_AVGDAILYBAL;
	}
	public String getREPORT_T15A() {
		return REPORT_T15A;
	}
	public void setREPORT_T15A(String rEPORT_T15A) {
		REPORT_T15A = rEPORT_T15A;
	}
	public String getREPORT_T15B() {
		return REPORT_T15B;
	}
	public void setREPORT_T15B(String rEPORT_T15B) {
		REPORT_T15B = rEPORT_T15B;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
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
	public String getAML_CODE1() {
		return AML_CODE1;
	}
	public void setAML_CODE1(String aML_CODE1) {
		AML_CODE1 = aML_CODE1;
	}
	public String getAML_CODE2() {
		return AML_CODE2;
	}
	public void setAML_CODE2(String aML_CODE2) {
		AML_CODE2 = aML_CODE2;
	}
	public String getAML_CODE3() {
		return AML_CODE3;
	}
	public void setAML_CODE3(String aML_CODE3) {
		AML_CODE3 = aML_CODE3;
	}
	public String getAML_CODE4() {
		return AML_CODE4;
	}
	public void setAML_CODE4(String aML_CODE4) {
		AML_CODE4 = aML_CODE4;
	}
	public String getAML_CODE5() {
		return AML_CODE5;
	}
	public void setAML_CODE5(String aML_CODE5) {
		AML_CODE5 = aML_CODE5;
	}
	public String getAML_CODE6() {
		return AML_CODE6;
	}
	public void setAML_CODE6(String aML_CODE6) {
		AML_CODE6 = aML_CODE6;
	}
	public String getAML_CODE7() {
		return AML_CODE7;
	}
	public void setAML_CODE7(String aML_CODE7) {
		AML_CODE7 = aML_CODE7;
	}
	public String getAML_CODE8() {
		return AML_CODE8;
	}
	public void setAML_CODE8(String aML_CODE8) {
		AML_CODE8 = aML_CODE8;
	}
	public T15Detail(String fORACID, String cUST_ID, String aCID, String cUST_RATING, BigDecimal aVERAGE_DAILY_BALANCE,
			BigDecimal aCCOUNT_TURNOVER, BigDecimal rATIO_ACCTTURNOVER_DAILYBAL, BigDecimal tRAN_COUNT,
			BigDecimal aVG_TRAN_BALANCE, BigDecimal rATIO_AVGTRAN_AVGDAILYBAL, String rEPORT_T15A, String rEPORT_T15B,
			Date rEPORT_DATE, String sCHM_CODE, String sCHM_TYPE, String aML_CODE1, String aML_CODE2, String aML_CODE3,
			String aML_CODE4, String aML_CODE5, String aML_CODE6, String aML_CODE7, String aML_CODE8) {
		super();
		FORACID = fORACID;
		CUST_ID = cUST_ID;
		ACID = aCID;
		CUST_RATING = cUST_RATING;
		AVERAGE_DAILY_BALANCE = aVERAGE_DAILY_BALANCE;
		ACCOUNT_TURNOVER = aCCOUNT_TURNOVER;
		RATIO_ACCTTURNOVER_DAILYBAL = rATIO_ACCTTURNOVER_DAILYBAL;
		TRAN_COUNT = tRAN_COUNT;
		AVG_TRAN_BALANCE = aVG_TRAN_BALANCE;
		RATIO_AVGTRAN_AVGDAILYBAL = rATIO_AVGTRAN_AVGDAILYBAL;
		REPORT_T15A = rEPORT_T15A;
		REPORT_T15B = rEPORT_T15B;
		REPORT_DATE = rEPORT_DATE;
		SCHM_CODE = sCHM_CODE;
		SCHM_TYPE = sCHM_TYPE;
		AML_CODE1 = aML_CODE1;
		AML_CODE2 = aML_CODE2;
		AML_CODE3 = aML_CODE3;
		AML_CODE4 = aML_CODE4;
		AML_CODE5 = aML_CODE5;
		AML_CODE6 = aML_CODE6;
		AML_CODE7 = aML_CODE7;
		AML_CODE8 = aML_CODE8;
	}
	public T15Detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
