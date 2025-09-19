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
@Table(name = "BRRS_M_OB_SUMMARYTABLE")
public class BRRS_M_OB_Summary_Entity {

	
	private	String	R11_PRODUCT;
	private	BigDecimal	R11_OTHER_BORROW;
	private	String	R12_PRODUCT;
	private	BigDecimal	R12_OTHER_BORROW;
	private	String	R13_PRODUCT;
	private	BigDecimal	R13_OTHER_BORROW;
	private	String	R14_PRODUCT;
	private	BigDecimal	R14_OTHER_BORROW;
	private	String	R15_PRODUCT;
	private	BigDecimal	R15_OTHER_BORROW;
	private	String	R16_PRODUCT;
	private	BigDecimal	R16_OTHER_BORROW;
	private	String	R17_PRODUCT;
	private	BigDecimal	R17_OTHER_BORROW;
	private	String	R18_PRODUCT;
	private	BigDecimal	R18_OTHER_BORROW;
	private	String	R19_PRODUCT;
	private	BigDecimal	R19_OTHER_BORROW;
	private	String	R20_PRODUCT;
	private	BigDecimal	R20_OTHER_BORROW;
	private	String	R21_PRODUCT;
	private	BigDecimal	R21_OTHER_BORROW;
	private	String	R22_PRODUCT;
	private	BigDecimal	R22_OTHER_BORROW;
	private	String	R23_PRODUCT;
	private	BigDecimal	R23_OTHER_BORROW;
	private	String	R24_PRODUCT;
	private	BigDecimal	R24_OTHER_BORROW;
	private	String	R25_PRODUCT;
	private	BigDecimal	R25_OTHER_BORROW;
	private	String	R26_PRODUCT;
	private	BigDecimal	R26_OTHER_BORROW;
	private	String	R27_PRODUCT;
	private	BigDecimal	R27_OTHER_BORROW;
	private	String	R28_PRODUCT;
	private	BigDecimal	R28_OTHER_BORROW;
	private	String	R29_PRODUCT;
	private	BigDecimal	R29_OTHER_BORROW;
	private	String	R30_PRODUCT;
	private	BigDecimal	R30_OTHER_BORROW;
	private	String	R31_PRODUCT;
	private	BigDecimal	R31_OTHER_BORROW;
	private	String	R32_PRODUCT;
	private	BigDecimal	R32_OTHER_BORROW;
	private	String	R33_PRODUCT;
	private	BigDecimal	R33_OTHER_BORROW;
	private	String	R34_PRODUCT;
	private	BigDecimal	R34_OTHER_BORROW;
	private	String	R35_PRODUCT;
	private	BigDecimal	R35_OTHER_BORROW;
	private	String	R36_PRODUCT;
	private	BigDecimal	R36_OTHER_BORROW;
	private	String	R37_PRODUCT;
	private	BigDecimal	R37_OTHER_BORROW;
	private	String	R38_PRODUCT;
	private	BigDecimal	R38_OTHER_BORROW;
	private	String	R39_PRODUCT;
	private	BigDecimal	R39_OTHER_BORROW;
	private	String	R40_PRODUCT;
	private	BigDecimal	R40_OTHER_BORROW;
	private	String	R41_PRODUCT;
	private	BigDecimal	R41_OTHER_BORROW;
	private	String	R42_PRODUCT;
	private	BigDecimal	R42_OTHER_BORROW;
	private	String	R43_PRODUCT;
	private	BigDecimal	R43_OTHER_BORROW;
	private	String	R44_PRODUCT;
	private	BigDecimal	R44_OTHER_BORROW;
	private	String	R45_PRODUCT;
	private	BigDecimal	R45_OTHER_BORROW;
	private	String	R46_PRODUCT;
	private	BigDecimal	R46_OTHER_BORROW;
	private	String	R47_PRODUCT;
	private	BigDecimal	R47_OTHER_BORROW;
	private	String	R48_PRODUCT;
	private	BigDecimal	R48_OTHER_BORROW;
	private	String	R49_PRODUCT;
	private	BigDecimal	R49_OTHER_BORROW;
	private	String	R50_PRODUCT;
	private	BigDecimal	R50_OTHER_BORROW;
	private	String	R51_PRODUCT;
	private	BigDecimal	R51_OTHER_BORROW;
	private	String	R52_PRODUCT;
	private	BigDecimal	R52_OTHER_BORROW;
	private	String	R53_PRODUCT;
	private	BigDecimal	R53_OTHER_BORROW;
	private	String	R54_PRODUCT;
	private	BigDecimal	R54_OTHER_BORROW;
	private	String	R55_PRODUCT;
	private	BigDecimal	R55_OTHER_BORROW;
	private	String	R56_PRODUCT;
	private	BigDecimal	R56_OTHER_BORROW;
	private	String	R57_PRODUCT;
	private	BigDecimal	R57_OTHER_BORROW;
	private	String	R58_PRODUCT;
	private	BigDecimal	R58_OTHER_BORROW;
	private	String	R59_PRODUCT;
	private	BigDecimal	R59_OTHER_BORROW;
	private	String	R60_PRODUCT;
	private	BigDecimal	R60_OTHER_BORROW;
	private	String	R61_PRODUCT;
	private	BigDecimal	R61_OTHER_BORROW;
	private	String	R62_PRODUCT;
	private	BigDecimal	R62_OTHER_BORROW;
	private	String	R63_PRODUCT;
	private	BigDecimal	R63_OTHER_BORROW;
	private	String	R64_PRODUCT;
	private	BigDecimal	R64_OTHER_BORROW;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Id
    private Date report_date;
    private String REPORT_VERSION;
    private String REPORT_CODE;
    private String REPORT_DESC;
    private String ENTITY_FLG;
    private String MODIFY_FLG;
    private String DEL_FLG;


    
    
    
    
