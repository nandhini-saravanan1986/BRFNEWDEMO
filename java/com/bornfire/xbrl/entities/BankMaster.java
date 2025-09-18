package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "BANK_MASTER_TB")
public class BankMaster {

	@Id
	@Column(name = "report_date")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date reportDate;
	private BigDecimal tier1_capital_adequacy;
	private BigDecimal tier2_capital_adequacy;
	private BigDecimal tier3_capital_adequacy;
	private BigDecimal	base_deposit_rate;
	@Column(name="statutory_reserve")
	private BigDecimal	staturoty_reserve;
	private BigDecimal	assigned_capital;
	private BigDecimal	assigned_capital_fc;
	private BigDecimal	retained_earnings_fc;
	private BigDecimal	other_reserves;
	private BigDecimal	capital_base;
	private BigDecimal base_loan_rate;


	
	public BigDecimal getBase_loan_rate() {
		return base_loan_rate;
	}

	public void setBase_loan_rate(BigDecimal base_loan_rate) {
		this.base_loan_rate = base_loan_rate;
	}

	private String rcre_user_id;
	private Date rcre_time;
	private String lchg_user_id;
	private Date lchg_time;
	private String verify_user_id;
	private Date verify_time;

	private String del_flg;

	public String getDel_flg() {
		return del_flg;
	}

	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}

	public String getRcre_user_id() {
		return rcre_user_id;
	}

	public void setRcre_user_id(String rcre_user_id) {
		this.rcre_user_id = rcre_user_id;
	}

	public Date getRcre_time() {
		return rcre_time;
	}

	public void setRcre_time(Date rcre_time) {
		this.rcre_time = rcre_time;
	}

	public String getLchg_user_id() {
		return lchg_user_id;
	}

	public void setLchg_user_id(String lchg_user_id) {
		this.lchg_user_id = lchg_user_id;
	}

	public Date getLchg_time() {
		return lchg_time;
	}

	public void setLchg_time(Date lchg_time) {
		this.lchg_time = lchg_time;
	}

	public String getVerify_user_id() {
		return verify_user_id;
	}

	public void setVerify_user_id(String verify_user_id) {
		this.verify_user_id = verify_user_id;
	}

	public Date getVerify_time() {
		return verify_time;
	}

	public void setVerify_time(Date verify_time) {
		this.verify_time = verify_time;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public BigDecimal getTier1_capital_adequacy() {
		return tier1_capital_adequacy;
	}

	public void setTier1_capital_adequacy(BigDecimal tier1_capital_adequacy) {
		this.tier1_capital_adequacy = tier1_capital_adequacy;
	}

	public BigDecimal getTier2_capital_adequacy() {
		return tier2_capital_adequacy;
	}

	public void setTier2_capital_adequacy(BigDecimal tier2_capital_adequacy) {
		this.tier2_capital_adequacy = tier2_capital_adequacy;
	}

	public BigDecimal getTier3_capital_adequacy() {
		return tier3_capital_adequacy;
	}

	public void setTier3_capital_adequacy(BigDecimal tier3_capital_adequacy) {
		this.tier3_capital_adequacy = tier3_capital_adequacy;
	}
	public BigDecimal getBase_deposit_rate() {
		return base_deposit_rate;
	}

	public void setBase_deposit_rate(BigDecimal base_deposit_rate) {
		this.base_deposit_rate = base_deposit_rate;
	}

	public BigDecimal getStaturoty_reserve() {
		return staturoty_reserve;
	}

	public void setStaturoty_reserve(BigDecimal staturoty_reserve) {
		this.staturoty_reserve = staturoty_reserve;
	}

	public BigDecimal getAssigned_capital() {
		return assigned_capital;
	}

	public void setAssigned_capital(BigDecimal assigned_capital) {
		this.assigned_capital = assigned_capital;
	}

	public BigDecimal getAssigned_capital_fc() {
		return assigned_capital_fc;
	}

	public void setAssigned_capital_fc(BigDecimal assigned_capital_fc) {
		this.assigned_capital_fc = assigned_capital_fc;
	}

	public BigDecimal getRetained_earnings_fc() {
		return retained_earnings_fc;
	}

	public void setRetained_earnings_fc(BigDecimal retained_earnings_fc) {
		this.retained_earnings_fc = retained_earnings_fc;
	}

	public BigDecimal getOther_reserves() {
		return other_reserves;
	}

	public void setOther_reserves(BigDecimal other_reserves) {
		this.other_reserves = other_reserves;
	}

	public BigDecimal getCapital_base() {  
		return capital_base;
	}

	public void setCapital_base(BigDecimal capital_base) {
		this.capital_base = capital_base;
	}


}
