package com.example.backend_server.repositories;

import com.example.backend_server.models.entitys.Outfit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAOutfitRepository extends JpaRepository<Outfit, Long> {
}
