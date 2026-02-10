package com.example.backend_server.domainPart.inports;

import com.example.backend_server.domainPart.models.Cart;
import com.example.backend_server.domainPart.models.CartItem;

public interface UsingCartCases {
    void deleteItemInCart(CartItem cartItem);
    Cart viewCartItems(Long userId);
    CartItem addNewItem(Long productId);
}
