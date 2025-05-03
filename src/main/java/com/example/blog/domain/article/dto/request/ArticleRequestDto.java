package com.example.blog.domain.article.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleRequestDto {

	private String title;

	private String content;


}
