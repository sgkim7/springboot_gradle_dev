package com.sboot.dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sboot.dev.domain.Article;
import com.sboot.dev.dto.AddArticleRequest;
import com.sboot.dev.dto.UpdateArticleRequest;
import com.sboot.dev.repository.BlogRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BlogService {
	private final BlogRepository blogRepository;

	public Article save(AddArticleRequest request) {
		return blogRepository.save(request.toEntity());
	}

	public List<Article> findAll() {
		return blogRepository.findAll();
	}

	public Article findById(long id) {
		return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
	}

	public void delete(long id) {
		blogRepository.deleteById(id);
	}

	@Transactional
	public Article update(long id, UpdateArticleRequest request) {
		Article article = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
		article.update(request.getTitle(), request.getContent());
		return article;
	}
}
