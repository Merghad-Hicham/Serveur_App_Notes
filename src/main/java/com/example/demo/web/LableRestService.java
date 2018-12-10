package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Lable;
import com.example.demo.metier.LableMetier;

@RestController
public class LableRestService {
	 @Autowired
	 private LableMetier labelMetier;
	 
	 
	 @RequestMapping(value = "/lable", method = RequestMethod.POST)
	public Lable saveLable(@RequestBody Lable l) {
		return labelMetier.saveLable(l);
	}
	 @RequestMapping(value = "/lable", method = RequestMethod.GET)
	public List<Lable> listLable() {
		return labelMetier.listLable();
	}
	 @RequestMapping(value = "/labletodo/{id}", method = RequestMethod.GET)
	 public List<Lable> getLableTodo(Long todo_id) {
			return labelMetier.getLableTodo(todo_id);
		}
	 @RequestMapping(value = "/lablenotes/{id}", method = RequestMethod.GET)
	 public List<Lable> getLableNotes(Long notes_id) {
			return labelMetier.getLableNotes(notes_id);
		}
	 @RequestMapping(value = "/lable/{id}", method = RequestMethod.DELETE)
	public boolean supprimLable(@PathVariable Long id) {
		return labelMetier.supprimLable(id);
	}
	
	
	 
	 
}
