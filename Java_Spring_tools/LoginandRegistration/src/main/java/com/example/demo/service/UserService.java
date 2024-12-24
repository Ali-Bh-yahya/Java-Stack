package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;



public class UserService {
 @Autowired
 UserRepo userRepo;

 public User register(User newUser, BindingResult result) {
     // TO-DO: Additional validations!
	 Optional<User> user = userRepo.findByEmail(newUser.getEmail());
	 return user;
 }
 
 
public void createStudent(User user, BindingResult res) {
	
	
}
 
 
 
 
}
