package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "articles")
public class Article implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idArticle;
	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaire;
	private BigDecimal tauxTVA;
	private BigDecimal prixTTC;
	private String photo;
	
	public Article() {
		
	}
	public Article(Long idArticle, String codeArticle, String designation, BigDecimal prixUnitaire, BigDecimal tauxTVA, BigDecimal prixTTC, String photo) {
		this.idArticle = idArticle;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.tauxTVA = tauxTVA;
		this.prixTTC = prixTTC;
		this.photo = photo;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public BigDecimal getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(BigDecimal prixTTC) {
		this.prixTTC = prixTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Article{" +
				"idArticle=" + idArticle +
				", codeArticle='" + codeArticle + '\'' +
				", designation='" + designation + '\'' +
				", prixUnitaire=" + prixUnitaire +
				", tauxTVA=" + tauxTVA +
				", prixTTC=" + prixTTC +
				", photo='" + photo + '\'' +
				'}';
	}
}
