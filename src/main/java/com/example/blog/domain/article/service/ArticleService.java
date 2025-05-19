package com.example.blog.domain.article.service;


import com.example.blog.domain.article.dto.request.ArticleRequestDto;
import com.example.blog.domain.article.dto.response.ArticleResponseDto;
import com.example.blog.domain.article.entity.Article;
import com.example.blog.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ArticleService {

	private final ArticleRepository articleRepository;

	/*
		글 추가 메서드
	*/
	public Article saveArticle(ArticleRequestDto articleRequestDto) {
		return articleRepository.save(articleRequestDto.toEntity());
	}


}
