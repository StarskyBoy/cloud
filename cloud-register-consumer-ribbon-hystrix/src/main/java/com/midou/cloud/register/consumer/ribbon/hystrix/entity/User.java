package com.midou.cloud.register.consumer.ribbon.hystrix.entity;

import lombok.Data;

/**
 * @author midou
 * @description
 * @date 2018/9/9 11:48
 * @modified by
 */

@Data
public class User {

    private Long id;

    private String userName;

    private String passWord;
}
