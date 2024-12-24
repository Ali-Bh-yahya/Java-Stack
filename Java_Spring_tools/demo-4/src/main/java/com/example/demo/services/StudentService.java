package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.models.Book;
import com.example.demo.models.Student;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
	// adding the book repository as a dependency
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> allStudents() {
		return this.studentRepository.findAll();
	}

	// creates a student
	public void createStudent(Student s, BindingResult res ) {
		if(!s.getPassword().equals(s.getConfirmPassword())) {
		    res.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
		} else {
			studentRepository.save(s);
		}
	}

	public Student findStudent(long id) {
		Optional<Student> optionalStudent= studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	
	public void updatedStudent(Student s) {
		studentRepository.save(s);
	}
	
	public void deleteStudent(Student s) {
		studentRepository.deleteById(s.getId());
	}
}
