package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOM_REPORT_QUEUE_TABLE")
public class CustomRepDownloadEntity {
	@Id
	private String	rpt_srl_no;
	private String	rpt_id;
	private String	rpt_name;
	private String	user_id;
	private String	user_name;
	private Date	rpt_gen_time;
	private String	file_location;
	private Character	del_on_download;
	private Character	download_flg;
	private Date	last_download_time;
	private String	download_userid;
	private BigDecimal	no_of_download;
	private String	remarks;

	public String getRpt_srl_no() {
		return rpt_srl_no;
	}
	public void setRpt_srl_no(String rpt_srl_no) {
		this.rpt_srl_no = rpt_srl_no;
	}
	public String getRpt_id() {
		return rpt_id;
	}
	public void setRpt_id(String rpt_id) {
		this.rpt_id = rpt_id;
	}
	public String getRpt_name() {
		return rpt_name;
	}
	public void setRpt_name(String rpt_name) {
		this.rpt_name = rpt_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Date getRpt_gen_time() {
		return rpt_gen_time;
	}
	public void setRpt_gen_time(Date rpt_gen_time) {
		this.rpt_gen_time = rpt_gen_time;
	}
	public String getFile_location() {
		return file_location;
	}
	public void setFile_location(String file_location) {
		this.file_location = file_location;
	}
	public Character getDel_on_download() {
		return del_on_download;
	}
	public void setDel_on_download(Character del_on_download) {
		this.del_on_download = del_on_download;
	}
	public Character getDownload_flg() {
		return download_flg;
	}
	public void setDownload_flg(Character download_flg) {
		this.download_flg = download_flg;
	}
	public Date getLast_download_time() {
		return last_download_time;
	}
	public void setLast_download_time(Date last_download_time) {
		this.last_download_time = last_download_time;
	}
	public String getDownload_userid() {
		return download_userid;
	}
	public void setDownload_userid(String download_userid) {
		this.download_userid = download_userid;
	}
	public BigDecimal getNo_of_download() {
		return no_of_download;
	}
	public void setNo_of_download(BigDecimal no_of_download) {
		this.no_of_download = no_of_download;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	public CustomRepDownloadEntity(String rpt_srl_no, String rpt_id, String rpt_name, String user_id, String user_name,
			Date rpt_gen_time, String file_location, Character del_on_download, Character download_flg,
			Date last_download_time, String download_userid, BigDecimal no_of_download, String remarks) {
		super();
		this.rpt_srl_no = rpt_srl_no;
		this.rpt_id = rpt_id;
		this.rpt_name = rpt_name;
		this.user_id = user_id;
		this.user_name = user_name;
		this.rpt_gen_time = rpt_gen_time;
		this.file_location = file_location;
		this.del_on_download = del_on_download;
		this.download_flg = download_flg;
		this.last_download_time = last_download_time;
		this.download_userid = download_userid;
		this.no_of_download = no_of_download;
		this.remarks = remarks;
		
	}
	public CustomRepDownloadEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
