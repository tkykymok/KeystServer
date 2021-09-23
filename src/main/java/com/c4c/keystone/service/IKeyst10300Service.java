package com.c4c.keystone.service;

import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.form.Keyst10300SaveQ;
import com.c4c.keystone.form.Keyst10300SaveQ1;
import com.c4c.keystone.form.Keyst10300UpdateQ;

public interface IKeyst10300Service {
    Keyst10300InitS initialize(int userId, Integer adminFlg, String team);

//    Keyst10300DispReserveInfoS displayReserveInfo(Integer reserveId);

    void save(String jwt, Keyst10300SaveQ reqForm);

    void reserve(String jwt, Keyst10300SaveQ1 reqForm);

    void saveComment(String jwt, Keyst10300UpdateQ reqForm);

    void delReserve(String jwt, Keyst10300UpdateQ reqForm);
}