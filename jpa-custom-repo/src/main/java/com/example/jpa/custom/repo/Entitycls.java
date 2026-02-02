package com.example.jpa.custom.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entitycls {
    @Id
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Entitycls(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Entitycls(){

    }
}
