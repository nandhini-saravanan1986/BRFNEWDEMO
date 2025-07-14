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
@Table(name="T31_OR_IT_RELATED_EMPLOYEE_TURNOVER_TABLE")
public class T31ORReport {
	private String	A1_PRODUCT;
	private String	A2_PRODUCT;
	private BigDecimal	A2_FULL_TIME_STAFF;
	private BigDecimal	A2_PART_TIME_STAFF;
	private BigDecimal	A2_KEY_EMPLOYEES;
	private BigDecimal	A2_MANAGEMENT;
	private String	A3_PRODUCT;
	private BigDecimal	A3_FULL_TIME_STAFF;
	private BigDecimal	A3_PART_TIME_STAFF;
	private BigDecimal	A3_KEY_EMPLOYEES;
	private BigDecimal	A3_MANAGEMENT;
	private String	A4_PRODUCT;
	private BigDecimal	A4_FULL_TIME_STAFF;
	private BigDecimal	A4_PART_TIME_STAFF;
	private BigDecimal	A4_KEY_EMPLOYEES;
	private BigDecimal	A4_MANAGEMENT;
	private String	A5_PRODUCT;
	private BigDecimal	A5_FULL_TIME_STAFF;
	private BigDecimal	A5_PART_TIME_STAFF;
	private BigDecimal	A5_KEY_EMPLOYEES;
	private BigDecimal	A5_MANAGEMENT;
	private String	A6_PRODUCT;
	private BigDecimal	A6_FULL_TIME_STAFF;
	private BigDecimal	A6_PART_TIME_STAFF;
	private BigDecimal	A6_KEY_EMPLOYEES;
	private BigDecimal	A6_MANAGEMENT;
	private String	A7_PRODUCT;
	private BigDecimal	A7_FULL_TIME_STAFF;
	private BigDecimal	A7_PART_TIME_STAFF;
	private BigDecimal	A7_KEY_EMPLOYEES;
	private BigDecimal	A7_MANAGEMENT;
	private String	A8_PRODUCT;
	private String	A8_PRODUCT_VALUE_1;
	private String	A8_PRODUCT_VALUE_2;
	private String	A8_PRODUCT_VALUE_3;
	private String	A8_PRODUCT_VALUE_4;
	private String	A9_PRODUCT;
	private String	A10_PRODUCT;
	private BigDecimal	A10_FULL_TIME_STAFF;
	private BigDecimal	A10_PART_TIME_STAFF;
	private BigDecimal	A10_KEY_EMPLOYEES;
	private BigDecimal	A10_MANAGEMENT;
	private String	A11_PRODUCT;
	private BigDecimal	A11_FULL_TIME_STAFF;
	private BigDecimal	A11_PART_TIME_STAFF;
	private BigDecimal	A11_KEY_EMPLOYEES;
	private BigDecimal	A11_MANAGEMENT;
	private String	A12_PRODUCT;
	private BigDecimal	A12_FULL_TIME_STAFF;
	private BigDecimal	A12_PART_TIME_STAFF;
	private BigDecimal	A12_KEY_EMPLOYEES;
	private BigDecimal	A12_MANAGEMENT;
	private String	A13_PRODUCT;
	private BigDecimal	A13_FULL_TIME_STAFF;
	private BigDecimal	A13_PART_TIME_STAFF;
	private BigDecimal	A13_KEY_EMPLOYEES;
	private BigDecimal	A13_MANAGEMENT;
	private String	A14_PRODUCT;
	private BigDecimal	A14_FULL_TIME_STAFF;
	private BigDecimal	A14_PART_TIME_STAFF;
	private BigDecimal	A14_KEY_EMPLOYEES;
	private BigDecimal	A14_MANAGEMENT;
	private String	A15_PRODUCT;
	private BigDecimal	A15_FULL_TIME_STAFF;
	private BigDecimal	A15_PART_TIME_STAFF;
	private BigDecimal	A15_KEY_EMPLOYEES;
	private BigDecimal	A15_MANAGEMENT;
	private String	A16_PRODUCT;
	private String	A16_PRODUCT_VALUE_1;
	private String	A16_PRODUCT_VALUE_2;
	private String	A16_PRODUCT_VALUE_3;
	private String	A16_PRODUCT_VALUE_4;
	private String	A17_PRODUCT;
	private String	A18_PRODUCT;
	private BigDecimal	A18_FULL_TIME_STAFF;
	private BigDecimal	A18_PART_TIME_STAFF;
	private BigDecimal	A18_KEY_EMPLOYEES;
	private BigDecimal	A18_MANAGEMENT;
	private String	A19_PRODUCT;
	private BigDecimal	A19_FULL_TIME_STAFF;
	private BigDecimal	A19_PART_TIME_STAFF;
	private BigDecimal	A19_KEY_EMPLOYEES;
	private BigDecimal	A19_MANAGEMENT;
	private String	A20_PRODUCT;
	private BigDecimal	A20_FULL_TIME_STAFF;
	private BigDecimal	A20_PART_TIME_STAFF;
	private BigDecimal	A20_KEY_EMPLOYEES;
	private BigDecimal	A20_MANAGEMENT;
	private String	A21_PRODUCT;
	private BigDecimal	A21_FULL_TIME_STAFF;
	private BigDecimal	A21_PART_TIME_STAFF;
	private BigDecimal	A21_KEY_EMPLOYEES;
	private BigDecimal	A21_MANAGEMENT;
	private String	A22_PRODUCT;
	private BigDecimal	A22_FULL_TIME_STAFF;
	private BigDecimal	A22_PART_TIME_STAFF;
	private BigDecimal	A22_KEY_EMPLOYEES;
	private BigDecimal	A22_MANAGEMENT;
	private String	A23_PRODUCT;
	private BigDecimal	A23_FULL_TIME_STAFF;
	private BigDecimal	A23_PART_TIME_STAFF;
	private BigDecimal	A23_KEY_EMPLOYEES;
	private BigDecimal	A23_MANAGEMENT;
	private String	A24_PRODUCT;
	private String	A24_PRODUCT_VALUE_1;
	private String	A24_PRODUCT_VALUE_2;
	private String	A24_PRODUCT_VALUE_3;
	private String	A24_PRODUCT_VALUE_4;
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
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_FULL_TIME_STAFF() {
		return A2_FULL_TIME_STAFF;
	}
	public void setA2_FULL_TIME_STAFF(BigDecimal a2_FULL_TIME_STAFF) {
		A2_FULL_TIME_STAFF = a2_FULL_TIME_STAFF;
	}
	public BigDecimal getA2_PART_TIME_STAFF() {
		return A2_PART_TIME_STAFF;
	}
	public void setA2_PART_TIME_STAFF(BigDecimal a2_PART_TIME_STAFF) {
		A2_PART_TIME_STAFF = a2_PART_TIME_STAFF;
	}
	public BigDecimal getA2_KEY_EMPLOYEES() {
		return A2_KEY_EMPLOYEES;
	}
	public void setA2_KEY_EMPLOYEES(BigDecimal a2_KEY_EMPLOYEES) {
		A2_KEY_EMPLOYEES = a2_KEY_EMPLOYEES;
	}
	public BigDecimal getA2_MANAGEMENT() {
		return A2_MANAGEMENT;
	}
	public void setA2_MANAGEMENT(BigDecimal a2_MANAGEMENT) {
		A2_MANAGEMENT = a2_MANAGEMENT;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_FULL_TIME_STAFF() {
		return A3_FULL_TIME_STAFF;
	}
	public void setA3_FULL_TIME_STAFF(BigDecimal a3_FULL_TIME_STAFF) {
		A3_FULL_TIME_STAFF = a3_FULL_TIME_STAFF;
	}
	public BigDecimal getA3_PART_TIME_STAFF() {
		return A3_PART_TIME_STAFF;
	}
	public void setA3_PART_TIME_STAFF(BigDecimal a3_PART_TIME_STAFF) {
		A3_PART_TIME_STAFF = a3_PART_TIME_STAFF;
	}
	public BigDecimal getA3_KEY_EMPLOYEES() {
		return A3_KEY_EMPLOYEES;
	}
	public void setA3_KEY_EMPLOYEES(BigDecimal a3_KEY_EMPLOYEES) {
		A3_KEY_EMPLOYEES = a3_KEY_EMPLOYEES;
	}
	public BigDecimal getA3_MANAGEMENT() {
		return A3_MANAGEMENT;
	}
	public void setA3_MANAGEMENT(BigDecimal a3_MANAGEMENT) {
		A3_MANAGEMENT = a3_MANAGEMENT;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_FULL_TIME_STAFF() {
		return A4_FULL_TIME_STAFF;
	}
	public void setA4_FULL_TIME_STAFF(BigDecimal a4_FULL_TIME_STAFF) {
		A4_FULL_TIME_STAFF = a4_FULL_TIME_STAFF;
	}
	public BigDecimal getA4_PART_TIME_STAFF() {
		return A4_PART_TIME_STAFF;
	}
	public void setA4_PART_TIME_STAFF(BigDecimal a4_PART_TIME_STAFF) {
		A4_PART_TIME_STAFF = a4_PART_TIME_STAFF;
	}
	public BigDecimal getA4_KEY_EMPLOYEES() {
		return A4_KEY_EMPLOYEES;
	}
	public void setA4_KEY_EMPLOYEES(BigDecimal a4_KEY_EMPLOYEES) {
		A4_KEY_EMPLOYEES = a4_KEY_EMPLOYEES;
	}
	public BigDecimal getA4_MANAGEMENT() {
		return A4_MANAGEMENT;
	}
	public void setA4_MANAGEMENT(BigDecimal a4_MANAGEMENT) {
		A4_MANAGEMENT = a4_MANAGEMENT;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_FULL_TIME_STAFF() {
		return A5_FULL_TIME_STAFF;
	}
	public void setA5_FULL_TIME_STAFF(BigDecimal a5_FULL_TIME_STAFF) {
		A5_FULL_TIME_STAFF = a5_FULL_TIME_STAFF;
	}
	public BigDecimal getA5_PART_TIME_STAFF() {
		return A5_PART_TIME_STAFF;
	}
	public void setA5_PART_TIME_STAFF(BigDecimal a5_PART_TIME_STAFF) {
		A5_PART_TIME_STAFF = a5_PART_TIME_STAFF;
	}
	public BigDecimal getA5_KEY_EMPLOYEES() {
		return A5_KEY_EMPLOYEES;
	}
	public void setA5_KEY_EMPLOYEES(BigDecimal a5_KEY_EMPLOYEES) {
		A5_KEY_EMPLOYEES = a5_KEY_EMPLOYEES;
	}
	public BigDecimal getA5_MANAGEMENT() {
		return A5_MANAGEMENT;
	}
	public void setA5_MANAGEMENT(BigDecimal a5_MANAGEMENT) {
		A5_MANAGEMENT = a5_MANAGEMENT;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_FULL_TIME_STAFF() {
		return A6_FULL_TIME_STAFF;
	}
	public void setA6_FULL_TIME_STAFF(BigDecimal a6_FULL_TIME_STAFF) {
		A6_FULL_TIME_STAFF = a6_FULL_TIME_STAFF;
	}
	public BigDecimal getA6_PART_TIME_STAFF() {
		return A6_PART_TIME_STAFF;
	}
	public void setA6_PART_TIME_STAFF(BigDecimal a6_PART_TIME_STAFF) {
		A6_PART_TIME_STAFF = a6_PART_TIME_STAFF;
	}
	public BigDecimal getA6_KEY_EMPLOYEES() {
		return A6_KEY_EMPLOYEES;
	}
	public void setA6_KEY_EMPLOYEES(BigDecimal a6_KEY_EMPLOYEES) {
		A6_KEY_EMPLOYEES = a6_KEY_EMPLOYEES;
	}
	public BigDecimal getA6_MANAGEMENT() {
		return A6_MANAGEMENT;
	}
	public void setA6_MANAGEMENT(BigDecimal a6_MANAGEMENT) {
		A6_MANAGEMENT = a6_MANAGEMENT;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_FULL_TIME_STAFF() {
		return A7_FULL_TIME_STAFF;
	}
	public void setA7_FULL_TIME_STAFF(BigDecimal a7_FULL_TIME_STAFF) {
		A7_FULL_TIME_STAFF = a7_FULL_TIME_STAFF;
	}
	public BigDecimal getA7_PART_TIME_STAFF() {
		return A7_PART_TIME_STAFF;
	}
	public void setA7_PART_TIME_STAFF(BigDecimal a7_PART_TIME_STAFF) {
		A7_PART_TIME_STAFF = a7_PART_TIME_STAFF;
	}
	public BigDecimal getA7_KEY_EMPLOYEES() {
		return A7_KEY_EMPLOYEES;
	}
	public void setA7_KEY_EMPLOYEES(BigDecimal a7_KEY_EMPLOYEES) {
		A7_KEY_EMPLOYEES = a7_KEY_EMPLOYEES;
	}
	public BigDecimal getA7_MANAGEMENT() {
		return A7_MANAGEMENT;
	}
	public void setA7_MANAGEMENT(BigDecimal a7_MANAGEMENT) {
		A7_MANAGEMENT = a7_MANAGEMENT;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public String getA8_PRODUCT_VALUE_1() {
		return A8_PRODUCT_VALUE_1;
	}
	public void setA8_PRODUCT_VALUE_1(String a8_PRODUCT_VALUE_1) {
		A8_PRODUCT_VALUE_1 = a8_PRODUCT_VALUE_1;
	}
	public String getA8_PRODUCT_VALUE_2() {
		return A8_PRODUCT_VALUE_2;
	}
	public void setA8_PRODUCT_VALUE_2(String a8_PRODUCT_VALUE_2) {
		A8_PRODUCT_VALUE_2 = a8_PRODUCT_VALUE_2;
	}
	public String getA8_PRODUCT_VALUE_3() {
		return A8_PRODUCT_VALUE_3;
	}
	public void setA8_PRODUCT_VALUE_3(String a8_PRODUCT_VALUE_3) {
		A8_PRODUCT_VALUE_3 = a8_PRODUCT_VALUE_3;
	}
	public String getA8_PRODUCT_VALUE_4() {
		return A8_PRODUCT_VALUE_4;
	}
	public void setA8_PRODUCT_VALUE_4(String a8_PRODUCT_VALUE_4) {
		A8_PRODUCT_VALUE_4 = a8_PRODUCT_VALUE_4;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10_FULL_TIME_STAFF() {
		return A10_FULL_TIME_STAFF;
	}
	public void setA10_FULL_TIME_STAFF(BigDecimal a10_FULL_TIME_STAFF) {
		A10_FULL_TIME_STAFF = a10_FULL_TIME_STAFF;
	}
	public BigDecimal getA10_PART_TIME_STAFF() {
		return A10_PART_TIME_STAFF;
	}
	public void setA10_PART_TIME_STAFF(BigDecimal a10_PART_TIME_STAFF) {
		A10_PART_TIME_STAFF = a10_PART_TIME_STAFF;
	}
	public BigDecimal getA10_KEY_EMPLOYEES() {
		return A10_KEY_EMPLOYEES;
	}
	public void setA10_KEY_EMPLOYEES(BigDecimal a10_KEY_EMPLOYEES) {
		A10_KEY_EMPLOYEES = a10_KEY_EMPLOYEES;
	}
	public BigDecimal getA10_MANAGEMENT() {
		return A10_MANAGEMENT;
	}
	public void setA10_MANAGEMENT(BigDecimal a10_MANAGEMENT) {
		A10_MANAGEMENT = a10_MANAGEMENT;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_FULL_TIME_STAFF() {
		return A11_FULL_TIME_STAFF;
	}
	public void setA11_FULL_TIME_STAFF(BigDecimal a11_FULL_TIME_STAFF) {
		A11_FULL_TIME_STAFF = a11_FULL_TIME_STAFF;
	}
	public BigDecimal getA11_PART_TIME_STAFF() {
		return A11_PART_TIME_STAFF;
	}
	public void setA11_PART_TIME_STAFF(BigDecimal a11_PART_TIME_STAFF) {
		A11_PART_TIME_STAFF = a11_PART_TIME_STAFF;
	}
	public BigDecimal getA11_KEY_EMPLOYEES() {
		return A11_KEY_EMPLOYEES;
	}
	public void setA11_KEY_EMPLOYEES(BigDecimal a11_KEY_EMPLOYEES) {
		A11_KEY_EMPLOYEES = a11_KEY_EMPLOYEES;
	}
	public BigDecimal getA11_MANAGEMENT() {
		return A11_MANAGEMENT;
	}
	public void setA11_MANAGEMENT(BigDecimal a11_MANAGEMENT) {
		A11_MANAGEMENT = a11_MANAGEMENT;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_FULL_TIME_STAFF() {
		return A12_FULL_TIME_STAFF;
	}
	public void setA12_FULL_TIME_STAFF(BigDecimal a12_FULL_TIME_STAFF) {
		A12_FULL_TIME_STAFF = a12_FULL_TIME_STAFF;
	}
	public BigDecimal getA12_PART_TIME_STAFF() {
		return A12_PART_TIME_STAFF;
	}
	public void setA12_PART_TIME_STAFF(BigDecimal a12_PART_TIME_STAFF) {
		A12_PART_TIME_STAFF = a12_PART_TIME_STAFF;
	}
	public BigDecimal getA12_KEY_EMPLOYEES() {
		return A12_KEY_EMPLOYEES;
	}
	public void setA12_KEY_EMPLOYEES(BigDecimal a12_KEY_EMPLOYEES) {
		A12_KEY_EMPLOYEES = a12_KEY_EMPLOYEES;
	}
	public BigDecimal getA12_MANAGEMENT() {
		return A12_MANAGEMENT;
	}
	public void setA12_MANAGEMENT(BigDecimal a12_MANAGEMENT) {
		A12_MANAGEMENT = a12_MANAGEMENT;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_FULL_TIME_STAFF() {
		return A13_FULL_TIME_STAFF;
	}
	public void setA13_FULL_TIME_STAFF(BigDecimal a13_FULL_TIME_STAFF) {
		A13_FULL_TIME_STAFF = a13_FULL_TIME_STAFF;
	}
	public BigDecimal getA13_PART_TIME_STAFF() {
		return A13_PART_TIME_STAFF;
	}
	public void setA13_PART_TIME_STAFF(BigDecimal a13_PART_TIME_STAFF) {
		A13_PART_TIME_STAFF = a13_PART_TIME_STAFF;
	}
	public BigDecimal getA13_KEY_EMPLOYEES() {
		return A13_KEY_EMPLOYEES;
	}
	public void setA13_KEY_EMPLOYEES(BigDecimal a13_KEY_EMPLOYEES) {
		A13_KEY_EMPLOYEES = a13_KEY_EMPLOYEES;
	}
	public BigDecimal getA13_MANAGEMENT() {
		return A13_MANAGEMENT;
	}
	public void setA13_MANAGEMENT(BigDecimal a13_MANAGEMENT) {
		A13_MANAGEMENT = a13_MANAGEMENT;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_FULL_TIME_STAFF() {
		return A14_FULL_TIME_STAFF;
	}
	public void setA14_FULL_TIME_STAFF(BigDecimal a14_FULL_TIME_STAFF) {
		A14_FULL_TIME_STAFF = a14_FULL_TIME_STAFF;
	}
	public BigDecimal getA14_PART_TIME_STAFF() {
		return A14_PART_TIME_STAFF;
	}
	public void setA14_PART_TIME_STAFF(BigDecimal a14_PART_TIME_STAFF) {
		A14_PART_TIME_STAFF = a14_PART_TIME_STAFF;
	}
	public BigDecimal getA14_KEY_EMPLOYEES() {
		return A14_KEY_EMPLOYEES;
	}
	public void setA14_KEY_EMPLOYEES(BigDecimal a14_KEY_EMPLOYEES) {
		A14_KEY_EMPLOYEES = a14_KEY_EMPLOYEES;
	}
	public BigDecimal getA14_MANAGEMENT() {
		return A14_MANAGEMENT;
	}
	public void setA14_MANAGEMENT(BigDecimal a14_MANAGEMENT) {
		A14_MANAGEMENT = a14_MANAGEMENT;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_FULL_TIME_STAFF() {
		return A15_FULL_TIME_STAFF;
	}
	public void setA15_FULL_TIME_STAFF(BigDecimal a15_FULL_TIME_STAFF) {
		A15_FULL_TIME_STAFF = a15_FULL_TIME_STAFF;
	}
	public BigDecimal getA15_PART_TIME_STAFF() {
		return A15_PART_TIME_STAFF;
	}
	public void setA15_PART_TIME_STAFF(BigDecimal a15_PART_TIME_STAFF) {
		A15_PART_TIME_STAFF = a15_PART_TIME_STAFF;
	}
	public BigDecimal getA15_KEY_EMPLOYEES() {
		return A15_KEY_EMPLOYEES;
	}
	public void setA15_KEY_EMPLOYEES(BigDecimal a15_KEY_EMPLOYEES) {
		A15_KEY_EMPLOYEES = a15_KEY_EMPLOYEES;
	}
	public BigDecimal getA15_MANAGEMENT() {
		return A15_MANAGEMENT;
	}
	public void setA15_MANAGEMENT(BigDecimal a15_MANAGEMENT) {
		A15_MANAGEMENT = a15_MANAGEMENT;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public String getA16_PRODUCT_VALUE_1() {
		return A16_PRODUCT_VALUE_1;
	}
	public void setA16_PRODUCT_VALUE_1(String a16_PRODUCT_VALUE_1) {
		A16_PRODUCT_VALUE_1 = a16_PRODUCT_VALUE_1;
	}
	public String getA16_PRODUCT_VALUE_2() {
		return A16_PRODUCT_VALUE_2;
	}
	public void setA16_PRODUCT_VALUE_2(String a16_PRODUCT_VALUE_2) {
		A16_PRODUCT_VALUE_2 = a16_PRODUCT_VALUE_2;
	}
	public String getA16_PRODUCT_VALUE_3() {
		return A16_PRODUCT_VALUE_3;
	}
	public void setA16_PRODUCT_VALUE_3(String a16_PRODUCT_VALUE_3) {
		A16_PRODUCT_VALUE_3 = a16_PRODUCT_VALUE_3;
	}
	public String getA16_PRODUCT_VALUE_4() {
		return A16_PRODUCT_VALUE_4;
	}
	public void setA16_PRODUCT_VALUE_4(String a16_PRODUCT_VALUE_4) {
		A16_PRODUCT_VALUE_4 = a16_PRODUCT_VALUE_4;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public BigDecimal getA18_FULL_TIME_STAFF() {
		return A18_FULL_TIME_STAFF;
	}
	public void setA18_FULL_TIME_STAFF(BigDecimal a18_FULL_TIME_STAFF) {
		A18_FULL_TIME_STAFF = a18_FULL_TIME_STAFF;
	}
	public BigDecimal getA18_PART_TIME_STAFF() {
		return A18_PART_TIME_STAFF;
	}
	public void setA18_PART_TIME_STAFF(BigDecimal a18_PART_TIME_STAFF) {
		A18_PART_TIME_STAFF = a18_PART_TIME_STAFF;
	}
	public BigDecimal getA18_KEY_EMPLOYEES() {
		return A18_KEY_EMPLOYEES;
	}
	public void setA18_KEY_EMPLOYEES(BigDecimal a18_KEY_EMPLOYEES) {
		A18_KEY_EMPLOYEES = a18_KEY_EMPLOYEES;
	}
	public BigDecimal getA18_MANAGEMENT() {
		return A18_MANAGEMENT;
	}
	public void setA18_MANAGEMENT(BigDecimal a18_MANAGEMENT) {
		A18_MANAGEMENT = a18_MANAGEMENT;
	}
	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}
	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}
	public BigDecimal getA19_FULL_TIME_STAFF() {
		return A19_FULL_TIME_STAFF;
	}
	public void setA19_FULL_TIME_STAFF(BigDecimal a19_FULL_TIME_STAFF) {
		A19_FULL_TIME_STAFF = a19_FULL_TIME_STAFF;
	}
	public BigDecimal getA19_PART_TIME_STAFF() {
		return A19_PART_TIME_STAFF;
	}
	public void setA19_PART_TIME_STAFF(BigDecimal a19_PART_TIME_STAFF) {
		A19_PART_TIME_STAFF = a19_PART_TIME_STAFF;
	}
	public BigDecimal getA19_KEY_EMPLOYEES() {
		return A19_KEY_EMPLOYEES;
	}
	public void setA19_KEY_EMPLOYEES(BigDecimal a19_KEY_EMPLOYEES) {
		A19_KEY_EMPLOYEES = a19_KEY_EMPLOYEES;
	}
	public BigDecimal getA19_MANAGEMENT() {
		return A19_MANAGEMENT;
	}
	public void setA19_MANAGEMENT(BigDecimal a19_MANAGEMENT) {
		A19_MANAGEMENT = a19_MANAGEMENT;
	}
	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}
	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}
	public BigDecimal getA20_FULL_TIME_STAFF() {
		return A20_FULL_TIME_STAFF;
	}
	public void setA20_FULL_TIME_STAFF(BigDecimal a20_FULL_TIME_STAFF) {
		A20_FULL_TIME_STAFF = a20_FULL_TIME_STAFF;
	}
	public BigDecimal getA20_PART_TIME_STAFF() {
		return A20_PART_TIME_STAFF;
	}
	public void setA20_PART_TIME_STAFF(BigDecimal a20_PART_TIME_STAFF) {
		A20_PART_TIME_STAFF = a20_PART_TIME_STAFF;
	}
	public BigDecimal getA20_KEY_EMPLOYEES() {
		return A20_KEY_EMPLOYEES;
	}
	public void setA20_KEY_EMPLOYEES(BigDecimal a20_KEY_EMPLOYEES) {
		A20_KEY_EMPLOYEES = a20_KEY_EMPLOYEES;
	}
	public BigDecimal getA20_MANAGEMENT() {
		return A20_MANAGEMENT;
	}
	public void setA20_MANAGEMENT(BigDecimal a20_MANAGEMENT) {
		A20_MANAGEMENT = a20_MANAGEMENT;
	}
	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}
	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}
	public BigDecimal getA21_FULL_TIME_STAFF() {
		return A21_FULL_TIME_STAFF;
	}
	public void setA21_FULL_TIME_STAFF(BigDecimal a21_FULL_TIME_STAFF) {
		A21_FULL_TIME_STAFF = a21_FULL_TIME_STAFF;
	}
	public BigDecimal getA21_PART_TIME_STAFF() {
		return A21_PART_TIME_STAFF;
	}
	public void setA21_PART_TIME_STAFF(BigDecimal a21_PART_TIME_STAFF) {
		A21_PART_TIME_STAFF = a21_PART_TIME_STAFF;
	}
	public BigDecimal getA21_KEY_EMPLOYEES() {
		return A21_KEY_EMPLOYEES;
	}
	public void setA21_KEY_EMPLOYEES(BigDecimal a21_KEY_EMPLOYEES) {
		A21_KEY_EMPLOYEES = a21_KEY_EMPLOYEES;
	}
	public BigDecimal getA21_MANAGEMENT() {
		return A21_MANAGEMENT;
	}
	public void setA21_MANAGEMENT(BigDecimal a21_MANAGEMENT) {
		A21_MANAGEMENT = a21_MANAGEMENT;
	}
	public String getA22_PRODUCT() {
		return A22_PRODUCT;
	}
	public void setA22_PRODUCT(String a22_PRODUCT) {
		A22_PRODUCT = a22_PRODUCT;
	}
	public BigDecimal getA22_FULL_TIME_STAFF() {
		return A22_FULL_TIME_STAFF;
	}
	public void setA22_FULL_TIME_STAFF(BigDecimal a22_FULL_TIME_STAFF) {
		A22_FULL_TIME_STAFF = a22_FULL_TIME_STAFF;
	}
	public BigDecimal getA22_PART_TIME_STAFF() {
		return A22_PART_TIME_STAFF;
	}
	public void setA22_PART_TIME_STAFF(BigDecimal a22_PART_TIME_STAFF) {
		A22_PART_TIME_STAFF = a22_PART_TIME_STAFF;
	}
	public BigDecimal getA22_KEY_EMPLOYEES() {
		return A22_KEY_EMPLOYEES;
	}
	public void setA22_KEY_EMPLOYEES(BigDecimal a22_KEY_EMPLOYEES) {
		A22_KEY_EMPLOYEES = a22_KEY_EMPLOYEES;
	}
	public BigDecimal getA22_MANAGEMENT() {
		return A22_MANAGEMENT;
	}
	public void setA22_MANAGEMENT(BigDecimal a22_MANAGEMENT) {
		A22_MANAGEMENT = a22_MANAGEMENT;
	}
	public String getA23_PRODUCT() {
		return A23_PRODUCT;
	}
	public void setA23_PRODUCT(String a23_PRODUCT) {
		A23_PRODUCT = a23_PRODUCT;
	}
	public BigDecimal getA23_FULL_TIME_STAFF() {
		return A23_FULL_TIME_STAFF;
	}
	public void setA23_FULL_TIME_STAFF(BigDecimal a23_FULL_TIME_STAFF) {
		A23_FULL_TIME_STAFF = a23_FULL_TIME_STAFF;
	}
	public BigDecimal getA23_PART_TIME_STAFF() {
		return A23_PART_TIME_STAFF;
	}
	public void setA23_PART_TIME_STAFF(BigDecimal a23_PART_TIME_STAFF) {
		A23_PART_TIME_STAFF = a23_PART_TIME_STAFF;
	}
	public BigDecimal getA23_KEY_EMPLOYEES() {
		return A23_KEY_EMPLOYEES;
	}
	public void setA23_KEY_EMPLOYEES(BigDecimal a23_KEY_EMPLOYEES) {
		A23_KEY_EMPLOYEES = a23_KEY_EMPLOYEES;
	}
	public BigDecimal getA23_MANAGEMENT() {
		return A23_MANAGEMENT;
	}
	public void setA23_MANAGEMENT(BigDecimal a23_MANAGEMENT) {
		A23_MANAGEMENT = a23_MANAGEMENT;
	}
	public String getA24_PRODUCT() {
		return A24_PRODUCT;
	}
	public void setA24_PRODUCT(String a24_PRODUCT) {
		A24_PRODUCT = a24_PRODUCT;
	}
	public String getA24_PRODUCT_VALUE_1() {
		return A24_PRODUCT_VALUE_1;
	}
	public void setA24_PRODUCT_VALUE_1(String a24_PRODUCT_VALUE_1) {
		A24_PRODUCT_VALUE_1 = a24_PRODUCT_VALUE_1;
	}
	public String getA24_PRODUCT_VALUE_2() {
		return A24_PRODUCT_VALUE_2;
	}
	public void setA24_PRODUCT_VALUE_2(String a24_PRODUCT_VALUE_2) {
		A24_PRODUCT_VALUE_2 = a24_PRODUCT_VALUE_2;
	}
	public String getA24_PRODUCT_VALUE_3() {
		return A24_PRODUCT_VALUE_3;
	}
	public void setA24_PRODUCT_VALUE_3(String a24_PRODUCT_VALUE_3) {
		A24_PRODUCT_VALUE_3 = a24_PRODUCT_VALUE_3;
	}
	public String getA24_PRODUCT_VALUE_4() {
		return A24_PRODUCT_VALUE_4;
	}
	public void setA24_PRODUCT_VALUE_4(String a24_PRODUCT_VALUE_4) {
		A24_PRODUCT_VALUE_4 = a24_PRODUCT_VALUE_4;
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
	public T31ORReport(String a1_PRODUCT, String a2_PRODUCT, BigDecimal a2_FULL_TIME_STAFF,
			BigDecimal a2_PART_TIME_STAFF, BigDecimal a2_KEY_EMPLOYEES, BigDecimal a2_MANAGEMENT, String a3_PRODUCT,
			BigDecimal a3_FULL_TIME_STAFF, BigDecimal a3_PART_TIME_STAFF, BigDecimal a3_KEY_EMPLOYEES,
			BigDecimal a3_MANAGEMENT, String a4_PRODUCT, BigDecimal a4_FULL_TIME_STAFF, BigDecimal a4_PART_TIME_STAFF,
			BigDecimal a4_KEY_EMPLOYEES, BigDecimal a4_MANAGEMENT, String a5_PRODUCT, BigDecimal a5_FULL_TIME_STAFF,
			BigDecimal a5_PART_TIME_STAFF, BigDecimal a5_KEY_EMPLOYEES, BigDecimal a5_MANAGEMENT, String a6_PRODUCT,
			BigDecimal a6_FULL_TIME_STAFF, BigDecimal a6_PART_TIME_STAFF, BigDecimal a6_KEY_EMPLOYEES,
			BigDecimal a6_MANAGEMENT, String a7_PRODUCT, BigDecimal a7_FULL_TIME_STAFF, BigDecimal a7_PART_TIME_STAFF,
			BigDecimal a7_KEY_EMPLOYEES, BigDecimal a7_MANAGEMENT, String a8_PRODUCT, String a8_PRODUCT_VALUE_1,
			String a8_PRODUCT_VALUE_2, String a8_PRODUCT_VALUE_3, String a8_PRODUCT_VALUE_4, String a9_PRODUCT,
			String a10_PRODUCT, BigDecimal a10_FULL_TIME_STAFF, BigDecimal a10_PART_TIME_STAFF,
			BigDecimal a10_KEY_EMPLOYEES, BigDecimal a10_MANAGEMENT, String a11_PRODUCT, BigDecimal a11_FULL_TIME_STAFF,
			BigDecimal a11_PART_TIME_STAFF, BigDecimal a11_KEY_EMPLOYEES, BigDecimal a11_MANAGEMENT, String a12_PRODUCT,
			BigDecimal a12_FULL_TIME_STAFF, BigDecimal a12_PART_TIME_STAFF, BigDecimal a12_KEY_EMPLOYEES,
			BigDecimal a12_MANAGEMENT, String a13_PRODUCT, BigDecimal a13_FULL_TIME_STAFF,
			BigDecimal a13_PART_TIME_STAFF, BigDecimal a13_KEY_EMPLOYEES, BigDecimal a13_MANAGEMENT, String a14_PRODUCT,
			BigDecimal a14_FULL_TIME_STAFF, BigDecimal a14_PART_TIME_STAFF, BigDecimal a14_KEY_EMPLOYEES,
			BigDecimal a14_MANAGEMENT, String a15_PRODUCT, BigDecimal a15_FULL_TIME_STAFF,
			BigDecimal a15_PART_TIME_STAFF, BigDecimal a15_KEY_EMPLOYEES, BigDecimal a15_MANAGEMENT, String a16_PRODUCT,
			String a16_PRODUCT_VALUE_1, String a16_PRODUCT_VALUE_2, String a16_PRODUCT_VALUE_3,
			String a16_PRODUCT_VALUE_4, String a17_PRODUCT, String a18_PRODUCT, BigDecimal a18_FULL_TIME_STAFF,
			BigDecimal a18_PART_TIME_STAFF, BigDecimal a18_KEY_EMPLOYEES, BigDecimal a18_MANAGEMENT, String a19_PRODUCT,
			BigDecimal a19_FULL_TIME_STAFF, BigDecimal a19_PART_TIME_STAFF, BigDecimal a19_KEY_EMPLOYEES,
			BigDecimal a19_MANAGEMENT, String a20_PRODUCT, BigDecimal a20_FULL_TIME_STAFF,
			BigDecimal a20_PART_TIME_STAFF, BigDecimal a20_KEY_EMPLOYEES, BigDecimal a20_MANAGEMENT, String a21_PRODUCT,
			BigDecimal a21_FULL_TIME_STAFF, BigDecimal a21_PART_TIME_STAFF, BigDecimal a21_KEY_EMPLOYEES,
			BigDecimal a21_MANAGEMENT, String a22_PRODUCT, BigDecimal a22_FULL_TIME_STAFF,
			BigDecimal a22_PART_TIME_STAFF, BigDecimal a22_KEY_EMPLOYEES, BigDecimal a22_MANAGEMENT, String a23_PRODUCT,
			BigDecimal a23_FULL_TIME_STAFF, BigDecimal a23_PART_TIME_STAFF, BigDecimal a23_KEY_EMPLOYEES,
			BigDecimal a23_MANAGEMENT, String a24_PRODUCT, String a24_PRODUCT_VALUE_1, String a24_PRODUCT_VALUE_2,
			String a24_PRODUCT_VALUE_3, String a24_PRODUCT_VALUE_4, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A2_PRODUCT = a2_PRODUCT;
		A2_FULL_TIME_STAFF = a2_FULL_TIME_STAFF;
		A2_PART_TIME_STAFF = a2_PART_TIME_STAFF;
		A2_KEY_EMPLOYEES = a2_KEY_EMPLOYEES;
		A2_MANAGEMENT = a2_MANAGEMENT;
		A3_PRODUCT = a3_PRODUCT;
		A3_FULL_TIME_STAFF = a3_FULL_TIME_STAFF;
		A3_PART_TIME_STAFF = a3_PART_TIME_STAFF;
		A3_KEY_EMPLOYEES = a3_KEY_EMPLOYEES;
		A3_MANAGEMENT = a3_MANAGEMENT;
		A4_PRODUCT = a4_PRODUCT;
		A4_FULL_TIME_STAFF = a4_FULL_TIME_STAFF;
		A4_PART_TIME_STAFF = a4_PART_TIME_STAFF;
		A4_KEY_EMPLOYEES = a4_KEY_EMPLOYEES;
		A4_MANAGEMENT = a4_MANAGEMENT;
		A5_PRODUCT = a5_PRODUCT;
		A5_FULL_TIME_STAFF = a5_FULL_TIME_STAFF;
		A5_PART_TIME_STAFF = a5_PART_TIME_STAFF;
		A5_KEY_EMPLOYEES = a5_KEY_EMPLOYEES;
		A5_MANAGEMENT = a5_MANAGEMENT;
		A6_PRODUCT = a6_PRODUCT;
		A6_FULL_TIME_STAFF = a6_FULL_TIME_STAFF;
		A6_PART_TIME_STAFF = a6_PART_TIME_STAFF;
		A6_KEY_EMPLOYEES = a6_KEY_EMPLOYEES;
		A6_MANAGEMENT = a6_MANAGEMENT;
		A7_PRODUCT = a7_PRODUCT;
		A7_FULL_TIME_STAFF = a7_FULL_TIME_STAFF;
		A7_PART_TIME_STAFF = a7_PART_TIME_STAFF;
		A7_KEY_EMPLOYEES = a7_KEY_EMPLOYEES;
		A7_MANAGEMENT = a7_MANAGEMENT;
		A8_PRODUCT = a8_PRODUCT;
		A8_PRODUCT_VALUE_1 = a8_PRODUCT_VALUE_1;
		A8_PRODUCT_VALUE_2 = a8_PRODUCT_VALUE_2;
		A8_PRODUCT_VALUE_3 = a8_PRODUCT_VALUE_3;
		A8_PRODUCT_VALUE_4 = a8_PRODUCT_VALUE_4;
		A9_PRODUCT = a9_PRODUCT;
		A10_PRODUCT = a10_PRODUCT;
		A10_FULL_TIME_STAFF = a10_FULL_TIME_STAFF;
		A10_PART_TIME_STAFF = a10_PART_TIME_STAFF;
		A10_KEY_EMPLOYEES = a10_KEY_EMPLOYEES;
		A10_MANAGEMENT = a10_MANAGEMENT;
		A11_PRODUCT = a11_PRODUCT;
		A11_FULL_TIME_STAFF = a11_FULL_TIME_STAFF;
		A11_PART_TIME_STAFF = a11_PART_TIME_STAFF;
		A11_KEY_EMPLOYEES = a11_KEY_EMPLOYEES;
		A11_MANAGEMENT = a11_MANAGEMENT;
		A12_PRODUCT = a12_PRODUCT;
		A12_FULL_TIME_STAFF = a12_FULL_TIME_STAFF;
		A12_PART_TIME_STAFF = a12_PART_TIME_STAFF;
		A12_KEY_EMPLOYEES = a12_KEY_EMPLOYEES;
		A12_MANAGEMENT = a12_MANAGEMENT;
		A13_PRODUCT = a13_PRODUCT;
		A13_FULL_TIME_STAFF = a13_FULL_TIME_STAFF;
		A13_PART_TIME_STAFF = a13_PART_TIME_STAFF;
		A13_KEY_EMPLOYEES = a13_KEY_EMPLOYEES;
		A13_MANAGEMENT = a13_MANAGEMENT;
		A14_PRODUCT = a14_PRODUCT;
		A14_FULL_TIME_STAFF = a14_FULL_TIME_STAFF;
		A14_PART_TIME_STAFF = a14_PART_TIME_STAFF;
		A14_KEY_EMPLOYEES = a14_KEY_EMPLOYEES;
		A14_MANAGEMENT = a14_MANAGEMENT;
		A15_PRODUCT = a15_PRODUCT;
		A15_FULL_TIME_STAFF = a15_FULL_TIME_STAFF;
		A15_PART_TIME_STAFF = a15_PART_TIME_STAFF;
		A15_KEY_EMPLOYEES = a15_KEY_EMPLOYEES;
		A15_MANAGEMENT = a15_MANAGEMENT;
		A16_PRODUCT = a16_PRODUCT;
		A16_PRODUCT_VALUE_1 = a16_PRODUCT_VALUE_1;
		A16_PRODUCT_VALUE_2 = a16_PRODUCT_VALUE_2;
		A16_PRODUCT_VALUE_3 = a16_PRODUCT_VALUE_3;
		A16_PRODUCT_VALUE_4 = a16_PRODUCT_VALUE_4;
		A17_PRODUCT = a17_PRODUCT;
		A18_PRODUCT = a18_PRODUCT;
		A18_FULL_TIME_STAFF = a18_FULL_TIME_STAFF;
		A18_PART_TIME_STAFF = a18_PART_TIME_STAFF;
		A18_KEY_EMPLOYEES = a18_KEY_EMPLOYEES;
		A18_MANAGEMENT = a18_MANAGEMENT;
		A19_PRODUCT = a19_PRODUCT;
		A19_FULL_TIME_STAFF = a19_FULL_TIME_STAFF;
		A19_PART_TIME_STAFF = a19_PART_TIME_STAFF;
		A19_KEY_EMPLOYEES = a19_KEY_EMPLOYEES;
		A19_MANAGEMENT = a19_MANAGEMENT;
		A20_PRODUCT = a20_PRODUCT;
		A20_FULL_TIME_STAFF = a20_FULL_TIME_STAFF;
		A20_PART_TIME_STAFF = a20_PART_TIME_STAFF;
		A20_KEY_EMPLOYEES = a20_KEY_EMPLOYEES;
		A20_MANAGEMENT = a20_MANAGEMENT;
		A21_PRODUCT = a21_PRODUCT;
		A21_FULL_TIME_STAFF = a21_FULL_TIME_STAFF;
		A21_PART_TIME_STAFF = a21_PART_TIME_STAFF;
		A21_KEY_EMPLOYEES = a21_KEY_EMPLOYEES;
		A21_MANAGEMENT = a21_MANAGEMENT;
		A22_PRODUCT = a22_PRODUCT;
		A22_FULL_TIME_STAFF = a22_FULL_TIME_STAFF;
		A22_PART_TIME_STAFF = a22_PART_TIME_STAFF;
		A22_KEY_EMPLOYEES = a22_KEY_EMPLOYEES;
		A22_MANAGEMENT = a22_MANAGEMENT;
		A23_PRODUCT = a23_PRODUCT;
		A23_FULL_TIME_STAFF = a23_FULL_TIME_STAFF;
		A23_PART_TIME_STAFF = a23_PART_TIME_STAFF;
		A23_KEY_EMPLOYEES = a23_KEY_EMPLOYEES;
		A23_MANAGEMENT = a23_MANAGEMENT;
		A24_PRODUCT = a24_PRODUCT;
		A24_PRODUCT_VALUE_1 = a24_PRODUCT_VALUE_1;
		A24_PRODUCT_VALUE_2 = a24_PRODUCT_VALUE_2;
		A24_PRODUCT_VALUE_3 = a24_PRODUCT_VALUE_3;
		A24_PRODUCT_VALUE_4 = a24_PRODUCT_VALUE_4;
		REPORT_CODE = rEPORT_CODE;
		REPORT_NAME = rEPORT_NAME;
		REPORT_DATE = rEPORT_DATE;
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
		REP_PERIOD_TO = rEP_PERIOD_TO;
		REP_FREQ = rEP_FREQ;
		NIL_REPORT_FLG = nIL_REPORT_FLG;
		ARCH_FLG = aRCH_FLG;
		ENTITY_FLG = eNTITY_FLG;
		DEL_FLG = dEL_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
		QTR_FLG = qTR_FLG;
	}
	public T31ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
