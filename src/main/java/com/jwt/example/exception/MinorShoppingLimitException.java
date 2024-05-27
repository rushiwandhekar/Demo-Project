package com.jwt.example.exception;

public class MinorShoppingLimitException extends RuntimeException {
    public MinorShoppingLimitException(String message) {
        super(message);
    }
}
