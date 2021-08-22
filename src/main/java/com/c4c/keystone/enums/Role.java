package com.c4c.keystone.enums;

import java.util.Enumeration;

public enum Role {
    USER(0, "USER"),
    ADMIN(1, "ADMIN");

    private final Integer code;
    private final String name;

    Role(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
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
    public static Role getByCode(Integer code) {
        for (Role role : Role.values()) {
            if (role.getCode().equals(code)) {
                return role;
            }
        }
        return null;
    }

}
