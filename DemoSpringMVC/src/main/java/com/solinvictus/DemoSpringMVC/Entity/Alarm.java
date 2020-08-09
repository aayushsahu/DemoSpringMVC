package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Alarm {

	@Id
	private Long id;
	
	private Date dateAndTime;
	private boolean isRepeatOn;
	private boolean repeatDays[];
	
	@Autowired
	public Alarm(Long id, Date dateAndTime, boolean isRepeatOn, boolean[] repeatDays) {
		super();
		this.id = id;
		this.dateAndTime = dateAndTime;
		this.isRepeatOn = isRepeatOn;
		this.repeatDays = repeatDays;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public boolean isRepeatOn() {
		return isRepeatOn;
	}
	public void setRepeatOn(boolean isRepeatOn) {
		this.isRepeatOn = isRepeatOn;
	}
	public boolean[] getRepeatDays() {
		return repeatDays;
	}
	public void setRepeatDays(boolean[] repeatDays) {
		this.repeatDays = repeatDays;
	}
}
