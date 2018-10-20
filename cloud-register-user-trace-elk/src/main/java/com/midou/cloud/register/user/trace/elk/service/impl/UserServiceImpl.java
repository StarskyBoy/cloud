package com.midou.cloud.register.user.trace.elk.service.impl;

import com.midou.cloud.register.user.trace.elk.entity.User;
import com.midou.cloud.register.user.trace.elk.mapper.UserDao;
import com.midou.cloud.register.user.trace.elk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:14
 * @modified by
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
