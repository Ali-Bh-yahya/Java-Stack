package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}

	public void deleteBook(Book b) {
		bookRepository.deleteById(b.getId());		
	}

	public Book findBook(Long id) {
		 Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	}

}

