package com.sboot.dev.dto;

import com.sboot.dev.domain.Article;

import lombok.Getter;

@Getter
public class AddArticleResponse {

    private String title;
    private String content;

    public AddArticleResponse(Article article) {
        this.title = article.
        this.content = article.getContent();
    }
}

