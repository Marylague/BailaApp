package com.example.backend_server.repositories;

import com.example.backend_server.models.entitys.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAUserRepository extends JpaRepository<User, Long> {
}
