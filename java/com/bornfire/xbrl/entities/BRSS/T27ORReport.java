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
@Table(name="T27_OR_DETAILS_OF_COMPLAINTS_RECEIVED_BANK")
public class T27ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1A_QUARTER1;
	private BigDecimal	A1B_QUARTER2;
	private BigDecimal	A1C_QUARTER3;
	private BigDecimal	A1D_QUARTER4;
	private BigDecimal	A1E_QUARTER5;
	private BigDecimal	A1F_QUARTER6;
	private String	A2_PRODUCT;
	private BigDecimal	A2A_QUARTER1;
	private BigDecimal	A2B_QUARTER2;
	private BigDecimal	A2C_QUARTER3;
	private BigDecimal	A2D_QUARTER4;
	private BigDecimal	A2E_QUARTER5;
	private BigDecimal	A2F_QUARTER6;
	private String	A3_PRODUCT;
	private BigDecimal	A3A_QUARTER1;
	private BigDecimal	A3B_QUARTER2;
	private BigDecimal	A3C_QUARTER3;
	private BigDecimal	A3D_QUARTER4;
	private BigDecimal	A3E_QUARTER5;
	private BigDecimal	A3F_QUARTER6;
	private String	A4_PRODUCT;
	private BigDecimal	A4A_QUARTER1;
	private BigDecimal	A4B_QUARTER2;
	private BigDecimal	A4C_QUARTER3;
	private BigDecimal	A4D_QUARTER4;
	private BigDecimal	A4E_QUARTER5;
	private BigDecimal	A4F_QUARTER6;
	private String	A5_PRODUCT;
	private BigDecimal	A5A_QUARTER1;
	private BigDecimal	A5B_QUARTER2;
	private BigDecimal	A5C_QUARTER3;
	private BigDecimal	A5D_QUARTER4;
	private BigDecimal	A5E_QUARTER5;
	private BigDecimal	A5F_QUARTER6;
	private String	A6_PRODUCT;
	private BigDecimal	A6A_QUARTER1;
	private BigDecimal	A6B_QUARTER2;
	private BigDecimal	A6C_QUARTER3;
	private BigDecimal	A6D_QUARTER4;
	private BigDecimal	A6E_QUARTER5;
	private BigDecimal	A6F_QUARTER6;
	private String	A7_PRODUCT;
	private BigDecimal	A7A_QUARTER1;
	private BigDecimal	A7B_QUARTER2;
	private BigDecimal	A7C_QUARTER3;
	private BigDecimal	A7D_QUARTER4;
	private BigDecimal	A7E_QUARTER5;
	private BigDecimal	A7F_QUARTER6;
	private String	A8_PRODUCT;
	private BigDecimal	A8A_QUARTER1;
	private BigDecimal	A8B_QUARTER2;
	private BigDecimal	A8C_QUARTER3;
	private BigDecimal	A8D_QUARTER4;
	private BigDecimal	A8E_QUARTER5;
	private BigDecimal	A8F_QUARTER6;
	private String	A9_PRODUCT;
	private BigDecimal	A9A_QUARTER1;
	private BigDecimal	A9B_QUARTER2;
	private BigDecimal	A9C_QUARTER3;
	private BigDecimal	A9D_QUARTER4;
	private BigDecimal	A9E_QUARTER5;
	private BigDecimal	A9F_QUARTER6;
	private String	A10_PRODUCT;
	private BigDecimal	A10A_QUARTER1;
	private BigDecimal	A10B_QUARTER2;
	private BigDecimal	A10C_QUARTER3;
	private BigDecimal	A10D_QUARTER4;
	private BigDecimal	A10E_QUARTER5;
	private BigDecimal	A10F_QUARTER6;
	private String	A11_PRODUCT;
	private BigDecimal	A11A_QUARTER1;
	private BigDecimal	A11B_QUARTER2;
	private BigDecimal	A11C_QUARTER3;
	private BigDecimal	A11D_QUARTER4;
	private BigDecimal	A11E_QUARTER5;
	private BigDecimal	A11F_QUARTER6;
	private String	A12_PRODUCT;
	private BigDecimal	A12A_QUARTER1;
	private BigDecimal	A12B_QUARTER2;
	private BigDecimal	A12C_QUARTER3;
	private BigDecimal	A12D_QUARTER4;
	private BigDecimal	A12E_QUARTER5;
	private BigDecimal	A12F_QUARTER6;
	private String	A13_PRODUCT;
	private BigDecimal	A13A_QUARTER1;
	private BigDecimal	A13B_QUARTER2;
	private BigDecimal	A13C_QUARTER3;
	private BigDecimal	A13D_QUARTER4;
	private BigDecimal	A13E_QUARTER5;
	private BigDecimal	A13F_QUARTER6;
	private String	A14_PRODUCT;
	private BigDecimal	A14A_QUARTER1;
	private BigDecimal	A14B_QUARTER2;
	private BigDecimal	A14C_QUARTER3;
	private BigDecimal	A14D_QUARTER4;
	private BigDecimal	A14E_QUARTER5;
	private BigDecimal	A14F_QUARTER6;
	private String	A15_PRODUCT;
	private BigDecimal	A15A_QUARTER1;
	private BigDecimal	A15B_QUARTER2;
	private BigDecimal	A15C_QUARTER3;
	private BigDecimal	A15D_QUARTER4;
	private BigDecimal	A15E_QUARTER5;
	private BigDecimal	A15F_QUARTER6;
	private String	A16_PRODUCT;
	private BigDecimal	A16A_QUARTER1;
	private BigDecimal	A16B_QUARTER2;
	private BigDecimal	A16C_QUARTER3;
	private BigDecimal	A16D_QUARTER4;
	private BigDecimal	A16E_QUARTER5;
	private BigDecimal	A16F_QUARTER6;
	private String	A17_PRODUCT;
	private BigDecimal	A17A_QUARTER1;
	private BigDecimal	A17B_QUARTER2;
	private BigDecimal	A17C_QUARTER3;
	private BigDecimal	A17D_QUARTER4;
	private BigDecimal	A17E_QUARTER5;
	private BigDecimal	A17F_QUARTER6;
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
	private String HEADER_1;
	private String HEADER_2;
	private String HEADER_3;
	public String getHEADER_1() {
		return HEADER_1;
	}
	public void setHEADER_1(String hEADER_1) {
		HEADER_1 = hEADER_1;
	}
	public String getHEADER_2() {
		return HEADER_2;
	}
	public void setHEADER_2(String hEADER_2) {
		HEADER_2 = hEADER_2;
	}
	public String getHEADER_3() {
		return HEADER_3;
	}
	public void setHEADER_3(String hEADER_3) {
		HEADER_3 = hEADER_3;
	}
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1A_QUARTER1() {
		return A1A_QUARTER1;
	}
	public void setA1A_QUARTER1(BigDecimal a1a_QUARTER1) {
		A1A_QUARTER1 = a1a_QUARTER1;
	}
	public BigDecimal getA1B_QUARTER2() {
		return A1B_QUARTER2;
	}
	public void setA1B_QUARTER2(BigDecimal a1b_QUARTER2) {
		A1B_QUARTER2 = a1b_QUARTER2;
	}
	public BigDecimal getA1C_QUARTER3() {
		return A1C_QUARTER3;
	}
	public void setA1C_QUARTER3(BigDecimal a1c_QUARTER3) {
		A1C_QUARTER3 = a1c_QUARTER3;
	}
	public BigDecimal getA1D_QUARTER4() {
		return A1D_QUARTER4;
	}
	public void setA1D_QUARTER4(BigDecimal a1d_QUARTER4) {
		A1D_QUARTER4 = a1d_QUARTER4;
	}
	public BigDecimal getA1E_QUARTER5() {
		return A1E_QUARTER5;
	}
	public void setA1E_QUARTER5(BigDecimal a1e_QUARTER5) {
		A1E_QUARTER5 = a1e_QUARTER5;
	}
	public BigDecimal getA1F_QUARTER6() {
		return A1F_QUARTER6;
	}
	public void setA1F_QUARTER6(BigDecimal a1f_QUARTER6) {
		A1F_QUARTER6 = a1f_QUARTER6;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2A_QUARTER1() {
		return A2A_QUARTER1;
	}
	public void setA2A_QUARTER1(BigDecimal a2a_QUARTER1) {
		A2A_QUARTER1 = a2a_QUARTER1;
	}
	public BigDecimal getA2B_QUARTER2() {
		return A2B_QUARTER2;
	}
	public void setA2B_QUARTER2(BigDecimal a2b_QUARTER2) {
		A2B_QUARTER2 = a2b_QUARTER2;
	}
	public BigDecimal getA2C_QUARTER3() {
		return A2C_QUARTER3;
	}
	public void setA2C_QUARTER3(BigDecimal a2c_QUARTER3) {
		A2C_QUARTER3 = a2c_QUARTER3;
	}
	public BigDecimal getA2D_QUARTER4() {
		return A2D_QUARTER4;
	}
	public void setA2D_QUARTER4(BigDecimal a2d_QUARTER4) {
		A2D_QUARTER4 = a2d_QUARTER4;
	}
	public BigDecimal getA2E_QUARTER5() {
		return A2E_QUARTER5;
	}
	public void setA2E_QUARTER5(BigDecimal a2e_QUARTER5) {
		A2E_QUARTER5 = a2e_QUARTER5;
	}
	public BigDecimal getA2F_QUARTER6() {
		return A2F_QUARTER6;
	}
	public void setA2F_QUARTER6(BigDecimal a2f_QUARTER6) {
		A2F_QUARTER6 = a2f_QUARTER6;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3A_QUARTER1() {
		return A3A_QUARTER1;
	}
	public void setA3A_QUARTER1(BigDecimal a3a_QUARTER1) {
		A3A_QUARTER1 = a3a_QUARTER1;
	}
	public BigDecimal getA3B_QUARTER2() {
		return A3B_QUARTER2;
	}
	public void setA3B_QUARTER2(BigDecimal a3b_QUARTER2) {
		A3B_QUARTER2 = a3b_QUARTER2;
	}
	public BigDecimal getA3C_QUARTER3() {
		return A3C_QUARTER3;
	}
	public void setA3C_QUARTER3(BigDecimal a3c_QUARTER3) {
		A3C_QUARTER3 = a3c_QUARTER3;
	}
	public BigDecimal getA3D_QUARTER4() {
		return A3D_QUARTER4;
	}
	public void setA3D_QUARTER4(BigDecimal a3d_QUARTER4) {
		A3D_QUARTER4 = a3d_QUARTER4;
	}
	public BigDecimal getA3E_QUARTER5() {
		return A3E_QUARTER5;
	}
	public void setA3E_QUARTER5(BigDecimal a3e_QUARTER5) {
		A3E_QUARTER5 = a3e_QUARTER5;
	}
	public BigDecimal getA3F_QUARTER6() {
		return A3F_QUARTER6;
	}
	public void setA3F_QUARTER6(BigDecimal a3f_QUARTER6) {
		A3F_QUARTER6 = a3f_QUARTER6;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4A_QUARTER1() {
		return A4A_QUARTER1;
	}
	public void setA4A_QUARTER1(BigDecimal a4a_QUARTER1) {
		A4A_QUARTER1 = a4a_QUARTER1;
	}
	public BigDecimal getA4B_QUARTER2() {
		return A4B_QUARTER2;
	}
	public void setA4B_QUARTER2(BigDecimal a4b_QUARTER2) {
		A4B_QUARTER2 = a4b_QUARTER2;
	}
	public BigDecimal getA4C_QUARTER3() {
		return A4C_QUARTER3;
	}
	public void setA4C_QUARTER3(BigDecimal a4c_QUARTER3) {
		A4C_QUARTER3 = a4c_QUARTER3;
	}
	public BigDecimal getA4D_QUARTER4() {
		return A4D_QUARTER4;
	}
	public void setA4D_QUARTER4(BigDecimal a4d_QUARTER4) {
		A4D_QUARTER4 = a4d_QUARTER4;
	}
	public BigDecimal getA4E_QUARTER5() {
		return A4E_QUARTER5;
	}
	public void setA4E_QUARTER5(BigDecimal a4e_QUARTER5) {
		A4E_QUARTER5 = a4e_QUARTER5;
	}
	public BigDecimal getA4F_QUARTER6() {
		return A4F_QUARTER6;
	}
	public void setA4F_QUARTER6(BigDecimal a4f_QUARTER6) {
		A4F_QUARTER6 = a4f_QUARTER6;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5A_QUARTER1() {
		return A5A_QUARTER1;
	}
	public void setA5A_QUARTER1(BigDecimal a5a_QUARTER1) {
		A5A_QUARTER1 = a5a_QUARTER1;
	}
	public BigDecimal getA5B_QUARTER2() {
		return A5B_QUARTER2;
	}
	public void setA5B_QUARTER2(BigDecimal a5b_QUARTER2) {
		A5B_QUARTER2 = a5b_QUARTER2;
	}
	public BigDecimal getA5C_QUARTER3() {
		return A5C_QUARTER3;
	}
	public void setA5C_QUARTER3(BigDecimal a5c_QUARTER3) {
		A5C_QUARTER3 = a5c_QUARTER3;
	}
	public BigDecimal getA5D_QUARTER4() {
		return A5D_QUARTER4;
	}
	public void setA5D_QUARTER4(BigDecimal a5d_QUARTER4) {
		A5D_QUARTER4 = a5d_QUARTER4;
	}
	public BigDecimal getA5E_QUARTER5() {
		return A5E_QUARTER5;
	}
	public void setA5E_QUARTER5(BigDecimal a5e_QUARTER5) {
		A5E_QUARTER5 = a5e_QUARTER5;
	}
	public BigDecimal getA5F_QUARTER6() {
		return A5F_QUARTER6;
	}
	public void setA5F_QUARTER6(BigDecimal a5f_QUARTER6) {
		A5F_QUARTER6 = a5f_QUARTER6;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6A_QUARTER1() {
		return A6A_QUARTER1;
	}
	public void setA6A_QUARTER1(BigDecimal a6a_QUARTER1) {
		A6A_QUARTER1 = a6a_QUARTER1;
	}
	public BigDecimal getA6B_QUARTER2() {
		return A6B_QUARTER2;
	}
	public void setA6B_QUARTER2(BigDecimal a6b_QUARTER2) {
		A6B_QUARTER2 = a6b_QUARTER2;
	}
	public BigDecimal getA6C_QUARTER3() {
		return A6C_QUARTER3;
	}
	public void setA6C_QUARTER3(BigDecimal a6c_QUARTER3) {
		A6C_QUARTER3 = a6c_QUARTER3;
	}
	public BigDecimal getA6D_QUARTER4() {
		return A6D_QUARTER4;
	}
	public void setA6D_QUARTER4(BigDecimal a6d_QUARTER4) {
		A6D_QUARTER4 = a6d_QUARTER4;
	}
	public BigDecimal getA6E_QUARTER5() {
		return A6E_QUARTER5;
	}
	public void setA6E_QUARTER5(BigDecimal a6e_QUARTER5) {
		A6E_QUARTER5 = a6e_QUARTER5;
	}
	public BigDecimal getA6F_QUARTER6() {
		return A6F_QUARTER6;
	}
	public void setA6F_QUARTER6(BigDecimal a6f_QUARTER6) {
		A6F_QUARTER6 = a6f_QUARTER6;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7A_QUARTER1() {
		return A7A_QUARTER1;
	}
	public void setA7A_QUARTER1(BigDecimal a7a_QUARTER1) {
		A7A_QUARTER1 = a7a_QUARTER1;
	}
	public BigDecimal getA7B_QUARTER2() {
		return A7B_QUARTER2;
	}
	public void setA7B_QUARTER2(BigDecimal a7b_QUARTER2) {
		A7B_QUARTER2 = a7b_QUARTER2;
	}
	public BigDecimal getA7C_QUARTER3() {
		return A7C_QUARTER3;
	}
	public void setA7C_QUARTER3(BigDecimal a7c_QUARTER3) {
		A7C_QUARTER3 = a7c_QUARTER3;
	}
	public BigDecimal getA7D_QUARTER4() {
		return A7D_QUARTER4;
	}
	public void setA7D_QUARTER4(BigDecimal a7d_QUARTER4) {
		A7D_QUARTER4 = a7d_QUARTER4;
	}
	public BigDecimal getA7E_QUARTER5() {
		return A7E_QUARTER5;
	}
	public void setA7E_QUARTER5(BigDecimal a7e_QUARTER5) {
		A7E_QUARTER5 = a7e_QUARTER5;
	}
	public BigDecimal getA7F_QUARTER6() {
		return A7F_QUARTER6;
	}
	public void setA7F_QUARTER6(BigDecimal a7f_QUARTER6) {
		A7F_QUARTER6 = a7f_QUARTER6;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8A_QUARTER1() {
		return A8A_QUARTER1;
	}
	public void setA8A_QUARTER1(BigDecimal a8a_QUARTER1) {
		A8A_QUARTER1 = a8a_QUARTER1;
	}
	public BigDecimal getA8B_QUARTER2() {
		return A8B_QUARTER2;
	}
	public void setA8B_QUARTER2(BigDecimal a8b_QUARTER2) {
		A8B_QUARTER2 = a8b_QUARTER2;
	}
	public BigDecimal getA8C_QUARTER3() {
		return A8C_QUARTER3;
	}
	public void setA8C_QUARTER3(BigDecimal a8c_QUARTER3) {
		A8C_QUARTER3 = a8c_QUARTER3;
	}
	public BigDecimal getA8D_QUARTER4() {
		return A8D_QUARTER4;
	}
	public void setA8D_QUARTER4(BigDecimal a8d_QUARTER4) {
		A8D_QUARTER4 = a8d_QUARTER4;
	}
	public BigDecimal getA8E_QUARTER5() {
		return A8E_QUARTER5;
	}
	public void setA8E_QUARTER5(BigDecimal a8e_QUARTER5) {
		A8E_QUARTER5 = a8e_QUARTER5;
	}
	public BigDecimal getA8F_QUARTER6() {
		return A8F_QUARTER6;
	}
	public void setA8F_QUARTER6(BigDecimal a8f_QUARTER6) {
		A8F_QUARTER6 = a8f_QUARTER6;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9A_QUARTER1() {
		return A9A_QUARTER1;
	}
	public void setA9A_QUARTER1(BigDecimal a9a_QUARTER1) {
		A9A_QUARTER1 = a9a_QUARTER1;
	}
	public BigDecimal getA9B_QUARTER2() {
		return A9B_QUARTER2;
	}
	public void setA9B_QUARTER2(BigDecimal a9b_QUARTER2) {
		A9B_QUARTER2 = a9b_QUARTER2;
	}
	public BigDecimal getA9C_QUARTER3() {
		return A9C_QUARTER3;
	}
	public void setA9C_QUARTER3(BigDecimal a9c_QUARTER3) {
		A9C_QUARTER3 = a9c_QUARTER3;
	}
	public BigDecimal getA9D_QUARTER4() {
		return A9D_QUARTER4;
	}
	public void setA9D_QUARTER4(BigDecimal a9d_QUARTER4) {
		A9D_QUARTER4 = a9d_QUARTER4;
	}
	public BigDecimal getA9E_QUARTER5() {
		return A9E_QUARTER5;
	}
	public void setA9E_QUARTER5(BigDecimal a9e_QUARTER5) {
		A9E_QUARTER5 = a9e_QUARTER5;
	}
	public BigDecimal getA9F_QUARTER6() {
		return A9F_QUARTER6;
	}
	public void setA9F_QUARTER6(BigDecimal a9f_QUARTER6) {
		A9F_QUARTER6 = a9f_QUARTER6;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10A_QUARTER1() {
		return A10A_QUARTER1;
	}
	public void setA10A_QUARTER1(BigDecimal a10a_QUARTER1) {
		A10A_QUARTER1 = a10a_QUARTER1;
	}
	public BigDecimal getA10B_QUARTER2() {
		return A10B_QUARTER2;
	}
	public void setA10B_QUARTER2(BigDecimal a10b_QUARTER2) {
		A10B_QUARTER2 = a10b_QUARTER2;
	}
	public BigDecimal getA10C_QUARTER3() {
		return A10C_QUARTER3;
	}
	public void setA10C_QUARTER3(BigDecimal a10c_QUARTER3) {
		A10C_QUARTER3 = a10c_QUARTER3;
	}
	public BigDecimal getA10D_QUARTER4() {
		return A10D_QUARTER4;
	}
	public void setA10D_QUARTER4(BigDecimal a10d_QUARTER4) {
		A10D_QUARTER4 = a10d_QUARTER4;
	}
	public BigDecimal getA10E_QUARTER5() {
		return A10E_QUARTER5;
	}
	public void setA10E_QUARTER5(BigDecimal a10e_QUARTER5) {
		A10E_QUARTER5 = a10e_QUARTER5;
	}
	public BigDecimal getA10F_QUARTER6() {
		return A10F_QUARTER6;
	}
	public void setA10F_QUARTER6(BigDecimal a10f_QUARTER6) {
		A10F_QUARTER6 = a10f_QUARTER6;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11A_QUARTER1() {
		return A11A_QUARTER1;
	}
	public void setA11A_QUARTER1(BigDecimal a11a_QUARTER1) {
		A11A_QUARTER1 = a11a_QUARTER1;
	}
	public BigDecimal getA11B_QUARTER2() {
		return A11B_QUARTER2;
	}
	public void setA11B_QUARTER2(BigDecimal a11b_QUARTER2) {
		A11B_QUARTER2 = a11b_QUARTER2;
	}
	public BigDecimal getA11C_QUARTER3() {
		return A11C_QUARTER3;
	}
	public void setA11C_QUARTER3(BigDecimal a11c_QUARTER3) {
		A11C_QUARTER3 = a11c_QUARTER3;
	}
	public BigDecimal getA11D_QUARTER4() {
		return A11D_QUARTER4;
	}
	public void setA11D_QUARTER4(BigDecimal a11d_QUARTER4) {
		A11D_QUARTER4 = a11d_QUARTER4;
	}
	public BigDecimal getA11E_QUARTER5() {
		return A11E_QUARTER5;
	}
	public void setA11E_QUARTER5(BigDecimal a11e_QUARTER5) {
		A11E_QUARTER5 = a11e_QUARTER5;
	}
	public BigDecimal getA11F_QUARTER6() {
		return A11F_QUARTER6;
	}
	public void setA11F_QUARTER6(BigDecimal a11f_QUARTER6) {
		A11F_QUARTER6 = a11f_QUARTER6;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12A_QUARTER1() {
		return A12A_QUARTER1;
	}
	public void setA12A_QUARTER1(BigDecimal a12a_QUARTER1) {
		A12A_QUARTER1 = a12a_QUARTER1;
	}
	public BigDecimal getA12B_QUARTER2() {
		return A12B_QUARTER2;
	}
	public void setA12B_QUARTER2(BigDecimal a12b_QUARTER2) {
		A12B_QUARTER2 = a12b_QUARTER2;
	}
	public BigDecimal getA12C_QUARTER3() {
		return A12C_QUARTER3;
	}
	public void setA12C_QUARTER3(BigDecimal a12c_QUARTER3) {
		A12C_QUARTER3 = a12c_QUARTER3;
	}
	public BigDecimal getA12D_QUARTER4() {
		return A12D_QUARTER4;
	}
	public void setA12D_QUARTER4(BigDecimal a12d_QUARTER4) {
		A12D_QUARTER4 = a12d_QUARTER4;
	}
	public BigDecimal getA12E_QUARTER5() {
		return A12E_QUARTER5;
	}
	public void setA12E_QUARTER5(BigDecimal a12e_QUARTER5) {
		A12E_QUARTER5 = a12e_QUARTER5;
	}
	public BigDecimal getA12F_QUARTER6() {
		return A12F_QUARTER6;
	}
	public void setA12F_QUARTER6(BigDecimal a12f_QUARTER6) {
		A12F_QUARTER6 = a12f_QUARTER6;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13A_QUARTER1() {
		return A13A_QUARTER1;
	}
	public void setA13A_QUARTER1(BigDecimal a13a_QUARTER1) {
		A13A_QUARTER1 = a13a_QUARTER1;
	}
	public BigDecimal getA13B_QUARTER2() {
		return A13B_QUARTER2;
	}
	public void setA13B_QUARTER2(BigDecimal a13b_QUARTER2) {
		A13B_QUARTER2 = a13b_QUARTER2;
	}
	public BigDecimal getA13C_QUARTER3() {
		return A13C_QUARTER3;
	}
	public void setA13C_QUARTER3(BigDecimal a13c_QUARTER3) {
		A13C_QUARTER3 = a13c_QUARTER3;
	}
	public BigDecimal getA13D_QUARTER4() {
		return A13D_QUARTER4;
	}
	public void setA13D_QUARTER4(BigDecimal a13d_QUARTER4) {
		A13D_QUARTER4 = a13d_QUARTER4;
	}
	public BigDecimal getA13E_QUARTER5() {
		return A13E_QUARTER5;
	}
	public void setA13E_QUARTER5(BigDecimal a13e_QUARTER5) {
		A13E_QUARTER5 = a13e_QUARTER5;
	}
	public BigDecimal getA13F_QUARTER6() {
		return A13F_QUARTER6;
	}
	public void setA13F_QUARTER6(BigDecimal a13f_QUARTER6) {
		A13F_QUARTER6 = a13f_QUARTER6;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14A_QUARTER1() {
		return A14A_QUARTER1;
	}
	public void setA14A_QUARTER1(BigDecimal a14a_QUARTER1) {
		A14A_QUARTER1 = a14a_QUARTER1;
	}
	public BigDecimal getA14B_QUARTER2() {
		return A14B_QUARTER2;
	}
	public void setA14B_QUARTER2(BigDecimal a14b_QUARTER2) {
		A14B_QUARTER2 = a14b_QUARTER2;
	}
	public BigDecimal getA14C_QUARTER3() {
		return A14C_QUARTER3;
	}
	public void setA14C_QUARTER3(BigDecimal a14c_QUARTER3) {
		A14C_QUARTER3 = a14c_QUARTER3;
	}
	public BigDecimal getA14D_QUARTER4() {
		return A14D_QUARTER4;
	}
	public void setA14D_QUARTER4(BigDecimal a14d_QUARTER4) {
		A14D_QUARTER4 = a14d_QUARTER4;
	}
	public BigDecimal getA14E_QUARTER5() {
		return A14E_QUARTER5;
	}
	public void setA14E_QUARTER5(BigDecimal a14e_QUARTER5) {
		A14E_QUARTER5 = a14e_QUARTER5;
	}
	public BigDecimal getA14F_QUARTER6() {
		return A14F_QUARTER6;
	}
	public void setA14F_QUARTER6(BigDecimal a14f_QUARTER6) {
		A14F_QUARTER6 = a14f_QUARTER6;
	}
	public String getA15_PRODUCT() {
		return A15_PRODUCT;
	}
	public void setA15_PRODUCT(String a15_PRODUCT) {
		A15_PRODUCT = a15_PRODUCT;
	}
	public BigDecimal getA15A_QUARTER1() {
		return A15A_QUARTER1;
	}
	public void setA15A_QUARTER1(BigDecimal a15a_QUARTER1) {
		A15A_QUARTER1 = a15a_QUARTER1;
	}
	public BigDecimal getA15B_QUARTER2() {
		return A15B_QUARTER2;
	}
	public void setA15B_QUARTER2(BigDecimal a15b_QUARTER2) {
		A15B_QUARTER2 = a15b_QUARTER2;
	}
	public BigDecimal getA15C_QUARTER3() {
		return A15C_QUARTER3;
	}
	public void setA15C_QUARTER3(BigDecimal a15c_QUARTER3) {
		A15C_QUARTER3 = a15c_QUARTER3;
	}
	public BigDecimal getA15D_QUARTER4() {
		return A15D_QUARTER4;
	}
	public void setA15D_QUARTER4(BigDecimal a15d_QUARTER4) {
		A15D_QUARTER4 = a15d_QUARTER4;
	}
	public BigDecimal getA15E_QUARTER5() {
		return A15E_QUARTER5;
	}
	public void setA15E_QUARTER5(BigDecimal a15e_QUARTER5) {
		A15E_QUARTER5 = a15e_QUARTER5;
	}
	public BigDecimal getA15F_QUARTER6() {
		return A15F_QUARTER6;
	}
	public void setA15F_QUARTER6(BigDecimal a15f_QUARTER6) {
		A15F_QUARTER6 = a15f_QUARTER6;
	}
	public String getA16_PRODUCT() {
		return A16_PRODUCT;
	}
	public void setA16_PRODUCT(String a16_PRODUCT) {
		A16_PRODUCT = a16_PRODUCT;
	}
	public BigDecimal getA16A_QUARTER1() {
		return A16A_QUARTER1;
	}
	public void setA16A_QUARTER1(BigDecimal a16a_QUARTER1) {
		A16A_QUARTER1 = a16a_QUARTER1;
	}
	public BigDecimal getA16B_QUARTER2() {
		return A16B_QUARTER2;
	}
	public void setA16B_QUARTER2(BigDecimal a16b_QUARTER2) {
		A16B_QUARTER2 = a16b_QUARTER2;
	}
	public BigDecimal getA16C_QUARTER3() {
		return A16C_QUARTER3;
	}
	public void setA16C_QUARTER3(BigDecimal a16c_QUARTER3) {
		A16C_QUARTER3 = a16c_QUARTER3;
	}
	public BigDecimal getA16D_QUARTER4() {
		return A16D_QUARTER4;
	}
	public void setA16D_QUARTER4(BigDecimal a16d_QUARTER4) {
		A16D_QUARTER4 = a16d_QUARTER4;
	}
	public BigDecimal getA16E_QUARTER5() {
		return A16E_QUARTER5;
	}
	public void setA16E_QUARTER5(BigDecimal a16e_QUARTER5) {
		A16E_QUARTER5 = a16e_QUARTER5;
	}
	public BigDecimal getA16F_QUARTER6() {
		return A16F_QUARTER6;
	}
	public void setA16F_QUARTER6(BigDecimal a16f_QUARTER6) {
		A16F_QUARTER6 = a16f_QUARTER6;
	}
	public String getA17_PRODUCT() {
		return A17_PRODUCT;
	}
	public void setA17_PRODUCT(String a17_PRODUCT) {
		A17_PRODUCT = a17_PRODUCT;
	}
	public BigDecimal getA17A_QUARTER1() {
		return A17A_QUARTER1;
	}
	public void setA17A_QUARTER1(BigDecimal a17a_QUARTER1) {
		A17A_QUARTER1 = a17a_QUARTER1;
	}
	public BigDecimal getA17B_QUARTER2() {
		return A17B_QUARTER2;
	}
	public void setA17B_QUARTER2(BigDecimal a17b_QUARTER2) {
		A17B_QUARTER2 = a17b_QUARTER2;
	}
	public BigDecimal getA17C_QUARTER3() {
		return A17C_QUARTER3;
	}
	public void setA17C_QUARTER3(BigDecimal a17c_QUARTER3) {
		A17C_QUARTER3 = a17c_QUARTER3;
	}
	public BigDecimal getA17D_QUARTER4() {
		return A17D_QUARTER4;
	}
	public void setA17D_QUARTER4(BigDecimal a17d_QUARTER4) {
		A17D_QUARTER4 = a17d_QUARTER4;
	}
	public BigDecimal getA17E_QUARTER5() {
		return A17E_QUARTER5;
	}
	public void setA17E_QUARTER5(BigDecimal a17e_QUARTER5) {
		A17E_QUARTER5 = a17e_QUARTER5;
	}
	public BigDecimal getA17F_QUARTER6() {
		return A17F_QUARTER6;
	}
	public void setA17F_QUARTER6(BigDecimal a17f_QUARTER6) {
		A17F_QUARTER6 = a17f_QUARTER6;
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


	public T27ORReport(String a1_PRODUCT, BigDecimal a1a_QUARTER1, BigDecimal a1b_QUARTER2, BigDecimal a1c_QUARTER3,
			BigDecimal a1d_QUARTER4, BigDecimal a1e_QUARTER5, BigDecimal a1f_QUARTER6, String a2_PRODUCT,
			BigDecimal a2a_QUARTER1, BigDecimal a2b_QUARTER2, BigDecimal a2c_QUARTER3, BigDecimal a2d_QUARTER4,
			BigDecimal a2e_QUARTER5, BigDecimal a2f_QUARTER6, String a3_PRODUCT, BigDecimal a3a_QUARTER1,
			BigDecimal a3b_QUARTER2, BigDecimal a3c_QUARTER3, BigDecimal a3d_QUARTER4, BigDecimal a3e_QUARTER5,
			BigDecimal a3f_QUARTER6, String a4_PRODUCT, BigDecimal a4a_QUARTER1, BigDecimal a4b_QUARTER2,
			BigDecimal a4c_QUARTER3, BigDecimal a4d_QUARTER4, BigDecimal a4e_QUARTER5, BigDecimal a4f_QUARTER6,
			String a5_PRODUCT, BigDecimal a5a_QUARTER1, BigDecimal a5b_QUARTER2, BigDecimal a5c_QUARTER3,
			BigDecimal a5d_QUARTER4, BigDecimal a5e_QUARTER5, BigDecimal a5f_QUARTER6, String a6_PRODUCT,
			BigDecimal a6a_QUARTER1, BigDecimal a6b_QUARTER2, BigDecimal a6c_QUARTER3, BigDecimal a6d_QUARTER4,
			BigDecimal a6e_QUARTER5, BigDecimal a6f_QUARTER6, String a7_PRODUCT, BigDecimal a7a_QUARTER1,
			BigDecimal a7b_QUARTER2, BigDecimal a7c_QUARTER3, BigDecimal a7d_QUARTER4, BigDecimal a7e_QUARTER5,
			BigDecimal a7f_QUARTER6, String a8_PRODUCT, BigDecimal a8a_QUARTER1, BigDecimal a8b_QUARTER2,
			BigDecimal a8c_QUARTER3, BigDecimal a8d_QUARTER4, BigDecimal a8e_QUARTER5, BigDecimal a8f_QUARTER6,
			String a9_PRODUCT, BigDecimal a9a_QUARTER1, BigDecimal a9b_QUARTER2, BigDecimal a9c_QUARTER3,
			BigDecimal a9d_QUARTER4, BigDecimal a9e_QUARTER5, BigDecimal a9f_QUARTER6, String a10_PRODUCT,
			BigDecimal a10a_QUARTER1, BigDecimal a10b_QUARTER2, BigDecimal a10c_QUARTER3, BigDecimal a10d_QUARTER4,
			BigDecimal a10e_QUARTER5, BigDecimal a10f_QUARTER6, String a11_PRODUCT, BigDecimal a11a_QUARTER1,
			BigDecimal a11b_QUARTER2, BigDecimal a11c_QUARTER3, BigDecimal a11d_QUARTER4, BigDecimal a11e_QUARTER5,
			BigDecimal a11f_QUARTER6, String a12_PRODUCT, BigDecimal a12a_QUARTER1, BigDecimal a12b_QUARTER2,
			BigDecimal a12c_QUARTER3, BigDecimal a12d_QUARTER4, BigDecimal a12e_QUARTER5, BigDecimal a12f_QUARTER6,
			String a13_PRODUCT, BigDecimal a13a_QUARTER1, BigDecimal a13b_QUARTER2, BigDecimal a13c_QUARTER3,
			BigDecimal a13d_QUARTER4, BigDecimal a13e_QUARTER5, BigDecimal a13f_QUARTER6, String a14_PRODUCT,
			BigDecimal a14a_QUARTER1, BigDecimal a14b_QUARTER2, BigDecimal a14c_QUARTER3, BigDecimal a14d_QUARTER4,
			BigDecimal a14e_QUARTER5, BigDecimal a14f_QUARTER6, String a15_PRODUCT, BigDecimal a15a_QUARTER1,
			BigDecimal a15b_QUARTER2, BigDecimal a15c_QUARTER3, BigDecimal a15d_QUARTER4, BigDecimal a15e_QUARTER5,
			BigDecimal a15f_QUARTER6, String a16_PRODUCT, BigDecimal a16a_QUARTER1, BigDecimal a16b_QUARTER2,
			BigDecimal a16c_QUARTER3, BigDecimal a16d_QUARTER4, BigDecimal a16e_QUARTER5, BigDecimal a16f_QUARTER6,
			String a17_PRODUCT, BigDecimal a17a_QUARTER1, BigDecimal a17b_QUARTER2, BigDecimal a17c_QUARTER3,
			BigDecimal a17d_QUARTER4, BigDecimal a17e_QUARTER5, BigDecimal a17f_QUARTER6, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG,
			String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER,
			Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG, String hEADER_1, String hEADER_2,
			String hEADER_3) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1A_QUARTER1 = a1a_QUARTER1;
		A1B_QUARTER2 = a1b_QUARTER2;
		A1C_QUARTER3 = a1c_QUARTER3;
		A1D_QUARTER4 = a1d_QUARTER4;
		A1E_QUARTER5 = a1e_QUARTER5;
		A1F_QUARTER6 = a1f_QUARTER6;
		A2_PRODUCT = a2_PRODUCT;
		A2A_QUARTER1 = a2a_QUARTER1;
		A2B_QUARTER2 = a2b_QUARTER2;
		A2C_QUARTER3 = a2c_QUARTER3;
		A2D_QUARTER4 = a2d_QUARTER4;
		A2E_QUARTER5 = a2e_QUARTER5;
		A2F_QUARTER6 = a2f_QUARTER6;
		A3_PRODUCT = a3_PRODUCT;
		A3A_QUARTER1 = a3a_QUARTER1;
		A3B_QUARTER2 = a3b_QUARTER2;
		A3C_QUARTER3 = a3c_QUARTER3;
		A3D_QUARTER4 = a3d_QUARTER4;
		A3E_QUARTER5 = a3e_QUARTER5;
		A3F_QUARTER6 = a3f_QUARTER6;
		A4_PRODUCT = a4_PRODUCT;
		A4A_QUARTER1 = a4a_QUARTER1;
		A4B_QUARTER2 = a4b_QUARTER2;
		A4C_QUARTER3 = a4c_QUARTER3;
		A4D_QUARTER4 = a4d_QUARTER4;
		A4E_QUARTER5 = a4e_QUARTER5;
		A4F_QUARTER6 = a4f_QUARTER6;
		A5_PRODUCT = a5_PRODUCT;
		A5A_QUARTER1 = a5a_QUARTER1;
		A5B_QUARTER2 = a5b_QUARTER2;
		A5C_QUARTER3 = a5c_QUARTER3;
		A5D_QUARTER4 = a5d_QUARTER4;
		A5E_QUARTER5 = a5e_QUARTER5;
		A5F_QUARTER6 = a5f_QUARTER6;
		A6_PRODUCT = a6_PRODUCT;
		A6A_QUARTER1 = a6a_QUARTER1;
		A6B_QUARTER2 = a6b_QUARTER2;
		A6C_QUARTER3 = a6c_QUARTER3;
		A6D_QUARTER4 = a6d_QUARTER4;
		A6E_QUARTER5 = a6e_QUARTER5;
		A6F_QUARTER6 = a6f_QUARTER6;
		A7_PRODUCT = a7_PRODUCT;
		A7A_QUARTER1 = a7a_QUARTER1;
		A7B_QUARTER2 = a7b_QUARTER2;
		A7C_QUARTER3 = a7c_QUARTER3;
		A7D_QUARTER4 = a7d_QUARTER4;
		A7E_QUARTER5 = a7e_QUARTER5;
		A7F_QUARTER6 = a7f_QUARTER6;
		A8_PRODUCT = a8_PRODUCT;
		A8A_QUARTER1 = a8a_QUARTER1;
		A8B_QUARTER2 = a8b_QUARTER2;
		A8C_QUARTER3 = a8c_QUARTER3;
		A8D_QUARTER4 = a8d_QUARTER4;
		A8E_QUARTER5 = a8e_QUARTER5;
		A8F_QUARTER6 = a8f_QUARTER6;
		A9_PRODUCT = a9_PRODUCT;
		A9A_QUARTER1 = a9a_QUARTER1;
		A9B_QUARTER2 = a9b_QUARTER2;
		A9C_QUARTER3 = a9c_QUARTER3;
		A9D_QUARTER4 = a9d_QUARTER4;
		A9E_QUARTER5 = a9e_QUARTER5;
		A9F_QUARTER6 = a9f_QUARTER6;
		A10_PRODUCT = a10_PRODUCT;
		A10A_QUARTER1 = a10a_QUARTER1;
		A10B_QUARTER2 = a10b_QUARTER2;
		A10C_QUARTER3 = a10c_QUARTER3;
		A10D_QUARTER4 = a10d_QUARTER4;
		A10E_QUARTER5 = a10e_QUARTER5;
		A10F_QUARTER6 = a10f_QUARTER6;
		A11_PRODUCT = a11_PRODUCT;
		A11A_QUARTER1 = a11a_QUARTER1;
		A11B_QUARTER2 = a11b_QUARTER2;
		A11C_QUARTER3 = a11c_QUARTER3;
		A11D_QUARTER4 = a11d_QUARTER4;
		A11E_QUARTER5 = a11e_QUARTER5;
		A11F_QUARTER6 = a11f_QUARTER6;
		A12_PRODUCT = a12_PRODUCT;
		A12A_QUARTER1 = a12a_QUARTER1;
		A12B_QUARTER2 = a12b_QUARTER2;
		A12C_QUARTER3 = a12c_QUARTER3;
		A12D_QUARTER4 = a12d_QUARTER4;
		A12E_QUARTER5 = a12e_QUARTER5;
		A12F_QUARTER6 = a12f_QUARTER6;
		A13_PRODUCT = a13_PRODUCT;
		A13A_QUARTER1 = a13a_QUARTER1;
		A13B_QUARTER2 = a13b_QUARTER2;
		A13C_QUARTER3 = a13c_QUARTER3;
		A13D_QUARTER4 = a13d_QUARTER4;
		A13E_QUARTER5 = a13e_QUARTER5;
		A13F_QUARTER6 = a13f_QUARTER6;
		A14_PRODUCT = a14_PRODUCT;
		A14A_QUARTER1 = a14a_QUARTER1;
		A14B_QUARTER2 = a14b_QUARTER2;
		A14C_QUARTER3 = a14c_QUARTER3;
		A14D_QUARTER4 = a14d_QUARTER4;
		A14E_QUARTER5 = a14e_QUARTER5;
		A14F_QUARTER6 = a14f_QUARTER6;
		A15_PRODUCT = a15_PRODUCT;
		A15A_QUARTER1 = a15a_QUARTER1;
		A15B_QUARTER2 = a15b_QUARTER2;
		A15C_QUARTER3 = a15c_QUARTER3;
		A15D_QUARTER4 = a15d_QUARTER4;
		A15E_QUARTER5 = a15e_QUARTER5;
		A15F_QUARTER6 = a15f_QUARTER6;
		A16_PRODUCT = a16_PRODUCT;
		A16A_QUARTER1 = a16a_QUARTER1;
		A16B_QUARTER2 = a16b_QUARTER2;
		A16C_QUARTER3 = a16c_QUARTER3;
		A16D_QUARTER4 = a16d_QUARTER4;
		A16E_QUARTER5 = a16e_QUARTER5;
		A16F_QUARTER6 = a16f_QUARTER6;
		A17_PRODUCT = a17_PRODUCT;
		A17A_QUARTER1 = a17a_QUARTER1;
		A17B_QUARTER2 = a17b_QUARTER2;
		A17C_QUARTER3 = a17c_QUARTER3;
		A17D_QUARTER4 = a17d_QUARTER4;
		A17E_QUARTER5 = a17e_QUARTER5;
		A17F_QUARTER6 = a17f_QUARTER6;
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
		HEADER_1 = hEADER_1;
		HEADER_2 = hEADER_2;
		HEADER_3 = hEADER_3;
	}
	public T27ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
