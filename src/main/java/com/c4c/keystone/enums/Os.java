package com.c4c.keystone.enums;


public enum Os {
    Mac("1", "Mac"),
    Windows("2", "Windows");

    private final String code;
    private final String name;

    Os(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}
