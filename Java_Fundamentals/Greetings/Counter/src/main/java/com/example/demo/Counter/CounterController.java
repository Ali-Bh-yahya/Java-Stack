package com.example.demo.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@RequestMapping("/counter")
	public String vistCount(HttpSession session) {
	    Integer count = (Integer) session.getAttribute("count");
	    if (count == null) {
	        count = 0; 
	    }
	    session.setAttribute("count", count);
	    return "current.jsp";
	}
	@RequestMapping("/")
	public String visitPage(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = 0;
		}
		else {
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
}
