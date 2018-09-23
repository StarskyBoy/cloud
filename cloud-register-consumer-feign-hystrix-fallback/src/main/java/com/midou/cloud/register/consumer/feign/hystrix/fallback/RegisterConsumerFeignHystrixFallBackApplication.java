package com.midou.cloud.register.consumer.feign.hystrix.fallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegisterConsumerFeignHystrixFallBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerFeignHystrixFallBackApplication.class, args);
    }
}
