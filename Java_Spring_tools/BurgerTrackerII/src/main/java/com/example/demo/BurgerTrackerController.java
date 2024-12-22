package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Burger;
import com.example.demo.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerTrackerController {
	@Autowired
	BurgerService  burgerService;
	
	@GetMapping("/")
	public String landingPage(Model model , @ModelAttribute("burger") Burger burger) {
		List <Burger> burger1 = burgerService.findAll();
		model.addAttribute("burgers",burger1);
		return "index.jsp";
	}
	
	
	@PostMapping("/burger")
	public String creatBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result , Model model ) {
		if (result.hasErrors()) {
		    model.addAttribute("burgers", burgerService.findAll());
		    return "index.jsp";
		}
		else {
			burgerService.creatBurger(burger);
			return "redirect:/";
		}
	}
	
	@GetMapping("/burger/edit/{id}")
	public String editPage(Model model , @ModelAttribute("burger") Burger burger,@PathVariable("id") long id) {
		Burger burger1 = burgerService.findburger(id);
		model.addAttribute("burger",burger1);
		return "edit.jsp";
	}
	
	@PostMapping("/burger/{id}")
	public String editBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, @PathVariable int id ) {
		if (result.hasErrors()) {
		    return "edit.jsp";
		}
		else {
			burgerService.creatBurger(burger);
			return "redirect:/";
		}
	}
	
	
	
	
}
