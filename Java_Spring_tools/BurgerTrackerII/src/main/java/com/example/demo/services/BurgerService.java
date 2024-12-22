package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Burger;
import com.example.demo.repositories.BurgerRepositry;

@Service
public class BurgerService {
	@Autowired
	BurgerRepositry burgerRepositry;

	public List<Burger> findAll() {
		return burgerRepositry.findAll();
	}

	public void creatBurger(Burger b) {
		burgerRepositry.save(b);

	}

	public Burger findburger(Long id) {
		Optional<Burger> optionalBurger = burgerRepositry.findById(id);
		return optionalBurger.orElse(null);
	}

}
