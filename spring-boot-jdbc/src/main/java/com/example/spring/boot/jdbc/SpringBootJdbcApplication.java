package com.example.spring.boot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(SpringBootJdbcApplication.class, args);
      Queryyy q =ac.getBean(Queryyy.class);
      q.run();
      q.dis();
	}

}
