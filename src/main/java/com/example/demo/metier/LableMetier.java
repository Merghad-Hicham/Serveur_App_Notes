package com.example.demo.metier;


import java.util.List;

import com.example.demo.entities.Lable;

public interface LableMetier {
	public Lable saveLable( Lable l);
	   public List<Lable> listLable();
	   
	   public List<Lable> getLableTodo(Long todo_id);
	   public List<Lable> getLableNotes(Long notes_id);
	   public boolean supprimLable(Long id);
	  

}
