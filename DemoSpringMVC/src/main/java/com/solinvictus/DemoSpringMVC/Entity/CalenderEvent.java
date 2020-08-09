package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class CalenderEvent {
	@Id
	private Long id;
	
	private Date eventDateAndTime;
	private String eventDescription;
	private String noteForEvent;
	
	
	@Autowired
	public CalenderEvent(Long id, Date eventDateAndTime, String eventDescription, String noteForEvent) {
		super();
		this.id = id;
		this.eventDateAndTime = eventDateAndTime;
		this.eventDescription = eventDescription;
		this.noteForEvent = noteForEvent;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getEventDateAndTime() {
		return eventDateAndTime;
	}
	public void setEventDateAndTime(Date eventDateAndTime) {
		this.eventDateAndTime = eventDateAndTime;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getNoteForEvent() {
		return noteForEvent;
	}
	public void setNoteForEvent(String noteForEvent) {
		this.noteForEvent = noteForEvent;
	}
	
	
}
