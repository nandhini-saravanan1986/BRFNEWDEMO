package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "T16E_CASH_TRAN_QTR_NON_EXEMPT_TABLE")
public class T16EReport {

	
	
	private String	a1_desc;
	private BigDecimal	a1_cust_low;
	private BigDecimal	a1_tran_low;
	private BigDecimal	a1_series_low;
	private BigDecimal	a1_total_low;
	private BigDecimal	a1_cust_medium;
	private BigDecimal	a1_tran_medium;
	private BigDecimal	a1_series_medium;
	private BigDecimal	a1_total_medium;
	private BigDecimal	a1_cust_high;
	private BigDecimal	a1_tran_high;
	private BigDecimal	a1_series_high;
	private BigDecimal	a1_total_high;
	private String	b1_desc;
	private BigDecimal	b1_cust_low;
	private BigDecimal	b1_tran_low;
	private BigDecimal	b1_series_low;
	private BigDecimal	b1_total_low;
	private BigDecimal	b1_cust_medium;
	private BigDecimal	b1_tran_medium;
	private BigDecimal	b1_series_medium;
	private BigDecimal	b1_total_medium;
	private BigDecimal	b1_cust_high;
	private BigDecimal	b1_tran_high;
	private BigDecimal	b1_series_high;
	private BigDecimal	b1_total_high;
	private String	c1_desc;
	private BigDecimal	c1_cust_low;
	private BigDecimal	c1_tran_low;
	private BigDecimal	c1_series_low;
	private BigDecimal	c1_total_low;
	private BigDecimal	c1_cust_medium;
	private BigDecimal	c1_tran_medium;
	private BigDecimal	c1_series_medium;
	private BigDecimal	c1_total_medium;
	private BigDecimal	c1_cust_high;
	private BigDecimal	c1_tran_high;
	private BigDecimal	c1_series_high;
	private BigDecimal	c1_total_high;
	private String	d1_desc;
	private BigDecimal	d1_cust_low;
	private BigDecimal	d1_tran_low;
	private BigDecimal	d1_series_low;
	private BigDecimal	d1_total_low;
	private BigDecimal	d1_cust_medium;
	private BigDecimal	d1_tran_medium;
	private BigDecimal	d1_series_medium;
	private BigDecimal	d1_total_medium;
	private BigDecimal	d1_cust_high;
	private BigDecimal	d1_tran_high;
	private BigDecimal	d1_series_high;
	private BigDecimal	d1_total_high;
	private String	report_code;
	private String	report_name;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
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
	private Character entity_flg;
	private Character modify_flg;
	private Character del_flg;
	

