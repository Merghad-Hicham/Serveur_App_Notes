package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String name;
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 private Note notes;
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 private Todo todo;
	public Note getNotes() {
		return notes;
	}
	public void setNotes(Note notes) {
		this.notes = notes;
	}
	public Lable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lable(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
