package com.example.backend_server.models.dto;

import com.example.backend_server.models.entitys.Cart;
import com.example.backend_server.models.entitys.CartItem;
import com.example.backend_server.models.entitys.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    Long Id;

    private Long userId;

    private List<CartItemDto> cartItems = new ArrayList<>();

    public CartDto(Cart entity) {
        this.Id = entity.getId();
        this.userId = entity.getUser().getId();
        if (entity.getCartItems() != null) {
            this.cartItems = entity.getCartItems().stream()
                    .map(CartItemDto::new)
                    .collect(Collectors.toList());
        } else {
            this.cartItems = Collections.emptyList();
        }
    }

}