	public Character getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(Character entity_flg) {
		this.entity_flg = entity_flg;
	}
	public Character getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(Character modify_flg) {
		this.modify_flg = modify_flg;
	}
	public Character getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(Character del_flg) {
		this.del_flg = del_flg;
	}
	public String getA1_desc() {
		return a1_desc;
	}
	public void setA1_desc(String a1_desc) {
		this.a1_desc = a1_desc;
	}
	public BigDecimal getA1_cust_low() {
		return a1_cust_low;
	}
	public void setA1_cust_low(BigDecimal a1_cust_low) {
		this.a1_cust_low = a1_cust_low;
	}
	public BigDecimal getA1_tran_low() {
		return a1_tran_low;
	}
	public void setA1_tran_low(BigDecimal a1_tran_low) {
		this.a1_tran_low = a1_tran_low;
	}
	public BigDecimal getA1_series_low() {
		return a1_series_low;
	}
	public void setA1_series_low(BigDecimal a1_series_low) {
		this.a1_series_low = a1_series_low;
	}
	public BigDecimal getA1_total_low() {
		return a1_total_low;
	}
	public void setA1_total_low(BigDecimal a1_total_low) {
		this.a1_total_low = a1_total_low;
	}
	public BigDecimal getA1_cust_medium() {
		return a1_cust_medium;
	}
	public void setA1_cust_medium(BigDecimal a1_cust_medium) {
		this.a1_cust_medium = a1_cust_medium;
	}
	public BigDecimal getA1_tran_medium() {
		return a1_tran_medium;
	}
	public void setA1_tran_medium(BigDecimal a1_tran_medium) {
		this.a1_tran_medium = a1_tran_medium;
	}
	public BigDecimal getA1_series_medium() {
		return a1_series_medium;
	}
	public void setA1_series_medium(BigDecimal a1_series_medium) {
		this.a1_series_medium = a1_series_medium;
	}
	public BigDecimal getA1_total_medium() {
		return a1_total_medium;
	}
	public void setA1_total_medium(BigDecimal a1_total_medium) {
		this.a1_total_medium = a1_total_medium;
	}
	public BigDecimal getA1_cust_high() {
		return a1_cust_high;
	}
	public void setA1_cust_high(BigDecimal a1_cust_high) {
		this.a1_cust_high = a1_cust_high;
	}
	public BigDecimal getA1_tran_high() {
		return a1_tran_high;
	}
	public void setA1_tran_high(BigDecimal a1_tran_high) {
		this.a1_tran_high = a1_tran_high;
	}
	public BigDecimal getA1_series_high() {
		return a1_series_high;
	}
	public void setA1_series_high(BigDecimal a1_series_high) {
		this.a1_series_high = a1_series_high;
	}
	public BigDecimal getA1_total_high() {
		return a1_total_high;
	}
	public void setA1_total_high(BigDecimal a1_total_high) {
		this.a1_total_high = a1_total_high;
	}
	public String getB1_desc() {
		return b1_desc;
	}
	public void setB1_desc(String b1_desc) {
		this.b1_desc = b1_desc;
	}
	public BigDecimal getB1_cust_low() {
		return b1_cust_low;
	}
	public void setB1_cust_low(BigDecimal b1_cust_low) {
		this.b1_cust_low = b1_cust_low;
	}
	public BigDecimal getB1_tran_low() {
		return b1_tran_low;
	}
	public void setB1_tran_low(BigDecimal b1_tran_low) {
		this.b1_tran_low = b1_tran_low;
	}
	public BigDecimal getB1_series_low() {
		return b1_series_low;
	}
	public void setB1_series_low(BigDecimal b1_series_low) {
		this.b1_series_low = b1_series_low;
	}
	public BigDecimal getB1_total_low() {
		return b1_total_low;
	}
	public void setB1_total_low(BigDecimal b1_total_low) {
		this.b1_total_low = b1_total_low;
	}
	public BigDecimal getB1_cust_medium() {
		return b1_cust_medium;
	}
	public void setB1_cust_medium(BigDecimal b1_cust_medium) {
		this.b1_cust_medium = b1_cust_medium;
	}
	public BigDecimal getB1_tran_medium() {
		return b1_tran_medium;
	}
	public void setB1_tran_medium(BigDecimal b1_tran_medium) {
		this.b1_tran_medium = b1_tran_medium;
	}
	public BigDecimal getB1_series_medium() {
		return b1_series_medium;
	}
	public void setB1_series_medium(BigDecimal b1_series_medium) {
		this.b1_series_medium = b1_series_medium;
	}
	public BigDecimal getB1_total_medium() {
		return b1_total_medium;
	}
	public void setB1_total_medium(BigDecimal b1_total_medium) {
		this.b1_total_medium = b1_total_medium;
	}
	public BigDecimal getB1_cust_high() {
		return b1_cust_high;
	}
	public void setB1_cust_high(BigDecimal b1_cust_high) {
		this.b1_cust_high = b1_cust_high;
	}
	public BigDecimal getB1_tran_high() {
		return b1_tran_high;
	}
	public void setB1_tran_high(BigDecimal b1_tran_high) {
		this.b1_tran_high = b1_tran_high;
	}
	public BigDecimal getB1_series_high() {
		return b1_series_high;
	}
	public void setB1_series_high(BigDecimal b1_series_high) {
		this.b1_series_high = b1_series_high;
	}
	public BigDecimal getB1_total_high() {
		return b1_total_high;
	}
	public void setB1_total_high(BigDecimal b1_total_high) {
		this.b1_total_high = b1_total_high;
	}
	public String getC1_desc() {
		return c1_desc;
	}
	public void setC1_desc(String c1_desc) {
		this.c1_desc = c1_desc;
	}
	public BigDecimal getC1_cust_low() {
		return c1_cust_low;
	}
	public void setC1_cust_low(BigDecimal c1_cust_low) {
		this.c1_cust_low = c1_cust_low;
	}
	public BigDecimal getC1_tran_low() {
		return c1_tran_low;
	}
	public void setC1_tran_low(BigDecimal c1_tran_low) {
		this.c1_tran_low = c1_tran_low;
	}
	public BigDecimal getC1_series_low() {
		return c1_series_low;
	}
	public void setC1_series_low(BigDecimal c1_series_low) {
		this.c1_series_low = c1_series_low;
	}
	public BigDecimal getC1_total_low() {
		return c1_total_low;
	}
	public void setC1_total_low(BigDecimal c1_total_low) {
		this.c1_total_low = c1_total_low;
	}
	public BigDecimal getC1_cust_medium() {
		return c1_cust_medium;
	}
	public void setC1_cust_medium(BigDecimal c1_cust_medium) {
		this.c1_cust_medium = c1_cust_medium;
	}
	public BigDecimal getC1_tran_medium() {
		return c1_tran_medium;
	}
	public void setC1_tran_medium(BigDecimal c1_tran_medium) {
		this.c1_tran_medium = c1_tran_medium;
	}
	public BigDecimal getC1_series_medium() {
		return c1_series_medium;
	}
	public void setC1_series_medium(BigDecimal c1_series_medium) {
		this.c1_series_medium = c1_series_medium;
	}
	public BigDecimal getC1_total_medium() {
		return c1_total_medium;
	}
	public void setC1_total_medium(BigDecimal c1_total_medium) {
		this.c1_total_medium = c1_total_medium;
	}
	public BigDecimal getC1_cust_high() {
		return c1_cust_high;
	}
	public void setC1_cust_high(BigDecimal c1_cust_high) {
		this.c1_cust_high = c1_cust_high;
	}
	public BigDecimal getC1_tran_high() {
		return c1_tran_high;
	}
	public void setC1_tran_high(BigDecimal c1_tran_high) {
		this.c1_tran_high = c1_tran_high;
	}
	public BigDecimal getC1_series_high() {
		return c1_series_high;
	}
	public void setC1_series_high(BigDecimal c1_series_high) {
		this.c1_series_high = c1_series_high;
	}
	public BigDecimal getC1_total_high() {
		return c1_total_high;
	}
	public void setC1_total_high(BigDecimal c1_total_high) {
		this.c1_total_high = c1_total_high;
	}
	public String getD1_desc() {
		return d1_desc;
	}
	public void setD1_desc(String d1_desc) {
		this.d1_desc = d1_desc;
	}
	public BigDecimal getD1_cust_low() {
		return d1_cust_low;
	}
	public void setD1_cust_low(BigDecimal d1_cust_low) {
		this.d1_cust_low = d1_cust_low;
	}
	public BigDecimal getD1_tran_low() {
		return d1_tran_low;
	}
	public void setD1_tran_low(BigDecimal d1_tran_low) {
		this.d1_tran_low = d1_tran_low;
	}
	public BigDecimal getD1_series_low() {
		return d1_series_low;
	}
	public void setD1_series_low(BigDecimal d1_series_low) {
		this.d1_series_low = d1_series_low;
	}
	public BigDecimal getD1_total_low() {
		return d1_total_low;
	}
	public void setD1_total_low(BigDecimal d1_total_low) {
		this.d1_total_low = d1_total_low;
	}
	public BigDecimal getD1_cust_medium() {
		return d1_cust_medium;
	}
	public void setD1_cust_medium(BigDecimal d1_cust_medium) {
		this.d1_cust_medium = d1_cust_medium;
	}
	public BigDecimal getD1_tran_medium() {
		return d1_tran_medium;
	}
	public void setD1_tran_medium(BigDecimal d1_tran_medium) {
		this.d1_tran_medium = d1_tran_medium;
	}
	public BigDecimal getD1_series_medium() {
		return d1_series_medium;
	}
	public void setD1_series_medium(BigDecimal d1_series_medium) {
		this.d1_series_medium = d1_series_medium;
	}
	public BigDecimal getD1_total_medium() {
		return d1_total_medium;
	}
	public void setD1_total_medium(BigDecimal d1_total_medium) {
		this.d1_total_medium = d1_total_medium;
	}
	public BigDecimal getD1_cust_high() {
		return d1_cust_high;
	}
	public void setD1_cust_high(BigDecimal d1_cust_high) {
		this.d1_cust_high = d1_cust_high;
	}
	public BigDecimal getD1_tran_high() {
		return d1_tran_high;
	}
	public void setD1_tran_high(BigDecimal d1_tran_high) {
		this.d1_tran_high = d1_tran_high;
	}
	public BigDecimal getD1_series_high() {
		return d1_series_high;
	}
	public void setD1_series_high(BigDecimal d1_series_high) {
		this.d1_series_high = d1_series_high;
	}
	public BigDecimal getD1_total_high() {
		return d1_total_high;
	}
	public void setD1_total_high(BigDecimal d1_total_high) {
		this.d1_total_high = d1_total_high;
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
	public T16EReport(String a1_desc, BigDecimal a1_cust_low, BigDecimal a1_tran_low, BigDecimal a1_series_low,
			BigDecimal a1_total_low, BigDecimal a1_cust_medium, BigDecimal a1_tran_medium, BigDecimal a1_series_medium,
			BigDecimal a1_total_medium, BigDecimal a1_cust_high, BigDecimal a1_tran_high, BigDecimal a1_series_high,
			BigDecimal a1_total_high, String b1_desc, BigDecimal b1_cust_low, BigDecimal b1_tran_low,
			BigDecimal b1_series_low, BigDecimal b1_total_low, BigDecimal b1_cust_medium, BigDecimal b1_tran_medium,
			BigDecimal b1_series_medium, BigDecimal b1_total_medium, BigDecimal b1_cust_high, BigDecimal b1_tran_high,
			BigDecimal b1_series_high, BigDecimal b1_total_high, String c1_desc, BigDecimal c1_cust_low,
			BigDecimal c1_tran_low, BigDecimal c1_series_low, BigDecimal c1_total_low, BigDecimal c1_cust_medium,
			BigDecimal c1_tran_medium, BigDecimal c1_series_medium, BigDecimal c1_total_medium, BigDecimal c1_cust_high,
			BigDecimal c1_tran_high, BigDecimal c1_series_high, BigDecimal c1_total_high, String d1_desc,
			BigDecimal d1_cust_low, BigDecimal d1_tran_low, BigDecimal d1_series_low, BigDecimal d1_total_low,
			BigDecimal d1_cust_medium, BigDecimal d1_tran_medium, BigDecimal d1_series_medium,
			BigDecimal d1_total_medium, BigDecimal d1_cust_high, BigDecimal d1_tran_high, BigDecimal d1_series_high,
			BigDecimal d1_total_high, String report_code, String report_name, Date report_date, Date report_due_date,
			Date rep_submit_date, Date rep_period_from, Date rep_period_to, String rep_freq, String nil_report_flg,
			String arch_flg, String entry_user, String modify_user, String verify_user, Date entry_time,
			Date modify_time, Date verify_time, Character entity_flg, Character modify_flg, Character del_flg) {
		super();
		this.a1_desc = a1_desc;
		this.a1_cust_low = a1_cust_low;
		this.a1_tran_low = a1_tran_low;
		this.a1_series_low = a1_series_low;
		this.a1_total_low = a1_total_low;
		this.a1_cust_medium = a1_cust_medium;
		this.a1_tran_medium = a1_tran_medium;
		this.a1_series_medium = a1_series_medium;
		this.a1_total_medium = a1_total_medium;
		this.a1_cust_high = a1_cust_high;
		this.a1_tran_high = a1_tran_high;
		this.a1_series_high = a1_series_high;
		this.a1_total_high = a1_total_high;
		this.b1_desc = b1_desc;
		this.b1_cust_low = b1_cust_low;
		this.b1_tran_low = b1_tran_low;
		this.b1_series_low = b1_series_low;
		this.b1_total_low = b1_total_low;
		this.b1_cust_medium = b1_cust_medium;
		this.b1_tran_medium = b1_tran_medium;
		this.b1_series_medium = b1_series_medium;
		this.b1_total_medium = b1_total_medium;
		this.b1_cust_high = b1_cust_high;
		this.b1_tran_high = b1_tran_high;
		this.b1_series_high = b1_series_high;
		this.b1_total_high = b1_total_high;
		this.c1_desc = c1_desc;
		this.c1_cust_low = c1_cust_low;
		this.c1_tran_low = c1_tran_low;
		this.c1_series_low = c1_series_low;
		this.c1_total_low = c1_total_low;
		this.c1_cust_medium = c1_cust_medium;
		this.c1_tran_medium = c1_tran_medium;
		this.c1_series_medium = c1_series_medium;
		this.c1_total_medium = c1_total_medium;
		this.c1_cust_high = c1_cust_high;
		this.c1_tran_high = c1_tran_high;
		this.c1_series_high = c1_series_high;
		this.c1_total_high = c1_total_high;
		this.d1_desc = d1_desc;
		this.d1_cust_low = d1_cust_low;
		this.d1_tran_low = d1_tran_low;
		this.d1_series_low = d1_series_low;
		this.d1_total_low = d1_total_low;
		this.d1_cust_medium = d1_cust_medium;
		this.d1_tran_medium = d1_tran_medium;
		this.d1_series_medium = d1_series_medium;
		this.d1_total_medium = d1_total_medium;
		this.d1_cust_high = d1_cust_high;
		this.d1_tran_high = d1_tran_high;
		this.d1_series_high = d1_series_high;
		this.d1_total_high = d1_total_high;
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
		this.entry_user = entry_user;
		this.modify_user = modify_user;
		this.verify_user = verify_user;
		this.entry_time = entry_time;
		this.modify_time = modify_time;
		this.verify_time = verify_time;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
	}
	public T16EReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
