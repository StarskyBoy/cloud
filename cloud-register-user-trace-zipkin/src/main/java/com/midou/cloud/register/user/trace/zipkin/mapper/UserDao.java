package com.midou.cloud.register.user.trace.zipkin.mapper;

import com.midou.cloud.register.user.trace.zipkin.entity.User;

/**
 * @author midou
 * @description
 * @date 2018/9/9 11:57
 * @modified by
 */
public interface UserDao {

    User findUserById(Long id);

    int insertUser(User user);
}
