package com.hibernate.CRUDOperations;


import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Myproj.allbook", query="from Book")
public class Book 
{
	@Id
	private int id;
	private String name;
	private String author;
	
	public Book() {
		super();
	}
	public Book(String name, String author) {
		
	
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
	
}

