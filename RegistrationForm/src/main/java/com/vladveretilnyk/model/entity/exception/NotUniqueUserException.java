package com.vladveretilnyk.model.entity.exception;

public class NotUniqueUserException extends Exception {
    public NotUniqueUserException(String message) {
        super(message);
    }
}
