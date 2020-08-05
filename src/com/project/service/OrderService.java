package com.project.service;

import com.project.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
