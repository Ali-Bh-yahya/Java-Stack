package com.axsos.BookAPI.demo.Services;

import org.springframework.stereotype.Service;

import com.axsos.BookAPI.demo.Repository.BookRepository;
import com.axsos.BookAPI.demo.models.Book;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}

	public void deleteBook(Book b) {
		bookRepository.deleteById(b.getId());		
	}


	


	
	
	
	
	
}
