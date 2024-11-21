package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.exception.UserNotFoundException;

@RestController
public class UserRestController {

@GetMapping("/user/{userId}")
public String getUserName(@PathVariable("userId")Integer userId) throws Exception{
	if(userId == 300) {
		return "adi";
	}
	else if(userId == 400) {
		return "ashu";
	}
	else {
		throw new UserNotFoundException("User Not Found");
	}
}
}
