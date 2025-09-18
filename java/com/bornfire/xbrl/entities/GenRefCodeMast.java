package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GEN_REF_CODE_MAST_TB")
public class GenRefCodeMast  {
	
	@Id
	@Column(name = "REF_CODE_TYPE")
	private String refCodeType;
	
	@Column(name = "REF_CODE")
	private String refCode;
	
	@Column(name = "REF_CODE_DESC")
	private String refCodeDesc;
	
	@Column(name = "SOURCE_SYS_CODE")
	private String sourceSysCode;
	
	@Column(name = "UPDATABLE_FLG")
	private String updatableFlg;
	
	@Column(name = "LAST_USER_UPD")
	private String lastUserUpd;
	
	@Column(name = "LAST_UPD_DT")
	private Date lastUpddt;

	public String getRefCodeType() {
		return refCodeType;
	}

	public void setRefCodeType(String refCodeType) {
		this.refCodeType = refCodeType;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getRefCodeDesc() {
		return refCodeDesc;
	}

	public void setRefCodeDesc(String refCodeDesc) {
		this.refCodeDesc = refCodeDesc;
	}

	public String getSourceSysCode() {
		return sourceSysCode;
	}

	public void setSourceSysCode(String sourceSysCode) {
		this.sourceSysCode = sourceSysCode;
	}

	public String getUpdatableFlg() {
		return updatableFlg;
	}

	public void setUpdatableFlg(String updatableFlg) {
		this.updatableFlg = updatableFlg;
	}

	public String getLastUserUpd() {
		return lastUserUpd;
	}

	public void setLastUserUpd(String lastUserUpd) {
		this.lastUserUpd = lastUserUpd;
	}

	public Date getLastUpddt() {
		return lastUpddt;
	}

	public void setLastUpddt(Date lastUpddt) {
		this.lastUpddt = lastUpddt;
	}

	public GenRefCodeMast(String refCodeType, String refCode, String refCodeDesc, String sourceSysCode) {
		this.refCodeType = refCodeType;
		this.refCode = refCode;
		this.refCodeDesc = refCodeDesc;
		this.sourceSysCode = sourceSysCode;
	}
	
	
	public GenRefCodeMast() {
		
	}

	



}
