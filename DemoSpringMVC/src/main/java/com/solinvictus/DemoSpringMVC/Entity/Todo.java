package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Todo {
	
	@Id
	private Long id;
	
	private Date dateofCreation;
	private String task;
	private boolean isDone;
	
	
	@Autowired
	public Todo(Long id, Date dateofCreation, String task, boolean isDone) {
		super();
		this.id = id;
		this.dateofCreation = dateofCreation;
		this.task = task;
		this.isDone = isDone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
