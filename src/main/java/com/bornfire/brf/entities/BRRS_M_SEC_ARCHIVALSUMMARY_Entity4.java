package com.bornfire.brf.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "BRRS_M_SEC_ARCHIVALSUMMARYTABLE4")
public class BRRS_M_SEC_ARCHIVALSUMMARY_Entity4 {
	private String R36_PRODUCT;
	private BigDecimal R36_0_1Y_FT;
	private BigDecimal R36_0_1Y_HTM;
	private BigDecimal R36_0_1Y_TOTAL;
	private BigDecimal R36_1_5Y_FT;
	private BigDecimal R36_1_5Y_HTM;
	private BigDecimal R36_1_5Y_TOTAL;
	private BigDecimal R36_O5Y_FT;
	private BigDecimal R36_O5Y_HTM;
	private BigDecimal R36_O5Y_TOTAL;
	private BigDecimal R36_T_FT;
	private BigDecimal R36_T_HTM;
	private BigDecimal R36_T_TOTAL;

	// === R37 ===
	private String R37_PRODUCT;
	private BigDecimal R37_0_1Y_FT;
	private BigDecimal R37_0_1Y_HTM;
	private BigDecimal R37_0_1Y_TOTAL;
	private BigDecimal R37_1_5Y_FT;
	private BigDecimal R37_1_5Y_HTM;
	private BigDecimal R37_1_5Y_TOTAL;
	private BigDecimal R37_O5Y_FT;
	private BigDecimal R37_O5Y_HTM;
	private BigDecimal R37_O5Y_TOTAL;
	private BigDecimal R37_T_FT;
	private BigDecimal R37_T_HTM;
	private BigDecimal R37_T_TOTAL;

	// === R38 ===
	private String R38_PRODUCT;
	private BigDecimal R38_0_1Y_FT;
	private BigDecimal R38_0_1Y_HTM;
	private BigDecimal R38_0_1Y_TOTAL;
	private BigDecimal R38_1_5Y_FT;
	private BigDecimal R38_1_5Y_HTM;
	private BigDecimal R38_1_5Y_TOTAL;
	private BigDecimal R38_O5Y_FT;
	private BigDecimal R38_O5Y_HTM;
	private BigDecimal R38_O5Y_TOTAL;
	private BigDecimal R38_T_FT;
	private BigDecimal R38_T_HTM;
	private BigDecimal R38_T_TOTAL;

	// === R39 ===
	private String R39_PRODUCT;
	private BigDecimal R39_0_1Y_FT;
	private BigDecimal R39_0_1Y_HTM;
	private BigDecimal R39_0_1Y_TOTAL;
	private BigDecimal R39_1_5Y_FT;
	private BigDecimal R39_1_5Y_HTM;
	private BigDecimal R39_1_5Y_TOTAL;
	private BigDecimal R39_O5Y_FT;
	private BigDecimal R39_O5Y_HTM;
	private BigDecimal R39_O5Y_TOTAL;
	private BigDecimal R39_T_FT;
	private BigDecimal R39_T_HTM;
	private BigDecimal R39_T_TOTAL;

	// === R40 ===
	private String R40_PRODUCT;
	private BigDecimal R40_0_1Y_FT;
	private BigDecimal R40_0_1Y_HTM;
	private BigDecimal R40_0_1Y_TOTAL;
	private BigDecimal R40_1_5Y_FT;
	private BigDecimal R40_1_5Y_HTM;
	private BigDecimal R40_1_5Y_TOTAL;
	private BigDecimal R40_O5Y_FT;
	private BigDecimal R40_O5Y_HTM;
	private BigDecimal R40_O5Y_TOTAL;
	private BigDecimal R40_T_FT;
	private BigDecimal R40_T_HTM;
	private BigDecimal R40_T_TOTAL;

