package com.simplilearn.sportyshoes.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.model.User;

@RestController
public class EndUserController {

	@PutMapping("createaccount")
	public void createAccount(@RequestBody User user){
		
	}
	
	
}
