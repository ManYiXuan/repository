package test1;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Item;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Item item = itemsService.findById(1);
        System.out.println(item.getName());
    }

    public static void main(String[] args) {
        System.out.println("hello git");
    }
}
