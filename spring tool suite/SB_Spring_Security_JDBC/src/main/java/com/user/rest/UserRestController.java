package com.user.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
//this method access only admin
	@GetMapping(value = "/admin")
	public String admin() {
		return "<h3>Welcome Admin :)</h3>";
	}
//this method can access both admin and user
	@GetMapping(value = "/user")
	public String user() {
		return "<h3>Hello User :)</h3>";
	}
//this method can access anyone
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "<h3>Welcome :)</h3>";
	}

}
