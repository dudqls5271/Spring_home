package com.my.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.spring.service.impl.BoardService;

@Controller
@RequestMapping("/Main")
public class MainController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/test")
	public String test(Model model) {
	  model.addAttribute("viewAll", boardService.viewAll());
	  return "Main/test";
	}

}
