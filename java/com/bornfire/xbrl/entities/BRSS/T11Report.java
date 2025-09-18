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
@Table(name = "T11CUST_KYC_CDD_REVIEW_RPT_TABLE")
public class T11Report {

	private String	D1A_IND_LOW;
	private String	D2A_IND_MED;
	private String	D3A_IND_HIG;
	private String	D4A_COR_LOW;
	private String	D5A_COR_MED;
	private String	D6A_COR_HIG;
	private String	D25A_RESPOND_LOW;
	private String	D26A_RESPOND_MED;
	private String	D27A_RESPOND_HIG;
	private String	D28A_CORRESPOND_LOW;
	private String	D29A_CORRESPOND_MED;
	private String	D30A_CORRESPOND_HIG;
	private String	D7A_NPR_ORG_LOW;
	private String	D8A_NPR_ORG_MED;
	private String	D9A_NPR_ORG_HIG;
	private String	D10A_TRUST_LOW;
	private String	D11A_TRUST_MED;
	private String	D12A_TRUST_HIG;
	private String	D13A_ALL_OTR_LOW;
	private String	D14A_ALL_OTR_MED;
	private String	D15A_ALL_OTR_HIG;
	private String	D31A_EXEMPT_LOW;
	private String	D32A_EXEMPT_MED;
	private String	D33A_EXEMPT_HIG;
	private String	D34A_GBC_1_LOW;
	private String	D35A_GBC_1_MED;
	private String	D36A_GBC_1_HIG;
	private String	D37A_GBC_2_LOW;
	private String	D38A_GBC_2_MED;
	private String	D39A_GBC_2_HIG;
	private String	D40A_PRIVATE_LOW;
	private String	D41A_PRIVATE_MED;
	private String	D42A_PRIVATE_HIG;
	private String	D43A_RELATED_PARTY_LOW;
	private String	D44A_RELATED_PARTY_MED;
	private String	D45A_RELATED_PARTY_HIG;
	private String	D16A_PEPS_DOM_LOW;
	private String	D17A_PEPS_DOM_MED;
	private String	D18A_PEPS_DOM_HIG;
	private String	D19A_PEPS_FRN_LOW;
	private String	D20A_PEPS_FRN_MED;
	private String	D21A_PEPS_FRN_HIG;
	private String	D22A_TCPS_LOW;
	private String	D23A_TCPS_MED;
	private String	D24A_TCPS_HIG;
	private BigDecimal	C1F_IND_LOW_B30;
	private BigDecimal	C2F_IND_MED_B30;
	private BigDecimal	C3F_IND_HIG_B30;
	private BigDecimal	C4F_COR_LOW_B30;
	private BigDecimal	C5F_COR_MED_B30;
	private BigDecimal	C6F_COR_HIG_B30;
	private String	C25F_RESPOND_LOW;
	private String	C26F_RESPOND_MED;
	private String	C27F_RESPOND_HIG;
	private String	C28F_CORRESPOND_LOW;
	private String	C29F_CORRESPOND_MED;
	private String	C30F_CORRESPOND_HIG;
	private BigDecimal	C7F_NPR_ORG_LOW_B30;
	private BigDecimal	C8F_NPR_ORG_MED_B30;
	private BigDecimal	C9F_NPR_ORG_HIG_B30;
	private BigDecimal	C10F_TRUST_LOW_B30;
	private BigDecimal	C11F_TRUST_MED_B30;
	private BigDecimal	C12F_TRUST_HIG_B30;
	private BigDecimal	C13F_ALL_OTR_LOW_B30;
	private BigDecimal	C14F_ALL_OTR_MED_B30;
	private BigDecimal	C15F_ALL_OTR_HIG_B30;
	private String	C31F_EXEMPT_LOW;
	private String	C32F_EXEMPT_MED;
	private String	C33F_EXEMPT_HIG;
	private String	C34F_GBC_1_LOW;
	private String	C35F_GBC_1_MED;
	private String	C36F_GBC_1_HIG;
	private String	C37F_GBC_2_LOW;
	private String	C38F_GBC_2_MED;
	private String	C39F_GBC_2_HIG;
	private String	C40F_PRIVATE_LOW;
	private String	C41F_PRIVATE_MED;
	private String	C42F_PRIVATE_HIG;
	private String	C43F_RELATED_PARTY_LOW;
	private String	C44F_RELATED_PARTY_MED;
	private String	C45F_RELATED_PARTY_HIG;
	private BigDecimal	C16F_PEPS_DOM_LOW_B30;
	private BigDecimal	C17F_PEPS_DOM_MED_B30;
	private BigDecimal	C18F_PEPS_DOM_HIG_B30;
	private BigDecimal	C19F_PEPS_FRN_LOW_B30;
	private BigDecimal	C20F_PEPS_FRN_MED_B30;
	private BigDecimal	C21F_PEPS_FRN_HIG_B30;
	private BigDecimal	C22F_TCPS_LOW_B30;
	private BigDecimal	C23F_TCPS_MED_B30;
	private BigDecimal	C24F_TCPS_HIG_B30;
	private BigDecimal	C1G_IND_LOW_30_60;
	private BigDecimal	C2G_IND_MED_30_60;
	private BigDecimal	C3G_IND_HIG_30_60;
	private BigDecimal	C4G_COR_LOW_30_60;
	private BigDecimal	C5G_COR_MED_30_60;
	private BigDecimal	C6G_COR_HIG_30_60;
	private String	C25G_RESPOND_LOW;
	private String	C26G_RESPOND_MED;
	private String	C27G_RESPOND_HIG;
	private String	C28G_CORRESPOND_LOW;
	private String	C29G_CORRESPOND_MED;
	private String	C30G_CORRESPOND_HIG;
	private BigDecimal	C7G_NPR_ORG_LOW_30_60;
	private BigDecimal	C8G_NPR_ORG_MED_30_60;
	private BigDecimal	C9G_NPR_ORG_HIG_30_60;
	private BigDecimal	C10G_TRUST_LOW_30_60;
	private BigDecimal	C11G_TRUST_MED_30_60;
	private BigDecimal	C12G_TRUST_HIG_30_60;
	private BigDecimal	C13G_ALL_OTR_LOW_30_60;
	private BigDecimal	C14G_ALL_OTR_MED_30_60;
	private BigDecimal	C15G_ALL_OTR_HIG_30_60;
	private String	C31G_EXEMPT_LOW;
	private String	C32G_EXEMPT_MED;
	private String	C33G_EXEMPT_HIG;
	private String	C34G_GBC_1_LOW;
	private String	C35G_GBC_1_MED;
	private String	C36G_GBC_1_HIG;
	private String	C37G_GBC_2_LOW;
	private String	C38G_GBC_2_MED;
	private String	C39G_GBC_2_HIG;
	private String	C40G_PRIVATE_LOW;
	private String	C41G_PRIVATE_MED;
	private String	C42G_PRIVATE_HIG;
	private String	C43G_RELATED_PARTY_LOW;
	private String	C44G_RELATED_PARTY_MED;
	private String	C45G_RELATED_PARTY_HIG;
	private BigDecimal	C16G_PEPS_DOM_LOW_30_60;
	private BigDecimal	C17G_PEPS_DOM_MED_30_60;
	private BigDecimal	C18G_PEPS_DOM_HIG_30_60;
	private BigDecimal	C19G_PEPS_FRN_LOW_30_60;
	private BigDecimal	C20G_PEPS_FRN_MED_30_60;
	private BigDecimal	C21G_PEPS_FRN_HIG_30_60;
	private BigDecimal	C22G_TCPS_LOW_30_60;
	private BigDecimal	C23G_TCPS_MED_30_60;
	private BigDecimal	C24G_TCPS_HIG_30_60;
	private BigDecimal	C1H_IND_LOW_60_90;
	private BigDecimal	C2H_IND_MED_60_90;
	private BigDecimal	C3H_IND_HIG_60_90;
	private BigDecimal	C4H_COR_LOW_60_90;
	private BigDecimal	C5H_COR_MED_60_90;
	private BigDecimal	C6H_COR_HIG_60_90;
	private String	C25H_RESPOND_LOW;
	private String	C26H_RESPOND_MED;
	private String	C27H_RESPOND_HIG;
	private String	C28H_CORRESPOND_LOW;
	private String	C29H_CORRESPOND_MED;
	private String	C30H_CORRESPOND_HIG;
	private BigDecimal	C7H_NPR_ORG_LOW_60_90;
	private BigDecimal	C8H_NPR_ORG_MED_60_90;
	private BigDecimal	C9H_NPR_ORG_HIG_60_90;
	private BigDecimal	C10H_TRUST_LOW_60_90;
	private BigDecimal	C11H_TRUST_MED_60_90;
	private BigDecimal	C12H_TRUST_HIG_60_90;
	private BigDecimal	C13H_ALL_OTR_LOW_60_90;
	private BigDecimal	C14H_ALL_OTR_MED_60_90;
	private BigDecimal	C15H_ALL_OTR_HIG_60_90;
	private String	C31H_EXEMPT_LOW;
	private String	C32H_EXEMPT_MED;
	private String	C33H_EXEMPT_HIG;
	private String	C34H_GBC_1_LOW;
	private String	C35H_GBC_1_MED;
	private String	C36H_GBC_1_HIG;
	private String	C37H_GBC_2_LOW;
	private String	C38H_GBC_2_MED;
	private String	C39H_GBC_2_HIG;
	private String	C40H_PRIVATE_LOW;
	private String	C41H_PRIVATE_MED;
	private String	C42H_PRIVATE_HIG;
	private String	C43H_RELATED_PARTY_LOW;
	private String	C44H_RELATED_PARTY_MED;
	private String	C45H_RELATED_PARTY_HIG;
	private BigDecimal	C16H_PEPS_DOM_LOW_60_90;
	private BigDecimal	C17H_PEPS_DOM_MED_60_90;
	private BigDecimal	C18H_PEPS_DOM_HIG_60_90;
	private BigDecimal	C19H_PEPS_FRN_LOW_60_90;
	private BigDecimal	C20H_PEPS_FRN_MED_60_90;
	private BigDecimal	C21H_PEPS_FRN_HIG_60_90;
	private BigDecimal	C22H_TCPS_LOW_60_90;
	private BigDecimal	C23H_TCPS_MED_60_90;
	private BigDecimal	C24H_TCPS_HIG_60_90;
	private BigDecimal	C1I_IND_LOW_A90;
	private BigDecimal	C2I_IND_MED_A90;
	private BigDecimal	C3I_IND_HIG_A90;
	private BigDecimal	C4I_COR_LOW_A90;
	private BigDecimal	C5I_COR_MED_A90;
	private BigDecimal	C6I_COR_HIG_A90;
	private String	C25I_RESPOND_LOW;
	private String	C26I_RESPOND_MED;
	private String	C27I_RESPOND_HIG;
	private String	C28I_CORRESPOND_LOW;
	private String	C29I_CORRESPOND_MED;
	private String	C30I_CORRESPOND_HIG;
	private BigDecimal	C7I_NPR_ORG_LOW_A90;
	private BigDecimal	C8I_NPR_ORG_MED_A90;
	private BigDecimal	C9I_NPR_ORG_HIG_A90;
	private BigDecimal	C10I_TRUST_LOW_A90;
	private BigDecimal	C11I_TRUST_MED_A90;
	private BigDecimal	C12I_TRUST_HIG_A90;
	private BigDecimal	C13I_ALL_OTR_LOW_A90;
	private BigDecimal	C14I_ALL_OTR_MED_A90;
	private BigDecimal	C15I_ALL_OTR_HIG_A90;
	private String	C31I_EXEMPT_LOW;
	private String	C32I_EXEMPT_MED;
	private String	C33I_EXEMPT_HIG;
	private String	C34I_GBC_1_LOW;
	private String	C35I_GBC_1_MED;
	private String	C36I_GBC_1_HIG;
	private String	C37I_GBC_2_LOW;
	private String	C38I_GBC_2_MED;
	private String	C39I_GBC_2_HIG;
	private String	C40I_PRIVATE_LOW;
	private String	C41I_PRIVATE_MED;
	private String	C42I_PRIVATE_HIG;
	private String	C43I_RELATED_PARTY_LOW;
	private String	C44I_RELATED_PARTY_MED;
	private String	C45I_RELATED_PARTY_HIG;
	private BigDecimal	C16I_PEPS_DOM_LOW_A90;
	private BigDecimal	C17I_PEPS_DOM_MED_A90;
	private BigDecimal	C18I_PEPS_DOM_HIG_A90;
	private BigDecimal	C19I_PEPS_FRN_LOW_A90;
	private BigDecimal	C20I_PEPS_FRN_MED_A90;
	private BigDecimal	C21I_PEPS_FRN_HIG_A90;
	private BigDecimal	C22I_TCPS_LOW_A90;
	private BigDecimal	C23I_TCPS_MED_A90;
	private BigDecimal	C24I_TCPS_HIG_A90;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private String	ENTITY_FLG;
	private String	MODIFY_FLG;
	private String	VERIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_TIME;
	public String getD1A_IND_LOW() {
		return D1A_IND_LOW;
	}
	public void setD1A_IND_LOW(String d1a_IND_LOW) {
		D1A_IND_LOW = d1a_IND_LOW;
	}
	public String getD2A_IND_MED() {
		return D2A_IND_MED;
	}
	public void setD2A_IND_MED(String d2a_IND_MED) {
		D2A_IND_MED = d2a_IND_MED;
	}
	public String getD3A_IND_HIG() {
		return D3A_IND_HIG;
	}
	public void setD3A_IND_HIG(String d3a_IND_HIG) {
		D3A_IND_HIG = d3a_IND_HIG;
	}
	public String getD4A_COR_LOW() {
		return D4A_COR_LOW;
	}
	public void setD4A_COR_LOW(String d4a_COR_LOW) {
		D4A_COR_LOW = d4a_COR_LOW;
	}
	public String getD5A_COR_MED() {
		return D5A_COR_MED;
	}
	public void setD5A_COR_MED(String d5a_COR_MED) {
		D5A_COR_MED = d5a_COR_MED;
	}
	public String getD6A_COR_HIG() {
		return D6A_COR_HIG;
	}
	public void setD6A_COR_HIG(String d6a_COR_HIG) {
		D6A_COR_HIG = d6a_COR_HIG;
	}
	public String getD25A_RESPOND_LOW() {
		return D25A_RESPOND_LOW;
	}
	public void setD25A_RESPOND_LOW(String d25a_RESPOND_LOW) {
		D25A_RESPOND_LOW = d25a_RESPOND_LOW;
	}
	public String getD26A_RESPOND_MED() {
		return D26A_RESPOND_MED;
	}
	public void setD26A_RESPOND_MED(String d26a_RESPOND_MED) {
		D26A_RESPOND_MED = d26a_RESPOND_MED;
	}
	public String getD27A_RESPOND_HIG() {
		return D27A_RESPOND_HIG;
	}
	public void setD27A_RESPOND_HIG(String d27a_RESPOND_HIG) {
		D27A_RESPOND_HIG = d27a_RESPOND_HIG;
	}
	public String getD28A_CORRESPOND_LOW() {
		return D28A_CORRESPOND_LOW;
	}
	public void setD28A_CORRESPOND_LOW(String d28a_CORRESPOND_LOW) {
		D28A_CORRESPOND_LOW = d28a_CORRESPOND_LOW;
	}
	public String getD29A_CORRESPOND_MED() {
		return D29A_CORRESPOND_MED;
	}
	public void setD29A_CORRESPOND_MED(String d29a_CORRESPOND_MED) {
		D29A_CORRESPOND_MED = d29a_CORRESPOND_MED;
	}
	public String getD30A_CORRESPOND_HIG() {
		return D30A_CORRESPOND_HIG;
	}
	public void setD30A_CORRESPOND_HIG(String d30a_CORRESPOND_HIG) {
		D30A_CORRESPOND_HIG = d30a_CORRESPOND_HIG;
	}
	public String getD7A_NPR_ORG_LOW() {
		return D7A_NPR_ORG_LOW;
	}
	public void setD7A_NPR_ORG_LOW(String d7a_NPR_ORG_LOW) {
		D7A_NPR_ORG_LOW = d7a_NPR_ORG_LOW;
	}
	public String getD8A_NPR_ORG_MED() {
		return D8A_NPR_ORG_MED;
	}
	public void setD8A_NPR_ORG_MED(String d8a_NPR_ORG_MED) {
		D8A_NPR_ORG_MED = d8a_NPR_ORG_MED;
	}
	public String getD9A_NPR_ORG_HIG() {
		return D9A_NPR_ORG_HIG;
	}
	public void setD9A_NPR_ORG_HIG(String d9a_NPR_ORG_HIG) {
		D9A_NPR_ORG_HIG = d9a_NPR_ORG_HIG;
	}
	public String getD10A_TRUST_LOW() {
		return D10A_TRUST_LOW;
	}
	public void setD10A_TRUST_LOW(String d10a_TRUST_LOW) {
		D10A_TRUST_LOW = d10a_TRUST_LOW;
	}
	public String getD11A_TRUST_MED() {
		return D11A_TRUST_MED;
	}
	public void setD11A_TRUST_MED(String d11a_TRUST_MED) {
		D11A_TRUST_MED = d11a_TRUST_MED;
	}
	public String getD12A_TRUST_HIG() {
		return D12A_TRUST_HIG;
	}
	public void setD12A_TRUST_HIG(String d12a_TRUST_HIG) {
		D12A_TRUST_HIG = d12a_TRUST_HIG;
	}
	public String getD13A_ALL_OTR_LOW() {
		return D13A_ALL_OTR_LOW;
	}
	public void setD13A_ALL_OTR_LOW(String d13a_ALL_OTR_LOW) {
		D13A_ALL_OTR_LOW = d13a_ALL_OTR_LOW;
	}
	public String getD14A_ALL_OTR_MED() {
		return D14A_ALL_OTR_MED;
	}
	public void setD14A_ALL_OTR_MED(String d14a_ALL_OTR_MED) {
		D14A_ALL_OTR_MED = d14a_ALL_OTR_MED;
	}
	public String getD15A_ALL_OTR_HIG() {
		return D15A_ALL_OTR_HIG;
	}
	public void setD15A_ALL_OTR_HIG(String d15a_ALL_OTR_HIG) {
		D15A_ALL_OTR_HIG = d15a_ALL_OTR_HIG;
	}
	public String getD31A_EXEMPT_LOW() {
		return D31A_EXEMPT_LOW;
	}
	public void setD31A_EXEMPT_LOW(String d31a_EXEMPT_LOW) {
		D31A_EXEMPT_LOW = d31a_EXEMPT_LOW;
	}
	public String getD32A_EXEMPT_MED() {
		return D32A_EXEMPT_MED;
	}
	public void setD32A_EXEMPT_MED(String d32a_EXEMPT_MED) {
		D32A_EXEMPT_MED = d32a_EXEMPT_MED;
	}
	public String getD33A_EXEMPT_HIG() {
		return D33A_EXEMPT_HIG;
	}
	public void setD33A_EXEMPT_HIG(String d33a_EXEMPT_HIG) {
		D33A_EXEMPT_HIG = d33a_EXEMPT_HIG;
	}
	public String getD34A_GBC_1_LOW() {
		return D34A_GBC_1_LOW;
	}
	public void setD34A_GBC_1_LOW(String d34a_GBC_1_LOW) {
		D34A_GBC_1_LOW = d34a_GBC_1_LOW;
	}
	public String getD35A_GBC_1_MED() {
		return D35A_GBC_1_MED;
	}
	public void setD35A_GBC_1_MED(String d35a_GBC_1_MED) {
		D35A_GBC_1_MED = d35a_GBC_1_MED;
	}
	public String getD36A_GBC_1_HIG() {
		return D36A_GBC_1_HIG;
	}
	public void setD36A_GBC_1_HIG(String d36a_GBC_1_HIG) {
		D36A_GBC_1_HIG = d36a_GBC_1_HIG;
	}
	public String getD37A_GBC_2_LOW() {
		return D37A_GBC_2_LOW;
	}
	public void setD37A_GBC_2_LOW(String d37a_GBC_2_LOW) {
		D37A_GBC_2_LOW = d37a_GBC_2_LOW;
	}
	public String getD38A_GBC_2_MED() {
		return D38A_GBC_2_MED;
	}
	public void setD38A_GBC_2_MED(String d38a_GBC_2_MED) {
		D38A_GBC_2_MED = d38a_GBC_2_MED;
	}
	public String getD39A_GBC_2_HIG() {
		return D39A_GBC_2_HIG;
	}
	public void setD39A_GBC_2_HIG(String d39a_GBC_2_HIG) {
		D39A_GBC_2_HIG = d39a_GBC_2_HIG;
	}
	public String getD40A_PRIVATE_LOW() {
		return D40A_PRIVATE_LOW;
	}
	public void setD40A_PRIVATE_LOW(String d40a_PRIVATE_LOW) {
		D40A_PRIVATE_LOW = d40a_PRIVATE_LOW;
	}
	public String getD41A_PRIVATE_MED() {
		return D41A_PRIVATE_MED;
	}
	public void setD41A_PRIVATE_MED(String d41a_PRIVATE_MED) {
		D41A_PRIVATE_MED = d41a_PRIVATE_MED;
	}
	public String getD42A_PRIVATE_HIG() {
		return D42A_PRIVATE_HIG;
	}
	public void setD42A_PRIVATE_HIG(String d42a_PRIVATE_HIG) {
		D42A_PRIVATE_HIG = d42a_PRIVATE_HIG;
	}
	public String getD43A_RELATED_PARTY_LOW() {
		return D43A_RELATED_PARTY_LOW;
	}
	public void setD43A_RELATED_PARTY_LOW(String d43a_RELATED_PARTY_LOW) {
		D43A_RELATED_PARTY_LOW = d43a_RELATED_PARTY_LOW;
	}
	public String getD44A_RELATED_PARTY_MED() {
		return D44A_RELATED_PARTY_MED;
	}
	public void setD44A_RELATED_PARTY_MED(String d44a_RELATED_PARTY_MED) {
		D44A_RELATED_PARTY_MED = d44a_RELATED_PARTY_MED;
	}
	public String getD45A_RELATED_PARTY_HIG() {
		return D45A_RELATED_PARTY_HIG;
	}
	public void setD45A_RELATED_PARTY_HIG(String d45a_RELATED_PARTY_HIG) {
		D45A_RELATED_PARTY_HIG = d45a_RELATED_PARTY_HIG;
	}
	public String getD16A_PEPS_DOM_LOW() {
		return D16A_PEPS_DOM_LOW;
	}
	public void setD16A_PEPS_DOM_LOW(String d16a_PEPS_DOM_LOW) {
		D16A_PEPS_DOM_LOW = d16a_PEPS_DOM_LOW;
	}
	public String getD17A_PEPS_DOM_MED() {
		return D17A_PEPS_DOM_MED;
	}
	public void setD17A_PEPS_DOM_MED(String d17a_PEPS_DOM_MED) {
		D17A_PEPS_DOM_MED = d17a_PEPS_DOM_MED;
	}
	public String getD18A_PEPS_DOM_HIG() {
		return D18A_PEPS_DOM_HIG;
	}
	public void setD18A_PEPS_DOM_HIG(String d18a_PEPS_DOM_HIG) {
		D18A_PEPS_DOM_HIG = d18a_PEPS_DOM_HIG;
	}
	public String getD19A_PEPS_FRN_LOW() {
		return D19A_PEPS_FRN_LOW;
	}
	public void setD19A_PEPS_FRN_LOW(String d19a_PEPS_FRN_LOW) {
		D19A_PEPS_FRN_LOW = d19a_PEPS_FRN_LOW;
	}
	public String getD20A_PEPS_FRN_MED() {
		return D20A_PEPS_FRN_MED;
	}
	public void setD20A_PEPS_FRN_MED(String d20a_PEPS_FRN_MED) {
		D20A_PEPS_FRN_MED = d20a_PEPS_FRN_MED;
	}
	public String getD21A_PEPS_FRN_HIG() {
		return D21A_PEPS_FRN_HIG;
	}
	public void setD21A_PEPS_FRN_HIG(String d21a_PEPS_FRN_HIG) {
		D21A_PEPS_FRN_HIG = d21a_PEPS_FRN_HIG;
	}
	public String getD22A_TCPS_LOW() {
		return D22A_TCPS_LOW;
	}
	public void setD22A_TCPS_LOW(String d22a_TCPS_LOW) {
		D22A_TCPS_LOW = d22a_TCPS_LOW;
	}
	public String getD23A_TCPS_MED() {
		return D23A_TCPS_MED;
	}
	public void setD23A_TCPS_MED(String d23a_TCPS_MED) {
		D23A_TCPS_MED = d23a_TCPS_MED;
	}
	public String getD24A_TCPS_HIG() {
		return D24A_TCPS_HIG;
	}
	public void setD24A_TCPS_HIG(String d24a_TCPS_HIG) {
		D24A_TCPS_HIG = d24a_TCPS_HIG;
	}
	public BigDecimal getC1F_IND_LOW_B30() {
		return C1F_IND_LOW_B30;
	}
	public void setC1F_IND_LOW_B30(BigDecimal c1f_IND_LOW_B30) {
		C1F_IND_LOW_B30 = c1f_IND_LOW_B30;
	}
	public BigDecimal getC2F_IND_MED_B30() {
		return C2F_IND_MED_B30;
	}
	public void setC2F_IND_MED_B30(BigDecimal c2f_IND_MED_B30) {
		C2F_IND_MED_B30 = c2f_IND_MED_B30;
	}
	public BigDecimal getC3F_IND_HIG_B30() {
		return C3F_IND_HIG_B30;
	}
	public void setC3F_IND_HIG_B30(BigDecimal c3f_IND_HIG_B30) {
		C3F_IND_HIG_B30 = c3f_IND_HIG_B30;
	}
	public BigDecimal getC4F_COR_LOW_B30() {
		return C4F_COR_LOW_B30;
	}
	public void setC4F_COR_LOW_B30(BigDecimal c4f_COR_LOW_B30) {
		C4F_COR_LOW_B30 = c4f_COR_LOW_B30;
	}
	public BigDecimal getC5F_COR_MED_B30() {
		return C5F_COR_MED_B30;
	}
	public void setC5F_COR_MED_B30(BigDecimal c5f_COR_MED_B30) {
		C5F_COR_MED_B30 = c5f_COR_MED_B30;
	}
	public BigDecimal getC6F_COR_HIG_B30() {
		return C6F_COR_HIG_B30;
	}
	public void setC6F_COR_HIG_B30(BigDecimal c6f_COR_HIG_B30) {
		C6F_COR_HIG_B30 = c6f_COR_HIG_B30;
	}
	public String getC25F_RESPOND_LOW() {
		return C25F_RESPOND_LOW;
	}
	public void setC25F_RESPOND_LOW(String c25f_RESPOND_LOW) {
		C25F_RESPOND_LOW = c25f_RESPOND_LOW;
	}
	public String getC26F_RESPOND_MED() {
		return C26F_RESPOND_MED;
	}
	public void setC26F_RESPOND_MED(String c26f_RESPOND_MED) {
		C26F_RESPOND_MED = c26f_RESPOND_MED;
	}
	public String getC27F_RESPOND_HIG() {
		return C27F_RESPOND_HIG;
	}
	public void setC27F_RESPOND_HIG(String c27f_RESPOND_HIG) {
		C27F_RESPOND_HIG = c27f_RESPOND_HIG;
	}
	public String getC28F_CORRESPOND_LOW() {
		return C28F_CORRESPOND_LOW;
	}
	public void setC28F_CORRESPOND_LOW(String c28f_CORRESPOND_LOW) {
		C28F_CORRESPOND_LOW = c28f_CORRESPOND_LOW;
	}
	public String getC29F_CORRESPOND_MED() {
		return C29F_CORRESPOND_MED;
	}
	public void setC29F_CORRESPOND_MED(String c29f_CORRESPOND_MED) {
		C29F_CORRESPOND_MED = c29f_CORRESPOND_MED;
	}
	public String getC30F_CORRESPOND_HIG() {
		return C30F_CORRESPOND_HIG;
	}
	public void setC30F_CORRESPOND_HIG(String c30f_CORRESPOND_HIG) {
		C30F_CORRESPOND_HIG = c30f_CORRESPOND_HIG;
	}
	public BigDecimal getC7F_NPR_ORG_LOW_B30() {
		return C7F_NPR_ORG_LOW_B30;
	}
	public void setC7F_NPR_ORG_LOW_B30(BigDecimal c7f_NPR_ORG_LOW_B30) {
		C7F_NPR_ORG_LOW_B30 = c7f_NPR_ORG_LOW_B30;
	}
	public BigDecimal getC8F_NPR_ORG_MED_B30() {
		return C8F_NPR_ORG_MED_B30;
	}
	public void setC8F_NPR_ORG_MED_B30(BigDecimal c8f_NPR_ORG_MED_B30) {
		C8F_NPR_ORG_MED_B30 = c8f_NPR_ORG_MED_B30;
	}
	public BigDecimal getC9F_NPR_ORG_HIG_B30() {
		return C9F_NPR_ORG_HIG_B30;
	}
	public void setC9F_NPR_ORG_HIG_B30(BigDecimal c9f_NPR_ORG_HIG_B30) {
		C9F_NPR_ORG_HIG_B30 = c9f_NPR_ORG_HIG_B30;
	}
	public BigDecimal getC10F_TRUST_LOW_B30() {
		return C10F_TRUST_LOW_B30;
	}
	public void setC10F_TRUST_LOW_B30(BigDecimal c10f_TRUST_LOW_B30) {
		C10F_TRUST_LOW_B30 = c10f_TRUST_LOW_B30;
	}
	public BigDecimal getC11F_TRUST_MED_B30() {
		return C11F_TRUST_MED_B30;
	}
	public void setC11F_TRUST_MED_B30(BigDecimal c11f_TRUST_MED_B30) {
		C11F_TRUST_MED_B30 = c11f_TRUST_MED_B30;
	}
	public BigDecimal getC12F_TRUST_HIG_B30() {
		return C12F_TRUST_HIG_B30;
	}
	public void setC12F_TRUST_HIG_B30(BigDecimal c12f_TRUST_HIG_B30) {
		C12F_TRUST_HIG_B30 = c12f_TRUST_HIG_B30;
	}
	public BigDecimal getC13F_ALL_OTR_LOW_B30() {
		return C13F_ALL_OTR_LOW_B30;
	}
	public void setC13F_ALL_OTR_LOW_B30(BigDecimal c13f_ALL_OTR_LOW_B30) {
		C13F_ALL_OTR_LOW_B30 = c13f_ALL_OTR_LOW_B30;
	}
	public BigDecimal getC14F_ALL_OTR_MED_B30() {
		return C14F_ALL_OTR_MED_B30;
	}
	public void setC14F_ALL_OTR_MED_B30(BigDecimal c14f_ALL_OTR_MED_B30) {
		C14F_ALL_OTR_MED_B30 = c14f_ALL_OTR_MED_B30;
	}
	public BigDecimal getC15F_ALL_OTR_HIG_B30() {
		return C15F_ALL_OTR_HIG_B30;
	}
	public void setC15F_ALL_OTR_HIG_B30(BigDecimal c15f_ALL_OTR_HIG_B30) {
		C15F_ALL_OTR_HIG_B30 = c15f_ALL_OTR_HIG_B30;
	}
	public String getC31F_EXEMPT_LOW() {
		return C31F_EXEMPT_LOW;
	}
	public void setC31F_EXEMPT_LOW(String c31f_EXEMPT_LOW) {
		C31F_EXEMPT_LOW = c31f_EXEMPT_LOW;
	}
	public String getC32F_EXEMPT_MED() {
		return C32F_EXEMPT_MED;
	}
	public void setC32F_EXEMPT_MED(String c32f_EXEMPT_MED) {
		C32F_EXEMPT_MED = c32f_EXEMPT_MED;
	}
	public String getC33F_EXEMPT_HIG() {
		return C33F_EXEMPT_HIG;
	}
	public void setC33F_EXEMPT_HIG(String c33f_EXEMPT_HIG) {
		C33F_EXEMPT_HIG = c33f_EXEMPT_HIG;
	}
	public String getC34F_GBC_1_LOW() {
		return C34F_GBC_1_LOW;
	}
	public void setC34F_GBC_1_LOW(String c34f_GBC_1_LOW) {
		C34F_GBC_1_LOW = c34f_GBC_1_LOW;
	}
	public String getC35F_GBC_1_MED() {
		return C35F_GBC_1_MED;
	}
	public void setC35F_GBC_1_MED(String c35f_GBC_1_MED) {
		C35F_GBC_1_MED = c35f_GBC_1_MED;
	}
	public String getC36F_GBC_1_HIG() {
		return C36F_GBC_1_HIG;
	}
	public void setC36F_GBC_1_HIG(String c36f_GBC_1_HIG) {
		C36F_GBC_1_HIG = c36f_GBC_1_HIG;
	}
	public String getC37F_GBC_2_LOW() {
		return C37F_GBC_2_LOW;
	}
	public void setC37F_GBC_2_LOW(String c37f_GBC_2_LOW) {
		C37F_GBC_2_LOW = c37f_GBC_2_LOW;
	}
	public String getC38F_GBC_2_MED() {
		return C38F_GBC_2_MED;
	}
	public void setC38F_GBC_2_MED(String c38f_GBC_2_MED) {
		C38F_GBC_2_MED = c38f_GBC_2_MED;
	}
	public String getC39F_GBC_2_HIG() {
		return C39F_GBC_2_HIG;
	}
	public void setC39F_GBC_2_HIG(String c39f_GBC_2_HIG) {
		C39F_GBC_2_HIG = c39f_GBC_2_HIG;
	}
	public String getC40F_PRIVATE_LOW() {
		return C40F_PRIVATE_LOW;
	}
	public void setC40F_PRIVATE_LOW(String c40f_PRIVATE_LOW) {
		C40F_PRIVATE_LOW = c40f_PRIVATE_LOW;
	}
	public String getC41F_PRIVATE_MED() {
		return C41F_PRIVATE_MED;
	}
	public void setC41F_PRIVATE_MED(String c41f_PRIVATE_MED) {
		C41F_PRIVATE_MED = c41f_PRIVATE_MED;
	}
	public String getC42F_PRIVATE_HIG() {
		return C42F_PRIVATE_HIG;
	}
	public void setC42F_PRIVATE_HIG(String c42f_PRIVATE_HIG) {
		C42F_PRIVATE_HIG = c42f_PRIVATE_HIG;
	}
	public String getC43F_RELATED_PARTY_LOW() {
		return C43F_RELATED_PARTY_LOW;
	}
	public void setC43F_RELATED_PARTY_LOW(String c43f_RELATED_PARTY_LOW) {
		C43F_RELATED_PARTY_LOW = c43f_RELATED_PARTY_LOW;
	}
	public String getC44F_RELATED_PARTY_MED() {
		return C44F_RELATED_PARTY_MED;
	}
	public void setC44F_RELATED_PARTY_MED(String c44f_RELATED_PARTY_MED) {
		C44F_RELATED_PARTY_MED = c44f_RELATED_PARTY_MED;
	}
	public String getC45F_RELATED_PARTY_HIG() {
		return C45F_RELATED_PARTY_HIG;
	}
	public void setC45F_RELATED_PARTY_HIG(String c45f_RELATED_PARTY_HIG) {
		C45F_RELATED_PARTY_HIG = c45f_RELATED_PARTY_HIG;
	}
	public BigDecimal getC16F_PEPS_DOM_LOW_B30() {
		return C16F_PEPS_DOM_LOW_B30;
	}
	public void setC16F_PEPS_DOM_LOW_B30(BigDecimal c16f_PEPS_DOM_LOW_B30) {
		C16F_PEPS_DOM_LOW_B30 = c16f_PEPS_DOM_LOW_B30;
	}
	public BigDecimal getC17F_PEPS_DOM_MED_B30() {
		return C17F_PEPS_DOM_MED_B30;
	}
	public void setC17F_PEPS_DOM_MED_B30(BigDecimal c17f_PEPS_DOM_MED_B30) {
		C17F_PEPS_DOM_MED_B30 = c17f_PEPS_DOM_MED_B30;
	}
	public BigDecimal getC18F_PEPS_DOM_HIG_B30() {
		return C18F_PEPS_DOM_HIG_B30;
	}
	public void setC18F_PEPS_DOM_HIG_B30(BigDecimal c18f_PEPS_DOM_HIG_B30) {
		C18F_PEPS_DOM_HIG_B30 = c18f_PEPS_DOM_HIG_B30;
	}
	public BigDecimal getC19F_PEPS_FRN_LOW_B30() {
		return C19F_PEPS_FRN_LOW_B30;
	}
	public void setC19F_PEPS_FRN_LOW_B30(BigDecimal c19f_PEPS_FRN_LOW_B30) {
		C19F_PEPS_FRN_LOW_B30 = c19f_PEPS_FRN_LOW_B30;
	}
	public BigDecimal getC20F_PEPS_FRN_MED_B30() {
		return C20F_PEPS_FRN_MED_B30;
	}
	public void setC20F_PEPS_FRN_MED_B30(BigDecimal c20f_PEPS_FRN_MED_B30) {
		C20F_PEPS_FRN_MED_B30 = c20f_PEPS_FRN_MED_B30;
	}
	public BigDecimal getC21F_PEPS_FRN_HIG_B30() {
		return C21F_PEPS_FRN_HIG_B30;
	}
	public void setC21F_PEPS_FRN_HIG_B30(BigDecimal c21f_PEPS_FRN_HIG_B30) {
		C21F_PEPS_FRN_HIG_B30 = c21f_PEPS_FRN_HIG_B30;
	}
	public BigDecimal getC22F_TCPS_LOW_B30() {
		return C22F_TCPS_LOW_B30;
	}
	public void setC22F_TCPS_LOW_B30(BigDecimal c22f_TCPS_LOW_B30) {
		C22F_TCPS_LOW_B30 = c22f_TCPS_LOW_B30;
	}
	public BigDecimal getC23F_TCPS_MED_B30() {
		return C23F_TCPS_MED_B30;
	}
	public void setC23F_TCPS_MED_B30(BigDecimal c23f_TCPS_MED_B30) {
		C23F_TCPS_MED_B30 = c23f_TCPS_MED_B30;
	}
	public BigDecimal getC24F_TCPS_HIG_B30() {
		return C24F_TCPS_HIG_B30;
	}
	public void setC24F_TCPS_HIG_B30(BigDecimal c24f_TCPS_HIG_B30) {
		C24F_TCPS_HIG_B30 = c24f_TCPS_HIG_B30;
	}
	public BigDecimal getC1G_IND_LOW_30_60() {
		return C1G_IND_LOW_30_60;
	}
	public void setC1G_IND_LOW_30_60(BigDecimal c1g_IND_LOW_30_60) {
		C1G_IND_LOW_30_60 = c1g_IND_LOW_30_60;
	}
	public BigDecimal getC2G_IND_MED_30_60() {
		return C2G_IND_MED_30_60;
	}
	public void setC2G_IND_MED_30_60(BigDecimal c2g_IND_MED_30_60) {
		C2G_IND_MED_30_60 = c2g_IND_MED_30_60;
	}
	public BigDecimal getC3G_IND_HIG_30_60() {
		return C3G_IND_HIG_30_60;
	}
	public void setC3G_IND_HIG_30_60(BigDecimal c3g_IND_HIG_30_60) {
		C3G_IND_HIG_30_60 = c3g_IND_HIG_30_60;
	}
	public BigDecimal getC4G_COR_LOW_30_60() {
		return C4G_COR_LOW_30_60;
	}
	public void setC4G_COR_LOW_30_60(BigDecimal c4g_COR_LOW_30_60) {
		C4G_COR_LOW_30_60 = c4g_COR_LOW_30_60;
	}
	public BigDecimal getC5G_COR_MED_30_60() {
		return C5G_COR_MED_30_60;
	}
	public void setC5G_COR_MED_30_60(BigDecimal c5g_COR_MED_30_60) {
		C5G_COR_MED_30_60 = c5g_COR_MED_30_60;
	}
	public BigDecimal getC6G_COR_HIG_30_60() {
		return C6G_COR_HIG_30_60;
	}
	public void setC6G_COR_HIG_30_60(BigDecimal c6g_COR_HIG_30_60) {
		C6G_COR_HIG_30_60 = c6g_COR_HIG_30_60;
	}
	public String getC25G_RESPOND_LOW() {
		return C25G_RESPOND_LOW;
	}
	public void setC25G_RESPOND_LOW(String c25g_RESPOND_LOW) {
		C25G_RESPOND_LOW = c25g_RESPOND_LOW;
	}
	public String getC26G_RESPOND_MED() {
		return C26G_RESPOND_MED;
	}
	public void setC26G_RESPOND_MED(String c26g_RESPOND_MED) {
		C26G_RESPOND_MED = c26g_RESPOND_MED;
	}
	public String getC27G_RESPOND_HIG() {
		return C27G_RESPOND_HIG;
	}
	public void setC27G_RESPOND_HIG(String c27g_RESPOND_HIG) {
		C27G_RESPOND_HIG = c27g_RESPOND_HIG;
	}
	public String getC28G_CORRESPOND_LOW() {
		return C28G_CORRESPOND_LOW;
	}
	public void setC28G_CORRESPOND_LOW(String c28g_CORRESPOND_LOW) {
		C28G_CORRESPOND_LOW = c28g_CORRESPOND_LOW;
	}
	public String getC29G_CORRESPOND_MED() {
		return C29G_CORRESPOND_MED;
	}
	public void setC29G_CORRESPOND_MED(String c29g_CORRESPOND_MED) {
		C29G_CORRESPOND_MED = c29g_CORRESPOND_MED;
	}
	public String getC30G_CORRESPOND_HIG() {
		return C30G_CORRESPOND_HIG;
	}
	public void setC30G_CORRESPOND_HIG(String c30g_CORRESPOND_HIG) {
		C30G_CORRESPOND_HIG = c30g_CORRESPOND_HIG;
	}
	public BigDecimal getC7G_NPR_ORG_LOW_30_60() {
		return C7G_NPR_ORG_LOW_30_60;
	}
	public void setC7G_NPR_ORG_LOW_30_60(BigDecimal c7g_NPR_ORG_LOW_30_60) {
		C7G_NPR_ORG_LOW_30_60 = c7g_NPR_ORG_LOW_30_60;
	}
	public BigDecimal getC8G_NPR_ORG_MED_30_60() {
		return C8G_NPR_ORG_MED_30_60;
	}
	public void setC8G_NPR_ORG_MED_30_60(BigDecimal c8g_NPR_ORG_MED_30_60) {
		C8G_NPR_ORG_MED_30_60 = c8g_NPR_ORG_MED_30_60;
	}
	public BigDecimal getC9G_NPR_ORG_HIG_30_60() {
		return C9G_NPR_ORG_HIG_30_60;
	}
	public void setC9G_NPR_ORG_HIG_30_60(BigDecimal c9g_NPR_ORG_HIG_30_60) {
		C9G_NPR_ORG_HIG_30_60 = c9g_NPR_ORG_HIG_30_60;
	}
	public BigDecimal getC10G_TRUST_LOW_30_60() {
		return C10G_TRUST_LOW_30_60;
	}
	public void setC10G_TRUST_LOW_30_60(BigDecimal c10g_TRUST_LOW_30_60) {
		C10G_TRUST_LOW_30_60 = c10g_TRUST_LOW_30_60;
	}
	public BigDecimal getC11G_TRUST_MED_30_60() {
		return C11G_TRUST_MED_30_60;
	}
	public void setC11G_TRUST_MED_30_60(BigDecimal c11g_TRUST_MED_30_60) {
		C11G_TRUST_MED_30_60 = c11g_TRUST_MED_30_60;
	}
	public BigDecimal getC12G_TRUST_HIG_30_60() {
		return C12G_TRUST_HIG_30_60;
	}
	public void setC12G_TRUST_HIG_30_60(BigDecimal c12g_TRUST_HIG_30_60) {
		C12G_TRUST_HIG_30_60 = c12g_TRUST_HIG_30_60;
	}
	public BigDecimal getC13G_ALL_OTR_LOW_30_60() {
		return C13G_ALL_OTR_LOW_30_60;
	}
	public void setC13G_ALL_OTR_LOW_30_60(BigDecimal c13g_ALL_OTR_LOW_30_60) {
		C13G_ALL_OTR_LOW_30_60 = c13g_ALL_OTR_LOW_30_60;
	}
	public BigDecimal getC14G_ALL_OTR_MED_30_60() {
		return C14G_ALL_OTR_MED_30_60;
	}
	public void setC14G_ALL_OTR_MED_30_60(BigDecimal c14g_ALL_OTR_MED_30_60) {
		C14G_ALL_OTR_MED_30_60 = c14g_ALL_OTR_MED_30_60;
	}
	public BigDecimal getC15G_ALL_OTR_HIG_30_60() {
		return C15G_ALL_OTR_HIG_30_60;
	}
	public void setC15G_ALL_OTR_HIG_30_60(BigDecimal c15g_ALL_OTR_HIG_30_60) {
		C15G_ALL_OTR_HIG_30_60 = c15g_ALL_OTR_HIG_30_60;
	}
	public String getC31G_EXEMPT_LOW() {
		return C31G_EXEMPT_LOW;
	}
	public void setC31G_EXEMPT_LOW(String c31g_EXEMPT_LOW) {
		C31G_EXEMPT_LOW = c31g_EXEMPT_LOW;
	}
	public String getC32G_EXEMPT_MED() {
		return C32G_EXEMPT_MED;
	}
	public void setC32G_EXEMPT_MED(String c32g_EXEMPT_MED) {
		C32G_EXEMPT_MED = c32g_EXEMPT_MED;
	}
	public String getC33G_EXEMPT_HIG() {
		return C33G_EXEMPT_HIG;
	}
	public void setC33G_EXEMPT_HIG(String c33g_EXEMPT_HIG) {
		C33G_EXEMPT_HIG = c33g_EXEMPT_HIG;
	}
	public String getC34G_GBC_1_LOW() {
		return C34G_GBC_1_LOW;
	}
	public void setC34G_GBC_1_LOW(String c34g_GBC_1_LOW) {
		C34G_GBC_1_LOW = c34g_GBC_1_LOW;
	}
	public String getC35G_GBC_1_MED() {
		return C35G_GBC_1_MED;
	}
	public void setC35G_GBC_1_MED(String c35g_GBC_1_MED) {
		C35G_GBC_1_MED = c35g_GBC_1_MED;
	}
	public String getC36G_GBC_1_HIG() {
		return C36G_GBC_1_HIG;
	}
	public void setC36G_GBC_1_HIG(String c36g_GBC_1_HIG) {
		C36G_GBC_1_HIG = c36g_GBC_1_HIG;
	}
	public String getC37G_GBC_2_LOW() {
		return C37G_GBC_2_LOW;
	}
	public void setC37G_GBC_2_LOW(String c37g_GBC_2_LOW) {
		C37G_GBC_2_LOW = c37g_GBC_2_LOW;
	}
	public String getC38G_GBC_2_MED() {
		return C38G_GBC_2_MED;
	}
	public void setC38G_GBC_2_MED(String c38g_GBC_2_MED) {
		C38G_GBC_2_MED = c38g_GBC_2_MED;
	}
	public String getC39G_GBC_2_HIG() {
		return C39G_GBC_2_HIG;
	}
	public void setC39G_GBC_2_HIG(String c39g_GBC_2_HIG) {
		C39G_GBC_2_HIG = c39g_GBC_2_HIG;
	}
	public String getC40G_PRIVATE_LOW() {
		return C40G_PRIVATE_LOW;
	}
	public void setC40G_PRIVATE_LOW(String c40g_PRIVATE_LOW) {
		C40G_PRIVATE_LOW = c40g_PRIVATE_LOW;
	}
	public String getC41G_PRIVATE_MED() {
		return C41G_PRIVATE_MED;
	}
	public void setC41G_PRIVATE_MED(String c41g_PRIVATE_MED) {
		C41G_PRIVATE_MED = c41g_PRIVATE_MED;
	}
	public String getC42G_PRIVATE_HIG() {
		return C42G_PRIVATE_HIG;
	}
	public void setC42G_PRIVATE_HIG(String c42g_PRIVATE_HIG) {
		C42G_PRIVATE_HIG = c42g_PRIVATE_HIG;
	}
	public String getC43G_RELATED_PARTY_LOW() {
		return C43G_RELATED_PARTY_LOW;
	}
	public void setC43G_RELATED_PARTY_LOW(String c43g_RELATED_PARTY_LOW) {
		C43G_RELATED_PARTY_LOW = c43g_RELATED_PARTY_LOW;
	}
	public String getC44G_RELATED_PARTY_MED() {
		return C44G_RELATED_PARTY_MED;
	}
	public void setC44G_RELATED_PARTY_MED(String c44g_RELATED_PARTY_MED) {
		C44G_RELATED_PARTY_MED = c44g_RELATED_PARTY_MED;
	}
	public String getC45G_RELATED_PARTY_HIG() {
		return C45G_RELATED_PARTY_HIG;
	}
	public void setC45G_RELATED_PARTY_HIG(String c45g_RELATED_PARTY_HIG) {
		C45G_RELATED_PARTY_HIG = c45g_RELATED_PARTY_HIG;
	}
	public BigDecimal getC16G_PEPS_DOM_LOW_30_60() {
		return C16G_PEPS_DOM_LOW_30_60;
	}
	public void setC16G_PEPS_DOM_LOW_30_60(BigDecimal c16g_PEPS_DOM_LOW_30_60) {
		C16G_PEPS_DOM_LOW_30_60 = c16g_PEPS_DOM_LOW_30_60;
	}
	public BigDecimal getC17G_PEPS_DOM_MED_30_60() {
		return C17G_PEPS_DOM_MED_30_60;
	}
	public void setC17G_PEPS_DOM_MED_30_60(BigDecimal c17g_PEPS_DOM_MED_30_60) {
		C17G_PEPS_DOM_MED_30_60 = c17g_PEPS_DOM_MED_30_60;
	}
	public BigDecimal getC18G_PEPS_DOM_HIG_30_60() {
		return C18G_PEPS_DOM_HIG_30_60;
	}
	public void setC18G_PEPS_DOM_HIG_30_60(BigDecimal c18g_PEPS_DOM_HIG_30_60) {
		C18G_PEPS_DOM_HIG_30_60 = c18g_PEPS_DOM_HIG_30_60;
	}
	public BigDecimal getC19G_PEPS_FRN_LOW_30_60() {
		return C19G_PEPS_FRN_LOW_30_60;
	}
	public void setC19G_PEPS_FRN_LOW_30_60(BigDecimal c19g_PEPS_FRN_LOW_30_60) {
		C19G_PEPS_FRN_LOW_30_60 = c19g_PEPS_FRN_LOW_30_60;
	}
	public BigDecimal getC20G_PEPS_FRN_MED_30_60() {
		return C20G_PEPS_FRN_MED_30_60;
	}
	public void setC20G_PEPS_FRN_MED_30_60(BigDecimal c20g_PEPS_FRN_MED_30_60) {
		C20G_PEPS_FRN_MED_30_60 = c20g_PEPS_FRN_MED_30_60;
	}
	public BigDecimal getC21G_PEPS_FRN_HIG_30_60() {
		return C21G_PEPS_FRN_HIG_30_60;
	}
	public void setC21G_PEPS_FRN_HIG_30_60(BigDecimal c21g_PEPS_FRN_HIG_30_60) {
		C21G_PEPS_FRN_HIG_30_60 = c21g_PEPS_FRN_HIG_30_60;
	}
	public BigDecimal getC22G_TCPS_LOW_30_60() {
		return C22G_TCPS_LOW_30_60;
	}
	public void setC22G_TCPS_LOW_30_60(BigDecimal c22g_TCPS_LOW_30_60) {
		C22G_TCPS_LOW_30_60 = c22g_TCPS_LOW_30_60;
	}
	public BigDecimal getC23G_TCPS_MED_30_60() {
		return C23G_TCPS_MED_30_60;
	}
	public void setC23G_TCPS_MED_30_60(BigDecimal c23g_TCPS_MED_30_60) {
		C23G_TCPS_MED_30_60 = c23g_TCPS_MED_30_60;
	}
	public BigDecimal getC24G_TCPS_HIG_30_60() {
		return C24G_TCPS_HIG_30_60;
	}
	public void setC24G_TCPS_HIG_30_60(BigDecimal c24g_TCPS_HIG_30_60) {
		C24G_TCPS_HIG_30_60 = c24g_TCPS_HIG_30_60;
	}
	public BigDecimal getC1H_IND_LOW_60_90() {
		return C1H_IND_LOW_60_90;
	}
	public void setC1H_IND_LOW_60_90(BigDecimal c1h_IND_LOW_60_90) {
		C1H_IND_LOW_60_90 = c1h_IND_LOW_60_90;
	}
	public BigDecimal getC2H_IND_MED_60_90() {
		return C2H_IND_MED_60_90;
	}
	public void setC2H_IND_MED_60_90(BigDecimal c2h_IND_MED_60_90) {
		C2H_IND_MED_60_90 = c2h_IND_MED_60_90;
	}
	public BigDecimal getC3H_IND_HIG_60_90() {
		return C3H_IND_HIG_60_90;
	}
	public void setC3H_IND_HIG_60_90(BigDecimal c3h_IND_HIG_60_90) {
		C3H_IND_HIG_60_90 = c3h_IND_HIG_60_90;
	}
	public BigDecimal getC4H_COR_LOW_60_90() {
		return C4H_COR_LOW_60_90;
	}
	public void setC4H_COR_LOW_60_90(BigDecimal c4h_COR_LOW_60_90) {
		C4H_COR_LOW_60_90 = c4h_COR_LOW_60_90;
	}
	public BigDecimal getC5H_COR_MED_60_90() {
		return C5H_COR_MED_60_90;
	}
	public void setC5H_COR_MED_60_90(BigDecimal c5h_COR_MED_60_90) {
		C5H_COR_MED_60_90 = c5h_COR_MED_60_90;
	}
	public BigDecimal getC6H_COR_HIG_60_90() {
		return C6H_COR_HIG_60_90;
	}
	public void setC6H_COR_HIG_60_90(BigDecimal c6h_COR_HIG_60_90) {
		C6H_COR_HIG_60_90 = c6h_COR_HIG_60_90;
	}
	public String getC25H_RESPOND_LOW() {
		return C25H_RESPOND_LOW;
	}
	public void setC25H_RESPOND_LOW(String c25h_RESPOND_LOW) {
		C25H_RESPOND_LOW = c25h_RESPOND_LOW;
	}
	public String getC26H_RESPOND_MED() {
		return C26H_RESPOND_MED;
	}
	public void setC26H_RESPOND_MED(String c26h_RESPOND_MED) {
		C26H_RESPOND_MED = c26h_RESPOND_MED;
	}
	public String getC27H_RESPOND_HIG() {
		return C27H_RESPOND_HIG;
	}
	public void setC27H_RESPOND_HIG(String c27h_RESPOND_HIG) {
		C27H_RESPOND_HIG = c27h_RESPOND_HIG;
	}
	public String getC28H_CORRESPOND_LOW() {
		return C28H_CORRESPOND_LOW;
	}
	public void setC28H_CORRESPOND_LOW(String c28h_CORRESPOND_LOW) {
		C28H_CORRESPOND_LOW = c28h_CORRESPOND_LOW;
	}
	public String getC29H_CORRESPOND_MED() {
		return C29H_CORRESPOND_MED;
	}
	public void setC29H_CORRESPOND_MED(String c29h_CORRESPOND_MED) {
		C29H_CORRESPOND_MED = c29h_CORRESPOND_MED;
	}
	public String getC30H_CORRESPOND_HIG() {
		return C30H_CORRESPOND_HIG;
	}
	public void setC30H_CORRESPOND_HIG(String c30h_CORRESPOND_HIG) {
		C30H_CORRESPOND_HIG = c30h_CORRESPOND_HIG;
	}
	public BigDecimal getC7H_NPR_ORG_LOW_60_90() {
		return C7H_NPR_ORG_LOW_60_90;
	}
	public void setC7H_NPR_ORG_LOW_60_90(BigDecimal c7h_NPR_ORG_LOW_60_90) {
		C7H_NPR_ORG_LOW_60_90 = c7h_NPR_ORG_LOW_60_90;
	}
	public BigDecimal getC8H_NPR_ORG_MED_60_90() {
		return C8H_NPR_ORG_MED_60_90;
	}
	public void setC8H_NPR_ORG_MED_60_90(BigDecimal c8h_NPR_ORG_MED_60_90) {
		C8H_NPR_ORG_MED_60_90 = c8h_NPR_ORG_MED_60_90;
	}
	public BigDecimal getC9H_NPR_ORG_HIG_60_90() {
		return C9H_NPR_ORG_HIG_60_90;
	}
	public void setC9H_NPR_ORG_HIG_60_90(BigDecimal c9h_NPR_ORG_HIG_60_90) {
		C9H_NPR_ORG_HIG_60_90 = c9h_NPR_ORG_HIG_60_90;
	}
	public BigDecimal getC10H_TRUST_LOW_60_90() {
		return C10H_TRUST_LOW_60_90;
	}
	public void setC10H_TRUST_LOW_60_90(BigDecimal c10h_TRUST_LOW_60_90) {
		C10H_TRUST_LOW_60_90 = c10h_TRUST_LOW_60_90;
	}
	public BigDecimal getC11H_TRUST_MED_60_90() {
		return C11H_TRUST_MED_60_90;
	}
	public void setC11H_TRUST_MED_60_90(BigDecimal c11h_TRUST_MED_60_90) {
		C11H_TRUST_MED_60_90 = c11h_TRUST_MED_60_90;
	}
	public BigDecimal getC12H_TRUST_HIG_60_90() {
		return C12H_TRUST_HIG_60_90;
	}
	public void setC12H_TRUST_HIG_60_90(BigDecimal c12h_TRUST_HIG_60_90) {
		C12H_TRUST_HIG_60_90 = c12h_TRUST_HIG_60_90;
	}
	public BigDecimal getC13H_ALL_OTR_LOW_60_90() {
		return C13H_ALL_OTR_LOW_60_90;
	}
	public void setC13H_ALL_OTR_LOW_60_90(BigDecimal c13h_ALL_OTR_LOW_60_90) {
		C13H_ALL_OTR_LOW_60_90 = c13h_ALL_OTR_LOW_60_90;
	}
	public BigDecimal getC14H_ALL_OTR_MED_60_90() {
		return C14H_ALL_OTR_MED_60_90;
	}
	public void setC14H_ALL_OTR_MED_60_90(BigDecimal c14h_ALL_OTR_MED_60_90) {
		C14H_ALL_OTR_MED_60_90 = c14h_ALL_OTR_MED_60_90;
	}
	public BigDecimal getC15H_ALL_OTR_HIG_60_90() {
		return C15H_ALL_OTR_HIG_60_90;
	}
	public void setC15H_ALL_OTR_HIG_60_90(BigDecimal c15h_ALL_OTR_HIG_60_90) {
		C15H_ALL_OTR_HIG_60_90 = c15h_ALL_OTR_HIG_60_90;
	}
	public String getC31H_EXEMPT_LOW() {
		return C31H_EXEMPT_LOW;
	}
	public void setC31H_EXEMPT_LOW(String c31h_EXEMPT_LOW) {
		C31H_EXEMPT_LOW = c31h_EXEMPT_LOW;
	}
	public String getC32H_EXEMPT_MED() {
		return C32H_EXEMPT_MED;
	}
	public void setC32H_EXEMPT_MED(String c32h_EXEMPT_MED) {
		C32H_EXEMPT_MED = c32h_EXEMPT_MED;
	}
	public String getC33H_EXEMPT_HIG() {
		return C33H_EXEMPT_HIG;
	}
	public void setC33H_EXEMPT_HIG(String c33h_EXEMPT_HIG) {
		C33H_EXEMPT_HIG = c33h_EXEMPT_HIG;
	}
	public String getC34H_GBC_1_LOW() {
		return C34H_GBC_1_LOW;
	}
	public void setC34H_GBC_1_LOW(String c34h_GBC_1_LOW) {
		C34H_GBC_1_LOW = c34h_GBC_1_LOW;
	}
	public String getC35H_GBC_1_MED() {
		return C35H_GBC_1_MED;
	}
	public void setC35H_GBC_1_MED(String c35h_GBC_1_MED) {
		C35H_GBC_1_MED = c35h_GBC_1_MED;
	}
	public String getC36H_GBC_1_HIG() {
		return C36H_GBC_1_HIG;
	}
	public void setC36H_GBC_1_HIG(String c36h_GBC_1_HIG) {
		C36H_GBC_1_HIG = c36h_GBC_1_HIG;
	}
	public String getC37H_GBC_2_LOW() {
		return C37H_GBC_2_LOW;
	}
	public void setC37H_GBC_2_LOW(String c37h_GBC_2_LOW) {
		C37H_GBC_2_LOW = c37h_GBC_2_LOW;
	}
	public String getC38H_GBC_2_MED() {
		return C38H_GBC_2_MED;
	}
	public void setC38H_GBC_2_MED(String c38h_GBC_2_MED) {
		C38H_GBC_2_MED = c38h_GBC_2_MED;
	}
	public String getC39H_GBC_2_HIG() {
		return C39H_GBC_2_HIG;
	}
	public void setC39H_GBC_2_HIG(String c39h_GBC_2_HIG) {
		C39H_GBC_2_HIG = c39h_GBC_2_HIG;
	}
	public String getC40H_PRIVATE_LOW() {
		return C40H_PRIVATE_LOW;
	}
	public void setC40H_PRIVATE_LOW(String c40h_PRIVATE_LOW) {
		C40H_PRIVATE_LOW = c40h_PRIVATE_LOW;
	}
	public String getC41H_PRIVATE_MED() {
		return C41H_PRIVATE_MED;
	}
	public void setC41H_PRIVATE_MED(String c41h_PRIVATE_MED) {
		C41H_PRIVATE_MED = c41h_PRIVATE_MED;
	}
	public String getC42H_PRIVATE_HIG() {
		return C42H_PRIVATE_HIG;
	}
	public void setC42H_PRIVATE_HIG(String c42h_PRIVATE_HIG) {
		C42H_PRIVATE_HIG = c42h_PRIVATE_HIG;
	}
	public String getC43H_RELATED_PARTY_LOW() {
		return C43H_RELATED_PARTY_LOW;
	}
	public void setC43H_RELATED_PARTY_LOW(String c43h_RELATED_PARTY_LOW) {
		C43H_RELATED_PARTY_LOW = c43h_RELATED_PARTY_LOW;
	}
	public String getC44H_RELATED_PARTY_MED() {
		return C44H_RELATED_PARTY_MED;
	}
	public void setC44H_RELATED_PARTY_MED(String c44h_RELATED_PARTY_MED) {
		C44H_RELATED_PARTY_MED = c44h_RELATED_PARTY_MED;
	}
	public String getC45H_RELATED_PARTY_HIG() {
		return C45H_RELATED_PARTY_HIG;
	}
	public void setC45H_RELATED_PARTY_HIG(String c45h_RELATED_PARTY_HIG) {
		C45H_RELATED_PARTY_HIG = c45h_RELATED_PARTY_HIG;
	}
	public BigDecimal getC16H_PEPS_DOM_LOW_60_90() {
		return C16H_PEPS_DOM_LOW_60_90;
	}
	public void setC16H_PEPS_DOM_LOW_60_90(BigDecimal c16h_PEPS_DOM_LOW_60_90) {
		C16H_PEPS_DOM_LOW_60_90 = c16h_PEPS_DOM_LOW_60_90;
	}
	public BigDecimal getC17H_PEPS_DOM_MED_60_90() {
		return C17H_PEPS_DOM_MED_60_90;
	}
	public void setC17H_PEPS_DOM_MED_60_90(BigDecimal c17h_PEPS_DOM_MED_60_90) {
		C17H_PEPS_DOM_MED_60_90 = c17h_PEPS_DOM_MED_60_90;
	}
	public BigDecimal getC18H_PEPS_DOM_HIG_60_90() {
		return C18H_PEPS_DOM_HIG_60_90;
	}
	public void setC18H_PEPS_DOM_HIG_60_90(BigDecimal c18h_PEPS_DOM_HIG_60_90) {
		C18H_PEPS_DOM_HIG_60_90 = c18h_PEPS_DOM_HIG_60_90;
	}
	public BigDecimal getC19H_PEPS_FRN_LOW_60_90() {
		return C19H_PEPS_FRN_LOW_60_90;
	}
	public void setC19H_PEPS_FRN_LOW_60_90(BigDecimal c19h_PEPS_FRN_LOW_60_90) {
		C19H_PEPS_FRN_LOW_60_90 = c19h_PEPS_FRN_LOW_60_90;
	}
	public BigDecimal getC20H_PEPS_FRN_MED_60_90() {
		return C20H_PEPS_FRN_MED_60_90;
	}
	public void setC20H_PEPS_FRN_MED_60_90(BigDecimal c20h_PEPS_FRN_MED_60_90) {
		C20H_PEPS_FRN_MED_60_90 = c20h_PEPS_FRN_MED_60_90;
	}
	public BigDecimal getC21H_PEPS_FRN_HIG_60_90() {
		return C21H_PEPS_FRN_HIG_60_90;
	}
	public void setC21H_PEPS_FRN_HIG_60_90(BigDecimal c21h_PEPS_FRN_HIG_60_90) {
		C21H_PEPS_FRN_HIG_60_90 = c21h_PEPS_FRN_HIG_60_90;
	}
	public BigDecimal getC22H_TCPS_LOW_60_90() {
		return C22H_TCPS_LOW_60_90;
	}
	public void setC22H_TCPS_LOW_60_90(BigDecimal c22h_TCPS_LOW_60_90) {
		C22H_TCPS_LOW_60_90 = c22h_TCPS_LOW_60_90;
	}
	public BigDecimal getC23H_TCPS_MED_60_90() {
		return C23H_TCPS_MED_60_90;
	}
	public void setC23H_TCPS_MED_60_90(BigDecimal c23h_TCPS_MED_60_90) {
		C23H_TCPS_MED_60_90 = c23h_TCPS_MED_60_90;
	}
	public BigDecimal getC24H_TCPS_HIG_60_90() {
		return C24H_TCPS_HIG_60_90;
	}
	public void setC24H_TCPS_HIG_60_90(BigDecimal c24h_TCPS_HIG_60_90) {
		C24H_TCPS_HIG_60_90 = c24h_TCPS_HIG_60_90;
	}
	public BigDecimal getC1I_IND_LOW_A90() {
		return C1I_IND_LOW_A90;
	}
	public void setC1I_IND_LOW_A90(BigDecimal c1i_IND_LOW_A90) {
		C1I_IND_LOW_A90 = c1i_IND_LOW_A90;
	}
	public BigDecimal getC2I_IND_MED_A90() {
		return C2I_IND_MED_A90;
	}
	public void setC2I_IND_MED_A90(BigDecimal c2i_IND_MED_A90) {
		C2I_IND_MED_A90 = c2i_IND_MED_A90;
	}
	public BigDecimal getC3I_IND_HIG_A90() {
		return C3I_IND_HIG_A90;
	}
	public void setC3I_IND_HIG_A90(BigDecimal c3i_IND_HIG_A90) {
		C3I_IND_HIG_A90 = c3i_IND_HIG_A90;
	}
	public BigDecimal getC4I_COR_LOW_A90() {
		return C4I_COR_LOW_A90;
	}
	public void setC4I_COR_LOW_A90(BigDecimal c4i_COR_LOW_A90) {
		C4I_COR_LOW_A90 = c4i_COR_LOW_A90;
	}
	public BigDecimal getC5I_COR_MED_A90() {
		return C5I_COR_MED_A90;
	}
	public void setC5I_COR_MED_A90(BigDecimal c5i_COR_MED_A90) {
		C5I_COR_MED_A90 = c5i_COR_MED_A90;
	}
	public BigDecimal getC6I_COR_HIG_A90() {
		return C6I_COR_HIG_A90;
	}
	public void setC6I_COR_HIG_A90(BigDecimal c6i_COR_HIG_A90) {
		C6I_COR_HIG_A90 = c6i_COR_HIG_A90;
	}
	public String getC25I_RESPOND_LOW() {
		return C25I_RESPOND_LOW;
	}
	public void setC25I_RESPOND_LOW(String c25i_RESPOND_LOW) {
		C25I_RESPOND_LOW = c25i_RESPOND_LOW;
	}
	public String getC26I_RESPOND_MED() {
		return C26I_RESPOND_MED;
	}
	public void setC26I_RESPOND_MED(String c26i_RESPOND_MED) {
		C26I_RESPOND_MED = c26i_RESPOND_MED;
	}
	public String getC27I_RESPOND_HIG() {
		return C27I_RESPOND_HIG;
	}
	public void setC27I_RESPOND_HIG(String c27i_RESPOND_HIG) {
		C27I_RESPOND_HIG = c27i_RESPOND_HIG;
	}
	public String getC28I_CORRESPOND_LOW() {
		return C28I_CORRESPOND_LOW;
	}
	public void setC28I_CORRESPOND_LOW(String c28i_CORRESPOND_LOW) {
		C28I_CORRESPOND_LOW = c28i_CORRESPOND_LOW;
	}
	public String getC29I_CORRESPOND_MED() {
		return C29I_CORRESPOND_MED;
	}
	public void setC29I_CORRESPOND_MED(String c29i_CORRESPOND_MED) {
		C29I_CORRESPOND_MED = c29i_CORRESPOND_MED;
	}
	public String getC30I_CORRESPOND_HIG() {
		return C30I_CORRESPOND_HIG;
	}
	public void setC30I_CORRESPOND_HIG(String c30i_CORRESPOND_HIG) {
		C30I_CORRESPOND_HIG = c30i_CORRESPOND_HIG;
	}
	public BigDecimal getC7I_NPR_ORG_LOW_A90() {
		return C7I_NPR_ORG_LOW_A90;
	}
	public void setC7I_NPR_ORG_LOW_A90(BigDecimal c7i_NPR_ORG_LOW_A90) {
		C7I_NPR_ORG_LOW_A90 = c7i_NPR_ORG_LOW_A90;
	}
	public BigDecimal getC8I_NPR_ORG_MED_A90() {
		return C8I_NPR_ORG_MED_A90;
	}
	public void setC8I_NPR_ORG_MED_A90(BigDecimal c8i_NPR_ORG_MED_A90) {
		C8I_NPR_ORG_MED_A90 = c8i_NPR_ORG_MED_A90;
	}
	public BigDecimal getC9I_NPR_ORG_HIG_A90() {
		return C9I_NPR_ORG_HIG_A90;
	}
	public void setC9I_NPR_ORG_HIG_A90(BigDecimal c9i_NPR_ORG_HIG_A90) {
		C9I_NPR_ORG_HIG_A90 = c9i_NPR_ORG_HIG_A90;
	}
	public BigDecimal getC10I_TRUST_LOW_A90() {
		return C10I_TRUST_LOW_A90;
	}
	public void setC10I_TRUST_LOW_A90(BigDecimal c10i_TRUST_LOW_A90) {
		C10I_TRUST_LOW_A90 = c10i_TRUST_LOW_A90;
	}
	public BigDecimal getC11I_TRUST_MED_A90() {
		return C11I_TRUST_MED_A90;
	}
	public void setC11I_TRUST_MED_A90(BigDecimal c11i_TRUST_MED_A90) {
		C11I_TRUST_MED_A90 = c11i_TRUST_MED_A90;
	}
	public BigDecimal getC12I_TRUST_HIG_A90() {
		return C12I_TRUST_HIG_A90;
	}
	public void setC12I_TRUST_HIG_A90(BigDecimal c12i_TRUST_HIG_A90) {
		C12I_TRUST_HIG_A90 = c12i_TRUST_HIG_A90;
	}
	public BigDecimal getC13I_ALL_OTR_LOW_A90() {
		return C13I_ALL_OTR_LOW_A90;
	}
	public void setC13I_ALL_OTR_LOW_A90(BigDecimal c13i_ALL_OTR_LOW_A90) {
		C13I_ALL_OTR_LOW_A90 = c13i_ALL_OTR_LOW_A90;
	}
	public BigDecimal getC14I_ALL_OTR_MED_A90() {
		return C14I_ALL_OTR_MED_A90;
	}
	public void setC14I_ALL_OTR_MED_A90(BigDecimal c14i_ALL_OTR_MED_A90) {
		C14I_ALL_OTR_MED_A90 = c14i_ALL_OTR_MED_A90;
	}
	public BigDecimal getC15I_ALL_OTR_HIG_A90() {
		return C15I_ALL_OTR_HIG_A90;
	}
	public void setC15I_ALL_OTR_HIG_A90(BigDecimal c15i_ALL_OTR_HIG_A90) {
		C15I_ALL_OTR_HIG_A90 = c15i_ALL_OTR_HIG_A90;
	}
	public String getC31I_EXEMPT_LOW() {
		return C31I_EXEMPT_LOW;
	}
	public void setC31I_EXEMPT_LOW(String c31i_EXEMPT_LOW) {
		C31I_EXEMPT_LOW = c31i_EXEMPT_LOW;
	}
	public String getC32I_EXEMPT_MED() {
		return C32I_EXEMPT_MED;
	}
	public void setC32I_EXEMPT_MED(String c32i_EXEMPT_MED) {
		C32I_EXEMPT_MED = c32i_EXEMPT_MED;
	}
	public String getC33I_EXEMPT_HIG() {
		return C33I_EXEMPT_HIG;
	}
	public void setC33I_EXEMPT_HIG(String c33i_EXEMPT_HIG) {
		C33I_EXEMPT_HIG = c33i_EXEMPT_HIG;
	}
	public String getC34I_GBC_1_LOW() {
		return C34I_GBC_1_LOW;
	}
	public void setC34I_GBC_1_LOW(String c34i_GBC_1_LOW) {
		C34I_GBC_1_LOW = c34i_GBC_1_LOW;
	}
	public String getC35I_GBC_1_MED() {
		return C35I_GBC_1_MED;
	}
	public void setC35I_GBC_1_MED(String c35i_GBC_1_MED) {
		C35I_GBC_1_MED = c35i_GBC_1_MED;
	}
	public String getC36I_GBC_1_HIG() {
		return C36I_GBC_1_HIG;
	}
	public void setC36I_GBC_1_HIG(String c36i_GBC_1_HIG) {
		C36I_GBC_1_HIG = c36i_GBC_1_HIG;
	}
	public String getC37I_GBC_2_LOW() {
		return C37I_GBC_2_LOW;
	}
	public void setC37I_GBC_2_LOW(String c37i_GBC_2_LOW) {
		C37I_GBC_2_LOW = c37i_GBC_2_LOW;
	}
	public String getC38I_GBC_2_MED() {
		return C38I_GBC_2_MED;
	}
	public void setC38I_GBC_2_MED(String c38i_GBC_2_MED) {
		C38I_GBC_2_MED = c38i_GBC_2_MED;
	}
	public String getC39I_GBC_2_HIG() {
		return C39I_GBC_2_HIG;
	}
	public void setC39I_GBC_2_HIG(String c39i_GBC_2_HIG) {
		C39I_GBC_2_HIG = c39i_GBC_2_HIG;
	}
	public String getC40I_PRIVATE_LOW() {
		return C40I_PRIVATE_LOW;
	}
	public void setC40I_PRIVATE_LOW(String c40i_PRIVATE_LOW) {
		C40I_PRIVATE_LOW = c40i_PRIVATE_LOW;
	}
	public String getC41I_PRIVATE_MED() {
		return C41I_PRIVATE_MED;
	}
	public void setC41I_PRIVATE_MED(String c41i_PRIVATE_MED) {
		C41I_PRIVATE_MED = c41i_PRIVATE_MED;
	}
	public String getC42I_PRIVATE_HIG() {
		return C42I_PRIVATE_HIG;
	}
	public void setC42I_PRIVATE_HIG(String c42i_PRIVATE_HIG) {
		C42I_PRIVATE_HIG = c42i_PRIVATE_HIG;
	}
	public String getC43I_RELATED_PARTY_LOW() {
		return C43I_RELATED_PARTY_LOW;
	}
	public void setC43I_RELATED_PARTY_LOW(String c43i_RELATED_PARTY_LOW) {
		C43I_RELATED_PARTY_LOW = c43i_RELATED_PARTY_LOW;
	}
	public String getC44I_RELATED_PARTY_MED() {
		return C44I_RELATED_PARTY_MED;
	}
	public void setC44I_RELATED_PARTY_MED(String c44i_RELATED_PARTY_MED) {
		C44I_RELATED_PARTY_MED = c44i_RELATED_PARTY_MED;
	}
	public String getC45I_RELATED_PARTY_HIG() {
		return C45I_RELATED_PARTY_HIG;
	}
	public void setC45I_RELATED_PARTY_HIG(String c45i_RELATED_PARTY_HIG) {
		C45I_RELATED_PARTY_HIG = c45i_RELATED_PARTY_HIG;
	}
	public BigDecimal getC16I_PEPS_DOM_LOW_A90() {
		return C16I_PEPS_DOM_LOW_A90;
	}
	public void setC16I_PEPS_DOM_LOW_A90(BigDecimal c16i_PEPS_DOM_LOW_A90) {
		C16I_PEPS_DOM_LOW_A90 = c16i_PEPS_DOM_LOW_A90;
	}
	public BigDecimal getC17I_PEPS_DOM_MED_A90() {
		return C17I_PEPS_DOM_MED_A90;
	}
	public void setC17I_PEPS_DOM_MED_A90(BigDecimal c17i_PEPS_DOM_MED_A90) {
		C17I_PEPS_DOM_MED_A90 = c17i_PEPS_DOM_MED_A90;
	}
	public BigDecimal getC18I_PEPS_DOM_HIG_A90() {
		return C18I_PEPS_DOM_HIG_A90;
	}
	public void setC18I_PEPS_DOM_HIG_A90(BigDecimal c18i_PEPS_DOM_HIG_A90) {
		C18I_PEPS_DOM_HIG_A90 = c18i_PEPS_DOM_HIG_A90;
	}
	public BigDecimal getC19I_PEPS_FRN_LOW_A90() {
		return C19I_PEPS_FRN_LOW_A90;
	}
	public void setC19I_PEPS_FRN_LOW_A90(BigDecimal c19i_PEPS_FRN_LOW_A90) {
		C19I_PEPS_FRN_LOW_A90 = c19i_PEPS_FRN_LOW_A90;
	}
	public BigDecimal getC20I_PEPS_FRN_MED_A90() {
		return C20I_PEPS_FRN_MED_A90;
	}
	public void setC20I_PEPS_FRN_MED_A90(BigDecimal c20i_PEPS_FRN_MED_A90) {
		C20I_PEPS_FRN_MED_A90 = c20i_PEPS_FRN_MED_A90;
	}
	public BigDecimal getC21I_PEPS_FRN_HIG_A90() {
		return C21I_PEPS_FRN_HIG_A90;
	}
	public void setC21I_PEPS_FRN_HIG_A90(BigDecimal c21i_PEPS_FRN_HIG_A90) {
		C21I_PEPS_FRN_HIG_A90 = c21i_PEPS_FRN_HIG_A90;
	}
	public BigDecimal getC22I_TCPS_LOW_A90() {
		return C22I_TCPS_LOW_A90;
	}
	public void setC22I_TCPS_LOW_A90(BigDecimal c22i_TCPS_LOW_A90) {
		C22I_TCPS_LOW_A90 = c22i_TCPS_LOW_A90;
	}
	public BigDecimal getC23I_TCPS_MED_A90() {
		return C23I_TCPS_MED_A90;
	}
	public void setC23I_TCPS_MED_A90(BigDecimal c23i_TCPS_MED_A90) {
		C23I_TCPS_MED_A90 = c23i_TCPS_MED_A90;
	}
	public BigDecimal getC24I_TCPS_HIG_A90() {
		return C24I_TCPS_HIG_A90;
	}
	public void setC24I_TCPS_HIG_A90(BigDecimal c24i_TCPS_HIG_A90) {
		C24I_TCPS_HIG_A90 = c24i_TCPS_HIG_A90;
	}
	public String getREPORT_CODE() {
		return REPORT_CODE;
	}
	public void setREPORT_CODE(String rEPORT_CODE) {
		REPORT_CODE = rEPORT_CODE;
	}
	public String getREPORT_NAME() {
		return REPORT_NAME;
	}
	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public Date getREPORT_DUE_DATE() {
		return REPORT_DUE_DATE;
	}
	public void setREPORT_DUE_DATE(Date rEPORT_DUE_DATE) {
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
	}
	public Date getREP_SUBMIT_DATE() {
		return REP_SUBMIT_DATE;
	}
	public void setREP_SUBMIT_DATE(Date rEP_SUBMIT_DATE) {
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
	}
	public Date getREP_PERIOD_FROM() {
		return REP_PERIOD_FROM;
	}
	public void setREP_PERIOD_FROM(Date rEP_PERIOD_FROM) {
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
	}
	public Date getREP_PERIOD_TO() {
		return REP_PERIOD_TO;
	}
	public void setREP_PERIOD_TO(Date rEP_PERIOD_TO) {
		REP_PERIOD_TO = rEP_PERIOD_TO;
	}
	public String getREP_FREQ() {
		return REP_FREQ;
	}
	public void setREP_FREQ(String rEP_FREQ) {
		REP_FREQ = rEP_FREQ;
	}
	public String getNIL_REPORT_FLG() {
		return NIL_REPORT_FLG;
	}
	public void setNIL_REPORT_FLG(String nIL_REPORT_FLG) {
		NIL_REPORT_FLG = nIL_REPORT_FLG;
	}
	public String getARCH_FLG() {
		return ARCH_FLG;
	}
	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
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
	public String getVERIFY_FLG() {
		return VERIFY_FLG;
	}
	public void setVERIFY_FLG(String vERIFY_FLG) {
		VERIFY_FLG = vERIFY_FLG;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Date getVERIFY_TIME() {
		return VERIFY_TIME;
	}
	public void setVERIFY_TIME(Date vERIFY_TIME) {
		VERIFY_TIME = vERIFY_TIME;
	}
	public T11Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T11Report(String d1a_IND_LOW, String d2a_IND_MED, String d3a_IND_HIG, String d4a_COR_LOW, String d5a_COR_MED,
			String d6a_COR_HIG, String d25a_RESPOND_LOW, String d26a_RESPOND_MED, String d27a_RESPOND_HIG,
			String d28a_CORRESPOND_LOW, String d29a_CORRESPOND_MED, String d30a_CORRESPOND_HIG, String d7a_NPR_ORG_LOW,
			String d8a_NPR_ORG_MED, String d9a_NPR_ORG_HIG, String d10a_TRUST_LOW, String d11a_TRUST_MED,
			String d12a_TRUST_HIG, String d13a_ALL_OTR_LOW, String d14a_ALL_OTR_MED, String d15a_ALL_OTR_HIG,
			String d31a_EXEMPT_LOW, String d32a_EXEMPT_MED, String d33a_EXEMPT_HIG, String d34a_GBC_1_LOW,
			String d35a_GBC_1_MED, String d36a_GBC_1_HIG, String d37a_GBC_2_LOW, String d38a_GBC_2_MED,
			String d39a_GBC_2_HIG, String d40a_PRIVATE_LOW, String d41a_PRIVATE_MED, String d42a_PRIVATE_HIG,
			String d43a_RELATED_PARTY_LOW, String d44a_RELATED_PARTY_MED, String d45a_RELATED_PARTY_HIG,
			String d16a_PEPS_DOM_LOW, String d17a_PEPS_DOM_MED, String d18a_PEPS_DOM_HIG, String d19a_PEPS_FRN_LOW,
			String d20a_PEPS_FRN_MED, String d21a_PEPS_FRN_HIG, String d22a_TCPS_LOW, String d23a_TCPS_MED,
			String d24a_TCPS_HIG, BigDecimal c1f_IND_LOW_B30, BigDecimal c2f_IND_MED_B30, BigDecimal c3f_IND_HIG_B30,
			BigDecimal c4f_COR_LOW_B30, BigDecimal c5f_COR_MED_B30, BigDecimal c6f_COR_HIG_B30, String c25f_RESPOND_LOW,
			String c26f_RESPOND_MED, String c27f_RESPOND_HIG, String c28f_CORRESPOND_LOW, String c29f_CORRESPOND_MED,
			String c30f_CORRESPOND_HIG, BigDecimal c7f_NPR_ORG_LOW_B30, BigDecimal c8f_NPR_ORG_MED_B30,
			BigDecimal c9f_NPR_ORG_HIG_B30, BigDecimal c10f_TRUST_LOW_B30, BigDecimal c11f_TRUST_MED_B30,
			BigDecimal c12f_TRUST_HIG_B30, BigDecimal c13f_ALL_OTR_LOW_B30, BigDecimal c14f_ALL_OTR_MED_B30,
			BigDecimal c15f_ALL_OTR_HIG_B30, String c31f_EXEMPT_LOW, String c32f_EXEMPT_MED, String c33f_EXEMPT_HIG,
			String c34f_GBC_1_LOW, String c35f_GBC_1_MED, String c36f_GBC_1_HIG, String c37f_GBC_2_LOW,
			String c38f_GBC_2_MED, String c39f_GBC_2_HIG, String c40f_PRIVATE_LOW, String c41f_PRIVATE_MED,
			String c42f_PRIVATE_HIG, String c43f_RELATED_PARTY_LOW, String c44f_RELATED_PARTY_MED,
			String c45f_RELATED_PARTY_HIG, BigDecimal c16f_PEPS_DOM_LOW_B30, BigDecimal c17f_PEPS_DOM_MED_B30,
			BigDecimal c18f_PEPS_DOM_HIG_B30, BigDecimal c19f_PEPS_FRN_LOW_B30, BigDecimal c20f_PEPS_FRN_MED_B30,
			BigDecimal c21f_PEPS_FRN_HIG_B30, BigDecimal c22f_TCPS_LOW_B30, BigDecimal c23f_TCPS_MED_B30,
			BigDecimal c24f_TCPS_HIG_B30, BigDecimal c1g_IND_LOW_30_60, BigDecimal c2g_IND_MED_30_60,
			BigDecimal c3g_IND_HIG_30_60, BigDecimal c4g_COR_LOW_30_60, BigDecimal c5g_COR_MED_30_60,
			BigDecimal c6g_COR_HIG_30_60, String c25g_RESPOND_LOW, String c26g_RESPOND_MED, String c27g_RESPOND_HIG,
			String c28g_CORRESPOND_LOW, String c29g_CORRESPOND_MED, String c30g_CORRESPOND_HIG,
			BigDecimal c7g_NPR_ORG_LOW_30_60, BigDecimal c8g_NPR_ORG_MED_30_60, BigDecimal c9g_NPR_ORG_HIG_30_60,
			BigDecimal c10g_TRUST_LOW_30_60, BigDecimal c11g_TRUST_MED_30_60, BigDecimal c12g_TRUST_HIG_30_60,
			BigDecimal c13g_ALL_OTR_LOW_30_60, BigDecimal c14g_ALL_OTR_MED_30_60, BigDecimal c15g_ALL_OTR_HIG_30_60,
			String c31g_EXEMPT_LOW, String c32g_EXEMPT_MED, String c33g_EXEMPT_HIG, String c34g_GBC_1_LOW,
			String c35g_GBC_1_MED, String c36g_GBC_1_HIG, String c37g_GBC_2_LOW, String c38g_GBC_2_MED,
			String c39g_GBC_2_HIG, String c40g_PRIVATE_LOW, String c41g_PRIVATE_MED, String c42g_PRIVATE_HIG,
			String c43g_RELATED_PARTY_LOW, String c44g_RELATED_PARTY_MED, String c45g_RELATED_PARTY_HIG,
			BigDecimal c16g_PEPS_DOM_LOW_30_60, BigDecimal c17g_PEPS_DOM_MED_30_60, BigDecimal c18g_PEPS_DOM_HIG_30_60,
			BigDecimal c19g_PEPS_FRN_LOW_30_60, BigDecimal c20g_PEPS_FRN_MED_30_60, BigDecimal c21g_PEPS_FRN_HIG_30_60,
			BigDecimal c22g_TCPS_LOW_30_60, BigDecimal c23g_TCPS_MED_30_60, BigDecimal c24g_TCPS_HIG_30_60,
			BigDecimal c1h_IND_LOW_60_90, BigDecimal c2h_IND_MED_60_90, BigDecimal c3h_IND_HIG_60_90,
			BigDecimal c4h_COR_LOW_60_90, BigDecimal c5h_COR_MED_60_90, BigDecimal c6h_COR_HIG_60_90,
			String c25h_RESPOND_LOW, String c26h_RESPOND_MED, String c27h_RESPOND_HIG, String c28h_CORRESPOND_LOW,
			String c29h_CORRESPOND_MED, String c30h_CORRESPOND_HIG, BigDecimal c7h_NPR_ORG_LOW_60_90,
			BigDecimal c8h_NPR_ORG_MED_60_90, BigDecimal c9h_NPR_ORG_HIG_60_90, BigDecimal c10h_TRUST_LOW_60_90,
			BigDecimal c11h_TRUST_MED_60_90, BigDecimal c12h_TRUST_HIG_60_90, BigDecimal c13h_ALL_OTR_LOW_60_90,
			BigDecimal c14h_ALL_OTR_MED_60_90, BigDecimal c15h_ALL_OTR_HIG_60_90, String c31h_EXEMPT_LOW,
			String c32h_EXEMPT_MED, String c33h_EXEMPT_HIG, String c34h_GBC_1_LOW, String c35h_GBC_1_MED,
			String c36h_GBC_1_HIG, String c37h_GBC_2_LOW, String c38h_GBC_2_MED, String c39h_GBC_2_HIG,
			String c40h_PRIVATE_LOW, String c41h_PRIVATE_MED, String c42h_PRIVATE_HIG, String c43h_RELATED_PARTY_LOW,
			String c44h_RELATED_PARTY_MED, String c45h_RELATED_PARTY_HIG, BigDecimal c16h_PEPS_DOM_LOW_60_90,
			BigDecimal c17h_PEPS_DOM_MED_60_90, BigDecimal c18h_PEPS_DOM_HIG_60_90, BigDecimal c19h_PEPS_FRN_LOW_60_90,
			BigDecimal c20h_PEPS_FRN_MED_60_90, BigDecimal c21h_PEPS_FRN_HIG_60_90, BigDecimal c22h_TCPS_LOW_60_90,
			BigDecimal c23h_TCPS_MED_60_90, BigDecimal c24h_TCPS_HIG_60_90, BigDecimal c1i_IND_LOW_A90,
			BigDecimal c2i_IND_MED_A90, BigDecimal c3i_IND_HIG_A90, BigDecimal c4i_COR_LOW_A90,
			BigDecimal c5i_COR_MED_A90, BigDecimal c6i_COR_HIG_A90, String c25i_RESPOND_LOW, String c26i_RESPOND_MED,
			String c27i_RESPOND_HIG, String c28i_CORRESPOND_LOW, String c29i_CORRESPOND_MED, String c30i_CORRESPOND_HIG,
			BigDecimal c7i_NPR_ORG_LOW_A90, BigDecimal c8i_NPR_ORG_MED_A90, BigDecimal c9i_NPR_ORG_HIG_A90,
			BigDecimal c10i_TRUST_LOW_A90, BigDecimal c11i_TRUST_MED_A90, BigDecimal c12i_TRUST_HIG_A90,
			BigDecimal c13i_ALL_OTR_LOW_A90, BigDecimal c14i_ALL_OTR_MED_A90, BigDecimal c15i_ALL_OTR_HIG_A90,
			String c31i_EXEMPT_LOW, String c32i_EXEMPT_MED, String c33i_EXEMPT_HIG, String c34i_GBC_1_LOW,
			String c35i_GBC_1_MED, String c36i_GBC_1_HIG, String c37i_GBC_2_LOW, String c38i_GBC_2_MED,
			String c39i_GBC_2_HIG, String c40i_PRIVATE_LOW, String c41i_PRIVATE_MED, String c42i_PRIVATE_HIG,
			String c43i_RELATED_PARTY_LOW, String c44i_RELATED_PARTY_MED, String c45i_RELATED_PARTY_HIG,
			BigDecimal c16i_PEPS_DOM_LOW_A90, BigDecimal c17i_PEPS_DOM_MED_A90, BigDecimal c18i_PEPS_DOM_HIG_A90,
			BigDecimal c19i_PEPS_FRN_LOW_A90, BigDecimal c20i_PEPS_FRN_MED_A90, BigDecimal c21i_PEPS_FRN_HIG_A90,
			BigDecimal c22i_TCPS_LOW_A90, BigDecimal c23i_TCPS_MED_A90, BigDecimal c24i_TCPS_HIG_A90,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String mODIFY_FLG, String vERIFY_FLG, String eNTRY_USER, String mODIFY_USER,
			String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME) {
		super();
		D1A_IND_LOW = d1a_IND_LOW;
		D2A_IND_MED = d2a_IND_MED;
		D3A_IND_HIG = d3a_IND_HIG;
		D4A_COR_LOW = d4a_COR_LOW;
		D5A_COR_MED = d5a_COR_MED;
		D6A_COR_HIG = d6a_COR_HIG;
		D25A_RESPOND_LOW = d25a_RESPOND_LOW;
		D26A_RESPOND_MED = d26a_RESPOND_MED;
		D27A_RESPOND_HIG = d27a_RESPOND_HIG;
		D28A_CORRESPOND_LOW = d28a_CORRESPOND_LOW;
		D29A_CORRESPOND_MED = d29a_CORRESPOND_MED;
		D30A_CORRESPOND_HIG = d30a_CORRESPOND_HIG;
		D7A_NPR_ORG_LOW = d7a_NPR_ORG_LOW;
		D8A_NPR_ORG_MED = d8a_NPR_ORG_MED;
		D9A_NPR_ORG_HIG = d9a_NPR_ORG_HIG;
		D10A_TRUST_LOW = d10a_TRUST_LOW;
		D11A_TRUST_MED = d11a_TRUST_MED;
		D12A_TRUST_HIG = d12a_TRUST_HIG;
		D13A_ALL_OTR_LOW = d13a_ALL_OTR_LOW;
		D14A_ALL_OTR_MED = d14a_ALL_OTR_MED;
		D15A_ALL_OTR_HIG = d15a_ALL_OTR_HIG;
		D31A_EXEMPT_LOW = d31a_EXEMPT_LOW;
		D32A_EXEMPT_MED = d32a_EXEMPT_MED;
		D33A_EXEMPT_HIG = d33a_EXEMPT_HIG;
		D34A_GBC_1_LOW = d34a_GBC_1_LOW;
		D35A_GBC_1_MED = d35a_GBC_1_MED;
		D36A_GBC_1_HIG = d36a_GBC_1_HIG;
		D37A_GBC_2_LOW = d37a_GBC_2_LOW;
		D38A_GBC_2_MED = d38a_GBC_2_MED;
		D39A_GBC_2_HIG = d39a_GBC_2_HIG;
		D40A_PRIVATE_LOW = d40a_PRIVATE_LOW;
		D41A_PRIVATE_MED = d41a_PRIVATE_MED;
		D42A_PRIVATE_HIG = d42a_PRIVATE_HIG;
		D43A_RELATED_PARTY_LOW = d43a_RELATED_PARTY_LOW;
		D44A_RELATED_PARTY_MED = d44a_RELATED_PARTY_MED;
		D45A_RELATED_PARTY_HIG = d45a_RELATED_PARTY_HIG;
		D16A_PEPS_DOM_LOW = d16a_PEPS_DOM_LOW;
		D17A_PEPS_DOM_MED = d17a_PEPS_DOM_MED;
		D18A_PEPS_DOM_HIG = d18a_PEPS_DOM_HIG;
		D19A_PEPS_FRN_LOW = d19a_PEPS_FRN_LOW;
		D20A_PEPS_FRN_MED = d20a_PEPS_FRN_MED;
		D21A_PEPS_FRN_HIG = d21a_PEPS_FRN_HIG;
		D22A_TCPS_LOW = d22a_TCPS_LOW;
		D23A_TCPS_MED = d23a_TCPS_MED;
		D24A_TCPS_HIG = d24a_TCPS_HIG;
		C1F_IND_LOW_B30 = c1f_IND_LOW_B30;
		C2F_IND_MED_B30 = c2f_IND_MED_B30;
		C3F_IND_HIG_B30 = c3f_IND_HIG_B30;
		C4F_COR_LOW_B30 = c4f_COR_LOW_B30;
		C5F_COR_MED_B30 = c5f_COR_MED_B30;
		C6F_COR_HIG_B30 = c6f_COR_HIG_B30;
		C25F_RESPOND_LOW = c25f_RESPOND_LOW;
		C26F_RESPOND_MED = c26f_RESPOND_MED;
		C27F_RESPOND_HIG = c27f_RESPOND_HIG;
		C28F_CORRESPOND_LOW = c28f_CORRESPOND_LOW;
		C29F_CORRESPOND_MED = c29f_CORRESPOND_MED;
		C30F_CORRESPOND_HIG = c30f_CORRESPOND_HIG;
		C7F_NPR_ORG_LOW_B30 = c7f_NPR_ORG_LOW_B30;
		C8F_NPR_ORG_MED_B30 = c8f_NPR_ORG_MED_B30;
		C9F_NPR_ORG_HIG_B30 = c9f_NPR_ORG_HIG_B30;
		C10F_TRUST_LOW_B30 = c10f_TRUST_LOW_B30;
		C11F_TRUST_MED_B30 = c11f_TRUST_MED_B30;
		C12F_TRUST_HIG_B30 = c12f_TRUST_HIG_B30;
		C13F_ALL_OTR_LOW_B30 = c13f_ALL_OTR_LOW_B30;
		C14F_ALL_OTR_MED_B30 = c14f_ALL_OTR_MED_B30;
		C15F_ALL_OTR_HIG_B30 = c15f_ALL_OTR_HIG_B30;
		C31F_EXEMPT_LOW = c31f_EXEMPT_LOW;
		C32F_EXEMPT_MED = c32f_EXEMPT_MED;
		C33F_EXEMPT_HIG = c33f_EXEMPT_HIG;
		C34F_GBC_1_LOW = c34f_GBC_1_LOW;
		C35F_GBC_1_MED = c35f_GBC_1_MED;
		C36F_GBC_1_HIG = c36f_GBC_1_HIG;
		C37F_GBC_2_LOW = c37f_GBC_2_LOW;
		C38F_GBC_2_MED = c38f_GBC_2_MED;
		C39F_GBC_2_HIG = c39f_GBC_2_HIG;
		C40F_PRIVATE_LOW = c40f_PRIVATE_LOW;
		C41F_PRIVATE_MED = c41f_PRIVATE_MED;
		C42F_PRIVATE_HIG = c42f_PRIVATE_HIG;
		C43F_RELATED_PARTY_LOW = c43f_RELATED_PARTY_LOW;
		C44F_RELATED_PARTY_MED = c44f_RELATED_PARTY_MED;
		C45F_RELATED_PARTY_HIG = c45f_RELATED_PARTY_HIG;
		C16F_PEPS_DOM_LOW_B30 = c16f_PEPS_DOM_LOW_B30;
		C17F_PEPS_DOM_MED_B30 = c17f_PEPS_DOM_MED_B30;
		C18F_PEPS_DOM_HIG_B30 = c18f_PEPS_DOM_HIG_B30;
		C19F_PEPS_FRN_LOW_B30 = c19f_PEPS_FRN_LOW_B30;
		C20F_PEPS_FRN_MED_B30 = c20f_PEPS_FRN_MED_B30;
		C21F_PEPS_FRN_HIG_B30 = c21f_PEPS_FRN_HIG_B30;
		C22F_TCPS_LOW_B30 = c22f_TCPS_LOW_B30;
		C23F_TCPS_MED_B30 = c23f_TCPS_MED_B30;
		C24F_TCPS_HIG_B30 = c24f_TCPS_HIG_B30;
		C1G_IND_LOW_30_60 = c1g_IND_LOW_30_60;
		C2G_IND_MED_30_60 = c2g_IND_MED_30_60;
		C3G_IND_HIG_30_60 = c3g_IND_HIG_30_60;
		C4G_COR_LOW_30_60 = c4g_COR_LOW_30_60;
		C5G_COR_MED_30_60 = c5g_COR_MED_30_60;
		C6G_COR_HIG_30_60 = c6g_COR_HIG_30_60;
		C25G_RESPOND_LOW = c25g_RESPOND_LOW;
		C26G_RESPOND_MED = c26g_RESPOND_MED;
		C27G_RESPOND_HIG = c27g_RESPOND_HIG;
		C28G_CORRESPOND_LOW = c28g_CORRESPOND_LOW;
		C29G_CORRESPOND_MED = c29g_CORRESPOND_MED;
		C30G_CORRESPOND_HIG = c30g_CORRESPOND_HIG;
		C7G_NPR_ORG_LOW_30_60 = c7g_NPR_ORG_LOW_30_60;
		C8G_NPR_ORG_MED_30_60 = c8g_NPR_ORG_MED_30_60;
		C9G_NPR_ORG_HIG_30_60 = c9g_NPR_ORG_HIG_30_60;
		C10G_TRUST_LOW_30_60 = c10g_TRUST_LOW_30_60;
		C11G_TRUST_MED_30_60 = c11g_TRUST_MED_30_60;
		C12G_TRUST_HIG_30_60 = c12g_TRUST_HIG_30_60;
		C13G_ALL_OTR_LOW_30_60 = c13g_ALL_OTR_LOW_30_60;
		C14G_ALL_OTR_MED_30_60 = c14g_ALL_OTR_MED_30_60;
		C15G_ALL_OTR_HIG_30_60 = c15g_ALL_OTR_HIG_30_60;
		C31G_EXEMPT_LOW = c31g_EXEMPT_LOW;
		C32G_EXEMPT_MED = c32g_EXEMPT_MED;
		C33G_EXEMPT_HIG = c33g_EXEMPT_HIG;
		C34G_GBC_1_LOW = c34g_GBC_1_LOW;
		C35G_GBC_1_MED = c35g_GBC_1_MED;
		C36G_GBC_1_HIG = c36g_GBC_1_HIG;
		C37G_GBC_2_LOW = c37g_GBC_2_LOW;
		C38G_GBC_2_MED = c38g_GBC_2_MED;
		C39G_GBC_2_HIG = c39g_GBC_2_HIG;
		C40G_PRIVATE_LOW = c40g_PRIVATE_LOW;
		C41G_PRIVATE_MED = c41g_PRIVATE_MED;
		C42G_PRIVATE_HIG = c42g_PRIVATE_HIG;
		C43G_RELATED_PARTY_LOW = c43g_RELATED_PARTY_LOW;
		C44G_RELATED_PARTY_MED = c44g_RELATED_PARTY_MED;
		C45G_RELATED_PARTY_HIG = c45g_RELATED_PARTY_HIG;
		C16G_PEPS_DOM_LOW_30_60 = c16g_PEPS_DOM_LOW_30_60;
		C17G_PEPS_DOM_MED_30_60 = c17g_PEPS_DOM_MED_30_60;
		C18G_PEPS_DOM_HIG_30_60 = c18g_PEPS_DOM_HIG_30_60;
		C19G_PEPS_FRN_LOW_30_60 = c19g_PEPS_FRN_LOW_30_60;
		C20G_PEPS_FRN_MED_30_60 = c20g_PEPS_FRN_MED_30_60;
		C21G_PEPS_FRN_HIG_30_60 = c21g_PEPS_FRN_HIG_30_60;
		C22G_TCPS_LOW_30_60 = c22g_TCPS_LOW_30_60;
		C23G_TCPS_MED_30_60 = c23g_TCPS_MED_30_60;
		C24G_TCPS_HIG_30_60 = c24g_TCPS_HIG_30_60;
		C1H_IND_LOW_60_90 = c1h_IND_LOW_60_90;
		C2H_IND_MED_60_90 = c2h_IND_MED_60_90;
		C3H_IND_HIG_60_90 = c3h_IND_HIG_60_90;
		C4H_COR_LOW_60_90 = c4h_COR_LOW_60_90;
		C5H_COR_MED_60_90 = c5h_COR_MED_60_90;
		C6H_COR_HIG_60_90 = c6h_COR_HIG_60_90;
		C25H_RESPOND_LOW = c25h_RESPOND_LOW;
		C26H_RESPOND_MED = c26h_RESPOND_MED;
		C27H_RESPOND_HIG = c27h_RESPOND_HIG;
		C28H_CORRESPOND_LOW = c28h_CORRESPOND_LOW;
		C29H_CORRESPOND_MED = c29h_CORRESPOND_MED;
		C30H_CORRESPOND_HIG = c30h_CORRESPOND_HIG;
		C7H_NPR_ORG_LOW_60_90 = c7h_NPR_ORG_LOW_60_90;
		C8H_NPR_ORG_MED_60_90 = c8h_NPR_ORG_MED_60_90;
		C9H_NPR_ORG_HIG_60_90 = c9h_NPR_ORG_HIG_60_90;
		C10H_TRUST_LOW_60_90 = c10h_TRUST_LOW_60_90;
		C11H_TRUST_MED_60_90 = c11h_TRUST_MED_60_90;
		C12H_TRUST_HIG_60_90 = c12h_TRUST_HIG_60_90;
		C13H_ALL_OTR_LOW_60_90 = c13h_ALL_OTR_LOW_60_90;
		C14H_ALL_OTR_MED_60_90 = c14h_ALL_OTR_MED_60_90;
		C15H_ALL_OTR_HIG_60_90 = c15h_ALL_OTR_HIG_60_90;
		C31H_EXEMPT_LOW = c31h_EXEMPT_LOW;
		C32H_EXEMPT_MED = c32h_EXEMPT_MED;
		C33H_EXEMPT_HIG = c33h_EXEMPT_HIG;
		C34H_GBC_1_LOW = c34h_GBC_1_LOW;
		C35H_GBC_1_MED = c35h_GBC_1_MED;
		C36H_GBC_1_HIG = c36h_GBC_1_HIG;
		C37H_GBC_2_LOW = c37h_GBC_2_LOW;
		C38H_GBC_2_MED = c38h_GBC_2_MED;
		C39H_GBC_2_HIG = c39h_GBC_2_HIG;
		C40H_PRIVATE_LOW = c40h_PRIVATE_LOW;
		C41H_PRIVATE_MED = c41h_PRIVATE_MED;
		C42H_PRIVATE_HIG = c42h_PRIVATE_HIG;
		C43H_RELATED_PARTY_LOW = c43h_RELATED_PARTY_LOW;
		C44H_RELATED_PARTY_MED = c44h_RELATED_PARTY_MED;
		C45H_RELATED_PARTY_HIG = c45h_RELATED_PARTY_HIG;
		C16H_PEPS_DOM_LOW_60_90 = c16h_PEPS_DOM_LOW_60_90;
		C17H_PEPS_DOM_MED_60_90 = c17h_PEPS_DOM_MED_60_90;
		C18H_PEPS_DOM_HIG_60_90 = c18h_PEPS_DOM_HIG_60_90;
		C19H_PEPS_FRN_LOW_60_90 = c19h_PEPS_FRN_LOW_60_90;
		C20H_PEPS_FRN_MED_60_90 = c20h_PEPS_FRN_MED_60_90;
		C21H_PEPS_FRN_HIG_60_90 = c21h_PEPS_FRN_HIG_60_90;
		C22H_TCPS_LOW_60_90 = c22h_TCPS_LOW_60_90;
		C23H_TCPS_MED_60_90 = c23h_TCPS_MED_60_90;
		C24H_TCPS_HIG_60_90 = c24h_TCPS_HIG_60_90;
		C1I_IND_LOW_A90 = c1i_IND_LOW_A90;
		C2I_IND_MED_A90 = c2i_IND_MED_A90;
		C3I_IND_HIG_A90 = c3i_IND_HIG_A90;
		C4I_COR_LOW_A90 = c4i_COR_LOW_A90;
		C5I_COR_MED_A90 = c5i_COR_MED_A90;
		C6I_COR_HIG_A90 = c6i_COR_HIG_A90;
		C25I_RESPOND_LOW = c25i_RESPOND_LOW;
		C26I_RESPOND_MED = c26i_RESPOND_MED;
		C27I_RESPOND_HIG = c27i_RESPOND_HIG;
		C28I_CORRESPOND_LOW = c28i_CORRESPOND_LOW;
		C29I_CORRESPOND_MED = c29i_CORRESPOND_MED;
		C30I_CORRESPOND_HIG = c30i_CORRESPOND_HIG;
		C7I_NPR_ORG_LOW_A90 = c7i_NPR_ORG_LOW_A90;
		C8I_NPR_ORG_MED_A90 = c8i_NPR_ORG_MED_A90;
		C9I_NPR_ORG_HIG_A90 = c9i_NPR_ORG_HIG_A90;
		C10I_TRUST_LOW_A90 = c10i_TRUST_LOW_A90;
		C11I_TRUST_MED_A90 = c11i_TRUST_MED_A90;
		C12I_TRUST_HIG_A90 = c12i_TRUST_HIG_A90;
		C13I_ALL_OTR_LOW_A90 = c13i_ALL_OTR_LOW_A90;
		C14I_ALL_OTR_MED_A90 = c14i_ALL_OTR_MED_A90;
		C15I_ALL_OTR_HIG_A90 = c15i_ALL_OTR_HIG_A90;
		C31I_EXEMPT_LOW = c31i_EXEMPT_LOW;
		C32I_EXEMPT_MED = c32i_EXEMPT_MED;
		C33I_EXEMPT_HIG = c33i_EXEMPT_HIG;
		C34I_GBC_1_LOW = c34i_GBC_1_LOW;
		C35I_GBC_1_MED = c35i_GBC_1_MED;
		C36I_GBC_1_HIG = c36i_GBC_1_HIG;
		C37I_GBC_2_LOW = c37i_GBC_2_LOW;
		C38I_GBC_2_MED = c38i_GBC_2_MED;
		C39I_GBC_2_HIG = c39i_GBC_2_HIG;
		C40I_PRIVATE_LOW = c40i_PRIVATE_LOW;
		C41I_PRIVATE_MED = c41i_PRIVATE_MED;
		C42I_PRIVATE_HIG = c42i_PRIVATE_HIG;
		C43I_RELATED_PARTY_LOW = c43i_RELATED_PARTY_LOW;
		C44I_RELATED_PARTY_MED = c44i_RELATED_PARTY_MED;
		C45I_RELATED_PARTY_HIG = c45i_RELATED_PARTY_HIG;
		C16I_PEPS_DOM_LOW_A90 = c16i_PEPS_DOM_LOW_A90;
		C17I_PEPS_DOM_MED_A90 = c17i_PEPS_DOM_MED_A90;
		C18I_PEPS_DOM_HIG_A90 = c18i_PEPS_DOM_HIG_A90;
		C19I_PEPS_FRN_LOW_A90 = c19i_PEPS_FRN_LOW_A90;
		C20I_PEPS_FRN_MED_A90 = c20i_PEPS_FRN_MED_A90;
		C21I_PEPS_FRN_HIG_A90 = c21i_PEPS_FRN_HIG_A90;
		C22I_TCPS_LOW_A90 = c22i_TCPS_LOW_A90;
		C23I_TCPS_MED_A90 = c23i_TCPS_MED_A90;
		C24I_TCPS_HIG_A90 = c24i_TCPS_HIG_A90;
		REPORT_CODE = rEPORT_CODE;
		REPORT_NAME = rEPORT_NAME;
		REPORT_DATE = rEPORT_DATE;
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
		REP_PERIOD_TO = rEP_PERIOD_TO;
		REP_FREQ = rEP_FREQ;
		NIL_REPORT_FLG = nIL_REPORT_FLG;
		ARCH_FLG = aRCH_FLG;
		ENTITY_FLG = eNTITY_FLG;
		MODIFY_FLG = mODIFY_FLG;
		VERIFY_FLG = vERIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
	}

	
}
