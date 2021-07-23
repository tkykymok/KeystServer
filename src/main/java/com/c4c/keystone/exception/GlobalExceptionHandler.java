package com.c4c.keystone.exception;

import com.c4c.keystone.form.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthenticationFailedException.class)
    protected ResponseEntity<Object> handleAuthenticationFailedException(AuthenticationFailedException ex) {
        String message = ex.getMessage();
        ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, new ArrayList<>());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errors);
    }

    @ExceptionHandler(UserRegisterFailedException.class)
    protected ResponseEntity<Object> handleUserRegisterFailedException(Exception ex) {
        String message = ex.getMessage();
        ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, new ArrayList<>());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
    }
}
