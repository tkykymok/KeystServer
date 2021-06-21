package com.c4c.keystone.enums;

public enum Sample {
    Option1("1", "選択肢1"),
    Option2("2", "選択肢2");

    private final String code;
    private final String name;

    Sample(String code, String name) {
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
