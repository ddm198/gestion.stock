package com.gestion.stock.gestion.stock.controller;

import com.gestion.stock.gestion.stock.model.Article;
import com.gestion.stock.gestion.stock.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/article"})
public class ArticleController {

 ArticleService articleService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Article> getArticleById(@PathVariable("id") long id) {
           System.out.println("Fetching Article with id " + id);
            Article article = articleService.finByid(id);
            if (article == null) {
                return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<Article>(article, HttpStatus.OK);
        }
    @PostMapping(value="/create",headers="Accept=application/json")
    public ResponseEntity<Void> createArticle(@RequestBody Article article, UriComponentsBuilder ucBuilder){
        System.out.println("Creating Article "+ articleService.getArticle());
        articleService.createArticle(article);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/article/{id}").buildAndExpand(articleService.getArticle()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @GetMapping(value="/get", headers="Accept=application/json")
    public List<Article> getAllArticle() {
        List<Article> tasks=articleService.getArticle();
        return tasks;

}
    @PutMapping(value="/update", headers="Accept=application/json")
    public ResponseEntity<String> updateArticle(@RequestBody Article currentArticle)
    {
        System.out.println("sd");
        Article article = articleService.finByid(currentArticle.getIdArticle());
        if (article==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        articleService.update(currentArticle, currentArticle.getIdArticle());
        return new ResponseEntity<String>(HttpStatus.OK);
    }
    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<Article> deleteArticle(@PathVariable("id") int id){
        Article article = articleService.finByid(id);
        if (article == null) {
            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
        }
        articleService.deleteArticleById(id);
        return new ResponseEntity<Article>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(value="/{id}", headers="Accept=application/json")
    public ResponseEntity<Article> updateArticlePartially(@PathVariable("id") long id, @RequestBody Article currentArticle){
        Article article = articleService.finByid(id);
        if(article ==null){
            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
        }
        Article article1 = articleService.updatePartially(currentArticle, id);
        return new ResponseEntity<Article>( HttpStatus.OK);
    }
}

