package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "BRRS_M_SRWA_12D_DETAILTABLE")

	public class M_SRWA_12D_DETAIL_ENTITY {
		
		@Id
	    @Column(name = "CUST_ID", length = 100)
	    private String custId;

	    @Column(name = "ACCT_NUMBER", length = 100)
	    private String acctNumber;

	    @Column(name = "ACCT_NAME", length = 100)
	    private String acctName;

	    @Column(name = "DATA_TYPE", length = 100)
	    private String dataType;

	    @Column(name = "ROW_ID", length = 100)
	    private String rowId;

	    @Column(name = "COLUMN_ID", length = 100)
	    private String columnId;

	    @Column(name = "RESIDUAL_MATURITY", length = 50)
	    private String residualMaturity;

	    @Column(name = "PRINCIPAL_AMOUNT", precision = 24, scale = 3)
	    private BigDecimal principalAmount;

	    @Column(name = "TOTAL_CURRENT_REPLACEMENT_COST_POSTIVE_VALUES", precision = 24, scale = 3)
	    private BigDecimal totalCurrentReplacementCostPostiveValues;

	    @Column(name = "POTENTIAL_FUTURE_CREDIT_EXPOSURE_ADDON_FACTORS", precision = 5, scale = 2)
	    private BigDecimal potentialFutureCreditExposureAddonFactors;

	    @Column(name = "POTENTIAL_FUTURE_CREDIT_EXPOSURE_AMOUNT", precision = 24, scale = 3)
	    private BigDecimal potentialFutureCreditExposureAmount;

	    @Column(name = "CREDIT_EQUIVALENT_AMOUNT", precision = 24, scale = 3)
	    private BigDecimal creditEquivalentAmount;

	    @Column(name = "APPLICABLE_COUNTERPARTY_RISK_WEIGHT", precision = 5, scale = 2)
	    private BigDecimal applicableCounterpartyRiskWeight;

	    @Column(name = "RISK_WEIGHTED_ASSET", precision = 24, scale = 3)
	    private BigDecimal riskWeightedAsset;

	    @Column(name = "REPORT_REMARKS", length = 100)
	    private String reportRemarks;

	    @Column(name = "ACCT_BALANCE_IN_PULA", precision = 24, scale = 3)
	    private BigDecimal acctBalanceInPula;

	    @Column(name = "REPORT_DATE")
	    private LocalDate reportDate;

	    @Column(name = "REPORT_NAME", length = 100)
	    private String reportName;

	    @Column(name = "CREATE_USER", length = 50)
	    private String createUser;

	    @Column(name = "CREATE_TIME")
	    private LocalDate createTime;

	    @Column(name = "MODIFY_USER", length = 50)
	    private String modifyUser;

	    @Column(name = "MODIFY_TIME")
	    private LocalDate modifyTime;

	    @Column(name = "VERIFY_USER", length = 50)
	    private String verifyUser;

	    @Column(name = "VERIFY_TIME")
	    private LocalDate verifyTime;

	    @Column(name = "ENTITY_FLG", length = 1)
	    private String entityFlg;

	    @Column(name = "MODIFY_FLG", length = 1)
	    private String modifyFlg;

	    @Column(name = "DEL_FLG", length = 1)
	    private String delFlg;

		public String getCustId() {
			return custId;
		}

		public void setCustId(String custId) {
			this.custId = custId;
		}

		public String getAcctNumber() {
			return acctNumber;
		}

		public void setAcctNumber(String acctNumber) {
			this.acctNumber = acctNumber;
		}

		public String getAcctName() {
			return acctName;
		}

		public void setAcctName(String acctName) {
			this.acctName = acctName;
		}

		public String getDataType() {
			return dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getRowId() {
			return rowId;
		}

		public void setRowId(String rowId) {
			this.rowId = rowId;
		}

		public String getColumnId() {
			return columnId;
		}

		public void setColumnId(String columnId) {
			this.columnId = columnId;
		}

		public String getResidualMaturity() {
			return residualMaturity;
		}

		public void setResidualMaturity(String residualMaturity) {
			this.residualMaturity = residualMaturity;
		}

		public BigDecimal getPrincipalAmount() {
			return principalAmount;
		}

		public void setPrincipalAmount(BigDecimal principalAmount) {
			this.principalAmount = principalAmount;
		}

		public BigDecimal getTotalCurrentReplacementCostPostiveValues() {
			return totalCurrentReplacementCostPostiveValues;
		}

		public void setTotalCurrentReplacementCostPostiveValues(BigDecimal totalCurrentReplacementCostPostiveValues) {
			this.totalCurrentReplacementCostPostiveValues = totalCurrentReplacementCostPostiveValues;
		}

		public BigDecimal getPotentialFutureCreditExposureAddonFactors() {
			return potentialFutureCreditExposureAddonFactors;
		}

		public void setPotentialFutureCreditExposureAddonFactors(BigDecimal potentialFutureCreditExposureAddonFactors) {
			this.potentialFutureCreditExposureAddonFactors = potentialFutureCreditExposureAddonFactors;
		}

		public BigDecimal getPotentialFutureCreditExposureAmount() {
			return potentialFutureCreditExposureAmount;
		}

		public void setPotentialFutureCreditExposureAmount(BigDecimal potentialFutureCreditExposureAmount) {
			this.potentialFutureCreditExposureAmount = potentialFutureCreditExposureAmount;
		}

		public BigDecimal getCreditEquivalentAmount() {
			return creditEquivalentAmount;
		}

		public void setCreditEquivalentAmount(BigDecimal creditEquivalentAmount) {
			this.creditEquivalentAmount = creditEquivalentAmount;
		}

		public BigDecimal getApplicableCounterpartyRiskWeight() {
			return applicableCounterpartyRiskWeight;
		}

		public void setApplicableCounterpartyRiskWeight(BigDecimal applicableCounterpartyRiskWeight) {
			this.applicableCounterpartyRiskWeight = applicableCounterpartyRiskWeight;
		}

		public BigDecimal getRiskWeightedAsset() {
			return riskWeightedAsset;
		}

		public void setRiskWeightedAsset(BigDecimal riskWeightedAsset) {
			this.riskWeightedAsset = riskWeightedAsset;
		}

		public String getReportRemarks() {
			return reportRemarks;
		}

		public void setReportRemarks(String reportRemarks) {
			this.reportRemarks = reportRemarks;
		}

		public BigDecimal getAcctBalanceInPula() {
			return acctBalanceInPula;
		}

		public void setAcctBalanceInPula(BigDecimal acctBalanceInPula) {
			this.acctBalanceInPula = acctBalanceInPula;
		}

		public LocalDate getReportDate() {
			return reportDate;
		}

		public void setReportDate(LocalDate reportDate) {
			this.reportDate = reportDate;
		}

		public String getReportName() {
			return reportName;
		}

		public void setReportName(String reportName) {
			this.reportName = reportName;
		}

		public String getCreateUser() {
			return createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public LocalDate getCreateTime() {
			return createTime;
		}

		public void setCreateTime(LocalDate createTime) {
			this.createTime = createTime;
		}

		public String getModifyUser() {
			return modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public LocalDate getModifyTime() {
			return modifyTime;
		}

		public void setModifyTime(LocalDate modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getVerifyUser() {
			return verifyUser;
		}

		public void setVerifyUser(String verifyUser) {
			this.verifyUser = verifyUser;
		}

		public LocalDate getVerifyTime() {
			return verifyTime;
		}

		public void setVerifyTime(LocalDate verifyTime) {
			this.verifyTime = verifyTime;
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

		public M_SRWA_12D_DETAIL_ENTITY() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	

}