	// === R41 ===
	private String R41_PRODUCT;
	private BigDecimal R41_0_1Y_FT;
	private BigDecimal R41_0_1Y_HTM;
	private BigDecimal R41_0_1Y_TOTAL;
	private BigDecimal R41_1_5Y_FT;
	private BigDecimal R41_1_5Y_HTM;
	private BigDecimal R41_1_5Y_TOTAL;
	private BigDecimal R41_O5Y_FT;
	private BigDecimal R41_O5Y_HTM;
	private BigDecimal R41_O5Y_TOTAL;
	private BigDecimal R41_T_FT;
	private BigDecimal R41_T_HTM;
	private BigDecimal R41_T_TOTAL;

	// === R42 ===
	private String R42_PRODUCT;
	private BigDecimal R42_0_1Y_FT;
	private BigDecimal R42_0_1Y_HTM;
	private BigDecimal R42_0_1Y_TOTAL;
	private BigDecimal R42_1_5Y_FT;
	private BigDecimal R42_1_5Y_HTM;
	private BigDecimal R42_1_5Y_TOTAL;
	private BigDecimal R42_O5Y_FT;
	private BigDecimal R42_O5Y_HTM;
	private BigDecimal R42_O5Y_TOTAL;
	private BigDecimal R42_T_FT;
	private BigDecimal R42_T_HTM;
	private BigDecimal R42_T_TOTAL;

	// === R43 ===
	private String R43_PRODUCT;
	private BigDecimal R43_0_1Y_FT;
	private BigDecimal R43_0_1Y_HTM;
	private BigDecimal R43_0_1Y_TOTAL;
	private BigDecimal R43_1_5Y_FT;
	private BigDecimal R43_1_5Y_HTM;
	private BigDecimal R43_1_5Y_TOTAL;
	private BigDecimal R43_O5Y_FT;
	private BigDecimal R43_O5Y_HTM;
	private BigDecimal R43_O5Y_TOTAL;
	private BigDecimal R43_T_FT;
	private BigDecimal R43_T_HTM;
	private BigDecimal R43_T_TOTAL;

	// === Report fields ===
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date REPORT_DATE;

	private String REPORT_VERSION;
	private String REPORT_FREQUENCY;
	private String REPORT_CODE;
	private String REPORT_DESC;
	private String ENTITY_FLG;
	private String MODIFY_FLG;
	private String DEL_FLG;
	
	/* =========================================================
	 *  R36
	 * ========================================================= */
	public String getR36_PRODUCT() { return R36_PRODUCT; }
	public void setR36_PRODUCT(String val) { R36_PRODUCT = val; }

	public BigDecimal getR36_0_1Y_FT() { return R36_0_1Y_FT; }
	public void setR36_0_1Y_FT(BigDecimal val) { R36_0_1Y_FT = val; }

	public BigDecimal getR36_0_1Y_HTM() { return R36_0_1Y_HTM; }
	public void setR36_0_1Y_HTM(BigDecimal val) { R36_0_1Y_HTM = val; }

	public BigDecimal getR36_0_1Y_TOTAL() { return R36_0_1Y_TOTAL; }
	public void setR36_0_1Y_TOTAL(BigDecimal val) { R36_0_1Y_TOTAL = val; }

	public BigDecimal getR36_1_5Y_FT() { return R36_1_5Y_FT; }
	public void setR36_1_5Y_FT(BigDecimal val) { R36_1_5Y_FT = val; }

	public BigDecimal getR36_1_5Y_HTM() { return R36_1_5Y_HTM; }
	public void setR36_1_5Y_HTM(BigDecimal val) { R36_1_5Y_HTM = val; }

	public BigDecimal getR36_1_5Y_TOTAL() { return R36_1_5Y_TOTAL; }
	public void setR36_1_5Y_TOTAL(BigDecimal val) { R36_1_5Y_TOTAL = val; }

	public BigDecimal getR36_O5Y_FT() { return R36_O5Y_FT; }
	public void setR36_O5Y_FT(BigDecimal val) { R36_O5Y_FT = val; }

	public BigDecimal getR36_O5Y_HTM() { return R36_O5Y_HTM; }
	public void setR36_O5Y_HTM(BigDecimal val) { R36_O5Y_HTM = val; }

