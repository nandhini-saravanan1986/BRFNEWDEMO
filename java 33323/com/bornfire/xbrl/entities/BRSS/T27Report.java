package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T27_ABAND_FUND_ACCTS_TABLE")
public class T27Report {


	private String	d1a_aband_fund_accts;
	private String	d2a_aband_fund_accst_bom;
	private String	d3a_unclaimed_draft;
	private String	d4a_unclaimed_drafts_bom;
	private String	c1b_aband_fund_accts_num;
	private String	c2b_aband_fund_accts_bom_num;
	private String	c3b_unclaimed_drafts_num;
	private String	c4b_unclaimed_drats_bom_num;
	private String	c1c_aband_fund_accts_amt;
	private String	c2c_aband_fund_accts_bom_amt;
	private String	c3c_unclaimed_drafts_amt;
	private String	c4c_unclaimed_drats_bom_amt;
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
	public String getD1a_aband_fund_accts() {
		return d1a_aband_fund_accts;
	}
	public void setD1a_aband_fund_accts(String d1a_aband_fund_accts) {
		this.d1a_aband_fund_accts = d1a_aband_fund_accts;
	}
	public String getD2a_aband_fund_accst_bom() {
		return d2a_aband_fund_accst_bom;
	}
	public void setD2a_aband_fund_accst_bom(String d2a_aband_fund_accst_bom) {
		this.d2a_aband_fund_accst_bom = d2a_aband_fund_accst_bom;
	}
	public String getD3a_unclaimed_draft() {
		return d3a_unclaimed_draft;
	}
	public void setD3a_unclaimed_draft(String d3a_unclaimed_draft) {
		this.d3a_unclaimed_draft = d3a_unclaimed_draft;
	}
	public String getD4a_unclaimed_drafts_bom() {
		return d4a_unclaimed_drafts_bom;
	}
	public void setD4a_unclaimed_drafts_bom(String d4a_unclaimed_drafts_bom) {
		this.d4a_unclaimed_drafts_bom = d4a_unclaimed_drafts_bom;
	}
	public String getC1b_aband_fund_accts_num() {
		return c1b_aband_fund_accts_num;
	}
	public void setC1b_aband_fund_accts_num(String c1b_aband_fund_accts_num) {
		this.c1b_aband_fund_accts_num = c1b_aband_fund_accts_num;
	}
	public String getC2b_aband_fund_accts_bom_num() {
		return c2b_aband_fund_accts_bom_num;
	}
	public void setC2b_aband_fund_accts_bom_num(String c2b_aband_fund_accts_bom_num) {
		this.c2b_aband_fund_accts_bom_num = c2b_aband_fund_accts_bom_num;
	}
	public String getC3b_unclaimed_drafts_num() {
		return c3b_unclaimed_drafts_num;
	}
	public void setC3b_unclaimed_drafts_num(String c3b_unclaimed_drafts_num) {
		this.c3b_unclaimed_drafts_num = c3b_unclaimed_drafts_num;
	}
	public String getC4b_unclaimed_drats_bom_num() {
		return c4b_unclaimed_drats_bom_num;
	}
	public void setC4b_unclaimed_drats_bom_num(String c4b_unclaimed_drats_bom_num) {
		this.c4b_unclaimed_drats_bom_num = c4b_unclaimed_drats_bom_num;
	}
	public String getC1c_aband_fund_accts_amt() {
		return c1c_aband_fund_accts_amt;
	}
	public void setC1c_aband_fund_accts_amt(String c1c_aband_fund_accts_amt) {
		this.c1c_aband_fund_accts_amt = c1c_aband_fund_accts_amt;
	}
	public String getC2c_aband_fund_accts_bom_amt() {
		return c2c_aband_fund_accts_bom_amt;
	}
	public void setC2c_aband_fund_accts_bom_amt(String c2c_aband_fund_accts_bom_amt) {
		this.c2c_aband_fund_accts_bom_amt = c2c_aband_fund_accts_bom_amt;
	}
	public String getC3c_unclaimed_drafts_amt() {
		return c3c_unclaimed_drafts_amt;
	}
	public void setC3c_unclaimed_drafts_amt(String c3c_unclaimed_drafts_amt) {
		this.c3c_unclaimed_drafts_amt = c3c_unclaimed_drafts_amt;
	}
	public String getC4c_unclaimed_drats_bom_amt() {
		return c4c_unclaimed_drats_bom_amt;
	}
	public void setC4c_unclaimed_drats_bom_amt(String c4c_unclaimed_drats_bom_amt) {
		this.c4c_unclaimed_drats_bom_amt = c4c_unclaimed_drats_bom_amt;
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
	public T27Report(String d1a_aband_fund_accts, String d2a_aband_fund_accst_bom, String d3a_unclaimed_draft,
			String d4a_unclaimed_drafts_bom, String c1b_aband_fund_accts_num, String c2b_aband_fund_accts_bom_num,
			String c3b_unclaimed_drafts_num, String c4b_unclaimed_drats_bom_num, String c1c_aband_fund_accts_amt,
			String c2c_aband_fund_accts_bom_amt, String c3c_unclaimed_drafts_amt, String c4c_unclaimed_drats_bom_amt,
			String report_code, String report_name, Date report_date, Date report_due_date, Date rep_submit_date,
			Date rep_period_from, Date rep_period_to, String rep_freq, Character nil_report_flg, Character arch_flg) {
		super();
		this.d1a_aband_fund_accts = d1a_aband_fund_accts;
		this.d2a_aband_fund_accst_bom = d2a_aband_fund_accst_bom;
		this.d3a_unclaimed_draft = d3a_unclaimed_draft;
		this.d4a_unclaimed_drafts_bom = d4a_unclaimed_drafts_bom;
		this.c1b_aband_fund_accts_num = c1b_aband_fund_accts_num;
		this.c2b_aband_fund_accts_bom_num = c2b_aband_fund_accts_bom_num;
		this.c3b_unclaimed_drafts_num = c3b_unclaimed_drafts_num;
		this.c4b_unclaimed_drats_bom_num = c4b_unclaimed_drats_bom_num;
		this.c1c_aband_fund_accts_amt = c1c_aband_fund_accts_amt;
		this.c2c_aband_fund_accts_bom_amt = c2c_aband_fund_accts_bom_amt;
		this.c3c_unclaimed_drafts_amt = c3c_unclaimed_drafts_amt;
		this.c4c_unclaimed_drats_bom_amt = c4c_unclaimed_drats_bom_amt;
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
	public T27Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
