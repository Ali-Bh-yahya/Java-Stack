package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HelloHumanController {

	@RequestMapping("/")
	public String helloHuman(
	@RequestParam (value = "q" , defaultValue = "Human")  String name , 
	@RequestParam (value = "l" , defaultValue = " ") String lastName ) {
		
		return "Hello " + name +" "+ lastName;
	}
//	@RequestMapping("")

	
	
	

}
