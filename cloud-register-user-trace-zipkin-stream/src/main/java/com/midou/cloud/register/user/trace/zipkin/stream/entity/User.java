package com.midou.cloud.register.user.trace.zipkin.stream.entity;

import lombok.Data;

/**
 * @author midou
 * @description
 * @date 2018/9/9 11:48
 * @modified by
 */

@Data
public class User {

    private int id;

    private String userName;

    private String passWord;
}
