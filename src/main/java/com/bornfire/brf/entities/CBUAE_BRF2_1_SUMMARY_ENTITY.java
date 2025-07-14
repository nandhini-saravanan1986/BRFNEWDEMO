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
@Table(name = "CBUAE_BRF2_1_SUMMARYTABLE")

public class CBUAE_BRF2_1_SUMMARY_ENTITY {

	private String r0010_product;
	private String r0020_product;
	private BigDecimal r0020_amount;
	private String r0030_product;
	private BigDecimal r0030_amount;
	private String r0040_product;
	private BigDecimal r0040_amount;
	private String r0050_product;
	private BigDecimal r0050_amount;
	private String r0060_product;
	private BigDecimal r0060_amount;
	private String r0070_product;
	private BigDecimal r0070_amount;
	private String r0080_product;
	private BigDecimal r0080_amount;
	private String r0090_product;
	private BigDecimal r0090_amount;
	private String r0100_product;
	private String r0110_product;
	private BigDecimal r0110_amount;
	private String r0120_product;
	private BigDecimal r0120_amount;
	private String r0130_product;
	private BigDecimal r0130_amount;
	private String r0140_product;
	private BigDecimal r0140_amount;
	private String r0150_product;
	private BigDecimal r0150_amount;
	private String r0160_product;
	private BigDecimal r0160_amount;
	private String r0170_product;
	private BigDecimal r0170_amount;
	private String r0180_product;
	private BigDecimal r0180_amount;
	private String r0190_product;
	private BigDecimal r0190_amount;
	private String r0200_product;
	private String r0210_product;
	private BigDecimal r0210_amount;
	private String r0220_product;
	private BigDecimal r0220_amount;
	private String r0230_product;
	private BigDecimal r0230_amount;
	private String r0240_product;
	private BigDecimal r0240_amount;
	private String r0250_product;
	private BigDecimal r0250_amount;
	private String r0260_product;
	private BigDecimal r0260_amount;
	private String r0270_product;
	private BigDecimal r0270_amount;
	private String r0280_product;
	private BigDecimal r0280_amount;
	private String r0290_product;
	private BigDecimal r0290_amount;
	private String r0300_product;
	private BigDecimal r0300_amount;
	private String r0310_product;
	private BigDecimal r0310_amount;
	private String r0320_product;
	private BigDecimal r0320_amount;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date report_date;
	private String report_version;
	private String report_frequency;
	private String report_code;
	private String report_desc;
	private String modify_flg;
	private String entity_flg;
	private String delete_flg;
	
	
	
	
	public String getR0010_product() {
		return r0010_product;
	}
	public void setR0010_product(String r0010_product) {
		this.r0010_product = r0010_product;
	}
	public String getR0020_product() {
		return r0020_product;
	}
	public void setR0020_product(String r0020_product) {
		this.r0020_product = r0020_product;
	}
	public BigDecimal getR0020_amount() {
		return r0020_amount;
	}
	public void setR0020_amount(BigDecimal r0020_amount) {
		this.r0020_amount = r0020_amount;
	}
	public String getR0030_product() {
		return r0030_product;
	}
	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}
	public BigDecimal getR0030_amount() {
		return r0030_amount;
	}
	public void setR0030_amount(BigDecimal r0030_amount) {
		this.r0030_amount = r0030_amount;
	}
	public String getR0040_product() {
		return r0040_product;
	}
	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}
	public BigDecimal getR0040_amount() {
		return r0040_amount;
	}
	public void setR0040_amount(BigDecimal r0040_amount) {
		this.r0040_amount = r0040_amount;
	}
	public String getR0050_product() {
		return r0050_product;
	}
	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}
	public BigDecimal getR0050_amount() {
		return r0050_amount;
	}
	public void setR0050_amount(BigDecimal r0050_amount) {
		this.r0050_amount = r0050_amount;
	}
	public String getR0060_product() {
		return r0060_product;
	}
	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}
	public BigDecimal getR0060_amount() {
		return r0060_amount;
	}
	public void setR0060_amount(BigDecimal r0060_amount) {
		this.r0060_amount = r0060_amount;
	}
	public String getR0070_product() {
		return r0070_product;
	}
	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}
	public BigDecimal getR0070_amount() {
		return r0070_amount;
	}
	public void setR0070_amount(BigDecimal r0070_amount) {
		this.r0070_amount = r0070_amount;
	}
	public String getR0080_product() {
		return r0080_product;
	}
	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}
	public BigDecimal getR0080_amount() {
		return r0080_amount;
	}
	public void setR0080_amount(BigDecimal r0080_amount) {
		this.r0080_amount = r0080_amount;
	}
	public String getR0090_product() {
		return r0090_product;
	}
	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}
	public BigDecimal getR0090_amount() {
		return r0090_amount;
	}
	public void setR0090_amount(BigDecimal r0090_amount) {
		this.r0090_amount = r0090_amount;
	}
	public String getR0100_product() {
		return r0100_product;
	}
	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}
	public String getR0110_product() {
		return r0110_product;
	}
	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}
	public BigDecimal getR0110_amount() {
		return r0110_amount;
	}
	public void setR0110_amount(BigDecimal r0110_amount) {
		this.r0110_amount = r0110_amount;
	}
	public String getR0120_product() {
		return r0120_product;
	}
	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}
	public BigDecimal getR0120_amount() {
		return r0120_amount;
	}
	public void setR0120_amount(BigDecimal r0120_amount) {
		this.r0120_amount = r0120_amount;
	}
	public String getR0130_product() {
		return r0130_product;
	}
	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}
	public BigDecimal getR0130_amount() {
		return r0130_amount;
	}
	public void setR0130_amount(BigDecimal r0130_amount) {
		this.r0130_amount = r0130_amount;
	}
	public String getR0140_product() {
		return r0140_product;
	}
	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}
	public BigDecimal getR0140_amount() {
		return r0140_amount;
	}
	public void setR0140_amount(BigDecimal r0140_amount) {
		this.r0140_amount = r0140_amount;
	}
	public String getR0150_product() {
		return r0150_product;
	}
	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}
	public BigDecimal getR0150_amount() {
		return r0150_amount;
	}
	public void setR0150_amount(BigDecimal r0150_amount) {
		this.r0150_amount = r0150_amount;
	}
	public String getR0160_product() {
		return r0160_product;
	}
	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}
	public BigDecimal getR0160_amount() {
		return r0160_amount;
	}
	public void setR0160_amount(BigDecimal r0160_amount) {
		this.r0160_amount = r0160_amount;
	}
	public String getR0170_product() {
		return r0170_product;
	}
	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}
	public BigDecimal getR0170_amount() {
		return r0170_amount;
	}
	public void setR0170_amount(BigDecimal r0170_amount) {
		this.r0170_amount = r0170_amount;
	}
	public String getR0180_product() {
		return r0180_product;
	}
	public void setR0180_product(String r0180_product) {
		this.r0180_product = r0180_product;
	}
	public BigDecimal getR0180_amount() {
		return r0180_amount;
	}
	public void setR0180_amount(BigDecimal r0180_amount) {
		this.r0180_amount = r0180_amount;
	}
	public String getR0190_product() {
		return r0190_product;
	}
	public void setR0190_product(String r0190_product) {
		this.r0190_product = r0190_product;
	}
	public BigDecimal getR0190_amount() {
		return r0190_amount;
	}
	public void setR0190_amount(BigDecimal r0190_amount) {
		this.r0190_amount = r0190_amount;
	}
	public String getR0200_product() {
		return r0200_product;
	}
	public void setR0200_product(String r0200_product) {
		this.r0200_product = r0200_product;
	}
	public String getR0210_product() {
		return r0210_product;
	}
	public void setR0210_product(String r0210_product) {
		this.r0210_product = r0210_product;
	}
	public BigDecimal getR0210_amount() {
		return r0210_amount;
	}
	public void setR0210_amount(BigDecimal r0210_amount) {
		this.r0210_amount = r0210_amount;
	}
	public String getR0220_product() {
		return r0220_product;
	}
	public void setR0220_product(String r0220_product) {
		this.r0220_product = r0220_product;
	}
	public BigDecimal getR0220_amount() {
		return r0220_amount;
	}
	public void setR0220_amount(BigDecimal r0220_amount) {
		this.r0220_amount = r0220_amount;
	}
	public String getR0230_product() {
		return r0230_product;
	}
	public void setR0230_product(String r0230_product) {
		this.r0230_product = r0230_product;
	}
	public BigDecimal getR0230_amount() {
		return r0230_amount;
	}
	public void setR0230_amount(BigDecimal r0230_amount) {
		this.r0230_amount = r0230_amount;
	}
	public String getR0240_product() {
		return r0240_product;
	}
	public void setR0240_product(String r0240_product) {
		this.r0240_product = r0240_product;
	}
	public BigDecimal getR0240_amount() {
		return r0240_amount;
	}
	public void setR0240_amount(BigDecimal r0240_amount) {
		this.r0240_amount = r0240_amount;
	}
	public String getR0250_product() {
		return r0250_product;
	}
	public void setR0250_product(String r0250_product) {
		this.r0250_product = r0250_product;
	}
	public BigDecimal getR0250_amount() {
		return r0250_amount;
	}
	public void setR0250_amount(BigDecimal r0250_amount) {
		this.r0250_amount = r0250_amount;
	}
	public String getR0260_product() {
		return r0260_product;
	}
	public void setR0260_product(String r0260_product) {
		this.r0260_product = r0260_product;
	}
	public BigDecimal getR0260_amount() {
		return r0260_amount;
	}
	public void setR0260_amount(BigDecimal r0260_amount) {
		this.r0260_amount = r0260_amount;
	}
	public String getR0270_product() {
		return r0270_product;
	}
	public void setR0270_product(String r0270_product) {
		this.r0270_product = r0270_product;
	}
	public BigDecimal getR0270_amount() {
		return r0270_amount;
	}
	public void setR0270_amount(BigDecimal r0270_amount) {
		this.r0270_amount = r0270_amount;
	}
	public String getR0280_product() {
		return r0280_product;
	}
	public void setR0280_product(String r0280_product) {
		this.r0280_product = r0280_product;
	}
	public BigDecimal getR0280_amount() {
		return r0280_amount;
	}
	public void setR0280_amount(BigDecimal r0280_amount) {
		this.r0280_amount = r0280_amount;
	}
	public String getR0290_product() {
		return r0290_product;
	}
	public void setR0290_product(String r0290_product) {
		this.r0290_product = r0290_product;
	}
	public BigDecimal getR0290_amount() {
		return r0290_amount;
	}
	public void setR0290_amount(BigDecimal r0290_amount) {
		this.r0290_amount = r0290_amount;
	}
	public String getR0300_product() {
		return r0300_product;
	}
	public void setR0300_product(String r0300_product) {
		this.r0300_product = r0300_product;
	}
	public BigDecimal getR0300_amount() {
		return r0300_amount;
	}
	public void setR0300_amount(BigDecimal r0300_amount) {
		this.r0300_amount = r0300_amount;
	}
	public String getR0310_product() {
		return r0310_product;
	}
	public void setR0310_product(String r0310_product) {
		this.r0310_product = r0310_product;
	}
	public BigDecimal getR0310_amount() {
		return r0310_amount;
	}
	public void setR0310_amount(BigDecimal r0310_amount) {
		this.r0310_amount = r0310_amount;
	}
	public String getR0320_product() {
		return r0320_product;
	}
	public void setR0320_product(String r0320_product) {
		this.r0320_product = r0320_product;
	}
	public BigDecimal getR0320_amount() {
		return r0320_amount;
	}
	public void setR0320_amount(BigDecimal r0320_amount) {
		this.r0320_amount = r0320_amount;
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
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getDelete_flg() {
		return delete_flg;
	}
	public void setDelete_flg(String delete_flg) {
		this.delete_flg = delete_flg;
	}
	
	
	
	
	public CBUAE_BRF2_1_SUMMARY_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
