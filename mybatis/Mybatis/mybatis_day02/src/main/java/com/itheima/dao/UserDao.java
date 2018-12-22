package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void addUser(User user);
    User findOne(int id);
    List<User> findByName(String name);
    void updateUser(User user);
    void deleteUser(int id);
    void saveUser(QueryVo vo);
}
