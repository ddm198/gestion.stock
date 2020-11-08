package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface VenteRepository extends JpaRepository<Vente, Long>{

}
