package com.example.demo.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentLogin {

	    @NotNull
	    @Size(min = 5, max = 200, message="Invalid username")
	    private String username;
	    
	    @NotNull
	    @Size(min = 5, max = 200, message="Invalid Password")
	    private String password;
	    
	    
	    public StudentLogin() {
	    	
	    }
	    

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    
	    
}
