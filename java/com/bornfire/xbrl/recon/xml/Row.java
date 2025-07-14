package com.bornfire.xbrl.recon.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "Row")
@XmlType(propOrder = { "trn", "counterpartyBic", "counterpartyAcc", "amountSort", "amount", "operday", "docType",
		"dbCR", "debitOpen", "debitCurr", "creditOpen", "creditCurr", "debitReturns", "creditReturns", "relatedRef",
		"mur", "field50K", "details", "timestamp", "valueDate", "accName", "docID" })

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Row {
	private String trn;
	@XmlEnumValue(value = "CounterpartyBic")
	private String counterpartyBic;
	private String counterpartyAcc;
	private String amountSort;
	private String amount;
	private String operday;
	private String docType;
	private String dbCR;
	private String debitOpen;
	private String debitCurr;
	private String creditOpen;
	private String creditCurr;
	private String debitReturns;
	private String creditReturns;
	private String relatedRef;
	private String mur;
	private String field50K;
	private String details;
	private String timestamp;
	private String valueDate;
	private String accName;
	private String docID;

	public String getTrn() {
		return trn;
	}

	

	public String getCounterpartyAcc() {
		return counterpartyAcc;
	}

	public String getAmountSort() {
		return amountSort;
	}

	public String getAmount() {
		return amount;
	}

	

	public String getDebitOpen() {
		return debitOpen;
	}

	public String getDebitCurr() {
		return debitCurr;
	}

	

	public String getMur() {
		return mur;
	}

	public String getField50K() {
		return field50K;
	}

	public String getDetails() {
		return details;
	}

	
	public String getDocID() {
		return docID;
	}

	@XmlElement(name = "TRN" ,required = false)
	public void setTrn(String trn) {
		this.trn = trn;
	}



	@XmlElement(name = "COUNTERPARTY_ACC" ,required = false)
	public void setCounterpartyAcc(String counterpartyAcc) {
		this.counterpartyAcc = counterpartyAcc;
	}

	@XmlElement(name = "AMOUNT_SORT" ,required = false)
	public void setAmountSort(String amountSort) {
		this.amountSort = amountSort;
	}

	@XmlElement(name = "AMOUNT" ,required = false)
	public void setAmount(String amount) {
		this.amount = amount;
	}

	

	@XmlElement(name = "DEBIT_OPEN" ,required = false)
	public void setDebitOpen(String debitOpen) {
		this.debitOpen = debitOpen;
	}

	@XmlElement(name = "DEBIT_CURR" ,required = false)
	public void setDebitCurr(String debitCurr) {
		this.debitCurr = debitCurr;
	}

	

	@XmlElement(name = "MUR" ,required = false)
	public void setMur(String mur) {
		this.mur = mur;
	}

	@XmlElement(name = "FIELD_50K" , required = false)
	public void setField50K(String field50k) {
		field50K = field50k;
	}

	@XmlElement(name = "DETAILS" ,required = false)
	public void setDetails(String details) {
		this.details = details;
	}

	

	@XmlElement(name = "DOC_ID")
	public void setDocID(String docID) {
		this.docID = docID;
	}

	

	



	public String getCounterpartyBic() {
		return counterpartyBic;
	}



	public String getOperday() {
		return operday;
	}



	public String getDocType() {
		return docType;
	}



	public String getDbCR() {
		return dbCR;
	}



	public String getCreditOpen() {
		return creditOpen;
	}



	public String getCreditCurr() {
		return creditCurr;
	}



	public String getDebitReturns() {
		return debitReturns;
	}



	public String getCreditReturns() {
		return creditReturns;
	}



	public String getRelatedRef() {
		return relatedRef;
	}



	public String getTimestamp() {
		return timestamp;
	}



	public String getValueDate() {
		return valueDate;
	}



	public String getAccName() {
		return accName;
	}


	@XmlElement(name = "COUNTERPARTY_BIC", required = false)
	public void setCounterpartyBic(String counterpartyBic) {
		this.counterpartyBic = counterpartyBic;
	}


	@XmlElement(name = "OPERDAY", required = false)
	public void setOperday(String operday) {
		this.operday = operday;
	}


	@XmlElement(name = "DOC_TYPE" , required= false)
	public void setDocType(String docType) {
		this.docType = docType;
	}


	@XmlElement(name = "DB_CR" ,required = false)
	public void setDbCR(String dbCR) {
		this.dbCR = dbCR;
	}


	@XmlElement(name = "CREDIT_OPEN" ,required = false)
	public void setCreditOpen(String creditOpen) {
		this.creditOpen = creditOpen;
	}


	@XmlElement(name = "CREDIT_CURR", required = false)
	public void setCreditCurr(String creditCurr) {
		this.creditCurr = creditCurr;
	}


	@XmlElement(name = "DEBIT_RETURNS",required = false)
	public void setDebitReturns(String debitReturns) {
		this.debitReturns = debitReturns;
	}


	@XmlElement(name = "CREDIT_RETURNS" ,required = false)
	public void setCreditReturns(String creditReturns) {
		this.creditReturns = creditReturns;
	}


	@XmlElement(name = "RELATED_REF",required = false)
	public void setRelatedRef(String relatedRef) {
		this.relatedRef = relatedRef;
	}


	@XmlElement(name = "TIMESTAMP" ,required= false)
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	@XmlElement(name = "VALUE_DATE" ,required=false)
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}


	@XmlElement(name = "ACC_NAME" ,required=false)
	public void setAccName(String accName) {
		this.accName = accName;
	}



	public Row() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Row [trn=" + trn + ", counterpartyBic=" + counterpartyBic + ", counterpartyAcc=" + counterpartyAcc
				+ ", amountSort=" + amountSort + ", amount=" + amount + ", operday=" + operday + ", docType=" + docType
				+ ", dbCR=" + dbCR + ", debitOpen=" + debitOpen + ", debitCurr=" + debitCurr + ", creditOpen="
				+ creditOpen + ", creditCurr=" + creditCurr + ", debitReturns=" + debitReturns + ", creditReturns="
				+ creditReturns + ", relatedRef=" + relatedRef + ", mur=" + mur + ", field50K=" + field50K
				+ ", details=" + details + ", timestamp=" + timestamp + ", valueDate=" + valueDate + ", accName="
				+ accName + ", docID=" + docID + ", getTrn()=" + getTrn() + ", getCounterpartyAcc()="
				+ getCounterpartyAcc() + ", getAmountSort()=" + getAmountSort() + ", getAmount()=" + getAmount()
				+ ", getDebitOpen()=" + getDebitOpen() + ", getDebitCurr()=" + getDebitCurr() + ", getMur()=" + getMur()
				+ ", getField50K()=" + getField50K() + ", getDetails()=" + getDetails() + ", getDocID()=" + getDocID()
				+ ", getCounterpartyBic()=" + getCounterpartyBic() + ", getOperday()=" + getOperday()
				+ ", getDocType()=" + getDocType() + ", getDbCR()=" + getDbCR() + ", getCreditOpen()=" + getCreditOpen()
				+ ", getCreditCurr()=" + getCreditCurr() + ", getDebitReturns()=" + getDebitReturns()
				+ ", getCreditReturns()=" + getCreditReturns() + ", getRelatedRef()=" + getRelatedRef()
				+ ", getTimestamp()=" + getTimestamp() + ", getValueDate()=" + getValueDate() + ", getAccName()="
				+ getAccName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public Row(String trn, String counterpartyBic, String counterpartyAcc, String amountSort, String amount,
			String operday, String docType, String dbCR, String debitOpen, String debitCurr, String creditOpen,
			String creditCurr, String debitReturns, String creditReturns, String relatedRef, String mur,
			String field50k, String details, String timestamp, String valueDate, String accName, String docID) {
		super();
		this.trn = trn;
		this.counterpartyBic = counterpartyBic;
		this.counterpartyAcc = counterpartyAcc;
		this.amountSort = amountSort;
		this.amount = amount;
		this.operday = operday;
		this.docType = docType;
		this.dbCR = dbCR;
		this.debitOpen = debitOpen;
		this.debitCurr = debitCurr;
		this.creditOpen = creditOpen;
		this.creditCurr = creditCurr;
		this.debitReturns = debitReturns;
		this.creditReturns = creditReturns;
		this.relatedRef = relatedRef;
		this.mur = mur;
		field50K = field50k;
		this.details = details;
		this.timestamp = timestamp;
		this.valueDate = valueDate;
		this.accName = accName;
		this.docID = docID;
	}

	
	
	
	
	
}
