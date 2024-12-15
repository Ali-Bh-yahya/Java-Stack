package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String GetDAshboard() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String GetDate() {
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String GetTime() {
		return "time.jsp";
	}
	
}
