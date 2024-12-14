package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController


public class DaikichiController {

	@RequestMapping("/daikichi")
	public String displayWlcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
	public String display() {
		return "Todau you will find luckin all your endeavors!";
	}
	
	@RequestMapping("\"/daikichi/tomorrow")
	public String displayTomorrow() {
		return "Tomorrow , an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}
