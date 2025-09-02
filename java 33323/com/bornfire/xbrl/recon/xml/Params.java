package com.bornfire.xbrl.recon.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Params")
public class Params {
	
	    private String type;
	    private GetEntries getEntries;
	    private String uid;
	    private String sid;
	    private String vc;
	    private String userCode;
	    private String rowsCount;
		public String getType() {
			return type;
		}
		public GetEntries getGetEntries() {
			return getEntries;
		}
		public String getUid() {
			return uid;
		}
		public String getSid() {
			return sid;
		}
		public String getVc() {
			return vc;
		}
		public String getUserCode() {
			return userCode;
		}
		public String getRowsCount() {
			return rowsCount;
		}
		
		
		@XmlElement(name="Type")
		public void setType(String type) {
			this.type = type;
		}
		
		@XmlElement(name="GetEntries")

		public void setGetEntries(GetEntries getEntries) {
			this.getEntries = getEntries;
		}
		
		@XmlElement(name="UID")

		public void setUid(String uid) {
			this.uid = uid;
		}
		@XmlElement(name="SID")
        public void setSid(String sid) {
			this.sid = sid;
		}
		@XmlElement(name="VC")
        public void setVc(String vc) {
			this.vc = vc;
		}
		
		@XmlElement(name="UserCode")
		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}
		
		@XmlElement(name="RowsCount")

		public void setRowsCount(String rowsCount) {
			this.rowsCount = rowsCount;
		}
		
		public Params(String type, GetEntries getEntries, String uid, String sid, String vc, String userCode,
				String rowsCount) {
			super();
			this.type = type;
			this.getEntries = getEntries;
			this.uid = uid;
			this.sid = sid;
			this.vc = vc;
			this.userCode = userCode;
			this.rowsCount = rowsCount;
		}
		@Override
		public String toString() {
			return "Params [type=" + type + ", getEntries=" + getEntries + ", uid=" + uid + ", sid=" + sid + ", vc="
					+ vc + ", userCode=" + userCode + ", rowsCount=" + rowsCount + ", getType()=" + getType()
					+ ", getGetEntries()=" + getGetEntries() + ", getUid()=" + getUid() + ", getSid()=" + getSid()
					+ ", getVc()=" + getVc() + ", getUserCode()=" + getUserCode() + ", getRowsCount()=" + getRowsCount()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		public Params() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		
		
		
}
