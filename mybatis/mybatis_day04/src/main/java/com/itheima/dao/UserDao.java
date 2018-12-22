package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserDao {
//    public List<User> findAll();
//    public User findById(int id);
//    public List<User> findByName(User user);
    /**
     * 查询所有用户,并且查询用户的账户信息
     */
    @Select("select * from user")
    @Results(id = "userMap" ,
            value={
                    @Result(id = true,property = "id",column = "id"),
                    @Result(property = "username",column = "username"),
                    @Result(property = "address",column = "address"),
                    @Result(property = "sex",column = "sex"),
                    @Result(property = "birthday",column = "birthday"),
                    @Result(property = "accounts",column = "id" ,many=@Many(select = "com.itheima.dao.AccountDao.findById",fetchType = FetchType.DEFAULT))
            })
    public List<User> findAllUser();
    /**
     * 模糊查询
     */
//    @Select("select * from user where username like #{username}")
    @Select("select * from user where username like '%${value}%'")
    public List<User> findByName(String username);

    /**
     * 添加用户
     */
    @Insert("insert into user(username,address,sex,birthday) values(#{username},#{address},#{sex},#{birthday})")
    public void addUser(User user);
    /**
     * 修改用户
     */
    @Update("update user set username=#{username},address=#{address},sex=#{sex} where id=#{id}")
    public void updateUser(User user);
    /**
     * 删除用户
     */
    @Delete("delete from user where id=#{id}")
    public void deleteUser(Integer id);
    /**
     * 根据uid查询用户
     */
    @Select("select * from user where id=#{uid}")
    public User findByUid(Integer uid);
}