	public BigDecimal getR36_O5Y_TOTAL() { return R36_O5Y_TOTAL; }
	public void setR36_O5Y_TOTAL(BigDecimal val) { R36_O5Y_TOTAL = val; }

	public BigDecimal getR36_T_FT() { return R36_T_FT; }
	public void setR36_T_FT(BigDecimal val) { R36_T_FT = val; }

	public BigDecimal getR36_T_HTM() { return R36_T_HTM; }
	public void setR36_T_HTM(BigDecimal val) { R36_T_HTM = val; }

	public BigDecimal getR36_T_TOTAL() { return R36_T_TOTAL; }
	public void setR36_T_TOTAL(BigDecimal val) { R36_T_TOTAL = val; }

	/* =========================================================
	 *  R37
	 * ========================================================= */
	public String getR37_PRODUCT() { return R37_PRODUCT; }
	public void setR37_PRODUCT(String val) { R37_PRODUCT = val; }

	public BigDecimal getR37_0_1Y_FT() { return R37_0_1Y_FT; }
	public void setR37_0_1Y_FT(BigDecimal val) { R37_0_1Y_FT = val; }

	public BigDecimal getR37_0_1Y_HTM() { return R37_0_1Y_HTM; }
	public void setR37_0_1Y_HTM(BigDecimal val) { R37_0_1Y_HTM = val; }

	public BigDecimal getR37_0_1Y_TOTAL() { return R37_0_1Y_TOTAL; }
	public void setR37_0_1Y_TOTAL(BigDecimal val) { R37_0_1Y_TOTAL = val; }

	public BigDecimal getR37_1_5Y_FT() { return R37_1_5Y_FT; }
	public void setR37_1_5Y_FT(BigDecimal val) { R37_1_5Y_FT = val; }

	public BigDecimal getR37_1_5Y_HTM() { return R37_1_5Y_HTM; }
	public void setR37_1_5Y_HTM(BigDecimal val) { R37_1_5Y_HTM = val; }

	public BigDecimal getR37_1_5Y_TOTAL() { return R37_1_5Y_TOTAL; }
	public void setR37_1_5Y_TOTAL(BigDecimal val) { R37_1_5Y_TOTAL = val; }

	public BigDecimal getR37_O5Y_FT() { return R37_O5Y_FT; }
	public void setR37_O5Y_FT(BigDecimal val) { R37_O5Y_FT = val; }

	public BigDecimal getR37_O5Y_HTM() { return R37_O5Y_HTM; }
	public void setR37_O5Y_HTM(BigDecimal val) { R37_O5Y_HTM = val; }

	public BigDecimal getR37_O5Y_TOTAL() { return R37_O5Y_TOTAL; }
	public void setR37_O5Y_TOTAL(BigDecimal val) { R37_O5Y_TOTAL = val; }

	public BigDecimal getR37_T_FT() { return R37_T_FT; }
	public void setR37_T_FT(BigDecimal val) { R37_T_FT = val; }

	public BigDecimal getR37_T_HTM() { return R37_T_HTM; }
	public void setR37_T_HTM(BigDecimal val) { R37_T_HTM = val; }

	public BigDecimal getR37_T_TOTAL() { return R37_T_TOTAL; }
	public void setR37_T_TOTAL(BigDecimal val) { R37_T_TOTAL = val; }

	/* =========================================================
	 *  R38
	 * ========================================================= */
	public String getR38_PRODUCT() { return R38_PRODUCT; }
	public void setR38_PRODUCT(String val) { R38_PRODUCT = val; }

	public BigDecimal getR38_0_1Y_FT() { return R38_0_1Y_FT; }
	public void setR38_0_1Y_FT(BigDecimal val) { R38_0_1Y_FT = val; }

	public BigDecimal getR38_0_1Y_HTM() { return R38_0_1Y_HTM; }
	public void setR38_0_1Y_HTM(BigDecimal val) { R38_0_1Y_HTM = val; }

	public BigDecimal getR38_0_1Y_TOTAL() { return R38_0_1Y_TOTAL; }
	public void setR38_0_1Y_TOTAL(BigDecimal val) { R38_0_1Y_TOTAL = val; }

