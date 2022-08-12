package com.naveen.students.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naveen.students.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
	
	Students findById(long id);

	@Query(value="SELECT * FROM students WHERE col_id=:col_id ORDER BY name ASC", nativeQuery = true)
	List<Students> getByColId(@Param("col_id") long col_id);
	
	@Query(value="SELECT * FROM students WHERE col_id=:col_id ORDER BY age DESC", nativeQuery = true)
	List<Students> getStudentsByCollegeWithDescAge(@Param("col_id") long col_id);

}
