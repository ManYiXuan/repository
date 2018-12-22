package com.itheima.proxy;

public interface SqlSession {
    <T> T getMapper(Class<T> daoInterfaceClass);
    void close();
}
