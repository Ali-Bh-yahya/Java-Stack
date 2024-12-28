package com.example.demo.repo;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Book;
import com.example.demo.model.User;

public interface BookRepo extends CrudRepository<Book, Long> {

	public List<Book> findAll();
	List<Book> findByUser(User user);
}