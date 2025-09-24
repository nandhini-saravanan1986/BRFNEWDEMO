package com.bornfire.brf.entities;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "BRRS_M_SRWA_12A_SUMMARYTABLE7")


public class M_SRWA_12A_Summary_Entity7 {
	
	
   
	private String	r247_exposure_class_off_bal;
	private BigDecimal	r247_nom_pri_amt;
	private BigDecimal	r247_ccf;
	private BigDecimal	r247_cea;
	private BigDecimal	r247_cea_elig_coun_bilt_net;
	private BigDecimal	r247_cea_aft_net;
	private BigDecimal	r247_crm_sub_app_cea_elig;
	private BigDecimal	r247_crm_sub_app_non_col_guar_elig;
	private BigDecimal	r247_crm_sub_app_non_col_cre_der;
	private BigDecimal	r247_crm_sub_app_col_elig_cash;
	private BigDecimal	r247_crm_sub_app_col_elig_tre_bills;
	private BigDecimal	r247_crm_sub_app_col_elig_deb_sec;
	private BigDecimal	r247_crm_sub_app_col_elig_euiq;
	private BigDecimal	r247_crm_sub_app_col_elig_uni_tru;
	private BigDecimal	r247_crm_sub_app_col_cea_cov;
	private BigDecimal	r247_crm_sub_app_col_cea_not_cov;
	private BigDecimal	r247_crm_sub_app_rwa_ris_wei_crm;
	private BigDecimal	r247_crm_sub_app_rwa_ris_cea_cov;
	private BigDecimal	r247_crm_sub_app_rwa_appl_org_coun;
	private BigDecimal	r247_crm_sub_app_rwa_ris_cea_not_cov;
	private BigDecimal	r247_crm_com_app_col_cea_elig_crm;
	private BigDecimal	r247_crm_com_app_col_elig_cea_vol_adj;
	private BigDecimal	r247_crm_com_app_col_elig_fin_hai;
	private BigDecimal	r247_crm_com_app_col_cea_val_aft_crm;
	private BigDecimal	r247_rwa_elig_cea_not_cov;
	private BigDecimal	r247_rwa_unsec_cea_sub_cre_ris;
	private BigDecimal	r247_rwa_unsec_cea;
	private BigDecimal	r247_rwa_tot_ris_wei_ass;
		
	private String	r248_exposure_class_off_bal;
	private BigDecimal	r248_nom_pri_amt;
	private BigDecimal	r248_ccf;
	private BigDecimal	r248_cea;
	private BigDecimal	r248_cea_elig_coun_bilt_net;
	private BigDecimal	r248_cea_aft_net;
	private BigDecimal	r248_crm_sub_app_cea_elig;
	private BigDecimal	r248_crm_sub_app_non_col_guar_elig;
	private BigDecimal	r248_crm_sub_app_non_col_cre_der;
	private BigDecimal	r248_crm_sub_app_col_elig_cash;
	private BigDecimal	r248_crm_sub_app_col_elig_tre_bills;
	private BigDecimal	r248_crm_sub_app_col_elig_deb_sec;
	private BigDecimal	r248_crm_sub_app_col_elig_euiq;
	private BigDecimal	r248_crm_sub_app_col_elig_uni_tru;
	private BigDecimal	r248_crm_sub_app_col_cea_cov;
	private BigDecimal	r248_crm_sub_app_col_cea_not_cov;
	private BigDecimal	r248_crm_sub_app_rwa_ris_wei_crm;
	private BigDecimal	r248_crm_sub_app_rwa_ris_cea_cov;
	private BigDecimal	r248_crm_sub_app_rwa_appl_org_coun;
	private BigDecimal	r248_crm_sub_app_rwa_ris_cea_not_cov;
	private BigDecimal	r248_crm_com_app_col_cea_elig_crm;
	private BigDecimal	r248_crm_com_app_col_elig_cea_vol_adj;
	private BigDecimal	r248_crm_com_app_col_elig_fin_hai;
	private BigDecimal	r248_crm_com_app_col_cea_val_aft_crm;
	private BigDecimal	r248_rwa_elig_cea_not_cov;
	private BigDecimal	r248_rwa_unsec_cea_sub_cre_ris;
	private BigDecimal	r248_rwa_unsec_cea;
	private BigDecimal	r248_rwa_tot_ris_wei_ass;
		
	private String	r249_exposure_class_off_bal;
	private BigDecimal	r249_nom_pri_amt;
	private BigDecimal	r249_ccf;
	private BigDecimal	r249_cea;
	private BigDecimal	r249_cea_elig_coun_bilt_net;
	private BigDecimal	r249_cea_aft_net;
	private BigDecimal	r249_crm_sub_app_cea_elig;
	private BigDecimal	r249_crm_sub_app_non_col_guar_elig;
	private BigDecimal	r249_crm_sub_app_non_col_cre_der;
	private BigDecimal	r249_crm_sub_app_col_elig_cash;
	private BigDecimal	r249_crm_sub_app_col_elig_tre_bills;
	private BigDecimal	r249_crm_sub_app_col_elig_deb_sec;
	private BigDecimal	r249_crm_sub_app_col_elig_euiq;
	private BigDecimal	r249_crm_sub_app_col_elig_uni_tru;
	private BigDecimal	r249_crm_sub_app_col_cea_cov;
	private BigDecimal	r249_crm_sub_app_col_cea_not_cov;
	private BigDecimal	r249_crm_sub_app_rwa_ris_wei_crm;
	private BigDecimal	r249_crm_sub_app_rwa_ris_cea_cov;
	private BigDecimal	r249_crm_sub_app_rwa_appl_org_coun;
	private BigDecimal	r249_crm_sub_app_rwa_ris_cea_not_cov;
	private BigDecimal	r249_crm_com_app_col_cea_elig_crm;
	private BigDecimal	r249_crm_com_app_col_elig_cea_vol_adj;
	private BigDecimal	r249_crm_com_app_col_elig_fin_hai;
	private BigDecimal	r249_crm_com_app_col_cea_val_aft_crm;
	private BigDecimal	r249_rwa_elig_cea_not_cov;
	private BigDecimal	r249_rwa_unsec_cea_sub_cre_ris;
	private BigDecimal	r249_rwa_unsec_cea;
	private BigDecimal	r249_rwa_tot_ris_wei_ass;
		
	private String	r250_exposure_class_off_bal;
	private BigDecimal	r250_nom_pri_amt;
	private BigDecimal	r250_ccf;
	private BigDecimal	r250_cea;
	private BigDecimal	r250_cea_elig_coun_bilt_net;
	private BigDecimal	r250_cea_aft_net;
	private BigDecimal	r250_crm_sub_app_cea_elig;
	private BigDecimal	r250_crm_sub_app_non_col_guar_elig;
	private BigDecimal	r250_crm_sub_app_non_col_cre_der;
	private BigDecimal	r250_crm_sub_app_col_elig_cash;
	private BigDecimal	r250_crm_sub_app_col_elig_tre_bills;
	private BigDecimal	r250_crm_sub_app_col_elig_deb_sec;
	private BigDecimal	r250_crm_sub_app_col_elig_euiq;
	private BigDecimal	r250_crm_sub_app_col_elig_uni_tru;
	private BigDecimal	r250_crm_sub_app_col_cea_cov;
	private BigDecimal	r250_crm_sub_app_col_cea_not_cov;
	private BigDecimal	r250_crm_sub_app_rwa_ris_wei_crm;
	private BigDecimal	r250_crm_sub_app_rwa_ris_cea_cov;
	private BigDecimal	r250_crm_sub_app_rwa_appl_org_coun;
	private BigDecimal	r250_crm_sub_app_rwa_ris_cea_not_cov;
	private BigDecimal	r250_crm_com_app_col_cea_elig_crm;
	private BigDecimal	r250_crm_com_app_col_elig_cea_vol_adj;
	private BigDecimal	r250_crm_com_app_col_elig_fin_hai;
	private BigDecimal	r250_crm_com_app_col_cea_val_aft_crm;
	private BigDecimal	r250_rwa_elig_cea_not_cov;
	private BigDecimal	r250_rwa_unsec_cea_sub_cre_ris;
	private BigDecimal	r250_rwa_unsec_cea;
	private BigDecimal	r250_rwa_tot_ris_wei_ass;
		