	public String getR11_PRODUCT() {
		return R11_PRODUCT;
	}






	public void setR11_PRODUCT(String r11_PRODUCT) {
		R11_PRODUCT = r11_PRODUCT;
	}






	public BigDecimal getR11_OTHER_BORROW() {
		return R11_OTHER_BORROW;
	}






	public void setR11_OTHER_BORROW(BigDecimal r11_OTHER_BORROW) {
		R11_OTHER_BORROW = r11_OTHER_BORROW;
	}






	public String getR12_PRODUCT() {
		return R12_PRODUCT;
	}






	public void setR12_PRODUCT(String r12_PRODUCT) {
		R12_PRODUCT = r12_PRODUCT;
	}






	public BigDecimal getR12_OTHER_BORROW() {
		return R12_OTHER_BORROW;
	}






	public void setR12_OTHER_BORROW(BigDecimal r12_OTHER_BORROW) {
		R12_OTHER_BORROW = r12_OTHER_BORROW;
	}






	public String getR13_PRODUCT() {
		return R13_PRODUCT;
	}






	public void setR13_PRODUCT(String r13_PRODUCT) {
		R13_PRODUCT = r13_PRODUCT;
	}






	public BigDecimal getR13_OTHER_BORROW() {
		return R13_OTHER_BORROW;
	}






	public void setR13_OTHER_BORROW(BigDecimal r13_OTHER_BORROW) {
		R13_OTHER_BORROW = r13_OTHER_BORROW;
	}






	public String getR14_PRODUCT() {
		return R14_PRODUCT;
	}






	public void setR14_PRODUCT(String r14_PRODUCT) {
		R14_PRODUCT = r14_PRODUCT;
	}






	public BigDecimal getR14_OTHER_BORROW() {
		return R14_OTHER_BORROW;
	}






	public void setR14_OTHER_BORROW(BigDecimal r14_OTHER_BORROW) {
		R14_OTHER_BORROW = r14_OTHER_BORROW;
	}






	public String getR15_PRODUCT() {
		return R15_PRODUCT;
	}






	public void setR15_PRODUCT(String r15_PRODUCT) {
		R15_PRODUCT = r15_PRODUCT;
	}






	public BigDecimal getR15_OTHER_BORROW() {
		return R15_OTHER_BORROW;
	}






