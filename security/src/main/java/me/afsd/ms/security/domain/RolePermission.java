package me.afsd.ms.security.domain;

import me.afsd.domain.base.BaseDomain;
import me.afsd.domain.base.StringRemarkEnmu;

import javax.persistence.*;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Entity
@Table(name = "sys_role_permission")
public class RolePermission extends BaseDomain<Long> {

    /**
     * 角色权限关联的——角色
     */
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    /**
     * 角色权限关联的——模块
     */
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "module_id", nullable = false)
    private Module module;

    /**
     * 角色权限关联的——权限
     */
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "permission_id", nullable = false)
    private Permission permission;

    /**
     * 角色权限的代码——module。code+":"+permission.code
     */
    @Transient
    private String code;

    private Status status = Status.activity;

    enum Status implements StringRemarkEnmu {
        activity("启用"), forbidden("禁用");

        private String remark;

        Status(String remark) {
            this.remark = remark;
        }

        @Override
        public String getRemark() {
            return remark;
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getCode() {
        this.code=module.getCode()+":"+permission.getCode();
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
