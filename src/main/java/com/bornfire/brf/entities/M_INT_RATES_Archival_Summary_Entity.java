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
@Table(name = "BRRS_M_INT_RATES_ARCHIVALTABLE_SUMMARY")
public class M_INT_RATES_Archival_Summary_Entity {
	
	private String	r11_product;
	private BigDecimal	r11_norminal_interest_rate;
	private BigDecimal	r11_average_effective_interest;
	private BigDecimal	r11_volume;
	private String	r12_product;
	private BigDecimal	r12_norminal_interest_rate;
	private BigDecimal	r12_average_effective_interest;
	private BigDecimal	r12_volume;
	private String	r13_product;
	private BigDecimal	r13_norminal_interest_rate;
	private BigDecimal	r13_average_effective_interest;
	private BigDecimal	r13_volume;
	private String	r14_product;
	private BigDecimal	r14_norminal_interest_rate;
	private BigDecimal	r14_average_effective_interest;
	private BigDecimal	r14_volume;
	private String	r15_product;
	private String	r15_norminal_interest_rate;
	private String	r15_average_effective_interest;
	private BigDecimal	r15_volume;
	private String	r16_product;
	private String	r16_norminal_interest_rate;
	private String	r16_average_effective_interest;
	private BigDecimal	r16_volume;
	private String	r17_product;
	private BigDecimal	r17_norminal_interest_rate;
	private BigDecimal	r17_average_effective_interest;
	private BigDecimal	r17_volume;
	private String	r18_product;
	private BigDecimal	r18_norminal_interest_rate;
	private BigDecimal	r18_average_effective_interest;
	private BigDecimal	r18_volume;
	private BigDecimal	r19_norminal_interest_rate;
	private BigDecimal	r19_average_effective_interest;
	private BigDecimal	r19_volume;
	private String	r20_product;
	private BigDecimal	r20_norminal_interest_rate;
	private BigDecimal	r20_average_effective_interest;
	private BigDecimal	r20_volume;
	private String	r21_product;
	private String	r21_norminal_interest_rate;
	private String	r21_average_effective_interest;
	private BigDecimal	r21_volume;
	private String	r22_product;
	private String	r22_norminal_interest_rate;
	private BigDecimal	r22_average_effective_interest;
	private BigDecimal	r22_volume;
	private String	r23_product;
	private String	r23_norminal_interest_rate;
	private BigDecimal	r23_average_effective_interest;
	private BigDecimal	r23_volume;
	private String	r24_product;
	private BigDecimal	r24_norminal_interest_rate;
	private BigDecimal	r24_average_effective_interest;
	private BigDecimal	r24_volume;
	private String	r25_product;
	private BigDecimal	r25_norminal_interest_rate;
	private BigDecimal	r25_average_effective_interest;
	private BigDecimal	r25_volume;
	private String	r26_product;
	private BigDecimal	r26_norminal_interest_rate;
	private BigDecimal	r26_average_effective_interest;
	private BigDecimal	r26_volume;
	private String	r27_product;
	private BigDecimal	r27_norminal_interest_rate;
	private BigDecimal	r27_average_effective_interest;
	private BigDecimal	r27_volume;
	private String	r28_product;
	private BigDecimal	r28_norminal_interest_rate;
	private BigDecimal	r28_average_effective_interest;
	private BigDecimal	r28_volume;
	private String	r29_product;
	private BigDecimal	r29_norminal_interest_rate;
	private BigDecimal	r29_average_effective_interest;
	private BigDecimal	r29_volume;
	private String	r30_product;
	private BigDecimal	r30_norminal_interest_rate;
	private BigDecimal	r30_average_effective_interest;
	private BigDecimal	r30_volume;
	private String	r31_product;
	private BigDecimal	r31_norminal_interest_rate;
	private BigDecimal	r31_average_effective_interest;
	private BigDecimal	r31_volume;
	private String	r32_product;
	private BigDecimal	r32_norminal_interest_rate;
	private BigDecimal	r32_average_effective_interest;
	private BigDecimal	r32_volume;
	private String	r33_product;
	private BigDecimal	r33_norminal_interest_rate;
	private BigDecimal	r33_average_effective_interest;
	private BigDecimal	r33_volume;
	private String	r34_product;
	private BigDecimal	r34_norminal_interest_rate;
	private BigDecimal	r34_average_effective_interest;
	private BigDecimal	r34_volume;
	private String	r35_product;
	private BigDecimal	r35_norminal_interest_rate;
	private BigDecimal	r35_average_effective_interest;
	private BigDecimal	r35_volume;
	private String	r36_product;
	private BigDecimal	r36_norminal_interest_rate;
	private BigDecimal	r36_average_effective_interest;
	private BigDecimal	r36_volume;
	private String	r37_product;
	private BigDecimal	r37_norminal_interest_rate;
	private BigDecimal	r37_average_effective_interest;
	private BigDecimal	r37_volume;
	private String	r38_product;
	private BigDecimal	r38_norminal_interest_rate;
	private BigDecimal	r38_average_effective_interest;
	private BigDecimal	r38_volume;
	private String	r39_product;
	private BigDecimal	r39_norminal_interest_rate;
	private BigDecimal	r39_average_effective_interest;
	private BigDecimal	r39_volume;
	private String	r40_product;
	private BigDecimal	r40_norminal_interest_rate;
	private BigDecimal	r40_average_effective_interest;
	private BigDecimal	r40_volume;
	private String	r41_product;
	private BigDecimal	r41_norminal_interest_rate;
	private BigDecimal	r41_average_effective_interest;
	private BigDecimal	r41_volume;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	report_date;
	private String	report_version;
	private String	report_frequency;
	private String	report_code;
	private String	report_desc;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	public String getR11_product() {
		return r11_product;
	}
	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}
	public BigDecimal getR11_norminal_interest_rate() {
		return r11_norminal_interest_rate;
	}
	public void setR11_norminal_interest_rate(BigDecimal r11_norminal_interest_rate) {
		this.r11_norminal_interest_rate = r11_norminal_interest_rate;
	}
	public BigDecimal getR11_average_effective_interest() {
		return r11_average_effective_interest;
	}
	public void setR11_average_effective_interest(BigDecimal r11_average_effective_interest) {
		this.r11_average_effective_interest = r11_average_effective_interest;
	}
	public BigDecimal getR11_volume() {
		return r11_volume;
	}
	public void setR11_volume(BigDecimal r11_volume) {
		this.r11_volume = r11_volume;
	}
	public String getR12_product() {
		return r12_product;
	}
	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}
	public BigDecimal getR12_norminal_interest_rate() {
		return r12_norminal_interest_rate;
	}
	public void setR12_norminal_interest_rate(BigDecimal r12_norminal_interest_rate) {
		this.r12_norminal_interest_rate = r12_norminal_interest_rate;
	}
	public BigDecimal getR12_average_effective_interest() {
		return r12_average_effective_interest;
	}
	public void setR12_average_effective_interest(BigDecimal r12_average_effective_interest) {
		this.r12_average_effective_interest = r12_average_effective_interest;
	}
	public BigDecimal getR12_volume() {
		return r12_volume;
	}
	public void setR12_volume(BigDecimal r12_volume) {
		this.r12_volume = r12_volume;
	}
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public BigDecimal getR13_norminal_interest_rate() {
		return r13_norminal_interest_rate;
	}
	public void setR13_norminal_interest_rate(BigDecimal r13_norminal_interest_rate) {
		this.r13_norminal_interest_rate = r13_norminal_interest_rate;
	}
	public BigDecimal getR13_average_effective_interest() {
		return r13_average_effective_interest;
	}
	public void setR13_average_effective_interest(BigDecimal r13_average_effective_interest) {
		this.r13_average_effective_interest = r13_average_effective_interest;
	}
	public BigDecimal getR13_volume() {
		return r13_volume;
	}
	public void setR13_volume(BigDecimal r13_volume) {
		this.r13_volume = r13_volume;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public BigDecimal getR14_norminal_interest_rate() {
		return r14_norminal_interest_rate;
	}
	public void setR14_norminal_interest_rate(BigDecimal r14_norminal_interest_rate) {
		this.r14_norminal_interest_rate = r14_norminal_interest_rate;
	}
	public BigDecimal getR14_average_effective_interest() {
		return r14_average_effective_interest;
	}
	public void setR14_average_effective_interest(BigDecimal r14_average_effective_interest) {
		this.r14_average_effective_interest = r14_average_effective_interest;
	}
	public BigDecimal getR14_volume() {
		return r14_volume;
	}
	public void setR14_volume(BigDecimal r14_volume) {
		this.r14_volume = r14_volume;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public String getR15_norminal_interest_rate() {
		return r15_norminal_interest_rate;
	}
	public void setR15_norminal_interest_rate(String r15_norminal_interest_rate) {
		this.r15_norminal_interest_rate = r15_norminal_interest_rate;
	}
	public String getR15_average_effective_interest() {
		return r15_average_effective_interest;
	}
	public void setR15_average_effective_interest(String r15_average_effective_interest) {
		this.r15_average_effective_interest = r15_average_effective_interest;
	}
	public BigDecimal getR15_volume() {
		return r15_volume;
	}
	public void setR15_volume(BigDecimal r15_volume) {
		this.r15_volume = r15_volume;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public String getR16_norminal_interest_rate() {
		return r16_norminal_interest_rate;
	}
	public void setR16_norminal_interest_rate(String r16_norminal_interest_rate) {
		this.r16_norminal_interest_rate = r16_norminal_interest_rate;
	}
	public String getR16_average_effective_interest() {
		return r16_average_effective_interest;
	}
	public void setR16_average_effective_interest(String r16_average_effective_interest) {
		this.r16_average_effective_interest = r16_average_effective_interest;
	}
	public BigDecimal getR16_volume() {
		return r16_volume;
	}
	public void setR16_volume(BigDecimal r16_volume) {
		this.r16_volume = r16_volume;
	}
	public String getR17_product() {
		return r17_product;
	}
	public void setR17_product(String r17_product) {
		this.r17_product = r17_product;
	}
	public BigDecimal getR17_norminal_interest_rate() {
		return r17_norminal_interest_rate;
	}
	public void setR17_norminal_interest_rate(BigDecimal r17_norminal_interest_rate) {
		this.r17_norminal_interest_rate = r17_norminal_interest_rate;
	}
	public BigDecimal getR17_average_effective_interest() {
		return r17_average_effective_interest;
	}
	public void setR17_average_effective_interest(BigDecimal r17_average_effective_interest) {
		this.r17_average_effective_interest = r17_average_effective_interest;
	}
	public BigDecimal getR17_volume() {
		return r17_volume;
	}
	public void setR17_volume(BigDecimal r17_volume) {
		this.r17_volume = r17_volume;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public BigDecimal getR18_norminal_interest_rate() {
		return r18_norminal_interest_rate;
	}
	public void setR18_norminal_interest_rate(BigDecimal r18_norminal_interest_rate) {
		this.r18_norminal_interest_rate = r18_norminal_interest_rate;
	}
	public BigDecimal getR18_average_effective_interest() {
		return r18_average_effective_interest;
	}
	public void setR18_average_effective_interest(BigDecimal r18_average_effective_interest) {
		this.r18_average_effective_interest = r18_average_effective_interest;
	}
	public BigDecimal getR18_volume() {
		return r18_volume;
	}
	public void setR18_volume(BigDecimal r18_volume) {
		this.r18_volume = r18_volume;
	}
	public BigDecimal getR19_norminal_interest_rate() {
		return r19_norminal_interest_rate;
	}
	public void setR19_norminal_interest_rate(BigDecimal r19_norminal_interest_rate) {
		this.r19_norminal_interest_rate = r19_norminal_interest_rate;
	}
	public BigDecimal getR19_average_effective_interest() {
		return r19_average_effective_interest;
	}
	public void setR19_average_effective_interest(BigDecimal r19_average_effective_interest) {
		this.r19_average_effective_interest = r19_average_effective_interest;
	}
	public BigDecimal getR19_volume() {
		return r19_volume;
	}
	public void setR19_volume(BigDecimal r19_volume) {
		this.r19_volume = r19_volume;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public BigDecimal getR20_norminal_interest_rate() {
		return r20_norminal_interest_rate;
	}
	public void setR20_norminal_interest_rate(BigDecimal r20_norminal_interest_rate) {
		this.r20_norminal_interest_rate = r20_norminal_interest_rate;
	}
	public BigDecimal getR20_average_effective_interest() {
		return r20_average_effective_interest;
	}
	public void setR20_average_effective_interest(BigDecimal r20_average_effective_interest) {
		this.r20_average_effective_interest = r20_average_effective_interest;
	}
	public BigDecimal getR20_volume() {
		return r20_volume;
	}
	public void setR20_volume(BigDecimal r20_volume) {
		this.r20_volume = r20_volume;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public String getR21_norminal_interest_rate() {
		return r21_norminal_interest_rate;
	}
	public void setR21_norminal_interest_rate(String r21_norminal_interest_rate) {
		this.r21_norminal_interest_rate = r21_norminal_interest_rate;
	}
	public String getR21_average_effective_interest() {
		return r21_average_effective_interest;
	}
	public void setR21_average_effective_interest(String r21_average_effective_interest) {
		this.r21_average_effective_interest = r21_average_effective_interest;
	}
	public BigDecimal getR21_volume() {
		return r21_volume;
	}
	public void setR21_volume(BigDecimal r21_volume) {
		this.r21_volume = r21_volume;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public String getR22_norminal_interest_rate() {
		return r22_norminal_interest_rate;
	}
	public void setR22_norminal_interest_rate(String r22_norminal_interest_rate) {
		this.r22_norminal_interest_rate = r22_norminal_interest_rate;
	}
	public BigDecimal getR22_average_effective_interest() {
		return r22_average_effective_interest;
	}
	public void setR22_average_effective_interest(BigDecimal r22_average_effective_interest) {
		this.r22_average_effective_interest = r22_average_effective_interest;
	}
	public BigDecimal getR22_volume() {
		return r22_volume;
	}
	public void setR22_volume(BigDecimal r22_volume) {
		this.r22_volume = r22_volume;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public String getR23_norminal_interest_rate() {
		return r23_norminal_interest_rate;
	}
	public void setR23_norminal_interest_rate(String r23_norminal_interest_rate) {
		this.r23_norminal_interest_rate = r23_norminal_interest_rate;
	}
	public BigDecimal getR23_average_effective_interest() {
		return r23_average_effective_interest;
	}
	public void setR23_average_effective_interest(BigDecimal r23_average_effective_interest) {
		this.r23_average_effective_interest = r23_average_effective_interest;
	}
	public BigDecimal getR23_volume() {
		return r23_volume;
	}
	public void setR23_volume(BigDecimal r23_volume) {
		this.r23_volume = r23_volume;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_norminal_interest_rate() {
		return r24_norminal_interest_rate;
	}
	public void setR24_norminal_interest_rate(BigDecimal r24_norminal_interest_rate) {
		this.r24_norminal_interest_rate = r24_norminal_interest_rate;
	}
	public BigDecimal getR24_average_effective_interest() {
		return r24_average_effective_interest;
	}
	public void setR24_average_effective_interest(BigDecimal r24_average_effective_interest) {
		this.r24_average_effective_interest = r24_average_effective_interest;
	}
	public BigDecimal getR24_volume() {
		return r24_volume;
	}
	public void setR24_volume(BigDecimal r24_volume) {
		this.r24_volume = r24_volume;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_norminal_interest_rate() {
		return r25_norminal_interest_rate;
	}
	public void setR25_norminal_interest_rate(BigDecimal r25_norminal_interest_rate) {
		this.r25_norminal_interest_rate = r25_norminal_interest_rate;
	}
	public BigDecimal getR25_average_effective_interest() {
		return r25_average_effective_interest;
	}
	public void setR25_average_effective_interest(BigDecimal r25_average_effective_interest) {
		this.r25_average_effective_interest = r25_average_effective_interest;
	}
	public BigDecimal getR25_volume() {
		return r25_volume;
	}
	public void setR25_volume(BigDecimal r25_volume) {
		this.r25_volume = r25_volume;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public BigDecimal getR26_norminal_interest_rate() {
		return r26_norminal_interest_rate;
	}
	public void setR26_norminal_interest_rate(BigDecimal r26_norminal_interest_rate) {
		this.r26_norminal_interest_rate = r26_norminal_interest_rate;
	}
	public BigDecimal getR26_average_effective_interest() {
		return r26_average_effective_interest;
	}
	public void setR26_average_effective_interest(BigDecimal r26_average_effective_interest) {
		this.r26_average_effective_interest = r26_average_effective_interest;
	}
	public BigDecimal getR26_volume() {
		return r26_volume;
	}
	public void setR26_volume(BigDecimal r26_volume) {
		this.r26_volume = r26_volume;
	}
	public String getR27_product() {
		return r27_product;
	}
	public void setR27_product(String r27_product) {
		this.r27_product = r27_product;
	}
	public BigDecimal getR27_norminal_interest_rate() {
		return r27_norminal_interest_rate;
	}
	public void setR27_norminal_interest_rate(BigDecimal r27_norminal_interest_rate) {
		this.r27_norminal_interest_rate = r27_norminal_interest_rate;
	}
	public BigDecimal getR27_average_effective_interest() {
		return r27_average_effective_interest;
	}
	public void setR27_average_effective_interest(BigDecimal r27_average_effective_interest) {
		this.r27_average_effective_interest = r27_average_effective_interest;
	}
	public BigDecimal getR27_volume() {
		return r27_volume;
	}
	public void setR27_volume(BigDecimal r27_volume) {
		this.r27_volume = r27_volume;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_norminal_interest_rate() {
		return r28_norminal_interest_rate;
	}
	public void setR28_norminal_interest_rate(BigDecimal r28_norminal_interest_rate) {
		this.r28_norminal_interest_rate = r28_norminal_interest_rate;
	}
	public BigDecimal getR28_average_effective_interest() {
		return r28_average_effective_interest;
	}
	public void setR28_average_effective_interest(BigDecimal r28_average_effective_interest) {
		this.r28_average_effective_interest = r28_average_effective_interest;
	}
	public BigDecimal getR28_volume() {
		return r28_volume;
	}
	public void setR28_volume(BigDecimal r28_volume) {
		this.r28_volume = r28_volume;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_norminal_interest_rate() {
		return r29_norminal_interest_rate;
	}
	public void setR29_norminal_interest_rate(BigDecimal r29_norminal_interest_rate) {
		this.r29_norminal_interest_rate = r29_norminal_interest_rate;
	}
	public BigDecimal getR29_average_effective_interest() {
		return r29_average_effective_interest;
	}
	public void setR29_average_effective_interest(BigDecimal r29_average_effective_interest) {
		this.r29_average_effective_interest = r29_average_effective_interest;
	}
	public BigDecimal getR29_volume() {
		return r29_volume;
	}
	public void setR29_volume(BigDecimal r29_volume) {
		this.r29_volume = r29_volume;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_norminal_interest_rate() {
		return r30_norminal_interest_rate;
	}
	public void setR30_norminal_interest_rate(BigDecimal r30_norminal_interest_rate) {
		this.r30_norminal_interest_rate = r30_norminal_interest_rate;
	}
	public BigDecimal getR30_average_effective_interest() {
		return r30_average_effective_interest;
	}
	public void setR30_average_effective_interest(BigDecimal r30_average_effective_interest) {
		this.r30_average_effective_interest = r30_average_effective_interest;
	}
	public BigDecimal getR30_volume() {
		return r30_volume;
	}
	public void setR30_volume(BigDecimal r30_volume) {
		this.r30_volume = r30_volume;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public BigDecimal getR31_norminal_interest_rate() {
		return r31_norminal_interest_rate;
	}
	public void setR31_norminal_interest_rate(BigDecimal r31_norminal_interest_rate) {
		this.r31_norminal_interest_rate = r31_norminal_interest_rate;
	}
	public BigDecimal getR31_average_effective_interest() {
		return r31_average_effective_interest;
	}
	public void setR31_average_effective_interest(BigDecimal r31_average_effective_interest) {
		this.r31_average_effective_interest = r31_average_effective_interest;
	}
	public BigDecimal getR31_volume() {
		return r31_volume;
	}
	public void setR31_volume(BigDecimal r31_volume) {
		this.r31_volume = r31_volume;
	}
	public String getR32_product() {
		return r32_product;
	}
	public void setR32_product(String r32_product) {
		this.r32_product = r32_product;
	}
	public BigDecimal getR32_norminal_interest_rate() {
		return r32_norminal_interest_rate;
	}
	public void setR32_norminal_interest_rate(BigDecimal r32_norminal_interest_rate) {
		this.r32_norminal_interest_rate = r32_norminal_interest_rate;
	}
	public BigDecimal getR32_average_effective_interest() {
		return r32_average_effective_interest;
	}
	public void setR32_average_effective_interest(BigDecimal r32_average_effective_interest) {
		this.r32_average_effective_interest = r32_average_effective_interest;
	}
	public BigDecimal getR32_volume() {
		return r32_volume;
	}
	public void setR32_volume(BigDecimal r32_volume) {
		this.r32_volume = r32_volume;
	}
	public String getR33_product() {
		return r33_product;
	}
	public void setR33_product(String r33_product) {
		this.r33_product = r33_product;
	}
	public BigDecimal getR33_norminal_interest_rate() {
		return r33_norminal_interest_rate;
	}
	public void setR33_norminal_interest_rate(BigDecimal r33_norminal_interest_rate) {
		this.r33_norminal_interest_rate = r33_norminal_interest_rate;
	}
	public BigDecimal getR33_average_effective_interest() {
		return r33_average_effective_interest;
	}
	public void setR33_average_effective_interest(BigDecimal r33_average_effective_interest) {
		this.r33_average_effective_interest = r33_average_effective_interest;
	}
	public BigDecimal getR33_volume() {
		return r33_volume;
	}
	public void setR33_volume(BigDecimal r33_volume) {
		this.r33_volume = r33_volume;
	}
	public String getR34_product() {
		return r34_product;
	}
	public void setR34_product(String r34_product) {
		this.r34_product = r34_product;
	}
	public BigDecimal getR34_norminal_interest_rate() {
		return r34_norminal_interest_rate;
	}
	public void setR34_norminal_interest_rate(BigDecimal r34_norminal_interest_rate) {
		this.r34_norminal_interest_rate = r34_norminal_interest_rate;
	}
	public BigDecimal getR34_average_effective_interest() {
		return r34_average_effective_interest;
	}
	public void setR34_average_effective_interest(BigDecimal r34_average_effective_interest) {
		this.r34_average_effective_interest = r34_average_effective_interest;
	}
	public BigDecimal getR34_volume() {
		return r34_volume;
	}
	public void setR34_volume(BigDecimal r34_volume) {
		this.r34_volume = r34_volume;
	}
	public String getR35_product() {
		return r35_product;
	}
	public void setR35_product(String r35_product) {
		this.r35_product = r35_product;
	}
	public BigDecimal getR35_norminal_interest_rate() {
		return r35_norminal_interest_rate;
	}
	public void setR35_norminal_interest_rate(BigDecimal r35_norminal_interest_rate) {
		this.r35_norminal_interest_rate = r35_norminal_interest_rate;
	}
	public BigDecimal getR35_average_effective_interest() {
		return r35_average_effective_interest;
	}
	public void setR35_average_effective_interest(BigDecimal r35_average_effective_interest) {
		this.r35_average_effective_interest = r35_average_effective_interest;
	}
	public BigDecimal getR35_volume() {
		return r35_volume;
	}
	public void setR35_volume(BigDecimal r35_volume) {
		this.r35_volume = r35_volume;
	}
	public String getR36_product() {
		return r36_product;
	}
	public void setR36_product(String r36_product) {
		this.r36_product = r36_product;
	}
	public BigDecimal getR36_norminal_interest_rate() {
		return r36_norminal_interest_rate;
	}
	public void setR36_norminal_interest_rate(BigDecimal r36_norminal_interest_rate) {
		this.r36_norminal_interest_rate = r36_norminal_interest_rate;
	}
	public BigDecimal getR36_average_effective_interest() {
		return r36_average_effective_interest;
	}
	public void setR36_average_effective_interest(BigDecimal r36_average_effective_interest) {
		this.r36_average_effective_interest = r36_average_effective_interest;
	}
	public BigDecimal getR36_volume() {
		return r36_volume;
	}
	public void setR36_volume(BigDecimal r36_volume) {
		this.r36_volume = r36_volume;
	}
	public String getR37_product() {
		return r37_product;
	}
	public void setR37_product(String r37_product) {
		this.r37_product = r37_product;
	}
	public BigDecimal getR37_norminal_interest_rate() {
		return r37_norminal_interest_rate;
	}
	public void setR37_norminal_interest_rate(BigDecimal r37_norminal_interest_rate) {
		this.r37_norminal_interest_rate = r37_norminal_interest_rate;
	}
	public BigDecimal getR37_average_effective_interest() {
		return r37_average_effective_interest;
	}
	public void setR37_average_effective_interest(BigDecimal r37_average_effective_interest) {
		this.r37_average_effective_interest = r37_average_effective_interest;
	}
	public BigDecimal getR37_volume() {
		return r37_volume;
	}
	public void setR37_volume(BigDecimal r37_volume) {
		this.r37_volume = r37_volume;
	}
	public String getR38_product() {
		return r38_product;
	}
	public void setR38_product(String r38_product) {
		this.r38_product = r38_product;
	}
	public BigDecimal getR38_norminal_interest_rate() {
		return r38_norminal_interest_rate;
	}
	public void setR38_norminal_interest_rate(BigDecimal r38_norminal_interest_rate) {
		this.r38_norminal_interest_rate = r38_norminal_interest_rate;
	}
	public BigDecimal getR38_average_effective_interest() {
		return r38_average_effective_interest;
	}
	public void setR38_average_effective_interest(BigDecimal r38_average_effective_interest) {
		this.r38_average_effective_interest = r38_average_effective_interest;
	}
	public BigDecimal getR38_volume() {
		return r38_volume;
	}
	public void setR38_volume(BigDecimal r38_volume) {
		this.r38_volume = r38_volume;
	}
	public String getR39_product() {
		return r39_product;
	}
	public void setR39_product(String r39_product) {
		this.r39_product = r39_product;
	}
	public BigDecimal getR39_norminal_interest_rate() {
		return r39_norminal_interest_rate;
	}
	public void setR39_norminal_interest_rate(BigDecimal r39_norminal_interest_rate) {
		this.r39_norminal_interest_rate = r39_norminal_interest_rate;
	}
	public BigDecimal getR39_average_effective_interest() {
		return r39_average_effective_interest;
	}
	public void setR39_average_effective_interest(BigDecimal r39_average_effective_interest) {
		this.r39_average_effective_interest = r39_average_effective_interest;
	}
	public BigDecimal getR39_volume() {
		return r39_volume;
	}
	public void setR39_volume(BigDecimal r39_volume) {
		this.r39_volume = r39_volume;
	}
	public String getR40_product() {
		return r40_product;
	}
	public void setR40_product(String r40_product) {
		this.r40_product = r40_product;
	}
	public BigDecimal getR40_norminal_interest_rate() {
		return r40_norminal_interest_rate;
	}
	public void setR40_norminal_interest_rate(BigDecimal r40_norminal_interest_rate) {
		this.r40_norminal_interest_rate = r40_norminal_interest_rate;
	}
	public BigDecimal getR40_average_effective_interest() {
		return r40_average_effective_interest;
	}
	public void setR40_average_effective_interest(BigDecimal r40_average_effective_interest) {
		this.r40_average_effective_interest = r40_average_effective_interest;
	}
	public BigDecimal getR40_volume() {
		return r40_volume;
	}
	public void setR40_volume(BigDecimal r40_volume) {
		this.r40_volume = r40_volume;
	}
	public String getR41_product() {
		return r41_product;
	}
	public void setR41_product(String r41_product) {
		this.r41_product = r41_product;
	}
	public BigDecimal getR41_norminal_interest_rate() {
		return r41_norminal_interest_rate;
	}
	public void setR41_norminal_interest_rate(BigDecimal r41_norminal_interest_rate) {
		this.r41_norminal_interest_rate = r41_norminal_interest_rate;
	}
	public BigDecimal getR41_average_effective_interest() {
		return r41_average_effective_interest;
	}
	public void setR41_average_effective_interest(BigDecimal r41_average_effective_interest) {
		this.r41_average_effective_interest = r41_average_effective_interest;
	}
	public BigDecimal getR41_volume() {
		return r41_volume;
	}
	public void setR41_volume(BigDecimal r41_volume) {
		this.r41_volume = r41_volume;
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
	public M_INT_RATES_Archival_Summary_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
