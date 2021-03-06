package com.example.spring.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "presentCourse")
public class Course {
	@Id
	private String id;
	private String course;
	private String price;
	private String description;
	private String book_name;
	private String book_title;
	private String new_branch;

	public String getNew_branch() {
		return new_branch;
	}

	public void setNew_branch(String new_branch) {
		this.new_branch = new_branch;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void setDescription(String description) {
		this.description = description;


	}
	
	
	

}
