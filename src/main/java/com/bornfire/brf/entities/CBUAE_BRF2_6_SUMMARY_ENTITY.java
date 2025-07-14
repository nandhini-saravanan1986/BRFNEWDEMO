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
@Table(name = "CBUAE_BRF2_6_SUMMARYTABLE")

public class CBUAE_BRF2_6_SUMMARY_ENTITY {

	
	private String r0010_product;
	private String r0020_product;
	private BigDecimal r0020_resi_aed_up_to_3_months;
	private BigDecimal r0020_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0020_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0020_resi_aed_exceeding_12_months;
	private BigDecimal r0020_resi_fcy_up_to_3_months;
	private BigDecimal r0020_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0020_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0020_resi_fcy_exceeding_12_months;
	private BigDecimal r0020_total_resident;
	private BigDecimal r0020_nonresi_aed_up_to_3_months;
	private BigDecimal r0020_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0020_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0020_nonresi_aed_exceeding_12_months;
	private BigDecimal r0020_nonresi_fcy_up_to_3_months;
	private BigDecimal r0020_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0020_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0020_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0020_total_nonresident;
	private BigDecimal r0020_grand_total_amount;
	private String r0030_product;
	private BigDecimal r0030_resi_aed_up_to_3_months;
	private BigDecimal r0030_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0030_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0030_resi_aed_exceeding_12_months;
	private BigDecimal r0030_resi_fcy_up_to_3_months;
	private BigDecimal r0030_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0030_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0030_resi_fcy_exceeding_12_months;
	private BigDecimal r0030_total_resident;
	private BigDecimal r0030_nonresi_aed_up_to_3_months;
	private BigDecimal r0030_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0030_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0030_nonresi_aed_exceeding_12_months;
	private BigDecimal r0030_nonresi_fcy_up_to_3_months;
	private BigDecimal r0030_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0030_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0030_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0030_total_nonresident;
	private BigDecimal r0030_grand_total_amount;
	private String r0040_product;
	private BigDecimal r0040_resi_aed_up_to_3_months;
	private BigDecimal r0040_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0040_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0040_resi_aed_exceeding_12_months;
	private BigDecimal r0040_resi_fcy_up_to_3_months;
	private BigDecimal r0040_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0040_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0040_resi_fcy_exceeding_12_months;
	private BigDecimal r0040_total_resident;
	private BigDecimal r0040_nonresi_aed_up_to_3_months;
	private BigDecimal r0040_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0040_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0040_nonresi_aed_exceeding_12_months;
	private BigDecimal r0040_nonresi_fcy_up_to_3_months;
	private BigDecimal r0040_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0040_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0040_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0040_total_nonresident;
	private BigDecimal r0040_grand_total_amount;
	private String r0050_product;
	private BigDecimal r0050_resi_aed_up_to_3_months;
	private BigDecimal r0050_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0050_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0050_resi_aed_exceeding_12_months;
	private BigDecimal r0050_resi_fcy_up_to_3_months;
	private BigDecimal r0050_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0050_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0050_resi_fcy_exceeding_12_months;
	private BigDecimal r0050_total_resident;
	private BigDecimal r0050_nonresi_aed_up_to_3_months;
	private BigDecimal r0050_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0050_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0050_nonresi_aed_exceeding_12_months;
	private BigDecimal r0050_nonresi_fcy_up_to_3_months;
	private BigDecimal r0050_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0050_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0050_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0050_total_nonresident;
	private BigDecimal r0050_grand_total_amount;
	private String r0060_product;
	private BigDecimal r0060_resi_aed_up_to_3_months;
	private BigDecimal r0060_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0060_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0060_resi_aed_exceeding_12_months;
	private BigDecimal r0060_resi_fcy_up_to_3_months;
	private BigDecimal r0060_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0060_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0060_resi_fcy_exceeding_12_months;
	private BigDecimal r0060_total_resident;
	private BigDecimal r0060_nonresi_aed_up_to_3_months;
	private BigDecimal r0060_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0060_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0060_nonresi_aed_exceeding_12_months;
	private BigDecimal r0060_nonresi_fcy_up_to_3_months;
	private BigDecimal r0060_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0060_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0060_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0060_total_nonresident;
	private BigDecimal r0060_grand_total_amount;
	private String r0070_product;
	private BigDecimal r0070_resi_aed_up_to_3_months;
	private BigDecimal r0070_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0070_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0070_resi_aed_exceeding_12_months;
	private BigDecimal r0070_resi_fcy_up_to_3_months;
	private BigDecimal r0070_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0070_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0070_resi_fcy_exceeding_12_months;
	private BigDecimal r0070_total_resident;
	private BigDecimal r0070_nonresi_aed_up_to_3_months;
	private BigDecimal r0070_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0070_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0070_nonresi_aed_exceeding_12_months;
	private BigDecimal r0070_nonresi_fcy_up_to_3_months;
	private BigDecimal r0070_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0070_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0070_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0070_total_nonresident;
	private BigDecimal r0070_grand_total_amount;
	private String r0080_product;
	private BigDecimal r0080_resi_aed_up_to_3_months;
	private BigDecimal r0080_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0080_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0080_resi_aed_exceeding_12_months;
	private BigDecimal r0080_resi_fcy_up_to_3_months;
	private BigDecimal r0080_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0080_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0080_resi_fcy_exceeding_12_months;
	private BigDecimal r0080_total_resident;
	private BigDecimal r0080_nonresi_aed_up_to_3_months;
	private BigDecimal r0080_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0080_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0080_nonresi_aed_exceeding_12_months;
	private BigDecimal r0080_nonresi_fcy_up_to_3_months;
	private BigDecimal r0080_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0080_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0080_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0080_total_nonresident;
	private BigDecimal r0080_grand_total_amount;
	private String r0090_product;
	private BigDecimal r0090_resi_aed_up_to_3_months;
	private BigDecimal r0090_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0090_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0090_resi_aed_exceeding_12_months;
	private BigDecimal r0090_resi_fcy_up_to_3_months;
	private BigDecimal r0090_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0090_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0090_resi_fcy_exceeding_12_months;
	private BigDecimal r0090_total_resident;
	private BigDecimal r0090_nonresi_aed_up_to_3_months;
	private BigDecimal r0090_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0090_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0090_nonresi_aed_exceeding_12_months;
	private BigDecimal r0090_nonresi_fcy_up_to_3_months;
	private BigDecimal r0090_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0090_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0090_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0090_total_nonresident;
	private BigDecimal r0090_grand_total_amount;
	private String r0100_product;
	private BigDecimal r0100_resi_aed_up_to_3_months;
	private BigDecimal r0100_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0100_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0100_resi_aed_exceeding_12_months;
	private BigDecimal r0100_resi_fcy_up_to_3_months;
	private BigDecimal r0100_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0100_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0100_resi_fcy_exceeding_12_months;
	private BigDecimal r0100_total_resident;
	private BigDecimal r0100_nonresi_aed_up_to_3_months;
	private BigDecimal r0100_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0100_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0100_nonresi_aed_exceeding_12_months;
	private BigDecimal r0100_nonresi_fcy_up_to_3_months;
	private BigDecimal r0100_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0100_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0100_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0100_total_nonresident;
	private BigDecimal r0100_grand_total_amount;
	private String r0110_product;
	private BigDecimal r0110_resi_aed_up_to_3_months;
	private BigDecimal r0110_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0110_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0110_resi_aed_exceeding_12_months;
	private BigDecimal r0110_resi_fcy_up_to_3_months;
	private BigDecimal r0110_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0110_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0110_resi_fcy_exceeding_12_months;
	private BigDecimal r0110_total_resident;
	private BigDecimal r0110_nonresi_aed_up_to_3_months;
	private BigDecimal r0110_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0110_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0110_nonresi_aed_exceeding_12_months;
	private BigDecimal r0110_nonresi_fcy_up_to_3_months;
	private BigDecimal r0110_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0110_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0110_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0110_total_nonresident;
	private BigDecimal r0110_grand_total_amount;
	private String r0120_product;
	private BigDecimal r0120_resi_aed_up_to_3_months;
	private BigDecimal r0120_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0120_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0120_resi_aed_exceeding_12_months;
	private BigDecimal r0120_resi_fcy_up_to_3_months;
	private BigDecimal r0120_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0120_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0120_resi_fcy_exceeding_12_months;
	private BigDecimal r0120_total_resident;
	private BigDecimal r0120_nonresi_aed_up_to_3_months;
	private BigDecimal r0120_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0120_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0120_nonresi_aed_exceeding_12_months;
	private BigDecimal r0120_nonresi_fcy_up_to_3_months;
	private BigDecimal r0120_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0120_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0120_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0120_total_nonresident;
	private BigDecimal r0120_grand_total_amount;
	private String r0130_product;
	private BigDecimal r0130_resi_aed_up_to_3_months;
	private BigDecimal r0130_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0130_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0130_resi_aed_exceeding_12_months;
	private BigDecimal r0130_resi_fcy_up_to_3_months;
	private BigDecimal r0130_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0130_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0130_resi_fcy_exceeding_12_months;
	private BigDecimal r0130_total_resident;
	private BigDecimal r0130_nonresi_aed_up_to_3_months;
	private BigDecimal r0130_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0130_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0130_nonresi_aed_exceeding_12_months;
	private BigDecimal r0130_nonresi_fcy_up_to_3_months;
	private BigDecimal r0130_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0130_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0130_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0130_total_nonresident;
	private BigDecimal r0130_grand_total_amount;
	private String r0140_product;
	private BigDecimal r0140_resi_aed_up_to_3_months;
	private BigDecimal r0140_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0140_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0140_resi_aed_exceeding_12_months;
	private BigDecimal r0140_resi_fcy_up_to_3_months;
	private BigDecimal r0140_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0140_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0140_resi_fcy_exceeding_12_months;
	private BigDecimal r0140_total_resident;
	private BigDecimal r0140_nonresi_aed_up_to_3_months;
	private BigDecimal r0140_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0140_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0140_nonresi_aed_exceeding_12_months;
	private BigDecimal r0140_nonresi_fcy_up_to_3_months;
	private BigDecimal r0140_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0140_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0140_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0140_total_nonresident;
	private BigDecimal r0140_grand_total_amount;
	private String r0150_product;
	private BigDecimal r0150_resi_aed_up_to_3_months;
	private BigDecimal r0150_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0150_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0150_resi_aed_exceeding_12_months;
	private BigDecimal r0150_resi_fcy_up_to_3_months;
	private BigDecimal r0150_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0150_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0150_resi_fcy_exceeding_12_months;
	private BigDecimal r0150_total_resident;
	private BigDecimal r0150_nonresi_aed_up_to_3_months;
	private BigDecimal r0150_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0150_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0150_nonresi_aed_exceeding_12_months;
	private BigDecimal r0150_nonresi_fcy_up_to_3_months;
	private BigDecimal r0150_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0150_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0150_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0150_total_nonresident;
	private BigDecimal r0150_grand_total_amount;
	private String r0160_product;
	private BigDecimal r0160_resi_aed_up_to_3_months;
	private BigDecimal r0160_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0160_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0160_resi_aed_exceeding_12_months;
	private BigDecimal r0160_resi_fcy_up_to_3_months;
	private BigDecimal r0160_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0160_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0160_resi_fcy_exceeding_12_months;
	private BigDecimal r0160_total_resident;
	private BigDecimal r0160_nonresi_aed_up_to_3_months;
	private BigDecimal r0160_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0160_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0160_nonresi_aed_exceeding_12_months;
	private BigDecimal r0160_nonresi_fcy_up_to_3_months;
	private BigDecimal r0160_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0160_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0160_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0160_total_nonresident;
	private BigDecimal r0160_grand_total_amount;
	private String r0170_product;
	private BigDecimal r0170_resi_aed_up_to_3_months;
	private BigDecimal r0170_resi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0170_resi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0170_resi_aed_exceeding_12_months;
	private BigDecimal r0170_resi_fcy_up_to_3_months;
	private BigDecimal r0170_resi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0170_resi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0170_resi_fcy_exceeding_12_months;
	private BigDecimal r0170_total_resident;
	private BigDecimal r0170_nonresi_aed_up_to_3_months;
	private BigDecimal r0170_nonresi_aed_above_3_and_up_to_6_months;
	private BigDecimal r0170_nonresi_aed_above_6_and_up_to_12_months;
	private BigDecimal r0170_nonresi_aed_exceeding_12_months;
	private BigDecimal r0170_nonresi_fcy_up_to_3_months;
	private BigDecimal r0170_nonresi_fcy_above_3_and_up_to_6_months;
	private BigDecimal r0170_nonresi_fcy_above_6_and_up_to_12_months;
	private BigDecimal r0170_nonresi_fcy_exceeding_12_months;
	private BigDecimal r0170_total_nonresident;
	private BigDecimal r0170_grand_total_amount;
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
	public BigDecimal getR0020_resi_aed_up_to_3_months() {
		return r0020_resi_aed_up_to_3_months;
	}
	public void setR0020_resi_aed_up_to_3_months(BigDecimal r0020_resi_aed_up_to_3_months) {
		this.r0020_resi_aed_up_to_3_months = r0020_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0020_resi_aed_above_3_and_up_to_6_months() {
		return r0020_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0020_resi_aed_above_3_and_up_to_6_months(BigDecimal r0020_resi_aed_above_3_and_up_to_6_months) {
		this.r0020_resi_aed_above_3_and_up_to_6_months = r0020_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0020_resi_aed_above_6_and_up_to_12_months() {
		return r0020_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0020_resi_aed_above_6_and_up_to_12_months(BigDecimal r0020_resi_aed_above_6_and_up_to_12_months) {
		this.r0020_resi_aed_above_6_and_up_to_12_months = r0020_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0020_resi_aed_exceeding_12_months() {
		return r0020_resi_aed_exceeding_12_months;
	}
	public void setR0020_resi_aed_exceeding_12_months(BigDecimal r0020_resi_aed_exceeding_12_months) {
		this.r0020_resi_aed_exceeding_12_months = r0020_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0020_resi_fcy_up_to_3_months() {
		return r0020_resi_fcy_up_to_3_months;
	}
	public void setR0020_resi_fcy_up_to_3_months(BigDecimal r0020_resi_fcy_up_to_3_months) {
		this.r0020_resi_fcy_up_to_3_months = r0020_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0020_resi_fcy_above_3_and_up_to_6_months() {
		return r0020_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0020_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0020_resi_fcy_above_3_and_up_to_6_months) {
		this.r0020_resi_fcy_above_3_and_up_to_6_months = r0020_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0020_resi_fcy_above_6_and_up_to_12_months() {
		return r0020_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0020_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0020_resi_fcy_above_6_and_up_to_12_months) {
		this.r0020_resi_fcy_above_6_and_up_to_12_months = r0020_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0020_resi_fcy_exceeding_12_months() {
		return r0020_resi_fcy_exceeding_12_months;
	}
	public void setR0020_resi_fcy_exceeding_12_months(BigDecimal r0020_resi_fcy_exceeding_12_months) {
		this.r0020_resi_fcy_exceeding_12_months = r0020_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0020_total_resident() {
		return r0020_total_resident;
	}
	public void setR0020_total_resident(BigDecimal r0020_total_resident) {
		this.r0020_total_resident = r0020_total_resident;
	}
	public BigDecimal getR0020_nonresi_aed_up_to_3_months() {
		return r0020_nonresi_aed_up_to_3_months;
	}
	public void setR0020_nonresi_aed_up_to_3_months(BigDecimal r0020_nonresi_aed_up_to_3_months) {
		this.r0020_nonresi_aed_up_to_3_months = r0020_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0020_nonresi_aed_above_3_and_up_to_6_months() {
		return r0020_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0020_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0020_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0020_nonresi_aed_above_3_and_up_to_6_months = r0020_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0020_nonresi_aed_above_6_and_up_to_12_months() {
		return r0020_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0020_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0020_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0020_nonresi_aed_above_6_and_up_to_12_months = r0020_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0020_nonresi_aed_exceeding_12_months() {
		return r0020_nonresi_aed_exceeding_12_months;
	}
	public void setR0020_nonresi_aed_exceeding_12_months(BigDecimal r0020_nonresi_aed_exceeding_12_months) {
		this.r0020_nonresi_aed_exceeding_12_months = r0020_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0020_nonresi_fcy_up_to_3_months() {
		return r0020_nonresi_fcy_up_to_3_months;
	}
	public void setR0020_nonresi_fcy_up_to_3_months(BigDecimal r0020_nonresi_fcy_up_to_3_months) {
		this.r0020_nonresi_fcy_up_to_3_months = r0020_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0020_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0020_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0020_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0020_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0020_nonresi_fcy_above_3_and_up_to_6_months = r0020_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0020_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0020_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0020_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0020_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0020_nonresi_fcy_above_6_and_up_to_12_months = r0020_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0020_nonresi_fcy_exceeding_12_months() {
		return r0020_nonresi_fcy_exceeding_12_months;
	}
	public void setR0020_nonresi_fcy_exceeding_12_months(BigDecimal r0020_nonresi_fcy_exceeding_12_months) {
		this.r0020_nonresi_fcy_exceeding_12_months = r0020_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0020_total_nonresident() {
		return r0020_total_nonresident;
	}
	public void setR0020_total_nonresident(BigDecimal r0020_total_nonresident) {
		this.r0020_total_nonresident = r0020_total_nonresident;
	}
	public BigDecimal getR0020_grand_total_amount() {
		return r0020_grand_total_amount;
	}
	public void setR0020_grand_total_amount(BigDecimal r0020_grand_total_amount) {
		this.r0020_grand_total_amount = r0020_grand_total_amount;
	}
	public String getR0030_product() {
		return r0030_product;
	}
	public void setR0030_product(String r0030_product) {
		this.r0030_product = r0030_product;
	}
	public BigDecimal getR0030_resi_aed_up_to_3_months() {
		return r0030_resi_aed_up_to_3_months;
	}
	public void setR0030_resi_aed_up_to_3_months(BigDecimal r0030_resi_aed_up_to_3_months) {
		this.r0030_resi_aed_up_to_3_months = r0030_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0030_resi_aed_above_3_and_up_to_6_months() {
		return r0030_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0030_resi_aed_above_3_and_up_to_6_months(BigDecimal r0030_resi_aed_above_3_and_up_to_6_months) {
		this.r0030_resi_aed_above_3_and_up_to_6_months = r0030_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0030_resi_aed_above_6_and_up_to_12_months() {
		return r0030_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0030_resi_aed_above_6_and_up_to_12_months(BigDecimal r0030_resi_aed_above_6_and_up_to_12_months) {
		this.r0030_resi_aed_above_6_and_up_to_12_months = r0030_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0030_resi_aed_exceeding_12_months() {
		return r0030_resi_aed_exceeding_12_months;
	}
	public void setR0030_resi_aed_exceeding_12_months(BigDecimal r0030_resi_aed_exceeding_12_months) {
		this.r0030_resi_aed_exceeding_12_months = r0030_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0030_resi_fcy_up_to_3_months() {
		return r0030_resi_fcy_up_to_3_months;
	}
	public void setR0030_resi_fcy_up_to_3_months(BigDecimal r0030_resi_fcy_up_to_3_months) {
		this.r0030_resi_fcy_up_to_3_months = r0030_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0030_resi_fcy_above_3_and_up_to_6_months() {
		return r0030_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0030_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0030_resi_fcy_above_3_and_up_to_6_months) {
		this.r0030_resi_fcy_above_3_and_up_to_6_months = r0030_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0030_resi_fcy_above_6_and_up_to_12_months() {
		return r0030_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0030_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0030_resi_fcy_above_6_and_up_to_12_months) {
		this.r0030_resi_fcy_above_6_and_up_to_12_months = r0030_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0030_resi_fcy_exceeding_12_months() {
		return r0030_resi_fcy_exceeding_12_months;
	}
	public void setR0030_resi_fcy_exceeding_12_months(BigDecimal r0030_resi_fcy_exceeding_12_months) {
		this.r0030_resi_fcy_exceeding_12_months = r0030_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0030_total_resident() {
		return r0030_total_resident;
	}
	public void setR0030_total_resident(BigDecimal r0030_total_resident) {
		this.r0030_total_resident = r0030_total_resident;
	}
	public BigDecimal getR0030_nonresi_aed_up_to_3_months() {
		return r0030_nonresi_aed_up_to_3_months;
	}
	public void setR0030_nonresi_aed_up_to_3_months(BigDecimal r0030_nonresi_aed_up_to_3_months) {
		this.r0030_nonresi_aed_up_to_3_months = r0030_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0030_nonresi_aed_above_3_and_up_to_6_months() {
		return r0030_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0030_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0030_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0030_nonresi_aed_above_3_and_up_to_6_months = r0030_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0030_nonresi_aed_above_6_and_up_to_12_months() {
		return r0030_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0030_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0030_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0030_nonresi_aed_above_6_and_up_to_12_months = r0030_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0030_nonresi_aed_exceeding_12_months() {
		return r0030_nonresi_aed_exceeding_12_months;
	}
	public void setR0030_nonresi_aed_exceeding_12_months(BigDecimal r0030_nonresi_aed_exceeding_12_months) {
		this.r0030_nonresi_aed_exceeding_12_months = r0030_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0030_nonresi_fcy_up_to_3_months() {
		return r0030_nonresi_fcy_up_to_3_months;
	}
	public void setR0030_nonresi_fcy_up_to_3_months(BigDecimal r0030_nonresi_fcy_up_to_3_months) {
		this.r0030_nonresi_fcy_up_to_3_months = r0030_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0030_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0030_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0030_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0030_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0030_nonresi_fcy_above_3_and_up_to_6_months = r0030_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0030_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0030_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0030_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0030_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0030_nonresi_fcy_above_6_and_up_to_12_months = r0030_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0030_nonresi_fcy_exceeding_12_months() {
		return r0030_nonresi_fcy_exceeding_12_months;
	}
	public void setR0030_nonresi_fcy_exceeding_12_months(BigDecimal r0030_nonresi_fcy_exceeding_12_months) {
		this.r0030_nonresi_fcy_exceeding_12_months = r0030_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0030_total_nonresident() {
		return r0030_total_nonresident;
	}
	public void setR0030_total_nonresident(BigDecimal r0030_total_nonresident) {
		this.r0030_total_nonresident = r0030_total_nonresident;
	}
	public BigDecimal getR0030_grand_total_amount() {
		return r0030_grand_total_amount;
	}
	public void setR0030_grand_total_amount(BigDecimal r0030_grand_total_amount) {
		this.r0030_grand_total_amount = r0030_grand_total_amount;
	}
	public String getR0040_product() {
		return r0040_product;
	}
	public void setR0040_product(String r0040_product) {
		this.r0040_product = r0040_product;
	}
	public BigDecimal getR0040_resi_aed_up_to_3_months() {
		return r0040_resi_aed_up_to_3_months;
	}
	public void setR0040_resi_aed_up_to_3_months(BigDecimal r0040_resi_aed_up_to_3_months) {
		this.r0040_resi_aed_up_to_3_months = r0040_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0040_resi_aed_above_3_and_up_to_6_months() {
		return r0040_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0040_resi_aed_above_3_and_up_to_6_months(BigDecimal r0040_resi_aed_above_3_and_up_to_6_months) {
		this.r0040_resi_aed_above_3_and_up_to_6_months = r0040_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0040_resi_aed_above_6_and_up_to_12_months() {
		return r0040_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0040_resi_aed_above_6_and_up_to_12_months(BigDecimal r0040_resi_aed_above_6_and_up_to_12_months) {
		this.r0040_resi_aed_above_6_and_up_to_12_months = r0040_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0040_resi_aed_exceeding_12_months() {
		return r0040_resi_aed_exceeding_12_months;
	}
	public void setR0040_resi_aed_exceeding_12_months(BigDecimal r0040_resi_aed_exceeding_12_months) {
		this.r0040_resi_aed_exceeding_12_months = r0040_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0040_resi_fcy_up_to_3_months() {
		return r0040_resi_fcy_up_to_3_months;
	}
	public void setR0040_resi_fcy_up_to_3_months(BigDecimal r0040_resi_fcy_up_to_3_months) {
		this.r0040_resi_fcy_up_to_3_months = r0040_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0040_resi_fcy_above_3_and_up_to_6_months() {
		return r0040_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0040_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0040_resi_fcy_above_3_and_up_to_6_months) {
		this.r0040_resi_fcy_above_3_and_up_to_6_months = r0040_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0040_resi_fcy_above_6_and_up_to_12_months() {
		return r0040_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0040_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0040_resi_fcy_above_6_and_up_to_12_months) {
		this.r0040_resi_fcy_above_6_and_up_to_12_months = r0040_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0040_resi_fcy_exceeding_12_months() {
		return r0040_resi_fcy_exceeding_12_months;
	}
	public void setR0040_resi_fcy_exceeding_12_months(BigDecimal r0040_resi_fcy_exceeding_12_months) {
		this.r0040_resi_fcy_exceeding_12_months = r0040_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0040_total_resident() {
		return r0040_total_resident;
	}
	public void setR0040_total_resident(BigDecimal r0040_total_resident) {
		this.r0040_total_resident = r0040_total_resident;
	}
	public BigDecimal getR0040_nonresi_aed_up_to_3_months() {
		return r0040_nonresi_aed_up_to_3_months;
	}
	public void setR0040_nonresi_aed_up_to_3_months(BigDecimal r0040_nonresi_aed_up_to_3_months) {
		this.r0040_nonresi_aed_up_to_3_months = r0040_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0040_nonresi_aed_above_3_and_up_to_6_months() {
		return r0040_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0040_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0040_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0040_nonresi_aed_above_3_and_up_to_6_months = r0040_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0040_nonresi_aed_above_6_and_up_to_12_months() {
		return r0040_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0040_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0040_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0040_nonresi_aed_above_6_and_up_to_12_months = r0040_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0040_nonresi_aed_exceeding_12_months() {
		return r0040_nonresi_aed_exceeding_12_months;
	}
	public void setR0040_nonresi_aed_exceeding_12_months(BigDecimal r0040_nonresi_aed_exceeding_12_months) {
		this.r0040_nonresi_aed_exceeding_12_months = r0040_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0040_nonresi_fcy_up_to_3_months() {
		return r0040_nonresi_fcy_up_to_3_months;
	}
	public void setR0040_nonresi_fcy_up_to_3_months(BigDecimal r0040_nonresi_fcy_up_to_3_months) {
		this.r0040_nonresi_fcy_up_to_3_months = r0040_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0040_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0040_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0040_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0040_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0040_nonresi_fcy_above_3_and_up_to_6_months = r0040_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0040_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0040_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0040_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0040_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0040_nonresi_fcy_above_6_and_up_to_12_months = r0040_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0040_nonresi_fcy_exceeding_12_months() {
		return r0040_nonresi_fcy_exceeding_12_months;
	}
	public void setR0040_nonresi_fcy_exceeding_12_months(BigDecimal r0040_nonresi_fcy_exceeding_12_months) {
		this.r0040_nonresi_fcy_exceeding_12_months = r0040_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0040_total_nonresident() {
		return r0040_total_nonresident;
	}
	public void setR0040_total_nonresident(BigDecimal r0040_total_nonresident) {
		this.r0040_total_nonresident = r0040_total_nonresident;
	}
	public BigDecimal getR0040_grand_total_amount() {
		return r0040_grand_total_amount;
	}
	public void setR0040_grand_total_amount(BigDecimal r0040_grand_total_amount) {
		this.r0040_grand_total_amount = r0040_grand_total_amount;
	}
	public String getR0050_product() {
		return r0050_product;
	}
	public void setR0050_product(String r0050_product) {
		this.r0050_product = r0050_product;
	}
	public BigDecimal getR0050_resi_aed_up_to_3_months() {
		return r0050_resi_aed_up_to_3_months;
	}
	public void setR0050_resi_aed_up_to_3_months(BigDecimal r0050_resi_aed_up_to_3_months) {
		this.r0050_resi_aed_up_to_3_months = r0050_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0050_resi_aed_above_3_and_up_to_6_months() {
		return r0050_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0050_resi_aed_above_3_and_up_to_6_months(BigDecimal r0050_resi_aed_above_3_and_up_to_6_months) {
		this.r0050_resi_aed_above_3_and_up_to_6_months = r0050_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0050_resi_aed_above_6_and_up_to_12_months() {
		return r0050_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0050_resi_aed_above_6_and_up_to_12_months(BigDecimal r0050_resi_aed_above_6_and_up_to_12_months) {
		this.r0050_resi_aed_above_6_and_up_to_12_months = r0050_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0050_resi_aed_exceeding_12_months() {
		return r0050_resi_aed_exceeding_12_months;
	}
	public void setR0050_resi_aed_exceeding_12_months(BigDecimal r0050_resi_aed_exceeding_12_months) {
		this.r0050_resi_aed_exceeding_12_months = r0050_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0050_resi_fcy_up_to_3_months() {
		return r0050_resi_fcy_up_to_3_months;
	}
	public void setR0050_resi_fcy_up_to_3_months(BigDecimal r0050_resi_fcy_up_to_3_months) {
		this.r0050_resi_fcy_up_to_3_months = r0050_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0050_resi_fcy_above_3_and_up_to_6_months() {
		return r0050_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0050_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0050_resi_fcy_above_3_and_up_to_6_months) {
		this.r0050_resi_fcy_above_3_and_up_to_6_months = r0050_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0050_resi_fcy_above_6_and_up_to_12_months() {
		return r0050_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0050_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0050_resi_fcy_above_6_and_up_to_12_months) {
		this.r0050_resi_fcy_above_6_and_up_to_12_months = r0050_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0050_resi_fcy_exceeding_12_months() {
		return r0050_resi_fcy_exceeding_12_months;
	}
	public void setR0050_resi_fcy_exceeding_12_months(BigDecimal r0050_resi_fcy_exceeding_12_months) {
		this.r0050_resi_fcy_exceeding_12_months = r0050_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0050_total_resident() {
		return r0050_total_resident;
	}
	public void setR0050_total_resident(BigDecimal r0050_total_resident) {
		this.r0050_total_resident = r0050_total_resident;
	}
	public BigDecimal getR0050_nonresi_aed_up_to_3_months() {
		return r0050_nonresi_aed_up_to_3_months;
	}
	public void setR0050_nonresi_aed_up_to_3_months(BigDecimal r0050_nonresi_aed_up_to_3_months) {
		this.r0050_nonresi_aed_up_to_3_months = r0050_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0050_nonresi_aed_above_3_and_up_to_6_months() {
		return r0050_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0050_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0050_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0050_nonresi_aed_above_3_and_up_to_6_months = r0050_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0050_nonresi_aed_above_6_and_up_to_12_months() {
		return r0050_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0050_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0050_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0050_nonresi_aed_above_6_and_up_to_12_months = r0050_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0050_nonresi_aed_exceeding_12_months() {
		return r0050_nonresi_aed_exceeding_12_months;
	}
	public void setR0050_nonresi_aed_exceeding_12_months(BigDecimal r0050_nonresi_aed_exceeding_12_months) {
		this.r0050_nonresi_aed_exceeding_12_months = r0050_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0050_nonresi_fcy_up_to_3_months() {
		return r0050_nonresi_fcy_up_to_3_months;
	}
	public void setR0050_nonresi_fcy_up_to_3_months(BigDecimal r0050_nonresi_fcy_up_to_3_months) {
		this.r0050_nonresi_fcy_up_to_3_months = r0050_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0050_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0050_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0050_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0050_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0050_nonresi_fcy_above_3_and_up_to_6_months = r0050_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0050_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0050_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0050_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0050_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0050_nonresi_fcy_above_6_and_up_to_12_months = r0050_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0050_nonresi_fcy_exceeding_12_months() {
		return r0050_nonresi_fcy_exceeding_12_months;
	}
	public void setR0050_nonresi_fcy_exceeding_12_months(BigDecimal r0050_nonresi_fcy_exceeding_12_months) {
		this.r0050_nonresi_fcy_exceeding_12_months = r0050_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0050_total_nonresident() {
		return r0050_total_nonresident;
	}
	public void setR0050_total_nonresident(BigDecimal r0050_total_nonresident) {
		this.r0050_total_nonresident = r0050_total_nonresident;
	}
	public BigDecimal getR0050_grand_total_amount() {
		return r0050_grand_total_amount;
	}
	public void setR0050_grand_total_amount(BigDecimal r0050_grand_total_amount) {
		this.r0050_grand_total_amount = r0050_grand_total_amount;
	}
	public String getR0060_product() {
		return r0060_product;
	}
	public void setR0060_product(String r0060_product) {
		this.r0060_product = r0060_product;
	}
	public BigDecimal getR0060_resi_aed_up_to_3_months() {
		return r0060_resi_aed_up_to_3_months;
	}
	public void setR0060_resi_aed_up_to_3_months(BigDecimal r0060_resi_aed_up_to_3_months) {
		this.r0060_resi_aed_up_to_3_months = r0060_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0060_resi_aed_above_3_and_up_to_6_months() {
		return r0060_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0060_resi_aed_above_3_and_up_to_6_months(BigDecimal r0060_resi_aed_above_3_and_up_to_6_months) {
		this.r0060_resi_aed_above_3_and_up_to_6_months = r0060_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0060_resi_aed_above_6_and_up_to_12_months() {
		return r0060_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0060_resi_aed_above_6_and_up_to_12_months(BigDecimal r0060_resi_aed_above_6_and_up_to_12_months) {
		this.r0060_resi_aed_above_6_and_up_to_12_months = r0060_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0060_resi_aed_exceeding_12_months() {
		return r0060_resi_aed_exceeding_12_months;
	}
	public void setR0060_resi_aed_exceeding_12_months(BigDecimal r0060_resi_aed_exceeding_12_months) {
		this.r0060_resi_aed_exceeding_12_months = r0060_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0060_resi_fcy_up_to_3_months() {
		return r0060_resi_fcy_up_to_3_months;
	}
	public void setR0060_resi_fcy_up_to_3_months(BigDecimal r0060_resi_fcy_up_to_3_months) {
		this.r0060_resi_fcy_up_to_3_months = r0060_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0060_resi_fcy_above_3_and_up_to_6_months() {
		return r0060_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0060_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0060_resi_fcy_above_3_and_up_to_6_months) {
		this.r0060_resi_fcy_above_3_and_up_to_6_months = r0060_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0060_resi_fcy_above_6_and_up_to_12_months() {
		return r0060_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0060_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0060_resi_fcy_above_6_and_up_to_12_months) {
		this.r0060_resi_fcy_above_6_and_up_to_12_months = r0060_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0060_resi_fcy_exceeding_12_months() {
		return r0060_resi_fcy_exceeding_12_months;
	}
	public void setR0060_resi_fcy_exceeding_12_months(BigDecimal r0060_resi_fcy_exceeding_12_months) {
		this.r0060_resi_fcy_exceeding_12_months = r0060_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0060_total_resident() {
		return r0060_total_resident;
	}
	public void setR0060_total_resident(BigDecimal r0060_total_resident) {
		this.r0060_total_resident = r0060_total_resident;
	}
	public BigDecimal getR0060_nonresi_aed_up_to_3_months() {
		return r0060_nonresi_aed_up_to_3_months;
	}
	public void setR0060_nonresi_aed_up_to_3_months(BigDecimal r0060_nonresi_aed_up_to_3_months) {
		this.r0060_nonresi_aed_up_to_3_months = r0060_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0060_nonresi_aed_above_3_and_up_to_6_months() {
		return r0060_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0060_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0060_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0060_nonresi_aed_above_3_and_up_to_6_months = r0060_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0060_nonresi_aed_above_6_and_up_to_12_months() {
		return r0060_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0060_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0060_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0060_nonresi_aed_above_6_and_up_to_12_months = r0060_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0060_nonresi_aed_exceeding_12_months() {
		return r0060_nonresi_aed_exceeding_12_months;
	}
	public void setR0060_nonresi_aed_exceeding_12_months(BigDecimal r0060_nonresi_aed_exceeding_12_months) {
		this.r0060_nonresi_aed_exceeding_12_months = r0060_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0060_nonresi_fcy_up_to_3_months() {
		return r0060_nonresi_fcy_up_to_3_months;
	}
	public void setR0060_nonresi_fcy_up_to_3_months(BigDecimal r0060_nonresi_fcy_up_to_3_months) {
		this.r0060_nonresi_fcy_up_to_3_months = r0060_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0060_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0060_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0060_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0060_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0060_nonresi_fcy_above_3_and_up_to_6_months = r0060_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0060_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0060_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0060_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0060_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0060_nonresi_fcy_above_6_and_up_to_12_months = r0060_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0060_nonresi_fcy_exceeding_12_months() {
		return r0060_nonresi_fcy_exceeding_12_months;
	}
	public void setR0060_nonresi_fcy_exceeding_12_months(BigDecimal r0060_nonresi_fcy_exceeding_12_months) {
		this.r0060_nonresi_fcy_exceeding_12_months = r0060_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0060_total_nonresident() {
		return r0060_total_nonresident;
	}
	public void setR0060_total_nonresident(BigDecimal r0060_total_nonresident) {
		this.r0060_total_nonresident = r0060_total_nonresident;
	}
	public BigDecimal getR0060_grand_total_amount() {
		return r0060_grand_total_amount;
	}
	public void setR0060_grand_total_amount(BigDecimal r0060_grand_total_amount) {
		this.r0060_grand_total_amount = r0060_grand_total_amount;
	}
	public String getR0070_product() {
		return r0070_product;
	}
	public void setR0070_product(String r0070_product) {
		this.r0070_product = r0070_product;
	}
	public BigDecimal getR0070_resi_aed_up_to_3_months() {
		return r0070_resi_aed_up_to_3_months;
	}
	public void setR0070_resi_aed_up_to_3_months(BigDecimal r0070_resi_aed_up_to_3_months) {
		this.r0070_resi_aed_up_to_3_months = r0070_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0070_resi_aed_above_3_and_up_to_6_months() {
		return r0070_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0070_resi_aed_above_3_and_up_to_6_months(BigDecimal r0070_resi_aed_above_3_and_up_to_6_months) {
		this.r0070_resi_aed_above_3_and_up_to_6_months = r0070_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0070_resi_aed_above_6_and_up_to_12_months() {
		return r0070_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0070_resi_aed_above_6_and_up_to_12_months(BigDecimal r0070_resi_aed_above_6_and_up_to_12_months) {
		this.r0070_resi_aed_above_6_and_up_to_12_months = r0070_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0070_resi_aed_exceeding_12_months() {
		return r0070_resi_aed_exceeding_12_months;
	}
	public void setR0070_resi_aed_exceeding_12_months(BigDecimal r0070_resi_aed_exceeding_12_months) {
		this.r0070_resi_aed_exceeding_12_months = r0070_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0070_resi_fcy_up_to_3_months() {
		return r0070_resi_fcy_up_to_3_months;
	}
	public void setR0070_resi_fcy_up_to_3_months(BigDecimal r0070_resi_fcy_up_to_3_months) {
		this.r0070_resi_fcy_up_to_3_months = r0070_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0070_resi_fcy_above_3_and_up_to_6_months() {
		return r0070_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0070_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0070_resi_fcy_above_3_and_up_to_6_months) {
		this.r0070_resi_fcy_above_3_and_up_to_6_months = r0070_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0070_resi_fcy_above_6_and_up_to_12_months() {
		return r0070_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0070_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0070_resi_fcy_above_6_and_up_to_12_months) {
		this.r0070_resi_fcy_above_6_and_up_to_12_months = r0070_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0070_resi_fcy_exceeding_12_months() {
		return r0070_resi_fcy_exceeding_12_months;
	}
	public void setR0070_resi_fcy_exceeding_12_months(BigDecimal r0070_resi_fcy_exceeding_12_months) {
		this.r0070_resi_fcy_exceeding_12_months = r0070_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0070_total_resident() {
		return r0070_total_resident;
	}
	public void setR0070_total_resident(BigDecimal r0070_total_resident) {
		this.r0070_total_resident = r0070_total_resident;
	}
	public BigDecimal getR0070_nonresi_aed_up_to_3_months() {
		return r0070_nonresi_aed_up_to_3_months;
	}
	public void setR0070_nonresi_aed_up_to_3_months(BigDecimal r0070_nonresi_aed_up_to_3_months) {
		this.r0070_nonresi_aed_up_to_3_months = r0070_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0070_nonresi_aed_above_3_and_up_to_6_months() {
		return r0070_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0070_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0070_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0070_nonresi_aed_above_3_and_up_to_6_months = r0070_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0070_nonresi_aed_above_6_and_up_to_12_months() {
		return r0070_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0070_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0070_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0070_nonresi_aed_above_6_and_up_to_12_months = r0070_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0070_nonresi_aed_exceeding_12_months() {
		return r0070_nonresi_aed_exceeding_12_months;
	}
	public void setR0070_nonresi_aed_exceeding_12_months(BigDecimal r0070_nonresi_aed_exceeding_12_months) {
		this.r0070_nonresi_aed_exceeding_12_months = r0070_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0070_nonresi_fcy_up_to_3_months() {
		return r0070_nonresi_fcy_up_to_3_months;
	}
	public void setR0070_nonresi_fcy_up_to_3_months(BigDecimal r0070_nonresi_fcy_up_to_3_months) {
		this.r0070_nonresi_fcy_up_to_3_months = r0070_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0070_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0070_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0070_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0070_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0070_nonresi_fcy_above_3_and_up_to_6_months = r0070_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0070_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0070_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0070_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0070_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0070_nonresi_fcy_above_6_and_up_to_12_months = r0070_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0070_nonresi_fcy_exceeding_12_months() {
		return r0070_nonresi_fcy_exceeding_12_months;
	}
	public void setR0070_nonresi_fcy_exceeding_12_months(BigDecimal r0070_nonresi_fcy_exceeding_12_months) {
		this.r0070_nonresi_fcy_exceeding_12_months = r0070_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0070_total_nonresident() {
		return r0070_total_nonresident;
	}
	public void setR0070_total_nonresident(BigDecimal r0070_total_nonresident) {
		this.r0070_total_nonresident = r0070_total_nonresident;
	}
	public BigDecimal getR0070_grand_total_amount() {
		return r0070_grand_total_amount;
	}
	public void setR0070_grand_total_amount(BigDecimal r0070_grand_total_amount) {
		this.r0070_grand_total_amount = r0070_grand_total_amount;
	}
	public String getR0080_product() {
		return r0080_product;
	}
	public void setR0080_product(String r0080_product) {
		this.r0080_product = r0080_product;
	}
	public BigDecimal getR0080_resi_aed_up_to_3_months() {
		return r0080_resi_aed_up_to_3_months;
	}
	public void setR0080_resi_aed_up_to_3_months(BigDecimal r0080_resi_aed_up_to_3_months) {
		this.r0080_resi_aed_up_to_3_months = r0080_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0080_resi_aed_above_3_and_up_to_6_months() {
		return r0080_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0080_resi_aed_above_3_and_up_to_6_months(BigDecimal r0080_resi_aed_above_3_and_up_to_6_months) {
		this.r0080_resi_aed_above_3_and_up_to_6_months = r0080_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0080_resi_aed_above_6_and_up_to_12_months() {
		return r0080_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0080_resi_aed_above_6_and_up_to_12_months(BigDecimal r0080_resi_aed_above_6_and_up_to_12_months) {
		this.r0080_resi_aed_above_6_and_up_to_12_months = r0080_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0080_resi_aed_exceeding_12_months() {
		return r0080_resi_aed_exceeding_12_months;
	}
	public void setR0080_resi_aed_exceeding_12_months(BigDecimal r0080_resi_aed_exceeding_12_months) {
		this.r0080_resi_aed_exceeding_12_months = r0080_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0080_resi_fcy_up_to_3_months() {
		return r0080_resi_fcy_up_to_3_months;
	}
	public void setR0080_resi_fcy_up_to_3_months(BigDecimal r0080_resi_fcy_up_to_3_months) {
		this.r0080_resi_fcy_up_to_3_months = r0080_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0080_resi_fcy_above_3_and_up_to_6_months() {
		return r0080_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0080_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0080_resi_fcy_above_3_and_up_to_6_months) {
		this.r0080_resi_fcy_above_3_and_up_to_6_months = r0080_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0080_resi_fcy_above_6_and_up_to_12_months() {
		return r0080_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0080_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0080_resi_fcy_above_6_and_up_to_12_months) {
		this.r0080_resi_fcy_above_6_and_up_to_12_months = r0080_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0080_resi_fcy_exceeding_12_months() {
		return r0080_resi_fcy_exceeding_12_months;
	}
	public void setR0080_resi_fcy_exceeding_12_months(BigDecimal r0080_resi_fcy_exceeding_12_months) {
		this.r0080_resi_fcy_exceeding_12_months = r0080_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0080_total_resident() {
		return r0080_total_resident;
	}
	public void setR0080_total_resident(BigDecimal r0080_total_resident) {
		this.r0080_total_resident = r0080_total_resident;
	}
	public BigDecimal getR0080_nonresi_aed_up_to_3_months() {
		return r0080_nonresi_aed_up_to_3_months;
	}
	public void setR0080_nonresi_aed_up_to_3_months(BigDecimal r0080_nonresi_aed_up_to_3_months) {
		this.r0080_nonresi_aed_up_to_3_months = r0080_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0080_nonresi_aed_above_3_and_up_to_6_months() {
		return r0080_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0080_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0080_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0080_nonresi_aed_above_3_and_up_to_6_months = r0080_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0080_nonresi_aed_above_6_and_up_to_12_months() {
		return r0080_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0080_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0080_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0080_nonresi_aed_above_6_and_up_to_12_months = r0080_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0080_nonresi_aed_exceeding_12_months() {
		return r0080_nonresi_aed_exceeding_12_months;
	}
	public void setR0080_nonresi_aed_exceeding_12_months(BigDecimal r0080_nonresi_aed_exceeding_12_months) {
		this.r0080_nonresi_aed_exceeding_12_months = r0080_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0080_nonresi_fcy_up_to_3_months() {
		return r0080_nonresi_fcy_up_to_3_months;
	}
	public void setR0080_nonresi_fcy_up_to_3_months(BigDecimal r0080_nonresi_fcy_up_to_3_months) {
		this.r0080_nonresi_fcy_up_to_3_months = r0080_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0080_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0080_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0080_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0080_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0080_nonresi_fcy_above_3_and_up_to_6_months = r0080_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0080_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0080_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0080_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0080_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0080_nonresi_fcy_above_6_and_up_to_12_months = r0080_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0080_nonresi_fcy_exceeding_12_months() {
		return r0080_nonresi_fcy_exceeding_12_months;
	}
	public void setR0080_nonresi_fcy_exceeding_12_months(BigDecimal r0080_nonresi_fcy_exceeding_12_months) {
		this.r0080_nonresi_fcy_exceeding_12_months = r0080_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0080_total_nonresident() {
		return r0080_total_nonresident;
	}
	public void setR0080_total_nonresident(BigDecimal r0080_total_nonresident) {
		this.r0080_total_nonresident = r0080_total_nonresident;
	}
	public BigDecimal getR0080_grand_total_amount() {
		return r0080_grand_total_amount;
	}
	public void setR0080_grand_total_amount(BigDecimal r0080_grand_total_amount) {
		this.r0080_grand_total_amount = r0080_grand_total_amount;
	}
	public String getR0090_product() {
		return r0090_product;
	}
	public void setR0090_product(String r0090_product) {
		this.r0090_product = r0090_product;
	}
	public BigDecimal getR0090_resi_aed_up_to_3_months() {
		return r0090_resi_aed_up_to_3_months;
	}
	public void setR0090_resi_aed_up_to_3_months(BigDecimal r0090_resi_aed_up_to_3_months) {
		this.r0090_resi_aed_up_to_3_months = r0090_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0090_resi_aed_above_3_and_up_to_6_months() {
		return r0090_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0090_resi_aed_above_3_and_up_to_6_months(BigDecimal r0090_resi_aed_above_3_and_up_to_6_months) {
		this.r0090_resi_aed_above_3_and_up_to_6_months = r0090_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0090_resi_aed_above_6_and_up_to_12_months() {
		return r0090_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0090_resi_aed_above_6_and_up_to_12_months(BigDecimal r0090_resi_aed_above_6_and_up_to_12_months) {
		this.r0090_resi_aed_above_6_and_up_to_12_months = r0090_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0090_resi_aed_exceeding_12_months() {
		return r0090_resi_aed_exceeding_12_months;
	}
	public void setR0090_resi_aed_exceeding_12_months(BigDecimal r0090_resi_aed_exceeding_12_months) {
		this.r0090_resi_aed_exceeding_12_months = r0090_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0090_resi_fcy_up_to_3_months() {
		return r0090_resi_fcy_up_to_3_months;
	}
	public void setR0090_resi_fcy_up_to_3_months(BigDecimal r0090_resi_fcy_up_to_3_months) {
		this.r0090_resi_fcy_up_to_3_months = r0090_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0090_resi_fcy_above_3_and_up_to_6_months() {
		return r0090_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0090_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0090_resi_fcy_above_3_and_up_to_6_months) {
		this.r0090_resi_fcy_above_3_and_up_to_6_months = r0090_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0090_resi_fcy_above_6_and_up_to_12_months() {
		return r0090_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0090_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0090_resi_fcy_above_6_and_up_to_12_months) {
		this.r0090_resi_fcy_above_6_and_up_to_12_months = r0090_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0090_resi_fcy_exceeding_12_months() {
		return r0090_resi_fcy_exceeding_12_months;
	}
	public void setR0090_resi_fcy_exceeding_12_months(BigDecimal r0090_resi_fcy_exceeding_12_months) {
		this.r0090_resi_fcy_exceeding_12_months = r0090_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0090_total_resident() {
		return r0090_total_resident;
	}
	public void setR0090_total_resident(BigDecimal r0090_total_resident) {
		this.r0090_total_resident = r0090_total_resident;
	}
	public BigDecimal getR0090_nonresi_aed_up_to_3_months() {
		return r0090_nonresi_aed_up_to_3_months;
	}
	public void setR0090_nonresi_aed_up_to_3_months(BigDecimal r0090_nonresi_aed_up_to_3_months) {
		this.r0090_nonresi_aed_up_to_3_months = r0090_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0090_nonresi_aed_above_3_and_up_to_6_months() {
		return r0090_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0090_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0090_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0090_nonresi_aed_above_3_and_up_to_6_months = r0090_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0090_nonresi_aed_above_6_and_up_to_12_months() {
		return r0090_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0090_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0090_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0090_nonresi_aed_above_6_and_up_to_12_months = r0090_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0090_nonresi_aed_exceeding_12_months() {
		return r0090_nonresi_aed_exceeding_12_months;
	}
	public void setR0090_nonresi_aed_exceeding_12_months(BigDecimal r0090_nonresi_aed_exceeding_12_months) {
		this.r0090_nonresi_aed_exceeding_12_months = r0090_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0090_nonresi_fcy_up_to_3_months() {
		return r0090_nonresi_fcy_up_to_3_months;
	}
	public void setR0090_nonresi_fcy_up_to_3_months(BigDecimal r0090_nonresi_fcy_up_to_3_months) {
		this.r0090_nonresi_fcy_up_to_3_months = r0090_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0090_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0090_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0090_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0090_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0090_nonresi_fcy_above_3_and_up_to_6_months = r0090_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0090_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0090_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0090_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0090_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0090_nonresi_fcy_above_6_and_up_to_12_months = r0090_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0090_nonresi_fcy_exceeding_12_months() {
		return r0090_nonresi_fcy_exceeding_12_months;
	}
	public void setR0090_nonresi_fcy_exceeding_12_months(BigDecimal r0090_nonresi_fcy_exceeding_12_months) {
		this.r0090_nonresi_fcy_exceeding_12_months = r0090_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0090_total_nonresident() {
		return r0090_total_nonresident;
	}
	public void setR0090_total_nonresident(BigDecimal r0090_total_nonresident) {
		this.r0090_total_nonresident = r0090_total_nonresident;
	}
	public BigDecimal getR0090_grand_total_amount() {
		return r0090_grand_total_amount;
	}
	public void setR0090_grand_total_amount(BigDecimal r0090_grand_total_amount) {
		this.r0090_grand_total_amount = r0090_grand_total_amount;
	}
	public String getR0100_product() {
		return r0100_product;
	}
	public void setR0100_product(String r0100_product) {
		this.r0100_product = r0100_product;
	}
	public BigDecimal getR0100_resi_aed_up_to_3_months() {
		return r0100_resi_aed_up_to_3_months;
	}
	public void setR0100_resi_aed_up_to_3_months(BigDecimal r0100_resi_aed_up_to_3_months) {
		this.r0100_resi_aed_up_to_3_months = r0100_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0100_resi_aed_above_3_and_up_to_6_months() {
		return r0100_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0100_resi_aed_above_3_and_up_to_6_months(BigDecimal r0100_resi_aed_above_3_and_up_to_6_months) {
		this.r0100_resi_aed_above_3_and_up_to_6_months = r0100_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0100_resi_aed_above_6_and_up_to_12_months() {
		return r0100_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0100_resi_aed_above_6_and_up_to_12_months(BigDecimal r0100_resi_aed_above_6_and_up_to_12_months) {
		this.r0100_resi_aed_above_6_and_up_to_12_months = r0100_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0100_resi_aed_exceeding_12_months() {
		return r0100_resi_aed_exceeding_12_months;
	}
	public void setR0100_resi_aed_exceeding_12_months(BigDecimal r0100_resi_aed_exceeding_12_months) {
		this.r0100_resi_aed_exceeding_12_months = r0100_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0100_resi_fcy_up_to_3_months() {
		return r0100_resi_fcy_up_to_3_months;
	}
	public void setR0100_resi_fcy_up_to_3_months(BigDecimal r0100_resi_fcy_up_to_3_months) {
		this.r0100_resi_fcy_up_to_3_months = r0100_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0100_resi_fcy_above_3_and_up_to_6_months() {
		return r0100_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0100_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0100_resi_fcy_above_3_and_up_to_6_months) {
		this.r0100_resi_fcy_above_3_and_up_to_6_months = r0100_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0100_resi_fcy_above_6_and_up_to_12_months() {
		return r0100_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0100_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0100_resi_fcy_above_6_and_up_to_12_months) {
		this.r0100_resi_fcy_above_6_and_up_to_12_months = r0100_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0100_resi_fcy_exceeding_12_months() {
		return r0100_resi_fcy_exceeding_12_months;
	}
	public void setR0100_resi_fcy_exceeding_12_months(BigDecimal r0100_resi_fcy_exceeding_12_months) {
		this.r0100_resi_fcy_exceeding_12_months = r0100_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0100_total_resident() {
		return r0100_total_resident;
	}
	public void setR0100_total_resident(BigDecimal r0100_total_resident) {
		this.r0100_total_resident = r0100_total_resident;
	}
	public BigDecimal getR0100_nonresi_aed_up_to_3_months() {
		return r0100_nonresi_aed_up_to_3_months;
	}
	public void setR0100_nonresi_aed_up_to_3_months(BigDecimal r0100_nonresi_aed_up_to_3_months) {
		this.r0100_nonresi_aed_up_to_3_months = r0100_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0100_nonresi_aed_above_3_and_up_to_6_months() {
		return r0100_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0100_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0100_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0100_nonresi_aed_above_3_and_up_to_6_months = r0100_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0100_nonresi_aed_above_6_and_up_to_12_months() {
		return r0100_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0100_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0100_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0100_nonresi_aed_above_6_and_up_to_12_months = r0100_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0100_nonresi_aed_exceeding_12_months() {
		return r0100_nonresi_aed_exceeding_12_months;
	}
	public void setR0100_nonresi_aed_exceeding_12_months(BigDecimal r0100_nonresi_aed_exceeding_12_months) {
		this.r0100_nonresi_aed_exceeding_12_months = r0100_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0100_nonresi_fcy_up_to_3_months() {
		return r0100_nonresi_fcy_up_to_3_months;
	}
	public void setR0100_nonresi_fcy_up_to_3_months(BigDecimal r0100_nonresi_fcy_up_to_3_months) {
		this.r0100_nonresi_fcy_up_to_3_months = r0100_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0100_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0100_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0100_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0100_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0100_nonresi_fcy_above_3_and_up_to_6_months = r0100_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0100_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0100_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0100_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0100_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0100_nonresi_fcy_above_6_and_up_to_12_months = r0100_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0100_nonresi_fcy_exceeding_12_months() {
		return r0100_nonresi_fcy_exceeding_12_months;
	}
	public void setR0100_nonresi_fcy_exceeding_12_months(BigDecimal r0100_nonresi_fcy_exceeding_12_months) {
		this.r0100_nonresi_fcy_exceeding_12_months = r0100_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0100_total_nonresident() {
		return r0100_total_nonresident;
	}
	public void setR0100_total_nonresident(BigDecimal r0100_total_nonresident) {
		this.r0100_total_nonresident = r0100_total_nonresident;
	}
	public BigDecimal getR0100_grand_total_amount() {
		return r0100_grand_total_amount;
	}
	public void setR0100_grand_total_amount(BigDecimal r0100_grand_total_amount) {
		this.r0100_grand_total_amount = r0100_grand_total_amount;
	}
	public String getR0110_product() {
		return r0110_product;
	}
	public void setR0110_product(String r0110_product) {
		this.r0110_product = r0110_product;
	}
	public BigDecimal getR0110_resi_aed_up_to_3_months() {
		return r0110_resi_aed_up_to_3_months;
	}
	public void setR0110_resi_aed_up_to_3_months(BigDecimal r0110_resi_aed_up_to_3_months) {
		this.r0110_resi_aed_up_to_3_months = r0110_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0110_resi_aed_above_3_and_up_to_6_months() {
		return r0110_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0110_resi_aed_above_3_and_up_to_6_months(BigDecimal r0110_resi_aed_above_3_and_up_to_6_months) {
		this.r0110_resi_aed_above_3_and_up_to_6_months = r0110_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0110_resi_aed_above_6_and_up_to_12_months() {
		return r0110_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0110_resi_aed_above_6_and_up_to_12_months(BigDecimal r0110_resi_aed_above_6_and_up_to_12_months) {
		this.r0110_resi_aed_above_6_and_up_to_12_months = r0110_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0110_resi_aed_exceeding_12_months() {
		return r0110_resi_aed_exceeding_12_months;
	}
	public void setR0110_resi_aed_exceeding_12_months(BigDecimal r0110_resi_aed_exceeding_12_months) {
		this.r0110_resi_aed_exceeding_12_months = r0110_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0110_resi_fcy_up_to_3_months() {
		return r0110_resi_fcy_up_to_3_months;
	}
	public void setR0110_resi_fcy_up_to_3_months(BigDecimal r0110_resi_fcy_up_to_3_months) {
		this.r0110_resi_fcy_up_to_3_months = r0110_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0110_resi_fcy_above_3_and_up_to_6_months() {
		return r0110_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0110_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0110_resi_fcy_above_3_and_up_to_6_months) {
		this.r0110_resi_fcy_above_3_and_up_to_6_months = r0110_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0110_resi_fcy_above_6_and_up_to_12_months() {
		return r0110_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0110_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0110_resi_fcy_above_6_and_up_to_12_months) {
		this.r0110_resi_fcy_above_6_and_up_to_12_months = r0110_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0110_resi_fcy_exceeding_12_months() {
		return r0110_resi_fcy_exceeding_12_months;
	}
	public void setR0110_resi_fcy_exceeding_12_months(BigDecimal r0110_resi_fcy_exceeding_12_months) {
		this.r0110_resi_fcy_exceeding_12_months = r0110_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0110_total_resident() {
		return r0110_total_resident;
	}
	public void setR0110_total_resident(BigDecimal r0110_total_resident) {
		this.r0110_total_resident = r0110_total_resident;
	}
	public BigDecimal getR0110_nonresi_aed_up_to_3_months() {
		return r0110_nonresi_aed_up_to_3_months;
	}
	public void setR0110_nonresi_aed_up_to_3_months(BigDecimal r0110_nonresi_aed_up_to_3_months) {
		this.r0110_nonresi_aed_up_to_3_months = r0110_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0110_nonresi_aed_above_3_and_up_to_6_months() {
		return r0110_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0110_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0110_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0110_nonresi_aed_above_3_and_up_to_6_months = r0110_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0110_nonresi_aed_above_6_and_up_to_12_months() {
		return r0110_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0110_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0110_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0110_nonresi_aed_above_6_and_up_to_12_months = r0110_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0110_nonresi_aed_exceeding_12_months() {
		return r0110_nonresi_aed_exceeding_12_months;
	}
	public void setR0110_nonresi_aed_exceeding_12_months(BigDecimal r0110_nonresi_aed_exceeding_12_months) {
		this.r0110_nonresi_aed_exceeding_12_months = r0110_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0110_nonresi_fcy_up_to_3_months() {
		return r0110_nonresi_fcy_up_to_3_months;
	}
	public void setR0110_nonresi_fcy_up_to_3_months(BigDecimal r0110_nonresi_fcy_up_to_3_months) {
		this.r0110_nonresi_fcy_up_to_3_months = r0110_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0110_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0110_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0110_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0110_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0110_nonresi_fcy_above_3_and_up_to_6_months = r0110_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0110_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0110_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0110_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0110_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0110_nonresi_fcy_above_6_and_up_to_12_months = r0110_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0110_nonresi_fcy_exceeding_12_months() {
		return r0110_nonresi_fcy_exceeding_12_months;
	}
	public void setR0110_nonresi_fcy_exceeding_12_months(BigDecimal r0110_nonresi_fcy_exceeding_12_months) {
		this.r0110_nonresi_fcy_exceeding_12_months = r0110_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0110_total_nonresident() {
		return r0110_total_nonresident;
	}
	public void setR0110_total_nonresident(BigDecimal r0110_total_nonresident) {
		this.r0110_total_nonresident = r0110_total_nonresident;
	}
	public BigDecimal getR0110_grand_total_amount() {
		return r0110_grand_total_amount;
	}
	public void setR0110_grand_total_amount(BigDecimal r0110_grand_total_amount) {
		this.r0110_grand_total_amount = r0110_grand_total_amount;
	}
	public String getR0120_product() {
		return r0120_product;
	}
	public void setR0120_product(String r0120_product) {
		this.r0120_product = r0120_product;
	}
	public BigDecimal getR0120_resi_aed_up_to_3_months() {
		return r0120_resi_aed_up_to_3_months;
	}
	public void setR0120_resi_aed_up_to_3_months(BigDecimal r0120_resi_aed_up_to_3_months) {
		this.r0120_resi_aed_up_to_3_months = r0120_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0120_resi_aed_above_3_and_up_to_6_months() {
		return r0120_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0120_resi_aed_above_3_and_up_to_6_months(BigDecimal r0120_resi_aed_above_3_and_up_to_6_months) {
		this.r0120_resi_aed_above_3_and_up_to_6_months = r0120_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0120_resi_aed_above_6_and_up_to_12_months() {
		return r0120_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0120_resi_aed_above_6_and_up_to_12_months(BigDecimal r0120_resi_aed_above_6_and_up_to_12_months) {
		this.r0120_resi_aed_above_6_and_up_to_12_months = r0120_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0120_resi_aed_exceeding_12_months() {
		return r0120_resi_aed_exceeding_12_months;
	}
	public void setR0120_resi_aed_exceeding_12_months(BigDecimal r0120_resi_aed_exceeding_12_months) {
		this.r0120_resi_aed_exceeding_12_months = r0120_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0120_resi_fcy_up_to_3_months() {
		return r0120_resi_fcy_up_to_3_months;
	}
	public void setR0120_resi_fcy_up_to_3_months(BigDecimal r0120_resi_fcy_up_to_3_months) {
		this.r0120_resi_fcy_up_to_3_months = r0120_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0120_resi_fcy_above_3_and_up_to_6_months() {
		return r0120_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0120_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0120_resi_fcy_above_3_and_up_to_6_months) {
		this.r0120_resi_fcy_above_3_and_up_to_6_months = r0120_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0120_resi_fcy_above_6_and_up_to_12_months() {
		return r0120_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0120_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0120_resi_fcy_above_6_and_up_to_12_months) {
		this.r0120_resi_fcy_above_6_and_up_to_12_months = r0120_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0120_resi_fcy_exceeding_12_months() {
		return r0120_resi_fcy_exceeding_12_months;
	}
	public void setR0120_resi_fcy_exceeding_12_months(BigDecimal r0120_resi_fcy_exceeding_12_months) {
		this.r0120_resi_fcy_exceeding_12_months = r0120_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0120_total_resident() {
		return r0120_total_resident;
	}
	public void setR0120_total_resident(BigDecimal r0120_total_resident) {
		this.r0120_total_resident = r0120_total_resident;
	}
	public BigDecimal getR0120_nonresi_aed_up_to_3_months() {
		return r0120_nonresi_aed_up_to_3_months;
	}
	public void setR0120_nonresi_aed_up_to_3_months(BigDecimal r0120_nonresi_aed_up_to_3_months) {
		this.r0120_nonresi_aed_up_to_3_months = r0120_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0120_nonresi_aed_above_3_and_up_to_6_months() {
		return r0120_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0120_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0120_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0120_nonresi_aed_above_3_and_up_to_6_months = r0120_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0120_nonresi_aed_above_6_and_up_to_12_months() {
		return r0120_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0120_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0120_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0120_nonresi_aed_above_6_and_up_to_12_months = r0120_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0120_nonresi_aed_exceeding_12_months() {
		return r0120_nonresi_aed_exceeding_12_months;
	}
	public void setR0120_nonresi_aed_exceeding_12_months(BigDecimal r0120_nonresi_aed_exceeding_12_months) {
		this.r0120_nonresi_aed_exceeding_12_months = r0120_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0120_nonresi_fcy_up_to_3_months() {
		return r0120_nonresi_fcy_up_to_3_months;
	}
	public void setR0120_nonresi_fcy_up_to_3_months(BigDecimal r0120_nonresi_fcy_up_to_3_months) {
		this.r0120_nonresi_fcy_up_to_3_months = r0120_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0120_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0120_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0120_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0120_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0120_nonresi_fcy_above_3_and_up_to_6_months = r0120_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0120_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0120_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0120_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0120_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0120_nonresi_fcy_above_6_and_up_to_12_months = r0120_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0120_nonresi_fcy_exceeding_12_months() {
		return r0120_nonresi_fcy_exceeding_12_months;
	}
	public void setR0120_nonresi_fcy_exceeding_12_months(BigDecimal r0120_nonresi_fcy_exceeding_12_months) {
		this.r0120_nonresi_fcy_exceeding_12_months = r0120_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0120_total_nonresident() {
		return r0120_total_nonresident;
	}
	public void setR0120_total_nonresident(BigDecimal r0120_total_nonresident) {
		this.r0120_total_nonresident = r0120_total_nonresident;
	}
	public BigDecimal getR0120_grand_total_amount() {
		return r0120_grand_total_amount;
	}
	public void setR0120_grand_total_amount(BigDecimal r0120_grand_total_amount) {
		this.r0120_grand_total_amount = r0120_grand_total_amount;
	}
	public String getR0130_product() {
		return r0130_product;
	}
	public void setR0130_product(String r0130_product) {
		this.r0130_product = r0130_product;
	}
	public BigDecimal getR0130_resi_aed_up_to_3_months() {
		return r0130_resi_aed_up_to_3_months;
	}
	public void setR0130_resi_aed_up_to_3_months(BigDecimal r0130_resi_aed_up_to_3_months) {
		this.r0130_resi_aed_up_to_3_months = r0130_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0130_resi_aed_above_3_and_up_to_6_months() {
		return r0130_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0130_resi_aed_above_3_and_up_to_6_months(BigDecimal r0130_resi_aed_above_3_and_up_to_6_months) {
		this.r0130_resi_aed_above_3_and_up_to_6_months = r0130_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0130_resi_aed_above_6_and_up_to_12_months() {
		return r0130_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0130_resi_aed_above_6_and_up_to_12_months(BigDecimal r0130_resi_aed_above_6_and_up_to_12_months) {
		this.r0130_resi_aed_above_6_and_up_to_12_months = r0130_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0130_resi_aed_exceeding_12_months() {
		return r0130_resi_aed_exceeding_12_months;
	}
	public void setR0130_resi_aed_exceeding_12_months(BigDecimal r0130_resi_aed_exceeding_12_months) {
		this.r0130_resi_aed_exceeding_12_months = r0130_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0130_resi_fcy_up_to_3_months() {
		return r0130_resi_fcy_up_to_3_months;
	}
	public void setR0130_resi_fcy_up_to_3_months(BigDecimal r0130_resi_fcy_up_to_3_months) {
		this.r0130_resi_fcy_up_to_3_months = r0130_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0130_resi_fcy_above_3_and_up_to_6_months() {
		return r0130_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0130_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0130_resi_fcy_above_3_and_up_to_6_months) {
		this.r0130_resi_fcy_above_3_and_up_to_6_months = r0130_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0130_resi_fcy_above_6_and_up_to_12_months() {
		return r0130_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0130_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0130_resi_fcy_above_6_and_up_to_12_months) {
		this.r0130_resi_fcy_above_6_and_up_to_12_months = r0130_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0130_resi_fcy_exceeding_12_months() {
		return r0130_resi_fcy_exceeding_12_months;
	}
	public void setR0130_resi_fcy_exceeding_12_months(BigDecimal r0130_resi_fcy_exceeding_12_months) {
		this.r0130_resi_fcy_exceeding_12_months = r0130_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0130_total_resident() {
		return r0130_total_resident;
	}
	public void setR0130_total_resident(BigDecimal r0130_total_resident) {
		this.r0130_total_resident = r0130_total_resident;
	}
	public BigDecimal getR0130_nonresi_aed_up_to_3_months() {
		return r0130_nonresi_aed_up_to_3_months;
	}
	public void setR0130_nonresi_aed_up_to_3_months(BigDecimal r0130_nonresi_aed_up_to_3_months) {
		this.r0130_nonresi_aed_up_to_3_months = r0130_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0130_nonresi_aed_above_3_and_up_to_6_months() {
		return r0130_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0130_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0130_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0130_nonresi_aed_above_3_and_up_to_6_months = r0130_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0130_nonresi_aed_above_6_and_up_to_12_months() {
		return r0130_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0130_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0130_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0130_nonresi_aed_above_6_and_up_to_12_months = r0130_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0130_nonresi_aed_exceeding_12_months() {
		return r0130_nonresi_aed_exceeding_12_months;
	}
	public void setR0130_nonresi_aed_exceeding_12_months(BigDecimal r0130_nonresi_aed_exceeding_12_months) {
		this.r0130_nonresi_aed_exceeding_12_months = r0130_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0130_nonresi_fcy_up_to_3_months() {
		return r0130_nonresi_fcy_up_to_3_months;
	}
	public void setR0130_nonresi_fcy_up_to_3_months(BigDecimal r0130_nonresi_fcy_up_to_3_months) {
		this.r0130_nonresi_fcy_up_to_3_months = r0130_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0130_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0130_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0130_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0130_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0130_nonresi_fcy_above_3_and_up_to_6_months = r0130_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0130_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0130_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0130_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0130_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0130_nonresi_fcy_above_6_and_up_to_12_months = r0130_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0130_nonresi_fcy_exceeding_12_months() {
		return r0130_nonresi_fcy_exceeding_12_months;
	}
	public void setR0130_nonresi_fcy_exceeding_12_months(BigDecimal r0130_nonresi_fcy_exceeding_12_months) {
		this.r0130_nonresi_fcy_exceeding_12_months = r0130_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0130_total_nonresident() {
		return r0130_total_nonresident;
	}
	public void setR0130_total_nonresident(BigDecimal r0130_total_nonresident) {
		this.r0130_total_nonresident = r0130_total_nonresident;
	}
	public BigDecimal getR0130_grand_total_amount() {
		return r0130_grand_total_amount;
	}
	public void setR0130_grand_total_amount(BigDecimal r0130_grand_total_amount) {
		this.r0130_grand_total_amount = r0130_grand_total_amount;
	}
	public String getR0140_product() {
		return r0140_product;
	}
	public void setR0140_product(String r0140_product) {
		this.r0140_product = r0140_product;
	}
	public BigDecimal getR0140_resi_aed_up_to_3_months() {
		return r0140_resi_aed_up_to_3_months;
	}
	public void setR0140_resi_aed_up_to_3_months(BigDecimal r0140_resi_aed_up_to_3_months) {
		this.r0140_resi_aed_up_to_3_months = r0140_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0140_resi_aed_above_3_and_up_to_6_months() {
		return r0140_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0140_resi_aed_above_3_and_up_to_6_months(BigDecimal r0140_resi_aed_above_3_and_up_to_6_months) {
		this.r0140_resi_aed_above_3_and_up_to_6_months = r0140_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0140_resi_aed_above_6_and_up_to_12_months() {
		return r0140_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0140_resi_aed_above_6_and_up_to_12_months(BigDecimal r0140_resi_aed_above_6_and_up_to_12_months) {
		this.r0140_resi_aed_above_6_and_up_to_12_months = r0140_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0140_resi_aed_exceeding_12_months() {
		return r0140_resi_aed_exceeding_12_months;
	}
	public void setR0140_resi_aed_exceeding_12_months(BigDecimal r0140_resi_aed_exceeding_12_months) {
		this.r0140_resi_aed_exceeding_12_months = r0140_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0140_resi_fcy_up_to_3_months() {
		return r0140_resi_fcy_up_to_3_months;
	}
	public void setR0140_resi_fcy_up_to_3_months(BigDecimal r0140_resi_fcy_up_to_3_months) {
		this.r0140_resi_fcy_up_to_3_months = r0140_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0140_resi_fcy_above_3_and_up_to_6_months() {
		return r0140_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0140_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0140_resi_fcy_above_3_and_up_to_6_months) {
		this.r0140_resi_fcy_above_3_and_up_to_6_months = r0140_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0140_resi_fcy_above_6_and_up_to_12_months() {
		return r0140_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0140_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0140_resi_fcy_above_6_and_up_to_12_months) {
		this.r0140_resi_fcy_above_6_and_up_to_12_months = r0140_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0140_resi_fcy_exceeding_12_months() {
		return r0140_resi_fcy_exceeding_12_months;
	}
	public void setR0140_resi_fcy_exceeding_12_months(BigDecimal r0140_resi_fcy_exceeding_12_months) {
		this.r0140_resi_fcy_exceeding_12_months = r0140_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0140_total_resident() {
		return r0140_total_resident;
	}
	public void setR0140_total_resident(BigDecimal r0140_total_resident) {
		this.r0140_total_resident = r0140_total_resident;
	}
	public BigDecimal getR0140_nonresi_aed_up_to_3_months() {
		return r0140_nonresi_aed_up_to_3_months;
	}
	public void setR0140_nonresi_aed_up_to_3_months(BigDecimal r0140_nonresi_aed_up_to_3_months) {
		this.r0140_nonresi_aed_up_to_3_months = r0140_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0140_nonresi_aed_above_3_and_up_to_6_months() {
		return r0140_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0140_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0140_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0140_nonresi_aed_above_3_and_up_to_6_months = r0140_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0140_nonresi_aed_above_6_and_up_to_12_months() {
		return r0140_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0140_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0140_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0140_nonresi_aed_above_6_and_up_to_12_months = r0140_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0140_nonresi_aed_exceeding_12_months() {
		return r0140_nonresi_aed_exceeding_12_months;
	}
	public void setR0140_nonresi_aed_exceeding_12_months(BigDecimal r0140_nonresi_aed_exceeding_12_months) {
		this.r0140_nonresi_aed_exceeding_12_months = r0140_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0140_nonresi_fcy_up_to_3_months() {
		return r0140_nonresi_fcy_up_to_3_months;
	}
	public void setR0140_nonresi_fcy_up_to_3_months(BigDecimal r0140_nonresi_fcy_up_to_3_months) {
		this.r0140_nonresi_fcy_up_to_3_months = r0140_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0140_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0140_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0140_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0140_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0140_nonresi_fcy_above_3_and_up_to_6_months = r0140_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0140_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0140_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0140_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0140_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0140_nonresi_fcy_above_6_and_up_to_12_months = r0140_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0140_nonresi_fcy_exceeding_12_months() {
		return r0140_nonresi_fcy_exceeding_12_months;
	}
	public void setR0140_nonresi_fcy_exceeding_12_months(BigDecimal r0140_nonresi_fcy_exceeding_12_months) {
		this.r0140_nonresi_fcy_exceeding_12_months = r0140_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0140_total_nonresident() {
		return r0140_total_nonresident;
	}
	public void setR0140_total_nonresident(BigDecimal r0140_total_nonresident) {
		this.r0140_total_nonresident = r0140_total_nonresident;
	}
	public BigDecimal getR0140_grand_total_amount() {
		return r0140_grand_total_amount;
	}
	public void setR0140_grand_total_amount(BigDecimal r0140_grand_total_amount) {
		this.r0140_grand_total_amount = r0140_grand_total_amount;
	}
	public String getR0150_product() {
		return r0150_product;
	}
	public void setR0150_product(String r0150_product) {
		this.r0150_product = r0150_product;
	}
	public BigDecimal getR0150_resi_aed_up_to_3_months() {
		return r0150_resi_aed_up_to_3_months;
	}
	public void setR0150_resi_aed_up_to_3_months(BigDecimal r0150_resi_aed_up_to_3_months) {
		this.r0150_resi_aed_up_to_3_months = r0150_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0150_resi_aed_above_3_and_up_to_6_months() {
		return r0150_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0150_resi_aed_above_3_and_up_to_6_months(BigDecimal r0150_resi_aed_above_3_and_up_to_6_months) {
		this.r0150_resi_aed_above_3_and_up_to_6_months = r0150_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0150_resi_aed_above_6_and_up_to_12_months() {
		return r0150_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0150_resi_aed_above_6_and_up_to_12_months(BigDecimal r0150_resi_aed_above_6_and_up_to_12_months) {
		this.r0150_resi_aed_above_6_and_up_to_12_months = r0150_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0150_resi_aed_exceeding_12_months() {
		return r0150_resi_aed_exceeding_12_months;
	}
	public void setR0150_resi_aed_exceeding_12_months(BigDecimal r0150_resi_aed_exceeding_12_months) {
		this.r0150_resi_aed_exceeding_12_months = r0150_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0150_resi_fcy_up_to_3_months() {
		return r0150_resi_fcy_up_to_3_months;
	}
	public void setR0150_resi_fcy_up_to_3_months(BigDecimal r0150_resi_fcy_up_to_3_months) {
		this.r0150_resi_fcy_up_to_3_months = r0150_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0150_resi_fcy_above_3_and_up_to_6_months() {
		return r0150_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0150_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0150_resi_fcy_above_3_and_up_to_6_months) {
		this.r0150_resi_fcy_above_3_and_up_to_6_months = r0150_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0150_resi_fcy_above_6_and_up_to_12_months() {
		return r0150_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0150_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0150_resi_fcy_above_6_and_up_to_12_months) {
		this.r0150_resi_fcy_above_6_and_up_to_12_months = r0150_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0150_resi_fcy_exceeding_12_months() {
		return r0150_resi_fcy_exceeding_12_months;
	}
	public void setR0150_resi_fcy_exceeding_12_months(BigDecimal r0150_resi_fcy_exceeding_12_months) {
		this.r0150_resi_fcy_exceeding_12_months = r0150_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0150_total_resident() {
		return r0150_total_resident;
	}
	public void setR0150_total_resident(BigDecimal r0150_total_resident) {
		this.r0150_total_resident = r0150_total_resident;
	}
	public BigDecimal getR0150_nonresi_aed_up_to_3_months() {
		return r0150_nonresi_aed_up_to_3_months;
	}
	public void setR0150_nonresi_aed_up_to_3_months(BigDecimal r0150_nonresi_aed_up_to_3_months) {
		this.r0150_nonresi_aed_up_to_3_months = r0150_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0150_nonresi_aed_above_3_and_up_to_6_months() {
		return r0150_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0150_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0150_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0150_nonresi_aed_above_3_and_up_to_6_months = r0150_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0150_nonresi_aed_above_6_and_up_to_12_months() {
		return r0150_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0150_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0150_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0150_nonresi_aed_above_6_and_up_to_12_months = r0150_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0150_nonresi_aed_exceeding_12_months() {
		return r0150_nonresi_aed_exceeding_12_months;
	}
	public void setR0150_nonresi_aed_exceeding_12_months(BigDecimal r0150_nonresi_aed_exceeding_12_months) {
		this.r0150_nonresi_aed_exceeding_12_months = r0150_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0150_nonresi_fcy_up_to_3_months() {
		return r0150_nonresi_fcy_up_to_3_months;
	}
	public void setR0150_nonresi_fcy_up_to_3_months(BigDecimal r0150_nonresi_fcy_up_to_3_months) {
		this.r0150_nonresi_fcy_up_to_3_months = r0150_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0150_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0150_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0150_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0150_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0150_nonresi_fcy_above_3_and_up_to_6_months = r0150_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0150_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0150_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0150_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0150_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0150_nonresi_fcy_above_6_and_up_to_12_months = r0150_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0150_nonresi_fcy_exceeding_12_months() {
		return r0150_nonresi_fcy_exceeding_12_months;
	}
	public void setR0150_nonresi_fcy_exceeding_12_months(BigDecimal r0150_nonresi_fcy_exceeding_12_months) {
		this.r0150_nonresi_fcy_exceeding_12_months = r0150_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0150_total_nonresident() {
		return r0150_total_nonresident;
	}
	public void setR0150_total_nonresident(BigDecimal r0150_total_nonresident) {
		this.r0150_total_nonresident = r0150_total_nonresident;
	}
	public BigDecimal getR0150_grand_total_amount() {
		return r0150_grand_total_amount;
	}
	public void setR0150_grand_total_amount(BigDecimal r0150_grand_total_amount) {
		this.r0150_grand_total_amount = r0150_grand_total_amount;
	}
	public String getR0160_product() {
		return r0160_product;
	}
	public void setR0160_product(String r0160_product) {
		this.r0160_product = r0160_product;
	}
	public BigDecimal getR0160_resi_aed_up_to_3_months() {
		return r0160_resi_aed_up_to_3_months;
	}
	public void setR0160_resi_aed_up_to_3_months(BigDecimal r0160_resi_aed_up_to_3_months) {
		this.r0160_resi_aed_up_to_3_months = r0160_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0160_resi_aed_above_3_and_up_to_6_months() {
		return r0160_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0160_resi_aed_above_3_and_up_to_6_months(BigDecimal r0160_resi_aed_above_3_and_up_to_6_months) {
		this.r0160_resi_aed_above_3_and_up_to_6_months = r0160_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0160_resi_aed_above_6_and_up_to_12_months() {
		return r0160_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0160_resi_aed_above_6_and_up_to_12_months(BigDecimal r0160_resi_aed_above_6_and_up_to_12_months) {
		this.r0160_resi_aed_above_6_and_up_to_12_months = r0160_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0160_resi_aed_exceeding_12_months() {
		return r0160_resi_aed_exceeding_12_months;
	}
	public void setR0160_resi_aed_exceeding_12_months(BigDecimal r0160_resi_aed_exceeding_12_months) {
		this.r0160_resi_aed_exceeding_12_months = r0160_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0160_resi_fcy_up_to_3_months() {
		return r0160_resi_fcy_up_to_3_months;
	}
	public void setR0160_resi_fcy_up_to_3_months(BigDecimal r0160_resi_fcy_up_to_3_months) {
		this.r0160_resi_fcy_up_to_3_months = r0160_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0160_resi_fcy_above_3_and_up_to_6_months() {
		return r0160_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0160_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0160_resi_fcy_above_3_and_up_to_6_months) {
		this.r0160_resi_fcy_above_3_and_up_to_6_months = r0160_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0160_resi_fcy_above_6_and_up_to_12_months() {
		return r0160_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0160_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0160_resi_fcy_above_6_and_up_to_12_months) {
		this.r0160_resi_fcy_above_6_and_up_to_12_months = r0160_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0160_resi_fcy_exceeding_12_months() {
		return r0160_resi_fcy_exceeding_12_months;
	}
	public void setR0160_resi_fcy_exceeding_12_months(BigDecimal r0160_resi_fcy_exceeding_12_months) {
		this.r0160_resi_fcy_exceeding_12_months = r0160_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0160_total_resident() {
		return r0160_total_resident;
	}
	public void setR0160_total_resident(BigDecimal r0160_total_resident) {
		this.r0160_total_resident = r0160_total_resident;
	}
	public BigDecimal getR0160_nonresi_aed_up_to_3_months() {
		return r0160_nonresi_aed_up_to_3_months;
	}
	public void setR0160_nonresi_aed_up_to_3_months(BigDecimal r0160_nonresi_aed_up_to_3_months) {
		this.r0160_nonresi_aed_up_to_3_months = r0160_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0160_nonresi_aed_above_3_and_up_to_6_months() {
		return r0160_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0160_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0160_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0160_nonresi_aed_above_3_and_up_to_6_months = r0160_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0160_nonresi_aed_above_6_and_up_to_12_months() {
		return r0160_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0160_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0160_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0160_nonresi_aed_above_6_and_up_to_12_months = r0160_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0160_nonresi_aed_exceeding_12_months() {
		return r0160_nonresi_aed_exceeding_12_months;
	}
	public void setR0160_nonresi_aed_exceeding_12_months(BigDecimal r0160_nonresi_aed_exceeding_12_months) {
		this.r0160_nonresi_aed_exceeding_12_months = r0160_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0160_nonresi_fcy_up_to_3_months() {
		return r0160_nonresi_fcy_up_to_3_months;
	}
	public void setR0160_nonresi_fcy_up_to_3_months(BigDecimal r0160_nonresi_fcy_up_to_3_months) {
		this.r0160_nonresi_fcy_up_to_3_months = r0160_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0160_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0160_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0160_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0160_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0160_nonresi_fcy_above_3_and_up_to_6_months = r0160_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0160_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0160_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0160_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0160_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0160_nonresi_fcy_above_6_and_up_to_12_months = r0160_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0160_nonresi_fcy_exceeding_12_months() {
		return r0160_nonresi_fcy_exceeding_12_months;
	}
	public void setR0160_nonresi_fcy_exceeding_12_months(BigDecimal r0160_nonresi_fcy_exceeding_12_months) {
		this.r0160_nonresi_fcy_exceeding_12_months = r0160_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0160_total_nonresident() {
		return r0160_total_nonresident;
	}
	public void setR0160_total_nonresident(BigDecimal r0160_total_nonresident) {
		this.r0160_total_nonresident = r0160_total_nonresident;
	}
	public BigDecimal getR0160_grand_total_amount() {
		return r0160_grand_total_amount;
	}
	public void setR0160_grand_total_amount(BigDecimal r0160_grand_total_amount) {
		this.r0160_grand_total_amount = r0160_grand_total_amount;
	}
	public String getR0170_product() {
		return r0170_product;
	}
	public void setR0170_product(String r0170_product) {
		this.r0170_product = r0170_product;
	}
	public BigDecimal getR0170_resi_aed_up_to_3_months() {
		return r0170_resi_aed_up_to_3_months;
	}
	public void setR0170_resi_aed_up_to_3_months(BigDecimal r0170_resi_aed_up_to_3_months) {
		this.r0170_resi_aed_up_to_3_months = r0170_resi_aed_up_to_3_months;
	}
	public BigDecimal getR0170_resi_aed_above_3_and_up_to_6_months() {
		return r0170_resi_aed_above_3_and_up_to_6_months;
	}
	public void setR0170_resi_aed_above_3_and_up_to_6_months(BigDecimal r0170_resi_aed_above_3_and_up_to_6_months) {
		this.r0170_resi_aed_above_3_and_up_to_6_months = r0170_resi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0170_resi_aed_above_6_and_up_to_12_months() {
		return r0170_resi_aed_above_6_and_up_to_12_months;
	}
	public void setR0170_resi_aed_above_6_and_up_to_12_months(BigDecimal r0170_resi_aed_above_6_and_up_to_12_months) {
		this.r0170_resi_aed_above_6_and_up_to_12_months = r0170_resi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0170_resi_aed_exceeding_12_months() {
		return r0170_resi_aed_exceeding_12_months;
	}
	public void setR0170_resi_aed_exceeding_12_months(BigDecimal r0170_resi_aed_exceeding_12_months) {
		this.r0170_resi_aed_exceeding_12_months = r0170_resi_aed_exceeding_12_months;
	}
	public BigDecimal getR0170_resi_fcy_up_to_3_months() {
		return r0170_resi_fcy_up_to_3_months;
	}
	public void setR0170_resi_fcy_up_to_3_months(BigDecimal r0170_resi_fcy_up_to_3_months) {
		this.r0170_resi_fcy_up_to_3_months = r0170_resi_fcy_up_to_3_months;
	}
	public BigDecimal getR0170_resi_fcy_above_3_and_up_to_6_months() {
		return r0170_resi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0170_resi_fcy_above_3_and_up_to_6_months(BigDecimal r0170_resi_fcy_above_3_and_up_to_6_months) {
		this.r0170_resi_fcy_above_3_and_up_to_6_months = r0170_resi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0170_resi_fcy_above_6_and_up_to_12_months() {
		return r0170_resi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0170_resi_fcy_above_6_and_up_to_12_months(BigDecimal r0170_resi_fcy_above_6_and_up_to_12_months) {
		this.r0170_resi_fcy_above_6_and_up_to_12_months = r0170_resi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0170_resi_fcy_exceeding_12_months() {
		return r0170_resi_fcy_exceeding_12_months;
	}
	public void setR0170_resi_fcy_exceeding_12_months(BigDecimal r0170_resi_fcy_exceeding_12_months) {
		this.r0170_resi_fcy_exceeding_12_months = r0170_resi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0170_total_resident() {
		return r0170_total_resident;
	}
	public void setR0170_total_resident(BigDecimal r0170_total_resident) {
		this.r0170_total_resident = r0170_total_resident;
	}
	public BigDecimal getR0170_nonresi_aed_up_to_3_months() {
		return r0170_nonresi_aed_up_to_3_months;
	}
	public void setR0170_nonresi_aed_up_to_3_months(BigDecimal r0170_nonresi_aed_up_to_3_months) {
		this.r0170_nonresi_aed_up_to_3_months = r0170_nonresi_aed_up_to_3_months;
	}
	public BigDecimal getR0170_nonresi_aed_above_3_and_up_to_6_months() {
		return r0170_nonresi_aed_above_3_and_up_to_6_months;
	}
	public void setR0170_nonresi_aed_above_3_and_up_to_6_months(BigDecimal r0170_nonresi_aed_above_3_and_up_to_6_months) {
		this.r0170_nonresi_aed_above_3_and_up_to_6_months = r0170_nonresi_aed_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0170_nonresi_aed_above_6_and_up_to_12_months() {
		return r0170_nonresi_aed_above_6_and_up_to_12_months;
	}
	public void setR0170_nonresi_aed_above_6_and_up_to_12_months(BigDecimal r0170_nonresi_aed_above_6_and_up_to_12_months) {
		this.r0170_nonresi_aed_above_6_and_up_to_12_months = r0170_nonresi_aed_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0170_nonresi_aed_exceeding_12_months() {
		return r0170_nonresi_aed_exceeding_12_months;
	}
	public void setR0170_nonresi_aed_exceeding_12_months(BigDecimal r0170_nonresi_aed_exceeding_12_months) {
		this.r0170_nonresi_aed_exceeding_12_months = r0170_nonresi_aed_exceeding_12_months;
	}
	public BigDecimal getR0170_nonresi_fcy_up_to_3_months() {
		return r0170_nonresi_fcy_up_to_3_months;
	}
	public void setR0170_nonresi_fcy_up_to_3_months(BigDecimal r0170_nonresi_fcy_up_to_3_months) {
		this.r0170_nonresi_fcy_up_to_3_months = r0170_nonresi_fcy_up_to_3_months;
	}
	public BigDecimal getR0170_nonresi_fcy_above_3_and_up_to_6_months() {
		return r0170_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public void setR0170_nonresi_fcy_above_3_and_up_to_6_months(BigDecimal r0170_nonresi_fcy_above_3_and_up_to_6_months) {
		this.r0170_nonresi_fcy_above_3_and_up_to_6_months = r0170_nonresi_fcy_above_3_and_up_to_6_months;
	}
	public BigDecimal getR0170_nonresi_fcy_above_6_and_up_to_12_months() {
		return r0170_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public void setR0170_nonresi_fcy_above_6_and_up_to_12_months(BigDecimal r0170_nonresi_fcy_above_6_and_up_to_12_months) {
		this.r0170_nonresi_fcy_above_6_and_up_to_12_months = r0170_nonresi_fcy_above_6_and_up_to_12_months;
	}
	public BigDecimal getR0170_nonresi_fcy_exceeding_12_months() {
		return r0170_nonresi_fcy_exceeding_12_months;
	}
	public void setR0170_nonresi_fcy_exceeding_12_months(BigDecimal r0170_nonresi_fcy_exceeding_12_months) {
		this.r0170_nonresi_fcy_exceeding_12_months = r0170_nonresi_fcy_exceeding_12_months;
	}
	public BigDecimal getR0170_total_nonresident() {
		return r0170_total_nonresident;
	}
	public void setR0170_total_nonresident(BigDecimal r0170_total_nonresident) {
		this.r0170_total_nonresident = r0170_total_nonresident;
	}
	public BigDecimal getR0170_grand_total_amount() {
		return r0170_grand_total_amount;
	}
	public void setR0170_grand_total_amount(BigDecimal r0170_grand_total_amount) {
		this.r0170_grand_total_amount = r0170_grand_total_amount;
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
	
	
	
	
	public CBUAE_BRF2_6_SUMMARY_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
