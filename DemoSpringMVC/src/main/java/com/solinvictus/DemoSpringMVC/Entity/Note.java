package com.solinvictus.DemoSpringMVC.Entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

public class Note {
	@Id
	private Long noteId;
	@Autowired
	private User user;
	@Autowired
	private Date creationDate;
	@Autowired
	private String noteContent;
	@Autowired
	private Boolean reminder;
	@Autowired
	private Date reminderDate;
	
	public Note(Long noteId, User user, Date creationDate, String noteContent, Boolean reminder, Date reminderDate) {
		super();
		this.noteId = noteId;
		this.user = user;
		this.creationDate = creationDate;
		this.noteContent = noteContent;
		this.reminder = reminder;
		this.reminderDate = reminderDate;
	}
	
	public Long getNoteId() {
		return noteId;
	}
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public Boolean getReminder() {
		return reminder;
	}
	public void setReminder(Boolean reminder) {
		this.reminder = reminder;
	}
	public Date getReminderDate() {
		return reminderDate;
	}
	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}
	
	
	
}
