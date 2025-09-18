package com.bornfire.xbrl.entities.BRSS;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class RESTRUCTURED_LOAN_ID implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigDecimal	APPLICATION_REFERENCE;
	private Date	APPLICATION_DATE;
	public BigDecimal getAPPLICATION_REFERENCE() {
		return APPLICATION_REFERENCE;
	}
	public void setAPPLICATION_REFERENCE(BigDecimal aPPLICATION_REFERENCE) {
		APPLICATION_REFERENCE = aPPLICATION_REFERENCE;
	}
	public Date getAPPLICATION_DATE() {
		return APPLICATION_DATE;
	}
	public void setAPPLICATION_DATE(Date aPPLICATION_DATE) {
		APPLICATION_DATE = aPPLICATION_DATE;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RESTRUCTURED_LOAN_ID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RESTRUCTURED_LOAN_ID(BigDecimal aPPLICATION_REFERENCE, Date aPPLICATION_DATE) {
		super();
		APPLICATION_REFERENCE = aPPLICATION_REFERENCE;
		APPLICATION_DATE = aPPLICATION_DATE;
	}
	
	

}
