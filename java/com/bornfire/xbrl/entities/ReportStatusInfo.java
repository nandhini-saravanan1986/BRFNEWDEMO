package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="report_status_info_tb")
public class ReportStatusInfo {
	
	@EmbeddedId
	ReportStatusInfoId reportStatusInfoId;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date from_date;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date to_date;
	String report_status;
	@DateTimeFormat(pattern="dd-MM-yyyy hh:mm:ss")
	Date generate_time;
	String generate_user;
	String remarks;
	
	public ReportStatusInfoId getReportStatusInfoId() {
		return reportStatusInfoId;
	}
	public void setReportStatusInfoId(ReportStatusInfoId reportStatusInfoId) {
		this.reportStatusInfoId = reportStatusInfoId;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}
	public Date getGenerate_time() {
		return generate_time;
	}
	public void setGenerate_time(Date generate_time) {
		this.generate_time = generate_time;
	}
	public String getGenerate_user() {
		return generate_user;
	}
	public void setGenerate_user(String generate_user) {
		this.generate_user = generate_user;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public ReportStatusInfo(ReportStatusInfoId reportStatusInfoId, Date from_date, Date to_date, String report_status,
			Date generate_time, String generate_user, String remarks) {
		super();
		this.reportStatusInfoId = reportStatusInfoId;
		this.from_date = from_date;
		this.to_date = to_date;
		this.report_status = report_status;
		this.generate_time = generate_time;
		this.generate_user = generate_user;
		this.remarks = remarks;
	}
	public ReportStatusInfo() {
		
	}
	

}
