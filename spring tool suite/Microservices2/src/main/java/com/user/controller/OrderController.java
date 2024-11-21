package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.OrderEntity;
import com.user.entity.UserEntity;
import com.user.service.OrderService;
import com.user.service.UserClient;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@Autowired
	public UserClient userClient;
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderEntity> getOrderById(@PathVariable Long id) {
		OrderEntity orderEntity = orderService.getOrderById(id);
		return ResponseEntity.ok(orderEntity);
	}
	
	@PostMapping("/")
	public ResponseEntity<OrderEntity> createEntity(@RequestBody OrderEntity orderEntity) {
		OrderEntity orderEntity1 = orderService.createOrder(orderEntity);
		return ResponseEntity.ok(orderEntity1);
	}
	
	@GetMapping("/{orderId}/user/{userId}")
	public ResponseEntity<OrderEntity> getOrderWithUser(@PathVariable Long UserId, @PathVariable Long OrderId) {
		OrderEntity order = orderService.getOrderById(OrderId);
		if(order != null) {
			UserEntity userEntity = userClient.getUserById(UserId);
			order.setUser(userEntity);
			
		}
		return ResponseEntity.ok(order);
	}
}
