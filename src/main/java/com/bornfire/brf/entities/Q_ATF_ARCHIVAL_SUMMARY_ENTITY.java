package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Q_ATF_ARCHIVAL_FIN_SUMMARY_TABLE")
public class Q_ATF_ARCHIVAL_SUMMARY_ENTITY{
    private String	r11_non_fin_inst_units_txt;
    private String	r12_central_govt_txt;
    private String	r13_local_govt_txt;
    private String	r14_pub_non_fin_corp_txt;
    private String	r15_other_non_fin_corp_txt;
    private String	r16_agric_forest_fish_txt;
    private String	r17_mining_quarry_txt;
    private String	r18_manufacturing_txt;
    private String	r19_construction_txt;
    private String	r20_comm_realestate_txt;
    private String	r21_electricity_txt;
    private String	r22_water_txt;
    private String	r23_telecom_post_txt;
    private String	r24_tourism_hotels_txt;
    private String	r25_transport_storage_txt;
    private String	r26_trade_rest_bar_txt;
    private String	r27_business_services_txt;
    private String	r28_community_services_txt;
    private String	r29_households_txt;
    private String	r30_hh_residential_owner_txt;
    private String	r31_hh_residential_rent_txt;
    private String	r32_hh_personal_loans_txt;
    private String	r33_hh_motor_vehicle_txt;
    private String	r34_hh_household_goods_txt;
    private String	r35_hh_credit_card_loans_txt;
    private String	r36_hh_other_txt;
    private String	r37_non_profit_inst_hh_txt;
    private String	r38_non_residents_txt;
    private String	r39_non_res_corp_txt;
    private String	r40_non_res_hh_txt;
    private String	r41_fin_inst_units_txt;
    private String	r42_central_bank_txt;
    private String	r43_comm_banks_txt;
    private String	r44_other_dep_corp_txt;
    private String	r45_bsb_txt;
    private String	r46_bbs_txt;
    private String	r47_money_mkt_unittrust_txt;
    private String	r48_other_dep_corp_specify_txt;
    private String	r49_other_fin_corp_txt;
    private String	r50_insurance_co_txt;
    private String	r51_pension_funds_txt;
    private String	r52_saccos_txt;
    private String	r53_other_fin_intermediaries_txt;
    private String	r54_fin_co_txt;
    private String	r55_med_aid_schemes_txt;
    private String	r56_pub_sec_fin_int_txt;
    private String	r57_financial_aux_txt;
    private String	r58_asset_managers_txt;
    private String	r59_insurance_brokers_txt;
    private String	r60_fund_admin_txt;
    private String	r61_bureau_change_txt;
    private String	r62_fin_aux_other_txt;
    private String	r63_non_residents_fin_txt;
    private String	r64_total_txt;
    private BigDecimal	r11_non_fin_inst_units_no_of_dep;
    private BigDecimal	r12_central_govt_no_of_dep;
    private BigDecimal	r13_local_govt_no_of_dep;
    private BigDecimal	r14_pub_non_fin_corp_no_of_dep;
    private BigDecimal	r15_other_non_fin_corp_no_of_dep;
    private BigDecimal	r16_agric_forest_fish_no_of_dep;
    private BigDecimal	r17_mining_quarry_no_of_dep;
    private BigDecimal	r18_manufacturing_no_of_dep;
    private BigDecimal	r19_construction_no_of_dep;
    private BigDecimal	r20_comm_realestate_no_of_dep;
    private BigDecimal	r21_electricity_no_of_dep;
    private BigDecimal	r22_water_no_of_dep;
    private BigDecimal	r23_telecom_post_no_of_dep;
    private BigDecimal	r24_tourism_hotels_no_of_dep;
    private BigDecimal	r25_transport_storage_no_of_dep;
    private BigDecimal	r26_trade_rest_bar_no_of_dep;
    private BigDecimal	r27_business_services_no_of_dep;
    private BigDecimal	r28_community_services_no_of_dep;
    private BigDecimal	r29_households_no_of_dep;
    private BigDecimal	r30_hh_residential_owner_no_of_dep;
    private BigDecimal	r31_hh_residential_rent_no_of_dep;
    private BigDecimal	r32_hh_personal_loans_no_of_dep;
    private BigDecimal	r33_hh_motor_vehicle_no_of_dep;
    private BigDecimal	r34_hh_household_goods_no_of_dep;
    private BigDecimal	r35_hh_credit_card_loans_no_of_dep;
    private BigDecimal	r36_hh_other_no_of_dep;
    private BigDecimal	r37_non_profit_inst_hh_no_of_dep;
    private BigDecimal	r38_non_residents_no_of_dep;
    private BigDecimal	r39_non_res_corp_no_of_dep;
    private BigDecimal	r40_non_res_hh_no_of_dep;
    private BigDecimal	r41_fin_inst_units_no_of_dep;
    private BigDecimal	r42_central_bank_no_of_dep;
    private BigDecimal	r43_comm_banks_no_of_dep;
    private BigDecimal	r44_other_dep_corp_no_of_dep;
    private BigDecimal	r45_bsb_no_of_dep;
    private BigDecimal	r46_bbs_no_of_dep;
    private BigDecimal	r47_money_mkt_unittrust_no_of_dep;
    private BigDecimal	r48_other_dep_corp_specify_no_of_dep;
    private BigDecimal	r49_other_fin_corp_no_of_dep;
    private BigDecimal	r50_insurance_co_no_of_dep;
    private BigDecimal	r51_pension_funds_no_of_dep;
    private BigDecimal	r52_saccos_no_of_dep;
    private BigDecimal	r53_other_fin_intermediaries_no_of_dep;
    private BigDecimal	r54_fin_co_no_of_dep;
    private BigDecimal	r55_med_aid_schemes_no_of_dep;
    private BigDecimal	r56_pub_sec_fin_int_no_of_dep;
    private BigDecimal	r57_financial_aux_no_of_dep;
    private BigDecimal	r58_asset_managers_no_of_dep;
    private BigDecimal	r59_insurance_brokers_no_of_dep;
    private BigDecimal	r60_fund_admin_no_of_dep;
    private BigDecimal	r61_bureau_change_no_of_dep;
    private BigDecimal	r62_fin_aux_other_no_of_dep;
    private BigDecimal	r63_non_residents_fin_no_of_dep;
    private BigDecimal	r64_total_no_of_dep;
    private BigDecimal	r11_non_fin_inst_units_no_of_dep_ac;
    private BigDecimal	r12_central_govt_no_of_dep_ac;
    private BigDecimal	r13_local_govt_no_of_dep_ac;
    private BigDecimal	r14_pub_non_fin_corp_no_of_dep_ac;
    private BigDecimal	r15_other_non_fin_corp_no_of_dep_ac;
    private BigDecimal	r16_agric_forest_fish_no_of_dep_ac;
    private BigDecimal	r17_mining_quarry_no_of_dep_ac;
    private BigDecimal	r18_manufacturing_no_of_dep_ac;
    private BigDecimal	r19_construction_no_of_dep_ac;
    private BigDecimal	r20_comm_realestate_no_of_dep_ac;
    private BigDecimal	r21_electricity_no_of_dep_ac;
    private BigDecimal	r22_water_no_of_dep_ac;
    private BigDecimal	r23_telecom_post_no_of_dep_ac;
    private BigDecimal	r24_tourism_hotels_no_of_dep_ac;
    private BigDecimal	r25_transport_storage_no_of_dep_ac;
    private BigDecimal	r26_trade_rest_bar_no_of_dep_ac;
    private BigDecimal	r27_business_services_no_of_dep_ac;
    private BigDecimal	r28_community_services_no_of_dep_ac;
    private BigDecimal	r29_households_no_of_dep_ac;
    private BigDecimal	r30_hh_residential_owner_no_of_dep_ac;
    private BigDecimal	r31_hh_residential_rent_no_of_dep_ac;
    private BigDecimal	r32_hh_personal_loans_no_of_dep_ac;
    private BigDecimal	r33_hh_motor_vehicle_no_of_dep_ac;
    private BigDecimal	r34_hh_household_goods_no_of_dep_ac;
    private BigDecimal	r35_hh_credit_card_loans_no_of_dep_ac;
    private BigDecimal	r36_hh_other_no_of_dep_ac;
    private BigDecimal	r37_non_profit_inst_hh_no_of_dep_ac;
    private BigDecimal	r38_non_residents_no_of_dep_ac;
    private BigDecimal	r39_non_res_corp_no_of_dep_ac;
    private BigDecimal	r40_non_res_hh_no_of_dep_ac;
    private BigDecimal	r41_fin_inst_units_no_of_dep_ac;
    private BigDecimal	r42_central_bank_no_of_dep_ac;
    private BigDecimal	r43_comm_banks_no_of_dep_ac;
    private BigDecimal	r44_other_dep_corp_no_of_dep_ac;
    private BigDecimal	r45_bsb_no_of_dep_ac;
    private BigDecimal	r46_bbs_no_of_dep_ac;
    private BigDecimal	r47_money_mkt_unittrust_no_of_dep_ac;
    private BigDecimal	r48_other_dep_corp_specify_no_of_dep_ac;
    private BigDecimal	r49_other_fin_corp_no_of_dep_ac;
    private BigDecimal	r50_insurance_co_no_of_dep_ac;
    private BigDecimal	r51_pension_funds_no_of_dep_ac;
    private BigDecimal	r52_saccos_no_of_dep_ac;
    private BigDecimal	r53_other_fin_intermediaries_no_of_dep_ac;
    private BigDecimal	r54_fin_co_no_of_dep_ac;
    private BigDecimal	r55_med_aid_schemes_no_of_dep_ac;
    private BigDecimal	r56_pub_sec_fin_int_no_of_dep_ac;
    private BigDecimal	r57_financial_aux_no_of_dep_ac;
    private BigDecimal	r58_asset_managers_no_of_dep_ac;
    private BigDecimal	r59_insurance_brokers_no_of_dep_ac;
    private BigDecimal	r60_fund_admin_no_of_dep_ac;
    private BigDecimal	r61_bureau_change_no_of_dep_ac;
    private BigDecimal	r62_fin_aux_other_no_of_dep_ac;
    private BigDecimal	r63_non_residents_fin_no_of_dep_ac;
    private BigDecimal	r64_total_no_of_dep_ac;
    private BigDecimal	r11_non_fin_inst_units_no_of_brw;
    private BigDecimal	r12_central_govt_no_of_brw;
    private BigDecimal	r13_local_govt_no_of_brw;
    private BigDecimal	r14_pub_non_fin_corp_no_of_brw;
    private BigDecimal	r15_other_non_fin_corp_no_of_brw;
    private BigDecimal	r16_agric_forest_fish_no_of_brw;
    private BigDecimal	r17_mining_quarry_no_of_brw;
    private BigDecimal	r18_manufacturing_no_of_brw;
    private BigDecimal	r19_construction_no_of_brw;
    private BigDecimal	r20_comm_realestate_no_of_brw;
    private BigDecimal	r21_electricity_no_of_brw;
    private BigDecimal	r22_water_no_of_brw;
    private BigDecimal	r23_telecom_post_no_of_brw;
    private BigDecimal	r24_tourism_hotels_no_of_brw;
    private BigDecimal	r25_transport_storage_no_of_brw;
    private BigDecimal	r26_trade_rest_bar_no_of_brw;
    private BigDecimal	r27_business_services_no_of_brw;
    private BigDecimal	r28_community_services_no_of_brw;
    private BigDecimal	r29_households_no_of_brw;
    private BigDecimal	r30_hh_residential_owner_no_of_brw;
    private BigDecimal	r31_hh_residential_rent_no_of_brw;
    private BigDecimal	r32_hh_personal_loans_no_of_brw;
    private BigDecimal	r33_hh_motor_vehicle_no_of_brw;
    private BigDecimal	r34_hh_household_goods_no_of_brw;
    private BigDecimal	r35_hh_credit_card_loans_no_of_brw;
    private BigDecimal	r36_hh_other_no_of_brw;
    private BigDecimal	r37_non_profit_inst_hh_no_of_brw;
    private BigDecimal	r38_non_residents_no_of_brw;
    private BigDecimal	r39_non_res_corp_no_of_brw;
    private BigDecimal	r40_non_res_hh_no_of_brw;
    private BigDecimal	r41_fin_inst_units_no_of_brw;
    private BigDecimal	r42_central_bank_no_of_brw;
    private BigDecimal	r43_comm_banks_no_of_brw;
    private BigDecimal	r44_other_dep_corp_no_of_brw;
    private BigDecimal	r45_bsb_no_of_brw;
    private BigDecimal	r46_bbs_no_of_brw;
    private BigDecimal	r47_money_mkt_unittrust_no_of_brw;
    private BigDecimal	r48_other_dep_corp_specify_no_of_brw;
    private BigDecimal	r49_other_fin_corp_no_of_brw;
    private BigDecimal	r50_insurance_co_no_of_brw;
    private BigDecimal	r51_pension_funds_no_of_brw;
    private BigDecimal	r52_saccos_no_of_brw;
    private BigDecimal	r53_other_fin_intermediaries_no_of_brw;
    private BigDecimal	r54_fin_co_no_of_brw;
    private BigDecimal	r55_med_aid_schemes_no_of_brw;
    private BigDecimal	r56_pub_sec_fin_int_no_of_brw;
    private BigDecimal	r57_financial_aux_no_of_brw;
    private BigDecimal	r58_asset_managers_no_of_brw;
    private BigDecimal	r59_insurance_brokers_no_of_brw;
    private BigDecimal	r60_fund_admin_no_of_brw;
    private BigDecimal	r61_bureau_change_no_of_brw;
    private BigDecimal	r62_fin_aux_other_no_of_brw;
    private BigDecimal	r63_non_residents_fin_no_of_brw;
    private BigDecimal	r64_total_no_of_brw;
    private BigDecimal	r11_non_fin_inst_units_no_loan_ac;
    private BigDecimal	r12_central_govt_no_loan_ac;
    private BigDecimal	r13_local_govt_no_loan_ac;
    private BigDecimal	r14_pub_non_fin_corp_no_loan_ac;
    private BigDecimal	r15_other_non_fin_corp_no_loan_ac;
    private BigDecimal	r16_agric_forest_fish_no_loan_ac;
    private BigDecimal	r17_mining_quarry_no_loan_ac;
    private BigDecimal	r18_manufacturing_no_loan_ac;
    private BigDecimal	r19_construction_no_loan_ac;
    private BigDecimal	r20_comm_realestate_no_loan_ac;
    private BigDecimal	r21_electricity_no_loan_ac;
    private BigDecimal	r22_water_no_loan_ac;
    private BigDecimal	r23_telecom_post_no_loan_ac;
    private BigDecimal	r24_tourism_hotels_no_loan_ac;
    private BigDecimal	r25_transport_storage_no_loan_ac;
    private BigDecimal	r26_trade_rest_bar_no_loan_ac;
    private BigDecimal	r27_business_services_no_loan_ac;
    private BigDecimal	r28_community_services_no_loan_ac;
    private BigDecimal	r29_households_no_loan_ac;
    private BigDecimal	r30_hh_residential_owner_no_loan_ac;
    private BigDecimal	r31_hh_residential_rent_no_loan_ac;
    private BigDecimal	r32_hh_personal_loans_no_loan_ac;
    private BigDecimal	r33_hh_motor_vehicle_no_loan_ac;
    private BigDecimal	r34_hh_household_goods_no_loan_ac;
    private BigDecimal	r35_hh_credit_card_loans_no_loan_ac;
    private BigDecimal	r36_hh_other_no_loan_ac;
    private BigDecimal	r37_non_profit_inst_hh_no_loan_ac;
    private BigDecimal	r38_non_residents_no_loan_ac;
    private BigDecimal	r39_non_res_corp_no_loan_ac;
    private BigDecimal	r40_non_res_hh_no_loan_ac;
    private BigDecimal	r41_fin_inst_units_no_loan_ac;
    private BigDecimal	r42_central_bank_no_loan_ac;
    private BigDecimal	r43_comm_banks_no_loan_ac;
    private BigDecimal	r44_other_dep_corp_no_loan_ac;
    private BigDecimal	r45_bsb_no_loan_ac;
    private BigDecimal	r46_bbs_no_loan_ac;
    private BigDecimal	r47_money_mkt_unittrust_no_loan_ac;
    private BigDecimal	r48_other_dep_corp_specify_no_loan_ac;
    private BigDecimal	r49_other_fin_corp_no_loan_ac;
    private BigDecimal	r50_insurance_co_no_loan_ac;
    private BigDecimal	r51_pension_funds_no_loan_ac;
    private BigDecimal	r52_saccos_no_loan_ac;
    private BigDecimal	r53_other_fin_intermediaries_no_loan_ac;
    private BigDecimal	r54_fin_co_no_loan_ac;
    private BigDecimal	r55_med_aid_schemes_no_loan_ac;
    private BigDecimal	r56_pub_sec_fin_int_no_loan_ac;
    private BigDecimal	r57_financial_aux_no_loan_ac;
    private BigDecimal	r58_asset_managers_no_loan_ac;
    private BigDecimal	r59_insurance_brokers_no_loan_ac;
    private BigDecimal	r60_fund_admin_no_loan_ac;
    private BigDecimal	r61_bureau_change_no_loan_ac;
    private BigDecimal	r62_fin_aux_other_no_loan_ac;
    private BigDecimal	r63_non_residents_fin_no_loan_ac;
    private BigDecimal	r64_total_no_loan_ac;