	public void setR15_OTHER_BORROW(BigDecimal r15_OTHER_BORROW) {
		R15_OTHER_BORROW = r15_OTHER_BORROW;
	}






	public String getR16_PRODUCT() {
		return R16_PRODUCT;
	}






	public void setR16_PRODUCT(String r16_PRODUCT) {
		R16_PRODUCT = r16_PRODUCT;
	}






	public BigDecimal getR16_OTHER_BORROW() {
		return R16_OTHER_BORROW;
	}






	public void setR16_OTHER_BORROW(BigDecimal r16_OTHER_BORROW) {
		R16_OTHER_BORROW = r16_OTHER_BORROW;
	}






	public String getR17_PRODUCT() {
		return R17_PRODUCT;
	}






	public void setR17_PRODUCT(String r17_PRODUCT) {
		R17_PRODUCT = r17_PRODUCT;
	}






	public BigDecimal getR17_OTHER_BORROW() {
		return R17_OTHER_BORROW;
	}






	public void setR17_OTHER_BORROW(BigDecimal r17_OTHER_BORROW) {
		R17_OTHER_BORROW = r17_OTHER_BORROW;
	}






	public String getR18_PRODUCT() {
		return R18_PRODUCT;
	}






	public void setR18_PRODUCT(String r18_PRODUCT) {
		R18_PRODUCT = r18_PRODUCT;
	}






	public BigDecimal getR18_OTHER_BORROW() {
		return R18_OTHER_BORROW;
	}






	public void setR18_OTHER_BORROW(BigDecimal r18_OTHER_BORROW) {
		R18_OTHER_BORROW = r18_OTHER_BORROW;
	}






	public String getR19_PRODUCT() {
		return R19_PRODUCT;
	}






	public void setR19_PRODUCT(String r19_PRODUCT) {
		R19_PRODUCT = r19_PRODUCT;
	}






	public BigDecimal getR19_OTHER_BORROW() {
		return R19_OTHER_BORROW;
	}






	public void setR19_OTHER_BORROW(BigDecimal r19_OTHER_BORROW) {
		R19_OTHER_BORROW = r19_OTHER_BORROW;
	}






	public String getR20_PRODUCT() {
		return R20_PRODUCT;
	}






	public void setR20_PRODUCT(String r20_PRODUCT) {
		R20_PRODUCT = r20_PRODUCT;
	}






	public BigDecimal getR20_OTHER_BORROW() {
		return R20_OTHER_BORROW;
	}






	public void setR20_OTHER_BORROW(BigDecimal r20_OTHER_BORROW) {
		R20_OTHER_BORROW = r20_OTHER_BORROW;
	}






	public String getR21_PRODUCT() {
		return R21_PRODUCT;
	}






	public void setR21_PRODUCT(String r21_PRODUCT) {
		R21_PRODUCT = r21_PRODUCT;
	}






	public BigDecimal getR21_OTHER_BORROW() {
		return R21_OTHER_BORROW;
	}






	public void setR21_OTHER_BORROW(BigDecimal r21_OTHER_BORROW) {
		R21_OTHER_BORROW = r21_OTHER_BORROW;
	}






	public String getR22_PRODUCT() {
		return R22_PRODUCT;
	}






	public void setR22_PRODUCT(String r22_PRODUCT) {
		R22_PRODUCT = r22_PRODUCT;
	}






	public BigDecimal getR22_OTHER_BORROW() {
		return R22_OTHER_BORROW;
	}






	public void setR22_OTHER_BORROW(BigDecimal r22_OTHER_BORROW) {
		R22_OTHER_BORROW = r22_OTHER_BORROW;
	}






	public String getR23_PRODUCT() {
		return R23_PRODUCT;
	}






	public void setR23_PRODUCT(String r23_PRODUCT) {
		R23_PRODUCT = r23_PRODUCT;
	}






	public BigDecimal getR23_OTHER_BORROW() {
		return R23_OTHER_BORROW;
	}






	public void setR23_OTHER_BORROW(BigDecimal r23_OTHER_BORROW) {
		R23_OTHER_BORROW = r23_OTHER_BORROW;
	}






	public String getR24_PRODUCT() {
		return R24_PRODUCT;
	}






