package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    public User checkByUsername(String username);
    public void saveUser(User user);
    public User checkByCode(String code);
    public void saveStatus(User user);
    public User fingUser(String username,String password);
}
