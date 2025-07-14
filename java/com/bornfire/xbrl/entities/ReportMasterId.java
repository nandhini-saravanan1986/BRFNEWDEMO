package com.bornfire.xbrl.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReportMasterId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String	report_id;
	private String	section_id;
	private String	src_type;
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
	public String getSection_id() {
		return section_id;
	}
	public void setSection_id(String section_id) {
		this.section_id = section_id;
	}
	public String getSrc_type() {
		return src_type;
	}
	public void setSrc_type(String src_type) {
		this.src_type = src_type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((report_id == null) ? 0 : report_id.hashCode());
		result = prime * result + ((section_id == null) ? 0 : section_id.hashCode());
		result = prime * result + ((src_type == null) ? 0 : src_type.hashCode());
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
		ReportMasterId other = (ReportMasterId) obj;
		if (report_id == null) {
			if (other.report_id != null)
				return false;
		} else if (!report_id.equals(other.report_id))
			return false;
		if (section_id == null) {
			if (other.section_id != null)
				return false;
		} else if (!section_id.equals(other.section_id))
			return false;
		if (src_type == null) {
			if (other.src_type != null)
				return false;
		} else if (!src_type.equals(other.src_type))
			return false;
		return true;
	}

	
}
