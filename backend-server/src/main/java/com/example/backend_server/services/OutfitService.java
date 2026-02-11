package com.example.backend_server.services;

import com.example.backend_server.exceptions.OutfitNotFoundException;
import com.example.backend_server.models.dto.OutfitDto;
import com.example.backend_server.models.entitys.Outfit;
import com.example.backend_server.repositories.JPAOutfitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class OutfitService {
    private final JPAOutfitRepository repository;

    @Autowired
    public OutfitService(JPAOutfitRepository repository) {this.repository = repository;}

    public OutfitDto save(OutfitDto dto) {
        return new OutfitDto(repository.save(new Outfit(dto)));
    }

    public OutfitDto getById(long id) {
        Optional<Outfit> toFind = repository.findById(id);
        if (toFind.isPresent()) {
            Outfit outfit = toFind.get();
            return new OutfitDto(outfit);
        }
        throw new OutfitNotFoundException("outfit with id " + id + "didn't exist");
    }

    public OutfitDto getByEntity(OutfitDto dto) {
        return getById(dto.getId());
    }

    public void deleteById(long id) {
        Optional<Outfit> toFind = repository.findById(id);
        if (toFind.isPresent()) {
            repository.deleteById(id);
            return;
        }
        throw new OutfitNotFoundException("outfit with id " + id + "didn't exist");
    }

    public void deleteByEntity(OutfitDto dto) {
        deleteById(dto.getId());
    }
}
