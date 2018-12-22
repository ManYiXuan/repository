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
import java.util.List;

public class AccountTest {
    AccountDao accountDao;
    InputStream is;
    SqlSession session;
    @Before
    public void initial() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        session = factory.openSession();
        accountDao = session.getMapper(AccountDao.class);
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
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println("account = " + account);
        }
    }
    /**
     * 查询所有
     */
    @Test
    public void testFindAll2(){
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println("account = " + account);
            System.out.println(account.getUser());
        }
    }


}
