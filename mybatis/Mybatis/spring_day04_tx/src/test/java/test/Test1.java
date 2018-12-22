package test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class Test1 {
    @Autowired
    private AccountService accountService;

    @Test
    public void test2(){
        accountService.transfer("aaa","bbb",100f);
    }

    @Test
    public void test(){
        Account account = accountService.findById(1);
        System.out.println("account = " + account);
    }
}
