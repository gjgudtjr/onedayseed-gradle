package com.store.onedaySeed.service;

import com.store.onedaySeed.dto.LessonRegisterDto;
import com.store.onedaySeed.entity.Lesson;
import com.store.onedaySeed.entity.LessonImg;
import com.store.onedaySeed.repository.LessonImgRepository;
import com.store.onedaySeed.repository.LessonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;

    private final LessonImgService lessonImgService;

    private final LessonImgRepository lessonImgRepository;

    //레슨 등록
    public Long saveLesson(LessonRegisterDto lessonRegisterDto, List<MultipartFile> lessonImgFileList) throws Exception{
        Lesson lesson = lessonRegisterDto.createLesson();
        lessonRepository.save(lesson);

        //이미지 등록
        for(int i=0; i<lessonImgFileList.size(); i++){
            LessonImg lessonImg = new LessonImg();
            lessonImg.setLesson(lesson);

            if(i==0){
                lessonImg.setRepImgYn("Y");
            }else {
                lessonImg.setRepImgYn("N");
            }
            lessonImgService.saveLessonImg(lessonImg, lessonImgFileList.get(i));
        }
        return lesson.getLessonId();
    }

}
