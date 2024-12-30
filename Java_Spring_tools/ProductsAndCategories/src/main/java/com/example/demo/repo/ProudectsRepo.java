package com.example.demo.repo;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;
@Repository
public interface ProudectsRepo extends CrudRepository<Products, Long> {
	
	List<Products> findAll();
}
