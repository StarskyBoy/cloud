package com.midou.cloud.register.consumer.feign.custom.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @author midou
 * @description
 * @date 2018/9/10 23:05
 * @modified by
 */
public class FeignConfiguration {

    @Bean
    public Contract feignContract()
    {
       return new feign.Contract.Default();
    }
}
