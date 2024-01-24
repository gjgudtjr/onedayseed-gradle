package com.store.onedaySeed.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/lesson/new")
                .allowedOrigins("http://localhost:3000", "http://localhost:3000/lesson/new")
                .allowedMethods("GET", "POST")
                .allowedHeaders("Content-Type", "application/json")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
