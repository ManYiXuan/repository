package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        Account source = accountDao.findByName(sourceName);
        Account target = accountDao.findByName(targetName);

        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);

        accountDao.updateAccount(source);
//        int i=1/0;
        accountDao.updateAccount(target);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
