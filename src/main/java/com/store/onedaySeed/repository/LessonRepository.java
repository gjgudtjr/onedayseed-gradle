package com.store.onedaySeed.repository;

import com.store.onedaySeed.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long>, QuerydslPredicateExecutor<Lesson> {

    List<Lesson> findByLessonName(String lessonName);

    List<Lesson> findByLessonNameOrLessonCategory(String lessonName, String lessonCategory);

}
