package com.example.spring.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongodb.model.Student;

public interface MongoDbRepository extends MongoRepository<Student, String> {
	

}


