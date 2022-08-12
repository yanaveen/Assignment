package com.naveen.college.vo;

public class Students {
	private long id;
	private String name;
	private String gender;
	private int age;
	private String stream;
	private long col_id;
	public Students(long id, String name, String gender, int age, String stream, long col_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.stream = stream;
		this.col_id = col_id;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getCol_id() {
		return col_id;
	}
	public void setCol_id(long col_id) {
		this.col_id = col_id;
	}
	
	
	

}