    @Id
	private Date report_date;
    
	private String report_version;
	private String report_code;
	private String report_frequency;
	private String report_desc;
	private String entity_flg;
	private String modify_flg;
	private String del_flg;

    public String getR13_local_govt_txt() {
        return r13_local_govt_txt;
    }

    public void setR13_local_govt_txt(String r13_local_govt_txt) {
        this.r13_local_govt_txt = r13_local_govt_txt;
    }

    public String getR11_non_fin_inst_units_txt() {
        return r11_non_fin_inst_units_txt;
    }

    public void setR11_non_fin_inst_units_txt(String r11_non_fin_inst_units_txt) {
        this.r11_non_fin_inst_units_txt = r11_non_fin_inst_units_txt;
    }

    public String getR12_central_govt_txt() {
        return r12_central_govt_txt;
    }

    public void setR12_central_govt_txt(String r12_central_govt_txt) {
        this.r12_central_govt_txt = r12_central_govt_txt;
    }

    public String getR14_pub_non_fin_corp_txt() {
        return r14_pub_non_fin_corp_txt;
    }

    public void setR14_pub_non_fin_corp_txt(String r14_pub_non_fin_corp_txt) {
        this.r14_pub_non_fin_corp_txt = r14_pub_non_fin_corp_txt;
    }

    public String getR15_other_non_fin_corp_txt() {
        return r15_other_non_fin_corp_txt;
    }

    public void setR15_other_non_fin_corp_txt(String r15_other_non_fin_corp_txt) {
        this.r15_other_non_fin_corp_txt = r15_other_non_fin_corp_txt;
    }

    public String getR16_agric_forest_fish_txt() {
        return r16_agric_forest_fish_txt;
    }

    public void setR16_agric_forest_fish_txt(String r16_agric_forest_fish_txt) {
        this.r16_agric_forest_fish_txt = r16_agric_forest_fish_txt;
    }

    public String getR17_mining_quarry_txt() {
        return r17_mining_quarry_txt;
    }

    public void setR17_mining_quarry_txt(String r17_mining_quarry_txt) {
        this.r17_mining_quarry_txt = r17_mining_quarry_txt;
    }

    public String getR18_manufacturing_txt() {
        return r18_manufacturing_txt;
    }

    public void setR18_manufacturing_txt(String r18_manufacturing_txt) {
        this.r18_manufacturing_txt = r18_manufacturing_txt;
    }

    public String getR19_construction_txt() {
        return r19_construction_txt;
    }

    public void setR19_construction_txt(String r19_construction_txt) {
        this.r19_construction_txt = r19_construction_txt;
    }

    public String getR20_comm_realestate_txt() {
        return r20_comm_realestate_txt;
    }

    public void setR20_comm_realestate_txt(String r20_comm_realestate_txt) {
        this.r20_comm_realestate_txt = r20_comm_realestate_txt;
    }

    public String getR21_electricity_txt() {
        return r21_electricity_txt;
    }

    public void setR21_electricity_txt(String r21_electricity_txt) {
        this.r21_electricity_txt = r21_electricity_txt;
    }

    public String getR22_water_txt() {
        return r22_water_txt;
    }

    public void setR22_water_txt(String r22_water_txt) {
        this.r22_water_txt = r22_water_txt;
    }

    public String getR23_telecom_post_txt() {
        return r23_telecom_post_txt;
    }

    public void setR23_telecom_post_txt(String r23_telecom_post_txt) {
        this.r23_telecom_post_txt = r23_telecom_post_txt;
    }

    public String getR24_tourism_hotels_txt() {
        return r24_tourism_hotels_txt;
    }

    public void setR24_tourism_hotels_txt(String r24_tourism_hotels_txt) {
        this.r24_tourism_hotels_txt = r24_tourism_hotels_txt;
    }

    public String getR25_transport_storage_txt() {
        return r25_transport_storage_txt;
    }

    public void setR25_transport_storage_txt(String r25_transport_storage_txt) {
        this.r25_transport_storage_txt = r25_transport_storage_txt;
    }

    public String getR26_trade_rest_bar_txt() {
        return r26_trade_rest_bar_txt;
    }

    public void setR26_trade_rest_bar_txt(String r26_trade_rest_bar_txt) {
        this.r26_trade_rest_bar_txt = r26_trade_rest_bar_txt;
    }

    public String getR27_business_services_txt() {
        return r27_business_services_txt;
    }

    public void setR27_business_services_txt(String r27_business_services_txt) {
        this.r27_business_services_txt = r27_business_services_txt;
    }

    public String getR28_community_services_txt() {
        return r28_community_services_txt;
    }

    public void setR28_community_services_txt(String r28_community_services_txt) {
        this.r28_community_services_txt = r28_community_services_txt;
    }

    public String getR29_households_txt() {
        return r29_households_txt;
    }

    public void setR29_households_txt(String r29_households_txt) {
        this.r29_households_txt = r29_households_txt;
    }

    public String getR30_hh_residential_owner_txt() {
        return r30_hh_residential_owner_txt;
    }

    public void setR30_hh_residential_owner_txt(String r30_hh_residential_owner_txt) {
        this.r30_hh_residential_owner_txt = r30_hh_residential_owner_txt;
    }

    public String getR31_hh_residential_rent_txt() {
        return r31_hh_residential_rent_txt;
    }

    public void setR31_hh_residential_rent_txt(String r31_hh_residential_rent_txt) {
        this.r31_hh_residential_rent_txt = r31_hh_residential_rent_txt;
    }

    public String getR32_hh_personal_loans_txt() {
        return r32_hh_personal_loans_txt;
    }

    public void setR32_hh_personal_loans_txt(String r32_hh_personal_loans_txt) {
        this.r32_hh_personal_loans_txt = r32_hh_personal_loans_txt;
    }

    public String getR33_hh_motor_vehicle_txt() {
        return r33_hh_motor_vehicle_txt;
    }

    public void setR33_hh_motor_vehicle_txt(String r33_hh_motor_vehicle_txt) {
        this.r33_hh_motor_vehicle_txt = r33_hh_motor_vehicle_txt;
    }

    public String getR34_hh_household_goods_txt() {
        return r34_hh_household_goods_txt;
    }

    public void setR34_hh_household_goods_txt(String r34_hh_household_goods_txt) {
        this.r34_hh_household_goods_txt = r34_hh_household_goods_txt;
    }

    public String getR35_hh_credit_card_loans_txt() {
        return r35_hh_credit_card_loans_txt;
    }

    public void setR35_hh_credit_card_loans_txt(String r35_hh_credit_card_loans_txt) {
        this.r35_hh_credit_card_loans_txt = r35_hh_credit_card_loans_txt;
    }

    public String getR36_hh_other_txt() {
        return r36_hh_other_txt;
    }

    public void setR36_hh_other_txt(String r36_hh_other_txt) {
        this.r36_hh_other_txt = r36_hh_other_txt;
    }

    public String getR37_non_profit_inst_hh_txt() {
        return r37_non_profit_inst_hh_txt;
    }

    public void setR37_non_profit_inst_hh_txt(String r37_non_profit_inst_hh_txt) {
        this.r37_non_profit_inst_hh_txt = r37_non_profit_inst_hh_txt;
    }

    public String getR38_non_residents_txt() {
        return r38_non_residents_txt;
    }

    public void setR38_non_residents_txt(String r38_non_residents_txt) {
        this.r38_non_residents_txt = r38_non_residents_txt;
    }

    public String getR39_non_res_corp_txt() {
        return r39_non_res_corp_txt;
    }

    public void setR39_non_res_corp_txt(String r39_non_res_corp_txt) {
        this.r39_non_res_corp_txt = r39_non_res_corp_txt;
    }

    public String getR40_non_res_hh_txt() {
        return r40_non_res_hh_txt;
    }

    public void setR40_non_res_hh_txt(String r40_non_res_hh_txt) {
        this.r40_non_res_hh_txt = r40_non_res_hh_txt;
    }

    public String getR41_fin_inst_units_txt() {
        return r41_fin_inst_units_txt;
    }

    public void setR41_fin_inst_units_txt(String r41_fin_inst_units_txt) {
        this.r41_fin_inst_units_txt = r41_fin_inst_units_txt;
    }

    public String getR42_central_bank_txt() {
        return r42_central_bank_txt;
    }

    public void setR42_central_bank_txt(String r42_central_bank_txt) {
        this.r42_central_bank_txt = r42_central_bank_txt;
    }

    public String getR43_comm_banks_txt() {
        return r43_comm_banks_txt;
    }

    public void setR43_comm_banks_txt(String r43_comm_banks_txt) {
        this.r43_comm_banks_txt = r43_comm_banks_txt;
    }

    public String getR44_other_dep_corp_txt() {
        return r44_other_dep_corp_txt;
    }

    public void setR44_other_dep_corp_txt(String r44_other_dep_corp_txt) {
        this.r44_other_dep_corp_txt = r44_other_dep_corp_txt;
    }

    public String getR45_bsb_txt() {
        return r45_bsb_txt;
    }

    public void setR45_bsb_txt(String r45_bsb_txt) {
        this.r45_bsb_txt = r45_bsb_txt;
    }

    public String getR46_bbs_txt() {
        return r46_bbs_txt;
    }

    public void setR46_bbs_txt(String r46_bbs_txt) {
        this.r46_bbs_txt = r46_bbs_txt;
    }

    public String getR47_money_mkt_unittrust_txt() {
        return r47_money_mkt_unittrust_txt;
    }

    public void setR47_money_mkt_unittrust_txt(String r47_money_mkt_unittrust_txt) {
        this.r47_money_mkt_unittrust_txt = r47_money_mkt_unittrust_txt;
    }

