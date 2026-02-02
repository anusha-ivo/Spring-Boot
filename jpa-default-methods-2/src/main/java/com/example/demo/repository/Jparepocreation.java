package com.example.demo.repository;

import com.example.demo.utility.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Jparepocreation extends JpaRepository<Employe,String> {

    List<Employe> getByAge(int age);

    void deleteByAge(int age);
}
