package com.sboot.dev.service;

import com.sboot.dev.domain.Article;
import com.sboot.dev.dto.AddArticleRequest;
import com.sboot.dev.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService
{
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
