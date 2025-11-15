package com.sboot.dev.dto;

import com.sboot.dev.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class AddArticleResponse {

    private String title;
    private String content;

    public AddArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}

