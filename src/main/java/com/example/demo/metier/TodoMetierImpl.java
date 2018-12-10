package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoRepository;
import com.example.demo.entities.Todo;
@Service
public class TodoMetierImpl implements TodoMetier{
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public Todo saveTodo(Todo t) {
		// TODO Auto-generated method stub
		return todoRepository.save(t);
	}

	@Override
	public List<Todo> listTodo() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public boolean supprimerTodo(Long id) {
		todoRepository.deleteById(id);
		return true;
	}

	@Override
	public Todo getTodo(Long id) {
		// TODO Auto-generated method stub
		return todoRepository.getTodo(id);
	}

}
