package com.naveen.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {
	
	@Id
	@GeneratedValue
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
