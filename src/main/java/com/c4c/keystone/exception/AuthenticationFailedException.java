package com.c4c.keystone.exception;

import javax.security.sasl.AuthenticationException;

public class AuthenticationFailedException extends AuthenticationException {
    public AuthenticationFailedException() {
    }

    public AuthenticationFailedException(String msg) {
        super(msg);
    }

    public AuthenticationFailedException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
