package com.vladveretilnyk.exception;

public class UserExistException extends Exception {
    private static String message = "User already exist!";

    public UserExistException() {
        super(message);
    }


    public UserExistException(String message) {
        super(message);
    }


    public UserExistException(Throwable cause) {
        super(cause);
    }

    public UserExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
