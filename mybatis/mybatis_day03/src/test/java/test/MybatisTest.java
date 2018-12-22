package test;

import com.itheima.dao.UserDao;
import com.itheima.domain.QueryVo;
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
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    UserDao userDao;
    InputStream is;
    SqlSession session;
    @Before
    public void initial() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        session = factory.openSession();
        userDao= session.getMapper(UserDao.class);
    }
    @After
    public void end() throws IOException {
        session.close();
        is.close();
    }

    /**
     * 查询所有
     */
    @Test
    public void testFindAll(){
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    /**
     * 根据id查询
     */
    @Test
    public void testFindById(){
        User u=new User();
        u.setId(56);
        User user = userDao.findById(u);
        System.out.println(user);
    }
    /**
     * 根据名字查询
     */
    @Test
    public void testFindByName(){
        User u=new User();
        u.setUsername("老王");
        List<User> list = userDao.findByName(u);
        for (User user : list) {
            System.out.println(user);
        }
    }
    /**
     * 根据名字查询
     */
    @Test
    public void testFindByCondition(){
        QueryVo vo=new QueryVo();
        List<Integer> list=new ArrayList();
        list.add(41);
        list.add(42);
        list.add(43);
        vo.setList(list);
        List<User> userList = userDao.findByCondition(vo);
        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }
}