    public String getR48_other_dep_corp_specify_txt() {
        return r48_other_dep_corp_specify_txt;
    }

    public void setR48_other_dep_corp_specify_txt(String r48_other_dep_corp_specify_txt) {
        this.r48_other_dep_corp_specify_txt = r48_other_dep_corp_specify_txt;
    }

    public String getR49_other_fin_corp_txt() {
        return r49_other_fin_corp_txt;
    }

    public void setR49_other_fin_corp_txt(String r49_other_fin_corp_txt) {
        this.r49_other_fin_corp_txt = r49_other_fin_corp_txt;
    }

    public String getR50_insurance_co_txt() {
        return r50_insurance_co_txt;
    }

    public void setR50_insurance_co_txt(String r50_insurance_co_txt) {
        this.r50_insurance_co_txt = r50_insurance_co_txt;
    }

    public String getR51_pension_funds_txt() {
        return r51_pension_funds_txt;
    }

    public void setR51_pension_funds_txt(String r51_pension_funds_txt) {
        this.r51_pension_funds_txt = r51_pension_funds_txt;
    }

    public String getR52_saccos_txt() {
        return r52_saccos_txt;
    }

    public void setR52_saccos_txt(String r52_saccos_txt) {
        this.r52_saccos_txt = r52_saccos_txt;
    }

    public String getR53_other_fin_intermediaries_txt() {
        return r53_other_fin_intermediaries_txt;
    }

    public void setR53_other_fin_intermediaries_txt(String r53_other_fin_intermediaries_txt) {
        this.r53_other_fin_intermediaries_txt = r53_other_fin_intermediaries_txt;
    }

    public String getR54_fin_co_txt() {
        return r54_fin_co_txt;
    }

    public void setR54_fin_co_txt(String r54_fin_co_txt) {
        this.r54_fin_co_txt = r54_fin_co_txt;
    }

    public String getR55_med_aid_schemes_txt() {
        return r55_med_aid_schemes_txt;
    }

    public void setR55_med_aid_schemes_txt(String r55_med_aid_schemes_txt) {
        this.r55_med_aid_schemes_txt = r55_med_aid_schemes_txt;
    }

    public String getR56_pub_sec_fin_int_txt() {
        return r56_pub_sec_fin_int_txt;
    }

    public void setR56_pub_sec_fin_int_txt(String r56_pub_sec_fin_int_txt) {
        this.r56_pub_sec_fin_int_txt = r56_pub_sec_fin_int_txt;
    }

    public String getR57_financial_aux_txt() {
        return r57_financial_aux_txt;
    }

    public void setR57_financial_aux_txt(String r57_financial_aux_txt) {
        this.r57_financial_aux_txt = r57_financial_aux_txt;
    }

    public String getR58_asset_managers_txt() {
        return r58_asset_managers_txt;
    }

    public void setR58_asset_managers_txt(String r58_asset_managers_txt) {
        this.r58_asset_managers_txt = r58_asset_managers_txt;
    }

    public String getR59_insurance_brokers_txt() {
        return r59_insurance_brokers_txt;
    }

    public void setR59_insurance_brokers_txt(String r59_insurance_brokers_txt) {
        this.r59_insurance_brokers_txt = r59_insurance_brokers_txt;
    }

    public String getR60_fund_admin_txt() {
        return r60_fund_admin_txt;
    }

    public void setR60_fund_admin_txt(String r60_fund_admin_txt) {
        this.r60_fund_admin_txt = r60_fund_admin_txt;
    }

    public String getR61_bureau_change_txt() {
        return r61_bureau_change_txt;
    }

    public void setR61_bureau_change_txt(String r61_bureau_change_txt) {
        this.r61_bureau_change_txt = r61_bureau_change_txt;
    }

    public String getR62_fin_aux_other_txt() {
        return r62_fin_aux_other_txt;
    }

    public void setR62_fin_aux_other_txt(String r62_fin_aux_other_txt) {
        this.r62_fin_aux_other_txt = r62_fin_aux_other_txt;
    }

    public String getR63_non_residents_fin_txt() {
        return r63_non_residents_fin_txt;
    }

    public void setR63_non_residents_fin_txt(String r63_non_residents_fin_txt) {
        this.r63_non_residents_fin_txt = r63_non_residents_fin_txt;
    }

    public String getR64_total_txt() {
        return r64_total_txt;
    }

    public void setR64_total_txt(String r64_total_txt) {
        this.r64_total_txt = r64_total_txt;
    }

    public BigDecimal getR11_non_fin_inst_units_no_of_dep() {
        return r11_non_fin_inst_units_no_of_dep;
    }

    public void setR11_non_fin_inst_units_no_of_dep(BigDecimal r11_non_fin_inst_units_no_of_dep) {
        this.r11_non_fin_inst_units_no_of_dep = r11_non_fin_inst_units_no_of_dep;
    }

    public BigDecimal getR12_central_govt_no_of_dep() {
        return r12_central_govt_no_of_dep;
    }

    public void setR12_central_govt_no_of_dep(BigDecimal r12_central_govt_no_of_dep) {
        this.r12_central_govt_no_of_dep = r12_central_govt_no_of_dep;
    }

    public BigDecimal getR13_local_govt_no_of_dep() {
        return r13_local_govt_no_of_dep;
    }

    public void setR13_local_govt_no_of_dep(BigDecimal r13_local_govt_no_of_dep) {
        this.r13_local_govt_no_of_dep = r13_local_govt_no_of_dep;
    }

    public BigDecimal getR14_pub_non_fin_corp_no_of_dep() {
        return r14_pub_non_fin_corp_no_of_dep;
    }

    public void setR14_pub_non_fin_corp_no_of_dep(BigDecimal r14_pub_non_fin_corp_no_of_dep) {
        this.r14_pub_non_fin_corp_no_of_dep = r14_pub_non_fin_corp_no_of_dep;
    }

    public BigDecimal getR15_other_non_fin_corp_no_of_dep() {
        return r15_other_non_fin_corp_no_of_dep;
    }

    public void setR15_other_non_fin_corp_no_of_dep(BigDecimal r15_other_non_fin_corp_no_of_dep) {
        this.r15_other_non_fin_corp_no_of_dep = r15_other_non_fin_corp_no_of_dep;
    }

    public BigDecimal getR16_agric_forest_fish_no_of_dep() {
        return r16_agric_forest_fish_no_of_dep;
    }

    public void setR16_agric_forest_fish_no_of_dep(BigDecimal r16_agric_forest_fish_no_of_dep) {
        this.r16_agric_forest_fish_no_of_dep = r16_agric_forest_fish_no_of_dep;
    }

    public BigDecimal getR17_mining_quarry_no_of_dep() {
        return r17_mining_quarry_no_of_dep;
    }

    public void setR17_mining_quarry_no_of_dep(BigDecimal r17_mining_quarry_no_of_dep) {
        this.r17_mining_quarry_no_of_dep = r17_mining_quarry_no_of_dep;
    }

    public BigDecimal getR18_manufacturing_no_of_dep() {
        return r18_manufacturing_no_of_dep;
    }

    public void setR18_manufacturing_no_of_dep(BigDecimal r18_manufacturing_no_of_dep) {
        this.r18_manufacturing_no_of_dep = r18_manufacturing_no_of_dep;
    }

    public BigDecimal getR19_construction_no_of_dep() {
        return r19_construction_no_of_dep;
    }

    public void setR19_construction_no_of_dep(BigDecimal r19_construction_no_of_dep) {
        this.r19_construction_no_of_dep = r19_construction_no_of_dep;
    }

    public BigDecimal getR20_comm_realestate_no_of_dep() {
        return r20_comm_realestate_no_of_dep;
    }

    public void setR20_comm_realestate_no_of_dep(BigDecimal r20_comm_realestate_no_of_dep) {
        this.r20_comm_realestate_no_of_dep = r20_comm_realestate_no_of_dep;
    }

    public BigDecimal getR21_electricity_no_of_dep() {
        return r21_electricity_no_of_dep;
    }

    public void setR21_electricity_no_of_dep(BigDecimal r21_electricity_no_of_dep) {
        this.r21_electricity_no_of_dep = r21_electricity_no_of_dep;
    }

    public BigDecimal getR22_water_no_of_dep() {
        return r22_water_no_of_dep;
    }

    public void setR22_water_no_of_dep(BigDecimal r22_water_no_of_dep) {
        this.r22_water_no_of_dep = r22_water_no_of_dep;
    }

    public BigDecimal getR23_telecom_post_no_of_dep() {
        return r23_telecom_post_no_of_dep;
    }

    public void setR23_telecom_post_no_of_dep(BigDecimal r23_telecom_post_no_of_dep) {
        this.r23_telecom_post_no_of_dep = r23_telecom_post_no_of_dep;
    }

    public BigDecimal getR24_tourism_hotels_no_of_dep() {
        return r24_tourism_hotels_no_of_dep;
    }

    public void setR24_tourism_hotels_no_of_dep(BigDecimal r24_tourism_hotels_no_of_dep) {
        this.r24_tourism_hotels_no_of_dep = r24_tourism_hotels_no_of_dep;
    }

    public BigDecimal getR25_transport_storage_no_of_dep() {
        return r25_transport_storage_no_of_dep;
    }

    public void setR25_transport_storage_no_of_dep(BigDecimal r25_transport_storage_no_of_dep) {
        this.r25_transport_storage_no_of_dep = r25_transport_storage_no_of_dep;
    }

    public BigDecimal getR26_trade_rest_bar_no_of_dep() {
        return r26_trade_rest_bar_no_of_dep;
    }

    public void setR26_trade_rest_bar_no_of_dep(BigDecimal r26_trade_rest_bar_no_of_dep) {
        this.r26_trade_rest_bar_no_of_dep = r26_trade_rest_bar_no_of_dep;
    }

    public BigDecimal getR27_business_services_no_of_dep() {
        return r27_business_services_no_of_dep;
    }

    public void setR27_business_services_no_of_dep(BigDecimal r27_business_services_no_of_dep) {
        this.r27_business_services_no_of_dep = r27_business_services_no_of_dep;
    }

    public BigDecimal getR28_community_services_no_of_dep() {
        return r28_community_services_no_of_dep;
    }

    public void setR28_community_services_no_of_dep(BigDecimal r28_community_services_no_of_dep) {
        this.r28_community_services_no_of_dep = r28_community_services_no_of_dep;
    }

    public BigDecimal getR29_households_no_of_dep() {
        return r29_households_no_of_dep;
    }

    public void setR29_households_no_of_dep(BigDecimal r29_households_no_of_dep) {
        this.r29_households_no_of_dep = r29_households_no_of_dep;
    }

    public BigDecimal getR30_hh_residential_owner_no_of_dep() {
        return r30_hh_residential_owner_no_of_dep;
    }

    public void setR30_hh_residential_owner_no_of_dep(BigDecimal r30_hh_residential_owner_no_of_dep) {
        this.r30_hh_residential_owner_no_of_dep = r30_hh_residential_owner_no_of_dep;
    }

    public BigDecimal getR31_hh_residential_rent_no_of_dep() {
        return r31_hh_residential_rent_no_of_dep;
    }

    public void setR31_hh_residential_rent_no_of_dep(BigDecimal r31_hh_residential_rent_no_of_dep) {
        this.r31_hh_residential_rent_no_of_dep = r31_hh_residential_rent_no_of_dep;
    }

    public BigDecimal getR32_hh_personal_loans_no_of_dep() {
        return r32_hh_personal_loans_no_of_dep;
    }

    public void setR32_hh_personal_loans_no_of_dep(BigDecimal r32_hh_personal_loans_no_of_dep) {
        this.r32_hh_personal_loans_no_of_dep = r32_hh_personal_loans_no_of_dep;
    }

    public BigDecimal getR33_hh_motor_vehicle_no_of_dep() {
        return r33_hh_motor_vehicle_no_of_dep;
    }

    public void setR33_hh_motor_vehicle_no_of_dep(BigDecimal r33_hh_motor_vehicle_no_of_dep) {
        this.r33_hh_motor_vehicle_no_of_dep = r33_hh_motor_vehicle_no_of_dep;
    }

    public BigDecimal getR34_hh_household_goods_no_of_dep() {
        return r34_hh_household_goods_no_of_dep;
    }

    public void setR34_hh_household_goods_no_of_dep(BigDecimal r34_hh_household_goods_no_of_dep) {
        this.r34_hh_household_goods_no_of_dep = r34_hh_household_goods_no_of_dep;
    }

    public BigDecimal getR35_hh_credit_card_loans_no_of_dep() {
        return r35_hh_credit_card_loans_no_of_dep;
    }

    public void setR35_hh_credit_card_loans_no_of_dep(BigDecimal r35_hh_credit_card_loans_no_of_dep) {
        this.r35_hh_credit_card_loans_no_of_dep = r35_hh_credit_card_loans_no_of_dep;
    }

    public BigDecimal getR36_hh_other_no_of_dep() {
        return r36_hh_other_no_of_dep;
    }

    public void setR36_hh_other_no_of_dep(BigDecimal r36_hh_other_no_of_dep) {
        this.r36_hh_other_no_of_dep = r36_hh_other_no_of_dep;
    }

    public BigDecimal getR37_non_profit_inst_hh_no_of_dep() {
        return r37_non_profit_inst_hh_no_of_dep;
    }

