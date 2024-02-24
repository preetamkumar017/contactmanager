package com.preetamsinha.contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.preetamsinha.contactmanager.entity.Users;
import com.preetamsinha.contactmanager.helper.Message;
import com.preetamsinha.contactmanager.repository.UserRepository;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping({"/home","/"})
	public String home(Model model) {
		model.addAttribute("title", "Home - Start Contact Manager");
		return "home";
	}

	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Start Contact Manager");
		return "about";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register - Start Contact Manager");
		model.addAttribute("user", new Users());
		return "signup";
	}
	@PostMapping("/do_register")
	public String postMethodName(@Valid @ModelAttribute("user") Users user,BindingResult bindingResult,@RequestParam(value = "agreement",defaultValue = "false") Boolean agreement, Model model,HttpSession session) {
		//TODO: process POST request
		try{

			if(!agreement)
			{
				throw new Exception("You have not agrred ");
			}
			if(bindingResult.hasErrors())
			{
				System.out.println(bindingResult.toString());
				model.addAttribute("user", user);
				return "signup";
			}
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImageUrl("defult.png");
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			
			System.out.println(user);
			
			
			Users result =  this.userRepository.save(user);
			
			model.addAttribute("user", new Users());

			model.addAttribute("message", new Message("Successfully Registred!!","alert-success" ));

			return "signup";
		}catch (DataIntegrityViolationException e) {
		    e.printStackTrace();
		    model.addAttribute("user", user);
		    model.addAttribute("message", new Message("Email already exists. Please use a different email.", "alert-danger"));
		    return "signup";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user", user);
			model.addAttribute("message", new Message("Somthing Went wrong!!"+e.getMessage(),"alert-danger" ));

			return "signup";
			// TODO: handle exception
		}
	}
	
}
