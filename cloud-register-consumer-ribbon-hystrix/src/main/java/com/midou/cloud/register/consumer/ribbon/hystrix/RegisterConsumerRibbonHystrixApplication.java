package com.midou.cloud.register.consumer.ribbon.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class RegisterConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerRibbonHystrixApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