    public void setR37_non_profit_inst_hh_no_of_dep(BigDecimal r37_non_profit_inst_hh_no_of_dep) {
        this.r37_non_profit_inst_hh_no_of_dep = r37_non_profit_inst_hh_no_of_dep;
    }

    public BigDecimal getR38_non_residents_no_of_dep() {
        return r38_non_residents_no_of_dep;
    }

    public void setR38_non_residents_no_of_dep(BigDecimal r38_non_residents_no_of_dep) {
        this.r38_non_residents_no_of_dep = r38_non_residents_no_of_dep;
    }

    public BigDecimal getR39_non_res_corp_no_of_dep() {
        return r39_non_res_corp_no_of_dep;
    }

    public void setR39_non_res_corp_no_of_dep(BigDecimal r39_non_res_corp_no_of_dep) {
        this.r39_non_res_corp_no_of_dep = r39_non_res_corp_no_of_dep;
    }

    public BigDecimal getR40_non_res_hh_no_of_dep() {
        return r40_non_res_hh_no_of_dep;
    }

    public void setR40_non_res_hh_no_of_dep(BigDecimal r40_non_res_hh_no_of_dep) {
        this.r40_non_res_hh_no_of_dep = r40_non_res_hh_no_of_dep;
    }

    public BigDecimal getR41_fin_inst_units_no_of_dep() {
        return r41_fin_inst_units_no_of_dep;
    }

    public void setR41_fin_inst_units_no_of_dep(BigDecimal r41_fin_inst_units_no_of_dep) {
        this.r41_fin_inst_units_no_of_dep = r41_fin_inst_units_no_of_dep;
    }

    public BigDecimal getR42_central_bank_no_of_dep() {
        return r42_central_bank_no_of_dep;
    }

    public void setR42_central_bank_no_of_dep(BigDecimal r42_central_bank_no_of_dep) {
        this.r42_central_bank_no_of_dep = r42_central_bank_no_of_dep;
    }

    public BigDecimal getR43_comm_banks_no_of_dep() {
        return r43_comm_banks_no_of_dep;
    }

    public void setR43_comm_banks_no_of_dep(BigDecimal r43_comm_banks_no_of_dep) {
        this.r43_comm_banks_no_of_dep = r43_comm_banks_no_of_dep;
    }

    public BigDecimal getR44_other_dep_corp_no_of_dep() {
        return r44_other_dep_corp_no_of_dep;
    }

    public void setR44_other_dep_corp_no_of_dep(BigDecimal r44_other_dep_corp_no_of_dep) {
        this.r44_other_dep_corp_no_of_dep = r44_other_dep_corp_no_of_dep;
    }

    public BigDecimal getR45_bsb_no_of_dep() {
        return r45_bsb_no_of_dep;
    }

    public void setR45_bsb_no_of_dep(BigDecimal r45_bsb_no_of_dep) {
        this.r45_bsb_no_of_dep = r45_bsb_no_of_dep;
    }

    public BigDecimal getR46_bbs_no_of_dep() {
        return r46_bbs_no_of_dep;
    }

    public void setR46_bbs_no_of_dep(BigDecimal r46_bbs_no_of_dep) {
        this.r46_bbs_no_of_dep = r46_bbs_no_of_dep;
    }

    public BigDecimal getR47_money_mkt_unittrust_no_of_dep() {
        return r47_money_mkt_unittrust_no_of_dep;
    }

    public void setR47_money_mkt_unittrust_no_of_dep(BigDecimal r47_money_mkt_unittrust_no_of_dep) {
        this.r47_money_mkt_unittrust_no_of_dep = r47_money_mkt_unittrust_no_of_dep;
    }

    public BigDecimal getR48_other_dep_corp_specify_no_of_dep() {
        return r48_other_dep_corp_specify_no_of_dep;
    }

    public void setR48_other_dep_corp_specify_no_of_dep(BigDecimal r48_other_dep_corp_specify_no_of_dep) {
        this.r48_other_dep_corp_specify_no_of_dep = r48_other_dep_corp_specify_no_of_dep;
    }

    public BigDecimal getR49_other_fin_corp_no_of_dep() {
        return r49_other_fin_corp_no_of_dep;
    }

    public void setR49_other_fin_corp_no_of_dep(BigDecimal r49_other_fin_corp_no_of_dep) {
        this.r49_other_fin_corp_no_of_dep = r49_other_fin_corp_no_of_dep;
    }

    public BigDecimal getR50_insurance_co_no_of_dep() {
        return r50_insurance_co_no_of_dep;
    }

    public void setR50_insurance_co_no_of_dep(BigDecimal r50_insurance_co_no_of_dep) {
        this.r50_insurance_co_no_of_dep = r50_insurance_co_no_of_dep;
    }

    public BigDecimal getR51_pension_funds_no_of_dep() {
        return r51_pension_funds_no_of_dep;
    }

    public void setR51_pension_funds_no_of_dep(BigDecimal r51_pension_funds_no_of_dep) {
        this.r51_pension_funds_no_of_dep = r51_pension_funds_no_of_dep;
    }

    public BigDecimal getR52_saccos_no_of_dep() {
        return r52_saccos_no_of_dep;
    }

    public void setR52_saccos_no_of_dep(BigDecimal r52_saccos_no_of_dep) {
        this.r52_saccos_no_of_dep = r52_saccos_no_of_dep;
    }

    public BigDecimal getR53_other_fin_intermediaries_no_of_dep() {
        return r53_other_fin_intermediaries_no_of_dep;
    }

    public void setR53_other_fin_intermediaries_no_of_dep(BigDecimal r53_other_fin_intermediaries_no_of_dep) {
        this.r53_other_fin_intermediaries_no_of_dep = r53_other_fin_intermediaries_no_of_dep;
    }

    public BigDecimal getR54_fin_co_no_of_dep() {
        return r54_fin_co_no_of_dep;
    }

    public void setR54_fin_co_no_of_dep(BigDecimal r54_fin_co_no_of_dep) {
        this.r54_fin_co_no_of_dep = r54_fin_co_no_of_dep;
    }

    public BigDecimal getR55_med_aid_schemes_no_of_dep() {
        return r55_med_aid_schemes_no_of_dep;
    }

    public void setR55_med_aid_schemes_no_of_dep(BigDecimal r55_med_aid_schemes_no_of_dep) {
        this.r55_med_aid_schemes_no_of_dep = r55_med_aid_schemes_no_of_dep;
    }

    public BigDecimal getR56_pub_sec_fin_int_no_of_dep() {
        return r56_pub_sec_fin_int_no_of_dep;
    }

    public void setR56_pub_sec_fin_int_no_of_dep(BigDecimal r56_pub_sec_fin_int_no_of_dep) {
        this.r56_pub_sec_fin_int_no_of_dep = r56_pub_sec_fin_int_no_of_dep;
    }

    public BigDecimal getR57_financial_aux_no_of_dep() {
        return r57_financial_aux_no_of_dep;
    }

    public void setR57_financial_aux_no_of_dep(BigDecimal r57_financial_aux_no_of_dep) {
        this.r57_financial_aux_no_of_dep = r57_financial_aux_no_of_dep;
    }

    public BigDecimal getR58_asset_managers_no_of_dep() {
        return r58_asset_managers_no_of_dep;
    }

    public void setR58_asset_managers_no_of_dep(BigDecimal r58_asset_managers_no_of_dep) {
        this.r58_asset_managers_no_of_dep = r58_asset_managers_no_of_dep;
    }

    public BigDecimal getR59_insurance_brokers_no_of_dep() {
        return r59_insurance_brokers_no_of_dep;
    }

    public void setR59_insurance_brokers_no_of_dep(BigDecimal r59_insurance_brokers_no_of_dep) {
        this.r59_insurance_brokers_no_of_dep = r59_insurance_brokers_no_of_dep;
    }

    public BigDecimal getR60_fund_admin_no_of_dep() {
        return r60_fund_admin_no_of_dep;
    }

    public void setR60_fund_admin_no_of_dep(BigDecimal r60_fund_admin_no_of_dep) {
        this.r60_fund_admin_no_of_dep = r60_fund_admin_no_of_dep;
    }

    public BigDecimal getR61_bureau_change_no_of_dep() {
        return r61_bureau_change_no_of_dep;
    }

    public void setR61_bureau_change_no_of_dep(BigDecimal r61_bureau_change_no_of_dep) {
        this.r61_bureau_change_no_of_dep = r61_bureau_change_no_of_dep;
    }

    public BigDecimal getR62_fin_aux_other_no_of_dep() {
        return r62_fin_aux_other_no_of_dep;
    }

    public void setR62_fin_aux_other_no_of_dep(BigDecimal r62_fin_aux_other_no_of_dep) {
        this.r62_fin_aux_other_no_of_dep = r62_fin_aux_other_no_of_dep;
    }

    public BigDecimal getR63_non_residents_fin_no_of_dep() {
        return r63_non_residents_fin_no_of_dep;
    }

    public void setR63_non_residents_fin_no_of_dep(BigDecimal r63_non_residents_fin_no_of_dep) {
        this.r63_non_residents_fin_no_of_dep = r63_non_residents_fin_no_of_dep;
    }

    public BigDecimal getR64_total_no_of_dep() {
        return r64_total_no_of_dep;
    }

    public void setR64_total_no_of_dep(BigDecimal r64_total_no_of_dep) {
        this.r64_total_no_of_dep = r64_total_no_of_dep;
    }

    public BigDecimal getR11_non_fin_inst_units_no_of_dep_ac() {
        return r11_non_fin_inst_units_no_of_dep_ac;
    }

    public void setR11_non_fin_inst_units_no_of_dep_ac(BigDecimal r11_non_fin_inst_units_no_of_dep_ac) {
        this.r11_non_fin_inst_units_no_of_dep_ac = r11_non_fin_inst_units_no_of_dep_ac;
    }

    public BigDecimal getR12_central_govt_no_of_dep_ac() {
        return r12_central_govt_no_of_dep_ac;
    }

    public void setR12_central_govt_no_of_dep_ac(BigDecimal r12_central_govt_no_of_dep_ac) {
        this.r12_central_govt_no_of_dep_ac = r12_central_govt_no_of_dep_ac;
    }

    public BigDecimal getR13_local_govt_no_of_dep_ac() {
        return r13_local_govt_no_of_dep_ac;
    }

    public void setR13_local_govt_no_of_dep_ac(BigDecimal r13_local_govt_no_of_dep_ac) {
        this.r13_local_govt_no_of_dep_ac = r13_local_govt_no_of_dep_ac;
    }

    public BigDecimal getR14_pub_non_fin_corp_no_of_dep_ac() {
        return r14_pub_non_fin_corp_no_of_dep_ac;
    }

    public void setR14_pub_non_fin_corp_no_of_dep_ac(BigDecimal r14_pub_non_fin_corp_no_of_dep_ac) {
        this.r14_pub_non_fin_corp_no_of_dep_ac = r14_pub_non_fin_corp_no_of_dep_ac;
    }

    public BigDecimal getR15_other_non_fin_corp_no_of_dep_ac() {
        return r15_other_non_fin_corp_no_of_dep_ac;
    }

    public void setR15_other_non_fin_corp_no_of_dep_ac(BigDecimal r15_other_non_fin_corp_no_of_dep_ac) {
        this.r15_other_non_fin_corp_no_of_dep_ac = r15_other_non_fin_corp_no_of_dep_ac;
    }

    public BigDecimal getR16_agric_forest_fish_no_of_dep_ac() {
        return r16_agric_forest_fish_no_of_dep_ac;
    }

    public void setR16_agric_forest_fish_no_of_dep_ac(BigDecimal r16_agric_forest_fish_no_of_dep_ac) {
        this.r16_agric_forest_fish_no_of_dep_ac = r16_agric_forest_fish_no_of_dep_ac;
    }

    public BigDecimal getR17_mining_quarry_no_of_dep_ac() {
        return r17_mining_quarry_no_of_dep_ac;
    }

    public void setR17_mining_quarry_no_of_dep_ac(BigDecimal r17_mining_quarry_no_of_dep_ac) {
        this.r17_mining_quarry_no_of_dep_ac = r17_mining_quarry_no_of_dep_ac;
    }

    public BigDecimal getR18_manufacturing_no_of_dep_ac() {
        return r18_manufacturing_no_of_dep_ac;
    }

    public void setR18_manufacturing_no_of_dep_ac(BigDecimal r18_manufacturing_no_of_dep_ac) {
        this.r18_manufacturing_no_of_dep_ac = r18_manufacturing_no_of_dep_ac;
    }

    public BigDecimal getR19_construction_no_of_dep_ac() {
        return r19_construction_no_of_dep_ac;
    }

    public void setR19_construction_no_of_dep_ac(BigDecimal r19_construction_no_of_dep_ac) {
        this.r19_construction_no_of_dep_ac = r19_construction_no_of_dep_ac;
    }

    public BigDecimal getR20_comm_realestate_no_of_dep_ac() {
        return r20_comm_realestate_no_of_dep_ac;
    }

    public void setR20_comm_realestate_no_of_dep_ac(BigDecimal r20_comm_realestate_no_of_dep_ac) {
        this.r20_comm_realestate_no_of_dep_ac = r20_comm_realestate_no_of_dep_ac;
    }

    public BigDecimal getR21_electricity_no_of_dep_ac() {
        return r21_electricity_no_of_dep_ac;
    }

    public void setR21_electricity_no_of_dep_ac(BigDecimal r21_electricity_no_of_dep_ac) {
        this.r21_electricity_no_of_dep_ac = r21_electricity_no_of_dep_ac;
    }

