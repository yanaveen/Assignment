package com.naveen.students;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.students.entity.Students;
import com.naveen.students.repository.StudentsRepository;

@SpringBootTest
class StudentsApplicationTests {
	
	@Autowired
	StudentsRepository stsRepo;

	@Test	
	public void testCreate () {
		Students s = new Students();
		assertNotNull(stsRepo.findById(1).getId());
	}
	
}