	public BigDecimal getR38_1_5Y_FT() { return R38_1_5Y_FT; }
	public void setR38_1_5Y_FT(BigDecimal val) { R38_1_5Y_FT = val; }

	public BigDecimal getR38_1_5Y_HTM() { return R38_1_5Y_HTM; }
	public void setR38_1_5Y_HTM(BigDecimal val) { R38_1_5Y_HTM = val; }

	public BigDecimal getR38_1_5Y_TOTAL() { return R38_1_5Y_TOTAL; }
	public void setR38_1_5Y_TOTAL(BigDecimal val) { R38_1_5Y_TOTAL = val; }

	public BigDecimal getR38_O5Y_FT() { return R38_O5Y_FT; }
	public void setR38_O5Y_FT(BigDecimal val) { R38_O5Y_FT = val; }

	public BigDecimal getR38_O5Y_HTM() { return R38_O5Y_HTM; }
	public void setR38_O5Y_HTM(BigDecimal val) { R38_O5Y_HTM = val; }

	public BigDecimal getR38_O5Y_TOTAL() { return R38_O5Y_TOTAL; }
	public void setR38_O5Y_TOTAL(BigDecimal val) { R38_O5Y_TOTAL = val; }

	public BigDecimal getR38_T_FT() { return R38_T_FT; }
	public void setR38_T_FT(BigDecimal val) { R38_T_FT = val; }

	public BigDecimal getR38_T_HTM() { return R38_T_HTM; }
	public void setR38_T_HTM(BigDecimal val) { R38_T_HTM = val; }

	public BigDecimal getR38_T_TOTAL() { return R38_T_TOTAL; }
	public void setR38_T_TOTAL(BigDecimal val) { R38_T_TOTAL = val; }

	/* =========================================================
	 *  R39
	 * ========================================================= */
	public String getR39_PRODUCT() { return R39_PRODUCT; }
	public void setR39_PRODUCT(String val) { R39_PRODUCT = val; }

	public BigDecimal getR39_0_1Y_FT() { return R39_0_1Y_FT; }
	public void setR39_0_1Y_FT(BigDecimal val) { R39_0_1Y_FT = val; }

	public BigDecimal getR39_0_1Y_HTM() { return R39_0_1Y_HTM; }
	public void setR39_0_1Y_HTM(BigDecimal val) { R39_0_1Y_HTM = val; }

	public BigDecimal getR39_0_1Y_TOTAL() { return R39_0_1Y_TOTAL; }
	public void setR39_0_1Y_TOTAL(BigDecimal val) { R39_0_1Y_TOTAL = val; }

	public BigDecimal getR39_1_5Y_FT() { return R39_1_5Y_FT; }
	public void setR39_1_5Y_FT(BigDecimal val) { R39_1_5Y_FT = val; }

	public BigDecimal getR39_1_5Y_HTM() { return R39_1_5Y_HTM; }
	public void setR39_1_5Y_HTM(BigDecimal val) { R39_1_5Y_HTM = val; }

	public BigDecimal getR39_1_5Y_TOTAL() { return R39_1_5Y_TOTAL; }
	public void setR39_1_5Y_TOTAL(BigDecimal val) { R39_1_5Y_TOTAL = val; }

	public BigDecimal getR39_O5Y_FT() { return R39_O5Y_FT; }
	public void setR39_O5Y_FT(BigDecimal val) { R39_O5Y_FT = val; }

	public BigDecimal getR39_O5Y_HTM() { return R39_O5Y_HTM; }
	public void setR39_O5Y_HTM(BigDecimal val) { R39_O5Y_HTM = val; }

	public BigDecimal getR39_O5Y_TOTAL() { return R39_O5Y_TOTAL; }
	public void setR39_O5Y_TOTAL(BigDecimal val) { R39_O5Y_TOTAL = val; }

	public BigDecimal getR39_T_FT() { return R39_T_FT; }
	public void setR39_T_FT(BigDecimal val) { R39_T_FT = val; }

