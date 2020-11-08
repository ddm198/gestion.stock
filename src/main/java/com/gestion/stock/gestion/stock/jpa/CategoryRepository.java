package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
