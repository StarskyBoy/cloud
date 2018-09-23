package com.midou.cloud.register.consumer.feign.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegisterConsumerFeignLoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerFeignLoggerApplication.class, args);
    }
}
