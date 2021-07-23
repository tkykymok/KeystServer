package com.c4c.keystone.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300Example;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0310Example;
import com.c4c.keystone.entity.Keyst0320;
import com.c4c.keystone.entity.Keyst0320Example;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.mapper.Keyst0320Mapper;
import com.c4c.keystone.service.IKeyst10300Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Keyst10300Service implements IKeyst10300Service {

	private final List<Keyst0300> keyst0300List = new ArrayList<>();
	private final List<Keyst0310> keyst0310List = new ArrayList<>();
	private final List<Keyst0320> keyst0320List = new ArrayList<>();

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

    @Override
    // cacheable アノテーションがあるとエラーが出た
    public List<Keyst0300> getAllReserveHeader() {
    	Keyst0300Example Keyst0300Example = new Keyst0300Example();
        List<Keyst0300> temp0300List = keyst0300Mapper.selectByExample(Keyst0300Example);
        log.info("Connected to DataBase");
        keyst0300List.addAll(temp0300List);
        return this.keyst0300List;
    }

    @Override
    public List<Keyst0310> getAllReserve310() {
    	Keyst0310Example Keyst0310Example = new Keyst0310Example();
        List<Keyst0310> temp0310List = keyst0310Mapper.selectByExample(Keyst0310Example);
        log.info("Connected to DataBase");
        keyst0310List.addAll(temp0310List);
        return this.keyst0310List;
    }

    @Override
    public List<Keyst0320> getAllReserve320() {
    	Keyst0320Example Keyst0320Example = new Keyst0320Example();
        List<Keyst0320> temp0320List = keyst0320Mapper.selectByExample(Keyst0320Example);
        log.info("Connected to DataBase");
        keyst0320List.addAll(temp0320List);
        return this.keyst0320List;
    }


}
