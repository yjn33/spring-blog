package com.example.blog.domain.article.dto.response;


import com.example.blog.domain.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class ArticleResponseDto {

	private final Long id;

	private final String title;

	private final String content;

	public ArticleResponseDto(Article article) {
		this.id = article.getId();
		this.title = article.getTitle();
		this.content = article.getContent();
	}


}
