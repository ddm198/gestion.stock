package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "mouvement_Stocks")
public class MouvementStock implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

//	public static final int ENTREE = 1;
//	public static final int SORTIE = 2;


	private Long idMouvementStock;
	@Temporal(TemporalType.TIME)
	private Date dateMvtStock;
	private BigDecimal quantite;
	private Article article;

	public MouvementStock(){

	}

	public MouvementStock(Long idMouvementStock, Date dateMvtStock, BigDecimal quantite, Article article) {
		this.idMouvementStock = idMouvementStock;
		this.dateMvtStock = dateMvtStock;
		this.quantite = quantite;
		this.article = article;
	}

	public Long getIdMouvementStock() {
		return idMouvementStock;
	}

	public void setIdMouvementStock(Long idMouvementStock) {
		this.idMouvementStock = idMouvementStock;
	}

	public Date getDateMvtStock() {
		return dateMvtStock;
	}

	public void setDateMvtStock(Date dateMvtStock) {
		this.dateMvtStock = dateMvtStock;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "MouvementStock{" +
				"idMouvementStock=" + idMouvementStock +
				", dateMvtStock=" + dateMvtStock +
				", quantite=" + quantite +
				", article=" + article +
				'}';
	}
}
