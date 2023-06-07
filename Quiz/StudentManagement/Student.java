package com.java.dto;

import java.util.UUID;

public class Student {
	//학생정보(학교명,학번, 이름, 학년, 학과, 생년월일, 주소, 연락처,상태)
	
	public static String school="미래고";
	public String studentNum;
	public String name ="----";
	public int grade = -1;
	public String major ="";
	public String birth = "XXXX-XX-XX";
	public String address ="";
	public String contact ="XXX-XXXX-XXXX";
	public String state="재학";
	
	{ 
		studentNum="230601";
		for(int i=0;i<3;i++) {
			studentNum+=(int)(Math.random()*10);
		}
		
		String tempStr = UUID.randomUUID().toString()
				.replace("-","").substring(0,(int)(Math.random()*11+4));
		name=tempStr;
		
		
	}
	static { }
	
	// 기본생성자 생성자
	public Student() {}

	
	public Student(String studentNum, String name, int grade) {
		this(studentNum,name,grade,"","","","","");
	}


	public Student(String studentNum, String name, int grade, String major, String birth, String address,
			String contact, String state) {
		this.studentNum = studentNum;
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.birth = birth;
		this.address = address;
		this.contact = contact;
		this.state = state;
	}
}
