package com.example.demo.controller;

import com.example.demo.entity.Entityy;
import com.example.demo.repository.Repositoryperson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class Controlleruse {
    @Autowired
    private Repositoryperson repo;
    @PostMapping()
    public Entityy show(@RequestBody Entityy en){
        return repo.save(en);
    }
    @GetMapping("/{id}")
    public Entityy getid(@PathVariable int id){
        return repo.findById(id).orElse(null);
    }
    @GetMapping()
public List<Entityy> all(){
        return repo.findAll();

    }
    @DeleteMapping("/{id}")
public String delete(@PathVariable Integer id){
         repo.deleteById(id);
         return "successfully deleted";
    }

}