	private String	r251_exposure_class_off_bal;
	private BigDecimal	r251_rwa_tot_ris_wei_ass;
		
	private String	r252_exposure_class_off_bal;
	private BigDecimal	r252_rwa_tot_ris_wei_ass;
		
	private String	r253_exposure_class_off_bal;
	private BigDecimal	r253_nom_pri_amt;
	private BigDecimal	r253_ccf;
	private BigDecimal	r253_cea;
	private BigDecimal	r253_cea_elig_coun_bilt_net;
	private BigDecimal	r253_cea_aft_net;
	private BigDecimal	r253_crm_sub_app_cea_elig;
	private BigDecimal	r253_crm_sub_app_non_col_guar_elig;
	private BigDecimal	r253_crm_sub_app_non_col_cre_der;
	private BigDecimal	r253_crm_sub_app_col_elig_cash;
	private BigDecimal	r253_crm_sub_app_col_elig_tre_bills;
	private BigDecimal	r253_crm_sub_app_col_elig_deb_sec;
	private BigDecimal	r253_crm_sub_app_col_elig_euiq;
	private BigDecimal	r253_crm_sub_app_col_elig_uni_tru;
	private BigDecimal	r253_crm_sub_app_col_cea_cov;
	private BigDecimal	r253_crm_sub_app_col_cea_not_cov;
	private BigDecimal	r253_crm_sub_app_rwa_ris_wei_crm;
	private BigDecimal	r253_crm_sub_app_rwa_ris_cea_cov;
	private BigDecimal	r253_crm_sub_app_rwa_appl_org_coun;
	private BigDecimal	r253_crm_sub_app_rwa_ris_cea_not_cov;
	private BigDecimal	r253_crm_com_app_col_cea_elig_crm;
	private BigDecimal	r253_crm_com_app_col_elig_cea_vol_adj;
	private BigDecimal	r253_crm_com_app_col_elig_fin_hai;
	private BigDecimal	r253_crm_com_app_col_cea_val_aft_crm;
	private BigDecimal	r253_rwa_elig_cea_not_cov;
	private BigDecimal	r253_rwa_unsec_cea_sub_cre_ris;
	private BigDecimal	r253_rwa_unsec_cea;
	private BigDecimal	r253_rwa_tot_ris_wei_ass;
		
	private String	r254_exposure_class_off_bal;
	private BigDecimal	r254_rwa_tot_ris_wei_ass;

	
	
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	
	
