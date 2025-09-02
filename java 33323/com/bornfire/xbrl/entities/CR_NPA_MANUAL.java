package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CR_NPA_DETAIL_TABLE")
public class CR_NPA_MANUAL {
	@EmbeddedId
	CR_NPA_MAUAL_ID cr_NPA_MAUAL_ID;
	private String	BRANCH;
	
	private String	CUST_ID;
	private Date	DATE_CLASSIFIED_NPA;
	private String	ACCT_NAME;
	private String	ASSET_CAREGORY;
	private String	SECTOR_VALUE;
	private BigDecimal	BALANCE_LC;
	private BigDecimal	PROVISION_LC;
	
	private String	MODIFY_USER;
	private String	ENTITY_FLG;
	private String	PRODUCT_TYPE;
	public CR_NPA_MAUAL_ID getCr_NPA_MAUAL_ID() {
		return cr_NPA_MAUAL_ID;
	}
	public void setCr_NPA_MAUAL_ID(CR_NPA_MAUAL_ID cr_NPA_MAUAL_ID) {
		this.cr_NPA_MAUAL_ID = cr_NPA_MAUAL_ID;
	}
	public String getBRANCH() {
		return BRANCH;
	}
	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public Date getDATE_CLASSIFIED_NPA() {
		return DATE_CLASSIFIED_NPA;
	}
	public void setDATE_CLASSIFIED_NPA(Date dATE_CLASSIFIED_NPA) {
		DATE_CLASSIFIED_NPA = dATE_CLASSIFIED_NPA;
	}
	public String getACCT_NAME() {
		return ACCT_NAME;
	}
	public void setACCT_NAME(String aCCT_NAME) {
		ACCT_NAME = aCCT_NAME;
	}
	public String getASSET_CAREGORY() {
		return ASSET_CAREGORY;
	}
	public void setASSET_CAREGORY(String aSSET_CAREGORY) {
		ASSET_CAREGORY = aSSET_CAREGORY;
	}
	public String getSECTOR_VALUE() {
		return SECTOR_VALUE;
	}
	public void setSECTOR_VALUE(String sECTOR_VALUE) {
		SECTOR_VALUE = sECTOR_VALUE;
	}
	public BigDecimal getBALANCE_LC() {
		return BALANCE_LC;
	}
	public void setBALANCE_LC(BigDecimal bALANCE_LC) {
		BALANCE_LC = bALANCE_LC;
	}
	public BigDecimal getPROVISION_LC() {
		return PROVISION_LC;
	}
	public void setPROVISION_LC(BigDecimal pROVISION_LC) {
		PROVISION_LC = pROVISION_LC;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}
	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}
	public String getPRODUCT_TYPE() {
		return PRODUCT_TYPE;
	}
	public void setPRODUCT_TYPE(String pRODUCT_TYPE) {
		PRODUCT_TYPE = pRODUCT_TYPE;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ACCT_NAME == null) ? 0 : ACCT_NAME.hashCode());
		result = prime * result + ((ASSET_CAREGORY == null) ? 0 : ASSET_CAREGORY.hashCode());
		result = prime * result + ((BALANCE_LC == null) ? 0 : BALANCE_LC.hashCode());
		result = prime * result + ((BRANCH == null) ? 0 : BRANCH.hashCode());
		result = prime * result + ((CUST_ID == null) ? 0 : CUST_ID.hashCode());
		result = prime * result + ((DATE_CLASSIFIED_NPA == null) ? 0 : DATE_CLASSIFIED_NPA.hashCode());
		result = prime * result + ((ENTITY_FLG == null) ? 0 : ENTITY_FLG.hashCode());
		result = prime * result + ((MODIFY_USER == null) ? 0 : MODIFY_USER.hashCode());
		result = prime * result + ((PRODUCT_TYPE == null) ? 0 : PRODUCT_TYPE.hashCode());
		result = prime * result + ((PROVISION_LC == null) ? 0 : PROVISION_LC.hashCode());
		result = prime * result + ((SECTOR_VALUE == null) ? 0 : SECTOR_VALUE.hashCode());
		result = prime * result + ((cr_NPA_MAUAL_ID == null) ? 0 : cr_NPA_MAUAL_ID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CR_NPA_MANUAL other = (CR_NPA_MANUAL) obj;
		if (ACCT_NAME == null) {
			if (other.ACCT_NAME != null)
				return false;
		} else if (!ACCT_NAME.equals(other.ACCT_NAME))
			return false;
		if (ASSET_CAREGORY == null) {
			if (other.ASSET_CAREGORY != null)
				return false;
		} else if (!ASSET_CAREGORY.equals(other.ASSET_CAREGORY))
			return false;
		if (BALANCE_LC == null) {
			if (other.BALANCE_LC != null)
				return false;
		} else if (!BALANCE_LC.equals(other.BALANCE_LC))
			return false;
		if (BRANCH == null) {
			if (other.BRANCH != null)
				return false;
		} else if (!BRANCH.equals(other.BRANCH))
			return false;
		if (CUST_ID == null) {
			if (other.CUST_ID != null)
				return false;
		} else if (!CUST_ID.equals(other.CUST_ID))
			return false;
		if (DATE_CLASSIFIED_NPA == null) {
			if (other.DATE_CLASSIFIED_NPA != null)
				return false;
		} else if (!DATE_CLASSIFIED_NPA.equals(other.DATE_CLASSIFIED_NPA))
			return false;
		if (ENTITY_FLG == null) {
			if (other.ENTITY_FLG != null)
				return false;
		} else if (!ENTITY_FLG.equals(other.ENTITY_FLG))
			return false;
		if (MODIFY_USER == null) {
			if (other.MODIFY_USER != null)
				return false;
		} else if (!MODIFY_USER.equals(other.MODIFY_USER))
			return false;
		if (PRODUCT_TYPE == null) {
			if (other.PRODUCT_TYPE != null)
				return false;
		} else if (!PRODUCT_TYPE.equals(other.PRODUCT_TYPE))
			return false;
		if (PROVISION_LC == null) {
			if (other.PROVISION_LC != null)
				return false;
		} else if (!PROVISION_LC.equals(other.PROVISION_LC))
			return false;
		if (SECTOR_VALUE == null) {
			if (other.SECTOR_VALUE != null)
				return false;
		} else if (!SECTOR_VALUE.equals(other.SECTOR_VALUE))
			return false;
		if (cr_NPA_MAUAL_ID == null) {
			if (other.cr_NPA_MAUAL_ID != null)
				return false;
		} else if (!cr_NPA_MAUAL_ID.equals(other.cr_NPA_MAUAL_ID))
			return false;
		return true;
	}
	public CR_NPA_MANUAL(CR_NPA_MAUAL_ID cr_NPA_MAUAL_ID, String bRANCH, String cUST_ID, Date dATE_CLASSIFIED_NPA,
			String aCCT_NAME, String aSSET_CAREGORY, String sECTOR_VALUE, BigDecimal bALANCE_LC,
			BigDecimal pROVISION_LC, String mODIFY_USER, String eNTITY_FLG, String pRODUCT_TYPE) {
		super();
		this.cr_NPA_MAUAL_ID = cr_NPA_MAUAL_ID;
		BRANCH = bRANCH;
		CUST_ID = cUST_ID;
		DATE_CLASSIFIED_NPA = dATE_CLASSIFIED_NPA;
		ACCT_NAME = aCCT_NAME;
		ASSET_CAREGORY = aSSET_CAREGORY;
		SECTOR_VALUE = sECTOR_VALUE;
		BALANCE_LC = bALANCE_LC;
		PROVISION_LC = pROVISION_LC;
		MODIFY_USER = mODIFY_USER;
		ENTITY_FLG = eNTITY_FLG;
		PRODUCT_TYPE = pRODUCT_TYPE;
	}
	public CR_NPA_MANUAL() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
