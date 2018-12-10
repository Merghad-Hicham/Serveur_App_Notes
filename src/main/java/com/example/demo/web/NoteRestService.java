package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Note;
import com.example.demo.metier.NoteMetier;

@RestController
public class NoteRestService {
	 @Autowired
	 private NoteMetier noteMetier;

	 @RequestMapping(value = "/notes", method = RequestMethod.POST)
	public Note saveNote(@RequestBody Note E) {
		return noteMetier.saveNote(E);
	}
	 @RequestMapping(value = "/usernotes/{id}", method = RequestMethod.GET)
	public List<Note> listNote(@PathVariable Long id) {
		return noteMetier.listNote(id);
	}
	 @RequestMapping(value = "/notes/{id}", method = RequestMethod.GET)
	public Note getNote(@PathVariable Long id) {
		return noteMetier.getNote(id);
	}
	 @RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
	public boolean supprimNote(@PathVariable Long id) {
		return noteMetier.supprimNote(id);
	}
	 

}
