package com.lti.homloan.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminLogin")  //Since table is stored in customer and here we are retriving data from table for matching id and password
public class Admin {

	@Column(name="email")
    private String email;
	
	@Column(name="password")
    private String password;
	
	@Id
	@Column(name="id")
    private int id;  

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password =password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", id=" + id + "]";
	}
	
}