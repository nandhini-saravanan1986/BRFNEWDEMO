package com.bornfire.brf.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

// Entity class will be created for the summary table and its call by the Entity repository for summary table.

@Entity
@Table(name = "CBUAE_BRF5_17_SUMMARYTABLE") 
public class CBUAE_BRF5_17_SUMMARY_ENTITY {
	
	
	private String	r0010_product;
	private BigDecimal	r0010_expbccf_indiv_resi;
	private BigDecimal	r0010_expaccf_indiv_resi;
	private BigDecimal	r0010_expbccf_indiv_nonresi;
	private BigDecimal	r0010_expaccf_indiv_nonresi;
	private BigDecimal	r0010_expbccf_rsme_resi;
	private BigDecimal	r0010_expaccf_rsme_resi;
	private BigDecimal	r0010_expbccf_rsme_nonresi;
	private BigDecimal	r0010_expaccf_rsme_nonresi;
	private BigDecimal	r0010_expbccf_sme_resi;
	private BigDecimal	r0010_expaccf_sme_resi;
	private BigDecimal	r0010_expbccf_sme_nonresi;
	private BigDecimal	r0010_expaccf_sme_nonresi;
	private BigDecimal	r0010_expbccf_hni_resi;
	private BigDecimal	r0010_expaccf_hni_resi;
	private BigDecimal	r0010_expbccf_hni_nonresi;
	private BigDecimal	r0010_expaccf_hni_nonresi;
	private BigDecimal	r0010_expbccf_gres_resi;
	private BigDecimal	r0010_expaccf_gres_resi;
	private BigDecimal	r0010_expbccf_gres_nonresi;
	private BigDecimal	r0010_expaccf_gres_nonresi;
	private BigDecimal	r0010_expbccf_corp_resi;
	private BigDecimal	r0010_expaccf_corp_resi;
	private BigDecimal	r0010_expbccf_corp_nonresi;
	private BigDecimal	r0010_expaccf_corp_nonresi;
	private BigDecimal	r0010_expbccf_nbfi_resi;
	private BigDecimal	r0010_expaccf_nbfi_resi;
	private BigDecimal	r0010_expbccf_nbfi_nonresi;
	private BigDecimal	r0010_expaccf_nbfi_nonresi;
	private BigDecimal	r0010_expbccf_bank_resi;
	private BigDecimal	r0010_expaccf_bank_resi;
	private BigDecimal	r0010_expbccf_bank_nonresi;
	private BigDecimal	r0010_expaccf_bank_nonresi;
	private BigDecimal	r0010_expbccf_gov_resi;
	private BigDecimal	r0010_expaccf_gov_resi;
	private BigDecimal	r0010_expbccf_gov_nonresi;
	private BigDecimal	r0010_expaccf_gov_nonresi;
	private String	r0020_product;
	private BigDecimal	r0020_expbccf_indiv_resi;
	private BigDecimal	r0020_expaccf_indiv_resi;
	private BigDecimal	r0020_expbccf_indiv_nonresi;
	private BigDecimal	r0020_expaccf_indiv_nonresi;
	private BigDecimal	r0020_expbccf_rsme_resi;
	private BigDecimal	r0020_expaccf_rsme_resi;
	private BigDecimal	r0020_expbccf_rsme_nonresi;
	private BigDecimal	r0020_expaccf_rsme_nonresi;
	private BigDecimal	r0020_expbccf_sme_resi;
	private BigDecimal	r0020_expaccf_sme_resi;
	private BigDecimal	r0020_expbccf_sme_nonresi;
	private BigDecimal	r0020_expaccf_sme_nonresi;
	private BigDecimal	r0020_expbccf_hni_resi;
	private BigDecimal	r0020_expaccf_hni_resi;
	private BigDecimal	r0020_expbccf_hni_nonresi;
	private BigDecimal	r0020_expaccf_hni_nonresi;
	private BigDecimal	r0020_expbccf_gres_resi;
	private BigDecimal	r0020_expaccf_gres_resi;
	private BigDecimal	r0020_expbccf_gres_nonresi;
	private BigDecimal	r0020_expaccf_gres_nonresi;
	private BigDecimal	r0020_expbccf_corp_resi;
	private BigDecimal	r0020_expaccf_corp_resi;
	private BigDecimal	r0020_expbccf_corp_nonresi;
	private BigDecimal	r0020_expaccf_corp_nonresi;
	private BigDecimal	r0020_expbccf_nbfi_resi;
	private BigDecimal	r0020_expaccf_nbfi_resi;
	private BigDecimal	r0020_expbccf_nbfi_nonresi;
	private BigDecimal	r0020_expaccf_nbfi_nonresi;
	private BigDecimal	r0020_expbccf_bank_resi;
	private BigDecimal	r0020_expaccf_bank_resi;
	private BigDecimal	r0020_expbccf_bank_nonresi;
	private BigDecimal	r0020_expaccf_bank_nonresi;
	private BigDecimal	r0020_expbccf_gov_resi;
	private BigDecimal	r0020_expaccf_gov_resi;
	private BigDecimal	r0020_expbccf_gov_nonresi;
	private BigDecimal	r0020_expaccf_gov_nonresi;
	private String	r0030_product;
	private BigDecimal	r0030_expbccf_indiv_resi;
	private BigDecimal	r0030_expaccf_indiv_resi;
	private BigDecimal	r0030_expbccf_indiv_nonresi;
	private BigDecimal	r0030_expaccf_indiv_nonresi;
	private BigDecimal	r0030_expbccf_rsme_resi;
	private BigDecimal	r0030_expaccf_rsme_resi;
	private BigDecimal	r0030_expbccf_rsme_nonresi;
	private BigDecimal	r0030_expaccf_rsme_nonresi;
	private BigDecimal	r0030_expbccf_sme_resi;
	private BigDecimal	r0030_expaccf_sme_resi;
	private BigDecimal	r0030_expbccf_sme_nonresi;
	private BigDecimal	r0030_expaccf_sme_nonresi;
	private BigDecimal	r0030_expbccf_hni_resi;
	private BigDecimal	r0030_expaccf_hni_resi;
	private BigDecimal	r0030_expbccf_hni_nonresi;
	private BigDecimal	r0030_expaccf_hni_nonresi;
	private BigDecimal	r0030_expbccf_gres_resi;
	private BigDecimal	r0030_expaccf_gres_resi;
	private BigDecimal	r0030_expbccf_gres_nonresi;
	private BigDecimal	r0030_expaccf_gres_nonresi;
	private BigDecimal	r0030_expbccf_corp_resi;
	private BigDecimal	r0030_expaccf_corp_resi;
	private BigDecimal	r0030_expbccf_corp_nonresi;
	private BigDecimal	r0030_expaccf_corp_nonresi;
	private BigDecimal	r0030_expbccf_nbfi_resi;
	private BigDecimal	r0030_expaccf_nbfi_resi;
	private BigDecimal	r0030_expbccf_nbfi_nonresi;
	private BigDecimal	r0030_expaccf_nbfi_nonresi;
	private BigDecimal	r0030_expbccf_bank_resi;
	private BigDecimal	r0030_expaccf_bank_resi;
	private BigDecimal	r0030_expbccf_bank_nonresi;
	private BigDecimal	r0030_expaccf_bank_nonresi;
	private BigDecimal	r0030_expbccf_gov_resi;
	private BigDecimal	r0030_expaccf_gov_resi;
	private BigDecimal	r0030_expbccf_gov_nonresi;
	private BigDecimal	r0030_expaccf_gov_nonresi;
	private String	r0040_product;
	private BigDecimal	r0040_expbccf_indiv_resi;
	private BigDecimal	r0040_expaccf_indiv_resi;
	private BigDecimal	r0040_expbccf_indiv_nonresi;
	private BigDecimal	r0040_expaccf_indiv_nonresi;
	private BigDecimal	r0040_expbccf_rsme_resi;
	private BigDecimal	r0040_expaccf_rsme_resi;
	private BigDecimal	r0040_expbccf_rsme_nonresi;
	private BigDecimal	r0040_expaccf_rsme_nonresi;
	private BigDecimal	r0040_expbccf_sme_resi;
	private BigDecimal	r0040_expaccf_sme_resi;
	private BigDecimal	r0040_expbccf_sme_nonresi;
	private BigDecimal	r0040_expaccf_sme_nonresi;
	private BigDecimal	r0040_expbccf_hni_resi;
	private BigDecimal	r0040_expaccf_hni_resi;
	private BigDecimal	r0040_expbccf_hni_nonresi;
	private BigDecimal	r0040_expaccf_hni_nonresi;
	private BigDecimal	r0040_expbccf_gres_resi;
	private BigDecimal	r0040_expaccf_gres_resi;
	private BigDecimal	r0040_expbccf_gres_nonresi;
	private BigDecimal	r0040_expaccf_gres_nonresi;
	private BigDecimal	r0040_expbccf_corp_resi;
	private BigDecimal	r0040_expaccf_corp_resi;
	private BigDecimal	r0040_expbccf_corp_nonresi;
	private BigDecimal	r0040_expaccf_corp_nonresi;
	private BigDecimal	r0040_expbccf_nbfi_resi;
	private BigDecimal	r0040_expaccf_nbfi_resi;
	private BigDecimal	r0040_expbccf_nbfi_nonresi;
	private BigDecimal	r0040_expaccf_nbfi_nonresi;
	private BigDecimal	r0040_expbccf_bank_resi;
	private BigDecimal	r0040_expaccf_bank_resi;
	private BigDecimal	r0040_expbccf_bank_nonresi;
	private BigDecimal	r0040_expaccf_bank_nonresi;
	private BigDecimal	r0040_expbccf_gov_resi;
	private BigDecimal	r0040_expaccf_gov_resi;
	private BigDecimal	r0040_expbccf_gov_nonresi;
	private BigDecimal	r0040_expaccf_gov_nonresi;
	private String	r0050_product;
	private BigDecimal	r0050_expbccf_indiv_resi;
	private BigDecimal	r0050_expaccf_indiv_resi;
	private BigDecimal	r0050_expbccf_indiv_nonresi;
	private BigDecimal	r0050_expaccf_indiv_nonresi;
	private BigDecimal	r0050_expbccf_rsme_resi;
	private BigDecimal	r0050_expaccf_rsme_resi;
	private BigDecimal	r0050_expbccf_rsme_nonresi;
	private BigDecimal	r0050_expaccf_rsme_nonresi;
	private BigDecimal	r0050_expbccf_sme_resi;
	private BigDecimal	r0050_expaccf_sme_resi;
	private BigDecimal	r0050_expbccf_sme_nonresi;
	private BigDecimal	r0050_expaccf_sme_nonresi;
	private BigDecimal	r0050_expbccf_hni_resi;
	private BigDecimal	r0050_expaccf_hni_resi;
	private BigDecimal	r0050_expbccf_hni_nonresi;
	private BigDecimal	r0050_expaccf_hni_nonresi;
	private BigDecimal	r0050_expbccf_gres_resi;
	private BigDecimal	r0050_expaccf_gres_resi;
	private BigDecimal	r0050_expbccf_gres_nonresi;
	private BigDecimal	r0050_expaccf_gres_nonresi;
	private BigDecimal	r0050_expbccf_corp_resi;
	private BigDecimal	r0050_expaccf_corp_resi;
	private BigDecimal	r0050_expbccf_corp_nonresi;
	private BigDecimal	r0050_expaccf_corp_nonresi;
	private BigDecimal	r0050_expbccf_nbfi_resi;
	private BigDecimal	r0050_expaccf_nbfi_resi;
	private BigDecimal	r0050_expbccf_nbfi_nonresi;
	private BigDecimal	r0050_expaccf_nbfi_nonresi;
	private BigDecimal	r0050_expbccf_bank_resi;
	private BigDecimal	r0050_expaccf_bank_resi;
	private BigDecimal	r0050_expbccf_bank_nonresi;
	private BigDecimal	r0050_expaccf_bank_nonresi;
	private BigDecimal	r0050_expbccf_gov_resi;
	private BigDecimal	r0050_expaccf_gov_resi;
	private BigDecimal	r0050_expbccf_gov_nonresi;
	private BigDecimal	r0050_expaccf_gov_nonresi;
	private String	r0060_product;
	private BigDecimal	r0060_expbccf_indiv_resi;
	private BigDecimal	r0060_expaccf_indiv_resi;
	private BigDecimal	r0060_expbccf_indiv_nonresi;
	private BigDecimal	r0060_expaccf_indiv_nonresi;
	private BigDecimal	r0060_expbccf_rsme_resi;
	private BigDecimal	r0060_expaccf_rsme_resi;
	private BigDecimal	r0060_expbccf_rsme_nonresi;
	private BigDecimal	r0060_expaccf_rsme_nonresi;
	private BigDecimal	r0060_expbccf_sme_resi;
	private BigDecimal	r0060_expaccf_sme_resi;
	private BigDecimal	r0060_expbccf_sme_nonresi;
	private BigDecimal	r0060_expaccf_sme_nonresi;
	private BigDecimal	r0060_expbccf_hni_resi;
	private BigDecimal	r0060_expaccf_hni_resi;
	private BigDecimal	r0060_expbccf_hni_nonresi;
	private BigDecimal	r0060_expaccf_hni_nonresi;
	private BigDecimal	r0060_expbccf_gres_resi;
	private BigDecimal	r0060_expaccf_gres_resi;
	private BigDecimal	r0060_expbccf_gres_nonresi;
	private BigDecimal	r0060_expaccf_gres_nonresi;
	private BigDecimal	r0060_expbccf_corp_resi;
	private BigDecimal	r0060_expaccf_corp_resi;
	private BigDecimal	r0060_expbccf_corp_nonresi;
	private BigDecimal	r0060_expaccf_corp_nonresi;
	private BigDecimal	r0060_expbccf_nbfi_resi;
	private BigDecimal	r0060_expaccf_nbfi_resi;
	private BigDecimal	r0060_expbccf_nbfi_nonresi;
	private BigDecimal	r0060_expaccf_nbfi_nonresi;
	private BigDecimal	r0060_expbccf_bank_resi;
	private BigDecimal	r0060_expaccf_bank_resi;
	private BigDecimal	r0060_expbccf_bank_nonresi;
	private BigDecimal	r0060_expaccf_bank_nonresi;
	private BigDecimal	r0060_expbccf_gov_resi;
	private BigDecimal	r0060_expaccf_gov_resi;
	private BigDecimal	r0060_expbccf_gov_nonresi;
	private BigDecimal	r0060_expaccf_gov_nonresi;
	private String	r0070_product;
	private BigDecimal	r0070_expbccf_indiv_resi;
	private BigDecimal	r0070_expaccf_indiv_resi;
	private BigDecimal	r0070_expbccf_indiv_nonresi;
	private BigDecimal	r0070_expaccf_indiv_nonresi;
	private BigDecimal	r0070_expbccf_rsme_resi;
	private BigDecimal	r0070_expaccf_rsme_resi;
	private BigDecimal	r0070_expbccf_rsme_nonresi;
	private BigDecimal	r0070_expaccf_rsme_nonresi;
	private BigDecimal	r0070_expbccf_sme_resi;
	private BigDecimal	r0070_expaccf_sme_resi;
	private BigDecimal	r0070_expbccf_sme_nonresi;
	private BigDecimal	r0070_expaccf_sme_nonresi;
	private BigDecimal	r0070_expbccf_hni_resi;
	private BigDecimal	r0070_expaccf_hni_resi;
	private BigDecimal	r0070_expbccf_hni_nonresi;
	private BigDecimal	r0070_expaccf_hni_nonresi;
	private BigDecimal	r0070_expbccf_gres_resi;
	private BigDecimal	r0070_expaccf_gres_resi;
	private BigDecimal	r0070_expbccf_gres_nonresi;
	private BigDecimal	r0070_expaccf_gres_nonresi;
	private BigDecimal	r0070_expbccf_corp_resi;
	private BigDecimal	r0070_expaccf_corp_resi;
	private BigDecimal	r0070_expbccf_corp_nonresi;
	private BigDecimal	r0070_expaccf_corp_nonresi;
	private BigDecimal	r0070_expbccf_nbfi_resi;
	private BigDecimal	r0070_expaccf_nbfi_resi;
	private BigDecimal	r0070_expbccf_nbfi_nonresi;
	private BigDecimal	r0070_expaccf_nbfi_nonresi;
	private BigDecimal	r0070_expbccf_bank_resi;
	private BigDecimal	r0070_expaccf_bank_resi;
	private BigDecimal	r0070_expbccf_bank_nonresi;
	private BigDecimal	r0070_expaccf_bank_nonresi;
	private BigDecimal	r0070_expbccf_gov_resi;
	private BigDecimal	r0070_expaccf_gov_resi;
	private BigDecimal	r0070_expbccf_gov_nonresi;
	private BigDecimal	r0070_expaccf_gov_nonresi;
	private String	r0080_product;
	private BigDecimal	r0080_expbccf_indiv_resi;
	private BigDecimal	r0080_expaccf_indiv_resi;
	private BigDecimal	r0080_expbccf_indiv_nonresi;
	private BigDecimal	r0080_expaccf_indiv_nonresi;
	private BigDecimal	r0080_expbccf_rsme_resi;
	private BigDecimal	r0080_expaccf_rsme_resi;
	private BigDecimal	r0080_expbccf_rsme_nonresi;
	private BigDecimal	r0080_expaccf_rsme_nonresi;
	private BigDecimal	r0080_expbccf_sme_resi;
	private BigDecimal	r0080_expaccf_sme_resi;
	private BigDecimal	r0080_expbccf_sme_nonresi;
	private BigDecimal	r0080_expaccf_sme_nonresi;
	private BigDecimal	r0080_expbccf_hni_resi;
	private BigDecimal	r0080_expaccf_hni_resi;
	private BigDecimal	r0080_expbccf_hni_nonresi;
	private BigDecimal	r0080_expaccf_hni_nonresi;
	private BigDecimal	r0080_expbccf_gres_resi;
	private BigDecimal	r0080_expaccf_gres_resi;
	private BigDecimal	r0080_expbccf_gres_nonresi;
	private BigDecimal	r0080_expaccf_gres_nonresi;
	private BigDecimal	r0080_expbccf_corp_resi;
	private BigDecimal	r0080_expaccf_corp_resi;
	private BigDecimal	r0080_expbccf_corp_nonresi;
	private BigDecimal	r0080_expaccf_corp_nonresi;
	private BigDecimal	r0080_expbccf_nbfi_resi;
	private BigDecimal	r0080_expaccf_nbfi_resi;
	private BigDecimal	r0080_expbccf_nbfi_nonresi;
	private BigDecimal	r0080_expaccf_nbfi_nonresi;
	private BigDecimal	r0080_expbccf_bank_resi;
	private BigDecimal	r0080_expaccf_bank_resi;
	private BigDecimal	r0080_expbccf_bank_nonresi;
	private BigDecimal	r0080_expaccf_bank_nonresi;
	private BigDecimal	r0080_expbccf_gov_resi;
	private BigDecimal	r0080_expaccf_gov_resi;
	private BigDecimal	r0080_expbccf_gov_nonresi;
	private BigDecimal	r0080_expaccf_gov_nonresi;
	private String	r0090_product;
	private BigDecimal	r0090_expbccf_indiv_resi;
	private BigDecimal	r0090_expaccf_indiv_resi;
	private BigDecimal	r0090_expbccf_indiv_nonresi;
	private BigDecimal	r0090_expaccf_indiv_nonresi;
	private BigDecimal	r0090_expbccf_rsme_resi;
	private BigDecimal	r0090_expaccf_rsme_resi;
	private BigDecimal	r0090_expbccf_rsme_nonresi;
	private BigDecimal	r0090_expaccf_rsme_nonresi;
	private BigDecimal	r0090_expbccf_sme_resi;
	private BigDecimal	r0090_expaccf_sme_resi;
	private BigDecimal	r0090_expbccf_sme_nonresi;
	private BigDecimal	r0090_expaccf_sme_nonresi;
	private BigDecimal	r0090_expbccf_hni_resi;
	private BigDecimal	r0090_expaccf_hni_resi;
	private BigDecimal	r0090_expbccf_hni_nonresi;
	private BigDecimal	r0090_expaccf_hni_nonresi;
	private BigDecimal	r0090_expbccf_gres_resi;
	private BigDecimal	r0090_expaccf_gres_resi;
	private BigDecimal	r0090_expbccf_gres_nonresi;
	private BigDecimal	r0090_expaccf_gres_nonresi;
	private BigDecimal	r0090_expbccf_corp_resi;
	private BigDecimal	r0090_expaccf_corp_resi;
	private BigDecimal	r0090_expbccf_corp_nonresi;
	private BigDecimal	r0090_expaccf_corp_nonresi;
	private BigDecimal	r0090_expbccf_nbfi_resi;
	private BigDecimal	r0090_expaccf_nbfi_resi;
	private BigDecimal	r0090_expbccf_nbfi_nonresi;
	private BigDecimal	r0090_expaccf_nbfi_nonresi;
	private BigDecimal	r0090_expbccf_bank_resi;
	private BigDecimal	r0090_expaccf_bank_resi;
	private BigDecimal	r0090_expbccf_bank_nonresi;
	private BigDecimal	r0090_expaccf_bank_nonresi;
	private BigDecimal	r0090_expbccf_gov_resi;
	private BigDecimal	r0090_expaccf_gov_resi;
	private BigDecimal	r0090_expbccf_gov_nonresi;
	private BigDecimal	r0090_expaccf_gov_nonresi;
	private String	r0100_product;
	private BigDecimal	r0100_expbccf_indiv_resi;
	private BigDecimal	r0100_expaccf_indiv_resi;
	private BigDecimal	r0100_expbccf_indiv_nonresi;
	private BigDecimal	r0100_expaccf_indiv_nonresi;
	private BigDecimal	r0100_expbccf_rsme_resi;
	private BigDecimal	r0100_expaccf_rsme_resi;
	private BigDecimal	r0100_expbccf_rsme_nonresi;
	private BigDecimal	r0100_expaccf_rsme_nonresi;
	private BigDecimal	r0100_expbccf_sme_resi;
	private BigDecimal	r0100_expaccf_sme_resi;
	private BigDecimal	r0100_expbccf_sme_nonresi;
	private BigDecimal	r0100_expaccf_sme_nonresi;
	private BigDecimal	r0100_expbccf_hni_resi;
	private BigDecimal	r0100_expaccf_hni_resi;
	private BigDecimal	r0100_expbccf_hni_nonresi;
	private BigDecimal	r0100_expaccf_hni_nonresi;
	private BigDecimal	r0100_expbccf_gres_resi;
	private BigDecimal	r0100_expaccf_gres_resi;
	private BigDecimal	r0100_expbccf_gres_nonresi;
	private BigDecimal	r0100_expaccf_gres_nonresi;
	private BigDecimal	r0100_expbccf_corp_resi;
	private BigDecimal	r0100_expaccf_corp_resi;
	private BigDecimal	r0100_expbccf_corp_nonresi;
	private BigDecimal	r0100_expaccf_corp_nonresi;
	private BigDecimal	r0100_expbccf_nbfi_resi;
	private BigDecimal	r0100_expaccf_nbfi_resi;
	private BigDecimal	r0100_expbccf_nbfi_nonresi;
	private BigDecimal	r0100_expaccf_nbfi_nonresi;
	private BigDecimal	r0100_expbccf_bank_resi;
	private BigDecimal	r0100_expaccf_bank_resi;
	private BigDecimal	r0100_expbccf_bank_nonresi;
	private BigDecimal	r0100_expaccf_bank_nonresi;
	private BigDecimal	r0100_expbccf_gov_resi;
	private BigDecimal	r0100_expaccf_gov_resi;
	private BigDecimal	r0100_expbccf_gov_nonresi;
	private BigDecimal	r0100_expaccf_gov_nonresi;
	private String	r0110_product;
	private BigDecimal	r0110_expbccf_indiv_resi;
	private BigDecimal	r0110_expaccf_indiv_resi;
	private BigDecimal	r0110_expbccf_indiv_nonresi;
	private BigDecimal	r0110_expaccf_indiv_nonresi;
	private BigDecimal	r0110_expbccf_rsme_resi;
	private BigDecimal	r0110_expaccf_rsme_resi;
	private BigDecimal	r0110_expbccf_rsme_nonresi;
	private BigDecimal	r0110_expaccf_rsme_nonresi;
	private BigDecimal	r0110_expbccf_sme_resi;
	private BigDecimal	r0110_expaccf_sme_resi;
	private BigDecimal	r0110_expbccf_sme_nonresi;
	private BigDecimal	r0110_expaccf_sme_nonresi;
	private BigDecimal	r0110_expbccf_hni_resi;
	private BigDecimal	r0110_expaccf_hni_resi;
	private BigDecimal	r0110_expbccf_hni_nonresi;
	private BigDecimal	r0110_expaccf_hni_nonresi;
	private BigDecimal	r0110_expbccf_gres_resi;
	private BigDecimal	r0110_expaccf_gres_resi;
	private BigDecimal	r0110_expbccf_gres_nonresi;
	private BigDecimal	r0110_expaccf_gres_nonresi;
	private BigDecimal	r0110_expbccf_corp_resi;
	private BigDecimal	r0110_expaccf_corp_resi;
	private BigDecimal	r0110_expbccf_corp_nonresi;
	private BigDecimal	r0110_expaccf_corp_nonresi;
	private BigDecimal	r0110_expbccf_nbfi_resi;
	private BigDecimal	r0110_expaccf_nbfi_resi;
	private BigDecimal	r0110_expbccf_nbfi_nonresi;
	private BigDecimal	r0110_expaccf_nbfi_nonresi;
	private BigDecimal	r0110_expbccf_bank_resi;
	private BigDecimal	r0110_expaccf_bank_resi;
	private BigDecimal	r0110_expbccf_bank_nonresi;
	private BigDecimal	r0110_expaccf_bank_nonresi;
	private BigDecimal	r0110_expbccf_gov_resi;
	private BigDecimal	r0110_expaccf_gov_resi;
	private BigDecimal	r0110_expbccf_gov_nonresi;
	private BigDecimal	r0110_expaccf_gov_nonresi;
	private String	r0120_product;
	private BigDecimal	r0120_expbccf_indiv_resi;
	private BigDecimal	r0120_expaccf_indiv_resi;
	private BigDecimal	r0120_expbccf_indiv_nonresi;
	private BigDecimal	r0120_expaccf_indiv_nonresi;
	private BigDecimal	r0120_expbccf_rsme_resi;
	private BigDecimal	r0120_expaccf_rsme_resi;
	private BigDecimal	r0120_expbccf_rsme_nonresi;
	private BigDecimal	r0120_expaccf_rsme_nonresi;
	private BigDecimal	r0120_expbccf_sme_resi;
	private BigDecimal	r0120_expaccf_sme_resi;
	private BigDecimal	r0120_expbccf_sme_nonresi;
	private BigDecimal	r0120_expaccf_sme_nonresi;
	private BigDecimal	r0120_expbccf_hni_resi;
	private BigDecimal	r0120_expaccf_hni_resi;
	private BigDecimal	r0120_expbccf_hni_nonresi;
	private BigDecimal	r0120_expaccf_hni_nonresi;
	private BigDecimal	r0120_expbccf_gres_resi;
	private BigDecimal	r0120_expaccf_gres_resi;
	private BigDecimal	r0120_expbccf_gres_nonresi;
	private BigDecimal	r0120_expaccf_gres_nonresi;
	private BigDecimal	r0120_expbccf_corp_resi;
	private BigDecimal	r0120_expaccf_corp_resi;
	private BigDecimal	r0120_expbccf_corp_nonresi;
	private BigDecimal	r0120_expaccf_corp_nonresi;
	private BigDecimal	r0120_expbccf_nbfi_resi;
	private BigDecimal	r0120_expaccf_nbfi_resi;
	private BigDecimal	r0120_expbccf_nbfi_nonresi;
	private BigDecimal	r0120_expaccf_nbfi_nonresi;
	private BigDecimal	r0120_expbccf_bank_resi;
	private BigDecimal	r0120_expaccf_bank_resi;
	private BigDecimal	r0120_expbccf_bank_nonresi;
	private BigDecimal	r0120_expaccf_bank_nonresi;
	private BigDecimal	r0120_expbccf_gov_resi;
	private BigDecimal	r0120_expaccf_gov_resi;
	private BigDecimal	r0120_expbccf_gov_nonresi;
	private BigDecimal	r0120_expaccf_gov_nonresi;
	private String	r0130_product;
	private BigDecimal	r0130_expbccf_indiv_resi;
	private BigDecimal	r0130_expaccf_indiv_resi;
	private BigDecimal	r0130_expbccf_indiv_nonresi;
	private BigDecimal	r0130_expaccf_indiv_nonresi;
	private BigDecimal	r0130_expbccf_rsme_resi;
	private BigDecimal	r0130_expaccf_rsme_resi;
	private BigDecimal	r0130_expbccf_rsme_nonresi;
	private BigDecimal	r0130_expaccf_rsme_nonresi;
	private BigDecimal	r0130_expbccf_sme_resi;
	private BigDecimal	r0130_expaccf_sme_resi;
	private BigDecimal	r0130_expbccf_sme_nonresi;
	private BigDecimal	r0130_expaccf_sme_nonresi;
	private BigDecimal	r0130_expbccf_hni_resi;
	private BigDecimal	r0130_expaccf_hni_resi;
	private BigDecimal	r0130_expbccf_hni_nonresi;
	private BigDecimal	r0130_expaccf_hni_nonresi;
	private BigDecimal	r0130_expbccf_gres_resi;
	private BigDecimal	r0130_expaccf_gres_resi;
	private BigDecimal	r0130_expbccf_gres_nonresi;
	private BigDecimal	r0130_expaccf_gres_nonresi;
	private BigDecimal	r0130_expbccf_corp_resi;
	private BigDecimal	r0130_expaccf_corp_resi;
	private BigDecimal	r0130_expbccf_corp_nonresi;
	private BigDecimal	r0130_expaccf_corp_nonresi;
	private BigDecimal	r0130_expbccf_nbfi_resi;
	private BigDecimal	r0130_expaccf_nbfi_resi;
	private BigDecimal	r0130_expbccf_nbfi_nonresi;
	private BigDecimal	r0130_expaccf_nbfi_nonresi;
	private BigDecimal	r0130_expbccf_bank_resi;
	private BigDecimal	r0130_expaccf_bank_resi;
	private BigDecimal	r0130_expbccf_bank_nonresi;
	private BigDecimal	r0130_expaccf_bank_nonresi;
	private BigDecimal	r0130_expbccf_gov_resi;
	private BigDecimal	r0130_expaccf_gov_resi;
	private BigDecimal	r0130_expbccf_gov_nonresi;
	private BigDecimal	r0130_expaccf_gov_nonresi;
	private String	r0140_product;
	private BigDecimal	r0140_expbccf_indiv_resi;
	private BigDecimal	r0140_expaccf_indiv_resi;
	private BigDecimal	r0140_expbccf_indiv_nonresi;
	private BigDecimal	r0140_expaccf_indiv_nonresi;
	private BigDecimal	r0140_expbccf_rsme_resi;
	private BigDecimal	r0140_expaccf_rsme_resi;
	private BigDecimal	r0140_expbccf_rsme_nonresi;
	private BigDecimal	r0140_expaccf_rsme_nonresi;
	private BigDecimal	r0140_expbccf_sme_resi;
	private BigDecimal	r0140_expaccf_sme_resi;
	private BigDecimal	r0140_expbccf_sme_nonresi;
	private BigDecimal	r0140_expaccf_sme_nonresi;
	private BigDecimal	r0140_expbccf_hni_resi;
	private BigDecimal	r0140_expaccf_hni_resi;
	private BigDecimal	r0140_expbccf_hni_nonresi;
	private BigDecimal	r0140_expaccf_hni_nonresi;
	private BigDecimal	r0140_expbccf_gres_resi;
	private BigDecimal	r0140_expaccf_gres_resi;
	private BigDecimal	r0140_expbccf_gres_nonresi;
	private BigDecimal	r0140_expaccf_gres_nonresi;
	private BigDecimal	r0140_expbccf_corp_resi;
	private BigDecimal	r0140_expaccf_corp_resi;
	private BigDecimal	r0140_expbccf_corp_nonresi;
	private BigDecimal	r0140_expaccf_corp_nonresi;
	private BigDecimal	r0140_expbccf_nbfi_resi;
	private BigDecimal	r0140_expaccf_nbfi_resi;
	private BigDecimal	r0140_expbccf_nbfi_nonresi;
	private BigDecimal	r0140_expaccf_nbfi_nonresi;
	private BigDecimal	r0140_expbccf_bank_resi;
	private BigDecimal	r0140_expaccf_bank_resi;
	private BigDecimal	r0140_expbccf_bank_nonresi;
	private BigDecimal	r0140_expaccf_bank_nonresi;
	private BigDecimal	r0140_expbccf_gov_resi;
	private BigDecimal	r0140_expaccf_gov_resi;
	private BigDecimal	r0140_expbccf_gov_nonresi;
	private BigDecimal	r0140_expaccf_gov_nonresi;
	private String	r0150_product;
	private BigDecimal	r0150_expbccf_indiv_resi;
	private BigDecimal	r0150_expaccf_indiv_resi;
	private BigDecimal	r0150_expbccf_indiv_nonresi;
	private BigDecimal	r0150_expaccf_indiv_nonresi;
	private BigDecimal	r0150_expbccf_rsme_resi;
	private BigDecimal	r0150_expaccf_rsme_resi;
	private BigDecimal	r0150_expbccf_rsme_nonresi;
	private BigDecimal	r0150_expaccf_rsme_nonresi;
	private BigDecimal	r0150_expbccf_sme_resi;
	private BigDecimal	r0150_expaccf_sme_resi;
	private BigDecimal	r0150_expbccf_sme_nonresi;
	private BigDecimal	r0150_expaccf_sme_nonresi;
	private BigDecimal	r0150_expbccf_hni_resi;
	private BigDecimal	r0150_expaccf_hni_resi;
	private BigDecimal	r0150_expbccf_hni_nonresi;
	private BigDecimal	r0150_expaccf_hni_nonresi;
	private BigDecimal	r0150_expbccf_gres_resi;
	private BigDecimal	r0150_expaccf_gres_resi;
	private BigDecimal	r0150_expbccf_gres_nonresi;
	private BigDecimal	r0150_expaccf_gres_nonresi;
	private BigDecimal	r0150_expbccf_corp_resi;
	private BigDecimal	r0150_expaccf_corp_resi;
	private BigDecimal	r0150_expbccf_corp_nonresi;
	private BigDecimal	r0150_expaccf_corp_nonresi;
	private BigDecimal	r0150_expbccf_nbfi_resi;
	private BigDecimal	r0150_expaccf_nbfi_resi;
	private BigDecimal	r0150_expbccf_nbfi_nonresi;
	private BigDecimal	r0150_expaccf_nbfi_nonresi;
	private BigDecimal	r0150_expbccf_bank_resi;
	private BigDecimal	r0150_expaccf_bank_resi;
	private BigDecimal	r0150_expbccf_bank_nonresi;
	private BigDecimal	r0150_expaccf_bank_nonresi;
	private BigDecimal	r0150_expbccf_gov_resi;
	private BigDecimal	r0150_expaccf_gov_resi;
	private BigDecimal	r0150_expbccf_gov_nonresi;
	private BigDecimal	r0150_expaccf_gov_nonresi;
	private String	r0160_product;
	private BigDecimal	r0160_expbccf_indiv_resi;
	private BigDecimal	r0160_expaccf_indiv_resi;
	private BigDecimal	r0160_expbccf_indiv_nonresi;
	private BigDecimal	r0160_expaccf_indiv_nonresi;
	private BigDecimal	r0160_expbccf_rsme_resi;
	private BigDecimal	r0160_expaccf_rsme_resi;
	private BigDecimal	r0160_expbccf_rsme_nonresi;
	private BigDecimal	r0160_expaccf_rsme_nonresi;
	private BigDecimal	r0160_expbccf_sme_resi;
	private BigDecimal	r0160_expaccf_sme_resi;
	private BigDecimal	r0160_expbccf_sme_nonresi;
	private BigDecimal	r0160_expaccf_sme_nonresi;
	private BigDecimal	r0160_expbccf_hni_resi;
	private BigDecimal	r0160_expaccf_hni_resi;
	private BigDecimal	r0160_expbccf_hni_nonresi;
	private BigDecimal	r0160_expaccf_hni_nonresi;
	private BigDecimal	r0160_expbccf_gres_resi;
	private BigDecimal	r0160_expaccf_gres_resi;
	private BigDecimal	r0160_expbccf_gres_nonresi;
	private BigDecimal	r0160_expaccf_gres_nonresi;
	private BigDecimal	r0160_expbccf_corp_resi;
	private BigDecimal	r0160_expaccf_corp_resi;
	private BigDecimal	r0160_expbccf_corp_nonresi;
	private BigDecimal	r0160_expaccf_corp_nonresi;
	private BigDecimal	r0160_expbccf_nbfi_resi;
	private BigDecimal	r0160_expaccf_nbfi_resi;
	private BigDecimal	r0160_expbccf_nbfi_nonresi;
	private BigDecimal	r0160_expaccf_nbfi_nonresi;
	private BigDecimal	r0160_expbccf_bank_resi;
	private BigDecimal	r0160_expaccf_bank_resi;
	private BigDecimal	r0160_expbccf_bank_nonresi;
	private BigDecimal	r0160_expaccf_bank_nonresi;
	private BigDecimal	r0160_expbccf_gov_resi;
	private BigDecimal	r0160_expaccf_gov_resi;
	private BigDecimal	r0160_expbccf_gov_nonresi;
	private BigDecimal	r0160_expaccf_gov_nonresi;
	private String	r0170_product;
	private BigDecimal	r0170_expbccf_indiv_resi;
	private BigDecimal	r0170_expaccf_indiv_resi;
	private BigDecimal	r0170_expbccf_indiv_nonresi;
	private BigDecimal	r0170_expaccf_indiv_nonresi;
	private BigDecimal	r0170_expbccf_rsme_resi;
	private BigDecimal	r0170_expaccf_rsme_resi;
	private BigDecimal	r0170_expbccf_rsme_nonresi;
	private BigDecimal	r0170_expaccf_rsme_nonresi;
	private BigDecimal	r0170_expbccf_sme_resi;
	private BigDecimal	r0170_expaccf_sme_resi;
	private BigDecimal	r0170_expbccf_sme_nonresi;
	private BigDecimal	r0170_expaccf_sme_nonresi;
	private BigDecimal	r0170_expbccf_hni_resi;
	private BigDecimal	r0170_expaccf_hni_resi;
	private BigDecimal	r0170_expbccf_hni_nonresi;
	private BigDecimal	r0170_expaccf_hni_nonresi;
	private BigDecimal	r0170_expbccf_gres_resi;
	private BigDecimal	r0170_expaccf_gres_resi;
	private BigDecimal	r0170_expbccf_gres_nonresi;
	private BigDecimal	r0170_expaccf_gres_nonresi;
	private BigDecimal	r0170_expbccf_corp_resi;
	private BigDecimal	r0170_expaccf_corp_resi;
	private BigDecimal	r0170_expbccf_corp_nonresi;
	private BigDecimal	r0170_expaccf_corp_nonresi;
	private BigDecimal	r0170_expbccf_nbfi_resi;
	private BigDecimal	r0170_expaccf_nbfi_resi;
	private BigDecimal	r0170_expbccf_nbfi_nonresi;
	private BigDecimal	r0170_expaccf_nbfi_nonresi;
	private BigDecimal	r0170_expbccf_bank_resi;
	private BigDecimal	r0170_expaccf_bank_resi;
	private BigDecimal	r0170_expbccf_bank_nonresi;
	private BigDecimal	r0170_expaccf_bank_nonresi;
	private BigDecimal	r0170_expbccf_gov_resi;
	private BigDecimal	r0170_expaccf_gov_resi;
	private BigDecimal	r0170_expbccf_gov_nonresi;
	private BigDecimal	r0170_expaccf_gov_nonresi;
	private String	r0180_product;
	private BigDecimal	r0180_expbccf_indiv_resi;
	private BigDecimal	r0180_expaccf_indiv_resi;
	private BigDecimal	r0180_expbccf_indiv_nonresi;
	private BigDecimal	r0180_expaccf_indiv_nonresi;
	private BigDecimal	r0180_expbccf_rsme_resi;
	private BigDecimal	r0180_expaccf_rsme_resi;
	private BigDecimal	r0180_expbccf_rsme_nonresi;
	private BigDecimal	r0180_expaccf_rsme_nonresi;
	private BigDecimal	r0180_expbccf_sme_resi;
	private BigDecimal	r0180_expaccf_sme_resi;
	private BigDecimal	r0180_expbccf_sme_nonresi;
	private BigDecimal	r0180_expaccf_sme_nonresi;
	private BigDecimal	r0180_expbccf_hni_resi;
	private BigDecimal	r0180_expaccf_hni_resi;
	private BigDecimal	r0180_expbccf_hni_nonresi;
	private BigDecimal	r0180_expaccf_hni_nonresi;
	private BigDecimal	r0180_expbccf_gres_resi;
	private BigDecimal	r0180_expaccf_gres_resi;
	private BigDecimal	r0180_expbccf_gres_nonresi;
	private BigDecimal	r0180_expaccf_gres_nonresi;
	private BigDecimal	r0180_expbccf_corp_resi;
	private BigDecimal	r0180_expaccf_corp_resi;
	private BigDecimal	r0180_expbccf_corp_nonresi;
	private BigDecimal	r0180_expaccf_corp_nonresi;
	private BigDecimal	r0180_expbccf_nbfi_resi;
	private BigDecimal	r0180_expaccf_nbfi_resi;
	private BigDecimal	r0180_expbccf_nbfi_nonresi;
	private BigDecimal	r0180_expaccf_nbfi_nonresi;
	private BigDecimal	r0180_expbccf_bank_resi;
	private BigDecimal	r0180_expaccf_bank_resi;
	private BigDecimal	r0180_expbccf_bank_nonresi;
	private BigDecimal	r0180_expaccf_bank_nonresi;
	private BigDecimal	r0180_expbccf_gov_resi;
	private BigDecimal	r0180_expaccf_gov_resi;
	private BigDecimal	r0180_expbccf_gov_nonresi;
	private BigDecimal	r0180_expaccf_gov_nonresi;
	private String	r0190_product;
	private BigDecimal	r0190_expbccf_indiv_resi;
	private BigDecimal	r0190_expaccf_indiv_resi;
	private BigDecimal	r0190_expbccf_indiv_nonresi;
	private BigDecimal	r0190_expaccf_indiv_nonresi;
	private BigDecimal	r0190_expbccf_rsme_resi;
	private BigDecimal	r0190_expaccf_rsme_resi;
	private BigDecimal	r0190_expbccf_rsme_nonresi;
	private BigDecimal	r0190_expaccf_rsme_nonresi;
	private BigDecimal	r0190_expbccf_sme_resi;
	private BigDecimal	r0190_expaccf_sme_resi;
	private BigDecimal	r0190_expbccf_sme_nonresi;
	private BigDecimal	r0190_expaccf_sme_nonresi;
	private BigDecimal	r0190_expbccf_hni_resi;
	private BigDecimal	r0190_expaccf_hni_resi;
	private BigDecimal	r0190_expbccf_hni_nonresi;
	private BigDecimal	r0190_expaccf_hni_nonresi;
	private BigDecimal	r0190_expbccf_gres_resi;
	private BigDecimal	r0190_expaccf_gres_resi;
	private BigDecimal	r0190_expbccf_gres_nonresi;
	private BigDecimal	r0190_expaccf_gres_nonresi;
	private BigDecimal	r0190_expbccf_corp_resi;
	private BigDecimal	r0190_expaccf_corp_resi;
	private BigDecimal	r0190_expbccf_corp_nonresi;
	private BigDecimal	r0190_expaccf_corp_nonresi;
	private BigDecimal	r0190_expbccf_nbfi_resi;
	private BigDecimal	r0190_expaccf_nbfi_resi;
	private BigDecimal	r0190_expbccf_nbfi_nonresi;
	private BigDecimal	r0190_expaccf_nbfi_nonresi;
	private BigDecimal	r0190_expbccf_bank_resi;
	private BigDecimal	r0190_expaccf_bank_resi;
	private BigDecimal	r0190_expbccf_bank_nonresi;
	private BigDecimal	r0190_expaccf_bank_nonresi;
	private BigDecimal	r0190_expbccf_gov_resi;
	private BigDecimal	r0190_expaccf_gov_resi;
	private BigDecimal	r0190_expbccf_gov_nonresi;
	private BigDecimal	r0190_expaccf_gov_nonresi;
	private String	r0200_product;
	private BigDecimal	r0200_expbccf_indiv_resi;
	private BigDecimal	r0200_expaccf_indiv_resi;
	private BigDecimal	r0200_expbccf_indiv_nonresi;
	private BigDecimal	r0200_expaccf_indiv_nonresi;
	private BigDecimal	r0200_expbccf_rsme_resi;
	private BigDecimal	r0200_expaccf_rsme_resi;
	private BigDecimal	r0200_expbccf_rsme_nonresi;
	private BigDecimal	r0200_expaccf_rsme_nonresi;
	private BigDecimal	r0200_expbccf_sme_resi;
	private BigDecimal	r0200_expaccf_sme_resi;
	private BigDecimal	r0200_expbccf_sme_nonresi;
	private BigDecimal	r0200_expaccf_sme_nonresi;
	private BigDecimal	r0200_expbccf_hni_resi;
	private BigDecimal	r0200_expaccf_hni_resi;
	private BigDecimal	r0200_expbccf_hni_nonresi;
	private BigDecimal	r0200_expaccf_hni_nonresi;
	private BigDecimal	r0200_expbccf_gres_resi;
	private BigDecimal	r0200_expaccf_gres_resi;
	private BigDecimal	r0200_expbccf_gres_nonresi;
	private BigDecimal	r0200_expaccf_gres_nonresi;
	private BigDecimal	r0200_expbccf_corp_resi;
	private BigDecimal	r0200_expaccf_corp_resi;
	private BigDecimal	r0200_expbccf_corp_nonresi;
	private BigDecimal	r0200_expaccf_corp_nonresi;
	private BigDecimal	r0200_expbccf_nbfi_resi;
	private BigDecimal	r0200_expaccf_nbfi_resi;
	private BigDecimal	r0200_expbccf_nbfi_nonresi;
	private BigDecimal	r0200_expaccf_nbfi_nonresi;
	private BigDecimal	r0200_expbccf_bank_resi;
	private BigDecimal	r0200_expaccf_bank_resi;
	private BigDecimal	r0200_expbccf_bank_nonresi;
	private BigDecimal	r0200_expaccf_bank_nonresi;
	private BigDecimal	r0200_expbccf_gov_resi;
	private BigDecimal	r0200_expaccf_gov_resi;
	private BigDecimal	r0200_expbccf_gov_nonresi;
	private BigDecimal	r0200_expaccf_gov_nonresi;
	private String	r0210_product;
	private BigDecimal	r0210_expbccf_indiv_resi;
	private BigDecimal	r0210_expaccf_indiv_resi;
	private BigDecimal	r0210_expbccf_indiv_nonresi;
	private BigDecimal	r0210_expaccf_indiv_nonresi;
	private BigDecimal	r0210_expbccf_rsme_resi;
	private BigDecimal	r0210_expaccf_rsme_resi;
	private BigDecimal	r0210_expbccf_rsme_nonresi;
	private BigDecimal	r0210_expaccf_rsme_nonresi;
	private BigDecimal	r0210_expbccf_sme_resi;
	private BigDecimal	r0210_expaccf_sme_resi;
	private BigDecimal	r0210_expbccf_sme_nonresi;
	private BigDecimal	r0210_expaccf_sme_nonresi;
	private BigDecimal	r0210_expbccf_hni_resi;
	private BigDecimal	r0210_expaccf_hni_resi;
	private BigDecimal	r0210_expbccf_hni_nonresi;
	private BigDecimal	r0210_expaccf_hni_nonresi;
	private BigDecimal	r0210_expbccf_gres_resi;
	private BigDecimal	r0210_expaccf_gres_resi;
	private BigDecimal	r0210_expbccf_gres_nonresi;
	private BigDecimal	r0210_expaccf_gres_nonresi;
	private BigDecimal	r0210_expbccf_corp_resi;
	private BigDecimal	r0210_expaccf_corp_resi;
	private BigDecimal	r0210_expbccf_corp_nonresi;
	private BigDecimal	r0210_expaccf_corp_nonresi;
	private BigDecimal	r0210_expbccf_nbfi_resi;
	private BigDecimal	r0210_expaccf_nbfi_resi;
	private BigDecimal	r0210_expbccf_nbfi_nonresi;
	private BigDecimal	r0210_expaccf_nbfi_nonresi;
	private BigDecimal	r0210_expbccf_bank_resi;
	private BigDecimal	r0210_expaccf_bank_resi;
	private BigDecimal	r0210_expbccf_bank_nonresi;
	private BigDecimal	r0210_expaccf_bank_nonresi;
	private BigDecimal	r0210_expbccf_gov_resi;
	private BigDecimal	r0210_expaccf_gov_resi;
	private BigDecimal	r0210_expbccf_gov_nonresi;
	private BigDecimal	r0210_expaccf_gov_nonresi;
	private String	r0220_product;
	private BigDecimal	r0220_expbccf_indiv_resi;
	private BigDecimal	r0220_expaccf_indiv_resi;
	private BigDecimal	r0220_expbccf_indiv_nonresi;
	private BigDecimal	r0220_expaccf_indiv_nonresi;
	private BigDecimal	r0220_expbccf_rsme_resi;
	private BigDecimal	r0220_expaccf_rsme_resi;
	private BigDecimal	r0220_expbccf_rsme_nonresi;
	private BigDecimal	r0220_expaccf_rsme_nonresi;
	private BigDecimal	r0220_expbccf_sme_resi;
	private BigDecimal	r0220_expaccf_sme_resi;
	private BigDecimal	r0220_expbccf_sme_nonresi;
	private BigDecimal	r0220_expaccf_sme_nonresi;
	private BigDecimal	r0220_expbccf_hni_resi;
	private BigDecimal	r0220_expaccf_hni_resi;
	private BigDecimal	r0220_expbccf_hni_nonresi;
	private BigDecimal	r0220_expaccf_hni_nonresi;
	private BigDecimal	r0220_expbccf_gres_resi;
	private BigDecimal	r0220_expaccf_gres_resi;
	private BigDecimal	r0220_expbccf_gres_nonresi;
	private BigDecimal	r0220_expaccf_gres_nonresi;
	private BigDecimal	r0220_expbccf_corp_resi;
	private BigDecimal	r0220_expaccf_corp_resi;
	private BigDecimal	r0220_expbccf_corp_nonresi;
	private BigDecimal	r0220_expaccf_corp_nonresi;
	private BigDecimal	r0220_expbccf_nbfi_resi;
	private BigDecimal	r0220_expaccf_nbfi_resi;
	private BigDecimal	r0220_expbccf_nbfi_nonresi;
	private BigDecimal	r0220_expaccf_nbfi_nonresi;
	private BigDecimal	r0220_expbccf_bank_resi;
	private BigDecimal	r0220_expaccf_bank_resi;
	private BigDecimal	r0220_expbccf_bank_nonresi;
	private BigDecimal	r0220_expaccf_bank_nonresi;
	private BigDecimal	r0220_expbccf_gov_resi;
	private BigDecimal	r0220_expaccf_gov_resi;
	private BigDecimal	r0220_expbccf_gov_nonresi;
	private BigDecimal	r0220_expaccf_gov_nonresi;
	private String	r0230_product;
	private BigDecimal	r0230_expbccf_indiv_resi;
	private BigDecimal	r0230_expaccf_indiv_resi;
	private BigDecimal	r0230_expbccf_indiv_nonresi;
	private BigDecimal	r0230_expaccf_indiv_nonresi;
	private BigDecimal	r0230_expbccf_rsme_resi;
	private BigDecimal	r0230_expaccf_rsme_resi;
	private BigDecimal	r0230_expbccf_rsme_nonresi;
	private BigDecimal	r0230_expaccf_rsme_nonresi;
	private BigDecimal	r0230_expbccf_sme_resi;
	private BigDecimal	r0230_expaccf_sme_resi;
	private BigDecimal	r0230_expbccf_sme_nonresi;
	private BigDecimal	r0230_expaccf_sme_nonresi;
	private BigDecimal	r0230_expbccf_hni_resi;
	private BigDecimal	r0230_expaccf_hni_resi;
	private BigDecimal	r0230_expbccf_hni_nonresi;
	private BigDecimal	r0230_expaccf_hni_nonresi;
	private BigDecimal	r0230_expbccf_gres_resi;
	private BigDecimal	r0230_expaccf_gres_resi;
	private BigDecimal	r0230_expbccf_gres_nonresi;
	private BigDecimal	r0230_expaccf_gres_nonresi;
	private BigDecimal	r0230_expbccf_corp_resi;
	private BigDecimal	r0230_expaccf_corp_resi;
	private BigDecimal	r0230_expbccf_corp_nonresi;
	private BigDecimal	r0230_expaccf_corp_nonresi;
	private BigDecimal	r0230_expbccf_nbfi_resi;
	private BigDecimal	r0230_expaccf_nbfi_resi;
	private BigDecimal	r0230_expbccf_nbfi_nonresi;
	private BigDecimal	r0230_expaccf_nbfi_nonresi;
	private BigDecimal	r0230_expbccf_bank_resi;
	private BigDecimal	r0230_expaccf_bank_resi;
	private BigDecimal	r0230_expbccf_bank_nonresi;
	private BigDecimal	r0230_expaccf_bank_nonresi;
	private BigDecimal	r0230_expbccf_gov_resi;
	private BigDecimal	r0230_expaccf_gov_resi;
	private BigDecimal	r0230_expbccf_gov_nonresi;
	private BigDecimal	r0230_expaccf_gov_nonresi;

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

	
	
	



		public String getR0010_product() {
		return r0010_product;
	}







	public void setR0010_product(String r0010_product) {
		this.r0010_product = r0010_product;
	}







	public BigDecimal getR0010_expbccf_indiv_resi() {
		return r0010_expbccf_indiv_resi;
	}







	public void setR0010_expbccf_indiv_resi(BigDecimal r0010_expbccf_indiv_resi) {
		this.r0010_expbccf_indiv_resi = r0010_expbccf_indiv_resi;
	}







	public BigDecimal getR0010_expaccf_indiv_resi() {
		return r0010_expaccf_indiv_resi;
	}







	public void setR0010_expaccf_indiv_resi(BigDecimal r0010_expaccf_indiv_resi) {
		this.r0010_expaccf_indiv_resi = r0010_expaccf_indiv_resi;
	}







	public BigDecimal getR0010_expbccf_indiv_nonresi() {
		return r0010_expbccf_indiv_nonresi;
	}







	public void setR0010_expbccf_indiv_nonresi(BigDecimal r0010_expbccf_indiv_nonresi) {
		this.r0010_expbccf_indiv_nonresi = r0010_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0010_expaccf_indiv_nonresi() {
		return r0010_expaccf_indiv_nonresi;
	}







	public void setR0010_expaccf_indiv_nonresi(BigDecimal r0010_expaccf_indiv_nonresi) {
		this.r0010_expaccf_indiv_nonresi = r0010_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0010_expbccf_rsme_resi() {
		return r0010_expbccf_rsme_resi;
	}







	public void setR0010_expbccf_rsme_resi(BigDecimal r0010_expbccf_rsme_resi) {
		this.r0010_expbccf_rsme_resi = r0010_expbccf_rsme_resi;
	}







	public BigDecimal getR0010_expaccf_rsme_resi() {
		return r0010_expaccf_rsme_resi;
	}







	public void setR0010_expaccf_rsme_resi(BigDecimal r0010_expaccf_rsme_resi) {
		this.r0010_expaccf_rsme_resi = r0010_expaccf_rsme_resi;
	}







	public BigDecimal getR0010_expbccf_rsme_nonresi() {
		return r0010_expbccf_rsme_nonresi;
	}







	public void setR0010_expbccf_rsme_nonresi(BigDecimal r0010_expbccf_rsme_nonresi) {
		this.r0010_expbccf_rsme_nonresi = r0010_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0010_expaccf_rsme_nonresi() {
		return r0010_expaccf_rsme_nonresi;
	}







	public void setR0010_expaccf_rsme_nonresi(BigDecimal r0010_expaccf_rsme_nonresi) {
		this.r0010_expaccf_rsme_nonresi = r0010_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0010_expbccf_sme_resi() {
		return r0010_expbccf_sme_resi;
	}







	public void setR0010_expbccf_sme_resi(BigDecimal r0010_expbccf_sme_resi) {
		this.r0010_expbccf_sme_resi = r0010_expbccf_sme_resi;
	}







	public BigDecimal getR0010_expaccf_sme_resi() {
		return r0010_expaccf_sme_resi;
	}







	public void setR0010_expaccf_sme_resi(BigDecimal r0010_expaccf_sme_resi) {
		this.r0010_expaccf_sme_resi = r0010_expaccf_sme_resi;
	}







	public BigDecimal getR0010_expbccf_sme_nonresi() {
		return r0010_expbccf_sme_nonresi;
	}







	public void setR0010_expbccf_sme_nonresi(BigDecimal r0010_expbccf_sme_nonresi) {
		this.r0010_expbccf_sme_nonresi = r0010_expbccf_sme_nonresi;
	}







	public BigDecimal getR0010_expaccf_sme_nonresi() {
		return r0010_expaccf_sme_nonresi;
	}







	public void setR0010_expaccf_sme_nonresi(BigDecimal r0010_expaccf_sme_nonresi) {
		this.r0010_expaccf_sme_nonresi = r0010_expaccf_sme_nonresi;
	}







	public BigDecimal getR0010_expbccf_hni_resi() {
		return r0010_expbccf_hni_resi;
	}







	public void setR0010_expbccf_hni_resi(BigDecimal r0010_expbccf_hni_resi) {
		this.r0010_expbccf_hni_resi = r0010_expbccf_hni_resi;
	}







	public BigDecimal getR0010_expaccf_hni_resi() {
		return r0010_expaccf_hni_resi;
	}







	public void setR0010_expaccf_hni_resi(BigDecimal r0010_expaccf_hni_resi) {
		this.r0010_expaccf_hni_resi = r0010_expaccf_hni_resi;
	}







	public BigDecimal getR0010_expbccf_hni_nonresi() {
		return r0010_expbccf_hni_nonresi;
	}







	public void setR0010_expbccf_hni_nonresi(BigDecimal r0010_expbccf_hni_nonresi) {
		this.r0010_expbccf_hni_nonresi = r0010_expbccf_hni_nonresi;
	}







	public BigDecimal getR0010_expaccf_hni_nonresi() {
		return r0010_expaccf_hni_nonresi;
	}







	public void setR0010_expaccf_hni_nonresi(BigDecimal r0010_expaccf_hni_nonresi) {
		this.r0010_expaccf_hni_nonresi = r0010_expaccf_hni_nonresi;
	}







	public BigDecimal getR0010_expbccf_gres_resi() {
		return r0010_expbccf_gres_resi;
	}







	public void setR0010_expbccf_gres_resi(BigDecimal r0010_expbccf_gres_resi) {
		this.r0010_expbccf_gres_resi = r0010_expbccf_gres_resi;
	}







	public BigDecimal getR0010_expaccf_gres_resi() {
		return r0010_expaccf_gres_resi;
	}







	public void setR0010_expaccf_gres_resi(BigDecimal r0010_expaccf_gres_resi) {
		this.r0010_expaccf_gres_resi = r0010_expaccf_gres_resi;
	}







	public BigDecimal getR0010_expbccf_gres_nonresi() {
		return r0010_expbccf_gres_nonresi;
	}







	public void setR0010_expbccf_gres_nonresi(BigDecimal r0010_expbccf_gres_nonresi) {
		this.r0010_expbccf_gres_nonresi = r0010_expbccf_gres_nonresi;
	}







	public BigDecimal getR0010_expaccf_gres_nonresi() {
		return r0010_expaccf_gres_nonresi;
	}







	public void setR0010_expaccf_gres_nonresi(BigDecimal r0010_expaccf_gres_nonresi) {
		this.r0010_expaccf_gres_nonresi = r0010_expaccf_gres_nonresi;
	}







	public BigDecimal getR0010_expbccf_corp_resi() {
		return r0010_expbccf_corp_resi;
	}







	public void setR0010_expbccf_corp_resi(BigDecimal r0010_expbccf_corp_resi) {
		this.r0010_expbccf_corp_resi = r0010_expbccf_corp_resi;
	}







	public BigDecimal getR0010_expaccf_corp_resi() {
		return r0010_expaccf_corp_resi;
	}







	public void setR0010_expaccf_corp_resi(BigDecimal r0010_expaccf_corp_resi) {
		this.r0010_expaccf_corp_resi = r0010_expaccf_corp_resi;
	}







	public BigDecimal getR0010_expbccf_corp_nonresi() {
		return r0010_expbccf_corp_nonresi;
	}







	public void setR0010_expbccf_corp_nonresi(BigDecimal r0010_expbccf_corp_nonresi) {
		this.r0010_expbccf_corp_nonresi = r0010_expbccf_corp_nonresi;
	}







	public BigDecimal getR0010_expaccf_corp_nonresi() {
		return r0010_expaccf_corp_nonresi;
	}







	public void setR0010_expaccf_corp_nonresi(BigDecimal r0010_expaccf_corp_nonresi) {
		this.r0010_expaccf_corp_nonresi = r0010_expaccf_corp_nonresi;
	}







	public BigDecimal getR0010_expbccf_nbfi_resi() {
		return r0010_expbccf_nbfi_resi;
	}







	public void setR0010_expbccf_nbfi_resi(BigDecimal r0010_expbccf_nbfi_resi) {
		this.r0010_expbccf_nbfi_resi = r0010_expbccf_nbfi_resi;
	}







	public BigDecimal getR0010_expaccf_nbfi_resi() {
		return r0010_expaccf_nbfi_resi;
	}







	public void setR0010_expaccf_nbfi_resi(BigDecimal r0010_expaccf_nbfi_resi) {
		this.r0010_expaccf_nbfi_resi = r0010_expaccf_nbfi_resi;
	}







	public BigDecimal getR0010_expbccf_nbfi_nonresi() {
		return r0010_expbccf_nbfi_nonresi;
	}







	public void setR0010_expbccf_nbfi_nonresi(BigDecimal r0010_expbccf_nbfi_nonresi) {
		this.r0010_expbccf_nbfi_nonresi = r0010_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0010_expaccf_nbfi_nonresi() {
		return r0010_expaccf_nbfi_nonresi;
	}







	public void setR0010_expaccf_nbfi_nonresi(BigDecimal r0010_expaccf_nbfi_nonresi) {
		this.r0010_expaccf_nbfi_nonresi = r0010_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0010_expbccf_bank_resi() {
		return r0010_expbccf_bank_resi;
	}







	public void setR0010_expbccf_bank_resi(BigDecimal r0010_expbccf_bank_resi) {
		this.r0010_expbccf_bank_resi = r0010_expbccf_bank_resi;
	}







	public BigDecimal getR0010_expaccf_bank_resi() {
		return r0010_expaccf_bank_resi;
	}







	public void setR0010_expaccf_bank_resi(BigDecimal r0010_expaccf_bank_resi) {
		this.r0010_expaccf_bank_resi = r0010_expaccf_bank_resi;
	}







	public BigDecimal getR0010_expbccf_bank_nonresi() {
		return r0010_expbccf_bank_nonresi;
	}







	public void setR0010_expbccf_bank_nonresi(BigDecimal r0010_expbccf_bank_nonresi) {
		this.r0010_expbccf_bank_nonresi = r0010_expbccf_bank_nonresi;
	}







	public BigDecimal getR0010_expaccf_bank_nonresi() {
		return r0010_expaccf_bank_nonresi;
	}







	public void setR0010_expaccf_bank_nonresi(BigDecimal r0010_expaccf_bank_nonresi) {
		this.r0010_expaccf_bank_nonresi = r0010_expaccf_bank_nonresi;
	}







	public BigDecimal getR0010_expbccf_gov_resi() {
		return r0010_expbccf_gov_resi;
	}







	public void setR0010_expbccf_gov_resi(BigDecimal r0010_expbccf_gov_resi) {
		this.r0010_expbccf_gov_resi = r0010_expbccf_gov_resi;
	}







	public BigDecimal getR0010_expaccf_gov_resi() {
		return r0010_expaccf_gov_resi;
	}







	public void setR0010_expaccf_gov_resi(BigDecimal r0010_expaccf_gov_resi) {
		this.r0010_expaccf_gov_resi = r0010_expaccf_gov_resi;
	}







	public BigDecimal getR0010_expbccf_gov_nonresi() {
		return r0010_expbccf_gov_nonresi;
	}







	public void setR0010_expbccf_gov_nonresi(BigDecimal r0010_expbccf_gov_nonresi) {
		this.r0010_expbccf_gov_nonresi = r0010_expbccf_gov_nonresi;
	}







	public BigDecimal getR0010_expaccf_gov_nonresi() {
		return r0010_expaccf_gov_nonresi;
	}







	public void setR0010_expaccf_gov_nonresi(BigDecimal r0010_expaccf_gov_nonresi) {
		this.r0010_expaccf_gov_nonresi = r0010_expaccf_gov_nonresi;
	}







	public String getR0020_product() {
		return r0020_product;
	}







	public void setR0020_product(String r0020_product) {
		this.r0020_product = r0020_product;
	}







	public BigDecimal getR0020_expbccf_indiv_resi() {
		return r0020_expbccf_indiv_resi;
	}







	public void setR0020_expbccf_indiv_resi(BigDecimal r0020_expbccf_indiv_resi) {
		this.r0020_expbccf_indiv_resi = r0020_expbccf_indiv_resi;
	}







	public BigDecimal getR0020_expaccf_indiv_resi() {
		return r0020_expaccf_indiv_resi;
	}







	public void setR0020_expaccf_indiv_resi(BigDecimal r0020_expaccf_indiv_resi) {
		this.r0020_expaccf_indiv_resi = r0020_expaccf_indiv_resi;
	}







	public BigDecimal getR0020_expbccf_indiv_nonresi() {
		return r0020_expbccf_indiv_nonresi;
	}







	public void setR0020_expbccf_indiv_nonresi(BigDecimal r0020_expbccf_indiv_nonresi) {
		this.r0020_expbccf_indiv_nonresi = r0020_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0020_expaccf_indiv_nonresi() {
		return r0020_expaccf_indiv_nonresi;
	}







	public void setR0020_expaccf_indiv_nonresi(BigDecimal r0020_expaccf_indiv_nonresi) {
		this.r0020_expaccf_indiv_nonresi = r0020_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0020_expbccf_rsme_resi() {
		return r0020_expbccf_rsme_resi;
	}







	public void setR0020_expbccf_rsme_resi(BigDecimal r0020_expbccf_rsme_resi) {
		this.r0020_expbccf_rsme_resi = r0020_expbccf_rsme_resi;
	}







	public BigDecimal getR0020_expaccf_rsme_resi() {
		return r0020_expaccf_rsme_resi;
	}







	public void setR0020_expaccf_rsme_resi(BigDecimal r0020_expaccf_rsme_resi) {
		this.r0020_expaccf_rsme_resi = r0020_expaccf_rsme_resi;
	}







	public BigDecimal getR0020_expbccf_rsme_nonresi() {
		return r0020_expbccf_rsme_nonresi;
	}







	public void setR0020_expbccf_rsme_nonresi(BigDecimal r0020_expbccf_rsme_nonresi) {
		this.r0020_expbccf_rsme_nonresi = r0020_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0020_expaccf_rsme_nonresi() {
		return r0020_expaccf_rsme_nonresi;
	}







	public void setR0020_expaccf_rsme_nonresi(BigDecimal r0020_expaccf_rsme_nonresi) {
		this.r0020_expaccf_rsme_nonresi = r0020_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0020_expbccf_sme_resi() {
		return r0020_expbccf_sme_resi;
	}







	public void setR0020_expbccf_sme_resi(BigDecimal r0020_expbccf_sme_resi) {
		this.r0020_expbccf_sme_resi = r0020_expbccf_sme_resi;
	}







	public BigDecimal getR0020_expaccf_sme_resi() {
		return r0020_expaccf_sme_resi;
	}







	public void setR0020_expaccf_sme_resi(BigDecimal r0020_expaccf_sme_resi) {
		this.r0020_expaccf_sme_resi = r0020_expaccf_sme_resi;
	}







	public BigDecimal getR0020_expbccf_sme_nonresi() {
		return r0020_expbccf_sme_nonresi;
	}







	public void setR0020_expbccf_sme_nonresi(BigDecimal r0020_expbccf_sme_nonresi) {
		this.r0020_expbccf_sme_nonresi = r0020_expbccf_sme_nonresi;
	}







	public BigDecimal getR0020_expaccf_sme_nonresi() {
		return r0020_expaccf_sme_nonresi;
	}







	public void setR0020_expaccf_sme_nonresi(BigDecimal r0020_expaccf_sme_nonresi) {
		this.r0020_expaccf_sme_nonresi = r0020_expaccf_sme_nonresi;
	}







	public BigDecimal getR0020_expbccf_hni_resi() {
		return r0020_expbccf_hni_resi;
	}







	public void setR0020_expbccf_hni_resi(BigDecimal r0020_expbccf_hni_resi) {
		this.r0020_expbccf_hni_resi = r0020_expbccf_hni_resi;
	}







	public BigDecimal getR0020_expaccf_hni_resi() {
		return r0020_expaccf_hni_resi;
	}







	public void setR0020_expaccf_hni_resi(BigDecimal r0020_expaccf_hni_resi) {
		this.r0020_expaccf_hni_resi = r0020_expaccf_hni_resi;
	}







	public BigDecimal getR0020_expbccf_hni_nonresi() {
		return r0020_expbccf_hni_nonresi;
	}







	public void setR0020_expbccf_hni_nonresi(BigDecimal r0020_expbccf_hni_nonresi) {
		this.r0020_expbccf_hni_nonresi = r0020_expbccf_hni_nonresi;
	}







	public BigDecimal getR0020_expaccf_hni_nonresi() {
		return r0020_expaccf_hni_nonresi;
	}







	public void setR0020_expaccf_hni_nonresi(BigDecimal r0020_expaccf_hni_nonresi) {
		this.r0020_expaccf_hni_nonresi = r0020_expaccf_hni_nonresi;
	}







	public BigDecimal getR0020_expbccf_gres_resi() {
		return r0020_expbccf_gres_resi;
	}







	public void setR0020_expbccf_gres_resi(BigDecimal r0020_expbccf_gres_resi) {
		this.r0020_expbccf_gres_resi = r0020_expbccf_gres_resi;
	}







	public BigDecimal getR0020_expaccf_gres_resi() {
		return r0020_expaccf_gres_resi;
	}







	public void setR0020_expaccf_gres_resi(BigDecimal r0020_expaccf_gres_resi) {
		this.r0020_expaccf_gres_resi = r0020_expaccf_gres_resi;
	}







	public BigDecimal getR0020_expbccf_gres_nonresi() {
		return r0020_expbccf_gres_nonresi;
	}







	public void setR0020_expbccf_gres_nonresi(BigDecimal r0020_expbccf_gres_nonresi) {
		this.r0020_expbccf_gres_nonresi = r0020_expbccf_gres_nonresi;
	}







	public BigDecimal getR0020_expaccf_gres_nonresi() {
		return r0020_expaccf_gres_nonresi;
	}







	public void setR0020_expaccf_gres_nonresi(BigDecimal r0020_expaccf_gres_nonresi) {
		this.r0020_expaccf_gres_nonresi = r0020_expaccf_gres_nonresi;
	}







	public BigDecimal getR0020_expbccf_corp_resi() {
		return r0020_expbccf_corp_resi;
	}







	public void setR0020_expbccf_corp_resi(BigDecimal r0020_expbccf_corp_resi) {
		this.r0020_expbccf_corp_resi = r0020_expbccf_corp_resi;
	}







	public BigDecimal getR0020_expaccf_corp_resi() {
		return r0020_expaccf_corp_resi;
	}







	public void setR0020_expaccf_corp_resi(BigDecimal r0020_expaccf_corp_resi) {
		this.r0020_expaccf_corp_resi = r0020_expaccf_corp_resi;
	}







	public BigDecimal getR0020_expbccf_corp_nonresi() {
		return r0020_expbccf_corp_nonresi;
	}







	public void setR0020_expbccf_corp_nonresi(BigDecimal r0020_expbccf_corp_nonresi) {
		this.r0020_expbccf_corp_nonresi = r0020_expbccf_corp_nonresi;
	}







	public BigDecimal getR0020_expaccf_corp_nonresi() {
		return r0020_expaccf_corp_nonresi;
	}







	public void setR0020_expaccf_corp_nonresi(BigDecimal r0020_expaccf_corp_nonresi) {
		this.r0020_expaccf_corp_nonresi = r0020_expaccf_corp_nonresi;
	}







	public BigDecimal getR0020_expbccf_nbfi_resi() {
		return r0020_expbccf_nbfi_resi;
	}







	public void setR0020_expbccf_nbfi_resi(BigDecimal r0020_expbccf_nbfi_resi) {
		this.r0020_expbccf_nbfi_resi = r0020_expbccf_nbfi_resi;
	}







	public BigDecimal getR0020_expaccf_nbfi_resi() {
		return r0020_expaccf_nbfi_resi;
	}







	public void setR0020_expaccf_nbfi_resi(BigDecimal r0020_expaccf_nbfi_resi) {
		this.r0020_expaccf_nbfi_resi = r0020_expaccf_nbfi_resi;
	}







	public BigDecimal getR0020_expbccf_nbfi_nonresi() {
		return r0020_expbccf_nbfi_nonresi;
	}







	public void setR0020_expbccf_nbfi_nonresi(BigDecimal r0020_expbccf_nbfi_nonresi) {
		this.r0020_expbccf_nbfi_nonresi = r0020_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0020_expaccf_nbfi_nonresi() {
		return r0020_expaccf_nbfi_nonresi;
	}







	public void setR0020_expaccf_nbfi_nonresi(BigDecimal r0020_expaccf_nbfi_nonresi) {
		this.r0020_expaccf_nbfi_nonresi = r0020_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0020_expbccf_bank_resi() {
		return r0020_expbccf_bank_resi;
	}







	public void setR0020_expbccf_bank_resi(BigDecimal r0020_expbccf_bank_resi) {
		this.r0020_expbccf_bank_resi = r0020_expbccf_bank_resi;
	}







	public BigDecimal getR0020_expaccf_bank_resi() {
		return r0020_expaccf_bank_resi;
	}







	public void setR0020_expaccf_bank_resi(BigDecimal r0020_expaccf_bank_resi) {
		this.r0020_expaccf_bank_resi = r0020_expaccf_bank_resi;
	}







	public BigDecimal getR0020_expbccf_bank_nonresi() {
		return r0020_expbccf_bank_nonresi;
	}







	public void setR0020_expbccf_bank_nonresi(BigDecimal r0020_expbccf_bank_nonresi) {
		this.r0020_expbccf_bank_nonresi = r0020_expbccf_bank_nonresi;
	}







	public BigDecimal getR0020_expaccf_bank_nonresi() {
		return r0020_expaccf_bank_nonresi;
	}







	public void setR0020_expaccf_bank_nonresi(BigDecimal r0020_expaccf_bank_nonresi) {
		this.r0020_expaccf_bank_nonresi = r0020_expaccf_bank_nonresi;
	}







	public BigDecimal getR0020_expbccf_gov_resi() {
		return r0020_expbccf_gov_resi;
	}







	public void setR0020_expbccf_gov_resi(BigDecimal r0020_expbccf_gov_resi) {
		this.r0020_expbccf_gov_resi = r0020_expbccf_gov_resi;
	}







	public BigDecimal getR0020_expaccf_gov_resi() {
		return r0020_expaccf_gov_resi;
	}







	public void setR0020_expaccf_gov_resi(BigDecimal r0020_expaccf_gov_resi) {
		this.r0020_expaccf_gov_resi = r0020_expaccf_gov_resi;
	}







	public BigDecimal getR0020_expbccf_gov_nonresi() {
		return r0020_expbccf_gov_nonresi;
	}







	public void setR0020_expbccf_gov_nonresi(BigDecimal r0020_expbccf_gov_nonresi) {
		this.r0020_expbccf_gov_nonresi = r0020_expbccf_gov_nonresi;
	}







	public BigDecimal getR0020_expaccf_gov_nonresi() {
		return r0020_expaccf_gov_nonresi;
	}







	public void setR0020_expaccf_gov_nonresi(BigDecimal r0020_expaccf_gov_nonresi) {
		this.r0020_expaccf_gov_nonresi = r0020_expaccf_gov_nonresi;
	}







	public String getR0030_product() {
		return r0030_product;
	}







	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}







	public BigDecimal getR0030_expbccf_indiv_resi() {
		return r0030_expbccf_indiv_resi;
	}







	public void setR0030_expbccf_indiv_resi(BigDecimal r0030_expbccf_indiv_resi) {
		this.r0030_expbccf_indiv_resi = r0030_expbccf_indiv_resi;
	}







	public BigDecimal getR0030_expaccf_indiv_resi() {
		return r0030_expaccf_indiv_resi;
	}







	public void setR0030_expaccf_indiv_resi(BigDecimal r0030_expaccf_indiv_resi) {
		this.r0030_expaccf_indiv_resi = r0030_expaccf_indiv_resi;
	}







	public BigDecimal getR0030_expbccf_indiv_nonresi() {
		return r0030_expbccf_indiv_nonresi;
	}







	public void setR0030_expbccf_indiv_nonresi(BigDecimal r0030_expbccf_indiv_nonresi) {
		this.r0030_expbccf_indiv_nonresi = r0030_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0030_expaccf_indiv_nonresi() {
		return r0030_expaccf_indiv_nonresi;
	}







	public void setR0030_expaccf_indiv_nonresi(BigDecimal r0030_expaccf_indiv_nonresi) {
		this.r0030_expaccf_indiv_nonresi = r0030_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0030_expbccf_rsme_resi() {
		return r0030_expbccf_rsme_resi;
	}







	public void setR0030_expbccf_rsme_resi(BigDecimal r0030_expbccf_rsme_resi) {
		this.r0030_expbccf_rsme_resi = r0030_expbccf_rsme_resi;
	}







	public BigDecimal getR0030_expaccf_rsme_resi() {
		return r0030_expaccf_rsme_resi;
	}







	public void setR0030_expaccf_rsme_resi(BigDecimal r0030_expaccf_rsme_resi) {
		this.r0030_expaccf_rsme_resi = r0030_expaccf_rsme_resi;
	}







	public BigDecimal getR0030_expbccf_rsme_nonresi() {
		return r0030_expbccf_rsme_nonresi;
	}







	public void setR0030_expbccf_rsme_nonresi(BigDecimal r0030_expbccf_rsme_nonresi) {
		this.r0030_expbccf_rsme_nonresi = r0030_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0030_expaccf_rsme_nonresi() {
		return r0030_expaccf_rsme_nonresi;
	}







	public void setR0030_expaccf_rsme_nonresi(BigDecimal r0030_expaccf_rsme_nonresi) {
		this.r0030_expaccf_rsme_nonresi = r0030_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0030_expbccf_sme_resi() {
		return r0030_expbccf_sme_resi;
	}







	public void setR0030_expbccf_sme_resi(BigDecimal r0030_expbccf_sme_resi) {
		this.r0030_expbccf_sme_resi = r0030_expbccf_sme_resi;
	}







	public BigDecimal getR0030_expaccf_sme_resi() {
		return r0030_expaccf_sme_resi;
	}







	public void setR0030_expaccf_sme_resi(BigDecimal r0030_expaccf_sme_resi) {
		this.r0030_expaccf_sme_resi = r0030_expaccf_sme_resi;
	}







	public BigDecimal getR0030_expbccf_sme_nonresi() {
		return r0030_expbccf_sme_nonresi;
	}







	public void setR0030_expbccf_sme_nonresi(BigDecimal r0030_expbccf_sme_nonresi) {
		this.r0030_expbccf_sme_nonresi = r0030_expbccf_sme_nonresi;
	}







	public BigDecimal getR0030_expaccf_sme_nonresi() {
		return r0030_expaccf_sme_nonresi;
	}







	public void setR0030_expaccf_sme_nonresi(BigDecimal r0030_expaccf_sme_nonresi) {
		this.r0030_expaccf_sme_nonresi = r0030_expaccf_sme_nonresi;
	}







	public BigDecimal getR0030_expbccf_hni_resi() {
		return r0030_expbccf_hni_resi;
	}







	public void setR0030_expbccf_hni_resi(BigDecimal r0030_expbccf_hni_resi) {
		this.r0030_expbccf_hni_resi = r0030_expbccf_hni_resi;
	}







	public BigDecimal getR0030_expaccf_hni_resi() {
		return r0030_expaccf_hni_resi;
	}







	public void setR0030_expaccf_hni_resi(BigDecimal r0030_expaccf_hni_resi) {
		this.r0030_expaccf_hni_resi = r0030_expaccf_hni_resi;
	}







	public BigDecimal getR0030_expbccf_hni_nonresi() {
		return r0030_expbccf_hni_nonresi;
	}







	public void setR0030_expbccf_hni_nonresi(BigDecimal r0030_expbccf_hni_nonresi) {
		this.r0030_expbccf_hni_nonresi = r0030_expbccf_hni_nonresi;
	}







	public BigDecimal getR0030_expaccf_hni_nonresi() {
		return r0030_expaccf_hni_nonresi;
	}







	public void setR0030_expaccf_hni_nonresi(BigDecimal r0030_expaccf_hni_nonresi) {
		this.r0030_expaccf_hni_nonresi = r0030_expaccf_hni_nonresi;
	}







	public BigDecimal getR0030_expbccf_gres_resi() {
		return r0030_expbccf_gres_resi;
	}







	public void setR0030_expbccf_gres_resi(BigDecimal r0030_expbccf_gres_resi) {
		this.r0030_expbccf_gres_resi = r0030_expbccf_gres_resi;
	}







	public BigDecimal getR0030_expaccf_gres_resi() {
		return r0030_expaccf_gres_resi;
	}







	public void setR0030_expaccf_gres_resi(BigDecimal r0030_expaccf_gres_resi) {
		this.r0030_expaccf_gres_resi = r0030_expaccf_gres_resi;
	}







	public BigDecimal getR0030_expbccf_gres_nonresi() {
		return r0030_expbccf_gres_nonresi;
	}







	public void setR0030_expbccf_gres_nonresi(BigDecimal r0030_expbccf_gres_nonresi) {
		this.r0030_expbccf_gres_nonresi = r0030_expbccf_gres_nonresi;
	}







	public BigDecimal getR0030_expaccf_gres_nonresi() {
		return r0030_expaccf_gres_nonresi;
	}







	public void setR0030_expaccf_gres_nonresi(BigDecimal r0030_expaccf_gres_nonresi) {
		this.r0030_expaccf_gres_nonresi = r0030_expaccf_gres_nonresi;
	}







	public BigDecimal getR0030_expbccf_corp_resi() {
		return r0030_expbccf_corp_resi;
	}







	public void setR0030_expbccf_corp_resi(BigDecimal r0030_expbccf_corp_resi) {
		this.r0030_expbccf_corp_resi = r0030_expbccf_corp_resi;
	}







	public BigDecimal getR0030_expaccf_corp_resi() {
		return r0030_expaccf_corp_resi;
	}







	public void setR0030_expaccf_corp_resi(BigDecimal r0030_expaccf_corp_resi) {
		this.r0030_expaccf_corp_resi = r0030_expaccf_corp_resi;
	}







	public BigDecimal getR0030_expbccf_corp_nonresi() {
		return r0030_expbccf_corp_nonresi;
	}







	public void setR0030_expbccf_corp_nonresi(BigDecimal r0030_expbccf_corp_nonresi) {
		this.r0030_expbccf_corp_nonresi = r0030_expbccf_corp_nonresi;
	}







	public BigDecimal getR0030_expaccf_corp_nonresi() {
		return r0030_expaccf_corp_nonresi;
	}







	public void setR0030_expaccf_corp_nonresi(BigDecimal r0030_expaccf_corp_nonresi) {
		this.r0030_expaccf_corp_nonresi = r0030_expaccf_corp_nonresi;
	}







	public BigDecimal getR0030_expbccf_nbfi_resi() {
		return r0030_expbccf_nbfi_resi;
	}







	public void setR0030_expbccf_nbfi_resi(BigDecimal r0030_expbccf_nbfi_resi) {
		this.r0030_expbccf_nbfi_resi = r0030_expbccf_nbfi_resi;
	}







	public BigDecimal getR0030_expaccf_nbfi_resi() {
		return r0030_expaccf_nbfi_resi;
	}







	public void setR0030_expaccf_nbfi_resi(BigDecimal r0030_expaccf_nbfi_resi) {
		this.r0030_expaccf_nbfi_resi = r0030_expaccf_nbfi_resi;
	}







	public BigDecimal getR0030_expbccf_nbfi_nonresi() {
		return r0030_expbccf_nbfi_nonresi;
	}







	public void setR0030_expbccf_nbfi_nonresi(BigDecimal r0030_expbccf_nbfi_nonresi) {
		this.r0030_expbccf_nbfi_nonresi = r0030_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0030_expaccf_nbfi_nonresi() {
		return r0030_expaccf_nbfi_nonresi;
	}







	public void setR0030_expaccf_nbfi_nonresi(BigDecimal r0030_expaccf_nbfi_nonresi) {
		this.r0030_expaccf_nbfi_nonresi = r0030_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0030_expbccf_bank_resi() {
		return r0030_expbccf_bank_resi;
	}







	public void setR0030_expbccf_bank_resi(BigDecimal r0030_expbccf_bank_resi) {
		this.r0030_expbccf_bank_resi = r0030_expbccf_bank_resi;
	}







	public BigDecimal getR0030_expaccf_bank_resi() {
		return r0030_expaccf_bank_resi;
	}







	public void setR0030_expaccf_bank_resi(BigDecimal r0030_expaccf_bank_resi) {
		this.r0030_expaccf_bank_resi = r0030_expaccf_bank_resi;
	}







	public BigDecimal getR0030_expbccf_bank_nonresi() {
		return r0030_expbccf_bank_nonresi;
	}







	public void setR0030_expbccf_bank_nonresi(BigDecimal r0030_expbccf_bank_nonresi) {
		this.r0030_expbccf_bank_nonresi = r0030_expbccf_bank_nonresi;
	}







	public BigDecimal getR0030_expaccf_bank_nonresi() {
		return r0030_expaccf_bank_nonresi;
	}







	public void setR0030_expaccf_bank_nonresi(BigDecimal r0030_expaccf_bank_nonresi) {
		this.r0030_expaccf_bank_nonresi = r0030_expaccf_bank_nonresi;
	}







	public BigDecimal getR0030_expbccf_gov_resi() {
		return r0030_expbccf_gov_resi;
	}







	public void setR0030_expbccf_gov_resi(BigDecimal r0030_expbccf_gov_resi) {
		this.r0030_expbccf_gov_resi = r0030_expbccf_gov_resi;
	}







	public BigDecimal getR0030_expaccf_gov_resi() {
		return r0030_expaccf_gov_resi;
	}







	public void setR0030_expaccf_gov_resi(BigDecimal r0030_expaccf_gov_resi) {
		this.r0030_expaccf_gov_resi = r0030_expaccf_gov_resi;
	}







	public BigDecimal getR0030_expbccf_gov_nonresi() {
		return r0030_expbccf_gov_nonresi;
	}







	public void setR0030_expbccf_gov_nonresi(BigDecimal r0030_expbccf_gov_nonresi) {
		this.r0030_expbccf_gov_nonresi = r0030_expbccf_gov_nonresi;
	}







	public BigDecimal getR0030_expaccf_gov_nonresi() {
		return r0030_expaccf_gov_nonresi;
	}







	public void setR0030_expaccf_gov_nonresi(BigDecimal r0030_expaccf_gov_nonresi) {
		this.r0030_expaccf_gov_nonresi = r0030_expaccf_gov_nonresi;
	}







	public String getR0040_product() {
		return r0040_product;
	}







	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}







	public BigDecimal getR0040_expbccf_indiv_resi() {
		return r0040_expbccf_indiv_resi;
	}







	public void setR0040_expbccf_indiv_resi(BigDecimal r0040_expbccf_indiv_resi) {
		this.r0040_expbccf_indiv_resi = r0040_expbccf_indiv_resi;
	}







	public BigDecimal getR0040_expaccf_indiv_resi() {
		return r0040_expaccf_indiv_resi;
	}







	public void setR0040_expaccf_indiv_resi(BigDecimal r0040_expaccf_indiv_resi) {
		this.r0040_expaccf_indiv_resi = r0040_expaccf_indiv_resi;
	}







	public BigDecimal getR0040_expbccf_indiv_nonresi() {
		return r0040_expbccf_indiv_nonresi;
	}







	public void setR0040_expbccf_indiv_nonresi(BigDecimal r0040_expbccf_indiv_nonresi) {
		this.r0040_expbccf_indiv_nonresi = r0040_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0040_expaccf_indiv_nonresi() {
		return r0040_expaccf_indiv_nonresi;
	}







	public void setR0040_expaccf_indiv_nonresi(BigDecimal r0040_expaccf_indiv_nonresi) {
		this.r0040_expaccf_indiv_nonresi = r0040_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0040_expbccf_rsme_resi() {
		return r0040_expbccf_rsme_resi;
	}







	public void setR0040_expbccf_rsme_resi(BigDecimal r0040_expbccf_rsme_resi) {
		this.r0040_expbccf_rsme_resi = r0040_expbccf_rsme_resi;
	}







	public BigDecimal getR0040_expaccf_rsme_resi() {
		return r0040_expaccf_rsme_resi;
	}







	public void setR0040_expaccf_rsme_resi(BigDecimal r0040_expaccf_rsme_resi) {
		this.r0040_expaccf_rsme_resi = r0040_expaccf_rsme_resi;
	}







	public BigDecimal getR0040_expbccf_rsme_nonresi() {
		return r0040_expbccf_rsme_nonresi;
	}







	public void setR0040_expbccf_rsme_nonresi(BigDecimal r0040_expbccf_rsme_nonresi) {
		this.r0040_expbccf_rsme_nonresi = r0040_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0040_expaccf_rsme_nonresi() {
		return r0040_expaccf_rsme_nonresi;
	}







	public void setR0040_expaccf_rsme_nonresi(BigDecimal r0040_expaccf_rsme_nonresi) {
		this.r0040_expaccf_rsme_nonresi = r0040_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0040_expbccf_sme_resi() {
		return r0040_expbccf_sme_resi;
	}







	public void setR0040_expbccf_sme_resi(BigDecimal r0040_expbccf_sme_resi) {
		this.r0040_expbccf_sme_resi = r0040_expbccf_sme_resi;
	}







	public BigDecimal getR0040_expaccf_sme_resi() {
		return r0040_expaccf_sme_resi;
	}







	public void setR0040_expaccf_sme_resi(BigDecimal r0040_expaccf_sme_resi) {
		this.r0040_expaccf_sme_resi = r0040_expaccf_sme_resi;
	}







	public BigDecimal getR0040_expbccf_sme_nonresi() {
		return r0040_expbccf_sme_nonresi;
	}







	public void setR0040_expbccf_sme_nonresi(BigDecimal r0040_expbccf_sme_nonresi) {
		this.r0040_expbccf_sme_nonresi = r0040_expbccf_sme_nonresi;
	}







	public BigDecimal getR0040_expaccf_sme_nonresi() {
		return r0040_expaccf_sme_nonresi;
	}







	public void setR0040_expaccf_sme_nonresi(BigDecimal r0040_expaccf_sme_nonresi) {
		this.r0040_expaccf_sme_nonresi = r0040_expaccf_sme_nonresi;
	}







	public BigDecimal getR0040_expbccf_hni_resi() {
		return r0040_expbccf_hni_resi;
	}







	public void setR0040_expbccf_hni_resi(BigDecimal r0040_expbccf_hni_resi) {
		this.r0040_expbccf_hni_resi = r0040_expbccf_hni_resi;
	}







	public BigDecimal getR0040_expaccf_hni_resi() {
		return r0040_expaccf_hni_resi;
	}







	public void setR0040_expaccf_hni_resi(BigDecimal r0040_expaccf_hni_resi) {
		this.r0040_expaccf_hni_resi = r0040_expaccf_hni_resi;
	}







	public BigDecimal getR0040_expbccf_hni_nonresi() {
		return r0040_expbccf_hni_nonresi;
	}







	public void setR0040_expbccf_hni_nonresi(BigDecimal r0040_expbccf_hni_nonresi) {
		this.r0040_expbccf_hni_nonresi = r0040_expbccf_hni_nonresi;
	}







	public BigDecimal getR0040_expaccf_hni_nonresi() {
		return r0040_expaccf_hni_nonresi;
	}







	public void setR0040_expaccf_hni_nonresi(BigDecimal r0040_expaccf_hni_nonresi) {
		this.r0040_expaccf_hni_nonresi = r0040_expaccf_hni_nonresi;
	}







	public BigDecimal getR0040_expbccf_gres_resi() {
		return r0040_expbccf_gres_resi;
	}







	public void setR0040_expbccf_gres_resi(BigDecimal r0040_expbccf_gres_resi) {
		this.r0040_expbccf_gres_resi = r0040_expbccf_gres_resi;
	}







	public BigDecimal getR0040_expaccf_gres_resi() {
		return r0040_expaccf_gres_resi;
	}







	public void setR0040_expaccf_gres_resi(BigDecimal r0040_expaccf_gres_resi) {
		this.r0040_expaccf_gres_resi = r0040_expaccf_gres_resi;
	}







	public BigDecimal getR0040_expbccf_gres_nonresi() {
		return r0040_expbccf_gres_nonresi;
	}







	public void setR0040_expbccf_gres_nonresi(BigDecimal r0040_expbccf_gres_nonresi) {
		this.r0040_expbccf_gres_nonresi = r0040_expbccf_gres_nonresi;
	}







	public BigDecimal getR0040_expaccf_gres_nonresi() {
		return r0040_expaccf_gres_nonresi;
	}







	public void setR0040_expaccf_gres_nonresi(BigDecimal r0040_expaccf_gres_nonresi) {
		this.r0040_expaccf_gres_nonresi = r0040_expaccf_gres_nonresi;
	}







	public BigDecimal getR0040_expbccf_corp_resi() {
		return r0040_expbccf_corp_resi;
	}







	public void setR0040_expbccf_corp_resi(BigDecimal r0040_expbccf_corp_resi) {
		this.r0040_expbccf_corp_resi = r0040_expbccf_corp_resi;
	}







	public BigDecimal getR0040_expaccf_corp_resi() {
		return r0040_expaccf_corp_resi;
	}







	public void setR0040_expaccf_corp_resi(BigDecimal r0040_expaccf_corp_resi) {
		this.r0040_expaccf_corp_resi = r0040_expaccf_corp_resi;
	}







	public BigDecimal getR0040_expbccf_corp_nonresi() {
		return r0040_expbccf_corp_nonresi;
	}







	public void setR0040_expbccf_corp_nonresi(BigDecimal r0040_expbccf_corp_nonresi) {
		this.r0040_expbccf_corp_nonresi = r0040_expbccf_corp_nonresi;
	}







	public BigDecimal getR0040_expaccf_corp_nonresi() {
		return r0040_expaccf_corp_nonresi;
	}







	public void setR0040_expaccf_corp_nonresi(BigDecimal r0040_expaccf_corp_nonresi) {
		this.r0040_expaccf_corp_nonresi = r0040_expaccf_corp_nonresi;
	}







	public BigDecimal getR0040_expbccf_nbfi_resi() {
		return r0040_expbccf_nbfi_resi;
	}







	public void setR0040_expbccf_nbfi_resi(BigDecimal r0040_expbccf_nbfi_resi) {
		this.r0040_expbccf_nbfi_resi = r0040_expbccf_nbfi_resi;
	}







	public BigDecimal getR0040_expaccf_nbfi_resi() {
		return r0040_expaccf_nbfi_resi;
	}







	public void setR0040_expaccf_nbfi_resi(BigDecimal r0040_expaccf_nbfi_resi) {
		this.r0040_expaccf_nbfi_resi = r0040_expaccf_nbfi_resi;
	}







	public BigDecimal getR0040_expbccf_nbfi_nonresi() {
		return r0040_expbccf_nbfi_nonresi;
	}







	public void setR0040_expbccf_nbfi_nonresi(BigDecimal r0040_expbccf_nbfi_nonresi) {
		this.r0040_expbccf_nbfi_nonresi = r0040_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0040_expaccf_nbfi_nonresi() {
		return r0040_expaccf_nbfi_nonresi;
	}







	public void setR0040_expaccf_nbfi_nonresi(BigDecimal r0040_expaccf_nbfi_nonresi) {
		this.r0040_expaccf_nbfi_nonresi = r0040_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0040_expbccf_bank_resi() {
		return r0040_expbccf_bank_resi;
	}







	public void setR0040_expbccf_bank_resi(BigDecimal r0040_expbccf_bank_resi) {
		this.r0040_expbccf_bank_resi = r0040_expbccf_bank_resi;
	}







	public BigDecimal getR0040_expaccf_bank_resi() {
		return r0040_expaccf_bank_resi;
	}







	public void setR0040_expaccf_bank_resi(BigDecimal r0040_expaccf_bank_resi) {
		this.r0040_expaccf_bank_resi = r0040_expaccf_bank_resi;
	}







	public BigDecimal getR0040_expbccf_bank_nonresi() {
		return r0040_expbccf_bank_nonresi;
	}







	public void setR0040_expbccf_bank_nonresi(BigDecimal r0040_expbccf_bank_nonresi) {
		this.r0040_expbccf_bank_nonresi = r0040_expbccf_bank_nonresi;
	}







	public BigDecimal getR0040_expaccf_bank_nonresi() {
		return r0040_expaccf_bank_nonresi;
	}







	public void setR0040_expaccf_bank_nonresi(BigDecimal r0040_expaccf_bank_nonresi) {
		this.r0040_expaccf_bank_nonresi = r0040_expaccf_bank_nonresi;
	}







	public BigDecimal getR0040_expbccf_gov_resi() {
		return r0040_expbccf_gov_resi;
	}







	public void setR0040_expbccf_gov_resi(BigDecimal r0040_expbccf_gov_resi) {
		this.r0040_expbccf_gov_resi = r0040_expbccf_gov_resi;
	}







	public BigDecimal getR0040_expaccf_gov_resi() {
		return r0040_expaccf_gov_resi;
	}







	public void setR0040_expaccf_gov_resi(BigDecimal r0040_expaccf_gov_resi) {
		this.r0040_expaccf_gov_resi = r0040_expaccf_gov_resi;
	}







	public BigDecimal getR0040_expbccf_gov_nonresi() {
		return r0040_expbccf_gov_nonresi;
	}







	public void setR0040_expbccf_gov_nonresi(BigDecimal r0040_expbccf_gov_nonresi) {
		this.r0040_expbccf_gov_nonresi = r0040_expbccf_gov_nonresi;
	}







	public BigDecimal getR0040_expaccf_gov_nonresi() {
		return r0040_expaccf_gov_nonresi;
	}







	public void setR0040_expaccf_gov_nonresi(BigDecimal r0040_expaccf_gov_nonresi) {
		this.r0040_expaccf_gov_nonresi = r0040_expaccf_gov_nonresi;
	}







	public String getR0050_product() {
		return r0050_product;
	}







	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}







	public BigDecimal getR0050_expbccf_indiv_resi() {
		return r0050_expbccf_indiv_resi;
	}







	public void setR0050_expbccf_indiv_resi(BigDecimal r0050_expbccf_indiv_resi) {
		this.r0050_expbccf_indiv_resi = r0050_expbccf_indiv_resi;
	}







	public BigDecimal getR0050_expaccf_indiv_resi() {
		return r0050_expaccf_indiv_resi;
	}







	public void setR0050_expaccf_indiv_resi(BigDecimal r0050_expaccf_indiv_resi) {
		this.r0050_expaccf_indiv_resi = r0050_expaccf_indiv_resi;
	}







	public BigDecimal getR0050_expbccf_indiv_nonresi() {
		return r0050_expbccf_indiv_nonresi;
	}







	public void setR0050_expbccf_indiv_nonresi(BigDecimal r0050_expbccf_indiv_nonresi) {
		this.r0050_expbccf_indiv_nonresi = r0050_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0050_expaccf_indiv_nonresi() {
		return r0050_expaccf_indiv_nonresi;
	}







	public void setR0050_expaccf_indiv_nonresi(BigDecimal r0050_expaccf_indiv_nonresi) {
		this.r0050_expaccf_indiv_nonresi = r0050_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0050_expbccf_rsme_resi() {
		return r0050_expbccf_rsme_resi;
	}







	public void setR0050_expbccf_rsme_resi(BigDecimal r0050_expbccf_rsme_resi) {
		this.r0050_expbccf_rsme_resi = r0050_expbccf_rsme_resi;
	}







	public BigDecimal getR0050_expaccf_rsme_resi() {
		return r0050_expaccf_rsme_resi;
	}







	public void setR0050_expaccf_rsme_resi(BigDecimal r0050_expaccf_rsme_resi) {
		this.r0050_expaccf_rsme_resi = r0050_expaccf_rsme_resi;
	}







	public BigDecimal getR0050_expbccf_rsme_nonresi() {
		return r0050_expbccf_rsme_nonresi;
	}







	public void setR0050_expbccf_rsme_nonresi(BigDecimal r0050_expbccf_rsme_nonresi) {
		this.r0050_expbccf_rsme_nonresi = r0050_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0050_expaccf_rsme_nonresi() {
		return r0050_expaccf_rsme_nonresi;
	}







	public void setR0050_expaccf_rsme_nonresi(BigDecimal r0050_expaccf_rsme_nonresi) {
		this.r0050_expaccf_rsme_nonresi = r0050_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0050_expbccf_sme_resi() {
		return r0050_expbccf_sme_resi;
	}







	public void setR0050_expbccf_sme_resi(BigDecimal r0050_expbccf_sme_resi) {
		this.r0050_expbccf_sme_resi = r0050_expbccf_sme_resi;
	}







	public BigDecimal getR0050_expaccf_sme_resi() {
		return r0050_expaccf_sme_resi;
	}







	public void setR0050_expaccf_sme_resi(BigDecimal r0050_expaccf_sme_resi) {
		this.r0050_expaccf_sme_resi = r0050_expaccf_sme_resi;
	}







	public BigDecimal getR0050_expbccf_sme_nonresi() {
		return r0050_expbccf_sme_nonresi;
	}







	public void setR0050_expbccf_sme_nonresi(BigDecimal r0050_expbccf_sme_nonresi) {
		this.r0050_expbccf_sme_nonresi = r0050_expbccf_sme_nonresi;
	}







	public BigDecimal getR0050_expaccf_sme_nonresi() {
		return r0050_expaccf_sme_nonresi;
	}







	public void setR0050_expaccf_sme_nonresi(BigDecimal r0050_expaccf_sme_nonresi) {
		this.r0050_expaccf_sme_nonresi = r0050_expaccf_sme_nonresi;
	}







	public BigDecimal getR0050_expbccf_hni_resi() {
		return r0050_expbccf_hni_resi;
	}







	public void setR0050_expbccf_hni_resi(BigDecimal r0050_expbccf_hni_resi) {
		this.r0050_expbccf_hni_resi = r0050_expbccf_hni_resi;
	}







	public BigDecimal getR0050_expaccf_hni_resi() {
		return r0050_expaccf_hni_resi;
	}







	public void setR0050_expaccf_hni_resi(BigDecimal r0050_expaccf_hni_resi) {
		this.r0050_expaccf_hni_resi = r0050_expaccf_hni_resi;
	}







	public BigDecimal getR0050_expbccf_hni_nonresi() {
		return r0050_expbccf_hni_nonresi;
	}







	public void setR0050_expbccf_hni_nonresi(BigDecimal r0050_expbccf_hni_nonresi) {
		this.r0050_expbccf_hni_nonresi = r0050_expbccf_hni_nonresi;
	}







	public BigDecimal getR0050_expaccf_hni_nonresi() {
		return r0050_expaccf_hni_nonresi;
	}







	public void setR0050_expaccf_hni_nonresi(BigDecimal r0050_expaccf_hni_nonresi) {
		this.r0050_expaccf_hni_nonresi = r0050_expaccf_hni_nonresi;
	}







	public BigDecimal getR0050_expbccf_gres_resi() {
		return r0050_expbccf_gres_resi;
	}







	public void setR0050_expbccf_gres_resi(BigDecimal r0050_expbccf_gres_resi) {
		this.r0050_expbccf_gres_resi = r0050_expbccf_gres_resi;
	}







	public BigDecimal getR0050_expaccf_gres_resi() {
		return r0050_expaccf_gres_resi;
	}







	public void setR0050_expaccf_gres_resi(BigDecimal r0050_expaccf_gres_resi) {
		this.r0050_expaccf_gres_resi = r0050_expaccf_gres_resi;
	}







	public BigDecimal getR0050_expbccf_gres_nonresi() {
		return r0050_expbccf_gres_nonresi;
	}







	public void setR0050_expbccf_gres_nonresi(BigDecimal r0050_expbccf_gres_nonresi) {
		this.r0050_expbccf_gres_nonresi = r0050_expbccf_gres_nonresi;
	}







	public BigDecimal getR0050_expaccf_gres_nonresi() {
		return r0050_expaccf_gres_nonresi;
	}







	public void setR0050_expaccf_gres_nonresi(BigDecimal r0050_expaccf_gres_nonresi) {
		this.r0050_expaccf_gres_nonresi = r0050_expaccf_gres_nonresi;
	}







	public BigDecimal getR0050_expbccf_corp_resi() {
		return r0050_expbccf_corp_resi;
	}







	public void setR0050_expbccf_corp_resi(BigDecimal r0050_expbccf_corp_resi) {
		this.r0050_expbccf_corp_resi = r0050_expbccf_corp_resi;
	}







	public BigDecimal getR0050_expaccf_corp_resi() {
		return r0050_expaccf_corp_resi;
	}







	public void setR0050_expaccf_corp_resi(BigDecimal r0050_expaccf_corp_resi) {
		this.r0050_expaccf_corp_resi = r0050_expaccf_corp_resi;
	}







	public BigDecimal getR0050_expbccf_corp_nonresi() {
		return r0050_expbccf_corp_nonresi;
	}







	public void setR0050_expbccf_corp_nonresi(BigDecimal r0050_expbccf_corp_nonresi) {
		this.r0050_expbccf_corp_nonresi = r0050_expbccf_corp_nonresi;
	}







	public BigDecimal getR0050_expaccf_corp_nonresi() {
		return r0050_expaccf_corp_nonresi;
	}







	public void setR0050_expaccf_corp_nonresi(BigDecimal r0050_expaccf_corp_nonresi) {
		this.r0050_expaccf_corp_nonresi = r0050_expaccf_corp_nonresi;
	}







	public BigDecimal getR0050_expbccf_nbfi_resi() {
		return r0050_expbccf_nbfi_resi;
	}







	public void setR0050_expbccf_nbfi_resi(BigDecimal r0050_expbccf_nbfi_resi) {
		this.r0050_expbccf_nbfi_resi = r0050_expbccf_nbfi_resi;
	}







	public BigDecimal getR0050_expaccf_nbfi_resi() {
		return r0050_expaccf_nbfi_resi;
	}







	public void setR0050_expaccf_nbfi_resi(BigDecimal r0050_expaccf_nbfi_resi) {
		this.r0050_expaccf_nbfi_resi = r0050_expaccf_nbfi_resi;
	}







	public BigDecimal getR0050_expbccf_nbfi_nonresi() {
		return r0050_expbccf_nbfi_nonresi;
	}







	public void setR0050_expbccf_nbfi_nonresi(BigDecimal r0050_expbccf_nbfi_nonresi) {
		this.r0050_expbccf_nbfi_nonresi = r0050_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0050_expaccf_nbfi_nonresi() {
		return r0050_expaccf_nbfi_nonresi;
	}







	public void setR0050_expaccf_nbfi_nonresi(BigDecimal r0050_expaccf_nbfi_nonresi) {
		this.r0050_expaccf_nbfi_nonresi = r0050_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0050_expbccf_bank_resi() {
		return r0050_expbccf_bank_resi;
	}







	public void setR0050_expbccf_bank_resi(BigDecimal r0050_expbccf_bank_resi) {
		this.r0050_expbccf_bank_resi = r0050_expbccf_bank_resi;
	}







	public BigDecimal getR0050_expaccf_bank_resi() {
		return r0050_expaccf_bank_resi;
	}







	public void setR0050_expaccf_bank_resi(BigDecimal r0050_expaccf_bank_resi) {
		this.r0050_expaccf_bank_resi = r0050_expaccf_bank_resi;
	}







	public BigDecimal getR0050_expbccf_bank_nonresi() {
		return r0050_expbccf_bank_nonresi;
	}







	public void setR0050_expbccf_bank_nonresi(BigDecimal r0050_expbccf_bank_nonresi) {
		this.r0050_expbccf_bank_nonresi = r0050_expbccf_bank_nonresi;
	}







	public BigDecimal getR0050_expaccf_bank_nonresi() {
		return r0050_expaccf_bank_nonresi;
	}







	public void setR0050_expaccf_bank_nonresi(BigDecimal r0050_expaccf_bank_nonresi) {
		this.r0050_expaccf_bank_nonresi = r0050_expaccf_bank_nonresi;
	}







	public BigDecimal getR0050_expbccf_gov_resi() {
		return r0050_expbccf_gov_resi;
	}







	public void setR0050_expbccf_gov_resi(BigDecimal r0050_expbccf_gov_resi) {
		this.r0050_expbccf_gov_resi = r0050_expbccf_gov_resi;
	}







	public BigDecimal getR0050_expaccf_gov_resi() {
		return r0050_expaccf_gov_resi;
	}







	public void setR0050_expaccf_gov_resi(BigDecimal r0050_expaccf_gov_resi) {
		this.r0050_expaccf_gov_resi = r0050_expaccf_gov_resi;
	}







	public BigDecimal getR0050_expbccf_gov_nonresi() {
		return r0050_expbccf_gov_nonresi;
	}







	public void setR0050_expbccf_gov_nonresi(BigDecimal r0050_expbccf_gov_nonresi) {
		this.r0050_expbccf_gov_nonresi = r0050_expbccf_gov_nonresi;
	}







	public BigDecimal getR0050_expaccf_gov_nonresi() {
		return r0050_expaccf_gov_nonresi;
	}







	public void setR0050_expaccf_gov_nonresi(BigDecimal r0050_expaccf_gov_nonresi) {
		this.r0050_expaccf_gov_nonresi = r0050_expaccf_gov_nonresi;
	}







	public String getR0060_product() {
		return r0060_product;
	}







	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}







	public BigDecimal getR0060_expbccf_indiv_resi() {
		return r0060_expbccf_indiv_resi;
	}







	public void setR0060_expbccf_indiv_resi(BigDecimal r0060_expbccf_indiv_resi) {
		this.r0060_expbccf_indiv_resi = r0060_expbccf_indiv_resi;
	}







	public BigDecimal getR0060_expaccf_indiv_resi() {
		return r0060_expaccf_indiv_resi;
	}







	public void setR0060_expaccf_indiv_resi(BigDecimal r0060_expaccf_indiv_resi) {
		this.r0060_expaccf_indiv_resi = r0060_expaccf_indiv_resi;
	}







	public BigDecimal getR0060_expbccf_indiv_nonresi() {
		return r0060_expbccf_indiv_nonresi;
	}







	public void setR0060_expbccf_indiv_nonresi(BigDecimal r0060_expbccf_indiv_nonresi) {
		this.r0060_expbccf_indiv_nonresi = r0060_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0060_expaccf_indiv_nonresi() {
		return r0060_expaccf_indiv_nonresi;
	}







	public void setR0060_expaccf_indiv_nonresi(BigDecimal r0060_expaccf_indiv_nonresi) {
		this.r0060_expaccf_indiv_nonresi = r0060_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0060_expbccf_rsme_resi() {
		return r0060_expbccf_rsme_resi;
	}







	public void setR0060_expbccf_rsme_resi(BigDecimal r0060_expbccf_rsme_resi) {
		this.r0060_expbccf_rsme_resi = r0060_expbccf_rsme_resi;
	}







	public BigDecimal getR0060_expaccf_rsme_resi() {
		return r0060_expaccf_rsme_resi;
	}







	public void setR0060_expaccf_rsme_resi(BigDecimal r0060_expaccf_rsme_resi) {
		this.r0060_expaccf_rsme_resi = r0060_expaccf_rsme_resi;
	}







	public BigDecimal getR0060_expbccf_rsme_nonresi() {
		return r0060_expbccf_rsme_nonresi;
	}







	public void setR0060_expbccf_rsme_nonresi(BigDecimal r0060_expbccf_rsme_nonresi) {
		this.r0060_expbccf_rsme_nonresi = r0060_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0060_expaccf_rsme_nonresi() {
		return r0060_expaccf_rsme_nonresi;
	}







	public void setR0060_expaccf_rsme_nonresi(BigDecimal r0060_expaccf_rsme_nonresi) {
		this.r0060_expaccf_rsme_nonresi = r0060_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0060_expbccf_sme_resi() {
		return r0060_expbccf_sme_resi;
	}







	public void setR0060_expbccf_sme_resi(BigDecimal r0060_expbccf_sme_resi) {
		this.r0060_expbccf_sme_resi = r0060_expbccf_sme_resi;
	}







	public BigDecimal getR0060_expaccf_sme_resi() {
		return r0060_expaccf_sme_resi;
	}







	public void setR0060_expaccf_sme_resi(BigDecimal r0060_expaccf_sme_resi) {
		this.r0060_expaccf_sme_resi = r0060_expaccf_sme_resi;
	}







	public BigDecimal getR0060_expbccf_sme_nonresi() {
		return r0060_expbccf_sme_nonresi;
	}







	public void setR0060_expbccf_sme_nonresi(BigDecimal r0060_expbccf_sme_nonresi) {
		this.r0060_expbccf_sme_nonresi = r0060_expbccf_sme_nonresi;
	}







	public BigDecimal getR0060_expaccf_sme_nonresi() {
		return r0060_expaccf_sme_nonresi;
	}







	public void setR0060_expaccf_sme_nonresi(BigDecimal r0060_expaccf_sme_nonresi) {
		this.r0060_expaccf_sme_nonresi = r0060_expaccf_sme_nonresi;
	}







	public BigDecimal getR0060_expbccf_hni_resi() {
		return r0060_expbccf_hni_resi;
	}







	public void setR0060_expbccf_hni_resi(BigDecimal r0060_expbccf_hni_resi) {
		this.r0060_expbccf_hni_resi = r0060_expbccf_hni_resi;
	}







	public BigDecimal getR0060_expaccf_hni_resi() {
		return r0060_expaccf_hni_resi;
	}







	public void setR0060_expaccf_hni_resi(BigDecimal r0060_expaccf_hni_resi) {
		this.r0060_expaccf_hni_resi = r0060_expaccf_hni_resi;
	}







	public BigDecimal getR0060_expbccf_hni_nonresi() {
		return r0060_expbccf_hni_nonresi;
	}







	public void setR0060_expbccf_hni_nonresi(BigDecimal r0060_expbccf_hni_nonresi) {
		this.r0060_expbccf_hni_nonresi = r0060_expbccf_hni_nonresi;
	}







	public BigDecimal getR0060_expaccf_hni_nonresi() {
		return r0060_expaccf_hni_nonresi;
	}







	public void setR0060_expaccf_hni_nonresi(BigDecimal r0060_expaccf_hni_nonresi) {
		this.r0060_expaccf_hni_nonresi = r0060_expaccf_hni_nonresi;
	}







	public BigDecimal getR0060_expbccf_gres_resi() {
		return r0060_expbccf_gres_resi;
	}







	public void setR0060_expbccf_gres_resi(BigDecimal r0060_expbccf_gres_resi) {
		this.r0060_expbccf_gres_resi = r0060_expbccf_gres_resi;
	}







	public BigDecimal getR0060_expaccf_gres_resi() {
		return r0060_expaccf_gres_resi;
	}







	public void setR0060_expaccf_gres_resi(BigDecimal r0060_expaccf_gres_resi) {
		this.r0060_expaccf_gres_resi = r0060_expaccf_gres_resi;
	}







	public BigDecimal getR0060_expbccf_gres_nonresi() {
		return r0060_expbccf_gres_nonresi;
	}







	public void setR0060_expbccf_gres_nonresi(BigDecimal r0060_expbccf_gres_nonresi) {
		this.r0060_expbccf_gres_nonresi = r0060_expbccf_gres_nonresi;
	}







	public BigDecimal getR0060_expaccf_gres_nonresi() {
		return r0060_expaccf_gres_nonresi;
	}







	public void setR0060_expaccf_gres_nonresi(BigDecimal r0060_expaccf_gres_nonresi) {
		this.r0060_expaccf_gres_nonresi = r0060_expaccf_gres_nonresi;
	}







	public BigDecimal getR0060_expbccf_corp_resi() {
		return r0060_expbccf_corp_resi;
	}







	public void setR0060_expbccf_corp_resi(BigDecimal r0060_expbccf_corp_resi) {
		this.r0060_expbccf_corp_resi = r0060_expbccf_corp_resi;
	}







	public BigDecimal getR0060_expaccf_corp_resi() {
		return r0060_expaccf_corp_resi;
	}







	public void setR0060_expaccf_corp_resi(BigDecimal r0060_expaccf_corp_resi) {
		this.r0060_expaccf_corp_resi = r0060_expaccf_corp_resi;
	}







	public BigDecimal getR0060_expbccf_corp_nonresi() {
		return r0060_expbccf_corp_nonresi;
	}







	public void setR0060_expbccf_corp_nonresi(BigDecimal r0060_expbccf_corp_nonresi) {
		this.r0060_expbccf_corp_nonresi = r0060_expbccf_corp_nonresi;
	}







	public BigDecimal getR0060_expaccf_corp_nonresi() {
		return r0060_expaccf_corp_nonresi;
	}







	public void setR0060_expaccf_corp_nonresi(BigDecimal r0060_expaccf_corp_nonresi) {
		this.r0060_expaccf_corp_nonresi = r0060_expaccf_corp_nonresi;
	}







	public BigDecimal getR0060_expbccf_nbfi_resi() {
		return r0060_expbccf_nbfi_resi;
	}







	public void setR0060_expbccf_nbfi_resi(BigDecimal r0060_expbccf_nbfi_resi) {
		this.r0060_expbccf_nbfi_resi = r0060_expbccf_nbfi_resi;
	}







	public BigDecimal getR0060_expaccf_nbfi_resi() {
		return r0060_expaccf_nbfi_resi;
	}







	public void setR0060_expaccf_nbfi_resi(BigDecimal r0060_expaccf_nbfi_resi) {
		this.r0060_expaccf_nbfi_resi = r0060_expaccf_nbfi_resi;
	}







	public BigDecimal getR0060_expbccf_nbfi_nonresi() {
		return r0060_expbccf_nbfi_nonresi;
	}







	public void setR0060_expbccf_nbfi_nonresi(BigDecimal r0060_expbccf_nbfi_nonresi) {
		this.r0060_expbccf_nbfi_nonresi = r0060_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0060_expaccf_nbfi_nonresi() {
		return r0060_expaccf_nbfi_nonresi;
	}







	public void setR0060_expaccf_nbfi_nonresi(BigDecimal r0060_expaccf_nbfi_nonresi) {
		this.r0060_expaccf_nbfi_nonresi = r0060_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0060_expbccf_bank_resi() {
		return r0060_expbccf_bank_resi;
	}







	public void setR0060_expbccf_bank_resi(BigDecimal r0060_expbccf_bank_resi) {
		this.r0060_expbccf_bank_resi = r0060_expbccf_bank_resi;
	}







	public BigDecimal getR0060_expaccf_bank_resi() {
		return r0060_expaccf_bank_resi;
	}







	public void setR0060_expaccf_bank_resi(BigDecimal r0060_expaccf_bank_resi) {
		this.r0060_expaccf_bank_resi = r0060_expaccf_bank_resi;
	}







	public BigDecimal getR0060_expbccf_bank_nonresi() {
		return r0060_expbccf_bank_nonresi;
	}







	public void setR0060_expbccf_bank_nonresi(BigDecimal r0060_expbccf_bank_nonresi) {
		this.r0060_expbccf_bank_nonresi = r0060_expbccf_bank_nonresi;
	}







	public BigDecimal getR0060_expaccf_bank_nonresi() {
		return r0060_expaccf_bank_nonresi;
	}







	public void setR0060_expaccf_bank_nonresi(BigDecimal r0060_expaccf_bank_nonresi) {
		this.r0060_expaccf_bank_nonresi = r0060_expaccf_bank_nonresi;
	}







	public BigDecimal getR0060_expbccf_gov_resi() {
		return r0060_expbccf_gov_resi;
	}







	public void setR0060_expbccf_gov_resi(BigDecimal r0060_expbccf_gov_resi) {
		this.r0060_expbccf_gov_resi = r0060_expbccf_gov_resi;
	}







	public BigDecimal getR0060_expaccf_gov_resi() {
		return r0060_expaccf_gov_resi;
	}







	public void setR0060_expaccf_gov_resi(BigDecimal r0060_expaccf_gov_resi) {
		this.r0060_expaccf_gov_resi = r0060_expaccf_gov_resi;
	}







	public BigDecimal getR0060_expbccf_gov_nonresi() {
		return r0060_expbccf_gov_nonresi;
	}







	public void setR0060_expbccf_gov_nonresi(BigDecimal r0060_expbccf_gov_nonresi) {
		this.r0060_expbccf_gov_nonresi = r0060_expbccf_gov_nonresi;
	}







	public BigDecimal getR0060_expaccf_gov_nonresi() {
		return r0060_expaccf_gov_nonresi;
	}







	public void setR0060_expaccf_gov_nonresi(BigDecimal r0060_expaccf_gov_nonresi) {
		this.r0060_expaccf_gov_nonresi = r0060_expaccf_gov_nonresi;
	}







	public String getR0070_product() {
		return r0070_product;
	}







	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}







	public BigDecimal getR0070_expbccf_indiv_resi() {
		return r0070_expbccf_indiv_resi;
	}







	public void setR0070_expbccf_indiv_resi(BigDecimal r0070_expbccf_indiv_resi) {
		this.r0070_expbccf_indiv_resi = r0070_expbccf_indiv_resi;
	}







	public BigDecimal getR0070_expaccf_indiv_resi() {
		return r0070_expaccf_indiv_resi;
	}







	public void setR0070_expaccf_indiv_resi(BigDecimal r0070_expaccf_indiv_resi) {
		this.r0070_expaccf_indiv_resi = r0070_expaccf_indiv_resi;
	}







	public BigDecimal getR0070_expbccf_indiv_nonresi() {
		return r0070_expbccf_indiv_nonresi;
	}







	public void setR0070_expbccf_indiv_nonresi(BigDecimal r0070_expbccf_indiv_nonresi) {
		this.r0070_expbccf_indiv_nonresi = r0070_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0070_expaccf_indiv_nonresi() {
		return r0070_expaccf_indiv_nonresi;
	}







	public void setR0070_expaccf_indiv_nonresi(BigDecimal r0070_expaccf_indiv_nonresi) {
		this.r0070_expaccf_indiv_nonresi = r0070_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0070_expbccf_rsme_resi() {
		return r0070_expbccf_rsme_resi;
	}







	public void setR0070_expbccf_rsme_resi(BigDecimal r0070_expbccf_rsme_resi) {
		this.r0070_expbccf_rsme_resi = r0070_expbccf_rsme_resi;
	}







	public BigDecimal getR0070_expaccf_rsme_resi() {
		return r0070_expaccf_rsme_resi;
	}







	public void setR0070_expaccf_rsme_resi(BigDecimal r0070_expaccf_rsme_resi) {
		this.r0070_expaccf_rsme_resi = r0070_expaccf_rsme_resi;
	}







	public BigDecimal getR0070_expbccf_rsme_nonresi() {
		return r0070_expbccf_rsme_nonresi;
	}







	public void setR0070_expbccf_rsme_nonresi(BigDecimal r0070_expbccf_rsme_nonresi) {
		this.r0070_expbccf_rsme_nonresi = r0070_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0070_expaccf_rsme_nonresi() {
		return r0070_expaccf_rsme_nonresi;
	}







	public void setR0070_expaccf_rsme_nonresi(BigDecimal r0070_expaccf_rsme_nonresi) {
		this.r0070_expaccf_rsme_nonresi = r0070_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0070_expbccf_sme_resi() {
		return r0070_expbccf_sme_resi;
	}







	public void setR0070_expbccf_sme_resi(BigDecimal r0070_expbccf_sme_resi) {
		this.r0070_expbccf_sme_resi = r0070_expbccf_sme_resi;
	}







	public BigDecimal getR0070_expaccf_sme_resi() {
		return r0070_expaccf_sme_resi;
	}







	public void setR0070_expaccf_sme_resi(BigDecimal r0070_expaccf_sme_resi) {
		this.r0070_expaccf_sme_resi = r0070_expaccf_sme_resi;
	}







	public BigDecimal getR0070_expbccf_sme_nonresi() {
		return r0070_expbccf_sme_nonresi;
	}







	public void setR0070_expbccf_sme_nonresi(BigDecimal r0070_expbccf_sme_nonresi) {
		this.r0070_expbccf_sme_nonresi = r0070_expbccf_sme_nonresi;
	}







	public BigDecimal getR0070_expaccf_sme_nonresi() {
		return r0070_expaccf_sme_nonresi;
	}







	public void setR0070_expaccf_sme_nonresi(BigDecimal r0070_expaccf_sme_nonresi) {
		this.r0070_expaccf_sme_nonresi = r0070_expaccf_sme_nonresi;
	}







	public BigDecimal getR0070_expbccf_hni_resi() {
		return r0070_expbccf_hni_resi;
	}







	public void setR0070_expbccf_hni_resi(BigDecimal r0070_expbccf_hni_resi) {
		this.r0070_expbccf_hni_resi = r0070_expbccf_hni_resi;
	}







	public BigDecimal getR0070_expaccf_hni_resi() {
		return r0070_expaccf_hni_resi;
	}







	public void setR0070_expaccf_hni_resi(BigDecimal r0070_expaccf_hni_resi) {
		this.r0070_expaccf_hni_resi = r0070_expaccf_hni_resi;
	}







	public BigDecimal getR0070_expbccf_hni_nonresi() {
		return r0070_expbccf_hni_nonresi;
	}







	public void setR0070_expbccf_hni_nonresi(BigDecimal r0070_expbccf_hni_nonresi) {
		this.r0070_expbccf_hni_nonresi = r0070_expbccf_hni_nonresi;
	}







	public BigDecimal getR0070_expaccf_hni_nonresi() {
		return r0070_expaccf_hni_nonresi;
	}







	public void setR0070_expaccf_hni_nonresi(BigDecimal r0070_expaccf_hni_nonresi) {
		this.r0070_expaccf_hni_nonresi = r0070_expaccf_hni_nonresi;
	}







	public BigDecimal getR0070_expbccf_gres_resi() {
		return r0070_expbccf_gres_resi;
	}







	public void setR0070_expbccf_gres_resi(BigDecimal r0070_expbccf_gres_resi) {
		this.r0070_expbccf_gres_resi = r0070_expbccf_gres_resi;
	}







	public BigDecimal getR0070_expaccf_gres_resi() {
		return r0070_expaccf_gres_resi;
	}







	public void setR0070_expaccf_gres_resi(BigDecimal r0070_expaccf_gres_resi) {
		this.r0070_expaccf_gres_resi = r0070_expaccf_gres_resi;
	}







	public BigDecimal getR0070_expbccf_gres_nonresi() {
		return r0070_expbccf_gres_nonresi;
	}







	public void setR0070_expbccf_gres_nonresi(BigDecimal r0070_expbccf_gres_nonresi) {
		this.r0070_expbccf_gres_nonresi = r0070_expbccf_gres_nonresi;
	}







	public BigDecimal getR0070_expaccf_gres_nonresi() {
		return r0070_expaccf_gres_nonresi;
	}







	public void setR0070_expaccf_gres_nonresi(BigDecimal r0070_expaccf_gres_nonresi) {
		this.r0070_expaccf_gres_nonresi = r0070_expaccf_gres_nonresi;
	}







	public BigDecimal getR0070_expbccf_corp_resi() {
		return r0070_expbccf_corp_resi;
	}







	public void setR0070_expbccf_corp_resi(BigDecimal r0070_expbccf_corp_resi) {
		this.r0070_expbccf_corp_resi = r0070_expbccf_corp_resi;
	}







	public BigDecimal getR0070_expaccf_corp_resi() {
		return r0070_expaccf_corp_resi;
	}







	public void setR0070_expaccf_corp_resi(BigDecimal r0070_expaccf_corp_resi) {
		this.r0070_expaccf_corp_resi = r0070_expaccf_corp_resi;
	}







	public BigDecimal getR0070_expbccf_corp_nonresi() {
		return r0070_expbccf_corp_nonresi;
	}







	public void setR0070_expbccf_corp_nonresi(BigDecimal r0070_expbccf_corp_nonresi) {
		this.r0070_expbccf_corp_nonresi = r0070_expbccf_corp_nonresi;
	}







	public BigDecimal getR0070_expaccf_corp_nonresi() {
		return r0070_expaccf_corp_nonresi;
	}







	public void setR0070_expaccf_corp_nonresi(BigDecimal r0070_expaccf_corp_nonresi) {
		this.r0070_expaccf_corp_nonresi = r0070_expaccf_corp_nonresi;
	}







	public BigDecimal getR0070_expbccf_nbfi_resi() {
		return r0070_expbccf_nbfi_resi;
	}







	public void setR0070_expbccf_nbfi_resi(BigDecimal r0070_expbccf_nbfi_resi) {
		this.r0070_expbccf_nbfi_resi = r0070_expbccf_nbfi_resi;
	}







	public BigDecimal getR0070_expaccf_nbfi_resi() {
		return r0070_expaccf_nbfi_resi;
	}







	public void setR0070_expaccf_nbfi_resi(BigDecimal r0070_expaccf_nbfi_resi) {
		this.r0070_expaccf_nbfi_resi = r0070_expaccf_nbfi_resi;
	}







	public BigDecimal getR0070_expbccf_nbfi_nonresi() {
		return r0070_expbccf_nbfi_nonresi;
	}







	public void setR0070_expbccf_nbfi_nonresi(BigDecimal r0070_expbccf_nbfi_nonresi) {
		this.r0070_expbccf_nbfi_nonresi = r0070_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0070_expaccf_nbfi_nonresi() {
		return r0070_expaccf_nbfi_nonresi;
	}







	public void setR0070_expaccf_nbfi_nonresi(BigDecimal r0070_expaccf_nbfi_nonresi) {
		this.r0070_expaccf_nbfi_nonresi = r0070_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0070_expbccf_bank_resi() {
		return r0070_expbccf_bank_resi;
	}







	public void setR0070_expbccf_bank_resi(BigDecimal r0070_expbccf_bank_resi) {
		this.r0070_expbccf_bank_resi = r0070_expbccf_bank_resi;
	}







	public BigDecimal getR0070_expaccf_bank_resi() {
		return r0070_expaccf_bank_resi;
	}







	public void setR0070_expaccf_bank_resi(BigDecimal r0070_expaccf_bank_resi) {
		this.r0070_expaccf_bank_resi = r0070_expaccf_bank_resi;
	}







	public BigDecimal getR0070_expbccf_bank_nonresi() {
		return r0070_expbccf_bank_nonresi;
	}







	public void setR0070_expbccf_bank_nonresi(BigDecimal r0070_expbccf_bank_nonresi) {
		this.r0070_expbccf_bank_nonresi = r0070_expbccf_bank_nonresi;
	}







	public BigDecimal getR0070_expaccf_bank_nonresi() {
		return r0070_expaccf_bank_nonresi;
	}







	public void setR0070_expaccf_bank_nonresi(BigDecimal r0070_expaccf_bank_nonresi) {
		this.r0070_expaccf_bank_nonresi = r0070_expaccf_bank_nonresi;
	}







	public BigDecimal getR0070_expbccf_gov_resi() {
		return r0070_expbccf_gov_resi;
	}







	public void setR0070_expbccf_gov_resi(BigDecimal r0070_expbccf_gov_resi) {
		this.r0070_expbccf_gov_resi = r0070_expbccf_gov_resi;
	}







	public BigDecimal getR0070_expaccf_gov_resi() {
		return r0070_expaccf_gov_resi;
	}







	public void setR0070_expaccf_gov_resi(BigDecimal r0070_expaccf_gov_resi) {
		this.r0070_expaccf_gov_resi = r0070_expaccf_gov_resi;
	}







	public BigDecimal getR0070_expbccf_gov_nonresi() {
		return r0070_expbccf_gov_nonresi;
	}







	public void setR0070_expbccf_gov_nonresi(BigDecimal r0070_expbccf_gov_nonresi) {
		this.r0070_expbccf_gov_nonresi = r0070_expbccf_gov_nonresi;
	}







	public BigDecimal getR0070_expaccf_gov_nonresi() {
		return r0070_expaccf_gov_nonresi;
	}







	public void setR0070_expaccf_gov_nonresi(BigDecimal r0070_expaccf_gov_nonresi) {
		this.r0070_expaccf_gov_nonresi = r0070_expaccf_gov_nonresi;
	}







	public String getR0080_product() {
		return r0080_product;
	}







	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}







	public BigDecimal getR0080_expbccf_indiv_resi() {
		return r0080_expbccf_indiv_resi;
	}







	public void setR0080_expbccf_indiv_resi(BigDecimal r0080_expbccf_indiv_resi) {
		this.r0080_expbccf_indiv_resi = r0080_expbccf_indiv_resi;
	}







	public BigDecimal getR0080_expaccf_indiv_resi() {
		return r0080_expaccf_indiv_resi;
	}







	public void setR0080_expaccf_indiv_resi(BigDecimal r0080_expaccf_indiv_resi) {
		this.r0080_expaccf_indiv_resi = r0080_expaccf_indiv_resi;
	}







	public BigDecimal getR0080_expbccf_indiv_nonresi() {
		return r0080_expbccf_indiv_nonresi;
	}







	public void setR0080_expbccf_indiv_nonresi(BigDecimal r0080_expbccf_indiv_nonresi) {
		this.r0080_expbccf_indiv_nonresi = r0080_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0080_expaccf_indiv_nonresi() {
		return r0080_expaccf_indiv_nonresi;
	}







	public void setR0080_expaccf_indiv_nonresi(BigDecimal r0080_expaccf_indiv_nonresi) {
		this.r0080_expaccf_indiv_nonresi = r0080_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0080_expbccf_rsme_resi() {
		return r0080_expbccf_rsme_resi;
	}







	public void setR0080_expbccf_rsme_resi(BigDecimal r0080_expbccf_rsme_resi) {
		this.r0080_expbccf_rsme_resi = r0080_expbccf_rsme_resi;
	}







	public BigDecimal getR0080_expaccf_rsme_resi() {
		return r0080_expaccf_rsme_resi;
	}







	public void setR0080_expaccf_rsme_resi(BigDecimal r0080_expaccf_rsme_resi) {
		this.r0080_expaccf_rsme_resi = r0080_expaccf_rsme_resi;
	}







	public BigDecimal getR0080_expbccf_rsme_nonresi() {
		return r0080_expbccf_rsme_nonresi;
	}







	public void setR0080_expbccf_rsme_nonresi(BigDecimal r0080_expbccf_rsme_nonresi) {
		this.r0080_expbccf_rsme_nonresi = r0080_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0080_expaccf_rsme_nonresi() {
		return r0080_expaccf_rsme_nonresi;
	}







	public void setR0080_expaccf_rsme_nonresi(BigDecimal r0080_expaccf_rsme_nonresi) {
		this.r0080_expaccf_rsme_nonresi = r0080_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0080_expbccf_sme_resi() {
		return r0080_expbccf_sme_resi;
	}







	public void setR0080_expbccf_sme_resi(BigDecimal r0080_expbccf_sme_resi) {
		this.r0080_expbccf_sme_resi = r0080_expbccf_sme_resi;
	}







	public BigDecimal getR0080_expaccf_sme_resi() {
		return r0080_expaccf_sme_resi;
	}







	public void setR0080_expaccf_sme_resi(BigDecimal r0080_expaccf_sme_resi) {
		this.r0080_expaccf_sme_resi = r0080_expaccf_sme_resi;
	}







	public BigDecimal getR0080_expbccf_sme_nonresi() {
		return r0080_expbccf_sme_nonresi;
	}







	public void setR0080_expbccf_sme_nonresi(BigDecimal r0080_expbccf_sme_nonresi) {
		this.r0080_expbccf_sme_nonresi = r0080_expbccf_sme_nonresi;
	}







	public BigDecimal getR0080_expaccf_sme_nonresi() {
		return r0080_expaccf_sme_nonresi;
	}







	public void setR0080_expaccf_sme_nonresi(BigDecimal r0080_expaccf_sme_nonresi) {
		this.r0080_expaccf_sme_nonresi = r0080_expaccf_sme_nonresi;
	}







	public BigDecimal getR0080_expbccf_hni_resi() {
		return r0080_expbccf_hni_resi;
	}







	public void setR0080_expbccf_hni_resi(BigDecimal r0080_expbccf_hni_resi) {
		this.r0080_expbccf_hni_resi = r0080_expbccf_hni_resi;
	}







	public BigDecimal getR0080_expaccf_hni_resi() {
		return r0080_expaccf_hni_resi;
	}







	public void setR0080_expaccf_hni_resi(BigDecimal r0080_expaccf_hni_resi) {
		this.r0080_expaccf_hni_resi = r0080_expaccf_hni_resi;
	}







	public BigDecimal getR0080_expbccf_hni_nonresi() {
		return r0080_expbccf_hni_nonresi;
	}







	public void setR0080_expbccf_hni_nonresi(BigDecimal r0080_expbccf_hni_nonresi) {
		this.r0080_expbccf_hni_nonresi = r0080_expbccf_hni_nonresi;
	}







	public BigDecimal getR0080_expaccf_hni_nonresi() {
		return r0080_expaccf_hni_nonresi;
	}







	public void setR0080_expaccf_hni_nonresi(BigDecimal r0080_expaccf_hni_nonresi) {
		this.r0080_expaccf_hni_nonresi = r0080_expaccf_hni_nonresi;
	}







	public BigDecimal getR0080_expbccf_gres_resi() {
		return r0080_expbccf_gres_resi;
	}







	public void setR0080_expbccf_gres_resi(BigDecimal r0080_expbccf_gres_resi) {
		this.r0080_expbccf_gres_resi = r0080_expbccf_gres_resi;
	}







	public BigDecimal getR0080_expaccf_gres_resi() {
		return r0080_expaccf_gres_resi;
	}







	public void setR0080_expaccf_gres_resi(BigDecimal r0080_expaccf_gres_resi) {
		this.r0080_expaccf_gres_resi = r0080_expaccf_gres_resi;
	}







	public BigDecimal getR0080_expbccf_gres_nonresi() {
		return r0080_expbccf_gres_nonresi;
	}







	public void setR0080_expbccf_gres_nonresi(BigDecimal r0080_expbccf_gres_nonresi) {
		this.r0080_expbccf_gres_nonresi = r0080_expbccf_gres_nonresi;
	}







	public BigDecimal getR0080_expaccf_gres_nonresi() {
		return r0080_expaccf_gres_nonresi;
	}







	public void setR0080_expaccf_gres_nonresi(BigDecimal r0080_expaccf_gres_nonresi) {
		this.r0080_expaccf_gres_nonresi = r0080_expaccf_gres_nonresi;
	}







	public BigDecimal getR0080_expbccf_corp_resi() {
		return r0080_expbccf_corp_resi;
	}







	public void setR0080_expbccf_corp_resi(BigDecimal r0080_expbccf_corp_resi) {
		this.r0080_expbccf_corp_resi = r0080_expbccf_corp_resi;
	}







	public BigDecimal getR0080_expaccf_corp_resi() {
		return r0080_expaccf_corp_resi;
	}







	public void setR0080_expaccf_corp_resi(BigDecimal r0080_expaccf_corp_resi) {
		this.r0080_expaccf_corp_resi = r0080_expaccf_corp_resi;
	}







	public BigDecimal getR0080_expbccf_corp_nonresi() {
		return r0080_expbccf_corp_nonresi;
	}







	public void setR0080_expbccf_corp_nonresi(BigDecimal r0080_expbccf_corp_nonresi) {
		this.r0080_expbccf_corp_nonresi = r0080_expbccf_corp_nonresi;
	}







	public BigDecimal getR0080_expaccf_corp_nonresi() {
		return r0080_expaccf_corp_nonresi;
	}







	public void setR0080_expaccf_corp_nonresi(BigDecimal r0080_expaccf_corp_nonresi) {
		this.r0080_expaccf_corp_nonresi = r0080_expaccf_corp_nonresi;
	}







	public BigDecimal getR0080_expbccf_nbfi_resi() {
		return r0080_expbccf_nbfi_resi;
	}







	public void setR0080_expbccf_nbfi_resi(BigDecimal r0080_expbccf_nbfi_resi) {
		this.r0080_expbccf_nbfi_resi = r0080_expbccf_nbfi_resi;
	}







	public BigDecimal getR0080_expaccf_nbfi_resi() {
		return r0080_expaccf_nbfi_resi;
	}







	public void setR0080_expaccf_nbfi_resi(BigDecimal r0080_expaccf_nbfi_resi) {
		this.r0080_expaccf_nbfi_resi = r0080_expaccf_nbfi_resi;
	}







	public BigDecimal getR0080_expbccf_nbfi_nonresi() {
		return r0080_expbccf_nbfi_nonresi;
	}







	public void setR0080_expbccf_nbfi_nonresi(BigDecimal r0080_expbccf_nbfi_nonresi) {
		this.r0080_expbccf_nbfi_nonresi = r0080_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0080_expaccf_nbfi_nonresi() {
		return r0080_expaccf_nbfi_nonresi;
	}







	public void setR0080_expaccf_nbfi_nonresi(BigDecimal r0080_expaccf_nbfi_nonresi) {
		this.r0080_expaccf_nbfi_nonresi = r0080_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0080_expbccf_bank_resi() {
		return r0080_expbccf_bank_resi;
	}







	public void setR0080_expbccf_bank_resi(BigDecimal r0080_expbccf_bank_resi) {
		this.r0080_expbccf_bank_resi = r0080_expbccf_bank_resi;
	}







	public BigDecimal getR0080_expaccf_bank_resi() {
		return r0080_expaccf_bank_resi;
	}







	public void setR0080_expaccf_bank_resi(BigDecimal r0080_expaccf_bank_resi) {
		this.r0080_expaccf_bank_resi = r0080_expaccf_bank_resi;
	}







	public BigDecimal getR0080_expbccf_bank_nonresi() {
		return r0080_expbccf_bank_nonresi;
	}







	public void setR0080_expbccf_bank_nonresi(BigDecimal r0080_expbccf_bank_nonresi) {
		this.r0080_expbccf_bank_nonresi = r0080_expbccf_bank_nonresi;
	}







	public BigDecimal getR0080_expaccf_bank_nonresi() {
		return r0080_expaccf_bank_nonresi;
	}







	public void setR0080_expaccf_bank_nonresi(BigDecimal r0080_expaccf_bank_nonresi) {
		this.r0080_expaccf_bank_nonresi = r0080_expaccf_bank_nonresi;
	}







	public BigDecimal getR0080_expbccf_gov_resi() {
		return r0080_expbccf_gov_resi;
	}







	public void setR0080_expbccf_gov_resi(BigDecimal r0080_expbccf_gov_resi) {
		this.r0080_expbccf_gov_resi = r0080_expbccf_gov_resi;
	}







	public BigDecimal getR0080_expaccf_gov_resi() {
		return r0080_expaccf_gov_resi;
	}







	public void setR0080_expaccf_gov_resi(BigDecimal r0080_expaccf_gov_resi) {
		this.r0080_expaccf_gov_resi = r0080_expaccf_gov_resi;
	}







	public BigDecimal getR0080_expbccf_gov_nonresi() {
		return r0080_expbccf_gov_nonresi;
	}







	public void setR0080_expbccf_gov_nonresi(BigDecimal r0080_expbccf_gov_nonresi) {
		this.r0080_expbccf_gov_nonresi = r0080_expbccf_gov_nonresi;
	}







	public BigDecimal getR0080_expaccf_gov_nonresi() {
		return r0080_expaccf_gov_nonresi;
	}







	public void setR0080_expaccf_gov_nonresi(BigDecimal r0080_expaccf_gov_nonresi) {
		this.r0080_expaccf_gov_nonresi = r0080_expaccf_gov_nonresi;
	}







	public String getR0090_product() {
		return r0090_product;
	}







	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}







	public BigDecimal getR0090_expbccf_indiv_resi() {
		return r0090_expbccf_indiv_resi;
	}







	public void setR0090_expbccf_indiv_resi(BigDecimal r0090_expbccf_indiv_resi) {
		this.r0090_expbccf_indiv_resi = r0090_expbccf_indiv_resi;
	}







	public BigDecimal getR0090_expaccf_indiv_resi() {
		return r0090_expaccf_indiv_resi;
	}







	public void setR0090_expaccf_indiv_resi(BigDecimal r0090_expaccf_indiv_resi) {
		this.r0090_expaccf_indiv_resi = r0090_expaccf_indiv_resi;
	}







	public BigDecimal getR0090_expbccf_indiv_nonresi() {
		return r0090_expbccf_indiv_nonresi;
	}







	public void setR0090_expbccf_indiv_nonresi(BigDecimal r0090_expbccf_indiv_nonresi) {
		this.r0090_expbccf_indiv_nonresi = r0090_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0090_expaccf_indiv_nonresi() {
		return r0090_expaccf_indiv_nonresi;
	}







	public void setR0090_expaccf_indiv_nonresi(BigDecimal r0090_expaccf_indiv_nonresi) {
		this.r0090_expaccf_indiv_nonresi = r0090_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0090_expbccf_rsme_resi() {
		return r0090_expbccf_rsme_resi;
	}







	public void setR0090_expbccf_rsme_resi(BigDecimal r0090_expbccf_rsme_resi) {
		this.r0090_expbccf_rsme_resi = r0090_expbccf_rsme_resi;
	}







	public BigDecimal getR0090_expaccf_rsme_resi() {
		return r0090_expaccf_rsme_resi;
	}







	public void setR0090_expaccf_rsme_resi(BigDecimal r0090_expaccf_rsme_resi) {
		this.r0090_expaccf_rsme_resi = r0090_expaccf_rsme_resi;
	}







	public BigDecimal getR0090_expbccf_rsme_nonresi() {
		return r0090_expbccf_rsme_nonresi;
	}







	public void setR0090_expbccf_rsme_nonresi(BigDecimal r0090_expbccf_rsme_nonresi) {
		this.r0090_expbccf_rsme_nonresi = r0090_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0090_expaccf_rsme_nonresi() {
		return r0090_expaccf_rsme_nonresi;
	}







	public void setR0090_expaccf_rsme_nonresi(BigDecimal r0090_expaccf_rsme_nonresi) {
		this.r0090_expaccf_rsme_nonresi = r0090_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0090_expbccf_sme_resi() {
		return r0090_expbccf_sme_resi;
	}







	public void setR0090_expbccf_sme_resi(BigDecimal r0090_expbccf_sme_resi) {
		this.r0090_expbccf_sme_resi = r0090_expbccf_sme_resi;
	}







	public BigDecimal getR0090_expaccf_sme_resi() {
		return r0090_expaccf_sme_resi;
	}







	public void setR0090_expaccf_sme_resi(BigDecimal r0090_expaccf_sme_resi) {
		this.r0090_expaccf_sme_resi = r0090_expaccf_sme_resi;
	}







	public BigDecimal getR0090_expbccf_sme_nonresi() {
		return r0090_expbccf_sme_nonresi;
	}







	public void setR0090_expbccf_sme_nonresi(BigDecimal r0090_expbccf_sme_nonresi) {
		this.r0090_expbccf_sme_nonresi = r0090_expbccf_sme_nonresi;
	}







	public BigDecimal getR0090_expaccf_sme_nonresi() {
		return r0090_expaccf_sme_nonresi;
	}







	public void setR0090_expaccf_sme_nonresi(BigDecimal r0090_expaccf_sme_nonresi) {
		this.r0090_expaccf_sme_nonresi = r0090_expaccf_sme_nonresi;
	}







	public BigDecimal getR0090_expbccf_hni_resi() {
		return r0090_expbccf_hni_resi;
	}







	public void setR0090_expbccf_hni_resi(BigDecimal r0090_expbccf_hni_resi) {
		this.r0090_expbccf_hni_resi = r0090_expbccf_hni_resi;
	}







	public BigDecimal getR0090_expaccf_hni_resi() {
		return r0090_expaccf_hni_resi;
	}







	public void setR0090_expaccf_hni_resi(BigDecimal r0090_expaccf_hni_resi) {
		this.r0090_expaccf_hni_resi = r0090_expaccf_hni_resi;
	}







	public BigDecimal getR0090_expbccf_hni_nonresi() {
		return r0090_expbccf_hni_nonresi;
	}







	public void setR0090_expbccf_hni_nonresi(BigDecimal r0090_expbccf_hni_nonresi) {
		this.r0090_expbccf_hni_nonresi = r0090_expbccf_hni_nonresi;
	}







	public BigDecimal getR0090_expaccf_hni_nonresi() {
		return r0090_expaccf_hni_nonresi;
	}







	public void setR0090_expaccf_hni_nonresi(BigDecimal r0090_expaccf_hni_nonresi) {
		this.r0090_expaccf_hni_nonresi = r0090_expaccf_hni_nonresi;
	}







	public BigDecimal getR0090_expbccf_gres_resi() {
		return r0090_expbccf_gres_resi;
	}







	public void setR0090_expbccf_gres_resi(BigDecimal r0090_expbccf_gres_resi) {
		this.r0090_expbccf_gres_resi = r0090_expbccf_gres_resi;
	}







	public BigDecimal getR0090_expaccf_gres_resi() {
		return r0090_expaccf_gres_resi;
	}







	public void setR0090_expaccf_gres_resi(BigDecimal r0090_expaccf_gres_resi) {
		this.r0090_expaccf_gres_resi = r0090_expaccf_gres_resi;
	}







	public BigDecimal getR0090_expbccf_gres_nonresi() {
		return r0090_expbccf_gres_nonresi;
	}







	public void setR0090_expbccf_gres_nonresi(BigDecimal r0090_expbccf_gres_nonresi) {
		this.r0090_expbccf_gres_nonresi = r0090_expbccf_gres_nonresi;
	}







	public BigDecimal getR0090_expaccf_gres_nonresi() {
		return r0090_expaccf_gres_nonresi;
	}







	public void setR0090_expaccf_gres_nonresi(BigDecimal r0090_expaccf_gres_nonresi) {
		this.r0090_expaccf_gres_nonresi = r0090_expaccf_gres_nonresi;
	}







	public BigDecimal getR0090_expbccf_corp_resi() {
		return r0090_expbccf_corp_resi;
	}







	public void setR0090_expbccf_corp_resi(BigDecimal r0090_expbccf_corp_resi) {
		this.r0090_expbccf_corp_resi = r0090_expbccf_corp_resi;
	}







	public BigDecimal getR0090_expaccf_corp_resi() {
		return r0090_expaccf_corp_resi;
	}







	public void setR0090_expaccf_corp_resi(BigDecimal r0090_expaccf_corp_resi) {
		this.r0090_expaccf_corp_resi = r0090_expaccf_corp_resi;
	}







	public BigDecimal getR0090_expbccf_corp_nonresi() {
		return r0090_expbccf_corp_nonresi;
	}







	public void setR0090_expbccf_corp_nonresi(BigDecimal r0090_expbccf_corp_nonresi) {
		this.r0090_expbccf_corp_nonresi = r0090_expbccf_corp_nonresi;
	}







	public BigDecimal getR0090_expaccf_corp_nonresi() {
		return r0090_expaccf_corp_nonresi;
	}







	public void setR0090_expaccf_corp_nonresi(BigDecimal r0090_expaccf_corp_nonresi) {
		this.r0090_expaccf_corp_nonresi = r0090_expaccf_corp_nonresi;
	}







	public BigDecimal getR0090_expbccf_nbfi_resi() {
		return r0090_expbccf_nbfi_resi;
	}







	public void setR0090_expbccf_nbfi_resi(BigDecimal r0090_expbccf_nbfi_resi) {
		this.r0090_expbccf_nbfi_resi = r0090_expbccf_nbfi_resi;
	}







	public BigDecimal getR0090_expaccf_nbfi_resi() {
		return r0090_expaccf_nbfi_resi;
	}







	public void setR0090_expaccf_nbfi_resi(BigDecimal r0090_expaccf_nbfi_resi) {
		this.r0090_expaccf_nbfi_resi = r0090_expaccf_nbfi_resi;
	}







	public BigDecimal getR0090_expbccf_nbfi_nonresi() {
		return r0090_expbccf_nbfi_nonresi;
	}







	public void setR0090_expbccf_nbfi_nonresi(BigDecimal r0090_expbccf_nbfi_nonresi) {
		this.r0090_expbccf_nbfi_nonresi = r0090_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0090_expaccf_nbfi_nonresi() {
		return r0090_expaccf_nbfi_nonresi;
	}







	public void setR0090_expaccf_nbfi_nonresi(BigDecimal r0090_expaccf_nbfi_nonresi) {
		this.r0090_expaccf_nbfi_nonresi = r0090_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0090_expbccf_bank_resi() {
		return r0090_expbccf_bank_resi;
	}







	public void setR0090_expbccf_bank_resi(BigDecimal r0090_expbccf_bank_resi) {
		this.r0090_expbccf_bank_resi = r0090_expbccf_bank_resi;
	}







	public BigDecimal getR0090_expaccf_bank_resi() {
		return r0090_expaccf_bank_resi;
	}







	public void setR0090_expaccf_bank_resi(BigDecimal r0090_expaccf_bank_resi) {
		this.r0090_expaccf_bank_resi = r0090_expaccf_bank_resi;
	}







	public BigDecimal getR0090_expbccf_bank_nonresi() {
		return r0090_expbccf_bank_nonresi;
	}







	public void setR0090_expbccf_bank_nonresi(BigDecimal r0090_expbccf_bank_nonresi) {
		this.r0090_expbccf_bank_nonresi = r0090_expbccf_bank_nonresi;
	}







	public BigDecimal getR0090_expaccf_bank_nonresi() {
		return r0090_expaccf_bank_nonresi;
	}







	public void setR0090_expaccf_bank_nonresi(BigDecimal r0090_expaccf_bank_nonresi) {
		this.r0090_expaccf_bank_nonresi = r0090_expaccf_bank_nonresi;
	}







	public BigDecimal getR0090_expbccf_gov_resi() {
		return r0090_expbccf_gov_resi;
	}







	public void setR0090_expbccf_gov_resi(BigDecimal r0090_expbccf_gov_resi) {
		this.r0090_expbccf_gov_resi = r0090_expbccf_gov_resi;
	}







	public BigDecimal getR0090_expaccf_gov_resi() {
		return r0090_expaccf_gov_resi;
	}







	public void setR0090_expaccf_gov_resi(BigDecimal r0090_expaccf_gov_resi) {
		this.r0090_expaccf_gov_resi = r0090_expaccf_gov_resi;
	}







	public BigDecimal getR0090_expbccf_gov_nonresi() {
		return r0090_expbccf_gov_nonresi;
	}







	public void setR0090_expbccf_gov_nonresi(BigDecimal r0090_expbccf_gov_nonresi) {
		this.r0090_expbccf_gov_nonresi = r0090_expbccf_gov_nonresi;
	}







	public BigDecimal getR0090_expaccf_gov_nonresi() {
		return r0090_expaccf_gov_nonresi;
	}







	public void setR0090_expaccf_gov_nonresi(BigDecimal r0090_expaccf_gov_nonresi) {
		this.r0090_expaccf_gov_nonresi = r0090_expaccf_gov_nonresi;
	}







	public String getR0100_product() {
		return r0100_product;
	}







	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}







	public BigDecimal getR0100_expbccf_indiv_resi() {
		return r0100_expbccf_indiv_resi;
	}







	public void setR0100_expbccf_indiv_resi(BigDecimal r0100_expbccf_indiv_resi) {
		this.r0100_expbccf_indiv_resi = r0100_expbccf_indiv_resi;
	}







	public BigDecimal getR0100_expaccf_indiv_resi() {
		return r0100_expaccf_indiv_resi;
	}







	public void setR0100_expaccf_indiv_resi(BigDecimal r0100_expaccf_indiv_resi) {
		this.r0100_expaccf_indiv_resi = r0100_expaccf_indiv_resi;
	}







	public BigDecimal getR0100_expbccf_indiv_nonresi() {
		return r0100_expbccf_indiv_nonresi;
	}







	public void setR0100_expbccf_indiv_nonresi(BigDecimal r0100_expbccf_indiv_nonresi) {
		this.r0100_expbccf_indiv_nonresi = r0100_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0100_expaccf_indiv_nonresi() {
		return r0100_expaccf_indiv_nonresi;
	}







	public void setR0100_expaccf_indiv_nonresi(BigDecimal r0100_expaccf_indiv_nonresi) {
		this.r0100_expaccf_indiv_nonresi = r0100_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0100_expbccf_rsme_resi() {
		return r0100_expbccf_rsme_resi;
	}







	public void setR0100_expbccf_rsme_resi(BigDecimal r0100_expbccf_rsme_resi) {
		this.r0100_expbccf_rsme_resi = r0100_expbccf_rsme_resi;
	}







	public BigDecimal getR0100_expaccf_rsme_resi() {
		return r0100_expaccf_rsme_resi;
	}







	public void setR0100_expaccf_rsme_resi(BigDecimal r0100_expaccf_rsme_resi) {
		this.r0100_expaccf_rsme_resi = r0100_expaccf_rsme_resi;
	}







	public BigDecimal getR0100_expbccf_rsme_nonresi() {
		return r0100_expbccf_rsme_nonresi;
	}







	public void setR0100_expbccf_rsme_nonresi(BigDecimal r0100_expbccf_rsme_nonresi) {
		this.r0100_expbccf_rsme_nonresi = r0100_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0100_expaccf_rsme_nonresi() {
		return r0100_expaccf_rsme_nonresi;
	}







	public void setR0100_expaccf_rsme_nonresi(BigDecimal r0100_expaccf_rsme_nonresi) {
		this.r0100_expaccf_rsme_nonresi = r0100_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0100_expbccf_sme_resi() {
		return r0100_expbccf_sme_resi;
	}







	public void setR0100_expbccf_sme_resi(BigDecimal r0100_expbccf_sme_resi) {
		this.r0100_expbccf_sme_resi = r0100_expbccf_sme_resi;
	}







	public BigDecimal getR0100_expaccf_sme_resi() {
		return r0100_expaccf_sme_resi;
	}







	public void setR0100_expaccf_sme_resi(BigDecimal r0100_expaccf_sme_resi) {
		this.r0100_expaccf_sme_resi = r0100_expaccf_sme_resi;
	}







	public BigDecimal getR0100_expbccf_sme_nonresi() {
		return r0100_expbccf_sme_nonresi;
	}







	public void setR0100_expbccf_sme_nonresi(BigDecimal r0100_expbccf_sme_nonresi) {
		this.r0100_expbccf_sme_nonresi = r0100_expbccf_sme_nonresi;
	}







	public BigDecimal getR0100_expaccf_sme_nonresi() {
		return r0100_expaccf_sme_nonresi;
	}







	public void setR0100_expaccf_sme_nonresi(BigDecimal r0100_expaccf_sme_nonresi) {
		this.r0100_expaccf_sme_nonresi = r0100_expaccf_sme_nonresi;
	}







	public BigDecimal getR0100_expbccf_hni_resi() {
		return r0100_expbccf_hni_resi;
	}







	public void setR0100_expbccf_hni_resi(BigDecimal r0100_expbccf_hni_resi) {
		this.r0100_expbccf_hni_resi = r0100_expbccf_hni_resi;
	}







	public BigDecimal getR0100_expaccf_hni_resi() {
		return r0100_expaccf_hni_resi;
	}







	public void setR0100_expaccf_hni_resi(BigDecimal r0100_expaccf_hni_resi) {
		this.r0100_expaccf_hni_resi = r0100_expaccf_hni_resi;
	}







	public BigDecimal getR0100_expbccf_hni_nonresi() {
		return r0100_expbccf_hni_nonresi;
	}







	public void setR0100_expbccf_hni_nonresi(BigDecimal r0100_expbccf_hni_nonresi) {
		this.r0100_expbccf_hni_nonresi = r0100_expbccf_hni_nonresi;
	}







	public BigDecimal getR0100_expaccf_hni_nonresi() {
		return r0100_expaccf_hni_nonresi;
	}







	public void setR0100_expaccf_hni_nonresi(BigDecimal r0100_expaccf_hni_nonresi) {
		this.r0100_expaccf_hni_nonresi = r0100_expaccf_hni_nonresi;
	}







	public BigDecimal getR0100_expbccf_gres_resi() {
		return r0100_expbccf_gres_resi;
	}







	public void setR0100_expbccf_gres_resi(BigDecimal r0100_expbccf_gres_resi) {
		this.r0100_expbccf_gres_resi = r0100_expbccf_gres_resi;
	}







	public BigDecimal getR0100_expaccf_gres_resi() {
		return r0100_expaccf_gres_resi;
	}







	public void setR0100_expaccf_gres_resi(BigDecimal r0100_expaccf_gres_resi) {
		this.r0100_expaccf_gres_resi = r0100_expaccf_gres_resi;
	}







	public BigDecimal getR0100_expbccf_gres_nonresi() {
		return r0100_expbccf_gres_nonresi;
	}







	public void setR0100_expbccf_gres_nonresi(BigDecimal r0100_expbccf_gres_nonresi) {
		this.r0100_expbccf_gres_nonresi = r0100_expbccf_gres_nonresi;
	}







	public BigDecimal getR0100_expaccf_gres_nonresi() {
		return r0100_expaccf_gres_nonresi;
	}







	public void setR0100_expaccf_gres_nonresi(BigDecimal r0100_expaccf_gres_nonresi) {
		this.r0100_expaccf_gres_nonresi = r0100_expaccf_gres_nonresi;
	}







	public BigDecimal getR0100_expbccf_corp_resi() {
		return r0100_expbccf_corp_resi;
	}







	public void setR0100_expbccf_corp_resi(BigDecimal r0100_expbccf_corp_resi) {
		this.r0100_expbccf_corp_resi = r0100_expbccf_corp_resi;
	}







	public BigDecimal getR0100_expaccf_corp_resi() {
		return r0100_expaccf_corp_resi;
	}







	public void setR0100_expaccf_corp_resi(BigDecimal r0100_expaccf_corp_resi) {
		this.r0100_expaccf_corp_resi = r0100_expaccf_corp_resi;
	}







	public BigDecimal getR0100_expbccf_corp_nonresi() {
		return r0100_expbccf_corp_nonresi;
	}







	public void setR0100_expbccf_corp_nonresi(BigDecimal r0100_expbccf_corp_nonresi) {
		this.r0100_expbccf_corp_nonresi = r0100_expbccf_corp_nonresi;
	}







	public BigDecimal getR0100_expaccf_corp_nonresi() {
		return r0100_expaccf_corp_nonresi;
	}







	public void setR0100_expaccf_corp_nonresi(BigDecimal r0100_expaccf_corp_nonresi) {
		this.r0100_expaccf_corp_nonresi = r0100_expaccf_corp_nonresi;
	}







	public BigDecimal getR0100_expbccf_nbfi_resi() {
		return r0100_expbccf_nbfi_resi;
	}







	public void setR0100_expbccf_nbfi_resi(BigDecimal r0100_expbccf_nbfi_resi) {
		this.r0100_expbccf_nbfi_resi = r0100_expbccf_nbfi_resi;
	}







	public BigDecimal getR0100_expaccf_nbfi_resi() {
		return r0100_expaccf_nbfi_resi;
	}







	public void setR0100_expaccf_nbfi_resi(BigDecimal r0100_expaccf_nbfi_resi) {
		this.r0100_expaccf_nbfi_resi = r0100_expaccf_nbfi_resi;
	}







	public BigDecimal getR0100_expbccf_nbfi_nonresi() {
		return r0100_expbccf_nbfi_nonresi;
	}







	public void setR0100_expbccf_nbfi_nonresi(BigDecimal r0100_expbccf_nbfi_nonresi) {
		this.r0100_expbccf_nbfi_nonresi = r0100_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0100_expaccf_nbfi_nonresi() {
		return r0100_expaccf_nbfi_nonresi;
	}







	public void setR0100_expaccf_nbfi_nonresi(BigDecimal r0100_expaccf_nbfi_nonresi) {
		this.r0100_expaccf_nbfi_nonresi = r0100_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0100_expbccf_bank_resi() {
		return r0100_expbccf_bank_resi;
	}







	public void setR0100_expbccf_bank_resi(BigDecimal r0100_expbccf_bank_resi) {
		this.r0100_expbccf_bank_resi = r0100_expbccf_bank_resi;
	}







	public BigDecimal getR0100_expaccf_bank_resi() {
		return r0100_expaccf_bank_resi;
	}







	public void setR0100_expaccf_bank_resi(BigDecimal r0100_expaccf_bank_resi) {
		this.r0100_expaccf_bank_resi = r0100_expaccf_bank_resi;
	}







	public BigDecimal getR0100_expbccf_bank_nonresi() {
		return r0100_expbccf_bank_nonresi;
	}







	public void setR0100_expbccf_bank_nonresi(BigDecimal r0100_expbccf_bank_nonresi) {
		this.r0100_expbccf_bank_nonresi = r0100_expbccf_bank_nonresi;
	}







	public BigDecimal getR0100_expaccf_bank_nonresi() {
		return r0100_expaccf_bank_nonresi;
	}







	public void setR0100_expaccf_bank_nonresi(BigDecimal r0100_expaccf_bank_nonresi) {
		this.r0100_expaccf_bank_nonresi = r0100_expaccf_bank_nonresi;
	}







	public BigDecimal getR0100_expbccf_gov_resi() {
		return r0100_expbccf_gov_resi;
	}







	public void setR0100_expbccf_gov_resi(BigDecimal r0100_expbccf_gov_resi) {
		this.r0100_expbccf_gov_resi = r0100_expbccf_gov_resi;
	}







	public BigDecimal getR0100_expaccf_gov_resi() {
		return r0100_expaccf_gov_resi;
	}







	public void setR0100_expaccf_gov_resi(BigDecimal r0100_expaccf_gov_resi) {
		this.r0100_expaccf_gov_resi = r0100_expaccf_gov_resi;
	}







	public BigDecimal getR0100_expbccf_gov_nonresi() {
		return r0100_expbccf_gov_nonresi;
	}







	public void setR0100_expbccf_gov_nonresi(BigDecimal r0100_expbccf_gov_nonresi) {
		this.r0100_expbccf_gov_nonresi = r0100_expbccf_gov_nonresi;
	}







	public BigDecimal getR0100_expaccf_gov_nonresi() {
		return r0100_expaccf_gov_nonresi;
	}







	public void setR0100_expaccf_gov_nonresi(BigDecimal r0100_expaccf_gov_nonresi) {
		this.r0100_expaccf_gov_nonresi = r0100_expaccf_gov_nonresi;
	}







	public String getR0110_product() {
		return r0110_product;
	}







	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}







	public BigDecimal getR0110_expbccf_indiv_resi() {
		return r0110_expbccf_indiv_resi;
	}







	public void setR0110_expbccf_indiv_resi(BigDecimal r0110_expbccf_indiv_resi) {
		this.r0110_expbccf_indiv_resi = r0110_expbccf_indiv_resi;
	}







	public BigDecimal getR0110_expaccf_indiv_resi() {
		return r0110_expaccf_indiv_resi;
	}







	public void setR0110_expaccf_indiv_resi(BigDecimal r0110_expaccf_indiv_resi) {
		this.r0110_expaccf_indiv_resi = r0110_expaccf_indiv_resi;
	}







	public BigDecimal getR0110_expbccf_indiv_nonresi() {
		return r0110_expbccf_indiv_nonresi;
	}







	public void setR0110_expbccf_indiv_nonresi(BigDecimal r0110_expbccf_indiv_nonresi) {
		this.r0110_expbccf_indiv_nonresi = r0110_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0110_expaccf_indiv_nonresi() {
		return r0110_expaccf_indiv_nonresi;
	}







	public void setR0110_expaccf_indiv_nonresi(BigDecimal r0110_expaccf_indiv_nonresi) {
		this.r0110_expaccf_indiv_nonresi = r0110_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0110_expbccf_rsme_resi() {
		return r0110_expbccf_rsme_resi;
	}







	public void setR0110_expbccf_rsme_resi(BigDecimal r0110_expbccf_rsme_resi) {
		this.r0110_expbccf_rsme_resi = r0110_expbccf_rsme_resi;
	}







	public BigDecimal getR0110_expaccf_rsme_resi() {
		return r0110_expaccf_rsme_resi;
	}







	public void setR0110_expaccf_rsme_resi(BigDecimal r0110_expaccf_rsme_resi) {
		this.r0110_expaccf_rsme_resi = r0110_expaccf_rsme_resi;
	}







	public BigDecimal getR0110_expbccf_rsme_nonresi() {
		return r0110_expbccf_rsme_nonresi;
	}







	public void setR0110_expbccf_rsme_nonresi(BigDecimal r0110_expbccf_rsme_nonresi) {
		this.r0110_expbccf_rsme_nonresi = r0110_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0110_expaccf_rsme_nonresi() {
		return r0110_expaccf_rsme_nonresi;
	}







	public void setR0110_expaccf_rsme_nonresi(BigDecimal r0110_expaccf_rsme_nonresi) {
		this.r0110_expaccf_rsme_nonresi = r0110_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0110_expbccf_sme_resi() {
		return r0110_expbccf_sme_resi;
	}







	public void setR0110_expbccf_sme_resi(BigDecimal r0110_expbccf_sme_resi) {
		this.r0110_expbccf_sme_resi = r0110_expbccf_sme_resi;
	}







	public BigDecimal getR0110_expaccf_sme_resi() {
		return r0110_expaccf_sme_resi;
	}







	public void setR0110_expaccf_sme_resi(BigDecimal r0110_expaccf_sme_resi) {
		this.r0110_expaccf_sme_resi = r0110_expaccf_sme_resi;
	}







	public BigDecimal getR0110_expbccf_sme_nonresi() {
		return r0110_expbccf_sme_nonresi;
	}







	public void setR0110_expbccf_sme_nonresi(BigDecimal r0110_expbccf_sme_nonresi) {
		this.r0110_expbccf_sme_nonresi = r0110_expbccf_sme_nonresi;
	}







	public BigDecimal getR0110_expaccf_sme_nonresi() {
		return r0110_expaccf_sme_nonresi;
	}







	public void setR0110_expaccf_sme_nonresi(BigDecimal r0110_expaccf_sme_nonresi) {
		this.r0110_expaccf_sme_nonresi = r0110_expaccf_sme_nonresi;
	}







	public BigDecimal getR0110_expbccf_hni_resi() {
		return r0110_expbccf_hni_resi;
	}







	public void setR0110_expbccf_hni_resi(BigDecimal r0110_expbccf_hni_resi) {
		this.r0110_expbccf_hni_resi = r0110_expbccf_hni_resi;
	}







	public BigDecimal getR0110_expaccf_hni_resi() {
		return r0110_expaccf_hni_resi;
	}







	public void setR0110_expaccf_hni_resi(BigDecimal r0110_expaccf_hni_resi) {
		this.r0110_expaccf_hni_resi = r0110_expaccf_hni_resi;
	}







	public BigDecimal getR0110_expbccf_hni_nonresi() {
		return r0110_expbccf_hni_nonresi;
	}







	public void setR0110_expbccf_hni_nonresi(BigDecimal r0110_expbccf_hni_nonresi) {
		this.r0110_expbccf_hni_nonresi = r0110_expbccf_hni_nonresi;
	}







	public BigDecimal getR0110_expaccf_hni_nonresi() {
		return r0110_expaccf_hni_nonresi;
	}







	public void setR0110_expaccf_hni_nonresi(BigDecimal r0110_expaccf_hni_nonresi) {
		this.r0110_expaccf_hni_nonresi = r0110_expaccf_hni_nonresi;
	}







	public BigDecimal getR0110_expbccf_gres_resi() {
		return r0110_expbccf_gres_resi;
	}







	public void setR0110_expbccf_gres_resi(BigDecimal r0110_expbccf_gres_resi) {
		this.r0110_expbccf_gres_resi = r0110_expbccf_gres_resi;
	}







	public BigDecimal getR0110_expaccf_gres_resi() {
		return r0110_expaccf_gres_resi;
	}







	public void setR0110_expaccf_gres_resi(BigDecimal r0110_expaccf_gres_resi) {
		this.r0110_expaccf_gres_resi = r0110_expaccf_gres_resi;
	}







	public BigDecimal getR0110_expbccf_gres_nonresi() {
		return r0110_expbccf_gres_nonresi;
	}







	public void setR0110_expbccf_gres_nonresi(BigDecimal r0110_expbccf_gres_nonresi) {
		this.r0110_expbccf_gres_nonresi = r0110_expbccf_gres_nonresi;
	}







	public BigDecimal getR0110_expaccf_gres_nonresi() {
		return r0110_expaccf_gres_nonresi;
	}







	public void setR0110_expaccf_gres_nonresi(BigDecimal r0110_expaccf_gres_nonresi) {
		this.r0110_expaccf_gres_nonresi = r0110_expaccf_gres_nonresi;
	}







	public BigDecimal getR0110_expbccf_corp_resi() {
		return r0110_expbccf_corp_resi;
	}







	public void setR0110_expbccf_corp_resi(BigDecimal r0110_expbccf_corp_resi) {
		this.r0110_expbccf_corp_resi = r0110_expbccf_corp_resi;
	}







	public BigDecimal getR0110_expaccf_corp_resi() {
		return r0110_expaccf_corp_resi;
	}







	public void setR0110_expaccf_corp_resi(BigDecimal r0110_expaccf_corp_resi) {
		this.r0110_expaccf_corp_resi = r0110_expaccf_corp_resi;
	}







	public BigDecimal getR0110_expbccf_corp_nonresi() {
		return r0110_expbccf_corp_nonresi;
	}







	public void setR0110_expbccf_corp_nonresi(BigDecimal r0110_expbccf_corp_nonresi) {
		this.r0110_expbccf_corp_nonresi = r0110_expbccf_corp_nonresi;
	}







	public BigDecimal getR0110_expaccf_corp_nonresi() {
		return r0110_expaccf_corp_nonresi;
	}







	public void setR0110_expaccf_corp_nonresi(BigDecimal r0110_expaccf_corp_nonresi) {
		this.r0110_expaccf_corp_nonresi = r0110_expaccf_corp_nonresi;
	}







	public BigDecimal getR0110_expbccf_nbfi_resi() {
		return r0110_expbccf_nbfi_resi;
	}







	public void setR0110_expbccf_nbfi_resi(BigDecimal r0110_expbccf_nbfi_resi) {
		this.r0110_expbccf_nbfi_resi = r0110_expbccf_nbfi_resi;
	}







	public BigDecimal getR0110_expaccf_nbfi_resi() {
		return r0110_expaccf_nbfi_resi;
	}







	public void setR0110_expaccf_nbfi_resi(BigDecimal r0110_expaccf_nbfi_resi) {
		this.r0110_expaccf_nbfi_resi = r0110_expaccf_nbfi_resi;
	}







	public BigDecimal getR0110_expbccf_nbfi_nonresi() {
		return r0110_expbccf_nbfi_nonresi;
	}







	public void setR0110_expbccf_nbfi_nonresi(BigDecimal r0110_expbccf_nbfi_nonresi) {
		this.r0110_expbccf_nbfi_nonresi = r0110_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0110_expaccf_nbfi_nonresi() {
		return r0110_expaccf_nbfi_nonresi;
	}







	public void setR0110_expaccf_nbfi_nonresi(BigDecimal r0110_expaccf_nbfi_nonresi) {
		this.r0110_expaccf_nbfi_nonresi = r0110_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0110_expbccf_bank_resi() {
		return r0110_expbccf_bank_resi;
	}







	public void setR0110_expbccf_bank_resi(BigDecimal r0110_expbccf_bank_resi) {
		this.r0110_expbccf_bank_resi = r0110_expbccf_bank_resi;
	}







	public BigDecimal getR0110_expaccf_bank_resi() {
		return r0110_expaccf_bank_resi;
	}







	public void setR0110_expaccf_bank_resi(BigDecimal r0110_expaccf_bank_resi) {
		this.r0110_expaccf_bank_resi = r0110_expaccf_bank_resi;
	}







	public BigDecimal getR0110_expbccf_bank_nonresi() {
		return r0110_expbccf_bank_nonresi;
	}







	public void setR0110_expbccf_bank_nonresi(BigDecimal r0110_expbccf_bank_nonresi) {
		this.r0110_expbccf_bank_nonresi = r0110_expbccf_bank_nonresi;
	}







	public BigDecimal getR0110_expaccf_bank_nonresi() {
		return r0110_expaccf_bank_nonresi;
	}







	public void setR0110_expaccf_bank_nonresi(BigDecimal r0110_expaccf_bank_nonresi) {
		this.r0110_expaccf_bank_nonresi = r0110_expaccf_bank_nonresi;
	}







	public BigDecimal getR0110_expbccf_gov_resi() {
		return r0110_expbccf_gov_resi;
	}







	public void setR0110_expbccf_gov_resi(BigDecimal r0110_expbccf_gov_resi) {
		this.r0110_expbccf_gov_resi = r0110_expbccf_gov_resi;
	}







	public BigDecimal getR0110_expaccf_gov_resi() {
		return r0110_expaccf_gov_resi;
	}







	public void setR0110_expaccf_gov_resi(BigDecimal r0110_expaccf_gov_resi) {
		this.r0110_expaccf_gov_resi = r0110_expaccf_gov_resi;
	}







	public BigDecimal getR0110_expbccf_gov_nonresi() {
		return r0110_expbccf_gov_nonresi;
	}







	public void setR0110_expbccf_gov_nonresi(BigDecimal r0110_expbccf_gov_nonresi) {
		this.r0110_expbccf_gov_nonresi = r0110_expbccf_gov_nonresi;
	}







	public BigDecimal getR0110_expaccf_gov_nonresi() {
		return r0110_expaccf_gov_nonresi;
	}







	public void setR0110_expaccf_gov_nonresi(BigDecimal r0110_expaccf_gov_nonresi) {
		this.r0110_expaccf_gov_nonresi = r0110_expaccf_gov_nonresi;
	}







	public String getR0120_product() {
		return r0120_product;
	}







	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}







	public BigDecimal getR0120_expbccf_indiv_resi() {
		return r0120_expbccf_indiv_resi;
	}







	public void setR0120_expbccf_indiv_resi(BigDecimal r0120_expbccf_indiv_resi) {
		this.r0120_expbccf_indiv_resi = r0120_expbccf_indiv_resi;
	}







	public BigDecimal getR0120_expaccf_indiv_resi() {
		return r0120_expaccf_indiv_resi;
	}







	public void setR0120_expaccf_indiv_resi(BigDecimal r0120_expaccf_indiv_resi) {
		this.r0120_expaccf_indiv_resi = r0120_expaccf_indiv_resi;
	}







	public BigDecimal getR0120_expbccf_indiv_nonresi() {
		return r0120_expbccf_indiv_nonresi;
	}







	public void setR0120_expbccf_indiv_nonresi(BigDecimal r0120_expbccf_indiv_nonresi) {
		this.r0120_expbccf_indiv_nonresi = r0120_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0120_expaccf_indiv_nonresi() {
		return r0120_expaccf_indiv_nonresi;
	}







	public void setR0120_expaccf_indiv_nonresi(BigDecimal r0120_expaccf_indiv_nonresi) {
		this.r0120_expaccf_indiv_nonresi = r0120_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0120_expbccf_rsme_resi() {
		return r0120_expbccf_rsme_resi;
	}







	public void setR0120_expbccf_rsme_resi(BigDecimal r0120_expbccf_rsme_resi) {
		this.r0120_expbccf_rsme_resi = r0120_expbccf_rsme_resi;
	}







	public BigDecimal getR0120_expaccf_rsme_resi() {
		return r0120_expaccf_rsme_resi;
	}







	public void setR0120_expaccf_rsme_resi(BigDecimal r0120_expaccf_rsme_resi) {
		this.r0120_expaccf_rsme_resi = r0120_expaccf_rsme_resi;
	}







	public BigDecimal getR0120_expbccf_rsme_nonresi() {
		return r0120_expbccf_rsme_nonresi;
	}







	public void setR0120_expbccf_rsme_nonresi(BigDecimal r0120_expbccf_rsme_nonresi) {
		this.r0120_expbccf_rsme_nonresi = r0120_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0120_expaccf_rsme_nonresi() {
		return r0120_expaccf_rsme_nonresi;
	}







	public void setR0120_expaccf_rsme_nonresi(BigDecimal r0120_expaccf_rsme_nonresi) {
		this.r0120_expaccf_rsme_nonresi = r0120_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0120_expbccf_sme_resi() {
		return r0120_expbccf_sme_resi;
	}







	public void setR0120_expbccf_sme_resi(BigDecimal r0120_expbccf_sme_resi) {
		this.r0120_expbccf_sme_resi = r0120_expbccf_sme_resi;
	}







	public BigDecimal getR0120_expaccf_sme_resi() {
		return r0120_expaccf_sme_resi;
	}







	public void setR0120_expaccf_sme_resi(BigDecimal r0120_expaccf_sme_resi) {
		this.r0120_expaccf_sme_resi = r0120_expaccf_sme_resi;
	}







	public BigDecimal getR0120_expbccf_sme_nonresi() {
		return r0120_expbccf_sme_nonresi;
	}







	public void setR0120_expbccf_sme_nonresi(BigDecimal r0120_expbccf_sme_nonresi) {
		this.r0120_expbccf_sme_nonresi = r0120_expbccf_sme_nonresi;
	}







	public BigDecimal getR0120_expaccf_sme_nonresi() {
		return r0120_expaccf_sme_nonresi;
	}







	public void setR0120_expaccf_sme_nonresi(BigDecimal r0120_expaccf_sme_nonresi) {
		this.r0120_expaccf_sme_nonresi = r0120_expaccf_sme_nonresi;
	}







	public BigDecimal getR0120_expbccf_hni_resi() {
		return r0120_expbccf_hni_resi;
	}







	public void setR0120_expbccf_hni_resi(BigDecimal r0120_expbccf_hni_resi) {
		this.r0120_expbccf_hni_resi = r0120_expbccf_hni_resi;
	}







	public BigDecimal getR0120_expaccf_hni_resi() {
		return r0120_expaccf_hni_resi;
	}







	public void setR0120_expaccf_hni_resi(BigDecimal r0120_expaccf_hni_resi) {
		this.r0120_expaccf_hni_resi = r0120_expaccf_hni_resi;
	}







	public BigDecimal getR0120_expbccf_hni_nonresi() {
		return r0120_expbccf_hni_nonresi;
	}







	public void setR0120_expbccf_hni_nonresi(BigDecimal r0120_expbccf_hni_nonresi) {
		this.r0120_expbccf_hni_nonresi = r0120_expbccf_hni_nonresi;
	}







	public BigDecimal getR0120_expaccf_hni_nonresi() {
		return r0120_expaccf_hni_nonresi;
	}







	public void setR0120_expaccf_hni_nonresi(BigDecimal r0120_expaccf_hni_nonresi) {
		this.r0120_expaccf_hni_nonresi = r0120_expaccf_hni_nonresi;
	}







	public BigDecimal getR0120_expbccf_gres_resi() {
		return r0120_expbccf_gres_resi;
	}







	public void setR0120_expbccf_gres_resi(BigDecimal r0120_expbccf_gres_resi) {
		this.r0120_expbccf_gres_resi = r0120_expbccf_gres_resi;
	}







	public BigDecimal getR0120_expaccf_gres_resi() {
		return r0120_expaccf_gres_resi;
	}







	public void setR0120_expaccf_gres_resi(BigDecimal r0120_expaccf_gres_resi) {
		this.r0120_expaccf_gres_resi = r0120_expaccf_gres_resi;
	}







	public BigDecimal getR0120_expbccf_gres_nonresi() {
		return r0120_expbccf_gres_nonresi;
	}







	public void setR0120_expbccf_gres_nonresi(BigDecimal r0120_expbccf_gres_nonresi) {
		this.r0120_expbccf_gres_nonresi = r0120_expbccf_gres_nonresi;
	}







	public BigDecimal getR0120_expaccf_gres_nonresi() {
		return r0120_expaccf_gres_nonresi;
	}







	public void setR0120_expaccf_gres_nonresi(BigDecimal r0120_expaccf_gres_nonresi) {
		this.r0120_expaccf_gres_nonresi = r0120_expaccf_gres_nonresi;
	}







	public BigDecimal getR0120_expbccf_corp_resi() {
		return r0120_expbccf_corp_resi;
	}







	public void setR0120_expbccf_corp_resi(BigDecimal r0120_expbccf_corp_resi) {
		this.r0120_expbccf_corp_resi = r0120_expbccf_corp_resi;
	}







	public BigDecimal getR0120_expaccf_corp_resi() {
		return r0120_expaccf_corp_resi;
	}







	public void setR0120_expaccf_corp_resi(BigDecimal r0120_expaccf_corp_resi) {
		this.r0120_expaccf_corp_resi = r0120_expaccf_corp_resi;
	}







	public BigDecimal getR0120_expbccf_corp_nonresi() {
		return r0120_expbccf_corp_nonresi;
	}







	public void setR0120_expbccf_corp_nonresi(BigDecimal r0120_expbccf_corp_nonresi) {
		this.r0120_expbccf_corp_nonresi = r0120_expbccf_corp_nonresi;
	}







	public BigDecimal getR0120_expaccf_corp_nonresi() {
		return r0120_expaccf_corp_nonresi;
	}







	public void setR0120_expaccf_corp_nonresi(BigDecimal r0120_expaccf_corp_nonresi) {
		this.r0120_expaccf_corp_nonresi = r0120_expaccf_corp_nonresi;
	}







	public BigDecimal getR0120_expbccf_nbfi_resi() {
		return r0120_expbccf_nbfi_resi;
	}







	public void setR0120_expbccf_nbfi_resi(BigDecimal r0120_expbccf_nbfi_resi) {
		this.r0120_expbccf_nbfi_resi = r0120_expbccf_nbfi_resi;
	}







	public BigDecimal getR0120_expaccf_nbfi_resi() {
		return r0120_expaccf_nbfi_resi;
	}







	public void setR0120_expaccf_nbfi_resi(BigDecimal r0120_expaccf_nbfi_resi) {
		this.r0120_expaccf_nbfi_resi = r0120_expaccf_nbfi_resi;
	}







	public BigDecimal getR0120_expbccf_nbfi_nonresi() {
		return r0120_expbccf_nbfi_nonresi;
	}







	public void setR0120_expbccf_nbfi_nonresi(BigDecimal r0120_expbccf_nbfi_nonresi) {
		this.r0120_expbccf_nbfi_nonresi = r0120_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0120_expaccf_nbfi_nonresi() {
		return r0120_expaccf_nbfi_nonresi;
	}







	public void setR0120_expaccf_nbfi_nonresi(BigDecimal r0120_expaccf_nbfi_nonresi) {
		this.r0120_expaccf_nbfi_nonresi = r0120_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0120_expbccf_bank_resi() {
		return r0120_expbccf_bank_resi;
	}







	public void setR0120_expbccf_bank_resi(BigDecimal r0120_expbccf_bank_resi) {
		this.r0120_expbccf_bank_resi = r0120_expbccf_bank_resi;
	}







	public BigDecimal getR0120_expaccf_bank_resi() {
		return r0120_expaccf_bank_resi;
	}







	public void setR0120_expaccf_bank_resi(BigDecimal r0120_expaccf_bank_resi) {
		this.r0120_expaccf_bank_resi = r0120_expaccf_bank_resi;
	}







	public BigDecimal getR0120_expbccf_bank_nonresi() {
		return r0120_expbccf_bank_nonresi;
	}







	public void setR0120_expbccf_bank_nonresi(BigDecimal r0120_expbccf_bank_nonresi) {
		this.r0120_expbccf_bank_nonresi = r0120_expbccf_bank_nonresi;
	}







	public BigDecimal getR0120_expaccf_bank_nonresi() {
		return r0120_expaccf_bank_nonresi;
	}







	public void setR0120_expaccf_bank_nonresi(BigDecimal r0120_expaccf_bank_nonresi) {
		this.r0120_expaccf_bank_nonresi = r0120_expaccf_bank_nonresi;
	}







	public BigDecimal getR0120_expbccf_gov_resi() {
		return r0120_expbccf_gov_resi;
	}







	public void setR0120_expbccf_gov_resi(BigDecimal r0120_expbccf_gov_resi) {
		this.r0120_expbccf_gov_resi = r0120_expbccf_gov_resi;
	}







	public BigDecimal getR0120_expaccf_gov_resi() {
		return r0120_expaccf_gov_resi;
	}







	public void setR0120_expaccf_gov_resi(BigDecimal r0120_expaccf_gov_resi) {
		this.r0120_expaccf_gov_resi = r0120_expaccf_gov_resi;
	}







	public BigDecimal getR0120_expbccf_gov_nonresi() {
		return r0120_expbccf_gov_nonresi;
	}







	public void setR0120_expbccf_gov_nonresi(BigDecimal r0120_expbccf_gov_nonresi) {
		this.r0120_expbccf_gov_nonresi = r0120_expbccf_gov_nonresi;
	}







	public BigDecimal getR0120_expaccf_gov_nonresi() {
		return r0120_expaccf_gov_nonresi;
	}







	public void setR0120_expaccf_gov_nonresi(BigDecimal r0120_expaccf_gov_nonresi) {
		this.r0120_expaccf_gov_nonresi = r0120_expaccf_gov_nonresi;
	}







	public String getR0130_product() {
		return r0130_product;
	}







	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}







	public BigDecimal getR0130_expbccf_indiv_resi() {
		return r0130_expbccf_indiv_resi;
	}







	public void setR0130_expbccf_indiv_resi(BigDecimal r0130_expbccf_indiv_resi) {
		this.r0130_expbccf_indiv_resi = r0130_expbccf_indiv_resi;
	}







	public BigDecimal getR0130_expaccf_indiv_resi() {
		return r0130_expaccf_indiv_resi;
	}







	public void setR0130_expaccf_indiv_resi(BigDecimal r0130_expaccf_indiv_resi) {
		this.r0130_expaccf_indiv_resi = r0130_expaccf_indiv_resi;
	}







	public BigDecimal getR0130_expbccf_indiv_nonresi() {
		return r0130_expbccf_indiv_nonresi;
	}







	public void setR0130_expbccf_indiv_nonresi(BigDecimal r0130_expbccf_indiv_nonresi) {
		this.r0130_expbccf_indiv_nonresi = r0130_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0130_expaccf_indiv_nonresi() {
		return r0130_expaccf_indiv_nonresi;
	}







	public void setR0130_expaccf_indiv_nonresi(BigDecimal r0130_expaccf_indiv_nonresi) {
		this.r0130_expaccf_indiv_nonresi = r0130_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0130_expbccf_rsme_resi() {
		return r0130_expbccf_rsme_resi;
	}







	public void setR0130_expbccf_rsme_resi(BigDecimal r0130_expbccf_rsme_resi) {
		this.r0130_expbccf_rsme_resi = r0130_expbccf_rsme_resi;
	}







	public BigDecimal getR0130_expaccf_rsme_resi() {
		return r0130_expaccf_rsme_resi;
	}







	public void setR0130_expaccf_rsme_resi(BigDecimal r0130_expaccf_rsme_resi) {
		this.r0130_expaccf_rsme_resi = r0130_expaccf_rsme_resi;
	}







	public BigDecimal getR0130_expbccf_rsme_nonresi() {
		return r0130_expbccf_rsme_nonresi;
	}







	public void setR0130_expbccf_rsme_nonresi(BigDecimal r0130_expbccf_rsme_nonresi) {
		this.r0130_expbccf_rsme_nonresi = r0130_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0130_expaccf_rsme_nonresi() {
		return r0130_expaccf_rsme_nonresi;
	}







	public void setR0130_expaccf_rsme_nonresi(BigDecimal r0130_expaccf_rsme_nonresi) {
		this.r0130_expaccf_rsme_nonresi = r0130_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0130_expbccf_sme_resi() {
		return r0130_expbccf_sme_resi;
	}







	public void setR0130_expbccf_sme_resi(BigDecimal r0130_expbccf_sme_resi) {
		this.r0130_expbccf_sme_resi = r0130_expbccf_sme_resi;
	}







	public BigDecimal getR0130_expaccf_sme_resi() {
		return r0130_expaccf_sme_resi;
	}







	public void setR0130_expaccf_sme_resi(BigDecimal r0130_expaccf_sme_resi) {
		this.r0130_expaccf_sme_resi = r0130_expaccf_sme_resi;
	}







	public BigDecimal getR0130_expbccf_sme_nonresi() {
		return r0130_expbccf_sme_nonresi;
	}







	public void setR0130_expbccf_sme_nonresi(BigDecimal r0130_expbccf_sme_nonresi) {
		this.r0130_expbccf_sme_nonresi = r0130_expbccf_sme_nonresi;
	}







	public BigDecimal getR0130_expaccf_sme_nonresi() {
		return r0130_expaccf_sme_nonresi;
	}







	public void setR0130_expaccf_sme_nonresi(BigDecimal r0130_expaccf_sme_nonresi) {
		this.r0130_expaccf_sme_nonresi = r0130_expaccf_sme_nonresi;
	}







	public BigDecimal getR0130_expbccf_hni_resi() {
		return r0130_expbccf_hni_resi;
	}







	public void setR0130_expbccf_hni_resi(BigDecimal r0130_expbccf_hni_resi) {
		this.r0130_expbccf_hni_resi = r0130_expbccf_hni_resi;
	}







	public BigDecimal getR0130_expaccf_hni_resi() {
		return r0130_expaccf_hni_resi;
	}







	public void setR0130_expaccf_hni_resi(BigDecimal r0130_expaccf_hni_resi) {
		this.r0130_expaccf_hni_resi = r0130_expaccf_hni_resi;
	}







	public BigDecimal getR0130_expbccf_hni_nonresi() {
		return r0130_expbccf_hni_nonresi;
	}







	public void setR0130_expbccf_hni_nonresi(BigDecimal r0130_expbccf_hni_nonresi) {
		this.r0130_expbccf_hni_nonresi = r0130_expbccf_hni_nonresi;
	}







	public BigDecimal getR0130_expaccf_hni_nonresi() {
		return r0130_expaccf_hni_nonresi;
	}







	public void setR0130_expaccf_hni_nonresi(BigDecimal r0130_expaccf_hni_nonresi) {
		this.r0130_expaccf_hni_nonresi = r0130_expaccf_hni_nonresi;
	}







	public BigDecimal getR0130_expbccf_gres_resi() {
		return r0130_expbccf_gres_resi;
	}







	public void setR0130_expbccf_gres_resi(BigDecimal r0130_expbccf_gres_resi) {
		this.r0130_expbccf_gres_resi = r0130_expbccf_gres_resi;
	}







	public BigDecimal getR0130_expaccf_gres_resi() {
		return r0130_expaccf_gres_resi;
	}







	public void setR0130_expaccf_gres_resi(BigDecimal r0130_expaccf_gres_resi) {
		this.r0130_expaccf_gres_resi = r0130_expaccf_gres_resi;
	}







	public BigDecimal getR0130_expbccf_gres_nonresi() {
		return r0130_expbccf_gres_nonresi;
	}







	public void setR0130_expbccf_gres_nonresi(BigDecimal r0130_expbccf_gres_nonresi) {
		this.r0130_expbccf_gres_nonresi = r0130_expbccf_gres_nonresi;
	}







	public BigDecimal getR0130_expaccf_gres_nonresi() {
		return r0130_expaccf_gres_nonresi;
	}







	public void setR0130_expaccf_gres_nonresi(BigDecimal r0130_expaccf_gres_nonresi) {
		this.r0130_expaccf_gres_nonresi = r0130_expaccf_gres_nonresi;
	}







	public BigDecimal getR0130_expbccf_corp_resi() {
		return r0130_expbccf_corp_resi;
	}







	public void setR0130_expbccf_corp_resi(BigDecimal r0130_expbccf_corp_resi) {
		this.r0130_expbccf_corp_resi = r0130_expbccf_corp_resi;
	}







	public BigDecimal getR0130_expaccf_corp_resi() {
		return r0130_expaccf_corp_resi;
	}







	public void setR0130_expaccf_corp_resi(BigDecimal r0130_expaccf_corp_resi) {
		this.r0130_expaccf_corp_resi = r0130_expaccf_corp_resi;
	}







	public BigDecimal getR0130_expbccf_corp_nonresi() {
		return r0130_expbccf_corp_nonresi;
	}







	public void setR0130_expbccf_corp_nonresi(BigDecimal r0130_expbccf_corp_nonresi) {
		this.r0130_expbccf_corp_nonresi = r0130_expbccf_corp_nonresi;
	}







	public BigDecimal getR0130_expaccf_corp_nonresi() {
		return r0130_expaccf_corp_nonresi;
	}







	public void setR0130_expaccf_corp_nonresi(BigDecimal r0130_expaccf_corp_nonresi) {
		this.r0130_expaccf_corp_nonresi = r0130_expaccf_corp_nonresi;
	}







	public BigDecimal getR0130_expbccf_nbfi_resi() {
		return r0130_expbccf_nbfi_resi;
	}







	public void setR0130_expbccf_nbfi_resi(BigDecimal r0130_expbccf_nbfi_resi) {
		this.r0130_expbccf_nbfi_resi = r0130_expbccf_nbfi_resi;
	}







	public BigDecimal getR0130_expaccf_nbfi_resi() {
		return r0130_expaccf_nbfi_resi;
	}







	public void setR0130_expaccf_nbfi_resi(BigDecimal r0130_expaccf_nbfi_resi) {
		this.r0130_expaccf_nbfi_resi = r0130_expaccf_nbfi_resi;
	}







	public BigDecimal getR0130_expbccf_nbfi_nonresi() {
		return r0130_expbccf_nbfi_nonresi;
	}







	public void setR0130_expbccf_nbfi_nonresi(BigDecimal r0130_expbccf_nbfi_nonresi) {
		this.r0130_expbccf_nbfi_nonresi = r0130_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0130_expaccf_nbfi_nonresi() {
		return r0130_expaccf_nbfi_nonresi;
	}







	public void setR0130_expaccf_nbfi_nonresi(BigDecimal r0130_expaccf_nbfi_nonresi) {
		this.r0130_expaccf_nbfi_nonresi = r0130_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0130_expbccf_bank_resi() {
		return r0130_expbccf_bank_resi;
	}







	public void setR0130_expbccf_bank_resi(BigDecimal r0130_expbccf_bank_resi) {
		this.r0130_expbccf_bank_resi = r0130_expbccf_bank_resi;
	}







	public BigDecimal getR0130_expaccf_bank_resi() {
		return r0130_expaccf_bank_resi;
	}







	public void setR0130_expaccf_bank_resi(BigDecimal r0130_expaccf_bank_resi) {
		this.r0130_expaccf_bank_resi = r0130_expaccf_bank_resi;
	}







	public BigDecimal getR0130_expbccf_bank_nonresi() {
		return r0130_expbccf_bank_nonresi;
	}







	public void setR0130_expbccf_bank_nonresi(BigDecimal r0130_expbccf_bank_nonresi) {
		this.r0130_expbccf_bank_nonresi = r0130_expbccf_bank_nonresi;
	}







	public BigDecimal getR0130_expaccf_bank_nonresi() {
		return r0130_expaccf_bank_nonresi;
	}







	public void setR0130_expaccf_bank_nonresi(BigDecimal r0130_expaccf_bank_nonresi) {
		this.r0130_expaccf_bank_nonresi = r0130_expaccf_bank_nonresi;
	}







	public BigDecimal getR0130_expbccf_gov_resi() {
		return r0130_expbccf_gov_resi;
	}







	public void setR0130_expbccf_gov_resi(BigDecimal r0130_expbccf_gov_resi) {
		this.r0130_expbccf_gov_resi = r0130_expbccf_gov_resi;
	}







	public BigDecimal getR0130_expaccf_gov_resi() {
		return r0130_expaccf_gov_resi;
	}







	public void setR0130_expaccf_gov_resi(BigDecimal r0130_expaccf_gov_resi) {
		this.r0130_expaccf_gov_resi = r0130_expaccf_gov_resi;
	}







	public BigDecimal getR0130_expbccf_gov_nonresi() {
		return r0130_expbccf_gov_nonresi;
	}







	public void setR0130_expbccf_gov_nonresi(BigDecimal r0130_expbccf_gov_nonresi) {
		this.r0130_expbccf_gov_nonresi = r0130_expbccf_gov_nonresi;
	}







	public BigDecimal getR0130_expaccf_gov_nonresi() {
		return r0130_expaccf_gov_nonresi;
	}







	public void setR0130_expaccf_gov_nonresi(BigDecimal r0130_expaccf_gov_nonresi) {
		this.r0130_expaccf_gov_nonresi = r0130_expaccf_gov_nonresi;
	}







	public String getR0140_product() {
		return r0140_product;
	}







	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}







	public BigDecimal getR0140_expbccf_indiv_resi() {
		return r0140_expbccf_indiv_resi;
	}







	public void setR0140_expbccf_indiv_resi(BigDecimal r0140_expbccf_indiv_resi) {
		this.r0140_expbccf_indiv_resi = r0140_expbccf_indiv_resi;
	}







	public BigDecimal getR0140_expaccf_indiv_resi() {
		return r0140_expaccf_indiv_resi;
	}







	public void setR0140_expaccf_indiv_resi(BigDecimal r0140_expaccf_indiv_resi) {
		this.r0140_expaccf_indiv_resi = r0140_expaccf_indiv_resi;
	}







	public BigDecimal getR0140_expbccf_indiv_nonresi() {
		return r0140_expbccf_indiv_nonresi;
	}







	public void setR0140_expbccf_indiv_nonresi(BigDecimal r0140_expbccf_indiv_nonresi) {
		this.r0140_expbccf_indiv_nonresi = r0140_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0140_expaccf_indiv_nonresi() {
		return r0140_expaccf_indiv_nonresi;
	}







	public void setR0140_expaccf_indiv_nonresi(BigDecimal r0140_expaccf_indiv_nonresi) {
		this.r0140_expaccf_indiv_nonresi = r0140_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0140_expbccf_rsme_resi() {
		return r0140_expbccf_rsme_resi;
	}







	public void setR0140_expbccf_rsme_resi(BigDecimal r0140_expbccf_rsme_resi) {
		this.r0140_expbccf_rsme_resi = r0140_expbccf_rsme_resi;
	}







	public BigDecimal getR0140_expaccf_rsme_resi() {
		return r0140_expaccf_rsme_resi;
	}







	public void setR0140_expaccf_rsme_resi(BigDecimal r0140_expaccf_rsme_resi) {
		this.r0140_expaccf_rsme_resi = r0140_expaccf_rsme_resi;
	}







	public BigDecimal getR0140_expbccf_rsme_nonresi() {
		return r0140_expbccf_rsme_nonresi;
	}







	public void setR0140_expbccf_rsme_nonresi(BigDecimal r0140_expbccf_rsme_nonresi) {
		this.r0140_expbccf_rsme_nonresi = r0140_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0140_expaccf_rsme_nonresi() {
		return r0140_expaccf_rsme_nonresi;
	}







	public void setR0140_expaccf_rsme_nonresi(BigDecimal r0140_expaccf_rsme_nonresi) {
		this.r0140_expaccf_rsme_nonresi = r0140_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0140_expbccf_sme_resi() {
		return r0140_expbccf_sme_resi;
	}







	public void setR0140_expbccf_sme_resi(BigDecimal r0140_expbccf_sme_resi) {
		this.r0140_expbccf_sme_resi = r0140_expbccf_sme_resi;
	}







	public BigDecimal getR0140_expaccf_sme_resi() {
		return r0140_expaccf_sme_resi;
	}







	public void setR0140_expaccf_sme_resi(BigDecimal r0140_expaccf_sme_resi) {
		this.r0140_expaccf_sme_resi = r0140_expaccf_sme_resi;
	}







	public BigDecimal getR0140_expbccf_sme_nonresi() {
		return r0140_expbccf_sme_nonresi;
	}







	public void setR0140_expbccf_sme_nonresi(BigDecimal r0140_expbccf_sme_nonresi) {
		this.r0140_expbccf_sme_nonresi = r0140_expbccf_sme_nonresi;
	}







	public BigDecimal getR0140_expaccf_sme_nonresi() {
		return r0140_expaccf_sme_nonresi;
	}







	public void setR0140_expaccf_sme_nonresi(BigDecimal r0140_expaccf_sme_nonresi) {
		this.r0140_expaccf_sme_nonresi = r0140_expaccf_sme_nonresi;
	}







	public BigDecimal getR0140_expbccf_hni_resi() {
		return r0140_expbccf_hni_resi;
	}







	public void setR0140_expbccf_hni_resi(BigDecimal r0140_expbccf_hni_resi) {
		this.r0140_expbccf_hni_resi = r0140_expbccf_hni_resi;
	}







	public BigDecimal getR0140_expaccf_hni_resi() {
		return r0140_expaccf_hni_resi;
	}







	public void setR0140_expaccf_hni_resi(BigDecimal r0140_expaccf_hni_resi) {
		this.r0140_expaccf_hni_resi = r0140_expaccf_hni_resi;
	}







	public BigDecimal getR0140_expbccf_hni_nonresi() {
		return r0140_expbccf_hni_nonresi;
	}







	public void setR0140_expbccf_hni_nonresi(BigDecimal r0140_expbccf_hni_nonresi) {
		this.r0140_expbccf_hni_nonresi = r0140_expbccf_hni_nonresi;
	}







	public BigDecimal getR0140_expaccf_hni_nonresi() {
		return r0140_expaccf_hni_nonresi;
	}







	public void setR0140_expaccf_hni_nonresi(BigDecimal r0140_expaccf_hni_nonresi) {
		this.r0140_expaccf_hni_nonresi = r0140_expaccf_hni_nonresi;
	}







	public BigDecimal getR0140_expbccf_gres_resi() {
		return r0140_expbccf_gres_resi;
	}







	public void setR0140_expbccf_gres_resi(BigDecimal r0140_expbccf_gres_resi) {
		this.r0140_expbccf_gres_resi = r0140_expbccf_gres_resi;
	}







	public BigDecimal getR0140_expaccf_gres_resi() {
		return r0140_expaccf_gres_resi;
	}







	public void setR0140_expaccf_gres_resi(BigDecimal r0140_expaccf_gres_resi) {
		this.r0140_expaccf_gres_resi = r0140_expaccf_gres_resi;
	}







	public BigDecimal getR0140_expbccf_gres_nonresi() {
		return r0140_expbccf_gres_nonresi;
	}







	public void setR0140_expbccf_gres_nonresi(BigDecimal r0140_expbccf_gres_nonresi) {
		this.r0140_expbccf_gres_nonresi = r0140_expbccf_gres_nonresi;
	}







	public BigDecimal getR0140_expaccf_gres_nonresi() {
		return r0140_expaccf_gres_nonresi;
	}







	public void setR0140_expaccf_gres_nonresi(BigDecimal r0140_expaccf_gres_nonresi) {
		this.r0140_expaccf_gres_nonresi = r0140_expaccf_gres_nonresi;
	}







	public BigDecimal getR0140_expbccf_corp_resi() {
		return r0140_expbccf_corp_resi;
	}







	public void setR0140_expbccf_corp_resi(BigDecimal r0140_expbccf_corp_resi) {
		this.r0140_expbccf_corp_resi = r0140_expbccf_corp_resi;
	}







	public BigDecimal getR0140_expaccf_corp_resi() {
		return r0140_expaccf_corp_resi;
	}







	public void setR0140_expaccf_corp_resi(BigDecimal r0140_expaccf_corp_resi) {
		this.r0140_expaccf_corp_resi = r0140_expaccf_corp_resi;
	}







	public BigDecimal getR0140_expbccf_corp_nonresi() {
		return r0140_expbccf_corp_nonresi;
	}







	public void setR0140_expbccf_corp_nonresi(BigDecimal r0140_expbccf_corp_nonresi) {
		this.r0140_expbccf_corp_nonresi = r0140_expbccf_corp_nonresi;
	}







	public BigDecimal getR0140_expaccf_corp_nonresi() {
		return r0140_expaccf_corp_nonresi;
	}







	public void setR0140_expaccf_corp_nonresi(BigDecimal r0140_expaccf_corp_nonresi) {
		this.r0140_expaccf_corp_nonresi = r0140_expaccf_corp_nonresi;
	}







	public BigDecimal getR0140_expbccf_nbfi_resi() {
		return r0140_expbccf_nbfi_resi;
	}







	public void setR0140_expbccf_nbfi_resi(BigDecimal r0140_expbccf_nbfi_resi) {
		this.r0140_expbccf_nbfi_resi = r0140_expbccf_nbfi_resi;
	}







	public BigDecimal getR0140_expaccf_nbfi_resi() {
		return r0140_expaccf_nbfi_resi;
	}







	public void setR0140_expaccf_nbfi_resi(BigDecimal r0140_expaccf_nbfi_resi) {
		this.r0140_expaccf_nbfi_resi = r0140_expaccf_nbfi_resi;
	}







	public BigDecimal getR0140_expbccf_nbfi_nonresi() {
		return r0140_expbccf_nbfi_nonresi;
	}







	public void setR0140_expbccf_nbfi_nonresi(BigDecimal r0140_expbccf_nbfi_nonresi) {
		this.r0140_expbccf_nbfi_nonresi = r0140_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0140_expaccf_nbfi_nonresi() {
		return r0140_expaccf_nbfi_nonresi;
	}







	public void setR0140_expaccf_nbfi_nonresi(BigDecimal r0140_expaccf_nbfi_nonresi) {
		this.r0140_expaccf_nbfi_nonresi = r0140_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0140_expbccf_bank_resi() {
		return r0140_expbccf_bank_resi;
	}







	public void setR0140_expbccf_bank_resi(BigDecimal r0140_expbccf_bank_resi) {
		this.r0140_expbccf_bank_resi = r0140_expbccf_bank_resi;
	}







	public BigDecimal getR0140_expaccf_bank_resi() {
		return r0140_expaccf_bank_resi;
	}







	public void setR0140_expaccf_bank_resi(BigDecimal r0140_expaccf_bank_resi) {
		this.r0140_expaccf_bank_resi = r0140_expaccf_bank_resi;
	}







	public BigDecimal getR0140_expbccf_bank_nonresi() {
		return r0140_expbccf_bank_nonresi;
	}







	public void setR0140_expbccf_bank_nonresi(BigDecimal r0140_expbccf_bank_nonresi) {
		this.r0140_expbccf_bank_nonresi = r0140_expbccf_bank_nonresi;
	}







	public BigDecimal getR0140_expaccf_bank_nonresi() {
		return r0140_expaccf_bank_nonresi;
	}







	public void setR0140_expaccf_bank_nonresi(BigDecimal r0140_expaccf_bank_nonresi) {
		this.r0140_expaccf_bank_nonresi = r0140_expaccf_bank_nonresi;
	}







	public BigDecimal getR0140_expbccf_gov_resi() {
		return r0140_expbccf_gov_resi;
	}







	public void setR0140_expbccf_gov_resi(BigDecimal r0140_expbccf_gov_resi) {
		this.r0140_expbccf_gov_resi = r0140_expbccf_gov_resi;
	}







	public BigDecimal getR0140_expaccf_gov_resi() {
		return r0140_expaccf_gov_resi;
	}







	public void setR0140_expaccf_gov_resi(BigDecimal r0140_expaccf_gov_resi) {
		this.r0140_expaccf_gov_resi = r0140_expaccf_gov_resi;
	}







	public BigDecimal getR0140_expbccf_gov_nonresi() {
		return r0140_expbccf_gov_nonresi;
	}







	public void setR0140_expbccf_gov_nonresi(BigDecimal r0140_expbccf_gov_nonresi) {
		this.r0140_expbccf_gov_nonresi = r0140_expbccf_gov_nonresi;
	}







	public BigDecimal getR0140_expaccf_gov_nonresi() {
		return r0140_expaccf_gov_nonresi;
	}







	public void setR0140_expaccf_gov_nonresi(BigDecimal r0140_expaccf_gov_nonresi) {
		this.r0140_expaccf_gov_nonresi = r0140_expaccf_gov_nonresi;
	}







	public String getR0150_product() {
		return r0150_product;
	}







	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}







	public BigDecimal getR0150_expbccf_indiv_resi() {
		return r0150_expbccf_indiv_resi;
	}







	public void setR0150_expbccf_indiv_resi(BigDecimal r0150_expbccf_indiv_resi) {
		this.r0150_expbccf_indiv_resi = r0150_expbccf_indiv_resi;
	}







	public BigDecimal getR0150_expaccf_indiv_resi() {
		return r0150_expaccf_indiv_resi;
	}







	public void setR0150_expaccf_indiv_resi(BigDecimal r0150_expaccf_indiv_resi) {
		this.r0150_expaccf_indiv_resi = r0150_expaccf_indiv_resi;
	}







	public BigDecimal getR0150_expbccf_indiv_nonresi() {
		return r0150_expbccf_indiv_nonresi;
	}







	public void setR0150_expbccf_indiv_nonresi(BigDecimal r0150_expbccf_indiv_nonresi) {
		this.r0150_expbccf_indiv_nonresi = r0150_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0150_expaccf_indiv_nonresi() {
		return r0150_expaccf_indiv_nonresi;
	}







	public void setR0150_expaccf_indiv_nonresi(BigDecimal r0150_expaccf_indiv_nonresi) {
		this.r0150_expaccf_indiv_nonresi = r0150_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0150_expbccf_rsme_resi() {
		return r0150_expbccf_rsme_resi;
	}







	public void setR0150_expbccf_rsme_resi(BigDecimal r0150_expbccf_rsme_resi) {
		this.r0150_expbccf_rsme_resi = r0150_expbccf_rsme_resi;
	}







	public BigDecimal getR0150_expaccf_rsme_resi() {
		return r0150_expaccf_rsme_resi;
	}







	public void setR0150_expaccf_rsme_resi(BigDecimal r0150_expaccf_rsme_resi) {
		this.r0150_expaccf_rsme_resi = r0150_expaccf_rsme_resi;
	}







	public BigDecimal getR0150_expbccf_rsme_nonresi() {
		return r0150_expbccf_rsme_nonresi;
	}







	public void setR0150_expbccf_rsme_nonresi(BigDecimal r0150_expbccf_rsme_nonresi) {
		this.r0150_expbccf_rsme_nonresi = r0150_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0150_expaccf_rsme_nonresi() {
		return r0150_expaccf_rsme_nonresi;
	}







	public void setR0150_expaccf_rsme_nonresi(BigDecimal r0150_expaccf_rsme_nonresi) {
		this.r0150_expaccf_rsme_nonresi = r0150_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0150_expbccf_sme_resi() {
		return r0150_expbccf_sme_resi;
	}







	public void setR0150_expbccf_sme_resi(BigDecimal r0150_expbccf_sme_resi) {
		this.r0150_expbccf_sme_resi = r0150_expbccf_sme_resi;
	}







	public BigDecimal getR0150_expaccf_sme_resi() {
		return r0150_expaccf_sme_resi;
	}







	public void setR0150_expaccf_sme_resi(BigDecimal r0150_expaccf_sme_resi) {
		this.r0150_expaccf_sme_resi = r0150_expaccf_sme_resi;
	}







	public BigDecimal getR0150_expbccf_sme_nonresi() {
		return r0150_expbccf_sme_nonresi;
	}







	public void setR0150_expbccf_sme_nonresi(BigDecimal r0150_expbccf_sme_nonresi) {
		this.r0150_expbccf_sme_nonresi = r0150_expbccf_sme_nonresi;
	}







	public BigDecimal getR0150_expaccf_sme_nonresi() {
		return r0150_expaccf_sme_nonresi;
	}







	public void setR0150_expaccf_sme_nonresi(BigDecimal r0150_expaccf_sme_nonresi) {
		this.r0150_expaccf_sme_nonresi = r0150_expaccf_sme_nonresi;
	}







	public BigDecimal getR0150_expbccf_hni_resi() {
		return r0150_expbccf_hni_resi;
	}







	public void setR0150_expbccf_hni_resi(BigDecimal r0150_expbccf_hni_resi) {
		this.r0150_expbccf_hni_resi = r0150_expbccf_hni_resi;
	}







	public BigDecimal getR0150_expaccf_hni_resi() {
		return r0150_expaccf_hni_resi;
	}







	public void setR0150_expaccf_hni_resi(BigDecimal r0150_expaccf_hni_resi) {
		this.r0150_expaccf_hni_resi = r0150_expaccf_hni_resi;
	}







	public BigDecimal getR0150_expbccf_hni_nonresi() {
		return r0150_expbccf_hni_nonresi;
	}







	public void setR0150_expbccf_hni_nonresi(BigDecimal r0150_expbccf_hni_nonresi) {
		this.r0150_expbccf_hni_nonresi = r0150_expbccf_hni_nonresi;
	}







	public BigDecimal getR0150_expaccf_hni_nonresi() {
		return r0150_expaccf_hni_nonresi;
	}







	public void setR0150_expaccf_hni_nonresi(BigDecimal r0150_expaccf_hni_nonresi) {
		this.r0150_expaccf_hni_nonresi = r0150_expaccf_hni_nonresi;
	}







	public BigDecimal getR0150_expbccf_gres_resi() {
		return r0150_expbccf_gres_resi;
	}







	public void setR0150_expbccf_gres_resi(BigDecimal r0150_expbccf_gres_resi) {
		this.r0150_expbccf_gres_resi = r0150_expbccf_gres_resi;
	}







	public BigDecimal getR0150_expaccf_gres_resi() {
		return r0150_expaccf_gres_resi;
	}







	public void setR0150_expaccf_gres_resi(BigDecimal r0150_expaccf_gres_resi) {
		this.r0150_expaccf_gres_resi = r0150_expaccf_gres_resi;
	}







	public BigDecimal getR0150_expbccf_gres_nonresi() {
		return r0150_expbccf_gres_nonresi;
	}







	public void setR0150_expbccf_gres_nonresi(BigDecimal r0150_expbccf_gres_nonresi) {
		this.r0150_expbccf_gres_nonresi = r0150_expbccf_gres_nonresi;
	}







	public BigDecimal getR0150_expaccf_gres_nonresi() {
		return r0150_expaccf_gres_nonresi;
	}







	public void setR0150_expaccf_gres_nonresi(BigDecimal r0150_expaccf_gres_nonresi) {
		this.r0150_expaccf_gres_nonresi = r0150_expaccf_gres_nonresi;
	}







	public BigDecimal getR0150_expbccf_corp_resi() {
		return r0150_expbccf_corp_resi;
	}







	public void setR0150_expbccf_corp_resi(BigDecimal r0150_expbccf_corp_resi) {
		this.r0150_expbccf_corp_resi = r0150_expbccf_corp_resi;
	}







	public BigDecimal getR0150_expaccf_corp_resi() {
		return r0150_expaccf_corp_resi;
	}







	public void setR0150_expaccf_corp_resi(BigDecimal r0150_expaccf_corp_resi) {
		this.r0150_expaccf_corp_resi = r0150_expaccf_corp_resi;
	}







	public BigDecimal getR0150_expbccf_corp_nonresi() {
		return r0150_expbccf_corp_nonresi;
	}







	public void setR0150_expbccf_corp_nonresi(BigDecimal r0150_expbccf_corp_nonresi) {
		this.r0150_expbccf_corp_nonresi = r0150_expbccf_corp_nonresi;
	}







	public BigDecimal getR0150_expaccf_corp_nonresi() {
		return r0150_expaccf_corp_nonresi;
	}







	public void setR0150_expaccf_corp_nonresi(BigDecimal r0150_expaccf_corp_nonresi) {
		this.r0150_expaccf_corp_nonresi = r0150_expaccf_corp_nonresi;
	}







	public BigDecimal getR0150_expbccf_nbfi_resi() {
		return r0150_expbccf_nbfi_resi;
	}







	public void setR0150_expbccf_nbfi_resi(BigDecimal r0150_expbccf_nbfi_resi) {
		this.r0150_expbccf_nbfi_resi = r0150_expbccf_nbfi_resi;
	}







	public BigDecimal getR0150_expaccf_nbfi_resi() {
		return r0150_expaccf_nbfi_resi;
	}







	public void setR0150_expaccf_nbfi_resi(BigDecimal r0150_expaccf_nbfi_resi) {
		this.r0150_expaccf_nbfi_resi = r0150_expaccf_nbfi_resi;
	}







	public BigDecimal getR0150_expbccf_nbfi_nonresi() {
		return r0150_expbccf_nbfi_nonresi;
	}







	public void setR0150_expbccf_nbfi_nonresi(BigDecimal r0150_expbccf_nbfi_nonresi) {
		this.r0150_expbccf_nbfi_nonresi = r0150_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0150_expaccf_nbfi_nonresi() {
		return r0150_expaccf_nbfi_nonresi;
	}







	public void setR0150_expaccf_nbfi_nonresi(BigDecimal r0150_expaccf_nbfi_nonresi) {
		this.r0150_expaccf_nbfi_nonresi = r0150_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0150_expbccf_bank_resi() {
		return r0150_expbccf_bank_resi;
	}







	public void setR0150_expbccf_bank_resi(BigDecimal r0150_expbccf_bank_resi) {
		this.r0150_expbccf_bank_resi = r0150_expbccf_bank_resi;
	}







	public BigDecimal getR0150_expaccf_bank_resi() {
		return r0150_expaccf_bank_resi;
	}







	public void setR0150_expaccf_bank_resi(BigDecimal r0150_expaccf_bank_resi) {
		this.r0150_expaccf_bank_resi = r0150_expaccf_bank_resi;
	}







	public BigDecimal getR0150_expbccf_bank_nonresi() {
		return r0150_expbccf_bank_nonresi;
	}







	public void setR0150_expbccf_bank_nonresi(BigDecimal r0150_expbccf_bank_nonresi) {
		this.r0150_expbccf_bank_nonresi = r0150_expbccf_bank_nonresi;
	}







	public BigDecimal getR0150_expaccf_bank_nonresi() {
		return r0150_expaccf_bank_nonresi;
	}







	public void setR0150_expaccf_bank_nonresi(BigDecimal r0150_expaccf_bank_nonresi) {
		this.r0150_expaccf_bank_nonresi = r0150_expaccf_bank_nonresi;
	}







	public BigDecimal getR0150_expbccf_gov_resi() {
		return r0150_expbccf_gov_resi;
	}







	public void setR0150_expbccf_gov_resi(BigDecimal r0150_expbccf_gov_resi) {
		this.r0150_expbccf_gov_resi = r0150_expbccf_gov_resi;
	}







	public BigDecimal getR0150_expaccf_gov_resi() {
		return r0150_expaccf_gov_resi;
	}







	public void setR0150_expaccf_gov_resi(BigDecimal r0150_expaccf_gov_resi) {
		this.r0150_expaccf_gov_resi = r0150_expaccf_gov_resi;
	}







	public BigDecimal getR0150_expbccf_gov_nonresi() {
		return r0150_expbccf_gov_nonresi;
	}







	public void setR0150_expbccf_gov_nonresi(BigDecimal r0150_expbccf_gov_nonresi) {
		this.r0150_expbccf_gov_nonresi = r0150_expbccf_gov_nonresi;
	}







	public BigDecimal getR0150_expaccf_gov_nonresi() {
		return r0150_expaccf_gov_nonresi;
	}







	public void setR0150_expaccf_gov_nonresi(BigDecimal r0150_expaccf_gov_nonresi) {
		this.r0150_expaccf_gov_nonresi = r0150_expaccf_gov_nonresi;
	}







	public String getR0160_product() {
		return r0160_product;
	}







	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}







	public BigDecimal getR0160_expbccf_indiv_resi() {
		return r0160_expbccf_indiv_resi;
	}







	public void setR0160_expbccf_indiv_resi(BigDecimal r0160_expbccf_indiv_resi) {
		this.r0160_expbccf_indiv_resi = r0160_expbccf_indiv_resi;
	}







	public BigDecimal getR0160_expaccf_indiv_resi() {
		return r0160_expaccf_indiv_resi;
	}







	public void setR0160_expaccf_indiv_resi(BigDecimal r0160_expaccf_indiv_resi) {
		this.r0160_expaccf_indiv_resi = r0160_expaccf_indiv_resi;
	}







	public BigDecimal getR0160_expbccf_indiv_nonresi() {
		return r0160_expbccf_indiv_nonresi;
	}







	public void setR0160_expbccf_indiv_nonresi(BigDecimal r0160_expbccf_indiv_nonresi) {
		this.r0160_expbccf_indiv_nonresi = r0160_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0160_expaccf_indiv_nonresi() {
		return r0160_expaccf_indiv_nonresi;
	}







	public void setR0160_expaccf_indiv_nonresi(BigDecimal r0160_expaccf_indiv_nonresi) {
		this.r0160_expaccf_indiv_nonresi = r0160_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0160_expbccf_rsme_resi() {
		return r0160_expbccf_rsme_resi;
	}







	public void setR0160_expbccf_rsme_resi(BigDecimal r0160_expbccf_rsme_resi) {
		this.r0160_expbccf_rsme_resi = r0160_expbccf_rsme_resi;
	}







	public BigDecimal getR0160_expaccf_rsme_resi() {
		return r0160_expaccf_rsme_resi;
	}







	public void setR0160_expaccf_rsme_resi(BigDecimal r0160_expaccf_rsme_resi) {
		this.r0160_expaccf_rsme_resi = r0160_expaccf_rsme_resi;
	}







	public BigDecimal getR0160_expbccf_rsme_nonresi() {
		return r0160_expbccf_rsme_nonresi;
	}







	public void setR0160_expbccf_rsme_nonresi(BigDecimal r0160_expbccf_rsme_nonresi) {
		this.r0160_expbccf_rsme_nonresi = r0160_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0160_expaccf_rsme_nonresi() {
		return r0160_expaccf_rsme_nonresi;
	}







	public void setR0160_expaccf_rsme_nonresi(BigDecimal r0160_expaccf_rsme_nonresi) {
		this.r0160_expaccf_rsme_nonresi = r0160_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0160_expbccf_sme_resi() {
		return r0160_expbccf_sme_resi;
	}







	public void setR0160_expbccf_sme_resi(BigDecimal r0160_expbccf_sme_resi) {
		this.r0160_expbccf_sme_resi = r0160_expbccf_sme_resi;
	}







	public BigDecimal getR0160_expaccf_sme_resi() {
		return r0160_expaccf_sme_resi;
	}







	public void setR0160_expaccf_sme_resi(BigDecimal r0160_expaccf_sme_resi) {
		this.r0160_expaccf_sme_resi = r0160_expaccf_sme_resi;
	}







	public BigDecimal getR0160_expbccf_sme_nonresi() {
		return r0160_expbccf_sme_nonresi;
	}







	public void setR0160_expbccf_sme_nonresi(BigDecimal r0160_expbccf_sme_nonresi) {
		this.r0160_expbccf_sme_nonresi = r0160_expbccf_sme_nonresi;
	}







	public BigDecimal getR0160_expaccf_sme_nonresi() {
		return r0160_expaccf_sme_nonresi;
	}







	public void setR0160_expaccf_sme_nonresi(BigDecimal r0160_expaccf_sme_nonresi) {
		this.r0160_expaccf_sme_nonresi = r0160_expaccf_sme_nonresi;
	}







	public BigDecimal getR0160_expbccf_hni_resi() {
		return r0160_expbccf_hni_resi;
	}







	public void setR0160_expbccf_hni_resi(BigDecimal r0160_expbccf_hni_resi) {
		this.r0160_expbccf_hni_resi = r0160_expbccf_hni_resi;
	}







	public BigDecimal getR0160_expaccf_hni_resi() {
		return r0160_expaccf_hni_resi;
	}







	public void setR0160_expaccf_hni_resi(BigDecimal r0160_expaccf_hni_resi) {
		this.r0160_expaccf_hni_resi = r0160_expaccf_hni_resi;
	}







	public BigDecimal getR0160_expbccf_hni_nonresi() {
		return r0160_expbccf_hni_nonresi;
	}







	public void setR0160_expbccf_hni_nonresi(BigDecimal r0160_expbccf_hni_nonresi) {
		this.r0160_expbccf_hni_nonresi = r0160_expbccf_hni_nonresi;
	}







	public BigDecimal getR0160_expaccf_hni_nonresi() {
		return r0160_expaccf_hni_nonresi;
	}







	public void setR0160_expaccf_hni_nonresi(BigDecimal r0160_expaccf_hni_nonresi) {
		this.r0160_expaccf_hni_nonresi = r0160_expaccf_hni_nonresi;
	}







	public BigDecimal getR0160_expbccf_gres_resi() {
		return r0160_expbccf_gres_resi;
	}







	public void setR0160_expbccf_gres_resi(BigDecimal r0160_expbccf_gres_resi) {
		this.r0160_expbccf_gres_resi = r0160_expbccf_gres_resi;
	}







	public BigDecimal getR0160_expaccf_gres_resi() {
		return r0160_expaccf_gres_resi;
	}







	public void setR0160_expaccf_gres_resi(BigDecimal r0160_expaccf_gres_resi) {
		this.r0160_expaccf_gres_resi = r0160_expaccf_gres_resi;
	}







	public BigDecimal getR0160_expbccf_gres_nonresi() {
		return r0160_expbccf_gres_nonresi;
	}







	public void setR0160_expbccf_gres_nonresi(BigDecimal r0160_expbccf_gres_nonresi) {
		this.r0160_expbccf_gres_nonresi = r0160_expbccf_gres_nonresi;
	}







	public BigDecimal getR0160_expaccf_gres_nonresi() {
		return r0160_expaccf_gres_nonresi;
	}







	public void setR0160_expaccf_gres_nonresi(BigDecimal r0160_expaccf_gres_nonresi) {
		this.r0160_expaccf_gres_nonresi = r0160_expaccf_gres_nonresi;
	}







	public BigDecimal getR0160_expbccf_corp_resi() {
		return r0160_expbccf_corp_resi;
	}







	public void setR0160_expbccf_corp_resi(BigDecimal r0160_expbccf_corp_resi) {
		this.r0160_expbccf_corp_resi = r0160_expbccf_corp_resi;
	}







	public BigDecimal getR0160_expaccf_corp_resi() {
		return r0160_expaccf_corp_resi;
	}







	public void setR0160_expaccf_corp_resi(BigDecimal r0160_expaccf_corp_resi) {
		this.r0160_expaccf_corp_resi = r0160_expaccf_corp_resi;
	}







	public BigDecimal getR0160_expbccf_corp_nonresi() {
		return r0160_expbccf_corp_nonresi;
	}







	public void setR0160_expbccf_corp_nonresi(BigDecimal r0160_expbccf_corp_nonresi) {
		this.r0160_expbccf_corp_nonresi = r0160_expbccf_corp_nonresi;
	}







	public BigDecimal getR0160_expaccf_corp_nonresi() {
		return r0160_expaccf_corp_nonresi;
	}







	public void setR0160_expaccf_corp_nonresi(BigDecimal r0160_expaccf_corp_nonresi) {
		this.r0160_expaccf_corp_nonresi = r0160_expaccf_corp_nonresi;
	}







	public BigDecimal getR0160_expbccf_nbfi_resi() {
		return r0160_expbccf_nbfi_resi;
	}







	public void setR0160_expbccf_nbfi_resi(BigDecimal r0160_expbccf_nbfi_resi) {
		this.r0160_expbccf_nbfi_resi = r0160_expbccf_nbfi_resi;
	}







	public BigDecimal getR0160_expaccf_nbfi_resi() {
		return r0160_expaccf_nbfi_resi;
	}







	public void setR0160_expaccf_nbfi_resi(BigDecimal r0160_expaccf_nbfi_resi) {
		this.r0160_expaccf_nbfi_resi = r0160_expaccf_nbfi_resi;
	}







	public BigDecimal getR0160_expbccf_nbfi_nonresi() {
		return r0160_expbccf_nbfi_nonresi;
	}







	public void setR0160_expbccf_nbfi_nonresi(BigDecimal r0160_expbccf_nbfi_nonresi) {
		this.r0160_expbccf_nbfi_nonresi = r0160_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0160_expaccf_nbfi_nonresi() {
		return r0160_expaccf_nbfi_nonresi;
	}







	public void setR0160_expaccf_nbfi_nonresi(BigDecimal r0160_expaccf_nbfi_nonresi) {
		this.r0160_expaccf_nbfi_nonresi = r0160_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0160_expbccf_bank_resi() {
		return r0160_expbccf_bank_resi;
	}







	public void setR0160_expbccf_bank_resi(BigDecimal r0160_expbccf_bank_resi) {
		this.r0160_expbccf_bank_resi = r0160_expbccf_bank_resi;
	}







	public BigDecimal getR0160_expaccf_bank_resi() {
		return r0160_expaccf_bank_resi;
	}







	public void setR0160_expaccf_bank_resi(BigDecimal r0160_expaccf_bank_resi) {
		this.r0160_expaccf_bank_resi = r0160_expaccf_bank_resi;
	}







	public BigDecimal getR0160_expbccf_bank_nonresi() {
		return r0160_expbccf_bank_nonresi;
	}







	public void setR0160_expbccf_bank_nonresi(BigDecimal r0160_expbccf_bank_nonresi) {
		this.r0160_expbccf_bank_nonresi = r0160_expbccf_bank_nonresi;
	}







	public BigDecimal getR0160_expaccf_bank_nonresi() {
		return r0160_expaccf_bank_nonresi;
	}







	public void setR0160_expaccf_bank_nonresi(BigDecimal r0160_expaccf_bank_nonresi) {
		this.r0160_expaccf_bank_nonresi = r0160_expaccf_bank_nonresi;
	}







	public BigDecimal getR0160_expbccf_gov_resi() {
		return r0160_expbccf_gov_resi;
	}







	public void setR0160_expbccf_gov_resi(BigDecimal r0160_expbccf_gov_resi) {
		this.r0160_expbccf_gov_resi = r0160_expbccf_gov_resi;
	}







	public BigDecimal getR0160_expaccf_gov_resi() {
		return r0160_expaccf_gov_resi;
	}







	public void setR0160_expaccf_gov_resi(BigDecimal r0160_expaccf_gov_resi) {
		this.r0160_expaccf_gov_resi = r0160_expaccf_gov_resi;
	}







	public BigDecimal getR0160_expbccf_gov_nonresi() {
		return r0160_expbccf_gov_nonresi;
	}







	public void setR0160_expbccf_gov_nonresi(BigDecimal r0160_expbccf_gov_nonresi) {
		this.r0160_expbccf_gov_nonresi = r0160_expbccf_gov_nonresi;
	}







	public BigDecimal getR0160_expaccf_gov_nonresi() {
		return r0160_expaccf_gov_nonresi;
	}







	public void setR0160_expaccf_gov_nonresi(BigDecimal r0160_expaccf_gov_nonresi) {
		this.r0160_expaccf_gov_nonresi = r0160_expaccf_gov_nonresi;
	}







	public String getR0170_product() {
		return r0170_product;
	}







	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}







	public BigDecimal getR0170_expbccf_indiv_resi() {
		return r0170_expbccf_indiv_resi;
	}







	public void setR0170_expbccf_indiv_resi(BigDecimal r0170_expbccf_indiv_resi) {
		this.r0170_expbccf_indiv_resi = r0170_expbccf_indiv_resi;
	}







	public BigDecimal getR0170_expaccf_indiv_resi() {
		return r0170_expaccf_indiv_resi;
	}







	public void setR0170_expaccf_indiv_resi(BigDecimal r0170_expaccf_indiv_resi) {
		this.r0170_expaccf_indiv_resi = r0170_expaccf_indiv_resi;
	}







	public BigDecimal getR0170_expbccf_indiv_nonresi() {
		return r0170_expbccf_indiv_nonresi;
	}







	public void setR0170_expbccf_indiv_nonresi(BigDecimal r0170_expbccf_indiv_nonresi) {
		this.r0170_expbccf_indiv_nonresi = r0170_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0170_expaccf_indiv_nonresi() {
		return r0170_expaccf_indiv_nonresi;
	}







	public void setR0170_expaccf_indiv_nonresi(BigDecimal r0170_expaccf_indiv_nonresi) {
		this.r0170_expaccf_indiv_nonresi = r0170_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0170_expbccf_rsme_resi() {
		return r0170_expbccf_rsme_resi;
	}







	public void setR0170_expbccf_rsme_resi(BigDecimal r0170_expbccf_rsme_resi) {
		this.r0170_expbccf_rsme_resi = r0170_expbccf_rsme_resi;
	}







	public BigDecimal getR0170_expaccf_rsme_resi() {
		return r0170_expaccf_rsme_resi;
	}







	public void setR0170_expaccf_rsme_resi(BigDecimal r0170_expaccf_rsme_resi) {
		this.r0170_expaccf_rsme_resi = r0170_expaccf_rsme_resi;
	}







	public BigDecimal getR0170_expbccf_rsme_nonresi() {
		return r0170_expbccf_rsme_nonresi;
	}







	public void setR0170_expbccf_rsme_nonresi(BigDecimal r0170_expbccf_rsme_nonresi) {
		this.r0170_expbccf_rsme_nonresi = r0170_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0170_expaccf_rsme_nonresi() {
		return r0170_expaccf_rsme_nonresi;
	}







	public void setR0170_expaccf_rsme_nonresi(BigDecimal r0170_expaccf_rsme_nonresi) {
		this.r0170_expaccf_rsme_nonresi = r0170_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0170_expbccf_sme_resi() {
		return r0170_expbccf_sme_resi;
	}







	public void setR0170_expbccf_sme_resi(BigDecimal r0170_expbccf_sme_resi) {
		this.r0170_expbccf_sme_resi = r0170_expbccf_sme_resi;
	}







	public BigDecimal getR0170_expaccf_sme_resi() {
		return r0170_expaccf_sme_resi;
	}







	public void setR0170_expaccf_sme_resi(BigDecimal r0170_expaccf_sme_resi) {
		this.r0170_expaccf_sme_resi = r0170_expaccf_sme_resi;
	}







	public BigDecimal getR0170_expbccf_sme_nonresi() {
		return r0170_expbccf_sme_nonresi;
	}







	public void setR0170_expbccf_sme_nonresi(BigDecimal r0170_expbccf_sme_nonresi) {
		this.r0170_expbccf_sme_nonresi = r0170_expbccf_sme_nonresi;
	}







	public BigDecimal getR0170_expaccf_sme_nonresi() {
		return r0170_expaccf_sme_nonresi;
	}







	public void setR0170_expaccf_sme_nonresi(BigDecimal r0170_expaccf_sme_nonresi) {
		this.r0170_expaccf_sme_nonresi = r0170_expaccf_sme_nonresi;
	}







	public BigDecimal getR0170_expbccf_hni_resi() {
		return r0170_expbccf_hni_resi;
	}







	public void setR0170_expbccf_hni_resi(BigDecimal r0170_expbccf_hni_resi) {
		this.r0170_expbccf_hni_resi = r0170_expbccf_hni_resi;
	}







	public BigDecimal getR0170_expaccf_hni_resi() {
		return r0170_expaccf_hni_resi;
	}







	public void setR0170_expaccf_hni_resi(BigDecimal r0170_expaccf_hni_resi) {
		this.r0170_expaccf_hni_resi = r0170_expaccf_hni_resi;
	}







	public BigDecimal getR0170_expbccf_hni_nonresi() {
		return r0170_expbccf_hni_nonresi;
	}







	public void setR0170_expbccf_hni_nonresi(BigDecimal r0170_expbccf_hni_nonresi) {
		this.r0170_expbccf_hni_nonresi = r0170_expbccf_hni_nonresi;
	}







	public BigDecimal getR0170_expaccf_hni_nonresi() {
		return r0170_expaccf_hni_nonresi;
	}







	public void setR0170_expaccf_hni_nonresi(BigDecimal r0170_expaccf_hni_nonresi) {
		this.r0170_expaccf_hni_nonresi = r0170_expaccf_hni_nonresi;
	}







	public BigDecimal getR0170_expbccf_gres_resi() {
		return r0170_expbccf_gres_resi;
	}







	public void setR0170_expbccf_gres_resi(BigDecimal r0170_expbccf_gres_resi) {
		this.r0170_expbccf_gres_resi = r0170_expbccf_gres_resi;
	}







	public BigDecimal getR0170_expaccf_gres_resi() {
		return r0170_expaccf_gres_resi;
	}







	public void setR0170_expaccf_gres_resi(BigDecimal r0170_expaccf_gres_resi) {
		this.r0170_expaccf_gres_resi = r0170_expaccf_gres_resi;
	}







	public BigDecimal getR0170_expbccf_gres_nonresi() {
		return r0170_expbccf_gres_nonresi;
	}







	public void setR0170_expbccf_gres_nonresi(BigDecimal r0170_expbccf_gres_nonresi) {
		this.r0170_expbccf_gres_nonresi = r0170_expbccf_gres_nonresi;
	}







	public BigDecimal getR0170_expaccf_gres_nonresi() {
		return r0170_expaccf_gres_nonresi;
	}







	public void setR0170_expaccf_gres_nonresi(BigDecimal r0170_expaccf_gres_nonresi) {
		this.r0170_expaccf_gres_nonresi = r0170_expaccf_gres_nonresi;
	}







	public BigDecimal getR0170_expbccf_corp_resi() {
		return r0170_expbccf_corp_resi;
	}







	public void setR0170_expbccf_corp_resi(BigDecimal r0170_expbccf_corp_resi) {
		this.r0170_expbccf_corp_resi = r0170_expbccf_corp_resi;
	}







	public BigDecimal getR0170_expaccf_corp_resi() {
		return r0170_expaccf_corp_resi;
	}







	public void setR0170_expaccf_corp_resi(BigDecimal r0170_expaccf_corp_resi) {
		this.r0170_expaccf_corp_resi = r0170_expaccf_corp_resi;
	}







	public BigDecimal getR0170_expbccf_corp_nonresi() {
		return r0170_expbccf_corp_nonresi;
	}







	public void setR0170_expbccf_corp_nonresi(BigDecimal r0170_expbccf_corp_nonresi) {
		this.r0170_expbccf_corp_nonresi = r0170_expbccf_corp_nonresi;
	}







	public BigDecimal getR0170_expaccf_corp_nonresi() {
		return r0170_expaccf_corp_nonresi;
	}







	public void setR0170_expaccf_corp_nonresi(BigDecimal r0170_expaccf_corp_nonresi) {
		this.r0170_expaccf_corp_nonresi = r0170_expaccf_corp_nonresi;
	}







	public BigDecimal getR0170_expbccf_nbfi_resi() {
		return r0170_expbccf_nbfi_resi;
	}







	public void setR0170_expbccf_nbfi_resi(BigDecimal r0170_expbccf_nbfi_resi) {
		this.r0170_expbccf_nbfi_resi = r0170_expbccf_nbfi_resi;
	}







	public BigDecimal getR0170_expaccf_nbfi_resi() {
		return r0170_expaccf_nbfi_resi;
	}







	public void setR0170_expaccf_nbfi_resi(BigDecimal r0170_expaccf_nbfi_resi) {
		this.r0170_expaccf_nbfi_resi = r0170_expaccf_nbfi_resi;
	}







	public BigDecimal getR0170_expbccf_nbfi_nonresi() {
		return r0170_expbccf_nbfi_nonresi;
	}







	public void setR0170_expbccf_nbfi_nonresi(BigDecimal r0170_expbccf_nbfi_nonresi) {
		this.r0170_expbccf_nbfi_nonresi = r0170_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0170_expaccf_nbfi_nonresi() {
		return r0170_expaccf_nbfi_nonresi;
	}







	public void setR0170_expaccf_nbfi_nonresi(BigDecimal r0170_expaccf_nbfi_nonresi) {
		this.r0170_expaccf_nbfi_nonresi = r0170_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0170_expbccf_bank_resi() {
		return r0170_expbccf_bank_resi;
	}







	public void setR0170_expbccf_bank_resi(BigDecimal r0170_expbccf_bank_resi) {
		this.r0170_expbccf_bank_resi = r0170_expbccf_bank_resi;
	}







	public BigDecimal getR0170_expaccf_bank_resi() {
		return r0170_expaccf_bank_resi;
	}







	public void setR0170_expaccf_bank_resi(BigDecimal r0170_expaccf_bank_resi) {
		this.r0170_expaccf_bank_resi = r0170_expaccf_bank_resi;
	}







	public BigDecimal getR0170_expbccf_bank_nonresi() {
		return r0170_expbccf_bank_nonresi;
	}







	public void setR0170_expbccf_bank_nonresi(BigDecimal r0170_expbccf_bank_nonresi) {
		this.r0170_expbccf_bank_nonresi = r0170_expbccf_bank_nonresi;
	}







	public BigDecimal getR0170_expaccf_bank_nonresi() {
		return r0170_expaccf_bank_nonresi;
	}







	public void setR0170_expaccf_bank_nonresi(BigDecimal r0170_expaccf_bank_nonresi) {
		this.r0170_expaccf_bank_nonresi = r0170_expaccf_bank_nonresi;
	}







	public BigDecimal getR0170_expbccf_gov_resi() {
		return r0170_expbccf_gov_resi;
	}







	public void setR0170_expbccf_gov_resi(BigDecimal r0170_expbccf_gov_resi) {
		this.r0170_expbccf_gov_resi = r0170_expbccf_gov_resi;
	}







	public BigDecimal getR0170_expaccf_gov_resi() {
		return r0170_expaccf_gov_resi;
	}







	public void setR0170_expaccf_gov_resi(BigDecimal r0170_expaccf_gov_resi) {
		this.r0170_expaccf_gov_resi = r0170_expaccf_gov_resi;
	}







	public BigDecimal getR0170_expbccf_gov_nonresi() {
		return r0170_expbccf_gov_nonresi;
	}







	public void setR0170_expbccf_gov_nonresi(BigDecimal r0170_expbccf_gov_nonresi) {
		this.r0170_expbccf_gov_nonresi = r0170_expbccf_gov_nonresi;
	}







	public BigDecimal getR0170_expaccf_gov_nonresi() {
		return r0170_expaccf_gov_nonresi;
	}







	public void setR0170_expaccf_gov_nonresi(BigDecimal r0170_expaccf_gov_nonresi) {
		this.r0170_expaccf_gov_nonresi = r0170_expaccf_gov_nonresi;
	}







	public String getR0180_product() {
		return r0180_product;
	}







	public void setR0180_product(String r0180_product) {
		this.r0180_product = r0180_product;
	}







	public BigDecimal getR0180_expbccf_indiv_resi() {
		return r0180_expbccf_indiv_resi;
	}







	public void setR0180_expbccf_indiv_resi(BigDecimal r0180_expbccf_indiv_resi) {
		this.r0180_expbccf_indiv_resi = r0180_expbccf_indiv_resi;
	}







	public BigDecimal getR0180_expaccf_indiv_resi() {
		return r0180_expaccf_indiv_resi;
	}







	public void setR0180_expaccf_indiv_resi(BigDecimal r0180_expaccf_indiv_resi) {
		this.r0180_expaccf_indiv_resi = r0180_expaccf_indiv_resi;
	}







	public BigDecimal getR0180_expbccf_indiv_nonresi() {
		return r0180_expbccf_indiv_nonresi;
	}







	public void setR0180_expbccf_indiv_nonresi(BigDecimal r0180_expbccf_indiv_nonresi) {
		this.r0180_expbccf_indiv_nonresi = r0180_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0180_expaccf_indiv_nonresi() {
		return r0180_expaccf_indiv_nonresi;
	}







	public void setR0180_expaccf_indiv_nonresi(BigDecimal r0180_expaccf_indiv_nonresi) {
		this.r0180_expaccf_indiv_nonresi = r0180_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0180_expbccf_rsme_resi() {
		return r0180_expbccf_rsme_resi;
	}







	public void setR0180_expbccf_rsme_resi(BigDecimal r0180_expbccf_rsme_resi) {
		this.r0180_expbccf_rsme_resi = r0180_expbccf_rsme_resi;
	}







	public BigDecimal getR0180_expaccf_rsme_resi() {
		return r0180_expaccf_rsme_resi;
	}







	public void setR0180_expaccf_rsme_resi(BigDecimal r0180_expaccf_rsme_resi) {
		this.r0180_expaccf_rsme_resi = r0180_expaccf_rsme_resi;
	}







	public BigDecimal getR0180_expbccf_rsme_nonresi() {
		return r0180_expbccf_rsme_nonresi;
	}







	public void setR0180_expbccf_rsme_nonresi(BigDecimal r0180_expbccf_rsme_nonresi) {
		this.r0180_expbccf_rsme_nonresi = r0180_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0180_expaccf_rsme_nonresi() {
		return r0180_expaccf_rsme_nonresi;
	}







	public void setR0180_expaccf_rsme_nonresi(BigDecimal r0180_expaccf_rsme_nonresi) {
		this.r0180_expaccf_rsme_nonresi = r0180_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0180_expbccf_sme_resi() {
		return r0180_expbccf_sme_resi;
	}







	public void setR0180_expbccf_sme_resi(BigDecimal r0180_expbccf_sme_resi) {
		this.r0180_expbccf_sme_resi = r0180_expbccf_sme_resi;
	}







	public BigDecimal getR0180_expaccf_sme_resi() {
		return r0180_expaccf_sme_resi;
	}







	public void setR0180_expaccf_sme_resi(BigDecimal r0180_expaccf_sme_resi) {
		this.r0180_expaccf_sme_resi = r0180_expaccf_sme_resi;
	}







	public BigDecimal getR0180_expbccf_sme_nonresi() {
		return r0180_expbccf_sme_nonresi;
	}







	public void setR0180_expbccf_sme_nonresi(BigDecimal r0180_expbccf_sme_nonresi) {
		this.r0180_expbccf_sme_nonresi = r0180_expbccf_sme_nonresi;
	}







	public BigDecimal getR0180_expaccf_sme_nonresi() {
		return r0180_expaccf_sme_nonresi;
	}







	public void setR0180_expaccf_sme_nonresi(BigDecimal r0180_expaccf_sme_nonresi) {
		this.r0180_expaccf_sme_nonresi = r0180_expaccf_sme_nonresi;
	}







	public BigDecimal getR0180_expbccf_hni_resi() {
		return r0180_expbccf_hni_resi;
	}







	public void setR0180_expbccf_hni_resi(BigDecimal r0180_expbccf_hni_resi) {
		this.r0180_expbccf_hni_resi = r0180_expbccf_hni_resi;
	}







	public BigDecimal getR0180_expaccf_hni_resi() {
		return r0180_expaccf_hni_resi;
	}







	public void setR0180_expaccf_hni_resi(BigDecimal r0180_expaccf_hni_resi) {
		this.r0180_expaccf_hni_resi = r0180_expaccf_hni_resi;
	}







	public BigDecimal getR0180_expbccf_hni_nonresi() {
		return r0180_expbccf_hni_nonresi;
	}







	public void setR0180_expbccf_hni_nonresi(BigDecimal r0180_expbccf_hni_nonresi) {
		this.r0180_expbccf_hni_nonresi = r0180_expbccf_hni_nonresi;
	}







	public BigDecimal getR0180_expaccf_hni_nonresi() {
		return r0180_expaccf_hni_nonresi;
	}







	public void setR0180_expaccf_hni_nonresi(BigDecimal r0180_expaccf_hni_nonresi) {
		this.r0180_expaccf_hni_nonresi = r0180_expaccf_hni_nonresi;
	}







	public BigDecimal getR0180_expbccf_gres_resi() {
		return r0180_expbccf_gres_resi;
	}







	public void setR0180_expbccf_gres_resi(BigDecimal r0180_expbccf_gres_resi) {
		this.r0180_expbccf_gres_resi = r0180_expbccf_gres_resi;
	}







	public BigDecimal getR0180_expaccf_gres_resi() {
		return r0180_expaccf_gres_resi;
	}







	public void setR0180_expaccf_gres_resi(BigDecimal r0180_expaccf_gres_resi) {
		this.r0180_expaccf_gres_resi = r0180_expaccf_gres_resi;
	}







	public BigDecimal getR0180_expbccf_gres_nonresi() {
		return r0180_expbccf_gres_nonresi;
	}







	public void setR0180_expbccf_gres_nonresi(BigDecimal r0180_expbccf_gres_nonresi) {
		this.r0180_expbccf_gres_nonresi = r0180_expbccf_gres_nonresi;
	}







	public BigDecimal getR0180_expaccf_gres_nonresi() {
		return r0180_expaccf_gres_nonresi;
	}







	public void setR0180_expaccf_gres_nonresi(BigDecimal r0180_expaccf_gres_nonresi) {
		this.r0180_expaccf_gres_nonresi = r0180_expaccf_gres_nonresi;
	}







	public BigDecimal getR0180_expbccf_corp_resi() {
		return r0180_expbccf_corp_resi;
	}







	public void setR0180_expbccf_corp_resi(BigDecimal r0180_expbccf_corp_resi) {
		this.r0180_expbccf_corp_resi = r0180_expbccf_corp_resi;
	}







	public BigDecimal getR0180_expaccf_corp_resi() {
		return r0180_expaccf_corp_resi;
	}







	public void setR0180_expaccf_corp_resi(BigDecimal r0180_expaccf_corp_resi) {
		this.r0180_expaccf_corp_resi = r0180_expaccf_corp_resi;
	}







	public BigDecimal getR0180_expbccf_corp_nonresi() {
		return r0180_expbccf_corp_nonresi;
	}







	public void setR0180_expbccf_corp_nonresi(BigDecimal r0180_expbccf_corp_nonresi) {
		this.r0180_expbccf_corp_nonresi = r0180_expbccf_corp_nonresi;
	}







	public BigDecimal getR0180_expaccf_corp_nonresi() {
		return r0180_expaccf_corp_nonresi;
	}







	public void setR0180_expaccf_corp_nonresi(BigDecimal r0180_expaccf_corp_nonresi) {
		this.r0180_expaccf_corp_nonresi = r0180_expaccf_corp_nonresi;
	}







	public BigDecimal getR0180_expbccf_nbfi_resi() {
		return r0180_expbccf_nbfi_resi;
	}







	public void setR0180_expbccf_nbfi_resi(BigDecimal r0180_expbccf_nbfi_resi) {
		this.r0180_expbccf_nbfi_resi = r0180_expbccf_nbfi_resi;
	}







	public BigDecimal getR0180_expaccf_nbfi_resi() {
		return r0180_expaccf_nbfi_resi;
	}







	public void setR0180_expaccf_nbfi_resi(BigDecimal r0180_expaccf_nbfi_resi) {
		this.r0180_expaccf_nbfi_resi = r0180_expaccf_nbfi_resi;
	}







	public BigDecimal getR0180_expbccf_nbfi_nonresi() {
		return r0180_expbccf_nbfi_nonresi;
	}







	public void setR0180_expbccf_nbfi_nonresi(BigDecimal r0180_expbccf_nbfi_nonresi) {
		this.r0180_expbccf_nbfi_nonresi = r0180_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0180_expaccf_nbfi_nonresi() {
		return r0180_expaccf_nbfi_nonresi;
	}







	public void setR0180_expaccf_nbfi_nonresi(BigDecimal r0180_expaccf_nbfi_nonresi) {
		this.r0180_expaccf_nbfi_nonresi = r0180_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0180_expbccf_bank_resi() {
		return r0180_expbccf_bank_resi;
	}







	public void setR0180_expbccf_bank_resi(BigDecimal r0180_expbccf_bank_resi) {
		this.r0180_expbccf_bank_resi = r0180_expbccf_bank_resi;
	}







	public BigDecimal getR0180_expaccf_bank_resi() {
		return r0180_expaccf_bank_resi;
	}







	public void setR0180_expaccf_bank_resi(BigDecimal r0180_expaccf_bank_resi) {
		this.r0180_expaccf_bank_resi = r0180_expaccf_bank_resi;
	}







	public BigDecimal getR0180_expbccf_bank_nonresi() {
		return r0180_expbccf_bank_nonresi;
	}







	public void setR0180_expbccf_bank_nonresi(BigDecimal r0180_expbccf_bank_nonresi) {
		this.r0180_expbccf_bank_nonresi = r0180_expbccf_bank_nonresi;
	}







	public BigDecimal getR0180_expaccf_bank_nonresi() {
		return r0180_expaccf_bank_nonresi;
	}







	public void setR0180_expaccf_bank_nonresi(BigDecimal r0180_expaccf_bank_nonresi) {
		this.r0180_expaccf_bank_nonresi = r0180_expaccf_bank_nonresi;
	}







	public BigDecimal getR0180_expbccf_gov_resi() {
		return r0180_expbccf_gov_resi;
	}







	public void setR0180_expbccf_gov_resi(BigDecimal r0180_expbccf_gov_resi) {
		this.r0180_expbccf_gov_resi = r0180_expbccf_gov_resi;
	}







	public BigDecimal getR0180_expaccf_gov_resi() {
		return r0180_expaccf_gov_resi;
	}







	public void setR0180_expaccf_gov_resi(BigDecimal r0180_expaccf_gov_resi) {
		this.r0180_expaccf_gov_resi = r0180_expaccf_gov_resi;
	}







	public BigDecimal getR0180_expbccf_gov_nonresi() {
		return r0180_expbccf_gov_nonresi;
	}







	public void setR0180_expbccf_gov_nonresi(BigDecimal r0180_expbccf_gov_nonresi) {
		this.r0180_expbccf_gov_nonresi = r0180_expbccf_gov_nonresi;
	}







	public BigDecimal getR0180_expaccf_gov_nonresi() {
		return r0180_expaccf_gov_nonresi;
	}







	public void setR0180_expaccf_gov_nonresi(BigDecimal r0180_expaccf_gov_nonresi) {
		this.r0180_expaccf_gov_nonresi = r0180_expaccf_gov_nonresi;
	}







	public String getR0190_product() {
		return r0190_product;
	}







	public void setR0190_product(String r0190_product) {
		this.r0190_product = r0190_product;
	}







	public BigDecimal getR0190_expbccf_indiv_resi() {
		return r0190_expbccf_indiv_resi;
	}







	public void setR0190_expbccf_indiv_resi(BigDecimal r0190_expbccf_indiv_resi) {
		this.r0190_expbccf_indiv_resi = r0190_expbccf_indiv_resi;
	}







	public BigDecimal getR0190_expaccf_indiv_resi() {
		return r0190_expaccf_indiv_resi;
	}







	public void setR0190_expaccf_indiv_resi(BigDecimal r0190_expaccf_indiv_resi) {
		this.r0190_expaccf_indiv_resi = r0190_expaccf_indiv_resi;
	}







	public BigDecimal getR0190_expbccf_indiv_nonresi() {
		return r0190_expbccf_indiv_nonresi;
	}







	public void setR0190_expbccf_indiv_nonresi(BigDecimal r0190_expbccf_indiv_nonresi) {
		this.r0190_expbccf_indiv_nonresi = r0190_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0190_expaccf_indiv_nonresi() {
		return r0190_expaccf_indiv_nonresi;
	}







	public void setR0190_expaccf_indiv_nonresi(BigDecimal r0190_expaccf_indiv_nonresi) {
		this.r0190_expaccf_indiv_nonresi = r0190_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0190_expbccf_rsme_resi() {
		return r0190_expbccf_rsme_resi;
	}







	public void setR0190_expbccf_rsme_resi(BigDecimal r0190_expbccf_rsme_resi) {
		this.r0190_expbccf_rsme_resi = r0190_expbccf_rsme_resi;
	}







	public BigDecimal getR0190_expaccf_rsme_resi() {
		return r0190_expaccf_rsme_resi;
	}







	public void setR0190_expaccf_rsme_resi(BigDecimal r0190_expaccf_rsme_resi) {
		this.r0190_expaccf_rsme_resi = r0190_expaccf_rsme_resi;
	}







	public BigDecimal getR0190_expbccf_rsme_nonresi() {
		return r0190_expbccf_rsme_nonresi;
	}







	public void setR0190_expbccf_rsme_nonresi(BigDecimal r0190_expbccf_rsme_nonresi) {
		this.r0190_expbccf_rsme_nonresi = r0190_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0190_expaccf_rsme_nonresi() {
		return r0190_expaccf_rsme_nonresi;
	}







	public void setR0190_expaccf_rsme_nonresi(BigDecimal r0190_expaccf_rsme_nonresi) {
		this.r0190_expaccf_rsme_nonresi = r0190_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0190_expbccf_sme_resi() {
		return r0190_expbccf_sme_resi;
	}







	public void setR0190_expbccf_sme_resi(BigDecimal r0190_expbccf_sme_resi) {
		this.r0190_expbccf_sme_resi = r0190_expbccf_sme_resi;
	}







	public BigDecimal getR0190_expaccf_sme_resi() {
		return r0190_expaccf_sme_resi;
	}







	public void setR0190_expaccf_sme_resi(BigDecimal r0190_expaccf_sme_resi) {
		this.r0190_expaccf_sme_resi = r0190_expaccf_sme_resi;
	}







	public BigDecimal getR0190_expbccf_sme_nonresi() {
		return r0190_expbccf_sme_nonresi;
	}







	public void setR0190_expbccf_sme_nonresi(BigDecimal r0190_expbccf_sme_nonresi) {
		this.r0190_expbccf_sme_nonresi = r0190_expbccf_sme_nonresi;
	}







	public BigDecimal getR0190_expaccf_sme_nonresi() {
		return r0190_expaccf_sme_nonresi;
	}







	public void setR0190_expaccf_sme_nonresi(BigDecimal r0190_expaccf_sme_nonresi) {
		this.r0190_expaccf_sme_nonresi = r0190_expaccf_sme_nonresi;
	}







	public BigDecimal getR0190_expbccf_hni_resi() {
		return r0190_expbccf_hni_resi;
	}







	public void setR0190_expbccf_hni_resi(BigDecimal r0190_expbccf_hni_resi) {
		this.r0190_expbccf_hni_resi = r0190_expbccf_hni_resi;
	}







	public BigDecimal getR0190_expaccf_hni_resi() {
		return r0190_expaccf_hni_resi;
	}







	public void setR0190_expaccf_hni_resi(BigDecimal r0190_expaccf_hni_resi) {
		this.r0190_expaccf_hni_resi = r0190_expaccf_hni_resi;
	}







	public BigDecimal getR0190_expbccf_hni_nonresi() {
		return r0190_expbccf_hni_nonresi;
	}







	public void setR0190_expbccf_hni_nonresi(BigDecimal r0190_expbccf_hni_nonresi) {
		this.r0190_expbccf_hni_nonresi = r0190_expbccf_hni_nonresi;
	}







	public BigDecimal getR0190_expaccf_hni_nonresi() {
		return r0190_expaccf_hni_nonresi;
	}







	public void setR0190_expaccf_hni_nonresi(BigDecimal r0190_expaccf_hni_nonresi) {
		this.r0190_expaccf_hni_nonresi = r0190_expaccf_hni_nonresi;
	}







	public BigDecimal getR0190_expbccf_gres_resi() {
		return r0190_expbccf_gres_resi;
	}







	public void setR0190_expbccf_gres_resi(BigDecimal r0190_expbccf_gres_resi) {
		this.r0190_expbccf_gres_resi = r0190_expbccf_gres_resi;
	}







	public BigDecimal getR0190_expaccf_gres_resi() {
		return r0190_expaccf_gres_resi;
	}







	public void setR0190_expaccf_gres_resi(BigDecimal r0190_expaccf_gres_resi) {
		this.r0190_expaccf_gres_resi = r0190_expaccf_gres_resi;
	}







	public BigDecimal getR0190_expbccf_gres_nonresi() {
		return r0190_expbccf_gres_nonresi;
	}







	public void setR0190_expbccf_gres_nonresi(BigDecimal r0190_expbccf_gres_nonresi) {
		this.r0190_expbccf_gres_nonresi = r0190_expbccf_gres_nonresi;
	}







	public BigDecimal getR0190_expaccf_gres_nonresi() {
		return r0190_expaccf_gres_nonresi;
	}







	public void setR0190_expaccf_gres_nonresi(BigDecimal r0190_expaccf_gres_nonresi) {
		this.r0190_expaccf_gres_nonresi = r0190_expaccf_gres_nonresi;
	}







	public BigDecimal getR0190_expbccf_corp_resi() {
		return r0190_expbccf_corp_resi;
	}







	public void setR0190_expbccf_corp_resi(BigDecimal r0190_expbccf_corp_resi) {
		this.r0190_expbccf_corp_resi = r0190_expbccf_corp_resi;
	}







	public BigDecimal getR0190_expaccf_corp_resi() {
		return r0190_expaccf_corp_resi;
	}







	public void setR0190_expaccf_corp_resi(BigDecimal r0190_expaccf_corp_resi) {
		this.r0190_expaccf_corp_resi = r0190_expaccf_corp_resi;
	}







	public BigDecimal getR0190_expbccf_corp_nonresi() {
		return r0190_expbccf_corp_nonresi;
	}







	public void setR0190_expbccf_corp_nonresi(BigDecimal r0190_expbccf_corp_nonresi) {
		this.r0190_expbccf_corp_nonresi = r0190_expbccf_corp_nonresi;
	}







	public BigDecimal getR0190_expaccf_corp_nonresi() {
		return r0190_expaccf_corp_nonresi;
	}







	public void setR0190_expaccf_corp_nonresi(BigDecimal r0190_expaccf_corp_nonresi) {
		this.r0190_expaccf_corp_nonresi = r0190_expaccf_corp_nonresi;
	}







	public BigDecimal getR0190_expbccf_nbfi_resi() {
		return r0190_expbccf_nbfi_resi;
	}







	public void setR0190_expbccf_nbfi_resi(BigDecimal r0190_expbccf_nbfi_resi) {
		this.r0190_expbccf_nbfi_resi = r0190_expbccf_nbfi_resi;
	}







	public BigDecimal getR0190_expaccf_nbfi_resi() {
		return r0190_expaccf_nbfi_resi;
	}







	public void setR0190_expaccf_nbfi_resi(BigDecimal r0190_expaccf_nbfi_resi) {
		this.r0190_expaccf_nbfi_resi = r0190_expaccf_nbfi_resi;
	}







	public BigDecimal getR0190_expbccf_nbfi_nonresi() {
		return r0190_expbccf_nbfi_nonresi;
	}







	public void setR0190_expbccf_nbfi_nonresi(BigDecimal r0190_expbccf_nbfi_nonresi) {
		this.r0190_expbccf_nbfi_nonresi = r0190_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0190_expaccf_nbfi_nonresi() {
		return r0190_expaccf_nbfi_nonresi;
	}







	public void setR0190_expaccf_nbfi_nonresi(BigDecimal r0190_expaccf_nbfi_nonresi) {
		this.r0190_expaccf_nbfi_nonresi = r0190_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0190_expbccf_bank_resi() {
		return r0190_expbccf_bank_resi;
	}







	public void setR0190_expbccf_bank_resi(BigDecimal r0190_expbccf_bank_resi) {
		this.r0190_expbccf_bank_resi = r0190_expbccf_bank_resi;
	}







	public BigDecimal getR0190_expaccf_bank_resi() {
		return r0190_expaccf_bank_resi;
	}







	public void setR0190_expaccf_bank_resi(BigDecimal r0190_expaccf_bank_resi) {
		this.r0190_expaccf_bank_resi = r0190_expaccf_bank_resi;
	}







	public BigDecimal getR0190_expbccf_bank_nonresi() {
		return r0190_expbccf_bank_nonresi;
	}







	public void setR0190_expbccf_bank_nonresi(BigDecimal r0190_expbccf_bank_nonresi) {
		this.r0190_expbccf_bank_nonresi = r0190_expbccf_bank_nonresi;
	}







	public BigDecimal getR0190_expaccf_bank_nonresi() {
		return r0190_expaccf_bank_nonresi;
	}







	public void setR0190_expaccf_bank_nonresi(BigDecimal r0190_expaccf_bank_nonresi) {
		this.r0190_expaccf_bank_nonresi = r0190_expaccf_bank_nonresi;
	}







	public BigDecimal getR0190_expbccf_gov_resi() {
		return r0190_expbccf_gov_resi;
	}







	public void setR0190_expbccf_gov_resi(BigDecimal r0190_expbccf_gov_resi) {
		this.r0190_expbccf_gov_resi = r0190_expbccf_gov_resi;
	}







	public BigDecimal getR0190_expaccf_gov_resi() {
		return r0190_expaccf_gov_resi;
	}







	public void setR0190_expaccf_gov_resi(BigDecimal r0190_expaccf_gov_resi) {
		this.r0190_expaccf_gov_resi = r0190_expaccf_gov_resi;
	}







	public BigDecimal getR0190_expbccf_gov_nonresi() {
		return r0190_expbccf_gov_nonresi;
	}







	public void setR0190_expbccf_gov_nonresi(BigDecimal r0190_expbccf_gov_nonresi) {
		this.r0190_expbccf_gov_nonresi = r0190_expbccf_gov_nonresi;
	}







	public BigDecimal getR0190_expaccf_gov_nonresi() {
		return r0190_expaccf_gov_nonresi;
	}







	public void setR0190_expaccf_gov_nonresi(BigDecimal r0190_expaccf_gov_nonresi) {
		this.r0190_expaccf_gov_nonresi = r0190_expaccf_gov_nonresi;
	}







	public String getR0200_product() {
		return r0200_product;
	}







	public void setR0200_product(String r0200_product) {
		this.r0200_product = r0200_product;
	}







	public BigDecimal getR0200_expbccf_indiv_resi() {
		return r0200_expbccf_indiv_resi;
	}







	public void setR0200_expbccf_indiv_resi(BigDecimal r0200_expbccf_indiv_resi) {
		this.r0200_expbccf_indiv_resi = r0200_expbccf_indiv_resi;
	}







	public BigDecimal getR0200_expaccf_indiv_resi() {
		return r0200_expaccf_indiv_resi;
	}







	public void setR0200_expaccf_indiv_resi(BigDecimal r0200_expaccf_indiv_resi) {
		this.r0200_expaccf_indiv_resi = r0200_expaccf_indiv_resi;
	}







	public BigDecimal getR0200_expbccf_indiv_nonresi() {
		return r0200_expbccf_indiv_nonresi;
	}







	public void setR0200_expbccf_indiv_nonresi(BigDecimal r0200_expbccf_indiv_nonresi) {
		this.r0200_expbccf_indiv_nonresi = r0200_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0200_expaccf_indiv_nonresi() {
		return r0200_expaccf_indiv_nonresi;
	}







	public void setR0200_expaccf_indiv_nonresi(BigDecimal r0200_expaccf_indiv_nonresi) {
		this.r0200_expaccf_indiv_nonresi = r0200_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0200_expbccf_rsme_resi() {
		return r0200_expbccf_rsme_resi;
	}







	public void setR0200_expbccf_rsme_resi(BigDecimal r0200_expbccf_rsme_resi) {
		this.r0200_expbccf_rsme_resi = r0200_expbccf_rsme_resi;
	}







	public BigDecimal getR0200_expaccf_rsme_resi() {
		return r0200_expaccf_rsme_resi;
	}







	public void setR0200_expaccf_rsme_resi(BigDecimal r0200_expaccf_rsme_resi) {
		this.r0200_expaccf_rsme_resi = r0200_expaccf_rsme_resi;
	}







	public BigDecimal getR0200_expbccf_rsme_nonresi() {
		return r0200_expbccf_rsme_nonresi;
	}







	public void setR0200_expbccf_rsme_nonresi(BigDecimal r0200_expbccf_rsme_nonresi) {
		this.r0200_expbccf_rsme_nonresi = r0200_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0200_expaccf_rsme_nonresi() {
		return r0200_expaccf_rsme_nonresi;
	}







	public void setR0200_expaccf_rsme_nonresi(BigDecimal r0200_expaccf_rsme_nonresi) {
		this.r0200_expaccf_rsme_nonresi = r0200_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0200_expbccf_sme_resi() {
		return r0200_expbccf_sme_resi;
	}







	public void setR0200_expbccf_sme_resi(BigDecimal r0200_expbccf_sme_resi) {
		this.r0200_expbccf_sme_resi = r0200_expbccf_sme_resi;
	}







	public BigDecimal getR0200_expaccf_sme_resi() {
		return r0200_expaccf_sme_resi;
	}







	public void setR0200_expaccf_sme_resi(BigDecimal r0200_expaccf_sme_resi) {
		this.r0200_expaccf_sme_resi = r0200_expaccf_sme_resi;
	}







	public BigDecimal getR0200_expbccf_sme_nonresi() {
		return r0200_expbccf_sme_nonresi;
	}







	public void setR0200_expbccf_sme_nonresi(BigDecimal r0200_expbccf_sme_nonresi) {
		this.r0200_expbccf_sme_nonresi = r0200_expbccf_sme_nonresi;
	}







	public BigDecimal getR0200_expaccf_sme_nonresi() {
		return r0200_expaccf_sme_nonresi;
	}







	public void setR0200_expaccf_sme_nonresi(BigDecimal r0200_expaccf_sme_nonresi) {
		this.r0200_expaccf_sme_nonresi = r0200_expaccf_sme_nonresi;
	}







	public BigDecimal getR0200_expbccf_hni_resi() {
		return r0200_expbccf_hni_resi;
	}







	public void setR0200_expbccf_hni_resi(BigDecimal r0200_expbccf_hni_resi) {
		this.r0200_expbccf_hni_resi = r0200_expbccf_hni_resi;
	}







	public BigDecimal getR0200_expaccf_hni_resi() {
		return r0200_expaccf_hni_resi;
	}







	public void setR0200_expaccf_hni_resi(BigDecimal r0200_expaccf_hni_resi) {
		this.r0200_expaccf_hni_resi = r0200_expaccf_hni_resi;
	}







	public BigDecimal getR0200_expbccf_hni_nonresi() {
		return r0200_expbccf_hni_nonresi;
	}







	public void setR0200_expbccf_hni_nonresi(BigDecimal r0200_expbccf_hni_nonresi) {
		this.r0200_expbccf_hni_nonresi = r0200_expbccf_hni_nonresi;
	}







	public BigDecimal getR0200_expaccf_hni_nonresi() {
		return r0200_expaccf_hni_nonresi;
	}







	public void setR0200_expaccf_hni_nonresi(BigDecimal r0200_expaccf_hni_nonresi) {
		this.r0200_expaccf_hni_nonresi = r0200_expaccf_hni_nonresi;
	}







	public BigDecimal getR0200_expbccf_gres_resi() {
		return r0200_expbccf_gres_resi;
	}







	public void setR0200_expbccf_gres_resi(BigDecimal r0200_expbccf_gres_resi) {
		this.r0200_expbccf_gres_resi = r0200_expbccf_gres_resi;
	}







	public BigDecimal getR0200_expaccf_gres_resi() {
		return r0200_expaccf_gres_resi;
	}







	public void setR0200_expaccf_gres_resi(BigDecimal r0200_expaccf_gres_resi) {
		this.r0200_expaccf_gres_resi = r0200_expaccf_gres_resi;
	}







	public BigDecimal getR0200_expbccf_gres_nonresi() {
		return r0200_expbccf_gres_nonresi;
	}







	public void setR0200_expbccf_gres_nonresi(BigDecimal r0200_expbccf_gres_nonresi) {
		this.r0200_expbccf_gres_nonresi = r0200_expbccf_gres_nonresi;
	}







	public BigDecimal getR0200_expaccf_gres_nonresi() {
		return r0200_expaccf_gres_nonresi;
	}







	public void setR0200_expaccf_gres_nonresi(BigDecimal r0200_expaccf_gres_nonresi) {
		this.r0200_expaccf_gres_nonresi = r0200_expaccf_gres_nonresi;
	}







	public BigDecimal getR0200_expbccf_corp_resi() {
		return r0200_expbccf_corp_resi;
	}







	public void setR0200_expbccf_corp_resi(BigDecimal r0200_expbccf_corp_resi) {
		this.r0200_expbccf_corp_resi = r0200_expbccf_corp_resi;
	}







	public BigDecimal getR0200_expaccf_corp_resi() {
		return r0200_expaccf_corp_resi;
	}







	public void setR0200_expaccf_corp_resi(BigDecimal r0200_expaccf_corp_resi) {
		this.r0200_expaccf_corp_resi = r0200_expaccf_corp_resi;
	}







	public BigDecimal getR0200_expbccf_corp_nonresi() {
		return r0200_expbccf_corp_nonresi;
	}







	public void setR0200_expbccf_corp_nonresi(BigDecimal r0200_expbccf_corp_nonresi) {
		this.r0200_expbccf_corp_nonresi = r0200_expbccf_corp_nonresi;
	}







	public BigDecimal getR0200_expaccf_corp_nonresi() {
		return r0200_expaccf_corp_nonresi;
	}







	public void setR0200_expaccf_corp_nonresi(BigDecimal r0200_expaccf_corp_nonresi) {
		this.r0200_expaccf_corp_nonresi = r0200_expaccf_corp_nonresi;
	}







	public BigDecimal getR0200_expbccf_nbfi_resi() {
		return r0200_expbccf_nbfi_resi;
	}







	public void setR0200_expbccf_nbfi_resi(BigDecimal r0200_expbccf_nbfi_resi) {
		this.r0200_expbccf_nbfi_resi = r0200_expbccf_nbfi_resi;
	}







	public BigDecimal getR0200_expaccf_nbfi_resi() {
		return r0200_expaccf_nbfi_resi;
	}







	public void setR0200_expaccf_nbfi_resi(BigDecimal r0200_expaccf_nbfi_resi) {
		this.r0200_expaccf_nbfi_resi = r0200_expaccf_nbfi_resi;
	}







	public BigDecimal getR0200_expbccf_nbfi_nonresi() {
		return r0200_expbccf_nbfi_nonresi;
	}







	public void setR0200_expbccf_nbfi_nonresi(BigDecimal r0200_expbccf_nbfi_nonresi) {
		this.r0200_expbccf_nbfi_nonresi = r0200_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0200_expaccf_nbfi_nonresi() {
		return r0200_expaccf_nbfi_nonresi;
	}







	public void setR0200_expaccf_nbfi_nonresi(BigDecimal r0200_expaccf_nbfi_nonresi) {
		this.r0200_expaccf_nbfi_nonresi = r0200_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0200_expbccf_bank_resi() {
		return r0200_expbccf_bank_resi;
	}







	public void setR0200_expbccf_bank_resi(BigDecimal r0200_expbccf_bank_resi) {
		this.r0200_expbccf_bank_resi = r0200_expbccf_bank_resi;
	}







	public BigDecimal getR0200_expaccf_bank_resi() {
		return r0200_expaccf_bank_resi;
	}







	public void setR0200_expaccf_bank_resi(BigDecimal r0200_expaccf_bank_resi) {
		this.r0200_expaccf_bank_resi = r0200_expaccf_bank_resi;
	}







	public BigDecimal getR0200_expbccf_bank_nonresi() {
		return r0200_expbccf_bank_nonresi;
	}







	public void setR0200_expbccf_bank_nonresi(BigDecimal r0200_expbccf_bank_nonresi) {
		this.r0200_expbccf_bank_nonresi = r0200_expbccf_bank_nonresi;
	}







	public BigDecimal getR0200_expaccf_bank_nonresi() {
		return r0200_expaccf_bank_nonresi;
	}







	public void setR0200_expaccf_bank_nonresi(BigDecimal r0200_expaccf_bank_nonresi) {
		this.r0200_expaccf_bank_nonresi = r0200_expaccf_bank_nonresi;
	}







	public BigDecimal getR0200_expbccf_gov_resi() {
		return r0200_expbccf_gov_resi;
	}







	public void setR0200_expbccf_gov_resi(BigDecimal r0200_expbccf_gov_resi) {
		this.r0200_expbccf_gov_resi = r0200_expbccf_gov_resi;
	}







	public BigDecimal getR0200_expaccf_gov_resi() {
		return r0200_expaccf_gov_resi;
	}







	public void setR0200_expaccf_gov_resi(BigDecimal r0200_expaccf_gov_resi) {
		this.r0200_expaccf_gov_resi = r0200_expaccf_gov_resi;
	}







	public BigDecimal getR0200_expbccf_gov_nonresi() {
		return r0200_expbccf_gov_nonresi;
	}







	public void setR0200_expbccf_gov_nonresi(BigDecimal r0200_expbccf_gov_nonresi) {
		this.r0200_expbccf_gov_nonresi = r0200_expbccf_gov_nonresi;
	}







	public BigDecimal getR0200_expaccf_gov_nonresi() {
		return r0200_expaccf_gov_nonresi;
	}







	public void setR0200_expaccf_gov_nonresi(BigDecimal r0200_expaccf_gov_nonresi) {
		this.r0200_expaccf_gov_nonresi = r0200_expaccf_gov_nonresi;
	}







	public String getR0210_product() {
		return r0210_product;
	}







	public void setR0210_product(String r0210_product) {
		this.r0210_product = r0210_product;
	}







	public BigDecimal getR0210_expbccf_indiv_resi() {
		return r0210_expbccf_indiv_resi;
	}







	public void setR0210_expbccf_indiv_resi(BigDecimal r0210_expbccf_indiv_resi) {
		this.r0210_expbccf_indiv_resi = r0210_expbccf_indiv_resi;
	}







	public BigDecimal getR0210_expaccf_indiv_resi() {
		return r0210_expaccf_indiv_resi;
	}







	public void setR0210_expaccf_indiv_resi(BigDecimal r0210_expaccf_indiv_resi) {
		this.r0210_expaccf_indiv_resi = r0210_expaccf_indiv_resi;
	}







	public BigDecimal getR0210_expbccf_indiv_nonresi() {
		return r0210_expbccf_indiv_nonresi;
	}







	public void setR0210_expbccf_indiv_nonresi(BigDecimal r0210_expbccf_indiv_nonresi) {
		this.r0210_expbccf_indiv_nonresi = r0210_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0210_expaccf_indiv_nonresi() {
		return r0210_expaccf_indiv_nonresi;
	}







	public void setR0210_expaccf_indiv_nonresi(BigDecimal r0210_expaccf_indiv_nonresi) {
		this.r0210_expaccf_indiv_nonresi = r0210_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0210_expbccf_rsme_resi() {
		return r0210_expbccf_rsme_resi;
	}







	public void setR0210_expbccf_rsme_resi(BigDecimal r0210_expbccf_rsme_resi) {
		this.r0210_expbccf_rsme_resi = r0210_expbccf_rsme_resi;
	}







	public BigDecimal getR0210_expaccf_rsme_resi() {
		return r0210_expaccf_rsme_resi;
	}







	public void setR0210_expaccf_rsme_resi(BigDecimal r0210_expaccf_rsme_resi) {
		this.r0210_expaccf_rsme_resi = r0210_expaccf_rsme_resi;
	}







	public BigDecimal getR0210_expbccf_rsme_nonresi() {
		return r0210_expbccf_rsme_nonresi;
	}







	public void setR0210_expbccf_rsme_nonresi(BigDecimal r0210_expbccf_rsme_nonresi) {
		this.r0210_expbccf_rsme_nonresi = r0210_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0210_expaccf_rsme_nonresi() {
		return r0210_expaccf_rsme_nonresi;
	}







	public void setR0210_expaccf_rsme_nonresi(BigDecimal r0210_expaccf_rsme_nonresi) {
		this.r0210_expaccf_rsme_nonresi = r0210_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0210_expbccf_sme_resi() {
		return r0210_expbccf_sme_resi;
	}







	public void setR0210_expbccf_sme_resi(BigDecimal r0210_expbccf_sme_resi) {
		this.r0210_expbccf_sme_resi = r0210_expbccf_sme_resi;
	}







	public BigDecimal getR0210_expaccf_sme_resi() {
		return r0210_expaccf_sme_resi;
	}







	public void setR0210_expaccf_sme_resi(BigDecimal r0210_expaccf_sme_resi) {
		this.r0210_expaccf_sme_resi = r0210_expaccf_sme_resi;
	}







	public BigDecimal getR0210_expbccf_sme_nonresi() {
		return r0210_expbccf_sme_nonresi;
	}







	public void setR0210_expbccf_sme_nonresi(BigDecimal r0210_expbccf_sme_nonresi) {
		this.r0210_expbccf_sme_nonresi = r0210_expbccf_sme_nonresi;
	}







	public BigDecimal getR0210_expaccf_sme_nonresi() {
		return r0210_expaccf_sme_nonresi;
	}







	public void setR0210_expaccf_sme_nonresi(BigDecimal r0210_expaccf_sme_nonresi) {
		this.r0210_expaccf_sme_nonresi = r0210_expaccf_sme_nonresi;
	}







	public BigDecimal getR0210_expbccf_hni_resi() {
		return r0210_expbccf_hni_resi;
	}







	public void setR0210_expbccf_hni_resi(BigDecimal r0210_expbccf_hni_resi) {
		this.r0210_expbccf_hni_resi = r0210_expbccf_hni_resi;
	}







	public BigDecimal getR0210_expaccf_hni_resi() {
		return r0210_expaccf_hni_resi;
	}







	public void setR0210_expaccf_hni_resi(BigDecimal r0210_expaccf_hni_resi) {
		this.r0210_expaccf_hni_resi = r0210_expaccf_hni_resi;
	}







	public BigDecimal getR0210_expbccf_hni_nonresi() {
		return r0210_expbccf_hni_nonresi;
	}







	public void setR0210_expbccf_hni_nonresi(BigDecimal r0210_expbccf_hni_nonresi) {
		this.r0210_expbccf_hni_nonresi = r0210_expbccf_hni_nonresi;
	}







	public BigDecimal getR0210_expaccf_hni_nonresi() {
		return r0210_expaccf_hni_nonresi;
	}







	public void setR0210_expaccf_hni_nonresi(BigDecimal r0210_expaccf_hni_nonresi) {
		this.r0210_expaccf_hni_nonresi = r0210_expaccf_hni_nonresi;
	}







	public BigDecimal getR0210_expbccf_gres_resi() {
		return r0210_expbccf_gres_resi;
	}







	public void setR0210_expbccf_gres_resi(BigDecimal r0210_expbccf_gres_resi) {
		this.r0210_expbccf_gres_resi = r0210_expbccf_gres_resi;
	}







	public BigDecimal getR0210_expaccf_gres_resi() {
		return r0210_expaccf_gres_resi;
	}







	public void setR0210_expaccf_gres_resi(BigDecimal r0210_expaccf_gres_resi) {
		this.r0210_expaccf_gres_resi = r0210_expaccf_gres_resi;
	}







	public BigDecimal getR0210_expbccf_gres_nonresi() {
		return r0210_expbccf_gres_nonresi;
	}







	public void setR0210_expbccf_gres_nonresi(BigDecimal r0210_expbccf_gres_nonresi) {
		this.r0210_expbccf_gres_nonresi = r0210_expbccf_gres_nonresi;
	}







	public BigDecimal getR0210_expaccf_gres_nonresi() {
		return r0210_expaccf_gres_nonresi;
	}







	public void setR0210_expaccf_gres_nonresi(BigDecimal r0210_expaccf_gres_nonresi) {
		this.r0210_expaccf_gres_nonresi = r0210_expaccf_gres_nonresi;
	}







	public BigDecimal getR0210_expbccf_corp_resi() {
		return r0210_expbccf_corp_resi;
	}







	public void setR0210_expbccf_corp_resi(BigDecimal r0210_expbccf_corp_resi) {
		this.r0210_expbccf_corp_resi = r0210_expbccf_corp_resi;
	}







	public BigDecimal getR0210_expaccf_corp_resi() {
		return r0210_expaccf_corp_resi;
	}







	public void setR0210_expaccf_corp_resi(BigDecimal r0210_expaccf_corp_resi) {
		this.r0210_expaccf_corp_resi = r0210_expaccf_corp_resi;
	}







	public BigDecimal getR0210_expbccf_corp_nonresi() {
		return r0210_expbccf_corp_nonresi;
	}







	public void setR0210_expbccf_corp_nonresi(BigDecimal r0210_expbccf_corp_nonresi) {
		this.r0210_expbccf_corp_nonresi = r0210_expbccf_corp_nonresi;
	}







	public BigDecimal getR0210_expaccf_corp_nonresi() {
		return r0210_expaccf_corp_nonresi;
	}







	public void setR0210_expaccf_corp_nonresi(BigDecimal r0210_expaccf_corp_nonresi) {
		this.r0210_expaccf_corp_nonresi = r0210_expaccf_corp_nonresi;
	}







	public BigDecimal getR0210_expbccf_nbfi_resi() {
		return r0210_expbccf_nbfi_resi;
	}







	public void setR0210_expbccf_nbfi_resi(BigDecimal r0210_expbccf_nbfi_resi) {
		this.r0210_expbccf_nbfi_resi = r0210_expbccf_nbfi_resi;
	}







	public BigDecimal getR0210_expaccf_nbfi_resi() {
		return r0210_expaccf_nbfi_resi;
	}







	public void setR0210_expaccf_nbfi_resi(BigDecimal r0210_expaccf_nbfi_resi) {
		this.r0210_expaccf_nbfi_resi = r0210_expaccf_nbfi_resi;
	}







	public BigDecimal getR0210_expbccf_nbfi_nonresi() {
		return r0210_expbccf_nbfi_nonresi;
	}







	public void setR0210_expbccf_nbfi_nonresi(BigDecimal r0210_expbccf_nbfi_nonresi) {
		this.r0210_expbccf_nbfi_nonresi = r0210_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0210_expaccf_nbfi_nonresi() {
		return r0210_expaccf_nbfi_nonresi;
	}







	public void setR0210_expaccf_nbfi_nonresi(BigDecimal r0210_expaccf_nbfi_nonresi) {
		this.r0210_expaccf_nbfi_nonresi = r0210_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0210_expbccf_bank_resi() {
		return r0210_expbccf_bank_resi;
	}







	public void setR0210_expbccf_bank_resi(BigDecimal r0210_expbccf_bank_resi) {
		this.r0210_expbccf_bank_resi = r0210_expbccf_bank_resi;
	}







	public BigDecimal getR0210_expaccf_bank_resi() {
		return r0210_expaccf_bank_resi;
	}







	public void setR0210_expaccf_bank_resi(BigDecimal r0210_expaccf_bank_resi) {
		this.r0210_expaccf_bank_resi = r0210_expaccf_bank_resi;
	}







	public BigDecimal getR0210_expbccf_bank_nonresi() {
		return r0210_expbccf_bank_nonresi;
	}







	public void setR0210_expbccf_bank_nonresi(BigDecimal r0210_expbccf_bank_nonresi) {
		this.r0210_expbccf_bank_nonresi = r0210_expbccf_bank_nonresi;
	}







	public BigDecimal getR0210_expaccf_bank_nonresi() {
		return r0210_expaccf_bank_nonresi;
	}







	public void setR0210_expaccf_bank_nonresi(BigDecimal r0210_expaccf_bank_nonresi) {
		this.r0210_expaccf_bank_nonresi = r0210_expaccf_bank_nonresi;
	}







	public BigDecimal getR0210_expbccf_gov_resi() {
		return r0210_expbccf_gov_resi;
	}







	public void setR0210_expbccf_gov_resi(BigDecimal r0210_expbccf_gov_resi) {
		this.r0210_expbccf_gov_resi = r0210_expbccf_gov_resi;
	}







	public BigDecimal getR0210_expaccf_gov_resi() {
		return r0210_expaccf_gov_resi;
	}







	public void setR0210_expaccf_gov_resi(BigDecimal r0210_expaccf_gov_resi) {
		this.r0210_expaccf_gov_resi = r0210_expaccf_gov_resi;
	}







	public BigDecimal getR0210_expbccf_gov_nonresi() {
		return r0210_expbccf_gov_nonresi;
	}







	public void setR0210_expbccf_gov_nonresi(BigDecimal r0210_expbccf_gov_nonresi) {
		this.r0210_expbccf_gov_nonresi = r0210_expbccf_gov_nonresi;
	}







	public BigDecimal getR0210_expaccf_gov_nonresi() {
		return r0210_expaccf_gov_nonresi;
	}







	public void setR0210_expaccf_gov_nonresi(BigDecimal r0210_expaccf_gov_nonresi) {
		this.r0210_expaccf_gov_nonresi = r0210_expaccf_gov_nonresi;
	}







	public String getR0220_product() {
		return r0220_product;
	}







	public void setR0220_product(String r0220_product) {
		this.r0220_product = r0220_product;
	}







	public BigDecimal getR0220_expbccf_indiv_resi() {
		return r0220_expbccf_indiv_resi;
	}







	public void setR0220_expbccf_indiv_resi(BigDecimal r0220_expbccf_indiv_resi) {
		this.r0220_expbccf_indiv_resi = r0220_expbccf_indiv_resi;
	}







	public BigDecimal getR0220_expaccf_indiv_resi() {
		return r0220_expaccf_indiv_resi;
	}







	public void setR0220_expaccf_indiv_resi(BigDecimal r0220_expaccf_indiv_resi) {
		this.r0220_expaccf_indiv_resi = r0220_expaccf_indiv_resi;
	}







	public BigDecimal getR0220_expbccf_indiv_nonresi() {
		return r0220_expbccf_indiv_nonresi;
	}







	public void setR0220_expbccf_indiv_nonresi(BigDecimal r0220_expbccf_indiv_nonresi) {
		this.r0220_expbccf_indiv_nonresi = r0220_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0220_expaccf_indiv_nonresi() {
		return r0220_expaccf_indiv_nonresi;
	}







	public void setR0220_expaccf_indiv_nonresi(BigDecimal r0220_expaccf_indiv_nonresi) {
		this.r0220_expaccf_indiv_nonresi = r0220_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0220_expbccf_rsme_resi() {
		return r0220_expbccf_rsme_resi;
	}







	public void setR0220_expbccf_rsme_resi(BigDecimal r0220_expbccf_rsme_resi) {
		this.r0220_expbccf_rsme_resi = r0220_expbccf_rsme_resi;
	}







	public BigDecimal getR0220_expaccf_rsme_resi() {
		return r0220_expaccf_rsme_resi;
	}







	public void setR0220_expaccf_rsme_resi(BigDecimal r0220_expaccf_rsme_resi) {
		this.r0220_expaccf_rsme_resi = r0220_expaccf_rsme_resi;
	}







	public BigDecimal getR0220_expbccf_rsme_nonresi() {
		return r0220_expbccf_rsme_nonresi;
	}







	public void setR0220_expbccf_rsme_nonresi(BigDecimal r0220_expbccf_rsme_nonresi) {
		this.r0220_expbccf_rsme_nonresi = r0220_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0220_expaccf_rsme_nonresi() {
		return r0220_expaccf_rsme_nonresi;
	}







	public void setR0220_expaccf_rsme_nonresi(BigDecimal r0220_expaccf_rsme_nonresi) {
		this.r0220_expaccf_rsme_nonresi = r0220_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0220_expbccf_sme_resi() {
		return r0220_expbccf_sme_resi;
	}







	public void setR0220_expbccf_sme_resi(BigDecimal r0220_expbccf_sme_resi) {
		this.r0220_expbccf_sme_resi = r0220_expbccf_sme_resi;
	}







	public BigDecimal getR0220_expaccf_sme_resi() {
		return r0220_expaccf_sme_resi;
	}







	public void setR0220_expaccf_sme_resi(BigDecimal r0220_expaccf_sme_resi) {
		this.r0220_expaccf_sme_resi = r0220_expaccf_sme_resi;
	}







	public BigDecimal getR0220_expbccf_sme_nonresi() {
		return r0220_expbccf_sme_nonresi;
	}







	public void setR0220_expbccf_sme_nonresi(BigDecimal r0220_expbccf_sme_nonresi) {
		this.r0220_expbccf_sme_nonresi = r0220_expbccf_sme_nonresi;
	}







	public BigDecimal getR0220_expaccf_sme_nonresi() {
		return r0220_expaccf_sme_nonresi;
	}







	public void setR0220_expaccf_sme_nonresi(BigDecimal r0220_expaccf_sme_nonresi) {
		this.r0220_expaccf_sme_nonresi = r0220_expaccf_sme_nonresi;
	}







	public BigDecimal getR0220_expbccf_hni_resi() {
		return r0220_expbccf_hni_resi;
	}







	public void setR0220_expbccf_hni_resi(BigDecimal r0220_expbccf_hni_resi) {
		this.r0220_expbccf_hni_resi = r0220_expbccf_hni_resi;
	}







	public BigDecimal getR0220_expaccf_hni_resi() {
		return r0220_expaccf_hni_resi;
	}







	public void setR0220_expaccf_hni_resi(BigDecimal r0220_expaccf_hni_resi) {
		this.r0220_expaccf_hni_resi = r0220_expaccf_hni_resi;
	}







	public BigDecimal getR0220_expbccf_hni_nonresi() {
		return r0220_expbccf_hni_nonresi;
	}







	public void setR0220_expbccf_hni_nonresi(BigDecimal r0220_expbccf_hni_nonresi) {
		this.r0220_expbccf_hni_nonresi = r0220_expbccf_hni_nonresi;
	}







	public BigDecimal getR0220_expaccf_hni_nonresi() {
		return r0220_expaccf_hni_nonresi;
	}







	public void setR0220_expaccf_hni_nonresi(BigDecimal r0220_expaccf_hni_nonresi) {
		this.r0220_expaccf_hni_nonresi = r0220_expaccf_hni_nonresi;
	}







	public BigDecimal getR0220_expbccf_gres_resi() {
		return r0220_expbccf_gres_resi;
	}







	public void setR0220_expbccf_gres_resi(BigDecimal r0220_expbccf_gres_resi) {
		this.r0220_expbccf_gres_resi = r0220_expbccf_gres_resi;
	}







	public BigDecimal getR0220_expaccf_gres_resi() {
		return r0220_expaccf_gres_resi;
	}







	public void setR0220_expaccf_gres_resi(BigDecimal r0220_expaccf_gres_resi) {
		this.r0220_expaccf_gres_resi = r0220_expaccf_gres_resi;
	}







	public BigDecimal getR0220_expbccf_gres_nonresi() {
		return r0220_expbccf_gres_nonresi;
	}







	public void setR0220_expbccf_gres_nonresi(BigDecimal r0220_expbccf_gres_nonresi) {
		this.r0220_expbccf_gres_nonresi = r0220_expbccf_gres_nonresi;
	}







	public BigDecimal getR0220_expaccf_gres_nonresi() {
		return r0220_expaccf_gres_nonresi;
	}







	public void setR0220_expaccf_gres_nonresi(BigDecimal r0220_expaccf_gres_nonresi) {
		this.r0220_expaccf_gres_nonresi = r0220_expaccf_gres_nonresi;
	}







	public BigDecimal getR0220_expbccf_corp_resi() {
		return r0220_expbccf_corp_resi;
	}







	public void setR0220_expbccf_corp_resi(BigDecimal r0220_expbccf_corp_resi) {
		this.r0220_expbccf_corp_resi = r0220_expbccf_corp_resi;
	}







	public BigDecimal getR0220_expaccf_corp_resi() {
		return r0220_expaccf_corp_resi;
	}







	public void setR0220_expaccf_corp_resi(BigDecimal r0220_expaccf_corp_resi) {
		this.r0220_expaccf_corp_resi = r0220_expaccf_corp_resi;
	}







	public BigDecimal getR0220_expbccf_corp_nonresi() {
		return r0220_expbccf_corp_nonresi;
	}







	public void setR0220_expbccf_corp_nonresi(BigDecimal r0220_expbccf_corp_nonresi) {
		this.r0220_expbccf_corp_nonresi = r0220_expbccf_corp_nonresi;
	}







	public BigDecimal getR0220_expaccf_corp_nonresi() {
		return r0220_expaccf_corp_nonresi;
	}







	public void setR0220_expaccf_corp_nonresi(BigDecimal r0220_expaccf_corp_nonresi) {
		this.r0220_expaccf_corp_nonresi = r0220_expaccf_corp_nonresi;
	}







	public BigDecimal getR0220_expbccf_nbfi_resi() {
		return r0220_expbccf_nbfi_resi;
	}







	public void setR0220_expbccf_nbfi_resi(BigDecimal r0220_expbccf_nbfi_resi) {
		this.r0220_expbccf_nbfi_resi = r0220_expbccf_nbfi_resi;
	}







	public BigDecimal getR0220_expaccf_nbfi_resi() {
		return r0220_expaccf_nbfi_resi;
	}







	public void setR0220_expaccf_nbfi_resi(BigDecimal r0220_expaccf_nbfi_resi) {
		this.r0220_expaccf_nbfi_resi = r0220_expaccf_nbfi_resi;
	}







	public BigDecimal getR0220_expbccf_nbfi_nonresi() {
		return r0220_expbccf_nbfi_nonresi;
	}







	public void setR0220_expbccf_nbfi_nonresi(BigDecimal r0220_expbccf_nbfi_nonresi) {
		this.r0220_expbccf_nbfi_nonresi = r0220_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0220_expaccf_nbfi_nonresi() {
		return r0220_expaccf_nbfi_nonresi;
	}







	public void setR0220_expaccf_nbfi_nonresi(BigDecimal r0220_expaccf_nbfi_nonresi) {
		this.r0220_expaccf_nbfi_nonresi = r0220_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0220_expbccf_bank_resi() {
		return r0220_expbccf_bank_resi;
	}







	public void setR0220_expbccf_bank_resi(BigDecimal r0220_expbccf_bank_resi) {
		this.r0220_expbccf_bank_resi = r0220_expbccf_bank_resi;
	}







	public BigDecimal getR0220_expaccf_bank_resi() {
		return r0220_expaccf_bank_resi;
	}







	public void setR0220_expaccf_bank_resi(BigDecimal r0220_expaccf_bank_resi) {
		this.r0220_expaccf_bank_resi = r0220_expaccf_bank_resi;
	}







	public BigDecimal getR0220_expbccf_bank_nonresi() {
		return r0220_expbccf_bank_nonresi;
	}







	public void setR0220_expbccf_bank_nonresi(BigDecimal r0220_expbccf_bank_nonresi) {
		this.r0220_expbccf_bank_nonresi = r0220_expbccf_bank_nonresi;
	}







	public BigDecimal getR0220_expaccf_bank_nonresi() {
		return r0220_expaccf_bank_nonresi;
	}







	public void setR0220_expaccf_bank_nonresi(BigDecimal r0220_expaccf_bank_nonresi) {
		this.r0220_expaccf_bank_nonresi = r0220_expaccf_bank_nonresi;
	}







	public BigDecimal getR0220_expbccf_gov_resi() {
		return r0220_expbccf_gov_resi;
	}







	public void setR0220_expbccf_gov_resi(BigDecimal r0220_expbccf_gov_resi) {
		this.r0220_expbccf_gov_resi = r0220_expbccf_gov_resi;
	}







	public BigDecimal getR0220_expaccf_gov_resi() {
		return r0220_expaccf_gov_resi;
	}







	public void setR0220_expaccf_gov_resi(BigDecimal r0220_expaccf_gov_resi) {
		this.r0220_expaccf_gov_resi = r0220_expaccf_gov_resi;
	}







	public BigDecimal getR0220_expbccf_gov_nonresi() {
		return r0220_expbccf_gov_nonresi;
	}







	public void setR0220_expbccf_gov_nonresi(BigDecimal r0220_expbccf_gov_nonresi) {
		this.r0220_expbccf_gov_nonresi = r0220_expbccf_gov_nonresi;
	}







	public BigDecimal getR0220_expaccf_gov_nonresi() {
		return r0220_expaccf_gov_nonresi;
	}







	public void setR0220_expaccf_gov_nonresi(BigDecimal r0220_expaccf_gov_nonresi) {
		this.r0220_expaccf_gov_nonresi = r0220_expaccf_gov_nonresi;
	}







	public String getR0230_product() {
		return r0230_product;
	}







	public void setR0230_product(String r0230_product) {
		this.r0230_product = r0230_product;
	}







	public BigDecimal getR0230_expbccf_indiv_resi() {
		return r0230_expbccf_indiv_resi;
	}







	public void setR0230_expbccf_indiv_resi(BigDecimal r0230_expbccf_indiv_resi) {
		this.r0230_expbccf_indiv_resi = r0230_expbccf_indiv_resi;
	}







	public BigDecimal getR0230_expaccf_indiv_resi() {
		return r0230_expaccf_indiv_resi;
	}







	public void setR0230_expaccf_indiv_resi(BigDecimal r0230_expaccf_indiv_resi) {
		this.r0230_expaccf_indiv_resi = r0230_expaccf_indiv_resi;
	}







	public BigDecimal getR0230_expbccf_indiv_nonresi() {
		return r0230_expbccf_indiv_nonresi;
	}







	public void setR0230_expbccf_indiv_nonresi(BigDecimal r0230_expbccf_indiv_nonresi) {
		this.r0230_expbccf_indiv_nonresi = r0230_expbccf_indiv_nonresi;
	}







	public BigDecimal getR0230_expaccf_indiv_nonresi() {
		return r0230_expaccf_indiv_nonresi;
	}







	public void setR0230_expaccf_indiv_nonresi(BigDecimal r0230_expaccf_indiv_nonresi) {
		this.r0230_expaccf_indiv_nonresi = r0230_expaccf_indiv_nonresi;
	}







	public BigDecimal getR0230_expbccf_rsme_resi() {
		return r0230_expbccf_rsme_resi;
	}







	public void setR0230_expbccf_rsme_resi(BigDecimal r0230_expbccf_rsme_resi) {
		this.r0230_expbccf_rsme_resi = r0230_expbccf_rsme_resi;
	}







	public BigDecimal getR0230_expaccf_rsme_resi() {
		return r0230_expaccf_rsme_resi;
	}







	public void setR0230_expaccf_rsme_resi(BigDecimal r0230_expaccf_rsme_resi) {
		this.r0230_expaccf_rsme_resi = r0230_expaccf_rsme_resi;
	}







	public BigDecimal getR0230_expbccf_rsme_nonresi() {
		return r0230_expbccf_rsme_nonresi;
	}







	public void setR0230_expbccf_rsme_nonresi(BigDecimal r0230_expbccf_rsme_nonresi) {
		this.r0230_expbccf_rsme_nonresi = r0230_expbccf_rsme_nonresi;
	}







	public BigDecimal getR0230_expaccf_rsme_nonresi() {
		return r0230_expaccf_rsme_nonresi;
	}







	public void setR0230_expaccf_rsme_nonresi(BigDecimal r0230_expaccf_rsme_nonresi) {
		this.r0230_expaccf_rsme_nonresi = r0230_expaccf_rsme_nonresi;
	}







	public BigDecimal getR0230_expbccf_sme_resi() {
		return r0230_expbccf_sme_resi;
	}







	public void setR0230_expbccf_sme_resi(BigDecimal r0230_expbccf_sme_resi) {
		this.r0230_expbccf_sme_resi = r0230_expbccf_sme_resi;
	}







	public BigDecimal getR0230_expaccf_sme_resi() {
		return r0230_expaccf_sme_resi;
	}







	public void setR0230_expaccf_sme_resi(BigDecimal r0230_expaccf_sme_resi) {
		this.r0230_expaccf_sme_resi = r0230_expaccf_sme_resi;
	}







	public BigDecimal getR0230_expbccf_sme_nonresi() {
		return r0230_expbccf_sme_nonresi;
	}







	public void setR0230_expbccf_sme_nonresi(BigDecimal r0230_expbccf_sme_nonresi) {
		this.r0230_expbccf_sme_nonresi = r0230_expbccf_sme_nonresi;
	}







	public BigDecimal getR0230_expaccf_sme_nonresi() {
		return r0230_expaccf_sme_nonresi;
	}







	public void setR0230_expaccf_sme_nonresi(BigDecimal r0230_expaccf_sme_nonresi) {
		this.r0230_expaccf_sme_nonresi = r0230_expaccf_sme_nonresi;
	}







	public BigDecimal getR0230_expbccf_hni_resi() {
		return r0230_expbccf_hni_resi;
	}







	public void setR0230_expbccf_hni_resi(BigDecimal r0230_expbccf_hni_resi) {
		this.r0230_expbccf_hni_resi = r0230_expbccf_hni_resi;
	}







	public BigDecimal getR0230_expaccf_hni_resi() {
		return r0230_expaccf_hni_resi;
	}







	public void setR0230_expaccf_hni_resi(BigDecimal r0230_expaccf_hni_resi) {
		this.r0230_expaccf_hni_resi = r0230_expaccf_hni_resi;
	}







	public BigDecimal getR0230_expbccf_hni_nonresi() {
		return r0230_expbccf_hni_nonresi;
	}







	public void setR0230_expbccf_hni_nonresi(BigDecimal r0230_expbccf_hni_nonresi) {
		this.r0230_expbccf_hni_nonresi = r0230_expbccf_hni_nonresi;
	}







	public BigDecimal getR0230_expaccf_hni_nonresi() {
		return r0230_expaccf_hni_nonresi;
	}







	public void setR0230_expaccf_hni_nonresi(BigDecimal r0230_expaccf_hni_nonresi) {
		this.r0230_expaccf_hni_nonresi = r0230_expaccf_hni_nonresi;
	}







	public BigDecimal getR0230_expbccf_gres_resi() {
		return r0230_expbccf_gres_resi;
	}







	public void setR0230_expbccf_gres_resi(BigDecimal r0230_expbccf_gres_resi) {
		this.r0230_expbccf_gres_resi = r0230_expbccf_gres_resi;
	}







	public BigDecimal getR0230_expaccf_gres_resi() {
		return r0230_expaccf_gres_resi;
	}







	public void setR0230_expaccf_gres_resi(BigDecimal r0230_expaccf_gres_resi) {
		this.r0230_expaccf_gres_resi = r0230_expaccf_gres_resi;
	}







	public BigDecimal getR0230_expbccf_gres_nonresi() {
		return r0230_expbccf_gres_nonresi;
	}







	public void setR0230_expbccf_gres_nonresi(BigDecimal r0230_expbccf_gres_nonresi) {
		this.r0230_expbccf_gres_nonresi = r0230_expbccf_gres_nonresi;
	}







	public BigDecimal getR0230_expaccf_gres_nonresi() {
		return r0230_expaccf_gres_nonresi;
	}







	public void setR0230_expaccf_gres_nonresi(BigDecimal r0230_expaccf_gres_nonresi) {
		this.r0230_expaccf_gres_nonresi = r0230_expaccf_gres_nonresi;
	}







	public BigDecimal getR0230_expbccf_corp_resi() {
		return r0230_expbccf_corp_resi;
	}







	public void setR0230_expbccf_corp_resi(BigDecimal r0230_expbccf_corp_resi) {
		this.r0230_expbccf_corp_resi = r0230_expbccf_corp_resi;
	}







	public BigDecimal getR0230_expaccf_corp_resi() {
		return r0230_expaccf_corp_resi;
	}







	public void setR0230_expaccf_corp_resi(BigDecimal r0230_expaccf_corp_resi) {
		this.r0230_expaccf_corp_resi = r0230_expaccf_corp_resi;
	}







	public BigDecimal getR0230_expbccf_corp_nonresi() {
		return r0230_expbccf_corp_nonresi;
	}







	public void setR0230_expbccf_corp_nonresi(BigDecimal r0230_expbccf_corp_nonresi) {
		this.r0230_expbccf_corp_nonresi = r0230_expbccf_corp_nonresi;
	}







	public BigDecimal getR0230_expaccf_corp_nonresi() {
		return r0230_expaccf_corp_nonresi;
	}







	public void setR0230_expaccf_corp_nonresi(BigDecimal r0230_expaccf_corp_nonresi) {
		this.r0230_expaccf_corp_nonresi = r0230_expaccf_corp_nonresi;
	}







	public BigDecimal getR0230_expbccf_nbfi_resi() {
		return r0230_expbccf_nbfi_resi;
	}







	public void setR0230_expbccf_nbfi_resi(BigDecimal r0230_expbccf_nbfi_resi) {
		this.r0230_expbccf_nbfi_resi = r0230_expbccf_nbfi_resi;
	}







	public BigDecimal getR0230_expaccf_nbfi_resi() {
		return r0230_expaccf_nbfi_resi;
	}







	public void setR0230_expaccf_nbfi_resi(BigDecimal r0230_expaccf_nbfi_resi) {
		this.r0230_expaccf_nbfi_resi = r0230_expaccf_nbfi_resi;
	}







	public BigDecimal getR0230_expbccf_nbfi_nonresi() {
		return r0230_expbccf_nbfi_nonresi;
	}







	public void setR0230_expbccf_nbfi_nonresi(BigDecimal r0230_expbccf_nbfi_nonresi) {
		this.r0230_expbccf_nbfi_nonresi = r0230_expbccf_nbfi_nonresi;
	}







	public BigDecimal getR0230_expaccf_nbfi_nonresi() {
		return r0230_expaccf_nbfi_nonresi;
	}







	public void setR0230_expaccf_nbfi_nonresi(BigDecimal r0230_expaccf_nbfi_nonresi) {
		this.r0230_expaccf_nbfi_nonresi = r0230_expaccf_nbfi_nonresi;
	}







	public BigDecimal getR0230_expbccf_bank_resi() {
		return r0230_expbccf_bank_resi;
	}







	public void setR0230_expbccf_bank_resi(BigDecimal r0230_expbccf_bank_resi) {
		this.r0230_expbccf_bank_resi = r0230_expbccf_bank_resi;
	}







	public BigDecimal getR0230_expaccf_bank_resi() {
		return r0230_expaccf_bank_resi;
	}







	public void setR0230_expaccf_bank_resi(BigDecimal r0230_expaccf_bank_resi) {
		this.r0230_expaccf_bank_resi = r0230_expaccf_bank_resi;
	}







	public BigDecimal getR0230_expbccf_bank_nonresi() {
		return r0230_expbccf_bank_nonresi;
	}







	public void setR0230_expbccf_bank_nonresi(BigDecimal r0230_expbccf_bank_nonresi) {
		this.r0230_expbccf_bank_nonresi = r0230_expbccf_bank_nonresi;
	}







	public BigDecimal getR0230_expaccf_bank_nonresi() {
		return r0230_expaccf_bank_nonresi;
	}







	public void setR0230_expaccf_bank_nonresi(BigDecimal r0230_expaccf_bank_nonresi) {
		this.r0230_expaccf_bank_nonresi = r0230_expaccf_bank_nonresi;
	}







	public BigDecimal getR0230_expbccf_gov_resi() {
		return r0230_expbccf_gov_resi;
	}







	public void setR0230_expbccf_gov_resi(BigDecimal r0230_expbccf_gov_resi) {
		this.r0230_expbccf_gov_resi = r0230_expbccf_gov_resi;
	}







	public BigDecimal getR0230_expaccf_gov_resi() {
		return r0230_expaccf_gov_resi;
	}







	public void setR0230_expaccf_gov_resi(BigDecimal r0230_expaccf_gov_resi) {
		this.r0230_expaccf_gov_resi = r0230_expaccf_gov_resi;
	}







	public BigDecimal getR0230_expbccf_gov_nonresi() {
		return r0230_expbccf_gov_nonresi;
	}







	public void setR0230_expbccf_gov_nonresi(BigDecimal r0230_expbccf_gov_nonresi) {
		this.r0230_expbccf_gov_nonresi = r0230_expbccf_gov_nonresi;
	}







	public BigDecimal getR0230_expaccf_gov_nonresi() {
		return r0230_expaccf_gov_nonresi;
	}







	public void setR0230_expaccf_gov_nonresi(BigDecimal r0230_expaccf_gov_nonresi) {
		this.r0230_expaccf_gov_nonresi = r0230_expaccf_gov_nonresi;
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







		public CBUAE_BRF5_17_SUMMARY_ENTITY() {
			super();
			// TODO Auto-generated constructor stub
		}		
}











