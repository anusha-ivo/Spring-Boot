package com.example.jpa.use.repository;


import com.example.jpa.use.Utility;
import com.example.jpa.use.repository.Repositorycls;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest

@Rollback(false)
class RepositoryclsTest {
    @Autowired
     private Repositorycls repositorycls;
    @Test
    void savemth(){
        Utility u=new Utility();
        u.setHoby("dance");
        //u.setId(3);
        u.setName("ravsiwuw");
        u.setMarks(98);
       Utility res =repositorycls.save(u);
       System.out.println(res.getId());
       //System.out.println(res.toString());


    }
    @Test
    void update() {
        Integer id = 7;

        Optional<Utility> opt = repositorycls.findById(id);

        if (opt.isPresent()) {
            Utility u = opt.get();
            u.setMarks(67);
            u.setHoby("sing");
            u.setName("ramuwwhe");
            repositorycls.save(u);
        } else {
            System.out.println("No record found");
        }
    }



}