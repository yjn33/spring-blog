package com.example.blog.domain.article.dto.request;


import com.example.blog.domain.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleRequestDto {

	private String title;

	private String content;


	// 요청 데이터를 엔터티로 생성
	// static factory method와 다르다 -> 이미 요청받은 엔터티를 생성하기 위해서
	public Article toEntity() {
		return Article.builder()
			.title(this.title)
			.content(this.content)
			.build();
	}


}
