package com.midou.cloud.register.user.with.auth.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author midou
 * @description
 * @date 2018/9/9 11:48
 * @modified by
 */

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;
}
