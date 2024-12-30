package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Categories;
import com.example.demo.service.CategoriesService;

import jakarta.validation.Valid;

@Controller
public class CatogieriesController {
	@Autowired
	CategoriesService catogoriesService;
	
	@GetMapping("/new/category")
	public String addCategory(@ModelAttribute("category") Categories category) {
		return "new_category";
	}
	
	@PostMapping("/category")
	public String createCategory(Model model,@Valid @ModelAttribute("category") Categories category, BindingResult res)
	{
		if(res.hasErrors()) {
			
			return "new_category";
		}
		else {
			model.addAttribute("category", catogoriesService.create(category));
			return "redirect:/";
		}
	}
}
