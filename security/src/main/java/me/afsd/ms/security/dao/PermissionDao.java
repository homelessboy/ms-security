package me.afsd.ms.security.dao;

import me.afsd.dao.base.BaseNameResitory;
import me.afsd.ms.security.domain.Permission;
import org.springframework.stereotype.Repository;

/**
 * 权限Dao
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface PermissionDao extends BaseNameResitory<Permission,Long>{
}
