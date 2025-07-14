package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="T25_STR_TABLE")
public class T25Report {

	private String	d1a_str_mlro;
	private String	d2a_avg_time__raising_str;
	private String	d3a_str_closed_mlro;
	private String	d4a_avg_time_cls_str;
	private String	d5a_nof_str_by_mlro;
	private String	d6a_avg_time_filing_str;
	private String	c1c_nof_str_filed_mlro;
	private String	c2c_avg_time__raising_str;
	private String	c3c_nof_str_closed_mlro;
	private String	c4c_avg_time_closed_mlro;
	private String	c5c_nof_str_filed_mlro;
	private String	c6c_avg_time_filed_str;
	private String	report_code;
	private String	report_name;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	report_date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_due_date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	rep_submit_date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	rep_period_from;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	rep_period_to;
	private String	rep_freq;
	private String	nil_report_flg;
	private String	arch_flg;
	private String	entity_flg;
	private String	del_flg;
	private String	modify_flg;
	private String	entry_user;
	private String	modify_user;
	private String	verify_user;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	entry_time;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	modify_time;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	verify_time;
	private String	qtr_flg;
	public String getD1a_str_mlro() {
		return d1a_str_mlro;
	}
	public void setD1a_str_mlro(String d1a_str_mlro) {
		this.d1a_str_mlro = d1a_str_mlro;
	}
	public String getD2a_avg_time__raising_str() {
		return d2a_avg_time__raising_str;
	}
	public void setD2a_avg_time__raising_str(String d2a_avg_time__raising_str) {
		this.d2a_avg_time__raising_str = d2a_avg_time__raising_str;
	}
	public String getD3a_str_closed_mlro() {
		return d3a_str_closed_mlro;
	}
	public void setD3a_str_closed_mlro(String d3a_str_closed_mlro) {
		this.d3a_str_closed_mlro = d3a_str_closed_mlro;
	}
	public String getD4a_avg_time_cls_str() {
		return d4a_avg_time_cls_str;
	}
	public void setD4a_avg_time_cls_str(String d4a_avg_time_cls_str) {
		this.d4a_avg_time_cls_str = d4a_avg_time_cls_str;
	}
	public String getD5a_nof_str_by_mlro() {
		return d5a_nof_str_by_mlro;
	}
	public void setD5a_nof_str_by_mlro(String d5a_nof_str_by_mlro) {
		this.d5a_nof_str_by_mlro = d5a_nof_str_by_mlro;
	}
	public String getD6a_avg_time_filing_str() {
		return d6a_avg_time_filing_str;
	}
	public void setD6a_avg_time_filing_str(String d6a_avg_time_filing_str) {
		this.d6a_avg_time_filing_str = d6a_avg_time_filing_str;
	}
	public String getC1c_nof_str_filed_mlro() {
		return c1c_nof_str_filed_mlro;
	}
	public void setC1c_nof_str_filed_mlro(String c1c_nof_str_filed_mlro) {
		this.c1c_nof_str_filed_mlro = c1c_nof_str_filed_mlro;
	}
	public String getC2c_avg_time__raising_str() {
		return c2c_avg_time__raising_str;
	}
	public void setC2c_avg_time__raising_str(String c2c_avg_time__raising_str) {
		this.c2c_avg_time__raising_str = c2c_avg_time__raising_str;
	}
	public String getC3c_nof_str_closed_mlro() {
		return c3c_nof_str_closed_mlro;
	}
	public void setC3c_nof_str_closed_mlro(String c3c_nof_str_closed_mlro) {
		this.c3c_nof_str_closed_mlro = c3c_nof_str_closed_mlro;
	}
	public String getC4c_avg_time_closed_mlro() {
		return c4c_avg_time_closed_mlro;
	}
	public void setC4c_avg_time_closed_mlro(String c4c_avg_time_closed_mlro) {
		this.c4c_avg_time_closed_mlro = c4c_avg_time_closed_mlro;
	}
	public String getC5c_nof_str_filed_mlro() {
		return c5c_nof_str_filed_mlro;
	}
	public void setC5c_nof_str_filed_mlro(String c5c_nof_str_filed_mlro) {
		this.c5c_nof_str_filed_mlro = c5c_nof_str_filed_mlro;
	}
	public String getC6c_avg_time_filed_str() {
		return c6c_avg_time_filed_str;
	}
	public void setC6c_avg_time_filed_str(String c6c_avg_time_filed_str) {
		this.c6c_avg_time_filed_str = c6c_avg_time_filed_str;
	}
	public String getReport_code() {
		return report_code;
	}
	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public Date getReport_due_date() {
		return report_due_date;
	}
	public void setReport_due_date(Date report_due_date) {
		this.report_due_date = report_due_date;
	}
	public Date getRep_submit_date() {
		return rep_submit_date;
	}
	public void setRep_submit_date(Date rep_submit_date) {
		this.rep_submit_date = rep_submit_date;
	}
	public Date getRep_period_from() {
		return rep_period_from;
	}
	public void setRep_period_from(Date rep_period_from) {
		this.rep_period_from = rep_period_from;
	}
	public Date getRep_period_to() {
		return rep_period_to;
	}
	public void setRep_period_to(Date rep_period_to) {
		this.rep_period_to = rep_period_to;
	}
	public String getRep_freq() {
		return rep_freq;
	}
	public void setRep_freq(String rep_freq) {
		this.rep_freq = rep_freq;
	}
	public String getNil_report_flg() {
		return nil_report_flg;
	}
	public void setNil_report_flg(String nil_report_flg) {
		this.nil_report_flg = nil_report_flg;
	}
	public String getArch_flg() {
		return arch_flg;
	}
	public void setArch_flg(String arch_flg) {
		this.arch_flg = arch_flg;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getEntry_user() {
		return entry_user;
	}
	public void setEntry_user(String entry_user) {
		this.entry_user = entry_user;
	}
	public String getModify_user() {
		return modify_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public String getVerify_user() {
		return verify_user;
	}
	public void setVerify_user(String verify_user) {
		this.verify_user = verify_user;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public Date getVerify_time() {
		return verify_time;
	}
	public void setVerify_time(Date verify_time) {
		this.verify_time = verify_time;
	}
	public String getQtr_flg() {
		return qtr_flg;
	}
	public void setQtr_flg(String qtr_flg) {
		this.qtr_flg = qtr_flg;
	}
	public T25Report(String d1a_str_mlro, String d2a_avg_time__raising_str, String d3a_str_closed_mlro,
			String d4a_avg_time_cls_str, String d5a_nof_str_by_mlro, String d6a_avg_time_filing_str,
			String c1c_nof_str_filed_mlro, String c2c_avg_time__raising_str, String c3c_nof_str_closed_mlro,
			String c4c_avg_time_closed_mlro, String c5c_nof_str_filed_mlro, String c6c_avg_time_filed_str,
			String report_code, String report_name, Date report_date, Date report_due_date, Date rep_submit_date,
			Date rep_period_from, Date rep_period_to, String rep_freq, String nil_report_flg, String arch_flg,
			String entity_flg, String del_flg, String modify_flg, String entry_user, String modify_user,
			String verify_user, Date entry_time, Date modify_time, Date verify_time, String qtr_flg) {
		super();
		this.d1a_str_mlro = d1a_str_mlro;
		this.d2a_avg_time__raising_str = d2a_avg_time__raising_str;
		this.d3a_str_closed_mlro = d3a_str_closed_mlro;
		this.d4a_avg_time_cls_str = d4a_avg_time_cls_str;
		this.d5a_nof_str_by_mlro = d5a_nof_str_by_mlro;
		this.d6a_avg_time_filing_str = d6a_avg_time_filing_str;
		this.c1c_nof_str_filed_mlro = c1c_nof_str_filed_mlro;
		this.c2c_avg_time__raising_str = c2c_avg_time__raising_str;
		this.c3c_nof_str_closed_mlro = c3c_nof_str_closed_mlro;
		this.c4c_avg_time_closed_mlro = c4c_avg_time_closed_mlro;
		this.c5c_nof_str_filed_mlro = c5c_nof_str_filed_mlro;
		this.c6c_avg_time_filed_str = c6c_avg_time_filed_str;
		this.report_code = report_code;
		this.report_name = report_name;
		this.report_date = report_date;
		this.report_due_date = report_due_date;
		this.rep_submit_date = rep_submit_date;
		this.rep_period_from = rep_period_from;
		this.rep_period_to = rep_period_to;
		this.rep_freq = rep_freq;
		this.nil_report_flg = nil_report_flg;
		this.arch_flg = arch_flg;
		this.entity_flg = entity_flg;
		this.del_flg = del_flg;
		this.modify_flg = modify_flg;
		this.entry_user = entry_user;
		this.modify_user = modify_user;
		this.verify_user = verify_user;
		this.entry_time = entry_time;
		this.modify_time = modify_time;
		this.verify_time = verify_time;
		this.qtr_flg = qtr_flg;
	}
	public T25Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
