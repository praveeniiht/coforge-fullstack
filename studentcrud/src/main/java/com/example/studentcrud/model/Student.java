package com.example.studentcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	int htno;
	
	String name;
	
	String branch;
	public Student() {
		
	}
	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
