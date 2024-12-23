package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ninja;
import com.example.demo.repo.NinjaRepo;


@Service
public class NinjaService {
	@Autowired
	NinjaRepo ninjaRepo;

	public void addNinja( Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	
}