	public void setR24_PRODUCT(String r24_PRODUCT) {
		R24_PRODUCT = r24_PRODUCT;
	}






	public BigDecimal getR24_OTHER_BORROW() {
		return R24_OTHER_BORROW;
	}






	public void setR24_OTHER_BORROW(BigDecimal r24_OTHER_BORROW) {
		R24_OTHER_BORROW = r24_OTHER_BORROW;
	}






	public String getR25_PRODUCT() {
		return R25_PRODUCT;
	}






	public void setR25_PRODUCT(String r25_PRODUCT) {
		R25_PRODUCT = r25_PRODUCT;
	}






	public BigDecimal getR25_OTHER_BORROW() {
		return R25_OTHER_BORROW;
	}






	public void setR25_OTHER_BORROW(BigDecimal r25_OTHER_BORROW) {
		R25_OTHER_BORROW = r25_OTHER_BORROW;
	}






	public String getR26_PRODUCT() {
		return R26_PRODUCT;
	}






	public void setR26_PRODUCT(String r26_PRODUCT) {
		R26_PRODUCT = r26_PRODUCT;
	}






	public BigDecimal getR26_OTHER_BORROW() {
		return R26_OTHER_BORROW;
	}






	public void setR26_OTHER_BORROW(BigDecimal r26_OTHER_BORROW) {
		R26_OTHER_BORROW = r26_OTHER_BORROW;
	}






	public String getR27_PRODUCT() {
		return R27_PRODUCT;
	}






	public void setR27_PRODUCT(String r27_PRODUCT) {
		R27_PRODUCT = r27_PRODUCT;
	}






	public BigDecimal getR27_OTHER_BORROW() {
		return R27_OTHER_BORROW;
	}






	public void setR27_OTHER_BORROW(BigDecimal r27_OTHER_BORROW) {
		R27_OTHER_BORROW = r27_OTHER_BORROW;
	}






	public String getR28_PRODUCT() {
		return R28_PRODUCT;
	}






	public void setR28_PRODUCT(String r28_PRODUCT) {
		R28_PRODUCT = r28_PRODUCT;
	}






	public BigDecimal getR28_OTHER_BORROW() {
		return R28_OTHER_BORROW;
	}






	public void setR28_OTHER_BORROW(BigDecimal r28_OTHER_BORROW) {
		R28_OTHER_BORROW = r28_OTHER_BORROW;
	}






	public String getR29_PRODUCT() {
		return R29_PRODUCT;
	}






	public void setR29_PRODUCT(String r29_PRODUCT) {
		R29_PRODUCT = r29_PRODUCT;
	}






	public BigDecimal getR29_OTHER_BORROW() {
		return R29_OTHER_BORROW;
	}






	public void setR29_OTHER_BORROW(BigDecimal r29_OTHER_BORROW) {
		R29_OTHER_BORROW = r29_OTHER_BORROW;
	}






	public String getR30_PRODUCT() {
		return R30_PRODUCT;
	}






	public void setR30_PRODUCT(String r30_PRODUCT) {
		R30_PRODUCT = r30_PRODUCT;
	}






	public BigDecimal getR30_OTHER_BORROW() {
		return R30_OTHER_BORROW;
	}






	public void setR30_OTHER_BORROW(BigDecimal r30_OTHER_BORROW) {
		R30_OTHER_BORROW = r30_OTHER_BORROW;
	}






	public String getR31_PRODUCT() {
		return R31_PRODUCT;
	}






	public void setR31_PRODUCT(String r31_PRODUCT) {
		R31_PRODUCT = r31_PRODUCT;
	}






	public BigDecimal getR31_OTHER_BORROW() {
		return R31_OTHER_BORROW;
	}






	public void setR31_OTHER_BORROW(BigDecimal r31_OTHER_BORROW) {
		R31_OTHER_BORROW = r31_OTHER_BORROW;
	}






	public String getR32_PRODUCT() {
		return R32_PRODUCT;
	}






	public void setR32_PRODUCT(String r32_PRODUCT) {
		R32_PRODUCT = r32_PRODUCT;
	}






