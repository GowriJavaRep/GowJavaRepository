package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping( "/getStudent")
	public List<Student> getStudent() {
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Gowri","Kumar"));
		studentList.add(new Student("Iniya","Kumar"));
		studentList.add(new Student("Oviya","Kumar"));
		studentList.add(new Student("Kumar","Perumal"));
		studentList.add(new Student("Gowri","Kumar"));
		studentList.add(new Student("Gowri","Kumar"));
		
		return studentList;
	}

}
