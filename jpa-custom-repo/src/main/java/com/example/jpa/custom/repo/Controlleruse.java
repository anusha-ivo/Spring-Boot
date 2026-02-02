package com.example.jpa.custom.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/custom")
public class Controlleruse {
    @Autowired
    private Customrepo repo;

   @PostMapping()
    public Entitycls add(@RequestBody Entitycls entitycls){
       return repo.save(entitycls);
   }
   @GetMapping("/{age}")
    public List<Entitycls> show(@PathVariable int age){
       return repo.findByAge(age);
   }
   @GetMapping("/namepart")
    public List<Entitycls> get(@RequestParam String name){
       return repo.findByName(name);
   }


}