	public BigDecimal getR32_OTHER_BORROW() {
		return R32_OTHER_BORROW;
	}






	public void setR32_OTHER_BORROW(BigDecimal r32_OTHER_BORROW) {
		R32_OTHER_BORROW = r32_OTHER_BORROW;
	}






	public String getR33_PRODUCT() {
		return R33_PRODUCT;
	}






	public void setR33_PRODUCT(String r33_PRODUCT) {
		R33_PRODUCT = r33_PRODUCT;
	}






	public BigDecimal getR33_OTHER_BORROW() {
		return R33_OTHER_BORROW;
	}






	public void setR33_OTHER_BORROW(BigDecimal r33_OTHER_BORROW) {
		R33_OTHER_BORROW = r33_OTHER_BORROW;
	}






	public String getR34_PRODUCT() {
		return R34_PRODUCT;
	}






	public void setR34_PRODUCT(String r34_PRODUCT) {
		R34_PRODUCT = r34_PRODUCT;
	}






	public BigDecimal getR34_OTHER_BORROW() {
		return R34_OTHER_BORROW;
	}






	public void setR34_OTHER_BORROW(BigDecimal r34_OTHER_BORROW) {
		R34_OTHER_BORROW = r34_OTHER_BORROW;
	}






	public String getR35_PRODUCT() {
		return R35_PRODUCT;
	}






	public void setR35_PRODUCT(String r35_PRODUCT) {
		R35_PRODUCT = r35_PRODUCT;
	}






	public BigDecimal getR35_OTHER_BORROW() {
		return R35_OTHER_BORROW;
	}






	public void setR35_OTHER_BORROW(BigDecimal r35_OTHER_BORROW) {
		R35_OTHER_BORROW = r35_OTHER_BORROW;
	}






	public String getR36_PRODUCT() {
		return R36_PRODUCT;
	}






	public void setR36_PRODUCT(String r36_PRODUCT) {
		R36_PRODUCT = r36_PRODUCT;
	}






	public BigDecimal getR36_OTHER_BORROW() {
		return R36_OTHER_BORROW;
	}






	public void setR36_OTHER_BORROW(BigDecimal r36_OTHER_BORROW) {
		R36_OTHER_BORROW = r36_OTHER_BORROW;
	}






	public String getR37_PRODUCT() {
		return R37_PRODUCT;
	}






	public void setR37_PRODUCT(String r37_PRODUCT) {
		R37_PRODUCT = r37_PRODUCT;
	}






	public BigDecimal getR37_OTHER_BORROW() {
		return R37_OTHER_BORROW;
	}






	public void setR37_OTHER_BORROW(BigDecimal r37_OTHER_BORROW) {
		R37_OTHER_BORROW = r37_OTHER_BORROW;
	}






	public String getR38_PRODUCT() {
		return R38_PRODUCT;
	}






	public void setR38_PRODUCT(String r38_PRODUCT) {
		R38_PRODUCT = r38_PRODUCT;
	}






	public BigDecimal getR38_OTHER_BORROW() {
		return R38_OTHER_BORROW;
	}






	public void setR38_OTHER_BORROW(BigDecimal r38_OTHER_BORROW) {
		R38_OTHER_BORROW = r38_OTHER_BORROW;
	}






	public String getR39_PRODUCT() {
		return R39_PRODUCT;
	}






	public void setR39_PRODUCT(String r39_PRODUCT) {
		R39_PRODUCT = r39_PRODUCT;
	}






	public BigDecimal getR39_OTHER_BORROW() {
		return R39_OTHER_BORROW;
	}






	public void setR39_OTHER_BORROW(BigDecimal r39_OTHER_BORROW) {
		R39_OTHER_BORROW = r39_OTHER_BORROW;
	}






	public String getR40_PRODUCT() {
		return R40_PRODUCT;
	}






	public void setR40_PRODUCT(String r40_PRODUCT) {
		R40_PRODUCT = r40_PRODUCT;
	}






	public BigDecimal getR40_OTHER_BORROW() {
		return R40_OTHER_BORROW;
	}






