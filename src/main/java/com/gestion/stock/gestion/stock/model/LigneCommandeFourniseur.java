package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ligne_Commandes_fourniseurs")
public class LigneCommandeFourniseur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long idLigneCommandeFourniseur;
	private CommandeFourniseur commandeFourniseur;
	private Article article;

	public LigneCommandeFourniseur(){
	}

	public LigneCommandeFourniseur(Long idLigneCommandeFourniseur, CommandeFourniseur commandeFourniseur, Article article) {
		this.idLigneCommandeFourniseur = idLigneCommandeFourniseur;
		this.commandeFourniseur = commandeFourniseur;
		this.article = article;
	}

	public Long getIdLigneCommandeFourniseur() {
		return idLigneCommandeFourniseur;
	}

	public void setIdLigneCommandeFourniseur(Long idLigneCommandeFourniseur) {
		this.idLigneCommandeFourniseur = idLigneCommandeFourniseur;
	}

	public CommandeFourniseur getCommandeFourniseur() {
		return commandeFourniseur;
	}

	public void setCommandeFourniseur(CommandeFourniseur commandeFourniseur) {
		this.commandeFourniseur = commandeFourniseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "LigneCommandeFourniseur{" +
				"idLigneCommandeFourniseur=" + idLigneCommandeFourniseur +
				", commandeFourniseur=" + commandeFourniseur +
				", article=" + article +
				'}';
	}
}
