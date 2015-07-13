package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REMARQUE")
public class Remarque {
	
	     @Id  
	    @Column(name="id")
	    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	private String text ;
	
	
	
	
	
	public Remarque(String text) {
		super();
		this.text = text;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	

}
