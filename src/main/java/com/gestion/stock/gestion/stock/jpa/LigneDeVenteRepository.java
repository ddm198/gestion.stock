package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.LigneDeVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface LigneDeVenteRepository extends JpaRepository<LigneDeVente, Long>{

}
