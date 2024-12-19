package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class JavaController {
	@RequestMapping("/")
	public String name(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("/process")
	public String welcome(@RequestParam(value = "nane" , required = false) String name ,
			RedirectAttributes redirectAttributes)
			{
				
		if (name == null || name.trim().isEmpty()) {
			redirectAttributes.addFlashAttribute("error", "Name cannot be empty!");
		}
			else {
				redirectAttributes.addFlashAttribute("success","Form submitted success Welcome "+ name +" !");
			}
		return "redirect:/";
		}
	
	
	

}
