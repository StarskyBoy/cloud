package com.midou.cloud.register.consumer.feign.logger.entity;

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

    private String userName;

    private String passWord;
}
