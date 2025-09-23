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
@Table(name = "BRRS_M_LA2_SUMMARYTABLE")
public class M_LA2_Summary_Entity {
private String	r12_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r12_total;

private String	r13_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r13_total;

private String	r14_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r14_total;

private String	r15_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r15_total;

private String	r16_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r16_total;

private String	r17_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r17_total;

private String	r18_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r18_total;

private String	r19_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r19_total;

private String	r20_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r20_total;

private String	r21_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r21_total;

private String	r22_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r22_total;

private String	r23_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r23_total;

private String	r24_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r24_total;

private String	r25_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r25_total;

private String	r26_sec_ana_pub_non_fin_co_ind;
private BigDecimal	r26_total;

@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id

private Date REPORT_DATE;
private String report_version;
private String report_frequency;
private String report_code;
private String report_desc;
private String entity_flg;
private String modify_flg;
private String del_flg;
public String getR12_sec_ana_pub_non_fin_co_ind() {
    return r12_sec_ana_pub_non_fin_co_ind;
}
public void setR12_sec_ana_pub_non_fin_co_ind(String r12_sec_ana_pub_non_fin_co_ind) {
    this.r12_sec_ana_pub_non_fin_co_ind = r12_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR12_total() {
    return r12_total;
}
public void setR12_total(BigDecimal r12_total) {
    this.r12_total = r12_total;
}
public String getR13_sec_ana_pub_non_fin_co_ind() {
    return r13_sec_ana_pub_non_fin_co_ind;
}
public void setR13_sec_ana_pub_non_fin_co_ind(String r13_sec_ana_pub_non_fin_co_ind) {
    this.r13_sec_ana_pub_non_fin_co_ind = r13_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR13_total() {
    return r13_total;
}
public void setR13_total(BigDecimal r13_total) {
    this.r13_total = r13_total;
}
public String getR14_sec_ana_pub_non_fin_co_ind() {
    return r14_sec_ana_pub_non_fin_co_ind;
}
public void setR14_sec_ana_pub_non_fin_co_ind(String r14_sec_ana_pub_non_fin_co_ind) {
    this.r14_sec_ana_pub_non_fin_co_ind = r14_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR14_total() {
    return r14_total;
}
public void setR14_total(BigDecimal r14_total) {
    this.r14_total = r14_total;
}
public String getR15_sec_ana_pub_non_fin_co_ind() {
    return r15_sec_ana_pub_non_fin_co_ind;
}
public void setR15_sec_ana_pub_non_fin_co_ind(String r15_sec_ana_pub_non_fin_co_ind) {
    this.r15_sec_ana_pub_non_fin_co_ind = r15_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR15_total() {
    return r15_total;
}
public void setR15_total(BigDecimal r15_total) {
    this.r15_total = r15_total;
}
public String getR16_sec_ana_pub_non_fin_co_ind() {
    return r16_sec_ana_pub_non_fin_co_ind;
}
public void setR16_sec_ana_pub_non_fin_co_ind(String r16_sec_ana_pub_non_fin_co_ind) {
    this.r16_sec_ana_pub_non_fin_co_ind = r16_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR16_total() {
    return r16_total;
}
public void setR16_total(BigDecimal r16_total) {
    this.r16_total = r16_total;
}
public String getR17_sec_ana_pub_non_fin_co_ind() {
    return r17_sec_ana_pub_non_fin_co_ind;
}
public void setR17_sec_ana_pub_non_fin_co_ind(String r17_sec_ana_pub_non_fin_co_ind) {
    this.r17_sec_ana_pub_non_fin_co_ind = r17_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR17_total() {
    return r17_total;
}
public void setR17_total(BigDecimal r17_total) {
    this.r17_total = r17_total;
}
public String getR18_sec_ana_pub_non_fin_co_ind() {
    return r18_sec_ana_pub_non_fin_co_ind;
}
public void setR18_sec_ana_pub_non_fin_co_ind(String r18_sec_ana_pub_non_fin_co_ind) {
    this.r18_sec_ana_pub_non_fin_co_ind = r18_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR18_total() {
    return r18_total;
}
public void setR18_total(BigDecimal r18_total) {
    this.r18_total = r18_total;
}
public String getR19_sec_ana_pub_non_fin_co_ind() {
    return r19_sec_ana_pub_non_fin_co_ind;
}
public void setR19_sec_ana_pub_non_fin_co_ind(String r19_sec_ana_pub_non_fin_co_ind) {
    this.r19_sec_ana_pub_non_fin_co_ind = r19_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR19_total() {
    return r19_total;
}
public void setR19_total(BigDecimal r19_total) {
    this.r19_total = r19_total;
}
public String getR20_sec_ana_pub_non_fin_co_ind() {
    return r20_sec_ana_pub_non_fin_co_ind;
}
public void setR20_sec_ana_pub_non_fin_co_ind(String r20_sec_ana_pub_non_fin_co_ind) {
    this.r20_sec_ana_pub_non_fin_co_ind = r20_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR20_total() {
    return r20_total;
}
public void setR20_total(BigDecimal r20_total) {
    this.r20_total = r20_total;
}
public String getR21_sec_ana_pub_non_fin_co_ind() {
    return r21_sec_ana_pub_non_fin_co_ind;
}
public void setR21_sec_ana_pub_non_fin_co_ind(String r21_sec_ana_pub_non_fin_co_ind) {
    this.r21_sec_ana_pub_non_fin_co_ind = r21_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR21_total() {
    return r21_total;
}
public void setR21_total(BigDecimal r21_total) {
    this.r21_total = r21_total;
}
public String getR22_sec_ana_pub_non_fin_co_ind() {
    return r22_sec_ana_pub_non_fin_co_ind;
}
public void setR22_sec_ana_pub_non_fin_co_ind(String r22_sec_ana_pub_non_fin_co_ind) {
    this.r22_sec_ana_pub_non_fin_co_ind = r22_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR22_total() {
    return r22_total;
}
public void setR22_total(BigDecimal r22_total) {
    this.r22_total = r22_total;
}
public String getR23_sec_ana_pub_non_fin_co_ind() {
    return r23_sec_ana_pub_non_fin_co_ind;
}
public void setR23_sec_ana_pub_non_fin_co_ind(String r23_sec_ana_pub_non_fin_co_ind) {
    this.r23_sec_ana_pub_non_fin_co_ind = r23_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR23_total() {
    return r23_total;
}
public void setR23_total(BigDecimal r23_total) {
    this.r23_total = r23_total;
}
public String getR24_sec_ana_pub_non_fin_co_ind() {
    return r24_sec_ana_pub_non_fin_co_ind;
}
public void setR24_sec_ana_pub_non_fin_co_ind(String r24_sec_ana_pub_non_fin_co_ind) {
    this.r24_sec_ana_pub_non_fin_co_ind = r24_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR24_total() {
    return r24_total;
}
public void setR24_total(BigDecimal r24_total) {
    this.r24_total = r24_total;
}
public String getR25_sec_ana_pub_non_fin_co_ind() {
    return r25_sec_ana_pub_non_fin_co_ind;
}
public void setR25_sec_ana_pub_non_fin_co_ind(String r25_sec_ana_pub_non_fin_co_ind) {
    this.r25_sec_ana_pub_non_fin_co_ind = r25_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR25_total() {
    return r25_total;
}
public void setR25_total(BigDecimal r25_total) {
    this.r25_total = r25_total;
}
public String getR26_sec_ana_pub_non_fin_co_ind() {
    return r26_sec_ana_pub_non_fin_co_ind;
}
public void setR26_sec_ana_pub_non_fin_co_ind(String r26_sec_ana_pub_non_fin_co_ind) {
    this.r26_sec_ana_pub_non_fin_co_ind = r26_sec_ana_pub_non_fin_co_ind;
}
public BigDecimal getR26_total() {
    return r26_total;
}
public void setR26_total(BigDecimal r26_total) {
    this.r26_total = r26_total;
}
public Date getREPORT_DATE() {
    return REPORT_DATE;
}
public void setREPORT_DATE(Date rEPORT_DATE) {
    REPORT_DATE = rEPORT_DATE;
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
public M_LA2_Summary_Entity() {
    super();
}

   
}
