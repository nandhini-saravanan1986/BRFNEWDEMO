package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BRBS_EMAIL_NOTIFICATION_TABLE")
public class EmailAlert {

	
	private String	send_flg;
	private BigDecimal	cuntry_code;
	
	private BigDecimal	phone_num;
	private String	email_id;
	private BigDecimal	msg_srl_no;
	private Date	msg_rcre_date;
	private Date	msg_date;
	private String	msg_type;
	private String	module_id;
	@Id
	private BigDecimal	email_srl_no;
	private Date	email_rcre_date;
	private Date	email_date;
	private String	email_sub;
	private String	email_body;
	private String	email_sign;
	private String	msg_status;
	private String	msg_delivery;
	private String	msg_return_status;
	private String	foracid;
	private String	cust_id;
	private String	del_flg;
	private String email_id_cc1;
	private String email_id_cc2;
	
	public String getEmail_id_cc1() {
		return email_id_cc1;
	}
	public void setEmail_id_cc1(String email_id_cc1) {
		this.email_id_cc1 = email_id_cc1;
	}
	public String getEmail_id_cc2() {
		return email_id_cc2;
	}
	public void setEmail_id_cc2(String email_id_cc2) {
		this.email_id_cc2 = email_id_cc2;
	}
	public String getSend_flg() {
		return send_flg;
	}
	public void setSend_flg(String send_flg) {
		this.send_flg = send_flg;
	}
	public BigDecimal getCuntry_code() {
		return cuntry_code;
	}
	public void setCuntry_code(BigDecimal cuntry_code) {
		this.cuntry_code = cuntry_code;
	}
	public BigDecimal getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(BigDecimal phone_num) {
		this.phone_num = phone_num;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public BigDecimal getMsg_srl_no() {
		return msg_srl_no;
	}
	public void setMsg_srl_no(BigDecimal msg_srl_no) {
		this.msg_srl_no = msg_srl_no;
	}
	public Date getMsg_rcre_date() {
		return msg_rcre_date;
	}
	public void setMsg_rcre_date(Date msg_rcre_date) {
		this.msg_rcre_date = msg_rcre_date;
	}
	public Date getMsg_date() {
		return msg_date;
	}
	public void setMsg_date(Date msg_date) {
		this.msg_date = msg_date;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getModule_id() {
		return module_id;
	}
	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}
	public BigDecimal getEmail_srl_no() {
		return email_srl_no;
	}
	public void setEmail_srl_no(BigDecimal email_srl_no) {
		this.email_srl_no = email_srl_no;
	}
	public Date getEmail_rcre_date() {
		return email_rcre_date;
	}
	public void setEmail_rcre_date(Date email_rcre_date) {
		this.email_rcre_date = email_rcre_date;
	}
	public Date getEmail_date() {
		return email_date;
	}
	public void setEmail_date(Date email_date) {
		this.email_date = email_date;
	}
	public String getEmail_sub() {
		return email_sub;
	}
	public void setEmail_sub(String email_sub) {
		this.email_sub = email_sub;
	}
	public String getEmail_body() {
		return email_body;
	}
	public void setEmail_body(String email_body) {
		this.email_body = email_body;
	}
	public String getEmail_sign() {
		return email_sign;
	}
	public void setEmail_sign(String email_sign) {
		this.email_sign = email_sign;
	}
	public String getMsg_status() {
		return msg_status;
	}
	public void setMsg_status(String msg_status) {
		this.msg_status = msg_status;
	}
	public String getMsg_delivery() {
		return msg_delivery;
	}
	public void setMsg_delivery(String msg_delivery) {
		this.msg_delivery = msg_delivery;
	}
	public String getMsg_return_status() {
		return msg_return_status;
	}
	public void setMsg_return_status(String msg_return_status) {
		this.msg_return_status = msg_return_status;
	}
	public String getForacid() {
		return foracid;
	}
	public void setForacid(String foracid) {
		this.foracid = foracid;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}

}
