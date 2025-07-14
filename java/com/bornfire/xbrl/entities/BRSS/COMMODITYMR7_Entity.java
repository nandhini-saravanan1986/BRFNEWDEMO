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
@Table(name="COMMODITY_MR7_TABLE")
public class COMMODITYMR7_Entity {
	private String	r13_product;
	private BigDecimal	r13_position_long;
	private BigDecimal	r13_position_short;
	private BigDecimal	r13_delta_position_long;
	private BigDecimal	r13_delta_position_short;
	private BigDecimal	r13_net_position_long;
	private BigDecimal	r13_net_position_short;
	private BigDecimal	r13_within_bands_matched;
	private BigDecimal	r13_within_bands_unmatched;
	private BigDecimal	r13_between_bands_matched;
	private BigDecimal	r13_between_bands_unmatched;
	private BigDecimal	r13_unmatched_revised1;
	private BigDecimal	r13_unmatched_revised2;
	private String	r14_product;
	private BigDecimal	r14_position_long;
	private BigDecimal	r14_position_short;
	private BigDecimal	r14_delta_position_long;
	private BigDecimal	r14_delta_position_short;
	private BigDecimal	r14_net_position_long;
	private BigDecimal	r14_net_position_short;
	private BigDecimal	r14_within_bands_matched;
	private BigDecimal	r14_within_bands_unmatched;
	private BigDecimal	r14_between_bands_matched;
	private BigDecimal	r14_between_bands_unmatched;
	private BigDecimal	r14_unmatched_revised1;
	private BigDecimal	r14_unmatched_revised2;
	private String	r15_product;
	private BigDecimal	r15_position_long;
	private BigDecimal	r15_position_short;
	private BigDecimal	r15_delta_position_long;
	private BigDecimal	r15_delta_position_short;
	private BigDecimal	r15_net_position_long;
	private BigDecimal	r15_net_position_short;
	private BigDecimal	r15_within_bands_matched;
	private BigDecimal	r15_within_bands_unmatched;
	private BigDecimal	r15_between_bands_matched;
	private BigDecimal	r15_between_bands_unmatched;
	private BigDecimal	r15_unmatched_revised1;
	private BigDecimal	r15_unmatched_revised2;
	private String	r16_product;
	private BigDecimal	r16_position_long;
	private BigDecimal	r16_position_short;
	private BigDecimal	r16_delta_position_long;
	private BigDecimal	r16_delta_position_short;
	private BigDecimal	r16_net_position_long;
	private BigDecimal	r16_net_position_short;
	private BigDecimal	r16_within_bands_matched;
	private BigDecimal	r16_within_bands_unmatched;
	private BigDecimal	r16_between_bands_matched;
	private BigDecimal	r16_between_bands_unmatched;
	private BigDecimal	r16_unmatched_revised1;
	private BigDecimal	r16_unmatched_revised2;
	private BigDecimal	r17_net_position_long;
	private BigDecimal	r17_net_position_short;
	private BigDecimal	r17_within_bands_matched;
	private String	r18_product;
	private BigDecimal	r18_position_long;
	private BigDecimal	r18_position_short;
	private BigDecimal	r18_delta_position_long;
	private BigDecimal	r18_delta_position_short;
	private BigDecimal	r18_net_position_long;
	private BigDecimal	r18_net_position_short;
	private BigDecimal	r18_within_bands_matched;
	private BigDecimal	r18_within_bands_unmatched;
	private BigDecimal	r18_between_bands_matched;
	private BigDecimal	r18_between_bands_unmatched;
	private BigDecimal	r18_unmatched_revised1;
	private BigDecimal	r18_unmatched_revised2;
	private String	r19_product;
	private BigDecimal	r19_position_long;
	private BigDecimal	r19_position_short;
	private BigDecimal	r19_delta_position_long;
	private BigDecimal	r19_delta_position_short;
	private BigDecimal	r19_net_position_long;
	private BigDecimal	r19_net_position_short;
	private BigDecimal	r19_within_bands_matched;
	private BigDecimal	r19_within_bands_unmatched;
	private BigDecimal	r19_between_bands_matched;
	private BigDecimal	r19_between_bands_unmatched;
	private BigDecimal	r19_unmatched_revised1;
	private BigDecimal	r19_unmatched_revised2;
	private String	r20_product;
	private BigDecimal	r20_position_long;
	private BigDecimal	r20_position_short;
	private BigDecimal	r20_delta_position_long;
	private BigDecimal	r20_delta_position_short;
	private BigDecimal	r20_net_position_long;
	private BigDecimal	r20_net_position_short;
	private BigDecimal	r20_within_bands_matched;
	private BigDecimal	r20_within_bands_unmatched;
	private BigDecimal	r20_between_bands_matched;
	private BigDecimal	r20_between_bands_unmatched;
	private BigDecimal	r20_unmatched_revised1;
	private BigDecimal	r20_unmatched_revised2;
	private BigDecimal	r21_net_position_long;
	private BigDecimal	r21_net_position_short;
	private BigDecimal	r21_within_bands_matched;
	private String	r22_product;
	private BigDecimal	r22_position_capital_charge;
	private BigDecimal	r22_risk_capital_charge;
	private BigDecimal	r22_capital_requirement;
	private String	r23_product;
	private BigDecimal	r23_within_bands_matched;
	private BigDecimal	r23_position_capital_charge;
	private BigDecimal	r23_risk_capital_charge;
	private BigDecimal	r23_capital_requirement;
	private String	r24_product;
	private BigDecimal	r24_position_capital_charge;
	private BigDecimal	r24_risk_capital_charge;
	private BigDecimal	r24_capital_requirement;
	private String	r25_product;
	private BigDecimal	r25_capital_requirement;
	private String	r28_product;
	private BigDecimal	r28_position_capital_charge;
	private BigDecimal	r28_risk_capital_charge;
	private BigDecimal	r28_capital_requirement;
	private String	r29_product;
	private BigDecimal	r29_position_capital_charge;
	private BigDecimal	r29_risk_capital_charge;
	private BigDecimal	r29_capital_requirement;
	private String	r30_product;
	private BigDecimal	r30_capital_requirement;
	private String	bank_name;
	private String	reporting_date;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date;
	private Date	report_from_date;
	private Date	report_to_date;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	private String	report_code;
	private Date	report_submit_date;
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public BigDecimal getR13_position_long() {
		return r13_position_long;
	}
	public void setR13_position_long(BigDecimal r13_position_long) {
		this.r13_position_long = r13_position_long;
	}
	public BigDecimal getR13_position_short() {
		return r13_position_short;
	}
	public void setR13_position_short(BigDecimal r13_position_short) {
		this.r13_position_short = r13_position_short;
	}
	public BigDecimal getR13_delta_position_long() {
		return r13_delta_position_long;
	}
	public void setR13_delta_position_long(BigDecimal r13_delta_position_long) {
		this.r13_delta_position_long = r13_delta_position_long;
	}
	public BigDecimal getR13_delta_position_short() {
		return r13_delta_position_short;
	}
	public void setR13_delta_position_short(BigDecimal r13_delta_position_short) {
		this.r13_delta_position_short = r13_delta_position_short;
	}
	public BigDecimal getR13_net_position_long() {
		return r13_net_position_long;
	}
	public void setR13_net_position_long(BigDecimal r13_net_position_long) {
		this.r13_net_position_long = r13_net_position_long;
	}
	public BigDecimal getR13_net_position_short() {
		return r13_net_position_short;
	}
	public void setR13_net_position_short(BigDecimal r13_net_position_short) {
		this.r13_net_position_short = r13_net_position_short;
	}
	public BigDecimal getR13_within_bands_matched() {
		return r13_within_bands_matched;
	}
	public void setR13_within_bands_matched(BigDecimal r13_within_bands_matched) {
		this.r13_within_bands_matched = r13_within_bands_matched;
	}
	public BigDecimal getR13_within_bands_unmatched() {
		return r13_within_bands_unmatched;
	}
	public void setR13_within_bands_unmatched(BigDecimal r13_within_bands_unmatched) {
		this.r13_within_bands_unmatched = r13_within_bands_unmatched;
	}
	public BigDecimal getR13_between_bands_matched() {
		return r13_between_bands_matched;
	}
	public void setR13_between_bands_matched(BigDecimal r13_between_bands_matched) {
		this.r13_between_bands_matched = r13_between_bands_matched;
	}
	public BigDecimal getR13_between_bands_unmatched() {
		return r13_between_bands_unmatched;
	}
	public void setR13_between_bands_unmatched(BigDecimal r13_between_bands_unmatched) {
		this.r13_between_bands_unmatched = r13_between_bands_unmatched;
	}
	public BigDecimal getR13_unmatched_revised1() {
		return r13_unmatched_revised1;
	}
	public void setR13_unmatched_revised1(BigDecimal r13_unmatched_revised1) {
		this.r13_unmatched_revised1 = r13_unmatched_revised1;
	}
	public BigDecimal getR13_unmatched_revised2() {
		return r13_unmatched_revised2;
	}
	public void setR13_unmatched_revised2(BigDecimal r13_unmatched_revised2) {
		this.r13_unmatched_revised2 = r13_unmatched_revised2;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public BigDecimal getR14_position_long() {
		return r14_position_long;
	}
	public void setR14_position_long(BigDecimal r14_position_long) {
		this.r14_position_long = r14_position_long;
	}
	public BigDecimal getR14_position_short() {
		return r14_position_short;
	}
	public void setR14_position_short(BigDecimal r14_position_short) {
		this.r14_position_short = r14_position_short;
	}
	public BigDecimal getR14_delta_position_long() {
		return r14_delta_position_long;
	}
	public void setR14_delta_position_long(BigDecimal r14_delta_position_long) {
		this.r14_delta_position_long = r14_delta_position_long;
	}
	public BigDecimal getR14_delta_position_short() {
		return r14_delta_position_short;
	}
	public void setR14_delta_position_short(BigDecimal r14_delta_position_short) {
		this.r14_delta_position_short = r14_delta_position_short;
	}
	public BigDecimal getR14_net_position_long() {
		return r14_net_position_long;
	}
	public void setR14_net_position_long(BigDecimal r14_net_position_long) {
		this.r14_net_position_long = r14_net_position_long;
	}
	public BigDecimal getR14_net_position_short() {
		return r14_net_position_short;
	}
	public void setR14_net_position_short(BigDecimal r14_net_position_short) {
		this.r14_net_position_short = r14_net_position_short;
	}
	public BigDecimal getR14_within_bands_matched() {
		return r14_within_bands_matched;
	}
	public void setR14_within_bands_matched(BigDecimal r14_within_bands_matched) {
		this.r14_within_bands_matched = r14_within_bands_matched;
	}
	public BigDecimal getR14_within_bands_unmatched() {
		return r14_within_bands_unmatched;
	}
	public void setR14_within_bands_unmatched(BigDecimal r14_within_bands_unmatched) {
		this.r14_within_bands_unmatched = r14_within_bands_unmatched;
	}
	public BigDecimal getR14_between_bands_matched() {
		return r14_between_bands_matched;
	}
	public void setR14_between_bands_matched(BigDecimal r14_between_bands_matched) {
		this.r14_between_bands_matched = r14_between_bands_matched;
	}
	public BigDecimal getR14_between_bands_unmatched() {
		return r14_between_bands_unmatched;
	}
	public void setR14_between_bands_unmatched(BigDecimal r14_between_bands_unmatched) {
		this.r14_between_bands_unmatched = r14_between_bands_unmatched;
	}
	public BigDecimal getR14_unmatched_revised1() {
		return r14_unmatched_revised1;
	}
	public void setR14_unmatched_revised1(BigDecimal r14_unmatched_revised1) {
		this.r14_unmatched_revised1 = r14_unmatched_revised1;
	}
	public BigDecimal getR14_unmatched_revised2() {
		return r14_unmatched_revised2;
	}
	public void setR14_unmatched_revised2(BigDecimal r14_unmatched_revised2) {
		this.r14_unmatched_revised2 = r14_unmatched_revised2;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public BigDecimal getR15_position_long() {
		return r15_position_long;
	}
	public void setR15_position_long(BigDecimal r15_position_long) {
		this.r15_position_long = r15_position_long;
	}
	public BigDecimal getR15_position_short() {
		return r15_position_short;
	}
	public void setR15_position_short(BigDecimal r15_position_short) {
		this.r15_position_short = r15_position_short;
	}
	public BigDecimal getR15_delta_position_long() {
		return r15_delta_position_long;
	}
	public void setR15_delta_position_long(BigDecimal r15_delta_position_long) {
		this.r15_delta_position_long = r15_delta_position_long;
	}
	public BigDecimal getR15_delta_position_short() {
		return r15_delta_position_short;
	}
	public void setR15_delta_position_short(BigDecimal r15_delta_position_short) {
		this.r15_delta_position_short = r15_delta_position_short;
	}
	public BigDecimal getR15_net_position_long() {
		return r15_net_position_long;
	}
	public void setR15_net_position_long(BigDecimal r15_net_position_long) {
		this.r15_net_position_long = r15_net_position_long;
	}
	public BigDecimal getR15_net_position_short() {
		return r15_net_position_short;
	}
	public void setR15_net_position_short(BigDecimal r15_net_position_short) {
		this.r15_net_position_short = r15_net_position_short;
	}
	public BigDecimal getR15_within_bands_matched() {
		return r15_within_bands_matched;
	}
	public void setR15_within_bands_matched(BigDecimal r15_within_bands_matched) {
		this.r15_within_bands_matched = r15_within_bands_matched;
	}
	public BigDecimal getR15_within_bands_unmatched() {
		return r15_within_bands_unmatched;
	}
	public void setR15_within_bands_unmatched(BigDecimal r15_within_bands_unmatched) {
		this.r15_within_bands_unmatched = r15_within_bands_unmatched;
	}
	public BigDecimal getR15_between_bands_matched() {
		return r15_between_bands_matched;
	}
	public void setR15_between_bands_matched(BigDecimal r15_between_bands_matched) {
		this.r15_between_bands_matched = r15_between_bands_matched;
	}
	public BigDecimal getR15_between_bands_unmatched() {
		return r15_between_bands_unmatched;
	}
	public void setR15_between_bands_unmatched(BigDecimal r15_between_bands_unmatched) {
		this.r15_between_bands_unmatched = r15_between_bands_unmatched;
	}
	public BigDecimal getR15_unmatched_revised1() {
		return r15_unmatched_revised1;
	}
	public void setR15_unmatched_revised1(BigDecimal r15_unmatched_revised1) {
		this.r15_unmatched_revised1 = r15_unmatched_revised1;
	}
	public BigDecimal getR15_unmatched_revised2() {
		return r15_unmatched_revised2;
	}
	public void setR15_unmatched_revised2(BigDecimal r15_unmatched_revised2) {
		this.r15_unmatched_revised2 = r15_unmatched_revised2;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public BigDecimal getR16_position_long() {
		return r16_position_long;
	}
	public void setR16_position_long(BigDecimal r16_position_long) {
		this.r16_position_long = r16_position_long;
	}
	public BigDecimal getR16_position_short() {
		return r16_position_short;
	}
	public void setR16_position_short(BigDecimal r16_position_short) {
		this.r16_position_short = r16_position_short;
	}
	public BigDecimal getR16_delta_position_long() {
		return r16_delta_position_long;
	}
	public void setR16_delta_position_long(BigDecimal r16_delta_position_long) {
		this.r16_delta_position_long = r16_delta_position_long;
	}
	public BigDecimal getR16_delta_position_short() {
		return r16_delta_position_short;
	}
	public void setR16_delta_position_short(BigDecimal r16_delta_position_short) {
		this.r16_delta_position_short = r16_delta_position_short;
	}
	public BigDecimal getR16_net_position_long() {
		return r16_net_position_long;
	}
	public void setR16_net_position_long(BigDecimal r16_net_position_long) {
		this.r16_net_position_long = r16_net_position_long;
	}
	public BigDecimal getR16_net_position_short() {
		return r16_net_position_short;
	}
	public void setR16_net_position_short(BigDecimal r16_net_position_short) {
		this.r16_net_position_short = r16_net_position_short;
	}
	public BigDecimal getR16_within_bands_matched() {
		return r16_within_bands_matched;
	}
	public void setR16_within_bands_matched(BigDecimal r16_within_bands_matched) {
		this.r16_within_bands_matched = r16_within_bands_matched;
	}
	public BigDecimal getR16_within_bands_unmatched() {
		return r16_within_bands_unmatched;
	}
	public void setR16_within_bands_unmatched(BigDecimal r16_within_bands_unmatched) {
		this.r16_within_bands_unmatched = r16_within_bands_unmatched;
	}
	public BigDecimal getR16_between_bands_matched() {
		return r16_between_bands_matched;
	}
	public void setR16_between_bands_matched(BigDecimal r16_between_bands_matched) {
		this.r16_between_bands_matched = r16_between_bands_matched;
	}
	public BigDecimal getR16_between_bands_unmatched() {
		return r16_between_bands_unmatched;
	}
	public void setR16_between_bands_unmatched(BigDecimal r16_between_bands_unmatched) {
		this.r16_between_bands_unmatched = r16_between_bands_unmatched;
	}
	public BigDecimal getR16_unmatched_revised1() {
		return r16_unmatched_revised1;
	}
	public void setR16_unmatched_revised1(BigDecimal r16_unmatched_revised1) {
		this.r16_unmatched_revised1 = r16_unmatched_revised1;
	}
	public BigDecimal getR16_unmatched_revised2() {
		return r16_unmatched_revised2;
	}
	public void setR16_unmatched_revised2(BigDecimal r16_unmatched_revised2) {
		this.r16_unmatched_revised2 = r16_unmatched_revised2;
	}
	public BigDecimal getR17_net_position_long() {
		return r17_net_position_long;
	}
	public void setR17_net_position_long(BigDecimal r17_net_position_long) {
		this.r17_net_position_long = r17_net_position_long;
	}
	public BigDecimal getR17_net_position_short() {
		return r17_net_position_short;
	}
	public void setR17_net_position_short(BigDecimal r17_net_position_short) {
		this.r17_net_position_short = r17_net_position_short;
	}
	public BigDecimal getR17_within_bands_matched() {
		return r17_within_bands_matched;
	}
	public void setR17_within_bands_matched(BigDecimal r17_within_bands_matched) {
		this.r17_within_bands_matched = r17_within_bands_matched;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public BigDecimal getR18_position_long() {
		return r18_position_long;
	}
	public void setR18_position_long(BigDecimal r18_position_long) {
		this.r18_position_long = r18_position_long;
	}
	public BigDecimal getR18_position_short() {
		return r18_position_short;
	}
	public void setR18_position_short(BigDecimal r18_position_short) {
		this.r18_position_short = r18_position_short;
	}
	public BigDecimal getR18_delta_position_long() {
		return r18_delta_position_long;
	}
	public void setR18_delta_position_long(BigDecimal r18_delta_position_long) {
		this.r18_delta_position_long = r18_delta_position_long;
	}
	public BigDecimal getR18_delta_position_short() {
		return r18_delta_position_short;
	}
	public void setR18_delta_position_short(BigDecimal r18_delta_position_short) {
		this.r18_delta_position_short = r18_delta_position_short;
	}
	public BigDecimal getR18_net_position_long() {
		return r18_net_position_long;
	}
	public void setR18_net_position_long(BigDecimal r18_net_position_long) {
		this.r18_net_position_long = r18_net_position_long;
	}
	public BigDecimal getR18_net_position_short() {
		return r18_net_position_short;
	}
	public void setR18_net_position_short(BigDecimal r18_net_position_short) {
		this.r18_net_position_short = r18_net_position_short;
	}
	public BigDecimal getR18_within_bands_matched() {
		return r18_within_bands_matched;
	}
	public void setR18_within_bands_matched(BigDecimal r18_within_bands_matched) {
		this.r18_within_bands_matched = r18_within_bands_matched;
	}
	public BigDecimal getR18_within_bands_unmatched() {
		return r18_within_bands_unmatched;
	}
	public void setR18_within_bands_unmatched(BigDecimal r18_within_bands_unmatched) {
		this.r18_within_bands_unmatched = r18_within_bands_unmatched;
	}
	public BigDecimal getR18_between_bands_matched() {
		return r18_between_bands_matched;
	}
	public void setR18_between_bands_matched(BigDecimal r18_between_bands_matched) {
		this.r18_between_bands_matched = r18_between_bands_matched;
	}
	public BigDecimal getR18_between_bands_unmatched() {
		return r18_between_bands_unmatched;
	}
	public void setR18_between_bands_unmatched(BigDecimal r18_between_bands_unmatched) {
		this.r18_between_bands_unmatched = r18_between_bands_unmatched;
	}
	public BigDecimal getR18_unmatched_revised1() {
		return r18_unmatched_revised1;
	}
	public void setR18_unmatched_revised1(BigDecimal r18_unmatched_revised1) {
		this.r18_unmatched_revised1 = r18_unmatched_revised1;
	}
	public BigDecimal getR18_unmatched_revised2() {
		return r18_unmatched_revised2;
	}
	public void setR18_unmatched_revised2(BigDecimal r18_unmatched_revised2) {
		this.r18_unmatched_revised2 = r18_unmatched_revised2;
	}
	public String getR19_product() {
		return r19_product;
	}
	public void setR19_product(String r19_product) {
		this.r19_product = r19_product;
	}
	public BigDecimal getR19_position_long() {
		return r19_position_long;
	}
	public void setR19_position_long(BigDecimal r19_position_long) {
		this.r19_position_long = r19_position_long;
	}
	public BigDecimal getR19_position_short() {
		return r19_position_short;
	}
	public void setR19_position_short(BigDecimal r19_position_short) {
		this.r19_position_short = r19_position_short;
	}
	public BigDecimal getR19_delta_position_long() {
		return r19_delta_position_long;
	}
	public void setR19_delta_position_long(BigDecimal r19_delta_position_long) {
		this.r19_delta_position_long = r19_delta_position_long;
	}
	public BigDecimal getR19_delta_position_short() {
		return r19_delta_position_short;
	}
	public void setR19_delta_position_short(BigDecimal r19_delta_position_short) {
		this.r19_delta_position_short = r19_delta_position_short;
	}
	public BigDecimal getR19_net_position_long() {
		return r19_net_position_long;
	}
	public void setR19_net_position_long(BigDecimal r19_net_position_long) {
		this.r19_net_position_long = r19_net_position_long;
	}
	public BigDecimal getR19_net_position_short() {
		return r19_net_position_short;
	}
	public void setR19_net_position_short(BigDecimal r19_net_position_short) {
		this.r19_net_position_short = r19_net_position_short;
	}
	public BigDecimal getR19_within_bands_matched() {
		return r19_within_bands_matched;
	}
	public void setR19_within_bands_matched(BigDecimal r19_within_bands_matched) {
		this.r19_within_bands_matched = r19_within_bands_matched;
	}
	public BigDecimal getR19_within_bands_unmatched() {
		return r19_within_bands_unmatched;
	}
	public void setR19_within_bands_unmatched(BigDecimal r19_within_bands_unmatched) {
		this.r19_within_bands_unmatched = r19_within_bands_unmatched;
	}
	public BigDecimal getR19_between_bands_matched() {
		return r19_between_bands_matched;
	}
	public void setR19_between_bands_matched(BigDecimal r19_between_bands_matched) {
		this.r19_between_bands_matched = r19_between_bands_matched;
	}
	public BigDecimal getR19_between_bands_unmatched() {
		return r19_between_bands_unmatched;
	}
	public void setR19_between_bands_unmatched(BigDecimal r19_between_bands_unmatched) {
		this.r19_between_bands_unmatched = r19_between_bands_unmatched;
	}
	public BigDecimal getR19_unmatched_revised1() {
		return r19_unmatched_revised1;
	}
	public void setR19_unmatched_revised1(BigDecimal r19_unmatched_revised1) {
		this.r19_unmatched_revised1 = r19_unmatched_revised1;
	}
	public BigDecimal getR19_unmatched_revised2() {
		return r19_unmatched_revised2;
	}
	public void setR19_unmatched_revised2(BigDecimal r19_unmatched_revised2) {
		this.r19_unmatched_revised2 = r19_unmatched_revised2;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public BigDecimal getR20_position_long() {
		return r20_position_long;
	}
	public void setR20_position_long(BigDecimal r20_position_long) {
		this.r20_position_long = r20_position_long;
	}
	public BigDecimal getR20_position_short() {
		return r20_position_short;
	}
	public void setR20_position_short(BigDecimal r20_position_short) {
		this.r20_position_short = r20_position_short;
	}
	public BigDecimal getR20_delta_position_long() {
		return r20_delta_position_long;
	}
	public void setR20_delta_position_long(BigDecimal r20_delta_position_long) {
		this.r20_delta_position_long = r20_delta_position_long;
	}
	public BigDecimal getR20_delta_position_short() {
		return r20_delta_position_short;
	}
	public void setR20_delta_position_short(BigDecimal r20_delta_position_short) {
		this.r20_delta_position_short = r20_delta_position_short;
	}
	public BigDecimal getR20_net_position_long() {
		return r20_net_position_long;
	}
	public void setR20_net_position_long(BigDecimal r20_net_position_long) {
		this.r20_net_position_long = r20_net_position_long;
	}
	public BigDecimal getR20_net_position_short() {
		return r20_net_position_short;
	}
	public void setR20_net_position_short(BigDecimal r20_net_position_short) {
		this.r20_net_position_short = r20_net_position_short;
	}
	public BigDecimal getR20_within_bands_matched() {
		return r20_within_bands_matched;
	}
	public void setR20_within_bands_matched(BigDecimal r20_within_bands_matched) {
		this.r20_within_bands_matched = r20_within_bands_matched;
	}
	public BigDecimal getR20_within_bands_unmatched() {
		return r20_within_bands_unmatched;
	}
	public void setR20_within_bands_unmatched(BigDecimal r20_within_bands_unmatched) {
		this.r20_within_bands_unmatched = r20_within_bands_unmatched;
	}
	public BigDecimal getR20_between_bands_matched() {
		return r20_between_bands_matched;
	}
	public void setR20_between_bands_matched(BigDecimal r20_between_bands_matched) {
		this.r20_between_bands_matched = r20_between_bands_matched;
	}
	public BigDecimal getR20_between_bands_unmatched() {
		return r20_between_bands_unmatched;
	}
	public void setR20_between_bands_unmatched(BigDecimal r20_between_bands_unmatched) {
		this.r20_between_bands_unmatched = r20_between_bands_unmatched;
	}
	public BigDecimal getR20_unmatched_revised1() {
		return r20_unmatched_revised1;
	}
	public void setR20_unmatched_revised1(BigDecimal r20_unmatched_revised1) {
		this.r20_unmatched_revised1 = r20_unmatched_revised1;
	}
	public BigDecimal getR20_unmatched_revised2() {
		return r20_unmatched_revised2;
	}
	public void setR20_unmatched_revised2(BigDecimal r20_unmatched_revised2) {
		this.r20_unmatched_revised2 = r20_unmatched_revised2;
	}
	public BigDecimal getR21_net_position_long() {
		return r21_net_position_long;
	}
	public void setR21_net_position_long(BigDecimal r21_net_position_long) {
		this.r21_net_position_long = r21_net_position_long;
	}
	public BigDecimal getR21_net_position_short() {
		return r21_net_position_short;
	}
	public void setR21_net_position_short(BigDecimal r21_net_position_short) {
		this.r21_net_position_short = r21_net_position_short;
	}
	public BigDecimal getR21_within_bands_matched() {
		return r21_within_bands_matched;
	}
	public void setR21_within_bands_matched(BigDecimal r21_within_bands_matched) {
		this.r21_within_bands_matched = r21_within_bands_matched;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public BigDecimal getR22_position_capital_charge() {
		return r22_position_capital_charge;
	}
	public void setR22_position_capital_charge(BigDecimal r22_position_capital_charge) {
		this.r22_position_capital_charge = r22_position_capital_charge;
	}
	public BigDecimal getR22_risk_capital_charge() {
		return r22_risk_capital_charge;
	}
	public void setR22_risk_capital_charge(BigDecimal r22_risk_capital_charge) {
		this.r22_risk_capital_charge = r22_risk_capital_charge;
	}
	public BigDecimal getR22_capital_requirement() {
		return r22_capital_requirement;
	}
	public void setR22_capital_requirement(BigDecimal r22_capital_requirement) {
		this.r22_capital_requirement = r22_capital_requirement;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public BigDecimal getR23_within_bands_matched() {
		return r23_within_bands_matched;
	}
	public void setR23_within_bands_matched(BigDecimal r23_within_bands_matched) {
		this.r23_within_bands_matched = r23_within_bands_matched;
	}
	public BigDecimal getR23_position_capital_charge() {
		return r23_position_capital_charge;
	}
	public void setR23_position_capital_charge(BigDecimal r23_position_capital_charge) {
		this.r23_position_capital_charge = r23_position_capital_charge;
	}
	public BigDecimal getR23_risk_capital_charge() {
		return r23_risk_capital_charge;
	}
	public void setR23_risk_capital_charge(BigDecimal r23_risk_capital_charge) {
		this.r23_risk_capital_charge = r23_risk_capital_charge;
	}
	public BigDecimal getR23_capital_requirement() {
		return r23_capital_requirement;
	}
	public void setR23_capital_requirement(BigDecimal r23_capital_requirement) {
		this.r23_capital_requirement = r23_capital_requirement;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_position_capital_charge() {
		return r24_position_capital_charge;
	}
	public void setR24_position_capital_charge(BigDecimal r24_position_capital_charge) {
		this.r24_position_capital_charge = r24_position_capital_charge;
	}
	public BigDecimal getR24_risk_capital_charge() {
		return r24_risk_capital_charge;
	}
	public void setR24_risk_capital_charge(BigDecimal r24_risk_capital_charge) {
		this.r24_risk_capital_charge = r24_risk_capital_charge;
	}
	public BigDecimal getR24_capital_requirement() {
		return r24_capital_requirement;
	}
	public void setR24_capital_requirement(BigDecimal r24_capital_requirement) {
		this.r24_capital_requirement = r24_capital_requirement;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_capital_requirement() {
		return r25_capital_requirement;
	}
	public void setR25_capital_requirement(BigDecimal r25_capital_requirement) {
		this.r25_capital_requirement = r25_capital_requirement;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_position_capital_charge() {
		return r28_position_capital_charge;
	}
	public void setR28_position_capital_charge(BigDecimal r28_position_capital_charge) {
		this.r28_position_capital_charge = r28_position_capital_charge;
	}
	public BigDecimal getR28_risk_capital_charge() {
		return r28_risk_capital_charge;
	}
	public void setR28_risk_capital_charge(BigDecimal r28_risk_capital_charge) {
		this.r28_risk_capital_charge = r28_risk_capital_charge;
	}
	public BigDecimal getR28_capital_requirement() {
		return r28_capital_requirement;
	}
	public void setR28_capital_requirement(BigDecimal r28_capital_requirement) {
		this.r28_capital_requirement = r28_capital_requirement;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_position_capital_charge() {
		return r29_position_capital_charge;
	}
	public void setR29_position_capital_charge(BigDecimal r29_position_capital_charge) {
		this.r29_position_capital_charge = r29_position_capital_charge;
	}
	public BigDecimal getR29_risk_capital_charge() {
		return r29_risk_capital_charge;
	}
	public void setR29_risk_capital_charge(BigDecimal r29_risk_capital_charge) {
		this.r29_risk_capital_charge = r29_risk_capital_charge;
	}
	public BigDecimal getR29_capital_requirement() {
		return r29_capital_requirement;
	}
	public void setR29_capital_requirement(BigDecimal r29_capital_requirement) {
		this.r29_capital_requirement = r29_capital_requirement;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_capital_requirement() {
		return r30_capital_requirement;
	}
	public void setR30_capital_requirement(BigDecimal r30_capital_requirement) {
		this.r30_capital_requirement = r30_capital_requirement;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getReporting_date() {
		return reporting_date;
	}
	public void setReporting_date(String reporting_date) {
		this.reporting_date = reporting_date;
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
	public COMMODITYMR7_Entity(String r13_product, BigDecimal r13_position_long, BigDecimal r13_position_short,
			BigDecimal r13_delta_position_long, BigDecimal r13_delta_position_short, BigDecimal r13_net_position_long,
			BigDecimal r13_net_position_short, BigDecimal r13_within_bands_matched,
			BigDecimal r13_within_bands_unmatched, BigDecimal r13_between_bands_matched,
			BigDecimal r13_between_bands_unmatched, BigDecimal r13_unmatched_revised1,
			BigDecimal r13_unmatched_revised2, String r14_product, BigDecimal r14_position_long,
			BigDecimal r14_position_short, BigDecimal r14_delta_position_long, BigDecimal r14_delta_position_short,
			BigDecimal r14_net_position_long, BigDecimal r14_net_position_short, BigDecimal r14_within_bands_matched,
			BigDecimal r14_within_bands_unmatched, BigDecimal r14_between_bands_matched,
			BigDecimal r14_between_bands_unmatched, BigDecimal r14_unmatched_revised1,
			BigDecimal r14_unmatched_revised2, String r15_product, BigDecimal r15_position_long,
			BigDecimal r15_position_short, BigDecimal r15_delta_position_long, BigDecimal r15_delta_position_short,
			BigDecimal r15_net_position_long, BigDecimal r15_net_position_short, BigDecimal r15_within_bands_matched,
			BigDecimal r15_within_bands_unmatched, BigDecimal r15_between_bands_matched,
			BigDecimal r15_between_bands_unmatched, BigDecimal r15_unmatched_revised1,
			BigDecimal r15_unmatched_revised2, String r16_product, BigDecimal r16_position_long,
			BigDecimal r16_position_short, BigDecimal r16_delta_position_long, BigDecimal r16_delta_position_short,
			BigDecimal r16_net_position_long, BigDecimal r16_net_position_short, BigDecimal r16_within_bands_matched,
			BigDecimal r16_within_bands_unmatched, BigDecimal r16_between_bands_matched,
			BigDecimal r16_between_bands_unmatched, BigDecimal r16_unmatched_revised1,
			BigDecimal r16_unmatched_revised2, BigDecimal r17_net_position_long, BigDecimal r17_net_position_short,
			BigDecimal r17_within_bands_matched, String r18_product, BigDecimal r18_position_long,
			BigDecimal r18_position_short, BigDecimal r18_delta_position_long, BigDecimal r18_delta_position_short,
			BigDecimal r18_net_position_long, BigDecimal r18_net_position_short, BigDecimal r18_within_bands_matched,
			BigDecimal r18_within_bands_unmatched, BigDecimal r18_between_bands_matched,
			BigDecimal r18_between_bands_unmatched, BigDecimal r18_unmatched_revised1,
			BigDecimal r18_unmatched_revised2, String r19_product, BigDecimal r19_position_long,
			BigDecimal r19_position_short, BigDecimal r19_delta_position_long, BigDecimal r19_delta_position_short,
			BigDecimal r19_net_position_long, BigDecimal r19_net_position_short, BigDecimal r19_within_bands_matched,
			BigDecimal r19_within_bands_unmatched, BigDecimal r19_between_bands_matched,
			BigDecimal r19_between_bands_unmatched, BigDecimal r19_unmatched_revised1,
			BigDecimal r19_unmatched_revised2, String r20_product, BigDecimal r20_position_long,
			BigDecimal r20_position_short, BigDecimal r20_delta_position_long, BigDecimal r20_delta_position_short,
			BigDecimal r20_net_position_long, BigDecimal r20_net_position_short, BigDecimal r20_within_bands_matched,
			BigDecimal r20_within_bands_unmatched, BigDecimal r20_between_bands_matched,
			BigDecimal r20_between_bands_unmatched, BigDecimal r20_unmatched_revised1,
			BigDecimal r20_unmatched_revised2, BigDecimal r21_net_position_long, BigDecimal r21_net_position_short,
			BigDecimal r21_within_bands_matched, String r22_product, BigDecimal r22_position_capital_charge,
			BigDecimal r22_risk_capital_charge, BigDecimal r22_capital_requirement, String r23_product,
			BigDecimal r23_within_bands_matched, BigDecimal r23_position_capital_charge,
			BigDecimal r23_risk_capital_charge, BigDecimal r23_capital_requirement, String r24_product,
			BigDecimal r24_position_capital_charge, BigDecimal r24_risk_capital_charge,
			BigDecimal r24_capital_requirement, String r25_product, BigDecimal r25_capital_requirement,
			String r28_product, BigDecimal r28_position_capital_charge, BigDecimal r28_risk_capital_charge,
			BigDecimal r28_capital_requirement, String r29_product, BigDecimal r29_position_capital_charge,
			BigDecimal r29_risk_capital_charge, BigDecimal r29_capital_requirement, String r30_product,
			BigDecimal r30_capital_requirement, String bank_name, String reporting_date, Date report_date,
			Date report_from_date, Date report_to_date, String entity_flg, String modify_flg, String del_flg,
			String report_code, Date report_submit_date) {
		super();
		this.r13_product = r13_product;
		this.r13_position_long = r13_position_long;
		this.r13_position_short = r13_position_short;
		this.r13_delta_position_long = r13_delta_position_long;
		this.r13_delta_position_short = r13_delta_position_short;
		this.r13_net_position_long = r13_net_position_long;
		this.r13_net_position_short = r13_net_position_short;
		this.r13_within_bands_matched = r13_within_bands_matched;
		this.r13_within_bands_unmatched = r13_within_bands_unmatched;
		this.r13_between_bands_matched = r13_between_bands_matched;
		this.r13_between_bands_unmatched = r13_between_bands_unmatched;
		this.r13_unmatched_revised1 = r13_unmatched_revised1;
		this.r13_unmatched_revised2 = r13_unmatched_revised2;
		this.r14_product = r14_product;
		this.r14_position_long = r14_position_long;
		this.r14_position_short = r14_position_short;
		this.r14_delta_position_long = r14_delta_position_long;
		this.r14_delta_position_short = r14_delta_position_short;
		this.r14_net_position_long = r14_net_position_long;
		this.r14_net_position_short = r14_net_position_short;
		this.r14_within_bands_matched = r14_within_bands_matched;
		this.r14_within_bands_unmatched = r14_within_bands_unmatched;
		this.r14_between_bands_matched = r14_between_bands_matched;
		this.r14_between_bands_unmatched = r14_between_bands_unmatched;
		this.r14_unmatched_revised1 = r14_unmatched_revised1;
		this.r14_unmatched_revised2 = r14_unmatched_revised2;
		this.r15_product = r15_product;
		this.r15_position_long = r15_position_long;
		this.r15_position_short = r15_position_short;
		this.r15_delta_position_long = r15_delta_position_long;
		this.r15_delta_position_short = r15_delta_position_short;
		this.r15_net_position_long = r15_net_position_long;
		this.r15_net_position_short = r15_net_position_short;
		this.r15_within_bands_matched = r15_within_bands_matched;
		this.r15_within_bands_unmatched = r15_within_bands_unmatched;
		this.r15_between_bands_matched = r15_between_bands_matched;
		this.r15_between_bands_unmatched = r15_between_bands_unmatched;
		this.r15_unmatched_revised1 = r15_unmatched_revised1;
		this.r15_unmatched_revised2 = r15_unmatched_revised2;
		this.r16_product = r16_product;
		this.r16_position_long = r16_position_long;
		this.r16_position_short = r16_position_short;
		this.r16_delta_position_long = r16_delta_position_long;
		this.r16_delta_position_short = r16_delta_position_short;
		this.r16_net_position_long = r16_net_position_long;
		this.r16_net_position_short = r16_net_position_short;
		this.r16_within_bands_matched = r16_within_bands_matched;
		this.r16_within_bands_unmatched = r16_within_bands_unmatched;
		this.r16_between_bands_matched = r16_between_bands_matched;
		this.r16_between_bands_unmatched = r16_between_bands_unmatched;
		this.r16_unmatched_revised1 = r16_unmatched_revised1;
		this.r16_unmatched_revised2 = r16_unmatched_revised2;
		this.r17_net_position_long = r17_net_position_long;
		this.r17_net_position_short = r17_net_position_short;
		this.r17_within_bands_matched = r17_within_bands_matched;
		this.r18_product = r18_product;
		this.r18_position_long = r18_position_long;
		this.r18_position_short = r18_position_short;
		this.r18_delta_position_long = r18_delta_position_long;
		this.r18_delta_position_short = r18_delta_position_short;
		this.r18_net_position_long = r18_net_position_long;
		this.r18_net_position_short = r18_net_position_short;
		this.r18_within_bands_matched = r18_within_bands_matched;
		this.r18_within_bands_unmatched = r18_within_bands_unmatched;
		this.r18_between_bands_matched = r18_between_bands_matched;
		this.r18_between_bands_unmatched = r18_between_bands_unmatched;
		this.r18_unmatched_revised1 = r18_unmatched_revised1;
		this.r18_unmatched_revised2 = r18_unmatched_revised2;
		this.r19_product = r19_product;
		this.r19_position_long = r19_position_long;
		this.r19_position_short = r19_position_short;
		this.r19_delta_position_long = r19_delta_position_long;
		this.r19_delta_position_short = r19_delta_position_short;
		this.r19_net_position_long = r19_net_position_long;
		this.r19_net_position_short = r19_net_position_short;
		this.r19_within_bands_matched = r19_within_bands_matched;
		this.r19_within_bands_unmatched = r19_within_bands_unmatched;
		this.r19_between_bands_matched = r19_between_bands_matched;
		this.r19_between_bands_unmatched = r19_between_bands_unmatched;
		this.r19_unmatched_revised1 = r19_unmatched_revised1;
		this.r19_unmatched_revised2 = r19_unmatched_revised2;
		this.r20_product = r20_product;
		this.r20_position_long = r20_position_long;
		this.r20_position_short = r20_position_short;
		this.r20_delta_position_long = r20_delta_position_long;
		this.r20_delta_position_short = r20_delta_position_short;
		this.r20_net_position_long = r20_net_position_long;
		this.r20_net_position_short = r20_net_position_short;
		this.r20_within_bands_matched = r20_within_bands_matched;
		this.r20_within_bands_unmatched = r20_within_bands_unmatched;
		this.r20_between_bands_matched = r20_between_bands_matched;
		this.r20_between_bands_unmatched = r20_between_bands_unmatched;
		this.r20_unmatched_revised1 = r20_unmatched_revised1;
		this.r20_unmatched_revised2 = r20_unmatched_revised2;
		this.r21_net_position_long = r21_net_position_long;
		this.r21_net_position_short = r21_net_position_short;
		this.r21_within_bands_matched = r21_within_bands_matched;
		this.r22_product = r22_product;
		this.r22_position_capital_charge = r22_position_capital_charge;
		this.r22_risk_capital_charge = r22_risk_capital_charge;
		this.r22_capital_requirement = r22_capital_requirement;
		this.r23_product = r23_product;
		this.r23_within_bands_matched = r23_within_bands_matched;
		this.r23_position_capital_charge = r23_position_capital_charge;
		this.r23_risk_capital_charge = r23_risk_capital_charge;
		this.r23_capital_requirement = r23_capital_requirement;
		this.r24_product = r24_product;
		this.r24_position_capital_charge = r24_position_capital_charge;
		this.r24_risk_capital_charge = r24_risk_capital_charge;
		this.r24_capital_requirement = r24_capital_requirement;
		this.r25_product = r25_product;
		this.r25_capital_requirement = r25_capital_requirement;
		this.r28_product = r28_product;
		this.r28_position_capital_charge = r28_position_capital_charge;
		this.r28_risk_capital_charge = r28_risk_capital_charge;
		this.r28_capital_requirement = r28_capital_requirement;
		this.r29_product = r29_product;
		this.r29_position_capital_charge = r29_position_capital_charge;
		this.r29_risk_capital_charge = r29_risk_capital_charge;
		this.r29_capital_requirement = r29_capital_requirement;
		this.r30_product = r30_product;
		this.r30_capital_requirement = r30_capital_requirement;
		this.bank_name = bank_name;
		this.reporting_date = reporting_date;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public COMMODITYMR7_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
