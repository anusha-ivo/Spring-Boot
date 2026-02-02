package com.example.jpa.methods.repository;

import com.example.jpa.methods.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByName(String name);


}
