package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Example;
import com.c4c.keystone.entity.LoginUserDetails;
import com.c4c.keystone.enums.Role;
import com.c4c.keystone.exception.AuthenticationFailedException;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @SneakyThrows
    @Override
    public LoginUserDetails loadUserByUsername(String loginId) {
        Keyst0100Example keyst0100Example = new Keyst0100Example();
        keyst0100Example.createCriteria().andLoginIdEqualTo(loginId);

        List<Keyst0100> keyst0100List = keyst0100Mapper.selectByExample(keyst0100Example);

        Keyst0100 keyst0100 = null;
        if (0 < keyst0100List.size()) {
            keyst0100 = keyst0100List.get(0);
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority(Objects.requireNonNull(Role.getByCode(keyst0100.getAdminFlg())).getName()));

            return new LoginUserDetails(loginId, keyst0100.getLoginPw(), grantedAuthorities, keyst0100.getUserId(), keyst0100.getUserName(), keyst0100.getAdminFlg());
        } else {
            throw new AuthenticationFailedException("Incorrect loginId or password");
        }
    }
}
