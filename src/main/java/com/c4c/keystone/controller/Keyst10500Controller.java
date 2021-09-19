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
import com.c4c.keystone.form.Keyst10500SaveQ;
import com.c4c.keystone.form.Keyst10500SaveS;
import com.c4c.keystone.form.Keyst10500SearchS;
import com.c4c.keystone.form.Keyst10500UpdateQ;
import com.c4c.keystone.form.Keyst10500UpdateS;
import com.c4c.keystone.service.impl.Keyst10500Service;

@RestController
@RequestMapping("/keyst10500")
public class Keyst10500Controller {

    @Autowired
    Keyst10500Service keyst10500Service;

    @Autowired
    protected MessageSource messageSource;

    @GetMapping("search")
    public ResponseEntity<Keyst10500SearchS> search(@RequestParam(value = "prjCode", required = false) String prjCode) {
        // レスポンスForm
        Keyst10500SearchS resFrom = keyst10500Service.search(prjCode);
        return ResponseEntity.ok(resFrom);
    }

    @PostMapping(value = "save")
    public ResponseEntity<Keyst10500SaveS> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10500SaveQ reqForm) {
        // レスポンスForm
        Keyst10500SaveS resForm = keyst10500Service.save(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"新規保存"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PutMapping(value = "update")
    public ResponseEntity<Keyst10500UpdateS> update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10500UpdateQ reqForm) throws ExclusiveException {
        // レスポンスForm
        Keyst10500UpdateS resForm = keyst10500Service.update(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"更新"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }
}
