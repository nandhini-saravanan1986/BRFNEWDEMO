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
@Table(name = "T16B_IND_CASH_WITHDRAW_TABLE")
public class T16BReport {
	
	private String	d1a_cur_bmur100k;
	private String	d2a_cur_mur100_200k;
	private String	d3a_cur_mur200_350k;
	private String	d4a_cur_mur350_500k;
	private String	d5a_cur_mur500_750k;
	private String	d6a_cur_mur750_1000k;
	private String	d7a_cur_amur1000k;
	private String	d8a_cur_total;
	private BigDecimal	c1b_cur_bmur100k_nof_dep_tran_hig;
	private BigDecimal	c2b_cur_mur100_200k_nof_dep_tran_hig;
	private BigDecimal	c3b_cur_mur200_350k_nof_dep_tran_hig;
	private BigDecimal	c4b_cur_mur350_500k_nof_dep_tran_hig;
	private BigDecimal	c5b_cur_mur500_750k_nof_dep_tran_hig;
	private BigDecimal	c6b_cur_mur750_1000k_nof_dep_tran_hig;
	private BigDecimal	c7b_cur_amur1000k_nof_dep_tran_hig;
	private BigDecimal	c8b_cur_total_nof_dep_tran_hig;
	private BigDecimal	c1c_cur_bmur100k_to_val_tran_hig;
	private BigDecimal	c2c_cur_mur100_200k_to_val_tran_hig;
	private BigDecimal	c3c_cur_mur200_350k_to_val_tran_hig;
	private BigDecimal	c4c_cur_mur350_500k_to_val_tran_hig;
	private BigDecimal	c5c_cur_mur500_750k_to_val_tran_hig;
	private BigDecimal	c6c_cur_mur750_1000k_to_val_tran_hig;
	private BigDecimal	c7c_cur_amur1000k_to_val_tran_hig;
	private BigDecimal	c8c_cur_total_to_val_tran_hig;
	private BigDecimal	c1d_cur_bmur100k_nof_dep_tran_med;
	private BigDecimal	c2d_cur_mur100_200k_nof_dep_tran_med;
	private BigDecimal	c3d_cur_mur200_350k_nof_dep_tran_med;
	private BigDecimal	c4d_cur_mur350_500k_nof_dep_tran_med;
	private BigDecimal	c5d_cur_mur500_750k_nof_dep_tran_med;
	private BigDecimal	c6d_cur_mur750_1000k_nof_dep_tran_med;
	private BigDecimal	c7d_cur_amur1000k_nof_dep_tran_med;
	private BigDecimal	c8d_cur_total_nof_dep_tran_med;
	private BigDecimal	c1e_cur_bmur100k_to_val_tran_med;
	private BigDecimal	c2e_cur_mur100_200k_to_val_tran_med;
	private BigDecimal	c3e_cur_mur200_350k_to_val_tran_med;
	private BigDecimal	c4e_cur_mur350_500k_to_val_tran_med;
	private BigDecimal	c5e_cur_mur500_750k_to_val_tran_med;
	private BigDecimal	c6e_cur_mur750_1000k_to_val_tran_med;
	private BigDecimal	c7e_cur_amur1000k_to_val_tran_med;
	private BigDecimal	c8e_cur_total_to_val_tran_med;
	private BigDecimal	c1f_cur_bmur100k_nof_dep_tran_low;
	private BigDecimal	c2f_cur_mur100_200k_nof_dep_tran_low;
	private BigDecimal	c3f_cur_mur200_350k_nof_dep_tran_low;
	private BigDecimal	c4f_cur_mur350_500k_nof_dep_tran_low;
	private BigDecimal	c5f_cur_mur500_750k_nof_dep_tran_low;
	private BigDecimal	c6f_cur_mur750_1000k_nof_dep_tran_low;
	private BigDecimal	c7f_cur_amur1000k_nof_dep_tran_low;
	private BigDecimal	c8f_cur_total_nof_dep_tran_low;
	private BigDecimal	c1g_cur_bmur100k_to_val_tran_low;
	private BigDecimal	c2g_cur_mur100_200k_to_val_tran_low;
	private BigDecimal	c3g_cur_mur200_350k_to_val_tran_low;
	private BigDecimal	c4g_cur_mur350_500k_to_val_tran_low;
	private BigDecimal	c5g_cur_mur500_750k_to_val_tran_low;
	private BigDecimal	c6g_cur_mur750_1000k_to_val_tran_low;
	private BigDecimal	c7g_cur_amur1000k_to_val_tran_low;
	private BigDecimal	c8g_cur_total_to_val_tran_low;
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
	private Character	nil_report_flg;
	private Character	arch_flg;

	public T16BReport() {}

	public String getD1a_cur_bmur100k() {
		return d1a_cur_bmur100k;
	}

	public void setD1a_cur_bmur100k(String d1a_cur_bmur100k) {
		this.d1a_cur_bmur100k = d1a_cur_bmur100k;
	}

