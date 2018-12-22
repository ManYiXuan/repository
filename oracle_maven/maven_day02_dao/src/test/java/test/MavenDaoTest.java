//package test;
//
//import com.itheima.dao.ItemsDao;
//import com.itheima.domain.Items;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MavenDaoTest {
//
//
//    @Test
//    public void test(){
//        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
//        Items item = itemsDao.findById(1);
//        System.out.println(item.getName());
//    }
//
//
//
//}
