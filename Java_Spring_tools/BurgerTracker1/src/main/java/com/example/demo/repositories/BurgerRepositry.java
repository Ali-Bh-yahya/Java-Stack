package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Burger;

@Repository
public interface BurgerRepositry extends CrudRepository<Burger, Long>{
    // this method retrieves all the books from the database
    List<Burger> findAll();
}

