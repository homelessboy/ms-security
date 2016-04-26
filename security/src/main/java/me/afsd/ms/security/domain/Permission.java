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
@Table(name="sys_permission")
@DomainName("权限")
public class Permission extends BaseDomain<Long>{

    /**
     * 权限名称
     */
    @Column
    private String name;

    /**
     * 权限代码
     */
    @Column
    private String code;

    /**
     * 权限级别
     */
    @Column
    private Integer level;

    /**
     * 权限备注
     */
    @Column
    private String remark;

    /**
     * 权限管理的角色权限
     */
    @OneToMany(mappedBy = "permission",cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
