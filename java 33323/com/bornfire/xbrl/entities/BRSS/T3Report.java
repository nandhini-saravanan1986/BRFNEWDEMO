package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T3_CFT_CUSTOMER_RATING_RPT_TB")
public class T3Report {


	private String	customer_rating_1a;
	private String	internal_rating_face_to_face_1b;
	private String	internal_rating_non_face_to_face_1c;
	private String	customer_rating_1d_1;
	private String	previous_internal_rating_grade_1e;
	private String	previous_internal_rating_scale_legend_1f;
	private String	customer_rating_2a;
	private String	internal_rating_face_to_face_2b;
	private String	internal_rating_non_face_to_face_2c;
	private String	customer_rating_2d_1;
	private String	previous_internal_rating_grade_2e;
	private String	previous_internal_rating_scale_legend_2f;
	private String	customer_rating_3a;
	private String	internal_rating_face_to_face_3b;
	private String	internal_rating_non_face_to_face_3c;
	private String	customer_rating_3d_1;
	private String	previous_internal_rating_grade_3e;
	private String	previous_internal_rating_scale_legend_3f;
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
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	VERIFY_FLG;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_DATE;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_DATE;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_DATE;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;

	
	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}
	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}
	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}
	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
	}
	public String getVERIFY_FLG() {
		return VERIFY_FLG;
	}
	public void setVERIFY_FLG(String vERIFY_FLG) {
		VERIFY_FLG = vERIFY_FLG;
	}
	public Date getENTRY_DATE() {
		return ENTRY_DATE;
	}
	public void setENTRY_DATE(Date eNTRY_DATE) {
		ENTRY_DATE = eNTRY_DATE;
	}
	public Date getMODIFY_DATE() {
		return MODIFY_DATE;
	}
	public void setMODIFY_DATE(Date mODIFY_DATE) {
		MODIFY_DATE = mODIFY_DATE;
	}
	public Date getVERIFY_DATE() {
		return VERIFY_DATE;
	}
	public void setVERIFY_DATE(Date vERIFY_DATE) {
		VERIFY_DATE = vERIFY_DATE;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public String getCustomer_rating_1a() {
		return customer_rating_1a;
	}
	public void setCustomer_rating_1a(String customer_rating_1a) {
		this.customer_rating_1a = customer_rating_1a;
	}
	public String getInternal_rating_face_to_face_1b() {
		return internal_rating_face_to_face_1b;
	}
	public void setInternal_rating_face_to_face_1b(String internal_rating_face_to_face_1b) {
		this.internal_rating_face_to_face_1b = internal_rating_face_to_face_1b;
	}
	public String getInternal_rating_non_face_to_face_1c() {
		return internal_rating_non_face_to_face_1c;
	}
	public void setInternal_rating_non_face_to_face_1c(String internal_rating_non_face_to_face_1c) {
		this.internal_rating_non_face_to_face_1c = internal_rating_non_face_to_face_1c;
	}
	public String getCustomer_rating_1d_1() {
		return customer_rating_1d_1;
	}
	public void setCustomer_rating_1d_1(String customer_rating_1d_1) {
		this.customer_rating_1d_1 = customer_rating_1d_1;
	}
	public String getPrevious_internal_rating_grade_1e() {
		return previous_internal_rating_grade_1e;
	}
	public void setPrevious_internal_rating_grade_1e(String previous_internal_rating_grade_1e) {
		this.previous_internal_rating_grade_1e = previous_internal_rating_grade_1e;
	}
	public String getPrevious_internal_rating_scale_legend_1f() {
		return previous_internal_rating_scale_legend_1f;
	}
	public void setPrevious_internal_rating_scale_legend_1f(String previous_internal_rating_scale_legend_1f) {
		this.previous_internal_rating_scale_legend_1f = previous_internal_rating_scale_legend_1f;
	}
	public String getCustomer_rating_2a() {
		return customer_rating_2a;
	}
	public void setCustomer_rating_2a(String customer_rating_2a) {
		this.customer_rating_2a = customer_rating_2a;
	}
	public String getInternal_rating_face_to_face_2b() {
		return internal_rating_face_to_face_2b;
	}
	public void setInternal_rating_face_to_face_2b(String internal_rating_face_to_face_2b) {
		this.internal_rating_face_to_face_2b = internal_rating_face_to_face_2b;
	}
	public String getInternal_rating_non_face_to_face_2c() {
		return internal_rating_non_face_to_face_2c;
	}
	public void setInternal_rating_non_face_to_face_2c(String internal_rating_non_face_to_face_2c) {
		this.internal_rating_non_face_to_face_2c = internal_rating_non_face_to_face_2c;
	}
	public String getCustomer_rating_2d_1() {
		return customer_rating_2d_1;
	}
	public void setCustomer_rating_2d_1(String customer_rating_2d_1) {
		this.customer_rating_2d_1 = customer_rating_2d_1;
	}
	public String getPrevious_internal_rating_grade_2e() {
		return previous_internal_rating_grade_2e;
	}
	public void setPrevious_internal_rating_grade_2e(String previous_internal_rating_grade_2e) {
		this.previous_internal_rating_grade_2e = previous_internal_rating_grade_2e;
	}
	public String getPrevious_internal_rating_scale_legend_2f() {
		return previous_internal_rating_scale_legend_2f;
	}
	public void setPrevious_internal_rating_scale_legend_2f(String previous_internal_rating_scale_legend_2f) {
		this.previous_internal_rating_scale_legend_2f = previous_internal_rating_scale_legend_2f;
	}
	public String getCustomer_rating_3a() {
		return customer_rating_3a;
	}
	public void setCustomer_rating_3a(String customer_rating_3a) {
		this.customer_rating_3a = customer_rating_3a;
	}
	public String getInternal_rating_face_to_face_3b() {
		return internal_rating_face_to_face_3b;
	}
	public void setInternal_rating_face_to_face_3b(String internal_rating_face_to_face_3b) {
		this.internal_rating_face_to_face_3b = internal_rating_face_to_face_3b;
	}
	public String getInternal_rating_non_face_to_face_3c() {
		return internal_rating_non_face_to_face_3c;
	}
	public void setInternal_rating_non_face_to_face_3c(String internal_rating_non_face_to_face_3c) {
		this.internal_rating_non_face_to_face_3c = internal_rating_non_face_to_face_3c;
	}
	public String getCustomer_rating_3d_1() {
		return customer_rating_3d_1;
	}
	public void setCustomer_rating_3d_1(String customer_rating_3d_1) {
		this.customer_rating_3d_1 = customer_rating_3d_1;
	}
	public String getPrevious_internal_rating_grade_3e() {
		return previous_internal_rating_grade_3e;
	}
	public void setPrevious_internal_rating_grade_3e(String previous_internal_rating_grade_3e) {
		this.previous_internal_rating_grade_3e = previous_internal_rating_grade_3e;
	}
	public String getPrevious_internal_rating_scale_legend_3f() {
		return previous_internal_rating_scale_legend_3f;
	}
	public void setPrevious_internal_rating_scale_legend_3f(String previous_internal_rating_scale_legend_3f) {
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
	public T3Report(String customer_rating_1a, String internal_rating_face_to_face_1b,
			String internal_rating_non_face_to_face_1c, String customer_rating_1d_1,
			String previous_internal_rating_grade_1e, String previous_internal_rating_scale_legend_1f,
			String customer_rating_2a, String internal_rating_face_to_face_2b,
			String internal_rating_non_face_to_face_2c, String customer_rating_2d_1,
			String previous_internal_rating_grade_2e, String previous_internal_rating_scale_legend_2f,
			String customer_rating_3a, String internal_rating_face_to_face_3b,
			String internal_rating_non_face_to_face_3c, String customer_rating_3d_1,
			String previous_internal_rating_grade_3e, String previous_internal_rating_scale_legend_3f,
			Date report_submit_date, Date report_generate_date, Date report_due_date, Character nil_report_flg,
			Date report_from_date, Date report_to_date, String frequency, Date report_date, String report_name,
			String report_code, String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, Date eNTRY_DATE,
			Date mODIFY_DATE, Date vERIFY_DATE, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER) {
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
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		VERIFY_FLG = vERIFY_FLG;
		ENTRY_DATE = eNTRY_DATE;
		MODIFY_DATE = mODIFY_DATE;
		VERIFY_DATE = vERIFY_DATE;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
	}
	public T3Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
