package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService ExpenseService;
	
	
	
	@GetMapping("/")
	public String addExpenses(Model model,@ModelAttribute("expense") Expense expense) {
		List <Expense> expenses = ExpenseService.findAllExpenses();
		model.addAttribute("expenses",expenses);
		return "index";
	}
	
	@PostMapping("/expenses")
	public String creatExpenses(Model model , @Valid @ModelAttribute("expense") Expense expense,BindingResult res)
	{
		if(res.hasErrors()) {
			model.addAttribute("expenses",ExpenseService.findAllExpenses());
			return "index";
		}
		else {
			ExpenseService.createExpense(expense);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String editExpenses(@PathVariable("id") Long id , Model model ) {
		Expense expense = ExpenseService.findExpense(id);
		
		model.addAttribute("expense" , expense);
		
		return "editExpense";
	}
	
	@PostMapping("/expenses/update")
	public String updateExpenses(Model model, @Valid @ModelAttribute("expense") Expense expense,BindingResult res)
	{
		if(res.hasErrors()) {
			model.addAttribute("expense",ExpenseService.findAllExpenses());
			return "editExpense";
		}
		else {
			ExpenseService.updateExpense(expense);
			return "redirect:/";
		}
		
	}
	
	  @PostMapping("/expenses/delete/{id}")
	    public String destroy(@PathVariable("id") Long id) {
		  ExpenseService.deleteExpense(id);
	        return "redirect:/";
	    }
	
	
	
}
