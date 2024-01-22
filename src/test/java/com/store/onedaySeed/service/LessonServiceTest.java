package com.store.onedaySeed.service;

import com.store.onedaySeed.constant.LessonStatus;
import com.store.onedaySeed.dto.LessonRegisterDto;
import com.store.onedaySeed.repository.LessonImgRepository;
import com.store.onedaySeed.repository.LessonRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class LessonServiceTest {

    @Autowired
    LessonService lessonService;

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    LessonImgRepository lessonImgRepository;

    @Test
    @DisplayName("레슨 등록 테스트")
    void saveItem() throws Exception{
        LessonRegisterDto lessonRegisterDto = new LessonRegisterDto();

        lessonRegisterDto.getLessonCategory("");
        lessonRegisterDto.getLessonName();
        lessonRegisterDto.getLessonSchedule();
        lessonRegisterDto.getLessonLimited();
        lessonRegisterDto.getPrice();
        lessonRegisterDto.getLessonStatus(LessonStatus.SELL);
    }


}
