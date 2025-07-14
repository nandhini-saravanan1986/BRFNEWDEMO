package com.bornfire.xbrl.recon.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PIEMsg")
public class PieMsg {
	
	private Data data;
	private String marker;
	
	public Data getData() {
		return data;
	}
	public String getMarker() {
		return marker;
	}
	
	@XmlElement(name="Data")
	public void setData(Data data) {
		this.data = data;
	}
	@XmlElement(name="marker")
	public void setMarker(String marker) {
		this.marker = marker;
	}
	
	
	

}
