package com.bank.client.dto;

import java.io.Serializable;


public class ClientDto implements Serializable{
	
	private static final long serialVersionUID = 1L;


	private Long id;
	
	private String nom;
	

	private String prenom;
	

	private String adresse;
	
	private String agence;
	
	
	private Long idAccount;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getAgence() {
		return agence;
	}


	public void setAgence(String agence) {
		this.agence = agence;
	}


	public Long getIdAccount() {
		return idAccount;
	}


	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	

}
