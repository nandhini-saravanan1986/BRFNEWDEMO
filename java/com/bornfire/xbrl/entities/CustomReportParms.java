package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOM_RPT_PARMS")
public class CustomReportParms {
	
	@Id
	private String  rpt_ref_no;
	private String  rpt_code;
	private String	rpt_name;
	private String	scr_name;
	private String	exe_type;
	private String	input_1;
	private String	input_2;
	private String	input_3;
	private String	input_4;
	private String	input_5;
	private String	output_file_name;
	private String	location;
	private String	del_flg;
	private String	entity_flg;
	private String	modify_flg;
	private Date	entry_time;
	private Date	modify_time;
	private Date	verify_time;
	private String	entry_user;
	private String	modify_user;
	private String	verify_user;
	private String 	value_1;
	private String  value_2;
	private String  value_3;
	private String  value_4;
	private String  value_5;
	
	public String getValue_1() {
		return value_1;
	}
	public void setValue_1(String value_1) {
		this.value_1 = value_1;
	}
	public String getValue_2() {
		return value_2;
	}
	public void setValue_2(String value_2) {
		this.value_2 = value_2;
	}
	public String getValue_3() {
		return value_3;
	}
	public void setValue_3(String value_3) {
		this.value_3 = value_3;
	}
	public String getValue_4() {
		return value_4;
	}
	public void setValue_4(String value_4) {
		this.value_4 = value_4;
	}
	public String getValue_5() {
		return value_5;
	}
	public void setValue_5(String value_5) {
		this.value_5 = value_5;
	}
	public String getRpt_ref_no() {
		return rpt_ref_no;
	}
	public String getRpt_code() {
		return rpt_code;
	}
	public String getRpt_name() {
		return rpt_name;
	}
	public String getScr_name() {
		return scr_name;
	}
	public String getExe_type() {
		return exe_type;
	}
	public String getInput_1() {
		return input_1;
	}
	public String getInput_2() {
		return input_2;
	}
	public String getInput_3() {
		return input_3;
	}
	public String getInput_4() {
		return input_4;
	}
	public String getInput_5() {
		return input_5;
	}
	public String getOutput_file_name() {
		return output_file_name;
	}
	public String getLocation() {
		return location;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public Date getVerify_time() {
		return verify_time;
	}
	public String getEntry_user() {
		return entry_user;
	}
	public String getModify_user() {
		return modify_user;
	}
	public String getVerify_user() {
		return verify_user;
	}
	public void setRpt_ref_no(String rpt_ref_no) {
		this.rpt_ref_no = rpt_ref_no;
	}
	public void setRpt_code(String rpt_code) {
		this.rpt_code = rpt_code;
	}
	public void setRpt_name(String rpt_name) {
		this.rpt_name = rpt_name;
	}
	public void setScr_name(String scr_name) {
		this.scr_name = scr_name;
	}
	public void setExe_type(String exe_type) {
		this.exe_type = exe_type;
	}
	public void setInput_1(String input_1) {
		this.input_1 = input_1;
	}
	public void setInput_2(String input_2) {
		this.input_2 = input_2;
	}
	public void setInput_3(String input_3) {
		this.input_3 = input_3;
	}
	public void setInput_4(String input_4) {
		this.input_4 = input_4;
	}
	public void setInput_5(String input_5) {
		this.input_5 = input_5;
	}
	public void setOutput_file_name(String output_file_name) {
		this.output_file_name = output_file_name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public void setVerify_time(Date verify_time) {
		this.verify_time = verify_time;
	}
	public void setEntry_user(String entry_user) {
		this.entry_user = entry_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public void setVerify_user(String verify_user) {
		this.verify_user = verify_user;
	}
	
	
	


}
