package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Alarm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private User user;
	private Date dateAndTime;
	private boolean snooz;
	private boolean isRepeatOn;
	private boolean repeatDays[];

	@Autowired
	public Alarm(Date dateAndTime, boolean snooz, boolean isRepeatOn, boolean[] repeatDays) {
		this.snooz = snooz;
		this.dateAndTime = dateAndTime;
		this.isRepeatOn = isRepeatOn;
		this.repeatDays = repeatDays;
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
	
	public boolean isSnooz() {
		return snooz;
	}

	public void setSnooz(boolean snooz) {
		this.snooz = snooz;
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
