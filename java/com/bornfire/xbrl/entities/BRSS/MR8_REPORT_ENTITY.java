package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MR8_OPTIONSRISK_TABLE")
public class MR8_REPORT_ENTITY {
	private String r1_product;
	private BigDecimal r1_longcashlongput;
	private BigDecimal r1_shortcashlongcall;
	private BigDecimal r1_marketvalue;
	private BigDecimal r1_sum;
	private BigDecimal r1_productmarketrisk;
	private BigDecimal r1_optioninmoney;
	private BigDecimal r1_capitalcharge;
	private String r2_product;
	private BigDecimal r2_longcashlongput;
	private BigDecimal r2_shortcashlongcall;
	private BigDecimal r2_marketvalue;
	private BigDecimal r2_sum;
	private BigDecimal r2_productmarketrisk;
	private BigDecimal r2_optioninmoney;
	private BigDecimal r2_capitalcharge;
	private String r3_product;
	private BigDecimal r3_longcashlongput;
	private BigDecimal r3_shortcashlongcall;
	private BigDecimal r3_marketvalue;
	private BigDecimal r3_sum;
	private BigDecimal r3_productmarketrisk;
	private BigDecimal r3_optioninmoney;
	private BigDecimal r3_capitalcharge;
	private String r4_product;
	private BigDecimal r4_longcashlongput;
	private BigDecimal r4_shortcashlongcall;
	private BigDecimal r4_marketvalue;
	private BigDecimal r4_sum;
	private BigDecimal r4_productmarketrisk;
	private BigDecimal r4_optioninmoney;
	private BigDecimal r4_capitalcharge;
	private String r5_product;
	private BigDecimal r5_longcashlongput;
	private BigDecimal r5_shortcashlongcall;
	private BigDecimal r5_marketvalue;
	private BigDecimal r5_sum;
	private BigDecimal r5_productmarketrisk;
	private BigDecimal r5_optioninmoney;
	private BigDecimal r5_capitalcharge;
	private String r6_product;
	private BigDecimal r6_longcashlongput;
	private BigDecimal r6_shortcashlongcall;
	private BigDecimal r6_marketvalue;
	private BigDecimal r6_sum;
	private BigDecimal r6_productmarketrisk;
	private BigDecimal r6_optioninmoney;
	private BigDecimal r6_capitalcharge;
	private String r7_product;
	private BigDecimal r7_longcashlongput;
	private BigDecimal r7_shortcashlongcall;
	private BigDecimal r7_marketvalue;
	private BigDecimal r7_sum;
	private BigDecimal r7_productmarketrisk;
	private BigDecimal r7_optioninmoney;
	private BigDecimal r7_capitalcharge;
	private String r8_product;
	private BigDecimal r8_longcashlongput;
	private BigDecimal r8_shortcashlongcall;
	private BigDecimal r8_marketvalue;
	private BigDecimal r8_sum;
	private BigDecimal r8_productmarketrisk;
	private String r8_optioninmoney;
	private BigDecimal r8_capitalcharge;
	private BigDecimal r9_product;
	private BigDecimal r9_longcashlongput;
	private BigDecimal r9_shortcashlongcall;
	private BigDecimal r9_marketvalue;
	private BigDecimal r9_sum;
	private BigDecimal r9_productmarketrisk;
	private BigDecimal r9_optioninmoney;
	private BigDecimal r9_capitalcharge;
	private String r10_product;
	private BigDecimal r10_longcashlongput;
	private BigDecimal r10_shortcashlongcall;
	private BigDecimal r10_marketvalue;
	private BigDecimal r10_sum;
	private BigDecimal r10_productmarketrisk;
	private BigDecimal r10_optioninmoney;
	private BigDecimal r10_capitalcharge;
	private String r11_product;
	private BigDecimal r11_longcashlongput;
	private BigDecimal r11_shortcashlongcall;
	private BigDecimal r11_marketvalue;
	private BigDecimal r11_sum;
	private BigDecimal r11_productmarketrisk;
	private BigDecimal r11_optioninmoney;
	private BigDecimal r11_capitalcharge;
	private String r12_product;
	private BigDecimal r12_longcashlongput;
	private BigDecimal r12_shortcashlongcall;
	private BigDecimal r12_marketvalue;
	private BigDecimal r12_sum;
	private BigDecimal r12_productmarketrisk;
	private BigDecimal r12_optioninmoney;
	private BigDecimal r12_capitalcharge;
	private String r13_product;
	private BigDecimal r13_longcashlongput;
	private BigDecimal r13_shortcashlongcall;
	private BigDecimal r13_marketvalue;
	private BigDecimal r13_sum;
	private BigDecimal r13_productmarketrisk;
	private BigDecimal r13_optioninmoney;
	private BigDecimal r13_capitalcharge;
	@Id
	private Date report_date;
	private Date report_from_date;
	private Date report_to_date;
	private String entity_flg;
	private String modify_flg;
	private String del_flg;
	private String report_code;
	private Date report_submit_date;

