package com.example.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {
	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	// Get All Customers
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

}
