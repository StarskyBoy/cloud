package com.midou.cloud.register.user.with.auth.service;

import com.midou.cloud.register.user.with.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author midou
 * @description
 * @date 2018/9/14 22:42
 * @modified by
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

