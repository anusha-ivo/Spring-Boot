package com.example.exception.handling.springboot;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {
    @ExceptionHandler(RuntimeException.class)
    public String handle(RuntimeException ex){
        return ex.getMessage();

    }




}
