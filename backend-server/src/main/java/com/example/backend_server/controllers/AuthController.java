package com.example.backend_server.controllers;

import com.example.backend_server.models.dto.AuthResponse;
import com.example.backend_server.models.dto.LoginRequest;
import com.example.backend_server.models.dto.RegisterRequest;
import com.example.backend_server.models.dto.UserDto;
import com.example.backend_server.services.AuthService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthResponse register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void logout() {
        authService.logout();
    }

    @GetMapping("/me")
    public UserDto getCurrentUser() {
        return authService.getCurrentUser();
    }
}