package com.naveen.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.college.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
	College findById(long id);
}
