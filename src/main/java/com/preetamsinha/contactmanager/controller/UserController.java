package com.preetamsinha.contactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping(value = "/index", method=RequestMethod.GET)
//	@ResponseBody
	public String dashboard() {
		return "normal/user_dashboard";
	}
	
}
