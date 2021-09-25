package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10700SaveQ;
import com.c4c.keystone.form.Keyst10700SaveS;
import com.c4c.keystone.form.Keyst10700SearchS;
import com.c4c.keystone.form.Keyst10700UpdateQ;
import com.c4c.keystone.form.Keyst10700UpdateS;

public interface IKeyst10700Service {
    Keyst10700SearchS search(String custCode);

    Keyst10700SaveS save(String jwt, Keyst10700SaveQ reqForm) throws ExclusiveException;

    Keyst10700UpdateS update(String jwt, Keyst10700UpdateQ reqForm) throws ExclusiveException;
}
