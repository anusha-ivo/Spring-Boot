package com.example.custom.exception.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlleruse {
    @GetMapping("/check")
    public String show(){
        throw new Exceptionss("exceptions accured");
    }

}
