package com.c4c.keystone.enums;


public enum Os {
    Mac(1, "Mac"),
    Windows(2, "Windows");

    private final Integer code;
    private final String name;

    Os(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}
