package com.example.jpa.custom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Customrepo extends JpaRepository<Entitycls, String> {

   public List<Entitycls> findByAge(int age);

    List<Entitycls> findByName(String name);
}
