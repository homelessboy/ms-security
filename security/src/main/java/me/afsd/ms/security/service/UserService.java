package me.afsd.ms.security.service;

import me.afsd.ms.security.dao.UserDao;
import me.afsd.ms.security.domain.MyUserDetail;
import me.afsd.ms.security.domain.User;
import me.afsd.service.base.BaseService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Service
public class UserService extends BaseService<User,Long> implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=  ((UserDao)dao).findByName(username).get(0);
        if(user==null)
            throw new UsernameNotFoundException("用户名不存在");
        return new MyUserDetail(user);
    }
}
