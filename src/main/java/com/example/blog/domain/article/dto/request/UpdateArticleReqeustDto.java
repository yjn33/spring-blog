package com.example.blog.domain.article.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateArticleReqeustDto {

	@NotBlank
	@Size(min = 3, max = 30, message = "제목의 길이는 3 ~ 30자 사이입니다")
	private String title;

	@NotBlank
	@Size(min = 3, max = 10000, message = "내용은 3 ~ 10000자 사이입니다")
	private String content;
}