	public String getR1_product() {
		return r1_product;
	}

	public void setR1_product(String r1_product) {
		this.r1_product = r1_product;
	}

	public BigDecimal getR1_longcashlongput() {
		return r1_longcashlongput;
	}

	public void setR1_longcashlongput(BigDecimal r1_longcashlongput) {
		this.r1_longcashlongput = r1_longcashlongput;
	}

	public BigDecimal getR1_shortcashlongcall() {
		return r1_shortcashlongcall;
	}

	public void setR1_shortcashlongcall(BigDecimal r1_shortcashlongcall) {
		this.r1_shortcashlongcall = r1_shortcashlongcall;
	}

	public BigDecimal getR1_marketvalue() {
		return r1_marketvalue;
	}

	public void setR1_marketvalue(BigDecimal r1_marketvalue) {
		this.r1_marketvalue = r1_marketvalue;
	}

	public BigDecimal getR1_sum() {
		return r1_sum;
	}

	public void setR1_sum(BigDecimal r1_sum) {
		this.r1_sum = r1_sum;
	}

	public BigDecimal getR1_productmarketrisk() {
		return r1_productmarketrisk;
	}

	public void setR1_productmarketrisk(BigDecimal r1_productmarketrisk) {
		this.r1_productmarketrisk = r1_productmarketrisk;
	}

	public BigDecimal getR1_optioninmoney() {
		return r1_optioninmoney;
	}

	public void setR1_optioninmoney(BigDecimal r1_optioninmoney) {
		this.r1_optioninmoney = r1_optioninmoney;
	}

	public BigDecimal getR1_capitalcharge() {
		return r1_capitalcharge;
	}

	public void setR1_capitalcharge(BigDecimal r1_capitalcharge) {
		this.r1_capitalcharge = r1_capitalcharge;
	}

