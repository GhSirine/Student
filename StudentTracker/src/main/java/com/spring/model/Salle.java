package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SALLE")
public class Salle {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id ;
    
    private int numSalle ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}

	public Salle(int numSalle) {
		super();
		this.numSalle = numSalle;
	}
    
    
}
