package com.example.blog.domain.article.controller;


import com.example.blog.domain.article.dto.request.ArticleRequestDto;
import com.example.blog.domain.article.dto.response.ArticleResponseDto;
import com.example.blog.domain.article.entity.Article;
import com.example.blog.domain.article.service.ArticleService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
public class ArticleController {

	private final ArticleService articleService;

	/*
		게시물 저장
	*/
	@PostMapping("/v1/articles")
	public ResponseEntity<Article> saveArticle(@Valid @RequestBody ArticleRequestDto articleRequestDto) {
		Article savedArticle = articleService.saveArticle(articleRequestDto);

		return ResponseEntity.status(HttpStatus.CREATED)
			.body(savedArticle);
	}

	/*
		모든 게시물 조회
	*/
	@GetMapping("/v1/articles")
	public ResponseEntity<List<ArticleResponseDto>> findAllAricles() {
		List<ArticleResponseDto> articles = articleService.findAllArticles()
			.stream()
			.map(ArticleResponseDto::new)
			.toList();

		return ResponseEntity.ok()
			.body(articles);
	}




}
