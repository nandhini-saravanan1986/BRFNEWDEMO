package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CBUAE_BRF2_4_SUMMARYTABLE") 

public class CBUAE_BRF2_4_SUMMARY_ENTITY {
	
	private String r0010_product;
	private String r0020_product;
	private BigDecimal r0020_analy_by_cur_us_dollar;
	private BigDecimal r0020_analy_by_cur_euro;
	private BigDecimal r0020_analy_by_cur_swiss_franc;
	private BigDecimal r0020_analy_by_cur_uk_sterling;
	private BigDecimal r0020_analy_by_cur_chinese_yuan;
	private BigDecimal r0020_analy_by_cur_japanese_yen;
	private BigDecimal r0020_analy_by_cur_bahraini_dinar;
	private BigDecimal r0020_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0020_analy_by_cur_qatari_ryal;
	private BigDecimal r0020_analy_by_cur_saudi_riyal;
	private BigDecimal r0020_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0020_analy_by_cur_oth_indivi_fgn_curr;
	private String r0030_product;
	private BigDecimal r0030_analy_by_cur_us_dollar;
	private BigDecimal r0030_analy_by_cur_euro;
	private BigDecimal r0030_analy_by_cur_swiss_franc;
	private BigDecimal r0030_analy_by_cur_uk_sterling;
	private BigDecimal r0030_analy_by_cur_chinese_yuan;
	private BigDecimal r0030_analy_by_cur_japanese_yen;
	private BigDecimal r0030_analy_by_cur_bahraini_dinar;
	private BigDecimal r0030_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0030_analy_by_cur_qatari_ryal;
	private BigDecimal r0030_analy_by_cur_saudi_riyal;
	private BigDecimal r0030_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0030_analy_by_cur_oth_indivi_fgn_curr;
	private String r0040_product;
	private BigDecimal r0040_analy_by_cur_us_dollar;
	private BigDecimal r0040_analy_by_cur_euro;
	private BigDecimal r0040_analy_by_cur_swiss_franc;
	private BigDecimal r0040_analy_by_cur_uk_sterling;
	private BigDecimal r0040_analy_by_cur_chinese_yuan;
	private BigDecimal r0040_analy_by_cur_japanese_yen;
	private BigDecimal r0040_analy_by_cur_bahraini_dinar;
	private BigDecimal r0040_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0040_analy_by_cur_qatari_ryal;
	private BigDecimal r0040_analy_by_cur_saudi_riyal;
	private BigDecimal r0040_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0040_analy_by_cur_oth_indivi_fgn_curr;
	private String r0050_product;
	private BigDecimal r0050_analy_by_cur_us_dollar;
	private BigDecimal r0050_analy_by_cur_euro;
	private BigDecimal r0050_analy_by_cur_swiss_franc;
	private BigDecimal r0050_analy_by_cur_uk_sterling;
	private BigDecimal r0050_analy_by_cur_chinese_yuan;
	private BigDecimal r0050_analy_by_cur_japanese_yen;
	private BigDecimal r0050_analy_by_cur_bahraini_dinar;
	private BigDecimal r0050_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0050_analy_by_cur_qatari_ryal;
	private BigDecimal r0050_analy_by_cur_saudi_riyal;
	private BigDecimal r0050_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0050_analy_by_cur_oth_indivi_fgn_curr;
	private String r0060_product;
	private BigDecimal r0060_analy_by_cur_us_dollar;
	private BigDecimal r0060_analy_by_cur_euro;
	private BigDecimal r0060_analy_by_cur_swiss_franc;
	private BigDecimal r0060_analy_by_cur_uk_sterling;
	private BigDecimal r0060_analy_by_cur_chinese_yuan;
	private BigDecimal r0060_analy_by_cur_japanese_yen;
	private BigDecimal r0060_analy_by_cur_bahraini_dinar;
	private BigDecimal r0060_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0060_analy_by_cur_qatari_ryal;
	private BigDecimal r0060_analy_by_cur_saudi_riyal;
	private BigDecimal r0060_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0060_analy_by_cur_oth_indivi_fgn_curr;
	private String r0070_product;
	private BigDecimal r0070_analy_by_cur_us_dollar;
	private BigDecimal r0070_analy_by_cur_euro;
	private BigDecimal r0070_analy_by_cur_swiss_franc;
	private BigDecimal r0070_analy_by_cur_uk_sterling;
	private BigDecimal r0070_analy_by_cur_chinese_yuan;
	private BigDecimal r0070_analy_by_cur_japanese_yen;
	private BigDecimal r0070_analy_by_cur_bahraini_dinar;
	private BigDecimal r0070_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0070_analy_by_cur_qatari_ryal;
	private BigDecimal r0070_analy_by_cur_saudi_riyal;
	private BigDecimal r0070_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0070_analy_by_cur_oth_indivi_fgn_curr;
	private String r0080_product;
	private BigDecimal r0080_analy_by_cur_us_dollar;
	private BigDecimal r0080_analy_by_cur_euro;
	private BigDecimal r0080_analy_by_cur_swiss_franc;
	private BigDecimal r0080_analy_by_cur_uk_sterling;
	private BigDecimal r0080_analy_by_cur_chinese_yuan;
	private BigDecimal r0080_analy_by_cur_japanese_yen;
	private BigDecimal r0080_analy_by_cur_bahraini_dinar;
	private BigDecimal r0080_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0080_analy_by_cur_qatari_ryal;
	private BigDecimal r0080_analy_by_cur_saudi_riyal;
	private BigDecimal r0080_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0080_analy_by_cur_oth_indivi_fgn_curr;
	private String r0090_product;
	private BigDecimal r0090_analy_by_cur_us_dollar;
	private BigDecimal r0090_analy_by_cur_euro;
	private BigDecimal r0090_analy_by_cur_swiss_franc;
	private BigDecimal r0090_analy_by_cur_uk_sterling;
	private BigDecimal r0090_analy_by_cur_chinese_yuan;
	private BigDecimal r0090_analy_by_cur_japanese_yen;
	private BigDecimal r0090_analy_by_cur_bahraini_dinar;
	private BigDecimal r0090_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0090_analy_by_cur_qatari_ryal;
	private BigDecimal r0090_analy_by_cur_saudi_riyal;
	private BigDecimal r0090_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0090_analy_by_cur_oth_indivi_fgn_curr;
	private String r0100_product;
	private BigDecimal r0100_analy_by_cur_us_dollar;
	private BigDecimal r0100_analy_by_cur_euro;
	private BigDecimal r0100_analy_by_cur_swiss_franc;
	private BigDecimal r0100_analy_by_cur_uk_sterling;
	private BigDecimal r0100_analy_by_cur_chinese_yuan;
	private BigDecimal r0100_analy_by_cur_japanese_yen;
	private BigDecimal r0100_analy_by_cur_bahraini_dinar;
	private BigDecimal r0100_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0100_analy_by_cur_qatari_ryal;
	private BigDecimal r0100_analy_by_cur_saudi_riyal;
	private BigDecimal r0100_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0100_analy_by_cur_oth_indivi_fgn_curr;
	private String r0110_product;
	private BigDecimal r0110_analy_by_cur_us_dollar;
	private BigDecimal r0110_analy_by_cur_euro;
	private BigDecimal r0110_analy_by_cur_swiss_franc;
	private BigDecimal r0110_analy_by_cur_uk_sterling;
	private BigDecimal r0110_analy_by_cur_chinese_yuan;
	private BigDecimal r0110_analy_by_cur_japanese_yen;
	private BigDecimal r0110_analy_by_cur_bahraini_dinar;
	private BigDecimal r0110_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0110_analy_by_cur_qatari_ryal;
	private BigDecimal r0110_analy_by_cur_saudi_riyal;
	private BigDecimal r0110_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0110_analy_by_cur_oth_indivi_fgn_curr;
	private String r0120_product;
	private BigDecimal r0120_analy_by_cur_us_dollar;
	private BigDecimal r0120_analy_by_cur_euro;
	private BigDecimal r0120_analy_by_cur_swiss_franc;
	private BigDecimal r0120_analy_by_cur_uk_sterling;
	private BigDecimal r0120_analy_by_cur_chinese_yuan;
	private BigDecimal r0120_analy_by_cur_japanese_yen;
	private BigDecimal r0120_analy_by_cur_bahraini_dinar;
	private BigDecimal r0120_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0120_analy_by_cur_qatari_ryal;
	private BigDecimal r0120_analy_by_cur_saudi_riyal;
	private BigDecimal r0120_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0120_analy_by_cur_oth_indivi_fgn_curr;
	private String r0130_product;
	private BigDecimal r0130_analy_by_cur_us_dollar;
	private BigDecimal r0130_analy_by_cur_euro;
	private BigDecimal r0130_analy_by_cur_swiss_franc;
	private BigDecimal r0130_analy_by_cur_uk_sterling;
	private BigDecimal r0130_analy_by_cur_chinese_yuan;
	private BigDecimal r0130_analy_by_cur_japanese_yen;
	private BigDecimal r0130_analy_by_cur_bahraini_dinar;
	private BigDecimal r0130_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0130_analy_by_cur_qatari_ryal;
	private BigDecimal r0130_analy_by_cur_saudi_riyal;
	private BigDecimal r0130_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0130_analy_by_cur_oth_indivi_fgn_curr;
	private String r0140_product;
	private BigDecimal r0140_analy_by_cur_us_dollar;
	private BigDecimal r0140_analy_by_cur_euro;
	private BigDecimal r0140_analy_by_cur_swiss_franc;
	private BigDecimal r0140_analy_by_cur_uk_sterling;
	private BigDecimal r0140_analy_by_cur_chinese_yuan;
	private BigDecimal r0140_analy_by_cur_japanese_yen;
	private BigDecimal r0140_analy_by_cur_bahraini_dinar;
	private BigDecimal r0140_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0140_analy_by_cur_qatari_ryal;
	private BigDecimal r0140_analy_by_cur_saudi_riyal;
	private BigDecimal r0140_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0140_analy_by_cur_oth_indivi_fgn_curr;
	private String r0150_product;
	private BigDecimal r0150_analy_by_cur_us_dollar;
	private BigDecimal r0150_analy_by_cur_euro;
	private BigDecimal r0150_analy_by_cur_swiss_franc;
	private BigDecimal r0150_analy_by_cur_uk_sterling;
	private BigDecimal r0150_analy_by_cur_chinese_yuan;
	private BigDecimal r0150_analy_by_cur_japanese_yen;
	private BigDecimal r0150_analy_by_cur_bahraini_dinar;
	private BigDecimal r0150_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0150_analy_by_cur_qatari_ryal;
	private BigDecimal r0150_analy_by_cur_saudi_riyal;
	private BigDecimal r0150_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0150_analy_by_cur_oth_indivi_fgn_curr;
	private String r0160_product;
	private BigDecimal r0160_analy_by_cur_us_dollar;
	private BigDecimal r0160_analy_by_cur_euro;
	private BigDecimal r0160_analy_by_cur_swiss_franc;
	private BigDecimal r0160_analy_by_cur_uk_sterling;
	private BigDecimal r0160_analy_by_cur_chinese_yuan;
	private BigDecimal r0160_analy_by_cur_japanese_yen;
	private BigDecimal r0160_analy_by_cur_bahraini_dinar;
	private BigDecimal r0160_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0160_analy_by_cur_qatari_ryal;
	private BigDecimal r0160_analy_by_cur_saudi_riyal;
	private BigDecimal r0160_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0160_analy_by_cur_oth_indivi_fgn_curr;
	private String r0170_product;
	private BigDecimal r0170_analy_by_cur_us_dollar;
	private BigDecimal r0170_analy_by_cur_euro;
	private BigDecimal r0170_analy_by_cur_swiss_franc;
	private BigDecimal r0170_analy_by_cur_uk_sterling;
	private BigDecimal r0170_analy_by_cur_chinese_yuan;
	private BigDecimal r0170_analy_by_cur_japanese_yen;
	private BigDecimal r0170_analy_by_cur_bahraini_dinar;
	private BigDecimal r0170_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0170_analy_by_cur_qatari_ryal;
	private BigDecimal r0170_analy_by_cur_saudi_riyal;
	private BigDecimal r0170_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0170_analy_by_cur_oth_indivi_fgn_curr;
	private String r0180_product;
	private BigDecimal r0180_analy_by_cur_us_dollar;
	private BigDecimal r0180_analy_by_cur_euro;
	private BigDecimal r0180_analy_by_cur_swiss_franc;
	private BigDecimal r0180_analy_by_cur_uk_sterling;
	private BigDecimal r0180_analy_by_cur_chinese_yuan;
	private BigDecimal r0180_analy_by_cur_japanese_yen;
	private BigDecimal r0180_analy_by_cur_bahraini_dinar;
	private BigDecimal r0180_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0180_analy_by_cur_qatari_ryal;
	private BigDecimal r0180_analy_by_cur_saudi_riyal;
	private BigDecimal r0180_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0180_analy_by_cur_oth_indivi_fgn_curr;
	private String r0190_product;
	private BigDecimal r0190_analy_by_cur_us_dollar;
	private BigDecimal r0190_analy_by_cur_euro;
	private BigDecimal r0190_analy_by_cur_swiss_franc;
	private BigDecimal r0190_analy_by_cur_uk_sterling;
	private BigDecimal r0190_analy_by_cur_chinese_yuan;
	private BigDecimal r0190_analy_by_cur_japanese_yen;
	private BigDecimal r0190_analy_by_cur_bahraini_dinar;
	private BigDecimal r0190_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0190_analy_by_cur_qatari_ryal;
	private BigDecimal r0190_analy_by_cur_saudi_riyal;
	private BigDecimal r0190_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0190_analy_by_cur_oth_indivi_fgn_curr;
	private String r0200_product;
	private String r0210_product;
	private BigDecimal r0210_analy_by_cur_us_dollar;
	private BigDecimal r0210_analy_by_cur_euro;
	private BigDecimal r0210_analy_by_cur_swiss_franc;
	private BigDecimal r0210_analy_by_cur_uk_sterling;
	private BigDecimal r0210_analy_by_cur_chinese_yuan;
	private BigDecimal r0210_analy_by_cur_japanese_yen;
	private BigDecimal r0210_analy_by_cur_bahraini_dinar;
	private BigDecimal r0210_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0210_analy_by_cur_qatari_ryal;
	private BigDecimal r0210_analy_by_cur_saudi_riyal;
	private BigDecimal r0210_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0210_analy_by_cur_oth_indivi_fgn_curr;
	private String r0220_product;
	private BigDecimal r0220_analy_by_cur_us_dollar;
	private BigDecimal r0220_analy_by_cur_euro;
	private BigDecimal r0220_analy_by_cur_swiss_franc;
	private BigDecimal r0220_analy_by_cur_uk_sterling;
	private BigDecimal r0220_analy_by_cur_chinese_yuan;
	private BigDecimal r0220_analy_by_cur_japanese_yen;
	private BigDecimal r0220_analy_by_cur_bahraini_dinar;
	private BigDecimal r0220_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0220_analy_by_cur_qatari_ryal;
	private BigDecimal r0220_analy_by_cur_saudi_riyal;
	private BigDecimal r0220_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0220_analy_by_cur_oth_indivi_fgn_curr;
	private String r0230_product;
	private BigDecimal r0230_analy_by_cur_us_dollar;
	private BigDecimal r0230_analy_by_cur_euro;
	private BigDecimal r0230_analy_by_cur_swiss_franc;
	private BigDecimal r0230_analy_by_cur_uk_sterling;
	private BigDecimal r0230_analy_by_cur_chinese_yuan;
	private BigDecimal r0230_analy_by_cur_japanese_yen;
	private BigDecimal r0230_analy_by_cur_bahraini_dinar;
	private BigDecimal r0230_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0230_analy_by_cur_qatari_ryal;
	private BigDecimal r0230_analy_by_cur_saudi_riyal;
	private BigDecimal r0230_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0230_analy_by_cur_oth_indivi_fgn_curr;
	private String r0240_product;
	private BigDecimal r0240_analy_by_cur_us_dollar;
	private BigDecimal r0240_analy_by_cur_euro;
	private BigDecimal r0240_analy_by_cur_swiss_franc;
	private BigDecimal r0240_analy_by_cur_uk_sterling;
	private BigDecimal r0240_analy_by_cur_chinese_yuan;
	private BigDecimal r0240_analy_by_cur_japanese_yen;
	private BigDecimal r0240_analy_by_cur_bahraini_dinar;
	private BigDecimal r0240_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0240_analy_by_cur_qatari_ryal;
	private BigDecimal r0240_analy_by_cur_saudi_riyal;
	private BigDecimal r0240_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0240_analy_by_cur_oth_indivi_fgn_curr;
	private String r0250_product;
	private BigDecimal r0250_analy_by_cur_us_dollar;
	private BigDecimal r0250_analy_by_cur_euro;
	private BigDecimal r0250_analy_by_cur_swiss_franc;
	private BigDecimal r0250_analy_by_cur_uk_sterling;
	private BigDecimal r0250_analy_by_cur_chinese_yuan;
	private BigDecimal r0250_analy_by_cur_japanese_yen;
	private BigDecimal r0250_analy_by_cur_bahraini_dinar;
	private BigDecimal r0250_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0250_analy_by_cur_qatari_ryal;
	private BigDecimal r0250_analy_by_cur_saudi_riyal;
	private BigDecimal r0250_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0250_analy_by_cur_oth_indivi_fgn_curr;
	private String r0260_product;
	private BigDecimal r0260_analy_by_cur_us_dollar;
	private BigDecimal r0260_analy_by_cur_euro;
	private BigDecimal r0260_analy_by_cur_swiss_franc;
	private BigDecimal r0260_analy_by_cur_uk_sterling;
	private BigDecimal r0260_analy_by_cur_chinese_yuan;
	private BigDecimal r0260_analy_by_cur_japanese_yen;
	private BigDecimal r0260_analy_by_cur_bahraini_dinar;
	private BigDecimal r0260_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0260_analy_by_cur_qatari_ryal;
	private BigDecimal r0260_analy_by_cur_saudi_riyal;
	private BigDecimal r0260_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0260_analy_by_cur_oth_indivi_fgn_curr;
	private String r0270_product;
	private BigDecimal r0270_analy_by_cur_us_dollar;
	private BigDecimal r0270_analy_by_cur_euro;
	private BigDecimal r0270_analy_by_cur_swiss_franc;
	private BigDecimal r0270_analy_by_cur_uk_sterling;
	private BigDecimal r0270_analy_by_cur_chinese_yuan;
	private BigDecimal r0270_analy_by_cur_japanese_yen;
	private BigDecimal r0270_analy_by_cur_bahraini_dinar;
	private BigDecimal r0270_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0270_analy_by_cur_qatari_ryal;
	private BigDecimal r0270_analy_by_cur_saudi_riyal;
	private BigDecimal r0270_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0270_analy_by_cur_oth_indivi_fgn_curr;
	private String r0280_product;
	private BigDecimal r0280_analy_by_cur_us_dollar;
	private BigDecimal r0280_analy_by_cur_euro;
	private BigDecimal r0280_analy_by_cur_swiss_franc;
	private BigDecimal r0280_analy_by_cur_uk_sterling;
	private BigDecimal r0280_analy_by_cur_chinese_yuan;
	private BigDecimal r0280_analy_by_cur_japanese_yen;
	private BigDecimal r0280_analy_by_cur_bahraini_dinar;
	private BigDecimal r0280_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0280_analy_by_cur_qatari_ryal;
	private BigDecimal r0280_analy_by_cur_saudi_riyal;
	private BigDecimal r0280_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0280_analy_by_cur_oth_indivi_fgn_curr;
	private String r0290_product;
	private BigDecimal r0290_analy_by_cur_us_dollar;
	private BigDecimal r0290_analy_by_cur_euro;
	private BigDecimal r0290_analy_by_cur_swiss_franc;
	private BigDecimal r0290_analy_by_cur_uk_sterling;
	private BigDecimal r0290_analy_by_cur_chinese_yuan;
	private BigDecimal r0290_analy_by_cur_japanese_yen;
	private BigDecimal r0290_analy_by_cur_bahraini_dinar;
	private BigDecimal r0290_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0290_analy_by_cur_qatari_ryal;
	private BigDecimal r0290_analy_by_cur_saudi_riyal;
	private BigDecimal r0290_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0290_analy_by_cur_oth_indivi_fgn_curr;
	private String r0300_product;
	private BigDecimal r0300_analy_by_cur_us_dollar;
	private BigDecimal r0300_analy_by_cur_euro;
	private BigDecimal r0300_analy_by_cur_swiss_franc;
	private BigDecimal r0300_analy_by_cur_uk_sterling;
	private BigDecimal r0300_analy_by_cur_chinese_yuan;
	private BigDecimal r0300_analy_by_cur_japanese_yen;
	private BigDecimal r0300_analy_by_cur_bahraini_dinar;
	private BigDecimal r0300_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0300_analy_by_cur_qatari_ryal;
	private BigDecimal r0300_analy_by_cur_saudi_riyal;
	private BigDecimal r0300_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0300_analy_by_cur_oth_indivi_fgn_curr;
	private String r0310_product;
	private BigDecimal r0310_analy_by_cur_us_dollar;
	private BigDecimal r0310_analy_by_cur_euro;
	private BigDecimal r0310_analy_by_cur_swiss_franc;
	private BigDecimal r0310_analy_by_cur_uk_sterling;
	private BigDecimal r0310_analy_by_cur_chinese_yuan;
	private BigDecimal r0310_analy_by_cur_japanese_yen;
	private BigDecimal r0310_analy_by_cur_bahraini_dinar;
	private BigDecimal r0310_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0310_analy_by_cur_qatari_ryal;
	private BigDecimal r0310_analy_by_cur_saudi_riyal;
	private BigDecimal r0310_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0310_analy_by_cur_oth_indivi_fgn_curr;
	private String r0320_product;
	private BigDecimal r0320_analy_by_cur_us_dollar;
	private BigDecimal r0320_analy_by_cur_euro;
	private BigDecimal r0320_analy_by_cur_swiss_franc;
	private BigDecimal r0320_analy_by_cur_uk_sterling;
	private BigDecimal r0320_analy_by_cur_chinese_yuan;
	private BigDecimal r0320_analy_by_cur_japanese_yen;
	private BigDecimal r0320_analy_by_cur_bahraini_dinar;
	private BigDecimal r0320_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0320_analy_by_cur_qatari_ryal;
	private BigDecimal r0320_analy_by_cur_saudi_riyal;
	private BigDecimal r0320_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0320_analy_by_cur_oth_indivi_fgn_curr;
	private String r0330_product;
	private BigDecimal r0330_analy_by_cur_us_dollar;
	private BigDecimal r0330_analy_by_cur_euro;
	private BigDecimal r0330_analy_by_cur_swiss_franc;
	private BigDecimal r0330_analy_by_cur_uk_sterling;
	private BigDecimal r0330_analy_by_cur_chinese_yuan;
	private BigDecimal r0330_analy_by_cur_japanese_yen;
	private BigDecimal r0330_analy_by_cur_bahraini_dinar;
	private BigDecimal r0330_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0330_analy_by_cur_qatari_ryal;
	private BigDecimal r0330_analy_by_cur_saudi_riyal;
	private BigDecimal r0330_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0330_analy_by_cur_oth_indivi_fgn_curr;
	private String r0340_product;
	private BigDecimal r0340_analy_by_cur_us_dollar;
	private BigDecimal r0340_analy_by_cur_euro;
	private BigDecimal r0340_analy_by_cur_swiss_franc;
	private BigDecimal r0340_analy_by_cur_uk_sterling;
	private BigDecimal r0340_analy_by_cur_chinese_yuan;
	private BigDecimal r0340_analy_by_cur_japanese_yen;
	private BigDecimal r0340_analy_by_cur_bahraini_dinar;
	private BigDecimal r0340_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0340_analy_by_cur_qatari_ryal;
	private BigDecimal r0340_analy_by_cur_saudi_riyal;
	private BigDecimal r0340_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0340_analy_by_cur_oth_indivi_fgn_curr;
	private String r0350_product;
	private BigDecimal r0350_analy_by_cur_us_dollar;
	private BigDecimal r0350_analy_by_cur_euro;
	private BigDecimal r0350_analy_by_cur_swiss_franc;
	private BigDecimal r0350_analy_by_cur_uk_sterling;
	private BigDecimal r0350_analy_by_cur_chinese_yuan;
	private BigDecimal r0350_analy_by_cur_japanese_yen;
	private BigDecimal r0350_analy_by_cur_bahraini_dinar;
	private BigDecimal r0350_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0350_analy_by_cur_qatari_ryal;
	private BigDecimal r0350_analy_by_cur_saudi_riyal;
	private BigDecimal r0350_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0350_analy_by_cur_oth_indivi_fgn_curr;
	private String r0360_product;
	private BigDecimal r0360_analy_by_cur_us_dollar;
	private BigDecimal r0360_analy_by_cur_euro;
	private BigDecimal r0360_analy_by_cur_swiss_franc;
	private BigDecimal r0360_analy_by_cur_uk_sterling;
	private BigDecimal r0360_analy_by_cur_chinese_yuan;
	private BigDecimal r0360_analy_by_cur_japanese_yen;
	private BigDecimal r0360_analy_by_cur_bahraini_dinar;
	private BigDecimal r0360_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0360_analy_by_cur_qatari_ryal;
	private BigDecimal r0360_analy_by_cur_saudi_riyal;
	private BigDecimal r0360_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0360_analy_by_cur_oth_indivi_fgn_curr;
	private String r0370_product;
	private BigDecimal r0370_analy_by_cur_us_dollar;
	private BigDecimal r0370_analy_by_cur_euro;
	private BigDecimal r0370_analy_by_cur_swiss_franc;
	private BigDecimal r0370_analy_by_cur_uk_sterling;
	private BigDecimal r0370_analy_by_cur_chinese_yuan;
	private BigDecimal r0370_analy_by_cur_japanese_yen;
	private BigDecimal r0370_analy_by_cur_bahraini_dinar;
	private BigDecimal r0370_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0370_analy_by_cur_qatari_ryal;
	private BigDecimal r0370_analy_by_cur_saudi_riyal;
	private BigDecimal r0370_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0370_analy_by_cur_oth_indivi_fgn_curr;
	private String r0380_product;
	private BigDecimal r0380_analy_by_cur_us_dollar;
	private BigDecimal r0380_analy_by_cur_euro;
	private BigDecimal r0380_analy_by_cur_swiss_franc;
	private BigDecimal r0380_analy_by_cur_uk_sterling;
	private BigDecimal r0380_analy_by_cur_chinese_yuan;
	private BigDecimal r0380_analy_by_cur_japanese_yen;
	private BigDecimal r0380_analy_by_cur_bahraini_dinar;
	private BigDecimal r0380_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0380_analy_by_cur_qatari_ryal;
	private BigDecimal r0380_analy_by_cur_saudi_riyal;
	private BigDecimal r0380_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0380_analy_by_cur_oth_indivi_fgn_curr;
	private String r0390_product;
	private String r0400_product;
	private BigDecimal r0400_analy_by_cur_us_dollar;
	private BigDecimal r0400_analy_by_cur_euro;
	private BigDecimal r0400_analy_by_cur_swiss_franc;
	private BigDecimal r0400_analy_by_cur_uk_sterling;
	private BigDecimal r0400_analy_by_cur_chinese_yuan;
	private BigDecimal r0400_analy_by_cur_japanese_yen;
	private BigDecimal r0400_analy_by_cur_bahraini_dinar;
	private BigDecimal r0400_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0400_analy_by_cur_qatari_ryal;
	private BigDecimal r0400_analy_by_cur_saudi_riyal;
	private BigDecimal r0400_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0400_analy_by_cur_oth_indivi_fgn_curr;
	private String r0410_product;
	private String r0420_product;
	private BigDecimal r0420_analy_by_cur_us_dollar;
	private BigDecimal r0420_analy_by_cur_euro;
	private BigDecimal r0420_analy_by_cur_swiss_franc;
	private BigDecimal r0420_analy_by_cur_uk_sterling;
	private BigDecimal r0420_analy_by_cur_chinese_yuan;
	private BigDecimal r0420_analy_by_cur_japanese_yen;
	private BigDecimal r0420_analy_by_cur_bahraini_dinar;
	private BigDecimal r0420_analy_by_cur_kuwaiti_dinar;
	private BigDecimal r0420_analy_by_cur_qatari_ryal;
	private BigDecimal r0420_analy_by_cur_saudi_riyal;
	private BigDecimal r0420_analy_by_cur_other_fgn_currencies;
	private BigDecimal r0420_analy_by_cur_oth_indivi_fgn_curr;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date report_date;
	private String report_version;
	private String report_frequency;
	private String report_code;
	private String report_desc;
	private String modify_flg;
	private String entity_flg;
	private String delete_flg;
	
	
	
