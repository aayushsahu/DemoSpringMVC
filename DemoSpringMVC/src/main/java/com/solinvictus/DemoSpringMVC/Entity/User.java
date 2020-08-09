package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
//@Table(name="User")
public class User {
	@Id
	private Long id;
	
	private String username;
	private String password;
	private String name;
	private String email;
	private Date dob;
	
	@Autowired
	public User(Long id, String username, String password, String name, String email, Date dob) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}	
	
		
		

}
