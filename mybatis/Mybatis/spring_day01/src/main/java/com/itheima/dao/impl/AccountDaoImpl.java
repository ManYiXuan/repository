package com.itheima.dao.impl;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class AccountDaoImpl implements AccountService {

    public void saveAccount(Account account) {
        System.out.println("添加账户...");
    }
}
