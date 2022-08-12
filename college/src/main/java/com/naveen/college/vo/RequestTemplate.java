package com.naveen.college.vo;

import java.util.ArrayList;
import java.util.List;

import com.naveen.college.entity.College;



public class RequestTemplate {
	private College college;
	private List<Students> studentList = new ArrayList<Students>();
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Students> getstudentList() {
		return studentList;
	}
	public void setEmployeeList(List<Students> studentList) {
		this.studentList = studentList;
	}
	public RequestTemplate(College college, List<Students> studentList) {
		super();
		this.college = college;
		this.studentList = studentList;
	}
	public RequestTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