	public String getR2_product() {
		return r2_product;
	}

	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}

	public BigDecimal getR2_longcashlongput() {
		return r2_longcashlongput;
	}

	public void setR2_longcashlongput(BigDecimal r2_longcashlongput) {
		this.r2_longcashlongput = r2_longcashlongput;
	}

	public BigDecimal getR2_shortcashlongcall() {
		return r2_shortcashlongcall;
	}

	public void setR2_shortcashlongcall(BigDecimal r2_shortcashlongcall) {
		this.r2_shortcashlongcall = r2_shortcashlongcall;
	}

	public BigDecimal getR2_marketvalue() {
		return r2_marketvalue;
	}

	public void setR2_marketvalue(BigDecimal r2_marketvalue) {
		this.r2_marketvalue = r2_marketvalue;
	}

	public BigDecimal getR2_sum() {
		return r2_sum;
	}

	public void setR2_sum(BigDecimal r2_sum) {
		this.r2_sum = r2_sum;
	}

	public BigDecimal getR2_productmarketrisk() {
		return r2_productmarketrisk;
	}

	public void setR2_productmarketrisk(BigDecimal r2_productmarketrisk) {
		this.r2_productmarketrisk = r2_productmarketrisk;
	}

	public BigDecimal getR2_optioninmoney() {
		return r2_optioninmoney;
	}

	public void setR2_optioninmoney(BigDecimal r2_optioninmoney) {
		this.r2_optioninmoney = r2_optioninmoney;
	}

	public BigDecimal getR2_capitalcharge() {
		return r2_capitalcharge;
	}

	public void setR2_capitalcharge(BigDecimal r2_capitalcharge) {
		this.r2_capitalcharge = r2_capitalcharge;
	}

	public String getR3_product() {
		return r3_product;
	}

	public void setR3_product(String r3_product) {
		this.r3_product = r3_product;
	}

	public BigDecimal getR3_longcashlongput() {
		return r3_longcashlongput;
	}

	public void setR3_longcashlongput(BigDecimal r3_longcashlongput) {
		this.r3_longcashlongput = r3_longcashlongput;
	}

	public BigDecimal getR3_shortcashlongcall() {
		return r3_shortcashlongcall;
	}

	public void setR3_shortcashlongcall(BigDecimal r3_shortcashlongcall) {
		this.r3_shortcashlongcall = r3_shortcashlongcall;
	}

	public BigDecimal getR3_marketvalue() {
		return r3_marketvalue;
	}

	public void setR3_marketvalue(BigDecimal r3_marketvalue) {
		this.r3_marketvalue = r3_marketvalue;
	}

	public BigDecimal getR3_sum() {
		return r3_sum;
	}

	public void setR3_sum(BigDecimal r3_sum) {
		this.r3_sum = r3_sum;
	}

	public BigDecimal getR3_productmarketrisk() {
		return r3_productmarketrisk;
	}

	public void setR3_productmarketrisk(BigDecimal r3_productmarketrisk) {
		this.r3_productmarketrisk = r3_productmarketrisk;
	}

	public BigDecimal getR3_optioninmoney() {
		return r3_optioninmoney;
	}

	public void setR3_optioninmoney(BigDecimal r3_optioninmoney) {
		this.r3_optioninmoney = r3_optioninmoney;
	}

	public BigDecimal getR3_capitalcharge() {
		return r3_capitalcharge;
	}

	public void setR3_capitalcharge(BigDecimal r3_capitalcharge) {
		this.r3_capitalcharge = r3_capitalcharge;
	}

	public String getR4_product() {
		return r4_product;
	}

	public void setR4_product(String r4_product) {
		this.r4_product = r4_product;
	}

	public BigDecimal getR4_longcashlongput() {
		return r4_longcashlongput;
	}

	public void setR4_longcashlongput(BigDecimal r4_longcashlongput) {
		this.r4_longcashlongput = r4_longcashlongput;
	}

	public BigDecimal getR4_shortcashlongcall() {
		return r4_shortcashlongcall;
	}

	public void setR4_shortcashlongcall(BigDecimal r4_shortcashlongcall) {
		this.r4_shortcashlongcall = r4_shortcashlongcall;
	}

	public BigDecimal getR4_marketvalue() {
		return r4_marketvalue;
	}

	public void setR4_marketvalue(BigDecimal r4_marketvalue) {
		this.r4_marketvalue = r4_marketvalue;
	}

	public BigDecimal getR4_sum() {
		return r4_sum;
	}

	public void setR4_sum(BigDecimal r4_sum) {
		this.r4_sum = r4_sum;
	}

	public BigDecimal getR4_productmarketrisk() {
		return r4_productmarketrisk;
	}

	public void setR4_productmarketrisk(BigDecimal r4_productmarketrisk) {
		this.r4_productmarketrisk = r4_productmarketrisk;
	}

	public BigDecimal getR4_optioninmoney() {
		return r4_optioninmoney;
	}

	public void setR4_optioninmoney(BigDecimal r4_optioninmoney) {
		this.r4_optioninmoney = r4_optioninmoney;
	}

	public BigDecimal getR4_capitalcharge() {
		return r4_capitalcharge;
	}

	public void setR4_capitalcharge(BigDecimal r4_capitalcharge) {
		this.r4_capitalcharge = r4_capitalcharge;
	}

	public String getR5_product() {
		return r5_product;
	}

	public void setR5_product(String r5_product) {
		this.r5_product = r5_product;
	}

	public BigDecimal getR5_longcashlongput() {
		return r5_longcashlongput;
	}

	public void setR5_longcashlongput(BigDecimal r5_longcashlongput) {
		this.r5_longcashlongput = r5_longcashlongput;
	}

	public BigDecimal getR5_shortcashlongcall() {
		return r5_shortcashlongcall;
	}

	public void setR5_shortcashlongcall(BigDecimal r5_shortcashlongcall) {
		this.r5_shortcashlongcall = r5_shortcashlongcall;
	}

	public BigDecimal getR5_marketvalue() {
		return r5_marketvalue;
	}

	public void setR5_marketvalue(BigDecimal r5_marketvalue) {
		this.r5_marketvalue = r5_marketvalue;
	}

	public BigDecimal getR5_sum() {
		return r5_sum;
	}

	public void setR5_sum(BigDecimal r5_sum) {
		this.r5_sum = r5_sum;
	}

	public BigDecimal getR5_productmarketrisk() {
		return r5_productmarketrisk;
	}

	public void setR5_productmarketrisk(BigDecimal r5_productmarketrisk) {
		this.r5_productmarketrisk = r5_productmarketrisk;
	}

	public BigDecimal getR5_optioninmoney() {
		return r5_optioninmoney;
	}

	public void setR5_optioninmoney(BigDecimal r5_optioninmoney) {
		this.r5_optioninmoney = r5_optioninmoney;
	}

	public BigDecimal getR5_capitalcharge() {
		return r5_capitalcharge;
	}

	public void setR5_capitalcharge(BigDecimal r5_capitalcharge) {
		this.r5_capitalcharge = r5_capitalcharge;
	}

	public String getR6_product() {
		return r6_product;
	}

	public void setR6_product(String r6_product) {
		this.r6_product = r6_product;
	}

	public BigDecimal getR6_longcashlongput() {
		return r6_longcashlongput;
	}

	public void setR6_longcashlongput(BigDecimal r6_longcashlongput) {
		this.r6_longcashlongput = r6_longcashlongput;
	}

	public BigDecimal getR6_shortcashlongcall() {
		return r6_shortcashlongcall;
	}

	public void setR6_shortcashlongcall(BigDecimal r6_shortcashlongcall) {
		this.r6_shortcashlongcall = r6_shortcashlongcall;
	}

	public BigDecimal getR6_marketvalue() {
		return r6_marketvalue;
	}

	public void setR6_marketvalue(BigDecimal r6_marketvalue) {
		this.r6_marketvalue = r6_marketvalue;
	}

	public BigDecimal getR6_sum() {
		return r6_sum;
	}

	public void setR6_sum(BigDecimal r6_sum) {
		this.r6_sum = r6_sum;
	}

	public BigDecimal getR6_productmarketrisk() {
		return r6_productmarketrisk;
	}

	public void setR6_productmarketrisk(BigDecimal r6_productmarketrisk) {
		this.r6_productmarketrisk = r6_productmarketrisk;
	}

	public BigDecimal getR6_optioninmoney() {
		return r6_optioninmoney;
	}

	public void setR6_optioninmoney(BigDecimal r6_optioninmoney) {
		this.r6_optioninmoney = r6_optioninmoney;
	}

	public BigDecimal getR6_capitalcharge() {
		return r6_capitalcharge;
	}

	public void setR6_capitalcharge(BigDecimal r6_capitalcharge) {
		this.r6_capitalcharge = r6_capitalcharge;
	}

	public String getR7_product() {
		return r7_product;
	}

	public void setR7_product(String r7_product) {
		this.r7_product = r7_product;
	}

	public BigDecimal getR7_longcashlongput() {
		return r7_longcashlongput;
	}

	public void setR7_longcashlongput(BigDecimal r7_longcashlongput) {
		this.r7_longcashlongput = r7_longcashlongput;
	}

	public BigDecimal getR7_shortcashlongcall() {
		return r7_shortcashlongcall;
	}

	public void setR7_shortcashlongcall(BigDecimal r7_shortcashlongcall) {
		this.r7_shortcashlongcall = r7_shortcashlongcall;
	}

	public BigDecimal getR7_marketvalue() {
		return r7_marketvalue;
	}

	public void setR7_marketvalue(BigDecimal r7_marketvalue) {
		this.r7_marketvalue = r7_marketvalue;
	}

	public BigDecimal getR7_sum() {
		return r7_sum;
	}

	public void setR7_sum(BigDecimal r7_sum) {
		this.r7_sum = r7_sum;
	}

	public BigDecimal getR7_productmarketrisk() {
		return r7_productmarketrisk;
	}

	public void setR7_productmarketrisk(BigDecimal r7_productmarketrisk) {
		this.r7_productmarketrisk = r7_productmarketrisk;
	}

	public BigDecimal getR7_optioninmoney() {
		return r7_optioninmoney;
	}

	public void setR7_optioninmoney(BigDecimal r7_optioninmoney) {
		this.r7_optioninmoney = r7_optioninmoney;
	}

	public BigDecimal getR7_capitalcharge() {
		return r7_capitalcharge;
	}

	public void setR7_capitalcharge(BigDecimal r7_capitalcharge) {
		this.r7_capitalcharge = r7_capitalcharge;
	}

	public String getR8_product() {
		return r8_product;
	}

	public void setR8_product(String r8_product) {
		this.r8_product = r8_product;
	}

	public BigDecimal getR8_longcashlongput() {
		return r8_longcashlongput;
	}

	public void setR8_longcashlongput(BigDecimal r8_longcashlongput) {
		this.r8_longcashlongput = r8_longcashlongput;
	}

	public BigDecimal getR8_shortcashlongcall() {
		return r8_shortcashlongcall;
	}

	public void setR8_shortcashlongcall(BigDecimal r8_shortcashlongcall) {
		this.r8_shortcashlongcall = r8_shortcashlongcall;
	}

	public BigDecimal getR8_marketvalue() {
		return r8_marketvalue;
	}

	public void setR8_marketvalue(BigDecimal r8_marketvalue) {
		this.r8_marketvalue = r8_marketvalue;
	}

	public BigDecimal getR8_sum() {
		return r8_sum;
	}

	public void setR8_sum(BigDecimal r8_sum) {
		this.r8_sum = r8_sum;
	}

	public BigDecimal getR8_productmarketrisk() {
		return r8_productmarketrisk;
	}

	public void setR8_productmarketrisk(BigDecimal r8_productmarketrisk) {
		this.r8_productmarketrisk = r8_productmarketrisk;
	}

	public String getR8_optioninmoney() {
		return r8_optioninmoney;
	}

	public void setR8_optioninmoney(String r8_optioninmoney) {
		this.r8_optioninmoney = r8_optioninmoney;
	}

	public BigDecimal getR8_capitalcharge() {
		return r8_capitalcharge;
	}

	public void setR8_capitalcharge(BigDecimal r8_capitalcharge) {
		this.r8_capitalcharge = r8_capitalcharge;
	}

	public BigDecimal getR9_product() {
		return r9_product;
	}

	public void setR9_product(BigDecimal r9_product) {
		this.r9_product = r9_product;
	}

	public BigDecimal getR9_longcashlongput() {
		return r9_longcashlongput;
	}

	public void setR9_longcashlongput(BigDecimal r9_longcashlongput) {
		this.r9_longcashlongput = r9_longcashlongput;
	}

	public BigDecimal getR9_shortcashlongcall() {
		return r9_shortcashlongcall;
	}

	public void setR9_shortcashlongcall(BigDecimal r9_shortcashlongcall) {
		this.r9_shortcashlongcall = r9_shortcashlongcall;
	}

	public BigDecimal getR9_marketvalue() {
		return r9_marketvalue;
	}

	public void setR9_marketvalue(BigDecimal r9_marketvalue) {
		this.r9_marketvalue = r9_marketvalue;
	}

	public BigDecimal getR9_sum() {
		return r9_sum;
	}

	public void setR9_sum(BigDecimal r9_sum) {
		this.r9_sum = r9_sum;
	}

	public BigDecimal getR9_productmarketrisk() {
		return r9_productmarketrisk;
	}

	public void setR9_productmarketrisk(BigDecimal r9_productmarketrisk) {
		this.r9_productmarketrisk = r9_productmarketrisk;
	}

	public BigDecimal getR9_optioninmoney() {
		return r9_optioninmoney;
	}

	public void setR9_optioninmoney(BigDecimal r9_optioninmoney) {
		this.r9_optioninmoney = r9_optioninmoney;
	}

	public BigDecimal getR9_capitalcharge() {
		return r9_capitalcharge;
	}

	public void setR9_capitalcharge(BigDecimal r9_capitalcharge) {
		this.r9_capitalcharge = r9_capitalcharge;
	}

	public String getR10_product() {
		return r10_product;
	}

	public void setR10_product(String r10_product) {
		this.r10_product = r10_product;
	}

	public BigDecimal getR10_longcashlongput() {
		return r10_longcashlongput;
	}

	public void setR10_longcashlongput(BigDecimal r10_longcashlongput) {
		this.r10_longcashlongput = r10_longcashlongput;
	}

	public BigDecimal getR10_shortcashlongcall() {
		return r10_shortcashlongcall;
	}

	public void setR10_shortcashlongcall(BigDecimal r10_shortcashlongcall) {
		this.r10_shortcashlongcall = r10_shortcashlongcall;
	}

	public BigDecimal getR10_marketvalue() {
		return r10_marketvalue;
	}

	public void setR10_marketvalue(BigDecimal r10_marketvalue) {
		this.r10_marketvalue = r10_marketvalue;
	}

	public BigDecimal getR10_sum() {
		return r10_sum;
	}

	public void setR10_sum(BigDecimal r10_sum) {
		this.r10_sum = r10_sum;
	}

	public BigDecimal getR10_productmarketrisk() {
		return r10_productmarketrisk;
	}

	public void setR10_productmarketrisk(BigDecimal r10_productmarketrisk) {
		this.r10_productmarketrisk = r10_productmarketrisk;
	}

	public BigDecimal getR10_optioninmoney() {
		return r10_optioninmoney;
	}

	public void setR10_optioninmoney(BigDecimal r10_optioninmoney) {
		this.r10_optioninmoney = r10_optioninmoney;
	}

	public BigDecimal getR10_capitalcharge() {
		return r10_capitalcharge;
	}

	public void setR10_capitalcharge(BigDecimal r10_capitalcharge) {
		this.r10_capitalcharge = r10_capitalcharge;
	}

	public String getR11_product() {
		return r11_product;
	}

	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}

	public BigDecimal getR11_longcashlongput() {
		return r11_longcashlongput;
	}

	public void setR11_longcashlongput(BigDecimal r11_longcashlongput) {
		this.r11_longcashlongput = r11_longcashlongput;
	}

	public BigDecimal getR11_shortcashlongcall() {
		return r11_shortcashlongcall;
	}

	public void setR11_shortcashlongcall(BigDecimal r11_shortcashlongcall) {
		this.r11_shortcashlongcall = r11_shortcashlongcall;
	}

	public BigDecimal getR11_marketvalue() {
		return r11_marketvalue;
	}

	public void setR11_marketvalue(BigDecimal r11_marketvalue) {
		this.r11_marketvalue = r11_marketvalue;
	}

	public BigDecimal getR11_sum() {
		return r11_sum;
	}

	public void setR11_sum(BigDecimal r11_sum) {
		this.r11_sum = r11_sum;
	}

	public BigDecimal getR11_productmarketrisk() {
		return r11_productmarketrisk;
	}

	public void setR11_productmarketrisk(BigDecimal r11_productmarketrisk) {
		this.r11_productmarketrisk = r11_productmarketrisk;
	}

	public BigDecimal getR11_optioninmoney() {
		return r11_optioninmoney;
	}

	public void setR11_optioninmoney(BigDecimal r11_optioninmoney) {
		this.r11_optioninmoney = r11_optioninmoney;
	}

	public BigDecimal getR11_capitalcharge() {
		return r11_capitalcharge;
	}

	public void setR11_capitalcharge(BigDecimal r11_capitalcharge) {
		this.r11_capitalcharge = r11_capitalcharge;
	}

	public String getR12_product() {
		return r12_product;
	}

	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}

	public BigDecimal getR12_longcashlongput() {
		return r12_longcashlongput;
	}

	public void setR12_longcashlongput(BigDecimal r12_longcashlongput) {
		this.r12_longcashlongput = r12_longcashlongput;
	}

	public BigDecimal getR12_shortcashlongcall() {
		return r12_shortcashlongcall;
	}

	public void setR12_shortcashlongcall(BigDecimal r12_shortcashlongcall) {
		this.r12_shortcashlongcall = r12_shortcashlongcall;
	}

	public BigDecimal getR12_marketvalue() {
		return r12_marketvalue;
	}

	public void setR12_marketvalue(BigDecimal r12_marketvalue) {
		this.r12_marketvalue = r12_marketvalue;
	}

	public BigDecimal getR12_sum() {
		return r12_sum;
	}

	public void setR12_sum(BigDecimal r12_sum) {
		this.r12_sum = r12_sum;
	}

	public BigDecimal getR12_productmarketrisk() {
		return r12_productmarketrisk;
	}

	public void setR12_productmarketrisk(BigDecimal r12_productmarketrisk) {
		this.r12_productmarketrisk = r12_productmarketrisk;
	}

	public BigDecimal getR12_optioninmoney() {
		return r12_optioninmoney;
	}

	public void setR12_optioninmoney(BigDecimal r12_optioninmoney) {
		this.r12_optioninmoney = r12_optioninmoney;
	}

	public BigDecimal getR12_capitalcharge() {
		return r12_capitalcharge;
	}

	public void setR12_capitalcharge(BigDecimal r12_capitalcharge) {
		this.r12_capitalcharge = r12_capitalcharge;
	}

	public String getR13_product() {
		return r13_product;
	}

	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}

	public BigDecimal getR13_longcashlongput() {
		return r13_longcashlongput;
	}

	public void setR13_longcashlongput(BigDecimal r13_longcashlongput) {
		this.r13_longcashlongput = r13_longcashlongput;
	}

	public BigDecimal getR13_shortcashlongcall() {
		return r13_shortcashlongcall;
	}

	public void setR13_shortcashlongcall(BigDecimal r13_shortcashlongcall) {
		this.r13_shortcashlongcall = r13_shortcashlongcall;
	}

	public BigDecimal getR13_marketvalue() {
		return r13_marketvalue;
	}

	public void setR13_marketvalue(BigDecimal r13_marketvalue) {
		this.r13_marketvalue = r13_marketvalue;
	}

	public BigDecimal getR13_sum() {
		return r13_sum;
	}

	public void setR13_sum(BigDecimal r13_sum) {
		this.r13_sum = r13_sum;
	}

	public BigDecimal getR13_productmarketrisk() {
		return r13_productmarketrisk;
	}

	public void setR13_productmarketrisk(BigDecimal r13_productmarketrisk) {
		this.r13_productmarketrisk = r13_productmarketrisk;
	}

	public BigDecimal getR13_optioninmoney() {
		return r13_optioninmoney;
	}

	public void setR13_optioninmoney(BigDecimal r13_optioninmoney) {
		this.r13_optioninmoney = r13_optioninmoney;
	}

	public BigDecimal getR13_capitalcharge() {
		return r13_capitalcharge;
	}

	public void setR13_capitalcharge(BigDecimal r13_capitalcharge) {
		this.r13_capitalcharge = r13_capitalcharge;
	}

	public Date getReport_date() {
		return report_date;
	}

	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}

	public Date getReport_from_date() {
		return report_from_date;
	}

	public void setReport_from_date(Date report_from_date) {
		this.report_from_date = report_from_date;
	}

	public Date getReport_to_date() {
		return report_to_date;
	}

	public void setReport_to_date(Date report_to_date) {
		this.report_to_date = report_to_date;
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

	public String getReport_code() {
		return report_code;
	}

	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}

	public Date getReport_submit_date() {
		return report_submit_date;
	}

	public void setReport_submit_date(Date report_submit_date) {
		this.report_submit_date = report_submit_date;
	}

	public MR8_REPORT_ENTITY(String r1_product, BigDecimal r1_longcashlongput, BigDecimal r1_shortcashlongcall,
			BigDecimal r1_marketvalue, BigDecimal r1_sum, BigDecimal r1_productmarketrisk, BigDecimal r1_optioninmoney,
			BigDecimal r1_capitalcharge, String r2_product, BigDecimal r2_longcashlongput,
			BigDecimal r2_shortcashlongcall, BigDecimal r2_marketvalue, BigDecimal r2_sum,
			BigDecimal r2_productmarketrisk, BigDecimal r2_optioninmoney, BigDecimal r2_capitalcharge,
			String r3_product, BigDecimal r3_longcashlongput, BigDecimal r3_shortcashlongcall,
			BigDecimal r3_marketvalue, BigDecimal r3_sum, BigDecimal r3_productmarketrisk, BigDecimal r3_optioninmoney,
			BigDecimal r3_capitalcharge, String r4_product, BigDecimal r4_longcashlongput,
			BigDecimal r4_shortcashlongcall, BigDecimal r4_marketvalue, BigDecimal r4_sum,
			BigDecimal r4_productmarketrisk, BigDecimal r4_optioninmoney, BigDecimal r4_capitalcharge,
			String r5_product, BigDecimal r5_longcashlongput, BigDecimal r5_shortcashlongcall,
			BigDecimal r5_marketvalue, BigDecimal r5_sum, BigDecimal r5_productmarketrisk, BigDecimal r5_optioninmoney,
			BigDecimal r5_capitalcharge, String r6_product, BigDecimal r6_longcashlongput,
			BigDecimal r6_shortcashlongcall, BigDecimal r6_marketvalue, BigDecimal r6_sum,
			BigDecimal r6_productmarketrisk, BigDecimal r6_optioninmoney, BigDecimal r6_capitalcharge,
			String r7_product, BigDecimal r7_longcashlongput, BigDecimal r7_shortcashlongcall,
			BigDecimal r7_marketvalue, BigDecimal r7_sum, BigDecimal r7_productmarketrisk, BigDecimal r7_optioninmoney,
			BigDecimal r7_capitalcharge, String r8_product, BigDecimal r8_longcashlongput,
			BigDecimal r8_shortcashlongcall, BigDecimal r8_marketvalue, BigDecimal r8_sum,
			BigDecimal r8_productmarketrisk, String r8_optioninmoney, BigDecimal r8_capitalcharge,
			BigDecimal r9_product, BigDecimal r9_longcashlongput, BigDecimal r9_shortcashlongcall,
			BigDecimal r9_marketvalue, BigDecimal r9_sum, BigDecimal r9_productmarketrisk, BigDecimal r9_optioninmoney,
			BigDecimal r9_capitalcharge, String r10_product, BigDecimal r10_longcashlongput,
			BigDecimal r10_shortcashlongcall, BigDecimal r10_marketvalue, BigDecimal r10_sum,
			BigDecimal r10_productmarketrisk, BigDecimal r10_optioninmoney, BigDecimal r10_capitalcharge,
			String r11_product, BigDecimal r11_longcashlongput, BigDecimal r11_shortcashlongcall,
			BigDecimal r11_marketvalue, BigDecimal r11_sum, BigDecimal r11_productmarketrisk,
			BigDecimal r11_optioninmoney, BigDecimal r11_capitalcharge, String r12_product,
			BigDecimal r12_longcashlongput, BigDecimal r12_shortcashlongcall, BigDecimal r12_marketvalue,
			BigDecimal r12_sum, BigDecimal r12_productmarketrisk, BigDecimal r12_optioninmoney,
			BigDecimal r12_capitalcharge, String r13_product, BigDecimal r13_longcashlongput,
			BigDecimal r13_shortcashlongcall, BigDecimal r13_marketvalue, BigDecimal r13_sum,
			BigDecimal r13_productmarketrisk, BigDecimal r13_optioninmoney, BigDecimal r13_capitalcharge,
			Date report_date, Date report_from_date, Date report_to_date, String entity_flg, String modify_flg,
			String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r1_product = r1_product;
		this.r1_longcashlongput = r1_longcashlongput;
		this.r1_shortcashlongcall = r1_shortcashlongcall;
		this.r1_marketvalue = r1_marketvalue;
		this.r1_sum = r1_sum;
		this.r1_productmarketrisk = r1_productmarketrisk;
		this.r1_optioninmoney = r1_optioninmoney;
		this.r1_capitalcharge = r1_capitalcharge;
		this.r2_product = r2_product;
		this.r2_longcashlongput = r2_longcashlongput;
		this.r2_shortcashlongcall = r2_shortcashlongcall;
		this.r2_marketvalue = r2_marketvalue;
		this.r2_sum = r2_sum;
		this.r2_productmarketrisk = r2_productmarketrisk;
		this.r2_optioninmoney = r2_optioninmoney;
		this.r2_capitalcharge = r2_capitalcharge;
		this.r3_product = r3_product;
		this.r3_longcashlongput = r3_longcashlongput;
		this.r3_shortcashlongcall = r3_shortcashlongcall;
		this.r3_marketvalue = r3_marketvalue;
		this.r3_sum = r3_sum;
		this.r3_productmarketrisk = r3_productmarketrisk;
		this.r3_optioninmoney = r3_optioninmoney;
		this.r3_capitalcharge = r3_capitalcharge;
		this.r4_product = r4_product;
		this.r4_longcashlongput = r4_longcashlongput;
		this.r4_shortcashlongcall = r4_shortcashlongcall;
		this.r4_marketvalue = r4_marketvalue;
		this.r4_sum = r4_sum;
		this.r4_productmarketrisk = r4_productmarketrisk;
		this.r4_optioninmoney = r4_optioninmoney;
		this.r4_capitalcharge = r4_capitalcharge;
		this.r5_product = r5_product;
		this.r5_longcashlongput = r5_longcashlongput;
		this.r5_shortcashlongcall = r5_shortcashlongcall;
		this.r5_marketvalue = r5_marketvalue;
		this.r5_sum = r5_sum;
		this.r5_productmarketrisk = r5_productmarketrisk;
		this.r5_optioninmoney = r5_optioninmoney;
		this.r5_capitalcharge = r5_capitalcharge;
		this.r6_product = r6_product;
		this.r6_longcashlongput = r6_longcashlongput;
		this.r6_shortcashlongcall = r6_shortcashlongcall;
		this.r6_marketvalue = r6_marketvalue;
		this.r6_sum = r6_sum;
		this.r6_productmarketrisk = r6_productmarketrisk;
		this.r6_optioninmoney = r6_optioninmoney;
		this.r6_capitalcharge = r6_capitalcharge;
		this.r7_product = r7_product;
		this.r7_longcashlongput = r7_longcashlongput;
		this.r7_shortcashlongcall = r7_shortcashlongcall;
		this.r7_marketvalue = r7_marketvalue;
		this.r7_sum = r7_sum;
		this.r7_productmarketrisk = r7_productmarketrisk;
		this.r7_optioninmoney = r7_optioninmoney;
		this.r7_capitalcharge = r7_capitalcharge;
		this.r8_product = r8_product;
		this.r8_longcashlongput = r8_longcashlongput;
		this.r8_shortcashlongcall = r8_shortcashlongcall;
		this.r8_marketvalue = r8_marketvalue;
		this.r8_sum = r8_sum;
		this.r8_productmarketrisk = r8_productmarketrisk;
		this.r8_optioninmoney = r8_optioninmoney;
		this.r8_capitalcharge = r8_capitalcharge;
		this.r9_product = r9_product;
		this.r9_longcashlongput = r9_longcashlongput;
		this.r9_shortcashlongcall = r9_shortcashlongcall;
		this.r9_marketvalue = r9_marketvalue;
		this.r9_sum = r9_sum;
		this.r9_productmarketrisk = r9_productmarketrisk;
		this.r9_optioninmoney = r9_optioninmoney;
		this.r9_capitalcharge = r9_capitalcharge;
		this.r10_product = r10_product;
		this.r10_longcashlongput = r10_longcashlongput;
		this.r10_shortcashlongcall = r10_shortcashlongcall;
		this.r10_marketvalue = r10_marketvalue;
		this.r10_sum = r10_sum;
		this.r10_productmarketrisk = r10_productmarketrisk;
		this.r10_optioninmoney = r10_optioninmoney;
		this.r10_capitalcharge = r10_capitalcharge;
		this.r11_product = r11_product;
		this.r11_longcashlongput = r11_longcashlongput;
		this.r11_shortcashlongcall = r11_shortcashlongcall;
		this.r11_marketvalue = r11_marketvalue;
		this.r11_sum = r11_sum;
		this.r11_productmarketrisk = r11_productmarketrisk;
		this.r11_optioninmoney = r11_optioninmoney;
		this.r11_capitalcharge = r11_capitalcharge;
		this.r12_product = r12_product;
		this.r12_longcashlongput = r12_longcashlongput;
		this.r12_shortcashlongcall = r12_shortcashlongcall;
		this.r12_marketvalue = r12_marketvalue;
		this.r12_sum = r12_sum;
		this.r12_productmarketrisk = r12_productmarketrisk;
		this.r12_optioninmoney = r12_optioninmoney;
		this.r12_capitalcharge = r12_capitalcharge;
		this.r13_product = r13_product;
		this.r13_longcashlongput = r13_longcashlongput;
		this.r13_shortcashlongcall = r13_shortcashlongcall;
		this.r13_marketvalue = r13_marketvalue;
		this.r13_sum = r13_sum;
		this.r13_productmarketrisk = r13_productmarketrisk;
		this.r13_optioninmoney = r13_optioninmoney;
		this.r13_capitalcharge = r13_capitalcharge;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}

	public MR8_REPORT_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}

}
