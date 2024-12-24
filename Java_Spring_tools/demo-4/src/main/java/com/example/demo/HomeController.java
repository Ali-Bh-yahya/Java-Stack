package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Book;
import com.example.demo.models.Student;
import com.example.demo.models.StudentLogin;
import com.example.demo.services.BookService;
import com.example.demo.services.StudentService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	private final BookService bookService;
	private final StudentService studentService;

	@Autowired
	public HomeController(BookService bookService, StudentService studentService) {
		this.bookService = bookService;
		this.studentService = studentService;
	}

	@RequestMapping("/")
	public String index(Model model, @ModelAttribute("student") Student student) {
		List<Student> students = studentService.allStudents();
		model.addAttribute("students", students);
		return "index.jsp";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("studentsignup") Student student) {
		return "signup.jsp";
	}

	@RequestMapping(value = "/usersignup", method = RequestMethod.POST)
	public String userSignup(@Valid @ModelAttribute("studentsignup") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "signup.jsp";
		} else {
			studentService.createStudent(student, result);
			return "redirect:/home";

		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("studentLogin") StudentLogin student) {
		return "login.jsp";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String userLogin(@Valid @ModelAttribute("studentLogin") StudentLogin student,
			BindingResult result) {
		if (result.hasErrors()) {
			return "login.jsp";
		}
		else {
			System.out.println(student.getUsername());
			System.out.println(student.getPassword());
			
			return "redirect:/home";	
		}
		
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public String showStudent(@PathVariable("id") long id, Model model) {
		// System.out.println("hi");
		model.addAttribute("student", studentService.findStudent(id));
		// System.out.println(studentService.findStudent(id));

		return "show.jsp";
	}

	@RequestMapping(value = "/editstudent/{id}", method = RequestMethod.GET)
	public String editUser(@PathVariable("id") long id, Model model, @ModelAttribute("student") Student student) {
		model.addAttribute("student", studentService.findStudent(id));
		return "edit.jsp";
	}

	@RequestMapping( value = "/edit" , method = RequestMethod.POST)
	public String editUser(@Valid @ModelAttribute("student") Student student,
			BindingResult result) {
	if (result.hasErrors()) {
		return "index.jsp";
	}
	else {
		studentService.updatedStudent(student);
		return "redirect:/";
	}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteUser(@ModelAttribute("student") Student student) {
			studentService.deleteStudent(student);
			return "redirect:/";
		

	}
}
