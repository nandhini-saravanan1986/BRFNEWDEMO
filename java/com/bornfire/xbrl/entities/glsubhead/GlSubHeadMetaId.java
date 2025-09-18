package com.bornfire.xbrl.entities.glsubhead;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class GlSubHeadMetaId implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private String	gl_head;
	private String	gl_sub_head_code;
	
	
	private String	schm_type;
	
	
	private String	schm_code;
	public String getGl_head() {
		return gl_head;
	}
	public void setGl_head(String gl_head) {
		this.gl_head = gl_head;
	}
	public String getGl_sub_head_code() {
		return gl_sub_head_code;
	}
	public void setGl_sub_head_code(String gl_sub_head_code) {
		this.gl_sub_head_code = gl_sub_head_code;
	}
	public String getSchm_type() {
		return schm_type;
	}
	public void setSchm_type(String schm_type) {
		this.schm_type = schm_type;
	}
	public String getSchm_code() {
		return schm_code;
	}
	public void setSchm_code(String schm_code) {
		this.schm_code = schm_code;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gl_head == null) ? 0 : gl_head.hashCode());
		result = prime * result + ((gl_sub_head_code == null) ? 0 : gl_sub_head_code.hashCode());
		result = prime * result + ((schm_code == null) ? 0 : schm_code.hashCode());
		result = prime * result + ((schm_type == null) ? 0 : schm_type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GlSubHeadMetaId other = (GlSubHeadMetaId) obj;
		if (gl_head == null) {
			if (other.gl_head != null)
				return false;
		} else if (!gl_head.equals(other.gl_head))
			return false;
		if (gl_sub_head_code == null) {
			if (other.gl_sub_head_code != null)
				return false;
		} else if (!gl_sub_head_code.equals(other.gl_sub_head_code))
			return false;
		if (schm_code == null) {
			if (other.schm_code != null)
				return false;
		} else if (!schm_code.equals(other.schm_code))
			return false;
		if (schm_type == null) {
			if (other.schm_type != null)
				return false;
		} else if (!schm_type.equals(other.schm_type))
			return false;
		return true;
	}
	public GlSubHeadMetaId(String gl_head, String gl_sub_head_code, String schm_type, String schm_code) {
		super();
		this.gl_head = gl_head;
		this.gl_sub_head_code = gl_sub_head_code;
		this.schm_type = schm_type;
		this.schm_code = schm_code;
	}
	
	public GlSubHeadMetaId() {}
	@Override
	public String toString() {
		return "GlSubHeadMetaId [gl_head=" + gl_head + ", gl_sub_head_code=" + gl_sub_head_code + ", schm_type="
				+ schm_type + ", schm_code=" + schm_code + "]";
	}
	
	
	
	
	
	
	

}
