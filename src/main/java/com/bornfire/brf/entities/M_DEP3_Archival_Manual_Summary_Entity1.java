
    
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
@Table(name = "BRRS_M_DEP3_ARCHIVALTABLE_MANUAL_SUMMARY1")
public class M_DEP3_Archival_Manual_Summary_Entity1 {

private BigDecimal	r11_ex_rate_buy;
private BigDecimal	r11_ex_rate_mid;
private BigDecimal	r11_ex_rate_sell;
private BigDecimal	r11_notice_0to31;
private BigDecimal	r11_notice_32to88;
private BigDecimal	r11_cer_of_depo;


private BigDecimal	r12_ex_rate_buy;
private BigDecimal	r12_ex_rate_mid;
private BigDecimal	r12_ex_rate_sell;
private BigDecimal	r12_notice_0to31;
private BigDecimal	r12_notice_32to88;
private BigDecimal	r12_cer_of_depo;

private BigDecimal	r13_ex_rate_buy;
private BigDecimal	r13_ex_rate_mid;
private BigDecimal	r13_ex_rate_sell;
private BigDecimal	r13_notice_0to31;
private BigDecimal	r13_notice_32to88;
private BigDecimal	r13_cer_of_depo;

private BigDecimal	r14_ex_rate_buy;
private BigDecimal	r14_ex_rate_mid;
private BigDecimal	r14_ex_rate_sell;
private BigDecimal	r14_notice_0to31;
private BigDecimal	r14_notice_32to88;
private BigDecimal	r14_cer_of_depo;

private BigDecimal	r15_ex_rate_buy;
private BigDecimal	r15_ex_rate_mid;
private BigDecimal	r15_ex_rate_sell;
private BigDecimal	r15_notice_0to31;
private BigDecimal	r15_notice_32to88;
private BigDecimal	r15_cer_of_depo;

private BigDecimal	r16_ex_rate_buy;
private BigDecimal	r16_ex_rate_mid;
private BigDecimal	r16_ex_rate_sell;
private BigDecimal	r16_notice_0to31;
private BigDecimal	r16_notice_32to88;
private BigDecimal	r16_cer_of_depo;

private BigDecimal	r17_ex_rate_buy;
private BigDecimal	r17_ex_rate_mid;
private BigDecimal	r17_ex_rate_sell;

private BigDecimal	r18_ex_rate_buy;
private BigDecimal	r18_ex_rate_mid;
private BigDecimal	r18_ex_rate_sell;
private BigDecimal	r18_notice_0to31;
private BigDecimal	r18_notice_32to88;
private BigDecimal	r18_total;
private BigDecimal	r18_pula_equivalent;
private BigDecimal	r18_avg_pula_equivalent;
@Id
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "dd/MM/yyyy")
private Date REPORT_DATE;
private String report_version;
private String report_frequency;
private String report_code;
private String report_desc;
private String entity_flg;
private String modify_flg;
private String del_flg;

