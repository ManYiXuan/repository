package com.itheima;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;


@Controller
@RequestMapping("/user")
public class UserTest implements Serializable {

    @RequestMapping("/testString")
    public String testString(String username,User user){
        System.out.println("testString方法执行了...");
        System.out.println(username);
        System.out.println(user);
//        return "success";
        //转发
//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/void.jsp";
    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了...");
        //请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/void.jsp");
//        response.setContentType("text/html;charset=utf-8");
//        request.setCharacterEncoding("utf-8");
//        response.getWriter().print("void");
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView方法执行了...");
        User user=new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        user.setAge(18);
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
//
//    @RequestMapping("/testAjax")
//    public @ResponseBody User testAjax(@RequestBody User user){
//        System.out.println("testAjax方法执行了...");
//        System.out.println("user = " + user);
//        user.setUsername("wangwu");
//        return user;
//    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(){
        System.out.println("testAjax方法执行了...");
        return "success";
    }

    @RequestMapping("/testException")
    public String testException(){
        System.out.println("testException方法执行了...");
        int i=10/0;
        return "success";
    }

}
