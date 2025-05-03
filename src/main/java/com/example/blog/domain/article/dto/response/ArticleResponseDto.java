package com.example.blog.domain.article.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class ArticleResponseDto {

	private final Long id;

	private final String title;

	private final String content;


}
