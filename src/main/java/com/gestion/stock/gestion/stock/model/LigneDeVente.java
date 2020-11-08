package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table(name = "ligne_De_Ventes")
public class LigneDeVente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneDeVente;
	private Article article;
	private Vente vente;
public LigneDeVente(){

}
	public LigneDeVente(Long idLigneDeVente, Article article, Vente vente) {
		this.idLigneDeVente = idLigneDeVente;
		this.article = article;
		this.vente = vente;
	}

	public Long getIdLigneDeVente() {
		return idLigneDeVente;
	}

	public void setIdLigneDeVente(Long idLigneDeVente) {
		this.idLigneDeVente = idLigneDeVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	@Override
	public String toString() {
		return "LigneDeVente{" +
				"idLigneDeVente=" + idLigneDeVente +
				", article=" + article +
				", vente=" + vente +
				'}';
	}
}
