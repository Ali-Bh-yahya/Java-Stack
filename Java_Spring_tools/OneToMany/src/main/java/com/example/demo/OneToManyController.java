package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Dojo;
import com.example.demo.model.Ninja;
import com.example.demo.service.DojoService;
import com.example.demo.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class OneToManyController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;

	public OneToManyController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@GetMapping("/")
	public String addDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "adddojo";
	}

	@PostMapping("/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res) {
		if (res.hasErrors()) {

			return "adddojo";
		} else {
			dojoService.addDojo(dojo);
			return "redirect:/Show";
		}

	}

	@GetMapping("/ninja")
	public String addDojo(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "addninja";
	}

	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult res) {
		if (res.hasErrors()) {

			return "addninja";
		} else {
			ninjaService.addNinja(ninja);
			return "redirect:/Show";
		}
	}

	@GetMapping("/Show")
	public String ShowDojo(Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "show";
	}

}
