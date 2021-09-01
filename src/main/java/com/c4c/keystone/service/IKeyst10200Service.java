package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;

public interface IKeyst10200Service {
    Keyst10200InitS initialize(Integer userId);

    Keyst10200DispSklShtS displaySkillSheet(Integer skillSheetId);

    Keyst10200SaveS save(String jwt, Keyst10200SaveQ reqForm);

    Keyst10200UpdateS update(String jwt, Keyst10200UpdateQ reqForm) throws ExclusiveException;
}
