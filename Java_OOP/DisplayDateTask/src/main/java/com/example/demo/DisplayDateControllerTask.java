package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;

import java.util.Date;
@Controller
public class DisplayDateControllerTask {


		@RequestMapping("/")
		public String getDAshboard() {
			return "index.jsp";
		}
		
		@RequestMapping("/date")
		public String getDate(Model model) {
			String currentDate = new SimpleDateFormat("E,M MM , y").format(new Date());
			model.addAttribute("currentDate",currentDate);
			return "date.jsp";
		}
		
		@RequestMapping("/time")
		public String getTime(Model model) {
			String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
			model.addAttribute("currentTime",currentTime);
			return "time.jsp";
	}
}
