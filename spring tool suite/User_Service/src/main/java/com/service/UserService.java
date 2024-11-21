package com.service;

import org.springframework.stereotype.Service;

import com.entity.User;

@Service
public interface UserService {
User getUser(Long id);

} 
