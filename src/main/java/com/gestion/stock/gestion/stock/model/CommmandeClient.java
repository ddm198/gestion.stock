package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commmande_Clients")
public class CommmandeClient implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommandeClient;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;

	public CommmandeClient(){

	}
	public CommmandeClient(Long idCommandeClient, String code, Date dateCommande) {
		this.idCommandeClient = idCommandeClient;
		this.code = code;
		this.dateCommande = dateCommande;
	}

	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	@Override
	public String toString() {
		return "CommmandeClient{" +
				"idCommandeClient=" + idCommandeClient +
				", code='" + code + '\'' +
				", dateCommande=" + dateCommande +
				'}';
	}
}
