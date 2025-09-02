package com.bornfire.xbrl.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ArchDates implements Comparable{
	
	String report_date;
	String from_date;
	String to_date;
	String	report_time;
	
	public String getReport_time() {
		return report_time;
	}
	public void setReport_time(String report_time) {
		this.report_time = report_time;
	}
	public String getReport_date() {
		return report_date;
	}
	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public ArchDates(String report_date, String from_date, String to_date) {
		super();
		this.report_date = report_date;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	public int compare(Object o1,Object o2) {
		ArchDates a1 = (ArchDates)o1;
		ArchDates a2 = (ArchDates)o2;
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			if(df.parse(a1.report_date).before(df.parse(a2.report_date))) {
				return -1;
			}else {
				return 1;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	@Override
	public int compareTo(Object o) {
		
		
		ArchDates a2 = (ArchDates)o;
		
SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			if(df.parse(this.report_date).before(df.parse(a2.report_date))) {
				return 1;
			}else {
				return -1;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	
}
