package me.afsd.ms.security.domain;

import me.afsd.domain.base.BaseDomain;
import me.afsd.domain.base.DomainName;

import javax.persistence.*;
import java.util.List;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Entity
@Table(name = "sys_role")
@DomainName("角色")
public class Role extends BaseDomain<Long>{

    /**
     * 角色名称
     */
    @Column
    private String name;

    /**
     * 角色代码
     */
    @Column
    private String code;

    /**
     * 角色备注
     */
    @Column
    private String remark;

    /**
     * 角色关联的角色权限
     */
    @OneToMany(mappedBy = "role",cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
    private List<RolePermission> rolePermissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<RolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }
}
