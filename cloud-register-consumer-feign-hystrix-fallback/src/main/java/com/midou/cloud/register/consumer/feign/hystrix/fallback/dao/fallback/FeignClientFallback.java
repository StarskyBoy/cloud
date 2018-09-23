package com.midou.cloud.register.consumer.feign.hystrix.fallback.dao.fallback;

import com.midou.cloud.register.consumer.feign.hystrix.fallback.dao.UserFeignClient;
import com.midou.cloud.register.consumer.feign.hystrix.fallback.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author midou
 * @description
 * @date 2018/9/23 22:04
 * @modified by
 */
@Component
public class FeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id)
    {
        User user=new User();
        user.setId(-1L);
        user.setPassWord("123456");
        user.setUserName("default");
        return user;
    }
}
