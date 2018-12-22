package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {
    public Account findById(Integer id);
    public Account findByName(String name);
    public void updateAccount(Account account);
}
