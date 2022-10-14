package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class Welcome {
	
	@GetMapping(path="/students")
	public String getStudent() {
		return "Student Suresh";
		
		
	}
	@GetMapping(path="/teachers")
	public String getTeacher() {
		return "Teacher Thanvi";
		
	}
	@GetMapping(path="/staff")
	public String getstaff() {
		return "Staff Shilpa";

}
}