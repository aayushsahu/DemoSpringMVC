package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Reminder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Date dateAndTime;
	private Date creationTime;
	private String reminderTitle;

	@Autowired
	public Reminder(Long id, Date dateAndTime, Date creationTime, String reminderTitle) {
		this.dateAndTime = dateAndTime;
		this.creationTime = creationTime;
		this.reminderTitle = reminderTitle;
	}
	
	public Long getId() {
		return id;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getReminderTitle() {
		return reminderTitle;
	}

	public void setReminderTitle(String reminderTitle) {
		this.reminderTitle = reminderTitle;
	}

}
