package com.example.demo.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Expense;




@Repository
public interface  ExpenseRepo extends CrudRepository<Expense, Long> {

	    List<Expense> findAll();

}
