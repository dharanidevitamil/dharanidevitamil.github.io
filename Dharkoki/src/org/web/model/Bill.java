package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BILL")
public class Bill {

	@Column(name="bill_date")
	private String bil_date;
	@Column(name="due_date")
	private String due_date;
	@Id
	@Column(name="bill_no")
	private String bill_no;
	@Column(name="units_consume")
	private int units_consume;
	@Column(name="p_reading")
	@OneToOne
	@JoinColumn(name="p_reading")
	private int p_reading;
	@OneToOne
	@JoinColumn(name="c_reading")
	@Column(name="c_reading")
	private int c_reading;
	@OneToOne
	@JoinColumn(name="amount")
	@Column(name="amount")
	private int amount;
	public String getBil_date() {
		return bil_date;
	}
	public void setBil_date(String bil_date) {
		this.bil_date = bil_date;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Bill(String bil_date, String due_date, String bill_no, int units_consume, int p_reading, int c_reading,
			int amount) {
		super();
		this.bil_date = bil_date;
		this.due_date = due_date;
		this.bill_no = bill_no;
		this.units_consume = units_consume;
		this.p_reading = p_reading;
		this.c_reading = c_reading;
		this.amount = amount;
	}
}
