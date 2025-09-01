package com.demoapp.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -504970585824380246L;

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        // This method is calling by spring security when user tries to access a secured REST resource without any credentials.
        // We return 401 to user, because there is no login page yet on this project.
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}