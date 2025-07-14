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
@Table(name = "CBUAE_BRF2_2_SUMMARYTABLE")

public class CBUAE_BRF2_2_SUMMARY_ENTITY {
	
	
	private String r0010_product;
	private String r0020_product;
	private BigDecimal r0020_nominal_amount;
	private BigDecimal r0020_asset;
	private String r0030_product;
	private BigDecimal r0030_nominal_amount;
	private BigDecimal r0030_asset;
	private String r0040_product;
	private BigDecimal r0040_nominal_amount;
	private BigDecimal r0040_asset;
	private String r0050_product;
	private BigDecimal r0050_nominal_amount;
	private BigDecimal r0050_asset;
	private String r0060_product;
	private BigDecimal r0060_nominal_amount;
	private BigDecimal r0060_asset;
	private String r0070_product;
	private BigDecimal r0070_nominal_amount;
	private BigDecimal r0070_asset;
	private String r0080_product;
	private BigDecimal r0080_nominal_amount;
	private BigDecimal r0080_asset;
	private String r0090_product;
	private BigDecimal r0090_nominal_amount;
	private BigDecimal r0090_asset;
	private String r0100_product;
	private BigDecimal r0100_nominal_amount;
	private BigDecimal r0100_asset;
	private String r0110_product;
	private BigDecimal r0110_nominal_amount;
	private BigDecimal r0110_asset;
	private String r0120_product;
	private BigDecimal r0120_nominal_amount;
	private BigDecimal r0120_asset;
	private String r0130_product;
	private BigDecimal r0130_nominal_amount;
	private BigDecimal r0130_asset;
	private String r0140_product;
	private BigDecimal r0140_nominal_amount;
	private BigDecimal r0140_asset;
	private String r0150_product;
	private BigDecimal r0150_nominal_amount;
	private BigDecimal r0150_asset;
	private String r0160_product;
	private String r0170_product;
	private BigDecimal r0170_nominal_amount;
	private BigDecimal r0170_asset;
	
	
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
	public BigDecimal getR0020_nominal_amount() {
		return r0020_nominal_amount;
	}
	public void setR0020_nominal_amount(BigDecimal r0020_nominal_amount) {
		this.r0020_nominal_amount = r0020_nominal_amount;
	}
	public BigDecimal getR0020_asset() {
		return r0020_asset;
	}
	public void setR0020_asset(BigDecimal r0020_asset) {
		this.r0020_asset = r0020_asset;
	}
	public String getR0030_product() {
		return r0030_product;
	}
	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}
	public BigDecimal getR0030_nominal_amount() {
		return r0030_nominal_amount;
	}
	public void setR0030_nominal_amount(BigDecimal r0030_nominal_amount) {
		this.r0030_nominal_amount = r0030_nominal_amount;
	}
	public BigDecimal getR0030_asset() {
		return r0030_asset;
	}
	public void setR0030_asset(BigDecimal r0030_asset) {
		this.r0030_asset = r0030_asset;
	}
	public String getR0040_product() {
		return r0040_product;
	}
	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}
	public BigDecimal getR0040_nominal_amount() {
		return r0040_nominal_amount;
	}
	public void setR0040_nominal_amount(BigDecimal r0040_nominal_amount) {
		this.r0040_nominal_amount = r0040_nominal_amount;
	}
	public BigDecimal getR0040_asset() {
		return r0040_asset;
	}
	public void setR0040_asset(BigDecimal r0040_asset) {
		this.r0040_asset = r0040_asset;
	}
	public String getR0050_product() {
		return r0050_product;
	}
	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}
	public BigDecimal getR0050_nominal_amount() {
		return r0050_nominal_amount;
	}
	public void setR0050_nominal_amount(BigDecimal r0050_nominal_amount) {
		this.r0050_nominal_amount = r0050_nominal_amount;
	}
	public BigDecimal getR0050_asset() {
		return r0050_asset;
	}
	public void setR0050_asset(BigDecimal r0050_asset) {
		this.r0050_asset = r0050_asset;
	}
	public String getR0060_product() {
		return r0060_product;
	}
	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}
	public BigDecimal getR0060_nominal_amount() {
		return r0060_nominal_amount;
	}
	public void setR0060_nominal_amount(BigDecimal r0060_nominal_amount) {
		this.r0060_nominal_amount = r0060_nominal_amount;
	}
	public BigDecimal getR0060_asset() {
		return r0060_asset;
	}
	public void setR0060_asset(BigDecimal r0060_asset) {
		this.r0060_asset = r0060_asset;
	}
	public String getR0070_product() {
		return r0070_product;
	}
	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}
	public BigDecimal getR0070_nominal_amount() {
		return r0070_nominal_amount;
	}
	public void setR0070_nominal_amount(BigDecimal r0070_nominal_amount) {
		this.r0070_nominal_amount = r0070_nominal_amount;
	}
	public BigDecimal getR0070_asset() {
		return r0070_asset;
	}
	public void setR0070_asset(BigDecimal r0070_asset) {
		this.r0070_asset = r0070_asset;
	}
	public String getR0080_product() {
		return r0080_product;
	}
	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}
	public BigDecimal getR0080_nominal_amount() {
		return r0080_nominal_amount;
	}
	public void setR0080_nominal_amount(BigDecimal r0080_nominal_amount) {
		this.r0080_nominal_amount = r0080_nominal_amount;
	}
	public BigDecimal getR0080_asset() {
		return r0080_asset;
	}
	public void setR0080_asset(BigDecimal r0080_asset) {
		this.r0080_asset = r0080_asset;
	}
	public String getR0090_product() {
		return r0090_product;
	}
	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}
	public BigDecimal getR0090_nominal_amount() {
		return r0090_nominal_amount;
	}
	public void setR0090_nominal_amount(BigDecimal r0090_nominal_amount) {
		this.r0090_nominal_amount = r0090_nominal_amount;
	}
	public BigDecimal getR0090_asset() {
		return r0090_asset;
	}
	public void setR0090_asset(BigDecimal r0090_asset) {
		this.r0090_asset = r0090_asset;
	}
	public String getR0100_product() {
		return r0100_product;
	}
	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}
	public BigDecimal getR0100_nominal_amount() {
		return r0100_nominal_amount;
	}
	public void setR0100_nominal_amount(BigDecimal r0100_nominal_amount) {
		this.r0100_nominal_amount = r0100_nominal_amount;
	}
	public BigDecimal getR0100_asset() {
		return r0100_asset;
	}
	public void setR0100_asset(BigDecimal r0100_asset) {
		this.r0100_asset = r0100_asset;
	}
	public String getR0110_product() {
		return r0110_product;
	}
	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}
	public BigDecimal getR0110_nominal_amount() {
		return r0110_nominal_amount;
	}
	public void setR0110_nominal_amount(BigDecimal r0110_nominal_amount) {
		this.r0110_nominal_amount = r0110_nominal_amount;
	}
	public BigDecimal getR0110_asset() {
		return r0110_asset;
	}
	public void setR0110_asset(BigDecimal r0110_asset) {
		this.r0110_asset = r0110_asset;
	}
	public String getR0120_product() {
		return r0120_product;
	}
	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}
	public BigDecimal getR0120_nominal_amount() {
		return r0120_nominal_amount;
	}
	public void setR0120_nominal_amount(BigDecimal r0120_nominal_amount) {
		this.r0120_nominal_amount = r0120_nominal_amount;
	}
	public BigDecimal getR0120_asset() {
		return r0120_asset;
	}
	public void setR0120_asset(BigDecimal r0120_asset) {
		this.r0120_asset = r0120_asset;
	}
	public String getR0130_product() {
		return r0130_product;
	}
	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}
	public BigDecimal getR0130_nominal_amount() {
		return r0130_nominal_amount;
	}
	public void setR0130_nominal_amount(BigDecimal r0130_nominal_amount) {
		this.r0130_nominal_amount = r0130_nominal_amount;
	}
	public BigDecimal getR0130_asset() {
		return r0130_asset;
	}
	public void setR0130_asset(BigDecimal r0130_asset) {
		this.r0130_asset = r0130_asset;
	}
	public String getR0140_product() {
		return r0140_product;
	}
	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}
	public BigDecimal getR0140_nominal_amount() {
		return r0140_nominal_amount;
	}
	public void setR0140_nominal_amount(BigDecimal r0140_nominal_amount) {
		this.r0140_nominal_amount = r0140_nominal_amount;
	}
	public BigDecimal getR0140_asset() {
		return r0140_asset;
	}
	public void setR0140_asset(BigDecimal r0140_asset) {
		this.r0140_asset = r0140_asset;
	}
	public String getR0150_product() {
		return r0150_product;
	}
	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}
	public BigDecimal getR0150_nominal_amount() {
		return r0150_nominal_amount;
	}
	public void setR0150_nominal_amount(BigDecimal r0150_nominal_amount) {
		this.r0150_nominal_amount = r0150_nominal_amount;
	}
	public BigDecimal getR0150_asset() {
		return r0150_asset;
	}
	public void setR0150_asset(BigDecimal r0150_asset) {
		this.r0150_asset = r0150_asset;
	}
	public String getR0160_product() {
		return r0160_product;
	}
	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}
	public String getR0170_product() {
		return r0170_product;
	}
	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}
	public BigDecimal getR0170_nominal_amount() {
		return r0170_nominal_amount;
	}
	public void setR0170_nominal_amount(BigDecimal r0170_nominal_amount) {
		this.r0170_nominal_amount = r0170_nominal_amount;
	}
	public BigDecimal getR0170_asset() {
		return r0170_asset;
	}
	public void setR0170_asset(BigDecimal r0170_asset) {
		this.r0170_asset = r0170_asset;
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
	
	
	
	
	public CBUAE_BRF2_2_SUMMARY_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
