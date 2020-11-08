package com.gestion.stock.gestion.stock.service;

import com.gestion.stock.gestion.stock.dao.ArticleDao;
import com.gestion.stock.gestion.stock.model.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleServiceImp implements ArticleService {

    @Autowired
    private ArticleDao articleDao;
    @Override
    public void createArticle(Article article) {
        return ;

    }

    @Override
    public List<Article> getArticle() {
        return articleDao.getArticle();

    }

    @Override
    public Article finByid(long id) {
        return articleDao.finByid(id);

    }

    @Override
    public Article update(Article article, long id) {
        return articleDao.update(article,id);


    }

    @Override
    public void deleteArticleById(long id) {
        return ;

    }

    @Override
    public Article updatePartially(Article article, long id) {
        return articleDao.updatePartially(article,id);

    }
}
