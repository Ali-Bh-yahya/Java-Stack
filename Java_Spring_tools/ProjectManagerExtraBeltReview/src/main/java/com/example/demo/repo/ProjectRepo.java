package com.example.demo.repo;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Project;
import com.example.demo.model.User;

public interface ProjectRepo extends CrudRepository<Project, Long> {

	public List<Project> findAll();
	List<Project> findByTeamMembersNotContains(User user);
}
