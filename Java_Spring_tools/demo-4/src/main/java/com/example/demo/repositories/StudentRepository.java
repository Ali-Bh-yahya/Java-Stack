package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;
import com.example.demo.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
	public List<Student> findAll();
	
}
