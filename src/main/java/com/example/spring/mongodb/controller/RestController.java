package com.example.spring.mongodb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.mongodb.model.Course;
import com.example.spring.mongodb.model.Login;
import com.example.spring.mongodb.model.Student;
import com.example.spring.mongodb.repository.CourseRepo;
import com.example.spring.mongodb.repository.MongoDbRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	MongoDbRepository repository;
	
	@Autowired
	CourseRepo courseRepository;
	

	@PostMapping("/post")
	public ResponseEntity<Student> registerStudent(@RequestBody Student student){
		repository.save(student);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<ArrayList<Student>> getAllStudent()
	{
		ArrayList<Student> students=(ArrayList<Student>) repository.findAll();
		return new ResponseEntity<ArrayList<Student>>(students,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Login> loginStudent(@RequestBody Login login)
	{
		String success="Register Yourself first";
		ArrayList<Student> students=(ArrayList<Student>) repository.findAll();
		for(int i=0 ;i<students.size();i++)
		{
			if(login.getEmail().equals(students.get(i).getEmail()) && login.getPassword().equals(students.get(i).getPassword()))
			{
				return new ResponseEntity<Login>(login,HttpStatus.OK);
			}
		}
		return new ResponseEntity<Login>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/addCourse")
	public ResponseEntity<Course> addCourse(@RequestBody Course course)
	{
		courseRepository.save(course);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
	@GetMapping("/getAllCourse")
	public ResponseEntity<ArrayList<Course>> getAllCourse()
	{
		ArrayList<Course> courses=(ArrayList<Course>)courseRepository.findAll();
		return new ResponseEntity<ArrayList<Course>>(courses,HttpStatus.OK);
	}
	
}
