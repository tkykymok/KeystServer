package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.entity.Keyst5300Example;
import com.c4c.keystone.mapper.Keyst5300Mapper;
import com.c4c.keystone.service.IKeyst5300Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = {"skillMaster"})
@Log4j2
public class Keyst5300Service implements IKeyst5300Service {

    private final List<Keyst5300> keyst5300List = new ArrayList<>();

    @Autowired
    Keyst5300Mapper keyst5300Mapper;

    @Override
    @Cacheable
    public List<Keyst5300> getAllSkills() {
        Keyst5300Example keyst5300Example = new Keyst5300Example();
        List<Keyst5300> temp5300List = keyst5300Mapper.selectByExample(keyst5300Example);
        log.info("Connected to DataBase");
        keyst5300List.addAll(temp5300List);
        return this.keyst5300List;
    }

}
