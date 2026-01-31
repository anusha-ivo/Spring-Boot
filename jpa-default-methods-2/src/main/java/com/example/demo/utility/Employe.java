package com.example.demo.utility;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Name;

@Entity
public class Employe {
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

    @Id
    private String name;
    private int age;

}
