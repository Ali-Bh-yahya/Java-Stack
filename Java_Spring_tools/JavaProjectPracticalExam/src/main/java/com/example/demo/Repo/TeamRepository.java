package com.example.demo.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
	Optional<Team> findByName(String name);
	List<Team> findAll();
}