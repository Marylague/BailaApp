package com.example.backend_server.repositories;

import com.example.backend_server.models.entitys.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPACartRepository extends JpaRepository<Cart, Long> {
}
