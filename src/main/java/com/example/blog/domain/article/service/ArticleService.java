package com.example.blog.domain.article.service;


import com.example.blog.domain.article.dto.request.ArticleRequestDto;
import com.example.blog.domain.article.dto.request.UpdateArticleReqeustDto;
import com.example.blog.domain.article.dto.response.ArticleResponseDto;
import com.example.blog.domain.article.entity.Article;
import com.example.blog.domain.article.repository.ArticleRepository;
import jakarta.transaction.Transactional;
import java.util.List;
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

	/*
		모든 글 목록 조회 메서드
	*/
	public List<Article> findAllArticles() {
		return articleRepository.findAll();
	}

	/*
		id 값을 조회하여 게시글 조회
	*/
	public Article findArticleById(Long articleId) {
		return articleRepository.findById(articleId)
			.orElseThrow(() -> new IllegalArgumentException(articleId + "의 값에 해당하는 게시물을 찾지 못하였습니다"));
	}

	/*
		게시글 삭제 메서드
	*/
	public void deleteArticle(Long articleId) {
		articleRepository.deleteById(articleId);
	}

	@Transactional
	public Article updateArticle(Long articleId, UpdateArticleReqeustDto reqeustDto) {
		Article article = articleRepository.findById(articleId)
			.orElseThrow(() -> new IllegalArgumentException(articleId + "값에 해당 게시글은 없습니다"));

		article.update(reqeustDto.getTitle(), reqeustDto.getContent());

		return article;
	}

}
