package cn.itcast.travel.test;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.dao.impl.FavoriteDaoImpl;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.User;

import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;
import org.junit.Test;

import java.util.List;

public class TravelTest {
//
//
//
//    @Test
//    public void testCheckByUsername(){
//        User user=new User();
//        user.setUsername("zhangsan");
//        user.setPassword("123");
//        user.setName("zhangsan");
//        UserDao userDao=new UserDaoImpl();
//        User u = userDao.checkByUsername(user.getUsername());
//        if (u!=null){
//            System.out.println("有");
//        }else{
//            System.out.println("空");
//        }
//    }
//    @Test
//    public void test(){
//        CategoryService categoryService=new CategoryServiceImpl();
//        List<Category> all = categoryService.findAll();
//        System.out.println("all = " + all);
//    }
    @Test
    public void test2(){
        RouteDao routeDao=new RouteDaoImpl();
        int totalCount = routeDao.findTotalCount(5,null);
        System.out.println("totalCount = " + totalCount);

    }
    @Test
    public void test3(){
        RouteDao routeDao=new RouteDaoImpl();
        List<Route> list = routeDao.findList(5, 2, 5,"");
        System.out.println("list = " + list);
    }
    @Test
    public void test4(){
        FavoriteDaoImpl favoriteDao=new FavoriteDaoImpl();
        favoriteDao.addFavorite(1,15);


    }
}
