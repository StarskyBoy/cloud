package com.midou.cloud.register.consumer.feign.hystrix.fallback.dao;

import com.midou.cloud.register.consumer.feign.hystrix.fallback.dao.fallback.FeignClientFallback;
import com.midou.cloud.register.consumer.feign.hystrix.fallback.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author midou
 * @description
 * @date 2018/9/3 22:03
 * @modified by
 */
@FeignClient(name = "cloud-register-user",fallback = FeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
