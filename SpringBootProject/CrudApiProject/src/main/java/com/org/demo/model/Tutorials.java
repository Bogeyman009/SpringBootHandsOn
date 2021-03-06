package com.org.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutorials {

	@Id 
	@GeneratedValue (strategy = GenerationType .AUTO)
	private long id;
	private String title;
	private String description;
	private boolean published;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	
	public Tutorials(String title, String description, boolean published) {
		super();
		this.title = title;
		this.description = description;
		this.published = published;
	}
	@Override
	public String toString() {
		return "Tutorials [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ "]";
	}
	
	
	
	
	
}
