package com.sboot.dev.controller;

import com.sboot.dev.domain.Article;
import com.sboot.dev.dto.AddArticleRequest;
import com.sboot.dev.dto.AddArticleResponse;
import com.sboot.dev.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
    private final BlogService blogService;

    @GetMapping("/api/articles")
    public ResponseEntity<Article> findAllArticles() {
        List<AddArticleResponse> articles = blogService.findAll().

        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }




}
