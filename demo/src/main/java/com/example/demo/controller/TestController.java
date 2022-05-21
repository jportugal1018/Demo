package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("hello")
	public String displayHello() {
		return "Hello World";
	}

	@GetMapping("hello1")
	public List<String> hello() {
		List<String>list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		
		return list;
	}
	
}
