package com.example.demo.metier;

import java.util.Date;
import java.util.List;


import com.example.demo.entities.Note;

public interface NoteMetier {
	public Note saveNote( Note E);
	   public List<Note> listNote(Long id);
	   public Note getNote(Long id);
	  
	   public boolean supprimNote(Long id);
	   

}