	public void setR40_OTHER_BORROW(BigDecimal r40_OTHER_BORROW) {
		R40_OTHER_BORROW = r40_OTHER_BORROW;
	}






	public String getR41_PRODUCT() {
		return R41_PRODUCT;
	}






	public void setR41_PRODUCT(String r41_PRODUCT) {
		R41_PRODUCT = r41_PRODUCT;
	}






	public BigDecimal getR41_OTHER_BORROW() {
		return R41_OTHER_BORROW;
	}






	public void setR41_OTHER_BORROW(BigDecimal r41_OTHER_BORROW) {
		R41_OTHER_BORROW = r41_OTHER_BORROW;
	}






	public String getR42_PRODUCT() {
		return R42_PRODUCT;
	}






	public void setR42_PRODUCT(String r42_PRODUCT) {
		R42_PRODUCT = r42_PRODUCT;
	}






	public BigDecimal getR42_OTHER_BORROW() {
		return R42_OTHER_BORROW;
	}






	public void setR42_OTHER_BORROW(BigDecimal r42_OTHER_BORROW) {
		R42_OTHER_BORROW = r42_OTHER_BORROW;
	}






	public String getR43_PRODUCT() {
		return R43_PRODUCT;
	}






	public void setR43_PRODUCT(String r43_PRODUCT) {
		R43_PRODUCT = r43_PRODUCT;
	}






	public BigDecimal getR43_OTHER_BORROW() {
		return R43_OTHER_BORROW;
	}






	public void setR43_OTHER_BORROW(BigDecimal r43_OTHER_BORROW) {
		R43_OTHER_BORROW = r43_OTHER_BORROW;
	}






	public String getR44_PRODUCT() {
		return R44_PRODUCT;
	}






	public void setR44_PRODUCT(String r44_PRODUCT) {
		R44_PRODUCT = r44_PRODUCT;
	}






	public BigDecimal getR44_OTHER_BORROW() {
		return R44_OTHER_BORROW;
	}






	public void setR44_OTHER_BORROW(BigDecimal r44_OTHER_BORROW) {
		R44_OTHER_BORROW = r44_OTHER_BORROW;
	}






	public String getR45_PRODUCT() {
		return R45_PRODUCT;
	}






	public void setR45_PRODUCT(String r45_PRODUCT) {
		R45_PRODUCT = r45_PRODUCT;
	}






	public BigDecimal getR45_OTHER_BORROW() {
		return R45_OTHER_BORROW;
	}






	public void setR45_OTHER_BORROW(BigDecimal r45_OTHER_BORROW) {
		R45_OTHER_BORROW = r45_OTHER_BORROW;
	}






	public String getR46_PRODUCT() {
		return R46_PRODUCT;
	}






	public void setR46_PRODUCT(String r46_PRODUCT) {
		R46_PRODUCT = r46_PRODUCT;
	}






	public BigDecimal getR46_OTHER_BORROW() {
		return R46_OTHER_BORROW;
	}






	public void setR46_OTHER_BORROW(BigDecimal r46_OTHER_BORROW) {
		R46_OTHER_BORROW = r46_OTHER_BORROW;
	}






	public String getR47_PRODUCT() {
		return R47_PRODUCT;
	}






	public void setR47_PRODUCT(String r47_PRODUCT) {
		R47_PRODUCT = r47_PRODUCT;
	}






	public BigDecimal getR47_OTHER_BORROW() {
		return R47_OTHER_BORROW;
	}






	public void setR47_OTHER_BORROW(BigDecimal r47_OTHER_BORROW) {
		R47_OTHER_BORROW = r47_OTHER_BORROW;
	}






	public String getR48_PRODUCT() {
		return R48_PRODUCT;
	}






	public void setR48_PRODUCT(String r48_PRODUCT) {
		R48_PRODUCT = r48_PRODUCT;
	}






	public BigDecimal getR48_OTHER_BORROW() {
		return R48_OTHER_BORROW;
	}






	public void setR48_OTHER_BORROW(BigDecimal r48_OTHER_BORROW) {
		R48_OTHER_BORROW = r48_OTHER_BORROW;
	}






