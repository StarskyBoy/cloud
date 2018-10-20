package com.midou.cloud.register.user.trace.zipkin.stream.mapper;

import com.midou.cloud.register.user.trace.zipkin.stream.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author midou
 * @description
 * @date 2018/9/9 11:59
 * @modified by
 */
@Repository
public class UserDaoImpl implements UserDao {

    /**
     * 通过@Resource注解引入JdbcTemplate对象。
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findUserById(Long id) {

        // 1. 定义一个sql语句
        String querySQL = "select * from user where id = ?";

        // 2. 定义一个RowMapper
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        // 3. 执行查询方法

        //List<User> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));

        User user = jdbcTemplate.queryForObject(querySQL, new Object[]{id}, rowMapper);

        return user;
    }

    @Override
    public int insertUser(User user) {
        // 1. 定义一个sql语句
        String execSQL = "INSERT into user (username, password) values (?, ?, ?, ?)";

        // 2. 执行查询方法
        int result = jdbcTemplate.update(execSQL,
                new Object[]{user.getUserName(),user.getPassWord()});

        return result;
    }
}
