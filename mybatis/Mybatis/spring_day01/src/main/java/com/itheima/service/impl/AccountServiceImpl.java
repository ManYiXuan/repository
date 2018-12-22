package com.itheima.service.impl;

import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDaoImpl accountDao;
    public AccountServiceImpl(AccountDaoImpl accountDao){
        this.accountDao=accountDao;
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
