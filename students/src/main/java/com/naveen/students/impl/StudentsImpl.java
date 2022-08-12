package com.naveen.students.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.naveen.students.entity.Students;
import com.naveen.students.repository.StudentsRepository;
import com.naveen.students.service.StudentService;
import com.naveen.students.vo.College;
import com.naveen.students.vo.ResponseTemplate;

@Component
public class StudentsImpl implements StudentService {
	
	@Autowired
	private StudentsRepository stsRepo;
	
	@Autowired
	private RestTemplate  resTemplate;

	@Override
	public Students add(Students sts) {
		return stsRepo.save(sts);
	}

	@Override
	public List<Students> list() {
		return stsRepo.findAll();
	}

	@Override
	public Students searchById(long id) {
		return stsRepo.findById(id);
	}

	@Override
	public ResponseTemplate stsWithCol(long stsId) {
		ResponseTemplate RT = new ResponseTemplate();
		Students sts = stsRepo.findById(stsId);
		long col_id = sts.getCol_id();
		College col = resTemplate.getForObject("http://COLLEGE-SERVICE/college/"+col_id, College.class);
		RT.setCollege(col);
		RT.setStudents(sts);
		return RT;
	}

	@Override
	public Students assignCollege(long stsId, long colId) {
		Students sts = stsRepo.findById(stsId);
		College col = resTemplate.getForObject("http://COLLEGE-SERVICE/college/"+colId,College.class);
		if(sts==null || col==null)
		{
			return null;
		}
		sts.setCol_id(colId);
		stsRepo.save(sts);
		return sts;
	}

	@Override
	public List<Students> getByColId(long col_id) {
		return stsRepo.getByColId(col_id);
	}

	@Override
	public List<Students> getStudentsByCollegeWithDescAge(long col_id) {
		return stsRepo.getStudentsByCollegeWithDescAge(col_id);
	}

}
