package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ventes")
public class Vente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long idVendte;
	private String code;
	@Temporal(TemporalType.TIME)
	private Date dateVente;
	public Vente(){}

	public Vente(Long idVendte, String code, Date dateVente) {
		this.idVendte = idVendte;
		this.code = code;
		this.dateVente = dateVente;
	}

	public Long getIdVendte() {
		return idVendte;
	}

	public void setIdVendte(Long idVendte) {
		this.idVendte = idVendte;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	@Override
	public String toString() {
		return "Vente{" +
				"idVendte=" + idVendte +
				", code='" + code + '\'' +
				", dateVente=" + dateVente +
				'}';
	}
}
