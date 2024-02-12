package com.preetamsinha.contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.preetamsinha.contactmanager.entity.Users;
import com.preetamsinha.contactmanager.repository.UserRepository;

@Controller
public class HomeController {

	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Home - Start Contact Manager");
		return "home";
	}

	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Start Contact Manager");
		return "about";
	}
	
}
