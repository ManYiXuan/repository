package test;

import com.itheima.domain.Account;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test(){
//        Account account=new Account();
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
////        AccountDaoImpl accountDao = ac.getBean("accountDao", AccountDaoImpl.class);
////        System.out.println(accountDao);
//       // accountDao.getName();
//        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
//        accountService.saveAccount(account);
        String string = ac.getBean("string", String.class);
    }
}
