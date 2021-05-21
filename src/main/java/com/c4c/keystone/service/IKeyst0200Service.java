package com.c4c.keystone.service;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200Key;

import java.util.List;

public interface IKeyst0200Service {
    Keyst0200 selectByPk(Keyst0200Key keyst0200Key);

    List<Keyst0200> select(Keyst0200Example keyst0200Example);
}
