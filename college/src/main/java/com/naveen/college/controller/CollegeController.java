package com.naveen.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.college.entity.College;
import com.naveen.college.service.CollegeService;
import com.naveen.college.vo.RequestTemplate;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService colService;
	
	@PostMapping
	public College add(@RequestBody College dept)
	{
		return colService.add(dept);
	}
	
	@GetMapping
	public List<College> list()
	{
		return colService.list();
	}
	
	@GetMapping("/{id}")
	public College searchById(@PathVariable long id)
	{
		return colService.searchById(id);
	}
	
	@GetMapping("/all-department-employee")
	public List<RequestTemplate> listWithEmp()
	{
		return colService.listWithEmp();
	}
	
	@GetMapping("/department-with-employee/{dept_id}")
	public RequestTemplate specificDeptEmp(@PathVariable long dept_id)
	{
		return colService.specificDeptEmployee(dept_id);
	}
	

}