	public String getR0010_product() {
		return r0010_product;
	}
	public void setR0010_product(String r0010_product) {
		this.r0010_product = r0010_product;
	}
	public String getR0020_product() {
		return r0020_product;
	}
	public void setR0020_product(String r0020_product) {
		this.r0020_product = r0020_product;
	}
	public BigDecimal getR0020_analy_by_cur_us_dollar() {
		return r0020_analy_by_cur_us_dollar;
	}
	public void setR0020_analy_by_cur_us_dollar(BigDecimal r0020_analy_by_cur_us_dollar) {
		this.r0020_analy_by_cur_us_dollar = r0020_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0020_analy_by_cur_euro() {
		return r0020_analy_by_cur_euro;
	}
	public void setR0020_analy_by_cur_euro(BigDecimal r0020_analy_by_cur_euro) {
		this.r0020_analy_by_cur_euro = r0020_analy_by_cur_euro;
	}
	public BigDecimal getR0020_analy_by_cur_swiss_franc() {
		return r0020_analy_by_cur_swiss_franc;
	}
	public void setR0020_analy_by_cur_swiss_franc(BigDecimal r0020_analy_by_cur_swiss_franc) {
		this.r0020_analy_by_cur_swiss_franc = r0020_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0020_analy_by_cur_uk_sterling() {
		return r0020_analy_by_cur_uk_sterling;
	}
	public void setR0020_analy_by_cur_uk_sterling(BigDecimal r0020_analy_by_cur_uk_sterling) {
		this.r0020_analy_by_cur_uk_sterling = r0020_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0020_analy_by_cur_chinese_yuan() {
		return r0020_analy_by_cur_chinese_yuan;
	}
	public void setR0020_analy_by_cur_chinese_yuan(BigDecimal r0020_analy_by_cur_chinese_yuan) {
		this.r0020_analy_by_cur_chinese_yuan = r0020_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0020_analy_by_cur_japanese_yen() {
		return r0020_analy_by_cur_japanese_yen;
	}
	public void setR0020_analy_by_cur_japanese_yen(BigDecimal r0020_analy_by_cur_japanese_yen) {
		this.r0020_analy_by_cur_japanese_yen = r0020_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0020_analy_by_cur_bahraini_dinar() {
		return r0020_analy_by_cur_bahraini_dinar;
	}
	public void setR0020_analy_by_cur_bahraini_dinar(BigDecimal r0020_analy_by_cur_bahraini_dinar) {
		this.r0020_analy_by_cur_bahraini_dinar = r0020_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0020_analy_by_cur_kuwaiti_dinar() {
		return r0020_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0020_analy_by_cur_kuwaiti_dinar(BigDecimal r0020_analy_by_cur_kuwaiti_dinar) {
		this.r0020_analy_by_cur_kuwaiti_dinar = r0020_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0020_analy_by_cur_qatari_ryal() {
		return r0020_analy_by_cur_qatari_ryal;
	}
	public void setR0020_analy_by_cur_qatari_ryal(BigDecimal r0020_analy_by_cur_qatari_ryal) {
		this.r0020_analy_by_cur_qatari_ryal = r0020_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0020_analy_by_cur_saudi_riyal() {
		return r0020_analy_by_cur_saudi_riyal;
	}
	public void setR0020_analy_by_cur_saudi_riyal(BigDecimal r0020_analy_by_cur_saudi_riyal) {
		this.r0020_analy_by_cur_saudi_riyal = r0020_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0020_analy_by_cur_other_fgn_currencies() {
		return r0020_analy_by_cur_other_fgn_currencies;
	}
	public void setR0020_analy_by_cur_other_fgn_currencies(BigDecimal r0020_analy_by_cur_other_fgn_currencies) {
		this.r0020_analy_by_cur_other_fgn_currencies = r0020_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0020_analy_by_cur_oth_indivi_fgn_curr() {
		return r0020_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0020_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0020_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0020_analy_by_cur_oth_indivi_fgn_curr = r0020_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0030_product() {
		return r0030_product;
	}
	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}
	public BigDecimal getR0030_analy_by_cur_us_dollar() {
		return r0030_analy_by_cur_us_dollar;
	}
	public void setR0030_analy_by_cur_us_dollar(BigDecimal r0030_analy_by_cur_us_dollar) {
		this.r0030_analy_by_cur_us_dollar = r0030_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0030_analy_by_cur_euro() {
		return r0030_analy_by_cur_euro;
	}
	public void setR0030_analy_by_cur_euro(BigDecimal r0030_analy_by_cur_euro) {
		this.r0030_analy_by_cur_euro = r0030_analy_by_cur_euro;
	}
	public BigDecimal getR0030_analy_by_cur_swiss_franc() {
		return r0030_analy_by_cur_swiss_franc;
	}
	public void setR0030_analy_by_cur_swiss_franc(BigDecimal r0030_analy_by_cur_swiss_franc) {
		this.r0030_analy_by_cur_swiss_franc = r0030_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0030_analy_by_cur_uk_sterling() {
		return r0030_analy_by_cur_uk_sterling;
	}
	public void setR0030_analy_by_cur_uk_sterling(BigDecimal r0030_analy_by_cur_uk_sterling) {
		this.r0030_analy_by_cur_uk_sterling = r0030_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0030_analy_by_cur_chinese_yuan() {
		return r0030_analy_by_cur_chinese_yuan;
	}
	public void setR0030_analy_by_cur_chinese_yuan(BigDecimal r0030_analy_by_cur_chinese_yuan) {
		this.r0030_analy_by_cur_chinese_yuan = r0030_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0030_analy_by_cur_japanese_yen() {
		return r0030_analy_by_cur_japanese_yen;
	}
	public void setR0030_analy_by_cur_japanese_yen(BigDecimal r0030_analy_by_cur_japanese_yen) {
		this.r0030_analy_by_cur_japanese_yen = r0030_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0030_analy_by_cur_bahraini_dinar() {
		return r0030_analy_by_cur_bahraini_dinar;
	}
	public void setR0030_analy_by_cur_bahraini_dinar(BigDecimal r0030_analy_by_cur_bahraini_dinar) {
		this.r0030_analy_by_cur_bahraini_dinar = r0030_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0030_analy_by_cur_kuwaiti_dinar() {
		return r0030_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0030_analy_by_cur_kuwaiti_dinar(BigDecimal r0030_analy_by_cur_kuwaiti_dinar) {
		this.r0030_analy_by_cur_kuwaiti_dinar = r0030_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0030_analy_by_cur_qatari_ryal() {
		return r0030_analy_by_cur_qatari_ryal;
	}
	public void setR0030_analy_by_cur_qatari_ryal(BigDecimal r0030_analy_by_cur_qatari_ryal) {
		this.r0030_analy_by_cur_qatari_ryal = r0030_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0030_analy_by_cur_saudi_riyal() {
		return r0030_analy_by_cur_saudi_riyal;
	}
	public void setR0030_analy_by_cur_saudi_riyal(BigDecimal r0030_analy_by_cur_saudi_riyal) {
		this.r0030_analy_by_cur_saudi_riyal = r0030_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0030_analy_by_cur_other_fgn_currencies() {
		return r0030_analy_by_cur_other_fgn_currencies;
	}
	public void setR0030_analy_by_cur_other_fgn_currencies(BigDecimal r0030_analy_by_cur_other_fgn_currencies) {
		this.r0030_analy_by_cur_other_fgn_currencies = r0030_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0030_analy_by_cur_oth_indivi_fgn_curr() {
		return r0030_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0030_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0030_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0030_analy_by_cur_oth_indivi_fgn_curr = r0030_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0040_product() {
		return r0040_product;
	}
	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}
	public BigDecimal getR0040_analy_by_cur_us_dollar() {
		return r0040_analy_by_cur_us_dollar;
	}
	public void setR0040_analy_by_cur_us_dollar(BigDecimal r0040_analy_by_cur_us_dollar) {
		this.r0040_analy_by_cur_us_dollar = r0040_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0040_analy_by_cur_euro() {
		return r0040_analy_by_cur_euro;
	}
	public void setR0040_analy_by_cur_euro(BigDecimal r0040_analy_by_cur_euro) {
		this.r0040_analy_by_cur_euro = r0040_analy_by_cur_euro;
	}
	public BigDecimal getR0040_analy_by_cur_swiss_franc() {
		return r0040_analy_by_cur_swiss_franc;
	}
	public void setR0040_analy_by_cur_swiss_franc(BigDecimal r0040_analy_by_cur_swiss_franc) {
		this.r0040_analy_by_cur_swiss_franc = r0040_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0040_analy_by_cur_uk_sterling() {
		return r0040_analy_by_cur_uk_sterling;
	}
	public void setR0040_analy_by_cur_uk_sterling(BigDecimal r0040_analy_by_cur_uk_sterling) {
		this.r0040_analy_by_cur_uk_sterling = r0040_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0040_analy_by_cur_chinese_yuan() {
		return r0040_analy_by_cur_chinese_yuan;
	}
	public void setR0040_analy_by_cur_chinese_yuan(BigDecimal r0040_analy_by_cur_chinese_yuan) {
		this.r0040_analy_by_cur_chinese_yuan = r0040_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0040_analy_by_cur_japanese_yen() {
		return r0040_analy_by_cur_japanese_yen;
	}
	public void setR0040_analy_by_cur_japanese_yen(BigDecimal r0040_analy_by_cur_japanese_yen) {
		this.r0040_analy_by_cur_japanese_yen = r0040_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0040_analy_by_cur_bahraini_dinar() {
		return r0040_analy_by_cur_bahraini_dinar;
	}
	public void setR0040_analy_by_cur_bahraini_dinar(BigDecimal r0040_analy_by_cur_bahraini_dinar) {
		this.r0040_analy_by_cur_bahraini_dinar = r0040_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0040_analy_by_cur_kuwaiti_dinar() {
		return r0040_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0040_analy_by_cur_kuwaiti_dinar(BigDecimal r0040_analy_by_cur_kuwaiti_dinar) {
		this.r0040_analy_by_cur_kuwaiti_dinar = r0040_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0040_analy_by_cur_qatari_ryal() {
		return r0040_analy_by_cur_qatari_ryal;
	}
	public void setR0040_analy_by_cur_qatari_ryal(BigDecimal r0040_analy_by_cur_qatari_ryal) {
		this.r0040_analy_by_cur_qatari_ryal = r0040_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0040_analy_by_cur_saudi_riyal() {
		return r0040_analy_by_cur_saudi_riyal;
	}
	public void setR0040_analy_by_cur_saudi_riyal(BigDecimal r0040_analy_by_cur_saudi_riyal) {
		this.r0040_analy_by_cur_saudi_riyal = r0040_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0040_analy_by_cur_other_fgn_currencies() {
		return r0040_analy_by_cur_other_fgn_currencies;
	}
	public void setR0040_analy_by_cur_other_fgn_currencies(BigDecimal r0040_analy_by_cur_other_fgn_currencies) {
		this.r0040_analy_by_cur_other_fgn_currencies = r0040_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0040_analy_by_cur_oth_indivi_fgn_curr() {
		return r0040_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0040_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0040_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0040_analy_by_cur_oth_indivi_fgn_curr = r0040_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0050_product() {
		return r0050_product;
	}
	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}
	public BigDecimal getR0050_analy_by_cur_us_dollar() {
		return r0050_analy_by_cur_us_dollar;
	}
	public void setR0050_analy_by_cur_us_dollar(BigDecimal r0050_analy_by_cur_us_dollar) {
		this.r0050_analy_by_cur_us_dollar = r0050_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0050_analy_by_cur_euro() {
		return r0050_analy_by_cur_euro;
	}
	public void setR0050_analy_by_cur_euro(BigDecimal r0050_analy_by_cur_euro) {
		this.r0050_analy_by_cur_euro = r0050_analy_by_cur_euro;
	}
	public BigDecimal getR0050_analy_by_cur_swiss_franc() {
		return r0050_analy_by_cur_swiss_franc;
	}
	public void setR0050_analy_by_cur_swiss_franc(BigDecimal r0050_analy_by_cur_swiss_franc) {
		this.r0050_analy_by_cur_swiss_franc = r0050_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0050_analy_by_cur_uk_sterling() {
		return r0050_analy_by_cur_uk_sterling;
	}
	public void setR0050_analy_by_cur_uk_sterling(BigDecimal r0050_analy_by_cur_uk_sterling) {
		this.r0050_analy_by_cur_uk_sterling = r0050_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0050_analy_by_cur_chinese_yuan() {
		return r0050_analy_by_cur_chinese_yuan;
	}
	public void setR0050_analy_by_cur_chinese_yuan(BigDecimal r0050_analy_by_cur_chinese_yuan) {
		this.r0050_analy_by_cur_chinese_yuan = r0050_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0050_analy_by_cur_japanese_yen() {
		return r0050_analy_by_cur_japanese_yen;
	}
	public void setR0050_analy_by_cur_japanese_yen(BigDecimal r0050_analy_by_cur_japanese_yen) {
		this.r0050_analy_by_cur_japanese_yen = r0050_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0050_analy_by_cur_bahraini_dinar() {
		return r0050_analy_by_cur_bahraini_dinar;
	}
	public void setR0050_analy_by_cur_bahraini_dinar(BigDecimal r0050_analy_by_cur_bahraini_dinar) {
		this.r0050_analy_by_cur_bahraini_dinar = r0050_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0050_analy_by_cur_kuwaiti_dinar() {
		return r0050_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0050_analy_by_cur_kuwaiti_dinar(BigDecimal r0050_analy_by_cur_kuwaiti_dinar) {
		this.r0050_analy_by_cur_kuwaiti_dinar = r0050_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0050_analy_by_cur_qatari_ryal() {
		return r0050_analy_by_cur_qatari_ryal;
	}
	public void setR0050_analy_by_cur_qatari_ryal(BigDecimal r0050_analy_by_cur_qatari_ryal) {
		this.r0050_analy_by_cur_qatari_ryal = r0050_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0050_analy_by_cur_saudi_riyal() {
		return r0050_analy_by_cur_saudi_riyal;
	}
	public void setR0050_analy_by_cur_saudi_riyal(BigDecimal r0050_analy_by_cur_saudi_riyal) {
		this.r0050_analy_by_cur_saudi_riyal = r0050_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0050_analy_by_cur_other_fgn_currencies() {
		return r0050_analy_by_cur_other_fgn_currencies;
	}
	public void setR0050_analy_by_cur_other_fgn_currencies(BigDecimal r0050_analy_by_cur_other_fgn_currencies) {
		this.r0050_analy_by_cur_other_fgn_currencies = r0050_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0050_analy_by_cur_oth_indivi_fgn_curr() {
		return r0050_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0050_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0050_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0050_analy_by_cur_oth_indivi_fgn_curr = r0050_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0060_product() {
		return r0060_product;
	}
	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}
	public BigDecimal getR0060_analy_by_cur_us_dollar() {
		return r0060_analy_by_cur_us_dollar;
	}
	public void setR0060_analy_by_cur_us_dollar(BigDecimal r0060_analy_by_cur_us_dollar) {
		this.r0060_analy_by_cur_us_dollar = r0060_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0060_analy_by_cur_euro() {
		return r0060_analy_by_cur_euro;
	}
	public void setR0060_analy_by_cur_euro(BigDecimal r0060_analy_by_cur_euro) {
		this.r0060_analy_by_cur_euro = r0060_analy_by_cur_euro;
	}
	public BigDecimal getR0060_analy_by_cur_swiss_franc() {
		return r0060_analy_by_cur_swiss_franc;
	}
	public void setR0060_analy_by_cur_swiss_franc(BigDecimal r0060_analy_by_cur_swiss_franc) {
		this.r0060_analy_by_cur_swiss_franc = r0060_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0060_analy_by_cur_uk_sterling() {
		return r0060_analy_by_cur_uk_sterling;
	}
	public void setR0060_analy_by_cur_uk_sterling(BigDecimal r0060_analy_by_cur_uk_sterling) {
		this.r0060_analy_by_cur_uk_sterling = r0060_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0060_analy_by_cur_chinese_yuan() {
		return r0060_analy_by_cur_chinese_yuan;
	}
	public void setR0060_analy_by_cur_chinese_yuan(BigDecimal r0060_analy_by_cur_chinese_yuan) {
		this.r0060_analy_by_cur_chinese_yuan = r0060_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0060_analy_by_cur_japanese_yen() {
		return r0060_analy_by_cur_japanese_yen;
	}
	public void setR0060_analy_by_cur_japanese_yen(BigDecimal r0060_analy_by_cur_japanese_yen) {
		this.r0060_analy_by_cur_japanese_yen = r0060_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0060_analy_by_cur_bahraini_dinar() {
		return r0060_analy_by_cur_bahraini_dinar;
	}
	public void setR0060_analy_by_cur_bahraini_dinar(BigDecimal r0060_analy_by_cur_bahraini_dinar) {
		this.r0060_analy_by_cur_bahraini_dinar = r0060_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0060_analy_by_cur_kuwaiti_dinar() {
		return r0060_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0060_analy_by_cur_kuwaiti_dinar(BigDecimal r0060_analy_by_cur_kuwaiti_dinar) {
		this.r0060_analy_by_cur_kuwaiti_dinar = r0060_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0060_analy_by_cur_qatari_ryal() {
		return r0060_analy_by_cur_qatari_ryal;
	}
	public void setR0060_analy_by_cur_qatari_ryal(BigDecimal r0060_analy_by_cur_qatari_ryal) {
		this.r0060_analy_by_cur_qatari_ryal = r0060_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0060_analy_by_cur_saudi_riyal() {
		return r0060_analy_by_cur_saudi_riyal;
	}
	public void setR0060_analy_by_cur_saudi_riyal(BigDecimal r0060_analy_by_cur_saudi_riyal) {
		this.r0060_analy_by_cur_saudi_riyal = r0060_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0060_analy_by_cur_other_fgn_currencies() {
		return r0060_analy_by_cur_other_fgn_currencies;
	}
	public void setR0060_analy_by_cur_other_fgn_currencies(BigDecimal r0060_analy_by_cur_other_fgn_currencies) {
		this.r0060_analy_by_cur_other_fgn_currencies = r0060_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0060_analy_by_cur_oth_indivi_fgn_curr() {
		return r0060_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0060_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0060_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0060_analy_by_cur_oth_indivi_fgn_curr = r0060_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0070_product() {
		return r0070_product;
	}
	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}
	public BigDecimal getR0070_analy_by_cur_us_dollar() {
		return r0070_analy_by_cur_us_dollar;
	}
	public void setR0070_analy_by_cur_us_dollar(BigDecimal r0070_analy_by_cur_us_dollar) {
		this.r0070_analy_by_cur_us_dollar = r0070_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0070_analy_by_cur_euro() {
		return r0070_analy_by_cur_euro;
	}
	public void setR0070_analy_by_cur_euro(BigDecimal r0070_analy_by_cur_euro) {
		this.r0070_analy_by_cur_euro = r0070_analy_by_cur_euro;
	}
	public BigDecimal getR0070_analy_by_cur_swiss_franc() {
		return r0070_analy_by_cur_swiss_franc;
	}
	public void setR0070_analy_by_cur_swiss_franc(BigDecimal r0070_analy_by_cur_swiss_franc) {
		this.r0070_analy_by_cur_swiss_franc = r0070_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0070_analy_by_cur_uk_sterling() {
		return r0070_analy_by_cur_uk_sterling;
	}
	public void setR0070_analy_by_cur_uk_sterling(BigDecimal r0070_analy_by_cur_uk_sterling) {
		this.r0070_analy_by_cur_uk_sterling = r0070_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0070_analy_by_cur_chinese_yuan() {
		return r0070_analy_by_cur_chinese_yuan;
	}
	public void setR0070_analy_by_cur_chinese_yuan(BigDecimal r0070_analy_by_cur_chinese_yuan) {
		this.r0070_analy_by_cur_chinese_yuan = r0070_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0070_analy_by_cur_japanese_yen() {
		return r0070_analy_by_cur_japanese_yen;
	}
	public void setR0070_analy_by_cur_japanese_yen(BigDecimal r0070_analy_by_cur_japanese_yen) {
		this.r0070_analy_by_cur_japanese_yen = r0070_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0070_analy_by_cur_bahraini_dinar() {
		return r0070_analy_by_cur_bahraini_dinar;
	}
	public void setR0070_analy_by_cur_bahraini_dinar(BigDecimal r0070_analy_by_cur_bahraini_dinar) {
		this.r0070_analy_by_cur_bahraini_dinar = r0070_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0070_analy_by_cur_kuwaiti_dinar() {
		return r0070_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0070_analy_by_cur_kuwaiti_dinar(BigDecimal r0070_analy_by_cur_kuwaiti_dinar) {
		this.r0070_analy_by_cur_kuwaiti_dinar = r0070_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0070_analy_by_cur_qatari_ryal() {
		return r0070_analy_by_cur_qatari_ryal;
	}
	public void setR0070_analy_by_cur_qatari_ryal(BigDecimal r0070_analy_by_cur_qatari_ryal) {
		this.r0070_analy_by_cur_qatari_ryal = r0070_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0070_analy_by_cur_saudi_riyal() {
		return r0070_analy_by_cur_saudi_riyal;
	}
	public void setR0070_analy_by_cur_saudi_riyal(BigDecimal r0070_analy_by_cur_saudi_riyal) {
		this.r0070_analy_by_cur_saudi_riyal = r0070_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0070_analy_by_cur_other_fgn_currencies() {
		return r0070_analy_by_cur_other_fgn_currencies;
	}
	public void setR0070_analy_by_cur_other_fgn_currencies(BigDecimal r0070_analy_by_cur_other_fgn_currencies) {
		this.r0070_analy_by_cur_other_fgn_currencies = r0070_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0070_analy_by_cur_oth_indivi_fgn_curr() {
		return r0070_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0070_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0070_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0070_analy_by_cur_oth_indivi_fgn_curr = r0070_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0080_product() {
		return r0080_product;
	}
	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}
	public BigDecimal getR0080_analy_by_cur_us_dollar() {
		return r0080_analy_by_cur_us_dollar;
	}
	public void setR0080_analy_by_cur_us_dollar(BigDecimal r0080_analy_by_cur_us_dollar) {
		this.r0080_analy_by_cur_us_dollar = r0080_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0080_analy_by_cur_euro() {
		return r0080_analy_by_cur_euro;
	}
	public void setR0080_analy_by_cur_euro(BigDecimal r0080_analy_by_cur_euro) {
		this.r0080_analy_by_cur_euro = r0080_analy_by_cur_euro;
	}
	public BigDecimal getR0080_analy_by_cur_swiss_franc() {
		return r0080_analy_by_cur_swiss_franc;
	}
	public void setR0080_analy_by_cur_swiss_franc(BigDecimal r0080_analy_by_cur_swiss_franc) {
		this.r0080_analy_by_cur_swiss_franc = r0080_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0080_analy_by_cur_uk_sterling() {
		return r0080_analy_by_cur_uk_sterling;
	}
	public void setR0080_analy_by_cur_uk_sterling(BigDecimal r0080_analy_by_cur_uk_sterling) {
		this.r0080_analy_by_cur_uk_sterling = r0080_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0080_analy_by_cur_chinese_yuan() {
		return r0080_analy_by_cur_chinese_yuan;
	}
	public void setR0080_analy_by_cur_chinese_yuan(BigDecimal r0080_analy_by_cur_chinese_yuan) {
		this.r0080_analy_by_cur_chinese_yuan = r0080_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0080_analy_by_cur_japanese_yen() {
		return r0080_analy_by_cur_japanese_yen;
	}
	public void setR0080_analy_by_cur_japanese_yen(BigDecimal r0080_analy_by_cur_japanese_yen) {
		this.r0080_analy_by_cur_japanese_yen = r0080_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0080_analy_by_cur_bahraini_dinar() {
		return r0080_analy_by_cur_bahraini_dinar;
	}
	public void setR0080_analy_by_cur_bahraini_dinar(BigDecimal r0080_analy_by_cur_bahraini_dinar) {
		this.r0080_analy_by_cur_bahraini_dinar = r0080_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0080_analy_by_cur_kuwaiti_dinar() {
		return r0080_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0080_analy_by_cur_kuwaiti_dinar(BigDecimal r0080_analy_by_cur_kuwaiti_dinar) {
		this.r0080_analy_by_cur_kuwaiti_dinar = r0080_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0080_analy_by_cur_qatari_ryal() {
		return r0080_analy_by_cur_qatari_ryal;
	}
	public void setR0080_analy_by_cur_qatari_ryal(BigDecimal r0080_analy_by_cur_qatari_ryal) {
		this.r0080_analy_by_cur_qatari_ryal = r0080_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0080_analy_by_cur_saudi_riyal() {
		return r0080_analy_by_cur_saudi_riyal;
	}
	public void setR0080_analy_by_cur_saudi_riyal(BigDecimal r0080_analy_by_cur_saudi_riyal) {
		this.r0080_analy_by_cur_saudi_riyal = r0080_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0080_analy_by_cur_other_fgn_currencies() {
		return r0080_analy_by_cur_other_fgn_currencies;
	}
	public void setR0080_analy_by_cur_other_fgn_currencies(BigDecimal r0080_analy_by_cur_other_fgn_currencies) {
		this.r0080_analy_by_cur_other_fgn_currencies = r0080_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0080_analy_by_cur_oth_indivi_fgn_curr() {
		return r0080_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0080_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0080_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0080_analy_by_cur_oth_indivi_fgn_curr = r0080_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0090_product() {
		return r0090_product;
	}
	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}
	public BigDecimal getR0090_analy_by_cur_us_dollar() {
		return r0090_analy_by_cur_us_dollar;
	}
	public void setR0090_analy_by_cur_us_dollar(BigDecimal r0090_analy_by_cur_us_dollar) {
		this.r0090_analy_by_cur_us_dollar = r0090_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0090_analy_by_cur_euro() {
		return r0090_analy_by_cur_euro;
	}
	public void setR0090_analy_by_cur_euro(BigDecimal r0090_analy_by_cur_euro) {
		this.r0090_analy_by_cur_euro = r0090_analy_by_cur_euro;
	}
	public BigDecimal getR0090_analy_by_cur_swiss_franc() {
		return r0090_analy_by_cur_swiss_franc;
	}
	public void setR0090_analy_by_cur_swiss_franc(BigDecimal r0090_analy_by_cur_swiss_franc) {
		this.r0090_analy_by_cur_swiss_franc = r0090_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0090_analy_by_cur_uk_sterling() {
		return r0090_analy_by_cur_uk_sterling;
	}
	public void setR0090_analy_by_cur_uk_sterling(BigDecimal r0090_analy_by_cur_uk_sterling) {
		this.r0090_analy_by_cur_uk_sterling = r0090_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0090_analy_by_cur_chinese_yuan() {
		return r0090_analy_by_cur_chinese_yuan;
	}
	public void setR0090_analy_by_cur_chinese_yuan(BigDecimal r0090_analy_by_cur_chinese_yuan) {
		this.r0090_analy_by_cur_chinese_yuan = r0090_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0090_analy_by_cur_japanese_yen() {
		return r0090_analy_by_cur_japanese_yen;
	}
	public void setR0090_analy_by_cur_japanese_yen(BigDecimal r0090_analy_by_cur_japanese_yen) {
		this.r0090_analy_by_cur_japanese_yen = r0090_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0090_analy_by_cur_bahraini_dinar() {
		return r0090_analy_by_cur_bahraini_dinar;
	}
	public void setR0090_analy_by_cur_bahraini_dinar(BigDecimal r0090_analy_by_cur_bahraini_dinar) {
		this.r0090_analy_by_cur_bahraini_dinar = r0090_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0090_analy_by_cur_kuwaiti_dinar() {
		return r0090_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0090_analy_by_cur_kuwaiti_dinar(BigDecimal r0090_analy_by_cur_kuwaiti_dinar) {
		this.r0090_analy_by_cur_kuwaiti_dinar = r0090_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0090_analy_by_cur_qatari_ryal() {
		return r0090_analy_by_cur_qatari_ryal;
	}
	public void setR0090_analy_by_cur_qatari_ryal(BigDecimal r0090_analy_by_cur_qatari_ryal) {
		this.r0090_analy_by_cur_qatari_ryal = r0090_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0090_analy_by_cur_saudi_riyal() {
		return r0090_analy_by_cur_saudi_riyal;
	}
	public void setR0090_analy_by_cur_saudi_riyal(BigDecimal r0090_analy_by_cur_saudi_riyal) {
		this.r0090_analy_by_cur_saudi_riyal = r0090_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0090_analy_by_cur_other_fgn_currencies() {
		return r0090_analy_by_cur_other_fgn_currencies;
	}
	public void setR0090_analy_by_cur_other_fgn_currencies(BigDecimal r0090_analy_by_cur_other_fgn_currencies) {
		this.r0090_analy_by_cur_other_fgn_currencies = r0090_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0090_analy_by_cur_oth_indivi_fgn_curr() {
		return r0090_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0090_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0090_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0090_analy_by_cur_oth_indivi_fgn_curr = r0090_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0100_product() {
		return r0100_product;
	}
	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}
	public BigDecimal getR0100_analy_by_cur_us_dollar() {
		return r0100_analy_by_cur_us_dollar;
	}
	public void setR0100_analy_by_cur_us_dollar(BigDecimal r0100_analy_by_cur_us_dollar) {
		this.r0100_analy_by_cur_us_dollar = r0100_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0100_analy_by_cur_euro() {
		return r0100_analy_by_cur_euro;
	}
	public void setR0100_analy_by_cur_euro(BigDecimal r0100_analy_by_cur_euro) {
		this.r0100_analy_by_cur_euro = r0100_analy_by_cur_euro;
	}
	public BigDecimal getR0100_analy_by_cur_swiss_franc() {
		return r0100_analy_by_cur_swiss_franc;
	}
	public void setR0100_analy_by_cur_swiss_franc(BigDecimal r0100_analy_by_cur_swiss_franc) {
		this.r0100_analy_by_cur_swiss_franc = r0100_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0100_analy_by_cur_uk_sterling() {
		return r0100_analy_by_cur_uk_sterling;
	}
	public void setR0100_analy_by_cur_uk_sterling(BigDecimal r0100_analy_by_cur_uk_sterling) {
		this.r0100_analy_by_cur_uk_sterling = r0100_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0100_analy_by_cur_chinese_yuan() {
		return r0100_analy_by_cur_chinese_yuan;
	}
	public void setR0100_analy_by_cur_chinese_yuan(BigDecimal r0100_analy_by_cur_chinese_yuan) {
		this.r0100_analy_by_cur_chinese_yuan = r0100_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0100_analy_by_cur_japanese_yen() {
		return r0100_analy_by_cur_japanese_yen;
	}
	public void setR0100_analy_by_cur_japanese_yen(BigDecimal r0100_analy_by_cur_japanese_yen) {
		this.r0100_analy_by_cur_japanese_yen = r0100_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0100_analy_by_cur_bahraini_dinar() {
		return r0100_analy_by_cur_bahraini_dinar;
	}
	public void setR0100_analy_by_cur_bahraini_dinar(BigDecimal r0100_analy_by_cur_bahraini_dinar) {
		this.r0100_analy_by_cur_bahraini_dinar = r0100_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0100_analy_by_cur_kuwaiti_dinar() {
		return r0100_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0100_analy_by_cur_kuwaiti_dinar(BigDecimal r0100_analy_by_cur_kuwaiti_dinar) {
		this.r0100_analy_by_cur_kuwaiti_dinar = r0100_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0100_analy_by_cur_qatari_ryal() {
		return r0100_analy_by_cur_qatari_ryal;
	}
	public void setR0100_analy_by_cur_qatari_ryal(BigDecimal r0100_analy_by_cur_qatari_ryal) {
		this.r0100_analy_by_cur_qatari_ryal = r0100_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0100_analy_by_cur_saudi_riyal() {
		return r0100_analy_by_cur_saudi_riyal;
	}
	public void setR0100_analy_by_cur_saudi_riyal(BigDecimal r0100_analy_by_cur_saudi_riyal) {
		this.r0100_analy_by_cur_saudi_riyal = r0100_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0100_analy_by_cur_other_fgn_currencies() {
		return r0100_analy_by_cur_other_fgn_currencies;
	}
	public void setR0100_analy_by_cur_other_fgn_currencies(BigDecimal r0100_analy_by_cur_other_fgn_currencies) {
		this.r0100_analy_by_cur_other_fgn_currencies = r0100_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0100_analy_by_cur_oth_indivi_fgn_curr() {
		return r0100_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0100_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0100_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0100_analy_by_cur_oth_indivi_fgn_curr = r0100_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0110_product() {
		return r0110_product;
	}
	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}
	public BigDecimal getR0110_analy_by_cur_us_dollar() {
		return r0110_analy_by_cur_us_dollar;
	}
	public void setR0110_analy_by_cur_us_dollar(BigDecimal r0110_analy_by_cur_us_dollar) {
		this.r0110_analy_by_cur_us_dollar = r0110_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0110_analy_by_cur_euro() {
		return r0110_analy_by_cur_euro;
	}
	public void setR0110_analy_by_cur_euro(BigDecimal r0110_analy_by_cur_euro) {
		this.r0110_analy_by_cur_euro = r0110_analy_by_cur_euro;
	}
	public BigDecimal getR0110_analy_by_cur_swiss_franc() {
		return r0110_analy_by_cur_swiss_franc;
	}
	public void setR0110_analy_by_cur_swiss_franc(BigDecimal r0110_analy_by_cur_swiss_franc) {
		this.r0110_analy_by_cur_swiss_franc = r0110_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0110_analy_by_cur_uk_sterling() {
		return r0110_analy_by_cur_uk_sterling;
	}
	public void setR0110_analy_by_cur_uk_sterling(BigDecimal r0110_analy_by_cur_uk_sterling) {
		this.r0110_analy_by_cur_uk_sterling = r0110_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0110_analy_by_cur_chinese_yuan() {
		return r0110_analy_by_cur_chinese_yuan;
	}
	public void setR0110_analy_by_cur_chinese_yuan(BigDecimal r0110_analy_by_cur_chinese_yuan) {
		this.r0110_analy_by_cur_chinese_yuan = r0110_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0110_analy_by_cur_japanese_yen() {
		return r0110_analy_by_cur_japanese_yen;
	}
	public void setR0110_analy_by_cur_japanese_yen(BigDecimal r0110_analy_by_cur_japanese_yen) {
		this.r0110_analy_by_cur_japanese_yen = r0110_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0110_analy_by_cur_bahraini_dinar() {
		return r0110_analy_by_cur_bahraini_dinar;
	}
	public void setR0110_analy_by_cur_bahraini_dinar(BigDecimal r0110_analy_by_cur_bahraini_dinar) {
		this.r0110_analy_by_cur_bahraini_dinar = r0110_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0110_analy_by_cur_kuwaiti_dinar() {
		return r0110_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0110_analy_by_cur_kuwaiti_dinar(BigDecimal r0110_analy_by_cur_kuwaiti_dinar) {
		this.r0110_analy_by_cur_kuwaiti_dinar = r0110_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0110_analy_by_cur_qatari_ryal() {
		return r0110_analy_by_cur_qatari_ryal;
	}
	public void setR0110_analy_by_cur_qatari_ryal(BigDecimal r0110_analy_by_cur_qatari_ryal) {
		this.r0110_analy_by_cur_qatari_ryal = r0110_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0110_analy_by_cur_saudi_riyal() {
		return r0110_analy_by_cur_saudi_riyal;
	}
	public void setR0110_analy_by_cur_saudi_riyal(BigDecimal r0110_analy_by_cur_saudi_riyal) {
		this.r0110_analy_by_cur_saudi_riyal = r0110_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0110_analy_by_cur_other_fgn_currencies() {
		return r0110_analy_by_cur_other_fgn_currencies;
	}
	public void setR0110_analy_by_cur_other_fgn_currencies(BigDecimal r0110_analy_by_cur_other_fgn_currencies) {
		this.r0110_analy_by_cur_other_fgn_currencies = r0110_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0110_analy_by_cur_oth_indivi_fgn_curr() {
		return r0110_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0110_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0110_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0110_analy_by_cur_oth_indivi_fgn_curr = r0110_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0120_product() {
		return r0120_product;
	}
	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}
	public BigDecimal getR0120_analy_by_cur_us_dollar() {
		return r0120_analy_by_cur_us_dollar;
	}
	public void setR0120_analy_by_cur_us_dollar(BigDecimal r0120_analy_by_cur_us_dollar) {
		this.r0120_analy_by_cur_us_dollar = r0120_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0120_analy_by_cur_euro() {
		return r0120_analy_by_cur_euro;
	}
	public void setR0120_analy_by_cur_euro(BigDecimal r0120_analy_by_cur_euro) {
		this.r0120_analy_by_cur_euro = r0120_analy_by_cur_euro;
	}
	public BigDecimal getR0120_analy_by_cur_swiss_franc() {
		return r0120_analy_by_cur_swiss_franc;
	}
	public void setR0120_analy_by_cur_swiss_franc(BigDecimal r0120_analy_by_cur_swiss_franc) {
		this.r0120_analy_by_cur_swiss_franc = r0120_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0120_analy_by_cur_uk_sterling() {
		return r0120_analy_by_cur_uk_sterling;
	}
	public void setR0120_analy_by_cur_uk_sterling(BigDecimal r0120_analy_by_cur_uk_sterling) {
		this.r0120_analy_by_cur_uk_sterling = r0120_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0120_analy_by_cur_chinese_yuan() {
		return r0120_analy_by_cur_chinese_yuan;
	}
	public void setR0120_analy_by_cur_chinese_yuan(BigDecimal r0120_analy_by_cur_chinese_yuan) {
		this.r0120_analy_by_cur_chinese_yuan = r0120_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0120_analy_by_cur_japanese_yen() {
		return r0120_analy_by_cur_japanese_yen;
	}
	public void setR0120_analy_by_cur_japanese_yen(BigDecimal r0120_analy_by_cur_japanese_yen) {
		this.r0120_analy_by_cur_japanese_yen = r0120_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0120_analy_by_cur_bahraini_dinar() {
		return r0120_analy_by_cur_bahraini_dinar;
	}
	public void setR0120_analy_by_cur_bahraini_dinar(BigDecimal r0120_analy_by_cur_bahraini_dinar) {
		this.r0120_analy_by_cur_bahraini_dinar = r0120_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0120_analy_by_cur_kuwaiti_dinar() {
		return r0120_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0120_analy_by_cur_kuwaiti_dinar(BigDecimal r0120_analy_by_cur_kuwaiti_dinar) {
		this.r0120_analy_by_cur_kuwaiti_dinar = r0120_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0120_analy_by_cur_qatari_ryal() {
		return r0120_analy_by_cur_qatari_ryal;
	}
	public void setR0120_analy_by_cur_qatari_ryal(BigDecimal r0120_analy_by_cur_qatari_ryal) {
		this.r0120_analy_by_cur_qatari_ryal = r0120_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0120_analy_by_cur_saudi_riyal() {
		return r0120_analy_by_cur_saudi_riyal;
	}
	public void setR0120_analy_by_cur_saudi_riyal(BigDecimal r0120_analy_by_cur_saudi_riyal) {
		this.r0120_analy_by_cur_saudi_riyal = r0120_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0120_analy_by_cur_other_fgn_currencies() {
		return r0120_analy_by_cur_other_fgn_currencies;
	}
	public void setR0120_analy_by_cur_other_fgn_currencies(BigDecimal r0120_analy_by_cur_other_fgn_currencies) {
		this.r0120_analy_by_cur_other_fgn_currencies = r0120_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0120_analy_by_cur_oth_indivi_fgn_curr() {
		return r0120_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0120_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0120_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0120_analy_by_cur_oth_indivi_fgn_curr = r0120_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0130_product() {
		return r0130_product;
	}
	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}
	public BigDecimal getR0130_analy_by_cur_us_dollar() {
		return r0130_analy_by_cur_us_dollar;
	}
	public void setR0130_analy_by_cur_us_dollar(BigDecimal r0130_analy_by_cur_us_dollar) {
		this.r0130_analy_by_cur_us_dollar = r0130_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0130_analy_by_cur_euro() {
		return r0130_analy_by_cur_euro;
	}
	public void setR0130_analy_by_cur_euro(BigDecimal r0130_analy_by_cur_euro) {
		this.r0130_analy_by_cur_euro = r0130_analy_by_cur_euro;
	}
	public BigDecimal getR0130_analy_by_cur_swiss_franc() {
		return r0130_analy_by_cur_swiss_franc;
	}
	public void setR0130_analy_by_cur_swiss_franc(BigDecimal r0130_analy_by_cur_swiss_franc) {
		this.r0130_analy_by_cur_swiss_franc = r0130_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0130_analy_by_cur_uk_sterling() {
		return r0130_analy_by_cur_uk_sterling;
	}
	public void setR0130_analy_by_cur_uk_sterling(BigDecimal r0130_analy_by_cur_uk_sterling) {
		this.r0130_analy_by_cur_uk_sterling = r0130_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0130_analy_by_cur_chinese_yuan() {
		return r0130_analy_by_cur_chinese_yuan;
	}
	public void setR0130_analy_by_cur_chinese_yuan(BigDecimal r0130_analy_by_cur_chinese_yuan) {
		this.r0130_analy_by_cur_chinese_yuan = r0130_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0130_analy_by_cur_japanese_yen() {
		return r0130_analy_by_cur_japanese_yen;
	}
	public void setR0130_analy_by_cur_japanese_yen(BigDecimal r0130_analy_by_cur_japanese_yen) {
		this.r0130_analy_by_cur_japanese_yen = r0130_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0130_analy_by_cur_bahraini_dinar() {
		return r0130_analy_by_cur_bahraini_dinar;
	}
	public void setR0130_analy_by_cur_bahraini_dinar(BigDecimal r0130_analy_by_cur_bahraini_dinar) {
		this.r0130_analy_by_cur_bahraini_dinar = r0130_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0130_analy_by_cur_kuwaiti_dinar() {
		return r0130_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0130_analy_by_cur_kuwaiti_dinar(BigDecimal r0130_analy_by_cur_kuwaiti_dinar) {
		this.r0130_analy_by_cur_kuwaiti_dinar = r0130_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0130_analy_by_cur_qatari_ryal() {
		return r0130_analy_by_cur_qatari_ryal;
	}
	public void setR0130_analy_by_cur_qatari_ryal(BigDecimal r0130_analy_by_cur_qatari_ryal) {
		this.r0130_analy_by_cur_qatari_ryal = r0130_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0130_analy_by_cur_saudi_riyal() {
		return r0130_analy_by_cur_saudi_riyal;
	}
	public void setR0130_analy_by_cur_saudi_riyal(BigDecimal r0130_analy_by_cur_saudi_riyal) {
		this.r0130_analy_by_cur_saudi_riyal = r0130_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0130_analy_by_cur_other_fgn_currencies() {
		return r0130_analy_by_cur_other_fgn_currencies;
	}
	public void setR0130_analy_by_cur_other_fgn_currencies(BigDecimal r0130_analy_by_cur_other_fgn_currencies) {
		this.r0130_analy_by_cur_other_fgn_currencies = r0130_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0130_analy_by_cur_oth_indivi_fgn_curr() {
		return r0130_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0130_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0130_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0130_analy_by_cur_oth_indivi_fgn_curr = r0130_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0140_product() {
		return r0140_product;
	}
	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}
	public BigDecimal getR0140_analy_by_cur_us_dollar() {
		return r0140_analy_by_cur_us_dollar;
	}
	public void setR0140_analy_by_cur_us_dollar(BigDecimal r0140_analy_by_cur_us_dollar) {
		this.r0140_analy_by_cur_us_dollar = r0140_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0140_analy_by_cur_euro() {
		return r0140_analy_by_cur_euro;
	}
	public void setR0140_analy_by_cur_euro(BigDecimal r0140_analy_by_cur_euro) {
		this.r0140_analy_by_cur_euro = r0140_analy_by_cur_euro;
	}
	public BigDecimal getR0140_analy_by_cur_swiss_franc() {
		return r0140_analy_by_cur_swiss_franc;
	}
	public void setR0140_analy_by_cur_swiss_franc(BigDecimal r0140_analy_by_cur_swiss_franc) {
		this.r0140_analy_by_cur_swiss_franc = r0140_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0140_analy_by_cur_uk_sterling() {
		return r0140_analy_by_cur_uk_sterling;
	}
	public void setR0140_analy_by_cur_uk_sterling(BigDecimal r0140_analy_by_cur_uk_sterling) {
		this.r0140_analy_by_cur_uk_sterling = r0140_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0140_analy_by_cur_chinese_yuan() {
		return r0140_analy_by_cur_chinese_yuan;
	}
	public void setR0140_analy_by_cur_chinese_yuan(BigDecimal r0140_analy_by_cur_chinese_yuan) {
		this.r0140_analy_by_cur_chinese_yuan = r0140_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0140_analy_by_cur_japanese_yen() {
		return r0140_analy_by_cur_japanese_yen;
	}
	public void setR0140_analy_by_cur_japanese_yen(BigDecimal r0140_analy_by_cur_japanese_yen) {
		this.r0140_analy_by_cur_japanese_yen = r0140_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0140_analy_by_cur_bahraini_dinar() {
		return r0140_analy_by_cur_bahraini_dinar;
	}
	public void setR0140_analy_by_cur_bahraini_dinar(BigDecimal r0140_analy_by_cur_bahraini_dinar) {
		this.r0140_analy_by_cur_bahraini_dinar = r0140_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0140_analy_by_cur_kuwaiti_dinar() {
		return r0140_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0140_analy_by_cur_kuwaiti_dinar(BigDecimal r0140_analy_by_cur_kuwaiti_dinar) {
		this.r0140_analy_by_cur_kuwaiti_dinar = r0140_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0140_analy_by_cur_qatari_ryal() {
		return r0140_analy_by_cur_qatari_ryal;
	}
	public void setR0140_analy_by_cur_qatari_ryal(BigDecimal r0140_analy_by_cur_qatari_ryal) {
		this.r0140_analy_by_cur_qatari_ryal = r0140_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0140_analy_by_cur_saudi_riyal() {
		return r0140_analy_by_cur_saudi_riyal;
	}
	public void setR0140_analy_by_cur_saudi_riyal(BigDecimal r0140_analy_by_cur_saudi_riyal) {
		this.r0140_analy_by_cur_saudi_riyal = r0140_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0140_analy_by_cur_other_fgn_currencies() {
		return r0140_analy_by_cur_other_fgn_currencies;
	}
	public void setR0140_analy_by_cur_other_fgn_currencies(BigDecimal r0140_analy_by_cur_other_fgn_currencies) {
		this.r0140_analy_by_cur_other_fgn_currencies = r0140_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0140_analy_by_cur_oth_indivi_fgn_curr() {
		return r0140_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0140_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0140_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0140_analy_by_cur_oth_indivi_fgn_curr = r0140_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0150_product() {
		return r0150_product;
	}
	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}
	public BigDecimal getR0150_analy_by_cur_us_dollar() {
		return r0150_analy_by_cur_us_dollar;
	}
	public void setR0150_analy_by_cur_us_dollar(BigDecimal r0150_analy_by_cur_us_dollar) {
		this.r0150_analy_by_cur_us_dollar = r0150_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0150_analy_by_cur_euro() {
		return r0150_analy_by_cur_euro;
	}
	public void setR0150_analy_by_cur_euro(BigDecimal r0150_analy_by_cur_euro) {
		this.r0150_analy_by_cur_euro = r0150_analy_by_cur_euro;
	}
	public BigDecimal getR0150_analy_by_cur_swiss_franc() {
		return r0150_analy_by_cur_swiss_franc;
	}
	public void setR0150_analy_by_cur_swiss_franc(BigDecimal r0150_analy_by_cur_swiss_franc) {
		this.r0150_analy_by_cur_swiss_franc = r0150_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0150_analy_by_cur_uk_sterling() {
		return r0150_analy_by_cur_uk_sterling;
	}
	public void setR0150_analy_by_cur_uk_sterling(BigDecimal r0150_analy_by_cur_uk_sterling) {
		this.r0150_analy_by_cur_uk_sterling = r0150_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0150_analy_by_cur_chinese_yuan() {
		return r0150_analy_by_cur_chinese_yuan;
	}
	public void setR0150_analy_by_cur_chinese_yuan(BigDecimal r0150_analy_by_cur_chinese_yuan) {
		this.r0150_analy_by_cur_chinese_yuan = r0150_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0150_analy_by_cur_japanese_yen() {
		return r0150_analy_by_cur_japanese_yen;
	}
	public void setR0150_analy_by_cur_japanese_yen(BigDecimal r0150_analy_by_cur_japanese_yen) {
		this.r0150_analy_by_cur_japanese_yen = r0150_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0150_analy_by_cur_bahraini_dinar() {
		return r0150_analy_by_cur_bahraini_dinar;
	}
	public void setR0150_analy_by_cur_bahraini_dinar(BigDecimal r0150_analy_by_cur_bahraini_dinar) {
		this.r0150_analy_by_cur_bahraini_dinar = r0150_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0150_analy_by_cur_kuwaiti_dinar() {
		return r0150_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0150_analy_by_cur_kuwaiti_dinar(BigDecimal r0150_analy_by_cur_kuwaiti_dinar) {
		this.r0150_analy_by_cur_kuwaiti_dinar = r0150_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0150_analy_by_cur_qatari_ryal() {
		return r0150_analy_by_cur_qatari_ryal;
	}
	public void setR0150_analy_by_cur_qatari_ryal(BigDecimal r0150_analy_by_cur_qatari_ryal) {
		this.r0150_analy_by_cur_qatari_ryal = r0150_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0150_analy_by_cur_saudi_riyal() {
		return r0150_analy_by_cur_saudi_riyal;
	}
	public void setR0150_analy_by_cur_saudi_riyal(BigDecimal r0150_analy_by_cur_saudi_riyal) {
		this.r0150_analy_by_cur_saudi_riyal = r0150_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0150_analy_by_cur_other_fgn_currencies() {
		return r0150_analy_by_cur_other_fgn_currencies;
	}
	public void setR0150_analy_by_cur_other_fgn_currencies(BigDecimal r0150_analy_by_cur_other_fgn_currencies) {
		this.r0150_analy_by_cur_other_fgn_currencies = r0150_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0150_analy_by_cur_oth_indivi_fgn_curr() {
		return r0150_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0150_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0150_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0150_analy_by_cur_oth_indivi_fgn_curr = r0150_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0160_product() {
		return r0160_product;
	}
	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}
	public BigDecimal getR0160_analy_by_cur_us_dollar() {
		return r0160_analy_by_cur_us_dollar;
	}
	public void setR0160_analy_by_cur_us_dollar(BigDecimal r0160_analy_by_cur_us_dollar) {
		this.r0160_analy_by_cur_us_dollar = r0160_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0160_analy_by_cur_euro() {
		return r0160_analy_by_cur_euro;
	}
	public void setR0160_analy_by_cur_euro(BigDecimal r0160_analy_by_cur_euro) {
		this.r0160_analy_by_cur_euro = r0160_analy_by_cur_euro;
	}
	public BigDecimal getR0160_analy_by_cur_swiss_franc() {
		return r0160_analy_by_cur_swiss_franc;
	}
	public void setR0160_analy_by_cur_swiss_franc(BigDecimal r0160_analy_by_cur_swiss_franc) {
		this.r0160_analy_by_cur_swiss_franc = r0160_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0160_analy_by_cur_uk_sterling() {
		return r0160_analy_by_cur_uk_sterling;
	}
	public void setR0160_analy_by_cur_uk_sterling(BigDecimal r0160_analy_by_cur_uk_sterling) {
		this.r0160_analy_by_cur_uk_sterling = r0160_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0160_analy_by_cur_chinese_yuan() {
		return r0160_analy_by_cur_chinese_yuan;
	}
	public void setR0160_analy_by_cur_chinese_yuan(BigDecimal r0160_analy_by_cur_chinese_yuan) {
		this.r0160_analy_by_cur_chinese_yuan = r0160_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0160_analy_by_cur_japanese_yen() {
		return r0160_analy_by_cur_japanese_yen;
	}
	public void setR0160_analy_by_cur_japanese_yen(BigDecimal r0160_analy_by_cur_japanese_yen) {
		this.r0160_analy_by_cur_japanese_yen = r0160_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0160_analy_by_cur_bahraini_dinar() {
		return r0160_analy_by_cur_bahraini_dinar;
	}
	public void setR0160_analy_by_cur_bahraini_dinar(BigDecimal r0160_analy_by_cur_bahraini_dinar) {
		this.r0160_analy_by_cur_bahraini_dinar = r0160_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0160_analy_by_cur_kuwaiti_dinar() {
		return r0160_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0160_analy_by_cur_kuwaiti_dinar(BigDecimal r0160_analy_by_cur_kuwaiti_dinar) {
		this.r0160_analy_by_cur_kuwaiti_dinar = r0160_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0160_analy_by_cur_qatari_ryal() {
		return r0160_analy_by_cur_qatari_ryal;
	}
	public void setR0160_analy_by_cur_qatari_ryal(BigDecimal r0160_analy_by_cur_qatari_ryal) {
		this.r0160_analy_by_cur_qatari_ryal = r0160_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0160_analy_by_cur_saudi_riyal() {
		return r0160_analy_by_cur_saudi_riyal;
	}
	public void setR0160_analy_by_cur_saudi_riyal(BigDecimal r0160_analy_by_cur_saudi_riyal) {
		this.r0160_analy_by_cur_saudi_riyal = r0160_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0160_analy_by_cur_other_fgn_currencies() {
		return r0160_analy_by_cur_other_fgn_currencies;
	}
	public void setR0160_analy_by_cur_other_fgn_currencies(BigDecimal r0160_analy_by_cur_other_fgn_currencies) {
		this.r0160_analy_by_cur_other_fgn_currencies = r0160_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0160_analy_by_cur_oth_indivi_fgn_curr() {
		return r0160_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0160_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0160_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0160_analy_by_cur_oth_indivi_fgn_curr = r0160_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0170_product() {
		return r0170_product;
	}
	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}
	public BigDecimal getR0170_analy_by_cur_us_dollar() {
		return r0170_analy_by_cur_us_dollar;
	}
	public void setR0170_analy_by_cur_us_dollar(BigDecimal r0170_analy_by_cur_us_dollar) {
		this.r0170_analy_by_cur_us_dollar = r0170_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0170_analy_by_cur_euro() {
		return r0170_analy_by_cur_euro;
	}
	public void setR0170_analy_by_cur_euro(BigDecimal r0170_analy_by_cur_euro) {
		this.r0170_analy_by_cur_euro = r0170_analy_by_cur_euro;
	}
	public BigDecimal getR0170_analy_by_cur_swiss_franc() {
		return r0170_analy_by_cur_swiss_franc;
	}
	public void setR0170_analy_by_cur_swiss_franc(BigDecimal r0170_analy_by_cur_swiss_franc) {
		this.r0170_analy_by_cur_swiss_franc = r0170_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0170_analy_by_cur_uk_sterling() {
		return r0170_analy_by_cur_uk_sterling;
	}
	public void setR0170_analy_by_cur_uk_sterling(BigDecimal r0170_analy_by_cur_uk_sterling) {
		this.r0170_analy_by_cur_uk_sterling = r0170_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0170_analy_by_cur_chinese_yuan() {
		return r0170_analy_by_cur_chinese_yuan;
	}
	public void setR0170_analy_by_cur_chinese_yuan(BigDecimal r0170_analy_by_cur_chinese_yuan) {
		this.r0170_analy_by_cur_chinese_yuan = r0170_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0170_analy_by_cur_japanese_yen() {
		return r0170_analy_by_cur_japanese_yen;
	}
	public void setR0170_analy_by_cur_japanese_yen(BigDecimal r0170_analy_by_cur_japanese_yen) {
		this.r0170_analy_by_cur_japanese_yen = r0170_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0170_analy_by_cur_bahraini_dinar() {
		return r0170_analy_by_cur_bahraini_dinar;
	}
	public void setR0170_analy_by_cur_bahraini_dinar(BigDecimal r0170_analy_by_cur_bahraini_dinar) {
		this.r0170_analy_by_cur_bahraini_dinar = r0170_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0170_analy_by_cur_kuwaiti_dinar() {
		return r0170_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0170_analy_by_cur_kuwaiti_dinar(BigDecimal r0170_analy_by_cur_kuwaiti_dinar) {
		this.r0170_analy_by_cur_kuwaiti_dinar = r0170_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0170_analy_by_cur_qatari_ryal() {
		return r0170_analy_by_cur_qatari_ryal;
	}
	public void setR0170_analy_by_cur_qatari_ryal(BigDecimal r0170_analy_by_cur_qatari_ryal) {
		this.r0170_analy_by_cur_qatari_ryal = r0170_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0170_analy_by_cur_saudi_riyal() {
		return r0170_analy_by_cur_saudi_riyal;
	}
	public void setR0170_analy_by_cur_saudi_riyal(BigDecimal r0170_analy_by_cur_saudi_riyal) {
		this.r0170_analy_by_cur_saudi_riyal = r0170_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0170_analy_by_cur_other_fgn_currencies() {
		return r0170_analy_by_cur_other_fgn_currencies;
	}
	public void setR0170_analy_by_cur_other_fgn_currencies(BigDecimal r0170_analy_by_cur_other_fgn_currencies) {
		this.r0170_analy_by_cur_other_fgn_currencies = r0170_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0170_analy_by_cur_oth_indivi_fgn_curr() {
		return r0170_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0170_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0170_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0170_analy_by_cur_oth_indivi_fgn_curr = r0170_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0180_product() {
		return r0180_product;
	}
	public void setR0180_product(String r0180_product) {
		this.r0180_product = r0180_product;
	}
	public BigDecimal getR0180_analy_by_cur_us_dollar() {
		return r0180_analy_by_cur_us_dollar;
	}
	public void setR0180_analy_by_cur_us_dollar(BigDecimal r0180_analy_by_cur_us_dollar) {
		this.r0180_analy_by_cur_us_dollar = r0180_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0180_analy_by_cur_euro() {
		return r0180_analy_by_cur_euro;
	}
	public void setR0180_analy_by_cur_euro(BigDecimal r0180_analy_by_cur_euro) {
		this.r0180_analy_by_cur_euro = r0180_analy_by_cur_euro;
	}
	public BigDecimal getR0180_analy_by_cur_swiss_franc() {
		return r0180_analy_by_cur_swiss_franc;
	}
	public void setR0180_analy_by_cur_swiss_franc(BigDecimal r0180_analy_by_cur_swiss_franc) {
		this.r0180_analy_by_cur_swiss_franc = r0180_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0180_analy_by_cur_uk_sterling() {
		return r0180_analy_by_cur_uk_sterling;
	}
	public void setR0180_analy_by_cur_uk_sterling(BigDecimal r0180_analy_by_cur_uk_sterling) {
		this.r0180_analy_by_cur_uk_sterling = r0180_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0180_analy_by_cur_chinese_yuan() {
		return r0180_analy_by_cur_chinese_yuan;
	}
	public void setR0180_analy_by_cur_chinese_yuan(BigDecimal r0180_analy_by_cur_chinese_yuan) {
		this.r0180_analy_by_cur_chinese_yuan = r0180_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0180_analy_by_cur_japanese_yen() {
		return r0180_analy_by_cur_japanese_yen;
	}
	public void setR0180_analy_by_cur_japanese_yen(BigDecimal r0180_analy_by_cur_japanese_yen) {
		this.r0180_analy_by_cur_japanese_yen = r0180_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0180_analy_by_cur_bahraini_dinar() {
		return r0180_analy_by_cur_bahraini_dinar;
	}
	public void setR0180_analy_by_cur_bahraini_dinar(BigDecimal r0180_analy_by_cur_bahraini_dinar) {
		this.r0180_analy_by_cur_bahraini_dinar = r0180_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0180_analy_by_cur_kuwaiti_dinar() {
		return r0180_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0180_analy_by_cur_kuwaiti_dinar(BigDecimal r0180_analy_by_cur_kuwaiti_dinar) {
		this.r0180_analy_by_cur_kuwaiti_dinar = r0180_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0180_analy_by_cur_qatari_ryal() {
		return r0180_analy_by_cur_qatari_ryal;
	}
	public void setR0180_analy_by_cur_qatari_ryal(BigDecimal r0180_analy_by_cur_qatari_ryal) {
		this.r0180_analy_by_cur_qatari_ryal = r0180_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0180_analy_by_cur_saudi_riyal() {
		return r0180_analy_by_cur_saudi_riyal;
	}
	public void setR0180_analy_by_cur_saudi_riyal(BigDecimal r0180_analy_by_cur_saudi_riyal) {
		this.r0180_analy_by_cur_saudi_riyal = r0180_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0180_analy_by_cur_other_fgn_currencies() {
		return r0180_analy_by_cur_other_fgn_currencies;
	}
	public void setR0180_analy_by_cur_other_fgn_currencies(BigDecimal r0180_analy_by_cur_other_fgn_currencies) {
		this.r0180_analy_by_cur_other_fgn_currencies = r0180_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0180_analy_by_cur_oth_indivi_fgn_curr() {
		return r0180_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0180_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0180_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0180_analy_by_cur_oth_indivi_fgn_curr = r0180_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0190_product() {
		return r0190_product;
	}
	public void setR0190_product(String r0190_product) {
		this.r0190_product = r0190_product;
	}
	public BigDecimal getR0190_analy_by_cur_us_dollar() {
		return r0190_analy_by_cur_us_dollar;
	}
	public void setR0190_analy_by_cur_us_dollar(BigDecimal r0190_analy_by_cur_us_dollar) {
		this.r0190_analy_by_cur_us_dollar = r0190_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0190_analy_by_cur_euro() {
		return r0190_analy_by_cur_euro;
	}
	public void setR0190_analy_by_cur_euro(BigDecimal r0190_analy_by_cur_euro) {
		this.r0190_analy_by_cur_euro = r0190_analy_by_cur_euro;
	}
	public BigDecimal getR0190_analy_by_cur_swiss_franc() {
		return r0190_analy_by_cur_swiss_franc;
	}
	public void setR0190_analy_by_cur_swiss_franc(BigDecimal r0190_analy_by_cur_swiss_franc) {
		this.r0190_analy_by_cur_swiss_franc = r0190_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0190_analy_by_cur_uk_sterling() {
		return r0190_analy_by_cur_uk_sterling;
	}
	public void setR0190_analy_by_cur_uk_sterling(BigDecimal r0190_analy_by_cur_uk_sterling) {
		this.r0190_analy_by_cur_uk_sterling = r0190_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0190_analy_by_cur_chinese_yuan() {
		return r0190_analy_by_cur_chinese_yuan;
	}
	public void setR0190_analy_by_cur_chinese_yuan(BigDecimal r0190_analy_by_cur_chinese_yuan) {
		this.r0190_analy_by_cur_chinese_yuan = r0190_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0190_analy_by_cur_japanese_yen() {
		return r0190_analy_by_cur_japanese_yen;
	}
	public void setR0190_analy_by_cur_japanese_yen(BigDecimal r0190_analy_by_cur_japanese_yen) {
		this.r0190_analy_by_cur_japanese_yen = r0190_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0190_analy_by_cur_bahraini_dinar() {
		return r0190_analy_by_cur_bahraini_dinar;
	}
	public void setR0190_analy_by_cur_bahraini_dinar(BigDecimal r0190_analy_by_cur_bahraini_dinar) {
		this.r0190_analy_by_cur_bahraini_dinar = r0190_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0190_analy_by_cur_kuwaiti_dinar() {
		return r0190_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0190_analy_by_cur_kuwaiti_dinar(BigDecimal r0190_analy_by_cur_kuwaiti_dinar) {
		this.r0190_analy_by_cur_kuwaiti_dinar = r0190_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0190_analy_by_cur_qatari_ryal() {
		return r0190_analy_by_cur_qatari_ryal;
	}
	public void setR0190_analy_by_cur_qatari_ryal(BigDecimal r0190_analy_by_cur_qatari_ryal) {
		this.r0190_analy_by_cur_qatari_ryal = r0190_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0190_analy_by_cur_saudi_riyal() {
		return r0190_analy_by_cur_saudi_riyal;
	}
	public void setR0190_analy_by_cur_saudi_riyal(BigDecimal r0190_analy_by_cur_saudi_riyal) {
		this.r0190_analy_by_cur_saudi_riyal = r0190_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0190_analy_by_cur_other_fgn_currencies() {
		return r0190_analy_by_cur_other_fgn_currencies;
	}
	public void setR0190_analy_by_cur_other_fgn_currencies(BigDecimal r0190_analy_by_cur_other_fgn_currencies) {
		this.r0190_analy_by_cur_other_fgn_currencies = r0190_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0190_analy_by_cur_oth_indivi_fgn_curr() {
		return r0190_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0190_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0190_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0190_analy_by_cur_oth_indivi_fgn_curr = r0190_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0200_product() {
		return r0200_product;
	}
	public void setR0200_product(String r0200_product) {
		this.r0200_product = r0200_product;
	}
	public String getR0210_product() {
		return r0210_product;
	}
	public void setR0210_product(String r0210_product) {
		this.r0210_product = r0210_product;
	}
	public BigDecimal getR0210_analy_by_cur_us_dollar() {
		return r0210_analy_by_cur_us_dollar;
	}
	public void setR0210_analy_by_cur_us_dollar(BigDecimal r0210_analy_by_cur_us_dollar) {
		this.r0210_analy_by_cur_us_dollar = r0210_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0210_analy_by_cur_euro() {
		return r0210_analy_by_cur_euro;
	}
	public void setR0210_analy_by_cur_euro(BigDecimal r0210_analy_by_cur_euro) {
		this.r0210_analy_by_cur_euro = r0210_analy_by_cur_euro;
	}
	public BigDecimal getR0210_analy_by_cur_swiss_franc() {
		return r0210_analy_by_cur_swiss_franc;
	}
	public void setR0210_analy_by_cur_swiss_franc(BigDecimal r0210_analy_by_cur_swiss_franc) {
		this.r0210_analy_by_cur_swiss_franc = r0210_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0210_analy_by_cur_uk_sterling() {
		return r0210_analy_by_cur_uk_sterling;
	}
	public void setR0210_analy_by_cur_uk_sterling(BigDecimal r0210_analy_by_cur_uk_sterling) {
		this.r0210_analy_by_cur_uk_sterling = r0210_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0210_analy_by_cur_chinese_yuan() {
		return r0210_analy_by_cur_chinese_yuan;
	}
	public void setR0210_analy_by_cur_chinese_yuan(BigDecimal r0210_analy_by_cur_chinese_yuan) {
		this.r0210_analy_by_cur_chinese_yuan = r0210_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0210_analy_by_cur_japanese_yen() {
		return r0210_analy_by_cur_japanese_yen;
	}
	public void setR0210_analy_by_cur_japanese_yen(BigDecimal r0210_analy_by_cur_japanese_yen) {
		this.r0210_analy_by_cur_japanese_yen = r0210_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0210_analy_by_cur_bahraini_dinar() {
		return r0210_analy_by_cur_bahraini_dinar;
	}
	public void setR0210_analy_by_cur_bahraini_dinar(BigDecimal r0210_analy_by_cur_bahraini_dinar) {
		this.r0210_analy_by_cur_bahraini_dinar = r0210_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0210_analy_by_cur_kuwaiti_dinar() {
		return r0210_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0210_analy_by_cur_kuwaiti_dinar(BigDecimal r0210_analy_by_cur_kuwaiti_dinar) {
		this.r0210_analy_by_cur_kuwaiti_dinar = r0210_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0210_analy_by_cur_qatari_ryal() {
		return r0210_analy_by_cur_qatari_ryal;
	}
	public void setR0210_analy_by_cur_qatari_ryal(BigDecimal r0210_analy_by_cur_qatari_ryal) {
		this.r0210_analy_by_cur_qatari_ryal = r0210_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0210_analy_by_cur_saudi_riyal() {
		return r0210_analy_by_cur_saudi_riyal;
	}
	public void setR0210_analy_by_cur_saudi_riyal(BigDecimal r0210_analy_by_cur_saudi_riyal) {
		this.r0210_analy_by_cur_saudi_riyal = r0210_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0210_analy_by_cur_other_fgn_currencies() {
		return r0210_analy_by_cur_other_fgn_currencies;
	}
	public void setR0210_analy_by_cur_other_fgn_currencies(BigDecimal r0210_analy_by_cur_other_fgn_currencies) {
		this.r0210_analy_by_cur_other_fgn_currencies = r0210_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0210_analy_by_cur_oth_indivi_fgn_curr() {
		return r0210_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0210_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0210_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0210_analy_by_cur_oth_indivi_fgn_curr = r0210_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0220_product() {
		return r0220_product;
	}
	public void setR0220_product(String r0220_product) {
		this.r0220_product = r0220_product;
	}
	public BigDecimal getR0220_analy_by_cur_us_dollar() {
		return r0220_analy_by_cur_us_dollar;
	}
	public void setR0220_analy_by_cur_us_dollar(BigDecimal r0220_analy_by_cur_us_dollar) {
		this.r0220_analy_by_cur_us_dollar = r0220_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0220_analy_by_cur_euro() {
		return r0220_analy_by_cur_euro;
	}
	public void setR0220_analy_by_cur_euro(BigDecimal r0220_analy_by_cur_euro) {
		this.r0220_analy_by_cur_euro = r0220_analy_by_cur_euro;
	}
	public BigDecimal getR0220_analy_by_cur_swiss_franc() {
		return r0220_analy_by_cur_swiss_franc;
	}
	public void setR0220_analy_by_cur_swiss_franc(BigDecimal r0220_analy_by_cur_swiss_franc) {
		this.r0220_analy_by_cur_swiss_franc = r0220_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0220_analy_by_cur_uk_sterling() {
		return r0220_analy_by_cur_uk_sterling;
	}
	public void setR0220_analy_by_cur_uk_sterling(BigDecimal r0220_analy_by_cur_uk_sterling) {
		this.r0220_analy_by_cur_uk_sterling = r0220_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0220_analy_by_cur_chinese_yuan() {
		return r0220_analy_by_cur_chinese_yuan;
	}
	public void setR0220_analy_by_cur_chinese_yuan(BigDecimal r0220_analy_by_cur_chinese_yuan) {
		this.r0220_analy_by_cur_chinese_yuan = r0220_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0220_analy_by_cur_japanese_yen() {
		return r0220_analy_by_cur_japanese_yen;
	}
	public void setR0220_analy_by_cur_japanese_yen(BigDecimal r0220_analy_by_cur_japanese_yen) {
		this.r0220_analy_by_cur_japanese_yen = r0220_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0220_analy_by_cur_bahraini_dinar() {
		return r0220_analy_by_cur_bahraini_dinar;
	}
	public void setR0220_analy_by_cur_bahraini_dinar(BigDecimal r0220_analy_by_cur_bahraini_dinar) {
		this.r0220_analy_by_cur_bahraini_dinar = r0220_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0220_analy_by_cur_kuwaiti_dinar() {
		return r0220_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0220_analy_by_cur_kuwaiti_dinar(BigDecimal r0220_analy_by_cur_kuwaiti_dinar) {
		this.r0220_analy_by_cur_kuwaiti_dinar = r0220_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0220_analy_by_cur_qatari_ryal() {
		return r0220_analy_by_cur_qatari_ryal;
	}
	public void setR0220_analy_by_cur_qatari_ryal(BigDecimal r0220_analy_by_cur_qatari_ryal) {
		this.r0220_analy_by_cur_qatari_ryal = r0220_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0220_analy_by_cur_saudi_riyal() {
		return r0220_analy_by_cur_saudi_riyal;
	}
	public void setR0220_analy_by_cur_saudi_riyal(BigDecimal r0220_analy_by_cur_saudi_riyal) {
		this.r0220_analy_by_cur_saudi_riyal = r0220_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0220_analy_by_cur_other_fgn_currencies() {
		return r0220_analy_by_cur_other_fgn_currencies;
	}
	public void setR0220_analy_by_cur_other_fgn_currencies(BigDecimal r0220_analy_by_cur_other_fgn_currencies) {
		this.r0220_analy_by_cur_other_fgn_currencies = r0220_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0220_analy_by_cur_oth_indivi_fgn_curr() {
		return r0220_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0220_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0220_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0220_analy_by_cur_oth_indivi_fgn_curr = r0220_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0230_product() {
		return r0230_product;
	}
	public void setR0230_product(String r0230_product) {
		this.r0230_product = r0230_product;
	}
	public BigDecimal getR0230_analy_by_cur_us_dollar() {
		return r0230_analy_by_cur_us_dollar;
	}
	public void setR0230_analy_by_cur_us_dollar(BigDecimal r0230_analy_by_cur_us_dollar) {
		this.r0230_analy_by_cur_us_dollar = r0230_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0230_analy_by_cur_euro() {
		return r0230_analy_by_cur_euro;
	}
	public void setR0230_analy_by_cur_euro(BigDecimal r0230_analy_by_cur_euro) {
		this.r0230_analy_by_cur_euro = r0230_analy_by_cur_euro;
	}
	public BigDecimal getR0230_analy_by_cur_swiss_franc() {
		return r0230_analy_by_cur_swiss_franc;
	}
	public void setR0230_analy_by_cur_swiss_franc(BigDecimal r0230_analy_by_cur_swiss_franc) {
		this.r0230_analy_by_cur_swiss_franc = r0230_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0230_analy_by_cur_uk_sterling() {
		return r0230_analy_by_cur_uk_sterling;
	}
	public void setR0230_analy_by_cur_uk_sterling(BigDecimal r0230_analy_by_cur_uk_sterling) {
		this.r0230_analy_by_cur_uk_sterling = r0230_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0230_analy_by_cur_chinese_yuan() {
		return r0230_analy_by_cur_chinese_yuan;
	}
	public void setR0230_analy_by_cur_chinese_yuan(BigDecimal r0230_analy_by_cur_chinese_yuan) {
		this.r0230_analy_by_cur_chinese_yuan = r0230_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0230_analy_by_cur_japanese_yen() {
		return r0230_analy_by_cur_japanese_yen;
	}
	public void setR0230_analy_by_cur_japanese_yen(BigDecimal r0230_analy_by_cur_japanese_yen) {
		this.r0230_analy_by_cur_japanese_yen = r0230_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0230_analy_by_cur_bahraini_dinar() {
		return r0230_analy_by_cur_bahraini_dinar;
	}
	public void setR0230_analy_by_cur_bahraini_dinar(BigDecimal r0230_analy_by_cur_bahraini_dinar) {
		this.r0230_analy_by_cur_bahraini_dinar = r0230_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0230_analy_by_cur_kuwaiti_dinar() {
		return r0230_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0230_analy_by_cur_kuwaiti_dinar(BigDecimal r0230_analy_by_cur_kuwaiti_dinar) {
		this.r0230_analy_by_cur_kuwaiti_dinar = r0230_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0230_analy_by_cur_qatari_ryal() {
		return r0230_analy_by_cur_qatari_ryal;
	}
	public void setR0230_analy_by_cur_qatari_ryal(BigDecimal r0230_analy_by_cur_qatari_ryal) {
		this.r0230_analy_by_cur_qatari_ryal = r0230_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0230_analy_by_cur_saudi_riyal() {
		return r0230_analy_by_cur_saudi_riyal;
	}
	public void setR0230_analy_by_cur_saudi_riyal(BigDecimal r0230_analy_by_cur_saudi_riyal) {
		this.r0230_analy_by_cur_saudi_riyal = r0230_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0230_analy_by_cur_other_fgn_currencies() {
		return r0230_analy_by_cur_other_fgn_currencies;
	}
	public void setR0230_analy_by_cur_other_fgn_currencies(BigDecimal r0230_analy_by_cur_other_fgn_currencies) {
		this.r0230_analy_by_cur_other_fgn_currencies = r0230_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0230_analy_by_cur_oth_indivi_fgn_curr() {
		return r0230_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0230_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0230_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0230_analy_by_cur_oth_indivi_fgn_curr = r0230_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0240_product() {
		return r0240_product;
	}
	public void setR0240_product(String r0240_product) {
		this.r0240_product = r0240_product;
	}
	public BigDecimal getR0240_analy_by_cur_us_dollar() {
		return r0240_analy_by_cur_us_dollar;
	}
	public void setR0240_analy_by_cur_us_dollar(BigDecimal r0240_analy_by_cur_us_dollar) {
		this.r0240_analy_by_cur_us_dollar = r0240_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0240_analy_by_cur_euro() {
		return r0240_analy_by_cur_euro;
	}
	public void setR0240_analy_by_cur_euro(BigDecimal r0240_analy_by_cur_euro) {
		this.r0240_analy_by_cur_euro = r0240_analy_by_cur_euro;
	}
	public BigDecimal getR0240_analy_by_cur_swiss_franc() {
		return r0240_analy_by_cur_swiss_franc;
	}
	public void setR0240_analy_by_cur_swiss_franc(BigDecimal r0240_analy_by_cur_swiss_franc) {
		this.r0240_analy_by_cur_swiss_franc = r0240_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0240_analy_by_cur_uk_sterling() {
		return r0240_analy_by_cur_uk_sterling;
	}
	public void setR0240_analy_by_cur_uk_sterling(BigDecimal r0240_analy_by_cur_uk_sterling) {
		this.r0240_analy_by_cur_uk_sterling = r0240_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0240_analy_by_cur_chinese_yuan() {
		return r0240_analy_by_cur_chinese_yuan;
	}
	public void setR0240_analy_by_cur_chinese_yuan(BigDecimal r0240_analy_by_cur_chinese_yuan) {
		this.r0240_analy_by_cur_chinese_yuan = r0240_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0240_analy_by_cur_japanese_yen() {
		return r0240_analy_by_cur_japanese_yen;
	}
	public void setR0240_analy_by_cur_japanese_yen(BigDecimal r0240_analy_by_cur_japanese_yen) {
		this.r0240_analy_by_cur_japanese_yen = r0240_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0240_analy_by_cur_bahraini_dinar() {
		return r0240_analy_by_cur_bahraini_dinar;
	}
	public void setR0240_analy_by_cur_bahraini_dinar(BigDecimal r0240_analy_by_cur_bahraini_dinar) {
		this.r0240_analy_by_cur_bahraini_dinar = r0240_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0240_analy_by_cur_kuwaiti_dinar() {
		return r0240_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0240_analy_by_cur_kuwaiti_dinar(BigDecimal r0240_analy_by_cur_kuwaiti_dinar) {
		this.r0240_analy_by_cur_kuwaiti_dinar = r0240_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0240_analy_by_cur_qatari_ryal() {
		return r0240_analy_by_cur_qatari_ryal;
	}
	public void setR0240_analy_by_cur_qatari_ryal(BigDecimal r0240_analy_by_cur_qatari_ryal) {
		this.r0240_analy_by_cur_qatari_ryal = r0240_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0240_analy_by_cur_saudi_riyal() {
		return r0240_analy_by_cur_saudi_riyal;
	}
	public void setR0240_analy_by_cur_saudi_riyal(BigDecimal r0240_analy_by_cur_saudi_riyal) {
		this.r0240_analy_by_cur_saudi_riyal = r0240_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0240_analy_by_cur_other_fgn_currencies() {
		return r0240_analy_by_cur_other_fgn_currencies;
	}
	public void setR0240_analy_by_cur_other_fgn_currencies(BigDecimal r0240_analy_by_cur_other_fgn_currencies) {
		this.r0240_analy_by_cur_other_fgn_currencies = r0240_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0240_analy_by_cur_oth_indivi_fgn_curr() {
		return r0240_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0240_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0240_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0240_analy_by_cur_oth_indivi_fgn_curr = r0240_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0250_product() {
		return r0250_product;
	}
	public void setR0250_product(String r0250_product) {
		this.r0250_product = r0250_product;
	}
	public BigDecimal getR0250_analy_by_cur_us_dollar() {
		return r0250_analy_by_cur_us_dollar;
	}
	public void setR0250_analy_by_cur_us_dollar(BigDecimal r0250_analy_by_cur_us_dollar) {
		this.r0250_analy_by_cur_us_dollar = r0250_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0250_analy_by_cur_euro() {
		return r0250_analy_by_cur_euro;
	}
	public void setR0250_analy_by_cur_euro(BigDecimal r0250_analy_by_cur_euro) {
		this.r0250_analy_by_cur_euro = r0250_analy_by_cur_euro;
	}
	public BigDecimal getR0250_analy_by_cur_swiss_franc() {
		return r0250_analy_by_cur_swiss_franc;
	}
	public void setR0250_analy_by_cur_swiss_franc(BigDecimal r0250_analy_by_cur_swiss_franc) {
		this.r0250_analy_by_cur_swiss_franc = r0250_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0250_analy_by_cur_uk_sterling() {
		return r0250_analy_by_cur_uk_sterling;
	}
	public void setR0250_analy_by_cur_uk_sterling(BigDecimal r0250_analy_by_cur_uk_sterling) {
		this.r0250_analy_by_cur_uk_sterling = r0250_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0250_analy_by_cur_chinese_yuan() {
		return r0250_analy_by_cur_chinese_yuan;
	}
	public void setR0250_analy_by_cur_chinese_yuan(BigDecimal r0250_analy_by_cur_chinese_yuan) {
		this.r0250_analy_by_cur_chinese_yuan = r0250_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0250_analy_by_cur_japanese_yen() {
		return r0250_analy_by_cur_japanese_yen;
	}
	public void setR0250_analy_by_cur_japanese_yen(BigDecimal r0250_analy_by_cur_japanese_yen) {
		this.r0250_analy_by_cur_japanese_yen = r0250_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0250_analy_by_cur_bahraini_dinar() {
		return r0250_analy_by_cur_bahraini_dinar;
	}
	public void setR0250_analy_by_cur_bahraini_dinar(BigDecimal r0250_analy_by_cur_bahraini_dinar) {
		this.r0250_analy_by_cur_bahraini_dinar = r0250_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0250_analy_by_cur_kuwaiti_dinar() {
		return r0250_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0250_analy_by_cur_kuwaiti_dinar(BigDecimal r0250_analy_by_cur_kuwaiti_dinar) {
		this.r0250_analy_by_cur_kuwaiti_dinar = r0250_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0250_analy_by_cur_qatari_ryal() {
		return r0250_analy_by_cur_qatari_ryal;
	}
	public void setR0250_analy_by_cur_qatari_ryal(BigDecimal r0250_analy_by_cur_qatari_ryal) {
		this.r0250_analy_by_cur_qatari_ryal = r0250_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0250_analy_by_cur_saudi_riyal() {
		return r0250_analy_by_cur_saudi_riyal;
	}
	public void setR0250_analy_by_cur_saudi_riyal(BigDecimal r0250_analy_by_cur_saudi_riyal) {
		this.r0250_analy_by_cur_saudi_riyal = r0250_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0250_analy_by_cur_other_fgn_currencies() {
		return r0250_analy_by_cur_other_fgn_currencies;
	}
	public void setR0250_analy_by_cur_other_fgn_currencies(BigDecimal r0250_analy_by_cur_other_fgn_currencies) {
		this.r0250_analy_by_cur_other_fgn_currencies = r0250_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0250_analy_by_cur_oth_indivi_fgn_curr() {
		return r0250_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0250_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0250_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0250_analy_by_cur_oth_indivi_fgn_curr = r0250_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0260_product() {
		return r0260_product;
	}
	public void setR0260_product(String r0260_product) {
		this.r0260_product = r0260_product;
	}
	public BigDecimal getR0260_analy_by_cur_us_dollar() {
		return r0260_analy_by_cur_us_dollar;
	}
	public void setR0260_analy_by_cur_us_dollar(BigDecimal r0260_analy_by_cur_us_dollar) {
		this.r0260_analy_by_cur_us_dollar = r0260_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0260_analy_by_cur_euro() {
		return r0260_analy_by_cur_euro;
	}
	public void setR0260_analy_by_cur_euro(BigDecimal r0260_analy_by_cur_euro) {
		this.r0260_analy_by_cur_euro = r0260_analy_by_cur_euro;
	}
	public BigDecimal getR0260_analy_by_cur_swiss_franc() {
		return r0260_analy_by_cur_swiss_franc;
	}
	public void setR0260_analy_by_cur_swiss_franc(BigDecimal r0260_analy_by_cur_swiss_franc) {
		this.r0260_analy_by_cur_swiss_franc = r0260_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0260_analy_by_cur_uk_sterling() {
		return r0260_analy_by_cur_uk_sterling;
	}
	public void setR0260_analy_by_cur_uk_sterling(BigDecimal r0260_analy_by_cur_uk_sterling) {
		this.r0260_analy_by_cur_uk_sterling = r0260_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0260_analy_by_cur_chinese_yuan() {
		return r0260_analy_by_cur_chinese_yuan;
	}
	public void setR0260_analy_by_cur_chinese_yuan(BigDecimal r0260_analy_by_cur_chinese_yuan) {
		this.r0260_analy_by_cur_chinese_yuan = r0260_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0260_analy_by_cur_japanese_yen() {
		return r0260_analy_by_cur_japanese_yen;
	}
	public void setR0260_analy_by_cur_japanese_yen(BigDecimal r0260_analy_by_cur_japanese_yen) {
		this.r0260_analy_by_cur_japanese_yen = r0260_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0260_analy_by_cur_bahraini_dinar() {
		return r0260_analy_by_cur_bahraini_dinar;
	}
	public void setR0260_analy_by_cur_bahraini_dinar(BigDecimal r0260_analy_by_cur_bahraini_dinar) {
		this.r0260_analy_by_cur_bahraini_dinar = r0260_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0260_analy_by_cur_kuwaiti_dinar() {
		return r0260_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0260_analy_by_cur_kuwaiti_dinar(BigDecimal r0260_analy_by_cur_kuwaiti_dinar) {
		this.r0260_analy_by_cur_kuwaiti_dinar = r0260_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0260_analy_by_cur_qatari_ryal() {
		return r0260_analy_by_cur_qatari_ryal;
	}
	public void setR0260_analy_by_cur_qatari_ryal(BigDecimal r0260_analy_by_cur_qatari_ryal) {
		this.r0260_analy_by_cur_qatari_ryal = r0260_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0260_analy_by_cur_saudi_riyal() {
		return r0260_analy_by_cur_saudi_riyal;
	}
	public void setR0260_analy_by_cur_saudi_riyal(BigDecimal r0260_analy_by_cur_saudi_riyal) {
		this.r0260_analy_by_cur_saudi_riyal = r0260_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0260_analy_by_cur_other_fgn_currencies() {
		return r0260_analy_by_cur_other_fgn_currencies;
	}
	public void setR0260_analy_by_cur_other_fgn_currencies(BigDecimal r0260_analy_by_cur_other_fgn_currencies) {
		this.r0260_analy_by_cur_other_fgn_currencies = r0260_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0260_analy_by_cur_oth_indivi_fgn_curr() {
		return r0260_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0260_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0260_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0260_analy_by_cur_oth_indivi_fgn_curr = r0260_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0270_product() {
		return r0270_product;
	}
	public void setR0270_product(String r0270_product) {
		this.r0270_product = r0270_product;
	}
	public BigDecimal getR0270_analy_by_cur_us_dollar() {
		return r0270_analy_by_cur_us_dollar;
	}
	public void setR0270_analy_by_cur_us_dollar(BigDecimal r0270_analy_by_cur_us_dollar) {
		this.r0270_analy_by_cur_us_dollar = r0270_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0270_analy_by_cur_euro() {
		return r0270_analy_by_cur_euro;
	}
	public void setR0270_analy_by_cur_euro(BigDecimal r0270_analy_by_cur_euro) {
		this.r0270_analy_by_cur_euro = r0270_analy_by_cur_euro;
	}
	public BigDecimal getR0270_analy_by_cur_swiss_franc() {
		return r0270_analy_by_cur_swiss_franc;
	}
	public void setR0270_analy_by_cur_swiss_franc(BigDecimal r0270_analy_by_cur_swiss_franc) {
		this.r0270_analy_by_cur_swiss_franc = r0270_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0270_analy_by_cur_uk_sterling() {
		return r0270_analy_by_cur_uk_sterling;
	}
	public void setR0270_analy_by_cur_uk_sterling(BigDecimal r0270_analy_by_cur_uk_sterling) {
		this.r0270_analy_by_cur_uk_sterling = r0270_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0270_analy_by_cur_chinese_yuan() {
		return r0270_analy_by_cur_chinese_yuan;
	}
	public void setR0270_analy_by_cur_chinese_yuan(BigDecimal r0270_analy_by_cur_chinese_yuan) {
		this.r0270_analy_by_cur_chinese_yuan = r0270_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0270_analy_by_cur_japanese_yen() {
		return r0270_analy_by_cur_japanese_yen;
	}
	public void setR0270_analy_by_cur_japanese_yen(BigDecimal r0270_analy_by_cur_japanese_yen) {
		this.r0270_analy_by_cur_japanese_yen = r0270_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0270_analy_by_cur_bahraini_dinar() {
		return r0270_analy_by_cur_bahraini_dinar;
	}
	public void setR0270_analy_by_cur_bahraini_dinar(BigDecimal r0270_analy_by_cur_bahraini_dinar) {
		this.r0270_analy_by_cur_bahraini_dinar = r0270_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0270_analy_by_cur_kuwaiti_dinar() {
		return r0270_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0270_analy_by_cur_kuwaiti_dinar(BigDecimal r0270_analy_by_cur_kuwaiti_dinar) {
		this.r0270_analy_by_cur_kuwaiti_dinar = r0270_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0270_analy_by_cur_qatari_ryal() {
		return r0270_analy_by_cur_qatari_ryal;
	}
	public void setR0270_analy_by_cur_qatari_ryal(BigDecimal r0270_analy_by_cur_qatari_ryal) {
		this.r0270_analy_by_cur_qatari_ryal = r0270_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0270_analy_by_cur_saudi_riyal() {
		return r0270_analy_by_cur_saudi_riyal;
	}
	public void setR0270_analy_by_cur_saudi_riyal(BigDecimal r0270_analy_by_cur_saudi_riyal) {
		this.r0270_analy_by_cur_saudi_riyal = r0270_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0270_analy_by_cur_other_fgn_currencies() {
		return r0270_analy_by_cur_other_fgn_currencies;
	}
	public void setR0270_analy_by_cur_other_fgn_currencies(BigDecimal r0270_analy_by_cur_other_fgn_currencies) {
		this.r0270_analy_by_cur_other_fgn_currencies = r0270_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0270_analy_by_cur_oth_indivi_fgn_curr() {
		return r0270_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0270_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0270_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0270_analy_by_cur_oth_indivi_fgn_curr = r0270_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0280_product() {
		return r0280_product;
	}
	public void setR0280_product(String r0280_product) {
		this.r0280_product = r0280_product;
	}
	public BigDecimal getR0280_analy_by_cur_us_dollar() {
		return r0280_analy_by_cur_us_dollar;
	}
	public void setR0280_analy_by_cur_us_dollar(BigDecimal r0280_analy_by_cur_us_dollar) {
		this.r0280_analy_by_cur_us_dollar = r0280_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0280_analy_by_cur_euro() {
		return r0280_analy_by_cur_euro;
	}
	public void setR0280_analy_by_cur_euro(BigDecimal r0280_analy_by_cur_euro) {
		this.r0280_analy_by_cur_euro = r0280_analy_by_cur_euro;
	}
	public BigDecimal getR0280_analy_by_cur_swiss_franc() {
		return r0280_analy_by_cur_swiss_franc;
	}
	public void setR0280_analy_by_cur_swiss_franc(BigDecimal r0280_analy_by_cur_swiss_franc) {
		this.r0280_analy_by_cur_swiss_franc = r0280_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0280_analy_by_cur_uk_sterling() {
		return r0280_analy_by_cur_uk_sterling;
	}
	public void setR0280_analy_by_cur_uk_sterling(BigDecimal r0280_analy_by_cur_uk_sterling) {
		this.r0280_analy_by_cur_uk_sterling = r0280_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0280_analy_by_cur_chinese_yuan() {
		return r0280_analy_by_cur_chinese_yuan;
	}
	public void setR0280_analy_by_cur_chinese_yuan(BigDecimal r0280_analy_by_cur_chinese_yuan) {
		this.r0280_analy_by_cur_chinese_yuan = r0280_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0280_analy_by_cur_japanese_yen() {
		return r0280_analy_by_cur_japanese_yen;
	}
	public void setR0280_analy_by_cur_japanese_yen(BigDecimal r0280_analy_by_cur_japanese_yen) {
		this.r0280_analy_by_cur_japanese_yen = r0280_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0280_analy_by_cur_bahraini_dinar() {
		return r0280_analy_by_cur_bahraini_dinar;
	}
	public void setR0280_analy_by_cur_bahraini_dinar(BigDecimal r0280_analy_by_cur_bahraini_dinar) {
		this.r0280_analy_by_cur_bahraini_dinar = r0280_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0280_analy_by_cur_kuwaiti_dinar() {
		return r0280_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0280_analy_by_cur_kuwaiti_dinar(BigDecimal r0280_analy_by_cur_kuwaiti_dinar) {
		this.r0280_analy_by_cur_kuwaiti_dinar = r0280_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0280_analy_by_cur_qatari_ryal() {
		return r0280_analy_by_cur_qatari_ryal;
	}
	public void setR0280_analy_by_cur_qatari_ryal(BigDecimal r0280_analy_by_cur_qatari_ryal) {
		this.r0280_analy_by_cur_qatari_ryal = r0280_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0280_analy_by_cur_saudi_riyal() {
		return r0280_analy_by_cur_saudi_riyal;
	}
	public void setR0280_analy_by_cur_saudi_riyal(BigDecimal r0280_analy_by_cur_saudi_riyal) {
		this.r0280_analy_by_cur_saudi_riyal = r0280_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0280_analy_by_cur_other_fgn_currencies() {
		return r0280_analy_by_cur_other_fgn_currencies;
	}
	public void setR0280_analy_by_cur_other_fgn_currencies(BigDecimal r0280_analy_by_cur_other_fgn_currencies) {
		this.r0280_analy_by_cur_other_fgn_currencies = r0280_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0280_analy_by_cur_oth_indivi_fgn_curr() {
		return r0280_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0280_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0280_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0280_analy_by_cur_oth_indivi_fgn_curr = r0280_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0290_product() {
		return r0290_product;
	}
	public void setR0290_product(String r0290_product) {
		this.r0290_product = r0290_product;
	}
	public BigDecimal getR0290_analy_by_cur_us_dollar() {
		return r0290_analy_by_cur_us_dollar;
	}
	public void setR0290_analy_by_cur_us_dollar(BigDecimal r0290_analy_by_cur_us_dollar) {
		this.r0290_analy_by_cur_us_dollar = r0290_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0290_analy_by_cur_euro() {
		return r0290_analy_by_cur_euro;
	}
	public void setR0290_analy_by_cur_euro(BigDecimal r0290_analy_by_cur_euro) {
		this.r0290_analy_by_cur_euro = r0290_analy_by_cur_euro;
	}
	public BigDecimal getR0290_analy_by_cur_swiss_franc() {
		return r0290_analy_by_cur_swiss_franc;
	}
	public void setR0290_analy_by_cur_swiss_franc(BigDecimal r0290_analy_by_cur_swiss_franc) {
		this.r0290_analy_by_cur_swiss_franc = r0290_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0290_analy_by_cur_uk_sterling() {
		return r0290_analy_by_cur_uk_sterling;
	}
	public void setR0290_analy_by_cur_uk_sterling(BigDecimal r0290_analy_by_cur_uk_sterling) {
		this.r0290_analy_by_cur_uk_sterling = r0290_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0290_analy_by_cur_chinese_yuan() {
		return r0290_analy_by_cur_chinese_yuan;
	}
	public void setR0290_analy_by_cur_chinese_yuan(BigDecimal r0290_analy_by_cur_chinese_yuan) {
		this.r0290_analy_by_cur_chinese_yuan = r0290_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0290_analy_by_cur_japanese_yen() {
		return r0290_analy_by_cur_japanese_yen;
	}
	public void setR0290_analy_by_cur_japanese_yen(BigDecimal r0290_analy_by_cur_japanese_yen) {
		this.r0290_analy_by_cur_japanese_yen = r0290_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0290_analy_by_cur_bahraini_dinar() {
		return r0290_analy_by_cur_bahraini_dinar;
	}
	public void setR0290_analy_by_cur_bahraini_dinar(BigDecimal r0290_analy_by_cur_bahraini_dinar) {
		this.r0290_analy_by_cur_bahraini_dinar = r0290_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0290_analy_by_cur_kuwaiti_dinar() {
		return r0290_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0290_analy_by_cur_kuwaiti_dinar(BigDecimal r0290_analy_by_cur_kuwaiti_dinar) {
		this.r0290_analy_by_cur_kuwaiti_dinar = r0290_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0290_analy_by_cur_qatari_ryal() {
		return r0290_analy_by_cur_qatari_ryal;
	}
	public void setR0290_analy_by_cur_qatari_ryal(BigDecimal r0290_analy_by_cur_qatari_ryal) {
		this.r0290_analy_by_cur_qatari_ryal = r0290_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0290_analy_by_cur_saudi_riyal() {
		return r0290_analy_by_cur_saudi_riyal;
	}
	public void setR0290_analy_by_cur_saudi_riyal(BigDecimal r0290_analy_by_cur_saudi_riyal) {
		this.r0290_analy_by_cur_saudi_riyal = r0290_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0290_analy_by_cur_other_fgn_currencies() {
		return r0290_analy_by_cur_other_fgn_currencies;
	}
	public void setR0290_analy_by_cur_other_fgn_currencies(BigDecimal r0290_analy_by_cur_other_fgn_currencies) {
		this.r0290_analy_by_cur_other_fgn_currencies = r0290_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0290_analy_by_cur_oth_indivi_fgn_curr() {
		return r0290_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0290_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0290_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0290_analy_by_cur_oth_indivi_fgn_curr = r0290_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0300_product() {
		return r0300_product;
	}
	public void setR0300_product(String r0300_product) {
		this.r0300_product = r0300_product;
	}
	public BigDecimal getR0300_analy_by_cur_us_dollar() {
		return r0300_analy_by_cur_us_dollar;
	}
	public void setR0300_analy_by_cur_us_dollar(BigDecimal r0300_analy_by_cur_us_dollar) {
		this.r0300_analy_by_cur_us_dollar = r0300_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0300_analy_by_cur_euro() {
		return r0300_analy_by_cur_euro;
	}
	public void setR0300_analy_by_cur_euro(BigDecimal r0300_analy_by_cur_euro) {
		this.r0300_analy_by_cur_euro = r0300_analy_by_cur_euro;
	}
	public BigDecimal getR0300_analy_by_cur_swiss_franc() {
		return r0300_analy_by_cur_swiss_franc;
	}
	public void setR0300_analy_by_cur_swiss_franc(BigDecimal r0300_analy_by_cur_swiss_franc) {
		this.r0300_analy_by_cur_swiss_franc = r0300_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0300_analy_by_cur_uk_sterling() {
		return r0300_analy_by_cur_uk_sterling;
	}
	public void setR0300_analy_by_cur_uk_sterling(BigDecimal r0300_analy_by_cur_uk_sterling) {
		this.r0300_analy_by_cur_uk_sterling = r0300_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0300_analy_by_cur_chinese_yuan() {
		return r0300_analy_by_cur_chinese_yuan;
	}
	public void setR0300_analy_by_cur_chinese_yuan(BigDecimal r0300_analy_by_cur_chinese_yuan) {
		this.r0300_analy_by_cur_chinese_yuan = r0300_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0300_analy_by_cur_japanese_yen() {
		return r0300_analy_by_cur_japanese_yen;
	}
	public void setR0300_analy_by_cur_japanese_yen(BigDecimal r0300_analy_by_cur_japanese_yen) {
		this.r0300_analy_by_cur_japanese_yen = r0300_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0300_analy_by_cur_bahraini_dinar() {
		return r0300_analy_by_cur_bahraini_dinar;
	}
	public void setR0300_analy_by_cur_bahraini_dinar(BigDecimal r0300_analy_by_cur_bahraini_dinar) {
		this.r0300_analy_by_cur_bahraini_dinar = r0300_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0300_analy_by_cur_kuwaiti_dinar() {
		return r0300_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0300_analy_by_cur_kuwaiti_dinar(BigDecimal r0300_analy_by_cur_kuwaiti_dinar) {
		this.r0300_analy_by_cur_kuwaiti_dinar = r0300_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0300_analy_by_cur_qatari_ryal() {
		return r0300_analy_by_cur_qatari_ryal;
	}
	public void setR0300_analy_by_cur_qatari_ryal(BigDecimal r0300_analy_by_cur_qatari_ryal) {
		this.r0300_analy_by_cur_qatari_ryal = r0300_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0300_analy_by_cur_saudi_riyal() {
		return r0300_analy_by_cur_saudi_riyal;
	}
	public void setR0300_analy_by_cur_saudi_riyal(BigDecimal r0300_analy_by_cur_saudi_riyal) {
		this.r0300_analy_by_cur_saudi_riyal = r0300_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0300_analy_by_cur_other_fgn_currencies() {
		return r0300_analy_by_cur_other_fgn_currencies;
	}
	public void setR0300_analy_by_cur_other_fgn_currencies(BigDecimal r0300_analy_by_cur_other_fgn_currencies) {
		this.r0300_analy_by_cur_other_fgn_currencies = r0300_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0300_analy_by_cur_oth_indivi_fgn_curr() {
		return r0300_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0300_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0300_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0300_analy_by_cur_oth_indivi_fgn_curr = r0300_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0310_product() {
		return r0310_product;
	}
	public void setR0310_product(String r0310_product) {
		this.r0310_product = r0310_product;
	}
	public BigDecimal getR0310_analy_by_cur_us_dollar() {
		return r0310_analy_by_cur_us_dollar;
	}
	public void setR0310_analy_by_cur_us_dollar(BigDecimal r0310_analy_by_cur_us_dollar) {
		this.r0310_analy_by_cur_us_dollar = r0310_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0310_analy_by_cur_euro() {
		return r0310_analy_by_cur_euro;
	}
	public void setR0310_analy_by_cur_euro(BigDecimal r0310_analy_by_cur_euro) {
		this.r0310_analy_by_cur_euro = r0310_analy_by_cur_euro;
	}
	public BigDecimal getR0310_analy_by_cur_swiss_franc() {
		return r0310_analy_by_cur_swiss_franc;
	}
	public void setR0310_analy_by_cur_swiss_franc(BigDecimal r0310_analy_by_cur_swiss_franc) {
		this.r0310_analy_by_cur_swiss_franc = r0310_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0310_analy_by_cur_uk_sterling() {
		return r0310_analy_by_cur_uk_sterling;
	}
	public void setR0310_analy_by_cur_uk_sterling(BigDecimal r0310_analy_by_cur_uk_sterling) {
		this.r0310_analy_by_cur_uk_sterling = r0310_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0310_analy_by_cur_chinese_yuan() {
		return r0310_analy_by_cur_chinese_yuan;
	}
	public void setR0310_analy_by_cur_chinese_yuan(BigDecimal r0310_analy_by_cur_chinese_yuan) {
		this.r0310_analy_by_cur_chinese_yuan = r0310_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0310_analy_by_cur_japanese_yen() {
		return r0310_analy_by_cur_japanese_yen;
	}
	public void setR0310_analy_by_cur_japanese_yen(BigDecimal r0310_analy_by_cur_japanese_yen) {
		this.r0310_analy_by_cur_japanese_yen = r0310_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0310_analy_by_cur_bahraini_dinar() {
		return r0310_analy_by_cur_bahraini_dinar;
	}
	public void setR0310_analy_by_cur_bahraini_dinar(BigDecimal r0310_analy_by_cur_bahraini_dinar) {
		this.r0310_analy_by_cur_bahraini_dinar = r0310_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0310_analy_by_cur_kuwaiti_dinar() {
		return r0310_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0310_analy_by_cur_kuwaiti_dinar(BigDecimal r0310_analy_by_cur_kuwaiti_dinar) {
		this.r0310_analy_by_cur_kuwaiti_dinar = r0310_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0310_analy_by_cur_qatari_ryal() {
		return r0310_analy_by_cur_qatari_ryal;
	}
	public void setR0310_analy_by_cur_qatari_ryal(BigDecimal r0310_analy_by_cur_qatari_ryal) {
		this.r0310_analy_by_cur_qatari_ryal = r0310_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0310_analy_by_cur_saudi_riyal() {
		return r0310_analy_by_cur_saudi_riyal;
	}
	public void setR0310_analy_by_cur_saudi_riyal(BigDecimal r0310_analy_by_cur_saudi_riyal) {
		this.r0310_analy_by_cur_saudi_riyal = r0310_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0310_analy_by_cur_other_fgn_currencies() {
		return r0310_analy_by_cur_other_fgn_currencies;
	}
	public void setR0310_analy_by_cur_other_fgn_currencies(BigDecimal r0310_analy_by_cur_other_fgn_currencies) {
		this.r0310_analy_by_cur_other_fgn_currencies = r0310_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0310_analy_by_cur_oth_indivi_fgn_curr() {
		return r0310_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0310_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0310_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0310_analy_by_cur_oth_indivi_fgn_curr = r0310_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0320_product() {
		return r0320_product;
	}
	public void setR0320_product(String r0320_product) {
		this.r0320_product = r0320_product;
	}
	public BigDecimal getR0320_analy_by_cur_us_dollar() {
		return r0320_analy_by_cur_us_dollar;
	}
	public void setR0320_analy_by_cur_us_dollar(BigDecimal r0320_analy_by_cur_us_dollar) {
		this.r0320_analy_by_cur_us_dollar = r0320_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0320_analy_by_cur_euro() {
		return r0320_analy_by_cur_euro;
	}
	public void setR0320_analy_by_cur_euro(BigDecimal r0320_analy_by_cur_euro) {
		this.r0320_analy_by_cur_euro = r0320_analy_by_cur_euro;
	}
	public BigDecimal getR0320_analy_by_cur_swiss_franc() {
		return r0320_analy_by_cur_swiss_franc;
	}
	public void setR0320_analy_by_cur_swiss_franc(BigDecimal r0320_analy_by_cur_swiss_franc) {
		this.r0320_analy_by_cur_swiss_franc = r0320_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0320_analy_by_cur_uk_sterling() {
		return r0320_analy_by_cur_uk_sterling;
	}
	public void setR0320_analy_by_cur_uk_sterling(BigDecimal r0320_analy_by_cur_uk_sterling) {
		this.r0320_analy_by_cur_uk_sterling = r0320_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0320_analy_by_cur_chinese_yuan() {
		return r0320_analy_by_cur_chinese_yuan;
	}
	public void setR0320_analy_by_cur_chinese_yuan(BigDecimal r0320_analy_by_cur_chinese_yuan) {
		this.r0320_analy_by_cur_chinese_yuan = r0320_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0320_analy_by_cur_japanese_yen() {
		return r0320_analy_by_cur_japanese_yen;
	}
	public void setR0320_analy_by_cur_japanese_yen(BigDecimal r0320_analy_by_cur_japanese_yen) {
		this.r0320_analy_by_cur_japanese_yen = r0320_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0320_analy_by_cur_bahraini_dinar() {
		return r0320_analy_by_cur_bahraini_dinar;
	}
	public void setR0320_analy_by_cur_bahraini_dinar(BigDecimal r0320_analy_by_cur_bahraini_dinar) {
		this.r0320_analy_by_cur_bahraini_dinar = r0320_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0320_analy_by_cur_kuwaiti_dinar() {
		return r0320_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0320_analy_by_cur_kuwaiti_dinar(BigDecimal r0320_analy_by_cur_kuwaiti_dinar) {
		this.r0320_analy_by_cur_kuwaiti_dinar = r0320_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0320_analy_by_cur_qatari_ryal() {
		return r0320_analy_by_cur_qatari_ryal;
	}
	public void setR0320_analy_by_cur_qatari_ryal(BigDecimal r0320_analy_by_cur_qatari_ryal) {
		this.r0320_analy_by_cur_qatari_ryal = r0320_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0320_analy_by_cur_saudi_riyal() {
		return r0320_analy_by_cur_saudi_riyal;
	}
	public void setR0320_analy_by_cur_saudi_riyal(BigDecimal r0320_analy_by_cur_saudi_riyal) {
		this.r0320_analy_by_cur_saudi_riyal = r0320_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0320_analy_by_cur_other_fgn_currencies() {
		return r0320_analy_by_cur_other_fgn_currencies;
	}
	public void setR0320_analy_by_cur_other_fgn_currencies(BigDecimal r0320_analy_by_cur_other_fgn_currencies) {
		this.r0320_analy_by_cur_other_fgn_currencies = r0320_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0320_analy_by_cur_oth_indivi_fgn_curr() {
		return r0320_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0320_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0320_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0320_analy_by_cur_oth_indivi_fgn_curr = r0320_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0330_product() {
		return r0330_product;
	}
	public void setR0330_product(String r0330_product) {
		this.r0330_product = r0330_product;
	}
	public BigDecimal getR0330_analy_by_cur_us_dollar() {
		return r0330_analy_by_cur_us_dollar;
	}
	public void setR0330_analy_by_cur_us_dollar(BigDecimal r0330_analy_by_cur_us_dollar) {
		this.r0330_analy_by_cur_us_dollar = r0330_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0330_analy_by_cur_euro() {
		return r0330_analy_by_cur_euro;
	}
	public void setR0330_analy_by_cur_euro(BigDecimal r0330_analy_by_cur_euro) {
		this.r0330_analy_by_cur_euro = r0330_analy_by_cur_euro;
	}
	public BigDecimal getR0330_analy_by_cur_swiss_franc() {
		return r0330_analy_by_cur_swiss_franc;
	}
	public void setR0330_analy_by_cur_swiss_franc(BigDecimal r0330_analy_by_cur_swiss_franc) {
		this.r0330_analy_by_cur_swiss_franc = r0330_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0330_analy_by_cur_uk_sterling() {
		return r0330_analy_by_cur_uk_sterling;
	}
	public void setR0330_analy_by_cur_uk_sterling(BigDecimal r0330_analy_by_cur_uk_sterling) {
		this.r0330_analy_by_cur_uk_sterling = r0330_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0330_analy_by_cur_chinese_yuan() {
		return r0330_analy_by_cur_chinese_yuan;
	}
	public void setR0330_analy_by_cur_chinese_yuan(BigDecimal r0330_analy_by_cur_chinese_yuan) {
		this.r0330_analy_by_cur_chinese_yuan = r0330_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0330_analy_by_cur_japanese_yen() {
		return r0330_analy_by_cur_japanese_yen;
	}
	public void setR0330_analy_by_cur_japanese_yen(BigDecimal r0330_analy_by_cur_japanese_yen) {
		this.r0330_analy_by_cur_japanese_yen = r0330_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0330_analy_by_cur_bahraini_dinar() {
		return r0330_analy_by_cur_bahraini_dinar;
	}
	public void setR0330_analy_by_cur_bahraini_dinar(BigDecimal r0330_analy_by_cur_bahraini_dinar) {
		this.r0330_analy_by_cur_bahraini_dinar = r0330_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0330_analy_by_cur_kuwaiti_dinar() {
		return r0330_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0330_analy_by_cur_kuwaiti_dinar(BigDecimal r0330_analy_by_cur_kuwaiti_dinar) {
		this.r0330_analy_by_cur_kuwaiti_dinar = r0330_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0330_analy_by_cur_qatari_ryal() {
		return r0330_analy_by_cur_qatari_ryal;
	}
	public void setR0330_analy_by_cur_qatari_ryal(BigDecimal r0330_analy_by_cur_qatari_ryal) {
		this.r0330_analy_by_cur_qatari_ryal = r0330_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0330_analy_by_cur_saudi_riyal() {
		return r0330_analy_by_cur_saudi_riyal;
	}
	public void setR0330_analy_by_cur_saudi_riyal(BigDecimal r0330_analy_by_cur_saudi_riyal) {
		this.r0330_analy_by_cur_saudi_riyal = r0330_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0330_analy_by_cur_other_fgn_currencies() {
		return r0330_analy_by_cur_other_fgn_currencies;
	}
	public void setR0330_analy_by_cur_other_fgn_currencies(BigDecimal r0330_analy_by_cur_other_fgn_currencies) {
		this.r0330_analy_by_cur_other_fgn_currencies = r0330_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0330_analy_by_cur_oth_indivi_fgn_curr() {
		return r0330_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0330_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0330_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0330_analy_by_cur_oth_indivi_fgn_curr = r0330_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0340_product() {
		return r0340_product;
	}
	public void setR0340_product(String r0340_product) {
		this.r0340_product = r0340_product;
	}
	public BigDecimal getR0340_analy_by_cur_us_dollar() {
		return r0340_analy_by_cur_us_dollar;
	}
	public void setR0340_analy_by_cur_us_dollar(BigDecimal r0340_analy_by_cur_us_dollar) {
		this.r0340_analy_by_cur_us_dollar = r0340_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0340_analy_by_cur_euro() {
		return r0340_analy_by_cur_euro;
	}
	public void setR0340_analy_by_cur_euro(BigDecimal r0340_analy_by_cur_euro) {
		this.r0340_analy_by_cur_euro = r0340_analy_by_cur_euro;
	}
	public BigDecimal getR0340_analy_by_cur_swiss_franc() {
		return r0340_analy_by_cur_swiss_franc;
	}
	public void setR0340_analy_by_cur_swiss_franc(BigDecimal r0340_analy_by_cur_swiss_franc) {
		this.r0340_analy_by_cur_swiss_franc = r0340_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0340_analy_by_cur_uk_sterling() {
		return r0340_analy_by_cur_uk_sterling;
	}
	public void setR0340_analy_by_cur_uk_sterling(BigDecimal r0340_analy_by_cur_uk_sterling) {
		this.r0340_analy_by_cur_uk_sterling = r0340_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0340_analy_by_cur_chinese_yuan() {
		return r0340_analy_by_cur_chinese_yuan;
	}
	public void setR0340_analy_by_cur_chinese_yuan(BigDecimal r0340_analy_by_cur_chinese_yuan) {
		this.r0340_analy_by_cur_chinese_yuan = r0340_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0340_analy_by_cur_japanese_yen() {
		return r0340_analy_by_cur_japanese_yen;
	}
	public void setR0340_analy_by_cur_japanese_yen(BigDecimal r0340_analy_by_cur_japanese_yen) {
		this.r0340_analy_by_cur_japanese_yen = r0340_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0340_analy_by_cur_bahraini_dinar() {
		return r0340_analy_by_cur_bahraini_dinar;
	}
	public void setR0340_analy_by_cur_bahraini_dinar(BigDecimal r0340_analy_by_cur_bahraini_dinar) {
		this.r0340_analy_by_cur_bahraini_dinar = r0340_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0340_analy_by_cur_kuwaiti_dinar() {
		return r0340_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0340_analy_by_cur_kuwaiti_dinar(BigDecimal r0340_analy_by_cur_kuwaiti_dinar) {
		this.r0340_analy_by_cur_kuwaiti_dinar = r0340_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0340_analy_by_cur_qatari_ryal() {
		return r0340_analy_by_cur_qatari_ryal;
	}
	public void setR0340_analy_by_cur_qatari_ryal(BigDecimal r0340_analy_by_cur_qatari_ryal) {
		this.r0340_analy_by_cur_qatari_ryal = r0340_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0340_analy_by_cur_saudi_riyal() {
		return r0340_analy_by_cur_saudi_riyal;
	}
	public void setR0340_analy_by_cur_saudi_riyal(BigDecimal r0340_analy_by_cur_saudi_riyal) {
		this.r0340_analy_by_cur_saudi_riyal = r0340_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0340_analy_by_cur_other_fgn_currencies() {
		return r0340_analy_by_cur_other_fgn_currencies;
	}
	public void setR0340_analy_by_cur_other_fgn_currencies(BigDecimal r0340_analy_by_cur_other_fgn_currencies) {
		this.r0340_analy_by_cur_other_fgn_currencies = r0340_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0340_analy_by_cur_oth_indivi_fgn_curr() {
		return r0340_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0340_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0340_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0340_analy_by_cur_oth_indivi_fgn_curr = r0340_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0350_product() {
		return r0350_product;
	}
	public void setR0350_product(String r0350_product) {
		this.r0350_product = r0350_product;
	}
	public BigDecimal getR0350_analy_by_cur_us_dollar() {
		return r0350_analy_by_cur_us_dollar;
	}
	public void setR0350_analy_by_cur_us_dollar(BigDecimal r0350_analy_by_cur_us_dollar) {
		this.r0350_analy_by_cur_us_dollar = r0350_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0350_analy_by_cur_euro() {
		return r0350_analy_by_cur_euro;
	}
	public void setR0350_analy_by_cur_euro(BigDecimal r0350_analy_by_cur_euro) {
		this.r0350_analy_by_cur_euro = r0350_analy_by_cur_euro;
	}
	public BigDecimal getR0350_analy_by_cur_swiss_franc() {
		return r0350_analy_by_cur_swiss_franc;
	}
	public void setR0350_analy_by_cur_swiss_franc(BigDecimal r0350_analy_by_cur_swiss_franc) {
		this.r0350_analy_by_cur_swiss_franc = r0350_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0350_analy_by_cur_uk_sterling() {
		return r0350_analy_by_cur_uk_sterling;
	}
	public void setR0350_analy_by_cur_uk_sterling(BigDecimal r0350_analy_by_cur_uk_sterling) {
		this.r0350_analy_by_cur_uk_sterling = r0350_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0350_analy_by_cur_chinese_yuan() {
		return r0350_analy_by_cur_chinese_yuan;
	}
	public void setR0350_analy_by_cur_chinese_yuan(BigDecimal r0350_analy_by_cur_chinese_yuan) {
		this.r0350_analy_by_cur_chinese_yuan = r0350_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0350_analy_by_cur_japanese_yen() {
		return r0350_analy_by_cur_japanese_yen;
	}
	public void setR0350_analy_by_cur_japanese_yen(BigDecimal r0350_analy_by_cur_japanese_yen) {
		this.r0350_analy_by_cur_japanese_yen = r0350_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0350_analy_by_cur_bahraini_dinar() {
		return r0350_analy_by_cur_bahraini_dinar;
	}
	public void setR0350_analy_by_cur_bahraini_dinar(BigDecimal r0350_analy_by_cur_bahraini_dinar) {
		this.r0350_analy_by_cur_bahraini_dinar = r0350_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0350_analy_by_cur_kuwaiti_dinar() {
		return r0350_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0350_analy_by_cur_kuwaiti_dinar(BigDecimal r0350_analy_by_cur_kuwaiti_dinar) {
		this.r0350_analy_by_cur_kuwaiti_dinar = r0350_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0350_analy_by_cur_qatari_ryal() {
		return r0350_analy_by_cur_qatari_ryal;
	}
	public void setR0350_analy_by_cur_qatari_ryal(BigDecimal r0350_analy_by_cur_qatari_ryal) {
		this.r0350_analy_by_cur_qatari_ryal = r0350_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0350_analy_by_cur_saudi_riyal() {
		return r0350_analy_by_cur_saudi_riyal;
	}
	public void setR0350_analy_by_cur_saudi_riyal(BigDecimal r0350_analy_by_cur_saudi_riyal) {
		this.r0350_analy_by_cur_saudi_riyal = r0350_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0350_analy_by_cur_other_fgn_currencies() {
		return r0350_analy_by_cur_other_fgn_currencies;
	}
	public void setR0350_analy_by_cur_other_fgn_currencies(BigDecimal r0350_analy_by_cur_other_fgn_currencies) {
		this.r0350_analy_by_cur_other_fgn_currencies = r0350_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0350_analy_by_cur_oth_indivi_fgn_curr() {
		return r0350_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0350_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0350_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0350_analy_by_cur_oth_indivi_fgn_curr = r0350_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0360_product() {
		return r0360_product;
	}
	public void setR0360_product(String r0360_product) {
		this.r0360_product = r0360_product;
	}
	public BigDecimal getR0360_analy_by_cur_us_dollar() {
		return r0360_analy_by_cur_us_dollar;
	}
	public void setR0360_analy_by_cur_us_dollar(BigDecimal r0360_analy_by_cur_us_dollar) {
		this.r0360_analy_by_cur_us_dollar = r0360_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0360_analy_by_cur_euro() {
		return r0360_analy_by_cur_euro;
	}
	public void setR0360_analy_by_cur_euro(BigDecimal r0360_analy_by_cur_euro) {
		this.r0360_analy_by_cur_euro = r0360_analy_by_cur_euro;
	}
	public BigDecimal getR0360_analy_by_cur_swiss_franc() {
		return r0360_analy_by_cur_swiss_franc;
	}
	public void setR0360_analy_by_cur_swiss_franc(BigDecimal r0360_analy_by_cur_swiss_franc) {
		this.r0360_analy_by_cur_swiss_franc = r0360_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0360_analy_by_cur_uk_sterling() {
		return r0360_analy_by_cur_uk_sterling;
	}
	public void setR0360_analy_by_cur_uk_sterling(BigDecimal r0360_analy_by_cur_uk_sterling) {
		this.r0360_analy_by_cur_uk_sterling = r0360_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0360_analy_by_cur_chinese_yuan() {
		return r0360_analy_by_cur_chinese_yuan;
	}
	public void setR0360_analy_by_cur_chinese_yuan(BigDecimal r0360_analy_by_cur_chinese_yuan) {
		this.r0360_analy_by_cur_chinese_yuan = r0360_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0360_analy_by_cur_japanese_yen() {
		return r0360_analy_by_cur_japanese_yen;
	}
	public void setR0360_analy_by_cur_japanese_yen(BigDecimal r0360_analy_by_cur_japanese_yen) {
		this.r0360_analy_by_cur_japanese_yen = r0360_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0360_analy_by_cur_bahraini_dinar() {
		return r0360_analy_by_cur_bahraini_dinar;
	}
	public void setR0360_analy_by_cur_bahraini_dinar(BigDecimal r0360_analy_by_cur_bahraini_dinar) {
		this.r0360_analy_by_cur_bahraini_dinar = r0360_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0360_analy_by_cur_kuwaiti_dinar() {
		return r0360_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0360_analy_by_cur_kuwaiti_dinar(BigDecimal r0360_analy_by_cur_kuwaiti_dinar) {
		this.r0360_analy_by_cur_kuwaiti_dinar = r0360_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0360_analy_by_cur_qatari_ryal() {
		return r0360_analy_by_cur_qatari_ryal;
	}
	public void setR0360_analy_by_cur_qatari_ryal(BigDecimal r0360_analy_by_cur_qatari_ryal) {
		this.r0360_analy_by_cur_qatari_ryal = r0360_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0360_analy_by_cur_saudi_riyal() {
		return r0360_analy_by_cur_saudi_riyal;
	}
	public void setR0360_analy_by_cur_saudi_riyal(BigDecimal r0360_analy_by_cur_saudi_riyal) {
		this.r0360_analy_by_cur_saudi_riyal = r0360_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0360_analy_by_cur_other_fgn_currencies() {
		return r0360_analy_by_cur_other_fgn_currencies;
	}
	public void setR0360_analy_by_cur_other_fgn_currencies(BigDecimal r0360_analy_by_cur_other_fgn_currencies) {
		this.r0360_analy_by_cur_other_fgn_currencies = r0360_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0360_analy_by_cur_oth_indivi_fgn_curr() {
		return r0360_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0360_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0360_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0360_analy_by_cur_oth_indivi_fgn_curr = r0360_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0370_product() {
		return r0370_product;
	}
	public void setR0370_product(String r0370_product) {
		this.r0370_product = r0370_product;
	}
	public BigDecimal getR0370_analy_by_cur_us_dollar() {
		return r0370_analy_by_cur_us_dollar;
	}
	public void setR0370_analy_by_cur_us_dollar(BigDecimal r0370_analy_by_cur_us_dollar) {
		this.r0370_analy_by_cur_us_dollar = r0370_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0370_analy_by_cur_euro() {
		return r0370_analy_by_cur_euro;
	}
	public void setR0370_analy_by_cur_euro(BigDecimal r0370_analy_by_cur_euro) {
		this.r0370_analy_by_cur_euro = r0370_analy_by_cur_euro;
	}
	public BigDecimal getR0370_analy_by_cur_swiss_franc() {
		return r0370_analy_by_cur_swiss_franc;
	}
	public void setR0370_analy_by_cur_swiss_franc(BigDecimal r0370_analy_by_cur_swiss_franc) {
		this.r0370_analy_by_cur_swiss_franc = r0370_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0370_analy_by_cur_uk_sterling() {
		return r0370_analy_by_cur_uk_sterling;
	}
	public void setR0370_analy_by_cur_uk_sterling(BigDecimal r0370_analy_by_cur_uk_sterling) {
		this.r0370_analy_by_cur_uk_sterling = r0370_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0370_analy_by_cur_chinese_yuan() {
		return r0370_analy_by_cur_chinese_yuan;
	}
	public void setR0370_analy_by_cur_chinese_yuan(BigDecimal r0370_analy_by_cur_chinese_yuan) {
		this.r0370_analy_by_cur_chinese_yuan = r0370_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0370_analy_by_cur_japanese_yen() {
		return r0370_analy_by_cur_japanese_yen;
	}
	public void setR0370_analy_by_cur_japanese_yen(BigDecimal r0370_analy_by_cur_japanese_yen) {
		this.r0370_analy_by_cur_japanese_yen = r0370_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0370_analy_by_cur_bahraini_dinar() {
		return r0370_analy_by_cur_bahraini_dinar;
	}
	public void setR0370_analy_by_cur_bahraini_dinar(BigDecimal r0370_analy_by_cur_bahraini_dinar) {
		this.r0370_analy_by_cur_bahraini_dinar = r0370_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0370_analy_by_cur_kuwaiti_dinar() {
		return r0370_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0370_analy_by_cur_kuwaiti_dinar(BigDecimal r0370_analy_by_cur_kuwaiti_dinar) {
		this.r0370_analy_by_cur_kuwaiti_dinar = r0370_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0370_analy_by_cur_qatari_ryal() {
		return r0370_analy_by_cur_qatari_ryal;
	}
	public void setR0370_analy_by_cur_qatari_ryal(BigDecimal r0370_analy_by_cur_qatari_ryal) {
		this.r0370_analy_by_cur_qatari_ryal = r0370_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0370_analy_by_cur_saudi_riyal() {
		return r0370_analy_by_cur_saudi_riyal;
	}
	public void setR0370_analy_by_cur_saudi_riyal(BigDecimal r0370_analy_by_cur_saudi_riyal) {
		this.r0370_analy_by_cur_saudi_riyal = r0370_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0370_analy_by_cur_other_fgn_currencies() {
		return r0370_analy_by_cur_other_fgn_currencies;
	}
	public void setR0370_analy_by_cur_other_fgn_currencies(BigDecimal r0370_analy_by_cur_other_fgn_currencies) {
		this.r0370_analy_by_cur_other_fgn_currencies = r0370_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0370_analy_by_cur_oth_indivi_fgn_curr() {
		return r0370_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0370_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0370_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0370_analy_by_cur_oth_indivi_fgn_curr = r0370_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0380_product() {
		return r0380_product;
	}
	public void setR0380_product(String r0380_product) {
		this.r0380_product = r0380_product;
	}
	public BigDecimal getR0380_analy_by_cur_us_dollar() {
		return r0380_analy_by_cur_us_dollar;
	}
	public void setR0380_analy_by_cur_us_dollar(BigDecimal r0380_analy_by_cur_us_dollar) {
		this.r0380_analy_by_cur_us_dollar = r0380_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0380_analy_by_cur_euro() {
		return r0380_analy_by_cur_euro;
	}
	public void setR0380_analy_by_cur_euro(BigDecimal r0380_analy_by_cur_euro) {
		this.r0380_analy_by_cur_euro = r0380_analy_by_cur_euro;
	}
	public BigDecimal getR0380_analy_by_cur_swiss_franc() {
		return r0380_analy_by_cur_swiss_franc;
	}
	public void setR0380_analy_by_cur_swiss_franc(BigDecimal r0380_analy_by_cur_swiss_franc) {
		this.r0380_analy_by_cur_swiss_franc = r0380_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0380_analy_by_cur_uk_sterling() {
		return r0380_analy_by_cur_uk_sterling;
	}
	public void setR0380_analy_by_cur_uk_sterling(BigDecimal r0380_analy_by_cur_uk_sterling) {
		this.r0380_analy_by_cur_uk_sterling = r0380_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0380_analy_by_cur_chinese_yuan() {
		return r0380_analy_by_cur_chinese_yuan;
	}
	public void setR0380_analy_by_cur_chinese_yuan(BigDecimal r0380_analy_by_cur_chinese_yuan) {
		this.r0380_analy_by_cur_chinese_yuan = r0380_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0380_analy_by_cur_japanese_yen() {
		return r0380_analy_by_cur_japanese_yen;
	}
	public void setR0380_analy_by_cur_japanese_yen(BigDecimal r0380_analy_by_cur_japanese_yen) {
		this.r0380_analy_by_cur_japanese_yen = r0380_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0380_analy_by_cur_bahraini_dinar() {
		return r0380_analy_by_cur_bahraini_dinar;
	}
	public void setR0380_analy_by_cur_bahraini_dinar(BigDecimal r0380_analy_by_cur_bahraini_dinar) {
		this.r0380_analy_by_cur_bahraini_dinar = r0380_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0380_analy_by_cur_kuwaiti_dinar() {
		return r0380_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0380_analy_by_cur_kuwaiti_dinar(BigDecimal r0380_analy_by_cur_kuwaiti_dinar) {
		this.r0380_analy_by_cur_kuwaiti_dinar = r0380_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0380_analy_by_cur_qatari_ryal() {
		return r0380_analy_by_cur_qatari_ryal;
	}
	public void setR0380_analy_by_cur_qatari_ryal(BigDecimal r0380_analy_by_cur_qatari_ryal) {
		this.r0380_analy_by_cur_qatari_ryal = r0380_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0380_analy_by_cur_saudi_riyal() {
		return r0380_analy_by_cur_saudi_riyal;
	}
	public void setR0380_analy_by_cur_saudi_riyal(BigDecimal r0380_analy_by_cur_saudi_riyal) {
		this.r0380_analy_by_cur_saudi_riyal = r0380_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0380_analy_by_cur_other_fgn_currencies() {
		return r0380_analy_by_cur_other_fgn_currencies;
	}
	public void setR0380_analy_by_cur_other_fgn_currencies(BigDecimal r0380_analy_by_cur_other_fgn_currencies) {
		this.r0380_analy_by_cur_other_fgn_currencies = r0380_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0380_analy_by_cur_oth_indivi_fgn_curr() {
		return r0380_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0380_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0380_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0380_analy_by_cur_oth_indivi_fgn_curr = r0380_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0390_product() {
		return r0390_product;
	}
	public void setR0390_product(String r0390_product) {
		this.r0390_product = r0390_product;
	}
	public String getR0400_product() {
		return r0400_product;
	}
	public void setR0400_product(String r0400_product) {
		this.r0400_product = r0400_product;
	}
	public BigDecimal getR0400_analy_by_cur_us_dollar() {
		return r0400_analy_by_cur_us_dollar;
	}
	public void setR0400_analy_by_cur_us_dollar(BigDecimal r0400_analy_by_cur_us_dollar) {
		this.r0400_analy_by_cur_us_dollar = r0400_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0400_analy_by_cur_euro() {
		return r0400_analy_by_cur_euro;
	}
	public void setR0400_analy_by_cur_euro(BigDecimal r0400_analy_by_cur_euro) {
		this.r0400_analy_by_cur_euro = r0400_analy_by_cur_euro;
	}
	public BigDecimal getR0400_analy_by_cur_swiss_franc() {
		return r0400_analy_by_cur_swiss_franc;
	}
	public void setR0400_analy_by_cur_swiss_franc(BigDecimal r0400_analy_by_cur_swiss_franc) {
		this.r0400_analy_by_cur_swiss_franc = r0400_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0400_analy_by_cur_uk_sterling() {
		return r0400_analy_by_cur_uk_sterling;
	}
	public void setR0400_analy_by_cur_uk_sterling(BigDecimal r0400_analy_by_cur_uk_sterling) {
		this.r0400_analy_by_cur_uk_sterling = r0400_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0400_analy_by_cur_chinese_yuan() {
		return r0400_analy_by_cur_chinese_yuan;
	}
	public void setR0400_analy_by_cur_chinese_yuan(BigDecimal r0400_analy_by_cur_chinese_yuan) {
		this.r0400_analy_by_cur_chinese_yuan = r0400_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0400_analy_by_cur_japanese_yen() {
		return r0400_analy_by_cur_japanese_yen;
	}
	public void setR0400_analy_by_cur_japanese_yen(BigDecimal r0400_analy_by_cur_japanese_yen) {
		this.r0400_analy_by_cur_japanese_yen = r0400_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0400_analy_by_cur_bahraini_dinar() {
		return r0400_analy_by_cur_bahraini_dinar;
	}
	public void setR0400_analy_by_cur_bahraini_dinar(BigDecimal r0400_analy_by_cur_bahraini_dinar) {
		this.r0400_analy_by_cur_bahraini_dinar = r0400_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0400_analy_by_cur_kuwaiti_dinar() {
		return r0400_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0400_analy_by_cur_kuwaiti_dinar(BigDecimal r0400_analy_by_cur_kuwaiti_dinar) {
		this.r0400_analy_by_cur_kuwaiti_dinar = r0400_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0400_analy_by_cur_qatari_ryal() {
		return r0400_analy_by_cur_qatari_ryal;
	}
	public void setR0400_analy_by_cur_qatari_ryal(BigDecimal r0400_analy_by_cur_qatari_ryal) {
		this.r0400_analy_by_cur_qatari_ryal = r0400_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0400_analy_by_cur_saudi_riyal() {
		return r0400_analy_by_cur_saudi_riyal;
	}
	public void setR0400_analy_by_cur_saudi_riyal(BigDecimal r0400_analy_by_cur_saudi_riyal) {
		this.r0400_analy_by_cur_saudi_riyal = r0400_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0400_analy_by_cur_other_fgn_currencies() {
		return r0400_analy_by_cur_other_fgn_currencies;
	}
	public void setR0400_analy_by_cur_other_fgn_currencies(BigDecimal r0400_analy_by_cur_other_fgn_currencies) {
		this.r0400_analy_by_cur_other_fgn_currencies = r0400_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0400_analy_by_cur_oth_indivi_fgn_curr() {
		return r0400_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0400_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0400_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0400_analy_by_cur_oth_indivi_fgn_curr = r0400_analy_by_cur_oth_indivi_fgn_curr;
	}
	public String getR0410_product() {
		return r0410_product;
	}
	public void setR0410_product(String r0410_product) {
		this.r0410_product = r0410_product;
	}
	public String getR0420_product() {
		return r0420_product;
	}
	public void setR0420_product(String r0420_product) {
		this.r0420_product = r0420_product;
	}
	public BigDecimal getR0420_analy_by_cur_us_dollar() {
		return r0420_analy_by_cur_us_dollar;
	}
	public void setR0420_analy_by_cur_us_dollar(BigDecimal r0420_analy_by_cur_us_dollar) {
		this.r0420_analy_by_cur_us_dollar = r0420_analy_by_cur_us_dollar;
	}
	public BigDecimal getR0420_analy_by_cur_euro() {
		return r0420_analy_by_cur_euro;
	}
	public void setR0420_analy_by_cur_euro(BigDecimal r0420_analy_by_cur_euro) {
		this.r0420_analy_by_cur_euro = r0420_analy_by_cur_euro;
	}
	public BigDecimal getR0420_analy_by_cur_swiss_franc() {
		return r0420_analy_by_cur_swiss_franc;
	}
	public void setR0420_analy_by_cur_swiss_franc(BigDecimal r0420_analy_by_cur_swiss_franc) {
		this.r0420_analy_by_cur_swiss_franc = r0420_analy_by_cur_swiss_franc;
	}
	public BigDecimal getR0420_analy_by_cur_uk_sterling() {
		return r0420_analy_by_cur_uk_sterling;
	}
	public void setR0420_analy_by_cur_uk_sterling(BigDecimal r0420_analy_by_cur_uk_sterling) {
		this.r0420_analy_by_cur_uk_sterling = r0420_analy_by_cur_uk_sterling;
	}
	public BigDecimal getR0420_analy_by_cur_chinese_yuan() {
		return r0420_analy_by_cur_chinese_yuan;
	}
	public void setR0420_analy_by_cur_chinese_yuan(BigDecimal r0420_analy_by_cur_chinese_yuan) {
		this.r0420_analy_by_cur_chinese_yuan = r0420_analy_by_cur_chinese_yuan;
	}
	public BigDecimal getR0420_analy_by_cur_japanese_yen() {
		return r0420_analy_by_cur_japanese_yen;
	}
	public void setR0420_analy_by_cur_japanese_yen(BigDecimal r0420_analy_by_cur_japanese_yen) {
		this.r0420_analy_by_cur_japanese_yen = r0420_analy_by_cur_japanese_yen;
	}
	public BigDecimal getR0420_analy_by_cur_bahraini_dinar() {
		return r0420_analy_by_cur_bahraini_dinar;
	}
	public void setR0420_analy_by_cur_bahraini_dinar(BigDecimal r0420_analy_by_cur_bahraini_dinar) {
		this.r0420_analy_by_cur_bahraini_dinar = r0420_analy_by_cur_bahraini_dinar;
	}
	public BigDecimal getR0420_analy_by_cur_kuwaiti_dinar() {
		return r0420_analy_by_cur_kuwaiti_dinar;
	}
	public void setR0420_analy_by_cur_kuwaiti_dinar(BigDecimal r0420_analy_by_cur_kuwaiti_dinar) {
		this.r0420_analy_by_cur_kuwaiti_dinar = r0420_analy_by_cur_kuwaiti_dinar;
	}
	public BigDecimal getR0420_analy_by_cur_qatari_ryal() {
		return r0420_analy_by_cur_qatari_ryal;
	}
	public void setR0420_analy_by_cur_qatari_ryal(BigDecimal r0420_analy_by_cur_qatari_ryal) {
		this.r0420_analy_by_cur_qatari_ryal = r0420_analy_by_cur_qatari_ryal;
	}
	public BigDecimal getR0420_analy_by_cur_saudi_riyal() {
		return r0420_analy_by_cur_saudi_riyal;
	}
	public void setR0420_analy_by_cur_saudi_riyal(BigDecimal r0420_analy_by_cur_saudi_riyal) {
		this.r0420_analy_by_cur_saudi_riyal = r0420_analy_by_cur_saudi_riyal;
	}
	public BigDecimal getR0420_analy_by_cur_other_fgn_currencies() {
		return r0420_analy_by_cur_other_fgn_currencies;
	}
	public void setR0420_analy_by_cur_other_fgn_currencies(BigDecimal r0420_analy_by_cur_other_fgn_currencies) {
		this.r0420_analy_by_cur_other_fgn_currencies = r0420_analy_by_cur_other_fgn_currencies;
	}
	public BigDecimal getR0420_analy_by_cur_oth_indivi_fgn_curr() {
		return r0420_analy_by_cur_oth_indivi_fgn_curr;
	}
	public void setR0420_analy_by_cur_oth_indivi_fgn_curr(BigDecimal r0420_analy_by_cur_oth_indivi_fgn_curr) {
		this.r0420_analy_by_cur_oth_indivi_fgn_curr = r0420_analy_by_cur_oth_indivi_fgn_curr;
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
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getDelete_flg() {
		return delete_flg;
	}
	public void setDelete_flg(String delete_flg) {
		this.delete_flg = delete_flg;
	}
	
	
	
	
	public CBUAE_BRF2_4_SUMMARY_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
