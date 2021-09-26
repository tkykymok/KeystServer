package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import com.c4c.keystone.form.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.entity.Keyst0300ExtraS01;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.service.impl.Keyst10300Service;
import com.c4c.keystone.utils.JwtUtil;


@RestController
@RequestMapping("/keyst10300")
public class Keyst10300Controller {

    @Autowired
    Keyst0100Mapper Keyst0100Mapper;
    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst0310Mapper keyst0310Mapper;
    @Autowired
    Keyst10300Service keyst10300Service;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    protected MessageSource messageSource;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10300InitS> initialize(@RequestHeader("Authorization") String jwt, @RequestParam(value = "yearMonth", required = false) String yearMonth) {
        Keyst10300InitS resForm = keyst10300Service.initialize(jwt, yearMonth);
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public ResponseEntity<ResponseFormBase> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300SaveQ reqForm) {
    	keyst10300Service.save(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"登録"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "reserve")
    public ResponseEntity<ResponseFormBase> reserve(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300SaveQ1 reqForm) {
    	keyst10300Service.reserve(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
    	resForm.setMessages(messageSource.getMessage("I00001", new String[]{"予約"}, Locale.JAPAN));
    	return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "saveComment")
    public ResponseEntity<ResponseFormBase> saveComment(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300UpdateQ reqForm) {
        keyst10300Service.saveComment(jwt, reqForm);
        ResponseFormBase resForm = new ResponseFormBase() {};
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"登録"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "cancelReserve")
    public ResponseEntity<ResponseFormBase> cancelReserve(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300CancelQ reqForm) {
    	keyst10300Service.cancelReserve(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
    	resForm.setMessages(messageSource.getMessage("I00001", new String[]{"削除"}, Locale.JAPAN));
    	return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "deleteLine")
    public ResponseEntity<ResponseFormBase> deleteLine(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300DeleteQ reqForm) {
        keyst10300Service.deleteLine(jwt, reqForm);
        ResponseFormBase resForm = new ResponseFormBase() {};
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"削除"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

}
