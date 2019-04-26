package com.infotel.TpMavenNote.metier;

import org.springframework.stereotype.Component;

@Component

public class Etudiant {
	
	private int idEtudiant;
	private String nomE;
	private String prenom;
	private Formation formation;
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomE=" + nomE + ", prenom=" + prenom + ", formation="
				+ formation + "]";
	}

}
