package com.midou.cloud.register.consumer.feign.hystrix.fallback.factory.dao.fallback;

import com.midou.cloud.register.consumer.feign.hystrix.fallback.factory.dao.UserFeignClient;
import com.midou.cloud.register.consumer.feign.hystrix.fallback.factory.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author midou
 * @description
 * @date 2018/9/24 21:30
 * @modified by
 */
@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient>{

    private static final Logger logger= LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable cause) {
        return new UserFeignClient() {

            // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
            // 否则在引用启动时，就会打印该日志。
            // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
            @Override
            public User findById(Long id) {
                logger.info("fallback reason was:", cause);
                User user = new User();
                user.setId(-1L);
                user.setUserName("default");
                return user;
            }
        };
    }
}
