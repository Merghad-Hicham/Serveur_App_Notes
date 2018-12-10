package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String discription;	
	private Date creationDate;
	private Date dueDate;	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "todo")
	private List<Lable> label = new ArrayList<>();	
	private boolean isDone;
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(Long id, String title, String discription, Date creationDate, Date dueDate, boolean isDone) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.isDone = isDone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<Lable> getLabel() {
		return label;
	}
	public void setLabel(List<Lable> label) {
		this.label = label;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	

}
