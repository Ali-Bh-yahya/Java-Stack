package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.model.Team;
import com.example.demo.repo.TeamRepo;

@Service
public class TeamService {
	@Autowired
	TeamRepo teamRepo;
	
	  public Team createTeam(Team newTeam, BindingResult bindingResult) {
	    	if (bindingResult.hasErrors()) {
	            return null;
	        }
	        Optional<Team> existingTeam = teamRepo.findByName(newTeam.getName());
	        if (existingTeam.isPresent()) {
	        	bindingResult.rejectValue("name", "name.exists", "This team name was already used before. Please enter a different name for your team.");
	        }

	        if (bindingResult.hasErrors()) {
	            return null;
	        }
	        return teamRepo.save(newTeam);
	    }
	    
	    public Team findById(Long id) {
	    	Optional<Team> optionalTeam = teamRepo.findById(id);
	        if(optionalTeam.isPresent()) {
	            return optionalTeam.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public void deleteTeam(Long id) {
	    	teamRepo.deleteById(id);
	    }
	    
	    public List<Team> findAll() {
	        return teamRepo.findAll();
	    }
	    
	    public void updateTeam(Team team) {
	    	teamRepo.save(team);
	    }
	    
	    public void addPlayer(Long teamId, String playerName) {
	        Team team = findById(teamId);
	        team.getPlayers().add(playerName);
	        teamRepo.save(team);
	    }

}
