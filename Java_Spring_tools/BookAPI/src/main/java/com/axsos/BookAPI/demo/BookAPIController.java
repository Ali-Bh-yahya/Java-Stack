package com.axsos.BookAPI.demo;

import org.springframework.web.bind.annotation.*;

import com.axsos.BookAPI.demo.Services.BookService;
import com.axsos.BookAPI.demo.models.Book;

@RestController
public class BookAPIController {
	private final BookService bookService ;

	public BookAPIController(BookService bookService){
	        this.bookService = bookService;
	    }
	
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
