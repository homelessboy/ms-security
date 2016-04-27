package me.afsd.ms.security.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

import static java.util.stream.Collectors.toList;

/**
 * @author XuHui (416422546@qq.com)
 */
public class MyUserDetail implements UserDetails {
    private User user;

    public MyUserDetail(User user){
        this.user=user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ADMIN"),new SimpleGrantedAuthority("USER"));
//        return user.getRole().getRolePermissions().stream()
//                .filter(tmp->tmp.getStatus().equals(RolePermission.Status.activity))
//                .map(tmp->
//                    new SimpleGrantedAuthority(tmp.getCode())
//                ).collect(toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getAccount();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
