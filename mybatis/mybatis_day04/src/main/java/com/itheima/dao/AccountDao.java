package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface AccountDao {
//    public List<Account> findAll();
//    public List<Account> findByUid(int uid);
//    public Account findById(Integer id);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 根据id查询
     */
    @Select("select * from account where uid=#{id}")
    public Account findById(Integer id);
    /**
     * 查询所有,并显示用户名信息
     */
    @Select("select * from account")
    @Results(id="accountMap",value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "uid",column = "uid"),
            @Result(property = "money",column = "money"),
            @Result(property = "user",column = "uid",one=@One(select = "com.itheima.dao.UserDao.findByUid",fetchType = FetchType.EAGER))
    })
    public List<Account> findAllAccount();

}
