package com.c4c.keystone.service;

import com.c4c.keystone.form.Keyst10200DispSklShtS;
import com.c4c.keystone.form.Keyst10200InitS;

public interface IKeyst10200Service {
    Keyst10200InitS initialize(Integer userId);

    Keyst10200DispSklShtS displaySkillSheet(Integer skillSheetId);
}
