package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, How are u ?";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, How are u ?";
	}
	
	@GetMapping("/no")
	public String sayBye() {
		return "No";
	}
	
	@GetMapping("/login")
	public String sayLogin() {
		return "Login";
	}
}
