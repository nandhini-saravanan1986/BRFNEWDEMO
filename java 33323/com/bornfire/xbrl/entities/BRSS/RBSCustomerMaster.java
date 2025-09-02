package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="CUST_MASTER_DETAIL")
public class RBSCustomerMaster {

	private String	CUST_ID;
	private String	CUSTOMER_NAME;
	private String	BRANCH_ID;
	private String	BRANCH_NAME;
	private String	BANK_ID;
	private String	OWNERSHIP_TYPE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	RELATIONSHIP_DATE;
	private String	CUST_RATING;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	CUSTOMER_RATING_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	CUSTOMER_NEXT_RATING_DATE;
	private String	MIS_FACE_TO_FACE;
	private String	MIS_NON_FACE_TO_FACE;
	private String	MIS_INTERNAL_RATING_GRADE;
	private String	MIS_INTERNAL_RATING_SCALE;
	private String	REMARKS;
	private String	DEL_FLG;
	private String	ENTITY_CRE_FLG;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	ENTITY_CRE_DATE;
	private String	MOD_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	AUTH_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	AUTH_TIME;
	private String	AML_CODE_1;
	private String	AML_CODE_2;
	private String	AML_CODE_3;
	private String	AML_CODE_4;
	private String	AML_CODE_5;
	private String	AML_CODE_6;
	private String	AML_CODE_7;
	private String	AML_CODE_8;
	private String	AML_CODE_9;
	private String	AML_CODE_10;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	private String	PROCESS_OWNER;
	private String	QTR_FLG;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	VERIFY_DATE;
	private String	VERIFY_USER;
	private String	ARCH_FLG;
	private String	CELL_MAPPING;
	private String	TRAN_CHANNEL;
	private String	ACCT_NUM;
	private String	ACT_NAME;
	private String	TRAN_TYPE;
	private String	TRAN_SUB_TYPE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	TRAN_DATE;
	private String	TRAN_ID;
	private String	PART_TRAN_ID;
	private String	PART_TRAN_TYPE;
	private String	TRAN_CRNCY;
	private BigDecimal	TRAN_AMT;
	private String	TRAN_CATEGORY;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date	CUSTOMER_DUE_RATING_DATE;
	private String	REPORT_QUARTER;
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getBRANCH_ID() {
		return BRANCH_ID;
	}
	public void setBRANCH_ID(String bRANCH_ID) {
		BRANCH_ID = bRANCH_ID;
	}
	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}
	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}
	public String getBANK_ID() {
		return BANK_ID;
	}
	public void setBANK_ID(String bANK_ID) {
		BANK_ID = bANK_ID;
	}
	public String getOWNERSHIP_TYPE() {
		return OWNERSHIP_TYPE;
	}
	public void setOWNERSHIP_TYPE(String oWNERSHIP_TYPE) {
		OWNERSHIP_TYPE = oWNERSHIP_TYPE;
	}
	public Date getRELATIONSHIP_DATE() {
		return RELATIONSHIP_DATE;
	}
	public void setRELATIONSHIP_DATE(Date rELATIONSHIP_DATE) {
		RELATIONSHIP_DATE = rELATIONSHIP_DATE;
	}
	public String getCUST_RATING() {
		return CUST_RATING;
	}
	public void setCUST_RATING(String cUST_RATING) {
		CUST_RATING = cUST_RATING;
	}
	public Date getCUSTOMER_RATING_DATE() {
		return CUSTOMER_RATING_DATE;
	}
	public void setCUSTOMER_RATING_DATE(Date cUSTOMER_RATING_DATE) {
		CUSTOMER_RATING_DATE = cUSTOMER_RATING_DATE;
	}
	public Date getCUSTOMER_NEXT_RATING_DATE() {
		return CUSTOMER_NEXT_RATING_DATE;
	}
	public void setCUSTOMER_NEXT_RATING_DATE(Date cUSTOMER_NEXT_RATING_DATE) {
		CUSTOMER_NEXT_RATING_DATE = cUSTOMER_NEXT_RATING_DATE;
	}
	public String getMIS_FACE_TO_FACE() {
		return MIS_FACE_TO_FACE;
	}
	public void setMIS_FACE_TO_FACE(String mIS_FACE_TO_FACE) {
		MIS_FACE_TO_FACE = mIS_FACE_TO_FACE;
	}
	public String getMIS_NON_FACE_TO_FACE() {
		return MIS_NON_FACE_TO_FACE;
	}
	public void setMIS_NON_FACE_TO_FACE(String mIS_NON_FACE_TO_FACE) {
		MIS_NON_FACE_TO_FACE = mIS_NON_FACE_TO_FACE;
	}
	public String getMIS_INTERNAL_RATING_GRADE() {
		return MIS_INTERNAL_RATING_GRADE;
	}
	public void setMIS_INTERNAL_RATING_GRADE(String mIS_INTERNAL_RATING_GRADE) {
		MIS_INTERNAL_RATING_GRADE = mIS_INTERNAL_RATING_GRADE;
	}
	public String getMIS_INTERNAL_RATING_SCALE() {
		return MIS_INTERNAL_RATING_SCALE;
	}
	public void setMIS_INTERNAL_RATING_SCALE(String mIS_INTERNAL_RATING_SCALE) {
		MIS_INTERNAL_RATING_SCALE = mIS_INTERNAL_RATING_SCALE;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}
	public String getENTITY_CRE_FLG() {
		return ENTITY_CRE_FLG;
	}
	public void setENTITY_CRE_FLG(String eNTITY_CRE_FLG) {
		ENTITY_CRE_FLG = eNTITY_CRE_FLG;
	}
	public Date getENTITY_CRE_DATE() {
		return ENTITY_CRE_DATE;
	}
	public void setENTITY_CRE_DATE(Date eNTITY_CRE_DATE) {
		ENTITY_CRE_DATE = eNTITY_CRE_DATE;
	}
	public String getMOD_FLG() {
		return MOD_FLG;
	}
	public void setMOD_FLG(String mOD_FLG) {
		MOD_FLG = mOD_FLG;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getAUTH_USER() {
		return AUTH_USER;
	}
	public void setAUTH_USER(String aUTH_USER) {
		AUTH_USER = aUTH_USER;
	}
	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Date getAUTH_TIME() {
		return AUTH_TIME;
	}
	public void setAUTH_TIME(Date aUTH_TIME) {
		AUTH_TIME = aUTH_TIME;
	}
	public String getAML_CODE_1() {
		return AML_CODE_1;
	}
	public void setAML_CODE_1(String aML_CODE_1) {
		AML_CODE_1 = aML_CODE_1;
	}
	public String getAML_CODE_2() {
		return AML_CODE_2;
	}
	public void setAML_CODE_2(String aML_CODE_2) {
		AML_CODE_2 = aML_CODE_2;
	}
	public String getAML_CODE_3() {
		return AML_CODE_3;
	}
	public void setAML_CODE_3(String aML_CODE_3) {
		AML_CODE_3 = aML_CODE_3;
	}
	public String getAML_CODE_4() {
		return AML_CODE_4;
	}
	public void setAML_CODE_4(String aML_CODE_4) {
		AML_CODE_4 = aML_CODE_4;
	}
	public String getAML_CODE_5() {
		return AML_CODE_5;
	}
	public void setAML_CODE_5(String aML_CODE_5) {
		AML_CODE_5 = aML_CODE_5;
	}
	public String getAML_CODE_6() {
		return AML_CODE_6;
	}
	public void setAML_CODE_6(String aML_CODE_6) {
		AML_CODE_6 = aML_CODE_6;
	}
	public String getAML_CODE_7() {
		return AML_CODE_7;
	}
	public void setAML_CODE_7(String aML_CODE_7) {
		AML_CODE_7 = aML_CODE_7;
	}
	public String getAML_CODE_8() {
		return AML_CODE_8;
	}
	public void setAML_CODE_8(String aML_CODE_8) {
		AML_CODE_8 = aML_CODE_8;
	}
	public String getAML_CODE_9() {
		return AML_CODE_9;
	}
	public void setAML_CODE_9(String aML_CODE_9) {
		AML_CODE_9 = aML_CODE_9;
	}
	public String getAML_CODE_10() {
		return AML_CODE_10;
	}
	public void setAML_CODE_10(String aML_CODE_10) {
		AML_CODE_10 = aML_CODE_10;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public String getPROCESS_OWNER() {
		return PROCESS_OWNER;
	}
	public void setPROCESS_OWNER(String pROCESS_OWNER) {
		PROCESS_OWNER = pROCESS_OWNER;
	}
	public String getQTR_FLG() {
		return QTR_FLG;
	}
	public void setQTR_FLG(String qTR_FLG) {
		QTR_FLG = qTR_FLG;
	}
	public Date getVERIFY_DATE() {
		return VERIFY_DATE;
	}
	public void setVERIFY_DATE(Date vERIFY_DATE) {
		VERIFY_DATE = vERIFY_DATE;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public String getARCH_FLG() {
		return ARCH_FLG;
	}
	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
	}
	public String getCELL_MAPPING() {
		return CELL_MAPPING;
	}
	public void setCELL_MAPPING(String cELL_MAPPING) {
		CELL_MAPPING = cELL_MAPPING;
	}
	public String getTRAN_CHANNEL() {
		return TRAN_CHANNEL;
	}
	public void setTRAN_CHANNEL(String tRAN_CHANNEL) {
		TRAN_CHANNEL = tRAN_CHANNEL;
	}
	public String getACCT_NUM() {
		return ACCT_NUM;
	}
	public void setACCT_NUM(String aCCT_NUM) {
		ACCT_NUM = aCCT_NUM;
	}
	public String getACT_NAME() {
		return ACT_NAME;
	}
	public void setACT_NAME(String aCT_NAME) {
		ACT_NAME = aCT_NAME;
	}
	public String getTRAN_TYPE() {
		return TRAN_TYPE;
	}
	public void setTRAN_TYPE(String tRAN_TYPE) {
		TRAN_TYPE = tRAN_TYPE;
	}
	public String getTRAN_SUB_TYPE() {
		return TRAN_SUB_TYPE;
	}
	public void setTRAN_SUB_TYPE(String tRAN_SUB_TYPE) {
		TRAN_SUB_TYPE = tRAN_SUB_TYPE;
	}
	public Date getTRAN_DATE() {
		return TRAN_DATE;
	}
	public void setTRAN_DATE(Date tRAN_DATE) {
		TRAN_DATE = tRAN_DATE;
	}
	public String getTRAN_ID() {
		return TRAN_ID;
	}
	public void setTRAN_ID(String tRAN_ID) {
		TRAN_ID = tRAN_ID;
	}
	public String getPART_TRAN_ID() {
		return PART_TRAN_ID;
	}
	public void setPART_TRAN_ID(String pART_TRAN_ID) {
		PART_TRAN_ID = pART_TRAN_ID;
	}
	public String getPART_TRAN_TYPE() {
		return PART_TRAN_TYPE;
	}
	public void setPART_TRAN_TYPE(String pART_TRAN_TYPE) {
		PART_TRAN_TYPE = pART_TRAN_TYPE;
	}
	public String getTRAN_CRNCY() {
		return TRAN_CRNCY;
	}
	public void setTRAN_CRNCY(String tRAN_CRNCY) {
		TRAN_CRNCY = tRAN_CRNCY;
	}
	public BigDecimal getTRAN_AMT() {
		return TRAN_AMT;
	}
	public void setTRAN_AMT(BigDecimal tRAN_AMT) {
		TRAN_AMT = tRAN_AMT;
	}
	public String getTRAN_CATEGORY() {
		return TRAN_CATEGORY;
	}
	public void setTRAN_CATEGORY(String tRAN_CATEGORY) {
		TRAN_CATEGORY = tRAN_CATEGORY;
	}
	public Date getCUSTOMER_DUE_RATING_DATE() {
		return CUSTOMER_DUE_RATING_DATE;
	}
	public void setCUSTOMER_DUE_RATING_DATE(Date cUSTOMER_DUE_RATING_DATE) {
		CUSTOMER_DUE_RATING_DATE = cUSTOMER_DUE_RATING_DATE;
	}
	public String getREPORT_QUARTER() {
		return REPORT_QUARTER;
	}
	public void setREPORT_QUARTER(String rEPORT_QUARTER) {
		REPORT_QUARTER = rEPORT_QUARTER;
	}
	public RBSCustomerMaster(String cUST_ID, String cUSTOMER_NAME, String bRANCH_ID, String bRANCH_NAME, String bANK_ID,
			String oWNERSHIP_TYPE, Date rELATIONSHIP_DATE, String cUST_RATING, Date cUSTOMER_RATING_DATE,
			Date cUSTOMER_NEXT_RATING_DATE, String mIS_FACE_TO_FACE, String mIS_NON_FACE_TO_FACE,
			String mIS_INTERNAL_RATING_GRADE, String mIS_INTERNAL_RATING_SCALE, String rEMARKS, String dEL_FLG,
			String eNTITY_CRE_FLG, Date eNTITY_CRE_DATE, String mOD_FLG, String eNTRY_USER, String mODIFY_USER,
			String aUTH_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date aUTH_TIME, String aML_CODE_1, String aML_CODE_2,
			String aML_CODE_3, String aML_CODE_4, String aML_CODE_5, String aML_CODE_6, String aML_CODE_7,
			String aML_CODE_8, String aML_CODE_9, String aML_CODE_10, Date rEPORT_DATE, String pROCESS_OWNER,
			String qTR_FLG, Date vERIFY_DATE, String vERIFY_USER, String aRCH_FLG, String cELL_MAPPING,
			String tRAN_CHANNEL, String aCCT_NUM, String aCT_NAME, String tRAN_TYPE, String tRAN_SUB_TYPE,
			Date tRAN_DATE, String tRAN_ID, String pART_TRAN_ID, String pART_TRAN_TYPE, String tRAN_CRNCY,
			BigDecimal tRAN_AMT, String tRAN_CATEGORY, Date cUSTOMER_DUE_RATING_DATE, String rEPORT_QUARTER) {
		super();
		CUST_ID = cUST_ID;
		CUSTOMER_NAME = cUSTOMER_NAME;
		BRANCH_ID = bRANCH_ID;
		BRANCH_NAME = bRANCH_NAME;
		BANK_ID = bANK_ID;
		OWNERSHIP_TYPE = oWNERSHIP_TYPE;
		RELATIONSHIP_DATE = rELATIONSHIP_DATE;
		CUST_RATING = cUST_RATING;
		CUSTOMER_RATING_DATE = cUSTOMER_RATING_DATE;
		CUSTOMER_NEXT_RATING_DATE = cUSTOMER_NEXT_RATING_DATE;
		MIS_FACE_TO_FACE = mIS_FACE_TO_FACE;
		MIS_NON_FACE_TO_FACE = mIS_NON_FACE_TO_FACE;
		MIS_INTERNAL_RATING_GRADE = mIS_INTERNAL_RATING_GRADE;
		MIS_INTERNAL_RATING_SCALE = mIS_INTERNAL_RATING_SCALE;
		REMARKS = rEMARKS;
		DEL_FLG = dEL_FLG;
		ENTITY_CRE_FLG = eNTITY_CRE_FLG;
		ENTITY_CRE_DATE = eNTITY_CRE_DATE;
		MOD_FLG = mOD_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		AUTH_USER = aUTH_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		AUTH_TIME = aUTH_TIME;
		AML_CODE_1 = aML_CODE_1;
		AML_CODE_2 = aML_CODE_2;
		AML_CODE_3 = aML_CODE_3;
		AML_CODE_4 = aML_CODE_4;
		AML_CODE_5 = aML_CODE_5;
		AML_CODE_6 = aML_CODE_6;
		AML_CODE_7 = aML_CODE_7;
		AML_CODE_8 = aML_CODE_8;
		AML_CODE_9 = aML_CODE_9;
		AML_CODE_10 = aML_CODE_10;
		REPORT_DATE = rEPORT_DATE;
		PROCESS_OWNER = pROCESS_OWNER;
		QTR_FLG = qTR_FLG;
		VERIFY_DATE = vERIFY_DATE;
		VERIFY_USER = vERIFY_USER;
		ARCH_FLG = aRCH_FLG;
		CELL_MAPPING = cELL_MAPPING;
		TRAN_CHANNEL = tRAN_CHANNEL;
		ACCT_NUM = aCCT_NUM;
		ACT_NAME = aCT_NAME;
		TRAN_TYPE = tRAN_TYPE;
		TRAN_SUB_TYPE = tRAN_SUB_TYPE;
		TRAN_DATE = tRAN_DATE;
		TRAN_ID = tRAN_ID;
		PART_TRAN_ID = pART_TRAN_ID;
		PART_TRAN_TYPE = pART_TRAN_TYPE;
		TRAN_CRNCY = tRAN_CRNCY;
		TRAN_AMT = tRAN_AMT;
		TRAN_CATEGORY = tRAN_CATEGORY;
		CUSTOMER_DUE_RATING_DATE = cUSTOMER_DUE_RATING_DATE;
		REPORT_QUARTER = rEPORT_QUARTER;
	}
	public RBSCustomerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
