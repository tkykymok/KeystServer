package com.c4c.keystone.service;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200ExtraS01;
import com.c4c.keystone.entity.Keyst0200Key;

import java.util.List;

public interface IKeyst0200Service extends BaseService<Keyst0200, Keyst0200Key, Keyst0200Example> {
    /**
     * ExtraSQLS01による検索を行います。
     *
     * @param userId
     * @return
     */
    List<Keyst0200ExtraS01> select(String userId);

}