	public String getR49_PRODUCT() {
		return R49_PRODUCT;
	}






	public void setR49_PRODUCT(String r49_PRODUCT) {
		R49_PRODUCT = r49_PRODUCT;
	}






	public BigDecimal getR49_OTHER_BORROW() {
		return R49_OTHER_BORROW;
	}






	public void setR49_OTHER_BORROW(BigDecimal r49_OTHER_BORROW) {
		R49_OTHER_BORROW = r49_OTHER_BORROW;
	}






	public String getR50_PRODUCT() {
		return R50_PRODUCT;
	}






	public void setR50_PRODUCT(String r50_PRODUCT) {
		R50_PRODUCT = r50_PRODUCT;
	}






	public BigDecimal getR50_OTHER_BORROW() {
		return R50_OTHER_BORROW;
	}






	public void setR50_OTHER_BORROW(BigDecimal r50_OTHER_BORROW) {
		R50_OTHER_BORROW = r50_OTHER_BORROW;
	}






	public String getR51_PRODUCT() {
		return R51_PRODUCT;
	}






	public void setR51_PRODUCT(String r51_PRODUCT) {
		R51_PRODUCT = r51_PRODUCT;
	}






	public BigDecimal getR51_OTHER_BORROW() {
		return R51_OTHER_BORROW;
	}






	public void setR51_OTHER_BORROW(BigDecimal r51_OTHER_BORROW) {
		R51_OTHER_BORROW = r51_OTHER_BORROW;
	}






	public String getR52_PRODUCT() {
		return R52_PRODUCT;
	}






	public void setR52_PRODUCT(String r52_PRODUCT) {
		R52_PRODUCT = r52_PRODUCT;
	}






	public BigDecimal getR52_OTHER_BORROW() {
		return R52_OTHER_BORROW;
	}






	public void setR52_OTHER_BORROW(BigDecimal r52_OTHER_BORROW) {
		R52_OTHER_BORROW = r52_OTHER_BORROW;
	}






	public String getR53_PRODUCT() {
		return R53_PRODUCT;
	}






	public void setR53_PRODUCT(String r53_PRODUCT) {
		R53_PRODUCT = r53_PRODUCT;
	}






	public BigDecimal getR53_OTHER_BORROW() {
		return R53_OTHER_BORROW;
	}






	public void setR53_OTHER_BORROW(BigDecimal r53_OTHER_BORROW) {
		R53_OTHER_BORROW = r53_OTHER_BORROW;
	}






	public String getR54_PRODUCT() {
		return R54_PRODUCT;
	}






	public void setR54_PRODUCT(String r54_PRODUCT) {
		R54_PRODUCT = r54_PRODUCT;
	}






	public BigDecimal getR54_OTHER_BORROW() {
		return R54_OTHER_BORROW;
	}






	public void setR54_OTHER_BORROW(BigDecimal r54_OTHER_BORROW) {
		R54_OTHER_BORROW = r54_OTHER_BORROW;
	}






	public String getR55_PRODUCT() {
		return R55_PRODUCT;
	}






	public void setR55_PRODUCT(String r55_PRODUCT) {
		R55_PRODUCT = r55_PRODUCT;
	}






	public BigDecimal getR55_OTHER_BORROW() {
		return R55_OTHER_BORROW;
	}






	public void setR55_OTHER_BORROW(BigDecimal r55_OTHER_BORROW) {
		R55_OTHER_BORROW = r55_OTHER_BORROW;
	}






	public String getR56_PRODUCT() {
		return R56_PRODUCT;
	}






	public void setR56_PRODUCT(String r56_PRODUCT) {
		R56_PRODUCT = r56_PRODUCT;
	}






	public BigDecimal getR56_OTHER_BORROW() {
		return R56_OTHER_BORROW;
	}






	public void setR56_OTHER_BORROW(BigDecimal r56_OTHER_BORROW) {
		R56_OTHER_BORROW = r56_OTHER_BORROW;
	}






	public String getR57_PRODUCT() {
		return R57_PRODUCT;
	}






	public void setR57_PRODUCT(String r57_PRODUCT) {
		R57_PRODUCT = r57_PRODUCT;
	}