	private Date	report_date;
	private String	report_version;
	private String	report_frequency;
	private String	report_code;
	private String	report_desc;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	public String getR247_exposure_class_off_bal() {
		return r247_exposure_class_off_bal;
	}
	public void setR247_exposure_class_off_bal(String r247_exposure_class_off_bal) {
		this.r247_exposure_class_off_bal = r247_exposure_class_off_bal;
	}
	public BigDecimal getR247_nom_pri_amt() {
		return r247_nom_pri_amt;
	}
	public void setR247_nom_pri_amt(BigDecimal r247_nom_pri_amt) {
		this.r247_nom_pri_amt = r247_nom_pri_amt;
	}
	public BigDecimal getR247_ccf() {
		return r247_ccf;
	}
	public void setR247_ccf(BigDecimal r247_ccf) {
		this.r247_ccf = r247_ccf;
	}
	public BigDecimal getR247_cea() {
		return r247_cea;
	}
	public void setR247_cea(BigDecimal r247_cea) {
		this.r247_cea = r247_cea;
	}
	public BigDecimal getR247_cea_elig_coun_bilt_net() {
		return r247_cea_elig_coun_bilt_net;
	}
	public void setR247_cea_elig_coun_bilt_net(BigDecimal r247_cea_elig_coun_bilt_net) {
		this.r247_cea_elig_coun_bilt_net = r247_cea_elig_coun_bilt_net;
	}
	public BigDecimal getR247_cea_aft_net() {
		return r247_cea_aft_net;
	}
	public void setR247_cea_aft_net(BigDecimal r247_cea_aft_net) {
		this.r247_cea_aft_net = r247_cea_aft_net;
	}
	public BigDecimal getR247_crm_sub_app_cea_elig() {
		return r247_crm_sub_app_cea_elig;
	}
	public void setR247_crm_sub_app_cea_elig(BigDecimal r247_crm_sub_app_cea_elig) {
		this.r247_crm_sub_app_cea_elig = r247_crm_sub_app_cea_elig;
	}
	public BigDecimal getR247_crm_sub_app_non_col_guar_elig() {
		return r247_crm_sub_app_non_col_guar_elig;
	}
	public void setR247_crm_sub_app_non_col_guar_elig(BigDecimal r247_crm_sub_app_non_col_guar_elig) {
		this.r247_crm_sub_app_non_col_guar_elig = r247_crm_sub_app_non_col_guar_elig;
	}
	public BigDecimal getR247_crm_sub_app_non_col_cre_der() {
		return r247_crm_sub_app_non_col_cre_der;
	}
	public void setR247_crm_sub_app_non_col_cre_der(BigDecimal r247_crm_sub_app_non_col_cre_der) {
		this.r247_crm_sub_app_non_col_cre_der = r247_crm_sub_app_non_col_cre_der;
	}
	public BigDecimal getR247_crm_sub_app_col_elig_cash() {
		return r247_crm_sub_app_col_elig_cash;
	}
	public void setR247_crm_sub_app_col_elig_cash(BigDecimal r247_crm_sub_app_col_elig_cash) {
		this.r247_crm_sub_app_col_elig_cash = r247_crm_sub_app_col_elig_cash;
	}
	public BigDecimal getR247_crm_sub_app_col_elig_tre_bills() {
		return r247_crm_sub_app_col_elig_tre_bills;
	}
	public void setR247_crm_sub_app_col_elig_tre_bills(BigDecimal r247_crm_sub_app_col_elig_tre_bills) {
		this.r247_crm_sub_app_col_elig_tre_bills = r247_crm_sub_app_col_elig_tre_bills;
	}
	public BigDecimal getR247_crm_sub_app_col_elig_deb_sec() {
		return r247_crm_sub_app_col_elig_deb_sec;
	}
	public void setR247_crm_sub_app_col_elig_deb_sec(BigDecimal r247_crm_sub_app_col_elig_deb_sec) {
		this.r247_crm_sub_app_col_elig_deb_sec = r247_crm_sub_app_col_elig_deb_sec;
	}
	public BigDecimal getR247_crm_sub_app_col_elig_euiq() {
		return r247_crm_sub_app_col_elig_euiq;
	}
	public void setR247_crm_sub_app_col_elig_euiq(BigDecimal r247_crm_sub_app_col_elig_euiq) {
		this.r247_crm_sub_app_col_elig_euiq = r247_crm_sub_app_col_elig_euiq;
	}
	public BigDecimal getR247_crm_sub_app_col_elig_uni_tru() {
		return r247_crm_sub_app_col_elig_uni_tru;
	}
	public void setR247_crm_sub_app_col_elig_uni_tru(BigDecimal r247_crm_sub_app_col_elig_uni_tru) {
		this.r247_crm_sub_app_col_elig_uni_tru = r247_crm_sub_app_col_elig_uni_tru;
	}
	public BigDecimal getR247_crm_sub_app_col_cea_cov() {
		return r247_crm_sub_app_col_cea_cov;
	}
	public void setR247_crm_sub_app_col_cea_cov(BigDecimal r247_crm_sub_app_col_cea_cov) {
		this.r247_crm_sub_app_col_cea_cov = r247_crm_sub_app_col_cea_cov;
	}
	public BigDecimal getR247_crm_sub_app_col_cea_not_cov() {
		return r247_crm_sub_app_col_cea_not_cov;
	}
	public void setR247_crm_sub_app_col_cea_not_cov(BigDecimal r247_crm_sub_app_col_cea_not_cov) {
		this.r247_crm_sub_app_col_cea_not_cov = r247_crm_sub_app_col_cea_not_cov;
	}
	public BigDecimal getR247_crm_sub_app_rwa_ris_wei_crm() {
		return r247_crm_sub_app_rwa_ris_wei_crm;
	}
	public void setR247_crm_sub_app_rwa_ris_wei_crm(BigDecimal r247_crm_sub_app_rwa_ris_wei_crm) {
		this.r247_crm_sub_app_rwa_ris_wei_crm = r247_crm_sub_app_rwa_ris_wei_crm;
	}
	public BigDecimal getR247_crm_sub_app_rwa_ris_cea_cov() {
		return r247_crm_sub_app_rwa_ris_cea_cov;
	}
	public void setR247_crm_sub_app_rwa_ris_cea_cov(BigDecimal r247_crm_sub_app_rwa_ris_cea_cov) {
		this.r247_crm_sub_app_rwa_ris_cea_cov = r247_crm_sub_app_rwa_ris_cea_cov;
	}
	public BigDecimal getR247_crm_sub_app_rwa_appl_org_coun() {
		return r247_crm_sub_app_rwa_appl_org_coun;
	}
	public void setR247_crm_sub_app_rwa_appl_org_coun(BigDecimal r247_crm_sub_app_rwa_appl_org_coun) {
		this.r247_crm_sub_app_rwa_appl_org_coun = r247_crm_sub_app_rwa_appl_org_coun;
	}
	public BigDecimal getR247_crm_sub_app_rwa_ris_cea_not_cov() {
		return r247_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public void setR247_crm_sub_app_rwa_ris_cea_not_cov(BigDecimal r247_crm_sub_app_rwa_ris_cea_not_cov) {
		this.r247_crm_sub_app_rwa_ris_cea_not_cov = r247_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public BigDecimal getR247_crm_com_app_col_cea_elig_crm() {
		return r247_crm_com_app_col_cea_elig_crm;
	}
	public void setR247_crm_com_app_col_cea_elig_crm(BigDecimal r247_crm_com_app_col_cea_elig_crm) {
		this.r247_crm_com_app_col_cea_elig_crm = r247_crm_com_app_col_cea_elig_crm;
	}
	public BigDecimal getR247_crm_com_app_col_elig_cea_vol_adj() {
		return r247_crm_com_app_col_elig_cea_vol_adj;
	}
	public void setR247_crm_com_app_col_elig_cea_vol_adj(BigDecimal r247_crm_com_app_col_elig_cea_vol_adj) {
		this.r247_crm_com_app_col_elig_cea_vol_adj = r247_crm_com_app_col_elig_cea_vol_adj;
	}
	public BigDecimal getR247_crm_com_app_col_elig_fin_hai() {
		return r247_crm_com_app_col_elig_fin_hai;
	}
	public void setR247_crm_com_app_col_elig_fin_hai(BigDecimal r247_crm_com_app_col_elig_fin_hai) {
		this.r247_crm_com_app_col_elig_fin_hai = r247_crm_com_app_col_elig_fin_hai;
	}
	public BigDecimal getR247_crm_com_app_col_cea_val_aft_crm() {
		return r247_crm_com_app_col_cea_val_aft_crm;
	}
	public void setR247_crm_com_app_col_cea_val_aft_crm(BigDecimal r247_crm_com_app_col_cea_val_aft_crm) {
		this.r247_crm_com_app_col_cea_val_aft_crm = r247_crm_com_app_col_cea_val_aft_crm;
	}
	public BigDecimal getR247_rwa_elig_cea_not_cov() {
		return r247_rwa_elig_cea_not_cov;
	}
	public void setR247_rwa_elig_cea_not_cov(BigDecimal r247_rwa_elig_cea_not_cov) {
		this.r247_rwa_elig_cea_not_cov = r247_rwa_elig_cea_not_cov;
	}
	public BigDecimal getR247_rwa_unsec_cea_sub_cre_ris() {
		return r247_rwa_unsec_cea_sub_cre_ris;
	}
	public void setR247_rwa_unsec_cea_sub_cre_ris(BigDecimal r247_rwa_unsec_cea_sub_cre_ris) {
		this.r247_rwa_unsec_cea_sub_cre_ris = r247_rwa_unsec_cea_sub_cre_ris;
	}
	public BigDecimal getR247_rwa_unsec_cea() {
		return r247_rwa_unsec_cea;
	}
	public void setR247_rwa_unsec_cea(BigDecimal r247_rwa_unsec_cea) {
		this.r247_rwa_unsec_cea = r247_rwa_unsec_cea;
	}
	public BigDecimal getR247_rwa_tot_ris_wei_ass() {
		return r247_rwa_tot_ris_wei_ass;
	}
	public void setR247_rwa_tot_ris_wei_ass(BigDecimal r247_rwa_tot_ris_wei_ass) {
		this.r247_rwa_tot_ris_wei_ass = r247_rwa_tot_ris_wei_ass;
	}
	public String getR248_exposure_class_off_bal() {
		return r248_exposure_class_off_bal;
	}
	public void setR248_exposure_class_off_bal(String r248_exposure_class_off_bal) {
		this.r248_exposure_class_off_bal = r248_exposure_class_off_bal;
	}
	public BigDecimal getR248_nom_pri_amt() {
		return r248_nom_pri_amt;
	}
	public void setR248_nom_pri_amt(BigDecimal r248_nom_pri_amt) {
		this.r248_nom_pri_amt = r248_nom_pri_amt;
	}
	public BigDecimal getR248_ccf() {
		return r248_ccf;
	}
	public void setR248_ccf(BigDecimal r248_ccf) {
		this.r248_ccf = r248_ccf;
	}
	public BigDecimal getR248_cea() {
		return r248_cea;
	}
	public void setR248_cea(BigDecimal r248_cea) {
		this.r248_cea = r248_cea;
	}
	public BigDecimal getR248_cea_elig_coun_bilt_net() {
		return r248_cea_elig_coun_bilt_net;
	}
	public void setR248_cea_elig_coun_bilt_net(BigDecimal r248_cea_elig_coun_bilt_net) {
		this.r248_cea_elig_coun_bilt_net = r248_cea_elig_coun_bilt_net;
	}
	public BigDecimal getR248_cea_aft_net() {
		return r248_cea_aft_net;
	}
	public void setR248_cea_aft_net(BigDecimal r248_cea_aft_net) {
		this.r248_cea_aft_net = r248_cea_aft_net;
	}
	public BigDecimal getR248_crm_sub_app_cea_elig() {
		return r248_crm_sub_app_cea_elig;
	}
	public void setR248_crm_sub_app_cea_elig(BigDecimal r248_crm_sub_app_cea_elig) {
		this.r248_crm_sub_app_cea_elig = r248_crm_sub_app_cea_elig;
	}
	public BigDecimal getR248_crm_sub_app_non_col_guar_elig() {
		return r248_crm_sub_app_non_col_guar_elig;
	}
	public void setR248_crm_sub_app_non_col_guar_elig(BigDecimal r248_crm_sub_app_non_col_guar_elig) {
		this.r248_crm_sub_app_non_col_guar_elig = r248_crm_sub_app_non_col_guar_elig;
	}
	public BigDecimal getR248_crm_sub_app_non_col_cre_der() {
		return r248_crm_sub_app_non_col_cre_der;
	}
	public void setR248_crm_sub_app_non_col_cre_der(BigDecimal r248_crm_sub_app_non_col_cre_der) {
		this.r248_crm_sub_app_non_col_cre_der = r248_crm_sub_app_non_col_cre_der;
	}
	public BigDecimal getR248_crm_sub_app_col_elig_cash() {
		return r248_crm_sub_app_col_elig_cash;
	}
	public void setR248_crm_sub_app_col_elig_cash(BigDecimal r248_crm_sub_app_col_elig_cash) {
		this.r248_crm_sub_app_col_elig_cash = r248_crm_sub_app_col_elig_cash;
	}
	public BigDecimal getR248_crm_sub_app_col_elig_tre_bills() {
		return r248_crm_sub_app_col_elig_tre_bills;
	}
	public void setR248_crm_sub_app_col_elig_tre_bills(BigDecimal r248_crm_sub_app_col_elig_tre_bills) {
		this.r248_crm_sub_app_col_elig_tre_bills = r248_crm_sub_app_col_elig_tre_bills;
	}
	public BigDecimal getR248_crm_sub_app_col_elig_deb_sec() {
		return r248_crm_sub_app_col_elig_deb_sec;
	}
	public void setR248_crm_sub_app_col_elig_deb_sec(BigDecimal r248_crm_sub_app_col_elig_deb_sec) {
		this.r248_crm_sub_app_col_elig_deb_sec = r248_crm_sub_app_col_elig_deb_sec;
	}
	public BigDecimal getR248_crm_sub_app_col_elig_euiq() {
		return r248_crm_sub_app_col_elig_euiq;
	}
	public void setR248_crm_sub_app_col_elig_euiq(BigDecimal r248_crm_sub_app_col_elig_euiq) {
		this.r248_crm_sub_app_col_elig_euiq = r248_crm_sub_app_col_elig_euiq;
	}
	public BigDecimal getR248_crm_sub_app_col_elig_uni_tru() {
		return r248_crm_sub_app_col_elig_uni_tru;
	}
	public void setR248_crm_sub_app_col_elig_uni_tru(BigDecimal r248_crm_sub_app_col_elig_uni_tru) {
		this.r248_crm_sub_app_col_elig_uni_tru = r248_crm_sub_app_col_elig_uni_tru;
	}
	public BigDecimal getR248_crm_sub_app_col_cea_cov() {
		return r248_crm_sub_app_col_cea_cov;
	}
	public void setR248_crm_sub_app_col_cea_cov(BigDecimal r248_crm_sub_app_col_cea_cov) {
		this.r248_crm_sub_app_col_cea_cov = r248_crm_sub_app_col_cea_cov;
	}
	public BigDecimal getR248_crm_sub_app_col_cea_not_cov() {
		return r248_crm_sub_app_col_cea_not_cov;
	}
	public void setR248_crm_sub_app_col_cea_not_cov(BigDecimal r248_crm_sub_app_col_cea_not_cov) {
		this.r248_crm_sub_app_col_cea_not_cov = r248_crm_sub_app_col_cea_not_cov;
	}
	public BigDecimal getR248_crm_sub_app_rwa_ris_wei_crm() {
		return r248_crm_sub_app_rwa_ris_wei_crm;
	}
	public void setR248_crm_sub_app_rwa_ris_wei_crm(BigDecimal r248_crm_sub_app_rwa_ris_wei_crm) {
		this.r248_crm_sub_app_rwa_ris_wei_crm = r248_crm_sub_app_rwa_ris_wei_crm;
	}
	public BigDecimal getR248_crm_sub_app_rwa_ris_cea_cov() {
		return r248_crm_sub_app_rwa_ris_cea_cov;
	}
	public void setR248_crm_sub_app_rwa_ris_cea_cov(BigDecimal r248_crm_sub_app_rwa_ris_cea_cov) {
		this.r248_crm_sub_app_rwa_ris_cea_cov = r248_crm_sub_app_rwa_ris_cea_cov;
	}
	public BigDecimal getR248_crm_sub_app_rwa_appl_org_coun() {
		return r248_crm_sub_app_rwa_appl_org_coun;
	}
	public void setR248_crm_sub_app_rwa_appl_org_coun(BigDecimal r248_crm_sub_app_rwa_appl_org_coun) {
		this.r248_crm_sub_app_rwa_appl_org_coun = r248_crm_sub_app_rwa_appl_org_coun;
	}
	public BigDecimal getR248_crm_sub_app_rwa_ris_cea_not_cov() {
		return r248_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public void setR248_crm_sub_app_rwa_ris_cea_not_cov(BigDecimal r248_crm_sub_app_rwa_ris_cea_not_cov) {
		this.r248_crm_sub_app_rwa_ris_cea_not_cov = r248_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public BigDecimal getR248_crm_com_app_col_cea_elig_crm() {
		return r248_crm_com_app_col_cea_elig_crm;
	}
	public void setR248_crm_com_app_col_cea_elig_crm(BigDecimal r248_crm_com_app_col_cea_elig_crm) {
		this.r248_crm_com_app_col_cea_elig_crm = r248_crm_com_app_col_cea_elig_crm;
	}
	public BigDecimal getR248_crm_com_app_col_elig_cea_vol_adj() {
		return r248_crm_com_app_col_elig_cea_vol_adj;
	}
	public void setR248_crm_com_app_col_elig_cea_vol_adj(BigDecimal r248_crm_com_app_col_elig_cea_vol_adj) {
		this.r248_crm_com_app_col_elig_cea_vol_adj = r248_crm_com_app_col_elig_cea_vol_adj;
	}
	public BigDecimal getR248_crm_com_app_col_elig_fin_hai() {
		return r248_crm_com_app_col_elig_fin_hai;
	}
	public void setR248_crm_com_app_col_elig_fin_hai(BigDecimal r248_crm_com_app_col_elig_fin_hai) {
		this.r248_crm_com_app_col_elig_fin_hai = r248_crm_com_app_col_elig_fin_hai;
	}
	public BigDecimal getR248_crm_com_app_col_cea_val_aft_crm() {
		return r248_crm_com_app_col_cea_val_aft_crm;
	}
	public void setR248_crm_com_app_col_cea_val_aft_crm(BigDecimal r248_crm_com_app_col_cea_val_aft_crm) {
		this.r248_crm_com_app_col_cea_val_aft_crm = r248_crm_com_app_col_cea_val_aft_crm;
	}
	public BigDecimal getR248_rwa_elig_cea_not_cov() {
		return r248_rwa_elig_cea_not_cov;
	}
	public void setR248_rwa_elig_cea_not_cov(BigDecimal r248_rwa_elig_cea_not_cov) {
		this.r248_rwa_elig_cea_not_cov = r248_rwa_elig_cea_not_cov;
	}
	public BigDecimal getR248_rwa_unsec_cea_sub_cre_ris() {
		return r248_rwa_unsec_cea_sub_cre_ris;
	}
	public void setR248_rwa_unsec_cea_sub_cre_ris(BigDecimal r248_rwa_unsec_cea_sub_cre_ris) {
		this.r248_rwa_unsec_cea_sub_cre_ris = r248_rwa_unsec_cea_sub_cre_ris;
	}
	public BigDecimal getR248_rwa_unsec_cea() {
		return r248_rwa_unsec_cea;
	}
	public void setR248_rwa_unsec_cea(BigDecimal r248_rwa_unsec_cea) {
		this.r248_rwa_unsec_cea = r248_rwa_unsec_cea;
	}
	public BigDecimal getR248_rwa_tot_ris_wei_ass() {
		return r248_rwa_tot_ris_wei_ass;
	}
	public void setR248_rwa_tot_ris_wei_ass(BigDecimal r248_rwa_tot_ris_wei_ass) {
		this.r248_rwa_tot_ris_wei_ass = r248_rwa_tot_ris_wei_ass;
	}
	public String getR249_exposure_class_off_bal() {
		return r249_exposure_class_off_bal;
	}
	public void setR249_exposure_class_off_bal(String r249_exposure_class_off_bal) {
		this.r249_exposure_class_off_bal = r249_exposure_class_off_bal;
	}
	public BigDecimal getR249_nom_pri_amt() {
		return r249_nom_pri_amt;
	}
	public void setR249_nom_pri_amt(BigDecimal r249_nom_pri_amt) {
		this.r249_nom_pri_amt = r249_nom_pri_amt;
	}
	public BigDecimal getR249_ccf() {
		return r249_ccf;
	}
	public void setR249_ccf(BigDecimal r249_ccf) {
		this.r249_ccf = r249_ccf;
	}
	public BigDecimal getR249_cea() {
		return r249_cea;
	}
	public void setR249_cea(BigDecimal r249_cea) {
		this.r249_cea = r249_cea;
	}
	public BigDecimal getR249_cea_elig_coun_bilt_net() {
		return r249_cea_elig_coun_bilt_net;
	}
	public void setR249_cea_elig_coun_bilt_net(BigDecimal r249_cea_elig_coun_bilt_net) {
		this.r249_cea_elig_coun_bilt_net = r249_cea_elig_coun_bilt_net;
	}
	public BigDecimal getR249_cea_aft_net() {
		return r249_cea_aft_net;
	}
	public void setR249_cea_aft_net(BigDecimal r249_cea_aft_net) {
		this.r249_cea_aft_net = r249_cea_aft_net;
	}
	public BigDecimal getR249_crm_sub_app_cea_elig() {
		return r249_crm_sub_app_cea_elig;
	}
	public void setR249_crm_sub_app_cea_elig(BigDecimal r249_crm_sub_app_cea_elig) {
		this.r249_crm_sub_app_cea_elig = r249_crm_sub_app_cea_elig;
	}
	public BigDecimal getR249_crm_sub_app_non_col_guar_elig() {
		return r249_crm_sub_app_non_col_guar_elig;
	}
	public void setR249_crm_sub_app_non_col_guar_elig(BigDecimal r249_crm_sub_app_non_col_guar_elig) {
		this.r249_crm_sub_app_non_col_guar_elig = r249_crm_sub_app_non_col_guar_elig;
	}
	public BigDecimal getR249_crm_sub_app_non_col_cre_der() {
		return r249_crm_sub_app_non_col_cre_der;
	}
	public void setR249_crm_sub_app_non_col_cre_der(BigDecimal r249_crm_sub_app_non_col_cre_der) {
		this.r249_crm_sub_app_non_col_cre_der = r249_crm_sub_app_non_col_cre_der;
	}
	public BigDecimal getR249_crm_sub_app_col_elig_cash() {
		return r249_crm_sub_app_col_elig_cash;
	}
	public void setR249_crm_sub_app_col_elig_cash(BigDecimal r249_crm_sub_app_col_elig_cash) {
		this.r249_crm_sub_app_col_elig_cash = r249_crm_sub_app_col_elig_cash;
	}
	public BigDecimal getR249_crm_sub_app_col_elig_tre_bills() {
		return r249_crm_sub_app_col_elig_tre_bills;
	}
	public void setR249_crm_sub_app_col_elig_tre_bills(BigDecimal r249_crm_sub_app_col_elig_tre_bills) {
		this.r249_crm_sub_app_col_elig_tre_bills = r249_crm_sub_app_col_elig_tre_bills;
	}
	public BigDecimal getR249_crm_sub_app_col_elig_deb_sec() {
		return r249_crm_sub_app_col_elig_deb_sec;
	}
	public void setR249_crm_sub_app_col_elig_deb_sec(BigDecimal r249_crm_sub_app_col_elig_deb_sec) {
		this.r249_crm_sub_app_col_elig_deb_sec = r249_crm_sub_app_col_elig_deb_sec;
	}
	public BigDecimal getR249_crm_sub_app_col_elig_euiq() {
		return r249_crm_sub_app_col_elig_euiq;
	}
	public void setR249_crm_sub_app_col_elig_euiq(BigDecimal r249_crm_sub_app_col_elig_euiq) {
		this.r249_crm_sub_app_col_elig_euiq = r249_crm_sub_app_col_elig_euiq;
	}
	public BigDecimal getR249_crm_sub_app_col_elig_uni_tru() {
		return r249_crm_sub_app_col_elig_uni_tru;
	}
	public void setR249_crm_sub_app_col_elig_uni_tru(BigDecimal r249_crm_sub_app_col_elig_uni_tru) {
		this.r249_crm_sub_app_col_elig_uni_tru = r249_crm_sub_app_col_elig_uni_tru;
	}
	public BigDecimal getR249_crm_sub_app_col_cea_cov() {
		return r249_crm_sub_app_col_cea_cov;
	}
	public void setR249_crm_sub_app_col_cea_cov(BigDecimal r249_crm_sub_app_col_cea_cov) {
		this.r249_crm_sub_app_col_cea_cov = r249_crm_sub_app_col_cea_cov;
	}
	public BigDecimal getR249_crm_sub_app_col_cea_not_cov() {
		return r249_crm_sub_app_col_cea_not_cov;
	}
	public void setR249_crm_sub_app_col_cea_not_cov(BigDecimal r249_crm_sub_app_col_cea_not_cov) {
		this.r249_crm_sub_app_col_cea_not_cov = r249_crm_sub_app_col_cea_not_cov;
	}
	public BigDecimal getR249_crm_sub_app_rwa_ris_wei_crm() {
		return r249_crm_sub_app_rwa_ris_wei_crm;
	}
	public void setR249_crm_sub_app_rwa_ris_wei_crm(BigDecimal r249_crm_sub_app_rwa_ris_wei_crm) {
		this.r249_crm_sub_app_rwa_ris_wei_crm = r249_crm_sub_app_rwa_ris_wei_crm;
	}
	public BigDecimal getR249_crm_sub_app_rwa_ris_cea_cov() {
		return r249_crm_sub_app_rwa_ris_cea_cov;
	}
	public void setR249_crm_sub_app_rwa_ris_cea_cov(BigDecimal r249_crm_sub_app_rwa_ris_cea_cov) {
		this.r249_crm_sub_app_rwa_ris_cea_cov = r249_crm_sub_app_rwa_ris_cea_cov;
	}
	public BigDecimal getR249_crm_sub_app_rwa_appl_org_coun() {
		return r249_crm_sub_app_rwa_appl_org_coun;
	}
	public void setR249_crm_sub_app_rwa_appl_org_coun(BigDecimal r249_crm_sub_app_rwa_appl_org_coun) {
		this.r249_crm_sub_app_rwa_appl_org_coun = r249_crm_sub_app_rwa_appl_org_coun;
	}
	public BigDecimal getR249_crm_sub_app_rwa_ris_cea_not_cov() {
		return r249_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public void setR249_crm_sub_app_rwa_ris_cea_not_cov(BigDecimal r249_crm_sub_app_rwa_ris_cea_not_cov) {
		this.r249_crm_sub_app_rwa_ris_cea_not_cov = r249_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public BigDecimal getR249_crm_com_app_col_cea_elig_crm() {
		return r249_crm_com_app_col_cea_elig_crm;
	}
	public void setR249_crm_com_app_col_cea_elig_crm(BigDecimal r249_crm_com_app_col_cea_elig_crm) {
		this.r249_crm_com_app_col_cea_elig_crm = r249_crm_com_app_col_cea_elig_crm;
	}
	public BigDecimal getR249_crm_com_app_col_elig_cea_vol_adj() {
		return r249_crm_com_app_col_elig_cea_vol_adj;
	}
	public void setR249_crm_com_app_col_elig_cea_vol_adj(BigDecimal r249_crm_com_app_col_elig_cea_vol_adj) {
		this.r249_crm_com_app_col_elig_cea_vol_adj = r249_crm_com_app_col_elig_cea_vol_adj;
	}
	public BigDecimal getR249_crm_com_app_col_elig_fin_hai() {
		return r249_crm_com_app_col_elig_fin_hai;
	}
	public void setR249_crm_com_app_col_elig_fin_hai(BigDecimal r249_crm_com_app_col_elig_fin_hai) {
		this.r249_crm_com_app_col_elig_fin_hai = r249_crm_com_app_col_elig_fin_hai;
	}
	public BigDecimal getR249_crm_com_app_col_cea_val_aft_crm() {
		return r249_crm_com_app_col_cea_val_aft_crm;
	}
	public void setR249_crm_com_app_col_cea_val_aft_crm(BigDecimal r249_crm_com_app_col_cea_val_aft_crm) {
		this.r249_crm_com_app_col_cea_val_aft_crm = r249_crm_com_app_col_cea_val_aft_crm;
	}
	public BigDecimal getR249_rwa_elig_cea_not_cov() {
		return r249_rwa_elig_cea_not_cov;
	}
	public void setR249_rwa_elig_cea_not_cov(BigDecimal r249_rwa_elig_cea_not_cov) {
		this.r249_rwa_elig_cea_not_cov = r249_rwa_elig_cea_not_cov;
	}
	public BigDecimal getR249_rwa_unsec_cea_sub_cre_ris() {
		return r249_rwa_unsec_cea_sub_cre_ris;
	}
	public void setR249_rwa_unsec_cea_sub_cre_ris(BigDecimal r249_rwa_unsec_cea_sub_cre_ris) {
		this.r249_rwa_unsec_cea_sub_cre_ris = r249_rwa_unsec_cea_sub_cre_ris;
	}
	public BigDecimal getR249_rwa_unsec_cea() {
		return r249_rwa_unsec_cea;
	}
	public void setR249_rwa_unsec_cea(BigDecimal r249_rwa_unsec_cea) {
		this.r249_rwa_unsec_cea = r249_rwa_unsec_cea;
	}
	public BigDecimal getR249_rwa_tot_ris_wei_ass() {
		return r249_rwa_tot_ris_wei_ass;
	}
	public void setR249_rwa_tot_ris_wei_ass(BigDecimal r249_rwa_tot_ris_wei_ass) {
		this.r249_rwa_tot_ris_wei_ass = r249_rwa_tot_ris_wei_ass;
	}
	public String getR250_exposure_class_off_bal() {
		return r250_exposure_class_off_bal;
	}
	public void setR250_exposure_class_off_bal(String r250_exposure_class_off_bal) {
		this.r250_exposure_class_off_bal = r250_exposure_class_off_bal;
	}
	public BigDecimal getR250_nom_pri_amt() {
		return r250_nom_pri_amt;
	}
	public void setR250_nom_pri_amt(BigDecimal r250_nom_pri_amt) {
		this.r250_nom_pri_amt = r250_nom_pri_amt;
	}
	public BigDecimal getR250_ccf() {
		return r250_ccf;
	}
	public void setR250_ccf(BigDecimal r250_ccf) {
		this.r250_ccf = r250_ccf;
	}
	public BigDecimal getR250_cea() {
		return r250_cea;
	}
	public void setR250_cea(BigDecimal r250_cea) {
		this.r250_cea = r250_cea;
	}
	public BigDecimal getR250_cea_elig_coun_bilt_net() {
		return r250_cea_elig_coun_bilt_net;
	}
	public void setR250_cea_elig_coun_bilt_net(BigDecimal r250_cea_elig_coun_bilt_net) {
		this.r250_cea_elig_coun_bilt_net = r250_cea_elig_coun_bilt_net;
	}
	public BigDecimal getR250_cea_aft_net() {
		return r250_cea_aft_net;
	}
	public void setR250_cea_aft_net(BigDecimal r250_cea_aft_net) {
		this.r250_cea_aft_net = r250_cea_aft_net;
	}
	public BigDecimal getR250_crm_sub_app_cea_elig() {
		return r250_crm_sub_app_cea_elig;
	}
	public void setR250_crm_sub_app_cea_elig(BigDecimal r250_crm_sub_app_cea_elig) {
		this.r250_crm_sub_app_cea_elig = r250_crm_sub_app_cea_elig;
	}
	public BigDecimal getR250_crm_sub_app_non_col_guar_elig() {
		return r250_crm_sub_app_non_col_guar_elig;
	}
	public void setR250_crm_sub_app_non_col_guar_elig(BigDecimal r250_crm_sub_app_non_col_guar_elig) {
		this.r250_crm_sub_app_non_col_guar_elig = r250_crm_sub_app_non_col_guar_elig;
	}
	public BigDecimal getR250_crm_sub_app_non_col_cre_der() {
		return r250_crm_sub_app_non_col_cre_der;
	}
	public void setR250_crm_sub_app_non_col_cre_der(BigDecimal r250_crm_sub_app_non_col_cre_der) {
		this.r250_crm_sub_app_non_col_cre_der = r250_crm_sub_app_non_col_cre_der;
	}
	public BigDecimal getR250_crm_sub_app_col_elig_cash() {
		return r250_crm_sub_app_col_elig_cash;
	}
	public void setR250_crm_sub_app_col_elig_cash(BigDecimal r250_crm_sub_app_col_elig_cash) {
		this.r250_crm_sub_app_col_elig_cash = r250_crm_sub_app_col_elig_cash;
	}
	public BigDecimal getR250_crm_sub_app_col_elig_tre_bills() {
		return r250_crm_sub_app_col_elig_tre_bills;
	}
	public void setR250_crm_sub_app_col_elig_tre_bills(BigDecimal r250_crm_sub_app_col_elig_tre_bills) {
		this.r250_crm_sub_app_col_elig_tre_bills = r250_crm_sub_app_col_elig_tre_bills;
	}
	public BigDecimal getR250_crm_sub_app_col_elig_deb_sec() {
		return r250_crm_sub_app_col_elig_deb_sec;
	}
	public void setR250_crm_sub_app_col_elig_deb_sec(BigDecimal r250_crm_sub_app_col_elig_deb_sec) {
		this.r250_crm_sub_app_col_elig_deb_sec = r250_crm_sub_app_col_elig_deb_sec;
	}
	public BigDecimal getR250_crm_sub_app_col_elig_euiq() {
		return r250_crm_sub_app_col_elig_euiq;
	}
	public void setR250_crm_sub_app_col_elig_euiq(BigDecimal r250_crm_sub_app_col_elig_euiq) {
		this.r250_crm_sub_app_col_elig_euiq = r250_crm_sub_app_col_elig_euiq;
	}
	public BigDecimal getR250_crm_sub_app_col_elig_uni_tru() {
		return r250_crm_sub_app_col_elig_uni_tru;
	}
	public void setR250_crm_sub_app_col_elig_uni_tru(BigDecimal r250_crm_sub_app_col_elig_uni_tru) {
		this.r250_crm_sub_app_col_elig_uni_tru = r250_crm_sub_app_col_elig_uni_tru;
	}
	public BigDecimal getR250_crm_sub_app_col_cea_cov() {
		return r250_crm_sub_app_col_cea_cov;
	}
	public void setR250_crm_sub_app_col_cea_cov(BigDecimal r250_crm_sub_app_col_cea_cov) {
		this.r250_crm_sub_app_col_cea_cov = r250_crm_sub_app_col_cea_cov;
	}
	public BigDecimal getR250_crm_sub_app_col_cea_not_cov() {
		return r250_crm_sub_app_col_cea_not_cov;
	}
	public void setR250_crm_sub_app_col_cea_not_cov(BigDecimal r250_crm_sub_app_col_cea_not_cov) {
		this.r250_crm_sub_app_col_cea_not_cov = r250_crm_sub_app_col_cea_not_cov;
	}
	public BigDecimal getR250_crm_sub_app_rwa_ris_wei_crm() {
		return r250_crm_sub_app_rwa_ris_wei_crm;
	}
	public void setR250_crm_sub_app_rwa_ris_wei_crm(BigDecimal r250_crm_sub_app_rwa_ris_wei_crm) {
		this.r250_crm_sub_app_rwa_ris_wei_crm = r250_crm_sub_app_rwa_ris_wei_crm;
	}
	public BigDecimal getR250_crm_sub_app_rwa_ris_cea_cov() {
		return r250_crm_sub_app_rwa_ris_cea_cov;
	}
	public void setR250_crm_sub_app_rwa_ris_cea_cov(BigDecimal r250_crm_sub_app_rwa_ris_cea_cov) {
		this.r250_crm_sub_app_rwa_ris_cea_cov = r250_crm_sub_app_rwa_ris_cea_cov;
	}
	public BigDecimal getR250_crm_sub_app_rwa_appl_org_coun() {
		return r250_crm_sub_app_rwa_appl_org_coun;
	}
	public void setR250_crm_sub_app_rwa_appl_org_coun(BigDecimal r250_crm_sub_app_rwa_appl_org_coun) {
		this.r250_crm_sub_app_rwa_appl_org_coun = r250_crm_sub_app_rwa_appl_org_coun;
	}
	public BigDecimal getR250_crm_sub_app_rwa_ris_cea_not_cov() {
		return r250_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public void setR250_crm_sub_app_rwa_ris_cea_not_cov(BigDecimal r250_crm_sub_app_rwa_ris_cea_not_cov) {
		this.r250_crm_sub_app_rwa_ris_cea_not_cov = r250_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public BigDecimal getR250_crm_com_app_col_cea_elig_crm() {
		return r250_crm_com_app_col_cea_elig_crm;
	}
	public void setR250_crm_com_app_col_cea_elig_crm(BigDecimal r250_crm_com_app_col_cea_elig_crm) {
		this.r250_crm_com_app_col_cea_elig_crm = r250_crm_com_app_col_cea_elig_crm;
	}
	public BigDecimal getR250_crm_com_app_col_elig_cea_vol_adj() {
		return r250_crm_com_app_col_elig_cea_vol_adj;
	}
	public void setR250_crm_com_app_col_elig_cea_vol_adj(BigDecimal r250_crm_com_app_col_elig_cea_vol_adj) {
		this.r250_crm_com_app_col_elig_cea_vol_adj = r250_crm_com_app_col_elig_cea_vol_adj;
	}
	public BigDecimal getR250_crm_com_app_col_elig_fin_hai() {
		return r250_crm_com_app_col_elig_fin_hai;
	}
	public void setR250_crm_com_app_col_elig_fin_hai(BigDecimal r250_crm_com_app_col_elig_fin_hai) {
		this.r250_crm_com_app_col_elig_fin_hai = r250_crm_com_app_col_elig_fin_hai;
	}
	public BigDecimal getR250_crm_com_app_col_cea_val_aft_crm() {
		return r250_crm_com_app_col_cea_val_aft_crm;
	}
	public void setR250_crm_com_app_col_cea_val_aft_crm(BigDecimal r250_crm_com_app_col_cea_val_aft_crm) {
		this.r250_crm_com_app_col_cea_val_aft_crm = r250_crm_com_app_col_cea_val_aft_crm;
	}
	public BigDecimal getR250_rwa_elig_cea_not_cov() {
		return r250_rwa_elig_cea_not_cov;
	}
	public void setR250_rwa_elig_cea_not_cov(BigDecimal r250_rwa_elig_cea_not_cov) {
		this.r250_rwa_elig_cea_not_cov = r250_rwa_elig_cea_not_cov;
	}
	public BigDecimal getR250_rwa_unsec_cea_sub_cre_ris() {
		return r250_rwa_unsec_cea_sub_cre_ris;
	}
	public void setR250_rwa_unsec_cea_sub_cre_ris(BigDecimal r250_rwa_unsec_cea_sub_cre_ris) {
		this.r250_rwa_unsec_cea_sub_cre_ris = r250_rwa_unsec_cea_sub_cre_ris;
	}
	public BigDecimal getR250_rwa_unsec_cea() {
		return r250_rwa_unsec_cea;
	}
	public void setR250_rwa_unsec_cea(BigDecimal r250_rwa_unsec_cea) {
		this.r250_rwa_unsec_cea = r250_rwa_unsec_cea;
	}
	public BigDecimal getR250_rwa_tot_ris_wei_ass() {
		return r250_rwa_tot_ris_wei_ass;
	}
	public void setR250_rwa_tot_ris_wei_ass(BigDecimal r250_rwa_tot_ris_wei_ass) {
		this.r250_rwa_tot_ris_wei_ass = r250_rwa_tot_ris_wei_ass;
	}
	public String getR251_exposure_class_off_bal() {
		return r251_exposure_class_off_bal;
	}
	public void setR251_exposure_class_off_bal(String r251_exposure_class_off_bal) {
		this.r251_exposure_class_off_bal = r251_exposure_class_off_bal;
	}
	public BigDecimal getR251_rwa_tot_ris_wei_ass() {
		return r251_rwa_tot_ris_wei_ass;
	}
	public void setR251_rwa_tot_ris_wei_ass(BigDecimal r251_rwa_tot_ris_wei_ass) {
		this.r251_rwa_tot_ris_wei_ass = r251_rwa_tot_ris_wei_ass;
	}
	public String getR252_exposure_class_off_bal() {
		return r252_exposure_class_off_bal;
	}
	public void setR252_exposure_class_off_bal(String r252_exposure_class_off_bal) {
		this.r252_exposure_class_off_bal = r252_exposure_class_off_bal;
	}
	public BigDecimal getR252_rwa_tot_ris_wei_ass() {
		return r252_rwa_tot_ris_wei_ass;
	}
	public void setR252_rwa_tot_ris_wei_ass(BigDecimal r252_rwa_tot_ris_wei_ass) {
		this.r252_rwa_tot_ris_wei_ass = r252_rwa_tot_ris_wei_ass;
	}
	public String getR253_exposure_class_off_bal() {
		return r253_exposure_class_off_bal;
	}
	public void setR253_exposure_class_off_bal(String r253_exposure_class_off_bal) {
		this.r253_exposure_class_off_bal = r253_exposure_class_off_bal;
	}
	public BigDecimal getR253_nom_pri_amt() {
		return r253_nom_pri_amt;
	}
	public void setR253_nom_pri_amt(BigDecimal r253_nom_pri_amt) {
		this.r253_nom_pri_amt = r253_nom_pri_amt;
	}
	public BigDecimal getR253_ccf() {
		return r253_ccf;
	}
	public void setR253_ccf(BigDecimal r253_ccf) {
		this.r253_ccf = r253_ccf;
	}
	public BigDecimal getR253_cea() {
		return r253_cea;
	}
	public void setR253_cea(BigDecimal r253_cea) {
		this.r253_cea = r253_cea;
	}
	public BigDecimal getR253_cea_elig_coun_bilt_net() {
		return r253_cea_elig_coun_bilt_net;
	}
	public void setR253_cea_elig_coun_bilt_net(BigDecimal r253_cea_elig_coun_bilt_net) {
		this.r253_cea_elig_coun_bilt_net = r253_cea_elig_coun_bilt_net;
	}
	public BigDecimal getR253_cea_aft_net() {
		return r253_cea_aft_net;
	}
	public void setR253_cea_aft_net(BigDecimal r253_cea_aft_net) {
		this.r253_cea_aft_net = r253_cea_aft_net;
	}
	public BigDecimal getR253_crm_sub_app_cea_elig() {
		return r253_crm_sub_app_cea_elig;
	}
	public void setR253_crm_sub_app_cea_elig(BigDecimal r253_crm_sub_app_cea_elig) {
		this.r253_crm_sub_app_cea_elig = r253_crm_sub_app_cea_elig;
	}
	public BigDecimal getR253_crm_sub_app_non_col_guar_elig() {
		return r253_crm_sub_app_non_col_guar_elig;
	}
	public void setR253_crm_sub_app_non_col_guar_elig(BigDecimal r253_crm_sub_app_non_col_guar_elig) {
		this.r253_crm_sub_app_non_col_guar_elig = r253_crm_sub_app_non_col_guar_elig;
	}
	public BigDecimal getR253_crm_sub_app_non_col_cre_der() {
		return r253_crm_sub_app_non_col_cre_der;
	}
	public void setR253_crm_sub_app_non_col_cre_der(BigDecimal r253_crm_sub_app_non_col_cre_der) {
		this.r253_crm_sub_app_non_col_cre_der = r253_crm_sub_app_non_col_cre_der;
	}
	public BigDecimal getR253_crm_sub_app_col_elig_cash() {
		return r253_crm_sub_app_col_elig_cash;
	}
	public void setR253_crm_sub_app_col_elig_cash(BigDecimal r253_crm_sub_app_col_elig_cash) {
		this.r253_crm_sub_app_col_elig_cash = r253_crm_sub_app_col_elig_cash;
	}
	public BigDecimal getR253_crm_sub_app_col_elig_tre_bills() {
		return r253_crm_sub_app_col_elig_tre_bills;
	}
	public void setR253_crm_sub_app_col_elig_tre_bills(BigDecimal r253_crm_sub_app_col_elig_tre_bills) {
		this.r253_crm_sub_app_col_elig_tre_bills = r253_crm_sub_app_col_elig_tre_bills;
	}
	public BigDecimal getR253_crm_sub_app_col_elig_deb_sec() {
		return r253_crm_sub_app_col_elig_deb_sec;
	}
	public void setR253_crm_sub_app_col_elig_deb_sec(BigDecimal r253_crm_sub_app_col_elig_deb_sec) {
		this.r253_crm_sub_app_col_elig_deb_sec = r253_crm_sub_app_col_elig_deb_sec;
	}
	public BigDecimal getR253_crm_sub_app_col_elig_euiq() {
		return r253_crm_sub_app_col_elig_euiq;
	}
	public void setR253_crm_sub_app_col_elig_euiq(BigDecimal r253_crm_sub_app_col_elig_euiq) {
		this.r253_crm_sub_app_col_elig_euiq = r253_crm_sub_app_col_elig_euiq;
	}
	public BigDecimal getR253_crm_sub_app_col_elig_uni_tru() {
		return r253_crm_sub_app_col_elig_uni_tru;
	}
	public void setR253_crm_sub_app_col_elig_uni_tru(BigDecimal r253_crm_sub_app_col_elig_uni_tru) {
		this.r253_crm_sub_app_col_elig_uni_tru = r253_crm_sub_app_col_elig_uni_tru;
	}
	public BigDecimal getR253_crm_sub_app_col_cea_cov() {
		return r253_crm_sub_app_col_cea_cov;
	}
	public void setR253_crm_sub_app_col_cea_cov(BigDecimal r253_crm_sub_app_col_cea_cov) {
		this.r253_crm_sub_app_col_cea_cov = r253_crm_sub_app_col_cea_cov;
	}
	public BigDecimal getR253_crm_sub_app_col_cea_not_cov() {
		return r253_crm_sub_app_col_cea_not_cov;
	}
	public void setR253_crm_sub_app_col_cea_not_cov(BigDecimal r253_crm_sub_app_col_cea_not_cov) {
		this.r253_crm_sub_app_col_cea_not_cov = r253_crm_sub_app_col_cea_not_cov;
	}
	public BigDecimal getR253_crm_sub_app_rwa_ris_wei_crm() {
		return r253_crm_sub_app_rwa_ris_wei_crm;
	}
	public void setR253_crm_sub_app_rwa_ris_wei_crm(BigDecimal r253_crm_sub_app_rwa_ris_wei_crm) {
		this.r253_crm_sub_app_rwa_ris_wei_crm = r253_crm_sub_app_rwa_ris_wei_crm;
	}
	public BigDecimal getR253_crm_sub_app_rwa_ris_cea_cov() {
		return r253_crm_sub_app_rwa_ris_cea_cov;
	}
	public void setR253_crm_sub_app_rwa_ris_cea_cov(BigDecimal r253_crm_sub_app_rwa_ris_cea_cov) {
		this.r253_crm_sub_app_rwa_ris_cea_cov = r253_crm_sub_app_rwa_ris_cea_cov;
	}
	public BigDecimal getR253_crm_sub_app_rwa_appl_org_coun() {
		return r253_crm_sub_app_rwa_appl_org_coun;
	}
	public void setR253_crm_sub_app_rwa_appl_org_coun(BigDecimal r253_crm_sub_app_rwa_appl_org_coun) {
		this.r253_crm_sub_app_rwa_appl_org_coun = r253_crm_sub_app_rwa_appl_org_coun;
	}
	public BigDecimal getR253_crm_sub_app_rwa_ris_cea_not_cov() {
		return r253_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public void setR253_crm_sub_app_rwa_ris_cea_not_cov(BigDecimal r253_crm_sub_app_rwa_ris_cea_not_cov) {
		this.r253_crm_sub_app_rwa_ris_cea_not_cov = r253_crm_sub_app_rwa_ris_cea_not_cov;
	}
	public BigDecimal getR253_crm_com_app_col_cea_elig_crm() {
		return r253_crm_com_app_col_cea_elig_crm;
	}
	public void setR253_crm_com_app_col_cea_elig_crm(BigDecimal r253_crm_com_app_col_cea_elig_crm) {
		this.r253_crm_com_app_col_cea_elig_crm = r253_crm_com_app_col_cea_elig_crm;
	}
	public BigDecimal getR253_crm_com_app_col_elig_cea_vol_adj() {
		return r253_crm_com_app_col_elig_cea_vol_adj;
	}
	public void setR253_crm_com_app_col_elig_cea_vol_adj(BigDecimal r253_crm_com_app_col_elig_cea_vol_adj) {
		this.r253_crm_com_app_col_elig_cea_vol_adj = r253_crm_com_app_col_elig_cea_vol_adj;
	}
	public BigDecimal getR253_crm_com_app_col_elig_fin_hai() {
		return r253_crm_com_app_col_elig_fin_hai;
	}
	public void setR253_crm_com_app_col_elig_fin_hai(BigDecimal r253_crm_com_app_col_elig_fin_hai) {
		this.r253_crm_com_app_col_elig_fin_hai = r253_crm_com_app_col_elig_fin_hai;
	}
	public BigDecimal getR253_crm_com_app_col_cea_val_aft_crm() {
		return r253_crm_com_app_col_cea_val_aft_crm;
	}
	public void setR253_crm_com_app_col_cea_val_aft_crm(BigDecimal r253_crm_com_app_col_cea_val_aft_crm) {
		this.r253_crm_com_app_col_cea_val_aft_crm = r253_crm_com_app_col_cea_val_aft_crm;
	}
	public BigDecimal getR253_rwa_elig_cea_not_cov() {
		return r253_rwa_elig_cea_not_cov;
	}
	public void setR253_rwa_elig_cea_not_cov(BigDecimal r253_rwa_elig_cea_not_cov) {
		this.r253_rwa_elig_cea_not_cov = r253_rwa_elig_cea_not_cov;
	}
	public BigDecimal getR253_rwa_unsec_cea_sub_cre_ris() {
		return r253_rwa_unsec_cea_sub_cre_ris;
	}
	public void setR253_rwa_unsec_cea_sub_cre_ris(BigDecimal r253_rwa_unsec_cea_sub_cre_ris) {
		this.r253_rwa_unsec_cea_sub_cre_ris = r253_rwa_unsec_cea_sub_cre_ris;
	}
	public BigDecimal getR253_rwa_unsec_cea() {
		return r253_rwa_unsec_cea;
	}
	public void setR253_rwa_unsec_cea(BigDecimal r253_rwa_unsec_cea) {
		this.r253_rwa_unsec_cea = r253_rwa_unsec_cea;
	}
	public BigDecimal getR253_rwa_tot_ris_wei_ass() {
		return r253_rwa_tot_ris_wei_ass;
	}
	public void setR253_rwa_tot_ris_wei_ass(BigDecimal r253_rwa_tot_ris_wei_ass) {
		this.r253_rwa_tot_ris_wei_ass = r253_rwa_tot_ris_wei_ass;
	}
	public String getR254_exposure_class_off_bal() {
		return r254_exposure_class_off_bal;
	}
	public void setR254_exposure_class_off_bal(String r254_exposure_class_off_bal) {
		this.r254_exposure_class_off_bal = r254_exposure_class_off_bal;
	}
	public BigDecimal getR254_rwa_tot_ris_wei_ass() {
		return r254_rwa_tot_ris_wei_ass;
	}
	public void setR254_rwa_tot_ris_wei_ass(BigDecimal r254_rwa_tot_ris_wei_ass) {
		this.r254_rwa_tot_ris_wei_ass = r254_rwa_tot_ris_wei_ass;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getReport_version() {
		return report_version;
	}
	public void setReport_version(String report_version) {
		this.report_version = report_version;
	}
	public String getReport_frequency() {
		return report_frequency;
	}
	public void setReport_frequency(String report_frequency) {
		this.report_frequency = report_frequency;
	}
	public String getReport_code() {
		return report_code;
	}
	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}
	public String getReport_desc() {
		return report_desc;
	}
	public void setReport_desc(String report_desc) {
		this.report_desc = report_desc;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public M_SRWA_12A_Summary_Entity7() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	

}
