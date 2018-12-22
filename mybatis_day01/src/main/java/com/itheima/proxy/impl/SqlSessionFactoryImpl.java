package com.itheima.proxy.impl;

import com.itheima.cfg.Configuration;
import com.itheima.proxy.SqlSession;
import com.itheima.proxy.SqlSessionFactory;

public class SqlSessionFactoryImpl implements SqlSessionFactory {
    Configuration cfg;
    public SqlSessionFactoryImpl(Configuration cfg){
        this.cfg=cfg;
    }
    public SqlSession openSession() {
        return null;
    }
}
