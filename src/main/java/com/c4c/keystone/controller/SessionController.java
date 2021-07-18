package com.c4c.keystone.controller;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.LoginUserDetails;
import com.c4c.keystone.exception.AuthenticationFailedException;
import com.c4c.keystone.exception.UserRegisterFailedException;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.impl.UserDetailService;
import com.c4c.keystone.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.util.ArrayList;

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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationS> createAuthenticationToken(@RequestBody AuthenticationQ authenticationQ) throws AuthenticationFailedException {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationQ.getLoginId(), authenticationQ.getLoginPw())
            );
        } catch (BadCredentialsException e) {
            throw new AuthenticationFailedException("Incorrect loginId or password");
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

    /**
     * 簡易ユーザー登録処理（テストユーザー作成の目的）
     *
     * @param signUpQ
     * @return
     */
    @PostMapping("signUp")
    public ResponseEntity<Object> signUp(@RequestBody SignUpQ signUpQ) throws UserRegisterFailedException {
        Keyst0100 keyst0100 = new Keyst0100();
        keyst0100.setUserName(signUpQ.getUserName());
        keyst0100.setLoginId(signUpQ.getLoginId());
        String encodedPw = passwordEncoder.encode(signUpQ.getLoginPw());
        keyst0100.setLoginPw(encodedPw);

        keyst0100.setUserNameKana("-");
        keyst0100.setAdminFlg(Flag.OFF);

        try {
            keyst0100Mapper.insert(keyst0100);
        } catch (Exception ex) {
            throw new UserRegisterFailedException("入力されたLoginIDは使用できません。");
        }

        return ResponseEntity.ok("OK");
    }

}
