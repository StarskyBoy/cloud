package com.midou.cloud.register.consumer.feign.manual.entity;

import lombok.Data;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:28
 * @modified by
 */
@Data
public class User {

    private int id;

    private String username;

    private String password;
}
