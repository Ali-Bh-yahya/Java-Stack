package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class PathVariablesController {
	//daikichi/travel/kyoto
	@RequestMapping("/daikichi/travel/{city}")
	public String printCity(@PathVariable String city) {
		return "'Congratulations! You will soon travel to "+ city +"!";
	}
	@RequestMapping("/daikichi/lotto/{num}")
	public String printMessage(@PathVariable int num ) {
		if(num%2 == 0) {
			return "You will take a grand journey in the near future but be wary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
	}
	
	
}
