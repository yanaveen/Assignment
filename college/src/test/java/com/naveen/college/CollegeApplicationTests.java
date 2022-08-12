package com.naveen.college;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.CALLS_REAL_METHODS;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.college.entity.College;
import com.naveen.college.repository.CollegeRepository;

@SpringBootTest
class CollegeApplicationTests {
	
	@Autowired
	CollegeRepository colRepo;

	@Test	
	public void testCreate () {
		College c = new College();
		c.setId(105);
		c.setName("XYZ");
		c.setTotalsts(35);
		colRepo.save(c);
		assertNotNull(colRepo.findById(101).getId());
	}
}
