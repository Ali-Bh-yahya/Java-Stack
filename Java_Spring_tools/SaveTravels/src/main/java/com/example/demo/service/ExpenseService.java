package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Expense;
import com.example.demo.repo.ExpenseRepo;


@Service
public class ExpenseService {
	@Autowired
	ExpenseRepo ExpenseRepo;

	public List<Expense> findAllExpenses() {
		
		return ExpenseRepo.findAll();
	}
	
	  public Expense findExpense(Long id) {
	        Optional<Expense> optionalExpense = ExpenseRepo.findById(id);
	        return optionalExpense.orElse(null);
	    }
	  public Expense createExpense(Expense exp) {
		  return ExpenseRepo.save(exp);
	  }

	public void updateExpense(Expense expense) {
		ExpenseRepo.save(expense);
	}

	public void deleteExpense(Long id) {
		ExpenseRepo.deleteById(id);
		
	}

}
