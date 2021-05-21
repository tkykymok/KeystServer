package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200Key;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.service.IKeyst0200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Keyst0200ServiceImpl implements IKeyst0200Service {

    @Autowired
    private Keyst0200Mapper keyst0200Mapper;

    @Override
    public Keyst0200 selectByPk(Keyst0200Key keyst0200Key) {
        return keyst0200Mapper.selectByPrimaryKey(keyst0200Key);
    }

    @Override
    public List<Keyst0200> select(Keyst0200Example keyst0200Example) {
        return keyst0200Mapper.selectByExample(keyst0200Example);
    }
}
