package com.c4c.keystone.exception;

public class ExclusiveException extends Exception {
    public ExclusiveException() {
    }

    public ExclusiveException(String msg) {
        super(msg);
    }

    public ExclusiveException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