	public BigDecimal getR39_T_HTM() { return R39_T_HTM; }
	public void setR39_T_HTM(BigDecimal val) { R39_T_HTM = val; }

	public BigDecimal getR39_T_TOTAL() { return R39_T_TOTAL; }
	public void setR39_T_TOTAL(BigDecimal val) { R39_T_TOTAL = val; }

	/* =========================================================
	 *  R40
	 * ========================================================= */
	public String getR40_PRODUCT() { return R40_PRODUCT; }
	public void setR40_PRODUCT(String val) { R40_PRODUCT = val; }

	public BigDecimal getR40_0_1Y_FT() { return R40_0_1Y_FT; }
	public void setR40_0_1Y_FT(BigDecimal val) { R40_0_1Y_FT = val; }

	public BigDecimal getR40_0_1Y_HTM() { return R40_0_1Y_HTM; }
	public void setR40_0_1Y_HTM(BigDecimal val) { R40_0_1Y_HTM = val; }

	public BigDecimal getR40_0_1Y_TOTAL() { return R40_0_1Y_TOTAL; }
	public void setR40_0_1Y_TOTAL(BigDecimal val) { R40_0_1Y_TOTAL = val; }

	public BigDecimal getR40_1_5Y_FT() { return R40_1_5Y_FT; }
	public void setR40_1_5Y_FT(BigDecimal val) { R40_1_5Y_FT = val; }

	public BigDecimal getR40_1_5Y_HTM() { return R40_1_5Y_HTM; }
	public void setR40_1_5Y_HTM(BigDecimal val) { R40_1_5Y_HTM = val; }

	public BigDecimal getR40_1_5Y_TOTAL() { return R40_1_5Y_TOTAL; }
	public void setR40_1_5Y_TOTAL(BigDecimal val) { R40_1_5Y_TOTAL = val; }

	public BigDecimal getR40_O5Y_FT() { return R40_O5Y_FT; }
	public void setR40_O5Y_FT(BigDecimal val) { R40_O5Y_FT = val; }

	public BigDecimal getR40_O5Y_HTM() { return R40_O5Y_HTM; }
	public void setR40_O5Y_HTM(BigDecimal val) { R40_O5Y_HTM = val; }

	public BigDecimal getR40_O5Y_TOTAL() { return R40_O5Y_TOTAL; }
	public void setR40_O5Y_TOTAL(BigDecimal val) { R40_O5Y_TOTAL = val; }

	public BigDecimal getR40_T_FT() { return R40_T_FT; }
	public void setR40_T_FT(BigDecimal val) { R40_T_FT = val; }

	public BigDecimal getR40_T_HTM() { return R40_T_HTM; }
	public void setR40_T_HTM(BigDecimal val) { R40_T_HTM = val; }

	public BigDecimal getR40_T_TOTAL() { return R40_T_TOTAL; }
	public void setR40_T_TOTAL(BigDecimal val) { R40_T_TOTAL = val; }

	/* =========================================================
	 *  R41
	 * ========================================================= */
	public String getR41_PRODUCT() { return R41_PRODUCT; }
	public void setR41_PRODUCT(String val) { R41_PRODUCT = val; }

	public BigDecimal getR41_0_1Y_FT() { return R41_0_1Y_FT; }
	public void setR41_0_1Y_FT(BigDecimal val) { R41_0_1Y_FT = val; }

	public BigDecimal getR41_0_1Y_HTM() { return R41_0_1Y_HTM; }
	public void setR41_0_1Y_HTM(BigDecimal val) { R41_0_1Y_HTM = val; }

	public BigDecimal getR41_0_1Y_TOTAL() { return R41_0_1Y_TOTAL; }
	public void setR41_0_1Y_TOTAL(BigDecimal val) { R41_0_1Y_TOTAL = val; }

	public BigDecimal getR41_1_5Y_FT() { return R41_1_5Y_FT; }
	public void setR41_1_5Y_FT(BigDecimal val) { R41_1_5Y_FT = val; }

