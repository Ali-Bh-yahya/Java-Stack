package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.model.UserLogin;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookClubController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;

	@GetMapping("/")
	public String landingPage(@ModelAttribute("userLog") UserLogin userLog, @ModelAttribute("userReg") User user) {
		return "landingPage.jsp";
	}

////////////{ Registration }//////////////
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userReg") User user, BindingResult res, HttpSession session,
			Model model) {
		User userRegister = userService.register(user, res);
		if (res.hasErrors()) {
			model.addAttribute("userLog", new UserLogin());
			return "landingPage.jsp";
		}
		session.setAttribute("userLogin", userRegister);

		return "redirect:/home";
	}

////////////{ login }//////////////
	@PostMapping("/login")
	public String login(Model model, @Valid @ModelAttribute("userLog") UserLogin userLog, BindingResult res,
			HttpSession session) {
		User userLogin = userService.login(userLog, res);
		if (res.hasErrors()) {
			model.addAttribute("userReg", new User());
			System.out.println(res.getAllErrors());
			return "landingPage.jsp";
		} else {
			session.setAttribute("userLogin", userLogin);
			return "redirect:/home";
		}
	}

////////////{ logout }//////////////
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // Invalidate session to log out the user
		return "redirect:/";
	}

////////////{ show All books for the user }//////////////
	@GetMapping("/home")
	public String showBooks(Model model, HttpSession session) {
		if (session.getAttribute("userLogin") != null) {
			  if (bookService == null) {
		            throw new IllegalStateException("BookService is not initialized!");
		        }
			model.addAttribute("books", bookService.findAllBooks());
			return "home.jsp";
		} else {
			return "redirect:/";
		}
	}

////////////{ Add books to the database }//////////////

	@GetMapping("/book/new")
	public String addBook( Model model , @ModelAttribute("book") Book book ) {
		return "addBook.jsp";
	}

	@PostMapping("/book")
	public String creatBook(@Valid @ModelAttribute("book") Book book , BindingResult res ,HttpSession session) {
		if(res.hasErrors()) {
			return "addBook.jsp";
		}
		else {
		       book.setUser((User)session.getAttribute("userLogin"));
		       bookService.create(book);
		       return "redirect:/home";
		}
	}
	
	
    @GetMapping("/book/{id}")
    public String viewBook(Model model, HttpSession session, @PathVariable("id") Long id) {
    	System.out.println(id);
    	if (session.getAttribute("userLogin") != null) {
    		model.addAttribute("book", bookService.findBookById(id));
            return "view_book.jsp";
        }
        else {
            return "redirect:/";
        }
    }

}
