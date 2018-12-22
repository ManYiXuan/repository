package com.itheima.proxy.impl;

import com.itheima.cfg.Configuration;
import com.itheima.proxy.SqlSession;

public class SqlSessionImpl implements SqlSession {
    Configuration cfg;
    public SqlSessionImpl(Configuration cfg){
        this.cfg=cfg;
    }
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return null;
    }

    public void close() {

    }
}
