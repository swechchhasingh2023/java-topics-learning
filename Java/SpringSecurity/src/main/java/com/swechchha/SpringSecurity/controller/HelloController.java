package com.swechchha.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
	@GetMapping("/")
	@ResponseBody
	public String greet(HttpServletRequest req) {
		return "Welcome to Home Page "+ req.getSession().getId();
	}
}
