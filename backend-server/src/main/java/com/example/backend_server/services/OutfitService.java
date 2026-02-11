package com.example.backend_server.services;

import com.example.backend_server.models.dto.OutfitDto;
import com.example.backend_server.models.entitys.Outfit;
import com.example.backend_server.repositories.JPAOutfitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OutfitService {
    private JPAOutfitRepository repository;

    @Autowired
    public OutfitService(JPAOutfitRepository repository) {this.repository = repository;}

    public OutfitDto save(OutfitDto dto) {
        return new OutfitDto(repository.save(new Outfit(dto)));
    }

    public OutfitDto getById(long id) {
        // ошибка если не существует
        return new OutfitDto(repository.getOne(id));
    }

    public OutfitDto getByEntity(OutfitDto dto) {
        return getById(dto.getId());
    }

    public void deleteById(long id) {
        // проверка на существование
        repository.deleteById(id);
    }

    public void deleteByEntity(OutfitDto dto) {
        deleteById(dto.getId());
    }
}
