package com.example.spring.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongodb.model.Course;

public interface CourseRepo extends MongoRepository<Course, String> {

}
