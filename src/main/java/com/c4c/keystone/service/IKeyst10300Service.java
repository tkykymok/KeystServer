package com.c4c.keystone.service;

import java.util.List;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0320;
import com.c4c.keystone.form.Keyst10300InitS;

public interface IKeyst10300Service {
    Keyst10300InitS initialize();

    List<Keyst0300> getAllReserveHeader();
    List<Keyst0310> getAllReserve310();
    List<Keyst0320> getAllReserve320();
}