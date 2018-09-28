package com.midou.cloud.register.consumer.ribbon.hystrix.turbine.mq;

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
public class RegisterConsumerRibbonHystrixTurbineMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerRibbonHystrixTurbineMqApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
