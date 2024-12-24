package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;

@Controller
public class LoginAndRegistrationController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String regestrationUser(@ModelAttribute("userReg") User user ) {
		return "landingPage";
	}
	
	@PostMapping("/registration")
	public String checkRegestration(@Valid @ModelAttribute("userReg") User user , BindingResult res  ) {
		if(res.hasErrors()) {
			return "landingPage";
		}
		else {
			
			
			
			userService.createStudent(user, res);
			
			return "redirect:/";
		}
	}
	
	
	
	
	
}
