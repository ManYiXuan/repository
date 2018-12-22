package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public User findById(User user);
    public List<User> findByName(User user);
}
