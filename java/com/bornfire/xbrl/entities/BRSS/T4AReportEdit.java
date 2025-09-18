package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class T4AReportEdit {
	
	private BigDecimal INSTANCE_CODE;
	private String	COUNTRY_NAME;
	private String	BANK_AML_RATING;
	private String	RBS_RETURN;
	private BigDecimal	NO_CORRES_BANK;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DATE;

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
	public String getBANK_AML_RATING() {
		return BANK_AML_RATING;
	}
	public void setBANK_AML_RATING(String bANK_AML_RATING) {
		BANK_AML_RATING = bANK_AML_RATING;
	}
	public String getRBS_RETURN() {
		return RBS_RETURN;
	}
	public void setRBS_RETURN(String rBS_RETURN) {
		RBS_RETURN = rBS_RETURN;
	}
	public BigDecimal getNO_CORRES_BANK() {
		return NO_CORRES_BANK;
	}
	public void setNO_CORRES_BANK(BigDecimal nO_CORRES_BANK) {
		NO_CORRES_BANK = nO_CORRES_BANK;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	@Override
	public String toString() {
		return "T4AReportEdit [INSTANCE_CODE=" + INSTANCE_CODE + ", COUNTRY_NAME=" + COUNTRY_NAME + ", BANK_AML_RATING="
				+ BANK_AML_RATING + ", RBS_RETURN=" + RBS_RETURN + ", NO_CORRES_BANK=" + NO_CORRES_BANK
				+ ", REPORT_DATE=" + REPORT_DATE + "]";
	}
	
	
	
}
