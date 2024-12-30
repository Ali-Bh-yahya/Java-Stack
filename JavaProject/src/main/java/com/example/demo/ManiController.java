package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Team;
import com.example.demo.model.User;
import com.example.demo.model.UserLogin;
import com.example.demo.service.TeamService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ManiController {
	@Autowired
	UserService userService;

	@Autowired
	TeamService teamService;

	@GetMapping("/")
	public String landingPage(Model model, @ModelAttribute("userLog") UserLogin userLog,
			@ModelAttribute("userReg") User user) {
//		model.addAttribute("userLog", new UserLogin());
//		model.addAttribute("userReg", new User());
		return "landingPage.jsp";
	}

	//////////// { Registration }//////////////
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userReg") User user, BindingResult res, HttpSession session,
			Model model) {
		User userRegister = userService.register(user, res);
		if (res.hasErrors()) {
			model.addAttribute("userLog", new UserLogin());
			return "landingPage.jsp";
		}
		session.setAttribute("userLogin", userRegister);

		return "redirect:/home";
	}

	//////////// { login }////////////
	@PostMapping("/login")
	public String login(Model model, @Valid @ModelAttribute("userLog") UserLogin userLog, BindingResult res,
			HttpSession session) {
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
	public String homePage(HttpSession session, Model model) {
	    if (session.getAttribute("userLogin") == null) {
	        return "redirect:/"; // Redirect to the login page if not logged in
	    }
	  
	    model.addAttribute("teams", teamService.findAll());
	    return "home.jsp"; // Show the home page if logged in
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // Invalidate session to log out the user
		return "redirect:/";
	}
   //Create the new team
	@GetMapping("/new/team")
	 public String newTeam(Model model, HttpSession session) {
    	if (session.getAttribute("loggedUser") == null) {
            return "redirect:/";
        }
        model.addAttribute("teams", new Team());
        return "create_team.jsp";
    }

	@PostMapping("/new")
	public String createTeam(@Valid @ModelAttribute Team team, BindingResult bindingResult, HttpSession session) {
    	team.setCreator((User)session.getAttribute("loggedUser"));
    	teamService.createTeam(team,bindingResult);
        if (bindingResult.hasErrors()) {
            return "new_team.jsp";
        }
        return "redirect:/home";
    }


}
