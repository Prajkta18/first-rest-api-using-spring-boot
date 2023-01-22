package com.prowings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		
		return"hello!!";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		
		Student s1 = new Student();
		
		s1.setRoll(1);
		s1.setName("Ram");
		s1.setAddress("Pune");
		System.out.println(s1);
				return s1;
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(2, "Sham", "Pune"));
		list.add(new Student(3, "Sita", "Mumbai"));
		list.add(new Student(4, "Praj", "Delhi"));
		
		return list;
	}
}
