package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "BRRS_M_LIQGAP_DETAILTABLE")
public class M_LIQGAP_Detail_Entity {
	
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
    
    @Column(name = "MODIFICATION_REMARKS")
    private String modificationRemarks;

    @Column(name = "DATA_ENTRY_VERSION")
    private String dataEntryVersion;
    
    @Column(name = "FIRST_MONTH", precision = 24, scale = 2)
    private BigDecimal firstMonth;

    @Column(name = "THIRD_MONTH", precision = 24, scale = 2)
    private BigDecimal thirdMonth;

    @Column(name = "LAST_MONTH", precision = 24, scale = 2)
    private BigDecimal lastMonth;

    @Column(name = "FIRST_YEAR", precision = 24, scale = 2)
    private BigDecimal firstYear;

    @Column(name = "FIFTH_YEAR", precision = 24, scale = 2)
    private BigDecimal fifthYear;

    @Column(name = "NON_INTEREST_BEARING", precision = 24, scale = 2)
    private BigDecimal nonInterestBearing;
    
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

	public BigDecimal getFirstMonth() {
		return firstMonth;
	}

	public void setFirstMonth(BigDecimal firstMonth) {
		this.firstMonth = firstMonth;
	}

	public BigDecimal getThirdMonth() {
		return thirdMonth;
	}

	public void setThirdMonth(BigDecimal thirdMonth) {
		this.thirdMonth = thirdMonth;
	}

	public BigDecimal getLastMonth() {
		return lastMonth;
	}

	public void setLastMonth(BigDecimal lastMonth) {
		this.lastMonth = lastMonth;
	}

	public BigDecimal getFirstYear() {
		return firstYear;
	}

	public void setFirstYear(BigDecimal firstYear) {
		this.firstYear = firstYear;
	}

	public BigDecimal getFifthYear() {
		return fifthYear;
	}

	public void setFifthYear(BigDecimal fifthYear) {
		this.fifthYear = fifthYear;
	}

	public BigDecimal getNonInterestBearing() {
		return nonInterestBearing;
	}

	public void setNonInterestBearing(BigDecimal nonInterestBearing) {
		this.nonInterestBearing = nonInterestBearing;
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

	public M_LIQGAP_Detail_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   
	
}
