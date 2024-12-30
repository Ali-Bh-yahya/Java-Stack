package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;

import jakarta.validation.Valid;

@Controller
public class ProuductsControllers {

	@Autowired
	ProductsService proudectService;
	
	@GetMapping("/new/proudect")
	public String addProudect(@ModelAttribute("proudect") Products proudect) {
		return "new_proudect";
	}
	
	@PostMapping("/proudect")
	public String createCategory(Model model,@Valid @ModelAttribute("proudect") Products proudect, BindingResult res)
	{
		if(res.hasErrors()) {
			return "new_proudect";
		}
		else{
			model.addAttribute("proudect", proudectService.create(proudect));
			return "redirect:/";
		}
	}
	
	  @GetMapping("/proudect/{id}")
	    public String viewProudect(Model model , @PathVariable("id") Long id) {
	    	System.out.println(id);
	    		model.addAttribute("proudect", proudectService.findpProudectById(id));
	            return "view_book.jsp";
	       
	        }
	    
	  @PostMapping("/{id}/addCategory")
	  public String addCategoriesProudect(@PathVariable Long id, @RequestParam Long categoryId){
		  proudectService.addCategory(id , categoryId);
		  return "redirect:/proudect/"+id;
	  }
}
