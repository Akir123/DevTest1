package com.user.service;

import org.springframework.stereotype.Service;

import com.user.entity.UserEntity;

@Service
public interface UserService {
	public UserEntity getUserById(Long id);
	public UserEntity createUser(UserEntity user);
}
