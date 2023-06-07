package com.java.dto;

public class StudentId extends Student{
	public String id;
	public String password;
	
	public StudentId() {
	}
	
	public StudentId(String studentNum, String name, int grade, String major, String birth, String address,
			String contact, String state, String id, String password) {
		super(studentNum, name, grade, major, birth, address, contact, state);
		this.id = id;
		this.password = password;
	}
	
}
