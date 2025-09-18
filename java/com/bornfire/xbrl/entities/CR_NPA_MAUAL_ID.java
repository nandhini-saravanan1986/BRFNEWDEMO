package com.bornfire.xbrl.entities;

import java.io.Serializable;
import java.util.Date;

public class CR_NPA_MAUAL_ID implements Serializable{

	private static final long serialVersionUID = 1L;
	private String	FORACID;
	private Date	REPORT_DATE;
	public String getFORACID() {
		return FORACID;
	}
	public void setFORACID(String fORACID) {
		FORACID = fORACID;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FORACID == null) ? 0 : FORACID.hashCode());
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
		CR_NPA_MAUAL_ID other = (CR_NPA_MAUAL_ID) obj;
		if (FORACID == null) {
			if (other.FORACID != null)
				return false;
		} else if (!FORACID.equals(other.FORACID))
			return false;
		return true;
	}
	public CR_NPA_MAUAL_ID(String fORACID, Date rEPORT_DATE) {
		super();
		FORACID = fORACID;
		REPORT_DATE = rEPORT_DATE;
	}
	public CR_NPA_MAUAL_ID() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
