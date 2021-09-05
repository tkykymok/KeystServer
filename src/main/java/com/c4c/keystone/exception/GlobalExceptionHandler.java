package com.c4c.keystone.exception;

import com.c4c.keystone.form.ApiErrors;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthenticationFailedException.class)
    protected ResponseEntity<Object> handleAuthenticationFailedException(AuthenticationFailedException ex) {
        List<String> messageList = Collections.singletonList(ex.getMessage());
        ApiErrors errors = new ApiErrors(LocalDateTime.now(), messageList);
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errors);
    }

    @ExceptionHandler(UserRegisterFailedException.class)
    protected ResponseEntity<Object> handleUserRegisterFailedException(Exception ex) {
        List<String> messageList = Collections.singletonList(ex.getMessage());
        ApiErrors errors = new ApiErrors(LocalDateTime.now(), messageList);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
    }

    @ExceptionHandler(ExclusiveException.class)
    protected ResponseEntity<Object> handleExclusiveException(Exception ex) {
        List<String> messageList = Collections.singletonList(ex.getMessage());
        ApiErrors errors = new ApiErrors(LocalDateTime.now(), messageList);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> messageList = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        ApiErrors errors = new ApiErrors(LocalDateTime.now(), messageList);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }

}
