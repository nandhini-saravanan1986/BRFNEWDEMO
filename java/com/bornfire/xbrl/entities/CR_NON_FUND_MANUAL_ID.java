package com.bornfire.xbrl.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class CR_NON_FUND_MANUAL_ID implements Serializable {
	private static final long serialVersionUID = 1L;
	private String	MAPKEY;
	private Date	REPORT_DATE;
	public String getMAPKEY() {
		return MAPKEY;
	}
	public void setMAPKEY(String mAPKEY) {
		MAPKEY = mAPKEY;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CR_NON_FUND_MANUAL_ID(String mAPKEY, Date rEPORT_DATE) {
		super();
		MAPKEY = mAPKEY;
		REPORT_DATE = rEPORT_DATE;
	}
	public CR_NON_FUND_MANUAL_ID() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MAPKEY == null) ? 0 : MAPKEY.hashCode());
		result = prime * result + ((REPORT_DATE == null) ? 0 : REPORT_DATE.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CR_NON_FUND_MANUAL_ID other = (CR_NON_FUND_MANUAL_ID) obj;
		if (MAPKEY == null) {
			if (other.MAPKEY != null)
				return false;
		} else if (!MAPKEY.equals(other.MAPKEY))
			return false;
		if (REPORT_DATE == null) {
			if (other.REPORT_DATE != null)
				return false;
		} else if (!REPORT_DATE.equals(other.REPORT_DATE))
			return false;
		return true;
	}
	
}
