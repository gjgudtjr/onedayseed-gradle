package com.store.onedaySeed.repository;

import com.store.onedaySeed.entity.LessonImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonImgRepository extends JpaRepository<LessonImg, Long> {

    List<LessonImg> findByLessonIdOrderByIdAsc(Long lessonId);

    LessonImg findByLessonIdAndRepImgYn(Long lessonId, String repImgYn);
}
