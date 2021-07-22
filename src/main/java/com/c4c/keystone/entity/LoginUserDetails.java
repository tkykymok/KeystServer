package com.c4c.keystone.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class LoginUserDetails extends User {

    private final Integer userId;
    private final String userName;
    private final String adminFlg;

    public LoginUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, Integer userId, String userName, String adminFlg) {
        super(username, password, authorities);
        this.userId = userId;
        this.userName = userName;
        this.adminFlg = adminFlg;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAdminFlg() {
        return adminFlg;
    }
}
