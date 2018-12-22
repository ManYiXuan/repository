package com.itheima.proxy;

import com.itheima.cfg.Configuration;
import com.itheima.proxy.impl.SqlSessionFactoryImpl;
import com.itheima.util.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream is){
        Configuration cfg= XMLConfigBuilder.loadConfiguration(is);

        return new SqlSessionFactoryImpl(cfg);
    }
}
