package com.midou.cloud.register.consumer.feign.hystrix.fallback.Controller;

import com.midou.cloud.register.consumer.feign.hystrix.fallback.dao.UserFeignClient;
import com.midou.cloud.register.consumer.feign.hystrix.fallback.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:32
 * @modified by
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}
