package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="UTILISATEUR")
public class Enseignant extends Utilisateur {
	
	


	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	private String specialite ;

	public Enseignant(String nom, String prenom, String email, String login, String motdepasse, int tel,String specialite) {
		super(nom, prenom, email, login, motdepasse, tel);
	  this.specialite = specialite;
	}
	
	
	


}
