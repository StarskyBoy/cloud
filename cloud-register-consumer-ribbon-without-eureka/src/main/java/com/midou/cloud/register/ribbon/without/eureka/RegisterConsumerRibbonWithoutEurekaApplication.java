package com.midou.cloud.register.ribbon.without.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RegisterConsumerRibbonWithoutEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterConsumerRibbonWithoutEurekaApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return  new RestTemplate();
    }
}
