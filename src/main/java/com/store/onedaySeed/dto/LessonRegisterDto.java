package com.store.onedaySeed.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LessonRegisterDto {

    private Long lessonId;
    @NotBlank(message = "클래스 이름은 필수입니다.")
    private String lessonName;
    @NotBlank(message = "카테고리 설정은 필수입니다.")
    private String lessonCategory;
    @NotBlank(message = "클래스 시작일 설정은 필수입니다.")
    private String lessonSchedule;
    @NotNull(message = "가격 입력은 필수입니다.")
    private Long price;
    @NotBlank(message = "클래스 소개는 필수입니다.")
    private String lessonDetailInfo;
    
    private Integer lessonLimited;



}
