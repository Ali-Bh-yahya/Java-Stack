package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Address;
import com.example.demo.repositories.AddressRepository;

@Service
public class AddressService {
	private final AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	// Get All Address
	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}
}
