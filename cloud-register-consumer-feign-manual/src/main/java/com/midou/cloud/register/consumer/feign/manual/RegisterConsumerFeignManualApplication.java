package com.midou.cloud.register.consumer.feign.manual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
public class RegisterConsumerFeignManualApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerFeignManualApplication.class, args);
    }
}