    public BigDecimal getR22_water_no_of_dep_ac() {
        return r22_water_no_of_dep_ac;
    }

    public void setR22_water_no_of_dep_ac(BigDecimal r22_water_no_of_dep_ac) {
        this.r22_water_no_of_dep_ac = r22_water_no_of_dep_ac;
    }

    public BigDecimal getR23_telecom_post_no_of_dep_ac() {
        return r23_telecom_post_no_of_dep_ac;
    }

    public void setR23_telecom_post_no_of_dep_ac(BigDecimal r23_telecom_post_no_of_dep_ac) {
        this.r23_telecom_post_no_of_dep_ac = r23_telecom_post_no_of_dep_ac;
    }

    public BigDecimal getR24_tourism_hotels_no_of_dep_ac() {
        return r24_tourism_hotels_no_of_dep_ac;
    }

    public void setR24_tourism_hotels_no_of_dep_ac(BigDecimal r24_tourism_hotels_no_of_dep_ac) {
        this.r24_tourism_hotels_no_of_dep_ac = r24_tourism_hotels_no_of_dep_ac;
    }

    public BigDecimal getR25_transport_storage_no_of_dep_ac() {
        return r25_transport_storage_no_of_dep_ac;
    }

    public void setR25_transport_storage_no_of_dep_ac(BigDecimal r25_transport_storage_no_of_dep_ac) {
        this.r25_transport_storage_no_of_dep_ac = r25_transport_storage_no_of_dep_ac;
    }

    public BigDecimal getR26_trade_rest_bar_no_of_dep_ac() {
        return r26_trade_rest_bar_no_of_dep_ac;
    }

    public void setR26_trade_rest_bar_no_of_dep_ac(BigDecimal r26_trade_rest_bar_no_of_dep_ac) {
        this.r26_trade_rest_bar_no_of_dep_ac = r26_trade_rest_bar_no_of_dep_ac;
    }

    public BigDecimal getR27_business_services_no_of_dep_ac() {
        return r27_business_services_no_of_dep_ac;
    }

    public void setR27_business_services_no_of_dep_ac(BigDecimal r27_business_services_no_of_dep_ac) {
        this.r27_business_services_no_of_dep_ac = r27_business_services_no_of_dep_ac;
    }

    public BigDecimal getR28_community_services_no_of_dep_ac() {
        return r28_community_services_no_of_dep_ac;
    }

    public void setR28_community_services_no_of_dep_ac(BigDecimal r28_community_services_no_of_dep_ac) {
        this.r28_community_services_no_of_dep_ac = r28_community_services_no_of_dep_ac;
    }

    public BigDecimal getR29_households_no_of_dep_ac() {
        return r29_households_no_of_dep_ac;
    }

    public void setR29_households_no_of_dep_ac(BigDecimal r29_households_no_of_dep_ac) {
        this.r29_households_no_of_dep_ac = r29_households_no_of_dep_ac;
    }

    public BigDecimal getR30_hh_residential_owner_no_of_dep_ac() {
        return r30_hh_residential_owner_no_of_dep_ac;
    }

    public void setR30_hh_residential_owner_no_of_dep_ac(BigDecimal r30_hh_residential_owner_no_of_dep_ac) {
        this.r30_hh_residential_owner_no_of_dep_ac = r30_hh_residential_owner_no_of_dep_ac;
    }

    public BigDecimal getR31_hh_residential_rent_no_of_dep_ac() {
        return r31_hh_residential_rent_no_of_dep_ac;
    }

    public void setR31_hh_residential_rent_no_of_dep_ac(BigDecimal r31_hh_residential_rent_no_of_dep_ac) {
        this.r31_hh_residential_rent_no_of_dep_ac = r31_hh_residential_rent_no_of_dep_ac;
    }

    public BigDecimal getR32_hh_personal_loans_no_of_dep_ac() {
        return r32_hh_personal_loans_no_of_dep_ac;
    }

    public void setR32_hh_personal_loans_no_of_dep_ac(BigDecimal r32_hh_personal_loans_no_of_dep_ac) {
        this.r32_hh_personal_loans_no_of_dep_ac = r32_hh_personal_loans_no_of_dep_ac;
    }

    public BigDecimal getR33_hh_motor_vehicle_no_of_dep_ac() {
        return r33_hh_motor_vehicle_no_of_dep_ac;
    }

    public void setR33_hh_motor_vehicle_no_of_dep_ac(BigDecimal r33_hh_motor_vehicle_no_of_dep_ac) {
        this.r33_hh_motor_vehicle_no_of_dep_ac = r33_hh_motor_vehicle_no_of_dep_ac;
    }

    public BigDecimal getR34_hh_household_goods_no_of_dep_ac() {
        return r34_hh_household_goods_no_of_dep_ac;
    }

    public void setR34_hh_household_goods_no_of_dep_ac(BigDecimal r34_hh_household_goods_no_of_dep_ac) {
        this.r34_hh_household_goods_no_of_dep_ac = r34_hh_household_goods_no_of_dep_ac;
    }

    public BigDecimal getR35_hh_credit_card_loans_no_of_dep_ac() {
        return r35_hh_credit_card_loans_no_of_dep_ac;
    }

    public void setR35_hh_credit_card_loans_no_of_dep_ac(BigDecimal r35_hh_credit_card_loans_no_of_dep_ac) {
        this.r35_hh_credit_card_loans_no_of_dep_ac = r35_hh_credit_card_loans_no_of_dep_ac;
    }

    public BigDecimal getR36_hh_other_no_of_dep_ac() {
        return r36_hh_other_no_of_dep_ac;
    }

    public void setR36_hh_other_no_of_dep_ac(BigDecimal r36_hh_other_no_of_dep_ac) {
        this.r36_hh_other_no_of_dep_ac = r36_hh_other_no_of_dep_ac;
    }

    public BigDecimal getR37_non_profit_inst_hh_no_of_dep_ac() {
        return r37_non_profit_inst_hh_no_of_dep_ac;
    }

    public void setR37_non_profit_inst_hh_no_of_dep_ac(BigDecimal r37_non_profit_inst_hh_no_of_dep_ac) {
        this.r37_non_profit_inst_hh_no_of_dep_ac = r37_non_profit_inst_hh_no_of_dep_ac;
    }

    public BigDecimal getR38_non_residents_no_of_dep_ac() {
        return r38_non_residents_no_of_dep_ac;
    }

    public void setR38_non_residents_no_of_dep_ac(BigDecimal r38_non_residents_no_of_dep_ac) {
        this.r38_non_residents_no_of_dep_ac = r38_non_residents_no_of_dep_ac;
    }

    public BigDecimal getR39_non_res_corp_no_of_dep_ac() {
        return r39_non_res_corp_no_of_dep_ac;
    }

    public void setR39_non_res_corp_no_of_dep_ac(BigDecimal r39_non_res_corp_no_of_dep_ac) {
        this.r39_non_res_corp_no_of_dep_ac = r39_non_res_corp_no_of_dep_ac;
    }

    public BigDecimal getR40_non_res_hh_no_of_dep_ac() {
        return r40_non_res_hh_no_of_dep_ac;
    }

    public void setR40_non_res_hh_no_of_dep_ac(BigDecimal r40_non_res_hh_no_of_dep_ac) {
        this.r40_non_res_hh_no_of_dep_ac = r40_non_res_hh_no_of_dep_ac;
    }

    public BigDecimal getR41_fin_inst_units_no_of_dep_ac() {
        return r41_fin_inst_units_no_of_dep_ac;
    }

    public void setR41_fin_inst_units_no_of_dep_ac(BigDecimal r41_fin_inst_units_no_of_dep_ac) {
        this.r41_fin_inst_units_no_of_dep_ac = r41_fin_inst_units_no_of_dep_ac;
    }

    public BigDecimal getR42_central_bank_no_of_dep_ac() {
        return r42_central_bank_no_of_dep_ac;
    }

    public void setR42_central_bank_no_of_dep_ac(BigDecimal r42_central_bank_no_of_dep_ac) {
        this.r42_central_bank_no_of_dep_ac = r42_central_bank_no_of_dep_ac;
    }

    public BigDecimal getR43_comm_banks_no_of_dep_ac() {
        return r43_comm_banks_no_of_dep_ac;
    }

    public void setR43_comm_banks_no_of_dep_ac(BigDecimal r43_comm_banks_no_of_dep_ac) {
        this.r43_comm_banks_no_of_dep_ac = r43_comm_banks_no_of_dep_ac;
    }

    public BigDecimal getR44_other_dep_corp_no_of_dep_ac() {
        return r44_other_dep_corp_no_of_dep_ac;
    }

    public void setR44_other_dep_corp_no_of_dep_ac(BigDecimal r44_other_dep_corp_no_of_dep_ac) {
        this.r44_other_dep_corp_no_of_dep_ac = r44_other_dep_corp_no_of_dep_ac;
    }

    public BigDecimal getR45_bsb_no_of_dep_ac() {
        return r45_bsb_no_of_dep_ac;
    }

    public void setR45_bsb_no_of_dep_ac(BigDecimal r45_bsb_no_of_dep_ac) {
        this.r45_bsb_no_of_dep_ac = r45_bsb_no_of_dep_ac;
    }

    public BigDecimal getR46_bbs_no_of_dep_ac() {
        return r46_bbs_no_of_dep_ac;
    }

    public void setR46_bbs_no_of_dep_ac(BigDecimal r46_bbs_no_of_dep_ac) {
        this.r46_bbs_no_of_dep_ac = r46_bbs_no_of_dep_ac;
    }

    public BigDecimal getR47_money_mkt_unittrust_no_of_dep_ac() {
        return r47_money_mkt_unittrust_no_of_dep_ac;
    }

    public void setR47_money_mkt_unittrust_no_of_dep_ac(BigDecimal r47_money_mkt_unittrust_no_of_dep_ac) {
        this.r47_money_mkt_unittrust_no_of_dep_ac = r47_money_mkt_unittrust_no_of_dep_ac;
    }

    public BigDecimal getR48_other_dep_corp_specify_no_of_dep_ac() {
        return r48_other_dep_corp_specify_no_of_dep_ac;
    }

    public void setR48_other_dep_corp_specify_no_of_dep_ac(BigDecimal r48_other_dep_corp_specify_no_of_dep_ac) {
        this.r48_other_dep_corp_specify_no_of_dep_ac = r48_other_dep_corp_specify_no_of_dep_ac;
    }

    public BigDecimal getR49_other_fin_corp_no_of_dep_ac() {
        return r49_other_fin_corp_no_of_dep_ac;
    }

    public void setR49_other_fin_corp_no_of_dep_ac(BigDecimal r49_other_fin_corp_no_of_dep_ac) {
        this.r49_other_fin_corp_no_of_dep_ac = r49_other_fin_corp_no_of_dep_ac;
    }

    public BigDecimal getR50_insurance_co_no_of_dep_ac() {
        return r50_insurance_co_no_of_dep_ac;
    }

    public void setR50_insurance_co_no_of_dep_ac(BigDecimal r50_insurance_co_no_of_dep_ac) {
        this.r50_insurance_co_no_of_dep_ac = r50_insurance_co_no_of_dep_ac;
    }

    public BigDecimal getR51_pension_funds_no_of_dep_ac() {
        return r51_pension_funds_no_of_dep_ac;
    }

    public void setR51_pension_funds_no_of_dep_ac(BigDecimal r51_pension_funds_no_of_dep_ac) {
        this.r51_pension_funds_no_of_dep_ac = r51_pension_funds_no_of_dep_ac;
    }

    public BigDecimal getR52_saccos_no_of_dep_ac() {
        return r52_saccos_no_of_dep_ac;
    }

    public void setR52_saccos_no_of_dep_ac(BigDecimal r52_saccos_no_of_dep_ac) {
        this.r52_saccos_no_of_dep_ac = r52_saccos_no_of_dep_ac;
    }

    public BigDecimal getR53_other_fin_intermediaries_no_of_dep_ac() {
        return r53_other_fin_intermediaries_no_of_dep_ac;
    }

    public void setR53_other_fin_intermediaries_no_of_dep_ac(BigDecimal r53_other_fin_intermediaries_no_of_dep_ac) {
        this.r53_other_fin_intermediaries_no_of_dep_ac = r53_other_fin_intermediaries_no_of_dep_ac;
    }

    public BigDecimal getR54_fin_co_no_of_dep_ac() {
        return r54_fin_co_no_of_dep_ac;
    }

    public void setR54_fin_co_no_of_dep_ac(BigDecimal r54_fin_co_no_of_dep_ac) {
        this.r54_fin_co_no_of_dep_ac = r54_fin_co_no_of_dep_ac;
    }

    public BigDecimal getR55_med_aid_schemes_no_of_dep_ac() {
        return r55_med_aid_schemes_no_of_dep_ac;
    }

    public void setR55_med_aid_schemes_no_of_dep_ac(BigDecimal r55_med_aid_schemes_no_of_dep_ac) {
        this.r55_med_aid_schemes_no_of_dep_ac = r55_med_aid_schemes_no_of_dep_ac;
    }

    public BigDecimal getR56_pub_sec_fin_int_no_of_dep_ac() {
        return r56_pub_sec_fin_int_no_of_dep_ac;
    }

    public void setR56_pub_sec_fin_int_no_of_dep_ac(BigDecimal r56_pub_sec_fin_int_no_of_dep_ac) {
        this.r56_pub_sec_fin_int_no_of_dep_ac = r56_pub_sec_fin_int_no_of_dep_ac;
    }

    public BigDecimal getR57_financial_aux_no_of_dep_ac() {
        return r57_financial_aux_no_of_dep_ac;
    }

