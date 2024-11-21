package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.OrderEntity;
import com.user.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderEntity createOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    public OrderEntity getOrderWithUser(Long orderId, Long userId) {
        OrderEntity order = getOrderById(orderId);
        if (order != null && order.getUser() != null && order.getUser().getId().equals(userId)) {
            return order;
        }
        return null;
    }
}
