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
@Table(name="BRS2_TABLE")

public class BRS2_ENTITY {
	private String	r7_product;
	private String	r7_cross_ref;
	private String	r7_f_non;
	private BigDecimal	r7_pru_min_lim;
	private String	r8_product;
	private String	r8_cross_ref;
	private String	r8_f_non;
	private BigDecimal	r8_pru_min_lim;
	private String	r9_product;
	private String	r9_cross_ref;
	private String	r9_f_non;
	private BigDecimal	r9_pru_min_lim;
	private String	r10_product;
	private String	r10_cross_ref;
	private String	r10_f_non;
	private BigDecimal	r10_pru_min_lim;
	private String	r11_product;
	private String	r11_cross_ref;
	private String	r11_f_non;
	private BigDecimal	r11_pru_min_lim;
	private String	r12_product;
	private String	r12_cross_ref;
	private String	r12_f_non;
	private BigDecimal	r12_pru_min_lim;
	private String	r13_product;
	private String	r13_cross_ref;
	private String	r13_f_non;
	private BigDecimal	r13_pru_min_lim;
	private String	r14_product;
	private String	r14_cross_ref;
	private String	r14_f_non;
	private BigDecimal	r14_pru_min_lim;
	private String	r15_product;
	private String	r15_cross_ref;
	private String	r15_f_non;
	private BigDecimal	r15_pru_min_lim;
	private String	r16_product;
	private String	r16_cross_ref;
	private String	r16_f_non;
	private BigDecimal	r16_pru_min_lim;
	private String	r17_product;
	private String	r17_cross_ref;
	private String	r17_f_non;
	private BigDecimal	r17_pru_min_lim;
	private String	r18_product;
	private String	r18_cross_ref;
	private String	r18_f_non;
	private BigDecimal	r18_pru_min_lim;
	private String	r19_product;
	private String	r19_cross_ref;
	private String	r19_f_non;
	private BigDecimal	r19_pru_min_lim;
	private String	r20_product;
	private String	r20_cross_ref;
	private String	r20_f_non;
	private BigDecimal	r20_pru_min_lim;
	private String	r21_product;
	private String	r21_cross_ref;
	private String	r21_f_non;
	private BigDecimal	r21_pru_min_lim;
	private String	r22_product;
	private String	r22_cross_ref;
	private String	r22_f_non;
	private BigDecimal	r22_pru_min_lim;
	private String	r23_product;
	private String	r23_cross_ref;
	private String	r23_f_non;
	private BigDecimal	r23_pru_min_lim;
	private String	r24_product;
	private String	r24_cross_ref;
	private String	r24_f_non;
	private BigDecimal	r24_pru_min_lim;
	private String	r25_product;
	private String	r25_cross_ref;
	private String	r25_f_non;
	private BigDecimal	r25_pru_min_lim;
	private String	r26_product;
	private String	r26_cross_ref;
	private String	r26_f_non;
	private BigDecimal	r26_pru_min_lim;
	private String	r28_product;
	private String	r28_cross_ref;
	private String	r28_f_non;
	private String	r28_pru_min_lim;
	private String	r29_product;
	private String	r29_cross_ref;
	private String	r29_f_non;
	private String	r29_pru_min_lim;
	private String	r30_product;
	private String	r30_cross_ref;
	private String	r30_f_non;
	private String	r30_pru_min_lim;
	private String	r31_product;
	private String	r31_cross_ref;
	private String	r31_f_non;
	private String	r31_pru_min_lim;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	report_date;
	private Date	report_from_date;
	private Date	report_to_date;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	private String	report_code;
	private Date	report_submit_date;
	public String getR7_product() {
		return r7_product;
	}
	public void setR7_product(String r7_product) {
		this.r7_product = r7_product;
	}
	public String getR7_cross_ref() {
		return r7_cross_ref;
	}
	public void setR7_cross_ref(String r7_cross_ref) {
		this.r7_cross_ref = r7_cross_ref;
	}
	public String getR7_f_non() {
		return r7_f_non;
	}
	public void setR7_f_non(String r7_f_non) {
		this.r7_f_non = r7_f_non;
	}
	public BigDecimal getR7_pru_min_lim() {
		return r7_pru_min_lim;
	}
	public void setR7_pru_min_lim(BigDecimal r7_pru_min_lim) {
		this.r7_pru_min_lim = r7_pru_min_lim;
	}
	public String getR8_product() {
		return r8_product;
	}
	public void setR8_product(String r8_product) {
		this.r8_product = r8_product;
	}
	public String getR8_cross_ref() {
		return r8_cross_ref;
	}
	public void setR8_cross_ref(String r8_cross_ref) {
		this.r8_cross_ref = r8_cross_ref;
	}
	public String getR8_f_non() {
		return r8_f_non;
	}
	public void setR8_f_non(String r8_f_non) {
		this.r8_f_non = r8_f_non;
	}
	public BigDecimal getR8_pru_min_lim() {
		return r8_pru_min_lim;
	}
	public void setR8_pru_min_lim(BigDecimal r8_pru_min_lim) {
		this.r8_pru_min_lim = r8_pru_min_lim;
	}
	public String getR9_product() {
		return r9_product;
	}
	public void setR9_product(String r9_product) {
		this.r9_product = r9_product;
	}
	public String getR9_cross_ref() {
		return r9_cross_ref;
	}
	public void setR9_cross_ref(String r9_cross_ref) {
		this.r9_cross_ref = r9_cross_ref;
	}
	public String getR9_f_non() {
		return r9_f_non;
	}
	public void setR9_f_non(String r9_f_non) {
		this.r9_f_non = r9_f_non;
	}
	public BigDecimal getR9_pru_min_lim() {
		return r9_pru_min_lim;
	}
	public void setR9_pru_min_lim(BigDecimal r9_pru_min_lim) {
		this.r9_pru_min_lim = r9_pru_min_lim;
	}
	public String getR10_product() {
		return r10_product;
	}
	public void setR10_product(String r10_product) {
		this.r10_product = r10_product;
	}
	public String getR10_cross_ref() {
		return r10_cross_ref;
	}
	public void setR10_cross_ref(String r10_cross_ref) {
		this.r10_cross_ref = r10_cross_ref;
	}
	public String getR10_f_non() {
		return r10_f_non;
	}
	public void setR10_f_non(String r10_f_non) {
		this.r10_f_non = r10_f_non;
	}
	public BigDecimal getR10_pru_min_lim() {
		return r10_pru_min_lim;
	}
	public void setR10_pru_min_lim(BigDecimal r10_pru_min_lim) {
		this.r10_pru_min_lim = r10_pru_min_lim;
	}
	public String getR11_product() {
		return r11_product;
	}
	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}
	public String getR11_cross_ref() {
		return r11_cross_ref;
	}
	public void setR11_cross_ref(String r11_cross_ref) {
		this.r11_cross_ref = r11_cross_ref;
	}
	public String getR11_f_non() {
		return r11_f_non;
	}
	public void setR11_f_non(String r11_f_non) {
		this.r11_f_non = r11_f_non;
	}
	public BigDecimal getR11_pru_min_lim() {
		return r11_pru_min_lim;
	}
	public void setR11_pru_min_lim(BigDecimal r11_pru_min_lim) {
		this.r11_pru_min_lim = r11_pru_min_lim;
	}
	public String getR12_product() {
		return r12_product;
	}
	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}
	public String getR12_cross_ref() {
		return r12_cross_ref;
	}
	public void setR12_cross_ref(String r12_cross_ref) {
		this.r12_cross_ref = r12_cross_ref;
	}
	public String getR12_f_non() {
		return r12_f_non;
	}
	public void setR12_f_non(String r12_f_non) {
		this.r12_f_non = r12_f_non;
	}
	public BigDecimal getR12_pru_min_lim() {
		return r12_pru_min_lim;
	}
	public void setR12_pru_min_lim(BigDecimal r12_pru_min_lim) {
		this.r12_pru_min_lim = r12_pru_min_lim;
	}
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public String getR13_cross_ref() {
		return r13_cross_ref;
	}
	public void setR13_cross_ref(String r13_cross_ref) {
		this.r13_cross_ref = r13_cross_ref;
	}
	public String getR13_f_non() {
		return r13_f_non;
	}
	public void setR13_f_non(String r13_f_non) {
		this.r13_f_non = r13_f_non;
	}
	public BigDecimal getR13_pru_min_lim() {
		return r13_pru_min_lim;
	}
	public void setR13_pru_min_lim(BigDecimal r13_pru_min_lim) {
		this.r13_pru_min_lim = r13_pru_min_lim;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public String getR14_cross_ref() {
		return r14_cross_ref;
	}
	public void setR14_cross_ref(String r14_cross_ref) {
		this.r14_cross_ref = r14_cross_ref;
	}
	public String getR14_f_non() {
		return r14_f_non;
	}
	public void setR14_f_non(String r14_f_non) {
		this.r14_f_non = r14_f_non;
	}
	public BigDecimal getR14_pru_min_lim() {
		return r14_pru_min_lim;
	}
	public void setR14_pru_min_lim(BigDecimal r14_pru_min_lim) {
		this.r14_pru_min_lim = r14_pru_min_lim;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public String getR15_cross_ref() {
		return r15_cross_ref;
	}
	public void setR15_cross_ref(String r15_cross_ref) {
		this.r15_cross_ref = r15_cross_ref;
	}
	public String getR15_f_non() {
		return r15_f_non;
	}
	public void setR15_f_non(String r15_f_non) {
		this.r15_f_non = r15_f_non;
	}
	public BigDecimal getR15_pru_min_lim() {
		return r15_pru_min_lim;
	}
	public void setR15_pru_min_lim(BigDecimal r15_pru_min_lim) {
		this.r15_pru_min_lim = r15_pru_min_lim;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public String getR16_cross_ref() {
		return r16_cross_ref;
	}
	public void setR16_cross_ref(String r16_cross_ref) {
		this.r16_cross_ref = r16_cross_ref;
	}
	public String getR16_f_non() {
		return r16_f_non;
	}
	public void setR16_f_non(String r16_f_non) {
		this.r16_f_non = r16_f_non;
	}
	public BigDecimal getR16_pru_min_lim() {
		return r16_pru_min_lim;
	}
	public void setR16_pru_min_lim(BigDecimal r16_pru_min_lim) {
		this.r16_pru_min_lim = r16_pru_min_lim;
	}
	public String getR17_product() {
		return r17_product;
	}
	public void setR17_product(String r17_product) {
		this.r17_product = r17_product;
	}
	public String getR17_cross_ref() {
		return r17_cross_ref;
	}
	public void setR17_cross_ref(String r17_cross_ref) {
		this.r17_cross_ref = r17_cross_ref;
	}
	public String getR17_f_non() {
		return r17_f_non;
	}
	public void setR17_f_non(String r17_f_non) {
		this.r17_f_non = r17_f_non;
	}
	public BigDecimal getR17_pru_min_lim() {
		return r17_pru_min_lim;
	}
	public void setR17_pru_min_lim(BigDecimal r17_pru_min_lim) {
		this.r17_pru_min_lim = r17_pru_min_lim;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public String getR18_cross_ref() {
		return r18_cross_ref;
	}
	public void setR18_cross_ref(String r18_cross_ref) {
		this.r18_cross_ref = r18_cross_ref;
	}
	public String getR18_f_non() {
		return r18_f_non;
	}
	public void setR18_f_non(String r18_f_non) {
		this.r18_f_non = r18_f_non;
	}
	public BigDecimal getR18_pru_min_lim() {
		return r18_pru_min_lim;
	}
	public void setR18_pru_min_lim(BigDecimal r18_pru_min_lim) {
		this.r18_pru_min_lim = r18_pru_min_lim;
	}
	public String getR19_product() {
		return r19_product;
	}
	public void setR19_product(String r19_product) {
		this.r19_product = r19_product;
	}
	public String getR19_cross_ref() {
		return r19_cross_ref;
	}
	public void setR19_cross_ref(String r19_cross_ref) {
		this.r19_cross_ref = r19_cross_ref;
	}
	public String getR19_f_non() {
		return r19_f_non;
	}
	public void setR19_f_non(String r19_f_non) {
		this.r19_f_non = r19_f_non;
	}
	public BigDecimal getR19_pru_min_lim() {
		return r19_pru_min_lim;
	}
	public void setR19_pru_min_lim(BigDecimal r19_pru_min_lim) {
		this.r19_pru_min_lim = r19_pru_min_lim;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public String getR20_cross_ref() {
		return r20_cross_ref;
	}
	public void setR20_cross_ref(String r20_cross_ref) {
		this.r20_cross_ref = r20_cross_ref;
	}
	public String getR20_f_non() {
		return r20_f_non;
	}
	public void setR20_f_non(String r20_f_non) {
		this.r20_f_non = r20_f_non;
	}
	public BigDecimal getR20_pru_min_lim() {
		return r20_pru_min_lim;
	}
	public void setR20_pru_min_lim(BigDecimal r20_pru_min_lim) {
		this.r20_pru_min_lim = r20_pru_min_lim;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public String getR21_cross_ref() {
		return r21_cross_ref;
	}
	public void setR21_cross_ref(String r21_cross_ref) {
		this.r21_cross_ref = r21_cross_ref;
	}
	public String getR21_f_non() {
		return r21_f_non;
	}
	public void setR21_f_non(String r21_f_non) {
		this.r21_f_non = r21_f_non;
	}
	public BigDecimal getR21_pru_min_lim() {
		return r21_pru_min_lim;
	}
	public void setR21_pru_min_lim(BigDecimal r21_pru_min_lim) {
		this.r21_pru_min_lim = r21_pru_min_lim;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public String getR22_cross_ref() {
		return r22_cross_ref;
	}
	public void setR22_cross_ref(String r22_cross_ref) {
		this.r22_cross_ref = r22_cross_ref;
	}
	public String getR22_f_non() {
		return r22_f_non;
	}
	public void setR22_f_non(String r22_f_non) {
		this.r22_f_non = r22_f_non;
	}
	public BigDecimal getR22_pru_min_lim() {
		return r22_pru_min_lim;
	}
	public void setR22_pru_min_lim(BigDecimal r22_pru_min_lim) {
		this.r22_pru_min_lim = r22_pru_min_lim;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public String getR23_cross_ref() {
		return r23_cross_ref;
	}
	public void setR23_cross_ref(String r23_cross_ref) {
		this.r23_cross_ref = r23_cross_ref;
	}
	public String getR23_f_non() {
		return r23_f_non;
	}
	public void setR23_f_non(String r23_f_non) {
		this.r23_f_non = r23_f_non;
	}
	public BigDecimal getR23_pru_min_lim() {
		return r23_pru_min_lim;
	}
	public void setR23_pru_min_lim(BigDecimal r23_pru_min_lim) {
		this.r23_pru_min_lim = r23_pru_min_lim;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public String getR24_cross_ref() {
		return r24_cross_ref;
	}
	public void setR24_cross_ref(String r24_cross_ref) {
		this.r24_cross_ref = r24_cross_ref;
	}
	public String getR24_f_non() {
		return r24_f_non;
	}
	public void setR24_f_non(String r24_f_non) {
		this.r24_f_non = r24_f_non;
	}
	public BigDecimal getR24_pru_min_lim() {
		return r24_pru_min_lim;
	}
	public void setR24_pru_min_lim(BigDecimal r24_pru_min_lim) {
		this.r24_pru_min_lim = r24_pru_min_lim;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public String getR25_cross_ref() {
		return r25_cross_ref;
	}
	public void setR25_cross_ref(String r25_cross_ref) {
		this.r25_cross_ref = r25_cross_ref;
	}
	public String getR25_f_non() {
		return r25_f_non;
	}
	public void setR25_f_non(String r25_f_non) {
		this.r25_f_non = r25_f_non;
	}
	public BigDecimal getR25_pru_min_lim() {
		return r25_pru_min_lim;
	}
	public void setR25_pru_min_lim(BigDecimal r25_pru_min_lim) {
		this.r25_pru_min_lim = r25_pru_min_lim;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public String getR26_cross_ref() {
		return r26_cross_ref;
	}
	public void setR26_cross_ref(String r26_cross_ref) {
		this.r26_cross_ref = r26_cross_ref;
	}
	public String getR26_f_non() {
		return r26_f_non;
	}
	public void setR26_f_non(String r26_f_non) {
		this.r26_f_non = r26_f_non;
	}
	public BigDecimal getR26_pru_min_lim() {
		return r26_pru_min_lim;
	}
	public void setR26_pru_min_lim(BigDecimal r26_pru_min_lim) {
		this.r26_pru_min_lim = r26_pru_min_lim;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public String getR28_cross_ref() {
		return r28_cross_ref;
	}
	public void setR28_cross_ref(String r28_cross_ref) {
		this.r28_cross_ref = r28_cross_ref;
	}
	public String getR28_f_non() {
		return r28_f_non;
	}
	public void setR28_f_non(String r28_f_non) {
		this.r28_f_non = r28_f_non;
	}
	public String getR28_pru_min_lim() {
		return r28_pru_min_lim;
	}
	public void setR28_pru_min_lim(String r28_pru_min_lim) {
		this.r28_pru_min_lim = r28_pru_min_lim;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public String getR29_cross_ref() {
		return r29_cross_ref;
	}
	public void setR29_cross_ref(String r29_cross_ref) {
		this.r29_cross_ref = r29_cross_ref;
	}
	public String getR29_f_non() {
		return r29_f_non;
	}
	public void setR29_f_non(String r29_f_non) {
		this.r29_f_non = r29_f_non;
	}
	public String getR29_pru_min_lim() {
		return r29_pru_min_lim;
	}
	public void setR29_pru_min_lim(String r29_pru_min_lim) {
		this.r29_pru_min_lim = r29_pru_min_lim;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public String getR30_cross_ref() {
		return r30_cross_ref;
	}
	public void setR30_cross_ref(String r30_cross_ref) {
		this.r30_cross_ref = r30_cross_ref;
	}
	public String getR30_f_non() {
		return r30_f_non;
	}
	public void setR30_f_non(String r30_f_non) {
		this.r30_f_non = r30_f_non;
	}
	public String getR30_pru_min_lim() {
		return r30_pru_min_lim;
	}
	public void setR30_pru_min_lim(String r30_pru_min_lim) {
		this.r30_pru_min_lim = r30_pru_min_lim;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public String getR31_cross_ref() {
		return r31_cross_ref;
	}
	public void setR31_cross_ref(String r31_cross_ref) {
		this.r31_cross_ref = r31_cross_ref;
	}
	public String getR31_f_non() {
		return r31_f_non;
	}
	public void setR31_f_non(String r31_f_non) {
		this.r31_f_non = r31_f_non;
	}
	public String getR31_pru_min_lim() {
		return r31_pru_min_lim;
	}
	public void setR31_pru_min_lim(String r31_pru_min_lim) {
		this.r31_pru_min_lim = r31_pru_min_lim;
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
	public BRS2_ENTITY() {
		super();
	
	}
	
	

}
