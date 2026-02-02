package com.example.basic.unit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicUnitTestApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(BasicUnitTestApplication.class, args);
        Calculator c=ac.getBean(Calculator.class);
        int k=c.add(4,6);
        System.out.println(k);

	}

}
