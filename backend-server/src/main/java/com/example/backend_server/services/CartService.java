package com.example.backend_server.services;

import com.example.backend_server.repositories.JPACartRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class CartService {
    private JPACartRepository repository;

    @Autowired
    public CartService(JPACartRepository repository) {this.repository = repository;}


}
