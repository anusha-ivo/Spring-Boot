package com.example.custom.exception.spring.boot;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handler {
    @ExceptionHandler(Exceptionss.class)
    public String dis(Exceptionss ex){
        return ex.getMessage();

    }
}
