package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.User;


@Service
public class UserServiceImpl implements UserService {

    private List<User> list = List.of(
        new User(1311L, "Aditya", "1234567899"),
        new User(1311L, "Limesh", "1234567856"),
        new User(1312L, "Suke", "1284567899"),
        new User(1313L, "Fuke", "1234507899")
       
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

