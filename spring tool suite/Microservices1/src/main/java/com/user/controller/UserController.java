package com.user.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserEntity;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	public UserService userService;
	
	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
		UserEntity userEntity = userService.getUserById(id);
		return ResponseEntity.ok(userEntity);
	}
	
	@PostMapping("/")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
		UserEntity userEntity1 = userService.createUser(userEntity);
		return ResponseEntity.ok(userEntity1);
	}
}
