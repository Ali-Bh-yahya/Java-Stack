package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dojo;
import com.example.demo.repo.DojoRepo;


@Service
public class DojoService {
	@Autowired
	DojoRepo dojoRepo;

	public void addDojo(Dojo dojo) {
		// TODO Auto-generated method stub
		dojoRepo.save(dojo);
	}

	public List <Dojo> getAllDojos() {
		// TODO Auto-generated method stub
		return dojoRepo.findAll();
	}

	
	
}