	public BigDecimal getR41_1_5Y_HTM() { return R41_1_5Y_HTM; }
	public void setR41_1_5Y_HTM(BigDecimal val) { R41_1_5Y_HTM = val; }

	public BigDecimal getR41_1_5Y_TOTAL() { return R41_1_5Y_TOTAL; }
	public void setR41_1_5Y_TOTAL(BigDecimal val) { R41_1_5Y_TOTAL = val; }

	public BigDecimal getR41_O5Y_FT() { return R41_O5Y_FT; }
	public void setR41_O5Y_FT(BigDecimal val) { R41_O5Y_FT = val; }

	public BigDecimal getR41_O5Y_HTM() { return R41_O5Y_HTM; }
	public void setR41_O5Y_HTM(BigDecimal val) { R41_O5Y_HTM = val; }

	public BigDecimal getR41_O5Y_TOTAL() { return R41_O5Y_TOTAL; }
	public void setR41_O5Y_TOTAL(BigDecimal val) { R41_O5Y_TOTAL = val; }

	public BigDecimal getR41_T_FT() { return R41_T_FT; }
	public void setR41_T_FT(BigDecimal val) { R41_T_FT = val; }

	public BigDecimal getR41_T_HTM() { return R41_T_HTM; }
	public void setR41_T_HTM(BigDecimal val) { R41_T_HTM = val; }

	public BigDecimal getR41_T_TOTAL() { return R41_T_TOTAL; }
	public void setR41_T_TOTAL(BigDecimal val) { R41_T_TOTAL = val; }

	/* =========================================================
	 *  R42
	 * ========================================================= */
	public String getR42_PRODUCT() { return R42_PRODUCT; }
	public void setR42_PRODUCT(String val) { R42_PRODUCT = val; }

	public BigDecimal getR42_0_1Y_FT() { return R42_0_1Y_FT; }
	public void setR42_0_1Y_FT(BigDecimal val) { R42_0_1Y_FT = val; }

	public BigDecimal getR42_0_1Y_HTM() { return R42_0_1Y_HTM; }
	public void setR42_0_1Y_HTM(BigDecimal val) { R42_0_1Y_HTM = val; }

	public BigDecimal getR42_0_1Y_TOTAL() { return R42_0_1Y_TOTAL; }
	public void setR42_0_1Y_TOTAL(BigDecimal val) { R42_0_1Y_TOTAL = val; }

	public BigDecimal getR42_1_5Y_FT() { return R42_1_5Y_FT; }
	public void setR42_1_5Y_FT(BigDecimal val) { R42_1_5Y_FT = val; }

	public BigDecimal getR42_1_5Y_HTM() { return R42_1_5Y_HTM; }
	public void setR42_1_5Y_HTM(BigDecimal val) { R42_1_5Y_HTM = val; }

	public BigDecimal getR42_1_5Y_TOTAL() { return R42_1_5Y_TOTAL; }
	public void setR42_1_5Y_TOTAL(BigDecimal val) { R42_1_5Y_TOTAL = val; }

	public BigDecimal getR42_O5Y_FT() { return R42_O5Y_FT; }
	public void setR42_O5Y_FT(BigDecimal val) { R42_O5Y_FT = val; }

	public BigDecimal getR42_O5Y_HTM() { return R42_O5Y_HTM; }
	public void setR42_O5Y_HTM(BigDecimal val) { R42_O5Y_HTM = val; }

	public BigDecimal getR42_O5Y_TOTAL() { return R42_O5Y_TOTAL; }
	public void setR42_O5Y_TOTAL(BigDecimal val) { R42_O5Y_TOTAL = val; }

	public BigDecimal getR42_T_FT() { return R42_T_FT; }
	public void setR42_T_FT(BigDecimal val) { R42_T_FT = val; }

	public BigDecimal getR42_T_HTM() { return R42_T_HTM; }
	public void setR42_T_HTM(BigDecimal val) { R42_T_HTM = val; }

	public BigDecimal getR42_T_TOTAL() { return R42_T_TOTAL; }
	public void setR42_T_TOTAL(BigDecimal val) { R42_T_TOTAL = val; }

