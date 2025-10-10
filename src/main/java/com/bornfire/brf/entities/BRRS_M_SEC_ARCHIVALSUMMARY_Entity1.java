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
@Table(name = "BRRS_M_SEC_ARCHIVALSUMMARYTABLE")
public class BRRS_M_SEC_ARCHIVALSUMMARY_Entity1 {
		private String R11_PRODUCT;
		private BigDecimal R11_TCA;
		private String R12_PRODUCT;
		private BigDecimal R12_TCA;
		private String R13_PRODUCT;
		private BigDecimal R13_TCA;
		private String R14_PRODUCT;
		private BigDecimal R14_TCA;
		private String R15_PRODUCT;
		private BigDecimal R15_TCA;
		private String R16_PRODUCT;
		private BigDecimal R16_TCA;
		private String R17_PRODUCT;
		private BigDecimal R17_TCA;
		private String R18_PRODUCT;
		private BigDecimal R18_TCA;
		private String R19_PRODUCT;
		private BigDecimal R19_TCA;

		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		@Id
		private Date REPORT_DATE;

		private String REPORT_VERSION;
		private String REPORT_FREQUENCY;
		private String REPORT_CODE;
		private String REPORT_DESC;
		private String ENTITY_FLG;
		private String MODIFY_FLG;
		private String DEL_FLG;


		public String getR11_PRODUCT() {
		    return R11_PRODUCT;
		}

		public void setR11_PRODUCT(String r11_PRODUCT) {
		    this.R11_PRODUCT = r11_PRODUCT;
		}

		public BigDecimal getR11_TCA() {
		    return R11_TCA;
		}

		public void setR11_TCA(BigDecimal r11_TCA) {
		    this.R11_TCA = r11_TCA;
		}

		public String getR12_PRODUCT() {
		    return R12_PRODUCT;
		}

		public void setR12_PRODUCT(String r12_PRODUCT) {
		    this.R12_PRODUCT = r12_PRODUCT;
		}

		public BigDecimal getR12_TCA() {
		    return R12_TCA;
		}

		public void setR12_TCA(BigDecimal r12_TCA) {
		    this.R12_TCA = r12_TCA;
		}

		public String getR13_PRODUCT() {
		    return R13_PRODUCT;
		}

		public void setR13_PRODUCT(String r13_PRODUCT) {
		    this.R13_PRODUCT = r13_PRODUCT;
		}

		public BigDecimal getR13_TCA() {
		    return R13_TCA;
		}

		public void setR13_TCA(BigDecimal r13_TCA) {
		    this.R13_TCA = r13_TCA;
		}

		public String getR14_PRODUCT() {
		    return R14_PRODUCT;
		}

		public void setR14_PRODUCT(String r14_PRODUCT) {
		    this.R14_PRODUCT = r14_PRODUCT;
		}

		public BigDecimal getR14_TCA() {
		    return R14_TCA;
		}

		public void setR14_TCA(BigDecimal r14_TCA) {
		    this.R14_TCA = r14_TCA;
		}

		public String getR15_PRODUCT() {
		    return R15_PRODUCT;
		}

		public void setR15_PRODUCT(String r15_PRODUCT) {
		    this.R15_PRODUCT = r15_PRODUCT;
		}

		public BigDecimal getR15_TCA() {
		    return R15_TCA;
		}

		public void setR15_TCA(BigDecimal r15_TCA) {
		    this.R15_TCA = r15_TCA;
		}

		public String getR16_PRODUCT() {
		    return R16_PRODUCT;
		}

		public void setR16_PRODUCT(String r16_PRODUCT) {
		    this.R16_PRODUCT = r16_PRODUCT;
		}

		public BigDecimal getR16_TCA() {
		    return R16_TCA;
		}

		public void setR16_TCA(BigDecimal r16_TCA) {
		    this.R16_TCA = r16_TCA;
		}

		public String getR17_PRODUCT() {
		    return R17_PRODUCT;
		}

		public void setR17_PRODUCT(String r17_PRODUCT) {
		    this.R17_PRODUCT = r17_PRODUCT;
		}

		public BigDecimal getR17_TCA() {
		    return R17_TCA;
		}

		public void setR17_TCA(BigDecimal r17_TCA) {
		    this.R17_TCA = r17_TCA;
		}

		public String getR18_PRODUCT() {
		    return R18_PRODUCT;
		}

		public void setR18_PRODUCT(String r18_PRODUCT) {
		    this.R18_PRODUCT = r18_PRODUCT;
		}

		public BigDecimal getR18_TCA() {
		    return R18_TCA;
		}

		public void setR18_TCA(BigDecimal r18_TCA) {
		    this.R18_TCA = r18_TCA;
		}

		public String getR19_PRODUCT() {
		    return R19_PRODUCT;
		}

		public void setR19_PRODUCT(String r19_PRODUCT) {
		    this.R19_PRODUCT = r19_PRODUCT;
		}

		public BigDecimal getR19_TCA() {
		    return R19_TCA;
		}

		public void setR19_TCA(BigDecimal r19_TCA) {
		    this.R19_TCA = r19_TCA;
		}

		public Date getREPORT_DATE() {
		    return REPORT_DATE;
		}

		public void setREPORT_DATE(Date REPORT_DATE) {
		    this.REPORT_DATE = REPORT_DATE;
		}

		public String getREPORT_VERSION() {
		    return REPORT_VERSION;
		}

		public void setREPORT_VERSION(String REPORT_VERSION) {
		    this.REPORT_VERSION = REPORT_VERSION;
		}

		public String getREPORT_FREQUENCY() {
		    return REPORT_FREQUENCY;
		}

		public void setREPORT_FREQUENCY(String REPORT_FREQUENCY) {
		    this.REPORT_FREQUENCY = REPORT_FREQUENCY;
		}

		public String getREPORT_CODE() {
		    return REPORT_CODE;
		}

		public void setREPORT_CODE(String REPORT_CODE) {
		    this.REPORT_CODE = REPORT_CODE;
		}

		public String getREPORT_DESC() {
		    return REPORT_DESC;
		}

		public void setREPORT_DESC(String REPORT_DESC) {
		    this.REPORT_DESC = REPORT_DESC;
		}

		public String getENTITY_FLG() {
		    return ENTITY_FLG;
		}

		public void setENTITY_FLG(String ENTITY_FLG) {
		    this.ENTITY_FLG = ENTITY_FLG;
		}

		public String getMODIFY_FLG() {
		    return MODIFY_FLG;
		}

		public void setMODIFY_FLG(String MODIFY_FLG) {
		    this.MODIFY_FLG = MODIFY_FLG;
		}

		public String getDEL_FLG() {
		    return DEL_FLG;
		}

		public void setDEL_FLG(String DEL_FLG) {
		    this.DEL_FLG = DEL_FLG;
		}

		public BRRS_M_SEC_ARCHIVALSUMMARY_Entity1() {
			super();
			// TODO Auto-generated constructor stub
		}

}

