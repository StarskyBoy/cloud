package com.midou.cloud.register.user.trace.zipkin.stream.mapper;

import com.midou.cloud.register.user.trace.zipkin.stream.entity.User;

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
