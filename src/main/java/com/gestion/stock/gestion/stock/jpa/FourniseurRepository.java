package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.Fourniseur;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FourniseurRepository extends JpaRepository<Fourniseur, Long> {

}
