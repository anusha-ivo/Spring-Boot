package com.example.content.negotiation;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/person")
public class RestfullApiCreation {
    @PostMapping()
    public Person show(){
        return new Person(21,"anu");
    }
    @GetMapping(value = "/{age}",produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public Person read(@PathVariable Integer age){
        return new Person(age ,"anu");
    }

}
