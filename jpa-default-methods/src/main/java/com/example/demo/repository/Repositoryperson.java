package com.example.demo.repository;

import com.example.demo.entity.Entityy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface Repositoryperson extends JpaRepository<Entityy,Integer> {



}
