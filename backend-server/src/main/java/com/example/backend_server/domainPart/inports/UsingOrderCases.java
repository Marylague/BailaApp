package com.example.backend_server.domainPart.inports;


import com.example.backend_server.domainPart.models.Cart;
import com.example.backend_server.domainPart.models.Order;

public interface UsingOrderCases {
    void deleteOrder(Order order);
    void placeOrder(Cart cart);
    void saveNewOrder(Order order);
    void updateOrder(Order order);
}
