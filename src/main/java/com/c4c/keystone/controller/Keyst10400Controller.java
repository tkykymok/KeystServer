package com.c4c.keystone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.form.Keyst10400InitS;
import com.c4c.keystone.form.Keyst10400FilteringS;
import com.c4c.keystone.service.impl.Keyst10400Service;

@RestController
@RequestMapping("/keyst10400")
public class Keyst10400Controller {

    @Autowired
    Keyst10400Service keyst10400Service;

    @GetMapping("initialize")
    public ResponseEntity<List<Keyst10400InitS>> initialize(@RequestHeader("Authorization") String jwt) {
        // レスポンスForm
        List<Keyst10400InitS> resFormList = keyst10400Service.initialize(jwt);
        return ResponseEntity.ok(resFormList);
    }

    @GetMapping("filtering")
    public ResponseEntity<Keyst10400FilteringS> filtering(@RequestHeader("Authorization") String jwt) {
        // レスポンスForm
        Keyst10400FilteringS resForm = keyst10400Service.filtering(jwt);
        return ResponseEntity.ok(resForm);
    }
}
