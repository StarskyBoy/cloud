package com.midou.cloud.register.user.with.auth.service.impl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author midou
 * @description
 * @date 2018/9/14 22:36
 * @modified by
 */
public class SecurityUser implements UserDetails {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private String role;

    public SecurityUser() {
    }

    public SecurityUser(String username, String password, String role) {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // 封装了权限信息
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(this.role);
        authorities.add(authority);
        return authorities;
    }

    // 帐户是否过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 帐户是否被冻结
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 帐户密码是否过期，一般有的密码要求性高的系统会使用到，比较每隔一段时间就要求用户重置密码
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 帐号是否可用
    @Override
    public boolean isEnabled() {
        return true;
    }

    // 密码信息
    @Override
    public String getPassword() {
        return this.password;
    }

    // 登录用户名
    @Override
    public String getUsername() {
        return this.username;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
