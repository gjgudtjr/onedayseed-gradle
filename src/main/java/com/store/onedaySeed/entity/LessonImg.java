package com.store.onedaySeed.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "lesson_id")
@Getter
@Setter
public class LessonImg extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imgId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lesson_id")
    private Lesson lesson;

    private String imgName;
    private String originImgName;
    private String imgUrl;
    private String repImgYn;

    public void updateLessonImg(String originImgName, String imgName, String imgUrl){
        this.originImgName = originImgName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

}
