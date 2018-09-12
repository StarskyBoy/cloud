package com.midou.cloud.register.consumer.feign.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegisterConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerFeignApplication.class, args);
    }
}