	public String getD2a_cur_mur100_200k() {
		return d2a_cur_mur100_200k;
	}

	public void setD2a_cur_mur100_200k(String d2a_cur_mur100_200k) {
		this.d2a_cur_mur100_200k = d2a_cur_mur100_200k;
	}

	public String getD3a_cur_mur200_350k() {
		return d3a_cur_mur200_350k;
	}

	public void setD3a_cur_mur200_350k(String d3a_cur_mur200_350k) {
		this.d3a_cur_mur200_350k = d3a_cur_mur200_350k;
	}

	public String getD4a_cur_mur350_500k() {
		return d4a_cur_mur350_500k;
	}

	public void setD4a_cur_mur350_500k(String d4a_cur_mur350_500k) {
		this.d4a_cur_mur350_500k = d4a_cur_mur350_500k;
	}

	public String getD5a_cur_mur500_750k() {
		return d5a_cur_mur500_750k;
	}

	public void setD5a_cur_mur500_750k(String d5a_cur_mur500_750k) {
		this.d5a_cur_mur500_750k = d5a_cur_mur500_750k;
	}

	public String getD6a_cur_mur750_1000k() {
		return d6a_cur_mur750_1000k;
	}

	public void setD6a_cur_mur750_1000k(String d6a_cur_mur750_1000k) {
		this.d6a_cur_mur750_1000k = d6a_cur_mur750_1000k;
	}

	public String getD7a_cur_amur1000k() {
		return d7a_cur_amur1000k;
	}

	public void setD7a_cur_amur1000k(String d7a_cur_amur1000k) {
		this.d7a_cur_amur1000k = d7a_cur_amur1000k;
	}

	public String getD8a_cur_total() {
		return d8a_cur_total;
	}

	public void setD8a_cur_total(String d8a_cur_total) {
		this.d8a_cur_total = d8a_cur_total;
	}

	public BigDecimal getC1b_cur_bmur100k_nof_dep_tran_hig() {
		return c1b_cur_bmur100k_nof_dep_tran_hig;
	}

	public void setC1b_cur_bmur100k_nof_dep_tran_hig(BigDecimal c1b_cur_bmur100k_nof_dep_tran_hig) {
		this.c1b_cur_bmur100k_nof_dep_tran_hig = c1b_cur_bmur100k_nof_dep_tran_hig;
	}

	public BigDecimal getC2b_cur_mur100_200k_nof_dep_tran_hig() {
		return c2b_cur_mur100_200k_nof_dep_tran_hig;
	}

	public void setC2b_cur_mur100_200k_nof_dep_tran_hig(BigDecimal c2b_cur_mur100_200k_nof_dep_tran_hig) {
		this.c2b_cur_mur100_200k_nof_dep_tran_hig = c2b_cur_mur100_200k_nof_dep_tran_hig;
	}

	public BigDecimal getC3b_cur_mur200_350k_nof_dep_tran_hig() {
		return c3b_cur_mur200_350k_nof_dep_tran_hig;
	}

	public void setC3b_cur_mur200_350k_nof_dep_tran_hig(BigDecimal c3b_cur_mur200_350k_nof_dep_tran_hig) {
		this.c3b_cur_mur200_350k_nof_dep_tran_hig = c3b_cur_mur200_350k_nof_dep_tran_hig;
	}

	public BigDecimal getC4b_cur_mur350_500k_nof_dep_tran_hig() {
		return c4b_cur_mur350_500k_nof_dep_tran_hig;
	}

	public void setC4b_cur_mur350_500k_nof_dep_tran_hig(BigDecimal c4b_cur_mur350_500k_nof_dep_tran_hig) {
		this.c4b_cur_mur350_500k_nof_dep_tran_hig = c4b_cur_mur350_500k_nof_dep_tran_hig;
	}

	public BigDecimal getC5b_cur_mur500_750k_nof_dep_tran_hig() {
		return c5b_cur_mur500_750k_nof_dep_tran_hig;
	}

	public void setC5b_cur_mur500_750k_nof_dep_tran_hig(BigDecimal c5b_cur_mur500_750k_nof_dep_tran_hig) {
		this.c5b_cur_mur500_750k_nof_dep_tran_hig = c5b_cur_mur500_750k_nof_dep_tran_hig;
	}

	public BigDecimal getC6b_cur_mur750_1000k_nof_dep_tran_hig() {
		return c6b_cur_mur750_1000k_nof_dep_tran_hig;
	}

	public void setC6b_cur_mur750_1000k_nof_dep_tran_hig(BigDecimal c6b_cur_mur750_1000k_nof_dep_tran_hig) {
		this.c6b_cur_mur750_1000k_nof_dep_tran_hig = c6b_cur_mur750_1000k_nof_dep_tran_hig;
	}

	public BigDecimal getC7b_cur_amur1000k_nof_dep_tran_hig() {
		return c7b_cur_amur1000k_nof_dep_tran_hig;
	}

