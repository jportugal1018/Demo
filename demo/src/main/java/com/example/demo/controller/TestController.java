package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class TestController {

	@GetMapping("hello")
	public String displayHello() {
		return "Hello World";
	}

	@GetMapping("hello1")
	public List<String> hello1() {
		List<String>list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		
		return list;
	}
	
	@GetMapping("hello2")
	public List<Student> hello2() {
		List<Student>students=new ArrayList<Student>();
		students.add(new Student(1L, "Mariam", "mariam.j@gmail.com", 18));
		
		return students;
	}
	
}
