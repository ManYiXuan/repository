package test;

import com.itheima.dao.RoleDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class RoleTest {
    RoleDao roleDao;
    InputStream is;
    SqlSession session;
    @Before
    public void initial() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        session = factory.openSession();
        roleDao= session.getMapper(RoleDao.class);
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
        List<Role> list = roleDao.findAll();
        for (Role role : list) {
            System.out.println("role = " + role);
            System.out.println(role.getUsers());
        }
    }

}
