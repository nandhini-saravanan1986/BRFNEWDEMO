package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="T26_INACTIVE_DORM_ACCTS_TABLE")
public class T26Report {


	private String	d11a_tot_dep_accts;
	private String	d12a_inactive_dorm_accts;
	private String	d13a_frozen_accts;
	private String	d14a_inacive_forzen_dorm_reactivate;
	private BigDecimal	c11b_tot_dep_accts_noa_hig;
	private BigDecimal	c12b_inactive_dorm_accts_noa_hig;
	private BigDecimal	c13b_frozen_accts_noa_hig;
	private BigDecimal	c14b_inacive_forzen_dorm_reactivate_noa_hig;
	private BigDecimal	c11c_tot_dep_accts_amt_hig;
	private BigDecimal	c12c_inactive_dorm_accts_amt_hig;
	private BigDecimal	c13c_frozen_accts_amt_hig;
	private BigDecimal	c14c_inacive_forzen_dorm_reactivate_amt_hig;
	private BigDecimal	c11d_tot_dep_accts_noa_med;
	private BigDecimal	c12d_inactive_dorm_accts_noa_med;
	private BigDecimal	c13d_frozen_accts_noa_med;
	private BigDecimal	c14d_inacive_forzen_dorm_reactivate_noa_med;
	private BigDecimal	c11e_tot_dep_accts_amt_med;
	private BigDecimal	c12e_inactive_dorm_accts_amt_med;
	private BigDecimal	c13e_frozen_accts_amt_med;
	private BigDecimal	c14e_inacive_forzen_dorm_reactivate_amt_med;
	private BigDecimal	c11f_tot_dep_accts_noa_low;
	private BigDecimal	c12f_inactive_dorm_accts_noa_low;
	private BigDecimal	c13f_frozen_accts_noa_low;
	private BigDecimal	c14f_inacive_forzen_dorm_reactivate_noa_low;
	private BigDecimal	c11g_tot_dep_accts_amt_low;
	private BigDecimal	c12g_inactive_dorm_accts_amt_low;
	private BigDecimal	c13g_frozen_accts_amt_low;
	private BigDecimal	c14g_inacive_forzen_dorm_reactivatg_amt_low;
	private String	report_code;
	private String	report_name;
	@Id
	private Date	report_date;
	private Date	report_due_date;
	private Date	rep_submit_date;
	private Date	rep_period_from;
	private Date	rep_period_to;
	private String	rep_freq;
	private Character	nil_report_flg;
	private Character	arch_flg;
	public String getD11a_tot_dep_accts() {
		return d11a_tot_dep_accts;
	}
	public void setD11a_tot_dep_accts(String d11a_tot_dep_accts) {
		this.d11a_tot_dep_accts = d11a_tot_dep_accts;
	}
	public String getD12a_inactive_dorm_accts() {
		return d12a_inactive_dorm_accts;
	}
	public void setD12a_inactive_dorm_accts(String d12a_inactive_dorm_accts) {
		this.d12a_inactive_dorm_accts = d12a_inactive_dorm_accts;
	}
	public String getD13a_frozen_accts() {
		return d13a_frozen_accts;
	}
	public void setD13a_frozen_accts(String d13a_frozen_accts) {
		this.d13a_frozen_accts = d13a_frozen_accts;
	}
	public String getD14a_inacive_forzen_dorm_reactivate() {
		return d14a_inacive_forzen_dorm_reactivate;
	}
	public void setD14a_inacive_forzen_dorm_reactivate(String d14a_inacive_forzen_dorm_reactivate) {
		this.d14a_inacive_forzen_dorm_reactivate = d14a_inacive_forzen_dorm_reactivate;
	}
	public BigDecimal getC11b_tot_dep_accts_noa_hig() {
		return c11b_tot_dep_accts_noa_hig;
	}
	public void setC11b_tot_dep_accts_noa_hig(BigDecimal c11b_tot_dep_accts_noa_hig) {
		this.c11b_tot_dep_accts_noa_hig = c11b_tot_dep_accts_noa_hig;
	}
	public BigDecimal getC12b_inactive_dorm_accts_noa_hig() {
		return c12b_inactive_dorm_accts_noa_hig;
	}
	public void setC12b_inactive_dorm_accts_noa_hig(BigDecimal c12b_inactive_dorm_accts_noa_hig) {
		this.c12b_inactive_dorm_accts_noa_hig = c12b_inactive_dorm_accts_noa_hig;
	}
	public BigDecimal getC13b_frozen_accts_noa_hig() {
		return c13b_frozen_accts_noa_hig;
	}
	public void setC13b_frozen_accts_noa_hig(BigDecimal c13b_frozen_accts_noa_hig) {
		this.c13b_frozen_accts_noa_hig = c13b_frozen_accts_noa_hig;
	}
	public BigDecimal getC14b_inacive_forzen_dorm_reactivate_noa_hig() {
		return c14b_inacive_forzen_dorm_reactivate_noa_hig;
	}
	public void setC14b_inacive_forzen_dorm_reactivate_noa_hig(BigDecimal c14b_inacive_forzen_dorm_reactivate_noa_hig) {
		this.c14b_inacive_forzen_dorm_reactivate_noa_hig = c14b_inacive_forzen_dorm_reactivate_noa_hig;
	}
	public BigDecimal getC11c_tot_dep_accts_amt_hig() {
		return c11c_tot_dep_accts_amt_hig;
	}
	public void setC11c_tot_dep_accts_amt_hig(BigDecimal c11c_tot_dep_accts_amt_hig) {
		this.c11c_tot_dep_accts_amt_hig = c11c_tot_dep_accts_amt_hig;
	}
	public BigDecimal getC12c_inactive_dorm_accts_amt_hig() {
		return c12c_inactive_dorm_accts_amt_hig;
	}
	public void setC12c_inactive_dorm_accts_amt_hig(BigDecimal c12c_inactive_dorm_accts_amt_hig) {
		this.c12c_inactive_dorm_accts_amt_hig = c12c_inactive_dorm_accts_amt_hig;
	}
	public BigDecimal getC13c_frozen_accts_amt_hig() {
		return c13c_frozen_accts_amt_hig;
	}
	public void setC13c_frozen_accts_amt_hig(BigDecimal c13c_frozen_accts_amt_hig) {
		this.c13c_frozen_accts_amt_hig = c13c_frozen_accts_amt_hig;
	}
	public BigDecimal getC14c_inacive_forzen_dorm_reactivate_amt_hig() {
		return c14c_inacive_forzen_dorm_reactivate_amt_hig;
	}
	public void setC14c_inacive_forzen_dorm_reactivate_amt_hig(BigDecimal c14c_inacive_forzen_dorm_reactivate_amt_hig) {
		this.c14c_inacive_forzen_dorm_reactivate_amt_hig = c14c_inacive_forzen_dorm_reactivate_amt_hig;
	}
	public BigDecimal getC11d_tot_dep_accts_noa_med() {
		return c11d_tot_dep_accts_noa_med;
	}
	public void setC11d_tot_dep_accts_noa_med(BigDecimal c11d_tot_dep_accts_noa_med) {
		this.c11d_tot_dep_accts_noa_med = c11d_tot_dep_accts_noa_med;
	}
	public BigDecimal getC12d_inactive_dorm_accts_noa_med() {
		return c12d_inactive_dorm_accts_noa_med;
	}
	public void setC12d_inactive_dorm_accts_noa_med(BigDecimal c12d_inactive_dorm_accts_noa_med) {
		this.c12d_inactive_dorm_accts_noa_med = c12d_inactive_dorm_accts_noa_med;
	}
	public BigDecimal getC13d_frozen_accts_noa_med() {
		return c13d_frozen_accts_noa_med;
	}
	public void setC13d_frozen_accts_noa_med(BigDecimal c13d_frozen_accts_noa_med) {
		this.c13d_frozen_accts_noa_med = c13d_frozen_accts_noa_med;
	}
	public BigDecimal getC14d_inacive_forzen_dorm_reactivate_noa_med() {
		return c14d_inacive_forzen_dorm_reactivate_noa_med;
	}
	public void setC14d_inacive_forzen_dorm_reactivate_noa_med(BigDecimal c14d_inacive_forzen_dorm_reactivate_noa_med) {
		this.c14d_inacive_forzen_dorm_reactivate_noa_med = c14d_inacive_forzen_dorm_reactivate_noa_med;
	}
	public BigDecimal getC11e_tot_dep_accts_amt_med() {
		return c11e_tot_dep_accts_amt_med;
	}
	public void setC11e_tot_dep_accts_amt_med(BigDecimal c11e_tot_dep_accts_amt_med) {
		this.c11e_tot_dep_accts_amt_med = c11e_tot_dep_accts_amt_med;
	}
	public BigDecimal getC12e_inactive_dorm_accts_amt_med() {
		return c12e_inactive_dorm_accts_amt_med;
	}
	public void setC12e_inactive_dorm_accts_amt_med(BigDecimal c12e_inactive_dorm_accts_amt_med) {
		this.c12e_inactive_dorm_accts_amt_med = c12e_inactive_dorm_accts_amt_med;
	}
	public BigDecimal getC13e_frozen_accts_amt_med() {
		return c13e_frozen_accts_amt_med;
	}
	public void setC13e_frozen_accts_amt_med(BigDecimal c13e_frozen_accts_amt_med) {
		this.c13e_frozen_accts_amt_med = c13e_frozen_accts_amt_med;
	}
	public BigDecimal getC14e_inacive_forzen_dorm_reactivate_amt_med() {
		return c14e_inacive_forzen_dorm_reactivate_amt_med;
	}
	public void setC14e_inacive_forzen_dorm_reactivate_amt_med(BigDecimal c14e_inacive_forzen_dorm_reactivate_amt_med) {
		this.c14e_inacive_forzen_dorm_reactivate_amt_med = c14e_inacive_forzen_dorm_reactivate_amt_med;
	}
	public BigDecimal getC11f_tot_dep_accts_noa_low() {
		return c11f_tot_dep_accts_noa_low;
	}
	public void setC11f_tot_dep_accts_noa_low(BigDecimal c11f_tot_dep_accts_noa_low) {
		this.c11f_tot_dep_accts_noa_low = c11f_tot_dep_accts_noa_low;
	}
	public BigDecimal getC12f_inactive_dorm_accts_noa_low() {
		return c12f_inactive_dorm_accts_noa_low;
	}
	public void setC12f_inactive_dorm_accts_noa_low(BigDecimal c12f_inactive_dorm_accts_noa_low) {
		this.c12f_inactive_dorm_accts_noa_low = c12f_inactive_dorm_accts_noa_low;
	}
	public BigDecimal getC13f_frozen_accts_noa_low() {
		return c13f_frozen_accts_noa_low;
	}
	public void setC13f_frozen_accts_noa_low(BigDecimal c13f_frozen_accts_noa_low) {
		this.c13f_frozen_accts_noa_low = c13f_frozen_accts_noa_low;
	}
	public BigDecimal getC14f_inacive_forzen_dorm_reactivate_noa_low() {
		return c14f_inacive_forzen_dorm_reactivate_noa_low;
	}
	public void setC14f_inacive_forzen_dorm_reactivate_noa_low(BigDecimal c14f_inacive_forzen_dorm_reactivate_noa_low) {
		this.c14f_inacive_forzen_dorm_reactivate_noa_low = c14f_inacive_forzen_dorm_reactivate_noa_low;
	}
	public BigDecimal getC11g_tot_dep_accts_amt_low() {
		return c11g_tot_dep_accts_amt_low;
	}
	public void setC11g_tot_dep_accts_amt_low(BigDecimal c11g_tot_dep_accts_amt_low) {
		this.c11g_tot_dep_accts_amt_low = c11g_tot_dep_accts_amt_low;
	}
	public BigDecimal getC12g_inactive_dorm_accts_amt_low() {
		return c12g_inactive_dorm_accts_amt_low;
	}
	public void setC12g_inactive_dorm_accts_amt_low(BigDecimal c12g_inactive_dorm_accts_amt_low) {
		this.c12g_inactive_dorm_accts_amt_low = c12g_inactive_dorm_accts_amt_low;
	}
	public BigDecimal getC13g_frozen_accts_amt_low() {
		return c13g_frozen_accts_amt_low;
	}
	public void setC13g_frozen_accts_amt_low(BigDecimal c13g_frozen_accts_amt_low) {
		this.c13g_frozen_accts_amt_low = c13g_frozen_accts_amt_low;
	}
	public BigDecimal getC14g_inacive_forzen_dorm_reactivatg_amt_low() {
		return c14g_inacive_forzen_dorm_reactivatg_amt_low;
	}
	public void setC14g_inacive_forzen_dorm_reactivatg_amt_low(BigDecimal c14g_inacive_forzen_dorm_reactivatg_amt_low) {
		this.c14g_inacive_forzen_dorm_reactivatg_amt_low = c14g_inacive_forzen_dorm_reactivatg_amt_low;
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
	public Character getNil_report_flg() {
		return nil_report_flg;
	}
	public void setNil_report_flg(Character nil_report_flg) {
		this.nil_report_flg = nil_report_flg;
	}
	public Character getArch_flg() {
		return arch_flg;
	}
	public void setArch_flg(Character arch_flg) {
		this.arch_flg = arch_flg;
	}
	public T26Report(String d11a_tot_dep_accts, String d12a_inactive_dorm_accts, String d13a_frozen_accts,
			String d14a_inacive_forzen_dorm_reactivate, BigDecimal c11b_tot_dep_accts_noa_hig,
			BigDecimal c12b_inactive_dorm_accts_noa_hig, BigDecimal c13b_frozen_accts_noa_hig,
			BigDecimal c14b_inacive_forzen_dorm_reactivate_noa_hig, BigDecimal c11c_tot_dep_accts_amt_hig,
			BigDecimal c12c_inactive_dorm_accts_amt_hig, BigDecimal c13c_frozen_accts_amt_hig,
			BigDecimal c14c_inacive_forzen_dorm_reactivate_amt_hig, BigDecimal c11d_tot_dep_accts_noa_med,
			BigDecimal c12d_inactive_dorm_accts_noa_med, BigDecimal c13d_frozen_accts_noa_med,
			BigDecimal c14d_inacive_forzen_dorm_reactivate_noa_med, BigDecimal c11e_tot_dep_accts_amt_med,
			BigDecimal c12e_inactive_dorm_accts_amt_med, BigDecimal c13e_frozen_accts_amt_med,
			BigDecimal c14e_inacive_forzen_dorm_reactivate_amt_med, BigDecimal c11f_tot_dep_accts_noa_low,
			BigDecimal c12f_inactive_dorm_accts_noa_low, BigDecimal c13f_frozen_accts_noa_low,
			BigDecimal c14f_inacive_forzen_dorm_reactivate_noa_low, BigDecimal c11g_tot_dep_accts_amt_low,
			BigDecimal c12g_inactive_dorm_accts_amt_low, BigDecimal c13g_frozen_accts_amt_low,
			BigDecimal c14g_inacive_forzen_dorm_reactivatg_amt_low, String report_code, String report_name,
			Date report_date, Date report_due_date, Date rep_submit_date, Date rep_period_from, Date rep_period_to,
			String rep_freq, Character nil_report_flg, Character arch_flg) {
		super();
		this.d11a_tot_dep_accts = d11a_tot_dep_accts;
		this.d12a_inactive_dorm_accts = d12a_inactive_dorm_accts;
		this.d13a_frozen_accts = d13a_frozen_accts;
		this.d14a_inacive_forzen_dorm_reactivate = d14a_inacive_forzen_dorm_reactivate;
		this.c11b_tot_dep_accts_noa_hig = c11b_tot_dep_accts_noa_hig;
		this.c12b_inactive_dorm_accts_noa_hig = c12b_inactive_dorm_accts_noa_hig;
		this.c13b_frozen_accts_noa_hig = c13b_frozen_accts_noa_hig;
		this.c14b_inacive_forzen_dorm_reactivate_noa_hig = c14b_inacive_forzen_dorm_reactivate_noa_hig;
		this.c11c_tot_dep_accts_amt_hig = c11c_tot_dep_accts_amt_hig;
		this.c12c_inactive_dorm_accts_amt_hig = c12c_inactive_dorm_accts_amt_hig;
		this.c13c_frozen_accts_amt_hig = c13c_frozen_accts_amt_hig;
		this.c14c_inacive_forzen_dorm_reactivate_amt_hig = c14c_inacive_forzen_dorm_reactivate_amt_hig;
		this.c11d_tot_dep_accts_noa_med = c11d_tot_dep_accts_noa_med;
		this.c12d_inactive_dorm_accts_noa_med = c12d_inactive_dorm_accts_noa_med;
		this.c13d_frozen_accts_noa_med = c13d_frozen_accts_noa_med;
		this.c14d_inacive_forzen_dorm_reactivate_noa_med = c14d_inacive_forzen_dorm_reactivate_noa_med;
		this.c11e_tot_dep_accts_amt_med = c11e_tot_dep_accts_amt_med;
		this.c12e_inactive_dorm_accts_amt_med = c12e_inactive_dorm_accts_amt_med;
		this.c13e_frozen_accts_amt_med = c13e_frozen_accts_amt_med;
		this.c14e_inacive_forzen_dorm_reactivate_amt_med = c14e_inacive_forzen_dorm_reactivate_amt_med;
		this.c11f_tot_dep_accts_noa_low = c11f_tot_dep_accts_noa_low;
		this.c12f_inactive_dorm_accts_noa_low = c12f_inactive_dorm_accts_noa_low;
		this.c13f_frozen_accts_noa_low = c13f_frozen_accts_noa_low;
		this.c14f_inacive_forzen_dorm_reactivate_noa_low = c14f_inacive_forzen_dorm_reactivate_noa_low;
		this.c11g_tot_dep_accts_amt_low = c11g_tot_dep_accts_amt_low;
		this.c12g_inactive_dorm_accts_amt_low = c12g_inactive_dorm_accts_amt_low;
		this.c13g_frozen_accts_amt_low = c13g_frozen_accts_amt_low;
		this.c14g_inacive_forzen_dorm_reactivatg_amt_low = c14g_inacive_forzen_dorm_reactivatg_amt_low;
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
	}
	public T26Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
