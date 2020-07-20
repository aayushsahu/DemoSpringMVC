package com.solinvictus.DemoSpringMVC.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
//@Table(name="User")
public class User {
	@Id
	private Long id;
	@Autowired
	private String name;
	@Autowired
	private String p;
	
	public User() {
		
	}
	public User(Long id, String name, String p) {
		super();
		this.id = id;
		this.name = name;
		this.p = p;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	
		

}
