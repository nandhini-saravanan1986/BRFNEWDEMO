package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "T2_CFT_CUSTOMER_RATING_RPT_TB")
public class T2ReportMaster {

	
	private String	customer_rating_1a;
	private BigDecimal	internal_rating_face_to_face_1b;
	private BigDecimal	internal_rating_non_face_to_face_1c;
	private String	customer_rating_1d_1;
	private BigDecimal	previous_internal_rating_grade_1e;
	private BigDecimal	previous_internal_rating_scale_legend_1f;
	private String	customer_rating_2a;
	private BigDecimal	internal_rating_face_to_face_2b;
	private BigDecimal	internal_rating_non_face_to_face_2c;
	private String	customer_rating_2d_1;
	private BigDecimal	previous_internal_rating_grade_2e;
	private BigDecimal	previous_internal_rating_scale_legend_2f;
	private String	customer_rating_3a;
	private BigDecimal	internal_rating_face_to_face_3b;
	private BigDecimal	internal_rating_non_face_to_face_3c;
	private String	customer_rating_3d_1;
	private BigDecimal	previous_internal_rating_grade_3e;
	private BigDecimal	previous_internal_rating_scale_legend_3f;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_submit_date;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_generate_date;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_due_date;
	private Character	nil_report_flg;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_from_date;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_to_date;
	private String	frequency;
	@Id
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date;
	private String	report_name;
	private String	report_code;
	public String getCustomer_rating_1a() {
		return customer_rating_1a;
	}
	public void setCustomer_rating_1a(String customer_rating_1a) {
		this.customer_rating_1a = customer_rating_1a;
	}
	public BigDecimal getInternal_rating_face_to_face_1b() {
		return internal_rating_face_to_face_1b;
	}
	public void setInternal_rating_face_to_face_1b(BigDecimal internal_rating_face_to_face_1b) {
		this.internal_rating_face_to_face_1b = internal_rating_face_to_face_1b;
	}
	public BigDecimal getInternal_rating_non_face_to_face_1c() {
		return internal_rating_non_face_to_face_1c;
	}
	public void setInternal_rating_non_face_to_face_1c(BigDecimal internal_rating_non_face_to_face_1c) {
		this.internal_rating_non_face_to_face_1c = internal_rating_non_face_to_face_1c;
	}
	public String getCustomer_rating_1d_1() {
		return customer_rating_1d_1;
	}
	public void setCustomer_rating_1d_1(String customer_rating_1d_1) {
		this.customer_rating_1d_1 = customer_rating_1d_1;
	}
	public BigDecimal getPrevious_internal_rating_grade_1e() {
		return previous_internal_rating_grade_1e;
	}
	public void setPrevious_internal_rating_grade_1e(BigDecimal previous_internal_rating_grade_1e) {
		this.previous_internal_rating_grade_1e = previous_internal_rating_grade_1e;
	}
	public BigDecimal getPrevious_internal_rating_scale_legend_1f() {
		return previous_internal_rating_scale_legend_1f;
	}
	public void setPrevious_internal_rating_scale_legend_1f(BigDecimal previous_internal_rating_scale_legend_1f) {
		this.previous_internal_rating_scale_legend_1f = previous_internal_rating_scale_legend_1f;
	}
	public String getCustomer_rating_2a() {
		return customer_rating_2a;
	}
	public void setCustomer_rating_2a(String customer_rating_2a) {
		this.customer_rating_2a = customer_rating_2a;
	}
	public BigDecimal getInternal_rating_face_to_face_2b() {
		return internal_rating_face_to_face_2b;
	}
	public void setInternal_rating_face_to_face_2b(BigDecimal internal_rating_face_to_face_2b) {
		this.internal_rating_face_to_face_2b = internal_rating_face_to_face_2b;
	}
	public BigDecimal getInternal_rating_non_face_to_face_2c() {
		return internal_rating_non_face_to_face_2c;
	}
	public void setInternal_rating_non_face_to_face_2c(BigDecimal internal_rating_non_face_to_face_2c) {
		this.internal_rating_non_face_to_face_2c = internal_rating_non_face_to_face_2c;
	}
	public String getCustomer_rating_2d_1() {
		return customer_rating_2d_1;
	}
	public void setCustomer_rating_2d_1(String customer_rating_2d_1) {
		this.customer_rating_2d_1 = customer_rating_2d_1;
	}
	public BigDecimal getPrevious_internal_rating_grade_2e() {
		return previous_internal_rating_grade_2e;
	}
	public void setPrevious_internal_rating_grade_2e(BigDecimal previous_internal_rating_grade_2e) {
		this.previous_internal_rating_grade_2e = previous_internal_rating_grade_2e;
	}
	public BigDecimal getPrevious_internal_rating_scale_legend_2f() {
		return previous_internal_rating_scale_legend_2f;
	}
	public void setPrevious_internal_rating_scale_legend_2f(BigDecimal previous_internal_rating_scale_legend_2f) {
		this.previous_internal_rating_scale_legend_2f = previous_internal_rating_scale_legend_2f;
	}
	public String getCustomer_rating_3a() {
		return customer_rating_3a;
	}
	public void setCustomer_rating_3a(String customer_rating_3a) {
		this.customer_rating_3a = customer_rating_3a;
	}
	public BigDecimal getInternal_rating_face_to_face_3b() {
		return internal_rating_face_to_face_3b;
	}
	public void setInternal_rating_face_to_face_3b(BigDecimal internal_rating_face_to_face_3b) {
		this.internal_rating_face_to_face_3b = internal_rating_face_to_face_3b;
	}
	public BigDecimal getInternal_rating_non_face_to_face_3c() {
		return internal_rating_non_face_to_face_3c;
	}
	public void setInternal_rating_non_face_to_face_3c(BigDecimal internal_rating_non_face_to_face_3c) {
		this.internal_rating_non_face_to_face_3c = internal_rating_non_face_to_face_3c;
	}
	public String getCustomer_rating_3d_1() {
		return customer_rating_3d_1;
	}
	public void setCustomer_rating_3d_1(String customer_rating_3d_1) {
		this.customer_rating_3d_1 = customer_rating_3d_1;
	}
	public BigDecimal getPrevious_internal_rating_grade_3e() {
		return previous_internal_rating_grade_3e;
	}
	public void setPrevious_internal_rating_grade_3e(BigDecimal previous_internal_rating_grade_3e) {
		this.previous_internal_rating_grade_3e = previous_internal_rating_grade_3e;
	}
	public BigDecimal getPrevious_internal_rating_scale_legend_3f() {
		return previous_internal_rating_scale_legend_3f;
	}
	public void setPrevious_internal_rating_scale_legend_3f(BigDecimal previous_internal_rating_scale_legend_3f) {
		this.previous_internal_rating_scale_legend_3f = previous_internal_rating_scale_legend_3f;
	}
	public Date getReport_submit_date() {
		return report_submit_date;
	}
	public void setReport_submit_date(Date report_submit_date) {
		this.report_submit_date = report_submit_date;
	}
	public Date getReport_generate_date() {
		return report_generate_date;
	}
	public void setReport_generate_date(Date report_generate_date) {
		this.report_generate_date = report_generate_date;
	}
	public Date getReport_due_date() {
		return report_due_date;
	}
	public void setReport_due_date(Date report_due_date) {
		this.report_due_date = report_due_date;
	}
	public Character getNil_report_flg() {
		return nil_report_flg;
	}
	public void setNil_report_flg(Character nil_report_flg) {
		this.nil_report_flg = nil_report_flg;
	}
	public Date getReport_from_date() {
		return report_from_date;
	}
	public void setReport_from_date(Date report_from_date) {
		this.report_from_date = report_from_date;
	}
	public Date getReport_to_date() {
		return report_to_date;
	}
	public void setReport_to_date(Date report_to_date) {
		this.report_to_date = report_to_date;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
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
	public String getReport_code() {
		return report_code;
	}
	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}
	public T2ReportMaster(String customer_rating_1a, BigDecimal internal_rating_face_to_face_1b,
			BigDecimal internal_rating_non_face_to_face_1c, String customer_rating_1d_1,
			BigDecimal previous_internal_rating_grade_1e, BigDecimal previous_internal_rating_scale_legend_1f,
			String customer_rating_2a, BigDecimal internal_rating_face_to_face_2b,
			BigDecimal internal_rating_non_face_to_face_2c, String customer_rating_2d_1,
			BigDecimal previous_internal_rating_grade_2e, BigDecimal previous_internal_rating_scale_legend_2f,
			String customer_rating_3a, BigDecimal internal_rating_face_to_face_3b,
			BigDecimal internal_rating_non_face_to_face_3c, String customer_rating_3d_1,
			BigDecimal previous_internal_rating_grade_3e, BigDecimal previous_internal_rating_scale_legend_3f,
			Date report_submit_date, Date report_generate_date, Date report_due_date, Character nil_report_flg,
			Date report_from_date, Date report_to_date, String frequency, Date report_date, String report_name,
			String report_code) {
		super();
		this.customer_rating_1a = customer_rating_1a;
		this.internal_rating_face_to_face_1b = internal_rating_face_to_face_1b;
		this.internal_rating_non_face_to_face_1c = internal_rating_non_face_to_face_1c;
		this.customer_rating_1d_1 = customer_rating_1d_1;
		this.previous_internal_rating_grade_1e = previous_internal_rating_grade_1e;
		this.previous_internal_rating_scale_legend_1f = previous_internal_rating_scale_legend_1f;
		this.customer_rating_2a = customer_rating_2a;
		this.internal_rating_face_to_face_2b = internal_rating_face_to_face_2b;
		this.internal_rating_non_face_to_face_2c = internal_rating_non_face_to_face_2c;
		this.customer_rating_2d_1 = customer_rating_2d_1;
		this.previous_internal_rating_grade_2e = previous_internal_rating_grade_2e;
		this.previous_internal_rating_scale_legend_2f = previous_internal_rating_scale_legend_2f;
		this.customer_rating_3a = customer_rating_3a;
		this.internal_rating_face_to_face_3b = internal_rating_face_to_face_3b;
		this.internal_rating_non_face_to_face_3c = internal_rating_non_face_to_face_3c;
		this.customer_rating_3d_1 = customer_rating_3d_1;
		this.previous_internal_rating_grade_3e = previous_internal_rating_grade_3e;
		this.previous_internal_rating_scale_legend_3f = previous_internal_rating_scale_legend_3f;
		this.report_submit_date = report_submit_date;
		this.report_generate_date = report_generate_date;
		this.report_due_date = report_due_date;
		this.nil_report_flg = nil_report_flg;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.frequency = frequency;
		this.report_date = report_date;
		this.report_name = report_name;
		this.report_code = report_code;
	}
	public T2ReportMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
