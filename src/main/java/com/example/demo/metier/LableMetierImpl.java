package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LableRepository;
import com.example.demo.entities.Lable;
@Service
public class LableMetierImpl implements LableMetier{
	@Autowired
	private LableRepository lableRepository;

	@Override
	public Lable saveLable(Lable l) {
		// TODO Auto-generated method stub
		return lableRepository.save(l);
	}

	@Override
	public List<Lable> listLable() {
		// TODO Auto-generated method stub
		return lableRepository.findAll();
	}

	@Override
	public List<Lable> getLableTodo(Long todo_id) {
		// TODO Auto-generated method stub
		return lableRepository.getlableTodo(todo_id);
	}

	@Override
	public boolean supprimLable(Long id) {
		lableRepository.deleteById(id);
		return true;
	}

	
	@Override
	public List<Lable> getLableNotes(Long notes_id) {
		// TODO Auto-generated method stub
		return lableRepository.getlableNotes(notes_id);
	}

}
