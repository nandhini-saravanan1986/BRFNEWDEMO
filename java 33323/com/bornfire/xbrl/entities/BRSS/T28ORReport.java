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
@Table(name="T28_OR_BANK_IT_RISK_EVENT_TABLE")
public class T28ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_NO_OF_EVENTS;
	private BigDecimal	A1_AMOUNT_INVOLVED;
	private BigDecimal	A1_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A1_AMT_OF_MAX_LOSS;
	private BigDecimal	A1_AMT_OF_GROSS_LOSS;
	private BigDecimal	A1_AMT_RECOVERED;
	private BigDecimal	A1_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A1_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A1_ACTUAL_NET_LOSS;
	private BigDecimal	A1_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A1_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A1_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A1_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A1_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A1_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A1_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A1_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A1_PREV_CAL_NET_LOSS;
	private BigDecimal	A1_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A1_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A1_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A1_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A1_CUR_CAL_NET_LOSS;
	private String	A2_PRODUCT;
	private BigDecimal	A2_NO_OF_EVENTS;
	private BigDecimal	A2_AMOUNT_INVOLVED;
	private BigDecimal	A2_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A2_AMT_OF_MAX_LOSS;
	private BigDecimal	A2_AMT_OF_GROSS_LOSS;
	private BigDecimal	A2_AMT_RECOVERED;
	private BigDecimal	A2_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A2_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A2_ACTUAL_NET_LOSS;
	private BigDecimal	A2_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A2_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A2_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A2_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A2_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A2_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A2_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A2_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A2_PREV_CAL_NET_LOSS;
	private BigDecimal	A2_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A2_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A2_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A2_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A2_CUR_CAL_NET_LOSS;
	private String	A3_PRODUCT;
	private BigDecimal	A3_NO_OF_EVENTS;
	private BigDecimal	A3_AMOUNT_INVOLVED;
	private BigDecimal	A3_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A3_AMT_OF_MAX_LOSS;
	private BigDecimal	A3_AMT_OF_GROSS_LOSS;
	private BigDecimal	A3_AMT_RECOVERED;
	private BigDecimal	A3_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A3_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A3_ACTUAL_NET_LOSS;
	private BigDecimal	A3_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A3_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A3_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A3_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A3_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A3_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A3_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A3_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A3_PREV_CAL_NET_LOSS;
	private BigDecimal	A3_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A3_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A3_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A3_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A3_CUR_CAL_NET_LOSS;
	private String	A4_PRODUCT;
	private BigDecimal	A4_NO_OF_EVENTS;
	private BigDecimal	A4_AMOUNT_INVOLVED;
	private BigDecimal	A4_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A4_AMT_OF_MAX_LOSS;
	private BigDecimal	A4_AMT_OF_GROSS_LOSS;
	private BigDecimal	A4_AMT_RECOVERED;
	private BigDecimal	A4_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A4_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A4_ACTUAL_NET_LOSS;
	private BigDecimal	A4_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A4_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A4_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A4_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A4_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A4_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A4_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A4_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A4_PREV_CAL_NET_LOSS;
	private BigDecimal	A4_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A4_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A4_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A4_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A4_CUR_CAL_NET_LOSS;
	private String	A5_PRODUCT;
	private BigDecimal	A5_NO_OF_EVENTS;
	private BigDecimal	A5_AMOUNT_INVOLVED;
	private BigDecimal	A5_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A5_AMT_OF_MAX_LOSS;
	private BigDecimal	A5_AMT_OF_GROSS_LOSS;
	private BigDecimal	A5_AMT_RECOVERED;
	private BigDecimal	A5_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A5_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A5_ACTUAL_NET_LOSS;
	private BigDecimal	A5_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A5_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A5_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A5_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A5_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A5_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A5_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A5_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A5_PREV_CAL_NET_LOSS;
	private BigDecimal	A5_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A5_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A5_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A5_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A5_CUR_CAL_NET_LOSS;
	private String	A6_PRODUCT;
	private BigDecimal	A6_NO_OF_EVENTS;
	private BigDecimal	A6_AMOUNT_INVOLVED;
	private BigDecimal	A6_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A6_AMT_OF_MAX_LOSS;
	private BigDecimal	A6_AMT_OF_GROSS_LOSS;
	private BigDecimal	A6_AMT_RECOVERED;
	private BigDecimal	A6_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A6_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A6_ACTUAL_NET_LOSS;
	private BigDecimal	A6_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A6_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A6_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A6_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A6_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A6_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A6_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A6_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A6_PREV_CAL_NET_LOSS;
	private BigDecimal	A6_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A6_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A6_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A6_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A6_CUR_CAL_NET_LOSS;
	private String	A7_PRODUCT;
	private BigDecimal	A7_NO_OF_EVENTS;
	private BigDecimal	A7_AMOUNT_INVOLVED;
	private BigDecimal	A7_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A7_AMT_OF_MAX_LOSS;
	private BigDecimal	A7_AMT_OF_GROSS_LOSS;
	private BigDecimal	A7_AMT_RECOVERED;
	private BigDecimal	A7_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A7_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A7_ACTUAL_NET_LOSS;
	private BigDecimal	A7_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A7_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A7_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A7_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A7_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A7_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A7_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A7_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A7_PREV_CAL_NET_LOSS;
	private BigDecimal	A7_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A7_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A7_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A7_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A7_CUR_CAL_NET_LOSS;
	private String	A8_PRODUCT;
	private BigDecimal	A8_NO_OF_EVENTS;
	private BigDecimal	A8_AMOUNT_INVOLVED;
	private BigDecimal	A8_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A8_AMT_OF_MAX_LOSS;
	private BigDecimal	A8_AMT_OF_GROSS_LOSS;
	private BigDecimal	A8_AMT_RECOVERED;
	private BigDecimal	A8_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A8_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A8_ACTUAL_NET_LOSS;
	private BigDecimal	A8_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A8_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A8_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A8_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A8_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A8_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A8_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A8_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A8_PREV_CAL_NET_LOSS;
	private BigDecimal	A8_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A8_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A8_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A8_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A8_CUR_CAL_NET_LOSS;
	private String	A9_PRODUCT;
	private BigDecimal	A9_NO_OF_EVENTS;
	private BigDecimal	A9_AMOUNT_INVOLVED;
	private BigDecimal	A9_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A9_AMT_OF_MAX_LOSS;
	private BigDecimal	A9_AMT_OF_GROSS_LOSS;
	private BigDecimal	A9_AMT_RECOVERED;
	private BigDecimal	A9_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A9_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A9_ACTUAL_NET_LOSS;
	private BigDecimal	A9_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A9_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A9_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A9_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A9_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A9_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A9_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A9_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A9_PREV_CAL_NET_LOSS;
	private BigDecimal	A9_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A9_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A9_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A9_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A9_CUR_CAL_NET_LOSS;
	private String	A10_PRODUCT;
	private BigDecimal	A10_NO_OF_EVENTS;
	private BigDecimal	A10_AMOUNT_INVOLVED;
	private BigDecimal	A10_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A10_AMT_OF_MAX_LOSS;
	private BigDecimal	A10_AMT_OF_GROSS_LOSS;
	private BigDecimal	A10_AMT_RECOVERED;
	private BigDecimal	A10_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A10_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A10_ACTUAL_NET_LOSS;
	private BigDecimal	A10_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A10_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A10_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A10_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A10_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A10_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A10_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A10_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A10_PREV_CAL_NET_LOSS;
	private BigDecimal	A10_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A10_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A10_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A10_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A10_CUR_CAL_NET_LOSS;
	private String	A11_PRODUCT;
	private BigDecimal	A11_NO_OF_EVENTS;
	private BigDecimal	A11_AMOUNT_INVOLVED;
	private BigDecimal	A11_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A11_AMT_OF_MAX_LOSS;
	private BigDecimal	A11_AMT_OF_GROSS_LOSS;
	private BigDecimal	A11_AMT_RECOVERED;
	private BigDecimal	A11_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A11_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A11_ACTUAL_NET_LOSS;
	private BigDecimal	A11_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A11_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A11_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A11_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A11_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A11_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A11_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A11_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A11_PREV_CAL_NET_LOSS;
	private BigDecimal	A11_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A11_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A11_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A11_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A11_CUR_CAL_NET_LOSS;
	private String	A12_PRODUCT;
	private BigDecimal	A12_NO_OF_EVENTS;
	private BigDecimal	A12_AMOUNT_INVOLVED;
	private BigDecimal	A12_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A12_AMT_OF_MAX_LOSS;
	private BigDecimal	A12_AMT_OF_GROSS_LOSS;
	private BigDecimal	A12_AMT_RECOVERED;
	private BigDecimal	A12_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A12_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A12_ACTUAL_NET_LOSS;
	private BigDecimal	A12_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A12_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A12_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A12_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A12_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A12_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A12_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A12_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A12_PREV_CAL_NET_LOSS;
	private BigDecimal	A12_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A12_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A12_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A12_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A12_CUR_CAL_NET_LOSS;
	private String	A13_PRODUCT;
	private BigDecimal	A13_NO_OF_EVENTS;
	private BigDecimal	A13_AMOUNT_INVOLVED;
	private BigDecimal	A13_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A13_AMT_OF_MAX_LOSS;
	private BigDecimal	A13_AMT_OF_GROSS_LOSS;
	private BigDecimal	A13_AMT_RECOVERED;
	private BigDecimal	A13_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A13_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A13_ACTUAL_NET_LOSS;
	private BigDecimal	A13_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A13_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A13_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A13_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A13_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A13_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A13_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A13_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A13_PREV_CAL_NET_LOSS;
	private BigDecimal	A13_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A13_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A13_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A13_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A13_CUR_CAL_NET_LOSS;
	private String	A14_PRODUCT;
	private BigDecimal	A14_NO_OF_EVENTS;
	private BigDecimal	A14_AMOUNT_INVOLVED;
	private BigDecimal	A14_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A14_AMT_OF_MAX_LOSS;
	private BigDecimal	A14_AMT_OF_GROSS_LOSS;
	private BigDecimal	A14_AMT_RECOVERED;
	private BigDecimal	A14_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A14_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A14_ACTUAL_NET_LOSS;
	private BigDecimal	A14_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A14_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A14_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A14_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A14_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A14_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A14_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A14_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A14_PREV_CAL_NET_LOSS;
	private BigDecimal	A14_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A14_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A14_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A14_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A14_CUR_CAL_NET_LOSS;
	private String	A15_PRODUCT;
	private BigDecimal	A15_NO_OF_EVENTS;
	private BigDecimal	A15_AMOUNT_INVOLVED;
	private BigDecimal	A15_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A15_AMT_OF_MAX_LOSS;
	private BigDecimal	A15_AMT_OF_GROSS_LOSS;
	private BigDecimal	A15_AMT_RECOVERED;
	private BigDecimal	A15_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A15_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A15_ACTUAL_NET_LOSS;
	private BigDecimal	A15_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A15_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A15_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A15_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A15_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A15_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A15_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A15_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A15_PREV_CAL_NET_LOSS;
	private BigDecimal	A15_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A15_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A15_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A15_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A15_CUR_CAL_NET_LOSS;
	private String	A16_PRODUCT;
	private BigDecimal	A16_NO_OF_EVENTS;
	private BigDecimal	A16_AMOUNT_INVOLVED;
	private BigDecimal	A16_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A16_AMT_OF_MAX_LOSS;
	private BigDecimal	A16_AMT_OF_GROSS_LOSS;
	private BigDecimal	A16_AMT_RECOVERED;
	private BigDecimal	A16_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A16_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A16_ACTUAL_NET_LOSS;
	private BigDecimal	A16_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A16_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A16_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A16_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A16_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A16_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A16_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A16_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A16_PREV_CAL_NET_LOSS;
	private BigDecimal	A16_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A16_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A16_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A16_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A16_CUR_CAL_NET_LOSS;
	private String	A17_PRODUCT;
	private BigDecimal	A17_NO_OF_EVENTS;
	private BigDecimal	A17_AMOUNT_INVOLVED;
	private BigDecimal	A17_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A17_AMT_OF_MAX_LOSS;
	private BigDecimal	A17_AMT_OF_GROSS_LOSS;
	private BigDecimal	A17_AMT_RECOVERED;
	private BigDecimal	A17_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A17_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A17_ACTUAL_NET_LOSS;
	private BigDecimal	A17_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A17_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A17_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A17_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A17_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A17_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A17_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A17_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A17_PREV_CAL_NET_LOSS;
	private BigDecimal	A17_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A17_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A17_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A17_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A17_CUR_CAL_NET_LOSS;
	private String	A18_PRODUCT;
	private BigDecimal	A18_NO_OF_EVENTS;
	private BigDecimal	A18_AMOUNT_INVOLVED;
	private BigDecimal	A18_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A18_AMT_OF_MAX_LOSS;
	private BigDecimal	A18_AMT_OF_GROSS_LOSS;
	private BigDecimal	A18_AMT_RECOVERED;
	private BigDecimal	A18_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A18_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A18_ACTUAL_NET_LOSS;
	private BigDecimal	A18_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A18_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A18_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A18_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A18_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A18_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A18_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A18_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A18_PREV_CAL_NET_LOSS;
	private BigDecimal	A18_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A18_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A18_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A18_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A18_CUR_CAL_NET_LOSS;
	private String	A19_PRODUCT;
	private BigDecimal	A19_NO_OF_EVENTS;
	private BigDecimal	A19_AMOUNT_INVOLVED;
	private BigDecimal	A19_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A19_AMT_OF_MAX_LOSS;
	private BigDecimal	A19_AMT_OF_GROSS_LOSS;
	private BigDecimal	A19_AMT_RECOVERED;
	private BigDecimal	A19_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A19_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A19_ACTUAL_NET_LOSS;
	private BigDecimal	A19_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A19_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A19_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A19_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A19_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A19_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A19_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A19_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A19_PREV_CAL_NET_LOSS;
	private BigDecimal	A19_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A19_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A19_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A19_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A19_CUR_CAL_NET_LOSS;
	private String	A20_PRODUCT;
	private BigDecimal	A20_NO_OF_EVENTS;
	private BigDecimal	A20_AMOUNT_INVOLVED;
	private BigDecimal	A20_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A20_AMT_OF_MAX_LOSS;
	private BigDecimal	A20_AMT_OF_GROSS_LOSS;
	private BigDecimal	A20_AMT_RECOVERED;
	private BigDecimal	A20_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A20_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A20_ACTUAL_NET_LOSS;
	private BigDecimal	A20_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A20_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A20_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A20_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A20_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A20_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A20_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A20_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A20_PREV_CAL_NET_LOSS;
	private BigDecimal	A20_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A20_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A20_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A20_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A20_CUR_CAL_NET_LOSS;
	private String	A21_PRODUCT;
	private String	A22_PRODUCT;
	private BigDecimal	A22_NO_OF_EVENTS;
	private BigDecimal	A22_AMOUNT_INVOLVED;
	private BigDecimal	A22_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A22_AMT_OF_MAX_LOSS;
	private BigDecimal	A22_AMT_OF_GROSS_LOSS;
	private BigDecimal	A22_AMT_RECOVERED;
	private BigDecimal	A22_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A22_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A22_ACTUAL_NET_LOSS;
	private BigDecimal	A22_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A22_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A22_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A22_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A22_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A22_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A22_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A22_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A22_PREV_CAL_NET_LOSS;
	private BigDecimal	A22_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A22_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A22_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A22_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A22_CUR_CAL_NET_LOSS;
	private String	A23_PRODUCT;
	private BigDecimal	A23_NO_OF_EVENTS;
	private BigDecimal	A23_AMOUNT_INVOLVED;
	private BigDecimal	A23_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A23_AMT_OF_MAX_LOSS;
	private BigDecimal	A23_AMT_OF_GROSS_LOSS;
	private BigDecimal	A23_AMT_RECOVERED;
	private BigDecimal	A23_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A23_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A23_ACTUAL_NET_LOSS;
	private BigDecimal	A23_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A23_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A23_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A23_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A23_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A23_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A23_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A23_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A23_PREV_CAL_NET_LOSS;
	private BigDecimal	A23_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A23_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A23_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A23_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A23_CUR_CAL_NET_LOSS;
	private String	A24_PRODUCT;
	private BigDecimal	A24_NO_OF_EVENTS;
	private BigDecimal	A24_AMOUNT_INVOLVED;
	private BigDecimal	A24_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A24_AMT_OF_MAX_LOSS;
	private BigDecimal	A24_AMT_OF_GROSS_LOSS;
	private BigDecimal	A24_AMT_RECOVERED;
	private BigDecimal	A24_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A24_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A24_ACTUAL_NET_LOSS;
	private BigDecimal	A24_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A24_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A24_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A24_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A24_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A24_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A24_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A24_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A24_PREV_CAL_NET_LOSS;
	private BigDecimal	A24_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A24_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A24_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A24_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A24_CUR_CAL_NET_LOSS;
	private String	A25_PRODUCT;
	private BigDecimal	A25_NO_OF_EVENTS;
	private BigDecimal	A25_AMOUNT_INVOLVED;
	private BigDecimal	A25_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A25_AMT_OF_MAX_LOSS;
	private BigDecimal	A25_AMT_OF_GROSS_LOSS;
	private BigDecimal	A25_AMT_RECOVERED;
	private BigDecimal	A25_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A25_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A25_ACTUAL_NET_LOSS;
	private BigDecimal	A25_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A25_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A25_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A25_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A25_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A25_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A25_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A25_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A25_PREV_CAL_NET_LOSS;
	private BigDecimal	A25_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A25_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A25_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A25_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A25_CUR_CAL_NET_LOSS;
	private String	A26_PRODUCT;
	private BigDecimal	A26_NO_OF_EVENTS;
	private BigDecimal	A26_AMOUNT_INVOLVED;
	private BigDecimal	A26_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A26_AMT_OF_MAX_LOSS;
	private BigDecimal	A26_AMT_OF_GROSS_LOSS;
	private BigDecimal	A26_AMT_RECOVERED;
	private BigDecimal	A26_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A26_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A26_ACTUAL_NET_LOSS;
	private BigDecimal	A26_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A26_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A26_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A26_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A26_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A26_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A26_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A26_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A26_PREV_CAL_NET_LOSS;
	private BigDecimal	A26_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A26_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A26_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A26_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A26_CUR_CAL_NET_LOSS;
	private String	A27_PRODUCT;
	private BigDecimal	A27_NO_OF_EVENTS;
	private BigDecimal	A27_AMOUNT_INVOLVED;
	private BigDecimal	A27_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A27_AMT_OF_MAX_LOSS;
	private BigDecimal	A27_AMT_OF_GROSS_LOSS;
	private BigDecimal	A27_AMT_RECOVERED;
	private BigDecimal	A27_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A27_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A27_ACTUAL_NET_LOSS;
	private BigDecimal	A27_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A27_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A27_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A27_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A27_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A27_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A27_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A27_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A27_PREV_CAL_NET_LOSS;
	private BigDecimal	A27_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A27_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A27_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A27_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A27_CUR_CAL_NET_LOSS;
	private String	A28_PRODUCT;
	private BigDecimal	A28_NO_OF_EVENTS;
	private BigDecimal	A28_AMOUNT_INVOLVED;
	private BigDecimal	A28_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A28_AMT_OF_MAX_LOSS;
	private BigDecimal	A28_AMT_OF_GROSS_LOSS;
	private BigDecimal	A28_AMT_RECOVERED;
	private BigDecimal	A28_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A28_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A28_ACTUAL_NET_LOSS;
	private BigDecimal	A28_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A28_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A28_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A28_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A28_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A28_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A28_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A28_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A28_PREV_CAL_NET_LOSS;
	private BigDecimal	A28_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A28_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A28_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A28_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A28_CUR_CAL_NET_LOSS;
	private String	A29_PRODUCT;
	private BigDecimal	A29_NO_OF_EVENTS;
	private BigDecimal	A29_AMOUNT_INVOLVED;
	private BigDecimal	A29_NO_OF_FUNC_AREA_INVOLVED;
	private BigDecimal	A29_AMT_OF_MAX_LOSS;
	private BigDecimal	A29_AMT_OF_GROSS_LOSS;
	private BigDecimal	A29_AMT_RECOVERED;
	private BigDecimal	A29_AMT_CLAIMED_INSURANCE;
	private BigDecimal	A29_AMT_RECOVERED_INSURANCE;
	private BigDecimal	A29_ACTUAL_NET_LOSS;
	private BigDecimal	A29_TOTAL_NO_ACTUAL_MISS;
	private BigDecimal	A29_NO_SIGNIFICANT_EVENTS;
	private BigDecimal	A29_POTENTIAL_LOSS_TO_THE_BANK;
	private BigDecimal	A29_ACTUAL_LOSS_TO_THE_BANK;
	private BigDecimal	A29_PREV_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A29_PREV_CAL_AMT_RECOVERED;
	private BigDecimal	A29_PREV_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A29_PREV_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A29_PREV_CAL_NET_LOSS;
	private BigDecimal	A29_CUR_CAL_AMT_GROSS_LOSS;
	private BigDecimal	A29_CUR_CAL_AMT_RECOVERED;
	private BigDecimal	A29_CUR_CAL_AMT_CLAIMED_INSURERS;
	private BigDecimal	A29_CUR_CAL_AMT_RECOVERED_INSURERS;
	private BigDecimal	A29_CUR_CAL_NET_LOSS;


	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private String	ENTITY_FLG;
	private String	DEL_FLG;
	private String	MODIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_TIME;
	private String	QTR_FLG;
	
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}

	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}

	public BigDecimal getA1_NO_OF_EVENTS() {
		return A1_NO_OF_EVENTS;
	}

	public void setA1_NO_OF_EVENTS(BigDecimal a1_NO_OF_EVENTS) {
		A1_NO_OF_EVENTS = a1_NO_OF_EVENTS;
	}

	public BigDecimal getA1_AMOUNT_INVOLVED() {
		return A1_AMOUNT_INVOLVED;
	}

	public void setA1_AMOUNT_INVOLVED(BigDecimal a1_AMOUNT_INVOLVED) {
		A1_AMOUNT_INVOLVED = a1_AMOUNT_INVOLVED;
	}

	public BigDecimal getA1_NO_OF_FUNC_AREA_INVOLVED() {
		return A1_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA1_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a1_NO_OF_FUNC_AREA_INVOLVED) {
		A1_NO_OF_FUNC_AREA_INVOLVED = a1_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA1_AMT_OF_MAX_LOSS() {
		return A1_AMT_OF_MAX_LOSS;
	}

	public void setA1_AMT_OF_MAX_LOSS(BigDecimal a1_AMT_OF_MAX_LOSS) {
		A1_AMT_OF_MAX_LOSS = a1_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA1_AMT_OF_GROSS_LOSS() {
		return A1_AMT_OF_GROSS_LOSS;
	}

	public void setA1_AMT_OF_GROSS_LOSS(BigDecimal a1_AMT_OF_GROSS_LOSS) {
		A1_AMT_OF_GROSS_LOSS = a1_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA1_AMT_RECOVERED() {
		return A1_AMT_RECOVERED;
	}

	public void setA1_AMT_RECOVERED(BigDecimal a1_AMT_RECOVERED) {
		A1_AMT_RECOVERED = a1_AMT_RECOVERED;
	}

	public BigDecimal getA1_AMT_CLAIMED_INSURANCE() {
		return A1_AMT_CLAIMED_INSURANCE;
	}

	public void setA1_AMT_CLAIMED_INSURANCE(BigDecimal a1_AMT_CLAIMED_INSURANCE) {
		A1_AMT_CLAIMED_INSURANCE = a1_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA1_AMT_RECOVERED_INSURANCE() {
		return A1_AMT_RECOVERED_INSURANCE;
	}

	public void setA1_AMT_RECOVERED_INSURANCE(BigDecimal a1_AMT_RECOVERED_INSURANCE) {
		A1_AMT_RECOVERED_INSURANCE = a1_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA1_ACTUAL_NET_LOSS() {
		return A1_ACTUAL_NET_LOSS;
	}

	public void setA1_ACTUAL_NET_LOSS(BigDecimal a1_ACTUAL_NET_LOSS) {
		A1_ACTUAL_NET_LOSS = a1_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA1_TOTAL_NO_ACTUAL_MISS() {
		return A1_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA1_TOTAL_NO_ACTUAL_MISS(BigDecimal a1_TOTAL_NO_ACTUAL_MISS) {
		A1_TOTAL_NO_ACTUAL_MISS = a1_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA1_NO_SIGNIFICANT_EVENTS() {
		return A1_NO_SIGNIFICANT_EVENTS;
	}

	public void setA1_NO_SIGNIFICANT_EVENTS(BigDecimal a1_NO_SIGNIFICANT_EVENTS) {
		A1_NO_SIGNIFICANT_EVENTS = a1_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA1_POTENTIAL_LOSS_TO_THE_BANK() {
		return A1_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA1_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a1_POTENTIAL_LOSS_TO_THE_BANK) {
		A1_POTENTIAL_LOSS_TO_THE_BANK = a1_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA1_ACTUAL_LOSS_TO_THE_BANK() {
		return A1_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA1_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a1_ACTUAL_LOSS_TO_THE_BANK) {
		A1_ACTUAL_LOSS_TO_THE_BANK = a1_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA1_PREV_CAL_AMT_GROSS_LOSS() {
		return A1_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA1_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a1_PREV_CAL_AMT_GROSS_LOSS) {
		A1_PREV_CAL_AMT_GROSS_LOSS = a1_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA1_PREV_CAL_AMT_RECOVERED() {
		return A1_PREV_CAL_AMT_RECOVERED;
	}

	public void setA1_PREV_CAL_AMT_RECOVERED(BigDecimal a1_PREV_CAL_AMT_RECOVERED) {
		A1_PREV_CAL_AMT_RECOVERED = a1_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA1_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A1_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA1_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a1_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A1_PREV_CAL_AMT_CLAIMED_INSURERS = a1_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA1_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A1_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA1_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a1_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A1_PREV_CAL_AMT_RECOVERED_INSURERS = a1_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA1_PREV_CAL_NET_LOSS() {
		return A1_PREV_CAL_NET_LOSS;
	}

	public void setA1_PREV_CAL_NET_LOSS(BigDecimal a1_PREV_CAL_NET_LOSS) {
		A1_PREV_CAL_NET_LOSS = a1_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA1_CUR_CAL_AMT_GROSS_LOSS() {
		return A1_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA1_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a1_CUR_CAL_AMT_GROSS_LOSS) {
		A1_CUR_CAL_AMT_GROSS_LOSS = a1_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA1_CUR_CAL_AMT_RECOVERED() {
		return A1_CUR_CAL_AMT_RECOVERED;
	}

	public void setA1_CUR_CAL_AMT_RECOVERED(BigDecimal a1_CUR_CAL_AMT_RECOVERED) {
		A1_CUR_CAL_AMT_RECOVERED = a1_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA1_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A1_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA1_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a1_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A1_CUR_CAL_AMT_CLAIMED_INSURERS = a1_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA1_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A1_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA1_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a1_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A1_CUR_CAL_AMT_RECOVERED_INSURERS = a1_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA1_CUR_CAL_NET_LOSS() {
		return A1_CUR_CAL_NET_LOSS;
	}

	public void setA1_CUR_CAL_NET_LOSS(BigDecimal a1_CUR_CAL_NET_LOSS) {
		A1_CUR_CAL_NET_LOSS = a1_CUR_CAL_NET_LOSS;
	}

	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}

	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}

	public BigDecimal getA2_NO_OF_EVENTS() {
		return A2_NO_OF_EVENTS;
	}

	public void setA2_NO_OF_EVENTS(BigDecimal a2_NO_OF_EVENTS) {
		A2_NO_OF_EVENTS = a2_NO_OF_EVENTS;
	}

	public BigDecimal getA2_AMOUNT_INVOLVED() {
		return A2_AMOUNT_INVOLVED;
	}

	public void setA2_AMOUNT_INVOLVED(BigDecimal a2_AMOUNT_INVOLVED) {
		A2_AMOUNT_INVOLVED = a2_AMOUNT_INVOLVED;
	}

	public BigDecimal getA2_NO_OF_FUNC_AREA_INVOLVED() {
		return A2_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA2_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a2_NO_OF_FUNC_AREA_INVOLVED) {
		A2_NO_OF_FUNC_AREA_INVOLVED = a2_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA2_AMT_OF_MAX_LOSS() {
		return A2_AMT_OF_MAX_LOSS;
	}

	public void setA2_AMT_OF_MAX_LOSS(BigDecimal a2_AMT_OF_MAX_LOSS) {
		A2_AMT_OF_MAX_LOSS = a2_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA2_AMT_OF_GROSS_LOSS() {
		return A2_AMT_OF_GROSS_LOSS;
	}

	public void setA2_AMT_OF_GROSS_LOSS(BigDecimal a2_AMT_OF_GROSS_LOSS) {
		A2_AMT_OF_GROSS_LOSS = a2_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA2_AMT_RECOVERED() {
		return A2_AMT_RECOVERED;
	}

	public void setA2_AMT_RECOVERED(BigDecimal a2_AMT_RECOVERED) {
		A2_AMT_RECOVERED = a2_AMT_RECOVERED;
	}

	public BigDecimal getA2_AMT_CLAIMED_INSURANCE() {
		return A2_AMT_CLAIMED_INSURANCE;
	}

	public void setA2_AMT_CLAIMED_INSURANCE(BigDecimal a2_AMT_CLAIMED_INSURANCE) {
		A2_AMT_CLAIMED_INSURANCE = a2_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA2_AMT_RECOVERED_INSURANCE() {
		return A2_AMT_RECOVERED_INSURANCE;
	}

	public void setA2_AMT_RECOVERED_INSURANCE(BigDecimal a2_AMT_RECOVERED_INSURANCE) {
		A2_AMT_RECOVERED_INSURANCE = a2_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA2_ACTUAL_NET_LOSS() {
		return A2_ACTUAL_NET_LOSS;
	}

	public void setA2_ACTUAL_NET_LOSS(BigDecimal a2_ACTUAL_NET_LOSS) {
		A2_ACTUAL_NET_LOSS = a2_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA2_TOTAL_NO_ACTUAL_MISS() {
		return A2_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA2_TOTAL_NO_ACTUAL_MISS(BigDecimal a2_TOTAL_NO_ACTUAL_MISS) {
		A2_TOTAL_NO_ACTUAL_MISS = a2_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA2_NO_SIGNIFICANT_EVENTS() {
		return A2_NO_SIGNIFICANT_EVENTS;
	}

	public void setA2_NO_SIGNIFICANT_EVENTS(BigDecimal a2_NO_SIGNIFICANT_EVENTS) {
		A2_NO_SIGNIFICANT_EVENTS = a2_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA2_POTENTIAL_LOSS_TO_THE_BANK() {
		return A2_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA2_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a2_POTENTIAL_LOSS_TO_THE_BANK) {
		A2_POTENTIAL_LOSS_TO_THE_BANK = a2_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA2_ACTUAL_LOSS_TO_THE_BANK() {
		return A2_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA2_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a2_ACTUAL_LOSS_TO_THE_BANK) {
		A2_ACTUAL_LOSS_TO_THE_BANK = a2_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA2_PREV_CAL_AMT_GROSS_LOSS() {
		return A2_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA2_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a2_PREV_CAL_AMT_GROSS_LOSS) {
		A2_PREV_CAL_AMT_GROSS_LOSS = a2_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA2_PREV_CAL_AMT_RECOVERED() {
		return A2_PREV_CAL_AMT_RECOVERED;
	}

	public void setA2_PREV_CAL_AMT_RECOVERED(BigDecimal a2_PREV_CAL_AMT_RECOVERED) {
		A2_PREV_CAL_AMT_RECOVERED = a2_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA2_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A2_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA2_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a2_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A2_PREV_CAL_AMT_CLAIMED_INSURERS = a2_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA2_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A2_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA2_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a2_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A2_PREV_CAL_AMT_RECOVERED_INSURERS = a2_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA2_PREV_CAL_NET_LOSS() {
		return A2_PREV_CAL_NET_LOSS;
	}

	public void setA2_PREV_CAL_NET_LOSS(BigDecimal a2_PREV_CAL_NET_LOSS) {
		A2_PREV_CAL_NET_LOSS = a2_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA2_CUR_CAL_AMT_GROSS_LOSS() {
		return A2_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA2_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a2_CUR_CAL_AMT_GROSS_LOSS) {
		A2_CUR_CAL_AMT_GROSS_LOSS = a2_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA2_CUR_CAL_AMT_RECOVERED() {
		return A2_CUR_CAL_AMT_RECOVERED;
	}

	public void setA2_CUR_CAL_AMT_RECOVERED(BigDecimal a2_CUR_CAL_AMT_RECOVERED) {
		A2_CUR_CAL_AMT_RECOVERED = a2_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA2_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A2_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA2_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a2_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A2_CUR_CAL_AMT_CLAIMED_INSURERS = a2_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA2_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A2_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA2_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a2_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A2_CUR_CAL_AMT_RECOVERED_INSURERS = a2_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA2_CUR_CAL_NET_LOSS() {
		return A2_CUR_CAL_NET_LOSS;
	}

	public void setA2_CUR_CAL_NET_LOSS(BigDecimal a2_CUR_CAL_NET_LOSS) {
		A2_CUR_CAL_NET_LOSS = a2_CUR_CAL_NET_LOSS;
	}

	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}

	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}

	public BigDecimal getA3_NO_OF_EVENTS() {
		return A3_NO_OF_EVENTS;
	}

	public void setA3_NO_OF_EVENTS(BigDecimal a3_NO_OF_EVENTS) {
		A3_NO_OF_EVENTS = a3_NO_OF_EVENTS;
	}

	public BigDecimal getA3_AMOUNT_INVOLVED() {
		return A3_AMOUNT_INVOLVED;
	}

	public void setA3_AMOUNT_INVOLVED(BigDecimal a3_AMOUNT_INVOLVED) {
		A3_AMOUNT_INVOLVED = a3_AMOUNT_INVOLVED;
	}

	public BigDecimal getA3_NO_OF_FUNC_AREA_INVOLVED() {
		return A3_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA3_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a3_NO_OF_FUNC_AREA_INVOLVED) {
		A3_NO_OF_FUNC_AREA_INVOLVED = a3_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA3_AMT_OF_MAX_LOSS() {
		return A3_AMT_OF_MAX_LOSS;
	}

	public void setA3_AMT_OF_MAX_LOSS(BigDecimal a3_AMT_OF_MAX_LOSS) {
		A3_AMT_OF_MAX_LOSS = a3_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA3_AMT_OF_GROSS_LOSS() {
		return A3_AMT_OF_GROSS_LOSS;
	}

	public void setA3_AMT_OF_GROSS_LOSS(BigDecimal a3_AMT_OF_GROSS_LOSS) {
		A3_AMT_OF_GROSS_LOSS = a3_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA3_AMT_RECOVERED() {
		return A3_AMT_RECOVERED;
	}

	public void setA3_AMT_RECOVERED(BigDecimal a3_AMT_RECOVERED) {
		A3_AMT_RECOVERED = a3_AMT_RECOVERED;
	}

	public BigDecimal getA3_AMT_CLAIMED_INSURANCE() {
		return A3_AMT_CLAIMED_INSURANCE;
	}

	public void setA3_AMT_CLAIMED_INSURANCE(BigDecimal a3_AMT_CLAIMED_INSURANCE) {
		A3_AMT_CLAIMED_INSURANCE = a3_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA3_AMT_RECOVERED_INSURANCE() {
		return A3_AMT_RECOVERED_INSURANCE;
	}

	public void setA3_AMT_RECOVERED_INSURANCE(BigDecimal a3_AMT_RECOVERED_INSURANCE) {
		A3_AMT_RECOVERED_INSURANCE = a3_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA3_ACTUAL_NET_LOSS() {
		return A3_ACTUAL_NET_LOSS;
	}

	public void setA3_ACTUAL_NET_LOSS(BigDecimal a3_ACTUAL_NET_LOSS) {
		A3_ACTUAL_NET_LOSS = a3_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA3_TOTAL_NO_ACTUAL_MISS() {
		return A3_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA3_TOTAL_NO_ACTUAL_MISS(BigDecimal a3_TOTAL_NO_ACTUAL_MISS) {
		A3_TOTAL_NO_ACTUAL_MISS = a3_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA3_NO_SIGNIFICANT_EVENTS() {
		return A3_NO_SIGNIFICANT_EVENTS;
	}

	public void setA3_NO_SIGNIFICANT_EVENTS(BigDecimal a3_NO_SIGNIFICANT_EVENTS) {
		A3_NO_SIGNIFICANT_EVENTS = a3_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA3_POTENTIAL_LOSS_TO_THE_BANK() {
		return A3_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA3_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a3_POTENTIAL_LOSS_TO_THE_BANK) {
		A3_POTENTIAL_LOSS_TO_THE_BANK = a3_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA3_ACTUAL_LOSS_TO_THE_BANK() {
		return A3_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA3_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a3_ACTUAL_LOSS_TO_THE_BANK) {
		A3_ACTUAL_LOSS_TO_THE_BANK = a3_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA3_PREV_CAL_AMT_GROSS_LOSS() {
		return A3_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA3_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a3_PREV_CAL_AMT_GROSS_LOSS) {
		A3_PREV_CAL_AMT_GROSS_LOSS = a3_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA3_PREV_CAL_AMT_RECOVERED() {
		return A3_PREV_CAL_AMT_RECOVERED;
	}

	public void setA3_PREV_CAL_AMT_RECOVERED(BigDecimal a3_PREV_CAL_AMT_RECOVERED) {
		A3_PREV_CAL_AMT_RECOVERED = a3_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA3_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A3_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA3_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a3_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A3_PREV_CAL_AMT_CLAIMED_INSURERS = a3_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA3_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A3_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA3_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a3_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A3_PREV_CAL_AMT_RECOVERED_INSURERS = a3_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA3_PREV_CAL_NET_LOSS() {
		return A3_PREV_CAL_NET_LOSS;
	}

	public void setA3_PREV_CAL_NET_LOSS(BigDecimal a3_PREV_CAL_NET_LOSS) {
		A3_PREV_CAL_NET_LOSS = a3_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA3_CUR_CAL_AMT_GROSS_LOSS() {
		return A3_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA3_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a3_CUR_CAL_AMT_GROSS_LOSS) {
		A3_CUR_CAL_AMT_GROSS_LOSS = a3_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA3_CUR_CAL_AMT_RECOVERED() {
		return A3_CUR_CAL_AMT_RECOVERED;
	}

	public void setA3_CUR_CAL_AMT_RECOVERED(BigDecimal a3_CUR_CAL_AMT_RECOVERED) {
		A3_CUR_CAL_AMT_RECOVERED = a3_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA3_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A3_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA3_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a3_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A3_CUR_CAL_AMT_CLAIMED_INSURERS = a3_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA3_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A3_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA3_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a3_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A3_CUR_CAL_AMT_RECOVERED_INSURERS = a3_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA3_CUR_CAL_NET_LOSS() {
		return A3_CUR_CAL_NET_LOSS;
	}

	public void setA3_CUR_CAL_NET_LOSS(BigDecimal a3_CUR_CAL_NET_LOSS) {
		A3_CUR_CAL_NET_LOSS = a3_CUR_CAL_NET_LOSS;
	}

	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}

	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}

	public BigDecimal getA4_NO_OF_EVENTS() {
		return A4_NO_OF_EVENTS;
	}

	public void setA4_NO_OF_EVENTS(BigDecimal a4_NO_OF_EVENTS) {
		A4_NO_OF_EVENTS = a4_NO_OF_EVENTS;
	}

	public BigDecimal getA4_AMOUNT_INVOLVED() {
		return A4_AMOUNT_INVOLVED;
	}

	public void setA4_AMOUNT_INVOLVED(BigDecimal a4_AMOUNT_INVOLVED) {
		A4_AMOUNT_INVOLVED = a4_AMOUNT_INVOLVED;
	}

	public BigDecimal getA4_NO_OF_FUNC_AREA_INVOLVED() {
		return A4_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA4_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a4_NO_OF_FUNC_AREA_INVOLVED) {
		A4_NO_OF_FUNC_AREA_INVOLVED = a4_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA4_AMT_OF_MAX_LOSS() {
		return A4_AMT_OF_MAX_LOSS;
	}

	public void setA4_AMT_OF_MAX_LOSS(BigDecimal a4_AMT_OF_MAX_LOSS) {
		A4_AMT_OF_MAX_LOSS = a4_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA4_AMT_OF_GROSS_LOSS() {
		return A4_AMT_OF_GROSS_LOSS;
	}

	public void setA4_AMT_OF_GROSS_LOSS(BigDecimal a4_AMT_OF_GROSS_LOSS) {
		A4_AMT_OF_GROSS_LOSS = a4_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA4_AMT_RECOVERED() {
		return A4_AMT_RECOVERED;
	}

	public void setA4_AMT_RECOVERED(BigDecimal a4_AMT_RECOVERED) {
		A4_AMT_RECOVERED = a4_AMT_RECOVERED;
	}

	public BigDecimal getA4_AMT_CLAIMED_INSURANCE() {
		return A4_AMT_CLAIMED_INSURANCE;
	}

	public void setA4_AMT_CLAIMED_INSURANCE(BigDecimal a4_AMT_CLAIMED_INSURANCE) {
		A4_AMT_CLAIMED_INSURANCE = a4_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA4_AMT_RECOVERED_INSURANCE() {
		return A4_AMT_RECOVERED_INSURANCE;
	}

	public void setA4_AMT_RECOVERED_INSURANCE(BigDecimal a4_AMT_RECOVERED_INSURANCE) {
		A4_AMT_RECOVERED_INSURANCE = a4_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA4_ACTUAL_NET_LOSS() {
		return A4_ACTUAL_NET_LOSS;
	}

	public void setA4_ACTUAL_NET_LOSS(BigDecimal a4_ACTUAL_NET_LOSS) {
		A4_ACTUAL_NET_LOSS = a4_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA4_TOTAL_NO_ACTUAL_MISS() {
		return A4_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA4_TOTAL_NO_ACTUAL_MISS(BigDecimal a4_TOTAL_NO_ACTUAL_MISS) {
		A4_TOTAL_NO_ACTUAL_MISS = a4_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA4_NO_SIGNIFICANT_EVENTS() {
		return A4_NO_SIGNIFICANT_EVENTS;
	}

	public void setA4_NO_SIGNIFICANT_EVENTS(BigDecimal a4_NO_SIGNIFICANT_EVENTS) {
		A4_NO_SIGNIFICANT_EVENTS = a4_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA4_POTENTIAL_LOSS_TO_THE_BANK() {
		return A4_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA4_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a4_POTENTIAL_LOSS_TO_THE_BANK) {
		A4_POTENTIAL_LOSS_TO_THE_BANK = a4_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA4_ACTUAL_LOSS_TO_THE_BANK() {
		return A4_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA4_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a4_ACTUAL_LOSS_TO_THE_BANK) {
		A4_ACTUAL_LOSS_TO_THE_BANK = a4_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA4_PREV_CAL_AMT_GROSS_LOSS() {
		return A4_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA4_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a4_PREV_CAL_AMT_GROSS_LOSS) {
		A4_PREV_CAL_AMT_GROSS_LOSS = a4_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA4_PREV_CAL_AMT_RECOVERED() {
		return A4_PREV_CAL_AMT_RECOVERED;
	}

	public void setA4_PREV_CAL_AMT_RECOVERED(BigDecimal a4_PREV_CAL_AMT_RECOVERED) {
		A4_PREV_CAL_AMT_RECOVERED = a4_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA4_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A4_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA4_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a4_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A4_PREV_CAL_AMT_CLAIMED_INSURERS = a4_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA4_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A4_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA4_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a4_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A4_PREV_CAL_AMT_RECOVERED_INSURERS = a4_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA4_PREV_CAL_NET_LOSS() {
		return A4_PREV_CAL_NET_LOSS;
	}

	public void setA4_PREV_CAL_NET_LOSS(BigDecimal a4_PREV_CAL_NET_LOSS) {
		A4_PREV_CAL_NET_LOSS = a4_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA4_CUR_CAL_AMT_GROSS_LOSS() {
		return A4_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA4_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a4_CUR_CAL_AMT_GROSS_LOSS) {
		A4_CUR_CAL_AMT_GROSS_LOSS = a4_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA4_CUR_CAL_AMT_RECOVERED() {
		return A4_CUR_CAL_AMT_RECOVERED;
	}

	public void setA4_CUR_CAL_AMT_RECOVERED(BigDecimal a4_CUR_CAL_AMT_RECOVERED) {
		A4_CUR_CAL_AMT_RECOVERED = a4_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA4_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A4_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA4_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a4_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A4_CUR_CAL_AMT_CLAIMED_INSURERS = a4_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA4_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A4_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA4_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a4_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A4_CUR_CAL_AMT_RECOVERED_INSURERS = a4_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA4_CUR_CAL_NET_LOSS() {
		return A4_CUR_CAL_NET_LOSS;
	}

	public void setA4_CUR_CAL_NET_LOSS(BigDecimal a4_CUR_CAL_NET_LOSS) {
		A4_CUR_CAL_NET_LOSS = a4_CUR_CAL_NET_LOSS;
	}

	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}

	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}

	public BigDecimal getA5_NO_OF_EVENTS() {
		return A5_NO_OF_EVENTS;
	}

	public void setA5_NO_OF_EVENTS(BigDecimal a5_NO_OF_EVENTS) {
		A5_NO_OF_EVENTS = a5_NO_OF_EVENTS;
	}

	public BigDecimal getA5_AMOUNT_INVOLVED() {
		return A5_AMOUNT_INVOLVED;
	}

	public void setA5_AMOUNT_INVOLVED(BigDecimal a5_AMOUNT_INVOLVED) {
		A5_AMOUNT_INVOLVED = a5_AMOUNT_INVOLVED;
	}

	public BigDecimal getA5_NO_OF_FUNC_AREA_INVOLVED() {
		return A5_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA5_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a5_NO_OF_FUNC_AREA_INVOLVED) {
		A5_NO_OF_FUNC_AREA_INVOLVED = a5_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA5_AMT_OF_MAX_LOSS() {
		return A5_AMT_OF_MAX_LOSS;
	}

	public void setA5_AMT_OF_MAX_LOSS(BigDecimal a5_AMT_OF_MAX_LOSS) {
		A5_AMT_OF_MAX_LOSS = a5_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA5_AMT_OF_GROSS_LOSS() {
		return A5_AMT_OF_GROSS_LOSS;
	}

	public void setA5_AMT_OF_GROSS_LOSS(BigDecimal a5_AMT_OF_GROSS_LOSS) {
		A5_AMT_OF_GROSS_LOSS = a5_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA5_AMT_RECOVERED() {
		return A5_AMT_RECOVERED;
	}

	public void setA5_AMT_RECOVERED(BigDecimal a5_AMT_RECOVERED) {
		A5_AMT_RECOVERED = a5_AMT_RECOVERED;
	}

	public BigDecimal getA5_AMT_CLAIMED_INSURANCE() {
		return A5_AMT_CLAIMED_INSURANCE;
	}

	public void setA5_AMT_CLAIMED_INSURANCE(BigDecimal a5_AMT_CLAIMED_INSURANCE) {
		A5_AMT_CLAIMED_INSURANCE = a5_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA5_AMT_RECOVERED_INSURANCE() {
		return A5_AMT_RECOVERED_INSURANCE;
	}

	public void setA5_AMT_RECOVERED_INSURANCE(BigDecimal a5_AMT_RECOVERED_INSURANCE) {
		A5_AMT_RECOVERED_INSURANCE = a5_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA5_ACTUAL_NET_LOSS() {
		return A5_ACTUAL_NET_LOSS;
	}

	public void setA5_ACTUAL_NET_LOSS(BigDecimal a5_ACTUAL_NET_LOSS) {
		A5_ACTUAL_NET_LOSS = a5_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA5_TOTAL_NO_ACTUAL_MISS() {
		return A5_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA5_TOTAL_NO_ACTUAL_MISS(BigDecimal a5_TOTAL_NO_ACTUAL_MISS) {
		A5_TOTAL_NO_ACTUAL_MISS = a5_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA5_NO_SIGNIFICANT_EVENTS() {
		return A5_NO_SIGNIFICANT_EVENTS;
	}

	public void setA5_NO_SIGNIFICANT_EVENTS(BigDecimal a5_NO_SIGNIFICANT_EVENTS) {
		A5_NO_SIGNIFICANT_EVENTS = a5_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA5_POTENTIAL_LOSS_TO_THE_BANK() {
		return A5_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA5_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a5_POTENTIAL_LOSS_TO_THE_BANK) {
		A5_POTENTIAL_LOSS_TO_THE_BANK = a5_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA5_ACTUAL_LOSS_TO_THE_BANK() {
		return A5_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA5_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a5_ACTUAL_LOSS_TO_THE_BANK) {
		A5_ACTUAL_LOSS_TO_THE_BANK = a5_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA5_PREV_CAL_AMT_GROSS_LOSS() {
		return A5_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA5_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a5_PREV_CAL_AMT_GROSS_LOSS) {
		A5_PREV_CAL_AMT_GROSS_LOSS = a5_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA5_PREV_CAL_AMT_RECOVERED() {
		return A5_PREV_CAL_AMT_RECOVERED;
	}

	public void setA5_PREV_CAL_AMT_RECOVERED(BigDecimal a5_PREV_CAL_AMT_RECOVERED) {
		A5_PREV_CAL_AMT_RECOVERED = a5_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA5_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A5_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA5_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a5_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A5_PREV_CAL_AMT_CLAIMED_INSURERS = a5_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA5_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A5_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA5_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a5_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A5_PREV_CAL_AMT_RECOVERED_INSURERS = a5_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA5_PREV_CAL_NET_LOSS() {
		return A5_PREV_CAL_NET_LOSS;
	}

	public void setA5_PREV_CAL_NET_LOSS(BigDecimal a5_PREV_CAL_NET_LOSS) {
		A5_PREV_CAL_NET_LOSS = a5_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA5_CUR_CAL_AMT_GROSS_LOSS() {
		return A5_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA5_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a5_CUR_CAL_AMT_GROSS_LOSS) {
		A5_CUR_CAL_AMT_GROSS_LOSS = a5_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA5_CUR_CAL_AMT_RECOVERED() {
		return A5_CUR_CAL_AMT_RECOVERED;
	}

	public void setA5_CUR_CAL_AMT_RECOVERED(BigDecimal a5_CUR_CAL_AMT_RECOVERED) {
		A5_CUR_CAL_AMT_RECOVERED = a5_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA5_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A5_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA5_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a5_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A5_CUR_CAL_AMT_CLAIMED_INSURERS = a5_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA5_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A5_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA5_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a5_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A5_CUR_CAL_AMT_RECOVERED_INSURERS = a5_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA5_CUR_CAL_NET_LOSS() {
		return A5_CUR_CAL_NET_LOSS;
	}

	public void setA5_CUR_CAL_NET_LOSS(BigDecimal a5_CUR_CAL_NET_LOSS) {
		A5_CUR_CAL_NET_LOSS = a5_CUR_CAL_NET_LOSS;
	}

	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}

	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}

	public BigDecimal getA6_NO_OF_EVENTS() {
		return A6_NO_OF_EVENTS;
	}

	public void setA6_NO_OF_EVENTS(BigDecimal a6_NO_OF_EVENTS) {
		A6_NO_OF_EVENTS = a6_NO_OF_EVENTS;
	}

	public BigDecimal getA6_AMOUNT_INVOLVED() {
		return A6_AMOUNT_INVOLVED;
	}

	public void setA6_AMOUNT_INVOLVED(BigDecimal a6_AMOUNT_INVOLVED) {
		A6_AMOUNT_INVOLVED = a6_AMOUNT_INVOLVED;
	}

	public BigDecimal getA6_NO_OF_FUNC_AREA_INVOLVED() {
		return A6_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA6_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a6_NO_OF_FUNC_AREA_INVOLVED) {
		A6_NO_OF_FUNC_AREA_INVOLVED = a6_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA6_AMT_OF_MAX_LOSS() {
		return A6_AMT_OF_MAX_LOSS;
	}

	public void setA6_AMT_OF_MAX_LOSS(BigDecimal a6_AMT_OF_MAX_LOSS) {
		A6_AMT_OF_MAX_LOSS = a6_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA6_AMT_OF_GROSS_LOSS() {
		return A6_AMT_OF_GROSS_LOSS;
	}

	public void setA6_AMT_OF_GROSS_LOSS(BigDecimal a6_AMT_OF_GROSS_LOSS) {
		A6_AMT_OF_GROSS_LOSS = a6_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA6_AMT_RECOVERED() {
		return A6_AMT_RECOVERED;
	}

	public void setA6_AMT_RECOVERED(BigDecimal a6_AMT_RECOVERED) {
		A6_AMT_RECOVERED = a6_AMT_RECOVERED;
	}

	public BigDecimal getA6_AMT_CLAIMED_INSURANCE() {
		return A6_AMT_CLAIMED_INSURANCE;
	}

	public void setA6_AMT_CLAIMED_INSURANCE(BigDecimal a6_AMT_CLAIMED_INSURANCE) {
		A6_AMT_CLAIMED_INSURANCE = a6_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA6_AMT_RECOVERED_INSURANCE() {
		return A6_AMT_RECOVERED_INSURANCE;
	}

	public void setA6_AMT_RECOVERED_INSURANCE(BigDecimal a6_AMT_RECOVERED_INSURANCE) {
		A6_AMT_RECOVERED_INSURANCE = a6_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA6_ACTUAL_NET_LOSS() {
		return A6_ACTUAL_NET_LOSS;
	}

	public void setA6_ACTUAL_NET_LOSS(BigDecimal a6_ACTUAL_NET_LOSS) {
		A6_ACTUAL_NET_LOSS = a6_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA6_TOTAL_NO_ACTUAL_MISS() {
		return A6_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA6_TOTAL_NO_ACTUAL_MISS(BigDecimal a6_TOTAL_NO_ACTUAL_MISS) {
		A6_TOTAL_NO_ACTUAL_MISS = a6_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA6_NO_SIGNIFICANT_EVENTS() {
		return A6_NO_SIGNIFICANT_EVENTS;
	}

	public void setA6_NO_SIGNIFICANT_EVENTS(BigDecimal a6_NO_SIGNIFICANT_EVENTS) {
		A6_NO_SIGNIFICANT_EVENTS = a6_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA6_POTENTIAL_LOSS_TO_THE_BANK() {
		return A6_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA6_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a6_POTENTIAL_LOSS_TO_THE_BANK) {
		A6_POTENTIAL_LOSS_TO_THE_BANK = a6_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA6_ACTUAL_LOSS_TO_THE_BANK() {
		return A6_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA6_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a6_ACTUAL_LOSS_TO_THE_BANK) {
		A6_ACTUAL_LOSS_TO_THE_BANK = a6_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA6_PREV_CAL_AMT_GROSS_LOSS() {
		return A6_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA6_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a6_PREV_CAL_AMT_GROSS_LOSS) {
		A6_PREV_CAL_AMT_GROSS_LOSS = a6_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA6_PREV_CAL_AMT_RECOVERED() {
		return A6_PREV_CAL_AMT_RECOVERED;
	}

	public void setA6_PREV_CAL_AMT_RECOVERED(BigDecimal a6_PREV_CAL_AMT_RECOVERED) {
		A6_PREV_CAL_AMT_RECOVERED = a6_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA6_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A6_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA6_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a6_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A6_PREV_CAL_AMT_CLAIMED_INSURERS = a6_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA6_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A6_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA6_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a6_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A6_PREV_CAL_AMT_RECOVERED_INSURERS = a6_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA6_PREV_CAL_NET_LOSS() {
		return A6_PREV_CAL_NET_LOSS;
	}

	public void setA6_PREV_CAL_NET_LOSS(BigDecimal a6_PREV_CAL_NET_LOSS) {
		A6_PREV_CAL_NET_LOSS = a6_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA6_CUR_CAL_AMT_GROSS_LOSS() {
		return A6_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA6_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a6_CUR_CAL_AMT_GROSS_LOSS) {
		A6_CUR_CAL_AMT_GROSS_LOSS = a6_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA6_CUR_CAL_AMT_RECOVERED() {
		return A6_CUR_CAL_AMT_RECOVERED;
	}

	public void setA6_CUR_CAL_AMT_RECOVERED(BigDecimal a6_CUR_CAL_AMT_RECOVERED) {
		A6_CUR_CAL_AMT_RECOVERED = a6_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA6_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A6_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA6_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a6_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A6_CUR_CAL_AMT_CLAIMED_INSURERS = a6_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA6_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A6_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA6_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a6_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A6_CUR_CAL_AMT_RECOVERED_INSURERS = a6_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA6_CUR_CAL_NET_LOSS() {
		return A6_CUR_CAL_NET_LOSS;
	}

	public void setA6_CUR_CAL_NET_LOSS(BigDecimal a6_CUR_CAL_NET_LOSS) {
		A6_CUR_CAL_NET_LOSS = a6_CUR_CAL_NET_LOSS;
	}

	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}

	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}

	public BigDecimal getA7_NO_OF_EVENTS() {
		return A7_NO_OF_EVENTS;
	}

	public void setA7_NO_OF_EVENTS(BigDecimal a7_NO_OF_EVENTS) {
		A7_NO_OF_EVENTS = a7_NO_OF_EVENTS;
	}

	public BigDecimal getA7_AMOUNT_INVOLVED() {
		return A7_AMOUNT_INVOLVED;
	}

	public void setA7_AMOUNT_INVOLVED(BigDecimal a7_AMOUNT_INVOLVED) {
		A7_AMOUNT_INVOLVED = a7_AMOUNT_INVOLVED;
	}

	public BigDecimal getA7_NO_OF_FUNC_AREA_INVOLVED() {
		return A7_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA7_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a7_NO_OF_FUNC_AREA_INVOLVED) {
		A7_NO_OF_FUNC_AREA_INVOLVED = a7_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA7_AMT_OF_MAX_LOSS() {
		return A7_AMT_OF_MAX_LOSS;
	}

	public void setA7_AMT_OF_MAX_LOSS(BigDecimal a7_AMT_OF_MAX_LOSS) {
		A7_AMT_OF_MAX_LOSS = a7_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA7_AMT_OF_GROSS_LOSS() {
		return A7_AMT_OF_GROSS_LOSS;
	}

	public void setA7_AMT_OF_GROSS_LOSS(BigDecimal a7_AMT_OF_GROSS_LOSS) {
		A7_AMT_OF_GROSS_LOSS = a7_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA7_AMT_RECOVERED() {
		return A7_AMT_RECOVERED;
	}

	public void setA7_AMT_RECOVERED(BigDecimal a7_AMT_RECOVERED) {
		A7_AMT_RECOVERED = a7_AMT_RECOVERED;
	}

	public BigDecimal getA7_AMT_CLAIMED_INSURANCE() {
		return A7_AMT_CLAIMED_INSURANCE;
	}

	public void setA7_AMT_CLAIMED_INSURANCE(BigDecimal a7_AMT_CLAIMED_INSURANCE) {
		A7_AMT_CLAIMED_INSURANCE = a7_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA7_AMT_RECOVERED_INSURANCE() {
		return A7_AMT_RECOVERED_INSURANCE;
	}

	public void setA7_AMT_RECOVERED_INSURANCE(BigDecimal a7_AMT_RECOVERED_INSURANCE) {
		A7_AMT_RECOVERED_INSURANCE = a7_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA7_ACTUAL_NET_LOSS() {
		return A7_ACTUAL_NET_LOSS;
	}

	public void setA7_ACTUAL_NET_LOSS(BigDecimal a7_ACTUAL_NET_LOSS) {
		A7_ACTUAL_NET_LOSS = a7_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA7_TOTAL_NO_ACTUAL_MISS() {
		return A7_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA7_TOTAL_NO_ACTUAL_MISS(BigDecimal a7_TOTAL_NO_ACTUAL_MISS) {
		A7_TOTAL_NO_ACTUAL_MISS = a7_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA7_NO_SIGNIFICANT_EVENTS() {
		return A7_NO_SIGNIFICANT_EVENTS;
	}

	public void setA7_NO_SIGNIFICANT_EVENTS(BigDecimal a7_NO_SIGNIFICANT_EVENTS) {
		A7_NO_SIGNIFICANT_EVENTS = a7_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA7_POTENTIAL_LOSS_TO_THE_BANK() {
		return A7_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA7_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a7_POTENTIAL_LOSS_TO_THE_BANK) {
		A7_POTENTIAL_LOSS_TO_THE_BANK = a7_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA7_ACTUAL_LOSS_TO_THE_BANK() {
		return A7_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA7_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a7_ACTUAL_LOSS_TO_THE_BANK) {
		A7_ACTUAL_LOSS_TO_THE_BANK = a7_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA7_PREV_CAL_AMT_GROSS_LOSS() {
		return A7_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA7_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a7_PREV_CAL_AMT_GROSS_LOSS) {
		A7_PREV_CAL_AMT_GROSS_LOSS = a7_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA7_PREV_CAL_AMT_RECOVERED() {
		return A7_PREV_CAL_AMT_RECOVERED;
	}

	public void setA7_PREV_CAL_AMT_RECOVERED(BigDecimal a7_PREV_CAL_AMT_RECOVERED) {
		A7_PREV_CAL_AMT_RECOVERED = a7_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA7_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A7_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA7_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a7_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A7_PREV_CAL_AMT_CLAIMED_INSURERS = a7_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA7_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A7_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA7_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a7_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A7_PREV_CAL_AMT_RECOVERED_INSURERS = a7_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA7_PREV_CAL_NET_LOSS() {
		return A7_PREV_CAL_NET_LOSS;
	}

	public void setA7_PREV_CAL_NET_LOSS(BigDecimal a7_PREV_CAL_NET_LOSS) {
		A7_PREV_CAL_NET_LOSS = a7_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA7_CUR_CAL_AMT_GROSS_LOSS() {
		return A7_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA7_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a7_CUR_CAL_AMT_GROSS_LOSS) {
		A7_CUR_CAL_AMT_GROSS_LOSS = a7_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA7_CUR_CAL_AMT_RECOVERED() {
		return A7_CUR_CAL_AMT_RECOVERED;
	}

	public void setA7_CUR_CAL_AMT_RECOVERED(BigDecimal a7_CUR_CAL_AMT_RECOVERED) {
		A7_CUR_CAL_AMT_RECOVERED = a7_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA7_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A7_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA7_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a7_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A7_CUR_CAL_AMT_CLAIMED_INSURERS = a7_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA7_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A7_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA7_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a7_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A7_CUR_CAL_AMT_RECOVERED_INSURERS = a7_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA7_CUR_CAL_NET_LOSS() {
		return A7_CUR_CAL_NET_LOSS;
	}

	public void setA7_CUR_CAL_NET_LOSS(BigDecimal a7_CUR_CAL_NET_LOSS) {
		A7_CUR_CAL_NET_LOSS = a7_CUR_CAL_NET_LOSS;
	}

	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}

	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}

	public BigDecimal getA8_NO_OF_EVENTS() {
		return A8_NO_OF_EVENTS;
	}

	public void setA8_NO_OF_EVENTS(BigDecimal a8_NO_OF_EVENTS) {
		A8_NO_OF_EVENTS = a8_NO_OF_EVENTS;
	}

	public BigDecimal getA8_AMOUNT_INVOLVED() {
		return A8_AMOUNT_INVOLVED;
	}

	public void setA8_AMOUNT_INVOLVED(BigDecimal a8_AMOUNT_INVOLVED) {
		A8_AMOUNT_INVOLVED = a8_AMOUNT_INVOLVED;
	}

	public BigDecimal getA8_NO_OF_FUNC_AREA_INVOLVED() {
		return A8_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA8_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a8_NO_OF_FUNC_AREA_INVOLVED) {
		A8_NO_OF_FUNC_AREA_INVOLVED = a8_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA8_AMT_OF_MAX_LOSS() {
		return A8_AMT_OF_MAX_LOSS;
	}

	public void setA8_AMT_OF_MAX_LOSS(BigDecimal a8_AMT_OF_MAX_LOSS) {
		A8_AMT_OF_MAX_LOSS = a8_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA8_AMT_OF_GROSS_LOSS() {
		return A8_AMT_OF_GROSS_LOSS;
	}

	public void setA8_AMT_OF_GROSS_LOSS(BigDecimal a8_AMT_OF_GROSS_LOSS) {
		A8_AMT_OF_GROSS_LOSS = a8_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA8_AMT_RECOVERED() {
		return A8_AMT_RECOVERED;
	}

	public void setA8_AMT_RECOVERED(BigDecimal a8_AMT_RECOVERED) {
		A8_AMT_RECOVERED = a8_AMT_RECOVERED;
	}

	public BigDecimal getA8_AMT_CLAIMED_INSURANCE() {
		return A8_AMT_CLAIMED_INSURANCE;
	}

	public void setA8_AMT_CLAIMED_INSURANCE(BigDecimal a8_AMT_CLAIMED_INSURANCE) {
		A8_AMT_CLAIMED_INSURANCE = a8_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA8_AMT_RECOVERED_INSURANCE() {
		return A8_AMT_RECOVERED_INSURANCE;
	}

	public void setA8_AMT_RECOVERED_INSURANCE(BigDecimal a8_AMT_RECOVERED_INSURANCE) {
		A8_AMT_RECOVERED_INSURANCE = a8_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA8_ACTUAL_NET_LOSS() {
		return A8_ACTUAL_NET_LOSS;
	}

	public void setA8_ACTUAL_NET_LOSS(BigDecimal a8_ACTUAL_NET_LOSS) {
		A8_ACTUAL_NET_LOSS = a8_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA8_TOTAL_NO_ACTUAL_MISS() {
		return A8_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA8_TOTAL_NO_ACTUAL_MISS(BigDecimal a8_TOTAL_NO_ACTUAL_MISS) {
		A8_TOTAL_NO_ACTUAL_MISS = a8_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA8_NO_SIGNIFICANT_EVENTS() {
		return A8_NO_SIGNIFICANT_EVENTS;
	}

	public void setA8_NO_SIGNIFICANT_EVENTS(BigDecimal a8_NO_SIGNIFICANT_EVENTS) {
		A8_NO_SIGNIFICANT_EVENTS = a8_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA8_POTENTIAL_LOSS_TO_THE_BANK() {
		return A8_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA8_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a8_POTENTIAL_LOSS_TO_THE_BANK) {
		A8_POTENTIAL_LOSS_TO_THE_BANK = a8_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA8_ACTUAL_LOSS_TO_THE_BANK() {
		return A8_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA8_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a8_ACTUAL_LOSS_TO_THE_BANK) {
		A8_ACTUAL_LOSS_TO_THE_BANK = a8_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA8_PREV_CAL_AMT_GROSS_LOSS() {
		return A8_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA8_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a8_PREV_CAL_AMT_GROSS_LOSS) {
		A8_PREV_CAL_AMT_GROSS_LOSS = a8_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA8_PREV_CAL_AMT_RECOVERED() {
		return A8_PREV_CAL_AMT_RECOVERED;
	}

	public void setA8_PREV_CAL_AMT_RECOVERED(BigDecimal a8_PREV_CAL_AMT_RECOVERED) {
		A8_PREV_CAL_AMT_RECOVERED = a8_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA8_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A8_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA8_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a8_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A8_PREV_CAL_AMT_CLAIMED_INSURERS = a8_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA8_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A8_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA8_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a8_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A8_PREV_CAL_AMT_RECOVERED_INSURERS = a8_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA8_PREV_CAL_NET_LOSS() {
		return A8_PREV_CAL_NET_LOSS;
	}

	public void setA8_PREV_CAL_NET_LOSS(BigDecimal a8_PREV_CAL_NET_LOSS) {
		A8_PREV_CAL_NET_LOSS = a8_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA8_CUR_CAL_AMT_GROSS_LOSS() {
		return A8_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA8_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a8_CUR_CAL_AMT_GROSS_LOSS) {
		A8_CUR_CAL_AMT_GROSS_LOSS = a8_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA8_CUR_CAL_AMT_RECOVERED() {
		return A8_CUR_CAL_AMT_RECOVERED;
	}

	public void setA8_CUR_CAL_AMT_RECOVERED(BigDecimal a8_CUR_CAL_AMT_RECOVERED) {
		A8_CUR_CAL_AMT_RECOVERED = a8_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA8_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A8_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA8_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a8_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A8_CUR_CAL_AMT_CLAIMED_INSURERS = a8_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA8_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A8_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA8_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a8_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A8_CUR_CAL_AMT_RECOVERED_INSURERS = a8_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA8_CUR_CAL_NET_LOSS() {
		return A8_CUR_CAL_NET_LOSS;
	}

	public void setA8_CUR_CAL_NET_LOSS(BigDecimal a8_CUR_CAL_NET_LOSS) {
		A8_CUR_CAL_NET_LOSS = a8_CUR_CAL_NET_LOSS;
	}

	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}

	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}

	public BigDecimal getA9_NO_OF_EVENTS() {
		return A9_NO_OF_EVENTS;
	}

	public void setA9_NO_OF_EVENTS(BigDecimal a9_NO_OF_EVENTS) {
		A9_NO_OF_EVENTS = a9_NO_OF_EVENTS;
	}

	public BigDecimal getA9_AMOUNT_INVOLVED() {
		return A9_AMOUNT_INVOLVED;
	}

	public void setA9_AMOUNT_INVOLVED(BigDecimal a9_AMOUNT_INVOLVED) {
		A9_AMOUNT_INVOLVED = a9_AMOUNT_INVOLVED;
	}

	public BigDecimal getA9_NO_OF_FUNC_AREA_INVOLVED() {
		return A9_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA9_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a9_NO_OF_FUNC_AREA_INVOLVED) {
		A9_NO_OF_FUNC_AREA_INVOLVED = a9_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA9_AMT_OF_MAX_LOSS() {
		return A9_AMT_OF_MAX_LOSS;
	}

	public void setA9_AMT_OF_MAX_LOSS(BigDecimal a9_AMT_OF_MAX_LOSS) {
		A9_AMT_OF_MAX_LOSS = a9_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA9_AMT_OF_GROSS_LOSS() {
		return A9_AMT_OF_GROSS_LOSS;
	}

	public void setA9_AMT_OF_GROSS_LOSS(BigDecimal a9_AMT_OF_GROSS_LOSS) {
		A9_AMT_OF_GROSS_LOSS = a9_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA9_AMT_RECOVERED() {
		return A9_AMT_RECOVERED;
	}

	public void setA9_AMT_RECOVERED(BigDecimal a9_AMT_RECOVERED) {
		A9_AMT_RECOVERED = a9_AMT_RECOVERED;
	}

	public BigDecimal getA9_AMT_CLAIMED_INSURANCE() {
		return A9_AMT_CLAIMED_INSURANCE;
	}

	public void setA9_AMT_CLAIMED_INSURANCE(BigDecimal a9_AMT_CLAIMED_INSURANCE) {
		A9_AMT_CLAIMED_INSURANCE = a9_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA9_AMT_RECOVERED_INSURANCE() {
		return A9_AMT_RECOVERED_INSURANCE;
	}

	public void setA9_AMT_RECOVERED_INSURANCE(BigDecimal a9_AMT_RECOVERED_INSURANCE) {
		A9_AMT_RECOVERED_INSURANCE = a9_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA9_ACTUAL_NET_LOSS() {
		return A9_ACTUAL_NET_LOSS;
	}

	public void setA9_ACTUAL_NET_LOSS(BigDecimal a9_ACTUAL_NET_LOSS) {
		A9_ACTUAL_NET_LOSS = a9_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA9_TOTAL_NO_ACTUAL_MISS() {
		return A9_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA9_TOTAL_NO_ACTUAL_MISS(BigDecimal a9_TOTAL_NO_ACTUAL_MISS) {
		A9_TOTAL_NO_ACTUAL_MISS = a9_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA9_NO_SIGNIFICANT_EVENTS() {
		return A9_NO_SIGNIFICANT_EVENTS;
	}

	public void setA9_NO_SIGNIFICANT_EVENTS(BigDecimal a9_NO_SIGNIFICANT_EVENTS) {
		A9_NO_SIGNIFICANT_EVENTS = a9_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA9_POTENTIAL_LOSS_TO_THE_BANK() {
		return A9_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA9_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a9_POTENTIAL_LOSS_TO_THE_BANK) {
		A9_POTENTIAL_LOSS_TO_THE_BANK = a9_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA9_ACTUAL_LOSS_TO_THE_BANK() {
		return A9_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA9_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a9_ACTUAL_LOSS_TO_THE_BANK) {
		A9_ACTUAL_LOSS_TO_THE_BANK = a9_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA9_PREV_CAL_AMT_GROSS_LOSS() {
		return A9_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA9_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a9_PREV_CAL_AMT_GROSS_LOSS) {
		A9_PREV_CAL_AMT_GROSS_LOSS = a9_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA9_PREV_CAL_AMT_RECOVERED() {
		return A9_PREV_CAL_AMT_RECOVERED;
	}

	public void setA9_PREV_CAL_AMT_RECOVERED(BigDecimal a9_PREV_CAL_AMT_RECOVERED) {
		A9_PREV_CAL_AMT_RECOVERED = a9_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA9_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A9_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA9_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a9_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A9_PREV_CAL_AMT_CLAIMED_INSURERS = a9_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA9_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A9_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA9_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a9_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A9_PREV_CAL_AMT_RECOVERED_INSURERS = a9_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA9_PREV_CAL_NET_LOSS() {
		return A9_PREV_CAL_NET_LOSS;
	}

	public void setA9_PREV_CAL_NET_LOSS(BigDecimal a9_PREV_CAL_NET_LOSS) {
		A9_PREV_CAL_NET_LOSS = a9_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA9_CUR_CAL_AMT_GROSS_LOSS() {
		return A9_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA9_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a9_CUR_CAL_AMT_GROSS_LOSS) {
		A9_CUR_CAL_AMT_GROSS_LOSS = a9_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA9_CUR_CAL_AMT_RECOVERED() {
		return A9_CUR_CAL_AMT_RECOVERED;
	}

	public void setA9_CUR_CAL_AMT_RECOVERED(BigDecimal a9_CUR_CAL_AMT_RECOVERED) {
		A9_CUR_CAL_AMT_RECOVERED = a9_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA9_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A9_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA9_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a9_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A9_CUR_CAL_AMT_CLAIMED_INSURERS = a9_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA9_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A9_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA9_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a9_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A9_CUR_CAL_AMT_RECOVERED_INSURERS = a9_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA9_CUR_CAL_NET_LOSS() {
		return A9_CUR_CAL_NET_LOSS;
	}

	public void setA9_CUR_CAL_NET_LOSS(BigDecimal a9_CUR_CAL_NET_LOSS) {
		A9_CUR_CAL_NET_LOSS = a9_CUR_CAL_NET_LOSS;
	}

	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}

	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}

	public BigDecimal getA10_NO_OF_EVENTS() {
		return A10_NO_OF_EVENTS;
	}

	public void setA10_NO_OF_EVENTS(BigDecimal a10_NO_OF_EVENTS) {
		A10_NO_OF_EVENTS = a10_NO_OF_EVENTS;
	}

	public BigDecimal getA10_AMOUNT_INVOLVED() {
		return A10_AMOUNT_INVOLVED;
	}

	public void setA10_AMOUNT_INVOLVED(BigDecimal a10_AMOUNT_INVOLVED) {
		A10_AMOUNT_INVOLVED = a10_AMOUNT_INVOLVED;
	}

	public BigDecimal getA10_NO_OF_FUNC_AREA_INVOLVED() {
		return A10_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA10_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a10_NO_OF_FUNC_AREA_INVOLVED) {
		A10_NO_OF_FUNC_AREA_INVOLVED = a10_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA10_AMT_OF_MAX_LOSS() {
		return A10_AMT_OF_MAX_LOSS;
	}

	public void setA10_AMT_OF_MAX_LOSS(BigDecimal a10_AMT_OF_MAX_LOSS) {
		A10_AMT_OF_MAX_LOSS = a10_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA10_AMT_OF_GROSS_LOSS() {
		return A10_AMT_OF_GROSS_LOSS;
	}

	public void setA10_AMT_OF_GROSS_LOSS(BigDecimal a10_AMT_OF_GROSS_LOSS) {
		A10_AMT_OF_GROSS_LOSS = a10_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA10_AMT_RECOVERED() {
		return A10_AMT_RECOVERED;
	}

	public void setA10_AMT_RECOVERED(BigDecimal a10_AMT_RECOVERED) {
		A10_AMT_RECOVERED = a10_AMT_RECOVERED;
	}

	public BigDecimal getA10_AMT_CLAIMED_INSURANCE() {
		return A10_AMT_CLAIMED_INSURANCE;
	}

	public void setA10_AMT_CLAIMED_INSURANCE(BigDecimal a10_AMT_CLAIMED_INSURANCE) {
		A10_AMT_CLAIMED_INSURANCE = a10_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA10_AMT_RECOVERED_INSURANCE() {
		return A10_AMT_RECOVERED_INSURANCE;
	}

	public void setA10_AMT_RECOVERED_INSURANCE(BigDecimal a10_AMT_RECOVERED_INSURANCE) {
		A10_AMT_RECOVERED_INSURANCE = a10_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA10_ACTUAL_NET_LOSS() {
		return A10_ACTUAL_NET_LOSS;
	}

	public void setA10_ACTUAL_NET_LOSS(BigDecimal a10_ACTUAL_NET_LOSS) {
		A10_ACTUAL_NET_LOSS = a10_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA10_TOTAL_NO_ACTUAL_MISS() {
		return A10_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA10_TOTAL_NO_ACTUAL_MISS(BigDecimal a10_TOTAL_NO_ACTUAL_MISS) {
		A10_TOTAL_NO_ACTUAL_MISS = a10_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA10_NO_SIGNIFICANT_EVENTS() {
		return A10_NO_SIGNIFICANT_EVENTS;
	}

	public void setA10_NO_SIGNIFICANT_EVENTS(BigDecimal a10_NO_SIGNIFICANT_EVENTS) {
		A10_NO_SIGNIFICANT_EVENTS = a10_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA10_POTENTIAL_LOSS_TO_THE_BANK() {
		return A10_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA10_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a10_POTENTIAL_LOSS_TO_THE_BANK) {
		A10_POTENTIAL_LOSS_TO_THE_BANK = a10_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA10_ACTUAL_LOSS_TO_THE_BANK() {
		return A10_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA10_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a10_ACTUAL_LOSS_TO_THE_BANK) {
		A10_ACTUAL_LOSS_TO_THE_BANK = a10_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA10_PREV_CAL_AMT_GROSS_LOSS() {
		return A10_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA10_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a10_PREV_CAL_AMT_GROSS_LOSS) {
		A10_PREV_CAL_AMT_GROSS_LOSS = a10_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA10_PREV_CAL_AMT_RECOVERED() {
		return A10_PREV_CAL_AMT_RECOVERED;
	}

	public void setA10_PREV_CAL_AMT_RECOVERED(BigDecimal a10_PREV_CAL_AMT_RECOVERED) {
		A10_PREV_CAL_AMT_RECOVERED = a10_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA10_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A10_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA10_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a10_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A10_PREV_CAL_AMT_CLAIMED_INSURERS = a10_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA10_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A10_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA10_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a10_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A10_PREV_CAL_AMT_RECOVERED_INSURERS = a10_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA10_PREV_CAL_NET_LOSS() {
		return A10_PREV_CAL_NET_LOSS;
	}

	public void setA10_PREV_CAL_NET_LOSS(BigDecimal a10_PREV_CAL_NET_LOSS) {
		A10_PREV_CAL_NET_LOSS = a10_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA10_CUR_CAL_AMT_GROSS_LOSS() {
		return A10_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA10_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a10_CUR_CAL_AMT_GROSS_LOSS) {
		A10_CUR_CAL_AMT_GROSS_LOSS = a10_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA10_CUR_CAL_AMT_RECOVERED() {
		return A10_CUR_CAL_AMT_RECOVERED;
	}

	public void setA10_CUR_CAL_AMT_RECOVERED(BigDecimal a10_CUR_CAL_AMT_RECOVERED) {
		A10_CUR_CAL_AMT_RECOVERED = a10_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA10_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A10_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA10_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a10_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A10_CUR_CAL_AMT_CLAIMED_INSURERS = a10_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA10_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A10_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA10_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a10_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A10_CUR_CAL_AMT_RECOVERED_INSURERS = a10_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA10_CUR_CAL_NET_LOSS() {
		return A10_CUR_CAL_NET_LOSS;
	}

	public void setA10_CUR_CAL_NET_LOSS(BigDecimal a10_CUR_CAL_NET_LOSS) {
		A10_CUR_CAL_NET_LOSS = a10_CUR_CAL_NET_LOSS;
	}

	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}

	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}

	public BigDecimal getA11_NO_OF_EVENTS() {
		return A11_NO_OF_EVENTS;
	}

	public void setA11_NO_OF_EVENTS(BigDecimal a11_NO_OF_EVENTS) {
		A11_NO_OF_EVENTS = a11_NO_OF_EVENTS;
	}

	public BigDecimal getA11_AMOUNT_INVOLVED() {
		return A11_AMOUNT_INVOLVED;
	}

	public void setA11_AMOUNT_INVOLVED(BigDecimal a11_AMOUNT_INVOLVED) {
		A11_AMOUNT_INVOLVED = a11_AMOUNT_INVOLVED;
	}

	public BigDecimal getA11_NO_OF_FUNC_AREA_INVOLVED() {
		return A11_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA11_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a11_NO_OF_FUNC_AREA_INVOLVED) {
		A11_NO_OF_FUNC_AREA_INVOLVED = a11_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA11_AMT_OF_MAX_LOSS() {
		return A11_AMT_OF_MAX_LOSS;
	}

	public void setA11_AMT_OF_MAX_LOSS(BigDecimal a11_AMT_OF_MAX_LOSS) {
		A11_AMT_OF_MAX_LOSS = a11_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA11_AMT_OF_GROSS_LOSS() {
		return A11_AMT_OF_GROSS_LOSS;
	}

	public void setA11_AMT_OF_GROSS_LOSS(BigDecimal a11_AMT_OF_GROSS_LOSS) {
		A11_AMT_OF_GROSS_LOSS = a11_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA11_AMT_RECOVERED() {
		return A11_AMT_RECOVERED;
	}

	public void setA11_AMT_RECOVERED(BigDecimal a11_AMT_RECOVERED) {
		A11_AMT_RECOVERED = a11_AMT_RECOVERED;
	}

	public BigDecimal getA11_AMT_CLAIMED_INSURANCE() {
		return A11_AMT_CLAIMED_INSURANCE;
	}

	public void setA11_AMT_CLAIMED_INSURANCE(BigDecimal a11_AMT_CLAIMED_INSURANCE) {
		A11_AMT_CLAIMED_INSURANCE = a11_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA11_AMT_RECOVERED_INSURANCE() {
		return A11_AMT_RECOVERED_INSURANCE;
	}

	public void setA11_AMT_RECOVERED_INSURANCE(BigDecimal a11_AMT_RECOVERED_INSURANCE) {
		A11_AMT_RECOVERED_INSURANCE = a11_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA11_ACTUAL_NET_LOSS() {
		return A11_ACTUAL_NET_LOSS;
	}

	public void setA11_ACTUAL_NET_LOSS(BigDecimal a11_ACTUAL_NET_LOSS) {
		A11_ACTUAL_NET_LOSS = a11_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA11_TOTAL_NO_ACTUAL_MISS() {
		return A11_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA11_TOTAL_NO_ACTUAL_MISS(BigDecimal a11_TOTAL_NO_ACTUAL_MISS) {
		A11_TOTAL_NO_ACTUAL_MISS = a11_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA11_NO_SIGNIFICANT_EVENTS() {
		return A11_NO_SIGNIFICANT_EVENTS;
	}

	public void setA11_NO_SIGNIFICANT_EVENTS(BigDecimal a11_NO_SIGNIFICANT_EVENTS) {
		A11_NO_SIGNIFICANT_EVENTS = a11_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA11_POTENTIAL_LOSS_TO_THE_BANK() {
		return A11_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA11_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a11_POTENTIAL_LOSS_TO_THE_BANK) {
		A11_POTENTIAL_LOSS_TO_THE_BANK = a11_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA11_ACTUAL_LOSS_TO_THE_BANK() {
		return A11_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA11_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a11_ACTUAL_LOSS_TO_THE_BANK) {
		A11_ACTUAL_LOSS_TO_THE_BANK = a11_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA11_PREV_CAL_AMT_GROSS_LOSS() {
		return A11_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA11_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a11_PREV_CAL_AMT_GROSS_LOSS) {
		A11_PREV_CAL_AMT_GROSS_LOSS = a11_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA11_PREV_CAL_AMT_RECOVERED() {
		return A11_PREV_CAL_AMT_RECOVERED;
	}

	public void setA11_PREV_CAL_AMT_RECOVERED(BigDecimal a11_PREV_CAL_AMT_RECOVERED) {
		A11_PREV_CAL_AMT_RECOVERED = a11_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA11_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A11_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA11_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a11_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A11_PREV_CAL_AMT_CLAIMED_INSURERS = a11_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA11_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A11_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA11_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a11_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A11_PREV_CAL_AMT_RECOVERED_INSURERS = a11_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA11_PREV_CAL_NET_LOSS() {
		return A11_PREV_CAL_NET_LOSS;
	}

	public void setA11_PREV_CAL_NET_LOSS(BigDecimal a11_PREV_CAL_NET_LOSS) {
		A11_PREV_CAL_NET_LOSS = a11_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA11_CUR_CAL_AMT_GROSS_LOSS() {
		return A11_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA11_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a11_CUR_CAL_AMT_GROSS_LOSS) {
		A11_CUR_CAL_AMT_GROSS_LOSS = a11_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA11_CUR_CAL_AMT_RECOVERED() {
		return A11_CUR_CAL_AMT_RECOVERED;
	}

	public void setA11_CUR_CAL_AMT_RECOVERED(BigDecimal a11_CUR_CAL_AMT_RECOVERED) {
		A11_CUR_CAL_AMT_RECOVERED = a11_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA11_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A11_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA11_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a11_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A11_CUR_CAL_AMT_CLAIMED_INSURERS = a11_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA11_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A11_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA11_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a11_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A11_CUR_CAL_AMT_RECOVERED_INSURERS = a11_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA11_CUR_CAL_NET_LOSS() {
		return A11_CUR_CAL_NET_LOSS;
	}

	public void setA11_CUR_CAL_NET_LOSS(BigDecimal a11_CUR_CAL_NET_LOSS) {
		A11_CUR_CAL_NET_LOSS = a11_CUR_CAL_NET_LOSS;
	}

	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}

	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}

	public BigDecimal getA12_NO_OF_EVENTS() {
		return A12_NO_OF_EVENTS;
	}

	public void setA12_NO_OF_EVENTS(BigDecimal a12_NO_OF_EVENTS) {
		A12_NO_OF_EVENTS = a12_NO_OF_EVENTS;
	}

	public BigDecimal getA12_AMOUNT_INVOLVED() {
		return A12_AMOUNT_INVOLVED;
	}

	public void setA12_AMOUNT_INVOLVED(BigDecimal a12_AMOUNT_INVOLVED) {
		A12_AMOUNT_INVOLVED = a12_AMOUNT_INVOLVED;
	}

	public BigDecimal getA12_NO_OF_FUNC_AREA_INVOLVED() {
		return A12_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA12_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a12_NO_OF_FUNC_AREA_INVOLVED) {
		A12_NO_OF_FUNC_AREA_INVOLVED = a12_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA12_AMT_OF_MAX_LOSS() {
		return A12_AMT_OF_MAX_LOSS;
	}

	public void setA12_AMT_OF_MAX_LOSS(BigDecimal a12_AMT_OF_MAX_LOSS) {
		A12_AMT_OF_MAX_LOSS = a12_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA12_AMT_OF_GROSS_LOSS() {
		return A12_AMT_OF_GROSS_LOSS;
	}

	public void setA12_AMT_OF_GROSS_LOSS(BigDecimal a12_AMT_OF_GROSS_LOSS) {
		A12_AMT_OF_GROSS_LOSS = a12_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA12_AMT_RECOVERED() {
		return A12_AMT_RECOVERED;
	}

	public void setA12_AMT_RECOVERED(BigDecimal a12_AMT_RECOVERED) {
		A12_AMT_RECOVERED = a12_AMT_RECOVERED;
	}

	public BigDecimal getA12_AMT_CLAIMED_INSURANCE() {
		return A12_AMT_CLAIMED_INSURANCE;
	}

	public void setA12_AMT_CLAIMED_INSURANCE(BigDecimal a12_AMT_CLAIMED_INSURANCE) {
		A12_AMT_CLAIMED_INSURANCE = a12_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA12_AMT_RECOVERED_INSURANCE() {
		return A12_AMT_RECOVERED_INSURANCE;
	}

	public void setA12_AMT_RECOVERED_INSURANCE(BigDecimal a12_AMT_RECOVERED_INSURANCE) {
		A12_AMT_RECOVERED_INSURANCE = a12_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA12_ACTUAL_NET_LOSS() {
		return A12_ACTUAL_NET_LOSS;
	}

	public void setA12_ACTUAL_NET_LOSS(BigDecimal a12_ACTUAL_NET_LOSS) {
		A12_ACTUAL_NET_LOSS = a12_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA12_TOTAL_NO_ACTUAL_MISS() {
		return A12_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA12_TOTAL_NO_ACTUAL_MISS(BigDecimal a12_TOTAL_NO_ACTUAL_MISS) {
		A12_TOTAL_NO_ACTUAL_MISS = a12_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA12_NO_SIGNIFICANT_EVENTS() {
		return A12_NO_SIGNIFICANT_EVENTS;
	}

	public void setA12_NO_SIGNIFICANT_EVENTS(BigDecimal a12_NO_SIGNIFICANT_EVENTS) {
		A12_NO_SIGNIFICANT_EVENTS = a12_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA12_POTENTIAL_LOSS_TO_THE_BANK() {
		return A12_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA12_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a12_POTENTIAL_LOSS_TO_THE_BANK) {
		A12_POTENTIAL_LOSS_TO_THE_BANK = a12_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA12_ACTUAL_LOSS_TO_THE_BANK() {
		return A12_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA12_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a12_ACTUAL_LOSS_TO_THE_BANK) {
		A12_ACTUAL_LOSS_TO_THE_BANK = a12_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA12_PREV_CAL_AMT_GROSS_LOSS() {
		return A12_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA12_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a12_PREV_CAL_AMT_GROSS_LOSS) {
		A12_PREV_CAL_AMT_GROSS_LOSS = a12_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA12_PREV_CAL_AMT_RECOVERED() {
		return A12_PREV_CAL_AMT_RECOVERED;
	}

	public void setA12_PREV_CAL_AMT_RECOVERED(BigDecimal a12_PREV_CAL_AMT_RECOVERED) {
		A12_PREV_CAL_AMT_RECOVERED = a12_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA12_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A12_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA12_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a12_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A12_PREV_CAL_AMT_CLAIMED_INSURERS = a12_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA12_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A12_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA12_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a12_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A12_PREV_CAL_AMT_RECOVERED_INSURERS = a12_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA12_PREV_CAL_NET_LOSS() {
		return A12_PREV_CAL_NET_LOSS;
	}

	public void setA12_PREV_CAL_NET_LOSS(BigDecimal a12_PREV_CAL_NET_LOSS) {
		A12_PREV_CAL_NET_LOSS = a12_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA12_CUR_CAL_AMT_GROSS_LOSS() {
		return A12_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA12_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a12_CUR_CAL_AMT_GROSS_LOSS) {
		A12_CUR_CAL_AMT_GROSS_LOSS = a12_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA12_CUR_CAL_AMT_RECOVERED() {
		return A12_CUR_CAL_AMT_RECOVERED;
	}

	public void setA12_CUR_CAL_AMT_RECOVERED(BigDecimal a12_CUR_CAL_AMT_RECOVERED) {
		A12_CUR_CAL_AMT_RECOVERED = a12_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA12_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A12_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA12_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a12_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A12_CUR_CAL_AMT_CLAIMED_INSURERS = a12_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA12_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A12_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA12_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a12_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A12_CUR_CAL_AMT_RECOVERED_INSURERS = a12_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA12_CUR_CAL_NET_LOSS() {
		return A12_CUR_CAL_NET_LOSS;
	}

	public void setA12_CUR_CAL_NET_LOSS(BigDecimal a12_CUR_CAL_NET_LOSS) {
		A12_CUR_CAL_NET_LOSS = a12_CUR_CAL_NET_LOSS;
	}

	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}

	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}

	public BigDecimal getA13_NO_OF_EVENTS() {
		return A13_NO_OF_EVENTS;
	}

	public void setA13_NO_OF_EVENTS(BigDecimal a13_NO_OF_EVENTS) {
		A13_NO_OF_EVENTS = a13_NO_OF_EVENTS;
	}

	public BigDecimal getA13_AMOUNT_INVOLVED() {
		return A13_AMOUNT_INVOLVED;
	}

	public void setA13_AMOUNT_INVOLVED(BigDecimal a13_AMOUNT_INVOLVED) {
		A13_AMOUNT_INVOLVED = a13_AMOUNT_INVOLVED;
	}

	public BigDecimal getA13_NO_OF_FUNC_AREA_INVOLVED() {
		return A13_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA13_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a13_NO_OF_FUNC_AREA_INVOLVED) {
		A13_NO_OF_FUNC_AREA_INVOLVED = a13_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA13_AMT_OF_MAX_LOSS() {
		return A13_AMT_OF_MAX_LOSS;
	}

	public void setA13_AMT_OF_MAX_LOSS(BigDecimal a13_AMT_OF_MAX_LOSS) {
		A13_AMT_OF_MAX_LOSS = a13_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA13_AMT_OF_GROSS_LOSS() {
		return A13_AMT_OF_GROSS_LOSS;
	}

	public void setA13_AMT_OF_GROSS_LOSS(BigDecimal a13_AMT_OF_GROSS_LOSS) {
		A13_AMT_OF_GROSS_LOSS = a13_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA13_AMT_RECOVERED() {
		return A13_AMT_RECOVERED;
	}

	public void setA13_AMT_RECOVERED(BigDecimal a13_AMT_RECOVERED) {
		A13_AMT_RECOVERED = a13_AMT_RECOVERED;
	}

	public BigDecimal getA13_AMT_CLAIMED_INSURANCE() {
		return A13_AMT_CLAIMED_INSURANCE;
	}

	public void setA13_AMT_CLAIMED_INSURANCE(BigDecimal a13_AMT_CLAIMED_INSURANCE) {
		A13_AMT_CLAIMED_INSURANCE = a13_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA13_AMT_RECOVERED_INSURANCE() {
		return A13_AMT_RECOVERED_INSURANCE;
	}

	public void setA13_AMT_RECOVERED_INSURANCE(BigDecimal a13_AMT_RECOVERED_INSURANCE) {
		A13_AMT_RECOVERED_INSURANCE = a13_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA13_ACTUAL_NET_LOSS() {
		return A13_ACTUAL_NET_LOSS;
	}

	public void setA13_ACTUAL_NET_LOSS(BigDecimal a13_ACTUAL_NET_LOSS) {
		A13_ACTUAL_NET_LOSS = a13_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA13_TOTAL_NO_ACTUAL_MISS() {
		return A13_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA13_TOTAL_NO_ACTUAL_MISS(BigDecimal a13_TOTAL_NO_ACTUAL_MISS) {
		A13_TOTAL_NO_ACTUAL_MISS = a13_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA13_NO_SIGNIFICANT_EVENTS() {
		return A13_NO_SIGNIFICANT_EVENTS;
	}

	public void setA13_NO_SIGNIFICANT_EVENTS(BigDecimal a13_NO_SIGNIFICANT_EVENTS) {
		A13_NO_SIGNIFICANT_EVENTS = a13_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA13_POTENTIAL_LOSS_TO_THE_BANK() {
		return A13_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA13_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a13_POTENTIAL_LOSS_TO_THE_BANK) {
		A13_POTENTIAL_LOSS_TO_THE_BANK = a13_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA13_ACTUAL_LOSS_TO_THE_BANK() {
		return A13_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA13_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a13_ACTUAL_LOSS_TO_THE_BANK) {
		A13_ACTUAL_LOSS_TO_THE_BANK = a13_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA13_PREV_CAL_AMT_GROSS_LOSS() {
		return A13_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA13_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a13_PREV_CAL_AMT_GROSS_LOSS) {
		A13_PREV_CAL_AMT_GROSS_LOSS = a13_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA13_PREV_CAL_AMT_RECOVERED() {
		return A13_PREV_CAL_AMT_RECOVERED;
	}

	public void setA13_PREV_CAL_AMT_RECOVERED(BigDecimal a13_PREV_CAL_AMT_RECOVERED) {
		A13_PREV_CAL_AMT_RECOVERED = a13_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA13_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A13_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA13_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a13_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A13_PREV_CAL_AMT_CLAIMED_INSURERS = a13_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA13_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A13_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA13_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a13_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A13_PREV_CAL_AMT_RECOVERED_INSURERS = a13_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA13_PREV_CAL_NET_LOSS() {
		return A13_PREV_CAL_NET_LOSS;
	}

	public void setA13_PREV_CAL_NET_LOSS(BigDecimal a13_PREV_CAL_NET_LOSS) {
		A13_PREV_CAL_NET_LOSS = a13_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA13_CUR_CAL_AMT_GROSS_LOSS() {
		return A13_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA13_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a13_CUR_CAL_AMT_GROSS_LOSS) {
		A13_CUR_CAL_AMT_GROSS_LOSS = a13_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA13_CUR_CAL_AMT_RECOVERED() {
		return A13_CUR_CAL_AMT_RECOVERED;
	}

	public void setA13_CUR_CAL_AMT_RECOVERED(BigDecimal a13_CUR_CAL_AMT_RECOVERED) {
		A13_CUR_CAL_AMT_RECOVERED = a13_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA13_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A13_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA13_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a13_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A13_CUR_CAL_AMT_CLAIMED_INSURERS = a13_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA13_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A13_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA13_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a13_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A13_CUR_CAL_AMT_RECOVERED_INSURERS = a13_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA13_CUR_CAL_NET_LOSS() {
		return A13_CUR_CAL_NET_LOSS;
	}

	public void setA13_CUR_CAL_NET_LOSS(BigDecimal a13_CUR_CAL_NET_LOSS) {
		A13_CUR_CAL_NET_LOSS = a13_CUR_CAL_NET_LOSS;
	}

	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}

	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}

	public BigDecimal getA14_NO_OF_EVENTS() {
		return A14_NO_OF_EVENTS;
	}

	public void setA14_NO_OF_EVENTS(BigDecimal a14_NO_OF_EVENTS) {
		A14_NO_OF_EVENTS = a14_NO_OF_EVENTS;
	}

	public BigDecimal getA14_AMOUNT_INVOLVED() {
		return A14_AMOUNT_INVOLVED;
	}

	public void setA14_AMOUNT_INVOLVED(BigDecimal a14_AMOUNT_INVOLVED) {
		A14_AMOUNT_INVOLVED = a14_AMOUNT_INVOLVED;
	}

	public BigDecimal getA14_NO_OF_FUNC_AREA_INVOLVED() {
		return A14_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA14_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a14_NO_OF_FUNC_AREA_INVOLVED) {
		A14_NO_OF_FUNC_AREA_INVOLVED = a14_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA14_AMT_OF_MAX_LOSS() {
		return A14_AMT_OF_MAX_LOSS;
	}

	public void setA14_AMT_OF_MAX_LOSS(BigDecimal a14_AMT_OF_MAX_LOSS) {
		A14_AMT_OF_MAX_LOSS = a14_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA14_AMT_OF_GROSS_LOSS() {
		return A14_AMT_OF_GROSS_LOSS;
	}

	public void setA14_AMT_OF_GROSS_LOSS(BigDecimal a14_AMT_OF_GROSS_LOSS) {
		A14_AMT_OF_GROSS_LOSS = a14_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA14_AMT_RECOVERED() {
		return A14_AMT_RECOVERED;
	}

	public void setA14_AMT_RECOVERED(BigDecimal a14_AMT_RECOVERED) {
		A14_AMT_RECOVERED = a14_AMT_RECOVERED;
	}

	public BigDecimal getA14_AMT_CLAIMED_INSURANCE() {
		return A14_AMT_CLAIMED_INSURANCE;
	}

	public void setA14_AMT_CLAIMED_INSURANCE(BigDecimal a14_AMT_CLAIMED_INSURANCE) {
		A14_AMT_CLAIMED_INSURANCE = a14_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA14_AMT_RECOVERED_INSURANCE() {
		return A14_AMT_RECOVERED_INSURANCE;
	}

	public void setA14_AMT_RECOVERED_INSURANCE(BigDecimal a14_AMT_RECOVERED_INSURANCE) {
		A14_AMT_RECOVERED_INSURANCE = a14_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA14_ACTUAL_NET_LOSS() {
		return A14_ACTUAL_NET_LOSS;
	}

	public void setA14_ACTUAL_NET_LOSS(BigDecimal a14_ACTUAL_NET_LOSS) {
		A14_ACTUAL_NET_LOSS = a14_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA14_TOTAL_NO_ACTUAL_MISS() {
		return A14_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA14_TOTAL_NO_ACTUAL_MISS(BigDecimal a14_TOTAL_NO_ACTUAL_MISS) {
		A14_TOTAL_NO_ACTUAL_MISS = a14_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA14_NO_SIGNIFICANT_EVENTS() {
		return A14_NO_SIGNIFICANT_EVENTS;
	}

	public void setA14_NO_SIGNIFICANT_EVENTS(BigDecimal a14_NO_SIGNIFICANT_EVENTS) {
		A14_NO_SIGNIFICANT_EVENTS = a14_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA14_POTENTIAL_LOSS_TO_THE_BANK() {
		return A14_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA14_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a14_POTENTIAL_LOSS_TO_THE_BANK) {
		A14_POTENTIAL_LOSS_TO_THE_BANK = a14_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA14_ACTUAL_LOSS_TO_THE_BANK() {
		return A14_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA14_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a14_ACTUAL_LOSS_TO_THE_BANK) {
		A14_ACTUAL_LOSS_TO_THE_BANK = a14_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA14_PREV_CAL_AMT_GROSS_LOSS() {
		return A14_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA14_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a14_PREV_CAL_AMT_GROSS_LOSS) {
		A14_PREV_CAL_AMT_GROSS_LOSS = a14_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA14_PREV_CAL_AMT_RECOVERED() {
		return A14_PREV_CAL_AMT_RECOVERED;
	}

	public void setA14_PREV_CAL_AMT_RECOVERED(BigDecimal a14_PREV_CAL_AMT_RECOVERED) {
		A14_PREV_CAL_AMT_RECOVERED = a14_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA14_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A14_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA14_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a14_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A14_PREV_CAL_AMT_CLAIMED_INSURERS = a14_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA14_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A14_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA14_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a14_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A14_PREV_CAL_AMT_RECOVERED_INSURERS = a14_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA14_PREV_CAL_NET_LOSS() {
		return A14_PREV_CAL_NET_LOSS;
	}

	public void setA14_PREV_CAL_NET_LOSS(BigDecimal a14_PREV_CAL_NET_LOSS) {
		A14_PREV_CAL_NET_LOSS = a14_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA14_CUR_CAL_AMT_GROSS_LOSS() {
		return A14_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA14_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a14_CUR_CAL_AMT_GROSS_LOSS) {
		A14_CUR_CAL_AMT_GROSS_LOSS = a14_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA14_CUR_CAL_AMT_RECOVERED() {
		return A14_CUR_CAL_AMT_RECOVERED;
	}

	public void setA14_CUR_CAL_AMT_RECOVERED(BigDecimal a14_CUR_CAL_AMT_RECOVERED) {
		A14_CUR_CAL_AMT_RECOVERED = a14_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA14_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A14_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA14_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a14_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A14_CUR_CAL_AMT_CLAIMED_INSURERS = a14_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA14_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A14_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA14_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a14_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A14_CUR_CAL_AMT_RECOVERED_INSURERS = a14_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA14_CUR_CAL_NET_LOSS() {
		return A14_CUR_CAL_NET_LOSS;
	}

	public void setA14_CUR_CAL_NET_LOSS(BigDecimal a14_CUR_CAL_NET_LOSS) {
		A14_CUR_CAL_NET_LOSS = a14_CUR_CAL_NET_LOSS;
	}

	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}

	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}

	public BigDecimal getA15_NO_OF_EVENTS() {
		return A15_NO_OF_EVENTS;
	}

	public void setA15_NO_OF_EVENTS(BigDecimal a15_NO_OF_EVENTS) {
		A15_NO_OF_EVENTS = a15_NO_OF_EVENTS;
	}

	public BigDecimal getA15_AMOUNT_INVOLVED() {
		return A15_AMOUNT_INVOLVED;
	}

	public void setA15_AMOUNT_INVOLVED(BigDecimal a15_AMOUNT_INVOLVED) {
		A15_AMOUNT_INVOLVED = a15_AMOUNT_INVOLVED;
	}

	public BigDecimal getA15_NO_OF_FUNC_AREA_INVOLVED() {
		return A15_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA15_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a15_NO_OF_FUNC_AREA_INVOLVED) {
		A15_NO_OF_FUNC_AREA_INVOLVED = a15_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA15_AMT_OF_MAX_LOSS() {
		return A15_AMT_OF_MAX_LOSS;
	}

	public void setA15_AMT_OF_MAX_LOSS(BigDecimal a15_AMT_OF_MAX_LOSS) {
		A15_AMT_OF_MAX_LOSS = a15_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA15_AMT_OF_GROSS_LOSS() {
		return A15_AMT_OF_GROSS_LOSS;
	}

	public void setA15_AMT_OF_GROSS_LOSS(BigDecimal a15_AMT_OF_GROSS_LOSS) {
		A15_AMT_OF_GROSS_LOSS = a15_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA15_AMT_RECOVERED() {
		return A15_AMT_RECOVERED;
	}

	public void setA15_AMT_RECOVERED(BigDecimal a15_AMT_RECOVERED) {
		A15_AMT_RECOVERED = a15_AMT_RECOVERED;
	}

	public BigDecimal getA15_AMT_CLAIMED_INSURANCE() {
		return A15_AMT_CLAIMED_INSURANCE;
	}

	public void setA15_AMT_CLAIMED_INSURANCE(BigDecimal a15_AMT_CLAIMED_INSURANCE) {
		A15_AMT_CLAIMED_INSURANCE = a15_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA15_AMT_RECOVERED_INSURANCE() {
		return A15_AMT_RECOVERED_INSURANCE;
	}

	public void setA15_AMT_RECOVERED_INSURANCE(BigDecimal a15_AMT_RECOVERED_INSURANCE) {
		A15_AMT_RECOVERED_INSURANCE = a15_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA15_ACTUAL_NET_LOSS() {
		return A15_ACTUAL_NET_LOSS;
	}

	public void setA15_ACTUAL_NET_LOSS(BigDecimal a15_ACTUAL_NET_LOSS) {
		A15_ACTUAL_NET_LOSS = a15_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA15_TOTAL_NO_ACTUAL_MISS() {
		return A15_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA15_TOTAL_NO_ACTUAL_MISS(BigDecimal a15_TOTAL_NO_ACTUAL_MISS) {
		A15_TOTAL_NO_ACTUAL_MISS = a15_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA15_NO_SIGNIFICANT_EVENTS() {
		return A15_NO_SIGNIFICANT_EVENTS;
	}

	public void setA15_NO_SIGNIFICANT_EVENTS(BigDecimal a15_NO_SIGNIFICANT_EVENTS) {
		A15_NO_SIGNIFICANT_EVENTS = a15_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA15_POTENTIAL_LOSS_TO_THE_BANK() {
		return A15_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA15_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a15_POTENTIAL_LOSS_TO_THE_BANK) {
		A15_POTENTIAL_LOSS_TO_THE_BANK = a15_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA15_ACTUAL_LOSS_TO_THE_BANK() {
		return A15_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA15_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a15_ACTUAL_LOSS_TO_THE_BANK) {
		A15_ACTUAL_LOSS_TO_THE_BANK = a15_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA15_PREV_CAL_AMT_GROSS_LOSS() {
		return A15_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA15_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a15_PREV_CAL_AMT_GROSS_LOSS) {
		A15_PREV_CAL_AMT_GROSS_LOSS = a15_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA15_PREV_CAL_AMT_RECOVERED() {
		return A15_PREV_CAL_AMT_RECOVERED;
	}

	public void setA15_PREV_CAL_AMT_RECOVERED(BigDecimal a15_PREV_CAL_AMT_RECOVERED) {
		A15_PREV_CAL_AMT_RECOVERED = a15_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA15_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A15_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA15_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a15_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A15_PREV_CAL_AMT_CLAIMED_INSURERS = a15_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA15_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A15_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA15_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a15_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A15_PREV_CAL_AMT_RECOVERED_INSURERS = a15_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA15_PREV_CAL_NET_LOSS() {
		return A15_PREV_CAL_NET_LOSS;
	}

	public void setA15_PREV_CAL_NET_LOSS(BigDecimal a15_PREV_CAL_NET_LOSS) {
		A15_PREV_CAL_NET_LOSS = a15_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA15_CUR_CAL_AMT_GROSS_LOSS() {
		return A15_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA15_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a15_CUR_CAL_AMT_GROSS_LOSS) {
		A15_CUR_CAL_AMT_GROSS_LOSS = a15_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA15_CUR_CAL_AMT_RECOVERED() {
		return A15_CUR_CAL_AMT_RECOVERED;
	}

	public void setA15_CUR_CAL_AMT_RECOVERED(BigDecimal a15_CUR_CAL_AMT_RECOVERED) {
		A15_CUR_CAL_AMT_RECOVERED = a15_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA15_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A15_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA15_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a15_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A15_CUR_CAL_AMT_CLAIMED_INSURERS = a15_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA15_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A15_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA15_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a15_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A15_CUR_CAL_AMT_RECOVERED_INSURERS = a15_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA15_CUR_CAL_NET_LOSS() {
		return A15_CUR_CAL_NET_LOSS;
	}

	public void setA15_CUR_CAL_NET_LOSS(BigDecimal a15_CUR_CAL_NET_LOSS) {
		A15_CUR_CAL_NET_LOSS = a15_CUR_CAL_NET_LOSS;
	}

	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}

	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}

	public BigDecimal getA16_NO_OF_EVENTS() {
		return A16_NO_OF_EVENTS;
	}

	public void setA16_NO_OF_EVENTS(BigDecimal a16_NO_OF_EVENTS) {
		A16_NO_OF_EVENTS = a16_NO_OF_EVENTS;
	}

	public BigDecimal getA16_AMOUNT_INVOLVED() {
		return A16_AMOUNT_INVOLVED;
	}

	public void setA16_AMOUNT_INVOLVED(BigDecimal a16_AMOUNT_INVOLVED) {
		A16_AMOUNT_INVOLVED = a16_AMOUNT_INVOLVED;
	}

	public BigDecimal getA16_NO_OF_FUNC_AREA_INVOLVED() {
		return A16_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA16_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a16_NO_OF_FUNC_AREA_INVOLVED) {
		A16_NO_OF_FUNC_AREA_INVOLVED = a16_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA16_AMT_OF_MAX_LOSS() {
		return A16_AMT_OF_MAX_LOSS;
	}

	public void setA16_AMT_OF_MAX_LOSS(BigDecimal a16_AMT_OF_MAX_LOSS) {
		A16_AMT_OF_MAX_LOSS = a16_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA16_AMT_OF_GROSS_LOSS() {
		return A16_AMT_OF_GROSS_LOSS;
	}

	public void setA16_AMT_OF_GROSS_LOSS(BigDecimal a16_AMT_OF_GROSS_LOSS) {
		A16_AMT_OF_GROSS_LOSS = a16_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA16_AMT_RECOVERED() {
		return A16_AMT_RECOVERED;
	}

	public void setA16_AMT_RECOVERED(BigDecimal a16_AMT_RECOVERED) {
		A16_AMT_RECOVERED = a16_AMT_RECOVERED;
	}

	public BigDecimal getA16_AMT_CLAIMED_INSURANCE() {
		return A16_AMT_CLAIMED_INSURANCE;
	}

	public void setA16_AMT_CLAIMED_INSURANCE(BigDecimal a16_AMT_CLAIMED_INSURANCE) {
		A16_AMT_CLAIMED_INSURANCE = a16_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA16_AMT_RECOVERED_INSURANCE() {
		return A16_AMT_RECOVERED_INSURANCE;
	}

	public void setA16_AMT_RECOVERED_INSURANCE(BigDecimal a16_AMT_RECOVERED_INSURANCE) {
		A16_AMT_RECOVERED_INSURANCE = a16_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA16_ACTUAL_NET_LOSS() {
		return A16_ACTUAL_NET_LOSS;
	}

	public void setA16_ACTUAL_NET_LOSS(BigDecimal a16_ACTUAL_NET_LOSS) {
		A16_ACTUAL_NET_LOSS = a16_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA16_TOTAL_NO_ACTUAL_MISS() {
		return A16_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA16_TOTAL_NO_ACTUAL_MISS(BigDecimal a16_TOTAL_NO_ACTUAL_MISS) {
		A16_TOTAL_NO_ACTUAL_MISS = a16_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA16_NO_SIGNIFICANT_EVENTS() {
		return A16_NO_SIGNIFICANT_EVENTS;
	}

	public void setA16_NO_SIGNIFICANT_EVENTS(BigDecimal a16_NO_SIGNIFICANT_EVENTS) {
		A16_NO_SIGNIFICANT_EVENTS = a16_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA16_POTENTIAL_LOSS_TO_THE_BANK() {
		return A16_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA16_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a16_POTENTIAL_LOSS_TO_THE_BANK) {
		A16_POTENTIAL_LOSS_TO_THE_BANK = a16_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA16_ACTUAL_LOSS_TO_THE_BANK() {
		return A16_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA16_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a16_ACTUAL_LOSS_TO_THE_BANK) {
		A16_ACTUAL_LOSS_TO_THE_BANK = a16_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA16_PREV_CAL_AMT_GROSS_LOSS() {
		return A16_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA16_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a16_PREV_CAL_AMT_GROSS_LOSS) {
		A16_PREV_CAL_AMT_GROSS_LOSS = a16_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA16_PREV_CAL_AMT_RECOVERED() {
		return A16_PREV_CAL_AMT_RECOVERED;
	}

	public void setA16_PREV_CAL_AMT_RECOVERED(BigDecimal a16_PREV_CAL_AMT_RECOVERED) {
		A16_PREV_CAL_AMT_RECOVERED = a16_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA16_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A16_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA16_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a16_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A16_PREV_CAL_AMT_CLAIMED_INSURERS = a16_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA16_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A16_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA16_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a16_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A16_PREV_CAL_AMT_RECOVERED_INSURERS = a16_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA16_PREV_CAL_NET_LOSS() {
		return A16_PREV_CAL_NET_LOSS;
	}

	public void setA16_PREV_CAL_NET_LOSS(BigDecimal a16_PREV_CAL_NET_LOSS) {
		A16_PREV_CAL_NET_LOSS = a16_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA16_CUR_CAL_AMT_GROSS_LOSS() {
		return A16_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA16_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a16_CUR_CAL_AMT_GROSS_LOSS) {
		A16_CUR_CAL_AMT_GROSS_LOSS = a16_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA16_CUR_CAL_AMT_RECOVERED() {
		return A16_CUR_CAL_AMT_RECOVERED;
	}

	public void setA16_CUR_CAL_AMT_RECOVERED(BigDecimal a16_CUR_CAL_AMT_RECOVERED) {
		A16_CUR_CAL_AMT_RECOVERED = a16_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA16_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A16_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA16_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a16_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A16_CUR_CAL_AMT_CLAIMED_INSURERS = a16_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA16_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A16_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA16_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a16_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A16_CUR_CAL_AMT_RECOVERED_INSURERS = a16_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA16_CUR_CAL_NET_LOSS() {
		return A16_CUR_CAL_NET_LOSS;
	}

	public void setA16_CUR_CAL_NET_LOSS(BigDecimal a16_CUR_CAL_NET_LOSS) {
		A16_CUR_CAL_NET_LOSS = a16_CUR_CAL_NET_LOSS;
	}

	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}

	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}

	public BigDecimal getA17_NO_OF_EVENTS() {
		return A17_NO_OF_EVENTS;
	}

	public void setA17_NO_OF_EVENTS(BigDecimal a17_NO_OF_EVENTS) {
		A17_NO_OF_EVENTS = a17_NO_OF_EVENTS;
	}

	public BigDecimal getA17_AMOUNT_INVOLVED() {
		return A17_AMOUNT_INVOLVED;
	}

	public void setA17_AMOUNT_INVOLVED(BigDecimal a17_AMOUNT_INVOLVED) {
		A17_AMOUNT_INVOLVED = a17_AMOUNT_INVOLVED;
	}

	public BigDecimal getA17_NO_OF_FUNC_AREA_INVOLVED() {
		return A17_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA17_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a17_NO_OF_FUNC_AREA_INVOLVED) {
		A17_NO_OF_FUNC_AREA_INVOLVED = a17_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA17_AMT_OF_MAX_LOSS() {
		return A17_AMT_OF_MAX_LOSS;
	}

	public void setA17_AMT_OF_MAX_LOSS(BigDecimal a17_AMT_OF_MAX_LOSS) {
		A17_AMT_OF_MAX_LOSS = a17_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA17_AMT_OF_GROSS_LOSS() {
		return A17_AMT_OF_GROSS_LOSS;
	}

	public void setA17_AMT_OF_GROSS_LOSS(BigDecimal a17_AMT_OF_GROSS_LOSS) {
		A17_AMT_OF_GROSS_LOSS = a17_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA17_AMT_RECOVERED() {
		return A17_AMT_RECOVERED;
	}

	public void setA17_AMT_RECOVERED(BigDecimal a17_AMT_RECOVERED) {
		A17_AMT_RECOVERED = a17_AMT_RECOVERED;
	}

	public BigDecimal getA17_AMT_CLAIMED_INSURANCE() {
		return A17_AMT_CLAIMED_INSURANCE;
	}

	public void setA17_AMT_CLAIMED_INSURANCE(BigDecimal a17_AMT_CLAIMED_INSURANCE) {
		A17_AMT_CLAIMED_INSURANCE = a17_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA17_AMT_RECOVERED_INSURANCE() {
		return A17_AMT_RECOVERED_INSURANCE;
	}

	public void setA17_AMT_RECOVERED_INSURANCE(BigDecimal a17_AMT_RECOVERED_INSURANCE) {
		A17_AMT_RECOVERED_INSURANCE = a17_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA17_ACTUAL_NET_LOSS() {
		return A17_ACTUAL_NET_LOSS;
	}

	public void setA17_ACTUAL_NET_LOSS(BigDecimal a17_ACTUAL_NET_LOSS) {
		A17_ACTUAL_NET_LOSS = a17_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA17_TOTAL_NO_ACTUAL_MISS() {
		return A17_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA17_TOTAL_NO_ACTUAL_MISS(BigDecimal a17_TOTAL_NO_ACTUAL_MISS) {
		A17_TOTAL_NO_ACTUAL_MISS = a17_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA17_NO_SIGNIFICANT_EVENTS() {
		return A17_NO_SIGNIFICANT_EVENTS;
	}

	public void setA17_NO_SIGNIFICANT_EVENTS(BigDecimal a17_NO_SIGNIFICANT_EVENTS) {
		A17_NO_SIGNIFICANT_EVENTS = a17_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA17_POTENTIAL_LOSS_TO_THE_BANK() {
		return A17_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA17_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a17_POTENTIAL_LOSS_TO_THE_BANK) {
		A17_POTENTIAL_LOSS_TO_THE_BANK = a17_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA17_ACTUAL_LOSS_TO_THE_BANK() {
		return A17_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA17_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a17_ACTUAL_LOSS_TO_THE_BANK) {
		A17_ACTUAL_LOSS_TO_THE_BANK = a17_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA17_PREV_CAL_AMT_GROSS_LOSS() {
		return A17_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA17_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a17_PREV_CAL_AMT_GROSS_LOSS) {
		A17_PREV_CAL_AMT_GROSS_LOSS = a17_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA17_PREV_CAL_AMT_RECOVERED() {
		return A17_PREV_CAL_AMT_RECOVERED;
	}

	public void setA17_PREV_CAL_AMT_RECOVERED(BigDecimal a17_PREV_CAL_AMT_RECOVERED) {
		A17_PREV_CAL_AMT_RECOVERED = a17_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA17_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A17_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA17_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a17_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A17_PREV_CAL_AMT_CLAIMED_INSURERS = a17_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA17_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A17_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA17_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a17_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A17_PREV_CAL_AMT_RECOVERED_INSURERS = a17_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA17_PREV_CAL_NET_LOSS() {
		return A17_PREV_CAL_NET_LOSS;
	}

	public void setA17_PREV_CAL_NET_LOSS(BigDecimal a17_PREV_CAL_NET_LOSS) {
		A17_PREV_CAL_NET_LOSS = a17_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA17_CUR_CAL_AMT_GROSS_LOSS() {
		return A17_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA17_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a17_CUR_CAL_AMT_GROSS_LOSS) {
		A17_CUR_CAL_AMT_GROSS_LOSS = a17_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA17_CUR_CAL_AMT_RECOVERED() {
		return A17_CUR_CAL_AMT_RECOVERED;
	}

	public void setA17_CUR_CAL_AMT_RECOVERED(BigDecimal a17_CUR_CAL_AMT_RECOVERED) {
		A17_CUR_CAL_AMT_RECOVERED = a17_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA17_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A17_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA17_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a17_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A17_CUR_CAL_AMT_CLAIMED_INSURERS = a17_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA17_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A17_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA17_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a17_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A17_CUR_CAL_AMT_RECOVERED_INSURERS = a17_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA17_CUR_CAL_NET_LOSS() {
		return A17_CUR_CAL_NET_LOSS;
	}

	public void setA17_CUR_CAL_NET_LOSS(BigDecimal a17_CUR_CAL_NET_LOSS) {
		A17_CUR_CAL_NET_LOSS = a17_CUR_CAL_NET_LOSS;
	}

	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}

	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}

	public BigDecimal getA18_NO_OF_EVENTS() {
		return A18_NO_OF_EVENTS;
	}

	public void setA18_NO_OF_EVENTS(BigDecimal a18_NO_OF_EVENTS) {
		A18_NO_OF_EVENTS = a18_NO_OF_EVENTS;
	}

	public BigDecimal getA18_AMOUNT_INVOLVED() {
		return A18_AMOUNT_INVOLVED;
	}

	public void setA18_AMOUNT_INVOLVED(BigDecimal a18_AMOUNT_INVOLVED) {
		A18_AMOUNT_INVOLVED = a18_AMOUNT_INVOLVED;
	}

	public BigDecimal getA18_NO_OF_FUNC_AREA_INVOLVED() {
		return A18_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA18_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a18_NO_OF_FUNC_AREA_INVOLVED) {
		A18_NO_OF_FUNC_AREA_INVOLVED = a18_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA18_AMT_OF_MAX_LOSS() {
		return A18_AMT_OF_MAX_LOSS;
	}

	public void setA18_AMT_OF_MAX_LOSS(BigDecimal a18_AMT_OF_MAX_LOSS) {
		A18_AMT_OF_MAX_LOSS = a18_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA18_AMT_OF_GROSS_LOSS() {
		return A18_AMT_OF_GROSS_LOSS;
	}

	public void setA18_AMT_OF_GROSS_LOSS(BigDecimal a18_AMT_OF_GROSS_LOSS) {
		A18_AMT_OF_GROSS_LOSS = a18_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA18_AMT_RECOVERED() {
		return A18_AMT_RECOVERED;
	}

	public void setA18_AMT_RECOVERED(BigDecimal a18_AMT_RECOVERED) {
		A18_AMT_RECOVERED = a18_AMT_RECOVERED;
	}

	public BigDecimal getA18_AMT_CLAIMED_INSURANCE() {
		return A18_AMT_CLAIMED_INSURANCE;
	}

	public void setA18_AMT_CLAIMED_INSURANCE(BigDecimal a18_AMT_CLAIMED_INSURANCE) {
		A18_AMT_CLAIMED_INSURANCE = a18_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA18_AMT_RECOVERED_INSURANCE() {
		return A18_AMT_RECOVERED_INSURANCE;
	}

	public void setA18_AMT_RECOVERED_INSURANCE(BigDecimal a18_AMT_RECOVERED_INSURANCE) {
		A18_AMT_RECOVERED_INSURANCE = a18_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA18_ACTUAL_NET_LOSS() {
		return A18_ACTUAL_NET_LOSS;
	}

	public void setA18_ACTUAL_NET_LOSS(BigDecimal a18_ACTUAL_NET_LOSS) {
		A18_ACTUAL_NET_LOSS = a18_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA18_TOTAL_NO_ACTUAL_MISS() {
		return A18_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA18_TOTAL_NO_ACTUAL_MISS(BigDecimal a18_TOTAL_NO_ACTUAL_MISS) {
		A18_TOTAL_NO_ACTUAL_MISS = a18_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA18_NO_SIGNIFICANT_EVENTS() {
		return A18_NO_SIGNIFICANT_EVENTS;
	}

	public void setA18_NO_SIGNIFICANT_EVENTS(BigDecimal a18_NO_SIGNIFICANT_EVENTS) {
		A18_NO_SIGNIFICANT_EVENTS = a18_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA18_POTENTIAL_LOSS_TO_THE_BANK() {
		return A18_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA18_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a18_POTENTIAL_LOSS_TO_THE_BANK) {
		A18_POTENTIAL_LOSS_TO_THE_BANK = a18_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA18_ACTUAL_LOSS_TO_THE_BANK() {
		return A18_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA18_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a18_ACTUAL_LOSS_TO_THE_BANK) {
		A18_ACTUAL_LOSS_TO_THE_BANK = a18_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA18_PREV_CAL_AMT_GROSS_LOSS() {
		return A18_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA18_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a18_PREV_CAL_AMT_GROSS_LOSS) {
		A18_PREV_CAL_AMT_GROSS_LOSS = a18_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA18_PREV_CAL_AMT_RECOVERED() {
		return A18_PREV_CAL_AMT_RECOVERED;
	}

	public void setA18_PREV_CAL_AMT_RECOVERED(BigDecimal a18_PREV_CAL_AMT_RECOVERED) {
		A18_PREV_CAL_AMT_RECOVERED = a18_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA18_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A18_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA18_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a18_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A18_PREV_CAL_AMT_CLAIMED_INSURERS = a18_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA18_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A18_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA18_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a18_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A18_PREV_CAL_AMT_RECOVERED_INSURERS = a18_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA18_PREV_CAL_NET_LOSS() {
		return A18_PREV_CAL_NET_LOSS;
	}

	public void setA18_PREV_CAL_NET_LOSS(BigDecimal a18_PREV_CAL_NET_LOSS) {
		A18_PREV_CAL_NET_LOSS = a18_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA18_CUR_CAL_AMT_GROSS_LOSS() {
		return A18_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA18_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a18_CUR_CAL_AMT_GROSS_LOSS) {
		A18_CUR_CAL_AMT_GROSS_LOSS = a18_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA18_CUR_CAL_AMT_RECOVERED() {
		return A18_CUR_CAL_AMT_RECOVERED;
	}

	public void setA18_CUR_CAL_AMT_RECOVERED(BigDecimal a18_CUR_CAL_AMT_RECOVERED) {
		A18_CUR_CAL_AMT_RECOVERED = a18_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA18_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A18_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA18_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a18_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A18_CUR_CAL_AMT_CLAIMED_INSURERS = a18_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA18_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A18_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA18_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a18_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A18_CUR_CAL_AMT_RECOVERED_INSURERS = a18_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA18_CUR_CAL_NET_LOSS() {
		return A18_CUR_CAL_NET_LOSS;
	}

	public void setA18_CUR_CAL_NET_LOSS(BigDecimal a18_CUR_CAL_NET_LOSS) {
		A18_CUR_CAL_NET_LOSS = a18_CUR_CAL_NET_LOSS;
	}

	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}

	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}

	public BigDecimal getA19_NO_OF_EVENTS() {
		return A19_NO_OF_EVENTS;
	}

	public void setA19_NO_OF_EVENTS(BigDecimal a19_NO_OF_EVENTS) {
		A19_NO_OF_EVENTS = a19_NO_OF_EVENTS;
	}

	public BigDecimal getA19_AMOUNT_INVOLVED() {
		return A19_AMOUNT_INVOLVED;
	}

	public void setA19_AMOUNT_INVOLVED(BigDecimal a19_AMOUNT_INVOLVED) {
		A19_AMOUNT_INVOLVED = a19_AMOUNT_INVOLVED;
	}

	public BigDecimal getA19_NO_OF_FUNC_AREA_INVOLVED() {
		return A19_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA19_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a19_NO_OF_FUNC_AREA_INVOLVED) {
		A19_NO_OF_FUNC_AREA_INVOLVED = a19_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA19_AMT_OF_MAX_LOSS() {
		return A19_AMT_OF_MAX_LOSS;
	}

	public void setA19_AMT_OF_MAX_LOSS(BigDecimal a19_AMT_OF_MAX_LOSS) {
		A19_AMT_OF_MAX_LOSS = a19_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA19_AMT_OF_GROSS_LOSS() {
		return A19_AMT_OF_GROSS_LOSS;
	}

	public void setA19_AMT_OF_GROSS_LOSS(BigDecimal a19_AMT_OF_GROSS_LOSS) {
		A19_AMT_OF_GROSS_LOSS = a19_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA19_AMT_RECOVERED() {
		return A19_AMT_RECOVERED;
	}

	public void setA19_AMT_RECOVERED(BigDecimal a19_AMT_RECOVERED) {
		A19_AMT_RECOVERED = a19_AMT_RECOVERED;
	}

	public BigDecimal getA19_AMT_CLAIMED_INSURANCE() {
		return A19_AMT_CLAIMED_INSURANCE;
	}

	public void setA19_AMT_CLAIMED_INSURANCE(BigDecimal a19_AMT_CLAIMED_INSURANCE) {
		A19_AMT_CLAIMED_INSURANCE = a19_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA19_AMT_RECOVERED_INSURANCE() {
		return A19_AMT_RECOVERED_INSURANCE;
	}

	public void setA19_AMT_RECOVERED_INSURANCE(BigDecimal a19_AMT_RECOVERED_INSURANCE) {
		A19_AMT_RECOVERED_INSURANCE = a19_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA19_ACTUAL_NET_LOSS() {
		return A19_ACTUAL_NET_LOSS;
	}

	public void setA19_ACTUAL_NET_LOSS(BigDecimal a19_ACTUAL_NET_LOSS) {
		A19_ACTUAL_NET_LOSS = a19_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA19_TOTAL_NO_ACTUAL_MISS() {
		return A19_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA19_TOTAL_NO_ACTUAL_MISS(BigDecimal a19_TOTAL_NO_ACTUAL_MISS) {
		A19_TOTAL_NO_ACTUAL_MISS = a19_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA19_NO_SIGNIFICANT_EVENTS() {
		return A19_NO_SIGNIFICANT_EVENTS;
	}

	public void setA19_NO_SIGNIFICANT_EVENTS(BigDecimal a19_NO_SIGNIFICANT_EVENTS) {
		A19_NO_SIGNIFICANT_EVENTS = a19_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA19_POTENTIAL_LOSS_TO_THE_BANK() {
		return A19_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA19_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a19_POTENTIAL_LOSS_TO_THE_BANK) {
		A19_POTENTIAL_LOSS_TO_THE_BANK = a19_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA19_ACTUAL_LOSS_TO_THE_BANK() {
		return A19_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA19_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a19_ACTUAL_LOSS_TO_THE_BANK) {
		A19_ACTUAL_LOSS_TO_THE_BANK = a19_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA19_PREV_CAL_AMT_GROSS_LOSS() {
		return A19_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA19_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a19_PREV_CAL_AMT_GROSS_LOSS) {
		A19_PREV_CAL_AMT_GROSS_LOSS = a19_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA19_PREV_CAL_AMT_RECOVERED() {
		return A19_PREV_CAL_AMT_RECOVERED;
	}

	public void setA19_PREV_CAL_AMT_RECOVERED(BigDecimal a19_PREV_CAL_AMT_RECOVERED) {
		A19_PREV_CAL_AMT_RECOVERED = a19_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA19_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A19_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA19_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a19_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A19_PREV_CAL_AMT_CLAIMED_INSURERS = a19_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA19_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A19_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA19_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a19_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A19_PREV_CAL_AMT_RECOVERED_INSURERS = a19_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA19_PREV_CAL_NET_LOSS() {
		return A19_PREV_CAL_NET_LOSS;
	}

	public void setA19_PREV_CAL_NET_LOSS(BigDecimal a19_PREV_CAL_NET_LOSS) {
		A19_PREV_CAL_NET_LOSS = a19_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA19_CUR_CAL_AMT_GROSS_LOSS() {
		return A19_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA19_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a19_CUR_CAL_AMT_GROSS_LOSS) {
		A19_CUR_CAL_AMT_GROSS_LOSS = a19_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA19_CUR_CAL_AMT_RECOVERED() {
		return A19_CUR_CAL_AMT_RECOVERED;
	}

	public void setA19_CUR_CAL_AMT_RECOVERED(BigDecimal a19_CUR_CAL_AMT_RECOVERED) {
		A19_CUR_CAL_AMT_RECOVERED = a19_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA19_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A19_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA19_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a19_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A19_CUR_CAL_AMT_CLAIMED_INSURERS = a19_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA19_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A19_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA19_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a19_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A19_CUR_CAL_AMT_RECOVERED_INSURERS = a19_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA19_CUR_CAL_NET_LOSS() {
		return A19_CUR_CAL_NET_LOSS;
	}

	public void setA19_CUR_CAL_NET_LOSS(BigDecimal a19_CUR_CAL_NET_LOSS) {
		A19_CUR_CAL_NET_LOSS = a19_CUR_CAL_NET_LOSS;
	}

	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}

	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}

	public BigDecimal getA20_NO_OF_EVENTS() {
		return A20_NO_OF_EVENTS;
	}

	public void setA20_NO_OF_EVENTS(BigDecimal a20_NO_OF_EVENTS) {
		A20_NO_OF_EVENTS = a20_NO_OF_EVENTS;
	}

	public BigDecimal getA20_AMOUNT_INVOLVED() {
		return A20_AMOUNT_INVOLVED;
	}

	public void setA20_AMOUNT_INVOLVED(BigDecimal a20_AMOUNT_INVOLVED) {
		A20_AMOUNT_INVOLVED = a20_AMOUNT_INVOLVED;
	}

	public BigDecimal getA20_NO_OF_FUNC_AREA_INVOLVED() {
		return A20_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA20_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a20_NO_OF_FUNC_AREA_INVOLVED) {
		A20_NO_OF_FUNC_AREA_INVOLVED = a20_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA20_AMT_OF_MAX_LOSS() {
		return A20_AMT_OF_MAX_LOSS;
	}

	public void setA20_AMT_OF_MAX_LOSS(BigDecimal a20_AMT_OF_MAX_LOSS) {
		A20_AMT_OF_MAX_LOSS = a20_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA20_AMT_OF_GROSS_LOSS() {
		return A20_AMT_OF_GROSS_LOSS;
	}

	public void setA20_AMT_OF_GROSS_LOSS(BigDecimal a20_AMT_OF_GROSS_LOSS) {
		A20_AMT_OF_GROSS_LOSS = a20_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA20_AMT_RECOVERED() {
		return A20_AMT_RECOVERED;
	}

	public void setA20_AMT_RECOVERED(BigDecimal a20_AMT_RECOVERED) {
		A20_AMT_RECOVERED = a20_AMT_RECOVERED;
	}

	public BigDecimal getA20_AMT_CLAIMED_INSURANCE() {
		return A20_AMT_CLAIMED_INSURANCE;
	}

	public void setA20_AMT_CLAIMED_INSURANCE(BigDecimal a20_AMT_CLAIMED_INSURANCE) {
		A20_AMT_CLAIMED_INSURANCE = a20_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA20_AMT_RECOVERED_INSURANCE() {
		return A20_AMT_RECOVERED_INSURANCE;
	}

	public void setA20_AMT_RECOVERED_INSURANCE(BigDecimal a20_AMT_RECOVERED_INSURANCE) {
		A20_AMT_RECOVERED_INSURANCE = a20_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA20_ACTUAL_NET_LOSS() {
		return A20_ACTUAL_NET_LOSS;
	}

	public void setA20_ACTUAL_NET_LOSS(BigDecimal a20_ACTUAL_NET_LOSS) {
		A20_ACTUAL_NET_LOSS = a20_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA20_TOTAL_NO_ACTUAL_MISS() {
		return A20_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA20_TOTAL_NO_ACTUAL_MISS(BigDecimal a20_TOTAL_NO_ACTUAL_MISS) {
		A20_TOTAL_NO_ACTUAL_MISS = a20_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA20_NO_SIGNIFICANT_EVENTS() {
		return A20_NO_SIGNIFICANT_EVENTS;
	}

	public void setA20_NO_SIGNIFICANT_EVENTS(BigDecimal a20_NO_SIGNIFICANT_EVENTS) {
		A20_NO_SIGNIFICANT_EVENTS = a20_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA20_POTENTIAL_LOSS_TO_THE_BANK() {
		return A20_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA20_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a20_POTENTIAL_LOSS_TO_THE_BANK) {
		A20_POTENTIAL_LOSS_TO_THE_BANK = a20_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA20_ACTUAL_LOSS_TO_THE_BANK() {
		return A20_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA20_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a20_ACTUAL_LOSS_TO_THE_BANK) {
		A20_ACTUAL_LOSS_TO_THE_BANK = a20_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA20_PREV_CAL_AMT_GROSS_LOSS() {
		return A20_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA20_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a20_PREV_CAL_AMT_GROSS_LOSS) {
		A20_PREV_CAL_AMT_GROSS_LOSS = a20_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA20_PREV_CAL_AMT_RECOVERED() {
		return A20_PREV_CAL_AMT_RECOVERED;
	}

	public void setA20_PREV_CAL_AMT_RECOVERED(BigDecimal a20_PREV_CAL_AMT_RECOVERED) {
		A20_PREV_CAL_AMT_RECOVERED = a20_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA20_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A20_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA20_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a20_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A20_PREV_CAL_AMT_CLAIMED_INSURERS = a20_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA20_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A20_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA20_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a20_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A20_PREV_CAL_AMT_RECOVERED_INSURERS = a20_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA20_PREV_CAL_NET_LOSS() {
		return A20_PREV_CAL_NET_LOSS;
	}

	public void setA20_PREV_CAL_NET_LOSS(BigDecimal a20_PREV_CAL_NET_LOSS) {
		A20_PREV_CAL_NET_LOSS = a20_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA20_CUR_CAL_AMT_GROSS_LOSS() {
		return A20_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA20_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a20_CUR_CAL_AMT_GROSS_LOSS) {
		A20_CUR_CAL_AMT_GROSS_LOSS = a20_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA20_CUR_CAL_AMT_RECOVERED() {
		return A20_CUR_CAL_AMT_RECOVERED;
	}

	public void setA20_CUR_CAL_AMT_RECOVERED(BigDecimal a20_CUR_CAL_AMT_RECOVERED) {
		A20_CUR_CAL_AMT_RECOVERED = a20_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA20_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A20_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA20_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a20_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A20_CUR_CAL_AMT_CLAIMED_INSURERS = a20_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA20_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A20_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA20_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a20_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A20_CUR_CAL_AMT_RECOVERED_INSURERS = a20_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA20_CUR_CAL_NET_LOSS() {
		return A20_CUR_CAL_NET_LOSS;
	}

	public void setA20_CUR_CAL_NET_LOSS(BigDecimal a20_CUR_CAL_NET_LOSS) {
		A20_CUR_CAL_NET_LOSS = a20_CUR_CAL_NET_LOSS;
	}

	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}

	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}

	public String getA22_PRODUCT() {
		return A22_PRODUCT;
	}

	public void setA22_PRODUCT(String a22_PRODUCT) {
		A22_PRODUCT = a22_PRODUCT;
	}

	public BigDecimal getA22_NO_OF_EVENTS() {
		return A22_NO_OF_EVENTS;
	}

	public void setA22_NO_OF_EVENTS(BigDecimal a22_NO_OF_EVENTS) {
		A22_NO_OF_EVENTS = a22_NO_OF_EVENTS;
	}

	public BigDecimal getA22_AMOUNT_INVOLVED() {
		return A22_AMOUNT_INVOLVED;
	}

	public void setA22_AMOUNT_INVOLVED(BigDecimal a22_AMOUNT_INVOLVED) {
		A22_AMOUNT_INVOLVED = a22_AMOUNT_INVOLVED;
	}

	public BigDecimal getA22_NO_OF_FUNC_AREA_INVOLVED() {
		return A22_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA22_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a22_NO_OF_FUNC_AREA_INVOLVED) {
		A22_NO_OF_FUNC_AREA_INVOLVED = a22_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA22_AMT_OF_MAX_LOSS() {
		return A22_AMT_OF_MAX_LOSS;
	}

	public void setA22_AMT_OF_MAX_LOSS(BigDecimal a22_AMT_OF_MAX_LOSS) {
		A22_AMT_OF_MAX_LOSS = a22_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA22_AMT_OF_GROSS_LOSS() {
		return A22_AMT_OF_GROSS_LOSS;
	}

	public void setA22_AMT_OF_GROSS_LOSS(BigDecimal a22_AMT_OF_GROSS_LOSS) {
		A22_AMT_OF_GROSS_LOSS = a22_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA22_AMT_RECOVERED() {
		return A22_AMT_RECOVERED;
	}

	public void setA22_AMT_RECOVERED(BigDecimal a22_AMT_RECOVERED) {
		A22_AMT_RECOVERED = a22_AMT_RECOVERED;
	}

	public BigDecimal getA22_AMT_CLAIMED_INSURANCE() {
		return A22_AMT_CLAIMED_INSURANCE;
	}

	public void setA22_AMT_CLAIMED_INSURANCE(BigDecimal a22_AMT_CLAIMED_INSURANCE) {
		A22_AMT_CLAIMED_INSURANCE = a22_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA22_AMT_RECOVERED_INSURANCE() {
		return A22_AMT_RECOVERED_INSURANCE;
	}

	public void setA22_AMT_RECOVERED_INSURANCE(BigDecimal a22_AMT_RECOVERED_INSURANCE) {
		A22_AMT_RECOVERED_INSURANCE = a22_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA22_ACTUAL_NET_LOSS() {
		return A22_ACTUAL_NET_LOSS;
	}

	public void setA22_ACTUAL_NET_LOSS(BigDecimal a22_ACTUAL_NET_LOSS) {
		A22_ACTUAL_NET_LOSS = a22_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA22_TOTAL_NO_ACTUAL_MISS() {
		return A22_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA22_TOTAL_NO_ACTUAL_MISS(BigDecimal a22_TOTAL_NO_ACTUAL_MISS) {
		A22_TOTAL_NO_ACTUAL_MISS = a22_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA22_NO_SIGNIFICANT_EVENTS() {
		return A22_NO_SIGNIFICANT_EVENTS;
	}

	public void setA22_NO_SIGNIFICANT_EVENTS(BigDecimal a22_NO_SIGNIFICANT_EVENTS) {
		A22_NO_SIGNIFICANT_EVENTS = a22_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA22_POTENTIAL_LOSS_TO_THE_BANK() {
		return A22_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA22_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a22_POTENTIAL_LOSS_TO_THE_BANK) {
		A22_POTENTIAL_LOSS_TO_THE_BANK = a22_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA22_ACTUAL_LOSS_TO_THE_BANK() {
		return A22_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA22_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a22_ACTUAL_LOSS_TO_THE_BANK) {
		A22_ACTUAL_LOSS_TO_THE_BANK = a22_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA22_PREV_CAL_AMT_GROSS_LOSS() {
		return A22_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA22_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a22_PREV_CAL_AMT_GROSS_LOSS) {
		A22_PREV_CAL_AMT_GROSS_LOSS = a22_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA22_PREV_CAL_AMT_RECOVERED() {
		return A22_PREV_CAL_AMT_RECOVERED;
	}

	public void setA22_PREV_CAL_AMT_RECOVERED(BigDecimal a22_PREV_CAL_AMT_RECOVERED) {
		A22_PREV_CAL_AMT_RECOVERED = a22_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA22_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A22_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA22_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a22_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A22_PREV_CAL_AMT_CLAIMED_INSURERS = a22_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA22_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A22_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA22_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a22_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A22_PREV_CAL_AMT_RECOVERED_INSURERS = a22_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA22_PREV_CAL_NET_LOSS() {
		return A22_PREV_CAL_NET_LOSS;
	}

	public void setA22_PREV_CAL_NET_LOSS(BigDecimal a22_PREV_CAL_NET_LOSS) {
		A22_PREV_CAL_NET_LOSS = a22_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA22_CUR_CAL_AMT_GROSS_LOSS() {
		return A22_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA22_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a22_CUR_CAL_AMT_GROSS_LOSS) {
		A22_CUR_CAL_AMT_GROSS_LOSS = a22_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA22_CUR_CAL_AMT_RECOVERED() {
		return A22_CUR_CAL_AMT_RECOVERED;
	}

	public void setA22_CUR_CAL_AMT_RECOVERED(BigDecimal a22_CUR_CAL_AMT_RECOVERED) {
		A22_CUR_CAL_AMT_RECOVERED = a22_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA22_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A22_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA22_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a22_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A22_CUR_CAL_AMT_CLAIMED_INSURERS = a22_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA22_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A22_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA22_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a22_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A22_CUR_CAL_AMT_RECOVERED_INSURERS = a22_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA22_CUR_CAL_NET_LOSS() {
		return A22_CUR_CAL_NET_LOSS;
	}

	public void setA22_CUR_CAL_NET_LOSS(BigDecimal a22_CUR_CAL_NET_LOSS) {
		A22_CUR_CAL_NET_LOSS = a22_CUR_CAL_NET_LOSS;
	}

	public String getA23_PRODUCT() {
		return A23_PRODUCT;
	}

	public void setA23_PRODUCT(String a23_PRODUCT) {
		A23_PRODUCT = a23_PRODUCT;
	}

	public BigDecimal getA23_NO_OF_EVENTS() {
		return A23_NO_OF_EVENTS;
	}

	public void setA23_NO_OF_EVENTS(BigDecimal a23_NO_OF_EVENTS) {
		A23_NO_OF_EVENTS = a23_NO_OF_EVENTS;
	}

	public BigDecimal getA23_AMOUNT_INVOLVED() {
		return A23_AMOUNT_INVOLVED;
	}

	public void setA23_AMOUNT_INVOLVED(BigDecimal a23_AMOUNT_INVOLVED) {
		A23_AMOUNT_INVOLVED = a23_AMOUNT_INVOLVED;
	}

	public BigDecimal getA23_NO_OF_FUNC_AREA_INVOLVED() {
		return A23_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA23_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a23_NO_OF_FUNC_AREA_INVOLVED) {
		A23_NO_OF_FUNC_AREA_INVOLVED = a23_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA23_AMT_OF_MAX_LOSS() {
		return A23_AMT_OF_MAX_LOSS;
	}

	public void setA23_AMT_OF_MAX_LOSS(BigDecimal a23_AMT_OF_MAX_LOSS) {
		A23_AMT_OF_MAX_LOSS = a23_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA23_AMT_OF_GROSS_LOSS() {
		return A23_AMT_OF_GROSS_LOSS;
	}

	public void setA23_AMT_OF_GROSS_LOSS(BigDecimal a23_AMT_OF_GROSS_LOSS) {
		A23_AMT_OF_GROSS_LOSS = a23_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA23_AMT_RECOVERED() {
		return A23_AMT_RECOVERED;
	}

	public void setA23_AMT_RECOVERED(BigDecimal a23_AMT_RECOVERED) {
		A23_AMT_RECOVERED = a23_AMT_RECOVERED;
	}

	public BigDecimal getA23_AMT_CLAIMED_INSURANCE() {
		return A23_AMT_CLAIMED_INSURANCE;
	}

	public void setA23_AMT_CLAIMED_INSURANCE(BigDecimal a23_AMT_CLAIMED_INSURANCE) {
		A23_AMT_CLAIMED_INSURANCE = a23_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA23_AMT_RECOVERED_INSURANCE() {
		return A23_AMT_RECOVERED_INSURANCE;
	}

	public void setA23_AMT_RECOVERED_INSURANCE(BigDecimal a23_AMT_RECOVERED_INSURANCE) {
		A23_AMT_RECOVERED_INSURANCE = a23_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA23_ACTUAL_NET_LOSS() {
		return A23_ACTUAL_NET_LOSS;
	}

	public void setA23_ACTUAL_NET_LOSS(BigDecimal a23_ACTUAL_NET_LOSS) {
		A23_ACTUAL_NET_LOSS = a23_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA23_TOTAL_NO_ACTUAL_MISS() {
		return A23_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA23_TOTAL_NO_ACTUAL_MISS(BigDecimal a23_TOTAL_NO_ACTUAL_MISS) {
		A23_TOTAL_NO_ACTUAL_MISS = a23_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA23_NO_SIGNIFICANT_EVENTS() {
		return A23_NO_SIGNIFICANT_EVENTS;
	}

	public void setA23_NO_SIGNIFICANT_EVENTS(BigDecimal a23_NO_SIGNIFICANT_EVENTS) {
		A23_NO_SIGNIFICANT_EVENTS = a23_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA23_POTENTIAL_LOSS_TO_THE_BANK() {
		return A23_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA23_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a23_POTENTIAL_LOSS_TO_THE_BANK) {
		A23_POTENTIAL_LOSS_TO_THE_BANK = a23_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA23_ACTUAL_LOSS_TO_THE_BANK() {
		return A23_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA23_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a23_ACTUAL_LOSS_TO_THE_BANK) {
		A23_ACTUAL_LOSS_TO_THE_BANK = a23_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA23_PREV_CAL_AMT_GROSS_LOSS() {
		return A23_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA23_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a23_PREV_CAL_AMT_GROSS_LOSS) {
		A23_PREV_CAL_AMT_GROSS_LOSS = a23_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA23_PREV_CAL_AMT_RECOVERED() {
		return A23_PREV_CAL_AMT_RECOVERED;
	}

	public void setA23_PREV_CAL_AMT_RECOVERED(BigDecimal a23_PREV_CAL_AMT_RECOVERED) {
		A23_PREV_CAL_AMT_RECOVERED = a23_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA23_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A23_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA23_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a23_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A23_PREV_CAL_AMT_CLAIMED_INSURERS = a23_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA23_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A23_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA23_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a23_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A23_PREV_CAL_AMT_RECOVERED_INSURERS = a23_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA23_PREV_CAL_NET_LOSS() {
		return A23_PREV_CAL_NET_LOSS;
	}

	public void setA23_PREV_CAL_NET_LOSS(BigDecimal a23_PREV_CAL_NET_LOSS) {
		A23_PREV_CAL_NET_LOSS = a23_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA23_CUR_CAL_AMT_GROSS_LOSS() {
		return A23_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA23_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a23_CUR_CAL_AMT_GROSS_LOSS) {
		A23_CUR_CAL_AMT_GROSS_LOSS = a23_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA23_CUR_CAL_AMT_RECOVERED() {
		return A23_CUR_CAL_AMT_RECOVERED;
	}

	public void setA23_CUR_CAL_AMT_RECOVERED(BigDecimal a23_CUR_CAL_AMT_RECOVERED) {
		A23_CUR_CAL_AMT_RECOVERED = a23_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA23_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A23_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA23_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a23_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A23_CUR_CAL_AMT_CLAIMED_INSURERS = a23_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA23_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A23_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA23_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a23_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A23_CUR_CAL_AMT_RECOVERED_INSURERS = a23_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA23_CUR_CAL_NET_LOSS() {
		return A23_CUR_CAL_NET_LOSS;
	}

	public void setA23_CUR_CAL_NET_LOSS(BigDecimal a23_CUR_CAL_NET_LOSS) {
		A23_CUR_CAL_NET_LOSS = a23_CUR_CAL_NET_LOSS;
	}

	public String getA24_PRODUCT() {
		return A24_PRODUCT;
	}

	public void setA24_PRODUCT(String a24_PRODUCT) {
		A24_PRODUCT = a24_PRODUCT;
	}

	public BigDecimal getA24_NO_OF_EVENTS() {
		return A24_NO_OF_EVENTS;
	}

	public void setA24_NO_OF_EVENTS(BigDecimal a24_NO_OF_EVENTS) {
		A24_NO_OF_EVENTS = a24_NO_OF_EVENTS;
	}

	public BigDecimal getA24_AMOUNT_INVOLVED() {
		return A24_AMOUNT_INVOLVED;
	}

	public void setA24_AMOUNT_INVOLVED(BigDecimal a24_AMOUNT_INVOLVED) {
		A24_AMOUNT_INVOLVED = a24_AMOUNT_INVOLVED;
	}

	public BigDecimal getA24_NO_OF_FUNC_AREA_INVOLVED() {
		return A24_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA24_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a24_NO_OF_FUNC_AREA_INVOLVED) {
		A24_NO_OF_FUNC_AREA_INVOLVED = a24_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA24_AMT_OF_MAX_LOSS() {
		return A24_AMT_OF_MAX_LOSS;
	}

	public void setA24_AMT_OF_MAX_LOSS(BigDecimal a24_AMT_OF_MAX_LOSS) {
		A24_AMT_OF_MAX_LOSS = a24_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA24_AMT_OF_GROSS_LOSS() {
		return A24_AMT_OF_GROSS_LOSS;
	}

	public void setA24_AMT_OF_GROSS_LOSS(BigDecimal a24_AMT_OF_GROSS_LOSS) {
		A24_AMT_OF_GROSS_LOSS = a24_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA24_AMT_RECOVERED() {
		return A24_AMT_RECOVERED;
	}

	public void setA24_AMT_RECOVERED(BigDecimal a24_AMT_RECOVERED) {
		A24_AMT_RECOVERED = a24_AMT_RECOVERED;
	}

	public BigDecimal getA24_AMT_CLAIMED_INSURANCE() {
		return A24_AMT_CLAIMED_INSURANCE;
	}

	public void setA24_AMT_CLAIMED_INSURANCE(BigDecimal a24_AMT_CLAIMED_INSURANCE) {
		A24_AMT_CLAIMED_INSURANCE = a24_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA24_AMT_RECOVERED_INSURANCE() {
		return A24_AMT_RECOVERED_INSURANCE;
	}

	public void setA24_AMT_RECOVERED_INSURANCE(BigDecimal a24_AMT_RECOVERED_INSURANCE) {
		A24_AMT_RECOVERED_INSURANCE = a24_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA24_ACTUAL_NET_LOSS() {
		return A24_ACTUAL_NET_LOSS;
	}

	public void setA24_ACTUAL_NET_LOSS(BigDecimal a24_ACTUAL_NET_LOSS) {
		A24_ACTUAL_NET_LOSS = a24_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA24_TOTAL_NO_ACTUAL_MISS() {
		return A24_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA24_TOTAL_NO_ACTUAL_MISS(BigDecimal a24_TOTAL_NO_ACTUAL_MISS) {
		A24_TOTAL_NO_ACTUAL_MISS = a24_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA24_NO_SIGNIFICANT_EVENTS() {
		return A24_NO_SIGNIFICANT_EVENTS;
	}

	public void setA24_NO_SIGNIFICANT_EVENTS(BigDecimal a24_NO_SIGNIFICANT_EVENTS) {
		A24_NO_SIGNIFICANT_EVENTS = a24_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA24_POTENTIAL_LOSS_TO_THE_BANK() {
		return A24_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA24_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a24_POTENTIAL_LOSS_TO_THE_BANK) {
		A24_POTENTIAL_LOSS_TO_THE_BANK = a24_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA24_ACTUAL_LOSS_TO_THE_BANK() {
		return A24_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA24_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a24_ACTUAL_LOSS_TO_THE_BANK) {
		A24_ACTUAL_LOSS_TO_THE_BANK = a24_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA24_PREV_CAL_AMT_GROSS_LOSS() {
		return A24_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA24_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a24_PREV_CAL_AMT_GROSS_LOSS) {
		A24_PREV_CAL_AMT_GROSS_LOSS = a24_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA24_PREV_CAL_AMT_RECOVERED() {
		return A24_PREV_CAL_AMT_RECOVERED;
	}

	public void setA24_PREV_CAL_AMT_RECOVERED(BigDecimal a24_PREV_CAL_AMT_RECOVERED) {
		A24_PREV_CAL_AMT_RECOVERED = a24_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA24_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A24_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA24_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a24_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A24_PREV_CAL_AMT_CLAIMED_INSURERS = a24_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA24_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A24_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA24_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a24_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A24_PREV_CAL_AMT_RECOVERED_INSURERS = a24_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA24_PREV_CAL_NET_LOSS() {
		return A24_PREV_CAL_NET_LOSS;
	}

	public void setA24_PREV_CAL_NET_LOSS(BigDecimal a24_PREV_CAL_NET_LOSS) {
		A24_PREV_CAL_NET_LOSS = a24_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA24_CUR_CAL_AMT_GROSS_LOSS() {
		return A24_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA24_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a24_CUR_CAL_AMT_GROSS_LOSS) {
		A24_CUR_CAL_AMT_GROSS_LOSS = a24_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA24_CUR_CAL_AMT_RECOVERED() {
		return A24_CUR_CAL_AMT_RECOVERED;
	}

	public void setA24_CUR_CAL_AMT_RECOVERED(BigDecimal a24_CUR_CAL_AMT_RECOVERED) {
		A24_CUR_CAL_AMT_RECOVERED = a24_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA24_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A24_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA24_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a24_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A24_CUR_CAL_AMT_CLAIMED_INSURERS = a24_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA24_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A24_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA24_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a24_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A24_CUR_CAL_AMT_RECOVERED_INSURERS = a24_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA24_CUR_CAL_NET_LOSS() {
		return A24_CUR_CAL_NET_LOSS;
	}

	public void setA24_CUR_CAL_NET_LOSS(BigDecimal a24_CUR_CAL_NET_LOSS) {
		A24_CUR_CAL_NET_LOSS = a24_CUR_CAL_NET_LOSS;
	}

	public String getA25_PRODUCT() {
		return A25_PRODUCT;
	}

	public void setA25_PRODUCT(String a25_PRODUCT) {
		A25_PRODUCT = a25_PRODUCT;
	}

	public BigDecimal getA25_NO_OF_EVENTS() {
		return A25_NO_OF_EVENTS;
	}

	public void setA25_NO_OF_EVENTS(BigDecimal a25_NO_OF_EVENTS) {
		A25_NO_OF_EVENTS = a25_NO_OF_EVENTS;
	}

	public BigDecimal getA25_AMOUNT_INVOLVED() {
		return A25_AMOUNT_INVOLVED;
	}

	public void setA25_AMOUNT_INVOLVED(BigDecimal a25_AMOUNT_INVOLVED) {
		A25_AMOUNT_INVOLVED = a25_AMOUNT_INVOLVED;
	}

	public BigDecimal getA25_NO_OF_FUNC_AREA_INVOLVED() {
		return A25_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA25_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a25_NO_OF_FUNC_AREA_INVOLVED) {
		A25_NO_OF_FUNC_AREA_INVOLVED = a25_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA25_AMT_OF_MAX_LOSS() {
		return A25_AMT_OF_MAX_LOSS;
	}

	public void setA25_AMT_OF_MAX_LOSS(BigDecimal a25_AMT_OF_MAX_LOSS) {
		A25_AMT_OF_MAX_LOSS = a25_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA25_AMT_OF_GROSS_LOSS() {
		return A25_AMT_OF_GROSS_LOSS;
	}

	public void setA25_AMT_OF_GROSS_LOSS(BigDecimal a25_AMT_OF_GROSS_LOSS) {
		A25_AMT_OF_GROSS_LOSS = a25_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA25_AMT_RECOVERED() {
		return A25_AMT_RECOVERED;
	}

	public void setA25_AMT_RECOVERED(BigDecimal a25_AMT_RECOVERED) {
		A25_AMT_RECOVERED = a25_AMT_RECOVERED;
	}

	public BigDecimal getA25_AMT_CLAIMED_INSURANCE() {
		return A25_AMT_CLAIMED_INSURANCE;
	}

	public void setA25_AMT_CLAIMED_INSURANCE(BigDecimal a25_AMT_CLAIMED_INSURANCE) {
		A25_AMT_CLAIMED_INSURANCE = a25_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA25_AMT_RECOVERED_INSURANCE() {
		return A25_AMT_RECOVERED_INSURANCE;
	}

	public void setA25_AMT_RECOVERED_INSURANCE(BigDecimal a25_AMT_RECOVERED_INSURANCE) {
		A25_AMT_RECOVERED_INSURANCE = a25_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA25_ACTUAL_NET_LOSS() {
		return A25_ACTUAL_NET_LOSS;
	}

	public void setA25_ACTUAL_NET_LOSS(BigDecimal a25_ACTUAL_NET_LOSS) {
		A25_ACTUAL_NET_LOSS = a25_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA25_TOTAL_NO_ACTUAL_MISS() {
		return A25_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA25_TOTAL_NO_ACTUAL_MISS(BigDecimal a25_TOTAL_NO_ACTUAL_MISS) {
		A25_TOTAL_NO_ACTUAL_MISS = a25_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA25_NO_SIGNIFICANT_EVENTS() {
		return A25_NO_SIGNIFICANT_EVENTS;
	}

	public void setA25_NO_SIGNIFICANT_EVENTS(BigDecimal a25_NO_SIGNIFICANT_EVENTS) {
		A25_NO_SIGNIFICANT_EVENTS = a25_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA25_POTENTIAL_LOSS_TO_THE_BANK() {
		return A25_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA25_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a25_POTENTIAL_LOSS_TO_THE_BANK) {
		A25_POTENTIAL_LOSS_TO_THE_BANK = a25_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA25_ACTUAL_LOSS_TO_THE_BANK() {
		return A25_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA25_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a25_ACTUAL_LOSS_TO_THE_BANK) {
		A25_ACTUAL_LOSS_TO_THE_BANK = a25_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA25_PREV_CAL_AMT_GROSS_LOSS() {
		return A25_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA25_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a25_PREV_CAL_AMT_GROSS_LOSS) {
		A25_PREV_CAL_AMT_GROSS_LOSS = a25_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA25_PREV_CAL_AMT_RECOVERED() {
		return A25_PREV_CAL_AMT_RECOVERED;
	}

	public void setA25_PREV_CAL_AMT_RECOVERED(BigDecimal a25_PREV_CAL_AMT_RECOVERED) {
		A25_PREV_CAL_AMT_RECOVERED = a25_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA25_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A25_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA25_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a25_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A25_PREV_CAL_AMT_CLAIMED_INSURERS = a25_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA25_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A25_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA25_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a25_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A25_PREV_CAL_AMT_RECOVERED_INSURERS = a25_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA25_PREV_CAL_NET_LOSS() {
		return A25_PREV_CAL_NET_LOSS;
	}

	public void setA25_PREV_CAL_NET_LOSS(BigDecimal a25_PREV_CAL_NET_LOSS) {
		A25_PREV_CAL_NET_LOSS = a25_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA25_CUR_CAL_AMT_GROSS_LOSS() {
		return A25_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA25_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a25_CUR_CAL_AMT_GROSS_LOSS) {
		A25_CUR_CAL_AMT_GROSS_LOSS = a25_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA25_CUR_CAL_AMT_RECOVERED() {
		return A25_CUR_CAL_AMT_RECOVERED;
	}

	public void setA25_CUR_CAL_AMT_RECOVERED(BigDecimal a25_CUR_CAL_AMT_RECOVERED) {
		A25_CUR_CAL_AMT_RECOVERED = a25_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA25_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A25_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA25_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a25_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A25_CUR_CAL_AMT_CLAIMED_INSURERS = a25_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA25_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A25_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA25_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a25_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A25_CUR_CAL_AMT_RECOVERED_INSURERS = a25_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA25_CUR_CAL_NET_LOSS() {
		return A25_CUR_CAL_NET_LOSS;
	}

	public void setA25_CUR_CAL_NET_LOSS(BigDecimal a25_CUR_CAL_NET_LOSS) {
		A25_CUR_CAL_NET_LOSS = a25_CUR_CAL_NET_LOSS;
	}

	public String getA26_PRODUCT() {
		return A26_PRODUCT;
	}

	public void setA26_PRODUCT(String a26_PRODUCT) {
		A26_PRODUCT = a26_PRODUCT;
	}

	public BigDecimal getA26_NO_OF_EVENTS() {
		return A26_NO_OF_EVENTS;
	}

	public void setA26_NO_OF_EVENTS(BigDecimal a26_NO_OF_EVENTS) {
		A26_NO_OF_EVENTS = a26_NO_OF_EVENTS;
	}

	public BigDecimal getA26_AMOUNT_INVOLVED() {
		return A26_AMOUNT_INVOLVED;
	}

	public void setA26_AMOUNT_INVOLVED(BigDecimal a26_AMOUNT_INVOLVED) {
		A26_AMOUNT_INVOLVED = a26_AMOUNT_INVOLVED;
	}

	public BigDecimal getA26_NO_OF_FUNC_AREA_INVOLVED() {
		return A26_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA26_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a26_NO_OF_FUNC_AREA_INVOLVED) {
		A26_NO_OF_FUNC_AREA_INVOLVED = a26_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA26_AMT_OF_MAX_LOSS() {
		return A26_AMT_OF_MAX_LOSS;
	}

	public void setA26_AMT_OF_MAX_LOSS(BigDecimal a26_AMT_OF_MAX_LOSS) {
		A26_AMT_OF_MAX_LOSS = a26_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA26_AMT_OF_GROSS_LOSS() {
		return A26_AMT_OF_GROSS_LOSS;
	}

	public void setA26_AMT_OF_GROSS_LOSS(BigDecimal a26_AMT_OF_GROSS_LOSS) {
		A26_AMT_OF_GROSS_LOSS = a26_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA26_AMT_RECOVERED() {
		return A26_AMT_RECOVERED;
	}

	public void setA26_AMT_RECOVERED(BigDecimal a26_AMT_RECOVERED) {
		A26_AMT_RECOVERED = a26_AMT_RECOVERED;
	}

	public BigDecimal getA26_AMT_CLAIMED_INSURANCE() {
		return A26_AMT_CLAIMED_INSURANCE;
	}

	public void setA26_AMT_CLAIMED_INSURANCE(BigDecimal a26_AMT_CLAIMED_INSURANCE) {
		A26_AMT_CLAIMED_INSURANCE = a26_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA26_AMT_RECOVERED_INSURANCE() {
		return A26_AMT_RECOVERED_INSURANCE;
	}

	public void setA26_AMT_RECOVERED_INSURANCE(BigDecimal a26_AMT_RECOVERED_INSURANCE) {
		A26_AMT_RECOVERED_INSURANCE = a26_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA26_ACTUAL_NET_LOSS() {
		return A26_ACTUAL_NET_LOSS;
	}

	public void setA26_ACTUAL_NET_LOSS(BigDecimal a26_ACTUAL_NET_LOSS) {
		A26_ACTUAL_NET_LOSS = a26_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA26_TOTAL_NO_ACTUAL_MISS() {
		return A26_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA26_TOTAL_NO_ACTUAL_MISS(BigDecimal a26_TOTAL_NO_ACTUAL_MISS) {
		A26_TOTAL_NO_ACTUAL_MISS = a26_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA26_NO_SIGNIFICANT_EVENTS() {
		return A26_NO_SIGNIFICANT_EVENTS;
	}

	public void setA26_NO_SIGNIFICANT_EVENTS(BigDecimal a26_NO_SIGNIFICANT_EVENTS) {
		A26_NO_SIGNIFICANT_EVENTS = a26_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA26_POTENTIAL_LOSS_TO_THE_BANK() {
		return A26_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA26_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a26_POTENTIAL_LOSS_TO_THE_BANK) {
		A26_POTENTIAL_LOSS_TO_THE_BANK = a26_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA26_ACTUAL_LOSS_TO_THE_BANK() {
		return A26_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA26_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a26_ACTUAL_LOSS_TO_THE_BANK) {
		A26_ACTUAL_LOSS_TO_THE_BANK = a26_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA26_PREV_CAL_AMT_GROSS_LOSS() {
		return A26_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA26_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a26_PREV_CAL_AMT_GROSS_LOSS) {
		A26_PREV_CAL_AMT_GROSS_LOSS = a26_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA26_PREV_CAL_AMT_RECOVERED() {
		return A26_PREV_CAL_AMT_RECOVERED;
	}

	public void setA26_PREV_CAL_AMT_RECOVERED(BigDecimal a26_PREV_CAL_AMT_RECOVERED) {
		A26_PREV_CAL_AMT_RECOVERED = a26_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA26_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A26_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA26_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a26_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A26_PREV_CAL_AMT_CLAIMED_INSURERS = a26_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA26_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A26_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA26_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a26_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A26_PREV_CAL_AMT_RECOVERED_INSURERS = a26_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA26_PREV_CAL_NET_LOSS() {
		return A26_PREV_CAL_NET_LOSS;
	}

	public void setA26_PREV_CAL_NET_LOSS(BigDecimal a26_PREV_CAL_NET_LOSS) {
		A26_PREV_CAL_NET_LOSS = a26_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA26_CUR_CAL_AMT_GROSS_LOSS() {
		return A26_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA26_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a26_CUR_CAL_AMT_GROSS_LOSS) {
		A26_CUR_CAL_AMT_GROSS_LOSS = a26_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA26_CUR_CAL_AMT_RECOVERED() {
		return A26_CUR_CAL_AMT_RECOVERED;
	}

	public void setA26_CUR_CAL_AMT_RECOVERED(BigDecimal a26_CUR_CAL_AMT_RECOVERED) {
		A26_CUR_CAL_AMT_RECOVERED = a26_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA26_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A26_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA26_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a26_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A26_CUR_CAL_AMT_CLAIMED_INSURERS = a26_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA26_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A26_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA26_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a26_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A26_CUR_CAL_AMT_RECOVERED_INSURERS = a26_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA26_CUR_CAL_NET_LOSS() {
		return A26_CUR_CAL_NET_LOSS;
	}

	public void setA26_CUR_CAL_NET_LOSS(BigDecimal a26_CUR_CAL_NET_LOSS) {
		A26_CUR_CAL_NET_LOSS = a26_CUR_CAL_NET_LOSS;
	}

	public String getA27_PRODUCT() {
		return A27_PRODUCT;
	}

	public void setA27_PRODUCT(String a27_PRODUCT) {
		A27_PRODUCT = a27_PRODUCT;
	}

	public BigDecimal getA27_NO_OF_EVENTS() {
		return A27_NO_OF_EVENTS;
	}

	public void setA27_NO_OF_EVENTS(BigDecimal a27_NO_OF_EVENTS) {
		A27_NO_OF_EVENTS = a27_NO_OF_EVENTS;
	}

	public BigDecimal getA27_AMOUNT_INVOLVED() {
		return A27_AMOUNT_INVOLVED;
	}

	public void setA27_AMOUNT_INVOLVED(BigDecimal a27_AMOUNT_INVOLVED) {
		A27_AMOUNT_INVOLVED = a27_AMOUNT_INVOLVED;
	}

	public BigDecimal getA27_NO_OF_FUNC_AREA_INVOLVED() {
		return A27_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA27_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a27_NO_OF_FUNC_AREA_INVOLVED) {
		A27_NO_OF_FUNC_AREA_INVOLVED = a27_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA27_AMT_OF_MAX_LOSS() {
		return A27_AMT_OF_MAX_LOSS;
	}

	public void setA27_AMT_OF_MAX_LOSS(BigDecimal a27_AMT_OF_MAX_LOSS) {
		A27_AMT_OF_MAX_LOSS = a27_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA27_AMT_OF_GROSS_LOSS() {
		return A27_AMT_OF_GROSS_LOSS;
	}

	public void setA27_AMT_OF_GROSS_LOSS(BigDecimal a27_AMT_OF_GROSS_LOSS) {
		A27_AMT_OF_GROSS_LOSS = a27_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA27_AMT_RECOVERED() {
		return A27_AMT_RECOVERED;
	}

	public void setA27_AMT_RECOVERED(BigDecimal a27_AMT_RECOVERED) {
		A27_AMT_RECOVERED = a27_AMT_RECOVERED;
	}

	public BigDecimal getA27_AMT_CLAIMED_INSURANCE() {
		return A27_AMT_CLAIMED_INSURANCE;
	}

	public void setA27_AMT_CLAIMED_INSURANCE(BigDecimal a27_AMT_CLAIMED_INSURANCE) {
		A27_AMT_CLAIMED_INSURANCE = a27_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA27_AMT_RECOVERED_INSURANCE() {
		return A27_AMT_RECOVERED_INSURANCE;
	}

	public void setA27_AMT_RECOVERED_INSURANCE(BigDecimal a27_AMT_RECOVERED_INSURANCE) {
		A27_AMT_RECOVERED_INSURANCE = a27_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA27_ACTUAL_NET_LOSS() {
		return A27_ACTUAL_NET_LOSS;
	}

	public void setA27_ACTUAL_NET_LOSS(BigDecimal a27_ACTUAL_NET_LOSS) {
		A27_ACTUAL_NET_LOSS = a27_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA27_TOTAL_NO_ACTUAL_MISS() {
		return A27_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA27_TOTAL_NO_ACTUAL_MISS(BigDecimal a27_TOTAL_NO_ACTUAL_MISS) {
		A27_TOTAL_NO_ACTUAL_MISS = a27_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA27_NO_SIGNIFICANT_EVENTS() {
		return A27_NO_SIGNIFICANT_EVENTS;
	}

	public void setA27_NO_SIGNIFICANT_EVENTS(BigDecimal a27_NO_SIGNIFICANT_EVENTS) {
		A27_NO_SIGNIFICANT_EVENTS = a27_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA27_POTENTIAL_LOSS_TO_THE_BANK() {
		return A27_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA27_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a27_POTENTIAL_LOSS_TO_THE_BANK) {
		A27_POTENTIAL_LOSS_TO_THE_BANK = a27_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA27_ACTUAL_LOSS_TO_THE_BANK() {
		return A27_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA27_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a27_ACTUAL_LOSS_TO_THE_BANK) {
		A27_ACTUAL_LOSS_TO_THE_BANK = a27_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA27_PREV_CAL_AMT_GROSS_LOSS() {
		return A27_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA27_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a27_PREV_CAL_AMT_GROSS_LOSS) {
		A27_PREV_CAL_AMT_GROSS_LOSS = a27_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA27_PREV_CAL_AMT_RECOVERED() {
		return A27_PREV_CAL_AMT_RECOVERED;
	}

	public void setA27_PREV_CAL_AMT_RECOVERED(BigDecimal a27_PREV_CAL_AMT_RECOVERED) {
		A27_PREV_CAL_AMT_RECOVERED = a27_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA27_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A27_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA27_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a27_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A27_PREV_CAL_AMT_CLAIMED_INSURERS = a27_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA27_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A27_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA27_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a27_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A27_PREV_CAL_AMT_RECOVERED_INSURERS = a27_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA27_PREV_CAL_NET_LOSS() {
		return A27_PREV_CAL_NET_LOSS;
	}

	public void setA27_PREV_CAL_NET_LOSS(BigDecimal a27_PREV_CAL_NET_LOSS) {
		A27_PREV_CAL_NET_LOSS = a27_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA27_CUR_CAL_AMT_GROSS_LOSS() {
		return A27_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA27_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a27_CUR_CAL_AMT_GROSS_LOSS) {
		A27_CUR_CAL_AMT_GROSS_LOSS = a27_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA27_CUR_CAL_AMT_RECOVERED() {
		return A27_CUR_CAL_AMT_RECOVERED;
	}

	public void setA27_CUR_CAL_AMT_RECOVERED(BigDecimal a27_CUR_CAL_AMT_RECOVERED) {
		A27_CUR_CAL_AMT_RECOVERED = a27_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA27_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A27_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA27_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a27_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A27_CUR_CAL_AMT_CLAIMED_INSURERS = a27_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA27_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A27_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA27_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a27_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A27_CUR_CAL_AMT_RECOVERED_INSURERS = a27_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA27_CUR_CAL_NET_LOSS() {
		return A27_CUR_CAL_NET_LOSS;
	}

	public void setA27_CUR_CAL_NET_LOSS(BigDecimal a27_CUR_CAL_NET_LOSS) {
		A27_CUR_CAL_NET_LOSS = a27_CUR_CAL_NET_LOSS;
	}

	public String getA28_PRODUCT() {
		return A28_PRODUCT;
	}

	public void setA28_PRODUCT(String a28_PRODUCT) {
		A28_PRODUCT = a28_PRODUCT;
	}

	public BigDecimal getA28_NO_OF_EVENTS() {
		return A28_NO_OF_EVENTS;
	}

	public void setA28_NO_OF_EVENTS(BigDecimal a28_NO_OF_EVENTS) {
		A28_NO_OF_EVENTS = a28_NO_OF_EVENTS;
	}

	public BigDecimal getA28_AMOUNT_INVOLVED() {
		return A28_AMOUNT_INVOLVED;
	}

	public void setA28_AMOUNT_INVOLVED(BigDecimal a28_AMOUNT_INVOLVED) {
		A28_AMOUNT_INVOLVED = a28_AMOUNT_INVOLVED;
	}

	public BigDecimal getA28_NO_OF_FUNC_AREA_INVOLVED() {
		return A28_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA28_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a28_NO_OF_FUNC_AREA_INVOLVED) {
		A28_NO_OF_FUNC_AREA_INVOLVED = a28_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA28_AMT_OF_MAX_LOSS() {
		return A28_AMT_OF_MAX_LOSS;
	}

	public void setA28_AMT_OF_MAX_LOSS(BigDecimal a28_AMT_OF_MAX_LOSS) {
		A28_AMT_OF_MAX_LOSS = a28_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA28_AMT_OF_GROSS_LOSS() {
		return A28_AMT_OF_GROSS_LOSS;
	}

	public void setA28_AMT_OF_GROSS_LOSS(BigDecimal a28_AMT_OF_GROSS_LOSS) {
		A28_AMT_OF_GROSS_LOSS = a28_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA28_AMT_RECOVERED() {
		return A28_AMT_RECOVERED;
	}

	public void setA28_AMT_RECOVERED(BigDecimal a28_AMT_RECOVERED) {
		A28_AMT_RECOVERED = a28_AMT_RECOVERED;
	}

	public BigDecimal getA28_AMT_CLAIMED_INSURANCE() {
		return A28_AMT_CLAIMED_INSURANCE;
	}

	public void setA28_AMT_CLAIMED_INSURANCE(BigDecimal a28_AMT_CLAIMED_INSURANCE) {
		A28_AMT_CLAIMED_INSURANCE = a28_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA28_AMT_RECOVERED_INSURANCE() {
		return A28_AMT_RECOVERED_INSURANCE;
	}

	public void setA28_AMT_RECOVERED_INSURANCE(BigDecimal a28_AMT_RECOVERED_INSURANCE) {
		A28_AMT_RECOVERED_INSURANCE = a28_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA28_ACTUAL_NET_LOSS() {
		return A28_ACTUAL_NET_LOSS;
	}

	public void setA28_ACTUAL_NET_LOSS(BigDecimal a28_ACTUAL_NET_LOSS) {
		A28_ACTUAL_NET_LOSS = a28_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA28_TOTAL_NO_ACTUAL_MISS() {
		return A28_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA28_TOTAL_NO_ACTUAL_MISS(BigDecimal a28_TOTAL_NO_ACTUAL_MISS) {
		A28_TOTAL_NO_ACTUAL_MISS = a28_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA28_NO_SIGNIFICANT_EVENTS() {
		return A28_NO_SIGNIFICANT_EVENTS;
	}

	public void setA28_NO_SIGNIFICANT_EVENTS(BigDecimal a28_NO_SIGNIFICANT_EVENTS) {
		A28_NO_SIGNIFICANT_EVENTS = a28_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA28_POTENTIAL_LOSS_TO_THE_BANK() {
		return A28_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA28_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a28_POTENTIAL_LOSS_TO_THE_BANK) {
		A28_POTENTIAL_LOSS_TO_THE_BANK = a28_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA28_ACTUAL_LOSS_TO_THE_BANK() {
		return A28_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA28_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a28_ACTUAL_LOSS_TO_THE_BANK) {
		A28_ACTUAL_LOSS_TO_THE_BANK = a28_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA28_PREV_CAL_AMT_GROSS_LOSS() {
		return A28_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA28_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a28_PREV_CAL_AMT_GROSS_LOSS) {
		A28_PREV_CAL_AMT_GROSS_LOSS = a28_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA28_PREV_CAL_AMT_RECOVERED() {
		return A28_PREV_CAL_AMT_RECOVERED;
	}

	public void setA28_PREV_CAL_AMT_RECOVERED(BigDecimal a28_PREV_CAL_AMT_RECOVERED) {
		A28_PREV_CAL_AMT_RECOVERED = a28_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA28_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A28_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA28_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a28_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A28_PREV_CAL_AMT_CLAIMED_INSURERS = a28_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA28_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A28_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA28_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a28_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A28_PREV_CAL_AMT_RECOVERED_INSURERS = a28_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA28_PREV_CAL_NET_LOSS() {
		return A28_PREV_CAL_NET_LOSS;
	}

	public void setA28_PREV_CAL_NET_LOSS(BigDecimal a28_PREV_CAL_NET_LOSS) {
		A28_PREV_CAL_NET_LOSS = a28_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA28_CUR_CAL_AMT_GROSS_LOSS() {
		return A28_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA28_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a28_CUR_CAL_AMT_GROSS_LOSS) {
		A28_CUR_CAL_AMT_GROSS_LOSS = a28_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA28_CUR_CAL_AMT_RECOVERED() {
		return A28_CUR_CAL_AMT_RECOVERED;
	}

	public void setA28_CUR_CAL_AMT_RECOVERED(BigDecimal a28_CUR_CAL_AMT_RECOVERED) {
		A28_CUR_CAL_AMT_RECOVERED = a28_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA28_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A28_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA28_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a28_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A28_CUR_CAL_AMT_CLAIMED_INSURERS = a28_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA28_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A28_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA28_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a28_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A28_CUR_CAL_AMT_RECOVERED_INSURERS = a28_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA28_CUR_CAL_NET_LOSS() {
		return A28_CUR_CAL_NET_LOSS;
	}

	public void setA28_CUR_CAL_NET_LOSS(BigDecimal a28_CUR_CAL_NET_LOSS) {
		A28_CUR_CAL_NET_LOSS = a28_CUR_CAL_NET_LOSS;
	}

	public String getA29_PRODUCT() {
		return A29_PRODUCT;
	}

	public void setA29_PRODUCT(String a29_PRODUCT) {
		A29_PRODUCT = a29_PRODUCT;
	}

	public BigDecimal getA29_NO_OF_EVENTS() {
		return A29_NO_OF_EVENTS;
	}

	public void setA29_NO_OF_EVENTS(BigDecimal a29_NO_OF_EVENTS) {
		A29_NO_OF_EVENTS = a29_NO_OF_EVENTS;
	}

	public BigDecimal getA29_AMOUNT_INVOLVED() {
		return A29_AMOUNT_INVOLVED;
	}

	public void setA29_AMOUNT_INVOLVED(BigDecimal a29_AMOUNT_INVOLVED) {
		A29_AMOUNT_INVOLVED = a29_AMOUNT_INVOLVED;
	}

	public BigDecimal getA29_NO_OF_FUNC_AREA_INVOLVED() {
		return A29_NO_OF_FUNC_AREA_INVOLVED;
	}

	public void setA29_NO_OF_FUNC_AREA_INVOLVED(BigDecimal a29_NO_OF_FUNC_AREA_INVOLVED) {
		A29_NO_OF_FUNC_AREA_INVOLVED = a29_NO_OF_FUNC_AREA_INVOLVED;
	}

	public BigDecimal getA29_AMT_OF_MAX_LOSS() {
		return A29_AMT_OF_MAX_LOSS;
	}

	public void setA29_AMT_OF_MAX_LOSS(BigDecimal a29_AMT_OF_MAX_LOSS) {
		A29_AMT_OF_MAX_LOSS = a29_AMT_OF_MAX_LOSS;
	}

	public BigDecimal getA29_AMT_OF_GROSS_LOSS() {
		return A29_AMT_OF_GROSS_LOSS;
	}

	public void setA29_AMT_OF_GROSS_LOSS(BigDecimal a29_AMT_OF_GROSS_LOSS) {
		A29_AMT_OF_GROSS_LOSS = a29_AMT_OF_GROSS_LOSS;
	}

	public BigDecimal getA29_AMT_RECOVERED() {
		return A29_AMT_RECOVERED;
	}

	public void setA29_AMT_RECOVERED(BigDecimal a29_AMT_RECOVERED) {
		A29_AMT_RECOVERED = a29_AMT_RECOVERED;
	}

	public BigDecimal getA29_AMT_CLAIMED_INSURANCE() {
		return A29_AMT_CLAIMED_INSURANCE;
	}

	public void setA29_AMT_CLAIMED_INSURANCE(BigDecimal a29_AMT_CLAIMED_INSURANCE) {
		A29_AMT_CLAIMED_INSURANCE = a29_AMT_CLAIMED_INSURANCE;
	}

	public BigDecimal getA29_AMT_RECOVERED_INSURANCE() {
		return A29_AMT_RECOVERED_INSURANCE;
	}

	public void setA29_AMT_RECOVERED_INSURANCE(BigDecimal a29_AMT_RECOVERED_INSURANCE) {
		A29_AMT_RECOVERED_INSURANCE = a29_AMT_RECOVERED_INSURANCE;
	}

	public BigDecimal getA29_ACTUAL_NET_LOSS() {
		return A29_ACTUAL_NET_LOSS;
	}

	public void setA29_ACTUAL_NET_LOSS(BigDecimal a29_ACTUAL_NET_LOSS) {
		A29_ACTUAL_NET_LOSS = a29_ACTUAL_NET_LOSS;
	}

	public BigDecimal getA29_TOTAL_NO_ACTUAL_MISS() {
		return A29_TOTAL_NO_ACTUAL_MISS;
	}

	public void setA29_TOTAL_NO_ACTUAL_MISS(BigDecimal a29_TOTAL_NO_ACTUAL_MISS) {
		A29_TOTAL_NO_ACTUAL_MISS = a29_TOTAL_NO_ACTUAL_MISS;
	}

	public BigDecimal getA29_NO_SIGNIFICANT_EVENTS() {
		return A29_NO_SIGNIFICANT_EVENTS;
	}

	public void setA29_NO_SIGNIFICANT_EVENTS(BigDecimal a29_NO_SIGNIFICANT_EVENTS) {
		A29_NO_SIGNIFICANT_EVENTS = a29_NO_SIGNIFICANT_EVENTS;
	}

	public BigDecimal getA29_POTENTIAL_LOSS_TO_THE_BANK() {
		return A29_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public void setA29_POTENTIAL_LOSS_TO_THE_BANK(BigDecimal a29_POTENTIAL_LOSS_TO_THE_BANK) {
		A29_POTENTIAL_LOSS_TO_THE_BANK = a29_POTENTIAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA29_ACTUAL_LOSS_TO_THE_BANK() {
		return A29_ACTUAL_LOSS_TO_THE_BANK;
	}

	public void setA29_ACTUAL_LOSS_TO_THE_BANK(BigDecimal a29_ACTUAL_LOSS_TO_THE_BANK) {
		A29_ACTUAL_LOSS_TO_THE_BANK = a29_ACTUAL_LOSS_TO_THE_BANK;
	}

	public BigDecimal getA29_PREV_CAL_AMT_GROSS_LOSS() {
		return A29_PREV_CAL_AMT_GROSS_LOSS;
	}

	public void setA29_PREV_CAL_AMT_GROSS_LOSS(BigDecimal a29_PREV_CAL_AMT_GROSS_LOSS) {
		A29_PREV_CAL_AMT_GROSS_LOSS = a29_PREV_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA29_PREV_CAL_AMT_RECOVERED() {
		return A29_PREV_CAL_AMT_RECOVERED;
	}

	public void setA29_PREV_CAL_AMT_RECOVERED(BigDecimal a29_PREV_CAL_AMT_RECOVERED) {
		A29_PREV_CAL_AMT_RECOVERED = a29_PREV_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA29_PREV_CAL_AMT_CLAIMED_INSURERS() {
		return A29_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA29_PREV_CAL_AMT_CLAIMED_INSURERS(BigDecimal a29_PREV_CAL_AMT_CLAIMED_INSURERS) {
		A29_PREV_CAL_AMT_CLAIMED_INSURERS = a29_PREV_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA29_PREV_CAL_AMT_RECOVERED_INSURERS() {
		return A29_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA29_PREV_CAL_AMT_RECOVERED_INSURERS(BigDecimal a29_PREV_CAL_AMT_RECOVERED_INSURERS) {
		A29_PREV_CAL_AMT_RECOVERED_INSURERS = a29_PREV_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA29_PREV_CAL_NET_LOSS() {
		return A29_PREV_CAL_NET_LOSS;
	}

	public void setA29_PREV_CAL_NET_LOSS(BigDecimal a29_PREV_CAL_NET_LOSS) {
		A29_PREV_CAL_NET_LOSS = a29_PREV_CAL_NET_LOSS;
	}

	public BigDecimal getA29_CUR_CAL_AMT_GROSS_LOSS() {
		return A29_CUR_CAL_AMT_GROSS_LOSS;
	}

	public void setA29_CUR_CAL_AMT_GROSS_LOSS(BigDecimal a29_CUR_CAL_AMT_GROSS_LOSS) {
		A29_CUR_CAL_AMT_GROSS_LOSS = a29_CUR_CAL_AMT_GROSS_LOSS;
	}

	public BigDecimal getA29_CUR_CAL_AMT_RECOVERED() {
		return A29_CUR_CAL_AMT_RECOVERED;
	}

	public void setA29_CUR_CAL_AMT_RECOVERED(BigDecimal a29_CUR_CAL_AMT_RECOVERED) {
		A29_CUR_CAL_AMT_RECOVERED = a29_CUR_CAL_AMT_RECOVERED;
	}

	public BigDecimal getA29_CUR_CAL_AMT_CLAIMED_INSURERS() {
		return A29_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public void setA29_CUR_CAL_AMT_CLAIMED_INSURERS(BigDecimal a29_CUR_CAL_AMT_CLAIMED_INSURERS) {
		A29_CUR_CAL_AMT_CLAIMED_INSURERS = a29_CUR_CAL_AMT_CLAIMED_INSURERS;
	}

	public BigDecimal getA29_CUR_CAL_AMT_RECOVERED_INSURERS() {
		return A29_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public void setA29_CUR_CAL_AMT_RECOVERED_INSURERS(BigDecimal a29_CUR_CAL_AMT_RECOVERED_INSURERS) {
		A29_CUR_CAL_AMT_RECOVERED_INSURERS = a29_CUR_CAL_AMT_RECOVERED_INSURERS;
	}

	public BigDecimal getA29_CUR_CAL_NET_LOSS() {
		return A29_CUR_CAL_NET_LOSS;
	}

	public void setA29_CUR_CAL_NET_LOSS(BigDecimal a29_CUR_CAL_NET_LOSS) {
		A29_CUR_CAL_NET_LOSS = a29_CUR_CAL_NET_LOSS;
	}

	public String getREPORT_CODE() {
		return REPORT_CODE;
	}

	public void setREPORT_CODE(String rEPORT_CODE) {
		REPORT_CODE = rEPORT_CODE;
	}

	public String getREPORT_NAME() {
		return REPORT_NAME;
	}

	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}

	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}

	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}

	public Date getREPORT_DUE_DATE() {
		return REPORT_DUE_DATE;
	}

	public void setREPORT_DUE_DATE(Date rEPORT_DUE_DATE) {
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
	}

	public Date getREP_SUBMIT_DATE() {
		return REP_SUBMIT_DATE;
	}

	public void setREP_SUBMIT_DATE(Date rEP_SUBMIT_DATE) {
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
	}

	public Date getREP_PERIOD_FROM() {
		return REP_PERIOD_FROM;
	}

	public void setREP_PERIOD_FROM(Date rEP_PERIOD_FROM) {
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
	}

	public Date getREP_PERIOD_TO() {
		return REP_PERIOD_TO;
	}

	public void setREP_PERIOD_TO(Date rEP_PERIOD_TO) {
		REP_PERIOD_TO = rEP_PERIOD_TO;
	}

	public String getREP_FREQ() {
		return REP_FREQ;
	}

	public void setREP_FREQ(String rEP_FREQ) {
		REP_FREQ = rEP_FREQ;
	}

	public String getNIL_REPORT_FLG() {
		return NIL_REPORT_FLG;
	}

	public void setNIL_REPORT_FLG(String nIL_REPORT_FLG) {
		NIL_REPORT_FLG = nIL_REPORT_FLG;
	}

	public String getARCH_FLG() {
		return ARCH_FLG;
	}

	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
	}

	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}

	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}

	public String getDEL_FLG() {
		return DEL_FLG;
	}

	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}

	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}

	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
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

	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}

	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}

	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}

	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}

	public Date getVERIFY_TIME() {
		return VERIFY_TIME;
	}

	public void setVERIFY_TIME(Date vERIFY_TIME) {
		VERIFY_TIME = vERIFY_TIME;
	}

	public String getQTR_FLG() {
		return QTR_FLG;
	}

	public void setQTR_FLG(String qTR_FLG) {
		QTR_FLG = qTR_FLG;
	}
	
	public T28ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
