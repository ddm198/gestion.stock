package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.MouvementStock;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MouvementStockRepository extends JpaRepository<MouvementStock, Long>{

}
