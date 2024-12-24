package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.CustomerService;


@Controller
public class CustomerController {
	
	private final CustomerService cs;
	public CustomerController(CustomerService cs) {
		this.cs = cs;
	}
	
	@RequestMapping("/customers")
	public String getAllCustomer(Model m) {
		m.addAttribute("customers", cs.getAllCustomers());
		return "customer.jsp";
		
		
	}
	
	

}
