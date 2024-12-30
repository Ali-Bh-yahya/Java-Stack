package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;
import com.example.demo.model.Products;
import com.example.demo.repo.CategoriesRepo;
import com.example.demo.repo.ProudectsRepo;

@Service
public class ProductsService {
	@Autowired
	ProudectsRepo proudectsRepo;
	
	@Autowired
	CategoriesRepo categoriesRepo;

	public Products create(Products c) {
		return proudectsRepo.save(c);
	}

	public List<Products> findAll() {
		return proudectsRepo.findAll();
	}

	public Products findpProudectById(Long id) {
		return proudectsRepo.findById(id).get();
	}

	public void addCategory(Long productId, Long categoryId) {
		Products product = findById(productId);
		Categories category  = categoriesRepo.findById(categoryId)(() -> new RuntimeException("Category not found "));
		prouduct.getCategories().add(category);
		pru
		
	}
	
	public Products findById(Long id) {
		Optional<Products> optionalProduct = proudectsRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
	}
}
