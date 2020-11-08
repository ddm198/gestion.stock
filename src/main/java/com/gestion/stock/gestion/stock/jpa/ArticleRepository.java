package com.gestion.stock.gestion.stock.jpa;

import com.gestion.stock.gestion.stock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
