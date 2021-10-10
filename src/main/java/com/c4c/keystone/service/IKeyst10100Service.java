package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.form.Keyst10100SaveQ;
import com.c4c.keystone.form.Keyst10100SaveS;

public interface IKeyst10100Service {
    Keyst10100InitS initialize(String jwt);

    Keyst10100SaveS save(String jwt, Keyst10100SaveQ reqForm) throws ExclusiveException;

}
