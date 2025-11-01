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
@Table(name = "BRRS_M_SRWA_12A_ARCHIVALTABLE_SUMMARY1")


public class M_SRWA_12A_Archival_Summary_Entity1 {
	
	
	private String	r19_exposure_class;
//	private BigDecimal	r19_expo_crm;
	private BigDecimal	r19_spe_pro_expo;
	private BigDecimal	r19_amt_elig_sht_net;
	private BigDecimal	r19_tot_expo_net_spe;
	private BigDecimal	r19_crm_sub_elig_sub_app;
	private BigDecimal	r19_crm_sub_non_col_guar;
	private BigDecimal	r19_crm_sub_non_col_cre_der;
	private BigDecimal	r19_crm_sub_col_elig_cash;
	private BigDecimal	r19_crm_sub_col_elig_trea_bills;
	private BigDecimal	r19_crm_sub_col_elig_deb_sec;
	private BigDecimal	r19_crm_sub_col_elig_equi;
	private BigDecimal	r19_crm_sub_col_elig_unit_tru;
	private BigDecimal	r19_crm_sub_col_exp_cov;
	private BigDecimal	r19_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r19_crm_sub_rwa_ris_crm;
	private BigDecimal	r19_crm_sub_rwa_cov_crm;
	private BigDecimal	r19_crm_sub_rwa_org_cou;
	private BigDecimal	r19_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r19_crm_comp_col_expo_elig;
	private BigDecimal	r19_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r19_crm_comp_col_elig_fin_hai;
	private BigDecimal	r19_crm_comp_col_expo_val;
	private BigDecimal	r19_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r19_rwa_unsec_expo_cre_ris;
	private BigDecimal	r19_rwa_unsec_expo;
	private BigDecimal	r19_rwa_tot_ris_wei_ass;
	
	private String	r20_exposure_class;
	private BigDecimal	r20_expo_crm;
	private BigDecimal	r20_spe_pro_expo;
	private BigDecimal	r20_amt_elig_sht_net;
	private BigDecimal	r20_tot_expo_net_spe;
	private BigDecimal	r20_crm_sub_elig_sub_app;
	private BigDecimal	r20_crm_sub_non_col_guar;
	private BigDecimal	r20_crm_sub_non_col_cre_der;
	private BigDecimal	r20_crm_sub_col_elig_cash;
	private BigDecimal	r20_crm_sub_col_elig_trea_bills;
	private BigDecimal	r20_crm_sub_col_elig_deb_sec;
	private BigDecimal	r20_crm_sub_col_elig_equi;
	private BigDecimal	r20_crm_sub_col_elig_unit_tru;
	private BigDecimal	r20_crm_sub_col_exp_cov;
	private BigDecimal	r20_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r20_crm_sub_rwa_ris_crm;
	private BigDecimal	r20_crm_sub_rwa_cov_crm;
	private BigDecimal	r20_crm_sub_rwa_org_cou;
	private BigDecimal	r20_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r20_crm_comp_col_expo_elig;
	private BigDecimal	r20_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r20_crm_comp_col_elig_fin_hai;
	private BigDecimal	r20_crm_comp_col_expo_val;
	private BigDecimal	r20_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r20_rwa_unsec_expo_cre_ris;
	private BigDecimal	r20_rwa_unsec_expo;
	private BigDecimal	r20_rwa_tot_ris_wei_ass;

	private String	r21_exposure_class;
	private BigDecimal	r21_expo_crm;
	private BigDecimal	r21_spe_pro_expo;
	private BigDecimal	r21_amt_elig_sht_net;
	private BigDecimal	r21_tot_expo_net_spe;
	private BigDecimal	r21_crm_sub_elig_sub_app;
	private BigDecimal	r21_crm_sub_non_col_guar;
	private BigDecimal	r21_crm_sub_non_col_cre_der;
	private BigDecimal	r21_crm_sub_col_elig_cash;
	private BigDecimal	r21_crm_sub_col_elig_trea_bills;
	private BigDecimal	r21_crm_sub_col_elig_deb_sec;
	private BigDecimal	r21_crm_sub_col_elig_equi;
	private BigDecimal	r21_crm_sub_col_elig_unit_tru;
	private BigDecimal	r21_crm_sub_col_exp_cov;
	private BigDecimal	r21_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r21_crm_sub_rwa_ris_crm;
	private BigDecimal	r21_crm_sub_rwa_cov_crm;
	private BigDecimal	r21_crm_sub_rwa_org_cou;
	private BigDecimal	r21_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r21_crm_comp_col_expo_elig;
	private BigDecimal	r21_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r21_crm_comp_col_elig_fin_hai;
	private BigDecimal	r21_crm_comp_col_expo_val;
	private BigDecimal	r21_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r21_rwa_unsec_expo_cre_ris;
	private BigDecimal	r21_rwa_unsec_expo;
	private BigDecimal	r21_rwa_tot_ris_wei_ass;
	
	private String	r22_exposure_class;
	private BigDecimal	r22_expo_crm;
	private BigDecimal	r22_spe_pro_expo;
	private BigDecimal	r22_amt_elig_sht_net;
	private BigDecimal	r22_tot_expo_net_spe;
	private BigDecimal	r22_crm_sub_elig_sub_app;
	private BigDecimal	r22_crm_sub_non_col_guar;
	private BigDecimal	r22_crm_sub_non_col_cre_der;
	private BigDecimal	r22_crm_sub_col_elig_cash;
	private BigDecimal	r22_crm_sub_col_elig_trea_bills;
	private BigDecimal	r22_crm_sub_col_elig_deb_sec;
	private BigDecimal	r22_crm_sub_col_elig_equi;
	private BigDecimal	r22_crm_sub_col_elig_unit_tru;
	private BigDecimal	r22_crm_sub_col_exp_cov;
	private BigDecimal	r22_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r22_crm_sub_rwa_ris_crm;
	private BigDecimal	r22_crm_sub_rwa_cov_crm;
	private BigDecimal	r22_crm_sub_rwa_org_cou;
	private BigDecimal	r22_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r22_crm_comp_col_expo_elig;
	private BigDecimal	r22_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r22_crm_comp_col_elig_fin_hai;
	private BigDecimal	r22_crm_comp_col_expo_val;
	private BigDecimal	r22_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r22_rwa_unsec_expo_cre_ris;
	private BigDecimal	r22_rwa_unsec_expo;
	private BigDecimal	r22_rwa_tot_ris_wei_ass;
	
	private String	r23_exposure_class;
	private BigDecimal	r23_expo_crm;
	private BigDecimal	r23_spe_pro_expo;
	private BigDecimal	r23_amt_elig_sht_net;
	private BigDecimal	r23_tot_expo_net_spe;
	private BigDecimal	r23_crm_sub_elig_sub_app;
	private BigDecimal	r23_crm_sub_non_col_guar;
	private BigDecimal	r23_crm_sub_non_col_cre_der;
	private BigDecimal	r23_crm_sub_col_elig_cash;
	private BigDecimal	r23_crm_sub_col_elig_trea_bills;
	private BigDecimal	r23_crm_sub_col_elig_deb_sec;
	private BigDecimal	r23_crm_sub_col_elig_equi;
	private BigDecimal	r23_crm_sub_col_elig_unit_tru;
	private BigDecimal	r23_crm_sub_col_exp_cov;
	private BigDecimal	r23_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r23_crm_sub_rwa_ris_crm;
	private BigDecimal	r23_crm_sub_rwa_cov_crm;
	private BigDecimal	r23_crm_sub_rwa_org_cou;
	private BigDecimal	r23_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r23_crm_comp_col_expo_elig;
	private BigDecimal	r23_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r23_crm_comp_col_elig_fin_hai;
	private BigDecimal	r23_crm_comp_col_expo_val;
	private BigDecimal	r23_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r23_rwa_unsec_expo_cre_ris;
	private BigDecimal	r23_rwa_unsec_expo;
	private BigDecimal	r23_rwa_tot_ris_wei_ass;
	
	private String	r24_exposure_class;
	private BigDecimal	r24_expo_crm;
	private BigDecimal	r24_spe_pro_expo;
	private BigDecimal	r24_amt_elig_sht_net;
	private BigDecimal	r24_tot_expo_net_spe;
	private BigDecimal	r24_crm_sub_elig_sub_app;
	private BigDecimal	r24_crm_sub_non_col_guar;
	private BigDecimal	r24_crm_sub_non_col_cre_der;
	private BigDecimal	r24_crm_sub_col_elig_cash;
	private BigDecimal	r24_crm_sub_col_elig_trea_bills;
	private BigDecimal	r24_crm_sub_col_elig_deb_sec;
	private BigDecimal	r24_crm_sub_col_elig_equi;
	private BigDecimal	r24_crm_sub_col_elig_unit_tru;
	private BigDecimal	r24_crm_sub_col_exp_cov;
	private BigDecimal	r24_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r24_crm_sub_rwa_ris_crm;
	private BigDecimal	r24_crm_sub_rwa_cov_crm;
	private BigDecimal	r24_crm_sub_rwa_org_cou;
	private BigDecimal	r24_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r24_crm_comp_col_expo_elig;
	private BigDecimal	r24_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r24_crm_comp_col_elig_fin_hai;
	private BigDecimal	r24_crm_comp_col_expo_val;
	private BigDecimal	r24_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r24_rwa_unsec_expo_cre_ris;
	private BigDecimal	r24_rwa_unsec_expo;
	private BigDecimal	r24_rwa_tot_ris_wei_ass;
	
	private String	r25_exposure_class;
	private BigDecimal	r25_expo_crm;
	private BigDecimal	r25_spe_pro_expo;
	private BigDecimal	r25_amt_elig_sht_net;
	private BigDecimal	r25_tot_expo_net_spe;
	private BigDecimal	r25_crm_sub_elig_sub_app;
	private BigDecimal	r25_crm_sub_non_col_guar;
	private BigDecimal	r25_crm_sub_non_col_cre_der;
	private BigDecimal	r25_crm_sub_col_elig_cash;
	private BigDecimal	r25_crm_sub_col_elig_trea_bills;
	private BigDecimal	r25_crm_sub_col_elig_deb_sec;
	private BigDecimal	r25_crm_sub_col_elig_equi;
	private BigDecimal	r25_crm_sub_col_elig_unit_tru;
	private BigDecimal	r25_crm_sub_col_exp_cov;
	private BigDecimal	r25_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r25_crm_sub_rwa_ris_crm;
	private BigDecimal	r25_crm_sub_rwa_cov_crm;
	private BigDecimal	r25_crm_sub_rwa_org_cou;
	private BigDecimal	r25_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r25_crm_comp_col_expo_elig;
	private BigDecimal	r25_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r25_crm_comp_col_elig_fin_hai;
	private BigDecimal	r25_crm_comp_col_expo_val;
	private BigDecimal	r25_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r25_rwa_unsec_expo_cre_ris;
	private BigDecimal	r25_rwa_unsec_expo;
	private BigDecimal	r25_rwa_tot_ris_wei_ass;
	
	private String	r26_exposure_class;
	private BigDecimal	r26_expo_crm;
	private BigDecimal	r26_spe_pro_expo;
	private BigDecimal	r26_amt_elig_sht_net;
	private BigDecimal	r26_tot_expo_net_spe;
	private BigDecimal	r26_crm_sub_elig_sub_app;
	private BigDecimal	r26_crm_sub_non_col_guar;
	private BigDecimal	r26_crm_sub_non_col_cre_der;
	private BigDecimal	r26_crm_sub_col_elig_cash;
	private BigDecimal	r26_crm_sub_col_elig_trea_bills;
	private BigDecimal	r26_crm_sub_col_elig_deb_sec;
	private BigDecimal	r26_crm_sub_col_elig_equi;
	private BigDecimal	r26_crm_sub_col_elig_unit_tru;
	private BigDecimal	r26_crm_sub_col_exp_cov;
	private BigDecimal	r26_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r26_crm_sub_rwa_ris_crm;
	private BigDecimal	r26_crm_sub_rwa_cov_crm;
	private BigDecimal	r26_crm_sub_rwa_org_cou;
	private BigDecimal	r26_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r26_crm_comp_col_expo_elig;
	private BigDecimal	r26_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r26_crm_comp_col_elig_fin_hai;
	private BigDecimal	r26_crm_comp_col_expo_val;
	private BigDecimal	r26_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r26_rwa_unsec_expo_cre_ris;
	private BigDecimal	r26_rwa_unsec_expo;
	private BigDecimal	r26_rwa_tot_ris_wei_ass;
	
	private String	r27_exposure_class;
	private BigDecimal	r27_expo_crm;
	private BigDecimal	r27_spe_pro_expo;
	private BigDecimal	r27_amt_elig_sht_net;
	private BigDecimal	r27_tot_expo_net_spe;
	private BigDecimal	r27_crm_sub_elig_sub_app;
	private BigDecimal	r27_crm_sub_non_col_guar;
	private BigDecimal	r27_crm_sub_non_col_cre_der;
	private BigDecimal	r27_crm_sub_col_elig_cash;
	private BigDecimal	r27_crm_sub_col_elig_trea_bills;
	private BigDecimal	r27_crm_sub_col_elig_deb_sec;
	private BigDecimal	r27_crm_sub_col_elig_equi;
	private BigDecimal	r27_crm_sub_col_elig_unit_tru;
	private BigDecimal	r27_crm_sub_col_exp_cov;
	private BigDecimal	r27_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r27_crm_sub_rwa_ris_crm;
	private BigDecimal	r27_crm_sub_rwa_cov_crm;
	private BigDecimal	r27_crm_sub_rwa_org_cou;
	private BigDecimal	r27_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r27_crm_comp_col_expo_elig;
	private BigDecimal	r27_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r27_crm_comp_col_elig_fin_hai;
	private BigDecimal	r27_crm_comp_col_expo_val;
	private BigDecimal	r27_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r27_rwa_unsec_expo_cre_ris;
	private BigDecimal	r27_rwa_unsec_expo;
	private BigDecimal	r27_rwa_tot_ris_wei_ass;
	
	private String	r28_exposure_class;
	private BigDecimal	r28_expo_crm;
	private BigDecimal	r28_spe_pro_expo;
	private BigDecimal	r28_amt_elig_sht_net;
	private BigDecimal	r28_tot_expo_net_spe;
	private BigDecimal	r28_crm_sub_elig_sub_app;
	private BigDecimal	r28_crm_sub_non_col_guar;
	private BigDecimal	r28_crm_sub_non_col_cre_der;
	private BigDecimal	r28_crm_sub_col_elig_cash;
	private BigDecimal	r28_crm_sub_col_elig_trea_bills;
	private BigDecimal	r28_crm_sub_col_elig_deb_sec;
	private BigDecimal	r28_crm_sub_col_elig_equi;
	private BigDecimal	r28_crm_sub_col_elig_unit_tru;
	private BigDecimal	r28_crm_sub_col_exp_cov;
	private BigDecimal	r28_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r28_crm_sub_rwa_ris_crm;
	private BigDecimal	r28_crm_sub_rwa_cov_crm;
	private BigDecimal	r28_crm_sub_rwa_org_cou;
	private BigDecimal	r28_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r28_crm_comp_col_expo_elig;
	private BigDecimal	r28_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r28_crm_comp_col_elig_fin_hai;
	private BigDecimal	r28_crm_comp_col_expo_val;
	private BigDecimal	r28_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r28_rwa_unsec_expo_cre_ris;
	private BigDecimal	r28_rwa_unsec_expo;
	private BigDecimal	r28_rwa_tot_ris_wei_ass;
	
	private String	r29_exposure_class;
	private BigDecimal	r29_expo_crm;
	private BigDecimal	r29_spe_pro_expo;
	private BigDecimal	r29_amt_elig_sht_net;
	private BigDecimal	r29_tot_expo_net_spe;
	private BigDecimal	r29_crm_sub_elig_sub_app;
	private BigDecimal	r29_crm_sub_non_col_guar;
	private BigDecimal	r29_crm_sub_non_col_cre_der;
	private BigDecimal	r29_crm_sub_col_elig_cash;
	private BigDecimal	r29_crm_sub_col_elig_trea_bills;
	private BigDecimal	r29_crm_sub_col_elig_deb_sec;
	private BigDecimal	r29_crm_sub_col_elig_equi;
	private BigDecimal	r29_crm_sub_col_elig_unit_tru;
	private BigDecimal	r29_crm_sub_col_exp_cov;
	private BigDecimal	r29_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r29_crm_sub_rwa_ris_crm;
	private BigDecimal	r29_crm_sub_rwa_cov_crm;
	private BigDecimal	r29_crm_sub_rwa_org_cou;
	private BigDecimal	r29_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r29_crm_comp_col_expo_elig;
	private BigDecimal	r29_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r29_crm_comp_col_elig_fin_hai;
	private BigDecimal	r29_crm_comp_col_expo_val;
	private BigDecimal	r29_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r29_rwa_unsec_expo_cre_ris;
	private BigDecimal	r29_rwa_unsec_expo;
	private BigDecimal	r29_rwa_tot_ris_wei_ass;
	
	private String	r32_exposure_class;
	private BigDecimal	r32_expo_crm;
	private BigDecimal	r32_spe_pro_expo;
	private BigDecimal	r32_amt_elig_sht_net;
	private BigDecimal	r32_tot_expo_net_spe;
	private BigDecimal	r32_crm_sub_elig_sub_app;
	private BigDecimal	r32_crm_sub_non_col_guar;
	private BigDecimal	r32_crm_sub_non_col_cre_der;
	private BigDecimal	r32_crm_sub_col_elig_cash;
	private BigDecimal	r32_crm_sub_col_elig_trea_bills;
	private BigDecimal	r32_crm_sub_col_elig_deb_sec;
	private BigDecimal	r32_crm_sub_col_elig_equi;
	private BigDecimal	r32_crm_sub_col_elig_unit_tru;
	private BigDecimal	r32_crm_sub_col_exp_cov;
	private BigDecimal	r32_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r32_crm_sub_rwa_ris_crm;
	private BigDecimal	r32_crm_sub_rwa_cov_crm;
	private BigDecimal	r32_crm_sub_rwa_org_cou;
	private BigDecimal	r32_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r32_crm_comp_col_expo_elig;
	private BigDecimal	r32_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r32_crm_comp_col_elig_fin_hai;
	private BigDecimal	r32_crm_comp_col_expo_val;
	private BigDecimal	r32_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r32_rwa_unsec_expo_cre_ris;
	private BigDecimal	r32_rwa_unsec_expo;
	private BigDecimal	r32_rwa_tot_ris_wei_ass;
	
	private String	r33_exposure_class;
	private BigDecimal	r33_expo_crm;
	private BigDecimal	r33_spe_pro_expo;
	private BigDecimal	r33_amt_elig_sht_net;
	private BigDecimal	r33_tot_expo_net_spe;
	private BigDecimal	r33_crm_sub_elig_sub_app;
	private BigDecimal	r33_crm_sub_non_col_guar;
	private BigDecimal	r33_crm_sub_non_col_cre_der;
	private BigDecimal	r33_crm_sub_col_elig_cash;
	private BigDecimal	r33_crm_sub_col_elig_trea_bills;
	private BigDecimal	r33_crm_sub_col_elig_deb_sec;
	private BigDecimal	r33_crm_sub_col_elig_equi;
	private BigDecimal	r33_crm_sub_col_elig_unit_tru;
	private BigDecimal	r33_crm_sub_col_exp_cov;
	private BigDecimal	r33_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r33_crm_sub_rwa_ris_crm;
	private BigDecimal	r33_crm_sub_rwa_cov_crm;
	private BigDecimal	r33_crm_sub_rwa_org_cou;
	private BigDecimal	r33_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r33_crm_comp_col_expo_elig;
	private BigDecimal	r33_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r33_crm_comp_col_elig_fin_hai;
	private BigDecimal	r33_crm_comp_col_expo_val;
	private BigDecimal	r33_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r33_rwa_unsec_expo_cre_ris;
	private BigDecimal	r33_rwa_unsec_expo;
	private BigDecimal	r33_rwa_tot_ris_wei_ass;
	
	
	private String	r34_exposure_class;
	private BigDecimal	r34_expo_crm;
	private BigDecimal	r34_spe_pro_expo;
	private BigDecimal	r34_amt_elig_sht_net;
	private BigDecimal	r34_tot_expo_net_spe;
	private BigDecimal	r34_crm_sub_elig_sub_app;
	private BigDecimal	r34_crm_sub_non_col_guar;
	private BigDecimal	r34_crm_sub_non_col_cre_der;
	private BigDecimal	r34_crm_sub_col_elig_cash;
	private BigDecimal	r34_crm_sub_col_elig_trea_bills;
	private BigDecimal	r34_crm_sub_col_elig_deb_sec;
	private BigDecimal	r34_crm_sub_col_elig_equi;
	private BigDecimal	r34_crm_sub_col_elig_unit_tru;
	private BigDecimal	r34_crm_sub_col_exp_cov;
	private BigDecimal	r34_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r34_crm_sub_rwa_ris_crm;
	private BigDecimal	r34_crm_sub_rwa_cov_crm;
	private BigDecimal	r34_crm_sub_rwa_org_cou;
	private BigDecimal	r34_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r34_crm_comp_col_expo_elig;
	private BigDecimal	r34_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r34_crm_comp_col_elig_fin_hai;
	private BigDecimal	r34_crm_comp_col_expo_val;
	private BigDecimal	r34_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r34_rwa_unsec_expo_cre_ris;
	private BigDecimal	r34_rwa_unsec_expo;
	private BigDecimal	r34_rwa_tot_ris_wei_ass;
	
	private String	r35_exposure_class;
	private BigDecimal	r35_expo_crm;
	private BigDecimal	r35_spe_pro_expo;
	private BigDecimal	r35_amt_elig_sht_net;
	private BigDecimal	r35_tot_expo_net_spe;
	private BigDecimal	r35_crm_sub_elig_sub_app;
	private BigDecimal	r35_crm_sub_non_col_guar;
	private BigDecimal	r35_crm_sub_non_col_cre_der;
	private BigDecimal	r35_crm_sub_col_elig_cash;
	private BigDecimal	r35_crm_sub_col_elig_trea_bills;
	private BigDecimal	r35_crm_sub_col_elig_deb_sec;
	private BigDecimal	r35_crm_sub_col_elig_equi;
	private BigDecimal	r35_crm_sub_col_elig_unit_tru;
	private BigDecimal	r35_crm_sub_col_exp_cov;
	private BigDecimal	r35_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r35_crm_sub_rwa_ris_crm;
	private BigDecimal	r35_crm_sub_rwa_cov_crm;
	private BigDecimal	r35_crm_sub_rwa_org_cou;
	private BigDecimal	r35_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r35_crm_comp_col_expo_elig;
	private BigDecimal	r35_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r35_crm_comp_col_elig_fin_hai;
	private BigDecimal	r35_crm_comp_col_expo_val;
	private BigDecimal	r35_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r35_rwa_unsec_expo_cre_ris;
	private BigDecimal	r35_rwa_unsec_expo;
	private BigDecimal	r35_rwa_tot_ris_wei_ass;
	
	private String	r36_exposure_class;
	private BigDecimal	r36_expo_crm;
	private BigDecimal	r36_spe_pro_expo;
	private BigDecimal	r36_amt_elig_sht_net;
	private BigDecimal	r36_tot_expo_net_spe;
	private BigDecimal	r36_crm_sub_elig_sub_app;
	private BigDecimal	r36_crm_sub_non_col_guar;
	private BigDecimal	r36_crm_sub_non_col_cre_der;
	private BigDecimal	r36_crm_sub_col_elig_cash;
	private BigDecimal	r36_crm_sub_col_elig_trea_bills;
	private BigDecimal	r36_crm_sub_col_elig_deb_sec;
	private BigDecimal	r36_crm_sub_col_elig_equi;
	private BigDecimal	r36_crm_sub_col_elig_unit_tru;
	private BigDecimal	r36_crm_sub_col_exp_cov;
	private BigDecimal	r36_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r36_crm_sub_rwa_ris_crm;
	private BigDecimal	r36_crm_sub_rwa_cov_crm;
	private BigDecimal	r36_crm_sub_rwa_org_cou;
	private BigDecimal	r36_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r36_crm_comp_col_expo_elig;
	private BigDecimal	r36_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r36_crm_comp_col_elig_fin_hai;
	private BigDecimal	r36_crm_comp_col_expo_val;
	private BigDecimal	r36_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r36_rwa_unsec_expo_cre_ris;
	private BigDecimal	r36_rwa_unsec_expo;
	private BigDecimal	r36_rwa_tot_ris_wei_ass;
	
	private String	r37_exposure_class;
	private BigDecimal	r37_expo_crm;
	private BigDecimal	r37_spe_pro_expo;
	private BigDecimal	r37_amt_elig_sht_net;
	private BigDecimal	r37_tot_expo_net_spe;
	private BigDecimal	r37_crm_sub_elig_sub_app;
	private BigDecimal	r37_crm_sub_non_col_guar;
	private BigDecimal	r37_crm_sub_non_col_cre_der;
	private BigDecimal	r37_crm_sub_col_elig_cash;
	private BigDecimal	r37_crm_sub_col_elig_trea_bills;
	private BigDecimal	r37_crm_sub_col_elig_deb_sec;
	private BigDecimal	r37_crm_sub_col_elig_equi;
	private BigDecimal	r37_crm_sub_col_elig_unit_tru;
	private BigDecimal	r37_crm_sub_col_exp_cov;
	private BigDecimal	r37_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r37_crm_sub_rwa_ris_crm;
	private BigDecimal	r37_crm_sub_rwa_cov_crm;
	private BigDecimal	r37_crm_sub_rwa_org_cou;
	private BigDecimal	r37_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r37_crm_comp_col_expo_elig;
	private BigDecimal	r37_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r37_crm_comp_col_elig_fin_hai;
	private BigDecimal	r37_crm_comp_col_expo_val;
	private BigDecimal	r37_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r37_rwa_unsec_expo_cre_ris;
	private BigDecimal	r37_rwa_unsec_expo;
	private BigDecimal	r37_rwa_tot_ris_wei_ass;
	
	private String	r38_exposure_class;
	private BigDecimal	r38_expo_crm;
	private BigDecimal	r38_spe_pro_expo;
	private BigDecimal	r38_amt_elig_sht_net;
	private BigDecimal	r38_tot_expo_net_spe;
	private BigDecimal	r38_crm_sub_elig_sub_app;
	private BigDecimal	r38_crm_sub_non_col_guar;
	private BigDecimal	r38_crm_sub_non_col_cre_der;
	private BigDecimal	r38_crm_sub_col_elig_cash;
	private BigDecimal	r38_crm_sub_col_elig_trea_bills;
	private BigDecimal	r38_crm_sub_col_elig_deb_sec;
	private BigDecimal	r38_crm_sub_col_elig_equi;
	private BigDecimal	r38_crm_sub_col_elig_unit_tru;
	private BigDecimal	r38_crm_sub_col_exp_cov;
	private BigDecimal	r38_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r38_crm_sub_rwa_ris_crm;
	private BigDecimal	r38_crm_sub_rwa_cov_crm;
	private BigDecimal	r38_crm_sub_rwa_org_cou;
	private BigDecimal	r38_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r38_crm_comp_col_expo_elig;
	private BigDecimal	r38_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r38_crm_comp_col_elig_fin_hai;
	private BigDecimal	r38_crm_comp_col_expo_val;
	private BigDecimal	r38_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r38_rwa_unsec_expo_cre_ris;
	private BigDecimal	r38_rwa_unsec_expo;
	private BigDecimal	r38_rwa_tot_ris_wei_ass;
	
	private String	r39_exposure_class;
	private BigDecimal	r39_expo_crm;
	private BigDecimal	r39_spe_pro_expo;
	private BigDecimal	r39_amt_elig_sht_net;
	private BigDecimal	r39_tot_expo_net_spe;
	private BigDecimal	r39_crm_sub_elig_sub_app;
	private BigDecimal	r39_crm_sub_non_col_guar;
	private BigDecimal	r39_crm_sub_non_col_cre_der;
	private BigDecimal	r39_crm_sub_col_elig_cash;
	private BigDecimal	r39_crm_sub_col_elig_trea_bills;
	private BigDecimal	r39_crm_sub_col_elig_deb_sec;
	private BigDecimal	r39_crm_sub_col_elig_equi;
	private BigDecimal	r39_crm_sub_col_elig_unit_tru;
	private BigDecimal	r39_crm_sub_col_exp_cov;
	private BigDecimal	r39_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r39_crm_sub_rwa_ris_crm;
	private BigDecimal	r39_crm_sub_rwa_cov_crm;
	private BigDecimal	r39_crm_sub_rwa_org_cou;
	private BigDecimal	r39_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r39_crm_comp_col_expo_elig;
	private BigDecimal	r39_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r39_crm_comp_col_elig_fin_hai;
	private BigDecimal	r39_crm_comp_col_expo_val;
	private BigDecimal	r39_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r39_rwa_unsec_expo_cre_ris;
	private BigDecimal	r39_rwa_unsec_expo;
	private BigDecimal	r39_rwa_tot_ris_wei_ass;
	
	private String	r40_exposure_class;
	private BigDecimal	r40_expo_crm;
	private BigDecimal	r40_spe_pro_expo;
	private BigDecimal	r40_amt_elig_sht_net;
	private BigDecimal	r40_tot_expo_net_spe;
	private BigDecimal	r40_crm_sub_elig_sub_app;
	private BigDecimal	r40_crm_sub_non_col_guar;
	private BigDecimal	r40_crm_sub_non_col_cre_der;
	private BigDecimal	r40_crm_sub_col_elig_cash;
	private BigDecimal	r40_crm_sub_col_elig_trea_bills;
	private BigDecimal	r40_crm_sub_col_elig_deb_sec;
	private BigDecimal	r40_crm_sub_col_elig_equi;
	private BigDecimal	r40_crm_sub_col_elig_unit_tru;
	private BigDecimal	r40_crm_sub_col_exp_cov;
	private BigDecimal	r40_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r40_crm_sub_rwa_ris_crm;
	private BigDecimal	r40_crm_sub_rwa_cov_crm;
	private BigDecimal	r40_crm_sub_rwa_org_cou;
	private BigDecimal	r40_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r40_crm_comp_col_expo_elig;
	private BigDecimal	r40_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r40_crm_comp_col_elig_fin_hai;
	private BigDecimal	r40_crm_comp_col_expo_val;
	private BigDecimal	r40_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r40_rwa_unsec_expo_cre_ris;
	private BigDecimal	r40_rwa_unsec_expo;
	private BigDecimal	r40_rwa_tot_ris_wei_ass;
	
	private String	r41_exposure_class;
	private BigDecimal	r41_expo_crm;
	private BigDecimal	r41_spe_pro_expo;
	private BigDecimal	r41_amt_elig_sht_net;
	private BigDecimal	r41_tot_expo_net_spe;
	private BigDecimal	r41_crm_sub_elig_sub_app;
	private BigDecimal	r41_crm_sub_non_col_guar;
	private BigDecimal	r41_crm_sub_non_col_cre_der;
	private BigDecimal	r41_crm_sub_col_elig_cash;
	private BigDecimal	r41_crm_sub_col_elig_trea_bills;
	private BigDecimal	r41_crm_sub_col_elig_deb_sec;
	private BigDecimal	r41_crm_sub_col_elig_equi;
	private BigDecimal	r41_crm_sub_col_elig_unit_tru;
	private BigDecimal	r41_crm_sub_col_exp_cov;
	private BigDecimal	r41_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r41_crm_sub_rwa_ris_crm;
	private BigDecimal	r41_crm_sub_rwa_cov_crm;
	private BigDecimal	r41_crm_sub_rwa_org_cou;
	private BigDecimal	r41_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r41_crm_comp_col_expo_elig;
	private BigDecimal	r41_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r41_crm_comp_col_elig_fin_hai;
	private BigDecimal	r41_crm_comp_col_expo_val;
	private BigDecimal	r41_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r41_rwa_unsec_expo_cre_ris;
	private BigDecimal	r41_rwa_unsec_expo;
	private BigDecimal	r41_rwa_tot_ris_wei_ass;
	
	private String	r42_exposure_class;
	private BigDecimal	r42_expo_crm;
	private BigDecimal	r42_spe_pro_expo;
	private BigDecimal	r42_amt_elig_sht_net;
	private BigDecimal	r42_tot_expo_net_spe;
	private BigDecimal	r42_crm_sub_elig_sub_app;
	private BigDecimal	r42_crm_sub_non_col_guar;
	private BigDecimal	r42_crm_sub_non_col_cre_der;
	private BigDecimal	r42_crm_sub_col_elig_cash;
	private BigDecimal	r42_crm_sub_col_elig_trea_bills;
	private BigDecimal	r42_crm_sub_col_elig_deb_sec;
	private BigDecimal	r42_crm_sub_col_elig_equi;
	private BigDecimal	r42_crm_sub_col_elig_unit_tru;
	private BigDecimal	r42_crm_sub_col_exp_cov;
	private BigDecimal	r42_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r42_crm_sub_rwa_ris_crm;
	private BigDecimal	r42_crm_sub_rwa_cov_crm;
	private BigDecimal	r42_crm_sub_rwa_org_cou;
	private BigDecimal	r42_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r42_crm_comp_col_expo_elig;
	private BigDecimal	r42_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r42_crm_comp_col_elig_fin_hai;
	private BigDecimal	r42_crm_comp_col_expo_val;
	private BigDecimal	r42_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r42_rwa_unsec_expo_cre_ris;
	private BigDecimal	r42_rwa_unsec_expo;
	private BigDecimal	r42_rwa_tot_ris_wei_ass;
	
	private String	r43_exposure_class;
	private BigDecimal	r43_expo_crm;
	private BigDecimal	r43_spe_pro_expo;
	private BigDecimal	r43_amt_elig_sht_net;
	private BigDecimal	r43_tot_expo_net_spe;
	private BigDecimal	r43_crm_sub_elig_sub_app;
	private BigDecimal	r43_crm_sub_non_col_guar;
	private BigDecimal	r43_crm_sub_non_col_cre_der;
	private BigDecimal	r43_crm_sub_col_elig_cash;
	private BigDecimal	r43_crm_sub_col_elig_trea_bills;
	private BigDecimal	r43_crm_sub_col_elig_deb_sec;
	private BigDecimal	r43_crm_sub_col_elig_equi;
	private BigDecimal	r43_crm_sub_col_elig_unit_tru;
	private BigDecimal	r43_crm_sub_col_exp_cov;
	private BigDecimal	r43_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r43_crm_sub_rwa_ris_crm;
	private BigDecimal	r43_crm_sub_rwa_cov_crm;
	private BigDecimal	r43_crm_sub_rwa_org_cou;
	private BigDecimal	r43_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r43_crm_comp_col_expo_elig;
	private BigDecimal	r43_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r43_crm_comp_col_elig_fin_hai;
	private BigDecimal	r43_crm_comp_col_expo_val;
	private BigDecimal	r43_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r43_rwa_unsec_expo_cre_ris;
	private BigDecimal	r43_rwa_unsec_expo;
	private BigDecimal	r43_rwa_tot_ris_wei_ass;
	
	private String	r44_exposure_class;
	private BigDecimal	r44_expo_crm;
	private BigDecimal	r44_spe_pro_expo;
	private BigDecimal	r44_amt_elig_sht_net;
	private BigDecimal	r44_tot_expo_net_spe;
	private BigDecimal	r44_crm_sub_elig_sub_app;
	private BigDecimal	r44_crm_sub_non_col_guar;
	private BigDecimal	r44_crm_sub_non_col_cre_der;
	private BigDecimal	r44_crm_sub_col_elig_cash;
	private BigDecimal	r44_crm_sub_col_elig_trea_bills;
	private BigDecimal	r44_crm_sub_col_elig_deb_sec;
	private BigDecimal	r44_crm_sub_col_elig_equi;
	private BigDecimal	r44_crm_sub_col_elig_unit_tru;
	private BigDecimal	r44_crm_sub_col_exp_cov;
	private BigDecimal	r44_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r44_crm_sub_rwa_ris_crm;
	private BigDecimal	r44_crm_sub_rwa_cov_crm;
	private BigDecimal	r44_crm_sub_rwa_org_cou;
	private BigDecimal	r44_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r44_crm_comp_col_expo_elig;
	private BigDecimal	r44_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r44_crm_comp_col_elig_fin_hai;
	private BigDecimal	r44_crm_comp_col_expo_val;
	private BigDecimal	r44_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r44_rwa_unsec_expo_cre_ris;
	private BigDecimal	r44_rwa_unsec_expo;
	private BigDecimal	r44_rwa_tot_ris_wei_ass;
	
	private String	r47_exposure_class;
	private BigDecimal	r47_expo_crm;
	private BigDecimal	r47_spe_pro_expo;
	private BigDecimal	r47_amt_elig_sht_net;
	private BigDecimal	r47_tot_expo_net_spe;
	private BigDecimal	r47_crm_sub_elig_sub_app;
	private BigDecimal	r47_crm_sub_non_col_guar;
	private BigDecimal	r47_crm_sub_non_col_cre_der;
	private BigDecimal	r47_crm_sub_col_elig_cash;
	private BigDecimal	r47_crm_sub_col_elig_trea_bills;
	private BigDecimal	r47_crm_sub_col_elig_deb_sec;
	private BigDecimal	r47_crm_sub_col_elig_equi;
	private BigDecimal	r47_crm_sub_col_elig_unit_tru;
	private BigDecimal	r47_crm_sub_col_exp_cov;
	private BigDecimal	r47_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r47_crm_sub_rwa_ris_crm;
	private BigDecimal	r47_crm_sub_rwa_cov_crm;
	private BigDecimal	r47_crm_sub_rwa_org_cou;
	private BigDecimal	r47_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r47_crm_comp_col_expo_elig;
	private BigDecimal	r47_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r47_crm_comp_col_elig_fin_hai;
	private BigDecimal	r47_crm_comp_col_expo_val;
	private BigDecimal	r47_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r47_rwa_unsec_expo_cre_ris;
	private BigDecimal	r47_rwa_unsec_expo;
	private BigDecimal	r47_rwa_tot_ris_wei_ass;
	
	private String	r48_exposure_class;
	private BigDecimal	r48_expo_crm;
	private BigDecimal	r48_spe_pro_expo;
	private BigDecimal	r48_amt_elig_sht_net;
	private BigDecimal	r48_tot_expo_net_spe;
	private BigDecimal	r48_crm_sub_elig_sub_app;
	private BigDecimal	r48_crm_sub_non_col_guar;
	private BigDecimal	r48_crm_sub_non_col_cre_der;
	private BigDecimal	r48_crm_sub_col_elig_cash;
	private BigDecimal	r48_crm_sub_col_elig_trea_bills;
	private BigDecimal	r48_crm_sub_col_elig_deb_sec;
	private BigDecimal	r48_crm_sub_col_elig_equi;
	private BigDecimal	r48_crm_sub_col_elig_unit_tru;
	private BigDecimal	r48_crm_sub_col_exp_cov;
	private BigDecimal	r48_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r48_crm_sub_rwa_ris_crm;
	private BigDecimal	r48_crm_sub_rwa_cov_crm;
	private BigDecimal	r48_crm_sub_rwa_org_cou;
	private BigDecimal	r48_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r48_crm_comp_col_expo_elig;
	private BigDecimal	r48_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r48_crm_comp_col_elig_fin_hai;
	private BigDecimal	r48_crm_comp_col_expo_val;
	private BigDecimal	r48_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r48_rwa_unsec_expo_cre_ris;
	private BigDecimal	r48_rwa_unsec_expo;
	private BigDecimal	r48_rwa_tot_ris_wei_ass;
	
	private String	r49_exposure_class;
	private BigDecimal	r49_expo_crm;
	private BigDecimal	r49_spe_pro_expo;
	private BigDecimal	r49_amt_elig_sht_net;
	private BigDecimal	r49_tot_expo_net_spe;
	private BigDecimal	r49_crm_sub_elig_sub_app;
	private BigDecimal	r49_crm_sub_non_col_guar;
	private BigDecimal	r49_crm_sub_non_col_cre_der;
	private BigDecimal	r49_crm_sub_col_elig_cash;
	private BigDecimal	r49_crm_sub_col_elig_trea_bills;
	private BigDecimal	r49_crm_sub_col_elig_deb_sec;
	private BigDecimal	r49_crm_sub_col_elig_equi;
	private BigDecimal	r49_crm_sub_col_elig_unit_tru;
	private BigDecimal	r49_crm_sub_col_exp_cov;
	private BigDecimal	r49_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r49_crm_sub_rwa_ris_crm;
	private BigDecimal	r49_crm_sub_rwa_cov_crm;
	private BigDecimal	r49_crm_sub_rwa_org_cou;
	private BigDecimal	r49_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r49_crm_comp_col_expo_elig;
	private BigDecimal	r49_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r49_crm_comp_col_elig_fin_hai;
	private BigDecimal	r49_crm_comp_col_expo_val;
	private BigDecimal	r49_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r49_rwa_unsec_expo_cre_ris;
	private BigDecimal	r49_rwa_unsec_expo;
	private BigDecimal	r49_rwa_tot_ris_wei_ass;
	
	private String	r50_exposure_class;
	private BigDecimal	r50_expo_crm;
	private BigDecimal	r50_spe_pro_expo;
	private BigDecimal	r50_amt_elig_sht_net;
	private BigDecimal	r50_tot_expo_net_spe;
	private BigDecimal	r50_crm_sub_elig_sub_app;
	private BigDecimal	r50_crm_sub_non_col_guar;
	private BigDecimal	r50_crm_sub_non_col_cre_der;
	private BigDecimal	r50_crm_sub_col_elig_cash;
	private BigDecimal	r50_crm_sub_col_elig_trea_bills;
	private BigDecimal	r50_crm_sub_col_elig_deb_sec;
	private BigDecimal	r50_crm_sub_col_elig_equi;
	private BigDecimal	r50_crm_sub_col_elig_unit_tru;
	private BigDecimal	r50_crm_sub_col_exp_cov;
	private BigDecimal	r50_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r50_crm_sub_rwa_ris_crm;
	private BigDecimal	r50_crm_sub_rwa_cov_crm;
	private BigDecimal	r50_crm_sub_rwa_org_cou;
	private BigDecimal	r50_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r50_crm_comp_col_expo_elig;
	private BigDecimal	r50_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r50_crm_comp_col_elig_fin_hai;
	private BigDecimal	r50_crm_comp_col_expo_val;
	private BigDecimal	r50_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r50_rwa_unsec_expo_cre_ris;
	private BigDecimal	r50_rwa_unsec_expo;
	private BigDecimal	r50_rwa_tot_ris_wei_ass;
	
	private String	r51_exposure_class;
	private BigDecimal	r51_expo_crm;
	private BigDecimal	r51_spe_pro_expo;
	private BigDecimal	r51_amt_elig_sht_net;
	private BigDecimal	r51_tot_expo_net_spe;
	private BigDecimal	r51_crm_sub_elig_sub_app;
	private BigDecimal	r51_crm_sub_non_col_guar;
	private BigDecimal	r51_crm_sub_non_col_cre_der;
	private BigDecimal	r51_crm_sub_col_elig_cash;
	private BigDecimal	r51_crm_sub_col_elig_trea_bills;
	private BigDecimal	r51_crm_sub_col_elig_deb_sec;
	private BigDecimal	r51_crm_sub_col_elig_equi;
	private BigDecimal	r51_crm_sub_col_elig_unit_tru;
	private BigDecimal	r51_crm_sub_col_exp_cov;
	private BigDecimal	r51_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r51_crm_sub_rwa_ris_crm;
	private BigDecimal	r51_crm_sub_rwa_cov_crm;
	private BigDecimal	r51_crm_sub_rwa_org_cou;
	private BigDecimal	r51_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r51_crm_comp_col_expo_elig;
	private BigDecimal	r51_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r51_crm_comp_col_elig_fin_hai;
	private BigDecimal	r51_crm_comp_col_expo_val;
	private BigDecimal	r51_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r51_rwa_unsec_expo_cre_ris;
	private BigDecimal	r51_rwa_unsec_expo;
	private BigDecimal	r51_rwa_tot_ris_wei_ass;
	
	private String	r52_exposure_class;
	private BigDecimal	r52_expo_crm;
	private BigDecimal	r52_spe_pro_expo;
	private BigDecimal	r52_amt_elig_sht_net;
	private BigDecimal	r52_tot_expo_net_spe;
	private BigDecimal	r52_crm_sub_elig_sub_app;
	private BigDecimal	r52_crm_sub_non_col_guar;
	private BigDecimal	r52_crm_sub_non_col_cre_der;
	private BigDecimal	r52_crm_sub_col_elig_cash;
	private BigDecimal	r52_crm_sub_col_elig_trea_bills;
	private BigDecimal	r52_crm_sub_col_elig_deb_sec;
	private BigDecimal	r52_crm_sub_col_elig_equi;
	private BigDecimal	r52_crm_sub_col_elig_unit_tru;
	private BigDecimal	r52_crm_sub_col_exp_cov;
	private BigDecimal	r52_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r52_crm_sub_rwa_ris_crm;
	private BigDecimal	r52_crm_sub_rwa_cov_crm;
	private BigDecimal	r52_crm_sub_rwa_org_cou;
	private BigDecimal	r52_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r52_crm_comp_col_expo_elig;
	private BigDecimal	r52_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r52_crm_comp_col_elig_fin_hai;
	private BigDecimal	r52_crm_comp_col_expo_val;
	private BigDecimal	r52_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r52_rwa_unsec_expo_cre_ris;
	private BigDecimal	r52_rwa_unsec_expo;
	private BigDecimal	r52_rwa_tot_ris_wei_ass;
	
	private String	r53_exposure_class;
	private BigDecimal	r53_expo_crm;
	private BigDecimal	r53_spe_pro_expo;
	private BigDecimal	r53_amt_elig_sht_net;
	private BigDecimal	r53_tot_expo_net_spe;
	private BigDecimal	r53_crm_sub_elig_sub_app;
	private BigDecimal	r53_crm_sub_non_col_guar;
	private BigDecimal	r53_crm_sub_non_col_cre_der;
	private BigDecimal	r53_crm_sub_col_elig_cash;
	private BigDecimal	r53_crm_sub_col_elig_trea_bills;
	private BigDecimal	r53_crm_sub_col_elig_deb_sec;
	private BigDecimal	r53_crm_sub_col_elig_equi;
	private BigDecimal	r53_crm_sub_col_elig_unit_tru;
	private BigDecimal	r53_crm_sub_col_exp_cov;
	private BigDecimal	r53_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r53_crm_sub_rwa_ris_crm;
	private BigDecimal	r53_crm_sub_rwa_cov_crm;
	private BigDecimal	r53_crm_sub_rwa_org_cou;
	private BigDecimal	r53_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r53_crm_comp_col_expo_elig;
	private BigDecimal	r53_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r53_crm_comp_col_elig_fin_hai;
	private BigDecimal	r53_crm_comp_col_expo_val;
	private BigDecimal	r53_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r53_rwa_unsec_expo_cre_ris;
	private BigDecimal	r53_rwa_unsec_expo;
	private BigDecimal	r53_rwa_tot_ris_wei_ass;
	
	private String	r54_exposure_class;
	private BigDecimal	r54_expo_crm;
	private BigDecimal	r54_spe_pro_expo;
	private BigDecimal	r54_amt_elig_sht_net;
	private BigDecimal	r54_tot_expo_net_spe;
	private BigDecimal	r54_crm_sub_elig_sub_app;
	private BigDecimal	r54_crm_sub_non_col_guar;
	private BigDecimal	r54_crm_sub_non_col_cre_der;
	private BigDecimal	r54_crm_sub_col_elig_cash;
	private BigDecimal	r54_crm_sub_col_elig_trea_bills;
	private BigDecimal	r54_crm_sub_col_elig_deb_sec;
	private BigDecimal	r54_crm_sub_col_elig_equi;
	private BigDecimal	r54_crm_sub_col_elig_unit_tru;
	private BigDecimal	r54_crm_sub_col_exp_cov;
	private BigDecimal	r54_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r54_crm_sub_rwa_ris_crm;
	private BigDecimal	r54_crm_sub_rwa_cov_crm;
	private BigDecimal	r54_crm_sub_rwa_org_cou;
	private BigDecimal	r54_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r54_crm_comp_col_expo_elig;
	private BigDecimal	r54_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r54_crm_comp_col_elig_fin_hai;
	private BigDecimal	r54_crm_comp_col_expo_val;
	private BigDecimal	r54_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r54_rwa_unsec_expo_cre_ris;
	private BigDecimal	r54_rwa_unsec_expo;
	private BigDecimal	r54_rwa_tot_ris_wei_ass;
	
	private String	r55_exposure_class;
	private BigDecimal	r55_expo_crm;
	private BigDecimal	r55_spe_pro_expo;
	private BigDecimal	r55_amt_elig_sht_net;
	private BigDecimal	r55_tot_expo_net_spe;
	private BigDecimal	r55_crm_sub_elig_sub_app;
	private BigDecimal	r55_crm_sub_non_col_guar;
	private BigDecimal	r55_crm_sub_non_col_cre_der;
	private BigDecimal	r55_crm_sub_col_elig_cash;
	private BigDecimal	r55_crm_sub_col_elig_trea_bills;
	private BigDecimal	r55_crm_sub_col_elig_deb_sec;
	private BigDecimal	r55_crm_sub_col_elig_equi;
	private BigDecimal	r55_crm_sub_col_elig_unit_tru;
	private BigDecimal	r55_crm_sub_col_exp_cov;
	private BigDecimal	r55_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r55_crm_sub_rwa_ris_crm;
	private BigDecimal	r55_crm_sub_rwa_cov_crm;
	private BigDecimal	r55_crm_sub_rwa_org_cou;
	private BigDecimal	r55_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r55_crm_comp_col_expo_elig;
	private BigDecimal	r55_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r55_crm_comp_col_elig_fin_hai;
	private BigDecimal	r55_crm_comp_col_expo_val;
	private BigDecimal	r55_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r55_rwa_unsec_expo_cre_ris;
	private BigDecimal	r55_rwa_unsec_expo;
	private BigDecimal	r55_rwa_tot_ris_wei_ass;
	
	private String	r56_exposure_class;
	private BigDecimal	r56_expo_crm;
	private BigDecimal	r56_spe_pro_expo;
	private BigDecimal	r56_amt_elig_sht_net;
	private BigDecimal	r56_tot_expo_net_spe;
	private BigDecimal	r56_crm_sub_elig_sub_app;
	private BigDecimal	r56_crm_sub_non_col_guar;
	private BigDecimal	r56_crm_sub_non_col_cre_der;
	private BigDecimal	r56_crm_sub_col_elig_cash;
	private BigDecimal	r56_crm_sub_col_elig_trea_bills;
	private BigDecimal	r56_crm_sub_col_elig_deb_sec;
	private BigDecimal	r56_crm_sub_col_elig_equi;
	private BigDecimal	r56_crm_sub_col_elig_unit_tru;
	private BigDecimal	r56_crm_sub_col_exp_cov;
	private BigDecimal	r56_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r56_crm_sub_rwa_ris_crm;
	private BigDecimal	r56_crm_sub_rwa_cov_crm;
	private BigDecimal	r56_crm_sub_rwa_org_cou;
	private BigDecimal	r56_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r56_crm_comp_col_expo_elig;
	private BigDecimal	r56_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r56_crm_comp_col_elig_fin_hai;
	private BigDecimal	r56_crm_comp_col_expo_val;
	private BigDecimal	r56_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r56_rwa_unsec_expo_cre_ris;
	private BigDecimal	r56_rwa_unsec_expo;
	private BigDecimal	r56_rwa_tot_ris_wei_ass;
	
	private String	r57_exposure_class;
	private BigDecimal	r57_expo_crm;
	private BigDecimal	r57_spe_pro_expo;
	private BigDecimal	r57_amt_elig_sht_net;
	private BigDecimal	r57_tot_expo_net_spe;
	private BigDecimal	r57_crm_sub_elig_sub_app;
	private BigDecimal	r57_crm_sub_non_col_guar;
	private BigDecimal	r57_crm_sub_non_col_cre_der;
	private BigDecimal	r57_crm_sub_col_elig_cash;
	private BigDecimal	r57_crm_sub_col_elig_trea_bills;
	private BigDecimal	r57_crm_sub_col_elig_deb_sec;
	private BigDecimal	r57_crm_sub_col_elig_equi;
	private BigDecimal	r57_crm_sub_col_elig_unit_tru;
	private BigDecimal	r57_crm_sub_col_exp_cov;
	private BigDecimal	r57_crm_sub_col_elig_exp_not_cov;
	private BigDecimal	r57_crm_sub_rwa_ris_crm;
	private BigDecimal	r57_crm_sub_rwa_cov_crm;
	private BigDecimal	r57_crm_sub_rwa_org_cou;
	private BigDecimal	r57_crm_sub_rwa_not_cov_crm;
	private BigDecimal	r57_crm_comp_col_expo_elig;
	private BigDecimal	r57_crm_comp_col_elig_expo_vol_adj;
	private BigDecimal	r57_crm_comp_col_elig_fin_hai;
	private BigDecimal	r57_crm_comp_col_expo_val;
	private BigDecimal	r57_rwa_elig_expo_not_cov_crm;
	private BigDecimal	r57_rwa_unsec_expo_cre_ris;
	private BigDecimal	r57_rwa_unsec_expo;
	private BigDecimal	r57_rwa_tot_ris_wei_ass;

	
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
	
	
	public String getR19_exposure_class() {
		return r19_exposure_class;
	}
	public void setR19_exposure_class(String r19_exposure_class) {
		this.r19_exposure_class = r19_exposure_class;
	}
	
	public BigDecimal getR19_spe_pro_expo() {
		return r19_spe_pro_expo;
	}
	public void setR19_spe_pro_expo(BigDecimal r19_spe_pro_expo) {
		this.r19_spe_pro_expo = r19_spe_pro_expo;
	}
	public BigDecimal getR19_amt_elig_sht_net() {
		return r19_amt_elig_sht_net;
	}
	public void setR19_amt_elig_sht_net(BigDecimal r19_amt_elig_sht_net) {
		this.r19_amt_elig_sht_net = r19_amt_elig_sht_net;
	}
	public BigDecimal getR19_tot_expo_net_spe() {
		return r19_tot_expo_net_spe;
	}
	public void setR19_tot_expo_net_spe(BigDecimal r19_tot_expo_net_spe) {
		this.r19_tot_expo_net_spe = r19_tot_expo_net_spe;
	}
	public BigDecimal getR19_crm_sub_elig_sub_app() {
		return r19_crm_sub_elig_sub_app;
	}
	public void setR19_crm_sub_elig_sub_app(BigDecimal r19_crm_sub_elig_sub_app) {
		this.r19_crm_sub_elig_sub_app = r19_crm_sub_elig_sub_app;
	}
	public BigDecimal getR19_crm_sub_non_col_guar() {
		return r19_crm_sub_non_col_guar;
	}
	public void setR19_crm_sub_non_col_guar(BigDecimal r19_crm_sub_non_col_guar) {
		this.r19_crm_sub_non_col_guar = r19_crm_sub_non_col_guar;
	}
	public BigDecimal getR19_crm_sub_non_col_cre_der() {
		return r19_crm_sub_non_col_cre_der;
	}
	public void setR19_crm_sub_non_col_cre_der(BigDecimal r19_crm_sub_non_col_cre_der) {
		this.r19_crm_sub_non_col_cre_der = r19_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR19_crm_sub_col_elig_cash() {
		return r19_crm_sub_col_elig_cash;
	}
	public void setR19_crm_sub_col_elig_cash(BigDecimal r19_crm_sub_col_elig_cash) {
		this.r19_crm_sub_col_elig_cash = r19_crm_sub_col_elig_cash;
	}
	public BigDecimal getR19_crm_sub_col_elig_trea_bills() {
		return r19_crm_sub_col_elig_trea_bills;
	}
	public void setR19_crm_sub_col_elig_trea_bills(BigDecimal r19_crm_sub_col_elig_trea_bills) {
		this.r19_crm_sub_col_elig_trea_bills = r19_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR19_crm_sub_col_elig_deb_sec() {
		return r19_crm_sub_col_elig_deb_sec;
	}
	public void setR19_crm_sub_col_elig_deb_sec(BigDecimal r19_crm_sub_col_elig_deb_sec) {
		this.r19_crm_sub_col_elig_deb_sec = r19_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR19_crm_sub_col_elig_equi() {
		return r19_crm_sub_col_elig_equi;
	}
	public void setR19_crm_sub_col_elig_equi(BigDecimal r19_crm_sub_col_elig_equi) {
		this.r19_crm_sub_col_elig_equi = r19_crm_sub_col_elig_equi;
	}
	public BigDecimal getR19_crm_sub_col_elig_unit_tru() {
		return r19_crm_sub_col_elig_unit_tru;
	}
	public void setR19_crm_sub_col_elig_unit_tru(BigDecimal r19_crm_sub_col_elig_unit_tru) {
		this.r19_crm_sub_col_elig_unit_tru = r19_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR19_crm_sub_col_exp_cov() {
		return r19_crm_sub_col_exp_cov;
	}
	public void setR19_crm_sub_col_exp_cov(BigDecimal r19_crm_sub_col_exp_cov) {
		this.r19_crm_sub_col_exp_cov = r19_crm_sub_col_exp_cov;
	}
	public BigDecimal getR19_crm_sub_col_elig_exp_not_cov() {
		return r19_crm_sub_col_elig_exp_not_cov;
	}
	public void setR19_crm_sub_col_elig_exp_not_cov(BigDecimal r19_crm_sub_col_elig_exp_not_cov) {
		this.r19_crm_sub_col_elig_exp_not_cov = r19_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR19_crm_sub_rwa_ris_crm() {
		return r19_crm_sub_rwa_ris_crm;
	}
	public void setR19_crm_sub_rwa_ris_crm(BigDecimal r19_crm_sub_rwa_ris_crm) {
		this.r19_crm_sub_rwa_ris_crm = r19_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR19_crm_sub_rwa_cov_crm() {
		return r19_crm_sub_rwa_cov_crm;
	}
	public void setR19_crm_sub_rwa_cov_crm(BigDecimal r19_crm_sub_rwa_cov_crm) {
		this.r19_crm_sub_rwa_cov_crm = r19_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR19_crm_sub_rwa_org_cou() {
		return r19_crm_sub_rwa_org_cou;
	}
	public void setR19_crm_sub_rwa_org_cou(BigDecimal r19_crm_sub_rwa_org_cou) {
		this.r19_crm_sub_rwa_org_cou = r19_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR19_crm_sub_rwa_not_cov_crm() {
		return r19_crm_sub_rwa_not_cov_crm;
	}
	public void setR19_crm_sub_rwa_not_cov_crm(BigDecimal r19_crm_sub_rwa_not_cov_crm) {
		this.r19_crm_sub_rwa_not_cov_crm = r19_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR19_crm_comp_col_expo_elig() {
		return r19_crm_comp_col_expo_elig;
	}
	public void setR19_crm_comp_col_expo_elig(BigDecimal r19_crm_comp_col_expo_elig) {
		this.r19_crm_comp_col_expo_elig = r19_crm_comp_col_expo_elig;
	}
	public BigDecimal getR19_crm_comp_col_elig_expo_vol_adj() {
		return r19_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR19_crm_comp_col_elig_expo_vol_adj(BigDecimal r19_crm_comp_col_elig_expo_vol_adj) {
		this.r19_crm_comp_col_elig_expo_vol_adj = r19_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR19_crm_comp_col_elig_fin_hai() {
		return r19_crm_comp_col_elig_fin_hai;
	}
	public void setR19_crm_comp_col_elig_fin_hai(BigDecimal r19_crm_comp_col_elig_fin_hai) {
		this.r19_crm_comp_col_elig_fin_hai = r19_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR19_crm_comp_col_expo_val() {
		return r19_crm_comp_col_expo_val;
	}
	public void setR19_crm_comp_col_expo_val(BigDecimal r19_crm_comp_col_expo_val) {
		this.r19_crm_comp_col_expo_val = r19_crm_comp_col_expo_val;
	}
	public BigDecimal getR19_rwa_elig_expo_not_cov_crm() {
		return r19_rwa_elig_expo_not_cov_crm;
	}
	public void setR19_rwa_elig_expo_not_cov_crm(BigDecimal r19_rwa_elig_expo_not_cov_crm) {
		this.r19_rwa_elig_expo_not_cov_crm = r19_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR19_rwa_unsec_expo_cre_ris() {
		return r19_rwa_unsec_expo_cre_ris;
	}
	public void setR19_rwa_unsec_expo_cre_ris(BigDecimal r19_rwa_unsec_expo_cre_ris) {
		this.r19_rwa_unsec_expo_cre_ris = r19_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR19_rwa_unsec_expo() {
		return r19_rwa_unsec_expo;
	}
	public void setR19_rwa_unsec_expo(BigDecimal r19_rwa_unsec_expo) {
		this.r19_rwa_unsec_expo = r19_rwa_unsec_expo;
	}
	public BigDecimal getR19_rwa_tot_ris_wei_ass() {
		return r19_rwa_tot_ris_wei_ass;
	}
	public void setR19_rwa_tot_ris_wei_ass(BigDecimal r19_rwa_tot_ris_wei_ass) {
		this.r19_rwa_tot_ris_wei_ass = r19_rwa_tot_ris_wei_ass;
	}
	public String getR20_exposure_class() {
		return r20_exposure_class;
	}
	public void setR20_exposure_class(String r20_exposure_class) {
		this.r20_exposure_class = r20_exposure_class;
	}
	public BigDecimal getR20_expo_crm() {
		return r20_expo_crm;
	}
	public void setR20_expo_crm(BigDecimal r20_expo_crm) {
		this.r20_expo_crm = r20_expo_crm;
	}
	public BigDecimal getR20_spe_pro_expo() {
		return r20_spe_pro_expo;
	}
	public void setR20_spe_pro_expo(BigDecimal r20_spe_pro_expo) {
		this.r20_spe_pro_expo = r20_spe_pro_expo;
	}
	public BigDecimal getR20_amt_elig_sht_net() {
		return r20_amt_elig_sht_net;
	}
	public void setR20_amt_elig_sht_net(BigDecimal r20_amt_elig_sht_net) {
		this.r20_amt_elig_sht_net = r20_amt_elig_sht_net;
	}
	public BigDecimal getR20_tot_expo_net_spe() {
		return r20_tot_expo_net_spe;
	}
	public void setR20_tot_expo_net_spe(BigDecimal r20_tot_expo_net_spe) {
		this.r20_tot_expo_net_spe = r20_tot_expo_net_spe;
	}
	public BigDecimal getR20_crm_sub_elig_sub_app() {
		return r20_crm_sub_elig_sub_app;
	}
	public void setR20_crm_sub_elig_sub_app(BigDecimal r20_crm_sub_elig_sub_app) {
		this.r20_crm_sub_elig_sub_app = r20_crm_sub_elig_sub_app;
	}
	public BigDecimal getR20_crm_sub_non_col_guar() {
		return r20_crm_sub_non_col_guar;
	}
	public void setR20_crm_sub_non_col_guar(BigDecimal r20_crm_sub_non_col_guar) {
		this.r20_crm_sub_non_col_guar = r20_crm_sub_non_col_guar;
	}
	public BigDecimal getR20_crm_sub_non_col_cre_der() {
		return r20_crm_sub_non_col_cre_der;
	}
	public void setR20_crm_sub_non_col_cre_der(BigDecimal r20_crm_sub_non_col_cre_der) {
		this.r20_crm_sub_non_col_cre_der = r20_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR20_crm_sub_col_elig_cash() {
		return r20_crm_sub_col_elig_cash;
	}
	public void setR20_crm_sub_col_elig_cash(BigDecimal r20_crm_sub_col_elig_cash) {
		this.r20_crm_sub_col_elig_cash = r20_crm_sub_col_elig_cash;
	}
	public BigDecimal getR20_crm_sub_col_elig_trea_bills() {
		return r20_crm_sub_col_elig_trea_bills;
	}
	public void setR20_crm_sub_col_elig_trea_bills(BigDecimal r20_crm_sub_col_elig_trea_bills) {
		this.r20_crm_sub_col_elig_trea_bills = r20_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR20_crm_sub_col_elig_deb_sec() {
		return r20_crm_sub_col_elig_deb_sec;
	}
	public void setR20_crm_sub_col_elig_deb_sec(BigDecimal r20_crm_sub_col_elig_deb_sec) {
		this.r20_crm_sub_col_elig_deb_sec = r20_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR20_crm_sub_col_elig_equi() {
		return r20_crm_sub_col_elig_equi;
	}
	public void setR20_crm_sub_col_elig_equi(BigDecimal r20_crm_sub_col_elig_equi) {
		this.r20_crm_sub_col_elig_equi = r20_crm_sub_col_elig_equi;
	}
	public BigDecimal getR20_crm_sub_col_elig_unit_tru() {
		return r20_crm_sub_col_elig_unit_tru;
	}
	public void setR20_crm_sub_col_elig_unit_tru(BigDecimal r20_crm_sub_col_elig_unit_tru) {
		this.r20_crm_sub_col_elig_unit_tru = r20_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR20_crm_sub_col_exp_cov() {
		return r20_crm_sub_col_exp_cov;
	}
	public void setR20_crm_sub_col_exp_cov(BigDecimal r20_crm_sub_col_exp_cov) {
		this.r20_crm_sub_col_exp_cov = r20_crm_sub_col_exp_cov;
	}
	public BigDecimal getR20_crm_sub_col_elig_exp_not_cov() {
		return r20_crm_sub_col_elig_exp_not_cov;
	}
	public void setR20_crm_sub_col_elig_exp_not_cov(BigDecimal r20_crm_sub_col_elig_exp_not_cov) {
		this.r20_crm_sub_col_elig_exp_not_cov = r20_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR20_crm_sub_rwa_ris_crm() {
		return r20_crm_sub_rwa_ris_crm;
	}
	public void setR20_crm_sub_rwa_ris_crm(BigDecimal r20_crm_sub_rwa_ris_crm) {
		this.r20_crm_sub_rwa_ris_crm = r20_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR20_crm_sub_rwa_cov_crm() {
		return r20_crm_sub_rwa_cov_crm;
	}
	public void setR20_crm_sub_rwa_cov_crm(BigDecimal r20_crm_sub_rwa_cov_crm) {
		this.r20_crm_sub_rwa_cov_crm = r20_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR20_crm_sub_rwa_org_cou() {
		return r20_crm_sub_rwa_org_cou;
	}
	public void setR20_crm_sub_rwa_org_cou(BigDecimal r20_crm_sub_rwa_org_cou) {
		this.r20_crm_sub_rwa_org_cou = r20_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR20_crm_sub_rwa_not_cov_crm() {
		return r20_crm_sub_rwa_not_cov_crm;
	}
	public void setR20_crm_sub_rwa_not_cov_crm(BigDecimal r20_crm_sub_rwa_not_cov_crm) {
		this.r20_crm_sub_rwa_not_cov_crm = r20_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR20_crm_comp_col_expo_elig() {
		return r20_crm_comp_col_expo_elig;
	}
	public void setR20_crm_comp_col_expo_elig(BigDecimal r20_crm_comp_col_expo_elig) {
		this.r20_crm_comp_col_expo_elig = r20_crm_comp_col_expo_elig;
	}
	public BigDecimal getR20_crm_comp_col_elig_expo_vol_adj() {
		return r20_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR20_crm_comp_col_elig_expo_vol_adj(BigDecimal r20_crm_comp_col_elig_expo_vol_adj) {
		this.r20_crm_comp_col_elig_expo_vol_adj = r20_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR20_crm_comp_col_elig_fin_hai() {
		return r20_crm_comp_col_elig_fin_hai;
	}
	public void setR20_crm_comp_col_elig_fin_hai(BigDecimal r20_crm_comp_col_elig_fin_hai) {
		this.r20_crm_comp_col_elig_fin_hai = r20_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR20_crm_comp_col_expo_val() {
		return r20_crm_comp_col_expo_val;
	}
	public void setR20_crm_comp_col_expo_val(BigDecimal r20_crm_comp_col_expo_val) {
		this.r20_crm_comp_col_expo_val = r20_crm_comp_col_expo_val;
	}
	public BigDecimal getR20_rwa_elig_expo_not_cov_crm() {
		return r20_rwa_elig_expo_not_cov_crm;
	}
	public void setR20_rwa_elig_expo_not_cov_crm(BigDecimal r20_rwa_elig_expo_not_cov_crm) {
		this.r20_rwa_elig_expo_not_cov_crm = r20_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR20_rwa_unsec_expo_cre_ris() {
		return r20_rwa_unsec_expo_cre_ris;
	}
	public void setR20_rwa_unsec_expo_cre_ris(BigDecimal r20_rwa_unsec_expo_cre_ris) {
		this.r20_rwa_unsec_expo_cre_ris = r20_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR20_rwa_unsec_expo() {
		return r20_rwa_unsec_expo;
	}
	public void setR20_rwa_unsec_expo(BigDecimal r20_rwa_unsec_expo) {
		this.r20_rwa_unsec_expo = r20_rwa_unsec_expo;
	}
	public BigDecimal getR20_rwa_tot_ris_wei_ass() {
		return r20_rwa_tot_ris_wei_ass;
	}
	public void setR20_rwa_tot_ris_wei_ass(BigDecimal r20_rwa_tot_ris_wei_ass) {
		this.r20_rwa_tot_ris_wei_ass = r20_rwa_tot_ris_wei_ass;
	}
	public String getR21_exposure_class() {
		return r21_exposure_class;
	}
	public void setR21_exposure_class(String r21_exposure_class) {
		this.r21_exposure_class = r21_exposure_class;
	}
	public BigDecimal getR21_expo_crm() {
		return r21_expo_crm;
	}
	public void setR21_expo_crm(BigDecimal r21_expo_crm) {
		this.r21_expo_crm = r21_expo_crm;
	}
	public BigDecimal getR21_spe_pro_expo() {
		return r21_spe_pro_expo;
	}
	public void setR21_spe_pro_expo(BigDecimal r21_spe_pro_expo) {
		this.r21_spe_pro_expo = r21_spe_pro_expo;
	}
	public BigDecimal getR21_amt_elig_sht_net() {
		return r21_amt_elig_sht_net;
	}
	public void setR21_amt_elig_sht_net(BigDecimal r21_amt_elig_sht_net) {
		this.r21_amt_elig_sht_net = r21_amt_elig_sht_net;
	}
	public BigDecimal getR21_tot_expo_net_spe() {
		return r21_tot_expo_net_spe;
	}
	public void setR21_tot_expo_net_spe(BigDecimal r21_tot_expo_net_spe) {
		this.r21_tot_expo_net_spe = r21_tot_expo_net_spe;
	}
	public BigDecimal getR21_crm_sub_elig_sub_app() {
		return r21_crm_sub_elig_sub_app;
	}
	public void setR21_crm_sub_elig_sub_app(BigDecimal r21_crm_sub_elig_sub_app) {
		this.r21_crm_sub_elig_sub_app = r21_crm_sub_elig_sub_app;
	}
	public BigDecimal getR21_crm_sub_non_col_guar() {
		return r21_crm_sub_non_col_guar;
	}
	public void setR21_crm_sub_non_col_guar(BigDecimal r21_crm_sub_non_col_guar) {
		this.r21_crm_sub_non_col_guar = r21_crm_sub_non_col_guar;
	}
	public BigDecimal getR21_crm_sub_non_col_cre_der() {
		return r21_crm_sub_non_col_cre_der;
	}
	public void setR21_crm_sub_non_col_cre_der(BigDecimal r21_crm_sub_non_col_cre_der) {
		this.r21_crm_sub_non_col_cre_der = r21_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR21_crm_sub_col_elig_cash() {
		return r21_crm_sub_col_elig_cash;
	}
	public void setR21_crm_sub_col_elig_cash(BigDecimal r21_crm_sub_col_elig_cash) {
		this.r21_crm_sub_col_elig_cash = r21_crm_sub_col_elig_cash;
	}
	public BigDecimal getR21_crm_sub_col_elig_trea_bills() {
		return r21_crm_sub_col_elig_trea_bills;
	}
	public void setR21_crm_sub_col_elig_trea_bills(BigDecimal r21_crm_sub_col_elig_trea_bills) {
		this.r21_crm_sub_col_elig_trea_bills = r21_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR21_crm_sub_col_elig_deb_sec() {
		return r21_crm_sub_col_elig_deb_sec;
	}
	public void setR21_crm_sub_col_elig_deb_sec(BigDecimal r21_crm_sub_col_elig_deb_sec) {
		this.r21_crm_sub_col_elig_deb_sec = r21_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR21_crm_sub_col_elig_equi() {
		return r21_crm_sub_col_elig_equi;
	}
	public void setR21_crm_sub_col_elig_equi(BigDecimal r21_crm_sub_col_elig_equi) {
		this.r21_crm_sub_col_elig_equi = r21_crm_sub_col_elig_equi;
	}
	public BigDecimal getR21_crm_sub_col_elig_unit_tru() {
		return r21_crm_sub_col_elig_unit_tru;
	}
	public void setR21_crm_sub_col_elig_unit_tru(BigDecimal r21_crm_sub_col_elig_unit_tru) {
		this.r21_crm_sub_col_elig_unit_tru = r21_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR21_crm_sub_col_exp_cov() {
		return r21_crm_sub_col_exp_cov;
	}
	public void setR21_crm_sub_col_exp_cov(BigDecimal r21_crm_sub_col_exp_cov) {
		this.r21_crm_sub_col_exp_cov = r21_crm_sub_col_exp_cov;
	}
	public BigDecimal getR21_crm_sub_col_elig_exp_not_cov() {
		return r21_crm_sub_col_elig_exp_not_cov;
	}
	public void setR21_crm_sub_col_elig_exp_not_cov(BigDecimal r21_crm_sub_col_elig_exp_not_cov) {
		this.r21_crm_sub_col_elig_exp_not_cov = r21_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR21_crm_sub_rwa_ris_crm() {
		return r21_crm_sub_rwa_ris_crm;
	}
	public void setR21_crm_sub_rwa_ris_crm(BigDecimal r21_crm_sub_rwa_ris_crm) {
		this.r21_crm_sub_rwa_ris_crm = r21_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR21_crm_sub_rwa_cov_crm() {
		return r21_crm_sub_rwa_cov_crm;
	}
	public void setR21_crm_sub_rwa_cov_crm(BigDecimal r21_crm_sub_rwa_cov_crm) {
		this.r21_crm_sub_rwa_cov_crm = r21_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR21_crm_sub_rwa_org_cou() {
		return r21_crm_sub_rwa_org_cou;
	}
	public void setR21_crm_sub_rwa_org_cou(BigDecimal r21_crm_sub_rwa_org_cou) {
		this.r21_crm_sub_rwa_org_cou = r21_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR21_crm_sub_rwa_not_cov_crm() {
		return r21_crm_sub_rwa_not_cov_crm;
	}
	public void setR21_crm_sub_rwa_not_cov_crm(BigDecimal r21_crm_sub_rwa_not_cov_crm) {
		this.r21_crm_sub_rwa_not_cov_crm = r21_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR21_crm_comp_col_expo_elig() {
		return r21_crm_comp_col_expo_elig;
	}
	public void setR21_crm_comp_col_expo_elig(BigDecimal r21_crm_comp_col_expo_elig) {
		this.r21_crm_comp_col_expo_elig = r21_crm_comp_col_expo_elig;
	}
	public BigDecimal getR21_crm_comp_col_elig_expo_vol_adj() {
		return r21_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR21_crm_comp_col_elig_expo_vol_adj(BigDecimal r21_crm_comp_col_elig_expo_vol_adj) {
		this.r21_crm_comp_col_elig_expo_vol_adj = r21_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR21_crm_comp_col_elig_fin_hai() {
		return r21_crm_comp_col_elig_fin_hai;
	}
	public void setR21_crm_comp_col_elig_fin_hai(BigDecimal r21_crm_comp_col_elig_fin_hai) {
		this.r21_crm_comp_col_elig_fin_hai = r21_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR21_crm_comp_col_expo_val() {
		return r21_crm_comp_col_expo_val;
	}
	public void setR21_crm_comp_col_expo_val(BigDecimal r21_crm_comp_col_expo_val) {
		this.r21_crm_comp_col_expo_val = r21_crm_comp_col_expo_val;
	}
	public BigDecimal getR21_rwa_elig_expo_not_cov_crm() {
		return r21_rwa_elig_expo_not_cov_crm;
	}
	public void setR21_rwa_elig_expo_not_cov_crm(BigDecimal r21_rwa_elig_expo_not_cov_crm) {
		this.r21_rwa_elig_expo_not_cov_crm = r21_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR21_rwa_unsec_expo_cre_ris() {
		return r21_rwa_unsec_expo_cre_ris;
	}
	public void setR21_rwa_unsec_expo_cre_ris(BigDecimal r21_rwa_unsec_expo_cre_ris) {
		this.r21_rwa_unsec_expo_cre_ris = r21_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR21_rwa_unsec_expo() {
		return r21_rwa_unsec_expo;
	}
	public void setR21_rwa_unsec_expo(BigDecimal r21_rwa_unsec_expo) {
		this.r21_rwa_unsec_expo = r21_rwa_unsec_expo;
	}
	public BigDecimal getR21_rwa_tot_ris_wei_ass() {
		return r21_rwa_tot_ris_wei_ass;
	}
	public void setR21_rwa_tot_ris_wei_ass(BigDecimal r21_rwa_tot_ris_wei_ass) {
		this.r21_rwa_tot_ris_wei_ass = r21_rwa_tot_ris_wei_ass;
	}
	public String getR22_exposure_class() {
		return r22_exposure_class;
	}
	public void setR22_exposure_class(String r22_exposure_class) {
		this.r22_exposure_class = r22_exposure_class;
	}
	public BigDecimal getR22_expo_crm() {
		return r22_expo_crm;
	}
	public void setR22_expo_crm(BigDecimal r22_expo_crm) {
		this.r22_expo_crm = r22_expo_crm;
	}
	public BigDecimal getR22_spe_pro_expo() {
		return r22_spe_pro_expo;
	}
	public void setR22_spe_pro_expo(BigDecimal r22_spe_pro_expo) {
		this.r22_spe_pro_expo = r22_spe_pro_expo;
	}
	public BigDecimal getR22_amt_elig_sht_net() {
		return r22_amt_elig_sht_net;
	}
	public void setR22_amt_elig_sht_net(BigDecimal r22_amt_elig_sht_net) {
		this.r22_amt_elig_sht_net = r22_amt_elig_sht_net;
	}
	public BigDecimal getR22_tot_expo_net_spe() {
		return r22_tot_expo_net_spe;
	}
	public void setR22_tot_expo_net_spe(BigDecimal r22_tot_expo_net_spe) {
		this.r22_tot_expo_net_spe = r22_tot_expo_net_spe;
	}
	public BigDecimal getR22_crm_sub_elig_sub_app() {
		return r22_crm_sub_elig_sub_app;
	}
	public void setR22_crm_sub_elig_sub_app(BigDecimal r22_crm_sub_elig_sub_app) {
		this.r22_crm_sub_elig_sub_app = r22_crm_sub_elig_sub_app;
	}
	public BigDecimal getR22_crm_sub_non_col_guar() {
		return r22_crm_sub_non_col_guar;
	}
	public void setR22_crm_sub_non_col_guar(BigDecimal r22_crm_sub_non_col_guar) {
		this.r22_crm_sub_non_col_guar = r22_crm_sub_non_col_guar;
	}
	public BigDecimal getR22_crm_sub_non_col_cre_der() {
		return r22_crm_sub_non_col_cre_der;
	}
	public void setR22_crm_sub_non_col_cre_der(BigDecimal r22_crm_sub_non_col_cre_der) {
		this.r22_crm_sub_non_col_cre_der = r22_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR22_crm_sub_col_elig_cash() {
		return r22_crm_sub_col_elig_cash;
	}
	public void setR22_crm_sub_col_elig_cash(BigDecimal r22_crm_sub_col_elig_cash) {
		this.r22_crm_sub_col_elig_cash = r22_crm_sub_col_elig_cash;
	}
	public BigDecimal getR22_crm_sub_col_elig_trea_bills() {
		return r22_crm_sub_col_elig_trea_bills;
	}
	public void setR22_crm_sub_col_elig_trea_bills(BigDecimal r22_crm_sub_col_elig_trea_bills) {
		this.r22_crm_sub_col_elig_trea_bills = r22_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR22_crm_sub_col_elig_deb_sec() {
		return r22_crm_sub_col_elig_deb_sec;
	}
	public void setR22_crm_sub_col_elig_deb_sec(BigDecimal r22_crm_sub_col_elig_deb_sec) {
		this.r22_crm_sub_col_elig_deb_sec = r22_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR22_crm_sub_col_elig_equi() {
		return r22_crm_sub_col_elig_equi;
	}
	public void setR22_crm_sub_col_elig_equi(BigDecimal r22_crm_sub_col_elig_equi) {
		this.r22_crm_sub_col_elig_equi = r22_crm_sub_col_elig_equi;
	}
	public BigDecimal getR22_crm_sub_col_elig_unit_tru() {
		return r22_crm_sub_col_elig_unit_tru;
	}
	public void setR22_crm_sub_col_elig_unit_tru(BigDecimal r22_crm_sub_col_elig_unit_tru) {
		this.r22_crm_sub_col_elig_unit_tru = r22_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR22_crm_sub_col_exp_cov() {
		return r22_crm_sub_col_exp_cov;
	}
	public void setR22_crm_sub_col_exp_cov(BigDecimal r22_crm_sub_col_exp_cov) {
		this.r22_crm_sub_col_exp_cov = r22_crm_sub_col_exp_cov;
	}
	public BigDecimal getR22_crm_sub_col_elig_exp_not_cov() {
		return r22_crm_sub_col_elig_exp_not_cov;
	}
	public void setR22_crm_sub_col_elig_exp_not_cov(BigDecimal r22_crm_sub_col_elig_exp_not_cov) {
		this.r22_crm_sub_col_elig_exp_not_cov = r22_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR22_crm_sub_rwa_ris_crm() {
		return r22_crm_sub_rwa_ris_crm;
	}
	public void setR22_crm_sub_rwa_ris_crm(BigDecimal r22_crm_sub_rwa_ris_crm) {
		this.r22_crm_sub_rwa_ris_crm = r22_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR22_crm_sub_rwa_cov_crm() {
		return r22_crm_sub_rwa_cov_crm;
	}
	public void setR22_crm_sub_rwa_cov_crm(BigDecimal r22_crm_sub_rwa_cov_crm) {
		this.r22_crm_sub_rwa_cov_crm = r22_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR22_crm_sub_rwa_org_cou() {
		return r22_crm_sub_rwa_org_cou;
	}
	public void setR22_crm_sub_rwa_org_cou(BigDecimal r22_crm_sub_rwa_org_cou) {
		this.r22_crm_sub_rwa_org_cou = r22_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR22_crm_sub_rwa_not_cov_crm() {
		return r22_crm_sub_rwa_not_cov_crm;
	}
	public void setR22_crm_sub_rwa_not_cov_crm(BigDecimal r22_crm_sub_rwa_not_cov_crm) {
		this.r22_crm_sub_rwa_not_cov_crm = r22_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR22_crm_comp_col_expo_elig() {
		return r22_crm_comp_col_expo_elig;
	}
	public void setR22_crm_comp_col_expo_elig(BigDecimal r22_crm_comp_col_expo_elig) {
		this.r22_crm_comp_col_expo_elig = r22_crm_comp_col_expo_elig;
	}
	public BigDecimal getR22_crm_comp_col_elig_expo_vol_adj() {
		return r22_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR22_crm_comp_col_elig_expo_vol_adj(BigDecimal r22_crm_comp_col_elig_expo_vol_adj) {
		this.r22_crm_comp_col_elig_expo_vol_adj = r22_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR22_crm_comp_col_elig_fin_hai() {
		return r22_crm_comp_col_elig_fin_hai;
	}
	public void setR22_crm_comp_col_elig_fin_hai(BigDecimal r22_crm_comp_col_elig_fin_hai) {
		this.r22_crm_comp_col_elig_fin_hai = r22_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR22_crm_comp_col_expo_val() {
		return r22_crm_comp_col_expo_val;
	}
	public void setR22_crm_comp_col_expo_val(BigDecimal r22_crm_comp_col_expo_val) {
		this.r22_crm_comp_col_expo_val = r22_crm_comp_col_expo_val;
	}
	public BigDecimal getR22_rwa_elig_expo_not_cov_crm() {
		return r22_rwa_elig_expo_not_cov_crm;
	}
	public void setR22_rwa_elig_expo_not_cov_crm(BigDecimal r22_rwa_elig_expo_not_cov_crm) {
		this.r22_rwa_elig_expo_not_cov_crm = r22_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR22_rwa_unsec_expo_cre_ris() {
		return r22_rwa_unsec_expo_cre_ris;
	}
	public void setR22_rwa_unsec_expo_cre_ris(BigDecimal r22_rwa_unsec_expo_cre_ris) {
		this.r22_rwa_unsec_expo_cre_ris = r22_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR22_rwa_unsec_expo() {
		return r22_rwa_unsec_expo;
	}
	public void setR22_rwa_unsec_expo(BigDecimal r22_rwa_unsec_expo) {
		this.r22_rwa_unsec_expo = r22_rwa_unsec_expo;
	}
	public BigDecimal getR22_rwa_tot_ris_wei_ass() {
		return r22_rwa_tot_ris_wei_ass;
	}
	public void setR22_rwa_tot_ris_wei_ass(BigDecimal r22_rwa_tot_ris_wei_ass) {
		this.r22_rwa_tot_ris_wei_ass = r22_rwa_tot_ris_wei_ass;
	}
	public String getR23_exposure_class() {
		return r23_exposure_class;
	}
	public void setR23_exposure_class(String r23_exposure_class) {
		this.r23_exposure_class = r23_exposure_class;
	}
	public BigDecimal getR23_expo_crm() {
		return r23_expo_crm;
	}
	public void setR23_expo_crm(BigDecimal r23_expo_crm) {
		this.r23_expo_crm = r23_expo_crm;
	}
	public BigDecimal getR23_spe_pro_expo() {
		return r23_spe_pro_expo;
	}
	public void setR23_spe_pro_expo(BigDecimal r23_spe_pro_expo) {
		this.r23_spe_pro_expo = r23_spe_pro_expo;
	}
	public BigDecimal getR23_amt_elig_sht_net() {
		return r23_amt_elig_sht_net;
	}
	public void setR23_amt_elig_sht_net(BigDecimal r23_amt_elig_sht_net) {
		this.r23_amt_elig_sht_net = r23_amt_elig_sht_net;
	}
	public BigDecimal getR23_tot_expo_net_spe() {
		return r23_tot_expo_net_spe;
	}
	public void setR23_tot_expo_net_spe(BigDecimal r23_tot_expo_net_spe) {
		this.r23_tot_expo_net_spe = r23_tot_expo_net_spe;
	}
	public BigDecimal getR23_crm_sub_elig_sub_app() {
		return r23_crm_sub_elig_sub_app;
	}
	public void setR23_crm_sub_elig_sub_app(BigDecimal r23_crm_sub_elig_sub_app) {
		this.r23_crm_sub_elig_sub_app = r23_crm_sub_elig_sub_app;
	}
	public BigDecimal getR23_crm_sub_non_col_guar() {
		return r23_crm_sub_non_col_guar;
	}
	public void setR23_crm_sub_non_col_guar(BigDecimal r23_crm_sub_non_col_guar) {
		this.r23_crm_sub_non_col_guar = r23_crm_sub_non_col_guar;
	}
	public BigDecimal getR23_crm_sub_non_col_cre_der() {
		return r23_crm_sub_non_col_cre_der;
	}
	public void setR23_crm_sub_non_col_cre_der(BigDecimal r23_crm_sub_non_col_cre_der) {
		this.r23_crm_sub_non_col_cre_der = r23_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR23_crm_sub_col_elig_cash() {
		return r23_crm_sub_col_elig_cash;
	}
	public void setR23_crm_sub_col_elig_cash(BigDecimal r23_crm_sub_col_elig_cash) {
		this.r23_crm_sub_col_elig_cash = r23_crm_sub_col_elig_cash;
	}
	public BigDecimal getR23_crm_sub_col_elig_trea_bills() {
		return r23_crm_sub_col_elig_trea_bills;
	}
	public void setR23_crm_sub_col_elig_trea_bills(BigDecimal r23_crm_sub_col_elig_trea_bills) {
		this.r23_crm_sub_col_elig_trea_bills = r23_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR23_crm_sub_col_elig_deb_sec() {
		return r23_crm_sub_col_elig_deb_sec;
	}
	public void setR23_crm_sub_col_elig_deb_sec(BigDecimal r23_crm_sub_col_elig_deb_sec) {
		this.r23_crm_sub_col_elig_deb_sec = r23_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR23_crm_sub_col_elig_equi() {
		return r23_crm_sub_col_elig_equi;
	}
	public void setR23_crm_sub_col_elig_equi(BigDecimal r23_crm_sub_col_elig_equi) {
		this.r23_crm_sub_col_elig_equi = r23_crm_sub_col_elig_equi;
	}
	public BigDecimal getR23_crm_sub_col_elig_unit_tru() {
		return r23_crm_sub_col_elig_unit_tru;
	}
	public void setR23_crm_sub_col_elig_unit_tru(BigDecimal r23_crm_sub_col_elig_unit_tru) {
		this.r23_crm_sub_col_elig_unit_tru = r23_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR23_crm_sub_col_exp_cov() {
		return r23_crm_sub_col_exp_cov;
	}
	public void setR23_crm_sub_col_exp_cov(BigDecimal r23_crm_sub_col_exp_cov) {
		this.r23_crm_sub_col_exp_cov = r23_crm_sub_col_exp_cov;
	}
	public BigDecimal getR23_crm_sub_col_elig_exp_not_cov() {
		return r23_crm_sub_col_elig_exp_not_cov;
	}
	public void setR23_crm_sub_col_elig_exp_not_cov(BigDecimal r23_crm_sub_col_elig_exp_not_cov) {
		this.r23_crm_sub_col_elig_exp_not_cov = r23_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR23_crm_sub_rwa_ris_crm() {
		return r23_crm_sub_rwa_ris_crm;
	}
	public void setR23_crm_sub_rwa_ris_crm(BigDecimal r23_crm_sub_rwa_ris_crm) {
		this.r23_crm_sub_rwa_ris_crm = r23_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR23_crm_sub_rwa_cov_crm() {
		return r23_crm_sub_rwa_cov_crm;
	}
	public void setR23_crm_sub_rwa_cov_crm(BigDecimal r23_crm_sub_rwa_cov_crm) {
		this.r23_crm_sub_rwa_cov_crm = r23_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR23_crm_sub_rwa_org_cou() {
		return r23_crm_sub_rwa_org_cou;
	}
	public void setR23_crm_sub_rwa_org_cou(BigDecimal r23_crm_sub_rwa_org_cou) {
		this.r23_crm_sub_rwa_org_cou = r23_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR23_crm_sub_rwa_not_cov_crm() {
		return r23_crm_sub_rwa_not_cov_crm;
	}
	public void setR23_crm_sub_rwa_not_cov_crm(BigDecimal r23_crm_sub_rwa_not_cov_crm) {
		this.r23_crm_sub_rwa_not_cov_crm = r23_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR23_crm_comp_col_expo_elig() {
		return r23_crm_comp_col_expo_elig;
	}
	public void setR23_crm_comp_col_expo_elig(BigDecimal r23_crm_comp_col_expo_elig) {
		this.r23_crm_comp_col_expo_elig = r23_crm_comp_col_expo_elig;
	}
	public BigDecimal getR23_crm_comp_col_elig_expo_vol_adj() {
		return r23_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR23_crm_comp_col_elig_expo_vol_adj(BigDecimal r23_crm_comp_col_elig_expo_vol_adj) {
		this.r23_crm_comp_col_elig_expo_vol_adj = r23_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR23_crm_comp_col_elig_fin_hai() {
		return r23_crm_comp_col_elig_fin_hai;
	}
	public void setR23_crm_comp_col_elig_fin_hai(BigDecimal r23_crm_comp_col_elig_fin_hai) {
		this.r23_crm_comp_col_elig_fin_hai = r23_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR23_crm_comp_col_expo_val() {
		return r23_crm_comp_col_expo_val;
	}
	public void setR23_crm_comp_col_expo_val(BigDecimal r23_crm_comp_col_expo_val) {
		this.r23_crm_comp_col_expo_val = r23_crm_comp_col_expo_val;
	}
	public BigDecimal getR23_rwa_elig_expo_not_cov_crm() {
		return r23_rwa_elig_expo_not_cov_crm;
	}
	public void setR23_rwa_elig_expo_not_cov_crm(BigDecimal r23_rwa_elig_expo_not_cov_crm) {
		this.r23_rwa_elig_expo_not_cov_crm = r23_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR23_rwa_unsec_expo_cre_ris() {
		return r23_rwa_unsec_expo_cre_ris;
	}
	public void setR23_rwa_unsec_expo_cre_ris(BigDecimal r23_rwa_unsec_expo_cre_ris) {
		this.r23_rwa_unsec_expo_cre_ris = r23_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR23_rwa_unsec_expo() {
		return r23_rwa_unsec_expo;
	}
	public void setR23_rwa_unsec_expo(BigDecimal r23_rwa_unsec_expo) {
		this.r23_rwa_unsec_expo = r23_rwa_unsec_expo;
	}
	public BigDecimal getR23_rwa_tot_ris_wei_ass() {
		return r23_rwa_tot_ris_wei_ass;
	}
	public void setR23_rwa_tot_ris_wei_ass(BigDecimal r23_rwa_tot_ris_wei_ass) {
		this.r23_rwa_tot_ris_wei_ass = r23_rwa_tot_ris_wei_ass;
	}
	public String getR24_exposure_class() {
		return r24_exposure_class;
	}
	public void setR24_exposure_class(String r24_exposure_class) {
		this.r24_exposure_class = r24_exposure_class;
	}
	public BigDecimal getR24_expo_crm() {
		return r24_expo_crm;
	}
	public void setR24_expo_crm(BigDecimal r24_expo_crm) {
		this.r24_expo_crm = r24_expo_crm;
	}
	public BigDecimal getR24_spe_pro_expo() {
		return r24_spe_pro_expo;
	}
	public void setR24_spe_pro_expo(BigDecimal r24_spe_pro_expo) {
		this.r24_spe_pro_expo = r24_spe_pro_expo;
	}
	public BigDecimal getR24_amt_elig_sht_net() {
		return r24_amt_elig_sht_net;
	}
	public void setR24_amt_elig_sht_net(BigDecimal r24_amt_elig_sht_net) {
		this.r24_amt_elig_sht_net = r24_amt_elig_sht_net;
	}
	public BigDecimal getR24_tot_expo_net_spe() {
		return r24_tot_expo_net_spe;
	}
	public void setR24_tot_expo_net_spe(BigDecimal r24_tot_expo_net_spe) {
		this.r24_tot_expo_net_spe = r24_tot_expo_net_spe;
	}
	public BigDecimal getR24_crm_sub_elig_sub_app() {
		return r24_crm_sub_elig_sub_app;
	}
	public void setR24_crm_sub_elig_sub_app(BigDecimal r24_crm_sub_elig_sub_app) {
		this.r24_crm_sub_elig_sub_app = r24_crm_sub_elig_sub_app;
	}
	public BigDecimal getR24_crm_sub_non_col_guar() {
		return r24_crm_sub_non_col_guar;
	}
	public void setR24_crm_sub_non_col_guar(BigDecimal r24_crm_sub_non_col_guar) {
		this.r24_crm_sub_non_col_guar = r24_crm_sub_non_col_guar;
	}
	public BigDecimal getR24_crm_sub_non_col_cre_der() {
		return r24_crm_sub_non_col_cre_der;
	}
	public void setR24_crm_sub_non_col_cre_der(BigDecimal r24_crm_sub_non_col_cre_der) {
		this.r24_crm_sub_non_col_cre_der = r24_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR24_crm_sub_col_elig_cash() {
		return r24_crm_sub_col_elig_cash;
	}
	public void setR24_crm_sub_col_elig_cash(BigDecimal r24_crm_sub_col_elig_cash) {
		this.r24_crm_sub_col_elig_cash = r24_crm_sub_col_elig_cash;
	}
	public BigDecimal getR24_crm_sub_col_elig_trea_bills() {
		return r24_crm_sub_col_elig_trea_bills;
	}
	public void setR24_crm_sub_col_elig_trea_bills(BigDecimal r24_crm_sub_col_elig_trea_bills) {
		this.r24_crm_sub_col_elig_trea_bills = r24_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR24_crm_sub_col_elig_deb_sec() {
		return r24_crm_sub_col_elig_deb_sec;
	}
	public void setR24_crm_sub_col_elig_deb_sec(BigDecimal r24_crm_sub_col_elig_deb_sec) {
		this.r24_crm_sub_col_elig_deb_sec = r24_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR24_crm_sub_col_elig_equi() {
		return r24_crm_sub_col_elig_equi;
	}
	public void setR24_crm_sub_col_elig_equi(BigDecimal r24_crm_sub_col_elig_equi) {
		this.r24_crm_sub_col_elig_equi = r24_crm_sub_col_elig_equi;
	}
	public BigDecimal getR24_crm_sub_col_elig_unit_tru() {
		return r24_crm_sub_col_elig_unit_tru;
	}
	public void setR24_crm_sub_col_elig_unit_tru(BigDecimal r24_crm_sub_col_elig_unit_tru) {
		this.r24_crm_sub_col_elig_unit_tru = r24_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR24_crm_sub_col_exp_cov() {
		return r24_crm_sub_col_exp_cov;
	}
	public void setR24_crm_sub_col_exp_cov(BigDecimal r24_crm_sub_col_exp_cov) {
		this.r24_crm_sub_col_exp_cov = r24_crm_sub_col_exp_cov;
	}
	public BigDecimal getR24_crm_sub_col_elig_exp_not_cov() {
		return r24_crm_sub_col_elig_exp_not_cov;
	}
	public void setR24_crm_sub_col_elig_exp_not_cov(BigDecimal r24_crm_sub_col_elig_exp_not_cov) {
		this.r24_crm_sub_col_elig_exp_not_cov = r24_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR24_crm_sub_rwa_ris_crm() {
		return r24_crm_sub_rwa_ris_crm;
	}
	public void setR24_crm_sub_rwa_ris_crm(BigDecimal r24_crm_sub_rwa_ris_crm) {
		this.r24_crm_sub_rwa_ris_crm = r24_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR24_crm_sub_rwa_cov_crm() {
		return r24_crm_sub_rwa_cov_crm;
	}
	public void setR24_crm_sub_rwa_cov_crm(BigDecimal r24_crm_sub_rwa_cov_crm) {
		this.r24_crm_sub_rwa_cov_crm = r24_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR24_crm_sub_rwa_org_cou() {
		return r24_crm_sub_rwa_org_cou;
	}
	public void setR24_crm_sub_rwa_org_cou(BigDecimal r24_crm_sub_rwa_org_cou) {
		this.r24_crm_sub_rwa_org_cou = r24_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR24_crm_sub_rwa_not_cov_crm() {
		return r24_crm_sub_rwa_not_cov_crm;
	}
	public void setR24_crm_sub_rwa_not_cov_crm(BigDecimal r24_crm_sub_rwa_not_cov_crm) {
		this.r24_crm_sub_rwa_not_cov_crm = r24_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR24_crm_comp_col_expo_elig() {
		return r24_crm_comp_col_expo_elig;
	}
	public void setR24_crm_comp_col_expo_elig(BigDecimal r24_crm_comp_col_expo_elig) {
		this.r24_crm_comp_col_expo_elig = r24_crm_comp_col_expo_elig;
	}
	public BigDecimal getR24_crm_comp_col_elig_expo_vol_adj() {
		return r24_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR24_crm_comp_col_elig_expo_vol_adj(BigDecimal r24_crm_comp_col_elig_expo_vol_adj) {
		this.r24_crm_comp_col_elig_expo_vol_adj = r24_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR24_crm_comp_col_elig_fin_hai() {
		return r24_crm_comp_col_elig_fin_hai;
	}
	public void setR24_crm_comp_col_elig_fin_hai(BigDecimal r24_crm_comp_col_elig_fin_hai) {
		this.r24_crm_comp_col_elig_fin_hai = r24_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR24_crm_comp_col_expo_val() {
		return r24_crm_comp_col_expo_val;
	}
	public void setR24_crm_comp_col_expo_val(BigDecimal r24_crm_comp_col_expo_val) {
		this.r24_crm_comp_col_expo_val = r24_crm_comp_col_expo_val;
	}
	public BigDecimal getR24_rwa_elig_expo_not_cov_crm() {
		return r24_rwa_elig_expo_not_cov_crm;
	}
	public void setR24_rwa_elig_expo_not_cov_crm(BigDecimal r24_rwa_elig_expo_not_cov_crm) {
		this.r24_rwa_elig_expo_not_cov_crm = r24_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR24_rwa_unsec_expo_cre_ris() {
		return r24_rwa_unsec_expo_cre_ris;
	}
	public void setR24_rwa_unsec_expo_cre_ris(BigDecimal r24_rwa_unsec_expo_cre_ris) {
		this.r24_rwa_unsec_expo_cre_ris = r24_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR24_rwa_unsec_expo() {
		return r24_rwa_unsec_expo;
	}
	public void setR24_rwa_unsec_expo(BigDecimal r24_rwa_unsec_expo) {
		this.r24_rwa_unsec_expo = r24_rwa_unsec_expo;
	}
	public BigDecimal getR24_rwa_tot_ris_wei_ass() {
		return r24_rwa_tot_ris_wei_ass;
	}
	public void setR24_rwa_tot_ris_wei_ass(BigDecimal r24_rwa_tot_ris_wei_ass) {
		this.r24_rwa_tot_ris_wei_ass = r24_rwa_tot_ris_wei_ass;
	}
	public String getR25_exposure_class() {
		return r25_exposure_class;
	}
	public void setR25_exposure_class(String r25_exposure_class) {
		this.r25_exposure_class = r25_exposure_class;
	}
	public BigDecimal getR25_expo_crm() {
		return r25_expo_crm;
	}
	public void setR25_expo_crm(BigDecimal r25_expo_crm) {
		this.r25_expo_crm = r25_expo_crm;
	}
	public BigDecimal getR25_spe_pro_expo() {
		return r25_spe_pro_expo;
	}
	public void setR25_spe_pro_expo(BigDecimal r25_spe_pro_expo) {
		this.r25_spe_pro_expo = r25_spe_pro_expo;
	}
	public BigDecimal getR25_amt_elig_sht_net() {
		return r25_amt_elig_sht_net;
	}
	public void setR25_amt_elig_sht_net(BigDecimal r25_amt_elig_sht_net) {
		this.r25_amt_elig_sht_net = r25_amt_elig_sht_net;
	}
	public BigDecimal getR25_tot_expo_net_spe() {
		return r25_tot_expo_net_spe;
	}
	public void setR25_tot_expo_net_spe(BigDecimal r25_tot_expo_net_spe) {
		this.r25_tot_expo_net_spe = r25_tot_expo_net_spe;
	}
	public BigDecimal getR25_crm_sub_elig_sub_app() {
		return r25_crm_sub_elig_sub_app;
	}
	public void setR25_crm_sub_elig_sub_app(BigDecimal r25_crm_sub_elig_sub_app) {
		this.r25_crm_sub_elig_sub_app = r25_crm_sub_elig_sub_app;
	}
	public BigDecimal getR25_crm_sub_non_col_guar() {
		return r25_crm_sub_non_col_guar;
	}
	public void setR25_crm_sub_non_col_guar(BigDecimal r25_crm_sub_non_col_guar) {
		this.r25_crm_sub_non_col_guar = r25_crm_sub_non_col_guar;
	}
	public BigDecimal getR25_crm_sub_non_col_cre_der() {
		return r25_crm_sub_non_col_cre_der;
	}
	public void setR25_crm_sub_non_col_cre_der(BigDecimal r25_crm_sub_non_col_cre_der) {
		this.r25_crm_sub_non_col_cre_der = r25_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR25_crm_sub_col_elig_cash() {
		return r25_crm_sub_col_elig_cash;
	}
	public void setR25_crm_sub_col_elig_cash(BigDecimal r25_crm_sub_col_elig_cash) {
		this.r25_crm_sub_col_elig_cash = r25_crm_sub_col_elig_cash;
	}
	public BigDecimal getR25_crm_sub_col_elig_trea_bills() {
		return r25_crm_sub_col_elig_trea_bills;
	}
	public void setR25_crm_sub_col_elig_trea_bills(BigDecimal r25_crm_sub_col_elig_trea_bills) {
		this.r25_crm_sub_col_elig_trea_bills = r25_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR25_crm_sub_col_elig_deb_sec() {
		return r25_crm_sub_col_elig_deb_sec;
	}
	public void setR25_crm_sub_col_elig_deb_sec(BigDecimal r25_crm_sub_col_elig_deb_sec) {
		this.r25_crm_sub_col_elig_deb_sec = r25_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR25_crm_sub_col_elig_equi() {
		return r25_crm_sub_col_elig_equi;
	}
	public void setR25_crm_sub_col_elig_equi(BigDecimal r25_crm_sub_col_elig_equi) {
		this.r25_crm_sub_col_elig_equi = r25_crm_sub_col_elig_equi;
	}
	public BigDecimal getR25_crm_sub_col_elig_unit_tru() {
		return r25_crm_sub_col_elig_unit_tru;
	}
	public void setR25_crm_sub_col_elig_unit_tru(BigDecimal r25_crm_sub_col_elig_unit_tru) {
		this.r25_crm_sub_col_elig_unit_tru = r25_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR25_crm_sub_col_exp_cov() {
		return r25_crm_sub_col_exp_cov;
	}
	public void setR25_crm_sub_col_exp_cov(BigDecimal r25_crm_sub_col_exp_cov) {
		this.r25_crm_sub_col_exp_cov = r25_crm_sub_col_exp_cov;
	}
	public BigDecimal getR25_crm_sub_col_elig_exp_not_cov() {
		return r25_crm_sub_col_elig_exp_not_cov;
	}
	public void setR25_crm_sub_col_elig_exp_not_cov(BigDecimal r25_crm_sub_col_elig_exp_not_cov) {
		this.r25_crm_sub_col_elig_exp_not_cov = r25_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR25_crm_sub_rwa_ris_crm() {
		return r25_crm_sub_rwa_ris_crm;
	}
	public void setR25_crm_sub_rwa_ris_crm(BigDecimal r25_crm_sub_rwa_ris_crm) {
		this.r25_crm_sub_rwa_ris_crm = r25_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR25_crm_sub_rwa_cov_crm() {
		return r25_crm_sub_rwa_cov_crm;
	}
	public void setR25_crm_sub_rwa_cov_crm(BigDecimal r25_crm_sub_rwa_cov_crm) {
		this.r25_crm_sub_rwa_cov_crm = r25_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR25_crm_sub_rwa_org_cou() {
		return r25_crm_sub_rwa_org_cou;
	}
	public void setR25_crm_sub_rwa_org_cou(BigDecimal r25_crm_sub_rwa_org_cou) {
		this.r25_crm_sub_rwa_org_cou = r25_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR25_crm_sub_rwa_not_cov_crm() {
		return r25_crm_sub_rwa_not_cov_crm;
	}
	public void setR25_crm_sub_rwa_not_cov_crm(BigDecimal r25_crm_sub_rwa_not_cov_crm) {
		this.r25_crm_sub_rwa_not_cov_crm = r25_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR25_crm_comp_col_expo_elig() {
		return r25_crm_comp_col_expo_elig;
	}
	public void setR25_crm_comp_col_expo_elig(BigDecimal r25_crm_comp_col_expo_elig) {
		this.r25_crm_comp_col_expo_elig = r25_crm_comp_col_expo_elig;
	}
	public BigDecimal getR25_crm_comp_col_elig_expo_vol_adj() {
		return r25_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR25_crm_comp_col_elig_expo_vol_adj(BigDecimal r25_crm_comp_col_elig_expo_vol_adj) {
		this.r25_crm_comp_col_elig_expo_vol_adj = r25_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR25_crm_comp_col_elig_fin_hai() {
		return r25_crm_comp_col_elig_fin_hai;
	}
	public void setR25_crm_comp_col_elig_fin_hai(BigDecimal r25_crm_comp_col_elig_fin_hai) {
		this.r25_crm_comp_col_elig_fin_hai = r25_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR25_crm_comp_col_expo_val() {
		return r25_crm_comp_col_expo_val;
	}
	public void setR25_crm_comp_col_expo_val(BigDecimal r25_crm_comp_col_expo_val) {
		this.r25_crm_comp_col_expo_val = r25_crm_comp_col_expo_val;
	}
	public BigDecimal getR25_rwa_elig_expo_not_cov_crm() {
		return r25_rwa_elig_expo_not_cov_crm;
	}
	public void setR25_rwa_elig_expo_not_cov_crm(BigDecimal r25_rwa_elig_expo_not_cov_crm) {
		this.r25_rwa_elig_expo_not_cov_crm = r25_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR25_rwa_unsec_expo_cre_ris() {
		return r25_rwa_unsec_expo_cre_ris;
	}
	public void setR25_rwa_unsec_expo_cre_ris(BigDecimal r25_rwa_unsec_expo_cre_ris) {
		this.r25_rwa_unsec_expo_cre_ris = r25_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR25_rwa_unsec_expo() {
		return r25_rwa_unsec_expo;
	}
	public void setR25_rwa_unsec_expo(BigDecimal r25_rwa_unsec_expo) {
		this.r25_rwa_unsec_expo = r25_rwa_unsec_expo;
	}
	public BigDecimal getR25_rwa_tot_ris_wei_ass() {
		return r25_rwa_tot_ris_wei_ass;
	}
	public void setR25_rwa_tot_ris_wei_ass(BigDecimal r25_rwa_tot_ris_wei_ass) {
		this.r25_rwa_tot_ris_wei_ass = r25_rwa_tot_ris_wei_ass;
	}
	public String getR26_exposure_class() {
		return r26_exposure_class;
	}
	public void setR26_exposure_class(String r26_exposure_class) {
		this.r26_exposure_class = r26_exposure_class;
	}
	public BigDecimal getR26_expo_crm() {
		return r26_expo_crm;
	}
	public void setR26_expo_crm(BigDecimal r26_expo_crm) {
		this.r26_expo_crm = r26_expo_crm;
	}
	public BigDecimal getR26_spe_pro_expo() {
		return r26_spe_pro_expo;
	}
	public void setR26_spe_pro_expo(BigDecimal r26_spe_pro_expo) {
		this.r26_spe_pro_expo = r26_spe_pro_expo;
	}
	public BigDecimal getR26_amt_elig_sht_net() {
		return r26_amt_elig_sht_net;
	}
	public void setR26_amt_elig_sht_net(BigDecimal r26_amt_elig_sht_net) {
		this.r26_amt_elig_sht_net = r26_amt_elig_sht_net;
	}
	public BigDecimal getR26_tot_expo_net_spe() {
		return r26_tot_expo_net_spe;
	}
	public void setR26_tot_expo_net_spe(BigDecimal r26_tot_expo_net_spe) {
		this.r26_tot_expo_net_spe = r26_tot_expo_net_spe;
	}
	public BigDecimal getR26_crm_sub_elig_sub_app() {
		return r26_crm_sub_elig_sub_app;
	}
	public void setR26_crm_sub_elig_sub_app(BigDecimal r26_crm_sub_elig_sub_app) {
		this.r26_crm_sub_elig_sub_app = r26_crm_sub_elig_sub_app;
	}
	public BigDecimal getR26_crm_sub_non_col_guar() {
		return r26_crm_sub_non_col_guar;
	}
	public void setR26_crm_sub_non_col_guar(BigDecimal r26_crm_sub_non_col_guar) {
		this.r26_crm_sub_non_col_guar = r26_crm_sub_non_col_guar;
	}
	public BigDecimal getR26_crm_sub_non_col_cre_der() {
		return r26_crm_sub_non_col_cre_der;
	}
	public void setR26_crm_sub_non_col_cre_der(BigDecimal r26_crm_sub_non_col_cre_der) {
		this.r26_crm_sub_non_col_cre_der = r26_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR26_crm_sub_col_elig_cash() {
		return r26_crm_sub_col_elig_cash;
	}
	public void setR26_crm_sub_col_elig_cash(BigDecimal r26_crm_sub_col_elig_cash) {
		this.r26_crm_sub_col_elig_cash = r26_crm_sub_col_elig_cash;
	}
	public BigDecimal getR26_crm_sub_col_elig_trea_bills() {
		return r26_crm_sub_col_elig_trea_bills;
	}
	public void setR26_crm_sub_col_elig_trea_bills(BigDecimal r26_crm_sub_col_elig_trea_bills) {
		this.r26_crm_sub_col_elig_trea_bills = r26_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR26_crm_sub_col_elig_deb_sec() {
		return r26_crm_sub_col_elig_deb_sec;
	}
	public void setR26_crm_sub_col_elig_deb_sec(BigDecimal r26_crm_sub_col_elig_deb_sec) {
		this.r26_crm_sub_col_elig_deb_sec = r26_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR26_crm_sub_col_elig_equi() {
		return r26_crm_sub_col_elig_equi;
	}
	public void setR26_crm_sub_col_elig_equi(BigDecimal r26_crm_sub_col_elig_equi) {
		this.r26_crm_sub_col_elig_equi = r26_crm_sub_col_elig_equi;
	}
	public BigDecimal getR26_crm_sub_col_elig_unit_tru() {
		return r26_crm_sub_col_elig_unit_tru;
	}
	public void setR26_crm_sub_col_elig_unit_tru(BigDecimal r26_crm_sub_col_elig_unit_tru) {
		this.r26_crm_sub_col_elig_unit_tru = r26_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR26_crm_sub_col_exp_cov() {
		return r26_crm_sub_col_exp_cov;
	}
	public void setR26_crm_sub_col_exp_cov(BigDecimal r26_crm_sub_col_exp_cov) {
		this.r26_crm_sub_col_exp_cov = r26_crm_sub_col_exp_cov;
	}
	public BigDecimal getR26_crm_sub_col_elig_exp_not_cov() {
		return r26_crm_sub_col_elig_exp_not_cov;
	}
	public void setR26_crm_sub_col_elig_exp_not_cov(BigDecimal r26_crm_sub_col_elig_exp_not_cov) {
		this.r26_crm_sub_col_elig_exp_not_cov = r26_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR26_crm_sub_rwa_ris_crm() {
		return r26_crm_sub_rwa_ris_crm;
	}
	public void setR26_crm_sub_rwa_ris_crm(BigDecimal r26_crm_sub_rwa_ris_crm) {
		this.r26_crm_sub_rwa_ris_crm = r26_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR26_crm_sub_rwa_cov_crm() {
		return r26_crm_sub_rwa_cov_crm;
	}
	public void setR26_crm_sub_rwa_cov_crm(BigDecimal r26_crm_sub_rwa_cov_crm) {
		this.r26_crm_sub_rwa_cov_crm = r26_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR26_crm_sub_rwa_org_cou() {
		return r26_crm_sub_rwa_org_cou;
	}
	public void setR26_crm_sub_rwa_org_cou(BigDecimal r26_crm_sub_rwa_org_cou) {
		this.r26_crm_sub_rwa_org_cou = r26_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR26_crm_sub_rwa_not_cov_crm() {
		return r26_crm_sub_rwa_not_cov_crm;
	}
	public void setR26_crm_sub_rwa_not_cov_crm(BigDecimal r26_crm_sub_rwa_not_cov_crm) {
		this.r26_crm_sub_rwa_not_cov_crm = r26_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR26_crm_comp_col_expo_elig() {
		return r26_crm_comp_col_expo_elig;
	}
	public void setR26_crm_comp_col_expo_elig(BigDecimal r26_crm_comp_col_expo_elig) {
		this.r26_crm_comp_col_expo_elig = r26_crm_comp_col_expo_elig;
	}
	public BigDecimal getR26_crm_comp_col_elig_expo_vol_adj() {
		return r26_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR26_crm_comp_col_elig_expo_vol_adj(BigDecimal r26_crm_comp_col_elig_expo_vol_adj) {
		this.r26_crm_comp_col_elig_expo_vol_adj = r26_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR26_crm_comp_col_elig_fin_hai() {
		return r26_crm_comp_col_elig_fin_hai;
	}
	public void setR26_crm_comp_col_elig_fin_hai(BigDecimal r26_crm_comp_col_elig_fin_hai) {
		this.r26_crm_comp_col_elig_fin_hai = r26_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR26_crm_comp_col_expo_val() {
		return r26_crm_comp_col_expo_val;
	}
	public void setR26_crm_comp_col_expo_val(BigDecimal r26_crm_comp_col_expo_val) {
		this.r26_crm_comp_col_expo_val = r26_crm_comp_col_expo_val;
	}
	public BigDecimal getR26_rwa_elig_expo_not_cov_crm() {
		return r26_rwa_elig_expo_not_cov_crm;
	}
	public void setR26_rwa_elig_expo_not_cov_crm(BigDecimal r26_rwa_elig_expo_not_cov_crm) {
		this.r26_rwa_elig_expo_not_cov_crm = r26_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR26_rwa_unsec_expo_cre_ris() {
		return r26_rwa_unsec_expo_cre_ris;
	}
	public void setR26_rwa_unsec_expo_cre_ris(BigDecimal r26_rwa_unsec_expo_cre_ris) {
		this.r26_rwa_unsec_expo_cre_ris = r26_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR26_rwa_unsec_expo() {
		return r26_rwa_unsec_expo;
	}
	public void setR26_rwa_unsec_expo(BigDecimal r26_rwa_unsec_expo) {
		this.r26_rwa_unsec_expo = r26_rwa_unsec_expo;
	}
	public BigDecimal getR26_rwa_tot_ris_wei_ass() {
		return r26_rwa_tot_ris_wei_ass;
	}
	public void setR26_rwa_tot_ris_wei_ass(BigDecimal r26_rwa_tot_ris_wei_ass) {
		this.r26_rwa_tot_ris_wei_ass = r26_rwa_tot_ris_wei_ass;
	}
	public String getR27_exposure_class() {
		return r27_exposure_class;
	}
	public void setR27_exposure_class(String r27_exposure_class) {
		this.r27_exposure_class = r27_exposure_class;
	}
	public BigDecimal getR27_expo_crm() {
		return r27_expo_crm;
	}
	public void setR27_expo_crm(BigDecimal r27_expo_crm) {
		this.r27_expo_crm = r27_expo_crm;
	}
	public BigDecimal getR27_spe_pro_expo() {
		return r27_spe_pro_expo;
	}
	public void setR27_spe_pro_expo(BigDecimal r27_spe_pro_expo) {
		this.r27_spe_pro_expo = r27_spe_pro_expo;
	}
	public BigDecimal getR27_amt_elig_sht_net() {
		return r27_amt_elig_sht_net;
	}
	public void setR27_amt_elig_sht_net(BigDecimal r27_amt_elig_sht_net) {
		this.r27_amt_elig_sht_net = r27_amt_elig_sht_net;
	}
	public BigDecimal getR27_tot_expo_net_spe() {
		return r27_tot_expo_net_spe;
	}
	public void setR27_tot_expo_net_spe(BigDecimal r27_tot_expo_net_spe) {
		this.r27_tot_expo_net_spe = r27_tot_expo_net_spe;
	}
	public BigDecimal getR27_crm_sub_elig_sub_app() {
		return r27_crm_sub_elig_sub_app;
	}
	public void setR27_crm_sub_elig_sub_app(BigDecimal r27_crm_sub_elig_sub_app) {
		this.r27_crm_sub_elig_sub_app = r27_crm_sub_elig_sub_app;
	}
	public BigDecimal getR27_crm_sub_non_col_guar() {
		return r27_crm_sub_non_col_guar;
	}
	public void setR27_crm_sub_non_col_guar(BigDecimal r27_crm_sub_non_col_guar) {
		this.r27_crm_sub_non_col_guar = r27_crm_sub_non_col_guar;
	}
	public BigDecimal getR27_crm_sub_non_col_cre_der() {
		return r27_crm_sub_non_col_cre_der;
	}
	public void setR27_crm_sub_non_col_cre_der(BigDecimal r27_crm_sub_non_col_cre_der) {
		this.r27_crm_sub_non_col_cre_der = r27_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR27_crm_sub_col_elig_cash() {
		return r27_crm_sub_col_elig_cash;
	}
	public void setR27_crm_sub_col_elig_cash(BigDecimal r27_crm_sub_col_elig_cash) {
		this.r27_crm_sub_col_elig_cash = r27_crm_sub_col_elig_cash;
	}
	public BigDecimal getR27_crm_sub_col_elig_trea_bills() {
		return r27_crm_sub_col_elig_trea_bills;
	}
	public void setR27_crm_sub_col_elig_trea_bills(BigDecimal r27_crm_sub_col_elig_trea_bills) {
		this.r27_crm_sub_col_elig_trea_bills = r27_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR27_crm_sub_col_elig_deb_sec() {
		return r27_crm_sub_col_elig_deb_sec;
	}
	public void setR27_crm_sub_col_elig_deb_sec(BigDecimal r27_crm_sub_col_elig_deb_sec) {
		this.r27_crm_sub_col_elig_deb_sec = r27_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR27_crm_sub_col_elig_equi() {
		return r27_crm_sub_col_elig_equi;
	}
	public void setR27_crm_sub_col_elig_equi(BigDecimal r27_crm_sub_col_elig_equi) {
		this.r27_crm_sub_col_elig_equi = r27_crm_sub_col_elig_equi;
	}
	public BigDecimal getR27_crm_sub_col_elig_unit_tru() {
		return r27_crm_sub_col_elig_unit_tru;
	}
	public void setR27_crm_sub_col_elig_unit_tru(BigDecimal r27_crm_sub_col_elig_unit_tru) {
		this.r27_crm_sub_col_elig_unit_tru = r27_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR27_crm_sub_col_exp_cov() {
		return r27_crm_sub_col_exp_cov;
	}
	public void setR27_crm_sub_col_exp_cov(BigDecimal r27_crm_sub_col_exp_cov) {
		this.r27_crm_sub_col_exp_cov = r27_crm_sub_col_exp_cov;
	}
	public BigDecimal getR27_crm_sub_col_elig_exp_not_cov() {
		return r27_crm_sub_col_elig_exp_not_cov;
	}
	public void setR27_crm_sub_col_elig_exp_not_cov(BigDecimal r27_crm_sub_col_elig_exp_not_cov) {
		this.r27_crm_sub_col_elig_exp_not_cov = r27_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR27_crm_sub_rwa_ris_crm() {
		return r27_crm_sub_rwa_ris_crm;
	}
	public void setR27_crm_sub_rwa_ris_crm(BigDecimal r27_crm_sub_rwa_ris_crm) {
		this.r27_crm_sub_rwa_ris_crm = r27_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR27_crm_sub_rwa_cov_crm() {
		return r27_crm_sub_rwa_cov_crm;
	}
	public void setR27_crm_sub_rwa_cov_crm(BigDecimal r27_crm_sub_rwa_cov_crm) {
		this.r27_crm_sub_rwa_cov_crm = r27_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR27_crm_sub_rwa_org_cou() {
		return r27_crm_sub_rwa_org_cou;
	}
	public void setR27_crm_sub_rwa_org_cou(BigDecimal r27_crm_sub_rwa_org_cou) {
		this.r27_crm_sub_rwa_org_cou = r27_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR27_crm_sub_rwa_not_cov_crm() {
		return r27_crm_sub_rwa_not_cov_crm;
	}
	public void setR27_crm_sub_rwa_not_cov_crm(BigDecimal r27_crm_sub_rwa_not_cov_crm) {
		this.r27_crm_sub_rwa_not_cov_crm = r27_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR27_crm_comp_col_expo_elig() {
		return r27_crm_comp_col_expo_elig;
	}
	public void setR27_crm_comp_col_expo_elig(BigDecimal r27_crm_comp_col_expo_elig) {
		this.r27_crm_comp_col_expo_elig = r27_crm_comp_col_expo_elig;
	}
	public BigDecimal getR27_crm_comp_col_elig_expo_vol_adj() {
		return r27_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR27_crm_comp_col_elig_expo_vol_adj(BigDecimal r27_crm_comp_col_elig_expo_vol_adj) {
		this.r27_crm_comp_col_elig_expo_vol_adj = r27_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR27_crm_comp_col_elig_fin_hai() {
		return r27_crm_comp_col_elig_fin_hai;
	}
	public void setR27_crm_comp_col_elig_fin_hai(BigDecimal r27_crm_comp_col_elig_fin_hai) {
		this.r27_crm_comp_col_elig_fin_hai = r27_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR27_crm_comp_col_expo_val() {
		return r27_crm_comp_col_expo_val;
	}
	public void setR27_crm_comp_col_expo_val(BigDecimal r27_crm_comp_col_expo_val) {
		this.r27_crm_comp_col_expo_val = r27_crm_comp_col_expo_val;
	}
	public BigDecimal getR27_rwa_elig_expo_not_cov_crm() {
		return r27_rwa_elig_expo_not_cov_crm;
	}
	public void setR27_rwa_elig_expo_not_cov_crm(BigDecimal r27_rwa_elig_expo_not_cov_crm) {
		this.r27_rwa_elig_expo_not_cov_crm = r27_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR27_rwa_unsec_expo_cre_ris() {
		return r27_rwa_unsec_expo_cre_ris;
	}
	public void setR27_rwa_unsec_expo_cre_ris(BigDecimal r27_rwa_unsec_expo_cre_ris) {
		this.r27_rwa_unsec_expo_cre_ris = r27_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR27_rwa_unsec_expo() {
		return r27_rwa_unsec_expo;
	}
	public void setR27_rwa_unsec_expo(BigDecimal r27_rwa_unsec_expo) {
		this.r27_rwa_unsec_expo = r27_rwa_unsec_expo;
	}
	public BigDecimal getR27_rwa_tot_ris_wei_ass() {
		return r27_rwa_tot_ris_wei_ass;
	}
	public void setR27_rwa_tot_ris_wei_ass(BigDecimal r27_rwa_tot_ris_wei_ass) {
		this.r27_rwa_tot_ris_wei_ass = r27_rwa_tot_ris_wei_ass;
	}
	public String getR28_exposure_class() {
		return r28_exposure_class;
	}
	public void setR28_exposure_class(String r28_exposure_class) {
		this.r28_exposure_class = r28_exposure_class;
	}
	public BigDecimal getR28_expo_crm() {
		return r28_expo_crm;
	}
	public void setR28_expo_crm(BigDecimal r28_expo_crm) {
		this.r28_expo_crm = r28_expo_crm;
	}
	public BigDecimal getR28_spe_pro_expo() {
		return r28_spe_pro_expo;
	}
	public void setR28_spe_pro_expo(BigDecimal r28_spe_pro_expo) {
		this.r28_spe_pro_expo = r28_spe_pro_expo;
	}
	public BigDecimal getR28_amt_elig_sht_net() {
		return r28_amt_elig_sht_net;
	}
	public void setR28_amt_elig_sht_net(BigDecimal r28_amt_elig_sht_net) {
		this.r28_amt_elig_sht_net = r28_amt_elig_sht_net;
	}
	public BigDecimal getR28_tot_expo_net_spe() {
		return r28_tot_expo_net_spe;
	}
	public void setR28_tot_expo_net_spe(BigDecimal r28_tot_expo_net_spe) {
		this.r28_tot_expo_net_spe = r28_tot_expo_net_spe;
	}
	public BigDecimal getR28_crm_sub_elig_sub_app() {
		return r28_crm_sub_elig_sub_app;
	}
	public void setR28_crm_sub_elig_sub_app(BigDecimal r28_crm_sub_elig_sub_app) {
		this.r28_crm_sub_elig_sub_app = r28_crm_sub_elig_sub_app;
	}
	public BigDecimal getR28_crm_sub_non_col_guar() {
		return r28_crm_sub_non_col_guar;
	}
	public void setR28_crm_sub_non_col_guar(BigDecimal r28_crm_sub_non_col_guar) {
		this.r28_crm_sub_non_col_guar = r28_crm_sub_non_col_guar;
	}
	public BigDecimal getR28_crm_sub_non_col_cre_der() {
		return r28_crm_sub_non_col_cre_der;
	}
	public void setR28_crm_sub_non_col_cre_der(BigDecimal r28_crm_sub_non_col_cre_der) {
		this.r28_crm_sub_non_col_cre_der = r28_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR28_crm_sub_col_elig_cash() {
		return r28_crm_sub_col_elig_cash;
	}
	public void setR28_crm_sub_col_elig_cash(BigDecimal r28_crm_sub_col_elig_cash) {
		this.r28_crm_sub_col_elig_cash = r28_crm_sub_col_elig_cash;
	}
	public BigDecimal getR28_crm_sub_col_elig_trea_bills() {
		return r28_crm_sub_col_elig_trea_bills;
	}
	public void setR28_crm_sub_col_elig_trea_bills(BigDecimal r28_crm_sub_col_elig_trea_bills) {
		this.r28_crm_sub_col_elig_trea_bills = r28_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR28_crm_sub_col_elig_deb_sec() {
		return r28_crm_sub_col_elig_deb_sec;
	}
	public void setR28_crm_sub_col_elig_deb_sec(BigDecimal r28_crm_sub_col_elig_deb_sec) {
		this.r28_crm_sub_col_elig_deb_sec = r28_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR28_crm_sub_col_elig_equi() {
		return r28_crm_sub_col_elig_equi;
	}
	public void setR28_crm_sub_col_elig_equi(BigDecimal r28_crm_sub_col_elig_equi) {
		this.r28_crm_sub_col_elig_equi = r28_crm_sub_col_elig_equi;
	}
	public BigDecimal getR28_crm_sub_col_elig_unit_tru() {
		return r28_crm_sub_col_elig_unit_tru;
	}
	public void setR28_crm_sub_col_elig_unit_tru(BigDecimal r28_crm_sub_col_elig_unit_tru) {
		this.r28_crm_sub_col_elig_unit_tru = r28_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR28_crm_sub_col_exp_cov() {
		return r28_crm_sub_col_exp_cov;
	}
	public void setR28_crm_sub_col_exp_cov(BigDecimal r28_crm_sub_col_exp_cov) {
		this.r28_crm_sub_col_exp_cov = r28_crm_sub_col_exp_cov;
	}
	public BigDecimal getR28_crm_sub_col_elig_exp_not_cov() {
		return r28_crm_sub_col_elig_exp_not_cov;
	}
	public void setR28_crm_sub_col_elig_exp_not_cov(BigDecimal r28_crm_sub_col_elig_exp_not_cov) {
		this.r28_crm_sub_col_elig_exp_not_cov = r28_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR28_crm_sub_rwa_ris_crm() {
		return r28_crm_sub_rwa_ris_crm;
	}
	public void setR28_crm_sub_rwa_ris_crm(BigDecimal r28_crm_sub_rwa_ris_crm) {
		this.r28_crm_sub_rwa_ris_crm = r28_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR28_crm_sub_rwa_cov_crm() {
		return r28_crm_sub_rwa_cov_crm;
	}
	public void setR28_crm_sub_rwa_cov_crm(BigDecimal r28_crm_sub_rwa_cov_crm) {
		this.r28_crm_sub_rwa_cov_crm = r28_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR28_crm_sub_rwa_org_cou() {
		return r28_crm_sub_rwa_org_cou;
	}
	public void setR28_crm_sub_rwa_org_cou(BigDecimal r28_crm_sub_rwa_org_cou) {
		this.r28_crm_sub_rwa_org_cou = r28_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR28_crm_sub_rwa_not_cov_crm() {
		return r28_crm_sub_rwa_not_cov_crm;
	}
	public void setR28_crm_sub_rwa_not_cov_crm(BigDecimal r28_crm_sub_rwa_not_cov_crm) {
		this.r28_crm_sub_rwa_not_cov_crm = r28_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR28_crm_comp_col_expo_elig() {
		return r28_crm_comp_col_expo_elig;
	}
	public void setR28_crm_comp_col_expo_elig(BigDecimal r28_crm_comp_col_expo_elig) {
		this.r28_crm_comp_col_expo_elig = r28_crm_comp_col_expo_elig;
	}
	public BigDecimal getR28_crm_comp_col_elig_expo_vol_adj() {
		return r28_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR28_crm_comp_col_elig_expo_vol_adj(BigDecimal r28_crm_comp_col_elig_expo_vol_adj) {
		this.r28_crm_comp_col_elig_expo_vol_adj = r28_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR28_crm_comp_col_elig_fin_hai() {
		return r28_crm_comp_col_elig_fin_hai;
	}
	public void setR28_crm_comp_col_elig_fin_hai(BigDecimal r28_crm_comp_col_elig_fin_hai) {
		this.r28_crm_comp_col_elig_fin_hai = r28_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR28_crm_comp_col_expo_val() {
		return r28_crm_comp_col_expo_val;
	}
	public void setR28_crm_comp_col_expo_val(BigDecimal r28_crm_comp_col_expo_val) {
		this.r28_crm_comp_col_expo_val = r28_crm_comp_col_expo_val;
	}
	public BigDecimal getR28_rwa_elig_expo_not_cov_crm() {
		return r28_rwa_elig_expo_not_cov_crm;
	}
	public void setR28_rwa_elig_expo_not_cov_crm(BigDecimal r28_rwa_elig_expo_not_cov_crm) {
		this.r28_rwa_elig_expo_not_cov_crm = r28_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR28_rwa_unsec_expo_cre_ris() {
		return r28_rwa_unsec_expo_cre_ris;
	}
	public void setR28_rwa_unsec_expo_cre_ris(BigDecimal r28_rwa_unsec_expo_cre_ris) {
		this.r28_rwa_unsec_expo_cre_ris = r28_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR28_rwa_unsec_expo() {
		return r28_rwa_unsec_expo;
	}
	public void setR28_rwa_unsec_expo(BigDecimal r28_rwa_unsec_expo) {
		this.r28_rwa_unsec_expo = r28_rwa_unsec_expo;
	}
	public BigDecimal getR28_rwa_tot_ris_wei_ass() {
		return r28_rwa_tot_ris_wei_ass;
	}
	public void setR28_rwa_tot_ris_wei_ass(BigDecimal r28_rwa_tot_ris_wei_ass) {
		this.r28_rwa_tot_ris_wei_ass = r28_rwa_tot_ris_wei_ass;
	}
	public String getR29_exposure_class() {
		return r29_exposure_class;
	}
	public void setR29_exposure_class(String r29_exposure_class) {
		this.r29_exposure_class = r29_exposure_class;
	}
	public BigDecimal getR29_expo_crm() {
		return r29_expo_crm;
	}
	public void setR29_expo_crm(BigDecimal r29_expo_crm) {
		this.r29_expo_crm = r29_expo_crm;
	}
	public BigDecimal getR29_spe_pro_expo() {
		return r29_spe_pro_expo;
	}
	public void setR29_spe_pro_expo(BigDecimal r29_spe_pro_expo) {
		this.r29_spe_pro_expo = r29_spe_pro_expo;
	}
	public BigDecimal getR29_amt_elig_sht_net() {
		return r29_amt_elig_sht_net;
	}
	public void setR29_amt_elig_sht_net(BigDecimal r29_amt_elig_sht_net) {
		this.r29_amt_elig_sht_net = r29_amt_elig_sht_net;
	}
	public BigDecimal getR29_tot_expo_net_spe() {
		return r29_tot_expo_net_spe;
	}
	public void setR29_tot_expo_net_spe(BigDecimal r29_tot_expo_net_spe) {
		this.r29_tot_expo_net_spe = r29_tot_expo_net_spe;
	}
	public BigDecimal getR29_crm_sub_elig_sub_app() {
		return r29_crm_sub_elig_sub_app;
	}
	public void setR29_crm_sub_elig_sub_app(BigDecimal r29_crm_sub_elig_sub_app) {
		this.r29_crm_sub_elig_sub_app = r29_crm_sub_elig_sub_app;
	}
	public BigDecimal getR29_crm_sub_non_col_guar() {
		return r29_crm_sub_non_col_guar;
	}
	public void setR29_crm_sub_non_col_guar(BigDecimal r29_crm_sub_non_col_guar) {
		this.r29_crm_sub_non_col_guar = r29_crm_sub_non_col_guar;
	}
	public BigDecimal getR29_crm_sub_non_col_cre_der() {
		return r29_crm_sub_non_col_cre_der;
	}
	public void setR29_crm_sub_non_col_cre_der(BigDecimal r29_crm_sub_non_col_cre_der) {
		this.r29_crm_sub_non_col_cre_der = r29_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR29_crm_sub_col_elig_cash() {
		return r29_crm_sub_col_elig_cash;
	}
	public void setR29_crm_sub_col_elig_cash(BigDecimal r29_crm_sub_col_elig_cash) {
		this.r29_crm_sub_col_elig_cash = r29_crm_sub_col_elig_cash;
	}
	public BigDecimal getR29_crm_sub_col_elig_trea_bills() {
		return r29_crm_sub_col_elig_trea_bills;
	}
	public void setR29_crm_sub_col_elig_trea_bills(BigDecimal r29_crm_sub_col_elig_trea_bills) {
		this.r29_crm_sub_col_elig_trea_bills = r29_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR29_crm_sub_col_elig_deb_sec() {
		return r29_crm_sub_col_elig_deb_sec;
	}
	public void setR29_crm_sub_col_elig_deb_sec(BigDecimal r29_crm_sub_col_elig_deb_sec) {
		this.r29_crm_sub_col_elig_deb_sec = r29_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR29_crm_sub_col_elig_equi() {
		return r29_crm_sub_col_elig_equi;
	}
	public void setR29_crm_sub_col_elig_equi(BigDecimal r29_crm_sub_col_elig_equi) {
		this.r29_crm_sub_col_elig_equi = r29_crm_sub_col_elig_equi;
	}
	public BigDecimal getR29_crm_sub_col_elig_unit_tru() {
		return r29_crm_sub_col_elig_unit_tru;
	}
	public void setR29_crm_sub_col_elig_unit_tru(BigDecimal r29_crm_sub_col_elig_unit_tru) {
		this.r29_crm_sub_col_elig_unit_tru = r29_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR29_crm_sub_col_exp_cov() {
		return r29_crm_sub_col_exp_cov;
	}
	public void setR29_crm_sub_col_exp_cov(BigDecimal r29_crm_sub_col_exp_cov) {
		this.r29_crm_sub_col_exp_cov = r29_crm_sub_col_exp_cov;
	}
	public BigDecimal getR29_crm_sub_col_elig_exp_not_cov() {
		return r29_crm_sub_col_elig_exp_not_cov;
	}
	public void setR29_crm_sub_col_elig_exp_not_cov(BigDecimal r29_crm_sub_col_elig_exp_not_cov) {
		this.r29_crm_sub_col_elig_exp_not_cov = r29_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR29_crm_sub_rwa_ris_crm() {
		return r29_crm_sub_rwa_ris_crm;
	}
	public void setR29_crm_sub_rwa_ris_crm(BigDecimal r29_crm_sub_rwa_ris_crm) {
		this.r29_crm_sub_rwa_ris_crm = r29_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR29_crm_sub_rwa_cov_crm() {
		return r29_crm_sub_rwa_cov_crm;
	}
	public void setR29_crm_sub_rwa_cov_crm(BigDecimal r29_crm_sub_rwa_cov_crm) {
		this.r29_crm_sub_rwa_cov_crm = r29_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR29_crm_sub_rwa_org_cou() {
		return r29_crm_sub_rwa_org_cou;
	}
	public void setR29_crm_sub_rwa_org_cou(BigDecimal r29_crm_sub_rwa_org_cou) {
		this.r29_crm_sub_rwa_org_cou = r29_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR29_crm_sub_rwa_not_cov_crm() {
		return r29_crm_sub_rwa_not_cov_crm;
	}
	public void setR29_crm_sub_rwa_not_cov_crm(BigDecimal r29_crm_sub_rwa_not_cov_crm) {
		this.r29_crm_sub_rwa_not_cov_crm = r29_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR29_crm_comp_col_expo_elig() {
		return r29_crm_comp_col_expo_elig;
	}
	public void setR29_crm_comp_col_expo_elig(BigDecimal r29_crm_comp_col_expo_elig) {
		this.r29_crm_comp_col_expo_elig = r29_crm_comp_col_expo_elig;
	}
	public BigDecimal getR29_crm_comp_col_elig_expo_vol_adj() {
		return r29_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR29_crm_comp_col_elig_expo_vol_adj(BigDecimal r29_crm_comp_col_elig_expo_vol_adj) {
		this.r29_crm_comp_col_elig_expo_vol_adj = r29_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR29_crm_comp_col_elig_fin_hai() {
		return r29_crm_comp_col_elig_fin_hai;
	}
	public void setR29_crm_comp_col_elig_fin_hai(BigDecimal r29_crm_comp_col_elig_fin_hai) {
		this.r29_crm_comp_col_elig_fin_hai = r29_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR29_crm_comp_col_expo_val() {
		return r29_crm_comp_col_expo_val;
	}
	public void setR29_crm_comp_col_expo_val(BigDecimal r29_crm_comp_col_expo_val) {
		this.r29_crm_comp_col_expo_val = r29_crm_comp_col_expo_val;
	}
	public BigDecimal getR29_rwa_elig_expo_not_cov_crm() {
		return r29_rwa_elig_expo_not_cov_crm;
	}
	public void setR29_rwa_elig_expo_not_cov_crm(BigDecimal r29_rwa_elig_expo_not_cov_crm) {
		this.r29_rwa_elig_expo_not_cov_crm = r29_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR29_rwa_unsec_expo_cre_ris() {
		return r29_rwa_unsec_expo_cre_ris;
	}
	public void setR29_rwa_unsec_expo_cre_ris(BigDecimal r29_rwa_unsec_expo_cre_ris) {
		this.r29_rwa_unsec_expo_cre_ris = r29_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR29_rwa_unsec_expo() {
		return r29_rwa_unsec_expo;
	}
	public void setR29_rwa_unsec_expo(BigDecimal r29_rwa_unsec_expo) {
		this.r29_rwa_unsec_expo = r29_rwa_unsec_expo;
	}
	public BigDecimal getR29_rwa_tot_ris_wei_ass() {
		return r29_rwa_tot_ris_wei_ass;
	}
	public void setR29_rwa_tot_ris_wei_ass(BigDecimal r29_rwa_tot_ris_wei_ass) {
		this.r29_rwa_tot_ris_wei_ass = r29_rwa_tot_ris_wei_ass;
	}
	public String getR32_exposure_class() {
		return r32_exposure_class;
	}
	public void setR32_exposure_class(String r32_exposure_class) {
		this.r32_exposure_class = r32_exposure_class;
	}
	public BigDecimal getR32_expo_crm() {
		return r32_expo_crm;
	}
	public void setR32_expo_crm(BigDecimal r32_expo_crm) {
		this.r32_expo_crm = r32_expo_crm;
	}
	public BigDecimal getR32_spe_pro_expo() {
		return r32_spe_pro_expo;
	}
	public void setR32_spe_pro_expo(BigDecimal r32_spe_pro_expo) {
		this.r32_spe_pro_expo = r32_spe_pro_expo;
	}
	public BigDecimal getR32_amt_elig_sht_net() {
		return r32_amt_elig_sht_net;
	}
	public void setR32_amt_elig_sht_net(BigDecimal r32_amt_elig_sht_net) {
		this.r32_amt_elig_sht_net = r32_amt_elig_sht_net;
	}
	public BigDecimal getR32_tot_expo_net_spe() {
		return r32_tot_expo_net_spe;
	}
	public void setR32_tot_expo_net_spe(BigDecimal r32_tot_expo_net_spe) {
		this.r32_tot_expo_net_spe = r32_tot_expo_net_spe;
	}
	public BigDecimal getR32_crm_sub_elig_sub_app() {
		return r32_crm_sub_elig_sub_app;
	}
	public void setR32_crm_sub_elig_sub_app(BigDecimal r32_crm_sub_elig_sub_app) {
		this.r32_crm_sub_elig_sub_app = r32_crm_sub_elig_sub_app;
	}
	public BigDecimal getR32_crm_sub_non_col_guar() {
		return r32_crm_sub_non_col_guar;
	}
	public void setR32_crm_sub_non_col_guar(BigDecimal r32_crm_sub_non_col_guar) {
		this.r32_crm_sub_non_col_guar = r32_crm_sub_non_col_guar;
	}
	public BigDecimal getR32_crm_sub_non_col_cre_der() {
		return r32_crm_sub_non_col_cre_der;
	}
	public void setR32_crm_sub_non_col_cre_der(BigDecimal r32_crm_sub_non_col_cre_der) {
		this.r32_crm_sub_non_col_cre_der = r32_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR32_crm_sub_col_elig_cash() {
		return r32_crm_sub_col_elig_cash;
	}
	public void setR32_crm_sub_col_elig_cash(BigDecimal r32_crm_sub_col_elig_cash) {
		this.r32_crm_sub_col_elig_cash = r32_crm_sub_col_elig_cash;
	}
	public BigDecimal getR32_crm_sub_col_elig_trea_bills() {
		return r32_crm_sub_col_elig_trea_bills;
	}
	public void setR32_crm_sub_col_elig_trea_bills(BigDecimal r32_crm_sub_col_elig_trea_bills) {
		this.r32_crm_sub_col_elig_trea_bills = r32_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR32_crm_sub_col_elig_deb_sec() {
		return r32_crm_sub_col_elig_deb_sec;
	}
	public void setR32_crm_sub_col_elig_deb_sec(BigDecimal r32_crm_sub_col_elig_deb_sec) {
		this.r32_crm_sub_col_elig_deb_sec = r32_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR32_crm_sub_col_elig_equi() {
		return r32_crm_sub_col_elig_equi;
	}
	public void setR32_crm_sub_col_elig_equi(BigDecimal r32_crm_sub_col_elig_equi) {
		this.r32_crm_sub_col_elig_equi = r32_crm_sub_col_elig_equi;
	}
	public BigDecimal getR32_crm_sub_col_elig_unit_tru() {
		return r32_crm_sub_col_elig_unit_tru;
	}
	public void setR32_crm_sub_col_elig_unit_tru(BigDecimal r32_crm_sub_col_elig_unit_tru) {
		this.r32_crm_sub_col_elig_unit_tru = r32_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR32_crm_sub_col_exp_cov() {
		return r32_crm_sub_col_exp_cov;
	}
	public void setR32_crm_sub_col_exp_cov(BigDecimal r32_crm_sub_col_exp_cov) {
		this.r32_crm_sub_col_exp_cov = r32_crm_sub_col_exp_cov;
	}
	public BigDecimal getR32_crm_sub_col_elig_exp_not_cov() {
		return r32_crm_sub_col_elig_exp_not_cov;
	}
	public void setR32_crm_sub_col_elig_exp_not_cov(BigDecimal r32_crm_sub_col_elig_exp_not_cov) {
		this.r32_crm_sub_col_elig_exp_not_cov = r32_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR32_crm_sub_rwa_ris_crm() {
		return r32_crm_sub_rwa_ris_crm;
	}
	public void setR32_crm_sub_rwa_ris_crm(BigDecimal r32_crm_sub_rwa_ris_crm) {
		this.r32_crm_sub_rwa_ris_crm = r32_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR32_crm_sub_rwa_cov_crm() {
		return r32_crm_sub_rwa_cov_crm;
	}
	public void setR32_crm_sub_rwa_cov_crm(BigDecimal r32_crm_sub_rwa_cov_crm) {
		this.r32_crm_sub_rwa_cov_crm = r32_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR32_crm_sub_rwa_org_cou() {
		return r32_crm_sub_rwa_org_cou;
	}
	public void setR32_crm_sub_rwa_org_cou(BigDecimal r32_crm_sub_rwa_org_cou) {
		this.r32_crm_sub_rwa_org_cou = r32_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR32_crm_sub_rwa_not_cov_crm() {
		return r32_crm_sub_rwa_not_cov_crm;
	}
	public void setR32_crm_sub_rwa_not_cov_crm(BigDecimal r32_crm_sub_rwa_not_cov_crm) {
		this.r32_crm_sub_rwa_not_cov_crm = r32_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR32_crm_comp_col_expo_elig() {
		return r32_crm_comp_col_expo_elig;
	}
	public void setR32_crm_comp_col_expo_elig(BigDecimal r32_crm_comp_col_expo_elig) {
		this.r32_crm_comp_col_expo_elig = r32_crm_comp_col_expo_elig;
	}
	public BigDecimal getR32_crm_comp_col_elig_expo_vol_adj() {
		return r32_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR32_crm_comp_col_elig_expo_vol_adj(BigDecimal r32_crm_comp_col_elig_expo_vol_adj) {
		this.r32_crm_comp_col_elig_expo_vol_adj = r32_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR32_crm_comp_col_elig_fin_hai() {
		return r32_crm_comp_col_elig_fin_hai;
	}
	public void setR32_crm_comp_col_elig_fin_hai(BigDecimal r32_crm_comp_col_elig_fin_hai) {
		this.r32_crm_comp_col_elig_fin_hai = r32_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR32_crm_comp_col_expo_val() {
		return r32_crm_comp_col_expo_val;
	}
	public void setR32_crm_comp_col_expo_val(BigDecimal r32_crm_comp_col_expo_val) {
		this.r32_crm_comp_col_expo_val = r32_crm_comp_col_expo_val;
	}
	public BigDecimal getR32_rwa_elig_expo_not_cov_crm() {
		return r32_rwa_elig_expo_not_cov_crm;
	}
	public void setR32_rwa_elig_expo_not_cov_crm(BigDecimal r32_rwa_elig_expo_not_cov_crm) {
		this.r32_rwa_elig_expo_not_cov_crm = r32_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR32_rwa_unsec_expo_cre_ris() {
		return r32_rwa_unsec_expo_cre_ris;
	}
	public void setR32_rwa_unsec_expo_cre_ris(BigDecimal r32_rwa_unsec_expo_cre_ris) {
		this.r32_rwa_unsec_expo_cre_ris = r32_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR32_rwa_unsec_expo() {
		return r32_rwa_unsec_expo;
	}
	public void setR32_rwa_unsec_expo(BigDecimal r32_rwa_unsec_expo) {
		this.r32_rwa_unsec_expo = r32_rwa_unsec_expo;
	}
	public BigDecimal getR32_rwa_tot_ris_wei_ass() {
		return r32_rwa_tot_ris_wei_ass;
	}
	public void setR32_rwa_tot_ris_wei_ass(BigDecimal r32_rwa_tot_ris_wei_ass) {
		this.r32_rwa_tot_ris_wei_ass = r32_rwa_tot_ris_wei_ass;
	}
	public String getR33_exposure_class() {
		return r33_exposure_class;
	}
	public void setR33_exposure_class(String r33_exposure_class) {
		this.r33_exposure_class = r33_exposure_class;
	}
	public BigDecimal getR33_expo_crm() {
		return r33_expo_crm;
	}
	public void setR33_expo_crm(BigDecimal r33_expo_crm) {
		this.r33_expo_crm = r33_expo_crm;
	}
	public BigDecimal getR33_spe_pro_expo() {
		return r33_spe_pro_expo;
	}
	public void setR33_spe_pro_expo(BigDecimal r33_spe_pro_expo) {
		this.r33_spe_pro_expo = r33_spe_pro_expo;
	}
	public BigDecimal getR33_amt_elig_sht_net() {
		return r33_amt_elig_sht_net;
	}
	public void setR33_amt_elig_sht_net(BigDecimal r33_amt_elig_sht_net) {
		this.r33_amt_elig_sht_net = r33_amt_elig_sht_net;
	}
	public BigDecimal getR33_tot_expo_net_spe() {
		return r33_tot_expo_net_spe;
	}
	public void setR33_tot_expo_net_spe(BigDecimal r33_tot_expo_net_spe) {
		this.r33_tot_expo_net_spe = r33_tot_expo_net_spe;
	}
	public BigDecimal getR33_crm_sub_elig_sub_app() {
		return r33_crm_sub_elig_sub_app;
	}
	public void setR33_crm_sub_elig_sub_app(BigDecimal r33_crm_sub_elig_sub_app) {
		this.r33_crm_sub_elig_sub_app = r33_crm_sub_elig_sub_app;
	}
	public BigDecimal getR33_crm_sub_non_col_guar() {
		return r33_crm_sub_non_col_guar;
	}
	public void setR33_crm_sub_non_col_guar(BigDecimal r33_crm_sub_non_col_guar) {
		this.r33_crm_sub_non_col_guar = r33_crm_sub_non_col_guar;
	}
	public BigDecimal getR33_crm_sub_non_col_cre_der() {
		return r33_crm_sub_non_col_cre_der;
	}
	public void setR33_crm_sub_non_col_cre_der(BigDecimal r33_crm_sub_non_col_cre_der) {
		this.r33_crm_sub_non_col_cre_der = r33_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR33_crm_sub_col_elig_cash() {
		return r33_crm_sub_col_elig_cash;
	}
	public void setR33_crm_sub_col_elig_cash(BigDecimal r33_crm_sub_col_elig_cash) {
		this.r33_crm_sub_col_elig_cash = r33_crm_sub_col_elig_cash;
	}
	public BigDecimal getR33_crm_sub_col_elig_trea_bills() {
		return r33_crm_sub_col_elig_trea_bills;
	}
	public void setR33_crm_sub_col_elig_trea_bills(BigDecimal r33_crm_sub_col_elig_trea_bills) {
		this.r33_crm_sub_col_elig_trea_bills = r33_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR33_crm_sub_col_elig_deb_sec() {
		return r33_crm_sub_col_elig_deb_sec;
	}
	public void setR33_crm_sub_col_elig_deb_sec(BigDecimal r33_crm_sub_col_elig_deb_sec) {
		this.r33_crm_sub_col_elig_deb_sec = r33_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR33_crm_sub_col_elig_equi() {
		return r33_crm_sub_col_elig_equi;
	}
	public void setR33_crm_sub_col_elig_equi(BigDecimal r33_crm_sub_col_elig_equi) {
		this.r33_crm_sub_col_elig_equi = r33_crm_sub_col_elig_equi;
	}
	public BigDecimal getR33_crm_sub_col_elig_unit_tru() {
		return r33_crm_sub_col_elig_unit_tru;
	}
	public void setR33_crm_sub_col_elig_unit_tru(BigDecimal r33_crm_sub_col_elig_unit_tru) {
		this.r33_crm_sub_col_elig_unit_tru = r33_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR33_crm_sub_col_exp_cov() {
		return r33_crm_sub_col_exp_cov;
	}
	public void setR33_crm_sub_col_exp_cov(BigDecimal r33_crm_sub_col_exp_cov) {
		this.r33_crm_sub_col_exp_cov = r33_crm_sub_col_exp_cov;
	}
	public BigDecimal getR33_crm_sub_col_elig_exp_not_cov() {
		return r33_crm_sub_col_elig_exp_not_cov;
	}
	public void setR33_crm_sub_col_elig_exp_not_cov(BigDecimal r33_crm_sub_col_elig_exp_not_cov) {
		this.r33_crm_sub_col_elig_exp_not_cov = r33_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR33_crm_sub_rwa_ris_crm() {
		return r33_crm_sub_rwa_ris_crm;
	}
	public void setR33_crm_sub_rwa_ris_crm(BigDecimal r33_crm_sub_rwa_ris_crm) {
		this.r33_crm_sub_rwa_ris_crm = r33_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR33_crm_sub_rwa_cov_crm() {
		return r33_crm_sub_rwa_cov_crm;
	}
	public void setR33_crm_sub_rwa_cov_crm(BigDecimal r33_crm_sub_rwa_cov_crm) {
		this.r33_crm_sub_rwa_cov_crm = r33_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR33_crm_sub_rwa_org_cou() {
		return r33_crm_sub_rwa_org_cou;
	}
	public void setR33_crm_sub_rwa_org_cou(BigDecimal r33_crm_sub_rwa_org_cou) {
		this.r33_crm_sub_rwa_org_cou = r33_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR33_crm_sub_rwa_not_cov_crm() {
		return r33_crm_sub_rwa_not_cov_crm;
	}
	public void setR33_crm_sub_rwa_not_cov_crm(BigDecimal r33_crm_sub_rwa_not_cov_crm) {
		this.r33_crm_sub_rwa_not_cov_crm = r33_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR33_crm_comp_col_expo_elig() {
		return r33_crm_comp_col_expo_elig;
	}
	public void setR33_crm_comp_col_expo_elig(BigDecimal r33_crm_comp_col_expo_elig) {
		this.r33_crm_comp_col_expo_elig = r33_crm_comp_col_expo_elig;
	}
	public BigDecimal getR33_crm_comp_col_elig_expo_vol_adj() {
		return r33_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR33_crm_comp_col_elig_expo_vol_adj(BigDecimal r33_crm_comp_col_elig_expo_vol_adj) {
		this.r33_crm_comp_col_elig_expo_vol_adj = r33_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR33_crm_comp_col_elig_fin_hai() {
		return r33_crm_comp_col_elig_fin_hai;
	}
	public void setR33_crm_comp_col_elig_fin_hai(BigDecimal r33_crm_comp_col_elig_fin_hai) {
		this.r33_crm_comp_col_elig_fin_hai = r33_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR33_crm_comp_col_expo_val() {
		return r33_crm_comp_col_expo_val;
	}
	public void setR33_crm_comp_col_expo_val(BigDecimal r33_crm_comp_col_expo_val) {
		this.r33_crm_comp_col_expo_val = r33_crm_comp_col_expo_val;
	}
	public BigDecimal getR33_rwa_elig_expo_not_cov_crm() {
		return r33_rwa_elig_expo_not_cov_crm;
	}
	public void setR33_rwa_elig_expo_not_cov_crm(BigDecimal r33_rwa_elig_expo_not_cov_crm) {
		this.r33_rwa_elig_expo_not_cov_crm = r33_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR33_rwa_unsec_expo_cre_ris() {
		return r33_rwa_unsec_expo_cre_ris;
	}
	public void setR33_rwa_unsec_expo_cre_ris(BigDecimal r33_rwa_unsec_expo_cre_ris) {
		this.r33_rwa_unsec_expo_cre_ris = r33_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR33_rwa_unsec_expo() {
		return r33_rwa_unsec_expo;
	}
	public void setR33_rwa_unsec_expo(BigDecimal r33_rwa_unsec_expo) {
		this.r33_rwa_unsec_expo = r33_rwa_unsec_expo;
	}
	public BigDecimal getR33_rwa_tot_ris_wei_ass() {
		return r33_rwa_tot_ris_wei_ass;
	}
	public void setR33_rwa_tot_ris_wei_ass(BigDecimal r33_rwa_tot_ris_wei_ass) {
		this.r33_rwa_tot_ris_wei_ass = r33_rwa_tot_ris_wei_ass;
	}
	public String getR34_exposure_class() {
		return r34_exposure_class;
	}
	public void setR34_exposure_class(String r34_exposure_class) {
		this.r34_exposure_class = r34_exposure_class;
	}
	public BigDecimal getR34_expo_crm() {
		return r34_expo_crm;
	}
	public void setR34_expo_crm(BigDecimal r34_expo_crm) {
		this.r34_expo_crm = r34_expo_crm;
	}
	public BigDecimal getR34_spe_pro_expo() {
		return r34_spe_pro_expo;
	}
	public void setR34_spe_pro_expo(BigDecimal r34_spe_pro_expo) {
		this.r34_spe_pro_expo = r34_spe_pro_expo;
	}
	public BigDecimal getR34_amt_elig_sht_net() {
		return r34_amt_elig_sht_net;
	}
	public void setR34_amt_elig_sht_net(BigDecimal r34_amt_elig_sht_net) {
		this.r34_amt_elig_sht_net = r34_amt_elig_sht_net;
	}
	public BigDecimal getR34_tot_expo_net_spe() {
		return r34_tot_expo_net_spe;
	}
	public void setR34_tot_expo_net_spe(BigDecimal r34_tot_expo_net_spe) {
		this.r34_tot_expo_net_spe = r34_tot_expo_net_spe;
	}
	public BigDecimal getR34_crm_sub_elig_sub_app() {
		return r34_crm_sub_elig_sub_app;
	}
	public void setR34_crm_sub_elig_sub_app(BigDecimal r34_crm_sub_elig_sub_app) {
		this.r34_crm_sub_elig_sub_app = r34_crm_sub_elig_sub_app;
	}
	public BigDecimal getR34_crm_sub_non_col_guar() {
		return r34_crm_sub_non_col_guar;
	}
	public void setR34_crm_sub_non_col_guar(BigDecimal r34_crm_sub_non_col_guar) {
		this.r34_crm_sub_non_col_guar = r34_crm_sub_non_col_guar;
	}
	public BigDecimal getR34_crm_sub_non_col_cre_der() {
		return r34_crm_sub_non_col_cre_der;
	}
	public void setR34_crm_sub_non_col_cre_der(BigDecimal r34_crm_sub_non_col_cre_der) {
		this.r34_crm_sub_non_col_cre_der = r34_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR34_crm_sub_col_elig_cash() {
		return r34_crm_sub_col_elig_cash;
	}
	public void setR34_crm_sub_col_elig_cash(BigDecimal r34_crm_sub_col_elig_cash) {
		this.r34_crm_sub_col_elig_cash = r34_crm_sub_col_elig_cash;
	}
	public BigDecimal getR34_crm_sub_col_elig_trea_bills() {
		return r34_crm_sub_col_elig_trea_bills;
	}
	public void setR34_crm_sub_col_elig_trea_bills(BigDecimal r34_crm_sub_col_elig_trea_bills) {
		this.r34_crm_sub_col_elig_trea_bills = r34_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR34_crm_sub_col_elig_deb_sec() {
		return r34_crm_sub_col_elig_deb_sec;
	}
	public void setR34_crm_sub_col_elig_deb_sec(BigDecimal r34_crm_sub_col_elig_deb_sec) {
		this.r34_crm_sub_col_elig_deb_sec = r34_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR34_crm_sub_col_elig_equi() {
		return r34_crm_sub_col_elig_equi;
	}
	public void setR34_crm_sub_col_elig_equi(BigDecimal r34_crm_sub_col_elig_equi) {
		this.r34_crm_sub_col_elig_equi = r34_crm_sub_col_elig_equi;
	}
	public BigDecimal getR34_crm_sub_col_elig_unit_tru() {
		return r34_crm_sub_col_elig_unit_tru;
	}
	public void setR34_crm_sub_col_elig_unit_tru(BigDecimal r34_crm_sub_col_elig_unit_tru) {
		this.r34_crm_sub_col_elig_unit_tru = r34_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR34_crm_sub_col_exp_cov() {
		return r34_crm_sub_col_exp_cov;
	}
	public void setR34_crm_sub_col_exp_cov(BigDecimal r34_crm_sub_col_exp_cov) {
		this.r34_crm_sub_col_exp_cov = r34_crm_sub_col_exp_cov;
	}
	public BigDecimal getR34_crm_sub_col_elig_exp_not_cov() {
		return r34_crm_sub_col_elig_exp_not_cov;
	}
	public void setR34_crm_sub_col_elig_exp_not_cov(BigDecimal r34_crm_sub_col_elig_exp_not_cov) {
		this.r34_crm_sub_col_elig_exp_not_cov = r34_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR34_crm_sub_rwa_ris_crm() {
		return r34_crm_sub_rwa_ris_crm;
	}
	public void setR34_crm_sub_rwa_ris_crm(BigDecimal r34_crm_sub_rwa_ris_crm) {
		this.r34_crm_sub_rwa_ris_crm = r34_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR34_crm_sub_rwa_cov_crm() {
		return r34_crm_sub_rwa_cov_crm;
	}
	public void setR34_crm_sub_rwa_cov_crm(BigDecimal r34_crm_sub_rwa_cov_crm) {
		this.r34_crm_sub_rwa_cov_crm = r34_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR34_crm_sub_rwa_org_cou() {
		return r34_crm_sub_rwa_org_cou;
	}
	public void setR34_crm_sub_rwa_org_cou(BigDecimal r34_crm_sub_rwa_org_cou) {
		this.r34_crm_sub_rwa_org_cou = r34_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR34_crm_sub_rwa_not_cov_crm() {
		return r34_crm_sub_rwa_not_cov_crm;
	}
	public void setR34_crm_sub_rwa_not_cov_crm(BigDecimal r34_crm_sub_rwa_not_cov_crm) {
		this.r34_crm_sub_rwa_not_cov_crm = r34_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR34_crm_comp_col_expo_elig() {
		return r34_crm_comp_col_expo_elig;
	}
	public void setR34_crm_comp_col_expo_elig(BigDecimal r34_crm_comp_col_expo_elig) {
		this.r34_crm_comp_col_expo_elig = r34_crm_comp_col_expo_elig;
	}
	public BigDecimal getR34_crm_comp_col_elig_expo_vol_adj() {
		return r34_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR34_crm_comp_col_elig_expo_vol_adj(BigDecimal r34_crm_comp_col_elig_expo_vol_adj) {
		this.r34_crm_comp_col_elig_expo_vol_adj = r34_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR34_crm_comp_col_elig_fin_hai() {
		return r34_crm_comp_col_elig_fin_hai;
	}
	public void setR34_crm_comp_col_elig_fin_hai(BigDecimal r34_crm_comp_col_elig_fin_hai) {
		this.r34_crm_comp_col_elig_fin_hai = r34_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR34_crm_comp_col_expo_val() {
		return r34_crm_comp_col_expo_val;
	}
	public void setR34_crm_comp_col_expo_val(BigDecimal r34_crm_comp_col_expo_val) {
		this.r34_crm_comp_col_expo_val = r34_crm_comp_col_expo_val;
	}
	public BigDecimal getR34_rwa_elig_expo_not_cov_crm() {
		return r34_rwa_elig_expo_not_cov_crm;
	}
	public void setR34_rwa_elig_expo_not_cov_crm(BigDecimal r34_rwa_elig_expo_not_cov_crm) {
		this.r34_rwa_elig_expo_not_cov_crm = r34_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR34_rwa_unsec_expo_cre_ris() {
		return r34_rwa_unsec_expo_cre_ris;
	}
	public void setR34_rwa_unsec_expo_cre_ris(BigDecimal r34_rwa_unsec_expo_cre_ris) {
		this.r34_rwa_unsec_expo_cre_ris = r34_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR34_rwa_unsec_expo() {
		return r34_rwa_unsec_expo;
	}
	public void setR34_rwa_unsec_expo(BigDecimal r34_rwa_unsec_expo) {
		this.r34_rwa_unsec_expo = r34_rwa_unsec_expo;
	}
	public BigDecimal getR34_rwa_tot_ris_wei_ass() {
		return r34_rwa_tot_ris_wei_ass;
	}
	public void setR34_rwa_tot_ris_wei_ass(BigDecimal r34_rwa_tot_ris_wei_ass) {
		this.r34_rwa_tot_ris_wei_ass = r34_rwa_tot_ris_wei_ass;
	}
	public String getR35_exposure_class() {
		return r35_exposure_class;
	}
	public void setR35_exposure_class(String r35_exposure_class) {
		this.r35_exposure_class = r35_exposure_class;
	}
	public BigDecimal getR35_expo_crm() {
		return r35_expo_crm;
	}
	public void setR35_expo_crm(BigDecimal r35_expo_crm) {
		this.r35_expo_crm = r35_expo_crm;
	}
	public BigDecimal getR35_spe_pro_expo() {
		return r35_spe_pro_expo;
	}
	public void setR35_spe_pro_expo(BigDecimal r35_spe_pro_expo) {
		this.r35_spe_pro_expo = r35_spe_pro_expo;
	}
	public BigDecimal getR35_amt_elig_sht_net() {
		return r35_amt_elig_sht_net;
	}
	public void setR35_amt_elig_sht_net(BigDecimal r35_amt_elig_sht_net) {
		this.r35_amt_elig_sht_net = r35_amt_elig_sht_net;
	}
	public BigDecimal getR35_tot_expo_net_spe() {
		return r35_tot_expo_net_spe;
	}
	public void setR35_tot_expo_net_spe(BigDecimal r35_tot_expo_net_spe) {
		this.r35_tot_expo_net_spe = r35_tot_expo_net_spe;
	}
	public BigDecimal getR35_crm_sub_elig_sub_app() {
		return r35_crm_sub_elig_sub_app;
	}
	public void setR35_crm_sub_elig_sub_app(BigDecimal r35_crm_sub_elig_sub_app) {
		this.r35_crm_sub_elig_sub_app = r35_crm_sub_elig_sub_app;
	}
	public BigDecimal getR35_crm_sub_non_col_guar() {
		return r35_crm_sub_non_col_guar;
	}
	public void setR35_crm_sub_non_col_guar(BigDecimal r35_crm_sub_non_col_guar) {
		this.r35_crm_sub_non_col_guar = r35_crm_sub_non_col_guar;
	}
	public BigDecimal getR35_crm_sub_non_col_cre_der() {
		return r35_crm_sub_non_col_cre_der;
	}
	public void setR35_crm_sub_non_col_cre_der(BigDecimal r35_crm_sub_non_col_cre_der) {
		this.r35_crm_sub_non_col_cre_der = r35_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR35_crm_sub_col_elig_cash() {
		return r35_crm_sub_col_elig_cash;
	}
	public void setR35_crm_sub_col_elig_cash(BigDecimal r35_crm_sub_col_elig_cash) {
		this.r35_crm_sub_col_elig_cash = r35_crm_sub_col_elig_cash;
	}
	public BigDecimal getR35_crm_sub_col_elig_trea_bills() {
		return r35_crm_sub_col_elig_trea_bills;
	}
	public void setR35_crm_sub_col_elig_trea_bills(BigDecimal r35_crm_sub_col_elig_trea_bills) {
		this.r35_crm_sub_col_elig_trea_bills = r35_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR35_crm_sub_col_elig_deb_sec() {
		return r35_crm_sub_col_elig_deb_sec;
	}
	public void setR35_crm_sub_col_elig_deb_sec(BigDecimal r35_crm_sub_col_elig_deb_sec) {
		this.r35_crm_sub_col_elig_deb_sec = r35_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR35_crm_sub_col_elig_equi() {
		return r35_crm_sub_col_elig_equi;
	}
	public void setR35_crm_sub_col_elig_equi(BigDecimal r35_crm_sub_col_elig_equi) {
		this.r35_crm_sub_col_elig_equi = r35_crm_sub_col_elig_equi;
	}
	public BigDecimal getR35_crm_sub_col_elig_unit_tru() {
		return r35_crm_sub_col_elig_unit_tru;
	}
	public void setR35_crm_sub_col_elig_unit_tru(BigDecimal r35_crm_sub_col_elig_unit_tru) {
		this.r35_crm_sub_col_elig_unit_tru = r35_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR35_crm_sub_col_exp_cov() {
		return r35_crm_sub_col_exp_cov;
	}
	public void setR35_crm_sub_col_exp_cov(BigDecimal r35_crm_sub_col_exp_cov) {
		this.r35_crm_sub_col_exp_cov = r35_crm_sub_col_exp_cov;
	}
	public BigDecimal getR35_crm_sub_col_elig_exp_not_cov() {
		return r35_crm_sub_col_elig_exp_not_cov;
	}
	public void setR35_crm_sub_col_elig_exp_not_cov(BigDecimal r35_crm_sub_col_elig_exp_not_cov) {
		this.r35_crm_sub_col_elig_exp_not_cov = r35_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR35_crm_sub_rwa_ris_crm() {
		return r35_crm_sub_rwa_ris_crm;
	}
	public void setR35_crm_sub_rwa_ris_crm(BigDecimal r35_crm_sub_rwa_ris_crm) {
		this.r35_crm_sub_rwa_ris_crm = r35_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR35_crm_sub_rwa_cov_crm() {
		return r35_crm_sub_rwa_cov_crm;
	}
	public void setR35_crm_sub_rwa_cov_crm(BigDecimal r35_crm_sub_rwa_cov_crm) {
		this.r35_crm_sub_rwa_cov_crm = r35_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR35_crm_sub_rwa_org_cou() {
		return r35_crm_sub_rwa_org_cou;
	}
	public void setR35_crm_sub_rwa_org_cou(BigDecimal r35_crm_sub_rwa_org_cou) {
		this.r35_crm_sub_rwa_org_cou = r35_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR35_crm_sub_rwa_not_cov_crm() {
		return r35_crm_sub_rwa_not_cov_crm;
	}
	public void setR35_crm_sub_rwa_not_cov_crm(BigDecimal r35_crm_sub_rwa_not_cov_crm) {
		this.r35_crm_sub_rwa_not_cov_crm = r35_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR35_crm_comp_col_expo_elig() {
		return r35_crm_comp_col_expo_elig;
	}
	public void setR35_crm_comp_col_expo_elig(BigDecimal r35_crm_comp_col_expo_elig) {
		this.r35_crm_comp_col_expo_elig = r35_crm_comp_col_expo_elig;
	}
	public BigDecimal getR35_crm_comp_col_elig_expo_vol_adj() {
		return r35_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR35_crm_comp_col_elig_expo_vol_adj(BigDecimal r35_crm_comp_col_elig_expo_vol_adj) {
		this.r35_crm_comp_col_elig_expo_vol_adj = r35_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR35_crm_comp_col_elig_fin_hai() {
		return r35_crm_comp_col_elig_fin_hai;
	}
	public void setR35_crm_comp_col_elig_fin_hai(BigDecimal r35_crm_comp_col_elig_fin_hai) {
		this.r35_crm_comp_col_elig_fin_hai = r35_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR35_crm_comp_col_expo_val() {
		return r35_crm_comp_col_expo_val;
	}
	public void setR35_crm_comp_col_expo_val(BigDecimal r35_crm_comp_col_expo_val) {
		this.r35_crm_comp_col_expo_val = r35_crm_comp_col_expo_val;
	}
	public BigDecimal getR35_rwa_elig_expo_not_cov_crm() {
		return r35_rwa_elig_expo_not_cov_crm;
	}
	public void setR35_rwa_elig_expo_not_cov_crm(BigDecimal r35_rwa_elig_expo_not_cov_crm) {
		this.r35_rwa_elig_expo_not_cov_crm = r35_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR35_rwa_unsec_expo_cre_ris() {
		return r35_rwa_unsec_expo_cre_ris;
	}
	public void setR35_rwa_unsec_expo_cre_ris(BigDecimal r35_rwa_unsec_expo_cre_ris) {
		this.r35_rwa_unsec_expo_cre_ris = r35_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR35_rwa_unsec_expo() {
		return r35_rwa_unsec_expo;
	}
	public void setR35_rwa_unsec_expo(BigDecimal r35_rwa_unsec_expo) {
		this.r35_rwa_unsec_expo = r35_rwa_unsec_expo;
	}
	public BigDecimal getR35_rwa_tot_ris_wei_ass() {
		return r35_rwa_tot_ris_wei_ass;
	}
	public void setR35_rwa_tot_ris_wei_ass(BigDecimal r35_rwa_tot_ris_wei_ass) {
		this.r35_rwa_tot_ris_wei_ass = r35_rwa_tot_ris_wei_ass;
	}
	public String getR36_exposure_class() {
		return r36_exposure_class;
	}
	public void setR36_exposure_class(String r36_exposure_class) {
		this.r36_exposure_class = r36_exposure_class;
	}
	public BigDecimal getR36_expo_crm() {
		return r36_expo_crm;
	}
	public void setR36_expo_crm(BigDecimal r36_expo_crm) {
		this.r36_expo_crm = r36_expo_crm;
	}
	public BigDecimal getR36_spe_pro_expo() {
		return r36_spe_pro_expo;
	}
	public void setR36_spe_pro_expo(BigDecimal r36_spe_pro_expo) {
		this.r36_spe_pro_expo = r36_spe_pro_expo;
	}
	public BigDecimal getR36_amt_elig_sht_net() {
		return r36_amt_elig_sht_net;
	}
	public void setR36_amt_elig_sht_net(BigDecimal r36_amt_elig_sht_net) {
		this.r36_amt_elig_sht_net = r36_amt_elig_sht_net;
	}
	public BigDecimal getR36_tot_expo_net_spe() {
		return r36_tot_expo_net_spe;
	}
	public void setR36_tot_expo_net_spe(BigDecimal r36_tot_expo_net_spe) {
		this.r36_tot_expo_net_spe = r36_tot_expo_net_spe;
	}
	public BigDecimal getR36_crm_sub_elig_sub_app() {
		return r36_crm_sub_elig_sub_app;
	}
	public void setR36_crm_sub_elig_sub_app(BigDecimal r36_crm_sub_elig_sub_app) {
		this.r36_crm_sub_elig_sub_app = r36_crm_sub_elig_sub_app;
	}
	public BigDecimal getR36_crm_sub_non_col_guar() {
		return r36_crm_sub_non_col_guar;
	}
	public void setR36_crm_sub_non_col_guar(BigDecimal r36_crm_sub_non_col_guar) {
		this.r36_crm_sub_non_col_guar = r36_crm_sub_non_col_guar;
	}
	public BigDecimal getR36_crm_sub_non_col_cre_der() {
		return r36_crm_sub_non_col_cre_der;
	}
	public void setR36_crm_sub_non_col_cre_der(BigDecimal r36_crm_sub_non_col_cre_der) {
		this.r36_crm_sub_non_col_cre_der = r36_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR36_crm_sub_col_elig_cash() {
		return r36_crm_sub_col_elig_cash;
	}
	public void setR36_crm_sub_col_elig_cash(BigDecimal r36_crm_sub_col_elig_cash) {
		this.r36_crm_sub_col_elig_cash = r36_crm_sub_col_elig_cash;
	}
	public BigDecimal getR36_crm_sub_col_elig_trea_bills() {
		return r36_crm_sub_col_elig_trea_bills;
	}
	public void setR36_crm_sub_col_elig_trea_bills(BigDecimal r36_crm_sub_col_elig_trea_bills) {
		this.r36_crm_sub_col_elig_trea_bills = r36_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR36_crm_sub_col_elig_deb_sec() {
		return r36_crm_sub_col_elig_deb_sec;
	}
	public void setR36_crm_sub_col_elig_deb_sec(BigDecimal r36_crm_sub_col_elig_deb_sec) {
		this.r36_crm_sub_col_elig_deb_sec = r36_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR36_crm_sub_col_elig_equi() {
		return r36_crm_sub_col_elig_equi;
	}
	public void setR36_crm_sub_col_elig_equi(BigDecimal r36_crm_sub_col_elig_equi) {
		this.r36_crm_sub_col_elig_equi = r36_crm_sub_col_elig_equi;
	}
	public BigDecimal getR36_crm_sub_col_elig_unit_tru() {
		return r36_crm_sub_col_elig_unit_tru;
	}
	public void setR36_crm_sub_col_elig_unit_tru(BigDecimal r36_crm_sub_col_elig_unit_tru) {
		this.r36_crm_sub_col_elig_unit_tru = r36_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR36_crm_sub_col_exp_cov() {
		return r36_crm_sub_col_exp_cov;
	}
	public void setR36_crm_sub_col_exp_cov(BigDecimal r36_crm_sub_col_exp_cov) {
		this.r36_crm_sub_col_exp_cov = r36_crm_sub_col_exp_cov;
	}
	public BigDecimal getR36_crm_sub_col_elig_exp_not_cov() {
		return r36_crm_sub_col_elig_exp_not_cov;
	}
	public void setR36_crm_sub_col_elig_exp_not_cov(BigDecimal r36_crm_sub_col_elig_exp_not_cov) {
		this.r36_crm_sub_col_elig_exp_not_cov = r36_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR36_crm_sub_rwa_ris_crm() {
		return r36_crm_sub_rwa_ris_crm;
	}
	public void setR36_crm_sub_rwa_ris_crm(BigDecimal r36_crm_sub_rwa_ris_crm) {
		this.r36_crm_sub_rwa_ris_crm = r36_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR36_crm_sub_rwa_cov_crm() {
		return r36_crm_sub_rwa_cov_crm;
	}
	public void setR36_crm_sub_rwa_cov_crm(BigDecimal r36_crm_sub_rwa_cov_crm) {
		this.r36_crm_sub_rwa_cov_crm = r36_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR36_crm_sub_rwa_org_cou() {
		return r36_crm_sub_rwa_org_cou;
	}
	public void setR36_crm_sub_rwa_org_cou(BigDecimal r36_crm_sub_rwa_org_cou) {
		this.r36_crm_sub_rwa_org_cou = r36_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR36_crm_sub_rwa_not_cov_crm() {
		return r36_crm_sub_rwa_not_cov_crm;
	}
	public void setR36_crm_sub_rwa_not_cov_crm(BigDecimal r36_crm_sub_rwa_not_cov_crm) {
		this.r36_crm_sub_rwa_not_cov_crm = r36_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR36_crm_comp_col_expo_elig() {
		return r36_crm_comp_col_expo_elig;
	}
	public void setR36_crm_comp_col_expo_elig(BigDecimal r36_crm_comp_col_expo_elig) {
		this.r36_crm_comp_col_expo_elig = r36_crm_comp_col_expo_elig;
	}
	public BigDecimal getR36_crm_comp_col_elig_expo_vol_adj() {
		return r36_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR36_crm_comp_col_elig_expo_vol_adj(BigDecimal r36_crm_comp_col_elig_expo_vol_adj) {
		this.r36_crm_comp_col_elig_expo_vol_adj = r36_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR36_crm_comp_col_elig_fin_hai() {
		return r36_crm_comp_col_elig_fin_hai;
	}
	public void setR36_crm_comp_col_elig_fin_hai(BigDecimal r36_crm_comp_col_elig_fin_hai) {
		this.r36_crm_comp_col_elig_fin_hai = r36_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR36_crm_comp_col_expo_val() {
		return r36_crm_comp_col_expo_val;
	}
	public void setR36_crm_comp_col_expo_val(BigDecimal r36_crm_comp_col_expo_val) {
		this.r36_crm_comp_col_expo_val = r36_crm_comp_col_expo_val;
	}
	public BigDecimal getR36_rwa_elig_expo_not_cov_crm() {
		return r36_rwa_elig_expo_not_cov_crm;
	}
	public void setR36_rwa_elig_expo_not_cov_crm(BigDecimal r36_rwa_elig_expo_not_cov_crm) {
		this.r36_rwa_elig_expo_not_cov_crm = r36_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR36_rwa_unsec_expo_cre_ris() {
		return r36_rwa_unsec_expo_cre_ris;
	}
	public void setR36_rwa_unsec_expo_cre_ris(BigDecimal r36_rwa_unsec_expo_cre_ris) {
		this.r36_rwa_unsec_expo_cre_ris = r36_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR36_rwa_unsec_expo() {
		return r36_rwa_unsec_expo;
	}
	public void setR36_rwa_unsec_expo(BigDecimal r36_rwa_unsec_expo) {
		this.r36_rwa_unsec_expo = r36_rwa_unsec_expo;
	}
	public BigDecimal getR36_rwa_tot_ris_wei_ass() {
		return r36_rwa_tot_ris_wei_ass;
	}
	public void setR36_rwa_tot_ris_wei_ass(BigDecimal r36_rwa_tot_ris_wei_ass) {
		this.r36_rwa_tot_ris_wei_ass = r36_rwa_tot_ris_wei_ass;
	}
	public String getR37_exposure_class() {
		return r37_exposure_class;
	}
	public void setR37_exposure_class(String r37_exposure_class) {
		this.r37_exposure_class = r37_exposure_class;
	}
	public BigDecimal getR37_expo_crm() {
		return r37_expo_crm;
	}
	public void setR37_expo_crm(BigDecimal r37_expo_crm) {
		this.r37_expo_crm = r37_expo_crm;
	}
	public BigDecimal getR37_spe_pro_expo() {
		return r37_spe_pro_expo;
	}
	public void setR37_spe_pro_expo(BigDecimal r37_spe_pro_expo) {
		this.r37_spe_pro_expo = r37_spe_pro_expo;
	}
	public BigDecimal getR37_amt_elig_sht_net() {
		return r37_amt_elig_sht_net;
	}
	public void setR37_amt_elig_sht_net(BigDecimal r37_amt_elig_sht_net) {
		this.r37_amt_elig_sht_net = r37_amt_elig_sht_net;
	}
	public BigDecimal getR37_tot_expo_net_spe() {
		return r37_tot_expo_net_spe;
	}
	public void setR37_tot_expo_net_spe(BigDecimal r37_tot_expo_net_spe) {
		this.r37_tot_expo_net_spe = r37_tot_expo_net_spe;
	}
	public BigDecimal getR37_crm_sub_elig_sub_app() {
		return r37_crm_sub_elig_sub_app;
	}
	public void setR37_crm_sub_elig_sub_app(BigDecimal r37_crm_sub_elig_sub_app) {
		this.r37_crm_sub_elig_sub_app = r37_crm_sub_elig_sub_app;
	}
	public BigDecimal getR37_crm_sub_non_col_guar() {
		return r37_crm_sub_non_col_guar;
	}
	public void setR37_crm_sub_non_col_guar(BigDecimal r37_crm_sub_non_col_guar) {
		this.r37_crm_sub_non_col_guar = r37_crm_sub_non_col_guar;
	}
	public BigDecimal getR37_crm_sub_non_col_cre_der() {
		return r37_crm_sub_non_col_cre_der;
	}
	public void setR37_crm_sub_non_col_cre_der(BigDecimal r37_crm_sub_non_col_cre_der) {
		this.r37_crm_sub_non_col_cre_der = r37_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR37_crm_sub_col_elig_cash() {
		return r37_crm_sub_col_elig_cash;
	}
	public void setR37_crm_sub_col_elig_cash(BigDecimal r37_crm_sub_col_elig_cash) {
		this.r37_crm_sub_col_elig_cash = r37_crm_sub_col_elig_cash;
	}
	public BigDecimal getR37_crm_sub_col_elig_trea_bills() {
		return r37_crm_sub_col_elig_trea_bills;
	}
	public void setR37_crm_sub_col_elig_trea_bills(BigDecimal r37_crm_sub_col_elig_trea_bills) {
		this.r37_crm_sub_col_elig_trea_bills = r37_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR37_crm_sub_col_elig_deb_sec() {
		return r37_crm_sub_col_elig_deb_sec;
	}
	public void setR37_crm_sub_col_elig_deb_sec(BigDecimal r37_crm_sub_col_elig_deb_sec) {
		this.r37_crm_sub_col_elig_deb_sec = r37_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR37_crm_sub_col_elig_equi() {
		return r37_crm_sub_col_elig_equi;
	}
	public void setR37_crm_sub_col_elig_equi(BigDecimal r37_crm_sub_col_elig_equi) {
		this.r37_crm_sub_col_elig_equi = r37_crm_sub_col_elig_equi;
	}
	public BigDecimal getR37_crm_sub_col_elig_unit_tru() {
		return r37_crm_sub_col_elig_unit_tru;
	}
	public void setR37_crm_sub_col_elig_unit_tru(BigDecimal r37_crm_sub_col_elig_unit_tru) {
		this.r37_crm_sub_col_elig_unit_tru = r37_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR37_crm_sub_col_exp_cov() {
		return r37_crm_sub_col_exp_cov;
	}
	public void setR37_crm_sub_col_exp_cov(BigDecimal r37_crm_sub_col_exp_cov) {
		this.r37_crm_sub_col_exp_cov = r37_crm_sub_col_exp_cov;
	}
	public BigDecimal getR37_crm_sub_col_elig_exp_not_cov() {
		return r37_crm_sub_col_elig_exp_not_cov;
	}
	public void setR37_crm_sub_col_elig_exp_not_cov(BigDecimal r37_crm_sub_col_elig_exp_not_cov) {
		this.r37_crm_sub_col_elig_exp_not_cov = r37_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR37_crm_sub_rwa_ris_crm() {
		return r37_crm_sub_rwa_ris_crm;
	}
	public void setR37_crm_sub_rwa_ris_crm(BigDecimal r37_crm_sub_rwa_ris_crm) {
		this.r37_crm_sub_rwa_ris_crm = r37_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR37_crm_sub_rwa_cov_crm() {
		return r37_crm_sub_rwa_cov_crm;
	}
	public void setR37_crm_sub_rwa_cov_crm(BigDecimal r37_crm_sub_rwa_cov_crm) {
		this.r37_crm_sub_rwa_cov_crm = r37_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR37_crm_sub_rwa_org_cou() {
		return r37_crm_sub_rwa_org_cou;
	}
	public void setR37_crm_sub_rwa_org_cou(BigDecimal r37_crm_sub_rwa_org_cou) {
		this.r37_crm_sub_rwa_org_cou = r37_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR37_crm_sub_rwa_not_cov_crm() {
		return r37_crm_sub_rwa_not_cov_crm;
	}
	public void setR37_crm_sub_rwa_not_cov_crm(BigDecimal r37_crm_sub_rwa_not_cov_crm) {
		this.r37_crm_sub_rwa_not_cov_crm = r37_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR37_crm_comp_col_expo_elig() {
		return r37_crm_comp_col_expo_elig;
	}
	public void setR37_crm_comp_col_expo_elig(BigDecimal r37_crm_comp_col_expo_elig) {
		this.r37_crm_comp_col_expo_elig = r37_crm_comp_col_expo_elig;
	}
	public BigDecimal getR37_crm_comp_col_elig_expo_vol_adj() {
		return r37_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR37_crm_comp_col_elig_expo_vol_adj(BigDecimal r37_crm_comp_col_elig_expo_vol_adj) {
		this.r37_crm_comp_col_elig_expo_vol_adj = r37_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR37_crm_comp_col_elig_fin_hai() {
		return r37_crm_comp_col_elig_fin_hai;
	}
	public void setR37_crm_comp_col_elig_fin_hai(BigDecimal r37_crm_comp_col_elig_fin_hai) {
		this.r37_crm_comp_col_elig_fin_hai = r37_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR37_crm_comp_col_expo_val() {
		return r37_crm_comp_col_expo_val;
	}
	public void setR37_crm_comp_col_expo_val(BigDecimal r37_crm_comp_col_expo_val) {
		this.r37_crm_comp_col_expo_val = r37_crm_comp_col_expo_val;
	}
	public BigDecimal getR37_rwa_elig_expo_not_cov_crm() {
		return r37_rwa_elig_expo_not_cov_crm;
	}
	public void setR37_rwa_elig_expo_not_cov_crm(BigDecimal r37_rwa_elig_expo_not_cov_crm) {
		this.r37_rwa_elig_expo_not_cov_crm = r37_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR37_rwa_unsec_expo_cre_ris() {
		return r37_rwa_unsec_expo_cre_ris;
	}
	public void setR37_rwa_unsec_expo_cre_ris(BigDecimal r37_rwa_unsec_expo_cre_ris) {
		this.r37_rwa_unsec_expo_cre_ris = r37_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR37_rwa_unsec_expo() {
		return r37_rwa_unsec_expo;
	}
	public void setR37_rwa_unsec_expo(BigDecimal r37_rwa_unsec_expo) {
		this.r37_rwa_unsec_expo = r37_rwa_unsec_expo;
	}
	public BigDecimal getR37_rwa_tot_ris_wei_ass() {
		return r37_rwa_tot_ris_wei_ass;
	}
	public void setR37_rwa_tot_ris_wei_ass(BigDecimal r37_rwa_tot_ris_wei_ass) {
		this.r37_rwa_tot_ris_wei_ass = r37_rwa_tot_ris_wei_ass;
	}
	public String getR38_exposure_class() {
		return r38_exposure_class;
	}
	public void setR38_exposure_class(String r38_exposure_class) {
		this.r38_exposure_class = r38_exposure_class;
	}
	public BigDecimal getR38_expo_crm() {
		return r38_expo_crm;
	}
	public void setR38_expo_crm(BigDecimal r38_expo_crm) {
		this.r38_expo_crm = r38_expo_crm;
	}
	public BigDecimal getR38_spe_pro_expo() {
		return r38_spe_pro_expo;
	}
	public void setR38_spe_pro_expo(BigDecimal r38_spe_pro_expo) {
		this.r38_spe_pro_expo = r38_spe_pro_expo;
	}
	public BigDecimal getR38_amt_elig_sht_net() {
		return r38_amt_elig_sht_net;
	}
	public void setR38_amt_elig_sht_net(BigDecimal r38_amt_elig_sht_net) {
		this.r38_amt_elig_sht_net = r38_amt_elig_sht_net;
	}
	public BigDecimal getR38_tot_expo_net_spe() {
		return r38_tot_expo_net_spe;
	}
	public void setR38_tot_expo_net_spe(BigDecimal r38_tot_expo_net_spe) {
		this.r38_tot_expo_net_spe = r38_tot_expo_net_spe;
	}
	public BigDecimal getR38_crm_sub_elig_sub_app() {
		return r38_crm_sub_elig_sub_app;
	}
	public void setR38_crm_sub_elig_sub_app(BigDecimal r38_crm_sub_elig_sub_app) {
		this.r38_crm_sub_elig_sub_app = r38_crm_sub_elig_sub_app;
	}
	public BigDecimal getR38_crm_sub_non_col_guar() {
		return r38_crm_sub_non_col_guar;
	}
	public void setR38_crm_sub_non_col_guar(BigDecimal r38_crm_sub_non_col_guar) {
		this.r38_crm_sub_non_col_guar = r38_crm_sub_non_col_guar;
	}
	public BigDecimal getR38_crm_sub_non_col_cre_der() {
		return r38_crm_sub_non_col_cre_der;
	}
	public void setR38_crm_sub_non_col_cre_der(BigDecimal r38_crm_sub_non_col_cre_der) {
		this.r38_crm_sub_non_col_cre_der = r38_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR38_crm_sub_col_elig_cash() {
		return r38_crm_sub_col_elig_cash;
	}
	public void setR38_crm_sub_col_elig_cash(BigDecimal r38_crm_sub_col_elig_cash) {
		this.r38_crm_sub_col_elig_cash = r38_crm_sub_col_elig_cash;
	}
	public BigDecimal getR38_crm_sub_col_elig_trea_bills() {
		return r38_crm_sub_col_elig_trea_bills;
	}
	public void setR38_crm_sub_col_elig_trea_bills(BigDecimal r38_crm_sub_col_elig_trea_bills) {
		this.r38_crm_sub_col_elig_trea_bills = r38_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR38_crm_sub_col_elig_deb_sec() {
		return r38_crm_sub_col_elig_deb_sec;
	}
	public void setR38_crm_sub_col_elig_deb_sec(BigDecimal r38_crm_sub_col_elig_deb_sec) {
		this.r38_crm_sub_col_elig_deb_sec = r38_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR38_crm_sub_col_elig_equi() {
		return r38_crm_sub_col_elig_equi;
	}
	public void setR38_crm_sub_col_elig_equi(BigDecimal r38_crm_sub_col_elig_equi) {
		this.r38_crm_sub_col_elig_equi = r38_crm_sub_col_elig_equi;
	}
	public BigDecimal getR38_crm_sub_col_elig_unit_tru() {
		return r38_crm_sub_col_elig_unit_tru;
	}
	public void setR38_crm_sub_col_elig_unit_tru(BigDecimal r38_crm_sub_col_elig_unit_tru) {
		this.r38_crm_sub_col_elig_unit_tru = r38_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR38_crm_sub_col_exp_cov() {
		return r38_crm_sub_col_exp_cov;
	}
	public void setR38_crm_sub_col_exp_cov(BigDecimal r38_crm_sub_col_exp_cov) {
		this.r38_crm_sub_col_exp_cov = r38_crm_sub_col_exp_cov;
	}
	public BigDecimal getR38_crm_sub_col_elig_exp_not_cov() {
		return r38_crm_sub_col_elig_exp_not_cov;
	}
	public void setR38_crm_sub_col_elig_exp_not_cov(BigDecimal r38_crm_sub_col_elig_exp_not_cov) {
		this.r38_crm_sub_col_elig_exp_not_cov = r38_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR38_crm_sub_rwa_ris_crm() {
		return r38_crm_sub_rwa_ris_crm;
	}
	public void setR38_crm_sub_rwa_ris_crm(BigDecimal r38_crm_sub_rwa_ris_crm) {
		this.r38_crm_sub_rwa_ris_crm = r38_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR38_crm_sub_rwa_cov_crm() {
		return r38_crm_sub_rwa_cov_crm;
	}
	public void setR38_crm_sub_rwa_cov_crm(BigDecimal r38_crm_sub_rwa_cov_crm) {
		this.r38_crm_sub_rwa_cov_crm = r38_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR38_crm_sub_rwa_org_cou() {
		return r38_crm_sub_rwa_org_cou;
	}
	public void setR38_crm_sub_rwa_org_cou(BigDecimal r38_crm_sub_rwa_org_cou) {
		this.r38_crm_sub_rwa_org_cou = r38_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR38_crm_sub_rwa_not_cov_crm() {
		return r38_crm_sub_rwa_not_cov_crm;
	}
	public void setR38_crm_sub_rwa_not_cov_crm(BigDecimal r38_crm_sub_rwa_not_cov_crm) {
		this.r38_crm_sub_rwa_not_cov_crm = r38_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR38_crm_comp_col_expo_elig() {
		return r38_crm_comp_col_expo_elig;
	}
	public void setR38_crm_comp_col_expo_elig(BigDecimal r38_crm_comp_col_expo_elig) {
		this.r38_crm_comp_col_expo_elig = r38_crm_comp_col_expo_elig;
	}
	public BigDecimal getR38_crm_comp_col_elig_expo_vol_adj() {
		return r38_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR38_crm_comp_col_elig_expo_vol_adj(BigDecimal r38_crm_comp_col_elig_expo_vol_adj) {
		this.r38_crm_comp_col_elig_expo_vol_adj = r38_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR38_crm_comp_col_elig_fin_hai() {
		return r38_crm_comp_col_elig_fin_hai;
	}
	public void setR38_crm_comp_col_elig_fin_hai(BigDecimal r38_crm_comp_col_elig_fin_hai) {
		this.r38_crm_comp_col_elig_fin_hai = r38_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR38_crm_comp_col_expo_val() {
		return r38_crm_comp_col_expo_val;
	}
	public void setR38_crm_comp_col_expo_val(BigDecimal r38_crm_comp_col_expo_val) {
		this.r38_crm_comp_col_expo_val = r38_crm_comp_col_expo_val;
	}
	public BigDecimal getR38_rwa_elig_expo_not_cov_crm() {
		return r38_rwa_elig_expo_not_cov_crm;
	}
	public void setR38_rwa_elig_expo_not_cov_crm(BigDecimal r38_rwa_elig_expo_not_cov_crm) {
		this.r38_rwa_elig_expo_not_cov_crm = r38_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR38_rwa_unsec_expo_cre_ris() {
		return r38_rwa_unsec_expo_cre_ris;
	}
	public void setR38_rwa_unsec_expo_cre_ris(BigDecimal r38_rwa_unsec_expo_cre_ris) {
		this.r38_rwa_unsec_expo_cre_ris = r38_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR38_rwa_unsec_expo() {
		return r38_rwa_unsec_expo;
	}
	public void setR38_rwa_unsec_expo(BigDecimal r38_rwa_unsec_expo) {
		this.r38_rwa_unsec_expo = r38_rwa_unsec_expo;
	}
	public BigDecimal getR38_rwa_tot_ris_wei_ass() {
		return r38_rwa_tot_ris_wei_ass;
	}
	public void setR38_rwa_tot_ris_wei_ass(BigDecimal r38_rwa_tot_ris_wei_ass) {
		this.r38_rwa_tot_ris_wei_ass = r38_rwa_tot_ris_wei_ass;
	}
	public String getR39_exposure_class() {
		return r39_exposure_class;
	}
	public void setR39_exposure_class(String r39_exposure_class) {
		this.r39_exposure_class = r39_exposure_class;
	}
	public BigDecimal getR39_expo_crm() {
		return r39_expo_crm;
	}
	public void setR39_expo_crm(BigDecimal r39_expo_crm) {
		this.r39_expo_crm = r39_expo_crm;
	}
	public BigDecimal getR39_spe_pro_expo() {
		return r39_spe_pro_expo;
	}
	public void setR39_spe_pro_expo(BigDecimal r39_spe_pro_expo) {
		this.r39_spe_pro_expo = r39_spe_pro_expo;
	}
	public BigDecimal getR39_amt_elig_sht_net() {
		return r39_amt_elig_sht_net;
	}
	public void setR39_amt_elig_sht_net(BigDecimal r39_amt_elig_sht_net) {
		this.r39_amt_elig_sht_net = r39_amt_elig_sht_net;
	}
	public BigDecimal getR39_tot_expo_net_spe() {
		return r39_tot_expo_net_spe;
	}
	public void setR39_tot_expo_net_spe(BigDecimal r39_tot_expo_net_spe) {
		this.r39_tot_expo_net_spe = r39_tot_expo_net_spe;
	}
	public BigDecimal getR39_crm_sub_elig_sub_app() {
		return r39_crm_sub_elig_sub_app;
	}
	public void setR39_crm_sub_elig_sub_app(BigDecimal r39_crm_sub_elig_sub_app) {
		this.r39_crm_sub_elig_sub_app = r39_crm_sub_elig_sub_app;
	}
	public BigDecimal getR39_crm_sub_non_col_guar() {
		return r39_crm_sub_non_col_guar;
	}
	public void setR39_crm_sub_non_col_guar(BigDecimal r39_crm_sub_non_col_guar) {
		this.r39_crm_sub_non_col_guar = r39_crm_sub_non_col_guar;
	}
	public BigDecimal getR39_crm_sub_non_col_cre_der() {
		return r39_crm_sub_non_col_cre_der;
	}
	public void setR39_crm_sub_non_col_cre_der(BigDecimal r39_crm_sub_non_col_cre_der) {
		this.r39_crm_sub_non_col_cre_der = r39_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR39_crm_sub_col_elig_cash() {
		return r39_crm_sub_col_elig_cash;
	}
	public void setR39_crm_sub_col_elig_cash(BigDecimal r39_crm_sub_col_elig_cash) {
		this.r39_crm_sub_col_elig_cash = r39_crm_sub_col_elig_cash;
	}
	public BigDecimal getR39_crm_sub_col_elig_trea_bills() {
		return r39_crm_sub_col_elig_trea_bills;
	}
	public void setR39_crm_sub_col_elig_trea_bills(BigDecimal r39_crm_sub_col_elig_trea_bills) {
		this.r39_crm_sub_col_elig_trea_bills = r39_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR39_crm_sub_col_elig_deb_sec() {
		return r39_crm_sub_col_elig_deb_sec;
	}
	public void setR39_crm_sub_col_elig_deb_sec(BigDecimal r39_crm_sub_col_elig_deb_sec) {
		this.r39_crm_sub_col_elig_deb_sec = r39_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR39_crm_sub_col_elig_equi() {
		return r39_crm_sub_col_elig_equi;
	}
	public void setR39_crm_sub_col_elig_equi(BigDecimal r39_crm_sub_col_elig_equi) {
		this.r39_crm_sub_col_elig_equi = r39_crm_sub_col_elig_equi;
	}
	public BigDecimal getR39_crm_sub_col_elig_unit_tru() {
		return r39_crm_sub_col_elig_unit_tru;
	}
	public void setR39_crm_sub_col_elig_unit_tru(BigDecimal r39_crm_sub_col_elig_unit_tru) {
		this.r39_crm_sub_col_elig_unit_tru = r39_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR39_crm_sub_col_exp_cov() {
		return r39_crm_sub_col_exp_cov;
	}
	public void setR39_crm_sub_col_exp_cov(BigDecimal r39_crm_sub_col_exp_cov) {
		this.r39_crm_sub_col_exp_cov = r39_crm_sub_col_exp_cov;
	}
	public BigDecimal getR39_crm_sub_col_elig_exp_not_cov() {
		return r39_crm_sub_col_elig_exp_not_cov;
	}
	public void setR39_crm_sub_col_elig_exp_not_cov(BigDecimal r39_crm_sub_col_elig_exp_not_cov) {
		this.r39_crm_sub_col_elig_exp_not_cov = r39_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR39_crm_sub_rwa_ris_crm() {
		return r39_crm_sub_rwa_ris_crm;
	}
	public void setR39_crm_sub_rwa_ris_crm(BigDecimal r39_crm_sub_rwa_ris_crm) {
		this.r39_crm_sub_rwa_ris_crm = r39_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR39_crm_sub_rwa_cov_crm() {
		return r39_crm_sub_rwa_cov_crm;
	}
	public void setR39_crm_sub_rwa_cov_crm(BigDecimal r39_crm_sub_rwa_cov_crm) {
		this.r39_crm_sub_rwa_cov_crm = r39_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR39_crm_sub_rwa_org_cou() {
		return r39_crm_sub_rwa_org_cou;
	}
	public void setR39_crm_sub_rwa_org_cou(BigDecimal r39_crm_sub_rwa_org_cou) {
		this.r39_crm_sub_rwa_org_cou = r39_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR39_crm_sub_rwa_not_cov_crm() {
		return r39_crm_sub_rwa_not_cov_crm;
	}
	public void setR39_crm_sub_rwa_not_cov_crm(BigDecimal r39_crm_sub_rwa_not_cov_crm) {
		this.r39_crm_sub_rwa_not_cov_crm = r39_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR39_crm_comp_col_expo_elig() {
		return r39_crm_comp_col_expo_elig;
	}
	public void setR39_crm_comp_col_expo_elig(BigDecimal r39_crm_comp_col_expo_elig) {
		this.r39_crm_comp_col_expo_elig = r39_crm_comp_col_expo_elig;
	}
	public BigDecimal getR39_crm_comp_col_elig_expo_vol_adj() {
		return r39_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR39_crm_comp_col_elig_expo_vol_adj(BigDecimal r39_crm_comp_col_elig_expo_vol_adj) {
		this.r39_crm_comp_col_elig_expo_vol_adj = r39_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR39_crm_comp_col_elig_fin_hai() {
		return r39_crm_comp_col_elig_fin_hai;
	}
	public void setR39_crm_comp_col_elig_fin_hai(BigDecimal r39_crm_comp_col_elig_fin_hai) {
		this.r39_crm_comp_col_elig_fin_hai = r39_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR39_crm_comp_col_expo_val() {
		return r39_crm_comp_col_expo_val;
	}
	public void setR39_crm_comp_col_expo_val(BigDecimal r39_crm_comp_col_expo_val) {
		this.r39_crm_comp_col_expo_val = r39_crm_comp_col_expo_val;
	}
	public BigDecimal getR39_rwa_elig_expo_not_cov_crm() {
		return r39_rwa_elig_expo_not_cov_crm;
	}
	public void setR39_rwa_elig_expo_not_cov_crm(BigDecimal r39_rwa_elig_expo_not_cov_crm) {
		this.r39_rwa_elig_expo_not_cov_crm = r39_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR39_rwa_unsec_expo_cre_ris() {
		return r39_rwa_unsec_expo_cre_ris;
	}
	public void setR39_rwa_unsec_expo_cre_ris(BigDecimal r39_rwa_unsec_expo_cre_ris) {
		this.r39_rwa_unsec_expo_cre_ris = r39_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR39_rwa_unsec_expo() {
		return r39_rwa_unsec_expo;
	}
	public void setR39_rwa_unsec_expo(BigDecimal r39_rwa_unsec_expo) {
		this.r39_rwa_unsec_expo = r39_rwa_unsec_expo;
	}
	public BigDecimal getR39_rwa_tot_ris_wei_ass() {
		return r39_rwa_tot_ris_wei_ass;
	}
	public void setR39_rwa_tot_ris_wei_ass(BigDecimal r39_rwa_tot_ris_wei_ass) {
		this.r39_rwa_tot_ris_wei_ass = r39_rwa_tot_ris_wei_ass;
	}
	public String getR40_exposure_class() {
		return r40_exposure_class;
	}
	public void setR40_exposure_class(String r40_exposure_class) {
		this.r40_exposure_class = r40_exposure_class;
	}
	public BigDecimal getR40_expo_crm() {
		return r40_expo_crm;
	}
	public void setR40_expo_crm(BigDecimal r40_expo_crm) {
		this.r40_expo_crm = r40_expo_crm;
	}
	public BigDecimal getR40_spe_pro_expo() {
		return r40_spe_pro_expo;
	}
	public void setR40_spe_pro_expo(BigDecimal r40_spe_pro_expo) {
		this.r40_spe_pro_expo = r40_spe_pro_expo;
	}
	public BigDecimal getR40_amt_elig_sht_net() {
		return r40_amt_elig_sht_net;
	}
	public void setR40_amt_elig_sht_net(BigDecimal r40_amt_elig_sht_net) {
		this.r40_amt_elig_sht_net = r40_amt_elig_sht_net;
	}
	public BigDecimal getR40_tot_expo_net_spe() {
		return r40_tot_expo_net_spe;
	}
	public void setR40_tot_expo_net_spe(BigDecimal r40_tot_expo_net_spe) {
		this.r40_tot_expo_net_spe = r40_tot_expo_net_spe;
	}
	public BigDecimal getR40_crm_sub_elig_sub_app() {
		return r40_crm_sub_elig_sub_app;
	}
	public void setR40_crm_sub_elig_sub_app(BigDecimal r40_crm_sub_elig_sub_app) {
		this.r40_crm_sub_elig_sub_app = r40_crm_sub_elig_sub_app;
	}
	public BigDecimal getR40_crm_sub_non_col_guar() {
		return r40_crm_sub_non_col_guar;
	}
	public void setR40_crm_sub_non_col_guar(BigDecimal r40_crm_sub_non_col_guar) {
		this.r40_crm_sub_non_col_guar = r40_crm_sub_non_col_guar;
	}
	public BigDecimal getR40_crm_sub_non_col_cre_der() {
		return r40_crm_sub_non_col_cre_der;
	}
	public void setR40_crm_sub_non_col_cre_der(BigDecimal r40_crm_sub_non_col_cre_der) {
		this.r40_crm_sub_non_col_cre_der = r40_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR40_crm_sub_col_elig_cash() {
		return r40_crm_sub_col_elig_cash;
	}
	public void setR40_crm_sub_col_elig_cash(BigDecimal r40_crm_sub_col_elig_cash) {
		this.r40_crm_sub_col_elig_cash = r40_crm_sub_col_elig_cash;
	}
	public BigDecimal getR40_crm_sub_col_elig_trea_bills() {
		return r40_crm_sub_col_elig_trea_bills;
	}
	public void setR40_crm_sub_col_elig_trea_bills(BigDecimal r40_crm_sub_col_elig_trea_bills) {
		this.r40_crm_sub_col_elig_trea_bills = r40_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR40_crm_sub_col_elig_deb_sec() {
		return r40_crm_sub_col_elig_deb_sec;
	}
	public void setR40_crm_sub_col_elig_deb_sec(BigDecimal r40_crm_sub_col_elig_deb_sec) {
		this.r40_crm_sub_col_elig_deb_sec = r40_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR40_crm_sub_col_elig_equi() {
		return r40_crm_sub_col_elig_equi;
	}
	public void setR40_crm_sub_col_elig_equi(BigDecimal r40_crm_sub_col_elig_equi) {
		this.r40_crm_sub_col_elig_equi = r40_crm_sub_col_elig_equi;
	}
	public BigDecimal getR40_crm_sub_col_elig_unit_tru() {
		return r40_crm_sub_col_elig_unit_tru;
	}
	public void setR40_crm_sub_col_elig_unit_tru(BigDecimal r40_crm_sub_col_elig_unit_tru) {
		this.r40_crm_sub_col_elig_unit_tru = r40_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR40_crm_sub_col_exp_cov() {
		return r40_crm_sub_col_exp_cov;
	}
	public void setR40_crm_sub_col_exp_cov(BigDecimal r40_crm_sub_col_exp_cov) {
		this.r40_crm_sub_col_exp_cov = r40_crm_sub_col_exp_cov;
	}
	public BigDecimal getR40_crm_sub_col_elig_exp_not_cov() {
		return r40_crm_sub_col_elig_exp_not_cov;
	}
	public void setR40_crm_sub_col_elig_exp_not_cov(BigDecimal r40_crm_sub_col_elig_exp_not_cov) {
		this.r40_crm_sub_col_elig_exp_not_cov = r40_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR40_crm_sub_rwa_ris_crm() {
		return r40_crm_sub_rwa_ris_crm;
	}
	public void setR40_crm_sub_rwa_ris_crm(BigDecimal r40_crm_sub_rwa_ris_crm) {
		this.r40_crm_sub_rwa_ris_crm = r40_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR40_crm_sub_rwa_cov_crm() {
		return r40_crm_sub_rwa_cov_crm;
	}
	public void setR40_crm_sub_rwa_cov_crm(BigDecimal r40_crm_sub_rwa_cov_crm) {
		this.r40_crm_sub_rwa_cov_crm = r40_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR40_crm_sub_rwa_org_cou() {
		return r40_crm_sub_rwa_org_cou;
	}
	public void setR40_crm_sub_rwa_org_cou(BigDecimal r40_crm_sub_rwa_org_cou) {
		this.r40_crm_sub_rwa_org_cou = r40_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR40_crm_sub_rwa_not_cov_crm() {
		return r40_crm_sub_rwa_not_cov_crm;
	}
	public void setR40_crm_sub_rwa_not_cov_crm(BigDecimal r40_crm_sub_rwa_not_cov_crm) {
		this.r40_crm_sub_rwa_not_cov_crm = r40_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR40_crm_comp_col_expo_elig() {
		return r40_crm_comp_col_expo_elig;
	}
	public void setR40_crm_comp_col_expo_elig(BigDecimal r40_crm_comp_col_expo_elig) {
		this.r40_crm_comp_col_expo_elig = r40_crm_comp_col_expo_elig;
	}
	public BigDecimal getR40_crm_comp_col_elig_expo_vol_adj() {
		return r40_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR40_crm_comp_col_elig_expo_vol_adj(BigDecimal r40_crm_comp_col_elig_expo_vol_adj) {
		this.r40_crm_comp_col_elig_expo_vol_adj = r40_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR40_crm_comp_col_elig_fin_hai() {
		return r40_crm_comp_col_elig_fin_hai;
	}
	public void setR40_crm_comp_col_elig_fin_hai(BigDecimal r40_crm_comp_col_elig_fin_hai) {
		this.r40_crm_comp_col_elig_fin_hai = r40_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR40_crm_comp_col_expo_val() {
		return r40_crm_comp_col_expo_val;
	}
	public void setR40_crm_comp_col_expo_val(BigDecimal r40_crm_comp_col_expo_val) {
		this.r40_crm_comp_col_expo_val = r40_crm_comp_col_expo_val;
	}
	public BigDecimal getR40_rwa_elig_expo_not_cov_crm() {
		return r40_rwa_elig_expo_not_cov_crm;
	}
	public void setR40_rwa_elig_expo_not_cov_crm(BigDecimal r40_rwa_elig_expo_not_cov_crm) {
		this.r40_rwa_elig_expo_not_cov_crm = r40_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR40_rwa_unsec_expo_cre_ris() {
		return r40_rwa_unsec_expo_cre_ris;
	}
	public void setR40_rwa_unsec_expo_cre_ris(BigDecimal r40_rwa_unsec_expo_cre_ris) {
		this.r40_rwa_unsec_expo_cre_ris = r40_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR40_rwa_unsec_expo() {
		return r40_rwa_unsec_expo;
	}
	public void setR40_rwa_unsec_expo(BigDecimal r40_rwa_unsec_expo) {
		this.r40_rwa_unsec_expo = r40_rwa_unsec_expo;
	}
	public BigDecimal getR40_rwa_tot_ris_wei_ass() {
		return r40_rwa_tot_ris_wei_ass;
	}
	public void setR40_rwa_tot_ris_wei_ass(BigDecimal r40_rwa_tot_ris_wei_ass) {
		this.r40_rwa_tot_ris_wei_ass = r40_rwa_tot_ris_wei_ass;
	}
	public String getR41_exposure_class() {
		return r41_exposure_class;
	}
	public void setR41_exposure_class(String r41_exposure_class) {
		this.r41_exposure_class = r41_exposure_class;
	}
	public BigDecimal getR41_expo_crm() {
		return r41_expo_crm;
	}
	public void setR41_expo_crm(BigDecimal r41_expo_crm) {
		this.r41_expo_crm = r41_expo_crm;
	}
	public BigDecimal getR41_spe_pro_expo() {
		return r41_spe_pro_expo;
	}
	public void setR41_spe_pro_expo(BigDecimal r41_spe_pro_expo) {
		this.r41_spe_pro_expo = r41_spe_pro_expo;
	}
	public BigDecimal getR41_amt_elig_sht_net() {
		return r41_amt_elig_sht_net;
	}
	public void setR41_amt_elig_sht_net(BigDecimal r41_amt_elig_sht_net) {
		this.r41_amt_elig_sht_net = r41_amt_elig_sht_net;
	}
	public BigDecimal getR41_tot_expo_net_spe() {
		return r41_tot_expo_net_spe;
	}
	public void setR41_tot_expo_net_spe(BigDecimal r41_tot_expo_net_spe) {
		this.r41_tot_expo_net_spe = r41_tot_expo_net_spe;
	}
	public BigDecimal getR41_crm_sub_elig_sub_app() {
		return r41_crm_sub_elig_sub_app;
	}
	public void setR41_crm_sub_elig_sub_app(BigDecimal r41_crm_sub_elig_sub_app) {
		this.r41_crm_sub_elig_sub_app = r41_crm_sub_elig_sub_app;
	}
	public BigDecimal getR41_crm_sub_non_col_guar() {
		return r41_crm_sub_non_col_guar;
	}
	public void setR41_crm_sub_non_col_guar(BigDecimal r41_crm_sub_non_col_guar) {
		this.r41_crm_sub_non_col_guar = r41_crm_sub_non_col_guar;
	}
	public BigDecimal getR41_crm_sub_non_col_cre_der() {
		return r41_crm_sub_non_col_cre_der;
	}
	public void setR41_crm_sub_non_col_cre_der(BigDecimal r41_crm_sub_non_col_cre_der) {
		this.r41_crm_sub_non_col_cre_der = r41_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR41_crm_sub_col_elig_cash() {
		return r41_crm_sub_col_elig_cash;
	}
	public void setR41_crm_sub_col_elig_cash(BigDecimal r41_crm_sub_col_elig_cash) {
		this.r41_crm_sub_col_elig_cash = r41_crm_sub_col_elig_cash;
	}
	public BigDecimal getR41_crm_sub_col_elig_trea_bills() {
		return r41_crm_sub_col_elig_trea_bills;
	}
	public void setR41_crm_sub_col_elig_trea_bills(BigDecimal r41_crm_sub_col_elig_trea_bills) {
		this.r41_crm_sub_col_elig_trea_bills = r41_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR41_crm_sub_col_elig_deb_sec() {
		return r41_crm_sub_col_elig_deb_sec;
	}
	public void setR41_crm_sub_col_elig_deb_sec(BigDecimal r41_crm_sub_col_elig_deb_sec) {
		this.r41_crm_sub_col_elig_deb_sec = r41_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR41_crm_sub_col_elig_equi() {
		return r41_crm_sub_col_elig_equi;
	}
	public void setR41_crm_sub_col_elig_equi(BigDecimal r41_crm_sub_col_elig_equi) {
		this.r41_crm_sub_col_elig_equi = r41_crm_sub_col_elig_equi;
	}
	public BigDecimal getR41_crm_sub_col_elig_unit_tru() {
		return r41_crm_sub_col_elig_unit_tru;
	}
	public void setR41_crm_sub_col_elig_unit_tru(BigDecimal r41_crm_sub_col_elig_unit_tru) {
		this.r41_crm_sub_col_elig_unit_tru = r41_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR41_crm_sub_col_exp_cov() {
		return r41_crm_sub_col_exp_cov;
	}
	public void setR41_crm_sub_col_exp_cov(BigDecimal r41_crm_sub_col_exp_cov) {
		this.r41_crm_sub_col_exp_cov = r41_crm_sub_col_exp_cov;
	}
	public BigDecimal getR41_crm_sub_col_elig_exp_not_cov() {
		return r41_crm_sub_col_elig_exp_not_cov;
	}
	public void setR41_crm_sub_col_elig_exp_not_cov(BigDecimal r41_crm_sub_col_elig_exp_not_cov) {
		this.r41_crm_sub_col_elig_exp_not_cov = r41_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR41_crm_sub_rwa_ris_crm() {
		return r41_crm_sub_rwa_ris_crm;
	}
	public void setR41_crm_sub_rwa_ris_crm(BigDecimal r41_crm_sub_rwa_ris_crm) {
		this.r41_crm_sub_rwa_ris_crm = r41_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR41_crm_sub_rwa_cov_crm() {
		return r41_crm_sub_rwa_cov_crm;
	}
	public void setR41_crm_sub_rwa_cov_crm(BigDecimal r41_crm_sub_rwa_cov_crm) {
		this.r41_crm_sub_rwa_cov_crm = r41_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR41_crm_sub_rwa_org_cou() {
		return r41_crm_sub_rwa_org_cou;
	}
	public void setR41_crm_sub_rwa_org_cou(BigDecimal r41_crm_sub_rwa_org_cou) {
		this.r41_crm_sub_rwa_org_cou = r41_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR41_crm_sub_rwa_not_cov_crm() {
		return r41_crm_sub_rwa_not_cov_crm;
	}
	public void setR41_crm_sub_rwa_not_cov_crm(BigDecimal r41_crm_sub_rwa_not_cov_crm) {
		this.r41_crm_sub_rwa_not_cov_crm = r41_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR41_crm_comp_col_expo_elig() {
		return r41_crm_comp_col_expo_elig;
	}
	public void setR41_crm_comp_col_expo_elig(BigDecimal r41_crm_comp_col_expo_elig) {
		this.r41_crm_comp_col_expo_elig = r41_crm_comp_col_expo_elig;
	}
	public BigDecimal getR41_crm_comp_col_elig_expo_vol_adj() {
		return r41_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR41_crm_comp_col_elig_expo_vol_adj(BigDecimal r41_crm_comp_col_elig_expo_vol_adj) {
		this.r41_crm_comp_col_elig_expo_vol_adj = r41_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR41_crm_comp_col_elig_fin_hai() {
		return r41_crm_comp_col_elig_fin_hai;
	}
	public void setR41_crm_comp_col_elig_fin_hai(BigDecimal r41_crm_comp_col_elig_fin_hai) {
		this.r41_crm_comp_col_elig_fin_hai = r41_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR41_crm_comp_col_expo_val() {
		return r41_crm_comp_col_expo_val;
	}
	public void setR41_crm_comp_col_expo_val(BigDecimal r41_crm_comp_col_expo_val) {
		this.r41_crm_comp_col_expo_val = r41_crm_comp_col_expo_val;
	}
	public BigDecimal getR41_rwa_elig_expo_not_cov_crm() {
		return r41_rwa_elig_expo_not_cov_crm;
	}
	public void setR41_rwa_elig_expo_not_cov_crm(BigDecimal r41_rwa_elig_expo_not_cov_crm) {
		this.r41_rwa_elig_expo_not_cov_crm = r41_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR41_rwa_unsec_expo_cre_ris() {
		return r41_rwa_unsec_expo_cre_ris;
	}
	public void setR41_rwa_unsec_expo_cre_ris(BigDecimal r41_rwa_unsec_expo_cre_ris) {
		this.r41_rwa_unsec_expo_cre_ris = r41_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR41_rwa_unsec_expo() {
		return r41_rwa_unsec_expo;
	}
	public void setR41_rwa_unsec_expo(BigDecimal r41_rwa_unsec_expo) {
		this.r41_rwa_unsec_expo = r41_rwa_unsec_expo;
	}
	public BigDecimal getR41_rwa_tot_ris_wei_ass() {
		return r41_rwa_tot_ris_wei_ass;
	}
	public void setR41_rwa_tot_ris_wei_ass(BigDecimal r41_rwa_tot_ris_wei_ass) {
		this.r41_rwa_tot_ris_wei_ass = r41_rwa_tot_ris_wei_ass;
	}
	public String getR42_exposure_class() {
		return r42_exposure_class;
	}
	public void setR42_exposure_class(String r42_exposure_class) {
		this.r42_exposure_class = r42_exposure_class;
	}
	public BigDecimal getR42_expo_crm() {
		return r42_expo_crm;
	}
	public void setR42_expo_crm(BigDecimal r42_expo_crm) {
		this.r42_expo_crm = r42_expo_crm;
	}
	public BigDecimal getR42_spe_pro_expo() {
		return r42_spe_pro_expo;
	}
	public void setR42_spe_pro_expo(BigDecimal r42_spe_pro_expo) {
		this.r42_spe_pro_expo = r42_spe_pro_expo;
	}
	public BigDecimal getR42_amt_elig_sht_net() {
		return r42_amt_elig_sht_net;
	}
	public void setR42_amt_elig_sht_net(BigDecimal r42_amt_elig_sht_net) {
		this.r42_amt_elig_sht_net = r42_amt_elig_sht_net;
	}
	public BigDecimal getR42_tot_expo_net_spe() {
		return r42_tot_expo_net_spe;
	}
	public void setR42_tot_expo_net_spe(BigDecimal r42_tot_expo_net_spe) {
		this.r42_tot_expo_net_spe = r42_tot_expo_net_spe;
	}
	public BigDecimal getR42_crm_sub_elig_sub_app() {
		return r42_crm_sub_elig_sub_app;
	}
	public void setR42_crm_sub_elig_sub_app(BigDecimal r42_crm_sub_elig_sub_app) {
		this.r42_crm_sub_elig_sub_app = r42_crm_sub_elig_sub_app;
	}
	public BigDecimal getR42_crm_sub_non_col_guar() {
		return r42_crm_sub_non_col_guar;
	}
	public void setR42_crm_sub_non_col_guar(BigDecimal r42_crm_sub_non_col_guar) {
		this.r42_crm_sub_non_col_guar = r42_crm_sub_non_col_guar;
	}
	public BigDecimal getR42_crm_sub_non_col_cre_der() {
		return r42_crm_sub_non_col_cre_der;
	}
	public void setR42_crm_sub_non_col_cre_der(BigDecimal r42_crm_sub_non_col_cre_der) {
		this.r42_crm_sub_non_col_cre_der = r42_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR42_crm_sub_col_elig_cash() {
		return r42_crm_sub_col_elig_cash;
	}
	public void setR42_crm_sub_col_elig_cash(BigDecimal r42_crm_sub_col_elig_cash) {
		this.r42_crm_sub_col_elig_cash = r42_crm_sub_col_elig_cash;
	}
	public BigDecimal getR42_crm_sub_col_elig_trea_bills() {
		return r42_crm_sub_col_elig_trea_bills;
	}
	public void setR42_crm_sub_col_elig_trea_bills(BigDecimal r42_crm_sub_col_elig_trea_bills) {
		this.r42_crm_sub_col_elig_trea_bills = r42_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR42_crm_sub_col_elig_deb_sec() {
		return r42_crm_sub_col_elig_deb_sec;
	}
	public void setR42_crm_sub_col_elig_deb_sec(BigDecimal r42_crm_sub_col_elig_deb_sec) {
		this.r42_crm_sub_col_elig_deb_sec = r42_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR42_crm_sub_col_elig_equi() {
		return r42_crm_sub_col_elig_equi;
	}
	public void setR42_crm_sub_col_elig_equi(BigDecimal r42_crm_sub_col_elig_equi) {
		this.r42_crm_sub_col_elig_equi = r42_crm_sub_col_elig_equi;
	}
	public BigDecimal getR42_crm_sub_col_elig_unit_tru() {
		return r42_crm_sub_col_elig_unit_tru;
	}
	public void setR42_crm_sub_col_elig_unit_tru(BigDecimal r42_crm_sub_col_elig_unit_tru) {
		this.r42_crm_sub_col_elig_unit_tru = r42_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR42_crm_sub_col_exp_cov() {
		return r42_crm_sub_col_exp_cov;
	}
	public void setR42_crm_sub_col_exp_cov(BigDecimal r42_crm_sub_col_exp_cov) {
		this.r42_crm_sub_col_exp_cov = r42_crm_sub_col_exp_cov;
	}
	public BigDecimal getR42_crm_sub_col_elig_exp_not_cov() {
		return r42_crm_sub_col_elig_exp_not_cov;
	}
	public void setR42_crm_sub_col_elig_exp_not_cov(BigDecimal r42_crm_sub_col_elig_exp_not_cov) {
		this.r42_crm_sub_col_elig_exp_not_cov = r42_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR42_crm_sub_rwa_ris_crm() {
		return r42_crm_sub_rwa_ris_crm;
	}
	public void setR42_crm_sub_rwa_ris_crm(BigDecimal r42_crm_sub_rwa_ris_crm) {
		this.r42_crm_sub_rwa_ris_crm = r42_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR42_crm_sub_rwa_cov_crm() {
		return r42_crm_sub_rwa_cov_crm;
	}
	public void setR42_crm_sub_rwa_cov_crm(BigDecimal r42_crm_sub_rwa_cov_crm) {
		this.r42_crm_sub_rwa_cov_crm = r42_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR42_crm_sub_rwa_org_cou() {
		return r42_crm_sub_rwa_org_cou;
	}
	public void setR42_crm_sub_rwa_org_cou(BigDecimal r42_crm_sub_rwa_org_cou) {
		this.r42_crm_sub_rwa_org_cou = r42_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR42_crm_sub_rwa_not_cov_crm() {
		return r42_crm_sub_rwa_not_cov_crm;
	}
	public void setR42_crm_sub_rwa_not_cov_crm(BigDecimal r42_crm_sub_rwa_not_cov_crm) {
		this.r42_crm_sub_rwa_not_cov_crm = r42_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR42_crm_comp_col_expo_elig() {
		return r42_crm_comp_col_expo_elig;
	}
	public void setR42_crm_comp_col_expo_elig(BigDecimal r42_crm_comp_col_expo_elig) {
		this.r42_crm_comp_col_expo_elig = r42_crm_comp_col_expo_elig;
	}
	public BigDecimal getR42_crm_comp_col_elig_expo_vol_adj() {
		return r42_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR42_crm_comp_col_elig_expo_vol_adj(BigDecimal r42_crm_comp_col_elig_expo_vol_adj) {
		this.r42_crm_comp_col_elig_expo_vol_adj = r42_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR42_crm_comp_col_elig_fin_hai() {
		return r42_crm_comp_col_elig_fin_hai;
	}
	public void setR42_crm_comp_col_elig_fin_hai(BigDecimal r42_crm_comp_col_elig_fin_hai) {
		this.r42_crm_comp_col_elig_fin_hai = r42_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR42_crm_comp_col_expo_val() {
		return r42_crm_comp_col_expo_val;
	}
	public void setR42_crm_comp_col_expo_val(BigDecimal r42_crm_comp_col_expo_val) {
		this.r42_crm_comp_col_expo_val = r42_crm_comp_col_expo_val;
	}
	public BigDecimal getR42_rwa_elig_expo_not_cov_crm() {
		return r42_rwa_elig_expo_not_cov_crm;
	}
	public void setR42_rwa_elig_expo_not_cov_crm(BigDecimal r42_rwa_elig_expo_not_cov_crm) {
		this.r42_rwa_elig_expo_not_cov_crm = r42_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR42_rwa_unsec_expo_cre_ris() {
		return r42_rwa_unsec_expo_cre_ris;
	}
	public void setR42_rwa_unsec_expo_cre_ris(BigDecimal r42_rwa_unsec_expo_cre_ris) {
		this.r42_rwa_unsec_expo_cre_ris = r42_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR42_rwa_unsec_expo() {
		return r42_rwa_unsec_expo;
	}
	public void setR42_rwa_unsec_expo(BigDecimal r42_rwa_unsec_expo) {
		this.r42_rwa_unsec_expo = r42_rwa_unsec_expo;
	}
	public BigDecimal getR42_rwa_tot_ris_wei_ass() {
		return r42_rwa_tot_ris_wei_ass;
	}
	public void setR42_rwa_tot_ris_wei_ass(BigDecimal r42_rwa_tot_ris_wei_ass) {
		this.r42_rwa_tot_ris_wei_ass = r42_rwa_tot_ris_wei_ass;
	}
	public String getR43_exposure_class() {
		return r43_exposure_class;
	}
	public void setR43_exposure_class(String r43_exposure_class) {
		this.r43_exposure_class = r43_exposure_class;
	}
	public BigDecimal getR43_expo_crm() {
		return r43_expo_crm;
	}
	public void setR43_expo_crm(BigDecimal r43_expo_crm) {
		this.r43_expo_crm = r43_expo_crm;
	}
	public BigDecimal getR43_spe_pro_expo() {
		return r43_spe_pro_expo;
	}
	public void setR43_spe_pro_expo(BigDecimal r43_spe_pro_expo) {
		this.r43_spe_pro_expo = r43_spe_pro_expo;
	}
	public BigDecimal getR43_amt_elig_sht_net() {
		return r43_amt_elig_sht_net;
	}
	public void setR43_amt_elig_sht_net(BigDecimal r43_amt_elig_sht_net) {
		this.r43_amt_elig_sht_net = r43_amt_elig_sht_net;
	}
	public BigDecimal getR43_tot_expo_net_spe() {
		return r43_tot_expo_net_spe;
	}
	public void setR43_tot_expo_net_spe(BigDecimal r43_tot_expo_net_spe) {
		this.r43_tot_expo_net_spe = r43_tot_expo_net_spe;
	}
	public BigDecimal getR43_crm_sub_elig_sub_app() {
		return r43_crm_sub_elig_sub_app;
	}
	public void setR43_crm_sub_elig_sub_app(BigDecimal r43_crm_sub_elig_sub_app) {
		this.r43_crm_sub_elig_sub_app = r43_crm_sub_elig_sub_app;
	}
	public BigDecimal getR43_crm_sub_non_col_guar() {
		return r43_crm_sub_non_col_guar;
	}
	public void setR43_crm_sub_non_col_guar(BigDecimal r43_crm_sub_non_col_guar) {
		this.r43_crm_sub_non_col_guar = r43_crm_sub_non_col_guar;
	}
	public BigDecimal getR43_crm_sub_non_col_cre_der() {
		return r43_crm_sub_non_col_cre_der;
	}
	public void setR43_crm_sub_non_col_cre_der(BigDecimal r43_crm_sub_non_col_cre_der) {
		this.r43_crm_sub_non_col_cre_der = r43_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR43_crm_sub_col_elig_cash() {
		return r43_crm_sub_col_elig_cash;
	}
	public void setR43_crm_sub_col_elig_cash(BigDecimal r43_crm_sub_col_elig_cash) {
		this.r43_crm_sub_col_elig_cash = r43_crm_sub_col_elig_cash;
	}
	public BigDecimal getR43_crm_sub_col_elig_trea_bills() {
		return r43_crm_sub_col_elig_trea_bills;
	}
	public void setR43_crm_sub_col_elig_trea_bills(BigDecimal r43_crm_sub_col_elig_trea_bills) {
		this.r43_crm_sub_col_elig_trea_bills = r43_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR43_crm_sub_col_elig_deb_sec() {
		return r43_crm_sub_col_elig_deb_sec;
	}
	public void setR43_crm_sub_col_elig_deb_sec(BigDecimal r43_crm_sub_col_elig_deb_sec) {
		this.r43_crm_sub_col_elig_deb_sec = r43_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR43_crm_sub_col_elig_equi() {
		return r43_crm_sub_col_elig_equi;
	}
	public void setR43_crm_sub_col_elig_equi(BigDecimal r43_crm_sub_col_elig_equi) {
		this.r43_crm_sub_col_elig_equi = r43_crm_sub_col_elig_equi;
	}
	public BigDecimal getR43_crm_sub_col_elig_unit_tru() {
		return r43_crm_sub_col_elig_unit_tru;
	}
	public void setR43_crm_sub_col_elig_unit_tru(BigDecimal r43_crm_sub_col_elig_unit_tru) {
		this.r43_crm_sub_col_elig_unit_tru = r43_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR43_crm_sub_col_exp_cov() {
		return r43_crm_sub_col_exp_cov;
	}
	public void setR43_crm_sub_col_exp_cov(BigDecimal r43_crm_sub_col_exp_cov) {
		this.r43_crm_sub_col_exp_cov = r43_crm_sub_col_exp_cov;
	}
	public BigDecimal getR43_crm_sub_col_elig_exp_not_cov() {
		return r43_crm_sub_col_elig_exp_not_cov;
	}
	public void setR43_crm_sub_col_elig_exp_not_cov(BigDecimal r43_crm_sub_col_elig_exp_not_cov) {
		this.r43_crm_sub_col_elig_exp_not_cov = r43_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR43_crm_sub_rwa_ris_crm() {
		return r43_crm_sub_rwa_ris_crm;
	}
	public void setR43_crm_sub_rwa_ris_crm(BigDecimal r43_crm_sub_rwa_ris_crm) {
		this.r43_crm_sub_rwa_ris_crm = r43_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR43_crm_sub_rwa_cov_crm() {
		return r43_crm_sub_rwa_cov_crm;
	}
	public void setR43_crm_sub_rwa_cov_crm(BigDecimal r43_crm_sub_rwa_cov_crm) {
		this.r43_crm_sub_rwa_cov_crm = r43_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR43_crm_sub_rwa_org_cou() {
		return r43_crm_sub_rwa_org_cou;
	}
	public void setR43_crm_sub_rwa_org_cou(BigDecimal r43_crm_sub_rwa_org_cou) {
		this.r43_crm_sub_rwa_org_cou = r43_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR43_crm_sub_rwa_not_cov_crm() {
		return r43_crm_sub_rwa_not_cov_crm;
	}
	public void setR43_crm_sub_rwa_not_cov_crm(BigDecimal r43_crm_sub_rwa_not_cov_crm) {
		this.r43_crm_sub_rwa_not_cov_crm = r43_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR43_crm_comp_col_expo_elig() {
		return r43_crm_comp_col_expo_elig;
	}
	public void setR43_crm_comp_col_expo_elig(BigDecimal r43_crm_comp_col_expo_elig) {
		this.r43_crm_comp_col_expo_elig = r43_crm_comp_col_expo_elig;
	}
	public BigDecimal getR43_crm_comp_col_elig_expo_vol_adj() {
		return r43_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR43_crm_comp_col_elig_expo_vol_adj(BigDecimal r43_crm_comp_col_elig_expo_vol_adj) {
		this.r43_crm_comp_col_elig_expo_vol_adj = r43_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR43_crm_comp_col_elig_fin_hai() {
		return r43_crm_comp_col_elig_fin_hai;
	}
	public void setR43_crm_comp_col_elig_fin_hai(BigDecimal r43_crm_comp_col_elig_fin_hai) {
		this.r43_crm_comp_col_elig_fin_hai = r43_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR43_crm_comp_col_expo_val() {
		return r43_crm_comp_col_expo_val;
	}
	public void setR43_crm_comp_col_expo_val(BigDecimal r43_crm_comp_col_expo_val) {
		this.r43_crm_comp_col_expo_val = r43_crm_comp_col_expo_val;
	}
	public BigDecimal getR43_rwa_elig_expo_not_cov_crm() {
		return r43_rwa_elig_expo_not_cov_crm;
	}
	public void setR43_rwa_elig_expo_not_cov_crm(BigDecimal r43_rwa_elig_expo_not_cov_crm) {
		this.r43_rwa_elig_expo_not_cov_crm = r43_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR43_rwa_unsec_expo_cre_ris() {
		return r43_rwa_unsec_expo_cre_ris;
	}
	public void setR43_rwa_unsec_expo_cre_ris(BigDecimal r43_rwa_unsec_expo_cre_ris) {
		this.r43_rwa_unsec_expo_cre_ris = r43_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR43_rwa_unsec_expo() {
		return r43_rwa_unsec_expo;
	}
	public void setR43_rwa_unsec_expo(BigDecimal r43_rwa_unsec_expo) {
		this.r43_rwa_unsec_expo = r43_rwa_unsec_expo;
	}
	public BigDecimal getR43_rwa_tot_ris_wei_ass() {
		return r43_rwa_tot_ris_wei_ass;
	}
	public void setR43_rwa_tot_ris_wei_ass(BigDecimal r43_rwa_tot_ris_wei_ass) {
		this.r43_rwa_tot_ris_wei_ass = r43_rwa_tot_ris_wei_ass;
	}
	public String getR44_exposure_class() {
		return r44_exposure_class;
	}
	public void setR44_exposure_class(String r44_exposure_class) {
		this.r44_exposure_class = r44_exposure_class;
	}
	public BigDecimal getR44_expo_crm() {
		return r44_expo_crm;
	}
	public void setR44_expo_crm(BigDecimal r44_expo_crm) {
		this.r44_expo_crm = r44_expo_crm;
	}
	public BigDecimal getR44_spe_pro_expo() {
		return r44_spe_pro_expo;
	}
	public void setR44_spe_pro_expo(BigDecimal r44_spe_pro_expo) {
		this.r44_spe_pro_expo = r44_spe_pro_expo;
	}
	public BigDecimal getR44_amt_elig_sht_net() {
		return r44_amt_elig_sht_net;
	}
	public void setR44_amt_elig_sht_net(BigDecimal r44_amt_elig_sht_net) {
		this.r44_amt_elig_sht_net = r44_amt_elig_sht_net;
	}
	public BigDecimal getR44_tot_expo_net_spe() {
		return r44_tot_expo_net_spe;
	}
	public void setR44_tot_expo_net_spe(BigDecimal r44_tot_expo_net_spe) {
		this.r44_tot_expo_net_spe = r44_tot_expo_net_spe;
	}
	public BigDecimal getR44_crm_sub_elig_sub_app() {
		return r44_crm_sub_elig_sub_app;
	}
	public void setR44_crm_sub_elig_sub_app(BigDecimal r44_crm_sub_elig_sub_app) {
		this.r44_crm_sub_elig_sub_app = r44_crm_sub_elig_sub_app;
	}
	public BigDecimal getR44_crm_sub_non_col_guar() {
		return r44_crm_sub_non_col_guar;
	}
	public void setR44_crm_sub_non_col_guar(BigDecimal r44_crm_sub_non_col_guar) {
		this.r44_crm_sub_non_col_guar = r44_crm_sub_non_col_guar;
	}
	public BigDecimal getR44_crm_sub_non_col_cre_der() {
		return r44_crm_sub_non_col_cre_der;
	}
	public void setR44_crm_sub_non_col_cre_der(BigDecimal r44_crm_sub_non_col_cre_der) {
		this.r44_crm_sub_non_col_cre_der = r44_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR44_crm_sub_col_elig_cash() {
		return r44_crm_sub_col_elig_cash;
	}
	public void setR44_crm_sub_col_elig_cash(BigDecimal r44_crm_sub_col_elig_cash) {
		this.r44_crm_sub_col_elig_cash = r44_crm_sub_col_elig_cash;
	}
	public BigDecimal getR44_crm_sub_col_elig_trea_bills() {
		return r44_crm_sub_col_elig_trea_bills;
	}
	public void setR44_crm_sub_col_elig_trea_bills(BigDecimal r44_crm_sub_col_elig_trea_bills) {
		this.r44_crm_sub_col_elig_trea_bills = r44_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR44_crm_sub_col_elig_deb_sec() {
		return r44_crm_sub_col_elig_deb_sec;
	}
	public void setR44_crm_sub_col_elig_deb_sec(BigDecimal r44_crm_sub_col_elig_deb_sec) {
		this.r44_crm_sub_col_elig_deb_sec = r44_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR44_crm_sub_col_elig_equi() {
		return r44_crm_sub_col_elig_equi;
	}
	public void setR44_crm_sub_col_elig_equi(BigDecimal r44_crm_sub_col_elig_equi) {
		this.r44_crm_sub_col_elig_equi = r44_crm_sub_col_elig_equi;
	}
	public BigDecimal getR44_crm_sub_col_elig_unit_tru() {
		return r44_crm_sub_col_elig_unit_tru;
	}
	public void setR44_crm_sub_col_elig_unit_tru(BigDecimal r44_crm_sub_col_elig_unit_tru) {
		this.r44_crm_sub_col_elig_unit_tru = r44_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR44_crm_sub_col_exp_cov() {
		return r44_crm_sub_col_exp_cov;
	}
	public void setR44_crm_sub_col_exp_cov(BigDecimal r44_crm_sub_col_exp_cov) {
		this.r44_crm_sub_col_exp_cov = r44_crm_sub_col_exp_cov;
	}
	public BigDecimal getR44_crm_sub_col_elig_exp_not_cov() {
		return r44_crm_sub_col_elig_exp_not_cov;
	}
	public void setR44_crm_sub_col_elig_exp_not_cov(BigDecimal r44_crm_sub_col_elig_exp_not_cov) {
		this.r44_crm_sub_col_elig_exp_not_cov = r44_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR44_crm_sub_rwa_ris_crm() {
		return r44_crm_sub_rwa_ris_crm;
	}
	public void setR44_crm_sub_rwa_ris_crm(BigDecimal r44_crm_sub_rwa_ris_crm) {
		this.r44_crm_sub_rwa_ris_crm = r44_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR44_crm_sub_rwa_cov_crm() {
		return r44_crm_sub_rwa_cov_crm;
	}
	public void setR44_crm_sub_rwa_cov_crm(BigDecimal r44_crm_sub_rwa_cov_crm) {
		this.r44_crm_sub_rwa_cov_crm = r44_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR44_crm_sub_rwa_org_cou() {
		return r44_crm_sub_rwa_org_cou;
	}
	public void setR44_crm_sub_rwa_org_cou(BigDecimal r44_crm_sub_rwa_org_cou) {
		this.r44_crm_sub_rwa_org_cou = r44_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR44_crm_sub_rwa_not_cov_crm() {
		return r44_crm_sub_rwa_not_cov_crm;
	}
	public void setR44_crm_sub_rwa_not_cov_crm(BigDecimal r44_crm_sub_rwa_not_cov_crm) {
		this.r44_crm_sub_rwa_not_cov_crm = r44_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR44_crm_comp_col_expo_elig() {
		return r44_crm_comp_col_expo_elig;
	}
	public void setR44_crm_comp_col_expo_elig(BigDecimal r44_crm_comp_col_expo_elig) {
		this.r44_crm_comp_col_expo_elig = r44_crm_comp_col_expo_elig;
	}
	public BigDecimal getR44_crm_comp_col_elig_expo_vol_adj() {
		return r44_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR44_crm_comp_col_elig_expo_vol_adj(BigDecimal r44_crm_comp_col_elig_expo_vol_adj) {
		this.r44_crm_comp_col_elig_expo_vol_adj = r44_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR44_crm_comp_col_elig_fin_hai() {
		return r44_crm_comp_col_elig_fin_hai;
	}
	public void setR44_crm_comp_col_elig_fin_hai(BigDecimal r44_crm_comp_col_elig_fin_hai) {
		this.r44_crm_comp_col_elig_fin_hai = r44_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR44_crm_comp_col_expo_val() {
		return r44_crm_comp_col_expo_val;
	}
	public void setR44_crm_comp_col_expo_val(BigDecimal r44_crm_comp_col_expo_val) {
		this.r44_crm_comp_col_expo_val = r44_crm_comp_col_expo_val;
	}
	public BigDecimal getR44_rwa_elig_expo_not_cov_crm() {
		return r44_rwa_elig_expo_not_cov_crm;
	}
	public void setR44_rwa_elig_expo_not_cov_crm(BigDecimal r44_rwa_elig_expo_not_cov_crm) {
		this.r44_rwa_elig_expo_not_cov_crm = r44_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR44_rwa_unsec_expo_cre_ris() {
		return r44_rwa_unsec_expo_cre_ris;
	}
	public void setR44_rwa_unsec_expo_cre_ris(BigDecimal r44_rwa_unsec_expo_cre_ris) {
		this.r44_rwa_unsec_expo_cre_ris = r44_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR44_rwa_unsec_expo() {
		return r44_rwa_unsec_expo;
	}
	public void setR44_rwa_unsec_expo(BigDecimal r44_rwa_unsec_expo) {
		this.r44_rwa_unsec_expo = r44_rwa_unsec_expo;
	}
	public BigDecimal getR44_rwa_tot_ris_wei_ass() {
		return r44_rwa_tot_ris_wei_ass;
	}
	public void setR44_rwa_tot_ris_wei_ass(BigDecimal r44_rwa_tot_ris_wei_ass) {
		this.r44_rwa_tot_ris_wei_ass = r44_rwa_tot_ris_wei_ass;
	}
	public String getR47_exposure_class() {
		return r47_exposure_class;
	}
	public void setR47_exposure_class(String r47_exposure_class) {
		this.r47_exposure_class = r47_exposure_class;
	}
	public BigDecimal getR47_expo_crm() {
		return r47_expo_crm;
	}
	public void setR47_expo_crm(BigDecimal r47_expo_crm) {
		this.r47_expo_crm = r47_expo_crm;
	}
	public BigDecimal getR47_spe_pro_expo() {
		return r47_spe_pro_expo;
	}
	public void setR47_spe_pro_expo(BigDecimal r47_spe_pro_expo) {
		this.r47_spe_pro_expo = r47_spe_pro_expo;
	}
	public BigDecimal getR47_amt_elig_sht_net() {
		return r47_amt_elig_sht_net;
	}
	public void setR47_amt_elig_sht_net(BigDecimal r47_amt_elig_sht_net) {
		this.r47_amt_elig_sht_net = r47_amt_elig_sht_net;
	}
	public BigDecimal getR47_tot_expo_net_spe() {
		return r47_tot_expo_net_spe;
	}
	public void setR47_tot_expo_net_spe(BigDecimal r47_tot_expo_net_spe) {
		this.r47_tot_expo_net_spe = r47_tot_expo_net_spe;
	}
	public BigDecimal getR47_crm_sub_elig_sub_app() {
		return r47_crm_sub_elig_sub_app;
	}
	public void setR47_crm_sub_elig_sub_app(BigDecimal r47_crm_sub_elig_sub_app) {
		this.r47_crm_sub_elig_sub_app = r47_crm_sub_elig_sub_app;
	}
	public BigDecimal getR47_crm_sub_non_col_guar() {
		return r47_crm_sub_non_col_guar;
	}
	public void setR47_crm_sub_non_col_guar(BigDecimal r47_crm_sub_non_col_guar) {
		this.r47_crm_sub_non_col_guar = r47_crm_sub_non_col_guar;
	}
	public BigDecimal getR47_crm_sub_non_col_cre_der() {
		return r47_crm_sub_non_col_cre_der;
	}
	public void setR47_crm_sub_non_col_cre_der(BigDecimal r47_crm_sub_non_col_cre_der) {
		this.r47_crm_sub_non_col_cre_der = r47_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR47_crm_sub_col_elig_cash() {
		return r47_crm_sub_col_elig_cash;
	}
	public void setR47_crm_sub_col_elig_cash(BigDecimal r47_crm_sub_col_elig_cash) {
		this.r47_crm_sub_col_elig_cash = r47_crm_sub_col_elig_cash;
	}
	public BigDecimal getR47_crm_sub_col_elig_trea_bills() {
		return r47_crm_sub_col_elig_trea_bills;
	}
	public void setR47_crm_sub_col_elig_trea_bills(BigDecimal r47_crm_sub_col_elig_trea_bills) {
		this.r47_crm_sub_col_elig_trea_bills = r47_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR47_crm_sub_col_elig_deb_sec() {
		return r47_crm_sub_col_elig_deb_sec;
	}
	public void setR47_crm_sub_col_elig_deb_sec(BigDecimal r47_crm_sub_col_elig_deb_sec) {
		this.r47_crm_sub_col_elig_deb_sec = r47_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR47_crm_sub_col_elig_equi() {
		return r47_crm_sub_col_elig_equi;
	}
	public void setR47_crm_sub_col_elig_equi(BigDecimal r47_crm_sub_col_elig_equi) {
		this.r47_crm_sub_col_elig_equi = r47_crm_sub_col_elig_equi;
	}
	public BigDecimal getR47_crm_sub_col_elig_unit_tru() {
		return r47_crm_sub_col_elig_unit_tru;
	}
	public void setR47_crm_sub_col_elig_unit_tru(BigDecimal r47_crm_sub_col_elig_unit_tru) {
		this.r47_crm_sub_col_elig_unit_tru = r47_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR47_crm_sub_col_exp_cov() {
		return r47_crm_sub_col_exp_cov;
	}
	public void setR47_crm_sub_col_exp_cov(BigDecimal r47_crm_sub_col_exp_cov) {
		this.r47_crm_sub_col_exp_cov = r47_crm_sub_col_exp_cov;
	}
	public BigDecimal getR47_crm_sub_col_elig_exp_not_cov() {
		return r47_crm_sub_col_elig_exp_not_cov;
	}
	public void setR47_crm_sub_col_elig_exp_not_cov(BigDecimal r47_crm_sub_col_elig_exp_not_cov) {
		this.r47_crm_sub_col_elig_exp_not_cov = r47_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR47_crm_sub_rwa_ris_crm() {
		return r47_crm_sub_rwa_ris_crm;
	}
	public void setR47_crm_sub_rwa_ris_crm(BigDecimal r47_crm_sub_rwa_ris_crm) {
		this.r47_crm_sub_rwa_ris_crm = r47_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR47_crm_sub_rwa_cov_crm() {
		return r47_crm_sub_rwa_cov_crm;
	}
	public void setR47_crm_sub_rwa_cov_crm(BigDecimal r47_crm_sub_rwa_cov_crm) {
		this.r47_crm_sub_rwa_cov_crm = r47_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR47_crm_sub_rwa_org_cou() {
		return r47_crm_sub_rwa_org_cou;
	}
	public void setR47_crm_sub_rwa_org_cou(BigDecimal r47_crm_sub_rwa_org_cou) {
		this.r47_crm_sub_rwa_org_cou = r47_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR47_crm_sub_rwa_not_cov_crm() {
		return r47_crm_sub_rwa_not_cov_crm;
	}
	public void setR47_crm_sub_rwa_not_cov_crm(BigDecimal r47_crm_sub_rwa_not_cov_crm) {
		this.r47_crm_sub_rwa_not_cov_crm = r47_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR47_crm_comp_col_expo_elig() {
		return r47_crm_comp_col_expo_elig;
	}
	public void setR47_crm_comp_col_expo_elig(BigDecimal r47_crm_comp_col_expo_elig) {
		this.r47_crm_comp_col_expo_elig = r47_crm_comp_col_expo_elig;
	}
	public BigDecimal getR47_crm_comp_col_elig_expo_vol_adj() {
		return r47_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR47_crm_comp_col_elig_expo_vol_adj(BigDecimal r47_crm_comp_col_elig_expo_vol_adj) {
		this.r47_crm_comp_col_elig_expo_vol_adj = r47_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR47_crm_comp_col_elig_fin_hai() {
		return r47_crm_comp_col_elig_fin_hai;
	}
	public void setR47_crm_comp_col_elig_fin_hai(BigDecimal r47_crm_comp_col_elig_fin_hai) {
		this.r47_crm_comp_col_elig_fin_hai = r47_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR47_crm_comp_col_expo_val() {
		return r47_crm_comp_col_expo_val;
	}
	public void setR47_crm_comp_col_expo_val(BigDecimal r47_crm_comp_col_expo_val) {
		this.r47_crm_comp_col_expo_val = r47_crm_comp_col_expo_val;
	}
	public BigDecimal getR47_rwa_elig_expo_not_cov_crm() {
		return r47_rwa_elig_expo_not_cov_crm;
	}
	public void setR47_rwa_elig_expo_not_cov_crm(BigDecimal r47_rwa_elig_expo_not_cov_crm) {
		this.r47_rwa_elig_expo_not_cov_crm = r47_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR47_rwa_unsec_expo_cre_ris() {
		return r47_rwa_unsec_expo_cre_ris;
	}
	public void setR47_rwa_unsec_expo_cre_ris(BigDecimal r47_rwa_unsec_expo_cre_ris) {
		this.r47_rwa_unsec_expo_cre_ris = r47_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR47_rwa_unsec_expo() {
		return r47_rwa_unsec_expo;
	}
	public void setR47_rwa_unsec_expo(BigDecimal r47_rwa_unsec_expo) {
		this.r47_rwa_unsec_expo = r47_rwa_unsec_expo;
	}
	public BigDecimal getR47_rwa_tot_ris_wei_ass() {
		return r47_rwa_tot_ris_wei_ass;
	}
	public void setR47_rwa_tot_ris_wei_ass(BigDecimal r47_rwa_tot_ris_wei_ass) {
		this.r47_rwa_tot_ris_wei_ass = r47_rwa_tot_ris_wei_ass;
	}
	public String getR48_exposure_class() {
		return r48_exposure_class;
	}
	public void setR48_exposure_class(String r48_exposure_class) {
		this.r48_exposure_class = r48_exposure_class;
	}
	public BigDecimal getR48_expo_crm() {
		return r48_expo_crm;
	}
	public void setR48_expo_crm(BigDecimal r48_expo_crm) {
		this.r48_expo_crm = r48_expo_crm;
	}
	public BigDecimal getR48_spe_pro_expo() {
		return r48_spe_pro_expo;
	}
	public void setR48_spe_pro_expo(BigDecimal r48_spe_pro_expo) {
		this.r48_spe_pro_expo = r48_spe_pro_expo;
	}
	public BigDecimal getR48_amt_elig_sht_net() {
		return r48_amt_elig_sht_net;
	}
	public void setR48_amt_elig_sht_net(BigDecimal r48_amt_elig_sht_net) {
		this.r48_amt_elig_sht_net = r48_amt_elig_sht_net;
	}
	public BigDecimal getR48_tot_expo_net_spe() {
		return r48_tot_expo_net_spe;
	}
	public void setR48_tot_expo_net_spe(BigDecimal r48_tot_expo_net_spe) {
		this.r48_tot_expo_net_spe = r48_tot_expo_net_spe;
	}
	public BigDecimal getR48_crm_sub_elig_sub_app() {
		return r48_crm_sub_elig_sub_app;
	}
	public void setR48_crm_sub_elig_sub_app(BigDecimal r48_crm_sub_elig_sub_app) {
		this.r48_crm_sub_elig_sub_app = r48_crm_sub_elig_sub_app;
	}
	public BigDecimal getR48_crm_sub_non_col_guar() {
		return r48_crm_sub_non_col_guar;
	}
	public void setR48_crm_sub_non_col_guar(BigDecimal r48_crm_sub_non_col_guar) {
		this.r48_crm_sub_non_col_guar = r48_crm_sub_non_col_guar;
	}
	public BigDecimal getR48_crm_sub_non_col_cre_der() {
		return r48_crm_sub_non_col_cre_der;
	}
	public void setR48_crm_sub_non_col_cre_der(BigDecimal r48_crm_sub_non_col_cre_der) {
		this.r48_crm_sub_non_col_cre_der = r48_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR48_crm_sub_col_elig_cash() {
		return r48_crm_sub_col_elig_cash;
	}
	public void setR48_crm_sub_col_elig_cash(BigDecimal r48_crm_sub_col_elig_cash) {
		this.r48_crm_sub_col_elig_cash = r48_crm_sub_col_elig_cash;
	}
	public BigDecimal getR48_crm_sub_col_elig_trea_bills() {
		return r48_crm_sub_col_elig_trea_bills;
	}
	public void setR48_crm_sub_col_elig_trea_bills(BigDecimal r48_crm_sub_col_elig_trea_bills) {
		this.r48_crm_sub_col_elig_trea_bills = r48_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR48_crm_sub_col_elig_deb_sec() {
		return r48_crm_sub_col_elig_deb_sec;
	}
	public void setR48_crm_sub_col_elig_deb_sec(BigDecimal r48_crm_sub_col_elig_deb_sec) {
		this.r48_crm_sub_col_elig_deb_sec = r48_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR48_crm_sub_col_elig_equi() {
		return r48_crm_sub_col_elig_equi;
	}
	public void setR48_crm_sub_col_elig_equi(BigDecimal r48_crm_sub_col_elig_equi) {
		this.r48_crm_sub_col_elig_equi = r48_crm_sub_col_elig_equi;
	}
	public BigDecimal getR48_crm_sub_col_elig_unit_tru() {
		return r48_crm_sub_col_elig_unit_tru;
	}
	public void setR48_crm_sub_col_elig_unit_tru(BigDecimal r48_crm_sub_col_elig_unit_tru) {
		this.r48_crm_sub_col_elig_unit_tru = r48_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR48_crm_sub_col_exp_cov() {
		return r48_crm_sub_col_exp_cov;
	}
	public void setR48_crm_sub_col_exp_cov(BigDecimal r48_crm_sub_col_exp_cov) {
		this.r48_crm_sub_col_exp_cov = r48_crm_sub_col_exp_cov;
	}
	public BigDecimal getR48_crm_sub_col_elig_exp_not_cov() {
		return r48_crm_sub_col_elig_exp_not_cov;
	}
	public void setR48_crm_sub_col_elig_exp_not_cov(BigDecimal r48_crm_sub_col_elig_exp_not_cov) {
		this.r48_crm_sub_col_elig_exp_not_cov = r48_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR48_crm_sub_rwa_ris_crm() {
		return r48_crm_sub_rwa_ris_crm;
	}
	public void setR48_crm_sub_rwa_ris_crm(BigDecimal r48_crm_sub_rwa_ris_crm) {
		this.r48_crm_sub_rwa_ris_crm = r48_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR48_crm_sub_rwa_cov_crm() {
		return r48_crm_sub_rwa_cov_crm;
	}
	public void setR48_crm_sub_rwa_cov_crm(BigDecimal r48_crm_sub_rwa_cov_crm) {
		this.r48_crm_sub_rwa_cov_crm = r48_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR48_crm_sub_rwa_org_cou() {
		return r48_crm_sub_rwa_org_cou;
	}
	public void setR48_crm_sub_rwa_org_cou(BigDecimal r48_crm_sub_rwa_org_cou) {
		this.r48_crm_sub_rwa_org_cou = r48_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR48_crm_sub_rwa_not_cov_crm() {
		return r48_crm_sub_rwa_not_cov_crm;
	}
	public void setR48_crm_sub_rwa_not_cov_crm(BigDecimal r48_crm_sub_rwa_not_cov_crm) {
		this.r48_crm_sub_rwa_not_cov_crm = r48_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR48_crm_comp_col_expo_elig() {
		return r48_crm_comp_col_expo_elig;
	}
	public void setR48_crm_comp_col_expo_elig(BigDecimal r48_crm_comp_col_expo_elig) {
		this.r48_crm_comp_col_expo_elig = r48_crm_comp_col_expo_elig;
	}
	public BigDecimal getR48_crm_comp_col_elig_expo_vol_adj() {
		return r48_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR48_crm_comp_col_elig_expo_vol_adj(BigDecimal r48_crm_comp_col_elig_expo_vol_adj) {
		this.r48_crm_comp_col_elig_expo_vol_adj = r48_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR48_crm_comp_col_elig_fin_hai() {
		return r48_crm_comp_col_elig_fin_hai;
	}
	public void setR48_crm_comp_col_elig_fin_hai(BigDecimal r48_crm_comp_col_elig_fin_hai) {
		this.r48_crm_comp_col_elig_fin_hai = r48_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR48_crm_comp_col_expo_val() {
		return r48_crm_comp_col_expo_val;
	}
	public void setR48_crm_comp_col_expo_val(BigDecimal r48_crm_comp_col_expo_val) {
		this.r48_crm_comp_col_expo_val = r48_crm_comp_col_expo_val;
	}
	public BigDecimal getR48_rwa_elig_expo_not_cov_crm() {
		return r48_rwa_elig_expo_not_cov_crm;
	}
	public void setR48_rwa_elig_expo_not_cov_crm(BigDecimal r48_rwa_elig_expo_not_cov_crm) {
		this.r48_rwa_elig_expo_not_cov_crm = r48_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR48_rwa_unsec_expo_cre_ris() {
		return r48_rwa_unsec_expo_cre_ris;
	}
	public void setR48_rwa_unsec_expo_cre_ris(BigDecimal r48_rwa_unsec_expo_cre_ris) {
		this.r48_rwa_unsec_expo_cre_ris = r48_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR48_rwa_unsec_expo() {
		return r48_rwa_unsec_expo;
	}
	public void setR48_rwa_unsec_expo(BigDecimal r48_rwa_unsec_expo) {
		this.r48_rwa_unsec_expo = r48_rwa_unsec_expo;
	}
	public BigDecimal getR48_rwa_tot_ris_wei_ass() {
		return r48_rwa_tot_ris_wei_ass;
	}
	public void setR48_rwa_tot_ris_wei_ass(BigDecimal r48_rwa_tot_ris_wei_ass) {
		this.r48_rwa_tot_ris_wei_ass = r48_rwa_tot_ris_wei_ass;
	}
	public String getR49_exposure_class() {
		return r49_exposure_class;
	}
	public void setR49_exposure_class(String r49_exposure_class) {
		this.r49_exposure_class = r49_exposure_class;
	}
	public BigDecimal getR49_expo_crm() {
		return r49_expo_crm;
	}
	public void setR49_expo_crm(BigDecimal r49_expo_crm) {
		this.r49_expo_crm = r49_expo_crm;
	}
	public BigDecimal getR49_spe_pro_expo() {
		return r49_spe_pro_expo;
	}
	public void setR49_spe_pro_expo(BigDecimal r49_spe_pro_expo) {
		this.r49_spe_pro_expo = r49_spe_pro_expo;
	}
	public BigDecimal getR49_amt_elig_sht_net() {
		return r49_amt_elig_sht_net;
	}
	public void setR49_amt_elig_sht_net(BigDecimal r49_amt_elig_sht_net) {
		this.r49_amt_elig_sht_net = r49_amt_elig_sht_net;
	}
	public BigDecimal getR49_tot_expo_net_spe() {
		return r49_tot_expo_net_spe;
	}
	public void setR49_tot_expo_net_spe(BigDecimal r49_tot_expo_net_spe) {
		this.r49_tot_expo_net_spe = r49_tot_expo_net_spe;
	}
	public BigDecimal getR49_crm_sub_elig_sub_app() {
		return r49_crm_sub_elig_sub_app;
	}
	public void setR49_crm_sub_elig_sub_app(BigDecimal r49_crm_sub_elig_sub_app) {
		this.r49_crm_sub_elig_sub_app = r49_crm_sub_elig_sub_app;
	}
	public BigDecimal getR49_crm_sub_non_col_guar() {
		return r49_crm_sub_non_col_guar;
	}
	public void setR49_crm_sub_non_col_guar(BigDecimal r49_crm_sub_non_col_guar) {
		this.r49_crm_sub_non_col_guar = r49_crm_sub_non_col_guar;
	}
	public BigDecimal getR49_crm_sub_non_col_cre_der() {
		return r49_crm_sub_non_col_cre_der;
	}
	public void setR49_crm_sub_non_col_cre_der(BigDecimal r49_crm_sub_non_col_cre_der) {
		this.r49_crm_sub_non_col_cre_der = r49_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR49_crm_sub_col_elig_cash() {
		return r49_crm_sub_col_elig_cash;
	}
	public void setR49_crm_sub_col_elig_cash(BigDecimal r49_crm_sub_col_elig_cash) {
		this.r49_crm_sub_col_elig_cash = r49_crm_sub_col_elig_cash;
	}
	public BigDecimal getR49_crm_sub_col_elig_trea_bills() {
		return r49_crm_sub_col_elig_trea_bills;
	}
	public void setR49_crm_sub_col_elig_trea_bills(BigDecimal r49_crm_sub_col_elig_trea_bills) {
		this.r49_crm_sub_col_elig_trea_bills = r49_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR49_crm_sub_col_elig_deb_sec() {
		return r49_crm_sub_col_elig_deb_sec;
	}
	public void setR49_crm_sub_col_elig_deb_sec(BigDecimal r49_crm_sub_col_elig_deb_sec) {
		this.r49_crm_sub_col_elig_deb_sec = r49_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR49_crm_sub_col_elig_equi() {
		return r49_crm_sub_col_elig_equi;
	}
	public void setR49_crm_sub_col_elig_equi(BigDecimal r49_crm_sub_col_elig_equi) {
		this.r49_crm_sub_col_elig_equi = r49_crm_sub_col_elig_equi;
	}
	public BigDecimal getR49_crm_sub_col_elig_unit_tru() {
		return r49_crm_sub_col_elig_unit_tru;
	}
	public void setR49_crm_sub_col_elig_unit_tru(BigDecimal r49_crm_sub_col_elig_unit_tru) {
		this.r49_crm_sub_col_elig_unit_tru = r49_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR49_crm_sub_col_exp_cov() {
		return r49_crm_sub_col_exp_cov;
	}
	public void setR49_crm_sub_col_exp_cov(BigDecimal r49_crm_sub_col_exp_cov) {
		this.r49_crm_sub_col_exp_cov = r49_crm_sub_col_exp_cov;
	}
	public BigDecimal getR49_crm_sub_col_elig_exp_not_cov() {
		return r49_crm_sub_col_elig_exp_not_cov;
	}
	public void setR49_crm_sub_col_elig_exp_not_cov(BigDecimal r49_crm_sub_col_elig_exp_not_cov) {
		this.r49_crm_sub_col_elig_exp_not_cov = r49_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR49_crm_sub_rwa_ris_crm() {
		return r49_crm_sub_rwa_ris_crm;
	}
	public void setR49_crm_sub_rwa_ris_crm(BigDecimal r49_crm_sub_rwa_ris_crm) {
		this.r49_crm_sub_rwa_ris_crm = r49_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR49_crm_sub_rwa_cov_crm() {
		return r49_crm_sub_rwa_cov_crm;
	}
	public void setR49_crm_sub_rwa_cov_crm(BigDecimal r49_crm_sub_rwa_cov_crm) {
		this.r49_crm_sub_rwa_cov_crm = r49_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR49_crm_sub_rwa_org_cou() {
		return r49_crm_sub_rwa_org_cou;
	}
	public void setR49_crm_sub_rwa_org_cou(BigDecimal r49_crm_sub_rwa_org_cou) {
		this.r49_crm_sub_rwa_org_cou = r49_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR49_crm_sub_rwa_not_cov_crm() {
		return r49_crm_sub_rwa_not_cov_crm;
	}
	public void setR49_crm_sub_rwa_not_cov_crm(BigDecimal r49_crm_sub_rwa_not_cov_crm) {
		this.r49_crm_sub_rwa_not_cov_crm = r49_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR49_crm_comp_col_expo_elig() {
		return r49_crm_comp_col_expo_elig;
	}
	public void setR49_crm_comp_col_expo_elig(BigDecimal r49_crm_comp_col_expo_elig) {
		this.r49_crm_comp_col_expo_elig = r49_crm_comp_col_expo_elig;
	}
	public BigDecimal getR49_crm_comp_col_elig_expo_vol_adj() {
		return r49_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR49_crm_comp_col_elig_expo_vol_adj(BigDecimal r49_crm_comp_col_elig_expo_vol_adj) {
		this.r49_crm_comp_col_elig_expo_vol_adj = r49_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR49_crm_comp_col_elig_fin_hai() {
		return r49_crm_comp_col_elig_fin_hai;
	}
	public void setR49_crm_comp_col_elig_fin_hai(BigDecimal r49_crm_comp_col_elig_fin_hai) {
		this.r49_crm_comp_col_elig_fin_hai = r49_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR49_crm_comp_col_expo_val() {
		return r49_crm_comp_col_expo_val;
	}
	public void setR49_crm_comp_col_expo_val(BigDecimal r49_crm_comp_col_expo_val) {
		this.r49_crm_comp_col_expo_val = r49_crm_comp_col_expo_val;
	}
	public BigDecimal getR49_rwa_elig_expo_not_cov_crm() {
		return r49_rwa_elig_expo_not_cov_crm;
	}
	public void setR49_rwa_elig_expo_not_cov_crm(BigDecimal r49_rwa_elig_expo_not_cov_crm) {
		this.r49_rwa_elig_expo_not_cov_crm = r49_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR49_rwa_unsec_expo_cre_ris() {
		return r49_rwa_unsec_expo_cre_ris;
	}
	public void setR49_rwa_unsec_expo_cre_ris(BigDecimal r49_rwa_unsec_expo_cre_ris) {
		this.r49_rwa_unsec_expo_cre_ris = r49_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR49_rwa_unsec_expo() {
		return r49_rwa_unsec_expo;
	}
	public void setR49_rwa_unsec_expo(BigDecimal r49_rwa_unsec_expo) {
		this.r49_rwa_unsec_expo = r49_rwa_unsec_expo;
	}
	public BigDecimal getR49_rwa_tot_ris_wei_ass() {
		return r49_rwa_tot_ris_wei_ass;
	}
	public void setR49_rwa_tot_ris_wei_ass(BigDecimal r49_rwa_tot_ris_wei_ass) {
		this.r49_rwa_tot_ris_wei_ass = r49_rwa_tot_ris_wei_ass;
	}
	public String getR50_exposure_class() {
		return r50_exposure_class;
	}
	public void setR50_exposure_class(String r50_exposure_class) {
		this.r50_exposure_class = r50_exposure_class;
	}
	public BigDecimal getR50_expo_crm() {
		return r50_expo_crm;
	}
	public void setR50_expo_crm(BigDecimal r50_expo_crm) {
		this.r50_expo_crm = r50_expo_crm;
	}
	public BigDecimal getR50_spe_pro_expo() {
		return r50_spe_pro_expo;
	}
	public void setR50_spe_pro_expo(BigDecimal r50_spe_pro_expo) {
		this.r50_spe_pro_expo = r50_spe_pro_expo;
	}
	public BigDecimal getR50_amt_elig_sht_net() {
		return r50_amt_elig_sht_net;
	}
	public void setR50_amt_elig_sht_net(BigDecimal r50_amt_elig_sht_net) {
		this.r50_amt_elig_sht_net = r50_amt_elig_sht_net;
	}
	public BigDecimal getR50_tot_expo_net_spe() {
		return r50_tot_expo_net_spe;
	}
	public void setR50_tot_expo_net_spe(BigDecimal r50_tot_expo_net_spe) {
		this.r50_tot_expo_net_spe = r50_tot_expo_net_spe;
	}
	public BigDecimal getR50_crm_sub_elig_sub_app() {
		return r50_crm_sub_elig_sub_app;
	}
	public void setR50_crm_sub_elig_sub_app(BigDecimal r50_crm_sub_elig_sub_app) {
		this.r50_crm_sub_elig_sub_app = r50_crm_sub_elig_sub_app;
	}
	public BigDecimal getR50_crm_sub_non_col_guar() {
		return r50_crm_sub_non_col_guar;
	}
	public void setR50_crm_sub_non_col_guar(BigDecimal r50_crm_sub_non_col_guar) {
		this.r50_crm_sub_non_col_guar = r50_crm_sub_non_col_guar;
	}
	public BigDecimal getR50_crm_sub_non_col_cre_der() {
		return r50_crm_sub_non_col_cre_der;
	}
	public void setR50_crm_sub_non_col_cre_der(BigDecimal r50_crm_sub_non_col_cre_der) {
		this.r50_crm_sub_non_col_cre_der = r50_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR50_crm_sub_col_elig_cash() {
		return r50_crm_sub_col_elig_cash;
	}
	public void setR50_crm_sub_col_elig_cash(BigDecimal r50_crm_sub_col_elig_cash) {
		this.r50_crm_sub_col_elig_cash = r50_crm_sub_col_elig_cash;
	}
	public BigDecimal getR50_crm_sub_col_elig_trea_bills() {
		return r50_crm_sub_col_elig_trea_bills;
	}
	public void setR50_crm_sub_col_elig_trea_bills(BigDecimal r50_crm_sub_col_elig_trea_bills) {
		this.r50_crm_sub_col_elig_trea_bills = r50_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR50_crm_sub_col_elig_deb_sec() {
		return r50_crm_sub_col_elig_deb_sec;
	}
	public void setR50_crm_sub_col_elig_deb_sec(BigDecimal r50_crm_sub_col_elig_deb_sec) {
		this.r50_crm_sub_col_elig_deb_sec = r50_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR50_crm_sub_col_elig_equi() {
		return r50_crm_sub_col_elig_equi;
	}
	public void setR50_crm_sub_col_elig_equi(BigDecimal r50_crm_sub_col_elig_equi) {
		this.r50_crm_sub_col_elig_equi = r50_crm_sub_col_elig_equi;
	}
	public BigDecimal getR50_crm_sub_col_elig_unit_tru() {
		return r50_crm_sub_col_elig_unit_tru;
	}
	public void setR50_crm_sub_col_elig_unit_tru(BigDecimal r50_crm_sub_col_elig_unit_tru) {
		this.r50_crm_sub_col_elig_unit_tru = r50_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR50_crm_sub_col_exp_cov() {
		return r50_crm_sub_col_exp_cov;
	}
	public void setR50_crm_sub_col_exp_cov(BigDecimal r50_crm_sub_col_exp_cov) {
		this.r50_crm_sub_col_exp_cov = r50_crm_sub_col_exp_cov;
	}
	public BigDecimal getR50_crm_sub_col_elig_exp_not_cov() {
		return r50_crm_sub_col_elig_exp_not_cov;
	}
	public void setR50_crm_sub_col_elig_exp_not_cov(BigDecimal r50_crm_sub_col_elig_exp_not_cov) {
		this.r50_crm_sub_col_elig_exp_not_cov = r50_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR50_crm_sub_rwa_ris_crm() {
		return r50_crm_sub_rwa_ris_crm;
	}
	public void setR50_crm_sub_rwa_ris_crm(BigDecimal r50_crm_sub_rwa_ris_crm) {
		this.r50_crm_sub_rwa_ris_crm = r50_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR50_crm_sub_rwa_cov_crm() {
		return r50_crm_sub_rwa_cov_crm;
	}
	public void setR50_crm_sub_rwa_cov_crm(BigDecimal r50_crm_sub_rwa_cov_crm) {
		this.r50_crm_sub_rwa_cov_crm = r50_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR50_crm_sub_rwa_org_cou() {
		return r50_crm_sub_rwa_org_cou;
	}
	public void setR50_crm_sub_rwa_org_cou(BigDecimal r50_crm_sub_rwa_org_cou) {
		this.r50_crm_sub_rwa_org_cou = r50_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR50_crm_sub_rwa_not_cov_crm() {
		return r50_crm_sub_rwa_not_cov_crm;
	}
	public void setR50_crm_sub_rwa_not_cov_crm(BigDecimal r50_crm_sub_rwa_not_cov_crm) {
		this.r50_crm_sub_rwa_not_cov_crm = r50_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR50_crm_comp_col_expo_elig() {
		return r50_crm_comp_col_expo_elig;
	}
	public void setR50_crm_comp_col_expo_elig(BigDecimal r50_crm_comp_col_expo_elig) {
		this.r50_crm_comp_col_expo_elig = r50_crm_comp_col_expo_elig;
	}
	public BigDecimal getR50_crm_comp_col_elig_expo_vol_adj() {
		return r50_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR50_crm_comp_col_elig_expo_vol_adj(BigDecimal r50_crm_comp_col_elig_expo_vol_adj) {
		this.r50_crm_comp_col_elig_expo_vol_adj = r50_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR50_crm_comp_col_elig_fin_hai() {
		return r50_crm_comp_col_elig_fin_hai;
	}
	public void setR50_crm_comp_col_elig_fin_hai(BigDecimal r50_crm_comp_col_elig_fin_hai) {
		this.r50_crm_comp_col_elig_fin_hai = r50_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR50_crm_comp_col_expo_val() {
		return r50_crm_comp_col_expo_val;
	}
	public void setR50_crm_comp_col_expo_val(BigDecimal r50_crm_comp_col_expo_val) {
		this.r50_crm_comp_col_expo_val = r50_crm_comp_col_expo_val;
	}
	public BigDecimal getR50_rwa_elig_expo_not_cov_crm() {
		return r50_rwa_elig_expo_not_cov_crm;
	}
	public void setR50_rwa_elig_expo_not_cov_crm(BigDecimal r50_rwa_elig_expo_not_cov_crm) {
		this.r50_rwa_elig_expo_not_cov_crm = r50_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR50_rwa_unsec_expo_cre_ris() {
		return r50_rwa_unsec_expo_cre_ris;
	}
	public void setR50_rwa_unsec_expo_cre_ris(BigDecimal r50_rwa_unsec_expo_cre_ris) {
		this.r50_rwa_unsec_expo_cre_ris = r50_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR50_rwa_unsec_expo() {
		return r50_rwa_unsec_expo;
	}
	public void setR50_rwa_unsec_expo(BigDecimal r50_rwa_unsec_expo) {
		this.r50_rwa_unsec_expo = r50_rwa_unsec_expo;
	}
	public BigDecimal getR50_rwa_tot_ris_wei_ass() {
		return r50_rwa_tot_ris_wei_ass;
	}
	public void setR50_rwa_tot_ris_wei_ass(BigDecimal r50_rwa_tot_ris_wei_ass) {
		this.r50_rwa_tot_ris_wei_ass = r50_rwa_tot_ris_wei_ass;
	}
	public String getR51_exposure_class() {
		return r51_exposure_class;
	}
	public void setR51_exposure_class(String r51_exposure_class) {
		this.r51_exposure_class = r51_exposure_class;
	}
	public BigDecimal getR51_expo_crm() {
		return r51_expo_crm;
	}
	public void setR51_expo_crm(BigDecimal r51_expo_crm) {
		this.r51_expo_crm = r51_expo_crm;
	}
	public BigDecimal getR51_spe_pro_expo() {
		return r51_spe_pro_expo;
	}
	public void setR51_spe_pro_expo(BigDecimal r51_spe_pro_expo) {
		this.r51_spe_pro_expo = r51_spe_pro_expo;
	}
	public BigDecimal getR51_amt_elig_sht_net() {
		return r51_amt_elig_sht_net;
	}
	public void setR51_amt_elig_sht_net(BigDecimal r51_amt_elig_sht_net) {
		this.r51_amt_elig_sht_net = r51_amt_elig_sht_net;
	}
	public BigDecimal getR51_tot_expo_net_spe() {
		return r51_tot_expo_net_spe;
	}
	public void setR51_tot_expo_net_spe(BigDecimal r51_tot_expo_net_spe) {
		this.r51_tot_expo_net_spe = r51_tot_expo_net_spe;
	}
	public BigDecimal getR51_crm_sub_elig_sub_app() {
		return r51_crm_sub_elig_sub_app;
	}
	public void setR51_crm_sub_elig_sub_app(BigDecimal r51_crm_sub_elig_sub_app) {
		this.r51_crm_sub_elig_sub_app = r51_crm_sub_elig_sub_app;
	}
	public BigDecimal getR51_crm_sub_non_col_guar() {
		return r51_crm_sub_non_col_guar;
	}
	public void setR51_crm_sub_non_col_guar(BigDecimal r51_crm_sub_non_col_guar) {
		this.r51_crm_sub_non_col_guar = r51_crm_sub_non_col_guar;
	}
	public BigDecimal getR51_crm_sub_non_col_cre_der() {
		return r51_crm_sub_non_col_cre_der;
	}
	public void setR51_crm_sub_non_col_cre_der(BigDecimal r51_crm_sub_non_col_cre_der) {
		this.r51_crm_sub_non_col_cre_der = r51_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR51_crm_sub_col_elig_cash() {
		return r51_crm_sub_col_elig_cash;
	}
	public void setR51_crm_sub_col_elig_cash(BigDecimal r51_crm_sub_col_elig_cash) {
		this.r51_crm_sub_col_elig_cash = r51_crm_sub_col_elig_cash;
	}
	public BigDecimal getR51_crm_sub_col_elig_trea_bills() {
		return r51_crm_sub_col_elig_trea_bills;
	}
	public void setR51_crm_sub_col_elig_trea_bills(BigDecimal r51_crm_sub_col_elig_trea_bills) {
		this.r51_crm_sub_col_elig_trea_bills = r51_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR51_crm_sub_col_elig_deb_sec() {
		return r51_crm_sub_col_elig_deb_sec;
	}
	public void setR51_crm_sub_col_elig_deb_sec(BigDecimal r51_crm_sub_col_elig_deb_sec) {
		this.r51_crm_sub_col_elig_deb_sec = r51_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR51_crm_sub_col_elig_equi() {
		return r51_crm_sub_col_elig_equi;
	}
	public void setR51_crm_sub_col_elig_equi(BigDecimal r51_crm_sub_col_elig_equi) {
		this.r51_crm_sub_col_elig_equi = r51_crm_sub_col_elig_equi;
	}
	public BigDecimal getR51_crm_sub_col_elig_unit_tru() {
		return r51_crm_sub_col_elig_unit_tru;
	}
	public void setR51_crm_sub_col_elig_unit_tru(BigDecimal r51_crm_sub_col_elig_unit_tru) {
		this.r51_crm_sub_col_elig_unit_tru = r51_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR51_crm_sub_col_exp_cov() {
		return r51_crm_sub_col_exp_cov;
	}
	public void setR51_crm_sub_col_exp_cov(BigDecimal r51_crm_sub_col_exp_cov) {
		this.r51_crm_sub_col_exp_cov = r51_crm_sub_col_exp_cov;
	}
	public BigDecimal getR51_crm_sub_col_elig_exp_not_cov() {
		return r51_crm_sub_col_elig_exp_not_cov;
	}
	public void setR51_crm_sub_col_elig_exp_not_cov(BigDecimal r51_crm_sub_col_elig_exp_not_cov) {
		this.r51_crm_sub_col_elig_exp_not_cov = r51_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR51_crm_sub_rwa_ris_crm() {
		return r51_crm_sub_rwa_ris_crm;
	}
	public void setR51_crm_sub_rwa_ris_crm(BigDecimal r51_crm_sub_rwa_ris_crm) {
		this.r51_crm_sub_rwa_ris_crm = r51_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR51_crm_sub_rwa_cov_crm() {
		return r51_crm_sub_rwa_cov_crm;
	}
	public void setR51_crm_sub_rwa_cov_crm(BigDecimal r51_crm_sub_rwa_cov_crm) {
		this.r51_crm_sub_rwa_cov_crm = r51_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR51_crm_sub_rwa_org_cou() {
		return r51_crm_sub_rwa_org_cou;
	}
	public void setR51_crm_sub_rwa_org_cou(BigDecimal r51_crm_sub_rwa_org_cou) {
		this.r51_crm_sub_rwa_org_cou = r51_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR51_crm_sub_rwa_not_cov_crm() {
		return r51_crm_sub_rwa_not_cov_crm;
	}
	public void setR51_crm_sub_rwa_not_cov_crm(BigDecimal r51_crm_sub_rwa_not_cov_crm) {
		this.r51_crm_sub_rwa_not_cov_crm = r51_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR51_crm_comp_col_expo_elig() {
		return r51_crm_comp_col_expo_elig;
	}
	public void setR51_crm_comp_col_expo_elig(BigDecimal r51_crm_comp_col_expo_elig) {
		this.r51_crm_comp_col_expo_elig = r51_crm_comp_col_expo_elig;
	}
	public BigDecimal getR51_crm_comp_col_elig_expo_vol_adj() {
		return r51_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR51_crm_comp_col_elig_expo_vol_adj(BigDecimal r51_crm_comp_col_elig_expo_vol_adj) {
		this.r51_crm_comp_col_elig_expo_vol_adj = r51_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR51_crm_comp_col_elig_fin_hai() {
		return r51_crm_comp_col_elig_fin_hai;
	}
	public void setR51_crm_comp_col_elig_fin_hai(BigDecimal r51_crm_comp_col_elig_fin_hai) {
		this.r51_crm_comp_col_elig_fin_hai = r51_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR51_crm_comp_col_expo_val() {
		return r51_crm_comp_col_expo_val;
	}
	public void setR51_crm_comp_col_expo_val(BigDecimal r51_crm_comp_col_expo_val) {
		this.r51_crm_comp_col_expo_val = r51_crm_comp_col_expo_val;
	}
	public BigDecimal getR51_rwa_elig_expo_not_cov_crm() {
		return r51_rwa_elig_expo_not_cov_crm;
	}
	public void setR51_rwa_elig_expo_not_cov_crm(BigDecimal r51_rwa_elig_expo_not_cov_crm) {
		this.r51_rwa_elig_expo_not_cov_crm = r51_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR51_rwa_unsec_expo_cre_ris() {
		return r51_rwa_unsec_expo_cre_ris;
	}
	public void setR51_rwa_unsec_expo_cre_ris(BigDecimal r51_rwa_unsec_expo_cre_ris) {
		this.r51_rwa_unsec_expo_cre_ris = r51_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR51_rwa_unsec_expo() {
		return r51_rwa_unsec_expo;
	}
	public void setR51_rwa_unsec_expo(BigDecimal r51_rwa_unsec_expo) {
		this.r51_rwa_unsec_expo = r51_rwa_unsec_expo;
	}
	public BigDecimal getR51_rwa_tot_ris_wei_ass() {
		return r51_rwa_tot_ris_wei_ass;
	}
	public void setR51_rwa_tot_ris_wei_ass(BigDecimal r51_rwa_tot_ris_wei_ass) {
		this.r51_rwa_tot_ris_wei_ass = r51_rwa_tot_ris_wei_ass;
	}
	public String getR52_exposure_class() {
		return r52_exposure_class;
	}
	public void setR52_exposure_class(String r52_exposure_class) {
		this.r52_exposure_class = r52_exposure_class;
	}
	public BigDecimal getR52_expo_crm() {
		return r52_expo_crm;
	}
	public void setR52_expo_crm(BigDecimal r52_expo_crm) {
		this.r52_expo_crm = r52_expo_crm;
	}
	public BigDecimal getR52_spe_pro_expo() {
		return r52_spe_pro_expo;
	}
	public void setR52_spe_pro_expo(BigDecimal r52_spe_pro_expo) {
		this.r52_spe_pro_expo = r52_spe_pro_expo;
	}
	public BigDecimal getR52_amt_elig_sht_net() {
		return r52_amt_elig_sht_net;
	}
	public void setR52_amt_elig_sht_net(BigDecimal r52_amt_elig_sht_net) {
		this.r52_amt_elig_sht_net = r52_amt_elig_sht_net;
	}
	public BigDecimal getR52_tot_expo_net_spe() {
		return r52_tot_expo_net_spe;
	}
	public void setR52_tot_expo_net_spe(BigDecimal r52_tot_expo_net_spe) {
		this.r52_tot_expo_net_spe = r52_tot_expo_net_spe;
	}
	public BigDecimal getR52_crm_sub_elig_sub_app() {
		return r52_crm_sub_elig_sub_app;
	}
	public void setR52_crm_sub_elig_sub_app(BigDecimal r52_crm_sub_elig_sub_app) {
		this.r52_crm_sub_elig_sub_app = r52_crm_sub_elig_sub_app;
	}
	public BigDecimal getR52_crm_sub_non_col_guar() {
		return r52_crm_sub_non_col_guar;
	}
	public void setR52_crm_sub_non_col_guar(BigDecimal r52_crm_sub_non_col_guar) {
		this.r52_crm_sub_non_col_guar = r52_crm_sub_non_col_guar;
	}
	public BigDecimal getR52_crm_sub_non_col_cre_der() {
		return r52_crm_sub_non_col_cre_der;
	}
	public void setR52_crm_sub_non_col_cre_der(BigDecimal r52_crm_sub_non_col_cre_der) {
		this.r52_crm_sub_non_col_cre_der = r52_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR52_crm_sub_col_elig_cash() {
		return r52_crm_sub_col_elig_cash;
	}
	public void setR52_crm_sub_col_elig_cash(BigDecimal r52_crm_sub_col_elig_cash) {
		this.r52_crm_sub_col_elig_cash = r52_crm_sub_col_elig_cash;
	}
	public BigDecimal getR52_crm_sub_col_elig_trea_bills() {
		return r52_crm_sub_col_elig_trea_bills;
	}
	public void setR52_crm_sub_col_elig_trea_bills(BigDecimal r52_crm_sub_col_elig_trea_bills) {
		this.r52_crm_sub_col_elig_trea_bills = r52_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR52_crm_sub_col_elig_deb_sec() {
		return r52_crm_sub_col_elig_deb_sec;
	}
	public void setR52_crm_sub_col_elig_deb_sec(BigDecimal r52_crm_sub_col_elig_deb_sec) {
		this.r52_crm_sub_col_elig_deb_sec = r52_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR52_crm_sub_col_elig_equi() {
		return r52_crm_sub_col_elig_equi;
	}
	public void setR52_crm_sub_col_elig_equi(BigDecimal r52_crm_sub_col_elig_equi) {
		this.r52_crm_sub_col_elig_equi = r52_crm_sub_col_elig_equi;
	}
	public BigDecimal getR52_crm_sub_col_elig_unit_tru() {
		return r52_crm_sub_col_elig_unit_tru;
	}
	public void setR52_crm_sub_col_elig_unit_tru(BigDecimal r52_crm_sub_col_elig_unit_tru) {
		this.r52_crm_sub_col_elig_unit_tru = r52_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR52_crm_sub_col_exp_cov() {
		return r52_crm_sub_col_exp_cov;
	}
	public void setR52_crm_sub_col_exp_cov(BigDecimal r52_crm_sub_col_exp_cov) {
		this.r52_crm_sub_col_exp_cov = r52_crm_sub_col_exp_cov;
	}
	public BigDecimal getR52_crm_sub_col_elig_exp_not_cov() {
		return r52_crm_sub_col_elig_exp_not_cov;
	}
	public void setR52_crm_sub_col_elig_exp_not_cov(BigDecimal r52_crm_sub_col_elig_exp_not_cov) {
		this.r52_crm_sub_col_elig_exp_not_cov = r52_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR52_crm_sub_rwa_ris_crm() {
		return r52_crm_sub_rwa_ris_crm;
	}
	public void setR52_crm_sub_rwa_ris_crm(BigDecimal r52_crm_sub_rwa_ris_crm) {
		this.r52_crm_sub_rwa_ris_crm = r52_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR52_crm_sub_rwa_cov_crm() {
		return r52_crm_sub_rwa_cov_crm;
	}
	public void setR52_crm_sub_rwa_cov_crm(BigDecimal r52_crm_sub_rwa_cov_crm) {
		this.r52_crm_sub_rwa_cov_crm = r52_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR52_crm_sub_rwa_org_cou() {
		return r52_crm_sub_rwa_org_cou;
	}
	public void setR52_crm_sub_rwa_org_cou(BigDecimal r52_crm_sub_rwa_org_cou) {
		this.r52_crm_sub_rwa_org_cou = r52_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR52_crm_sub_rwa_not_cov_crm() {
		return r52_crm_sub_rwa_not_cov_crm;
	}
	public void setR52_crm_sub_rwa_not_cov_crm(BigDecimal r52_crm_sub_rwa_not_cov_crm) {
		this.r52_crm_sub_rwa_not_cov_crm = r52_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR52_crm_comp_col_expo_elig() {
		return r52_crm_comp_col_expo_elig;
	}
	public void setR52_crm_comp_col_expo_elig(BigDecimal r52_crm_comp_col_expo_elig) {
		this.r52_crm_comp_col_expo_elig = r52_crm_comp_col_expo_elig;
	}
	public BigDecimal getR52_crm_comp_col_elig_expo_vol_adj() {
		return r52_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR52_crm_comp_col_elig_expo_vol_adj(BigDecimal r52_crm_comp_col_elig_expo_vol_adj) {
		this.r52_crm_comp_col_elig_expo_vol_adj = r52_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR52_crm_comp_col_elig_fin_hai() {
		return r52_crm_comp_col_elig_fin_hai;
	}
	public void setR52_crm_comp_col_elig_fin_hai(BigDecimal r52_crm_comp_col_elig_fin_hai) {
		this.r52_crm_comp_col_elig_fin_hai = r52_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR52_crm_comp_col_expo_val() {
		return r52_crm_comp_col_expo_val;
	}
	public void setR52_crm_comp_col_expo_val(BigDecimal r52_crm_comp_col_expo_val) {
		this.r52_crm_comp_col_expo_val = r52_crm_comp_col_expo_val;
	}
	public BigDecimal getR52_rwa_elig_expo_not_cov_crm() {
		return r52_rwa_elig_expo_not_cov_crm;
	}
	public void setR52_rwa_elig_expo_not_cov_crm(BigDecimal r52_rwa_elig_expo_not_cov_crm) {
		this.r52_rwa_elig_expo_not_cov_crm = r52_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR52_rwa_unsec_expo_cre_ris() {
		return r52_rwa_unsec_expo_cre_ris;
	}
	public void setR52_rwa_unsec_expo_cre_ris(BigDecimal r52_rwa_unsec_expo_cre_ris) {
		this.r52_rwa_unsec_expo_cre_ris = r52_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR52_rwa_unsec_expo() {
		return r52_rwa_unsec_expo;
	}
	public void setR52_rwa_unsec_expo(BigDecimal r52_rwa_unsec_expo) {
		this.r52_rwa_unsec_expo = r52_rwa_unsec_expo;
	}
	public BigDecimal getR52_rwa_tot_ris_wei_ass() {
		return r52_rwa_tot_ris_wei_ass;
	}
	public void setR52_rwa_tot_ris_wei_ass(BigDecimal r52_rwa_tot_ris_wei_ass) {
		this.r52_rwa_tot_ris_wei_ass = r52_rwa_tot_ris_wei_ass;
	}
	public String getR53_exposure_class() {
		return r53_exposure_class;
	}
	public void setR53_exposure_class(String r53_exposure_class) {
		this.r53_exposure_class = r53_exposure_class;
	}
	public BigDecimal getR53_expo_crm() {
		return r53_expo_crm;
	}
	public void setR53_expo_crm(BigDecimal r53_expo_crm) {
		this.r53_expo_crm = r53_expo_crm;
	}
	public BigDecimal getR53_spe_pro_expo() {
		return r53_spe_pro_expo;
	}
	public void setR53_spe_pro_expo(BigDecimal r53_spe_pro_expo) {
		this.r53_spe_pro_expo = r53_spe_pro_expo;
	}
	public BigDecimal getR53_amt_elig_sht_net() {
		return r53_amt_elig_sht_net;
	}
	public void setR53_amt_elig_sht_net(BigDecimal r53_amt_elig_sht_net) {
		this.r53_amt_elig_sht_net = r53_amt_elig_sht_net;
	}
	public BigDecimal getR53_tot_expo_net_spe() {
		return r53_tot_expo_net_spe;
	}
	public void setR53_tot_expo_net_spe(BigDecimal r53_tot_expo_net_spe) {
		this.r53_tot_expo_net_spe = r53_tot_expo_net_spe;
	}
	public BigDecimal getR53_crm_sub_elig_sub_app() {
		return r53_crm_sub_elig_sub_app;
	}
	public void setR53_crm_sub_elig_sub_app(BigDecimal r53_crm_sub_elig_sub_app) {
		this.r53_crm_sub_elig_sub_app = r53_crm_sub_elig_sub_app;
	}
	public BigDecimal getR53_crm_sub_non_col_guar() {
		return r53_crm_sub_non_col_guar;
	}
	public void setR53_crm_sub_non_col_guar(BigDecimal r53_crm_sub_non_col_guar) {
		this.r53_crm_sub_non_col_guar = r53_crm_sub_non_col_guar;
	}
	public BigDecimal getR53_crm_sub_non_col_cre_der() {
		return r53_crm_sub_non_col_cre_der;
	}
	public void setR53_crm_sub_non_col_cre_der(BigDecimal r53_crm_sub_non_col_cre_der) {
		this.r53_crm_sub_non_col_cre_der = r53_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR53_crm_sub_col_elig_cash() {
		return r53_crm_sub_col_elig_cash;
	}
	public void setR53_crm_sub_col_elig_cash(BigDecimal r53_crm_sub_col_elig_cash) {
		this.r53_crm_sub_col_elig_cash = r53_crm_sub_col_elig_cash;
	}
	public BigDecimal getR53_crm_sub_col_elig_trea_bills() {
		return r53_crm_sub_col_elig_trea_bills;
	}
	public void setR53_crm_sub_col_elig_trea_bills(BigDecimal r53_crm_sub_col_elig_trea_bills) {
		this.r53_crm_sub_col_elig_trea_bills = r53_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR53_crm_sub_col_elig_deb_sec() {
		return r53_crm_sub_col_elig_deb_sec;
	}
	public void setR53_crm_sub_col_elig_deb_sec(BigDecimal r53_crm_sub_col_elig_deb_sec) {
		this.r53_crm_sub_col_elig_deb_sec = r53_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR53_crm_sub_col_elig_equi() {
		return r53_crm_sub_col_elig_equi;
	}
	public void setR53_crm_sub_col_elig_equi(BigDecimal r53_crm_sub_col_elig_equi) {
		this.r53_crm_sub_col_elig_equi = r53_crm_sub_col_elig_equi;
	}
	public BigDecimal getR53_crm_sub_col_elig_unit_tru() {
		return r53_crm_sub_col_elig_unit_tru;
	}
	public void setR53_crm_sub_col_elig_unit_tru(BigDecimal r53_crm_sub_col_elig_unit_tru) {
		this.r53_crm_sub_col_elig_unit_tru = r53_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR53_crm_sub_col_exp_cov() {
		return r53_crm_sub_col_exp_cov;
	}
	public void setR53_crm_sub_col_exp_cov(BigDecimal r53_crm_sub_col_exp_cov) {
		this.r53_crm_sub_col_exp_cov = r53_crm_sub_col_exp_cov;
	}
	public BigDecimal getR53_crm_sub_col_elig_exp_not_cov() {
		return r53_crm_sub_col_elig_exp_not_cov;
	}
	public void setR53_crm_sub_col_elig_exp_not_cov(BigDecimal r53_crm_sub_col_elig_exp_not_cov) {
		this.r53_crm_sub_col_elig_exp_not_cov = r53_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR53_crm_sub_rwa_ris_crm() {
		return r53_crm_sub_rwa_ris_crm;
	}
	public void setR53_crm_sub_rwa_ris_crm(BigDecimal r53_crm_sub_rwa_ris_crm) {
		this.r53_crm_sub_rwa_ris_crm = r53_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR53_crm_sub_rwa_cov_crm() {
		return r53_crm_sub_rwa_cov_crm;
	}
	public void setR53_crm_sub_rwa_cov_crm(BigDecimal r53_crm_sub_rwa_cov_crm) {
		this.r53_crm_sub_rwa_cov_crm = r53_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR53_crm_sub_rwa_org_cou() {
		return r53_crm_sub_rwa_org_cou;
	}
	public void setR53_crm_sub_rwa_org_cou(BigDecimal r53_crm_sub_rwa_org_cou) {
		this.r53_crm_sub_rwa_org_cou = r53_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR53_crm_sub_rwa_not_cov_crm() {
		return r53_crm_sub_rwa_not_cov_crm;
	}
	public void setR53_crm_sub_rwa_not_cov_crm(BigDecimal r53_crm_sub_rwa_not_cov_crm) {
		this.r53_crm_sub_rwa_not_cov_crm = r53_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR53_crm_comp_col_expo_elig() {
		return r53_crm_comp_col_expo_elig;
	}
	public void setR53_crm_comp_col_expo_elig(BigDecimal r53_crm_comp_col_expo_elig) {
		this.r53_crm_comp_col_expo_elig = r53_crm_comp_col_expo_elig;
	}
	public BigDecimal getR53_crm_comp_col_elig_expo_vol_adj() {
		return r53_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR53_crm_comp_col_elig_expo_vol_adj(BigDecimal r53_crm_comp_col_elig_expo_vol_adj) {
		this.r53_crm_comp_col_elig_expo_vol_adj = r53_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR53_crm_comp_col_elig_fin_hai() {
		return r53_crm_comp_col_elig_fin_hai;
	}
	public void setR53_crm_comp_col_elig_fin_hai(BigDecimal r53_crm_comp_col_elig_fin_hai) {
		this.r53_crm_comp_col_elig_fin_hai = r53_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR53_crm_comp_col_expo_val() {
		return r53_crm_comp_col_expo_val;
	}
	public void setR53_crm_comp_col_expo_val(BigDecimal r53_crm_comp_col_expo_val) {
		this.r53_crm_comp_col_expo_val = r53_crm_comp_col_expo_val;
	}
	public BigDecimal getR53_rwa_elig_expo_not_cov_crm() {
		return r53_rwa_elig_expo_not_cov_crm;
	}
	public void setR53_rwa_elig_expo_not_cov_crm(BigDecimal r53_rwa_elig_expo_not_cov_crm) {
		this.r53_rwa_elig_expo_not_cov_crm = r53_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR53_rwa_unsec_expo_cre_ris() {
		return r53_rwa_unsec_expo_cre_ris;
	}
	public void setR53_rwa_unsec_expo_cre_ris(BigDecimal r53_rwa_unsec_expo_cre_ris) {
		this.r53_rwa_unsec_expo_cre_ris = r53_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR53_rwa_unsec_expo() {
		return r53_rwa_unsec_expo;
	}
	public void setR53_rwa_unsec_expo(BigDecimal r53_rwa_unsec_expo) {
		this.r53_rwa_unsec_expo = r53_rwa_unsec_expo;
	}
	public BigDecimal getR53_rwa_tot_ris_wei_ass() {
		return r53_rwa_tot_ris_wei_ass;
	}
	public void setR53_rwa_tot_ris_wei_ass(BigDecimal r53_rwa_tot_ris_wei_ass) {
		this.r53_rwa_tot_ris_wei_ass = r53_rwa_tot_ris_wei_ass;
	}
	public String getR54_exposure_class() {
		return r54_exposure_class;
	}
	public void setR54_exposure_class(String r54_exposure_class) {
		this.r54_exposure_class = r54_exposure_class;
	}
	public BigDecimal getR54_expo_crm() {
		return r54_expo_crm;
	}
	public void setR54_expo_crm(BigDecimal r54_expo_crm) {
		this.r54_expo_crm = r54_expo_crm;
	}
	public BigDecimal getR54_spe_pro_expo() {
		return r54_spe_pro_expo;
	}
	public void setR54_spe_pro_expo(BigDecimal r54_spe_pro_expo) {
		this.r54_spe_pro_expo = r54_spe_pro_expo;
	}
	public BigDecimal getR54_amt_elig_sht_net() {
		return r54_amt_elig_sht_net;
	}
	public void setR54_amt_elig_sht_net(BigDecimal r54_amt_elig_sht_net) {
		this.r54_amt_elig_sht_net = r54_amt_elig_sht_net;
	}
	public BigDecimal getR54_tot_expo_net_spe() {
		return r54_tot_expo_net_spe;
	}
	public void setR54_tot_expo_net_spe(BigDecimal r54_tot_expo_net_spe) {
		this.r54_tot_expo_net_spe = r54_tot_expo_net_spe;
	}
	public BigDecimal getR54_crm_sub_elig_sub_app() {
		return r54_crm_sub_elig_sub_app;
	}
	public void setR54_crm_sub_elig_sub_app(BigDecimal r54_crm_sub_elig_sub_app) {
		this.r54_crm_sub_elig_sub_app = r54_crm_sub_elig_sub_app;
	}
	public BigDecimal getR54_crm_sub_non_col_guar() {
		return r54_crm_sub_non_col_guar;
	}
	public void setR54_crm_sub_non_col_guar(BigDecimal r54_crm_sub_non_col_guar) {
		this.r54_crm_sub_non_col_guar = r54_crm_sub_non_col_guar;
	}
	public BigDecimal getR54_crm_sub_non_col_cre_der() {
		return r54_crm_sub_non_col_cre_der;
	}
	public void setR54_crm_sub_non_col_cre_der(BigDecimal r54_crm_sub_non_col_cre_der) {
		this.r54_crm_sub_non_col_cre_der = r54_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR54_crm_sub_col_elig_cash() {
		return r54_crm_sub_col_elig_cash;
	}
	public void setR54_crm_sub_col_elig_cash(BigDecimal r54_crm_sub_col_elig_cash) {
		this.r54_crm_sub_col_elig_cash = r54_crm_sub_col_elig_cash;
	}
	public BigDecimal getR54_crm_sub_col_elig_trea_bills() {
		return r54_crm_sub_col_elig_trea_bills;
	}
	public void setR54_crm_sub_col_elig_trea_bills(BigDecimal r54_crm_sub_col_elig_trea_bills) {
		this.r54_crm_sub_col_elig_trea_bills = r54_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR54_crm_sub_col_elig_deb_sec() {
		return r54_crm_sub_col_elig_deb_sec;
	}
	public void setR54_crm_sub_col_elig_deb_sec(BigDecimal r54_crm_sub_col_elig_deb_sec) {
		this.r54_crm_sub_col_elig_deb_sec = r54_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR54_crm_sub_col_elig_equi() {
		return r54_crm_sub_col_elig_equi;
	}
	public void setR54_crm_sub_col_elig_equi(BigDecimal r54_crm_sub_col_elig_equi) {
		this.r54_crm_sub_col_elig_equi = r54_crm_sub_col_elig_equi;
	}
	public BigDecimal getR54_crm_sub_col_elig_unit_tru() {
		return r54_crm_sub_col_elig_unit_tru;
	}
	public void setR54_crm_sub_col_elig_unit_tru(BigDecimal r54_crm_sub_col_elig_unit_tru) {
		this.r54_crm_sub_col_elig_unit_tru = r54_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR54_crm_sub_col_exp_cov() {
		return r54_crm_sub_col_exp_cov;
	}
	public void setR54_crm_sub_col_exp_cov(BigDecimal r54_crm_sub_col_exp_cov) {
		this.r54_crm_sub_col_exp_cov = r54_crm_sub_col_exp_cov;
	}
	public BigDecimal getR54_crm_sub_col_elig_exp_not_cov() {
		return r54_crm_sub_col_elig_exp_not_cov;
	}
	public void setR54_crm_sub_col_elig_exp_not_cov(BigDecimal r54_crm_sub_col_elig_exp_not_cov) {
		this.r54_crm_sub_col_elig_exp_not_cov = r54_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR54_crm_sub_rwa_ris_crm() {
		return r54_crm_sub_rwa_ris_crm;
	}
	public void setR54_crm_sub_rwa_ris_crm(BigDecimal r54_crm_sub_rwa_ris_crm) {
		this.r54_crm_sub_rwa_ris_crm = r54_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR54_crm_sub_rwa_cov_crm() {
		return r54_crm_sub_rwa_cov_crm;
	}
	public void setR54_crm_sub_rwa_cov_crm(BigDecimal r54_crm_sub_rwa_cov_crm) {
		this.r54_crm_sub_rwa_cov_crm = r54_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR54_crm_sub_rwa_org_cou() {
		return r54_crm_sub_rwa_org_cou;
	}
	public void setR54_crm_sub_rwa_org_cou(BigDecimal r54_crm_sub_rwa_org_cou) {
		this.r54_crm_sub_rwa_org_cou = r54_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR54_crm_sub_rwa_not_cov_crm() {
		return r54_crm_sub_rwa_not_cov_crm;
	}
	public void setR54_crm_sub_rwa_not_cov_crm(BigDecimal r54_crm_sub_rwa_not_cov_crm) {
		this.r54_crm_sub_rwa_not_cov_crm = r54_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR54_crm_comp_col_expo_elig() {
		return r54_crm_comp_col_expo_elig;
	}
	public void setR54_crm_comp_col_expo_elig(BigDecimal r54_crm_comp_col_expo_elig) {
		this.r54_crm_comp_col_expo_elig = r54_crm_comp_col_expo_elig;
	}
	public BigDecimal getR54_crm_comp_col_elig_expo_vol_adj() {
		return r54_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR54_crm_comp_col_elig_expo_vol_adj(BigDecimal r54_crm_comp_col_elig_expo_vol_adj) {
		this.r54_crm_comp_col_elig_expo_vol_adj = r54_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR54_crm_comp_col_elig_fin_hai() {
		return r54_crm_comp_col_elig_fin_hai;
	}
	public void setR54_crm_comp_col_elig_fin_hai(BigDecimal r54_crm_comp_col_elig_fin_hai) {
		this.r54_crm_comp_col_elig_fin_hai = r54_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR54_crm_comp_col_expo_val() {
		return r54_crm_comp_col_expo_val;
	}
	public void setR54_crm_comp_col_expo_val(BigDecimal r54_crm_comp_col_expo_val) {
		this.r54_crm_comp_col_expo_val = r54_crm_comp_col_expo_val;
	}
	public BigDecimal getR54_rwa_elig_expo_not_cov_crm() {
		return r54_rwa_elig_expo_not_cov_crm;
	}
	public void setR54_rwa_elig_expo_not_cov_crm(BigDecimal r54_rwa_elig_expo_not_cov_crm) {
		this.r54_rwa_elig_expo_not_cov_crm = r54_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR54_rwa_unsec_expo_cre_ris() {
		return r54_rwa_unsec_expo_cre_ris;
	}
	public void setR54_rwa_unsec_expo_cre_ris(BigDecimal r54_rwa_unsec_expo_cre_ris) {
		this.r54_rwa_unsec_expo_cre_ris = r54_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR54_rwa_unsec_expo() {
		return r54_rwa_unsec_expo;
	}
	public void setR54_rwa_unsec_expo(BigDecimal r54_rwa_unsec_expo) {
		this.r54_rwa_unsec_expo = r54_rwa_unsec_expo;
	}
	public BigDecimal getR54_rwa_tot_ris_wei_ass() {
		return r54_rwa_tot_ris_wei_ass;
	}
	public void setR54_rwa_tot_ris_wei_ass(BigDecimal r54_rwa_tot_ris_wei_ass) {
		this.r54_rwa_tot_ris_wei_ass = r54_rwa_tot_ris_wei_ass;
	}
	public String getR55_exposure_class() {
		return r55_exposure_class;
	}
	public void setR55_exposure_class(String r55_exposure_class) {
		this.r55_exposure_class = r55_exposure_class;
	}
	public BigDecimal getR55_expo_crm() {
		return r55_expo_crm;
	}
	public void setR55_expo_crm(BigDecimal r55_expo_crm) {
		this.r55_expo_crm = r55_expo_crm;
	}
	public BigDecimal getR55_spe_pro_expo() {
		return r55_spe_pro_expo;
	}
	public void setR55_spe_pro_expo(BigDecimal r55_spe_pro_expo) {
		this.r55_spe_pro_expo = r55_spe_pro_expo;
	}
	public BigDecimal getR55_amt_elig_sht_net() {
		return r55_amt_elig_sht_net;
	}
	public void setR55_amt_elig_sht_net(BigDecimal r55_amt_elig_sht_net) {
		this.r55_amt_elig_sht_net = r55_amt_elig_sht_net;
	}
	public BigDecimal getR55_tot_expo_net_spe() {
		return r55_tot_expo_net_spe;
	}
	public void setR55_tot_expo_net_spe(BigDecimal r55_tot_expo_net_spe) {
		this.r55_tot_expo_net_spe = r55_tot_expo_net_spe;
	}
	public BigDecimal getR55_crm_sub_elig_sub_app() {
		return r55_crm_sub_elig_sub_app;
	}
	public void setR55_crm_sub_elig_sub_app(BigDecimal r55_crm_sub_elig_sub_app) {
		this.r55_crm_sub_elig_sub_app = r55_crm_sub_elig_sub_app;
	}
	public BigDecimal getR55_crm_sub_non_col_guar() {
		return r55_crm_sub_non_col_guar;
	}
	public void setR55_crm_sub_non_col_guar(BigDecimal r55_crm_sub_non_col_guar) {
		this.r55_crm_sub_non_col_guar = r55_crm_sub_non_col_guar;
	}
	public BigDecimal getR55_crm_sub_non_col_cre_der() {
		return r55_crm_sub_non_col_cre_der;
	}
	public void setR55_crm_sub_non_col_cre_der(BigDecimal r55_crm_sub_non_col_cre_der) {
		this.r55_crm_sub_non_col_cre_der = r55_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR55_crm_sub_col_elig_cash() {
		return r55_crm_sub_col_elig_cash;
	}
	public void setR55_crm_sub_col_elig_cash(BigDecimal r55_crm_sub_col_elig_cash) {
		this.r55_crm_sub_col_elig_cash = r55_crm_sub_col_elig_cash;
	}
	public BigDecimal getR55_crm_sub_col_elig_trea_bills() {
		return r55_crm_sub_col_elig_trea_bills;
	}
	public void setR55_crm_sub_col_elig_trea_bills(BigDecimal r55_crm_sub_col_elig_trea_bills) {
		this.r55_crm_sub_col_elig_trea_bills = r55_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR55_crm_sub_col_elig_deb_sec() {
		return r55_crm_sub_col_elig_deb_sec;
	}
	public void setR55_crm_sub_col_elig_deb_sec(BigDecimal r55_crm_sub_col_elig_deb_sec) {
		this.r55_crm_sub_col_elig_deb_sec = r55_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR55_crm_sub_col_elig_equi() {
		return r55_crm_sub_col_elig_equi;
	}
	public void setR55_crm_sub_col_elig_equi(BigDecimal r55_crm_sub_col_elig_equi) {
		this.r55_crm_sub_col_elig_equi = r55_crm_sub_col_elig_equi;
	}
	public BigDecimal getR55_crm_sub_col_elig_unit_tru() {
		return r55_crm_sub_col_elig_unit_tru;
	}
	public void setR55_crm_sub_col_elig_unit_tru(BigDecimal r55_crm_sub_col_elig_unit_tru) {
		this.r55_crm_sub_col_elig_unit_tru = r55_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR55_crm_sub_col_exp_cov() {
		return r55_crm_sub_col_exp_cov;
	}
	public void setR55_crm_sub_col_exp_cov(BigDecimal r55_crm_sub_col_exp_cov) {
		this.r55_crm_sub_col_exp_cov = r55_crm_sub_col_exp_cov;
	}
	public BigDecimal getR55_crm_sub_col_elig_exp_not_cov() {
		return r55_crm_sub_col_elig_exp_not_cov;
	}
	public void setR55_crm_sub_col_elig_exp_not_cov(BigDecimal r55_crm_sub_col_elig_exp_not_cov) {
		this.r55_crm_sub_col_elig_exp_not_cov = r55_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR55_crm_sub_rwa_ris_crm() {
		return r55_crm_sub_rwa_ris_crm;
	}
	public void setR55_crm_sub_rwa_ris_crm(BigDecimal r55_crm_sub_rwa_ris_crm) {
		this.r55_crm_sub_rwa_ris_crm = r55_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR55_crm_sub_rwa_cov_crm() {
		return r55_crm_sub_rwa_cov_crm;
	}
	public void setR55_crm_sub_rwa_cov_crm(BigDecimal r55_crm_sub_rwa_cov_crm) {
		this.r55_crm_sub_rwa_cov_crm = r55_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR55_crm_sub_rwa_org_cou() {
		return r55_crm_sub_rwa_org_cou;
	}
	public void setR55_crm_sub_rwa_org_cou(BigDecimal r55_crm_sub_rwa_org_cou) {
		this.r55_crm_sub_rwa_org_cou = r55_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR55_crm_sub_rwa_not_cov_crm() {
		return r55_crm_sub_rwa_not_cov_crm;
	}
	public void setR55_crm_sub_rwa_not_cov_crm(BigDecimal r55_crm_sub_rwa_not_cov_crm) {
		this.r55_crm_sub_rwa_not_cov_crm = r55_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR55_crm_comp_col_expo_elig() {
		return r55_crm_comp_col_expo_elig;
	}
	public void setR55_crm_comp_col_expo_elig(BigDecimal r55_crm_comp_col_expo_elig) {
		this.r55_crm_comp_col_expo_elig = r55_crm_comp_col_expo_elig;
	}
	public BigDecimal getR55_crm_comp_col_elig_expo_vol_adj() {
		return r55_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR55_crm_comp_col_elig_expo_vol_adj(BigDecimal r55_crm_comp_col_elig_expo_vol_adj) {
		this.r55_crm_comp_col_elig_expo_vol_adj = r55_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR55_crm_comp_col_elig_fin_hai() {
		return r55_crm_comp_col_elig_fin_hai;
	}
	public void setR55_crm_comp_col_elig_fin_hai(BigDecimal r55_crm_comp_col_elig_fin_hai) {
		this.r55_crm_comp_col_elig_fin_hai = r55_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR55_crm_comp_col_expo_val() {
		return r55_crm_comp_col_expo_val;
	}
	public void setR55_crm_comp_col_expo_val(BigDecimal r55_crm_comp_col_expo_val) {
		this.r55_crm_comp_col_expo_val = r55_crm_comp_col_expo_val;
	}
	public BigDecimal getR55_rwa_elig_expo_not_cov_crm() {
		return r55_rwa_elig_expo_not_cov_crm;
	}
	public void setR55_rwa_elig_expo_not_cov_crm(BigDecimal r55_rwa_elig_expo_not_cov_crm) {
		this.r55_rwa_elig_expo_not_cov_crm = r55_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR55_rwa_unsec_expo_cre_ris() {
		return r55_rwa_unsec_expo_cre_ris;
	}
	public void setR55_rwa_unsec_expo_cre_ris(BigDecimal r55_rwa_unsec_expo_cre_ris) {
		this.r55_rwa_unsec_expo_cre_ris = r55_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR55_rwa_unsec_expo() {
		return r55_rwa_unsec_expo;
	}
	public void setR55_rwa_unsec_expo(BigDecimal r55_rwa_unsec_expo) {
		this.r55_rwa_unsec_expo = r55_rwa_unsec_expo;
	}
	public BigDecimal getR55_rwa_tot_ris_wei_ass() {
		return r55_rwa_tot_ris_wei_ass;
	}
	public void setR55_rwa_tot_ris_wei_ass(BigDecimal r55_rwa_tot_ris_wei_ass) {
		this.r55_rwa_tot_ris_wei_ass = r55_rwa_tot_ris_wei_ass;
	}
	public String getR56_exposure_class() {
		return r56_exposure_class;
	}
	public void setR56_exposure_class(String r56_exposure_class) {
		this.r56_exposure_class = r56_exposure_class;
	}
	public BigDecimal getR56_expo_crm() {
		return r56_expo_crm;
	}
	public void setR56_expo_crm(BigDecimal r56_expo_crm) {
		this.r56_expo_crm = r56_expo_crm;
	}
	public BigDecimal getR56_spe_pro_expo() {
		return r56_spe_pro_expo;
	}
	public void setR56_spe_pro_expo(BigDecimal r56_spe_pro_expo) {
		this.r56_spe_pro_expo = r56_spe_pro_expo;
	}
	public BigDecimal getR56_amt_elig_sht_net() {
		return r56_amt_elig_sht_net;
	}
	public void setR56_amt_elig_sht_net(BigDecimal r56_amt_elig_sht_net) {
		this.r56_amt_elig_sht_net = r56_amt_elig_sht_net;
	}
	public BigDecimal getR56_tot_expo_net_spe() {
		return r56_tot_expo_net_spe;
	}
	public void setR56_tot_expo_net_spe(BigDecimal r56_tot_expo_net_spe) {
		this.r56_tot_expo_net_spe = r56_tot_expo_net_spe;
	}
	public BigDecimal getR56_crm_sub_elig_sub_app() {
		return r56_crm_sub_elig_sub_app;
	}
	public void setR56_crm_sub_elig_sub_app(BigDecimal r56_crm_sub_elig_sub_app) {
		this.r56_crm_sub_elig_sub_app = r56_crm_sub_elig_sub_app;
	}
	public BigDecimal getR56_crm_sub_non_col_guar() {
		return r56_crm_sub_non_col_guar;
	}
	public void setR56_crm_sub_non_col_guar(BigDecimal r56_crm_sub_non_col_guar) {
		this.r56_crm_sub_non_col_guar = r56_crm_sub_non_col_guar;
	}
	public BigDecimal getR56_crm_sub_non_col_cre_der() {
		return r56_crm_sub_non_col_cre_der;
	}
	public void setR56_crm_sub_non_col_cre_der(BigDecimal r56_crm_sub_non_col_cre_der) {
		this.r56_crm_sub_non_col_cre_der = r56_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR56_crm_sub_col_elig_cash() {
		return r56_crm_sub_col_elig_cash;
	}
	public void setR56_crm_sub_col_elig_cash(BigDecimal r56_crm_sub_col_elig_cash) {
		this.r56_crm_sub_col_elig_cash = r56_crm_sub_col_elig_cash;
	}
	public BigDecimal getR56_crm_sub_col_elig_trea_bills() {
		return r56_crm_sub_col_elig_trea_bills;
	}
	public void setR56_crm_sub_col_elig_trea_bills(BigDecimal r56_crm_sub_col_elig_trea_bills) {
		this.r56_crm_sub_col_elig_trea_bills = r56_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR56_crm_sub_col_elig_deb_sec() {
		return r56_crm_sub_col_elig_deb_sec;
	}
	public void setR56_crm_sub_col_elig_deb_sec(BigDecimal r56_crm_sub_col_elig_deb_sec) {
		this.r56_crm_sub_col_elig_deb_sec = r56_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR56_crm_sub_col_elig_equi() {
		return r56_crm_sub_col_elig_equi;
	}
	public void setR56_crm_sub_col_elig_equi(BigDecimal r56_crm_sub_col_elig_equi) {
		this.r56_crm_sub_col_elig_equi = r56_crm_sub_col_elig_equi;
	}
	public BigDecimal getR56_crm_sub_col_elig_unit_tru() {
		return r56_crm_sub_col_elig_unit_tru;
	}
	public void setR56_crm_sub_col_elig_unit_tru(BigDecimal r56_crm_sub_col_elig_unit_tru) {
		this.r56_crm_sub_col_elig_unit_tru = r56_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR56_crm_sub_col_exp_cov() {
		return r56_crm_sub_col_exp_cov;
	}
	public void setR56_crm_sub_col_exp_cov(BigDecimal r56_crm_sub_col_exp_cov) {
		this.r56_crm_sub_col_exp_cov = r56_crm_sub_col_exp_cov;
	}
	public BigDecimal getR56_crm_sub_col_elig_exp_not_cov() {
		return r56_crm_sub_col_elig_exp_not_cov;
	}
	public void setR56_crm_sub_col_elig_exp_not_cov(BigDecimal r56_crm_sub_col_elig_exp_not_cov) {
		this.r56_crm_sub_col_elig_exp_not_cov = r56_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR56_crm_sub_rwa_ris_crm() {
		return r56_crm_sub_rwa_ris_crm;
	}
	public void setR56_crm_sub_rwa_ris_crm(BigDecimal r56_crm_sub_rwa_ris_crm) {
		this.r56_crm_sub_rwa_ris_crm = r56_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR56_crm_sub_rwa_cov_crm() {
		return r56_crm_sub_rwa_cov_crm;
	}
	public void setR56_crm_sub_rwa_cov_crm(BigDecimal r56_crm_sub_rwa_cov_crm) {
		this.r56_crm_sub_rwa_cov_crm = r56_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR56_crm_sub_rwa_org_cou() {
		return r56_crm_sub_rwa_org_cou;
	}
	public void setR56_crm_sub_rwa_org_cou(BigDecimal r56_crm_sub_rwa_org_cou) {
		this.r56_crm_sub_rwa_org_cou = r56_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR56_crm_sub_rwa_not_cov_crm() {
		return r56_crm_sub_rwa_not_cov_crm;
	}
	public void setR56_crm_sub_rwa_not_cov_crm(BigDecimal r56_crm_sub_rwa_not_cov_crm) {
		this.r56_crm_sub_rwa_not_cov_crm = r56_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR56_crm_comp_col_expo_elig() {
		return r56_crm_comp_col_expo_elig;
	}
	public void setR56_crm_comp_col_expo_elig(BigDecimal r56_crm_comp_col_expo_elig) {
		this.r56_crm_comp_col_expo_elig = r56_crm_comp_col_expo_elig;
	}
	public BigDecimal getR56_crm_comp_col_elig_expo_vol_adj() {
		return r56_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR56_crm_comp_col_elig_expo_vol_adj(BigDecimal r56_crm_comp_col_elig_expo_vol_adj) {
		this.r56_crm_comp_col_elig_expo_vol_adj = r56_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR56_crm_comp_col_elig_fin_hai() {
		return r56_crm_comp_col_elig_fin_hai;
	}
	public void setR56_crm_comp_col_elig_fin_hai(BigDecimal r56_crm_comp_col_elig_fin_hai) {
		this.r56_crm_comp_col_elig_fin_hai = r56_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR56_crm_comp_col_expo_val() {
		return r56_crm_comp_col_expo_val;
	}
	public void setR56_crm_comp_col_expo_val(BigDecimal r56_crm_comp_col_expo_val) {
		this.r56_crm_comp_col_expo_val = r56_crm_comp_col_expo_val;
	}
	public BigDecimal getR56_rwa_elig_expo_not_cov_crm() {
		return r56_rwa_elig_expo_not_cov_crm;
	}
	public void setR56_rwa_elig_expo_not_cov_crm(BigDecimal r56_rwa_elig_expo_not_cov_crm) {
		this.r56_rwa_elig_expo_not_cov_crm = r56_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR56_rwa_unsec_expo_cre_ris() {
		return r56_rwa_unsec_expo_cre_ris;
	}
	public void setR56_rwa_unsec_expo_cre_ris(BigDecimal r56_rwa_unsec_expo_cre_ris) {
		this.r56_rwa_unsec_expo_cre_ris = r56_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR56_rwa_unsec_expo() {
		return r56_rwa_unsec_expo;
	}
	public void setR56_rwa_unsec_expo(BigDecimal r56_rwa_unsec_expo) {
		this.r56_rwa_unsec_expo = r56_rwa_unsec_expo;
	}
	public BigDecimal getR56_rwa_tot_ris_wei_ass() {
		return r56_rwa_tot_ris_wei_ass;
	}
	public void setR56_rwa_tot_ris_wei_ass(BigDecimal r56_rwa_tot_ris_wei_ass) {
		this.r56_rwa_tot_ris_wei_ass = r56_rwa_tot_ris_wei_ass;
	}
	public String getR57_exposure_class() {
		return r57_exposure_class;
	}
	public void setR57_exposure_class(String r57_exposure_class) {
		this.r57_exposure_class = r57_exposure_class;
	}
	public BigDecimal getR57_expo_crm() {
		return r57_expo_crm;
	}
	public void setR57_expo_crm(BigDecimal r57_expo_crm) {
		this.r57_expo_crm = r57_expo_crm;
	}
	public BigDecimal getR57_spe_pro_expo() {
		return r57_spe_pro_expo;
	}
	public void setR57_spe_pro_expo(BigDecimal r57_spe_pro_expo) {
		this.r57_spe_pro_expo = r57_spe_pro_expo;
	}
	public BigDecimal getR57_amt_elig_sht_net() {
		return r57_amt_elig_sht_net;
	}
	public void setR57_amt_elig_sht_net(BigDecimal r57_amt_elig_sht_net) {
		this.r57_amt_elig_sht_net = r57_amt_elig_sht_net;
	}
	public BigDecimal getR57_tot_expo_net_spe() {
		return r57_tot_expo_net_spe;
	}
	public void setR57_tot_expo_net_spe(BigDecimal r57_tot_expo_net_spe) {
		this.r57_tot_expo_net_spe = r57_tot_expo_net_spe;
	}
	public BigDecimal getR57_crm_sub_elig_sub_app() {
		return r57_crm_sub_elig_sub_app;
	}
	public void setR57_crm_sub_elig_sub_app(BigDecimal r57_crm_sub_elig_sub_app) {
		this.r57_crm_sub_elig_sub_app = r57_crm_sub_elig_sub_app;
	}
	public BigDecimal getR57_crm_sub_non_col_guar() {
		return r57_crm_sub_non_col_guar;
	}
	public void setR57_crm_sub_non_col_guar(BigDecimal r57_crm_sub_non_col_guar) {
		this.r57_crm_sub_non_col_guar = r57_crm_sub_non_col_guar;
	}
	public BigDecimal getR57_crm_sub_non_col_cre_der() {
		return r57_crm_sub_non_col_cre_der;
	}
	public void setR57_crm_sub_non_col_cre_der(BigDecimal r57_crm_sub_non_col_cre_der) {
		this.r57_crm_sub_non_col_cre_der = r57_crm_sub_non_col_cre_der;
	}
	public BigDecimal getR57_crm_sub_col_elig_cash() {
		return r57_crm_sub_col_elig_cash;
	}
	public void setR57_crm_sub_col_elig_cash(BigDecimal r57_crm_sub_col_elig_cash) {
		this.r57_crm_sub_col_elig_cash = r57_crm_sub_col_elig_cash;
	}
	public BigDecimal getR57_crm_sub_col_elig_trea_bills() {
		return r57_crm_sub_col_elig_trea_bills;
	}
	public void setR57_crm_sub_col_elig_trea_bills(BigDecimal r57_crm_sub_col_elig_trea_bills) {
		this.r57_crm_sub_col_elig_trea_bills = r57_crm_sub_col_elig_trea_bills;
	}
	public BigDecimal getR57_crm_sub_col_elig_deb_sec() {
		return r57_crm_sub_col_elig_deb_sec;
	}
	public void setR57_crm_sub_col_elig_deb_sec(BigDecimal r57_crm_sub_col_elig_deb_sec) {
		this.r57_crm_sub_col_elig_deb_sec = r57_crm_sub_col_elig_deb_sec;
	}
	public BigDecimal getR57_crm_sub_col_elig_equi() {
		return r57_crm_sub_col_elig_equi;
	}
	public void setR57_crm_sub_col_elig_equi(BigDecimal r57_crm_sub_col_elig_equi) {
		this.r57_crm_sub_col_elig_equi = r57_crm_sub_col_elig_equi;
	}
	public BigDecimal getR57_crm_sub_col_elig_unit_tru() {
		return r57_crm_sub_col_elig_unit_tru;
	}
	public void setR57_crm_sub_col_elig_unit_tru(BigDecimal r57_crm_sub_col_elig_unit_tru) {
		this.r57_crm_sub_col_elig_unit_tru = r57_crm_sub_col_elig_unit_tru;
	}
	public BigDecimal getR57_crm_sub_col_exp_cov() {
		return r57_crm_sub_col_exp_cov;
	}
	public void setR57_crm_sub_col_exp_cov(BigDecimal r57_crm_sub_col_exp_cov) {
		this.r57_crm_sub_col_exp_cov = r57_crm_sub_col_exp_cov;
	}
	public BigDecimal getR57_crm_sub_col_elig_exp_not_cov() {
		return r57_crm_sub_col_elig_exp_not_cov;
	}
	public void setR57_crm_sub_col_elig_exp_not_cov(BigDecimal r57_crm_sub_col_elig_exp_not_cov) {
		this.r57_crm_sub_col_elig_exp_not_cov = r57_crm_sub_col_elig_exp_not_cov;
	}
	public BigDecimal getR57_crm_sub_rwa_ris_crm() {
		return r57_crm_sub_rwa_ris_crm;
	}
	public void setR57_crm_sub_rwa_ris_crm(BigDecimal r57_crm_sub_rwa_ris_crm) {
		this.r57_crm_sub_rwa_ris_crm = r57_crm_sub_rwa_ris_crm;
	}
	public BigDecimal getR57_crm_sub_rwa_cov_crm() {
		return r57_crm_sub_rwa_cov_crm;
	}
	public void setR57_crm_sub_rwa_cov_crm(BigDecimal r57_crm_sub_rwa_cov_crm) {
		this.r57_crm_sub_rwa_cov_crm = r57_crm_sub_rwa_cov_crm;
	}
	public BigDecimal getR57_crm_sub_rwa_org_cou() {
		return r57_crm_sub_rwa_org_cou;
	}
	public void setR57_crm_sub_rwa_org_cou(BigDecimal r57_crm_sub_rwa_org_cou) {
		this.r57_crm_sub_rwa_org_cou = r57_crm_sub_rwa_org_cou;
	}
	public BigDecimal getR57_crm_sub_rwa_not_cov_crm() {
		return r57_crm_sub_rwa_not_cov_crm;
	}
	public void setR57_crm_sub_rwa_not_cov_crm(BigDecimal r57_crm_sub_rwa_not_cov_crm) {
		this.r57_crm_sub_rwa_not_cov_crm = r57_crm_sub_rwa_not_cov_crm;
	}
	public BigDecimal getR57_crm_comp_col_expo_elig() {
		return r57_crm_comp_col_expo_elig;
	}
	public void setR57_crm_comp_col_expo_elig(BigDecimal r57_crm_comp_col_expo_elig) {
		this.r57_crm_comp_col_expo_elig = r57_crm_comp_col_expo_elig;
	}
	public BigDecimal getR57_crm_comp_col_elig_expo_vol_adj() {
		return r57_crm_comp_col_elig_expo_vol_adj;
	}
	public void setR57_crm_comp_col_elig_expo_vol_adj(BigDecimal r57_crm_comp_col_elig_expo_vol_adj) {
		this.r57_crm_comp_col_elig_expo_vol_adj = r57_crm_comp_col_elig_expo_vol_adj;
	}
	public BigDecimal getR57_crm_comp_col_elig_fin_hai() {
		return r57_crm_comp_col_elig_fin_hai;
	}
	public void setR57_crm_comp_col_elig_fin_hai(BigDecimal r57_crm_comp_col_elig_fin_hai) {
		this.r57_crm_comp_col_elig_fin_hai = r57_crm_comp_col_elig_fin_hai;
	}
	public BigDecimal getR57_crm_comp_col_expo_val() {
		return r57_crm_comp_col_expo_val;
	}
	public void setR57_crm_comp_col_expo_val(BigDecimal r57_crm_comp_col_expo_val) {
		this.r57_crm_comp_col_expo_val = r57_crm_comp_col_expo_val;
	}
	public BigDecimal getR57_rwa_elig_expo_not_cov_crm() {
		return r57_rwa_elig_expo_not_cov_crm;
	}
	public void setR57_rwa_elig_expo_not_cov_crm(BigDecimal r57_rwa_elig_expo_not_cov_crm) {
		this.r57_rwa_elig_expo_not_cov_crm = r57_rwa_elig_expo_not_cov_crm;
	}
	public BigDecimal getR57_rwa_unsec_expo_cre_ris() {
		return r57_rwa_unsec_expo_cre_ris;
	}
	public void setR57_rwa_unsec_expo_cre_ris(BigDecimal r57_rwa_unsec_expo_cre_ris) {
		this.r57_rwa_unsec_expo_cre_ris = r57_rwa_unsec_expo_cre_ris;
	}
	public BigDecimal getR57_rwa_unsec_expo() {
		return r57_rwa_unsec_expo;
	}
	public void setR57_rwa_unsec_expo(BigDecimal r57_rwa_unsec_expo) {
		this.r57_rwa_unsec_expo = r57_rwa_unsec_expo;
	}
	public BigDecimal getR57_rwa_tot_ris_wei_ass() {
		return r57_rwa_tot_ris_wei_ass;
	}
	public void setR57_rwa_tot_ris_wei_ass(BigDecimal r57_rwa_tot_ris_wei_ass) {
		this.r57_rwa_tot_ris_wei_ass = r57_rwa_tot_ris_wei_ass;
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
	public M_SRWA_12A_Archival_Summary_Entity1() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
	 
	

	

}
