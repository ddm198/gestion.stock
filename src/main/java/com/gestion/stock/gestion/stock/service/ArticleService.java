package com.gestion.stock.gestion.stock.service;

import com.gestion.stock.gestion.stock.model.Article;

import java.util.List;

public interface ArticleService {
    public void createArticle(Article article);
    public List<Article>getArticle();
    public Article finByid(long id);
    public Article update(Article article,long id );
    public void deleteArticleById(long id);
    public Article updatePartially(Article article, long id);

}
