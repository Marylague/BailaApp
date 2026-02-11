package com.example.backend_server.services;

import com.example.backend_server.models.dto.CartDto;
import com.example.backend_server.models.dto.OutfitDto;
import com.example.backend_server.models.entitys.Cart;
import com.example.backend_server.models.entitys.User;
import com.example.backend_server.repositories.JPACartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartService {
    private JPACartRepository repository;

    @Autowired
    public CartService(JPACartRepository repository) {this.repository = repository;}

    public CartDto save(CartDto dto, User user) {
        return new CartDto(repository.save(new Cart(dto, user)));
    }

    // update

    public CartDto getById(long id) {
        // + проверка
        return new CartDto(repository.getOne(id));
    }

    public CartDto getByEntity(CartDto dto) {
        return getById(dto.getId());
    }

    public void deleteById(long id) {
        // проверка на существование
        repository.deleteById(id);
    }

    public void deleteByEntity(CartDto dto) {
        deleteById(dto.getId());
    }

}
