package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import sun.util.calendar.BaseCalendar.Date;


@Entity
@Table(name="EMPLOI")
public class Emlpoi {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	private int semaine ;
	private Date date;
	
	
	public Emlpoi(int semaine, Date date) {
		super();
		this.semaine = semaine;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSemaine() {
		return semaine;
	}
	
	public void setSemaine(int semaine) {
		this.semaine = semaine;
	}
	
	public Date getDate() {
		return date;
	}
	
	

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
