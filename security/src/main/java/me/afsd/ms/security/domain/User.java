package me.afsd.ms.security.domain;

import me.afsd.domain.base.BaseDomain;
import me.afsd.domain.base.DomainName;

import javax.persistence.*;

/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Entity
@Table(name = "sys_user")
@DomainName("用户")
public class User extends BaseDomain<Long>{
    @Column
    private String name;

    @Column
    private String account;

    @Column
    private String password;

    @Column
    private String salt;

    @Column
    private String email;

    @Column
    private String tel;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = true)
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
