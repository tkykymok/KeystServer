package com.c4c.keystone.service;

import java.util.List;

import com.c4c.keystone.form.Keyst10400FilteringS;
import com.c4c.keystone.form.Keyst10400InitS;

public interface IKeyst10400Service {
    List<Keyst10400InitS> initialize(String jwt);

    Keyst10400FilteringS filtering(String jwt);
}
