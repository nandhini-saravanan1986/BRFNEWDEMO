package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="REPORT_MASTER_TB")
public class ReportsMaster {
	
	@EmbeddedId
	private ReportMasterId reportMasterId;
	private String parent_report_id;
	private String report_name;
	private String report_frequency;
	private Date current_report_date;
	private Date next_report_date;
	private String report_function;
	private String report_dtl_function;
	private String report_table_name;
	private String xbrl_sp;
	private String generated_flg;
	private String report_pop_sp;
	private String report_mast_table;
	private String report_hist_table;
	private String report_mod_table;
	private String file_name;
	public ReportMasterId getReportMasterId() {
		return reportMasterId;
	}
	public void setReportMasterIdl(ReportMasterId reportMasterId) {
		this.reportMasterId = reportMasterId;
	}
	public String getParent_report_id() {
		return parent_report_id;
	}
	public void setParent_report_id(String parent_report_id) {
		this.parent_report_id = parent_report_id;
	}
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}
	public String getReport_frequency() {
		return report_frequency;
	}
	public void setReport_frequency(String report_frequency) {
		this.report_frequency = report_frequency;
	}
	public Date getCurrent_report_date() {
		return current_report_date;
	}
	public void setCurrent_report_date(Date current_report_date) {
		this.current_report_date = current_report_date;
	}
	public Date getNext_report_date() {
		return next_report_date;
	}
	public void setNext_report_date(Date next_report_date) {
		this.next_report_date = next_report_date;
	}
	public String getReport_function() {
		return report_function;
	}
	public void setReport_function(String report_function) {
		this.report_function = report_function;
	}
	public String getReport_dtl_function() {
		return report_dtl_function;
	}
	public void setReport_dtl_function(String report_dtl_function) {
		this.report_dtl_function = report_dtl_function;
	}
	public String getReport_table_name() {
		return report_table_name;
	}
	public void setReport_table_name(String report_table_name) {
		this.report_table_name = report_table_name;
	}
	public String getXbrl_sp() {
		return xbrl_sp;
	}
	public void setXbrl_sp(String xbrl_sp) {
		this.xbrl_sp = xbrl_sp;
	}
	public String getGenerated_flg() {
		return generated_flg;
	}
	public void setGenerated_flg(String generated_flg) {
		this.generated_flg = generated_flg;
	}
	public String getReport_pop_sp() {
		return report_pop_sp;
	}
	public void setReport_pop_sp(String report_pop_sp) {
		this.report_pop_sp = report_pop_sp;
	}
	public String getReport_mast_table() {
		return report_mast_table;
	}
	public void setReport_mast_table(String report_mast_table) {
		this.report_mast_table = report_mast_table;
	}
	public String getReport_hist_table() {
		return report_hist_table;
	}
	public void setReport_hist_table(String report_hist_table) {
		this.report_hist_table = report_hist_table;
	}
	public String getReport_mod_table() {
		return report_mod_table;
	}
	public void setReport_mod_table(String report_mod_table) {
		this.report_mod_table = report_mod_table;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	
}
