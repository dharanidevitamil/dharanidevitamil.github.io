package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Service_tbl")
public class Service {

	@Id
	@Column(name="service_no")
	private String SERVICE_NO;
	
	

	public String getSERVICE_NO() {
		return SERVICE_NO;
	}

	public void setSERVICE_NO(String sERVICE_NO) {
		SERVICE_NO = sERVICE_NO;
	}
	
	public boolean check(String SERVICE_NO)
	{
		if (SERVICE_NO.length()==11)
			return  true;
		else
			return false;
		
	}

	
	
}
