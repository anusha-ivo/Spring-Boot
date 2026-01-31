package com.example.spring.boot.securityy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class Controllercls {
    @GetMapping()
    public String show(){
        return "by get request with security";
    }
    @PostMapping()
    public String dis(@RequestParam String name){
        return "name is" + name;

    }


}