    public void setR57_financial_aux_no_of_dep_ac(BigDecimal r57_financial_aux_no_of_dep_ac) {
        this.r57_financial_aux_no_of_dep_ac = r57_financial_aux_no_of_dep_ac;
    }

    public BigDecimal getR58_asset_managers_no_of_dep_ac() {
        return r58_asset_managers_no_of_dep_ac;
    }

    public void setR58_asset_managers_no_of_dep_ac(BigDecimal r58_asset_managers_no_of_dep_ac) {
        this.r58_asset_managers_no_of_dep_ac = r58_asset_managers_no_of_dep_ac;
    }

    public BigDecimal getR59_insurance_brokers_no_of_dep_ac() {
        return r59_insurance_brokers_no_of_dep_ac;
    }

    public void setR59_insurance_brokers_no_of_dep_ac(BigDecimal r59_insurance_brokers_no_of_dep_ac) {
        this.r59_insurance_brokers_no_of_dep_ac = r59_insurance_brokers_no_of_dep_ac;
    }

    public BigDecimal getR60_fund_admin_no_of_dep_ac() {
        return r60_fund_admin_no_of_dep_ac;
    }

    public void setR60_fund_admin_no_of_dep_ac(BigDecimal r60_fund_admin_no_of_dep_ac) {
        this.r60_fund_admin_no_of_dep_ac = r60_fund_admin_no_of_dep_ac;
    }

    public BigDecimal getR61_bureau_change_no_of_dep_ac() {
        return r61_bureau_change_no_of_dep_ac;
    }

    public void setR61_bureau_change_no_of_dep_ac(BigDecimal r61_bureau_change_no_of_dep_ac) {
        this.r61_bureau_change_no_of_dep_ac = r61_bureau_change_no_of_dep_ac;
    }

    public BigDecimal getR62_fin_aux_other_no_of_dep_ac() {
        return r62_fin_aux_other_no_of_dep_ac;
    }

    public void setR62_fin_aux_other_no_of_dep_ac(BigDecimal r62_fin_aux_other_no_of_dep_ac) {
        this.r62_fin_aux_other_no_of_dep_ac = r62_fin_aux_other_no_of_dep_ac;
    }

    public BigDecimal getR63_non_residents_fin_no_of_dep_ac() {
        return r63_non_residents_fin_no_of_dep_ac;
    }

    public void setR63_non_residents_fin_no_of_dep_ac(BigDecimal r63_non_residents_fin_no_of_dep_ac) {
        this.r63_non_residents_fin_no_of_dep_ac = r63_non_residents_fin_no_of_dep_ac;
    }

    public BigDecimal getR64_total_no_of_dep_ac() {
        return r64_total_no_of_dep_ac;
    }

    public void setR64_total_no_of_dep_ac(BigDecimal r64_total_no_of_dep_ac) {
        this.r64_total_no_of_dep_ac = r64_total_no_of_dep_ac;
    }

    public BigDecimal getR11_non_fin_inst_units_no_of_brw() {
        return r11_non_fin_inst_units_no_of_brw;
    }

    public void setR11_non_fin_inst_units_no_of_brw(BigDecimal r11_non_fin_inst_units_no_of_brw) {
        this.r11_non_fin_inst_units_no_of_brw = r11_non_fin_inst_units_no_of_brw;
    }

    public BigDecimal getR12_central_govt_no_of_brw() {
        return r12_central_govt_no_of_brw;
    }

    public void setR12_central_govt_no_of_brw(BigDecimal r12_central_govt_no_of_brw) {
        this.r12_central_govt_no_of_brw = r12_central_govt_no_of_brw;
    }

    public BigDecimal getR13_local_govt_no_of_brw() {
        return r13_local_govt_no_of_brw;
    }

    public void setR13_local_govt_no_of_brw(BigDecimal r13_local_govt_no_of_brw) {
        this.r13_local_govt_no_of_brw = r13_local_govt_no_of_brw;
    }

    public BigDecimal getR14_pub_non_fin_corp_no_of_brw() {
        return r14_pub_non_fin_corp_no_of_brw;
    }

    public void setR14_pub_non_fin_corp_no_of_brw(BigDecimal r14_pub_non_fin_corp_no_of_brw) {
        this.r14_pub_non_fin_corp_no_of_brw = r14_pub_non_fin_corp_no_of_brw;
    }

    public BigDecimal getR15_other_non_fin_corp_no_of_brw() {
        return r15_other_non_fin_corp_no_of_brw;
    }

    public void setR15_other_non_fin_corp_no_of_brw(BigDecimal r15_other_non_fin_corp_no_of_brw) {
        this.r15_other_non_fin_corp_no_of_brw = r15_other_non_fin_corp_no_of_brw;
    }

    public BigDecimal getR16_agric_forest_fish_no_of_brw() {
        return r16_agric_forest_fish_no_of_brw;
    }

    public void setR16_agric_forest_fish_no_of_brw(BigDecimal r16_agric_forest_fish_no_of_brw) {
        this.r16_agric_forest_fish_no_of_brw = r16_agric_forest_fish_no_of_brw;
    }

    public BigDecimal getR17_mining_quarry_no_of_brw() {
        return r17_mining_quarry_no_of_brw;
    }

    public void setR17_mining_quarry_no_of_brw(BigDecimal r17_mining_quarry_no_of_brw) {
        this.r17_mining_quarry_no_of_brw = r17_mining_quarry_no_of_brw;
    }

    public BigDecimal getR18_manufacturing_no_of_brw() {
        return r18_manufacturing_no_of_brw;
    }

    public void setR18_manufacturing_no_of_brw(BigDecimal r18_manufacturing_no_of_brw) {
        this.r18_manufacturing_no_of_brw = r18_manufacturing_no_of_brw;
    }

    public BigDecimal getR19_construction_no_of_brw() {
        return r19_construction_no_of_brw;
    }

    public void setR19_construction_no_of_brw(BigDecimal r19_construction_no_of_brw) {
        this.r19_construction_no_of_brw = r19_construction_no_of_brw;
    }

    public BigDecimal getR20_comm_realestate_no_of_brw() {
        return r20_comm_realestate_no_of_brw;
    }

    public void setR20_comm_realestate_no_of_brw(BigDecimal r20_comm_realestate_no_of_brw) {
        this.r20_comm_realestate_no_of_brw = r20_comm_realestate_no_of_brw;
    }

    public BigDecimal getR21_electricity_no_of_brw() {
        return r21_electricity_no_of_brw;
    }

    public void setR21_electricity_no_of_brw(BigDecimal r21_electricity_no_of_brw) {
        this.r21_electricity_no_of_brw = r21_electricity_no_of_brw;
    }

    public BigDecimal getR22_water_no_of_brw() {
        return r22_water_no_of_brw;
    }

    public void setR22_water_no_of_brw(BigDecimal r22_water_no_of_brw) {
        this.r22_water_no_of_brw = r22_water_no_of_brw;
    }

    public BigDecimal getR23_telecom_post_no_of_brw() {
        return r23_telecom_post_no_of_brw;
    }

    public void setR23_telecom_post_no_of_brw(BigDecimal r23_telecom_post_no_of_brw) {
        this.r23_telecom_post_no_of_brw = r23_telecom_post_no_of_brw;
    }

    public BigDecimal getR24_tourism_hotels_no_of_brw() {
        return r24_tourism_hotels_no_of_brw;
    }

    public void setR24_tourism_hotels_no_of_brw(BigDecimal r24_tourism_hotels_no_of_brw) {
        this.r24_tourism_hotels_no_of_brw = r24_tourism_hotels_no_of_brw;
    }

    public BigDecimal getR25_transport_storage_no_of_brw() {
        return r25_transport_storage_no_of_brw;
    }

    public void setR25_transport_storage_no_of_brw(BigDecimal r25_transport_storage_no_of_brw) {
        this.r25_transport_storage_no_of_brw = r25_transport_storage_no_of_brw;
    }

    public BigDecimal getR26_trade_rest_bar_no_of_brw() {
        return r26_trade_rest_bar_no_of_brw;
    }

    public void setR26_trade_rest_bar_no_of_brw(BigDecimal r26_trade_rest_bar_no_of_brw) {
        this.r26_trade_rest_bar_no_of_brw = r26_trade_rest_bar_no_of_brw;
    }

    public BigDecimal getR27_business_services_no_of_brw() {
        return r27_business_services_no_of_brw;
    }

    public void setR27_business_services_no_of_brw(BigDecimal r27_business_services_no_of_brw) {
        this.r27_business_services_no_of_brw = r27_business_services_no_of_brw;
    }

    public BigDecimal getR28_community_services_no_of_brw() {
        return r28_community_services_no_of_brw;
    }

    public void setR28_community_services_no_of_brw(BigDecimal r28_community_services_no_of_brw) {
        this.r28_community_services_no_of_brw = r28_community_services_no_of_brw;
    }

    public BigDecimal getR29_households_no_of_brw() {
        return r29_households_no_of_brw;
    }

    public void setR29_households_no_of_brw(BigDecimal r29_households_no_of_brw) {
        this.r29_households_no_of_brw = r29_households_no_of_brw;
    }

    public BigDecimal getR30_hh_residential_owner_no_of_brw() {
        return r30_hh_residential_owner_no_of_brw;
    }

    public void setR30_hh_residential_owner_no_of_brw(BigDecimal r30_hh_residential_owner_no_of_brw) {
        this.r30_hh_residential_owner_no_of_brw = r30_hh_residential_owner_no_of_brw;
    }

    public BigDecimal getR31_hh_residential_rent_no_of_brw() {
        return r31_hh_residential_rent_no_of_brw;
    }

    public void setR31_hh_residential_rent_no_of_brw(BigDecimal r31_hh_residential_rent_no_of_brw) {
        this.r31_hh_residential_rent_no_of_brw = r31_hh_residential_rent_no_of_brw;
    }

    public BigDecimal getR32_hh_personal_loans_no_of_brw() {
        return r32_hh_personal_loans_no_of_brw;
    }

    public void setR32_hh_personal_loans_no_of_brw(BigDecimal r32_hh_personal_loans_no_of_brw) {
        this.r32_hh_personal_loans_no_of_brw = r32_hh_personal_loans_no_of_brw;
    }

    public BigDecimal getR33_hh_motor_vehicle_no_of_brw() {
        return r33_hh_motor_vehicle_no_of_brw;
    }

    public void setR33_hh_motor_vehicle_no_of_brw(BigDecimal r33_hh_motor_vehicle_no_of_brw) {
        this.r33_hh_motor_vehicle_no_of_brw = r33_hh_motor_vehicle_no_of_brw;
    }

    public BigDecimal getR34_hh_household_goods_no_of_brw() {
        return r34_hh_household_goods_no_of_brw;
    }

    public void setR34_hh_household_goods_no_of_brw(BigDecimal r34_hh_household_goods_no_of_brw) {
        this.r34_hh_household_goods_no_of_brw = r34_hh_household_goods_no_of_brw;
    }

    public BigDecimal getR35_hh_credit_card_loans_no_of_brw() {
        return r35_hh_credit_card_loans_no_of_brw;
    }

    public void setR35_hh_credit_card_loans_no_of_brw(BigDecimal r35_hh_credit_card_loans_no_of_brw) {
        this.r35_hh_credit_card_loans_no_of_brw = r35_hh_credit_card_loans_no_of_brw;
    }

    public BigDecimal getR36_hh_other_no_of_brw() {
        return r36_hh_other_no_of_brw;
    }

    public void setR36_hh_other_no_of_brw(BigDecimal r36_hh_other_no_of_brw) {
        this.r36_hh_other_no_of_brw = r36_hh_other_no_of_brw;
    }

    public BigDecimal getR37_non_profit_inst_hh_no_of_brw() {
        return r37_non_profit_inst_hh_no_of_brw;
    }

    public void setR37_non_profit_inst_hh_no_of_brw(BigDecimal r37_non_profit_inst_hh_no_of_brw) {
        this.r37_non_profit_inst_hh_no_of_brw = r37_non_profit_inst_hh_no_of_brw;
    }

    public BigDecimal getR38_non_residents_no_of_brw() {
        return r38_non_residents_no_of_brw;
    }

    public void setR38_non_residents_no_of_brw(BigDecimal r38_non_residents_no_of_brw) {
        this.r38_non_residents_no_of_brw = r38_non_residents_no_of_brw;
    }

    public BigDecimal getR39_non_res_corp_no_of_brw() {
        return r39_non_res_corp_no_of_brw;
    }

    public void setR39_non_res_corp_no_of_brw(BigDecimal r39_non_res_corp_no_of_brw) {
        this.r39_non_res_corp_no_of_brw = r39_non_res_corp_no_of_brw;
    }

    public BigDecimal getR40_non_res_hh_no_of_brw() {
        return r40_non_res_hh_no_of_brw;
    }

    public void setR40_non_res_hh_no_of_brw(BigDecimal r40_non_res_hh_no_of_brw) {
        this.r40_non_res_hh_no_of_brw = r40_non_res_hh_no_of_brw;
    }

    public BigDecimal getR41_fin_inst_units_no_of_brw() {
        return r41_fin_inst_units_no_of_brw;
    }

    public void setR41_fin_inst_units_no_of_brw(BigDecimal r41_fin_inst_units_no_of_brw) {
        this.r41_fin_inst_units_no_of_brw = r41_fin_inst_units_no_of_brw;
    }

    public BigDecimal getR42_central_bank_no_of_brw() {
        return r42_central_bank_no_of_brw;
    }