	public void setC7b_cur_amur1000k_nof_dep_tran_hig(BigDecimal c7b_cur_amur1000k_nof_dep_tran_hig) {
		this.c7b_cur_amur1000k_nof_dep_tran_hig = c7b_cur_amur1000k_nof_dep_tran_hig;
	}

	public BigDecimal getC8b_cur_total_nof_dep_tran_hig() {
		return c8b_cur_total_nof_dep_tran_hig;
	}

	public void setC8b_cur_total_nof_dep_tran_hig(BigDecimal c8b_cur_total_nof_dep_tran_hig) {
		this.c8b_cur_total_nof_dep_tran_hig = c8b_cur_total_nof_dep_tran_hig;
	}

	public BigDecimal getC1c_cur_bmur100k_to_val_tran_hig() {
		return c1c_cur_bmur100k_to_val_tran_hig;
	}

	public void setC1c_cur_bmur100k_to_val_tran_hig(BigDecimal c1c_cur_bmur100k_to_val_tran_hig) {
		this.c1c_cur_bmur100k_to_val_tran_hig = c1c_cur_bmur100k_to_val_tran_hig;
	}

	public BigDecimal getC2c_cur_mur100_200k_to_val_tran_hig() {
		return c2c_cur_mur100_200k_to_val_tran_hig;
	}

	public void setC2c_cur_mur100_200k_to_val_tran_hig(BigDecimal c2c_cur_mur100_200k_to_val_tran_hig) {
		this.c2c_cur_mur100_200k_to_val_tran_hig = c2c_cur_mur100_200k_to_val_tran_hig;
	}

	public BigDecimal getC3c_cur_mur200_350k_to_val_tran_hig() {
		return c3c_cur_mur200_350k_to_val_tran_hig;
	}

	public void setC3c_cur_mur200_350k_to_val_tran_hig(BigDecimal c3c_cur_mur200_350k_to_val_tran_hig) {
		this.c3c_cur_mur200_350k_to_val_tran_hig = c3c_cur_mur200_350k_to_val_tran_hig;
	}

	public BigDecimal getC4c_cur_mur350_500k_to_val_tran_hig() {
		return c4c_cur_mur350_500k_to_val_tran_hig;
	}

	public void setC4c_cur_mur350_500k_to_val_tran_hig(BigDecimal c4c_cur_mur350_500k_to_val_tran_hig) {
		this.c4c_cur_mur350_500k_to_val_tran_hig = c4c_cur_mur350_500k_to_val_tran_hig;
	}

	public BigDecimal getC5c_cur_mur500_750k_to_val_tran_hig() {
		return c5c_cur_mur500_750k_to_val_tran_hig;
	}

	public void setC5c_cur_mur500_750k_to_val_tran_hig(BigDecimal c5c_cur_mur500_750k_to_val_tran_hig) {
		this.c5c_cur_mur500_750k_to_val_tran_hig = c5c_cur_mur500_750k_to_val_tran_hig;
	}

	public BigDecimal getC6c_cur_mur750_1000k_to_val_tran_hig() {
		return c6c_cur_mur750_1000k_to_val_tran_hig;
	}

	public void setC6c_cur_mur750_1000k_to_val_tran_hig(BigDecimal c6c_cur_mur750_1000k_to_val_tran_hig) {
		this.c6c_cur_mur750_1000k_to_val_tran_hig = c6c_cur_mur750_1000k_to_val_tran_hig;
	}

	public BigDecimal getC7c_cur_amur1000k_to_val_tran_hig() {
		return c7c_cur_amur1000k_to_val_tran_hig;
	}

	public void setC7c_cur_amur1000k_to_val_tran_hig(BigDecimal c7c_cur_amur1000k_to_val_tran_hig) {
		this.c7c_cur_amur1000k_to_val_tran_hig = c7c_cur_amur1000k_to_val_tran_hig;
	}

	public BigDecimal getC8c_cur_total_to_val_tran_hig() {
		return c8c_cur_total_to_val_tran_hig;
	}

	public void setC8c_cur_total_to_val_tran_hig(BigDecimal c8c_cur_total_to_val_tran_hig) {
		this.c8c_cur_total_to_val_tran_hig = c8c_cur_total_to_val_tran_hig;
	}

	public BigDecimal getC1d_cur_bmur100k_nof_dep_tran_med() {
		return c1d_cur_bmur100k_nof_dep_tran_med;
	}

	public void setC1d_cur_bmur100k_nof_dep_tran_med(BigDecimal c1d_cur_bmur100k_nof_dep_tran_med) {
		this.c1d_cur_bmur100k_nof_dep_tran_med = c1d_cur_bmur100k_nof_dep_tran_med;
	}

	public BigDecimal getC2d_cur_mur100_200k_nof_dep_tran_med() {
		return c2d_cur_mur100_200k_nof_dep_tran_med;
	}

