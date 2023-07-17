package com.example.common.config;

import com.example.common.aop.LogAspect;
import com.example.common.handler.GlobalExceptionHandler;
import com.example.common.handler.ResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }

    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
    @Bean
    public ResponseHandler responseHandler() {
        return new ResponseHandler();
    }


}
