package com.demoapp.security.controller;

public class AuthenticationException extends RuntimeException {

    private static final long serialVersionUID = 9165676210428525517L;

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
