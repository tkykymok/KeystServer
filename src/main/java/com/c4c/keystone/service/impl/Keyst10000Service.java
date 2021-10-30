package com.c4c.keystone.service.impl;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst0400;
import com.c4c.keystone.entity.Keyst0400Example;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0400Mapper;
import com.c4c.keystone.service.IKeyst10000Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class Keyst10000Service implements IKeyst10000Service {

    @Autowired
    Keyst0400Mapper keyst0400Mapper;

    @Override
    public Keyst10000InitS initialize() {
        Keyst0400Example keyst0400Example = new Keyst0400Example();
        keyst0400Example.createCriteria()
                .andPostStartDateLessThanOrEqualTo(LocalDate.now())
                .andPostEndDateGreaterThanOrEqualTo(LocalDate.now())
                .andDeleteFlgEqualTo(Flag.OFF);

        List<Keyst0400> keyst0400List = keyst0400Mapper.selectByExample(keyst0400Example);


        List<Keyst10000InitS01> notificationList = new ArrayList<>();
        for (Keyst0400 keyst0400 : keyst0400List) {
            Keyst10000InitS01 tempKeyst10000InitS01 = new Keyst10000InitS01();
            BeanUtils.copyProperties(keyst0400, tempKeyst10000InitS01);
            notificationList.add(tempKeyst10000InitS01);
        }

        Keyst10000InitS resForm = new Keyst10000InitS();
        resForm.setNotificationList(notificationList);

        return resForm;
    }
}
