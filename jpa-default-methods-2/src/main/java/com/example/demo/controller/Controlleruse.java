package com.example.demo.controller;

import com.example.demo.repository.Jparepocreation;
import com.example.demo.utility.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employ")
public class Controlleruse {
    @Autowired
    private Jparepocreation repo;
    @PostMapping()
    public Employe add(@RequestBody Employe em){
        return repo.save(em);
    }
    @GetMapping("/{age}")
    public List<Employe> getid(@PathVariable int age){
        return repo.getByAge(age);
    }
    @DeleteMapping("/{dlt}/{age}")
    public String dlt(@PathVariable Integer age ){
        repo.deleteByAge(age);
        return "success";

    }
    @GetMapping("/all")
    public List<Employe> getall(){
         return repo.findAll();
    }




}