    public void setR42_central_bank_no_of_brw(BigDecimal r42_central_bank_no_of_brw) {
        this.r42_central_bank_no_of_brw = r42_central_bank_no_of_brw;
    }

    public BigDecimal getR43_comm_banks_no_of_brw() {
        return r43_comm_banks_no_of_brw;
    }

    public void setR43_comm_banks_no_of_brw(BigDecimal r43_comm_banks_no_of_brw) {
        this.r43_comm_banks_no_of_brw = r43_comm_banks_no_of_brw;
    }

    public BigDecimal getR44_other_dep_corp_no_of_brw() {
        return r44_other_dep_corp_no_of_brw;
    }

    public void setR44_other_dep_corp_no_of_brw(BigDecimal r44_other_dep_corp_no_of_brw) {
        this.r44_other_dep_corp_no_of_brw = r44_other_dep_corp_no_of_brw;
    }

    public BigDecimal getR45_bsb_no_of_brw() {
        return r45_bsb_no_of_brw;
    }

    public void setR45_bsb_no_of_brw(BigDecimal r45_bsb_no_of_brw) {
        this.r45_bsb_no_of_brw = r45_bsb_no_of_brw;
    }

    public BigDecimal getR46_bbs_no_of_brw() {
        return r46_bbs_no_of_brw;
    }

    public void setR46_bbs_no_of_brw(BigDecimal r46_bbs_no_of_brw) {
        this.r46_bbs_no_of_brw = r46_bbs_no_of_brw;
    }

    public BigDecimal getR47_money_mkt_unittrust_no_of_brw() {
        return r47_money_mkt_unittrust_no_of_brw;
    }

    public void setR47_money_mkt_unittrust_no_of_brw(BigDecimal r47_money_mkt_unittrust_no_of_brw) {
        this.r47_money_mkt_unittrust_no_of_brw = r47_money_mkt_unittrust_no_of_brw;
    }

    public BigDecimal getR48_other_dep_corp_specify_no_of_brw() {
        return r48_other_dep_corp_specify_no_of_brw;
    }

    public void setR48_other_dep_corp_specify_no_of_brw(BigDecimal r48_other_dep_corp_specify_no_of_brw) {
        this.r48_other_dep_corp_specify_no_of_brw = r48_other_dep_corp_specify_no_of_brw;
    }

    public BigDecimal getR49_other_fin_corp_no_of_brw() {
        return r49_other_fin_corp_no_of_brw;
    }

    public void setR49_other_fin_corp_no_of_brw(BigDecimal r49_other_fin_corp_no_of_brw) {
        this.r49_other_fin_corp_no_of_brw = r49_other_fin_corp_no_of_brw;
    }

    public BigDecimal getR50_insurance_co_no_of_brw() {
        return r50_insurance_co_no_of_brw;
    }

    public void setR50_insurance_co_no_of_brw(BigDecimal r50_insurance_co_no_of_brw) {
        this.r50_insurance_co_no_of_brw = r50_insurance_co_no_of_brw;
    }

    public BigDecimal getR51_pension_funds_no_of_brw() {
        return r51_pension_funds_no_of_brw;
    }

    public void setR51_pension_funds_no_of_brw(BigDecimal r51_pension_funds_no_of_brw) {
        this.r51_pension_funds_no_of_brw = r51_pension_funds_no_of_brw;
    }

    public BigDecimal getR52_saccos_no_of_brw() {
        return r52_saccos_no_of_brw;
    }

    public void setR52_saccos_no_of_brw(BigDecimal r52_saccos_no_of_brw) {
        this.r52_saccos_no_of_brw = r52_saccos_no_of_brw;
    }

    public BigDecimal getR53_other_fin_intermediaries_no_of_brw() {
        return r53_other_fin_intermediaries_no_of_brw;
    }

    public void setR53_other_fin_intermediaries_no_of_brw(BigDecimal r53_other_fin_intermediaries_no_of_brw) {
        this.r53_other_fin_intermediaries_no_of_brw = r53_other_fin_intermediaries_no_of_brw;
    }

    public BigDecimal getR54_fin_co_no_of_brw() {
        return r54_fin_co_no_of_brw;
    }

    public void setR54_fin_co_no_of_brw(BigDecimal r54_fin_co_no_of_brw) {
        this.r54_fin_co_no_of_brw = r54_fin_co_no_of_brw;
    }

    public BigDecimal getR55_med_aid_schemes_no_of_brw() {
        return r55_med_aid_schemes_no_of_brw;
    }

    public void setR55_med_aid_schemes_no_of_brw(BigDecimal r55_med_aid_schemes_no_of_brw) {
        this.r55_med_aid_schemes_no_of_brw = r55_med_aid_schemes_no_of_brw;
    }

    public BigDecimal getR56_pub_sec_fin_int_no_of_brw() {
        return r56_pub_sec_fin_int_no_of_brw;
    }

    public void setR56_pub_sec_fin_int_no_of_brw(BigDecimal r56_pub_sec_fin_int_no_of_brw) {
        this.r56_pub_sec_fin_int_no_of_brw = r56_pub_sec_fin_int_no_of_brw;
    }

    public BigDecimal getR57_financial_aux_no_of_brw() {
        return r57_financial_aux_no_of_brw;
    }

    public void setR57_financial_aux_no_of_brw(BigDecimal r57_financial_aux_no_of_brw) {
        this.r57_financial_aux_no_of_brw = r57_financial_aux_no_of_brw;
    }

    public BigDecimal getR58_asset_managers_no_of_brw() {
        return r58_asset_managers_no_of_brw;
    }

    public void setR58_asset_managers_no_of_brw(BigDecimal r58_asset_managers_no_of_brw) {
        this.r58_asset_managers_no_of_brw = r58_asset_managers_no_of_brw;
    }

    public BigDecimal getR59_insurance_brokers_no_of_brw() {
        return r59_insurance_brokers_no_of_brw;
    }

    public void setR59_insurance_brokers_no_of_brw(BigDecimal r59_insurance_brokers_no_of_brw) {
        this.r59_insurance_brokers_no_of_brw = r59_insurance_brokers_no_of_brw;
    }

    public BigDecimal getR60_fund_admin_no_of_brw() {
        return r60_fund_admin_no_of_brw;
    }

    public void setR60_fund_admin_no_of_brw(BigDecimal r60_fund_admin_no_of_brw) {
        this.r60_fund_admin_no_of_brw = r60_fund_admin_no_of_brw;
    }

    public BigDecimal getR61_bureau_change_no_of_brw() {
        return r61_bureau_change_no_of_brw;
    }

    public void setR61_bureau_change_no_of_brw(BigDecimal r61_bureau_change_no_of_brw) {
        this.r61_bureau_change_no_of_brw = r61_bureau_change_no_of_brw;
    }

    public BigDecimal getR62_fin_aux_other_no_of_brw() {
        return r62_fin_aux_other_no_of_brw;
    }

    public void setR62_fin_aux_other_no_of_brw(BigDecimal r62_fin_aux_other_no_of_brw) {
        this.r62_fin_aux_other_no_of_brw = r62_fin_aux_other_no_of_brw;
    }

    public BigDecimal getR63_non_residents_fin_no_of_brw() {
        return r63_non_residents_fin_no_of_brw;
    }

    public void setR63_non_residents_fin_no_of_brw(BigDecimal r63_non_residents_fin_no_of_brw) {
        this.r63_non_residents_fin_no_of_brw = r63_non_residents_fin_no_of_brw;
    }

    public BigDecimal getR64_total_no_of_brw() {
        return r64_total_no_of_brw;
    }

    public void setR64_total_no_of_brw(BigDecimal r64_total_no_of_brw) {
        this.r64_total_no_of_brw = r64_total_no_of_brw;
    }

    public BigDecimal getR11_non_fin_inst_units_no_loan_ac() {
        return r11_non_fin_inst_units_no_loan_ac;
    }

    public void setR11_non_fin_inst_units_no_loan_ac(BigDecimal r11_non_fin_inst_units_no_loan_ac) {
        this.r11_non_fin_inst_units_no_loan_ac = r11_non_fin_inst_units_no_loan_ac;
    }

    public BigDecimal getR12_central_govt_no_loan_ac() {
        return r12_central_govt_no_loan_ac;
    }

    public void setR12_central_govt_no_loan_ac(BigDecimal r12_central_govt_no_loan_ac) {
        this.r12_central_govt_no_loan_ac = r12_central_govt_no_loan_ac;
    }

    public BigDecimal getR13_local_govt_no_loan_ac() {
        return r13_local_govt_no_loan_ac;
    }

    public void setR13_local_govt_no_loan_ac(BigDecimal r13_local_govt_no_loan_ac) {
        this.r13_local_govt_no_loan_ac = r13_local_govt_no_loan_ac;
    }

    public BigDecimal getR14_pub_non_fin_corp_no_loan_ac() {
        return r14_pub_non_fin_corp_no_loan_ac;
    }

    public void setR14_pub_non_fin_corp_no_loan_ac(BigDecimal r14_pub_non_fin_corp_no_loan_ac) {
        this.r14_pub_non_fin_corp_no_loan_ac = r14_pub_non_fin_corp_no_loan_ac;
    }

    public BigDecimal getR15_other_non_fin_corp_no_loan_ac() {
        return r15_other_non_fin_corp_no_loan_ac;
    }

    public void setR15_other_non_fin_corp_no_loan_ac(BigDecimal r15_other_non_fin_corp_no_loan_ac) {
        this.r15_other_non_fin_corp_no_loan_ac = r15_other_non_fin_corp_no_loan_ac;
    }

    public BigDecimal getR16_agric_forest_fish_no_loan_ac() {
        return r16_agric_forest_fish_no_loan_ac;
    }

    public void setR16_agric_forest_fish_no_loan_ac(BigDecimal r16_agric_forest_fish_no_loan_ac) {
        this.r16_agric_forest_fish_no_loan_ac = r16_agric_forest_fish_no_loan_ac;
    }

    public BigDecimal getR17_mining_quarry_no_loan_ac() {
        return r17_mining_quarry_no_loan_ac;
    }

    public void setR17_mining_quarry_no_loan_ac(BigDecimal r17_mining_quarry_no_loan_ac) {
        this.r17_mining_quarry_no_loan_ac = r17_mining_quarry_no_loan_ac;
    }

    public BigDecimal getR18_manufacturing_no_loan_ac() {
        return r18_manufacturing_no_loan_ac;
    }

    public void setR18_manufacturing_no_loan_ac(BigDecimal r18_manufacturing_no_loan_ac) {
        this.r18_manufacturing_no_loan_ac = r18_manufacturing_no_loan_ac;
    }

    public BigDecimal getR19_construction_no_loan_ac() {
        return r19_construction_no_loan_ac;
    }

    public void setR19_construction_no_loan_ac(BigDecimal r19_construction_no_loan_ac) {
        this.r19_construction_no_loan_ac = r19_construction_no_loan_ac;
    }

    public BigDecimal getR20_comm_realestate_no_loan_ac() {
        return r20_comm_realestate_no_loan_ac;
    }

    public void setR20_comm_realestate_no_loan_ac(BigDecimal r20_comm_realestate_no_loan_ac) {
        this.r20_comm_realestate_no_loan_ac = r20_comm_realestate_no_loan_ac;
    }

    public BigDecimal getR21_electricity_no_loan_ac() {
        return r21_electricity_no_loan_ac;
    }

    public void setR21_electricity_no_loan_ac(BigDecimal r21_electricity_no_loan_ac) {
        this.r21_electricity_no_loan_ac = r21_electricity_no_loan_ac;
    }

    public BigDecimal getR22_water_no_loan_ac() {
        return r22_water_no_loan_ac;
    }

    public void setR22_water_no_loan_ac(BigDecimal r22_water_no_loan_ac) {
        this.r22_water_no_loan_ac = r22_water_no_loan_ac;
    }

    public BigDecimal getR23_telecom_post_no_loan_ac() {
        return r23_telecom_post_no_loan_ac;
    }

    public void setR23_telecom_post_no_loan_ac(BigDecimal r23_telecom_post_no_loan_ac) {
        this.r23_telecom_post_no_loan_ac = r23_telecom_post_no_loan_ac;
    }

    public BigDecimal getR24_tourism_hotels_no_loan_ac() {
        return r24_tourism_hotels_no_loan_ac;
    }

    public void setR24_tourism_hotels_no_loan_ac(BigDecimal r24_tourism_hotels_no_loan_ac) {
        this.r24_tourism_hotels_no_loan_ac = r24_tourism_hotels_no_loan_ac;
    }

    public BigDecimal getR25_transport_storage_no_loan_ac() {
        return r25_transport_storage_no_loan_ac;
    }

    public void setR25_transport_storage_no_loan_ac(BigDecimal r25_transport_storage_no_loan_ac) {
        this.r25_transport_storage_no_loan_ac = r25_transport_storage_no_loan_ac;
    }

    public BigDecimal getR26_trade_rest_bar_no_loan_ac() {
        return r26_trade_rest_bar_no_loan_ac;
    }

    public void setR26_trade_rest_bar_no_loan_ac(BigDecimal r26_trade_rest_bar_no_loan_ac) {
        this.r26_trade_rest_bar_no_loan_ac = r26_trade_rest_bar_no_loan_ac;
    }

    public BigDecimal getR27_business_services_no_loan_ac() {
        return r27_business_services_no_loan_ac;
    }

    public void setR27_business_services_no_loan_ac(BigDecimal r27_business_services_no_loan_ac) {
        this.r27_business_services_no_loan_ac = r27_business_services_no_loan_ac;
    }

