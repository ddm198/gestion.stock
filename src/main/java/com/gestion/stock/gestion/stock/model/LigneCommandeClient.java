package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "line_commande_Clients")
public class LigneCommandeClient implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneCommandeClient;
	private Article article;
	private CommmandeClient commmandeClient;

	public LigneCommandeClient(){}
	public LigneCommandeClient(Long idLigneCommandeClient, Article article, CommmandeClient commmandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
		this.article = article;
		this.commmandeClient = commmandeClient;
	}

	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommmandeClient getCommmandeClient() {
		return commmandeClient;
	}

	public void setCommmandeClient(CommmandeClient commmandeClient) {
		this.commmandeClient = commmandeClient;
	}

	@Override
	public String toString() {
		return "LigneCommandeClient{" +
				"idLigneCommandeClient=" + idLigneCommandeClient +
				", article=" + article +
				", commmandeClient=" + commmandeClient +
				'}';
	}
}
