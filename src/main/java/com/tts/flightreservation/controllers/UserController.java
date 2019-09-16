package com.tts.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.flightreservation.entities.User;
import com.tts.flightreservation.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository user_repo;
	
	@RequestMapping("/showReg")
	public String showRegage() {
		return "login/registerUser";
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		user_repo.save(user);
		return "login/login";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = user_repo.findByEmail(email);
		if (user.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid UserName or Password. Try Again");
		}

		return "login/login";
	}



}
