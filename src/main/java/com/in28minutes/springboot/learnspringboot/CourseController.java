package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/course")
	public List<Course> Display(){
		
		return Arrays.asList(new Course(1, "AWS", "Utkarsh"), new Course(2, "Java", "Harsh"), new Course(3, "Microservices", "Vaibhav Gupta"));
		
//		return Arrays.asList(1, 2);
	}

}
