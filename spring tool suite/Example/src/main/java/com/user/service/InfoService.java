package com.user.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.Order;
import com.user.entity.Product;
import com.user.entity.User;

@Service
public class InfoService {

    public List<User> getUsers() {
        return Arrays.asList(
            new User(1L, "Alice"),
            new User(2L, "Bob")
        );
    }

    public List<Product> getProducts() {
        return Arrays.asList(
            new Product(1L, "Laptop"),
            new Product(2L, "Smartphone")
        );
    }

    public List<Order> getOrders() {
        return Arrays.asList(
            new Order(1L, "Order1"),
            new Order(2L, "Order2")
        );
    }
}
