package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BCBUAE_NOSTRO_ACC_BAL_DATA")
public class NostroAccBalData {

    @Id
    @Column(name = "ACCOUNT_NO")
    private String accountNo;


    @Column(name = "DATA_DATE")
    @Temporal(TemporalType.DATE)
    private Date dataDate;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "HEAD_OFFICE_SUBSIDIARY")
    private String headOfficeSubsidiary;

    @Column(name = "SUBSIDIARY")
    private String subsidiary;

    @Column(name = "BANK_SYMBOL")
    private String bankSymbol;

    @Column(name = "CONVENTIONAL_ISLAMIC")
    private String conventionalIslamic;

    @Column(name = "LOCAL_FOREIGN")
    private String localForeign;

    @Column(name = "CBUAE_TIERING")
    private String cbuaeTiering;

    @Column(name = "COUNTERPARTY_NOSTRO_ACCOUNT")
    private String counterpartyNostroAccount;

    @Column(name = "FINAL_RATING_BANKS")
    private String finalRatingBanks;

    @Column(name = "FINAL_RATING_CBUAE")
    private String finalRatingCbuae;

    @Column(name = "COUNTRY_OF_RISK")
    private String countryOfRisk;

    @Column(name = "CBUAE_GEOGRAPHICAL_ZONE")
    private String cbuaeGeographicalZone;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "COUNTERPARTY_SETTLEMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date counterpartySettlementDate;

    @Column(name = "COUNTERPARTY_BALANCE")
    private BigDecimal counterpartyBalance;

    @Column(name = "COUNTERPARTY_BALANCE_AED")
    private BigDecimal counterpartyBalanceAed;

    @Column(name = "BANK_INTERNAL_SETTLEMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date bankInternalSettlementDate;

    @Column(name = "BANK_BALANCE")
    private BigDecimal bankBalance;

    @Column(name = "BANK_BALANCE_AED")
    private BigDecimal bankBalanceAed;

    

    @Column(name = "GAP")
    private BigDecimal gap;

    @Column(name = "REPORT_SUBMIT_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportSubmitDate;

    @Column(name = "REPORT_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportDate;

    @Column(name = "ENTITY_FLG")
    private String entityFlg;

    @Column(name = "MODIFY_FLG")
    private String modifyFlg;

    @Column(name = "DEL_FLG")
    private String delFlg;

    @Column(name = "REPORT_FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportFromDate;

    @Column(name = "REPORT_TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportToDate;

  
	

	public NostroAccBalData(Date dataDate, String bankName, String headOfficeSubsidiary, String subsidiary,
			String bankSymbol, String conventionalIslamic, String localForeign, String cbuaeTiering,
			String counterpartyNostroAccount, String finalRatingBanks, String finalRatingCbuae, String countryOfRisk,
			String cbuaeGeographicalZone, String currency, Date counterpartySettlementDate,
			BigDecimal counterpartyBalance, BigDecimal counterpartyBalanceAed, Date bankInternalSettlementDate,
			BigDecimal bankBalance, BigDecimal bankBalanceAed, String accountNo, BigDecimal gap, Date reportSubmitDate,
			Date reportDate, String entityFlg, String modifyFlg, String delFlg, Date reportFromDate,
			Date reportToDate) {
		super();
		
		this.dataDate = dataDate;
		this.bankName = bankName;
		this.headOfficeSubsidiary = headOfficeSubsidiary;
		this.subsidiary = subsidiary;
		this.bankSymbol = bankSymbol;
		this.conventionalIslamic = conventionalIslamic;
		this.localForeign = localForeign;
		this.cbuaeTiering = cbuaeTiering;
		this.counterpartyNostroAccount = counterpartyNostroAccount;
		this.finalRatingBanks = finalRatingBanks;
		this.finalRatingCbuae = finalRatingCbuae;
		this.countryOfRisk = countryOfRisk;
		this.cbuaeGeographicalZone = cbuaeGeographicalZone;
		this.currency = currency;
		this.counterpartySettlementDate = counterpartySettlementDate;
		this.counterpartyBalance = counterpartyBalance;
		this.counterpartyBalanceAed = counterpartyBalanceAed;
		this.bankInternalSettlementDate = bankInternalSettlementDate;
		this.bankBalance = bankBalance;
		this.bankBalanceAed = bankBalanceAed;
		this.accountNo = accountNo;
		this.gap = gap;
		this.reportSubmitDate = reportSubmitDate;
		this.reportDate = reportDate;
		this.entityFlg = entityFlg;
		this.modifyFlg = modifyFlg;
		this.delFlg = delFlg;
		this.reportFromDate = reportFromDate;
		this.reportToDate = reportToDate;
	}




	



	public Date getDataDate() {
		return dataDate;
	}




	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}




	public String getBankName() {
		return bankName;
	}




	public void setBankName(String bankName) {
		this.bankName = bankName;
	}




	public String getHeadOfficeSubsidiary() {
		return headOfficeSubsidiary;
	}




	public void setHeadOfficeSubsidiary(String headOfficeSubsidiary) {
		this.headOfficeSubsidiary = headOfficeSubsidiary;
	}




	public String getSubsidiary() {
		return subsidiary;
	}




	public void setSubsidiary(String subsidiary) {
		this.subsidiary = subsidiary;
	}




	public String getBankSymbol() {
		return bankSymbol;
	}




	public void setBankSymbol(String bankSymbol) {
		this.bankSymbol = bankSymbol;
	}




	public String getConventionalIslamic() {
		return conventionalIslamic;
	}




	public void setConventionalIslamic(String conventionalIslamic) {
		this.conventionalIslamic = conventionalIslamic;
	}




	public String getLocalForeign() {
		return localForeign;
	}




	public void setLocalForeign(String localForeign) {
		this.localForeign = localForeign;
	}




	public String getCbuaeTiering() {
		return cbuaeTiering;
	}




	public void setCbuaeTiering(String cbuaeTiering) {
		this.cbuaeTiering = cbuaeTiering;
	}




	public String getCounterpartyNostroAccount() {
		return counterpartyNostroAccount;
	}




	public void setCounterpartyNostroAccount(String counterpartyNostroAccount) {
		this.counterpartyNostroAccount = counterpartyNostroAccount;
	}




	public String getFinalRatingBanks() {
		return finalRatingBanks;
	}




	public void setFinalRatingBanks(String finalRatingBanks) {
		this.finalRatingBanks = finalRatingBanks;
	}




	public String getFinalRatingCbuae() {
		return finalRatingCbuae;
	}




	public void setFinalRatingCbuae(String finalRatingCbuae) {
		this.finalRatingCbuae = finalRatingCbuae;
	}




	public String getCountryOfRisk() {
		return countryOfRisk;
	}




	public void setCountryOfRisk(String countryOfRisk) {
		this.countryOfRisk = countryOfRisk;
	}




	public String getCbuaeGeographicalZone() {
		return cbuaeGeographicalZone;
	}




	public void setCbuaeGeographicalZone(String cbuaeGeographicalZone) {
		this.cbuaeGeographicalZone = cbuaeGeographicalZone;
	}




	public String getCurrency() {
		return currency;
	}




	public void setCurrency(String currency) {
		this.currency = currency;
	}




	public Date getCounterpartySettlementDate() {
		return counterpartySettlementDate;
	}




	public void setCounterpartySettlementDate(Date counterpartySettlementDate) {
		this.counterpartySettlementDate = counterpartySettlementDate;
	}




	public BigDecimal getCounterpartyBalance() {
		return counterpartyBalance;
	}




	public void setCounterpartyBalance(BigDecimal counterpartyBalance) {
		this.counterpartyBalance = counterpartyBalance;
	}




	public BigDecimal getCounterpartyBalanceAed() {
		return counterpartyBalanceAed;
	}




	public void setCounterpartyBalanceAed(BigDecimal counterpartyBalanceAed) {
		this.counterpartyBalanceAed = counterpartyBalanceAed;
	}




	public Date getBankInternalSettlementDate() {
		return bankInternalSettlementDate;
	}




	public void setBankInternalSettlementDate(Date bankInternalSettlementDate) {
		this.bankInternalSettlementDate = bankInternalSettlementDate;
	}




	public BigDecimal getBankBalance() {
		return bankBalance;
	}




	public void setBankBalance(BigDecimal bankBalance) {
		this.bankBalance = bankBalance;
	}




	public BigDecimal getBankBalanceAed() {
		return bankBalanceAed;
	}




	public void setBankBalanceAed(BigDecimal bankBalanceAed) {
		this.bankBalanceAed = bankBalanceAed;
	}




	public String getAccountNo() {
		return accountNo;
	}




	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}




	public BigDecimal getGap() {
		return gap;
	}




	public void setGap(BigDecimal gap) {
		this.gap = gap;
	}




	public Date getReportSubmitDate() {
		return reportSubmitDate;
	}




	public void setReportSubmitDate(Date reportSubmitDate) {
		this.reportSubmitDate = reportSubmitDate;
	}




	public Date getReportDate() {
		return reportDate;
	}




	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}




	public String getEntityFlg() {
		return entityFlg;
	}




	public void setEntityFlg(String entityFlg) {
		this.entityFlg = entityFlg;
	}




	public String getModifyFlg() {
		return modifyFlg;
	}




	public void setModifyFlg(String modifyFlg) {
		this.modifyFlg = modifyFlg;
	}




	public String getDelFlg() {
		return delFlg;
	}




	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}




	public Date getReportFromDate() {
		return reportFromDate;
	}




	public void setReportFromDate(Date reportFromDate) {
		this.reportFromDate = reportFromDate;
	}




	public Date getReportToDate() {
		return reportToDate;
	}




	public void setReportToDate(Date reportToDate) {
		this.reportToDate = reportToDate;
	}




	public NostroAccBalData() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}

