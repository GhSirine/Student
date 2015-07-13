package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="UTILISATEUR")
public class Utilisateur {
	
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;
     
    protected String nom;
    protected String prenom;
    protected String email;
    protected String login;
    protected String motdepasse;
    protected int tel;
    
    


	public Utilisateur(String nom, String prenom, String email, String login, String motdepasse, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.motdepasse = motdepasse;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getMotdepasse() {
		return motdepasse;
	}
	
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
 
	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
     
	

}
