package com.example.demo.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

@Table(name="burger")

public class Burger {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull (message = "Burger Name is required.")
    @Size(min = 5, max = 200)
    private String burgerName;
    
    @NotNull (message = "Restaurant Name is required.")
    @Size(min = 5, max = 200)
    private String restaurantName;
    
    @NotNull 
    @Size(min = 5 , max = 200)
    private String note;
    
    	

    @NotNull(message = "Rate is required.")
    @Min(value = 1, message = "Rate must be at least 1.")
    @Max(value = 5, message = "Rate must be at most 5.")
    
    private Integer rate;
    
    
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Burger() {
    }
    public Burger(String burgerName, String restaurantName, String note, Integer rate) {
        this.burgerName = burgerName;
        this.restaurantName = restaurantName;
        this.note = note;
        this.rate = rate;
    }
    
 // Getters and Setters

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
    
}


