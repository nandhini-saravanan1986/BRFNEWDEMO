

package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="BRRS_M_CA3_SUMMARYTABLE")
public
class M_CA3_Summary_Entity {

     private String R10_PRODUCT;
    private BigDecimal R10_AMOUNT;

    
    private String R11_PRODUCT;
    private BigDecimal R11_AMOUNT;

   
    private String R12_PRODUCT;
    private BigDecimal R12_AMOUNT;

    
    private String R13_PRODUCT;
    private BigDecimal R13_AMOUNT;

    
    private String R14_PRODUCT;
    private BigDecimal R14_AMOUNT;

   
    private String R15_PRODUCT;
    private BigDecimal R15_AMOUNT;

    
    private String R16_PRODUCT;
    private BigDecimal R16_AMOUNT;


    private String R17_PRODUCT;
    private BigDecimal R17_AMOUNT;

  
    private String R18_PRODUCT;
    private BigDecimal R18_AMOUNT;

    
    private String R19_PRODUCT;
    private BigDecimal R19_AMOUNT;

    
    private String R20_PRODUCT;
    private BigDecimal R20_AMOUNT;

   
    private String R24_PRODUCT;
    private BigDecimal R24_AMOUNT;

  
    private String R25_PRODUCT;
    private BigDecimal R25_AMOUNT;

  
    private String R26_PRODUCT;
    private BigDecimal R26_AMOUNT;

 
    private String R27_PRODUCT;
    private BigDecimal R27_AMOUNT;

   
    private String R28_PRODUCT;
    private BigDecimal R28_AMOUNT;


    private String R29_PRODUCT;
    private BigDecimal R29_AMOUNT;

   
    private String R36_PRODUCT;
    private BigDecimal R36_AMOUNT;

    
    private String R37_PRODUCT;
    private BigDecimal R37_AMOUNT;

    private String R38_PRODUCT;
    private BigDecimal R38_AMOUNT;

    
    private String R39_PRODUCT;
    private BigDecimal R39_AMOUNT;

  
    private String R40_PRODUCT;
    private BigDecimal R40_AMOUNT;

  
    private String R41_PRODUCT;
    private BigDecimal R41_AMOUNT;

    private String R44_PRODUCT;
    private BigDecimal R44_AMOUNT;

   
    private String R45_PRODUCT;
    private BigDecimal R45_AMOUNT;

  
    private String R46_PRODUCT;
    private BigDecimal R46_AMOUNT;

   
    private String R50_PRODUCT;
    private BigDecimal R50_AMOUNT;

   
    private String R51_PRODUCT;
    private BigDecimal R51_AMOUNT;

    
    private String R52_PRODUCT;
    private BigDecimal R52_AMOUNT;

   
    private String R53_PRODUCT;
    private BigDecimal R53_AMOUNT;

   
    private String R54_PRODUCT;
    private BigDecimal R54_AMOUNT;

   
    private String R55_PRODUCT;
    private BigDecimal R55_AMOUNT;

   
    private String R58_PRODUCT;
    private BigDecimal R58_AMOUNT;

   
    private String R59_PRODUCT;
    private BigDecimal R59_AMOUNT;

  
    private String R60_PRODUCT;
    private BigDecimal R60_AMOUNT;

     @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date REPORT_DATE;

    private String REPORT_VERSION;
    private String REPORT_FREQUENCY;
    private String REPORT_CODE;
    private String REPORT_DESC;

