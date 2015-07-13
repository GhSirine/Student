package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PARENT")
public class Parent extends Utilisateur {

	public Parent(String nom, String prenom, String email, String login, String motdepasse, int tel) {
		super(nom, prenom, email, login, motdepasse, tel);
		// TODO Auto-generated constructor stub
	}

}
