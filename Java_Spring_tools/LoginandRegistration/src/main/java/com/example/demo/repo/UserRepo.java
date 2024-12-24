package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepo extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String email);
	public List<User> findAll();
	
}
