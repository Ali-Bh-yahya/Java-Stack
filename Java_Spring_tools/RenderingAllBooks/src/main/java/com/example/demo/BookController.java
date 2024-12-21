package com.example.demo;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService){
		this.bookService = bookService;
	}
	@RequestMapping(value="/book" , method=RequestMethod.GET)
	public String viewBook(Model model,@PathVariable("id")Long id) {
		List <Book> book = bookService.allBooks();

		model.addAttribute("book",book);
		return "index";
	}
	
	
}
