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
@Table(name = "CBUAE_BRF2_7_SUMMARYTABLE")

public class CBUAE_BRF2_7_SUMMARY_ENTITY {

	private String r0010_product;
	private String r0020_product;
	private BigDecimal r0020_overdue;
	private BigDecimal r0020_overdraft;
	private BigDecimal r0020_0_to_7_days;
	private BigDecimal r0020_8_to_14_days;
	private BigDecimal r0020_15_days_to_1_month;
	private BigDecimal r0020_1_to_2_months;
	private BigDecimal r0020_2_to_3_months;
	private BigDecimal r0020_3_to_6_months;
	private BigDecimal r0020_6_to_12_months;
	private BigDecimal r0020_1_to_3_years;
	private BigDecimal r0020_3_to_5_years;
	private BigDecimal r0020_greater_than_5_years;
	private BigDecimal r0020_total;
	private String r0030_product;
	private BigDecimal r0030_overdue;
	private BigDecimal r0030_overdraft;
	private BigDecimal r0030_0_to_7_days;
	private BigDecimal r0030_8_to_14_days;
	private BigDecimal r0030_15_days_to_1_month;
	private BigDecimal r0030_1_to_2_months;
	private BigDecimal r0030_2_to_3_months;
	private BigDecimal r0030_3_to_6_months;
	private BigDecimal r0030_6_to_12_months;
	private BigDecimal r0030_1_to_3_years;
	private BigDecimal r0030_3_to_5_years;
	private BigDecimal r0030_greater_than_5_years;
	private BigDecimal r0030_total;
	private String r0040_product;
	private BigDecimal r0040_overdue;
	private BigDecimal r0040_overdraft;
	private BigDecimal r0040_0_to_7_days;
	private BigDecimal r0040_8_to_14_days;
	private BigDecimal r0040_15_days_to_1_month;
	private BigDecimal r0040_1_to_2_months;
	private BigDecimal r0040_2_to_3_months;
	private BigDecimal r0040_3_to_6_months;
	private BigDecimal r0040_6_to_12_months;
	private BigDecimal r0040_1_to_3_years;
	private BigDecimal r0040_3_to_5_years;
	private BigDecimal r0040_greater_than_5_years;
	private BigDecimal r0040_total;
	private String r0050_product;
	private BigDecimal r0050_overdue;
	private BigDecimal r0050_overdraft;
	private BigDecimal r0050_0_to_7_days;
	private BigDecimal r0050_8_to_14_days;
	private BigDecimal r0050_15_days_to_1_month;
	private BigDecimal r0050_1_to_2_months;
	private BigDecimal r0050_2_to_3_months;
	private BigDecimal r0050_3_to_6_months;
	private BigDecimal r0050_6_to_12_months;
	private BigDecimal r0050_1_to_3_years;
	private BigDecimal r0050_3_to_5_years;
	private BigDecimal r0050_greater_than_5_years;
	private BigDecimal r0050_total;
	private String r0060_product;
	private BigDecimal r0060_overdue;
	private BigDecimal r0060_overdraft;
	private BigDecimal r0060_0_to_7_days;
	private BigDecimal r0060_8_to_14_days;
	private BigDecimal r0060_15_days_to_1_month;
	private BigDecimal r0060_1_to_2_months;
	private BigDecimal r0060_2_to_3_months;
	private BigDecimal r0060_3_to_6_months;
	private BigDecimal r0060_6_to_12_months;
	private BigDecimal r0060_1_to_3_years;
	private BigDecimal r0060_3_to_5_years;
	private BigDecimal r0060_greater_than_5_years;
	private BigDecimal r0060_total;
	private String r0070_product;
	private BigDecimal r0070_overdue;
	private BigDecimal r0070_overdraft;
	private BigDecimal r0070_0_to_7_days;
	private BigDecimal r0070_8_to_14_days;
	private BigDecimal r0070_15_days_to_1_month;
	private BigDecimal r0070_1_to_2_months;
	private BigDecimal r0070_2_to_3_months;
	private BigDecimal r0070_3_to_6_months;
	private BigDecimal r0070_6_to_12_months;
	private BigDecimal r0070_1_to_3_years;
	private BigDecimal r0070_3_to_5_years;
	private BigDecimal r0070_greater_than_5_years;
	private BigDecimal r0070_total;
	private String r0080_product;
	private BigDecimal r0080_overdue;
	private BigDecimal r0080_overdraft;
	private BigDecimal r0080_0_to_7_days;
	private BigDecimal r0080_8_to_14_days;
	private BigDecimal r0080_15_days_to_1_month;
	private BigDecimal r0080_1_to_2_months;
	private BigDecimal r0080_2_to_3_months;
	private BigDecimal r0080_3_to_6_months;
	private BigDecimal r0080_6_to_12_months;
	private BigDecimal r0080_1_to_3_years;
	private BigDecimal r0080_3_to_5_years;
	private BigDecimal r0080_greater_than_5_years;
	private BigDecimal r0080_total;
	private String r0090_product;
	private BigDecimal r0090_overdue;
	private BigDecimal r0090_overdraft;
	private BigDecimal r0090_0_to_7_days;
	private BigDecimal r0090_8_to_14_days;
	private BigDecimal r0090_15_days_to_1_month;
	private BigDecimal r0090_1_to_2_months;
	private BigDecimal r0090_2_to_3_months;
	private BigDecimal r0090_3_to_6_months;
	private BigDecimal r0090_6_to_12_months;
	private BigDecimal r0090_1_to_3_years;
	private BigDecimal r0090_3_to_5_years;
	private BigDecimal r0090_greater_than_5_years;
	private BigDecimal r0090_total;
	private String r0100_product;
	private BigDecimal r0100_overdue;
	private BigDecimal r0100_overdraft;
	private BigDecimal r0100_0_to_7_days;
	private BigDecimal r0100_8_to_14_days;
	private BigDecimal r0100_15_days_to_1_month;
	private BigDecimal r0100_1_to_2_months;
	private BigDecimal r0100_2_to_3_months;
	private BigDecimal r0100_3_to_6_months;
	private BigDecimal r0100_6_to_12_months;
	private BigDecimal r0100_1_to_3_years;
	private BigDecimal r0100_3_to_5_years;
	private BigDecimal r0100_greater_than_5_years;
	private BigDecimal r0100_total;
	private String r0110_product;
	private BigDecimal r0110_overdue;
	private BigDecimal r0110_overdraft;
	private BigDecimal r0110_0_to_7_days;
	private BigDecimal r0110_8_to_14_days;
	private BigDecimal r0110_15_days_to_1_month;
	private BigDecimal r0110_1_to_2_months;
	private BigDecimal r0110_2_to_3_months;
	private BigDecimal r0110_3_to_6_months;
	private BigDecimal r0110_6_to_12_months;
	private BigDecimal r0110_1_to_3_years;
	private BigDecimal r0110_3_to_5_years;
	private BigDecimal r0110_greater_than_5_years;
	private BigDecimal r0110_total;
	private String r0120_product;
	private BigDecimal r0120_overdue;
	private BigDecimal r0120_overdraft;
	private BigDecimal r0120_0_to_7_days;
	private BigDecimal r0120_8_to_14_days;
	private BigDecimal r0120_15_days_to_1_month;
	private BigDecimal r0120_1_to_2_months;
	private BigDecimal r0120_2_to_3_months;
	private BigDecimal r0120_3_to_6_months;
	private BigDecimal r0120_6_to_12_months;
	private BigDecimal r0120_1_to_3_years;
	private BigDecimal r0120_3_to_5_years;
	private BigDecimal r0120_greater_than_5_years;
	private BigDecimal r0120_total;
	private String r0130_product;
	private BigDecimal r0130_overdue;
	private BigDecimal r0130_overdraft;
	private BigDecimal r0130_0_to_7_days;
	private BigDecimal r0130_8_to_14_days;
	private BigDecimal r0130_15_days_to_1_month;
	private BigDecimal r0130_1_to_2_months;
	private BigDecimal r0130_2_to_3_months;
	private BigDecimal r0130_3_to_6_months;
	private BigDecimal r0130_6_to_12_months;
	private BigDecimal r0130_1_to_3_years;
	private BigDecimal r0130_3_to_5_years;
	private BigDecimal r0130_greater_than_5_years;
	private BigDecimal r0130_total;
	private String r0140_product;
	private BigDecimal r0140_overdue;
	private BigDecimal r0140_overdraft;
	private BigDecimal r0140_0_to_7_days;
	private BigDecimal r0140_8_to_14_days;
	private BigDecimal r0140_15_days_to_1_month;
	private BigDecimal r0140_1_to_2_months;
	private BigDecimal r0140_2_to_3_months;
	private BigDecimal r0140_3_to_6_months;
	private BigDecimal r0140_6_to_12_months;
	private BigDecimal r0140_1_to_3_years;
	private BigDecimal r0140_3_to_5_years;
	private BigDecimal r0140_greater_than_5_years;
	private BigDecimal r0140_total;
	private String r0150_product;
	private BigDecimal r0150_overdue;
	private BigDecimal r0150_overdraft;
	private BigDecimal r0150_0_to_7_days;
	private BigDecimal r0150_8_to_14_days;
	private BigDecimal r0150_15_days_to_1_month;
	private BigDecimal r0150_1_to_2_months;
	private BigDecimal r0150_2_to_3_months;
	private BigDecimal r0150_3_to_6_months;
	private BigDecimal r0150_6_to_12_months;
	private BigDecimal r0150_1_to_3_years;
	private BigDecimal r0150_3_to_5_years;
	private BigDecimal r0150_greater_than_5_years;
	private BigDecimal r0150_total;
	private String r0160_product;
	private BigDecimal r0160_overdue;
	private BigDecimal r0160_overdraft;
	private BigDecimal r0160_0_to_7_days;
	private BigDecimal r0160_8_to_14_days;
	private BigDecimal r0160_15_days_to_1_month;
	private BigDecimal r0160_1_to_2_months;
	private BigDecimal r0160_2_to_3_months;
	private BigDecimal r0160_3_to_6_months;
	private BigDecimal r0160_6_to_12_months;
	private BigDecimal r0160_1_to_3_years;
	private BigDecimal r0160_3_to_5_years;
	private BigDecimal r0160_greater_than_5_years;
	private BigDecimal r0160_total;
	private String r0170_product;
	private BigDecimal r0170_overdue;
	private BigDecimal r0170_overdraft;
	private BigDecimal r0170_0_to_7_days;
	private BigDecimal r0170_8_to_14_days;
	private BigDecimal r0170_15_days_to_1_month;
	private BigDecimal r0170_1_to_2_months;
	private BigDecimal r0170_2_to_3_months;
	private BigDecimal r0170_3_to_6_months;
	private BigDecimal r0170_6_to_12_months;
	private BigDecimal r0170_1_to_3_years;
	private BigDecimal r0170_3_to_5_years;
	private BigDecimal r0170_greater_than_5_years;
	private BigDecimal r0170_total;
	private String r0180_product;
	private BigDecimal r0180_overdue;
	private BigDecimal r0180_overdraft;
	private BigDecimal r0180_0_to_7_days;
	private BigDecimal r0180_8_to_14_days;
	private BigDecimal r0180_15_days_to_1_month;
	private BigDecimal r0180_1_to_2_months;
	private BigDecimal r0180_2_to_3_months;
	private BigDecimal r0180_3_to_6_months;
	private BigDecimal r0180_6_to_12_months;
	private BigDecimal r0180_1_to_3_years;
	private BigDecimal r0180_3_to_5_years;
	private BigDecimal r0180_greater_than_5_years;
	private BigDecimal r0180_total;
	private String r0190_product;
	private BigDecimal r0190_overdue;
	private BigDecimal r0190_overdraft;
	private BigDecimal r0190_0_to_7_days;
	private BigDecimal r0190_8_to_14_days;
	private BigDecimal r0190_15_days_to_1_month;
	private BigDecimal r0190_1_to_2_months;
	private BigDecimal r0190_2_to_3_months;
	private BigDecimal r0190_3_to_6_months;
	private BigDecimal r0190_6_to_12_months;
	private BigDecimal r0190_1_to_3_years;
	private BigDecimal r0190_3_to_5_years;
	private BigDecimal r0190_greater_than_5_years;
	private BigDecimal r0190_total;
	private String r0200_product;
	private BigDecimal r0200_overdue;
	private BigDecimal r0200_overdraft;
	private BigDecimal r0200_0_to_7_days;
	private BigDecimal r0200_8_to_14_days;
	private BigDecimal r0200_15_days_to_1_month;
	private BigDecimal r0200_1_to_2_months;
	private BigDecimal r0200_2_to_3_months;
	private BigDecimal r0200_3_to_6_months;
	private BigDecimal r0200_6_to_12_months;
	private BigDecimal r0200_1_to_3_years;
	private BigDecimal r0200_3_to_5_years;
	private BigDecimal r0200_greater_than_5_years;
	private BigDecimal r0200_total;
	private String r0210_product;
	private BigDecimal r0210_overdue;
	private BigDecimal r0210_overdraft;
	private BigDecimal r0210_0_to_7_days;
	private BigDecimal r0210_8_to_14_days;
	private BigDecimal r0210_15_days_to_1_month;
	private BigDecimal r0210_1_to_2_months;
	private BigDecimal r0210_2_to_3_months;
	private BigDecimal r0210_3_to_6_months;
	private BigDecimal r0210_6_to_12_months;
	private BigDecimal r0210_1_to_3_years;
	private BigDecimal r0210_3_to_5_years;
	private BigDecimal r0210_greater_than_5_years;
	private BigDecimal r0210_total;
	private String r0220_product;
	private BigDecimal r0220_overdue;
	private BigDecimal r0220_overdraft;
	private BigDecimal r0220_0_to_7_days;
	private BigDecimal r0220_8_to_14_days;
	private BigDecimal r0220_15_days_to_1_month;
	private BigDecimal r0220_1_to_2_months;
	private BigDecimal r0220_2_to_3_months;
	private BigDecimal r0220_3_to_6_months;
	private BigDecimal r0220_6_to_12_months;
	private BigDecimal r0220_1_to_3_years;
	private BigDecimal r0220_3_to_5_years;
	private BigDecimal r0220_greater_than_5_years;
	private BigDecimal r0220_total;
	private String r0230_product;
	private BigDecimal r0230_overdue;
	private BigDecimal r0230_overdraft;
	private BigDecimal r0230_0_to_7_days;
	private BigDecimal r0230_8_to_14_days;
	private BigDecimal r0230_15_days_to_1_month;
	private BigDecimal r0230_1_to_2_months;
	private BigDecimal r0230_2_to_3_months;
	private BigDecimal r0230_3_to_6_months;
	private BigDecimal r0230_6_to_12_months;
	private BigDecimal r0230_1_to_3_years;
	private BigDecimal r0230_3_to_5_years;
	private BigDecimal r0230_greater_than_5_years;
	private BigDecimal r0230_total;
	private String r0240_product;
	private BigDecimal r0240_overdue;
	private BigDecimal r0240_overdraft;
	private BigDecimal r0240_0_to_7_days;
	private BigDecimal r0240_8_to_14_days;
	private BigDecimal r0240_15_days_to_1_month;
	private BigDecimal r0240_1_to_2_months;
	private BigDecimal r0240_2_to_3_months;
	private BigDecimal r0240_3_to_6_months;
	private BigDecimal r0240_6_to_12_months;
	private BigDecimal r0240_1_to_3_years;
	private BigDecimal r0240_3_to_5_years;
	private BigDecimal r0240_greater_than_5_years;
	private BigDecimal r0240_total;
	private String r0250_product;
	private BigDecimal r0250_overdue;
	private BigDecimal r0250_overdraft;
	private BigDecimal r0250_0_to_7_days;
	private BigDecimal r0250_8_to_14_days;
	private BigDecimal r0250_15_days_to_1_month;
	private BigDecimal r0250_1_to_2_months;
	private BigDecimal r0250_2_to_3_months;
	private BigDecimal r0250_3_to_6_months;
	private BigDecimal r0250_6_to_12_months;
	private BigDecimal r0250_1_to_3_years;
	private BigDecimal r0250_3_to_5_years;
	private BigDecimal r0250_greater_than_5_years;
	private BigDecimal r0250_total;
	private String r0260_product;
	private BigDecimal r0260_overdue;
	private BigDecimal r0260_overdraft;
	private BigDecimal r0260_0_to_7_days;
	private BigDecimal r0260_8_to_14_days;
	private BigDecimal r0260_15_days_to_1_month;
	private BigDecimal r0260_1_to_2_months;
	private BigDecimal r0260_2_to_3_months;
	private BigDecimal r0260_3_to_6_months;
	private BigDecimal r0260_6_to_12_months;
	private BigDecimal r0260_1_to_3_years;
	private BigDecimal r0260_3_to_5_years;
	private BigDecimal r0260_greater_than_5_years;
	private BigDecimal r0260_total;
	private String r0270_product;
	private BigDecimal r0270_overdue;
	private BigDecimal r0270_overdraft;
	private BigDecimal r0270_0_to_7_days;
	private BigDecimal r0270_8_to_14_days;
	private BigDecimal r0270_15_days_to_1_month;
	private BigDecimal r0270_1_to_2_months;
	private BigDecimal r0270_2_to_3_months;
	private BigDecimal r0270_3_to_6_months;
	private BigDecimal r0270_6_to_12_months;
	private BigDecimal r0270_1_to_3_years;
	private BigDecimal r0270_3_to_5_years;
	private BigDecimal r0270_greater_than_5_years;
	private BigDecimal r0270_total;
	private String r0280_product;
	private BigDecimal r0280_overdue;
	private BigDecimal r0280_overdraft;
	private BigDecimal r0280_0_to_7_days;
	private BigDecimal r0280_8_to_14_days;
	private BigDecimal r0280_15_days_to_1_month;
	private BigDecimal r0280_1_to_2_months;
	private BigDecimal r0280_2_to_3_months;
	private BigDecimal r0280_3_to_6_months;
	private BigDecimal r0280_6_to_12_months;
	private BigDecimal r0280_1_to_3_years;
	private BigDecimal r0280_3_to_5_years;
	private BigDecimal r0280_greater_than_5_years;
	private BigDecimal r0280_total;
	private String r0290_product;
	private BigDecimal r0290_overdue;
	private BigDecimal r0290_overdraft;
	private BigDecimal r0290_0_to_7_days;
	private BigDecimal r0290_8_to_14_days;
	private BigDecimal r0290_15_days_to_1_month;
	private BigDecimal r0290_1_to_2_months;
	private BigDecimal r0290_2_to_3_months;
	private BigDecimal r0290_3_to_6_months;
	private BigDecimal r0290_6_to_12_months;
	private BigDecimal r0290_1_to_3_years;
	private BigDecimal r0290_3_to_5_years;
	private BigDecimal r0290_greater_than_5_years;
	private BigDecimal r0290_total;
	private String r0300_product;
	private BigDecimal r0300_overdue;
	private BigDecimal r0300_overdraft;
	private BigDecimal r0300_0_to_7_days;
	private BigDecimal r0300_8_to_14_days;
	private BigDecimal r0300_15_days_to_1_month;
	private BigDecimal r0300_1_to_2_months;
	private BigDecimal r0300_2_to_3_months;
	private BigDecimal r0300_3_to_6_months;
	private BigDecimal r0300_6_to_12_months;
	private BigDecimal r0300_1_to_3_years;
	private BigDecimal r0300_3_to_5_years;
	private BigDecimal r0300_greater_than_5_years;
	private BigDecimal r0300_total;
	private String r0310_product;
	private BigDecimal r0310_overdue;
	private BigDecimal r0310_overdraft;
	private BigDecimal r0310_0_to_7_days;
	private BigDecimal r0310_8_to_14_days;
	private BigDecimal r0310_15_days_to_1_month;
	private BigDecimal r0310_1_to_2_months;
	private BigDecimal r0310_2_to_3_months;
	private BigDecimal r0310_3_to_6_months;
	private BigDecimal r0310_6_to_12_months;
	private BigDecimal r0310_1_to_3_years;
	private BigDecimal r0310_3_to_5_years;
	private BigDecimal r0310_greater_than_5_years;
	private BigDecimal r0310_total;
	private String r0320_product;
	private BigDecimal r0320_overdue;
	private BigDecimal r0320_overdraft;
	private BigDecimal r0320_0_to_7_days;
	private BigDecimal r0320_8_to_14_days;
	private BigDecimal r0320_15_days_to_1_month;
	private BigDecimal r0320_1_to_2_months;
	private BigDecimal r0320_2_to_3_months;
	private BigDecimal r0320_3_to_6_months;
	private BigDecimal r0320_6_to_12_months;
	private BigDecimal r0320_1_to_3_years;
	private BigDecimal r0320_3_to_5_years;
	private BigDecimal r0320_greater_than_5_years;
	private BigDecimal r0320_total;
	private String r0330_product;
	private BigDecimal r0330_overdue;
	private BigDecimal r0330_overdraft;
	private BigDecimal r0330_0_to_7_days;
	private BigDecimal r0330_8_to_14_days;
	private BigDecimal r0330_15_days_to_1_month;
	private BigDecimal r0330_1_to_2_months;
	private BigDecimal r0330_2_to_3_months;
	private BigDecimal r0330_3_to_6_months;
	private BigDecimal r0330_6_to_12_months;
	private BigDecimal r0330_1_to_3_years;
	private BigDecimal r0330_3_to_5_years;
	private BigDecimal r0330_greater_than_5_years;
	private BigDecimal r0330_total;
	private String r0340_product;
	private BigDecimal r0340_overdue;
	private BigDecimal r0340_overdraft;
	private BigDecimal r0340_0_to_7_days;
	private BigDecimal r0340_8_to_14_days;
	private BigDecimal r0340_15_days_to_1_month;
	private BigDecimal r0340_1_to_2_months;
	private BigDecimal r0340_2_to_3_months;
	private BigDecimal r0340_3_to_6_months;
	private BigDecimal r0340_6_to_12_months;
	private BigDecimal r0340_1_to_3_years;
	private BigDecimal r0340_3_to_5_years;
	private BigDecimal r0340_greater_than_5_years;
	private BigDecimal r0340_total;
	private String r0350_product;
	private BigDecimal r0350_overdue;
	private BigDecimal r0350_overdraft;
	private BigDecimal r0350_0_to_7_days;
	private BigDecimal r0350_8_to_14_days;
	private BigDecimal r0350_15_days_to_1_month;
	private BigDecimal r0350_1_to_2_months;
	private BigDecimal r0350_2_to_3_months;
	private BigDecimal r0350_3_to_6_months;
	private BigDecimal r0350_6_to_12_months;
	private BigDecimal r0350_1_to_3_years;
	private BigDecimal r0350_3_to_5_years;
	private BigDecimal r0350_greater_than_5_years;
	private BigDecimal r0350_total;
	private String r0360_product;
	private BigDecimal r0360_overdue;
	private BigDecimal r0360_overdraft;
	private BigDecimal r0360_0_to_7_days;
	private BigDecimal r0360_8_to_14_days;
	private BigDecimal r0360_15_days_to_1_month;
	private BigDecimal r0360_1_to_2_months;
	private BigDecimal r0360_2_to_3_months;
	private BigDecimal r0360_3_to_6_months;
	private BigDecimal r0360_6_to_12_months;
	private BigDecimal r0360_1_to_3_years;
	private BigDecimal r0360_3_to_5_years;
	private BigDecimal r0360_greater_than_5_years;
	private BigDecimal r0360_total;
	private String r0370_product;
	private BigDecimal r0370_overdue;
	private BigDecimal r0370_overdraft;
	private BigDecimal r0370_0_to_7_days;
	private BigDecimal r0370_8_to_14_days;
	private BigDecimal r0370_15_days_to_1_month;
	private BigDecimal r0370_1_to_2_months;
	private BigDecimal r0370_2_to_3_months;
	private BigDecimal r0370_3_to_6_months;
	private BigDecimal r0370_6_to_12_months;
	private BigDecimal r0370_1_to_3_years;
	private BigDecimal r0370_3_to_5_years;
	private BigDecimal r0370_greater_than_5_years;
	private BigDecimal r0370_total;
	private String r0380_product;
	private String r0390_product;
	private BigDecimal r0390_overdue;
	private BigDecimal r0390_overdraft;
	private BigDecimal r0390_0_to_7_days;
	private BigDecimal r0390_8_to_14_days;
	private BigDecimal r0390_15_days_to_1_month;
	private BigDecimal r0390_1_to_2_months;
	private BigDecimal r0390_2_to_3_months;
	private BigDecimal r0390_3_to_6_months;
	private BigDecimal r0390_6_to_12_months;
	private BigDecimal r0390_1_to_3_years;
	private BigDecimal r0390_3_to_5_years;
	private BigDecimal r0390_greater_than_5_years;
	private BigDecimal r0390_total;
	private String r0400_product;
	private BigDecimal r0400_overdue;
	private BigDecimal r0400_overdraft;
	private BigDecimal r0400_0_to_7_days;
	private BigDecimal r0400_8_to_14_days;
	private BigDecimal r0400_15_days_to_1_month;
	private BigDecimal r0400_1_to_2_months;
	private BigDecimal r0400_2_to_3_months;
	private BigDecimal r0400_3_to_6_months;
	private BigDecimal r0400_6_to_12_months;
	private BigDecimal r0400_1_to_3_years;
	private BigDecimal r0400_3_to_5_years;
	private BigDecimal r0400_greater_than_5_years;
	private BigDecimal r0400_total;
	private String r0410_product;
	private BigDecimal r0410_overdue;
	private BigDecimal r0410_overdraft;
	private BigDecimal r0410_0_to_7_days;
	private BigDecimal r0410_8_to_14_days;
	private BigDecimal r0410_15_days_to_1_month;
	private BigDecimal r0410_1_to_2_months;
	private BigDecimal r0410_2_to_3_months;
	private BigDecimal r0410_3_to_6_months;
	private BigDecimal r0410_6_to_12_months;
	private BigDecimal r0410_1_to_3_years;
	private BigDecimal r0410_3_to_5_years;
	private BigDecimal r0410_greater_than_5_years;
	private BigDecimal r0410_total;
	private String r0420_product;
	private BigDecimal r0420_overdue;
	private BigDecimal r0420_overdraft;
	private BigDecimal r0420_0_to_7_days;
	private BigDecimal r0420_8_to_14_days;
	private BigDecimal r0420_15_days_to_1_month;
	private BigDecimal r0420_1_to_2_months;
	private BigDecimal r0420_2_to_3_months;
	private BigDecimal r0420_3_to_6_months;
	private BigDecimal r0420_6_to_12_months;
	private BigDecimal r0420_1_to_3_years;
	private BigDecimal r0420_3_to_5_years;
	private BigDecimal r0420_greater_than_5_years;
	private BigDecimal r0420_total;
	private String r0430_product;
	private BigDecimal r0430_overdue;
	private BigDecimal r0430_overdraft;
	private BigDecimal r0430_0_to_7_days;
	private BigDecimal r0430_8_to_14_days;
	private BigDecimal r0430_15_days_to_1_month;
	private BigDecimal r0430_1_to_2_months;
	private BigDecimal r0430_2_to_3_months;
	private BigDecimal r0430_3_to_6_months;
	private BigDecimal r0430_6_to_12_months;
	private BigDecimal r0430_1_to_3_years;
	private BigDecimal r0430_3_to_5_years;
	private BigDecimal r0430_greater_than_5_years;
	private BigDecimal r0430_total;
	private String r0440_product;
	private BigDecimal r0440_overdue;
	private BigDecimal r0440_overdraft;
	private BigDecimal r0440_0_to_7_days;
	private BigDecimal r0440_8_to_14_days;
	private BigDecimal r0440_15_days_to_1_month;
	private BigDecimal r0440_1_to_2_months;
	private BigDecimal r0440_2_to_3_months;
	private BigDecimal r0440_3_to_6_months;
	private BigDecimal r0440_6_to_12_months;
	private BigDecimal r0440_1_to_3_years;
	private BigDecimal r0440_3_to_5_years;
	private BigDecimal r0440_greater_than_5_years;
	private BigDecimal r0440_total;
	private String r0450_product;
	private BigDecimal r0450_overdue;
	private BigDecimal r0450_overdraft;
	private BigDecimal r0450_0_to_7_days;
	private BigDecimal r0450_8_to_14_days;
	private BigDecimal r0450_15_days_to_1_month;
	private BigDecimal r0450_1_to_2_months;
	private BigDecimal r0450_2_to_3_months;
	private BigDecimal r0450_3_to_6_months;
	private BigDecimal r0450_6_to_12_months;
	private BigDecimal r0450_1_to_3_years;
	private BigDecimal r0450_3_to_5_years;
	private BigDecimal r0450_greater_than_5_years;
	private BigDecimal r0450_total;
	private String r0460_product;
	private BigDecimal r0460_overdue;
	private BigDecimal r0460_overdraft;
	private BigDecimal r0460_0_to_7_days;
	private BigDecimal r0460_8_to_14_days;
	private BigDecimal r0460_15_days_to_1_month;
	private BigDecimal r0460_1_to_2_months;
	private BigDecimal r0460_2_to_3_months;
	private BigDecimal r0460_3_to_6_months;
	private BigDecimal r0460_6_to_12_months;
	private BigDecimal r0460_1_to_3_years;
	private BigDecimal r0460_3_to_5_years;
	private BigDecimal r0460_greater_than_5_years;
	private BigDecimal r0460_total;
	private String r0470_product;
	private BigDecimal r0470_overdue;
	private BigDecimal r0470_overdraft;
	private BigDecimal r0470_0_to_7_days;
	private BigDecimal r0470_8_to_14_days;
	private BigDecimal r0470_15_days_to_1_month;
	private BigDecimal r0470_1_to_2_months;
	private BigDecimal r0470_2_to_3_months;
	private BigDecimal r0470_3_to_6_months;
	private BigDecimal r0470_6_to_12_months;
	private BigDecimal r0470_1_to_3_years;
	private BigDecimal r0470_3_to_5_years;
	private BigDecimal r0470_greater_than_5_years;
	private BigDecimal r0470_total;
	private String r0480_product;
	private BigDecimal r0480_overdue;
	private BigDecimal r0480_overdraft;
	private BigDecimal r0480_0_to_7_days;
	private BigDecimal r0480_8_to_14_days;
	private BigDecimal r0480_15_days_to_1_month;
	private BigDecimal r0480_1_to_2_months;
	private BigDecimal r0480_2_to_3_months;
	private BigDecimal r0480_3_to_6_months;
	private BigDecimal r0480_6_to_12_months;
	private BigDecimal r0480_1_to_3_years;
	private BigDecimal r0480_3_to_5_years;
	private BigDecimal r0480_greater_than_5_years;
	private BigDecimal r0480_total;
	private String r0490_product;
	private BigDecimal r0490_overdue;
	private BigDecimal r0490_overdraft;
	private BigDecimal r0490_0_to_7_days;
	private BigDecimal r0490_8_to_14_days;
	private BigDecimal r0490_15_days_to_1_month;
	private BigDecimal r0490_1_to_2_months;
	private BigDecimal r0490_2_to_3_months;
	private BigDecimal r0490_3_to_6_months;
	private BigDecimal r0490_6_to_12_months;
	private BigDecimal r0490_1_to_3_years;
	private BigDecimal r0490_3_to_5_years;
	private BigDecimal r0490_greater_than_5_years;
	private BigDecimal r0490_total;
	private String r0500_product;
	private BigDecimal r0500_overdue;
	private BigDecimal r0500_overdraft;
	private BigDecimal r0500_0_to_7_days;
	private BigDecimal r0500_8_to_14_days;
	private BigDecimal r0500_15_days_to_1_month;
	private BigDecimal r0500_1_to_2_months;
	private BigDecimal r0500_2_to_3_months;
	private BigDecimal r0500_3_to_6_months;
	private BigDecimal r0500_6_to_12_months;
	private BigDecimal r0500_1_to_3_years;
	private BigDecimal r0500_3_to_5_years;
	private BigDecimal r0500_greater_than_5_years;
	private BigDecimal r0500_total;
	private String r0510_product;
	private BigDecimal r0510_overdue;
	private BigDecimal r0510_overdraft;
	private BigDecimal r0510_0_to_7_days;
	private BigDecimal r0510_8_to_14_days;
	private BigDecimal r0510_15_days_to_1_month;
	private BigDecimal r0510_1_to_2_months;
	private BigDecimal r0510_2_to_3_months;
	private BigDecimal r0510_3_to_6_months;
	private BigDecimal r0510_6_to_12_months;
	private BigDecimal r0510_1_to_3_years;
	private BigDecimal r0510_3_to_5_years;
	private BigDecimal r0510_greater_than_5_years;
	private BigDecimal r0510_total;
	private String r0520_product;
	private BigDecimal r0520_overdue;
	private BigDecimal r0520_overdraft;
	private BigDecimal r0520_0_to_7_days;
	private BigDecimal r0520_8_to_14_days;
	private BigDecimal r0520_15_days_to_1_month;
	private BigDecimal r0520_1_to_2_months;
	private BigDecimal r0520_2_to_3_months;
	private BigDecimal r0520_3_to_6_months;
	private BigDecimal r0520_6_to_12_months;
	private BigDecimal r0520_1_to_3_years;
	private BigDecimal r0520_3_to_5_years;
	private BigDecimal r0520_greater_than_5_years;
	private BigDecimal r0520_total;
	private String r0530_product;
	private BigDecimal r0530_overdue;
	private BigDecimal r0530_overdraft;
	private BigDecimal r0530_0_to_7_days;
	private BigDecimal r0530_8_to_14_days;
	private BigDecimal r0530_15_days_to_1_month;
	private BigDecimal r0530_1_to_2_months;
	private BigDecimal r0530_2_to_3_months;
	private BigDecimal r0530_3_to_6_months;
	private BigDecimal r0530_6_to_12_months;
	private BigDecimal r0530_1_to_3_years;
	private BigDecimal r0530_3_to_5_years;
	private BigDecimal r0530_greater_than_5_years;
	private BigDecimal r0530_total;
	private String r0540_product;
	private BigDecimal r0540_overdue;
	private BigDecimal r0540_overdraft;
	private BigDecimal r0540_0_to_7_days;
	private BigDecimal r0540_8_to_14_days;
	private BigDecimal r0540_15_days_to_1_month;
	private BigDecimal r0540_1_to_2_months;
	private BigDecimal r0540_2_to_3_months;
	private BigDecimal r0540_3_to_6_months;
	private BigDecimal r0540_6_to_12_months;
	private BigDecimal r0540_1_to_3_years;
	private BigDecimal r0540_3_to_5_years;
	private BigDecimal r0540_greater_than_5_years;
	private BigDecimal r0540_total;
	private String r0550_product;
	private BigDecimal r0550_overdue;
	private BigDecimal r0550_overdraft;
	private BigDecimal r0550_0_to_7_days;
	private BigDecimal r0550_8_to_14_days;
	private BigDecimal r0550_15_days_to_1_month;
	private BigDecimal r0550_1_to_2_months;
	private BigDecimal r0550_2_to_3_months;
	private BigDecimal r0550_3_to_6_months;
	private BigDecimal r0550_6_to_12_months;
	private BigDecimal r0550_1_to_3_years;
	private BigDecimal r0550_3_to_5_years;
	private BigDecimal r0550_greater_than_5_years;
	private BigDecimal r0550_total;
	private String r0560_product;
	private BigDecimal r0560_overdue;
	private BigDecimal r0560_overdraft;
	private BigDecimal r0560_0_to_7_days;
	private BigDecimal r0560_8_to_14_days;
	private BigDecimal r0560_15_days_to_1_month;
	private BigDecimal r0560_1_to_2_months;
	private BigDecimal r0560_2_to_3_months;
	private BigDecimal r0560_3_to_6_months;
	private BigDecimal r0560_6_to_12_months;
	private BigDecimal r0560_1_to_3_years;
	private BigDecimal r0560_3_to_5_years;
	private BigDecimal r0560_greater_than_5_years;
	private BigDecimal r0560_total;
	private String r0570_product;
	private BigDecimal r0570_overdue;
	private BigDecimal r0570_overdraft;
	private BigDecimal r0570_0_to_7_days;
	private BigDecimal r0570_8_to_14_days;
	private BigDecimal r0570_15_days_to_1_month;
	private BigDecimal r0570_1_to_2_months;
	private BigDecimal r0570_2_to_3_months;
	private BigDecimal r0570_3_to_6_months;
	private BigDecimal r0570_6_to_12_months;
	private BigDecimal r0570_1_to_3_years;
	private BigDecimal r0570_3_to_5_years;
	private BigDecimal r0570_greater_than_5_years;
	private BigDecimal r0570_total;
	private String r0580_product;
	private BigDecimal r0580_overdue;
	private BigDecimal r0580_overdraft;
	private BigDecimal r0580_0_to_7_days;
	private BigDecimal r0580_8_to_14_days;
	private BigDecimal r0580_15_days_to_1_month;
	private BigDecimal r0580_1_to_2_months;
	private BigDecimal r0580_2_to_3_months;
	private BigDecimal r0580_3_to_6_months;
	private BigDecimal r0580_6_to_12_months;
	private BigDecimal r0580_1_to_3_years;
	private BigDecimal r0580_3_to_5_years;
	private BigDecimal r0580_greater_than_5_years;
	private BigDecimal r0580_total;
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
	public BigDecimal getR0020_overdue() {
		return r0020_overdue;
	}
	public void setR0020_overdue(BigDecimal r0020_overdue) {
		this.r0020_overdue = r0020_overdue;
	}
	public BigDecimal getR0020_overdraft() {
		return r0020_overdraft;
	}
	public void setR0020_overdraft(BigDecimal r0020_overdraft) {
		this.r0020_overdraft = r0020_overdraft;
	}
	public BigDecimal getR0020_0_to_7_days() {
		return r0020_0_to_7_days;
	}
	public void setR0020_0_to_7_days(BigDecimal r0020_0_to_7_days) {
		this.r0020_0_to_7_days = r0020_0_to_7_days;
	}
	public BigDecimal getR0020_8_to_14_days() {
		return r0020_8_to_14_days;
	}
	public void setR0020_8_to_14_days(BigDecimal r0020_8_to_14_days) {
		this.r0020_8_to_14_days = r0020_8_to_14_days;
	}
	public BigDecimal getR0020_15_days_to_1_month() {
		return r0020_15_days_to_1_month;
	}
	public void setR0020_15_days_to_1_month(BigDecimal r0020_15_days_to_1_month) {
		this.r0020_15_days_to_1_month = r0020_15_days_to_1_month;
	}
	public BigDecimal getR0020_1_to_2_months() {
		return r0020_1_to_2_months;
	}
	public void setR0020_1_to_2_months(BigDecimal r0020_1_to_2_months) {
		this.r0020_1_to_2_months = r0020_1_to_2_months;
	}
	public BigDecimal getR0020_2_to_3_months() {
		return r0020_2_to_3_months;
	}
	public void setR0020_2_to_3_months(BigDecimal r0020_2_to_3_months) {
		this.r0020_2_to_3_months = r0020_2_to_3_months;
	}
	public BigDecimal getR0020_3_to_6_months() {
		return r0020_3_to_6_months;
	}
	public void setR0020_3_to_6_months(BigDecimal r0020_3_to_6_months) {
		this.r0020_3_to_6_months = r0020_3_to_6_months;
	}
	public BigDecimal getR0020_6_to_12_months() {
		return r0020_6_to_12_months;
	}
	public void setR0020_6_to_12_months(BigDecimal r0020_6_to_12_months) {
		this.r0020_6_to_12_months = r0020_6_to_12_months;
	}
	public BigDecimal getR0020_1_to_3_years() {
		return r0020_1_to_3_years;
	}
	public void setR0020_1_to_3_years(BigDecimal r0020_1_to_3_years) {
		this.r0020_1_to_3_years = r0020_1_to_3_years;
	}
	public BigDecimal getR0020_3_to_5_years() {
		return r0020_3_to_5_years;
	}
	public void setR0020_3_to_5_years(BigDecimal r0020_3_to_5_years) {
		this.r0020_3_to_5_years = r0020_3_to_5_years;
	}
	public BigDecimal getR0020_greater_than_5_years() {
		return r0020_greater_than_5_years;
	}
	public void setR0020_greater_than_5_years(BigDecimal r0020_greater_than_5_years) {
		this.r0020_greater_than_5_years = r0020_greater_than_5_years;
	}
	public BigDecimal getR0020_total() {
		return r0020_total;
	}
	public void setR0020_total(BigDecimal r0020_total) {
		this.r0020_total = r0020_total;
	}
	public String getR0030_product() {
		return r0030_product;
	}
	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}
	public BigDecimal getR0030_overdue() {
		return r0030_overdue;
	}
	public void setR0030_overdue(BigDecimal r0030_overdue) {
		this.r0030_overdue = r0030_overdue;
	}
	public BigDecimal getR0030_overdraft() {
		return r0030_overdraft;
	}
	public void setR0030_overdraft(BigDecimal r0030_overdraft) {
		this.r0030_overdraft = r0030_overdraft;
	}
	public BigDecimal getR0030_0_to_7_days() {
		return r0030_0_to_7_days;
	}
	public void setR0030_0_to_7_days(BigDecimal r0030_0_to_7_days) {
		this.r0030_0_to_7_days = r0030_0_to_7_days;
	}
	public BigDecimal getR0030_8_to_14_days() {
		return r0030_8_to_14_days;
	}
	public void setR0030_8_to_14_days(BigDecimal r0030_8_to_14_days) {
		this.r0030_8_to_14_days = r0030_8_to_14_days;
	}
	public BigDecimal getR0030_15_days_to_1_month() {
		return r0030_15_days_to_1_month;
	}
	public void setR0030_15_days_to_1_month(BigDecimal r0030_15_days_to_1_month) {
		this.r0030_15_days_to_1_month = r0030_15_days_to_1_month;
	}
	public BigDecimal getR0030_1_to_2_months() {
		return r0030_1_to_2_months;
	}
	public void setR0030_1_to_2_months(BigDecimal r0030_1_to_2_months) {
		this.r0030_1_to_2_months = r0030_1_to_2_months;
	}
	public BigDecimal getR0030_2_to_3_months() {
		return r0030_2_to_3_months;
	}
	public void setR0030_2_to_3_months(BigDecimal r0030_2_to_3_months) {
		this.r0030_2_to_3_months = r0030_2_to_3_months;
	}
	public BigDecimal getR0030_3_to_6_months() {
		return r0030_3_to_6_months;
	}
	public void setR0030_3_to_6_months(BigDecimal r0030_3_to_6_months) {
		this.r0030_3_to_6_months = r0030_3_to_6_months;
	}
	public BigDecimal getR0030_6_to_12_months() {
		return r0030_6_to_12_months;
	}
	public void setR0030_6_to_12_months(BigDecimal r0030_6_to_12_months) {
		this.r0030_6_to_12_months = r0030_6_to_12_months;
	}
	public BigDecimal getR0030_1_to_3_years() {
		return r0030_1_to_3_years;
	}
	public void setR0030_1_to_3_years(BigDecimal r0030_1_to_3_years) {
		this.r0030_1_to_3_years = r0030_1_to_3_years;
	}
	public BigDecimal getR0030_3_to_5_years() {
		return r0030_3_to_5_years;
	}
	public void setR0030_3_to_5_years(BigDecimal r0030_3_to_5_years) {
		this.r0030_3_to_5_years = r0030_3_to_5_years;
	}
	public BigDecimal getR0030_greater_than_5_years() {
		return r0030_greater_than_5_years;
	}
	public void setR0030_greater_than_5_years(BigDecimal r0030_greater_than_5_years) {
		this.r0030_greater_than_5_years = r0030_greater_than_5_years;
	}
	public BigDecimal getR0030_total() {
		return r0030_total;
	}
	public void setR0030_total(BigDecimal r0030_total) {
		this.r0030_total = r0030_total;
	}
	public String getR0040_product() {
		return r0040_product;
	}
	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}
	public BigDecimal getR0040_overdue() {
		return r0040_overdue;
	}
	public void setR0040_overdue(BigDecimal r0040_overdue) {
		this.r0040_overdue = r0040_overdue;
	}
	public BigDecimal getR0040_overdraft() {
		return r0040_overdraft;
	}
	public void setR0040_overdraft(BigDecimal r0040_overdraft) {
		this.r0040_overdraft = r0040_overdraft;
	}
	public BigDecimal getR0040_0_to_7_days() {
		return r0040_0_to_7_days;
	}
	public void setR0040_0_to_7_days(BigDecimal r0040_0_to_7_days) {
		this.r0040_0_to_7_days = r0040_0_to_7_days;
	}
	public BigDecimal getR0040_8_to_14_days() {
		return r0040_8_to_14_days;
	}
	public void setR0040_8_to_14_days(BigDecimal r0040_8_to_14_days) {
		this.r0040_8_to_14_days = r0040_8_to_14_days;
	}
	public BigDecimal getR0040_15_days_to_1_month() {
		return r0040_15_days_to_1_month;
	}
	public void setR0040_15_days_to_1_month(BigDecimal r0040_15_days_to_1_month) {
		this.r0040_15_days_to_1_month = r0040_15_days_to_1_month;
	}
	public BigDecimal getR0040_1_to_2_months() {
		return r0040_1_to_2_months;
	}
	public void setR0040_1_to_2_months(BigDecimal r0040_1_to_2_months) {
		this.r0040_1_to_2_months = r0040_1_to_2_months;
	}
	public BigDecimal getR0040_2_to_3_months() {
		return r0040_2_to_3_months;
	}
	public void setR0040_2_to_3_months(BigDecimal r0040_2_to_3_months) {
		this.r0040_2_to_3_months = r0040_2_to_3_months;
	}
	public BigDecimal getR0040_3_to_6_months() {
		return r0040_3_to_6_months;
	}
	public void setR0040_3_to_6_months(BigDecimal r0040_3_to_6_months) {
		this.r0040_3_to_6_months = r0040_3_to_6_months;
	}
	public BigDecimal getR0040_6_to_12_months() {
		return r0040_6_to_12_months;
	}
	public void setR0040_6_to_12_months(BigDecimal r0040_6_to_12_months) {
		this.r0040_6_to_12_months = r0040_6_to_12_months;
	}
	public BigDecimal getR0040_1_to_3_years() {
		return r0040_1_to_3_years;
	}
	public void setR0040_1_to_3_years(BigDecimal r0040_1_to_3_years) {
		this.r0040_1_to_3_years = r0040_1_to_3_years;
	}
	public BigDecimal getR0040_3_to_5_years() {
		return r0040_3_to_5_years;
	}
	public void setR0040_3_to_5_years(BigDecimal r0040_3_to_5_years) {
		this.r0040_3_to_5_years = r0040_3_to_5_years;
	}
	public BigDecimal getR0040_greater_than_5_years() {
		return r0040_greater_than_5_years;
	}
	public void setR0040_greater_than_5_years(BigDecimal r0040_greater_than_5_years) {
		this.r0040_greater_than_5_years = r0040_greater_than_5_years;
	}
	public BigDecimal getR0040_total() {
		return r0040_total;
	}
	public void setR0040_total(BigDecimal r0040_total) {
		this.r0040_total = r0040_total;
	}
	public String getR0050_product() {
		return r0050_product;
	}
	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}
	public BigDecimal getR0050_overdue() {
		return r0050_overdue;
	}
	public void setR0050_overdue(BigDecimal r0050_overdue) {
		this.r0050_overdue = r0050_overdue;
	}
	public BigDecimal getR0050_overdraft() {
		return r0050_overdraft;
	}
	public void setR0050_overdraft(BigDecimal r0050_overdraft) {
		this.r0050_overdraft = r0050_overdraft;
	}
	public BigDecimal getR0050_0_to_7_days() {
		return r0050_0_to_7_days;
	}
	public void setR0050_0_to_7_days(BigDecimal r0050_0_to_7_days) {
		this.r0050_0_to_7_days = r0050_0_to_7_days;
	}
	public BigDecimal getR0050_8_to_14_days() {
		return r0050_8_to_14_days;
	}
	public void setR0050_8_to_14_days(BigDecimal r0050_8_to_14_days) {
		this.r0050_8_to_14_days = r0050_8_to_14_days;
	}
	public BigDecimal getR0050_15_days_to_1_month() {
		return r0050_15_days_to_1_month;
	}
	public void setR0050_15_days_to_1_month(BigDecimal r0050_15_days_to_1_month) {
		this.r0050_15_days_to_1_month = r0050_15_days_to_1_month;
	}
	public BigDecimal getR0050_1_to_2_months() {
		return r0050_1_to_2_months;
	}
	public void setR0050_1_to_2_months(BigDecimal r0050_1_to_2_months) {
		this.r0050_1_to_2_months = r0050_1_to_2_months;
	}
	public BigDecimal getR0050_2_to_3_months() {
		return r0050_2_to_3_months;
	}
	public void setR0050_2_to_3_months(BigDecimal r0050_2_to_3_months) {
		this.r0050_2_to_3_months = r0050_2_to_3_months;
	}
	public BigDecimal getR0050_3_to_6_months() {
		return r0050_3_to_6_months;
	}
	public void setR0050_3_to_6_months(BigDecimal r0050_3_to_6_months) {
		this.r0050_3_to_6_months = r0050_3_to_6_months;
	}
	public BigDecimal getR0050_6_to_12_months() {
		return r0050_6_to_12_months;
	}
	public void setR0050_6_to_12_months(BigDecimal r0050_6_to_12_months) {
		this.r0050_6_to_12_months = r0050_6_to_12_months;
	}
	public BigDecimal getR0050_1_to_3_years() {
		return r0050_1_to_3_years;
	}
	public void setR0050_1_to_3_years(BigDecimal r0050_1_to_3_years) {
		this.r0050_1_to_3_years = r0050_1_to_3_years;
	}
	public BigDecimal getR0050_3_to_5_years() {
		return r0050_3_to_5_years;
	}
	public void setR0050_3_to_5_years(BigDecimal r0050_3_to_5_years) {
		this.r0050_3_to_5_years = r0050_3_to_5_years;
	}
	public BigDecimal getR0050_greater_than_5_years() {
		return r0050_greater_than_5_years;
	}
	public void setR0050_greater_than_5_years(BigDecimal r0050_greater_than_5_years) {
		this.r0050_greater_than_5_years = r0050_greater_than_5_years;
	}
	public BigDecimal getR0050_total() {
		return r0050_total;
	}
	public void setR0050_total(BigDecimal r0050_total) {
		this.r0050_total = r0050_total;
	}
	public String getR0060_product() {
		return r0060_product;
	}
	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}
	public BigDecimal getR0060_overdue() {
		return r0060_overdue;
	}
	public void setR0060_overdue(BigDecimal r0060_overdue) {
		this.r0060_overdue = r0060_overdue;
	}
	public BigDecimal getR0060_overdraft() {
		return r0060_overdraft;
	}
	public void setR0060_overdraft(BigDecimal r0060_overdraft) {
		this.r0060_overdraft = r0060_overdraft;
	}
	public BigDecimal getR0060_0_to_7_days() {
		return r0060_0_to_7_days;
	}
	public void setR0060_0_to_7_days(BigDecimal r0060_0_to_7_days) {
		this.r0060_0_to_7_days = r0060_0_to_7_days;
	}
	public BigDecimal getR0060_8_to_14_days() {
		return r0060_8_to_14_days;
	}
	public void setR0060_8_to_14_days(BigDecimal r0060_8_to_14_days) {
		this.r0060_8_to_14_days = r0060_8_to_14_days;
	}
	public BigDecimal getR0060_15_days_to_1_month() {
		return r0060_15_days_to_1_month;
	}
	public void setR0060_15_days_to_1_month(BigDecimal r0060_15_days_to_1_month) {
		this.r0060_15_days_to_1_month = r0060_15_days_to_1_month;
	}
	public BigDecimal getR0060_1_to_2_months() {
		return r0060_1_to_2_months;
	}
	public void setR0060_1_to_2_months(BigDecimal r0060_1_to_2_months) {
		this.r0060_1_to_2_months = r0060_1_to_2_months;
	}
	public BigDecimal getR0060_2_to_3_months() {
		return r0060_2_to_3_months;
	}
	public void setR0060_2_to_3_months(BigDecimal r0060_2_to_3_months) {
		this.r0060_2_to_3_months = r0060_2_to_3_months;
	}
	public BigDecimal getR0060_3_to_6_months() {
		return r0060_3_to_6_months;
	}
	public void setR0060_3_to_6_months(BigDecimal r0060_3_to_6_months) {
		this.r0060_3_to_6_months = r0060_3_to_6_months;
	}
	public BigDecimal getR0060_6_to_12_months() {
		return r0060_6_to_12_months;
	}
	public void setR0060_6_to_12_months(BigDecimal r0060_6_to_12_months) {
		this.r0060_6_to_12_months = r0060_6_to_12_months;
	}
	public BigDecimal getR0060_1_to_3_years() {
		return r0060_1_to_3_years;
	}
	public void setR0060_1_to_3_years(BigDecimal r0060_1_to_3_years) {
		this.r0060_1_to_3_years = r0060_1_to_3_years;
	}
	public BigDecimal getR0060_3_to_5_years() {
		return r0060_3_to_5_years;
	}
	public void setR0060_3_to_5_years(BigDecimal r0060_3_to_5_years) {
		this.r0060_3_to_5_years = r0060_3_to_5_years;
	}
	public BigDecimal getR0060_greater_than_5_years() {
		return r0060_greater_than_5_years;
	}
	public void setR0060_greater_than_5_years(BigDecimal r0060_greater_than_5_years) {
		this.r0060_greater_than_5_years = r0060_greater_than_5_years;
	}
	public BigDecimal getR0060_total() {
		return r0060_total;
	}
	public void setR0060_total(BigDecimal r0060_total) {
		this.r0060_total = r0060_total;
	}
	public String getR0070_product() {
		return r0070_product;
	}
	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}
	public BigDecimal getR0070_overdue() {
		return r0070_overdue;
	}
	public void setR0070_overdue(BigDecimal r0070_overdue) {
		this.r0070_overdue = r0070_overdue;
	}
	public BigDecimal getR0070_overdraft() {
		return r0070_overdraft;
	}
	public void setR0070_overdraft(BigDecimal r0070_overdraft) {
		this.r0070_overdraft = r0070_overdraft;
	}
	public BigDecimal getR0070_0_to_7_days() {
		return r0070_0_to_7_days;
	}
	public void setR0070_0_to_7_days(BigDecimal r0070_0_to_7_days) {
		this.r0070_0_to_7_days = r0070_0_to_7_days;
	}
	public BigDecimal getR0070_8_to_14_days() {
		return r0070_8_to_14_days;
	}
	public void setR0070_8_to_14_days(BigDecimal r0070_8_to_14_days) {
		this.r0070_8_to_14_days = r0070_8_to_14_days;
	}
	public BigDecimal getR0070_15_days_to_1_month() {
		return r0070_15_days_to_1_month;
	}
	public void setR0070_15_days_to_1_month(BigDecimal r0070_15_days_to_1_month) {
		this.r0070_15_days_to_1_month = r0070_15_days_to_1_month;
	}
	public BigDecimal getR0070_1_to_2_months() {
		return r0070_1_to_2_months;
	}
	public void setR0070_1_to_2_months(BigDecimal r0070_1_to_2_months) {
		this.r0070_1_to_2_months = r0070_1_to_2_months;
	}
	public BigDecimal getR0070_2_to_3_months() {
		return r0070_2_to_3_months;
	}
	public void setR0070_2_to_3_months(BigDecimal r0070_2_to_3_months) {
		this.r0070_2_to_3_months = r0070_2_to_3_months;
	}
	public BigDecimal getR0070_3_to_6_months() {
		return r0070_3_to_6_months;
	}
	public void setR0070_3_to_6_months(BigDecimal r0070_3_to_6_months) {
		this.r0070_3_to_6_months = r0070_3_to_6_months;
	}
	public BigDecimal getR0070_6_to_12_months() {
		return r0070_6_to_12_months;
	}
	public void setR0070_6_to_12_months(BigDecimal r0070_6_to_12_months) {
		this.r0070_6_to_12_months = r0070_6_to_12_months;
	}
	public BigDecimal getR0070_1_to_3_years() {
		return r0070_1_to_3_years;
	}
	public void setR0070_1_to_3_years(BigDecimal r0070_1_to_3_years) {
		this.r0070_1_to_3_years = r0070_1_to_3_years;
	}
	public BigDecimal getR0070_3_to_5_years() {
		return r0070_3_to_5_years;
	}
	public void setR0070_3_to_5_years(BigDecimal r0070_3_to_5_years) {
		this.r0070_3_to_5_years = r0070_3_to_5_years;
	}
	public BigDecimal getR0070_greater_than_5_years() {
		return r0070_greater_than_5_years;
	}
	public void setR0070_greater_than_5_years(BigDecimal r0070_greater_than_5_years) {
		this.r0070_greater_than_5_years = r0070_greater_than_5_years;
	}
	public BigDecimal getR0070_total() {
		return r0070_total;
	}
	public void setR0070_total(BigDecimal r0070_total) {
		this.r0070_total = r0070_total;
	}
	public String getR0080_product() {
		return r0080_product;
	}
	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}
	public BigDecimal getR0080_overdue() {
		return r0080_overdue;
	}
	public void setR0080_overdue(BigDecimal r0080_overdue) {
		this.r0080_overdue = r0080_overdue;
	}
	public BigDecimal getR0080_overdraft() {
		return r0080_overdraft;
	}
	public void setR0080_overdraft(BigDecimal r0080_overdraft) {
		this.r0080_overdraft = r0080_overdraft;
	}
	public BigDecimal getR0080_0_to_7_days() {
		return r0080_0_to_7_days;
	}
	public void setR0080_0_to_7_days(BigDecimal r0080_0_to_7_days) {
		this.r0080_0_to_7_days = r0080_0_to_7_days;
	}
	public BigDecimal getR0080_8_to_14_days() {
		return r0080_8_to_14_days;
	}
	public void setR0080_8_to_14_days(BigDecimal r0080_8_to_14_days) {
		this.r0080_8_to_14_days = r0080_8_to_14_days;
	}
	public BigDecimal getR0080_15_days_to_1_month() {
		return r0080_15_days_to_1_month;
	}
	public void setR0080_15_days_to_1_month(BigDecimal r0080_15_days_to_1_month) {
		this.r0080_15_days_to_1_month = r0080_15_days_to_1_month;
	}
	public BigDecimal getR0080_1_to_2_months() {
		return r0080_1_to_2_months;
	}
	public void setR0080_1_to_2_months(BigDecimal r0080_1_to_2_months) {
		this.r0080_1_to_2_months = r0080_1_to_2_months;
	}
	public BigDecimal getR0080_2_to_3_months() {
		return r0080_2_to_3_months;
	}
	public void setR0080_2_to_3_months(BigDecimal r0080_2_to_3_months) {
		this.r0080_2_to_3_months = r0080_2_to_3_months;
	}
	public BigDecimal getR0080_3_to_6_months() {
		return r0080_3_to_6_months;
	}
	public void setR0080_3_to_6_months(BigDecimal r0080_3_to_6_months) {
		this.r0080_3_to_6_months = r0080_3_to_6_months;
	}
	public BigDecimal getR0080_6_to_12_months() {
		return r0080_6_to_12_months;
	}
	public void setR0080_6_to_12_months(BigDecimal r0080_6_to_12_months) {
		this.r0080_6_to_12_months = r0080_6_to_12_months;
	}
	public BigDecimal getR0080_1_to_3_years() {
		return r0080_1_to_3_years;
	}
	public void setR0080_1_to_3_years(BigDecimal r0080_1_to_3_years) {
		this.r0080_1_to_3_years = r0080_1_to_3_years;
	}
	public BigDecimal getR0080_3_to_5_years() {
		return r0080_3_to_5_years;
	}
	public void setR0080_3_to_5_years(BigDecimal r0080_3_to_5_years) {
		this.r0080_3_to_5_years = r0080_3_to_5_years;
	}
	public BigDecimal getR0080_greater_than_5_years() {
		return r0080_greater_than_5_years;
	}
	public void setR0080_greater_than_5_years(BigDecimal r0080_greater_than_5_years) {
		this.r0080_greater_than_5_years = r0080_greater_than_5_years;
	}
	public BigDecimal getR0080_total() {
		return r0080_total;
	}
	public void setR0080_total(BigDecimal r0080_total) {
		this.r0080_total = r0080_total;
	}
	public String getR0090_product() {
		return r0090_product;
	}
	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}
	public BigDecimal getR0090_overdue() {
		return r0090_overdue;
	}
	public void setR0090_overdue(BigDecimal r0090_overdue) {
		this.r0090_overdue = r0090_overdue;
	}
	public BigDecimal getR0090_overdraft() {
		return r0090_overdraft;
	}
	public void setR0090_overdraft(BigDecimal r0090_overdraft) {
		this.r0090_overdraft = r0090_overdraft;
	}
	public BigDecimal getR0090_0_to_7_days() {
		return r0090_0_to_7_days;
	}
	public void setR0090_0_to_7_days(BigDecimal r0090_0_to_7_days) {
		this.r0090_0_to_7_days = r0090_0_to_7_days;
	}
	public BigDecimal getR0090_8_to_14_days() {
		return r0090_8_to_14_days;
	}
	public void setR0090_8_to_14_days(BigDecimal r0090_8_to_14_days) {
		this.r0090_8_to_14_days = r0090_8_to_14_days;
	}
	public BigDecimal getR0090_15_days_to_1_month() {
		return r0090_15_days_to_1_month;
	}
	public void setR0090_15_days_to_1_month(BigDecimal r0090_15_days_to_1_month) {
		this.r0090_15_days_to_1_month = r0090_15_days_to_1_month;
	}
	public BigDecimal getR0090_1_to_2_months() {
		return r0090_1_to_2_months;
	}
	public void setR0090_1_to_2_months(BigDecimal r0090_1_to_2_months) {
		this.r0090_1_to_2_months = r0090_1_to_2_months;
	}
	public BigDecimal getR0090_2_to_3_months() {
		return r0090_2_to_3_months;
	}
	public void setR0090_2_to_3_months(BigDecimal r0090_2_to_3_months) {
		this.r0090_2_to_3_months = r0090_2_to_3_months;
	}
	public BigDecimal getR0090_3_to_6_months() {
		return r0090_3_to_6_months;
	}
	public void setR0090_3_to_6_months(BigDecimal r0090_3_to_6_months) {
		this.r0090_3_to_6_months = r0090_3_to_6_months;
	}
	public BigDecimal getR0090_6_to_12_months() {
		return r0090_6_to_12_months;
	}
	public void setR0090_6_to_12_months(BigDecimal r0090_6_to_12_months) {
		this.r0090_6_to_12_months = r0090_6_to_12_months;
	}
	public BigDecimal getR0090_1_to_3_years() {
		return r0090_1_to_3_years;
	}
	public void setR0090_1_to_3_years(BigDecimal r0090_1_to_3_years) {
		this.r0090_1_to_3_years = r0090_1_to_3_years;
	}
	public BigDecimal getR0090_3_to_5_years() {
		return r0090_3_to_5_years;
	}
	public void setR0090_3_to_5_years(BigDecimal r0090_3_to_5_years) {
		this.r0090_3_to_5_years = r0090_3_to_5_years;
	}
	public BigDecimal getR0090_greater_than_5_years() {
		return r0090_greater_than_5_years;
	}
	public void setR0090_greater_than_5_years(BigDecimal r0090_greater_than_5_years) {
		this.r0090_greater_than_5_years = r0090_greater_than_5_years;
	}
	public BigDecimal getR0090_total() {
		return r0090_total;
	}
	public void setR0090_total(BigDecimal r0090_total) {
		this.r0090_total = r0090_total;
	}
	public String getR0100_product() {
		return r0100_product;
	}
	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}
	public BigDecimal getR0100_overdue() {
		return r0100_overdue;
	}
	public void setR0100_overdue(BigDecimal r0100_overdue) {
		this.r0100_overdue = r0100_overdue;
	}
	public BigDecimal getR0100_overdraft() {
		return r0100_overdraft;
	}
	public void setR0100_overdraft(BigDecimal r0100_overdraft) {
		this.r0100_overdraft = r0100_overdraft;
	}
	public BigDecimal getR0100_0_to_7_days() {
		return r0100_0_to_7_days;
	}
	public void setR0100_0_to_7_days(BigDecimal r0100_0_to_7_days) {
		this.r0100_0_to_7_days = r0100_0_to_7_days;
	}
	public BigDecimal getR0100_8_to_14_days() {
		return r0100_8_to_14_days;
	}
	public void setR0100_8_to_14_days(BigDecimal r0100_8_to_14_days) {
		this.r0100_8_to_14_days = r0100_8_to_14_days;
	}
	public BigDecimal getR0100_15_days_to_1_month() {
		return r0100_15_days_to_1_month;
	}
	public void setR0100_15_days_to_1_month(BigDecimal r0100_15_days_to_1_month) {
		this.r0100_15_days_to_1_month = r0100_15_days_to_1_month;
	}
	public BigDecimal getR0100_1_to_2_months() {
		return r0100_1_to_2_months;
	}
	public void setR0100_1_to_2_months(BigDecimal r0100_1_to_2_months) {
		this.r0100_1_to_2_months = r0100_1_to_2_months;
	}
	public BigDecimal getR0100_2_to_3_months() {
		return r0100_2_to_3_months;
	}
	public void setR0100_2_to_3_months(BigDecimal r0100_2_to_3_months) {
		this.r0100_2_to_3_months = r0100_2_to_3_months;
	}
	public BigDecimal getR0100_3_to_6_months() {
		return r0100_3_to_6_months;
	}
	public void setR0100_3_to_6_months(BigDecimal r0100_3_to_6_months) {
		this.r0100_3_to_6_months = r0100_3_to_6_months;
	}
	public BigDecimal getR0100_6_to_12_months() {
		return r0100_6_to_12_months;
	}
	public void setR0100_6_to_12_months(BigDecimal r0100_6_to_12_months) {
		this.r0100_6_to_12_months = r0100_6_to_12_months;
	}
	public BigDecimal getR0100_1_to_3_years() {
		return r0100_1_to_3_years;
	}
	public void setR0100_1_to_3_years(BigDecimal r0100_1_to_3_years) {
		this.r0100_1_to_3_years = r0100_1_to_3_years;
	}
	public BigDecimal getR0100_3_to_5_years() {
		return r0100_3_to_5_years;
	}
	public void setR0100_3_to_5_years(BigDecimal r0100_3_to_5_years) {
		this.r0100_3_to_5_years = r0100_3_to_5_years;
	}
	public BigDecimal getR0100_greater_than_5_years() {
		return r0100_greater_than_5_years;
	}
	public void setR0100_greater_than_5_years(BigDecimal r0100_greater_than_5_years) {
		this.r0100_greater_than_5_years = r0100_greater_than_5_years;
	}
	public BigDecimal getR0100_total() {
		return r0100_total;
	}
	public void setR0100_total(BigDecimal r0100_total) {
		this.r0100_total = r0100_total;
	}
	public String getR0110_product() {
		return r0110_product;
	}
	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}
	public BigDecimal getR0110_overdue() {
		return r0110_overdue;
	}
	public void setR0110_overdue(BigDecimal r0110_overdue) {
		this.r0110_overdue = r0110_overdue;
	}
	public BigDecimal getR0110_overdraft() {
		return r0110_overdraft;
	}
	public void setR0110_overdraft(BigDecimal r0110_overdraft) {
		this.r0110_overdraft = r0110_overdraft;
	}
	public BigDecimal getR0110_0_to_7_days() {
		return r0110_0_to_7_days;
	}
	public void setR0110_0_to_7_days(BigDecimal r0110_0_to_7_days) {
		this.r0110_0_to_7_days = r0110_0_to_7_days;
	}
	public BigDecimal getR0110_8_to_14_days() {
		return r0110_8_to_14_days;
	}
	public void setR0110_8_to_14_days(BigDecimal r0110_8_to_14_days) {
		this.r0110_8_to_14_days = r0110_8_to_14_days;
	}
	public BigDecimal getR0110_15_days_to_1_month() {
		return r0110_15_days_to_1_month;
	}
	public void setR0110_15_days_to_1_month(BigDecimal r0110_15_days_to_1_month) {
		this.r0110_15_days_to_1_month = r0110_15_days_to_1_month;
	}
	public BigDecimal getR0110_1_to_2_months() {
		return r0110_1_to_2_months;
	}
	public void setR0110_1_to_2_months(BigDecimal r0110_1_to_2_months) {
		this.r0110_1_to_2_months = r0110_1_to_2_months;
	}
	public BigDecimal getR0110_2_to_3_months() {
		return r0110_2_to_3_months;
	}
	public void setR0110_2_to_3_months(BigDecimal r0110_2_to_3_months) {
		this.r0110_2_to_3_months = r0110_2_to_3_months;
	}
	public BigDecimal getR0110_3_to_6_months() {
		return r0110_3_to_6_months;
	}
	public void setR0110_3_to_6_months(BigDecimal r0110_3_to_6_months) {
		this.r0110_3_to_6_months = r0110_3_to_6_months;
	}
	public BigDecimal getR0110_6_to_12_months() {
		return r0110_6_to_12_months;
	}
	public void setR0110_6_to_12_months(BigDecimal r0110_6_to_12_months) {
		this.r0110_6_to_12_months = r0110_6_to_12_months;
	}
	public BigDecimal getR0110_1_to_3_years() {
		return r0110_1_to_3_years;
	}
	public void setR0110_1_to_3_years(BigDecimal r0110_1_to_3_years) {
		this.r0110_1_to_3_years = r0110_1_to_3_years;
	}
	public BigDecimal getR0110_3_to_5_years() {
		return r0110_3_to_5_years;
	}
	public void setR0110_3_to_5_years(BigDecimal r0110_3_to_5_years) {
		this.r0110_3_to_5_years = r0110_3_to_5_years;
	}
	public BigDecimal getR0110_greater_than_5_years() {
		return r0110_greater_than_5_years;
	}
	public void setR0110_greater_than_5_years(BigDecimal r0110_greater_than_5_years) {
		this.r0110_greater_than_5_years = r0110_greater_than_5_years;
	}
	public BigDecimal getR0110_total() {
		return r0110_total;
	}
	public void setR0110_total(BigDecimal r0110_total) {
		this.r0110_total = r0110_total;
	}
	public String getR0120_product() {
		return r0120_product;
	}
	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}
	public BigDecimal getR0120_overdue() {
		return r0120_overdue;
	}
	public void setR0120_overdue(BigDecimal r0120_overdue) {
		this.r0120_overdue = r0120_overdue;
	}
	public BigDecimal getR0120_overdraft() {
		return r0120_overdraft;
	}
	public void setR0120_overdraft(BigDecimal r0120_overdraft) {
		this.r0120_overdraft = r0120_overdraft;
	}
	public BigDecimal getR0120_0_to_7_days() {
		return r0120_0_to_7_days;
	}
	public void setR0120_0_to_7_days(BigDecimal r0120_0_to_7_days) {
		this.r0120_0_to_7_days = r0120_0_to_7_days;
	}
	public BigDecimal getR0120_8_to_14_days() {
		return r0120_8_to_14_days;
	}
	public void setR0120_8_to_14_days(BigDecimal r0120_8_to_14_days) {
		this.r0120_8_to_14_days = r0120_8_to_14_days;
	}
	public BigDecimal getR0120_15_days_to_1_month() {
		return r0120_15_days_to_1_month;
	}
	public void setR0120_15_days_to_1_month(BigDecimal r0120_15_days_to_1_month) {
		this.r0120_15_days_to_1_month = r0120_15_days_to_1_month;
	}
	public BigDecimal getR0120_1_to_2_months() {
		return r0120_1_to_2_months;
	}
	public void setR0120_1_to_2_months(BigDecimal r0120_1_to_2_months) {
		this.r0120_1_to_2_months = r0120_1_to_2_months;
	}
	public BigDecimal getR0120_2_to_3_months() {
		return r0120_2_to_3_months;
	}
	public void setR0120_2_to_3_months(BigDecimal r0120_2_to_3_months) {
		this.r0120_2_to_3_months = r0120_2_to_3_months;
	}
	public BigDecimal getR0120_3_to_6_months() {
		return r0120_3_to_6_months;
	}
	public void setR0120_3_to_6_months(BigDecimal r0120_3_to_6_months) {
		this.r0120_3_to_6_months = r0120_3_to_6_months;
	}
	public BigDecimal getR0120_6_to_12_months() {
		return r0120_6_to_12_months;
	}
	public void setR0120_6_to_12_months(BigDecimal r0120_6_to_12_months) {
		this.r0120_6_to_12_months = r0120_6_to_12_months;
	}
	public BigDecimal getR0120_1_to_3_years() {
		return r0120_1_to_3_years;
	}
	public void setR0120_1_to_3_years(BigDecimal r0120_1_to_3_years) {
		this.r0120_1_to_3_years = r0120_1_to_3_years;
	}
	public BigDecimal getR0120_3_to_5_years() {
		return r0120_3_to_5_years;
	}
	public void setR0120_3_to_5_years(BigDecimal r0120_3_to_5_years) {
		this.r0120_3_to_5_years = r0120_3_to_5_years;
	}
	public BigDecimal getR0120_greater_than_5_years() {
		return r0120_greater_than_5_years;
	}
	public void setR0120_greater_than_5_years(BigDecimal r0120_greater_than_5_years) {
		this.r0120_greater_than_5_years = r0120_greater_than_5_years;
	}
	public BigDecimal getR0120_total() {
		return r0120_total;
	}
	public void setR0120_total(BigDecimal r0120_total) {
		this.r0120_total = r0120_total;
	}
	public String getR0130_product() {
		return r0130_product;
	}
	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}
	public BigDecimal getR0130_overdue() {
		return r0130_overdue;
	}
	public void setR0130_overdue(BigDecimal r0130_overdue) {
		this.r0130_overdue = r0130_overdue;
	}
	public BigDecimal getR0130_overdraft() {
		return r0130_overdraft;
	}
	public void setR0130_overdraft(BigDecimal r0130_overdraft) {
		this.r0130_overdraft = r0130_overdraft;
	}
	public BigDecimal getR0130_0_to_7_days() {
		return r0130_0_to_7_days;
	}
	public void setR0130_0_to_7_days(BigDecimal r0130_0_to_7_days) {
		this.r0130_0_to_7_days = r0130_0_to_7_days;
	}
	public BigDecimal getR0130_8_to_14_days() {
		return r0130_8_to_14_days;
	}
	public void setR0130_8_to_14_days(BigDecimal r0130_8_to_14_days) {
		this.r0130_8_to_14_days = r0130_8_to_14_days;
	}
	public BigDecimal getR0130_15_days_to_1_month() {
		return r0130_15_days_to_1_month;
	}
	public void setR0130_15_days_to_1_month(BigDecimal r0130_15_days_to_1_month) {
		this.r0130_15_days_to_1_month = r0130_15_days_to_1_month;
	}
	public BigDecimal getR0130_1_to_2_months() {
		return r0130_1_to_2_months;
	}
	public void setR0130_1_to_2_months(BigDecimal r0130_1_to_2_months) {
		this.r0130_1_to_2_months = r0130_1_to_2_months;
	}
	public BigDecimal getR0130_2_to_3_months() {
		return r0130_2_to_3_months;
	}
	public void setR0130_2_to_3_months(BigDecimal r0130_2_to_3_months) {
		this.r0130_2_to_3_months = r0130_2_to_3_months;
	}
	public BigDecimal getR0130_3_to_6_months() {
		return r0130_3_to_6_months;
	}
	public void setR0130_3_to_6_months(BigDecimal r0130_3_to_6_months) {
		this.r0130_3_to_6_months = r0130_3_to_6_months;
	}
	public BigDecimal getR0130_6_to_12_months() {
		return r0130_6_to_12_months;
	}
	public void setR0130_6_to_12_months(BigDecimal r0130_6_to_12_months) {
		this.r0130_6_to_12_months = r0130_6_to_12_months;
	}
	public BigDecimal getR0130_1_to_3_years() {
		return r0130_1_to_3_years;
	}
	public void setR0130_1_to_3_years(BigDecimal r0130_1_to_3_years) {
		this.r0130_1_to_3_years = r0130_1_to_3_years;
	}
	public BigDecimal getR0130_3_to_5_years() {
		return r0130_3_to_5_years;
	}
	public void setR0130_3_to_5_years(BigDecimal r0130_3_to_5_years) {
		this.r0130_3_to_5_years = r0130_3_to_5_years;
	}
	public BigDecimal getR0130_greater_than_5_years() {
		return r0130_greater_than_5_years;
	}
	public void setR0130_greater_than_5_years(BigDecimal r0130_greater_than_5_years) {
		this.r0130_greater_than_5_years = r0130_greater_than_5_years;
	}
	public BigDecimal getR0130_total() {
		return r0130_total;
	}
	public void setR0130_total(BigDecimal r0130_total) {
		this.r0130_total = r0130_total;
	}
	public String getR0140_product() {
		return r0140_product;
	}
	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}
	public BigDecimal getR0140_overdue() {
		return r0140_overdue;
	}
	public void setR0140_overdue(BigDecimal r0140_overdue) {
		this.r0140_overdue = r0140_overdue;
	}
	public BigDecimal getR0140_overdraft() {
		return r0140_overdraft;
	}
	public void setR0140_overdraft(BigDecimal r0140_overdraft) {
		this.r0140_overdraft = r0140_overdraft;
	}
	public BigDecimal getR0140_0_to_7_days() {
		return r0140_0_to_7_days;
	}
	public void setR0140_0_to_7_days(BigDecimal r0140_0_to_7_days) {
		this.r0140_0_to_7_days = r0140_0_to_7_days;
	}
	public BigDecimal getR0140_8_to_14_days() {
		return r0140_8_to_14_days;
	}
	public void setR0140_8_to_14_days(BigDecimal r0140_8_to_14_days) {
		this.r0140_8_to_14_days = r0140_8_to_14_days;
	}
	public BigDecimal getR0140_15_days_to_1_month() {
		return r0140_15_days_to_1_month;
	}
	public void setR0140_15_days_to_1_month(BigDecimal r0140_15_days_to_1_month) {
		this.r0140_15_days_to_1_month = r0140_15_days_to_1_month;
	}
	public BigDecimal getR0140_1_to_2_months() {
		return r0140_1_to_2_months;
	}
	public void setR0140_1_to_2_months(BigDecimal r0140_1_to_2_months) {
		this.r0140_1_to_2_months = r0140_1_to_2_months;
	}
	public BigDecimal getR0140_2_to_3_months() {
		return r0140_2_to_3_months;
	}
	public void setR0140_2_to_3_months(BigDecimal r0140_2_to_3_months) {
		this.r0140_2_to_3_months = r0140_2_to_3_months;
	}
	public BigDecimal getR0140_3_to_6_months() {
		return r0140_3_to_6_months;
	}
	public void setR0140_3_to_6_months(BigDecimal r0140_3_to_6_months) {
		this.r0140_3_to_6_months = r0140_3_to_6_months;
	}
	public BigDecimal getR0140_6_to_12_months() {
		return r0140_6_to_12_months;
	}
	public void setR0140_6_to_12_months(BigDecimal r0140_6_to_12_months) {
		this.r0140_6_to_12_months = r0140_6_to_12_months;
	}
	public BigDecimal getR0140_1_to_3_years() {
		return r0140_1_to_3_years;
	}
	public void setR0140_1_to_3_years(BigDecimal r0140_1_to_3_years) {
		this.r0140_1_to_3_years = r0140_1_to_3_years;
	}
	public BigDecimal getR0140_3_to_5_years() {
		return r0140_3_to_5_years;
	}
	public void setR0140_3_to_5_years(BigDecimal r0140_3_to_5_years) {
		this.r0140_3_to_5_years = r0140_3_to_5_years;
	}
	public BigDecimal getR0140_greater_than_5_years() {
		return r0140_greater_than_5_years;
	}
	public void setR0140_greater_than_5_years(BigDecimal r0140_greater_than_5_years) {
		this.r0140_greater_than_5_years = r0140_greater_than_5_years;
	}
	public BigDecimal getR0140_total() {
		return r0140_total;
	}
	public void setR0140_total(BigDecimal r0140_total) {
		this.r0140_total = r0140_total;
	}
	public String getR0150_product() {
		return r0150_product;
	}
	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}
	public BigDecimal getR0150_overdue() {
		return r0150_overdue;
	}
	public void setR0150_overdue(BigDecimal r0150_overdue) {
		this.r0150_overdue = r0150_overdue;
	}
	public BigDecimal getR0150_overdraft() {
		return r0150_overdraft;
	}
	public void setR0150_overdraft(BigDecimal r0150_overdraft) {
		this.r0150_overdraft = r0150_overdraft;
	}
	public BigDecimal getR0150_0_to_7_days() {
		return r0150_0_to_7_days;
	}
	public void setR0150_0_to_7_days(BigDecimal r0150_0_to_7_days) {
		this.r0150_0_to_7_days = r0150_0_to_7_days;
	}
	public BigDecimal getR0150_8_to_14_days() {
		return r0150_8_to_14_days;
	}
	public void setR0150_8_to_14_days(BigDecimal r0150_8_to_14_days) {
		this.r0150_8_to_14_days = r0150_8_to_14_days;
	}
	public BigDecimal getR0150_15_days_to_1_month() {
		return r0150_15_days_to_1_month;
	}
	public void setR0150_15_days_to_1_month(BigDecimal r0150_15_days_to_1_month) {
		this.r0150_15_days_to_1_month = r0150_15_days_to_1_month;
	}
	public BigDecimal getR0150_1_to_2_months() {
		return r0150_1_to_2_months;
	}
	public void setR0150_1_to_2_months(BigDecimal r0150_1_to_2_months) {
		this.r0150_1_to_2_months = r0150_1_to_2_months;
	}
	public BigDecimal getR0150_2_to_3_months() {
		return r0150_2_to_3_months;
	}
	public void setR0150_2_to_3_months(BigDecimal r0150_2_to_3_months) {
		this.r0150_2_to_3_months = r0150_2_to_3_months;
	}
	public BigDecimal getR0150_3_to_6_months() {
		return r0150_3_to_6_months;
	}
	public void setR0150_3_to_6_months(BigDecimal r0150_3_to_6_months) {
		this.r0150_3_to_6_months = r0150_3_to_6_months;
	}
	public BigDecimal getR0150_6_to_12_months() {
		return r0150_6_to_12_months;
	}
	public void setR0150_6_to_12_months(BigDecimal r0150_6_to_12_months) {
		this.r0150_6_to_12_months = r0150_6_to_12_months;
	}
	public BigDecimal getR0150_1_to_3_years() {
		return r0150_1_to_3_years;
	}
	public void setR0150_1_to_3_years(BigDecimal r0150_1_to_3_years) {
		this.r0150_1_to_3_years = r0150_1_to_3_years;
	}
	public BigDecimal getR0150_3_to_5_years() {
		return r0150_3_to_5_years;
	}
	public void setR0150_3_to_5_years(BigDecimal r0150_3_to_5_years) {
		this.r0150_3_to_5_years = r0150_3_to_5_years;
	}
	public BigDecimal getR0150_greater_than_5_years() {
		return r0150_greater_than_5_years;
	}
	public void setR0150_greater_than_5_years(BigDecimal r0150_greater_than_5_years) {
		this.r0150_greater_than_5_years = r0150_greater_than_5_years;
	}
	public BigDecimal getR0150_total() {
		return r0150_total;
	}
	public void setR0150_total(BigDecimal r0150_total) {
		this.r0150_total = r0150_total;
	}
	public String getR0160_product() {
		return r0160_product;
	}
	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}
	public BigDecimal getR0160_overdue() {
		return r0160_overdue;
	}
	public void setR0160_overdue(BigDecimal r0160_overdue) {
		this.r0160_overdue = r0160_overdue;
	}
	public BigDecimal getR0160_overdraft() {
		return r0160_overdraft;
	}
	public void setR0160_overdraft(BigDecimal r0160_overdraft) {
		this.r0160_overdraft = r0160_overdraft;
	}
	public BigDecimal getR0160_0_to_7_days() {
		return r0160_0_to_7_days;
	}
	public void setR0160_0_to_7_days(BigDecimal r0160_0_to_7_days) {
		this.r0160_0_to_7_days = r0160_0_to_7_days;
	}
	public BigDecimal getR0160_8_to_14_days() {
		return r0160_8_to_14_days;
	}
	public void setR0160_8_to_14_days(BigDecimal r0160_8_to_14_days) {
		this.r0160_8_to_14_days = r0160_8_to_14_days;
	}
	public BigDecimal getR0160_15_days_to_1_month() {
		return r0160_15_days_to_1_month;
	}
	public void setR0160_15_days_to_1_month(BigDecimal r0160_15_days_to_1_month) {
		this.r0160_15_days_to_1_month = r0160_15_days_to_1_month;
	}
	public BigDecimal getR0160_1_to_2_months() {
		return r0160_1_to_2_months;
	}
	public void setR0160_1_to_2_months(BigDecimal r0160_1_to_2_months) {
		this.r0160_1_to_2_months = r0160_1_to_2_months;
	}
	public BigDecimal getR0160_2_to_3_months() {
		return r0160_2_to_3_months;
	}
	public void setR0160_2_to_3_months(BigDecimal r0160_2_to_3_months) {
		this.r0160_2_to_3_months = r0160_2_to_3_months;
	}
	public BigDecimal getR0160_3_to_6_months() {
		return r0160_3_to_6_months;
	}
	public void setR0160_3_to_6_months(BigDecimal r0160_3_to_6_months) {
		this.r0160_3_to_6_months = r0160_3_to_6_months;
	}
	public BigDecimal getR0160_6_to_12_months() {
		return r0160_6_to_12_months;
	}
	public void setR0160_6_to_12_months(BigDecimal r0160_6_to_12_months) {
		this.r0160_6_to_12_months = r0160_6_to_12_months;
	}
	public BigDecimal getR0160_1_to_3_years() {
		return r0160_1_to_3_years;
	}
	public void setR0160_1_to_3_years(BigDecimal r0160_1_to_3_years) {
		this.r0160_1_to_3_years = r0160_1_to_3_years;
	}
	public BigDecimal getR0160_3_to_5_years() {
		return r0160_3_to_5_years;
	}
	public void setR0160_3_to_5_years(BigDecimal r0160_3_to_5_years) {
		this.r0160_3_to_5_years = r0160_3_to_5_years;
	}
	public BigDecimal getR0160_greater_than_5_years() {
		return r0160_greater_than_5_years;
	}
	public void setR0160_greater_than_5_years(BigDecimal r0160_greater_than_5_years) {
		this.r0160_greater_than_5_years = r0160_greater_than_5_years;
	}
	public BigDecimal getR0160_total() {
		return r0160_total;
	}
	public void setR0160_total(BigDecimal r0160_total) {
		this.r0160_total = r0160_total;
	}
	public String getR0170_product() {
		return r0170_product;
	}
	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}
	public BigDecimal getR0170_overdue() {
		return r0170_overdue;
	}
	public void setR0170_overdue(BigDecimal r0170_overdue) {
		this.r0170_overdue = r0170_overdue;
	}
	public BigDecimal getR0170_overdraft() {
		return r0170_overdraft;
	}
	public void setR0170_overdraft(BigDecimal r0170_overdraft) {
		this.r0170_overdraft = r0170_overdraft;
	}
	public BigDecimal getR0170_0_to_7_days() {
		return r0170_0_to_7_days;
	}
	public void setR0170_0_to_7_days(BigDecimal r0170_0_to_7_days) {
		this.r0170_0_to_7_days = r0170_0_to_7_days;
	}
	public BigDecimal getR0170_8_to_14_days() {
		return r0170_8_to_14_days;
	}
	public void setR0170_8_to_14_days(BigDecimal r0170_8_to_14_days) {
		this.r0170_8_to_14_days = r0170_8_to_14_days;
	}
	public BigDecimal getR0170_15_days_to_1_month() {
		return r0170_15_days_to_1_month;
	}
	public void setR0170_15_days_to_1_month(BigDecimal r0170_15_days_to_1_month) {
		this.r0170_15_days_to_1_month = r0170_15_days_to_1_month;
	}
	public BigDecimal getR0170_1_to_2_months() {
		return r0170_1_to_2_months;
	}
	public void setR0170_1_to_2_months(BigDecimal r0170_1_to_2_months) {
		this.r0170_1_to_2_months = r0170_1_to_2_months;
	}
	public BigDecimal getR0170_2_to_3_months() {
		return r0170_2_to_3_months;
	}
	public void setR0170_2_to_3_months(BigDecimal r0170_2_to_3_months) {
		this.r0170_2_to_3_months = r0170_2_to_3_months;
	}
	public BigDecimal getR0170_3_to_6_months() {
		return r0170_3_to_6_months;
	}
	public void setR0170_3_to_6_months(BigDecimal r0170_3_to_6_months) {
		this.r0170_3_to_6_months = r0170_3_to_6_months;
	}
	public BigDecimal getR0170_6_to_12_months() {
		return r0170_6_to_12_months;
	}
	public void setR0170_6_to_12_months(BigDecimal r0170_6_to_12_months) {
		this.r0170_6_to_12_months = r0170_6_to_12_months;
	}
	public BigDecimal getR0170_1_to_3_years() {
		return r0170_1_to_3_years;
	}
	public void setR0170_1_to_3_years(BigDecimal r0170_1_to_3_years) {
		this.r0170_1_to_3_years = r0170_1_to_3_years;
	}
	public BigDecimal getR0170_3_to_5_years() {
		return r0170_3_to_5_years;
	}
	public void setR0170_3_to_5_years(BigDecimal r0170_3_to_5_years) {
		this.r0170_3_to_5_years = r0170_3_to_5_years;
	}
	public BigDecimal getR0170_greater_than_5_years() {
		return r0170_greater_than_5_years;
	}
	public void setR0170_greater_than_5_years(BigDecimal r0170_greater_than_5_years) {
		this.r0170_greater_than_5_years = r0170_greater_than_5_years;
	}
	public BigDecimal getR0170_total() {
		return r0170_total;
	}
	public void setR0170_total(BigDecimal r0170_total) {
		this.r0170_total = r0170_total;
	}
	public String getR0180_product() {
		return r0180_product;
	}
	public void setR0180_product(String r0180_product) {
		this.r0180_product = r0180_product;
	}
	public BigDecimal getR0180_overdue() {
		return r0180_overdue;
	}
	public void setR0180_overdue(BigDecimal r0180_overdue) {
		this.r0180_overdue = r0180_overdue;
	}
	public BigDecimal getR0180_overdraft() {
		return r0180_overdraft;
	}
	public void setR0180_overdraft(BigDecimal r0180_overdraft) {
		this.r0180_overdraft = r0180_overdraft;
	}
	public BigDecimal getR0180_0_to_7_days() {
		return r0180_0_to_7_days;
	}
	public void setR0180_0_to_7_days(BigDecimal r0180_0_to_7_days) {
		this.r0180_0_to_7_days = r0180_0_to_7_days;
	}
	public BigDecimal getR0180_8_to_14_days() {
		return r0180_8_to_14_days;
	}
	public void setR0180_8_to_14_days(BigDecimal r0180_8_to_14_days) {
		this.r0180_8_to_14_days = r0180_8_to_14_days;
	}
	public BigDecimal getR0180_15_days_to_1_month() {
		return r0180_15_days_to_1_month;
	}
	public void setR0180_15_days_to_1_month(BigDecimal r0180_15_days_to_1_month) {
		this.r0180_15_days_to_1_month = r0180_15_days_to_1_month;
	}
	public BigDecimal getR0180_1_to_2_months() {
		return r0180_1_to_2_months;
	}
	public void setR0180_1_to_2_months(BigDecimal r0180_1_to_2_months) {
		this.r0180_1_to_2_months = r0180_1_to_2_months;
	}
	public BigDecimal getR0180_2_to_3_months() {
		return r0180_2_to_3_months;
	}
	public void setR0180_2_to_3_months(BigDecimal r0180_2_to_3_months) {
		this.r0180_2_to_3_months = r0180_2_to_3_months;
	}
	public BigDecimal getR0180_3_to_6_months() {
		return r0180_3_to_6_months;
	}
	public void setR0180_3_to_6_months(BigDecimal r0180_3_to_6_months) {
		this.r0180_3_to_6_months = r0180_3_to_6_months;
	}
	public BigDecimal getR0180_6_to_12_months() {
		return r0180_6_to_12_months;
	}
	public void setR0180_6_to_12_months(BigDecimal r0180_6_to_12_months) {
		this.r0180_6_to_12_months = r0180_6_to_12_months;
	}
	public BigDecimal getR0180_1_to_3_years() {
		return r0180_1_to_3_years;
	}
	public void setR0180_1_to_3_years(BigDecimal r0180_1_to_3_years) {
		this.r0180_1_to_3_years = r0180_1_to_3_years;
	}
	public BigDecimal getR0180_3_to_5_years() {
		return r0180_3_to_5_years;
	}
	public void setR0180_3_to_5_years(BigDecimal r0180_3_to_5_years) {
		this.r0180_3_to_5_years = r0180_3_to_5_years;
	}
	public BigDecimal getR0180_greater_than_5_years() {
		return r0180_greater_than_5_years;
	}
	public void setR0180_greater_than_5_years(BigDecimal r0180_greater_than_5_years) {
		this.r0180_greater_than_5_years = r0180_greater_than_5_years;
	}
	public BigDecimal getR0180_total() {
		return r0180_total;
	}
	public void setR0180_total(BigDecimal r0180_total) {
		this.r0180_total = r0180_total;
	}
	public String getR0190_product() {
		return r0190_product;
	}
	public void setR0190_product(String r0190_product) {
		this.r0190_product = r0190_product;
	}
	public BigDecimal getR0190_overdue() {
		return r0190_overdue;
	}
	public void setR0190_overdue(BigDecimal r0190_overdue) {
		this.r0190_overdue = r0190_overdue;
	}
	public BigDecimal getR0190_overdraft() {
		return r0190_overdraft;
	}
	public void setR0190_overdraft(BigDecimal r0190_overdraft) {
		this.r0190_overdraft = r0190_overdraft;
	}
	public BigDecimal getR0190_0_to_7_days() {
		return r0190_0_to_7_days;
	}
	public void setR0190_0_to_7_days(BigDecimal r0190_0_to_7_days) {
		this.r0190_0_to_7_days = r0190_0_to_7_days;
	}
	public BigDecimal getR0190_8_to_14_days() {
		return r0190_8_to_14_days;
	}
	public void setR0190_8_to_14_days(BigDecimal r0190_8_to_14_days) {
		this.r0190_8_to_14_days = r0190_8_to_14_days;
	}
	public BigDecimal getR0190_15_days_to_1_month() {
		return r0190_15_days_to_1_month;
	}
	public void setR0190_15_days_to_1_month(BigDecimal r0190_15_days_to_1_month) {
		this.r0190_15_days_to_1_month = r0190_15_days_to_1_month;
	}
	public BigDecimal getR0190_1_to_2_months() {
		return r0190_1_to_2_months;
	}
	public void setR0190_1_to_2_months(BigDecimal r0190_1_to_2_months) {
		this.r0190_1_to_2_months = r0190_1_to_2_months;
	}
	public BigDecimal getR0190_2_to_3_months() {
		return r0190_2_to_3_months;
	}
	public void setR0190_2_to_3_months(BigDecimal r0190_2_to_3_months) {
		this.r0190_2_to_3_months = r0190_2_to_3_months;
	}
	public BigDecimal getR0190_3_to_6_months() {
		return r0190_3_to_6_months;
	}
	public void setR0190_3_to_6_months(BigDecimal r0190_3_to_6_months) {
		this.r0190_3_to_6_months = r0190_3_to_6_months;
	}
	public BigDecimal getR0190_6_to_12_months() {
		return r0190_6_to_12_months;
	}
	public void setR0190_6_to_12_months(BigDecimal r0190_6_to_12_months) {
		this.r0190_6_to_12_months = r0190_6_to_12_months;
	}
	public BigDecimal getR0190_1_to_3_years() {
		return r0190_1_to_3_years;
	}
	public void setR0190_1_to_3_years(BigDecimal r0190_1_to_3_years) {
		this.r0190_1_to_3_years = r0190_1_to_3_years;
	}
	public BigDecimal getR0190_3_to_5_years() {
		return r0190_3_to_5_years;
	}
	public void setR0190_3_to_5_years(BigDecimal r0190_3_to_5_years) {
		this.r0190_3_to_5_years = r0190_3_to_5_years;
	}
	public BigDecimal getR0190_greater_than_5_years() {
		return r0190_greater_than_5_years;
	}
	public void setR0190_greater_than_5_years(BigDecimal r0190_greater_than_5_years) {
		this.r0190_greater_than_5_years = r0190_greater_than_5_years;
	}
	public BigDecimal getR0190_total() {
		return r0190_total;
	}
	public void setR0190_total(BigDecimal r0190_total) {
		this.r0190_total = r0190_total;
	}
	public String getR0200_product() {
		return r0200_product;
	}
	public void setR0200_product(String r0200_product) {
		this.r0200_product = r0200_product;
	}
	public BigDecimal getR0200_overdue() {
		return r0200_overdue;
	}
	public void setR0200_overdue(BigDecimal r0200_overdue) {
		this.r0200_overdue = r0200_overdue;
	}
	public BigDecimal getR0200_overdraft() {
		return r0200_overdraft;
	}
	public void setR0200_overdraft(BigDecimal r0200_overdraft) {
		this.r0200_overdraft = r0200_overdraft;
	}
	public BigDecimal getR0200_0_to_7_days() {
		return r0200_0_to_7_days;
	}
	public void setR0200_0_to_7_days(BigDecimal r0200_0_to_7_days) {
		this.r0200_0_to_7_days = r0200_0_to_7_days;
	}
	public BigDecimal getR0200_8_to_14_days() {
		return r0200_8_to_14_days;
	}
	public void setR0200_8_to_14_days(BigDecimal r0200_8_to_14_days) {
		this.r0200_8_to_14_days = r0200_8_to_14_days;
	}
	public BigDecimal getR0200_15_days_to_1_month() {
		return r0200_15_days_to_1_month;
	}
	public void setR0200_15_days_to_1_month(BigDecimal r0200_15_days_to_1_month) {
		this.r0200_15_days_to_1_month = r0200_15_days_to_1_month;
	}
	public BigDecimal getR0200_1_to_2_months() {
		return r0200_1_to_2_months;
	}
	public void setR0200_1_to_2_months(BigDecimal r0200_1_to_2_months) {
		this.r0200_1_to_2_months = r0200_1_to_2_months;
	}
	public BigDecimal getR0200_2_to_3_months() {
		return r0200_2_to_3_months;
	}
	public void setR0200_2_to_3_months(BigDecimal r0200_2_to_3_months) {
		this.r0200_2_to_3_months = r0200_2_to_3_months;
	}
	public BigDecimal getR0200_3_to_6_months() {
		return r0200_3_to_6_months;
	}
	public void setR0200_3_to_6_months(BigDecimal r0200_3_to_6_months) {
		this.r0200_3_to_6_months = r0200_3_to_6_months;
	}
	public BigDecimal getR0200_6_to_12_months() {
		return r0200_6_to_12_months;
	}
	public void setR0200_6_to_12_months(BigDecimal r0200_6_to_12_months) {
		this.r0200_6_to_12_months = r0200_6_to_12_months;
	}
	public BigDecimal getR0200_1_to_3_years() {
		return r0200_1_to_3_years;
	}
	public void setR0200_1_to_3_years(BigDecimal r0200_1_to_3_years) {
		this.r0200_1_to_3_years = r0200_1_to_3_years;
	}
	public BigDecimal getR0200_3_to_5_years() {
		return r0200_3_to_5_years;
	}
	public void setR0200_3_to_5_years(BigDecimal r0200_3_to_5_years) {
		this.r0200_3_to_5_years = r0200_3_to_5_years;
	}
	public BigDecimal getR0200_greater_than_5_years() {
		return r0200_greater_than_5_years;
	}
	public void setR0200_greater_than_5_years(BigDecimal r0200_greater_than_5_years) {
		this.r0200_greater_than_5_years = r0200_greater_than_5_years;
	}
	public BigDecimal getR0200_total() {
		return r0200_total;
	}
	public void setR0200_total(BigDecimal r0200_total) {
		this.r0200_total = r0200_total;
	}
	public String getR0210_product() {
		return r0210_product;
	}
	public void setR0210_product(String r0210_product) {
		this.r0210_product = r0210_product;
	}
	public BigDecimal getR0210_overdue() {
		return r0210_overdue;
	}
	public void setR0210_overdue(BigDecimal r0210_overdue) {
		this.r0210_overdue = r0210_overdue;
	}
	public BigDecimal getR0210_overdraft() {
		return r0210_overdraft;
	}
	public void setR0210_overdraft(BigDecimal r0210_overdraft) {
		this.r0210_overdraft = r0210_overdraft;
	}
	public BigDecimal getR0210_0_to_7_days() {
		return r0210_0_to_7_days;
	}
	public void setR0210_0_to_7_days(BigDecimal r0210_0_to_7_days) {
		this.r0210_0_to_7_days = r0210_0_to_7_days;
	}
	public BigDecimal getR0210_8_to_14_days() {
		return r0210_8_to_14_days;
	}
	public void setR0210_8_to_14_days(BigDecimal r0210_8_to_14_days) {
		this.r0210_8_to_14_days = r0210_8_to_14_days;
	}
	public BigDecimal getR0210_15_days_to_1_month() {
		return r0210_15_days_to_1_month;
	}
	public void setR0210_15_days_to_1_month(BigDecimal r0210_15_days_to_1_month) {
		this.r0210_15_days_to_1_month = r0210_15_days_to_1_month;
	}
	public BigDecimal getR0210_1_to_2_months() {
		return r0210_1_to_2_months;
	}
	public void setR0210_1_to_2_months(BigDecimal r0210_1_to_2_months) {
		this.r0210_1_to_2_months = r0210_1_to_2_months;
	}
	public BigDecimal getR0210_2_to_3_months() {
		return r0210_2_to_3_months;
	}
	public void setR0210_2_to_3_months(BigDecimal r0210_2_to_3_months) {
		this.r0210_2_to_3_months = r0210_2_to_3_months;
	}
	public BigDecimal getR0210_3_to_6_months() {
		return r0210_3_to_6_months;
	}
	public void setR0210_3_to_6_months(BigDecimal r0210_3_to_6_months) {
		this.r0210_3_to_6_months = r0210_3_to_6_months;
	}
	public BigDecimal getR0210_6_to_12_months() {
		return r0210_6_to_12_months;
	}
	public void setR0210_6_to_12_months(BigDecimal r0210_6_to_12_months) {
		this.r0210_6_to_12_months = r0210_6_to_12_months;
	}
	public BigDecimal getR0210_1_to_3_years() {
		return r0210_1_to_3_years;
	}
	public void setR0210_1_to_3_years(BigDecimal r0210_1_to_3_years) {
		this.r0210_1_to_3_years = r0210_1_to_3_years;
	}
	public BigDecimal getR0210_3_to_5_years() {
		return r0210_3_to_5_years;
	}
	public void setR0210_3_to_5_years(BigDecimal r0210_3_to_5_years) {
		this.r0210_3_to_5_years = r0210_3_to_5_years;
	}
	public BigDecimal getR0210_greater_than_5_years() {
		return r0210_greater_than_5_years;
	}
	public void setR0210_greater_than_5_years(BigDecimal r0210_greater_than_5_years) {
		this.r0210_greater_than_5_years = r0210_greater_than_5_years;
	}
	public BigDecimal getR0210_total() {
		return r0210_total;
	}
	public void setR0210_total(BigDecimal r0210_total) {
		this.r0210_total = r0210_total;
	}
	public String getR0220_product() {
		return r0220_product;
	}
	public void setR0220_product(String r0220_product) {
		this.r0220_product = r0220_product;
	}
	public BigDecimal getR0220_overdue() {
		return r0220_overdue;
	}
	public void setR0220_overdue(BigDecimal r0220_overdue) {
		this.r0220_overdue = r0220_overdue;
	}
	public BigDecimal getR0220_overdraft() {
		return r0220_overdraft;
	}
	public void setR0220_overdraft(BigDecimal r0220_overdraft) {
		this.r0220_overdraft = r0220_overdraft;
	}
	public BigDecimal getR0220_0_to_7_days() {
		return r0220_0_to_7_days;
	}
	public void setR0220_0_to_7_days(BigDecimal r0220_0_to_7_days) {
		this.r0220_0_to_7_days = r0220_0_to_7_days;
	}
	public BigDecimal getR0220_8_to_14_days() {
		return r0220_8_to_14_days;
	}
	public void setR0220_8_to_14_days(BigDecimal r0220_8_to_14_days) {
		this.r0220_8_to_14_days = r0220_8_to_14_days;
	}
	public BigDecimal getR0220_15_days_to_1_month() {
		return r0220_15_days_to_1_month;
	}
	public void setR0220_15_days_to_1_month(BigDecimal r0220_15_days_to_1_month) {
		this.r0220_15_days_to_1_month = r0220_15_days_to_1_month;
	}
	public BigDecimal getR0220_1_to_2_months() {
		return r0220_1_to_2_months;
	}
	public void setR0220_1_to_2_months(BigDecimal r0220_1_to_2_months) {
		this.r0220_1_to_2_months = r0220_1_to_2_months;
	}
	public BigDecimal getR0220_2_to_3_months() {
		return r0220_2_to_3_months;
	}
	public void setR0220_2_to_3_months(BigDecimal r0220_2_to_3_months) {
		this.r0220_2_to_3_months = r0220_2_to_3_months;
	}
	public BigDecimal getR0220_3_to_6_months() {
		return r0220_3_to_6_months;
	}
	public void setR0220_3_to_6_months(BigDecimal r0220_3_to_6_months) {
		this.r0220_3_to_6_months = r0220_3_to_6_months;
	}
	public BigDecimal getR0220_6_to_12_months() {
		return r0220_6_to_12_months;
	}
	public void setR0220_6_to_12_months(BigDecimal r0220_6_to_12_months) {
		this.r0220_6_to_12_months = r0220_6_to_12_months;
	}
	public BigDecimal getR0220_1_to_3_years() {
		return r0220_1_to_3_years;
	}
	public void setR0220_1_to_3_years(BigDecimal r0220_1_to_3_years) {
		this.r0220_1_to_3_years = r0220_1_to_3_years;
	}
	public BigDecimal getR0220_3_to_5_years() {
		return r0220_3_to_5_years;
	}
	public void setR0220_3_to_5_years(BigDecimal r0220_3_to_5_years) {
		this.r0220_3_to_5_years = r0220_3_to_5_years;
	}
	public BigDecimal getR0220_greater_than_5_years() {
		return r0220_greater_than_5_years;
	}
	public void setR0220_greater_than_5_years(BigDecimal r0220_greater_than_5_years) {
		this.r0220_greater_than_5_years = r0220_greater_than_5_years;
	}
	public BigDecimal getR0220_total() {
		return r0220_total;
	}
	public void setR0220_total(BigDecimal r0220_total) {
		this.r0220_total = r0220_total;
	}
	public String getR0230_product() {
		return r0230_product;
	}
	public void setR0230_product(String r0230_product) {
		this.r0230_product = r0230_product;
	}
	public BigDecimal getR0230_overdue() {
		return r0230_overdue;
	}
	public void setR0230_overdue(BigDecimal r0230_overdue) {
		this.r0230_overdue = r0230_overdue;
	}
	public BigDecimal getR0230_overdraft() {
		return r0230_overdraft;
	}
	public void setR0230_overdraft(BigDecimal r0230_overdraft) {
		this.r0230_overdraft = r0230_overdraft;
	}
	public BigDecimal getR0230_0_to_7_days() {
		return r0230_0_to_7_days;
	}
	public void setR0230_0_to_7_days(BigDecimal r0230_0_to_7_days) {
		this.r0230_0_to_7_days = r0230_0_to_7_days;
	}
	public BigDecimal getR0230_8_to_14_days() {
		return r0230_8_to_14_days;
	}
	public void setR0230_8_to_14_days(BigDecimal r0230_8_to_14_days) {
		this.r0230_8_to_14_days = r0230_8_to_14_days;
	}
	public BigDecimal getR0230_15_days_to_1_month() {
		return r0230_15_days_to_1_month;
	}
	public void setR0230_15_days_to_1_month(BigDecimal r0230_15_days_to_1_month) {
		this.r0230_15_days_to_1_month = r0230_15_days_to_1_month;
	}
	public BigDecimal getR0230_1_to_2_months() {
		return r0230_1_to_2_months;
	}
	public void setR0230_1_to_2_months(BigDecimal r0230_1_to_2_months) {
		this.r0230_1_to_2_months = r0230_1_to_2_months;
	}
	public BigDecimal getR0230_2_to_3_months() {
		return r0230_2_to_3_months;
	}
	public void setR0230_2_to_3_months(BigDecimal r0230_2_to_3_months) {
		this.r0230_2_to_3_months = r0230_2_to_3_months;
	}
	public BigDecimal getR0230_3_to_6_months() {
		return r0230_3_to_6_months;
	}
	public void setR0230_3_to_6_months(BigDecimal r0230_3_to_6_months) {
		this.r0230_3_to_6_months = r0230_3_to_6_months;
	}
	public BigDecimal getR0230_6_to_12_months() {
		return r0230_6_to_12_months;
	}
	public void setR0230_6_to_12_months(BigDecimal r0230_6_to_12_months) {
		this.r0230_6_to_12_months = r0230_6_to_12_months;
	}
	public BigDecimal getR0230_1_to_3_years() {
		return r0230_1_to_3_years;
	}
	public void setR0230_1_to_3_years(BigDecimal r0230_1_to_3_years) {
		this.r0230_1_to_3_years = r0230_1_to_3_years;
	}
	public BigDecimal getR0230_3_to_5_years() {
		return r0230_3_to_5_years;
	}
	public void setR0230_3_to_5_years(BigDecimal r0230_3_to_5_years) {
		this.r0230_3_to_5_years = r0230_3_to_5_years;
	}
	public BigDecimal getR0230_greater_than_5_years() {
		return r0230_greater_than_5_years;
	}
	public void setR0230_greater_than_5_years(BigDecimal r0230_greater_than_5_years) {
		this.r0230_greater_than_5_years = r0230_greater_than_5_years;
	}
	public BigDecimal getR0230_total() {
		return r0230_total;
	}
	public void setR0230_total(BigDecimal r0230_total) {
		this.r0230_total = r0230_total;
	}
	public String getR0240_product() {
		return r0240_product;
	}
	public void setR0240_product(String r0240_product) {
		this.r0240_product = r0240_product;
	}
	public BigDecimal getR0240_overdue() {
		return r0240_overdue;
	}
	public void setR0240_overdue(BigDecimal r0240_overdue) {
		this.r0240_overdue = r0240_overdue;
	}
	public BigDecimal getR0240_overdraft() {
		return r0240_overdraft;
	}
	public void setR0240_overdraft(BigDecimal r0240_overdraft) {
		this.r0240_overdraft = r0240_overdraft;
	}
	public BigDecimal getR0240_0_to_7_days() {
		return r0240_0_to_7_days;
	}
	public void setR0240_0_to_7_days(BigDecimal r0240_0_to_7_days) {
		this.r0240_0_to_7_days = r0240_0_to_7_days;
	}
	public BigDecimal getR0240_8_to_14_days() {
		return r0240_8_to_14_days;
	}
	public void setR0240_8_to_14_days(BigDecimal r0240_8_to_14_days) {
		this.r0240_8_to_14_days = r0240_8_to_14_days;
	}
	public BigDecimal getR0240_15_days_to_1_month() {
		return r0240_15_days_to_1_month;
	}
	public void setR0240_15_days_to_1_month(BigDecimal r0240_15_days_to_1_month) {
		this.r0240_15_days_to_1_month = r0240_15_days_to_1_month;
	}
	public BigDecimal getR0240_1_to_2_months() {
		return r0240_1_to_2_months;
	}
	public void setR0240_1_to_2_months(BigDecimal r0240_1_to_2_months) {
		this.r0240_1_to_2_months = r0240_1_to_2_months;
	}
	public BigDecimal getR0240_2_to_3_months() {
		return r0240_2_to_3_months;
	}
	public void setR0240_2_to_3_months(BigDecimal r0240_2_to_3_months) {
		this.r0240_2_to_3_months = r0240_2_to_3_months;
	}
	public BigDecimal getR0240_3_to_6_months() {
		return r0240_3_to_6_months;
	}
	public void setR0240_3_to_6_months(BigDecimal r0240_3_to_6_months) {
		this.r0240_3_to_6_months = r0240_3_to_6_months;
	}
	public BigDecimal getR0240_6_to_12_months() {
		return r0240_6_to_12_months;
	}
	public void setR0240_6_to_12_months(BigDecimal r0240_6_to_12_months) {
		this.r0240_6_to_12_months = r0240_6_to_12_months;
	}
	public BigDecimal getR0240_1_to_3_years() {
		return r0240_1_to_3_years;
	}
	public void setR0240_1_to_3_years(BigDecimal r0240_1_to_3_years) {
		this.r0240_1_to_3_years = r0240_1_to_3_years;
	}
	public BigDecimal getR0240_3_to_5_years() {
		return r0240_3_to_5_years;
	}
	public void setR0240_3_to_5_years(BigDecimal r0240_3_to_5_years) {
		this.r0240_3_to_5_years = r0240_3_to_5_years;
	}
	public BigDecimal getR0240_greater_than_5_years() {
		return r0240_greater_than_5_years;
	}
	public void setR0240_greater_than_5_years(BigDecimal r0240_greater_than_5_years) {
		this.r0240_greater_than_5_years = r0240_greater_than_5_years;
	}
	public BigDecimal getR0240_total() {
		return r0240_total;
	}
	public void setR0240_total(BigDecimal r0240_total) {
		this.r0240_total = r0240_total;
	}
	public String getR0250_product() {
		return r0250_product;
	}
	public void setR0250_product(String r0250_product) {
		this.r0250_product = r0250_product;
	}
	public BigDecimal getR0250_overdue() {
		return r0250_overdue;
	}
	public void setR0250_overdue(BigDecimal r0250_overdue) {
		this.r0250_overdue = r0250_overdue;
	}
	public BigDecimal getR0250_overdraft() {
		return r0250_overdraft;
	}
	public void setR0250_overdraft(BigDecimal r0250_overdraft) {
		this.r0250_overdraft = r0250_overdraft;
	}
	public BigDecimal getR0250_0_to_7_days() {
		return r0250_0_to_7_days;
	}
	public void setR0250_0_to_7_days(BigDecimal r0250_0_to_7_days) {
		this.r0250_0_to_7_days = r0250_0_to_7_days;
	}
	public BigDecimal getR0250_8_to_14_days() {
		return r0250_8_to_14_days;
	}
	public void setR0250_8_to_14_days(BigDecimal r0250_8_to_14_days) {
		this.r0250_8_to_14_days = r0250_8_to_14_days;
	}
	public BigDecimal getR0250_15_days_to_1_month() {
		return r0250_15_days_to_1_month;
	}
	public void setR0250_15_days_to_1_month(BigDecimal r0250_15_days_to_1_month) {
		this.r0250_15_days_to_1_month = r0250_15_days_to_1_month;
	}
	public BigDecimal getR0250_1_to_2_months() {
		return r0250_1_to_2_months;
	}
	public void setR0250_1_to_2_months(BigDecimal r0250_1_to_2_months) {
		this.r0250_1_to_2_months = r0250_1_to_2_months;
	}
	public BigDecimal getR0250_2_to_3_months() {
		return r0250_2_to_3_months;
	}
	public void setR0250_2_to_3_months(BigDecimal r0250_2_to_3_months) {
		this.r0250_2_to_3_months = r0250_2_to_3_months;
	}
	public BigDecimal getR0250_3_to_6_months() {
		return r0250_3_to_6_months;
	}
	public void setR0250_3_to_6_months(BigDecimal r0250_3_to_6_months) {
		this.r0250_3_to_6_months = r0250_3_to_6_months;
	}
	public BigDecimal getR0250_6_to_12_months() {
		return r0250_6_to_12_months;
	}
	public void setR0250_6_to_12_months(BigDecimal r0250_6_to_12_months) {
		this.r0250_6_to_12_months = r0250_6_to_12_months;
	}
	public BigDecimal getR0250_1_to_3_years() {
		return r0250_1_to_3_years;
	}
	public void setR0250_1_to_3_years(BigDecimal r0250_1_to_3_years) {
		this.r0250_1_to_3_years = r0250_1_to_3_years;
	}
	public BigDecimal getR0250_3_to_5_years() {
		return r0250_3_to_5_years;
	}
	public void setR0250_3_to_5_years(BigDecimal r0250_3_to_5_years) {
		this.r0250_3_to_5_years = r0250_3_to_5_years;
	}
	public BigDecimal getR0250_greater_than_5_years() {
		return r0250_greater_than_5_years;
	}
	public void setR0250_greater_than_5_years(BigDecimal r0250_greater_than_5_years) {
		this.r0250_greater_than_5_years = r0250_greater_than_5_years;
	}
	public BigDecimal getR0250_total() {
		return r0250_total;
	}
	public void setR0250_total(BigDecimal r0250_total) {
		this.r0250_total = r0250_total;
	}
	public String getR0260_product() {
		return r0260_product;
	}
	public void setR0260_product(String r0260_product) {
		this.r0260_product = r0260_product;
	}
	public BigDecimal getR0260_overdue() {
		return r0260_overdue;
	}
	public void setR0260_overdue(BigDecimal r0260_overdue) {
		this.r0260_overdue = r0260_overdue;
	}
	public BigDecimal getR0260_overdraft() {
		return r0260_overdraft;
	}
	public void setR0260_overdraft(BigDecimal r0260_overdraft) {
		this.r0260_overdraft = r0260_overdraft;
	}
	public BigDecimal getR0260_0_to_7_days() {
		return r0260_0_to_7_days;
	}
	public void setR0260_0_to_7_days(BigDecimal r0260_0_to_7_days) {
		this.r0260_0_to_7_days = r0260_0_to_7_days;
	}
	public BigDecimal getR0260_8_to_14_days() {
		return r0260_8_to_14_days;
	}
	public void setR0260_8_to_14_days(BigDecimal r0260_8_to_14_days) {
		this.r0260_8_to_14_days = r0260_8_to_14_days;
	}
	public BigDecimal getR0260_15_days_to_1_month() {
		return r0260_15_days_to_1_month;
	}
	public void setR0260_15_days_to_1_month(BigDecimal r0260_15_days_to_1_month) {
		this.r0260_15_days_to_1_month = r0260_15_days_to_1_month;
	}
	public BigDecimal getR0260_1_to_2_months() {
		return r0260_1_to_2_months;
	}
	public void setR0260_1_to_2_months(BigDecimal r0260_1_to_2_months) {
		this.r0260_1_to_2_months = r0260_1_to_2_months;
	}
	public BigDecimal getR0260_2_to_3_months() {
		return r0260_2_to_3_months;
	}
	public void setR0260_2_to_3_months(BigDecimal r0260_2_to_3_months) {
		this.r0260_2_to_3_months = r0260_2_to_3_months;
	}
	public BigDecimal getR0260_3_to_6_months() {
		return r0260_3_to_6_months;
	}
	public void setR0260_3_to_6_months(BigDecimal r0260_3_to_6_months) {
		this.r0260_3_to_6_months = r0260_3_to_6_months;
	}
	public BigDecimal getR0260_6_to_12_months() {
		return r0260_6_to_12_months;
	}
	public void setR0260_6_to_12_months(BigDecimal r0260_6_to_12_months) {
		this.r0260_6_to_12_months = r0260_6_to_12_months;
	}
	public BigDecimal getR0260_1_to_3_years() {
		return r0260_1_to_3_years;
	}
	public void setR0260_1_to_3_years(BigDecimal r0260_1_to_3_years) {
		this.r0260_1_to_3_years = r0260_1_to_3_years;
	}
	public BigDecimal getR0260_3_to_5_years() {
		return r0260_3_to_5_years;
	}
	public void setR0260_3_to_5_years(BigDecimal r0260_3_to_5_years) {
		this.r0260_3_to_5_years = r0260_3_to_5_years;
	}
	public BigDecimal getR0260_greater_than_5_years() {
		return r0260_greater_than_5_years;
	}
	public void setR0260_greater_than_5_years(BigDecimal r0260_greater_than_5_years) {
		this.r0260_greater_than_5_years = r0260_greater_than_5_years;
	}
	public BigDecimal getR0260_total() {
		return r0260_total;
	}
	public void setR0260_total(BigDecimal r0260_total) {
		this.r0260_total = r0260_total;
	}
	public String getR0270_product() {
		return r0270_product;
	}
	public void setR0270_product(String r0270_product) {
		this.r0270_product = r0270_product;
	}
	public BigDecimal getR0270_overdue() {
		return r0270_overdue;
	}
	public void setR0270_overdue(BigDecimal r0270_overdue) {
		this.r0270_overdue = r0270_overdue;
	}
	public BigDecimal getR0270_overdraft() {
		return r0270_overdraft;
	}
	public void setR0270_overdraft(BigDecimal r0270_overdraft) {
		this.r0270_overdraft = r0270_overdraft;
	}
	public BigDecimal getR0270_0_to_7_days() {
		return r0270_0_to_7_days;
	}
	public void setR0270_0_to_7_days(BigDecimal r0270_0_to_7_days) {
		this.r0270_0_to_7_days = r0270_0_to_7_days;
	}
	public BigDecimal getR0270_8_to_14_days() {
		return r0270_8_to_14_days;
	}
	public void setR0270_8_to_14_days(BigDecimal r0270_8_to_14_days) {
		this.r0270_8_to_14_days = r0270_8_to_14_days;
	}
	public BigDecimal getR0270_15_days_to_1_month() {
		return r0270_15_days_to_1_month;
	}
	public void setR0270_15_days_to_1_month(BigDecimal r0270_15_days_to_1_month) {
		this.r0270_15_days_to_1_month = r0270_15_days_to_1_month;
	}
	public BigDecimal getR0270_1_to_2_months() {
		return r0270_1_to_2_months;
	}
	public void setR0270_1_to_2_months(BigDecimal r0270_1_to_2_months) {
		this.r0270_1_to_2_months = r0270_1_to_2_months;
	}
	public BigDecimal getR0270_2_to_3_months() {
		return r0270_2_to_3_months;
	}
	public void setR0270_2_to_3_months(BigDecimal r0270_2_to_3_months) {
		this.r0270_2_to_3_months = r0270_2_to_3_months;
	}
	public BigDecimal getR0270_3_to_6_months() {
		return r0270_3_to_6_months;
	}
	public void setR0270_3_to_6_months(BigDecimal r0270_3_to_6_months) {
		this.r0270_3_to_6_months = r0270_3_to_6_months;
	}
	public BigDecimal getR0270_6_to_12_months() {
		return r0270_6_to_12_months;
	}
	public void setR0270_6_to_12_months(BigDecimal r0270_6_to_12_months) {
		this.r0270_6_to_12_months = r0270_6_to_12_months;
	}
	public BigDecimal getR0270_1_to_3_years() {
		return r0270_1_to_3_years;
	}
	public void setR0270_1_to_3_years(BigDecimal r0270_1_to_3_years) {
		this.r0270_1_to_3_years = r0270_1_to_3_years;
	}
	public BigDecimal getR0270_3_to_5_years() {
		return r0270_3_to_5_years;
	}
	public void setR0270_3_to_5_years(BigDecimal r0270_3_to_5_years) {
		this.r0270_3_to_5_years = r0270_3_to_5_years;
	}
	public BigDecimal getR0270_greater_than_5_years() {
		return r0270_greater_than_5_years;
	}
	public void setR0270_greater_than_5_years(BigDecimal r0270_greater_than_5_years) {
		this.r0270_greater_than_5_years = r0270_greater_than_5_years;
	}
	public BigDecimal getR0270_total() {
		return r0270_total;
	}
	public void setR0270_total(BigDecimal r0270_total) {
		this.r0270_total = r0270_total;
	}
	public String getR0280_product() {
		return r0280_product;
	}
	public void setR0280_product(String r0280_product) {
		this.r0280_product = r0280_product;
	}
	public BigDecimal getR0280_overdue() {
		return r0280_overdue;
	}
	public void setR0280_overdue(BigDecimal r0280_overdue) {
		this.r0280_overdue = r0280_overdue;
	}
	public BigDecimal getR0280_overdraft() {
		return r0280_overdraft;
	}
	public void setR0280_overdraft(BigDecimal r0280_overdraft) {
		this.r0280_overdraft = r0280_overdraft;
	}
	public BigDecimal getR0280_0_to_7_days() {
		return r0280_0_to_7_days;
	}
	public void setR0280_0_to_7_days(BigDecimal r0280_0_to_7_days) {
		this.r0280_0_to_7_days = r0280_0_to_7_days;
	}
	public BigDecimal getR0280_8_to_14_days() {
		return r0280_8_to_14_days;
	}
	public void setR0280_8_to_14_days(BigDecimal r0280_8_to_14_days) {
		this.r0280_8_to_14_days = r0280_8_to_14_days;
	}
	public BigDecimal getR0280_15_days_to_1_month() {
		return r0280_15_days_to_1_month;
	}
	public void setR0280_15_days_to_1_month(BigDecimal r0280_15_days_to_1_month) {
		this.r0280_15_days_to_1_month = r0280_15_days_to_1_month;
	}
	public BigDecimal getR0280_1_to_2_months() {
		return r0280_1_to_2_months;
	}
	public void setR0280_1_to_2_months(BigDecimal r0280_1_to_2_months) {
		this.r0280_1_to_2_months = r0280_1_to_2_months;
	}
	public BigDecimal getR0280_2_to_3_months() {
		return r0280_2_to_3_months;
	}
	public void setR0280_2_to_3_months(BigDecimal r0280_2_to_3_months) {
		this.r0280_2_to_3_months = r0280_2_to_3_months;
	}
	public BigDecimal getR0280_3_to_6_months() {
		return r0280_3_to_6_months;
	}
	public void setR0280_3_to_6_months(BigDecimal r0280_3_to_6_months) {
		this.r0280_3_to_6_months = r0280_3_to_6_months;
	}
	public BigDecimal getR0280_6_to_12_months() {
		return r0280_6_to_12_months;
	}
	public void setR0280_6_to_12_months(BigDecimal r0280_6_to_12_months) {
		this.r0280_6_to_12_months = r0280_6_to_12_months;
	}
	public BigDecimal getR0280_1_to_3_years() {
		return r0280_1_to_3_years;
	}
	public void setR0280_1_to_3_years(BigDecimal r0280_1_to_3_years) {
		this.r0280_1_to_3_years = r0280_1_to_3_years;
	}
	public BigDecimal getR0280_3_to_5_years() {
		return r0280_3_to_5_years;
	}
	public void setR0280_3_to_5_years(BigDecimal r0280_3_to_5_years) {
		this.r0280_3_to_5_years = r0280_3_to_5_years;
	}
	public BigDecimal getR0280_greater_than_5_years() {
		return r0280_greater_than_5_years;
	}
	public void setR0280_greater_than_5_years(BigDecimal r0280_greater_than_5_years) {
		this.r0280_greater_than_5_years = r0280_greater_than_5_years;
	}
	public BigDecimal getR0280_total() {
		return r0280_total;
	}
	public void setR0280_total(BigDecimal r0280_total) {
		this.r0280_total = r0280_total;
	}
	public String getR0290_product() {
		return r0290_product;
	}
	public void setR0290_product(String r0290_product) {
		this.r0290_product = r0290_product;
	}
	public BigDecimal getR0290_overdue() {
		return r0290_overdue;
	}
	public void setR0290_overdue(BigDecimal r0290_overdue) {
		this.r0290_overdue = r0290_overdue;
	}
	public BigDecimal getR0290_overdraft() {
		return r0290_overdraft;
	}
	public void setR0290_overdraft(BigDecimal r0290_overdraft) {
		this.r0290_overdraft = r0290_overdraft;
	}
	public BigDecimal getR0290_0_to_7_days() {
		return r0290_0_to_7_days;
	}
	public void setR0290_0_to_7_days(BigDecimal r0290_0_to_7_days) {
		this.r0290_0_to_7_days = r0290_0_to_7_days;
	}
	public BigDecimal getR0290_8_to_14_days() {
		return r0290_8_to_14_days;
	}
	public void setR0290_8_to_14_days(BigDecimal r0290_8_to_14_days) {
		this.r0290_8_to_14_days = r0290_8_to_14_days;
	}
	public BigDecimal getR0290_15_days_to_1_month() {
		return r0290_15_days_to_1_month;
	}
	public void setR0290_15_days_to_1_month(BigDecimal r0290_15_days_to_1_month) {
		this.r0290_15_days_to_1_month = r0290_15_days_to_1_month;
	}
	public BigDecimal getR0290_1_to_2_months() {
		return r0290_1_to_2_months;
	}
	public void setR0290_1_to_2_months(BigDecimal r0290_1_to_2_months) {
		this.r0290_1_to_2_months = r0290_1_to_2_months;
	}
	public BigDecimal getR0290_2_to_3_months() {
		return r0290_2_to_3_months;
	}
	public void setR0290_2_to_3_months(BigDecimal r0290_2_to_3_months) {
		this.r0290_2_to_3_months = r0290_2_to_3_months;
	}
	public BigDecimal getR0290_3_to_6_months() {
		return r0290_3_to_6_months;
	}
	public void setR0290_3_to_6_months(BigDecimal r0290_3_to_6_months) {
		this.r0290_3_to_6_months = r0290_3_to_6_months;
	}
	public BigDecimal getR0290_6_to_12_months() {
		return r0290_6_to_12_months;
	}
	public void setR0290_6_to_12_months(BigDecimal r0290_6_to_12_months) {
		this.r0290_6_to_12_months = r0290_6_to_12_months;
	}
	public BigDecimal getR0290_1_to_3_years() {
		return r0290_1_to_3_years;
	}
	public void setR0290_1_to_3_years(BigDecimal r0290_1_to_3_years) {
		this.r0290_1_to_3_years = r0290_1_to_3_years;
	}
	public BigDecimal getR0290_3_to_5_years() {
		return r0290_3_to_5_years;
	}
	public void setR0290_3_to_5_years(BigDecimal r0290_3_to_5_years) {
		this.r0290_3_to_5_years = r0290_3_to_5_years;
	}
	public BigDecimal getR0290_greater_than_5_years() {
		return r0290_greater_than_5_years;
	}
	public void setR0290_greater_than_5_years(BigDecimal r0290_greater_than_5_years) {
		this.r0290_greater_than_5_years = r0290_greater_than_5_years;
	}
	public BigDecimal getR0290_total() {
		return r0290_total;
	}
	public void setR0290_total(BigDecimal r0290_total) {
		this.r0290_total = r0290_total;
	}
	public String getR0300_product() {
		return r0300_product;
	}
	public void setR0300_product(String r0300_product) {
		this.r0300_product = r0300_product;
	}
	public BigDecimal getR0300_overdue() {
		return r0300_overdue;
	}
	public void setR0300_overdue(BigDecimal r0300_overdue) {
		this.r0300_overdue = r0300_overdue;
	}
	public BigDecimal getR0300_overdraft() {
		return r0300_overdraft;
	}
	public void setR0300_overdraft(BigDecimal r0300_overdraft) {
		this.r0300_overdraft = r0300_overdraft;
	}
	public BigDecimal getR0300_0_to_7_days() {
		return r0300_0_to_7_days;
	}
	public void setR0300_0_to_7_days(BigDecimal r0300_0_to_7_days) {
		this.r0300_0_to_7_days = r0300_0_to_7_days;
	}
	public BigDecimal getR0300_8_to_14_days() {
		return r0300_8_to_14_days;
	}
	public void setR0300_8_to_14_days(BigDecimal r0300_8_to_14_days) {
		this.r0300_8_to_14_days = r0300_8_to_14_days;
	}
	public BigDecimal getR0300_15_days_to_1_month() {
		return r0300_15_days_to_1_month;
	}
	public void setR0300_15_days_to_1_month(BigDecimal r0300_15_days_to_1_month) {
		this.r0300_15_days_to_1_month = r0300_15_days_to_1_month;
	}
	public BigDecimal getR0300_1_to_2_months() {
		return r0300_1_to_2_months;
	}
	public void setR0300_1_to_2_months(BigDecimal r0300_1_to_2_months) {
		this.r0300_1_to_2_months = r0300_1_to_2_months;
	}
	public BigDecimal getR0300_2_to_3_months() {
		return r0300_2_to_3_months;
	}
	public void setR0300_2_to_3_months(BigDecimal r0300_2_to_3_months) {
		this.r0300_2_to_3_months = r0300_2_to_3_months;
	}
	public BigDecimal getR0300_3_to_6_months() {
		return r0300_3_to_6_months;
	}
	public void setR0300_3_to_6_months(BigDecimal r0300_3_to_6_months) {
		this.r0300_3_to_6_months = r0300_3_to_6_months;
	}
	public BigDecimal getR0300_6_to_12_months() {
		return r0300_6_to_12_months;
	}
	public void setR0300_6_to_12_months(BigDecimal r0300_6_to_12_months) {
		this.r0300_6_to_12_months = r0300_6_to_12_months;
	}
	public BigDecimal getR0300_1_to_3_years() {
		return r0300_1_to_3_years;
	}
	public void setR0300_1_to_3_years(BigDecimal r0300_1_to_3_years) {
		this.r0300_1_to_3_years = r0300_1_to_3_years;
	}
	public BigDecimal getR0300_3_to_5_years() {
		return r0300_3_to_5_years;
	}
	public void setR0300_3_to_5_years(BigDecimal r0300_3_to_5_years) {
		this.r0300_3_to_5_years = r0300_3_to_5_years;
	}
	public BigDecimal getR0300_greater_than_5_years() {
		return r0300_greater_than_5_years;
	}
	public void setR0300_greater_than_5_years(BigDecimal r0300_greater_than_5_years) {
		this.r0300_greater_than_5_years = r0300_greater_than_5_years;
	}
	public BigDecimal getR0300_total() {
		return r0300_total;
	}
	public void setR0300_total(BigDecimal r0300_total) {
		this.r0300_total = r0300_total;
	}
	public String getR0310_product() {
		return r0310_product;
	}
	public void setR0310_product(String r0310_product) {
		this.r0310_product = r0310_product;
	}
	public BigDecimal getR0310_overdue() {
		return r0310_overdue;
	}
	public void setR0310_overdue(BigDecimal r0310_overdue) {
		this.r0310_overdue = r0310_overdue;
	}
	public BigDecimal getR0310_overdraft() {
		return r0310_overdraft;
	}
	public void setR0310_overdraft(BigDecimal r0310_overdraft) {
		this.r0310_overdraft = r0310_overdraft;
	}
	public BigDecimal getR0310_0_to_7_days() {
		return r0310_0_to_7_days;
	}
	public void setR0310_0_to_7_days(BigDecimal r0310_0_to_7_days) {
		this.r0310_0_to_7_days = r0310_0_to_7_days;
	}
	public BigDecimal getR0310_8_to_14_days() {
		return r0310_8_to_14_days;
	}
	public void setR0310_8_to_14_days(BigDecimal r0310_8_to_14_days) {
		this.r0310_8_to_14_days = r0310_8_to_14_days;
	}
	public BigDecimal getR0310_15_days_to_1_month() {
		return r0310_15_days_to_1_month;
	}
	public void setR0310_15_days_to_1_month(BigDecimal r0310_15_days_to_1_month) {
		this.r0310_15_days_to_1_month = r0310_15_days_to_1_month;
	}
	public BigDecimal getR0310_1_to_2_months() {
		return r0310_1_to_2_months;
	}
	public void setR0310_1_to_2_months(BigDecimal r0310_1_to_2_months) {
		this.r0310_1_to_2_months = r0310_1_to_2_months;
	}
	public BigDecimal getR0310_2_to_3_months() {
		return r0310_2_to_3_months;
	}
	public void setR0310_2_to_3_months(BigDecimal r0310_2_to_3_months) {
		this.r0310_2_to_3_months = r0310_2_to_3_months;
	}
	public BigDecimal getR0310_3_to_6_months() {
		return r0310_3_to_6_months;
	}
	public void setR0310_3_to_6_months(BigDecimal r0310_3_to_6_months) {
		this.r0310_3_to_6_months = r0310_3_to_6_months;
	}
	public BigDecimal getR0310_6_to_12_months() {
		return r0310_6_to_12_months;
	}
	public void setR0310_6_to_12_months(BigDecimal r0310_6_to_12_months) {
		this.r0310_6_to_12_months = r0310_6_to_12_months;
	}
	public BigDecimal getR0310_1_to_3_years() {
		return r0310_1_to_3_years;
	}
	public void setR0310_1_to_3_years(BigDecimal r0310_1_to_3_years) {
		this.r0310_1_to_3_years = r0310_1_to_3_years;
	}
	public BigDecimal getR0310_3_to_5_years() {
		return r0310_3_to_5_years;
	}
	public void setR0310_3_to_5_years(BigDecimal r0310_3_to_5_years) {
		this.r0310_3_to_5_years = r0310_3_to_5_years;
	}
	public BigDecimal getR0310_greater_than_5_years() {
		return r0310_greater_than_5_years;
	}
	public void setR0310_greater_than_5_years(BigDecimal r0310_greater_than_5_years) {
		this.r0310_greater_than_5_years = r0310_greater_than_5_years;
	}
	public BigDecimal getR0310_total() {
		return r0310_total;
	}
	public void setR0310_total(BigDecimal r0310_total) {
		this.r0310_total = r0310_total;
	}
	public String getR0320_product() {
		return r0320_product;
	}
	public void setR0320_product(String r0320_product) {
		this.r0320_product = r0320_product;
	}
	public BigDecimal getR0320_overdue() {
		return r0320_overdue;
	}
	public void setR0320_overdue(BigDecimal r0320_overdue) {
		this.r0320_overdue = r0320_overdue;
	}
	public BigDecimal getR0320_overdraft() {
		return r0320_overdraft;
	}
	public void setR0320_overdraft(BigDecimal r0320_overdraft) {
		this.r0320_overdraft = r0320_overdraft;
	}
	public BigDecimal getR0320_0_to_7_days() {
		return r0320_0_to_7_days;
	}
	public void setR0320_0_to_7_days(BigDecimal r0320_0_to_7_days) {
		this.r0320_0_to_7_days = r0320_0_to_7_days;
	}
	public BigDecimal getR0320_8_to_14_days() {
		return r0320_8_to_14_days;
	}
	public void setR0320_8_to_14_days(BigDecimal r0320_8_to_14_days) {
		this.r0320_8_to_14_days = r0320_8_to_14_days;
	}
	public BigDecimal getR0320_15_days_to_1_month() {
		return r0320_15_days_to_1_month;
	}
	public void setR0320_15_days_to_1_month(BigDecimal r0320_15_days_to_1_month) {
		this.r0320_15_days_to_1_month = r0320_15_days_to_1_month;
	}
	public BigDecimal getR0320_1_to_2_months() {
		return r0320_1_to_2_months;
	}
	public void setR0320_1_to_2_months(BigDecimal r0320_1_to_2_months) {
		this.r0320_1_to_2_months = r0320_1_to_2_months;
	}
	public BigDecimal getR0320_2_to_3_months() {
		return r0320_2_to_3_months;
	}
	public void setR0320_2_to_3_months(BigDecimal r0320_2_to_3_months) {
		this.r0320_2_to_3_months = r0320_2_to_3_months;
	}
	public BigDecimal getR0320_3_to_6_months() {
		return r0320_3_to_6_months;
	}
	public void setR0320_3_to_6_months(BigDecimal r0320_3_to_6_months) {
		this.r0320_3_to_6_months = r0320_3_to_6_months;
	}
	public BigDecimal getR0320_6_to_12_months() {
		return r0320_6_to_12_months;
	}
	public void setR0320_6_to_12_months(BigDecimal r0320_6_to_12_months) {
		this.r0320_6_to_12_months = r0320_6_to_12_months;
	}
	public BigDecimal getR0320_1_to_3_years() {
		return r0320_1_to_3_years;
	}
	public void setR0320_1_to_3_years(BigDecimal r0320_1_to_3_years) {
		this.r0320_1_to_3_years = r0320_1_to_3_years;
	}
	public BigDecimal getR0320_3_to_5_years() {
		return r0320_3_to_5_years;
	}
	public void setR0320_3_to_5_years(BigDecimal r0320_3_to_5_years) {
		this.r0320_3_to_5_years = r0320_3_to_5_years;
	}
	public BigDecimal getR0320_greater_than_5_years() {
		return r0320_greater_than_5_years;
	}
	public void setR0320_greater_than_5_years(BigDecimal r0320_greater_than_5_years) {
		this.r0320_greater_than_5_years = r0320_greater_than_5_years;
	}
	public BigDecimal getR0320_total() {
		return r0320_total;
	}
	public void setR0320_total(BigDecimal r0320_total) {
		this.r0320_total = r0320_total;
	}
	public String getR0330_product() {
		return r0330_product;
	}
	public void setR0330_product(String r0330_product) {
		this.r0330_product = r0330_product;
	}
	public BigDecimal getR0330_overdue() {
		return r0330_overdue;
	}
	public void setR0330_overdue(BigDecimal r0330_overdue) {
		this.r0330_overdue = r0330_overdue;
	}
	public BigDecimal getR0330_overdraft() {
		return r0330_overdraft;
	}
	public void setR0330_overdraft(BigDecimal r0330_overdraft) {
		this.r0330_overdraft = r0330_overdraft;
	}
	public BigDecimal getR0330_0_to_7_days() {
		return r0330_0_to_7_days;
	}
	public void setR0330_0_to_7_days(BigDecimal r0330_0_to_7_days) {
		this.r0330_0_to_7_days = r0330_0_to_7_days;
	}
	public BigDecimal getR0330_8_to_14_days() {
		return r0330_8_to_14_days;
	}
	public void setR0330_8_to_14_days(BigDecimal r0330_8_to_14_days) {
		this.r0330_8_to_14_days = r0330_8_to_14_days;
	}
	public BigDecimal getR0330_15_days_to_1_month() {
		return r0330_15_days_to_1_month;
	}
	public void setR0330_15_days_to_1_month(BigDecimal r0330_15_days_to_1_month) {
		this.r0330_15_days_to_1_month = r0330_15_days_to_1_month;
	}
	public BigDecimal getR0330_1_to_2_months() {
		return r0330_1_to_2_months;
	}
	public void setR0330_1_to_2_months(BigDecimal r0330_1_to_2_months) {
		this.r0330_1_to_2_months = r0330_1_to_2_months;
	}
	public BigDecimal getR0330_2_to_3_months() {
		return r0330_2_to_3_months;
	}
	public void setR0330_2_to_3_months(BigDecimal r0330_2_to_3_months) {
		this.r0330_2_to_3_months = r0330_2_to_3_months;
	}
	public BigDecimal getR0330_3_to_6_months() {
		return r0330_3_to_6_months;
	}
	public void setR0330_3_to_6_months(BigDecimal r0330_3_to_6_months) {
		this.r0330_3_to_6_months = r0330_3_to_6_months;
	}
	public BigDecimal getR0330_6_to_12_months() {
		return r0330_6_to_12_months;
	}
	public void setR0330_6_to_12_months(BigDecimal r0330_6_to_12_months) {
		this.r0330_6_to_12_months = r0330_6_to_12_months;
	}
	public BigDecimal getR0330_1_to_3_years() {
		return r0330_1_to_3_years;
	}
	public void setR0330_1_to_3_years(BigDecimal r0330_1_to_3_years) {
		this.r0330_1_to_3_years = r0330_1_to_3_years;
	}
	public BigDecimal getR0330_3_to_5_years() {
		return r0330_3_to_5_years;
	}
	public void setR0330_3_to_5_years(BigDecimal r0330_3_to_5_years) {
		this.r0330_3_to_5_years = r0330_3_to_5_years;
	}
	public BigDecimal getR0330_greater_than_5_years() {
		return r0330_greater_than_5_years;
	}
	public void setR0330_greater_than_5_years(BigDecimal r0330_greater_than_5_years) {
		this.r0330_greater_than_5_years = r0330_greater_than_5_years;
	}
	public BigDecimal getR0330_total() {
		return r0330_total;
	}
	public void setR0330_total(BigDecimal r0330_total) {
		this.r0330_total = r0330_total;
	}
	public String getR0340_product() {
		return r0340_product;
	}
	public void setR0340_product(String r0340_product) {
		this.r0340_product = r0340_product;
	}
	public BigDecimal getR0340_overdue() {
		return r0340_overdue;
	}
	public void setR0340_overdue(BigDecimal r0340_overdue) {
		this.r0340_overdue = r0340_overdue;
	}
	public BigDecimal getR0340_overdraft() {
		return r0340_overdraft;
	}
	public void setR0340_overdraft(BigDecimal r0340_overdraft) {
		this.r0340_overdraft = r0340_overdraft;
	}
	public BigDecimal getR0340_0_to_7_days() {
		return r0340_0_to_7_days;
	}
	public void setR0340_0_to_7_days(BigDecimal r0340_0_to_7_days) {
		this.r0340_0_to_7_days = r0340_0_to_7_days;
	}
	public BigDecimal getR0340_8_to_14_days() {
		return r0340_8_to_14_days;
	}
	public void setR0340_8_to_14_days(BigDecimal r0340_8_to_14_days) {
		this.r0340_8_to_14_days = r0340_8_to_14_days;
	}
	public BigDecimal getR0340_15_days_to_1_month() {
		return r0340_15_days_to_1_month;
	}
	public void setR0340_15_days_to_1_month(BigDecimal r0340_15_days_to_1_month) {
		this.r0340_15_days_to_1_month = r0340_15_days_to_1_month;
	}
	public BigDecimal getR0340_1_to_2_months() {
		return r0340_1_to_2_months;
	}
	public void setR0340_1_to_2_months(BigDecimal r0340_1_to_2_months) {
		this.r0340_1_to_2_months = r0340_1_to_2_months;
	}
	public BigDecimal getR0340_2_to_3_months() {
		return r0340_2_to_3_months;
	}
	public void setR0340_2_to_3_months(BigDecimal r0340_2_to_3_months) {
		this.r0340_2_to_3_months = r0340_2_to_3_months;
	}
	public BigDecimal getR0340_3_to_6_months() {
		return r0340_3_to_6_months;
	}
	public void setR0340_3_to_6_months(BigDecimal r0340_3_to_6_months) {
		this.r0340_3_to_6_months = r0340_3_to_6_months;
	}
	public BigDecimal getR0340_6_to_12_months() {
		return r0340_6_to_12_months;
	}
	public void setR0340_6_to_12_months(BigDecimal r0340_6_to_12_months) {
		this.r0340_6_to_12_months = r0340_6_to_12_months;
	}
	public BigDecimal getR0340_1_to_3_years() {
		return r0340_1_to_3_years;
	}
	public void setR0340_1_to_3_years(BigDecimal r0340_1_to_3_years) {
		this.r0340_1_to_3_years = r0340_1_to_3_years;
	}
	public BigDecimal getR0340_3_to_5_years() {
		return r0340_3_to_5_years;
	}
	public void setR0340_3_to_5_years(BigDecimal r0340_3_to_5_years) {
		this.r0340_3_to_5_years = r0340_3_to_5_years;
	}
	public BigDecimal getR0340_greater_than_5_years() {
		return r0340_greater_than_5_years;
	}
	public void setR0340_greater_than_5_years(BigDecimal r0340_greater_than_5_years) {
		this.r0340_greater_than_5_years = r0340_greater_than_5_years;
	}
	public BigDecimal getR0340_total() {
		return r0340_total;
	}
	public void setR0340_total(BigDecimal r0340_total) {
		this.r0340_total = r0340_total;
	}
	public String getR0350_product() {
		return r0350_product;
	}
	public void setR0350_product(String r0350_product) {
		this.r0350_product = r0350_product;
	}
	public BigDecimal getR0350_overdue() {
		return r0350_overdue;
	}
	public void setR0350_overdue(BigDecimal r0350_overdue) {
		this.r0350_overdue = r0350_overdue;
	}
	public BigDecimal getR0350_overdraft() {
		return r0350_overdraft;
	}
	public void setR0350_overdraft(BigDecimal r0350_overdraft) {
		this.r0350_overdraft = r0350_overdraft;
	}
	public BigDecimal getR0350_0_to_7_days() {
		return r0350_0_to_7_days;
	}
	public void setR0350_0_to_7_days(BigDecimal r0350_0_to_7_days) {
		this.r0350_0_to_7_days = r0350_0_to_7_days;
	}
	public BigDecimal getR0350_8_to_14_days() {
		return r0350_8_to_14_days;
	}
	public void setR0350_8_to_14_days(BigDecimal r0350_8_to_14_days) {
		this.r0350_8_to_14_days = r0350_8_to_14_days;
	}
	public BigDecimal getR0350_15_days_to_1_month() {
		return r0350_15_days_to_1_month;
	}
	public void setR0350_15_days_to_1_month(BigDecimal r0350_15_days_to_1_month) {
		this.r0350_15_days_to_1_month = r0350_15_days_to_1_month;
	}
	public BigDecimal getR0350_1_to_2_months() {
		return r0350_1_to_2_months;
	}
	public void setR0350_1_to_2_months(BigDecimal r0350_1_to_2_months) {
		this.r0350_1_to_2_months = r0350_1_to_2_months;
	}
	public BigDecimal getR0350_2_to_3_months() {
		return r0350_2_to_3_months;
	}
	public void setR0350_2_to_3_months(BigDecimal r0350_2_to_3_months) {
		this.r0350_2_to_3_months = r0350_2_to_3_months;
	}
	public BigDecimal getR0350_3_to_6_months() {
		return r0350_3_to_6_months;
	}
	public void setR0350_3_to_6_months(BigDecimal r0350_3_to_6_months) {
		this.r0350_3_to_6_months = r0350_3_to_6_months;
	}
	public BigDecimal getR0350_6_to_12_months() {
		return r0350_6_to_12_months;
	}
	public void setR0350_6_to_12_months(BigDecimal r0350_6_to_12_months) {
		this.r0350_6_to_12_months = r0350_6_to_12_months;
	}
	public BigDecimal getR0350_1_to_3_years() {
		return r0350_1_to_3_years;
	}
	public void setR0350_1_to_3_years(BigDecimal r0350_1_to_3_years) {
		this.r0350_1_to_3_years = r0350_1_to_3_years;
	}
	public BigDecimal getR0350_3_to_5_years() {
		return r0350_3_to_5_years;
	}
	public void setR0350_3_to_5_years(BigDecimal r0350_3_to_5_years) {
		this.r0350_3_to_5_years = r0350_3_to_5_years;
	}
	public BigDecimal getR0350_greater_than_5_years() {
		return r0350_greater_than_5_years;
	}
	public void setR0350_greater_than_5_years(BigDecimal r0350_greater_than_5_years) {
		this.r0350_greater_than_5_years = r0350_greater_than_5_years;
	}
	public BigDecimal getR0350_total() {
		return r0350_total;
	}
	public void setR0350_total(BigDecimal r0350_total) {
		this.r0350_total = r0350_total;
	}
	public String getR0360_product() {
		return r0360_product;
	}
	public void setR0360_product(String r0360_product) {
		this.r0360_product = r0360_product;
	}
	public BigDecimal getR0360_overdue() {
		return r0360_overdue;
	}
	public void setR0360_overdue(BigDecimal r0360_overdue) {
		this.r0360_overdue = r0360_overdue;
	}
	public BigDecimal getR0360_overdraft() {
		return r0360_overdraft;
	}
	public void setR0360_overdraft(BigDecimal r0360_overdraft) {
		this.r0360_overdraft = r0360_overdraft;
	}
	public BigDecimal getR0360_0_to_7_days() {
		return r0360_0_to_7_days;
	}
	public void setR0360_0_to_7_days(BigDecimal r0360_0_to_7_days) {
		this.r0360_0_to_7_days = r0360_0_to_7_days;
	}
	public BigDecimal getR0360_8_to_14_days() {
		return r0360_8_to_14_days;
	}
	public void setR0360_8_to_14_days(BigDecimal r0360_8_to_14_days) {
		this.r0360_8_to_14_days = r0360_8_to_14_days;
	}
	public BigDecimal getR0360_15_days_to_1_month() {
		return r0360_15_days_to_1_month;
	}
	public void setR0360_15_days_to_1_month(BigDecimal r0360_15_days_to_1_month) {
		this.r0360_15_days_to_1_month = r0360_15_days_to_1_month;
	}
	public BigDecimal getR0360_1_to_2_months() {
		return r0360_1_to_2_months;
	}
	public void setR0360_1_to_2_months(BigDecimal r0360_1_to_2_months) {
		this.r0360_1_to_2_months = r0360_1_to_2_months;
	}
	public BigDecimal getR0360_2_to_3_months() {
		return r0360_2_to_3_months;
	}
	public void setR0360_2_to_3_months(BigDecimal r0360_2_to_3_months) {
		this.r0360_2_to_3_months = r0360_2_to_3_months;
	}
	public BigDecimal getR0360_3_to_6_months() {
		return r0360_3_to_6_months;
	}
	public void setR0360_3_to_6_months(BigDecimal r0360_3_to_6_months) {
		this.r0360_3_to_6_months = r0360_3_to_6_months;
	}
	public BigDecimal getR0360_6_to_12_months() {
		return r0360_6_to_12_months;
	}
	public void setR0360_6_to_12_months(BigDecimal r0360_6_to_12_months) {
		this.r0360_6_to_12_months = r0360_6_to_12_months;
	}
	public BigDecimal getR0360_1_to_3_years() {
		return r0360_1_to_3_years;
	}
	public void setR0360_1_to_3_years(BigDecimal r0360_1_to_3_years) {
		this.r0360_1_to_3_years = r0360_1_to_3_years;
	}
	public BigDecimal getR0360_3_to_5_years() {
		return r0360_3_to_5_years;
	}
	public void setR0360_3_to_5_years(BigDecimal r0360_3_to_5_years) {
		this.r0360_3_to_5_years = r0360_3_to_5_years;
	}
	public BigDecimal getR0360_greater_than_5_years() {
		return r0360_greater_than_5_years;
	}
	public void setR0360_greater_than_5_years(BigDecimal r0360_greater_than_5_years) {
		this.r0360_greater_than_5_years = r0360_greater_than_5_years;
	}
	public BigDecimal getR0360_total() {
		return r0360_total;
	}
	public void setR0360_total(BigDecimal r0360_total) {
		this.r0360_total = r0360_total;
	}
	public String getR0370_product() {
		return r0370_product;
	}
	public void setR0370_product(String r0370_product) {
		this.r0370_product = r0370_product;
	}
	public BigDecimal getR0370_overdue() {
		return r0370_overdue;
	}
	public void setR0370_overdue(BigDecimal r0370_overdue) {
		this.r0370_overdue = r0370_overdue;
	}
	public BigDecimal getR0370_overdraft() {
		return r0370_overdraft;
	}
	public void setR0370_overdraft(BigDecimal r0370_overdraft) {
		this.r0370_overdraft = r0370_overdraft;
	}
	public BigDecimal getR0370_0_to_7_days() {
		return r0370_0_to_7_days;
	}
	public void setR0370_0_to_7_days(BigDecimal r0370_0_to_7_days) {
		this.r0370_0_to_7_days = r0370_0_to_7_days;
	}
	public BigDecimal getR0370_8_to_14_days() {
		return r0370_8_to_14_days;
	}
	public void setR0370_8_to_14_days(BigDecimal r0370_8_to_14_days) {
		this.r0370_8_to_14_days = r0370_8_to_14_days;
	}
	public BigDecimal getR0370_15_days_to_1_month() {
		return r0370_15_days_to_1_month;
	}
	public void setR0370_15_days_to_1_month(BigDecimal r0370_15_days_to_1_month) {
		this.r0370_15_days_to_1_month = r0370_15_days_to_1_month;
	}
	public BigDecimal getR0370_1_to_2_months() {
		return r0370_1_to_2_months;
	}
	public void setR0370_1_to_2_months(BigDecimal r0370_1_to_2_months) {
		this.r0370_1_to_2_months = r0370_1_to_2_months;
	}
	public BigDecimal getR0370_2_to_3_months() {
		return r0370_2_to_3_months;
	}
	public void setR0370_2_to_3_months(BigDecimal r0370_2_to_3_months) {
		this.r0370_2_to_3_months = r0370_2_to_3_months;
	}
	public BigDecimal getR0370_3_to_6_months() {
		return r0370_3_to_6_months;
	}
	public void setR0370_3_to_6_months(BigDecimal r0370_3_to_6_months) {
		this.r0370_3_to_6_months = r0370_3_to_6_months;
	}
	public BigDecimal getR0370_6_to_12_months() {
		return r0370_6_to_12_months;
	}
	public void setR0370_6_to_12_months(BigDecimal r0370_6_to_12_months) {
		this.r0370_6_to_12_months = r0370_6_to_12_months;
	}
	public BigDecimal getR0370_1_to_3_years() {
		return r0370_1_to_3_years;
	}
	public void setR0370_1_to_3_years(BigDecimal r0370_1_to_3_years) {
		this.r0370_1_to_3_years = r0370_1_to_3_years;
	}
	public BigDecimal getR0370_3_to_5_years() {
		return r0370_3_to_5_years;
	}
	public void setR0370_3_to_5_years(BigDecimal r0370_3_to_5_years) {
		this.r0370_3_to_5_years = r0370_3_to_5_years;
	}
	public BigDecimal getR0370_greater_than_5_years() {
		return r0370_greater_than_5_years;
	}
	public void setR0370_greater_than_5_years(BigDecimal r0370_greater_than_5_years) {
		this.r0370_greater_than_5_years = r0370_greater_than_5_years;
	}
	public BigDecimal getR0370_total() {
		return r0370_total;
	}
	public void setR0370_total(BigDecimal r0370_total) {
		this.r0370_total = r0370_total;
	}
	public String getR0380_product() {
		return r0380_product;
	}
	public void setR0380_product(String r0380_product) {
		this.r0380_product = r0380_product;
	}
	public String getR0390_product() {
		return r0390_product;
	}
	public void setR0390_product(String r0390_product) {
		this.r0390_product = r0390_product;
	}
	public BigDecimal getR0390_overdue() {
		return r0390_overdue;
	}
	public void setR0390_overdue(BigDecimal r0390_overdue) {
		this.r0390_overdue = r0390_overdue;
	}
	public BigDecimal getR0390_overdraft() {
		return r0390_overdraft;
	}
	public void setR0390_overdraft(BigDecimal r0390_overdraft) {
		this.r0390_overdraft = r0390_overdraft;
	}
	public BigDecimal getR0390_0_to_7_days() {
		return r0390_0_to_7_days;
	}
	public void setR0390_0_to_7_days(BigDecimal r0390_0_to_7_days) {
		this.r0390_0_to_7_days = r0390_0_to_7_days;
	}
	public BigDecimal getR0390_8_to_14_days() {
		return r0390_8_to_14_days;
	}
	public void setR0390_8_to_14_days(BigDecimal r0390_8_to_14_days) {
		this.r0390_8_to_14_days = r0390_8_to_14_days;
	}
	public BigDecimal getR0390_15_days_to_1_month() {
		return r0390_15_days_to_1_month;
	}
	public void setR0390_15_days_to_1_month(BigDecimal r0390_15_days_to_1_month) {
		this.r0390_15_days_to_1_month = r0390_15_days_to_1_month;
	}
	public BigDecimal getR0390_1_to_2_months() {
		return r0390_1_to_2_months;
	}
	public void setR0390_1_to_2_months(BigDecimal r0390_1_to_2_months) {
		this.r0390_1_to_2_months = r0390_1_to_2_months;
	}
	public BigDecimal getR0390_2_to_3_months() {
		return r0390_2_to_3_months;
	}
	public void setR0390_2_to_3_months(BigDecimal r0390_2_to_3_months) {
		this.r0390_2_to_3_months = r0390_2_to_3_months;
	}
	public BigDecimal getR0390_3_to_6_months() {
		return r0390_3_to_6_months;
	}
	public void setR0390_3_to_6_months(BigDecimal r0390_3_to_6_months) {
		this.r0390_3_to_6_months = r0390_3_to_6_months;
	}
	public BigDecimal getR0390_6_to_12_months() {
		return r0390_6_to_12_months;
	}
	public void setR0390_6_to_12_months(BigDecimal r0390_6_to_12_months) {
		this.r0390_6_to_12_months = r0390_6_to_12_months;
	}
	public BigDecimal getR0390_1_to_3_years() {
		return r0390_1_to_3_years;
	}
	public void setR0390_1_to_3_years(BigDecimal r0390_1_to_3_years) {
		this.r0390_1_to_3_years = r0390_1_to_3_years;
	}
	public BigDecimal getR0390_3_to_5_years() {
		return r0390_3_to_5_years;
	}
	public void setR0390_3_to_5_years(BigDecimal r0390_3_to_5_years) {
		this.r0390_3_to_5_years = r0390_3_to_5_years;
	}
	public BigDecimal getR0390_greater_than_5_years() {
		return r0390_greater_than_5_years;
	}
	public void setR0390_greater_than_5_years(BigDecimal r0390_greater_than_5_years) {
		this.r0390_greater_than_5_years = r0390_greater_than_5_years;
	}
	public BigDecimal getR0390_total() {
		return r0390_total;
	}
	public void setR0390_total(BigDecimal r0390_total) {
		this.r0390_total = r0390_total;
	}
	public String getR0400_product() {
		return r0400_product;
	}
	public void setR0400_product(String r0400_product) {
		this.r0400_product = r0400_product;
	}
	public BigDecimal getR0400_overdue() {
		return r0400_overdue;
	}
	public void setR0400_overdue(BigDecimal r0400_overdue) {
		this.r0400_overdue = r0400_overdue;
	}
	public BigDecimal getR0400_overdraft() {
		return r0400_overdraft;
	}
	public void setR0400_overdraft(BigDecimal r0400_overdraft) {
		this.r0400_overdraft = r0400_overdraft;
	}
	public BigDecimal getR0400_0_to_7_days() {
		return r0400_0_to_7_days;
	}
	public void setR0400_0_to_7_days(BigDecimal r0400_0_to_7_days) {
		this.r0400_0_to_7_days = r0400_0_to_7_days;
	}
	public BigDecimal getR0400_8_to_14_days() {
		return r0400_8_to_14_days;
	}
	public void setR0400_8_to_14_days(BigDecimal r0400_8_to_14_days) {
		this.r0400_8_to_14_days = r0400_8_to_14_days;
	}
	public BigDecimal getR0400_15_days_to_1_month() {
		return r0400_15_days_to_1_month;
	}
	public void setR0400_15_days_to_1_month(BigDecimal r0400_15_days_to_1_month) {
		this.r0400_15_days_to_1_month = r0400_15_days_to_1_month;
	}
	public BigDecimal getR0400_1_to_2_months() {
		return r0400_1_to_2_months;
	}
	public void setR0400_1_to_2_months(BigDecimal r0400_1_to_2_months) {
		this.r0400_1_to_2_months = r0400_1_to_2_months;
	}
	public BigDecimal getR0400_2_to_3_months() {
		return r0400_2_to_3_months;
	}
	public void setR0400_2_to_3_months(BigDecimal r0400_2_to_3_months) {
		this.r0400_2_to_3_months = r0400_2_to_3_months;
	}
	public BigDecimal getR0400_3_to_6_months() {
		return r0400_3_to_6_months;
	}
	public void setR0400_3_to_6_months(BigDecimal r0400_3_to_6_months) {
		this.r0400_3_to_6_months = r0400_3_to_6_months;
	}
	public BigDecimal getR0400_6_to_12_months() {
		return r0400_6_to_12_months;
	}
	public void setR0400_6_to_12_months(BigDecimal r0400_6_to_12_months) {
		this.r0400_6_to_12_months = r0400_6_to_12_months;
	}
	public BigDecimal getR0400_1_to_3_years() {
		return r0400_1_to_3_years;
	}
	public void setR0400_1_to_3_years(BigDecimal r0400_1_to_3_years) {
		this.r0400_1_to_3_years = r0400_1_to_3_years;
	}
	public BigDecimal getR0400_3_to_5_years() {
		return r0400_3_to_5_years;
	}
	public void setR0400_3_to_5_years(BigDecimal r0400_3_to_5_years) {
		this.r0400_3_to_5_years = r0400_3_to_5_years;
	}
	public BigDecimal getR0400_greater_than_5_years() {
		return r0400_greater_than_5_years;
	}
	public void setR0400_greater_than_5_years(BigDecimal r0400_greater_than_5_years) {
		this.r0400_greater_than_5_years = r0400_greater_than_5_years;
	}
	public BigDecimal getR0400_total() {
		return r0400_total;
	}
	public void setR0400_total(BigDecimal r0400_total) {
		this.r0400_total = r0400_total;
	}
	public String getR0410_product() {
		return r0410_product;
	}
	public void setR0410_product(String r0410_product) {
		this.r0410_product = r0410_product;
	}
	public BigDecimal getR0410_overdue() {
		return r0410_overdue;
	}
	public void setR0410_overdue(BigDecimal r0410_overdue) {
		this.r0410_overdue = r0410_overdue;
	}
	public BigDecimal getR0410_overdraft() {
		return r0410_overdraft;
	}
	public void setR0410_overdraft(BigDecimal r0410_overdraft) {
		this.r0410_overdraft = r0410_overdraft;
	}
	public BigDecimal getR0410_0_to_7_days() {
		return r0410_0_to_7_days;
	}
	public void setR0410_0_to_7_days(BigDecimal r0410_0_to_7_days) {
		this.r0410_0_to_7_days = r0410_0_to_7_days;
	}
	public BigDecimal getR0410_8_to_14_days() {
		return r0410_8_to_14_days;
	}
	public void setR0410_8_to_14_days(BigDecimal r0410_8_to_14_days) {
		this.r0410_8_to_14_days = r0410_8_to_14_days;
	}
	public BigDecimal getR0410_15_days_to_1_month() {
		return r0410_15_days_to_1_month;
	}
	public void setR0410_15_days_to_1_month(BigDecimal r0410_15_days_to_1_month) {
		this.r0410_15_days_to_1_month = r0410_15_days_to_1_month;
	}
	public BigDecimal getR0410_1_to_2_months() {
		return r0410_1_to_2_months;
	}
	public void setR0410_1_to_2_months(BigDecimal r0410_1_to_2_months) {
		this.r0410_1_to_2_months = r0410_1_to_2_months;
	}
	public BigDecimal getR0410_2_to_3_months() {
		return r0410_2_to_3_months;
	}
	public void setR0410_2_to_3_months(BigDecimal r0410_2_to_3_months) {
		this.r0410_2_to_3_months = r0410_2_to_3_months;
	}
	public BigDecimal getR0410_3_to_6_months() {
		return r0410_3_to_6_months;
	}
	public void setR0410_3_to_6_months(BigDecimal r0410_3_to_6_months) {
		this.r0410_3_to_6_months = r0410_3_to_6_months;
	}
	public BigDecimal getR0410_6_to_12_months() {
		return r0410_6_to_12_months;
	}
	public void setR0410_6_to_12_months(BigDecimal r0410_6_to_12_months) {
		this.r0410_6_to_12_months = r0410_6_to_12_months;
	}
	public BigDecimal getR0410_1_to_3_years() {
		return r0410_1_to_3_years;
	}
	public void setR0410_1_to_3_years(BigDecimal r0410_1_to_3_years) {
		this.r0410_1_to_3_years = r0410_1_to_3_years;
	}
	public BigDecimal getR0410_3_to_5_years() {
		return r0410_3_to_5_years;
	}
	public void setR0410_3_to_5_years(BigDecimal r0410_3_to_5_years) {
		this.r0410_3_to_5_years = r0410_3_to_5_years;
	}
	public BigDecimal getR0410_greater_than_5_years() {
		return r0410_greater_than_5_years;
	}
	public void setR0410_greater_than_5_years(BigDecimal r0410_greater_than_5_years) {
		this.r0410_greater_than_5_years = r0410_greater_than_5_years;
	}
	public BigDecimal getR0410_total() {
		return r0410_total;
	}
	public void setR0410_total(BigDecimal r0410_total) {
		this.r0410_total = r0410_total;
	}
	public String getR0420_product() {
		return r0420_product;
	}
	public void setR0420_product(String r0420_product) {
		this.r0420_product = r0420_product;
	}
	public BigDecimal getR0420_overdue() {
		return r0420_overdue;
	}
	public void setR0420_overdue(BigDecimal r0420_overdue) {
		this.r0420_overdue = r0420_overdue;
	}
	public BigDecimal getR0420_overdraft() {
		return r0420_overdraft;
	}
	public void setR0420_overdraft(BigDecimal r0420_overdraft) {
		this.r0420_overdraft = r0420_overdraft;
	}
	public BigDecimal getR0420_0_to_7_days() {
		return r0420_0_to_7_days;
	}
	public void setR0420_0_to_7_days(BigDecimal r0420_0_to_7_days) {
		this.r0420_0_to_7_days = r0420_0_to_7_days;
	}
	public BigDecimal getR0420_8_to_14_days() {
		return r0420_8_to_14_days;
	}
	public void setR0420_8_to_14_days(BigDecimal r0420_8_to_14_days) {
		this.r0420_8_to_14_days = r0420_8_to_14_days;
	}
	public BigDecimal getR0420_15_days_to_1_month() {
		return r0420_15_days_to_1_month;
	}
	public void setR0420_15_days_to_1_month(BigDecimal r0420_15_days_to_1_month) {
		this.r0420_15_days_to_1_month = r0420_15_days_to_1_month;
	}
	public BigDecimal getR0420_1_to_2_months() {
		return r0420_1_to_2_months;
	}
	public void setR0420_1_to_2_months(BigDecimal r0420_1_to_2_months) {
		this.r0420_1_to_2_months = r0420_1_to_2_months;
	}
	public BigDecimal getR0420_2_to_3_months() {
		return r0420_2_to_3_months;
	}
	public void setR0420_2_to_3_months(BigDecimal r0420_2_to_3_months) {
		this.r0420_2_to_3_months = r0420_2_to_3_months;
	}
	public BigDecimal getR0420_3_to_6_months() {
		return r0420_3_to_6_months;
	}
	public void setR0420_3_to_6_months(BigDecimal r0420_3_to_6_months) {
		this.r0420_3_to_6_months = r0420_3_to_6_months;
	}
	public BigDecimal getR0420_6_to_12_months() {
		return r0420_6_to_12_months;
	}
	public void setR0420_6_to_12_months(BigDecimal r0420_6_to_12_months) {
		this.r0420_6_to_12_months = r0420_6_to_12_months;
	}
	public BigDecimal getR0420_1_to_3_years() {
		return r0420_1_to_3_years;
	}
	public void setR0420_1_to_3_years(BigDecimal r0420_1_to_3_years) {
		this.r0420_1_to_3_years = r0420_1_to_3_years;
	}
	public BigDecimal getR0420_3_to_5_years() {
		return r0420_3_to_5_years;
	}
	public void setR0420_3_to_5_years(BigDecimal r0420_3_to_5_years) {
		this.r0420_3_to_5_years = r0420_3_to_5_years;
	}
	public BigDecimal getR0420_greater_than_5_years() {
		return r0420_greater_than_5_years;
	}
	public void setR0420_greater_than_5_years(BigDecimal r0420_greater_than_5_years) {
		this.r0420_greater_than_5_years = r0420_greater_than_5_years;
	}
	public BigDecimal getR0420_total() {
		return r0420_total;
	}
	public void setR0420_total(BigDecimal r0420_total) {
		this.r0420_total = r0420_total;
	}
	public String getR0430_product() {
		return r0430_product;
	}
	public void setR0430_product(String r0430_product) {
		this.r0430_product = r0430_product;
	}
	public BigDecimal getR0430_overdue() {
		return r0430_overdue;
	}
	public void setR0430_overdue(BigDecimal r0430_overdue) {
		this.r0430_overdue = r0430_overdue;
	}
	public BigDecimal getR0430_overdraft() {
		return r0430_overdraft;
	}
	public void setR0430_overdraft(BigDecimal r0430_overdraft) {
		this.r0430_overdraft = r0430_overdraft;
	}
	public BigDecimal getR0430_0_to_7_days() {
		return r0430_0_to_7_days;
	}
	public void setR0430_0_to_7_days(BigDecimal r0430_0_to_7_days) {
		this.r0430_0_to_7_days = r0430_0_to_7_days;
	}
	public BigDecimal getR0430_8_to_14_days() {
		return r0430_8_to_14_days;
	}
	public void setR0430_8_to_14_days(BigDecimal r0430_8_to_14_days) {
		this.r0430_8_to_14_days = r0430_8_to_14_days;
	}
	public BigDecimal getR0430_15_days_to_1_month() {
		return r0430_15_days_to_1_month;
	}
	public void setR0430_15_days_to_1_month(BigDecimal r0430_15_days_to_1_month) {
		this.r0430_15_days_to_1_month = r0430_15_days_to_1_month;
	}
	public BigDecimal getR0430_1_to_2_months() {
		return r0430_1_to_2_months;
	}
	public void setR0430_1_to_2_months(BigDecimal r0430_1_to_2_months) {
		this.r0430_1_to_2_months = r0430_1_to_2_months;
	}
	public BigDecimal getR0430_2_to_3_months() {
		return r0430_2_to_3_months;
	}
	public void setR0430_2_to_3_months(BigDecimal r0430_2_to_3_months) {
		this.r0430_2_to_3_months = r0430_2_to_3_months;
	}
	public BigDecimal getR0430_3_to_6_months() {
		return r0430_3_to_6_months;
	}
	public void setR0430_3_to_6_months(BigDecimal r0430_3_to_6_months) {
		this.r0430_3_to_6_months = r0430_3_to_6_months;
	}
	public BigDecimal getR0430_6_to_12_months() {
		return r0430_6_to_12_months;
	}
	public void setR0430_6_to_12_months(BigDecimal r0430_6_to_12_months) {
		this.r0430_6_to_12_months = r0430_6_to_12_months;
	}
	public BigDecimal getR0430_1_to_3_years() {
		return r0430_1_to_3_years;
	}
	public void setR0430_1_to_3_years(BigDecimal r0430_1_to_3_years) {
		this.r0430_1_to_3_years = r0430_1_to_3_years;
	}
	public BigDecimal getR0430_3_to_5_years() {
		return r0430_3_to_5_years;
	}
	public void setR0430_3_to_5_years(BigDecimal r0430_3_to_5_years) {
		this.r0430_3_to_5_years = r0430_3_to_5_years;
	}
	public BigDecimal getR0430_greater_than_5_years() {
		return r0430_greater_than_5_years;
	}
	public void setR0430_greater_than_5_years(BigDecimal r0430_greater_than_5_years) {
		this.r0430_greater_than_5_years = r0430_greater_than_5_years;
	}
	public BigDecimal getR0430_total() {
		return r0430_total;
	}
	public void setR0430_total(BigDecimal r0430_total) {
		this.r0430_total = r0430_total;
	}
	public String getR0440_product() {
		return r0440_product;
	}
	public void setR0440_product(String r0440_product) {
		this.r0440_product = r0440_product;
	}
	public BigDecimal getR0440_overdue() {
		return r0440_overdue;
	}
	public void setR0440_overdue(BigDecimal r0440_overdue) {
		this.r0440_overdue = r0440_overdue;
	}
	public BigDecimal getR0440_overdraft() {
		return r0440_overdraft;
	}
	public void setR0440_overdraft(BigDecimal r0440_overdraft) {
		this.r0440_overdraft = r0440_overdraft;
	}
	public BigDecimal getR0440_0_to_7_days() {
		return r0440_0_to_7_days;
	}
	public void setR0440_0_to_7_days(BigDecimal r0440_0_to_7_days) {
		this.r0440_0_to_7_days = r0440_0_to_7_days;
	}
	public BigDecimal getR0440_8_to_14_days() {
		return r0440_8_to_14_days;
	}
	public void setR0440_8_to_14_days(BigDecimal r0440_8_to_14_days) {
		this.r0440_8_to_14_days = r0440_8_to_14_days;
	}
	public BigDecimal getR0440_15_days_to_1_month() {
		return r0440_15_days_to_1_month;
	}
	public void setR0440_15_days_to_1_month(BigDecimal r0440_15_days_to_1_month) {
		this.r0440_15_days_to_1_month = r0440_15_days_to_1_month;
	}
	public BigDecimal getR0440_1_to_2_months() {
		return r0440_1_to_2_months;
	}
	public void setR0440_1_to_2_months(BigDecimal r0440_1_to_2_months) {
		this.r0440_1_to_2_months = r0440_1_to_2_months;
	}
	public BigDecimal getR0440_2_to_3_months() {
		return r0440_2_to_3_months;
	}
	public void setR0440_2_to_3_months(BigDecimal r0440_2_to_3_months) {
		this.r0440_2_to_3_months = r0440_2_to_3_months;
	}
	public BigDecimal getR0440_3_to_6_months() {
		return r0440_3_to_6_months;
	}
	public void setR0440_3_to_6_months(BigDecimal r0440_3_to_6_months) {
		this.r0440_3_to_6_months = r0440_3_to_6_months;
	}
	public BigDecimal getR0440_6_to_12_months() {
		return r0440_6_to_12_months;
	}
	public void setR0440_6_to_12_months(BigDecimal r0440_6_to_12_months) {
		this.r0440_6_to_12_months = r0440_6_to_12_months;
	}
	public BigDecimal getR0440_1_to_3_years() {
		return r0440_1_to_3_years;
	}
	public void setR0440_1_to_3_years(BigDecimal r0440_1_to_3_years) {
		this.r0440_1_to_3_years = r0440_1_to_3_years;
	}
	public BigDecimal getR0440_3_to_5_years() {
		return r0440_3_to_5_years;
	}
	public void setR0440_3_to_5_years(BigDecimal r0440_3_to_5_years) {
		this.r0440_3_to_5_years = r0440_3_to_5_years;
	}
	public BigDecimal getR0440_greater_than_5_years() {
		return r0440_greater_than_5_years;
	}
	public void setR0440_greater_than_5_years(BigDecimal r0440_greater_than_5_years) {
		this.r0440_greater_than_5_years = r0440_greater_than_5_years;
	}
	public BigDecimal getR0440_total() {
		return r0440_total;
	}
	public void setR0440_total(BigDecimal r0440_total) {
		this.r0440_total = r0440_total;
	}
	public String getR0450_product() {
		return r0450_product;
	}
	public void setR0450_product(String r0450_product) {
		this.r0450_product = r0450_product;
	}
	public BigDecimal getR0450_overdue() {
		return r0450_overdue;
	}
	public void setR0450_overdue(BigDecimal r0450_overdue) {
		this.r0450_overdue = r0450_overdue;
	}
	public BigDecimal getR0450_overdraft() {
		return r0450_overdraft;
	}
	public void setR0450_overdraft(BigDecimal r0450_overdraft) {
		this.r0450_overdraft = r0450_overdraft;
	}
	public BigDecimal getR0450_0_to_7_days() {
		return r0450_0_to_7_days;
	}
	public void setR0450_0_to_7_days(BigDecimal r0450_0_to_7_days) {
		this.r0450_0_to_7_days = r0450_0_to_7_days;
	}
	public BigDecimal getR0450_8_to_14_days() {
		return r0450_8_to_14_days;
	}
	public void setR0450_8_to_14_days(BigDecimal r0450_8_to_14_days) {
		this.r0450_8_to_14_days = r0450_8_to_14_days;
	}
	public BigDecimal getR0450_15_days_to_1_month() {
		return r0450_15_days_to_1_month;
	}
	public void setR0450_15_days_to_1_month(BigDecimal r0450_15_days_to_1_month) {
		this.r0450_15_days_to_1_month = r0450_15_days_to_1_month;
	}
	public BigDecimal getR0450_1_to_2_months() {
		return r0450_1_to_2_months;
	}
	public void setR0450_1_to_2_months(BigDecimal r0450_1_to_2_months) {
		this.r0450_1_to_2_months = r0450_1_to_2_months;
	}
	public BigDecimal getR0450_2_to_3_months() {
		return r0450_2_to_3_months;
	}
	public void setR0450_2_to_3_months(BigDecimal r0450_2_to_3_months) {
		this.r0450_2_to_3_months = r0450_2_to_3_months;
	}
	public BigDecimal getR0450_3_to_6_months() {
		return r0450_3_to_6_months;
	}
	public void setR0450_3_to_6_months(BigDecimal r0450_3_to_6_months) {
		this.r0450_3_to_6_months = r0450_3_to_6_months;
	}
	public BigDecimal getR0450_6_to_12_months() {
		return r0450_6_to_12_months;
	}
	public void setR0450_6_to_12_months(BigDecimal r0450_6_to_12_months) {
		this.r0450_6_to_12_months = r0450_6_to_12_months;
	}
	public BigDecimal getR0450_1_to_3_years() {
		return r0450_1_to_3_years;
	}
	public void setR0450_1_to_3_years(BigDecimal r0450_1_to_3_years) {
		this.r0450_1_to_3_years = r0450_1_to_3_years;
	}
	public BigDecimal getR0450_3_to_5_years() {
		return r0450_3_to_5_years;
	}
	public void setR0450_3_to_5_years(BigDecimal r0450_3_to_5_years) {
		this.r0450_3_to_5_years = r0450_3_to_5_years;
	}
	public BigDecimal getR0450_greater_than_5_years() {
		return r0450_greater_than_5_years;
	}
	public void setR0450_greater_than_5_years(BigDecimal r0450_greater_than_5_years) {
		this.r0450_greater_than_5_years = r0450_greater_than_5_years;
	}
	public BigDecimal getR0450_total() {
		return r0450_total;
	}
	public void setR0450_total(BigDecimal r0450_total) {
		this.r0450_total = r0450_total;
	}
	public String getR0460_product() {
		return r0460_product;
	}
	public void setR0460_product(String r0460_product) {
		this.r0460_product = r0460_product;
	}
	public BigDecimal getR0460_overdue() {
		return r0460_overdue;
	}
	public void setR0460_overdue(BigDecimal r0460_overdue) {
		this.r0460_overdue = r0460_overdue;
	}
	public BigDecimal getR0460_overdraft() {
		return r0460_overdraft;
	}
	public void setR0460_overdraft(BigDecimal r0460_overdraft) {
		this.r0460_overdraft = r0460_overdraft;
	}
	public BigDecimal getR0460_0_to_7_days() {
		return r0460_0_to_7_days;
	}
	public void setR0460_0_to_7_days(BigDecimal r0460_0_to_7_days) {
		this.r0460_0_to_7_days = r0460_0_to_7_days;
	}
	public BigDecimal getR0460_8_to_14_days() {
		return r0460_8_to_14_days;
	}
	public void setR0460_8_to_14_days(BigDecimal r0460_8_to_14_days) {
		this.r0460_8_to_14_days = r0460_8_to_14_days;
	}
	public BigDecimal getR0460_15_days_to_1_month() {
		return r0460_15_days_to_1_month;
	}
	public void setR0460_15_days_to_1_month(BigDecimal r0460_15_days_to_1_month) {
		this.r0460_15_days_to_1_month = r0460_15_days_to_1_month;
	}
	public BigDecimal getR0460_1_to_2_months() {
		return r0460_1_to_2_months;
	}
	public void setR0460_1_to_2_months(BigDecimal r0460_1_to_2_months) {
		this.r0460_1_to_2_months = r0460_1_to_2_months;
	}
	public BigDecimal getR0460_2_to_3_months() {
		return r0460_2_to_3_months;
	}
	public void setR0460_2_to_3_months(BigDecimal r0460_2_to_3_months) {
		this.r0460_2_to_3_months = r0460_2_to_3_months;
	}
	public BigDecimal getR0460_3_to_6_months() {
		return r0460_3_to_6_months;
	}
	public void setR0460_3_to_6_months(BigDecimal r0460_3_to_6_months) {
		this.r0460_3_to_6_months = r0460_3_to_6_months;
	}
	public BigDecimal getR0460_6_to_12_months() {
		return r0460_6_to_12_months;
	}
	public void setR0460_6_to_12_months(BigDecimal r0460_6_to_12_months) {
		this.r0460_6_to_12_months = r0460_6_to_12_months;
	}
	public BigDecimal getR0460_1_to_3_years() {
		return r0460_1_to_3_years;
	}
	public void setR0460_1_to_3_years(BigDecimal r0460_1_to_3_years) {
		this.r0460_1_to_3_years = r0460_1_to_3_years;
	}
	public BigDecimal getR0460_3_to_5_years() {
		return r0460_3_to_5_years;
	}
	public void setR0460_3_to_5_years(BigDecimal r0460_3_to_5_years) {
		this.r0460_3_to_5_years = r0460_3_to_5_years;
	}
	public BigDecimal getR0460_greater_than_5_years() {
		return r0460_greater_than_5_years;
	}
	public void setR0460_greater_than_5_years(BigDecimal r0460_greater_than_5_years) {
		this.r0460_greater_than_5_years = r0460_greater_than_5_years;
	}
	public BigDecimal getR0460_total() {
		return r0460_total;
	}
	public void setR0460_total(BigDecimal r0460_total) {
		this.r0460_total = r0460_total;
	}
	public String getR0470_product() {
		return r0470_product;
	}
	public void setR0470_product(String r0470_product) {
		this.r0470_product = r0470_product;
	}
	public BigDecimal getR0470_overdue() {
		return r0470_overdue;
	}
	public void setR0470_overdue(BigDecimal r0470_overdue) {
		this.r0470_overdue = r0470_overdue;
	}
	public BigDecimal getR0470_overdraft() {
		return r0470_overdraft;
	}
	public void setR0470_overdraft(BigDecimal r0470_overdraft) {
		this.r0470_overdraft = r0470_overdraft;
	}
	public BigDecimal getR0470_0_to_7_days() {
		return r0470_0_to_7_days;
	}
	public void setR0470_0_to_7_days(BigDecimal r0470_0_to_7_days) {
		this.r0470_0_to_7_days = r0470_0_to_7_days;
	}
	public BigDecimal getR0470_8_to_14_days() {
		return r0470_8_to_14_days;
	}
	public void setR0470_8_to_14_days(BigDecimal r0470_8_to_14_days) {
		this.r0470_8_to_14_days = r0470_8_to_14_days;
	}
	public BigDecimal getR0470_15_days_to_1_month() {
		return r0470_15_days_to_1_month;
	}
	public void setR0470_15_days_to_1_month(BigDecimal r0470_15_days_to_1_month) {
		this.r0470_15_days_to_1_month = r0470_15_days_to_1_month;
	}
	public BigDecimal getR0470_1_to_2_months() {
		return r0470_1_to_2_months;
	}
	public void setR0470_1_to_2_months(BigDecimal r0470_1_to_2_months) {
		this.r0470_1_to_2_months = r0470_1_to_2_months;
	}
	public BigDecimal getR0470_2_to_3_months() {
		return r0470_2_to_3_months;
	}
	public void setR0470_2_to_3_months(BigDecimal r0470_2_to_3_months) {
		this.r0470_2_to_3_months = r0470_2_to_3_months;
	}
	public BigDecimal getR0470_3_to_6_months() {
		return r0470_3_to_6_months;
	}
	public void setR0470_3_to_6_months(BigDecimal r0470_3_to_6_months) {
		this.r0470_3_to_6_months = r0470_3_to_6_months;
	}
	public BigDecimal getR0470_6_to_12_months() {
		return r0470_6_to_12_months;
	}
	public void setR0470_6_to_12_months(BigDecimal r0470_6_to_12_months) {
		this.r0470_6_to_12_months = r0470_6_to_12_months;
	}
	public BigDecimal getR0470_1_to_3_years() {
		return r0470_1_to_3_years;
	}
	public void setR0470_1_to_3_years(BigDecimal r0470_1_to_3_years) {
		this.r0470_1_to_3_years = r0470_1_to_3_years;
	}
	public BigDecimal getR0470_3_to_5_years() {
		return r0470_3_to_5_years;
	}
	public void setR0470_3_to_5_years(BigDecimal r0470_3_to_5_years) {
		this.r0470_3_to_5_years = r0470_3_to_5_years;
	}
	public BigDecimal getR0470_greater_than_5_years() {
		return r0470_greater_than_5_years;
	}
	public void setR0470_greater_than_5_years(BigDecimal r0470_greater_than_5_years) {
		this.r0470_greater_than_5_years = r0470_greater_than_5_years;
	}
	public BigDecimal getR0470_total() {
		return r0470_total;
	}
	public void setR0470_total(BigDecimal r0470_total) {
		this.r0470_total = r0470_total;
	}
	public String getR0480_product() {
		return r0480_product;
	}
	public void setR0480_product(String r0480_product) {
		this.r0480_product = r0480_product;
	}
	public BigDecimal getR0480_overdue() {
		return r0480_overdue;
	}
	public void setR0480_overdue(BigDecimal r0480_overdue) {
		this.r0480_overdue = r0480_overdue;
	}
	public BigDecimal getR0480_overdraft() {
		return r0480_overdraft;
	}
	public void setR0480_overdraft(BigDecimal r0480_overdraft) {
		this.r0480_overdraft = r0480_overdraft;
	}
	public BigDecimal getR0480_0_to_7_days() {
		return r0480_0_to_7_days;
	}
	public void setR0480_0_to_7_days(BigDecimal r0480_0_to_7_days) {
		this.r0480_0_to_7_days = r0480_0_to_7_days;
	}
	public BigDecimal getR0480_8_to_14_days() {
		return r0480_8_to_14_days;
	}
	public void setR0480_8_to_14_days(BigDecimal r0480_8_to_14_days) {
		this.r0480_8_to_14_days = r0480_8_to_14_days;
	}
	public BigDecimal getR0480_15_days_to_1_month() {
		return r0480_15_days_to_1_month;
	}
	public void setR0480_15_days_to_1_month(BigDecimal r0480_15_days_to_1_month) {
		this.r0480_15_days_to_1_month = r0480_15_days_to_1_month;
	}
	public BigDecimal getR0480_1_to_2_months() {
		return r0480_1_to_2_months;
	}
	public void setR0480_1_to_2_months(BigDecimal r0480_1_to_2_months) {
		this.r0480_1_to_2_months = r0480_1_to_2_months;
	}
	public BigDecimal getR0480_2_to_3_months() {
		return r0480_2_to_3_months;
	}
	public void setR0480_2_to_3_months(BigDecimal r0480_2_to_3_months) {
		this.r0480_2_to_3_months = r0480_2_to_3_months;
	}
	public BigDecimal getR0480_3_to_6_months() {
		return r0480_3_to_6_months;
	}
	public void setR0480_3_to_6_months(BigDecimal r0480_3_to_6_months) {
		this.r0480_3_to_6_months = r0480_3_to_6_months;
	}
	public BigDecimal getR0480_6_to_12_months() {
		return r0480_6_to_12_months;
	}
	public void setR0480_6_to_12_months(BigDecimal r0480_6_to_12_months) {
		this.r0480_6_to_12_months = r0480_6_to_12_months;
	}
	public BigDecimal getR0480_1_to_3_years() {
		return r0480_1_to_3_years;
	}
	public void setR0480_1_to_3_years(BigDecimal r0480_1_to_3_years) {
		this.r0480_1_to_3_years = r0480_1_to_3_years;
	}
	public BigDecimal getR0480_3_to_5_years() {
		return r0480_3_to_5_years;
	}
	public void setR0480_3_to_5_years(BigDecimal r0480_3_to_5_years) {
		this.r0480_3_to_5_years = r0480_3_to_5_years;
	}
	public BigDecimal getR0480_greater_than_5_years() {
		return r0480_greater_than_5_years;
	}
	public void setR0480_greater_than_5_years(BigDecimal r0480_greater_than_5_years) {
		this.r0480_greater_than_5_years = r0480_greater_than_5_years;
	}
	public BigDecimal getR0480_total() {
		return r0480_total;
	}
	public void setR0480_total(BigDecimal r0480_total) {
		this.r0480_total = r0480_total;
	}
	public String getR0490_product() {
		return r0490_product;
	}
	public void setR0490_product(String r0490_product) {
		this.r0490_product = r0490_product;
	}
	public BigDecimal getR0490_overdue() {
		return r0490_overdue;
	}
	public void setR0490_overdue(BigDecimal r0490_overdue) {
		this.r0490_overdue = r0490_overdue;
	}
	public BigDecimal getR0490_overdraft() {
		return r0490_overdraft;
	}
	public void setR0490_overdraft(BigDecimal r0490_overdraft) {
		this.r0490_overdraft = r0490_overdraft;
	}
	public BigDecimal getR0490_0_to_7_days() {
		return r0490_0_to_7_days;
	}
	public void setR0490_0_to_7_days(BigDecimal r0490_0_to_7_days) {
		this.r0490_0_to_7_days = r0490_0_to_7_days;
	}
	public BigDecimal getR0490_8_to_14_days() {
		return r0490_8_to_14_days;
	}
	public void setR0490_8_to_14_days(BigDecimal r0490_8_to_14_days) {
		this.r0490_8_to_14_days = r0490_8_to_14_days;
	}
	public BigDecimal getR0490_15_days_to_1_month() {
		return r0490_15_days_to_1_month;
	}
	public void setR0490_15_days_to_1_month(BigDecimal r0490_15_days_to_1_month) {
		this.r0490_15_days_to_1_month = r0490_15_days_to_1_month;
	}
	public BigDecimal getR0490_1_to_2_months() {
		return r0490_1_to_2_months;
	}
	public void setR0490_1_to_2_months(BigDecimal r0490_1_to_2_months) {
		this.r0490_1_to_2_months = r0490_1_to_2_months;
	}
	public BigDecimal getR0490_2_to_3_months() {
		return r0490_2_to_3_months;
	}
	public void setR0490_2_to_3_months(BigDecimal r0490_2_to_3_months) {
		this.r0490_2_to_3_months = r0490_2_to_3_months;
	}
	public BigDecimal getR0490_3_to_6_months() {
		return r0490_3_to_6_months;
	}
	public void setR0490_3_to_6_months(BigDecimal r0490_3_to_6_months) {
		this.r0490_3_to_6_months = r0490_3_to_6_months;
	}
	public BigDecimal getR0490_6_to_12_months() {
		return r0490_6_to_12_months;
	}
	public void setR0490_6_to_12_months(BigDecimal r0490_6_to_12_months) {
		this.r0490_6_to_12_months = r0490_6_to_12_months;
	}
	public BigDecimal getR0490_1_to_3_years() {
		return r0490_1_to_3_years;
	}
	public void setR0490_1_to_3_years(BigDecimal r0490_1_to_3_years) {
		this.r0490_1_to_3_years = r0490_1_to_3_years;
	}
	public BigDecimal getR0490_3_to_5_years() {
		return r0490_3_to_5_years;
	}
	public void setR0490_3_to_5_years(BigDecimal r0490_3_to_5_years) {
		this.r0490_3_to_5_years = r0490_3_to_5_years;
	}
	public BigDecimal getR0490_greater_than_5_years() {
		return r0490_greater_than_5_years;
	}
	public void setR0490_greater_than_5_years(BigDecimal r0490_greater_than_5_years) {
		this.r0490_greater_than_5_years = r0490_greater_than_5_years;
	}
	public BigDecimal getR0490_total() {
		return r0490_total;
	}
	public void setR0490_total(BigDecimal r0490_total) {
		this.r0490_total = r0490_total;
	}
	public String getR0500_product() {
		return r0500_product;
	}
	public void setR0500_product(String r0500_product) {
		this.r0500_product = r0500_product;
	}
	public BigDecimal getR0500_overdue() {
		return r0500_overdue;
	}
	public void setR0500_overdue(BigDecimal r0500_overdue) {
		this.r0500_overdue = r0500_overdue;
	}
	public BigDecimal getR0500_overdraft() {
		return r0500_overdraft;
	}
	public void setR0500_overdraft(BigDecimal r0500_overdraft) {
		this.r0500_overdraft = r0500_overdraft;
	}
	public BigDecimal getR0500_0_to_7_days() {
		return r0500_0_to_7_days;
	}
	public void setR0500_0_to_7_days(BigDecimal r0500_0_to_7_days) {
		this.r0500_0_to_7_days = r0500_0_to_7_days;
	}
	public BigDecimal getR0500_8_to_14_days() {
		return r0500_8_to_14_days;
	}
	public void setR0500_8_to_14_days(BigDecimal r0500_8_to_14_days) {
		this.r0500_8_to_14_days = r0500_8_to_14_days;
	}
	public BigDecimal getR0500_15_days_to_1_month() {
		return r0500_15_days_to_1_month;
	}
	public void setR0500_15_days_to_1_month(BigDecimal r0500_15_days_to_1_month) {
		this.r0500_15_days_to_1_month = r0500_15_days_to_1_month;
	}
	public BigDecimal getR0500_1_to_2_months() {
		return r0500_1_to_2_months;
	}
	public void setR0500_1_to_2_months(BigDecimal r0500_1_to_2_months) {
		this.r0500_1_to_2_months = r0500_1_to_2_months;
	}
	public BigDecimal getR0500_2_to_3_months() {
		return r0500_2_to_3_months;
	}
	public void setR0500_2_to_3_months(BigDecimal r0500_2_to_3_months) {
		this.r0500_2_to_3_months = r0500_2_to_3_months;
	}
	public BigDecimal getR0500_3_to_6_months() {
		return r0500_3_to_6_months;
	}
	public void setR0500_3_to_6_months(BigDecimal r0500_3_to_6_months) {
		this.r0500_3_to_6_months = r0500_3_to_6_months;
	}
	public BigDecimal getR0500_6_to_12_months() {
		return r0500_6_to_12_months;
	}
	public void setR0500_6_to_12_months(BigDecimal r0500_6_to_12_months) {
		this.r0500_6_to_12_months = r0500_6_to_12_months;
	}
	public BigDecimal getR0500_1_to_3_years() {
		return r0500_1_to_3_years;
	}
	public void setR0500_1_to_3_years(BigDecimal r0500_1_to_3_years) {
		this.r0500_1_to_3_years = r0500_1_to_3_years;
	}
	public BigDecimal getR0500_3_to_5_years() {
		return r0500_3_to_5_years;
	}
	public void setR0500_3_to_5_years(BigDecimal r0500_3_to_5_years) {
		this.r0500_3_to_5_years = r0500_3_to_5_years;
	}
	public BigDecimal getR0500_greater_than_5_years() {
		return r0500_greater_than_5_years;
	}
	public void setR0500_greater_than_5_years(BigDecimal r0500_greater_than_5_years) {
		this.r0500_greater_than_5_years = r0500_greater_than_5_years;
	}
	public BigDecimal getR0500_total() {
		return r0500_total;
	}
	public void setR0500_total(BigDecimal r0500_total) {
		this.r0500_total = r0500_total;
	}
	public String getR0510_product() {
		return r0510_product;
	}
	public void setR0510_product(String r0510_product) {
		this.r0510_product = r0510_product;
	}
	public BigDecimal getR0510_overdue() {
		return r0510_overdue;
	}
	public void setR0510_overdue(BigDecimal r0510_overdue) {
		this.r0510_overdue = r0510_overdue;
	}
	public BigDecimal getR0510_overdraft() {
		return r0510_overdraft;
	}
	public void setR0510_overdraft(BigDecimal r0510_overdraft) {
		this.r0510_overdraft = r0510_overdraft;
	}
	public BigDecimal getR0510_0_to_7_days() {
		return r0510_0_to_7_days;
	}
	public void setR0510_0_to_7_days(BigDecimal r0510_0_to_7_days) {
		this.r0510_0_to_7_days = r0510_0_to_7_days;
	}
	public BigDecimal getR0510_8_to_14_days() {
		return r0510_8_to_14_days;
	}
	public void setR0510_8_to_14_days(BigDecimal r0510_8_to_14_days) {
		this.r0510_8_to_14_days = r0510_8_to_14_days;
	}
	public BigDecimal getR0510_15_days_to_1_month() {
		return r0510_15_days_to_1_month;
	}
	public void setR0510_15_days_to_1_month(BigDecimal r0510_15_days_to_1_month) {
		this.r0510_15_days_to_1_month = r0510_15_days_to_1_month;
	}
	public BigDecimal getR0510_1_to_2_months() {
		return r0510_1_to_2_months;
	}
	public void setR0510_1_to_2_months(BigDecimal r0510_1_to_2_months) {
		this.r0510_1_to_2_months = r0510_1_to_2_months;
	}
	public BigDecimal getR0510_2_to_3_months() {
		return r0510_2_to_3_months;
	}
	public void setR0510_2_to_3_months(BigDecimal r0510_2_to_3_months) {
		this.r0510_2_to_3_months = r0510_2_to_3_months;
	}
	public BigDecimal getR0510_3_to_6_months() {
		return r0510_3_to_6_months;
	}
	public void setR0510_3_to_6_months(BigDecimal r0510_3_to_6_months) {
		this.r0510_3_to_6_months = r0510_3_to_6_months;
	}
	public BigDecimal getR0510_6_to_12_months() {
		return r0510_6_to_12_months;
	}
	public void setR0510_6_to_12_months(BigDecimal r0510_6_to_12_months) {
		this.r0510_6_to_12_months = r0510_6_to_12_months;
	}
	public BigDecimal getR0510_1_to_3_years() {
		return r0510_1_to_3_years;
	}
	public void setR0510_1_to_3_years(BigDecimal r0510_1_to_3_years) {
		this.r0510_1_to_3_years = r0510_1_to_3_years;
	}
	public BigDecimal getR0510_3_to_5_years() {
		return r0510_3_to_5_years;
	}
	public void setR0510_3_to_5_years(BigDecimal r0510_3_to_5_years) {
		this.r0510_3_to_5_years = r0510_3_to_5_years;
	}
	public BigDecimal getR0510_greater_than_5_years() {
		return r0510_greater_than_5_years;
	}
	public void setR0510_greater_than_5_years(BigDecimal r0510_greater_than_5_years) {
		this.r0510_greater_than_5_years = r0510_greater_than_5_years;
	}
	public BigDecimal getR0510_total() {
		return r0510_total;
	}
	public void setR0510_total(BigDecimal r0510_total) {
		this.r0510_total = r0510_total;
	}
	public String getR0520_product() {
		return r0520_product;
	}
	public void setR0520_product(String r0520_product) {
		this.r0520_product = r0520_product;
	}
	public BigDecimal getR0520_overdue() {
		return r0520_overdue;
	}
	public void setR0520_overdue(BigDecimal r0520_overdue) {
		this.r0520_overdue = r0520_overdue;
	}
	public BigDecimal getR0520_overdraft() {
		return r0520_overdraft;
	}
	public void setR0520_overdraft(BigDecimal r0520_overdraft) {
		this.r0520_overdraft = r0520_overdraft;
	}
	public BigDecimal getR0520_0_to_7_days() {
		return r0520_0_to_7_days;
	}
	public void setR0520_0_to_7_days(BigDecimal r0520_0_to_7_days) {
		this.r0520_0_to_7_days = r0520_0_to_7_days;
	}
	public BigDecimal getR0520_8_to_14_days() {
		return r0520_8_to_14_days;
	}
	public void setR0520_8_to_14_days(BigDecimal r0520_8_to_14_days) {
		this.r0520_8_to_14_days = r0520_8_to_14_days;
	}
	public BigDecimal getR0520_15_days_to_1_month() {
		return r0520_15_days_to_1_month;
	}
	public void setR0520_15_days_to_1_month(BigDecimal r0520_15_days_to_1_month) {
		this.r0520_15_days_to_1_month = r0520_15_days_to_1_month;
	}
	public BigDecimal getR0520_1_to_2_months() {
		return r0520_1_to_2_months;
	}
	public void setR0520_1_to_2_months(BigDecimal r0520_1_to_2_months) {
		this.r0520_1_to_2_months = r0520_1_to_2_months;
	}
	public BigDecimal getR0520_2_to_3_months() {
		return r0520_2_to_3_months;
	}
	public void setR0520_2_to_3_months(BigDecimal r0520_2_to_3_months) {
		this.r0520_2_to_3_months = r0520_2_to_3_months;
	}
	public BigDecimal getR0520_3_to_6_months() {
		return r0520_3_to_6_months;
	}
	public void setR0520_3_to_6_months(BigDecimal r0520_3_to_6_months) {
		this.r0520_3_to_6_months = r0520_3_to_6_months;
	}
	public BigDecimal getR0520_6_to_12_months() {
		return r0520_6_to_12_months;
	}
	public void setR0520_6_to_12_months(BigDecimal r0520_6_to_12_months) {
		this.r0520_6_to_12_months = r0520_6_to_12_months;
	}
	public BigDecimal getR0520_1_to_3_years() {
		return r0520_1_to_3_years;
	}
	public void setR0520_1_to_3_years(BigDecimal r0520_1_to_3_years) {
		this.r0520_1_to_3_years = r0520_1_to_3_years;
	}
	public BigDecimal getR0520_3_to_5_years() {
		return r0520_3_to_5_years;
	}
	public void setR0520_3_to_5_years(BigDecimal r0520_3_to_5_years) {
		this.r0520_3_to_5_years = r0520_3_to_5_years;
	}
	public BigDecimal getR0520_greater_than_5_years() {
		return r0520_greater_than_5_years;
	}
	public void setR0520_greater_than_5_years(BigDecimal r0520_greater_than_5_years) {
		this.r0520_greater_than_5_years = r0520_greater_than_5_years;
	}
	public BigDecimal getR0520_total() {
		return r0520_total;
	}
	public void setR0520_total(BigDecimal r0520_total) {
		this.r0520_total = r0520_total;
	}
	public String getR0530_product() {
		return r0530_product;
	}
	public void setR0530_product(String r0530_product) {
		this.r0530_product = r0530_product;
	}
	public BigDecimal getR0530_overdue() {
		return r0530_overdue;
	}
	public void setR0530_overdue(BigDecimal r0530_overdue) {
		this.r0530_overdue = r0530_overdue;
	}
	public BigDecimal getR0530_overdraft() {
		return r0530_overdraft;
	}
	public void setR0530_overdraft(BigDecimal r0530_overdraft) {
		this.r0530_overdraft = r0530_overdraft;
	}
	public BigDecimal getR0530_0_to_7_days() {
		return r0530_0_to_7_days;
	}
	public void setR0530_0_to_7_days(BigDecimal r0530_0_to_7_days) {
		this.r0530_0_to_7_days = r0530_0_to_7_days;
	}
	public BigDecimal getR0530_8_to_14_days() {
		return r0530_8_to_14_days;
	}
	public void setR0530_8_to_14_days(BigDecimal r0530_8_to_14_days) {
		this.r0530_8_to_14_days = r0530_8_to_14_days;
	}
	public BigDecimal getR0530_15_days_to_1_month() {
		return r0530_15_days_to_1_month;
	}
	public void setR0530_15_days_to_1_month(BigDecimal r0530_15_days_to_1_month) {
		this.r0530_15_days_to_1_month = r0530_15_days_to_1_month;
	}
	public BigDecimal getR0530_1_to_2_months() {
		return r0530_1_to_2_months;
	}
	public void setR0530_1_to_2_months(BigDecimal r0530_1_to_2_months) {
		this.r0530_1_to_2_months = r0530_1_to_2_months;
	}
	public BigDecimal getR0530_2_to_3_months() {
		return r0530_2_to_3_months;
	}
	public void setR0530_2_to_3_months(BigDecimal r0530_2_to_3_months) {
		this.r0530_2_to_3_months = r0530_2_to_3_months;
	}
	public BigDecimal getR0530_3_to_6_months() {
		return r0530_3_to_6_months;
	}
	public void setR0530_3_to_6_months(BigDecimal r0530_3_to_6_months) {
		this.r0530_3_to_6_months = r0530_3_to_6_months;
	}
	public BigDecimal getR0530_6_to_12_months() {
		return r0530_6_to_12_months;
	}
	public void setR0530_6_to_12_months(BigDecimal r0530_6_to_12_months) {
		this.r0530_6_to_12_months = r0530_6_to_12_months;
	}
	public BigDecimal getR0530_1_to_3_years() {
		return r0530_1_to_3_years;
	}
	public void setR0530_1_to_3_years(BigDecimal r0530_1_to_3_years) {
		this.r0530_1_to_3_years = r0530_1_to_3_years;
	}
	public BigDecimal getR0530_3_to_5_years() {
		return r0530_3_to_5_years;
	}
	public void setR0530_3_to_5_years(BigDecimal r0530_3_to_5_years) {
		this.r0530_3_to_5_years = r0530_3_to_5_years;
	}
	public BigDecimal getR0530_greater_than_5_years() {
		return r0530_greater_than_5_years;
	}
	public void setR0530_greater_than_5_years(BigDecimal r0530_greater_than_5_years) {
		this.r0530_greater_than_5_years = r0530_greater_than_5_years;
	}
	public BigDecimal getR0530_total() {
		return r0530_total;
	}
	public void setR0530_total(BigDecimal r0530_total) {
		this.r0530_total = r0530_total;
	}
	public String getR0540_product() {
		return r0540_product;
	}
	public void setR0540_product(String r0540_product) {
		this.r0540_product = r0540_product;
	}
	public BigDecimal getR0540_overdue() {
		return r0540_overdue;
	}
	public void setR0540_overdue(BigDecimal r0540_overdue) {
		this.r0540_overdue = r0540_overdue;
	}
	public BigDecimal getR0540_overdraft() {
		return r0540_overdraft;
	}
	public void setR0540_overdraft(BigDecimal r0540_overdraft) {
		this.r0540_overdraft = r0540_overdraft;
	}
	public BigDecimal getR0540_0_to_7_days() {
		return r0540_0_to_7_days;
	}
	public void setR0540_0_to_7_days(BigDecimal r0540_0_to_7_days) {
		this.r0540_0_to_7_days = r0540_0_to_7_days;
	}
	public BigDecimal getR0540_8_to_14_days() {
		return r0540_8_to_14_days;
	}
	public void setR0540_8_to_14_days(BigDecimal r0540_8_to_14_days) {
		this.r0540_8_to_14_days = r0540_8_to_14_days;
	}
	public BigDecimal getR0540_15_days_to_1_month() {
		return r0540_15_days_to_1_month;
	}
	public void setR0540_15_days_to_1_month(BigDecimal r0540_15_days_to_1_month) {
		this.r0540_15_days_to_1_month = r0540_15_days_to_1_month;
	}
	public BigDecimal getR0540_1_to_2_months() {
		return r0540_1_to_2_months;
	}
	public void setR0540_1_to_2_months(BigDecimal r0540_1_to_2_months) {
		this.r0540_1_to_2_months = r0540_1_to_2_months;
	}
	public BigDecimal getR0540_2_to_3_months() {
		return r0540_2_to_3_months;
	}
	public void setR0540_2_to_3_months(BigDecimal r0540_2_to_3_months) {
		this.r0540_2_to_3_months = r0540_2_to_3_months;
	}
	public BigDecimal getR0540_3_to_6_months() {
		return r0540_3_to_6_months;
	}
	public void setR0540_3_to_6_months(BigDecimal r0540_3_to_6_months) {
		this.r0540_3_to_6_months = r0540_3_to_6_months;
	}
	public BigDecimal getR0540_6_to_12_months() {
		return r0540_6_to_12_months;
	}
	public void setR0540_6_to_12_months(BigDecimal r0540_6_to_12_months) {
		this.r0540_6_to_12_months = r0540_6_to_12_months;
	}
	public BigDecimal getR0540_1_to_3_years() {
		return r0540_1_to_3_years;
	}
	public void setR0540_1_to_3_years(BigDecimal r0540_1_to_3_years) {
		this.r0540_1_to_3_years = r0540_1_to_3_years;
	}
	public BigDecimal getR0540_3_to_5_years() {
		return r0540_3_to_5_years;
	}
	public void setR0540_3_to_5_years(BigDecimal r0540_3_to_5_years) {
		this.r0540_3_to_5_years = r0540_3_to_5_years;
	}
	public BigDecimal getR0540_greater_than_5_years() {
		return r0540_greater_than_5_years;
	}
	public void setR0540_greater_than_5_years(BigDecimal r0540_greater_than_5_years) {
		this.r0540_greater_than_5_years = r0540_greater_than_5_years;
	}
	public BigDecimal getR0540_total() {
		return r0540_total;
	}
	public void setR0540_total(BigDecimal r0540_total) {
		this.r0540_total = r0540_total;
	}
	public String getR0550_product() {
		return r0550_product;
	}
	public void setR0550_product(String r0550_product) {
		this.r0550_product = r0550_product;
	}
	public BigDecimal getR0550_overdue() {
		return r0550_overdue;
	}
	public void setR0550_overdue(BigDecimal r0550_overdue) {
		this.r0550_overdue = r0550_overdue;
	}
	public BigDecimal getR0550_overdraft() {
		return r0550_overdraft;
	}
	public void setR0550_overdraft(BigDecimal r0550_overdraft) {
		this.r0550_overdraft = r0550_overdraft;
	}
	public BigDecimal getR0550_0_to_7_days() {
		return r0550_0_to_7_days;
	}
	public void setR0550_0_to_7_days(BigDecimal r0550_0_to_7_days) {
		this.r0550_0_to_7_days = r0550_0_to_7_days;
	}
	public BigDecimal getR0550_8_to_14_days() {
		return r0550_8_to_14_days;
	}
	public void setR0550_8_to_14_days(BigDecimal r0550_8_to_14_days) {
		this.r0550_8_to_14_days = r0550_8_to_14_days;
	}
	public BigDecimal getR0550_15_days_to_1_month() {
		return r0550_15_days_to_1_month;
	}
	public void setR0550_15_days_to_1_month(BigDecimal r0550_15_days_to_1_month) {
		this.r0550_15_days_to_1_month = r0550_15_days_to_1_month;
	}
	public BigDecimal getR0550_1_to_2_months() {
		return r0550_1_to_2_months;
	}
	public void setR0550_1_to_2_months(BigDecimal r0550_1_to_2_months) {
		this.r0550_1_to_2_months = r0550_1_to_2_months;
	}
	public BigDecimal getR0550_2_to_3_months() {
		return r0550_2_to_3_months;
	}
	public void setR0550_2_to_3_months(BigDecimal r0550_2_to_3_months) {
		this.r0550_2_to_3_months = r0550_2_to_3_months;
	}
	public BigDecimal getR0550_3_to_6_months() {
		return r0550_3_to_6_months;
	}
	public void setR0550_3_to_6_months(BigDecimal r0550_3_to_6_months) {
		this.r0550_3_to_6_months = r0550_3_to_6_months;
	}
	public BigDecimal getR0550_6_to_12_months() {
		return r0550_6_to_12_months;
	}
	public void setR0550_6_to_12_months(BigDecimal r0550_6_to_12_months) {
		this.r0550_6_to_12_months = r0550_6_to_12_months;
	}
	public BigDecimal getR0550_1_to_3_years() {
		return r0550_1_to_3_years;
	}
	public void setR0550_1_to_3_years(BigDecimal r0550_1_to_3_years) {
		this.r0550_1_to_3_years = r0550_1_to_3_years;
	}
	public BigDecimal getR0550_3_to_5_years() {
		return r0550_3_to_5_years;
	}
	public void setR0550_3_to_5_years(BigDecimal r0550_3_to_5_years) {
		this.r0550_3_to_5_years = r0550_3_to_5_years;
	}
	public BigDecimal getR0550_greater_than_5_years() {
		return r0550_greater_than_5_years;
	}
	public void setR0550_greater_than_5_years(BigDecimal r0550_greater_than_5_years) {
		this.r0550_greater_than_5_years = r0550_greater_than_5_years;
	}
	public BigDecimal getR0550_total() {
		return r0550_total;
	}
	public void setR0550_total(BigDecimal r0550_total) {
		this.r0550_total = r0550_total;
	}
	public String getR0560_product() {
		return r0560_product;
	}
	public void setR0560_product(String r0560_product) {
		this.r0560_product = r0560_product;
	}
	public BigDecimal getR0560_overdue() {
		return r0560_overdue;
	}
	public void setR0560_overdue(BigDecimal r0560_overdue) {
		this.r0560_overdue = r0560_overdue;
	}
	public BigDecimal getR0560_overdraft() {
		return r0560_overdraft;
	}
	public void setR0560_overdraft(BigDecimal r0560_overdraft) {
		this.r0560_overdraft = r0560_overdraft;
	}
	public BigDecimal getR0560_0_to_7_days() {
		return r0560_0_to_7_days;
	}
	public void setR0560_0_to_7_days(BigDecimal r0560_0_to_7_days) {
		this.r0560_0_to_7_days = r0560_0_to_7_days;
	}
	public BigDecimal getR0560_8_to_14_days() {
		return r0560_8_to_14_days;
	}
	public void setR0560_8_to_14_days(BigDecimal r0560_8_to_14_days) {
		this.r0560_8_to_14_days = r0560_8_to_14_days;
	}
	public BigDecimal getR0560_15_days_to_1_month() {
		return r0560_15_days_to_1_month;
	}
	public void setR0560_15_days_to_1_month(BigDecimal r0560_15_days_to_1_month) {
		this.r0560_15_days_to_1_month = r0560_15_days_to_1_month;
	}
	public BigDecimal getR0560_1_to_2_months() {
		return r0560_1_to_2_months;
	}
	public void setR0560_1_to_2_months(BigDecimal r0560_1_to_2_months) {
		this.r0560_1_to_2_months = r0560_1_to_2_months;
	}
	public BigDecimal getR0560_2_to_3_months() {
		return r0560_2_to_3_months;
	}
	public void setR0560_2_to_3_months(BigDecimal r0560_2_to_3_months) {
		this.r0560_2_to_3_months = r0560_2_to_3_months;
	}
	public BigDecimal getR0560_3_to_6_months() {
		return r0560_3_to_6_months;
	}
	public void setR0560_3_to_6_months(BigDecimal r0560_3_to_6_months) {
		this.r0560_3_to_6_months = r0560_3_to_6_months;
	}
	public BigDecimal getR0560_6_to_12_months() {
		return r0560_6_to_12_months;
	}
	public void setR0560_6_to_12_months(BigDecimal r0560_6_to_12_months) {
		this.r0560_6_to_12_months = r0560_6_to_12_months;
	}
	public BigDecimal getR0560_1_to_3_years() {
		return r0560_1_to_3_years;
	}
	public void setR0560_1_to_3_years(BigDecimal r0560_1_to_3_years) {
		this.r0560_1_to_3_years = r0560_1_to_3_years;
	}
	public BigDecimal getR0560_3_to_5_years() {
		return r0560_3_to_5_years;
	}
	public void setR0560_3_to_5_years(BigDecimal r0560_3_to_5_years) {
		this.r0560_3_to_5_years = r0560_3_to_5_years;
	}
	public BigDecimal getR0560_greater_than_5_years() {
		return r0560_greater_than_5_years;
	}
	public void setR0560_greater_than_5_years(BigDecimal r0560_greater_than_5_years) {
		this.r0560_greater_than_5_years = r0560_greater_than_5_years;
	}
	public BigDecimal getR0560_total() {
		return r0560_total;
	}
	public void setR0560_total(BigDecimal r0560_total) {
		this.r0560_total = r0560_total;
	}
	public String getR0570_product() {
		return r0570_product;
	}
	public void setR0570_product(String r0570_product) {
		this.r0570_product = r0570_product;
	}
	public BigDecimal getR0570_overdue() {
		return r0570_overdue;
	}
	public void setR0570_overdue(BigDecimal r0570_overdue) {
		this.r0570_overdue = r0570_overdue;
	}
	public BigDecimal getR0570_overdraft() {
		return r0570_overdraft;
	}
	public void setR0570_overdraft(BigDecimal r0570_overdraft) {
		this.r0570_overdraft = r0570_overdraft;
	}
	public BigDecimal getR0570_0_to_7_days() {
		return r0570_0_to_7_days;
	}
	public void setR0570_0_to_7_days(BigDecimal r0570_0_to_7_days) {
		this.r0570_0_to_7_days = r0570_0_to_7_days;
	}
	public BigDecimal getR0570_8_to_14_days() {
		return r0570_8_to_14_days;
	}
	public void setR0570_8_to_14_days(BigDecimal r0570_8_to_14_days) {
		this.r0570_8_to_14_days = r0570_8_to_14_days;
	}
	public BigDecimal getR0570_15_days_to_1_month() {
		return r0570_15_days_to_1_month;
	}
	public void setR0570_15_days_to_1_month(BigDecimal r0570_15_days_to_1_month) {
		this.r0570_15_days_to_1_month = r0570_15_days_to_1_month;
	}
	public BigDecimal getR0570_1_to_2_months() {
		return r0570_1_to_2_months;
	}
	public void setR0570_1_to_2_months(BigDecimal r0570_1_to_2_months) {
		this.r0570_1_to_2_months = r0570_1_to_2_months;
	}
	public BigDecimal getR0570_2_to_3_months() {
		return r0570_2_to_3_months;
	}
	public void setR0570_2_to_3_months(BigDecimal r0570_2_to_3_months) {
		this.r0570_2_to_3_months = r0570_2_to_3_months;
	}
	public BigDecimal getR0570_3_to_6_months() {
		return r0570_3_to_6_months;
	}
	public void setR0570_3_to_6_months(BigDecimal r0570_3_to_6_months) {
		this.r0570_3_to_6_months = r0570_3_to_6_months;
	}
	public BigDecimal getR0570_6_to_12_months() {
		return r0570_6_to_12_months;
	}
	public void setR0570_6_to_12_months(BigDecimal r0570_6_to_12_months) {
		this.r0570_6_to_12_months = r0570_6_to_12_months;
	}
	public BigDecimal getR0570_1_to_3_years() {
		return r0570_1_to_3_years;
	}
	public void setR0570_1_to_3_years(BigDecimal r0570_1_to_3_years) {
		this.r0570_1_to_3_years = r0570_1_to_3_years;
	}
	public BigDecimal getR0570_3_to_5_years() {
		return r0570_3_to_5_years;
	}
	public void setR0570_3_to_5_years(BigDecimal r0570_3_to_5_years) {
		this.r0570_3_to_5_years = r0570_3_to_5_years;
	}
	public BigDecimal getR0570_greater_than_5_years() {
		return r0570_greater_than_5_years;
	}
	public void setR0570_greater_than_5_years(BigDecimal r0570_greater_than_5_years) {
		this.r0570_greater_than_5_years = r0570_greater_than_5_years;
	}
	public BigDecimal getR0570_total() {
		return r0570_total;
	}
	public void setR0570_total(BigDecimal r0570_total) {
		this.r0570_total = r0570_total;
	}
	public String getR0580_product() {
		return r0580_product;
	}
	public void setR0580_product(String r0580_product) {
		this.r0580_product = r0580_product;
	}
	public BigDecimal getR0580_overdue() {
		return r0580_overdue;
	}
	public void setR0580_overdue(BigDecimal r0580_overdue) {
		this.r0580_overdue = r0580_overdue;
	}
	public BigDecimal getR0580_overdraft() {
		return r0580_overdraft;
	}
	public void setR0580_overdraft(BigDecimal r0580_overdraft) {
		this.r0580_overdraft = r0580_overdraft;
	}
	public BigDecimal getR0580_0_to_7_days() {
		return r0580_0_to_7_days;
	}
	public void setR0580_0_to_7_days(BigDecimal r0580_0_to_7_days) {
		this.r0580_0_to_7_days = r0580_0_to_7_days;
	}
	public BigDecimal getR0580_8_to_14_days() {
		return r0580_8_to_14_days;
	}
	public void setR0580_8_to_14_days(BigDecimal r0580_8_to_14_days) {
		this.r0580_8_to_14_days = r0580_8_to_14_days;
	}
	public BigDecimal getR0580_15_days_to_1_month() {
		return r0580_15_days_to_1_month;
	}
	public void setR0580_15_days_to_1_month(BigDecimal r0580_15_days_to_1_month) {
		this.r0580_15_days_to_1_month = r0580_15_days_to_1_month;
	}
	public BigDecimal getR0580_1_to_2_months() {
		return r0580_1_to_2_months;
	}
	public void setR0580_1_to_2_months(BigDecimal r0580_1_to_2_months) {
		this.r0580_1_to_2_months = r0580_1_to_2_months;
	}
	public BigDecimal getR0580_2_to_3_months() {
		return r0580_2_to_3_months;
	}
	public void setR0580_2_to_3_months(BigDecimal r0580_2_to_3_months) {
		this.r0580_2_to_3_months = r0580_2_to_3_months;
	}
	public BigDecimal getR0580_3_to_6_months() {
		return r0580_3_to_6_months;
	}
	public void setR0580_3_to_6_months(BigDecimal r0580_3_to_6_months) {
		this.r0580_3_to_6_months = r0580_3_to_6_months;
	}
	public BigDecimal getR0580_6_to_12_months() {
		return r0580_6_to_12_months;
	}
	public void setR0580_6_to_12_months(BigDecimal r0580_6_to_12_months) {
		this.r0580_6_to_12_months = r0580_6_to_12_months;
	}
	public BigDecimal getR0580_1_to_3_years() {
		return r0580_1_to_3_years;
	}
	public void setR0580_1_to_3_years(BigDecimal r0580_1_to_3_years) {
		this.r0580_1_to_3_years = r0580_1_to_3_years;
	}
	public BigDecimal getR0580_3_to_5_years() {
		return r0580_3_to_5_years;
	}
	public void setR0580_3_to_5_years(BigDecimal r0580_3_to_5_years) {
		this.r0580_3_to_5_years = r0580_3_to_5_years;
	}
	public BigDecimal getR0580_greater_than_5_years() {
		return r0580_greater_than_5_years;
	}
	public void setR0580_greater_than_5_years(BigDecimal r0580_greater_than_5_years) {
		this.r0580_greater_than_5_years = r0580_greater_than_5_years;
	}
	public BigDecimal getR0580_total() {
		return r0580_total;
	}
	public void setR0580_total(BigDecimal r0580_total) {
		this.r0580_total = r0580_total;
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
	
	
	
	public CBUAE_BRF2_7_SUMMARY_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}




