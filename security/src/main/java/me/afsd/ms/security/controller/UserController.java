package me.afsd.ms.security.controller;

import com.alibaba.fastjson.JSON;
import me.afsd.ms.security.dao.UserDao;
import me.afsd.ms.security.domain.User;
import me.afsd.site.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@RestController("user")
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userDao.findOne(id);
        return user;
    }
}
