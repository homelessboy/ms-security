package me.afsd.ms.security.dao;

import me.afsd.dao.base.BaseNameRepository;
import me.afsd.ms.security.domain.Permission;
import org.springframework.stereotype.Repository;

/**
 * 权限Dao
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Repository
public interface PermissionDao extends BaseNameRepository<Permission,Long> {
}
