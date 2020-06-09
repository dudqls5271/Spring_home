package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class MainController {
	
	@RequestMapping("home")
	public String main() {
		return "home";
	}
}
