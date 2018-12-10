package com.example.demo.metier;

import java.util.List;

import com.example.demo.entities.Todo;

public interface TodoMetier {
public Todo saveTodo(Todo t);
public List<Todo> listTodo();
public boolean supprimerTodo(Long id);
public Todo getTodo(Long id);

}
