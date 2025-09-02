package com.bornfire.xbrl.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class ReportStatusInfoId implements Serializable {

	private static final long serialVersionUID = 1L;

	String report_id;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date report_date;

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public Date getReport_date() {
		return report_date;
	}

	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	
	

	public ReportStatusInfoId() {
		
	}

	public ReportStatusInfoId(String report_id, Date report_date) {
		super();
		this.report_id = report_id;
		this.report_date = report_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((report_date == null) ? 0 : report_date.hashCode());
		result = prime * result + ((report_id == null) ? 0 : report_id.hashCode());
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
		ReportStatusInfoId other = (ReportStatusInfoId) obj;
		if (report_date == null) {
			if (other.report_date != null)
				return false;
		} else if (!report_date.equals(other.report_date))
			return false;
		if (report_id == null) {
			if (other.report_id != null)
				return false;
		} else if (!report_id.equals(other.report_id))
			return false;
		return true;
	}
	
	

}
