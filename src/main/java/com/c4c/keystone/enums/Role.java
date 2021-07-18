package com.c4c.keystone.enums;

import java.util.Enumeration;

public enum Role {
    USER("0", "USER"),
    ADMIN("1", "ADMIN");

    private final String code;
    private final String name;

    Role(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }

    /**
     * 日本語名称からEnumを取得する
     *
     * @param code
     * @return
     */
    public static Role getByCode(String code) {
        for (Role role : Role.values()) {
            if (role.getCode().equals(code)) {
                return role;
            }
        }
        return null;
    }

}
