package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "index";
	}
	
	
	@PostMapping("/burger")
	public String creatBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result , Model model ) {
		if (result.hasErrors()) {
		    model.addAttribute("burgers", burgerService.findAll());
		    return "index";
		}
		else {
			burgerService.creatBurger(burger);
			return "redirect:/";
		}
	}
	
	
	
}
