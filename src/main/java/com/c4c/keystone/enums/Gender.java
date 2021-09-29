package com.c4c.keystone.enums;


public enum Gender {
    Male(1, "男"),
    Female(2, "女");

    private final Integer code;
    private final String name;

    Gender(Integer code, String name) {
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
