package com.c4c.keystone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0320;
import com.c4c.keystone.service.impl.Keyst10300Service;


@RestController
@RequestMapping("/keyst10300")
public class Keyst10300Controller {

    @Autowired
    Keyst10300Service keyst10300Service;

    @GetMapping("initialize")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public List<Keyst0300> initialize() {
        // レスポンスForm
//        Keyst10300InitS resForm = keyst10300Service.initialize();

        List<Keyst0300> keyst0300List = keyst10300Service.getAllReserveHeader();

        return keyst0300List;
    }

    @GetMapping("310")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public List<Keyst0310> initialize310() {
    	// レスポンスForm
//        Keyst10300InitS resForm = keyst10300Service.initialize();

    	List<Keyst0310> keyst0310List = keyst10300Service.getAllReserve310();

    	return keyst0310List;
    }
    @GetMapping("320")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public List<Keyst0320> initialize320() {
    	// レスポンスForm
//        Keyst10300InitS resForm = keyst10300Service.initialize();

    	List<Keyst0320> keyst0320List = keyst10300Service.getAllReserve320();

    	return keyst0320List;
    }





}
