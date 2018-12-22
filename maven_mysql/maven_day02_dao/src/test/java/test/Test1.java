package test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Item;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Item item = itemsDao.findById(1);
        System.out.println(item.getName());
    }

}
