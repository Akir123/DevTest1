package com.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.entity.UserEntity;

@FeignClient(name = "user-service", url = "http://localhost:8081/users")
public interface UserClient {

    @GetMapping("/users/{id}")
    UserEntity getUserById(@PathVariable("id") Long id);
}

