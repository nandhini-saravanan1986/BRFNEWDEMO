package com.bornfire.xbrl.entities.glsubhead;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GL_SUB_HEAD_META_TB")
public class GlSubHeadMeta {

	@EmbeddedId
	GlSubHeadMetaId glSubHeadMetaId;
	
	
	private String	gl_desc;
	private String	type;
	private String	assets;
	private String	liabilities;
	private String	assets_memo;
	private String	liab_memo;
	private String	available_in_mcbl;
	private String	net_flg;
	private String	bls0110;
	private String	sup0500;
	private String	sup0700;
	private String	fim0600;
	
	
	public GlSubHeadMetaId getGlSubHeadMetaId() {
		return glSubHeadMetaId;
	}
	public void setGlSubHeadMetaId(GlSubHeadMetaId glSubHeadMetaId) {
		this.glSubHeadMetaId = glSubHeadMetaId;
	}
	public String getGl_desc() {
		return gl_desc;
	}
	public void setGl_desc(String gl_desc) {
		this.gl_desc = gl_desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAssets() {
		return assets;
	}
	public void setAssets(String assets) {
		this.assets = assets;
	}
	public String getLiabilities() {
		return liabilities;
	}
	public void setLiabilities(String liabilities) {
		this.liabilities = liabilities;
	}
	public String getAssets_memo() {
		return assets_memo;
	}
	public void setAssets_memo(String assets_memo) {
		this.assets_memo = assets_memo;
	}
	public String getLiab_memo() {
		return liab_memo;
	}
	public void setLiab_memo(String liab_memo) {
		this.liab_memo = liab_memo;
	}
	public String getAvailable_in_mcbl() {
		return available_in_mcbl;
	}
	public void setAvailable_in_mcbl(String available_in_mcbl) {
		this.available_in_mcbl = available_in_mcbl;
	}
	public String getNet_flg() {
		return net_flg;
	}
	public void setNet_flg(String net_flg) {
		this.net_flg = net_flg;
	}
	public String getBls0110() {
		return bls0110;
	}
	public void setBls0110(String bls0110) {
		this.bls0110 = bls0110;
	}
	public String getSup0500() {
		return sup0500;
	}
	public void setSup0500(String sup0500) {
		this.sup0500 = sup0500;
	}
	public String getSup0700() {
		return sup0700;
	}
	public void setSup0700(String sup0700) {
		this.sup0700 = sup0700;
	}
	public String getFim0600() {
		return fim0600;
	}
	public void setFim0600(String fim0600) {
		this.fim0600 = fim0600;
	}
	public GlSubHeadMeta(GlSubHeadMetaId glSubHeadMetaId, String gl_desc, String type, String assets,
			String liabilities, String assets_memo, String liab_memo, String available_in_mcbl, String net_flg,
			String bls0110, String sup0500, String sup0700, String fim0600) {
		super();
		this.glSubHeadMetaId = glSubHeadMetaId;
		this.gl_desc = gl_desc;
		this.type = type;
		this.assets = assets;
		this.liabilities = liabilities;
		this.assets_memo = assets_memo;
		this.liab_memo = liab_memo;
		this.available_in_mcbl = available_in_mcbl;
		this.net_flg = net_flg;
		this.bls0110 = bls0110;
		this.sup0500 = sup0500;
		this.sup0700 = sup0700;
		this.fim0600 = fim0600;
	}
	
	public GlSubHeadMeta() {}
	@Override
	public String toString() {
		return "GlSubHeadMeta [glSubHeadMetaId=" + glSubHeadMetaId + ", gl_desc=" + gl_desc + ", type=" + type
				+ ", assets=" + assets + ", liabilities=" + liabilities + ", assets_memo=" + assets_memo
				+ ", liab_memo=" + liab_memo + ", available_in_mcbl=" + available_in_mcbl + ", net_flg=" + net_flg
				+ ", bls0110=" + bls0110 + ", sup0500=" + sup0500 + ", sup0700=" + sup0700 + ", fim0600=" + fim0600
				+ "]";
	}
	
	
	
	
	

}
