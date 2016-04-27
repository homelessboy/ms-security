package me.afsd.ms.security.dao;

import me.afsd.dao.base.BaseNameRepository;
import me.afsd.ms.security.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Repository
public interface UserDao extends BaseNameRepository<User,Long>{
}
