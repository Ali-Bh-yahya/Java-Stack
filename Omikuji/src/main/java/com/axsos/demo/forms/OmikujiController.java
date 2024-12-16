package com.axsos.demo.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

	@RequestMapping("")
	public String landPage(){
		return"index.jsp";
	}
	
	@RequestMapping(value="/omikuji" , method = RequestMethod.POST)
	public String processPage(@RequestParam(value = "number") String number,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "name") String name,
			@RequestParam(value = "hobby") String hobby,
			@RequestParam(value = "animal") String animal,
			@RequestParam(value = "description") String description,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("description", description);
		return "redirect:/displayOmikuji" ;
	}
	@RequestMapping("/displayOmikuji")
	public String displayInf(HttpSession session,Model model) {
		model.addAttribute("number",session.getAttribute("number"));
		model.addAttribute("city",session.getAttribute("city"));
		model.addAttribute("name",session.getAttribute("name"));
		model.addAttribute("hobby",session.getAttribute("hobby"));
		model.addAttribute("animal",session.getAttribute("animal"));
		model.addAttribute("description",session.getAttribute("description"));
		
		return "displayInfo.jsp";
	}
	
	
	
}
