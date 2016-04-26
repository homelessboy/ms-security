package me.afsd.ms.security.dao;

import me.afsd.dao.base.BaseNameRepository;
import me.afsd.ms.security.domain.Role;
import org.springframework.stereotype.Repository;

/**
 * 角色Dao
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Repository
public interface RoleDao extends BaseNameRepository<Role,Long> {
}
