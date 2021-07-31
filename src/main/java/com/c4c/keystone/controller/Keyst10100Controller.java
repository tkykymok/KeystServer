package com.c4c.keystone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.service.impl.Keyst10100Service;


@RestController
@RequestMapping("/keyst10100")
public class Keyst10100Controller {

    @Autowired
    Keyst10100Service keyst10100Service;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10100InitS> initialize() {
        // レスポンスForm
        Keyst10100InitS resForm = keyst10100Service.initialize();
        System.out.println(resForm);

        return ResponseEntity.ok(resForm);
    }

}