	public BigDecimal getR57_OTHER_BORROW() {
		return R57_OTHER_BORROW;
	}






	public void setR57_OTHER_BORROW(BigDecimal r57_OTHER_BORROW) {
		R57_OTHER_BORROW = r57_OTHER_BORROW;
	}






	public String getR58_PRODUCT() {
		return R58_PRODUCT;
	}






	public void setR58_PRODUCT(String r58_PRODUCT) {
		R58_PRODUCT = r58_PRODUCT;
	}






	public BigDecimal getR58_OTHER_BORROW() {
		return R58_OTHER_BORROW;
	}






	public void setR58_OTHER_BORROW(BigDecimal r58_OTHER_BORROW) {
		R58_OTHER_BORROW = r58_OTHER_BORROW;
	}






	public String getR59_PRODUCT() {
		return R59_PRODUCT;
	}






	public void setR59_PRODUCT(String r59_PRODUCT) {
		R59_PRODUCT = r59_PRODUCT;
	}






	public BigDecimal getR59_OTHER_BORROW() {
		return R59_OTHER_BORROW;
	}






	public void setR59_OTHER_BORROW(BigDecimal r59_OTHER_BORROW) {
		R59_OTHER_BORROW = r59_OTHER_BORROW;
	}






	public String getR60_PRODUCT() {
		return R60_PRODUCT;
	}






	public void setR60_PRODUCT(String r60_PRODUCT) {
		R60_PRODUCT = r60_PRODUCT;
	}






	public BigDecimal getR60_OTHER_BORROW() {
		return R60_OTHER_BORROW;
	}






	public void setR60_OTHER_BORROW(BigDecimal r60_OTHER_BORROW) {
		R60_OTHER_BORROW = r60_OTHER_BORROW;
	}






	public String getR61_PRODUCT() {
		return R61_PRODUCT;
	}






	public void setR61_PRODUCT(String r61_PRODUCT) {
		R61_PRODUCT = r61_PRODUCT;
	}






	public BigDecimal getR61_OTHER_BORROW() {
		return R61_OTHER_BORROW;
	}






	public void setR61_OTHER_BORROW(BigDecimal r61_OTHER_BORROW) {
		R61_OTHER_BORROW = r61_OTHER_BORROW;
	}






	public String getR62_PRODUCT() {
		return R62_PRODUCT;
	}






	public void setR62_PRODUCT(String r62_PRODUCT) {
		R62_PRODUCT = r62_PRODUCT;
	}






	public BigDecimal getR62_OTHER_BORROW() {
		return R62_OTHER_BORROW;
	}






	public void setR62_OTHER_BORROW(BigDecimal r62_OTHER_BORROW) {
		R62_OTHER_BORROW = r62_OTHER_BORROW;
	}






	public String getR63_PRODUCT() {
		return R63_PRODUCT;
	}






	public void setR63_PRODUCT(String r63_PRODUCT) {
		R63_PRODUCT = r63_PRODUCT;
	}






	public BigDecimal getR63_OTHER_BORROW() {
		return R63_OTHER_BORROW;
	}






	public void setR63_OTHER_BORROW(BigDecimal r63_OTHER_BORROW) {
		R63_OTHER_BORROW = r63_OTHER_BORROW;
	}






	public String getR64_PRODUCT() {
		return R64_PRODUCT;
	}






	public void setR64_PRODUCT(String r64_PRODUCT) {
		R64_PRODUCT = r64_PRODUCT;
	}






	public BigDecimal getR64_OTHER_BORROW() {
		return R64_OTHER_BORROW;
	}






	public void setR64_OTHER_BORROW(BigDecimal r64_OTHER_BORROW) {
		R64_OTHER_BORROW = r64_OTHER_BORROW;
	}






	public Date getReport_date() {
		return report_date;
	}






	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}






	public String getREPORT_VERSION() {
		return REPORT_VERSION;
	}






	public void setREPORT_VERSION(String rEPORT_VERSION) {
		REPORT_VERSION = rEPORT_VERSION;
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






	public BRRS_M_OB_Summary_Entity() {
        super();
    }

}