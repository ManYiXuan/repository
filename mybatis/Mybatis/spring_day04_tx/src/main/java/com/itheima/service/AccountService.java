package com.itheima.service;

import com.itheima.domain.Account;

public interface AccountService {
    public void transfer(String sourceName, String targetName, Float money);
    public Account findById(Integer id);
}
