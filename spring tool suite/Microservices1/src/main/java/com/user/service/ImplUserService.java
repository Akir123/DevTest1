package com.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserEntity;
import com.user.repository.UserRepository;

@Service
public class ImplUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity getUserById(Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}

