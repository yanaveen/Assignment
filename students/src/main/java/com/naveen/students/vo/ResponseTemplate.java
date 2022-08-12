package com.naveen.students.vo;

import com.naveen.students.entity.Students;

public class ResponseTemplate {
	
	private Students students;
	
	private College college;

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public ResponseTemplate(Students students, College college) {
		super();
		this.students = students;
		this.college = college;
	}

	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
