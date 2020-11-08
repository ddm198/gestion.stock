package com.gestion.stock.gestion.stock.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCategory;
	private String code;
	private String designation;

	public Category() {
	}
	public Category(Long idCategory, String code, String designation) {
		this.idCategory = idCategory;
		this.code = code;
		this.designation = designation;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Category{" +
				"idCategory='" + idCategory + '\'' +
				", code='" + code + '\'' +
				", designation='" + designation + '\'' +
				'}';
	}
}