	public void setC2d_cur_mur100_200k_nof_dep_tran_med(BigDecimal c2d_cur_mur100_200k_nof_dep_tran_med) {
		this.c2d_cur_mur100_200k_nof_dep_tran_med = c2d_cur_mur100_200k_nof_dep_tran_med;
	}

	public BigDecimal getC3d_cur_mur200_350k_nof_dep_tran_med() {
		return c3d_cur_mur200_350k_nof_dep_tran_med;
	}

	public void setC3d_cur_mur200_350k_nof_dep_tran_med(BigDecimal c3d_cur_mur200_350k_nof_dep_tran_med) {
		this.c3d_cur_mur200_350k_nof_dep_tran_med = c3d_cur_mur200_350k_nof_dep_tran_med;
	}

	public BigDecimal getC4d_cur_mur350_500k_nof_dep_tran_med() {
		return c4d_cur_mur350_500k_nof_dep_tran_med;
	}

	public void setC4d_cur_mur350_500k_nof_dep_tran_med(BigDecimal c4d_cur_mur350_500k_nof_dep_tran_med) {
		this.c4d_cur_mur350_500k_nof_dep_tran_med = c4d_cur_mur350_500k_nof_dep_tran_med;
	}

	public BigDecimal getC5d_cur_mur500_750k_nof_dep_tran_med() {
		return c5d_cur_mur500_750k_nof_dep_tran_med;
	}

	public void setC5d_cur_mur500_750k_nof_dep_tran_med(BigDecimal c5d_cur_mur500_750k_nof_dep_tran_med) {
		this.c5d_cur_mur500_750k_nof_dep_tran_med = c5d_cur_mur500_750k_nof_dep_tran_med;
	}

	public BigDecimal getC6d_cur_mur750_1000k_nof_dep_tran_med() {
		return c6d_cur_mur750_1000k_nof_dep_tran_med;
	}

	public void setC6d_cur_mur750_1000k_nof_dep_tran_med(BigDecimal c6d_cur_mur750_1000k_nof_dep_tran_med) {
		this.c6d_cur_mur750_1000k_nof_dep_tran_med = c6d_cur_mur750_1000k_nof_dep_tran_med;
	}

	public BigDecimal getC7d_cur_amur1000k_nof_dep_tran_med() {
		return c7d_cur_amur1000k_nof_dep_tran_med;
	}

	public void setC7d_cur_amur1000k_nof_dep_tran_med(BigDecimal c7d_cur_amur1000k_nof_dep_tran_med) {
		this.c7d_cur_amur1000k_nof_dep_tran_med = c7d_cur_amur1000k_nof_dep_tran_med;
	}

	public BigDecimal getC8d_cur_total_nof_dep_tran_med() {
		return c8d_cur_total_nof_dep_tran_med;
	}

	public void setC8d_cur_total_nof_dep_tran_med(BigDecimal c8d_cur_total_nof_dep_tran_med) {
		this.c8d_cur_total_nof_dep_tran_med = c8d_cur_total_nof_dep_tran_med;
	}

	public BigDecimal getC1e_cur_bmur100k_to_val_tran_med() {
		return c1e_cur_bmur100k_to_val_tran_med;
	}

	public void setC1e_cur_bmur100k_to_val_tran_med(BigDecimal c1e_cur_bmur100k_to_val_tran_med) {
		this.c1e_cur_bmur100k_to_val_tran_med = c1e_cur_bmur100k_to_val_tran_med;
	}

	public BigDecimal getC2e_cur_mur100_200k_to_val_tran_med() {
		return c2e_cur_mur100_200k_to_val_tran_med;
	}

	public void setC2e_cur_mur100_200k_to_val_tran_med(BigDecimal c2e_cur_mur100_200k_to_val_tran_med) {
		this.c2e_cur_mur100_200k_to_val_tran_med = c2e_cur_mur100_200k_to_val_tran_med;
	}

	public BigDecimal getC3e_cur_mur200_350k_to_val_tran_med() {
		return c3e_cur_mur200_350k_to_val_tran_med;
	}

	public void setC3e_cur_mur200_350k_to_val_tran_med(BigDecimal c3e_cur_mur200_350k_to_val_tran_med) {
		this.c3e_cur_mur200_350k_to_val_tran_med = c3e_cur_mur200_350k_to_val_tran_med;
	}

	public BigDecimal getC4e_cur_mur350_500k_to_val_tran_med() {
		return c4e_cur_mur350_500k_to_val_tran_med;
	}

	public void setC4e_cur_mur350_500k_to_val_tran_med(BigDecimal c4e_cur_mur350_500k_to_val_tran_med) {
		this.c4e_cur_mur350_500k_to_val_tran_med = c4e_cur_mur350_500k_to_val_tran_med;
	}

	public BigDecimal getC5e_cur_mur500_750k_to_val_tran_med() {
		return c5e_cur_mur500_750k_to_val_tran_med;
	}

