package com.example.backend_server.repositories;

import com.example.backend_server.models.entitys.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAOrderRepository extends JpaRepository<Order, Long> {

}
