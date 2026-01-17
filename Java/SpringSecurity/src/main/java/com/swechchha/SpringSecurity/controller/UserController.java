package com.swechchha.SpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swechchha.SpringSecurity.model.Users;
import com.swechchha.SpringSecurity.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
//		System.out.println(user);
//		return "Success";
		return service.verify(user);
	}
}
