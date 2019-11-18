package edu.mum.ea.elasticsearchservice.controller;

import edu.mum.ea.elasticsearchservice.model.Article;
import edu.mum.ea.elasticsearchservice.model.Author;
import edu.mum.ea.elasticsearchservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    Article home(){
        Article article = new Article();
        article.setTitle("Getting started with Elastic Search");
        article.setId("A001");
        article.setTags("begining , starting , new");
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Brian Bwengye"));
        authors.add(new Author("Moses Niyo"));
        article.setAuthors(authors);
        Article article1 = articleService.save(article);
        return  article1;
    }

}
