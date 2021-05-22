package com.c4c.keystone.service;

import java.util.List;

public interface BaseService<E, S, U> {
    /**
     * PKによる検索を行います。
     *
     * @param EntityKey
     * @return
     */
    E selectByPk(S EntityKey);

    /**
     * 任意の条件による検索を行います。
     *
     * @param EntityExample
     * @return
     */
    List<E> select(U EntityExample);
}
