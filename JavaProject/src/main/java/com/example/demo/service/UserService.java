package com.example.demo.service;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.model.User;
import com.example.demo.model.UserLogin;
import com.example.demo.repo.UserRepo;

import jakarta.validation.Valid;


@Service
public class UserService {
 @Autowired
 UserRepo userRepo;

public User register(@Valid User user, BindingResult res) {
    // Check if email is already taken
	Optional<User> potentialNewUser = userRepo.findByEmail(user.getEmail());
    // Reject if email is taken (present in database)
	if(potentialNewUser.isPresent()) {
		res.rejectValue("email", "email.Exsists", "This Email already exists!");
	}
	// Check if passwords match
	if(!user.getPassword().equals(user.getConfirm())) {
		res.rejectValue("password", "Not.Match", "this password is not Match !");
	}
	// Hash and set password, save user to database
	String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
	user.setPassword(hashedPassword);
	
    // Return null if result has errors
	if(res.hasErrors()) {
		return null ; 
	}
		return userRepo.save(user);
}

public User login(@Valid UserLogin userLog, BindingResult res) {
   // Find user in the DB by email
	Optional<User> potentialLoginUser = userRepo.findByEmail(userLog.getEmail());
	if(potentialLoginUser.isEmpty()) {
		res.rejectValue("email", "email.Exsists", "This Email Not exists!");
		return null;
	}
    // Get the user object
	User user = potentialLoginUser.get();
	
    // Reject if BCrypt password match fails
	if (!BCrypt.checkpw(userLog.getPassword(), user.getPassword())) {
        res.rejectValue("password", "Invalid", "Invalid Password!");
    }
	
    // Return null if result has errors
	if (res.hasErrors()) {
		return null;
	}
	return user;
}


 

 
 
 
}
