package com.naveen.college.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naveen.college.entity.College;
import com.naveen.college.vo.RequestTemplate;



@Service
public interface CollegeService {
	College add(College col);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);
	List<RequestTemplate> listWithEmp();
	RequestTemplate specificDeptEmployee(long col_id);

}
