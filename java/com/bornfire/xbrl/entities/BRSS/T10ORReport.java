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
@Table(name="T10_OR_OPERATING_RISK_TABLE")
public class T10ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_TOTAL_NO_EVENT;
	private BigDecimal	A1_NO_OF_CUST_EFFECTED;
	private BigDecimal	A1_AMOUNT_INVOLVED;
	private BigDecimal	A1_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A1_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A1_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A1_AMOUNT_RECOVERED;
	private BigDecimal	A1_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A1_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A1_ACTUAL_NET_LOSS;
	private BigDecimal	A1_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A1_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A1_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A1_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A1_PREV_GROSS_LOSS;
	private BigDecimal	A1_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A1_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A1_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A1_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A1_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A1_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A1_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A1_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A1_CUR_ACTUAL_NET_LOSS;
	private String	A2_PRODUCT;
	private BigDecimal	A2_TOTAL_NO_EVENT;
	private BigDecimal	A2_NO_OF_CUST_EFFECTED;
	private BigDecimal	A2_AMOUNT_INVOLVED;
	private BigDecimal	A2_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A2_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A2_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A2_AMOUNT_RECOVERED;
	private BigDecimal	A2_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A2_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A2_ACTUAL_NET_LOSS;
	private BigDecimal	A2_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A2_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A2_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A2_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A2_PREV_GROSS_LOSS;
	private BigDecimal	A2_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A2_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A2_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A2_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A2_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A2_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A2_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A2_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A2_CUR_ACTUAL_NET_LOSS;
	private String	A3_PRODUCT;
	private BigDecimal	A3_TOTAL_NO_EVENT;
	private BigDecimal	A3_NO_OF_CUST_EFFECTED;
	private BigDecimal	A3_AMOUNT_INVOLVED;
	private BigDecimal	A3_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A3_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A3_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A3_AMOUNT_RECOVERED;
	private BigDecimal	A3_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A3_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A3_ACTUAL_NET_LOSS;
	private BigDecimal	A3_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A3_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A3_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A3_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A3_PREV_GROSS_LOSS;
	private BigDecimal	A3_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A3_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A3_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A3_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A3_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A3_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A3_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A3_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A3_CUR_ACTUAL_NET_LOSS;
	private String	A4_PRODUCT;
	private BigDecimal	A4_TOTAL_NO_EVENT;
	private BigDecimal	A4_NO_OF_CUST_EFFECTED;
	private BigDecimal	A4_AMOUNT_INVOLVED;
	private BigDecimal	A4_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A4_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A4_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A4_AMOUNT_RECOVERED;
	private BigDecimal	A4_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A4_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A4_ACTUAL_NET_LOSS;
	private BigDecimal	A4_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A4_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A4_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A4_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A4_PREV_GROSS_LOSS;
	private BigDecimal	A4_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A4_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A4_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A4_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A4_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A4_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A4_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A4_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A4_CUR_ACTUAL_NET_LOSS;
	private String	A5_PRODUCT;
	private BigDecimal	A5_TOTAL_NO_EVENT;
	private BigDecimal	A5_NO_OF_CUST_EFFECTED;
	private BigDecimal	A5_AMOUNT_INVOLVED;
	private BigDecimal	A5_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A5_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A5_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A5_AMOUNT_RECOVERED;
	private BigDecimal	A5_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A5_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A5_ACTUAL_NET_LOSS;
	private BigDecimal	A5_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A5_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A5_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A5_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A5_PREV_GROSS_LOSS;
	private BigDecimal	A5_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A5_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A5_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A5_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A5_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A5_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A5_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A5_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A5_CUR_ACTUAL_NET_LOSS;
	private String	A6_PRODUCT;
	private BigDecimal	A6_TOTAL_NO_EVENT;
	private BigDecimal	A6_NO_OF_CUST_EFFECTED;
	private BigDecimal	A6_AMOUNT_INVOLVED;
	private BigDecimal	A6_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A6_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A6_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A6_AMOUNT_RECOVERED;
	private BigDecimal	A6_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A6_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A6_ACTUAL_NET_LOSS;
	private BigDecimal	A6_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A6_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A6_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A6_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A6_PREV_GROSS_LOSS;
	private BigDecimal	A6_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A6_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A6_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A6_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A6_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A6_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A6_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A6_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A6_CUR_ACTUAL_NET_LOSS;
	private String	A7_PRODUCT;
	private BigDecimal	A7_TOTAL_NO_EVENT;
	private BigDecimal	A7_NO_OF_CUST_EFFECTED;
	private BigDecimal	A7_AMOUNT_INVOLVED;
	private BigDecimal	A7_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A7_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A7_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A7_AMOUNT_RECOVERED;
	private BigDecimal	A7_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A7_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A7_ACTUAL_NET_LOSS;
	private BigDecimal	A7_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A7_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A7_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A7_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A7_PREV_GROSS_LOSS;
	private BigDecimal	A7_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A7_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A7_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A7_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A7_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A7_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A7_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A7_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A7_CUR_ACTUAL_NET_LOSS;
	private String	A8_PRODUCT;
	private BigDecimal	A8_TOTAL_NO_EVENT;
	private BigDecimal	A8_NO_OF_CUST_EFFECTED;
	private BigDecimal	A8_AMOUNT_INVOLVED;
	private BigDecimal	A8_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A8_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A8_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A8_AMOUNT_RECOVERED;
	private BigDecimal	A8_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A8_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A8_ACTUAL_NET_LOSS;
	private BigDecimal	A8_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A8_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A8_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A8_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A8_PREV_GROSS_LOSS;
	private BigDecimal	A8_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A8_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A8_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A8_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A8_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A8_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A8_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A8_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A8_CUR_ACTUAL_NET_LOSS;
	private String	A9_PRODUCT;
	private BigDecimal	A9_TOTAL_NO_EVENT;
	private BigDecimal	A9_NO_OF_CUST_EFFECTED;
	private BigDecimal	A9_AMOUNT_INVOLVED;
	private BigDecimal	A9_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A9_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A9_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A9_AMOUNT_RECOVERED;
	private BigDecimal	A9_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A9_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A9_ACTUAL_NET_LOSS;
	private BigDecimal	A9_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A9_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A9_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A9_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A9_PREV_GROSS_LOSS;
	private BigDecimal	A9_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A9_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A9_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A9_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A9_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A9_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A9_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A9_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A9_CUR_ACTUAL_NET_LOSS;
	private String	A10_PRODUCT;
	private BigDecimal	A10_TOTAL_NO_EVENT;
	private BigDecimal	A10_NO_OF_CUST_EFFECTED;
	private BigDecimal	A10_AMOUNT_INVOLVED;
	private BigDecimal	A10_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A10_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A10_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A10_AMOUNT_RECOVERED;
	private BigDecimal	A10_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A10_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A10_ACTUAL_NET_LOSS;
	private BigDecimal	A10_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A10_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A10_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A10_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A10_PREV_GROSS_LOSS;
	private BigDecimal	A10_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A10_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A10_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A10_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A10_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A10_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A10_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A10_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A10_CUR_ACTUAL_NET_LOSS;
	private String	A11_PRODUCT;
	private BigDecimal	A11_TOTAL_NO_EVENT;
	private BigDecimal	A11_NO_OF_CUST_EFFECTED;
	private BigDecimal	A11_AMOUNT_INVOLVED;
	private BigDecimal	A11_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A11_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A11_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A11_AMOUNT_RECOVERED;
	private BigDecimal	A11_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A11_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A11_ACTUAL_NET_LOSS;
	private BigDecimal	A11_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A11_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A11_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A11_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A11_PREV_GROSS_LOSS;
	private BigDecimal	A11_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A11_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A11_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A11_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A11_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A11_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A11_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A11_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A11_CUR_ACTUAL_NET_LOSS;
	private String	A12_PRODUCT;
	private BigDecimal	A12_TOTAL_NO_EVENT;
	private BigDecimal	A12_NO_OF_CUST_EFFECTED;
	private BigDecimal	A12_AMOUNT_INVOLVED;
	private BigDecimal	A12_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A12_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A12_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A12_AMOUNT_RECOVERED;
	private BigDecimal	A12_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A12_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A12_ACTUAL_NET_LOSS;
	private BigDecimal	A12_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A12_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A12_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A12_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A12_PREV_GROSS_LOSS;
	private BigDecimal	A12_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A12_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A12_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A12_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A12_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A12_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A12_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A12_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A12_CUR_ACTUAL_NET_LOSS;
	private String	A13_PRODUCT;
	private BigDecimal	A13_TOTAL_NO_EVENT;
	private BigDecimal	A13_NO_OF_CUST_EFFECTED;
	private BigDecimal	A13_AMOUNT_INVOLVED;
	private BigDecimal	A13_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A13_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A13_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A13_AMOUNT_RECOVERED;
	private BigDecimal	A13_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A13_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A13_ACTUAL_NET_LOSS;
	private BigDecimal	A13_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A13_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A13_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A13_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A13_PREV_GROSS_LOSS;
	private BigDecimal	A13_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A13_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A13_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A13_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A13_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A13_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A13_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A13_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A13_CUR_ACTUAL_NET_LOSS;
	private String	A14_PRODUCT;
	private BigDecimal	A14_TOTAL_NO_EVENT;
	private BigDecimal	A14_NO_OF_CUST_EFFECTED;
	private BigDecimal	A14_AMOUNT_INVOLVED;
	private BigDecimal	A14_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A14_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A14_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A14_AMOUNT_RECOVERED;
	private BigDecimal	A14_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A14_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A14_ACTUAL_NET_LOSS;
	private BigDecimal	A14_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A14_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A14_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A14_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A14_PREV_GROSS_LOSS;
	private BigDecimal	A14_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A14_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A14_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A14_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A14_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A14_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A14_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A14_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A14_CUR_ACTUAL_NET_LOSS;
	private String	A15_PRODUCT;
	private BigDecimal	A15_TOTAL_NO_EVENT;
	private BigDecimal	A15_NO_OF_CUST_EFFECTED;
	private BigDecimal	A15_AMOUNT_INVOLVED;
	private BigDecimal	A15_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A15_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A15_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A15_AMOUNT_RECOVERED;
	private BigDecimal	A15_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A15_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A15_ACTUAL_NET_LOSS;
	private BigDecimal	A15_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A15_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A15_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A15_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A15_PREV_GROSS_LOSS;
	private BigDecimal	A15_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A15_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A15_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A15_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A15_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A15_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A15_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A15_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A15_CUR_ACTUAL_NET_LOSS;
	private String	A16_PRODUCT;
	private BigDecimal	A16_TOTAL_NO_EVENT;
	private BigDecimal	A16_NO_OF_CUST_EFFECTED;
	private BigDecimal	A16_AMOUNT_INVOLVED;
	private BigDecimal	A16_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A16_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A16_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A16_AMOUNT_RECOVERED;
	private BigDecimal	A16_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A16_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A16_ACTUAL_NET_LOSS;
	private BigDecimal	A16_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A16_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A16_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A16_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A16_PREV_GROSS_LOSS;
	private BigDecimal	A16_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A16_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A16_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A16_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A16_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A16_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A16_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A16_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A16_CUR_ACTUAL_NET_LOSS;
	private String	A17_PRODUCT;
	private BigDecimal	A17_TOTAL_NO_EVENT;
	private BigDecimal	A17_NO_OF_CUST_EFFECTED;
	private BigDecimal	A17_AMOUNT_INVOLVED;
	private BigDecimal	A17_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A17_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A17_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A17_AMOUNT_RECOVERED;
	private BigDecimal	A17_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A17_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A17_ACTUAL_NET_LOSS;
	private BigDecimal	A17_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A17_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A17_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A17_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A17_PREV_GROSS_LOSS;
	private BigDecimal	A17_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A17_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A17_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A17_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A17_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A17_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A17_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A17_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A17_CUR_ACTUAL_NET_LOSS;
	private String	A18_PRODUCT;
	private BigDecimal	A18_TOTAL_NO_EVENT;
	private BigDecimal	A18_NO_OF_CUST_EFFECTED;
	private BigDecimal	A18_AMOUNT_INVOLVED;
	private BigDecimal	A18_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A18_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A18_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A18_AMOUNT_RECOVERED;
	private BigDecimal	A18_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A18_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A18_ACTUAL_NET_LOSS;
	private BigDecimal	A18_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A18_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A18_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A18_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A18_PREV_GROSS_LOSS;
	private BigDecimal	A18_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A18_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A18_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A18_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A18_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A18_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A18_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A18_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A18_CUR_ACTUAL_NET_LOSS;
	private String	A19_PRODUCT;
	private BigDecimal	A19_TOTAL_NO_EVENT;
	private BigDecimal	A19_NO_OF_CUST_EFFECTED;
	private BigDecimal	A19_AMOUNT_INVOLVED;
	private BigDecimal	A19_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A19_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A19_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A19_AMOUNT_RECOVERED;
	private BigDecimal	A19_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A19_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A19_ACTUAL_NET_LOSS;
	private BigDecimal	A19_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A19_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A19_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A19_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A19_PREV_GROSS_LOSS;
	private BigDecimal	A19_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A19_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A19_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A19_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A19_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A19_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A19_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A19_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A19_CUR_ACTUAL_NET_LOSS;
	private String	A20_PRODUCT;
	private BigDecimal	A20_TOTAL_NO_EVENT;
	private BigDecimal	A20_NO_OF_CUST_EFFECTED;
	private BigDecimal	A20_AMOUNT_INVOLVED;
	private BigDecimal	A20_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A20_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A20_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A20_AMOUNT_RECOVERED;
	private BigDecimal	A20_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A20_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A20_ACTUAL_NET_LOSS;
	private BigDecimal	A20_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A20_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A20_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A20_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A20_PREV_GROSS_LOSS;
	private BigDecimal	A20_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A20_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A20_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A20_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A20_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A20_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A20_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A20_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A20_CUR_ACTUAL_NET_LOSS;
	private String	A21_PRODUCT;
	private BigDecimal	A21_TOTAL_NO_EVENT;
	private BigDecimal	A21_NO_OF_CUST_EFFECTED;
	private BigDecimal	A21_AMOUNT_INVOLVED;
	private BigDecimal	A21_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A21_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A21_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A21_AMOUNT_RECOVERED;
	private BigDecimal	A21_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A21_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A21_ACTUAL_NET_LOSS;
	private BigDecimal	A21_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A21_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A21_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A21_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A21_PREV_GROSS_LOSS;
	private BigDecimal	A21_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A21_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A21_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A21_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A21_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A21_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A21_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A21_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A21_CUR_ACTUAL_NET_LOSS;
	private String	A22_PRODUCT;
	private BigDecimal	A22_TOTAL_NO_EVENT;
	private BigDecimal	A22_NO_OF_CUST_EFFECTED;
	private BigDecimal	A22_AMOUNT_INVOLVED;
	private BigDecimal	A22_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A22_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A22_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A22_AMOUNT_RECOVERED;
	private BigDecimal	A22_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A22_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A22_ACTUAL_NET_LOSS;
	private BigDecimal	A22_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A22_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A22_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A22_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A22_PREV_GROSS_LOSS;
	private BigDecimal	A22_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A22_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A22_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A22_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A22_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A22_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A22_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A22_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A22_CUR_ACTUAL_NET_LOSS;
	private String	A23_PRODUCT;
	private BigDecimal	A23_TOTAL_NO_EVENT;
	private BigDecimal	A23_NO_OF_CUST_EFFECTED;
	private BigDecimal	A23_AMOUNT_INVOLVED;
	private BigDecimal	A23_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A23_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A23_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A23_AMOUNT_RECOVERED;
	private BigDecimal	A23_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A23_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A23_ACTUAL_NET_LOSS;
	private BigDecimal	A23_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A23_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A23_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A23_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A23_PREV_GROSS_LOSS;
	private BigDecimal	A23_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A23_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A23_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A23_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A23_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A23_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A23_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A23_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A23_CUR_ACTUAL_NET_LOSS;
	private String	A24_PRODUCT;
	private BigDecimal	A24_TOTAL_NO_EVENT;
	private BigDecimal	A24_NO_OF_CUST_EFFECTED;
	private BigDecimal	A24_AMOUNT_INVOLVED;
	private BigDecimal	A24_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A24_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A24_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A24_AMOUNT_RECOVERED;
	private BigDecimal	A24_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A24_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A24_ACTUAL_NET_LOSS;
	private BigDecimal	A24_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A24_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A24_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A24_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A24_PREV_GROSS_LOSS;
	private BigDecimal	A24_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A24_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A24_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A24_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A24_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A24_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A24_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A24_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A24_CUR_ACTUAL_NET_LOSS;
	private String	A25_PRODUCT;
	private BigDecimal	A25_TOTAL_NO_EVENT;
	private BigDecimal	A25_NO_OF_CUST_EFFECTED;
	private BigDecimal	A25_AMOUNT_INVOLVED;
	private BigDecimal	A25_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A25_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A25_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A25_AMOUNT_RECOVERED;
	private BigDecimal	A25_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A25_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A25_ACTUAL_NET_LOSS;
	private BigDecimal	A25_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A25_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A25_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A25_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A25_PREV_GROSS_LOSS;
	private BigDecimal	A25_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A25_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A25_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A25_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A25_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A25_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A25_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A25_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A25_CUR_ACTUAL_NET_LOSS;
	private String	A26_PRODUCT;
	private BigDecimal	A26_TOTAL_NO_EVENT;
	private BigDecimal	A26_NO_OF_CUST_EFFECTED;
	private BigDecimal	A26_AMOUNT_INVOLVED;
	private BigDecimal	A26_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A26_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A26_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A26_AMOUNT_RECOVERED;
	private BigDecimal	A26_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A26_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A26_ACTUAL_NET_LOSS;
	private BigDecimal	A26_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A26_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A26_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A26_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A26_PREV_GROSS_LOSS;
	private BigDecimal	A26_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A26_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A26_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A26_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A26_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A26_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A26_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A26_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A26_CUR_ACTUAL_NET_LOSS;
	private String	A27_PRODUCT;
	private BigDecimal	A27_TOTAL_NO_EVENT;
	private BigDecimal	A27_NO_OF_CUST_EFFECTED;
	private BigDecimal	A27_AMOUNT_INVOLVED;
	private BigDecimal	A27_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A27_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A27_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A27_AMOUNT_RECOVERED;
	private BigDecimal	A27_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A27_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A27_ACTUAL_NET_LOSS;
	private BigDecimal	A27_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A27_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A27_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A27_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A27_PREV_GROSS_LOSS;
	private BigDecimal	A27_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A27_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A27_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A27_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A27_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A27_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A27_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A27_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A27_CUR_ACTUAL_NET_LOSS;
	private String	A28_PRODUCT;
	private BigDecimal	A28_TOTAL_NO_EVENT;
	private BigDecimal	A28_NO_OF_CUST_EFFECTED;
	private BigDecimal	A28_AMOUNT_INVOLVED;
	private BigDecimal	A28_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A28_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A28_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A28_AMOUNT_RECOVERED;
	private BigDecimal	A28_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A28_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A28_ACTUAL_NET_LOSS;
	private BigDecimal	A28_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A28_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A28_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A28_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A28_PREV_GROSS_LOSS;
	private BigDecimal	A28_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A28_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A28_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A28_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A28_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A28_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A28_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A28_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A28_CUR_ACTUAL_NET_LOSS;
	private String	A29_PRODUCT;
	private BigDecimal	A29_TOTAL_NO_EVENT;
	private BigDecimal	A29_NO_OF_CUST_EFFECTED;
	private BigDecimal	A29_AMOUNT_INVOLVED;
	private BigDecimal	A29_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A29_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A29_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A29_AMOUNT_RECOVERED;
	private BigDecimal	A29_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A29_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A29_ACTUAL_NET_LOSS;
	private BigDecimal	A29_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A29_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A29_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A29_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A29_PREV_GROSS_LOSS;
	private BigDecimal	A29_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A29_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A29_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A29_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A29_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A29_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A29_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A29_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A29_CUR_ACTUAL_NET_LOSS;
	private String	A30_PRODUCT;
	private BigDecimal	A30_TOTAL_NO_EVENT;
	private BigDecimal	A30_NO_OF_CUST_EFFECTED;
	private BigDecimal	A30_AMOUNT_INVOLVED;
	private BigDecimal	A30_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A30_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A30_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A30_AMOUNT_RECOVERED;
	private BigDecimal	A30_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A30_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A30_ACTUAL_NET_LOSS;
	private BigDecimal	A30_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A30_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A30_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A30_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A30_PREV_GROSS_LOSS;
	private BigDecimal	A30_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A30_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A30_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A30_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A30_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A30_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A30_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A30_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A30_CUR_ACTUAL_NET_LOSS;
	private String	A31_PRODUCT;
	private String	A32_PRODUCT;
	private BigDecimal	A32_TOTAL_NO_EVENT;
	private BigDecimal	A32_NO_OF_CUST_EFFECTED;
	private BigDecimal	A32_AMOUNT_INVOLVED;
	private BigDecimal	A32_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A32_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A32_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A32_AMOUNT_RECOVERED;
	private BigDecimal	A32_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A32_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A32_ACTUAL_NET_LOSS;
	private BigDecimal	A32_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A32_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A32_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A32_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A32_PREV_GROSS_LOSS;
	private BigDecimal	A32_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A32_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A32_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A32_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A32_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A32_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A32_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A32_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A32_CUR_ACTUAL_NET_LOSS;
	private String	A33_PRODUCT;
	private BigDecimal	A33_TOTAL_NO_EVENT;
	private BigDecimal	A33_NO_OF_CUST_EFFECTED;
	private BigDecimal	A33_AMOUNT_INVOLVED;
	private BigDecimal	A33_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A33_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A33_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A33_AMOUNT_RECOVERED;
	private BigDecimal	A33_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A33_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A33_ACTUAL_NET_LOSS;
	private BigDecimal	A33_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A33_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A33_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A33_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A33_PREV_GROSS_LOSS;
	private BigDecimal	A33_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A33_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A33_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A33_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A33_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A33_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A33_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A33_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A33_CUR_ACTUAL_NET_LOSS;
	private String	A34_PRODUCT;
	private BigDecimal	A34_TOTAL_NO_EVENT;
	private BigDecimal	A34_NO_OF_CUST_EFFECTED;
	private BigDecimal	A34_AMOUNT_INVOLVED;
	private BigDecimal	A34_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A34_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A34_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A34_AMOUNT_RECOVERED;
	private BigDecimal	A34_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A34_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A34_ACTUAL_NET_LOSS;
	private BigDecimal	A34_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A34_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A34_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A34_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A34_PREV_GROSS_LOSS;
	private BigDecimal	A34_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A34_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A34_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A34_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A34_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A34_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A34_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A34_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A34_CUR_ACTUAL_NET_LOSS;
	private String	A35_PRODUCT;
	private BigDecimal	A35_TOTAL_NO_EVENT;
	private BigDecimal	A35_NO_OF_CUST_EFFECTED;
	private BigDecimal	A35_AMOUNT_INVOLVED;
	private BigDecimal	A35_NO_OF_FUNC_AREAS_INVOLVED;
	private BigDecimal	A35_AMOUNT_OF_MAX_LOSS;
	private BigDecimal	A35_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	private BigDecimal	A35_AMOUNT_RECOVERED;
	private BigDecimal	A35_AMOUNT_CLAIMED_FROM_INSURERS;
	private BigDecimal	A35_AMOUNT_RECOVERED_THROUGH_INSURERS;
	private BigDecimal	A35_ACTUAL_NET_LOSS;
	private BigDecimal	A35_TOTAL_NO_OF_NEAR_MISS;
	private BigDecimal	A35_NO_OF_SIGNIFICANT_EVENTS;
	private BigDecimal	A35_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	private BigDecimal	A35_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	private BigDecimal	A35_PREV_GROSS_LOSS;
	private BigDecimal	A35_PREV_AMOUNT_RECOVERED;
	private BigDecimal	A35_PREV_AMOUNT_CLAIMED;
	private BigDecimal	A35_PREVT_AMOUNT_RECOVERED;
	private BigDecimal	A35_PREV_ACTUAL_NET_LOSS;
	private BigDecimal	A35_CUR_ACTUAL_GROSS_LOSS;
	private BigDecimal	A35_CUR_AMOUNT_RECOVERED;
	private BigDecimal	A35_CUT_AMOUNT_CLAIMED;
	private BigDecimal	A35_CUT_AMOUNT_RECOVERED;
	private BigDecimal	A35_CUR_ACTUAL_NET_LOSS;
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
	public BigDecimal getA1_TOTAL_NO_EVENT() {
		return A1_TOTAL_NO_EVENT;
	}
	public void setA1_TOTAL_NO_EVENT(BigDecimal a1_TOTAL_NO_EVENT) {
		A1_TOTAL_NO_EVENT = a1_TOTAL_NO_EVENT;
	}
	public BigDecimal getA1_NO_OF_CUST_EFFECTED() {
		return A1_NO_OF_CUST_EFFECTED;
	}
	public void setA1_NO_OF_CUST_EFFECTED(BigDecimal a1_NO_OF_CUST_EFFECTED) {
		A1_NO_OF_CUST_EFFECTED = a1_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA1_AMOUNT_INVOLVED() {
		return A1_AMOUNT_INVOLVED;
	}
	public void setA1_AMOUNT_INVOLVED(BigDecimal a1_AMOUNT_INVOLVED) {
		A1_AMOUNT_INVOLVED = a1_AMOUNT_INVOLVED;
	}
	public BigDecimal getA1_NO_OF_FUNC_AREAS_INVOLVED() {
		return A1_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA1_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a1_NO_OF_FUNC_AREAS_INVOLVED) {
		A1_NO_OF_FUNC_AREAS_INVOLVED = a1_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA1_AMOUNT_OF_MAX_LOSS() {
		return A1_AMOUNT_OF_MAX_LOSS;
	}
	public void setA1_AMOUNT_OF_MAX_LOSS(BigDecimal a1_AMOUNT_OF_MAX_LOSS) {
		A1_AMOUNT_OF_MAX_LOSS = a1_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA1_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A1_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA1_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a1_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A1_AMOUNT_OF_ACTUAL_GROSS_LOSS = a1_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA1_AMOUNT_RECOVERED() {
		return A1_AMOUNT_RECOVERED;
	}
	public void setA1_AMOUNT_RECOVERED(BigDecimal a1_AMOUNT_RECOVERED) {
		A1_AMOUNT_RECOVERED = a1_AMOUNT_RECOVERED;
	}
	public BigDecimal getA1_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A1_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA1_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a1_AMOUNT_CLAIMED_FROM_INSURERS) {
		A1_AMOUNT_CLAIMED_FROM_INSURERS = a1_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA1_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A1_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA1_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a1_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A1_AMOUNT_RECOVERED_THROUGH_INSURERS = a1_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA1_ACTUAL_NET_LOSS() {
		return A1_ACTUAL_NET_LOSS;
	}
	public void setA1_ACTUAL_NET_LOSS(BigDecimal a1_ACTUAL_NET_LOSS) {
		A1_ACTUAL_NET_LOSS = a1_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA1_TOTAL_NO_OF_NEAR_MISS() {
		return A1_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA1_TOTAL_NO_OF_NEAR_MISS(BigDecimal a1_TOTAL_NO_OF_NEAR_MISS) {
		A1_TOTAL_NO_OF_NEAR_MISS = a1_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA1_NO_OF_SIGNIFICANT_EVENTS() {
		return A1_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA1_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a1_NO_OF_SIGNIFICANT_EVENTS) {
		A1_NO_OF_SIGNIFICANT_EVENTS = a1_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA1_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A1_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA1_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a1_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A1_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a1_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA1_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A1_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA1_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a1_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A1_SIGNIFICANT_EVENT_ACTUAL_LOSS = a1_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA1_PREV_GROSS_LOSS() {
		return A1_PREV_GROSS_LOSS;
	}
	public void setA1_PREV_GROSS_LOSS(BigDecimal a1_PREV_GROSS_LOSS) {
		A1_PREV_GROSS_LOSS = a1_PREV_GROSS_LOSS;
	}
	public BigDecimal getA1_PREV_AMOUNT_RECOVERED() {
		return A1_PREV_AMOUNT_RECOVERED;
	}
	public void setA1_PREV_AMOUNT_RECOVERED(BigDecimal a1_PREV_AMOUNT_RECOVERED) {
		A1_PREV_AMOUNT_RECOVERED = a1_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA1_PREV_AMOUNT_CLAIMED() {
		return A1_PREV_AMOUNT_CLAIMED;
	}
	public void setA1_PREV_AMOUNT_CLAIMED(BigDecimal a1_PREV_AMOUNT_CLAIMED) {
		A1_PREV_AMOUNT_CLAIMED = a1_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA1_PREVT_AMOUNT_RECOVERED() {
		return A1_PREVT_AMOUNT_RECOVERED;
	}
	public void setA1_PREVT_AMOUNT_RECOVERED(BigDecimal a1_PREVT_AMOUNT_RECOVERED) {
		A1_PREVT_AMOUNT_RECOVERED = a1_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA1_PREV_ACTUAL_NET_LOSS() {
		return A1_PREV_ACTUAL_NET_LOSS;
	}
	public void setA1_PREV_ACTUAL_NET_LOSS(BigDecimal a1_PREV_ACTUAL_NET_LOSS) {
		A1_PREV_ACTUAL_NET_LOSS = a1_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA1_CUR_ACTUAL_GROSS_LOSS() {
		return A1_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA1_CUR_ACTUAL_GROSS_LOSS(BigDecimal a1_CUR_ACTUAL_GROSS_LOSS) {
		A1_CUR_ACTUAL_GROSS_LOSS = a1_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA1_CUR_AMOUNT_RECOVERED() {
		return A1_CUR_AMOUNT_RECOVERED;
	}
	public void setA1_CUR_AMOUNT_RECOVERED(BigDecimal a1_CUR_AMOUNT_RECOVERED) {
		A1_CUR_AMOUNT_RECOVERED = a1_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA1_CUT_AMOUNT_CLAIMED() {
		return A1_CUT_AMOUNT_CLAIMED;
	}
	public void setA1_CUT_AMOUNT_CLAIMED(BigDecimal a1_CUT_AMOUNT_CLAIMED) {
		A1_CUT_AMOUNT_CLAIMED = a1_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA1_CUT_AMOUNT_RECOVERED() {
		return A1_CUT_AMOUNT_RECOVERED;
	}
	public void setA1_CUT_AMOUNT_RECOVERED(BigDecimal a1_CUT_AMOUNT_RECOVERED) {
		A1_CUT_AMOUNT_RECOVERED = a1_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA1_CUR_ACTUAL_NET_LOSS() {
		return A1_CUR_ACTUAL_NET_LOSS;
	}
	public void setA1_CUR_ACTUAL_NET_LOSS(BigDecimal a1_CUR_ACTUAL_NET_LOSS) {
		A1_CUR_ACTUAL_NET_LOSS = a1_CUR_ACTUAL_NET_LOSS;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_TOTAL_NO_EVENT() {
		return A2_TOTAL_NO_EVENT;
	}
	public void setA2_TOTAL_NO_EVENT(BigDecimal a2_TOTAL_NO_EVENT) {
		A2_TOTAL_NO_EVENT = a2_TOTAL_NO_EVENT;
	}
	public BigDecimal getA2_NO_OF_CUST_EFFECTED() {
		return A2_NO_OF_CUST_EFFECTED;
	}
	public void setA2_NO_OF_CUST_EFFECTED(BigDecimal a2_NO_OF_CUST_EFFECTED) {
		A2_NO_OF_CUST_EFFECTED = a2_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA2_AMOUNT_INVOLVED() {
		return A2_AMOUNT_INVOLVED;
	}
	public void setA2_AMOUNT_INVOLVED(BigDecimal a2_AMOUNT_INVOLVED) {
		A2_AMOUNT_INVOLVED = a2_AMOUNT_INVOLVED;
	}
	public BigDecimal getA2_NO_OF_FUNC_AREAS_INVOLVED() {
		return A2_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA2_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a2_NO_OF_FUNC_AREAS_INVOLVED) {
		A2_NO_OF_FUNC_AREAS_INVOLVED = a2_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA2_AMOUNT_OF_MAX_LOSS() {
		return A2_AMOUNT_OF_MAX_LOSS;
	}
	public void setA2_AMOUNT_OF_MAX_LOSS(BigDecimal a2_AMOUNT_OF_MAX_LOSS) {
		A2_AMOUNT_OF_MAX_LOSS = a2_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA2_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A2_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA2_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a2_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A2_AMOUNT_OF_ACTUAL_GROSS_LOSS = a2_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA2_AMOUNT_RECOVERED() {
		return A2_AMOUNT_RECOVERED;
	}
	public void setA2_AMOUNT_RECOVERED(BigDecimal a2_AMOUNT_RECOVERED) {
		A2_AMOUNT_RECOVERED = a2_AMOUNT_RECOVERED;
	}
	public BigDecimal getA2_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A2_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA2_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a2_AMOUNT_CLAIMED_FROM_INSURERS) {
		A2_AMOUNT_CLAIMED_FROM_INSURERS = a2_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA2_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A2_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA2_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a2_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A2_AMOUNT_RECOVERED_THROUGH_INSURERS = a2_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA2_ACTUAL_NET_LOSS() {
		return A2_ACTUAL_NET_LOSS;
	}
	public void setA2_ACTUAL_NET_LOSS(BigDecimal a2_ACTUAL_NET_LOSS) {
		A2_ACTUAL_NET_LOSS = a2_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA2_TOTAL_NO_OF_NEAR_MISS() {
		return A2_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA2_TOTAL_NO_OF_NEAR_MISS(BigDecimal a2_TOTAL_NO_OF_NEAR_MISS) {
		A2_TOTAL_NO_OF_NEAR_MISS = a2_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA2_NO_OF_SIGNIFICANT_EVENTS() {
		return A2_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA2_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a2_NO_OF_SIGNIFICANT_EVENTS) {
		A2_NO_OF_SIGNIFICANT_EVENTS = a2_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA2_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A2_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA2_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a2_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A2_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a2_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA2_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A2_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA2_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a2_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A2_SIGNIFICANT_EVENT_ACTUAL_LOSS = a2_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA2_PREV_GROSS_LOSS() {
		return A2_PREV_GROSS_LOSS;
	}
	public void setA2_PREV_GROSS_LOSS(BigDecimal a2_PREV_GROSS_LOSS) {
		A2_PREV_GROSS_LOSS = a2_PREV_GROSS_LOSS;
	}
	public BigDecimal getA2_PREV_AMOUNT_RECOVERED() {
		return A2_PREV_AMOUNT_RECOVERED;
	}
	public void setA2_PREV_AMOUNT_RECOVERED(BigDecimal a2_PREV_AMOUNT_RECOVERED) {
		A2_PREV_AMOUNT_RECOVERED = a2_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA2_PREV_AMOUNT_CLAIMED() {
		return A2_PREV_AMOUNT_CLAIMED;
	}
	public void setA2_PREV_AMOUNT_CLAIMED(BigDecimal a2_PREV_AMOUNT_CLAIMED) {
		A2_PREV_AMOUNT_CLAIMED = a2_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA2_PREVT_AMOUNT_RECOVERED() {
		return A2_PREVT_AMOUNT_RECOVERED;
	}
	public void setA2_PREVT_AMOUNT_RECOVERED(BigDecimal a2_PREVT_AMOUNT_RECOVERED) {
		A2_PREVT_AMOUNT_RECOVERED = a2_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA2_PREV_ACTUAL_NET_LOSS() {
		return A2_PREV_ACTUAL_NET_LOSS;
	}
	public void setA2_PREV_ACTUAL_NET_LOSS(BigDecimal a2_PREV_ACTUAL_NET_LOSS) {
		A2_PREV_ACTUAL_NET_LOSS = a2_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA2_CUR_ACTUAL_GROSS_LOSS() {
		return A2_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA2_CUR_ACTUAL_GROSS_LOSS(BigDecimal a2_CUR_ACTUAL_GROSS_LOSS) {
		A2_CUR_ACTUAL_GROSS_LOSS = a2_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA2_CUR_AMOUNT_RECOVERED() {
		return A2_CUR_AMOUNT_RECOVERED;
	}
	public void setA2_CUR_AMOUNT_RECOVERED(BigDecimal a2_CUR_AMOUNT_RECOVERED) {
		A2_CUR_AMOUNT_RECOVERED = a2_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA2_CUT_AMOUNT_CLAIMED() {
		return A2_CUT_AMOUNT_CLAIMED;
	}
	public void setA2_CUT_AMOUNT_CLAIMED(BigDecimal a2_CUT_AMOUNT_CLAIMED) {
		A2_CUT_AMOUNT_CLAIMED = a2_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA2_CUT_AMOUNT_RECOVERED() {
		return A2_CUT_AMOUNT_RECOVERED;
	}
	public void setA2_CUT_AMOUNT_RECOVERED(BigDecimal a2_CUT_AMOUNT_RECOVERED) {
		A2_CUT_AMOUNT_RECOVERED = a2_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA2_CUR_ACTUAL_NET_LOSS() {
		return A2_CUR_ACTUAL_NET_LOSS;
	}
	public void setA2_CUR_ACTUAL_NET_LOSS(BigDecimal a2_CUR_ACTUAL_NET_LOSS) {
		A2_CUR_ACTUAL_NET_LOSS = a2_CUR_ACTUAL_NET_LOSS;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_TOTAL_NO_EVENT() {
		return A3_TOTAL_NO_EVENT;
	}
	public void setA3_TOTAL_NO_EVENT(BigDecimal a3_TOTAL_NO_EVENT) {
		A3_TOTAL_NO_EVENT = a3_TOTAL_NO_EVENT;
	}
	public BigDecimal getA3_NO_OF_CUST_EFFECTED() {
		return A3_NO_OF_CUST_EFFECTED;
	}
	public void setA3_NO_OF_CUST_EFFECTED(BigDecimal a3_NO_OF_CUST_EFFECTED) {
		A3_NO_OF_CUST_EFFECTED = a3_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA3_AMOUNT_INVOLVED() {
		return A3_AMOUNT_INVOLVED;
	}
	public void setA3_AMOUNT_INVOLVED(BigDecimal a3_AMOUNT_INVOLVED) {
		A3_AMOUNT_INVOLVED = a3_AMOUNT_INVOLVED;
	}
	public BigDecimal getA3_NO_OF_FUNC_AREAS_INVOLVED() {
		return A3_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA3_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a3_NO_OF_FUNC_AREAS_INVOLVED) {
		A3_NO_OF_FUNC_AREAS_INVOLVED = a3_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA3_AMOUNT_OF_MAX_LOSS() {
		return A3_AMOUNT_OF_MAX_LOSS;
	}
	public void setA3_AMOUNT_OF_MAX_LOSS(BigDecimal a3_AMOUNT_OF_MAX_LOSS) {
		A3_AMOUNT_OF_MAX_LOSS = a3_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA3_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A3_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA3_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a3_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A3_AMOUNT_OF_ACTUAL_GROSS_LOSS = a3_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA3_AMOUNT_RECOVERED() {
		return A3_AMOUNT_RECOVERED;
	}
	public void setA3_AMOUNT_RECOVERED(BigDecimal a3_AMOUNT_RECOVERED) {
		A3_AMOUNT_RECOVERED = a3_AMOUNT_RECOVERED;
	}
	public BigDecimal getA3_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A3_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA3_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a3_AMOUNT_CLAIMED_FROM_INSURERS) {
		A3_AMOUNT_CLAIMED_FROM_INSURERS = a3_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA3_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A3_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA3_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a3_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A3_AMOUNT_RECOVERED_THROUGH_INSURERS = a3_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA3_ACTUAL_NET_LOSS() {
		return A3_ACTUAL_NET_LOSS;
	}
	public void setA3_ACTUAL_NET_LOSS(BigDecimal a3_ACTUAL_NET_LOSS) {
		A3_ACTUAL_NET_LOSS = a3_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA3_TOTAL_NO_OF_NEAR_MISS() {
		return A3_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA3_TOTAL_NO_OF_NEAR_MISS(BigDecimal a3_TOTAL_NO_OF_NEAR_MISS) {
		A3_TOTAL_NO_OF_NEAR_MISS = a3_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA3_NO_OF_SIGNIFICANT_EVENTS() {
		return A3_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA3_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a3_NO_OF_SIGNIFICANT_EVENTS) {
		A3_NO_OF_SIGNIFICANT_EVENTS = a3_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA3_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A3_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA3_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a3_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A3_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a3_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA3_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A3_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA3_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a3_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A3_SIGNIFICANT_EVENT_ACTUAL_LOSS = a3_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA3_PREV_GROSS_LOSS() {
		return A3_PREV_GROSS_LOSS;
	}
	public void setA3_PREV_GROSS_LOSS(BigDecimal a3_PREV_GROSS_LOSS) {
		A3_PREV_GROSS_LOSS = a3_PREV_GROSS_LOSS;
	}
	public BigDecimal getA3_PREV_AMOUNT_RECOVERED() {
		return A3_PREV_AMOUNT_RECOVERED;
	}
	public void setA3_PREV_AMOUNT_RECOVERED(BigDecimal a3_PREV_AMOUNT_RECOVERED) {
		A3_PREV_AMOUNT_RECOVERED = a3_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA3_PREV_AMOUNT_CLAIMED() {
		return A3_PREV_AMOUNT_CLAIMED;
	}
	public void setA3_PREV_AMOUNT_CLAIMED(BigDecimal a3_PREV_AMOUNT_CLAIMED) {
		A3_PREV_AMOUNT_CLAIMED = a3_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA3_PREVT_AMOUNT_RECOVERED() {
		return A3_PREVT_AMOUNT_RECOVERED;
	}
	public void setA3_PREVT_AMOUNT_RECOVERED(BigDecimal a3_PREVT_AMOUNT_RECOVERED) {
		A3_PREVT_AMOUNT_RECOVERED = a3_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA3_PREV_ACTUAL_NET_LOSS() {
		return A3_PREV_ACTUAL_NET_LOSS;
	}
	public void setA3_PREV_ACTUAL_NET_LOSS(BigDecimal a3_PREV_ACTUAL_NET_LOSS) {
		A3_PREV_ACTUAL_NET_LOSS = a3_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA3_CUR_ACTUAL_GROSS_LOSS() {
		return A3_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA3_CUR_ACTUAL_GROSS_LOSS(BigDecimal a3_CUR_ACTUAL_GROSS_LOSS) {
		A3_CUR_ACTUAL_GROSS_LOSS = a3_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA3_CUR_AMOUNT_RECOVERED() {
		return A3_CUR_AMOUNT_RECOVERED;
	}
	public void setA3_CUR_AMOUNT_RECOVERED(BigDecimal a3_CUR_AMOUNT_RECOVERED) {
		A3_CUR_AMOUNT_RECOVERED = a3_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA3_CUT_AMOUNT_CLAIMED() {
		return A3_CUT_AMOUNT_CLAIMED;
	}
	public void setA3_CUT_AMOUNT_CLAIMED(BigDecimal a3_CUT_AMOUNT_CLAIMED) {
		A3_CUT_AMOUNT_CLAIMED = a3_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA3_CUT_AMOUNT_RECOVERED() {
		return A3_CUT_AMOUNT_RECOVERED;
	}
	public void setA3_CUT_AMOUNT_RECOVERED(BigDecimal a3_CUT_AMOUNT_RECOVERED) {
		A3_CUT_AMOUNT_RECOVERED = a3_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA3_CUR_ACTUAL_NET_LOSS() {
		return A3_CUR_ACTUAL_NET_LOSS;
	}
	public void setA3_CUR_ACTUAL_NET_LOSS(BigDecimal a3_CUR_ACTUAL_NET_LOSS) {
		A3_CUR_ACTUAL_NET_LOSS = a3_CUR_ACTUAL_NET_LOSS;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_TOTAL_NO_EVENT() {
		return A4_TOTAL_NO_EVENT;
	}
	public void setA4_TOTAL_NO_EVENT(BigDecimal a4_TOTAL_NO_EVENT) {
		A4_TOTAL_NO_EVENT = a4_TOTAL_NO_EVENT;
	}
	public BigDecimal getA4_NO_OF_CUST_EFFECTED() {
		return A4_NO_OF_CUST_EFFECTED;
	}
	public void setA4_NO_OF_CUST_EFFECTED(BigDecimal a4_NO_OF_CUST_EFFECTED) {
		A4_NO_OF_CUST_EFFECTED = a4_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA4_AMOUNT_INVOLVED() {
		return A4_AMOUNT_INVOLVED;
	}
	public void setA4_AMOUNT_INVOLVED(BigDecimal a4_AMOUNT_INVOLVED) {
		A4_AMOUNT_INVOLVED = a4_AMOUNT_INVOLVED;
	}
	public BigDecimal getA4_NO_OF_FUNC_AREAS_INVOLVED() {
		return A4_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA4_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a4_NO_OF_FUNC_AREAS_INVOLVED) {
		A4_NO_OF_FUNC_AREAS_INVOLVED = a4_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA4_AMOUNT_OF_MAX_LOSS() {
		return A4_AMOUNT_OF_MAX_LOSS;
	}
	public void setA4_AMOUNT_OF_MAX_LOSS(BigDecimal a4_AMOUNT_OF_MAX_LOSS) {
		A4_AMOUNT_OF_MAX_LOSS = a4_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA4_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A4_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA4_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a4_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A4_AMOUNT_OF_ACTUAL_GROSS_LOSS = a4_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA4_AMOUNT_RECOVERED() {
		return A4_AMOUNT_RECOVERED;
	}
	public void setA4_AMOUNT_RECOVERED(BigDecimal a4_AMOUNT_RECOVERED) {
		A4_AMOUNT_RECOVERED = a4_AMOUNT_RECOVERED;
	}
	public BigDecimal getA4_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A4_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA4_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a4_AMOUNT_CLAIMED_FROM_INSURERS) {
		A4_AMOUNT_CLAIMED_FROM_INSURERS = a4_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA4_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A4_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA4_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a4_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A4_AMOUNT_RECOVERED_THROUGH_INSURERS = a4_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA4_ACTUAL_NET_LOSS() {
		return A4_ACTUAL_NET_LOSS;
	}
	public void setA4_ACTUAL_NET_LOSS(BigDecimal a4_ACTUAL_NET_LOSS) {
		A4_ACTUAL_NET_LOSS = a4_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA4_TOTAL_NO_OF_NEAR_MISS() {
		return A4_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA4_TOTAL_NO_OF_NEAR_MISS(BigDecimal a4_TOTAL_NO_OF_NEAR_MISS) {
		A4_TOTAL_NO_OF_NEAR_MISS = a4_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA4_NO_OF_SIGNIFICANT_EVENTS() {
		return A4_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA4_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a4_NO_OF_SIGNIFICANT_EVENTS) {
		A4_NO_OF_SIGNIFICANT_EVENTS = a4_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA4_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A4_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA4_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a4_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A4_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a4_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA4_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A4_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA4_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a4_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A4_SIGNIFICANT_EVENT_ACTUAL_LOSS = a4_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA4_PREV_GROSS_LOSS() {
		return A4_PREV_GROSS_LOSS;
	}
	public void setA4_PREV_GROSS_LOSS(BigDecimal a4_PREV_GROSS_LOSS) {
		A4_PREV_GROSS_LOSS = a4_PREV_GROSS_LOSS;
	}
	public BigDecimal getA4_PREV_AMOUNT_RECOVERED() {
		return A4_PREV_AMOUNT_RECOVERED;
	}
	public void setA4_PREV_AMOUNT_RECOVERED(BigDecimal a4_PREV_AMOUNT_RECOVERED) {
		A4_PREV_AMOUNT_RECOVERED = a4_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA4_PREV_AMOUNT_CLAIMED() {
		return A4_PREV_AMOUNT_CLAIMED;
	}
	public void setA4_PREV_AMOUNT_CLAIMED(BigDecimal a4_PREV_AMOUNT_CLAIMED) {
		A4_PREV_AMOUNT_CLAIMED = a4_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA4_PREVT_AMOUNT_RECOVERED() {
		return A4_PREVT_AMOUNT_RECOVERED;
	}
	public void setA4_PREVT_AMOUNT_RECOVERED(BigDecimal a4_PREVT_AMOUNT_RECOVERED) {
		A4_PREVT_AMOUNT_RECOVERED = a4_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA4_PREV_ACTUAL_NET_LOSS() {
		return A4_PREV_ACTUAL_NET_LOSS;
	}
	public void setA4_PREV_ACTUAL_NET_LOSS(BigDecimal a4_PREV_ACTUAL_NET_LOSS) {
		A4_PREV_ACTUAL_NET_LOSS = a4_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA4_CUR_ACTUAL_GROSS_LOSS() {
		return A4_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA4_CUR_ACTUAL_GROSS_LOSS(BigDecimal a4_CUR_ACTUAL_GROSS_LOSS) {
		A4_CUR_ACTUAL_GROSS_LOSS = a4_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA4_CUR_AMOUNT_RECOVERED() {
		return A4_CUR_AMOUNT_RECOVERED;
	}
	public void setA4_CUR_AMOUNT_RECOVERED(BigDecimal a4_CUR_AMOUNT_RECOVERED) {
		A4_CUR_AMOUNT_RECOVERED = a4_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA4_CUT_AMOUNT_CLAIMED() {
		return A4_CUT_AMOUNT_CLAIMED;
	}
	public void setA4_CUT_AMOUNT_CLAIMED(BigDecimal a4_CUT_AMOUNT_CLAIMED) {
		A4_CUT_AMOUNT_CLAIMED = a4_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA4_CUT_AMOUNT_RECOVERED() {
		return A4_CUT_AMOUNT_RECOVERED;
	}
	public void setA4_CUT_AMOUNT_RECOVERED(BigDecimal a4_CUT_AMOUNT_RECOVERED) {
		A4_CUT_AMOUNT_RECOVERED = a4_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA4_CUR_ACTUAL_NET_LOSS() {
		return A4_CUR_ACTUAL_NET_LOSS;
	}
	public void setA4_CUR_ACTUAL_NET_LOSS(BigDecimal a4_CUR_ACTUAL_NET_LOSS) {
		A4_CUR_ACTUAL_NET_LOSS = a4_CUR_ACTUAL_NET_LOSS;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_TOTAL_NO_EVENT() {
		return A5_TOTAL_NO_EVENT;
	}
	public void setA5_TOTAL_NO_EVENT(BigDecimal a5_TOTAL_NO_EVENT) {
		A5_TOTAL_NO_EVENT = a5_TOTAL_NO_EVENT;
	}
	public BigDecimal getA5_NO_OF_CUST_EFFECTED() {
		return A5_NO_OF_CUST_EFFECTED;
	}
	public void setA5_NO_OF_CUST_EFFECTED(BigDecimal a5_NO_OF_CUST_EFFECTED) {
		A5_NO_OF_CUST_EFFECTED = a5_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA5_AMOUNT_INVOLVED() {
		return A5_AMOUNT_INVOLVED;
	}
	public void setA5_AMOUNT_INVOLVED(BigDecimal a5_AMOUNT_INVOLVED) {
		A5_AMOUNT_INVOLVED = a5_AMOUNT_INVOLVED;
	}
	public BigDecimal getA5_NO_OF_FUNC_AREAS_INVOLVED() {
		return A5_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA5_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a5_NO_OF_FUNC_AREAS_INVOLVED) {
		A5_NO_OF_FUNC_AREAS_INVOLVED = a5_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA5_AMOUNT_OF_MAX_LOSS() {
		return A5_AMOUNT_OF_MAX_LOSS;
	}
	public void setA5_AMOUNT_OF_MAX_LOSS(BigDecimal a5_AMOUNT_OF_MAX_LOSS) {
		A5_AMOUNT_OF_MAX_LOSS = a5_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA5_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A5_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA5_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a5_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A5_AMOUNT_OF_ACTUAL_GROSS_LOSS = a5_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA5_AMOUNT_RECOVERED() {
		return A5_AMOUNT_RECOVERED;
	}
	public void setA5_AMOUNT_RECOVERED(BigDecimal a5_AMOUNT_RECOVERED) {
		A5_AMOUNT_RECOVERED = a5_AMOUNT_RECOVERED;
	}
	public BigDecimal getA5_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A5_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA5_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a5_AMOUNT_CLAIMED_FROM_INSURERS) {
		A5_AMOUNT_CLAIMED_FROM_INSURERS = a5_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA5_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A5_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA5_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a5_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A5_AMOUNT_RECOVERED_THROUGH_INSURERS = a5_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA5_ACTUAL_NET_LOSS() {
		return A5_ACTUAL_NET_LOSS;
	}
	public void setA5_ACTUAL_NET_LOSS(BigDecimal a5_ACTUAL_NET_LOSS) {
		A5_ACTUAL_NET_LOSS = a5_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA5_TOTAL_NO_OF_NEAR_MISS() {
		return A5_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA5_TOTAL_NO_OF_NEAR_MISS(BigDecimal a5_TOTAL_NO_OF_NEAR_MISS) {
		A5_TOTAL_NO_OF_NEAR_MISS = a5_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA5_NO_OF_SIGNIFICANT_EVENTS() {
		return A5_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA5_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a5_NO_OF_SIGNIFICANT_EVENTS) {
		A5_NO_OF_SIGNIFICANT_EVENTS = a5_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA5_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A5_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA5_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a5_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A5_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a5_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA5_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A5_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA5_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a5_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A5_SIGNIFICANT_EVENT_ACTUAL_LOSS = a5_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA5_PREV_GROSS_LOSS() {
		return A5_PREV_GROSS_LOSS;
	}
	public void setA5_PREV_GROSS_LOSS(BigDecimal a5_PREV_GROSS_LOSS) {
		A5_PREV_GROSS_LOSS = a5_PREV_GROSS_LOSS;
	}
	public BigDecimal getA5_PREV_AMOUNT_RECOVERED() {
		return A5_PREV_AMOUNT_RECOVERED;
	}
	public void setA5_PREV_AMOUNT_RECOVERED(BigDecimal a5_PREV_AMOUNT_RECOVERED) {
		A5_PREV_AMOUNT_RECOVERED = a5_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA5_PREV_AMOUNT_CLAIMED() {
		return A5_PREV_AMOUNT_CLAIMED;
	}
	public void setA5_PREV_AMOUNT_CLAIMED(BigDecimal a5_PREV_AMOUNT_CLAIMED) {
		A5_PREV_AMOUNT_CLAIMED = a5_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA5_PREVT_AMOUNT_RECOVERED() {
		return A5_PREVT_AMOUNT_RECOVERED;
	}
	public void setA5_PREVT_AMOUNT_RECOVERED(BigDecimal a5_PREVT_AMOUNT_RECOVERED) {
		A5_PREVT_AMOUNT_RECOVERED = a5_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA5_PREV_ACTUAL_NET_LOSS() {
		return A5_PREV_ACTUAL_NET_LOSS;
	}
	public void setA5_PREV_ACTUAL_NET_LOSS(BigDecimal a5_PREV_ACTUAL_NET_LOSS) {
		A5_PREV_ACTUAL_NET_LOSS = a5_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA5_CUR_ACTUAL_GROSS_LOSS() {
		return A5_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA5_CUR_ACTUAL_GROSS_LOSS(BigDecimal a5_CUR_ACTUAL_GROSS_LOSS) {
		A5_CUR_ACTUAL_GROSS_LOSS = a5_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA5_CUR_AMOUNT_RECOVERED() {
		return A5_CUR_AMOUNT_RECOVERED;
	}
	public void setA5_CUR_AMOUNT_RECOVERED(BigDecimal a5_CUR_AMOUNT_RECOVERED) {
		A5_CUR_AMOUNT_RECOVERED = a5_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA5_CUT_AMOUNT_CLAIMED() {
		return A5_CUT_AMOUNT_CLAIMED;
	}
	public void setA5_CUT_AMOUNT_CLAIMED(BigDecimal a5_CUT_AMOUNT_CLAIMED) {
		A5_CUT_AMOUNT_CLAIMED = a5_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA5_CUT_AMOUNT_RECOVERED() {
		return A5_CUT_AMOUNT_RECOVERED;
	}
	public void setA5_CUT_AMOUNT_RECOVERED(BigDecimal a5_CUT_AMOUNT_RECOVERED) {
		A5_CUT_AMOUNT_RECOVERED = a5_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA5_CUR_ACTUAL_NET_LOSS() {
		return A5_CUR_ACTUAL_NET_LOSS;
	}
	public void setA5_CUR_ACTUAL_NET_LOSS(BigDecimal a5_CUR_ACTUAL_NET_LOSS) {
		A5_CUR_ACTUAL_NET_LOSS = a5_CUR_ACTUAL_NET_LOSS;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_TOTAL_NO_EVENT() {
		return A6_TOTAL_NO_EVENT;
	}
	public void setA6_TOTAL_NO_EVENT(BigDecimal a6_TOTAL_NO_EVENT) {
		A6_TOTAL_NO_EVENT = a6_TOTAL_NO_EVENT;
	}
	public BigDecimal getA6_NO_OF_CUST_EFFECTED() {
		return A6_NO_OF_CUST_EFFECTED;
	}
	public void setA6_NO_OF_CUST_EFFECTED(BigDecimal a6_NO_OF_CUST_EFFECTED) {
		A6_NO_OF_CUST_EFFECTED = a6_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA6_AMOUNT_INVOLVED() {
		return A6_AMOUNT_INVOLVED;
	}
	public void setA6_AMOUNT_INVOLVED(BigDecimal a6_AMOUNT_INVOLVED) {
		A6_AMOUNT_INVOLVED = a6_AMOUNT_INVOLVED;
	}
	public BigDecimal getA6_NO_OF_FUNC_AREAS_INVOLVED() {
		return A6_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA6_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a6_NO_OF_FUNC_AREAS_INVOLVED) {
		A6_NO_OF_FUNC_AREAS_INVOLVED = a6_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA6_AMOUNT_OF_MAX_LOSS() {
		return A6_AMOUNT_OF_MAX_LOSS;
	}
	public void setA6_AMOUNT_OF_MAX_LOSS(BigDecimal a6_AMOUNT_OF_MAX_LOSS) {
		A6_AMOUNT_OF_MAX_LOSS = a6_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA6_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A6_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA6_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a6_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A6_AMOUNT_OF_ACTUAL_GROSS_LOSS = a6_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA6_AMOUNT_RECOVERED() {
		return A6_AMOUNT_RECOVERED;
	}
	public void setA6_AMOUNT_RECOVERED(BigDecimal a6_AMOUNT_RECOVERED) {
		A6_AMOUNT_RECOVERED = a6_AMOUNT_RECOVERED;
	}
	public BigDecimal getA6_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A6_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA6_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a6_AMOUNT_CLAIMED_FROM_INSURERS) {
		A6_AMOUNT_CLAIMED_FROM_INSURERS = a6_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA6_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A6_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA6_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a6_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A6_AMOUNT_RECOVERED_THROUGH_INSURERS = a6_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA6_ACTUAL_NET_LOSS() {
		return A6_ACTUAL_NET_LOSS;
	}
	public void setA6_ACTUAL_NET_LOSS(BigDecimal a6_ACTUAL_NET_LOSS) {
		A6_ACTUAL_NET_LOSS = a6_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA6_TOTAL_NO_OF_NEAR_MISS() {
		return A6_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA6_TOTAL_NO_OF_NEAR_MISS(BigDecimal a6_TOTAL_NO_OF_NEAR_MISS) {
		A6_TOTAL_NO_OF_NEAR_MISS = a6_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA6_NO_OF_SIGNIFICANT_EVENTS() {
		return A6_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA6_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a6_NO_OF_SIGNIFICANT_EVENTS) {
		A6_NO_OF_SIGNIFICANT_EVENTS = a6_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA6_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A6_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA6_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a6_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A6_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a6_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA6_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A6_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA6_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a6_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A6_SIGNIFICANT_EVENT_ACTUAL_LOSS = a6_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA6_PREV_GROSS_LOSS() {
		return A6_PREV_GROSS_LOSS;
	}
	public void setA6_PREV_GROSS_LOSS(BigDecimal a6_PREV_GROSS_LOSS) {
		A6_PREV_GROSS_LOSS = a6_PREV_GROSS_LOSS;
	}
	public BigDecimal getA6_PREV_AMOUNT_RECOVERED() {
		return A6_PREV_AMOUNT_RECOVERED;
	}
	public void setA6_PREV_AMOUNT_RECOVERED(BigDecimal a6_PREV_AMOUNT_RECOVERED) {
		A6_PREV_AMOUNT_RECOVERED = a6_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA6_PREV_AMOUNT_CLAIMED() {
		return A6_PREV_AMOUNT_CLAIMED;
	}
	public void setA6_PREV_AMOUNT_CLAIMED(BigDecimal a6_PREV_AMOUNT_CLAIMED) {
		A6_PREV_AMOUNT_CLAIMED = a6_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA6_PREVT_AMOUNT_RECOVERED() {
		return A6_PREVT_AMOUNT_RECOVERED;
	}
	public void setA6_PREVT_AMOUNT_RECOVERED(BigDecimal a6_PREVT_AMOUNT_RECOVERED) {
		A6_PREVT_AMOUNT_RECOVERED = a6_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA6_PREV_ACTUAL_NET_LOSS() {
		return A6_PREV_ACTUAL_NET_LOSS;
	}
	public void setA6_PREV_ACTUAL_NET_LOSS(BigDecimal a6_PREV_ACTUAL_NET_LOSS) {
		A6_PREV_ACTUAL_NET_LOSS = a6_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA6_CUR_ACTUAL_GROSS_LOSS() {
		return A6_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA6_CUR_ACTUAL_GROSS_LOSS(BigDecimal a6_CUR_ACTUAL_GROSS_LOSS) {
		A6_CUR_ACTUAL_GROSS_LOSS = a6_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA6_CUR_AMOUNT_RECOVERED() {
		return A6_CUR_AMOUNT_RECOVERED;
	}
	public void setA6_CUR_AMOUNT_RECOVERED(BigDecimal a6_CUR_AMOUNT_RECOVERED) {
		A6_CUR_AMOUNT_RECOVERED = a6_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA6_CUT_AMOUNT_CLAIMED() {
		return A6_CUT_AMOUNT_CLAIMED;
	}
	public void setA6_CUT_AMOUNT_CLAIMED(BigDecimal a6_CUT_AMOUNT_CLAIMED) {
		A6_CUT_AMOUNT_CLAIMED = a6_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA6_CUT_AMOUNT_RECOVERED() {
		return A6_CUT_AMOUNT_RECOVERED;
	}
	public void setA6_CUT_AMOUNT_RECOVERED(BigDecimal a6_CUT_AMOUNT_RECOVERED) {
		A6_CUT_AMOUNT_RECOVERED = a6_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA6_CUR_ACTUAL_NET_LOSS() {
		return A6_CUR_ACTUAL_NET_LOSS;
	}
	public void setA6_CUR_ACTUAL_NET_LOSS(BigDecimal a6_CUR_ACTUAL_NET_LOSS) {
		A6_CUR_ACTUAL_NET_LOSS = a6_CUR_ACTUAL_NET_LOSS;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_TOTAL_NO_EVENT() {
		return A7_TOTAL_NO_EVENT;
	}
	public void setA7_TOTAL_NO_EVENT(BigDecimal a7_TOTAL_NO_EVENT) {
		A7_TOTAL_NO_EVENT = a7_TOTAL_NO_EVENT;
	}
	public BigDecimal getA7_NO_OF_CUST_EFFECTED() {
		return A7_NO_OF_CUST_EFFECTED;
	}
	public void setA7_NO_OF_CUST_EFFECTED(BigDecimal a7_NO_OF_CUST_EFFECTED) {
		A7_NO_OF_CUST_EFFECTED = a7_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA7_AMOUNT_INVOLVED() {
		return A7_AMOUNT_INVOLVED;
	}
	public void setA7_AMOUNT_INVOLVED(BigDecimal a7_AMOUNT_INVOLVED) {
		A7_AMOUNT_INVOLVED = a7_AMOUNT_INVOLVED;
	}
	public BigDecimal getA7_NO_OF_FUNC_AREAS_INVOLVED() {
		return A7_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA7_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a7_NO_OF_FUNC_AREAS_INVOLVED) {
		A7_NO_OF_FUNC_AREAS_INVOLVED = a7_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA7_AMOUNT_OF_MAX_LOSS() {
		return A7_AMOUNT_OF_MAX_LOSS;
	}
	public void setA7_AMOUNT_OF_MAX_LOSS(BigDecimal a7_AMOUNT_OF_MAX_LOSS) {
		A7_AMOUNT_OF_MAX_LOSS = a7_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA7_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A7_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA7_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a7_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A7_AMOUNT_OF_ACTUAL_GROSS_LOSS = a7_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA7_AMOUNT_RECOVERED() {
		return A7_AMOUNT_RECOVERED;
	}
	public void setA7_AMOUNT_RECOVERED(BigDecimal a7_AMOUNT_RECOVERED) {
		A7_AMOUNT_RECOVERED = a7_AMOUNT_RECOVERED;
	}
	public BigDecimal getA7_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A7_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA7_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a7_AMOUNT_CLAIMED_FROM_INSURERS) {
		A7_AMOUNT_CLAIMED_FROM_INSURERS = a7_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA7_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A7_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA7_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a7_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A7_AMOUNT_RECOVERED_THROUGH_INSURERS = a7_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA7_ACTUAL_NET_LOSS() {
		return A7_ACTUAL_NET_LOSS;
	}
	public void setA7_ACTUAL_NET_LOSS(BigDecimal a7_ACTUAL_NET_LOSS) {
		A7_ACTUAL_NET_LOSS = a7_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA7_TOTAL_NO_OF_NEAR_MISS() {
		return A7_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA7_TOTAL_NO_OF_NEAR_MISS(BigDecimal a7_TOTAL_NO_OF_NEAR_MISS) {
		A7_TOTAL_NO_OF_NEAR_MISS = a7_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA7_NO_OF_SIGNIFICANT_EVENTS() {
		return A7_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA7_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a7_NO_OF_SIGNIFICANT_EVENTS) {
		A7_NO_OF_SIGNIFICANT_EVENTS = a7_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA7_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A7_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA7_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a7_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A7_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a7_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA7_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A7_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA7_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a7_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A7_SIGNIFICANT_EVENT_ACTUAL_LOSS = a7_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA7_PREV_GROSS_LOSS() {
		return A7_PREV_GROSS_LOSS;
	}
	public void setA7_PREV_GROSS_LOSS(BigDecimal a7_PREV_GROSS_LOSS) {
		A7_PREV_GROSS_LOSS = a7_PREV_GROSS_LOSS;
	}
	public BigDecimal getA7_PREV_AMOUNT_RECOVERED() {
		return A7_PREV_AMOUNT_RECOVERED;
	}
	public void setA7_PREV_AMOUNT_RECOVERED(BigDecimal a7_PREV_AMOUNT_RECOVERED) {
		A7_PREV_AMOUNT_RECOVERED = a7_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA7_PREV_AMOUNT_CLAIMED() {
		return A7_PREV_AMOUNT_CLAIMED;
	}
	public void setA7_PREV_AMOUNT_CLAIMED(BigDecimal a7_PREV_AMOUNT_CLAIMED) {
		A7_PREV_AMOUNT_CLAIMED = a7_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA7_PREVT_AMOUNT_RECOVERED() {
		return A7_PREVT_AMOUNT_RECOVERED;
	}
	public void setA7_PREVT_AMOUNT_RECOVERED(BigDecimal a7_PREVT_AMOUNT_RECOVERED) {
		A7_PREVT_AMOUNT_RECOVERED = a7_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA7_PREV_ACTUAL_NET_LOSS() {
		return A7_PREV_ACTUAL_NET_LOSS;
	}
	public void setA7_PREV_ACTUAL_NET_LOSS(BigDecimal a7_PREV_ACTUAL_NET_LOSS) {
		A7_PREV_ACTUAL_NET_LOSS = a7_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA7_CUR_ACTUAL_GROSS_LOSS() {
		return A7_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA7_CUR_ACTUAL_GROSS_LOSS(BigDecimal a7_CUR_ACTUAL_GROSS_LOSS) {
		A7_CUR_ACTUAL_GROSS_LOSS = a7_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA7_CUR_AMOUNT_RECOVERED() {
		return A7_CUR_AMOUNT_RECOVERED;
	}
	public void setA7_CUR_AMOUNT_RECOVERED(BigDecimal a7_CUR_AMOUNT_RECOVERED) {
		A7_CUR_AMOUNT_RECOVERED = a7_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA7_CUT_AMOUNT_CLAIMED() {
		return A7_CUT_AMOUNT_CLAIMED;
	}
	public void setA7_CUT_AMOUNT_CLAIMED(BigDecimal a7_CUT_AMOUNT_CLAIMED) {
		A7_CUT_AMOUNT_CLAIMED = a7_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA7_CUT_AMOUNT_RECOVERED() {
		return A7_CUT_AMOUNT_RECOVERED;
	}
	public void setA7_CUT_AMOUNT_RECOVERED(BigDecimal a7_CUT_AMOUNT_RECOVERED) {
		A7_CUT_AMOUNT_RECOVERED = a7_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA7_CUR_ACTUAL_NET_LOSS() {
		return A7_CUR_ACTUAL_NET_LOSS;
	}
	public void setA7_CUR_ACTUAL_NET_LOSS(BigDecimal a7_CUR_ACTUAL_NET_LOSS) {
		A7_CUR_ACTUAL_NET_LOSS = a7_CUR_ACTUAL_NET_LOSS;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_TOTAL_NO_EVENT() {
		return A8_TOTAL_NO_EVENT;
	}
	public void setA8_TOTAL_NO_EVENT(BigDecimal a8_TOTAL_NO_EVENT) {
		A8_TOTAL_NO_EVENT = a8_TOTAL_NO_EVENT;
	}
	public BigDecimal getA8_NO_OF_CUST_EFFECTED() {
		return A8_NO_OF_CUST_EFFECTED;
	}
	public void setA8_NO_OF_CUST_EFFECTED(BigDecimal a8_NO_OF_CUST_EFFECTED) {
		A8_NO_OF_CUST_EFFECTED = a8_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA8_AMOUNT_INVOLVED() {
		return A8_AMOUNT_INVOLVED;
	}
	public void setA8_AMOUNT_INVOLVED(BigDecimal a8_AMOUNT_INVOLVED) {
		A8_AMOUNT_INVOLVED = a8_AMOUNT_INVOLVED;
	}
	public BigDecimal getA8_NO_OF_FUNC_AREAS_INVOLVED() {
		return A8_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA8_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a8_NO_OF_FUNC_AREAS_INVOLVED) {
		A8_NO_OF_FUNC_AREAS_INVOLVED = a8_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA8_AMOUNT_OF_MAX_LOSS() {
		return A8_AMOUNT_OF_MAX_LOSS;
	}
	public void setA8_AMOUNT_OF_MAX_LOSS(BigDecimal a8_AMOUNT_OF_MAX_LOSS) {
		A8_AMOUNT_OF_MAX_LOSS = a8_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA8_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A8_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA8_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a8_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A8_AMOUNT_OF_ACTUAL_GROSS_LOSS = a8_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA8_AMOUNT_RECOVERED() {
		return A8_AMOUNT_RECOVERED;
	}
	public void setA8_AMOUNT_RECOVERED(BigDecimal a8_AMOUNT_RECOVERED) {
		A8_AMOUNT_RECOVERED = a8_AMOUNT_RECOVERED;
	}
	public BigDecimal getA8_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A8_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA8_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a8_AMOUNT_CLAIMED_FROM_INSURERS) {
		A8_AMOUNT_CLAIMED_FROM_INSURERS = a8_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA8_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A8_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA8_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a8_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A8_AMOUNT_RECOVERED_THROUGH_INSURERS = a8_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA8_ACTUAL_NET_LOSS() {
		return A8_ACTUAL_NET_LOSS;
	}
	public void setA8_ACTUAL_NET_LOSS(BigDecimal a8_ACTUAL_NET_LOSS) {
		A8_ACTUAL_NET_LOSS = a8_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA8_TOTAL_NO_OF_NEAR_MISS() {
		return A8_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA8_TOTAL_NO_OF_NEAR_MISS(BigDecimal a8_TOTAL_NO_OF_NEAR_MISS) {
		A8_TOTAL_NO_OF_NEAR_MISS = a8_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA8_NO_OF_SIGNIFICANT_EVENTS() {
		return A8_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA8_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a8_NO_OF_SIGNIFICANT_EVENTS) {
		A8_NO_OF_SIGNIFICANT_EVENTS = a8_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA8_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A8_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA8_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a8_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A8_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a8_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA8_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A8_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA8_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a8_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A8_SIGNIFICANT_EVENT_ACTUAL_LOSS = a8_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA8_PREV_GROSS_LOSS() {
		return A8_PREV_GROSS_LOSS;
	}
	public void setA8_PREV_GROSS_LOSS(BigDecimal a8_PREV_GROSS_LOSS) {
		A8_PREV_GROSS_LOSS = a8_PREV_GROSS_LOSS;
	}
	public BigDecimal getA8_PREV_AMOUNT_RECOVERED() {
		return A8_PREV_AMOUNT_RECOVERED;
	}
	public void setA8_PREV_AMOUNT_RECOVERED(BigDecimal a8_PREV_AMOUNT_RECOVERED) {
		A8_PREV_AMOUNT_RECOVERED = a8_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA8_PREV_AMOUNT_CLAIMED() {
		return A8_PREV_AMOUNT_CLAIMED;
	}
	public void setA8_PREV_AMOUNT_CLAIMED(BigDecimal a8_PREV_AMOUNT_CLAIMED) {
		A8_PREV_AMOUNT_CLAIMED = a8_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA8_PREVT_AMOUNT_RECOVERED() {
		return A8_PREVT_AMOUNT_RECOVERED;
	}
	public void setA8_PREVT_AMOUNT_RECOVERED(BigDecimal a8_PREVT_AMOUNT_RECOVERED) {
		A8_PREVT_AMOUNT_RECOVERED = a8_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA8_PREV_ACTUAL_NET_LOSS() {
		return A8_PREV_ACTUAL_NET_LOSS;
	}
	public void setA8_PREV_ACTUAL_NET_LOSS(BigDecimal a8_PREV_ACTUAL_NET_LOSS) {
		A8_PREV_ACTUAL_NET_LOSS = a8_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA8_CUR_ACTUAL_GROSS_LOSS() {
		return A8_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA8_CUR_ACTUAL_GROSS_LOSS(BigDecimal a8_CUR_ACTUAL_GROSS_LOSS) {
		A8_CUR_ACTUAL_GROSS_LOSS = a8_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA8_CUR_AMOUNT_RECOVERED() {
		return A8_CUR_AMOUNT_RECOVERED;
	}
	public void setA8_CUR_AMOUNT_RECOVERED(BigDecimal a8_CUR_AMOUNT_RECOVERED) {
		A8_CUR_AMOUNT_RECOVERED = a8_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA8_CUT_AMOUNT_CLAIMED() {
		return A8_CUT_AMOUNT_CLAIMED;
	}
	public void setA8_CUT_AMOUNT_CLAIMED(BigDecimal a8_CUT_AMOUNT_CLAIMED) {
		A8_CUT_AMOUNT_CLAIMED = a8_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA8_CUT_AMOUNT_RECOVERED() {
		return A8_CUT_AMOUNT_RECOVERED;
	}
	public void setA8_CUT_AMOUNT_RECOVERED(BigDecimal a8_CUT_AMOUNT_RECOVERED) {
		A8_CUT_AMOUNT_RECOVERED = a8_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA8_CUR_ACTUAL_NET_LOSS() {
		return A8_CUR_ACTUAL_NET_LOSS;
	}
	public void setA8_CUR_ACTUAL_NET_LOSS(BigDecimal a8_CUR_ACTUAL_NET_LOSS) {
		A8_CUR_ACTUAL_NET_LOSS = a8_CUR_ACTUAL_NET_LOSS;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_TOTAL_NO_EVENT() {
		return A9_TOTAL_NO_EVENT;
	}
	public void setA9_TOTAL_NO_EVENT(BigDecimal a9_TOTAL_NO_EVENT) {
		A9_TOTAL_NO_EVENT = a9_TOTAL_NO_EVENT;
	}
	public BigDecimal getA9_NO_OF_CUST_EFFECTED() {
		return A9_NO_OF_CUST_EFFECTED;
	}
	public void setA9_NO_OF_CUST_EFFECTED(BigDecimal a9_NO_OF_CUST_EFFECTED) {
		A9_NO_OF_CUST_EFFECTED = a9_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA9_AMOUNT_INVOLVED() {
		return A9_AMOUNT_INVOLVED;
	}
	public void setA9_AMOUNT_INVOLVED(BigDecimal a9_AMOUNT_INVOLVED) {
		A9_AMOUNT_INVOLVED = a9_AMOUNT_INVOLVED;
	}
	public BigDecimal getA9_NO_OF_FUNC_AREAS_INVOLVED() {
		return A9_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA9_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a9_NO_OF_FUNC_AREAS_INVOLVED) {
		A9_NO_OF_FUNC_AREAS_INVOLVED = a9_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA9_AMOUNT_OF_MAX_LOSS() {
		return A9_AMOUNT_OF_MAX_LOSS;
	}
	public void setA9_AMOUNT_OF_MAX_LOSS(BigDecimal a9_AMOUNT_OF_MAX_LOSS) {
		A9_AMOUNT_OF_MAX_LOSS = a9_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA9_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A9_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA9_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a9_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A9_AMOUNT_OF_ACTUAL_GROSS_LOSS = a9_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA9_AMOUNT_RECOVERED() {
		return A9_AMOUNT_RECOVERED;
	}
	public void setA9_AMOUNT_RECOVERED(BigDecimal a9_AMOUNT_RECOVERED) {
		A9_AMOUNT_RECOVERED = a9_AMOUNT_RECOVERED;
	}
	public BigDecimal getA9_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A9_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA9_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a9_AMOUNT_CLAIMED_FROM_INSURERS) {
		A9_AMOUNT_CLAIMED_FROM_INSURERS = a9_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA9_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A9_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA9_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a9_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A9_AMOUNT_RECOVERED_THROUGH_INSURERS = a9_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA9_ACTUAL_NET_LOSS() {
		return A9_ACTUAL_NET_LOSS;
	}
	public void setA9_ACTUAL_NET_LOSS(BigDecimal a9_ACTUAL_NET_LOSS) {
		A9_ACTUAL_NET_LOSS = a9_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA9_TOTAL_NO_OF_NEAR_MISS() {
		return A9_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA9_TOTAL_NO_OF_NEAR_MISS(BigDecimal a9_TOTAL_NO_OF_NEAR_MISS) {
		A9_TOTAL_NO_OF_NEAR_MISS = a9_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA9_NO_OF_SIGNIFICANT_EVENTS() {
		return A9_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA9_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a9_NO_OF_SIGNIFICANT_EVENTS) {
		A9_NO_OF_SIGNIFICANT_EVENTS = a9_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA9_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A9_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA9_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a9_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A9_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a9_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA9_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A9_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA9_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a9_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A9_SIGNIFICANT_EVENT_ACTUAL_LOSS = a9_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA9_PREV_GROSS_LOSS() {
		return A9_PREV_GROSS_LOSS;
	}
	public void setA9_PREV_GROSS_LOSS(BigDecimal a9_PREV_GROSS_LOSS) {
		A9_PREV_GROSS_LOSS = a9_PREV_GROSS_LOSS;
	}
	public BigDecimal getA9_PREV_AMOUNT_RECOVERED() {
		return A9_PREV_AMOUNT_RECOVERED;
	}
	public void setA9_PREV_AMOUNT_RECOVERED(BigDecimal a9_PREV_AMOUNT_RECOVERED) {
		A9_PREV_AMOUNT_RECOVERED = a9_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA9_PREV_AMOUNT_CLAIMED() {
		return A9_PREV_AMOUNT_CLAIMED;
	}
	public void setA9_PREV_AMOUNT_CLAIMED(BigDecimal a9_PREV_AMOUNT_CLAIMED) {
		A9_PREV_AMOUNT_CLAIMED = a9_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA9_PREVT_AMOUNT_RECOVERED() {
		return A9_PREVT_AMOUNT_RECOVERED;
	}
	public void setA9_PREVT_AMOUNT_RECOVERED(BigDecimal a9_PREVT_AMOUNT_RECOVERED) {
		A9_PREVT_AMOUNT_RECOVERED = a9_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA9_PREV_ACTUAL_NET_LOSS() {
		return A9_PREV_ACTUAL_NET_LOSS;
	}
	public void setA9_PREV_ACTUAL_NET_LOSS(BigDecimal a9_PREV_ACTUAL_NET_LOSS) {
		A9_PREV_ACTUAL_NET_LOSS = a9_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA9_CUR_ACTUAL_GROSS_LOSS() {
		return A9_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA9_CUR_ACTUAL_GROSS_LOSS(BigDecimal a9_CUR_ACTUAL_GROSS_LOSS) {
		A9_CUR_ACTUAL_GROSS_LOSS = a9_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA9_CUR_AMOUNT_RECOVERED() {
		return A9_CUR_AMOUNT_RECOVERED;
	}
	public void setA9_CUR_AMOUNT_RECOVERED(BigDecimal a9_CUR_AMOUNT_RECOVERED) {
		A9_CUR_AMOUNT_RECOVERED = a9_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA9_CUT_AMOUNT_CLAIMED() {
		return A9_CUT_AMOUNT_CLAIMED;
	}
	public void setA9_CUT_AMOUNT_CLAIMED(BigDecimal a9_CUT_AMOUNT_CLAIMED) {
		A9_CUT_AMOUNT_CLAIMED = a9_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA9_CUT_AMOUNT_RECOVERED() {
		return A9_CUT_AMOUNT_RECOVERED;
	}
	public void setA9_CUT_AMOUNT_RECOVERED(BigDecimal a9_CUT_AMOUNT_RECOVERED) {
		A9_CUT_AMOUNT_RECOVERED = a9_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA9_CUR_ACTUAL_NET_LOSS() {
		return A9_CUR_ACTUAL_NET_LOSS;
	}
	public void setA9_CUR_ACTUAL_NET_LOSS(BigDecimal a9_CUR_ACTUAL_NET_LOSS) {
		A9_CUR_ACTUAL_NET_LOSS = a9_CUR_ACTUAL_NET_LOSS;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10_TOTAL_NO_EVENT() {
		return A10_TOTAL_NO_EVENT;
	}
	public void setA10_TOTAL_NO_EVENT(BigDecimal a10_TOTAL_NO_EVENT) {
		A10_TOTAL_NO_EVENT = a10_TOTAL_NO_EVENT;
	}
	public BigDecimal getA10_NO_OF_CUST_EFFECTED() {
		return A10_NO_OF_CUST_EFFECTED;
	}
	public void setA10_NO_OF_CUST_EFFECTED(BigDecimal a10_NO_OF_CUST_EFFECTED) {
		A10_NO_OF_CUST_EFFECTED = a10_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA10_AMOUNT_INVOLVED() {
		return A10_AMOUNT_INVOLVED;
	}
	public void setA10_AMOUNT_INVOLVED(BigDecimal a10_AMOUNT_INVOLVED) {
		A10_AMOUNT_INVOLVED = a10_AMOUNT_INVOLVED;
	}
	public BigDecimal getA10_NO_OF_FUNC_AREAS_INVOLVED() {
		return A10_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA10_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a10_NO_OF_FUNC_AREAS_INVOLVED) {
		A10_NO_OF_FUNC_AREAS_INVOLVED = a10_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA10_AMOUNT_OF_MAX_LOSS() {
		return A10_AMOUNT_OF_MAX_LOSS;
	}
	public void setA10_AMOUNT_OF_MAX_LOSS(BigDecimal a10_AMOUNT_OF_MAX_LOSS) {
		A10_AMOUNT_OF_MAX_LOSS = a10_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA10_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A10_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA10_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a10_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A10_AMOUNT_OF_ACTUAL_GROSS_LOSS = a10_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA10_AMOUNT_RECOVERED() {
		return A10_AMOUNT_RECOVERED;
	}
	public void setA10_AMOUNT_RECOVERED(BigDecimal a10_AMOUNT_RECOVERED) {
		A10_AMOUNT_RECOVERED = a10_AMOUNT_RECOVERED;
	}
	public BigDecimal getA10_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A10_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA10_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a10_AMOUNT_CLAIMED_FROM_INSURERS) {
		A10_AMOUNT_CLAIMED_FROM_INSURERS = a10_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA10_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A10_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA10_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a10_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A10_AMOUNT_RECOVERED_THROUGH_INSURERS = a10_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA10_ACTUAL_NET_LOSS() {
		return A10_ACTUAL_NET_LOSS;
	}
	public void setA10_ACTUAL_NET_LOSS(BigDecimal a10_ACTUAL_NET_LOSS) {
		A10_ACTUAL_NET_LOSS = a10_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA10_TOTAL_NO_OF_NEAR_MISS() {
		return A10_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA10_TOTAL_NO_OF_NEAR_MISS(BigDecimal a10_TOTAL_NO_OF_NEAR_MISS) {
		A10_TOTAL_NO_OF_NEAR_MISS = a10_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA10_NO_OF_SIGNIFICANT_EVENTS() {
		return A10_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA10_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a10_NO_OF_SIGNIFICANT_EVENTS) {
		A10_NO_OF_SIGNIFICANT_EVENTS = a10_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA10_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A10_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA10_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a10_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A10_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a10_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA10_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A10_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA10_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a10_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A10_SIGNIFICANT_EVENT_ACTUAL_LOSS = a10_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA10_PREV_GROSS_LOSS() {
		return A10_PREV_GROSS_LOSS;
	}
	public void setA10_PREV_GROSS_LOSS(BigDecimal a10_PREV_GROSS_LOSS) {
		A10_PREV_GROSS_LOSS = a10_PREV_GROSS_LOSS;
	}
	public BigDecimal getA10_PREV_AMOUNT_RECOVERED() {
		return A10_PREV_AMOUNT_RECOVERED;
	}
	public void setA10_PREV_AMOUNT_RECOVERED(BigDecimal a10_PREV_AMOUNT_RECOVERED) {
		A10_PREV_AMOUNT_RECOVERED = a10_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA10_PREV_AMOUNT_CLAIMED() {
		return A10_PREV_AMOUNT_CLAIMED;
	}
	public void setA10_PREV_AMOUNT_CLAIMED(BigDecimal a10_PREV_AMOUNT_CLAIMED) {
		A10_PREV_AMOUNT_CLAIMED = a10_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA10_PREVT_AMOUNT_RECOVERED() {
		return A10_PREVT_AMOUNT_RECOVERED;
	}
	public void setA10_PREVT_AMOUNT_RECOVERED(BigDecimal a10_PREVT_AMOUNT_RECOVERED) {
		A10_PREVT_AMOUNT_RECOVERED = a10_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA10_PREV_ACTUAL_NET_LOSS() {
		return A10_PREV_ACTUAL_NET_LOSS;
	}
	public void setA10_PREV_ACTUAL_NET_LOSS(BigDecimal a10_PREV_ACTUAL_NET_LOSS) {
		A10_PREV_ACTUAL_NET_LOSS = a10_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA10_CUR_ACTUAL_GROSS_LOSS() {
		return A10_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA10_CUR_ACTUAL_GROSS_LOSS(BigDecimal a10_CUR_ACTUAL_GROSS_LOSS) {
		A10_CUR_ACTUAL_GROSS_LOSS = a10_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA10_CUR_AMOUNT_RECOVERED() {
		return A10_CUR_AMOUNT_RECOVERED;
	}
	public void setA10_CUR_AMOUNT_RECOVERED(BigDecimal a10_CUR_AMOUNT_RECOVERED) {
		A10_CUR_AMOUNT_RECOVERED = a10_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA10_CUT_AMOUNT_CLAIMED() {
		return A10_CUT_AMOUNT_CLAIMED;
	}
	public void setA10_CUT_AMOUNT_CLAIMED(BigDecimal a10_CUT_AMOUNT_CLAIMED) {
		A10_CUT_AMOUNT_CLAIMED = a10_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA10_CUT_AMOUNT_RECOVERED() {
		return A10_CUT_AMOUNT_RECOVERED;
	}
	public void setA10_CUT_AMOUNT_RECOVERED(BigDecimal a10_CUT_AMOUNT_RECOVERED) {
		A10_CUT_AMOUNT_RECOVERED = a10_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA10_CUR_ACTUAL_NET_LOSS() {
		return A10_CUR_ACTUAL_NET_LOSS;
	}
	public void setA10_CUR_ACTUAL_NET_LOSS(BigDecimal a10_CUR_ACTUAL_NET_LOSS) {
		A10_CUR_ACTUAL_NET_LOSS = a10_CUR_ACTUAL_NET_LOSS;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_TOTAL_NO_EVENT() {
		return A11_TOTAL_NO_EVENT;
	}
	public void setA11_TOTAL_NO_EVENT(BigDecimal a11_TOTAL_NO_EVENT) {
		A11_TOTAL_NO_EVENT = a11_TOTAL_NO_EVENT;
	}
	public BigDecimal getA11_NO_OF_CUST_EFFECTED() {
		return A11_NO_OF_CUST_EFFECTED;
	}
	public void setA11_NO_OF_CUST_EFFECTED(BigDecimal a11_NO_OF_CUST_EFFECTED) {
		A11_NO_OF_CUST_EFFECTED = a11_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA11_AMOUNT_INVOLVED() {
		return A11_AMOUNT_INVOLVED;
	}
	public void setA11_AMOUNT_INVOLVED(BigDecimal a11_AMOUNT_INVOLVED) {
		A11_AMOUNT_INVOLVED = a11_AMOUNT_INVOLVED;
	}
	public BigDecimal getA11_NO_OF_FUNC_AREAS_INVOLVED() {
		return A11_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA11_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a11_NO_OF_FUNC_AREAS_INVOLVED) {
		A11_NO_OF_FUNC_AREAS_INVOLVED = a11_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA11_AMOUNT_OF_MAX_LOSS() {
		return A11_AMOUNT_OF_MAX_LOSS;
	}
	public void setA11_AMOUNT_OF_MAX_LOSS(BigDecimal a11_AMOUNT_OF_MAX_LOSS) {
		A11_AMOUNT_OF_MAX_LOSS = a11_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA11_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A11_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA11_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a11_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A11_AMOUNT_OF_ACTUAL_GROSS_LOSS = a11_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA11_AMOUNT_RECOVERED() {
		return A11_AMOUNT_RECOVERED;
	}
	public void setA11_AMOUNT_RECOVERED(BigDecimal a11_AMOUNT_RECOVERED) {
		A11_AMOUNT_RECOVERED = a11_AMOUNT_RECOVERED;
	}
	public BigDecimal getA11_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A11_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA11_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a11_AMOUNT_CLAIMED_FROM_INSURERS) {
		A11_AMOUNT_CLAIMED_FROM_INSURERS = a11_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA11_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A11_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA11_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a11_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A11_AMOUNT_RECOVERED_THROUGH_INSURERS = a11_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA11_ACTUAL_NET_LOSS() {
		return A11_ACTUAL_NET_LOSS;
	}
	public void setA11_ACTUAL_NET_LOSS(BigDecimal a11_ACTUAL_NET_LOSS) {
		A11_ACTUAL_NET_LOSS = a11_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA11_TOTAL_NO_OF_NEAR_MISS() {
		return A11_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA11_TOTAL_NO_OF_NEAR_MISS(BigDecimal a11_TOTAL_NO_OF_NEAR_MISS) {
		A11_TOTAL_NO_OF_NEAR_MISS = a11_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA11_NO_OF_SIGNIFICANT_EVENTS() {
		return A11_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA11_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a11_NO_OF_SIGNIFICANT_EVENTS) {
		A11_NO_OF_SIGNIFICANT_EVENTS = a11_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA11_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A11_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA11_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a11_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A11_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a11_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA11_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A11_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA11_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a11_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A11_SIGNIFICANT_EVENT_ACTUAL_LOSS = a11_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA11_PREV_GROSS_LOSS() {
		return A11_PREV_GROSS_LOSS;
	}
	public void setA11_PREV_GROSS_LOSS(BigDecimal a11_PREV_GROSS_LOSS) {
		A11_PREV_GROSS_LOSS = a11_PREV_GROSS_LOSS;
	}
	public BigDecimal getA11_PREV_AMOUNT_RECOVERED() {
		return A11_PREV_AMOUNT_RECOVERED;
	}
	public void setA11_PREV_AMOUNT_RECOVERED(BigDecimal a11_PREV_AMOUNT_RECOVERED) {
		A11_PREV_AMOUNT_RECOVERED = a11_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA11_PREV_AMOUNT_CLAIMED() {
		return A11_PREV_AMOUNT_CLAIMED;
	}
	public void setA11_PREV_AMOUNT_CLAIMED(BigDecimal a11_PREV_AMOUNT_CLAIMED) {
		A11_PREV_AMOUNT_CLAIMED = a11_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA11_PREVT_AMOUNT_RECOVERED() {
		return A11_PREVT_AMOUNT_RECOVERED;
	}
	public void setA11_PREVT_AMOUNT_RECOVERED(BigDecimal a11_PREVT_AMOUNT_RECOVERED) {
		A11_PREVT_AMOUNT_RECOVERED = a11_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA11_PREV_ACTUAL_NET_LOSS() {
		return A11_PREV_ACTUAL_NET_LOSS;
	}
	public void setA11_PREV_ACTUAL_NET_LOSS(BigDecimal a11_PREV_ACTUAL_NET_LOSS) {
		A11_PREV_ACTUAL_NET_LOSS = a11_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA11_CUR_ACTUAL_GROSS_LOSS() {
		return A11_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA11_CUR_ACTUAL_GROSS_LOSS(BigDecimal a11_CUR_ACTUAL_GROSS_LOSS) {
		A11_CUR_ACTUAL_GROSS_LOSS = a11_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA11_CUR_AMOUNT_RECOVERED() {
		return A11_CUR_AMOUNT_RECOVERED;
	}
	public void setA11_CUR_AMOUNT_RECOVERED(BigDecimal a11_CUR_AMOUNT_RECOVERED) {
		A11_CUR_AMOUNT_RECOVERED = a11_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA11_CUT_AMOUNT_CLAIMED() {
		return A11_CUT_AMOUNT_CLAIMED;
	}
	public void setA11_CUT_AMOUNT_CLAIMED(BigDecimal a11_CUT_AMOUNT_CLAIMED) {
		A11_CUT_AMOUNT_CLAIMED = a11_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA11_CUT_AMOUNT_RECOVERED() {
		return A11_CUT_AMOUNT_RECOVERED;
	}
	public void setA11_CUT_AMOUNT_RECOVERED(BigDecimal a11_CUT_AMOUNT_RECOVERED) {
		A11_CUT_AMOUNT_RECOVERED = a11_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA11_CUR_ACTUAL_NET_LOSS() {
		return A11_CUR_ACTUAL_NET_LOSS;
	}
	public void setA11_CUR_ACTUAL_NET_LOSS(BigDecimal a11_CUR_ACTUAL_NET_LOSS) {
		A11_CUR_ACTUAL_NET_LOSS = a11_CUR_ACTUAL_NET_LOSS;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_TOTAL_NO_EVENT() {
		return A12_TOTAL_NO_EVENT;
	}
	public void setA12_TOTAL_NO_EVENT(BigDecimal a12_TOTAL_NO_EVENT) {
		A12_TOTAL_NO_EVENT = a12_TOTAL_NO_EVENT;
	}
	public BigDecimal getA12_NO_OF_CUST_EFFECTED() {
		return A12_NO_OF_CUST_EFFECTED;
	}
	public void setA12_NO_OF_CUST_EFFECTED(BigDecimal a12_NO_OF_CUST_EFFECTED) {
		A12_NO_OF_CUST_EFFECTED = a12_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA12_AMOUNT_INVOLVED() {
		return A12_AMOUNT_INVOLVED;
	}
	public void setA12_AMOUNT_INVOLVED(BigDecimal a12_AMOUNT_INVOLVED) {
		A12_AMOUNT_INVOLVED = a12_AMOUNT_INVOLVED;
	}
	public BigDecimal getA12_NO_OF_FUNC_AREAS_INVOLVED() {
		return A12_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA12_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a12_NO_OF_FUNC_AREAS_INVOLVED) {
		A12_NO_OF_FUNC_AREAS_INVOLVED = a12_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA12_AMOUNT_OF_MAX_LOSS() {
		return A12_AMOUNT_OF_MAX_LOSS;
	}
	public void setA12_AMOUNT_OF_MAX_LOSS(BigDecimal a12_AMOUNT_OF_MAX_LOSS) {
		A12_AMOUNT_OF_MAX_LOSS = a12_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA12_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A12_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA12_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a12_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A12_AMOUNT_OF_ACTUAL_GROSS_LOSS = a12_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA12_AMOUNT_RECOVERED() {
		return A12_AMOUNT_RECOVERED;
	}
	public void setA12_AMOUNT_RECOVERED(BigDecimal a12_AMOUNT_RECOVERED) {
		A12_AMOUNT_RECOVERED = a12_AMOUNT_RECOVERED;
	}
	public BigDecimal getA12_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A12_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA12_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a12_AMOUNT_CLAIMED_FROM_INSURERS) {
		A12_AMOUNT_CLAIMED_FROM_INSURERS = a12_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA12_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A12_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA12_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a12_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A12_AMOUNT_RECOVERED_THROUGH_INSURERS = a12_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA12_ACTUAL_NET_LOSS() {
		return A12_ACTUAL_NET_LOSS;
	}
	public void setA12_ACTUAL_NET_LOSS(BigDecimal a12_ACTUAL_NET_LOSS) {
		A12_ACTUAL_NET_LOSS = a12_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA12_TOTAL_NO_OF_NEAR_MISS() {
		return A12_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA12_TOTAL_NO_OF_NEAR_MISS(BigDecimal a12_TOTAL_NO_OF_NEAR_MISS) {
		A12_TOTAL_NO_OF_NEAR_MISS = a12_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA12_NO_OF_SIGNIFICANT_EVENTS() {
		return A12_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA12_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a12_NO_OF_SIGNIFICANT_EVENTS) {
		A12_NO_OF_SIGNIFICANT_EVENTS = a12_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA12_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A12_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA12_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a12_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A12_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a12_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA12_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A12_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA12_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a12_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A12_SIGNIFICANT_EVENT_ACTUAL_LOSS = a12_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA12_PREV_GROSS_LOSS() {
		return A12_PREV_GROSS_LOSS;
	}
	public void setA12_PREV_GROSS_LOSS(BigDecimal a12_PREV_GROSS_LOSS) {
		A12_PREV_GROSS_LOSS = a12_PREV_GROSS_LOSS;
	}
	public BigDecimal getA12_PREV_AMOUNT_RECOVERED() {
		return A12_PREV_AMOUNT_RECOVERED;
	}
	public void setA12_PREV_AMOUNT_RECOVERED(BigDecimal a12_PREV_AMOUNT_RECOVERED) {
		A12_PREV_AMOUNT_RECOVERED = a12_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA12_PREV_AMOUNT_CLAIMED() {
		return A12_PREV_AMOUNT_CLAIMED;
	}
	public void setA12_PREV_AMOUNT_CLAIMED(BigDecimal a12_PREV_AMOUNT_CLAIMED) {
		A12_PREV_AMOUNT_CLAIMED = a12_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA12_PREVT_AMOUNT_RECOVERED() {
		return A12_PREVT_AMOUNT_RECOVERED;
	}
	public void setA12_PREVT_AMOUNT_RECOVERED(BigDecimal a12_PREVT_AMOUNT_RECOVERED) {
		A12_PREVT_AMOUNT_RECOVERED = a12_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA12_PREV_ACTUAL_NET_LOSS() {
		return A12_PREV_ACTUAL_NET_LOSS;
	}
	public void setA12_PREV_ACTUAL_NET_LOSS(BigDecimal a12_PREV_ACTUAL_NET_LOSS) {
		A12_PREV_ACTUAL_NET_LOSS = a12_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA12_CUR_ACTUAL_GROSS_LOSS() {
		return A12_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA12_CUR_ACTUAL_GROSS_LOSS(BigDecimal a12_CUR_ACTUAL_GROSS_LOSS) {
		A12_CUR_ACTUAL_GROSS_LOSS = a12_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA12_CUR_AMOUNT_RECOVERED() {
		return A12_CUR_AMOUNT_RECOVERED;
	}
	public void setA12_CUR_AMOUNT_RECOVERED(BigDecimal a12_CUR_AMOUNT_RECOVERED) {
		A12_CUR_AMOUNT_RECOVERED = a12_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA12_CUT_AMOUNT_CLAIMED() {
		return A12_CUT_AMOUNT_CLAIMED;
	}
	public void setA12_CUT_AMOUNT_CLAIMED(BigDecimal a12_CUT_AMOUNT_CLAIMED) {
		A12_CUT_AMOUNT_CLAIMED = a12_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA12_CUT_AMOUNT_RECOVERED() {
		return A12_CUT_AMOUNT_RECOVERED;
	}
	public void setA12_CUT_AMOUNT_RECOVERED(BigDecimal a12_CUT_AMOUNT_RECOVERED) {
		A12_CUT_AMOUNT_RECOVERED = a12_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA12_CUR_ACTUAL_NET_LOSS() {
		return A12_CUR_ACTUAL_NET_LOSS;
	}
	public void setA12_CUR_ACTUAL_NET_LOSS(BigDecimal a12_CUR_ACTUAL_NET_LOSS) {
		A12_CUR_ACTUAL_NET_LOSS = a12_CUR_ACTUAL_NET_LOSS;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_TOTAL_NO_EVENT() {
		return A13_TOTAL_NO_EVENT;
	}
	public void setA13_TOTAL_NO_EVENT(BigDecimal a13_TOTAL_NO_EVENT) {
		A13_TOTAL_NO_EVENT = a13_TOTAL_NO_EVENT;
	}
	public BigDecimal getA13_NO_OF_CUST_EFFECTED() {
		return A13_NO_OF_CUST_EFFECTED;
	}
	public void setA13_NO_OF_CUST_EFFECTED(BigDecimal a13_NO_OF_CUST_EFFECTED) {
		A13_NO_OF_CUST_EFFECTED = a13_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA13_AMOUNT_INVOLVED() {
		return A13_AMOUNT_INVOLVED;
	}
	public void setA13_AMOUNT_INVOLVED(BigDecimal a13_AMOUNT_INVOLVED) {
		A13_AMOUNT_INVOLVED = a13_AMOUNT_INVOLVED;
	}
	public BigDecimal getA13_NO_OF_FUNC_AREAS_INVOLVED() {
		return A13_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA13_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a13_NO_OF_FUNC_AREAS_INVOLVED) {
		A13_NO_OF_FUNC_AREAS_INVOLVED = a13_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA13_AMOUNT_OF_MAX_LOSS() {
		return A13_AMOUNT_OF_MAX_LOSS;
	}
	public void setA13_AMOUNT_OF_MAX_LOSS(BigDecimal a13_AMOUNT_OF_MAX_LOSS) {
		A13_AMOUNT_OF_MAX_LOSS = a13_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA13_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A13_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA13_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a13_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A13_AMOUNT_OF_ACTUAL_GROSS_LOSS = a13_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA13_AMOUNT_RECOVERED() {
		return A13_AMOUNT_RECOVERED;
	}
	public void setA13_AMOUNT_RECOVERED(BigDecimal a13_AMOUNT_RECOVERED) {
		A13_AMOUNT_RECOVERED = a13_AMOUNT_RECOVERED;
	}
	public BigDecimal getA13_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A13_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA13_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a13_AMOUNT_CLAIMED_FROM_INSURERS) {
		A13_AMOUNT_CLAIMED_FROM_INSURERS = a13_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA13_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A13_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA13_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a13_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A13_AMOUNT_RECOVERED_THROUGH_INSURERS = a13_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA13_ACTUAL_NET_LOSS() {
		return A13_ACTUAL_NET_LOSS;
	}
	public void setA13_ACTUAL_NET_LOSS(BigDecimal a13_ACTUAL_NET_LOSS) {
		A13_ACTUAL_NET_LOSS = a13_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA13_TOTAL_NO_OF_NEAR_MISS() {
		return A13_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA13_TOTAL_NO_OF_NEAR_MISS(BigDecimal a13_TOTAL_NO_OF_NEAR_MISS) {
		A13_TOTAL_NO_OF_NEAR_MISS = a13_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA13_NO_OF_SIGNIFICANT_EVENTS() {
		return A13_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA13_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a13_NO_OF_SIGNIFICANT_EVENTS) {
		A13_NO_OF_SIGNIFICANT_EVENTS = a13_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA13_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A13_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA13_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a13_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A13_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a13_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA13_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A13_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA13_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a13_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A13_SIGNIFICANT_EVENT_ACTUAL_LOSS = a13_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA13_PREV_GROSS_LOSS() {
		return A13_PREV_GROSS_LOSS;
	}
	public void setA13_PREV_GROSS_LOSS(BigDecimal a13_PREV_GROSS_LOSS) {
		A13_PREV_GROSS_LOSS = a13_PREV_GROSS_LOSS;
	}
	public BigDecimal getA13_PREV_AMOUNT_RECOVERED() {
		return A13_PREV_AMOUNT_RECOVERED;
	}
	public void setA13_PREV_AMOUNT_RECOVERED(BigDecimal a13_PREV_AMOUNT_RECOVERED) {
		A13_PREV_AMOUNT_RECOVERED = a13_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA13_PREV_AMOUNT_CLAIMED() {
		return A13_PREV_AMOUNT_CLAIMED;
	}
	public void setA13_PREV_AMOUNT_CLAIMED(BigDecimal a13_PREV_AMOUNT_CLAIMED) {
		A13_PREV_AMOUNT_CLAIMED = a13_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA13_PREVT_AMOUNT_RECOVERED() {
		return A13_PREVT_AMOUNT_RECOVERED;
	}
	public void setA13_PREVT_AMOUNT_RECOVERED(BigDecimal a13_PREVT_AMOUNT_RECOVERED) {
		A13_PREVT_AMOUNT_RECOVERED = a13_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA13_PREV_ACTUAL_NET_LOSS() {
		return A13_PREV_ACTUAL_NET_LOSS;
	}
	public void setA13_PREV_ACTUAL_NET_LOSS(BigDecimal a13_PREV_ACTUAL_NET_LOSS) {
		A13_PREV_ACTUAL_NET_LOSS = a13_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA13_CUR_ACTUAL_GROSS_LOSS() {
		return A13_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA13_CUR_ACTUAL_GROSS_LOSS(BigDecimal a13_CUR_ACTUAL_GROSS_LOSS) {
		A13_CUR_ACTUAL_GROSS_LOSS = a13_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA13_CUR_AMOUNT_RECOVERED() {
		return A13_CUR_AMOUNT_RECOVERED;
	}
	public void setA13_CUR_AMOUNT_RECOVERED(BigDecimal a13_CUR_AMOUNT_RECOVERED) {
		A13_CUR_AMOUNT_RECOVERED = a13_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA13_CUT_AMOUNT_CLAIMED() {
		return A13_CUT_AMOUNT_CLAIMED;
	}
	public void setA13_CUT_AMOUNT_CLAIMED(BigDecimal a13_CUT_AMOUNT_CLAIMED) {
		A13_CUT_AMOUNT_CLAIMED = a13_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA13_CUT_AMOUNT_RECOVERED() {
		return A13_CUT_AMOUNT_RECOVERED;
	}
	public void setA13_CUT_AMOUNT_RECOVERED(BigDecimal a13_CUT_AMOUNT_RECOVERED) {
		A13_CUT_AMOUNT_RECOVERED = a13_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA13_CUR_ACTUAL_NET_LOSS() {
		return A13_CUR_ACTUAL_NET_LOSS;
	}
	public void setA13_CUR_ACTUAL_NET_LOSS(BigDecimal a13_CUR_ACTUAL_NET_LOSS) {
		A13_CUR_ACTUAL_NET_LOSS = a13_CUR_ACTUAL_NET_LOSS;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_TOTAL_NO_EVENT() {
		return A14_TOTAL_NO_EVENT;
	}
	public void setA14_TOTAL_NO_EVENT(BigDecimal a14_TOTAL_NO_EVENT) {
		A14_TOTAL_NO_EVENT = a14_TOTAL_NO_EVENT;
	}
	public BigDecimal getA14_NO_OF_CUST_EFFECTED() {
		return A14_NO_OF_CUST_EFFECTED;
	}
	public void setA14_NO_OF_CUST_EFFECTED(BigDecimal a14_NO_OF_CUST_EFFECTED) {
		A14_NO_OF_CUST_EFFECTED = a14_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA14_AMOUNT_INVOLVED() {
		return A14_AMOUNT_INVOLVED;
	}
	public void setA14_AMOUNT_INVOLVED(BigDecimal a14_AMOUNT_INVOLVED) {
		A14_AMOUNT_INVOLVED = a14_AMOUNT_INVOLVED;
	}
	public BigDecimal getA14_NO_OF_FUNC_AREAS_INVOLVED() {
		return A14_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA14_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a14_NO_OF_FUNC_AREAS_INVOLVED) {
		A14_NO_OF_FUNC_AREAS_INVOLVED = a14_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA14_AMOUNT_OF_MAX_LOSS() {
		return A14_AMOUNT_OF_MAX_LOSS;
	}
	public void setA14_AMOUNT_OF_MAX_LOSS(BigDecimal a14_AMOUNT_OF_MAX_LOSS) {
		A14_AMOUNT_OF_MAX_LOSS = a14_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA14_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A14_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA14_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a14_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A14_AMOUNT_OF_ACTUAL_GROSS_LOSS = a14_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA14_AMOUNT_RECOVERED() {
		return A14_AMOUNT_RECOVERED;
	}
	public void setA14_AMOUNT_RECOVERED(BigDecimal a14_AMOUNT_RECOVERED) {
		A14_AMOUNT_RECOVERED = a14_AMOUNT_RECOVERED;
	}
	public BigDecimal getA14_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A14_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA14_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a14_AMOUNT_CLAIMED_FROM_INSURERS) {
		A14_AMOUNT_CLAIMED_FROM_INSURERS = a14_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA14_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A14_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA14_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a14_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A14_AMOUNT_RECOVERED_THROUGH_INSURERS = a14_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA14_ACTUAL_NET_LOSS() {
		return A14_ACTUAL_NET_LOSS;
	}
	public void setA14_ACTUAL_NET_LOSS(BigDecimal a14_ACTUAL_NET_LOSS) {
		A14_ACTUAL_NET_LOSS = a14_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA14_TOTAL_NO_OF_NEAR_MISS() {
		return A14_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA14_TOTAL_NO_OF_NEAR_MISS(BigDecimal a14_TOTAL_NO_OF_NEAR_MISS) {
		A14_TOTAL_NO_OF_NEAR_MISS = a14_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA14_NO_OF_SIGNIFICANT_EVENTS() {
		return A14_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA14_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a14_NO_OF_SIGNIFICANT_EVENTS) {
		A14_NO_OF_SIGNIFICANT_EVENTS = a14_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA14_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A14_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA14_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a14_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A14_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a14_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA14_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A14_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA14_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a14_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A14_SIGNIFICANT_EVENT_ACTUAL_LOSS = a14_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA14_PREV_GROSS_LOSS() {
		return A14_PREV_GROSS_LOSS;
	}
	public void setA14_PREV_GROSS_LOSS(BigDecimal a14_PREV_GROSS_LOSS) {
		A14_PREV_GROSS_LOSS = a14_PREV_GROSS_LOSS;
	}
	public BigDecimal getA14_PREV_AMOUNT_RECOVERED() {
		return A14_PREV_AMOUNT_RECOVERED;
	}
	public void setA14_PREV_AMOUNT_RECOVERED(BigDecimal a14_PREV_AMOUNT_RECOVERED) {
		A14_PREV_AMOUNT_RECOVERED = a14_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA14_PREV_AMOUNT_CLAIMED() {
		return A14_PREV_AMOUNT_CLAIMED;
	}
	public void setA14_PREV_AMOUNT_CLAIMED(BigDecimal a14_PREV_AMOUNT_CLAIMED) {
		A14_PREV_AMOUNT_CLAIMED = a14_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA14_PREVT_AMOUNT_RECOVERED() {
		return A14_PREVT_AMOUNT_RECOVERED;
	}
	public void setA14_PREVT_AMOUNT_RECOVERED(BigDecimal a14_PREVT_AMOUNT_RECOVERED) {
		A14_PREVT_AMOUNT_RECOVERED = a14_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA14_PREV_ACTUAL_NET_LOSS() {
		return A14_PREV_ACTUAL_NET_LOSS;
	}
	public void setA14_PREV_ACTUAL_NET_LOSS(BigDecimal a14_PREV_ACTUAL_NET_LOSS) {
		A14_PREV_ACTUAL_NET_LOSS = a14_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA14_CUR_ACTUAL_GROSS_LOSS() {
		return A14_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA14_CUR_ACTUAL_GROSS_LOSS(BigDecimal a14_CUR_ACTUAL_GROSS_LOSS) {
		A14_CUR_ACTUAL_GROSS_LOSS = a14_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA14_CUR_AMOUNT_RECOVERED() {
		return A14_CUR_AMOUNT_RECOVERED;
	}
	public void setA14_CUR_AMOUNT_RECOVERED(BigDecimal a14_CUR_AMOUNT_RECOVERED) {
		A14_CUR_AMOUNT_RECOVERED = a14_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA14_CUT_AMOUNT_CLAIMED() {
		return A14_CUT_AMOUNT_CLAIMED;
	}
	public void setA14_CUT_AMOUNT_CLAIMED(BigDecimal a14_CUT_AMOUNT_CLAIMED) {
		A14_CUT_AMOUNT_CLAIMED = a14_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA14_CUT_AMOUNT_RECOVERED() {
		return A14_CUT_AMOUNT_RECOVERED;
	}
	public void setA14_CUT_AMOUNT_RECOVERED(BigDecimal a14_CUT_AMOUNT_RECOVERED) {
		A14_CUT_AMOUNT_RECOVERED = a14_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA14_CUR_ACTUAL_NET_LOSS() {
		return A14_CUR_ACTUAL_NET_LOSS;
	}
	public void setA14_CUR_ACTUAL_NET_LOSS(BigDecimal a14_CUR_ACTUAL_NET_LOSS) {
		A14_CUR_ACTUAL_NET_LOSS = a14_CUR_ACTUAL_NET_LOSS;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_TOTAL_NO_EVENT() {
		return A15_TOTAL_NO_EVENT;
	}
	public void setA15_TOTAL_NO_EVENT(BigDecimal a15_TOTAL_NO_EVENT) {
		A15_TOTAL_NO_EVENT = a15_TOTAL_NO_EVENT;
	}
	public BigDecimal getA15_NO_OF_CUST_EFFECTED() {
		return A15_NO_OF_CUST_EFFECTED;
	}
	public void setA15_NO_OF_CUST_EFFECTED(BigDecimal a15_NO_OF_CUST_EFFECTED) {
		A15_NO_OF_CUST_EFFECTED = a15_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA15_AMOUNT_INVOLVED() {
		return A15_AMOUNT_INVOLVED;
	}
	public void setA15_AMOUNT_INVOLVED(BigDecimal a15_AMOUNT_INVOLVED) {
		A15_AMOUNT_INVOLVED = a15_AMOUNT_INVOLVED;
	}
	public BigDecimal getA15_NO_OF_FUNC_AREAS_INVOLVED() {
		return A15_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA15_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a15_NO_OF_FUNC_AREAS_INVOLVED) {
		A15_NO_OF_FUNC_AREAS_INVOLVED = a15_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA15_AMOUNT_OF_MAX_LOSS() {
		return A15_AMOUNT_OF_MAX_LOSS;
	}
	public void setA15_AMOUNT_OF_MAX_LOSS(BigDecimal a15_AMOUNT_OF_MAX_LOSS) {
		A15_AMOUNT_OF_MAX_LOSS = a15_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA15_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A15_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA15_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a15_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A15_AMOUNT_OF_ACTUAL_GROSS_LOSS = a15_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA15_AMOUNT_RECOVERED() {
		return A15_AMOUNT_RECOVERED;
	}
	public void setA15_AMOUNT_RECOVERED(BigDecimal a15_AMOUNT_RECOVERED) {
		A15_AMOUNT_RECOVERED = a15_AMOUNT_RECOVERED;
	}
	public BigDecimal getA15_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A15_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA15_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a15_AMOUNT_CLAIMED_FROM_INSURERS) {
		A15_AMOUNT_CLAIMED_FROM_INSURERS = a15_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA15_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A15_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA15_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a15_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A15_AMOUNT_RECOVERED_THROUGH_INSURERS = a15_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA15_ACTUAL_NET_LOSS() {
		return A15_ACTUAL_NET_LOSS;
	}
	public void setA15_ACTUAL_NET_LOSS(BigDecimal a15_ACTUAL_NET_LOSS) {
		A15_ACTUAL_NET_LOSS = a15_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA15_TOTAL_NO_OF_NEAR_MISS() {
		return A15_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA15_TOTAL_NO_OF_NEAR_MISS(BigDecimal a15_TOTAL_NO_OF_NEAR_MISS) {
		A15_TOTAL_NO_OF_NEAR_MISS = a15_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA15_NO_OF_SIGNIFICANT_EVENTS() {
		return A15_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA15_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a15_NO_OF_SIGNIFICANT_EVENTS) {
		A15_NO_OF_SIGNIFICANT_EVENTS = a15_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA15_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A15_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA15_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a15_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A15_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a15_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA15_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A15_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA15_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a15_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A15_SIGNIFICANT_EVENT_ACTUAL_LOSS = a15_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA15_PREV_GROSS_LOSS() {
		return A15_PREV_GROSS_LOSS;
	}
	public void setA15_PREV_GROSS_LOSS(BigDecimal a15_PREV_GROSS_LOSS) {
		A15_PREV_GROSS_LOSS = a15_PREV_GROSS_LOSS;
	}
	public BigDecimal getA15_PREV_AMOUNT_RECOVERED() {
		return A15_PREV_AMOUNT_RECOVERED;
	}
	public void setA15_PREV_AMOUNT_RECOVERED(BigDecimal a15_PREV_AMOUNT_RECOVERED) {
		A15_PREV_AMOUNT_RECOVERED = a15_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA15_PREV_AMOUNT_CLAIMED() {
		return A15_PREV_AMOUNT_CLAIMED;
	}
	public void setA15_PREV_AMOUNT_CLAIMED(BigDecimal a15_PREV_AMOUNT_CLAIMED) {
		A15_PREV_AMOUNT_CLAIMED = a15_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA15_PREVT_AMOUNT_RECOVERED() {
		return A15_PREVT_AMOUNT_RECOVERED;
	}
	public void setA15_PREVT_AMOUNT_RECOVERED(BigDecimal a15_PREVT_AMOUNT_RECOVERED) {
		A15_PREVT_AMOUNT_RECOVERED = a15_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA15_PREV_ACTUAL_NET_LOSS() {
		return A15_PREV_ACTUAL_NET_LOSS;
	}
	public void setA15_PREV_ACTUAL_NET_LOSS(BigDecimal a15_PREV_ACTUAL_NET_LOSS) {
		A15_PREV_ACTUAL_NET_LOSS = a15_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA15_CUR_ACTUAL_GROSS_LOSS() {
		return A15_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA15_CUR_ACTUAL_GROSS_LOSS(BigDecimal a15_CUR_ACTUAL_GROSS_LOSS) {
		A15_CUR_ACTUAL_GROSS_LOSS = a15_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA15_CUR_AMOUNT_RECOVERED() {
		return A15_CUR_AMOUNT_RECOVERED;
	}
	public void setA15_CUR_AMOUNT_RECOVERED(BigDecimal a15_CUR_AMOUNT_RECOVERED) {
		A15_CUR_AMOUNT_RECOVERED = a15_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA15_CUT_AMOUNT_CLAIMED() {
		return A15_CUT_AMOUNT_CLAIMED;
	}
	public void setA15_CUT_AMOUNT_CLAIMED(BigDecimal a15_CUT_AMOUNT_CLAIMED) {
		A15_CUT_AMOUNT_CLAIMED = a15_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA15_CUT_AMOUNT_RECOVERED() {
		return A15_CUT_AMOUNT_RECOVERED;
	}
	public void setA15_CUT_AMOUNT_RECOVERED(BigDecimal a15_CUT_AMOUNT_RECOVERED) {
		A15_CUT_AMOUNT_RECOVERED = a15_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA15_CUR_ACTUAL_NET_LOSS() {
		return A15_CUR_ACTUAL_NET_LOSS;
	}
	public void setA15_CUR_ACTUAL_NET_LOSS(BigDecimal a15_CUR_ACTUAL_NET_LOSS) {
		A15_CUR_ACTUAL_NET_LOSS = a15_CUR_ACTUAL_NET_LOSS;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public BigDecimal getA16_TOTAL_NO_EVENT() {
		return A16_TOTAL_NO_EVENT;
	}
	public void setA16_TOTAL_NO_EVENT(BigDecimal a16_TOTAL_NO_EVENT) {
		A16_TOTAL_NO_EVENT = a16_TOTAL_NO_EVENT;
	}
	public BigDecimal getA16_NO_OF_CUST_EFFECTED() {
		return A16_NO_OF_CUST_EFFECTED;
	}
	public void setA16_NO_OF_CUST_EFFECTED(BigDecimal a16_NO_OF_CUST_EFFECTED) {
		A16_NO_OF_CUST_EFFECTED = a16_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA16_AMOUNT_INVOLVED() {
		return A16_AMOUNT_INVOLVED;
	}
	public void setA16_AMOUNT_INVOLVED(BigDecimal a16_AMOUNT_INVOLVED) {
		A16_AMOUNT_INVOLVED = a16_AMOUNT_INVOLVED;
	}
	public BigDecimal getA16_NO_OF_FUNC_AREAS_INVOLVED() {
		return A16_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA16_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a16_NO_OF_FUNC_AREAS_INVOLVED) {
		A16_NO_OF_FUNC_AREAS_INVOLVED = a16_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA16_AMOUNT_OF_MAX_LOSS() {
		return A16_AMOUNT_OF_MAX_LOSS;
	}
	public void setA16_AMOUNT_OF_MAX_LOSS(BigDecimal a16_AMOUNT_OF_MAX_LOSS) {
		A16_AMOUNT_OF_MAX_LOSS = a16_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA16_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A16_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA16_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a16_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A16_AMOUNT_OF_ACTUAL_GROSS_LOSS = a16_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA16_AMOUNT_RECOVERED() {
		return A16_AMOUNT_RECOVERED;
	}
	public void setA16_AMOUNT_RECOVERED(BigDecimal a16_AMOUNT_RECOVERED) {
		A16_AMOUNT_RECOVERED = a16_AMOUNT_RECOVERED;
	}
	public BigDecimal getA16_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A16_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA16_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a16_AMOUNT_CLAIMED_FROM_INSURERS) {
		A16_AMOUNT_CLAIMED_FROM_INSURERS = a16_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA16_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A16_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA16_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a16_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A16_AMOUNT_RECOVERED_THROUGH_INSURERS = a16_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA16_ACTUAL_NET_LOSS() {
		return A16_ACTUAL_NET_LOSS;
	}
	public void setA16_ACTUAL_NET_LOSS(BigDecimal a16_ACTUAL_NET_LOSS) {
		A16_ACTUAL_NET_LOSS = a16_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA16_TOTAL_NO_OF_NEAR_MISS() {
		return A16_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA16_TOTAL_NO_OF_NEAR_MISS(BigDecimal a16_TOTAL_NO_OF_NEAR_MISS) {
		A16_TOTAL_NO_OF_NEAR_MISS = a16_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA16_NO_OF_SIGNIFICANT_EVENTS() {
		return A16_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA16_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a16_NO_OF_SIGNIFICANT_EVENTS) {
		A16_NO_OF_SIGNIFICANT_EVENTS = a16_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA16_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A16_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA16_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a16_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A16_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a16_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA16_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A16_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA16_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a16_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A16_SIGNIFICANT_EVENT_ACTUAL_LOSS = a16_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA16_PREV_GROSS_LOSS() {
		return A16_PREV_GROSS_LOSS;
	}
	public void setA16_PREV_GROSS_LOSS(BigDecimal a16_PREV_GROSS_LOSS) {
		A16_PREV_GROSS_LOSS = a16_PREV_GROSS_LOSS;
	}
	public BigDecimal getA16_PREV_AMOUNT_RECOVERED() {
		return A16_PREV_AMOUNT_RECOVERED;
	}
	public void setA16_PREV_AMOUNT_RECOVERED(BigDecimal a16_PREV_AMOUNT_RECOVERED) {
		A16_PREV_AMOUNT_RECOVERED = a16_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA16_PREV_AMOUNT_CLAIMED() {
		return A16_PREV_AMOUNT_CLAIMED;
	}
	public void setA16_PREV_AMOUNT_CLAIMED(BigDecimal a16_PREV_AMOUNT_CLAIMED) {
		A16_PREV_AMOUNT_CLAIMED = a16_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA16_PREVT_AMOUNT_RECOVERED() {
		return A16_PREVT_AMOUNT_RECOVERED;
	}
	public void setA16_PREVT_AMOUNT_RECOVERED(BigDecimal a16_PREVT_AMOUNT_RECOVERED) {
		A16_PREVT_AMOUNT_RECOVERED = a16_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA16_PREV_ACTUAL_NET_LOSS() {
		return A16_PREV_ACTUAL_NET_LOSS;
	}
	public void setA16_PREV_ACTUAL_NET_LOSS(BigDecimal a16_PREV_ACTUAL_NET_LOSS) {
		A16_PREV_ACTUAL_NET_LOSS = a16_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA16_CUR_ACTUAL_GROSS_LOSS() {
		return A16_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA16_CUR_ACTUAL_GROSS_LOSS(BigDecimal a16_CUR_ACTUAL_GROSS_LOSS) {
		A16_CUR_ACTUAL_GROSS_LOSS = a16_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA16_CUR_AMOUNT_RECOVERED() {
		return A16_CUR_AMOUNT_RECOVERED;
	}
	public void setA16_CUR_AMOUNT_RECOVERED(BigDecimal a16_CUR_AMOUNT_RECOVERED) {
		A16_CUR_AMOUNT_RECOVERED = a16_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA16_CUT_AMOUNT_CLAIMED() {
		return A16_CUT_AMOUNT_CLAIMED;
	}
	public void setA16_CUT_AMOUNT_CLAIMED(BigDecimal a16_CUT_AMOUNT_CLAIMED) {
		A16_CUT_AMOUNT_CLAIMED = a16_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA16_CUT_AMOUNT_RECOVERED() {
		return A16_CUT_AMOUNT_RECOVERED;
	}
	public void setA16_CUT_AMOUNT_RECOVERED(BigDecimal a16_CUT_AMOUNT_RECOVERED) {
		A16_CUT_AMOUNT_RECOVERED = a16_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA16_CUR_ACTUAL_NET_LOSS() {
		return A16_CUR_ACTUAL_NET_LOSS;
	}
	public void setA16_CUR_ACTUAL_NET_LOSS(BigDecimal a16_CUR_ACTUAL_NET_LOSS) {
		A16_CUR_ACTUAL_NET_LOSS = a16_CUR_ACTUAL_NET_LOSS;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17_TOTAL_NO_EVENT() {
		return A17_TOTAL_NO_EVENT;
	}
	public void setA17_TOTAL_NO_EVENT(BigDecimal a17_TOTAL_NO_EVENT) {
		A17_TOTAL_NO_EVENT = a17_TOTAL_NO_EVENT;
	}
	public BigDecimal getA17_NO_OF_CUST_EFFECTED() {
		return A17_NO_OF_CUST_EFFECTED;
	}
	public void setA17_NO_OF_CUST_EFFECTED(BigDecimal a17_NO_OF_CUST_EFFECTED) {
		A17_NO_OF_CUST_EFFECTED = a17_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA17_AMOUNT_INVOLVED() {
		return A17_AMOUNT_INVOLVED;
	}
	public void setA17_AMOUNT_INVOLVED(BigDecimal a17_AMOUNT_INVOLVED) {
		A17_AMOUNT_INVOLVED = a17_AMOUNT_INVOLVED;
	}
	public BigDecimal getA17_NO_OF_FUNC_AREAS_INVOLVED() {
		return A17_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA17_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a17_NO_OF_FUNC_AREAS_INVOLVED) {
		A17_NO_OF_FUNC_AREAS_INVOLVED = a17_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA17_AMOUNT_OF_MAX_LOSS() {
		return A17_AMOUNT_OF_MAX_LOSS;
	}
	public void setA17_AMOUNT_OF_MAX_LOSS(BigDecimal a17_AMOUNT_OF_MAX_LOSS) {
		A17_AMOUNT_OF_MAX_LOSS = a17_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA17_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A17_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA17_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a17_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A17_AMOUNT_OF_ACTUAL_GROSS_LOSS = a17_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA17_AMOUNT_RECOVERED() {
		return A17_AMOUNT_RECOVERED;
	}
	public void setA17_AMOUNT_RECOVERED(BigDecimal a17_AMOUNT_RECOVERED) {
		A17_AMOUNT_RECOVERED = a17_AMOUNT_RECOVERED;
	}
	public BigDecimal getA17_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A17_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA17_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a17_AMOUNT_CLAIMED_FROM_INSURERS) {
		A17_AMOUNT_CLAIMED_FROM_INSURERS = a17_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA17_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A17_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA17_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a17_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A17_AMOUNT_RECOVERED_THROUGH_INSURERS = a17_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA17_ACTUAL_NET_LOSS() {
		return A17_ACTUAL_NET_LOSS;
	}
	public void setA17_ACTUAL_NET_LOSS(BigDecimal a17_ACTUAL_NET_LOSS) {
		A17_ACTUAL_NET_LOSS = a17_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA17_TOTAL_NO_OF_NEAR_MISS() {
		return A17_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA17_TOTAL_NO_OF_NEAR_MISS(BigDecimal a17_TOTAL_NO_OF_NEAR_MISS) {
		A17_TOTAL_NO_OF_NEAR_MISS = a17_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA17_NO_OF_SIGNIFICANT_EVENTS() {
		return A17_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA17_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a17_NO_OF_SIGNIFICANT_EVENTS) {
		A17_NO_OF_SIGNIFICANT_EVENTS = a17_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA17_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A17_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA17_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a17_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A17_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a17_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA17_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A17_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA17_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a17_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A17_SIGNIFICANT_EVENT_ACTUAL_LOSS = a17_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA17_PREV_GROSS_LOSS() {
		return A17_PREV_GROSS_LOSS;
	}
	public void setA17_PREV_GROSS_LOSS(BigDecimal a17_PREV_GROSS_LOSS) {
		A17_PREV_GROSS_LOSS = a17_PREV_GROSS_LOSS;
	}
	public BigDecimal getA17_PREV_AMOUNT_RECOVERED() {
		return A17_PREV_AMOUNT_RECOVERED;
	}
	public void setA17_PREV_AMOUNT_RECOVERED(BigDecimal a17_PREV_AMOUNT_RECOVERED) {
		A17_PREV_AMOUNT_RECOVERED = a17_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA17_PREV_AMOUNT_CLAIMED() {
		return A17_PREV_AMOUNT_CLAIMED;
	}
	public void setA17_PREV_AMOUNT_CLAIMED(BigDecimal a17_PREV_AMOUNT_CLAIMED) {
		A17_PREV_AMOUNT_CLAIMED = a17_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA17_PREVT_AMOUNT_RECOVERED() {
		return A17_PREVT_AMOUNT_RECOVERED;
	}
	public void setA17_PREVT_AMOUNT_RECOVERED(BigDecimal a17_PREVT_AMOUNT_RECOVERED) {
		A17_PREVT_AMOUNT_RECOVERED = a17_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA17_PREV_ACTUAL_NET_LOSS() {
		return A17_PREV_ACTUAL_NET_LOSS;
	}
	public void setA17_PREV_ACTUAL_NET_LOSS(BigDecimal a17_PREV_ACTUAL_NET_LOSS) {
		A17_PREV_ACTUAL_NET_LOSS = a17_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA17_CUR_ACTUAL_GROSS_LOSS() {
		return A17_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA17_CUR_ACTUAL_GROSS_LOSS(BigDecimal a17_CUR_ACTUAL_GROSS_LOSS) {
		A17_CUR_ACTUAL_GROSS_LOSS = a17_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA17_CUR_AMOUNT_RECOVERED() {
		return A17_CUR_AMOUNT_RECOVERED;
	}
	public void setA17_CUR_AMOUNT_RECOVERED(BigDecimal a17_CUR_AMOUNT_RECOVERED) {
		A17_CUR_AMOUNT_RECOVERED = a17_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA17_CUT_AMOUNT_CLAIMED() {
		return A17_CUT_AMOUNT_CLAIMED;
	}
	public void setA17_CUT_AMOUNT_CLAIMED(BigDecimal a17_CUT_AMOUNT_CLAIMED) {
		A17_CUT_AMOUNT_CLAIMED = a17_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA17_CUT_AMOUNT_RECOVERED() {
		return A17_CUT_AMOUNT_RECOVERED;
	}
	public void setA17_CUT_AMOUNT_RECOVERED(BigDecimal a17_CUT_AMOUNT_RECOVERED) {
		A17_CUT_AMOUNT_RECOVERED = a17_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA17_CUR_ACTUAL_NET_LOSS() {
		return A17_CUR_ACTUAL_NET_LOSS;
	}
	public void setA17_CUR_ACTUAL_NET_LOSS(BigDecimal a17_CUR_ACTUAL_NET_LOSS) {
		A17_CUR_ACTUAL_NET_LOSS = a17_CUR_ACTUAL_NET_LOSS;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public BigDecimal getA18_TOTAL_NO_EVENT() {
		return A18_TOTAL_NO_EVENT;
	}
	public void setA18_TOTAL_NO_EVENT(BigDecimal a18_TOTAL_NO_EVENT) {
		A18_TOTAL_NO_EVENT = a18_TOTAL_NO_EVENT;
	}
	public BigDecimal getA18_NO_OF_CUST_EFFECTED() {
		return A18_NO_OF_CUST_EFFECTED;
	}
	public void setA18_NO_OF_CUST_EFFECTED(BigDecimal a18_NO_OF_CUST_EFFECTED) {
		A18_NO_OF_CUST_EFFECTED = a18_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA18_AMOUNT_INVOLVED() {
		return A18_AMOUNT_INVOLVED;
	}
	public void setA18_AMOUNT_INVOLVED(BigDecimal a18_AMOUNT_INVOLVED) {
		A18_AMOUNT_INVOLVED = a18_AMOUNT_INVOLVED;
	}
	public BigDecimal getA18_NO_OF_FUNC_AREAS_INVOLVED() {
		return A18_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA18_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a18_NO_OF_FUNC_AREAS_INVOLVED) {
		A18_NO_OF_FUNC_AREAS_INVOLVED = a18_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA18_AMOUNT_OF_MAX_LOSS() {
		return A18_AMOUNT_OF_MAX_LOSS;
	}
	public void setA18_AMOUNT_OF_MAX_LOSS(BigDecimal a18_AMOUNT_OF_MAX_LOSS) {
		A18_AMOUNT_OF_MAX_LOSS = a18_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA18_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A18_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA18_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a18_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A18_AMOUNT_OF_ACTUAL_GROSS_LOSS = a18_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA18_AMOUNT_RECOVERED() {
		return A18_AMOUNT_RECOVERED;
	}
	public void setA18_AMOUNT_RECOVERED(BigDecimal a18_AMOUNT_RECOVERED) {
		A18_AMOUNT_RECOVERED = a18_AMOUNT_RECOVERED;
	}
	public BigDecimal getA18_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A18_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA18_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a18_AMOUNT_CLAIMED_FROM_INSURERS) {
		A18_AMOUNT_CLAIMED_FROM_INSURERS = a18_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA18_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A18_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA18_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a18_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A18_AMOUNT_RECOVERED_THROUGH_INSURERS = a18_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA18_ACTUAL_NET_LOSS() {
		return A18_ACTUAL_NET_LOSS;
	}
	public void setA18_ACTUAL_NET_LOSS(BigDecimal a18_ACTUAL_NET_LOSS) {
		A18_ACTUAL_NET_LOSS = a18_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA18_TOTAL_NO_OF_NEAR_MISS() {
		return A18_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA18_TOTAL_NO_OF_NEAR_MISS(BigDecimal a18_TOTAL_NO_OF_NEAR_MISS) {
		A18_TOTAL_NO_OF_NEAR_MISS = a18_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA18_NO_OF_SIGNIFICANT_EVENTS() {
		return A18_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA18_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a18_NO_OF_SIGNIFICANT_EVENTS) {
		A18_NO_OF_SIGNIFICANT_EVENTS = a18_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA18_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A18_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA18_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a18_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A18_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a18_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA18_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A18_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA18_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a18_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A18_SIGNIFICANT_EVENT_ACTUAL_LOSS = a18_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA18_PREV_GROSS_LOSS() {
		return A18_PREV_GROSS_LOSS;
	}
	public void setA18_PREV_GROSS_LOSS(BigDecimal a18_PREV_GROSS_LOSS) {
		A18_PREV_GROSS_LOSS = a18_PREV_GROSS_LOSS;
	}
	public BigDecimal getA18_PREV_AMOUNT_RECOVERED() {
		return A18_PREV_AMOUNT_RECOVERED;
	}
	public void setA18_PREV_AMOUNT_RECOVERED(BigDecimal a18_PREV_AMOUNT_RECOVERED) {
		A18_PREV_AMOUNT_RECOVERED = a18_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA18_PREV_AMOUNT_CLAIMED() {
		return A18_PREV_AMOUNT_CLAIMED;
	}
	public void setA18_PREV_AMOUNT_CLAIMED(BigDecimal a18_PREV_AMOUNT_CLAIMED) {
		A18_PREV_AMOUNT_CLAIMED = a18_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA18_PREVT_AMOUNT_RECOVERED() {
		return A18_PREVT_AMOUNT_RECOVERED;
	}
	public void setA18_PREVT_AMOUNT_RECOVERED(BigDecimal a18_PREVT_AMOUNT_RECOVERED) {
		A18_PREVT_AMOUNT_RECOVERED = a18_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA18_PREV_ACTUAL_NET_LOSS() {
		return A18_PREV_ACTUAL_NET_LOSS;
	}
	public void setA18_PREV_ACTUAL_NET_LOSS(BigDecimal a18_PREV_ACTUAL_NET_LOSS) {
		A18_PREV_ACTUAL_NET_LOSS = a18_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA18_CUR_ACTUAL_GROSS_LOSS() {
		return A18_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA18_CUR_ACTUAL_GROSS_LOSS(BigDecimal a18_CUR_ACTUAL_GROSS_LOSS) {
		A18_CUR_ACTUAL_GROSS_LOSS = a18_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA18_CUR_AMOUNT_RECOVERED() {
		return A18_CUR_AMOUNT_RECOVERED;
	}
	public void setA18_CUR_AMOUNT_RECOVERED(BigDecimal a18_CUR_AMOUNT_RECOVERED) {
		A18_CUR_AMOUNT_RECOVERED = a18_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA18_CUT_AMOUNT_CLAIMED() {
		return A18_CUT_AMOUNT_CLAIMED;
	}
	public void setA18_CUT_AMOUNT_CLAIMED(BigDecimal a18_CUT_AMOUNT_CLAIMED) {
		A18_CUT_AMOUNT_CLAIMED = a18_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA18_CUT_AMOUNT_RECOVERED() {
		return A18_CUT_AMOUNT_RECOVERED;
	}
	public void setA18_CUT_AMOUNT_RECOVERED(BigDecimal a18_CUT_AMOUNT_RECOVERED) {
		A18_CUT_AMOUNT_RECOVERED = a18_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA18_CUR_ACTUAL_NET_LOSS() {
		return A18_CUR_ACTUAL_NET_LOSS;
	}
	public void setA18_CUR_ACTUAL_NET_LOSS(BigDecimal a18_CUR_ACTUAL_NET_LOSS) {
		A18_CUR_ACTUAL_NET_LOSS = a18_CUR_ACTUAL_NET_LOSS;
	}
	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}
	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}
	public BigDecimal getA19_TOTAL_NO_EVENT() {
		return A19_TOTAL_NO_EVENT;
	}
	public void setA19_TOTAL_NO_EVENT(BigDecimal a19_TOTAL_NO_EVENT) {
		A19_TOTAL_NO_EVENT = a19_TOTAL_NO_EVENT;
	}
	public BigDecimal getA19_NO_OF_CUST_EFFECTED() {
		return A19_NO_OF_CUST_EFFECTED;
	}
	public void setA19_NO_OF_CUST_EFFECTED(BigDecimal a19_NO_OF_CUST_EFFECTED) {
		A19_NO_OF_CUST_EFFECTED = a19_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA19_AMOUNT_INVOLVED() {
		return A19_AMOUNT_INVOLVED;
	}
	public void setA19_AMOUNT_INVOLVED(BigDecimal a19_AMOUNT_INVOLVED) {
		A19_AMOUNT_INVOLVED = a19_AMOUNT_INVOLVED;
	}
	public BigDecimal getA19_NO_OF_FUNC_AREAS_INVOLVED() {
		return A19_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA19_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a19_NO_OF_FUNC_AREAS_INVOLVED) {
		A19_NO_OF_FUNC_AREAS_INVOLVED = a19_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA19_AMOUNT_OF_MAX_LOSS() {
		return A19_AMOUNT_OF_MAX_LOSS;
	}
	public void setA19_AMOUNT_OF_MAX_LOSS(BigDecimal a19_AMOUNT_OF_MAX_LOSS) {
		A19_AMOUNT_OF_MAX_LOSS = a19_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA19_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A19_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA19_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a19_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A19_AMOUNT_OF_ACTUAL_GROSS_LOSS = a19_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA19_AMOUNT_RECOVERED() {
		return A19_AMOUNT_RECOVERED;
	}
	public void setA19_AMOUNT_RECOVERED(BigDecimal a19_AMOUNT_RECOVERED) {
		A19_AMOUNT_RECOVERED = a19_AMOUNT_RECOVERED;
	}
	public BigDecimal getA19_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A19_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA19_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a19_AMOUNT_CLAIMED_FROM_INSURERS) {
		A19_AMOUNT_CLAIMED_FROM_INSURERS = a19_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA19_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A19_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA19_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a19_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A19_AMOUNT_RECOVERED_THROUGH_INSURERS = a19_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA19_ACTUAL_NET_LOSS() {
		return A19_ACTUAL_NET_LOSS;
	}
	public void setA19_ACTUAL_NET_LOSS(BigDecimal a19_ACTUAL_NET_LOSS) {
		A19_ACTUAL_NET_LOSS = a19_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA19_TOTAL_NO_OF_NEAR_MISS() {
		return A19_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA19_TOTAL_NO_OF_NEAR_MISS(BigDecimal a19_TOTAL_NO_OF_NEAR_MISS) {
		A19_TOTAL_NO_OF_NEAR_MISS = a19_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA19_NO_OF_SIGNIFICANT_EVENTS() {
		return A19_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA19_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a19_NO_OF_SIGNIFICANT_EVENTS) {
		A19_NO_OF_SIGNIFICANT_EVENTS = a19_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA19_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A19_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA19_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a19_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A19_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a19_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA19_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A19_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA19_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a19_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A19_SIGNIFICANT_EVENT_ACTUAL_LOSS = a19_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA19_PREV_GROSS_LOSS() {
		return A19_PREV_GROSS_LOSS;
	}
	public void setA19_PREV_GROSS_LOSS(BigDecimal a19_PREV_GROSS_LOSS) {
		A19_PREV_GROSS_LOSS = a19_PREV_GROSS_LOSS;
	}
	public BigDecimal getA19_PREV_AMOUNT_RECOVERED() {
		return A19_PREV_AMOUNT_RECOVERED;
	}
	public void setA19_PREV_AMOUNT_RECOVERED(BigDecimal a19_PREV_AMOUNT_RECOVERED) {
		A19_PREV_AMOUNT_RECOVERED = a19_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA19_PREV_AMOUNT_CLAIMED() {
		return A19_PREV_AMOUNT_CLAIMED;
	}
	public void setA19_PREV_AMOUNT_CLAIMED(BigDecimal a19_PREV_AMOUNT_CLAIMED) {
		A19_PREV_AMOUNT_CLAIMED = a19_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA19_PREVT_AMOUNT_RECOVERED() {
		return A19_PREVT_AMOUNT_RECOVERED;
	}
	public void setA19_PREVT_AMOUNT_RECOVERED(BigDecimal a19_PREVT_AMOUNT_RECOVERED) {
		A19_PREVT_AMOUNT_RECOVERED = a19_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA19_PREV_ACTUAL_NET_LOSS() {
		return A19_PREV_ACTUAL_NET_LOSS;
	}
	public void setA19_PREV_ACTUAL_NET_LOSS(BigDecimal a19_PREV_ACTUAL_NET_LOSS) {
		A19_PREV_ACTUAL_NET_LOSS = a19_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA19_CUR_ACTUAL_GROSS_LOSS() {
		return A19_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA19_CUR_ACTUAL_GROSS_LOSS(BigDecimal a19_CUR_ACTUAL_GROSS_LOSS) {
		A19_CUR_ACTUAL_GROSS_LOSS = a19_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA19_CUR_AMOUNT_RECOVERED() {
		return A19_CUR_AMOUNT_RECOVERED;
	}
	public void setA19_CUR_AMOUNT_RECOVERED(BigDecimal a19_CUR_AMOUNT_RECOVERED) {
		A19_CUR_AMOUNT_RECOVERED = a19_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA19_CUT_AMOUNT_CLAIMED() {
		return A19_CUT_AMOUNT_CLAIMED;
	}
	public void setA19_CUT_AMOUNT_CLAIMED(BigDecimal a19_CUT_AMOUNT_CLAIMED) {
		A19_CUT_AMOUNT_CLAIMED = a19_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA19_CUT_AMOUNT_RECOVERED() {
		return A19_CUT_AMOUNT_RECOVERED;
	}
	public void setA19_CUT_AMOUNT_RECOVERED(BigDecimal a19_CUT_AMOUNT_RECOVERED) {
		A19_CUT_AMOUNT_RECOVERED = a19_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA19_CUR_ACTUAL_NET_LOSS() {
		return A19_CUR_ACTUAL_NET_LOSS;
	}
	public void setA19_CUR_ACTUAL_NET_LOSS(BigDecimal a19_CUR_ACTUAL_NET_LOSS) {
		A19_CUR_ACTUAL_NET_LOSS = a19_CUR_ACTUAL_NET_LOSS;
	}
	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}
	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}
	public BigDecimal getA20_TOTAL_NO_EVENT() {
		return A20_TOTAL_NO_EVENT;
	}
	public void setA20_TOTAL_NO_EVENT(BigDecimal a20_TOTAL_NO_EVENT) {
		A20_TOTAL_NO_EVENT = a20_TOTAL_NO_EVENT;
	}
	public BigDecimal getA20_NO_OF_CUST_EFFECTED() {
		return A20_NO_OF_CUST_EFFECTED;
	}
	public void setA20_NO_OF_CUST_EFFECTED(BigDecimal a20_NO_OF_CUST_EFFECTED) {
		A20_NO_OF_CUST_EFFECTED = a20_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA20_AMOUNT_INVOLVED() {
		return A20_AMOUNT_INVOLVED;
	}
	public void setA20_AMOUNT_INVOLVED(BigDecimal a20_AMOUNT_INVOLVED) {
		A20_AMOUNT_INVOLVED = a20_AMOUNT_INVOLVED;
	}
	public BigDecimal getA20_NO_OF_FUNC_AREAS_INVOLVED() {
		return A20_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA20_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a20_NO_OF_FUNC_AREAS_INVOLVED) {
		A20_NO_OF_FUNC_AREAS_INVOLVED = a20_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA20_AMOUNT_OF_MAX_LOSS() {
		return A20_AMOUNT_OF_MAX_LOSS;
	}
	public void setA20_AMOUNT_OF_MAX_LOSS(BigDecimal a20_AMOUNT_OF_MAX_LOSS) {
		A20_AMOUNT_OF_MAX_LOSS = a20_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA20_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A20_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA20_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a20_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A20_AMOUNT_OF_ACTUAL_GROSS_LOSS = a20_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA20_AMOUNT_RECOVERED() {
		return A20_AMOUNT_RECOVERED;
	}
	public void setA20_AMOUNT_RECOVERED(BigDecimal a20_AMOUNT_RECOVERED) {
		A20_AMOUNT_RECOVERED = a20_AMOUNT_RECOVERED;
	}
	public BigDecimal getA20_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A20_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA20_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a20_AMOUNT_CLAIMED_FROM_INSURERS) {
		A20_AMOUNT_CLAIMED_FROM_INSURERS = a20_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA20_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A20_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA20_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a20_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A20_AMOUNT_RECOVERED_THROUGH_INSURERS = a20_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA20_ACTUAL_NET_LOSS() {
		return A20_ACTUAL_NET_LOSS;
	}
	public void setA20_ACTUAL_NET_LOSS(BigDecimal a20_ACTUAL_NET_LOSS) {
		A20_ACTUAL_NET_LOSS = a20_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA20_TOTAL_NO_OF_NEAR_MISS() {
		return A20_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA20_TOTAL_NO_OF_NEAR_MISS(BigDecimal a20_TOTAL_NO_OF_NEAR_MISS) {
		A20_TOTAL_NO_OF_NEAR_MISS = a20_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA20_NO_OF_SIGNIFICANT_EVENTS() {
		return A20_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA20_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a20_NO_OF_SIGNIFICANT_EVENTS) {
		A20_NO_OF_SIGNIFICANT_EVENTS = a20_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA20_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A20_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA20_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a20_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A20_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a20_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA20_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A20_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA20_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a20_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A20_SIGNIFICANT_EVENT_ACTUAL_LOSS = a20_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA20_PREV_GROSS_LOSS() {
		return A20_PREV_GROSS_LOSS;
	}
	public void setA20_PREV_GROSS_LOSS(BigDecimal a20_PREV_GROSS_LOSS) {
		A20_PREV_GROSS_LOSS = a20_PREV_GROSS_LOSS;
	}
	public BigDecimal getA20_PREV_AMOUNT_RECOVERED() {
		return A20_PREV_AMOUNT_RECOVERED;
	}
	public void setA20_PREV_AMOUNT_RECOVERED(BigDecimal a20_PREV_AMOUNT_RECOVERED) {
		A20_PREV_AMOUNT_RECOVERED = a20_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA20_PREV_AMOUNT_CLAIMED() {
		return A20_PREV_AMOUNT_CLAIMED;
	}
	public void setA20_PREV_AMOUNT_CLAIMED(BigDecimal a20_PREV_AMOUNT_CLAIMED) {
		A20_PREV_AMOUNT_CLAIMED = a20_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA20_PREVT_AMOUNT_RECOVERED() {
		return A20_PREVT_AMOUNT_RECOVERED;
	}
	public void setA20_PREVT_AMOUNT_RECOVERED(BigDecimal a20_PREVT_AMOUNT_RECOVERED) {
		A20_PREVT_AMOUNT_RECOVERED = a20_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA20_PREV_ACTUAL_NET_LOSS() {
		return A20_PREV_ACTUAL_NET_LOSS;
	}
	public void setA20_PREV_ACTUAL_NET_LOSS(BigDecimal a20_PREV_ACTUAL_NET_LOSS) {
		A20_PREV_ACTUAL_NET_LOSS = a20_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA20_CUR_ACTUAL_GROSS_LOSS() {
		return A20_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA20_CUR_ACTUAL_GROSS_LOSS(BigDecimal a20_CUR_ACTUAL_GROSS_LOSS) {
		A20_CUR_ACTUAL_GROSS_LOSS = a20_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA20_CUR_AMOUNT_RECOVERED() {
		return A20_CUR_AMOUNT_RECOVERED;
	}
	public void setA20_CUR_AMOUNT_RECOVERED(BigDecimal a20_CUR_AMOUNT_RECOVERED) {
		A20_CUR_AMOUNT_RECOVERED = a20_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA20_CUT_AMOUNT_CLAIMED() {
		return A20_CUT_AMOUNT_CLAIMED;
	}
	public void setA20_CUT_AMOUNT_CLAIMED(BigDecimal a20_CUT_AMOUNT_CLAIMED) {
		A20_CUT_AMOUNT_CLAIMED = a20_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA20_CUT_AMOUNT_RECOVERED() {
		return A20_CUT_AMOUNT_RECOVERED;
	}
	public void setA20_CUT_AMOUNT_RECOVERED(BigDecimal a20_CUT_AMOUNT_RECOVERED) {
		A20_CUT_AMOUNT_RECOVERED = a20_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA20_CUR_ACTUAL_NET_LOSS() {
		return A20_CUR_ACTUAL_NET_LOSS;
	}
	public void setA20_CUR_ACTUAL_NET_LOSS(BigDecimal a20_CUR_ACTUAL_NET_LOSS) {
		A20_CUR_ACTUAL_NET_LOSS = a20_CUR_ACTUAL_NET_LOSS;
	}
	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}
	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}
	public BigDecimal getA21_TOTAL_NO_EVENT() {
		return A21_TOTAL_NO_EVENT;
	}
	public void setA21_TOTAL_NO_EVENT(BigDecimal a21_TOTAL_NO_EVENT) {
		A21_TOTAL_NO_EVENT = a21_TOTAL_NO_EVENT;
	}
	public BigDecimal getA21_NO_OF_CUST_EFFECTED() {
		return A21_NO_OF_CUST_EFFECTED;
	}
	public void setA21_NO_OF_CUST_EFFECTED(BigDecimal a21_NO_OF_CUST_EFFECTED) {
		A21_NO_OF_CUST_EFFECTED = a21_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA21_AMOUNT_INVOLVED() {
		return A21_AMOUNT_INVOLVED;
	}
	public void setA21_AMOUNT_INVOLVED(BigDecimal a21_AMOUNT_INVOLVED) {
		A21_AMOUNT_INVOLVED = a21_AMOUNT_INVOLVED;
	}
	public BigDecimal getA21_NO_OF_FUNC_AREAS_INVOLVED() {
		return A21_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA21_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a21_NO_OF_FUNC_AREAS_INVOLVED) {
		A21_NO_OF_FUNC_AREAS_INVOLVED = a21_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA21_AMOUNT_OF_MAX_LOSS() {
		return A21_AMOUNT_OF_MAX_LOSS;
	}
	public void setA21_AMOUNT_OF_MAX_LOSS(BigDecimal a21_AMOUNT_OF_MAX_LOSS) {
		A21_AMOUNT_OF_MAX_LOSS = a21_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA21_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A21_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA21_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a21_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A21_AMOUNT_OF_ACTUAL_GROSS_LOSS = a21_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA21_AMOUNT_RECOVERED() {
		return A21_AMOUNT_RECOVERED;
	}
	public void setA21_AMOUNT_RECOVERED(BigDecimal a21_AMOUNT_RECOVERED) {
		A21_AMOUNT_RECOVERED = a21_AMOUNT_RECOVERED;
	}
	public BigDecimal getA21_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A21_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA21_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a21_AMOUNT_CLAIMED_FROM_INSURERS) {
		A21_AMOUNT_CLAIMED_FROM_INSURERS = a21_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA21_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A21_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA21_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a21_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A21_AMOUNT_RECOVERED_THROUGH_INSURERS = a21_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA21_ACTUAL_NET_LOSS() {
		return A21_ACTUAL_NET_LOSS;
	}
	public void setA21_ACTUAL_NET_LOSS(BigDecimal a21_ACTUAL_NET_LOSS) {
		A21_ACTUAL_NET_LOSS = a21_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA21_TOTAL_NO_OF_NEAR_MISS() {
		return A21_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA21_TOTAL_NO_OF_NEAR_MISS(BigDecimal a21_TOTAL_NO_OF_NEAR_MISS) {
		A21_TOTAL_NO_OF_NEAR_MISS = a21_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA21_NO_OF_SIGNIFICANT_EVENTS() {
		return A21_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA21_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a21_NO_OF_SIGNIFICANT_EVENTS) {
		A21_NO_OF_SIGNIFICANT_EVENTS = a21_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA21_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A21_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA21_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a21_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A21_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a21_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA21_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A21_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA21_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a21_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A21_SIGNIFICANT_EVENT_ACTUAL_LOSS = a21_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA21_PREV_GROSS_LOSS() {
		return A21_PREV_GROSS_LOSS;
	}
	public void setA21_PREV_GROSS_LOSS(BigDecimal a21_PREV_GROSS_LOSS) {
		A21_PREV_GROSS_LOSS = a21_PREV_GROSS_LOSS;
	}
	public BigDecimal getA21_PREV_AMOUNT_RECOVERED() {
		return A21_PREV_AMOUNT_RECOVERED;
	}
	public void setA21_PREV_AMOUNT_RECOVERED(BigDecimal a21_PREV_AMOUNT_RECOVERED) {
		A21_PREV_AMOUNT_RECOVERED = a21_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA21_PREV_AMOUNT_CLAIMED() {
		return A21_PREV_AMOUNT_CLAIMED;
	}
	public void setA21_PREV_AMOUNT_CLAIMED(BigDecimal a21_PREV_AMOUNT_CLAIMED) {
		A21_PREV_AMOUNT_CLAIMED = a21_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA21_PREVT_AMOUNT_RECOVERED() {
		return A21_PREVT_AMOUNT_RECOVERED;
	}
	public void setA21_PREVT_AMOUNT_RECOVERED(BigDecimal a21_PREVT_AMOUNT_RECOVERED) {
		A21_PREVT_AMOUNT_RECOVERED = a21_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA21_PREV_ACTUAL_NET_LOSS() {
		return A21_PREV_ACTUAL_NET_LOSS;
	}
	public void setA21_PREV_ACTUAL_NET_LOSS(BigDecimal a21_PREV_ACTUAL_NET_LOSS) {
		A21_PREV_ACTUAL_NET_LOSS = a21_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA21_CUR_ACTUAL_GROSS_LOSS() {
		return A21_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA21_CUR_ACTUAL_GROSS_LOSS(BigDecimal a21_CUR_ACTUAL_GROSS_LOSS) {
		A21_CUR_ACTUAL_GROSS_LOSS = a21_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA21_CUR_AMOUNT_RECOVERED() {
		return A21_CUR_AMOUNT_RECOVERED;
	}
	public void setA21_CUR_AMOUNT_RECOVERED(BigDecimal a21_CUR_AMOUNT_RECOVERED) {
		A21_CUR_AMOUNT_RECOVERED = a21_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA21_CUT_AMOUNT_CLAIMED() {
		return A21_CUT_AMOUNT_CLAIMED;
	}
	public void setA21_CUT_AMOUNT_CLAIMED(BigDecimal a21_CUT_AMOUNT_CLAIMED) {
		A21_CUT_AMOUNT_CLAIMED = a21_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA21_CUT_AMOUNT_RECOVERED() {
		return A21_CUT_AMOUNT_RECOVERED;
	}
	public void setA21_CUT_AMOUNT_RECOVERED(BigDecimal a21_CUT_AMOUNT_RECOVERED) {
		A21_CUT_AMOUNT_RECOVERED = a21_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA21_CUR_ACTUAL_NET_LOSS() {
		return A21_CUR_ACTUAL_NET_LOSS;
	}
	public void setA21_CUR_ACTUAL_NET_LOSS(BigDecimal a21_CUR_ACTUAL_NET_LOSS) {
		A21_CUR_ACTUAL_NET_LOSS = a21_CUR_ACTUAL_NET_LOSS;
	}
	public String getA22_PRODUCT() {
		return A22_PRODUCT;
	}
	public void setA22_PRODUCT(String a22_PRODUCT) {
		A22_PRODUCT = a22_PRODUCT;
	}
	public BigDecimal getA22_TOTAL_NO_EVENT() {
		return A22_TOTAL_NO_EVENT;
	}
	public void setA22_TOTAL_NO_EVENT(BigDecimal a22_TOTAL_NO_EVENT) {
		A22_TOTAL_NO_EVENT = a22_TOTAL_NO_EVENT;
	}
	public BigDecimal getA22_NO_OF_CUST_EFFECTED() {
		return A22_NO_OF_CUST_EFFECTED;
	}
	public void setA22_NO_OF_CUST_EFFECTED(BigDecimal a22_NO_OF_CUST_EFFECTED) {
		A22_NO_OF_CUST_EFFECTED = a22_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA22_AMOUNT_INVOLVED() {
		return A22_AMOUNT_INVOLVED;
	}
	public void setA22_AMOUNT_INVOLVED(BigDecimal a22_AMOUNT_INVOLVED) {
		A22_AMOUNT_INVOLVED = a22_AMOUNT_INVOLVED;
	}
	public BigDecimal getA22_NO_OF_FUNC_AREAS_INVOLVED() {
		return A22_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA22_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a22_NO_OF_FUNC_AREAS_INVOLVED) {
		A22_NO_OF_FUNC_AREAS_INVOLVED = a22_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA22_AMOUNT_OF_MAX_LOSS() {
		return A22_AMOUNT_OF_MAX_LOSS;
	}
	public void setA22_AMOUNT_OF_MAX_LOSS(BigDecimal a22_AMOUNT_OF_MAX_LOSS) {
		A22_AMOUNT_OF_MAX_LOSS = a22_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA22_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A22_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA22_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a22_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A22_AMOUNT_OF_ACTUAL_GROSS_LOSS = a22_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA22_AMOUNT_RECOVERED() {
		return A22_AMOUNT_RECOVERED;
	}
	public void setA22_AMOUNT_RECOVERED(BigDecimal a22_AMOUNT_RECOVERED) {
		A22_AMOUNT_RECOVERED = a22_AMOUNT_RECOVERED;
	}
	public BigDecimal getA22_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A22_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA22_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a22_AMOUNT_CLAIMED_FROM_INSURERS) {
		A22_AMOUNT_CLAIMED_FROM_INSURERS = a22_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA22_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A22_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA22_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a22_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A22_AMOUNT_RECOVERED_THROUGH_INSURERS = a22_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA22_ACTUAL_NET_LOSS() {
		return A22_ACTUAL_NET_LOSS;
	}
	public void setA22_ACTUAL_NET_LOSS(BigDecimal a22_ACTUAL_NET_LOSS) {
		A22_ACTUAL_NET_LOSS = a22_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA22_TOTAL_NO_OF_NEAR_MISS() {
		return A22_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA22_TOTAL_NO_OF_NEAR_MISS(BigDecimal a22_TOTAL_NO_OF_NEAR_MISS) {
		A22_TOTAL_NO_OF_NEAR_MISS = a22_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA22_NO_OF_SIGNIFICANT_EVENTS() {
		return A22_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA22_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a22_NO_OF_SIGNIFICANT_EVENTS) {
		A22_NO_OF_SIGNIFICANT_EVENTS = a22_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA22_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A22_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA22_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a22_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A22_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a22_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA22_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A22_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA22_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a22_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A22_SIGNIFICANT_EVENT_ACTUAL_LOSS = a22_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA22_PREV_GROSS_LOSS() {
		return A22_PREV_GROSS_LOSS;
	}
	public void setA22_PREV_GROSS_LOSS(BigDecimal a22_PREV_GROSS_LOSS) {
		A22_PREV_GROSS_LOSS = a22_PREV_GROSS_LOSS;
	}
	public BigDecimal getA22_PREV_AMOUNT_RECOVERED() {
		return A22_PREV_AMOUNT_RECOVERED;
	}
	public void setA22_PREV_AMOUNT_RECOVERED(BigDecimal a22_PREV_AMOUNT_RECOVERED) {
		A22_PREV_AMOUNT_RECOVERED = a22_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA22_PREV_AMOUNT_CLAIMED() {
		return A22_PREV_AMOUNT_CLAIMED;
	}
	public void setA22_PREV_AMOUNT_CLAIMED(BigDecimal a22_PREV_AMOUNT_CLAIMED) {
		A22_PREV_AMOUNT_CLAIMED = a22_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA22_PREVT_AMOUNT_RECOVERED() {
		return A22_PREVT_AMOUNT_RECOVERED;
	}
	public void setA22_PREVT_AMOUNT_RECOVERED(BigDecimal a22_PREVT_AMOUNT_RECOVERED) {
		A22_PREVT_AMOUNT_RECOVERED = a22_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA22_PREV_ACTUAL_NET_LOSS() {
		return A22_PREV_ACTUAL_NET_LOSS;
	}
	public void setA22_PREV_ACTUAL_NET_LOSS(BigDecimal a22_PREV_ACTUAL_NET_LOSS) {
		A22_PREV_ACTUAL_NET_LOSS = a22_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA22_CUR_ACTUAL_GROSS_LOSS() {
		return A22_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA22_CUR_ACTUAL_GROSS_LOSS(BigDecimal a22_CUR_ACTUAL_GROSS_LOSS) {
		A22_CUR_ACTUAL_GROSS_LOSS = a22_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA22_CUR_AMOUNT_RECOVERED() {
		return A22_CUR_AMOUNT_RECOVERED;
	}
	public void setA22_CUR_AMOUNT_RECOVERED(BigDecimal a22_CUR_AMOUNT_RECOVERED) {
		A22_CUR_AMOUNT_RECOVERED = a22_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA22_CUT_AMOUNT_CLAIMED() {
		return A22_CUT_AMOUNT_CLAIMED;
	}
	public void setA22_CUT_AMOUNT_CLAIMED(BigDecimal a22_CUT_AMOUNT_CLAIMED) {
		A22_CUT_AMOUNT_CLAIMED = a22_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA22_CUT_AMOUNT_RECOVERED() {
		return A22_CUT_AMOUNT_RECOVERED;
	}
	public void setA22_CUT_AMOUNT_RECOVERED(BigDecimal a22_CUT_AMOUNT_RECOVERED) {
		A22_CUT_AMOUNT_RECOVERED = a22_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA22_CUR_ACTUAL_NET_LOSS() {
		return A22_CUR_ACTUAL_NET_LOSS;
	}
	public void setA22_CUR_ACTUAL_NET_LOSS(BigDecimal a22_CUR_ACTUAL_NET_LOSS) {
		A22_CUR_ACTUAL_NET_LOSS = a22_CUR_ACTUAL_NET_LOSS;
	}
	public String getA23_PRODUCT() {
		return A23_PRODUCT;
	}
	public void setA23_PRODUCT(String a23_PRODUCT) {
		A23_PRODUCT = a23_PRODUCT;
	}
	public BigDecimal getA23_TOTAL_NO_EVENT() {
		return A23_TOTAL_NO_EVENT;
	}
	public void setA23_TOTAL_NO_EVENT(BigDecimal a23_TOTAL_NO_EVENT) {
		A23_TOTAL_NO_EVENT = a23_TOTAL_NO_EVENT;
	}
	public BigDecimal getA23_NO_OF_CUST_EFFECTED() {
		return A23_NO_OF_CUST_EFFECTED;
	}
	public void setA23_NO_OF_CUST_EFFECTED(BigDecimal a23_NO_OF_CUST_EFFECTED) {
		A23_NO_OF_CUST_EFFECTED = a23_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA23_AMOUNT_INVOLVED() {
		return A23_AMOUNT_INVOLVED;
	}
	public void setA23_AMOUNT_INVOLVED(BigDecimal a23_AMOUNT_INVOLVED) {
		A23_AMOUNT_INVOLVED = a23_AMOUNT_INVOLVED;
	}
	public BigDecimal getA23_NO_OF_FUNC_AREAS_INVOLVED() {
		return A23_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA23_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a23_NO_OF_FUNC_AREAS_INVOLVED) {
		A23_NO_OF_FUNC_AREAS_INVOLVED = a23_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA23_AMOUNT_OF_MAX_LOSS() {
		return A23_AMOUNT_OF_MAX_LOSS;
	}
	public void setA23_AMOUNT_OF_MAX_LOSS(BigDecimal a23_AMOUNT_OF_MAX_LOSS) {
		A23_AMOUNT_OF_MAX_LOSS = a23_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA23_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A23_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA23_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a23_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A23_AMOUNT_OF_ACTUAL_GROSS_LOSS = a23_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA23_AMOUNT_RECOVERED() {
		return A23_AMOUNT_RECOVERED;
	}
	public void setA23_AMOUNT_RECOVERED(BigDecimal a23_AMOUNT_RECOVERED) {
		A23_AMOUNT_RECOVERED = a23_AMOUNT_RECOVERED;
	}
	public BigDecimal getA23_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A23_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA23_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a23_AMOUNT_CLAIMED_FROM_INSURERS) {
		A23_AMOUNT_CLAIMED_FROM_INSURERS = a23_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA23_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A23_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA23_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a23_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A23_AMOUNT_RECOVERED_THROUGH_INSURERS = a23_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA23_ACTUAL_NET_LOSS() {
		return A23_ACTUAL_NET_LOSS;
	}
	public void setA23_ACTUAL_NET_LOSS(BigDecimal a23_ACTUAL_NET_LOSS) {
		A23_ACTUAL_NET_LOSS = a23_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA23_TOTAL_NO_OF_NEAR_MISS() {
		return A23_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA23_TOTAL_NO_OF_NEAR_MISS(BigDecimal a23_TOTAL_NO_OF_NEAR_MISS) {
		A23_TOTAL_NO_OF_NEAR_MISS = a23_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA23_NO_OF_SIGNIFICANT_EVENTS() {
		return A23_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA23_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a23_NO_OF_SIGNIFICANT_EVENTS) {
		A23_NO_OF_SIGNIFICANT_EVENTS = a23_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA23_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A23_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA23_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a23_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A23_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a23_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA23_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A23_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA23_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a23_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A23_SIGNIFICANT_EVENT_ACTUAL_LOSS = a23_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA23_PREV_GROSS_LOSS() {
		return A23_PREV_GROSS_LOSS;
	}
	public void setA23_PREV_GROSS_LOSS(BigDecimal a23_PREV_GROSS_LOSS) {
		A23_PREV_GROSS_LOSS = a23_PREV_GROSS_LOSS;
	}
	public BigDecimal getA23_PREV_AMOUNT_RECOVERED() {
		return A23_PREV_AMOUNT_RECOVERED;
	}
	public void setA23_PREV_AMOUNT_RECOVERED(BigDecimal a23_PREV_AMOUNT_RECOVERED) {
		A23_PREV_AMOUNT_RECOVERED = a23_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA23_PREV_AMOUNT_CLAIMED() {
		return A23_PREV_AMOUNT_CLAIMED;
	}
	public void setA23_PREV_AMOUNT_CLAIMED(BigDecimal a23_PREV_AMOUNT_CLAIMED) {
		A23_PREV_AMOUNT_CLAIMED = a23_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA23_PREVT_AMOUNT_RECOVERED() {
		return A23_PREVT_AMOUNT_RECOVERED;
	}
	public void setA23_PREVT_AMOUNT_RECOVERED(BigDecimal a23_PREVT_AMOUNT_RECOVERED) {
		A23_PREVT_AMOUNT_RECOVERED = a23_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA23_PREV_ACTUAL_NET_LOSS() {
		return A23_PREV_ACTUAL_NET_LOSS;
	}
	public void setA23_PREV_ACTUAL_NET_LOSS(BigDecimal a23_PREV_ACTUAL_NET_LOSS) {
		A23_PREV_ACTUAL_NET_LOSS = a23_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA23_CUR_ACTUAL_GROSS_LOSS() {
		return A23_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA23_CUR_ACTUAL_GROSS_LOSS(BigDecimal a23_CUR_ACTUAL_GROSS_LOSS) {
		A23_CUR_ACTUAL_GROSS_LOSS = a23_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA23_CUR_AMOUNT_RECOVERED() {
		return A23_CUR_AMOUNT_RECOVERED;
	}
	public void setA23_CUR_AMOUNT_RECOVERED(BigDecimal a23_CUR_AMOUNT_RECOVERED) {
		A23_CUR_AMOUNT_RECOVERED = a23_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA23_CUT_AMOUNT_CLAIMED() {
		return A23_CUT_AMOUNT_CLAIMED;
	}
	public void setA23_CUT_AMOUNT_CLAIMED(BigDecimal a23_CUT_AMOUNT_CLAIMED) {
		A23_CUT_AMOUNT_CLAIMED = a23_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA23_CUT_AMOUNT_RECOVERED() {
		return A23_CUT_AMOUNT_RECOVERED;
	}
	public void setA23_CUT_AMOUNT_RECOVERED(BigDecimal a23_CUT_AMOUNT_RECOVERED) {
		A23_CUT_AMOUNT_RECOVERED = a23_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA23_CUR_ACTUAL_NET_LOSS() {
		return A23_CUR_ACTUAL_NET_LOSS;
	}
	public void setA23_CUR_ACTUAL_NET_LOSS(BigDecimal a23_CUR_ACTUAL_NET_LOSS) {
		A23_CUR_ACTUAL_NET_LOSS = a23_CUR_ACTUAL_NET_LOSS;
	}
	public String getA24_PRODUCT() {
		return A24_PRODUCT;
	}
	public void setA24_PRODUCT(String a24_PRODUCT) {
		A24_PRODUCT = a24_PRODUCT;
	}
	public BigDecimal getA24_TOTAL_NO_EVENT() {
		return A24_TOTAL_NO_EVENT;
	}
	public void setA24_TOTAL_NO_EVENT(BigDecimal a24_TOTAL_NO_EVENT) {
		A24_TOTAL_NO_EVENT = a24_TOTAL_NO_EVENT;
	}
	public BigDecimal getA24_NO_OF_CUST_EFFECTED() {
		return A24_NO_OF_CUST_EFFECTED;
	}
	public void setA24_NO_OF_CUST_EFFECTED(BigDecimal a24_NO_OF_CUST_EFFECTED) {
		A24_NO_OF_CUST_EFFECTED = a24_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA24_AMOUNT_INVOLVED() {
		return A24_AMOUNT_INVOLVED;
	}
	public void setA24_AMOUNT_INVOLVED(BigDecimal a24_AMOUNT_INVOLVED) {
		A24_AMOUNT_INVOLVED = a24_AMOUNT_INVOLVED;
	}
	public BigDecimal getA24_NO_OF_FUNC_AREAS_INVOLVED() {
		return A24_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA24_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a24_NO_OF_FUNC_AREAS_INVOLVED) {
		A24_NO_OF_FUNC_AREAS_INVOLVED = a24_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA24_AMOUNT_OF_MAX_LOSS() {
		return A24_AMOUNT_OF_MAX_LOSS;
	}
	public void setA24_AMOUNT_OF_MAX_LOSS(BigDecimal a24_AMOUNT_OF_MAX_LOSS) {
		A24_AMOUNT_OF_MAX_LOSS = a24_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA24_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A24_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA24_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a24_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A24_AMOUNT_OF_ACTUAL_GROSS_LOSS = a24_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA24_AMOUNT_RECOVERED() {
		return A24_AMOUNT_RECOVERED;
	}
	public void setA24_AMOUNT_RECOVERED(BigDecimal a24_AMOUNT_RECOVERED) {
		A24_AMOUNT_RECOVERED = a24_AMOUNT_RECOVERED;
	}
	public BigDecimal getA24_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A24_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA24_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a24_AMOUNT_CLAIMED_FROM_INSURERS) {
		A24_AMOUNT_CLAIMED_FROM_INSURERS = a24_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA24_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A24_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA24_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a24_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A24_AMOUNT_RECOVERED_THROUGH_INSURERS = a24_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA24_ACTUAL_NET_LOSS() {
		return A24_ACTUAL_NET_LOSS;
	}
	public void setA24_ACTUAL_NET_LOSS(BigDecimal a24_ACTUAL_NET_LOSS) {
		A24_ACTUAL_NET_LOSS = a24_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA24_TOTAL_NO_OF_NEAR_MISS() {
		return A24_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA24_TOTAL_NO_OF_NEAR_MISS(BigDecimal a24_TOTAL_NO_OF_NEAR_MISS) {
		A24_TOTAL_NO_OF_NEAR_MISS = a24_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA24_NO_OF_SIGNIFICANT_EVENTS() {
		return A24_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA24_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a24_NO_OF_SIGNIFICANT_EVENTS) {
		A24_NO_OF_SIGNIFICANT_EVENTS = a24_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA24_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A24_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA24_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a24_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A24_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a24_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA24_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A24_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA24_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a24_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A24_SIGNIFICANT_EVENT_ACTUAL_LOSS = a24_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA24_PREV_GROSS_LOSS() {
		return A24_PREV_GROSS_LOSS;
	}
	public void setA24_PREV_GROSS_LOSS(BigDecimal a24_PREV_GROSS_LOSS) {
		A24_PREV_GROSS_LOSS = a24_PREV_GROSS_LOSS;
	}
	public BigDecimal getA24_PREV_AMOUNT_RECOVERED() {
		return A24_PREV_AMOUNT_RECOVERED;
	}
	public void setA24_PREV_AMOUNT_RECOVERED(BigDecimal a24_PREV_AMOUNT_RECOVERED) {
		A24_PREV_AMOUNT_RECOVERED = a24_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA24_PREV_AMOUNT_CLAIMED() {
		return A24_PREV_AMOUNT_CLAIMED;
	}
	public void setA24_PREV_AMOUNT_CLAIMED(BigDecimal a24_PREV_AMOUNT_CLAIMED) {
		A24_PREV_AMOUNT_CLAIMED = a24_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA24_PREVT_AMOUNT_RECOVERED() {
		return A24_PREVT_AMOUNT_RECOVERED;
	}
	public void setA24_PREVT_AMOUNT_RECOVERED(BigDecimal a24_PREVT_AMOUNT_RECOVERED) {
		A24_PREVT_AMOUNT_RECOVERED = a24_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA24_PREV_ACTUAL_NET_LOSS() {
		return A24_PREV_ACTUAL_NET_LOSS;
	}
	public void setA24_PREV_ACTUAL_NET_LOSS(BigDecimal a24_PREV_ACTUAL_NET_LOSS) {
		A24_PREV_ACTUAL_NET_LOSS = a24_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA24_CUR_ACTUAL_GROSS_LOSS() {
		return A24_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA24_CUR_ACTUAL_GROSS_LOSS(BigDecimal a24_CUR_ACTUAL_GROSS_LOSS) {
		A24_CUR_ACTUAL_GROSS_LOSS = a24_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA24_CUR_AMOUNT_RECOVERED() {
		return A24_CUR_AMOUNT_RECOVERED;
	}
	public void setA24_CUR_AMOUNT_RECOVERED(BigDecimal a24_CUR_AMOUNT_RECOVERED) {
		A24_CUR_AMOUNT_RECOVERED = a24_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA24_CUT_AMOUNT_CLAIMED() {
		return A24_CUT_AMOUNT_CLAIMED;
	}
	public void setA24_CUT_AMOUNT_CLAIMED(BigDecimal a24_CUT_AMOUNT_CLAIMED) {
		A24_CUT_AMOUNT_CLAIMED = a24_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA24_CUT_AMOUNT_RECOVERED() {
		return A24_CUT_AMOUNT_RECOVERED;
	}
	public void setA24_CUT_AMOUNT_RECOVERED(BigDecimal a24_CUT_AMOUNT_RECOVERED) {
		A24_CUT_AMOUNT_RECOVERED = a24_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA24_CUR_ACTUAL_NET_LOSS() {
		return A24_CUR_ACTUAL_NET_LOSS;
	}
	public void setA24_CUR_ACTUAL_NET_LOSS(BigDecimal a24_CUR_ACTUAL_NET_LOSS) {
		A24_CUR_ACTUAL_NET_LOSS = a24_CUR_ACTUAL_NET_LOSS;
	}
	public String getA25_PRODUCT() {
		return A25_PRODUCT;
	}
	public void setA25_PRODUCT(String a25_PRODUCT) {
		A25_PRODUCT = a25_PRODUCT;
	}
	public BigDecimal getA25_TOTAL_NO_EVENT() {
		return A25_TOTAL_NO_EVENT;
	}
	public void setA25_TOTAL_NO_EVENT(BigDecimal a25_TOTAL_NO_EVENT) {
		A25_TOTAL_NO_EVENT = a25_TOTAL_NO_EVENT;
	}
	public BigDecimal getA25_NO_OF_CUST_EFFECTED() {
		return A25_NO_OF_CUST_EFFECTED;
	}
	public void setA25_NO_OF_CUST_EFFECTED(BigDecimal a25_NO_OF_CUST_EFFECTED) {
		A25_NO_OF_CUST_EFFECTED = a25_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA25_AMOUNT_INVOLVED() {
		return A25_AMOUNT_INVOLVED;
	}
	public void setA25_AMOUNT_INVOLVED(BigDecimal a25_AMOUNT_INVOLVED) {
		A25_AMOUNT_INVOLVED = a25_AMOUNT_INVOLVED;
	}
	public BigDecimal getA25_NO_OF_FUNC_AREAS_INVOLVED() {
		return A25_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA25_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a25_NO_OF_FUNC_AREAS_INVOLVED) {
		A25_NO_OF_FUNC_AREAS_INVOLVED = a25_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA25_AMOUNT_OF_MAX_LOSS() {
		return A25_AMOUNT_OF_MAX_LOSS;
	}
	public void setA25_AMOUNT_OF_MAX_LOSS(BigDecimal a25_AMOUNT_OF_MAX_LOSS) {
		A25_AMOUNT_OF_MAX_LOSS = a25_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA25_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A25_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA25_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a25_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A25_AMOUNT_OF_ACTUAL_GROSS_LOSS = a25_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA25_AMOUNT_RECOVERED() {
		return A25_AMOUNT_RECOVERED;
	}
	public void setA25_AMOUNT_RECOVERED(BigDecimal a25_AMOUNT_RECOVERED) {
		A25_AMOUNT_RECOVERED = a25_AMOUNT_RECOVERED;
	}
	public BigDecimal getA25_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A25_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA25_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a25_AMOUNT_CLAIMED_FROM_INSURERS) {
		A25_AMOUNT_CLAIMED_FROM_INSURERS = a25_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA25_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A25_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA25_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a25_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A25_AMOUNT_RECOVERED_THROUGH_INSURERS = a25_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA25_ACTUAL_NET_LOSS() {
		return A25_ACTUAL_NET_LOSS;
	}
	public void setA25_ACTUAL_NET_LOSS(BigDecimal a25_ACTUAL_NET_LOSS) {
		A25_ACTUAL_NET_LOSS = a25_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA25_TOTAL_NO_OF_NEAR_MISS() {
		return A25_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA25_TOTAL_NO_OF_NEAR_MISS(BigDecimal a25_TOTAL_NO_OF_NEAR_MISS) {
		A25_TOTAL_NO_OF_NEAR_MISS = a25_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA25_NO_OF_SIGNIFICANT_EVENTS() {
		return A25_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA25_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a25_NO_OF_SIGNIFICANT_EVENTS) {
		A25_NO_OF_SIGNIFICANT_EVENTS = a25_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA25_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A25_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA25_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a25_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A25_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a25_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA25_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A25_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA25_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a25_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A25_SIGNIFICANT_EVENT_ACTUAL_LOSS = a25_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA25_PREV_GROSS_LOSS() {
		return A25_PREV_GROSS_LOSS;
	}
	public void setA25_PREV_GROSS_LOSS(BigDecimal a25_PREV_GROSS_LOSS) {
		A25_PREV_GROSS_LOSS = a25_PREV_GROSS_LOSS;
	}
	public BigDecimal getA25_PREV_AMOUNT_RECOVERED() {
		return A25_PREV_AMOUNT_RECOVERED;
	}
	public void setA25_PREV_AMOUNT_RECOVERED(BigDecimal a25_PREV_AMOUNT_RECOVERED) {
		A25_PREV_AMOUNT_RECOVERED = a25_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA25_PREV_AMOUNT_CLAIMED() {
		return A25_PREV_AMOUNT_CLAIMED;
	}
	public void setA25_PREV_AMOUNT_CLAIMED(BigDecimal a25_PREV_AMOUNT_CLAIMED) {
		A25_PREV_AMOUNT_CLAIMED = a25_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA25_PREVT_AMOUNT_RECOVERED() {
		return A25_PREVT_AMOUNT_RECOVERED;
	}
	public void setA25_PREVT_AMOUNT_RECOVERED(BigDecimal a25_PREVT_AMOUNT_RECOVERED) {
		A25_PREVT_AMOUNT_RECOVERED = a25_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA25_PREV_ACTUAL_NET_LOSS() {
		return A25_PREV_ACTUAL_NET_LOSS;
	}
	public void setA25_PREV_ACTUAL_NET_LOSS(BigDecimal a25_PREV_ACTUAL_NET_LOSS) {
		A25_PREV_ACTUAL_NET_LOSS = a25_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA25_CUR_ACTUAL_GROSS_LOSS() {
		return A25_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA25_CUR_ACTUAL_GROSS_LOSS(BigDecimal a25_CUR_ACTUAL_GROSS_LOSS) {
		A25_CUR_ACTUAL_GROSS_LOSS = a25_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA25_CUR_AMOUNT_RECOVERED() {
		return A25_CUR_AMOUNT_RECOVERED;
	}
	public void setA25_CUR_AMOUNT_RECOVERED(BigDecimal a25_CUR_AMOUNT_RECOVERED) {
		A25_CUR_AMOUNT_RECOVERED = a25_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA25_CUT_AMOUNT_CLAIMED() {
		return A25_CUT_AMOUNT_CLAIMED;
	}
	public void setA25_CUT_AMOUNT_CLAIMED(BigDecimal a25_CUT_AMOUNT_CLAIMED) {
		A25_CUT_AMOUNT_CLAIMED = a25_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA25_CUT_AMOUNT_RECOVERED() {
		return A25_CUT_AMOUNT_RECOVERED;
	}
	public void setA25_CUT_AMOUNT_RECOVERED(BigDecimal a25_CUT_AMOUNT_RECOVERED) {
		A25_CUT_AMOUNT_RECOVERED = a25_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA25_CUR_ACTUAL_NET_LOSS() {
		return A25_CUR_ACTUAL_NET_LOSS;
	}
	public void setA25_CUR_ACTUAL_NET_LOSS(BigDecimal a25_CUR_ACTUAL_NET_LOSS) {
		A25_CUR_ACTUAL_NET_LOSS = a25_CUR_ACTUAL_NET_LOSS;
	}
	public String getA26_PRODUCT() {
		return A26_PRODUCT;
	}
	public void setA26_PRODUCT(String a26_PRODUCT) {
		A26_PRODUCT = a26_PRODUCT;
	}
	public BigDecimal getA26_TOTAL_NO_EVENT() {
		return A26_TOTAL_NO_EVENT;
	}
	public void setA26_TOTAL_NO_EVENT(BigDecimal a26_TOTAL_NO_EVENT) {
		A26_TOTAL_NO_EVENT = a26_TOTAL_NO_EVENT;
	}
	public BigDecimal getA26_NO_OF_CUST_EFFECTED() {
		return A26_NO_OF_CUST_EFFECTED;
	}
	public void setA26_NO_OF_CUST_EFFECTED(BigDecimal a26_NO_OF_CUST_EFFECTED) {
		A26_NO_OF_CUST_EFFECTED = a26_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA26_AMOUNT_INVOLVED() {
		return A26_AMOUNT_INVOLVED;
	}
	public void setA26_AMOUNT_INVOLVED(BigDecimal a26_AMOUNT_INVOLVED) {
		A26_AMOUNT_INVOLVED = a26_AMOUNT_INVOLVED;
	}
	public BigDecimal getA26_NO_OF_FUNC_AREAS_INVOLVED() {
		return A26_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA26_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a26_NO_OF_FUNC_AREAS_INVOLVED) {
		A26_NO_OF_FUNC_AREAS_INVOLVED = a26_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA26_AMOUNT_OF_MAX_LOSS() {
		return A26_AMOUNT_OF_MAX_LOSS;
	}
	public void setA26_AMOUNT_OF_MAX_LOSS(BigDecimal a26_AMOUNT_OF_MAX_LOSS) {
		A26_AMOUNT_OF_MAX_LOSS = a26_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA26_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A26_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA26_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a26_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A26_AMOUNT_OF_ACTUAL_GROSS_LOSS = a26_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA26_AMOUNT_RECOVERED() {
		return A26_AMOUNT_RECOVERED;
	}
	public void setA26_AMOUNT_RECOVERED(BigDecimal a26_AMOUNT_RECOVERED) {
		A26_AMOUNT_RECOVERED = a26_AMOUNT_RECOVERED;
	}
	public BigDecimal getA26_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A26_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA26_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a26_AMOUNT_CLAIMED_FROM_INSURERS) {
		A26_AMOUNT_CLAIMED_FROM_INSURERS = a26_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA26_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A26_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA26_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a26_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A26_AMOUNT_RECOVERED_THROUGH_INSURERS = a26_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA26_ACTUAL_NET_LOSS() {
		return A26_ACTUAL_NET_LOSS;
	}
	public void setA26_ACTUAL_NET_LOSS(BigDecimal a26_ACTUAL_NET_LOSS) {
		A26_ACTUAL_NET_LOSS = a26_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA26_TOTAL_NO_OF_NEAR_MISS() {
		return A26_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA26_TOTAL_NO_OF_NEAR_MISS(BigDecimal a26_TOTAL_NO_OF_NEAR_MISS) {
		A26_TOTAL_NO_OF_NEAR_MISS = a26_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA26_NO_OF_SIGNIFICANT_EVENTS() {
		return A26_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA26_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a26_NO_OF_SIGNIFICANT_EVENTS) {
		A26_NO_OF_SIGNIFICANT_EVENTS = a26_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA26_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A26_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA26_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a26_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A26_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a26_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA26_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A26_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA26_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a26_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A26_SIGNIFICANT_EVENT_ACTUAL_LOSS = a26_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA26_PREV_GROSS_LOSS() {
		return A26_PREV_GROSS_LOSS;
	}
	public void setA26_PREV_GROSS_LOSS(BigDecimal a26_PREV_GROSS_LOSS) {
		A26_PREV_GROSS_LOSS = a26_PREV_GROSS_LOSS;
	}
	public BigDecimal getA26_PREV_AMOUNT_RECOVERED() {
		return A26_PREV_AMOUNT_RECOVERED;
	}
	public void setA26_PREV_AMOUNT_RECOVERED(BigDecimal a26_PREV_AMOUNT_RECOVERED) {
		A26_PREV_AMOUNT_RECOVERED = a26_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA26_PREV_AMOUNT_CLAIMED() {
		return A26_PREV_AMOUNT_CLAIMED;
	}
	public void setA26_PREV_AMOUNT_CLAIMED(BigDecimal a26_PREV_AMOUNT_CLAIMED) {
		A26_PREV_AMOUNT_CLAIMED = a26_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA26_PREVT_AMOUNT_RECOVERED() {
		return A26_PREVT_AMOUNT_RECOVERED;
	}
	public void setA26_PREVT_AMOUNT_RECOVERED(BigDecimal a26_PREVT_AMOUNT_RECOVERED) {
		A26_PREVT_AMOUNT_RECOVERED = a26_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA26_PREV_ACTUAL_NET_LOSS() {
		return A26_PREV_ACTUAL_NET_LOSS;
	}
	public void setA26_PREV_ACTUAL_NET_LOSS(BigDecimal a26_PREV_ACTUAL_NET_LOSS) {
		A26_PREV_ACTUAL_NET_LOSS = a26_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA26_CUR_ACTUAL_GROSS_LOSS() {
		return A26_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA26_CUR_ACTUAL_GROSS_LOSS(BigDecimal a26_CUR_ACTUAL_GROSS_LOSS) {
		A26_CUR_ACTUAL_GROSS_LOSS = a26_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA26_CUR_AMOUNT_RECOVERED() {
		return A26_CUR_AMOUNT_RECOVERED;
	}
	public void setA26_CUR_AMOUNT_RECOVERED(BigDecimal a26_CUR_AMOUNT_RECOVERED) {
		A26_CUR_AMOUNT_RECOVERED = a26_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA26_CUT_AMOUNT_CLAIMED() {
		return A26_CUT_AMOUNT_CLAIMED;
	}
	public void setA26_CUT_AMOUNT_CLAIMED(BigDecimal a26_CUT_AMOUNT_CLAIMED) {
		A26_CUT_AMOUNT_CLAIMED = a26_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA26_CUT_AMOUNT_RECOVERED() {
		return A26_CUT_AMOUNT_RECOVERED;
	}
	public void setA26_CUT_AMOUNT_RECOVERED(BigDecimal a26_CUT_AMOUNT_RECOVERED) {
		A26_CUT_AMOUNT_RECOVERED = a26_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA26_CUR_ACTUAL_NET_LOSS() {
		return A26_CUR_ACTUAL_NET_LOSS;
	}
	public void setA26_CUR_ACTUAL_NET_LOSS(BigDecimal a26_CUR_ACTUAL_NET_LOSS) {
		A26_CUR_ACTUAL_NET_LOSS = a26_CUR_ACTUAL_NET_LOSS;
	}
	public String getA27_PRODUCT() {
		return A27_PRODUCT;
	}
	public void setA27_PRODUCT(String a27_PRODUCT) {
		A27_PRODUCT = a27_PRODUCT;
	}
	public BigDecimal getA27_TOTAL_NO_EVENT() {
		return A27_TOTAL_NO_EVENT;
	}
	public void setA27_TOTAL_NO_EVENT(BigDecimal a27_TOTAL_NO_EVENT) {
		A27_TOTAL_NO_EVENT = a27_TOTAL_NO_EVENT;
	}
	public BigDecimal getA27_NO_OF_CUST_EFFECTED() {
		return A27_NO_OF_CUST_EFFECTED;
	}
	public void setA27_NO_OF_CUST_EFFECTED(BigDecimal a27_NO_OF_CUST_EFFECTED) {
		A27_NO_OF_CUST_EFFECTED = a27_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA27_AMOUNT_INVOLVED() {
		return A27_AMOUNT_INVOLVED;
	}
	public void setA27_AMOUNT_INVOLVED(BigDecimal a27_AMOUNT_INVOLVED) {
		A27_AMOUNT_INVOLVED = a27_AMOUNT_INVOLVED;
	}
	public BigDecimal getA27_NO_OF_FUNC_AREAS_INVOLVED() {
		return A27_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA27_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a27_NO_OF_FUNC_AREAS_INVOLVED) {
		A27_NO_OF_FUNC_AREAS_INVOLVED = a27_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA27_AMOUNT_OF_MAX_LOSS() {
		return A27_AMOUNT_OF_MAX_LOSS;
	}
	public void setA27_AMOUNT_OF_MAX_LOSS(BigDecimal a27_AMOUNT_OF_MAX_LOSS) {
		A27_AMOUNT_OF_MAX_LOSS = a27_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA27_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A27_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA27_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a27_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A27_AMOUNT_OF_ACTUAL_GROSS_LOSS = a27_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA27_AMOUNT_RECOVERED() {
		return A27_AMOUNT_RECOVERED;
	}
	public void setA27_AMOUNT_RECOVERED(BigDecimal a27_AMOUNT_RECOVERED) {
		A27_AMOUNT_RECOVERED = a27_AMOUNT_RECOVERED;
	}
	public BigDecimal getA27_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A27_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA27_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a27_AMOUNT_CLAIMED_FROM_INSURERS) {
		A27_AMOUNT_CLAIMED_FROM_INSURERS = a27_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA27_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A27_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA27_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a27_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A27_AMOUNT_RECOVERED_THROUGH_INSURERS = a27_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA27_ACTUAL_NET_LOSS() {
		return A27_ACTUAL_NET_LOSS;
	}
	public void setA27_ACTUAL_NET_LOSS(BigDecimal a27_ACTUAL_NET_LOSS) {
		A27_ACTUAL_NET_LOSS = a27_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA27_TOTAL_NO_OF_NEAR_MISS() {
		return A27_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA27_TOTAL_NO_OF_NEAR_MISS(BigDecimal a27_TOTAL_NO_OF_NEAR_MISS) {
		A27_TOTAL_NO_OF_NEAR_MISS = a27_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA27_NO_OF_SIGNIFICANT_EVENTS() {
		return A27_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA27_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a27_NO_OF_SIGNIFICANT_EVENTS) {
		A27_NO_OF_SIGNIFICANT_EVENTS = a27_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA27_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A27_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA27_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a27_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A27_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a27_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA27_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A27_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA27_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a27_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A27_SIGNIFICANT_EVENT_ACTUAL_LOSS = a27_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA27_PREV_GROSS_LOSS() {
		return A27_PREV_GROSS_LOSS;
	}
	public void setA27_PREV_GROSS_LOSS(BigDecimal a27_PREV_GROSS_LOSS) {
		A27_PREV_GROSS_LOSS = a27_PREV_GROSS_LOSS;
	}
	public BigDecimal getA27_PREV_AMOUNT_RECOVERED() {
		return A27_PREV_AMOUNT_RECOVERED;
	}
	public void setA27_PREV_AMOUNT_RECOVERED(BigDecimal a27_PREV_AMOUNT_RECOVERED) {
		A27_PREV_AMOUNT_RECOVERED = a27_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA27_PREV_AMOUNT_CLAIMED() {
		return A27_PREV_AMOUNT_CLAIMED;
	}
	public void setA27_PREV_AMOUNT_CLAIMED(BigDecimal a27_PREV_AMOUNT_CLAIMED) {
		A27_PREV_AMOUNT_CLAIMED = a27_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA27_PREVT_AMOUNT_RECOVERED() {
		return A27_PREVT_AMOUNT_RECOVERED;
	}
	public void setA27_PREVT_AMOUNT_RECOVERED(BigDecimal a27_PREVT_AMOUNT_RECOVERED) {
		A27_PREVT_AMOUNT_RECOVERED = a27_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA27_PREV_ACTUAL_NET_LOSS() {
		return A27_PREV_ACTUAL_NET_LOSS;
	}
	public void setA27_PREV_ACTUAL_NET_LOSS(BigDecimal a27_PREV_ACTUAL_NET_LOSS) {
		A27_PREV_ACTUAL_NET_LOSS = a27_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA27_CUR_ACTUAL_GROSS_LOSS() {
		return A27_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA27_CUR_ACTUAL_GROSS_LOSS(BigDecimal a27_CUR_ACTUAL_GROSS_LOSS) {
		A27_CUR_ACTUAL_GROSS_LOSS = a27_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA27_CUR_AMOUNT_RECOVERED() {
		return A27_CUR_AMOUNT_RECOVERED;
	}
	public void setA27_CUR_AMOUNT_RECOVERED(BigDecimal a27_CUR_AMOUNT_RECOVERED) {
		A27_CUR_AMOUNT_RECOVERED = a27_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA27_CUT_AMOUNT_CLAIMED() {
		return A27_CUT_AMOUNT_CLAIMED;
	}
	public void setA27_CUT_AMOUNT_CLAIMED(BigDecimal a27_CUT_AMOUNT_CLAIMED) {
		A27_CUT_AMOUNT_CLAIMED = a27_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA27_CUT_AMOUNT_RECOVERED() {
		return A27_CUT_AMOUNT_RECOVERED;
	}
	public void setA27_CUT_AMOUNT_RECOVERED(BigDecimal a27_CUT_AMOUNT_RECOVERED) {
		A27_CUT_AMOUNT_RECOVERED = a27_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA27_CUR_ACTUAL_NET_LOSS() {
		return A27_CUR_ACTUAL_NET_LOSS;
	}
	public void setA27_CUR_ACTUAL_NET_LOSS(BigDecimal a27_CUR_ACTUAL_NET_LOSS) {
		A27_CUR_ACTUAL_NET_LOSS = a27_CUR_ACTUAL_NET_LOSS;
	}
	public String getA28_PRODUCT() {
		return A28_PRODUCT;
	}
	public void setA28_PRODUCT(String a28_PRODUCT) {
		A28_PRODUCT = a28_PRODUCT;
	}
	public BigDecimal getA28_TOTAL_NO_EVENT() {
		return A28_TOTAL_NO_EVENT;
	}
	public void setA28_TOTAL_NO_EVENT(BigDecimal a28_TOTAL_NO_EVENT) {
		A28_TOTAL_NO_EVENT = a28_TOTAL_NO_EVENT;
	}
	public BigDecimal getA28_NO_OF_CUST_EFFECTED() {
		return A28_NO_OF_CUST_EFFECTED;
	}
	public void setA28_NO_OF_CUST_EFFECTED(BigDecimal a28_NO_OF_CUST_EFFECTED) {
		A28_NO_OF_CUST_EFFECTED = a28_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA28_AMOUNT_INVOLVED() {
		return A28_AMOUNT_INVOLVED;
	}
	public void setA28_AMOUNT_INVOLVED(BigDecimal a28_AMOUNT_INVOLVED) {
		A28_AMOUNT_INVOLVED = a28_AMOUNT_INVOLVED;
	}
	public BigDecimal getA28_NO_OF_FUNC_AREAS_INVOLVED() {
		return A28_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA28_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a28_NO_OF_FUNC_AREAS_INVOLVED) {
		A28_NO_OF_FUNC_AREAS_INVOLVED = a28_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA28_AMOUNT_OF_MAX_LOSS() {
		return A28_AMOUNT_OF_MAX_LOSS;
	}
	public void setA28_AMOUNT_OF_MAX_LOSS(BigDecimal a28_AMOUNT_OF_MAX_LOSS) {
		A28_AMOUNT_OF_MAX_LOSS = a28_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA28_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A28_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA28_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a28_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A28_AMOUNT_OF_ACTUAL_GROSS_LOSS = a28_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA28_AMOUNT_RECOVERED() {
		return A28_AMOUNT_RECOVERED;
	}
	public void setA28_AMOUNT_RECOVERED(BigDecimal a28_AMOUNT_RECOVERED) {
		A28_AMOUNT_RECOVERED = a28_AMOUNT_RECOVERED;
	}
	public BigDecimal getA28_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A28_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA28_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a28_AMOUNT_CLAIMED_FROM_INSURERS) {
		A28_AMOUNT_CLAIMED_FROM_INSURERS = a28_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA28_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A28_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA28_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a28_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A28_AMOUNT_RECOVERED_THROUGH_INSURERS = a28_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA28_ACTUAL_NET_LOSS() {
		return A28_ACTUAL_NET_LOSS;
	}
	public void setA28_ACTUAL_NET_LOSS(BigDecimal a28_ACTUAL_NET_LOSS) {
		A28_ACTUAL_NET_LOSS = a28_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA28_TOTAL_NO_OF_NEAR_MISS() {
		return A28_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA28_TOTAL_NO_OF_NEAR_MISS(BigDecimal a28_TOTAL_NO_OF_NEAR_MISS) {
		A28_TOTAL_NO_OF_NEAR_MISS = a28_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA28_NO_OF_SIGNIFICANT_EVENTS() {
		return A28_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA28_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a28_NO_OF_SIGNIFICANT_EVENTS) {
		A28_NO_OF_SIGNIFICANT_EVENTS = a28_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA28_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A28_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA28_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a28_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A28_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a28_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA28_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A28_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA28_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a28_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A28_SIGNIFICANT_EVENT_ACTUAL_LOSS = a28_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA28_PREV_GROSS_LOSS() {
		return A28_PREV_GROSS_LOSS;
	}
	public void setA28_PREV_GROSS_LOSS(BigDecimal a28_PREV_GROSS_LOSS) {
		A28_PREV_GROSS_LOSS = a28_PREV_GROSS_LOSS;
	}
	public BigDecimal getA28_PREV_AMOUNT_RECOVERED() {
		return A28_PREV_AMOUNT_RECOVERED;
	}
	public void setA28_PREV_AMOUNT_RECOVERED(BigDecimal a28_PREV_AMOUNT_RECOVERED) {
		A28_PREV_AMOUNT_RECOVERED = a28_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA28_PREV_AMOUNT_CLAIMED() {
		return A28_PREV_AMOUNT_CLAIMED;
	}
	public void setA28_PREV_AMOUNT_CLAIMED(BigDecimal a28_PREV_AMOUNT_CLAIMED) {
		A28_PREV_AMOUNT_CLAIMED = a28_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA28_PREVT_AMOUNT_RECOVERED() {
		return A28_PREVT_AMOUNT_RECOVERED;
	}
	public void setA28_PREVT_AMOUNT_RECOVERED(BigDecimal a28_PREVT_AMOUNT_RECOVERED) {
		A28_PREVT_AMOUNT_RECOVERED = a28_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA28_PREV_ACTUAL_NET_LOSS() {
		return A28_PREV_ACTUAL_NET_LOSS;
	}
	public void setA28_PREV_ACTUAL_NET_LOSS(BigDecimal a28_PREV_ACTUAL_NET_LOSS) {
		A28_PREV_ACTUAL_NET_LOSS = a28_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA28_CUR_ACTUAL_GROSS_LOSS() {
		return A28_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA28_CUR_ACTUAL_GROSS_LOSS(BigDecimal a28_CUR_ACTUAL_GROSS_LOSS) {
		A28_CUR_ACTUAL_GROSS_LOSS = a28_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA28_CUR_AMOUNT_RECOVERED() {
		return A28_CUR_AMOUNT_RECOVERED;
	}
	public void setA28_CUR_AMOUNT_RECOVERED(BigDecimal a28_CUR_AMOUNT_RECOVERED) {
		A28_CUR_AMOUNT_RECOVERED = a28_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA28_CUT_AMOUNT_CLAIMED() {
		return A28_CUT_AMOUNT_CLAIMED;
	}
	public void setA28_CUT_AMOUNT_CLAIMED(BigDecimal a28_CUT_AMOUNT_CLAIMED) {
		A28_CUT_AMOUNT_CLAIMED = a28_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA28_CUT_AMOUNT_RECOVERED() {
		return A28_CUT_AMOUNT_RECOVERED;
	}
	public void setA28_CUT_AMOUNT_RECOVERED(BigDecimal a28_CUT_AMOUNT_RECOVERED) {
		A28_CUT_AMOUNT_RECOVERED = a28_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA28_CUR_ACTUAL_NET_LOSS() {
		return A28_CUR_ACTUAL_NET_LOSS;
	}
	public void setA28_CUR_ACTUAL_NET_LOSS(BigDecimal a28_CUR_ACTUAL_NET_LOSS) {
		A28_CUR_ACTUAL_NET_LOSS = a28_CUR_ACTUAL_NET_LOSS;
	}
	public String getA29_PRODUCT() {
		return A29_PRODUCT;
	}
	public void setA29_PRODUCT(String a29_PRODUCT) {
		A29_PRODUCT = a29_PRODUCT;
	}
	public BigDecimal getA29_TOTAL_NO_EVENT() {
		return A29_TOTAL_NO_EVENT;
	}
	public void setA29_TOTAL_NO_EVENT(BigDecimal a29_TOTAL_NO_EVENT) {
		A29_TOTAL_NO_EVENT = a29_TOTAL_NO_EVENT;
	}
	public BigDecimal getA29_NO_OF_CUST_EFFECTED() {
		return A29_NO_OF_CUST_EFFECTED;
	}
	public void setA29_NO_OF_CUST_EFFECTED(BigDecimal a29_NO_OF_CUST_EFFECTED) {
		A29_NO_OF_CUST_EFFECTED = a29_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA29_AMOUNT_INVOLVED() {
		return A29_AMOUNT_INVOLVED;
	}
	public void setA29_AMOUNT_INVOLVED(BigDecimal a29_AMOUNT_INVOLVED) {
		A29_AMOUNT_INVOLVED = a29_AMOUNT_INVOLVED;
	}
	public BigDecimal getA29_NO_OF_FUNC_AREAS_INVOLVED() {
		return A29_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA29_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a29_NO_OF_FUNC_AREAS_INVOLVED) {
		A29_NO_OF_FUNC_AREAS_INVOLVED = a29_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA29_AMOUNT_OF_MAX_LOSS() {
		return A29_AMOUNT_OF_MAX_LOSS;
	}
	public void setA29_AMOUNT_OF_MAX_LOSS(BigDecimal a29_AMOUNT_OF_MAX_LOSS) {
		A29_AMOUNT_OF_MAX_LOSS = a29_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA29_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A29_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA29_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a29_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A29_AMOUNT_OF_ACTUAL_GROSS_LOSS = a29_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA29_AMOUNT_RECOVERED() {
		return A29_AMOUNT_RECOVERED;
	}
	public void setA29_AMOUNT_RECOVERED(BigDecimal a29_AMOUNT_RECOVERED) {
		A29_AMOUNT_RECOVERED = a29_AMOUNT_RECOVERED;
	}
	public BigDecimal getA29_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A29_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA29_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a29_AMOUNT_CLAIMED_FROM_INSURERS) {
		A29_AMOUNT_CLAIMED_FROM_INSURERS = a29_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA29_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A29_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA29_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a29_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A29_AMOUNT_RECOVERED_THROUGH_INSURERS = a29_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA29_ACTUAL_NET_LOSS() {
		return A29_ACTUAL_NET_LOSS;
	}
	public void setA29_ACTUAL_NET_LOSS(BigDecimal a29_ACTUAL_NET_LOSS) {
		A29_ACTUAL_NET_LOSS = a29_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA29_TOTAL_NO_OF_NEAR_MISS() {
		return A29_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA29_TOTAL_NO_OF_NEAR_MISS(BigDecimal a29_TOTAL_NO_OF_NEAR_MISS) {
		A29_TOTAL_NO_OF_NEAR_MISS = a29_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA29_NO_OF_SIGNIFICANT_EVENTS() {
		return A29_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA29_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a29_NO_OF_SIGNIFICANT_EVENTS) {
		A29_NO_OF_SIGNIFICANT_EVENTS = a29_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA29_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A29_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA29_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a29_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A29_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a29_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA29_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A29_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA29_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a29_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A29_SIGNIFICANT_EVENT_ACTUAL_LOSS = a29_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA29_PREV_GROSS_LOSS() {
		return A29_PREV_GROSS_LOSS;
	}
	public void setA29_PREV_GROSS_LOSS(BigDecimal a29_PREV_GROSS_LOSS) {
		A29_PREV_GROSS_LOSS = a29_PREV_GROSS_LOSS;
	}
	public BigDecimal getA29_PREV_AMOUNT_RECOVERED() {
		return A29_PREV_AMOUNT_RECOVERED;
	}
	public void setA29_PREV_AMOUNT_RECOVERED(BigDecimal a29_PREV_AMOUNT_RECOVERED) {
		A29_PREV_AMOUNT_RECOVERED = a29_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA29_PREV_AMOUNT_CLAIMED() {
		return A29_PREV_AMOUNT_CLAIMED;
	}
	public void setA29_PREV_AMOUNT_CLAIMED(BigDecimal a29_PREV_AMOUNT_CLAIMED) {
		A29_PREV_AMOUNT_CLAIMED = a29_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA29_PREVT_AMOUNT_RECOVERED() {
		return A29_PREVT_AMOUNT_RECOVERED;
	}
	public void setA29_PREVT_AMOUNT_RECOVERED(BigDecimal a29_PREVT_AMOUNT_RECOVERED) {
		A29_PREVT_AMOUNT_RECOVERED = a29_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA29_PREV_ACTUAL_NET_LOSS() {
		return A29_PREV_ACTUAL_NET_LOSS;
	}
	public void setA29_PREV_ACTUAL_NET_LOSS(BigDecimal a29_PREV_ACTUAL_NET_LOSS) {
		A29_PREV_ACTUAL_NET_LOSS = a29_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA29_CUR_ACTUAL_GROSS_LOSS() {
		return A29_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA29_CUR_ACTUAL_GROSS_LOSS(BigDecimal a29_CUR_ACTUAL_GROSS_LOSS) {
		A29_CUR_ACTUAL_GROSS_LOSS = a29_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA29_CUR_AMOUNT_RECOVERED() {
		return A29_CUR_AMOUNT_RECOVERED;
	}
	public void setA29_CUR_AMOUNT_RECOVERED(BigDecimal a29_CUR_AMOUNT_RECOVERED) {
		A29_CUR_AMOUNT_RECOVERED = a29_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA29_CUT_AMOUNT_CLAIMED() {
		return A29_CUT_AMOUNT_CLAIMED;
	}
	public void setA29_CUT_AMOUNT_CLAIMED(BigDecimal a29_CUT_AMOUNT_CLAIMED) {
		A29_CUT_AMOUNT_CLAIMED = a29_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA29_CUT_AMOUNT_RECOVERED() {
		return A29_CUT_AMOUNT_RECOVERED;
	}
	public void setA29_CUT_AMOUNT_RECOVERED(BigDecimal a29_CUT_AMOUNT_RECOVERED) {
		A29_CUT_AMOUNT_RECOVERED = a29_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA29_CUR_ACTUAL_NET_LOSS() {
		return A29_CUR_ACTUAL_NET_LOSS;
	}
	public void setA29_CUR_ACTUAL_NET_LOSS(BigDecimal a29_CUR_ACTUAL_NET_LOSS) {
		A29_CUR_ACTUAL_NET_LOSS = a29_CUR_ACTUAL_NET_LOSS;
	}
	public String getA30_PRODUCT() {
		return A30_PRODUCT;
	}
	public void setA30_PRODUCT(String a30_PRODUCT) {
		A30_PRODUCT = a30_PRODUCT;
	}
	public BigDecimal getA30_TOTAL_NO_EVENT() {
		return A30_TOTAL_NO_EVENT;
	}
	public void setA30_TOTAL_NO_EVENT(BigDecimal a30_TOTAL_NO_EVENT) {
		A30_TOTAL_NO_EVENT = a30_TOTAL_NO_EVENT;
	}
	public BigDecimal getA30_NO_OF_CUST_EFFECTED() {
		return A30_NO_OF_CUST_EFFECTED;
	}
	public void setA30_NO_OF_CUST_EFFECTED(BigDecimal a30_NO_OF_CUST_EFFECTED) {
		A30_NO_OF_CUST_EFFECTED = a30_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA30_AMOUNT_INVOLVED() {
		return A30_AMOUNT_INVOLVED;
	}
	public void setA30_AMOUNT_INVOLVED(BigDecimal a30_AMOUNT_INVOLVED) {
		A30_AMOUNT_INVOLVED = a30_AMOUNT_INVOLVED;
	}
	public BigDecimal getA30_NO_OF_FUNC_AREAS_INVOLVED() {
		return A30_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA30_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a30_NO_OF_FUNC_AREAS_INVOLVED) {
		A30_NO_OF_FUNC_AREAS_INVOLVED = a30_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA30_AMOUNT_OF_MAX_LOSS() {
		return A30_AMOUNT_OF_MAX_LOSS;
	}
	public void setA30_AMOUNT_OF_MAX_LOSS(BigDecimal a30_AMOUNT_OF_MAX_LOSS) {
		A30_AMOUNT_OF_MAX_LOSS = a30_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA30_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A30_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA30_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a30_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A30_AMOUNT_OF_ACTUAL_GROSS_LOSS = a30_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA30_AMOUNT_RECOVERED() {
		return A30_AMOUNT_RECOVERED;
	}
	public void setA30_AMOUNT_RECOVERED(BigDecimal a30_AMOUNT_RECOVERED) {
		A30_AMOUNT_RECOVERED = a30_AMOUNT_RECOVERED;
	}
	public BigDecimal getA30_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A30_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA30_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a30_AMOUNT_CLAIMED_FROM_INSURERS) {
		A30_AMOUNT_CLAIMED_FROM_INSURERS = a30_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA30_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A30_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA30_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a30_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A30_AMOUNT_RECOVERED_THROUGH_INSURERS = a30_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA30_ACTUAL_NET_LOSS() {
		return A30_ACTUAL_NET_LOSS;
	}
	public void setA30_ACTUAL_NET_LOSS(BigDecimal a30_ACTUAL_NET_LOSS) {
		A30_ACTUAL_NET_LOSS = a30_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA30_TOTAL_NO_OF_NEAR_MISS() {
		return A30_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA30_TOTAL_NO_OF_NEAR_MISS(BigDecimal a30_TOTAL_NO_OF_NEAR_MISS) {
		A30_TOTAL_NO_OF_NEAR_MISS = a30_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA30_NO_OF_SIGNIFICANT_EVENTS() {
		return A30_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA30_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a30_NO_OF_SIGNIFICANT_EVENTS) {
		A30_NO_OF_SIGNIFICANT_EVENTS = a30_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA30_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A30_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA30_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a30_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A30_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a30_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA30_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A30_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA30_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a30_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A30_SIGNIFICANT_EVENT_ACTUAL_LOSS = a30_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA30_PREV_GROSS_LOSS() {
		return A30_PREV_GROSS_LOSS;
	}
	public void setA30_PREV_GROSS_LOSS(BigDecimal a30_PREV_GROSS_LOSS) {
		A30_PREV_GROSS_LOSS = a30_PREV_GROSS_LOSS;
	}
	public BigDecimal getA30_PREV_AMOUNT_RECOVERED() {
		return A30_PREV_AMOUNT_RECOVERED;
	}
	public void setA30_PREV_AMOUNT_RECOVERED(BigDecimal a30_PREV_AMOUNT_RECOVERED) {
		A30_PREV_AMOUNT_RECOVERED = a30_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA30_PREV_AMOUNT_CLAIMED() {
		return A30_PREV_AMOUNT_CLAIMED;
	}
	public void setA30_PREV_AMOUNT_CLAIMED(BigDecimal a30_PREV_AMOUNT_CLAIMED) {
		A30_PREV_AMOUNT_CLAIMED = a30_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA30_PREVT_AMOUNT_RECOVERED() {
		return A30_PREVT_AMOUNT_RECOVERED;
	}
	public void setA30_PREVT_AMOUNT_RECOVERED(BigDecimal a30_PREVT_AMOUNT_RECOVERED) {
		A30_PREVT_AMOUNT_RECOVERED = a30_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA30_PREV_ACTUAL_NET_LOSS() {
		return A30_PREV_ACTUAL_NET_LOSS;
	}
	public void setA30_PREV_ACTUAL_NET_LOSS(BigDecimal a30_PREV_ACTUAL_NET_LOSS) {
		A30_PREV_ACTUAL_NET_LOSS = a30_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA30_CUR_ACTUAL_GROSS_LOSS() {
		return A30_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA30_CUR_ACTUAL_GROSS_LOSS(BigDecimal a30_CUR_ACTUAL_GROSS_LOSS) {
		A30_CUR_ACTUAL_GROSS_LOSS = a30_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA30_CUR_AMOUNT_RECOVERED() {
		return A30_CUR_AMOUNT_RECOVERED;
	}
	public void setA30_CUR_AMOUNT_RECOVERED(BigDecimal a30_CUR_AMOUNT_RECOVERED) {
		A30_CUR_AMOUNT_RECOVERED = a30_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA30_CUT_AMOUNT_CLAIMED() {
		return A30_CUT_AMOUNT_CLAIMED;
	}
	public void setA30_CUT_AMOUNT_CLAIMED(BigDecimal a30_CUT_AMOUNT_CLAIMED) {
		A30_CUT_AMOUNT_CLAIMED = a30_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA30_CUT_AMOUNT_RECOVERED() {
		return A30_CUT_AMOUNT_RECOVERED;
	}
	public void setA30_CUT_AMOUNT_RECOVERED(BigDecimal a30_CUT_AMOUNT_RECOVERED) {
		A30_CUT_AMOUNT_RECOVERED = a30_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA30_CUR_ACTUAL_NET_LOSS() {
		return A30_CUR_ACTUAL_NET_LOSS;
	}
	public void setA30_CUR_ACTUAL_NET_LOSS(BigDecimal a30_CUR_ACTUAL_NET_LOSS) {
		A30_CUR_ACTUAL_NET_LOSS = a30_CUR_ACTUAL_NET_LOSS;
	}
	public String getA31_PRODUCT() {
		return A31_PRODUCT;
	}
	public void setA31_PRODUCT(String a31_PRODUCT) {
		A31_PRODUCT = a31_PRODUCT;
	}
	public String getA32_PRODUCT() {
		return A32_PRODUCT;
	}
	public void setA32_PRODUCT(String a32_PRODUCT) {
		A32_PRODUCT = a32_PRODUCT;
	}
	public BigDecimal getA32_TOTAL_NO_EVENT() {
		return A32_TOTAL_NO_EVENT;
	}
	public void setA32_TOTAL_NO_EVENT(BigDecimal a32_TOTAL_NO_EVENT) {
		A32_TOTAL_NO_EVENT = a32_TOTAL_NO_EVENT;
	}
	public BigDecimal getA32_NO_OF_CUST_EFFECTED() {
		return A32_NO_OF_CUST_EFFECTED;
	}
	public void setA32_NO_OF_CUST_EFFECTED(BigDecimal a32_NO_OF_CUST_EFFECTED) {
		A32_NO_OF_CUST_EFFECTED = a32_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA32_AMOUNT_INVOLVED() {
		return A32_AMOUNT_INVOLVED;
	}
	public void setA32_AMOUNT_INVOLVED(BigDecimal a32_AMOUNT_INVOLVED) {
		A32_AMOUNT_INVOLVED = a32_AMOUNT_INVOLVED;
	}
	public BigDecimal getA32_NO_OF_FUNC_AREAS_INVOLVED() {
		return A32_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA32_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a32_NO_OF_FUNC_AREAS_INVOLVED) {
		A32_NO_OF_FUNC_AREAS_INVOLVED = a32_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA32_AMOUNT_OF_MAX_LOSS() {
		return A32_AMOUNT_OF_MAX_LOSS;
	}
	public void setA32_AMOUNT_OF_MAX_LOSS(BigDecimal a32_AMOUNT_OF_MAX_LOSS) {
		A32_AMOUNT_OF_MAX_LOSS = a32_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA32_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A32_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA32_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a32_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A32_AMOUNT_OF_ACTUAL_GROSS_LOSS = a32_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA32_AMOUNT_RECOVERED() {
		return A32_AMOUNT_RECOVERED;
	}
	public void setA32_AMOUNT_RECOVERED(BigDecimal a32_AMOUNT_RECOVERED) {
		A32_AMOUNT_RECOVERED = a32_AMOUNT_RECOVERED;
	}
	public BigDecimal getA32_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A32_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA32_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a32_AMOUNT_CLAIMED_FROM_INSURERS) {
		A32_AMOUNT_CLAIMED_FROM_INSURERS = a32_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA32_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A32_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA32_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a32_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A32_AMOUNT_RECOVERED_THROUGH_INSURERS = a32_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA32_ACTUAL_NET_LOSS() {
		return A32_ACTUAL_NET_LOSS;
	}
	public void setA32_ACTUAL_NET_LOSS(BigDecimal a32_ACTUAL_NET_LOSS) {
		A32_ACTUAL_NET_LOSS = a32_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA32_TOTAL_NO_OF_NEAR_MISS() {
		return A32_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA32_TOTAL_NO_OF_NEAR_MISS(BigDecimal a32_TOTAL_NO_OF_NEAR_MISS) {
		A32_TOTAL_NO_OF_NEAR_MISS = a32_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA32_NO_OF_SIGNIFICANT_EVENTS() {
		return A32_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA32_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a32_NO_OF_SIGNIFICANT_EVENTS) {
		A32_NO_OF_SIGNIFICANT_EVENTS = a32_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA32_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A32_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA32_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a32_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A32_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a32_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA32_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A32_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA32_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a32_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A32_SIGNIFICANT_EVENT_ACTUAL_LOSS = a32_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA32_PREV_GROSS_LOSS() {
		return A32_PREV_GROSS_LOSS;
	}
	public void setA32_PREV_GROSS_LOSS(BigDecimal a32_PREV_GROSS_LOSS) {
		A32_PREV_GROSS_LOSS = a32_PREV_GROSS_LOSS;
	}
	public BigDecimal getA32_PREV_AMOUNT_RECOVERED() {
		return A32_PREV_AMOUNT_RECOVERED;
	}
	public void setA32_PREV_AMOUNT_RECOVERED(BigDecimal a32_PREV_AMOUNT_RECOVERED) {
		A32_PREV_AMOUNT_RECOVERED = a32_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA32_PREV_AMOUNT_CLAIMED() {
		return A32_PREV_AMOUNT_CLAIMED;
	}
	public void setA32_PREV_AMOUNT_CLAIMED(BigDecimal a32_PREV_AMOUNT_CLAIMED) {
		A32_PREV_AMOUNT_CLAIMED = a32_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA32_PREVT_AMOUNT_RECOVERED() {
		return A32_PREVT_AMOUNT_RECOVERED;
	}
	public void setA32_PREVT_AMOUNT_RECOVERED(BigDecimal a32_PREVT_AMOUNT_RECOVERED) {
		A32_PREVT_AMOUNT_RECOVERED = a32_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA32_PREV_ACTUAL_NET_LOSS() {
		return A32_PREV_ACTUAL_NET_LOSS;
	}
	public void setA32_PREV_ACTUAL_NET_LOSS(BigDecimal a32_PREV_ACTUAL_NET_LOSS) {
		A32_PREV_ACTUAL_NET_LOSS = a32_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA32_CUR_ACTUAL_GROSS_LOSS() {
		return A32_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA32_CUR_ACTUAL_GROSS_LOSS(BigDecimal a32_CUR_ACTUAL_GROSS_LOSS) {
		A32_CUR_ACTUAL_GROSS_LOSS = a32_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA32_CUR_AMOUNT_RECOVERED() {
		return A32_CUR_AMOUNT_RECOVERED;
	}
	public void setA32_CUR_AMOUNT_RECOVERED(BigDecimal a32_CUR_AMOUNT_RECOVERED) {
		A32_CUR_AMOUNT_RECOVERED = a32_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA32_CUT_AMOUNT_CLAIMED() {
		return A32_CUT_AMOUNT_CLAIMED;
	}
	public void setA32_CUT_AMOUNT_CLAIMED(BigDecimal a32_CUT_AMOUNT_CLAIMED) {
		A32_CUT_AMOUNT_CLAIMED = a32_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA32_CUT_AMOUNT_RECOVERED() {
		return A32_CUT_AMOUNT_RECOVERED;
	}
	public void setA32_CUT_AMOUNT_RECOVERED(BigDecimal a32_CUT_AMOUNT_RECOVERED) {
		A32_CUT_AMOUNT_RECOVERED = a32_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA32_CUR_ACTUAL_NET_LOSS() {
		return A32_CUR_ACTUAL_NET_LOSS;
	}
	public void setA32_CUR_ACTUAL_NET_LOSS(BigDecimal a32_CUR_ACTUAL_NET_LOSS) {
		A32_CUR_ACTUAL_NET_LOSS = a32_CUR_ACTUAL_NET_LOSS;
	}
	public String getA33_PRODUCT() {
		return A33_PRODUCT;
	}
	public void setA33_PRODUCT(String a33_PRODUCT) {
		A33_PRODUCT = a33_PRODUCT;
	}
	public BigDecimal getA33_TOTAL_NO_EVENT() {
		return A33_TOTAL_NO_EVENT;
	}
	public void setA33_TOTAL_NO_EVENT(BigDecimal a33_TOTAL_NO_EVENT) {
		A33_TOTAL_NO_EVENT = a33_TOTAL_NO_EVENT;
	}
	public BigDecimal getA33_NO_OF_CUST_EFFECTED() {
		return A33_NO_OF_CUST_EFFECTED;
	}
	public void setA33_NO_OF_CUST_EFFECTED(BigDecimal a33_NO_OF_CUST_EFFECTED) {
		A33_NO_OF_CUST_EFFECTED = a33_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA33_AMOUNT_INVOLVED() {
		return A33_AMOUNT_INVOLVED;
	}
	public void setA33_AMOUNT_INVOLVED(BigDecimal a33_AMOUNT_INVOLVED) {
		A33_AMOUNT_INVOLVED = a33_AMOUNT_INVOLVED;
	}
	public BigDecimal getA33_NO_OF_FUNC_AREAS_INVOLVED() {
		return A33_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA33_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a33_NO_OF_FUNC_AREAS_INVOLVED) {
		A33_NO_OF_FUNC_AREAS_INVOLVED = a33_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA33_AMOUNT_OF_MAX_LOSS() {
		return A33_AMOUNT_OF_MAX_LOSS;
	}
	public void setA33_AMOUNT_OF_MAX_LOSS(BigDecimal a33_AMOUNT_OF_MAX_LOSS) {
		A33_AMOUNT_OF_MAX_LOSS = a33_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA33_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A33_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA33_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a33_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A33_AMOUNT_OF_ACTUAL_GROSS_LOSS = a33_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA33_AMOUNT_RECOVERED() {
		return A33_AMOUNT_RECOVERED;
	}
	public void setA33_AMOUNT_RECOVERED(BigDecimal a33_AMOUNT_RECOVERED) {
		A33_AMOUNT_RECOVERED = a33_AMOUNT_RECOVERED;
	}
	public BigDecimal getA33_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A33_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA33_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a33_AMOUNT_CLAIMED_FROM_INSURERS) {
		A33_AMOUNT_CLAIMED_FROM_INSURERS = a33_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA33_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A33_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA33_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a33_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A33_AMOUNT_RECOVERED_THROUGH_INSURERS = a33_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA33_ACTUAL_NET_LOSS() {
		return A33_ACTUAL_NET_LOSS;
	}
	public void setA33_ACTUAL_NET_LOSS(BigDecimal a33_ACTUAL_NET_LOSS) {
		A33_ACTUAL_NET_LOSS = a33_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA33_TOTAL_NO_OF_NEAR_MISS() {
		return A33_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA33_TOTAL_NO_OF_NEAR_MISS(BigDecimal a33_TOTAL_NO_OF_NEAR_MISS) {
		A33_TOTAL_NO_OF_NEAR_MISS = a33_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA33_NO_OF_SIGNIFICANT_EVENTS() {
		return A33_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA33_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a33_NO_OF_SIGNIFICANT_EVENTS) {
		A33_NO_OF_SIGNIFICANT_EVENTS = a33_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA33_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A33_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA33_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a33_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A33_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a33_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA33_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A33_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA33_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a33_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A33_SIGNIFICANT_EVENT_ACTUAL_LOSS = a33_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA33_PREV_GROSS_LOSS() {
		return A33_PREV_GROSS_LOSS;
	}
	public void setA33_PREV_GROSS_LOSS(BigDecimal a33_PREV_GROSS_LOSS) {
		A33_PREV_GROSS_LOSS = a33_PREV_GROSS_LOSS;
	}
	public BigDecimal getA33_PREV_AMOUNT_RECOVERED() {
		return A33_PREV_AMOUNT_RECOVERED;
	}
	public void setA33_PREV_AMOUNT_RECOVERED(BigDecimal a33_PREV_AMOUNT_RECOVERED) {
		A33_PREV_AMOUNT_RECOVERED = a33_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA33_PREV_AMOUNT_CLAIMED() {
		return A33_PREV_AMOUNT_CLAIMED;
	}
	public void setA33_PREV_AMOUNT_CLAIMED(BigDecimal a33_PREV_AMOUNT_CLAIMED) {
		A33_PREV_AMOUNT_CLAIMED = a33_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA33_PREVT_AMOUNT_RECOVERED() {
		return A33_PREVT_AMOUNT_RECOVERED;
	}
	public void setA33_PREVT_AMOUNT_RECOVERED(BigDecimal a33_PREVT_AMOUNT_RECOVERED) {
		A33_PREVT_AMOUNT_RECOVERED = a33_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA33_PREV_ACTUAL_NET_LOSS() {
		return A33_PREV_ACTUAL_NET_LOSS;
	}
	public void setA33_PREV_ACTUAL_NET_LOSS(BigDecimal a33_PREV_ACTUAL_NET_LOSS) {
		A33_PREV_ACTUAL_NET_LOSS = a33_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA33_CUR_ACTUAL_GROSS_LOSS() {
		return A33_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA33_CUR_ACTUAL_GROSS_LOSS(BigDecimal a33_CUR_ACTUAL_GROSS_LOSS) {
		A33_CUR_ACTUAL_GROSS_LOSS = a33_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA33_CUR_AMOUNT_RECOVERED() {
		return A33_CUR_AMOUNT_RECOVERED;
	}
	public void setA33_CUR_AMOUNT_RECOVERED(BigDecimal a33_CUR_AMOUNT_RECOVERED) {
		A33_CUR_AMOUNT_RECOVERED = a33_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA33_CUT_AMOUNT_CLAIMED() {
		return A33_CUT_AMOUNT_CLAIMED;
	}
	public void setA33_CUT_AMOUNT_CLAIMED(BigDecimal a33_CUT_AMOUNT_CLAIMED) {
		A33_CUT_AMOUNT_CLAIMED = a33_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA33_CUT_AMOUNT_RECOVERED() {
		return A33_CUT_AMOUNT_RECOVERED;
	}
	public void setA33_CUT_AMOUNT_RECOVERED(BigDecimal a33_CUT_AMOUNT_RECOVERED) {
		A33_CUT_AMOUNT_RECOVERED = a33_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA33_CUR_ACTUAL_NET_LOSS() {
		return A33_CUR_ACTUAL_NET_LOSS;
	}
	public void setA33_CUR_ACTUAL_NET_LOSS(BigDecimal a33_CUR_ACTUAL_NET_LOSS) {
		A33_CUR_ACTUAL_NET_LOSS = a33_CUR_ACTUAL_NET_LOSS;
	}
	public String getA34_PRODUCT() {
		return A34_PRODUCT;
	}
	public void setA34_PRODUCT(String a34_PRODUCT) {
		A34_PRODUCT = a34_PRODUCT;
	}
	public BigDecimal getA34_TOTAL_NO_EVENT() {
		return A34_TOTAL_NO_EVENT;
	}
	public void setA34_TOTAL_NO_EVENT(BigDecimal a34_TOTAL_NO_EVENT) {
		A34_TOTAL_NO_EVENT = a34_TOTAL_NO_EVENT;
	}
	public BigDecimal getA34_NO_OF_CUST_EFFECTED() {
		return A34_NO_OF_CUST_EFFECTED;
	}
	public void setA34_NO_OF_CUST_EFFECTED(BigDecimal a34_NO_OF_CUST_EFFECTED) {
		A34_NO_OF_CUST_EFFECTED = a34_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA34_AMOUNT_INVOLVED() {
		return A34_AMOUNT_INVOLVED;
	}
	public void setA34_AMOUNT_INVOLVED(BigDecimal a34_AMOUNT_INVOLVED) {
		A34_AMOUNT_INVOLVED = a34_AMOUNT_INVOLVED;
	}
	public BigDecimal getA34_NO_OF_FUNC_AREAS_INVOLVED() {
		return A34_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA34_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a34_NO_OF_FUNC_AREAS_INVOLVED) {
		A34_NO_OF_FUNC_AREAS_INVOLVED = a34_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA34_AMOUNT_OF_MAX_LOSS() {
		return A34_AMOUNT_OF_MAX_LOSS;
	}
	public void setA34_AMOUNT_OF_MAX_LOSS(BigDecimal a34_AMOUNT_OF_MAX_LOSS) {
		A34_AMOUNT_OF_MAX_LOSS = a34_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA34_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A34_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA34_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a34_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A34_AMOUNT_OF_ACTUAL_GROSS_LOSS = a34_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA34_AMOUNT_RECOVERED() {
		return A34_AMOUNT_RECOVERED;
	}
	public void setA34_AMOUNT_RECOVERED(BigDecimal a34_AMOUNT_RECOVERED) {
		A34_AMOUNT_RECOVERED = a34_AMOUNT_RECOVERED;
	}
	public BigDecimal getA34_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A34_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA34_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a34_AMOUNT_CLAIMED_FROM_INSURERS) {
		A34_AMOUNT_CLAIMED_FROM_INSURERS = a34_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA34_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A34_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA34_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a34_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A34_AMOUNT_RECOVERED_THROUGH_INSURERS = a34_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA34_ACTUAL_NET_LOSS() {
		return A34_ACTUAL_NET_LOSS;
	}
	public void setA34_ACTUAL_NET_LOSS(BigDecimal a34_ACTUAL_NET_LOSS) {
		A34_ACTUAL_NET_LOSS = a34_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA34_TOTAL_NO_OF_NEAR_MISS() {
		return A34_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA34_TOTAL_NO_OF_NEAR_MISS(BigDecimal a34_TOTAL_NO_OF_NEAR_MISS) {
		A34_TOTAL_NO_OF_NEAR_MISS = a34_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA34_NO_OF_SIGNIFICANT_EVENTS() {
		return A34_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA34_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a34_NO_OF_SIGNIFICANT_EVENTS) {
		A34_NO_OF_SIGNIFICANT_EVENTS = a34_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA34_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A34_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA34_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a34_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A34_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a34_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA34_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A34_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA34_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a34_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A34_SIGNIFICANT_EVENT_ACTUAL_LOSS = a34_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA34_PREV_GROSS_LOSS() {
		return A34_PREV_GROSS_LOSS;
	}
	public void setA34_PREV_GROSS_LOSS(BigDecimal a34_PREV_GROSS_LOSS) {
		A34_PREV_GROSS_LOSS = a34_PREV_GROSS_LOSS;
	}
	public BigDecimal getA34_PREV_AMOUNT_RECOVERED() {
		return A34_PREV_AMOUNT_RECOVERED;
	}
	public void setA34_PREV_AMOUNT_RECOVERED(BigDecimal a34_PREV_AMOUNT_RECOVERED) {
		A34_PREV_AMOUNT_RECOVERED = a34_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA34_PREV_AMOUNT_CLAIMED() {
		return A34_PREV_AMOUNT_CLAIMED;
	}
	public void setA34_PREV_AMOUNT_CLAIMED(BigDecimal a34_PREV_AMOUNT_CLAIMED) {
		A34_PREV_AMOUNT_CLAIMED = a34_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA34_PREVT_AMOUNT_RECOVERED() {
		return A34_PREVT_AMOUNT_RECOVERED;
	}
	public void setA34_PREVT_AMOUNT_RECOVERED(BigDecimal a34_PREVT_AMOUNT_RECOVERED) {
		A34_PREVT_AMOUNT_RECOVERED = a34_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA34_PREV_ACTUAL_NET_LOSS() {
		return A34_PREV_ACTUAL_NET_LOSS;
	}
	public void setA34_PREV_ACTUAL_NET_LOSS(BigDecimal a34_PREV_ACTUAL_NET_LOSS) {
		A34_PREV_ACTUAL_NET_LOSS = a34_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA34_CUR_ACTUAL_GROSS_LOSS() {
		return A34_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA34_CUR_ACTUAL_GROSS_LOSS(BigDecimal a34_CUR_ACTUAL_GROSS_LOSS) {
		A34_CUR_ACTUAL_GROSS_LOSS = a34_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA34_CUR_AMOUNT_RECOVERED() {
		return A34_CUR_AMOUNT_RECOVERED;
	}
	public void setA34_CUR_AMOUNT_RECOVERED(BigDecimal a34_CUR_AMOUNT_RECOVERED) {
		A34_CUR_AMOUNT_RECOVERED = a34_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA34_CUT_AMOUNT_CLAIMED() {
		return A34_CUT_AMOUNT_CLAIMED;
	}
	public void setA34_CUT_AMOUNT_CLAIMED(BigDecimal a34_CUT_AMOUNT_CLAIMED) {
		A34_CUT_AMOUNT_CLAIMED = a34_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA34_CUT_AMOUNT_RECOVERED() {
		return A34_CUT_AMOUNT_RECOVERED;
	}
	public void setA34_CUT_AMOUNT_RECOVERED(BigDecimal a34_CUT_AMOUNT_RECOVERED) {
		A34_CUT_AMOUNT_RECOVERED = a34_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA34_CUR_ACTUAL_NET_LOSS() {
		return A34_CUR_ACTUAL_NET_LOSS;
	}
	public void setA34_CUR_ACTUAL_NET_LOSS(BigDecimal a34_CUR_ACTUAL_NET_LOSS) {
		A34_CUR_ACTUAL_NET_LOSS = a34_CUR_ACTUAL_NET_LOSS;
	}
	public String getA35_PRODUCT() {
		return A35_PRODUCT;
	}
	public void setA35_PRODUCT(String a35_PRODUCT) {
		A35_PRODUCT = a35_PRODUCT;
	}
	public BigDecimal getA35_TOTAL_NO_EVENT() {
		return A35_TOTAL_NO_EVENT;
	}
	public void setA35_TOTAL_NO_EVENT(BigDecimal a35_TOTAL_NO_EVENT) {
		A35_TOTAL_NO_EVENT = a35_TOTAL_NO_EVENT;
	}
	public BigDecimal getA35_NO_OF_CUST_EFFECTED() {
		return A35_NO_OF_CUST_EFFECTED;
	}
	public void setA35_NO_OF_CUST_EFFECTED(BigDecimal a35_NO_OF_CUST_EFFECTED) {
		A35_NO_OF_CUST_EFFECTED = a35_NO_OF_CUST_EFFECTED;
	}
	public BigDecimal getA35_AMOUNT_INVOLVED() {
		return A35_AMOUNT_INVOLVED;
	}
	public void setA35_AMOUNT_INVOLVED(BigDecimal a35_AMOUNT_INVOLVED) {
		A35_AMOUNT_INVOLVED = a35_AMOUNT_INVOLVED;
	}
	public BigDecimal getA35_NO_OF_FUNC_AREAS_INVOLVED() {
		return A35_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public void setA35_NO_OF_FUNC_AREAS_INVOLVED(BigDecimal a35_NO_OF_FUNC_AREAS_INVOLVED) {
		A35_NO_OF_FUNC_AREAS_INVOLVED = a35_NO_OF_FUNC_AREAS_INVOLVED;
	}
	public BigDecimal getA35_AMOUNT_OF_MAX_LOSS() {
		return A35_AMOUNT_OF_MAX_LOSS;
	}
	public void setA35_AMOUNT_OF_MAX_LOSS(BigDecimal a35_AMOUNT_OF_MAX_LOSS) {
		A35_AMOUNT_OF_MAX_LOSS = a35_AMOUNT_OF_MAX_LOSS;
	}
	public BigDecimal getA35_AMOUNT_OF_ACTUAL_GROSS_LOSS() {
		return A35_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public void setA35_AMOUNT_OF_ACTUAL_GROSS_LOSS(BigDecimal a35_AMOUNT_OF_ACTUAL_GROSS_LOSS) {
		A35_AMOUNT_OF_ACTUAL_GROSS_LOSS = a35_AMOUNT_OF_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA35_AMOUNT_RECOVERED() {
		return A35_AMOUNT_RECOVERED;
	}
	public void setA35_AMOUNT_RECOVERED(BigDecimal a35_AMOUNT_RECOVERED) {
		A35_AMOUNT_RECOVERED = a35_AMOUNT_RECOVERED;
	}
	public BigDecimal getA35_AMOUNT_CLAIMED_FROM_INSURERS() {
		return A35_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public void setA35_AMOUNT_CLAIMED_FROM_INSURERS(BigDecimal a35_AMOUNT_CLAIMED_FROM_INSURERS) {
		A35_AMOUNT_CLAIMED_FROM_INSURERS = a35_AMOUNT_CLAIMED_FROM_INSURERS;
	}
	public BigDecimal getA35_AMOUNT_RECOVERED_THROUGH_INSURERS() {
		return A35_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public void setA35_AMOUNT_RECOVERED_THROUGH_INSURERS(BigDecimal a35_AMOUNT_RECOVERED_THROUGH_INSURERS) {
		A35_AMOUNT_RECOVERED_THROUGH_INSURERS = a35_AMOUNT_RECOVERED_THROUGH_INSURERS;
	}
	public BigDecimal getA35_ACTUAL_NET_LOSS() {
		return A35_ACTUAL_NET_LOSS;
	}
	public void setA35_ACTUAL_NET_LOSS(BigDecimal a35_ACTUAL_NET_LOSS) {
		A35_ACTUAL_NET_LOSS = a35_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA35_TOTAL_NO_OF_NEAR_MISS() {
		return A35_TOTAL_NO_OF_NEAR_MISS;
	}
	public void setA35_TOTAL_NO_OF_NEAR_MISS(BigDecimal a35_TOTAL_NO_OF_NEAR_MISS) {
		A35_TOTAL_NO_OF_NEAR_MISS = a35_TOTAL_NO_OF_NEAR_MISS;
	}
	public BigDecimal getA35_NO_OF_SIGNIFICANT_EVENTS() {
		return A35_NO_OF_SIGNIFICANT_EVENTS;
	}
	public void setA35_NO_OF_SIGNIFICANT_EVENTS(BigDecimal a35_NO_OF_SIGNIFICANT_EVENTS) {
		A35_NO_OF_SIGNIFICANT_EVENTS = a35_NO_OF_SIGNIFICANT_EVENTS;
	}
	public BigDecimal getA35_SIGNIFICANT_EVENT_POTENTIAL_LOSS() {
		return A35_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public void setA35_SIGNIFICANT_EVENT_POTENTIAL_LOSS(BigDecimal a35_SIGNIFICANT_EVENT_POTENTIAL_LOSS) {
		A35_SIGNIFICANT_EVENT_POTENTIAL_LOSS = a35_SIGNIFICANT_EVENT_POTENTIAL_LOSS;
	}
	public BigDecimal getA35_SIGNIFICANT_EVENT_ACTUAL_LOSS() {
		return A35_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public void setA35_SIGNIFICANT_EVENT_ACTUAL_LOSS(BigDecimal a35_SIGNIFICANT_EVENT_ACTUAL_LOSS) {
		A35_SIGNIFICANT_EVENT_ACTUAL_LOSS = a35_SIGNIFICANT_EVENT_ACTUAL_LOSS;
	}
	public BigDecimal getA35_PREV_GROSS_LOSS() {
		return A35_PREV_GROSS_LOSS;
	}
	public void setA35_PREV_GROSS_LOSS(BigDecimal a35_PREV_GROSS_LOSS) {
		A35_PREV_GROSS_LOSS = a35_PREV_GROSS_LOSS;
	}
	public BigDecimal getA35_PREV_AMOUNT_RECOVERED() {
		return A35_PREV_AMOUNT_RECOVERED;
	}
	public void setA35_PREV_AMOUNT_RECOVERED(BigDecimal a35_PREV_AMOUNT_RECOVERED) {
		A35_PREV_AMOUNT_RECOVERED = a35_PREV_AMOUNT_RECOVERED;
	}
	public BigDecimal getA35_PREV_AMOUNT_CLAIMED() {
		return A35_PREV_AMOUNT_CLAIMED;
	}
	public void setA35_PREV_AMOUNT_CLAIMED(BigDecimal a35_PREV_AMOUNT_CLAIMED) {
		A35_PREV_AMOUNT_CLAIMED = a35_PREV_AMOUNT_CLAIMED;
	}
	public BigDecimal getA35_PREVT_AMOUNT_RECOVERED() {
		return A35_PREVT_AMOUNT_RECOVERED;
	}
	public void setA35_PREVT_AMOUNT_RECOVERED(BigDecimal a35_PREVT_AMOUNT_RECOVERED) {
		A35_PREVT_AMOUNT_RECOVERED = a35_PREVT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA35_PREV_ACTUAL_NET_LOSS() {
		return A35_PREV_ACTUAL_NET_LOSS;
	}
	public void setA35_PREV_ACTUAL_NET_LOSS(BigDecimal a35_PREV_ACTUAL_NET_LOSS) {
		A35_PREV_ACTUAL_NET_LOSS = a35_PREV_ACTUAL_NET_LOSS;
	}
	public BigDecimal getA35_CUR_ACTUAL_GROSS_LOSS() {
		return A35_CUR_ACTUAL_GROSS_LOSS;
	}
	public void setA35_CUR_ACTUAL_GROSS_LOSS(BigDecimal a35_CUR_ACTUAL_GROSS_LOSS) {
		A35_CUR_ACTUAL_GROSS_LOSS = a35_CUR_ACTUAL_GROSS_LOSS;
	}
	public BigDecimal getA35_CUR_AMOUNT_RECOVERED() {
		return A35_CUR_AMOUNT_RECOVERED;
	}
	public void setA35_CUR_AMOUNT_RECOVERED(BigDecimal a35_CUR_AMOUNT_RECOVERED) {
		A35_CUR_AMOUNT_RECOVERED = a35_CUR_AMOUNT_RECOVERED;
	}
	public BigDecimal getA35_CUT_AMOUNT_CLAIMED() {
		return A35_CUT_AMOUNT_CLAIMED;
	}
	public void setA35_CUT_AMOUNT_CLAIMED(BigDecimal a35_CUT_AMOUNT_CLAIMED) {
		A35_CUT_AMOUNT_CLAIMED = a35_CUT_AMOUNT_CLAIMED;
	}
	public BigDecimal getA35_CUT_AMOUNT_RECOVERED() {
		return A35_CUT_AMOUNT_RECOVERED;
	}
	public void setA35_CUT_AMOUNT_RECOVERED(BigDecimal a35_CUT_AMOUNT_RECOVERED) {
		A35_CUT_AMOUNT_RECOVERED = a35_CUT_AMOUNT_RECOVERED;
	}
	public BigDecimal getA35_CUR_ACTUAL_NET_LOSS() {
		return A35_CUR_ACTUAL_NET_LOSS;
	}
	public void setA35_CUR_ACTUAL_NET_LOSS(BigDecimal a35_CUR_ACTUAL_NET_LOSS) {
		A35_CUR_ACTUAL_NET_LOSS = a35_CUR_ACTUAL_NET_LOSS;
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
	
	public T10ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
