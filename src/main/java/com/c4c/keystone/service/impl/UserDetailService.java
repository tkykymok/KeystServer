package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Example;
import com.c4c.keystone.entity.LoginUserDetails;
import com.c4c.keystone.enums.Role;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @Override
    public LoginUserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        Keyst0100Example keyst0100Example = new Keyst0100Example();
        keyst0100Example.createCriteria().andLoginIdEqualTo(loginId);

        Keyst0100 keyst0100 = keyst0100Mapper.selectByExample(keyst0100Example).get(0);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(Objects.requireNonNull(Role.getByCode(keyst0100.getAdminFlg())).getName()));

        return new LoginUserDetails(loginId, keyst0100.getLoginPw(), grantedAuthorities, keyst0100.getUserId(), keyst0100.getUserName(), keyst0100.getAdminFlg());
    }
}
