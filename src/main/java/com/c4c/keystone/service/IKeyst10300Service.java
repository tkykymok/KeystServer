package com.c4c.keystone.service;

import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300InitS;

public interface IKeyst10300Service {
    Keyst10300InitS initialize();

    Keyst10300DispReserveInfoS displayReserveInfo(Integer reserveId);


}