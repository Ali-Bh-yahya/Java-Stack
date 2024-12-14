package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("")
public class JavaController {
	@RequestMapping("/why")
	public String name() {
		return "Ali";
	}
	
	@RequestMapping("/hello/ez")
	public String welcome(@RequestParam(value = "q" , required = false) String serchQuery ) {
		return "Your Searched for :"+" "+ serchQuery;
	}
	
	
	

}
