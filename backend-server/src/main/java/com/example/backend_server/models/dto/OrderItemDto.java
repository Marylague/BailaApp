package com.example.backend_server.models.dto;

import com.example.backend_server.models.entitys.OrderItem;
import com.example.backend_server.models.entitys.Outfit;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {

    private Long id;

    private Outfit outfit;

    private Integer quantity;

    private Double price;

    public OrderItemDto(OrderItem entity) {
        this.id = entity.getId();
        this.outfit = entity.getOutfit();
        this.quantity = entity.getQuantity();
        this.price = entity.getPrice();
    }
}
