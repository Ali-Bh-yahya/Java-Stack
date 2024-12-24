package com.example.demo.models;

import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ChangePassword {

    @NotNull
    @Size(min = 5, max = 200, message="Invalid username")
    private String currentPassword;
    
    @NotNull
    @Size(min = 5, max = 200)
    private String password;
    
    @Transient
    @NotNull
    @Size(min = 5, max = 200)
    private String confirm;
    
	public ChangePassword() {
	
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

}
