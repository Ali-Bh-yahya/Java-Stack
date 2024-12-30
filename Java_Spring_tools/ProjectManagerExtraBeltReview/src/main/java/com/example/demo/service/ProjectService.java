package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.model.User;
import com.example.demo.repo.ProjectRepo;
import com.example.demo.repo.UserRepo;

@Service
public class ProjectService {
	@Autowired
	ProjectRepo ProjectRepo;
	
	@Autowired
	UserRepo userRepo;

	public Project create(Project c) {
		return ProjectRepo.save(c);
	}

	public List<Project> findAll() {
		return ProjectRepo.findAll();
	}
	  public List<Project> getLinkedProjects(Long user_id) {
	        User user = userRepo.findById(user_id).get();
	        return user.getJoinedProjects();
	    }

    public List<Project> findUnlinkedProjects(Long user_id) {
        List<Project> allProjects = ProjectRepo.findAll();
        User user = userRepo.findById(user_id).get();
        allProjects.removeAll(user.getJoinedProjects());
        return allProjects;
    }

	public void joinTeam(Long project_id, Long user_id) {
		Project project = ProjectRepo.findById(project_id).get();
		User user = userRepo.findById(user_id).get();
		project.getTeamMembers().add(user);
		ProjectRepo.save(project);
	}
	
	public void leaveTeam(Long project_id, Long user_id) {
		Project project = ProjectRepo.findById(project_id).get();
		User user = userRepo.findById(user_id).get();
		project.getTeamMembers().remove(user);
		ProjectRepo.save(project);
	}
	
	

}
