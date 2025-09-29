package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "BRRS_M_CALOC_DETAILTABLE")
public class M_CALOC_Detail_Entity {
	
	@Id
	private String	cust_id;
	private String	acct_number;
	private String	acct_name;
	private String	data_type;
	private String	row_id;
	private String	column_id;
	private String	report_remarks;
	private String	modification_remarks;
	private String	data_entry_version;
	private BigDecimal	exposure_amount;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	report_date;
	private String	report_name;
	private String	create_user;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	create_time;
	
	private String	modify_user;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	modify_time;
	private String	verify_user;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	verify_time;
	
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getAcct_number() {
		return acct_number;
	}
	public void setAcct_number(String acct_number) {
		this.acct_number = acct_number;
	}
	public String getAcct_name() {
		return acct_name;
	}
	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public String getRow_id() {
		return row_id;
	}
	public void setRow_id(String row_id) {
		this.row_id = row_id;
	}
	public String getColumn_id() {
		return column_id;
	}
	public void setColumn_id(String column_id) {
		this.column_id = column_id;
	}
	public String getReport_remarks() {
		return report_remarks;
	}
	public void setReport_remarks(String report_remarks) {
		this.report_remarks = report_remarks;
	}
	public String getModification_remarks() {
		return modification_remarks;
	}
	public void setModification_remarks(String modification_remarks) {
		this.modification_remarks = modification_remarks;
	}
	public String getData_entry_version() {
		return data_entry_version;
	}
	public void setData_entry_version(String data_entry_version) {
		this.data_entry_version = data_entry_version;
	}
	public BigDecimal getExposure_amount() {
		return exposure_amount;
	}
	public void setExposure_amount(BigDecimal exposure_amount) {
		this.exposure_amount = exposure_amount;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getModify_user() {
		return modify_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public String getVerify_user() {
		return verify_user;
	}
	public void setVerify_user(String verify_user) {
		this.verify_user = verify_user;
	}
	public Date getVerify_time() {
		return verify_time;
	}
	public void setVerify_time(Date verify_time) {
		this.verify_time = verify_time;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public M_CALOC_Detail_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