	/* =========================================================
	 *  R43
	 * ========================================================= */
	public String getR43_PRODUCT() { return R43_PRODUCT; }
	public void setR43_PRODUCT(String val) { R43_PRODUCT = val; }

	public BigDecimal getR43_0_1Y_FT() { return R43_0_1Y_FT; }
	public void setR43_0_1Y_FT(BigDecimal val) { R43_0_1Y_FT = val; }

	public BigDecimal getR43_0_1Y_HTM() { return R43_0_1Y_HTM; }
	public void setR43_0_1Y_HTM(BigDecimal val) { R43_0_1Y_HTM = val; }

	public BigDecimal getR43_0_1Y_TOTAL() { return R43_0_1Y_TOTAL; }
	public void setR43_0_1Y_TOTAL(BigDecimal val) { R43_0_1Y_TOTAL = val; }

	public BigDecimal getR43_1_5Y_FT() { return R43_1_5Y_FT; }
	public void setR43_1_5Y_FT(BigDecimal val) { R43_1_5Y_FT = val; }

	public BigDecimal getR43_1_5Y_HTM() { return R43_1_5Y_HTM; }
	public void setR43_1_5Y_HTM(BigDecimal val) { R43_1_5Y_HTM = val; }

	public BigDecimal getR43_1_5Y_TOTAL() { return R43_1_5Y_TOTAL; }
	public void setR43_1_5Y_TOTAL(BigDecimal val) { R43_1_5Y_TOTAL = val; }

	public BigDecimal getR43_O5Y_FT() { return R43_O5Y_FT; }
	public void setR43_O5Y_FT(BigDecimal val) { R43_O5Y_FT = val; }

	public BigDecimal getR43_O5Y_HTM() { return R43_O5Y_HTM; }
	public void setR43_O5Y_HTM(BigDecimal val) { R43_O5Y_HTM = val; }

	public BigDecimal getR43_O5Y_TOTAL() { return R43_O5Y_TOTAL; }
	public void setR43_O5Y_TOTAL(BigDecimal val) { R43_O5Y_TOTAL = val; }

	public BigDecimal getR43_T_FT() { return R43_T_FT; }
	public void setR43_T_FT(BigDecimal val) { R43_T_FT = val; }

	public BigDecimal getR43_T_HTM() { return R43_T_HTM; }
	public void setR43_T_HTM(BigDecimal val) { R43_T_HTM = val; }

	public BigDecimal getR43_T_TOTAL() { return R43_T_TOTAL; }
	public void setR43_T_TOTAL(BigDecimal val) { R43_T_TOTAL = val; }

	/* =========================================================
	 *  Report header / control fields
	 * ========================================================= */
	public Date getREPORT_DATE() { return REPORT_DATE; }
	public void setREPORT_DATE(Date val) { REPORT_DATE = val; }

	public String getREPORT_VERSION() { return REPORT_VERSION; }
	public void setREPORT_VERSION(String val) { REPORT_VERSION = val; }

	public String getREPORT_FREQUENCY() { return REPORT_FREQUENCY; }
	public void setREPORT_FREQUENCY(String val) { REPORT_FREQUENCY = val; }

	public String getREPORT_CODE() { return REPORT_CODE; }
	public void setREPORT_CODE(String val) { REPORT_CODE = val; }

	public String getREPORT_DESC() { return REPORT_DESC; }
	public void setREPORT_DESC(String val) { REPORT_DESC = val; }

	public String getENTITY_FLG() { return ENTITY_FLG; }
	public void setENTITY_FLG(String val) { ENTITY_FLG = val; }

	public String getMODIFY_FLG() { return MODIFY_FLG; }
	public void setMODIFY_FLG(String val) { MODIFY_FLG = val; }

	public String getDEL_FLG() { return DEL_FLG; }
	public void setDEL_FLG(String val) { DEL_FLG = val; }
	
	public BRRS_M_SEC_ARCHIVALSUMMARY_Entity4() {
		super();
	}
}
