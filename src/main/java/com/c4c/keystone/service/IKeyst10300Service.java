package com.c4c.keystone.service;

import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;

public interface IKeyst10300Service {
    Keyst10300InitS initialize(String jwt, String yearMonth);

//    Keyst10300DispReserveInfoS displayReserveInfo(Integer reserveId);

    void save(String jwt, Keyst10300SaveQ reqForm);

    void reserve(String jwt, Keyst10300ReserveQ reqForm) throws ExclusiveException;

    void saveComment(String jwt, Keyst10300UpdateQ reqForm) throws ExclusiveException;

    void cancelReserve(String jwt, Keyst10300CancelQ reqForm) throws ExclusiveException;

    void deleteLine(String jwt, Keyst10300DeleteQ reqForm);
}
