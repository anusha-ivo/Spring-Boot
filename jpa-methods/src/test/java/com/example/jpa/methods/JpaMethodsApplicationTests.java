package com.example.jpa.methods;

import com.example.jpa.methods.entity.Student;
import com.example.jpa.methods.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaMethodsApplicationTests {
    @Autowired
    private StudentRepo repo;

	@Test
	void contextLoads() {
        Student s=new Student();
        s.setId(1);
        s.setAge(21);
        s.setName("anu");
        repo.save(s);

	}


}
