package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
