package com.login.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users_f {

	@Id
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	
	
}