	public void setC5e_cur_mur500_750k_to_val_tran_med(BigDecimal c5e_cur_mur500_750k_to_val_tran_med) {
		this.c5e_cur_mur500_750k_to_val_tran_med = c5e_cur_mur500_750k_to_val_tran_med;
	}

	public BigDecimal getC6e_cur_mur750_1000k_to_val_tran_med() {
		return c6e_cur_mur750_1000k_to_val_tran_med;
	}

	public void setC6e_cur_mur750_1000k_to_val_tran_med(BigDecimal c6e_cur_mur750_1000k_to_val_tran_med) {
		this.c6e_cur_mur750_1000k_to_val_tran_med = c6e_cur_mur750_1000k_to_val_tran_med;
	}

	public BigDecimal getC7e_cur_amur1000k_to_val_tran_med() {
		return c7e_cur_amur1000k_to_val_tran_med;
	}

	public void setC7e_cur_amur1000k_to_val_tran_med(BigDecimal c7e_cur_amur1000k_to_val_tran_med) {
		this.c7e_cur_amur1000k_to_val_tran_med = c7e_cur_amur1000k_to_val_tran_med;
	}

	public BigDecimal getC8e_cur_total_to_val_tran_med() {
		return c8e_cur_total_to_val_tran_med;
	}

	public void setC8e_cur_total_to_val_tran_med(BigDecimal c8e_cur_total_to_val_tran_med) {
		this.c8e_cur_total_to_val_tran_med = c8e_cur_total_to_val_tran_med;
	}

	public BigDecimal getC1f_cur_bmur100k_nof_dep_tran_low() {
		return c1f_cur_bmur100k_nof_dep_tran_low;
	}

	public void setC1f_cur_bmur100k_nof_dep_tran_low(BigDecimal c1f_cur_bmur100k_nof_dep_tran_low) {
		this.c1f_cur_bmur100k_nof_dep_tran_low = c1f_cur_bmur100k_nof_dep_tran_low;
	}

	public BigDecimal getC2f_cur_mur100_200k_nof_dep_tran_low() {
		return c2f_cur_mur100_200k_nof_dep_tran_low;
	}

	public void setC2f_cur_mur100_200k_nof_dep_tran_low(BigDecimal c2f_cur_mur100_200k_nof_dep_tran_low) {
		this.c2f_cur_mur100_200k_nof_dep_tran_low = c2f_cur_mur100_200k_nof_dep_tran_low;
	}

	public BigDecimal getC3f_cur_mur200_350k_nof_dep_tran_low() {
		return c3f_cur_mur200_350k_nof_dep_tran_low;
	}

	public void setC3f_cur_mur200_350k_nof_dep_tran_low(BigDecimal c3f_cur_mur200_350k_nof_dep_tran_low) {
		this.c3f_cur_mur200_350k_nof_dep_tran_low = c3f_cur_mur200_350k_nof_dep_tran_low;
	}

	public BigDecimal getC4f_cur_mur350_500k_nof_dep_tran_low() {
		return c4f_cur_mur350_500k_nof_dep_tran_low;
	}

	public void setC4f_cur_mur350_500k_nof_dep_tran_low(BigDecimal c4f_cur_mur350_500k_nof_dep_tran_low) {
		this.c4f_cur_mur350_500k_nof_dep_tran_low = c4f_cur_mur350_500k_nof_dep_tran_low;
	}

	public BigDecimal getC5f_cur_mur500_750k_nof_dep_tran_low() {
		return c5f_cur_mur500_750k_nof_dep_tran_low;
	}

	public void setC5f_cur_mur500_750k_nof_dep_tran_low(BigDecimal c5f_cur_mur500_750k_nof_dep_tran_low) {
		this.c5f_cur_mur500_750k_nof_dep_tran_low = c5f_cur_mur500_750k_nof_dep_tran_low;
	}

	public BigDecimal getC6f_cur_mur750_1000k_nof_dep_tran_low() {
		return c6f_cur_mur750_1000k_nof_dep_tran_low;
	}

	public void setC6f_cur_mur750_1000k_nof_dep_tran_low(BigDecimal c6f_cur_mur750_1000k_nof_dep_tran_low) {
		this.c6f_cur_mur750_1000k_nof_dep_tran_low = c6f_cur_mur750_1000k_nof_dep_tran_low;
	}

	public BigDecimal getC7f_cur_amur1000k_nof_dep_tran_low() {
		return c7f_cur_amur1000k_nof_dep_tran_low;
	}

	public void setC7f_cur_amur1000k_nof_dep_tran_low(BigDecimal c7f_cur_amur1000k_nof_dep_tran_low) {
		this.c7f_cur_amur1000k_nof_dep_tran_low = c7f_cur_amur1000k_nof_dep_tran_low;
	}

	public BigDecimal getC8f_cur_total_nof_dep_tran_low() {
		return c8f_cur_total_nof_dep_tran_low;
	}

