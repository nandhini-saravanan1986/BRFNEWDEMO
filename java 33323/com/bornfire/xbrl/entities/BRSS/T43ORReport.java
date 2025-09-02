package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="T43_OR_DETAILS_ITSYSTEM_IN_BANK_TABLE")
public class T43ORReport {
	private String	A1_PRODUCT;
	private String	A1_CRITICAL;
	private String	A1_IMPORTANT;
	private String	A1_OTHERS;
	private String	A2_PRODUCT;
	private String	A2_CRITICAL;
	private String	A2_IMPORTANT;
	private String	A2_OTHERS;
	private String	A3_PRODUCT;
	private String	A3_CRITICAL;
	private String	A3_IMPORTANT;
	private String	A3_OTHERS;
	private String	A4_PRODUCT;
	private String	A4_CRITICAL;
	private String	A4_IMPORTANT;
	private String	A4_OTHERS;
	private String	A5_PRODUCT;
	private String	A5_CRITICAL;
	private String	A5_IMPORTANT;
	private String	A5_OTHERS;
	private String	A6_PRODUCT;
	private String	A6_CRITICAL;
	private String	A6_IMPORTANT;
	private String	A6_OTHERS;
	private String	A7_PRODUCT;
	private String	A7_CRITICAL;
	private String	A7_IMPORTANT;
	private String	A7_OTHERS;
	private String	A8_PRODUCT;
	private String	A8_CRITICAL;
	private String	A8_IMPORTANT;
	private String	A8_OTHERS;
	private String	A9_PRODUCT;
	private String	A9_CRITICAL;
	private String	A9_IMPORTANT;
	private String	A9_OTHERS;
	private String	A10_PRODUCT;
	private String	A10_CRITICAL;
	private String	A10_IMPORTANT;
	private String	A10_OTHERS;
	private String	A11_PRODUCT;
	private String	A11_CRITICAL;
	private String	A11_IMPORTANT;
	private String	A11_OTHERS;
	private String	A12_PRODUCT;
	private String	A12_CRITICAL;
	private String	A12_IMPORTANT;
	private String	A12_OTHERS;
	private String	A13_PRODUCT;
	private String	A13_CRITICAL;
	private String	A13_IMPORTANT;
	private String	A13_OTHERS;
	private String	A14_PRODUCT;
	private String	A14_CRITICAL;
	private String	A14_IMPORTANT;
	private String	A14_OTHERS;
	private String	A15_PRODUCT;
	private String	A15_CRITICAL;
	private String	A15_IMPORTANT;
	private String	A15_OTHERS;
	private String	A16_PRODUCT;
	private String	A16_CRITICAL;
	private String	A16_IMPORTANT;
	private String	A16_OTHERS;
	private String	A17_PRODUCT;
	private String	A17_CRITICAL;
	private String	A17_IMPORTANT;
	private String	A17_OTHERS;
	private String	A18_PRODUCT;
	private String	A18_CRITICAL;
	private String	A18_IMPORTANT;
	private String	A18_OTHERS;
	private String	A19_PRODUCT;
	private String	A19_CRITICAL;
	private String	A19_IMPORTANT;
	private String	A19_OTHERS;
	private String	A20_PRODUCT;
	private String	A20_CRITICAL;
	private String	A20_IMPORTANT;
	private String	A20_OTHERS;
	private String	A21_PRODUCT;
	private String	A21_CRITICAL;
	private String	A21_IMPORTANT;
	private String	A21_OTHERS;
	private String	A22_PRODUCT;
	private String	A22_CRITICAL;
	private String	A22_IMPORTANT;
	private String	A22_OTHERS;
	private String	A23_PRODUCT;
	private String	A23_CRITICAL;
	private String	A23_IMPORTANT;
	private String	A23_OTHERS;
	private String	A24_PRODUCT;
	private String	A24_CRITICAL;
	private String	A24_IMPORTANT;
	private String	A24_OTHERS;
	private String	A25_PRODUCT;
	private String	A25_CRITICAL;
	private String	A25_IMPORTANT;
	private String	A25_OTHERS;
	private String	A26_PRODUCT;
	private String	A26_CRITICAL;
	private String	A26_IMPORTANT;
	private String	A26_OTHERS;
	private String	A27_PRODUCT;
	private String	A27_CRITICAL;
	private String	A27_IMPORTANT;
	private String	A27_OTHERS;
	private String	A28_PRODUCT;
	private String	A28_CRITICAL;
	private String	A28_IMPORTANT;
	private String	A28_OTHERS;
	private String	A29_PRODUCT;
	private String	A29_CRITICAL;
	private String	A29_IMPORTANT;
	private String	A29_OTHERS;
	private String	A30_PRODUCT;
	private String	A30_CRITICAL;
	private String	A30_IMPORTANT;
	private String	A30_OTHERS;
	private String	A31_PRODUCT;
	private String	A31_CRITICAL;
	private String	A31_IMPORTANT;
	private String	A31_OTHERS;
	private String	A32_PRODUCT;
	private String	A32_CRITICAL;
	private String	A32_IMPORTANT;
	private String	A32_OTHERS;
	private String	A33_PRODUCT;
	private String	A33_CRITICAL;
	private String	A33_IMPORTANT;
	private String	A33_OTHERS;
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
	public String getA1_CRITICAL() {
		return A1_CRITICAL;
	}
	public void setA1_CRITICAL(String a1_CRITICAL) {
		A1_CRITICAL = a1_CRITICAL;
	}
	public String getA1_IMPORTANT() {
		return A1_IMPORTANT;
	}
	public void setA1_IMPORTANT(String a1_IMPORTANT) {
		A1_IMPORTANT = a1_IMPORTANT;
	}
	public String getA1_OTHERS() {
		return A1_OTHERS;
	}
	public void setA1_OTHERS(String a1_OTHERS) {
		A1_OTHERS = a1_OTHERS;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA2_CRITICAL() {
		return A2_CRITICAL;
	}
	public void setA2_CRITICAL(String a2_CRITICAL) {
		A2_CRITICAL = a2_CRITICAL;
	}
	public String getA2_IMPORTANT() {
		return A2_IMPORTANT;
	}
	public void setA2_IMPORTANT(String a2_IMPORTANT) {
		A2_IMPORTANT = a2_IMPORTANT;
	}
	public String getA2_OTHERS() {
		return A2_OTHERS;
	}
	public void setA2_OTHERS(String a2_OTHERS) {
		A2_OTHERS = a2_OTHERS;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public String getA3_CRITICAL() {
		return A3_CRITICAL;
	}
	public void setA3_CRITICAL(String a3_CRITICAL) {
		A3_CRITICAL = a3_CRITICAL;
	}
	public String getA3_IMPORTANT() {
		return A3_IMPORTANT;
	}
	public void setA3_IMPORTANT(String a3_IMPORTANT) {
		A3_IMPORTANT = a3_IMPORTANT;
	}
	public String getA3_OTHERS() {
		return A3_OTHERS;
	}
	public void setA3_OTHERS(String a3_OTHERS) {
		A3_OTHERS = a3_OTHERS;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public String getA4_CRITICAL() {
		return A4_CRITICAL;
	}
	public void setA4_CRITICAL(String a4_CRITICAL) {
		A4_CRITICAL = a4_CRITICAL;
	}
	public String getA4_IMPORTANT() {
		return A4_IMPORTANT;
	}
	public void setA4_IMPORTANT(String a4_IMPORTANT) {
		A4_IMPORTANT = a4_IMPORTANT;
	}
	public String getA4_OTHERS() {
		return A4_OTHERS;
	}
	public void setA4_OTHERS(String a4_OTHERS) {
		A4_OTHERS = a4_OTHERS;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public String getA5_CRITICAL() {
		return A5_CRITICAL;
	}
	public void setA5_CRITICAL(String a5_CRITICAL) {
		A5_CRITICAL = a5_CRITICAL;
	}
	public String getA5_IMPORTANT() {
		return A5_IMPORTANT;
	}
	public void setA5_IMPORTANT(String a5_IMPORTANT) {
		A5_IMPORTANT = a5_IMPORTANT;
	}
	public String getA5_OTHERS() {
		return A5_OTHERS;
	}
	public void setA5_OTHERS(String a5_OTHERS) {
		A5_OTHERS = a5_OTHERS;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public String getA6_CRITICAL() {
		return A6_CRITICAL;
	}
	public void setA6_CRITICAL(String a6_CRITICAL) {
		A6_CRITICAL = a6_CRITICAL;
	}
	public String getA6_IMPORTANT() {
		return A6_IMPORTANT;
	}
	public void setA6_IMPORTANT(String a6_IMPORTANT) {
		A6_IMPORTANT = a6_IMPORTANT;
	}
	public String getA6_OTHERS() {
		return A6_OTHERS;
	}
	public void setA6_OTHERS(String a6_OTHERS) {
		A6_OTHERS = a6_OTHERS;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public String getA7_CRITICAL() {
		return A7_CRITICAL;
	}
	public void setA7_CRITICAL(String a7_CRITICAL) {
		A7_CRITICAL = a7_CRITICAL;
	}
	public String getA7_IMPORTANT() {
		return A7_IMPORTANT;
	}
	public void setA7_IMPORTANT(String a7_IMPORTANT) {
		A7_IMPORTANT = a7_IMPORTANT;
	}
	public String getA7_OTHERS() {
		return A7_OTHERS;
	}
	public void setA7_OTHERS(String a7_OTHERS) {
		A7_OTHERS = a7_OTHERS;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public String getA8_CRITICAL() {
		return A8_CRITICAL;
	}
	public void setA8_CRITICAL(String a8_CRITICAL) {
		A8_CRITICAL = a8_CRITICAL;
	}
	public String getA8_IMPORTANT() {
		return A8_IMPORTANT;
	}
	public void setA8_IMPORTANT(String a8_IMPORTANT) {
		A8_IMPORTANT = a8_IMPORTANT;
	}
	public String getA8_OTHERS() {
		return A8_OTHERS;
	}
	public void setA8_OTHERS(String a8_OTHERS) {
		A8_OTHERS = a8_OTHERS;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public String getA9_CRITICAL() {
		return A9_CRITICAL;
	}
	public void setA9_CRITICAL(String a9_CRITICAL) {
		A9_CRITICAL = a9_CRITICAL;
	}
	public String getA9_IMPORTANT() {
		return A9_IMPORTANT;
	}
	public void setA9_IMPORTANT(String a9_IMPORTANT) {
		A9_IMPORTANT = a9_IMPORTANT;
	}
	public String getA9_OTHERS() {
		return A9_OTHERS;
	}
	public void setA9_OTHERS(String a9_OTHERS) {
		A9_OTHERS = a9_OTHERS;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public String getA10_CRITICAL() {
		return A10_CRITICAL;
	}
	public void setA10_CRITICAL(String a10_CRITICAL) {
		A10_CRITICAL = a10_CRITICAL;
	}
	public String getA10_IMPORTANT() {
		return A10_IMPORTANT;
	}
	public void setA10_IMPORTANT(String a10_IMPORTANT) {
		A10_IMPORTANT = a10_IMPORTANT;
	}
	public String getA10_OTHERS() {
		return A10_OTHERS;
	}
	public void setA10_OTHERS(String a10_OTHERS) {
		A10_OTHERS = a10_OTHERS;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public String getA11_CRITICAL() {
		return A11_CRITICAL;
	}
	public void setA11_CRITICAL(String a11_CRITICAL) {
		A11_CRITICAL = a11_CRITICAL;
	}
	public String getA11_IMPORTANT() {
		return A11_IMPORTANT;
	}
	public void setA11_IMPORTANT(String a11_IMPORTANT) {
		A11_IMPORTANT = a11_IMPORTANT;
	}
	public String getA11_OTHERS() {
		return A11_OTHERS;
	}
	public void setA11_OTHERS(String a11_OTHERS) {
		A11_OTHERS = a11_OTHERS;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public String getA12_CRITICAL() {
		return A12_CRITICAL;
	}
	public void setA12_CRITICAL(String a12_CRITICAL) {
		A12_CRITICAL = a12_CRITICAL;
	}
	public String getA12_IMPORTANT() {
		return A12_IMPORTANT;
	}
	public void setA12_IMPORTANT(String a12_IMPORTANT) {
		A12_IMPORTANT = a12_IMPORTANT;
	}
	public String getA12_OTHERS() {
		return A12_OTHERS;
	}
	public void setA12_OTHERS(String a12_OTHERS) {
		A12_OTHERS = a12_OTHERS;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public String getA13_CRITICAL() {
		return A13_CRITICAL;
	}
	public void setA13_CRITICAL(String a13_CRITICAL) {
		A13_CRITICAL = a13_CRITICAL;
	}
	public String getA13_IMPORTANT() {
		return A13_IMPORTANT;
	}
	public void setA13_IMPORTANT(String a13_IMPORTANT) {
		A13_IMPORTANT = a13_IMPORTANT;
	}
	public String getA13_OTHERS() {
		return A13_OTHERS;
	}
	public void setA13_OTHERS(String a13_OTHERS) {
		A13_OTHERS = a13_OTHERS;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public String getA14_CRITICAL() {
		return A14_CRITICAL;
	}
	public void setA14_CRITICAL(String a14_CRITICAL) {
		A14_CRITICAL = a14_CRITICAL;
	}
	public String getA14_IMPORTANT() {
		return A14_IMPORTANT;
	}
	public void setA14_IMPORTANT(String a14_IMPORTANT) {
		A14_IMPORTANT = a14_IMPORTANT;
	}
	public String getA14_OTHERS() {
		return A14_OTHERS;
	}
	public void setA14_OTHERS(String a14_OTHERS) {
		A14_OTHERS = a14_OTHERS;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public String getA15_CRITICAL() {
		return A15_CRITICAL;
	}
	public void setA15_CRITICAL(String a15_CRITICAL) {
		A15_CRITICAL = a15_CRITICAL;
	}
	public String getA15_IMPORTANT() {
		return A15_IMPORTANT;
	}
	public void setA15_IMPORTANT(String a15_IMPORTANT) {
		A15_IMPORTANT = a15_IMPORTANT;
	}
	public String getA15_OTHERS() {
		return A15_OTHERS;
	}
	public void setA15_OTHERS(String a15_OTHERS) {
		A15_OTHERS = a15_OTHERS;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public String getA16_CRITICAL() {
		return A16_CRITICAL;
	}
	public void setA16_CRITICAL(String a16_CRITICAL) {
		A16_CRITICAL = a16_CRITICAL;
	}
	public String getA16_IMPORTANT() {
		return A16_IMPORTANT;
	}
	public void setA16_IMPORTANT(String a16_IMPORTANT) {
		A16_IMPORTANT = a16_IMPORTANT;
	}
	public String getA16_OTHERS() {
		return A16_OTHERS;
	}
	public void setA16_OTHERS(String a16_OTHERS) {
		A16_OTHERS = a16_OTHERS;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public String getA17_CRITICAL() {
		return A17_CRITICAL;
	}
	public void setA17_CRITICAL(String a17_CRITICAL) {
		A17_CRITICAL = a17_CRITICAL;
	}
	public String getA17_IMPORTANT() {
		return A17_IMPORTANT;
	}
	public void setA17_IMPORTANT(String a17_IMPORTANT) {
		A17_IMPORTANT = a17_IMPORTANT;
	}
	public String getA17_OTHERS() {
		return A17_OTHERS;
	}
	public void setA17_OTHERS(String a17_OTHERS) {
		A17_OTHERS = a17_OTHERS;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public String getA18_CRITICAL() {
		return A18_CRITICAL;
	}
	public void setA18_CRITICAL(String a18_CRITICAL) {
		A18_CRITICAL = a18_CRITICAL;
	}
	public String getA18_IMPORTANT() {
		return A18_IMPORTANT;
	}
	public void setA18_IMPORTANT(String a18_IMPORTANT) {
		A18_IMPORTANT = a18_IMPORTANT;
	}
	public String getA18_OTHERS() {
		return A18_OTHERS;
	}
	public void setA18_OTHERS(String a18_OTHERS) {
		A18_OTHERS = a18_OTHERS;
	}
	public String getA19_PRODUCT() {
		return A19_PRODUCT;
	}
	public void setA19_PRODUCT(String a19_PRODUCT) {
		A19_PRODUCT = a19_PRODUCT;
	}
	public String getA19_CRITICAL() {
		return A19_CRITICAL;
	}
	public void setA19_CRITICAL(String a19_CRITICAL) {
		A19_CRITICAL = a19_CRITICAL;
	}
	public String getA19_IMPORTANT() {
		return A19_IMPORTANT;
	}
	public void setA19_IMPORTANT(String a19_IMPORTANT) {
		A19_IMPORTANT = a19_IMPORTANT;
	}
	public String getA19_OTHERS() {
		return A19_OTHERS;
	}
	public void setA19_OTHERS(String a19_OTHERS) {
		A19_OTHERS = a19_OTHERS;
	}
	public String getA20_PRODUCT() {
		return A20_PRODUCT;
	}
	public void setA20_PRODUCT(String a20_PRODUCT) {
		A20_PRODUCT = a20_PRODUCT;
	}
	public String getA20_CRITICAL() {
		return A20_CRITICAL;
	}
	public void setA20_CRITICAL(String a20_CRITICAL) {
		A20_CRITICAL = a20_CRITICAL;
	}
	public String getA20_IMPORTANT() {
		return A20_IMPORTANT;
	}
	public void setA20_IMPORTANT(String a20_IMPORTANT) {
		A20_IMPORTANT = a20_IMPORTANT;
	}
	public String getA20_OTHERS() {
		return A20_OTHERS;
	}
	public void setA20_OTHERS(String a20_OTHERS) {
		A20_OTHERS = a20_OTHERS;
	}
	public String getA21_PRODUCT() {
		return A21_PRODUCT;
	}
	public void setA21_PRODUCT(String a21_PRODUCT) {
		A21_PRODUCT = a21_PRODUCT;
	}
	public String getA21_CRITICAL() {
		return A21_CRITICAL;
	}
	public void setA21_CRITICAL(String a21_CRITICAL) {
		A21_CRITICAL = a21_CRITICAL;
	}
	public String getA21_IMPORTANT() {
		return A21_IMPORTANT;
	}
	public void setA21_IMPORTANT(String a21_IMPORTANT) {
		A21_IMPORTANT = a21_IMPORTANT;
	}
	public String getA21_OTHERS() {
		return A21_OTHERS;
	}
	public void setA21_OTHERS(String a21_OTHERS) {
		A21_OTHERS = a21_OTHERS;
	}
	public String getA22_PRODUCT() {
		return A22_PRODUCT;
	}
	public void setA22_PRODUCT(String a22_PRODUCT) {
		A22_PRODUCT = a22_PRODUCT;
	}
	public String getA22_CRITICAL() {
		return A22_CRITICAL;
	}
	public void setA22_CRITICAL(String a22_CRITICAL) {
		A22_CRITICAL = a22_CRITICAL;
	}
	public String getA22_IMPORTANT() {
		return A22_IMPORTANT;
	}
	public void setA22_IMPORTANT(String a22_IMPORTANT) {
		A22_IMPORTANT = a22_IMPORTANT;
	}
	public String getA22_OTHERS() {
		return A22_OTHERS;
	}
	public void setA22_OTHERS(String a22_OTHERS) {
		A22_OTHERS = a22_OTHERS;
	}
	public String getA23_PRODUCT() {
		return A23_PRODUCT;
	}
	public void setA23_PRODUCT(String a23_PRODUCT) {
		A23_PRODUCT = a23_PRODUCT;
	}
	public String getA23_CRITICAL() {
		return A23_CRITICAL;
	}
	public void setA23_CRITICAL(String a23_CRITICAL) {
		A23_CRITICAL = a23_CRITICAL;
	}
	public String getA23_IMPORTANT() {
		return A23_IMPORTANT;
	}
	public void setA23_IMPORTANT(String a23_IMPORTANT) {
		A23_IMPORTANT = a23_IMPORTANT;
	}
	public String getA23_OTHERS() {
		return A23_OTHERS;
	}
	public void setA23_OTHERS(String a23_OTHERS) {
		A23_OTHERS = a23_OTHERS;
	}
	public String getA24_PRODUCT() {
		return A24_PRODUCT;
	}
	public void setA24_PRODUCT(String a24_PRODUCT) {
		A24_PRODUCT = a24_PRODUCT;
	}
	public String getA24_CRITICAL() {
		return A24_CRITICAL;
	}
	public void setA24_CRITICAL(String a24_CRITICAL) {
		A24_CRITICAL = a24_CRITICAL;
	}
	public String getA24_IMPORTANT() {
		return A24_IMPORTANT;
	}
	public void setA24_IMPORTANT(String a24_IMPORTANT) {
		A24_IMPORTANT = a24_IMPORTANT;
	}
	public String getA24_OTHERS() {
		return A24_OTHERS;
	}
	public void setA24_OTHERS(String a24_OTHERS) {
		A24_OTHERS = a24_OTHERS;
	}
	public String getA25_PRODUCT() {
		return A25_PRODUCT;
	}
	public void setA25_PRODUCT(String a25_PRODUCT) {
		A25_PRODUCT = a25_PRODUCT;
	}
	public String getA25_CRITICAL() {
		return A25_CRITICAL;
	}
	public void setA25_CRITICAL(String a25_CRITICAL) {
		A25_CRITICAL = a25_CRITICAL;
	}
	public String getA25_IMPORTANT() {
		return A25_IMPORTANT;
	}
	public void setA25_IMPORTANT(String a25_IMPORTANT) {
		A25_IMPORTANT = a25_IMPORTANT;
	}
	public String getA25_OTHERS() {
		return A25_OTHERS;
	}
	public void setA25_OTHERS(String a25_OTHERS) {
		A25_OTHERS = a25_OTHERS;
	}
	public String getA26_PRODUCT() {
		return A26_PRODUCT;
	}
	public void setA26_PRODUCT(String a26_PRODUCT) {
		A26_PRODUCT = a26_PRODUCT;
	}
	public String getA26_CRITICAL() {
		return A26_CRITICAL;
	}
	public void setA26_CRITICAL(String a26_CRITICAL) {
		A26_CRITICAL = a26_CRITICAL;
	}
	public String getA26_IMPORTANT() {
		return A26_IMPORTANT;
	}
	public void setA26_IMPORTANT(String a26_IMPORTANT) {
		A26_IMPORTANT = a26_IMPORTANT;
	}
	public String getA26_OTHERS() {
		return A26_OTHERS;
	}
	public void setA26_OTHERS(String a26_OTHERS) {
		A26_OTHERS = a26_OTHERS;
	}
	public String getA27_PRODUCT() {
		return A27_PRODUCT;
	}
	public void setA27_PRODUCT(String a27_PRODUCT) {
		A27_PRODUCT = a27_PRODUCT;
	}
	public String getA27_CRITICAL() {
		return A27_CRITICAL;
	}
	public void setA27_CRITICAL(String a27_CRITICAL) {
		A27_CRITICAL = a27_CRITICAL;
	}
	public String getA27_IMPORTANT() {
		return A27_IMPORTANT;
	}
	public void setA27_IMPORTANT(String a27_IMPORTANT) {
		A27_IMPORTANT = a27_IMPORTANT;
	}
	public String getA27_OTHERS() {
		return A27_OTHERS;
	}
	public void setA27_OTHERS(String a27_OTHERS) {
		A27_OTHERS = a27_OTHERS;
	}
	public String getA28_PRODUCT() {
		return A28_PRODUCT;
	}
	public void setA28_PRODUCT(String a28_PRODUCT) {
		A28_PRODUCT = a28_PRODUCT;
	}
	public String getA28_CRITICAL() {
		return A28_CRITICAL;
	}
	public void setA28_CRITICAL(String a28_CRITICAL) {
		A28_CRITICAL = a28_CRITICAL;
	}
	public String getA28_IMPORTANT() {
		return A28_IMPORTANT;
	}
	public void setA28_IMPORTANT(String a28_IMPORTANT) {
		A28_IMPORTANT = a28_IMPORTANT;
	}
	public String getA28_OTHERS() {
		return A28_OTHERS;
	}
	public void setA28_OTHERS(String a28_OTHERS) {
		A28_OTHERS = a28_OTHERS;
	}
	public String getA29_PRODUCT() {
		return A29_PRODUCT;
	}
	public void setA29_PRODUCT(String a29_PRODUCT) {
		A29_PRODUCT = a29_PRODUCT;
	}
	public String getA29_CRITICAL() {
		return A29_CRITICAL;
	}
	public void setA29_CRITICAL(String a29_CRITICAL) {
		A29_CRITICAL = a29_CRITICAL;
	}
	public String getA29_IMPORTANT() {
		return A29_IMPORTANT;
	}
	public void setA29_IMPORTANT(String a29_IMPORTANT) {
		A29_IMPORTANT = a29_IMPORTANT;
	}
	public String getA29_OTHERS() {
		return A29_OTHERS;
	}
	public void setA29_OTHERS(String a29_OTHERS) {
		A29_OTHERS = a29_OTHERS;
	}
	public String getA30_PRODUCT() {
		return A30_PRODUCT;
	}
	public void setA30_PRODUCT(String a30_PRODUCT) {
		A30_PRODUCT = a30_PRODUCT;
	}
	public String getA30_CRITICAL() {
		return A30_CRITICAL;
	}
	public void setA30_CRITICAL(String a30_CRITICAL) {
		A30_CRITICAL = a30_CRITICAL;
	}
	public String getA30_IMPORTANT() {
		return A30_IMPORTANT;
	}
	public void setA30_IMPORTANT(String a30_IMPORTANT) {
		A30_IMPORTANT = a30_IMPORTANT;
	}
	public String getA30_OTHERS() {
		return A30_OTHERS;
	}
	public void setA30_OTHERS(String a30_OTHERS) {
		A30_OTHERS = a30_OTHERS;
	}
	public String getA31_PRODUCT() {
		return A31_PRODUCT;
	}
	public void setA31_PRODUCT(String a31_PRODUCT) {
		A31_PRODUCT = a31_PRODUCT;
	}
	public String getA31_CRITICAL() {
		return A31_CRITICAL;
	}
	public void setA31_CRITICAL(String a31_CRITICAL) {
		A31_CRITICAL = a31_CRITICAL;
	}
	public String getA31_IMPORTANT() {
		return A31_IMPORTANT;
	}
	public void setA31_IMPORTANT(String a31_IMPORTANT) {
		A31_IMPORTANT = a31_IMPORTANT;
	}
	public String getA31_OTHERS() {
		return A31_OTHERS;
	}
	public void setA31_OTHERS(String a31_OTHERS) {
		A31_OTHERS = a31_OTHERS;
	}
	public String getA32_PRODUCT() {
		return A32_PRODUCT;
	}
	public void setA32_PRODUCT(String a32_PRODUCT) {
		A32_PRODUCT = a32_PRODUCT;
	}
	public String getA32_CRITICAL() {
		return A32_CRITICAL;
	}
	public void setA32_CRITICAL(String a32_CRITICAL) {
		A32_CRITICAL = a32_CRITICAL;
	}
	public String getA32_IMPORTANT() {
		return A32_IMPORTANT;
	}
	public void setA32_IMPORTANT(String a32_IMPORTANT) {
		A32_IMPORTANT = a32_IMPORTANT;
	}
	public String getA32_OTHERS() {
		return A32_OTHERS;
	}
	public void setA32_OTHERS(String a32_OTHERS) {
		A32_OTHERS = a32_OTHERS;
	}
	public String getA33_PRODUCT() {
		return A33_PRODUCT;
	}
	public void setA33_PRODUCT(String a33_PRODUCT) {
		A33_PRODUCT = a33_PRODUCT;
	}
	public String getA33_CRITICAL() {
		return A33_CRITICAL;
	}
	public void setA33_CRITICAL(String a33_CRITICAL) {
		A33_CRITICAL = a33_CRITICAL;
	}
	public String getA33_IMPORTANT() {
		return A33_IMPORTANT;
	}
	public void setA33_IMPORTANT(String a33_IMPORTANT) {
		A33_IMPORTANT = a33_IMPORTANT;
	}
	public String getA33_OTHERS() {
		return A33_OTHERS;
	}
	public void setA33_OTHERS(String a33_OTHERS) {
		A33_OTHERS = a33_OTHERS;
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
	public T43ORReport(String a1_PRODUCT, String a1_CRITICAL, String a1_IMPORTANT, String a1_OTHERS, String a2_PRODUCT,
			String a2_CRITICAL, String a2_IMPORTANT, String a2_OTHERS, String a3_PRODUCT, String a3_CRITICAL,
			String a3_IMPORTANT, String a3_OTHERS, String a4_PRODUCT, String a4_CRITICAL, String a4_IMPORTANT,
			String a4_OTHERS, String a5_PRODUCT, String a5_CRITICAL, String a5_IMPORTANT, String a5_OTHERS,
			String a6_PRODUCT, String a6_CRITICAL, String a6_IMPORTANT, String a6_OTHERS, String a7_PRODUCT,
			String a7_CRITICAL, String a7_IMPORTANT, String a7_OTHERS, String a8_PRODUCT, String a8_CRITICAL,
			String a8_IMPORTANT, String a8_OTHERS, String a9_PRODUCT, String a9_CRITICAL, String a9_IMPORTANT,
			String a9_OTHERS, String a10_PRODUCT, String a10_CRITICAL, String a10_IMPORTANT, String a10_OTHERS,
			String a11_PRODUCT, String a11_CRITICAL, String a11_IMPORTANT, String a11_OTHERS, String a12_PRODUCT,
			String a12_CRITICAL, String a12_IMPORTANT, String a12_OTHERS, String a13_PRODUCT, String a13_CRITICAL,
			String a13_IMPORTANT, String a13_OTHERS, String a14_PRODUCT, String a14_CRITICAL, String a14_IMPORTANT,
			String a14_OTHERS, String a15_PRODUCT, String a15_CRITICAL, String a15_IMPORTANT, String a15_OTHERS,
			String a16_PRODUCT, String a16_CRITICAL, String a16_IMPORTANT, String a16_OTHERS, String a17_PRODUCT,
			String a17_CRITICAL, String a17_IMPORTANT, String a17_OTHERS, String a18_PRODUCT, String a18_CRITICAL,
			String a18_IMPORTANT, String a18_OTHERS, String a19_PRODUCT, String a19_CRITICAL, String a19_IMPORTANT,
			String a19_OTHERS, String a20_PRODUCT, String a20_CRITICAL, String a20_IMPORTANT, String a20_OTHERS,
			String a21_PRODUCT, String a21_CRITICAL, String a21_IMPORTANT, String a21_OTHERS, String a22_PRODUCT,
			String a22_CRITICAL, String a22_IMPORTANT, String a22_OTHERS, String a23_PRODUCT, String a23_CRITICAL,
			String a23_IMPORTANT, String a23_OTHERS, String a24_PRODUCT, String a24_CRITICAL, String a24_IMPORTANT,
			String a24_OTHERS, String a25_PRODUCT, String a25_CRITICAL, String a25_IMPORTANT, String a25_OTHERS,
			String a26_PRODUCT, String a26_CRITICAL, String a26_IMPORTANT, String a26_OTHERS, String a27_PRODUCT,
			String a27_CRITICAL, String a27_IMPORTANT, String a27_OTHERS, String a28_PRODUCT, String a28_CRITICAL,
			String a28_IMPORTANT, String a28_OTHERS, String a29_PRODUCT, String a29_CRITICAL, String a29_IMPORTANT,
			String a29_OTHERS, String a30_PRODUCT, String a30_CRITICAL, String a30_IMPORTANT, String a30_OTHERS,
			String a31_PRODUCT, String a31_CRITICAL, String a31_IMPORTANT, String a31_OTHERS, String a32_PRODUCT,
			String a32_CRITICAL, String a32_IMPORTANT, String a32_OTHERS, String a33_PRODUCT, String a33_CRITICAL,
			String a33_IMPORTANT, String a33_OTHERS, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_CRITICAL = a1_CRITICAL;
		A1_IMPORTANT = a1_IMPORTANT;
		A1_OTHERS = a1_OTHERS;
		A2_PRODUCT = a2_PRODUCT;
		A2_CRITICAL = a2_CRITICAL;
		A2_IMPORTANT = a2_IMPORTANT;
		A2_OTHERS = a2_OTHERS;
		A3_PRODUCT = a3_PRODUCT;
		A3_CRITICAL = a3_CRITICAL;
		A3_IMPORTANT = a3_IMPORTANT;
		A3_OTHERS = a3_OTHERS;
		A4_PRODUCT = a4_PRODUCT;
		A4_CRITICAL = a4_CRITICAL;
		A4_IMPORTANT = a4_IMPORTANT;
		A4_OTHERS = a4_OTHERS;
		A5_PRODUCT = a5_PRODUCT;
		A5_CRITICAL = a5_CRITICAL;
		A5_IMPORTANT = a5_IMPORTANT;
		A5_OTHERS = a5_OTHERS;
		A6_PRODUCT = a6_PRODUCT;
		A6_CRITICAL = a6_CRITICAL;
		A6_IMPORTANT = a6_IMPORTANT;
		A6_OTHERS = a6_OTHERS;
		A7_PRODUCT = a7_PRODUCT;
		A7_CRITICAL = a7_CRITICAL;
		A7_IMPORTANT = a7_IMPORTANT;
		A7_OTHERS = a7_OTHERS;
		A8_PRODUCT = a8_PRODUCT;
		A8_CRITICAL = a8_CRITICAL;
		A8_IMPORTANT = a8_IMPORTANT;
		A8_OTHERS = a8_OTHERS;
		A9_PRODUCT = a9_PRODUCT;
		A9_CRITICAL = a9_CRITICAL;
		A9_IMPORTANT = a9_IMPORTANT;
		A9_OTHERS = a9_OTHERS;
		A10_PRODUCT = a10_PRODUCT;
		A10_CRITICAL = a10_CRITICAL;
		A10_IMPORTANT = a10_IMPORTANT;
		A10_OTHERS = a10_OTHERS;
		A11_PRODUCT = a11_PRODUCT;
		A11_CRITICAL = a11_CRITICAL;
		A11_IMPORTANT = a11_IMPORTANT;
		A11_OTHERS = a11_OTHERS;
		A12_PRODUCT = a12_PRODUCT;
		A12_CRITICAL = a12_CRITICAL;
		A12_IMPORTANT = a12_IMPORTANT;
		A12_OTHERS = a12_OTHERS;
		A13_PRODUCT = a13_PRODUCT;
		A13_CRITICAL = a13_CRITICAL;
		A13_IMPORTANT = a13_IMPORTANT;
		A13_OTHERS = a13_OTHERS;
		A14_PRODUCT = a14_PRODUCT;
		A14_CRITICAL = a14_CRITICAL;
		A14_IMPORTANT = a14_IMPORTANT;
		A14_OTHERS = a14_OTHERS;
		A15_PRODUCT = a15_PRODUCT;
		A15_CRITICAL = a15_CRITICAL;
		A15_IMPORTANT = a15_IMPORTANT;
		A15_OTHERS = a15_OTHERS;
		A16_PRODUCT = a16_PRODUCT;
		A16_CRITICAL = a16_CRITICAL;
		A16_IMPORTANT = a16_IMPORTANT;
		A16_OTHERS = a16_OTHERS;
		A17_PRODUCT = a17_PRODUCT;
		A17_CRITICAL = a17_CRITICAL;
		A17_IMPORTANT = a17_IMPORTANT;
		A17_OTHERS = a17_OTHERS;
		A18_PRODUCT = a18_PRODUCT;
		A18_CRITICAL = a18_CRITICAL;
		A18_IMPORTANT = a18_IMPORTANT;
		A18_OTHERS = a18_OTHERS;
		A19_PRODUCT = a19_PRODUCT;
		A19_CRITICAL = a19_CRITICAL;
		A19_IMPORTANT = a19_IMPORTANT;
		A19_OTHERS = a19_OTHERS;
		A20_PRODUCT = a20_PRODUCT;
		A20_CRITICAL = a20_CRITICAL;
		A20_IMPORTANT = a20_IMPORTANT;
		A20_OTHERS = a20_OTHERS;
		A21_PRODUCT = a21_PRODUCT;
		A21_CRITICAL = a21_CRITICAL;
		A21_IMPORTANT = a21_IMPORTANT;
		A21_OTHERS = a21_OTHERS;
		A22_PRODUCT = a22_PRODUCT;
		A22_CRITICAL = a22_CRITICAL;
		A22_IMPORTANT = a22_IMPORTANT;
		A22_OTHERS = a22_OTHERS;
		A23_PRODUCT = a23_PRODUCT;
		A23_CRITICAL = a23_CRITICAL;
		A23_IMPORTANT = a23_IMPORTANT;
		A23_OTHERS = a23_OTHERS;
		A24_PRODUCT = a24_PRODUCT;
		A24_CRITICAL = a24_CRITICAL;
		A24_IMPORTANT = a24_IMPORTANT;
		A24_OTHERS = a24_OTHERS;
		A25_PRODUCT = a25_PRODUCT;
		A25_CRITICAL = a25_CRITICAL;
		A25_IMPORTANT = a25_IMPORTANT;
		A25_OTHERS = a25_OTHERS;
		A26_PRODUCT = a26_PRODUCT;
		A26_CRITICAL = a26_CRITICAL;
		A26_IMPORTANT = a26_IMPORTANT;
		A26_OTHERS = a26_OTHERS;
		A27_PRODUCT = a27_PRODUCT;
		A27_CRITICAL = a27_CRITICAL;
		A27_IMPORTANT = a27_IMPORTANT;
		A27_OTHERS = a27_OTHERS;
		A28_PRODUCT = a28_PRODUCT;
		A28_CRITICAL = a28_CRITICAL;
		A28_IMPORTANT = a28_IMPORTANT;
		A28_OTHERS = a28_OTHERS;
		A29_PRODUCT = a29_PRODUCT;
		A29_CRITICAL = a29_CRITICAL;
		A29_IMPORTANT = a29_IMPORTANT;
		A29_OTHERS = a29_OTHERS;
		A30_PRODUCT = a30_PRODUCT;
		A30_CRITICAL = a30_CRITICAL;
		A30_IMPORTANT = a30_IMPORTANT;
		A30_OTHERS = a30_OTHERS;
		A31_PRODUCT = a31_PRODUCT;
		A31_CRITICAL = a31_CRITICAL;
		A31_IMPORTANT = a31_IMPORTANT;
		A31_OTHERS = a31_OTHERS;
		A32_PRODUCT = a32_PRODUCT;
		A32_CRITICAL = a32_CRITICAL;
		A32_IMPORTANT = a32_IMPORTANT;
		A32_OTHERS = a32_OTHERS;
		A33_PRODUCT = a33_PRODUCT;
		A33_CRITICAL = a33_CRITICAL;
		A33_IMPORTANT = a33_IMPORTANT;
		A33_OTHERS = a33_OTHERS;
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
	public T43ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
