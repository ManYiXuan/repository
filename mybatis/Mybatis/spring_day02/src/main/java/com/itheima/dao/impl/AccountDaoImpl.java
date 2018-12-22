package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Queue;
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    @Qualifier("runner")
    private QueryRunner runner;

//    public void setRunner(QueryRunner runner) {
//        this.runner = runner;
//    }

    //查询所有
    public List<Account> findAll() {
        System.out.println("runner = " + runner);
        try {
            List<Account> list = runner.query("select * from account", new BeanListHandler<Account>(Account.class));
            System.out.println("list = " + list);
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //根据id查询账户
    public Account findById(Integer id) {
        try {
            return runner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //添加账户
    public void addAccount(Account account) {
        try {
            runner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //修改账户
    public void updateAccount(Account account) {
        try {
            runner.update("update account set name=?,money=?",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //删除账户
    public void deleteAccount(Integer id) {
        try {
            runner.update("delete from account where id=?",id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