	public void setC8f_cur_total_nof_dep_tran_low(BigDecimal c8f_cur_total_nof_dep_tran_low) {
		this.c8f_cur_total_nof_dep_tran_low = c8f_cur_total_nof_dep_tran_low;
	}

	public BigDecimal getC1g_cur_bmur100k_to_val_tran_low() {
		return c1g_cur_bmur100k_to_val_tran_low;
	}

	public void setC1g_cur_bmur100k_to_val_tran_low(BigDecimal c1g_cur_bmur100k_to_val_tran_low) {
		this.c1g_cur_bmur100k_to_val_tran_low = c1g_cur_bmur100k_to_val_tran_low;
	}

	public BigDecimal getC2g_cur_mur100_200k_to_val_tran_low() {
		return c2g_cur_mur100_200k_to_val_tran_low;
	}

	public void setC2g_cur_mur100_200k_to_val_tran_low(BigDecimal c2g_cur_mur100_200k_to_val_tran_low) {
		this.c2g_cur_mur100_200k_to_val_tran_low = c2g_cur_mur100_200k_to_val_tran_low;
	}

	public BigDecimal getC3g_cur_mur200_350k_to_val_tran_low() {
		return c3g_cur_mur200_350k_to_val_tran_low;
	}

	public void setC3g_cur_mur200_350k_to_val_tran_low(BigDecimal c3g_cur_mur200_350k_to_val_tran_low) {
		this.c3g_cur_mur200_350k_to_val_tran_low = c3g_cur_mur200_350k_to_val_tran_low;
	}

	public BigDecimal getC4g_cur_mur350_500k_to_val_tran_low() {
		return c4g_cur_mur350_500k_to_val_tran_low;
	}

	public void setC4g_cur_mur350_500k_to_val_tran_low(BigDecimal c4g_cur_mur350_500k_to_val_tran_low) {
		this.c4g_cur_mur350_500k_to_val_tran_low = c4g_cur_mur350_500k_to_val_tran_low;
	}

	public BigDecimal getC5g_cur_mur500_750k_to_val_tran_low() {
		return c5g_cur_mur500_750k_to_val_tran_low;
	}

	public void setC5g_cur_mur500_750k_to_val_tran_low(BigDecimal c5g_cur_mur500_750k_to_val_tran_low) {
		this.c5g_cur_mur500_750k_to_val_tran_low = c5g_cur_mur500_750k_to_val_tran_low;
	}

	public BigDecimal getC6g_cur_mur750_1000k_to_val_tran_low() {
		return c6g_cur_mur750_1000k_to_val_tran_low;
	}

	public void setC6g_cur_mur750_1000k_to_val_tran_low(BigDecimal c6g_cur_mur750_1000k_to_val_tran_low) {
		this.c6g_cur_mur750_1000k_to_val_tran_low = c6g_cur_mur750_1000k_to_val_tran_low;
	}

	public BigDecimal getC7g_cur_amur1000k_to_val_tran_low() {
		return c7g_cur_amur1000k_to_val_tran_low;
	}

	public void setC7g_cur_amur1000k_to_val_tran_low(BigDecimal c7g_cur_amur1000k_to_val_tran_low) {
		this.c7g_cur_amur1000k_to_val_tran_low = c7g_cur_amur1000k_to_val_tran_low;
	}

	public BigDecimal getC8g_cur_total_to_val_tran_low() {
		return c8g_cur_total_to_val_tran_low;
	}

