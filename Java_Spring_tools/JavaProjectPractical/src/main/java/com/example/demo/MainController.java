package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.LoginUser;
import com.example.demo.model.Team;
import com.example.demo.model.User;
import com.example.demo.service.TeamService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
    private UserService userService;
	
	@Autowired
    private TeamService teamService;
	
	
	 @GetMapping("/")
	    public String index(Model model, HttpSession session) {
	    	if (session.getAttribute("loggedUser") != null) {
	            return "redirect:/home";
	        }
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "landing_page.jsp";
	    }

	  @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult bindingResult,
	            HttpSession session,Model model) {
	        User loggedUser = userService.login(newLogin, bindingResult);
	        
	        if (bindingResult.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }
	        else {
	            session.setAttribute("loggedUser", loggedUser);
	            return "redirect:/home";
	        }
	    }
	  
	  @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult bindingResult,
	            Model model, HttpSession session){
	        User loggedUser = userService.register(newUser,bindingResult);
	        
	        if (bindingResult.hasErrors()) {
	            model.addAttribute("newLogin", new LoginUser());
	            return "index.jsp";
	        }
	        else {
	            session.setAttribute("loggedUser", loggedUser);
	            return "redirect:/home";
	        }
	    }
	  
	  @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "redirect:/";
	    }
	  
   

    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") != null) {
        	model.addAttribute("teams", teamService.findAll());
            return "home.jsp";
        }
        else {
            return "redirect:/";
        }
    }
    
    @GetMapping("/teams/new")
    public String newTeam(Model model, HttpSession session) {
    	if (session.getAttribute("loggedUser") == null) {
            return "redirect:/";
        }
        model.addAttribute("team", new Team());
        return "create_team.jsp";
    }
    
    @PostMapping("/teams/new")
    public String createTeam(@Valid @ModelAttribute Team team, BindingResult bindingResult, HttpSession session) {
    	team.setCreator((User)session.getAttribute("loggedUser"));
    	teamService.createTeam(team,bindingResult);
        if (bindingResult.hasErrors()) {
            return "create_team.jsp";
        }
        return "redirect:/home";
    }
    
    @GetMapping("/teams/{id}")
    public String viewTeam(@PathVariable Long id, Model model, HttpSession session) {
    	if (session.getAttribute("loggedUser") == null) {
            return "redirect:/";
        }
        Team team = teamService.findById(id);
        model.addAttribute("team", team);
        return "view.jsp";
    }
    
    @GetMapping("/teams/{id}/edit")
    public String viewEditBurger(@PathVariable Long id, Model model, HttpSession session) {
    	if (session.getAttribute("loggedUser") == null) {
            return "redirect:/";
        }
        Team team = teamService.findById(id);
        model.addAttribute("team", team);
        return "edit.jsp";
    }
    
    @PostMapping("/teams/{id}/addPlayer")
    public String addPlayerToTeam(@PathVariable Long id, @RequestParam(value="name") String name) {
    	teamService.addPlayer(id, name);
    	return "redirect:/teams/" + id;
    }
    
    @PostMapping("/teams/edit/{id}")
    public String updateBurger(@Valid @ModelAttribute("team") Team team, BindingResult result, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            teamService.updateTeam(team);
            return "redirect:/home";
        }
    }
    
    @PostMapping("/teams/{id}/delete")
    public String deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
        return "redirect:/home";
    }

  

   

  
}