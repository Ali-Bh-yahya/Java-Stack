package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;


@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;

	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}

	public void create(Book book) {
		bookRepo.save(book);
	}

	public Book findBookById(Long id) {
	Optional<Book> optionalBook = bookRepo.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	}

}
