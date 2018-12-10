package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Todo;
import com.example.demo.metier.TodoMetier;

@RestController
public class TodoRestService {

	@Autowired
	private TodoMetier todoMetier;

	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public Todo saveTodo(Todo t) {
		return todoMetier.saveTodo(t);
	}
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public List<Todo> listTodo() {
		return todoMetier.listTodo();
	}
	@RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
	public boolean supprimerTodo(Long id) {
		return todoMetier.supprimerTodo(id);
	}
	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public Todo getTodo(Long id) {
		return todoMetier.getTodo(id);
	}
	

}
