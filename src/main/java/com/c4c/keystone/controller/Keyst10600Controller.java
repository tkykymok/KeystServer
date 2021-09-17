package com.c4c.keystone.controller;

import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst0210Mapper;
import com.c4c.keystone.service.impl.Keyst10600Service;
import com.c4c.keystone.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;


@RestController
@RequestMapping("/keyst10600")
@Log4j2
public class Keyst10600Controller {

    @Autowired
    Keyst10600Service keyst10600Service;
    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst0210Mapper keyst0210Mapper;
    @Autowired
    protected MessageSource messageSource;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10600InitS> initialize(@RequestHeader("Authorization") String jwt) {
        // レスポンスForm
        Keyst10600InitS resForm = keyst10600Service.initialize();
        return ResponseEntity.ok(resForm);
    }

    @PostMapping("save")
    public ResponseEntity<Keyst10600SaveS> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10600SaveQ reqForm) {
        // レスポンスForm
        Keyst10600SaveS resForm = keyst10600Service.save(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"新規保存"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PutMapping("update")
    public ResponseEntity<Keyst10600UpdateS> update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10600UpdateQ reqForm) {
        // レスポンスForm
        Keyst10600UpdateS resForm = keyst10600Service.update(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"新規保存"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }


}
