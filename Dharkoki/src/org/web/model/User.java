package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="user_tbl")
public class User {
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Id
	@Column(name="password",nullable=true)
	private String password;
	@Column(name="username",nullable=true)
	private String username;
	
	
	

}
