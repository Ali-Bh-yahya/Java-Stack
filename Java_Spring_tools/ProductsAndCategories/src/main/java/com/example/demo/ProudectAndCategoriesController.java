package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CategoriesService;
import com.example.demo.service.ProductsService;

@Controller
public class ProudectAndCategoriesController {

	@Autowired
	CategoriesService catogoriesService;
	@Autowired
	ProductsService productsServisce;
	@GetMapping("/")
	public String showTable(Model model) {
		model.addAttribute("catogories" , catogoriesService.findAll());
		model.addAttribute("proudects",productsServisce.findAll() );
		return "home_page";
	}
	
	
	
}
