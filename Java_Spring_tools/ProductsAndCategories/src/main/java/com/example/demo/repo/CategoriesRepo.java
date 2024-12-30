package com.example.demo.repo;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categories;
import com.example.demo.model.Products;

@Repository
public interface CategoriesRepo extends CrudRepository<Categories, Long> {
	List<Category> findAllByProducts(Products product);
    List<Categories> findAll();

}