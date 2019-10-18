package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entities.users_f;
import com.login.repo.LoginRepo;

@RestController
public class LoginController {

	@Autowired
	private LoginRepo login;
	
	@GetMapping("/login")
	public String loginUser(@RequestBody users_f ref) {
		users_f record = login.findByName(ref.getName());
		if(record.getPassword().equals(ref.getPassword())) {
			return "You logged in";
		}
		return "Fudge off";
	}
	
	@GetMapping("/createUser")
	public String userCreation(@RequestBody users_f ref) {
		if(login.findByName(ref.getName()) == null) {
			login.save(ref);
			return "User created";
		}
		return "Username already used";
	}
}
