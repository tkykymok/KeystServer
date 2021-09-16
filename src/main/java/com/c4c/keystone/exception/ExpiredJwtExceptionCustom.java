package com.c4c.keystone.exception;

public class ExpiredJwtExceptionCustom extends Exception {
    public ExpiredJwtExceptionCustom() {
    }

    public ExpiredJwtExceptionCustom(String msg) {
        super(msg);
    }

    public ExpiredJwtExceptionCustom(String msg, Throwable ex) {
        super(msg, ex);
    }
}