public BigDecimal getR11_ex_rate_buy() {
    return r11_ex_rate_buy;
}
public void setR11_ex_rate_buy(BigDecimal r11_ex_rate_buy) {
    this.r11_ex_rate_buy = r11_ex_rate_buy;
}
public BigDecimal getR11_ex_rate_mid() {
    return r11_ex_rate_mid;
}
public void setR11_ex_rate_mid(BigDecimal r11_ex_rate_mid) {
    this.r11_ex_rate_mid = r11_ex_rate_mid;
}
public BigDecimal getR11_ex_rate_sell() {
    return r11_ex_rate_sell;
}
public void setR11_ex_rate_sell(BigDecimal r11_ex_rate_sell) {
    this.r11_ex_rate_sell = r11_ex_rate_sell;
}
public BigDecimal getR11_notice_0to31() {
    return r11_notice_0to31;
}
public void setR11_notice_0to31(BigDecimal r11_notice_0to31) {
    this.r11_notice_0to31 = r11_notice_0to31;
}
public BigDecimal getR11_notice_32to88() {
    return r11_notice_32to88;
}
public void setR11_notice_32to88(BigDecimal r11_notice_32to88) {
    this.r11_notice_32to88 = r11_notice_32to88;
}
public BigDecimal getR11_cer_of_depo() {
    return r11_cer_of_depo;
}
public void setR11_cer_of_depo(BigDecimal r11_cer_of_depo) {
    this.r11_cer_of_depo = r11_cer_of_depo;
}
public BigDecimal getR12_ex_rate_buy() {
    return r12_ex_rate_buy;
}
public void setR12_ex_rate_buy(BigDecimal r12_ex_rate_buy) {
    this.r12_ex_rate_buy = r12_ex_rate_buy;
}
public BigDecimal getR12_ex_rate_mid() {
    return r12_ex_rate_mid;
}
public void setR12_ex_rate_mid(BigDecimal r12_ex_rate_mid) {
    this.r12_ex_rate_mid = r12_ex_rate_mid;
}
public BigDecimal getR12_ex_rate_sell() {
    return r12_ex_rate_sell;
}
public void setR12_ex_rate_sell(BigDecimal r12_ex_rate_sell) {
    this.r12_ex_rate_sell = r12_ex_rate_sell;
}
public BigDecimal getR12_notice_0to31() {
    return r12_notice_0to31;
}
public void setR12_notice_0to31(BigDecimal r12_notice_0to31) {
    this.r12_notice_0to31 = r12_notice_0to31;
}
public BigDecimal getR12_notice_32to88() {
    return r12_notice_32to88;
}
public void setR12_notice_32to88(BigDecimal r12_notice_32to88) {
    this.r12_notice_32to88 = r12_notice_32to88;
}
public BigDecimal getR12_cer_of_depo() {
    return r12_cer_of_depo;
}
public void setR12_cer_of_depo(BigDecimal r12_cer_of_depo) {
    this.r12_cer_of_depo = r12_cer_of_depo;
}
public BigDecimal getR13_ex_rate_buy() {
    return r13_ex_rate_buy;
}
public void setR13_ex_rate_buy(BigDecimal r13_ex_rate_buy) {
    this.r13_ex_rate_buy = r13_ex_rate_buy;
}
public BigDecimal getR13_ex_rate_mid() {
    return r13_ex_rate_mid;
}
public void setR13_ex_rate_mid(BigDecimal r13_ex_rate_mid) {
    this.r13_ex_rate_mid = r13_ex_rate_mid;
}
public BigDecimal getR13_ex_rate_sell() {
    return r13_ex_rate_sell;
}
public void setR13_ex_rate_sell(BigDecimal r13_ex_rate_sell) {
    this.r13_ex_rate_sell = r13_ex_rate_sell;
}
public BigDecimal getR13_notice_0to31() {
    return r13_notice_0to31;
}
public void setR13_notice_0to31(BigDecimal r13_notice_0to31) {
    this.r13_notice_0to31 = r13_notice_0to31;
}
public BigDecimal getR13_notice_32to88() {
    return r13_notice_32to88;
}
public void setR13_notice_32to88(BigDecimal r13_notice_32to88) {
    this.r13_notice_32to88 = r13_notice_32to88;
}
public BigDecimal getR13_cer_of_depo() {
    return r13_cer_of_depo;
}
public void setR13_cer_of_depo(BigDecimal r13_cer_of_depo) {
    this.r13_cer_of_depo = r13_cer_of_depo;
}
public BigDecimal getR14_ex_rate_buy() {
    return r14_ex_rate_buy;
}
public void setR14_ex_rate_buy(BigDecimal r14_ex_rate_buy) {
    this.r14_ex_rate_buy = r14_ex_rate_buy;
}
public BigDecimal getR14_ex_rate_mid() {
    return r14_ex_rate_mid;
}
public void setR14_ex_rate_mid(BigDecimal r14_ex_rate_mid) {
    this.r14_ex_rate_mid = r14_ex_rate_mid;
}
public BigDecimal getR14_ex_rate_sell() {
    return r14_ex_rate_sell;
}
public void setR14_ex_rate_sell(BigDecimal r14_ex_rate_sell) {
    this.r14_ex_rate_sell = r14_ex_rate_sell;
}
public BigDecimal getR14_notice_0to31() {
    return r14_notice_0to31;
}
public void setR14_notice_0to31(BigDecimal r14_notice_0to31) {
    this.r14_notice_0to31 = r14_notice_0to31;
}
public BigDecimal getR14_notice_32to88() {
    return r14_notice_32to88;
}
public void setR14_notice_32to88(BigDecimal r14_notice_32to88) {
    this.r14_notice_32to88 = r14_notice_32to88;
}
public BigDecimal getR14_cer_of_depo() {
    return r14_cer_of_depo;
}
public void setR14_cer_of_depo(BigDecimal r14_cer_of_depo) {
    this.r14_cer_of_depo = r14_cer_of_depo;
}
public BigDecimal getR15_ex_rate_buy() {
    return r15_ex_rate_buy;
}
public void setR15_ex_rate_buy(BigDecimal r15_ex_rate_buy) {
    this.r15_ex_rate_buy = r15_ex_rate_buy;
}
public BigDecimal getR15_ex_rate_mid() {
    return r15_ex_rate_mid;
}
public void setR15_ex_rate_mid(BigDecimal r15_ex_rate_mid) {
    this.r15_ex_rate_mid = r15_ex_rate_mid;
}
public BigDecimal getR15_ex_rate_sell() {
    return r15_ex_rate_sell;
}
public void setR15_ex_rate_sell(BigDecimal r15_ex_rate_sell) {
    this.r15_ex_rate_sell = r15_ex_rate_sell;
}
public BigDecimal getR15_notice_0to31() {
    return r15_notice_0to31;
}
public void setR15_notice_0to31(BigDecimal r15_notice_0to31) {
    this.r15_notice_0to31 = r15_notice_0to31;
}
public BigDecimal getR15_notice_32to88() {
    return r15_notice_32to88;
}
public void setR15_notice_32to88(BigDecimal r15_notice_32to88) {
    this.r15_notice_32to88 = r15_notice_32to88;
}
public BigDecimal getR15_cer_of_depo() {
    return r15_cer_of_depo;
}
public void setR15_cer_of_depo(BigDecimal r15_cer_of_depo) {
    this.r15_cer_of_depo = r15_cer_of_depo;
}
public BigDecimal getR16_ex_rate_buy() {
    return r16_ex_rate_buy;
}
public void setR16_ex_rate_buy(BigDecimal r16_ex_rate_buy) {
    this.r16_ex_rate_buy = r16_ex_rate_buy;
}
public BigDecimal getR16_ex_rate_mid() {
    return r16_ex_rate_mid;
}
public void setR16_ex_rate_mid(BigDecimal r16_ex_rate_mid) {
    this.r16_ex_rate_mid = r16_ex_rate_mid;
}
public BigDecimal getR16_ex_rate_sell() {
    return r16_ex_rate_sell;
}
public void setR16_ex_rate_sell(BigDecimal r16_ex_rate_sell) {
    this.r16_ex_rate_sell = r16_ex_rate_sell;
}
public BigDecimal getR16_notice_0to31() {
    return r16_notice_0to31;
}
public void setR16_notice_0to31(BigDecimal r16_notice_0to31) {
    this.r16_notice_0to31 = r16_notice_0to31;
}
public BigDecimal getR16_notice_32to88() {
    return r16_notice_32to88;
}
public void setR16_notice_32to88(BigDecimal r16_notice_32to88) {
    this.r16_notice_32to88 = r16_notice_32to88;
}
public BigDecimal getR16_cer_of_depo() {
    return r16_cer_of_depo;
}
public void setR16_cer_of_depo(BigDecimal r16_cer_of_depo) {
    this.r16_cer_of_depo = r16_cer_of_depo;
}
public BigDecimal getR17_ex_rate_buy() {
    return r17_ex_rate_buy;
}
public void setR17_ex_rate_buy(BigDecimal r17_ex_rate_buy) {
    this.r17_ex_rate_buy = r17_ex_rate_buy;
}
public BigDecimal getR17_ex_rate_mid() {
    return r17_ex_rate_mid;
}
public void setR17_ex_rate_mid(BigDecimal r17_ex_rate_mid) {
    this.r17_ex_rate_mid = r17_ex_rate_mid;
}
public BigDecimal getR17_ex_rate_sell() {
    return r17_ex_rate_sell;
}
public void setR17_ex_rate_sell(BigDecimal r17_ex_rate_sell) {
    this.r17_ex_rate_sell = r17_ex_rate_sell;
}
public BigDecimal getR18_ex_rate_buy() {
    return r18_ex_rate_buy;
}
public void setR18_ex_rate_buy(BigDecimal r18_ex_rate_buy) {
    this.r18_ex_rate_buy = r18_ex_rate_buy;
}
public BigDecimal getR18_ex_rate_mid() {
    return r18_ex_rate_mid;
}
public void setR18_ex_rate_mid(BigDecimal r18_ex_rate_mid) {
    this.r18_ex_rate_mid = r18_ex_rate_mid;
}
public BigDecimal getR18_ex_rate_sell() {
    return r18_ex_rate_sell;
}
public void setR18_ex_rate_sell(BigDecimal r18_ex_rate_sell) {
    this.r18_ex_rate_sell = r18_ex_rate_sell;
}
public BigDecimal getR18_notice_0to31() {
    return r18_notice_0to31;
}
public void setR18_notice_0to31(BigDecimal r18_notice_0to31) {
    this.r18_notice_0to31 = r18_notice_0to31;
}
public BigDecimal getR18_notice_32to88() {
    return r18_notice_32to88;
}
public void setR18_notice_32to88(BigDecimal r18_notice_32to88) {
    this.r18_notice_32to88 = r18_notice_32to88;
}
public BigDecimal getR18_total() {
    return r18_total;
}
public void setR18_total(BigDecimal r18_total) {
    this.r18_total = r18_total;
}
public BigDecimal getR18_pula_equivalent() {
    return r18_pula_equivalent;
}
public void setR18_pula_equivalent(BigDecimal r18_pula_equivalent) {
    this.r18_pula_equivalent = r18_pula_equivalent;
}
public BigDecimal getR18_avg_pula_equivalent() {
    return r18_avg_pula_equivalent;
}
public void setR18_avg_pula_equivalent(BigDecimal r18_avg_pula_equivalent) {
    this.r18_avg_pula_equivalent = r18_avg_pula_equivalent;
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



}


