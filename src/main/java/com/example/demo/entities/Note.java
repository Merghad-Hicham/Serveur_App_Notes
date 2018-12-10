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

public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String body;
	private Date updateDate;
	private Date creationDate;
	private Date deleteDate;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private User user;
	 @OneToMany(cascade = CascadeType.ALL,mappedBy = "notes")
	private List<Lable> label = new ArrayList<>();	
	private boolean isPinned;
	private String color;
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(Long id, String title, String body, Date updateDate, Date creationDate, Date deleteDate,
			boolean isPinned, String color) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.updateDate = updateDate;
		this.creationDate = creationDate;
		this.deleteDate = deleteDate;
		this.isPinned = isPinned;
		this.color = color;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public List<Lable> getLabel() {
		return label;
	}

	public void setLabel(List<Lable> label) {
		this.label = label;
	}

	public boolean isPinned() {
		return isPinned;
	}

	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
