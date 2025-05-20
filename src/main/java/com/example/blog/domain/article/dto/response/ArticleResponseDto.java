package com.example.blog.domain.article.dto.response;


import com.example.blog.domain.article.entity.Article;
import com.example.blog.global.common.base.dto.BaseEntityResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class ArticleResponseDto extends BaseEntityResponseDto {

	private final Long id;

	private final String title;

	private final String content;

	public ArticleResponseDto(Article article) {
		super.createAt = article.getCreateAt();
		super.modifiedAt = article.getModifiedAt();
		this.id = article.getId();
		this.title = article.getTitle();
		this.content = article.getContent();
	}


}
