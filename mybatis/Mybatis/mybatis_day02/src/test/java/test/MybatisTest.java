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
import java.util.Date;
import java.util.List;

public class MybatisTest {

    InputStream is;
    SqlSession session;
    UserDao userDao;
    @Before
    public void init() throws Exception{
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        session = factory.openSession();
        userDao = session.getMapper(UserDao.class);
    }
    @After
    public void destory() throws IOException {
        session.close();
        is.close();
    }

    /**
     * 查询所有
     */
    @Test
    public void testFindAll() {


        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    /**
     * 查询一个
     */
    @Test
    public void testFindOne() {


        User user = userDao.findOne(56);
        System.out.println("user = " + user);

    }
    /**
     * 模糊查询
     */
    @Test
    public void testFindByName() {

//        List<User> list = userDao.findByName("%王%");
        List<User> list = userDao.findByName("王");
        for (User user : list) {
            System.out.println(user);
        }
    }
    /**
     * 添加
     */
//    @Test
//    public void testAddUser() {
//        User user=new User();
//        user.setUsername("张三");
//        user.setAddress("山东省济南市");
//        user.setSex("男");
//        user.setBirthday(new Date());
//        userDao.addUser(user);
//        session.commit();
//    }
    /**
     * 更新
     */
//    @Test
//    public void testUpdateUser() {
//        User user=new User();
//        user.setId(52);
//        user.setUsername("lisi");
//        user.setAddress("山东省济南市");
//        user.setSex("女");
//        user.setBirthday(new Date());
//        userDao.updateUser(user);
//        session.commit();
//    }
//    /**
//     * 删除
//     */
//    @Test
//    public void testDeleteUser() {
//        userDao.deleteUser(50);
//        session.commit();
//    }
//    /**
//     * 添加
//     */
//    @Test
//    public void testAddUser2() {
//        User user=new User();
//        user.setUsername("zhangsna");
//        user.setAddress("山东省济南市长清区");
//        user.setSex("女");
//        user.setBirthday(new Date());
//        System.out.println("user = " + user);
//        userDao.addUser(user);
//        System.out.println("user = " + user);
//        session.commit();
//    }
//    /**
//     * 添加实体类封装对象
//     */
//    @Test
//    public void testAddUser3() {
//        User user=new User();
//        user.setUsername("赵六");
//        user.setAddress("山东省济南市");
//        user.setSex("男");
//        user.setBirthday(new Date());
//        QueryVo vo=new QueryVo();
//        vo.setUser(user);
//        userDao.saveUser(vo);
//        session.commit();
//    }

}
