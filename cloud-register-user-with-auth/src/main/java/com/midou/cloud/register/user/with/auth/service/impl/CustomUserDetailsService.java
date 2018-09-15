package com.midou.cloud.register.user.with.auth.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author midou
 * @description
 * @date 2018/9/14 22:34
 * @modified by
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {

    /**
     * 模拟两个账户：
     * ① 账号是user，密码是user，角色是user-role
     * ② 账号是admin，密码是admin，角色是admin-role
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new SecurityUser("user", "user", "user-role");
        } else if ("admin".equals(username)) {
            return new SecurityUser("admin", "admin", "admin-role");
        } else {
           return null;
        }
    }
}
