package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "T1_MAST_PROD_SER_DEL_CHANNEL")
public class T1MasterProdDetail {
	
	private String	d1a_dep_tkg_services;
	private String	d2a_lend_fund_based;
	private String	d3a_fb_finance_lease;
	private String	d4a_fb_oper_lease;
	private String	d5a_fb_loans;
	private String	d6a_fb_factoring;
	private String	d7a_fb_others;
	private String	d8a_lending_non_fund_based;
	private String	d9a_credit_cards;
	private String	d10a_merchang_pos;
	private String	d11a_other_prod_services;
	private String	d12a_retirement_saving_schemes;
	private String	d1b_dep_tkg_services;
	private String	d2b_lend_fund_based;
	private String	d3b_fb_finance_lease;
	private String	d4b_fb_oper_lease;
	private String	d5b_fb_loans;
	private String	d6b_fb_factoring;
	private String	d7b_fb_others;
	private String	d8b_lending_non_fund_based;
	private String	d9b_credit_cards;
	private String	d10b_merchang_pos;
	private String	d11b_other_prod_services;
	private String	d12b_retirement_saving_schemes;
	private String	c1c_dep_tkg_services_nbtdi;
	private String	c2c_lend_fund_based_nbtdi;
	private String	c3c_fb_finance_lease_nbtdi;
	private String	c4c_fb_oper_lease_nbtdi;
	private String	c5c_fb_loans_nbtdi;
	private String	c6c_fb_factoring_nbtdi;
	private String	c7c_fb_others_nbtdi;
	private String	c8c_lending_non_fund_based_nbtdi;
	private String	c9c_credit_cards_nbtdi;
	private String	c10c_merchang_pos_nbtdi;
	private String	c11c_other_prod_services_nbtdi;
	private String	c12c_retirement_saving_schemes_nbtdi;
	private String	c1d_dep_tkg_services_offer_ftf;
	private String	c2d_lend_fund_based_offer_ftf;
	private String	c3d_fb_finance_lease_offer_ftf;
	private String	c4d_fb_oper_lease_offer_ftf;
	private String	c5d_fb_loans_offer_ftf;
	private String	c6d_fb_factoring_offer_ftf;
	private String	c7d_fb_others_offer_ftf;
	private String	c8d_lending_non_fund_based_offer_ftf;
	private String	c9d_credit_cards_offer_ftf;
	private String	c10d_merchang_pos_offer_ftf;
	private String	c11d_other_prod_services_offer_ftf;
	private String	c12d_retirement_saving_schemes_offer_ftf;
	private String	c1e_dep_tkg_services_offer_nftf;
	private String	c2e_lend_fund_based_offer_nftf;
	private String	c3e_fb_finance_lease_offer_nftf;
	private String	c4e_fb_oper_lease_offer_nftf;
	private String	c5e_fb_loans_offer_nftf;
	private String	c6e_fb_factoring_offer_nftf;
	private String	c7e_fb_others_offer_nftf;
	private String	c8e_lending_non_fund_based_offer_nftf;
	private String	c9e_credit_cards_offer_nftf;
	private String	c10e_merchang_pos_offer_nftf;
	private String	c11e_other_prod_services_offer_nftf;
	private String	c12e_retirement_saving_schemes_offer_nftf;
	private String	c1f_dep_tkg_services_offer_tp;
	private String	c2f_lend_fund_based_offer_tp;
	private String	c3f_fb_finance_lease_offer_tp;
	private String	c4f_fb_oper_lease_offer_tp;
	private String	c5f_fb_loans_offer_tp;
	private String	c6f_fb_factoring_offer_tp;
	private String	c7f_fb_others_offer_tp;
	private String	c8f_lending_non_fund_based_offer_tp;
	private String	c9f_credit_cards_offer_tp;
	private String	c10f_merchang_pos_offer_tp;
	private String	c11f_other_prod_services_offer_tp;
	private String	c12f_retirement_saving_schemes_offer_tp;
	private Character	qtr_flg;
	private Character	entity_flg;
	private Character	del_flg;
	private Character	modify_flg;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	entry_date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	modify_date;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date	verify_date;
	private String	entry_user;
	private String	modify_user;
	private String	verify_user;
	private String	report_code;
	private String	report_name;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date;
	private Character	arch_flg;
	@Override
	public String toString() {
		return "T1MasterProdDetail [d1a_dep_tkg_services=" + d1a_dep_tkg_services + ", d2a_lend_fund_based="
				+ d2a_lend_fund_based + ", d3a_fb_finance_lease=" + d3a_fb_finance_lease + ", d4a_fb_oper_lease="
				+ d4a_fb_oper_lease + ", d5a_fb_loans=" + d5a_fb_loans + ", d6a_fb_factoring=" + d6a_fb_factoring
				+ ", d7a_fb_others=" + d7a_fb_others + ", d8a_lending_non_fund_based=" + d8a_lending_non_fund_based
				+ ", d9a_credit_cards=" + d9a_credit_cards + ", d10a_merchang_pos=" + d10a_merchang_pos
				+ ", d11a_other_prod_services=" + d11a_other_prod_services + ", d12a_retirement_saving_schemes="
				+ d12a_retirement_saving_schemes + ", d1b_dep_tkg_services=" + d1b_dep_tkg_services
				+ ", d2b_lend_fund_based=" + d2b_lend_fund_based + ", d3b_fb_finance_lease=" + d3b_fb_finance_lease
				+ ", d4b_fb_oper_lease=" + d4b_fb_oper_lease + ", d5b_fb_loans=" + d5b_fb_loans + ", d6b_fb_factoring="
				+ d6b_fb_factoring + ", d7b_fb_others=" + d7b_fb_others + ", d8b_lending_non_fund_based="
				+ d8b_lending_non_fund_based + ", d9b_credit_cards=" + d9b_credit_cards + ", d10b_merchang_pos="
				+ d10b_merchang_pos + ", d11b_other_prod_services=" + d11b_other_prod_services
				+ ", d12b_retirement_saving_schemes=" + d12b_retirement_saving_schemes + ", c1c_dep_tkg_services_nbtdi="
				+ c1c_dep_tkg_services_nbtdi + ", c2c_lend_fund_based_nbtdi=" + c2c_lend_fund_based_nbtdi
				+ ", c3c_fb_finance_lease_nbtdi=" + c3c_fb_finance_lease_nbtdi + ", c4c_fb_oper_lease_nbtdi="
				+ c4c_fb_oper_lease_nbtdi + ", c5c_fb_loans_nbtdi=" + c5c_fb_loans_nbtdi + ", c6c_fb_factoring_nbtdi="
				+ c6c_fb_factoring_nbtdi + ", c7c_fb_others_nbtdi=" + c7c_fb_others_nbtdi
				+ ", c8c_lending_non_fund_based_nbtdi=" + c8c_lending_non_fund_based_nbtdi + ", c9c_credit_cards_nbtdi="
				+ c9c_credit_cards_nbtdi + ", c10c_merchang_pos_nbtdi=" + c10c_merchang_pos_nbtdi
				+ ", c11c_other_prod_services_nbtdi=" + c11c_other_prod_services_nbtdi
				+ ", c12c_retirement_saving_schemes_nbtdi=" + c12c_retirement_saving_schemes_nbtdi
				+ ", c1d_dep_tkg_services_offer_ftf=" + c1d_dep_tkg_services_offer_ftf
				+ ", c2d_lend_fund_based_offer_ftf=" + c2d_lend_fund_based_offer_ftf
				+ ", c3d_fb_finance_lease_offer_ftf=" + c3d_fb_finance_lease_offer_ftf
				+ ", c4d_fb_oper_lease_offer_ftf=" + c4d_fb_oper_lease_offer_ftf + ", c5d_fb_loans_offer_ftf="
				+ c5d_fb_loans_offer_ftf + ", c6d_fb_factoring_offer_ftf=" + c6d_fb_factoring_offer_ftf
				+ ", c7d_fb_others_offer_ftf=" + c7d_fb_others_offer_ftf + ", c8d_lending_non_fund_based_offer_ftf="
				+ c8d_lending_non_fund_based_offer_ftf + ", c9d_credit_cards_offer_ftf=" + c9d_credit_cards_offer_ftf
				+ ", c10d_merchang_pos_offer_ftf=" + c10d_merchang_pos_offer_ftf
				+ ", c11d_other_prod_services_offer_ftf=" + c11d_other_prod_services_offer_ftf
				+ ", c12d_retirement_saving_schemes_offer_ftf=" + c12d_retirement_saving_schemes_offer_ftf
				+ ", c1e_dep_tkg_services_offer_nftf=" + c1e_dep_tkg_services_offer_nftf
				+ ", c2e_lend_fund_based_offer_nftf=" + c2e_lend_fund_based_offer_nftf
				+ ", c3e_fb_finance_lease_offer_nftf=" + c3e_fb_finance_lease_offer_nftf
				+ ", c4e_fb_oper_lease_offer_nftf=" + c4e_fb_oper_lease_offer_nftf + ", c5e_fb_loans_offer_nftf="
				+ c5e_fb_loans_offer_nftf + ", c6e_fb_factoring_offer_nftf=" + c6e_fb_factoring_offer_nftf
				+ ", c7e_fb_others_offer_nftf=" + c7e_fb_others_offer_nftf + ", c8e_lending_non_fund_based_offer_nftf="
				+ c8e_lending_non_fund_based_offer_nftf + ", c9e_credit_cards_offer_nftf=" + c9e_credit_cards_offer_nftf
				+ ", c10e_merchang_pos_offer_nftf=" + c10e_merchang_pos_offer_nftf
				+ ", c11e_other_prod_services_offer_nftf=" + c11e_other_prod_services_offer_nftf
				+ ", c12e_retirement_saving_schemes_offer_nftf=" + c12e_retirement_saving_schemes_offer_nftf
				+ ", c1f_dep_tkg_services_offer_tp=" + c1f_dep_tkg_services_offer_tp + ", c2f_lend_fund_based_offer_tp="
				+ c2f_lend_fund_based_offer_tp + ", c3f_fb_finance_lease_offer_tp=" + c3f_fb_finance_lease_offer_tp
				+ ", c4f_fb_oper_lease_offer_tp=" + c4f_fb_oper_lease_offer_tp + ", c5f_fb_loans_offer_tp="
				+ c5f_fb_loans_offer_tp + ", c6f_fb_factoring_offer_tp=" + c6f_fb_factoring_offer_tp
				+ ", c7f_fb_others_offer_tp=" + c7f_fb_others_offer_tp + ", c8f_lending_non_fund_based_offer_tp="
				+ c8f_lending_non_fund_based_offer_tp + ", c9f_credit_cards_offer_tp=" + c9f_credit_cards_offer_tp
				+ ", c10f_merchang_pos_offer_tp=" + c10f_merchang_pos_offer_tp + ", c11f_other_prod_services_offer_tp="
				+ c11f_other_prod_services_offer_tp + ", c12f_retirement_saving_schemes_offer_tp="
				+ c12f_retirement_saving_schemes_offer_tp + ", qtr_flg=" + qtr_flg + ", entity_flg=" + entity_flg
				+ ", del_flg=" + del_flg + ", modify_flg=" + modify_flg + ", entry_date=" + entry_date
				+ ", modify_date=" + modify_date + ", verify_date=" + verify_date + ", entry_user=" + entry_user
				+ ", modify_user=" + modify_user + ", verify_user=" + verify_user + ", report_code=" + report_code
				+ ", report_name=" + report_name + ", report_date=" + report_date + ", arch_flg=" + arch_flg + "]";
	}
	public String getD1a_dep_tkg_services() {
		return d1a_dep_tkg_services;
	}
	public void setD1a_dep_tkg_services(String d1a_dep_tkg_services) {
		this.d1a_dep_tkg_services = d1a_dep_tkg_services;
	}
	public String getD2a_lend_fund_based() {
		return d2a_lend_fund_based;
	}
	public void setD2a_lend_fund_based(String d2a_lend_fund_based) {
		this.d2a_lend_fund_based = d2a_lend_fund_based;
	}
	public String getD3a_fb_finance_lease() {
		return d3a_fb_finance_lease;
	}
	public void setD3a_fb_finance_lease(String d3a_fb_finance_lease) {
		this.d3a_fb_finance_lease = d3a_fb_finance_lease;
	}
	public String getD4a_fb_oper_lease() {
		return d4a_fb_oper_lease;
	}
	public void setD4a_fb_oper_lease(String d4a_fb_oper_lease) {
		this.d4a_fb_oper_lease = d4a_fb_oper_lease;
	}
	public String getD5a_fb_loans() {
		return d5a_fb_loans;
	}
	public void setD5a_fb_loans(String d5a_fb_loans) {
		this.d5a_fb_loans = d5a_fb_loans;
	}
	public String getD6a_fb_factoring() {
		return d6a_fb_factoring;
	}
	public void setD6a_fb_factoring(String d6a_fb_factoring) {
		this.d6a_fb_factoring = d6a_fb_factoring;
	}
	public String getD7a_fb_others() {
		return d7a_fb_others;
	}
	public void setD7a_fb_others(String d7a_fb_others) {
		this.d7a_fb_others = d7a_fb_others;
	}
	public String getD8a_lending_non_fund_based() {
		return d8a_lending_non_fund_based;
	}
	public void setD8a_lending_non_fund_based(String d8a_lending_non_fund_based) {
		this.d8a_lending_non_fund_based = d8a_lending_non_fund_based;
	}
	public String getD9a_credit_cards() {
		return d9a_credit_cards;
	}
	public void setD9a_credit_cards(String d9a_credit_cards) {
		this.d9a_credit_cards = d9a_credit_cards;
	}
	public String getD10a_merchang_pos() {
		return d10a_merchang_pos;
	}
	public void setD10a_merchang_pos(String d10a_merchang_pos) {
		this.d10a_merchang_pos = d10a_merchang_pos;
	}
	public String getD11a_other_prod_services() {
		return d11a_other_prod_services;
	}
	public void setD11a_other_prod_services(String d11a_other_prod_services) {
		this.d11a_other_prod_services = d11a_other_prod_services;
	}
	public String getD12a_retirement_saving_schemes() {
		return d12a_retirement_saving_schemes;
	}
	public void setD12a_retirement_saving_schemes(String d12a_retirement_saving_schemes) {
		this.d12a_retirement_saving_schemes = d12a_retirement_saving_schemes;
	}
	public String getD1b_dep_tkg_services() {
		return d1b_dep_tkg_services;
	}
	public void setD1b_dep_tkg_services(String d1b_dep_tkg_services) {
		this.d1b_dep_tkg_services = d1b_dep_tkg_services;
	}
	public String getD2b_lend_fund_based() {
		return d2b_lend_fund_based;
	}
	public void setD2b_lend_fund_based(String d2b_lend_fund_based) {
		this.d2b_lend_fund_based = d2b_lend_fund_based;
	}
	public String getD3b_fb_finance_lease() {
		return d3b_fb_finance_lease;
	}
	public void setD3b_fb_finance_lease(String d3b_fb_finance_lease) {
		this.d3b_fb_finance_lease = d3b_fb_finance_lease;
	}
	public String getD4b_fb_oper_lease() {
		return d4b_fb_oper_lease;
	}
	public void setD4b_fb_oper_lease(String d4b_fb_oper_lease) {
		this.d4b_fb_oper_lease = d4b_fb_oper_lease;
	}
	public String getD5b_fb_loans() {
		return d5b_fb_loans;
	}
	public void setD5b_fb_loans(String d5b_fb_loans) {
		this.d5b_fb_loans = d5b_fb_loans;
	}
	public String getD6b_fb_factoring() {
		return d6b_fb_factoring;
	}
	public void setD6b_fb_factoring(String d6b_fb_factoring) {
		this.d6b_fb_factoring = d6b_fb_factoring;
	}
	public String getD7b_fb_others() {
		return d7b_fb_others;
	}
	public void setD7b_fb_others(String d7b_fb_others) {
		this.d7b_fb_others = d7b_fb_others;
	}
	public String getD8b_lending_non_fund_based() {
		return d8b_lending_non_fund_based;
	}
	public void setD8b_lending_non_fund_based(String d8b_lending_non_fund_based) {
		this.d8b_lending_non_fund_based = d8b_lending_non_fund_based;
	}
	public String getD9b_credit_cards() {
		return d9b_credit_cards;
	}
	public void setD9b_credit_cards(String d9b_credit_cards) {
		this.d9b_credit_cards = d9b_credit_cards;
	}
	public String getD10b_merchang_pos() {
		return d10b_merchang_pos;
	}
	public void setD10b_merchang_pos(String d10b_merchang_pos) {
		this.d10b_merchang_pos = d10b_merchang_pos;
	}
	public String getD11b_other_prod_services() {
		return d11b_other_prod_services;
	}
	public void setD11b_other_prod_services(String d11b_other_prod_services) {
		this.d11b_other_prod_services = d11b_other_prod_services;
	}
	public String getD12b_retirement_saving_schemes() {
		return d12b_retirement_saving_schemes;
	}
	public void setD12b_retirement_saving_schemes(String d12b_retirement_saving_schemes) {
		this.d12b_retirement_saving_schemes = d12b_retirement_saving_schemes;
	}
	public String getC1c_dep_tkg_services_nbtdi() {
		return c1c_dep_tkg_services_nbtdi;
	}
	public void setC1c_dep_tkg_services_nbtdi(String c1c_dep_tkg_services_nbtdi) {
		this.c1c_dep_tkg_services_nbtdi = c1c_dep_tkg_services_nbtdi;
	}
	public String getC2c_lend_fund_based_nbtdi() {
		return c2c_lend_fund_based_nbtdi;
	}
	public void setC2c_lend_fund_based_nbtdi(String c2c_lend_fund_based_nbtdi) {
		this.c2c_lend_fund_based_nbtdi = c2c_lend_fund_based_nbtdi;
	}
	public String getC3c_fb_finance_lease_nbtdi() {
		return c3c_fb_finance_lease_nbtdi;
	}
	public void setC3c_fb_finance_lease_nbtdi(String c3c_fb_finance_lease_nbtdi) {
		this.c3c_fb_finance_lease_nbtdi = c3c_fb_finance_lease_nbtdi;
	}
	public String getC4c_fb_oper_lease_nbtdi() {
		return c4c_fb_oper_lease_nbtdi;
	}
	public void setC4c_fb_oper_lease_nbtdi(String c4c_fb_oper_lease_nbtdi) {
		this.c4c_fb_oper_lease_nbtdi = c4c_fb_oper_lease_nbtdi;
	}
	public String getC5c_fb_loans_nbtdi() {
		return c5c_fb_loans_nbtdi;
	}
	public void setC5c_fb_loans_nbtdi(String c5c_fb_loans_nbtdi) {
		this.c5c_fb_loans_nbtdi = c5c_fb_loans_nbtdi;
	}
	public String getC6c_fb_factoring_nbtdi() {
		return c6c_fb_factoring_nbtdi;
	}
	public void setC6c_fb_factoring_nbtdi(String c6c_fb_factoring_nbtdi) {
		this.c6c_fb_factoring_nbtdi = c6c_fb_factoring_nbtdi;
	}
	public String getC7c_fb_others_nbtdi() {
		return c7c_fb_others_nbtdi;
	}
	public void setC7c_fb_others_nbtdi(String c7c_fb_others_nbtdi) {
		this.c7c_fb_others_nbtdi = c7c_fb_others_nbtdi;
	}
	public String getC8c_lending_non_fund_based_nbtdi() {
		return c8c_lending_non_fund_based_nbtdi;
	}
	public void setC8c_lending_non_fund_based_nbtdi(String c8c_lending_non_fund_based_nbtdi) {
		this.c8c_lending_non_fund_based_nbtdi = c8c_lending_non_fund_based_nbtdi;
	}
	public String getC9c_credit_cards_nbtdi() {
		return c9c_credit_cards_nbtdi;
	}
	public void setC9c_credit_cards_nbtdi(String c9c_credit_cards_nbtdi) {
		this.c9c_credit_cards_nbtdi = c9c_credit_cards_nbtdi;
	}
	public String getC10c_merchang_pos_nbtdi() {
		return c10c_merchang_pos_nbtdi;
	}
	public void setC10c_merchang_pos_nbtdi(String c10c_merchang_pos_nbtdi) {
		this.c10c_merchang_pos_nbtdi = c10c_merchang_pos_nbtdi;
	}
	public String getC11c_other_prod_services_nbtdi() {
		return c11c_other_prod_services_nbtdi;
	}
	public void setC11c_other_prod_services_nbtdi(String c11c_other_prod_services_nbtdi) {
		this.c11c_other_prod_services_nbtdi = c11c_other_prod_services_nbtdi;
	}
	public String getC12c_retirement_saving_schemes_nbtdi() {
		return c12c_retirement_saving_schemes_nbtdi;
	}
	public void setC12c_retirement_saving_schemes_nbtdi(String c12c_retirement_saving_schemes_nbtdi) {
		this.c12c_retirement_saving_schemes_nbtdi = c12c_retirement_saving_schemes_nbtdi;
	}
	public String getC1d_dep_tkg_services_offer_ftf() {
		return c1d_dep_tkg_services_offer_ftf;
	}
	public void setC1d_dep_tkg_services_offer_ftf(String c1d_dep_tkg_services_offer_ftf) {
		this.c1d_dep_tkg_services_offer_ftf = c1d_dep_tkg_services_offer_ftf;
	}
	public String getC2d_lend_fund_based_offer_ftf() {
		return c2d_lend_fund_based_offer_ftf;
	}
	public void setC2d_lend_fund_based_offer_ftf(String c2d_lend_fund_based_offer_ftf) {
		this.c2d_lend_fund_based_offer_ftf = c2d_lend_fund_based_offer_ftf;
	}
	public String getC3d_fb_finance_lease_offer_ftf() {
		return c3d_fb_finance_lease_offer_ftf;
	}
	public void setC3d_fb_finance_lease_offer_ftf(String c3d_fb_finance_lease_offer_ftf) {
		this.c3d_fb_finance_lease_offer_ftf = c3d_fb_finance_lease_offer_ftf;
	}
	public String getC4d_fb_oper_lease_offer_ftf() {
		return c4d_fb_oper_lease_offer_ftf;
	}
	public void setC4d_fb_oper_lease_offer_ftf(String c4d_fb_oper_lease_offer_ftf) {
		this.c4d_fb_oper_lease_offer_ftf = c4d_fb_oper_lease_offer_ftf;
	}
	public String getC5d_fb_loans_offer_ftf() {
		return c5d_fb_loans_offer_ftf;
	}
	public void setC5d_fb_loans_offer_ftf(String c5d_fb_loans_offer_ftf) {
		this.c5d_fb_loans_offer_ftf = c5d_fb_loans_offer_ftf;
	}
	public String getC6d_fb_factoring_offer_ftf() {
		return c6d_fb_factoring_offer_ftf;
	}
	public void setC6d_fb_factoring_offer_ftf(String c6d_fb_factoring_offer_ftf) {
		this.c6d_fb_factoring_offer_ftf = c6d_fb_factoring_offer_ftf;
	}
	public String getC7d_fb_others_offer_ftf() {
		return c7d_fb_others_offer_ftf;
	}
	public void setC7d_fb_others_offer_ftf(String c7d_fb_others_offer_ftf) {
		this.c7d_fb_others_offer_ftf = c7d_fb_others_offer_ftf;
	}
	public String getC8d_lending_non_fund_based_offer_ftf() {
		return c8d_lending_non_fund_based_offer_ftf;
	}
	public void setC8d_lending_non_fund_based_offer_ftf(String c8d_lending_non_fund_based_offer_ftf) {
		this.c8d_lending_non_fund_based_offer_ftf = c8d_lending_non_fund_based_offer_ftf;
	}
	public String getC9d_credit_cards_offer_ftf() {
		return c9d_credit_cards_offer_ftf;
	}
	public void setC9d_credit_cards_offer_ftf(String c9d_credit_cards_offer_ftf) {
		this.c9d_credit_cards_offer_ftf = c9d_credit_cards_offer_ftf;
	}
	public String getC10d_merchang_pos_offer_ftf() {
		return c10d_merchang_pos_offer_ftf;
	}
	public void setC10d_merchang_pos_offer_ftf(String c10d_merchang_pos_offer_ftf) {
		this.c10d_merchang_pos_offer_ftf = c10d_merchang_pos_offer_ftf;
	}
	public String getC11d_other_prod_services_offer_ftf() {
		return c11d_other_prod_services_offer_ftf;
	}
	public void setC11d_other_prod_services_offer_ftf(String c11d_other_prod_services_offer_ftf) {
		this.c11d_other_prod_services_offer_ftf = c11d_other_prod_services_offer_ftf;
	}
	public String getC12d_retirement_saving_schemes_offer_ftf() {
		return c12d_retirement_saving_schemes_offer_ftf;
	}
	public void setC12d_retirement_saving_schemes_offer_ftf(String c12d_retirement_saving_schemes_offer_ftf) {
		this.c12d_retirement_saving_schemes_offer_ftf = c12d_retirement_saving_schemes_offer_ftf;
	}
	public String getC1e_dep_tkg_services_offer_nftf() {
		return c1e_dep_tkg_services_offer_nftf;
	}
	public void setC1e_dep_tkg_services_offer_nftf(String c1e_dep_tkg_services_offer_nftf) {
		this.c1e_dep_tkg_services_offer_nftf = c1e_dep_tkg_services_offer_nftf;
	}
	public String getC2e_lend_fund_based_offer_nftf() {
		return c2e_lend_fund_based_offer_nftf;
	}
	public void setC2e_lend_fund_based_offer_nftf(String c2e_lend_fund_based_offer_nftf) {
		this.c2e_lend_fund_based_offer_nftf = c2e_lend_fund_based_offer_nftf;
	}
	public String getC3e_fb_finance_lease_offer_nftf() {
		return c3e_fb_finance_lease_offer_nftf;
	}
	public void setC3e_fb_finance_lease_offer_nftf(String c3e_fb_finance_lease_offer_nftf) {
		this.c3e_fb_finance_lease_offer_nftf = c3e_fb_finance_lease_offer_nftf;
	}
	public String getC4e_fb_oper_lease_offer_nftf() {
		return c4e_fb_oper_lease_offer_nftf;
	}
	public void setC4e_fb_oper_lease_offer_nftf(String c4e_fb_oper_lease_offer_nftf) {
		this.c4e_fb_oper_lease_offer_nftf = c4e_fb_oper_lease_offer_nftf;
	}
	public String getC5e_fb_loans_offer_nftf() {
		return c5e_fb_loans_offer_nftf;
	}
	public void setC5e_fb_loans_offer_nftf(String c5e_fb_loans_offer_nftf) {
		this.c5e_fb_loans_offer_nftf = c5e_fb_loans_offer_nftf;
	}
	public String getC6e_fb_factoring_offer_nftf() {
		return c6e_fb_factoring_offer_nftf;
	}
	public void setC6e_fb_factoring_offer_nftf(String c6e_fb_factoring_offer_nftf) {
		this.c6e_fb_factoring_offer_nftf = c6e_fb_factoring_offer_nftf;
	}
	public String getC7e_fb_others_offer_nftf() {
		return c7e_fb_others_offer_nftf;
	}
	public void setC7e_fb_others_offer_nftf(String c7e_fb_others_offer_nftf) {
		this.c7e_fb_others_offer_nftf = c7e_fb_others_offer_nftf;
	}
	public String getC8e_lending_non_fund_based_offer_nftf() {
		return c8e_lending_non_fund_based_offer_nftf;
	}
	public void setC8e_lending_non_fund_based_offer_nftf(String c8e_lending_non_fund_based_offer_nftf) {
		this.c8e_lending_non_fund_based_offer_nftf = c8e_lending_non_fund_based_offer_nftf;
	}
	public String getC9e_credit_cards_offer_nftf() {
		return c9e_credit_cards_offer_nftf;
	}
	public void setC9e_credit_cards_offer_nftf(String c9e_credit_cards_offer_nftf) {
		this.c9e_credit_cards_offer_nftf = c9e_credit_cards_offer_nftf;
	}
	public String getC10e_merchang_pos_offer_nftf() {
		return c10e_merchang_pos_offer_nftf;
	}
	public void setC10e_merchang_pos_offer_nftf(String c10e_merchang_pos_offer_nftf) {
		this.c10e_merchang_pos_offer_nftf = c10e_merchang_pos_offer_nftf;
	}
	public String getC11e_other_prod_services_offer_nftf() {
		return c11e_other_prod_services_offer_nftf;
	}
	public void setC11e_other_prod_services_offer_nftf(String c11e_other_prod_services_offer_nftf) {
		this.c11e_other_prod_services_offer_nftf = c11e_other_prod_services_offer_nftf;
	}
	public String getC12e_retirement_saving_schemes_offer_nftf() {
		return c12e_retirement_saving_schemes_offer_nftf;
	}
	public void setC12e_retirement_saving_schemes_offer_nftf(String c12e_retirement_saving_schemes_offer_nftf) {
		this.c12e_retirement_saving_schemes_offer_nftf = c12e_retirement_saving_schemes_offer_nftf;
	}
	public String getC1f_dep_tkg_services_offer_tp() {
		return c1f_dep_tkg_services_offer_tp;
	}
	public void setC1f_dep_tkg_services_offer_tp(String c1f_dep_tkg_services_offer_tp) {
		this.c1f_dep_tkg_services_offer_tp = c1f_dep_tkg_services_offer_tp;
	}
	public String getC2f_lend_fund_based_offer_tp() {
		return c2f_lend_fund_based_offer_tp;
	}
	public void setC2f_lend_fund_based_offer_tp(String c2f_lend_fund_based_offer_tp) {
		this.c2f_lend_fund_based_offer_tp = c2f_lend_fund_based_offer_tp;
	}
	public String getC3f_fb_finance_lease_offer_tp() {
		return c3f_fb_finance_lease_offer_tp;
	}
	public void setC3f_fb_finance_lease_offer_tp(String c3f_fb_finance_lease_offer_tp) {
		this.c3f_fb_finance_lease_offer_tp = c3f_fb_finance_lease_offer_tp;
	}
	public String getC4f_fb_oper_lease_offer_tp() {
		return c4f_fb_oper_lease_offer_tp;
	}
	public void setC4f_fb_oper_lease_offer_tp(String c4f_fb_oper_lease_offer_tp) {
		this.c4f_fb_oper_lease_offer_tp = c4f_fb_oper_lease_offer_tp;
	}
	public String getC5f_fb_loans_offer_tp() {
		return c5f_fb_loans_offer_tp;
	}
	public void setC5f_fb_loans_offer_tp(String c5f_fb_loans_offer_tp) {
		this.c5f_fb_loans_offer_tp = c5f_fb_loans_offer_tp;
	}
	public String getC6f_fb_factoring_offer_tp() {
		return c6f_fb_factoring_offer_tp;
	}
	public void setC6f_fb_factoring_offer_tp(String c6f_fb_factoring_offer_tp) {
		this.c6f_fb_factoring_offer_tp = c6f_fb_factoring_offer_tp;
	}
	public String getC7f_fb_others_offer_tp() {
		return c7f_fb_others_offer_tp;
	}
	public void setC7f_fb_others_offer_tp(String c7f_fb_others_offer_tp) {
		this.c7f_fb_others_offer_tp = c7f_fb_others_offer_tp;
	}
	public String getC8f_lending_non_fund_based_offer_tp() {
		return c8f_lending_non_fund_based_offer_tp;
	}
	public void setC8f_lending_non_fund_based_offer_tp(String c8f_lending_non_fund_based_offer_tp) {
		this.c8f_lending_non_fund_based_offer_tp = c8f_lending_non_fund_based_offer_tp;
	}
	public String getC9f_credit_cards_offer_tp() {
		return c9f_credit_cards_offer_tp;
	}
	public void setC9f_credit_cards_offer_tp(String c9f_credit_cards_offer_tp) {
		this.c9f_credit_cards_offer_tp = c9f_credit_cards_offer_tp;
	}
	public String getC10f_merchang_pos_offer_tp() {
		return c10f_merchang_pos_offer_tp;
	}
	public void setC10f_merchang_pos_offer_tp(String c10f_merchang_pos_offer_tp) {
		this.c10f_merchang_pos_offer_tp = c10f_merchang_pos_offer_tp;
	}
	public String getC11f_other_prod_services_offer_tp() {
		return c11f_other_prod_services_offer_tp;
	}
	public void setC11f_other_prod_services_offer_tp(String c11f_other_prod_services_offer_tp) {
		this.c11f_other_prod_services_offer_tp = c11f_other_prod_services_offer_tp;
	}
	public String getC12f_retirement_saving_schemes_offer_tp() {
		return c12f_retirement_saving_schemes_offer_tp;
	}
	public void setC12f_retirement_saving_schemes_offer_tp(String c12f_retirement_saving_schemes_offer_tp) {
		this.c12f_retirement_saving_schemes_offer_tp = c12f_retirement_saving_schemes_offer_tp;
	}
	public Character getQtr_flg() {
		return qtr_flg;
	}
	public void setQtr_flg(Character qtr_flg) {
		this.qtr_flg = qtr_flg;
	}
	public Character getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(Character entity_flg) {
		this.entity_flg = entity_flg;
	}
	public Character getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(Character del_flg) {
		this.del_flg = del_flg;
	}
	public Character getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(Character modify_flg) {
		this.modify_flg = modify_flg;
	}
	public Date getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Date entry_date) {
		this.entry_date = entry_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	public Date getVerify_date() {
		return verify_date;
	}
	public void setVerify_date(Date verify_date) {
		this.verify_date = verify_date;
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
	public Character getArch_flg() {
		return arch_flg;
	}
	public void setArch_flg(Character arch_flg) {
		this.arch_flg = arch_flg;
	}
	public T1MasterProdDetail(String d1a_dep_tkg_services, String d2a_lend_fund_based, String d3a_fb_finance_lease,
			String d4a_fb_oper_lease, String d5a_fb_loans, String d6a_fb_factoring, String d7a_fb_others,
			String d8a_lending_non_fund_based, String d9a_credit_cards, String d10a_merchang_pos,
			String d11a_other_prod_services, String d12a_retirement_saving_schemes, String d1b_dep_tkg_services,
			String d2b_lend_fund_based, String d3b_fb_finance_lease, String d4b_fb_oper_lease, String d5b_fb_loans,
			String d6b_fb_factoring, String d7b_fb_others, String d8b_lending_non_fund_based, String d9b_credit_cards,
			String d10b_merchang_pos, String d11b_other_prod_services, String d12b_retirement_saving_schemes,
			String c1c_dep_tkg_services_nbtdi, String c2c_lend_fund_based_nbtdi, String c3c_fb_finance_lease_nbtdi,
			String c4c_fb_oper_lease_nbtdi, String c5c_fb_loans_nbtdi, String c6c_fb_factoring_nbtdi,
			String c7c_fb_others_nbtdi, String c8c_lending_non_fund_based_nbtdi, String c9c_credit_cards_nbtdi,
			String c10c_merchang_pos_nbtdi, String c11c_other_prod_services_nbtdi,
			String c12c_retirement_saving_schemes_nbtdi, String c1d_dep_tkg_services_offer_ftf,
			String c2d_lend_fund_based_offer_ftf, String c3d_fb_finance_lease_offer_ftf,
			String c4d_fb_oper_lease_offer_ftf, String c5d_fb_loans_offer_ftf, String c6d_fb_factoring_offer_ftf,
			String c7d_fb_others_offer_ftf, String c8d_lending_non_fund_based_offer_ftf,
			String c9d_credit_cards_offer_ftf, String c10d_merchang_pos_offer_ftf,
			String c11d_other_prod_services_offer_ftf, String c12d_retirement_saving_schemes_offer_ftf,
			String c1e_dep_tkg_services_offer_nftf, String c2e_lend_fund_based_offer_nftf,
			String c3e_fb_finance_lease_offer_nftf, String c4e_fb_oper_lease_offer_nftf, String c5e_fb_loans_offer_nftf,
			String c6e_fb_factoring_offer_nftf, String c7e_fb_others_offer_nftf,
			String c8e_lending_non_fund_based_offer_nftf, String c9e_credit_cards_offer_nftf,
			String c10e_merchang_pos_offer_nftf, String c11e_other_prod_services_offer_nftf,
			String c12e_retirement_saving_schemes_offer_nftf, String c1f_dep_tkg_services_offer_tp,
			String c2f_lend_fund_based_offer_tp, String c3f_fb_finance_lease_offer_tp,
			String c4f_fb_oper_lease_offer_tp, String c5f_fb_loans_offer_tp, String c6f_fb_factoring_offer_tp,
			String c7f_fb_others_offer_tp, String c8f_lending_non_fund_based_offer_tp, String c9f_credit_cards_offer_tp,
			String c10f_merchang_pos_offer_tp, String c11f_other_prod_services_offer_tp,
			String c12f_retirement_saving_schemes_offer_tp, Character qtr_flg, Character entity_flg, Character del_flg,
			Character modify_flg, Date entry_date, Date modify_date, Date verify_date, String entry_user,
			String modify_user, String verify_user, String report_code, String report_name, Date report_date,
			Character arch_flg) {
		super();
		this.d1a_dep_tkg_services = d1a_dep_tkg_services;
		this.d2a_lend_fund_based = d2a_lend_fund_based;
		this.d3a_fb_finance_lease = d3a_fb_finance_lease;
		this.d4a_fb_oper_lease = d4a_fb_oper_lease;
		this.d5a_fb_loans = d5a_fb_loans;
		this.d6a_fb_factoring = d6a_fb_factoring;
		this.d7a_fb_others = d7a_fb_others;
		this.d8a_lending_non_fund_based = d8a_lending_non_fund_based;
		this.d9a_credit_cards = d9a_credit_cards;
		this.d10a_merchang_pos = d10a_merchang_pos;
		this.d11a_other_prod_services = d11a_other_prod_services;
		this.d12a_retirement_saving_schemes = d12a_retirement_saving_schemes;
		this.d1b_dep_tkg_services = d1b_dep_tkg_services;
		this.d2b_lend_fund_based = d2b_lend_fund_based;
		this.d3b_fb_finance_lease = d3b_fb_finance_lease;
		this.d4b_fb_oper_lease = d4b_fb_oper_lease;
		this.d5b_fb_loans = d5b_fb_loans;
		this.d6b_fb_factoring = d6b_fb_factoring;
		this.d7b_fb_others = d7b_fb_others;
		this.d8b_lending_non_fund_based = d8b_lending_non_fund_based;
		this.d9b_credit_cards = d9b_credit_cards;
		this.d10b_merchang_pos = d10b_merchang_pos;
		this.d11b_other_prod_services = d11b_other_prod_services;
		this.d12b_retirement_saving_schemes = d12b_retirement_saving_schemes;
		this.c1c_dep_tkg_services_nbtdi = c1c_dep_tkg_services_nbtdi;
		this.c2c_lend_fund_based_nbtdi = c2c_lend_fund_based_nbtdi;
		this.c3c_fb_finance_lease_nbtdi = c3c_fb_finance_lease_nbtdi;
		this.c4c_fb_oper_lease_nbtdi = c4c_fb_oper_lease_nbtdi;
		this.c5c_fb_loans_nbtdi = c5c_fb_loans_nbtdi;
		this.c6c_fb_factoring_nbtdi = c6c_fb_factoring_nbtdi;
		this.c7c_fb_others_nbtdi = c7c_fb_others_nbtdi;
		this.c8c_lending_non_fund_based_nbtdi = c8c_lending_non_fund_based_nbtdi;
		this.c9c_credit_cards_nbtdi = c9c_credit_cards_nbtdi;
		this.c10c_merchang_pos_nbtdi = c10c_merchang_pos_nbtdi;
		this.c11c_other_prod_services_nbtdi = c11c_other_prod_services_nbtdi;
		this.c12c_retirement_saving_schemes_nbtdi = c12c_retirement_saving_schemes_nbtdi;
		this.c1d_dep_tkg_services_offer_ftf = c1d_dep_tkg_services_offer_ftf;
		this.c2d_lend_fund_based_offer_ftf = c2d_lend_fund_based_offer_ftf;
		this.c3d_fb_finance_lease_offer_ftf = c3d_fb_finance_lease_offer_ftf;
		this.c4d_fb_oper_lease_offer_ftf = c4d_fb_oper_lease_offer_ftf;
		this.c5d_fb_loans_offer_ftf = c5d_fb_loans_offer_ftf;
		this.c6d_fb_factoring_offer_ftf = c6d_fb_factoring_offer_ftf;
		this.c7d_fb_others_offer_ftf = c7d_fb_others_offer_ftf;
		this.c8d_lending_non_fund_based_offer_ftf = c8d_lending_non_fund_based_offer_ftf;
		this.c9d_credit_cards_offer_ftf = c9d_credit_cards_offer_ftf;
		this.c10d_merchang_pos_offer_ftf = c10d_merchang_pos_offer_ftf;
		this.c11d_other_prod_services_offer_ftf = c11d_other_prod_services_offer_ftf;
		this.c12d_retirement_saving_schemes_offer_ftf = c12d_retirement_saving_schemes_offer_ftf;
		this.c1e_dep_tkg_services_offer_nftf = c1e_dep_tkg_services_offer_nftf;
		this.c2e_lend_fund_based_offer_nftf = c2e_lend_fund_based_offer_nftf;
		this.c3e_fb_finance_lease_offer_nftf = c3e_fb_finance_lease_offer_nftf;
		this.c4e_fb_oper_lease_offer_nftf = c4e_fb_oper_lease_offer_nftf;
		this.c5e_fb_loans_offer_nftf = c5e_fb_loans_offer_nftf;
		this.c6e_fb_factoring_offer_nftf = c6e_fb_factoring_offer_nftf;
		this.c7e_fb_others_offer_nftf = c7e_fb_others_offer_nftf;
		this.c8e_lending_non_fund_based_offer_nftf = c8e_lending_non_fund_based_offer_nftf;
		this.c9e_credit_cards_offer_nftf = c9e_credit_cards_offer_nftf;
		this.c10e_merchang_pos_offer_nftf = c10e_merchang_pos_offer_nftf;
		this.c11e_other_prod_services_offer_nftf = c11e_other_prod_services_offer_nftf;
		this.c12e_retirement_saving_schemes_offer_nftf = c12e_retirement_saving_schemes_offer_nftf;
		this.c1f_dep_tkg_services_offer_tp = c1f_dep_tkg_services_offer_tp;
		this.c2f_lend_fund_based_offer_tp = c2f_lend_fund_based_offer_tp;
		this.c3f_fb_finance_lease_offer_tp = c3f_fb_finance_lease_offer_tp;
		this.c4f_fb_oper_lease_offer_tp = c4f_fb_oper_lease_offer_tp;
		this.c5f_fb_loans_offer_tp = c5f_fb_loans_offer_tp;
		this.c6f_fb_factoring_offer_tp = c6f_fb_factoring_offer_tp;
		this.c7f_fb_others_offer_tp = c7f_fb_others_offer_tp;
		this.c8f_lending_non_fund_based_offer_tp = c8f_lending_non_fund_based_offer_tp;
		this.c9f_credit_cards_offer_tp = c9f_credit_cards_offer_tp;
		this.c10f_merchang_pos_offer_tp = c10f_merchang_pos_offer_tp;
		this.c11f_other_prod_services_offer_tp = c11f_other_prod_services_offer_tp;
		this.c12f_retirement_saving_schemes_offer_tp = c12f_retirement_saving_schemes_offer_tp;
		this.qtr_flg = qtr_flg;
		this.entity_flg = entity_flg;
		this.del_flg = del_flg;
		this.modify_flg = modify_flg;
		this.entry_date = entry_date;
		this.modify_date = modify_date;
		this.verify_date = verify_date;
		this.entry_user = entry_user;
		this.modify_user = modify_user;
		this.verify_user = verify_user;
		this.report_code = report_code;
		this.report_name = report_name;
		this.report_date = report_date;
		this.arch_flg = arch_flg;
	}
	public T1MasterProdDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
}