package com.midou.cloud.register.consumer.feign.hystrix.fallback.factory.entity;

import lombok.Data;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:28
 * @modified by
 */
@Data
public class User {

    private Long id;

    private String userName;

    private String passWord;
}
