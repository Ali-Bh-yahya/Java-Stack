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

import com.example.demo.model.Project;
import com.example.demo.model.User;
import com.example.demo.model.UserLogin;
import com.example.demo.service.ProjectService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	@Autowired
	ProjectService projectService;

	@GetMapping("/")
	public String landingPage(Model model, @ModelAttribute("userLog") UserLogin userLog,
		@ModelAttribute("userReg") User user) {
//		model.addAttribute("userLog", new UserLogin());
//		model.addAttribute("userReg", new User());
		return "landingPage.jsp";
	}

	////////////{ Registration }//////////////
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userReg") User user, BindingResult res, HttpSession session,
			Model model) 
	{
		User userRegister = userService.register(user, res);
		if (res.hasErrors()) {
			model.addAttribute("userLog", new UserLogin());
			return "landingPage.jsp";
		}
		session.setAttribute("userLogin", userRegister);

		return "redirect:/home";
	}
	
	
		////////////{ login }////////////
	@PostMapping("/login")
	public String login(Model model, @Valid @ModelAttribute("userLog") UserLogin userLog, BindingResult res,
			HttpSession session) 
	{
		User userLogin = userService.login(userLog, res);
		if (res.hasErrors()) {
			model.addAttribute("userReg", new User());
			System.out.println(res.getAllErrors());
			return "landingPage.jsp";
		} else {
			session.setAttribute("userLogin", userLogin);
			return "redirect:/home";
		}
	}

	@GetMapping("/home")
	public String homePage(HttpSession session,Model model) {
	    if (session.getAttribute("userLogin") == null) {
	        return "redirect:/"; // Redirect to the login page if not logged in
	    }
	    User user = (User)session.getAttribute("userLogin");
	    Long user_id = user.getId();
	    
	    
	    model.addAttribute("joinedProjects", projectService.getLinkedProjects(user_id));
	    model.addAttribute("unJoinedProjects", projectService.findUnlinkedProjects(user_id));
	    return "home.jsp"; // Show the home page if logged in
	}

	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate(); // Invalidate session to log out the user
	    return "redirect:/";
	}
	
	
	@GetMapping("/new/project")
	public String createProjectPage(HttpSession session,@ModelAttribute("project") Project project) {
	    if (session.getAttribute("userLogin") == null) {
	        return "redirect:/"; // Redirect to the login page if not logged in
	    }
	    return "create_project.jsp"; // Show the create page if logged in
	}
	
	@PostMapping("/project")
	public String createProject(Model model,@Valid @ModelAttribute("project") Project project, BindingResult res,HttpSession session)
	{
		if(res.hasErrors()) {
			return "create_project.jsp";
		}
		else {
			User user = (User)session.getAttribute("userLogin");
			project.setTeamLead(user);
			Project proj =projectService.create(project);
			projectService.joinTeam(proj.getId(),user.getId());
			return "redirect:/home";
		}
	}
	
	@PostMapping("/join/team/{id}")
	public String joinTeam(HttpSession session,@PathVariable("id") Long project_id ) {
		User user = (User)session.getAttribute("userLogin");
		projectService.joinTeam(project_id,user.getId());
		return "redirect:/home";
	}
	
	@PostMapping("/leave/team/{id}")
	public String leaveTeam(HttpSession session,@PathVariable("id") Long project_id ) {
		User user = (User)session.getAttribute("userLogin");
		projectService.leaveTeam(project_id,user.getId());
		return "redirect:/home";
	}
	
	
	
	
	
}
