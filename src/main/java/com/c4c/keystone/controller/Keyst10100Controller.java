package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import com.c4c.keystone.exception.ExclusiveException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.form.Keyst10100SaveQ;
import com.c4c.keystone.form.Keyst10100SaveS;
import com.c4c.keystone.form.Keyst10400InitS01;
import com.c4c.keystone.service.impl.Keyst10100Service;
import com.c4c.keystone.service.impl.Keyst5300Service;
import com.c4c.keystone.utils.JwtUtil;


@RestController
@RequestMapping("/keyst10100")
public class Keyst10100Controller {

    @Autowired
    Keyst10100Service keyst10100Service;
    @Autowired
    protected MessageSource messageSource;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10100InitS> initialize(@RequestHeader("Authorization") String jwt) {
        // レスポンスForm
        Keyst10100InitS resForm = keyst10100Service.initialize(jwt);
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public ResponseEntity<Keyst10100SaveS> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10100SaveQ reqForm) throws ExclusiveException {
        // レスポンスForm
        Keyst10100SaveS resForm = keyst10100Service.save(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"更新"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

}

