package com.midou.cloud.register.user.trace.controller;

import com.midou.cloud.register.user.trace.entity.User;
import com.midou.cloud.register.user.trace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:21
 * @modified by
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id) {
        return this.userService.findUserById(id);
    }
}
