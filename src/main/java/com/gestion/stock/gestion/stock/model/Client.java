package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	private String name;
	private String prenom;
	private String address;
	private String email;

	public Client() {
	}

	public Client(Long idClient, String name, String prenom, String address, String email) {
		this.idClient = idClient;
		this.name = name;
		this.prenom = prenom;
		this.address = address;
		this.email = email;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client{" +
				"idClient=" + idClient +
				", name='" + name + '\'' +
				", prenom='" + prenom + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				'}';
	}

}
