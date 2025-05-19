package com.example.blog.domain.article.dto.request;


import com.example.blog.domain.article.entity.Article;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleRequestDto {

	@NotBlank
	@Size(min = 3, max = 30, message = "제목의 길이는 3 ~ 30자 사이입니다")
	private String title;

	@NotBlank
	@Size(min = 3, max = 10000, message = "내용은 3 ~ 10000자 사이입니다")
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
