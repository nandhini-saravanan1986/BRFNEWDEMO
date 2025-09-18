package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "BRRS_M_OR1_DETAILTABLE")
public class M_OR1_Detail_Entity {
	
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

    @Column(name = "YEAR", precision = 4)
    private Integer year;

    @Column(name = "MONTH", length = 10)
    private String month;
    
    @Column(name = "MODIFICATION_REMARKS")
    private String modificationRemarks;

    @Column(name = "DATA_ENTRY_VERSION")
    private String dataEntryVersion;

    @Column(name = "GROSS_INCOME", precision = 24, scale = 3)
    private BigDecimal grossIncome;

    @Column(name = "AGGREGATE_GROSS_INCOME", precision = 24, scale = 3)
    private BigDecimal aggregateGrossIncome;

    @Column(name = "RISK_WEIGHT_FACTOR", precision = 5, scale = 2)
    private BigDecimal riskWeightFactor;

    @Column(name = "RISK_WEIGHTED_ASSET", precision = 5, scale = 2)
    private BigDecimal riskWeightedAsset;

    @Column(name = "REPORT_REMARKS", length = 100)
    private String reportRemarks;

    @Column(name = "ACCT_BALANCE_IN_PULA", precision = 24, scale = 3)
    private BigDecimal acctBalanceInPula;
    
    @Column(name = "REPORT_DATE")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date reportDate;

    @Column(name = "REPORT_NAME", length = 100)
    private String reportName;

    @Column(name = "CREATE_USER", length = 50)
    private String createUser;

    @Column(name = "CREATE_TIME")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createTime;

    @Column(name = "MODIFY_USER", length = 50)
    private String modifyUser;

    @Column(name = "MODIFY_TIME")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date modifyTime;

    @Column(name = "VERIFY_USER", length = 50)
    private String verifyUser;

    @Column(name = "VERIFY_TIME")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date verifyTime;

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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getModificationRemarks() {
		return modificationRemarks;
	}

	public void setModificationRemarks(String modificationRemarks) {
		this.modificationRemarks = modificationRemarks;
	}

	public String getDataEntryVersion() {
		return dataEntryVersion;
	}

	public void setDataEntryVersion(String dataEntryVersion) {
		this.dataEntryVersion = dataEntryVersion;
	}

	public BigDecimal getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(BigDecimal grossIncome) {
		this.grossIncome = grossIncome;
	}

	public BigDecimal getAggregateGrossIncome() {
		return aggregateGrossIncome;
	}

	public void setAggregateGrossIncome(BigDecimal aggregateGrossIncome) {
		this.aggregateGrossIncome = aggregateGrossIncome;
	}

	public BigDecimal getRiskWeightFactor() {
		return riskWeightFactor;
	}

	public void setRiskWeightFactor(BigDecimal riskWeightFactor) {
		this.riskWeightFactor = riskWeightFactor;
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

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getVerifyUser() {
		return verifyUser;
	}

	public void setVerifyUser(String verifyUser) {
		this.verifyUser = verifyUser;
	}

	public Date getVerifyTime() {
		return verifyTime;
	}

	public void setVerifyTime(Date verifyTime) {
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

	public M_OR1_Detail_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	


    


   
}
