package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate template;


    @Override
    public Account findById(Integer id) {

        return template.queryForObject("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),id);
    }

    @Override
    public Account findByName(String name) {
        try {
            return template.queryForObject("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),name);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateAccount(Account account) {
        template.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
