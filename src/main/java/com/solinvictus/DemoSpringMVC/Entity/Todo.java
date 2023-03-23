package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User user;
	private Date dateofCreation;
	private String task;
	private boolean isDone;
	
	public Todo() {}

	@Autowired
	public Todo(User user, Date dateofCreation, String task, boolean isDone) {
		this.user = user;
		this.dateofCreation = dateofCreation;
		this.task = task;
		this.isDone = isDone;
	}

	public Long getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateofCreation() {
		return dateofCreation;
	}

	public void setDateofCreation(Date dateofCreation) {
		this.dateofCreation = dateofCreation;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
}
