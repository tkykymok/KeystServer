package com.c4c.keystone.service;

import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300InitS;

public interface IKeyst10300Service {
    Keyst10300InitS initialize(Keyst0100Key userId);

    Keyst10300DispReserveInfoS displayReserveInfo(Integer reserveId);


}