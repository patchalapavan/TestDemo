package com.vivaticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivaticket.data.model.User;
import com.vivaticket.servicesimpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userservice;
	
	@PostMapping("/user/create")
	public void createUser(@RequestBody User user) {
		//userservice.createUser(user);
		
	}
	
	@GetMapping("/user/getAllusers")
	public String getUser() {
		return "All Users";
		
	}
}
