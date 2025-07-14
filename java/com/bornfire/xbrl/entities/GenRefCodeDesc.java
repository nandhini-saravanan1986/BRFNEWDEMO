package com.bornfire.xbrl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GEN_REF_CODE_DESC_TB")
public class GenRefCodeDesc {
	
	@Id
	@Column(name = "REF_CODE_TYPE")
	private String refCodeType;
	
	@Column(name = "REF_CODE_TYPE_DESC")
	private String refCodeTypeDesc;
	
	@Column(name = "REF_CODE_VIEW")
	private String refCodeView;
	
	@Column(name = "DEPENDENT_REPORT_ID")
	private String dependentReportId;
	
	@Column(name = "SOURCE_SYS_FIELD")
	private String sourceSysField;

	public String getRefCodeType() {
		return refCodeType;
	}

	public void setRefCodeType(String refCodeType) {
		this.refCodeType = refCodeType;
	}

	public String getRefCodeTypeDesc() {
		return refCodeTypeDesc;
	}

	public void setRefCodeTypeDesc(String refCodeTypeDesc) {
		this.refCodeTypeDesc = refCodeTypeDesc;
	}

	public String getRefCodeView() {
		return refCodeView;
	}

	public void setRefCodeView(String refCodeView) {
		this.refCodeView = refCodeView;
	}

	public String getDependentReportId() {
		return dependentReportId;
	}

	public void setDependentReportId(String dependentReportId) {
		this.dependentReportId = dependentReportId;
	}

	public String getSourceSysField() {
		return sourceSysField;
	}

	public void setSourceSysField(String sourceSysField) {
		this.sourceSysField = sourceSysField;
	}
	


}
