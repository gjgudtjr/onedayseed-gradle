package com.store.onedaySeed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "lesson")
public class LessonController {

    @GetMapping(value = "/new")
    public String test(){
        return "레슨명을 입력해 주세요.";
    }
}
