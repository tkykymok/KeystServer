package com.c4c.keystone.exception;

import javax.security.sasl.AuthenticationException;

public class UserRegisterFailedException extends Exception {
    public UserRegisterFailedException() {
    }

    public UserRegisterFailedException(String msg) {
        super(msg);
    }

    public UserRegisterFailedException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
