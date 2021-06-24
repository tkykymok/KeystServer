package com.c4c.keystone.controller;

import com.c4c.keystone.enums.Os;
import com.c4c.keystone.form.Keyst10200InitS;
import com.c4c.keystone.service.impl.Keyst10200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/keyst10200")
public class Keyst10200Controller {

    @Autowired
    Keyst10200Service keyst10200Service;

    @GetMapping("")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<Keyst10200InitS> initialize() {
        // レスポンスForm
        Keyst10200InitS resForm = keyst10200Service.initialize();

        return ResponseEntity.ok(resForm);
    }

}
