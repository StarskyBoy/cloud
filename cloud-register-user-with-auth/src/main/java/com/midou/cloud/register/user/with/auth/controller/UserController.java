package com.midou.cloud.register.user.with.auth.controller;

import com.midou.cloud.register.user.with.auth.entity.User;
import com.midou.cloud.register.user.with.auth.service.UserRepository;
import com.midou.cloud.register.user.with.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:21
 * @modified by
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority c : collection) {
                // 打印当前登录用户的信息
                logger.info("当前用户是{}，角色是{}", user.getUsername(), c.getAuthority());
            }
        } else {
            // do other things
        }
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
