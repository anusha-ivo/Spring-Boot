package com.example.versioning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controlleruse {
    @GetMapping(params = "version=1")
    public String show(){
        return " from version 1";
    }
    @GetMapping(params = "version=2")
    public String shows(){
        return "from version v2";
    }
    @GetMapping("/v4")
    public String dis(){
        return "from v4";
    }
    @GetMapping(headers = "x-application=v3")
    public String see(){
        return "from v3";
    }


}
