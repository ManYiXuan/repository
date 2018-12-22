package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

import java.util.UUID;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public boolean register(User user) {
        User u = userDao.checkByUsername(user.getUsername());
        if(u!=null){
            return false;
        }
        String code = UuidUtil.getUuid();
        user.setCode(code);
        user.setStatus("N");
        userDao.saveUser(user);
        String content="<a href='http://localhost/travel/user/activeUser?code="+code+"'>黑马旅游网</a>";
        MailUtils.sendMail("man1271570334@163.com",content,"点击激活");
        return true;
    }

    @Override
    public boolean active(String code) {
        User user = userDao.checkByCode(code);
        if(user==null){
            return false;
        }else{
            user.setStatus("Y");
            userDao.saveStatus(user);
            return true;
        }

    }

    @Override
    public User findUser(User user) {
        return userDao.fingUser(user.getUsername(),user.getPassword());
    }
}
