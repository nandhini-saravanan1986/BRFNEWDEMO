package com.bornfire.xbrl.recon.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "Data")
@XmlType(propOrder = { "returnColumnName", "tableName", "fieldNames", "row", "numOfRows", "params"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

	
	 private String returnColumnName;
	    private String tableName;
	    private String fieldNames;
	    private List<Row> row;
	    private String numOfRows;
	    private List<Params> params;
	    
	    
	    
		public String getReturnColumnName() {
			return returnColumnName;
		}
		public String getTableName() {
			return tableName;
		}
		public String getFieldNames() {
			return fieldNames;
		}
		
		public String getNumOfRows() {
			return numOfRows;
		}
		
		@XmlElement(name="ReturnColumnName")
		public void setReturnColumnName(String returnColumnName) {
			this.returnColumnName = returnColumnName;
		}
	
		@XmlElement(name="TableName")
		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
		
		@XmlElement(name="FieldNames")
		public void setFieldNames(String fieldNames) {
			this.fieldNames = fieldNames;
		}
		
		
		
		@XmlElement(name="NumOfRows")
		public void setNumOfRows(String numOfRows) {
			this.numOfRows = numOfRows;
		}
		public List<Row> getRow() {
			return row;
		}
		public List<Params> getParams() {
			return params;
		}
		@XmlElement(name="Row")
		public void setRow(List<Row> row) {
			this.row = row;
		}
		@XmlElement(name="Params")
		public void setParams(List<Params> params) {
			this.params = params;
		}
		@Override
		public String toString() {
			return "Data [returnColumnName=" + returnColumnName + ", tableName=" + tableName + ", fieldNames="
					+ fieldNames + ", row=" + row + ", numOfRows=" + numOfRows + ", params=" + params
					+ ", getReturnColumnName()=" + getReturnColumnName() + ", getTableName()=" + getTableName()
					+ ", getFieldNames()=" + getFieldNames() + ", getNumOfRows()=" + getNumOfRows() + ", getRow()="
					+ getRow() + ", getParams()=" + getParams() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		public Data(String returnColumnName, String tableName, String fieldNames, List<Row> row, String numOfRows,
				List<Params> params) {
			super();
			this.returnColumnName = returnColumnName;
			this.tableName = tableName;
			this.fieldNames = fieldNames;
			this.row = row;
			this.numOfRows = numOfRows;
			this.params = params;
		}
		public Data() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
	    
	    
	    
	    
}
