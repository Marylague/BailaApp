package com.example.backend_server.models.entitys;

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

    // Многие к одному: Много OrderItem могут быть в одном заказе
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    // Многие к одному: Много OrderItem могут ссылаться на один товар
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "outfit_id")
    private Outfit outfit;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price; // Цена на момент покупки
}
