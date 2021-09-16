package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100Example;
import com.c4c.keystone.mapper.Keyst5100Mapper;
import com.c4c.keystone.service.IKeyst5100Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = {"prjMaster"})
@Log4j2
public class Keyst5100Service implements IKeyst5100Service {

    @Autowired
    Keyst5100Mapper keyst5100Mapper;

    @Override
    public List<Keyst5100> getAllProjects() {
        Keyst5100Example keyst5100Example = new Keyst5100Example();
        return keyst5100Mapper.selectByExample(keyst5100Example);
    }
}
