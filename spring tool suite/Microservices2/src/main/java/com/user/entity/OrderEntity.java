package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDate;

    private Double orderAmount;

    @ManyToOne
    private UserEntity user; // This will handle the relationship with the user

    // Default constructor
    public OrderEntity() {}

    // Parameterized constructor
    public OrderEntity(String orderDate, Double orderAmount) {
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrderEntity [id=" + id + ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + ", user=" + user + "]";
    }
}
