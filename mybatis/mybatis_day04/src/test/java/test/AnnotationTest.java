package test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class AnnotationTest {

    InputStream is;
    SqlSession session;
    SqlSessionFactory factory;
    UserDao userDao;
    @Before
    public void initial() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        factory = builder.build(is);
        session = factory.openSession();
        userDao = session.getMapper(UserDao.class);
    }
    @After
    public void end() throws IOException {
        session.close();
        is.close();
    }
    /**
     * 模糊查询
     */
    @Test
    public void testFindByName(){
//        List<User> list = userDao.findByName("%王%");
        List<User> list = userDao.findByName("王");
        for (User user : list) {
            System.out.println("user = " + user);
        }
    }
    /**
     * 添加用户
     */
    @Test
    public void testAddUser(){
        User user=new User();
        user.setUsername("田七");
        user.setBirthday(new Date());
        user.setAddress("北京市海淀区");
        user.setSex("男");
        userDao.addUser(user);
        session.commit();
    }
    /**
     * 修改用户
     */
    @Test
    public void testUpdateUser(){
        User user=new User();
        user.setId(57);
        user.setUsername("tianqi");
        user.setBirthday(new Date());
        user.setAddress("北京市");
        user.setSex("女");
        userDao.updateUser(user);
        session.commit();
    }
    /**
     * 删除用户
     */
    @Test
    public void testDeleteUser(){
        userDao.deleteUser(57);
        session.commit();
    }
    /**
     * 查询所有
     */
    @Test
    public void testFindAllUser(){
        List<User> list = userDao.findAllUser();
        for (User user : list) {
            System.out.println("user = " + user);
            System.out.println(user.getAccounts());
        }
    }
    /**
     * 查询所有
     */
    @Test
    public void testFindAllAccount(){
        AccountDao accountDao = session.getMapper(AccountDao.class);
        List<Account> list = accountDao.findAllAccount();
        for (Account account : list) {
            System.out.println("account = " + account);
            System.out.println(account.getUser());
        }
    }

}
