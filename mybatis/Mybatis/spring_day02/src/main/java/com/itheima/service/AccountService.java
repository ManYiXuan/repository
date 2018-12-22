package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //根据id查询
    public Account findById(Integer id);
    //添加账户
    public void addAccount(Account account);
    //修改账户
    public void updateAccount(Account account);
    //删除账户
    public void deleteAccount(Integer id);
}
