package com.example.backend_server.models.entitys;

import com.example.backend_server.models.dto.OrderItemDto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "order_items")
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "outfit_id")
    private Outfit outfit;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price;

    public OrderItem(OrderItemDto dto) {
        this.id = dto.getId();
        this.outfit = dto.getOutfit();
        this.quantity = dto.getQuantity();
        this.price = dto.getPrice();
    }
}
