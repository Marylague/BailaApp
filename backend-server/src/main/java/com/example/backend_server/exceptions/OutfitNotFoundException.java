package com.example.backend_server.exceptions;

public class OutfitNotFoundException extends RuntimeException {
    public OutfitNotFoundException(String message) {
        super(message);
    }
}
