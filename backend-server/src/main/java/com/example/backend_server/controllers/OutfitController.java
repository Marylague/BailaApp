package com.example.backend_server.controllers;

import com.example.backend_server.models.dto.OutfitDto;
import com.example.backend_server.services.OutfitService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/outfit")
@RequiredArgsConstructor
//@PreAuthorize("isAuthenticated()")
public class OutfitController {
    private final OutfitService service;
    // штука для безопасности

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OutfitDto create(@RequestBody OutfitDto outfit) {
        // checks
        return service.save(outfit);
    }

    @DeleteMapping("/{id}")
    // @PreAuthorize("@securityService.canModifyPet(#id)")
    public void deleteById(@PathVariable long id) {
        service.deleteById(id);
    }

    @DeleteMapping("/entity")
    //@PreAuthorize("@securityService.canModifyPet(#pet.id)")
    public void deleteByEntity(@RequestBody OutfitDto outfit) {
        service.deleteByEntity(outfit);
    }

//    @PutMapping("/{id}")
//    @PreAuthorize("@securityService.canModifyPet(#id)")
//    public DataPet update(@RequestBody DataPet pet, @PathVariable(name = "id") long id) {
//        return service.update(pet, id);
//    }

    @GetMapping("/{id}")
    public OutfitDto getById(@PathVariable long id) {
        return service.getById(id);
    }

    @GetMapping("/entity")
    public OutfitDto getByEntity(@RequestBody OutfitDto outfit){return service.getByEntity(outfit);}
}
