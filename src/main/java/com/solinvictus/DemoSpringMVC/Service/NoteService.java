package com.solinvictus.DemoSpringMVC.Service;

import java.util.ArrayList;
import java.util.List;

import com.solinvictus.DemoSpringMVC.Entity.Note;
import com.solinvictus.DemoSpringMVC.Entity.User;
import com.solinvictus.DemoSpringMVC.Repos.NoteRepository;

public class NoteService {
	private final NoteRepository noteRepository;
	private final User user;

	public NoteService(NoteRepository noteRepository, User user) {
		this.noteRepository = noteRepository;
		this.user = user;
	}
	
	public List<Note> fetchAllNotesForUser(){		
		Iterable<Note> it = noteRepository.findAll();
		List<Note> allNotes = new ArrayList<>();
		List<Note> allNotesForUser = new ArrayList<>();

		it.forEach(e -> {
			allNotes.add(e);
		});
		for (Note note : allNotes) {
			if ( note.getUser().getId() == user.getId() )
				allNotesForUser.add(note); 
		}
		return allNotesForUser;
	}
	
	public void addNote(Note note) {
		noteRepository.save(note);
	}
	
	public Note fetchLatestNote() {
		Iterable<Note> it = noteRepository.findAll();
		List<Note> allNotes = new ArrayList<>();

		it.forEach(e -> {
			allNotes.add(e);
		});
		for (Note note : allNotes) {
			if ( note.getUser().getId() == user.getId() )
				return note; 
		}
		return null;
	}
}
