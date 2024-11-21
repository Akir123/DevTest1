package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/wel")
	public String getWelcomeMsg() {
		String msg = "Welcome To Rest API";
		int i = 20/0;
		return msg;
	}
}
