package com.bornfire.xbrl.recon.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "GetEntries")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEntries {
	
	private String operday;
    private String operday2;
    private String intAccCode;
    private String startDate;
    private String endDate;
    private String qa;
    private String extra;
    
    
    
	public String getOperday() {
		return operday;
	}
	public String getOperday2() {
		return operday2;
	}
	public String getIntAccCode() {
		return intAccCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getQa() {
		return qa;
	}
	public String getExtra() {
		return extra;
	}
	
	@XmlElement(name="Operday")
	public void setOperday(String operday) {
		this.operday = operday;
	}
	
	@XmlElement(name="Operday2")
	public void setOperday2(String operday2) {
		this.operday2 = operday2;
	}
	
	@XmlElement(name="IntAccCode")
	public void setIntAccCode(String intAccCode) {
		this.intAccCode = intAccCode;
	}
	
	@XmlElement(name="StartDate")
   public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	@XmlElement(name="EndDate")
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@XmlElement(name="QA")
    public void setQa(String qa) {
		this.qa = qa;
	}
	
	@XmlElement(name="Extra")
	public void setExtra(String extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "GetEntries [operday=" + operday + ", operday2=" + operday2 + ", intAccCode=" + intAccCode
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", qa=" + qa + ", extra=" + extra + "]";
	}
	public GetEntries(String operday, String operday2, String intAccCode, String startDate, String endDate, String qa,
			String extra) {
		super();
		this.operday = operday;
		this.operday2 = operday2;
		this.intAccCode = intAccCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.qa = qa;
		this.extra = extra;
	}
	public GetEntries() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
