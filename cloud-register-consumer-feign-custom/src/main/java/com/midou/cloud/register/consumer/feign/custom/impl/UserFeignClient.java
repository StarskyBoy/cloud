package com.midou.cloud.register.consumer.feign.custom.impl;

import com.midou.cloud.register.consumer.feign.custom.config.FeignConfiguration;
import com.midou.cloud.register.consumer.feign.custom.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author midou
 * @description
 * @date 2018/9/3 22:03
 * @modified by
 */
@FeignClient(name = "cloud-register-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
