package com.sprinboot.first.service;

import com.springboot.first.app.Student;

public final class StudentServiceImpl implements StudentInterface {

	StudentServiceImpl obj; 
	
	public Student getStudent() {
		// TODO Auto-generated method stub
		System.out.println("Student Id = "+ StudentInterface.id);
		return obj.getStudent();
	}

}
