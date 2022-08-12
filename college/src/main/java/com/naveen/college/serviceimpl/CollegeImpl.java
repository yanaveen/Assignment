package com.naveen.college.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.naveen.college.entity.College;
import com.naveen.college.repository.CollegeRepository;
import com.naveen.college.service.CollegeService;
import com.naveen.college.vo.RequestTemplate;
import com.naveen.college.vo.Students;


@Component
public class CollegeImpl implements CollegeService {
	
	@Autowired
	CollegeRepository colRepo;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public College add(College dept) {
		return colRepo.save(dept);
	}

	@Override
	public List<College> list() {
		return colRepo.findAll();
	}

	@Override
	public College update(long id, String name) {
		College dept = colRepo.findById(id);
		dept.setName(name);
		return colRepo.save(dept);
	}

	@Override
	public College searchById(long id) {
		if(colRepo.findById(id)==null)
		{
			return null;
		}
		return colRepo.findById(id);
	}

	@Override
	public List<RequestTemplate> listWithEmp() {
		List<RequestTemplate> fullList = new ArrayList<RequestTemplate>();
		List<College> allDept = this.list();
		Iterator<College> ir = allDept.iterator();
		while(ir.hasNext())
		{
			College dpt = ir.next();
		ResponseEntity<Students[]> response = restTemplate.getForEntity( "http://STUDENTS-SERVICE/employee/employee-with-ascname/"+dpt.getId(),Students[].class);
		Students[] students = response.getBody();
			List<Students> emps = Arrays.asList(students);
 			RequestTemplate RTm = new RequestTemplate();
			RTm.setCollege(dpt);
			RTm.setEmployeeList(emps);
			fullList.add(RTm);
		}
		return fullList;
	}

	@Override
	public RequestTemplate specificDeptEmployee(long col_id) {
			College college  = this.searchById(col_id);
					
					ResponseEntity<Students[]> response =restTemplate.getForEntity("http://EMPLOYEE-SERVICE/employee/employee-with-desc-age/"+college.getId(),Students[].class);
					Students[] students = response.getBody();
					List<Students> employees = Arrays.asList(students);
					RequestTemplate requestTemplate = new RequestTemplate();
					
					requestTemplate.setCollege(college);
					requestTemplate.setEmployeeList(employees);
					
					return requestTemplate;
	}
	

}
