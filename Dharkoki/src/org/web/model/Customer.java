package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@Column(name="cust_id")
	private String cust_id;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="cust_mail",length=300,nullable=true)
	private String cust_mail;
	@Column(name="cust_addr")
	private String cust_addr;
	@Column(name="cust_phone_no")
	private String cust_phone_no;
	@Column(name="units_consume")
	private int units_consume;
	@Column(name="p_reading")
	private int p_reading;
	@Column(name="c_reading")
	private int c_reading;
	@Column(name="date")
	private String date;
	@Column(name="supply_type")
	private String supply_type;
	public Customer(String cust_id, String cust_name, String cust_mail, String cust_addr, String cust_phone_no,
			int units_consume, int p_reading, int c_reading, String date, String supply_type) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_mail = cust_mail;
		this.cust_addr = cust_addr;
		this.cust_phone_no = cust_phone_no;
		this.units_consume = units_consume;
		this.p_reading = p_reading;
		this.c_reading = c_reading;
		this.date = date;
		this.supply_type = supply_type;
	}

	public String getSupply_type() {
		return supply_type;
	}

	public void setSupply_type(String supply_type) {
		this.supply_type = supply_type;
	}

	public int getUnits_consume() {
		return units_consume;
	}

	public void setUnits_consume(int units_consume) {
		this.units_consume = units_consume;
	}

	public int getP_reading() {
		return p_reading;
	}

	public void setP_reading(int p_reading) {
		this.p_reading = p_reading;
	}

	public int getC_reading() {
		return c_reading;
	}

	public void setC_reading(int c_reading) {
		this.c_reading = c_reading;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_mail() {
		return cust_mail;
	}

	public void setCust_mail(String cust_mail) {
		this.cust_mail = cust_mail;
	}

	public String getCust_addr() {
		return cust_addr;
	}

	public void setCust_addr(String cust_addr) {
		this.cust_addr = cust_addr;
	}

	public String getCust_phone_no() {
		return cust_phone_no;
	}

	public void setCust_phone_no(String cust_phone_no) {
		this.cust_phone_no = cust_phone_no;
	}

	

}
