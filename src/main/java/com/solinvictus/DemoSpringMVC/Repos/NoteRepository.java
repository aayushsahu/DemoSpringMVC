package com.solinvictus.DemoSpringMVC.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.solinvictus.DemoSpringMVC.Entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long>{
}