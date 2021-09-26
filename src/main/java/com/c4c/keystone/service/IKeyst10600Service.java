package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;

public interface IKeyst10600Service {

    Keyst10600InitS initialize();

    Keyst10600SaveS save(String jwt, Keyst10600SaveQ reqForm);

    Keyst10600UpdateS update(String jwt, Keyst10600UpdateQ reqForm) throws ExclusiveException;

    Keyst10600DeleteS delete(String jwt, Keyst10600DeleteQ reqForm) throws ExclusiveException;

}
