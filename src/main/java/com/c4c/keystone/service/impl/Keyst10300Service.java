package com.c4c.keystone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.mapper.Keyst0320Mapper;
import com.c4c.keystone.service.IKeyst10300Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Keyst10300Service implements IKeyst10300Service {

    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst0310Mapper keyst0310Mapper;
    @Autowired
    Keyst0320Mapper keyst0320Mapper;

    @Override
    @Transactional
    public Keyst10300InitS initialize() {
        // レスポンスForm
        Keyst10300InitS resForm = new Keyst10300InitS();

        return resForm;
    }


}
