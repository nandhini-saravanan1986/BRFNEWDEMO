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
@Table(name="T1C_OR_EMPLOYEE_PROFILE_AND_SKILL_TABLE")
public class T1CORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_KEY_NON_SKILLED;
	private BigDecimal	A1_KEY_NON_UNSKILLED;
	private BigDecimal	A1_KEY_NON_TOTAL;
	private BigDecimal	A1_OTH_NON_SKILLED;
	private BigDecimal	A1_OTH_NON_UNSKILLED;
	private BigDecimal	A1_OTH_NON_TOTAL;
	private BigDecimal	A1_TOTAL_NON_SKILLED;
	private BigDecimal	A1_TOTAL_NON_UNSKILLED;
	private BigDecimal	A1_TOTAL_NON_TOTAL;
	private BigDecimal	A1_KEY_SKILLED;
	private BigDecimal	A1_KEY_UNSKILLED;
	private BigDecimal	A1_KEY_TOTAL;
	private BigDecimal	A1_OTH_SKILLED;
	private BigDecimal	A1_OTH_UNSKILLED;
	private BigDecimal	A1_OTH_TOTAL;
	private BigDecimal	A1_TOTAL_SKILLED;
	private BigDecimal	A1_TOTAL_UNSKILLED;
	private BigDecimal	A1_TOTAL_TOTAL;
	private BigDecimal	A1_TOTAL_ALL_SKILLED;
	private BigDecimal	A1_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A1_TOTAL_ALL_TOTAL;
	private String	A2_PRODUCT;
	private BigDecimal	A2_KEY_NON_SKILLED;
	private BigDecimal	A2_KEY_NON_UNSKILLED;
	private BigDecimal	A2_KEY_NON_TOTAL;
	private BigDecimal	A2_OTH_NON_SKILLED;
	private BigDecimal	A2_OTH_NON_UNSKILLED;
	private BigDecimal	A2_OTH_NON_TOTAL;
	private BigDecimal	A2_TOTAL_NON_SKILLED;
	private BigDecimal	A2_TOTAL_NON_UNSKILLED;
	private BigDecimal	A2_TOTAL_NON_TOTAL;
	private BigDecimal	A2_KEY_SKILLED;
	private BigDecimal	A2_KEY_UNSKILLED;
	private BigDecimal	A2_KEY_TOTAL;
	private BigDecimal	A2_OTH_SKILLED;
	private BigDecimal	A2_OTH_UNSKILLED;
	private BigDecimal	A2_OTH_TOTAL;
	private BigDecimal	A2_TOTAL_SKILLED;
	private BigDecimal	A2_TOTAL_UNSKILLED;
	private BigDecimal	A2_TOTAL_TOTAL;
	private BigDecimal	A2_TOTAL_ALL_SKILLED;
	private BigDecimal	A2_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A2_TOTAL_ALL_TOTAL;
	private String	A3_PRODUCT;
	private BigDecimal	A3_KEY_NON_SKILLED;
	private BigDecimal	A3_KEY_NON_UNSKILLED;
	private BigDecimal	A3_KEY_NON_TOTAL;
	private BigDecimal	A3_OTH_NON_SKILLED;
	private BigDecimal	A3_OTH_NON_UNSKILLED;
	private BigDecimal	A3_OTH_NON_TOTAL;
	private BigDecimal	A3_TOTAL_NON_SKILLED;
	private BigDecimal	A3_TOTAL_NON_UNSKILLED;
	private BigDecimal	A3_TOTAL_NON_TOTAL;
	private BigDecimal	A3_KEY_SKILLED;
	private BigDecimal	A3_KEY_UNSKILLED;
	private BigDecimal	A3_KEY_TOTAL;
	private BigDecimal	A3_OTH_SKILLED;
	private BigDecimal	A3_OTH_UNSKILLED;
	private BigDecimal	A3_OTH_TOTAL;
	private BigDecimal	A3_TOTAL_SKILLED;
	private BigDecimal	A3_TOTAL_UNSKILLED;
	private BigDecimal	A3_TOTAL_TOTAL;
	private BigDecimal	A3_TOTAL_ALL_SKILLED;
	private BigDecimal	A3_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A3_TOTAL_ALL_TOTAL;
	private String	A4_PRODUCT;
	private BigDecimal	A4_KEY_NON_SKILLED;
	private BigDecimal	A4_KEY_NON_UNSKILLED;
	private BigDecimal	A4_KEY_NON_TOTAL;
	private BigDecimal	A4_OTH_NON_SKILLED;
	private BigDecimal	A4_OTH_NON_UNSKILLED;
	private BigDecimal	A4_OTH_NON_TOTAL;
	private BigDecimal	A4_TOTAL_NON_SKILLED;
	private BigDecimal	A4_TOTAL_NON_UNSKILLED;
	private BigDecimal	A4_TOTAL_NON_TOTAL;
	private BigDecimal	A4_KEY_SKILLED;
	private BigDecimal	A4_KEY_UNSKILLED;
	private BigDecimal	A4_KEY_TOTAL;
	private BigDecimal	A4_OTH_SKILLED;
	private BigDecimal	A4_OTH_UNSKILLED;
	private BigDecimal	A4_OTH_TOTAL;
	private BigDecimal	A4_TOTAL_SKILLED;
	private BigDecimal	A4_TOTAL_UNSKILLED;
	private BigDecimal	A4_TOTAL_TOTAL;
	private BigDecimal	A4_TOTAL_ALL_SKILLED;
	private BigDecimal	A4_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A4_TOTAL_ALL_TOTAL;
	private String	A5_PRODUCT;
	private BigDecimal	A5_KEY_NON_SKILLED;
	private BigDecimal	A5_KEY_NON_UNSKILLED;
	private BigDecimal	A5_KEY_NON_TOTAL;
	private BigDecimal	A5_OTH_NON_SKILLED;
	private BigDecimal	A5_OTH_NON_UNSKILLED;
	private BigDecimal	A5_OTH_NON_TOTAL;
	private BigDecimal	A5_TOTAL_NON_SKILLED;
	private BigDecimal	A5_TOTAL_NON_UNSKILLED;
	private BigDecimal	A5_TOTAL_NON_TOTAL;
	private BigDecimal	A5_KEY_SKILLED;
	private BigDecimal	A5_KEY_UNSKILLED;
	private BigDecimal	A5_KEY_TOTAL;
	private BigDecimal	A5_OTH_SKILLED;
	private BigDecimal	A5_OTH_UNSKILLED;
	private BigDecimal	A5_OTH_TOTAL;
	private BigDecimal	A5_TOTAL_SKILLED;
	private BigDecimal	A5_TOTAL_UNSKILLED;
	private BigDecimal	A5_TOTAL_TOTAL;
	private BigDecimal	A5_TOTAL_ALL_SKILLED;
	private BigDecimal	A5_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A5_TOTAL_ALL_TOTAL;
	private String	A6_PRODUCT;
	private BigDecimal	A6_KEY_NON_SKILLED;
	private BigDecimal	A6_KEY_NON_UNSKILLED;
	private BigDecimal	A6_KEY_NON_TOTAL;
	private BigDecimal	A6_OTH_NON_SKILLED;
	private BigDecimal	A6_OTH_NON_UNSKILLED;
	private BigDecimal	A6_OTH_NON_TOTAL;
	private BigDecimal	A6_TOTAL_NON_SKILLED;
	private BigDecimal	A6_TOTAL_NON_UNSKILLED;
	private BigDecimal	A6_TOTAL_NON_TOTAL;
	private BigDecimal	A6_KEY_SKILLED;
	private BigDecimal	A6_KEY_UNSKILLED;
	private BigDecimal	A6_KEY_TOTAL;
	private BigDecimal	A6_OTH_SKILLED;
	private BigDecimal	A6_OTH_UNSKILLED;
	private BigDecimal	A6_OTH_TOTAL;
	private BigDecimal	A6_TOTAL_SKILLED;
	private BigDecimal	A6_TOTAL_UNSKILLED;
	private BigDecimal	A6_TOTAL_TOTAL;
	private BigDecimal	A6_TOTAL_ALL_SKILLED;
	private BigDecimal	A6_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A6_TOTAL_ALL_TOTAL;
	private String	A7_PRODUCT;
	private BigDecimal	A7_KEY_NON_SKILLED;
	private BigDecimal	A7_KEY_NON_UNSKILLED;
	private BigDecimal	A7_KEY_NON_TOTAL;
	private BigDecimal	A7_OTH_NON_SKILLED;
	private BigDecimal	A7_OTH_NON_UNSKILLED;
	private BigDecimal	A7_OTH_NON_TOTAL;
	private BigDecimal	A7_TOTAL_NON_SKILLED;
	private BigDecimal	A7_TOTAL_NON_UNSKILLED;
	private BigDecimal	A7_TOTAL_NON_TOTAL;
	private BigDecimal	A7_KEY_SKILLED;
	private BigDecimal	A7_KEY_UNSKILLED;
	private BigDecimal	A7_KEY_TOTAL;
	private BigDecimal	A7_OTH_SKILLED;
	private BigDecimal	A7_OTH_UNSKILLED;
	private BigDecimal	A7_OTH_TOTAL;
	private BigDecimal	A7_TOTAL_SKILLED;
	private BigDecimal	A7_TOTAL_UNSKILLED;
	private BigDecimal	A7_TOTAL_TOTAL;
	private BigDecimal	A7_TOTAL_ALL_SKILLED;
	private BigDecimal	A7_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A7_TOTAL_ALL_TOTAL;
	private String	A8_PRODUCT;
	private BigDecimal	A8_KEY_NON_SKILLED;
	private BigDecimal	A8_KEY_NON_UNSKILLED;
	private BigDecimal	A8_KEY_NON_TOTAL;
	private BigDecimal	A8_OTH_NON_SKILLED;
	private BigDecimal	A8_OTH_NON_UNSKILLED;
	private BigDecimal	A8_OTH_NON_TOTAL;
	private BigDecimal	A8_TOTAL_NON_SKILLED;
	private BigDecimal	A8_TOTAL_NON_UNSKILLED;
	private BigDecimal	A8_TOTAL_NON_TOTAL;
	private BigDecimal	A8_KEY_SKILLED;
	private BigDecimal	A8_KEY_UNSKILLED;
	private BigDecimal	A8_KEY_TOTAL;
	private BigDecimal	A8_OTH_SKILLED;
	private BigDecimal	A8_OTH_UNSKILLED;
	private BigDecimal	A8_OTH_TOTAL;
	private BigDecimal	A8_TOTAL_SKILLED;
	private BigDecimal	A8_TOTAL_UNSKILLED;
	private BigDecimal	A8_TOTAL_TOTAL;
	private BigDecimal	A8_TOTAL_ALL_SKILLED;
	private BigDecimal	A8_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A8_TOTAL_ALL_TOTAL;
	private String	A9_PRODUCT;
	private BigDecimal	A9_KEY_NON_SKILLED;
	private BigDecimal	A9_KEY_NON_UNSKILLED;
	private BigDecimal	A9_KEY_NON_TOTAL;
	private BigDecimal	A9_OTH_NON_SKILLED;
	private BigDecimal	A9_OTH_NON_UNSKILLED;
	private BigDecimal	A9_OTH_NON_TOTAL;
	private BigDecimal	A9_TOTAL_NON_SKILLED;
	private BigDecimal	A9_TOTAL_NON_UNSKILLED;
	private BigDecimal	A9_TOTAL_NON_TOTAL;
	private BigDecimal	A9_KEY_SKILLED;
	private BigDecimal	A9_KEY_UNSKILLED;
	private BigDecimal	A9_KEY_TOTAL;
	private BigDecimal	A9_OTH_SKILLED;
	private BigDecimal	A9_OTH_UNSKILLED;
	private BigDecimal	A9_OTH_TOTAL;
	private BigDecimal	A9_TOTAL_SKILLED;
	private BigDecimal	A9_TOTAL_UNSKILLED;
	private BigDecimal	A9_TOTAL_TOTAL;
	private BigDecimal	A9_TOTAL_ALL_SKILLED;
	private BigDecimal	A9_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A9_TOTAL_ALL_TOTAL;
	private String	A10_PRODUCT;
	private BigDecimal	A10_KEY_NON_SKILLED;
	private BigDecimal	A10_KEY_NON_UNSKILLED;
	private BigDecimal	A10_KEY_NON_TOTAL;
	private BigDecimal	A10_OTH_NON_SKILLED;
	private BigDecimal	A10_OTH_NON_UNSKILLED;
	private BigDecimal	A10_OTH_NON_TOTAL;
	private BigDecimal	A10_TOTAL_NON_SKILLED;
	private BigDecimal	A10_TOTAL_NON_UNSKILLED;
	private BigDecimal	A10_TOTAL_NON_TOTAL;
	private BigDecimal	A10_KEY_SKILLED;
	private BigDecimal	A10_KEY_UNSKILLED;
	private BigDecimal	A10_KEY_TOTAL;
	private BigDecimal	A10_OTH_SKILLED;
	private BigDecimal	A10_OTH_UNSKILLED;
	private BigDecimal	A10_OTH_TOTAL;
	private BigDecimal	A10_TOTAL_SKILLED;
	private BigDecimal	A10_TOTAL_UNSKILLED;
	private BigDecimal	A10_TOTAL_TOTAL;
	private BigDecimal	A10_TOTAL_ALL_SKILLED;
	private BigDecimal	A10_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A10_TOTAL_ALL_TOTAL;
	private String	A11_PRODUCT;
	private BigDecimal	A11_KEY_NON_SKILLED;
	private BigDecimal	A11_KEY_NON_UNSKILLED;
	private BigDecimal	A11_KEY_NON_TOTAL;
	private BigDecimal	A11_OTH_NON_SKILLED;
	private BigDecimal	A11_OTH_NON_UNSKILLED;
	private BigDecimal	A11_OTH_NON_TOTAL;
	private BigDecimal	A11_TOTAL_NON_SKILLED;
	private BigDecimal	A11_TOTAL_NON_UNSKILLED;
	private BigDecimal	A11_TOTAL_NON_TOTAL;
	private BigDecimal	A11_KEY_SKILLED;
	private BigDecimal	A11_KEY_UNSKILLED;
	private BigDecimal	A11_KEY_TOTAL;
	private BigDecimal	A11_OTH_SKILLED;
	private BigDecimal	A11_OTH_UNSKILLED;
	private BigDecimal	A11_OTH_TOTAL;
	private BigDecimal	A11_TOTAL_SKILLED;
	private BigDecimal	A11_TOTAL_UNSKILLED;
	private BigDecimal	A11_TOTAL_TOTAL;
	private BigDecimal	A11_TOTAL_ALL_SKILLED;
	private BigDecimal	A11_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A11_TOTAL_ALL_TOTAL;
	private String	A12_PRODUCT;
	private BigDecimal	A12_KEY_NON_SKILLED;
	private BigDecimal	A12_KEY_NON_UNSKILLED;
	private BigDecimal	A12_KEY_NON_TOTAL;
	private BigDecimal	A12_OTH_NON_SKILLED;
	private BigDecimal	A12_OTH_NON_UNSKILLED;
	private BigDecimal	A12_OTH_NON_TOTAL;
	private BigDecimal	A12_TOTAL_NON_SKILLED;
	private BigDecimal	A12_TOTAL_NON_UNSKILLED;
	private BigDecimal	A12_TOTAL_NON_TOTAL;
	private BigDecimal	A12_KEY_SKILLED;
	private BigDecimal	A12_KEY_UNSKILLED;
	private BigDecimal	A12_KEY_TOTAL;
	private BigDecimal	A12_OTH_SKILLED;
	private BigDecimal	A12_OTH_UNSKILLED;
	private BigDecimal	A12_OTH_TOTAL;
	private BigDecimal	A12_TOTAL_SKILLED;
	private BigDecimal	A12_TOTAL_UNSKILLED;
	private BigDecimal	A12_TOTAL_TOTAL;
	private BigDecimal	A12_TOTAL_ALL_SKILLED;
	private BigDecimal	A12_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A12_TOTAL_ALL_TOTAL;
	private String	A13_PRODUCT;
	private BigDecimal	A13_KEY_NON_SKILLED;
	private BigDecimal	A13_KEY_NON_UNSKILLED;
	private BigDecimal	A13_KEY_NON_TOTAL;
	private BigDecimal	A13_OTH_NON_SKILLED;
	private BigDecimal	A13_OTH_NON_UNSKILLED;
	private BigDecimal	A13_OTH_NON_TOTAL;
	private BigDecimal	A13_TOTAL_NON_SKILLED;
	private BigDecimal	A13_TOTAL_NON_UNSKILLED;
	private BigDecimal	A13_TOTAL_NON_TOTAL;
	private BigDecimal	A13_KEY_SKILLED;
	private BigDecimal	A13_KEY_UNSKILLED;
	private BigDecimal	A13_KEY_TOTAL;
	private BigDecimal	A13_OTH_SKILLED;
	private BigDecimal	A13_OTH_UNSKILLED;
	private BigDecimal	A13_OTH_TOTAL;
	private BigDecimal	A13_TOTAL_SKILLED;
	private BigDecimal	A13_TOTAL_UNSKILLED;
	private BigDecimal	A13_TOTAL_TOTAL;
	private BigDecimal	A13_TOTAL_ALL_SKILLED;
	private BigDecimal	A13_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A13_TOTAL_ALL_TOTAL;
	private String	A14_PRODUCT;
	private BigDecimal	A14_KEY_NON_SKILLED;
	private BigDecimal	A14_KEY_NON_UNSKILLED;
	private BigDecimal	A14_KEY_NON_TOTAL;
	private BigDecimal	A14_OTH_NON_SKILLED;
	private BigDecimal	A14_OTH_NON_UNSKILLED;
	private BigDecimal	A14_OTH_NON_TOTAL;
	private BigDecimal	A14_TOTAL_NON_SKILLED;
	private BigDecimal	A14_TOTAL_NON_UNSKILLED;
	private BigDecimal	A14_TOTAL_NON_TOTAL;
	private BigDecimal	A14_KEY_SKILLED;
	private BigDecimal	A14_KEY_UNSKILLED;
	private BigDecimal	A14_KEY_TOTAL;
	private BigDecimal	A14_OTH_SKILLED;
	private BigDecimal	A14_OTH_UNSKILLED;
	private BigDecimal	A14_OTH_TOTAL;
	private BigDecimal	A14_TOTAL_SKILLED;
	private BigDecimal	A14_TOTAL_UNSKILLED;
	private BigDecimal	A14_TOTAL_TOTAL;
	private BigDecimal	A14_TOTAL_ALL_SKILLED;
	private BigDecimal	A14_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A14_TOTAL_ALL_TOTAL;
	private String	A15_PRODUCT;
	private BigDecimal	A15_KEY_NON_SKILLED;
	private BigDecimal	A15_KEY_NON_UNSKILLED;
	private BigDecimal	A15_KEY_NON_TOTAL;
	private BigDecimal	A15_OTH_NON_SKILLED;
	private BigDecimal	A15_OTH_NON_UNSKILLED;
	private BigDecimal	A15_OTH_NON_TOTAL;
	private BigDecimal	A15_TOTAL_NON_SKILLED;
	private BigDecimal	A15_TOTAL_NON_UNSKILLED;
	private BigDecimal	A15_TOTAL_NON_TOTAL;
	private BigDecimal	A15_KEY_SKILLED;
	private BigDecimal	A15_KEY_UNSKILLED;
	private BigDecimal	A15_KEY_TOTAL;
	private BigDecimal	A15_OTH_SKILLED;
	private BigDecimal	A15_OTH_UNSKILLED;
	private BigDecimal	A15_OTH_TOTAL;
	private BigDecimal	A15_TOTAL_SKILLED;
	private BigDecimal	A15_TOTAL_UNSKILLED;
	private BigDecimal	A15_TOTAL_TOTAL;
	private BigDecimal	A15_TOTAL_ALL_SKILLED;
	private BigDecimal	A15_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A15_TOTAL_ALL_TOTAL;
	private String	A16_PRODUCT;
	private BigDecimal	A16_KEY_NON_SKILLED;
	private BigDecimal	A16_KEY_NON_UNSKILLED;
	private BigDecimal	A16_KEY_NON_TOTAL;
	private BigDecimal	A16_OTH_NON_SKILLED;
	private BigDecimal	A16_OTH_NON_UNSKILLED;
	private BigDecimal	A16_OTH_NON_TOTAL;
	private BigDecimal	A16_TOTAL_NON_SKILLED;
	private BigDecimal	A16_TOTAL_NON_UNSKILLED;
	private BigDecimal	A16_TOTAL_NON_TOTAL;
	private BigDecimal	A16_KEY_SKILLED;
	private BigDecimal	A16_KEY_UNSKILLED;
	private BigDecimal	A16_KEY_TOTAL;
	private BigDecimal	A16_OTH_SKILLED;
	private BigDecimal	A16_OTH_UNSKILLED;
	private BigDecimal	A16_OTH_TOTAL;
	private BigDecimal	A16_TOTAL_SKILLED;
	private BigDecimal	A16_TOTAL_UNSKILLED;
	private BigDecimal	A16_TOTAL_TOTAL;
	private BigDecimal	A16_TOTAL_ALL_SKILLED;
	private BigDecimal	A16_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A16_TOTAL_ALL_TOTAL;
	private String	A17_PRODUCT;
	private BigDecimal	A17_KEY_NON_SKILLED;
	private BigDecimal	A17_KEY_NON_UNSKILLED;
	private BigDecimal	A17_KEY_NON_TOTAL;
	private BigDecimal	A17_OTH_NON_SKILLED;
	private BigDecimal	A17_OTH_NON_UNSKILLED;
	private BigDecimal	A17_OTH_NON_TOTAL;
	private BigDecimal	A17_TOTAL_NON_SKILLED;
	private BigDecimal	A17_TOTAL_NON_UNSKILLED;
	private BigDecimal	A17_TOTAL_NON_TOTAL;
	private BigDecimal	A17_KEY_SKILLED;
	private BigDecimal	A17_KEY_UNSKILLED;
	private BigDecimal	A17_KEY_TOTAL;
	private BigDecimal	A17_OTH_SKILLED;
	private BigDecimal	A17_OTH_UNSKILLED;
	private BigDecimal	A17_OTH_TOTAL;
	private BigDecimal	A17_TOTAL_SKILLED;
	private BigDecimal	A17_TOTAL_UNSKILLED;
	private BigDecimal	A17_TOTAL_TOTAL;
	private BigDecimal	A17_TOTAL_ALL_SKILLED;
	private BigDecimal	A17_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A17_TOTAL_ALL_TOTAL;
	private String	A18_PRODUCT;
	private BigDecimal	A18_KEY_NON_SKILLED;
	private BigDecimal	A18_KEY_NON_UNSKILLED;
	private BigDecimal	A18_KEY_NON_TOTAL;
	private BigDecimal	A18_OTH_NON_SKILLED;
	private BigDecimal	A18_OTH_NON_UNSKILLED;
	private BigDecimal	A18_OTH_NON_TOTAL;
	private BigDecimal	A18_TOTAL_NON_SKILLED;
	private BigDecimal	A18_TOTAL_NON_UNSKILLED;
	private BigDecimal	A18_TOTAL_NON_TOTAL;
	private BigDecimal	A18_KEY_SKILLED;
	private BigDecimal	A18_KEY_UNSKILLED;
	private BigDecimal	A18_KEY_TOTAL;
	private BigDecimal	A18_OTH_SKILLED;
	private BigDecimal	A18_OTH_UNSKILLED;
	private BigDecimal	A18_OTH_TOTAL;
	private BigDecimal	A18_TOTAL_SKILLED;
	private BigDecimal	A18_TOTAL_UNSKILLED;
	private BigDecimal	A18_TOTAL_TOTAL;
	private BigDecimal	A18_TOTAL_ALL_SKILLED;
	private BigDecimal	A18_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A18_TOTAL_ALL_TOTAL;
	private String	A19_PRODUCT;
	private BigDecimal	A19_KEY_NON_SKILLED;
	private BigDecimal	A19_KEY_NON_UNSKILLED;
	private BigDecimal	A19_KEY_NON_TOTAL;
	private BigDecimal	A19_OTH_NON_SKILLED;
	private BigDecimal	A19_OTH_NON_UNSKILLED;
	private BigDecimal	A19_OTH_NON_TOTAL;
	private BigDecimal	A19_TOTAL_NON_SKILLED;
	private BigDecimal	A19_TOTAL_NON_UNSKILLED;
	private BigDecimal	A19_TOTAL_NON_TOTAL;
	private BigDecimal	A19_KEY_SKILLED;
	private BigDecimal	A19_KEY_UNSKILLED;
	private BigDecimal	A19_KEY_TOTAL;
	private BigDecimal	A19_OTH_SKILLED;
	private BigDecimal	A19_OTH_UNSKILLED;
	private BigDecimal	A19_OTH_TOTAL;
	private BigDecimal	A19_TOTAL_SKILLED;
	private BigDecimal	A19_TOTAL_UNSKILLED;
	private BigDecimal	A19_TOTAL_TOTAL;
	private BigDecimal	A19_TOTAL_ALL_SKILLED;
	private BigDecimal	A19_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A19_TOTAL_ALL_TOTAL;
	private String	A20_PRODUCT;
	private BigDecimal	A20_KEY_NON_SKILLED;
	private BigDecimal	A20_KEY_NON_UNSKILLED;
	private BigDecimal	A20_KEY_NON_TOTAL;
	private BigDecimal	A20_OTH_NON_SKILLED;
	private BigDecimal	A20_OTH_NON_UNSKILLED;
	private BigDecimal	A20_OTH_NON_TOTAL;
	private BigDecimal	A20_TOTAL_NON_SKILLED;
	private BigDecimal	A20_TOTAL_NON_UNSKILLED;
	private BigDecimal	A20_TOTAL_NON_TOTAL;
	private BigDecimal	A20_KEY_SKILLED;
	private BigDecimal	A20_KEY_UNSKILLED;
	private BigDecimal	A20_KEY_TOTAL;
	private BigDecimal	A20_OTH_SKILLED;
	private BigDecimal	A20_OTH_UNSKILLED;
	private BigDecimal	A20_OTH_TOTAL;
	private BigDecimal	A20_TOTAL_SKILLED;
	private BigDecimal	A20_TOTAL_UNSKILLED;
	private BigDecimal	A20_TOTAL_TOTAL;
	private BigDecimal	A20_TOTAL_ALL_SKILLED;
	private BigDecimal	A20_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A20_TOTAL_ALL_TOTAL;
	private String	A21_PRODUCT;
	private BigDecimal	A21_KEY_NON_SKILLED;
	private BigDecimal	A21_KEY_NON_UNSKILLED;
	private BigDecimal	A21_KEY_NON_TOTAL;
	private BigDecimal	A21_OTH_NON_SKILLED;
	private BigDecimal	A21_OTH_NON_UNSKILLED;
	private BigDecimal	A21_OTH_NON_TOTAL;
	private BigDecimal	A21_TOTAL_NON_SKILLED;
	private BigDecimal	A21_TOTAL_NON_UNSKILLED;
	private BigDecimal	A21_TOTAL_NON_TOTAL;
	private BigDecimal	A21_KEY_SKILLED;
	private BigDecimal	A21_KEY_UNSKILLED;
	private BigDecimal	A21_KEY_TOTAL;
	private BigDecimal	A21_OTH_SKILLED;
	private BigDecimal	A21_OTH_UNSKILLED;
	private BigDecimal	A21_OTH_TOTAL;
	private BigDecimal	A21_TOTAL_SKILLED;
	private BigDecimal	A21_TOTAL_UNSKILLED;
	private BigDecimal	A21_TOTAL_TOTAL;
	private BigDecimal	A21_TOTAL_ALL_SKILLED;
	private BigDecimal	A21_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A21_TOTAL_ALL_TOTAL;
	private String	A22_PRODUCT;
	private BigDecimal	A22_KEY_NON_SKILLED;
	private BigDecimal	A22_KEY_NON_UNSKILLED;
	private BigDecimal	A22_KEY_NON_TOTAL;
	private BigDecimal	A22_OTH_NON_SKILLED;
	private BigDecimal	A22_OTH_NON_UNSKILLED;
	private BigDecimal	A22_OTH_NON_TOTAL;
	private BigDecimal	A22_TOTAL_NON_SKILLED;
	private BigDecimal	A22_TOTAL_NON_UNSKILLED;
	private BigDecimal	A22_TOTAL_NON_TOTAL;
	private BigDecimal	A22_KEY_SKILLED;
	private BigDecimal	A22_KEY_UNSKILLED;
	private BigDecimal	A22_KEY_TOTAL;
	private BigDecimal	A22_OTH_SKILLED;
	private BigDecimal	A22_OTH_UNSKILLED;
	private BigDecimal	A22_OTH_TOTAL;
	private BigDecimal	A22_TOTAL_SKILLED;
	private BigDecimal	A22_TOTAL_UNSKILLED;
	private BigDecimal	A22_TOTAL_TOTAL;
	private BigDecimal	A22_TOTAL_ALL_SKILLED;
	private BigDecimal	A22_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A22_TOTAL_ALL_TOTAL;
	private String	A23_PRODUCT;
	private BigDecimal	A23_KEY_NON_SKILLED;
	private BigDecimal	A23_KEY_NON_UNSKILLED;
	private BigDecimal	A23_KEY_NON_TOTAL;
	private BigDecimal	A23_OTH_NON_SKILLED;
	private BigDecimal	A23_OTH_NON_UNSKILLED;
	private BigDecimal	A23_OTH_NON_TOTAL;
	private BigDecimal	A23_TOTAL_NON_SKILLED;
	private BigDecimal	A23_TOTAL_NON_UNSKILLED;
	private BigDecimal	A23_TOTAL_NON_TOTAL;
	private BigDecimal	A23_KEY_SKILLED;
	private BigDecimal	A23_KEY_UNSKILLED;
	private BigDecimal	A23_KEY_TOTAL;
	private BigDecimal	A23_OTH_SKILLED;
	private BigDecimal	A23_OTH_UNSKILLED;
	private BigDecimal	A23_OTH_TOTAL;
	private BigDecimal	A23_TOTAL_SKILLED;
	private BigDecimal	A23_TOTAL_UNSKILLED;
	private BigDecimal	A23_TOTAL_TOTAL;
	private BigDecimal	A23_TOTAL_ALL_SKILLED;
	private BigDecimal	A23_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A23_TOTAL_ALL_TOTAL;
	private String	A24_PRODUCT;
	private BigDecimal	A24_KEY_NON_SKILLED;
	private BigDecimal	A24_KEY_NON_UNSKILLED;
	private BigDecimal	A24_KEY_NON_TOTAL;
	private BigDecimal	A24_OTH_NON_SKILLED;
	private BigDecimal	A24_OTH_NON_UNSKILLED;
	private BigDecimal	A24_OTH_NON_TOTAL;
	private BigDecimal	A24_TOTAL_NON_SKILLED;
	private BigDecimal	A24_TOTAL_NON_UNSKILLED;
	private BigDecimal	A24_TOTAL_NON_TOTAL;
	private BigDecimal	A24_KEY_SKILLED;
	private BigDecimal	A24_KEY_UNSKILLED;
	private BigDecimal	A24_KEY_TOTAL;
	private BigDecimal	A24_OTH_SKILLED;
	private BigDecimal	A24_OTH_UNSKILLED;
	private BigDecimal	A24_OTH_TOTAL;
	private BigDecimal	A24_TOTAL_SKILLED;
	private BigDecimal	A24_TOTAL_UNSKILLED;
	private BigDecimal	A24_TOTAL_TOTAL;
	private BigDecimal	A24_TOTAL_ALL_SKILLED;
	private BigDecimal	A24_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A24_TOTAL_ALL_TOTAL;
	private String	A25_PRODUCT;
	private BigDecimal	A25_KEY_NON_SKILLED;
	private BigDecimal	A25_KEY_NON_UNSKILLED;
	private BigDecimal	A25_KEY_NON_TOTAL;
	private BigDecimal	A25_OTH_NON_SKILLED;
	private BigDecimal	A25_OTH_NON_UNSKILLED;
	private BigDecimal	A25_OTH_NON_TOTAL;
	private BigDecimal	A25_TOTAL_NON_SKILLED;
	private BigDecimal	A25_TOTAL_NON_UNSKILLED;
	private BigDecimal	A25_TOTAL_NON_TOTAL;
	private BigDecimal	A25_KEY_SKILLED;
	private BigDecimal	A25_KEY_UNSKILLED;
	private BigDecimal	A25_KEY_TOTAL;
	private BigDecimal	A25_OTH_SKILLED;
	private BigDecimal	A25_OTH_UNSKILLED;
	private BigDecimal	A25_OTH_TOTAL;
	private BigDecimal	A25_TOTAL_SKILLED;
	private BigDecimal	A25_TOTAL_UNSKILLED;
	private BigDecimal	A25_TOTAL_TOTAL;
	private BigDecimal	A25_TOTAL_ALL_SKILLED;
	private BigDecimal	A25_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A25_TOTAL_ALL_TOTAL;
	private String	A26_PRODUCT;
	private BigDecimal	A26_KEY_NON_SKILLED;
	private BigDecimal	A26_KEY_NON_UNSKILLED;
	private BigDecimal	A26_KEY_NON_TOTAL;
	private BigDecimal	A26_OTH_NON_SKILLED;
	private BigDecimal	A26_OTH_NON_UNSKILLED;
	private BigDecimal	A26_OTH_NON_TOTAL;
	private BigDecimal	A26_TOTAL_NON_SKILLED;
	private BigDecimal	A26_TOTAL_NON_UNSKILLED;
	private BigDecimal	A26_TOTAL_NON_TOTAL;
	private BigDecimal	A26_KEY_SKILLED;
	private BigDecimal	A26_KEY_UNSKILLED;
	private BigDecimal	A26_KEY_TOTAL;
	private BigDecimal	A26_OTH_SKILLED;
	private BigDecimal	A26_OTH_UNSKILLED;
	private BigDecimal	A26_OTH_TOTAL;
	private BigDecimal	A26_TOTAL_SKILLED;
	private BigDecimal	A26_TOTAL_UNSKILLED;
	private BigDecimal	A26_TOTAL_TOTAL;
	private BigDecimal	A26_TOTAL_ALL_SKILLED;
	private BigDecimal	A26_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A26_TOTAL_ALL_TOTAL;
	private String	A27_PRODUCT;
	private BigDecimal	A27_KEY_NON_SKILLED;
	private BigDecimal	A27_KEY_NON_UNSKILLED;
	private BigDecimal	A27_KEY_NON_TOTAL;
	private BigDecimal	A27_OTH_NON_SKILLED;
	private BigDecimal	A27_OTH_NON_UNSKILLED;
	private BigDecimal	A27_OTH_NON_TOTAL;
	private BigDecimal	A27_TOTAL_NON_SKILLED;
	private BigDecimal	A27_TOTAL_NON_UNSKILLED;
	private BigDecimal	A27_TOTAL_NON_TOTAL;
	private BigDecimal	A27_KEY_SKILLED;
	private BigDecimal	A27_KEY_UNSKILLED;
	private BigDecimal	A27_KEY_TOTAL;
	private BigDecimal	A27_OTH_SKILLED;
	private BigDecimal	A27_OTH_UNSKILLED;
	private BigDecimal	A27_OTH_TOTAL;
	private BigDecimal	A27_TOTAL_SKILLED;
	private BigDecimal	A27_TOTAL_UNSKILLED;
	private BigDecimal	A27_TOTAL_TOTAL;
	private BigDecimal	A27_TOTAL_ALL_SKILLED;
	private BigDecimal	A27_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A27_TOTAL_ALL_TOTAL;
	private String	A28_PRODUCT;
	private BigDecimal	A28_KEY_NON_SKILLED;
	private BigDecimal	A28_KEY_NON_UNSKILLED;
	private BigDecimal	A28_KEY_NON_TOTAL;
	private BigDecimal	A28_OTH_NON_SKILLED;
	private BigDecimal	A28_OTH_NON_UNSKILLED;
	private BigDecimal	A28_OTH_NON_TOTAL;
	private BigDecimal	A28_TOTAL_NON_SKILLED;
	private BigDecimal	A28_TOTAL_NON_UNSKILLED;
	private BigDecimal	A28_TOTAL_NON_TOTAL;
	private BigDecimal	A28_KEY_SKILLED;
	private BigDecimal	A28_KEY_UNSKILLED;
	private BigDecimal	A28_KEY_TOTAL;
	private BigDecimal	A28_OTH_SKILLED;
	private BigDecimal	A28_OTH_UNSKILLED;
	private BigDecimal	A28_OTH_TOTAL;
	private BigDecimal	A28_TOTAL_SKILLED;
	private BigDecimal	A28_TOTAL_UNSKILLED;
	private BigDecimal	A28_TOTAL_TOTAL;
	private BigDecimal	A28_TOTAL_ALL_SKILLED;
	private BigDecimal	A28_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A28_TOTAL_ALL_TOTAL;
	private String	A29_PRODUCT;
	private BigDecimal	A29_KEY_NON_SKILLED;
	private BigDecimal	A29_KEY_NON_UNSKILLED;
	private BigDecimal	A29_KEY_NON_TOTAL;
	private BigDecimal	A29_OTH_NON_SKILLED;
	private BigDecimal	A29_OTH_NON_UNSKILLED;
	private BigDecimal	A29_OTH_NON_TOTAL;
	private BigDecimal	A29_TOTAL_NON_SKILLED;
	private BigDecimal	A29_TOTAL_NON_UNSKILLED;
	private BigDecimal	A29_TOTAL_NON_TOTAL;
	private BigDecimal	A29_KEY_SKILLED;
	private BigDecimal	A29_KEY_UNSKILLED;
	private BigDecimal	A29_KEY_TOTAL;
	private BigDecimal	A29_OTH_SKILLED;
	private BigDecimal	A29_OTH_UNSKILLED;
	private BigDecimal	A29_OTH_TOTAL;
	private BigDecimal	A29_TOTAL_SKILLED;
	private BigDecimal	A29_TOTAL_UNSKILLED;
	private BigDecimal	A29_TOTAL_TOTAL;
	private BigDecimal	A29_TOTAL_ALL_SKILLED;
	private BigDecimal	A29_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A29_TOTAL_ALL_TOTAL;
	private String	A30_PRODUCT;
	private BigDecimal	A30_KEY_NON_SKILLED;
	private BigDecimal	A30_KEY_NON_UNSKILLED;
	private BigDecimal	A30_KEY_NON_TOTAL;
	private BigDecimal	A30_OTH_NON_SKILLED;
	private BigDecimal	A30_OTH_NON_UNSKILLED;
	private BigDecimal	A30_OTH_NON_TOTAL;
	private BigDecimal	A30_TOTAL_NON_SKILLED;
	private BigDecimal	A30_TOTAL_NON_UNSKILLED;
	private BigDecimal	A30_TOTAL_NON_TOTAL;
	private BigDecimal	A30_KEY_SKILLED;
	private BigDecimal	A30_KEY_UNSKILLED;
	private BigDecimal	A30_KEY_TOTAL;
	private BigDecimal	A30_OTH_SKILLED;
	private BigDecimal	A30_OTH_UNSKILLED;
	private BigDecimal	A30_OTH_TOTAL;
	private BigDecimal	A30_TOTAL_SKILLED;
	private BigDecimal	A30_TOTAL_UNSKILLED;
	private BigDecimal	A30_TOTAL_TOTAL;
	private BigDecimal	A30_TOTAL_ALL_SKILLED;
	private BigDecimal	A30_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A30_TOTAL_ALL_TOTAL;
	private String	A31_PRODUCT;
	private BigDecimal	A31_KEY_NON_SKILLED;
	private BigDecimal	A31_KEY_NON_UNSKILLED;
	private BigDecimal	A31_KEY_NON_TOTAL;
	private BigDecimal	A31_OTH_NON_SKILLED;
	private BigDecimal	A31_OTH_NON_UNSKILLED;
	private BigDecimal	A31_OTH_NON_TOTAL;
	private BigDecimal	A31_TOTAL_NON_SKILLED;
	private BigDecimal	A31_TOTAL_NON_UNSKILLED;
	private BigDecimal	A31_TOTAL_NON_TOTAL;
	private BigDecimal	A31_KEY_SKILLED;
	private BigDecimal	A31_KEY_UNSKILLED;
	private BigDecimal	A31_KEY_TOTAL;
	private BigDecimal	A31_OTH_SKILLED;
	private BigDecimal	A31_OTH_UNSKILLED;
	private BigDecimal	A31_OTH_TOTAL;
	private BigDecimal	A31_TOTAL_SKILLED;
	private BigDecimal	A31_TOTAL_UNSKILLED;
	private BigDecimal	A31_TOTAL_TOTAL;
	private BigDecimal	A31_TOTAL_ALL_SKILLED;
	private BigDecimal	A31_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A31_TOTAL_ALL_TOTAL;
	private String	A32_PRODUCT;
	private BigDecimal	A32_KEY_NON_SKILLED;
	private BigDecimal	A32_KEY_NON_UNSKILLED;
	private BigDecimal	A32_KEY_NON_TOTAL;
	private BigDecimal	A32_OTH_NON_SKILLED;
	private BigDecimal	A32_OTH_NON_UNSKILLED;
	private BigDecimal	A32_OTH_NON_TOTAL;
	private BigDecimal	A32_TOTAL_NON_SKILLED;
	private BigDecimal	A32_TOTAL_NON_UNSKILLED;
	private BigDecimal	A32_TOTAL_NON_TOTAL;
	private BigDecimal	A32_KEY_SKILLED;
	private BigDecimal	A32_KEY_UNSKILLED;
	private BigDecimal	A32_KEY_TOTAL;
	private BigDecimal	A32_OTH_SKILLED;
	private BigDecimal	A32_OTH_UNSKILLED;
	private BigDecimal	A32_OTH_TOTAL;
	private BigDecimal	A32_TOTAL_SKILLED;
	private BigDecimal	A32_TOTAL_UNSKILLED;
	private BigDecimal	A32_TOTAL_TOTAL;
	private BigDecimal	A32_TOTAL_ALL_SKILLED;
	private BigDecimal	A32_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A32_TOTAL_ALL_TOTAL;
	private String	A33_PRODUCT;
	private BigDecimal	A33_KEY_NON_SKILLED;
	private BigDecimal	A33_KEY_NON_UNSKILLED;
	private BigDecimal	A33_KEY_NON_TOTAL;
	private BigDecimal	A33_OTH_NON_SKILLED;
	private BigDecimal	A33_OTH_NON_UNSKILLED;
	private BigDecimal	A33_OTH_NON_TOTAL;
	private BigDecimal	A33_TOTAL_NON_SKILLED;
	private BigDecimal	A33_TOTAL_NON_UNSKILLED;
	private BigDecimal	A33_TOTAL_NON_TOTAL;
	private BigDecimal	A33_KEY_SKILLED;
	private BigDecimal	A33_KEY_UNSKILLED;
	private BigDecimal	A33_KEY_TOTAL;
	private BigDecimal	A33_OTH_SKILLED;
	private BigDecimal	A33_OTH_UNSKILLED;
	private BigDecimal	A33_OTH_TOTAL;
	private BigDecimal	A33_TOTAL_SKILLED;
	private BigDecimal	A33_TOTAL_UNSKILLED;
	private BigDecimal	A33_TOTAL_TOTAL;
	private BigDecimal	A33_TOTAL_ALL_SKILLED;
	private BigDecimal	A33_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A33_TOTAL_ALL_TOTAL;
	private String	A34_PRODUCT;
	private BigDecimal	A34_KEY_NON_SKILLED;
	private BigDecimal	A34_KEY_NON_UNSKILLED;
	private BigDecimal	A34_KEY_NON_TOTAL;
	private BigDecimal	A34_OTH_NON_SKILLED;
	private BigDecimal	A34_OTH_NON_UNSKILLED;
	private BigDecimal	A34_OTH_NON_TOTAL;
	private BigDecimal	A34_TOTAL_NON_SKILLED;
	private BigDecimal	A34_TOTAL_NON_UNSKILLED;
	private BigDecimal	A34_TOTAL_NON_TOTAL;
	private BigDecimal	A34_KEY_SKILLED;
	private BigDecimal	A34_KEY_UNSKILLED;
	private BigDecimal	A34_KEY_TOTAL;
	private BigDecimal	A34_OTH_SKILLED;
	private BigDecimal	A34_OTH_UNSKILLED;
	private BigDecimal	A34_OTH_TOTAL;
	private BigDecimal	A34_TOTAL_SKILLED;
	private BigDecimal	A34_TOTAL_UNSKILLED;
	private BigDecimal	A34_TOTAL_TOTAL;
	private BigDecimal	A34_TOTAL_ALL_SKILLED;
	private BigDecimal	A34_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A34_TOTAL_ALL_TOTAL;
	private String	A35_PRODUCT;
	private BigDecimal	A35_KEY_NON_SKILLED;
	private BigDecimal	A35_KEY_NON_UNSKILLED;
	private BigDecimal	A35_KEY_NON_TOTAL;
	private BigDecimal	A35_OTH_NON_SKILLED;
	private BigDecimal	A35_OTH_NON_UNSKILLED;
	private BigDecimal	A35_OTH_NON_TOTAL;
	private BigDecimal	A35_TOTAL_NON_SKILLED;
	private BigDecimal	A35_TOTAL_NON_UNSKILLED;
	private BigDecimal	A35_TOTAL_NON_TOTAL;
	private BigDecimal	A35_KEY_SKILLED;
	private BigDecimal	A35_KEY_UNSKILLED;
	private BigDecimal	A35_KEY_TOTAL;
	private BigDecimal	A35_OTH_SKILLED;
	private BigDecimal	A35_OTH_UNSKILLED;
	private BigDecimal	A35_OTH_TOTAL;
	private BigDecimal	A35_TOTAL_SKILLED;
	private BigDecimal	A35_TOTAL_UNSKILLED;
	private BigDecimal	A35_TOTAL_TOTAL;
	private BigDecimal	A35_TOTAL_ALL_SKILLED;
	private BigDecimal	A35_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A35_TOTAL_ALL_TOTAL;
	private String	A36_PRODUCT;
	private BigDecimal	A36_KEY_NON_SKILLED;
	private BigDecimal	A36_KEY_NON_UNSKILLED;
	private BigDecimal	A36_KEY_NON_TOTAL;
	private BigDecimal	A36_OTH_NON_SKILLED;
	private BigDecimal	A36_OTH_NON_UNSKILLED;
	private BigDecimal	A36_OTH_NON_TOTAL;
	private BigDecimal	A36_TOTAL_NON_SKILLED;
	private BigDecimal	A36_TOTAL_NON_UNSKILLED;
	private BigDecimal	A36_TOTAL_NON_TOTAL;
	private BigDecimal	A36_KEY_SKILLED;
	private BigDecimal	A36_KEY_UNSKILLED;
	private BigDecimal	A36_KEY_TOTAL;
	private BigDecimal	A36_OTH_SKILLED;
	private BigDecimal	A36_OTH_UNSKILLED;
	private BigDecimal	A36_OTH_TOTAL;
	private BigDecimal	A36_TOTAL_SKILLED;
	private BigDecimal	A36_TOTAL_UNSKILLED;
	private BigDecimal	A36_TOTAL_TOTAL;
	private BigDecimal	A36_TOTAL_ALL_SKILLED;
	private BigDecimal	A36_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A36_TOTAL_ALL_TOTAL;
	private String	A37_PRODUCT;
	private BigDecimal	A37_KEY_NON_SKILLED;
	private BigDecimal	A37_KEY_NON_UNSKILLED;
	private BigDecimal	A37_KEY_NON_TOTAL;
	private BigDecimal	A37_OTH_NON_SKILLED;
	private BigDecimal	A37_OTH_NON_UNSKILLED;
	private BigDecimal	A37_OTH_NON_TOTAL;
	private BigDecimal	A37_TOTAL_NON_SKILLED;
	private BigDecimal	A37_TOTAL_NON_UNSKILLED;
	private BigDecimal	A37_TOTAL_NON_TOTAL;
	private BigDecimal	A37_KEY_SKILLED;
	private BigDecimal	A37_KEY_UNSKILLED;
	private BigDecimal	A37_KEY_TOTAL;
	private BigDecimal	A37_OTH_SKILLED;
	private BigDecimal	A37_OTH_UNSKILLED;
	private BigDecimal	A37_OTH_TOTAL;
	private BigDecimal	A37_TOTAL_SKILLED;
	private BigDecimal	A37_TOTAL_UNSKILLED;
	private BigDecimal	A37_TOTAL_TOTAL;
	private BigDecimal	A37_TOTAL_ALL_SKILLED;
	private BigDecimal	A37_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A37_TOTAL_ALL_TOTAL;
	private String	A38_PRODUCT;
	private BigDecimal	A38_KEY_NON_SKILLED;
	private BigDecimal	A38_KEY_NON_UNSKILLED;
	private BigDecimal	A38_KEY_NON_TOTAL;
	private BigDecimal	A38_OTH_NON_SKILLED;
	private BigDecimal	A38_OTH_NON_UNSKILLED;
	private BigDecimal	A38_OTH_NON_TOTAL;
	private BigDecimal	A38_TOTAL_NON_SKILLED;
	private BigDecimal	A38_TOTAL_NON_UNSKILLED;
	private BigDecimal	A38_TOTAL_NON_TOTAL;
	private BigDecimal	A38_KEY_SKILLED;
	private BigDecimal	A38_KEY_UNSKILLED;
	private BigDecimal	A38_KEY_TOTAL;
	private BigDecimal	A38_OTH_SKILLED;
	private BigDecimal	A38_OTH_UNSKILLED;
	private BigDecimal	A38_OTH_TOTAL;
	private BigDecimal	A38_TOTAL_SKILLED;
	private BigDecimal	A38_TOTAL_UNSKILLED;
	private BigDecimal	A38_TOTAL_TOTAL;
	private BigDecimal	A38_TOTAL_ALL_SKILLED;
	private BigDecimal	A38_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A38_TOTAL_ALL_TOTAL;
	private String	A39_PRODUCT;
	private BigDecimal	A39_KEY_NON_SKILLED;
	private BigDecimal	A39_KEY_NON_UNSKILLED;
	private BigDecimal	A39_KEY_NON_TOTAL;
	private BigDecimal	A39_OTH_NON_SKILLED;
	private BigDecimal	A39_OTH_NON_UNSKILLED;
	private BigDecimal	A39_OTH_NON_TOTAL;
	private BigDecimal	A39_TOTAL_NON_SKILLED;
	private BigDecimal	A39_TOTAL_NON_UNSKILLED;
	private BigDecimal	A39_TOTAL_NON_TOTAL;
	private BigDecimal	A39_KEY_SKILLED;
	private BigDecimal	A39_KEY_UNSKILLED;
	private BigDecimal	A39_KEY_TOTAL;
	private BigDecimal	A39_OTH_SKILLED;
	private BigDecimal	A39_OTH_UNSKILLED;
	private BigDecimal	A39_OTH_TOTAL;
	private BigDecimal	A39_TOTAL_SKILLED;
	private BigDecimal	A39_TOTAL_UNSKILLED;
	private BigDecimal	A39_TOTAL_TOTAL;
	private BigDecimal	A39_TOTAL_ALL_SKILLED;
	private BigDecimal	A39_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A39_TOTAL_ALL_TOTAL;
	private String	A40_PRODUCT;
	private BigDecimal	A40_KEY_NON_SKILLED;
	private BigDecimal	A40_KEY_NON_UNSKILLED;
	private BigDecimal	A40_KEY_NON_TOTAL;
	private BigDecimal	A40_OTH_NON_SKILLED;
	private BigDecimal	A40_OTH_NON_UNSKILLED;
	private BigDecimal	A40_OTH_NON_TOTAL;
	private BigDecimal	A40_TOTAL_NON_SKILLED;
	private BigDecimal	A40_TOTAL_NON_UNSKILLED;
	private BigDecimal	A40_TOTAL_NON_TOTAL;
	private BigDecimal	A40_KEY_SKILLED;
	private BigDecimal	A40_KEY_UNSKILLED;
	private BigDecimal	A40_KEY_TOTAL;
	private BigDecimal	A40_OTH_SKILLED;
	private BigDecimal	A40_OTH_UNSKILLED;
	private BigDecimal	A40_OTH_TOTAL;
	private BigDecimal	A40_TOTAL_SKILLED;
	private BigDecimal	A40_TOTAL_UNSKILLED;
	private BigDecimal	A40_TOTAL_TOTAL;
	private BigDecimal	A40_TOTAL_ALL_SKILLED;
	private BigDecimal	A40_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A40_TOTAL_ALL_TOTAL;
	private String	A41_PRODUCT;
	private BigDecimal	A41_KEY_NON_SKILLED;
	private BigDecimal	A41_KEY_NON_UNSKILLED;
	private BigDecimal	A41_KEY_NON_TOTAL;
	private BigDecimal	A41_OTH_NON_SKILLED;
	private BigDecimal	A41_OTH_NON_UNSKILLED;
	private BigDecimal	A41_OTH_NON_TOTAL;
	private BigDecimal	A41_TOTAL_NON_SKILLED;
	private BigDecimal	A41_TOTAL_NON_UNSKILLED;
	private BigDecimal	A41_TOTAL_NON_TOTAL;
	private BigDecimal	A41_KEY_SKILLED;
	private BigDecimal	A41_KEY_UNSKILLED;
	private BigDecimal	A41_KEY_TOTAL;
	private BigDecimal	A41_OTH_SKILLED;
	private BigDecimal	A41_OTH_UNSKILLED;
	private BigDecimal	A41_OTH_TOTAL;
	private BigDecimal	A41_TOTAL_SKILLED;
	private BigDecimal	A41_TOTAL_UNSKILLED;
	private BigDecimal	A41_TOTAL_TOTAL;
	private BigDecimal	A41_TOTAL_ALL_SKILLED;
	private BigDecimal	A41_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A41_TOTAL_ALL_TOTAL;
	private String	A42_PRODUCT;
	private BigDecimal	A42_KEY_NON_SKILLED;
	private BigDecimal	A42_KEY_NON_UNSKILLED;
	private BigDecimal	A42_KEY_NON_TOTAL;
	private BigDecimal	A42_OTH_NON_SKILLED;
	private BigDecimal	A42_OTH_NON_UNSKILLED;
	private BigDecimal	A42_OTH_NON_TOTAL;
	private BigDecimal	A42_TOTAL_NON_SKILLED;
	private BigDecimal	A42_TOTAL_NON_UNSKILLED;
	private BigDecimal	A42_TOTAL_NON_TOTAL;
	private BigDecimal	A42_KEY_SKILLED;
	private BigDecimal	A42_KEY_UNSKILLED;
	private BigDecimal	A42_KEY_TOTAL;
	private BigDecimal	A42_OTH_SKILLED;
	private BigDecimal	A42_OTH_UNSKILLED;
	private BigDecimal	A42_OTH_TOTAL;
	private BigDecimal	A42_TOTAL_SKILLED;
	private BigDecimal	A42_TOTAL_UNSKILLED;
	private BigDecimal	A42_TOTAL_TOTAL;
	private BigDecimal	A42_TOTAL_ALL_SKILLED;
	private BigDecimal	A42_TOTAL_ALL_UNSKILLED;
	private BigDecimal	A42_TOTAL_ALL_TOTAL;
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
	public BigDecimal getA1_KEY_NON_SKILLED() {
		return A1_KEY_NON_SKILLED;
	}
	public void setA1_KEY_NON_SKILLED(BigDecimal a1_KEY_NON_SKILLED) {
		A1_KEY_NON_SKILLED = a1_KEY_NON_SKILLED;
	}
	public BigDecimal getA1_KEY_NON_UNSKILLED() {
		return A1_KEY_NON_UNSKILLED;
	}
	public void setA1_KEY_NON_UNSKILLED(BigDecimal a1_KEY_NON_UNSKILLED) {
		A1_KEY_NON_UNSKILLED = a1_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA1_KEY_NON_TOTAL() {
		return A1_KEY_NON_TOTAL;
	}
	public void setA1_KEY_NON_TOTAL(BigDecimal a1_KEY_NON_TOTAL) {
		A1_KEY_NON_TOTAL = a1_KEY_NON_TOTAL;
	}
	public BigDecimal getA1_OTH_NON_SKILLED() {
		return A1_OTH_NON_SKILLED;
	}
	public void setA1_OTH_NON_SKILLED(BigDecimal a1_OTH_NON_SKILLED) {
		A1_OTH_NON_SKILLED = a1_OTH_NON_SKILLED;
	}
	public BigDecimal getA1_OTH_NON_UNSKILLED() {
		return A1_OTH_NON_UNSKILLED;
	}
	public void setA1_OTH_NON_UNSKILLED(BigDecimal a1_OTH_NON_UNSKILLED) {
		A1_OTH_NON_UNSKILLED = a1_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA1_OTH_NON_TOTAL() {
		return A1_OTH_NON_TOTAL;
	}
	public void setA1_OTH_NON_TOTAL(BigDecimal a1_OTH_NON_TOTAL) {
		A1_OTH_NON_TOTAL = a1_OTH_NON_TOTAL;
	}
	public BigDecimal getA1_TOTAL_NON_SKILLED() {
		return A1_TOTAL_NON_SKILLED;
	}
	public void setA1_TOTAL_NON_SKILLED(BigDecimal a1_TOTAL_NON_SKILLED) {
		A1_TOTAL_NON_SKILLED = a1_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA1_TOTAL_NON_UNSKILLED() {
		return A1_TOTAL_NON_UNSKILLED;
	}
	public void setA1_TOTAL_NON_UNSKILLED(BigDecimal a1_TOTAL_NON_UNSKILLED) {
		A1_TOTAL_NON_UNSKILLED = a1_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA1_TOTAL_NON_TOTAL() {
		return A1_TOTAL_NON_TOTAL;
	}
	public void setA1_TOTAL_NON_TOTAL(BigDecimal a1_TOTAL_NON_TOTAL) {
		A1_TOTAL_NON_TOTAL = a1_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA1_KEY_SKILLED() {
		return A1_KEY_SKILLED;
	}
	public void setA1_KEY_SKILLED(BigDecimal a1_KEY_SKILLED) {
		A1_KEY_SKILLED = a1_KEY_SKILLED;
	}
	public BigDecimal getA1_KEY_UNSKILLED() {
		return A1_KEY_UNSKILLED;
	}
	public void setA1_KEY_UNSKILLED(BigDecimal a1_KEY_UNSKILLED) {
		A1_KEY_UNSKILLED = a1_KEY_UNSKILLED;
	}
	public BigDecimal getA1_KEY_TOTAL() {
		return A1_KEY_TOTAL;
	}
	public void setA1_KEY_TOTAL(BigDecimal a1_KEY_TOTAL) {
		A1_KEY_TOTAL = a1_KEY_TOTAL;
	}
	public BigDecimal getA1_OTH_SKILLED() {
		return A1_OTH_SKILLED;
	}
	public void setA1_OTH_SKILLED(BigDecimal a1_OTH_SKILLED) {
		A1_OTH_SKILLED = a1_OTH_SKILLED;
	}
	public BigDecimal getA1_OTH_UNSKILLED() {
		return A1_OTH_UNSKILLED;
	}
	public void setA1_OTH_UNSKILLED(BigDecimal a1_OTH_UNSKILLED) {
		A1_OTH_UNSKILLED = a1_OTH_UNSKILLED;
	}
	public BigDecimal getA1_OTH_TOTAL() {
		return A1_OTH_TOTAL;
	}
	public void setA1_OTH_TOTAL(BigDecimal a1_OTH_TOTAL) {
		A1_OTH_TOTAL = a1_OTH_TOTAL;
	}
	public BigDecimal getA1_TOTAL_SKILLED() {
		return A1_TOTAL_SKILLED;
	}
	public void setA1_TOTAL_SKILLED(BigDecimal a1_TOTAL_SKILLED) {
		A1_TOTAL_SKILLED = a1_TOTAL_SKILLED;
	}
	public BigDecimal getA1_TOTAL_UNSKILLED() {
		return A1_TOTAL_UNSKILLED;
	}
	public void setA1_TOTAL_UNSKILLED(BigDecimal a1_TOTAL_UNSKILLED) {
		A1_TOTAL_UNSKILLED = a1_TOTAL_UNSKILLED;
	}
	public BigDecimal getA1_TOTAL_TOTAL() {
		return A1_TOTAL_TOTAL;
	}
	public void setA1_TOTAL_TOTAL(BigDecimal a1_TOTAL_TOTAL) {
		A1_TOTAL_TOTAL = a1_TOTAL_TOTAL;
	}
	public BigDecimal getA1_TOTAL_ALL_SKILLED() {
		return A1_TOTAL_ALL_SKILLED;
	}
	public void setA1_TOTAL_ALL_SKILLED(BigDecimal a1_TOTAL_ALL_SKILLED) {
		A1_TOTAL_ALL_SKILLED = a1_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA1_TOTAL_ALL_UNSKILLED() {
		return A1_TOTAL_ALL_UNSKILLED;
	}
	public void setA1_TOTAL_ALL_UNSKILLED(BigDecimal a1_TOTAL_ALL_UNSKILLED) {
		A1_TOTAL_ALL_UNSKILLED = a1_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA1_TOTAL_ALL_TOTAL() {
		return A1_TOTAL_ALL_TOTAL;
	}
	public void setA1_TOTAL_ALL_TOTAL(BigDecimal a1_TOTAL_ALL_TOTAL) {
		A1_TOTAL_ALL_TOTAL = a1_TOTAL_ALL_TOTAL;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_KEY_NON_SKILLED() {
		return A2_KEY_NON_SKILLED;
	}
	public void setA2_KEY_NON_SKILLED(BigDecimal a2_KEY_NON_SKILLED) {
		A2_KEY_NON_SKILLED = a2_KEY_NON_SKILLED;
	}
	public BigDecimal getA2_KEY_NON_UNSKILLED() {
		return A2_KEY_NON_UNSKILLED;
	}
	public void setA2_KEY_NON_UNSKILLED(BigDecimal a2_KEY_NON_UNSKILLED) {
		A2_KEY_NON_UNSKILLED = a2_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA2_KEY_NON_TOTAL() {
		return A2_KEY_NON_TOTAL;
	}
	public void setA2_KEY_NON_TOTAL(BigDecimal a2_KEY_NON_TOTAL) {
		A2_KEY_NON_TOTAL = a2_KEY_NON_TOTAL;
	}
	public BigDecimal getA2_OTH_NON_SKILLED() {
		return A2_OTH_NON_SKILLED;
	}
	public void setA2_OTH_NON_SKILLED(BigDecimal a2_OTH_NON_SKILLED) {
		A2_OTH_NON_SKILLED = a2_OTH_NON_SKILLED;
	}
	public BigDecimal getA2_OTH_NON_UNSKILLED() {
		return A2_OTH_NON_UNSKILLED;
	}
	public void setA2_OTH_NON_UNSKILLED(BigDecimal a2_OTH_NON_UNSKILLED) {
		A2_OTH_NON_UNSKILLED = a2_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA2_OTH_NON_TOTAL() {
		return A2_OTH_NON_TOTAL;
	}
	public void setA2_OTH_NON_TOTAL(BigDecimal a2_OTH_NON_TOTAL) {
		A2_OTH_NON_TOTAL = a2_OTH_NON_TOTAL;
	}
	public BigDecimal getA2_TOTAL_NON_SKILLED() {
		return A2_TOTAL_NON_SKILLED;
	}
	public void setA2_TOTAL_NON_SKILLED(BigDecimal a2_TOTAL_NON_SKILLED) {
		A2_TOTAL_NON_SKILLED = a2_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA2_TOTAL_NON_UNSKILLED() {
		return A2_TOTAL_NON_UNSKILLED;
	}
	public void setA2_TOTAL_NON_UNSKILLED(BigDecimal a2_TOTAL_NON_UNSKILLED) {
		A2_TOTAL_NON_UNSKILLED = a2_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA2_TOTAL_NON_TOTAL() {
		return A2_TOTAL_NON_TOTAL;
	}
	public void setA2_TOTAL_NON_TOTAL(BigDecimal a2_TOTAL_NON_TOTAL) {
		A2_TOTAL_NON_TOTAL = a2_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA2_KEY_SKILLED() {
		return A2_KEY_SKILLED;
	}
	public void setA2_KEY_SKILLED(BigDecimal a2_KEY_SKILLED) {
		A2_KEY_SKILLED = a2_KEY_SKILLED;
	}
	public BigDecimal getA2_KEY_UNSKILLED() {
		return A2_KEY_UNSKILLED;
	}
	public void setA2_KEY_UNSKILLED(BigDecimal a2_KEY_UNSKILLED) {
		A2_KEY_UNSKILLED = a2_KEY_UNSKILLED;
	}
	public BigDecimal getA2_KEY_TOTAL() {
		return A2_KEY_TOTAL;
	}
	public void setA2_KEY_TOTAL(BigDecimal a2_KEY_TOTAL) {
		A2_KEY_TOTAL = a2_KEY_TOTAL;
	}
	public BigDecimal getA2_OTH_SKILLED() {
		return A2_OTH_SKILLED;
	}
	public void setA2_OTH_SKILLED(BigDecimal a2_OTH_SKILLED) {
		A2_OTH_SKILLED = a2_OTH_SKILLED;
	}
	public BigDecimal getA2_OTH_UNSKILLED() {
		return A2_OTH_UNSKILLED;
	}
	public void setA2_OTH_UNSKILLED(BigDecimal a2_OTH_UNSKILLED) {
		A2_OTH_UNSKILLED = a2_OTH_UNSKILLED;
	}
	public BigDecimal getA2_OTH_TOTAL() {
		return A2_OTH_TOTAL;
	}
	public void setA2_OTH_TOTAL(BigDecimal a2_OTH_TOTAL) {
		A2_OTH_TOTAL = a2_OTH_TOTAL;
	}
	public BigDecimal getA2_TOTAL_SKILLED() {
		return A2_TOTAL_SKILLED;
	}
	public void setA2_TOTAL_SKILLED(BigDecimal a2_TOTAL_SKILLED) {
		A2_TOTAL_SKILLED = a2_TOTAL_SKILLED;
	}
	public BigDecimal getA2_TOTAL_UNSKILLED() {
		return A2_TOTAL_UNSKILLED;
	}
	public void setA2_TOTAL_UNSKILLED(BigDecimal a2_TOTAL_UNSKILLED) {
		A2_TOTAL_UNSKILLED = a2_TOTAL_UNSKILLED;
	}
	public BigDecimal getA2_TOTAL_TOTAL() {
		return A2_TOTAL_TOTAL;
	}
	public void setA2_TOTAL_TOTAL(BigDecimal a2_TOTAL_TOTAL) {
		A2_TOTAL_TOTAL = a2_TOTAL_TOTAL;
	}
	public BigDecimal getA2_TOTAL_ALL_SKILLED() {
		return A2_TOTAL_ALL_SKILLED;
	}
	public void setA2_TOTAL_ALL_SKILLED(BigDecimal a2_TOTAL_ALL_SKILLED) {
		A2_TOTAL_ALL_SKILLED = a2_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA2_TOTAL_ALL_UNSKILLED() {
		return A2_TOTAL_ALL_UNSKILLED;
	}
	public void setA2_TOTAL_ALL_UNSKILLED(BigDecimal a2_TOTAL_ALL_UNSKILLED) {
		A2_TOTAL_ALL_UNSKILLED = a2_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA2_TOTAL_ALL_TOTAL() {
		return A2_TOTAL_ALL_TOTAL;
	}
	public void setA2_TOTAL_ALL_TOTAL(BigDecimal a2_TOTAL_ALL_TOTAL) {
		A2_TOTAL_ALL_TOTAL = a2_TOTAL_ALL_TOTAL;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_KEY_NON_SKILLED() {
		return A3_KEY_NON_SKILLED;
	}
	public void setA3_KEY_NON_SKILLED(BigDecimal a3_KEY_NON_SKILLED) {
		A3_KEY_NON_SKILLED = a3_KEY_NON_SKILLED;
	}
	public BigDecimal getA3_KEY_NON_UNSKILLED() {
		return A3_KEY_NON_UNSKILLED;
	}
	public void setA3_KEY_NON_UNSKILLED(BigDecimal a3_KEY_NON_UNSKILLED) {
		A3_KEY_NON_UNSKILLED = a3_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA3_KEY_NON_TOTAL() {
		return A3_KEY_NON_TOTAL;
	}
	public void setA3_KEY_NON_TOTAL(BigDecimal a3_KEY_NON_TOTAL) {
		A3_KEY_NON_TOTAL = a3_KEY_NON_TOTAL;
	}
	public BigDecimal getA3_OTH_NON_SKILLED() {
		return A3_OTH_NON_SKILLED;
	}
	public void setA3_OTH_NON_SKILLED(BigDecimal a3_OTH_NON_SKILLED) {
		A3_OTH_NON_SKILLED = a3_OTH_NON_SKILLED;
	}
	public BigDecimal getA3_OTH_NON_UNSKILLED() {
		return A3_OTH_NON_UNSKILLED;
	}
	public void setA3_OTH_NON_UNSKILLED(BigDecimal a3_OTH_NON_UNSKILLED) {
		A3_OTH_NON_UNSKILLED = a3_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA3_OTH_NON_TOTAL() {
		return A3_OTH_NON_TOTAL;
	}
	public void setA3_OTH_NON_TOTAL(BigDecimal a3_OTH_NON_TOTAL) {
		A3_OTH_NON_TOTAL = a3_OTH_NON_TOTAL;
	}
	public BigDecimal getA3_TOTAL_NON_SKILLED() {
		return A3_TOTAL_NON_SKILLED;
	}
	public void setA3_TOTAL_NON_SKILLED(BigDecimal a3_TOTAL_NON_SKILLED) {
		A3_TOTAL_NON_SKILLED = a3_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA3_TOTAL_NON_UNSKILLED() {
		return A3_TOTAL_NON_UNSKILLED;
	}
	public void setA3_TOTAL_NON_UNSKILLED(BigDecimal a3_TOTAL_NON_UNSKILLED) {
		A3_TOTAL_NON_UNSKILLED = a3_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA3_TOTAL_NON_TOTAL() {
		return A3_TOTAL_NON_TOTAL;
	}
	public void setA3_TOTAL_NON_TOTAL(BigDecimal a3_TOTAL_NON_TOTAL) {
		A3_TOTAL_NON_TOTAL = a3_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA3_KEY_SKILLED() {
		return A3_KEY_SKILLED;
	}
	public void setA3_KEY_SKILLED(BigDecimal a3_KEY_SKILLED) {
		A3_KEY_SKILLED = a3_KEY_SKILLED;
	}
	public BigDecimal getA3_KEY_UNSKILLED() {
		return A3_KEY_UNSKILLED;
	}
	public void setA3_KEY_UNSKILLED(BigDecimal a3_KEY_UNSKILLED) {
		A3_KEY_UNSKILLED = a3_KEY_UNSKILLED;
	}
	public BigDecimal getA3_KEY_TOTAL() {
		return A3_KEY_TOTAL;
	}
	public void setA3_KEY_TOTAL(BigDecimal a3_KEY_TOTAL) {
		A3_KEY_TOTAL = a3_KEY_TOTAL;
	}
	public BigDecimal getA3_OTH_SKILLED() {
		return A3_OTH_SKILLED;
	}
	public void setA3_OTH_SKILLED(BigDecimal a3_OTH_SKILLED) {
		A3_OTH_SKILLED = a3_OTH_SKILLED;
	}
	public BigDecimal getA3_OTH_UNSKILLED() {
		return A3_OTH_UNSKILLED;
	}
	public void setA3_OTH_UNSKILLED(BigDecimal a3_OTH_UNSKILLED) {
		A3_OTH_UNSKILLED = a3_OTH_UNSKILLED;
	}
	public BigDecimal getA3_OTH_TOTAL() {
		return A3_OTH_TOTAL;
	}
	public void setA3_OTH_TOTAL(BigDecimal a3_OTH_TOTAL) {
		A3_OTH_TOTAL = a3_OTH_TOTAL;
	}
	public BigDecimal getA3_TOTAL_SKILLED() {
		return A3_TOTAL_SKILLED;
	}
	public void setA3_TOTAL_SKILLED(BigDecimal a3_TOTAL_SKILLED) {
		A3_TOTAL_SKILLED = a3_TOTAL_SKILLED;
	}
	public BigDecimal getA3_TOTAL_UNSKILLED() {
		return A3_TOTAL_UNSKILLED;
	}
	public void setA3_TOTAL_UNSKILLED(BigDecimal a3_TOTAL_UNSKILLED) {
		A3_TOTAL_UNSKILLED = a3_TOTAL_UNSKILLED;
	}
	public BigDecimal getA3_TOTAL_TOTAL() {
		return A3_TOTAL_TOTAL;
	}
	public void setA3_TOTAL_TOTAL(BigDecimal a3_TOTAL_TOTAL) {
		A3_TOTAL_TOTAL = a3_TOTAL_TOTAL;
	}
	public BigDecimal getA3_TOTAL_ALL_SKILLED() {
		return A3_TOTAL_ALL_SKILLED;
	}
	public void setA3_TOTAL_ALL_SKILLED(BigDecimal a3_TOTAL_ALL_SKILLED) {
		A3_TOTAL_ALL_SKILLED = a3_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA3_TOTAL_ALL_UNSKILLED() {
		return A3_TOTAL_ALL_UNSKILLED;
	}
	public void setA3_TOTAL_ALL_UNSKILLED(BigDecimal a3_TOTAL_ALL_UNSKILLED) {
		A3_TOTAL_ALL_UNSKILLED = a3_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA3_TOTAL_ALL_TOTAL() {
		return A3_TOTAL_ALL_TOTAL;
	}
	public void setA3_TOTAL_ALL_TOTAL(BigDecimal a3_TOTAL_ALL_TOTAL) {
		A3_TOTAL_ALL_TOTAL = a3_TOTAL_ALL_TOTAL;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_KEY_NON_SKILLED() {
		return A4_KEY_NON_SKILLED;
	}
	public void setA4_KEY_NON_SKILLED(BigDecimal a4_KEY_NON_SKILLED) {
		A4_KEY_NON_SKILLED = a4_KEY_NON_SKILLED;
	}
	public BigDecimal getA4_KEY_NON_UNSKILLED() {
		return A4_KEY_NON_UNSKILLED;
	}
	public void setA4_KEY_NON_UNSKILLED(BigDecimal a4_KEY_NON_UNSKILLED) {
		A4_KEY_NON_UNSKILLED = a4_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA4_KEY_NON_TOTAL() {
		return A4_KEY_NON_TOTAL;
	}
	public void setA4_KEY_NON_TOTAL(BigDecimal a4_KEY_NON_TOTAL) {
		A4_KEY_NON_TOTAL = a4_KEY_NON_TOTAL;
	}
	public BigDecimal getA4_OTH_NON_SKILLED() {
		return A4_OTH_NON_SKILLED;
	}
	public void setA4_OTH_NON_SKILLED(BigDecimal a4_OTH_NON_SKILLED) {
		A4_OTH_NON_SKILLED = a4_OTH_NON_SKILLED;
	}
	public BigDecimal getA4_OTH_NON_UNSKILLED() {
		return A4_OTH_NON_UNSKILLED;
	}
	public void setA4_OTH_NON_UNSKILLED(BigDecimal a4_OTH_NON_UNSKILLED) {
		A4_OTH_NON_UNSKILLED = a4_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA4_OTH_NON_TOTAL() {
		return A4_OTH_NON_TOTAL;
	}
	public void setA4_OTH_NON_TOTAL(BigDecimal a4_OTH_NON_TOTAL) {
		A4_OTH_NON_TOTAL = a4_OTH_NON_TOTAL;
	}
	public BigDecimal getA4_TOTAL_NON_SKILLED() {
		return A4_TOTAL_NON_SKILLED;
	}
	public void setA4_TOTAL_NON_SKILLED(BigDecimal a4_TOTAL_NON_SKILLED) {
		A4_TOTAL_NON_SKILLED = a4_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA4_TOTAL_NON_UNSKILLED() {
		return A4_TOTAL_NON_UNSKILLED;
	}
	public void setA4_TOTAL_NON_UNSKILLED(BigDecimal a4_TOTAL_NON_UNSKILLED) {
		A4_TOTAL_NON_UNSKILLED = a4_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA4_TOTAL_NON_TOTAL() {
		return A4_TOTAL_NON_TOTAL;
	}
	public void setA4_TOTAL_NON_TOTAL(BigDecimal a4_TOTAL_NON_TOTAL) {
		A4_TOTAL_NON_TOTAL = a4_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA4_KEY_SKILLED() {
		return A4_KEY_SKILLED;
	}
	public void setA4_KEY_SKILLED(BigDecimal a4_KEY_SKILLED) {
		A4_KEY_SKILLED = a4_KEY_SKILLED;
	}
	public BigDecimal getA4_KEY_UNSKILLED() {
		return A4_KEY_UNSKILLED;
	}
	public void setA4_KEY_UNSKILLED(BigDecimal a4_KEY_UNSKILLED) {
		A4_KEY_UNSKILLED = a4_KEY_UNSKILLED;
	}
	public BigDecimal getA4_KEY_TOTAL() {
		return A4_KEY_TOTAL;
	}
	public void setA4_KEY_TOTAL(BigDecimal a4_KEY_TOTAL) {
		A4_KEY_TOTAL = a4_KEY_TOTAL;
	}
	public BigDecimal getA4_OTH_SKILLED() {
		return A4_OTH_SKILLED;
	}
	public void setA4_OTH_SKILLED(BigDecimal a4_OTH_SKILLED) {
		A4_OTH_SKILLED = a4_OTH_SKILLED;
	}
	public BigDecimal getA4_OTH_UNSKILLED() {
		return A4_OTH_UNSKILLED;
	}
	public void setA4_OTH_UNSKILLED(BigDecimal a4_OTH_UNSKILLED) {
		A4_OTH_UNSKILLED = a4_OTH_UNSKILLED;
	}
	public BigDecimal getA4_OTH_TOTAL() {
		return A4_OTH_TOTAL;
	}
	public void setA4_OTH_TOTAL(BigDecimal a4_OTH_TOTAL) {
		A4_OTH_TOTAL = a4_OTH_TOTAL;
	}
	public BigDecimal getA4_TOTAL_SKILLED() {
		return A4_TOTAL_SKILLED;
	}
	public void setA4_TOTAL_SKILLED(BigDecimal a4_TOTAL_SKILLED) {
		A4_TOTAL_SKILLED = a4_TOTAL_SKILLED;
	}
	public BigDecimal getA4_TOTAL_UNSKILLED() {
		return A4_TOTAL_UNSKILLED;
	}
	public void setA4_TOTAL_UNSKILLED(BigDecimal a4_TOTAL_UNSKILLED) {
		A4_TOTAL_UNSKILLED = a4_TOTAL_UNSKILLED;
	}
	public BigDecimal getA4_TOTAL_TOTAL() {
		return A4_TOTAL_TOTAL;
	}
	public void setA4_TOTAL_TOTAL(BigDecimal a4_TOTAL_TOTAL) {
		A4_TOTAL_TOTAL = a4_TOTAL_TOTAL;
	}
	public BigDecimal getA4_TOTAL_ALL_SKILLED() {
		return A4_TOTAL_ALL_SKILLED;
	}
	public void setA4_TOTAL_ALL_SKILLED(BigDecimal a4_TOTAL_ALL_SKILLED) {
		A4_TOTAL_ALL_SKILLED = a4_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA4_TOTAL_ALL_UNSKILLED() {
		return A4_TOTAL_ALL_UNSKILLED;
	}
	public void setA4_TOTAL_ALL_UNSKILLED(BigDecimal a4_TOTAL_ALL_UNSKILLED) {
		A4_TOTAL_ALL_UNSKILLED = a4_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA4_TOTAL_ALL_TOTAL() {
		return A4_TOTAL_ALL_TOTAL;
	}
	public void setA4_TOTAL_ALL_TOTAL(BigDecimal a4_TOTAL_ALL_TOTAL) {
		A4_TOTAL_ALL_TOTAL = a4_TOTAL_ALL_TOTAL;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_KEY_NON_SKILLED() {
		return A5_KEY_NON_SKILLED;
	}
	public void setA5_KEY_NON_SKILLED(BigDecimal a5_KEY_NON_SKILLED) {
		A5_KEY_NON_SKILLED = a5_KEY_NON_SKILLED;
	}
	public BigDecimal getA5_KEY_NON_UNSKILLED() {
		return A5_KEY_NON_UNSKILLED;
	}
	public void setA5_KEY_NON_UNSKILLED(BigDecimal a5_KEY_NON_UNSKILLED) {
		A5_KEY_NON_UNSKILLED = a5_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA5_KEY_NON_TOTAL() {
		return A5_KEY_NON_TOTAL;
	}
	public void setA5_KEY_NON_TOTAL(BigDecimal a5_KEY_NON_TOTAL) {
		A5_KEY_NON_TOTAL = a5_KEY_NON_TOTAL;
	}
	public BigDecimal getA5_OTH_NON_SKILLED() {
		return A5_OTH_NON_SKILLED;
	}
	public void setA5_OTH_NON_SKILLED(BigDecimal a5_OTH_NON_SKILLED) {
		A5_OTH_NON_SKILLED = a5_OTH_NON_SKILLED;
	}
	public BigDecimal getA5_OTH_NON_UNSKILLED() {
		return A5_OTH_NON_UNSKILLED;
	}
	public void setA5_OTH_NON_UNSKILLED(BigDecimal a5_OTH_NON_UNSKILLED) {
		A5_OTH_NON_UNSKILLED = a5_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA5_OTH_NON_TOTAL() {
		return A5_OTH_NON_TOTAL;
	}
	public void setA5_OTH_NON_TOTAL(BigDecimal a5_OTH_NON_TOTAL) {
		A5_OTH_NON_TOTAL = a5_OTH_NON_TOTAL;
	}
	public BigDecimal getA5_TOTAL_NON_SKILLED() {
		return A5_TOTAL_NON_SKILLED;
	}
	public void setA5_TOTAL_NON_SKILLED(BigDecimal a5_TOTAL_NON_SKILLED) {
		A5_TOTAL_NON_SKILLED = a5_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA5_TOTAL_NON_UNSKILLED() {
		return A5_TOTAL_NON_UNSKILLED;
	}
	public void setA5_TOTAL_NON_UNSKILLED(BigDecimal a5_TOTAL_NON_UNSKILLED) {
		A5_TOTAL_NON_UNSKILLED = a5_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA5_TOTAL_NON_TOTAL() {
		return A5_TOTAL_NON_TOTAL;
	}
	public void setA5_TOTAL_NON_TOTAL(BigDecimal a5_TOTAL_NON_TOTAL) {
		A5_TOTAL_NON_TOTAL = a5_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA5_KEY_SKILLED() {
		return A5_KEY_SKILLED;
	}
	public void setA5_KEY_SKILLED(BigDecimal a5_KEY_SKILLED) {
		A5_KEY_SKILLED = a5_KEY_SKILLED;
	}
	public BigDecimal getA5_KEY_UNSKILLED() {
		return A5_KEY_UNSKILLED;
	}
	public void setA5_KEY_UNSKILLED(BigDecimal a5_KEY_UNSKILLED) {
		A5_KEY_UNSKILLED = a5_KEY_UNSKILLED;
	}
	public BigDecimal getA5_KEY_TOTAL() {
		return A5_KEY_TOTAL;
	}
	public void setA5_KEY_TOTAL(BigDecimal a5_KEY_TOTAL) {
		A5_KEY_TOTAL = a5_KEY_TOTAL;
	}
	public BigDecimal getA5_OTH_SKILLED() {
		return A5_OTH_SKILLED;
	}
	public void setA5_OTH_SKILLED(BigDecimal a5_OTH_SKILLED) {
		A5_OTH_SKILLED = a5_OTH_SKILLED;
	}
	public BigDecimal getA5_OTH_UNSKILLED() {
		return A5_OTH_UNSKILLED;
	}
	public void setA5_OTH_UNSKILLED(BigDecimal a5_OTH_UNSKILLED) {
		A5_OTH_UNSKILLED = a5_OTH_UNSKILLED;
	}
	public BigDecimal getA5_OTH_TOTAL() {
		return A5_OTH_TOTAL;
	}
	public void setA5_OTH_TOTAL(BigDecimal a5_OTH_TOTAL) {
		A5_OTH_TOTAL = a5_OTH_TOTAL;
	}
	public BigDecimal getA5_TOTAL_SKILLED() {
		return A5_TOTAL_SKILLED;
	}
	public void setA5_TOTAL_SKILLED(BigDecimal a5_TOTAL_SKILLED) {
		A5_TOTAL_SKILLED = a5_TOTAL_SKILLED;
	}
	public BigDecimal getA5_TOTAL_UNSKILLED() {
		return A5_TOTAL_UNSKILLED;
	}
	public void setA5_TOTAL_UNSKILLED(BigDecimal a5_TOTAL_UNSKILLED) {
		A5_TOTAL_UNSKILLED = a5_TOTAL_UNSKILLED;
	}
	public BigDecimal getA5_TOTAL_TOTAL() {
		return A5_TOTAL_TOTAL;
	}
	public void setA5_TOTAL_TOTAL(BigDecimal a5_TOTAL_TOTAL) {
		A5_TOTAL_TOTAL = a5_TOTAL_TOTAL;
	}
	public BigDecimal getA5_TOTAL_ALL_SKILLED() {
		return A5_TOTAL_ALL_SKILLED;
	}
	public void setA5_TOTAL_ALL_SKILLED(BigDecimal a5_TOTAL_ALL_SKILLED) {
		A5_TOTAL_ALL_SKILLED = a5_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA5_TOTAL_ALL_UNSKILLED() {
		return A5_TOTAL_ALL_UNSKILLED;
	}
	public void setA5_TOTAL_ALL_UNSKILLED(BigDecimal a5_TOTAL_ALL_UNSKILLED) {
		A5_TOTAL_ALL_UNSKILLED = a5_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA5_TOTAL_ALL_TOTAL() {
		return A5_TOTAL_ALL_TOTAL;
	}
	public void setA5_TOTAL_ALL_TOTAL(BigDecimal a5_TOTAL_ALL_TOTAL) {
		A5_TOTAL_ALL_TOTAL = a5_TOTAL_ALL_TOTAL;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_KEY_NON_SKILLED() {
		return A6_KEY_NON_SKILLED;
	}
	public void setA6_KEY_NON_SKILLED(BigDecimal a6_KEY_NON_SKILLED) {
		A6_KEY_NON_SKILLED = a6_KEY_NON_SKILLED;
	}
	public BigDecimal getA6_KEY_NON_UNSKILLED() {
		return A6_KEY_NON_UNSKILLED;
	}
	public void setA6_KEY_NON_UNSKILLED(BigDecimal a6_KEY_NON_UNSKILLED) {
		A6_KEY_NON_UNSKILLED = a6_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA6_KEY_NON_TOTAL() {
		return A6_KEY_NON_TOTAL;
	}
	public void setA6_KEY_NON_TOTAL(BigDecimal a6_KEY_NON_TOTAL) {
		A6_KEY_NON_TOTAL = a6_KEY_NON_TOTAL;
	}
	public BigDecimal getA6_OTH_NON_SKILLED() {
		return A6_OTH_NON_SKILLED;
	}
	public void setA6_OTH_NON_SKILLED(BigDecimal a6_OTH_NON_SKILLED) {
		A6_OTH_NON_SKILLED = a6_OTH_NON_SKILLED;
	}
	public BigDecimal getA6_OTH_NON_UNSKILLED() {
		return A6_OTH_NON_UNSKILLED;
	}
	public void setA6_OTH_NON_UNSKILLED(BigDecimal a6_OTH_NON_UNSKILLED) {
		A6_OTH_NON_UNSKILLED = a6_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA6_OTH_NON_TOTAL() {
		return A6_OTH_NON_TOTAL;
	}
	public void setA6_OTH_NON_TOTAL(BigDecimal a6_OTH_NON_TOTAL) {
		A6_OTH_NON_TOTAL = a6_OTH_NON_TOTAL;
	}
	public BigDecimal getA6_TOTAL_NON_SKILLED() {
		return A6_TOTAL_NON_SKILLED;
	}
	public void setA6_TOTAL_NON_SKILLED(BigDecimal a6_TOTAL_NON_SKILLED) {
		A6_TOTAL_NON_SKILLED = a6_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA6_TOTAL_NON_UNSKILLED() {
		return A6_TOTAL_NON_UNSKILLED;
	}
	public void setA6_TOTAL_NON_UNSKILLED(BigDecimal a6_TOTAL_NON_UNSKILLED) {
		A6_TOTAL_NON_UNSKILLED = a6_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA6_TOTAL_NON_TOTAL() {
		return A6_TOTAL_NON_TOTAL;
	}
	public void setA6_TOTAL_NON_TOTAL(BigDecimal a6_TOTAL_NON_TOTAL) {
		A6_TOTAL_NON_TOTAL = a6_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA6_KEY_SKILLED() {
		return A6_KEY_SKILLED;
	}
	public void setA6_KEY_SKILLED(BigDecimal a6_KEY_SKILLED) {
		A6_KEY_SKILLED = a6_KEY_SKILLED;
	}
	public BigDecimal getA6_KEY_UNSKILLED() {
		return A6_KEY_UNSKILLED;
	}
	public void setA6_KEY_UNSKILLED(BigDecimal a6_KEY_UNSKILLED) {
		A6_KEY_UNSKILLED = a6_KEY_UNSKILLED;
	}
	public BigDecimal getA6_KEY_TOTAL() {
		return A6_KEY_TOTAL;
	}
	public void setA6_KEY_TOTAL(BigDecimal a6_KEY_TOTAL) {
		A6_KEY_TOTAL = a6_KEY_TOTAL;
	}
	public BigDecimal getA6_OTH_SKILLED() {
		return A6_OTH_SKILLED;
	}
	public void setA6_OTH_SKILLED(BigDecimal a6_OTH_SKILLED) {
		A6_OTH_SKILLED = a6_OTH_SKILLED;
	}
	public BigDecimal getA6_OTH_UNSKILLED() {
		return A6_OTH_UNSKILLED;
	}
	public void setA6_OTH_UNSKILLED(BigDecimal a6_OTH_UNSKILLED) {
		A6_OTH_UNSKILLED = a6_OTH_UNSKILLED;
	}
	public BigDecimal getA6_OTH_TOTAL() {
		return A6_OTH_TOTAL;
	}
	public void setA6_OTH_TOTAL(BigDecimal a6_OTH_TOTAL) {
		A6_OTH_TOTAL = a6_OTH_TOTAL;
	}
	public BigDecimal getA6_TOTAL_SKILLED() {
		return A6_TOTAL_SKILLED;
	}
	public void setA6_TOTAL_SKILLED(BigDecimal a6_TOTAL_SKILLED) {
		A6_TOTAL_SKILLED = a6_TOTAL_SKILLED;
	}
	public BigDecimal getA6_TOTAL_UNSKILLED() {
		return A6_TOTAL_UNSKILLED;
	}
	public void setA6_TOTAL_UNSKILLED(BigDecimal a6_TOTAL_UNSKILLED) {
		A6_TOTAL_UNSKILLED = a6_TOTAL_UNSKILLED;
	}
	public BigDecimal getA6_TOTAL_TOTAL() {
		return A6_TOTAL_TOTAL;
	}
	public void setA6_TOTAL_TOTAL(BigDecimal a6_TOTAL_TOTAL) {
		A6_TOTAL_TOTAL = a6_TOTAL_TOTAL;
	}
	public BigDecimal getA6_TOTAL_ALL_SKILLED() {
		return A6_TOTAL_ALL_SKILLED;
	}
	public void setA6_TOTAL_ALL_SKILLED(BigDecimal a6_TOTAL_ALL_SKILLED) {
		A6_TOTAL_ALL_SKILLED = a6_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA6_TOTAL_ALL_UNSKILLED() {
		return A6_TOTAL_ALL_UNSKILLED;
	}
	public void setA6_TOTAL_ALL_UNSKILLED(BigDecimal a6_TOTAL_ALL_UNSKILLED) {
		A6_TOTAL_ALL_UNSKILLED = a6_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA6_TOTAL_ALL_TOTAL() {
		return A6_TOTAL_ALL_TOTAL;
	}
	public void setA6_TOTAL_ALL_TOTAL(BigDecimal a6_TOTAL_ALL_TOTAL) {
		A6_TOTAL_ALL_TOTAL = a6_TOTAL_ALL_TOTAL;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_KEY_NON_SKILLED() {
		return A7_KEY_NON_SKILLED;
	}
	public void setA7_KEY_NON_SKILLED(BigDecimal a7_KEY_NON_SKILLED) {
		A7_KEY_NON_SKILLED = a7_KEY_NON_SKILLED;
	}
	public BigDecimal getA7_KEY_NON_UNSKILLED() {
		return A7_KEY_NON_UNSKILLED;
	}
	public void setA7_KEY_NON_UNSKILLED(BigDecimal a7_KEY_NON_UNSKILLED) {
		A7_KEY_NON_UNSKILLED = a7_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA7_KEY_NON_TOTAL() {
		return A7_KEY_NON_TOTAL;
	}
	public void setA7_KEY_NON_TOTAL(BigDecimal a7_KEY_NON_TOTAL) {
		A7_KEY_NON_TOTAL = a7_KEY_NON_TOTAL;
	}
	public BigDecimal getA7_OTH_NON_SKILLED() {
		return A7_OTH_NON_SKILLED;
	}
	public void setA7_OTH_NON_SKILLED(BigDecimal a7_OTH_NON_SKILLED) {
		A7_OTH_NON_SKILLED = a7_OTH_NON_SKILLED;
	}
	public BigDecimal getA7_OTH_NON_UNSKILLED() {
		return A7_OTH_NON_UNSKILLED;
	}
	public void setA7_OTH_NON_UNSKILLED(BigDecimal a7_OTH_NON_UNSKILLED) {
		A7_OTH_NON_UNSKILLED = a7_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA7_OTH_NON_TOTAL() {
		return A7_OTH_NON_TOTAL;
	}
	public void setA7_OTH_NON_TOTAL(BigDecimal a7_OTH_NON_TOTAL) {
		A7_OTH_NON_TOTAL = a7_OTH_NON_TOTAL;
	}
	public BigDecimal getA7_TOTAL_NON_SKILLED() {
		return A7_TOTAL_NON_SKILLED;
	}
	public void setA7_TOTAL_NON_SKILLED(BigDecimal a7_TOTAL_NON_SKILLED) {
		A7_TOTAL_NON_SKILLED = a7_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA7_TOTAL_NON_UNSKILLED() {
		return A7_TOTAL_NON_UNSKILLED;
	}
	public void setA7_TOTAL_NON_UNSKILLED(BigDecimal a7_TOTAL_NON_UNSKILLED) {
		A7_TOTAL_NON_UNSKILLED = a7_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA7_TOTAL_NON_TOTAL() {
		return A7_TOTAL_NON_TOTAL;
	}
	public void setA7_TOTAL_NON_TOTAL(BigDecimal a7_TOTAL_NON_TOTAL) {
		A7_TOTAL_NON_TOTAL = a7_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA7_KEY_SKILLED() {
		return A7_KEY_SKILLED;
	}
	public void setA7_KEY_SKILLED(BigDecimal a7_KEY_SKILLED) {
		A7_KEY_SKILLED = a7_KEY_SKILLED;
	}
	public BigDecimal getA7_KEY_UNSKILLED() {
		return A7_KEY_UNSKILLED;
	}
	public void setA7_KEY_UNSKILLED(BigDecimal a7_KEY_UNSKILLED) {
		A7_KEY_UNSKILLED = a7_KEY_UNSKILLED;
	}
	public BigDecimal getA7_KEY_TOTAL() {
		return A7_KEY_TOTAL;
	}
	public void setA7_KEY_TOTAL(BigDecimal a7_KEY_TOTAL) {
		A7_KEY_TOTAL = a7_KEY_TOTAL;
	}
	public BigDecimal getA7_OTH_SKILLED() {
		return A7_OTH_SKILLED;
	}
	public void setA7_OTH_SKILLED(BigDecimal a7_OTH_SKILLED) {
		A7_OTH_SKILLED = a7_OTH_SKILLED;
	}
	public BigDecimal getA7_OTH_UNSKILLED() {
		return A7_OTH_UNSKILLED;
	}
	public void setA7_OTH_UNSKILLED(BigDecimal a7_OTH_UNSKILLED) {
		A7_OTH_UNSKILLED = a7_OTH_UNSKILLED;
	}
	public BigDecimal getA7_OTH_TOTAL() {
		return A7_OTH_TOTAL;
	}
	public void setA7_OTH_TOTAL(BigDecimal a7_OTH_TOTAL) {
		A7_OTH_TOTAL = a7_OTH_TOTAL;
	}
	public BigDecimal getA7_TOTAL_SKILLED() {
		return A7_TOTAL_SKILLED;
	}
	public void setA7_TOTAL_SKILLED(BigDecimal a7_TOTAL_SKILLED) {
		A7_TOTAL_SKILLED = a7_TOTAL_SKILLED;
	}
	public BigDecimal getA7_TOTAL_UNSKILLED() {
		return A7_TOTAL_UNSKILLED;
	}
	public void setA7_TOTAL_UNSKILLED(BigDecimal a7_TOTAL_UNSKILLED) {
		A7_TOTAL_UNSKILLED = a7_TOTAL_UNSKILLED;
	}
	public BigDecimal getA7_TOTAL_TOTAL() {
		return A7_TOTAL_TOTAL;
	}
	public void setA7_TOTAL_TOTAL(BigDecimal a7_TOTAL_TOTAL) {
		A7_TOTAL_TOTAL = a7_TOTAL_TOTAL;
	}
	public BigDecimal getA7_TOTAL_ALL_SKILLED() {
		return A7_TOTAL_ALL_SKILLED;
	}
	public void setA7_TOTAL_ALL_SKILLED(BigDecimal a7_TOTAL_ALL_SKILLED) {
		A7_TOTAL_ALL_SKILLED = a7_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA7_TOTAL_ALL_UNSKILLED() {
		return A7_TOTAL_ALL_UNSKILLED;
	}
	public void setA7_TOTAL_ALL_UNSKILLED(BigDecimal a7_TOTAL_ALL_UNSKILLED) {
		A7_TOTAL_ALL_UNSKILLED = a7_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA7_TOTAL_ALL_TOTAL() {
		return A7_TOTAL_ALL_TOTAL;
	}
	public void setA7_TOTAL_ALL_TOTAL(BigDecimal a7_TOTAL_ALL_TOTAL) {
		A7_TOTAL_ALL_TOTAL = a7_TOTAL_ALL_TOTAL;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_KEY_NON_SKILLED() {
		return A8_KEY_NON_SKILLED;
	}
	public void setA8_KEY_NON_SKILLED(BigDecimal a8_KEY_NON_SKILLED) {
		A8_KEY_NON_SKILLED = a8_KEY_NON_SKILLED;
	}
	public BigDecimal getA8_KEY_NON_UNSKILLED() {
		return A8_KEY_NON_UNSKILLED;
	}
	public void setA8_KEY_NON_UNSKILLED(BigDecimal a8_KEY_NON_UNSKILLED) {
		A8_KEY_NON_UNSKILLED = a8_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA8_KEY_NON_TOTAL() {
		return A8_KEY_NON_TOTAL;
	}
	public void setA8_KEY_NON_TOTAL(BigDecimal a8_KEY_NON_TOTAL) {
		A8_KEY_NON_TOTAL = a8_KEY_NON_TOTAL;
	}
	public BigDecimal getA8_OTH_NON_SKILLED() {
		return A8_OTH_NON_SKILLED;
	}
	public void setA8_OTH_NON_SKILLED(BigDecimal a8_OTH_NON_SKILLED) {
		A8_OTH_NON_SKILLED = a8_OTH_NON_SKILLED;
	}
	public BigDecimal getA8_OTH_NON_UNSKILLED() {
		return A8_OTH_NON_UNSKILLED;
	}
	public void setA8_OTH_NON_UNSKILLED(BigDecimal a8_OTH_NON_UNSKILLED) {
		A8_OTH_NON_UNSKILLED = a8_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA8_OTH_NON_TOTAL() {
		return A8_OTH_NON_TOTAL;
	}
	public void setA8_OTH_NON_TOTAL(BigDecimal a8_OTH_NON_TOTAL) {
		A8_OTH_NON_TOTAL = a8_OTH_NON_TOTAL;
	}
	public BigDecimal getA8_TOTAL_NON_SKILLED() {
		return A8_TOTAL_NON_SKILLED;
	}
	public void setA8_TOTAL_NON_SKILLED(BigDecimal a8_TOTAL_NON_SKILLED) {
		A8_TOTAL_NON_SKILLED = a8_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA8_TOTAL_NON_UNSKILLED() {
		return A8_TOTAL_NON_UNSKILLED;
	}
	public void setA8_TOTAL_NON_UNSKILLED(BigDecimal a8_TOTAL_NON_UNSKILLED) {
		A8_TOTAL_NON_UNSKILLED = a8_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA8_TOTAL_NON_TOTAL() {
		return A8_TOTAL_NON_TOTAL;
	}
	public void setA8_TOTAL_NON_TOTAL(BigDecimal a8_TOTAL_NON_TOTAL) {
		A8_TOTAL_NON_TOTAL = a8_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA8_KEY_SKILLED() {
		return A8_KEY_SKILLED;
	}
	public void setA8_KEY_SKILLED(BigDecimal a8_KEY_SKILLED) {
		A8_KEY_SKILLED = a8_KEY_SKILLED;
	}
	public BigDecimal getA8_KEY_UNSKILLED() {
		return A8_KEY_UNSKILLED;
	}
	public void setA8_KEY_UNSKILLED(BigDecimal a8_KEY_UNSKILLED) {
		A8_KEY_UNSKILLED = a8_KEY_UNSKILLED;
	}
	public BigDecimal getA8_KEY_TOTAL() {
		return A8_KEY_TOTAL;
	}
	public void setA8_KEY_TOTAL(BigDecimal a8_KEY_TOTAL) {
		A8_KEY_TOTAL = a8_KEY_TOTAL;
	}
	public BigDecimal getA8_OTH_SKILLED() {
		return A8_OTH_SKILLED;
	}
	public void setA8_OTH_SKILLED(BigDecimal a8_OTH_SKILLED) {
		A8_OTH_SKILLED = a8_OTH_SKILLED;
	}
	public BigDecimal getA8_OTH_UNSKILLED() {
		return A8_OTH_UNSKILLED;
	}
	public void setA8_OTH_UNSKILLED(BigDecimal a8_OTH_UNSKILLED) {
		A8_OTH_UNSKILLED = a8_OTH_UNSKILLED;
	}
	public BigDecimal getA8_OTH_TOTAL() {
		return A8_OTH_TOTAL;
	}
	public void setA8_OTH_TOTAL(BigDecimal a8_OTH_TOTAL) {
		A8_OTH_TOTAL = a8_OTH_TOTAL;
	}
	public BigDecimal getA8_TOTAL_SKILLED() {
		return A8_TOTAL_SKILLED;
	}
	public void setA8_TOTAL_SKILLED(BigDecimal a8_TOTAL_SKILLED) {
		A8_TOTAL_SKILLED = a8_TOTAL_SKILLED;
	}
	public BigDecimal getA8_TOTAL_UNSKILLED() {
		return A8_TOTAL_UNSKILLED;
	}
	public void setA8_TOTAL_UNSKILLED(BigDecimal a8_TOTAL_UNSKILLED) {
		A8_TOTAL_UNSKILLED = a8_TOTAL_UNSKILLED;
	}
	public BigDecimal getA8_TOTAL_TOTAL() {
		return A8_TOTAL_TOTAL;
	}
	public void setA8_TOTAL_TOTAL(BigDecimal a8_TOTAL_TOTAL) {
		A8_TOTAL_TOTAL = a8_TOTAL_TOTAL;
	}
	public BigDecimal getA8_TOTAL_ALL_SKILLED() {
		return A8_TOTAL_ALL_SKILLED;
	}
	public void setA8_TOTAL_ALL_SKILLED(BigDecimal a8_TOTAL_ALL_SKILLED) {
		A8_TOTAL_ALL_SKILLED = a8_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA8_TOTAL_ALL_UNSKILLED() {
		return A8_TOTAL_ALL_UNSKILLED;
	}
	public void setA8_TOTAL_ALL_UNSKILLED(BigDecimal a8_TOTAL_ALL_UNSKILLED) {
		A8_TOTAL_ALL_UNSKILLED = a8_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA8_TOTAL_ALL_TOTAL() {
		return A8_TOTAL_ALL_TOTAL;
	}
	public void setA8_TOTAL_ALL_TOTAL(BigDecimal a8_TOTAL_ALL_TOTAL) {
		A8_TOTAL_ALL_TOTAL = a8_TOTAL_ALL_TOTAL;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_KEY_NON_SKILLED() {
		return A9_KEY_NON_SKILLED;
	}
	public void setA9_KEY_NON_SKILLED(BigDecimal a9_KEY_NON_SKILLED) {
		A9_KEY_NON_SKILLED = a9_KEY_NON_SKILLED;
	}
	public BigDecimal getA9_KEY_NON_UNSKILLED() {
		return A9_KEY_NON_UNSKILLED;
	}
	public void setA9_KEY_NON_UNSKILLED(BigDecimal a9_KEY_NON_UNSKILLED) {
		A9_KEY_NON_UNSKILLED = a9_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA9_KEY_NON_TOTAL() {
		return A9_KEY_NON_TOTAL;
	}
	public void setA9_KEY_NON_TOTAL(BigDecimal a9_KEY_NON_TOTAL) {
		A9_KEY_NON_TOTAL = a9_KEY_NON_TOTAL;
	}
	public BigDecimal getA9_OTH_NON_SKILLED() {
		return A9_OTH_NON_SKILLED;
	}
	public void setA9_OTH_NON_SKILLED(BigDecimal a9_OTH_NON_SKILLED) {
		A9_OTH_NON_SKILLED = a9_OTH_NON_SKILLED;
	}
	public BigDecimal getA9_OTH_NON_UNSKILLED() {
		return A9_OTH_NON_UNSKILLED;
	}
	public void setA9_OTH_NON_UNSKILLED(BigDecimal a9_OTH_NON_UNSKILLED) {
		A9_OTH_NON_UNSKILLED = a9_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA9_OTH_NON_TOTAL() {
		return A9_OTH_NON_TOTAL;
	}
	public void setA9_OTH_NON_TOTAL(BigDecimal a9_OTH_NON_TOTAL) {
		A9_OTH_NON_TOTAL = a9_OTH_NON_TOTAL;
	}
	public BigDecimal getA9_TOTAL_NON_SKILLED() {
		return A9_TOTAL_NON_SKILLED;
	}
	public void setA9_TOTAL_NON_SKILLED(BigDecimal a9_TOTAL_NON_SKILLED) {
		A9_TOTAL_NON_SKILLED = a9_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA9_TOTAL_NON_UNSKILLED() {
		return A9_TOTAL_NON_UNSKILLED;
	}
	public void setA9_TOTAL_NON_UNSKILLED(BigDecimal a9_TOTAL_NON_UNSKILLED) {
		A9_TOTAL_NON_UNSKILLED = a9_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA9_TOTAL_NON_TOTAL() {
		return A9_TOTAL_NON_TOTAL;
	}
	public void setA9_TOTAL_NON_TOTAL(BigDecimal a9_TOTAL_NON_TOTAL) {
		A9_TOTAL_NON_TOTAL = a9_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA9_KEY_SKILLED() {
		return A9_KEY_SKILLED;
	}
	public void setA9_KEY_SKILLED(BigDecimal a9_KEY_SKILLED) {
		A9_KEY_SKILLED = a9_KEY_SKILLED;
	}
	public BigDecimal getA9_KEY_UNSKILLED() {
		return A9_KEY_UNSKILLED;
	}
	public void setA9_KEY_UNSKILLED(BigDecimal a9_KEY_UNSKILLED) {
		A9_KEY_UNSKILLED = a9_KEY_UNSKILLED;
	}
	public BigDecimal getA9_KEY_TOTAL() {
		return A9_KEY_TOTAL;
	}
	public void setA9_KEY_TOTAL(BigDecimal a9_KEY_TOTAL) {
		A9_KEY_TOTAL = a9_KEY_TOTAL;
	}
	public BigDecimal getA9_OTH_SKILLED() {
		return A9_OTH_SKILLED;
	}
	public void setA9_OTH_SKILLED(BigDecimal a9_OTH_SKILLED) {
		A9_OTH_SKILLED = a9_OTH_SKILLED;
	}
	public BigDecimal getA9_OTH_UNSKILLED() {
		return A9_OTH_UNSKILLED;
	}
	public void setA9_OTH_UNSKILLED(BigDecimal a9_OTH_UNSKILLED) {
		A9_OTH_UNSKILLED = a9_OTH_UNSKILLED;
	}
	public BigDecimal getA9_OTH_TOTAL() {
		return A9_OTH_TOTAL;
	}
	public void setA9_OTH_TOTAL(BigDecimal a9_OTH_TOTAL) {
		A9_OTH_TOTAL = a9_OTH_TOTAL;
	}
	public BigDecimal getA9_TOTAL_SKILLED() {
		return A9_TOTAL_SKILLED;
	}
	public void setA9_TOTAL_SKILLED(BigDecimal a9_TOTAL_SKILLED) {
		A9_TOTAL_SKILLED = a9_TOTAL_SKILLED;
	}
	public BigDecimal getA9_TOTAL_UNSKILLED() {
		return A9_TOTAL_UNSKILLED;
	}
	public void setA9_TOTAL_UNSKILLED(BigDecimal a9_TOTAL_UNSKILLED) {
		A9_TOTAL_UNSKILLED = a9_TOTAL_UNSKILLED;
	}
	public BigDecimal getA9_TOTAL_TOTAL() {
		return A9_TOTAL_TOTAL;
	}
	public void setA9_TOTAL_TOTAL(BigDecimal a9_TOTAL_TOTAL) {
		A9_TOTAL_TOTAL = a9_TOTAL_TOTAL;
	}
	public BigDecimal getA9_TOTAL_ALL_SKILLED() {
		return A9_TOTAL_ALL_SKILLED;
	}
	public void setA9_TOTAL_ALL_SKILLED(BigDecimal a9_TOTAL_ALL_SKILLED) {
		A9_TOTAL_ALL_SKILLED = a9_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA9_TOTAL_ALL_UNSKILLED() {
		return A9_TOTAL_ALL_UNSKILLED;
	}
	public void setA9_TOTAL_ALL_UNSKILLED(BigDecimal a9_TOTAL_ALL_UNSKILLED) {
		A9_TOTAL_ALL_UNSKILLED = a9_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA9_TOTAL_ALL_TOTAL() {
		return A9_TOTAL_ALL_TOTAL;
	}
	public void setA9_TOTAL_ALL_TOTAL(BigDecimal a9_TOTAL_ALL_TOTAL) {
		A9_TOTAL_ALL_TOTAL = a9_TOTAL_ALL_TOTAL;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10_KEY_NON_SKILLED() {
		return A10_KEY_NON_SKILLED;
	}
	public void setA10_KEY_NON_SKILLED(BigDecimal a10_KEY_NON_SKILLED) {
		A10_KEY_NON_SKILLED = a10_KEY_NON_SKILLED;
	}
	public BigDecimal getA10_KEY_NON_UNSKILLED() {
		return A10_KEY_NON_UNSKILLED;
	}
	public void setA10_KEY_NON_UNSKILLED(BigDecimal a10_KEY_NON_UNSKILLED) {
		A10_KEY_NON_UNSKILLED = a10_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA10_KEY_NON_TOTAL() {
		return A10_KEY_NON_TOTAL;
	}
	public void setA10_KEY_NON_TOTAL(BigDecimal a10_KEY_NON_TOTAL) {
		A10_KEY_NON_TOTAL = a10_KEY_NON_TOTAL;
	}
	public BigDecimal getA10_OTH_NON_SKILLED() {
		return A10_OTH_NON_SKILLED;
	}
	public void setA10_OTH_NON_SKILLED(BigDecimal a10_OTH_NON_SKILLED) {
		A10_OTH_NON_SKILLED = a10_OTH_NON_SKILLED;
	}
	public BigDecimal getA10_OTH_NON_UNSKILLED() {
		return A10_OTH_NON_UNSKILLED;
	}
	public void setA10_OTH_NON_UNSKILLED(BigDecimal a10_OTH_NON_UNSKILLED) {
		A10_OTH_NON_UNSKILLED = a10_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA10_OTH_NON_TOTAL() {
		return A10_OTH_NON_TOTAL;
	}
	public void setA10_OTH_NON_TOTAL(BigDecimal a10_OTH_NON_TOTAL) {
		A10_OTH_NON_TOTAL = a10_OTH_NON_TOTAL;
	}
	public BigDecimal getA10_TOTAL_NON_SKILLED() {
		return A10_TOTAL_NON_SKILLED;
	}
	public void setA10_TOTAL_NON_SKILLED(BigDecimal a10_TOTAL_NON_SKILLED) {
		A10_TOTAL_NON_SKILLED = a10_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA10_TOTAL_NON_UNSKILLED() {
		return A10_TOTAL_NON_UNSKILLED;
	}
	public void setA10_TOTAL_NON_UNSKILLED(BigDecimal a10_TOTAL_NON_UNSKILLED) {
		A10_TOTAL_NON_UNSKILLED = a10_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA10_TOTAL_NON_TOTAL() {
		return A10_TOTAL_NON_TOTAL;
	}
	public void setA10_TOTAL_NON_TOTAL(BigDecimal a10_TOTAL_NON_TOTAL) {
		A10_TOTAL_NON_TOTAL = a10_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA10_KEY_SKILLED() {
		return A10_KEY_SKILLED;
	}
	public void setA10_KEY_SKILLED(BigDecimal a10_KEY_SKILLED) {
		A10_KEY_SKILLED = a10_KEY_SKILLED;
	}
	public BigDecimal getA10_KEY_UNSKILLED() {
		return A10_KEY_UNSKILLED;
	}
	public void setA10_KEY_UNSKILLED(BigDecimal a10_KEY_UNSKILLED) {
		A10_KEY_UNSKILLED = a10_KEY_UNSKILLED;
	}
	public BigDecimal getA10_KEY_TOTAL() {
		return A10_KEY_TOTAL;
	}
	public void setA10_KEY_TOTAL(BigDecimal a10_KEY_TOTAL) {
		A10_KEY_TOTAL = a10_KEY_TOTAL;
	}
	public BigDecimal getA10_OTH_SKILLED() {
		return A10_OTH_SKILLED;
	}
	public void setA10_OTH_SKILLED(BigDecimal a10_OTH_SKILLED) {
		A10_OTH_SKILLED = a10_OTH_SKILLED;
	}
	public BigDecimal getA10_OTH_UNSKILLED() {
		return A10_OTH_UNSKILLED;
	}
	public void setA10_OTH_UNSKILLED(BigDecimal a10_OTH_UNSKILLED) {
		A10_OTH_UNSKILLED = a10_OTH_UNSKILLED;
	}
	public BigDecimal getA10_OTH_TOTAL() {
		return A10_OTH_TOTAL;
	}
	public void setA10_OTH_TOTAL(BigDecimal a10_OTH_TOTAL) {
		A10_OTH_TOTAL = a10_OTH_TOTAL;
	}
	public BigDecimal getA10_TOTAL_SKILLED() {
		return A10_TOTAL_SKILLED;
	}
	public void setA10_TOTAL_SKILLED(BigDecimal a10_TOTAL_SKILLED) {
		A10_TOTAL_SKILLED = a10_TOTAL_SKILLED;
	}
	public BigDecimal getA10_TOTAL_UNSKILLED() {
		return A10_TOTAL_UNSKILLED;
	}
	public void setA10_TOTAL_UNSKILLED(BigDecimal a10_TOTAL_UNSKILLED) {
		A10_TOTAL_UNSKILLED = a10_TOTAL_UNSKILLED;
	}
	public BigDecimal getA10_TOTAL_TOTAL() {
		return A10_TOTAL_TOTAL;
	}
	public void setA10_TOTAL_TOTAL(BigDecimal a10_TOTAL_TOTAL) {
		A10_TOTAL_TOTAL = a10_TOTAL_TOTAL;
	}
	public BigDecimal getA10_TOTAL_ALL_SKILLED() {
		return A10_TOTAL_ALL_SKILLED;
	}
	public void setA10_TOTAL_ALL_SKILLED(BigDecimal a10_TOTAL_ALL_SKILLED) {
		A10_TOTAL_ALL_SKILLED = a10_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA10_TOTAL_ALL_UNSKILLED() {
		return A10_TOTAL_ALL_UNSKILLED;
	}
	public void setA10_TOTAL_ALL_UNSKILLED(BigDecimal a10_TOTAL_ALL_UNSKILLED) {
		A10_TOTAL_ALL_UNSKILLED = a10_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA10_TOTAL_ALL_TOTAL() {
		return A10_TOTAL_ALL_TOTAL;
	}
	public void setA10_TOTAL_ALL_TOTAL(BigDecimal a10_TOTAL_ALL_TOTAL) {
		A10_TOTAL_ALL_TOTAL = a10_TOTAL_ALL_TOTAL;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_KEY_NON_SKILLED() {
		return A11_KEY_NON_SKILLED;
	}
	public void setA11_KEY_NON_SKILLED(BigDecimal a11_KEY_NON_SKILLED) {
		A11_KEY_NON_SKILLED = a11_KEY_NON_SKILLED;
	}
	public BigDecimal getA11_KEY_NON_UNSKILLED() {
		return A11_KEY_NON_UNSKILLED;
	}
	public void setA11_KEY_NON_UNSKILLED(BigDecimal a11_KEY_NON_UNSKILLED) {
		A11_KEY_NON_UNSKILLED = a11_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA11_KEY_NON_TOTAL() {
		return A11_KEY_NON_TOTAL;
	}
	public void setA11_KEY_NON_TOTAL(BigDecimal a11_KEY_NON_TOTAL) {
		A11_KEY_NON_TOTAL = a11_KEY_NON_TOTAL;
	}
	public BigDecimal getA11_OTH_NON_SKILLED() {
		return A11_OTH_NON_SKILLED;
	}
	public void setA11_OTH_NON_SKILLED(BigDecimal a11_OTH_NON_SKILLED) {
		A11_OTH_NON_SKILLED = a11_OTH_NON_SKILLED;
	}
	public BigDecimal getA11_OTH_NON_UNSKILLED() {
		return A11_OTH_NON_UNSKILLED;
	}
	public void setA11_OTH_NON_UNSKILLED(BigDecimal a11_OTH_NON_UNSKILLED) {
		A11_OTH_NON_UNSKILLED = a11_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA11_OTH_NON_TOTAL() {
		return A11_OTH_NON_TOTAL;
	}
	public void setA11_OTH_NON_TOTAL(BigDecimal a11_OTH_NON_TOTAL) {
		A11_OTH_NON_TOTAL = a11_OTH_NON_TOTAL;
	}
	public BigDecimal getA11_TOTAL_NON_SKILLED() {
		return A11_TOTAL_NON_SKILLED;
	}
	public void setA11_TOTAL_NON_SKILLED(BigDecimal a11_TOTAL_NON_SKILLED) {
		A11_TOTAL_NON_SKILLED = a11_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA11_TOTAL_NON_UNSKILLED() {
		return A11_TOTAL_NON_UNSKILLED;
	}
	public void setA11_TOTAL_NON_UNSKILLED(BigDecimal a11_TOTAL_NON_UNSKILLED) {
		A11_TOTAL_NON_UNSKILLED = a11_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA11_TOTAL_NON_TOTAL() {
		return A11_TOTAL_NON_TOTAL;
	}
	public void setA11_TOTAL_NON_TOTAL(BigDecimal a11_TOTAL_NON_TOTAL) {
		A11_TOTAL_NON_TOTAL = a11_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA11_KEY_SKILLED() {
		return A11_KEY_SKILLED;
	}
	public void setA11_KEY_SKILLED(BigDecimal a11_KEY_SKILLED) {
		A11_KEY_SKILLED = a11_KEY_SKILLED;
	}
	public BigDecimal getA11_KEY_UNSKILLED() {
		return A11_KEY_UNSKILLED;
	}
	public void setA11_KEY_UNSKILLED(BigDecimal a11_KEY_UNSKILLED) {
		A11_KEY_UNSKILLED = a11_KEY_UNSKILLED;
	}
	public BigDecimal getA11_KEY_TOTAL() {
		return A11_KEY_TOTAL;
	}
	public void setA11_KEY_TOTAL(BigDecimal a11_KEY_TOTAL) {
		A11_KEY_TOTAL = a11_KEY_TOTAL;
	}
	public BigDecimal getA11_OTH_SKILLED() {
		return A11_OTH_SKILLED;
	}
	public void setA11_OTH_SKILLED(BigDecimal a11_OTH_SKILLED) {
		A11_OTH_SKILLED = a11_OTH_SKILLED;
	}
	public BigDecimal getA11_OTH_UNSKILLED() {
		return A11_OTH_UNSKILLED;
	}
	public void setA11_OTH_UNSKILLED(BigDecimal a11_OTH_UNSKILLED) {
		A11_OTH_UNSKILLED = a11_OTH_UNSKILLED;
	}
	public BigDecimal getA11_OTH_TOTAL() {
		return A11_OTH_TOTAL;
	}
	public void setA11_OTH_TOTAL(BigDecimal a11_OTH_TOTAL) {
		A11_OTH_TOTAL = a11_OTH_TOTAL;
	}
	public BigDecimal getA11_TOTAL_SKILLED() {
		return A11_TOTAL_SKILLED;
	}
	public void setA11_TOTAL_SKILLED(BigDecimal a11_TOTAL_SKILLED) {
		A11_TOTAL_SKILLED = a11_TOTAL_SKILLED;
	}
	public BigDecimal getA11_TOTAL_UNSKILLED() {
		return A11_TOTAL_UNSKILLED;
	}
	public void setA11_TOTAL_UNSKILLED(BigDecimal a11_TOTAL_UNSKILLED) {
		A11_TOTAL_UNSKILLED = a11_TOTAL_UNSKILLED;
	}
	public BigDecimal getA11_TOTAL_TOTAL() {
		return A11_TOTAL_TOTAL;
	}
	public void setA11_TOTAL_TOTAL(BigDecimal a11_TOTAL_TOTAL) {
		A11_TOTAL_TOTAL = a11_TOTAL_TOTAL;
	}
	public BigDecimal getA11_TOTAL_ALL_SKILLED() {
		return A11_TOTAL_ALL_SKILLED;
	}
	public void setA11_TOTAL_ALL_SKILLED(BigDecimal a11_TOTAL_ALL_SKILLED) {
		A11_TOTAL_ALL_SKILLED = a11_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA11_TOTAL_ALL_UNSKILLED() {
		return A11_TOTAL_ALL_UNSKILLED;
	}
	public void setA11_TOTAL_ALL_UNSKILLED(BigDecimal a11_TOTAL_ALL_UNSKILLED) {
		A11_TOTAL_ALL_UNSKILLED = a11_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA11_TOTAL_ALL_TOTAL() {
		return A11_TOTAL_ALL_TOTAL;
	}
	public void setA11_TOTAL_ALL_TOTAL(BigDecimal a11_TOTAL_ALL_TOTAL) {
		A11_TOTAL_ALL_TOTAL = a11_TOTAL_ALL_TOTAL;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_KEY_NON_SKILLED() {
		return A12_KEY_NON_SKILLED;
	}
	public void setA12_KEY_NON_SKILLED(BigDecimal a12_KEY_NON_SKILLED) {
		A12_KEY_NON_SKILLED = a12_KEY_NON_SKILLED;
	}
	public BigDecimal getA12_KEY_NON_UNSKILLED() {
		return A12_KEY_NON_UNSKILLED;
	}
	public void setA12_KEY_NON_UNSKILLED(BigDecimal a12_KEY_NON_UNSKILLED) {
		A12_KEY_NON_UNSKILLED = a12_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA12_KEY_NON_TOTAL() {
		return A12_KEY_NON_TOTAL;
	}
	public void setA12_KEY_NON_TOTAL(BigDecimal a12_KEY_NON_TOTAL) {
		A12_KEY_NON_TOTAL = a12_KEY_NON_TOTAL;
	}
	public BigDecimal getA12_OTH_NON_SKILLED() {
		return A12_OTH_NON_SKILLED;
	}
	public void setA12_OTH_NON_SKILLED(BigDecimal a12_OTH_NON_SKILLED) {
		A12_OTH_NON_SKILLED = a12_OTH_NON_SKILLED;
	}
	public BigDecimal getA12_OTH_NON_UNSKILLED() {
		return A12_OTH_NON_UNSKILLED;
	}
	public void setA12_OTH_NON_UNSKILLED(BigDecimal a12_OTH_NON_UNSKILLED) {
		A12_OTH_NON_UNSKILLED = a12_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA12_OTH_NON_TOTAL() {
		return A12_OTH_NON_TOTAL;
	}
	public void setA12_OTH_NON_TOTAL(BigDecimal a12_OTH_NON_TOTAL) {
		A12_OTH_NON_TOTAL = a12_OTH_NON_TOTAL;
	}
	public BigDecimal getA12_TOTAL_NON_SKILLED() {
		return A12_TOTAL_NON_SKILLED;
	}
	public void setA12_TOTAL_NON_SKILLED(BigDecimal a12_TOTAL_NON_SKILLED) {
		A12_TOTAL_NON_SKILLED = a12_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA12_TOTAL_NON_UNSKILLED() {
		return A12_TOTAL_NON_UNSKILLED;
	}
	public void setA12_TOTAL_NON_UNSKILLED(BigDecimal a12_TOTAL_NON_UNSKILLED) {
		A12_TOTAL_NON_UNSKILLED = a12_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA12_TOTAL_NON_TOTAL() {
		return A12_TOTAL_NON_TOTAL;
	}
	public void setA12_TOTAL_NON_TOTAL(BigDecimal a12_TOTAL_NON_TOTAL) {
		A12_TOTAL_NON_TOTAL = a12_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA12_KEY_SKILLED() {
		return A12_KEY_SKILLED;
	}
	public void setA12_KEY_SKILLED(BigDecimal a12_KEY_SKILLED) {
		A12_KEY_SKILLED = a12_KEY_SKILLED;
	}
	public BigDecimal getA12_KEY_UNSKILLED() {
		return A12_KEY_UNSKILLED;
	}
	public void setA12_KEY_UNSKILLED(BigDecimal a12_KEY_UNSKILLED) {
		A12_KEY_UNSKILLED = a12_KEY_UNSKILLED;
	}
	public BigDecimal getA12_KEY_TOTAL() {
		return A12_KEY_TOTAL;
	}
	public void setA12_KEY_TOTAL(BigDecimal a12_KEY_TOTAL) {
		A12_KEY_TOTAL = a12_KEY_TOTAL;
	}
	public BigDecimal getA12_OTH_SKILLED() {
		return A12_OTH_SKILLED;
	}
	public void setA12_OTH_SKILLED(BigDecimal a12_OTH_SKILLED) {
		A12_OTH_SKILLED = a12_OTH_SKILLED;
	}
	public BigDecimal getA12_OTH_UNSKILLED() {
		return A12_OTH_UNSKILLED;
	}
	public void setA12_OTH_UNSKILLED(BigDecimal a12_OTH_UNSKILLED) {
		A12_OTH_UNSKILLED = a12_OTH_UNSKILLED;
	}
	public BigDecimal getA12_OTH_TOTAL() {
		return A12_OTH_TOTAL;
	}
	public void setA12_OTH_TOTAL(BigDecimal a12_OTH_TOTAL) {
		A12_OTH_TOTAL = a12_OTH_TOTAL;
	}
	public BigDecimal getA12_TOTAL_SKILLED() {
		return A12_TOTAL_SKILLED;
	}
	public void setA12_TOTAL_SKILLED(BigDecimal a12_TOTAL_SKILLED) {
		A12_TOTAL_SKILLED = a12_TOTAL_SKILLED;
	}
	public BigDecimal getA12_TOTAL_UNSKILLED() {
		return A12_TOTAL_UNSKILLED;
	}
	public void setA12_TOTAL_UNSKILLED(BigDecimal a12_TOTAL_UNSKILLED) {
		A12_TOTAL_UNSKILLED = a12_TOTAL_UNSKILLED;
	}
	public BigDecimal getA12_TOTAL_TOTAL() {
		return A12_TOTAL_TOTAL;
	}
	public void setA12_TOTAL_TOTAL(BigDecimal a12_TOTAL_TOTAL) {
		A12_TOTAL_TOTAL = a12_TOTAL_TOTAL;
	}
	public BigDecimal getA12_TOTAL_ALL_SKILLED() {
		return A12_TOTAL_ALL_SKILLED;
	}
	public void setA12_TOTAL_ALL_SKILLED(BigDecimal a12_TOTAL_ALL_SKILLED) {
		A12_TOTAL_ALL_SKILLED = a12_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA12_TOTAL_ALL_UNSKILLED() {
		return A12_TOTAL_ALL_UNSKILLED;
	}
	public void setA12_TOTAL_ALL_UNSKILLED(BigDecimal a12_TOTAL_ALL_UNSKILLED) {
		A12_TOTAL_ALL_UNSKILLED = a12_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA12_TOTAL_ALL_TOTAL() {
		return A12_TOTAL_ALL_TOTAL;
	}
	public void setA12_TOTAL_ALL_TOTAL(BigDecimal a12_TOTAL_ALL_TOTAL) {
		A12_TOTAL_ALL_TOTAL = a12_TOTAL_ALL_TOTAL;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_KEY_NON_SKILLED() {
		return A13_KEY_NON_SKILLED;
	}
	public void setA13_KEY_NON_SKILLED(BigDecimal a13_KEY_NON_SKILLED) {
		A13_KEY_NON_SKILLED = a13_KEY_NON_SKILLED;
	}
	public BigDecimal getA13_KEY_NON_UNSKILLED() {
		return A13_KEY_NON_UNSKILLED;
	}
	public void setA13_KEY_NON_UNSKILLED(BigDecimal a13_KEY_NON_UNSKILLED) {
		A13_KEY_NON_UNSKILLED = a13_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA13_KEY_NON_TOTAL() {
		return A13_KEY_NON_TOTAL;
	}
	public void setA13_KEY_NON_TOTAL(BigDecimal a13_KEY_NON_TOTAL) {
		A13_KEY_NON_TOTAL = a13_KEY_NON_TOTAL;
	}
	public BigDecimal getA13_OTH_NON_SKILLED() {
		return A13_OTH_NON_SKILLED;
	}
	public void setA13_OTH_NON_SKILLED(BigDecimal a13_OTH_NON_SKILLED) {
		A13_OTH_NON_SKILLED = a13_OTH_NON_SKILLED;
	}
	public BigDecimal getA13_OTH_NON_UNSKILLED() {
		return A13_OTH_NON_UNSKILLED;
	}
	public void setA13_OTH_NON_UNSKILLED(BigDecimal a13_OTH_NON_UNSKILLED) {
		A13_OTH_NON_UNSKILLED = a13_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA13_OTH_NON_TOTAL() {
		return A13_OTH_NON_TOTAL;
	}
	public void setA13_OTH_NON_TOTAL(BigDecimal a13_OTH_NON_TOTAL) {
		A13_OTH_NON_TOTAL = a13_OTH_NON_TOTAL;
	}
	public BigDecimal getA13_TOTAL_NON_SKILLED() {
		return A13_TOTAL_NON_SKILLED;
	}
	public void setA13_TOTAL_NON_SKILLED(BigDecimal a13_TOTAL_NON_SKILLED) {
		A13_TOTAL_NON_SKILLED = a13_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA13_TOTAL_NON_UNSKILLED() {
		return A13_TOTAL_NON_UNSKILLED;
	}
	public void setA13_TOTAL_NON_UNSKILLED(BigDecimal a13_TOTAL_NON_UNSKILLED) {
		A13_TOTAL_NON_UNSKILLED = a13_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA13_TOTAL_NON_TOTAL() {
		return A13_TOTAL_NON_TOTAL;
	}
	public void setA13_TOTAL_NON_TOTAL(BigDecimal a13_TOTAL_NON_TOTAL) {
		A13_TOTAL_NON_TOTAL = a13_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA13_KEY_SKILLED() {
		return A13_KEY_SKILLED;
	}
	public void setA13_KEY_SKILLED(BigDecimal a13_KEY_SKILLED) {
		A13_KEY_SKILLED = a13_KEY_SKILLED;
	}
	public BigDecimal getA13_KEY_UNSKILLED() {
		return A13_KEY_UNSKILLED;
	}
	public void setA13_KEY_UNSKILLED(BigDecimal a13_KEY_UNSKILLED) {
		A13_KEY_UNSKILLED = a13_KEY_UNSKILLED;
	}
	public BigDecimal getA13_KEY_TOTAL() {
		return A13_KEY_TOTAL;
	}
	public void setA13_KEY_TOTAL(BigDecimal a13_KEY_TOTAL) {
		A13_KEY_TOTAL = a13_KEY_TOTAL;
	}
	public BigDecimal getA13_OTH_SKILLED() {
		return A13_OTH_SKILLED;
	}
	public void setA13_OTH_SKILLED(BigDecimal a13_OTH_SKILLED) {
		A13_OTH_SKILLED = a13_OTH_SKILLED;
	}
	public BigDecimal getA13_OTH_UNSKILLED() {
		return A13_OTH_UNSKILLED;
	}
	public void setA13_OTH_UNSKILLED(BigDecimal a13_OTH_UNSKILLED) {
		A13_OTH_UNSKILLED = a13_OTH_UNSKILLED;
	}
	public BigDecimal getA13_OTH_TOTAL() {
		return A13_OTH_TOTAL;
	}
	public void setA13_OTH_TOTAL(BigDecimal a13_OTH_TOTAL) {
		A13_OTH_TOTAL = a13_OTH_TOTAL;
	}
	public BigDecimal getA13_TOTAL_SKILLED() {
		return A13_TOTAL_SKILLED;
	}
	public void setA13_TOTAL_SKILLED(BigDecimal a13_TOTAL_SKILLED) {
		A13_TOTAL_SKILLED = a13_TOTAL_SKILLED;
	}
	public BigDecimal getA13_TOTAL_UNSKILLED() {
		return A13_TOTAL_UNSKILLED;
	}
	public void setA13_TOTAL_UNSKILLED(BigDecimal a13_TOTAL_UNSKILLED) {
		A13_TOTAL_UNSKILLED = a13_TOTAL_UNSKILLED;
	}
	public BigDecimal getA13_TOTAL_TOTAL() {
		return A13_TOTAL_TOTAL;
	}
	public void setA13_TOTAL_TOTAL(BigDecimal a13_TOTAL_TOTAL) {
		A13_TOTAL_TOTAL = a13_TOTAL_TOTAL;
	}
	public BigDecimal getA13_TOTAL_ALL_SKILLED() {
		return A13_TOTAL_ALL_SKILLED;
	}
	public void setA13_TOTAL_ALL_SKILLED(BigDecimal a13_TOTAL_ALL_SKILLED) {
		A13_TOTAL_ALL_SKILLED = a13_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA13_TOTAL_ALL_UNSKILLED() {
		return A13_TOTAL_ALL_UNSKILLED;
	}
	public void setA13_TOTAL_ALL_UNSKILLED(BigDecimal a13_TOTAL_ALL_UNSKILLED) {
		A13_TOTAL_ALL_UNSKILLED = a13_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA13_TOTAL_ALL_TOTAL() {
		return A13_TOTAL_ALL_TOTAL;
	}
	public void setA13_TOTAL_ALL_TOTAL(BigDecimal a13_TOTAL_ALL_TOTAL) {
		A13_TOTAL_ALL_TOTAL = a13_TOTAL_ALL_TOTAL;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_KEY_NON_SKILLED() {
		return A14_KEY_NON_SKILLED;
	}
	public void setA14_KEY_NON_SKILLED(BigDecimal a14_KEY_NON_SKILLED) {
		A14_KEY_NON_SKILLED = a14_KEY_NON_SKILLED;
	}
	public BigDecimal getA14_KEY_NON_UNSKILLED() {
		return A14_KEY_NON_UNSKILLED;
	}
	public void setA14_KEY_NON_UNSKILLED(BigDecimal a14_KEY_NON_UNSKILLED) {
		A14_KEY_NON_UNSKILLED = a14_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA14_KEY_NON_TOTAL() {
		return A14_KEY_NON_TOTAL;
	}
	public void setA14_KEY_NON_TOTAL(BigDecimal a14_KEY_NON_TOTAL) {
		A14_KEY_NON_TOTAL = a14_KEY_NON_TOTAL;
	}
	public BigDecimal getA14_OTH_NON_SKILLED() {
		return A14_OTH_NON_SKILLED;
	}
	public void setA14_OTH_NON_SKILLED(BigDecimal a14_OTH_NON_SKILLED) {
		A14_OTH_NON_SKILLED = a14_OTH_NON_SKILLED;
	}
	public BigDecimal getA14_OTH_NON_UNSKILLED() {
		return A14_OTH_NON_UNSKILLED;
	}
	public void setA14_OTH_NON_UNSKILLED(BigDecimal a14_OTH_NON_UNSKILLED) {
		A14_OTH_NON_UNSKILLED = a14_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA14_OTH_NON_TOTAL() {
		return A14_OTH_NON_TOTAL;
	}
	public void setA14_OTH_NON_TOTAL(BigDecimal a14_OTH_NON_TOTAL) {
		A14_OTH_NON_TOTAL = a14_OTH_NON_TOTAL;
	}
	public BigDecimal getA14_TOTAL_NON_SKILLED() {
		return A14_TOTAL_NON_SKILLED;
	}
	public void setA14_TOTAL_NON_SKILLED(BigDecimal a14_TOTAL_NON_SKILLED) {
		A14_TOTAL_NON_SKILLED = a14_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA14_TOTAL_NON_UNSKILLED() {
		return A14_TOTAL_NON_UNSKILLED;
	}
	public void setA14_TOTAL_NON_UNSKILLED(BigDecimal a14_TOTAL_NON_UNSKILLED) {
		A14_TOTAL_NON_UNSKILLED = a14_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA14_TOTAL_NON_TOTAL() {
		return A14_TOTAL_NON_TOTAL;
	}
	public void setA14_TOTAL_NON_TOTAL(BigDecimal a14_TOTAL_NON_TOTAL) {
		A14_TOTAL_NON_TOTAL = a14_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA14_KEY_SKILLED() {
		return A14_KEY_SKILLED;
	}
	public void setA14_KEY_SKILLED(BigDecimal a14_KEY_SKILLED) {
		A14_KEY_SKILLED = a14_KEY_SKILLED;
	}
	public BigDecimal getA14_KEY_UNSKILLED() {
		return A14_KEY_UNSKILLED;
	}
	public void setA14_KEY_UNSKILLED(BigDecimal a14_KEY_UNSKILLED) {
		A14_KEY_UNSKILLED = a14_KEY_UNSKILLED;
	}
	public BigDecimal getA14_KEY_TOTAL() {
		return A14_KEY_TOTAL;
	}
	public void setA14_KEY_TOTAL(BigDecimal a14_KEY_TOTAL) {
		A14_KEY_TOTAL = a14_KEY_TOTAL;
	}
	public BigDecimal getA14_OTH_SKILLED() {
		return A14_OTH_SKILLED;
	}
	public void setA14_OTH_SKILLED(BigDecimal a14_OTH_SKILLED) {
		A14_OTH_SKILLED = a14_OTH_SKILLED;
	}
	public BigDecimal getA14_OTH_UNSKILLED() {
		return A14_OTH_UNSKILLED;
	}
	public void setA14_OTH_UNSKILLED(BigDecimal a14_OTH_UNSKILLED) {
		A14_OTH_UNSKILLED = a14_OTH_UNSKILLED;
	}
	public BigDecimal getA14_OTH_TOTAL() {
		return A14_OTH_TOTAL;
	}
	public void setA14_OTH_TOTAL(BigDecimal a14_OTH_TOTAL) {
		A14_OTH_TOTAL = a14_OTH_TOTAL;
	}
	public BigDecimal getA14_TOTAL_SKILLED() {
		return A14_TOTAL_SKILLED;
	}
	public void setA14_TOTAL_SKILLED(BigDecimal a14_TOTAL_SKILLED) {
		A14_TOTAL_SKILLED = a14_TOTAL_SKILLED;
	}
	public BigDecimal getA14_TOTAL_UNSKILLED() {
		return A14_TOTAL_UNSKILLED;
	}
	public void setA14_TOTAL_UNSKILLED(BigDecimal a14_TOTAL_UNSKILLED) {
		A14_TOTAL_UNSKILLED = a14_TOTAL_UNSKILLED;
	}
	public BigDecimal getA14_TOTAL_TOTAL() {
		return A14_TOTAL_TOTAL;
	}
	public void setA14_TOTAL_TOTAL(BigDecimal a14_TOTAL_TOTAL) {
		A14_TOTAL_TOTAL = a14_TOTAL_TOTAL;
	}
	public BigDecimal getA14_TOTAL_ALL_SKILLED() {
		return A14_TOTAL_ALL_SKILLED;
	}
	public void setA14_TOTAL_ALL_SKILLED(BigDecimal a14_TOTAL_ALL_SKILLED) {
		A14_TOTAL_ALL_SKILLED = a14_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA14_TOTAL_ALL_UNSKILLED() {
		return A14_TOTAL_ALL_UNSKILLED;
	}
	public void setA14_TOTAL_ALL_UNSKILLED(BigDecimal a14_TOTAL_ALL_UNSKILLED) {
		A14_TOTAL_ALL_UNSKILLED = a14_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA14_TOTAL_ALL_TOTAL() {
		return A14_TOTAL_ALL_TOTAL;
	}
	public void setA14_TOTAL_ALL_TOTAL(BigDecimal a14_TOTAL_ALL_TOTAL) {
		A14_TOTAL_ALL_TOTAL = a14_TOTAL_ALL_TOTAL;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_KEY_NON_SKILLED() {
		return A15_KEY_NON_SKILLED;
	}
	public void setA15_KEY_NON_SKILLED(BigDecimal a15_KEY_NON_SKILLED) {
		A15_KEY_NON_SKILLED = a15_KEY_NON_SKILLED;
	}
	public BigDecimal getA15_KEY_NON_UNSKILLED() {
		return A15_KEY_NON_UNSKILLED;
	}
	public void setA15_KEY_NON_UNSKILLED(BigDecimal a15_KEY_NON_UNSKILLED) {
		A15_KEY_NON_UNSKILLED = a15_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA15_KEY_NON_TOTAL() {
		return A15_KEY_NON_TOTAL;
	}
	public void setA15_KEY_NON_TOTAL(BigDecimal a15_KEY_NON_TOTAL) {
		A15_KEY_NON_TOTAL = a15_KEY_NON_TOTAL;
	}
	public BigDecimal getA15_OTH_NON_SKILLED() {
		return A15_OTH_NON_SKILLED;
	}
	public void setA15_OTH_NON_SKILLED(BigDecimal a15_OTH_NON_SKILLED) {
		A15_OTH_NON_SKILLED = a15_OTH_NON_SKILLED;
	}
	public BigDecimal getA15_OTH_NON_UNSKILLED() {
		return A15_OTH_NON_UNSKILLED;
	}
	public void setA15_OTH_NON_UNSKILLED(BigDecimal a15_OTH_NON_UNSKILLED) {
		A15_OTH_NON_UNSKILLED = a15_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA15_OTH_NON_TOTAL() {
		return A15_OTH_NON_TOTAL;
	}
	public void setA15_OTH_NON_TOTAL(BigDecimal a15_OTH_NON_TOTAL) {
		A15_OTH_NON_TOTAL = a15_OTH_NON_TOTAL;
	}
	public BigDecimal getA15_TOTAL_NON_SKILLED() {
		return A15_TOTAL_NON_SKILLED;
	}
	public void setA15_TOTAL_NON_SKILLED(BigDecimal a15_TOTAL_NON_SKILLED) {
		A15_TOTAL_NON_SKILLED = a15_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA15_TOTAL_NON_UNSKILLED() {
		return A15_TOTAL_NON_UNSKILLED;
	}
	public void setA15_TOTAL_NON_UNSKILLED(BigDecimal a15_TOTAL_NON_UNSKILLED) {
		A15_TOTAL_NON_UNSKILLED = a15_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA15_TOTAL_NON_TOTAL() {
		return A15_TOTAL_NON_TOTAL;
	}
	public void setA15_TOTAL_NON_TOTAL(BigDecimal a15_TOTAL_NON_TOTAL) {
		A15_TOTAL_NON_TOTAL = a15_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA15_KEY_SKILLED() {
		return A15_KEY_SKILLED;
	}
	public void setA15_KEY_SKILLED(BigDecimal a15_KEY_SKILLED) {
		A15_KEY_SKILLED = a15_KEY_SKILLED;
	}
	public BigDecimal getA15_KEY_UNSKILLED() {
		return A15_KEY_UNSKILLED;
	}
	public void setA15_KEY_UNSKILLED(BigDecimal a15_KEY_UNSKILLED) {
		A15_KEY_UNSKILLED = a15_KEY_UNSKILLED;
	}
	public BigDecimal getA15_KEY_TOTAL() {
		return A15_KEY_TOTAL;
	}
	public void setA15_KEY_TOTAL(BigDecimal a15_KEY_TOTAL) {
		A15_KEY_TOTAL = a15_KEY_TOTAL;
	}
	public BigDecimal getA15_OTH_SKILLED() {
		return A15_OTH_SKILLED;
	}
	public void setA15_OTH_SKILLED(BigDecimal a15_OTH_SKILLED) {
		A15_OTH_SKILLED = a15_OTH_SKILLED;
	}
	public BigDecimal getA15_OTH_UNSKILLED() {
		return A15_OTH_UNSKILLED;
	}
	public void setA15_OTH_UNSKILLED(BigDecimal a15_OTH_UNSKILLED) {
		A15_OTH_UNSKILLED = a15_OTH_UNSKILLED;
	}
	public BigDecimal getA15_OTH_TOTAL() {
		return A15_OTH_TOTAL;
	}
	public void setA15_OTH_TOTAL(BigDecimal a15_OTH_TOTAL) {
		A15_OTH_TOTAL = a15_OTH_TOTAL;
	}
	public BigDecimal getA15_TOTAL_SKILLED() {
		return A15_TOTAL_SKILLED;
	}
	public void setA15_TOTAL_SKILLED(BigDecimal a15_TOTAL_SKILLED) {
		A15_TOTAL_SKILLED = a15_TOTAL_SKILLED;
	}
	public BigDecimal getA15_TOTAL_UNSKILLED() {
		return A15_TOTAL_UNSKILLED;
	}
	public void setA15_TOTAL_UNSKILLED(BigDecimal a15_TOTAL_UNSKILLED) {
		A15_TOTAL_UNSKILLED = a15_TOTAL_UNSKILLED;
	}
	public BigDecimal getA15_TOTAL_TOTAL() {
		return A15_TOTAL_TOTAL;
	}
	public void setA15_TOTAL_TOTAL(BigDecimal a15_TOTAL_TOTAL) {
		A15_TOTAL_TOTAL = a15_TOTAL_TOTAL;
	}
	public BigDecimal getA15_TOTAL_ALL_SKILLED() {
		return A15_TOTAL_ALL_SKILLED;
	}
	public void setA15_TOTAL_ALL_SKILLED(BigDecimal a15_TOTAL_ALL_SKILLED) {
		A15_TOTAL_ALL_SKILLED = a15_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA15_TOTAL_ALL_UNSKILLED() {
		return A15_TOTAL_ALL_UNSKILLED;
	}
	public void setA15_TOTAL_ALL_UNSKILLED(BigDecimal a15_TOTAL_ALL_UNSKILLED) {
		A15_TOTAL_ALL_UNSKILLED = a15_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA15_TOTAL_ALL_TOTAL() {
		return A15_TOTAL_ALL_TOTAL;
	}
	public void setA15_TOTAL_ALL_TOTAL(BigDecimal a15_TOTAL_ALL_TOTAL) {
		A15_TOTAL_ALL_TOTAL = a15_TOTAL_ALL_TOTAL;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public BigDecimal getA16_KEY_NON_SKILLED() {
		return A16_KEY_NON_SKILLED;
	}
	public void setA16_KEY_NON_SKILLED(BigDecimal a16_KEY_NON_SKILLED) {
		A16_KEY_NON_SKILLED = a16_KEY_NON_SKILLED;
	}
	public BigDecimal getA16_KEY_NON_UNSKILLED() {
		return A16_KEY_NON_UNSKILLED;
	}
	public void setA16_KEY_NON_UNSKILLED(BigDecimal a16_KEY_NON_UNSKILLED) {
		A16_KEY_NON_UNSKILLED = a16_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA16_KEY_NON_TOTAL() {
		return A16_KEY_NON_TOTAL;
	}
	public void setA16_KEY_NON_TOTAL(BigDecimal a16_KEY_NON_TOTAL) {
		A16_KEY_NON_TOTAL = a16_KEY_NON_TOTAL;
	}
	public BigDecimal getA16_OTH_NON_SKILLED() {
		return A16_OTH_NON_SKILLED;
	}
	public void setA16_OTH_NON_SKILLED(BigDecimal a16_OTH_NON_SKILLED) {
		A16_OTH_NON_SKILLED = a16_OTH_NON_SKILLED;
	}
	public BigDecimal getA16_OTH_NON_UNSKILLED() {
		return A16_OTH_NON_UNSKILLED;
	}
	public void setA16_OTH_NON_UNSKILLED(BigDecimal a16_OTH_NON_UNSKILLED) {
		A16_OTH_NON_UNSKILLED = a16_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA16_OTH_NON_TOTAL() {
		return A16_OTH_NON_TOTAL;
	}
	public void setA16_OTH_NON_TOTAL(BigDecimal a16_OTH_NON_TOTAL) {
		A16_OTH_NON_TOTAL = a16_OTH_NON_TOTAL;
	}
	public BigDecimal getA16_TOTAL_NON_SKILLED() {
		return A16_TOTAL_NON_SKILLED;
	}
	public void setA16_TOTAL_NON_SKILLED(BigDecimal a16_TOTAL_NON_SKILLED) {
		A16_TOTAL_NON_SKILLED = a16_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA16_TOTAL_NON_UNSKILLED() {
		return A16_TOTAL_NON_UNSKILLED;
	}
	public void setA16_TOTAL_NON_UNSKILLED(BigDecimal a16_TOTAL_NON_UNSKILLED) {
		A16_TOTAL_NON_UNSKILLED = a16_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA16_TOTAL_NON_TOTAL() {
		return A16_TOTAL_NON_TOTAL;
	}
	public void setA16_TOTAL_NON_TOTAL(BigDecimal a16_TOTAL_NON_TOTAL) {
		A16_TOTAL_NON_TOTAL = a16_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA16_KEY_SKILLED() {
		return A16_KEY_SKILLED;
	}
	public void setA16_KEY_SKILLED(BigDecimal a16_KEY_SKILLED) {
		A16_KEY_SKILLED = a16_KEY_SKILLED;
	}
	public BigDecimal getA16_KEY_UNSKILLED() {
		return A16_KEY_UNSKILLED;
	}
	public void setA16_KEY_UNSKILLED(BigDecimal a16_KEY_UNSKILLED) {
		A16_KEY_UNSKILLED = a16_KEY_UNSKILLED;
	}
	public BigDecimal getA16_KEY_TOTAL() {
		return A16_KEY_TOTAL;
	}
	public void setA16_KEY_TOTAL(BigDecimal a16_KEY_TOTAL) {
		A16_KEY_TOTAL = a16_KEY_TOTAL;
	}
	public BigDecimal getA16_OTH_SKILLED() {
		return A16_OTH_SKILLED;
	}
	public void setA16_OTH_SKILLED(BigDecimal a16_OTH_SKILLED) {
		A16_OTH_SKILLED = a16_OTH_SKILLED;
	}
	public BigDecimal getA16_OTH_UNSKILLED() {
		return A16_OTH_UNSKILLED;
	}
	public void setA16_OTH_UNSKILLED(BigDecimal a16_OTH_UNSKILLED) {
		A16_OTH_UNSKILLED = a16_OTH_UNSKILLED;
	}
	public BigDecimal getA16_OTH_TOTAL() {
		return A16_OTH_TOTAL;
	}
	public void setA16_OTH_TOTAL(BigDecimal a16_OTH_TOTAL) {
		A16_OTH_TOTAL = a16_OTH_TOTAL;
	}
	public BigDecimal getA16_TOTAL_SKILLED() {
		return A16_TOTAL_SKILLED;
	}
	public void setA16_TOTAL_SKILLED(BigDecimal a16_TOTAL_SKILLED) {
		A16_TOTAL_SKILLED = a16_TOTAL_SKILLED;
	}
	public BigDecimal getA16_TOTAL_UNSKILLED() {
		return A16_TOTAL_UNSKILLED;
	}
	public void setA16_TOTAL_UNSKILLED(BigDecimal a16_TOTAL_UNSKILLED) {
		A16_TOTAL_UNSKILLED = a16_TOTAL_UNSKILLED;
	}
	public BigDecimal getA16_TOTAL_TOTAL() {
		return A16_TOTAL_TOTAL;
	}
	public void setA16_TOTAL_TOTAL(BigDecimal a16_TOTAL_TOTAL) {
		A16_TOTAL_TOTAL = a16_TOTAL_TOTAL;
	}
	public BigDecimal getA16_TOTAL_ALL_SKILLED() {
		return A16_TOTAL_ALL_SKILLED;
	}
	public void setA16_TOTAL_ALL_SKILLED(BigDecimal a16_TOTAL_ALL_SKILLED) {
		A16_TOTAL_ALL_SKILLED = a16_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA16_TOTAL_ALL_UNSKILLED() {
		return A16_TOTAL_ALL_UNSKILLED;
	}
	public void setA16_TOTAL_ALL_UNSKILLED(BigDecimal a16_TOTAL_ALL_UNSKILLED) {
		A16_TOTAL_ALL_UNSKILLED = a16_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA16_TOTAL_ALL_TOTAL() {
		return A16_TOTAL_ALL_TOTAL;
	}
	public void setA16_TOTAL_ALL_TOTAL(BigDecimal a16_TOTAL_ALL_TOTAL) {
		A16_TOTAL_ALL_TOTAL = a16_TOTAL_ALL_TOTAL;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17_KEY_NON_SKILLED() {
		return A17_KEY_NON_SKILLED;
	}
	public void setA17_KEY_NON_SKILLED(BigDecimal a17_KEY_NON_SKILLED) {
		A17_KEY_NON_SKILLED = a17_KEY_NON_SKILLED;
	}
	public BigDecimal getA17_KEY_NON_UNSKILLED() {
		return A17_KEY_NON_UNSKILLED;
	}
	public void setA17_KEY_NON_UNSKILLED(BigDecimal a17_KEY_NON_UNSKILLED) {
		A17_KEY_NON_UNSKILLED = a17_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA17_KEY_NON_TOTAL() {
		return A17_KEY_NON_TOTAL;
	}
	public void setA17_KEY_NON_TOTAL(BigDecimal a17_KEY_NON_TOTAL) {
		A17_KEY_NON_TOTAL = a17_KEY_NON_TOTAL;
	}
	public BigDecimal getA17_OTH_NON_SKILLED() {
		return A17_OTH_NON_SKILLED;
	}
	public void setA17_OTH_NON_SKILLED(BigDecimal a17_OTH_NON_SKILLED) {
		A17_OTH_NON_SKILLED = a17_OTH_NON_SKILLED;
	}
	public BigDecimal getA17_OTH_NON_UNSKILLED() {
		return A17_OTH_NON_UNSKILLED;
	}
	public void setA17_OTH_NON_UNSKILLED(BigDecimal a17_OTH_NON_UNSKILLED) {
		A17_OTH_NON_UNSKILLED = a17_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA17_OTH_NON_TOTAL() {
		return A17_OTH_NON_TOTAL;
	}
	public void setA17_OTH_NON_TOTAL(BigDecimal a17_OTH_NON_TOTAL) {
		A17_OTH_NON_TOTAL = a17_OTH_NON_TOTAL;
	}
	public BigDecimal getA17_TOTAL_NON_SKILLED() {
		return A17_TOTAL_NON_SKILLED;
	}
	public void setA17_TOTAL_NON_SKILLED(BigDecimal a17_TOTAL_NON_SKILLED) {
		A17_TOTAL_NON_SKILLED = a17_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA17_TOTAL_NON_UNSKILLED() {
		return A17_TOTAL_NON_UNSKILLED;
	}
	public void setA17_TOTAL_NON_UNSKILLED(BigDecimal a17_TOTAL_NON_UNSKILLED) {
		A17_TOTAL_NON_UNSKILLED = a17_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA17_TOTAL_NON_TOTAL() {
		return A17_TOTAL_NON_TOTAL;
	}
	public void setA17_TOTAL_NON_TOTAL(BigDecimal a17_TOTAL_NON_TOTAL) {
		A17_TOTAL_NON_TOTAL = a17_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA17_KEY_SKILLED() {
		return A17_KEY_SKILLED;
	}
	public void setA17_KEY_SKILLED(BigDecimal a17_KEY_SKILLED) {
		A17_KEY_SKILLED = a17_KEY_SKILLED;
	}
	public BigDecimal getA17_KEY_UNSKILLED() {
		return A17_KEY_UNSKILLED;
	}
	public void setA17_KEY_UNSKILLED(BigDecimal a17_KEY_UNSKILLED) {
		A17_KEY_UNSKILLED = a17_KEY_UNSKILLED;
	}
	public BigDecimal getA17_KEY_TOTAL() {
		return A17_KEY_TOTAL;
	}
	public void setA17_KEY_TOTAL(BigDecimal a17_KEY_TOTAL) {
		A17_KEY_TOTAL = a17_KEY_TOTAL;
	}
	public BigDecimal getA17_OTH_SKILLED() {
		return A17_OTH_SKILLED;
	}
	public void setA17_OTH_SKILLED(BigDecimal a17_OTH_SKILLED) {
		A17_OTH_SKILLED = a17_OTH_SKILLED;
	}
	public BigDecimal getA17_OTH_UNSKILLED() {
		return A17_OTH_UNSKILLED;
	}
	public void setA17_OTH_UNSKILLED(BigDecimal a17_OTH_UNSKILLED) {
		A17_OTH_UNSKILLED = a17_OTH_UNSKILLED;
	}
	public BigDecimal getA17_OTH_TOTAL() {
		return A17_OTH_TOTAL;
	}
	public void setA17_OTH_TOTAL(BigDecimal a17_OTH_TOTAL) {
		A17_OTH_TOTAL = a17_OTH_TOTAL;
	}
	public BigDecimal getA17_TOTAL_SKILLED() {
		return A17_TOTAL_SKILLED;
	}
	public void setA17_TOTAL_SKILLED(BigDecimal a17_TOTAL_SKILLED) {
		A17_TOTAL_SKILLED = a17_TOTAL_SKILLED;
	}
	public BigDecimal getA17_TOTAL_UNSKILLED() {
		return A17_TOTAL_UNSKILLED;
	}
	public void setA17_TOTAL_UNSKILLED(BigDecimal a17_TOTAL_UNSKILLED) {
		A17_TOTAL_UNSKILLED = a17_TOTAL_UNSKILLED;
	}
	public BigDecimal getA17_TOTAL_TOTAL() {
		return A17_TOTAL_TOTAL;
	}
	public void setA17_TOTAL_TOTAL(BigDecimal a17_TOTAL_TOTAL) {
		A17_TOTAL_TOTAL = a17_TOTAL_TOTAL;
	}
	public BigDecimal getA17_TOTAL_ALL_SKILLED() {
		return A17_TOTAL_ALL_SKILLED;
	}
	public void setA17_TOTAL_ALL_SKILLED(BigDecimal a17_TOTAL_ALL_SKILLED) {
		A17_TOTAL_ALL_SKILLED = a17_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA17_TOTAL_ALL_UNSKILLED() {
		return A17_TOTAL_ALL_UNSKILLED;
	}
	public void setA17_TOTAL_ALL_UNSKILLED(BigDecimal a17_TOTAL_ALL_UNSKILLED) {
		A17_TOTAL_ALL_UNSKILLED = a17_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA17_TOTAL_ALL_TOTAL() {
		return A17_TOTAL_ALL_TOTAL;
	}
	public void setA17_TOTAL_ALL_TOTAL(BigDecimal a17_TOTAL_ALL_TOTAL) {
		A17_TOTAL_ALL_TOTAL = a17_TOTAL_ALL_TOTAL;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public BigDecimal getA18_KEY_NON_SKILLED() {
		return A18_KEY_NON_SKILLED;
	}
	public void setA18_KEY_NON_SKILLED(BigDecimal a18_KEY_NON_SKILLED) {
		A18_KEY_NON_SKILLED = a18_KEY_NON_SKILLED;
	}
	public BigDecimal getA18_KEY_NON_UNSKILLED() {
		return A18_KEY_NON_UNSKILLED;
	}
	public void setA18_KEY_NON_UNSKILLED(BigDecimal a18_KEY_NON_UNSKILLED) {
		A18_KEY_NON_UNSKILLED = a18_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA18_KEY_NON_TOTAL() {
		return A18_KEY_NON_TOTAL;
	}
	public void setA18_KEY_NON_TOTAL(BigDecimal a18_KEY_NON_TOTAL) {
		A18_KEY_NON_TOTAL = a18_KEY_NON_TOTAL;
	}
	public BigDecimal getA18_OTH_NON_SKILLED() {
		return A18_OTH_NON_SKILLED;
	}
	public void setA18_OTH_NON_SKILLED(BigDecimal a18_OTH_NON_SKILLED) {
		A18_OTH_NON_SKILLED = a18_OTH_NON_SKILLED;
	}
	public BigDecimal getA18_OTH_NON_UNSKILLED() {
		return A18_OTH_NON_UNSKILLED;
	}
	public void setA18_OTH_NON_UNSKILLED(BigDecimal a18_OTH_NON_UNSKILLED) {
		A18_OTH_NON_UNSKILLED = a18_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA18_OTH_NON_TOTAL() {
		return A18_OTH_NON_TOTAL;
	}
	public void setA18_OTH_NON_TOTAL(BigDecimal a18_OTH_NON_TOTAL) {
		A18_OTH_NON_TOTAL = a18_OTH_NON_TOTAL;
	}
	public BigDecimal getA18_TOTAL_NON_SKILLED() {
		return A18_TOTAL_NON_SKILLED;
	}
	public void setA18_TOTAL_NON_SKILLED(BigDecimal a18_TOTAL_NON_SKILLED) {
		A18_TOTAL_NON_SKILLED = a18_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA18_TOTAL_NON_UNSKILLED() {
		return A18_TOTAL_NON_UNSKILLED;
	}
	public void setA18_TOTAL_NON_UNSKILLED(BigDecimal a18_TOTAL_NON_UNSKILLED) {
		A18_TOTAL_NON_UNSKILLED = a18_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA18_TOTAL_NON_TOTAL() {
		return A18_TOTAL_NON_TOTAL;
	}
	public void setA18_TOTAL_NON_TOTAL(BigDecimal a18_TOTAL_NON_TOTAL) {
		A18_TOTAL_NON_TOTAL = a18_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA18_KEY_SKILLED() {
		return A18_KEY_SKILLED;
	}
	public void setA18_KEY_SKILLED(BigDecimal a18_KEY_SKILLED) {
		A18_KEY_SKILLED = a18_KEY_SKILLED;
	}
	public BigDecimal getA18_KEY_UNSKILLED() {
		return A18_KEY_UNSKILLED;
	}
	public void setA18_KEY_UNSKILLED(BigDecimal a18_KEY_UNSKILLED) {
		A18_KEY_UNSKILLED = a18_KEY_UNSKILLED;
	}
	public BigDecimal getA18_KEY_TOTAL() {
		return A18_KEY_TOTAL;
	}
	public void setA18_KEY_TOTAL(BigDecimal a18_KEY_TOTAL) {
		A18_KEY_TOTAL = a18_KEY_TOTAL;
	}
	public BigDecimal getA18_OTH_SKILLED() {
		return A18_OTH_SKILLED;
	}
	public void setA18_OTH_SKILLED(BigDecimal a18_OTH_SKILLED) {
		A18_OTH_SKILLED = a18_OTH_SKILLED;
	}
	public BigDecimal getA18_OTH_UNSKILLED() {
		return A18_OTH_UNSKILLED;
	}
	public void setA18_OTH_UNSKILLED(BigDecimal a18_OTH_UNSKILLED) {
		A18_OTH_UNSKILLED = a18_OTH_UNSKILLED;
	}
	public BigDecimal getA18_OTH_TOTAL() {
		return A18_OTH_TOTAL;
	}
	public void setA18_OTH_TOTAL(BigDecimal a18_OTH_TOTAL) {
		A18_OTH_TOTAL = a18_OTH_TOTAL;
	}
	public BigDecimal getA18_TOTAL_SKILLED() {
		return A18_TOTAL_SKILLED;
	}
	public void setA18_TOTAL_SKILLED(BigDecimal a18_TOTAL_SKILLED) {
		A18_TOTAL_SKILLED = a18_TOTAL_SKILLED;
	}
	public BigDecimal getA18_TOTAL_UNSKILLED() {
		return A18_TOTAL_UNSKILLED;
	}
	public void setA18_TOTAL_UNSKILLED(BigDecimal a18_TOTAL_UNSKILLED) {
		A18_TOTAL_UNSKILLED = a18_TOTAL_UNSKILLED;
	}
	public BigDecimal getA18_TOTAL_TOTAL() {
		return A18_TOTAL_TOTAL;
	}
	public void setA18_TOTAL_TOTAL(BigDecimal a18_TOTAL_TOTAL) {
		A18_TOTAL_TOTAL = a18_TOTAL_TOTAL;
	}
	public BigDecimal getA18_TOTAL_ALL_SKILLED() {
		return A18_TOTAL_ALL_SKILLED;
	}
	public void setA18_TOTAL_ALL_SKILLED(BigDecimal a18_TOTAL_ALL_SKILLED) {
		A18_TOTAL_ALL_SKILLED = a18_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA18_TOTAL_ALL_UNSKILLED() {
		return A18_TOTAL_ALL_UNSKILLED;
	}
	public void setA18_TOTAL_ALL_UNSKILLED(BigDecimal a18_TOTAL_ALL_UNSKILLED) {
		A18_TOTAL_ALL_UNSKILLED = a18_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA18_TOTAL_ALL_TOTAL() {
		return A18_TOTAL_ALL_TOTAL;
	}
	public void setA18_TOTAL_ALL_TOTAL(BigDecimal a18_TOTAL_ALL_TOTAL) {
		A18_TOTAL_ALL_TOTAL = a18_TOTAL_ALL_TOTAL;
	}
	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}
	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}
	public BigDecimal getA19_KEY_NON_SKILLED() {
		return A19_KEY_NON_SKILLED;
	}
	public void setA19_KEY_NON_SKILLED(BigDecimal a19_KEY_NON_SKILLED) {
		A19_KEY_NON_SKILLED = a19_KEY_NON_SKILLED;
	}
	public BigDecimal getA19_KEY_NON_UNSKILLED() {
		return A19_KEY_NON_UNSKILLED;
	}
	public void setA19_KEY_NON_UNSKILLED(BigDecimal a19_KEY_NON_UNSKILLED) {
		A19_KEY_NON_UNSKILLED = a19_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA19_KEY_NON_TOTAL() {
		return A19_KEY_NON_TOTAL;
	}
	public void setA19_KEY_NON_TOTAL(BigDecimal a19_KEY_NON_TOTAL) {
		A19_KEY_NON_TOTAL = a19_KEY_NON_TOTAL;
	}
	public BigDecimal getA19_OTH_NON_SKILLED() {
		return A19_OTH_NON_SKILLED;
	}
	public void setA19_OTH_NON_SKILLED(BigDecimal a19_OTH_NON_SKILLED) {
		A19_OTH_NON_SKILLED = a19_OTH_NON_SKILLED;
	}
	public BigDecimal getA19_OTH_NON_UNSKILLED() {
		return A19_OTH_NON_UNSKILLED;
	}
	public void setA19_OTH_NON_UNSKILLED(BigDecimal a19_OTH_NON_UNSKILLED) {
		A19_OTH_NON_UNSKILLED = a19_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA19_OTH_NON_TOTAL() {
		return A19_OTH_NON_TOTAL;
	}
	public void setA19_OTH_NON_TOTAL(BigDecimal a19_OTH_NON_TOTAL) {
		A19_OTH_NON_TOTAL = a19_OTH_NON_TOTAL;
	}
	public BigDecimal getA19_TOTAL_NON_SKILLED() {
		return A19_TOTAL_NON_SKILLED;
	}
	public void setA19_TOTAL_NON_SKILLED(BigDecimal a19_TOTAL_NON_SKILLED) {
		A19_TOTAL_NON_SKILLED = a19_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA19_TOTAL_NON_UNSKILLED() {
		return A19_TOTAL_NON_UNSKILLED;
	}
	public void setA19_TOTAL_NON_UNSKILLED(BigDecimal a19_TOTAL_NON_UNSKILLED) {
		A19_TOTAL_NON_UNSKILLED = a19_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA19_TOTAL_NON_TOTAL() {
		return A19_TOTAL_NON_TOTAL;
	}
	public void setA19_TOTAL_NON_TOTAL(BigDecimal a19_TOTAL_NON_TOTAL) {
		A19_TOTAL_NON_TOTAL = a19_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA19_KEY_SKILLED() {
		return A19_KEY_SKILLED;
	}
	public void setA19_KEY_SKILLED(BigDecimal a19_KEY_SKILLED) {
		A19_KEY_SKILLED = a19_KEY_SKILLED;
	}
	public BigDecimal getA19_KEY_UNSKILLED() {
		return A19_KEY_UNSKILLED;
	}
	public void setA19_KEY_UNSKILLED(BigDecimal a19_KEY_UNSKILLED) {
		A19_KEY_UNSKILLED = a19_KEY_UNSKILLED;
	}
	public BigDecimal getA19_KEY_TOTAL() {
		return A19_KEY_TOTAL;
	}
	public void setA19_KEY_TOTAL(BigDecimal a19_KEY_TOTAL) {
		A19_KEY_TOTAL = a19_KEY_TOTAL;
	}
	public BigDecimal getA19_OTH_SKILLED() {
		return A19_OTH_SKILLED;
	}
	public void setA19_OTH_SKILLED(BigDecimal a19_OTH_SKILLED) {
		A19_OTH_SKILLED = a19_OTH_SKILLED;
	}
	public BigDecimal getA19_OTH_UNSKILLED() {
		return A19_OTH_UNSKILLED;
	}
	public void setA19_OTH_UNSKILLED(BigDecimal a19_OTH_UNSKILLED) {
		A19_OTH_UNSKILLED = a19_OTH_UNSKILLED;
	}
	public BigDecimal getA19_OTH_TOTAL() {
		return A19_OTH_TOTAL;
	}
	public void setA19_OTH_TOTAL(BigDecimal a19_OTH_TOTAL) {
		A19_OTH_TOTAL = a19_OTH_TOTAL;
	}
	public BigDecimal getA19_TOTAL_SKILLED() {
		return A19_TOTAL_SKILLED;
	}
	public void setA19_TOTAL_SKILLED(BigDecimal a19_TOTAL_SKILLED) {
		A19_TOTAL_SKILLED = a19_TOTAL_SKILLED;
	}
	public BigDecimal getA19_TOTAL_UNSKILLED() {
		return A19_TOTAL_UNSKILLED;
	}
	public void setA19_TOTAL_UNSKILLED(BigDecimal a19_TOTAL_UNSKILLED) {
		A19_TOTAL_UNSKILLED = a19_TOTAL_UNSKILLED;
	}
	public BigDecimal getA19_TOTAL_TOTAL() {
		return A19_TOTAL_TOTAL;
	}
	public void setA19_TOTAL_TOTAL(BigDecimal a19_TOTAL_TOTAL) {
		A19_TOTAL_TOTAL = a19_TOTAL_TOTAL;
	}
	public BigDecimal getA19_TOTAL_ALL_SKILLED() {
		return A19_TOTAL_ALL_SKILLED;
	}
	public void setA19_TOTAL_ALL_SKILLED(BigDecimal a19_TOTAL_ALL_SKILLED) {
		A19_TOTAL_ALL_SKILLED = a19_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA19_TOTAL_ALL_UNSKILLED() {
		return A19_TOTAL_ALL_UNSKILLED;
	}
	public void setA19_TOTAL_ALL_UNSKILLED(BigDecimal a19_TOTAL_ALL_UNSKILLED) {
		A19_TOTAL_ALL_UNSKILLED = a19_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA19_TOTAL_ALL_TOTAL() {
		return A19_TOTAL_ALL_TOTAL;
	}
	public void setA19_TOTAL_ALL_TOTAL(BigDecimal a19_TOTAL_ALL_TOTAL) {
		A19_TOTAL_ALL_TOTAL = a19_TOTAL_ALL_TOTAL;
	}
	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}
	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}
	public BigDecimal getA20_KEY_NON_SKILLED() {
		return A20_KEY_NON_SKILLED;
	}
	public void setA20_KEY_NON_SKILLED(BigDecimal a20_KEY_NON_SKILLED) {
		A20_KEY_NON_SKILLED = a20_KEY_NON_SKILLED;
	}
	public BigDecimal getA20_KEY_NON_UNSKILLED() {
		return A20_KEY_NON_UNSKILLED;
	}
	public void setA20_KEY_NON_UNSKILLED(BigDecimal a20_KEY_NON_UNSKILLED) {
		A20_KEY_NON_UNSKILLED = a20_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA20_KEY_NON_TOTAL() {
		return A20_KEY_NON_TOTAL;
	}
	public void setA20_KEY_NON_TOTAL(BigDecimal a20_KEY_NON_TOTAL) {
		A20_KEY_NON_TOTAL = a20_KEY_NON_TOTAL;
	}
	public BigDecimal getA20_OTH_NON_SKILLED() {
		return A20_OTH_NON_SKILLED;
	}
	public void setA20_OTH_NON_SKILLED(BigDecimal a20_OTH_NON_SKILLED) {
		A20_OTH_NON_SKILLED = a20_OTH_NON_SKILLED;
	}
	public BigDecimal getA20_OTH_NON_UNSKILLED() {
		return A20_OTH_NON_UNSKILLED;
	}
	public void setA20_OTH_NON_UNSKILLED(BigDecimal a20_OTH_NON_UNSKILLED) {
		A20_OTH_NON_UNSKILLED = a20_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA20_OTH_NON_TOTAL() {
		return A20_OTH_NON_TOTAL;
	}
	public void setA20_OTH_NON_TOTAL(BigDecimal a20_OTH_NON_TOTAL) {
		A20_OTH_NON_TOTAL = a20_OTH_NON_TOTAL;
	}
	public BigDecimal getA20_TOTAL_NON_SKILLED() {
		return A20_TOTAL_NON_SKILLED;
	}
	public void setA20_TOTAL_NON_SKILLED(BigDecimal a20_TOTAL_NON_SKILLED) {
		A20_TOTAL_NON_SKILLED = a20_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA20_TOTAL_NON_UNSKILLED() {
		return A20_TOTAL_NON_UNSKILLED;
	}
	public void setA20_TOTAL_NON_UNSKILLED(BigDecimal a20_TOTAL_NON_UNSKILLED) {
		A20_TOTAL_NON_UNSKILLED = a20_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA20_TOTAL_NON_TOTAL() {
		return A20_TOTAL_NON_TOTAL;
	}
	public void setA20_TOTAL_NON_TOTAL(BigDecimal a20_TOTAL_NON_TOTAL) {
		A20_TOTAL_NON_TOTAL = a20_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA20_KEY_SKILLED() {
		return A20_KEY_SKILLED;
	}
	public void setA20_KEY_SKILLED(BigDecimal a20_KEY_SKILLED) {
		A20_KEY_SKILLED = a20_KEY_SKILLED;
	}
	public BigDecimal getA20_KEY_UNSKILLED() {
		return A20_KEY_UNSKILLED;
	}
	public void setA20_KEY_UNSKILLED(BigDecimal a20_KEY_UNSKILLED) {
		A20_KEY_UNSKILLED = a20_KEY_UNSKILLED;
	}
	public BigDecimal getA20_KEY_TOTAL() {
		return A20_KEY_TOTAL;
	}
	public void setA20_KEY_TOTAL(BigDecimal a20_KEY_TOTAL) {
		A20_KEY_TOTAL = a20_KEY_TOTAL;
	}
	public BigDecimal getA20_OTH_SKILLED() {
		return A20_OTH_SKILLED;
	}
	public void setA20_OTH_SKILLED(BigDecimal a20_OTH_SKILLED) {
		A20_OTH_SKILLED = a20_OTH_SKILLED;
	}
	public BigDecimal getA20_OTH_UNSKILLED() {
		return A20_OTH_UNSKILLED;
	}
	public void setA20_OTH_UNSKILLED(BigDecimal a20_OTH_UNSKILLED) {
		A20_OTH_UNSKILLED = a20_OTH_UNSKILLED;
	}
	public BigDecimal getA20_OTH_TOTAL() {
		return A20_OTH_TOTAL;
	}
	public void setA20_OTH_TOTAL(BigDecimal a20_OTH_TOTAL) {
		A20_OTH_TOTAL = a20_OTH_TOTAL;
	}
	public BigDecimal getA20_TOTAL_SKILLED() {
		return A20_TOTAL_SKILLED;
	}
	public void setA20_TOTAL_SKILLED(BigDecimal a20_TOTAL_SKILLED) {
		A20_TOTAL_SKILLED = a20_TOTAL_SKILLED;
	}
	public BigDecimal getA20_TOTAL_UNSKILLED() {
		return A20_TOTAL_UNSKILLED;
	}
	public void setA20_TOTAL_UNSKILLED(BigDecimal a20_TOTAL_UNSKILLED) {
		A20_TOTAL_UNSKILLED = a20_TOTAL_UNSKILLED;
	}
	public BigDecimal getA20_TOTAL_TOTAL() {
		return A20_TOTAL_TOTAL;
	}
	public void setA20_TOTAL_TOTAL(BigDecimal a20_TOTAL_TOTAL) {
		A20_TOTAL_TOTAL = a20_TOTAL_TOTAL;
	}
	public BigDecimal getA20_TOTAL_ALL_SKILLED() {
		return A20_TOTAL_ALL_SKILLED;
	}
	public void setA20_TOTAL_ALL_SKILLED(BigDecimal a20_TOTAL_ALL_SKILLED) {
		A20_TOTAL_ALL_SKILLED = a20_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA20_TOTAL_ALL_UNSKILLED() {
		return A20_TOTAL_ALL_UNSKILLED;
	}
	public void setA20_TOTAL_ALL_UNSKILLED(BigDecimal a20_TOTAL_ALL_UNSKILLED) {
		A20_TOTAL_ALL_UNSKILLED = a20_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA20_TOTAL_ALL_TOTAL() {
		return A20_TOTAL_ALL_TOTAL;
	}
	public void setA20_TOTAL_ALL_TOTAL(BigDecimal a20_TOTAL_ALL_TOTAL) {
		A20_TOTAL_ALL_TOTAL = a20_TOTAL_ALL_TOTAL;
	}
	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}
	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}
	public BigDecimal getA21_KEY_NON_SKILLED() {
		return A21_KEY_NON_SKILLED;
	}
	public void setA21_KEY_NON_SKILLED(BigDecimal a21_KEY_NON_SKILLED) {
		A21_KEY_NON_SKILLED = a21_KEY_NON_SKILLED;
	}
	public BigDecimal getA21_KEY_NON_UNSKILLED() {
		return A21_KEY_NON_UNSKILLED;
	}
	public void setA21_KEY_NON_UNSKILLED(BigDecimal a21_KEY_NON_UNSKILLED) {
		A21_KEY_NON_UNSKILLED = a21_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA21_KEY_NON_TOTAL() {
		return A21_KEY_NON_TOTAL;
	}
	public void setA21_KEY_NON_TOTAL(BigDecimal a21_KEY_NON_TOTAL) {
		A21_KEY_NON_TOTAL = a21_KEY_NON_TOTAL;
	}
	public BigDecimal getA21_OTH_NON_SKILLED() {
		return A21_OTH_NON_SKILLED;
	}
	public void setA21_OTH_NON_SKILLED(BigDecimal a21_OTH_NON_SKILLED) {
		A21_OTH_NON_SKILLED = a21_OTH_NON_SKILLED;
	}
	public BigDecimal getA21_OTH_NON_UNSKILLED() {
		return A21_OTH_NON_UNSKILLED;
	}
	public void setA21_OTH_NON_UNSKILLED(BigDecimal a21_OTH_NON_UNSKILLED) {
		A21_OTH_NON_UNSKILLED = a21_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA21_OTH_NON_TOTAL() {
		return A21_OTH_NON_TOTAL;
	}
	public void setA21_OTH_NON_TOTAL(BigDecimal a21_OTH_NON_TOTAL) {
		A21_OTH_NON_TOTAL = a21_OTH_NON_TOTAL;
	}
	public BigDecimal getA21_TOTAL_NON_SKILLED() {
		return A21_TOTAL_NON_SKILLED;
	}
	public void setA21_TOTAL_NON_SKILLED(BigDecimal a21_TOTAL_NON_SKILLED) {
		A21_TOTAL_NON_SKILLED = a21_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA21_TOTAL_NON_UNSKILLED() {
		return A21_TOTAL_NON_UNSKILLED;
	}
	public void setA21_TOTAL_NON_UNSKILLED(BigDecimal a21_TOTAL_NON_UNSKILLED) {
		A21_TOTAL_NON_UNSKILLED = a21_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA21_TOTAL_NON_TOTAL() {
		return A21_TOTAL_NON_TOTAL;
	}
	public void setA21_TOTAL_NON_TOTAL(BigDecimal a21_TOTAL_NON_TOTAL) {
		A21_TOTAL_NON_TOTAL = a21_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA21_KEY_SKILLED() {
		return A21_KEY_SKILLED;
	}
	public void setA21_KEY_SKILLED(BigDecimal a21_KEY_SKILLED) {
		A21_KEY_SKILLED = a21_KEY_SKILLED;
	}
	public BigDecimal getA21_KEY_UNSKILLED() {
		return A21_KEY_UNSKILLED;
	}
	public void setA21_KEY_UNSKILLED(BigDecimal a21_KEY_UNSKILLED) {
		A21_KEY_UNSKILLED = a21_KEY_UNSKILLED;
	}
	public BigDecimal getA21_KEY_TOTAL() {
		return A21_KEY_TOTAL;
	}
	public void setA21_KEY_TOTAL(BigDecimal a21_KEY_TOTAL) {
		A21_KEY_TOTAL = a21_KEY_TOTAL;
	}
	public BigDecimal getA21_OTH_SKILLED() {
		return A21_OTH_SKILLED;
	}
	public void setA21_OTH_SKILLED(BigDecimal a21_OTH_SKILLED) {
		A21_OTH_SKILLED = a21_OTH_SKILLED;
	}
	public BigDecimal getA21_OTH_UNSKILLED() {
		return A21_OTH_UNSKILLED;
	}
	public void setA21_OTH_UNSKILLED(BigDecimal a21_OTH_UNSKILLED) {
		A21_OTH_UNSKILLED = a21_OTH_UNSKILLED;
	}
	public BigDecimal getA21_OTH_TOTAL() {
		return A21_OTH_TOTAL;
	}
	public void setA21_OTH_TOTAL(BigDecimal a21_OTH_TOTAL) {
		A21_OTH_TOTAL = a21_OTH_TOTAL;
	}
	public BigDecimal getA21_TOTAL_SKILLED() {
		return A21_TOTAL_SKILLED;
	}
	public void setA21_TOTAL_SKILLED(BigDecimal a21_TOTAL_SKILLED) {
		A21_TOTAL_SKILLED = a21_TOTAL_SKILLED;
	}
	public BigDecimal getA21_TOTAL_UNSKILLED() {
		return A21_TOTAL_UNSKILLED;
	}
	public void setA21_TOTAL_UNSKILLED(BigDecimal a21_TOTAL_UNSKILLED) {
		A21_TOTAL_UNSKILLED = a21_TOTAL_UNSKILLED;
	}
	public BigDecimal getA21_TOTAL_TOTAL() {
		return A21_TOTAL_TOTAL;
	}
	public void setA21_TOTAL_TOTAL(BigDecimal a21_TOTAL_TOTAL) {
		A21_TOTAL_TOTAL = a21_TOTAL_TOTAL;
	}
	public BigDecimal getA21_TOTAL_ALL_SKILLED() {
		return A21_TOTAL_ALL_SKILLED;
	}
	public void setA21_TOTAL_ALL_SKILLED(BigDecimal a21_TOTAL_ALL_SKILLED) {
		A21_TOTAL_ALL_SKILLED = a21_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA21_TOTAL_ALL_UNSKILLED() {
		return A21_TOTAL_ALL_UNSKILLED;
	}
	public void setA21_TOTAL_ALL_UNSKILLED(BigDecimal a21_TOTAL_ALL_UNSKILLED) {
		A21_TOTAL_ALL_UNSKILLED = a21_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA21_TOTAL_ALL_TOTAL() {
		return A21_TOTAL_ALL_TOTAL;
	}
	public void setA21_TOTAL_ALL_TOTAL(BigDecimal a21_TOTAL_ALL_TOTAL) {
		A21_TOTAL_ALL_TOTAL = a21_TOTAL_ALL_TOTAL;
	}
	public String getA22_PRODUCT() {
		return A22_PRODUCT;
	}
	public void setA22_PRODUCT(String a22_PRODUCT) {
		A22_PRODUCT = a22_PRODUCT;
	}
	public BigDecimal getA22_KEY_NON_SKILLED() {
		return A22_KEY_NON_SKILLED;
	}
	public void setA22_KEY_NON_SKILLED(BigDecimal a22_KEY_NON_SKILLED) {
		A22_KEY_NON_SKILLED = a22_KEY_NON_SKILLED;
	}
	public BigDecimal getA22_KEY_NON_UNSKILLED() {
		return A22_KEY_NON_UNSKILLED;
	}
	public void setA22_KEY_NON_UNSKILLED(BigDecimal a22_KEY_NON_UNSKILLED) {
		A22_KEY_NON_UNSKILLED = a22_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA22_KEY_NON_TOTAL() {
		return A22_KEY_NON_TOTAL;
	}
	public void setA22_KEY_NON_TOTAL(BigDecimal a22_KEY_NON_TOTAL) {
		A22_KEY_NON_TOTAL = a22_KEY_NON_TOTAL;
	}
	public BigDecimal getA22_OTH_NON_SKILLED() {
		return A22_OTH_NON_SKILLED;
	}
	public void setA22_OTH_NON_SKILLED(BigDecimal a22_OTH_NON_SKILLED) {
		A22_OTH_NON_SKILLED = a22_OTH_NON_SKILLED;
	}
	public BigDecimal getA22_OTH_NON_UNSKILLED() {
		return A22_OTH_NON_UNSKILLED;
	}
	public void setA22_OTH_NON_UNSKILLED(BigDecimal a22_OTH_NON_UNSKILLED) {
		A22_OTH_NON_UNSKILLED = a22_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA22_OTH_NON_TOTAL() {
		return A22_OTH_NON_TOTAL;
	}
	public void setA22_OTH_NON_TOTAL(BigDecimal a22_OTH_NON_TOTAL) {
		A22_OTH_NON_TOTAL = a22_OTH_NON_TOTAL;
	}
	public BigDecimal getA22_TOTAL_NON_SKILLED() {
		return A22_TOTAL_NON_SKILLED;
	}
	public void setA22_TOTAL_NON_SKILLED(BigDecimal a22_TOTAL_NON_SKILLED) {
		A22_TOTAL_NON_SKILLED = a22_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA22_TOTAL_NON_UNSKILLED() {
		return A22_TOTAL_NON_UNSKILLED;
	}
	public void setA22_TOTAL_NON_UNSKILLED(BigDecimal a22_TOTAL_NON_UNSKILLED) {
		A22_TOTAL_NON_UNSKILLED = a22_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA22_TOTAL_NON_TOTAL() {
		return A22_TOTAL_NON_TOTAL;
	}
	public void setA22_TOTAL_NON_TOTAL(BigDecimal a22_TOTAL_NON_TOTAL) {
		A22_TOTAL_NON_TOTAL = a22_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA22_KEY_SKILLED() {
		return A22_KEY_SKILLED;
	}
	public void setA22_KEY_SKILLED(BigDecimal a22_KEY_SKILLED) {
		A22_KEY_SKILLED = a22_KEY_SKILLED;
	}
	public BigDecimal getA22_KEY_UNSKILLED() {
		return A22_KEY_UNSKILLED;
	}
	public void setA22_KEY_UNSKILLED(BigDecimal a22_KEY_UNSKILLED) {
		A22_KEY_UNSKILLED = a22_KEY_UNSKILLED;
	}
	public BigDecimal getA22_KEY_TOTAL() {
		return A22_KEY_TOTAL;
	}
	public void setA22_KEY_TOTAL(BigDecimal a22_KEY_TOTAL) {
		A22_KEY_TOTAL = a22_KEY_TOTAL;
	}
	public BigDecimal getA22_OTH_SKILLED() {
		return A22_OTH_SKILLED;
	}
	public void setA22_OTH_SKILLED(BigDecimal a22_OTH_SKILLED) {
		A22_OTH_SKILLED = a22_OTH_SKILLED;
	}
	public BigDecimal getA22_OTH_UNSKILLED() {
		return A22_OTH_UNSKILLED;
	}
	public void setA22_OTH_UNSKILLED(BigDecimal a22_OTH_UNSKILLED) {
		A22_OTH_UNSKILLED = a22_OTH_UNSKILLED;
	}
	public BigDecimal getA22_OTH_TOTAL() {
		return A22_OTH_TOTAL;
	}
	public void setA22_OTH_TOTAL(BigDecimal a22_OTH_TOTAL) {
		A22_OTH_TOTAL = a22_OTH_TOTAL;
	}
	public BigDecimal getA22_TOTAL_SKILLED() {
		return A22_TOTAL_SKILLED;
	}
	public void setA22_TOTAL_SKILLED(BigDecimal a22_TOTAL_SKILLED) {
		A22_TOTAL_SKILLED = a22_TOTAL_SKILLED;
	}
	public BigDecimal getA22_TOTAL_UNSKILLED() {
		return A22_TOTAL_UNSKILLED;
	}
	public void setA22_TOTAL_UNSKILLED(BigDecimal a22_TOTAL_UNSKILLED) {
		A22_TOTAL_UNSKILLED = a22_TOTAL_UNSKILLED;
	}
	public BigDecimal getA22_TOTAL_TOTAL() {
		return A22_TOTAL_TOTAL;
	}
	public void setA22_TOTAL_TOTAL(BigDecimal a22_TOTAL_TOTAL) {
		A22_TOTAL_TOTAL = a22_TOTAL_TOTAL;
	}
	public BigDecimal getA22_TOTAL_ALL_SKILLED() {
		return A22_TOTAL_ALL_SKILLED;
	}
	public void setA22_TOTAL_ALL_SKILLED(BigDecimal a22_TOTAL_ALL_SKILLED) {
		A22_TOTAL_ALL_SKILLED = a22_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA22_TOTAL_ALL_UNSKILLED() {
		return A22_TOTAL_ALL_UNSKILLED;
	}
	public void setA22_TOTAL_ALL_UNSKILLED(BigDecimal a22_TOTAL_ALL_UNSKILLED) {
		A22_TOTAL_ALL_UNSKILLED = a22_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA22_TOTAL_ALL_TOTAL() {
		return A22_TOTAL_ALL_TOTAL;
	}
	public void setA22_TOTAL_ALL_TOTAL(BigDecimal a22_TOTAL_ALL_TOTAL) {
		A22_TOTAL_ALL_TOTAL = a22_TOTAL_ALL_TOTAL;
	}
	public String getA23_PRODUCT() {
		return A23_PRODUCT;
	}
	public void setA23_PRODUCT(String a23_PRODUCT) {
		A23_PRODUCT = a23_PRODUCT;
	}
	public BigDecimal getA23_KEY_NON_SKILLED() {
		return A23_KEY_NON_SKILLED;
	}
	public void setA23_KEY_NON_SKILLED(BigDecimal a23_KEY_NON_SKILLED) {
		A23_KEY_NON_SKILLED = a23_KEY_NON_SKILLED;
	}
	public BigDecimal getA23_KEY_NON_UNSKILLED() {
		return A23_KEY_NON_UNSKILLED;
	}
	public void setA23_KEY_NON_UNSKILLED(BigDecimal a23_KEY_NON_UNSKILLED) {
		A23_KEY_NON_UNSKILLED = a23_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA23_KEY_NON_TOTAL() {
		return A23_KEY_NON_TOTAL;
	}
	public void setA23_KEY_NON_TOTAL(BigDecimal a23_KEY_NON_TOTAL) {
		A23_KEY_NON_TOTAL = a23_KEY_NON_TOTAL;
	}
	public BigDecimal getA23_OTH_NON_SKILLED() {
		return A23_OTH_NON_SKILLED;
	}
	public void setA23_OTH_NON_SKILLED(BigDecimal a23_OTH_NON_SKILLED) {
		A23_OTH_NON_SKILLED = a23_OTH_NON_SKILLED;
	}
	public BigDecimal getA23_OTH_NON_UNSKILLED() {
		return A23_OTH_NON_UNSKILLED;
	}
	public void setA23_OTH_NON_UNSKILLED(BigDecimal a23_OTH_NON_UNSKILLED) {
		A23_OTH_NON_UNSKILLED = a23_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA23_OTH_NON_TOTAL() {
		return A23_OTH_NON_TOTAL;
	}
	public void setA23_OTH_NON_TOTAL(BigDecimal a23_OTH_NON_TOTAL) {
		A23_OTH_NON_TOTAL = a23_OTH_NON_TOTAL;
	}
	public BigDecimal getA23_TOTAL_NON_SKILLED() {
		return A23_TOTAL_NON_SKILLED;
	}
	public void setA23_TOTAL_NON_SKILLED(BigDecimal a23_TOTAL_NON_SKILLED) {
		A23_TOTAL_NON_SKILLED = a23_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA23_TOTAL_NON_UNSKILLED() {
		return A23_TOTAL_NON_UNSKILLED;
	}
	public void setA23_TOTAL_NON_UNSKILLED(BigDecimal a23_TOTAL_NON_UNSKILLED) {
		A23_TOTAL_NON_UNSKILLED = a23_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA23_TOTAL_NON_TOTAL() {
		return A23_TOTAL_NON_TOTAL;
	}
	public void setA23_TOTAL_NON_TOTAL(BigDecimal a23_TOTAL_NON_TOTAL) {
		A23_TOTAL_NON_TOTAL = a23_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA23_KEY_SKILLED() {
		return A23_KEY_SKILLED;
	}
	public void setA23_KEY_SKILLED(BigDecimal a23_KEY_SKILLED) {
		A23_KEY_SKILLED = a23_KEY_SKILLED;
	}
	public BigDecimal getA23_KEY_UNSKILLED() {
		return A23_KEY_UNSKILLED;
	}
	public void setA23_KEY_UNSKILLED(BigDecimal a23_KEY_UNSKILLED) {
		A23_KEY_UNSKILLED = a23_KEY_UNSKILLED;
	}
	public BigDecimal getA23_KEY_TOTAL() {
		return A23_KEY_TOTAL;
	}
	public void setA23_KEY_TOTAL(BigDecimal a23_KEY_TOTAL) {
		A23_KEY_TOTAL = a23_KEY_TOTAL;
	}
	public BigDecimal getA23_OTH_SKILLED() {
		return A23_OTH_SKILLED;
	}
	public void setA23_OTH_SKILLED(BigDecimal a23_OTH_SKILLED) {
		A23_OTH_SKILLED = a23_OTH_SKILLED;
	}
	public BigDecimal getA23_OTH_UNSKILLED() {
		return A23_OTH_UNSKILLED;
	}
	public void setA23_OTH_UNSKILLED(BigDecimal a23_OTH_UNSKILLED) {
		A23_OTH_UNSKILLED = a23_OTH_UNSKILLED;
	}
	public BigDecimal getA23_OTH_TOTAL() {
		return A23_OTH_TOTAL;
	}
	public void setA23_OTH_TOTAL(BigDecimal a23_OTH_TOTAL) {
		A23_OTH_TOTAL = a23_OTH_TOTAL;
	}
	public BigDecimal getA23_TOTAL_SKILLED() {
		return A23_TOTAL_SKILLED;
	}
	public void setA23_TOTAL_SKILLED(BigDecimal a23_TOTAL_SKILLED) {
		A23_TOTAL_SKILLED = a23_TOTAL_SKILLED;
	}
	public BigDecimal getA23_TOTAL_UNSKILLED() {
		return A23_TOTAL_UNSKILLED;
	}
	public void setA23_TOTAL_UNSKILLED(BigDecimal a23_TOTAL_UNSKILLED) {
		A23_TOTAL_UNSKILLED = a23_TOTAL_UNSKILLED;
	}
	public BigDecimal getA23_TOTAL_TOTAL() {
		return A23_TOTAL_TOTAL;
	}
	public void setA23_TOTAL_TOTAL(BigDecimal a23_TOTAL_TOTAL) {
		A23_TOTAL_TOTAL = a23_TOTAL_TOTAL;
	}
	public BigDecimal getA23_TOTAL_ALL_SKILLED() {
		return A23_TOTAL_ALL_SKILLED;
	}
	public void setA23_TOTAL_ALL_SKILLED(BigDecimal a23_TOTAL_ALL_SKILLED) {
		A23_TOTAL_ALL_SKILLED = a23_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA23_TOTAL_ALL_UNSKILLED() {
		return A23_TOTAL_ALL_UNSKILLED;
	}
	public void setA23_TOTAL_ALL_UNSKILLED(BigDecimal a23_TOTAL_ALL_UNSKILLED) {
		A23_TOTAL_ALL_UNSKILLED = a23_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA23_TOTAL_ALL_TOTAL() {
		return A23_TOTAL_ALL_TOTAL;
	}
	public void setA23_TOTAL_ALL_TOTAL(BigDecimal a23_TOTAL_ALL_TOTAL) {
		A23_TOTAL_ALL_TOTAL = a23_TOTAL_ALL_TOTAL;
	}
	public String getA24_PRODUCT() {
		return A24_PRODUCT;
	}
	public void setA24_PRODUCT(String a24_PRODUCT) {
		A24_PRODUCT = a24_PRODUCT;
	}
	public BigDecimal getA24_KEY_NON_SKILLED() {
		return A24_KEY_NON_SKILLED;
	}
	public void setA24_KEY_NON_SKILLED(BigDecimal a24_KEY_NON_SKILLED) {
		A24_KEY_NON_SKILLED = a24_KEY_NON_SKILLED;
	}
	public BigDecimal getA24_KEY_NON_UNSKILLED() {
		return A24_KEY_NON_UNSKILLED;
	}
	public void setA24_KEY_NON_UNSKILLED(BigDecimal a24_KEY_NON_UNSKILLED) {
		A24_KEY_NON_UNSKILLED = a24_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA24_KEY_NON_TOTAL() {
		return A24_KEY_NON_TOTAL;
	}
	public void setA24_KEY_NON_TOTAL(BigDecimal a24_KEY_NON_TOTAL) {
		A24_KEY_NON_TOTAL = a24_KEY_NON_TOTAL;
	}
	public BigDecimal getA24_OTH_NON_SKILLED() {
		return A24_OTH_NON_SKILLED;
	}
	public void setA24_OTH_NON_SKILLED(BigDecimal a24_OTH_NON_SKILLED) {
		A24_OTH_NON_SKILLED = a24_OTH_NON_SKILLED;
	}
	public BigDecimal getA24_OTH_NON_UNSKILLED() {
		return A24_OTH_NON_UNSKILLED;
	}
	public void setA24_OTH_NON_UNSKILLED(BigDecimal a24_OTH_NON_UNSKILLED) {
		A24_OTH_NON_UNSKILLED = a24_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA24_OTH_NON_TOTAL() {
		return A24_OTH_NON_TOTAL;
	}
	public void setA24_OTH_NON_TOTAL(BigDecimal a24_OTH_NON_TOTAL) {
		A24_OTH_NON_TOTAL = a24_OTH_NON_TOTAL;
	}
	public BigDecimal getA24_TOTAL_NON_SKILLED() {
		return A24_TOTAL_NON_SKILLED;
	}
	public void setA24_TOTAL_NON_SKILLED(BigDecimal a24_TOTAL_NON_SKILLED) {
		A24_TOTAL_NON_SKILLED = a24_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA24_TOTAL_NON_UNSKILLED() {
		return A24_TOTAL_NON_UNSKILLED;
	}
	public void setA24_TOTAL_NON_UNSKILLED(BigDecimal a24_TOTAL_NON_UNSKILLED) {
		A24_TOTAL_NON_UNSKILLED = a24_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA24_TOTAL_NON_TOTAL() {
		return A24_TOTAL_NON_TOTAL;
	}
	public void setA24_TOTAL_NON_TOTAL(BigDecimal a24_TOTAL_NON_TOTAL) {
		A24_TOTAL_NON_TOTAL = a24_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA24_KEY_SKILLED() {
		return A24_KEY_SKILLED;
	}
	public void setA24_KEY_SKILLED(BigDecimal a24_KEY_SKILLED) {
		A24_KEY_SKILLED = a24_KEY_SKILLED;
	}
	public BigDecimal getA24_KEY_UNSKILLED() {
		return A24_KEY_UNSKILLED;
	}
	public void setA24_KEY_UNSKILLED(BigDecimal a24_KEY_UNSKILLED) {
		A24_KEY_UNSKILLED = a24_KEY_UNSKILLED;
	}
	public BigDecimal getA24_KEY_TOTAL() {
		return A24_KEY_TOTAL;
	}
	public void setA24_KEY_TOTAL(BigDecimal a24_KEY_TOTAL) {
		A24_KEY_TOTAL = a24_KEY_TOTAL;
	}
	public BigDecimal getA24_OTH_SKILLED() {
		return A24_OTH_SKILLED;
	}
	public void setA24_OTH_SKILLED(BigDecimal a24_OTH_SKILLED) {
		A24_OTH_SKILLED = a24_OTH_SKILLED;
	}
	public BigDecimal getA24_OTH_UNSKILLED() {
		return A24_OTH_UNSKILLED;
	}
	public void setA24_OTH_UNSKILLED(BigDecimal a24_OTH_UNSKILLED) {
		A24_OTH_UNSKILLED = a24_OTH_UNSKILLED;
	}
	public BigDecimal getA24_OTH_TOTAL() {
		return A24_OTH_TOTAL;
	}
	public void setA24_OTH_TOTAL(BigDecimal a24_OTH_TOTAL) {
		A24_OTH_TOTAL = a24_OTH_TOTAL;
	}
	public BigDecimal getA24_TOTAL_SKILLED() {
		return A24_TOTAL_SKILLED;
	}
	public void setA24_TOTAL_SKILLED(BigDecimal a24_TOTAL_SKILLED) {
		A24_TOTAL_SKILLED = a24_TOTAL_SKILLED;
	}
	public BigDecimal getA24_TOTAL_UNSKILLED() {
		return A24_TOTAL_UNSKILLED;
	}
	public void setA24_TOTAL_UNSKILLED(BigDecimal a24_TOTAL_UNSKILLED) {
		A24_TOTAL_UNSKILLED = a24_TOTAL_UNSKILLED;
	}
	public BigDecimal getA24_TOTAL_TOTAL() {
		return A24_TOTAL_TOTAL;
	}
	public void setA24_TOTAL_TOTAL(BigDecimal a24_TOTAL_TOTAL) {
		A24_TOTAL_TOTAL = a24_TOTAL_TOTAL;
	}
	public BigDecimal getA24_TOTAL_ALL_SKILLED() {
		return A24_TOTAL_ALL_SKILLED;
	}
	public void setA24_TOTAL_ALL_SKILLED(BigDecimal a24_TOTAL_ALL_SKILLED) {
		A24_TOTAL_ALL_SKILLED = a24_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA24_TOTAL_ALL_UNSKILLED() {
		return A24_TOTAL_ALL_UNSKILLED;
	}
	public void setA24_TOTAL_ALL_UNSKILLED(BigDecimal a24_TOTAL_ALL_UNSKILLED) {
		A24_TOTAL_ALL_UNSKILLED = a24_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA24_TOTAL_ALL_TOTAL() {
		return A24_TOTAL_ALL_TOTAL;
	}
	public void setA24_TOTAL_ALL_TOTAL(BigDecimal a24_TOTAL_ALL_TOTAL) {
		A24_TOTAL_ALL_TOTAL = a24_TOTAL_ALL_TOTAL;
	}
	public String getA25_PRODUCT() {
		return A25_PRODUCT;
	}
	public void setA25_PRODUCT(String a25_PRODUCT) {
		A25_PRODUCT = a25_PRODUCT;
	}
	public BigDecimal getA25_KEY_NON_SKILLED() {
		return A25_KEY_NON_SKILLED;
	}
	public void setA25_KEY_NON_SKILLED(BigDecimal a25_KEY_NON_SKILLED) {
		A25_KEY_NON_SKILLED = a25_KEY_NON_SKILLED;
	}
	public BigDecimal getA25_KEY_NON_UNSKILLED() {
		return A25_KEY_NON_UNSKILLED;
	}
	public void setA25_KEY_NON_UNSKILLED(BigDecimal a25_KEY_NON_UNSKILLED) {
		A25_KEY_NON_UNSKILLED = a25_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA25_KEY_NON_TOTAL() {
		return A25_KEY_NON_TOTAL;
	}
	public void setA25_KEY_NON_TOTAL(BigDecimal a25_KEY_NON_TOTAL) {
		A25_KEY_NON_TOTAL = a25_KEY_NON_TOTAL;
	}
	public BigDecimal getA25_OTH_NON_SKILLED() {
		return A25_OTH_NON_SKILLED;
	}
	public void setA25_OTH_NON_SKILLED(BigDecimal a25_OTH_NON_SKILLED) {
		A25_OTH_NON_SKILLED = a25_OTH_NON_SKILLED;
	}
	public BigDecimal getA25_OTH_NON_UNSKILLED() {
		return A25_OTH_NON_UNSKILLED;
	}
	public void setA25_OTH_NON_UNSKILLED(BigDecimal a25_OTH_NON_UNSKILLED) {
		A25_OTH_NON_UNSKILLED = a25_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA25_OTH_NON_TOTAL() {
		return A25_OTH_NON_TOTAL;
	}
	public void setA25_OTH_NON_TOTAL(BigDecimal a25_OTH_NON_TOTAL) {
		A25_OTH_NON_TOTAL = a25_OTH_NON_TOTAL;
	}
	public BigDecimal getA25_TOTAL_NON_SKILLED() {
		return A25_TOTAL_NON_SKILLED;
	}
	public void setA25_TOTAL_NON_SKILLED(BigDecimal a25_TOTAL_NON_SKILLED) {
		A25_TOTAL_NON_SKILLED = a25_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA25_TOTAL_NON_UNSKILLED() {
		return A25_TOTAL_NON_UNSKILLED;
	}
	public void setA25_TOTAL_NON_UNSKILLED(BigDecimal a25_TOTAL_NON_UNSKILLED) {
		A25_TOTAL_NON_UNSKILLED = a25_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA25_TOTAL_NON_TOTAL() {
		return A25_TOTAL_NON_TOTAL;
	}
	public void setA25_TOTAL_NON_TOTAL(BigDecimal a25_TOTAL_NON_TOTAL) {
		A25_TOTAL_NON_TOTAL = a25_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA25_KEY_SKILLED() {
		return A25_KEY_SKILLED;
	}
	public void setA25_KEY_SKILLED(BigDecimal a25_KEY_SKILLED) {
		A25_KEY_SKILLED = a25_KEY_SKILLED;
	}
	public BigDecimal getA25_KEY_UNSKILLED() {
		return A25_KEY_UNSKILLED;
	}
	public void setA25_KEY_UNSKILLED(BigDecimal a25_KEY_UNSKILLED) {
		A25_KEY_UNSKILLED = a25_KEY_UNSKILLED;
	}
	public BigDecimal getA25_KEY_TOTAL() {
		return A25_KEY_TOTAL;
	}
	public void setA25_KEY_TOTAL(BigDecimal a25_KEY_TOTAL) {
		A25_KEY_TOTAL = a25_KEY_TOTAL;
	}
	public BigDecimal getA25_OTH_SKILLED() {
		return A25_OTH_SKILLED;
	}
	public void setA25_OTH_SKILLED(BigDecimal a25_OTH_SKILLED) {
		A25_OTH_SKILLED = a25_OTH_SKILLED;
	}
	public BigDecimal getA25_OTH_UNSKILLED() {
		return A25_OTH_UNSKILLED;
	}
	public void setA25_OTH_UNSKILLED(BigDecimal a25_OTH_UNSKILLED) {
		A25_OTH_UNSKILLED = a25_OTH_UNSKILLED;
	}
	public BigDecimal getA25_OTH_TOTAL() {
		return A25_OTH_TOTAL;
	}
	public void setA25_OTH_TOTAL(BigDecimal a25_OTH_TOTAL) {
		A25_OTH_TOTAL = a25_OTH_TOTAL;
	}
	public BigDecimal getA25_TOTAL_SKILLED() {
		return A25_TOTAL_SKILLED;
	}
	public void setA25_TOTAL_SKILLED(BigDecimal a25_TOTAL_SKILLED) {
		A25_TOTAL_SKILLED = a25_TOTAL_SKILLED;
	}
	public BigDecimal getA25_TOTAL_UNSKILLED() {
		return A25_TOTAL_UNSKILLED;
	}
	public void setA25_TOTAL_UNSKILLED(BigDecimal a25_TOTAL_UNSKILLED) {
		A25_TOTAL_UNSKILLED = a25_TOTAL_UNSKILLED;
	}
	public BigDecimal getA25_TOTAL_TOTAL() {
		return A25_TOTAL_TOTAL;
	}
	public void setA25_TOTAL_TOTAL(BigDecimal a25_TOTAL_TOTAL) {
		A25_TOTAL_TOTAL = a25_TOTAL_TOTAL;
	}
	public BigDecimal getA25_TOTAL_ALL_SKILLED() {
		return A25_TOTAL_ALL_SKILLED;
	}
	public void setA25_TOTAL_ALL_SKILLED(BigDecimal a25_TOTAL_ALL_SKILLED) {
		A25_TOTAL_ALL_SKILLED = a25_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA25_TOTAL_ALL_UNSKILLED() {
		return A25_TOTAL_ALL_UNSKILLED;
	}
	public void setA25_TOTAL_ALL_UNSKILLED(BigDecimal a25_TOTAL_ALL_UNSKILLED) {
		A25_TOTAL_ALL_UNSKILLED = a25_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA25_TOTAL_ALL_TOTAL() {
		return A25_TOTAL_ALL_TOTAL;
	}
	public void setA25_TOTAL_ALL_TOTAL(BigDecimal a25_TOTAL_ALL_TOTAL) {
		A25_TOTAL_ALL_TOTAL = a25_TOTAL_ALL_TOTAL;
	}
	public String getA26_PRODUCT() {
		return A26_PRODUCT;
	}
	public void setA26_PRODUCT(String a26_PRODUCT) {
		A26_PRODUCT = a26_PRODUCT;
	}
	public BigDecimal getA26_KEY_NON_SKILLED() {
		return A26_KEY_NON_SKILLED;
	}
	public void setA26_KEY_NON_SKILLED(BigDecimal a26_KEY_NON_SKILLED) {
		A26_KEY_NON_SKILLED = a26_KEY_NON_SKILLED;
	}
	public BigDecimal getA26_KEY_NON_UNSKILLED() {
		return A26_KEY_NON_UNSKILLED;
	}
	public void setA26_KEY_NON_UNSKILLED(BigDecimal a26_KEY_NON_UNSKILLED) {
		A26_KEY_NON_UNSKILLED = a26_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA26_KEY_NON_TOTAL() {
		return A26_KEY_NON_TOTAL;
	}
	public void setA26_KEY_NON_TOTAL(BigDecimal a26_KEY_NON_TOTAL) {
		A26_KEY_NON_TOTAL = a26_KEY_NON_TOTAL;
	}
	public BigDecimal getA26_OTH_NON_SKILLED() {
		return A26_OTH_NON_SKILLED;
	}
	public void setA26_OTH_NON_SKILLED(BigDecimal a26_OTH_NON_SKILLED) {
		A26_OTH_NON_SKILLED = a26_OTH_NON_SKILLED;
	}
	public BigDecimal getA26_OTH_NON_UNSKILLED() {
		return A26_OTH_NON_UNSKILLED;
	}
	public void setA26_OTH_NON_UNSKILLED(BigDecimal a26_OTH_NON_UNSKILLED) {
		A26_OTH_NON_UNSKILLED = a26_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA26_OTH_NON_TOTAL() {
		return A26_OTH_NON_TOTAL;
	}
	public void setA26_OTH_NON_TOTAL(BigDecimal a26_OTH_NON_TOTAL) {
		A26_OTH_NON_TOTAL = a26_OTH_NON_TOTAL;
	}
	public BigDecimal getA26_TOTAL_NON_SKILLED() {
		return A26_TOTAL_NON_SKILLED;
	}
	public void setA26_TOTAL_NON_SKILLED(BigDecimal a26_TOTAL_NON_SKILLED) {
		A26_TOTAL_NON_SKILLED = a26_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA26_TOTAL_NON_UNSKILLED() {
		return A26_TOTAL_NON_UNSKILLED;
	}
	public void setA26_TOTAL_NON_UNSKILLED(BigDecimal a26_TOTAL_NON_UNSKILLED) {
		A26_TOTAL_NON_UNSKILLED = a26_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA26_TOTAL_NON_TOTAL() {
		return A26_TOTAL_NON_TOTAL;
	}
	public void setA26_TOTAL_NON_TOTAL(BigDecimal a26_TOTAL_NON_TOTAL) {
		A26_TOTAL_NON_TOTAL = a26_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA26_KEY_SKILLED() {
		return A26_KEY_SKILLED;
	}
	public void setA26_KEY_SKILLED(BigDecimal a26_KEY_SKILLED) {
		A26_KEY_SKILLED = a26_KEY_SKILLED;
	}
	public BigDecimal getA26_KEY_UNSKILLED() {
		return A26_KEY_UNSKILLED;
	}
	public void setA26_KEY_UNSKILLED(BigDecimal a26_KEY_UNSKILLED) {
		A26_KEY_UNSKILLED = a26_KEY_UNSKILLED;
	}
	public BigDecimal getA26_KEY_TOTAL() {
		return A26_KEY_TOTAL;
	}
	public void setA26_KEY_TOTAL(BigDecimal a26_KEY_TOTAL) {
		A26_KEY_TOTAL = a26_KEY_TOTAL;
	}
	public BigDecimal getA26_OTH_SKILLED() {
		return A26_OTH_SKILLED;
	}
	public void setA26_OTH_SKILLED(BigDecimal a26_OTH_SKILLED) {
		A26_OTH_SKILLED = a26_OTH_SKILLED;
	}
	public BigDecimal getA26_OTH_UNSKILLED() {
		return A26_OTH_UNSKILLED;
	}
	public void setA26_OTH_UNSKILLED(BigDecimal a26_OTH_UNSKILLED) {
		A26_OTH_UNSKILLED = a26_OTH_UNSKILLED;
	}
	public BigDecimal getA26_OTH_TOTAL() {
		return A26_OTH_TOTAL;
	}
	public void setA26_OTH_TOTAL(BigDecimal a26_OTH_TOTAL) {
		A26_OTH_TOTAL = a26_OTH_TOTAL;
	}
	public BigDecimal getA26_TOTAL_SKILLED() {
		return A26_TOTAL_SKILLED;
	}
	public void setA26_TOTAL_SKILLED(BigDecimal a26_TOTAL_SKILLED) {
		A26_TOTAL_SKILLED = a26_TOTAL_SKILLED;
	}
	public BigDecimal getA26_TOTAL_UNSKILLED() {
		return A26_TOTAL_UNSKILLED;
	}
	public void setA26_TOTAL_UNSKILLED(BigDecimal a26_TOTAL_UNSKILLED) {
		A26_TOTAL_UNSKILLED = a26_TOTAL_UNSKILLED;
	}
	public BigDecimal getA26_TOTAL_TOTAL() {
		return A26_TOTAL_TOTAL;
	}
	public void setA26_TOTAL_TOTAL(BigDecimal a26_TOTAL_TOTAL) {
		A26_TOTAL_TOTAL = a26_TOTAL_TOTAL;
	}
	public BigDecimal getA26_TOTAL_ALL_SKILLED() {
		return A26_TOTAL_ALL_SKILLED;
	}
	public void setA26_TOTAL_ALL_SKILLED(BigDecimal a26_TOTAL_ALL_SKILLED) {
		A26_TOTAL_ALL_SKILLED = a26_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA26_TOTAL_ALL_UNSKILLED() {
		return A26_TOTAL_ALL_UNSKILLED;
	}
	public void setA26_TOTAL_ALL_UNSKILLED(BigDecimal a26_TOTAL_ALL_UNSKILLED) {
		A26_TOTAL_ALL_UNSKILLED = a26_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA26_TOTAL_ALL_TOTAL() {
		return A26_TOTAL_ALL_TOTAL;
	}
	public void setA26_TOTAL_ALL_TOTAL(BigDecimal a26_TOTAL_ALL_TOTAL) {
		A26_TOTAL_ALL_TOTAL = a26_TOTAL_ALL_TOTAL;
	}
	public String getA27_PRODUCT() {
		return A27_PRODUCT;
	}
	public void setA27_PRODUCT(String a27_PRODUCT) {
		A27_PRODUCT = a27_PRODUCT;
	}
	public BigDecimal getA27_KEY_NON_SKILLED() {
		return A27_KEY_NON_SKILLED;
	}
	public void setA27_KEY_NON_SKILLED(BigDecimal a27_KEY_NON_SKILLED) {
		A27_KEY_NON_SKILLED = a27_KEY_NON_SKILLED;
	}
	public BigDecimal getA27_KEY_NON_UNSKILLED() {
		return A27_KEY_NON_UNSKILLED;
	}
	public void setA27_KEY_NON_UNSKILLED(BigDecimal a27_KEY_NON_UNSKILLED) {
		A27_KEY_NON_UNSKILLED = a27_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA27_KEY_NON_TOTAL() {
		return A27_KEY_NON_TOTAL;
	}
	public void setA27_KEY_NON_TOTAL(BigDecimal a27_KEY_NON_TOTAL) {
		A27_KEY_NON_TOTAL = a27_KEY_NON_TOTAL;
	}
	public BigDecimal getA27_OTH_NON_SKILLED() {
		return A27_OTH_NON_SKILLED;
	}
	public void setA27_OTH_NON_SKILLED(BigDecimal a27_OTH_NON_SKILLED) {
		A27_OTH_NON_SKILLED = a27_OTH_NON_SKILLED;
	}
	public BigDecimal getA27_OTH_NON_UNSKILLED() {
		return A27_OTH_NON_UNSKILLED;
	}
	public void setA27_OTH_NON_UNSKILLED(BigDecimal a27_OTH_NON_UNSKILLED) {
		A27_OTH_NON_UNSKILLED = a27_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA27_OTH_NON_TOTAL() {
		return A27_OTH_NON_TOTAL;
	}
	public void setA27_OTH_NON_TOTAL(BigDecimal a27_OTH_NON_TOTAL) {
		A27_OTH_NON_TOTAL = a27_OTH_NON_TOTAL;
	}
	public BigDecimal getA27_TOTAL_NON_SKILLED() {
		return A27_TOTAL_NON_SKILLED;
	}
	public void setA27_TOTAL_NON_SKILLED(BigDecimal a27_TOTAL_NON_SKILLED) {
		A27_TOTAL_NON_SKILLED = a27_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA27_TOTAL_NON_UNSKILLED() {
		return A27_TOTAL_NON_UNSKILLED;
	}
	public void setA27_TOTAL_NON_UNSKILLED(BigDecimal a27_TOTAL_NON_UNSKILLED) {
		A27_TOTAL_NON_UNSKILLED = a27_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA27_TOTAL_NON_TOTAL() {
		return A27_TOTAL_NON_TOTAL;
	}
	public void setA27_TOTAL_NON_TOTAL(BigDecimal a27_TOTAL_NON_TOTAL) {
		A27_TOTAL_NON_TOTAL = a27_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA27_KEY_SKILLED() {
		return A27_KEY_SKILLED;
	}
	public void setA27_KEY_SKILLED(BigDecimal a27_KEY_SKILLED) {
		A27_KEY_SKILLED = a27_KEY_SKILLED;
	}
	public BigDecimal getA27_KEY_UNSKILLED() {
		return A27_KEY_UNSKILLED;
	}
	public void setA27_KEY_UNSKILLED(BigDecimal a27_KEY_UNSKILLED) {
		A27_KEY_UNSKILLED = a27_KEY_UNSKILLED;
	}
	public BigDecimal getA27_KEY_TOTAL() {
		return A27_KEY_TOTAL;
	}
	public void setA27_KEY_TOTAL(BigDecimal a27_KEY_TOTAL) {
		A27_KEY_TOTAL = a27_KEY_TOTAL;
	}
	public BigDecimal getA27_OTH_SKILLED() {
		return A27_OTH_SKILLED;
	}
	public void setA27_OTH_SKILLED(BigDecimal a27_OTH_SKILLED) {
		A27_OTH_SKILLED = a27_OTH_SKILLED;
	}
	public BigDecimal getA27_OTH_UNSKILLED() {
		return A27_OTH_UNSKILLED;
	}
	public void setA27_OTH_UNSKILLED(BigDecimal a27_OTH_UNSKILLED) {
		A27_OTH_UNSKILLED = a27_OTH_UNSKILLED;
	}
	public BigDecimal getA27_OTH_TOTAL() {
		return A27_OTH_TOTAL;
	}
	public void setA27_OTH_TOTAL(BigDecimal a27_OTH_TOTAL) {
		A27_OTH_TOTAL = a27_OTH_TOTAL;
	}
	public BigDecimal getA27_TOTAL_SKILLED() {
		return A27_TOTAL_SKILLED;
	}
	public void setA27_TOTAL_SKILLED(BigDecimal a27_TOTAL_SKILLED) {
		A27_TOTAL_SKILLED = a27_TOTAL_SKILLED;
	}
	public BigDecimal getA27_TOTAL_UNSKILLED() {
		return A27_TOTAL_UNSKILLED;
	}
	public void setA27_TOTAL_UNSKILLED(BigDecimal a27_TOTAL_UNSKILLED) {
		A27_TOTAL_UNSKILLED = a27_TOTAL_UNSKILLED;
	}
	public BigDecimal getA27_TOTAL_TOTAL() {
		return A27_TOTAL_TOTAL;
	}
	public void setA27_TOTAL_TOTAL(BigDecimal a27_TOTAL_TOTAL) {
		A27_TOTAL_TOTAL = a27_TOTAL_TOTAL;
	}
	public BigDecimal getA27_TOTAL_ALL_SKILLED() {
		return A27_TOTAL_ALL_SKILLED;
	}
	public void setA27_TOTAL_ALL_SKILLED(BigDecimal a27_TOTAL_ALL_SKILLED) {
		A27_TOTAL_ALL_SKILLED = a27_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA27_TOTAL_ALL_UNSKILLED() {
		return A27_TOTAL_ALL_UNSKILLED;
	}
	public void setA27_TOTAL_ALL_UNSKILLED(BigDecimal a27_TOTAL_ALL_UNSKILLED) {
		A27_TOTAL_ALL_UNSKILLED = a27_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA27_TOTAL_ALL_TOTAL() {
		return A27_TOTAL_ALL_TOTAL;
	}
	public void setA27_TOTAL_ALL_TOTAL(BigDecimal a27_TOTAL_ALL_TOTAL) {
		A27_TOTAL_ALL_TOTAL = a27_TOTAL_ALL_TOTAL;
	}
	public String getA28_PRODUCT() {
		return A28_PRODUCT;
	}
	public void setA28_PRODUCT(String a28_PRODUCT) {
		A28_PRODUCT = a28_PRODUCT;
	}
	public BigDecimal getA28_KEY_NON_SKILLED() {
		return A28_KEY_NON_SKILLED;
	}
	public void setA28_KEY_NON_SKILLED(BigDecimal a28_KEY_NON_SKILLED) {
		A28_KEY_NON_SKILLED = a28_KEY_NON_SKILLED;
	}
	public BigDecimal getA28_KEY_NON_UNSKILLED() {
		return A28_KEY_NON_UNSKILLED;
	}
	public void setA28_KEY_NON_UNSKILLED(BigDecimal a28_KEY_NON_UNSKILLED) {
		A28_KEY_NON_UNSKILLED = a28_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA28_KEY_NON_TOTAL() {
		return A28_KEY_NON_TOTAL;
	}
	public void setA28_KEY_NON_TOTAL(BigDecimal a28_KEY_NON_TOTAL) {
		A28_KEY_NON_TOTAL = a28_KEY_NON_TOTAL;
	}
	public BigDecimal getA28_OTH_NON_SKILLED() {
		return A28_OTH_NON_SKILLED;
	}
	public void setA28_OTH_NON_SKILLED(BigDecimal a28_OTH_NON_SKILLED) {
		A28_OTH_NON_SKILLED = a28_OTH_NON_SKILLED;
	}
	public BigDecimal getA28_OTH_NON_UNSKILLED() {
		return A28_OTH_NON_UNSKILLED;
	}
	public void setA28_OTH_NON_UNSKILLED(BigDecimal a28_OTH_NON_UNSKILLED) {
		A28_OTH_NON_UNSKILLED = a28_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA28_OTH_NON_TOTAL() {
		return A28_OTH_NON_TOTAL;
	}
	public void setA28_OTH_NON_TOTAL(BigDecimal a28_OTH_NON_TOTAL) {
		A28_OTH_NON_TOTAL = a28_OTH_NON_TOTAL;
	}
	public BigDecimal getA28_TOTAL_NON_SKILLED() {
		return A28_TOTAL_NON_SKILLED;
	}
	public void setA28_TOTAL_NON_SKILLED(BigDecimal a28_TOTAL_NON_SKILLED) {
		A28_TOTAL_NON_SKILLED = a28_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA28_TOTAL_NON_UNSKILLED() {
		return A28_TOTAL_NON_UNSKILLED;
	}
	public void setA28_TOTAL_NON_UNSKILLED(BigDecimal a28_TOTAL_NON_UNSKILLED) {
		A28_TOTAL_NON_UNSKILLED = a28_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA28_TOTAL_NON_TOTAL() {
		return A28_TOTAL_NON_TOTAL;
	}
	public void setA28_TOTAL_NON_TOTAL(BigDecimal a28_TOTAL_NON_TOTAL) {
		A28_TOTAL_NON_TOTAL = a28_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA28_KEY_SKILLED() {
		return A28_KEY_SKILLED;
	}
	public void setA28_KEY_SKILLED(BigDecimal a28_KEY_SKILLED) {
		A28_KEY_SKILLED = a28_KEY_SKILLED;
	}
	public BigDecimal getA28_KEY_UNSKILLED() {
		return A28_KEY_UNSKILLED;
	}
	public void setA28_KEY_UNSKILLED(BigDecimal a28_KEY_UNSKILLED) {
		A28_KEY_UNSKILLED = a28_KEY_UNSKILLED;
	}
	public BigDecimal getA28_KEY_TOTAL() {
		return A28_KEY_TOTAL;
	}
	public void setA28_KEY_TOTAL(BigDecimal a28_KEY_TOTAL) {
		A28_KEY_TOTAL = a28_KEY_TOTAL;
	}
	public BigDecimal getA28_OTH_SKILLED() {
		return A28_OTH_SKILLED;
	}
	public void setA28_OTH_SKILLED(BigDecimal a28_OTH_SKILLED) {
		A28_OTH_SKILLED = a28_OTH_SKILLED;
	}
	public BigDecimal getA28_OTH_UNSKILLED() {
		return A28_OTH_UNSKILLED;
	}
	public void setA28_OTH_UNSKILLED(BigDecimal a28_OTH_UNSKILLED) {
		A28_OTH_UNSKILLED = a28_OTH_UNSKILLED;
	}
	public BigDecimal getA28_OTH_TOTAL() {
		return A28_OTH_TOTAL;
	}
	public void setA28_OTH_TOTAL(BigDecimal a28_OTH_TOTAL) {
		A28_OTH_TOTAL = a28_OTH_TOTAL;
	}
	public BigDecimal getA28_TOTAL_SKILLED() {
		return A28_TOTAL_SKILLED;
	}
	public void setA28_TOTAL_SKILLED(BigDecimal a28_TOTAL_SKILLED) {
		A28_TOTAL_SKILLED = a28_TOTAL_SKILLED;
	}
	public BigDecimal getA28_TOTAL_UNSKILLED() {
		return A28_TOTAL_UNSKILLED;
	}
	public void setA28_TOTAL_UNSKILLED(BigDecimal a28_TOTAL_UNSKILLED) {
		A28_TOTAL_UNSKILLED = a28_TOTAL_UNSKILLED;
	}
	public BigDecimal getA28_TOTAL_TOTAL() {
		return A28_TOTAL_TOTAL;
	}
	public void setA28_TOTAL_TOTAL(BigDecimal a28_TOTAL_TOTAL) {
		A28_TOTAL_TOTAL = a28_TOTAL_TOTAL;
	}
	public BigDecimal getA28_TOTAL_ALL_SKILLED() {
		return A28_TOTAL_ALL_SKILLED;
	}
	public void setA28_TOTAL_ALL_SKILLED(BigDecimal a28_TOTAL_ALL_SKILLED) {
		A28_TOTAL_ALL_SKILLED = a28_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA28_TOTAL_ALL_UNSKILLED() {
		return A28_TOTAL_ALL_UNSKILLED;
	}
	public void setA28_TOTAL_ALL_UNSKILLED(BigDecimal a28_TOTAL_ALL_UNSKILLED) {
		A28_TOTAL_ALL_UNSKILLED = a28_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA28_TOTAL_ALL_TOTAL() {
		return A28_TOTAL_ALL_TOTAL;
	}
	public void setA28_TOTAL_ALL_TOTAL(BigDecimal a28_TOTAL_ALL_TOTAL) {
		A28_TOTAL_ALL_TOTAL = a28_TOTAL_ALL_TOTAL;
	}
	public String getA29_PRODUCT() {
		return A29_PRODUCT;
	}
	public void setA29_PRODUCT(String a29_PRODUCT) {
		A29_PRODUCT = a29_PRODUCT;
	}
	public BigDecimal getA29_KEY_NON_SKILLED() {
		return A29_KEY_NON_SKILLED;
	}
	public void setA29_KEY_NON_SKILLED(BigDecimal a29_KEY_NON_SKILLED) {
		A29_KEY_NON_SKILLED = a29_KEY_NON_SKILLED;
	}
	public BigDecimal getA29_KEY_NON_UNSKILLED() {
		return A29_KEY_NON_UNSKILLED;
	}
	public void setA29_KEY_NON_UNSKILLED(BigDecimal a29_KEY_NON_UNSKILLED) {
		A29_KEY_NON_UNSKILLED = a29_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA29_KEY_NON_TOTAL() {
		return A29_KEY_NON_TOTAL;
	}
	public void setA29_KEY_NON_TOTAL(BigDecimal a29_KEY_NON_TOTAL) {
		A29_KEY_NON_TOTAL = a29_KEY_NON_TOTAL;
	}
	public BigDecimal getA29_OTH_NON_SKILLED() {
		return A29_OTH_NON_SKILLED;
	}
	public void setA29_OTH_NON_SKILLED(BigDecimal a29_OTH_NON_SKILLED) {
		A29_OTH_NON_SKILLED = a29_OTH_NON_SKILLED;
	}
	public BigDecimal getA29_OTH_NON_UNSKILLED() {
		return A29_OTH_NON_UNSKILLED;
	}
	public void setA29_OTH_NON_UNSKILLED(BigDecimal a29_OTH_NON_UNSKILLED) {
		A29_OTH_NON_UNSKILLED = a29_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA29_OTH_NON_TOTAL() {
		return A29_OTH_NON_TOTAL;
	}
	public void setA29_OTH_NON_TOTAL(BigDecimal a29_OTH_NON_TOTAL) {
		A29_OTH_NON_TOTAL = a29_OTH_NON_TOTAL;
	}
	public BigDecimal getA29_TOTAL_NON_SKILLED() {
		return A29_TOTAL_NON_SKILLED;
	}
	public void setA29_TOTAL_NON_SKILLED(BigDecimal a29_TOTAL_NON_SKILLED) {
		A29_TOTAL_NON_SKILLED = a29_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA29_TOTAL_NON_UNSKILLED() {
		return A29_TOTAL_NON_UNSKILLED;
	}
	public void setA29_TOTAL_NON_UNSKILLED(BigDecimal a29_TOTAL_NON_UNSKILLED) {
		A29_TOTAL_NON_UNSKILLED = a29_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA29_TOTAL_NON_TOTAL() {
		return A29_TOTAL_NON_TOTAL;
	}
	public void setA29_TOTAL_NON_TOTAL(BigDecimal a29_TOTAL_NON_TOTAL) {
		A29_TOTAL_NON_TOTAL = a29_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA29_KEY_SKILLED() {
		return A29_KEY_SKILLED;
	}
	public void setA29_KEY_SKILLED(BigDecimal a29_KEY_SKILLED) {
		A29_KEY_SKILLED = a29_KEY_SKILLED;
	}
	public BigDecimal getA29_KEY_UNSKILLED() {
		return A29_KEY_UNSKILLED;
	}
	public void setA29_KEY_UNSKILLED(BigDecimal a29_KEY_UNSKILLED) {
		A29_KEY_UNSKILLED = a29_KEY_UNSKILLED;
	}
	public BigDecimal getA29_KEY_TOTAL() {
		return A29_KEY_TOTAL;
	}
	public void setA29_KEY_TOTAL(BigDecimal a29_KEY_TOTAL) {
		A29_KEY_TOTAL = a29_KEY_TOTAL;
	}
	public BigDecimal getA29_OTH_SKILLED() {
		return A29_OTH_SKILLED;
	}
	public void setA29_OTH_SKILLED(BigDecimal a29_OTH_SKILLED) {
		A29_OTH_SKILLED = a29_OTH_SKILLED;
	}
	public BigDecimal getA29_OTH_UNSKILLED() {
		return A29_OTH_UNSKILLED;
	}
	public void setA29_OTH_UNSKILLED(BigDecimal a29_OTH_UNSKILLED) {
		A29_OTH_UNSKILLED = a29_OTH_UNSKILLED;
	}
	public BigDecimal getA29_OTH_TOTAL() {
		return A29_OTH_TOTAL;
	}
	public void setA29_OTH_TOTAL(BigDecimal a29_OTH_TOTAL) {
		A29_OTH_TOTAL = a29_OTH_TOTAL;
	}
	public BigDecimal getA29_TOTAL_SKILLED() {
		return A29_TOTAL_SKILLED;
	}
	public void setA29_TOTAL_SKILLED(BigDecimal a29_TOTAL_SKILLED) {
		A29_TOTAL_SKILLED = a29_TOTAL_SKILLED;
	}
	public BigDecimal getA29_TOTAL_UNSKILLED() {
		return A29_TOTAL_UNSKILLED;
	}
	public void setA29_TOTAL_UNSKILLED(BigDecimal a29_TOTAL_UNSKILLED) {
		A29_TOTAL_UNSKILLED = a29_TOTAL_UNSKILLED;
	}
	public BigDecimal getA29_TOTAL_TOTAL() {
		return A29_TOTAL_TOTAL;
	}
	public void setA29_TOTAL_TOTAL(BigDecimal a29_TOTAL_TOTAL) {
		A29_TOTAL_TOTAL = a29_TOTAL_TOTAL;
	}
	public BigDecimal getA29_TOTAL_ALL_SKILLED() {
		return A29_TOTAL_ALL_SKILLED;
	}
	public void setA29_TOTAL_ALL_SKILLED(BigDecimal a29_TOTAL_ALL_SKILLED) {
		A29_TOTAL_ALL_SKILLED = a29_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA29_TOTAL_ALL_UNSKILLED() {
		return A29_TOTAL_ALL_UNSKILLED;
	}
	public void setA29_TOTAL_ALL_UNSKILLED(BigDecimal a29_TOTAL_ALL_UNSKILLED) {
		A29_TOTAL_ALL_UNSKILLED = a29_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA29_TOTAL_ALL_TOTAL() {
		return A29_TOTAL_ALL_TOTAL;
	}
	public void setA29_TOTAL_ALL_TOTAL(BigDecimal a29_TOTAL_ALL_TOTAL) {
		A29_TOTAL_ALL_TOTAL = a29_TOTAL_ALL_TOTAL;
	}
	public String getA30_PRODUCT() {
		return A30_PRODUCT;
	}
	public void setA30_PRODUCT(String a30_PRODUCT) {
		A30_PRODUCT = a30_PRODUCT;
	}
	public BigDecimal getA30_KEY_NON_SKILLED() {
		return A30_KEY_NON_SKILLED;
	}
	public void setA30_KEY_NON_SKILLED(BigDecimal a30_KEY_NON_SKILLED) {
		A30_KEY_NON_SKILLED = a30_KEY_NON_SKILLED;
	}
	public BigDecimal getA30_KEY_NON_UNSKILLED() {
		return A30_KEY_NON_UNSKILLED;
	}
	public void setA30_KEY_NON_UNSKILLED(BigDecimal a30_KEY_NON_UNSKILLED) {
		A30_KEY_NON_UNSKILLED = a30_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA30_KEY_NON_TOTAL() {
		return A30_KEY_NON_TOTAL;
	}
	public void setA30_KEY_NON_TOTAL(BigDecimal a30_KEY_NON_TOTAL) {
		A30_KEY_NON_TOTAL = a30_KEY_NON_TOTAL;
	}
	public BigDecimal getA30_OTH_NON_SKILLED() {
		return A30_OTH_NON_SKILLED;
	}
	public void setA30_OTH_NON_SKILLED(BigDecimal a30_OTH_NON_SKILLED) {
		A30_OTH_NON_SKILLED = a30_OTH_NON_SKILLED;
	}
	public BigDecimal getA30_OTH_NON_UNSKILLED() {
		return A30_OTH_NON_UNSKILLED;
	}
	public void setA30_OTH_NON_UNSKILLED(BigDecimal a30_OTH_NON_UNSKILLED) {
		A30_OTH_NON_UNSKILLED = a30_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA30_OTH_NON_TOTAL() {
		return A30_OTH_NON_TOTAL;
	}
	public void setA30_OTH_NON_TOTAL(BigDecimal a30_OTH_NON_TOTAL) {
		A30_OTH_NON_TOTAL = a30_OTH_NON_TOTAL;
	}
	public BigDecimal getA30_TOTAL_NON_SKILLED() {
		return A30_TOTAL_NON_SKILLED;
	}
	public void setA30_TOTAL_NON_SKILLED(BigDecimal a30_TOTAL_NON_SKILLED) {
		A30_TOTAL_NON_SKILLED = a30_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA30_TOTAL_NON_UNSKILLED() {
		return A30_TOTAL_NON_UNSKILLED;
	}
	public void setA30_TOTAL_NON_UNSKILLED(BigDecimal a30_TOTAL_NON_UNSKILLED) {
		A30_TOTAL_NON_UNSKILLED = a30_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA30_TOTAL_NON_TOTAL() {
		return A30_TOTAL_NON_TOTAL;
	}
	public void setA30_TOTAL_NON_TOTAL(BigDecimal a30_TOTAL_NON_TOTAL) {
		A30_TOTAL_NON_TOTAL = a30_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA30_KEY_SKILLED() {
		return A30_KEY_SKILLED;
	}
	public void setA30_KEY_SKILLED(BigDecimal a30_KEY_SKILLED) {
		A30_KEY_SKILLED = a30_KEY_SKILLED;
	}
	public BigDecimal getA30_KEY_UNSKILLED() {
		return A30_KEY_UNSKILLED;
	}
	public void setA30_KEY_UNSKILLED(BigDecimal a30_KEY_UNSKILLED) {
		A30_KEY_UNSKILLED = a30_KEY_UNSKILLED;
	}
	public BigDecimal getA30_KEY_TOTAL() {
		return A30_KEY_TOTAL;
	}
	public void setA30_KEY_TOTAL(BigDecimal a30_KEY_TOTAL) {
		A30_KEY_TOTAL = a30_KEY_TOTAL;
	}
	public BigDecimal getA30_OTH_SKILLED() {
		return A30_OTH_SKILLED;
	}
	public void setA30_OTH_SKILLED(BigDecimal a30_OTH_SKILLED) {
		A30_OTH_SKILLED = a30_OTH_SKILLED;
	}
	public BigDecimal getA30_OTH_UNSKILLED() {
		return A30_OTH_UNSKILLED;
	}
	public void setA30_OTH_UNSKILLED(BigDecimal a30_OTH_UNSKILLED) {
		A30_OTH_UNSKILLED = a30_OTH_UNSKILLED;
	}
	public BigDecimal getA30_OTH_TOTAL() {
		return A30_OTH_TOTAL;
	}
	public void setA30_OTH_TOTAL(BigDecimal a30_OTH_TOTAL) {
		A30_OTH_TOTAL = a30_OTH_TOTAL;
	}
	public BigDecimal getA30_TOTAL_SKILLED() {
		return A30_TOTAL_SKILLED;
	}
	public void setA30_TOTAL_SKILLED(BigDecimal a30_TOTAL_SKILLED) {
		A30_TOTAL_SKILLED = a30_TOTAL_SKILLED;
	}
	public BigDecimal getA30_TOTAL_UNSKILLED() {
		return A30_TOTAL_UNSKILLED;
	}
	public void setA30_TOTAL_UNSKILLED(BigDecimal a30_TOTAL_UNSKILLED) {
		A30_TOTAL_UNSKILLED = a30_TOTAL_UNSKILLED;
	}
	public BigDecimal getA30_TOTAL_TOTAL() {
		return A30_TOTAL_TOTAL;
	}
	public void setA30_TOTAL_TOTAL(BigDecimal a30_TOTAL_TOTAL) {
		A30_TOTAL_TOTAL = a30_TOTAL_TOTAL;
	}
	public BigDecimal getA30_TOTAL_ALL_SKILLED() {
		return A30_TOTAL_ALL_SKILLED;
	}
	public void setA30_TOTAL_ALL_SKILLED(BigDecimal a30_TOTAL_ALL_SKILLED) {
		A30_TOTAL_ALL_SKILLED = a30_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA30_TOTAL_ALL_UNSKILLED() {
		return A30_TOTAL_ALL_UNSKILLED;
	}
	public void setA30_TOTAL_ALL_UNSKILLED(BigDecimal a30_TOTAL_ALL_UNSKILLED) {
		A30_TOTAL_ALL_UNSKILLED = a30_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA30_TOTAL_ALL_TOTAL() {
		return A30_TOTAL_ALL_TOTAL;
	}
	public void setA30_TOTAL_ALL_TOTAL(BigDecimal a30_TOTAL_ALL_TOTAL) {
		A30_TOTAL_ALL_TOTAL = a30_TOTAL_ALL_TOTAL;
	}
	public String getA31_PRODUCT() {
		return A31_PRODUCT;
	}
	public void setA31_PRODUCT(String a31_PRODUCT) {
		A31_PRODUCT = a31_PRODUCT;
	}
	public BigDecimal getA31_KEY_NON_SKILLED() {
		return A31_KEY_NON_SKILLED;
	}
	public void setA31_KEY_NON_SKILLED(BigDecimal a31_KEY_NON_SKILLED) {
		A31_KEY_NON_SKILLED = a31_KEY_NON_SKILLED;
	}
	public BigDecimal getA31_KEY_NON_UNSKILLED() {
		return A31_KEY_NON_UNSKILLED;
	}
	public void setA31_KEY_NON_UNSKILLED(BigDecimal a31_KEY_NON_UNSKILLED) {
		A31_KEY_NON_UNSKILLED = a31_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA31_KEY_NON_TOTAL() {
		return A31_KEY_NON_TOTAL;
	}
	public void setA31_KEY_NON_TOTAL(BigDecimal a31_KEY_NON_TOTAL) {
		A31_KEY_NON_TOTAL = a31_KEY_NON_TOTAL;
	}
	public BigDecimal getA31_OTH_NON_SKILLED() {
		return A31_OTH_NON_SKILLED;
	}
	public void setA31_OTH_NON_SKILLED(BigDecimal a31_OTH_NON_SKILLED) {
		A31_OTH_NON_SKILLED = a31_OTH_NON_SKILLED;
	}
	public BigDecimal getA31_OTH_NON_UNSKILLED() {
		return A31_OTH_NON_UNSKILLED;
	}
	public void setA31_OTH_NON_UNSKILLED(BigDecimal a31_OTH_NON_UNSKILLED) {
		A31_OTH_NON_UNSKILLED = a31_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA31_OTH_NON_TOTAL() {
		return A31_OTH_NON_TOTAL;
	}
	public void setA31_OTH_NON_TOTAL(BigDecimal a31_OTH_NON_TOTAL) {
		A31_OTH_NON_TOTAL = a31_OTH_NON_TOTAL;
	}
	public BigDecimal getA31_TOTAL_NON_SKILLED() {
		return A31_TOTAL_NON_SKILLED;
	}
	public void setA31_TOTAL_NON_SKILLED(BigDecimal a31_TOTAL_NON_SKILLED) {
		A31_TOTAL_NON_SKILLED = a31_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA31_TOTAL_NON_UNSKILLED() {
		return A31_TOTAL_NON_UNSKILLED;
	}
	public void setA31_TOTAL_NON_UNSKILLED(BigDecimal a31_TOTAL_NON_UNSKILLED) {
		A31_TOTAL_NON_UNSKILLED = a31_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA31_TOTAL_NON_TOTAL() {
		return A31_TOTAL_NON_TOTAL;
	}
	public void setA31_TOTAL_NON_TOTAL(BigDecimal a31_TOTAL_NON_TOTAL) {
		A31_TOTAL_NON_TOTAL = a31_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA31_KEY_SKILLED() {
		return A31_KEY_SKILLED;
	}
	public void setA31_KEY_SKILLED(BigDecimal a31_KEY_SKILLED) {
		A31_KEY_SKILLED = a31_KEY_SKILLED;
	}
	public BigDecimal getA31_KEY_UNSKILLED() {
		return A31_KEY_UNSKILLED;
	}
	public void setA31_KEY_UNSKILLED(BigDecimal a31_KEY_UNSKILLED) {
		A31_KEY_UNSKILLED = a31_KEY_UNSKILLED;
	}
	public BigDecimal getA31_KEY_TOTAL() {
		return A31_KEY_TOTAL;
	}
	public void setA31_KEY_TOTAL(BigDecimal a31_KEY_TOTAL) {
		A31_KEY_TOTAL = a31_KEY_TOTAL;
	}
	public BigDecimal getA31_OTH_SKILLED() {
		return A31_OTH_SKILLED;
	}
	public void setA31_OTH_SKILLED(BigDecimal a31_OTH_SKILLED) {
		A31_OTH_SKILLED = a31_OTH_SKILLED;
	}
	public BigDecimal getA31_OTH_UNSKILLED() {
		return A31_OTH_UNSKILLED;
	}
	public void setA31_OTH_UNSKILLED(BigDecimal a31_OTH_UNSKILLED) {
		A31_OTH_UNSKILLED = a31_OTH_UNSKILLED;
	}
	public BigDecimal getA31_OTH_TOTAL() {
		return A31_OTH_TOTAL;
	}
	public void setA31_OTH_TOTAL(BigDecimal a31_OTH_TOTAL) {
		A31_OTH_TOTAL = a31_OTH_TOTAL;
	}
	public BigDecimal getA31_TOTAL_SKILLED() {
		return A31_TOTAL_SKILLED;
	}
	public void setA31_TOTAL_SKILLED(BigDecimal a31_TOTAL_SKILLED) {
		A31_TOTAL_SKILLED = a31_TOTAL_SKILLED;
	}
	public BigDecimal getA31_TOTAL_UNSKILLED() {
		return A31_TOTAL_UNSKILLED;
	}
	public void setA31_TOTAL_UNSKILLED(BigDecimal a31_TOTAL_UNSKILLED) {
		A31_TOTAL_UNSKILLED = a31_TOTAL_UNSKILLED;
	}
	public BigDecimal getA31_TOTAL_TOTAL() {
		return A31_TOTAL_TOTAL;
	}
	public void setA31_TOTAL_TOTAL(BigDecimal a31_TOTAL_TOTAL) {
		A31_TOTAL_TOTAL = a31_TOTAL_TOTAL;
	}
	public BigDecimal getA31_TOTAL_ALL_SKILLED() {
		return A31_TOTAL_ALL_SKILLED;
	}
	public void setA31_TOTAL_ALL_SKILLED(BigDecimal a31_TOTAL_ALL_SKILLED) {
		A31_TOTAL_ALL_SKILLED = a31_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA31_TOTAL_ALL_UNSKILLED() {
		return A31_TOTAL_ALL_UNSKILLED;
	}
	public void setA31_TOTAL_ALL_UNSKILLED(BigDecimal a31_TOTAL_ALL_UNSKILLED) {
		A31_TOTAL_ALL_UNSKILLED = a31_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA31_TOTAL_ALL_TOTAL() {
		return A31_TOTAL_ALL_TOTAL;
	}
	public void setA31_TOTAL_ALL_TOTAL(BigDecimal a31_TOTAL_ALL_TOTAL) {
		A31_TOTAL_ALL_TOTAL = a31_TOTAL_ALL_TOTAL;
	}
	public String getA32_PRODUCT() {
		return A32_PRODUCT;
	}
	public void setA32_PRODUCT(String a32_PRODUCT) {
		A32_PRODUCT = a32_PRODUCT;
	}
	public BigDecimal getA32_KEY_NON_SKILLED() {
		return A32_KEY_NON_SKILLED;
	}
	public void setA32_KEY_NON_SKILLED(BigDecimal a32_KEY_NON_SKILLED) {
		A32_KEY_NON_SKILLED = a32_KEY_NON_SKILLED;
	}
	public BigDecimal getA32_KEY_NON_UNSKILLED() {
		return A32_KEY_NON_UNSKILLED;
	}
	public void setA32_KEY_NON_UNSKILLED(BigDecimal a32_KEY_NON_UNSKILLED) {
		A32_KEY_NON_UNSKILLED = a32_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA32_KEY_NON_TOTAL() {
		return A32_KEY_NON_TOTAL;
	}
	public void setA32_KEY_NON_TOTAL(BigDecimal a32_KEY_NON_TOTAL) {
		A32_KEY_NON_TOTAL = a32_KEY_NON_TOTAL;
	}
	public BigDecimal getA32_OTH_NON_SKILLED() {
		return A32_OTH_NON_SKILLED;
	}
	public void setA32_OTH_NON_SKILLED(BigDecimal a32_OTH_NON_SKILLED) {
		A32_OTH_NON_SKILLED = a32_OTH_NON_SKILLED;
	}
	public BigDecimal getA32_OTH_NON_UNSKILLED() {
		return A32_OTH_NON_UNSKILLED;
	}
	public void setA32_OTH_NON_UNSKILLED(BigDecimal a32_OTH_NON_UNSKILLED) {
		A32_OTH_NON_UNSKILLED = a32_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA32_OTH_NON_TOTAL() {
		return A32_OTH_NON_TOTAL;
	}
	public void setA32_OTH_NON_TOTAL(BigDecimal a32_OTH_NON_TOTAL) {
		A32_OTH_NON_TOTAL = a32_OTH_NON_TOTAL;
	}
	public BigDecimal getA32_TOTAL_NON_SKILLED() {
		return A32_TOTAL_NON_SKILLED;
	}
	public void setA32_TOTAL_NON_SKILLED(BigDecimal a32_TOTAL_NON_SKILLED) {
		A32_TOTAL_NON_SKILLED = a32_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA32_TOTAL_NON_UNSKILLED() {
		return A32_TOTAL_NON_UNSKILLED;
	}
	public void setA32_TOTAL_NON_UNSKILLED(BigDecimal a32_TOTAL_NON_UNSKILLED) {
		A32_TOTAL_NON_UNSKILLED = a32_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA32_TOTAL_NON_TOTAL() {
		return A32_TOTAL_NON_TOTAL;
	}
	public void setA32_TOTAL_NON_TOTAL(BigDecimal a32_TOTAL_NON_TOTAL) {
		A32_TOTAL_NON_TOTAL = a32_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA32_KEY_SKILLED() {
		return A32_KEY_SKILLED;
	}
	public void setA32_KEY_SKILLED(BigDecimal a32_KEY_SKILLED) {
		A32_KEY_SKILLED = a32_KEY_SKILLED;
	}
	public BigDecimal getA32_KEY_UNSKILLED() {
		return A32_KEY_UNSKILLED;
	}
	public void setA32_KEY_UNSKILLED(BigDecimal a32_KEY_UNSKILLED) {
		A32_KEY_UNSKILLED = a32_KEY_UNSKILLED;
	}
	public BigDecimal getA32_KEY_TOTAL() {
		return A32_KEY_TOTAL;
	}
	public void setA32_KEY_TOTAL(BigDecimal a32_KEY_TOTAL) {
		A32_KEY_TOTAL = a32_KEY_TOTAL;
	}
	public BigDecimal getA32_OTH_SKILLED() {
		return A32_OTH_SKILLED;
	}
	public void setA32_OTH_SKILLED(BigDecimal a32_OTH_SKILLED) {
		A32_OTH_SKILLED = a32_OTH_SKILLED;
	}
	public BigDecimal getA32_OTH_UNSKILLED() {
		return A32_OTH_UNSKILLED;
	}
	public void setA32_OTH_UNSKILLED(BigDecimal a32_OTH_UNSKILLED) {
		A32_OTH_UNSKILLED = a32_OTH_UNSKILLED;
	}
	public BigDecimal getA32_OTH_TOTAL() {
		return A32_OTH_TOTAL;
	}
	public void setA32_OTH_TOTAL(BigDecimal a32_OTH_TOTAL) {
		A32_OTH_TOTAL = a32_OTH_TOTAL;
	}
	public BigDecimal getA32_TOTAL_SKILLED() {
		return A32_TOTAL_SKILLED;
	}
	public void setA32_TOTAL_SKILLED(BigDecimal a32_TOTAL_SKILLED) {
		A32_TOTAL_SKILLED = a32_TOTAL_SKILLED;
	}
	public BigDecimal getA32_TOTAL_UNSKILLED() {
		return A32_TOTAL_UNSKILLED;
	}
	public void setA32_TOTAL_UNSKILLED(BigDecimal a32_TOTAL_UNSKILLED) {
		A32_TOTAL_UNSKILLED = a32_TOTAL_UNSKILLED;
	}
	public BigDecimal getA32_TOTAL_TOTAL() {
		return A32_TOTAL_TOTAL;
	}
	public void setA32_TOTAL_TOTAL(BigDecimal a32_TOTAL_TOTAL) {
		A32_TOTAL_TOTAL = a32_TOTAL_TOTAL;
	}
	public BigDecimal getA32_TOTAL_ALL_SKILLED() {
		return A32_TOTAL_ALL_SKILLED;
	}
	public void setA32_TOTAL_ALL_SKILLED(BigDecimal a32_TOTAL_ALL_SKILLED) {
		A32_TOTAL_ALL_SKILLED = a32_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA32_TOTAL_ALL_UNSKILLED() {
		return A32_TOTAL_ALL_UNSKILLED;
	}
	public void setA32_TOTAL_ALL_UNSKILLED(BigDecimal a32_TOTAL_ALL_UNSKILLED) {
		A32_TOTAL_ALL_UNSKILLED = a32_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA32_TOTAL_ALL_TOTAL() {
		return A32_TOTAL_ALL_TOTAL;
	}
	public void setA32_TOTAL_ALL_TOTAL(BigDecimal a32_TOTAL_ALL_TOTAL) {
		A32_TOTAL_ALL_TOTAL = a32_TOTAL_ALL_TOTAL;
	}
	public String getA33_PRODUCT() {
		return A33_PRODUCT;
	}
	public void setA33_PRODUCT(String a33_PRODUCT) {
		A33_PRODUCT = a33_PRODUCT;
	}
	public BigDecimal getA33_KEY_NON_SKILLED() {
		return A33_KEY_NON_SKILLED;
	}
	public void setA33_KEY_NON_SKILLED(BigDecimal a33_KEY_NON_SKILLED) {
		A33_KEY_NON_SKILLED = a33_KEY_NON_SKILLED;
	}
	public BigDecimal getA33_KEY_NON_UNSKILLED() {
		return A33_KEY_NON_UNSKILLED;
	}
	public void setA33_KEY_NON_UNSKILLED(BigDecimal a33_KEY_NON_UNSKILLED) {
		A33_KEY_NON_UNSKILLED = a33_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA33_KEY_NON_TOTAL() {
		return A33_KEY_NON_TOTAL;
	}
	public void setA33_KEY_NON_TOTAL(BigDecimal a33_KEY_NON_TOTAL) {
		A33_KEY_NON_TOTAL = a33_KEY_NON_TOTAL;
	}
	public BigDecimal getA33_OTH_NON_SKILLED() {
		return A33_OTH_NON_SKILLED;
	}
	public void setA33_OTH_NON_SKILLED(BigDecimal a33_OTH_NON_SKILLED) {
		A33_OTH_NON_SKILLED = a33_OTH_NON_SKILLED;
	}
	public BigDecimal getA33_OTH_NON_UNSKILLED() {
		return A33_OTH_NON_UNSKILLED;
	}
	public void setA33_OTH_NON_UNSKILLED(BigDecimal a33_OTH_NON_UNSKILLED) {
		A33_OTH_NON_UNSKILLED = a33_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA33_OTH_NON_TOTAL() {
		return A33_OTH_NON_TOTAL;
	}
	public void setA33_OTH_NON_TOTAL(BigDecimal a33_OTH_NON_TOTAL) {
		A33_OTH_NON_TOTAL = a33_OTH_NON_TOTAL;
	}
	public BigDecimal getA33_TOTAL_NON_SKILLED() {
		return A33_TOTAL_NON_SKILLED;
	}
	public void setA33_TOTAL_NON_SKILLED(BigDecimal a33_TOTAL_NON_SKILLED) {
		A33_TOTAL_NON_SKILLED = a33_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA33_TOTAL_NON_UNSKILLED() {
		return A33_TOTAL_NON_UNSKILLED;
	}
	public void setA33_TOTAL_NON_UNSKILLED(BigDecimal a33_TOTAL_NON_UNSKILLED) {
		A33_TOTAL_NON_UNSKILLED = a33_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA33_TOTAL_NON_TOTAL() {
		return A33_TOTAL_NON_TOTAL;
	}
	public void setA33_TOTAL_NON_TOTAL(BigDecimal a33_TOTAL_NON_TOTAL) {
		A33_TOTAL_NON_TOTAL = a33_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA33_KEY_SKILLED() {
		return A33_KEY_SKILLED;
	}
	public void setA33_KEY_SKILLED(BigDecimal a33_KEY_SKILLED) {
		A33_KEY_SKILLED = a33_KEY_SKILLED;
	}
	public BigDecimal getA33_KEY_UNSKILLED() {
		return A33_KEY_UNSKILLED;
	}
	public void setA33_KEY_UNSKILLED(BigDecimal a33_KEY_UNSKILLED) {
		A33_KEY_UNSKILLED = a33_KEY_UNSKILLED;
	}
	public BigDecimal getA33_KEY_TOTAL() {
		return A33_KEY_TOTAL;
	}
	public void setA33_KEY_TOTAL(BigDecimal a33_KEY_TOTAL) {
		A33_KEY_TOTAL = a33_KEY_TOTAL;
	}
	public BigDecimal getA33_OTH_SKILLED() {
		return A33_OTH_SKILLED;
	}
	public void setA33_OTH_SKILLED(BigDecimal a33_OTH_SKILLED) {
		A33_OTH_SKILLED = a33_OTH_SKILLED;
	}
	public BigDecimal getA33_OTH_UNSKILLED() {
		return A33_OTH_UNSKILLED;
	}
	public void setA33_OTH_UNSKILLED(BigDecimal a33_OTH_UNSKILLED) {
		A33_OTH_UNSKILLED = a33_OTH_UNSKILLED;
	}
	public BigDecimal getA33_OTH_TOTAL() {
		return A33_OTH_TOTAL;
	}
	public void setA33_OTH_TOTAL(BigDecimal a33_OTH_TOTAL) {
		A33_OTH_TOTAL = a33_OTH_TOTAL;
	}
	public BigDecimal getA33_TOTAL_SKILLED() {
		return A33_TOTAL_SKILLED;
	}
	public void setA33_TOTAL_SKILLED(BigDecimal a33_TOTAL_SKILLED) {
		A33_TOTAL_SKILLED = a33_TOTAL_SKILLED;
	}
	public BigDecimal getA33_TOTAL_UNSKILLED() {
		return A33_TOTAL_UNSKILLED;
	}
	public void setA33_TOTAL_UNSKILLED(BigDecimal a33_TOTAL_UNSKILLED) {
		A33_TOTAL_UNSKILLED = a33_TOTAL_UNSKILLED;
	}
	public BigDecimal getA33_TOTAL_TOTAL() {
		return A33_TOTAL_TOTAL;
	}
	public void setA33_TOTAL_TOTAL(BigDecimal a33_TOTAL_TOTAL) {
		A33_TOTAL_TOTAL = a33_TOTAL_TOTAL;
	}
	public BigDecimal getA33_TOTAL_ALL_SKILLED() {
		return A33_TOTAL_ALL_SKILLED;
	}
	public void setA33_TOTAL_ALL_SKILLED(BigDecimal a33_TOTAL_ALL_SKILLED) {
		A33_TOTAL_ALL_SKILLED = a33_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA33_TOTAL_ALL_UNSKILLED() {
		return A33_TOTAL_ALL_UNSKILLED;
	}
	public void setA33_TOTAL_ALL_UNSKILLED(BigDecimal a33_TOTAL_ALL_UNSKILLED) {
		A33_TOTAL_ALL_UNSKILLED = a33_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA33_TOTAL_ALL_TOTAL() {
		return A33_TOTAL_ALL_TOTAL;
	}
	public void setA33_TOTAL_ALL_TOTAL(BigDecimal a33_TOTAL_ALL_TOTAL) {
		A33_TOTAL_ALL_TOTAL = a33_TOTAL_ALL_TOTAL;
	}
	public String getA34_PRODUCT() {
		return A34_PRODUCT;
	}
	public void setA34_PRODUCT(String a34_PRODUCT) {
		A34_PRODUCT = a34_PRODUCT;
	}
	public BigDecimal getA34_KEY_NON_SKILLED() {
		return A34_KEY_NON_SKILLED;
	}
	public void setA34_KEY_NON_SKILLED(BigDecimal a34_KEY_NON_SKILLED) {
		A34_KEY_NON_SKILLED = a34_KEY_NON_SKILLED;
	}
	public BigDecimal getA34_KEY_NON_UNSKILLED() {
		return A34_KEY_NON_UNSKILLED;
	}
	public void setA34_KEY_NON_UNSKILLED(BigDecimal a34_KEY_NON_UNSKILLED) {
		A34_KEY_NON_UNSKILLED = a34_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA34_KEY_NON_TOTAL() {
		return A34_KEY_NON_TOTAL;
	}
	public void setA34_KEY_NON_TOTAL(BigDecimal a34_KEY_NON_TOTAL) {
		A34_KEY_NON_TOTAL = a34_KEY_NON_TOTAL;
	}
	public BigDecimal getA34_OTH_NON_SKILLED() {
		return A34_OTH_NON_SKILLED;
	}
	public void setA34_OTH_NON_SKILLED(BigDecimal a34_OTH_NON_SKILLED) {
		A34_OTH_NON_SKILLED = a34_OTH_NON_SKILLED;
	}
	public BigDecimal getA34_OTH_NON_UNSKILLED() {
		return A34_OTH_NON_UNSKILLED;
	}
	public void setA34_OTH_NON_UNSKILLED(BigDecimal a34_OTH_NON_UNSKILLED) {
		A34_OTH_NON_UNSKILLED = a34_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA34_OTH_NON_TOTAL() {
		return A34_OTH_NON_TOTAL;
	}
	public void setA34_OTH_NON_TOTAL(BigDecimal a34_OTH_NON_TOTAL) {
		A34_OTH_NON_TOTAL = a34_OTH_NON_TOTAL;
	}
	public BigDecimal getA34_TOTAL_NON_SKILLED() {
		return A34_TOTAL_NON_SKILLED;
	}
	public void setA34_TOTAL_NON_SKILLED(BigDecimal a34_TOTAL_NON_SKILLED) {
		A34_TOTAL_NON_SKILLED = a34_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA34_TOTAL_NON_UNSKILLED() {
		return A34_TOTAL_NON_UNSKILLED;
	}
	public void setA34_TOTAL_NON_UNSKILLED(BigDecimal a34_TOTAL_NON_UNSKILLED) {
		A34_TOTAL_NON_UNSKILLED = a34_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA34_TOTAL_NON_TOTAL() {
		return A34_TOTAL_NON_TOTAL;
	}
	public void setA34_TOTAL_NON_TOTAL(BigDecimal a34_TOTAL_NON_TOTAL) {
		A34_TOTAL_NON_TOTAL = a34_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA34_KEY_SKILLED() {
		return A34_KEY_SKILLED;
	}
	public void setA34_KEY_SKILLED(BigDecimal a34_KEY_SKILLED) {
		A34_KEY_SKILLED = a34_KEY_SKILLED;
	}
	public BigDecimal getA34_KEY_UNSKILLED() {
		return A34_KEY_UNSKILLED;
	}
	public void setA34_KEY_UNSKILLED(BigDecimal a34_KEY_UNSKILLED) {
		A34_KEY_UNSKILLED = a34_KEY_UNSKILLED;
	}
	public BigDecimal getA34_KEY_TOTAL() {
		return A34_KEY_TOTAL;
	}
	public void setA34_KEY_TOTAL(BigDecimal a34_KEY_TOTAL) {
		A34_KEY_TOTAL = a34_KEY_TOTAL;
	}
	public BigDecimal getA34_OTH_SKILLED() {
		return A34_OTH_SKILLED;
	}
	public void setA34_OTH_SKILLED(BigDecimal a34_OTH_SKILLED) {
		A34_OTH_SKILLED = a34_OTH_SKILLED;
	}
	public BigDecimal getA34_OTH_UNSKILLED() {
		return A34_OTH_UNSKILLED;
	}
	public void setA34_OTH_UNSKILLED(BigDecimal a34_OTH_UNSKILLED) {
		A34_OTH_UNSKILLED = a34_OTH_UNSKILLED;
	}
	public BigDecimal getA34_OTH_TOTAL() {
		return A34_OTH_TOTAL;
	}
	public void setA34_OTH_TOTAL(BigDecimal a34_OTH_TOTAL) {
		A34_OTH_TOTAL = a34_OTH_TOTAL;
	}
	public BigDecimal getA34_TOTAL_SKILLED() {
		return A34_TOTAL_SKILLED;
	}
	public void setA34_TOTAL_SKILLED(BigDecimal a34_TOTAL_SKILLED) {
		A34_TOTAL_SKILLED = a34_TOTAL_SKILLED;
	}
	public BigDecimal getA34_TOTAL_UNSKILLED() {
		return A34_TOTAL_UNSKILLED;
	}
	public void setA34_TOTAL_UNSKILLED(BigDecimal a34_TOTAL_UNSKILLED) {
		A34_TOTAL_UNSKILLED = a34_TOTAL_UNSKILLED;
	}
	public BigDecimal getA34_TOTAL_TOTAL() {
		return A34_TOTAL_TOTAL;
	}
	public void setA34_TOTAL_TOTAL(BigDecimal a34_TOTAL_TOTAL) {
		A34_TOTAL_TOTAL = a34_TOTAL_TOTAL;
	}
	public BigDecimal getA34_TOTAL_ALL_SKILLED() {
		return A34_TOTAL_ALL_SKILLED;
	}
	public void setA34_TOTAL_ALL_SKILLED(BigDecimal a34_TOTAL_ALL_SKILLED) {
		A34_TOTAL_ALL_SKILLED = a34_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA34_TOTAL_ALL_UNSKILLED() {
		return A34_TOTAL_ALL_UNSKILLED;
	}
	public void setA34_TOTAL_ALL_UNSKILLED(BigDecimal a34_TOTAL_ALL_UNSKILLED) {
		A34_TOTAL_ALL_UNSKILLED = a34_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA34_TOTAL_ALL_TOTAL() {
		return A34_TOTAL_ALL_TOTAL;
	}
	public void setA34_TOTAL_ALL_TOTAL(BigDecimal a34_TOTAL_ALL_TOTAL) {
		A34_TOTAL_ALL_TOTAL = a34_TOTAL_ALL_TOTAL;
	}
	public String getA35_PRODUCT() {
		return A35_PRODUCT;
	}
	public void setA35_PRODUCT(String a35_PRODUCT) {
		A35_PRODUCT = a35_PRODUCT;
	}
	public BigDecimal getA35_KEY_NON_SKILLED() {
		return A35_KEY_NON_SKILLED;
	}
	public void setA35_KEY_NON_SKILLED(BigDecimal a35_KEY_NON_SKILLED) {
		A35_KEY_NON_SKILLED = a35_KEY_NON_SKILLED;
	}
	public BigDecimal getA35_KEY_NON_UNSKILLED() {
		return A35_KEY_NON_UNSKILLED;
	}
	public void setA35_KEY_NON_UNSKILLED(BigDecimal a35_KEY_NON_UNSKILLED) {
		A35_KEY_NON_UNSKILLED = a35_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA35_KEY_NON_TOTAL() {
		return A35_KEY_NON_TOTAL;
	}
	public void setA35_KEY_NON_TOTAL(BigDecimal a35_KEY_NON_TOTAL) {
		A35_KEY_NON_TOTAL = a35_KEY_NON_TOTAL;
	}
	public BigDecimal getA35_OTH_NON_SKILLED() {
		return A35_OTH_NON_SKILLED;
	}
	public void setA35_OTH_NON_SKILLED(BigDecimal a35_OTH_NON_SKILLED) {
		A35_OTH_NON_SKILLED = a35_OTH_NON_SKILLED;
	}
	public BigDecimal getA35_OTH_NON_UNSKILLED() {
		return A35_OTH_NON_UNSKILLED;
	}
	public void setA35_OTH_NON_UNSKILLED(BigDecimal a35_OTH_NON_UNSKILLED) {
		A35_OTH_NON_UNSKILLED = a35_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA35_OTH_NON_TOTAL() {
		return A35_OTH_NON_TOTAL;
	}
	public void setA35_OTH_NON_TOTAL(BigDecimal a35_OTH_NON_TOTAL) {
		A35_OTH_NON_TOTAL = a35_OTH_NON_TOTAL;
	}
	public BigDecimal getA35_TOTAL_NON_SKILLED() {
		return A35_TOTAL_NON_SKILLED;
	}
	public void setA35_TOTAL_NON_SKILLED(BigDecimal a35_TOTAL_NON_SKILLED) {
		A35_TOTAL_NON_SKILLED = a35_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA35_TOTAL_NON_UNSKILLED() {
		return A35_TOTAL_NON_UNSKILLED;
	}
	public void setA35_TOTAL_NON_UNSKILLED(BigDecimal a35_TOTAL_NON_UNSKILLED) {
		A35_TOTAL_NON_UNSKILLED = a35_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA35_TOTAL_NON_TOTAL() {
		return A35_TOTAL_NON_TOTAL;
	}
	public void setA35_TOTAL_NON_TOTAL(BigDecimal a35_TOTAL_NON_TOTAL) {
		A35_TOTAL_NON_TOTAL = a35_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA35_KEY_SKILLED() {
		return A35_KEY_SKILLED;
	}
	public void setA35_KEY_SKILLED(BigDecimal a35_KEY_SKILLED) {
		A35_KEY_SKILLED = a35_KEY_SKILLED;
	}
	public BigDecimal getA35_KEY_UNSKILLED() {
		return A35_KEY_UNSKILLED;
	}
	public void setA35_KEY_UNSKILLED(BigDecimal a35_KEY_UNSKILLED) {
		A35_KEY_UNSKILLED = a35_KEY_UNSKILLED;
	}
	public BigDecimal getA35_KEY_TOTAL() {
		return A35_KEY_TOTAL;
	}
	public void setA35_KEY_TOTAL(BigDecimal a35_KEY_TOTAL) {
		A35_KEY_TOTAL = a35_KEY_TOTAL;
	}
	public BigDecimal getA35_OTH_SKILLED() {
		return A35_OTH_SKILLED;
	}
	public void setA35_OTH_SKILLED(BigDecimal a35_OTH_SKILLED) {
		A35_OTH_SKILLED = a35_OTH_SKILLED;
	}
	public BigDecimal getA35_OTH_UNSKILLED() {
		return A35_OTH_UNSKILLED;
	}
	public void setA35_OTH_UNSKILLED(BigDecimal a35_OTH_UNSKILLED) {
		A35_OTH_UNSKILLED = a35_OTH_UNSKILLED;
	}
	public BigDecimal getA35_OTH_TOTAL() {
		return A35_OTH_TOTAL;
	}
	public void setA35_OTH_TOTAL(BigDecimal a35_OTH_TOTAL) {
		A35_OTH_TOTAL = a35_OTH_TOTAL;
	}
	public BigDecimal getA35_TOTAL_SKILLED() {
		return A35_TOTAL_SKILLED;
	}
	public void setA35_TOTAL_SKILLED(BigDecimal a35_TOTAL_SKILLED) {
		A35_TOTAL_SKILLED = a35_TOTAL_SKILLED;
	}
	public BigDecimal getA35_TOTAL_UNSKILLED() {
		return A35_TOTAL_UNSKILLED;
	}
	public void setA35_TOTAL_UNSKILLED(BigDecimal a35_TOTAL_UNSKILLED) {
		A35_TOTAL_UNSKILLED = a35_TOTAL_UNSKILLED;
	}
	public BigDecimal getA35_TOTAL_TOTAL() {
		return A35_TOTAL_TOTAL;
	}
	public void setA35_TOTAL_TOTAL(BigDecimal a35_TOTAL_TOTAL) {
		A35_TOTAL_TOTAL = a35_TOTAL_TOTAL;
	}
	public BigDecimal getA35_TOTAL_ALL_SKILLED() {
		return A35_TOTAL_ALL_SKILLED;
	}
	public void setA35_TOTAL_ALL_SKILLED(BigDecimal a35_TOTAL_ALL_SKILLED) {
		A35_TOTAL_ALL_SKILLED = a35_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA35_TOTAL_ALL_UNSKILLED() {
		return A35_TOTAL_ALL_UNSKILLED;
	}
	public void setA35_TOTAL_ALL_UNSKILLED(BigDecimal a35_TOTAL_ALL_UNSKILLED) {
		A35_TOTAL_ALL_UNSKILLED = a35_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA35_TOTAL_ALL_TOTAL() {
		return A35_TOTAL_ALL_TOTAL;
	}
	public void setA35_TOTAL_ALL_TOTAL(BigDecimal a35_TOTAL_ALL_TOTAL) {
		A35_TOTAL_ALL_TOTAL = a35_TOTAL_ALL_TOTAL;
	}
	public String getA36_PRODUCT() {
		return A36_PRODUCT;
	}
	public void setA36_PRODUCT(String a36_PRODUCT) {
		A36_PRODUCT = a36_PRODUCT;
	}
	public BigDecimal getA36_KEY_NON_SKILLED() {
		return A36_KEY_NON_SKILLED;
	}
	public void setA36_KEY_NON_SKILLED(BigDecimal a36_KEY_NON_SKILLED) {
		A36_KEY_NON_SKILLED = a36_KEY_NON_SKILLED;
	}
	public BigDecimal getA36_KEY_NON_UNSKILLED() {
		return A36_KEY_NON_UNSKILLED;
	}
	public void setA36_KEY_NON_UNSKILLED(BigDecimal a36_KEY_NON_UNSKILLED) {
		A36_KEY_NON_UNSKILLED = a36_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA36_KEY_NON_TOTAL() {
		return A36_KEY_NON_TOTAL;
	}
	public void setA36_KEY_NON_TOTAL(BigDecimal a36_KEY_NON_TOTAL) {
		A36_KEY_NON_TOTAL = a36_KEY_NON_TOTAL;
	}
	public BigDecimal getA36_OTH_NON_SKILLED() {
		return A36_OTH_NON_SKILLED;
	}
	public void setA36_OTH_NON_SKILLED(BigDecimal a36_OTH_NON_SKILLED) {
		A36_OTH_NON_SKILLED = a36_OTH_NON_SKILLED;
	}
	public BigDecimal getA36_OTH_NON_UNSKILLED() {
		return A36_OTH_NON_UNSKILLED;
	}
	public void setA36_OTH_NON_UNSKILLED(BigDecimal a36_OTH_NON_UNSKILLED) {
		A36_OTH_NON_UNSKILLED = a36_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA36_OTH_NON_TOTAL() {
		return A36_OTH_NON_TOTAL;
	}
	public void setA36_OTH_NON_TOTAL(BigDecimal a36_OTH_NON_TOTAL) {
		A36_OTH_NON_TOTAL = a36_OTH_NON_TOTAL;
	}
	public BigDecimal getA36_TOTAL_NON_SKILLED() {
		return A36_TOTAL_NON_SKILLED;
	}
	public void setA36_TOTAL_NON_SKILLED(BigDecimal a36_TOTAL_NON_SKILLED) {
		A36_TOTAL_NON_SKILLED = a36_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA36_TOTAL_NON_UNSKILLED() {
		return A36_TOTAL_NON_UNSKILLED;
	}
	public void setA36_TOTAL_NON_UNSKILLED(BigDecimal a36_TOTAL_NON_UNSKILLED) {
		A36_TOTAL_NON_UNSKILLED = a36_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA36_TOTAL_NON_TOTAL() {
		return A36_TOTAL_NON_TOTAL;
	}
	public void setA36_TOTAL_NON_TOTAL(BigDecimal a36_TOTAL_NON_TOTAL) {
		A36_TOTAL_NON_TOTAL = a36_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA36_KEY_SKILLED() {
		return A36_KEY_SKILLED;
	}
	public void setA36_KEY_SKILLED(BigDecimal a36_KEY_SKILLED) {
		A36_KEY_SKILLED = a36_KEY_SKILLED;
	}
	public BigDecimal getA36_KEY_UNSKILLED() {
		return A36_KEY_UNSKILLED;
	}
	public void setA36_KEY_UNSKILLED(BigDecimal a36_KEY_UNSKILLED) {
		A36_KEY_UNSKILLED = a36_KEY_UNSKILLED;
	}
	public BigDecimal getA36_KEY_TOTAL() {
		return A36_KEY_TOTAL;
	}
	public void setA36_KEY_TOTAL(BigDecimal a36_KEY_TOTAL) {
		A36_KEY_TOTAL = a36_KEY_TOTAL;
	}
	public BigDecimal getA36_OTH_SKILLED() {
		return A36_OTH_SKILLED;
	}
	public void setA36_OTH_SKILLED(BigDecimal a36_OTH_SKILLED) {
		A36_OTH_SKILLED = a36_OTH_SKILLED;
	}
	public BigDecimal getA36_OTH_UNSKILLED() {
		return A36_OTH_UNSKILLED;
	}
	public void setA36_OTH_UNSKILLED(BigDecimal a36_OTH_UNSKILLED) {
		A36_OTH_UNSKILLED = a36_OTH_UNSKILLED;
	}
	public BigDecimal getA36_OTH_TOTAL() {
		return A36_OTH_TOTAL;
	}
	public void setA36_OTH_TOTAL(BigDecimal a36_OTH_TOTAL) {
		A36_OTH_TOTAL = a36_OTH_TOTAL;
	}
	public BigDecimal getA36_TOTAL_SKILLED() {
		return A36_TOTAL_SKILLED;
	}
	public void setA36_TOTAL_SKILLED(BigDecimal a36_TOTAL_SKILLED) {
		A36_TOTAL_SKILLED = a36_TOTAL_SKILLED;
	}
	public BigDecimal getA36_TOTAL_UNSKILLED() {
		return A36_TOTAL_UNSKILLED;
	}
	public void setA36_TOTAL_UNSKILLED(BigDecimal a36_TOTAL_UNSKILLED) {
		A36_TOTAL_UNSKILLED = a36_TOTAL_UNSKILLED;
	}
	public BigDecimal getA36_TOTAL_TOTAL() {
		return A36_TOTAL_TOTAL;
	}
	public void setA36_TOTAL_TOTAL(BigDecimal a36_TOTAL_TOTAL) {
		A36_TOTAL_TOTAL = a36_TOTAL_TOTAL;
	}
	public BigDecimal getA36_TOTAL_ALL_SKILLED() {
		return A36_TOTAL_ALL_SKILLED;
	}
	public void setA36_TOTAL_ALL_SKILLED(BigDecimal a36_TOTAL_ALL_SKILLED) {
		A36_TOTAL_ALL_SKILLED = a36_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA36_TOTAL_ALL_UNSKILLED() {
		return A36_TOTAL_ALL_UNSKILLED;
	}
	public void setA36_TOTAL_ALL_UNSKILLED(BigDecimal a36_TOTAL_ALL_UNSKILLED) {
		A36_TOTAL_ALL_UNSKILLED = a36_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA36_TOTAL_ALL_TOTAL() {
		return A36_TOTAL_ALL_TOTAL;
	}
	public void setA36_TOTAL_ALL_TOTAL(BigDecimal a36_TOTAL_ALL_TOTAL) {
		A36_TOTAL_ALL_TOTAL = a36_TOTAL_ALL_TOTAL;
	}
	public String getA37_PRODUCT() {
		return A37_PRODUCT;
	}
	public void setA37_PRODUCT(String a37_PRODUCT) {
		A37_PRODUCT = a37_PRODUCT;
	}
	public BigDecimal getA37_KEY_NON_SKILLED() {
		return A37_KEY_NON_SKILLED;
	}
	public void setA37_KEY_NON_SKILLED(BigDecimal a37_KEY_NON_SKILLED) {
		A37_KEY_NON_SKILLED = a37_KEY_NON_SKILLED;
	}
	public BigDecimal getA37_KEY_NON_UNSKILLED() {
		return A37_KEY_NON_UNSKILLED;
	}
	public void setA37_KEY_NON_UNSKILLED(BigDecimal a37_KEY_NON_UNSKILLED) {
		A37_KEY_NON_UNSKILLED = a37_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA37_KEY_NON_TOTAL() {
		return A37_KEY_NON_TOTAL;
	}
	public void setA37_KEY_NON_TOTAL(BigDecimal a37_KEY_NON_TOTAL) {
		A37_KEY_NON_TOTAL = a37_KEY_NON_TOTAL;
	}
	public BigDecimal getA37_OTH_NON_SKILLED() {
		return A37_OTH_NON_SKILLED;
	}
	public void setA37_OTH_NON_SKILLED(BigDecimal a37_OTH_NON_SKILLED) {
		A37_OTH_NON_SKILLED = a37_OTH_NON_SKILLED;
	}
	public BigDecimal getA37_OTH_NON_UNSKILLED() {
		return A37_OTH_NON_UNSKILLED;
	}
	public void setA37_OTH_NON_UNSKILLED(BigDecimal a37_OTH_NON_UNSKILLED) {
		A37_OTH_NON_UNSKILLED = a37_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA37_OTH_NON_TOTAL() {
		return A37_OTH_NON_TOTAL;
	}
	public void setA37_OTH_NON_TOTAL(BigDecimal a37_OTH_NON_TOTAL) {
		A37_OTH_NON_TOTAL = a37_OTH_NON_TOTAL;
	}
	public BigDecimal getA37_TOTAL_NON_SKILLED() {
		return A37_TOTAL_NON_SKILLED;
	}
	public void setA37_TOTAL_NON_SKILLED(BigDecimal a37_TOTAL_NON_SKILLED) {
		A37_TOTAL_NON_SKILLED = a37_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA37_TOTAL_NON_UNSKILLED() {
		return A37_TOTAL_NON_UNSKILLED;
	}
	public void setA37_TOTAL_NON_UNSKILLED(BigDecimal a37_TOTAL_NON_UNSKILLED) {
		A37_TOTAL_NON_UNSKILLED = a37_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA37_TOTAL_NON_TOTAL() {
		return A37_TOTAL_NON_TOTAL;
	}
	public void setA37_TOTAL_NON_TOTAL(BigDecimal a37_TOTAL_NON_TOTAL) {
		A37_TOTAL_NON_TOTAL = a37_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA37_KEY_SKILLED() {
		return A37_KEY_SKILLED;
	}
	public void setA37_KEY_SKILLED(BigDecimal a37_KEY_SKILLED) {
		A37_KEY_SKILLED = a37_KEY_SKILLED;
	}
	public BigDecimal getA37_KEY_UNSKILLED() {
		return A37_KEY_UNSKILLED;
	}
	public void setA37_KEY_UNSKILLED(BigDecimal a37_KEY_UNSKILLED) {
		A37_KEY_UNSKILLED = a37_KEY_UNSKILLED;
	}
	public BigDecimal getA37_KEY_TOTAL() {
		return A37_KEY_TOTAL;
	}
	public void setA37_KEY_TOTAL(BigDecimal a37_KEY_TOTAL) {
		A37_KEY_TOTAL = a37_KEY_TOTAL;
	}
	public BigDecimal getA37_OTH_SKILLED() {
		return A37_OTH_SKILLED;
	}
	public void setA37_OTH_SKILLED(BigDecimal a37_OTH_SKILLED) {
		A37_OTH_SKILLED = a37_OTH_SKILLED;
	}
	public BigDecimal getA37_OTH_UNSKILLED() {
		return A37_OTH_UNSKILLED;
	}
	public void setA37_OTH_UNSKILLED(BigDecimal a37_OTH_UNSKILLED) {
		A37_OTH_UNSKILLED = a37_OTH_UNSKILLED;
	}
	public BigDecimal getA37_OTH_TOTAL() {
		return A37_OTH_TOTAL;
	}
	public void setA37_OTH_TOTAL(BigDecimal a37_OTH_TOTAL) {
		A37_OTH_TOTAL = a37_OTH_TOTAL;
	}
	public BigDecimal getA37_TOTAL_SKILLED() {
		return A37_TOTAL_SKILLED;
	}
	public void setA37_TOTAL_SKILLED(BigDecimal a37_TOTAL_SKILLED) {
		A37_TOTAL_SKILLED = a37_TOTAL_SKILLED;
	}
	public BigDecimal getA37_TOTAL_UNSKILLED() {
		return A37_TOTAL_UNSKILLED;
	}
	public void setA37_TOTAL_UNSKILLED(BigDecimal a37_TOTAL_UNSKILLED) {
		A37_TOTAL_UNSKILLED = a37_TOTAL_UNSKILLED;
	}
	public BigDecimal getA37_TOTAL_TOTAL() {
		return A37_TOTAL_TOTAL;
	}
	public void setA37_TOTAL_TOTAL(BigDecimal a37_TOTAL_TOTAL) {
		A37_TOTAL_TOTAL = a37_TOTAL_TOTAL;
	}
	public BigDecimal getA37_TOTAL_ALL_SKILLED() {
		return A37_TOTAL_ALL_SKILLED;
	}
	public void setA37_TOTAL_ALL_SKILLED(BigDecimal a37_TOTAL_ALL_SKILLED) {
		A37_TOTAL_ALL_SKILLED = a37_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA37_TOTAL_ALL_UNSKILLED() {
		return A37_TOTAL_ALL_UNSKILLED;
	}
	public void setA37_TOTAL_ALL_UNSKILLED(BigDecimal a37_TOTAL_ALL_UNSKILLED) {
		A37_TOTAL_ALL_UNSKILLED = a37_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA37_TOTAL_ALL_TOTAL() {
		return A37_TOTAL_ALL_TOTAL;
	}
	public void setA37_TOTAL_ALL_TOTAL(BigDecimal a37_TOTAL_ALL_TOTAL) {
		A37_TOTAL_ALL_TOTAL = a37_TOTAL_ALL_TOTAL;
	}
	public String getA38_PRODUCT() {
		return A38_PRODUCT;
	}
	public void setA38_PRODUCT(String a38_PRODUCT) {
		A38_PRODUCT = a38_PRODUCT;
	}
	public BigDecimal getA38_KEY_NON_SKILLED() {
		return A38_KEY_NON_SKILLED;
	}
	public void setA38_KEY_NON_SKILLED(BigDecimal a38_KEY_NON_SKILLED) {
		A38_KEY_NON_SKILLED = a38_KEY_NON_SKILLED;
	}
	public BigDecimal getA38_KEY_NON_UNSKILLED() {
		return A38_KEY_NON_UNSKILLED;
	}
	public void setA38_KEY_NON_UNSKILLED(BigDecimal a38_KEY_NON_UNSKILLED) {
		A38_KEY_NON_UNSKILLED = a38_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA38_KEY_NON_TOTAL() {
		return A38_KEY_NON_TOTAL;
	}
	public void setA38_KEY_NON_TOTAL(BigDecimal a38_KEY_NON_TOTAL) {
		A38_KEY_NON_TOTAL = a38_KEY_NON_TOTAL;
	}
	public BigDecimal getA38_OTH_NON_SKILLED() {
		return A38_OTH_NON_SKILLED;
	}
	public void setA38_OTH_NON_SKILLED(BigDecimal a38_OTH_NON_SKILLED) {
		A38_OTH_NON_SKILLED = a38_OTH_NON_SKILLED;
	}
	public BigDecimal getA38_OTH_NON_UNSKILLED() {
		return A38_OTH_NON_UNSKILLED;
	}
	public void setA38_OTH_NON_UNSKILLED(BigDecimal a38_OTH_NON_UNSKILLED) {
		A38_OTH_NON_UNSKILLED = a38_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA38_OTH_NON_TOTAL() {
		return A38_OTH_NON_TOTAL;
	}
	public void setA38_OTH_NON_TOTAL(BigDecimal a38_OTH_NON_TOTAL) {
		A38_OTH_NON_TOTAL = a38_OTH_NON_TOTAL;
	}
	public BigDecimal getA38_TOTAL_NON_SKILLED() {
		return A38_TOTAL_NON_SKILLED;
	}
	public void setA38_TOTAL_NON_SKILLED(BigDecimal a38_TOTAL_NON_SKILLED) {
		A38_TOTAL_NON_SKILLED = a38_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA38_TOTAL_NON_UNSKILLED() {
		return A38_TOTAL_NON_UNSKILLED;
	}
	public void setA38_TOTAL_NON_UNSKILLED(BigDecimal a38_TOTAL_NON_UNSKILLED) {
		A38_TOTAL_NON_UNSKILLED = a38_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA38_TOTAL_NON_TOTAL() {
		return A38_TOTAL_NON_TOTAL;
	}
	public void setA38_TOTAL_NON_TOTAL(BigDecimal a38_TOTAL_NON_TOTAL) {
		A38_TOTAL_NON_TOTAL = a38_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA38_KEY_SKILLED() {
		return A38_KEY_SKILLED;
	}
	public void setA38_KEY_SKILLED(BigDecimal a38_KEY_SKILLED) {
		A38_KEY_SKILLED = a38_KEY_SKILLED;
	}
	public BigDecimal getA38_KEY_UNSKILLED() {
		return A38_KEY_UNSKILLED;
	}
	public void setA38_KEY_UNSKILLED(BigDecimal a38_KEY_UNSKILLED) {
		A38_KEY_UNSKILLED = a38_KEY_UNSKILLED;
	}
	public BigDecimal getA38_KEY_TOTAL() {
		return A38_KEY_TOTAL;
	}
	public void setA38_KEY_TOTAL(BigDecimal a38_KEY_TOTAL) {
		A38_KEY_TOTAL = a38_KEY_TOTAL;
	}
	public BigDecimal getA38_OTH_SKILLED() {
		return A38_OTH_SKILLED;
	}
	public void setA38_OTH_SKILLED(BigDecimal a38_OTH_SKILLED) {
		A38_OTH_SKILLED = a38_OTH_SKILLED;
	}
	public BigDecimal getA38_OTH_UNSKILLED() {
		return A38_OTH_UNSKILLED;
	}
	public void setA38_OTH_UNSKILLED(BigDecimal a38_OTH_UNSKILLED) {
		A38_OTH_UNSKILLED = a38_OTH_UNSKILLED;
	}
	public BigDecimal getA38_OTH_TOTAL() {
		return A38_OTH_TOTAL;
	}
	public void setA38_OTH_TOTAL(BigDecimal a38_OTH_TOTAL) {
		A38_OTH_TOTAL = a38_OTH_TOTAL;
	}
	public BigDecimal getA38_TOTAL_SKILLED() {
		return A38_TOTAL_SKILLED;
	}
	public void setA38_TOTAL_SKILLED(BigDecimal a38_TOTAL_SKILLED) {
		A38_TOTAL_SKILLED = a38_TOTAL_SKILLED;
	}
	public BigDecimal getA38_TOTAL_UNSKILLED() {
		return A38_TOTAL_UNSKILLED;
	}
	public void setA38_TOTAL_UNSKILLED(BigDecimal a38_TOTAL_UNSKILLED) {
		A38_TOTAL_UNSKILLED = a38_TOTAL_UNSKILLED;
	}
	public BigDecimal getA38_TOTAL_TOTAL() {
		return A38_TOTAL_TOTAL;
	}
	public void setA38_TOTAL_TOTAL(BigDecimal a38_TOTAL_TOTAL) {
		A38_TOTAL_TOTAL = a38_TOTAL_TOTAL;
	}
	public BigDecimal getA38_TOTAL_ALL_SKILLED() {
		return A38_TOTAL_ALL_SKILLED;
	}
	public void setA38_TOTAL_ALL_SKILLED(BigDecimal a38_TOTAL_ALL_SKILLED) {
		A38_TOTAL_ALL_SKILLED = a38_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA38_TOTAL_ALL_UNSKILLED() {
		return A38_TOTAL_ALL_UNSKILLED;
	}
	public void setA38_TOTAL_ALL_UNSKILLED(BigDecimal a38_TOTAL_ALL_UNSKILLED) {
		A38_TOTAL_ALL_UNSKILLED = a38_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA38_TOTAL_ALL_TOTAL() {
		return A38_TOTAL_ALL_TOTAL;
	}
	public void setA38_TOTAL_ALL_TOTAL(BigDecimal a38_TOTAL_ALL_TOTAL) {
		A38_TOTAL_ALL_TOTAL = a38_TOTAL_ALL_TOTAL;
	}
	public String getA39_PRODUCT() {
		return A39_PRODUCT;
	}
	public void setA39_PRODUCT(String a39_PRODUCT) {
		A39_PRODUCT = a39_PRODUCT;
	}
	public BigDecimal getA39_KEY_NON_SKILLED() {
		return A39_KEY_NON_SKILLED;
	}
	public void setA39_KEY_NON_SKILLED(BigDecimal a39_KEY_NON_SKILLED) {
		A39_KEY_NON_SKILLED = a39_KEY_NON_SKILLED;
	}
	public BigDecimal getA39_KEY_NON_UNSKILLED() {
		return A39_KEY_NON_UNSKILLED;
	}
	public void setA39_KEY_NON_UNSKILLED(BigDecimal a39_KEY_NON_UNSKILLED) {
		A39_KEY_NON_UNSKILLED = a39_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA39_KEY_NON_TOTAL() {
		return A39_KEY_NON_TOTAL;
	}
	public void setA39_KEY_NON_TOTAL(BigDecimal a39_KEY_NON_TOTAL) {
		A39_KEY_NON_TOTAL = a39_KEY_NON_TOTAL;
	}
	public BigDecimal getA39_OTH_NON_SKILLED() {
		return A39_OTH_NON_SKILLED;
	}
	public void setA39_OTH_NON_SKILLED(BigDecimal a39_OTH_NON_SKILLED) {
		A39_OTH_NON_SKILLED = a39_OTH_NON_SKILLED;
	}
	public BigDecimal getA39_OTH_NON_UNSKILLED() {
		return A39_OTH_NON_UNSKILLED;
	}
	public void setA39_OTH_NON_UNSKILLED(BigDecimal a39_OTH_NON_UNSKILLED) {
		A39_OTH_NON_UNSKILLED = a39_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA39_OTH_NON_TOTAL() {
		return A39_OTH_NON_TOTAL;
	}
	public void setA39_OTH_NON_TOTAL(BigDecimal a39_OTH_NON_TOTAL) {
		A39_OTH_NON_TOTAL = a39_OTH_NON_TOTAL;
	}
	public BigDecimal getA39_TOTAL_NON_SKILLED() {
		return A39_TOTAL_NON_SKILLED;
	}
	public void setA39_TOTAL_NON_SKILLED(BigDecimal a39_TOTAL_NON_SKILLED) {
		A39_TOTAL_NON_SKILLED = a39_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA39_TOTAL_NON_UNSKILLED() {
		return A39_TOTAL_NON_UNSKILLED;
	}
	public void setA39_TOTAL_NON_UNSKILLED(BigDecimal a39_TOTAL_NON_UNSKILLED) {
		A39_TOTAL_NON_UNSKILLED = a39_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA39_TOTAL_NON_TOTAL() {
		return A39_TOTAL_NON_TOTAL;
	}
	public void setA39_TOTAL_NON_TOTAL(BigDecimal a39_TOTAL_NON_TOTAL) {
		A39_TOTAL_NON_TOTAL = a39_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA39_KEY_SKILLED() {
		return A39_KEY_SKILLED;
	}
	public void setA39_KEY_SKILLED(BigDecimal a39_KEY_SKILLED) {
		A39_KEY_SKILLED = a39_KEY_SKILLED;
	}
	public BigDecimal getA39_KEY_UNSKILLED() {
		return A39_KEY_UNSKILLED;
	}
	public void setA39_KEY_UNSKILLED(BigDecimal a39_KEY_UNSKILLED) {
		A39_KEY_UNSKILLED = a39_KEY_UNSKILLED;
	}
	public BigDecimal getA39_KEY_TOTAL() {
		return A39_KEY_TOTAL;
	}
	public void setA39_KEY_TOTAL(BigDecimal a39_KEY_TOTAL) {
		A39_KEY_TOTAL = a39_KEY_TOTAL;
	}
	public BigDecimal getA39_OTH_SKILLED() {
		return A39_OTH_SKILLED;
	}
	public void setA39_OTH_SKILLED(BigDecimal a39_OTH_SKILLED) {
		A39_OTH_SKILLED = a39_OTH_SKILLED;
	}
	public BigDecimal getA39_OTH_UNSKILLED() {
		return A39_OTH_UNSKILLED;
	}
	public void setA39_OTH_UNSKILLED(BigDecimal a39_OTH_UNSKILLED) {
		A39_OTH_UNSKILLED = a39_OTH_UNSKILLED;
	}
	public BigDecimal getA39_OTH_TOTAL() {
		return A39_OTH_TOTAL;
	}
	public void setA39_OTH_TOTAL(BigDecimal a39_OTH_TOTAL) {
		A39_OTH_TOTAL = a39_OTH_TOTAL;
	}
	public BigDecimal getA39_TOTAL_SKILLED() {
		return A39_TOTAL_SKILLED;
	}
	public void setA39_TOTAL_SKILLED(BigDecimal a39_TOTAL_SKILLED) {
		A39_TOTAL_SKILLED = a39_TOTAL_SKILLED;
	}
	public BigDecimal getA39_TOTAL_UNSKILLED() {
		return A39_TOTAL_UNSKILLED;
	}
	public void setA39_TOTAL_UNSKILLED(BigDecimal a39_TOTAL_UNSKILLED) {
		A39_TOTAL_UNSKILLED = a39_TOTAL_UNSKILLED;
	}
	public BigDecimal getA39_TOTAL_TOTAL() {
		return A39_TOTAL_TOTAL;
	}
	public void setA39_TOTAL_TOTAL(BigDecimal a39_TOTAL_TOTAL) {
		A39_TOTAL_TOTAL = a39_TOTAL_TOTAL;
	}
	public BigDecimal getA39_TOTAL_ALL_SKILLED() {
		return A39_TOTAL_ALL_SKILLED;
	}
	public void setA39_TOTAL_ALL_SKILLED(BigDecimal a39_TOTAL_ALL_SKILLED) {
		A39_TOTAL_ALL_SKILLED = a39_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA39_TOTAL_ALL_UNSKILLED() {
		return A39_TOTAL_ALL_UNSKILLED;
	}
	public void setA39_TOTAL_ALL_UNSKILLED(BigDecimal a39_TOTAL_ALL_UNSKILLED) {
		A39_TOTAL_ALL_UNSKILLED = a39_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA39_TOTAL_ALL_TOTAL() {
		return A39_TOTAL_ALL_TOTAL;
	}
	public void setA39_TOTAL_ALL_TOTAL(BigDecimal a39_TOTAL_ALL_TOTAL) {
		A39_TOTAL_ALL_TOTAL = a39_TOTAL_ALL_TOTAL;
	}
	public String getA40_PRODUCT() {
		return A40_PRODUCT;
	}
	public void setA40_PRODUCT(String a40_PRODUCT) {
		A40_PRODUCT = a40_PRODUCT;
	}
	public BigDecimal getA40_KEY_NON_SKILLED() {
		return A40_KEY_NON_SKILLED;
	}
	public void setA40_KEY_NON_SKILLED(BigDecimal a40_KEY_NON_SKILLED) {
		A40_KEY_NON_SKILLED = a40_KEY_NON_SKILLED;
	}
	public BigDecimal getA40_KEY_NON_UNSKILLED() {
		return A40_KEY_NON_UNSKILLED;
	}
	public void setA40_KEY_NON_UNSKILLED(BigDecimal a40_KEY_NON_UNSKILLED) {
		A40_KEY_NON_UNSKILLED = a40_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA40_KEY_NON_TOTAL() {
		return A40_KEY_NON_TOTAL;
	}
	public void setA40_KEY_NON_TOTAL(BigDecimal a40_KEY_NON_TOTAL) {
		A40_KEY_NON_TOTAL = a40_KEY_NON_TOTAL;
	}
	public BigDecimal getA40_OTH_NON_SKILLED() {
		return A40_OTH_NON_SKILLED;
	}
	public void setA40_OTH_NON_SKILLED(BigDecimal a40_OTH_NON_SKILLED) {
		A40_OTH_NON_SKILLED = a40_OTH_NON_SKILLED;
	}
	public BigDecimal getA40_OTH_NON_UNSKILLED() {
		return A40_OTH_NON_UNSKILLED;
	}
	public void setA40_OTH_NON_UNSKILLED(BigDecimal a40_OTH_NON_UNSKILLED) {
		A40_OTH_NON_UNSKILLED = a40_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA40_OTH_NON_TOTAL() {
		return A40_OTH_NON_TOTAL;
	}
	public void setA40_OTH_NON_TOTAL(BigDecimal a40_OTH_NON_TOTAL) {
		A40_OTH_NON_TOTAL = a40_OTH_NON_TOTAL;
	}
	public BigDecimal getA40_TOTAL_NON_SKILLED() {
		return A40_TOTAL_NON_SKILLED;
	}
	public void setA40_TOTAL_NON_SKILLED(BigDecimal a40_TOTAL_NON_SKILLED) {
		A40_TOTAL_NON_SKILLED = a40_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA40_TOTAL_NON_UNSKILLED() {
		return A40_TOTAL_NON_UNSKILLED;
	}
	public void setA40_TOTAL_NON_UNSKILLED(BigDecimal a40_TOTAL_NON_UNSKILLED) {
		A40_TOTAL_NON_UNSKILLED = a40_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA40_TOTAL_NON_TOTAL() {
		return A40_TOTAL_NON_TOTAL;
	}
	public void setA40_TOTAL_NON_TOTAL(BigDecimal a40_TOTAL_NON_TOTAL) {
		A40_TOTAL_NON_TOTAL = a40_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA40_KEY_SKILLED() {
		return A40_KEY_SKILLED;
	}
	public void setA40_KEY_SKILLED(BigDecimal a40_KEY_SKILLED) {
		A40_KEY_SKILLED = a40_KEY_SKILLED;
	}
	public BigDecimal getA40_KEY_UNSKILLED() {
		return A40_KEY_UNSKILLED;
	}
	public void setA40_KEY_UNSKILLED(BigDecimal a40_KEY_UNSKILLED) {
		A40_KEY_UNSKILLED = a40_KEY_UNSKILLED;
	}
	public BigDecimal getA40_KEY_TOTAL() {
		return A40_KEY_TOTAL;
	}
	public void setA40_KEY_TOTAL(BigDecimal a40_KEY_TOTAL) {
		A40_KEY_TOTAL = a40_KEY_TOTAL;
	}
	public BigDecimal getA40_OTH_SKILLED() {
		return A40_OTH_SKILLED;
	}
	public void setA40_OTH_SKILLED(BigDecimal a40_OTH_SKILLED) {
		A40_OTH_SKILLED = a40_OTH_SKILLED;
	}
	public BigDecimal getA40_OTH_UNSKILLED() {
		return A40_OTH_UNSKILLED;
	}
	public void setA40_OTH_UNSKILLED(BigDecimal a40_OTH_UNSKILLED) {
		A40_OTH_UNSKILLED = a40_OTH_UNSKILLED;
	}
	public BigDecimal getA40_OTH_TOTAL() {
		return A40_OTH_TOTAL;
	}
	public void setA40_OTH_TOTAL(BigDecimal a40_OTH_TOTAL) {
		A40_OTH_TOTAL = a40_OTH_TOTAL;
	}
	public BigDecimal getA40_TOTAL_SKILLED() {
		return A40_TOTAL_SKILLED;
	}
	public void setA40_TOTAL_SKILLED(BigDecimal a40_TOTAL_SKILLED) {
		A40_TOTAL_SKILLED = a40_TOTAL_SKILLED;
	}
	public BigDecimal getA40_TOTAL_UNSKILLED() {
		return A40_TOTAL_UNSKILLED;
	}
	public void setA40_TOTAL_UNSKILLED(BigDecimal a40_TOTAL_UNSKILLED) {
		A40_TOTAL_UNSKILLED = a40_TOTAL_UNSKILLED;
	}
	public BigDecimal getA40_TOTAL_TOTAL() {
		return A40_TOTAL_TOTAL;
	}
	public void setA40_TOTAL_TOTAL(BigDecimal a40_TOTAL_TOTAL) {
		A40_TOTAL_TOTAL = a40_TOTAL_TOTAL;
	}
	public BigDecimal getA40_TOTAL_ALL_SKILLED() {
		return A40_TOTAL_ALL_SKILLED;
	}
	public void setA40_TOTAL_ALL_SKILLED(BigDecimal a40_TOTAL_ALL_SKILLED) {
		A40_TOTAL_ALL_SKILLED = a40_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA40_TOTAL_ALL_UNSKILLED() {
		return A40_TOTAL_ALL_UNSKILLED;
	}
	public void setA40_TOTAL_ALL_UNSKILLED(BigDecimal a40_TOTAL_ALL_UNSKILLED) {
		A40_TOTAL_ALL_UNSKILLED = a40_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA40_TOTAL_ALL_TOTAL() {
		return A40_TOTAL_ALL_TOTAL;
	}
	public void setA40_TOTAL_ALL_TOTAL(BigDecimal a40_TOTAL_ALL_TOTAL) {
		A40_TOTAL_ALL_TOTAL = a40_TOTAL_ALL_TOTAL;
	}
	public String getA41_PRODUCT() {
		return A41_PRODUCT;
	}
	public void setA41_PRODUCT(String a41_PRODUCT) {
		A41_PRODUCT = a41_PRODUCT;
	}
	public BigDecimal getA41_KEY_NON_SKILLED() {
		return A41_KEY_NON_SKILLED;
	}
	public void setA41_KEY_NON_SKILLED(BigDecimal a41_KEY_NON_SKILLED) {
		A41_KEY_NON_SKILLED = a41_KEY_NON_SKILLED;
	}
	public BigDecimal getA41_KEY_NON_UNSKILLED() {
		return A41_KEY_NON_UNSKILLED;
	}
	public void setA41_KEY_NON_UNSKILLED(BigDecimal a41_KEY_NON_UNSKILLED) {
		A41_KEY_NON_UNSKILLED = a41_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA41_KEY_NON_TOTAL() {
		return A41_KEY_NON_TOTAL;
	}
	public void setA41_KEY_NON_TOTAL(BigDecimal a41_KEY_NON_TOTAL) {
		A41_KEY_NON_TOTAL = a41_KEY_NON_TOTAL;
	}
	public BigDecimal getA41_OTH_NON_SKILLED() {
		return A41_OTH_NON_SKILLED;
	}
	public void setA41_OTH_NON_SKILLED(BigDecimal a41_OTH_NON_SKILLED) {
		A41_OTH_NON_SKILLED = a41_OTH_NON_SKILLED;
	}
	public BigDecimal getA41_OTH_NON_UNSKILLED() {
		return A41_OTH_NON_UNSKILLED;
	}
	public void setA41_OTH_NON_UNSKILLED(BigDecimal a41_OTH_NON_UNSKILLED) {
		A41_OTH_NON_UNSKILLED = a41_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA41_OTH_NON_TOTAL() {
		return A41_OTH_NON_TOTAL;
	}
	public void setA41_OTH_NON_TOTAL(BigDecimal a41_OTH_NON_TOTAL) {
		A41_OTH_NON_TOTAL = a41_OTH_NON_TOTAL;
	}
	public BigDecimal getA41_TOTAL_NON_SKILLED() {
		return A41_TOTAL_NON_SKILLED;
	}
	public void setA41_TOTAL_NON_SKILLED(BigDecimal a41_TOTAL_NON_SKILLED) {
		A41_TOTAL_NON_SKILLED = a41_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA41_TOTAL_NON_UNSKILLED() {
		return A41_TOTAL_NON_UNSKILLED;
	}
	public void setA41_TOTAL_NON_UNSKILLED(BigDecimal a41_TOTAL_NON_UNSKILLED) {
		A41_TOTAL_NON_UNSKILLED = a41_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA41_TOTAL_NON_TOTAL() {
		return A41_TOTAL_NON_TOTAL;
	}
	public void setA41_TOTAL_NON_TOTAL(BigDecimal a41_TOTAL_NON_TOTAL) {
		A41_TOTAL_NON_TOTAL = a41_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA41_KEY_SKILLED() {
		return A41_KEY_SKILLED;
	}
	public void setA41_KEY_SKILLED(BigDecimal a41_KEY_SKILLED) {
		A41_KEY_SKILLED = a41_KEY_SKILLED;
	}
	public BigDecimal getA41_KEY_UNSKILLED() {
		return A41_KEY_UNSKILLED;
	}
	public void setA41_KEY_UNSKILLED(BigDecimal a41_KEY_UNSKILLED) {
		A41_KEY_UNSKILLED = a41_KEY_UNSKILLED;
	}
	public BigDecimal getA41_KEY_TOTAL() {
		return A41_KEY_TOTAL;
	}
	public void setA41_KEY_TOTAL(BigDecimal a41_KEY_TOTAL) {
		A41_KEY_TOTAL = a41_KEY_TOTAL;
	}
	public BigDecimal getA41_OTH_SKILLED() {
		return A41_OTH_SKILLED;
	}
	public void setA41_OTH_SKILLED(BigDecimal a41_OTH_SKILLED) {
		A41_OTH_SKILLED = a41_OTH_SKILLED;
	}
	public BigDecimal getA41_OTH_UNSKILLED() {
		return A41_OTH_UNSKILLED;
	}
	public void setA41_OTH_UNSKILLED(BigDecimal a41_OTH_UNSKILLED) {
		A41_OTH_UNSKILLED = a41_OTH_UNSKILLED;
	}
	public BigDecimal getA41_OTH_TOTAL() {
		return A41_OTH_TOTAL;
	}
	public void setA41_OTH_TOTAL(BigDecimal a41_OTH_TOTAL) {
		A41_OTH_TOTAL = a41_OTH_TOTAL;
	}
	public BigDecimal getA41_TOTAL_SKILLED() {
		return A41_TOTAL_SKILLED;
	}
	public void setA41_TOTAL_SKILLED(BigDecimal a41_TOTAL_SKILLED) {
		A41_TOTAL_SKILLED = a41_TOTAL_SKILLED;
	}
	public BigDecimal getA41_TOTAL_UNSKILLED() {
		return A41_TOTAL_UNSKILLED;
	}
	public void setA41_TOTAL_UNSKILLED(BigDecimal a41_TOTAL_UNSKILLED) {
		A41_TOTAL_UNSKILLED = a41_TOTAL_UNSKILLED;
	}
	public BigDecimal getA41_TOTAL_TOTAL() {
		return A41_TOTAL_TOTAL;
	}
	public void setA41_TOTAL_TOTAL(BigDecimal a41_TOTAL_TOTAL) {
		A41_TOTAL_TOTAL = a41_TOTAL_TOTAL;
	}
	public BigDecimal getA41_TOTAL_ALL_SKILLED() {
		return A41_TOTAL_ALL_SKILLED;
	}
	public void setA41_TOTAL_ALL_SKILLED(BigDecimal a41_TOTAL_ALL_SKILLED) {
		A41_TOTAL_ALL_SKILLED = a41_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA41_TOTAL_ALL_UNSKILLED() {
		return A41_TOTAL_ALL_UNSKILLED;
	}
	public void setA41_TOTAL_ALL_UNSKILLED(BigDecimal a41_TOTAL_ALL_UNSKILLED) {
		A41_TOTAL_ALL_UNSKILLED = a41_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA41_TOTAL_ALL_TOTAL() {
		return A41_TOTAL_ALL_TOTAL;
	}
	public void setA41_TOTAL_ALL_TOTAL(BigDecimal a41_TOTAL_ALL_TOTAL) {
		A41_TOTAL_ALL_TOTAL = a41_TOTAL_ALL_TOTAL;
	}
	public String getA42_PRODUCT() {
		return A42_PRODUCT;
	}
	public void setA42_PRODUCT(String a42_PRODUCT) {
		A42_PRODUCT = a42_PRODUCT;
	}
	public BigDecimal getA42_KEY_NON_SKILLED() {
		return A42_KEY_NON_SKILLED;
	}
	public void setA42_KEY_NON_SKILLED(BigDecimal a42_KEY_NON_SKILLED) {
		A42_KEY_NON_SKILLED = a42_KEY_NON_SKILLED;
	}
	public BigDecimal getA42_KEY_NON_UNSKILLED() {
		return A42_KEY_NON_UNSKILLED;
	}
	public void setA42_KEY_NON_UNSKILLED(BigDecimal a42_KEY_NON_UNSKILLED) {
		A42_KEY_NON_UNSKILLED = a42_KEY_NON_UNSKILLED;
	}
	public BigDecimal getA42_KEY_NON_TOTAL() {
		return A42_KEY_NON_TOTAL;
	}
	public void setA42_KEY_NON_TOTAL(BigDecimal a42_KEY_NON_TOTAL) {
		A42_KEY_NON_TOTAL = a42_KEY_NON_TOTAL;
	}
	public BigDecimal getA42_OTH_NON_SKILLED() {
		return A42_OTH_NON_SKILLED;
	}
	public void setA42_OTH_NON_SKILLED(BigDecimal a42_OTH_NON_SKILLED) {
		A42_OTH_NON_SKILLED = a42_OTH_NON_SKILLED;
	}
	public BigDecimal getA42_OTH_NON_UNSKILLED() {
		return A42_OTH_NON_UNSKILLED;
	}
	public void setA42_OTH_NON_UNSKILLED(BigDecimal a42_OTH_NON_UNSKILLED) {
		A42_OTH_NON_UNSKILLED = a42_OTH_NON_UNSKILLED;
	}
	public BigDecimal getA42_OTH_NON_TOTAL() {
		return A42_OTH_NON_TOTAL;
	}
	public void setA42_OTH_NON_TOTAL(BigDecimal a42_OTH_NON_TOTAL) {
		A42_OTH_NON_TOTAL = a42_OTH_NON_TOTAL;
	}
	public BigDecimal getA42_TOTAL_NON_SKILLED() {
		return A42_TOTAL_NON_SKILLED;
	}
	public void setA42_TOTAL_NON_SKILLED(BigDecimal a42_TOTAL_NON_SKILLED) {
		A42_TOTAL_NON_SKILLED = a42_TOTAL_NON_SKILLED;
	}
	public BigDecimal getA42_TOTAL_NON_UNSKILLED() {
		return A42_TOTAL_NON_UNSKILLED;
	}
	public void setA42_TOTAL_NON_UNSKILLED(BigDecimal a42_TOTAL_NON_UNSKILLED) {
		A42_TOTAL_NON_UNSKILLED = a42_TOTAL_NON_UNSKILLED;
	}
	public BigDecimal getA42_TOTAL_NON_TOTAL() {
		return A42_TOTAL_NON_TOTAL;
	}
	public void setA42_TOTAL_NON_TOTAL(BigDecimal a42_TOTAL_NON_TOTAL) {
		A42_TOTAL_NON_TOTAL = a42_TOTAL_NON_TOTAL;
	}
	public BigDecimal getA42_KEY_SKILLED() {
		return A42_KEY_SKILLED;
	}
	public void setA42_KEY_SKILLED(BigDecimal a42_KEY_SKILLED) {
		A42_KEY_SKILLED = a42_KEY_SKILLED;
	}
	public BigDecimal getA42_KEY_UNSKILLED() {
		return A42_KEY_UNSKILLED;
	}
	public void setA42_KEY_UNSKILLED(BigDecimal a42_KEY_UNSKILLED) {
		A42_KEY_UNSKILLED = a42_KEY_UNSKILLED;
	}
	public BigDecimal getA42_KEY_TOTAL() {
		return A42_KEY_TOTAL;
	}
	public void setA42_KEY_TOTAL(BigDecimal a42_KEY_TOTAL) {
		A42_KEY_TOTAL = a42_KEY_TOTAL;
	}
	public BigDecimal getA42_OTH_SKILLED() {
		return A42_OTH_SKILLED;
	}
	public void setA42_OTH_SKILLED(BigDecimal a42_OTH_SKILLED) {
		A42_OTH_SKILLED = a42_OTH_SKILLED;
	}
	public BigDecimal getA42_OTH_UNSKILLED() {
		return A42_OTH_UNSKILLED;
	}
	public void setA42_OTH_UNSKILLED(BigDecimal a42_OTH_UNSKILLED) {
		A42_OTH_UNSKILLED = a42_OTH_UNSKILLED;
	}
	public BigDecimal getA42_OTH_TOTAL() {
		return A42_OTH_TOTAL;
	}
	public void setA42_OTH_TOTAL(BigDecimal a42_OTH_TOTAL) {
		A42_OTH_TOTAL = a42_OTH_TOTAL;
	}
	public BigDecimal getA42_TOTAL_SKILLED() {
		return A42_TOTAL_SKILLED;
	}
	public void setA42_TOTAL_SKILLED(BigDecimal a42_TOTAL_SKILLED) {
		A42_TOTAL_SKILLED = a42_TOTAL_SKILLED;
	}
	public BigDecimal getA42_TOTAL_UNSKILLED() {
		return A42_TOTAL_UNSKILLED;
	}
	public void setA42_TOTAL_UNSKILLED(BigDecimal a42_TOTAL_UNSKILLED) {
		A42_TOTAL_UNSKILLED = a42_TOTAL_UNSKILLED;
	}
	public BigDecimal getA42_TOTAL_TOTAL() {
		return A42_TOTAL_TOTAL;
	}
	public void setA42_TOTAL_TOTAL(BigDecimal a42_TOTAL_TOTAL) {
		A42_TOTAL_TOTAL = a42_TOTAL_TOTAL;
	}
	public BigDecimal getA42_TOTAL_ALL_SKILLED() {
		return A42_TOTAL_ALL_SKILLED;
	}
	public void setA42_TOTAL_ALL_SKILLED(BigDecimal a42_TOTAL_ALL_SKILLED) {
		A42_TOTAL_ALL_SKILLED = a42_TOTAL_ALL_SKILLED;
	}
	public BigDecimal getA42_TOTAL_ALL_UNSKILLED() {
		return A42_TOTAL_ALL_UNSKILLED;
	}
	public void setA42_TOTAL_ALL_UNSKILLED(BigDecimal a42_TOTAL_ALL_UNSKILLED) {
		A42_TOTAL_ALL_UNSKILLED = a42_TOTAL_ALL_UNSKILLED;
	}
	public BigDecimal getA42_TOTAL_ALL_TOTAL() {
		return A42_TOTAL_ALL_TOTAL;
	}
	public void setA42_TOTAL_ALL_TOTAL(BigDecimal a42_TOTAL_ALL_TOTAL) {
		A42_TOTAL_ALL_TOTAL = a42_TOTAL_ALL_TOTAL;
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
	
	public T1CORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
						