    private String ENTITY_FLG;
    private String MODIFY_FLG;
    private String DEL_FLG;
    public M_CA3_Summary_Entity(String r10_PRODUCT, BigDecimal r10_AMOUNT, String r11_PRODUCT,
            BigDecimal r11_AMOUNT, String r12_PRODUCT, BigDecimal r12_AMOUNT, String r13_PRODUCT, BigDecimal r13_AMOUNT,
            String r14_PRODUCT, BigDecimal r14_AMOUNT, String r15_PRODUCT, BigDecimal r15_AMOUNT, String r16_PRODUCT,
            BigDecimal r16_AMOUNT, String r17_PRODUCT, BigDecimal r17_AMOUNT, String r18_PRODUCT, BigDecimal r18_AMOUNT,
            String r19_PRODUCT, BigDecimal r19_AMOUNT, String r20_PRODUCT, BigDecimal r20_AMOUNT, String r24_PRODUCT,
            BigDecimal r24_AMOUNT, String r25_PRODUCT, BigDecimal r25_AMOUNT, String r26_PRODUCT, BigDecimal r26_AMOUNT,
            String r27_PRODUCT, BigDecimal r27_AMOUNT, String r28_PRODUCT, BigDecimal r28_AMOUNT, String r29_PRODUCT,
            BigDecimal r29_AMOUNT, String r36_PRODUCT, BigDecimal r36_AMOUNT, String r37_PRODUCT, BigDecimal r37_AMOUNT,
            String r38_PRODUCT, BigDecimal r38_AMOUNT, String r39_PRODUCT, BigDecimal r39_AMOUNT, String r40_PRODUCT,
            BigDecimal r40_AMOUNT, String r41_PRODUCT, BigDecimal r41_AMOUNT, String r44_PRODUCT, BigDecimal r44_AMOUNT,
            String r45_PRODUCT, BigDecimal r45_AMOUNT, String r46_PRODUCT, BigDecimal r46_AMOUNT, String r50_PRODUCT,
            BigDecimal r50_AMOUNT, String r51_PRODUCT, BigDecimal r51_AMOUNT, String r52_PRODUCT, BigDecimal r52_AMOUNT,
            String r53_PRODUCT, BigDecimal r53_AMOUNT, String r54_PRODUCT, BigDecimal r54_AMOUNT, String r55_PRODUCT,
            BigDecimal r55_AMOUNT, String r58_PRODUCT, BigDecimal r58_AMOUNT, String r59_PRODUCT, BigDecimal r59_AMOUNT,
            String r60_PRODUCT, BigDecimal r60_AMOUNT, Date rEPORT_DATE, String rEPORT_VERSION, String rEPORT_FREQUENCY,
            String rEPORT_CODE, String rEPORT_DESC, String eNTITY_FLG, String mODIFY_FLG, String dEL_FLG) {
        R10_PRODUCT = r10_PRODUCT;
        R10_AMOUNT = r10_AMOUNT;
        R11_PRODUCT = r11_PRODUCT;
        R11_AMOUNT = r11_AMOUNT;
        R12_PRODUCT = r12_PRODUCT;
        R12_AMOUNT = r12_AMOUNT;
        R13_PRODUCT = r13_PRODUCT;
        R13_AMOUNT = r13_AMOUNT;
        R14_PRODUCT = r14_PRODUCT;
        R14_AMOUNT = r14_AMOUNT;
        R15_PRODUCT = r15_PRODUCT;
        R15_AMOUNT = r15_AMOUNT;
        R16_PRODUCT = r16_PRODUCT;
        R16_AMOUNT = r16_AMOUNT;
        R17_PRODUCT = r17_PRODUCT;
        R17_AMOUNT = r17_AMOUNT;
        R18_PRODUCT = r18_PRODUCT;
        R18_AMOUNT = r18_AMOUNT;
        R19_PRODUCT = r19_PRODUCT;
        R19_AMOUNT = r19_AMOUNT;
        R20_PRODUCT = r20_PRODUCT;
        R20_AMOUNT = r20_AMOUNT;
        R24_PRODUCT = r24_PRODUCT;
        R24_AMOUNT = r24_AMOUNT;
        R25_PRODUCT = r25_PRODUCT;
        R25_AMOUNT = r25_AMOUNT;
        R26_PRODUCT = r26_PRODUCT;
        R26_AMOUNT = r26_AMOUNT;
        R27_PRODUCT = r27_PRODUCT;
        R27_AMOUNT = r27_AMOUNT;
        R28_PRODUCT = r28_PRODUCT;
        R28_AMOUNT = r28_AMOUNT;
        R29_PRODUCT = r29_PRODUCT;
        R29_AMOUNT = r29_AMOUNT;
        R36_PRODUCT = r36_PRODUCT;
        R36_AMOUNT = r36_AMOUNT;
        R37_PRODUCT = r37_PRODUCT;
        R37_AMOUNT = r37_AMOUNT;
        R38_PRODUCT = r38_PRODUCT;
        R38_AMOUNT = r38_AMOUNT;
        R39_PRODUCT = r39_PRODUCT;
        R39_AMOUNT = r39_AMOUNT;
        R40_PRODUCT = r40_PRODUCT;
        R40_AMOUNT = r40_AMOUNT;
        R41_PRODUCT = r41_PRODUCT;
        R41_AMOUNT = r41_AMOUNT;
        R44_PRODUCT = r44_PRODUCT;
        R44_AMOUNT = r44_AMOUNT;
        R45_PRODUCT = r45_PRODUCT;
        R45_AMOUNT = r45_AMOUNT;
        R46_PRODUCT = r46_PRODUCT;
        R46_AMOUNT = r46_AMOUNT;
        R50_PRODUCT = r50_PRODUCT;
        R50_AMOUNT = r50_AMOUNT;
        R51_PRODUCT = r51_PRODUCT;
        R51_AMOUNT = r51_AMOUNT;
        R52_PRODUCT = r52_PRODUCT;
        R52_AMOUNT = r52_AMOUNT;
        R53_PRODUCT = r53_PRODUCT;
        R53_AMOUNT = r53_AMOUNT;
        R54_PRODUCT = r54_PRODUCT;
        R54_AMOUNT = r54_AMOUNT;
        R55_PRODUCT = r55_PRODUCT;
        R55_AMOUNT = r55_AMOUNT;
        R58_PRODUCT = r58_PRODUCT;
        R58_AMOUNT = r58_AMOUNT;
        R59_PRODUCT = r59_PRODUCT;
        R59_AMOUNT = r59_AMOUNT;
        R60_PRODUCT = r60_PRODUCT;
        R60_AMOUNT = r60_AMOUNT;
        REPORT_DATE = rEPORT_DATE;
        REPORT_VERSION = rEPORT_VERSION;
        REPORT_FREQUENCY = rEPORT_FREQUENCY;
        REPORT_CODE = rEPORT_CODE;
        REPORT_DESC = rEPORT_DESC;
        ENTITY_FLG = eNTITY_FLG;
        MODIFY_FLG = mODIFY_FLG;
        DEL_FLG = dEL_FLG;
    }
    public String getR10_PRODUCT() {
        return R10_PRODUCT;
    }
    public void setR10_PRODUCT(String r10_PRODUCT) {
        R10_PRODUCT = r10_PRODUCT;
    }
    public BigDecimal getR10_AMOUNT() {
        return R10_AMOUNT;
    }
    public void setR10_AMOUNT(BigDecimal r10_AMOUNT) {
        R10_AMOUNT = r10_AMOUNT;
    }
    public String getR11_PRODUCT() {
        return R11_PRODUCT;
    }
    public void setR11_PRODUCT(String r11_PRODUCT) {
        R11_PRODUCT = r11_PRODUCT;
    }
    public BigDecimal getR11_AMOUNT() {
        return R11_AMOUNT;
    }
    public void setR11_AMOUNT(BigDecimal r11_AMOUNT) {
        R11_AMOUNT = r11_AMOUNT;
    }
    public String getR12_PRODUCT() {
        return R12_PRODUCT;
    }
    public void setR12_PRODUCT(String r12_PRODUCT) {
        R12_PRODUCT = r12_PRODUCT;
    }
    public BigDecimal getR12_AMOUNT() {
        return R12_AMOUNT;
    }
    public void setR12_AMOUNT(BigDecimal r12_AMOUNT) {
        R12_AMOUNT = r12_AMOUNT;
    }
    public String getR13_PRODUCT() {
        return R13_PRODUCT;
    }
    public void setR13_PRODUCT(String r13_PRODUCT) {
        R13_PRODUCT = r13_PRODUCT;
    }
    public BigDecimal getR13_AMOUNT() {
        return R13_AMOUNT;
    }
    public void setR13_AMOUNT(BigDecimal r13_AMOUNT) {
        R13_AMOUNT = r13_AMOUNT;
    }
    public String getR14_PRODUCT() {
        return R14_PRODUCT;
    }
    public void setR14_PRODUCT(String r14_PRODUCT) {
        R14_PRODUCT = r14_PRODUCT;
    }
    public BigDecimal getR14_AMOUNT() {
        return R14_AMOUNT;
    }
    public void setR14_AMOUNT(BigDecimal r14_AMOUNT) {
        R14_AMOUNT = r14_AMOUNT;
    }
    public String getR15_PRODUCT() {
        return R15_PRODUCT;
    }
    public void setR15_PRODUCT(String r15_PRODUCT) {
        R15_PRODUCT = r15_PRODUCT;
    }
    public BigDecimal getR15_AMOUNT() {
        return R15_AMOUNT;
    }
    public void setR15_AMOUNT(BigDecimal r15_AMOUNT) {
        R15_AMOUNT = r15_AMOUNT;
    }
    public String getR16_PRODUCT() {
        return R16_PRODUCT;
    }
    public void setR16_PRODUCT(String r16_PRODUCT) {
        R16_PRODUCT = r16_PRODUCT;
    }
    public BigDecimal getR16_AMOUNT() {
        return R16_AMOUNT;
    }
    public void setR16_AMOUNT(BigDecimal r16_AMOUNT) {
        R16_AMOUNT = r16_AMOUNT;
    }
    public String getR17_PRODUCT() {
        return R17_PRODUCT;
    }
    public void setR17_PRODUCT(String r17_PRODUCT) {
        R17_PRODUCT = r17_PRODUCT;
    }
    public BigDecimal getR17_AMOUNT() {
        return R17_AMOUNT;
    }
    public void setR17_AMOUNT(BigDecimal r17_AMOUNT) {
        R17_AMOUNT = r17_AMOUNT;
    }
    public String getR18_PRODUCT() {
        return R18_PRODUCT;
    }
    public void setR18_PRODUCT(String r18_PRODUCT) {
        R18_PRODUCT = r18_PRODUCT;
    }
    public BigDecimal getR18_AMOUNT() {
        return R18_AMOUNT;
    }
    public void setR18_AMOUNT(BigDecimal r18_AMOUNT) {
        R18_AMOUNT = r18_AMOUNT;
    }
    public String getR19_PRODUCT() {
        return R19_PRODUCT;
    }
    public void setR19_PRODUCT(String r19_PRODUCT) {
        R19_PRODUCT = r19_PRODUCT;
    }
    public BigDecimal getR19_AMOUNT() {
        return R19_AMOUNT;
    }
    public void setR19_AMOUNT(BigDecimal r19_AMOUNT) {
        R19_AMOUNT = r19_AMOUNT;
    }
    public String getR20_PRODUCT() {
        return R20_PRODUCT;
    }
    public void setR20_PRODUCT(String r20_PRODUCT) {
        R20_PRODUCT = r20_PRODUCT;
    }
    public BigDecimal getR20_AMOUNT() {
        return R20_AMOUNT;
    }
    public void setR20_AMOUNT(BigDecimal r20_AMOUNT) {
        R20_AMOUNT = r20_AMOUNT;
    }
    public String getR24_PRODUCT() {
        return R24_PRODUCT;
    }
    public void setR24_PRODUCT(String r24_PRODUCT) {
        R24_PRODUCT = r24_PRODUCT;
    }
    public BigDecimal getR24_AMOUNT() {
        return R24_AMOUNT;
    }
    public void setR24_AMOUNT(BigDecimal r24_AMOUNT) {
        R24_AMOUNT = r24_AMOUNT;
    }
    public String getR25_PRODUCT() {
        return R25_PRODUCT;
    }
    public void setR25_PRODUCT(String r25_PRODUCT) {
        R25_PRODUCT = r25_PRODUCT;
    }
    public BigDecimal getR25_AMOUNT() {
        return R25_AMOUNT;
    }
    public void setR25_AMOUNT(BigDecimal r25_AMOUNT) {
        R25_AMOUNT = r25_AMOUNT;
    }
    public String getR26_PRODUCT() {
        return R26_PRODUCT;
    }
    public void setR26_PRODUCT(String r26_PRODUCT) {
        R26_PRODUCT = r26_PRODUCT;
    }
    public BigDecimal getR26_AMOUNT() {
        return R26_AMOUNT;
    }
    public void setR26_AMOUNT(BigDecimal r26_AMOUNT) {
        R26_AMOUNT = r26_AMOUNT;
    }
    public String getR27_PRODUCT() {
        return R27_PRODUCT;
    }
    public void setR27_PRODUCT(String r27_PRODUCT) {
        R27_PRODUCT = r27_PRODUCT;
    }
    public BigDecimal getR27_AMOUNT() {
        return R27_AMOUNT;
    }
    public void setR27_AMOUNT(BigDecimal r27_AMOUNT) {
        R27_AMOUNT = r27_AMOUNT;
    }
    public String getR28_PRODUCT() {
        return R28_PRODUCT;
    }
    public void setR28_PRODUCT(String r28_PRODUCT) {
        R28_PRODUCT = r28_PRODUCT;
    }
    public BigDecimal getR28_AMOUNT() {
        return R28_AMOUNT;
    }
    public void setR28_AMOUNT(BigDecimal r28_AMOUNT) {
        R28_AMOUNT = r28_AMOUNT;
    }
    public String getR29_PRODUCT() {
        return R29_PRODUCT;
    }
    public void setR29_PRODUCT(String r29_PRODUCT) {
        R29_PRODUCT = r29_PRODUCT;
    }
    public BigDecimal getR29_AMOUNT() {
        return R29_AMOUNT;
    }
    public void setR29_AMOUNT(BigDecimal r29_AMOUNT) {
        R29_AMOUNT = r29_AMOUNT;
    }
    public String getR36_PRODUCT() {
        return R36_PRODUCT;
    }
    public void setR36_PRODUCT(String r36_PRODUCT) {
        R36_PRODUCT = r36_PRODUCT;
    }
    public BigDecimal getR36_AMOUNT() {
        return R36_AMOUNT;
    }
    public void setR36_AMOUNT(BigDecimal r36_AMOUNT) {
        R36_AMOUNT = r36_AMOUNT;
    }
    public String getR37_PRODUCT() {
        return R37_PRODUCT;
    }
    public void setR37_PRODUCT(String r37_PRODUCT) {
        R37_PRODUCT = r37_PRODUCT;
    }
    public BigDecimal getR37_AMOUNT() {
        return R37_AMOUNT;
    }
    public void setR37_AMOUNT(BigDecimal r37_AMOUNT) {
        R37_AMOUNT = r37_AMOUNT;
    }
    public String getR38_PRODUCT() {
        return R38_PRODUCT;
    }
    public void setR38_PRODUCT(String r38_PRODUCT) {
        R38_PRODUCT = r38_PRODUCT;
    }
    public BigDecimal getR38_AMOUNT() {
        return R38_AMOUNT;
    }
    public void setR38_AMOUNT(BigDecimal r38_AMOUNT) {
        R38_AMOUNT = r38_AMOUNT;
    }
    public String getR39_PRODUCT() {
        return R39_PRODUCT;
    }
    public void setR39_PRODUCT(String r39_PRODUCT) {
        R39_PRODUCT = r39_PRODUCT;
    }
    public BigDecimal getR39_AMOUNT() {
        return R39_AMOUNT;
    }
    public void setR39_AMOUNT(BigDecimal r39_AMOUNT) {
        R39_AMOUNT = r39_AMOUNT;
    }
    public String getR40_PRODUCT() {
        return R40_PRODUCT;
    }
    public void setR40_PRODUCT(String r40_PRODUCT) {
        R40_PRODUCT = r40_PRODUCT;
    }
    public BigDecimal getR40_AMOUNT() {
        return R40_AMOUNT;
    }
    public void setR40_AMOUNT(BigDecimal r40_AMOUNT) {
        R40_AMOUNT = r40_AMOUNT;
    }
    public String getR41_PRODUCT() {
        return R41_PRODUCT;
    }
    public void setR41_PRODUCT(String r41_PRODUCT) {
        R41_PRODUCT = r41_PRODUCT;
    }
    public BigDecimal getR41_AMOUNT() {
        return R41_AMOUNT;
    }
    public void setR41_AMOUNT(BigDecimal r41_AMOUNT) {
        R41_AMOUNT = r41_AMOUNT;
    }
    public String getR44_PRODUCT() {
        return R44_PRODUCT;
    }
    public void setR44_PRODUCT(String r44_PRODUCT) {
        R44_PRODUCT = r44_PRODUCT;
    }
    public BigDecimal getR44_AMOUNT() {
        return R44_AMOUNT;
    }
    public void setR44_AMOUNT(BigDecimal r44_AMOUNT) {
        R44_AMOUNT = r44_AMOUNT;
    }
    public String getR45_PRODUCT() {
        return R45_PRODUCT;
    }
    public void setR45_PRODUCT(String r45_PRODUCT) {
        R45_PRODUCT = r45_PRODUCT;
    }
    public BigDecimal getR45_AMOUNT() {
        return R45_AMOUNT;
    }
    public void setR45_AMOUNT(BigDecimal r45_AMOUNT) {
        R45_AMOUNT = r45_AMOUNT;
    }
    public String getR46_PRODUCT() {
        return R46_PRODUCT;
    }
    public void setR46_PRODUCT(String r46_PRODUCT) {
        R46_PRODUCT = r46_PRODUCT;
    }
    public BigDecimal getR46_AMOUNT() {
        return R46_AMOUNT;
    }
    public void setR46_AMOUNT(BigDecimal r46_AMOUNT) {
        R46_AMOUNT = r46_AMOUNT;
    }
    public String getR50_PRODUCT() {
        return R50_PRODUCT;
    }
    public void setR50_PRODUCT(String r50_PRODUCT) {
        R50_PRODUCT = r50_PRODUCT;
    }
    public BigDecimal getR50_AMOUNT() {
        return R50_AMOUNT;
    }
    public void setR50_AMOUNT(BigDecimal r50_AMOUNT) {
        R50_AMOUNT = r50_AMOUNT;
    }
    public String getR51_PRODUCT() {
        return R51_PRODUCT;
    }
    public void setR51_PRODUCT(String r51_PRODUCT) {
        R51_PRODUCT = r51_PRODUCT;
    }
    public BigDecimal getR51_AMOUNT() {
        return R51_AMOUNT;
    }
    public void setR51_AMOUNT(BigDecimal r51_AMOUNT) {
        R51_AMOUNT = r51_AMOUNT;
    }
    public String getR52_PRODUCT() {
        return R52_PRODUCT;
    }
    public void setR52_PRODUCT(String r52_PRODUCT) {
        R52_PRODUCT = r52_PRODUCT;
    }
    public BigDecimal getR52_AMOUNT() {
        return R52_AMOUNT;
    }
    public void setR52_AMOUNT(BigDecimal r52_AMOUNT) {
        R52_AMOUNT = r52_AMOUNT;
    }
    public String getR53_PRODUCT() {
        return R53_PRODUCT;
    }
    public void setR53_PRODUCT(String r53_PRODUCT) {
        R53_PRODUCT = r53_PRODUCT;
    }
    public BigDecimal getR53_AMOUNT() {
        return R53_AMOUNT;
    }
    public void setR53_AMOUNT(BigDecimal r53_AMOUNT) {
        R53_AMOUNT = r53_AMOUNT;
    }
    public String getR54_PRODUCT() {
        return R54_PRODUCT;
    }
    public void setR54_PRODUCT(String r54_PRODUCT) {
        R54_PRODUCT = r54_PRODUCT;
    }
    public BigDecimal getR54_AMOUNT() {
        return R54_AMOUNT;
    }
    public void setR54_AMOUNT(BigDecimal r54_AMOUNT) {
        R54_AMOUNT = r54_AMOUNT;
    }
    public String getR55_PRODUCT() {
        return R55_PRODUCT;
    }
    public void setR55_PRODUCT(String r55_PRODUCT) {
        R55_PRODUCT = r55_PRODUCT;
    }
    public BigDecimal getR55_AMOUNT() {
        return R55_AMOUNT;
    }
    public void setR55_AMOUNT(BigDecimal r55_AMOUNT) {
        R55_AMOUNT = r55_AMOUNT;
    }
    public String getR58_PRODUCT() {
        return R58_PRODUCT;
    }
    public void setR58_PRODUCT(String r58_PRODUCT) {
        R58_PRODUCT = r58_PRODUCT;
    }
    public BigDecimal getR58_AMOUNT() {
        return R58_AMOUNT;
    }
    public void setR58_AMOUNT(BigDecimal r58_AMOUNT) {
        R58_AMOUNT = r58_AMOUNT;
    }
    public String getR59_PRODUCT() {
        return R59_PRODUCT;
    }
    public void setR59_PRODUCT(String r59_PRODUCT) {
        R59_PRODUCT = r59_PRODUCT;
    }
    public BigDecimal getR59_AMOUNT() {
        return R59_AMOUNT;
    }
    public void setR59_AMOUNT(BigDecimal r59_AMOUNT) {
        R59_AMOUNT = r59_AMOUNT;
    }
    public String getR60_PRODUCT() {
        return R60_PRODUCT;
    }
    public void setR60_PRODUCT(String r60_PRODUCT) {
        R60_PRODUCT = r60_PRODUCT;
    }
    public BigDecimal getR60_AMOUNT() {
        return R60_AMOUNT;
    }
    public void setR60_AMOUNT(BigDecimal r60_AMOUNT) {
        R60_AMOUNT = r60_AMOUNT;
    }
    public Date getREPORT_DATE() {
        return REPORT_DATE;
    }
    public void setREPORT_DATE(Date rEPORT_DATE) {
        REPORT_DATE = rEPORT_DATE;
    }
    public String getREPORT_VERSION() {
        return REPORT_VERSION;
    }
    public void setREPORT_VERSION(String rEPORT_VERSION) {
        REPORT_VERSION = rEPORT_VERSION;
    }
    public String getREPORT_FREQUENCY() {
        return REPORT_FREQUENCY;
    }
    public void setREPORT_FREQUENCY(String rEPORT_FREQUENCY) {
        REPORT_FREQUENCY = rEPORT_FREQUENCY;
    }
    public String getREPORT_CODE() {
        return REPORT_CODE;
    }
    public void setREPORT_CODE(String rEPORT_CODE) {
        REPORT_CODE = rEPORT_CODE;
    }
    public String getREPORT_DESC() {
        return REPORT_DESC;
    }
    public void setREPORT_DESC(String rEPORT_DESC) {
        REPORT_DESC = rEPORT_DESC;
    }
    public String getENTITY_FLG() {
        return ENTITY_FLG;
    }
    public void setENTITY_FLG(String eNTITY_FLG) {
        ENTITY_FLG = eNTITY_FLG;
    }
    public String getMODIFY_FLG() {
        return MODIFY_FLG;
    }
    public void setMODIFY_FLG(String mODIFY_FLG) {
        MODIFY_FLG = mODIFY_FLG;
    }
    public String getDEL_FLG() {
        return DEL_FLG;
    }
    public void setDEL_FLG(String dEL_FLG) {
        DEL_FLG = dEL_FLG;
    }

    
    public M_CA3_Summary_Entity  () {
		super();
		// TODO Auto-generated constructor stub
	}
    
}