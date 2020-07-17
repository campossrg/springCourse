package com.personal.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/helloworld")
	public String indexPage(Model theModel) {
		
		theModel.addAttribute("theDate", new java.util.Date());
		
		return "helloworld";
	}
}
