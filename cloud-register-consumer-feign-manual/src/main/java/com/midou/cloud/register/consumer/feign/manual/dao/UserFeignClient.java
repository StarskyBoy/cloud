package com.midou.cloud.register.consumer.feign.manual.dao;

import com.midou.cloud.register.consumer.feign.manual.entity.User;
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
public interface UserFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
