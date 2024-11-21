package com.user.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/greet")
public String greetMsg() {
	return "Good Evening";
}
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to our";
	}
	
	@GetMapping("/contact")
	public String contactMsg() {
		return "Contact to our";
	}
}