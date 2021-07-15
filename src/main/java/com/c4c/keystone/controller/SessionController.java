package com.c4c.keystone.controller;

import com.c4c.keystone.entity.LoginUserDetails;
import com.c4c.keystone.form.AuthenticationQ;
import com.c4c.keystone.form.AuthenticationS;
import com.c4c.keystone.form.AuthenticationS1;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.impl.UserDetailService;
import com.c4c.keystone.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationS> createAuthenticationToken(@RequestBody AuthenticationQ authenticationQ) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationQ.getLoginId(), authenticationQ.getLoginPw())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect loginId or password", e);
        }

        final LoginUserDetails userDetails = userDetailService
                .loadUserByUsername(authenticationQ.getLoginId());

        AuthenticationS authenticationS = new AuthenticationS();
        authenticationS.setJwt(jwtTokenUtil.generateToken(userDetails)); // JSON Web Token

        AuthenticationS1 authenticationS1 = new AuthenticationS1(); // ログインユーザー情報
        authenticationS1.setUserId(userDetails.getUserId()); // ユーザーID
        authenticationS1.setUserName(userDetails.getUserName()); // ユーザー名
        authenticationS1.setAdminFlg(userDetails.getAdminFlg()); // 管理者フラグ
        authenticationS.setLoginUserInfo(authenticationS1);

        return ResponseEntity.ok(authenticationS);
    }

}
