package com.user.service;

import org.springframework.stereotype.Service;

import com.user.entity.OrderEntity;

@Service
public interface OrderService {
public OrderEntity getOrderById(Long id);
public OrderEntity createOrder(OrderEntity order);
}
