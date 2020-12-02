package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	
	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		
		
		theStudents.add(new Student("phat","vo"));
		theStudents.add(new Student("phat","van"));
		theStudents.add(new Student("phat","van222"));
		
		
	}

	
	@GetMapping("/students")
	public List<Student> getStudent(){
		
		return theStudents;
	}
	
	//dèine enpoint
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		
		//check the student id against list size
		if((studentId >= theStudents.size())) {
			throw new StudentNotFoundException("student not found --"+studentId);
		}
		return theStudents.get(studentId);
	}
	
	
	
}
