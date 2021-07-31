package com.c4c.keystone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.service.impl.Keyst10300Service;


@RestController
@RequestMapping("/keyst10300")
public class Keyst10300Controller {

    @Autowired
    Keyst10300Service keyst10300Service;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10300InitS> initialize(@RequestHeader("Authorization") String jwt) {
        // レスポンスForm
        Keyst10300InitS resForm = keyst10300Service.initialize();

//        List<Keyst0300> keyst0300List = keyst10300Service.getAllReserveHeader();

        return ResponseEntity.ok(resForm);
    }

    @GetMapping(value = "displayReserveInfo")
    public ResponseEntity<Keyst10300DispReserveInfoS> displayReserveInfo(@RequestParam("reserveId") Integer reserveId) {
        // レスポンスForm
    	Keyst10300DispReserveInfoS resForm = keyst10300Service.displayReserveInfo(reserveId);

        return ResponseEntity.ok(resForm);
    }

}