	public void setC8g_cur_total_to_val_tran_low(BigDecimal c8g_cur_total_to_val_tran_low) {
		this.c8g_cur_total_to_val_tran_low = c8g_cur_total_to_val_tran_low;
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

	public T16BReport(String d1a_cur_bmur100k, String d2a_cur_mur100_200k, String d3a_cur_mur200_350k,
			String d4a_cur_mur350_500k, String d5a_cur_mur500_750k, String d6a_cur_mur750_1000k,
			String d7a_cur_amur1000k, String d8a_cur_total, BigDecimal c1b_cur_bmur100k_nof_dep_tran_hig,
			BigDecimal c2b_cur_mur100_200k_nof_dep_tran_hig, BigDecimal c3b_cur_mur200_350k_nof_dep_tran_hig,
			BigDecimal c4b_cur_mur350_500k_nof_dep_tran_hig, BigDecimal c5b_cur_mur500_750k_nof_dep_tran_hig,
			BigDecimal c6b_cur_mur750_1000k_nof_dep_tran_hig, BigDecimal c7b_cur_amur1000k_nof_dep_tran_hig,
			BigDecimal c8b_cur_total_nof_dep_tran_hig, BigDecimal c1c_cur_bmur100k_to_val_tran_hig,
			BigDecimal c2c_cur_mur100_200k_to_val_tran_hig, BigDecimal c3c_cur_mur200_350k_to_val_tran_hig,
			BigDecimal c4c_cur_mur350_500k_to_val_tran_hig, BigDecimal c5c_cur_mur500_750k_to_val_tran_hig,
			BigDecimal c6c_cur_mur750_1000k_to_val_tran_hig, BigDecimal c7c_cur_amur1000k_to_val_tran_hig,
			BigDecimal c8c_cur_total_to_val_tran_hig, BigDecimal c1d_cur_bmur100k_nof_dep_tran_med,
			BigDecimal c2d_cur_mur100_200k_nof_dep_tran_med, BigDecimal c3d_cur_mur200_350k_nof_dep_tran_med,
			BigDecimal c4d_cur_mur350_500k_nof_dep_tran_med, BigDecimal c5d_cur_mur500_750k_nof_dep_tran_med,
			BigDecimal c6d_cur_mur750_1000k_nof_dep_tran_med, BigDecimal c7d_cur_amur1000k_nof_dep_tran_med,
			BigDecimal c8d_cur_total_nof_dep_tran_med, BigDecimal c1e_cur_bmur100k_to_val_tran_med,
			BigDecimal c2e_cur_mur100_200k_to_val_tran_med, BigDecimal c3e_cur_mur200_350k_to_val_tran_med,
			BigDecimal c4e_cur_mur350_500k_to_val_tran_med, BigDecimal c5e_cur_mur500_750k_to_val_tran_med,
			BigDecimal c6e_cur_mur750_1000k_to_val_tran_med, BigDecimal c7e_cur_amur1000k_to_val_tran_med,
			BigDecimal c8e_cur_total_to_val_tran_med, BigDecimal c1f_cur_bmur100k_nof_dep_tran_low,
			BigDecimal c2f_cur_mur100_200k_nof_dep_tran_low, BigDecimal c3f_cur_mur200_350k_nof_dep_tran_low,
			BigDecimal c4f_cur_mur350_500k_nof_dep_tran_low, BigDecimal c5f_cur_mur500_750k_nof_dep_tran_low,
			BigDecimal c6f_cur_mur750_1000k_nof_dep_tran_low, BigDecimal c7f_cur_amur1000k_nof_dep_tran_low,
			BigDecimal c8f_cur_total_nof_dep_tran_low, BigDecimal c1g_cur_bmur100k_to_val_tran_low,
			BigDecimal c2g_cur_mur100_200k_to_val_tran_low, BigDecimal c3g_cur_mur200_350k_to_val_tran_low,
			BigDecimal c4g_cur_mur350_500k_to_val_tran_low, BigDecimal c5g_cur_mur500_750k_to_val_tran_low,
			BigDecimal c6g_cur_mur750_1000k_to_val_tran_low, BigDecimal c7g_cur_amur1000k_to_val_tran_low,
			BigDecimal c8g_cur_total_to_val_tran_low, String report_code, String report_name, Date report_date,
			Date report_due_date, Date rep_submit_date, Date rep_period_from, Date rep_period_to, String rep_freq,
			Character nil_report_flg, Character arch_flg) {
		this.d1a_cur_bmur100k = d1a_cur_bmur100k;
		this.d2a_cur_mur100_200k = d2a_cur_mur100_200k;
		this.d3a_cur_mur200_350k = d3a_cur_mur200_350k;
		this.d4a_cur_mur350_500k = d4a_cur_mur350_500k;
		this.d5a_cur_mur500_750k = d5a_cur_mur500_750k;
		this.d6a_cur_mur750_1000k = d6a_cur_mur750_1000k;
		this.d7a_cur_amur1000k = d7a_cur_amur1000k;
		this.d8a_cur_total = d8a_cur_total;
		this.c1b_cur_bmur100k_nof_dep_tran_hig = c1b_cur_bmur100k_nof_dep_tran_hig;
		this.c2b_cur_mur100_200k_nof_dep_tran_hig = c2b_cur_mur100_200k_nof_dep_tran_hig;
		this.c3b_cur_mur200_350k_nof_dep_tran_hig = c3b_cur_mur200_350k_nof_dep_tran_hig;
		this.c4b_cur_mur350_500k_nof_dep_tran_hig = c4b_cur_mur350_500k_nof_dep_tran_hig;
		this.c5b_cur_mur500_750k_nof_dep_tran_hig = c5b_cur_mur500_750k_nof_dep_tran_hig;
		this.c6b_cur_mur750_1000k_nof_dep_tran_hig = c6b_cur_mur750_1000k_nof_dep_tran_hig;
		this.c7b_cur_amur1000k_nof_dep_tran_hig = c7b_cur_amur1000k_nof_dep_tran_hig;
		this.c8b_cur_total_nof_dep_tran_hig = c8b_cur_total_nof_dep_tran_hig;
		this.c1c_cur_bmur100k_to_val_tran_hig = c1c_cur_bmur100k_to_val_tran_hig;
		this.c2c_cur_mur100_200k_to_val_tran_hig = c2c_cur_mur100_200k_to_val_tran_hig;
		this.c3c_cur_mur200_350k_to_val_tran_hig = c3c_cur_mur200_350k_to_val_tran_hig;
		this.c4c_cur_mur350_500k_to_val_tran_hig = c4c_cur_mur350_500k_to_val_tran_hig;
		this.c5c_cur_mur500_750k_to_val_tran_hig = c5c_cur_mur500_750k_to_val_tran_hig;
		this.c6c_cur_mur750_1000k_to_val_tran_hig = c6c_cur_mur750_1000k_to_val_tran_hig;
		this.c7c_cur_amur1000k_to_val_tran_hig = c7c_cur_amur1000k_to_val_tran_hig;
		this.c8c_cur_total_to_val_tran_hig = c8c_cur_total_to_val_tran_hig;
		this.c1d_cur_bmur100k_nof_dep_tran_med = c1d_cur_bmur100k_nof_dep_tran_med;
		this.c2d_cur_mur100_200k_nof_dep_tran_med = c2d_cur_mur100_200k_nof_dep_tran_med;
		this.c3d_cur_mur200_350k_nof_dep_tran_med = c3d_cur_mur200_350k_nof_dep_tran_med;
		this.c4d_cur_mur350_500k_nof_dep_tran_med = c4d_cur_mur350_500k_nof_dep_tran_med;
		this.c5d_cur_mur500_750k_nof_dep_tran_med = c5d_cur_mur500_750k_nof_dep_tran_med;
		this.c6d_cur_mur750_1000k_nof_dep_tran_med = c6d_cur_mur750_1000k_nof_dep_tran_med;
		this.c7d_cur_amur1000k_nof_dep_tran_med = c7d_cur_amur1000k_nof_dep_tran_med;
		this.c8d_cur_total_nof_dep_tran_med = c8d_cur_total_nof_dep_tran_med;
		this.c1e_cur_bmur100k_to_val_tran_med = c1e_cur_bmur100k_to_val_tran_med;
		this.c2e_cur_mur100_200k_to_val_tran_med = c2e_cur_mur100_200k_to_val_tran_med;
		this.c3e_cur_mur200_350k_to_val_tran_med = c3e_cur_mur200_350k_to_val_tran_med;
		this.c4e_cur_mur350_500k_to_val_tran_med = c4e_cur_mur350_500k_to_val_tran_med;
		this.c5e_cur_mur500_750k_to_val_tran_med = c5e_cur_mur500_750k_to_val_tran_med;
		this.c6e_cur_mur750_1000k_to_val_tran_med = c6e_cur_mur750_1000k_to_val_tran_med;
		this.c7e_cur_amur1000k_to_val_tran_med = c7e_cur_amur1000k_to_val_tran_med;
		this.c8e_cur_total_to_val_tran_med = c8e_cur_total_to_val_tran_med;
		this.c1f_cur_bmur100k_nof_dep_tran_low = c1f_cur_bmur100k_nof_dep_tran_low;
		this.c2f_cur_mur100_200k_nof_dep_tran_low = c2f_cur_mur100_200k_nof_dep_tran_low;
		this.c3f_cur_mur200_350k_nof_dep_tran_low = c3f_cur_mur200_350k_nof_dep_tran_low;
		this.c4f_cur_mur350_500k_nof_dep_tran_low = c4f_cur_mur350_500k_nof_dep_tran_low;
		this.c5f_cur_mur500_750k_nof_dep_tran_low = c5f_cur_mur500_750k_nof_dep_tran_low;
		this.c6f_cur_mur750_1000k_nof_dep_tran_low = c6f_cur_mur750_1000k_nof_dep_tran_low;
		this.c7f_cur_amur1000k_nof_dep_tran_low = c7f_cur_amur1000k_nof_dep_tran_low;
		this.c8f_cur_total_nof_dep_tran_low = c8f_cur_total_nof_dep_tran_low;
		this.c1g_cur_bmur100k_to_val_tran_low = c1g_cur_bmur100k_to_val_tran_low;
		this.c2g_cur_mur100_200k_to_val_tran_low = c2g_cur_mur100_200k_to_val_tran_low;
		this.c3g_cur_mur200_350k_to_val_tran_low = c3g_cur_mur200_350k_to_val_tran_low;
		this.c4g_cur_mur350_500k_to_val_tran_low = c4g_cur_mur350_500k_to_val_tran_low;
		this.c5g_cur_mur500_750k_to_val_tran_low = c5g_cur_mur500_750k_to_val_tran_low;
		this.c6g_cur_mur750_1000k_to_val_tran_low = c6g_cur_mur750_1000k_to_val_tran_low;
		this.c7g_cur_amur1000k_to_val_tran_low = c7g_cur_amur1000k_to_val_tran_low;
		this.c8g_cur_total_to_val_tran_low = c8g_cur_total_to_val_tran_low;
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
	
	

	
	
	

}
