package com.example.demo.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NoteRepository;
import com.example.demo.entities.Note;
@Service
public class NoteMetierImpl implements NoteMetier{
	
	@Autowired
	private NoteRepository noteRepository;

	@Override
	public Note saveNote(Note n) {
		// TODO Auto-generated method stub
		return noteRepository.save(n);
	}

	@Override
	public List<Note> listNote(Long id) {
		// TODO Auto-generated method stub
		return noteRepository.getAll(id);
	}

	
	@Override
	public boolean supprimNote(Long id) {
		noteRepository.deleteById(id);
		return true;
	}

	@Override
	public Note getNote(Long id) {
		// TODO Auto-generated method stub
		return noteRepository.getNote(id);
	}

	
	
		
	

}
