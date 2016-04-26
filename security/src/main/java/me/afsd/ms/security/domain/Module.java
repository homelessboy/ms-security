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
@Table(name = "sys_module")
@DomainName("模块")
public class Module extends BaseDomain<Long> {

    /**
     * 模块名称
     */
    @Column
    private String name;

    /**
     * 模块代码
     */
    @Column
    private String code;

    /**
     * 模块访问路径
     */
    @Column
    private String domain;

    /**
     * 模块备注
     */
    @Column
    private String remark;

    /**
     * 模块关联的角色权限
     */
    @OneToMany(mappedBy = "module",cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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
