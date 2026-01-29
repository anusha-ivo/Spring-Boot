package com.example.spring.boot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Queryyy {
    @Autowired
    JdbcTemplate j;
    public void run(){
        //j.update("create table student(name varchar(20),age int)");
        System.out.println("success");
        j.update("insert into student(name,age)values('anu',31)");
        j.update("insert into student(name,age)values('kav',36)");
        j.update("delete from student where name='anu'");
        j.update("update student set age=65 where name='kav'");

    }
    public void dis() {
        List<Map<String, Object>> res = j.queryForList("select * from student");
        for (Map<String, Object> r : res) {
            System.out.println(r);

        }
    }

}
