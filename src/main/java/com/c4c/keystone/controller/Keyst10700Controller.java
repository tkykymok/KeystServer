package com.c4c.keystone.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10700SaveQ;
import com.c4c.keystone.form.Keyst10700SaveS;
import com.c4c.keystone.form.Keyst10700SearchS;
import com.c4c.keystone.form.Keyst10700UpdateQ;
import com.c4c.keystone.form.Keyst10700UpdateS;
import com.c4c.keystone.service.impl.Keyst10700Service;

@RestController
@RequestMapping("/keyst10700")
public class Keyst10700Controller {

    @Autowired
    Keyst10700Service keyst10700Service;

    @Autowired
    protected MessageSource messageSource;

    @GetMapping("search")
    public ResponseEntity<Keyst10700SearchS> search(@RequestParam(value = "custCode", required = false) String custCode) {
        // レスポンスForm
        Keyst10700SearchS resForm = keyst10700Service.search(custCode);
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public ResponseEntity<Keyst10700SaveS> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10700SaveQ reqForm) {
        // レスポンスForm
        Keyst10700SaveS resForm = keyst10700Service.save(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"新規保存"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PutMapping(value = "update")
    public ResponseEntity<Keyst10700UpdateS> update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10700UpdateQ reqForm) throws ExclusiveException {
        // レスポンスForm
        Keyst10700UpdateS resForm = keyst10700Service.update(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"更新"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }
}
