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
@Table(name="T1D_OR_STAFF_SKILL_EXPERTISE_TABLE")
public class T1DORReport {
	private String	A1_PRODUCT;
	private String	A2_PRODUCT;
	private BigDecimal	A2_KEY_NON_MAG;
	private BigDecimal	A2_OTH_NON_MAG;
	private BigDecimal	A2_TOTAL_NON_MAG;
	private BigDecimal	A2_KEY_MAG;
	private BigDecimal	A2_OTH_MAG;
	private BigDecimal	A2_TOTAL_MAG;
	private BigDecimal	A2_TOTAL_ALL;
	private String	A3_PRODUCT;
	private BigDecimal	A3_KEY_NON_MAG;
	private BigDecimal	A3_OTH_NON_MAG;
	private BigDecimal	A3_TOTAL_NON_MAG;
	private BigDecimal	A3_KEY_MAG;
	private BigDecimal	A3_OTH_MAG;
	private BigDecimal	A3_TOTAL_MAG;
	private BigDecimal	A3_TOTAL_ALL;
	private String	A4_PRODUCT;
	private String	A5_PRODUCT;
	private BigDecimal	A5_KEY_NON_MAG;
	private BigDecimal	A5_OTH_NON_MAG;
	private BigDecimal	A5_TOTAL_NON_MAG;
	private BigDecimal	A5_KEY_MAG;
	private BigDecimal	A5_OTH_MAG;
	private BigDecimal	A5_TOTAL_MAG;
	private BigDecimal	A5_TOTAL_ALL;
	private String	A6_PRODUCT;
	private BigDecimal	A6_KEY_NON_MAG;
	private BigDecimal	A6_OTH_NON_MAG;
	private BigDecimal	A6_TOTAL_NON_MAG;
	private BigDecimal	A6_KEY_MAG;
	private BigDecimal	A6_OTH_MAG;
	private BigDecimal	A6_TOTAL_MAG;
	private BigDecimal	A6_TOTAL_ALL;
	private String	A7_PRODUCT;
	private String	A8_PRODUCT;
	private BigDecimal	A8_KEY_NON_MAG;
	private BigDecimal	A8_OTH_NON_MAG;
	private BigDecimal	A8_TOTAL_NON_MAG;
	private BigDecimal	A8_KEY_MAG;
	private BigDecimal	A8_OTH_MAG;
	private BigDecimal	A8_TOTAL_MAG;
	private BigDecimal	A8_TOTAL_ALL;
	private String	A9_PRODUCT;
	private BigDecimal	A9_KEY_NON_MAG;
	private BigDecimal	A9_OTH_NON_MAG;
	private BigDecimal	A9_TOTAL_NON_MAG;
	private BigDecimal	A9_KEY_MAG;
	private BigDecimal	A9_OTH_MAG;
	private BigDecimal	A9_TOTAL_MAG;
	private BigDecimal	A9_TOTAL_ALL;
	private String	A10_PRODUCT;
	private String	A11_PRODUCT;
	private BigDecimal	A11_KEY_NON_MAG;
	private BigDecimal	A11_OTH_NON_MAG;
	private BigDecimal	A11_TOTAL_NON_MAG;
	private BigDecimal	A11_KEY_MAG;
	private BigDecimal	A11_OTH_MAG;
	private BigDecimal	A11_TOTAL_MAG;
	private BigDecimal	A11_TOTAL_ALL;
	private String	A12_PRODUCT;
	private BigDecimal	A12_KEY_NON_MAG;
	private BigDecimal	A12_OTH_NON_MAG;
	private BigDecimal	A12_TOTAL_NON_MAG;
	private BigDecimal	A12_KEY_MAG;
	private BigDecimal	A12_OTH_MAG;
	private BigDecimal	A12_TOTAL_MAG;
	private BigDecimal	A12_TOTAL_ALL;
	private String	A13_PRODUCT;
	private String	A14_PRODUCT;
	private BigDecimal	A14_KEY_NON_MAG;
	private BigDecimal	A14_OTH_NON_MAG;
	private BigDecimal	A14_TOTAL_NON_MAG;
	private BigDecimal	A14_KEY_MAG;
	private BigDecimal	A14_OTH_MAG;
	private BigDecimal	A14_TOTAL_MAG;
	private BigDecimal	A14_TOTAL_ALL;
	private String	A15_PRODUCT;
	private BigDecimal	A15_KEY_NON_MAG;
	private BigDecimal	A15_OTH_NON_MAG;
	private BigDecimal	A15_TOTAL_NON_MAG;
	private BigDecimal	A15_KEY_MAG;
	private BigDecimal	A15_OTH_MAG;
	private BigDecimal	A15_TOTAL_MAG;
	private BigDecimal	A15_TOTAL_ALL;
	private String	A16_PRODUCT;
	private String	A17_PRODUCT;
	private BigDecimal	A17_KEY_NON_MAG;
	private BigDecimal	A17_OTH_NON_MAG;
	private BigDecimal	A17_TOTAL_NON_MAG;
	private BigDecimal	A17_KEY_MAG;
	private BigDecimal	A17_OTH_MAG;
	private BigDecimal	A17_TOTAL_MAG;
	private BigDecimal	A17_TOTAL_ALL;
	private String	A18_PRODUCT;
	private BigDecimal	A18_KEY_NON_MAG;
	private BigDecimal	A18_OTH_NON_MAG;
	private BigDecimal	A18_TOTAL_NON_MAG;
	private BigDecimal	A18_KEY_MAG;
	private BigDecimal	A18_OTH_MAG;
	private BigDecimal	A18_TOTAL_MAG;
	private BigDecimal	A18_TOTAL_ALL;
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
	public BigDecimal getA2_KEY_NON_MAG() {
		return A2_KEY_NON_MAG;
	}
	public void setA2_KEY_NON_MAG(BigDecimal a2_KEY_NON_MAG) {
		A2_KEY_NON_MAG = a2_KEY_NON_MAG;
	}
	public BigDecimal getA2_OTH_NON_MAG() {
		return A2_OTH_NON_MAG;
	}
	public void setA2_OTH_NON_MAG(BigDecimal a2_OTH_NON_MAG) {
		A2_OTH_NON_MAG = a2_OTH_NON_MAG;
	}
	public BigDecimal getA2_TOTAL_NON_MAG() {
		return A2_TOTAL_NON_MAG;
	}
	public void setA2_TOTAL_NON_MAG(BigDecimal a2_TOTAL_NON_MAG) {
		A2_TOTAL_NON_MAG = a2_TOTAL_NON_MAG;
	}
	public BigDecimal getA2_KEY_MAG() {
		return A2_KEY_MAG;
	}
	public void setA2_KEY_MAG(BigDecimal a2_KEY_MAG) {
		A2_KEY_MAG = a2_KEY_MAG;
	}
	public BigDecimal getA2_OTH_MAG() {
		return A2_OTH_MAG;
	}
	public void setA2_OTH_MAG(BigDecimal a2_OTH_MAG) {
		A2_OTH_MAG = a2_OTH_MAG;
	}
	public BigDecimal getA2_TOTAL_MAG() {
		return A2_TOTAL_MAG;
	}
	public void setA2_TOTAL_MAG(BigDecimal a2_TOTAL_MAG) {
		A2_TOTAL_MAG = a2_TOTAL_MAG;
	}
	public BigDecimal getA2_TOTAL_ALL() {
		return A2_TOTAL_ALL;
	}
	public void setA2_TOTAL_ALL(BigDecimal a2_TOTAL_ALL) {
		A2_TOTAL_ALL = a2_TOTAL_ALL;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_KEY_NON_MAG() {
		return A3_KEY_NON_MAG;
	}
	public void setA3_KEY_NON_MAG(BigDecimal a3_KEY_NON_MAG) {
		A3_KEY_NON_MAG = a3_KEY_NON_MAG;
	}
	public BigDecimal getA3_OTH_NON_MAG() {
		return A3_OTH_NON_MAG;
	}
	public void setA3_OTH_NON_MAG(BigDecimal a3_OTH_NON_MAG) {
		A3_OTH_NON_MAG = a3_OTH_NON_MAG;
	}
	public BigDecimal getA3_TOTAL_NON_MAG() {
		return A3_TOTAL_NON_MAG;
	}
	public void setA3_TOTAL_NON_MAG(BigDecimal a3_TOTAL_NON_MAG) {
		A3_TOTAL_NON_MAG = a3_TOTAL_NON_MAG;
	}
	public BigDecimal getA3_KEY_MAG() {
		return A3_KEY_MAG;
	}
	public void setA3_KEY_MAG(BigDecimal a3_KEY_MAG) {
		A3_KEY_MAG = a3_KEY_MAG;
	}
	public BigDecimal getA3_OTH_MAG() {
		return A3_OTH_MAG;
	}
	public void setA3_OTH_MAG(BigDecimal a3_OTH_MAG) {
		A3_OTH_MAG = a3_OTH_MAG;
	}
	public BigDecimal getA3_TOTAL_MAG() {
		return A3_TOTAL_MAG;
	}
	public void setA3_TOTAL_MAG(BigDecimal a3_TOTAL_MAG) {
		A3_TOTAL_MAG = a3_TOTAL_MAG;
	}
	public BigDecimal getA3_TOTAL_ALL() {
		return A3_TOTAL_ALL;
	}
	public void setA3_TOTAL_ALL(BigDecimal a3_TOTAL_ALL) {
		A3_TOTAL_ALL = a3_TOTAL_ALL;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_KEY_NON_MAG() {
		return A5_KEY_NON_MAG;
	}
	public void setA5_KEY_NON_MAG(BigDecimal a5_KEY_NON_MAG) {
		A5_KEY_NON_MAG = a5_KEY_NON_MAG;
	}
	public BigDecimal getA5_OTH_NON_MAG() {
		return A5_OTH_NON_MAG;
	}
	public void setA5_OTH_NON_MAG(BigDecimal a5_OTH_NON_MAG) {
		A5_OTH_NON_MAG = a5_OTH_NON_MAG;
	}
	public BigDecimal getA5_TOTAL_NON_MAG() {
		return A5_TOTAL_NON_MAG;
	}
	public void setA5_TOTAL_NON_MAG(BigDecimal a5_TOTAL_NON_MAG) {
		A5_TOTAL_NON_MAG = a5_TOTAL_NON_MAG;
	}
	public BigDecimal getA5_KEY_MAG() {
		return A5_KEY_MAG;
	}
	public void setA5_KEY_MAG(BigDecimal a5_KEY_MAG) {
		A5_KEY_MAG = a5_KEY_MAG;
	}
	public BigDecimal getA5_OTH_MAG() {
		return A5_OTH_MAG;
	}
	public void setA5_OTH_MAG(BigDecimal a5_OTH_MAG) {
		A5_OTH_MAG = a5_OTH_MAG;
	}
	public BigDecimal getA5_TOTAL_MAG() {
		return A5_TOTAL_MAG;
	}
	public void setA5_TOTAL_MAG(BigDecimal a5_TOTAL_MAG) {
		A5_TOTAL_MAG = a5_TOTAL_MAG;
	}
	public BigDecimal getA5_TOTAL_ALL() {
		return A5_TOTAL_ALL;
	}
	public void setA5_TOTAL_ALL(BigDecimal a5_TOTAL_ALL) {
		A5_TOTAL_ALL = a5_TOTAL_ALL;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_KEY_NON_MAG() {
		return A6_KEY_NON_MAG;
	}
	public void setA6_KEY_NON_MAG(BigDecimal a6_KEY_NON_MAG) {
		A6_KEY_NON_MAG = a6_KEY_NON_MAG;
	}
	public BigDecimal getA6_OTH_NON_MAG() {
		return A6_OTH_NON_MAG;
	}
	public void setA6_OTH_NON_MAG(BigDecimal a6_OTH_NON_MAG) {
		A6_OTH_NON_MAG = a6_OTH_NON_MAG;
	}
	public BigDecimal getA6_TOTAL_NON_MAG() {
		return A6_TOTAL_NON_MAG;
	}
	public void setA6_TOTAL_NON_MAG(BigDecimal a6_TOTAL_NON_MAG) {
		A6_TOTAL_NON_MAG = a6_TOTAL_NON_MAG;
	}
	public BigDecimal getA6_KEY_MAG() {
		return A6_KEY_MAG;
	}
	public void setA6_KEY_MAG(BigDecimal a6_KEY_MAG) {
		A6_KEY_MAG = a6_KEY_MAG;
	}
	public BigDecimal getA6_OTH_MAG() {
		return A6_OTH_MAG;
	}
	public void setA6_OTH_MAG(BigDecimal a6_OTH_MAG) {
		A6_OTH_MAG = a6_OTH_MAG;
	}
	public BigDecimal getA6_TOTAL_MAG() {
		return A6_TOTAL_MAG;
	}
	public void setA6_TOTAL_MAG(BigDecimal a6_TOTAL_MAG) {
		A6_TOTAL_MAG = a6_TOTAL_MAG;
	}
	public BigDecimal getA6_TOTAL_ALL() {
		return A6_TOTAL_ALL;
	}
	public void setA6_TOTAL_ALL(BigDecimal a6_TOTAL_ALL) {
		A6_TOTAL_ALL = a6_TOTAL_ALL;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_KEY_NON_MAG() {
		return A8_KEY_NON_MAG;
	}
	public void setA8_KEY_NON_MAG(BigDecimal a8_KEY_NON_MAG) {
		A8_KEY_NON_MAG = a8_KEY_NON_MAG;
	}
	public BigDecimal getA8_OTH_NON_MAG() {
		return A8_OTH_NON_MAG;
	}
	public void setA8_OTH_NON_MAG(BigDecimal a8_OTH_NON_MAG) {
		A8_OTH_NON_MAG = a8_OTH_NON_MAG;
	}
	public BigDecimal getA8_TOTAL_NON_MAG() {
		return A8_TOTAL_NON_MAG;
	}
	public void setA8_TOTAL_NON_MAG(BigDecimal a8_TOTAL_NON_MAG) {
		A8_TOTAL_NON_MAG = a8_TOTAL_NON_MAG;
	}
	public BigDecimal getA8_KEY_MAG() {
		return A8_KEY_MAG;
	}
	public void setA8_KEY_MAG(BigDecimal a8_KEY_MAG) {
		A8_KEY_MAG = a8_KEY_MAG;
	}
	public BigDecimal getA8_OTH_MAG() {
		return A8_OTH_MAG;
	}
	public void setA8_OTH_MAG(BigDecimal a8_OTH_MAG) {
		A8_OTH_MAG = a8_OTH_MAG;
	}
	public BigDecimal getA8_TOTAL_MAG() {
		return A8_TOTAL_MAG;
	}
	public void setA8_TOTAL_MAG(BigDecimal a8_TOTAL_MAG) {
		A8_TOTAL_MAG = a8_TOTAL_MAG;
	}
	public BigDecimal getA8_TOTAL_ALL() {
		return A8_TOTAL_ALL;
	}
	public void setA8_TOTAL_ALL(BigDecimal a8_TOTAL_ALL) {
		A8_TOTAL_ALL = a8_TOTAL_ALL;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_KEY_NON_MAG() {
		return A9_KEY_NON_MAG;
	}
	public void setA9_KEY_NON_MAG(BigDecimal a9_KEY_NON_MAG) {
		A9_KEY_NON_MAG = a9_KEY_NON_MAG;
	}
	public BigDecimal getA9_OTH_NON_MAG() {
		return A9_OTH_NON_MAG;
	}
	public void setA9_OTH_NON_MAG(BigDecimal a9_OTH_NON_MAG) {
		A9_OTH_NON_MAG = a9_OTH_NON_MAG;
	}
	public BigDecimal getA9_TOTAL_NON_MAG() {
		return A9_TOTAL_NON_MAG;
	}
	public void setA9_TOTAL_NON_MAG(BigDecimal a9_TOTAL_NON_MAG) {
		A9_TOTAL_NON_MAG = a9_TOTAL_NON_MAG;
	}
	public BigDecimal getA9_KEY_MAG() {
		return A9_KEY_MAG;
	}
	public void setA9_KEY_MAG(BigDecimal a9_KEY_MAG) {
		A9_KEY_MAG = a9_KEY_MAG;
	}
	public BigDecimal getA9_OTH_MAG() {
		return A9_OTH_MAG;
	}
	public void setA9_OTH_MAG(BigDecimal a9_OTH_MAG) {
		A9_OTH_MAG = a9_OTH_MAG;
	}
	public BigDecimal getA9_TOTAL_MAG() {
		return A9_TOTAL_MAG;
	}
	public void setA9_TOTAL_MAG(BigDecimal a9_TOTAL_MAG) {
		A9_TOTAL_MAG = a9_TOTAL_MAG;
	}
	public BigDecimal getA9_TOTAL_ALL() {
		return A9_TOTAL_ALL;
	}
	public void setA9_TOTAL_ALL(BigDecimal a9_TOTAL_ALL) {
		A9_TOTAL_ALL = a9_TOTAL_ALL;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_KEY_NON_MAG() {
		return A11_KEY_NON_MAG;
	}
	public void setA11_KEY_NON_MAG(BigDecimal a11_KEY_NON_MAG) {
		A11_KEY_NON_MAG = a11_KEY_NON_MAG;
	}
	public BigDecimal getA11_OTH_NON_MAG() {
		return A11_OTH_NON_MAG;
	}
	public void setA11_OTH_NON_MAG(BigDecimal a11_OTH_NON_MAG) {
		A11_OTH_NON_MAG = a11_OTH_NON_MAG;
	}
	public BigDecimal getA11_TOTAL_NON_MAG() {
		return A11_TOTAL_NON_MAG;
	}
	public void setA11_TOTAL_NON_MAG(BigDecimal a11_TOTAL_NON_MAG) {
		A11_TOTAL_NON_MAG = a11_TOTAL_NON_MAG;
	}
	public BigDecimal getA11_KEY_MAG() {
		return A11_KEY_MAG;
	}
	public void setA11_KEY_MAG(BigDecimal a11_KEY_MAG) {
		A11_KEY_MAG = a11_KEY_MAG;
	}
	public BigDecimal getA11_OTH_MAG() {
		return A11_OTH_MAG;
	}
	public void setA11_OTH_MAG(BigDecimal a11_OTH_MAG) {
		A11_OTH_MAG = a11_OTH_MAG;
	}
	public BigDecimal getA11_TOTAL_MAG() {
		return A11_TOTAL_MAG;
	}
	public void setA11_TOTAL_MAG(BigDecimal a11_TOTAL_MAG) {
		A11_TOTAL_MAG = a11_TOTAL_MAG;
	}
	public BigDecimal getA11_TOTAL_ALL() {
		return A11_TOTAL_ALL;
	}
	public void setA11_TOTAL_ALL(BigDecimal a11_TOTAL_ALL) {
		A11_TOTAL_ALL = a11_TOTAL_ALL;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_KEY_NON_MAG() {
		return A12_KEY_NON_MAG;
	}
	public void setA12_KEY_NON_MAG(BigDecimal a12_KEY_NON_MAG) {
		A12_KEY_NON_MAG = a12_KEY_NON_MAG;
	}
	public BigDecimal getA12_OTH_NON_MAG() {
		return A12_OTH_NON_MAG;
	}
	public void setA12_OTH_NON_MAG(BigDecimal a12_OTH_NON_MAG) {
		A12_OTH_NON_MAG = a12_OTH_NON_MAG;
	}
	public BigDecimal getA12_TOTAL_NON_MAG() {
		return A12_TOTAL_NON_MAG;
	}
	public void setA12_TOTAL_NON_MAG(BigDecimal a12_TOTAL_NON_MAG) {
		A12_TOTAL_NON_MAG = a12_TOTAL_NON_MAG;
	}
	public BigDecimal getA12_KEY_MAG() {
		return A12_KEY_MAG;
	}
	public void setA12_KEY_MAG(BigDecimal a12_KEY_MAG) {
		A12_KEY_MAG = a12_KEY_MAG;
	}
	public BigDecimal getA12_OTH_MAG() {
		return A12_OTH_MAG;
	}
	public void setA12_OTH_MAG(BigDecimal a12_OTH_MAG) {
		A12_OTH_MAG = a12_OTH_MAG;
	}
	public BigDecimal getA12_TOTAL_MAG() {
		return A12_TOTAL_MAG;
	}
	public void setA12_TOTAL_MAG(BigDecimal a12_TOTAL_MAG) {
		A12_TOTAL_MAG = a12_TOTAL_MAG;
	}
	public BigDecimal getA12_TOTAL_ALL() {
		return A12_TOTAL_ALL;
	}
	public void setA12_TOTAL_ALL(BigDecimal a12_TOTAL_ALL) {
		A12_TOTAL_ALL = a12_TOTAL_ALL;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_KEY_NON_MAG() {
		return A14_KEY_NON_MAG;
	}
	public void setA14_KEY_NON_MAG(BigDecimal a14_KEY_NON_MAG) {
		A14_KEY_NON_MAG = a14_KEY_NON_MAG;
	}
	public BigDecimal getA14_OTH_NON_MAG() {
		return A14_OTH_NON_MAG;
	}
	public void setA14_OTH_NON_MAG(BigDecimal a14_OTH_NON_MAG) {
		A14_OTH_NON_MAG = a14_OTH_NON_MAG;
	}
	public BigDecimal getA14_TOTAL_NON_MAG() {
		return A14_TOTAL_NON_MAG;
	}
	public void setA14_TOTAL_NON_MAG(BigDecimal a14_TOTAL_NON_MAG) {
		A14_TOTAL_NON_MAG = a14_TOTAL_NON_MAG;
	}
	public BigDecimal getA14_KEY_MAG() {
		return A14_KEY_MAG;
	}
	public void setA14_KEY_MAG(BigDecimal a14_KEY_MAG) {
		A14_KEY_MAG = a14_KEY_MAG;
	}
	public BigDecimal getA14_OTH_MAG() {
		return A14_OTH_MAG;
	}
	public void setA14_OTH_MAG(BigDecimal a14_OTH_MAG) {
		A14_OTH_MAG = a14_OTH_MAG;
	}
	public BigDecimal getA14_TOTAL_MAG() {
		return A14_TOTAL_MAG;
	}
	public void setA14_TOTAL_MAG(BigDecimal a14_TOTAL_MAG) {
		A14_TOTAL_MAG = a14_TOTAL_MAG;
	}
	public BigDecimal getA14_TOTAL_ALL() {
		return A14_TOTAL_ALL;
	}
	public void setA14_TOTAL_ALL(BigDecimal a14_TOTAL_ALL) {
		A14_TOTAL_ALL = a14_TOTAL_ALL;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15_KEY_NON_MAG() {
		return A15_KEY_NON_MAG;
	}
	public void setA15_KEY_NON_MAG(BigDecimal a15_KEY_NON_MAG) {
		A15_KEY_NON_MAG = a15_KEY_NON_MAG;
	}
	public BigDecimal getA15_OTH_NON_MAG() {
		return A15_OTH_NON_MAG;
	}
	public void setA15_OTH_NON_MAG(BigDecimal a15_OTH_NON_MAG) {
		A15_OTH_NON_MAG = a15_OTH_NON_MAG;
	}
	public BigDecimal getA15_TOTAL_NON_MAG() {
		return A15_TOTAL_NON_MAG;
	}
	public void setA15_TOTAL_NON_MAG(BigDecimal a15_TOTAL_NON_MAG) {
		A15_TOTAL_NON_MAG = a15_TOTAL_NON_MAG;
	}
	public BigDecimal getA15_KEY_MAG() {
		return A15_KEY_MAG;
	}
	public void setA15_KEY_MAG(BigDecimal a15_KEY_MAG) {
		A15_KEY_MAG = a15_KEY_MAG;
	}
	public BigDecimal getA15_OTH_MAG() {
		return A15_OTH_MAG;
	}
	public void setA15_OTH_MAG(BigDecimal a15_OTH_MAG) {
		A15_OTH_MAG = a15_OTH_MAG;
	}
	public BigDecimal getA15_TOTAL_MAG() {
		return A15_TOTAL_MAG;
	}
	public void setA15_TOTAL_MAG(BigDecimal a15_TOTAL_MAG) {
		A15_TOTAL_MAG = a15_TOTAL_MAG;
	}
	public BigDecimal getA15_TOTAL_ALL() {
		return A15_TOTAL_ALL;
	}
	public void setA15_TOTAL_ALL(BigDecimal a15_TOTAL_ALL) {
		A15_TOTAL_ALL = a15_TOTAL_ALL;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17_KEY_NON_MAG() {
		return A17_KEY_NON_MAG;
	}
	public void setA17_KEY_NON_MAG(BigDecimal a17_KEY_NON_MAG) {
		A17_KEY_NON_MAG = a17_KEY_NON_MAG;
	}
	public BigDecimal getA17_OTH_NON_MAG() {
		return A17_OTH_NON_MAG;
	}
	public void setA17_OTH_NON_MAG(BigDecimal a17_OTH_NON_MAG) {
		A17_OTH_NON_MAG = a17_OTH_NON_MAG;
	}
	public BigDecimal getA17_TOTAL_NON_MAG() {
		return A17_TOTAL_NON_MAG;
	}
	public void setA17_TOTAL_NON_MAG(BigDecimal a17_TOTAL_NON_MAG) {
		A17_TOTAL_NON_MAG = a17_TOTAL_NON_MAG;
	}
	public BigDecimal getA17_KEY_MAG() {
		return A17_KEY_MAG;
	}
	public void setA17_KEY_MAG(BigDecimal a17_KEY_MAG) {
		A17_KEY_MAG = a17_KEY_MAG;
	}
	public BigDecimal getA17_OTH_MAG() {
		return A17_OTH_MAG;
	}
	public void setA17_OTH_MAG(BigDecimal a17_OTH_MAG) {
		A17_OTH_MAG = a17_OTH_MAG;
	}
	public BigDecimal getA17_TOTAL_MAG() {
		return A17_TOTAL_MAG;
	}
	public void setA17_TOTAL_MAG(BigDecimal a17_TOTAL_MAG) {
		A17_TOTAL_MAG = a17_TOTAL_MAG;
	}
	public BigDecimal getA17_TOTAL_ALL() {
		return A17_TOTAL_ALL;
	}
	public void setA17_TOTAL_ALL(BigDecimal a17_TOTAL_ALL) {
		A17_TOTAL_ALL = a17_TOTAL_ALL;
	}
	public String getA18_PRODUCT() {
		return A18_PRODUCT;
	}
	public void setA18_PRODUCT(String a18_PRODUCT) {
		A18_PRODUCT = a18_PRODUCT;
	}
	public BigDecimal getA18_KEY_NON_MAG() {
		return A18_KEY_NON_MAG;
	}
	public void setA18_KEY_NON_MAG(BigDecimal a18_KEY_NON_MAG) {
		A18_KEY_NON_MAG = a18_KEY_NON_MAG;
	}
	public BigDecimal getA18_OTH_NON_MAG() {
		return A18_OTH_NON_MAG;
	}
	public void setA18_OTH_NON_MAG(BigDecimal a18_OTH_NON_MAG) {
		A18_OTH_NON_MAG = a18_OTH_NON_MAG;
	}
	public BigDecimal getA18_TOTAL_NON_MAG() {
		return A18_TOTAL_NON_MAG;
	}
	public void setA18_TOTAL_NON_MAG(BigDecimal a18_TOTAL_NON_MAG) {
		A18_TOTAL_NON_MAG = a18_TOTAL_NON_MAG;
	}
	public BigDecimal getA18_KEY_MAG() {
		return A18_KEY_MAG;
	}
	public void setA18_KEY_MAG(BigDecimal a18_KEY_MAG) {
		A18_KEY_MAG = a18_KEY_MAG;
	}
	public BigDecimal getA18_OTH_MAG() {
		return A18_OTH_MAG;
	}
	public void setA18_OTH_MAG(BigDecimal a18_OTH_MAG) {
		A18_OTH_MAG = a18_OTH_MAG;
	}
	public BigDecimal getA18_TOTAL_MAG() {
		return A18_TOTAL_MAG;
	}
	public void setA18_TOTAL_MAG(BigDecimal a18_TOTAL_MAG) {
		A18_TOTAL_MAG = a18_TOTAL_MAG;
	}
	public BigDecimal getA18_TOTAL_ALL() {
		return A18_TOTAL_ALL;
	}
	public void setA18_TOTAL_ALL(BigDecimal a18_TOTAL_ALL) {
		A18_TOTAL_ALL = a18_TOTAL_ALL;
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
	public T1DORReport(String a1_PRODUCT, String a2_PRODUCT, BigDecimal a2_KEY_NON_MAG, BigDecimal a2_OTH_NON_MAG,
			BigDecimal a2_TOTAL_NON_MAG, BigDecimal a2_KEY_MAG, BigDecimal a2_OTH_MAG, BigDecimal a2_TOTAL_MAG,
			BigDecimal a2_TOTAL_ALL, String a3_PRODUCT, BigDecimal a3_KEY_NON_MAG, BigDecimal a3_OTH_NON_MAG,
			BigDecimal a3_TOTAL_NON_MAG, BigDecimal a3_KEY_MAG, BigDecimal a3_OTH_MAG, BigDecimal a3_TOTAL_MAG,
			BigDecimal a3_TOTAL_ALL, String a4_PRODUCT, String a5_PRODUCT, BigDecimal a5_KEY_NON_MAG,
			BigDecimal a5_OTH_NON_MAG, BigDecimal a5_TOTAL_NON_MAG, BigDecimal a5_KEY_MAG, BigDecimal a5_OTH_MAG,
			BigDecimal a5_TOTAL_MAG, BigDecimal a5_TOTAL_ALL, String a6_PRODUCT, BigDecimal a6_KEY_NON_MAG,
			BigDecimal a6_OTH_NON_MAG, BigDecimal a6_TOTAL_NON_MAG, BigDecimal a6_KEY_MAG, BigDecimal a6_OTH_MAG,
			BigDecimal a6_TOTAL_MAG, BigDecimal a6_TOTAL_ALL, String a7_PRODUCT, String a8_PRODUCT,
			BigDecimal a8_KEY_NON_MAG, BigDecimal a8_OTH_NON_MAG, BigDecimal a8_TOTAL_NON_MAG, BigDecimal a8_KEY_MAG,
			BigDecimal a8_OTH_MAG, BigDecimal a8_TOTAL_MAG, BigDecimal a8_TOTAL_ALL, String a9_PRODUCT,
			BigDecimal a9_KEY_NON_MAG, BigDecimal a9_OTH_NON_MAG, BigDecimal a9_TOTAL_NON_MAG, BigDecimal a9_KEY_MAG,
			BigDecimal a9_OTH_MAG, BigDecimal a9_TOTAL_MAG, BigDecimal a9_TOTAL_ALL, String a10_PRODUCT,
			String a11_PRODUCT, BigDecimal a11_KEY_NON_MAG, BigDecimal a11_OTH_NON_MAG, BigDecimal a11_TOTAL_NON_MAG,
			BigDecimal a11_KEY_MAG, BigDecimal a11_OTH_MAG, BigDecimal a11_TOTAL_MAG, BigDecimal a11_TOTAL_ALL,
			String a12_PRODUCT, BigDecimal a12_KEY_NON_MAG, BigDecimal a12_OTH_NON_MAG, BigDecimal a12_TOTAL_NON_MAG,
			BigDecimal a12_KEY_MAG, BigDecimal a12_OTH_MAG, BigDecimal a12_TOTAL_MAG, BigDecimal a12_TOTAL_ALL,
			String a13_PRODUCT, String a14_PRODUCT, BigDecimal a14_KEY_NON_MAG, BigDecimal a14_OTH_NON_MAG,
			BigDecimal a14_TOTAL_NON_MAG, BigDecimal a14_KEY_MAG, BigDecimal a14_OTH_MAG, BigDecimal a14_TOTAL_MAG,
			BigDecimal a14_TOTAL_ALL, String a15_PRODUCT, BigDecimal a15_KEY_NON_MAG, BigDecimal a15_OTH_NON_MAG,
			BigDecimal a15_TOTAL_NON_MAG, BigDecimal a15_KEY_MAG, BigDecimal a15_OTH_MAG, BigDecimal a15_TOTAL_MAG,
			BigDecimal a15_TOTAL_ALL, String a16_PRODUCT, String a17_PRODUCT, BigDecimal a17_KEY_NON_MAG,
			BigDecimal a17_OTH_NON_MAG, BigDecimal a17_TOTAL_NON_MAG, BigDecimal a17_KEY_MAG, BigDecimal a17_OTH_MAG,
			BigDecimal a17_TOTAL_MAG, BigDecimal a17_TOTAL_ALL, String a18_PRODUCT, BigDecimal a18_KEY_NON_MAG,
			BigDecimal a18_OTH_NON_MAG, BigDecimal a18_TOTAL_NON_MAG, BigDecimal a18_KEY_MAG, BigDecimal a18_OTH_MAG,
			BigDecimal a18_TOTAL_MAG, BigDecimal a18_TOTAL_ALL, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A2_PRODUCT = a2_PRODUCT;
		A2_KEY_NON_MAG = a2_KEY_NON_MAG;
		A2_OTH_NON_MAG = a2_OTH_NON_MAG;
		A2_TOTAL_NON_MAG = a2_TOTAL_NON_MAG;
		A2_KEY_MAG = a2_KEY_MAG;
		A2_OTH_MAG = a2_OTH_MAG;
		A2_TOTAL_MAG = a2_TOTAL_MAG;
		A2_TOTAL_ALL = a2_TOTAL_ALL;
		A3_PRODUCT = a3_PRODUCT;
		A3_KEY_NON_MAG = a3_KEY_NON_MAG;
		A3_OTH_NON_MAG = a3_OTH_NON_MAG;
		A3_TOTAL_NON_MAG = a3_TOTAL_NON_MAG;
		A3_KEY_MAG = a3_KEY_MAG;
		A3_OTH_MAG = a3_OTH_MAG;
		A3_TOTAL_MAG = a3_TOTAL_MAG;
		A3_TOTAL_ALL = a3_TOTAL_ALL;
		A4_PRODUCT = a4_PRODUCT;
		A5_PRODUCT = a5_PRODUCT;
		A5_KEY_NON_MAG = a5_KEY_NON_MAG;
		A5_OTH_NON_MAG = a5_OTH_NON_MAG;
		A5_TOTAL_NON_MAG = a5_TOTAL_NON_MAG;
		A5_KEY_MAG = a5_KEY_MAG;
		A5_OTH_MAG = a5_OTH_MAG;
		A5_TOTAL_MAG = a5_TOTAL_MAG;
		A5_TOTAL_ALL = a5_TOTAL_ALL;
		A6_PRODUCT = a6_PRODUCT;
		A6_KEY_NON_MAG = a6_KEY_NON_MAG;
		A6_OTH_NON_MAG = a6_OTH_NON_MAG;
		A6_TOTAL_NON_MAG = a6_TOTAL_NON_MAG;
		A6_KEY_MAG = a6_KEY_MAG;
		A6_OTH_MAG = a6_OTH_MAG;
		A6_TOTAL_MAG = a6_TOTAL_MAG;
		A6_TOTAL_ALL = a6_TOTAL_ALL;
		A7_PRODUCT = a7_PRODUCT;
		A8_PRODUCT = a8_PRODUCT;
		A8_KEY_NON_MAG = a8_KEY_NON_MAG;
		A8_OTH_NON_MAG = a8_OTH_NON_MAG;
		A8_TOTAL_NON_MAG = a8_TOTAL_NON_MAG;
		A8_KEY_MAG = a8_KEY_MAG;
		A8_OTH_MAG = a8_OTH_MAG;
		A8_TOTAL_MAG = a8_TOTAL_MAG;
		A8_TOTAL_ALL = a8_TOTAL_ALL;
		A9_PRODUCT = a9_PRODUCT;
		A9_KEY_NON_MAG = a9_KEY_NON_MAG;
		A9_OTH_NON_MAG = a9_OTH_NON_MAG;
		A9_TOTAL_NON_MAG = a9_TOTAL_NON_MAG;
		A9_KEY_MAG = a9_KEY_MAG;
		A9_OTH_MAG = a9_OTH_MAG;
		A9_TOTAL_MAG = a9_TOTAL_MAG;
		A9_TOTAL_ALL = a9_TOTAL_ALL;
		A10_PRODUCT = a10_PRODUCT;
		A11_PRODUCT = a11_PRODUCT;
		A11_KEY_NON_MAG = a11_KEY_NON_MAG;
		A11_OTH_NON_MAG = a11_OTH_NON_MAG;
		A11_TOTAL_NON_MAG = a11_TOTAL_NON_MAG;
		A11_KEY_MAG = a11_KEY_MAG;
		A11_OTH_MAG = a11_OTH_MAG;
		A11_TOTAL_MAG = a11_TOTAL_MAG;
		A11_TOTAL_ALL = a11_TOTAL_ALL;
		A12_PRODUCT = a12_PRODUCT;
		A12_KEY_NON_MAG = a12_KEY_NON_MAG;
		A12_OTH_NON_MAG = a12_OTH_NON_MAG;
		A12_TOTAL_NON_MAG = a12_TOTAL_NON_MAG;
		A12_KEY_MAG = a12_KEY_MAG;
		A12_OTH_MAG = a12_OTH_MAG;
		A12_TOTAL_MAG = a12_TOTAL_MAG;
		A12_TOTAL_ALL = a12_TOTAL_ALL;
		A13_PRODUCT = a13_PRODUCT;
		A14_PRODUCT = a14_PRODUCT;
		A14_KEY_NON_MAG = a14_KEY_NON_MAG;
		A14_OTH_NON_MAG = a14_OTH_NON_MAG;
		A14_TOTAL_NON_MAG = a14_TOTAL_NON_MAG;
		A14_KEY_MAG = a14_KEY_MAG;
		A14_OTH_MAG = a14_OTH_MAG;
		A14_TOTAL_MAG = a14_TOTAL_MAG;
		A14_TOTAL_ALL = a14_TOTAL_ALL;
		A15_PRODUCT = a15_PRODUCT;
		A15_KEY_NON_MAG = a15_KEY_NON_MAG;
		A15_OTH_NON_MAG = a15_OTH_NON_MAG;
		A15_TOTAL_NON_MAG = a15_TOTAL_NON_MAG;
		A15_KEY_MAG = a15_KEY_MAG;
		A15_OTH_MAG = a15_OTH_MAG;
		A15_TOTAL_MAG = a15_TOTAL_MAG;
		A15_TOTAL_ALL = a15_TOTAL_ALL;
		A16_PRODUCT = a16_PRODUCT;
		A17_PRODUCT = a17_PRODUCT;
		A17_KEY_NON_MAG = a17_KEY_NON_MAG;
		A17_OTH_NON_MAG = a17_OTH_NON_MAG;
		A17_TOTAL_NON_MAG = a17_TOTAL_NON_MAG;
		A17_KEY_MAG = a17_KEY_MAG;
		A17_OTH_MAG = a17_OTH_MAG;
		A17_TOTAL_MAG = a17_TOTAL_MAG;
		A17_TOTAL_ALL = a17_TOTAL_ALL;
		A18_PRODUCT = a18_PRODUCT;
		A18_KEY_NON_MAG = a18_KEY_NON_MAG;
		A18_OTH_NON_MAG = a18_OTH_NON_MAG;
		A18_TOTAL_NON_MAG = a18_TOTAL_NON_MAG;
		A18_KEY_MAG = a18_KEY_MAG;
		A18_OTH_MAG = a18_OTH_MAG;
		A18_TOTAL_MAG = a18_TOTAL_MAG;
		A18_TOTAL_ALL = a18_TOTAL_ALL;
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
	public T1DORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
