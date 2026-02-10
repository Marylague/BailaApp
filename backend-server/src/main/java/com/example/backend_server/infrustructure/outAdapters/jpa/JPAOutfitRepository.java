package com.example.backend_server.infrustructure.outAdapters.jpa;


import com.example.backend_server.domainPart.models.Outfit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAOutfitRepository extends JpaRepository<Outfit, Long> {
}
