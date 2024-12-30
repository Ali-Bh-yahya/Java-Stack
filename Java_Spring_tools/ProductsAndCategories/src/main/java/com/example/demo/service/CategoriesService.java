package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;
import com.example.demo.repo.CategoriesRepo;

@Service
public class CategoriesService {
	@Autowired
	CategoriesRepo categoroesRepo;

	public Categories create(Categories c) {
		return categoroesRepo.save(c);
	}

	public Object findAll() {
		return categoroesRepo.findAll();
	}

}
