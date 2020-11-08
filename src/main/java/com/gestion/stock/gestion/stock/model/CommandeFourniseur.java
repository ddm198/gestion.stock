package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commande_Fourniseurs")
public class CommandeFourniseur implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommandeFourniseur;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
public CommandeFourniseur(){

}
	private Fourniseur fourniseur;
//	@OneToMany(mappedBy = "idFourniseur")

	public CommandeFourniseur(Long idCommandeFourniseur, Date dateCommande) {
		this.idCommandeFourniseur = idCommandeFourniseur;
		this.dateCommande = dateCommande;
	}

	public Long getIdCommandeFourniseur() {
		return idCommandeFourniseur;
	}

	public void setIdCommandeFourniseur(Long idCommandeFourniseur) {
		this.idCommandeFourniseur = idCommandeFourniseur;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

//	private List<LigneCommandeFourniseur>ligneCommandeFourniseur;
//	public List<LigneCommandeFourniseur> getLigneCommandeFourniseur() {
//		return ligneCommandeFourniseur;
//	}

	@Override
	public String toString() {
		return "CommandeFourniseur{" +
				"idCommandeFourniseur=" + idCommandeFourniseur +
				", dateCommande=" + dateCommande +
				'}';
	}
}
