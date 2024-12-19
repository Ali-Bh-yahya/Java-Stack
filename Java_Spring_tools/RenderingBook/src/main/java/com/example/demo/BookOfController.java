package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@Controller
public class BookOfController {
	private final BookService bookService;
	
	public BookOfController(BookService bookService){
		this.bookService = bookService;
	}
	@RequestMapping(value="/book/{id}" , method=RequestMethod.GET)
	public String viewBook(
			Model model,
			@PathVariable("id")Long id) {
		System.out.println("the ID : " + id + "########################");
		Book book = bookService.findBook(id);
	    if (book == null) {
	        System.out.println("No book found for ID: " + id + " ########################");
	    }
//		System.out.println("the Book ID : " + book.getId() + "########################");
		model.addAttribute("book",bookService.findBook(id));
		return "show";
	}
	
	
}
