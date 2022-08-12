package com.naveen.students.vo;

public class College {
	
	private long id;
	private String name;
	private int totalsts;
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
	public int getTotalsts() {
		return totalsts;
	}
	public void setTotalsts(int totalsts) {
		this.totalsts = totalsts;
	}
	public College(long id, String name, int totalsts) {
		super();
		this.id = id;
		this.name = name;
		this.totalsts = totalsts;
	}
	public College() {
		super();
	}
	
	

}
