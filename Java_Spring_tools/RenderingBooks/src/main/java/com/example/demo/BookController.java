package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.axsos.Book.demo.Services.BookService;
import com.example.*;
import com.example.demo.models.Book;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/api/books/create")
    public Book createBook(
            @RequestParam(value="title") String title, 
            @RequestParam(value="description") String description, 
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
    	Book b = new Book(title, description,lang,numOfPages);
    	System.out.println("hi");
    	bookService.createBook(b);
        return b;
    }
	
	 @GetMapping("/api/books/{id}")
	    public Book update(
	            @PathVariable Long id, 
	            @RequestParam(value="title")  String title, 
	            @RequestParam(value="description") String desc, 
	            @RequestParam(value="language") String lang,
	            @RequestParam(value="pages") Integer numOfPages) {
	        Book book = new Book(title, desc,lang,numOfPages);
	        book.setId(id);
	        bookService.updateBook(book);
	        return book;
	    }
	 

	 @GetMapping("/api/books/delete/{id}")
	public void destroy(@PathVariable Long id,
			  @RequestParam(value="title")  String title, 
	            @RequestParam(value="description") String desc, 
	            @RequestParam(value="language") String lang,
	            @RequestParam(value="pages") Integer numOfPages
			) {
		 Book book = new Book(title, desc,lang,numOfPages);
	     book.setId(id);
		bookService.deleteBook(book);
	}
	 
	 
}