    public BigDecimal getR28_community_services_no_loan_ac() {
        return r28_community_services_no_loan_ac;
    }

    public void setR28_community_services_no_loan_ac(BigDecimal r28_community_services_no_loan_ac) {
        this.r28_community_services_no_loan_ac = r28_community_services_no_loan_ac;
    }

    public BigDecimal getR29_households_no_loan_ac() {
        return r29_households_no_loan_ac;
    }

    public void setR29_households_no_loan_ac(BigDecimal r29_households_no_loan_ac) {
        this.r29_households_no_loan_ac = r29_households_no_loan_ac;
    }

    public BigDecimal getR30_hh_residential_owner_no_loan_ac() {
        return r30_hh_residential_owner_no_loan_ac;
    }

    public void setR30_hh_residential_owner_no_loan_ac(BigDecimal r30_hh_residential_owner_no_loan_ac) {
        this.r30_hh_residential_owner_no_loan_ac = r30_hh_residential_owner_no_loan_ac;
    }

    public BigDecimal getR31_hh_residential_rent_no_loan_ac() {
        return r31_hh_residential_rent_no_loan_ac;
    }

    public void setR31_hh_residential_rent_no_loan_ac(BigDecimal r31_hh_residential_rent_no_loan_ac) {
        this.r31_hh_residential_rent_no_loan_ac = r31_hh_residential_rent_no_loan_ac;
    }

    public BigDecimal getR32_hh_personal_loans_no_loan_ac() {
        return r32_hh_personal_loans_no_loan_ac;
    }

    public void setR32_hh_personal_loans_no_loan_ac(BigDecimal r32_hh_personal_loans_no_loan_ac) {
        this.r32_hh_personal_loans_no_loan_ac = r32_hh_personal_loans_no_loan_ac;
    }

    public BigDecimal getR33_hh_motor_vehicle_no_loan_ac() {
        return r33_hh_motor_vehicle_no_loan_ac;
    }

    public void setR33_hh_motor_vehicle_no_loan_ac(BigDecimal r33_hh_motor_vehicle_no_loan_ac) {
        this.r33_hh_motor_vehicle_no_loan_ac = r33_hh_motor_vehicle_no_loan_ac;
    }

    public BigDecimal getR34_hh_household_goods_no_loan_ac() {
        return r34_hh_household_goods_no_loan_ac;
    }

    public void setR34_hh_household_goods_no_loan_ac(BigDecimal r34_hh_household_goods_no_loan_ac) {
        this.r34_hh_household_goods_no_loan_ac = r34_hh_household_goods_no_loan_ac;
    }

    public BigDecimal getR35_hh_credit_card_loans_no_loan_ac() {
        return r35_hh_credit_card_loans_no_loan_ac;
    }

    public void setR35_hh_credit_card_loans_no_loan_ac(BigDecimal r35_hh_credit_card_loans_no_loan_ac) {
        this.r35_hh_credit_card_loans_no_loan_ac = r35_hh_credit_card_loans_no_loan_ac;
    }

    public BigDecimal getR36_hh_other_no_loan_ac() {
        return r36_hh_other_no_loan_ac;
    }

    public void setR36_hh_other_no_loan_ac(BigDecimal r36_hh_other_no_loan_ac) {
        this.r36_hh_other_no_loan_ac = r36_hh_other_no_loan_ac;
    }

    public BigDecimal getR37_non_profit_inst_hh_no_loan_ac() {
        return r37_non_profit_inst_hh_no_loan_ac;
    }

    public void setR37_non_profit_inst_hh_no_loan_ac(BigDecimal r37_non_profit_inst_hh_no_loan_ac) {
        this.r37_non_profit_inst_hh_no_loan_ac = r37_non_profit_inst_hh_no_loan_ac;
    }

    public BigDecimal getR38_non_residents_no_loan_ac() {
        return r38_non_residents_no_loan_ac;
    }

    public void setR38_non_residents_no_loan_ac(BigDecimal r38_non_residents_no_loan_ac) {
        this.r38_non_residents_no_loan_ac = r38_non_residents_no_loan_ac;
    }

    public BigDecimal getR39_non_res_corp_no_loan_ac() {
        return r39_non_res_corp_no_loan_ac;
    }

    public void setR39_non_res_corp_no_loan_ac(BigDecimal r39_non_res_corp_no_loan_ac) {
        this.r39_non_res_corp_no_loan_ac = r39_non_res_corp_no_loan_ac;
    }

    public BigDecimal getR40_non_res_hh_no_loan_ac() {
        return r40_non_res_hh_no_loan_ac;
    }

    public void setR40_non_res_hh_no_loan_ac(BigDecimal r40_non_res_hh_no_loan_ac) {
        this.r40_non_res_hh_no_loan_ac = r40_non_res_hh_no_loan_ac;
    }

    public BigDecimal getR41_fin_inst_units_no_loan_ac() {
        return r41_fin_inst_units_no_loan_ac;
    }

    public void setR41_fin_inst_units_no_loan_ac(BigDecimal r41_fin_inst_units_no_loan_ac) {
        this.r41_fin_inst_units_no_loan_ac = r41_fin_inst_units_no_loan_ac;
    }

    public BigDecimal getR42_central_bank_no_loan_ac() {
        return r42_central_bank_no_loan_ac;
    }

    public void setR42_central_bank_no_loan_ac(BigDecimal r42_central_bank_no_loan_ac) {
        this.r42_central_bank_no_loan_ac = r42_central_bank_no_loan_ac;
    }

    public BigDecimal getR43_comm_banks_no_loan_ac() {
        return r43_comm_banks_no_loan_ac;
    }

    public void setR43_comm_banks_no_loan_ac(BigDecimal r43_comm_banks_no_loan_ac) {
        this.r43_comm_banks_no_loan_ac = r43_comm_banks_no_loan_ac;
    }

    public BigDecimal getR44_other_dep_corp_no_loan_ac() {
        return r44_other_dep_corp_no_loan_ac;
    }

    public void setR44_other_dep_corp_no_loan_ac(BigDecimal r44_other_dep_corp_no_loan_ac) {
        this.r44_other_dep_corp_no_loan_ac = r44_other_dep_corp_no_loan_ac;
    }

    public BigDecimal getR45_bsb_no_loan_ac() {
        return r45_bsb_no_loan_ac;
    }

    public void setR45_bsb_no_loan_ac(BigDecimal r45_bsb_no_loan_ac) {
        this.r45_bsb_no_loan_ac = r45_bsb_no_loan_ac;
    }

    public BigDecimal getR46_bbs_no_loan_ac() {
        return r46_bbs_no_loan_ac;
    }

    public void setR46_bbs_no_loan_ac(BigDecimal r46_bbs_no_loan_ac) {
        this.r46_bbs_no_loan_ac = r46_bbs_no_loan_ac;
    }

    public BigDecimal getR47_money_mkt_unittrust_no_loan_ac() {
        return r47_money_mkt_unittrust_no_loan_ac;
    }

    public void setR47_money_mkt_unittrust_no_loan_ac(BigDecimal r47_money_mkt_unittrust_no_loan_ac) {
        this.r47_money_mkt_unittrust_no_loan_ac = r47_money_mkt_unittrust_no_loan_ac;
    }

    public BigDecimal getR48_other_dep_corp_specify_no_loan_ac() {
        return r48_other_dep_corp_specify_no_loan_ac;
    }

    public void setR48_other_dep_corp_specify_no_loan_ac(BigDecimal r48_other_dep_corp_specify_no_loan_ac) {
        this.r48_other_dep_corp_specify_no_loan_ac = r48_other_dep_corp_specify_no_loan_ac;
    }

    public BigDecimal getR49_other_fin_corp_no_loan_ac() {
        return r49_other_fin_corp_no_loan_ac;
    }

    public void setR49_other_fin_corp_no_loan_ac(BigDecimal r49_other_fin_corp_no_loan_ac) {
        this.r49_other_fin_corp_no_loan_ac = r49_other_fin_corp_no_loan_ac;
    }

    public BigDecimal getR50_insurance_co_no_loan_ac() {
        return r50_insurance_co_no_loan_ac;
    }

    public void setR50_insurance_co_no_loan_ac(BigDecimal r50_insurance_co_no_loan_ac) {
        this.r50_insurance_co_no_loan_ac = r50_insurance_co_no_loan_ac;
    }

    public BigDecimal getR51_pension_funds_no_loan_ac() {
        return r51_pension_funds_no_loan_ac;
    }

    public void setR51_pension_funds_no_loan_ac(BigDecimal r51_pension_funds_no_loan_ac) {
        this.r51_pension_funds_no_loan_ac = r51_pension_funds_no_loan_ac;
    }

    public BigDecimal getR52_saccos_no_loan_ac() {
        return r52_saccos_no_loan_ac;
    }

    public void setR52_saccos_no_loan_ac(BigDecimal r52_saccos_no_loan_ac) {
        this.r52_saccos_no_loan_ac = r52_saccos_no_loan_ac;
    }

    public BigDecimal getR53_other_fin_intermediaries_no_loan_ac() {
        return r53_other_fin_intermediaries_no_loan_ac;
    }

    public void setR53_other_fin_intermediaries_no_loan_ac(BigDecimal r53_other_fin_intermediaries_no_loan_ac) {
        this.r53_other_fin_intermediaries_no_loan_ac = r53_other_fin_intermediaries_no_loan_ac;
    }

    public BigDecimal getR54_fin_co_no_loan_ac() {
        return r54_fin_co_no_loan_ac;
    }

    public void setR54_fin_co_no_loan_ac(BigDecimal r54_fin_co_no_loan_ac) {
        this.r54_fin_co_no_loan_ac = r54_fin_co_no_loan_ac;
    }

    public BigDecimal getR55_med_aid_schemes_no_loan_ac() {
        return r55_med_aid_schemes_no_loan_ac;
    }

    public void setR55_med_aid_schemes_no_loan_ac(BigDecimal r55_med_aid_schemes_no_loan_ac) {
        this.r55_med_aid_schemes_no_loan_ac = r55_med_aid_schemes_no_loan_ac;
    }

    public BigDecimal getR56_pub_sec_fin_int_no_loan_ac() {
        return r56_pub_sec_fin_int_no_loan_ac;
    }

    public void setR56_pub_sec_fin_int_no_loan_ac(BigDecimal r56_pub_sec_fin_int_no_loan_ac) {
        this.r56_pub_sec_fin_int_no_loan_ac = r56_pub_sec_fin_int_no_loan_ac;
    }

    public BigDecimal getR57_financial_aux_no_loan_ac() {
        return r57_financial_aux_no_loan_ac;
    }

    public void setR57_financial_aux_no_loan_ac(BigDecimal r57_financial_aux_no_loan_ac) {
        this.r57_financial_aux_no_loan_ac = r57_financial_aux_no_loan_ac;
    }

    public BigDecimal getR58_asset_managers_no_loan_ac() {
        return r58_asset_managers_no_loan_ac;
    }

    public void setR58_asset_managers_no_loan_ac(BigDecimal r58_asset_managers_no_loan_ac) {
        this.r58_asset_managers_no_loan_ac = r58_asset_managers_no_loan_ac;
    }

    public BigDecimal getR59_insurance_brokers_no_loan_ac() {
        return r59_insurance_brokers_no_loan_ac;
    }

    public void setR59_insurance_brokers_no_loan_ac(BigDecimal r59_insurance_brokers_no_loan_ac) {
        this.r59_insurance_brokers_no_loan_ac = r59_insurance_brokers_no_loan_ac;
    }

    public BigDecimal getR60_fund_admin_no_loan_ac() {
        return r60_fund_admin_no_loan_ac;
    }

    public void setR60_fund_admin_no_loan_ac(BigDecimal r60_fund_admin_no_loan_ac) {
        this.r60_fund_admin_no_loan_ac = r60_fund_admin_no_loan_ac;
    }

    public BigDecimal getR61_bureau_change_no_loan_ac() {
        return r61_bureau_change_no_loan_ac;
    }

    public void setR61_bureau_change_no_loan_ac(BigDecimal r61_bureau_change_no_loan_ac) {
        this.r61_bureau_change_no_loan_ac = r61_bureau_change_no_loan_ac;
    }

    public BigDecimal getR62_fin_aux_other_no_loan_ac() {
        return r62_fin_aux_other_no_loan_ac;
    }

    public void setR62_fin_aux_other_no_loan_ac(BigDecimal r62_fin_aux_other_no_loan_ac) {
        this.r62_fin_aux_other_no_loan_ac = r62_fin_aux_other_no_loan_ac;
    }

    public BigDecimal getR63_non_residents_fin_no_loan_ac() {
        return r63_non_residents_fin_no_loan_ac;
    }

    public void setR63_non_residents_fin_no_loan_ac(BigDecimal r63_non_residents_fin_no_loan_ac) {
        this.r63_non_residents_fin_no_loan_ac = r63_non_residents_fin_no_loan_ac;
    }

    public BigDecimal getR64_total_no_loan_ac() {
        return r64_total_no_loan_ac;
    }

    public void setR64_total_no_loan_ac(BigDecimal r64_total_no_loan_ac) {
        this.r64_total_no_loan_ac = r64_total_no_loan_ac;
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

    public String getReport_code() {
        return report_code;
    }

    public void setReport_code(String report_code) {
        this.report_code = report_code;
    }

    public String getReport_frequency() {
        return report_frequency;
    }

    public void setReport_frequency(String report_frequency) {
        this.report_frequency = report_frequency;
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