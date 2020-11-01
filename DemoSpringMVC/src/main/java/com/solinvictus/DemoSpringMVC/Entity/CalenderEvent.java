package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class CalenderEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date eventDateAndTime;
	private String eventDescription;
	private String noteForEvent;

	@Autowired
	public CalenderEvent(Date eventDateAndTime, String eventDescription, String noteForEvent) {
		this.eventDateAndTime = eventDateAndTime;
		this.eventDescription = eventDescription;
		this.noteForEvent = noteForEvent;
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
