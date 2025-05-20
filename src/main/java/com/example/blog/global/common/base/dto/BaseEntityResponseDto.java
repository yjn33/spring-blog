package com.example.blog.global.common.base.dto;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntityResponseDto {

	protected LocalDateTime createAt;

	protected LocalDateTime modifiedAt;

}
