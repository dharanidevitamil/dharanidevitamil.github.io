package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Region_tbl")
public class Region {

	@Column(name="region_name")
	private String region_name;
	@Column(name="region_code",nullable=false)
	private String region_code;
	public Region(String region_name, String region_code) {
		super();
		this.region_name = region_name;
		this.region_code = region_code;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	
}
