package com.example.exception.handling.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllercls {
  @GetMapping("/login")
    public String show(){
      if(true){
          throw new RuntimeException("something error accured");
      }
      else {
          return "return hello";
      }
  }


}
