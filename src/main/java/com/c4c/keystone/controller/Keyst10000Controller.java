package com.c4c.keystone.controller;

import com.c4c.keystone.form.Keyst10000InitS;
import com.c4c.keystone.service.impl.Keyst10000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keyst10000")
@Log4j2
public class Keyst10000Controller {

    @Autowired
    Keyst10000Service keyst10000Service;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10000InitS> initialize() {
        // レスポンスForm
        Keyst10000InitS resForm = keyst10000Service.initialize();
        return ResponseEntity.ok(resForm);
    }

}
