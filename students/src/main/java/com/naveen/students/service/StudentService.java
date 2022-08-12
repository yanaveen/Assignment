package com.naveen.students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naveen.students.entity.Students;
import com.naveen.students.vo.ResponseTemplate;

@Service
public interface StudentService {
	Students add(Students sts);
	List<Students> list();
	Students searchById(long id);
	ResponseTemplate stsWithCol(long stsId);
	Students assignCollege(long stsId, long colId);
	List<Students> getByColId(long col_id);
	List<Students> getStudentsByCollegeWithDescAge(long col_id);

}
