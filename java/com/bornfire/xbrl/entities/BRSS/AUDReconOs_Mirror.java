package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="INTAUD_RECON_OS_DATA_MIRROR")
public class AUDReconOs_Mirror {
	
	
	private String report_date;
	private String statement_mirror;
	private String	ktp_seq_num;
	private String	age_repdate_capdate;
	private String	poste_mirror;
	private String	ktp_acc_code;
	
	private String	entry_capture_date;
	private String	entry_trade_date;
	private String	entry_value_date;
	private BigDecimal	tran_amt;
	private String	amt_sign;
	private String	poste_1_mirror;
	private String	cpty_mirror;
	private String	deal_number;
	private String	kplus;
	private String	reference_stmt;
	private String	sol_insy_stmt;
	private String	report_confirm;
	private String	reference_method;
	@Id
	private BigDecimal	srl_num;
	private String	matching_criteria;
	private String	matching_details;
	private String	reconsilation_type;
	private String	reconsile_flg;
	private Date	up_date;
	private Date	reconsilation_date;
	private String ref_details;
	private String bank_code;
	
	
	
	public String getStatement_mirror() {
		return statement_mirror;
	}
	public String getKtp_seq_num() {
		return ktp_seq_num;
	}
	public String getAge_repdate_capdate() {
		return age_repdate_capdate;
	}
	public String getPoste_mirror() {
		return poste_mirror;
	}
	public String getKtp_acc_code() {
		return ktp_acc_code;
	}

	public BigDecimal getTran_amt() {
		return tran_amt;
	}
	public String getAmt_sign() {
		return amt_sign;
	}
	public String getPoste_1_mirror() {
		return poste_1_mirror;
	}
	public String getCpty_mirror() {
		return cpty_mirror;
	}
	public String getDeal_number() {
		return deal_number;
	}
	public String getKplus() {
		return kplus;
	}
	public String getReference_stmt() {
		return reference_stmt;
	}
	public String getSol_insy_stmt() {
		return sol_insy_stmt;
	}
	public String getReport_confirm() {
		return report_confirm;
	}
	public String getReference_method() {
		return reference_method;
	}
	public BigDecimal getSrl_num() {
		return srl_num;
	}
	public String getMatching_criteria() {
		return matching_criteria;
	}
	public String getMatching_details() {
		return matching_details;
	}
	public String getReconsilation_type() {
		return reconsilation_type;
	}
	public String getReconsile_flg() {
		return reconsile_flg;
	}
	public Date getUp_date() {
		return up_date;
	}
	public Date getReconsilation_date() {
		return reconsilation_date;
	}
	public String getRef_details() {
		return ref_details;
	}
	public String getBank_code() {
		return bank_code;
	}
	
	public void setStatement_mirror(String statement_mirror) {
		this.statement_mirror = statement_mirror;
	}
	public void setKtp_seq_num(String ktp_seq_num) {
		this.ktp_seq_num = ktp_seq_num;
	}
	public void setAge_repdate_capdate(String age_repdate_capdate) {
		this.age_repdate_capdate = age_repdate_capdate;
	}
	public void setPoste_mirror(String poste_mirror) {
		this.poste_mirror = poste_mirror;
	}
	public void setKtp_acc_code(String ktp_acc_code) {
		this.ktp_acc_code = ktp_acc_code;
	}
	
	public void setTran_amt(BigDecimal tran_amt) {
		this.tran_amt = tran_amt;
	}
	public void setAmt_sign(String amt_sign) {
		this.amt_sign = amt_sign;
	}
	public void setPoste_1_mirror(String poste_1_mirror) {
		this.poste_1_mirror = poste_1_mirror;
	}
	public void setCpty_mirror(String cpty_mirror) {
		this.cpty_mirror = cpty_mirror;
	}
	public void setDeal_number(String deal_number) {
		this.deal_number = deal_number;
	}
	public void setKplus(String kplus) {
		this.kplus = kplus;
	}
	public void setReference_stmt(String reference_stmt) {
		this.reference_stmt = reference_stmt;
	}
	public void setSol_insy_stmt(String sol_insy_stmt) {
		this.sol_insy_stmt = sol_insy_stmt;
	}
	public void setReport_confirm(String report_confirm) {
		this.report_confirm = report_confirm;
	}
	public void setReference_method(String reference_method) {
		this.reference_method = reference_method;
	}
	public void setSrl_num(BigDecimal srl_num) {
		this.srl_num = srl_num;
	}
	public void setMatching_criteria(String matching_criteria) {
		this.matching_criteria = matching_criteria;
	}
	public void setMatching_details(String matching_details) {
		this.matching_details = matching_details;
	}
	public void setReconsilation_type(String reconsilation_type) {
		this.reconsilation_type = reconsilation_type;
	}
	public void setReconsile_flg(String reconsile_flg) {
		this.reconsile_flg = reconsile_flg;
	}
	public void setUp_date(Date up_date) {
		this.up_date = up_date;
	}
	public void setReconsilation_date(Date reconsilation_date) {
		this.reconsilation_date = reconsilation_date;
	}
	public void setRef_details(String ref_details) {
		this.ref_details = ref_details;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}
	
	
	
	
	
	
	public String getReport_date() {
		return report_date;
	}
	public String getEntry_capture_date() {
		return entry_capture_date;
	}
	public String getEntry_trade_date() {
		return entry_trade_date;
	}
	public String getEntry_value_date() {
		return entry_value_date;
	}
	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}
	public void setEntry_capture_date(String entry_capture_date) {
		this.entry_capture_date = entry_capture_date;
	}
	public void setEntry_trade_date(String entry_trade_date) {
		this.entry_trade_date = entry_trade_date;
	}
	public void setEntry_value_date(String entry_value_date) {
		this.entry_value_date = entry_value_date;
	}
	public AUDReconOs_Mirror() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
