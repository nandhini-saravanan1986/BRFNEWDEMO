package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="CR_NON_FUND_BASED_MANUAL")
public class CR_NON_FUNDED_MANUAL_ENTITY {
	@EmbeddedId
	CR_NON_FUND_MANUAL_ID cr_NON_FUND_MANUAL_ID;
	private String	BRANCH;
	private String	CBSCUSTOMERID;
	private String	CUSTOMERNAME;
	
	private String	DESCRIPTION;
	private String	ASSETDESC;
	private String	NATURE_ASSET_DESC;
	private BigDecimal	AMT_IN_INR;
	private BigDecimal	AMT_IN_USD;
	private BigDecimal	AMT_IN_MUR;
	
	private String	SECURITY_DESCRIPTION;

	public CR_NON_FUND_MANUAL_ID getCr_NON_FUND_MANUAL_ID() {
		return cr_NON_FUND_MANUAL_ID;
	}

	public void setCr_NON_FUND_MANUAL_ID(CR_NON_FUND_MANUAL_ID cr_NON_FUND_MANUAL_ID) {
		this.cr_NON_FUND_MANUAL_ID = cr_NON_FUND_MANUAL_ID;
	}

	public String getBRANCH() {
		return BRANCH;
	}

	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}

	public String getCBSCUSTOMERID() {
		return CBSCUSTOMERID;
	}

	public void setCBSCUSTOMERID(String cBSCUSTOMERID) {
		CBSCUSTOMERID = cBSCUSTOMERID;
	}

	public String getCUSTOMERNAME() {
		return CUSTOMERNAME;
	}

	public void setCUSTOMERNAME(String cUSTOMERNAME) {
		CUSTOMERNAME = cUSTOMERNAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getASSETDESC() {
		return ASSETDESC;
	}

	public void setASSETDESC(String aSSETDESC) {
		ASSETDESC = aSSETDESC;
	}

	public String getNATURE_ASSET_DESC() {
		return NATURE_ASSET_DESC;
	}

	public void setNATURE_ASSET_DESC(String nATURE_ASSET_DESC) {
		NATURE_ASSET_DESC = nATURE_ASSET_DESC;
	}

	public BigDecimal getAMT_IN_INR() {
		return AMT_IN_INR;
	}

	public void setAMT_IN_INR(BigDecimal aMT_IN_INR) {
		AMT_IN_INR = aMT_IN_INR;
	}

	public BigDecimal getAMT_IN_USD() {
		return AMT_IN_USD;
	}

	public void setAMT_IN_USD(BigDecimal aMT_IN_USD) {
		AMT_IN_USD = aMT_IN_USD;
	}

	public BigDecimal getAMT_IN_MUR() {
		return AMT_IN_MUR;
	}

	public void setAMT_IN_MUR(BigDecimal aMT_IN_MUR) {
		AMT_IN_MUR = aMT_IN_MUR;
	}

	public String getSECURITY_DESCRIPTION() {
		return SECURITY_DESCRIPTION;
	}

	public void setSECURITY_DESCRIPTION(String sECURITY_DESCRIPTION) {
		SECURITY_DESCRIPTION = sECURITY_DESCRIPTION;
	}

	public CR_NON_FUNDED_MANUAL_ENTITY(CR_NON_FUND_MANUAL_ID cr_NON_FUND_MANUAL_ID, String bRANCH, String cBSCUSTOMERID,
			String cUSTOMERNAME, String dESCRIPTION, String aSSETDESC, String nATURE_ASSET_DESC, BigDecimal aMT_IN_INR,
			BigDecimal aMT_IN_USD, BigDecimal aMT_IN_MUR, String sECURITY_DESCRIPTION) {
		super();
		this.cr_NON_FUND_MANUAL_ID = cr_NON_FUND_MANUAL_ID;
		BRANCH = bRANCH;
		CBSCUSTOMERID = cBSCUSTOMERID;
		CUSTOMERNAME = cUSTOMERNAME;
		DESCRIPTION = dESCRIPTION;
		ASSETDESC = aSSETDESC;
		NATURE_ASSET_DESC = nATURE_ASSET_DESC;
		AMT_IN_INR = aMT_IN_INR;
		AMT_IN_USD = aMT_IN_USD;
		AMT_IN_MUR = aMT_IN_MUR;
		SECURITY_DESCRIPTION = sECURITY_DESCRIPTION;
	}

	public CR_NON_FUNDED_MANUAL_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
