package test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountTest {
    @Autowired
    private AccountService accountService;
    /**
     * 查询所有
     */
    @Test
    public void testFindAll(){
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//
////        ApplicationContext ac=new ClassPathXmlApplicationContext("factory.xml");
//        AccountService accountService = ac.getBean("accountService", AccountService.class);
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println("account = " + account);
        }
    }
    /**
     * 查询所有
     */
    @Test
    public void testAddAccount(){
        Account account=new Account();
        account.setName("张三");
        account.setMoney(123456f);
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//      //  ApplicationContext ac=new ClassPathXmlApplicationContext("factory.xml");
//        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.addAccount(account);
    }
}
