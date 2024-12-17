package com.example.demo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldGameController {
	

	@GetMapping("/")
	public String landingPage(HttpSession session) {

		Integer gold = (Integer) session.getAttribute("gold");
		if (gold == null) {
			ArrayList<String> messages = new ArrayList<>();
			session.setAttribute("messages", messages);
			session.setAttribute("gold", 0);
		}
		return "index.jsp";
	}

	@RequestMapping(value="/processMoney" , method= RequestMethod.POST)
	public String processMoney(HttpSession session ,
			@RequestParam("key_of_place") String place
			) {

		ArrayList<String> messages = (ArrayList<String>) session.getAttribute("messages");
		
		Random rand = new Random();
		int rand_int1 = 0;
		String key = place;
		if("farm".equals(key))
		{ rand_int1 = rand.nextInt(20-10+1)+10;
		}
		if("cave".equals(key))
		{ rand_int1 = rand.nextInt(10-5+1)+5;
		}
		if("house".equals(key))
		{ 
			rand_int1 = rand.nextInt(5-2+1)+2;
		}
		if("casino".equals(key))
		{ 
			rand_int1 = rand.nextInt(50-(-50)+1)+(-50);
		}
		int earn = rand_int1 + (int) session.getAttribute("gold");
		session.setAttribute("gold", earn);
		messages.add("You entered a"+ key +" and earned " + rand_int1 + " gold.");
		session.setAttribute("messages", messages );
		return "redirect:/";
	}

}
