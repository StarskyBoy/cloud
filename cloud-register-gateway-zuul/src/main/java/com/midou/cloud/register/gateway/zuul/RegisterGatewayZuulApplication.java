package com.midou.cloud.register.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@SpringBootApplication
public class RegisterGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterGatewayZuulApplication.class, args);
	}
}
