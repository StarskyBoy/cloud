package com.midou.cloud.register.user.service;

import com.midou.cloud.register.user.entity.User;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:13
 * @modified by
 */
public interface UserService {

    User findUserById(Long id);
    int insertUser(User user);
}
