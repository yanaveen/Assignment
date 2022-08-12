package com.naveen.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.students.entity.Students;
import com.naveen.students.service.StudentService;
import com.naveen.students.vo.ResponseTemplate;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	StudentService stsService;
	
	@PostMapping
	public Students add(@RequestBody Students sts)
	{
		return stsService.add(sts);
	}
	
	@GetMapping
	public List<Students> listSts(){
		return stsService.list();
	}
	
	@GetMapping("/{stsId}")
	public ResponseTemplate stsWithCol(@PathVariable long stsId)
	{
		return stsService.stsWithCol(stsId);
	}
	
	@PutMapping("/{stsId}/{colId}")
	public String updateCollege(@PathVariable long stsId,@PathVariable long colId)
	{
		Students sts = stsService.assignCollege(stsId, colId);
		if(sts!=null)
		{
			return sts.toString();
		}
		return "Sorry. Department or Employee Not Found";
	}
	
	@GetMapping("/students-with-ascname/{col_id}")
	public List<Students> getByColId(@PathVariable long col_id)
	{
		return stsService.getByColId(col_id);
	}
	
	@GetMapping("/students-with-desc-age/{col_id}")
	public List<Students> getStudentsByCollegeWithDescAge(@PathVariable long col_id)
	{
		return stsService.getStudentsByCollegeWithDescAge(col_id);
		
	}

}
