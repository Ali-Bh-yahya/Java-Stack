package com.example.demo.service;

import java.util.Optional;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.Repo.UserRepository;
import com.example.demo.model.LoginUser;
import com.example.demo.model.User;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;
    
 
    public User register(User newUser, BindingResult bindingResult) {
        Optional<User> existingUser = userRepository.findByEmail(newUser.getEmail());
        if (existingUser.isPresent()) {
            bindingResult.rejectValue("email", "email.exists", "This email address was already used before. Please enter a different email address.");
        }

        if (!newUser.getPassword().equals(newUser.getConfirm())) {
            bindingResult.rejectValue("confirm", "Matches", "Passwords do not match.");
        }

        if (bindingResult.hasErrors()) {
            return null;
        }

        String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashedPassword);
        return userRepository.save(newUser);
    }

    public User login(LoginUser newLoginObject, BindingResult bindingResult) {
        Optional<User> existingUser = userRepository.findByEmail(newLoginObject.getEmail());
        if (existingUser.isEmpty()) {
            bindingResult.rejectValue("email", "NotFound", "No account with this email address was found. Please create a new user account.");
            return null;
        }

        User user = existingUser.get();

        if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            bindingResult.rejectValue("password", "Invalid", "Incorrect password.");
        }
        if (bindingResult.hasErrors()) {
            return null;
        }
        else {
            return user;
        }

    }
}