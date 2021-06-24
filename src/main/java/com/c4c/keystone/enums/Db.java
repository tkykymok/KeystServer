package com.c4c.keystone.enums;


public enum Db {
    Oracle_Database("1", "Oracle"),
    MySQL("2", "MySQL"),
    PostgreSQL("3", "PostgreSQL"),
    SQL_Server("4", "SQL Server"),
    MongoDB("5", "MongoDB");

    private final String code;
    private final String name;

    Db(String code, String name) {
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
