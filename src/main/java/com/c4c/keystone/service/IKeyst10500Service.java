package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10500SaveQ;
import com.c4c.keystone.form.Keyst10500SaveS;
import com.c4c.keystone.form.Keyst10500SearchS;
import com.c4c.keystone.form.Keyst10500UpdateQ;
import com.c4c.keystone.form.Keyst10500UpdateS;

public interface IKeyst10500Service {
    Keyst10500SearchS search(String prjCode);

    Keyst10500SaveS save(String jwt, Keyst10500SaveQ reqForm) throws ExclusiveException;

    Keyst10500UpdateS update(String jwt, Keyst10500UpdateQ reqForm) throws ExclusiveException;
}
