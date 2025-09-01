package com.demoapp.security.service;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = -6895488559332428860L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
